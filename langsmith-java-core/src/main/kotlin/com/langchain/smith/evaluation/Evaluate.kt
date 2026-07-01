@file:JvmName("Evaluation")

package com.langchain.smith.evaluation

import com.langchain.smith.client.LangsmithClient
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executors
import java.util.function.Function

private val evaluateExecutor =
    Executors.newCachedThreadPool { runnable ->
        Thread(runnable, "langsmith-evaluate").apply { isDaemon = true }
    }

/**
 * Runs [target] on a dataset, traces each prediction, scores it with [params.evaluators], and
 * uploads feedback to LangSmith.
 *
 * @param blocking When `true` (default), waits for the evaluation to finish before returning. When
 *   `false`, use [evaluateAsync] instead.
 */
@JvmOverloads
fun evaluate(
    client: LangsmithClient,
    target: (Map<String, Any?>) -> Any?,
    params: EvaluateParams,
    blocking: Boolean = true,
): ExperimentResults {
    if (!blocking) {
        throw IllegalArgumentException(
            "Non-blocking evaluation requires evaluateAsync(). " +
                "Call evaluateAsync(client, target, params) instead."
        )
    }
    return EvaluateRunner(client, params).run(target)
}

/** Java-friendly overload using [Function]. */
@JvmOverloads
fun evaluate(
    client: LangsmithClient,
    target: Function<Map<String, Any?>, Any?>,
    params: EvaluateParams,
    blocking: Boolean = true,
): ExperimentResults = evaluate(client, { inputs -> target.apply(inputs) }, params, blocking)

/**
 * Runs [target] asynchronously. Equivalent to Python `evaluate(..., blocking=False)` — call
 * [CompletableFuture.join] or [CompletableFuture.get] when results are needed.
 */
fun evaluateAsync(
    client: LangsmithClient,
    target: (Map<String, Any?>) -> Any?,
    params: EvaluateParams,
): CompletableFuture<ExperimentResults> =
    CompletableFuture.supplyAsync({ EvaluateRunner(client, params).run(target) }, evaluateExecutor)

/** Async overload for Java [Function]. */
fun evaluateAsync(
    client: LangsmithClient,
    target: Function<Map<String, Any?>, Any?>,
    params: EvaluateParams,
): CompletableFuture<ExperimentResults> =
    evaluateAsync(client, { inputs -> target.apply(inputs) }, params)
