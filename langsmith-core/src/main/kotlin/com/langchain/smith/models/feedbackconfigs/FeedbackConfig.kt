// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedbackconfigs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
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

class FeedbackConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val type: JsonField<Type>,
    private val categories: JsonField<List<Category>>,
    private val max: JsonField<Double>,
    private val min: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("categories")
        @ExcludeMissing
        categories: JsonField<List<Category>> = JsonMissing.of(),
        @JsonProperty("max") @ExcludeMissing max: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("min") @ExcludeMissing min: JsonField<Double> = JsonMissing.of(),
    ) : this(type, categories, max, min, mutableMapOf())

    /**
     * Enum for feedback types.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun categories(): Optional<List<Category>> = categories.getOptional("categories")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun max(): Optional<Double> = max.getOptional("max")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun min(): Optional<Double> = min.getOptional("min")

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [categories].
     *
     * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("categories")
    @ExcludeMissing
    fun _categories(): JsonField<List<Category>> = categories

    /**
     * Returns the raw JSON value of [max].
     *
     * Unlike [max], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max") @ExcludeMissing fun _max(): JsonField<Double> = max

    /**
     * Returns the raw JSON value of [min].
     *
     * Unlike [min], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("min") @ExcludeMissing fun _min(): JsonField<Double> = min

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
         * Returns a mutable builder for constructing an instance of [FeedbackConfig].
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedbackConfig]. */
    class Builder internal constructor() {

        private var type: JsonField<Type>? = null
        private var categories: JsonField<MutableList<Category>>? = null
        private var max: JsonField<Double> = JsonMissing.of()
        private var min: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(feedbackConfig: FeedbackConfig) = apply {
            type = feedbackConfig.type
            categories = feedbackConfig.categories.map { it.toMutableList() }
            max = feedbackConfig.max
            min = feedbackConfig.min
            additionalProperties = feedbackConfig.additionalProperties.toMutableMap()
        }

        /** Enum for feedback types. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun categories(categories: List<Category>?) = categories(JsonField.ofNullable(categories))

        /** Alias for calling [Builder.categories] with `categories.orElse(null)`. */
        fun categories(categories: Optional<List<Category>>) = categories(categories.getOrNull())

        /**
         * Sets [Builder.categories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categories] with a well-typed `List<Category>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun categories(categories: JsonField<List<Category>>) = apply {
            this.categories = categories.map { it.toMutableList() }
        }

        /**
         * Adds a single [Category] to [categories].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCategory(category: Category) = apply {
            categories =
                (categories ?: JsonField.of(mutableListOf())).also {
                    checkKnown("categories", it).add(category)
                }
        }

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
         * Returns an immutable instance of [FeedbackConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FeedbackConfig =
            FeedbackConfig(
                checkRequired("type", type),
                (categories ?: JsonMissing.of()).map { it.toImmutable() },
                max,
                min,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FeedbackConfig = apply {
        if (validated) {
            return@apply
        }

        type().validate()
        categories().ifPresent { it.forEach { it.validate() } }
        max()
        min()
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
        (type.asKnown().getOrNull()?.validity() ?: 0) +
            (categories.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (max.asKnown().isPresent) 1 else 0) +
            (if (min.asKnown().isPresent) 1 else 0)

    /** Enum for feedback types. */
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

            @JvmField val CONTINUOUS = of("continuous")

            @JvmField val CATEGORICAL = of("categorical")

            @JvmField val FREEFORM = of("freeform")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CONTINUOUS,
            CATEGORICAL,
            FREEFORM,
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
            CONTINUOUS,
            CATEGORICAL,
            FREEFORM,
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
                CONTINUOUS -> Value.CONTINUOUS
                CATEGORICAL -> Value.CATEGORICAL
                FREEFORM -> Value.FREEFORM
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
                CONTINUOUS -> Known.CONTINUOUS
                CATEGORICAL -> Known.CATEGORICAL
                FREEFORM -> Known.FREEFORM
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

    /** Specific value and label pair for feedback */
    class Category
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val value: JsonField<Double>,
        private val label: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        ) : this(value, label, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Double = value.getRequired("value")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun label(): Optional<String> = label.getOptional("label")

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

        /**
         * Returns the raw JSON value of [label].
         *
         * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

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
             * Returns a mutable builder for constructing an instance of [Category].
             *
             * The following fields are required:
             * ```java
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Category]. */
        class Builder internal constructor() {

            private var value: JsonField<Double>? = null
            private var label: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(category: Category) = apply {
                value = category.value
                label = category.label
                additionalProperties = category.additionalProperties.toMutableMap()
            }

            fun value(value: Double) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<Double>) = apply { this.value = value }

            fun label(label: String?) = label(JsonField.ofNullable(label))

            /** Alias for calling [Builder.label] with `label.orElse(null)`. */
            fun label(label: Optional<String>) = label(label.getOrNull())

            /**
             * Sets [Builder.label] to an arbitrary JSON value.
             *
             * You should usually call [Builder.label] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun label(label: JsonField<String>) = apply { this.label = label }

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
             * Returns an immutable instance of [Category].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Category =
                Category(checkRequired("value", value), label, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Category = apply {
            if (validated) {
                return@apply
            }

            value()
            label()
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
            (if (value.asKnown().isPresent) 1 else 0) + (if (label.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category &&
                value == other.value &&
                label == other.label &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(value, label, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Category{value=$value, label=$label, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackConfig &&
            type == other.type &&
            categories == other.categories &&
            max == other.max &&
            min == other.min &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(type, categories, max, min, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FeedbackConfig{type=$type, categories=$categories, max=$max, min=$min, additionalProperties=$additionalProperties}"
}
