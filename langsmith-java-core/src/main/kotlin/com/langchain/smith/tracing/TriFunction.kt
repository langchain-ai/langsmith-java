package com.langchain.smith.tracing

/**
 * A function that accepts three arguments and produces a result.
 *
 * This is the three-argument equivalent of [java.util.function.Function] and
 * [java.util.function.BiFunction]. Use it with [traceTriFunction] to trace a 3-arg function:
 * ```java
 * TriFunction<String, String, String, String> traced =
 *     Tracing.traceTriFunction((a, b, c) -> a + " " + b + " " + c, config);
 * String result = traced.apply("a", "b", "c");
 * ```
 *
 * @param I1 the type of the first argument
 * @param I2 the type of the second argument
 * @param I3 the type of the third argument
 * @param O the type of the result
 */
@FunctionalInterface
fun interface TriFunction<I1, I2, I3, O> {
    fun apply(i1: I1, i2: I2, i3: I3): O
}
