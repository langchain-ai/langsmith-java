// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

import com.fasterxml.jackson.annotation.JsonCreator
import com.langchain.smith.core.Enum
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get all runs for a cluster job, optionally filtered by cluster. */
class InsightRetrieveRunsParams
private constructor(
    private val sessionId: String,
    private val jobId: String?,
    private val attributeSortKey: String?,
    private val attributeSortOrder: AttributeSortOrder?,
    private val clusterId: String?,
    private val limit: Long?,
    private val offset: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun sessionId(): String = sessionId

    fun jobId(): Optional<String> = Optional.ofNullable(jobId)

    fun attributeSortKey(): Optional<String> = Optional.ofNullable(attributeSortKey)

    fun attributeSortOrder(): Optional<AttributeSortOrder> = Optional.ofNullable(attributeSortOrder)

    fun clusterId(): Optional<String> = Optional.ofNullable(clusterId)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InsightRetrieveRunsParams].
         *
         * The following fields are required:
         * ```java
         * .sessionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InsightRetrieveRunsParams]. */
    class Builder internal constructor() {

        private var sessionId: String? = null
        private var jobId: String? = null
        private var attributeSortKey: String? = null
        private var attributeSortOrder: AttributeSortOrder? = null
        private var clusterId: String? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(insightRetrieveRunsParams: InsightRetrieveRunsParams) = apply {
            sessionId = insightRetrieveRunsParams.sessionId
            jobId = insightRetrieveRunsParams.jobId
            attributeSortKey = insightRetrieveRunsParams.attributeSortKey
            attributeSortOrder = insightRetrieveRunsParams.attributeSortOrder
            clusterId = insightRetrieveRunsParams.clusterId
            limit = insightRetrieveRunsParams.limit
            offset = insightRetrieveRunsParams.offset
            additionalHeaders = insightRetrieveRunsParams.additionalHeaders.toBuilder()
            additionalQueryParams = insightRetrieveRunsParams.additionalQueryParams.toBuilder()
        }

        fun sessionId(sessionId: String) = apply { this.sessionId = sessionId }

        fun jobId(jobId: String?) = apply { this.jobId = jobId }

        /** Alias for calling [Builder.jobId] with `jobId.orElse(null)`. */
        fun jobId(jobId: Optional<String>) = jobId(jobId.getOrNull())

        fun attributeSortKey(attributeSortKey: String?) = apply {
            this.attributeSortKey = attributeSortKey
        }

        /** Alias for calling [Builder.attributeSortKey] with `attributeSortKey.orElse(null)`. */
        fun attributeSortKey(attributeSortKey: Optional<String>) =
            attributeSortKey(attributeSortKey.getOrNull())

        fun attributeSortOrder(attributeSortOrder: AttributeSortOrder?) = apply {
            this.attributeSortOrder = attributeSortOrder
        }

        /**
         * Alias for calling [Builder.attributeSortOrder] with `attributeSortOrder.orElse(null)`.
         */
        fun attributeSortOrder(attributeSortOrder: Optional<AttributeSortOrder>) =
            attributeSortOrder(attributeSortOrder.getOrNull())

        fun clusterId(clusterId: String?) = apply { this.clusterId = clusterId }

        /** Alias for calling [Builder.clusterId] with `clusterId.orElse(null)`. */
        fun clusterId(clusterId: Optional<String>) = clusterId(clusterId.getOrNull())

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

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
         * Returns an immutable instance of [InsightRetrieveRunsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sessionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InsightRetrieveRunsParams =
            InsightRetrieveRunsParams(
                checkRequired("sessionId", sessionId),
                jobId,
                attributeSortKey,
                attributeSortOrder,
                clusterId,
                limit,
                offset,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> sessionId
            1 -> jobId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                attributeSortKey?.let { put("attribute_sort_key", it) }
                attributeSortOrder?.let { put("attribute_sort_order", it.toString()) }
                clusterId?.let { put("cluster_id", it) }
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class AttributeSortOrder
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ASC = of("asc")

            @JvmField val DESC = of("desc")

            @JvmStatic fun of(value: String) = AttributeSortOrder(JsonField.of(value))
        }

        /** An enum containing [AttributeSortOrder]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [AttributeSortOrder]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AttributeSortOrder] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /**
             * An enum member indicating that [AttributeSortOrder] was instantiated with an unknown
             * value.
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
                else -> throw LangsmithInvalidDataException("Unknown AttributeSortOrder: $value")
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

        fun validate(): AttributeSortOrder = apply {
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

            return other is AttributeSortOrder && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsightRetrieveRunsParams &&
            sessionId == other.sessionId &&
            jobId == other.jobId &&
            attributeSortKey == other.attributeSortKey &&
            attributeSortOrder == other.attributeSortOrder &&
            clusterId == other.clusterId &&
            limit == other.limit &&
            offset == other.offset &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            sessionId,
            jobId,
            attributeSortKey,
            attributeSortOrder,
            clusterId,
            limit,
            offset,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InsightRetrieveRunsParams{sessionId=$sessionId, jobId=$jobId, attributeSortKey=$attributeSortKey, attributeSortOrder=$attributeSortOrder, clusterId=$clusterId, limit=$limit, offset=$offset, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
