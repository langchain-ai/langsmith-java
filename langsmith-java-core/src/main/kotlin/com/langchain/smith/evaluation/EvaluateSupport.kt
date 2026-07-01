package com.langchain.smith.evaluation

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.DatasetListParams
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.examples.ExampleListParams
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import com.langchain.smith.models.feedback.ModelFeedbackSource
import com.langchain.smith.models.runs.RunIngest
import com.langchain.smith.models.runs.RunQueryParams
import com.langchain.smith.models.runs.RunSchema
import com.langchain.smith.models.sessions.TracerSession
import java.util.UUID
import kotlin.jvm.optionals.getOrNull

internal fun expandExamples(examples: List<Example>, numRepetitions: Int): List<Example> =
    if (numRepetitions <= 1) {
        examples
    } else {
        List(numRepetitions) { examples }.flatten()
    }

internal fun resolveDatasetId(client: LangsmithClient, datasetIdentifier: String): String {
    if (isUuid(datasetIdentifier)) {
        return datasetIdentifier
    }
    val matches =
        client.datasets().list(DatasetListParams.builder().name(datasetIdentifier).build()).items()
    require(matches.isNotEmpty()) {
        "No dataset found with name '$datasetIdentifier'. Create the dataset first or pass its UUID."
    }
    require(matches.size == 1) {
        "Multiple datasets named '$datasetIdentifier'; pass the dataset UUID instead."
    }
    return matches.single().id()
}

internal fun listExamples(client: LangsmithClient, datasetIdentifier: String): List<Example> {
    val datasetId = resolveDatasetId(client, datasetIdentifier)
    return listDatasetExamples(client, datasetId)
}

internal fun listDatasetExamples(
    client: LangsmithClient,
    datasetId: String,
    asOf: String? = null,
): List<Example> {
    val builder = ExampleListParams.builder().dataset(datasetId)
    asOf?.let { builder.asOf(it) }
    return client.examples().list(builder.build()).autoPager().toList()
}

internal fun experimentDatasetVersion(session: TracerSession): String? {
    val extra = session.extra().orElse(null) ?: return null
    val props = extra._additionalProperties()
    props["dataset_version"]?.convert(String::class.java)?.let {
        return it
    }
    return props["metadata"]?.accept(
        object : JsonValue.Visitor<String?> {
            override fun visitObject(values: Map<String, JsonValue>): String? =
                values["dataset_version"]?.convert(String::class.java)

            override fun visitDefault(): String? = null
        }
    )
}

internal fun loadExperiment(client: LangsmithClient, experiment: String): TracerSession =
    client.sessions().retrieve(experiment)

internal fun loadRunsForExperiment(
    client: LangsmithClient,
    sessionId: String,
    loadNested: Boolean,
): List<RunIngest> {
    val deadlineMs = System.currentTimeMillis() + RUN_QUERY_TIMEOUT_MS
    var delayMs = RUN_QUERY_INITIAL_DELAY_MS
    while (true) {
        client.runs().flush()
        val runs = queryRunsForExperiment(client, sessionId, loadNested)
        if (runs.isNotEmpty() || System.currentTimeMillis() >= deadlineMs) {
            return runs
        }
        Thread.sleep(delayMs)
        delayMs = minOf(delayMs * 2, RUN_QUERY_MAX_DELAY_MS)
    }
}

private fun queryRunsForExperiment(
    client: LangsmithClient,
    sessionId: String,
    loadNested: Boolean,
): List<RunIngest> {
    val paramsBuilder = RunQueryParams.builder().session(listOf(sessionId)).limit(100L)
    if (!loadNested) {
        paramsBuilder.isRoot(true)
    }
    return client.runs().query(paramsBuilder.build()).autoPager().toList().map {
        it.toEvaluateRun()
    }
}

internal fun RunSchema.toEvaluateRun(): RunIngest {
    val builder = RunIngest.builder().id(id()).sessionId(sessionId()).traceId(traceId())
    referenceExampleId().getOrNull()?.let { builder.referenceExampleId(it) }
    startTime().getOrNull()?.let { builder.startTime(it.toString()) }
    outputs().getOrNull()?.let { schemaOutputs ->
        val outputsBuilder = RunIngest.Outputs.builder()
        schemaOutputs._additionalProperties().forEach { (key, value) ->
            outputsBuilder.putAdditionalProperty(key, value)
        }
        builder.outputs(outputsBuilder.build())
    }
    return builder.build()
}

