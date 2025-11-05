// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** List of feedback keys with number of improvements and regressions for each. */
class SessionFeedbackDelta
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val feedbackDeltas: JsonField<FeedbackDeltas>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("feedback_deltas")
        @ExcludeMissing
        feedbackDeltas: JsonField<FeedbackDeltas> = JsonMissing.of()
    ) : this(feedbackDeltas, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun feedbackDeltas(): FeedbackDeltas = feedbackDeltas.getRequired("feedback_deltas")

    /**
     * Returns the raw JSON value of [feedbackDeltas].
     *
     * Unlike [feedbackDeltas], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_deltas")
    @ExcludeMissing
    fun _feedbackDeltas(): JsonField<FeedbackDeltas> = feedbackDeltas

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
         * Returns a mutable builder for constructing an instance of [SessionFeedbackDelta].
         *
         * The following fields are required:
         * ```java
         * .feedbackDeltas()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionFeedbackDelta]. */
    class Builder internal constructor() {

        private var feedbackDeltas: JsonField<FeedbackDeltas>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionFeedbackDelta: SessionFeedbackDelta) = apply {
            feedbackDeltas = sessionFeedbackDelta.feedbackDeltas
            additionalProperties = sessionFeedbackDelta.additionalProperties.toMutableMap()
        }

        fun feedbackDeltas(feedbackDeltas: FeedbackDeltas) =
            feedbackDeltas(JsonField.of(feedbackDeltas))

        /**
         * Sets [Builder.feedbackDeltas] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackDeltas] with a well-typed [FeedbackDeltas] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun feedbackDeltas(feedbackDeltas: JsonField<FeedbackDeltas>) = apply {
            this.feedbackDeltas = feedbackDeltas
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
         * Returns an immutable instance of [SessionFeedbackDelta].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .feedbackDeltas()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionFeedbackDelta =
            SessionFeedbackDelta(
                checkRequired("feedbackDeltas", feedbackDeltas),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SessionFeedbackDelta = apply {
        if (validated) {
            return@apply
        }

        feedbackDeltas().validate()
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
    internal fun validity(): Int = (feedbackDeltas.asKnown().getOrNull()?.validity() ?: 0)

    class FeedbackDeltas
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [FeedbackDeltas]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FeedbackDeltas]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(feedbackDeltas: FeedbackDeltas) = apply {
                additionalProperties = feedbackDeltas.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [FeedbackDeltas].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FeedbackDeltas = FeedbackDeltas(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): FeedbackDeltas = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeedbackDeltas && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "FeedbackDeltas{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionFeedbackDelta &&
            feedbackDeltas == other.feedbackDeltas &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(feedbackDeltas, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionFeedbackDelta{feedbackDeltas=$feedbackDeltas, additionalProperties=$additionalProperties}"
}
