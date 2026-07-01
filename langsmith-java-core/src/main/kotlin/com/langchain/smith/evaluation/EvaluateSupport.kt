package com.langchain.smith.evaluation

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.DatasetListParams
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.examples.ExampleListParams
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import com.langchain.smith.models.feedback.ModelFeedbackSource
import com.langchain.smith.models.sessions.TracerSession
import java.util.UUID

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
    val listParams = ExampleListParams.builder().dataset(datasetId).build()
    return client.examples().list(listParams).autoPager().toList()
}

internal fun loadExperiment(client: LangsmithClient, experiment: String): TracerSession =
    client.sessions().retrieve(experiment)

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