internal fun loadExamplesByIds(
    client: LangsmithClient,
    datasetId: String,
    exampleIds: List<String>,
    asOf: String? = null,
): Map<String, Example> {
    if (exampleIds.isEmpty()) {
        return emptyMap()
    }
    val wanted = exampleIds.toSet()
    return listDatasetExamples(client, datasetId, asOf)
        .filter { it.id() in wanted }
        .associateBy { it.id() }
}

internal fun buildExperimentUrl(
    session: TracerSession?,
    @Suppress("UNUSED_PARAMETER") datasetId: String,
): String? = null

internal fun buildComparativeUrl(
    experiments: List<TracerSession>,
    comparativeExperimentId: String,
    datasetId: String,
): String? = null

internal fun isUuid(value: String): Boolean =
    try {
        UUID.fromString(value)
        true
    } catch (_: IllegalArgumentException) {
        false
    }

internal fun generateExperimentName(prefix: String): String =
    "$prefix-${UUID.randomUUID().toString().take(8)}"

internal fun exampleVersion(example: Example): String {
    val timestamp = example.modifiedAt().orElseGet { example.createdAt().orElse(null) }
    return timestamp?.toString() ?: java.time.OffsetDateTime.now().toString()
}

internal fun logSummaryEvaluationFeedback(
    client: LangsmithClient,
    evaluatorResponse: EvaluationOutput,
    projectId: String,
) {
    for (result in selectEvaluationResults(evaluatorResponse)) {
        client.feedback().create(buildProjectFeedbackCreateSchema(result, projectId))
    }
}

internal fun logComparativeEvaluationFeedback(
    client: LangsmithClient,
    result: ComparisonEvaluationResult,
    runs: List<RunIngest>,
    comparativeExperimentId: String,
    feedbackGroupId: String,
) {
    val comments =
        if (result.comment != null) {
            result.scores.keys.associateWith { result.comment }
        } else {
            emptyMap()
        }
    val runsById = runs.associateBy { it.id().getOrNull().orEmpty() }
    for ((runId, score) in result.scores) {
        val run = runsById[runId]
        val builder =
            FeedbackCreateSchema.builder()
                .key(result.key)
                .runId(runId)
                .score(score.toDouble())
                .comparativeExperimentId(comparativeExperimentId)
                .feedbackGroupId(feedbackGroupId)
                .feedbackSource(
                    ModelFeedbackSource.builder().type(ModelFeedbackSource.Type.MODEL).build()
                )
        comments[runId]?.let { builder.comment(it) }
        run?.sessionId()?.getOrNull()?.let { builder.sessionId(it) }
        run?.startTime()?.getOrNull()?.let { startTime ->
            runStartTime(startTime)?.let { builder.startTime(it) }
        }
        client.feedback().create(builder.build())
    }
}

private fun buildProjectFeedbackCreateSchema(
    result: EvaluationResult,
    projectId: String,
): FeedbackCreateSchema {
    val builder = FeedbackCreateSchema.builder().key(result.key).sessionId(projectId)

    builder.feedbackSource(
        ModelFeedbackSource.builder().type(ModelFeedbackSource.Type.MODEL).build()
    )

    val score = result.score
    if (score != null) {
        builder.score(score.toDouble())
    }

    applyFeedbackValue(builder, result.value)

    val comment = result.comment
    if (comment != null) {
        builder.comment(comment)
    }

    val feedbackConfig = result.feedbackConfig
    if (feedbackConfig != null) {
        builder.feedbackConfig(feedbackConfig)
    }

    val correction = result.correction
    if (correction != null) {
        builder.correction(
            FeedbackCreateSchema.Correction.ofUnionMember0(
                FeedbackCreateSchema.Correction.UnionMember0.builder()
                    .putAllAdditionalProperties(
                        correction.mapValues { (_, value) -> JsonValue.from(value) }
                    )
                    .build()
            )
        )
    }

    val error = result.extra?.get("error") as? Boolean
    if (error == true) {
        builder.error(true)
    }

    return builder.build()
}

private const val RUN_QUERY_TIMEOUT_MS = 30_000L
private const val RUN_QUERY_INITIAL_DELAY_MS = 500L
private const val RUN_QUERY_MAX_DELAY_MS = 2_000L
