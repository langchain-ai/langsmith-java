package com.langchain.smith.evaluation

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.models.runs.RunIngest
import com.langchain.smith.services.blocking.FeedbackService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.kotlin.any
import org.mockito.kotlin.argumentCaptor
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify

internal class EvaluateSupportTest {

    private val runIdA = "11111111-1111-1111-1111-111111111111"
    private val runIdB = "22222222-2222-2222-2222-222222222222"
    private val sessionIdA = "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa"
    private val sessionIdB = "bbbbbbbb-bbbb-bbbb-bbbb-bbbbbbbbbbbb"
    private val comparativeExperimentId = "33333333-3333-3333-3333-333333333333"
    private val feedbackGroupId = "44444444-4444-4444-4444-444444444444"

    // JUnit 5 builds a fresh instance per test method, so these are per-test mocks.
    private val feedbackService =
        mock<FeedbackService> {
            on { create(any<FeedbackCreateSchema>()) } doReturn
                FeedbackSchema.builder().id("feedback-id").key("preference").build()
        }
    private val client = mock<LangsmithClient> { on { feedback() } doReturn feedbackService }

    @Test
    fun comparativeFeedback_postsSessionIdForEachComparedRun() {
        logComparativeEvaluationFeedback(
            client,
            ComparisonEvaluationResult(
                key = "preference",
                scores = mapOf(runIdA to 1, runIdB to 0),
                comment = "A is better",
            ),
            listOf(run(runIdA, sessionIdA), run(runIdB, sessionIdB)),
            comparativeExperimentId,
            feedbackGroupId,
        )

        val captor = argumentCaptor<FeedbackCreateSchema>()
        verify(feedbackService, times(2)).create(captor.capture())
        assertThat(captor.firstValue.runId()).contains(runIdA)
        assertThat(captor.firstValue.sessionId()).contains(sessionIdA)
        assertThat(captor.secondValue.runId()).contains(runIdB)
        assertThat(captor.secondValue.sessionId()).contains(sessionIdB)
    }

    @Test
    fun comparativeFeedback_skipsRunsNotBeingCompared() {
        logComparativeEvaluationFeedback(
            client,
            ComparisonEvaluationResult(
                key = "preference",
                // A run the evaluator was never given — a nested run, or an id an LLM judge
                // invented. It has no session, so it must not be posted.
                scores = mapOf(runIdA to 1, "99999999-9999-9999-9999-999999999999" to 0),
            ),
            listOf(run(runIdA, sessionIdA)),
            comparativeExperimentId,
            feedbackGroupId,
        )

        val captor = argumentCaptor<FeedbackCreateSchema>()
        verify(feedbackService, times(1)).create(captor.capture())
        assertThat(captor.firstValue.runId()).contains(runIdA)
        assertThat(captor.firstValue.sessionId()).contains(sessionIdA)
    }

    private fun run(runId: String, sessionId: String): RunIngest =
        RunIngest.builder().id(runId).sessionId(sessionId).build()
}
