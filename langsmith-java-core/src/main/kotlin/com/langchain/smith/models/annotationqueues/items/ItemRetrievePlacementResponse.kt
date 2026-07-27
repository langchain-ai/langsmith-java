// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ItemRetrievePlacementResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cursor: JsonField<String>,
    private val itemType: JsonField<ItemType>,
    private val position: JsonField<Long>,
    private val section: JsonField<Section>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("item_type") @ExcludeMissing itemType: JsonField<ItemType> = JsonMissing.of(),
        @JsonProperty("position") @ExcludeMissing position: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("section") @ExcludeMissing section: JsonField<Section> = JsonMissing.of(),
    ) : this(cursor, itemType, position, section, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cursor(): Optional<String> = cursor.getOptional("cursor")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun itemType(): Optional<ItemType> = itemType.getOptional("item_type")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun position(): Optional<Long> = position.getOptional("position")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun section(): Optional<Section> = section.getOptional("section")

    /**
     * Returns the raw JSON value of [cursor].
     *
     * Unlike [cursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cursor") @ExcludeMissing fun _cursor(): JsonField<String> = cursor

    /**
     * Returns the raw JSON value of [itemType].
     *
     * Unlike [itemType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("item_type") @ExcludeMissing fun _itemType(): JsonField<ItemType> = itemType

    /**
     * Returns the raw JSON value of [position].
     *
     * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("position") @ExcludeMissing fun _position(): JsonField<Long> = position

    /**
     * Returns the raw JSON value of [section].
     *
     * Unlike [section], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("section") @ExcludeMissing fun _section(): JsonField<Section> = section

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
         * [ItemRetrievePlacementResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ItemRetrievePlacementResponse]. */
    class Builder internal constructor() {

        private var cursor: JsonField<String> = JsonMissing.of()
        private var itemType: JsonField<ItemType> = JsonMissing.of()
        private var position: JsonField<Long> = JsonMissing.of()
        private var section: JsonField<Section> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(itemRetrievePlacementResponse: ItemRetrievePlacementResponse) = apply {
            cursor = itemRetrievePlacementResponse.cursor
            itemType = itemRetrievePlacementResponse.itemType
            position = itemRetrievePlacementResponse.position
            section = itemRetrievePlacementResponse.section
            additionalProperties = itemRetrievePlacementResponse.additionalProperties.toMutableMap()
        }

        fun cursor(cursor: String) = cursor(JsonField.of(cursor))

        /**
         * Sets [Builder.cursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cursor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cursor(cursor: JsonField<String>) = apply { this.cursor = cursor }

        fun itemType(itemType: ItemType) = itemType(JsonField.of(itemType))

        /**
         * Sets [Builder.itemType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.itemType] with a well-typed [ItemType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun itemType(itemType: JsonField<ItemType>) = apply { this.itemType = itemType }

        fun position(position: Long) = position(JsonField.of(position))

        /**
         * Sets [Builder.position] to an arbitrary JSON value.
         *
         * You should usually call [Builder.position] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun position(position: JsonField<Long>) = apply { this.position = position }

        fun section(section: Section) = section(JsonField.of(section))

        /**
         * Sets [Builder.section] to an arbitrary JSON value.
         *
         * You should usually call [Builder.section] with a well-typed [Section] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun section(section: JsonField<Section>) = apply { this.section = section }

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
         * Returns an immutable instance of [ItemRetrievePlacementResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ItemRetrievePlacementResponse =
            ItemRetrievePlacementResponse(
                cursor,
                itemType,
                position,
                section,
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
    fun validate(): ItemRetrievePlacementResponse = apply {
        if (validated) {
            return@apply
        }

        cursor()
        itemType().ifPresent { it.validate() }
        position()
        section().ifPresent { it.validate() }
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
        (if (cursor.asKnown().isPresent) 1 else 0) +
            (itemType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (position.asKnown().isPresent) 1 else 0) +
            (section.asKnown().getOrNull()?.validity() ?: 0)

    class ItemType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val RUN = of("RUN")

            @JvmField val THREAD = of("THREAD")

            @JvmStatic fun of(value: String) = ItemType(JsonField.of(value))
        }

        /** An enum containing [ItemType]'s known values. */
        enum class Known {
            RUN,
            THREAD,
        }

        /**
         * An enum containing [ItemType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ItemType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RUN,
            THREAD,
            /** An enum member indicating that [ItemType] was instantiated with an unknown value. */
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
                RUN -> Value.RUN
                THREAD -> Value.THREAD
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
                RUN -> Known.RUN
                THREAD -> Known.THREAD
                else -> throw LangChainInvalidDataException("Unknown ItemType: $value")
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
        fun validate(): ItemType = apply {
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

            return other is ItemType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Section @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NEEDS_MY_REVIEW = of("needs_my_review")

            @JvmField val NEEDS_OTHERS_REVIEW = of("needs_others_review")

            @JvmField val ARCHIVED = of("archived")

            @JvmStatic fun of(value: String) = Section(JsonField.of(value))
        }

        /** An enum containing [Section]'s known values. */
        enum class Known {
            NEEDS_MY_REVIEW,
            NEEDS_OTHERS_REVIEW,
            ARCHIVED,
        }

        /**
         * An enum containing [Section]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Section] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NEEDS_MY_REVIEW,
            NEEDS_OTHERS_REVIEW,
            ARCHIVED,
            /** An enum member indicating that [Section] was instantiated with an unknown value. */
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
                NEEDS_MY_REVIEW -> Value.NEEDS_MY_REVIEW
                NEEDS_OTHERS_REVIEW -> Value.NEEDS_OTHERS_REVIEW
                ARCHIVED -> Value.ARCHIVED
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
                NEEDS_MY_REVIEW -> Known.NEEDS_MY_REVIEW
                NEEDS_OTHERS_REVIEW -> Known.NEEDS_OTHERS_REVIEW
                ARCHIVED -> Known.ARCHIVED
                else -> throw LangChainInvalidDataException("Unknown Section: $value")
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
        fun validate(): Section = apply {
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

            return other is Section && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ItemRetrievePlacementResponse &&
            cursor == other.cursor &&
            itemType == other.itemType &&
            position == other.position &&
            section == other.section &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(cursor, itemType, position, section, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ItemRetrievePlacementResponse{cursor=$cursor, itemType=$itemType, position=$position, section=$section, additionalProperties=$additionalProperties}"
}
