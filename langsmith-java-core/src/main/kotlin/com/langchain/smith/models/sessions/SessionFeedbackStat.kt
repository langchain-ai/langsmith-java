// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Aggregate feedback for one feedback key. */
class SessionFeedbackStat
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val avg: JsonField<Double>,
    private val containsThreadFeedback: JsonField<Boolean>,
    private val errors: JsonField<Long>,
    private val max: JsonField<Double>,
    private val median: JsonField<Double>,
    private val min: JsonField<Double>,
    private val n: JsonField<Long>,
    private val stdev: JsonField<Double>,
    private val type: JsonField<Type>,
    private val values: JsonField<Values>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("avg") @ExcludeMissing avg: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("contains_thread_feedback")
        @ExcludeMissing
        containsThreadFeedback: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("errors") @ExcludeMissing errors: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max") @ExcludeMissing max: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("median") @ExcludeMissing median: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("min") @ExcludeMissing min: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("n") @ExcludeMissing n: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("stdev") @ExcludeMissing stdev: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("values") @ExcludeMissing values: JsonField<Values> = JsonMissing.of(),
    ) : this(
        avg,
        containsThreadFeedback,
        errors,
        max,
        median,
        min,
        n,
        stdev,
        type,
        values,
        mutableMapOf(),
    )

    /**
     * Mean numeric score.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avg(): Optional<Double> = avg.getOptional("avg")

    /**
     * Whether any feedback was left on a thread.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun containsThreadFeedback(): Boolean =
        containsThreadFeedback.getRequired("contains_thread_feedback")

    /**
     * Number of feedback entries recorded as errors.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun errors(): Long = errors.getRequired("errors")

    /**
     * Highest numeric score.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun max(): Optional<Double> = max.getOptional("max")

    /**
     * Median numeric score.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun median(): Optional<Double> = median.getOptional("median")

    /**
     * Lowest numeric score.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun min(): Optional<Double> = min.getOptional("min")

    /**
     * Number of feedback scores for this key.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun n(): Long = n.getRequired("n")

    /**
     * Standard deviation of numeric scores.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stdev(): Optional<Double> = stdev.getOptional("stdev")

    /**
     * `PRIMARY` for recorded feedback, `COMPOSITE` for a score computed from other feedback keys.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Count of each categorical value.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun values(): Values = values.getRequired("values")

    /**
     * Returns the raw JSON value of [avg].
     *
     * Unlike [avg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avg") @ExcludeMissing fun _avg(): JsonField<Double> = avg

    /**
     * Returns the raw JSON value of [containsThreadFeedback].
     *
     * Unlike [containsThreadFeedback], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("contains_thread_feedback")
    @ExcludeMissing
    fun _containsThreadFeedback(): JsonField<Boolean> = containsThreadFeedback

    /**
     * Returns the raw JSON value of [errors].
     *
     * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<Long> = errors

    /**
     * Returns the raw JSON value of [max].
     *
     * Unlike [max], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max") @ExcludeMissing fun _max(): JsonField<Double> = max

    /**
     * Returns the raw JSON value of [median].
     *
     * Unlike [median], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("median") @ExcludeMissing fun _median(): JsonField<Double> = median

    /**
     * Returns the raw JSON value of [min].
     *
     * Unlike [min], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("min") @ExcludeMissing fun _min(): JsonField<Double> = min

    /**
     * Returns the raw JSON value of [n].
     *
     * Unlike [n], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("n") @ExcludeMissing fun _n(): JsonField<Long> = n

    /**
     * Returns the raw JSON value of [stdev].
     *
     * Unlike [stdev], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stdev") @ExcludeMissing fun _stdev(): JsonField<Double> = stdev

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [values].
     *
     * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<Values> = values

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
         * Returns a mutable builder for constructing an instance of [SessionFeedbackStat].
         *
         * The following fields are required:
         * ```java
         * .avg()
         * .containsThreadFeedback()
         * .errors()
         * .max()
         * .median()
         * .min()
         * .n()
         * .stdev()
         * .type()
         * .values()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionFeedbackStat]. */
    class Builder internal constructor() {

        private var avg: JsonField<Double>? = null
        private var containsThreadFeedback: JsonField<Boolean>? = null
        private var errors: JsonField<Long>? = null
        private var max: JsonField<Double>? = null
        private var median: JsonField<Double>? = null
        private var min: JsonField<Double>? = null
        private var n: JsonField<Long>? = null
        private var stdev: JsonField<Double>? = null
        private var type: JsonField<Type>? = null
        private var values: JsonField<Values>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionFeedbackStat: SessionFeedbackStat) = apply {
            avg = sessionFeedbackStat.avg
            containsThreadFeedback = sessionFeedbackStat.containsThreadFeedback
            errors = sessionFeedbackStat.errors
            max = sessionFeedbackStat.max
            median = sessionFeedbackStat.median
            min = sessionFeedbackStat.min
            n = sessionFeedbackStat.n
            stdev = sessionFeedbackStat.stdev
            type = sessionFeedbackStat.type
            values = sessionFeedbackStat.values
            additionalProperties = sessionFeedbackStat.additionalProperties.toMutableMap()
        }

        /** Mean numeric score. */
        fun avg(avg: Double?) = avg(JsonField.ofNullable(avg))

        /**
         * Alias for [Builder.avg].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun avg(avg: Double) = avg(avg as Double?)

        /** Alias for calling [Builder.avg] with `avg.orElse(null)`. */
        fun avg(avg: Optional<Double>) = avg(avg.getOrNull())

        /**
         * Sets [Builder.avg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avg] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avg(avg: JsonField<Double>) = apply { this.avg = avg }

        /** Whether any feedback was left on a thread. */
        fun containsThreadFeedback(containsThreadFeedback: Boolean) =
            containsThreadFeedback(JsonField.of(containsThreadFeedback))

        /**
         * Sets [Builder.containsThreadFeedback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.containsThreadFeedback] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun containsThreadFeedback(containsThreadFeedback: JsonField<Boolean>) = apply {
            this.containsThreadFeedback = containsThreadFeedback
        }

        /** Number of feedback entries recorded as errors. */
        fun errors(errors: Long) = errors(JsonField.of(errors))

        /**
         * Sets [Builder.errors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errors] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun errors(errors: JsonField<Long>) = apply { this.errors = errors }

        /** Highest numeric score. */
        fun max(max: Double?) = max(JsonField.ofNullable(max))

        /**
         * Alias for [Builder.max].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun max(max: Double) = max(max as Double?)

        /** Alias for calling [Builder.max] with `max.orElse(null)`. */
        fun max(max: Optional<Double>) = max(max.getOrNull())

        /**
         * Sets [Builder.max] to an arbitrary JSON value.
         *
         * You should usually call [Builder.max] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun max(max: JsonField<Double>) = apply { this.max = max }

        /** Median numeric score. */
        fun median(median: Double?) = median(JsonField.ofNullable(median))

        /**
         * Alias for [Builder.median].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun median(median: Double) = median(median as Double?)

        /** Alias for calling [Builder.median] with `median.orElse(null)`. */
        fun median(median: Optional<Double>) = median(median.getOrNull())

        /**
         * Sets [Builder.median] to an arbitrary JSON value.
         *
         * You should usually call [Builder.median] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun median(median: JsonField<Double>) = apply { this.median = median }

        /** Lowest numeric score. */
        fun min(min: Double?) = min(JsonField.ofNullable(min))

        /**
         * Alias for [Builder.min].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun min(min: Double) = min(min as Double?)

        /** Alias for calling [Builder.min] with `min.orElse(null)`. */
        fun min(min: Optional<Double>) = min(min.getOrNull())

        /**
         * Sets [Builder.min] to an arbitrary JSON value.
         *
         * You should usually call [Builder.min] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun min(min: JsonField<Double>) = apply { this.min = min }

        /** Number of feedback scores for this key. */
        fun n(n: Long) = n(JsonField.of(n))

        /**
         * Sets [Builder.n] to an arbitrary JSON value.
         *
         * You should usually call [Builder.n] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun n(n: JsonField<Long>) = apply { this.n = n }

        /** Standard deviation of numeric scores. */
        fun stdev(stdev: Double?) = stdev(JsonField.ofNullable(stdev))

        /**
         * Alias for [Builder.stdev].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun stdev(stdev: Double) = stdev(stdev as Double?)

        /** Alias for calling [Builder.stdev] with `stdev.orElse(null)`. */
        fun stdev(stdev: Optional<Double>) = stdev(stdev.getOrNull())

        /**
         * Sets [Builder.stdev] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stdev] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stdev(stdev: JsonField<Double>) = apply { this.stdev = stdev }

        /**
         * `PRIMARY` for recorded feedback, `COMPOSITE` for a score computed from other feedback
         * keys.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Count of each categorical value. */
        fun values(values: Values) = values(JsonField.of(values))

        /**
         * Sets [Builder.values] to an arbitrary JSON value.
         *
         * You should usually call [Builder.values] with a well-typed [Values] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun values(values: JsonField<Values>) = apply { this.values = values }

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
         * Returns an immutable instance of [SessionFeedbackStat].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .avg()
         * .containsThreadFeedback()
         * .errors()
         * .max()
         * .median()
         * .min()
         * .n()
         * .stdev()
         * .type()
         * .values()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionFeedbackStat =
            SessionFeedbackStat(
                checkRequired("avg", avg),
                checkRequired("containsThreadFeedback", containsThreadFeedback),
                checkRequired("errors", errors),
                checkRequired("max", max),
                checkRequired("median", median),
                checkRequired("min", min),
                checkRequired("n", n),
                checkRequired("stdev", stdev),
                checkRequired("type", type),
                checkRequired("values", values),
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
    fun validate(): SessionFeedbackStat = apply {
        if (validated) {
            return@apply
        }

        avg()
        containsThreadFeedback()
        errors()
        max()
        median()
        min()
        n()
        stdev()
        type().validate()
        values().validate()
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
        (if (avg.asKnown().isPresent) 1 else 0) +
            (if (containsThreadFeedback.asKnown().isPresent) 1 else 0) +
            (if (errors.asKnown().isPresent) 1 else 0) +
            (if (max.asKnown().isPresent) 1 else 0) +
            (if (median.asKnown().isPresent) 1 else 0) +
            (if (min.asKnown().isPresent) 1 else 0) +
            (if (n.asKnown().isPresent) 1 else 0) +
            (if (stdev.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (values.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * `PRIMARY` for recorded feedback, `COMPOSITE` for a score computed from other feedback keys.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PRIMARY = of("PRIMARY")

            @JvmField val COMPOSITE = of("COMPOSITE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PRIMARY,
            COMPOSITE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PRIMARY,
            COMPOSITE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PRIMARY -> Value.PRIMARY
                COMPOSITE -> Value.COMPOSITE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PRIMARY -> Known.PRIMARY
                COMPOSITE -> Known.COMPOSITE
                else -> throw LangChainInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangChainInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Count of each categorical value. */
    class Values
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

            /** Returns a mutable builder for constructing an instance of [Values]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Values]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(values: Values) = apply {
                additionalProperties = values.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Values].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Values = Values(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Values = apply {
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

            return other is Values && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Values{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionFeedbackStat &&
            avg == other.avg &&
            containsThreadFeedback == other.containsThreadFeedback &&
            errors == other.errors &&
            max == other.max &&
            median == other.median &&
            min == other.min &&
            n == other.n &&
            stdev == other.stdev &&
            type == other.type &&
            values == other.values &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            avg,
            containsThreadFeedback,
            errors,
            max,
            median,
            min,
            n,
            stdev,
            type,
            values,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionFeedbackStat{avg=$avg, containsThreadFeedback=$containsThreadFeedback, errors=$errors, max=$max, median=$median, min=$min, n=$n, stdev=$stdev, type=$type, values=$values, additionalProperties=$additionalProperties}"
}
