package com.langchain.smith.evaluation

/** Configuration for [evaluateExisting]. */
class EvaluateExistingParams
private constructor(
    val evaluators: List<RunEvaluator>,
    val summaryEvaluators: List<SummaryEvaluator>,
    val metadata: Map<String, Any>,
    val maxConcurrency: Int,
    val loadNested: Boolean,
) {
    companion object {
        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {
        private var evaluators: MutableList<RunEvaluator> = mutableListOf()
        private var summaryEvaluators: MutableList<SummaryEvaluator> = mutableListOf()
        private var metadata: Map<String, Any> = emptyMap()
        private var maxConcurrency: Int = 0
        private var loadNested: Boolean = false

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

        fun metadata(metadata: Map<String, Any>) = apply { this.metadata = metadata }

        fun maxConcurrency(maxConcurrency: Int) = apply {
            require(maxConcurrency >= 0) { "maxConcurrency must be >= 0" }
            this.maxConcurrency = maxConcurrency
        }

        fun loadNested(loadNested: Boolean) = apply { this.loadNested = loadNested }

        fun build(): EvaluateExistingParams {
            require(evaluators.isNotEmpty() || summaryEvaluators.isNotEmpty()) {
                "at least one evaluator or summary evaluator is required"
            }
            return EvaluateExistingParams(
                evaluators = evaluators.toList(),
                summaryEvaluators = summaryEvaluators.toList(),
                metadata = metadata,
                maxConcurrency = maxConcurrency,
                loadNested = loadNested,
            )
        }
    }
}
