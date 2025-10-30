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
import com.langsmith_api.api.models.api.v1.sessions.RunStatsGroupBy
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomChartCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chartType: JsonField<CustomChartType>,
    private val series: JsonField<List<Series>>,
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
        @JsonProperty("series") @ExcludeMissing series: JsonField<List<Series>> = JsonMissing.of(),
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
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chartType(): CustomChartType = chartType.getRequired("chart_type")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun series(): List<Series> = series.getRequired("series")

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

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun index(): Optional<Long> = index.getOptional("index")

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
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
        private var series: JsonField<MutableList<Series>>? = null
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

        fun series(series: List<Series>) = series(JsonField.of(series))

        /**
         * Sets [Builder.series] to an arbitrary JSON value.
         *
         * You should usually call [Builder.series] with a well-typed `List<Series>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
        (chartType.asKnown().getOrNull()?.validity() ?: 0) +
            (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (commonFilters.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (index.asKnown().isPresent) 1 else 0) +
            (if (sectionId.asKnown().isPresent) 1 else 0)

    class Series
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val metric: JsonField<CustomChartMetric>,
        private val name: JsonField<String>,
        private val feedbackKey: JsonField<String>,
        private val filters: JsonField<CustomChartSeriesFilters>,
        private val groupBy: JsonField<RunStatsGroupBy>,
        private val projectMetric: JsonField<HostProjectChartMetric>,
        private val workspaceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("metric")
            @ExcludeMissing
            metric: JsonField<CustomChartMetric> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("feedback_key")
            @ExcludeMissing
            feedbackKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<CustomChartSeriesFilters> = JsonMissing.of(),
            @JsonProperty("group_by")
            @ExcludeMissing
            groupBy: JsonField<RunStatsGroupBy> = JsonMissing.of(),
            @JsonProperty("project_metric")
            @ExcludeMissing
            projectMetric: JsonField<HostProjectChartMetric> = JsonMissing.of(),
            @JsonProperty("workspace_id")
            @ExcludeMissing
            workspaceId: JsonField<String> = JsonMissing.of(),
        ) : this(
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
         * Metrics you can chart. Feedback metrics are not available for organization-scoped charts.
         *
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metric(): CustomChartMetric = metric.getRequired("metric")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun feedbackKey(): Optional<String> = feedbackKey.getOptional("feedback_key")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun filters(): Optional<CustomChartSeriesFilters> = filters.getOptional("filters")

        /**
         * Group by param for run stats.
         *
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun groupBy(): Optional<RunStatsGroupBy> = groupBy.getOptional("group_by")

        /**
         * LGP Metrics you can chart.
         *
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun projectMetric(): Optional<HostProjectChartMetric> =
            projectMetric.getOptional("project_metric")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun workspaceId(): Optional<String> = workspaceId.getOptional("workspace_id")

        /**
         * Returns the raw JSON value of [metric].
         *
         * Unlike [metric], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<CustomChartMetric> = metric

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [feedbackKey].
         *
         * Unlike [feedbackKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("feedback_key")
        @ExcludeMissing
        fun _feedbackKey(): JsonField<String> = feedbackKey

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters")
        @ExcludeMissing
        fun _filters(): JsonField<CustomChartSeriesFilters> = filters

        /**
         * Returns the raw JSON value of [groupBy].
         *
         * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_by")
        @ExcludeMissing
        fun _groupBy(): JsonField<RunStatsGroupBy> = groupBy

        /**
         * Returns the raw JSON value of [projectMetric].
         *
         * Unlike [projectMetric], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("project_metric")
        @ExcludeMissing
        fun _projectMetric(): JsonField<HostProjectChartMetric> = projectMetric

        /**
         * Returns the raw JSON value of [workspaceId].
         *
         * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
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
             * .metric()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Series]. */
        class Builder internal constructor() {

            private var metric: JsonField<CustomChartMetric>? = null
            private var name: JsonField<String>? = null
            private var feedbackKey: JsonField<String> = JsonMissing.of()
            private var filters: JsonField<CustomChartSeriesFilters> = JsonMissing.of()
            private var groupBy: JsonField<RunStatsGroupBy> = JsonMissing.of()
            private var projectMetric: JsonField<HostProjectChartMetric> = JsonMissing.of()
            private var workspaceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(series: Series) = apply {
                metric = series.metric
                name = series.name
                feedbackKey = series.feedbackKey
                filters = series.filters
                groupBy = series.groupBy
                projectMetric = series.projectMetric
                workspaceId = series.workspaceId
                additionalProperties = series.additionalProperties.toMutableMap()
            }

            /**
             * Metrics you can chart. Feedback metrics are not available for organization-scoped
             * charts.
             */
            fun metric(metric: CustomChartMetric) = metric(JsonField.of(metric))

            /**
             * Sets [Builder.metric] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metric] with a well-typed [CustomChartMetric] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metric(metric: JsonField<CustomChartMetric>) = apply { this.metric = metric }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun feedbackKey(feedbackKey: String?) = feedbackKey(JsonField.ofNullable(feedbackKey))

            /** Alias for calling [Builder.feedbackKey] with `feedbackKey.orElse(null)`. */
            fun feedbackKey(feedbackKey: Optional<String>) = feedbackKey(feedbackKey.getOrNull())

            /**
             * Sets [Builder.feedbackKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.feedbackKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun feedbackKey(feedbackKey: JsonField<String>) = apply {
                this.feedbackKey = feedbackKey
            }

            fun filters(filters: CustomChartSeriesFilters?) = filters(JsonField.ofNullable(filters))

            /** Alias for calling [Builder.filters] with `filters.orElse(null)`. */
            fun filters(filters: Optional<CustomChartSeriesFilters>) = filters(filters.getOrNull())

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed
             * [CustomChartSeriesFilters] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun filters(filters: JsonField<CustomChartSeriesFilters>) = apply {
                this.filters = filters
            }

            /** Group by param for run stats. */
            fun groupBy(groupBy: RunStatsGroupBy?) = groupBy(JsonField.ofNullable(groupBy))

            /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
            fun groupBy(groupBy: Optional<RunStatsGroupBy>) = groupBy(groupBy.getOrNull())

            /**
             * Sets [Builder.groupBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupBy] with a well-typed [RunStatsGroupBy] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupBy(groupBy: JsonField<RunStatsGroupBy>) = apply { this.groupBy = groupBy }

            /** LGP Metrics you can chart. */
            fun projectMetric(projectMetric: HostProjectChartMetric?) =
                projectMetric(JsonField.ofNullable(projectMetric))

            /** Alias for calling [Builder.projectMetric] with `projectMetric.orElse(null)`. */
            fun projectMetric(projectMetric: Optional<HostProjectChartMetric>) =
                projectMetric(projectMetric.getOrNull())

            /**
             * Sets [Builder.projectMetric] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectMetric] with a well-typed
             * [HostProjectChartMetric] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun projectMetric(projectMetric: JsonField<HostProjectChartMetric>) = apply {
                this.projectMetric = projectMetric
            }

            fun workspaceId(workspaceId: String?) = workspaceId(JsonField.ofNullable(workspaceId))

            /** Alias for calling [Builder.workspaceId] with `workspaceId.orElse(null)`. */
            fun workspaceId(workspaceId: Optional<String>) = workspaceId(workspaceId.getOrNull())

            /**
             * Sets [Builder.workspaceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workspaceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
             * .metric()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Series =
                Series(
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
            (metric.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (feedbackKey.asKnown().isPresent) 1 else 0) +
                (filters.asKnown().getOrNull()?.validity() ?: 0) +
                (groupBy.asKnown().getOrNull()?.validity() ?: 0) +
                (projectMetric.asKnown().getOrNull()?.validity() ?: 0) +
                (if (workspaceId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Series &&
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
            "Series{metric=$metric, name=$name, feedbackKey=$feedbackKey, filters=$filters, groupBy=$groupBy, projectMetric=$projectMetric, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
    }

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
