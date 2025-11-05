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
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DemoConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val examples: JsonField<List<JsonValue>>,
    private val messageIndex: JsonField<Long>,
    private val metaprompt: JsonValue,
    private val overallFeedback: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("examples")
        @ExcludeMissing
        examples: JsonField<List<JsonValue>> = JsonMissing.of(),
        @JsonProperty("message_index")
        @ExcludeMissing
        messageIndex: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metaprompt") @ExcludeMissing metaprompt: JsonValue = JsonMissing.of(),
        @JsonProperty("overall_feedback")
        @ExcludeMissing
        overallFeedback: JsonField<String> = JsonMissing.of(),
    ) : this(examples, messageIndex, metaprompt, overallFeedback, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun examples(): List<JsonValue> = examples.getRequired("examples")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageIndex(): Long = messageIndex.getRequired("message_index")

    @JsonProperty("metaprompt") @ExcludeMissing fun _metaprompt(): JsonValue = metaprompt

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overallFeedback(): Optional<String> = overallFeedback.getOptional("overall_feedback")

    /**
     * Returns the raw JSON value of [examples].
     *
     * Unlike [examples], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("examples") @ExcludeMissing fun _examples(): JsonField<List<JsonValue>> = examples

    /**
     * Returns the raw JSON value of [messageIndex].
     *
     * Unlike [messageIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message_index")
    @ExcludeMissing
    fun _messageIndex(): JsonField<Long> = messageIndex

    /**
     * Returns the raw JSON value of [overallFeedback].
     *
     * Unlike [overallFeedback], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overall_feedback")
    @ExcludeMissing
    fun _overallFeedback(): JsonField<String> = overallFeedback

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
         * Returns a mutable builder for constructing an instance of [DemoConfig].
         *
         * The following fields are required:
         * ```java
         * .examples()
         * .messageIndex()
         * .metaprompt()
         * .overallFeedback()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DemoConfig]. */
    class Builder internal constructor() {

        private var examples: JsonField<MutableList<JsonValue>>? = null
        private var messageIndex: JsonField<Long>? = null
        private var metaprompt: JsonValue? = null
        private var overallFeedback: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(demoConfig: DemoConfig) = apply {
            examples = demoConfig.examples.map { it.toMutableList() }
            messageIndex = demoConfig.messageIndex
            metaprompt = demoConfig.metaprompt
            overallFeedback = demoConfig.overallFeedback
            additionalProperties = demoConfig.additionalProperties.toMutableMap()
        }

        fun examples(examples: List<JsonValue>) = examples(JsonField.of(examples))

        /**
         * Sets [Builder.examples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.examples] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun examples(examples: JsonField<List<JsonValue>>) = apply {
            this.examples = examples.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [examples].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExample(example: JsonValue) = apply {
            examples =
                (examples ?: JsonField.of(mutableListOf())).also {
                    checkKnown("examples", it).add(example)
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

        fun metaprompt(metaprompt: JsonValue) = apply { this.metaprompt = metaprompt }

        fun overallFeedback(overallFeedback: String?) =
            overallFeedback(JsonField.ofNullable(overallFeedback))

        /** Alias for calling [Builder.overallFeedback] with `overallFeedback.orElse(null)`. */
        fun overallFeedback(overallFeedback: Optional<String>) =
            overallFeedback(overallFeedback.getOrNull())

        /**
         * Sets [Builder.overallFeedback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overallFeedback] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun overallFeedback(overallFeedback: JsonField<String>) = apply {
            this.overallFeedback = overallFeedback
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
         * Returns an immutable instance of [DemoConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .examples()
         * .messageIndex()
         * .metaprompt()
         * .overallFeedback()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DemoConfig =
            DemoConfig(
                checkRequired("examples", examples).map { it.toImmutable() },
                checkRequired("messageIndex", messageIndex),
                checkRequired("metaprompt", metaprompt),
                checkRequired("overallFeedback", overallFeedback),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DemoConfig = apply {
        if (validated) {
            return@apply
        }

        examples()
        messageIndex()
        overallFeedback()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (examples.asKnown().getOrNull()?.size ?: 0) +
            (if (messageIndex.asKnown().isPresent) 1 else 0) +
            (if (overallFeedback.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DemoConfig &&
            examples == other.examples &&
            messageIndex == other.messageIndex &&
            metaprompt == other.metaprompt &&
            overallFeedback == other.overallFeedback &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(examples, messageIndex, metaprompt, overallFeedback, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DemoConfig{examples=$examples, messageIndex=$messageIndex, metaprompt=$metaprompt, overallFeedback=$overallFeedback, additionalProperties=$additionalProperties}"
}
