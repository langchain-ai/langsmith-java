package com.langchain.smith.evaluation

import java.util.function.Function

/**
 * Runnable-style evaluation target. Mirrors Python's `Runnable.invoke` / chain target support
 * without requiring a LangChain dependency.
 */
fun interface EvaluateTarget {
    fun invoke(inputs: Map<String, Any?>): Any?
}

/** Wraps a Kotlin lambda as an [EvaluateTarget]. */
fun evaluateTarget(func: (Map<String, Any?>) -> Any?): EvaluateTarget = EvaluateTarget(func::invoke)

/** Wraps a Java [Function] as an [EvaluateTarget]. */
fun evaluateTarget(func: Function<Map<String, Any?>, Any?>): EvaluateTarget =
    EvaluateTarget { inputs ->
        func.apply(inputs)
    }
