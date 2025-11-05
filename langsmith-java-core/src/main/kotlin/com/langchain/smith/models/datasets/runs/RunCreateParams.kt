// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.runs

import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Fetch examples for a dataset, and fetch the runs for each example if they are associated with the
 * given session_ids.
 */
class RunCreateParams
private constructor(
    private val datasetId: String?,
    private val queryFormat: String?,
    private val queryExampleSchemaWithRuns: QueryExampleSchemaWithRuns,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    /** Response format, e.g., 'csv' */
    fun queryFormat(): Optional<String> = Optional.ofNullable(queryFormat)

    fun queryExampleSchemaWithRuns(): QueryExampleSchemaWithRuns = queryExampleSchemaWithRuns

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        queryExampleSchemaWithRuns._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunCreateParams].
         *
         * The following fields are required:
         * ```java
         * .queryExampleSchemaWithRuns()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunCreateParams]. */
    class Builder internal constructor() {

        private var datasetId: String? = null
        private var queryFormat: String? = null
        private var queryExampleSchemaWithRuns: QueryExampleSchemaWithRuns? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runCreateParams: RunCreateParams) = apply {
            datasetId = runCreateParams.datasetId
            queryFormat = runCreateParams.queryFormat
            queryExampleSchemaWithRuns = runCreateParams.queryExampleSchemaWithRuns
            additionalHeaders = runCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = runCreateParams.additionalQueryParams.toBuilder()
        }

        fun datasetId(datasetId: String?) = apply { this.datasetId = datasetId }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /** Response format, e.g., 'csv' */
        fun queryFormat(queryFormat: String?) = apply { this.queryFormat = queryFormat }

        /** Alias for calling [Builder.queryFormat] with `queryFormat.orElse(null)`. */
        fun queryFormat(queryFormat: Optional<String>) = queryFormat(queryFormat.getOrNull())

        fun queryExampleSchemaWithRuns(queryExampleSchemaWithRuns: QueryExampleSchemaWithRuns) =
            apply {
                this.queryExampleSchemaWithRuns = queryExampleSchemaWithRuns
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
         * Returns an immutable instance of [RunCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .queryExampleSchemaWithRuns()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunCreateParams =
            RunCreateParams(
                datasetId,
                queryFormat,
                checkRequired("queryExampleSchemaWithRuns", queryExampleSchemaWithRuns),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): QueryExampleSchemaWithRuns = queryExampleSchemaWithRuns

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> datasetId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                queryFormat?.let { put("format", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunCreateParams &&
            datasetId == other.datasetId &&
            queryFormat == other.queryFormat &&
            queryExampleSchemaWithRuns == other.queryExampleSchemaWithRuns &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            datasetId,
            queryFormat,
            queryExampleSchemaWithRuns,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RunCreateParams{datasetId=$datasetId, queryFormat=$queryFormat, queryExampleSchemaWithRuns=$queryExampleSchemaWithRuns, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
