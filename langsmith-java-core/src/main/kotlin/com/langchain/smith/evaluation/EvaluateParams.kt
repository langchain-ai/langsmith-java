package com.langchain.smith.evaluation

import com.langchain.smith.models.examples.Example

/** Configuration for [evaluate]. */
class EvaluateParams
private constructor(
    internal val data: EvaluateData,
    val evaluators: List<RunEvaluator>,
    val experimentPrefix: String,
    val experimentName: String?,
    val description: String?,
    val metadata: Map<String, Any>,
    val maxConcurrency: Int,
) {
    companion object {
        /** Creates a new [Builder]. */
        @JvmStatic fun builder() = Builder()
    }

    /** Builds [EvaluateParams] with sensible defaults. */
    class Builder internal constructor() {
        private var data: EvaluateData? = null
        private var evaluators: MutableList<RunEvaluator> = mutableListOf()
        private var experimentPrefix: String = DEFAULT_EXPERIMENT_PREFIX
        private var experimentName: String? = null
        private var description: String? = null
        private var metadata: Map<String, Any> = emptyMap()
        private var maxConcurrency: Int = 0

        /** Dataset name or ID whose examples will be evaluated. */
        fun data(datasetNameOrId: String) = apply {
            require(datasetNameOrId.isNotBlank()) { "datasetNameOrId must not be blank" }
            data = EvaluateData.Dataset(datasetNameOrId)
        }

        /** In-memory examples to evaluate (for example after creating a dataset locally). */
        fun data(examples: List<Example>) = apply {
            require(examples.isNotEmpty()) { "examples must not be empty" }
            data = EvaluateData.Examples(examples)
        }

        fun addEvaluator(evaluator: RunEvaluator) = apply { evaluators.add(evaluator) }

        fun evaluators(evaluators: List<RunEvaluator>) = apply {
            this.evaluators = evaluators.toMutableList()
        }

        /** Prefix used when generating a unique experiment name. */
        fun experimentPrefix(experimentPrefix: String) = apply {
            this.experimentPrefix = experimentPrefix
        }

        /** Explicit experiment name; overrides [experimentPrefix] when set. */
        fun experimentName(experimentName: String) = apply { this.experimentName = experimentName }

        fun description(description: String) = apply { this.description = description }

        fun metadata(metadata: Map<String, Any>) = apply { this.metadata = metadata }

        /**
         * Maximum number of examples to evaluate concurrently. `0` runs sequentially. Values
         * greater than `1` are not supported yet.
         */
        fun maxConcurrency(maxConcurrency: Int) = apply { this.maxConcurrency = maxConcurrency }

        fun build(): EvaluateParams {
            val resolvedData =
                data
                    ?: throw IllegalArgumentException(
                        "data is required (dataset name/id or examples)"
                    )
            require(evaluators.isNotEmpty()) { "at least one evaluator is required" }
            return EvaluateParams(
                data = resolvedData,
                evaluators = evaluators.toList(),
                experimentPrefix = experimentPrefix,
                experimentName = experimentName,
                description = description,
                metadata = metadata,
                maxConcurrency = maxConcurrency,
            )
        }
    }
}

internal sealed class EvaluateData {
    data class Dataset(val identifier: String) : EvaluateData()

    data class Examples(val examples: List<Example>) : EvaluateData()
}

internal const val DEFAULT_EXPERIMENT_PREFIX = "experiment"
