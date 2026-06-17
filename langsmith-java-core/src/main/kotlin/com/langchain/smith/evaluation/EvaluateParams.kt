package com.langchain.smith.evaluation

import com.langchain.smith.models.examples.Example
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Parameters for [ExperimentClient.evaluate]. */
class EvaluateParams
private constructor(
    private val data: String?,
    private val examples: List<Example>?,
    private val target: ExperimentTarget,
    private val evaluators: List<RunEvaluator>,
    private val experimentName: String?,
    private val experimentPrefix: String?,
    private val description: String?,
    private val metadata: Map<String, Any?>,
    private val tags: List<String>,
    private val maxConcurrency: Int,
    private val batchSize: Int,
    private val errorHandling: ErrorHandling,
) {

    fun data(): Optional<String> = Optional.ofNullable(data)

    fun examples(): Optional<List<Example>> = Optional.ofNullable(examples)

    fun target(): ExperimentTarget = target

    fun evaluators(): List<RunEvaluator> = evaluators

    fun experimentName(): Optional<String> = Optional.ofNullable(experimentName)

    fun experimentPrefix(): Optional<String> = Optional.ofNullable(experimentPrefix)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun metadata(): Map<String, Any?> = metadata

    fun tags(): List<String> = tags

    fun maxConcurrency(): Int = maxConcurrency

    fun batchSize(): Int = batchSize

    fun errorHandling(): ErrorHandling = errorHandling

    fun toBuilder(): Builder = Builder().from(this)

    companion object {

        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {

        private var data: String? = null
        private var examples: List<Example>? = null
        private var target: ExperimentTarget? = null
        private var evaluators: MutableList<RunEvaluator> = mutableListOf()
        private var experimentName: String? = null
        private var experimentPrefix: String? = null
        private var description: String? = null
        private var metadata: MutableMap<String, Any?> = mutableMapOf()
        private var tags: MutableList<String> = mutableListOf()
        private var maxConcurrency: Int = 0
        private var batchSize: Int = 100
        private var errorHandling: ErrorHandling = ErrorHandling.LOG

        internal fun from(params: EvaluateParams) = apply {
            data = params.data
            examples = params.examples
            target = params.target
            evaluators = params.evaluators.toMutableList()
            experimentName = params.experimentName
            experimentPrefix = params.experimentPrefix
            description = params.description
            metadata = params.metadata.toMutableMap()
            tags = params.tags.toMutableList()
            maxConcurrency = params.maxConcurrency
            batchSize = params.batchSize
            errorHandling = params.errorHandling
        }

        fun data(data: String?) = apply { this.data = data }

        fun data(data: Optional<String>) = data(data.getOrNull())

        fun examples(examples: Iterable<Example>?) = apply { this.examples = examples?.toList() }

        fun examples(examples: Optional<out Iterable<Example>>) = examples(examples.getOrNull())

        fun target(target: ExperimentTarget) = apply { this.target = target }

        fun evaluators(evaluators: Iterable<RunEvaluator>) = apply {
            this.evaluators = evaluators.toMutableList()
        }

        fun addEvaluator(evaluator: RunEvaluator) = apply { evaluators.add(evaluator) }

        fun experimentName(experimentName: String?) = apply { this.experimentName = experimentName }

        fun experimentName(experimentName: Optional<String>) =
            experimentName(experimentName.getOrNull())

        fun experimentPrefix(experimentPrefix: String?) = apply {
            this.experimentPrefix = experimentPrefix
        }

        fun experimentPrefix(experimentPrefix: Optional<String>) =
            experimentPrefix(experimentPrefix.getOrNull())

        fun description(description: String?) = apply { this.description = description }

        fun description(description: Optional<String>) = description(description.getOrNull())

        fun metadata(metadata: Map<String, Any?>) = apply {
            this.metadata.clear()
            putAllMetadata(metadata)
        }

        fun putMetadata(key: String, value: Any?) = apply { metadata[key] = value }

        fun putAllMetadata(metadata: Map<String, Any?>) = apply { this.metadata.putAll(metadata) }

        fun tags(tags: Iterable<String>) = apply { this.tags = tags.toMutableList() }

        fun addTag(tag: String) = apply { tags.add(tag) }

        fun maxConcurrency(maxConcurrency: Int) = apply {
            require(maxConcurrency >= 0) { "maxConcurrency must be greater than or equal to 0" }
            this.maxConcurrency = maxConcurrency
        }

        fun batchSize(batchSize: Int) = apply {
            require(batchSize > 0) { "batchSize must be greater than 0" }
            this.batchSize = batchSize
        }

        fun errorHandling(errorHandling: ErrorHandling) = apply {
            this.errorHandling = errorHandling
        }

        fun build(): EvaluateParams {
            require(data != null || examples != null) { "Either data or examples must be set" }
            require(data == null || examples == null) { "Only one of data or examples may be set" }
            require(!data.isNullOrBlank() || examples != null) { "data must not be blank" }
            return EvaluateParams(
                data = data,
                examples = examples,
                target = requireNotNull(target) { "target must be set" },
                evaluators = evaluators.toList(),
                experimentName = experimentName,
                experimentPrefix = experimentPrefix,
                description = description,
                metadata = metadata.toMap(),
                tags = tags.toList(),
                maxConcurrency = maxConcurrency,
                batchSize = batchSize,
                errorHandling = errorHandling,
            )
        }
    }
}

enum class ErrorHandling {
    LOG,
    IGNORE,
}
