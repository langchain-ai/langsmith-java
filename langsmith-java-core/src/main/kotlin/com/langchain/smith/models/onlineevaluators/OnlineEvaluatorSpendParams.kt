// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns per-day LLM evaluator spend for the requested 7-day period, grouped by evaluator,
 * resource, or run rule. Exactly one of group_by, evaluator_id, session_id, or dataset_id is
 * required. resource_id, type, and feedback_key may be supplied with group_by to narrow listing
 * aggregations.
 */
class OnlineEvaluatorSpendParams
private constructor(
    private val periodStart: String,
    private val datasetId: String?,
    private val evaluatorId: String?,
    private val feedbackKey: String?,
    private val groupBy: String?,
    private val resourceId: List<String>?,
    private val sessionId: String?,
    private val type: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Start of the 7-day window (YYYY-MM-DD). */
    fun periodStart(): String = periodStart

    /** Filter to a specific dataset (UUID). Mutually exclusive with group_by. */
    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    /** Filter to a specific evaluator (UUID). Mutually exclusive with group_by. */
    fun evaluatorId(): Optional<String> = Optional.ofNullable(evaluatorId)

    /** Filter grouped results by evaluator feedback key. Only valid with group_by. */
    fun feedbackKey(): Optional<String> = Optional.ofNullable(feedbackKey)

    /**
     * Aggregation mode: 'evaluator', 'resource', or 'run_rule'. Mutually exclusive with entity
     * filters.
     */
    fun groupBy(): Optional<String> = Optional.ofNullable(groupBy)

    /**
     * Filter grouped results to evaluators attached to all supplied project or dataset IDs. Only
     * valid with group_by.
     */
    fun resourceId(): Optional<List<String>> = Optional.ofNullable(resourceId)

    /** Filter to a specific project (UUID). Mutually exclusive with group_by. */
    fun sessionId(): Optional<String> = Optional.ofNullable(sessionId)

    /** Filter grouped results by evaluator type: 'llm' or 'code'. Only valid with group_by. */
    fun type(): Optional<String> = Optional.ofNullable(type)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnlineEvaluatorSpendParams].
         *
         * The following fields are required:
         * ```java
         * .periodStart()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnlineEvaluatorSpendParams]. */
    class Builder internal constructor() {

        private var periodStart: String? = null
        private var datasetId: String? = null
        private var evaluatorId: String? = null
        private var feedbackKey: String? = null
        private var groupBy: String? = null
        private var resourceId: MutableList<String>? = null
        private var sessionId: String? = null
        private var type: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(onlineEvaluatorSpendParams: OnlineEvaluatorSpendParams) = apply {
            periodStart = onlineEvaluatorSpendParams.periodStart
            datasetId = onlineEvaluatorSpendParams.datasetId
            evaluatorId = onlineEvaluatorSpendParams.evaluatorId
            feedbackKey = onlineEvaluatorSpendParams.feedbackKey
            groupBy = onlineEvaluatorSpendParams.groupBy
            resourceId = onlineEvaluatorSpendParams.resourceId?.toMutableList()
            sessionId = onlineEvaluatorSpendParams.sessionId
            type = onlineEvaluatorSpendParams.type
            additionalHeaders = onlineEvaluatorSpendParams.additionalHeaders.toBuilder()
            additionalQueryParams = onlineEvaluatorSpendParams.additionalQueryParams.toBuilder()
        }

        /** Start of the 7-day window (YYYY-MM-DD). */
        fun periodStart(periodStart: String) = apply { this.periodStart = periodStart }

        /** Filter to a specific dataset (UUID). Mutually exclusive with group_by. */
        fun datasetId(datasetId: String?) = apply { this.datasetId = datasetId }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /** Filter to a specific evaluator (UUID). Mutually exclusive with group_by. */
        fun evaluatorId(evaluatorId: String?) = apply { this.evaluatorId = evaluatorId }

        /** Alias for calling [Builder.evaluatorId] with `evaluatorId.orElse(null)`. */
        fun evaluatorId(evaluatorId: Optional<String>) = evaluatorId(evaluatorId.getOrNull())

        /** Filter grouped results by evaluator feedback key. Only valid with group_by. */
        fun feedbackKey(feedbackKey: String?) = apply { this.feedbackKey = feedbackKey }

        /** Alias for calling [Builder.feedbackKey] with `feedbackKey.orElse(null)`. */
        fun feedbackKey(feedbackKey: Optional<String>) = feedbackKey(feedbackKey.getOrNull())

        /**
         * Aggregation mode: 'evaluator', 'resource', or 'run_rule'. Mutually exclusive with entity
         * filters.
         */
        fun groupBy(groupBy: String?) = apply { this.groupBy = groupBy }

        /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
        fun groupBy(groupBy: Optional<String>) = groupBy(groupBy.getOrNull())

        /**
         * Filter grouped results to evaluators attached to all supplied project or dataset IDs.
         * Only valid with group_by.
         */
        fun resourceId(resourceId: List<String>?) = apply {
            this.resourceId = resourceId?.toMutableList()
        }

        /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
        fun resourceId(resourceId: Optional<List<String>>) = resourceId(resourceId.getOrNull())

        /**
         * Adds a single [String] to [Builder.resourceId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResourceId(resourceId: String) = apply {
            this.resourceId = (this.resourceId ?: mutableListOf()).apply { add(resourceId) }
        }

        /** Filter to a specific project (UUID). Mutually exclusive with group_by. */
        fun sessionId(sessionId: String?) = apply { this.sessionId = sessionId }

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

        /** Filter grouped results by evaluator type: 'llm' or 'code'. Only valid with group_by. */
        fun type(type: String?) = apply { this.type = type }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<String>) = type(type.getOrNull())

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
         * Returns an immutable instance of [OnlineEvaluatorSpendParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .periodStart()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OnlineEvaluatorSpendParams =
            OnlineEvaluatorSpendParams(
                checkRequired("periodStart", periodStart),
                datasetId,
                evaluatorId,
                feedbackKey,
                groupBy,
                resourceId?.toImmutable(),
                sessionId,
                type,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("period_start", periodStart)
                datasetId?.let { put("dataset_id", it) }
                evaluatorId?.let { put("evaluator_id", it) }
                feedbackKey?.let { put("feedback_key", it) }
                groupBy?.let { put("group_by", it) }
                resourceId?.forEach { put("resource_id", it) }
                sessionId?.let { put("session_id", it) }
                type?.let { put("type", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnlineEvaluatorSpendParams &&
            periodStart == other.periodStart &&
            datasetId == other.datasetId &&
            evaluatorId == other.evaluatorId &&
            feedbackKey == other.feedbackKey &&
            groupBy == other.groupBy &&
            resourceId == other.resourceId &&
            sessionId == other.sessionId &&
            type == other.type &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            periodStart,
            datasetId,
            evaluatorId,
            feedbackKey,
            groupBy,
            resourceId,
            sessionId,
            type,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "OnlineEvaluatorSpendParams{periodStart=$periodStart, datasetId=$datasetId, evaluatorId=$evaluatorId, feedbackKey=$feedbackKey, groupBy=$groupBy, resourceId=$resourceId, sessionId=$sessionId, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
