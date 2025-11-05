// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PromptimConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val autoCommit: JsonField<Boolean>,
    private val datasetName: JsonField<String>,
    private val devSplit: JsonField<String>,
    private val evaluators: JsonField<List<String>>,
    private val messageIndex: JsonField<Long>,
    private val numEpochs: JsonField<Long>,
    private val taskDescription: JsonField<String>,
    private val testSplit: JsonField<String>,
    private val trainSplit: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("auto_commit")
        @ExcludeMissing
        autoCommit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("dataset_name")
        @ExcludeMissing
        datasetName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dev_split") @ExcludeMissing devSplit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluators")
        @ExcludeMissing
        evaluators: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("message_index")
        @ExcludeMissing
        messageIndex: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("num_epochs") @ExcludeMissing numEpochs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("task_description")
        @ExcludeMissing
        taskDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("test_split") @ExcludeMissing testSplit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("train_split")
        @ExcludeMissing
        trainSplit: JsonField<String> = JsonMissing.of(),
    ) : this(
        autoCommit,
        datasetName,
        devSplit,
        evaluators,
        messageIndex,
        numEpochs,
        taskDescription,
        testSplit,
        trainSplit,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun autoCommit(): Boolean = autoCommit.getRequired("auto_commit")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasetName(): String = datasetName.getRequired("dataset_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun devSplit(): Optional<String> = devSplit.getOptional("dev_split")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun evaluators(): List<String> = evaluators.getRequired("evaluators")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageIndex(): Long = messageIndex.getRequired("message_index")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numEpochs(): Long = numEpochs.getRequired("num_epochs")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taskDescription(): String = taskDescription.getRequired("task_description")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun testSplit(): Optional<String> = testSplit.getOptional("test_split")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trainSplit(): Optional<String> = trainSplit.getOptional("train_split")

    /**
     * Returns the raw JSON value of [autoCommit].
     *
     * Unlike [autoCommit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auto_commit") @ExcludeMissing fun _autoCommit(): JsonField<Boolean> = autoCommit

    /**
     * Returns the raw JSON value of [datasetName].
     *
     * Unlike [datasetName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset_name")
    @ExcludeMissing
    fun _datasetName(): JsonField<String> = datasetName

    /**
     * Returns the raw JSON value of [devSplit].
     *
     * Unlike [devSplit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dev_split") @ExcludeMissing fun _devSplit(): JsonField<String> = devSplit

    /**
     * Returns the raw JSON value of [evaluators].
     *
     * Unlike [evaluators], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evaluators")
    @ExcludeMissing
    fun _evaluators(): JsonField<List<String>> = evaluators

    /**
     * Returns the raw JSON value of [messageIndex].
     *
     * Unlike [messageIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_index")
    @ExcludeMissing
    fun _messageIndex(): JsonField<Long> = messageIndex

    /**
     * Returns the raw JSON value of [numEpochs].
     *
     * Unlike [numEpochs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_epochs") @ExcludeMissing fun _numEpochs(): JsonField<Long> = numEpochs

    /**
     * Returns the raw JSON value of [taskDescription].
     *
     * Unlike [taskDescription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("task_description")
    @ExcludeMissing
    fun _taskDescription(): JsonField<String> = taskDescription

    /**
     * Returns the raw JSON value of [testSplit].
     *
     * Unlike [testSplit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("test_split") @ExcludeMissing fun _testSplit(): JsonField<String> = testSplit

    /**
     * Returns the raw JSON value of [trainSplit].
     *
     * Unlike [trainSplit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("train_split") @ExcludeMissing fun _trainSplit(): JsonField<String> = trainSplit

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PromptimConfig].
         *
         * The following fields are required:
         * ```java
         * .autoCommit()
         * .datasetName()
         * .devSplit()
         * .evaluators()
         * .messageIndex()
         * .numEpochs()
         * .taskDescription()
         * .testSplit()
         * .trainSplit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PromptimConfig]. */
    class Builder internal constructor() {

        private var autoCommit: JsonField<Boolean>? = null
        private var datasetName: JsonField<String>? = null
        private var devSplit: JsonField<String>? = null
        private var evaluators: JsonField<MutableList<String>>? = null
        private var messageIndex: JsonField<Long>? = null
        private var numEpochs: JsonField<Long>? = null
        private var taskDescription: JsonField<String>? = null
        private var testSplit: JsonField<String>? = null
        private var trainSplit: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(promptimConfig: PromptimConfig) = apply {
            autoCommit = promptimConfig.autoCommit
            datasetName = promptimConfig.datasetName
            devSplit = promptimConfig.devSplit
            evaluators = promptimConfig.evaluators.map { it.toMutableList() }
            messageIndex = promptimConfig.messageIndex
            numEpochs = promptimConfig.numEpochs
            taskDescription = promptimConfig.taskDescription
            testSplit = promptimConfig.testSplit
            trainSplit = promptimConfig.trainSplit
            additionalProperties = promptimConfig.additionalProperties.toMutableMap()
        }

        fun autoCommit(autoCommit: Boolean) = autoCommit(JsonField.of(autoCommit))

        /**
         * Sets [Builder.autoCommit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoCommit] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoCommit(autoCommit: JsonField<Boolean>) = apply { this.autoCommit = autoCommit }

        fun datasetName(datasetName: String) = datasetName(JsonField.of(datasetName))

        /**
         * Sets [Builder.datasetName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetName(datasetName: JsonField<String>) = apply { this.datasetName = datasetName }

        fun devSplit(devSplit: String?) = devSplit(JsonField.ofNullable(devSplit))

        /** Alias for calling [Builder.devSplit] with `devSplit.orElse(null)`. */
        fun devSplit(devSplit: Optional<String>) = devSplit(devSplit.getOrNull())

        /**
         * Sets [Builder.devSplit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.devSplit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun devSplit(devSplit: JsonField<String>) = apply { this.devSplit = devSplit }

        fun evaluators(evaluators: List<String>) = evaluators(JsonField.of(evaluators))

        /**
         * Sets [Builder.evaluators] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluators] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evaluators(evaluators: JsonField<List<String>>) = apply {
            this.evaluators = evaluators.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [evaluators].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvaluator(evaluator: String) = apply {
            evaluators =
                (evaluators ?: JsonField.of(mutableListOf())).also {
                    checkKnown("evaluators", it).add(evaluator)
                }
        }

        fun messageIndex(messageIndex: Long) = messageIndex(JsonField.of(messageIndex))

        /**
         * Sets [Builder.messageIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageIndex] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messageIndex(messageIndex: JsonField<Long>) = apply { this.messageIndex = messageIndex }

        fun numEpochs(numEpochs: Long) = numEpochs(JsonField.of(numEpochs))

        /**
         * Sets [Builder.numEpochs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numEpochs] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numEpochs(numEpochs: JsonField<Long>) = apply { this.numEpochs = numEpochs }

        fun taskDescription(taskDescription: String) =
            taskDescription(JsonField.of(taskDescription))

        /**
         * Sets [Builder.taskDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taskDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taskDescription(taskDescription: JsonField<String>) = apply {
            this.taskDescription = taskDescription
        }

        fun testSplit(testSplit: String?) = testSplit(JsonField.ofNullable(testSplit))

        /** Alias for calling [Builder.testSplit] with `testSplit.orElse(null)`. */
        fun testSplit(testSplit: Optional<String>) = testSplit(testSplit.getOrNull())

        /**
         * Sets [Builder.testSplit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testSplit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun testSplit(testSplit: JsonField<String>) = apply { this.testSplit = testSplit }

        fun trainSplit(trainSplit: String?) = trainSplit(JsonField.ofNullable(trainSplit))

        /** Alias for calling [Builder.trainSplit] with `trainSplit.orElse(null)`. */
        fun trainSplit(trainSplit: Optional<String>) = trainSplit(trainSplit.getOrNull())

        /**
         * Sets [Builder.trainSplit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trainSplit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trainSplit(trainSplit: JsonField<String>) = apply { this.trainSplit = trainSplit }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [PromptimConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .autoCommit()
         * .datasetName()
         * .devSplit()
         * .evaluators()
         * .messageIndex()
         * .numEpochs()
         * .taskDescription()
         * .testSplit()
         * .trainSplit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PromptimConfig =
            PromptimConfig(
                checkRequired("autoCommit", autoCommit),
                checkRequired("datasetName", datasetName),
                checkRequired("devSplit", devSplit),
                checkRequired("evaluators", evaluators).map { it.toImmutable() },
                checkRequired("messageIndex", messageIndex),
                checkRequired("numEpochs", numEpochs),
                checkRequired("taskDescription", taskDescription),
                checkRequired("testSplit", testSplit),
                checkRequired("trainSplit", trainSplit),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PromptimConfig = apply {
        if (validated) {
            return@apply
        }

        autoCommit()
        datasetName()
        devSplit()
        evaluators()
        messageIndex()
        numEpochs()
        taskDescription()
        testSplit()
        trainSplit()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangChainInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (autoCommit.asKnown().isPresent) 1 else 0) +
            (if (datasetName.asKnown().isPresent) 1 else 0) +
            (if (devSplit.asKnown().isPresent) 1 else 0) +
            (evaluators.asKnown().getOrNull()?.size ?: 0) +
            (if (messageIndex.asKnown().isPresent) 1 else 0) +
            (if (numEpochs.asKnown().isPresent) 1 else 0) +
            (if (taskDescription.asKnown().isPresent) 1 else 0) +
            (if (testSplit.asKnown().isPresent) 1 else 0) +
            (if (trainSplit.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PromptimConfig &&
            autoCommit == other.autoCommit &&
            datasetName == other.datasetName &&
            devSplit == other.devSplit &&
            evaluators == other.evaluators &&
            messageIndex == other.messageIndex &&
            numEpochs == other.numEpochs &&
            taskDescription == other.taskDescription &&
            testSplit == other.testSplit &&
            trainSplit == other.trainSplit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            autoCommit,
            datasetName,
            devSplit,
            evaluators,
            messageIndex,
            numEpochs,
            taskDescription,
            testSplit,
            trainSplit,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PromptimConfig{autoCommit=$autoCommit, datasetName=$datasetName, devSplit=$devSplit, evaluators=$evaluators, messageIndex=$messageIndex, numEpochs=$numEpochs, taskDescription=$taskDescription, testSplit=$testSplit, trainSplit=$trainSplit, additionalProperties=$additionalProperties}"
}
