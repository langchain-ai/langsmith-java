// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.runs

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

class SortParamsForRunsComparisonView
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val sortBy: JsonField<String>,
    private val sortOrder: JsonField<SortOrder>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("sort_by") @ExcludeMissing sortBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sort_order")
        @ExcludeMissing
        sortOrder: JsonField<SortOrder> = JsonMissing.of(),
    ) : this(sortBy, sortOrder, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sortBy(): String = sortBy.getRequired("sort_by")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortOrder(): Optional<SortOrder> = sortOrder.getOptional("sort_order")

    /**
     * Returns the raw JSON value of [sortBy].
     *
     * Unlike [sortBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sort_by") @ExcludeMissing fun _sortBy(): JsonField<String> = sortBy

    /**
     * Returns the raw JSON value of [sortOrder].
     *
     * Unlike [sortOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sort_order") @ExcludeMissing fun _sortOrder(): JsonField<SortOrder> = sortOrder

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
         * [SortParamsForRunsComparisonView].
         *
         * The following fields are required:
         * ```java
         * .sortBy()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SortParamsForRunsComparisonView]. */
    class Builder internal constructor() {

        private var sortBy: JsonField<String>? = null
        private var sortOrder: JsonField<SortOrder> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sortParamsForRunsComparisonView: SortParamsForRunsComparisonView) =
            apply {
                sortBy = sortParamsForRunsComparisonView.sortBy
                sortOrder = sortParamsForRunsComparisonView.sortOrder
                additionalProperties =
                    sortParamsForRunsComparisonView.additionalProperties.toMutableMap()
            }

        fun sortBy(sortBy: String) = sortBy(JsonField.of(sortBy))

        /**
         * Sets [Builder.sortBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sortBy] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sortBy(sortBy: JsonField<String>) = apply { this.sortBy = sortBy }

        fun sortOrder(sortOrder: SortOrder) = sortOrder(JsonField.of(sortOrder))

        /**
         * Sets [Builder.sortOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sortOrder] with a well-typed [SortOrder] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sortOrder(sortOrder: JsonField<SortOrder>) = apply { this.sortOrder = sortOrder }

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
         * Returns an immutable instance of [SortParamsForRunsComparisonView].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sortBy()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SortParamsForRunsComparisonView =
            SortParamsForRunsComparisonView(
                checkRequired("sortBy", sortBy),
                sortOrder,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SortParamsForRunsComparisonView = apply {
        if (validated) {
            return@apply
        }

        sortBy()
        sortOrder().ifPresent { it.validate() }
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
        (if (sortBy.asKnown().isPresent) 1 else 0) +
            (sortOrder.asKnown().getOrNull()?.validity() ?: 0)

    class SortOrder @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ASC = of("ASC")

            @JvmField val DESC = of("DESC")

            @JvmStatic fun of(value: String) = SortOrder(JsonField.of(value))
        }

        /** An enum containing [SortOrder]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [SortOrder]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortOrder] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /**
             * An enum member indicating that [SortOrder] was instantiated with an unknown value.
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
                ASC -> Value.ASC
                DESC -> Value.DESC
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
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw LangsmithInvalidDataException("Unknown SortOrder: $value")
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

        fun validate(): SortOrder = apply {
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

            return other is SortOrder && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SortParamsForRunsComparisonView &&
            sortBy == other.sortBy &&
            sortOrder == other.sortOrder &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(sortBy, sortOrder, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SortParamsForRunsComparisonView{sortBy=$sortBy, sortOrder=$sortOrder, additionalProperties=$additionalProperties}"
}
