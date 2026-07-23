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

class CreateOnlineLlmEvaluatorRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val commitHashOrTag: JsonField<String>,
    private val playgroundSettingsId: JsonField<String>,
    private val promptRepoHandle: JsonField<String>,
    private val variableMapping: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("commit_hash_or_tag")
        @ExcludeMissing
        commitHashOrTag: JsonField<String> = JsonMissing.of(),
        @JsonProperty("playground_settings_id")
        @ExcludeMissing
        playgroundSettingsId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt_repo_handle")
        @ExcludeMissing
        promptRepoHandle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("variable_mapping")
        @ExcludeMissing
        variableMapping: JsonValue = JsonMissing.of(),
    ) : this(
        commitHashOrTag,
        playgroundSettingsId,
        promptRepoHandle,
        variableMapping,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitHashOrTag(): Optional<String> = commitHashOrTag.getOptional("commit_hash_or_tag")

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
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = createOnlineLlmEvaluatorRequest.variableMapping().convert(MyClass.class);
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
         * [CreateOnlineLlmEvaluatorRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreateOnlineLlmEvaluatorRequest]. */
    class Builder internal constructor() {

        private var commitHashOrTag: JsonField<String> = JsonMissing.of()
        private var playgroundSettingsId: JsonField<String> = JsonMissing.of()
        private var promptRepoHandle: JsonField<String> = JsonMissing.of()
        private var variableMapping: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createOnlineLlmEvaluatorRequest: CreateOnlineLlmEvaluatorRequest) =
            apply {
                commitHashOrTag = createOnlineLlmEvaluatorRequest.commitHashOrTag
                playgroundSettingsId = createOnlineLlmEvaluatorRequest.playgroundSettingsId
                promptRepoHandle = createOnlineLlmEvaluatorRequest.promptRepoHandle
                variableMapping = createOnlineLlmEvaluatorRequest.variableMapping
                additionalProperties =
                    createOnlineLlmEvaluatorRequest.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CreateOnlineLlmEvaluatorRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CreateOnlineLlmEvaluatorRequest =
            CreateOnlineLlmEvaluatorRequest(
                commitHashOrTag,
                playgroundSettingsId,
                promptRepoHandle,
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
    fun validate(): CreateOnlineLlmEvaluatorRequest = apply {
        if (validated) {
            return@apply
        }

        commitHashOrTag()
        playgroundSettingsId()
        promptRepoHandle()
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
            (if (playgroundSettingsId.asKnown().isPresent) 1 else 0) +
            (if (promptRepoHandle.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateOnlineLlmEvaluatorRequest &&
            commitHashOrTag == other.commitHashOrTag &&
            playgroundSettingsId == other.playgroundSettingsId &&
            promptRepoHandle == other.promptRepoHandle &&
            variableMapping == other.variableMapping &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            commitHashOrTag,
            playgroundSettingsId,
            promptRepoHandle,
            variableMapping,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateOnlineLlmEvaluatorRequest{commitHashOrTag=$commitHashOrTag, playgroundSettingsId=$playgroundSettingsId, promptRepoHandle=$promptRepoHandle, variableMapping=$variableMapping, additionalProperties=$additionalProperties}"
}
