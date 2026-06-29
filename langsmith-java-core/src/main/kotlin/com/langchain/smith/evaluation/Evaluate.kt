@file:JvmName("Evaluation")

package com.langchain.smith.evaluation

import com.langchain.smith.client.LangsmithClient
import java.util.function.Function

/**
 * Runs [target] on a dataset, traces each prediction, scores it with [params.evaluators], and
 * uploads feedback to LangSmith.
 */
fun evaluate(
    client: LangsmithClient,
    target: (Map<String, Any?>) -> Any?,
    params: EvaluateParams,
): ExperimentResults = EvaluateRunner(client, params).run(target)

/** Java-friendly overload using [Function]. */
fun evaluate(
    client: LangsmithClient,
    target: Function<Map<String, Any?>, Any?>,
    params: EvaluateParams,
): ExperimentResults = evaluate(client, { inputs -> target.apply(inputs) }, params)
