// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.charts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import com.langsmith_api.api.models.api.v1.orgcharts.section.CustomChartsRequestBase
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomChartPreviewRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bucketInfo: JsonField<CustomChartsRequestBase>,
    private val chart: JsonField<Chart>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bucket_info")
        @ExcludeMissing
        bucketInfo: JsonField<CustomChartsRequestBase> = JsonMissing.of(),
        @JsonProperty("chart") @ExcludeMissing chart: JsonField<Chart> = JsonMissing.of(),
    ) : this(bucketInfo, chart, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucketInfo(): CustomChartsRequestBase = bucketInfo.getRequired("bucket_info")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chart(): Chart = chart.getRequired("chart")

    /**
     * Returns the raw JSON value of [bucketInfo].
     *
     * Unlike [bucketInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bucket_info")
    @ExcludeMissing
    fun _bucketInfo(): JsonField<CustomChartsRequestBase> = bucketInfo

    /**
     * Returns the raw JSON value of [chart].
     *
     * Unlike [chart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chart") @ExcludeMissing fun _chart(): JsonField<Chart> = chart

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomChartPreviewRequest].
         *
         * The following fields are required:
         * ```java
         * .bucketInfo()
         * .chart()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChartPreviewRequest]. */
    class Builder internal constructor() {

        private var bucketInfo: JsonField<CustomChartsRequestBase>? = null
        private var chart: JsonField<Chart>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customChartPreviewRequest: CustomChartPreviewRequest) = apply {
            bucketInfo = customChartPreviewRequest.bucketInfo
            chart = customChartPreviewRequest.chart
            additionalProperties = customChartPreviewRequest.additionalProperties.toMutableMap()
        }

        fun bucketInfo(bucketInfo: CustomChartsRequestBase) = bucketInfo(JsonField.of(bucketInfo))

        /**
         * Sets [Builder.bucketInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucketInfo] with a well-typed [CustomChartsRequestBase]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun bucketInfo(bucketInfo: JsonField<CustomChartsRequestBase>) = apply {
            this.bucketInfo = bucketInfo
        }

        fun chart(chart: Chart) = chart(JsonField.of(chart))

        /**
         * Sets [Builder.chart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chart] with a well-typed [Chart] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chart(chart: JsonField<Chart>) = apply { this.chart = chart }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [CustomChartPreviewRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bucketInfo()
         * .chart()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomChartPreviewRequest =
            CustomChartPreviewRequest(
                checkRequired("bucketInfo", bucketInfo),
                checkRequired("chart", chart),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomChartPreviewRequest = apply {
        if (validated) {
            return@apply
        }

        bucketInfo().validate()
        chart().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithApiInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (bucketInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (chart.asKnown().getOrNull()?.validity() ?: 0)

    class Chart
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val series: JsonField<List<CustomChartSeries>>,
        private val commonFilters: JsonField<CustomChartSeriesFilters>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("series")
            @ExcludeMissing
            series: JsonField<List<CustomChartSeries>> = JsonMissing.of(),
            @JsonProperty("common_filters")
            @ExcludeMissing
            commonFilters: JsonField<CustomChartSeriesFilters> = JsonMissing.of(),
        ) : this(series, commonFilters, mutableMapOf())

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun series(): List<CustomChartSeries> = series.getRequired("series")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun commonFilters(): Optional<CustomChartSeriesFilters> =
            commonFilters.getOptional("common_filters")

        /**
         * Returns the raw JSON value of [series].
         *
         * Unlike [series], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("series")
        @ExcludeMissing
        fun _series(): JsonField<List<CustomChartSeries>> = series

        /**
         * Returns the raw JSON value of [commonFilters].
         *
         * Unlike [commonFilters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("common_filters")
        @ExcludeMissing
        fun _commonFilters(): JsonField<CustomChartSeriesFilters> = commonFilters

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Chart].
             *
             * The following fields are required:
             * ```java
             * .series()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Chart]. */
        class Builder internal constructor() {

            private var series: JsonField<MutableList<CustomChartSeries>>? = null
            private var commonFilters: JsonField<CustomChartSeriesFilters> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(chart: Chart) = apply {
                series = chart.series.map { it.toMutableList() }
                commonFilters = chart.commonFilters
                additionalProperties = chart.additionalProperties.toMutableMap()
            }

            fun series(series: List<CustomChartSeries>) = series(JsonField.of(series))

            /**
             * Sets [Builder.series] to an arbitrary JSON value.
             *
             * You should usually call [Builder.series] with a well-typed `List<CustomChartSeries>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun series(series: JsonField<List<CustomChartSeries>>) = apply {
                this.series = series.map { it.toMutableList() }
            }

            /**
             * Adds a single [CustomChartSeries] to [Builder.series].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSeries(series: CustomChartSeries) = apply {
                this.series =
                    (this.series ?: JsonField.of(mutableListOf())).also {
                        checkKnown("series", it).add(series)
                    }
            }

            fun commonFilters(commonFilters: CustomChartSeriesFilters?) =
                commonFilters(JsonField.ofNullable(commonFilters))

            /** Alias for calling [Builder.commonFilters] with `commonFilters.orElse(null)`. */
            fun commonFilters(commonFilters: Optional<CustomChartSeriesFilters>) =
                commonFilters(commonFilters.getOrNull())

            /**
             * Sets [Builder.commonFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commonFilters] with a well-typed
             * [CustomChartSeriesFilters] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun commonFilters(commonFilters: JsonField<CustomChartSeriesFilters>) = apply {
                this.commonFilters = commonFilters
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Chart].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .series()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Chart =
                Chart(
                    checkRequired("series", series).map { it.toImmutable() },
                    commonFilters,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Chart = apply {
            if (validated) {
                return@apply
            }

            series().forEach { it.validate() }
            commonFilters().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithApiInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (commonFilters.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Chart &&
                series == other.series &&
                commonFilters == other.commonFilters &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(series, commonFilters, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Chart{series=$series, commonFilters=$commonFilters, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChartPreviewRequest &&
            bucketInfo == other.bucketInfo &&
            chart == other.chart &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(bucketInfo, chart, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomChartPreviewRequest{bucketInfo=$bucketInfo, chart=$chart, additionalProperties=$additionalProperties}"
}
