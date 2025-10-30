// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.public_.examples

import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.getOrThrow
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.models.api.v1.examples.ExampleSelect
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get example by ids or the shared example if not specifed. */
class ExampleListParams
private constructor(
    private val shareToken: String?,
    private val id: List<String>?,
    private val asOf: AsOf?,
    private val filter: String?,
    private val limit: Long?,
    private val metadata: String?,
    private val offset: Long?,
    private val select: List<ExampleSelect>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun shareToken(): Optional<String> = Optional.ofNullable(shareToken)

    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    /**
     * Only modifications made on or before this time are included. If None, the latest version of
     * the dataset is used.
     */
    fun asOf(): Optional<AsOf> = Optional.ofNullable(asOf)

    fun filter(): Optional<String> = Optional.ofNullable(filter)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun metadata(): Optional<String> = Optional.ofNullable(metadata)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun select(): Optional<List<ExampleSelect>> = Optional.ofNullable(select)

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

        private var shareToken: String? = null
        private var id: MutableList<String>? = null
        private var asOf: AsOf? = null
        private var filter: String? = null
        private var limit: Long? = null
        private var metadata: String? = null
        private var offset: Long? = null
        private var select: MutableList<ExampleSelect>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(exampleListParams: ExampleListParams) = apply {
            shareToken = exampleListParams.shareToken
            id = exampleListParams.id?.toMutableList()
            asOf = exampleListParams.asOf
            filter = exampleListParams.filter
            limit = exampleListParams.limit
            metadata = exampleListParams.metadata
            offset = exampleListParams.offset
            select = exampleListParams.select?.toMutableList()
            additionalHeaders = exampleListParams.additionalHeaders.toBuilder()
            additionalQueryParams = exampleListParams.additionalQueryParams.toBuilder()
        }

        fun shareToken(shareToken: String?) = apply { this.shareToken = shareToken }

        /** Alias for calling [Builder.shareToken] with `shareToken.orElse(null)`. */
        fun shareToken(shareToken: Optional<String>) = shareToken(shareToken.getOrNull())

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

        fun filter(filter: String?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

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
                shareToken,
                id?.toImmutable(),
                asOf,
                filter,
                limit,
                metadata,
                offset,
                select?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> shareToken ?: ""
            else -> ""
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
                filter?.let { put("filter", it) }
                limit?.let { put("limit", it.toString()) }
                metadata?.let { put("metadata", it) }
                offset?.let { put("offset", it.toString()) }
                select?.let { put("select", it.joinToString(",") { it.toString() }) }
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExampleListParams &&
            shareToken == other.shareToken &&
            id == other.id &&
            asOf == other.asOf &&
            filter == other.filter &&
            limit == other.limit &&
            metadata == other.metadata &&
            offset == other.offset &&
            select == other.select &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            shareToken,
            id,
            asOf,
            filter,
            limit,
            metadata,
            offset,
            select,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ExampleListParams{shareToken=$shareToken, id=$id, asOf=$asOf, filter=$filter, limit=$limit, metadata=$metadata, offset=$offset, select=$select, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
