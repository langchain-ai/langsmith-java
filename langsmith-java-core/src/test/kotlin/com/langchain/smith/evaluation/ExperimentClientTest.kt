package com.langchain.smith.evaluation

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.Dataset
import com.langchain.smith.models.datasets.DatasetListPage
import com.langchain.smith.models.datasets.DatasetListParams
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.examples.ExampleListPage
import com.langchain.smith.models.examples.ExampleListParams
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.models.runs.RunIngestBatchResponse
import com.langchain.smith.models.sessions.SessionCreateParams
import com.langchain.smith.models.sessions.SessionUpdateParams
import com.langchain.smith.models.sessions.TracerSessionWithoutVirtualFields
import com.langchain.smith.services.blocking.DatasetService
import com.langchain.smith.services.blocking.ExampleService
import com.langchain.smith.services.blocking.FeedbackService
import com.langchain.smith.services.blocking.RunService
import com.langchain.smith.services.blocking.SessionService
import java.util.UUID
import java.util.concurrent.ConcurrentLinkedQueue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import org.mockito.kotlin.any
import org.mockito.kotlin.argumentCaptor
import org.mockito.kotlin.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever

internal class ExperimentClientTest {

    private val client: LangsmithClient = mock()
    private val datasetService: DatasetService = mock()
    private val exampleService: ExampleService = mock()
    private val sessionService: SessionService = mock()
    private val runService: RunService = mock()
    private val feedbackService: FeedbackService = mock()

    @Test
    fun evaluateWithExplicitExamplesCreatesSessionRunsAndFeedback() {
        val examples = listOf(example(id = "ex-1", question = "2 + 2?", answer = "4"))
        val subject = setupSubject()

        val results =
            subject.evaluate(
                EvaluateParams.builder()
                    .examples(examples)
                    .experimentName("experiment-name")
                    .putMetadata("revision_id", "abc123")
                    .addTag("unit-test")
                    .target { mapOf("answer" to "4") }
                    .addEvaluator { run, example ->
                        EvaluationResult.builder()
                            .key("exact_match")
                            .score(run.outputs()["answer"] == example.outputs()["answer"])
                            .comment("matched")
                            .build()
                    }
                    .build()
            )

        assertThat(results.experimentName()).contains("experiment-name")
        assertThat(results.rows()).hasSize(1)
        assertThat(results.feedback()).hasSize(1)
        assertThat(results.rows()[0].evaluationResults().map { it.key() })
            .containsExactly("exact_match")

        val sessionCaptor = argumentCaptor<SessionCreateParams>()
        verify(sessionService).create(sessionCaptor.capture())
        assertThat(sessionCaptor.firstValue.name()).contains("experiment-name")
        assertThat(sessionCaptor.firstValue.referenceDatasetId()).contains("dataset-id")
        assertThat(sessionMetadata(sessionCaptor.firstValue))
            .containsEntry("__ls_runner", "java_sdk_evaluate")
            .containsEntry("revision_id", "abc123")

        val batchCaptor = argumentCaptor<RunIngestBatchParams>()
        verify(runService).ingestBatch(batchCaptor.capture())
        val run = requireNotNull(batchCaptor.firstValue.post().getOrNull()).single()
        assertThat(run.referenceExampleId()).contains("ex-1")
        assertThat(run.sessionId()).contains("session-id")
        assertThat(run.tags()).contains(listOf("unit-test"))
        assertThat(
                requireNotNull(run.outputs().getOrNull())
                    ._additionalProperties()["answer"]
                    ?.toPlainValue()
            )
            .isEqualTo("4")

        val feedbackCaptor = argumentCaptor<FeedbackCreateSchema>()
        verify(feedbackService).create(feedbackCaptor.capture())
        assertThat(feedbackCaptor.firstValue.key()).isEqualTo("exact_match")
        assertThat(feedbackCaptor.firstValue.runId()).contains(requireNotNull(run.id().getOrNull()))
        assertThat(requireNotNull(feedbackCaptor.firstValue.score().getOrNull()).asBool()).isTrue()

        verify(sessionService).update(any<SessionUpdateParams>())
    }

