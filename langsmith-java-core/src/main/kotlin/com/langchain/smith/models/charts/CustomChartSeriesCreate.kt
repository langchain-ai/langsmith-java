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
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.sessions.RunStatsGroupBy
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomChartSeriesCreate
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
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metric(): CustomChartMetric = metric.getRequired("metric")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackKey(): Optional<String> = feedbackKey.getOptional("feedback_key")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filters(): Optional<CustomChartSeriesFilters> = filters.getOptional("filters")

    /**
     * Group by param for run stats.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupBy(): Optional<RunStatsGroupBy> = groupBy.getOptional("group_by")

    /**
     * LGP Metrics you can chart.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectMetric(): Optional<HostProjectChartMetric> =
        projectMetric.getOptional("project_metric")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
    @JsonProperty("group_by") @ExcludeMissing fun _groupBy(): JsonField<RunStatsGroupBy> = groupBy

    /**
     * Returns the raw JSON value of [projectMetric].
     *
     * Unlike [projectMetric], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [CustomChartSeriesCreate].
         *
         * The following fields are required:
         * ```java
         * .metric()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChartSeriesCreate]. */
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
        internal fun from(customChartSeriesCreate: CustomChartSeriesCreate) = apply {
            metric = customChartSeriesCreate.metric
            name = customChartSeriesCreate.name
            feedbackKey = customChartSeriesCreate.feedbackKey
            filters = customChartSeriesCreate.filters
            groupBy = customChartSeriesCreate.groupBy
            projectMetric = customChartSeriesCreate.projectMetric
            workspaceId = customChartSeriesCreate.workspaceId
            additionalProperties = customChartSeriesCreate.additionalProperties.toMutableMap()
        }

        /**
         * Metrics you can chart. Feedback metrics are not available for organization-scoped charts.
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
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun feedbackKey(feedbackKey: String?) = feedbackKey(JsonField.ofNullable(feedbackKey))

        /** Alias for calling [Builder.feedbackKey] with `feedbackKey.orElse(null)`. */
        fun feedbackKey(feedbackKey: Optional<String>) = feedbackKey(feedbackKey.getOrNull())

        /**
         * Sets [Builder.feedbackKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun feedbackKey(feedbackKey: JsonField<String>) = apply { this.feedbackKey = feedbackKey }

        fun filters(filters: CustomChartSeriesFilters?) = filters(JsonField.ofNullable(filters))

        /** Alias for calling [Builder.filters] with `filters.orElse(null)`. */
        fun filters(filters: Optional<CustomChartSeriesFilters>) = filters(filters.getOrNull())

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed [CustomChartSeriesFilters]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun filters(filters: JsonField<CustomChartSeriesFilters>) = apply { this.filters = filters }

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
         * [HostProjectChartMetric] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
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
         * You should usually call [Builder.workspaceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workspaceId(workspaceId: JsonField<String>) = apply { this.workspaceId = workspaceId }

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
         * Returns an immutable instance of [CustomChartSeriesCreate].
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
        fun build(): CustomChartSeriesCreate =
            CustomChartSeriesCreate(
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

    fun validate(): CustomChartSeriesCreate = apply {
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

        return other is CustomChartSeriesCreate &&
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
        "CustomChartSeriesCreate{metric=$metric, name=$name, feedbackKey=$feedbackKey, filters=$filters, groupBy=$groupBy, projectMetric=$projectMetric, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
}
