// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.platform.alerts

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
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AlertRuleBase
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val aggregation: JsonField<Aggregation>,
    private val attribute: JsonField<Attribute>,
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val operator: JsonField<Operator>,
    private val type: JsonField<Type>,
    private val windowMinutes: JsonField<Long>,
    private val id: JsonField<String>,
    private val denominatorFilter: JsonField<String>,
    private val filter: JsonField<String>,
    private val threshold: JsonField<Double>,
    private val thresholdMultiplier: JsonField<Double>,
    private val thresholdWindowMinutes: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("aggregation")
        @ExcludeMissing
        aggregation: JsonField<Aggregation> = JsonMissing.of(),
        @JsonProperty("attribute")
        @ExcludeMissing
        attribute: JsonField<Attribute> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("window_minutes")
        @ExcludeMissing
        windowMinutes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("denominator_filter")
        @ExcludeMissing
        denominatorFilter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("threshold") @ExcludeMissing threshold: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("threshold_multiplier")
        @ExcludeMissing
        thresholdMultiplier: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("threshold_window_minutes")
        @ExcludeMissing
        thresholdWindowMinutes: JsonField<Long> = JsonMissing.of(),
    ) : this(
        aggregation,
        attribute,
        description,
        name,
        operator,
        type,
        windowMinutes,
        id,
        denominatorFilter,
        filter,
        threshold,
        thresholdMultiplier,
        thresholdWindowMinutes,
        mutableMapOf(),
    )

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun aggregation(): Aggregation = aggregation.getRequired("aggregation")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attribute(): Attribute = attribute.getRequired("attribute")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * max 15 minutes for alert rule
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun windowMinutes(): Long = windowMinutes.getRequired("window_minutes")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun denominatorFilter(): Optional<String> = denominatorFilter.getOptional("denominator_filter")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<String> = filter.getOptional("filter")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threshold(): Optional<Double> = threshold.getOptional("threshold")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thresholdMultiplier(): Optional<Double> =
        thresholdMultiplier.getOptional("threshold_multiplier")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thresholdWindowMinutes(): Optional<Long> =
        thresholdWindowMinutes.getOptional("threshold_window_minutes")

    /**
     * Returns the raw JSON value of [aggregation].
     *
     * Unlike [aggregation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aggregation")
    @ExcludeMissing
    fun _aggregation(): JsonField<Aggregation> = aggregation

    /**
     * Returns the raw JSON value of [attribute].
     *
     * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attribute") @ExcludeMissing fun _attribute(): JsonField<Attribute> = attribute

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [windowMinutes].
     *
     * Unlike [windowMinutes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("window_minutes")
    @ExcludeMissing
    fun _windowMinutes(): JsonField<Long> = windowMinutes

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [denominatorFilter].
     *
     * Unlike [denominatorFilter], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("denominator_filter")
    @ExcludeMissing
    fun _denominatorFilter(): JsonField<String> = denominatorFilter

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

    /**
     * Returns the raw JSON value of [threshold].
     *
     * Unlike [threshold], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("threshold") @ExcludeMissing fun _threshold(): JsonField<Double> = threshold

    /**
     * Returns the raw JSON value of [thresholdMultiplier].
     *
     * Unlike [thresholdMultiplier], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("threshold_multiplier")
    @ExcludeMissing
    fun _thresholdMultiplier(): JsonField<Double> = thresholdMultiplier

    /**
     * Returns the raw JSON value of [thresholdWindowMinutes].
     *
     * Unlike [thresholdWindowMinutes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("threshold_window_minutes")
    @ExcludeMissing
    fun _thresholdWindowMinutes(): JsonField<Long> = thresholdWindowMinutes

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
         * Returns a mutable builder for constructing an instance of [AlertRuleBase].
         *
         * The following fields are required:
         * ```java
         * .aggregation()
         * .attribute()
         * .description()
         * .name()
         * .operator()
         * .type()
         * .windowMinutes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AlertRuleBase]. */
    class Builder internal constructor() {

        private var aggregation: JsonField<Aggregation>? = null
        private var attribute: JsonField<Attribute>? = null
        private var description: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var operator: JsonField<Operator>? = null
        private var type: JsonField<Type>? = null
        private var windowMinutes: JsonField<Long>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var denominatorFilter: JsonField<String> = JsonMissing.of()
        private var filter: JsonField<String> = JsonMissing.of()
        private var threshold: JsonField<Double> = JsonMissing.of()
        private var thresholdMultiplier: JsonField<Double> = JsonMissing.of()
        private var thresholdWindowMinutes: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(alertRuleBase: AlertRuleBase) = apply {
            aggregation = alertRuleBase.aggregation
            attribute = alertRuleBase.attribute
            description = alertRuleBase.description
            name = alertRuleBase.name
            operator = alertRuleBase.operator
            type = alertRuleBase.type
            windowMinutes = alertRuleBase.windowMinutes
            id = alertRuleBase.id
            denominatorFilter = alertRuleBase.denominatorFilter
            filter = alertRuleBase.filter
            threshold = alertRuleBase.threshold
            thresholdMultiplier = alertRuleBase.thresholdMultiplier
            thresholdWindowMinutes = alertRuleBase.thresholdWindowMinutes
            additionalProperties = alertRuleBase.additionalProperties.toMutableMap()
        }

        fun aggregation(aggregation: Aggregation) = aggregation(JsonField.of(aggregation))

        /**
         * Sets [Builder.aggregation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregation] with a well-typed [Aggregation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun aggregation(aggregation: JsonField<Aggregation>) = apply {
            this.aggregation = aggregation
        }

        fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

        /**
         * Sets [Builder.attribute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attribute] with a well-typed [Attribute] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun attribute(attribute: JsonField<Attribute>) = apply { this.attribute = attribute }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun operator(operator: Operator) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [Operator] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** max 15 minutes for alert rule */
        fun windowMinutes(windowMinutes: Long) = windowMinutes(JsonField.of(windowMinutes))

        /**
         * Sets [Builder.windowMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.windowMinutes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun windowMinutes(windowMinutes: JsonField<Long>) = apply {
            this.windowMinutes = windowMinutes
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun denominatorFilter(denominatorFilter: String) =
            denominatorFilter(JsonField.of(denominatorFilter))

        /**
         * Sets [Builder.denominatorFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.denominatorFilter] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun denominatorFilter(denominatorFilter: JsonField<String>) = apply {
            this.denominatorFilter = denominatorFilter
        }

        fun filter(filter: String) = filter(JsonField.of(filter))

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

        fun threshold(threshold: Double) = threshold(JsonField.of(threshold))

        /**
         * Sets [Builder.threshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threshold] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun threshold(threshold: JsonField<Double>) = apply { this.threshold = threshold }

        fun thresholdMultiplier(thresholdMultiplier: Double) =
            thresholdMultiplier(JsonField.of(thresholdMultiplier))

        /**
         * Sets [Builder.thresholdMultiplier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thresholdMultiplier] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thresholdMultiplier(thresholdMultiplier: JsonField<Double>) = apply {
            this.thresholdMultiplier = thresholdMultiplier
        }

        fun thresholdWindowMinutes(thresholdWindowMinutes: Long) =
            thresholdWindowMinutes(JsonField.of(thresholdWindowMinutes))

        /**
         * Sets [Builder.thresholdWindowMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thresholdWindowMinutes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thresholdWindowMinutes(thresholdWindowMinutes: JsonField<Long>) = apply {
            this.thresholdWindowMinutes = thresholdWindowMinutes
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
         * Returns an immutable instance of [AlertRuleBase].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .aggregation()
         * .attribute()
         * .description()
         * .name()
         * .operator()
         * .type()
         * .windowMinutes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AlertRuleBase =
            AlertRuleBase(
                checkRequired("aggregation", aggregation),
                checkRequired("attribute", attribute),
                checkRequired("description", description),
                checkRequired("name", name),
                checkRequired("operator", operator),
                checkRequired("type", type),
                checkRequired("windowMinutes", windowMinutes),
                id,
                denominatorFilter,
                filter,
                threshold,
                thresholdMultiplier,
                thresholdWindowMinutes,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AlertRuleBase = apply {
        if (validated) {
            return@apply
        }

        aggregation().validate()
        attribute().validate()
        description()
        name()
        operator().validate()
        type().validate()
        windowMinutes()
        id()
        denominatorFilter()
        filter()
        threshold()
        thresholdMultiplier()
        thresholdWindowMinutes()
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
        (aggregation.asKnown().getOrNull()?.validity() ?: 0) +
            (attribute.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (windowMinutes.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (denominatorFilter.asKnown().isPresent) 1 else 0) +
            (if (filter.asKnown().isPresent) 1 else 0) +
            (if (threshold.asKnown().isPresent) 1 else 0) +
            (if (thresholdMultiplier.asKnown().isPresent) 1 else 0) +
            (if (thresholdWindowMinutes.asKnown().isPresent) 1 else 0)

    class Aggregation @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val AVG = of("avg")

            @JvmField val SUM = of("sum")

            @JvmField val PCT = of("pct")

            @JvmStatic fun of(value: String) = Aggregation(JsonField.of(value))
        }

        /** An enum containing [Aggregation]'s known values. */
        enum class Known {
            AVG,
            SUM,
            PCT,
        }

        /**
         * An enum containing [Aggregation]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Aggregation] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AVG,
            SUM,
            PCT,
            /**
             * An enum member indicating that [Aggregation] was instantiated with an unknown value.
             */
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
                AVG -> Value.AVG
                SUM -> Value.SUM
                PCT -> Value.PCT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AVG -> Known.AVG
                SUM -> Known.SUM
                PCT -> Known.PCT
                else -> throw LangsmithInvalidDataException("Unknown Aggregation: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Aggregation = apply {
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
            } catch (e: LangsmithInvalidDataException) {
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

            return other is Aggregation && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Attribute @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LATENCY = of("latency")

            @JvmField val ERROR_COUNT = of("error_count")

            @JvmField val FEEDBACK_SCORE = of("feedback_score")

            @JvmField val RUN_LATENCY = of("run_latency")

            @JvmField val RUN_COUNT = of("run_count")

            @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
        }

        /** An enum containing [Attribute]'s known values. */
        enum class Known {
            LATENCY,
            ERROR_COUNT,
            FEEDBACK_SCORE,
            RUN_LATENCY,
            RUN_COUNT,
        }

        /**
         * An enum containing [Attribute]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Attribute] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LATENCY,
            ERROR_COUNT,
            FEEDBACK_SCORE,
            RUN_LATENCY,
            RUN_COUNT,
            /**
             * An enum member indicating that [Attribute] was instantiated with an unknown value.
             */
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
                LATENCY -> Value.LATENCY
                ERROR_COUNT -> Value.ERROR_COUNT
                FEEDBACK_SCORE -> Value.FEEDBACK_SCORE
                RUN_LATENCY -> Value.RUN_LATENCY
                RUN_COUNT -> Value.RUN_COUNT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LATENCY -> Known.LATENCY
                ERROR_COUNT -> Known.ERROR_COUNT
                FEEDBACK_SCORE -> Known.FEEDBACK_SCORE
                RUN_LATENCY -> Known.RUN_LATENCY
                RUN_COUNT -> Known.RUN_COUNT
                else -> throw LangsmithInvalidDataException("Unknown Attribute: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Attribute = apply {
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
            } catch (e: LangsmithInvalidDataException) {
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

            return other is Attribute && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Operator @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val GTE = of("gte")

            @JvmField val LTE = of("lte")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            GTE,
            LTE,
        }

        /**
         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Operator] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GTE,
            LTE,
            /** An enum member indicating that [Operator] was instantiated with an unknown value. */
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
                GTE -> Value.GTE
                LTE -> Value.LTE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                GTE -> Known.GTE
                LTE -> Known.LTE
                else -> throw LangsmithInvalidDataException("Unknown Operator: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Operator = apply {
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
            } catch (e: LangsmithInvalidDataException) {
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

            return other is Operator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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

            @JvmField val THRESHOLD = of("threshold")

            @JvmField val CHANGE = of("change")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            THRESHOLD,
            CHANGE,
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
            THRESHOLD,
            CHANGE,
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
                THRESHOLD -> Value.THRESHOLD
                CHANGE -> Value.CHANGE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                THRESHOLD -> Known.THRESHOLD
                CHANGE -> Known.CHANGE
                else -> throw LangsmithInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

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
            } catch (e: LangsmithInvalidDataException) {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlertRuleBase &&
            aggregation == other.aggregation &&
            attribute == other.attribute &&
            description == other.description &&
            name == other.name &&
            operator == other.operator &&
            type == other.type &&
            windowMinutes == other.windowMinutes &&
            id == other.id &&
            denominatorFilter == other.denominatorFilter &&
            filter == other.filter &&
            threshold == other.threshold &&
            thresholdMultiplier == other.thresholdMultiplier &&
            thresholdWindowMinutes == other.thresholdWindowMinutes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            aggregation,
            attribute,
            description,
            name,
            operator,
            type,
            windowMinutes,
            id,
            denominatorFilter,
            filter,
            threshold,
            thresholdMultiplier,
            thresholdWindowMinutes,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AlertRuleBase{aggregation=$aggregation, attribute=$attribute, description=$description, name=$name, operator=$operator, type=$type, windowMinutes=$windowMinutes, id=$id, denominatorFilter=$denominatorFilter, filter=$filter, threshold=$threshold, thresholdMultiplier=$thresholdMultiplier, thresholdWindowMinutes=$thresholdWindowMinutes, additionalProperties=$additionalProperties}"
}
