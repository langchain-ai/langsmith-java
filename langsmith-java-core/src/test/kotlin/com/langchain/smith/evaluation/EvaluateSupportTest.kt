package com.langchain.smith.evaluation

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.models.info.InfoListResponse
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunIngest
import com.langchain.smith.models.runs.RunQueryParams
import com.langchain.smith.models.runs.RunQueryV2Page
import com.langchain.smith.models.runs.RunQueryV2PageResponse
import com.langchain.smith.models.runs.RunQueryV2Params
import com.langchain.smith.models.sessions.TracerSession
import com.langchain.smith.services.blocking.FeedbackService
import com.langchain.smith.services.blocking.InfoService
import com.langchain.smith.services.blocking.RunService
import com.langchain.smith.services.supportsSmithDbQuery
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.kotlin.any
import org.mockito.kotlin.argumentCaptor
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import org.mockito.kotlin.never
import org.mockito.kotlin.times
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever

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

    @Test
    fun loadRunsForExperiment_usesV2QueryBoundedToTheExperimentWhenSmithDbIsEnabled() {
        val experimentStart = OffsetDateTime.parse("2026-01-02T03:04:05Z")
        val experimentEnd = OffsetDateTime.parse("2026-01-02T04:00:00Z")
        val runService = mock<RunService>()
        whenever(runService.queryV2(any<RunQueryV2Params>())).thenAnswer { invocation ->
            RunQueryV2Page.builder()
                .service(runService)
                .params(invocation.getArgument(0))
                .response(
                    RunQueryV2PageResponse.builder()
                        .addItem(
                            Run.builder()
                                .id(runIdA)
                                .projectId(sessionIdA)
                                .traceId(runIdA)
                                .referenceExampleId(runIdB)
                                .startTime(experimentStart)
                                .build()
                        )
                        .build()
                )
                .build()
        }
        val infoService = infoService(sdbQueryEnabled = true)
        val v2Client =
            mock<LangsmithClient> {
                on { info() } doReturn infoService
                on { runs() } doReturn runService
            }
        val experiment =
            TracerSession.builder()
                .id(sessionIdA)
                .tenantId(sessionIdB)
                .startTime(experimentStart)
                .endTime(experimentEnd)
                .build()

        val runs = loadRunsForExperiment(v2Client, experiment, loadNested = false)

        val captor = argumentCaptor<RunQueryV2Params>()
        verify(runService).queryV2(captor.capture())
        verify(runService, never()).query(any<RunQueryParams>())
        assertThat(captor.firstValue.projectIds()).contains(listOf(sessionIdA))
        assertThat(captor.firstValue.minStartTime()).contains(experimentStart)
        assertThat(captor.firstValue.maxStartTime()).contains(experimentEnd)
        assertThat(captor.firstValue.isRoot()).contains(true)
        assertThat(runs).hasSize(1)
        assertThat(runs.single().id()).contains(runIdA)
        assertThat(runs.single().sessionId()).contains(sessionIdA)
        assertThat(runs.single().referenceExampleId()).contains(runIdB)
    }

    @Test
    fun supportsSmithDbQuery_isFalseWithoutTheFlag() {
        assertThat(supportsSmithDbQuery(infoService(sdbQueryEnabled = null).list())).isFalse()
    }

    private fun infoService(sdbQueryEnabled: Boolean?): InfoService {
        val flags = InfoListResponse.InstanceFlags.builder()
        sdbQueryEnabled?.let {
            flags.putAdditionalProperty("sdb_query_enabled", JsonValue.from(it))
        }
        val info = InfoListResponse.builder().instanceFlags(flags.build()).build()
        return mock<InfoService> { on { list() } doReturn info }
    }

    private fun run(runId: String, sessionId: String): RunIngest =
        RunIngest.builder().id(runId).sessionId(sessionId).build()
}
