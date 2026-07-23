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

class UpdateOnlineLlmEvaluatorRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val commitHashOrTag: JsonField<String>,
    private val numFewShotExamples: JsonField<Long>,
    private val playgroundSettingsId: JsonField<String>,
    private val promptRepoHandle: JsonField<String>,
    private val useCorrectionsDataset: JsonField<Boolean>,
    private val variableMapping: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("commit_hash_or_tag")
        @ExcludeMissing
        commitHashOrTag: JsonField<String> = JsonMissing.of(),
        @JsonProperty("num_few_shot_examples")
        @ExcludeMissing
        numFewShotExamples: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("playground_settings_id")
        @ExcludeMissing
        playgroundSettingsId: JsonField<String> = JsonMissing.of(),
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
        commitHashOrTag,
        numFewShotExamples,
        playgroundSettingsId,
        promptRepoHandle,
        useCorrectionsDataset,
        variableMapping,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitHashOrTag(): Optional<String> = commitHashOrTag.getOptional("commit_hash_or_tag")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numFewShotExamples(): Optional<Long> =
        numFewShotExamples.getOptional("num_few_shot_examples")

    /**
     * Model Configuration ID
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun playgroundSettingsId(): Optional<String> =
        playgroundSettingsId.getOptional("playground_settings_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptRepoHandle(): Optional<String> = promptRepoHandle.getOptional("prompt_repo_handle")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useCorrectionsDataset(): Optional<Boolean> =
        useCorrectionsDataset.getOptional("use_corrections_dataset")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = updateOnlineLlmEvaluatorRequest.variableMapping().convert(MyClass.class);
     * ```
     */
    @JsonProperty("variable_mapping")
    @ExcludeMissing
    fun _variableMapping(): JsonValue = variableMapping

    /**
     * Returns the raw JSON value of [commitHashOrTag].
     *
     * Unlike [commitHashOrTag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commit_hash_or_tag")
    @ExcludeMissing
    fun _commitHashOrTag(): JsonField<String> = commitHashOrTag

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
     * Returns the raw JSON value of [playgroundSettingsId].
     *
     * Unlike [playgroundSettingsId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("playground_settings_id")
    @ExcludeMissing
    fun _playgroundSettingsId(): JsonField<String> = playgroundSettingsId

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [UpdateOnlineLlmEvaluatorRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdateOnlineLlmEvaluatorRequest]. */
    class Builder internal constructor() {

        private var commitHashOrTag: JsonField<String> = JsonMissing.of()
        private var numFewShotExamples: JsonField<Long> = JsonMissing.of()
        private var playgroundSettingsId: JsonField<String> = JsonMissing.of()
        private var promptRepoHandle: JsonField<String> = JsonMissing.of()
        private var useCorrectionsDataset: JsonField<Boolean> = JsonMissing.of()
        private var variableMapping: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateOnlineLlmEvaluatorRequest: UpdateOnlineLlmEvaluatorRequest) =
            apply {
                commitHashOrTag = updateOnlineLlmEvaluatorRequest.commitHashOrTag
                numFewShotExamples = updateOnlineLlmEvaluatorRequest.numFewShotExamples
                playgroundSettingsId = updateOnlineLlmEvaluatorRequest.playgroundSettingsId
                promptRepoHandle = updateOnlineLlmEvaluatorRequest.promptRepoHandle
                useCorrectionsDataset = updateOnlineLlmEvaluatorRequest.useCorrectionsDataset
                variableMapping = updateOnlineLlmEvaluatorRequest.variableMapping
                additionalProperties =
                    updateOnlineLlmEvaluatorRequest.additionalProperties.toMutableMap()
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

        /** Model Configuration ID */
        fun playgroundSettingsId(playgroundSettingsId: String) =
            playgroundSettingsId(JsonField.of(playgroundSettingsId))

        /**
         * Sets [Builder.playgroundSettingsId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.playgroundSettingsId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun playgroundSettingsId(playgroundSettingsId: JsonField<String>) = apply {
            this.playgroundSettingsId = playgroundSettingsId
        }

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
         * Returns an immutable instance of [UpdateOnlineLlmEvaluatorRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UpdateOnlineLlmEvaluatorRequest =
            UpdateOnlineLlmEvaluatorRequest(
                commitHashOrTag,
                numFewShotExamples,
                playgroundSettingsId,
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
    fun validate(): UpdateOnlineLlmEvaluatorRequest = apply {
        if (validated) {
            return@apply
        }

        commitHashOrTag()
        numFewShotExamples()
        playgroundSettingsId()
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
        (if (commitHashOrTag.asKnown().isPresent) 1 else 0) +
            (if (numFewShotExamples.asKnown().isPresent) 1 else 0) +
            (if (playgroundSettingsId.asKnown().isPresent) 1 else 0) +
            (if (promptRepoHandle.asKnown().isPresent) 1 else 0) +
            (if (useCorrectionsDataset.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateOnlineLlmEvaluatorRequest &&
            commitHashOrTag == other.commitHashOrTag &&
            numFewShotExamples == other.numFewShotExamples &&
            playgroundSettingsId == other.playgroundSettingsId &&
            promptRepoHandle == other.promptRepoHandle &&
            useCorrectionsDataset == other.useCorrectionsDataset &&
            variableMapping == other.variableMapping &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            commitHashOrTag,
            numFewShotExamples,
            playgroundSettingsId,
            promptRepoHandle,
            useCorrectionsDataset,
            variableMapping,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateOnlineLlmEvaluatorRequest{commitHashOrTag=$commitHashOrTag, numFewShotExamples=$numFewShotExamples, playgroundSettingsId=$playgroundSettingsId, promptRepoHandle=$promptRepoHandle, useCorrectionsDataset=$useCorrectionsDataset, variableMapping=$variableMapping, additionalProperties=$additionalProperties}"
}
