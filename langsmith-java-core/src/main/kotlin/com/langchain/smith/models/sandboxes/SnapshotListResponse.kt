// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SnapshotListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<SnapshotResponse>>,
    private val nextCursor: JsonField<String>,
    private val offset: JsonField<Long>,
    private val snapshots: JsonField<List<SnapshotResponse>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items")
        @ExcludeMissing
        items: JsonField<List<SnapshotResponse>> = JsonMissing.of(),
        @JsonProperty("next_cursor")
        @ExcludeMissing
        nextCursor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("snapshots")
        @ExcludeMissing
        snapshots: JsonField<List<SnapshotResponse>> = JsonMissing.of(),
    ) : this(items, nextCursor, offset, snapshots, mutableMapOf())

    /**
     * This page of snapshots.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun items(): Optional<List<SnapshotResponse>> = items.getOptional("items")

    /**
     * Cursor for the next page, or null on the last page. A non-null value is the only signal that
     * more pages exist. Treat it as opaque.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextCursor(): Optional<String> = nextCursor.getOptional("next_cursor")

    /**
     * Deprecated: use next_cursor. Offset to request for the next page, or 0 when no pages remain.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<Long> = offset.getOptional("offset")

    /**
     * Deprecated: use items. Duplicates items.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun snapshots(): Optional<List<SnapshotResponse>> = snapshots.getOptional("snapshots")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<SnapshotResponse>> = items

    /**
     * Returns the raw JSON value of [nextCursor].
     *
     * Unlike [nextCursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_cursor") @ExcludeMissing fun _nextCursor(): JsonField<String> = nextCursor

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

    /**
     * Returns the raw JSON value of [snapshots].
     *
     * Unlike [snapshots], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("snapshots")
    @ExcludeMissing
    fun _snapshots(): JsonField<List<SnapshotResponse>> = snapshots

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

        /** Returns a mutable builder for constructing an instance of [SnapshotListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SnapshotListResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<SnapshotResponse>>? = null
        private var nextCursor: JsonField<String> = JsonMissing.of()
        private var offset: JsonField<Long> = JsonMissing.of()
        private var snapshots: JsonField<MutableList<SnapshotResponse>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(snapshotListResponse: SnapshotListResponse) = apply {
            items = snapshotListResponse.items.map { it.toMutableList() }
            nextCursor = snapshotListResponse.nextCursor
            offset = snapshotListResponse.offset
            snapshots = snapshotListResponse.snapshots.map { it.toMutableList() }
            additionalProperties = snapshotListResponse.additionalProperties.toMutableMap()
        }

        /** This page of snapshots. */
        fun items(items: List<SnapshotResponse>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<SnapshotResponse>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun items(items: JsonField<List<SnapshotResponse>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [SnapshotResponse] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: SnapshotResponse) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        /**
         * Cursor for the next page, or null on the last page. A non-null value is the only signal
         * that more pages exist. Treat it as opaque.
         */
        fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

        /**
         * Sets [Builder.nextCursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextCursor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

        /**
         * Deprecated: use next_cursor. Offset to request for the next page, or 0 when no pages
         * remain.
         */
        fun offset(offset: Long) = offset(JsonField.of(offset))

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

        /** Deprecated: use items. Duplicates items. */
        fun snapshots(snapshots: List<SnapshotResponse>) = snapshots(JsonField.of(snapshots))

        /**
         * Sets [Builder.snapshots] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snapshots] with a well-typed `List<SnapshotResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun snapshots(snapshots: JsonField<List<SnapshotResponse>>) = apply {
            this.snapshots = snapshots.map { it.toMutableList() }
        }

        /**
         * Adds a single [SnapshotResponse] to [snapshots].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSnapshot(snapshot: SnapshotResponse) = apply {
            snapshots =
                (snapshots ?: JsonField.of(mutableListOf())).also {
                    checkKnown("snapshots", it).add(snapshot)
                }
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
         * Returns an immutable instance of [SnapshotListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SnapshotListResponse =
            SnapshotListResponse(
                (items ?: JsonMissing.of()).map { it.toImmutable() },
                nextCursor,
                offset,
                (snapshots ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): SnapshotListResponse = apply {
        if (validated) {
            return@apply
        }

        items().ifPresent { it.forEach { it.validate() } }
        nextCursor()
        offset()
        snapshots().ifPresent { it.forEach { it.validate() } }
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextCursor.asKnown().isPresent) 1 else 0) +
            (if (offset.asKnown().isPresent) 1 else 0) +
            (snapshots.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SnapshotListResponse &&
            items == other.items &&
            nextCursor == other.nextCursor &&
            offset == other.offset &&
            snapshots == other.snapshots &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(items, nextCursor, offset, snapshots, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SnapshotListResponse{items=$items, nextCursor=$nextCursor, offset=$offset, snapshots=$snapshots, additionalProperties=$additionalProperties}"
}
