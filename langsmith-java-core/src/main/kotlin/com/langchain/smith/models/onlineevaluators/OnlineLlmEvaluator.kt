// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class OnlineLlmEvaluator
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val annotationQueueId: JsonField<String>,
    private val commitHashOrTag: JsonField<String>,
    private val correctionsDatasetId: JsonField<String>,
    private val evaluatorId: JsonField<String>,
    private val numFewShotExamples: JsonField<Long>,
    private val promptId: JsonField<String>,
    private val promptRepoHandle: JsonField<String>,
    private val useCorrectionsDataset: JsonField<Boolean>,
    private val variableMapping: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("annotation_queue_id")
        @ExcludeMissing
        annotationQueueId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commit_hash_or_tag")
        @ExcludeMissing
        commitHashOrTag: JsonField<String> = JsonMissing.of(),
        @JsonProperty("corrections_dataset_id")
        @ExcludeMissing
        correctionsDatasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluator_id")
        @ExcludeMissing
        evaluatorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("num_few_shot_examples")
        @ExcludeMissing
        numFewShotExamples: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("prompt_id") @ExcludeMissing promptId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_repo_handle")
        @ExcludeMissing
        promptRepoHandle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("use_corrections_dataset")
        @ExcludeMissing
        useCorrectionsDataset: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("variable_mapping")
        @ExcludeMissing
        variableMapping: JsonValue = JsonMissing.of(),
    ) : this(
        annotationQueueId,
        commitHashOrTag,
        correctionsDatasetId,
        evaluatorId,
        numFewShotExamples,
        promptId,
        promptRepoHandle,
        useCorrectionsDataset,
        variableMapping,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun annotationQueueId(): Optional<String> = annotationQueueId.getOptional("annotation_queue_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitHashOrTag(): Optional<String> = commitHashOrTag.getOptional("commit_hash_or_tag")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun correctionsDatasetId(): Optional<String> =
        correctionsDatasetId.getOptional("corrections_dataset_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluatorId(): Optional<String> = evaluatorId.getOptional("evaluator_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numFewShotExamples(): Optional<Long> =
        numFewShotExamples.getOptional("num_few_shot_examples")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptId(): Optional<String> = promptId.getOptional("prompt_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptRepoHandle(): Optional<String> = promptRepoHandle.getOptional("prompt_repo_handle")

    /**
     * Derived from the evaluator's run rules — shared across all rules on this evaluator. Nil when
     * the evaluator has no run rules.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useCorrectionsDataset(): Optional<Boolean> =
        useCorrectionsDataset.getOptional("use_corrections_dataset")

    /**
     * JSONB
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = onlineLlmEvaluator.variableMapping().convert(MyClass.class);
     * ```
     */
    @JsonProperty("variable_mapping")
    @ExcludeMissing
    fun _variableMapping(): JsonValue = variableMapping

    /**
     * Returns the raw JSON value of [annotationQueueId].
     *
     * Unlike [annotationQueueId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("annotation_queue_id")
    @ExcludeMissing
    fun _annotationQueueId(): JsonField<String> = annotationQueueId

    /**
     * Returns the raw JSON value of [commitHashOrTag].
     *
     * Unlike [commitHashOrTag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commit_hash_or_tag")
    @ExcludeMissing
    fun _commitHashOrTag(): JsonField<String> = commitHashOrTag

    /**
     * Returns the raw JSON value of [correctionsDatasetId].
     *
     * Unlike [correctionsDatasetId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("corrections_dataset_id")
    @ExcludeMissing
    fun _correctionsDatasetId(): JsonField<String> = correctionsDatasetId

    /**
     * Returns the raw JSON value of [evaluatorId].
     *
     * Unlike [evaluatorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evaluator_id")
    @ExcludeMissing
    fun _evaluatorId(): JsonField<String> = evaluatorId

    /**
     * Returns the raw JSON value of [numFewShotExamples].
     *
     * Unlike [numFewShotExamples], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("num_few_shot_examples")
    @ExcludeMissing
    fun _numFewShotExamples(): JsonField<Long> = numFewShotExamples

    /**
     * Returns the raw JSON value of [promptId].
     *
     * Unlike [promptId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_id") @ExcludeMissing fun _promptId(): JsonField<String> = promptId

    /**
     * Returns the raw JSON value of [promptRepoHandle].
     *
     * Unlike [promptRepoHandle], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("prompt_repo_handle")
    @ExcludeMissing
    fun _promptRepoHandle(): JsonField<String> = promptRepoHandle

    /**
     * Returns the raw JSON value of [useCorrectionsDataset].
     *
     * Unlike [useCorrectionsDataset], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("use_corrections_dataset")
    @ExcludeMissing
    fun _useCorrectionsDataset(): JsonField<Boolean> = useCorrectionsDataset

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

        /** Returns a mutable builder for constructing an instance of [OnlineLlmEvaluator]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnlineLlmEvaluator]. */
    class Builder internal constructor() {

        private var annotationQueueId: JsonField<String> = JsonMissing.of()
        private var commitHashOrTag: JsonField<String> = JsonMissing.of()
        private var correctionsDatasetId: JsonField<String> = JsonMissing.of()
        private var evaluatorId: JsonField<String> = JsonMissing.of()
        private var numFewShotExamples: JsonField<Long> = JsonMissing.of()
        private var promptId: JsonField<String> = JsonMissing.of()
        private var promptRepoHandle: JsonField<String> = JsonMissing.of()
        private var useCorrectionsDataset: JsonField<Boolean> = JsonMissing.of()
        private var variableMapping: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onlineLlmEvaluator: OnlineLlmEvaluator) = apply {
            annotationQueueId = onlineLlmEvaluator.annotationQueueId
            commitHashOrTag = onlineLlmEvaluator.commitHashOrTag
            correctionsDatasetId = onlineLlmEvaluator.correctionsDatasetId
            evaluatorId = onlineLlmEvaluator.evaluatorId
            numFewShotExamples = onlineLlmEvaluator.numFewShotExamples
            promptId = onlineLlmEvaluator.promptId
            promptRepoHandle = onlineLlmEvaluator.promptRepoHandle
            useCorrectionsDataset = onlineLlmEvaluator.useCorrectionsDataset
            variableMapping = onlineLlmEvaluator.variableMapping
            additionalProperties = onlineLlmEvaluator.additionalProperties.toMutableMap()
        }

        fun annotationQueueId(annotationQueueId: String) =
            annotationQueueId(JsonField.of(annotationQueueId))

        /**
         * Sets [Builder.annotationQueueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.annotationQueueId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun annotationQueueId(annotationQueueId: JsonField<String>) = apply {
            this.annotationQueueId = annotationQueueId
        }

        fun commitHashOrTag(commitHashOrTag: String) =
            commitHashOrTag(JsonField.of(commitHashOrTag))

        /**
         * Sets [Builder.commitHashOrTag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commitHashOrTag] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commitHashOrTag(commitHashOrTag: JsonField<String>) = apply {
            this.commitHashOrTag = commitHashOrTag
        }

        fun correctionsDatasetId(correctionsDatasetId: String) =
            correctionsDatasetId(JsonField.of(correctionsDatasetId))

        /**
         * Sets [Builder.correctionsDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correctionsDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun correctionsDatasetId(correctionsDatasetId: JsonField<String>) = apply {
            this.correctionsDatasetId = correctionsDatasetId
        }

        fun evaluatorId(evaluatorId: String) = evaluatorId(JsonField.of(evaluatorId))

        /**
         * Sets [Builder.evaluatorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluatorId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun evaluatorId(evaluatorId: JsonField<String>) = apply { this.evaluatorId = evaluatorId }

        fun numFewShotExamples(numFewShotExamples: Long) =
            numFewShotExamples(JsonField.of(numFewShotExamples))

        /**
         * Sets [Builder.numFewShotExamples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numFewShotExamples] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numFewShotExamples(numFewShotExamples: JsonField<Long>) = apply {
            this.numFewShotExamples = numFewShotExamples
        }

        fun promptId(promptId: String) = promptId(JsonField.of(promptId))

        /**
         * Sets [Builder.promptId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun promptId(promptId: JsonField<String>) = apply { this.promptId = promptId }

        fun promptRepoHandle(promptRepoHandle: String) =
            promptRepoHandle(JsonField.of(promptRepoHandle))

        /**
         * Sets [Builder.promptRepoHandle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptRepoHandle] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun promptRepoHandle(promptRepoHandle: JsonField<String>) = apply {
            this.promptRepoHandle = promptRepoHandle
        }

        /**
         * Derived from the evaluator's run rules — shared across all rules on this evaluator. Nil
         * when the evaluator has no run rules.
         */
        fun useCorrectionsDataset(useCorrectionsDataset: Boolean) =
            useCorrectionsDataset(JsonField.of(useCorrectionsDataset))

        /**
         * Sets [Builder.useCorrectionsDataset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useCorrectionsDataset] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useCorrectionsDataset(useCorrectionsDataset: JsonField<Boolean>) = apply {
            this.useCorrectionsDataset = useCorrectionsDataset
        }

        /** JSONB */
        fun variableMapping(variableMapping: JsonValue) = apply {
            this.variableMapping = variableMapping
        }

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
         * Returns an immutable instance of [OnlineLlmEvaluator].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OnlineLlmEvaluator =
            OnlineLlmEvaluator(
                annotationQueueId,
                commitHashOrTag,
                correctionsDatasetId,
                evaluatorId,
                numFewShotExamples,
                promptId,
                promptRepoHandle,
                useCorrectionsDataset,
                variableMapping,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LangChainInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): OnlineLlmEvaluator = apply {
        if (validated) {
            return@apply
        }

        annotationQueueId()
        commitHashOrTag()
        correctionsDatasetId()
        evaluatorId()
        numFewShotExamples()
        promptId()
        promptRepoHandle()
        useCorrectionsDataset()
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
        (if (annotationQueueId.asKnown().isPresent) 1 else 0) +
            (if (commitHashOrTag.asKnown().isPresent) 1 else 0) +
            (if (correctionsDatasetId.asKnown().isPresent) 1 else 0) +
            (if (evaluatorId.asKnown().isPresent) 1 else 0) +
            (if (numFewShotExamples.asKnown().isPresent) 1 else 0) +
            (if (promptId.asKnown().isPresent) 1 else 0) +
            (if (promptRepoHandle.asKnown().isPresent) 1 else 0) +
            (if (useCorrectionsDataset.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnlineLlmEvaluator &&
            annotationQueueId == other.annotationQueueId &&
            commitHashOrTag == other.commitHashOrTag &&
            correctionsDatasetId == other.correctionsDatasetId &&
            evaluatorId == other.evaluatorId &&
            numFewShotExamples == other.numFewShotExamples &&
            promptId == other.promptId &&
            promptRepoHandle == other.promptRepoHandle &&
            useCorrectionsDataset == other.useCorrectionsDataset &&
            variableMapping == other.variableMapping &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            annotationQueueId,
            commitHashOrTag,
            correctionsDatasetId,
            evaluatorId,
            numFewShotExamples,
            promptId,
            promptRepoHandle,
            useCorrectionsDataset,
            variableMapping,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OnlineLlmEvaluator{annotationQueueId=$annotationQueueId, commitHashOrTag=$commitHashOrTag, correctionsDatasetId=$correctionsDatasetId, evaluatorId=$evaluatorId, numFewShotExamples=$numFewShotExamples, promptId=$promptId, promptRepoHandle=$promptRepoHandle, useCorrectionsDataset=$useCorrectionsDataset, variableMapping=$variableMapping, additionalProperties=$additionalProperties}"
}
