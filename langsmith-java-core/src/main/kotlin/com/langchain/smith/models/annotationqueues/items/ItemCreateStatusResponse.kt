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

class ItemCreateStatusResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val isArchived: JsonField<Boolean>,
    private val overrideAddedAt: JsonField<String>,
    private val queueItemId: JsonField<String>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("is_archived")
        @ExcludeMissing
        isArchived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("override_added_at")
        @ExcludeMissing
        overrideAddedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("queue_item_id")
        @ExcludeMissing
        queueItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(isArchived, overrideAddedAt, queueItemId, status, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isArchived(): Optional<Boolean> = isArchived.getOptional("is_archived")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overrideAddedAt(): Optional<String> = overrideAddedAt.getOptional("override_added_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun queueItemId(): Optional<String> = queueItemId.getOptional("queue_item_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [isArchived].
     *
     * Unlike [isArchived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_archived") @ExcludeMissing fun _isArchived(): JsonField<Boolean> = isArchived

    /**
     * Returns the raw JSON value of [overrideAddedAt].
     *
     * Unlike [overrideAddedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("override_added_at")
    @ExcludeMissing
    fun _overrideAddedAt(): JsonField<String> = overrideAddedAt

    /**
     * Returns the raw JSON value of [queueItemId].
     *
     * Unlike [queueItemId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("queue_item_id")
    @ExcludeMissing
    fun _queueItemId(): JsonField<String> = queueItemId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

        /** Returns a mutable builder for constructing an instance of [ItemCreateStatusResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ItemCreateStatusResponse]. */
    class Builder internal constructor() {

        private var isArchived: JsonField<Boolean> = JsonMissing.of()
        private var overrideAddedAt: JsonField<String> = JsonMissing.of()
        private var queueItemId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(itemCreateStatusResponse: ItemCreateStatusResponse) = apply {
            isArchived = itemCreateStatusResponse.isArchived
            overrideAddedAt = itemCreateStatusResponse.overrideAddedAt
            queueItemId = itemCreateStatusResponse.queueItemId
            status = itemCreateStatusResponse.status
            additionalProperties = itemCreateStatusResponse.additionalProperties.toMutableMap()
        }

        fun isArchived(isArchived: Boolean) = isArchived(JsonField.of(isArchived))

        /**
         * Sets [Builder.isArchived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isArchived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isArchived(isArchived: JsonField<Boolean>) = apply { this.isArchived = isArchived }

        fun overrideAddedAt(overrideAddedAt: String) =
            overrideAddedAt(JsonField.of(overrideAddedAt))

        /**
         * Sets [Builder.overrideAddedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overrideAddedAt] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun overrideAddedAt(overrideAddedAt: JsonField<String>) = apply {
            this.overrideAddedAt = overrideAddedAt
        }

        fun queueItemId(queueItemId: String) = queueItemId(JsonField.of(queueItemId))

        /**
         * Sets [Builder.queueItemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queueItemId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun queueItemId(queueItemId: JsonField<String>) = apply { this.queueItemId = queueItemId }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [ItemCreateStatusResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ItemCreateStatusResponse =
            ItemCreateStatusResponse(
                isArchived,
                overrideAddedAt,
                queueItemId,
                status,
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
    fun validate(): ItemCreateStatusResponse = apply {
        if (validated) {
            return@apply
        }

        isArchived()
        overrideAddedAt()
        queueItemId()
        status().ifPresent { it.validate() }
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
        (if (isArchived.asKnown().isPresent) 1 else 0) +
            (if (overrideAddedAt.asKnown().isPresent) 1 else 0) +
            (if (queueItemId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val VIEWED = of("viewed")

            @JvmField val COMPLETED = of("completed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            VIEWED,
            COMPLETED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VIEWED,
            COMPLETED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                VIEWED -> Value.VIEWED
                COMPLETED -> Value.COMPLETED
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
                VIEWED -> Known.VIEWED
                COMPLETED -> Known.COMPLETED
                else -> throw LangChainInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ItemCreateStatusResponse &&
            isArchived == other.isArchived &&
            overrideAddedAt == other.overrideAddedAt &&
            queueItemId == other.queueItemId &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(isArchived, overrideAddedAt, queueItemId, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ItemCreateStatusResponse{isArchived=$isArchived, overrideAddedAt=$overrideAddedAt, queueItemId=$queueItemId, status=$status, additionalProperties=$additionalProperties}"
}
