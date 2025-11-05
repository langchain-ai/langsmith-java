// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a chart. */
class ChartUpdateParams
private constructor(
    private val chartId: String?,
    private val customChartUpdate: CustomChartUpdate,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun chartId(): Optional<String> = Optional.ofNullable(chartId)

    fun customChartUpdate(): CustomChartUpdate = customChartUpdate

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        customChartUpdate._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChartUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .customChartUpdate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChartUpdateParams]. */
    class Builder internal constructor() {

        private var chartId: String? = null
        private var customChartUpdate: CustomChartUpdate? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(chartUpdateParams: ChartUpdateParams) = apply {
            chartId = chartUpdateParams.chartId
            customChartUpdate = chartUpdateParams.customChartUpdate
            additionalHeaders = chartUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = chartUpdateParams.additionalQueryParams.toBuilder()
        }

        fun chartId(chartId: String?) = apply { this.chartId = chartId }

        /** Alias for calling [Builder.chartId] with `chartId.orElse(null)`. */
        fun chartId(chartId: Optional<String>) = chartId(chartId.getOrNull())

        fun customChartUpdate(customChartUpdate: CustomChartUpdate) = apply {
            this.customChartUpdate = customChartUpdate
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
         * Returns an immutable instance of [ChartUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customChartUpdate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChartUpdateParams =
            ChartUpdateParams(
                chartId,
                checkRequired("customChartUpdate", customChartUpdate),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CustomChartUpdate = customChartUpdate

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> chartId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChartUpdateParams &&
            chartId == other.chartId &&
            customChartUpdate == other.customChartUpdate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(chartId, customChartUpdate, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ChartUpdateParams{chartId=$chartId, customChartUpdate=$customChartUpdate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
