@file:JvmName("TraceProcessIOHelper")

package com.langchain.smith.tracing

import java.util.function.Function

/**
 * Typed processors for transforming inputs and outputs before they are recorded on a traced run.
 *
 * The type parameters describe what the processors receive:
 * - [PI] — the type passed to `processInputs`. Depends on the arity of the traced function:
 *     - **1-arg** ([traceFunction]): the raw input type (e.g. `String`)
 *     - **0-arg** ([traceSupplier]): `Map<String, Any?>` (empty map)
 *     - **2-arg** ([traceBiFunction]): `Pair<I1, I2>`
 *     - **3-arg** ([traceTriFunction]): `Triple<I1, I2, I3>`
 * - [PO] — the type passed to `processOutputs`. This is always the raw output type of the traced
 *   function.
 *
 * When [inputs] is set, it replaces the default input serialization entirely. Same for [outputs].
 *
 * ## Example (Kotlin)
 *
 * ```kotlin
 * val process = TraceProcessIO<String, MyResponse>(
 *     processInputs = Function { input -> mapOf("query" to input) },
 *     processOutputs = Function { resp -> mapOf("answer" to resp.text) },
 * )
 * val config = TraceConfig(name = "my-run", client = client, processTracedIO = process)
 * ```
 *
 * ## Example (Java)
 *
 * ```java
 * TraceProcessIO process = TraceProcessIO.<String, MyResponse>builder()
 *     .processInputs(input -> Map.of("query", input))
 *     .processOutputs(resp -> Map.of("answer", resp.getText()))
 *     .build();
 * TraceConfig config = TraceConfig.builder()
 *     .name("my-run")
 *     .client(client)
 *     .processTracedIO(process)
 *     .build();
 * ```
 *
 * @see TraceConfig.processTracedIO
 */
class TraceProcessIO<PI, PO>(
    processInputs: Function<PI, Map<String, Any?>>? = null,
    processOutputs: Function<PO, Map<String, Any?>>? = null,
    aggregator: Function<List<Any?>, Any?>? = null,
) {
    // Store erased wrappers so traceable overloads can call these without casts.
    // erase() converts Function<T, R> to Function<Any?, R> — safe because T erases to Object.
    internal val inputsFn: Function<Any?, Map<String, Any?>>? = processInputs?.erase()
    internal val outputsFn: Function<Any?, Map<String, Any?>>? = processOutputs?.erase()

    /**
     * Optional aggregator for streaming results.
     *
     * When the traced function returns an [AutoCloseable] with a `stream()` method (e.g. OpenAI's
     * `StreamResponse`), `traceable` will:
     * 1. Return the stream to the caller immediately (so they can iterate)
     * 2. Collect each element as the caller iterates via `stream()`
     * 3. Call this aggregator with the collected chunks when `close()` is called
     * 4. Pass the aggregated result through [processOutputs] and record it as run output
     *
     * If no aggregator is set but the result is stream-like, the raw list of chunks is recorded.
     *
     * **Important:** Callers must close the stream (via `use {}` in Kotlin or try-with-resources in
     * Java) to ensure the traced run is finalized. Abandoned streams will leave runs open.
     */
    internal val aggregatorFn: Function<List<Any?>, Any?>? = aggregator

    companion object {
        /** Creates a new [Builder]. */
        @JvmStatic fun <PI, PO> builder() = Builder<PI, PO>()

        /**
         * Converts a typed [Function] to an erased `Function<Any?, R>`.
         *
         * Safe because generic type parameters erase to `Object` at runtime — the JVM never
         * actually checks the input type on `Function.apply`.
         */
        @JvmSynthetic
        @JvmStatic
        @Suppress("UNCHECKED_CAST")
        private fun <T, R> Function<T, R>.erase(): Function<Any?, R> = this as Function<Any?, R>
    }

    /**
     * A builder for [TraceProcessIO].
     *
     * ```java
     * TraceProcessIO process = TraceProcessIO.<String, String>builder()
     *     .processInputs(input -> Map.of("query", input))
     *     .processOutputs(output -> Map.of("answer", output))
     *     .build();
     * ```
     */
    class Builder<PI, PO> internal constructor() {
        private var processInputs: Function<PI, Map<String, Any?>>? = null
        private var processOutputs: Function<PO, Map<String, Any?>>? = null
        private var aggregator: Function<List<Any?>, Any?>? = null

        /** Callback to transform the input before it is recorded on the run. */
        fun processInputs(processInputs: Function<PI, Map<String, Any?>>) = apply {
            this.processInputs = processInputs
        }

        /** Callback to transform the output before it is recorded on the run. */
        fun processOutputs(processOutputs: Function<PO, Map<String, Any?>>) = apply {
            this.processOutputs = processOutputs
        }

        /**
         * Aggregator for streaming results. Reduces collected chunks into a single output that is
         * then passed through [processOutputs].
         */
        fun aggregator(aggregator: Function<List<Any?>, Any?>) = apply {
            this.aggregator = aggregator
        }

        /** Builds the [TraceProcessIO]. */
        fun build() =
            TraceProcessIO(
                processInputs = processInputs,
                processOutputs = processOutputs,
                aggregator = aggregator,
            )
    }

    override fun toString(): String =
        "TraceProcessIO{inputs=$inputsFn, outputs=$outputsFn, aggregator=$aggregatorFn}"
}
