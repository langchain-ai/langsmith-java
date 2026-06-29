package com.langchain.smith.evaluation

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunUpdateParams
import com.langchain.smith.models.sessions.SessionCreateParams
import com.langchain.smith.models.sessions.TracerSessionWithoutVirtualFields
import com.langchain.smith.services.blocking.FeedbackService
import com.langchain.smith.services.blocking.RunService
import com.langchain.smith.services.blocking.SessionService
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.kotlin.any
import org.mockito.kotlin.argumentCaptor
import org.mockito.kotlin.doAnswer
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever

internal class EvaluateRunnerTest {

    private val exampleId = "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
    private val datasetId = "12345678-1234-1234-1234-123456789012"
    private val sessionId = "abcdefab-abcd-abcd-abcd-abcdefabcdef"

    @Test
    fun evaluate_runsTargetScoresExamplesAndPostsFeedback() {
        val runService = mock<RunService>()
        val sessionService = mock<SessionService>()
        val feedbackService = mock<FeedbackService>()

        whenever(sessionService.create(any<SessionCreateParams>())).doReturn(sampleSession())
        whenever(feedbackService.create(any<FeedbackCreateSchema>())).doReturn(sampleFeedback())
        whenever(runService.create(any<Run>())).doAnswer {}
        whenever(runService.update(any<RunUpdateParams>())).doAnswer {}

        val client =
            mock<LangsmithClient> {
                on { runs() } doReturn runService
                on { sessions() } doReturn sessionService
                on { feedback() } doReturn feedbackService
            }

        val params =
            EvaluateParams.builder()
                .data(listOf(sampleExample()))
                .addEvaluator(
                    runEvaluator { outputs: Map<String, Any?>, referenceOutputs: Map<String, Any?>
                        ->
                        EvaluationResult(
                            key = "match",
                            score = if (outputs["answer"] == referenceOutputs["answer"]) 1 else 0,
                        )
                    }
                )
                .experimentName("test-experiment")
                .build()

        val results = evaluate(client, { mapOf("answer" to "Paris") }, params)

        assertThat(results.experimentName).isEqualTo("test-experiment")
        assertThat(results.experimentId).isEqualTo(sessionId)
        assertThat(results.datasetId).isEqualTo(datasetId)
        assertThat(results.rows).hasSize(1)

        val row = results.rows.single()
        assertThat(row.example.id()).isEqualTo(exampleId)
        assertThat(row.run.referenceExampleId()).contains(exampleId)
        assertThat(row.run.sessionId()).contains(sessionId)
        assertThat(row.evaluationResults.results.single().key).isEqualTo("match")
        assertThat(row.evaluationResults.results.single().score).isEqualTo(1)

        verify(sessionService).create(any<SessionCreateParams>())
        val feedbackCaptor = argumentCaptor<FeedbackCreateSchema>()
        verify(feedbackService).create(feedbackCaptor.capture())
        assertThat(feedbackCaptor.firstValue.key()).isEqualTo("match")
        assertThat(feedbackCaptor.firstValue.score()).isPresent
    }

    private fun sampleExample(): Example =
        Example.builder()
            .id(exampleId)
            .datasetId(datasetId)
            .name("test-example")
            .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
            .inputs(
                Example.Inputs.builder()
                    .putAdditionalProperty("question", JsonValue.from("capital?"))
                    .build()
            )
            .outputs(
                Example.Outputs.builder()
                    .putAdditionalProperty("answer", JsonValue.from("Paris"))
                    .build()
            )
            .build()

    private fun sampleSession(): TracerSessionWithoutVirtualFields =
        TracerSessionWithoutVirtualFields.builder()
            .id(sessionId)
            .tenantId("tenant-id")
            .name("test-experiment")
            .build()

    private fun sampleFeedback(): FeedbackSchema =
        FeedbackSchema.builder().id("feedback-id").key("match").build()
}