    @Test
    fun evaluateWithDatasetNameLoadsExamplesByResolvedDatasetId() {
        val subject =
            setupSubject(
                datasetPages = listOf(listOf(dataset(id = "dataset-id", name = "dataset-name"))),
                examplePages = listOf(listOf(example("ex-1")), emptyList()),
            )

        subject.evaluate(
            EvaluateParams.builder().data("dataset-name").target { mapOf("answer" to "4") }.build()
        )

        val datasetParamsCaptor = argumentCaptor<DatasetListParams>()
        verify(datasetService).list(datasetParamsCaptor.capture())
        assertThat(datasetParamsCaptor.firstValue.name()).contains("dataset-name")

        val paramsCaptor = argumentCaptor<ExampleListParams>()
        verify(exampleService, times(2)).list(paramsCaptor.capture())
        assertThat(paramsCaptor.firstValue.dataset()).contains("dataset-id")
    }

    @Test
    fun evaluateWithDatasetIdLoadsExamplesWithoutDatasetLookup() {
        val datasetId = UUID.randomUUID().toString()
        val subject = setupSubject(examplePages = listOf(listOf(example("ex-1")), emptyList()))

        subject.evaluate(
            EvaluateParams.builder().data(datasetId).target { mapOf("answer" to "4") }.build()
        )

        val paramsCaptor = argumentCaptor<ExampleListParams>()
        verify(exampleService, times(2)).list(paramsCaptor.capture())
        assertThat(paramsCaptor.firstValue.dataset()).contains(datasetId)
        verify(datasetService, times(0)).list(any<DatasetListParams>())
    }

    @Test
    fun evaluateWithMissingDatasetNameFailsBeforeLoadingExamples() {
        val subject = setupSubject(datasetPages = listOf(emptyList()))

        assertThatThrownBy {
                subject.evaluate(
                    EvaluateParams.builder()
                        .data("missing-dataset")
                        .target { mapOf("answer" to "4") }
                        .build()
                )
            }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("Dataset not found: missing-dataset")

        verify(exampleService, times(0)).list(any<ExampleListParams>())
        verify(sessionService, times(0)).create(any<SessionCreateParams>())
    }

    @Test
    fun explicitExamplesMustBelongToOneDataset() {
        val subject = setupSubject()

        assertThatThrownBy {
                subject.evaluate(
                    EvaluateParams.builder()
                        .examples(
                            listOf(
                                example(id = "ex-1", datasetId = "dataset-1"),
                                example(id = "ex-2", datasetId = "dataset-2"),
                            )
                        )
                        .target { mapOf("answer" to "4") }
                        .build()
                )
            }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("same dataset")

        verify(sessionService, times(0)).create(any<SessionCreateParams>())
    }

    @Test
    fun targetErrorsAreLoggedAsErroredRunsByDefault() {
        val subject = setupSubject()

        val results =
            subject.evaluate(
                EvaluateParams.builder()
                    .examples(listOf(example("ex-1")))
                    .target { error("target failed") }
                    .addEvaluator { _, _ ->
                        EvaluationResult.builder().key("unused").score(true).build()
                    }
                    .build()
            )

        assertThat(results.rows()).hasSize(1)
        assertThat(results.rows()[0].targetError()).isPresent
        assertThat(results.rows()[0].evaluationResults()).isEmpty()

        val batchCaptor = argumentCaptor<RunIngestBatchParams>()
        verify(runService).ingestBatch(batchCaptor.capture())
        assertThat(
                requireNotNull(batchCaptor.firstValue.post().getOrNull())
                    .single()
                    .error()
                    .getOrNull()
            )
            .contains("target failed")
        verify(feedbackService, times(0)).create(any<FeedbackCreateSchema>())
    }

