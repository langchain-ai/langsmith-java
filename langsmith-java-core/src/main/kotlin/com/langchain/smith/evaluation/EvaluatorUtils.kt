package com.langchain.smith.evaluation

import com.fasterxml.jackson.core.type.TypeReference
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import com.langchain.smith.models.runs.Run
import java.util.UUID

private val stringAnyMapType = object : TypeReference<Map<String, Any?>>() {}

private val feedbackConfigType = object : TypeReference<FeedbackCreateSchema.FeedbackConfig>() {}

/** Gets the app's answer from a finished run as a simple map. */
internal fun runOutputsMap(run: Run): Map<String, Any?> =
    run.outputs().map { it._additionalProperties().toPlainMap() }.orElse(emptyMap())

/** Gets the inputs sent to the app for one dataset row as a simple map. */
internal fun exampleInputs(example: Example?): Map<String, Any?> =
    example?.inputs()?.let { it._additionalProperties().toPlainMap() } ?: emptyMap()

/** Gets the expected outputs stored on a dataset row as a simple map. */
internal fun exampleOutputs(example: Example?): Map<String, Any?> =
    example?.outputs()?.map { it._additionalProperties().toPlainMap() }?.orElse(emptyMap())
        ?: emptyMap()

/** Unpacks stored fields into plain maps that evaluators can read and compare. */
private fun Map<String, JsonValue>.toPlainMap(): Map<String, Any?> =
    JsonValue.from(this).convert(stringAnyMapType) ?: emptyMap()

/** Accepts whatever an evaluator returned and shapes it into a standard map first. */
internal fun formatEvaluatorResult(result: EvaluatorOutput): Map<String, Any?> =
    when (result) {
        is EvaluationResult ->
            mapOf("key" to result.key, "score" to result.score, "value" to result.value)
        is EvaluationResults -> mapOf("results" to result.results)
        is Boolean -> mapOf("score" to if (result) 1 else 0)
        is Number -> mapOf("score" to result)
        is String -> mapOf("value" to result)
        is List<*> -> formatResultList(result)
        is Map<*, *> -> result.asStringKeyMap()
        null -> throw IllegalArgumentException("Evaluator returned null")
        else ->
            throw IllegalArgumentException(
                "Expected EvaluationResult, EvaluationResults, Map, String, Boolean, Number, or List. Got $result"
            )
    }

private fun formatResultList(result: List<*>): Map<String, Any?> {
    if (result.isEmpty()) {
        throw IllegalArgumentException(
            "Expected a non-empty list of evaluation results, got empty list"
        )
    }
    if (result.any { it !is Map<*, *> && it !is EvaluationResult }) {
        throw IllegalArgumentException(
            "Expected a list of maps or EvaluationResult objects, got $result"
        )
    }
    return mapOf("results" to result)
}

// Silencing a compile-time warning because we already handle the wrong type case when the code
// runs.
@Suppress("UNCHECKED_CAST")
private fun Map<*, *>.asStringKeyMap(): Map<String, Any?> = this as Map<String, Any?>

private fun Any.requireStringKeyMap(): Map<String, Any?> =
    (this as? Map<*, *>)?.asStringKeyMap()
        ?: throw IllegalArgumentException(
            "Expected EvaluationResult or Map with metric fields, got $this"
        )

private fun parseFeedbackConfig(value: Any?): FeedbackCreateSchema.FeedbackConfig? =
    when (value) {
        null -> null
        is FeedbackCreateSchema.FeedbackConfig -> value
        is Map<*, *> ->
            JsonValue.from(value).convert(feedbackConfigType)
                ?: throw IllegalArgumentException("Invalid feedbackConfig: $value")
        else ->
            throw IllegalArgumentException(
                "Expected feedbackConfig as FeedbackConfig or Map, got $value"
            )
    }

/** Builds one scored feedback item from an evaluator's return value. */
internal fun coerceEvaluationResult(
    result: Any,
    sourceRunId: String,
    defaultKey: String,
    allowMissingKey: Boolean = false,
): EvaluationResult {
    if (result is EvaluationResult) {
        return result.copy(sourceRunId = result.sourceRunId ?: sourceRunId)
    }
    val map = result.requireStringKeyMap()
    if (map.isEmpty()) {
        throw IllegalArgumentException("Expected a non-empty evaluation result map, got $map")
    }
    val key =
        map["key"] as? String
            ?: defaultKey.takeIf { allowMissingKey }
            ?: throw IllegalArgumentException("Evaluation result map must include a 'key' field")
    if ("score" !in map && "value" !in map && "comment" !in map) {
        throw IllegalArgumentException(
            "Evaluation result map must include at least one of score, value, or comment"
        )
    }
    return EvaluationResult(
        key = key,
        score = map["score"] as? Number,
        value = map["value"],
        metadata = map["metadata"] as? Map<String, Any>,
        comment = map["comment"] as? String,
        correction = map["correction"] as? Map<String, Any>,
        evaluatorInfo = map["evaluatorInfo"] as? Map<String, Any> ?: emptyMap(),
        feedbackConfig = parseFeedbackConfig(map["feedbackConfig"] ?: map["feedback_config"]),
        sourceRunId = sourceRunId,
        targetRunId = map["targetRunId"] as? String,
        extra = map["extra"] as? Map<String, Any>,
    )
}

/** Normalizes any evaluator return into one or more scored feedback items. */
internal fun coerceEvaluatorOutput(
    output: EvaluatorOutput,
    sourceRunId: String,
    defaultKey: String,
): EvaluationOutput =
    when (output) {
        is EvaluationResult -> output.copy(sourceRunId = output.sourceRunId ?: sourceRunId)
        is EvaluationResults ->
            EvaluationResults(
                output.results.map { coerceEvaluationResult(it, sourceRunId, defaultKey) }
            )
        else -> {
            val map = formatEvaluatorResult(output)
            if ("results" in map) {
                @Suppress("UNCHECKED_CAST") val results = map["results"] as List<Any>
                EvaluationResults(
                    results.map {
                        coerceEvaluationResult(it, sourceRunId, defaultKey, allowMissingKey = false)
                    }
                )
            } else {
                coerceEvaluationResult(map, sourceRunId, defaultKey, allowMissingKey = true)
            }
        }
    }

/** Creates a unique id for this evaluator scoring step. */
internal fun newEvaluatorRunId(): String = UUID.randomUUID().toString()
