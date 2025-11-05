// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback

import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a specific feedback. */
class FeedbackRetrieveParams
private constructor(
    private val feedbackId: String?,
    private val includeUserNames: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun feedbackId(): Optional<String> = Optional.ofNullable(feedbackId)

    fun includeUserNames(): Optional<Boolean> = Optional.ofNullable(includeUserNames)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FeedbackRetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FeedbackRetrieveParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedbackRetrieveParams]. */
    class Builder internal constructor() {

        private var feedbackId: String? = null
        private var includeUserNames: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(feedbackRetrieveParams: FeedbackRetrieveParams) = apply {
            feedbackId = feedbackRetrieveParams.feedbackId
            includeUserNames = feedbackRetrieveParams.includeUserNames
            additionalHeaders = feedbackRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = feedbackRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun feedbackId(feedbackId: String?) = apply { this.feedbackId = feedbackId }

        /** Alias for calling [Builder.feedbackId] with `feedbackId.orElse(null)`. */
        fun feedbackId(feedbackId: Optional<String>) = feedbackId(feedbackId.getOrNull())

        fun includeUserNames(includeUserNames: Boolean?) = apply {
            this.includeUserNames = includeUserNames
        }

        /**
         * Alias for [Builder.includeUserNames].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeUserNames(includeUserNames: Boolean) =
            includeUserNames(includeUserNames as Boolean?)

        /** Alias for calling [Builder.includeUserNames] with `includeUserNames.orElse(null)`. */
        fun includeUserNames(includeUserNames: Optional<Boolean>) =
            includeUserNames(includeUserNames.getOrNull())

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
         * Returns an immutable instance of [FeedbackRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FeedbackRetrieveParams =
            FeedbackRetrieveParams(
                feedbackId,
                includeUserNames,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> feedbackId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeUserNames?.let { put("include_user_names", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackRetrieveParams &&
            feedbackId == other.feedbackId &&
            includeUserNames == other.includeUserNames &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(feedbackId, includeUserNames, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FeedbackRetrieveParams{feedbackId=$feedbackId, includeUserNames=$includeUserNames, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
