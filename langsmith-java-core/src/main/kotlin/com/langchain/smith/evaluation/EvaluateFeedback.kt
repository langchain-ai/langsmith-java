package com.langchain.smith.evaluation

import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import com.langchain.smith.models.feedback.ModelFeedbackSource
import com.langchain.smith.models.runs.RunIngest
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull

/** Turns an evaluator response into a flat list of [EvaluationResult]. */
internal fun selectEvaluationResults(output: EvaluationOutput): List<EvaluationResult> =
    when (output) {
        is EvaluationResult -> listOf(output)
        is EvaluationResults -> output.results
    }

/** Posts evaluator feedback for a prediction run. */
internal fun logEvaluationFeedback(
    client: LangsmithClient,
    evaluatorResponse: EvaluationOutput,
    run: RunIngest,
) {
    for (result in selectEvaluationResults(evaluatorResponse)) {
        client.feedback().create(buildFeedbackCreateSchema(result, run))
    }
}

private fun buildFeedbackCreateSchema(
    result: EvaluationResult,
    run: RunIngest,
): FeedbackCreateSchema {
    val builder = FeedbackCreateSchema.builder().key(result.key)

    val runId = result.targetRunId ?: run.id().getOrNull()
    if (runId != null) {
        builder.runId(runId)
    }

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

    run.traceId().getOrNull()?.let { builder.traceId(it) }
    run.sessionId().getOrNull()?.let { builder.sessionId(it) }
    run.startTime().getOrNull()?.let { startTime ->
        runStartTime(startTime)?.let { builder.startTime(it) }
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

internal fun applyFeedbackValue(builder: FeedbackCreateSchema.Builder, value: Any?) {
    when (value) {
        null -> Unit
        is Number ->
            builder.value(
                when (value) {
                    is Double -> value
                    is Float -> value.toDouble()
                    else -> value.toDouble()
                }
            )
        is Boolean -> builder.value(value)
        is String -> builder.value(value)
        is Map<*, *> -> {
            @Suppress("UNCHECKED_CAST") val stringMap = value as Map<String, Any?>
            builder.value(
                FeedbackCreateSchema.Value.ofUnionMember3(
                    FeedbackCreateSchema.Value.UnionMember3.builder()
                        .putAllAdditionalProperties(
                            stringMap.mapValues { (_, v) -> JsonValue.from(v) }
                        )
                        .build()
                )
            )
        }
        else -> builder.value(value.toString())
    }
}

internal fun runStartTime(startTime: String): OffsetDateTime? =
    try {
        OffsetDateTime.parse(startTime)
    } catch (_: Exception) {
        null
    }
