// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.BaseDeserializer
import com.langchain.smith.core.BaseSerializer
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomChartsSection
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val charts: JsonField<List<Chart>>,
    private val title: JsonField<String>,
    private val description: JsonField<String>,
    private val index: JsonField<Long>,
    private val sessionId: JsonField<String>,
    private val subSections: JsonField<List<SubSection>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("charts") @ExcludeMissing charts: JsonField<List<Chart>> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sub_sections")
        @ExcludeMissing
        subSections: JsonField<List<SubSection>> = JsonMissing.of(),
    ) : this(id, charts, title, description, index, sessionId, subSections, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun charts(): List<Chart> = charts.getRequired("charts")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun index(): Optional<Long> = index.getOptional("index")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subSections(): Optional<List<SubSection>> = subSections.getOptional("sub_sections")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [charts].
     *
     * Unlike [charts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("charts") @ExcludeMissing fun _charts(): JsonField<List<Chart>> = charts

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [subSections].
     *
     * Unlike [subSections], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sub_sections")
    @ExcludeMissing
    fun _subSections(): JsonField<List<SubSection>> = subSections

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
         * Returns a mutable builder for constructing an instance of [CustomChartsSection].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .charts()
         * .title()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChartsSection]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var charts: JsonField<MutableList<Chart>>? = null
        private var title: JsonField<String>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var index: JsonField<Long> = JsonMissing.of()
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var subSections: JsonField<MutableList<SubSection>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customChartsSection: CustomChartsSection) = apply {
            id = customChartsSection.id
            charts = customChartsSection.charts.map { it.toMutableList() }
            title = customChartsSection.title
            description = customChartsSection.description
            index = customChartsSection.index
            sessionId = customChartsSection.sessionId
            subSections = customChartsSection.subSections.map { it.toMutableList() }
            additionalProperties = customChartsSection.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun charts(charts: List<Chart>) = charts(JsonField.of(charts))

        /**
         * Sets [Builder.charts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.charts] with a well-typed `List<Chart>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun charts(charts: JsonField<List<Chart>>) = apply {
            this.charts = charts.map { it.toMutableList() }
        }

        /**
         * Adds a single [Chart] to [charts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChart(chart: Chart) = apply {
            charts =
                (charts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("charts", it).add(chart)
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

        fun sessionId(sessionId: String?) = sessionId(JsonField.ofNullable(sessionId))

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun subSections(subSections: List<SubSection>?) =
            subSections(JsonField.ofNullable(subSections))

        /** Alias for calling [Builder.subSections] with `subSections.orElse(null)`. */
        fun subSections(subSections: Optional<List<SubSection>>) =
            subSections(subSections.getOrNull())

        /**
         * Sets [Builder.subSections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subSections] with a well-typed `List<SubSection>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subSections(subSections: JsonField<List<SubSection>>) = apply {
            this.subSections = subSections.map { it.toMutableList() }
        }

        /**
         * Adds a single [SubSection] to [subSections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubSection(subSection: SubSection) = apply {
            subSections =
                (subSections ?: JsonField.of(mutableListOf())).also {
                    checkKnown("subSections", it).add(subSection)
                }
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
         * Returns an immutable instance of [CustomChartsSection].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .charts()
         * .title()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomChartsSection =
            CustomChartsSection(
                checkRequired("id", id),
                checkRequired("charts", charts).map { it.toImmutable() },
                checkRequired("title", title),
                description,
                index,
                sessionId,
                (subSections ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomChartsSection = apply {
        if (validated) {
            return@apply
        }

        id()
        charts().forEach { it.validate() }
        title()
        description()
        index()
        sessionId()
        subSections().ifPresent { it.forEach { it.validate() } }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangChainInvalidDataException) {
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
            (charts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (index.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (subSections.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Chart
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val chartType: JsonField<ChartType>,
        private val data: JsonField<List<Data>>,
        private val index: JsonField<Long>,
        private val series: JsonField<List<Series>>,
        private val title: JsonField<String>,
        private val commonFilters: JsonField<CommonFilters>,
        private val description: JsonField<String>,
        private val metadata: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("chart_type")
            @ExcludeMissing
            chartType: JsonField<ChartType> = JsonMissing.of(),
            @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
            @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("series")
            @ExcludeMissing
            series: JsonField<List<Series>> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("common_filters")
            @ExcludeMissing
            commonFilters: JsonField<CommonFilters> = JsonMissing.of(),
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
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Enum for custom chart types.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun chartType(): ChartType = chartType.getRequired("chart_type")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun data(): List<Data> = data.getRequired("data")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun index(): Long = index.getRequired("index")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun series(): List<Series> = series.getRequired("series")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun title(): String = title.getRequired("title")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commonFilters(): Optional<CommonFilters> = commonFilters.getOptional("common_filters")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
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
        fun _chartType(): JsonField<ChartType> = chartType

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
        @JsonProperty("series") @ExcludeMissing fun _series(): JsonField<List<Series>> = series

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        /**
         * Returns the raw JSON value of [commonFilters].
         *
         * Unlike [commonFilters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("common_filters")
        @ExcludeMissing
        fun _commonFilters(): JsonField<CommonFilters> = commonFilters

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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

        /** A builder for [Chart]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var chartType: JsonField<ChartType>? = null
            private var data: JsonField<MutableList<Data>>? = null
            private var index: JsonField<Long>? = null
            private var series: JsonField<MutableList<Series>>? = null
            private var title: JsonField<String>? = null
            private var commonFilters: JsonField<CommonFilters> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(chart: Chart) = apply {
                id = chart.id
                chartType = chart.chartType
                data = chart.data.map { it.toMutableList() }
                index = chart.index
                series = chart.series.map { it.toMutableList() }
                title = chart.title
                commonFilters = chart.commonFilters
                description = chart.description
                metadata = chart.metadata
                additionalProperties = chart.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Enum for custom chart types. */
            fun chartType(chartType: ChartType) = chartType(JsonField.of(chartType))

            /**
             * Sets [Builder.chartType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chartType] with a well-typed [ChartType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chartType(chartType: JsonField<ChartType>) = apply { this.chartType = chartType }

            fun data(data: List<Data>) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed `List<Data>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun data(data: JsonField<List<Data>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [Data] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: Data) = apply {
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun index(index: JsonField<Long>) = apply { this.index = index }

            fun series(series: List<Series>) = series(JsonField.of(series))

            /**
             * Sets [Builder.series] to an arbitrary JSON value.
             *
             * You should usually call [Builder.series] with a well-typed `List<Series>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun series(series: JsonField<List<Series>>) = apply {
                this.series = series.map { it.toMutableList() }
            }

            /**
             * Adds a single [Series] to [Builder.series].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSeries(series: Series) = apply {
                this.series =
                    (this.series ?: JsonField.of(mutableListOf())).also {
                        checkKnown("series", it).add(series)
                    }
            }

            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            fun commonFilters(commonFilters: CommonFilters?) =
                commonFilters(JsonField.ofNullable(commonFilters))

            /** Alias for calling [Builder.commonFilters] with `commonFilters.orElse(null)`. */
            fun commonFilters(commonFilters: Optional<CommonFilters>) =
                commonFilters(commonFilters.getOrNull())

            /**
             * Sets [Builder.commonFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commonFilters] with a well-typed [CommonFilters]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun commonFilters(commonFilters: JsonField<CommonFilters>) = apply {
                this.commonFilters = commonFilters
            }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

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
             * Returns an immutable instance of [Chart].
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
            fun build(): Chart =
                Chart(
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

        fun validate(): Chart = apply {
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
            } catch (e: LangChainInvalidDataException) {
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (chartType.asKnown().getOrNull()?.validity() ?: 0) +
                (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (index.asKnown().isPresent) 1 else 0) +
                (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (commonFilters.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0)

        /** Enum for custom chart types. */
        class ChartType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val LINE = of("line")

                @JvmField val BAR = of("bar")

                @JvmStatic fun of(value: String) = ChartType(JsonField.of(value))
            }

            /** An enum containing [ChartType]'s known values. */
            enum class Known {
                LINE,
                BAR,
            }

            /**
             * An enum containing [ChartType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ChartType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LINE,
                BAR,
                /**
                 * An enum member indicating that [ChartType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    LINE -> Value.LINE
                    BAR -> Value.BAR
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    LINE -> Known.LINE
                    BAR -> Known.BAR
                    else -> throw LangChainInvalidDataException("Unknown ChartType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangChainInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): ChartType = apply {
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
                } catch (e: LangChainInvalidDataException) {
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

                return other is ChartType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Data
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val seriesId: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val value: JsonField<Value>,
            private val group: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("series_id")
                @ExcludeMissing
                seriesId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
                @JsonProperty("group") @ExcludeMissing group: JsonField<String> = JsonMissing.of(),
            ) : this(seriesId, timestamp, value, group, mutableMapOf())

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun seriesId(): String = seriesId.getRequired("series_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun value(): Optional<Value> = value.getOptional("value")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun group(): Optional<String> = group.getOptional("group")

            /**
             * Returns the raw JSON value of [seriesId].
             *
             * Unlike [seriesId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("series_id") @ExcludeMissing fun _seriesId(): JsonField<String> = seriesId

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

            /**
             * Returns the raw JSON value of [group].
             *
             * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<String> = group

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
                 * Returns a mutable builder for constructing an instance of [Data].
                 *
                 * The following fields are required:
                 * ```java
                 * .seriesId()
                 * .timestamp()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Data]. */
            class Builder internal constructor() {

                private var seriesId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var value: JsonField<Value>? = null
                private var group: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(data: Data) = apply {
                    seriesId = data.seriesId
                    timestamp = data.timestamp
                    value = data.value
                    group = data.group
                    additionalProperties = data.additionalProperties.toMutableMap()
                }

                fun seriesId(seriesId: String) = seriesId(JsonField.of(seriesId))

                /**
                 * Sets [Builder.seriesId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.seriesId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun seriesId(seriesId: JsonField<String>) = apply { this.seriesId = seriesId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun value(value: Value?) = value(JsonField.ofNullable(value))

                /** Alias for calling [Builder.value] with `value.orElse(null)`. */
                fun value(value: Optional<Value>) = value(value.getOrNull())

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Value] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Value>) = apply { this.value = value }

                /** Alias for calling [value] with `Value.ofNumber(number)`. */
                fun value(number: Double) = value(Value.ofNumber(number))

                /** Alias for calling [value] with `Value.ofJson(json)`. */
                fun value(json: JsonValue) = value(Value.ofJson(json))

                fun group(group: String?) = group(JsonField.ofNullable(group))

                /** Alias for calling [Builder.group] with `group.orElse(null)`. */
                fun group(group: Optional<String>) = group(group.getOrNull())

                /**
                 * Sets [Builder.group] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.group] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun group(group: JsonField<String>) = apply { this.group = group }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Data].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .seriesId()
                 * .timestamp()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Data =
                    Data(
                        checkRequired("seriesId", seriesId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("value", value),
                        group,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Data = apply {
                if (validated) {
                    return@apply
                }

                seriesId()
                timestamp()
                value().ifPresent { it.validate() }
                group()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
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
                (if (seriesId.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (value.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (group.asKnown().isPresent) 1 else 0)

            @JsonDeserialize(using = Value.Deserializer::class)
            @JsonSerialize(using = Value.Serializer::class)
            class Value
            private constructor(
                private val number: Double? = null,
                private val json: JsonValue? = null,
                private val _json: JsonValue? = null,
            ) {

                fun number(): Optional<Double> = Optional.ofNullable(number)

                fun json(): Optional<JsonValue> = Optional.ofNullable(json)

                fun isNumber(): Boolean = number != null

                fun isJson(): Boolean = json != null

                fun asNumber(): Double = number.getOrThrow("number")

                fun asJson(): JsonValue = json.getOrThrow("json")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        number != null -> visitor.visitNumber(number)
                        json != null -> visitor.visitJson(json)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Value = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitNumber(number: Double) {}

                            override fun visitJson(json: JsonValue) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitNumber(number: Double) = 1

                            override fun visitJson(json: JsonValue) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Value && number == other.number && json == other.json
                }

                override fun hashCode(): Int = Objects.hash(number, json)

                override fun toString(): String =
                    when {
                        number != null -> "Value{number=$number}"
                        json != null -> "Value{json=$json}"
                        _json != null -> "Value{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Value")
                    }

                companion object {

                    @JvmStatic fun ofNumber(number: Double) = Value(number = number)

                    @JvmStatic fun ofJson(json: JsonValue) = Value(json = json)
                }

                /**
                 * An interface that defines how to map each variant of [Value] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitNumber(number: Double): T

                    fun visitJson(json: JsonValue): T

                    /**
                     * Maps an unknown variant of [Value] to a value of type [T].
                     *
                     * An instance of [Value] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws LangChainInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangChainInvalidDataException("Unknown Value: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Value>(Value::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Value {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                        Value(number = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                        Value(json = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants.
                            0 -> Value(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Value>(Value::class) {

                    override fun serialize(
                        value: Value,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.number != null -> generator.writeObject(value.number)
                            value.json != null -> generator.writeObject(value.json)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Value")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Data &&
                    seriesId == other.seriesId &&
                    timestamp == other.timestamp &&
                    value == other.value &&
                    group == other.group &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(seriesId, timestamp, value, group, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Data{seriesId=$seriesId, timestamp=$timestamp, value=$value, group=$group, additionalProperties=$additionalProperties}"
        }

        class Series
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val metric: JsonField<Metric>,
            private val name: JsonField<String>,
            private val feedbackKey: JsonField<String>,
            private val filters: JsonField<Filters>,
            private val groupBy: JsonField<GroupBy>,
            private val projectMetric: JsonField<ProjectMetric>,
            private val workspaceId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metric")
                @ExcludeMissing
                metric: JsonField<Metric> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("feedback_key")
                @ExcludeMissing
                feedbackKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("filters")
                @ExcludeMissing
                filters: JsonField<Filters> = JsonMissing.of(),
                @JsonProperty("group_by")
                @ExcludeMissing
                groupBy: JsonField<GroupBy> = JsonMissing.of(),
                @JsonProperty("project_metric")
                @ExcludeMissing
                projectMetric: JsonField<ProjectMetric> = JsonMissing.of(),
                @JsonProperty("workspace_id")
                @ExcludeMissing
                workspaceId: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                metric,
                name,
                feedbackKey,
                filters,
                groupBy,
                projectMetric,
                workspaceId,
                mutableMapOf(),
            )

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Metrics you can chart. Feedback metrics are not available for organization-scoped
             * charts.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun metric(): Metric = metric.getRequired("metric")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun feedbackKey(): Optional<String> = feedbackKey.getOptional("feedback_key")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun filters(): Optional<Filters> = filters.getOptional("filters")

            /**
             * Include additional information about where the group_by param was set.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun groupBy(): Optional<GroupBy> = groupBy.getOptional("group_by")

            /**
             * LGP Metrics you can chart.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun projectMetric(): Optional<ProjectMetric> =
                projectMetric.getOptional("project_metric")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun workspaceId(): Optional<String> = workspaceId.getOptional("workspace_id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [metric].
             *
             * Unlike [metric], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<Metric> = metric

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [feedbackKey].
             *
             * Unlike [feedbackKey], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("feedback_key")
            @ExcludeMissing
            fun _feedbackKey(): JsonField<String> = feedbackKey

            /**
             * Returns the raw JSON value of [filters].
             *
             * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<Filters> = filters

            /**
             * Returns the raw JSON value of [groupBy].
             *
             * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("group_by") @ExcludeMissing fun _groupBy(): JsonField<GroupBy> = groupBy

            /**
             * Returns the raw JSON value of [projectMetric].
             *
             * Unlike [projectMetric], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("project_metric")
            @ExcludeMissing
            fun _projectMetric(): JsonField<ProjectMetric> = projectMetric

            /**
             * Returns the raw JSON value of [workspaceId].
             *
             * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("workspace_id")
            @ExcludeMissing
            fun _workspaceId(): JsonField<String> = workspaceId

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
                 * Returns a mutable builder for constructing an instance of [Series].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .metric()
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Series]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var metric: JsonField<Metric>? = null
                private var name: JsonField<String>? = null
                private var feedbackKey: JsonField<String> = JsonMissing.of()
                private var filters: JsonField<Filters> = JsonMissing.of()
                private var groupBy: JsonField<GroupBy> = JsonMissing.of()
                private var projectMetric: JsonField<ProjectMetric> = JsonMissing.of()
                private var workspaceId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(series: Series) = apply {
                    id = series.id
                    metric = series.metric
                    name = series.name
                    feedbackKey = series.feedbackKey
                    filters = series.filters
                    groupBy = series.groupBy
                    projectMetric = series.projectMetric
                    workspaceId = series.workspaceId
                    additionalProperties = series.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Metrics you can chart. Feedback metrics are not available for organization-scoped
                 * charts.
                 */
                fun metric(metric: Metric) = metric(JsonField.of(metric))

                /**
                 * Sets [Builder.metric] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metric] with a well-typed [Metric] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metric(metric: JsonField<Metric>) = apply { this.metric = metric }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun feedbackKey(feedbackKey: String?) =
                    feedbackKey(JsonField.ofNullable(feedbackKey))

                /** Alias for calling [Builder.feedbackKey] with `feedbackKey.orElse(null)`. */
                fun feedbackKey(feedbackKey: Optional<String>) =
                    feedbackKey(feedbackKey.getOrNull())

                /**
                 * Sets [Builder.feedbackKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.feedbackKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun feedbackKey(feedbackKey: JsonField<String>) = apply {
                    this.feedbackKey = feedbackKey
                }

                fun filters(filters: Filters?) = filters(JsonField.ofNullable(filters))

                /** Alias for calling [Builder.filters] with `filters.orElse(null)`. */
                fun filters(filters: Optional<Filters>) = filters(filters.getOrNull())

                /**
                 * Sets [Builder.filters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filters] with a well-typed [Filters] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filters(filters: JsonField<Filters>) = apply { this.filters = filters }

                /** Include additional information about where the group_by param was set. */
                fun groupBy(groupBy: GroupBy?) = groupBy(JsonField.ofNullable(groupBy))

                /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
                fun groupBy(groupBy: Optional<GroupBy>) = groupBy(groupBy.getOrNull())

                /**
                 * Sets [Builder.groupBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupBy] with a well-typed [GroupBy] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun groupBy(groupBy: JsonField<GroupBy>) = apply { this.groupBy = groupBy }

                /** LGP Metrics you can chart. */
                fun projectMetric(projectMetric: ProjectMetric?) =
                    projectMetric(JsonField.ofNullable(projectMetric))

                /** Alias for calling [Builder.projectMetric] with `projectMetric.orElse(null)`. */
                fun projectMetric(projectMetric: Optional<ProjectMetric>) =
                    projectMetric(projectMetric.getOrNull())

                /**
                 * Sets [Builder.projectMetric] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projectMetric] with a well-typed [ProjectMetric]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun projectMetric(projectMetric: JsonField<ProjectMetric>) = apply {
                    this.projectMetric = projectMetric
                }

                fun workspaceId(workspaceId: String?) =
                    workspaceId(JsonField.ofNullable(workspaceId))

                /** Alias for calling [Builder.workspaceId] with `workspaceId.orElse(null)`. */
                fun workspaceId(workspaceId: Optional<String>) =
                    workspaceId(workspaceId.getOrNull())

                /**
                 * Sets [Builder.workspaceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.workspaceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun workspaceId(workspaceId: JsonField<String>) = apply {
                    this.workspaceId = workspaceId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Series].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .metric()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Series =
                    Series(
                        checkRequired("id", id),
                        checkRequired("metric", metric),
                        checkRequired("name", name),
                        feedbackKey,
                        filters,
                        groupBy,
                        projectMetric,
                        workspaceId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Series = apply {
                if (validated) {
                    return@apply
                }

                id()
                metric().validate()
                name()
                feedbackKey()
                filters().ifPresent { it.validate() }
                groupBy().ifPresent { it.validate() }
                projectMetric().ifPresent { it.validate() }
                workspaceId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (metric.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (feedbackKey.asKnown().isPresent) 1 else 0) +
                    (filters.asKnown().getOrNull()?.validity() ?: 0) +
                    (groupBy.asKnown().getOrNull()?.validity() ?: 0) +
                    (projectMetric.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (workspaceId.asKnown().isPresent) 1 else 0)

            /**
             * Metrics you can chart. Feedback metrics are not available for organization-scoped
             * charts.
             */
            class Metric @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val RUN_COUNT = of("run_count")

                    @JvmField val LATENCY_P50 = of("latency_p50")

                    @JvmField val LATENCY_P99 = of("latency_p99")

                    @JvmField val LATENCY_AVG = of("latency_avg")

                    @JvmField val FIRST_TOKEN_P50 = of("first_token_p50")

                    @JvmField val FIRST_TOKEN_P99 = of("first_token_p99")

                    @JvmField val TOTAL_TOKENS = of("total_tokens")

                    @JvmField val PROMPT_TOKENS = of("prompt_tokens")

                    @JvmField val COMPLETION_TOKENS = of("completion_tokens")

                    @JvmField val MEDIAN_TOKENS = of("median_tokens")

                    @JvmField val COMPLETION_TOKENS_P50 = of("completion_tokens_p50")

                    @JvmField val PROMPT_TOKENS_P50 = of("prompt_tokens_p50")

                    @JvmField val TOKENS_P99 = of("tokens_p99")

                    @JvmField val COMPLETION_TOKENS_P99 = of("completion_tokens_p99")

                    @JvmField val PROMPT_TOKENS_P99 = of("prompt_tokens_p99")

                    @JvmField val FEEDBACK = of("feedback")

                    @JvmField val FEEDBACK_SCORE_AVG = of("feedback_score_avg")

                    @JvmField val FEEDBACK_VALUES = of("feedback_values")

                    @JvmField val TOTAL_COST = of("total_cost")

                    @JvmField val PROMPT_COST = of("prompt_cost")

                    @JvmField val COMPLETION_COST = of("completion_cost")

                    @JvmField val ERROR_RATE = of("error_rate")

                    @JvmField val STREAMING_RATE = of("streaming_rate")

                    @JvmField val COST_P50 = of("cost_p50")

                    @JvmField val COST_P99 = of("cost_p99")

                    @JvmStatic fun of(value: String) = Metric(JsonField.of(value))
                }

                /** An enum containing [Metric]'s known values. */
                enum class Known {
                    RUN_COUNT,
                    LATENCY_P50,
                    LATENCY_P99,
                    LATENCY_AVG,
                    FIRST_TOKEN_P50,
                    FIRST_TOKEN_P99,
                    TOTAL_TOKENS,
                    PROMPT_TOKENS,
                    COMPLETION_TOKENS,
                    MEDIAN_TOKENS,
                    COMPLETION_TOKENS_P50,
                    PROMPT_TOKENS_P50,
                    TOKENS_P99,
                    COMPLETION_TOKENS_P99,
                    PROMPT_TOKENS_P99,
                    FEEDBACK,
                    FEEDBACK_SCORE_AVG,
                    FEEDBACK_VALUES,
                    TOTAL_COST,
                    PROMPT_COST,
                    COMPLETION_COST,
                    ERROR_RATE,
                    STREAMING_RATE,
                    COST_P50,
                    COST_P99,
                }

                /**
                 * An enum containing [Metric]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Metric] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    RUN_COUNT,
                    LATENCY_P50,
                    LATENCY_P99,
                    LATENCY_AVG,
                    FIRST_TOKEN_P50,
                    FIRST_TOKEN_P99,
                    TOTAL_TOKENS,
                    PROMPT_TOKENS,
                    COMPLETION_TOKENS,
                    MEDIAN_TOKENS,
                    COMPLETION_TOKENS_P50,
                    PROMPT_TOKENS_P50,
                    TOKENS_P99,
                    COMPLETION_TOKENS_P99,
                    PROMPT_TOKENS_P99,
                    FEEDBACK,
                    FEEDBACK_SCORE_AVG,
                    FEEDBACK_VALUES,
                    TOTAL_COST,
                    PROMPT_COST,
                    COMPLETION_COST,
                    ERROR_RATE,
                    STREAMING_RATE,
                    COST_P50,
                    COST_P99,
                    /**
                     * An enum member indicating that [Metric] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        RUN_COUNT -> Value.RUN_COUNT
                        LATENCY_P50 -> Value.LATENCY_P50
                        LATENCY_P99 -> Value.LATENCY_P99
                        LATENCY_AVG -> Value.LATENCY_AVG
                        FIRST_TOKEN_P50 -> Value.FIRST_TOKEN_P50
                        FIRST_TOKEN_P99 -> Value.FIRST_TOKEN_P99
                        TOTAL_TOKENS -> Value.TOTAL_TOKENS
                        PROMPT_TOKENS -> Value.PROMPT_TOKENS
                        COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                        MEDIAN_TOKENS -> Value.MEDIAN_TOKENS
                        COMPLETION_TOKENS_P50 -> Value.COMPLETION_TOKENS_P50
                        PROMPT_TOKENS_P50 -> Value.PROMPT_TOKENS_P50
                        TOKENS_P99 -> Value.TOKENS_P99
                        COMPLETION_TOKENS_P99 -> Value.COMPLETION_TOKENS_P99
                        PROMPT_TOKENS_P99 -> Value.PROMPT_TOKENS_P99
                        FEEDBACK -> Value.FEEDBACK
                        FEEDBACK_SCORE_AVG -> Value.FEEDBACK_SCORE_AVG
                        FEEDBACK_VALUES -> Value.FEEDBACK_VALUES
                        TOTAL_COST -> Value.TOTAL_COST
                        PROMPT_COST -> Value.PROMPT_COST
                        COMPLETION_COST -> Value.COMPLETION_COST
                        ERROR_RATE -> Value.ERROR_RATE
                        STREAMING_RATE -> Value.STREAMING_RATE
                        COST_P50 -> Value.COST_P50
                        COST_P99 -> Value.COST_P99
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        RUN_COUNT -> Known.RUN_COUNT
                        LATENCY_P50 -> Known.LATENCY_P50
                        LATENCY_P99 -> Known.LATENCY_P99
                        LATENCY_AVG -> Known.LATENCY_AVG
                        FIRST_TOKEN_P50 -> Known.FIRST_TOKEN_P50
                        FIRST_TOKEN_P99 -> Known.FIRST_TOKEN_P99
                        TOTAL_TOKENS -> Known.TOTAL_TOKENS
                        PROMPT_TOKENS -> Known.PROMPT_TOKENS
                        COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                        MEDIAN_TOKENS -> Known.MEDIAN_TOKENS
                        COMPLETION_TOKENS_P50 -> Known.COMPLETION_TOKENS_P50
                        PROMPT_TOKENS_P50 -> Known.PROMPT_TOKENS_P50
                        TOKENS_P99 -> Known.TOKENS_P99
                        COMPLETION_TOKENS_P99 -> Known.COMPLETION_TOKENS_P99
                        PROMPT_TOKENS_P99 -> Known.PROMPT_TOKENS_P99
                        FEEDBACK -> Known.FEEDBACK
                        FEEDBACK_SCORE_AVG -> Known.FEEDBACK_SCORE_AVG
                        FEEDBACK_VALUES -> Known.FEEDBACK_VALUES
                        TOTAL_COST -> Known.TOTAL_COST
                        PROMPT_COST -> Known.PROMPT_COST
                        COMPLETION_COST -> Known.COMPLETION_COST
                        ERROR_RATE -> Known.ERROR_RATE
                        STREAMING_RATE -> Known.STREAMING_RATE
                        COST_P50 -> Known.COST_P50
                        COST_P99 -> Known.COST_P99
                        else -> throw LangChainInvalidDataException("Unknown Metric: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangChainInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Metric = apply {
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
                    } catch (e: LangChainInvalidDataException) {
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

                    return other is Metric && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Filters
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val filter: JsonField<String>,
                private val session: JsonField<List<String>>,
                private val traceFilter: JsonField<String>,
                private val treeFilter: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("filter")
                    @ExcludeMissing
                    filter: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("session")
                    @ExcludeMissing
                    session: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("trace_filter")
                    @ExcludeMissing
                    traceFilter: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tree_filter")
                    @ExcludeMissing
                    treeFilter: JsonField<String> = JsonMissing.of(),
                ) : this(filter, session, traceFilter, treeFilter, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun filter(): Optional<String> = filter.getOptional("filter")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun session(): Optional<List<String>> = session.getOptional("session")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

                /**
                 * Returns the raw JSON value of [filter].
                 *
                 * Unlike [filter], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

                /**
                 * Returns the raw JSON value of [session].
                 *
                 * Unlike [session], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("session")
                @ExcludeMissing
                fun _session(): JsonField<List<String>> = session

                /**
                 * Returns the raw JSON value of [traceFilter].
                 *
                 * Unlike [traceFilter], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("trace_filter")
                @ExcludeMissing
                fun _traceFilter(): JsonField<String> = traceFilter

                /**
                 * Returns the raw JSON value of [treeFilter].
                 *
                 * Unlike [treeFilter], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("tree_filter")
                @ExcludeMissing
                fun _treeFilter(): JsonField<String> = treeFilter

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

                    /** Returns a mutable builder for constructing an instance of [Filters]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Filters]. */
                class Builder internal constructor() {

                    private var filter: JsonField<String> = JsonMissing.of()
                    private var session: JsonField<MutableList<String>>? = null
                    private var traceFilter: JsonField<String> = JsonMissing.of()
                    private var treeFilter: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(filters: Filters) = apply {
                        filter = filters.filter
                        session = filters.session.map { it.toMutableList() }
                        traceFilter = filters.traceFilter
                        treeFilter = filters.treeFilter
                        additionalProperties = filters.additionalProperties.toMutableMap()
                    }

                    fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                    /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
                    fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                    /**
                     * Sets [Builder.filter] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.filter] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun filter(filter: JsonField<String>) = apply { this.filter = filter }

                    fun session(session: List<String>?) = session(JsonField.ofNullable(session))

                    /** Alias for calling [Builder.session] with `session.orElse(null)`. */
                    fun session(session: Optional<List<String>>) = session(session.getOrNull())

                    /**
                     * Sets [Builder.session] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.session] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun session(session: JsonField<List<String>>) = apply {
                        this.session = session.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [Builder.session].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSession(session: String) = apply {
                        this.session =
                            (this.session ?: JsonField.of(mutableListOf())).also {
                                checkKnown("session", it).add(session)
                            }
                    }

                    fun traceFilter(traceFilter: String?) =
                        traceFilter(JsonField.ofNullable(traceFilter))

                    /** Alias for calling [Builder.traceFilter] with `traceFilter.orElse(null)`. */
                    fun traceFilter(traceFilter: Optional<String>) =
                        traceFilter(traceFilter.getOrNull())

                    /**
                     * Sets [Builder.traceFilter] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.traceFilter] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun traceFilter(traceFilter: JsonField<String>) = apply {
                        this.traceFilter = traceFilter
                    }

                    fun treeFilter(treeFilter: String?) =
                        treeFilter(JsonField.ofNullable(treeFilter))

                    /** Alias for calling [Builder.treeFilter] with `treeFilter.orElse(null)`. */
                    fun treeFilter(treeFilter: Optional<String>) =
                        treeFilter(treeFilter.getOrNull())

                    /**
                     * Sets [Builder.treeFilter] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.treeFilter] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun treeFilter(treeFilter: JsonField<String>) = apply {
                        this.treeFilter = treeFilter
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Filters].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Filters =
                        Filters(
                            filter,
                            (session ?: JsonMissing.of()).map { it.toImmutable() },
                            traceFilter,
                            treeFilter,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Filters = apply {
                    if (validated) {
                        return@apply
                    }

                    filter()
                    session()
                    traceFilter()
                    treeFilter()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
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
                    (if (filter.asKnown().isPresent) 1 else 0) +
                        (session.asKnown().getOrNull()?.size ?: 0) +
                        (if (traceFilter.asKnown().isPresent) 1 else 0) +
                        (if (treeFilter.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Filters &&
                        filter == other.filter &&
                        session == other.session &&
                        traceFilter == other.traceFilter &&
                        treeFilter == other.treeFilter &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(filter, session, traceFilter, treeFilter, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Filters{filter=$filter, session=$session, traceFilter=$traceFilter, treeFilter=$treeFilter, additionalProperties=$additionalProperties}"
            }

            /** Include additional information about where the group_by param was set. */
            class GroupBy
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val attribute: JsonField<Attribute>,
                private val maxGroups: JsonField<Long>,
                private val path: JsonField<String>,
                private val setBy: JsonField<SetBy>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("attribute")
                    @ExcludeMissing
                    attribute: JsonField<Attribute> = JsonMissing.of(),
                    @JsonProperty("max_groups")
                    @ExcludeMissing
                    maxGroups: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("path")
                    @ExcludeMissing
                    path: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("set_by")
                    @ExcludeMissing
                    setBy: JsonField<SetBy> = JsonMissing.of(),
                ) : this(attribute, maxGroups, path, setBy, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun attribute(): Attribute = attribute.getRequired("attribute")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun maxGroups(): Optional<Long> = maxGroups.getOptional("max_groups")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun path(): Optional<String> = path.getOptional("path")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun setBy(): Optional<SetBy> = setBy.getOptional("set_by")

                /**
                 * Returns the raw JSON value of [attribute].
                 *
                 * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("attribute")
                @ExcludeMissing
                fun _attribute(): JsonField<Attribute> = attribute

                /**
                 * Returns the raw JSON value of [maxGroups].
                 *
                 * Unlike [maxGroups], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("max_groups")
                @ExcludeMissing
                fun _maxGroups(): JsonField<Long> = maxGroups

                /**
                 * Returns the raw JSON value of [path].
                 *
                 * Unlike [path], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

                /**
                 * Returns the raw JSON value of [setBy].
                 *
                 * Unlike [setBy], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("set_by") @ExcludeMissing fun _setBy(): JsonField<SetBy> = setBy

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
                     * Returns a mutable builder for constructing an instance of [GroupBy].
                     *
                     * The following fields are required:
                     * ```java
                     * .attribute()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [GroupBy]. */
                class Builder internal constructor() {

                    private var attribute: JsonField<Attribute>? = null
                    private var maxGroups: JsonField<Long> = JsonMissing.of()
                    private var path: JsonField<String> = JsonMissing.of()
                    private var setBy: JsonField<SetBy> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(groupBy: GroupBy) = apply {
                        attribute = groupBy.attribute
                        maxGroups = groupBy.maxGroups
                        path = groupBy.path
                        setBy = groupBy.setBy
                        additionalProperties = groupBy.additionalProperties.toMutableMap()
                    }

                    fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                    /**
                     * Sets [Builder.attribute] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attribute] with a well-typed [Attribute]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun attribute(attribute: JsonField<Attribute>) = apply {
                        this.attribute = attribute
                    }

                    fun maxGroups(maxGroups: Long) = maxGroups(JsonField.of(maxGroups))

                    /**
                     * Sets [Builder.maxGroups] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxGroups] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun maxGroups(maxGroups: JsonField<Long>) = apply { this.maxGroups = maxGroups }

                    fun path(path: String?) = path(JsonField.ofNullable(path))

                    /** Alias for calling [Builder.path] with `path.orElse(null)`. */
                    fun path(path: Optional<String>) = path(path.getOrNull())

                    /**
                     * Sets [Builder.path] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.path] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun path(path: JsonField<String>) = apply { this.path = path }

                    fun setBy(setBy: SetBy?) = setBy(JsonField.ofNullable(setBy))

                    /** Alias for calling [Builder.setBy] with `setBy.orElse(null)`. */
                    fun setBy(setBy: Optional<SetBy>) = setBy(setBy.getOrNull())

                    /**
                     * Sets [Builder.setBy] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.setBy] with a well-typed [SetBy] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun setBy(setBy: JsonField<SetBy>) = apply { this.setBy = setBy }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [GroupBy].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .attribute()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): GroupBy =
                        GroupBy(
                            checkRequired("attribute", attribute),
                            maxGroups,
                            path,
                            setBy,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): GroupBy = apply {
                    if (validated) {
                        return@apply
                    }

                    attribute().validate()
                    maxGroups()
                    path()
                    setBy().ifPresent { it.validate() }
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
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
                    (attribute.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (maxGroups.asKnown().isPresent) 1 else 0) +
                        (if (path.asKnown().isPresent) 1 else 0) +
                        (setBy.asKnown().getOrNull()?.validity() ?: 0)

                class Attribute
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val NAME = of("name")

                        @JvmField val RUN_TYPE = of("run_type")

                        @JvmField val TAG = of("tag")

                        @JvmField val METADATA = of("metadata")

                        @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
                    }

                    /** An enum containing [Attribute]'s known values. */
                    enum class Known {
                        NAME,
                        RUN_TYPE,
                        TAG,
                        METADATA,
                    }

                    /**
                     * An enum containing [Attribute]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Attribute] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        NAME,
                        RUN_TYPE,
                        TAG,
                        METADATA,
                        /**
                         * An enum member indicating that [Attribute] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            NAME -> Value.NAME
                            RUN_TYPE -> Value.RUN_TYPE
                            TAG -> Value.TAG
                            METADATA -> Value.METADATA
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            NAME -> Known.NAME
                            RUN_TYPE -> Known.RUN_TYPE
                            TAG -> Known.TAG
                            METADATA -> Known.METADATA
                            else -> throw LangChainInvalidDataException("Unknown Attribute: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LangChainInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Attribute = apply {
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
                        } catch (e: LangChainInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Attribute && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class SetBy @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SECTION = of("section")

                        @JvmField val SERIES = of("series")

                        @JvmStatic fun of(value: String) = SetBy(JsonField.of(value))
                    }

                    /** An enum containing [SetBy]'s known values. */
                    enum class Known {
                        SECTION,
                        SERIES,
                    }

                    /**
                     * An enum containing [SetBy]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [SetBy] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SECTION,
                        SERIES,
                        /**
                         * An enum member indicating that [SetBy] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SECTION -> Value.SECTION
                            SERIES -> Value.SERIES
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SECTION -> Known.SECTION
                            SERIES -> Known.SERIES
                            else -> throw LangChainInvalidDataException("Unknown SetBy: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LangChainInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): SetBy = apply {
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
                        } catch (e: LangChainInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SetBy && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is GroupBy &&
                        attribute == other.attribute &&
                        maxGroups == other.maxGroups &&
                        path == other.path &&
                        setBy == other.setBy &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(attribute, maxGroups, path, setBy, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "GroupBy{attribute=$attribute, maxGroups=$maxGroups, path=$path, setBy=$setBy, additionalProperties=$additionalProperties}"
            }

            /** LGP Metrics you can chart. */
            class ProjectMetric
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MEMORY_USAGE = of("memory_usage")

                    @JvmField val CPU_USAGE = of("cpu_usage")

                    @JvmField val DISK_USAGE = of("disk_usage")

                    @JvmField val RESTART_COUNT = of("restart_count")

                    @JvmField val REPLICA_COUNT = of("replica_count")

                    @JvmField val WORKER_COUNT = of("worker_count")

                    @JvmField val LG_RUN_COUNT = of("lg_run_count")

                    @JvmField val RESPONSES_PER_SECOND = of("responses_per_second")

                    @JvmField val ERROR_RESPONSES_PER_SECOND = of("error_responses_per_second")

                    @JvmField val P95_LATENCY = of("p95_latency")

                    @JvmStatic fun of(value: String) = ProjectMetric(JsonField.of(value))
                }

                /** An enum containing [ProjectMetric]'s known values. */
                enum class Known {
                    MEMORY_USAGE,
                    CPU_USAGE,
                    DISK_USAGE,
                    RESTART_COUNT,
                    REPLICA_COUNT,
                    WORKER_COUNT,
                    LG_RUN_COUNT,
                    RESPONSES_PER_SECOND,
                    ERROR_RESPONSES_PER_SECOND,
                    P95_LATENCY,
                }

                /**
                 * An enum containing [ProjectMetric]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ProjectMetric] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MEMORY_USAGE,
                    CPU_USAGE,
                    DISK_USAGE,
                    RESTART_COUNT,
                    REPLICA_COUNT,
                    WORKER_COUNT,
                    LG_RUN_COUNT,
                    RESPONSES_PER_SECOND,
                    ERROR_RESPONSES_PER_SECOND,
                    P95_LATENCY,
                    /**
                     * An enum member indicating that [ProjectMetric] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MEMORY_USAGE -> Value.MEMORY_USAGE
                        CPU_USAGE -> Value.CPU_USAGE
                        DISK_USAGE -> Value.DISK_USAGE
                        RESTART_COUNT -> Value.RESTART_COUNT
                        REPLICA_COUNT -> Value.REPLICA_COUNT
                        WORKER_COUNT -> Value.WORKER_COUNT
                        LG_RUN_COUNT -> Value.LG_RUN_COUNT
                        RESPONSES_PER_SECOND -> Value.RESPONSES_PER_SECOND
                        ERROR_RESPONSES_PER_SECOND -> Value.ERROR_RESPONSES_PER_SECOND
                        P95_LATENCY -> Value.P95_LATENCY
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        MEMORY_USAGE -> Known.MEMORY_USAGE
                        CPU_USAGE -> Known.CPU_USAGE
                        DISK_USAGE -> Known.DISK_USAGE
                        RESTART_COUNT -> Known.RESTART_COUNT
                        REPLICA_COUNT -> Known.REPLICA_COUNT
                        WORKER_COUNT -> Known.WORKER_COUNT
                        LG_RUN_COUNT -> Known.LG_RUN_COUNT
                        RESPONSES_PER_SECOND -> Known.RESPONSES_PER_SECOND
                        ERROR_RESPONSES_PER_SECOND -> Known.ERROR_RESPONSES_PER_SECOND
                        P95_LATENCY -> Known.P95_LATENCY
                        else -> throw LangChainInvalidDataException("Unknown ProjectMetric: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangChainInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): ProjectMetric = apply {
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
                    } catch (e: LangChainInvalidDataException) {
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

                    return other is ProjectMetric && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Series &&
                    id == other.id &&
                    metric == other.metric &&
                    name == other.name &&
                    feedbackKey == other.feedbackKey &&
                    filters == other.filters &&
                    groupBy == other.groupBy &&
                    projectMetric == other.projectMetric &&
                    workspaceId == other.workspaceId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    metric,
                    name,
                    feedbackKey,
                    filters,
                    groupBy,
                    projectMetric,
                    workspaceId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Series{id=$id, metric=$metric, name=$name, feedbackKey=$feedbackKey, filters=$filters, groupBy=$groupBy, projectMetric=$projectMetric, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
        }

        class CommonFilters
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val filter: JsonField<String>,
            private val session: JsonField<List<String>>,
            private val traceFilter: JsonField<String>,
            private val treeFilter: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("filter")
                @ExcludeMissing
                filter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("session")
                @ExcludeMissing
                session: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("trace_filter")
                @ExcludeMissing
                traceFilter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tree_filter")
                @ExcludeMissing
                treeFilter: JsonField<String> = JsonMissing.of(),
            ) : this(filter, session, traceFilter, treeFilter, mutableMapOf())

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun filter(): Optional<String> = filter.getOptional("filter")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun session(): Optional<List<String>> = session.getOptional("session")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

            /**
             * Returns the raw JSON value of [filter].
             *
             * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

            /**
             * Returns the raw JSON value of [session].
             *
             * Unlike [session], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("session")
            @ExcludeMissing
            fun _session(): JsonField<List<String>> = session

            /**
             * Returns the raw JSON value of [traceFilter].
             *
             * Unlike [traceFilter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("trace_filter")
            @ExcludeMissing
            fun _traceFilter(): JsonField<String> = traceFilter

            /**
             * Returns the raw JSON value of [treeFilter].
             *
             * Unlike [treeFilter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tree_filter")
            @ExcludeMissing
            fun _treeFilter(): JsonField<String> = treeFilter

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

                /** Returns a mutable builder for constructing an instance of [CommonFilters]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CommonFilters]. */
            class Builder internal constructor() {

                private var filter: JsonField<String> = JsonMissing.of()
                private var session: JsonField<MutableList<String>>? = null
                private var traceFilter: JsonField<String> = JsonMissing.of()
                private var treeFilter: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(commonFilters: CommonFilters) = apply {
                    filter = commonFilters.filter
                    session = commonFilters.session.map { it.toMutableList() }
                    traceFilter = commonFilters.traceFilter
                    treeFilter = commonFilters.treeFilter
                    additionalProperties = commonFilters.additionalProperties.toMutableMap()
                }

                fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
                fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                /**
                 * Sets [Builder.filter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filter] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filter(filter: JsonField<String>) = apply { this.filter = filter }

                fun session(session: List<String>?) = session(JsonField.ofNullable(session))

                /** Alias for calling [Builder.session] with `session.orElse(null)`. */
                fun session(session: Optional<List<String>>) = session(session.getOrNull())

                /**
                 * Sets [Builder.session] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.session] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun session(session: JsonField<List<String>>) = apply {
                    this.session = session.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.session].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSession(session: String) = apply {
                    this.session =
                        (this.session ?: JsonField.of(mutableListOf())).also {
                            checkKnown("session", it).add(session)
                        }
                }

                fun traceFilter(traceFilter: String?) =
                    traceFilter(JsonField.ofNullable(traceFilter))

                /** Alias for calling [Builder.traceFilter] with `traceFilter.orElse(null)`. */
                fun traceFilter(traceFilter: Optional<String>) =
                    traceFilter(traceFilter.getOrNull())

                /**
                 * Sets [Builder.traceFilter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.traceFilter] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun traceFilter(traceFilter: JsonField<String>) = apply {
                    this.traceFilter = traceFilter
                }

                fun treeFilter(treeFilter: String?) = treeFilter(JsonField.ofNullable(treeFilter))

                /** Alias for calling [Builder.treeFilter] with `treeFilter.orElse(null)`. */
                fun treeFilter(treeFilter: Optional<String>) = treeFilter(treeFilter.getOrNull())

                /**
                 * Sets [Builder.treeFilter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.treeFilter] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun treeFilter(treeFilter: JsonField<String>) = apply {
                    this.treeFilter = treeFilter
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CommonFilters].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CommonFilters =
                    CommonFilters(
                        filter,
                        (session ?: JsonMissing.of()).map { it.toImmutable() },
                        traceFilter,
                        treeFilter,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CommonFilters = apply {
                if (validated) {
                    return@apply
                }

                filter()
                session()
                traceFilter()
                treeFilter()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
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
                (if (filter.asKnown().isPresent) 1 else 0) +
                    (session.asKnown().getOrNull()?.size ?: 0) +
                    (if (traceFilter.asKnown().isPresent) 1 else 0) +
                    (if (treeFilter.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CommonFilters &&
                    filter == other.filter &&
                    session == other.session &&
                    traceFilter == other.traceFilter &&
                    treeFilter == other.treeFilter &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(filter, session, traceFilter, treeFilter, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CommonFilters{filter=$filter, session=$session, traceFilter=$traceFilter, treeFilter=$treeFilter, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Chart &&
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
            "Chart{id=$id, chartType=$chartType, data=$data, index=$index, series=$series, title=$title, commonFilters=$commonFilters, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    class SubSection
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val charts: JsonField<List<Chart>>,
        private val index: JsonField<Long>,
        private val title: JsonField<String>,
        private val description: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("charts")
            @ExcludeMissing
            charts: JsonField<List<Chart>> = JsonMissing.of(),
            @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
        ) : this(id, charts, index, title, description, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun charts(): List<Chart> = charts.getRequired("charts")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun index(): Long = index.getRequired("index")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun title(): String = title.getRequired("title")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [charts].
         *
         * Unlike [charts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("charts") @ExcludeMissing fun _charts(): JsonField<List<Chart>> = charts

        /**
         * Returns the raw JSON value of [index].
         *
         * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
             * Returns a mutable builder for constructing an instance of [SubSection].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .charts()
             * .index()
             * .title()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SubSection]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var charts: JsonField<MutableList<Chart>>? = null
            private var index: JsonField<Long>? = null
            private var title: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subSection: SubSection) = apply {
                id = subSection.id
                charts = subSection.charts.map { it.toMutableList() }
                index = subSection.index
                title = subSection.title
                description = subSection.description
                additionalProperties = subSection.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun charts(charts: List<Chart>) = charts(JsonField.of(charts))

            /**
             * Sets [Builder.charts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.charts] with a well-typed `List<Chart>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun charts(charts: JsonField<List<Chart>>) = apply {
                this.charts = charts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Chart] to [charts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addChart(chart: Chart) = apply {
                charts =
                    (charts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("charts", it).add(chart)
                    }
            }

            fun index(index: Long) = index(JsonField.of(index))

            /**
             * Sets [Builder.index] to an arbitrary JSON value.
             *
             * You should usually call [Builder.index] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun index(index: JsonField<Long>) = apply { this.index = index }

            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
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
             * Returns an immutable instance of [SubSection].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .charts()
             * .index()
             * .title()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SubSection =
                SubSection(
                    checkRequired("id", id),
                    checkRequired("charts", charts).map { it.toImmutable() },
                    checkRequired("index", index),
                    checkRequired("title", title),
                    description,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SubSection = apply {
            if (validated) {
                return@apply
            }

            id()
            charts().forEach { it.validate() }
            index()
            title()
            description()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (charts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (index.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0)

        class Chart
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val chartType: JsonField<ChartType>,
            private val data: JsonField<List<Data>>,
            private val index: JsonField<Long>,
            private val series: JsonField<List<Series>>,
            private val title: JsonField<String>,
            private val commonFilters: JsonField<CommonFilters>,
            private val description: JsonField<String>,
            private val metadata: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("chart_type")
                @ExcludeMissing
                chartType: JsonField<ChartType> = JsonMissing.of(),
                @JsonProperty("data")
                @ExcludeMissing
                data: JsonField<List<Data>> = JsonMissing.of(),
                @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("series")
                @ExcludeMissing
                series: JsonField<List<Series>> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
                @JsonProperty("common_filters")
                @ExcludeMissing
                commonFilters: JsonField<CommonFilters> = JsonMissing.of(),
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
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Enum for custom chart types.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun chartType(): ChartType = chartType.getRequired("chart_type")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun data(): List<Data> = data.getRequired("data")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun index(): Long = index.getRequired("index")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun series(): List<Series> = series.getRequired("series")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun title(): String = title.getRequired("title")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun commonFilters(): Optional<CommonFilters> =
                commonFilters.getOptional("common_filters")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
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
             * Unlike [chartType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("chart_type")
            @ExcludeMissing
            fun _chartType(): JsonField<ChartType> = chartType

            /**
             * Returns the raw JSON value of [data].
             *
             * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
            @JsonProperty("series") @ExcludeMissing fun _series(): JsonField<List<Series>> = series

            /**
             * Returns the raw JSON value of [title].
             *
             * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

            /**
             * Returns the raw JSON value of [commonFilters].
             *
             * Unlike [commonFilters], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("common_filters")
            @ExcludeMissing
            fun _commonFilters(): JsonField<CommonFilters> = commonFilters

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

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

            /** A builder for [Chart]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var chartType: JsonField<ChartType>? = null
                private var data: JsonField<MutableList<Data>>? = null
                private var index: JsonField<Long>? = null
                private var series: JsonField<MutableList<Series>>? = null
                private var title: JsonField<String>? = null
                private var commonFilters: JsonField<CommonFilters> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var metadata: JsonValue = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(chart: Chart) = apply {
                    id = chart.id
                    chartType = chart.chartType
                    data = chart.data.map { it.toMutableList() }
                    index = chart.index
                    series = chart.series.map { it.toMutableList() }
                    title = chart.title
                    commonFilters = chart.commonFilters
                    description = chart.description
                    metadata = chart.metadata
                    additionalProperties = chart.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Enum for custom chart types. */
                fun chartType(chartType: ChartType) = chartType(JsonField.of(chartType))

                /**
                 * Sets [Builder.chartType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chartType] with a well-typed [ChartType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chartType(chartType: JsonField<ChartType>) = apply {
                    this.chartType = chartType
                }

                fun data(data: List<Data>) = data(JsonField.of(data))

                /**
                 * Sets [Builder.data] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.data] with a well-typed `List<Data>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun data(data: JsonField<List<Data>>) = apply {
                    this.data = data.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Data] to [Builder.data].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addData(data: Data) = apply {
                    this.data =
                        (this.data ?: JsonField.of(mutableListOf())).also {
                            checkKnown("data", it).add(data)
                        }
                }

                fun index(index: Long) = index(JsonField.of(index))

                /**
                 * Sets [Builder.index] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.index] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun index(index: JsonField<Long>) = apply { this.index = index }

                fun series(series: List<Series>) = series(JsonField.of(series))

                /**
                 * Sets [Builder.series] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.series] with a well-typed `List<Series>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun series(series: JsonField<List<Series>>) = apply {
                    this.series = series.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Series] to [Builder.series].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSeries(series: Series) = apply {
                    this.series =
                        (this.series ?: JsonField.of(mutableListOf())).also {
                            checkKnown("series", it).add(series)
                        }
                }

                fun title(title: String) = title(JsonField.of(title))

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

                fun commonFilters(commonFilters: CommonFilters?) =
                    commonFilters(JsonField.ofNullable(commonFilters))

                /** Alias for calling [Builder.commonFilters] with `commonFilters.orElse(null)`. */
                fun commonFilters(commonFilters: Optional<CommonFilters>) =
                    commonFilters(commonFilters.getOrNull())

                /**
                 * Sets [Builder.commonFilters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.commonFilters] with a well-typed [CommonFilters]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun commonFilters(commonFilters: JsonField<CommonFilters>) = apply {
                    this.commonFilters = commonFilters
                }

                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** Alias for calling [Builder.description] with `description.orElse(null)`. */
                fun description(description: Optional<String>) =
                    description(description.getOrNull())

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
                fun build(): Chart =
                    Chart(
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

            fun validate(): Chart = apply {
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
                } catch (e: LangChainInvalidDataException) {
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (chartType.asKnown().getOrNull()?.validity() ?: 0) +
                    (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (index.asKnown().isPresent) 1 else 0) +
                    (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (title.asKnown().isPresent) 1 else 0) +
                    (commonFilters.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (description.asKnown().isPresent) 1 else 0)

            /** Enum for custom chart types. */
            class ChartType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val LINE = of("line")

                    @JvmField val BAR = of("bar")

                    @JvmStatic fun of(value: String) = ChartType(JsonField.of(value))
                }

                /** An enum containing [ChartType]'s known values. */
                enum class Known {
                    LINE,
                    BAR,
                }

                /**
                 * An enum containing [ChartType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [ChartType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LINE,
                    BAR,
                    /**
                     * An enum member indicating that [ChartType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        LINE -> Value.LINE
                        BAR -> Value.BAR
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        LINE -> Known.LINE
                        BAR -> Known.BAR
                        else -> throw LangChainInvalidDataException("Unknown ChartType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangChainInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): ChartType = apply {
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
                    } catch (e: LangChainInvalidDataException) {
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

                    return other is ChartType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Data
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val seriesId: JsonField<String>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val value: JsonField<Value>,
                private val group: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("series_id")
                    @ExcludeMissing
                    seriesId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<Value> = JsonMissing.of(),
                    @JsonProperty("group")
                    @ExcludeMissing
                    group: JsonField<String> = JsonMissing.of(),
                ) : this(seriesId, timestamp, value, group, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun seriesId(): String = seriesId.getRequired("series_id")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun value(): Optional<Value> = value.getOptional("value")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun group(): Optional<String> = group.getOptional("group")

                /**
                 * Returns the raw JSON value of [seriesId].
                 *
                 * Unlike [seriesId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("series_id")
                @ExcludeMissing
                fun _seriesId(): JsonField<String> = seriesId

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

                /**
                 * Returns the raw JSON value of [group].
                 *
                 * Unlike [group], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<String> = group

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
                     * Returns a mutable builder for constructing an instance of [Data].
                     *
                     * The following fields are required:
                     * ```java
                     * .seriesId()
                     * .timestamp()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Data]. */
                class Builder internal constructor() {

                    private var seriesId: JsonField<String>? = null
                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var value: JsonField<Value>? = null
                    private var group: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(data: Data) = apply {
                        seriesId = data.seriesId
                        timestamp = data.timestamp
                        value = data.value
                        group = data.group
                        additionalProperties = data.additionalProperties.toMutableMap()
                    }

                    fun seriesId(seriesId: String) = seriesId(JsonField.of(seriesId))

                    /**
                     * Sets [Builder.seriesId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.seriesId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun seriesId(seriesId: JsonField<String>) = apply { this.seriesId = seriesId }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun value(value: Value?) = value(JsonField.ofNullable(value))

                    /** Alias for calling [Builder.value] with `value.orElse(null)`. */
                    fun value(value: Optional<Value>) = value(value.getOrNull())

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Value] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Value>) = apply { this.value = value }

                    /** Alias for calling [value] with `Value.ofNumber(number)`. */
                    fun value(number: Double) = value(Value.ofNumber(number))

                    /** Alias for calling [value] with `Value.ofJson(json)`. */
                    fun value(json: JsonValue) = value(Value.ofJson(json))

                    fun group(group: String?) = group(JsonField.ofNullable(group))

                    /** Alias for calling [Builder.group] with `group.orElse(null)`. */
                    fun group(group: Optional<String>) = group(group.getOrNull())

                    /**
                     * Sets [Builder.group] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.group] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun group(group: JsonField<String>) = apply { this.group = group }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Data].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .seriesId()
                     * .timestamp()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Data =
                        Data(
                            checkRequired("seriesId", seriesId),
                            checkRequired("timestamp", timestamp),
                            checkRequired("value", value),
                            group,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Data = apply {
                    if (validated) {
                        return@apply
                    }

                    seriesId()
                    timestamp()
                    value().ifPresent { it.validate() }
                    group()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
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
                    (if (seriesId.asKnown().isPresent) 1 else 0) +
                        (if (timestamp.asKnown().isPresent) 1 else 0) +
                        (value.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (group.asKnown().isPresent) 1 else 0)

                @JsonDeserialize(using = Value.Deserializer::class)
                @JsonSerialize(using = Value.Serializer::class)
                class Value
                private constructor(
                    private val number: Double? = null,
                    private val json: JsonValue? = null,
                    private val _json: JsonValue? = null,
                ) {

                    fun number(): Optional<Double> = Optional.ofNullable(number)

                    fun json(): Optional<JsonValue> = Optional.ofNullable(json)

                    fun isNumber(): Boolean = number != null

                    fun isJson(): Boolean = json != null

                    fun asNumber(): Double = number.getOrThrow("number")

                    fun asJson(): JsonValue = json.getOrThrow("json")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            number != null -> visitor.visitNumber(number)
                            json != null -> visitor.visitJson(json)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): Value = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitNumber(number: Double) {}

                                override fun visitJson(json: JsonValue) {}
                            }
                        )
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LangChainInvalidDataException) {
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
                        accept(
                            object : Visitor<Int> {
                                override fun visitNumber(number: Double) = 1

                                override fun visitJson(json: JsonValue) = 1

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Value && number == other.number && json == other.json
                    }

                    override fun hashCode(): Int = Objects.hash(number, json)

                    override fun toString(): String =
                        when {
                            number != null -> "Value{number=$number}"
                            json != null -> "Value{json=$json}"
                            _json != null -> "Value{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid Value")
                        }

                    companion object {

                        @JvmStatic fun ofNumber(number: Double) = Value(number = number)

                        @JvmStatic fun ofJson(json: JsonValue) = Value(json = json)
                    }

                    /**
                     * An interface that defines how to map each variant of [Value] to a value of
                     * type [T].
                     */
                    interface Visitor<out T> {

                        fun visitNumber(number: Double): T

                        fun visitJson(json: JsonValue): T

                        /**
                         * Maps an unknown variant of [Value] to a value of type [T].
                         *
                         * An instance of [Value] can contain an unknown variant if it was
                         * deserialized from data that doesn't match any known variant. For example,
                         * if the SDK is on an older version than the API, then the API may respond
                         * with new variants that the SDK is unaware of.
                         *
                         * @throws LangChainInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw LangChainInvalidDataException("Unknown Value: $json")
                        }
                    }

                    internal class Deserializer : BaseDeserializer<Value>(Value::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): Value {
                            val json = JsonValue.fromJsonNode(node)

                            val bestMatches =
                                sequenceOf(
                                        tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                            Value(number = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                            Value(json = it, _json = json)
                                        },
                                    )
                                    .filterNotNull()
                                    .allMaxBy { it.validity() }
                                    .toList()
                            return when (bestMatches.size) {
                                // This can happen if what we're deserializing is completely
                                // incompatible with all the possible variants.
                                0 -> Value(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                            }
                        }
                    }

                    internal class Serializer : BaseSerializer<Value>(Value::class) {

                        override fun serialize(
                            value: Value,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.number != null -> generator.writeObject(value.number)
                                value.json != null -> generator.writeObject(value.json)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Value")
                            }
                        }
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Data &&
                        seriesId == other.seriesId &&
                        timestamp == other.timestamp &&
                        value == other.value &&
                        group == other.group &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(seriesId, timestamp, value, group, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Data{seriesId=$seriesId, timestamp=$timestamp, value=$value, group=$group, additionalProperties=$additionalProperties}"
            }

            class Series
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val metric: JsonField<Metric>,
                private val name: JsonField<String>,
                private val feedbackKey: JsonField<String>,
                private val filters: JsonField<Filters>,
                private val groupBy: JsonField<GroupBy>,
                private val projectMetric: JsonField<ProjectMetric>,
                private val workspaceId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("metric")
                    @ExcludeMissing
                    metric: JsonField<Metric> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("feedback_key")
                    @ExcludeMissing
                    feedbackKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("filters")
                    @ExcludeMissing
                    filters: JsonField<Filters> = JsonMissing.of(),
                    @JsonProperty("group_by")
                    @ExcludeMissing
                    groupBy: JsonField<GroupBy> = JsonMissing.of(),
                    @JsonProperty("project_metric")
                    @ExcludeMissing
                    projectMetric: JsonField<ProjectMetric> = JsonMissing.of(),
                    @JsonProperty("workspace_id")
                    @ExcludeMissing
                    workspaceId: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    metric,
                    name,
                    feedbackKey,
                    filters,
                    groupBy,
                    projectMetric,
                    workspaceId,
                    mutableMapOf(),
                )

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Metrics you can chart. Feedback metrics are not available for organization-scoped
                 * charts.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun metric(): Metric = metric.getRequired("metric")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun feedbackKey(): Optional<String> = feedbackKey.getOptional("feedback_key")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun filters(): Optional<Filters> = filters.getOptional("filters")

                /**
                 * Include additional information about where the group_by param was set.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun groupBy(): Optional<GroupBy> = groupBy.getOptional("group_by")

                /**
                 * LGP Metrics you can chart.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun projectMetric(): Optional<ProjectMetric> =
                    projectMetric.getOptional("project_metric")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun workspaceId(): Optional<String> = workspaceId.getOptional("workspace_id")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [metric].
                 *
                 * Unlike [metric], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<Metric> = metric

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [feedbackKey].
                 *
                 * Unlike [feedbackKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("feedback_key")
                @ExcludeMissing
                fun _feedbackKey(): JsonField<String> = feedbackKey

                /**
                 * Returns the raw JSON value of [filters].
                 *
                 * Unlike [filters], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("filters")
                @ExcludeMissing
                fun _filters(): JsonField<Filters> = filters

                /**
                 * Returns the raw JSON value of [groupBy].
                 *
                 * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("group_by")
                @ExcludeMissing
                fun _groupBy(): JsonField<GroupBy> = groupBy

                /**
                 * Returns the raw JSON value of [projectMetric].
                 *
                 * Unlike [projectMetric], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("project_metric")
                @ExcludeMissing
                fun _projectMetric(): JsonField<ProjectMetric> = projectMetric

                /**
                 * Returns the raw JSON value of [workspaceId].
                 *
                 * Unlike [workspaceId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("workspace_id")
                @ExcludeMissing
                fun _workspaceId(): JsonField<String> = workspaceId

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
                     * Returns a mutable builder for constructing an instance of [Series].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .metric()
                     * .name()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Series]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var metric: JsonField<Metric>? = null
                    private var name: JsonField<String>? = null
                    private var feedbackKey: JsonField<String> = JsonMissing.of()
                    private var filters: JsonField<Filters> = JsonMissing.of()
                    private var groupBy: JsonField<GroupBy> = JsonMissing.of()
                    private var projectMetric: JsonField<ProjectMetric> = JsonMissing.of()
                    private var workspaceId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(series: Series) = apply {
                        id = series.id
                        metric = series.metric
                        name = series.name
                        feedbackKey = series.feedbackKey
                        filters = series.filters
                        groupBy = series.groupBy
                        projectMetric = series.projectMetric
                        workspaceId = series.workspaceId
                        additionalProperties = series.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * Metrics you can chart. Feedback metrics are not available for
                     * organization-scoped charts.
                     */
                    fun metric(metric: Metric) = metric(JsonField.of(metric))

                    /**
                     * Sets [Builder.metric] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metric] with a well-typed [Metric] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metric(metric: JsonField<Metric>) = apply { this.metric = metric }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun feedbackKey(feedbackKey: String?) =
                        feedbackKey(JsonField.ofNullable(feedbackKey))

                    /** Alias for calling [Builder.feedbackKey] with `feedbackKey.orElse(null)`. */
                    fun feedbackKey(feedbackKey: Optional<String>) =
                        feedbackKey(feedbackKey.getOrNull())

                    /**
                     * Sets [Builder.feedbackKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.feedbackKey] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun feedbackKey(feedbackKey: JsonField<String>) = apply {
                        this.feedbackKey = feedbackKey
                    }

                    fun filters(filters: Filters?) = filters(JsonField.ofNullable(filters))

                    /** Alias for calling [Builder.filters] with `filters.orElse(null)`. */
                    fun filters(filters: Optional<Filters>) = filters(filters.getOrNull())

                    /**
                     * Sets [Builder.filters] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.filters] with a well-typed [Filters] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun filters(filters: JsonField<Filters>) = apply { this.filters = filters }

                    /** Include additional information about where the group_by param was set. */
                    fun groupBy(groupBy: GroupBy?) = groupBy(JsonField.ofNullable(groupBy))

                    /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
                    fun groupBy(groupBy: Optional<GroupBy>) = groupBy(groupBy.getOrNull())

                    /**
                     * Sets [Builder.groupBy] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groupBy] with a well-typed [GroupBy] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun groupBy(groupBy: JsonField<GroupBy>) = apply { this.groupBy = groupBy }

                    /** LGP Metrics you can chart. */
                    fun projectMetric(projectMetric: ProjectMetric?) =
                        projectMetric(JsonField.ofNullable(projectMetric))

                    /**
                     * Alias for calling [Builder.projectMetric] with `projectMetric.orElse(null)`.
                     */
                    fun projectMetric(projectMetric: Optional<ProjectMetric>) =
                        projectMetric(projectMetric.getOrNull())

                    /**
                     * Sets [Builder.projectMetric] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.projectMetric] with a well-typed
                     * [ProjectMetric] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun projectMetric(projectMetric: JsonField<ProjectMetric>) = apply {
                        this.projectMetric = projectMetric
                    }

                    fun workspaceId(workspaceId: String?) =
                        workspaceId(JsonField.ofNullable(workspaceId))

                    /** Alias for calling [Builder.workspaceId] with `workspaceId.orElse(null)`. */
                    fun workspaceId(workspaceId: Optional<String>) =
                        workspaceId(workspaceId.getOrNull())

                    /**
                     * Sets [Builder.workspaceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.workspaceId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun workspaceId(workspaceId: JsonField<String>) = apply {
                        this.workspaceId = workspaceId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Series].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .metric()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Series =
                        Series(
                            checkRequired("id", id),
                            checkRequired("metric", metric),
                            checkRequired("name", name),
                            feedbackKey,
                            filters,
                            groupBy,
                            projectMetric,
                            workspaceId,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Series = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    metric().validate()
                    name()
                    feedbackKey()
                    filters().ifPresent { it.validate() }
                    groupBy().ifPresent { it.validate() }
                    projectMetric().ifPresent { it.validate() }
                    workspaceId()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (metric.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (if (feedbackKey.asKnown().isPresent) 1 else 0) +
                        (filters.asKnown().getOrNull()?.validity() ?: 0) +
                        (groupBy.asKnown().getOrNull()?.validity() ?: 0) +
                        (projectMetric.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (workspaceId.asKnown().isPresent) 1 else 0)

                /**
                 * Metrics you can chart. Feedback metrics are not available for organization-scoped
                 * charts.
                 */
                class Metric
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val RUN_COUNT = of("run_count")

                        @JvmField val LATENCY_P50 = of("latency_p50")

                        @JvmField val LATENCY_P99 = of("latency_p99")

                        @JvmField val LATENCY_AVG = of("latency_avg")

                        @JvmField val FIRST_TOKEN_P50 = of("first_token_p50")

                        @JvmField val FIRST_TOKEN_P99 = of("first_token_p99")

                        @JvmField val TOTAL_TOKENS = of("total_tokens")

                        @JvmField val PROMPT_TOKENS = of("prompt_tokens")

                        @JvmField val COMPLETION_TOKENS = of("completion_tokens")

                        @JvmField val MEDIAN_TOKENS = of("median_tokens")

                        @JvmField val COMPLETION_TOKENS_P50 = of("completion_tokens_p50")

                        @JvmField val PROMPT_TOKENS_P50 = of("prompt_tokens_p50")

                        @JvmField val TOKENS_P99 = of("tokens_p99")

                        @JvmField val COMPLETION_TOKENS_P99 = of("completion_tokens_p99")

                        @JvmField val PROMPT_TOKENS_P99 = of("prompt_tokens_p99")

                        @JvmField val FEEDBACK = of("feedback")

                        @JvmField val FEEDBACK_SCORE_AVG = of("feedback_score_avg")

                        @JvmField val FEEDBACK_VALUES = of("feedback_values")

                        @JvmField val TOTAL_COST = of("total_cost")

                        @JvmField val PROMPT_COST = of("prompt_cost")

                        @JvmField val COMPLETION_COST = of("completion_cost")

                        @JvmField val ERROR_RATE = of("error_rate")

                        @JvmField val STREAMING_RATE = of("streaming_rate")

                        @JvmField val COST_P50 = of("cost_p50")

                        @JvmField val COST_P99 = of("cost_p99")

                        @JvmStatic fun of(value: String) = Metric(JsonField.of(value))
                    }

                    /** An enum containing [Metric]'s known values. */
                    enum class Known {
                        RUN_COUNT,
                        LATENCY_P50,
                        LATENCY_P99,
                        LATENCY_AVG,
                        FIRST_TOKEN_P50,
                        FIRST_TOKEN_P99,
                        TOTAL_TOKENS,
                        PROMPT_TOKENS,
                        COMPLETION_TOKENS,
                        MEDIAN_TOKENS,
                        COMPLETION_TOKENS_P50,
                        PROMPT_TOKENS_P50,
                        TOKENS_P99,
                        COMPLETION_TOKENS_P99,
                        PROMPT_TOKENS_P99,
                        FEEDBACK,
                        FEEDBACK_SCORE_AVG,
                        FEEDBACK_VALUES,
                        TOTAL_COST,
                        PROMPT_COST,
                        COMPLETION_COST,
                        ERROR_RATE,
                        STREAMING_RATE,
                        COST_P50,
                        COST_P99,
                    }

                    /**
                     * An enum containing [Metric]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Metric] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        RUN_COUNT,
                        LATENCY_P50,
                        LATENCY_P99,
                        LATENCY_AVG,
                        FIRST_TOKEN_P50,
                        FIRST_TOKEN_P99,
                        TOTAL_TOKENS,
                        PROMPT_TOKENS,
                        COMPLETION_TOKENS,
                        MEDIAN_TOKENS,
                        COMPLETION_TOKENS_P50,
                        PROMPT_TOKENS_P50,
                        TOKENS_P99,
                        COMPLETION_TOKENS_P99,
                        PROMPT_TOKENS_P99,
                        FEEDBACK,
                        FEEDBACK_SCORE_AVG,
                        FEEDBACK_VALUES,
                        TOTAL_COST,
                        PROMPT_COST,
                        COMPLETION_COST,
                        ERROR_RATE,
                        STREAMING_RATE,
                        COST_P50,
                        COST_P99,
                        /**
                         * An enum member indicating that [Metric] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            RUN_COUNT -> Value.RUN_COUNT
                            LATENCY_P50 -> Value.LATENCY_P50
                            LATENCY_P99 -> Value.LATENCY_P99
                            LATENCY_AVG -> Value.LATENCY_AVG
                            FIRST_TOKEN_P50 -> Value.FIRST_TOKEN_P50
                            FIRST_TOKEN_P99 -> Value.FIRST_TOKEN_P99
                            TOTAL_TOKENS -> Value.TOTAL_TOKENS
                            PROMPT_TOKENS -> Value.PROMPT_TOKENS
                            COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                            MEDIAN_TOKENS -> Value.MEDIAN_TOKENS
                            COMPLETION_TOKENS_P50 -> Value.COMPLETION_TOKENS_P50
                            PROMPT_TOKENS_P50 -> Value.PROMPT_TOKENS_P50
                            TOKENS_P99 -> Value.TOKENS_P99
                            COMPLETION_TOKENS_P99 -> Value.COMPLETION_TOKENS_P99
                            PROMPT_TOKENS_P99 -> Value.PROMPT_TOKENS_P99
                            FEEDBACK -> Value.FEEDBACK
                            FEEDBACK_SCORE_AVG -> Value.FEEDBACK_SCORE_AVG
                            FEEDBACK_VALUES -> Value.FEEDBACK_VALUES
                            TOTAL_COST -> Value.TOTAL_COST
                            PROMPT_COST -> Value.PROMPT_COST
                            COMPLETION_COST -> Value.COMPLETION_COST
                            ERROR_RATE -> Value.ERROR_RATE
                            STREAMING_RATE -> Value.STREAMING_RATE
                            COST_P50 -> Value.COST_P50
                            COST_P99 -> Value.COST_P99
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            RUN_COUNT -> Known.RUN_COUNT
                            LATENCY_P50 -> Known.LATENCY_P50
                            LATENCY_P99 -> Known.LATENCY_P99
                            LATENCY_AVG -> Known.LATENCY_AVG
                            FIRST_TOKEN_P50 -> Known.FIRST_TOKEN_P50
                            FIRST_TOKEN_P99 -> Known.FIRST_TOKEN_P99
                            TOTAL_TOKENS -> Known.TOTAL_TOKENS
                            PROMPT_TOKENS -> Known.PROMPT_TOKENS
                            COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                            MEDIAN_TOKENS -> Known.MEDIAN_TOKENS
                            COMPLETION_TOKENS_P50 -> Known.COMPLETION_TOKENS_P50
                            PROMPT_TOKENS_P50 -> Known.PROMPT_TOKENS_P50
                            TOKENS_P99 -> Known.TOKENS_P99
                            COMPLETION_TOKENS_P99 -> Known.COMPLETION_TOKENS_P99
                            PROMPT_TOKENS_P99 -> Known.PROMPT_TOKENS_P99
                            FEEDBACK -> Known.FEEDBACK
                            FEEDBACK_SCORE_AVG -> Known.FEEDBACK_SCORE_AVG
                            FEEDBACK_VALUES -> Known.FEEDBACK_VALUES
                            TOTAL_COST -> Known.TOTAL_COST
                            PROMPT_COST -> Known.PROMPT_COST
                            COMPLETION_COST -> Known.COMPLETION_COST
                            ERROR_RATE -> Known.ERROR_RATE
                            STREAMING_RATE -> Known.STREAMING_RATE
                            COST_P50 -> Known.COST_P50
                            COST_P99 -> Known.COST_P99
                            else -> throw LangChainInvalidDataException("Unknown Metric: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LangChainInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Metric = apply {
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
                        } catch (e: LangChainInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metric && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Filters
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val filter: JsonField<String>,
                    private val session: JsonField<List<String>>,
                    private val traceFilter: JsonField<String>,
                    private val treeFilter: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("filter")
                        @ExcludeMissing
                        filter: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("session")
                        @ExcludeMissing
                        session: JsonField<List<String>> = JsonMissing.of(),
                        @JsonProperty("trace_filter")
                        @ExcludeMissing
                        traceFilter: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("tree_filter")
                        @ExcludeMissing
                        treeFilter: JsonField<String> = JsonMissing.of(),
                    ) : this(filter, session, traceFilter, treeFilter, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun filter(): Optional<String> = filter.getOptional("filter")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun session(): Optional<List<String>> = session.getOptional("session")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

                    /**
                     * Returns the raw JSON value of [filter].
                     *
                     * Unlike [filter], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("filter")
                    @ExcludeMissing
                    fun _filter(): JsonField<String> = filter

                    /**
                     * Returns the raw JSON value of [session].
                     *
                     * Unlike [session], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("session")
                    @ExcludeMissing
                    fun _session(): JsonField<List<String>> = session

                    /**
                     * Returns the raw JSON value of [traceFilter].
                     *
                     * Unlike [traceFilter], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("trace_filter")
                    @ExcludeMissing
                    fun _traceFilter(): JsonField<String> = traceFilter

                    /**
                     * Returns the raw JSON value of [treeFilter].
                     *
                     * Unlike [treeFilter], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("tree_filter")
                    @ExcludeMissing
                    fun _treeFilter(): JsonField<String> = treeFilter

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

                        /** Returns a mutable builder for constructing an instance of [Filters]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Filters]. */
                    class Builder internal constructor() {

                        private var filter: JsonField<String> = JsonMissing.of()
                        private var session: JsonField<MutableList<String>>? = null
                        private var traceFilter: JsonField<String> = JsonMissing.of()
                        private var treeFilter: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(filters: Filters) = apply {
                            filter = filters.filter
                            session = filters.session.map { it.toMutableList() }
                            traceFilter = filters.traceFilter
                            treeFilter = filters.treeFilter
                            additionalProperties = filters.additionalProperties.toMutableMap()
                        }

                        fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
                        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                        /**
                         * Sets [Builder.filter] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.filter] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

                        fun session(session: List<String>?) = session(JsonField.ofNullable(session))

                        /** Alias for calling [Builder.session] with `session.orElse(null)`. */
                        fun session(session: Optional<List<String>>) = session(session.getOrNull())

                        /**
                         * Sets [Builder.session] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.session] with a well-typed
                         * `List<String>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun session(session: JsonField<List<String>>) = apply {
                            this.session = session.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [Builder.session].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addSession(session: String) = apply {
                            this.session =
                                (this.session ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("session", it).add(session)
                                }
                        }

                        fun traceFilter(traceFilter: String?) =
                            traceFilter(JsonField.ofNullable(traceFilter))

                        /**
                         * Alias for calling [Builder.traceFilter] with `traceFilter.orElse(null)`.
                         */
                        fun traceFilter(traceFilter: Optional<String>) =
                            traceFilter(traceFilter.getOrNull())

                        /**
                         * Sets [Builder.traceFilter] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.traceFilter] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun traceFilter(traceFilter: JsonField<String>) = apply {
                            this.traceFilter = traceFilter
                        }

                        fun treeFilter(treeFilter: String?) =
                            treeFilter(JsonField.ofNullable(treeFilter))

                        /**
                         * Alias for calling [Builder.treeFilter] with `treeFilter.orElse(null)`.
                         */
                        fun treeFilter(treeFilter: Optional<String>) =
                            treeFilter(treeFilter.getOrNull())

                        /**
                         * Sets [Builder.treeFilter] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.treeFilter] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun treeFilter(treeFilter: JsonField<String>) = apply {
                            this.treeFilter = treeFilter
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Filters].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Filters =
                            Filters(
                                filter,
                                (session ?: JsonMissing.of()).map { it.toImmutable() },
                                traceFilter,
                                treeFilter,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Filters = apply {
                        if (validated) {
                            return@apply
                        }

                        filter()
                        session()
                        traceFilter()
                        treeFilter()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LangChainInvalidDataException) {
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
                        (if (filter.asKnown().isPresent) 1 else 0) +
                            (session.asKnown().getOrNull()?.size ?: 0) +
                            (if (traceFilter.asKnown().isPresent) 1 else 0) +
                            (if (treeFilter.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Filters &&
                            filter == other.filter &&
                            session == other.session &&
                            traceFilter == other.traceFilter &&
                            treeFilter == other.treeFilter &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(filter, session, traceFilter, treeFilter, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Filters{filter=$filter, session=$session, traceFilter=$traceFilter, treeFilter=$treeFilter, additionalProperties=$additionalProperties}"
                }

                /** Include additional information about where the group_by param was set. */
                class GroupBy
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val attribute: JsonField<Attribute>,
                    private val maxGroups: JsonField<Long>,
                    private val path: JsonField<String>,
                    private val setBy: JsonField<SetBy>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("attribute")
                        @ExcludeMissing
                        attribute: JsonField<Attribute> = JsonMissing.of(),
                        @JsonProperty("max_groups")
                        @ExcludeMissing
                        maxGroups: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("path")
                        @ExcludeMissing
                        path: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("set_by")
                        @ExcludeMissing
                        setBy: JsonField<SetBy> = JsonMissing.of(),
                    ) : this(attribute, maxGroups, path, setBy, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun attribute(): Attribute = attribute.getRequired("attribute")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun maxGroups(): Optional<Long> = maxGroups.getOptional("max_groups")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun path(): Optional<String> = path.getOptional("path")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun setBy(): Optional<SetBy> = setBy.getOptional("set_by")

                    /**
                     * Returns the raw JSON value of [attribute].
                     *
                     * Unlike [attribute], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("attribute")
                    @ExcludeMissing
                    fun _attribute(): JsonField<Attribute> = attribute

                    /**
                     * Returns the raw JSON value of [maxGroups].
                     *
                     * Unlike [maxGroups], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("max_groups")
                    @ExcludeMissing
                    fun _maxGroups(): JsonField<Long> = maxGroups

                    /**
                     * Returns the raw JSON value of [path].
                     *
                     * Unlike [path], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

                    /**
                     * Returns the raw JSON value of [setBy].
                     *
                     * Unlike [setBy], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("set_by") @ExcludeMissing fun _setBy(): JsonField<SetBy> = setBy

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
                         * Returns a mutable builder for constructing an instance of [GroupBy].
                         *
                         * The following fields are required:
                         * ```java
                         * .attribute()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [GroupBy]. */
                    class Builder internal constructor() {

                        private var attribute: JsonField<Attribute>? = null
                        private var maxGroups: JsonField<Long> = JsonMissing.of()
                        private var path: JsonField<String> = JsonMissing.of()
                        private var setBy: JsonField<SetBy> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(groupBy: GroupBy) = apply {
                            attribute = groupBy.attribute
                            maxGroups = groupBy.maxGroups
                            path = groupBy.path
                            setBy = groupBy.setBy
                            additionalProperties = groupBy.additionalProperties.toMutableMap()
                        }

                        fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                        /**
                         * Sets [Builder.attribute] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.attribute] with a well-typed [Attribute]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun attribute(attribute: JsonField<Attribute>) = apply {
                            this.attribute = attribute
                        }

                        fun maxGroups(maxGroups: Long) = maxGroups(JsonField.of(maxGroups))

                        /**
                         * Sets [Builder.maxGroups] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.maxGroups] with a well-typed [Long]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun maxGroups(maxGroups: JsonField<Long>) = apply {
                            this.maxGroups = maxGroups
                        }

                        fun path(path: String?) = path(JsonField.ofNullable(path))

                        /** Alias for calling [Builder.path] with `path.orElse(null)`. */
                        fun path(path: Optional<String>) = path(path.getOrNull())

                        /**
                         * Sets [Builder.path] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.path] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun path(path: JsonField<String>) = apply { this.path = path }

                        fun setBy(setBy: SetBy?) = setBy(JsonField.ofNullable(setBy))

                        /** Alias for calling [Builder.setBy] with `setBy.orElse(null)`. */
                        fun setBy(setBy: Optional<SetBy>) = setBy(setBy.getOrNull())

                        /**
                         * Sets [Builder.setBy] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.setBy] with a well-typed [SetBy] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun setBy(setBy: JsonField<SetBy>) = apply { this.setBy = setBy }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [GroupBy].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .attribute()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): GroupBy =
                            GroupBy(
                                checkRequired("attribute", attribute),
                                maxGroups,
                                path,
                                setBy,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): GroupBy = apply {
                        if (validated) {
                            return@apply
                        }

                        attribute().validate()
                        maxGroups()
                        path()
                        setBy().ifPresent { it.validate() }
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LangChainInvalidDataException) {
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
                        (attribute.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (maxGroups.asKnown().isPresent) 1 else 0) +
                            (if (path.asKnown().isPresent) 1 else 0) +
                            (setBy.asKnown().getOrNull()?.validity() ?: 0)

                    class Attribute
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val NAME = of("name")

                            @JvmField val RUN_TYPE = of("run_type")

                            @JvmField val TAG = of("tag")

                            @JvmField val METADATA = of("metadata")

                            @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
                        }

                        /** An enum containing [Attribute]'s known values. */
                        enum class Known {
                            NAME,
                            RUN_TYPE,
                            TAG,
                            METADATA,
                        }

                        /**
                         * An enum containing [Attribute]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Attribute] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            NAME,
                            RUN_TYPE,
                            TAG,
                            METADATA,
                            /**
                             * An enum member indicating that [Attribute] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                NAME -> Value.NAME
                                RUN_TYPE -> Value.RUN_TYPE
                                TAG -> Value.TAG
                                METADATA -> Value.METADATA
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                NAME -> Known.NAME
                                RUN_TYPE -> Known.RUN_TYPE
                                TAG -> Known.TAG
                                METADATA -> Known.METADATA
                                else ->
                                    throw LangChainInvalidDataException("Unknown Attribute: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Attribute = apply {
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
                            } catch (e: LangChainInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Attribute && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class SetBy
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val SECTION = of("section")

                            @JvmField val SERIES = of("series")

                            @JvmStatic fun of(value: String) = SetBy(JsonField.of(value))
                        }

                        /** An enum containing [SetBy]'s known values. */
                        enum class Known {
                            SECTION,
                            SERIES,
                        }

                        /**
                         * An enum containing [SetBy]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [SetBy] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            SECTION,
                            SERIES,
                            /**
                             * An enum member indicating that [SetBy] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                SECTION -> Value.SECTION
                                SERIES -> Value.SERIES
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                SECTION -> Known.SECTION
                                SERIES -> Known.SERIES
                                else -> throw LangChainInvalidDataException("Unknown SetBy: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): SetBy = apply {
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
                            } catch (e: LangChainInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is SetBy && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is GroupBy &&
                            attribute == other.attribute &&
                            maxGroups == other.maxGroups &&
                            path == other.path &&
                            setBy == other.setBy &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(attribute, maxGroups, path, setBy, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "GroupBy{attribute=$attribute, maxGroups=$maxGroups, path=$path, setBy=$setBy, additionalProperties=$additionalProperties}"
                }

                /** LGP Metrics you can chart. */
                class ProjectMetric
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val MEMORY_USAGE = of("memory_usage")

                        @JvmField val CPU_USAGE = of("cpu_usage")

                        @JvmField val DISK_USAGE = of("disk_usage")

                        @JvmField val RESTART_COUNT = of("restart_count")

                        @JvmField val REPLICA_COUNT = of("replica_count")

                        @JvmField val WORKER_COUNT = of("worker_count")

                        @JvmField val LG_RUN_COUNT = of("lg_run_count")

                        @JvmField val RESPONSES_PER_SECOND = of("responses_per_second")

                        @JvmField val ERROR_RESPONSES_PER_SECOND = of("error_responses_per_second")

                        @JvmField val P95_LATENCY = of("p95_latency")

                        @JvmStatic fun of(value: String) = ProjectMetric(JsonField.of(value))
                    }

                    /** An enum containing [ProjectMetric]'s known values. */
                    enum class Known {
                        MEMORY_USAGE,
                        CPU_USAGE,
                        DISK_USAGE,
                        RESTART_COUNT,
                        REPLICA_COUNT,
                        WORKER_COUNT,
                        LG_RUN_COUNT,
                        RESPONSES_PER_SECOND,
                        ERROR_RESPONSES_PER_SECOND,
                        P95_LATENCY,
                    }

                    /**
                     * An enum containing [ProjectMetric]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [ProjectMetric] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MEMORY_USAGE,
                        CPU_USAGE,
                        DISK_USAGE,
                        RESTART_COUNT,
                        REPLICA_COUNT,
                        WORKER_COUNT,
                        LG_RUN_COUNT,
                        RESPONSES_PER_SECOND,
                        ERROR_RESPONSES_PER_SECOND,
                        P95_LATENCY,
                        /**
                         * An enum member indicating that [ProjectMetric] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            MEMORY_USAGE -> Value.MEMORY_USAGE
                            CPU_USAGE -> Value.CPU_USAGE
                            DISK_USAGE -> Value.DISK_USAGE
                            RESTART_COUNT -> Value.RESTART_COUNT
                            REPLICA_COUNT -> Value.REPLICA_COUNT
                            WORKER_COUNT -> Value.WORKER_COUNT
                            LG_RUN_COUNT -> Value.LG_RUN_COUNT
                            RESPONSES_PER_SECOND -> Value.RESPONSES_PER_SECOND
                            ERROR_RESPONSES_PER_SECOND -> Value.ERROR_RESPONSES_PER_SECOND
                            P95_LATENCY -> Value.P95_LATENCY
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            MEMORY_USAGE -> Known.MEMORY_USAGE
                            CPU_USAGE -> Known.CPU_USAGE
                            DISK_USAGE -> Known.DISK_USAGE
                            RESTART_COUNT -> Known.RESTART_COUNT
                            REPLICA_COUNT -> Known.REPLICA_COUNT
                            WORKER_COUNT -> Known.WORKER_COUNT
                            LG_RUN_COUNT -> Known.LG_RUN_COUNT
                            RESPONSES_PER_SECOND -> Known.RESPONSES_PER_SECOND
                            ERROR_RESPONSES_PER_SECOND -> Known.ERROR_RESPONSES_PER_SECOND
                            P95_LATENCY -> Known.P95_LATENCY
                            else ->
                                throw LangChainInvalidDataException("Unknown ProjectMetric: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LangChainInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): ProjectMetric = apply {
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
                        } catch (e: LangChainInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ProjectMetric && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Series &&
                        id == other.id &&
                        metric == other.metric &&
                        name == other.name &&
                        feedbackKey == other.feedbackKey &&
                        filters == other.filters &&
                        groupBy == other.groupBy &&
                        projectMetric == other.projectMetric &&
                        workspaceId == other.workspaceId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        metric,
                        name,
                        feedbackKey,
                        filters,
                        groupBy,
                        projectMetric,
                        workspaceId,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Series{id=$id, metric=$metric, name=$name, feedbackKey=$feedbackKey, filters=$filters, groupBy=$groupBy, projectMetric=$projectMetric, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
            }

            class CommonFilters
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val filter: JsonField<String>,
                private val session: JsonField<List<String>>,
                private val traceFilter: JsonField<String>,
                private val treeFilter: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("filter")
                    @ExcludeMissing
                    filter: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("session")
                    @ExcludeMissing
                    session: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("trace_filter")
                    @ExcludeMissing
                    traceFilter: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tree_filter")
                    @ExcludeMissing
                    treeFilter: JsonField<String> = JsonMissing.of(),
                ) : this(filter, session, traceFilter, treeFilter, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun filter(): Optional<String> = filter.getOptional("filter")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun session(): Optional<List<String>> = session.getOptional("session")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

                /**
                 * Returns the raw JSON value of [filter].
                 *
                 * Unlike [filter], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

                /**
                 * Returns the raw JSON value of [session].
                 *
                 * Unlike [session], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("session")
                @ExcludeMissing
                fun _session(): JsonField<List<String>> = session

                /**
                 * Returns the raw JSON value of [traceFilter].
                 *
                 * Unlike [traceFilter], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("trace_filter")
                @ExcludeMissing
                fun _traceFilter(): JsonField<String> = traceFilter

                /**
                 * Returns the raw JSON value of [treeFilter].
                 *
                 * Unlike [treeFilter], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("tree_filter")
                @ExcludeMissing
                fun _treeFilter(): JsonField<String> = treeFilter

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
                     * Returns a mutable builder for constructing an instance of [CommonFilters].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CommonFilters]. */
                class Builder internal constructor() {

                    private var filter: JsonField<String> = JsonMissing.of()
                    private var session: JsonField<MutableList<String>>? = null
                    private var traceFilter: JsonField<String> = JsonMissing.of()
                    private var treeFilter: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(commonFilters: CommonFilters) = apply {
                        filter = commonFilters.filter
                        session = commonFilters.session.map { it.toMutableList() }
                        traceFilter = commonFilters.traceFilter
                        treeFilter = commonFilters.treeFilter
                        additionalProperties = commonFilters.additionalProperties.toMutableMap()
                    }

                    fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                    /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
                    fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                    /**
                     * Sets [Builder.filter] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.filter] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun filter(filter: JsonField<String>) = apply { this.filter = filter }

                    fun session(session: List<String>?) = session(JsonField.ofNullable(session))

                    /** Alias for calling [Builder.session] with `session.orElse(null)`. */
                    fun session(session: Optional<List<String>>) = session(session.getOrNull())

                    /**
                     * Sets [Builder.session] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.session] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun session(session: JsonField<List<String>>) = apply {
                        this.session = session.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [Builder.session].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSession(session: String) = apply {
                        this.session =
                            (this.session ?: JsonField.of(mutableListOf())).also {
                                checkKnown("session", it).add(session)
                            }
                    }

                    fun traceFilter(traceFilter: String?) =
                        traceFilter(JsonField.ofNullable(traceFilter))

                    /** Alias for calling [Builder.traceFilter] with `traceFilter.orElse(null)`. */
                    fun traceFilter(traceFilter: Optional<String>) =
                        traceFilter(traceFilter.getOrNull())

                    /**
                     * Sets [Builder.traceFilter] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.traceFilter] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun traceFilter(traceFilter: JsonField<String>) = apply {
                        this.traceFilter = traceFilter
                    }

                    fun treeFilter(treeFilter: String?) =
                        treeFilter(JsonField.ofNullable(treeFilter))

                    /** Alias for calling [Builder.treeFilter] with `treeFilter.orElse(null)`. */
                    fun treeFilter(treeFilter: Optional<String>) =
                        treeFilter(treeFilter.getOrNull())

                    /**
                     * Sets [Builder.treeFilter] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.treeFilter] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun treeFilter(treeFilter: JsonField<String>) = apply {
                        this.treeFilter = treeFilter
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [CommonFilters].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CommonFilters =
                        CommonFilters(
                            filter,
                            (session ?: JsonMissing.of()).map { it.toImmutable() },
                            traceFilter,
                            treeFilter,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CommonFilters = apply {
                    if (validated) {
                        return@apply
                    }

                    filter()
                    session()
                    traceFilter()
                    treeFilter()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangChainInvalidDataException) {
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
                    (if (filter.asKnown().isPresent) 1 else 0) +
                        (session.asKnown().getOrNull()?.size ?: 0) +
                        (if (traceFilter.asKnown().isPresent) 1 else 0) +
                        (if (treeFilter.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CommonFilters &&
                        filter == other.filter &&
                        session == other.session &&
                        traceFilter == other.traceFilter &&
                        treeFilter == other.treeFilter &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(filter, session, traceFilter, treeFilter, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CommonFilters{filter=$filter, session=$session, traceFilter=$traceFilter, treeFilter=$treeFilter, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Chart &&
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
                "Chart{id=$id, chartType=$chartType, data=$data, index=$index, series=$series, title=$title, commonFilters=$commonFilters, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SubSection &&
                id == other.id &&
                charts == other.charts &&
                index == other.index &&
                title == other.title &&
                description == other.description &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, charts, index, title, description, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SubSection{id=$id, charts=$charts, index=$index, title=$title, description=$description, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChartsSection &&
            id == other.id &&
            charts == other.charts &&
            title == other.title &&
            description == other.description &&
            index == other.index &&
            sessionId == other.sessionId &&
            subSections == other.subSections &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            charts,
            title,
            description,
            index,
            sessionId,
            subSections,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomChartsSection{id=$id, charts=$charts, title=$title, description=$description, index=$index, sessionId=$sessionId, subSections=$subSections, additionalProperties=$additionalProperties}"
}
