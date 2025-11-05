// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

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

/** Timedelta input. */
class TimedeltaInput
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val days: JsonField<Long>,
    private val hours: JsonField<Long>,
    private val minutes: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("days") @ExcludeMissing days: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("hours") @ExcludeMissing hours: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("minutes") @ExcludeMissing minutes: JsonField<Long> = JsonMissing.of(),
    ) : this(days, hours, minutes, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun days(): Optional<Long> = days.getOptional("days")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hours(): Optional<Long> = hours.getOptional("hours")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minutes(): Optional<Long> = minutes.getOptional("minutes")

    /**
     * Returns the raw JSON value of [days].
     *
     * Unlike [days], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("days") @ExcludeMissing fun _days(): JsonField<Long> = days

    /**
     * Returns the raw JSON value of [hours].
     *
     * Unlike [hours], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hours") @ExcludeMissing fun _hours(): JsonField<Long> = hours

    /**
     * Returns the raw JSON value of [minutes].
     *
     * Unlike [minutes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minutes") @ExcludeMissing fun _minutes(): JsonField<Long> = minutes

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

        /** Returns a mutable builder for constructing an instance of [TimedeltaInput]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TimedeltaInput]. */
    class Builder internal constructor() {

        private var days: JsonField<Long> = JsonMissing.of()
        private var hours: JsonField<Long> = JsonMissing.of()
        private var minutes: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(timedeltaInput: TimedeltaInput) = apply {
            days = timedeltaInput.days
            hours = timedeltaInput.hours
            minutes = timedeltaInput.minutes
            additionalProperties = timedeltaInput.additionalProperties.toMutableMap()
        }

        fun days(days: Long) = days(JsonField.of(days))

        /**
         * Sets [Builder.days] to an arbitrary JSON value.
         *
         * You should usually call [Builder.days] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun days(days: JsonField<Long>) = apply { this.days = days }

        fun hours(hours: Long) = hours(JsonField.of(hours))

        /**
         * Sets [Builder.hours] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hours] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hours(hours: JsonField<Long>) = apply { this.hours = hours }

        fun minutes(minutes: Long) = minutes(JsonField.of(minutes))

        /**
         * Sets [Builder.minutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minutes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun minutes(minutes: JsonField<Long>) = apply { this.minutes = minutes }

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
         * Returns an immutable instance of [TimedeltaInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TimedeltaInput =
            TimedeltaInput(days, hours, minutes, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): TimedeltaInput = apply {
        if (validated) {
            return@apply
        }

        days()
        hours()
        minutes()
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
        (if (days.asKnown().isPresent) 1 else 0) +
            (if (hours.asKnown().isPresent) 1 else 0) +
            (if (minutes.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TimedeltaInput &&
            days == other.days &&
            hours == other.hours &&
            minutes == other.minutes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(days, hours, minutes, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TimedeltaInput{days=$days, hours=$hours, minutes=$minutes, additionalProperties=$additionalProperties}"
}
