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
 *   `false`, use [evaluateAsync] instead — Java cannot return in-progress [ExperimentResults].
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

/** Runs an [EvaluateTarget] (Runnable-style) on a dataset. */
@JvmOverloads
fun evaluate(
    client: LangsmithClient,
    target: EvaluateTarget,
    params: EvaluateParams,
    blocking: Boolean = true,
): ExperimentResults = evaluate(client, target::invoke, params, blocking)

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

/** Async overload for [EvaluateTarget]. */
fun evaluateAsync(
    client: LangsmithClient,
    target: EvaluateTarget,
    params: EvaluateParams,
): CompletableFuture<ExperimentResults> = evaluateAsync(client, target::invoke, params)

/** Async overload for Java [Function]. */
fun evaluateAsync(
    client: LangsmithClient,
    target: Function<Map<String, Any?>, Any?>,
    params: EvaluateParams,
): CompletableFuture<ExperimentResults> =
    evaluateAsync(client, { inputs -> target.apply(inputs) }, params)

/**
 * Evaluates an existing experiment's runs without re-running the target. Mirrors Python
 * `evaluate_existing` and `evaluate(existing_experiment_id, ...)`.
 */
@JvmOverloads
fun evaluateExisting(
    client: LangsmithClient,
    experimentId: String,
    params: EvaluateExistingParams,
    blocking: Boolean = true,
): ExperimentResults {
    if (!blocking) {
        throw IllegalArgumentException(
            "Non-blocking evaluation requires evaluateExistingAsync(). " +
                "Call evaluateExistingAsync(client, experimentId, params) instead."
        )
    }
    return EvaluateExistingRunner(client, experimentId, params).run()
}

fun evaluateExistingAsync(
    client: LangsmithClient,
    experimentId: String,
    params: EvaluateExistingParams,
): CompletableFuture<ExperimentResults> =
    CompletableFuture.supplyAsync(
        { EvaluateExistingRunner(client, experimentId, params).run() },
        evaluateExecutor,
    )

/**
 * Compares two existing experiments with pairwise evaluators. Mirrors Python `evaluate_comparative`
 * and `evaluate((experiment_a, experiment_b), ...)`.
 */
fun evaluateComparative(
    client: LangsmithClient,
    experiments: Pair<String, String>,
    params: EvaluateComparativeParams,
): ComparativeExperimentResults = EvaluateComparativeRunner(client, experiments, params).run()

/** Convenience overload accepting experiment ids as a list. */
fun evaluateComparative(
    client: LangsmithClient,
    experiments: List<String>,
    params: EvaluateComparativeParams,
): ComparativeExperimentResults {
    require(experiments.size == 2) {
        "Comparative evaluation requires exactly 2 experiments, got ${experiments.size}"
    }
    return evaluateComparative(client, experiments[0] to experiments[1], params)
}

/**
 * Re-scores an existing experiment using evaluators from [EvaluateParams]. Convenience wrapper
 * around [evaluateExisting] for callers that already hold [EvaluateParams].
 */
@JvmOverloads
fun evaluate(
    client: LangsmithClient,
    experimentId: String,
    params: EvaluateParams,
    blocking: Boolean = true,
): ExperimentResults =
    evaluateExisting(
        client,
        experimentId,
        EvaluateExistingParams.builder()
            .evaluators(params.evaluators)
            .summaryEvaluators(params.summaryEvaluators)
            .metadata(params.metadata)
            .maxConcurrency(params.maxConcurrency)
            .build(),
        blocking,
    )

/**
 * Compares two existing experiments. Convenience wrapper when callers pass a pair of session ids as
 * the evaluation target (Python tuple-target style).
 */
fun evaluate(
    client: LangsmithClient,
    experiments: Pair<String, String>,
    params: EvaluateComparativeParams,
): ComparativeExperimentResults = evaluateComparative(client, experiments, params)
