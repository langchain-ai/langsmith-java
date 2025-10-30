// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomChartCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chartType: JsonField<CustomChartType>,
    private val series: JsonField<List<CustomChartSeriesCreate>>,
    private val title: JsonField<String>,
    private val commonFilters: JsonField<CustomChartSeriesFilters>,
    private val description: JsonField<String>,
    private val index: JsonField<Long>,
    private val metadata: JsonValue,
    private val sectionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chart_type")
        @ExcludeMissing
        chartType: JsonField<CustomChartType> = JsonMissing.of(),
        @JsonProperty("series")
        @ExcludeMissing
        series: JsonField<List<CustomChartSeriesCreate>> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("common_filters")
        @ExcludeMissing
        commonFilters: JsonField<CustomChartSeriesFilters> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("section_id") @ExcludeMissing sectionId: JsonField<String> = JsonMissing.of(),
    ) : this(
        chartType,
        series,
        title,
        commonFilters,
        description,
        index,
        metadata,
        sectionId,
        mutableMapOf(),
    )

    /**
     * Enum for custom chart types.
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chartType(): CustomChartType = chartType.getRequired("chart_type")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun series(): List<CustomChartSeriesCreate> = series.getRequired("series")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commonFilters(): Optional<CustomChartSeriesFilters> =
        commonFilters.getOptional("common_filters")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun index(): Optional<Long> = index.getOptional("index")

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sectionId(): Optional<String> = sectionId.getOptional("section_id")

    /**
     * Returns the raw JSON value of [chartType].
     *
     * Unlike [chartType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chart_type")
    @ExcludeMissing
    fun _chartType(): JsonField<CustomChartType> = chartType

    /**
     * Returns the raw JSON value of [series].
     *
     * Unlike [series], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("series")
    @ExcludeMissing
    fun _series(): JsonField<List<CustomChartSeriesCreate>> = series

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

    /**
     * Returns the raw JSON value of [index].
     *
     * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

    /**
     * Returns the raw JSON value of [sectionId].
     *
     * Unlike [sectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("section_id") @ExcludeMissing fun _sectionId(): JsonField<String> = sectionId

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
         * Returns a mutable builder for constructing an instance of [CustomChartCreate].
         *
         * The following fields are required:
         * ```java
         * .chartType()
         * .series()
         * .title()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChartCreate]. */
    class Builder internal constructor() {

        private var chartType: JsonField<CustomChartType>? = null
        private var series: JsonField<MutableList<CustomChartSeriesCreate>>? = null
        private var title: JsonField<String>? = null
        private var commonFilters: JsonField<CustomChartSeriesFilters> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var index: JsonField<Long> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var sectionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customChartCreate: CustomChartCreate) = apply {
            chartType = customChartCreate.chartType
            series = customChartCreate.series.map { it.toMutableList() }
            title = customChartCreate.title
            commonFilters = customChartCreate.commonFilters
            description = customChartCreate.description
            index = customChartCreate.index
            metadata = customChartCreate.metadata
            sectionId = customChartCreate.sectionId
            additionalProperties = customChartCreate.additionalProperties.toMutableMap()
        }

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

        fun series(series: List<CustomChartSeriesCreate>) = series(JsonField.of(series))

        /**
         * Sets [Builder.series] to an arbitrary JSON value.
         *
         * You should usually call [Builder.series] with a well-typed
         * `List<CustomChartSeriesCreate>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun series(series: JsonField<List<CustomChartSeriesCreate>>) = apply {
            this.series = series.map { it.toMutableList() }
        }

        /**
         * Adds a single [CustomChartSeriesCreate] to [Builder.series].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeries(series: CustomChartSeriesCreate) = apply {
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

        fun index(index: Long?) = index(JsonField.ofNullable(index))

        /**
         * Alias for [Builder.index].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun index(index: Long) = index(index as Long?)

        /** Alias for calling [Builder.index] with `index.orElse(null)`. */
        fun index(index: Optional<Long>) = index(index.getOrNull())

        /**
         * Sets [Builder.index] to an arbitrary JSON value.
         *
         * You should usually call [Builder.index] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun index(index: JsonField<Long>) = apply { this.index = index }

        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        fun sectionId(sectionId: String?) = sectionId(JsonField.ofNullable(sectionId))

        /** Alias for calling [Builder.sectionId] with `sectionId.orElse(null)`. */
        fun sectionId(sectionId: Optional<String>) = sectionId(sectionId.getOrNull())

        /**
         * Sets [Builder.sectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sectionId(sectionId: JsonField<String>) = apply { this.sectionId = sectionId }

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
         * Returns an immutable instance of [CustomChartCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .chartType()
         * .series()
         * .title()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomChartCreate =
            CustomChartCreate(
                checkRequired("chartType", chartType),
                checkRequired("series", series).map { it.toImmutable() },
                checkRequired("title", title),
                commonFilters,
                description,
                index,
                metadata,
                sectionId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomChartCreate = apply {
        if (validated) {
            return@apply
        }

        chartType().validate()
        series().forEach { it.validate() }
        title()
        commonFilters().ifPresent { it.validate() }
        description()
        index()
        sectionId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (chartType.asKnown().getOrNull()?.validity() ?: 0) +
            (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (commonFilters.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (index.asKnown().isPresent) 1 else 0) +
            (if (sectionId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChartCreate &&
            chartType == other.chartType &&
            series == other.series &&
            title == other.title &&
            commonFilters == other.commonFilters &&
            description == other.description &&
            index == other.index &&
            metadata == other.metadata &&
            sectionId == other.sectionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            chartType,
            series,
            title,
            commonFilters,
            description,
            index,
            metadata,
            sectionId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomChartCreate{chartType=$chartType, series=$series, title=$title, commonFilters=$commonFilters, description=$description, index=$index, metadata=$metadata, sectionId=$sectionId, additionalProperties=$additionalProperties}"
}
