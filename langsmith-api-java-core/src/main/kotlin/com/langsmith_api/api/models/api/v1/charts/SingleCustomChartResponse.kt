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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SingleCustomChartResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val chartType: JsonField<CustomChartType>,
    private val data: JsonField<List<CustomChartsDataPoint>>,
    private val index: JsonField<Long>,
    private val series: JsonField<List<CustomChartSeries>>,
    private val title: JsonField<String>,
    private val commonFilters: JsonField<CustomChartSeriesFilters>,
    private val description: JsonField<String>,
    private val metadata: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("chart_type")
        @ExcludeMissing
        chartType: JsonField<CustomChartType> = JsonMissing.of(),
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<CustomChartsDataPoint>> = JsonMissing.of(),
        @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("series")
        @ExcludeMissing
        series: JsonField<List<CustomChartSeries>> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("common_filters")
        @ExcludeMissing
        commonFilters: JsonField<CustomChartSeriesFilters> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
    ) : this(
        id,
        chartType,
        data,
        index,
        series,
        title,
        commonFilters,
        description,
        metadata,
        mutableMapOf(),
    )

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Enum for custom chart types.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chartType(): CustomChartType = chartType.getRequired("chart_type")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<CustomChartsDataPoint> = data.getRequired("data")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun index(): Long = index.getRequired("index")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun series(): List<CustomChartSeries> = series.getRequired("series")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun commonFilters(): Optional<CustomChartSeriesFilters> =
        commonFilters.getOptional("common_filters")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [chartType].
     *
     * Unlike [chartType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chart_type")
    @ExcludeMissing
    fun _chartType(): JsonField<CustomChartType> = chartType

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<CustomChartsDataPoint>> = data

    /**
     * Returns the raw JSON value of [index].
     *
     * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

    /**
     * Returns the raw JSON value of [series].
     *
     * Unlike [series], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("series")
    @ExcludeMissing
    fun _series(): JsonField<List<CustomChartSeries>> = series

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [commonFilters].
     *
     * Unlike [commonFilters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("common_filters")
    @ExcludeMissing
    fun _commonFilters(): JsonField<CustomChartSeriesFilters> = commonFilters

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
         * Returns a mutable builder for constructing an instance of [SingleCustomChartResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .chartType()
         * .data()
         * .index()
         * .series()
         * .title()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SingleCustomChartResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var chartType: JsonField<CustomChartType>? = null
        private var data: JsonField<MutableList<CustomChartsDataPoint>>? = null
        private var index: JsonField<Long>? = null
        private var series: JsonField<MutableList<CustomChartSeries>>? = null
        private var title: JsonField<String>? = null
        private var commonFilters: JsonField<CustomChartSeriesFilters> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(singleCustomChartResponse: SingleCustomChartResponse) = apply {
            id = singleCustomChartResponse.id
            chartType = singleCustomChartResponse.chartType
            data = singleCustomChartResponse.data.map { it.toMutableList() }
            index = singleCustomChartResponse.index
            series = singleCustomChartResponse.series.map { it.toMutableList() }
            title = singleCustomChartResponse.title
            commonFilters = singleCustomChartResponse.commonFilters
            description = singleCustomChartResponse.description
            metadata = singleCustomChartResponse.metadata
            additionalProperties = singleCustomChartResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Enum for custom chart types. */
        fun chartType(chartType: CustomChartType) = chartType(JsonField.of(chartType))

        /**
         * Sets [Builder.chartType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chartType] with a well-typed [CustomChartType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun chartType(chartType: JsonField<CustomChartType>) = apply { this.chartType = chartType }

        fun data(data: List<CustomChartsDataPoint>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<CustomChartsDataPoint>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun data(data: JsonField<List<CustomChartsDataPoint>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [CustomChartsDataPoint] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: CustomChartsDataPoint) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun index(index: Long) = index(JsonField.of(index))

        /**
         * Sets [Builder.index] to an arbitrary JSON value.
         *
         * You should usually call [Builder.index] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun index(index: JsonField<Long>) = apply { this.index = index }

        fun series(series: List<CustomChartSeries>) = series(JsonField.of(series))

        /**
         * Sets [Builder.series] to an arbitrary JSON value.
         *
         * You should usually call [Builder.series] with a well-typed `List<CustomChartSeries>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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

        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        fun commonFilters(commonFilters: CustomChartSeriesFilters?) =
            commonFilters(JsonField.ofNullable(commonFilters))

        /** Alias for calling [Builder.commonFilters] with `commonFilters.orElse(null)`. */
        fun commonFilters(commonFilters: Optional<CustomChartSeriesFilters>) =
            commonFilters(commonFilters.getOrNull())

        /**
         * Sets [Builder.commonFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commonFilters] with a well-typed
         * [CustomChartSeriesFilters] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun commonFilters(commonFilters: JsonField<CustomChartSeriesFilters>) = apply {
            this.commonFilters = commonFilters
        }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

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
         * Returns an immutable instance of [SingleCustomChartResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .chartType()
         * .data()
         * .index()
         * .series()
         * .title()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SingleCustomChartResponse =
            SingleCustomChartResponse(
                checkRequired("id", id),
                checkRequired("chartType", chartType),
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("index", index),
                checkRequired("series", series).map { it.toImmutable() },
                checkRequired("title", title),
                commonFilters,
                description,
                metadata,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SingleCustomChartResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        chartType().validate()
        data().forEach { it.validate() }
        index()
        series().forEach { it.validate() }
        title()
        commonFilters().ifPresent { it.validate() }
        description()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (chartType.asKnown().getOrNull()?.validity() ?: 0) +
            (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (index.asKnown().isPresent) 1 else 0) +
            (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (commonFilters.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SingleCustomChartResponse &&
            id == other.id &&
            chartType == other.chartType &&
            data == other.data &&
            index == other.index &&
            series == other.series &&
            title == other.title &&
            commonFilters == other.commonFilters &&
            description == other.description &&
            metadata == other.metadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            chartType,
            data,
            index,
            series,
            title,
            commonFilters,
            description,
            metadata,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SingleCustomChartResponse{id=$id, chartType=$chartType, data=$data, index=$index, series=$series, title=$title, commonFilters=$commonFilters, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
}
