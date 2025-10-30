// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples

import com.fasterxml.jackson.annotation.JsonCreator
import com.langchain.smith.core.Enum
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.Params
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get all examples by query params */
class ExampleListParams
private constructor(
    private val id: List<String>?,
    private val asOf: AsOf?,
    private val dataset: String?,
    private val descending: Boolean?,
    private val filter: String?,
    private val fullTextContains: List<String>?,
    private val limit: Long?,
    private val metadata: String?,
    private val offset: Long?,
    private val order: Order?,
    private val randomSeed: Double?,
    private val select: List<ExampleSelect>?,
    private val splits: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    /**
     * Only modifications made on or before this time are included. If None, the latest version of
     * the dataset is used.
     */
    fun asOf(): Optional<AsOf> = Optional.ofNullable(asOf)

    fun dataset(): Optional<String> = Optional.ofNullable(dataset)

    fun descending(): Optional<Boolean> = Optional.ofNullable(descending)

    fun filter(): Optional<String> = Optional.ofNullable(filter)

    fun fullTextContains(): Optional<List<String>> = Optional.ofNullable(fullTextContains)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun metadata(): Optional<String> = Optional.ofNullable(metadata)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun order(): Optional<Order> = Optional.ofNullable(order)

    fun randomSeed(): Optional<Double> = Optional.ofNullable(randomSeed)

    fun select(): Optional<List<ExampleSelect>> = Optional.ofNullable(select)

    fun splits(): Optional<List<String>> = Optional.ofNullable(splits)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ExampleListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ExampleListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExampleListParams]. */
    class Builder internal constructor() {

        private var id: MutableList<String>? = null
        private var asOf: AsOf? = null
        private var dataset: String? = null
        private var descending: Boolean? = null
        private var filter: String? = null
        private var fullTextContains: MutableList<String>? = null
        private var limit: Long? = null
        private var metadata: String? = null
        private var offset: Long? = null
        private var order: Order? = null
        private var randomSeed: Double? = null
        private var select: MutableList<ExampleSelect>? = null
        private var splits: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(exampleListParams: ExampleListParams) = apply {
            id = exampleListParams.id?.toMutableList()
            asOf = exampleListParams.asOf
            dataset = exampleListParams.dataset
            descending = exampleListParams.descending
            filter = exampleListParams.filter
            fullTextContains = exampleListParams.fullTextContains?.toMutableList()
            limit = exampleListParams.limit
            metadata = exampleListParams.metadata
            offset = exampleListParams.offset
            order = exampleListParams.order
            randomSeed = exampleListParams.randomSeed
            select = exampleListParams.select?.toMutableList()
            splits = exampleListParams.splits?.toMutableList()
            additionalHeaders = exampleListParams.additionalHeaders.toBuilder()
            additionalQueryParams = exampleListParams.additionalQueryParams.toBuilder()
        }

        fun id(id: List<String>?) = apply { this.id = id?.toMutableList() }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<List<String>>) = id(id.getOrNull())

        /**
         * Adds a single [String] to [Builder.id].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { this.id = (this.id ?: mutableListOf()).apply { add(id) } }

        /**
         * Only modifications made on or before this time are included. If None, the latest version
         * of the dataset is used.
         */
        fun asOf(asOf: AsOf?) = apply { this.asOf = asOf }

        /** Alias for calling [Builder.asOf] with `asOf.orElse(null)`. */
        fun asOf(asOf: Optional<AsOf>) = asOf(asOf.getOrNull())

        /** Alias for calling [asOf] with `AsOf.ofOffsetDateTime(offsetDateTime)`. */
        fun asOf(offsetDateTime: OffsetDateTime) = asOf(AsOf.ofOffsetDateTime(offsetDateTime))

        /** Alias for calling [asOf] with `AsOf.ofString(string)`. */
        fun asOf(string: String) = asOf(AsOf.ofString(string))

        fun dataset(dataset: String?) = apply { this.dataset = dataset }

        /** Alias for calling [Builder.dataset] with `dataset.orElse(null)`. */
        fun dataset(dataset: Optional<String>) = dataset(dataset.getOrNull())

        fun descending(descending: Boolean?) = apply { this.descending = descending }

        /**
         * Alias for [Builder.descending].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun descending(descending: Boolean) = descending(descending as Boolean?)

        /** Alias for calling [Builder.descending] with `descending.orElse(null)`. */
        fun descending(descending: Optional<Boolean>) = descending(descending.getOrNull())

        fun filter(filter: String?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

        fun fullTextContains(fullTextContains: List<String>?) = apply {
            this.fullTextContains = fullTextContains?.toMutableList()
        }

        /** Alias for calling [Builder.fullTextContains] with `fullTextContains.orElse(null)`. */
        fun fullTextContains(fullTextContains: Optional<List<String>>) =
            fullTextContains(fullTextContains.getOrNull())

        /**
         * Adds a single [String] to [fullTextContains].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFullTextContain(fullTextContain: String) = apply {
            fullTextContains = (fullTextContains ?: mutableListOf()).apply { add(fullTextContain) }
        }

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        fun metadata(metadata: String?) = apply { this.metadata = metadata }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<String>) = metadata(metadata.getOrNull())

        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        fun order(order: Order?) = apply { this.order = order }

        /** Alias for calling [Builder.order] with `order.orElse(null)`. */
        fun order(order: Optional<Order>) = order(order.getOrNull())

        fun randomSeed(randomSeed: Double?) = apply { this.randomSeed = randomSeed }

        /**
         * Alias for [Builder.randomSeed].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun randomSeed(randomSeed: Double) = randomSeed(randomSeed as Double?)

        /** Alias for calling [Builder.randomSeed] with `randomSeed.orElse(null)`. */
        fun randomSeed(randomSeed: Optional<Double>) = randomSeed(randomSeed.getOrNull())

        fun select(select: List<ExampleSelect>?) = apply { this.select = select?.toMutableList() }

        /** Alias for calling [Builder.select] with `select.orElse(null)`. */
        fun select(select: Optional<List<ExampleSelect>>) = select(select.getOrNull())

        /**
         * Adds a single [ExampleSelect] to [Builder.select].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSelect(select: ExampleSelect) = apply {
            this.select = (this.select ?: mutableListOf()).apply { add(select) }
        }

        fun splits(splits: List<String>?) = apply { this.splits = splits?.toMutableList() }

        /** Alias for calling [Builder.splits] with `splits.orElse(null)`. */
        fun splits(splits: Optional<List<String>>) = splits(splits.getOrNull())

        /**
         * Adds a single [String] to [splits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSplit(split: String) = apply {
            splits = (splits ?: mutableListOf()).apply { add(split) }
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ExampleListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExampleListParams =
            ExampleListParams(
                id?.toImmutable(),
                asOf,
                dataset,
                descending,
                filter,
                fullTextContains?.toImmutable(),
                limit,
                metadata,
                offset,
                order,
                randomSeed,
                select?.toImmutable(),
                splits?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                id?.let { put("id", it.joinToString(",")) }
                asOf?.accept(
                    object : AsOf.Visitor<Unit> {
                        override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) {
                            put(
                                "as_of",
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(offsetDateTime),
                            )
                        }

                        override fun visitString(string: String) {
                            put("as_of", string)
                        }
                    }
                )
                dataset?.let { put("dataset", it) }
                descending?.let { put("descending", it.toString()) }
                filter?.let { put("filter", it) }
                fullTextContains?.let { put("full_text_contains", it.joinToString(",")) }
                limit?.let { put("limit", it.toString()) }
                metadata?.let { put("metadata", it) }
                offset?.let { put("offset", it.toString()) }
                order?.let { put("order", it.toString()) }
                randomSeed?.let { put("random_seed", it.toString()) }
                select?.let { put("select", it.joinToString(",") { it.toString() }) }
                splits?.let { put("splits", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Only modifications made on or before this time are included. If None, the latest version of
     * the dataset is used.
     */
    class AsOf
    private constructor(
        private val offsetDateTime: OffsetDateTime? = null,
        private val string: String? = null,
    ) {

        fun offsetDateTime(): Optional<OffsetDateTime> = Optional.ofNullable(offsetDateTime)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isOffsetDateTime(): Boolean = offsetDateTime != null

        fun isString(): Boolean = string != null

        fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

        fun asString(): String = string.getOrThrow("string")

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                string != null -> visitor.visitString(string)
                else -> throw IllegalStateException("Invalid AsOf")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AsOf && offsetDateTime == other.offsetDateTime && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(offsetDateTime, string)

        override fun toString(): String =
            when {
                offsetDateTime != null -> "AsOf{offsetDateTime=$offsetDateTime}"
                string != null -> "AsOf{string=$string}"
                else -> throw IllegalStateException("Invalid AsOf")
            }

        companion object {

            @JvmStatic
            fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                AsOf(offsetDateTime = offsetDateTime)

            @JvmStatic fun ofString(string: String) = AsOf(string = string)
        }

        /** An interface that defines how to map each variant of [AsOf] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

            fun visitString(string: String): T
        }
    }

    class Order @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val RECENT = of("recent")

            @JvmField val RANDOM = of("random")

            @JvmField val RECENTLY_CREATED = of("recently_created")

            @JvmField val ID = of("id")

            @JvmStatic fun of(value: String) = Order(JsonField.of(value))
        }

        /** An enum containing [Order]'s known values. */
        enum class Known {
            RECENT,
            RANDOM,
            RECENTLY_CREATED,
            ID,
        }

        /**
         * An enum containing [Order]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Order] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RECENT,
            RANDOM,
            RECENTLY_CREATED,
            ID,
            /** An enum member indicating that [Order] was instantiated with an unknown value. */
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
                RECENT -> Value.RECENT
                RANDOM -> Value.RANDOM
                RECENTLY_CREATED -> Value.RECENTLY_CREATED
                ID -> Value.ID
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
                RECENT -> Known.RECENT
                RANDOM -> Known.RANDOM
                RECENTLY_CREATED -> Known.RECENTLY_CREATED
                ID -> Known.ID
                else -> throw LangsmithInvalidDataException("Unknown Order: $value")
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

        fun validate(): Order = apply {
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

            return other is Order && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExampleListParams &&
            id == other.id &&
            asOf == other.asOf &&
            dataset == other.dataset &&
            descending == other.descending &&
            filter == other.filter &&
            fullTextContains == other.fullTextContains &&
            limit == other.limit &&
            metadata == other.metadata &&
            offset == other.offset &&
            order == other.order &&
            randomSeed == other.randomSeed &&
            select == other.select &&
            splits == other.splits &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            asOf,
            dataset,
            descending,
            filter,
            fullTextContains,
            limit,
            metadata,
            offset,
            order,
            randomSeed,
            select,
            splits,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ExampleListParams{id=$id, asOf=$asOf, dataset=$dataset, descending=$descending, filter=$filter, fullTextContains=$fullTextContains, limit=$limit, metadata=$metadata, offset=$offset, order=$order, randomSeed=$randomSeed, select=$select, splits=$splits, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
