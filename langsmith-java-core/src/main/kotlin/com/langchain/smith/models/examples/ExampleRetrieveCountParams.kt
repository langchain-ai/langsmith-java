// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples

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
    private val id: List<String>?,
    private val asOf: AsOf?,
    private val dataset: String?,
    private val filter: String?,
    private val fullTextContains: List<String>?,
    private val metadata: String?,
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

    fun filter(): Optional<String> = Optional.ofNullable(filter)

    fun fullTextContains(): Optional<List<String>> = Optional.ofNullable(fullTextContains)

    fun metadata(): Optional<String> = Optional.ofNullable(metadata)

    fun splits(): Optional<List<String>> = Optional.ofNullable(splits)

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

        private var id: MutableList<String>? = null
        private var asOf: AsOf? = null
        private var dataset: String? = null
        private var filter: String? = null
        private var fullTextContains: MutableList<String>? = null
        private var metadata: String? = null
        private var splits: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(exampleRetrieveCountParams: ExampleRetrieveCountParams) = apply {
            id = exampleRetrieveCountParams.id?.toMutableList()
            asOf = exampleRetrieveCountParams.asOf
            dataset = exampleRetrieveCountParams.dataset
            filter = exampleRetrieveCountParams.filter
            fullTextContains = exampleRetrieveCountParams.fullTextContains?.toMutableList()
            metadata = exampleRetrieveCountParams.metadata
            splits = exampleRetrieveCountParams.splits?.toMutableList()
            additionalHeaders = exampleRetrieveCountParams.additionalHeaders.toBuilder()
            additionalQueryParams = exampleRetrieveCountParams.additionalQueryParams.toBuilder()
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

        fun metadata(metadata: String?) = apply { this.metadata = metadata }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<String>) = metadata(metadata.getOrNull())

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
         * Returns an immutable instance of [ExampleRetrieveCountParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExampleRetrieveCountParams =
            ExampleRetrieveCountParams(
                id?.toImmutable(),
                asOf,
                dataset,
                filter,
                fullTextContains?.toImmutable(),
                metadata,
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
                filter?.let { put("filter", it) }
                fullTextContains?.let { put("full_text_contains", it.joinToString(",")) }
                metadata?.let { put("metadata", it) }
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExampleRetrieveCountParams &&
            id == other.id &&
            asOf == other.asOf &&
            dataset == other.dataset &&
            filter == other.filter &&
            fullTextContains == other.fullTextContains &&
            metadata == other.metadata &&
            splits == other.splits &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            asOf,
            dataset,
            filter,
            fullTextContains,
            metadata,
            splits,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ExampleRetrieveCountParams{id=$id, asOf=$asOf, dataset=$dataset, filter=$filter, fullTextContains=$fullTextContains, metadata=$metadata, splits=$splits, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
