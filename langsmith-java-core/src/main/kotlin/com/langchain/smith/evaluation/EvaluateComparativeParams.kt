package com.langchain.smith.evaluation

/** Configuration for [evaluateComparative]. */
class EvaluateComparativeParams
private constructor(
    val evaluators: List<ComparativeEvaluator>,
    val experimentPrefix: String?,
    val description: String?,
    val metadata: Map<String, Any>,
    val maxConcurrency: Int,
    val loadNested: Boolean,
    val randomizeOrder: Boolean,
) {
    companion object {
        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {
        private var evaluators: MutableList<ComparativeEvaluator> = mutableListOf()
        private var experimentPrefix: String? = null
        private var description: String? = null
        private var metadata: Map<String, Any> = emptyMap()
        private var maxConcurrency: Int = 5
        private var loadNested: Boolean = false
        private var randomizeOrder: Boolean = false

        fun addEvaluator(evaluator: ComparativeEvaluator) = apply { evaluators.add(evaluator) }

        fun evaluators(evaluators: List<ComparativeEvaluator>) = apply {
            this.evaluators = evaluators.toMutableList()
        }

        fun experimentPrefix(experimentPrefix: String) = apply {
            this.experimentPrefix = experimentPrefix
        }

        fun description(description: String) = apply { this.description = description }

        fun metadata(metadata: Map<String, Any>) = apply { this.metadata = metadata }

        fun maxConcurrency(maxConcurrency: Int) = apply {
            require(maxConcurrency >= 0) { "maxConcurrency must be >= 0" }
            this.maxConcurrency = maxConcurrency
        }

        fun loadNested(loadNested: Boolean) = apply { this.loadNested = loadNested }

        fun randomizeOrder(randomizeOrder: Boolean) = apply { this.randomizeOrder = randomizeOrder }

        fun build(): EvaluateComparativeParams {
            require(evaluators.isNotEmpty()) { "at least one comparative evaluator is required" }
            return EvaluateComparativeParams(
                evaluators = evaluators.toList(),
                experimentPrefix = experimentPrefix,
                description = description,
                metadata = metadata,
                maxConcurrency = maxConcurrency,
                loadNested = loadNested,
                randomizeOrder = randomizeOrder,
            )
        }
    }
}
