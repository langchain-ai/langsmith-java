package com.langchain.smith.evaluation

import com.langchain.smith.models.feedback.FeedbackCreateSchema

/**
 * Normalized output from [RunEvaluator.evaluateRun], matching Python's `Union[EvaluationResult,
 * EvaluationResults]`.
 */
sealed interface EvaluationOutput

/** A single evaluation feedback metric produced by a [RunEvaluator]. */
data class EvaluationResult(
    val key: String,
    val score: Number? = null,
    val value: Any? = null,
    val metadata: Map<String, Any>? = null,
    val comment: String? = null,
    val correction: Map<String, Any>? = null,
    val evaluatorInfo: Map<String, Any> = emptyMap(),
    val feedbackConfig: FeedbackCreateSchema.FeedbackConfig? = null,
    val sourceRunId: String? = null,
    val targetRunId: String? = null,
    val extra: Map<String, Any>? = null,
) : EvaluationOutput

/** Batch evaluation results returned when an evaluator emits multiple metrics at once. */
data class EvaluationResults(val results: List<EvaluationResult>) : EvaluationOutput
