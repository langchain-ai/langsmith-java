package com.langchain.smith.evaluation

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.DatasetListParams
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.examples.ExampleListParams
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.models.runs.Run
import com.langchain.smith.models.runs.RunIngestBatchParams
import com.langchain.smith.models.sessions.SessionCreateParams
import com.langchain.smith.models.sessions.SessionUpdateParams
import com.langchain.smith.models.sessions.TracerSessionWithoutVirtualFields
import java.time.OffsetDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.util.UUID
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import kotlin.jvm.optionals.getOrNull

/** High-level client for running LangSmith experiments over dataset examples. */
class ExperimentClient private constructor(private val client: LangsmithClient) {

    /** Runs a synchronous experiment and uploads runs plus evaluator feedback to LangSmith. */
    fun evaluate(params: EvaluateParams): ExperimentResults {
        val examples = resolveExamples(params)
        require(examples.isNotEmpty()) { "Evaluation data must contain at least one example" }
        requireSingleDataset(examples)

        val session = createSession(params, examples.first())
        val results =
            try {
                val rows = runTargets(params, session, examples)

                ingestRuns(rows.map { it.run() }, params.batchSize())
                val feedback = runEvaluators(params, rows)
                ExperimentResults(session = session, rows = rows, feedback = feedback)
            } catch (e: Throwable) {
                updateSessionEndTimeSuppressing(session, e)
                throw e
            }

        updateSessionEndTime(session)
        return results
    }

    private fun requireSingleDataset(examples: List<ExperimentExample>) {
        val datasetIds = examples.map { it.datasetId() }.distinct()
        require(datasetIds.size == 1) {
            "Evaluation examples must all belong to the same dataset; found ${datasetIds.size}"
        }
    }

    private fun resolveExamples(params: EvaluateParams): List<ExperimentExample> =
        params.examples().getOrNull()?.map { ExperimentExample(it) }
            ?: client
                .examples()
                .list(
                    ExampleListParams.builder()
                        .dataset(datasetId(requireNotNull(params.data().getOrNull())))
                        .build()
                )
                .autoPager()
                .map { ExperimentExample(it) }
                .toList()

    private fun datasetId(data: String): String {
        if (data.isUuid()) return data

        val dataset =
            client
                .datasets()
                .list(DatasetListParams.builder().name(data).limit(1).build())
                .items()
                .firstOrNull()
        require(dataset != null) { "Dataset not found: $data" }
        return dataset.id()
    }

    private fun createSession(
        params: EvaluateParams,
        firstExample: ExperimentExample,
    ): TracerSessionWithoutVirtualFields {
        val metadata = buildMetadata(params)
        return client
            .sessions()
            .create(
                SessionCreateParams.builder()
                    .name(experimentName(params))
                    .description(params.description().getOrNull())
                    .startTime(OffsetDateTime.now(ZoneOffset.UTC))
                    .referenceDatasetId(firstExample.datasetId())
                    .extra(
                        SessionCreateParams.Extra.builder()
                            .putAdditionalProperty("metadata", JsonValue.from(metadata))
                            .build()
                    )
                    .build()
            )
    }

    private fun runTargets(
        params: EvaluateParams,
        session: TracerSessionWithoutVirtualFields,
        examples: List<ExperimentExample>,
    ): List<ExperimentResultRow> =
        runInOrder(examples, params.maxConcurrency()) { example ->
                runTarget(params, session, example)
            }
            .mapNotNull { it }

    private fun runTarget(
        params: EvaluateParams,
        session: TracerSessionWithoutVirtualFields,
        example: ExperimentExample,
    ): ExperimentResultRow? {
        val startTime = OffsetDateTime.now(ZoneOffset.UTC)
        val runId = UUID.randomUUID().toString()
        return try {
            val outputs = params.target().run(example).toMap()
            val run =
                buildRun(
                    params = params,
                    session = session,
                    example = example,
                    runId = runId,
                    startTime = startTime,
                    endTime = OffsetDateTime.now(ZoneOffset.UTC),
                    outputs = outputs,
                    error = null,
                )
            ExperimentResultRow(
                example = example,
                run = run,
                evaluationResults = emptyList(),
                targetError = null,
                evaluatorErrors = emptyList(),
            )
        } catch (e: Throwable) {
            if (params.errorHandling() == ErrorHandling.IGNORE) {
                null
            } else {
                val run =
                    buildRun(
                        params = params,
                        session = session,
                        example = example,
                        runId = runId,
                        startTime = startTime,
                        endTime = OffsetDateTime.now(ZoneOffset.UTC),
                        outputs = null,
                        error = e.stackTraceToString(),
                    )
                ExperimentResultRow(
                    example = example,
                    run = run,
                    evaluationResults = emptyList(),
                    targetError = e,
                    evaluatorErrors = emptyList(),
                )
            }
        }
    }