    @Test
    fun targetErrorsCanBeIgnored() {
        val subject = setupSubject()

        val results =
            subject.evaluate(
                EvaluateParams.builder()
                    .examples(listOf(example("ex-1")))
                    .target { error("target failed") }
                    .errorHandling(ErrorHandling.IGNORE)
                    .build()
            )

        assertThat(results.rows()).isEmpty()
        verify(runService, times(0)).ingestBatch(any<RunIngestBatchParams>())
        verify(feedbackService, times(0)).create(any<FeedbackCreateSchema>())
    }

    @Test
    fun evaluatorErrorsAreCapturedAndDoNotStopOtherEvaluators() {
        val subject = setupSubject()

        val results =
            subject.evaluate(
                EvaluateParams.builder()
                    .examples(listOf(example("ex-1")))
                    .target { mapOf("answer" to "4") }
                    .addEvaluator { _, _ -> error("evaluator failed") }
                    .addEvaluator { _, _ ->
                        EvaluationResult.builder().key("second").score(1.0).build()
                    }
                    .build()
            )

        val row = results.rows().single()
        assertThat(row.evaluatorErrors()).hasSize(1)
        assertThat(row.evaluatorErrors()[0].error()).hasMessageContaining("evaluator failed")
        assertThat(row.evaluationResults().map { it.key() }).containsExactly("second")
        assertThat(results.feedback()).hasSize(1)
    }

    @Test
    fun sessionEndTimeIsUpdatedWhenFeedbackCreationFails() {
        val subject = setupSubject()
        whenever(feedbackService.create(any<FeedbackCreateSchema>()))
            .thenThrow(RuntimeException("boom"))

        assertThatThrownBy {
                subject.evaluate(
                    EvaluateParams.builder()
                        .examples(listOf(example("ex-1")))
                        .target { mapOf("answer" to "4") }
                        .addEvaluator { _, _ ->
                            EvaluationResult.builder().key("exact_match").score(true).build()
                        }
                        .build()
                )
            }
            .isInstanceOf(RuntimeException::class.java)
            .hasMessageContaining("boom")

        verify(sessionService).update(any<SessionUpdateParams>())
    }

    @Test
    fun ingestRunsInBatches() {
        val subject = setupSubject()

        subject.evaluate(
            EvaluateParams.builder()
                .examples(listOf(example("ex-1"), example("ex-2"), example("ex-3")))
                .batchSize(2)
                .target { mapOf("answer" to "4") }
                .build()
        )

        val batchCaptor = argumentCaptor<RunIngestBatchParams>()
        verify(runService, times(2)).ingestBatch(batchCaptor.capture())
        assertThat(batchCaptor.allValues.map { requireNotNull(it.post().getOrNull()).size })
            .containsExactly(2, 1)
    }

    @Test
    fun concurrentTargetsReturnRowsInExampleOrder() {
        val seen = ConcurrentLinkedQueue<String>()
        val subject = setupSubject()

        val results =
            subject.evaluate(
                EvaluateParams.builder()
                    .examples(listOf(example("ex-1"), example("ex-2"), example("ex-3")))
                    .maxConcurrency(3)
                    .target { example ->
                        seen.add(example.id())
                        if (example.id() == "ex-1") Thread.sleep(50)
                        mapOf("answer" to example.id())
                    }
                    .build()
            )

        assertThat(seen).containsExactlyInAnyOrder("ex-1", "ex-2", "ex-3")
        assertThat(results.rows().map { it.example().id() }).containsExactly("ex-1", "ex-2", "ex-3")
        assertThat(
                results.rows().map {
                    requireNotNull(it.run().outputs().getOrNull())
                        ._additionalProperties()["answer"]
                        ?.toPlainValue()
                }
            )
            .containsExactly("ex-1", "ex-2", "ex-3")
    }

