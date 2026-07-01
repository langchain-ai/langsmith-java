package com.langchain.smith.evaluation

import com.langchain.smith.models.examples.Example

/** Configuration for [evaluate]. */
class EvaluateParams
private constructor(
    internal val data: EvaluateData,
    val evaluators: List<RunEvaluator>,
    val summaryEvaluators: List<SummaryEvaluator>,
    val experimentPrefix: String,
    val experimentName: String?,
    val experimentId: String?,
    val description: String?,
    val metadata: Map<String, Any>,
    val maxConcurrency: Int,
    val numRepetitions: Int,
    val uploadResults: Boolean,
    val errorHandling: EvaluateErrorHandling,
) {
    companion object {
        /** Creates a new [Builder]. */
        @JvmStatic fun builder() = Builder()
    }

    /** Builds [EvaluateParams] with sensible defaults. */
    class Builder internal constructor() {
        private var data: EvaluateData? = null
        private var evaluators: MutableList<RunEvaluator> = mutableListOf()
        private var summaryEvaluators: MutableList<SummaryEvaluator> = mutableListOf()
        private var experimentPrefix: String = DEFAULT_EXPERIMENT_PREFIX
        private var experimentName: String? = null
        private var experimentId: String? = null
        private var description: String? = null
        private var metadata: Map<String, Any> = emptyMap()
        private var maxConcurrency: Int = 0
        private var numRepetitions: Int = 1
        private var uploadResults: Boolean = true
        private var errorHandling: EvaluateErrorHandling = EvaluateErrorHandling.LOG

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

        fun addSummaryEvaluator(evaluator: SummaryEvaluator) = apply {
            summaryEvaluators.add(evaluator)
        }

        fun summaryEvaluators(evaluators: List<SummaryEvaluator>) = apply {
            summaryEvaluators = evaluators.toMutableList()
        }

        /** Prefix used when generating a unique experiment name. */
        fun experimentPrefix(experimentPrefix: String) = apply {
            this.experimentPrefix = experimentPrefix
        }

        /** Explicit experiment name; overrides [experimentPrefix] when set. */
        fun experimentName(experimentName: String) = apply { this.experimentName = experimentName }

        /**
         * Existing experiment session id to extend with additional runs. When set, a new session is
         * not created.
         */
        fun experimentId(experimentId: String) = apply { this.experimentId = experimentId }

        fun description(description: String) = apply { this.description = description }

        fun metadata(metadata: Map<String, Any>) = apply { this.metadata = metadata }

        /**
         * Maximum number of examples to evaluate concurrently. `0` runs sequentially. Values
         * greater than `0` use a fixed thread pool of that size.
         */
        fun maxConcurrency(maxConcurrency: Int) = apply {
            require(maxConcurrency >= 0) { "maxConcurrency must be >= 0" }
            this.maxConcurrency = maxConcurrency
        }

        /** Number of times to evaluate each dataset example. */
        fun numRepetitions(numRepetitions: Int) = apply {
            require(numRepetitions >= 1) { "numRepetitions must be >= 1" }
            this.numRepetitions = numRepetitions
        }

        /** When false, runs and feedback are kept local and not uploaded to LangSmith. */
        fun uploadResults(uploadResults: Boolean) = apply { this.uploadResults = uploadResults }

        fun errorHandling(errorHandling: EvaluateErrorHandling) = apply {
            this.errorHandling = errorHandling
        }

        fun build(): EvaluateParams {
            val resolvedData =
                data
                    ?: throw IllegalArgumentException(
                        "data is required (dataset name/id or examples)"
                    )
            require(evaluators.isNotEmpty() || summaryEvaluators.isNotEmpty()) {
                "at least one evaluator or summary evaluator is required"
            }
            require(experimentId == null || experimentName == null) {
                "experimentId and experimentName cannot both be set"
            }
            return EvaluateParams(
                data = resolvedData,
                evaluators = evaluators.toList(),
                summaryEvaluators = summaryEvaluators.toList(),
                experimentPrefix = experimentPrefix,
                experimentName = experimentName,
                experimentId = experimentId,
                description = description,
                metadata = metadata,
                maxConcurrency = maxConcurrency,
                numRepetitions = numRepetitions,
                uploadResults = uploadResults,
                errorHandling = errorHandling,
            )
        }
    }
}

internal sealed class EvaluateData {
    data class Dataset(val identifier: String) : EvaluateData()

    data class Examples(val examples: List<Example>) : EvaluateData()
}

internal const val DEFAULT_EXPERIMENT_PREFIX = "experiment"
