// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.examples

import com.langchain.smith.core.Params
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Count all examples by query params */
class ExampleRetrieveCountParams
private constructor(
    private val shareToken: String?,
    private val id: List<String>?,
    private val asOf: AsOf?,
    private val filter: String?,
    private val metadata: String?,
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

    fun metadata(): Optional<String> = Optional.ofNullable(metadata)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ExampleRetrieveCountParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ExampleRetrieveCountParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExampleRetrieveCountParams]. */
    class Builder internal constructor() {

        private var shareToken: String? = null
        private var id: MutableList<String>? = null
        private var asOf: AsOf? = null
        private var filter: String? = null
        private var metadata: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(exampleRetrieveCountParams: ExampleRetrieveCountParams) = apply {
            shareToken = exampleRetrieveCountParams.shareToken
            id = exampleRetrieveCountParams.id?.toMutableList()
            asOf = exampleRetrieveCountParams.asOf
            filter = exampleRetrieveCountParams.filter
            metadata = exampleRetrieveCountParams.metadata
            additionalHeaders = exampleRetrieveCountParams.additionalHeaders.toBuilder()
            additionalQueryParams = exampleRetrieveCountParams.additionalQueryParams.toBuilder()
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

        fun metadata(metadata: String?) = apply { this.metadata = metadata }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<String>) = metadata(metadata.getOrNull())

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
         * Returns an immutable instance of [ExampleRetrieveCountParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExampleRetrieveCountParams =
            ExampleRetrieveCountParams(
                shareToken,
                id?.toImmutable(),
                asOf,
                filter,
                metadata,
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
                metadata?.let { put("metadata", it) }
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

        return other is ExampleRetrieveCountParams &&
            shareToken == other.shareToken &&
            id == other.id &&
            asOf == other.asOf &&
            filter == other.filter &&
            metadata == other.metadata &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            shareToken,
            id,
            asOf,
            filter,
            metadata,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ExampleRetrieveCountParams{shareToken=$shareToken, id=$id, asOf=$asOf, filter=$filter, metadata=$metadata, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
