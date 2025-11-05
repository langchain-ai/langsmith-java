// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.prompts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Usage metadata for a message, such as token counts.
 *
 * This is a standard representation of token usage that is consistent across models.
 *
 * Example:
 *
 *     ```python
 *     {
 *         "input_tokens": 350,
 *         "output_tokens": 240,
 *         "total_tokens": 590,
 *         "input_token_details": {
 *             "audio": 10,
 *             "cache_creation": 200,
 *             "cache_read": 100,
 *         },
 *         "output_token_details": {
 *             "audio": 10,
 *             "reasoning": 200,
 *         },
 *     }
 *     ```
 *
 * !!! warning "Behavior changed in 0.3.9" Added `input_token_details` and `output_token_details`.
 */
class UsageMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val inputTokens: JsonField<Long>,
    private val outputTokens: JsonField<Long>,
    private val totalTokens: JsonField<Long>,
    private val inputTokenDetails: JsonField<InputTokenDetails>,
    private val outputTokenDetails: JsonField<OutputTokenDetails>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("input_tokens")
        @ExcludeMissing
        inputTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("output_tokens")
        @ExcludeMissing
        outputTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        totalTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("input_token_details")
        @ExcludeMissing
        inputTokenDetails: JsonField<InputTokenDetails> = JsonMissing.of(),
        @JsonProperty("output_token_details")
        @ExcludeMissing
        outputTokenDetails: JsonField<OutputTokenDetails> = JsonMissing.of(),
    ) : this(
        inputTokens,
        outputTokens,
        totalTokens,
        inputTokenDetails,
        outputTokenDetails,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputTokens(): Long = inputTokens.getRequired("input_tokens")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outputTokens(): Long = outputTokens.getRequired("output_tokens")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalTokens(): Long = totalTokens.getRequired("total_tokens")

    /**
     * Breakdown of input token counts.
     *
     * Does *not* need to sum to full input token count. Does *not* need to have all keys.
     *
     * Example:
     *
     *     ```python
     *     {
     *         "audio": 10,
     *         "cache_creation": 200,
     *         "cache_read": 100,
     *     }
     *     ```
     *
     * !!! version-added "Added in version 0.3.9"
     *
     * May also hold extra provider-specific keys.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputTokenDetails(): Optional<InputTokenDetails> =
        inputTokenDetails.getOptional("input_token_details")

    /**
     * Breakdown of output token counts.
     *
     * Does *not* need to sum to full output token count. Does *not* need to have all keys.
     *
     * Example:
     *
     *     ```python
     *     {
     *         "audio": 10,
     *         "reasoning": 200,
     *     }
     *     ```
     *
     * !!! version-added "Added in version 0.3.9"
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputTokenDetails(): Optional<OutputTokenDetails> =
        outputTokenDetails.getOptional("output_token_details")

    /**
     * Returns the raw JSON value of [inputTokens].
     *
     * Unlike [inputTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("input_tokens") @ExcludeMissing fun _inputTokens(): JsonField<Long> = inputTokens

    /**
     * Returns the raw JSON value of [outputTokens].
     *
     * Unlike [outputTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("output_tokens")
    @ExcludeMissing
    fun _outputTokens(): JsonField<Long> = outputTokens

    /**
     * Returns the raw JSON value of [totalTokens].
     *
     * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens(): JsonField<Long> = totalTokens

    /**
     * Returns the raw JSON value of [inputTokenDetails].
     *
     * Unlike [inputTokenDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("input_token_details")
    @ExcludeMissing
    fun _inputTokenDetails(): JsonField<InputTokenDetails> = inputTokenDetails

    /**
     * Returns the raw JSON value of [outputTokenDetails].
     *
     * Unlike [outputTokenDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("output_token_details")
    @ExcludeMissing
    fun _outputTokenDetails(): JsonField<OutputTokenDetails> = outputTokenDetails

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
         * Returns a mutable builder for constructing an instance of [UsageMetadata].
         *
         * The following fields are required:
         * ```java
         * .inputTokens()
         * .outputTokens()
         * .totalTokens()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageMetadata]. */
    class Builder internal constructor() {

        private var inputTokens: JsonField<Long>? = null
        private var outputTokens: JsonField<Long>? = null
        private var totalTokens: JsonField<Long>? = null
        private var inputTokenDetails: JsonField<InputTokenDetails> = JsonMissing.of()
        private var outputTokenDetails: JsonField<OutputTokenDetails> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageMetadata: UsageMetadata) = apply {
            inputTokens = usageMetadata.inputTokens
            outputTokens = usageMetadata.outputTokens
            totalTokens = usageMetadata.totalTokens
            inputTokenDetails = usageMetadata.inputTokenDetails
            outputTokenDetails = usageMetadata.outputTokenDetails
            additionalProperties = usageMetadata.additionalProperties.toMutableMap()
        }

        fun inputTokens(inputTokens: Long) = inputTokens(JsonField.of(inputTokens))

        /**
         * Sets [Builder.inputTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inputTokens(inputTokens: JsonField<Long>) = apply { this.inputTokens = inputTokens }

        fun outputTokens(outputTokens: Long) = outputTokens(JsonField.of(outputTokens))

        /**
         * Sets [Builder.outputTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outputTokens(outputTokens: JsonField<Long>) = apply { this.outputTokens = outputTokens }

        fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

        /**
         * Sets [Builder.totalTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

        /**
         * Breakdown of input token counts.
         *
         * Does *not* need to sum to full input token count. Does *not* need to have all keys.
         *
         * Example:
         *
         *     ```python
         *     {
         *         "audio": 10,
         *         "cache_creation": 200,
         *         "cache_read": 100,
         *     }
         *     ```
         *
         * !!! version-added "Added in version 0.3.9"
         *
         * May also hold extra provider-specific keys.
         */
        fun inputTokenDetails(inputTokenDetails: InputTokenDetails) =
            inputTokenDetails(JsonField.of(inputTokenDetails))

        /**
         * Sets [Builder.inputTokenDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputTokenDetails] with a well-typed [InputTokenDetails]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun inputTokenDetails(inputTokenDetails: JsonField<InputTokenDetails>) = apply {
            this.inputTokenDetails = inputTokenDetails
        }

        /**
         * Breakdown of output token counts.
         *
         * Does *not* need to sum to full output token count. Does *not* need to have all keys.
         *
         * Example:
         *
         *     ```python
         *     {
         *         "audio": 10,
         *         "reasoning": 200,
         *     }
         *     ```
         *
         * !!! version-added "Added in version 0.3.9"
         */
        fun outputTokenDetails(outputTokenDetails: OutputTokenDetails) =
            outputTokenDetails(JsonField.of(outputTokenDetails))

        /**
         * Sets [Builder.outputTokenDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputTokenDetails] with a well-typed
         * [OutputTokenDetails] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun outputTokenDetails(outputTokenDetails: JsonField<OutputTokenDetails>) = apply {
            this.outputTokenDetails = outputTokenDetails
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
         * Returns an immutable instance of [UsageMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inputTokens()
         * .outputTokens()
         * .totalTokens()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageMetadata =
            UsageMetadata(
                checkRequired("inputTokens", inputTokens),
                checkRequired("outputTokens", outputTokens),
                checkRequired("totalTokens", totalTokens),
                inputTokenDetails,
                outputTokenDetails,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UsageMetadata = apply {
        if (validated) {
            return@apply
        }

        inputTokens()
        outputTokens()
        totalTokens()
        inputTokenDetails().ifPresent { it.validate() }
        outputTokenDetails().ifPresent { it.validate() }
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
        (if (inputTokens.asKnown().isPresent) 1 else 0) +
            (if (outputTokens.asKnown().isPresent) 1 else 0) +
            (if (totalTokens.asKnown().isPresent) 1 else 0) +
            (inputTokenDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (outputTokenDetails.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Breakdown of input token counts.
     *
     * Does *not* need to sum to full input token count. Does *not* need to have all keys.
     *
     * Example:
     *
     *     ```python
     *     {
     *         "audio": 10,
     *         "cache_creation": 200,
     *         "cache_read": 100,
     *     }
     *     ```
     *
     * !!! version-added "Added in version 0.3.9"
     *
     * May also hold extra provider-specific keys.
     */
    class InputTokenDetails
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val audio: JsonField<Long>,
        private val cacheCreation: JsonField<Long>,
        private val cacheRead: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("audio") @ExcludeMissing audio: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("cache_creation")
            @ExcludeMissing
            cacheCreation: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("cache_read")
            @ExcludeMissing
            cacheRead: JsonField<Long> = JsonMissing.of(),
        ) : this(audio, cacheCreation, cacheRead, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun audio(): Optional<Long> = audio.getOptional("audio")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cacheCreation(): Optional<Long> = cacheCreation.getOptional("cache_creation")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cacheRead(): Optional<Long> = cacheRead.getOptional("cache_read")

        /**
         * Returns the raw JSON value of [audio].
         *
         * Unlike [audio], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audio") @ExcludeMissing fun _audio(): JsonField<Long> = audio

        /**
         * Returns the raw JSON value of [cacheCreation].
         *
         * Unlike [cacheCreation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cache_creation")
        @ExcludeMissing
        fun _cacheCreation(): JsonField<Long> = cacheCreation

        /**
         * Returns the raw JSON value of [cacheRead].
         *
         * Unlike [cacheRead], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cache_read") @ExcludeMissing fun _cacheRead(): JsonField<Long> = cacheRead

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

            /** Returns a mutable builder for constructing an instance of [InputTokenDetails]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InputTokenDetails]. */
        class Builder internal constructor() {

            private var audio: JsonField<Long> = JsonMissing.of()
            private var cacheCreation: JsonField<Long> = JsonMissing.of()
            private var cacheRead: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inputTokenDetails: InputTokenDetails) = apply {
                audio = inputTokenDetails.audio
                cacheCreation = inputTokenDetails.cacheCreation
                cacheRead = inputTokenDetails.cacheRead
                additionalProperties = inputTokenDetails.additionalProperties.toMutableMap()
            }

            fun audio(audio: Long) = audio(JsonField.of(audio))

            /**
             * Sets [Builder.audio] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audio] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun audio(audio: JsonField<Long>) = apply { this.audio = audio }

            fun cacheCreation(cacheCreation: Long) = cacheCreation(JsonField.of(cacheCreation))

            /**
             * Sets [Builder.cacheCreation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheCreation] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cacheCreation(cacheCreation: JsonField<Long>) = apply {
                this.cacheCreation = cacheCreation
            }

            fun cacheRead(cacheRead: Long) = cacheRead(JsonField.of(cacheRead))

            /**
             * Sets [Builder.cacheRead] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cacheRead] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cacheRead(cacheRead: JsonField<Long>) = apply { this.cacheRead = cacheRead }

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
             * Returns an immutable instance of [InputTokenDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InputTokenDetails =
                InputTokenDetails(
                    audio,
                    cacheCreation,
                    cacheRead,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): InputTokenDetails = apply {
            if (validated) {
                return@apply
            }

            audio()
            cacheCreation()
            cacheRead()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (audio.asKnown().isPresent) 1 else 0) +
                (if (cacheCreation.asKnown().isPresent) 1 else 0) +
                (if (cacheRead.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InputTokenDetails &&
                audio == other.audio &&
                cacheCreation == other.cacheCreation &&
                cacheRead == other.cacheRead &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(audio, cacheCreation, cacheRead, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InputTokenDetails{audio=$audio, cacheCreation=$cacheCreation, cacheRead=$cacheRead, additionalProperties=$additionalProperties}"
    }

    /**
     * Breakdown of output token counts.
     *
     * Does *not* need to sum to full output token count. Does *not* need to have all keys.
     *
     * Example:
     *
     *     ```python
     *     {
     *         "audio": 10,
     *         "reasoning": 200,
     *     }
     *     ```
     *
     * !!! version-added "Added in version 0.3.9"
     */
    class OutputTokenDetails
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val audio: JsonField<Long>,
        private val reasoning: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("audio") @ExcludeMissing audio: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("reasoning") @ExcludeMissing reasoning: JsonField<Long> = JsonMissing.of(),
        ) : this(audio, reasoning, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun audio(): Optional<Long> = audio.getOptional("audio")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reasoning(): Optional<Long> = reasoning.getOptional("reasoning")

        /**
         * Returns the raw JSON value of [audio].
         *
         * Unlike [audio], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audio") @ExcludeMissing fun _audio(): JsonField<Long> = audio

        /**
         * Returns the raw JSON value of [reasoning].
         *
         * Unlike [reasoning], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reasoning") @ExcludeMissing fun _reasoning(): JsonField<Long> = reasoning

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

            /** Returns a mutable builder for constructing an instance of [OutputTokenDetails]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OutputTokenDetails]. */
        class Builder internal constructor() {

            private var audio: JsonField<Long> = JsonMissing.of()
            private var reasoning: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(outputTokenDetails: OutputTokenDetails) = apply {
                audio = outputTokenDetails.audio
                reasoning = outputTokenDetails.reasoning
                additionalProperties = outputTokenDetails.additionalProperties.toMutableMap()
            }

            fun audio(audio: Long) = audio(JsonField.of(audio))

            /**
             * Sets [Builder.audio] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audio] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun audio(audio: JsonField<Long>) = apply { this.audio = audio }

            fun reasoning(reasoning: Long) = reasoning(JsonField.of(reasoning))

            /**
             * Sets [Builder.reasoning] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reasoning] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reasoning(reasoning: JsonField<Long>) = apply { this.reasoning = reasoning }

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
             * Returns an immutable instance of [OutputTokenDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OutputTokenDetails =
                OutputTokenDetails(audio, reasoning, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): OutputTokenDetails = apply {
            if (validated) {
                return@apply
            }

            audio()
            reasoning()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (audio.asKnown().isPresent) 1 else 0) +
                (if (reasoning.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OutputTokenDetails &&
                audio == other.audio &&
                reasoning == other.reasoning &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(audio, reasoning, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OutputTokenDetails{audio=$audio, reasoning=$reasoning, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageMetadata &&
            inputTokens == other.inputTokens &&
            outputTokens == other.outputTokens &&
            totalTokens == other.totalTokens &&
            inputTokenDetails == other.inputTokenDetails &&
            outputTokenDetails == other.outputTokenDetails &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            inputTokens,
            outputTokens,
            totalTokens,
            inputTokenDetails,
            outputTokenDetails,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageMetadata{inputTokens=$inputTokens, outputTokens=$outputTokens, totalTokens=$totalTokens, inputTokenDetails=$inputTokenDetails, outputTokenDetails=$outputTokenDetails, additionalProperties=$additionalProperties}"
}