    private fun buildRun(
        params: EvaluateParams,
        session: TracerSessionWithoutVirtualFields,
        example: ExperimentExample,
        runId: String,
        startTime: OffsetDateTime,
        endTime: OffsetDateTime,
        outputs: Map<String, Any?>?,
        error: String?,
    ): Run {
        val metadata =
            buildMap<String, Any?> {
                putAll(buildMetadata(params))
                example.modifiedAt().ifPresent { put("example_version", it.toString()) }
            }

        return Run.builder()
            .id(runId)
            .traceId(runId)
            .dottedOrder(dottedOrder(startTime, runId))
            .name("Target")
            .runType(Run.RunType.CHAIN)
            .sessionId(session.id())
            .apply { session.name().ifPresent { sessionName(it) } }
            .referenceExampleId(example.id())
            .inputs(
                Run.Inputs.builder()
                    .putAllAdditionalProperties(toJsonValueMap(example.inputs()))
                    .build()
            )
            .apply {
                outputs?.let {
                    outputs(
                        Run.Outputs.builder().putAllAdditionalProperties(toJsonValueMap(it)).build()
                    )
                }
            }
            .startTime(startTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME))
            .endTime(endTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME))
            .tags(params.tags())
            .extra(
                Run.Extra.builder()
                    .putAdditionalProperty("metadata", JsonValue.from(metadata))
                    .build()
            )
            .apply { error?.let { error(it) } }
            .build()
    }

    private fun ingestRuns(runs: List<Run>, batchSize: Int) {
        runs.chunked(batchSize).forEach { batch ->
            val ingestParams =
                RunIngestBatchParams.builder().apply { batch.forEach { addPost(it) } }.build()
            client.runs().ingestBatch(ingestParams)
        }
    }

    private fun runEvaluators(
        params: EvaluateParams,
        rows: List<ExperimentResultRow>,
    ): List<FeedbackSchema> {
        if (params.evaluators().isEmpty()) return emptyList()

        val evaluatedRows =
            runInOrder(rows, params.maxConcurrency()) { row ->
                if (row.targetError().isPresent) row else evaluateRow(params, row)
            }

        rows.zip(evaluatedRows).forEach { (original, evaluated) -> original.replaceWith(evaluated) }
        return evaluatedRows.flatMap { row ->
            row.evaluationResults().map { result -> createFeedback(row, result) }
        }
    }

    private fun evaluateRow(params: EvaluateParams, row: ExperimentResultRow): ExperimentResultRow {
        val experimentRun = ExperimentRun(row.run())
        val results = mutableListOf<EvaluationResult>()
        val errors = mutableListOf<EvaluatorError>()

        params.evaluators().forEach { evaluator ->
            try {
                results.add(evaluator.evaluate(experimentRun, row.example()))
            } catch (e: Throwable) {
                errors.add(EvaluatorError(evaluator = evaluator, error = e))
            }
        }

        return row.copy(evaluationResults = results, evaluatorErrors = errors)
    }

    private fun createFeedback(row: ExperimentResultRow, result: EvaluationResult): FeedbackSchema =
        client.feedback().create(toFeedbackCreateSchema(row, result))

    private fun toFeedbackCreateSchema(
        row: ExperimentResultRow,
        result: EvaluationResult,
    ): FeedbackCreateSchema {
        val builder =
            FeedbackCreateSchema.builder()
                .key(result.key())
                .runId(requireNotNull(row.run().id().getOrNull()))
                .traceId(requireNotNull(row.run().traceId().getOrNull()))
                .sessionId(row.run().sessionId().getOrNull())

        result.comment().ifPresent { builder.comment(it) }
        result.score().ifPresent {
            when (it) {
                is Boolean -> builder.score(it)
                is Number -> builder.score(it.toDouble())
            }
        }
        result.value().ifPresent {
            when (it) {
                is Boolean -> builder.value(it)
                is Number -> builder.value(it.toDouble())
                is String -> builder.value(it)
            }
        }
        result.correction().ifPresent {
            when (it) {
                is String -> builder.correction(it)
                is Map<*, *> ->
                    builder.correction(
                        FeedbackCreateSchema.Correction.UnionMember0.builder()
                            .putAllAdditionalProperties(toStringKeyedJsonValueMap(it))
                            .build()
                    )
            }
        }

        return builder.build()
    }

    private fun updateSessionEndTime(session: TracerSessionWithoutVirtualFields) {
        client
            .sessions()
            .update(
                SessionUpdateParams.builder()
                    .sessionId(session.id())
                    .endTime(OffsetDateTime.now(ZoneOffset.UTC))
                    .build()
            )
    }

    private fun updateSessionEndTimeSuppressing(
        session: TracerSessionWithoutVirtualFields,
        failure: Throwable,
    ) {
        try {
            updateSessionEndTime(session)
        } catch (updateFailure: Throwable) {
            failure.addSuppressed(updateFailure)
        }
    }

    private fun experimentName(params: EvaluateParams): String =
        params.experimentName().getOrNull()
            ?: "${params.experimentPrefix().orElse("java-evaluate")}-${randomNameSuffix()}"

    private fun randomNameSuffix(): String = UUID.randomUUID().toString().take(8)

    private fun buildMetadata(params: EvaluateParams): Map<String, Any?> = buildMap {
        put("__ls_runner", "java_sdk_evaluate")
        putAll(params.metadata())
    }

    private fun <T, R> runInOrder(items: List<T>, maxConcurrency: Int, block: (T) -> R): List<R> {
        if (maxConcurrency == 0 || items.size <= 1) return items.map(block)

        val executor = Executors.newFixedThreadPool(maxConcurrency)
        return try {
            items.map { item -> executor.submit(Callable { block(item) }) }.map { it.get() }
        } finally {
            executor.shutdown()
        }
    }

    companion object {

        @JvmStatic fun create(client: LangsmithClient): ExperimentClient = ExperimentClient(client)
    }
}

