// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomChartSeries
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val metric: JsonField<CustomChartMetric>,
    private val name: JsonField<String>,
    private val feedbackKey: JsonField<String>,
    private val filters: JsonField<CustomChartSeriesFilters>,
    private val groupBy: JsonField<GroupBy>,
    private val projectMetric: JsonField<HostProjectChartMetric>,
    private val workspaceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("group_by") @ExcludeMissing groupBy: JsonField<GroupBy> = JsonMissing.of(),
        @JsonProperty("project_metric")
        @ExcludeMissing
        projectMetric: JsonField<HostProjectChartMetric> = JsonMissing.of(),
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
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Metrics you can chart. Feedback metrics are not available for organization-scoped charts.
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metric(): CustomChartMetric = metric.getRequired("metric")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackKey(): Optional<String> = feedbackKey.getOptional("feedback_key")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filters(): Optional<CustomChartSeriesFilters> = filters.getOptional("filters")

    /**
     * Include additional information about where the group_by param was set.
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupBy(): Optional<GroupBy> = groupBy.getOptional("group_by")

    /**
     * LGP Metrics you can chart.
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectMetric(): Optional<HostProjectChartMetric> =
        projectMetric.getOptional("project_metric")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
    @JsonProperty("group_by") @ExcludeMissing fun _groupBy(): JsonField<GroupBy> = groupBy

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
         * Returns a mutable builder for constructing an instance of [CustomChartSeries].
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

    /** A builder for [CustomChartSeries]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var metric: JsonField<CustomChartMetric>? = null
        private var name: JsonField<String>? = null
        private var feedbackKey: JsonField<String> = JsonMissing.of()
        private var filters: JsonField<CustomChartSeriesFilters> = JsonMissing.of()
        private var groupBy: JsonField<GroupBy> = JsonMissing.of()
        private var projectMetric: JsonField<HostProjectChartMetric> = JsonMissing.of()
        private var workspaceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customChartSeries: CustomChartSeries) = apply {
            id = customChartSeries.id
            metric = customChartSeries.metric
            name = customChartSeries.name
            feedbackKey = customChartSeries.feedbackKey
            filters = customChartSeries.filters
            groupBy = customChartSeries.groupBy
            projectMetric = customChartSeries.projectMetric
            workspaceId = customChartSeries.workspaceId
            additionalProperties = customChartSeries.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        /** Include additional information about where the group_by param was set. */
        fun groupBy(groupBy: GroupBy?) = groupBy(JsonField.ofNullable(groupBy))

        /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
        fun groupBy(groupBy: Optional<GroupBy>) = groupBy(groupBy.getOrNull())

        /**
         * Sets [Builder.groupBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupBy] with a well-typed [GroupBy] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupBy(groupBy: JsonField<GroupBy>) = apply { this.groupBy = groupBy }

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
         * Returns an immutable instance of [CustomChartSeries].
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
        fun build(): CustomChartSeries =
            CustomChartSeries(
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

    fun validate(): CustomChartSeries = apply {
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (metric.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (feedbackKey.asKnown().isPresent) 1 else 0) +
            (filters.asKnown().getOrNull()?.validity() ?: 0) +
            (groupBy.asKnown().getOrNull()?.validity() ?: 0) +
            (projectMetric.asKnown().getOrNull()?.validity() ?: 0) +
            (if (workspaceId.asKnown().isPresent) 1 else 0)

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
            @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
            @JsonProperty("set_by") @ExcludeMissing setBy: JsonField<SetBy> = JsonMissing.of(),
        ) : this(attribute, maxGroups, path, setBy, mutableMapOf())

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun attribute(): Attribute = attribute.getRequired("attribute")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxGroups(): Optional<Long> = maxGroups.getOptional("max_groups")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun path(): Optional<String> = path.getOptional("path")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun setBy(): Optional<SetBy> = setBy.getOptional("set_by")

        /**
         * Returns the raw JSON value of [attribute].
         *
         * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attribute")
        @ExcludeMissing
        fun _attribute(): JsonField<Attribute> = attribute

        /**
         * Returns the raw JSON value of [maxGroups].
         *
         * Unlike [maxGroups], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_groups") @ExcludeMissing fun _maxGroups(): JsonField<Long> = maxGroups

        /**
         * Returns the raw JSON value of [path].
         *
         * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

        /**
         * Returns the raw JSON value of [setBy].
         *
         * Unlike [setBy], this method doesn't throw if the JSON field has an unexpected type.
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
             * You should usually call [Builder.attribute] with a well-typed [Attribute] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attribute(attribute: JsonField<Attribute>) = apply { this.attribute = attribute }

            fun maxGroups(maxGroups: Long) = maxGroups(JsonField.of(maxGroups))

            /**
             * Sets [Builder.maxGroups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxGroups] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxGroups(maxGroups: JsonField<Long>) = apply { this.maxGroups = maxGroups }

            fun path(path: String?) = path(JsonField.ofNullable(path))

            /** Alias for calling [Builder.path] with `path.orElse(null)`. */
            fun path(path: Optional<String>) = path(path.getOrNull())

            /**
             * Sets [Builder.path] to an arbitrary JSON value.
             *
             * You should usually call [Builder.path] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun path(path: JsonField<String>) = apply { this.path = path }

            fun setBy(setBy: SetBy?) = setBy(JsonField.ofNullable(setBy))

            /** Alias for calling [Builder.setBy] with `setBy.orElse(null)`. */
            fun setBy(setBy: Optional<SetBy>) = setBy(setBy.getOrNull())

            /**
             * Sets [Builder.setBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.setBy] with a well-typed [SetBy] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun setBy(setBy: JsonField<SetBy>) = apply { this.setBy = setBy }

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
            } catch (e: LangsmithInvalidDataException) {
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

        class Attribute @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * An enum containing [Attribute]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Attribute] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NAME,
                RUN_TYPE,
                TAG,
                METADATA,
                /**
                 * An enum member indicating that [Attribute] was instantiated with an unknown
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
                    NAME -> Value.NAME
                    RUN_TYPE -> Value.RUN_TYPE
                    TAG -> Value.TAG
                    METADATA -> Value.METADATA
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangsmithInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    NAME -> Known.NAME
                    RUN_TYPE -> Known.RUN_TYPE
                    TAG -> Known.TAG
                    METADATA -> Known.METADATA
                    else -> throw LangsmithInvalidDataException("Unknown Attribute: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangsmithInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangsmithInvalidDataException("Value is not a String")
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

                return other is Attribute && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class SetBy @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SECTION,
                SERIES,
                /**
                 * An enum member indicating that [SetBy] was instantiated with an unknown value.
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
                    SECTION -> Value.SECTION
                    SERIES -> Value.SERIES
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangsmithInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SECTION -> Known.SECTION
                    SERIES -> Known.SERIES
                    else -> throw LangsmithInvalidDataException("Unknown SetBy: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangsmithInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangsmithInvalidDataException("Value is not a String")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChartSeries &&
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
        "CustomChartSeries{id=$id, metric=$metric, name=$name, feedbackKey=$feedbackKey, filters=$filters, groupBy=$groupBy, projectMetric=$projectMetric, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
}
