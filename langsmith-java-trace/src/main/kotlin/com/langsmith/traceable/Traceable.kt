package com.langsmith.traceable

import com.fasterxml.jackson.databind.ObjectMapper
import com.langsmith.runtree.EndOptions
import com.langsmith.runtree.RunTree
import com.langsmith.runtree.RunTreeConfig
import java.util.concurrent.CompletableFuture
import java.util.function.Function

data class TraceConfig(
    var name: String? = null,
    var runType: String? = null,
    var tags: List<String>? = null,
    var metadata: Map<String, Any>? = null,
    var projectName: String? = null
)

data class LangSmithExtra(var id: String?, var referenceExampleId: String?)

data class TraceableInput<T>(val input: T, val extra: LangSmithExtra? = null)

class Traceable {
    companion object {
        private val objectMapper = ObjectMapper()

        @JvmStatic
        /**
         * Traces the execution of a function with a provided dynamic configuration. Useful for
         * providing the run ID or other variables at invocation time.
         *
         * @param T The type of the input parameter of the function.
         * @param R The type of the return value of the function.
         * @param config The configuration for tracing.
         * @return The result of the traced function.
         */
        fun <T, R> traceWithConfig(
            function: Function<T, R>,
            config: TraceConfig? = null
        ): Function<TraceableInput<T>, R> {
            return Function { traceableInput -> processFun(function, traceableInput, config) }
        }

        @JvmStatic
        fun <T, R> traceWithConfig(function: Function<T, R>): Function<TraceableInput<T>, R> {
            return traceWithConfig(function, null)
        }

        @JvmStatic
        fun <T, R> trace(function: Function<T, R>, config: TraceConfig? = null): Function<T, R> {
            return Function { input ->
                // Wrap raw input in TraceableInput with no additional configuration
                val traceableInput = TraceableInput(input)

                val result = processFun(function, traceableInput, config)
                result
            }
        }

        @JvmStatic
        fun <T, R> trace(function: Function<T, R>): Function<T, R> {
            return trace(function, null)
        }

        @JvmStatic
        fun <T> withExtra(input: T, extra: LangSmithExtra?): TraceableInput<T> =
            TraceableInput(input, extra)

        private fun <T, R> processFun(
            function: Function<T, R>,
            traceableInput: TraceableInput<T>,
            config: TraceConfig?
        ): R {
            val traceConfig = config ?: TraceConfig()
            val builder =
                RunTreeConfig.builder()
                    .setName(traceConfig.name ?: function::class.simpleName ?: "Anonymous")
                    .setRunType(traceConfig.runType ?: "chain")
                    .setTags(traceConfig.tags ?: emptyList())

            traceConfig.metadata?.let { builder.addExtra("metadata", it) }

            traceConfig.projectName?.let { builder.setProjectName(it) }

            traceableInput.extra?.let { lsExtra ->
                lsExtra.id?.let { builder.setId(it) }
                lsExtra.referenceExampleId?.let { builder.setReferenceExampleId(it) }
                // TODO: Add dynamic tagging as well.
            }

            builder.setInputs(convertToMap(traceableInput.input))

            val builtConfig = builder.build()

            val runTree = RunTree.fromCurrentSpan(builtConfig)
            val postFuture = runTree.postRunAsync()

            try {
                val result = function.apply(traceableInput.input)
                runTree.end(EndOptions(outputs = convertToMap(result)))
                CompletableFuture.allOf(postFuture).join()
                return result
            } catch (e: Throwable) {
                runTree.end(EndOptions(errorMessage = e.toString()))
                CompletableFuture.allOf(postFuture).join()
                throw e
            }
        }

        private fun <T> convertToMap(obj: T): Map<String, Any> {
            val typeFactory = objectMapper.typeFactory
            val mapType =
                typeFactory.constructMapType(Map::class.java, String::class.java, Any::class.java)
            return objectMapper.convertValue(obj, mapType)
        }
    }
}