    @Test
    fun validateRequiredParams() {
        val subject = setupSubject()

        assertThatThrownBy { EvaluateParams.builder().data("dataset").build() }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("target")

        assertThatThrownBy {
                EvaluateParams.builder()
                    .data("dataset")
                    .examples(listOf(example("ex-1")))
                    .target { emptyMap() }
                    .build()
            }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("Only one")

        assertThatThrownBy {
                subject.evaluate(
                    EvaluateParams.builder().examples(emptyList()).target { emptyMap() }.build()
                )
            }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("at least one example")
    }

    private fun setupSubject(
        examplePages: List<List<Example>> = emptyList(),
        datasetPages: List<List<Dataset>> = emptyList(),
    ): ExperimentClient {
        whenever(client.datasets()).thenReturn(datasetService)
        whenever(client.examples()).thenReturn(exampleService)
        whenever(client.sessions()).thenReturn(sessionService)
        whenever(client.runs()).thenReturn(runService)
        whenever(client.feedback()).thenReturn(feedbackService)
        whenever(sessionService.create(any<SessionCreateParams>())).thenReturn(session())
        whenever(sessionService.update(any<SessionUpdateParams>())).thenReturn(session())
        whenever(runService.ingestBatch(any<RunIngestBatchParams>()))
            .thenReturn(RunIngestBatchResponse.builder().build())
        whenever(feedbackService.create(any<FeedbackCreateSchema>())).thenAnswer { invocation ->
            val schema = invocation.getArgument<FeedbackCreateSchema>(0)
            FeedbackSchema.builder().id(UUID.randomUUID().toString()).key(schema.key()).build()
        }

        if (datasetPages.isNotEmpty()) {
            val pages =
                ArrayDeque(
                    datasetPages.map { datasets ->
                        DatasetListPage.builder()
                            .service(datasetService)
                            .params(DatasetListParams.builder().build())
                            .items(datasets)
                            .build()
                    }
                )
            whenever(datasetService.list(any<DatasetListParams>())).thenAnswer {
                pages.removeFirst()
            }
        }

        if (examplePages.isNotEmpty()) {
            val pages =
                ArrayDeque(
                    examplePages.map { examples ->
                        ExampleListPage.builder()
                            .service(exampleService)
                            .params(ExampleListParams.builder().build())
                            .items(examples)
                            .build()
                    }
                )
            whenever(exampleService.list(any<ExampleListParams>())).thenAnswer {
                pages.removeFirst()
            }
        }

        return ExperimentClient.create(client)
    }

    private fun dataset(id: String, name: String): Dataset =
        Dataset.builder()
            .id(id)
            .name(name)
            .modifiedAt(java.time.OffsetDateTime.now())
            .sessionCount(0)
            .tenantId("tenant-id")
            .build()

    private fun example(
        id: String,
        question: String = "2 + 2?",
        answer: String = "4",
        datasetId: String = "dataset-id",
    ): Example =
        Example.builder()
            .id(id)
            .datasetId(datasetId)
            .name(id)
            .inputs(
                Example.Inputs.builder()
                    .putAdditionalProperty("question", JsonValue.from(question))
                    .build()
            )
            .outputs(
                Example.Outputs.builder()
                    .putAdditionalProperty("answer", JsonValue.from(answer))
                    .build()
            )
            .build()

    private fun session(): TracerSessionWithoutVirtualFields =
        TracerSessionWithoutVirtualFields.builder()
            .id("session-id")
            .tenantId("tenant-id")
            .name("experiment-name")
            .referenceDatasetId("dataset-id")
            .build()

    private fun sessionMetadata(params: SessionCreateParams): Map<String, Any?> =
        (requireNotNull(params.extra().getOrNull())
                ._additionalProperties()["metadata"]
                ?.toPlainValue() as? Map<*, *>)
            .orEmpty()
            .entries
            .associate { (key, value) ->
                require(key is String) { "Metadata keys must be strings" }
                key to value
            }
}
