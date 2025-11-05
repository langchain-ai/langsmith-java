// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedbackconfigs

import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List Feedback Configs Endpoint */
class FeedbackConfigRetrieveFeedbackConfigsParams
private constructor(
    private val key: List<String>?,
    private val readAfterWrite: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun key(): Optional<List<String>> = Optional.ofNullable(key)

    fun readAfterWrite(): Optional<Boolean> = Optional.ofNullable(readAfterWrite)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FeedbackConfigRetrieveFeedbackConfigsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [FeedbackConfigRetrieveFeedbackConfigsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedbackConfigRetrieveFeedbackConfigsParams]. */
    class Builder internal constructor() {

        private var key: MutableList<String>? = null
        private var readAfterWrite: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            feedbackConfigRetrieveFeedbackConfigsParams: FeedbackConfigRetrieveFeedbackConfigsParams
        ) = apply {
            key = feedbackConfigRetrieveFeedbackConfigsParams.key?.toMutableList()
            readAfterWrite = feedbackConfigRetrieveFeedbackConfigsParams.readAfterWrite
            additionalHeaders =
                feedbackConfigRetrieveFeedbackConfigsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                feedbackConfigRetrieveFeedbackConfigsParams.additionalQueryParams.toBuilder()
        }

        fun key(key: List<String>?) = apply { this.key = key?.toMutableList() }

        /** Alias for calling [Builder.key] with `key.orElse(null)`. */
        fun key(key: Optional<List<String>>) = key(key.getOrNull())

        /**
         * Adds a single [String] to [Builder.key].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKey(key: String) = apply {
            this.key = (this.key ?: mutableListOf()).apply { add(key) }
        }

        fun readAfterWrite(readAfterWrite: Boolean?) = apply {
            this.readAfterWrite = readAfterWrite
        }

        /**
         * Alias for [Builder.readAfterWrite].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun readAfterWrite(readAfterWrite: Boolean) = readAfterWrite(readAfterWrite as Boolean?)

        /** Alias for calling [Builder.readAfterWrite] with `readAfterWrite.orElse(null)`. */
        fun readAfterWrite(readAfterWrite: Optional<Boolean>) =
            readAfterWrite(readAfterWrite.getOrNull())

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
         * Returns an immutable instance of [FeedbackConfigRetrieveFeedbackConfigsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FeedbackConfigRetrieveFeedbackConfigsParams =
            FeedbackConfigRetrieveFeedbackConfigsParams(
                key?.toImmutable(),
                readAfterWrite,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                key?.let { put("key", it.joinToString(",")) }
                readAfterWrite?.let { put("read_after_write", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackConfigRetrieveFeedbackConfigsParams &&
            key == other.key &&
            readAfterWrite == other.readAfterWrite &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(key, readAfterWrite, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FeedbackConfigRetrieveFeedbackConfigsParams{key=$key, readAfterWrite=$readAfterWrite, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