private val DOTTED_ORDER_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmssSSSSSS'Z'")

private fun dottedOrder(startTime: OffsetDateTime, runId: String): String =
    startTime.withOffsetSameInstant(ZoneOffset.UTC).format(DOTTED_ORDER_FORMATTER) + runId

private fun toJsonValueMap(map: Map<String, Any?>): Map<String, JsonValue> =
    map.mapValues { JsonValue.from(it.value) }

private fun toStringKeyedJsonValueMap(map: Map<*, *>): Map<String, JsonValue> =
    map.entries.associate { (key, value) ->
        require(key is String) { "Correction maps must use string keys" }
        key to JsonValue.from(value)
    }

private fun String.isUuid(): Boolean = runCatching { UUID.fromString(this) }.isSuccess

internal fun JsonValue.toPlainValue(): Any? =
    accept(
        object : JsonValue.Visitor<Any?> {
            override fun visitNull(): Any? = null

            override fun visitMissing(): Any? = null

            override fun visitBoolean(value: Boolean): Any = value

            override fun visitNumber(value: Number): Any = value

            override fun visitString(value: String): Any = value

            override fun visitArray(values: List<JsonValue>): Any = values.map { it.toPlainValue() }

            override fun visitObject(values: Map<String, JsonValue>): Any =
                values.mapValues { it.value.toPlainValue() }
        }
    )

internal fun Example.Inputs.toPlainMap(): Map<String, Any?> =
    _additionalProperties().mapValues { it.value.toPlainValue() }

internal fun Example.Outputs.toPlainMap(): Map<String, Any?> =
    _additionalProperties().mapValues { it.value.toPlainValue() }

internal fun Example.Metadata.toPlainMap(): Map<String, Any?> =
    _additionalProperties().mapValues { it.value.toPlainValue() }
