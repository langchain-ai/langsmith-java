// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

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
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response to get a specific cluster job for a session. */
class InsightRetrieveJobResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val clusters: JsonField<List<Cluster>>,
    private val name: JsonField<String>,
    private val status: JsonField<String>,
    private val endTime: JsonField<OffsetDateTime>,
    private val error: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val report: JsonField<Report>,
    private val shape: JsonField<Shape>,
    private val startTime: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("clusters")
        @ExcludeMissing
        clusters: JsonField<List<Cluster>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("report") @ExcludeMissing report: JsonField<Report> = JsonMissing.of(),
        @JsonProperty("shape") @ExcludeMissing shape: JsonField<Shape> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        clusters,
        name,
        status,
        endTime,
        error,
        metadata,
        report,
        shape,
        startTime,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clusters(): List<Cluster> = clusters.getRequired("clusters")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * High level summary of an insights job that pulls out patterns and specific traces.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun report(): Optional<Report> = report.getOptional("report")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shape(): Optional<Shape> = shape.getOptional("shape")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [clusters].
     *
     * Unlike [clusters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clusters") @ExcludeMissing fun _clusters(): JsonField<List<Cluster>> = clusters

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [report].
     *
     * Unlike [report], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("report") @ExcludeMissing fun _report(): JsonField<Report> = report

    /**
     * Returns the raw JSON value of [shape].
     *
     * Unlike [shape], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shape") @ExcludeMissing fun _shape(): JsonField<Shape> = shape

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

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
         * Returns a mutable builder for constructing an instance of [InsightRetrieveJobResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .clusters()
         * .name()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InsightRetrieveJobResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var clusters: JsonField<MutableList<Cluster>>? = null
        private var name: JsonField<String>? = null
        private var status: JsonField<String>? = null
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var error: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var report: JsonField<Report> = JsonMissing.of()
        private var shape: JsonField<Shape> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insightRetrieveJobResponse: InsightRetrieveJobResponse) = apply {
            id = insightRetrieveJobResponse.id
            clusters = insightRetrieveJobResponse.clusters.map { it.toMutableList() }
            name = insightRetrieveJobResponse.name
            status = insightRetrieveJobResponse.status
            endTime = insightRetrieveJobResponse.endTime
            error = insightRetrieveJobResponse.error
            metadata = insightRetrieveJobResponse.metadata
            report = insightRetrieveJobResponse.report
            shape = insightRetrieveJobResponse.shape
            startTime = insightRetrieveJobResponse.startTime
            additionalProperties = insightRetrieveJobResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun clusters(clusters: List<Cluster>) = clusters(JsonField.of(clusters))

        /**
         * Sets [Builder.clusters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clusters] with a well-typed `List<Cluster>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clusters(clusters: JsonField<List<Cluster>>) = apply {
            this.clusters = clusters.map { it.toMutableList() }
        }

        /**
         * Adds a single [Cluster] to [clusters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCluster(cluster: Cluster) = apply {
            clusters =
                (clusters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("clusters", it).add(cluster)
                }
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun endTime(endTime: OffsetDateTime?) = endTime(JsonField.ofNullable(endTime))

        /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
        fun endTime(endTime: Optional<OffsetDateTime>) = endTime(endTime.getOrNull())

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        fun error(error: String?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<String>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** High level summary of an insights job that pulls out patterns and specific traces. */
        fun report(report: Report?) = report(JsonField.ofNullable(report))

        /** Alias for calling [Builder.report] with `report.orElse(null)`. */
        fun report(report: Optional<Report>) = report(report.getOrNull())

        /**
         * Sets [Builder.report] to an arbitrary JSON value.
         *
         * You should usually call [Builder.report] with a well-typed [Report] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun report(report: JsonField<Report>) = apply { this.report = report }

        fun shape(shape: Shape?) = shape(JsonField.ofNullable(shape))

        /** Alias for calling [Builder.shape] with `shape.orElse(null)`. */
        fun shape(shape: Optional<Shape>) = shape(shape.getOrNull())

        /**
         * Sets [Builder.shape] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shape] with a well-typed [Shape] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun shape(shape: JsonField<Shape>) = apply { this.shape = shape }

        fun startTime(startTime: OffsetDateTime?) = startTime(JsonField.ofNullable(startTime))

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

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
         * Returns an immutable instance of [InsightRetrieveJobResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .clusters()
         * .name()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InsightRetrieveJobResponse =
            InsightRetrieveJobResponse(
                checkRequired("id", id),
                checkRequired("clusters", clusters).map { it.toImmutable() },
                checkRequired("name", name),
                checkRequired("status", status),
                endTime,
                error,
                metadata,
                report,
                shape,
                startTime,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InsightRetrieveJobResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        clusters().forEach { it.validate() }
        name()
        status()
        endTime()
        error()
        metadata().ifPresent { it.validate() }
        report().ifPresent { it.validate() }
        shape().ifPresent { it.validate() }
        startTime()
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
            (clusters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (report.asKnown().getOrNull()?.validity() ?: 0) +
            (shape.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startTime.asKnown().isPresent) 1 else 0)

    /** A single cluster of runs. */
    class Cluster
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val description: JsonField<String>,
        private val level: JsonField<Long>,
        private val name: JsonField<String>,
        private val numRuns: JsonField<Long>,
        private val stats: JsonField<Stats>,
        private val parentId: JsonField<String>,
        private val parentName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("level") @ExcludeMissing level: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("num_runs") @ExcludeMissing numRuns: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("stats") @ExcludeMissing stats: JsonField<Stats> = JsonMissing.of(),
            @JsonProperty("parent_id")
            @ExcludeMissing
            parentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parent_name")
            @ExcludeMissing
            parentName: JsonField<String> = JsonMissing.of(),
        ) : this(id, description, level, name, numRuns, stats, parentId, parentName, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun level(): Long = level.getRequired("level")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun numRuns(): Long = numRuns.getRequired("num_runs")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun stats(): Optional<Stats> = stats.getOptional("stats")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun parentId(): Optional<String> = parentId.getOptional("parent_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun parentName(): Optional<String> = parentName.getOptional("parent_name")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [level].
         *
         * Unlike [level], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<Long> = level

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [numRuns].
         *
         * Unlike [numRuns], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("num_runs") @ExcludeMissing fun _numRuns(): JsonField<Long> = numRuns

        /**
         * Returns the raw JSON value of [stats].
         *
         * Unlike [stats], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stats") @ExcludeMissing fun _stats(): JsonField<Stats> = stats

        /**
         * Returns the raw JSON value of [parentId].
         *
         * Unlike [parentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parent_id") @ExcludeMissing fun _parentId(): JsonField<String> = parentId

        /**
         * Returns the raw JSON value of [parentName].
         *
         * Unlike [parentName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parent_name")
        @ExcludeMissing
        fun _parentName(): JsonField<String> = parentName

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
             * Returns a mutable builder for constructing an instance of [Cluster].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .description()
             * .level()
             * .name()
             * .numRuns()
             * .stats()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cluster]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var level: JsonField<Long>? = null
            private var name: JsonField<String>? = null
            private var numRuns: JsonField<Long>? = null
            private var stats: JsonField<Stats>? = null
            private var parentId: JsonField<String> = JsonMissing.of()
            private var parentName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cluster: Cluster) = apply {
                id = cluster.id
                description = cluster.description
                level = cluster.level
                name = cluster.name
                numRuns = cluster.numRuns
                stats = cluster.stats
                parentId = cluster.parentId
                parentName = cluster.parentName
                additionalProperties = cluster.additionalProperties.toMutableMap()
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

            fun description(description: String) = description(JsonField.of(description))

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

            fun level(level: Long) = level(JsonField.of(level))

            /**
             * Sets [Builder.level] to an arbitrary JSON value.
             *
             * You should usually call [Builder.level] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun level(level: JsonField<Long>) = apply { this.level = level }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun numRuns(numRuns: Long) = numRuns(JsonField.of(numRuns))

            /**
             * Sets [Builder.numRuns] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numRuns] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numRuns(numRuns: JsonField<Long>) = apply { this.numRuns = numRuns }

            fun stats(stats: Stats?) = stats(JsonField.ofNullable(stats))

            /** Alias for calling [Builder.stats] with `stats.orElse(null)`. */
            fun stats(stats: Optional<Stats>) = stats(stats.getOrNull())

            /**
             * Sets [Builder.stats] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stats] with a well-typed [Stats] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun stats(stats: JsonField<Stats>) = apply { this.stats = stats }

            fun parentId(parentId: String?) = parentId(JsonField.ofNullable(parentId))

            /** Alias for calling [Builder.parentId] with `parentId.orElse(null)`. */
            fun parentId(parentId: Optional<String>) = parentId(parentId.getOrNull())

            /**
             * Sets [Builder.parentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parentId(parentId: JsonField<String>) = apply { this.parentId = parentId }

            fun parentName(parentName: String?) = parentName(JsonField.ofNullable(parentName))

            /** Alias for calling [Builder.parentName] with `parentName.orElse(null)`. */
            fun parentName(parentName: Optional<String>) = parentName(parentName.getOrNull())

            /**
             * Sets [Builder.parentName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parentName(parentName: JsonField<String>) = apply { this.parentName = parentName }

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
             * Returns an immutable instance of [Cluster].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .description()
             * .level()
             * .name()
             * .numRuns()
             * .stats()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Cluster =
                Cluster(
                    checkRequired("id", id),
                    checkRequired("description", description),
                    checkRequired("level", level),
                    checkRequired("name", name),
                    checkRequired("numRuns", numRuns),
                    checkRequired("stats", stats),
                    parentId,
                    parentName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Cluster = apply {
            if (validated) {
                return@apply
            }

            id()
            description()
            level()
            name()
            numRuns()
            stats().ifPresent { it.validate() }
            parentId()
            parentName()
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
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (level.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (numRuns.asKnown().isPresent) 1 else 0) +
                (stats.asKnown().getOrNull()?.validity() ?: 0) +
                (if (parentId.asKnown().isPresent) 1 else 0) +
                (if (parentName.asKnown().isPresent) 1 else 0)

        class Stats
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Stats]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Stats]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(stats: Stats) = apply {
                    additionalProperties = stats.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Stats].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Stats = Stats(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Stats = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Stats && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Stats{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cluster &&
                id == other.id &&
                description == other.description &&
                level == other.level &&
                name == other.name &&
                numRuns == other.numRuns &&
                stats == other.stats &&
                parentId == other.parentId &&
                parentName == other.parentName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                description,
                level,
                name,
                numRuns,
                stats,
                parentId,
                parentName,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cluster{id=$id, description=$description, level=$level, name=$name, numRuns=$numRuns, stats=$stats, parentId=$parentId, parentName=$parentName, additionalProperties=$additionalProperties}"
    }

    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** High level summary of an insights job that pulls out patterns and specific traces. */
    class Report
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val highlightedTraces: JsonField<List<HighlightedTrace>>,
        private val keyPoints: JsonField<List<String>>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("highlighted_traces")
            @ExcludeMissing
            highlightedTraces: JsonField<List<HighlightedTrace>> = JsonMissing.of(),
            @JsonProperty("key_points")
            @ExcludeMissing
            keyPoints: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(createdAt, highlightedTraces, keyPoints, title, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun highlightedTraces(): Optional<List<HighlightedTrace>> =
            highlightedTraces.getOptional("highlighted_traces")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun keyPoints(): Optional<List<String>> = keyPoints.getOptional("key_points")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [highlightedTraces].
         *
         * Unlike [highlightedTraces], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("highlighted_traces")
        @ExcludeMissing
        fun _highlightedTraces(): JsonField<List<HighlightedTrace>> = highlightedTraces

        /**
         * Returns the raw JSON value of [keyPoints].
         *
         * Unlike [keyPoints], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key_points")
        @ExcludeMissing
        fun _keyPoints(): JsonField<List<String>> = keyPoints

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

            /** Returns a mutable builder for constructing an instance of [Report]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Report]. */
        class Builder internal constructor() {

            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var highlightedTraces: JsonField<MutableList<HighlightedTrace>>? = null
            private var keyPoints: JsonField<MutableList<String>>? = null
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(report: Report) = apply {
                createdAt = report.createdAt
                highlightedTraces = report.highlightedTraces.map { it.toMutableList() }
                keyPoints = report.keyPoints.map { it.toMutableList() }
                title = report.title
                additionalProperties = report.additionalProperties.toMutableMap()
            }

            fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun highlightedTraces(highlightedTraces: List<HighlightedTrace>) =
                highlightedTraces(JsonField.of(highlightedTraces))

            /**
             * Sets [Builder.highlightedTraces] to an arbitrary JSON value.
             *
             * You should usually call [Builder.highlightedTraces] with a well-typed
             * `List<HighlightedTrace>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun highlightedTraces(highlightedTraces: JsonField<List<HighlightedTrace>>) = apply {
                this.highlightedTraces = highlightedTraces.map { it.toMutableList() }
            }

            /**
             * Adds a single [HighlightedTrace] to [highlightedTraces].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addHighlightedTrace(highlightedTrace: HighlightedTrace) = apply {
                highlightedTraces =
                    (highlightedTraces ?: JsonField.of(mutableListOf())).also {
                        checkKnown("highlightedTraces", it).add(highlightedTrace)
                    }
            }

            fun keyPoints(keyPoints: List<String>) = keyPoints(JsonField.of(keyPoints))

            /**
             * Sets [Builder.keyPoints] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keyPoints] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun keyPoints(keyPoints: JsonField<List<String>>) = apply {
                this.keyPoints = keyPoints.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [keyPoints].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addKeyPoint(keyPoint: String) = apply {
                keyPoints =
                    (keyPoints ?: JsonField.of(mutableListOf())).also {
                        checkKnown("keyPoints", it).add(keyPoint)
                    }
            }

            fun title(title: String?) = title(JsonField.ofNullable(title))

            /** Alias for calling [Builder.title] with `title.orElse(null)`. */
            fun title(title: Optional<String>) = title(title.getOrNull())

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * Returns an immutable instance of [Report].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Report =
                Report(
                    createdAt,
                    (highlightedTraces ?: JsonMissing.of()).map { it.toImmutable() },
                    (keyPoints ?: JsonMissing.of()).map { it.toImmutable() },
                    title,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Report = apply {
            if (validated) {
                return@apply
            }

            createdAt()
            highlightedTraces().ifPresent { it.forEach { it.validate() } }
            keyPoints()
            title()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
                (highlightedTraces.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (keyPoints.asKnown().getOrNull()?.size ?: 0) +
                (if (title.asKnown().isPresent) 1 else 0)

        /** A trace highlighted in an insights report summary. Up to 10 per insights job. */
        class HighlightedTrace
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val highlightReason: JsonField<String>,
            private val rank: JsonField<Long>,
            private val runId: JsonField<String>,
            private val clusterId: JsonField<String>,
            private val clusterName: JsonField<String>,
            private val summary: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("highlight_reason")
                @ExcludeMissing
                highlightReason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("rank") @ExcludeMissing rank: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cluster_id")
                @ExcludeMissing
                clusterId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cluster_name")
                @ExcludeMissing
                clusterName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("summary")
                @ExcludeMissing
                summary: JsonField<String> = JsonMissing.of(),
            ) : this(highlightReason, rank, runId, clusterId, clusterName, summary, mutableMapOf())

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun highlightReason(): String = highlightReason.getRequired("highlight_reason")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun rank(): Long = rank.getRequired("rank")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun runId(): String = runId.getRequired("run_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun clusterId(): Optional<String> = clusterId.getOptional("cluster_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun clusterName(): Optional<String> = clusterName.getOptional("cluster_name")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun summary(): Optional<String> = summary.getOptional("summary")

            /**
             * Returns the raw JSON value of [highlightReason].
             *
             * Unlike [highlightReason], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("highlight_reason")
            @ExcludeMissing
            fun _highlightReason(): JsonField<String> = highlightReason

            /**
             * Returns the raw JSON value of [rank].
             *
             * Unlike [rank], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rank") @ExcludeMissing fun _rank(): JsonField<Long> = rank

            /**
             * Returns the raw JSON value of [runId].
             *
             * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

            /**
             * Returns the raw JSON value of [clusterId].
             *
             * Unlike [clusterId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cluster_id")
            @ExcludeMissing
            fun _clusterId(): JsonField<String> = clusterId

            /**
             * Returns the raw JSON value of [clusterName].
             *
             * Unlike [clusterName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cluster_name")
            @ExcludeMissing
            fun _clusterName(): JsonField<String> = clusterName

            /**
             * Returns the raw JSON value of [summary].
             *
             * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<String> = summary

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
                 * Returns a mutable builder for constructing an instance of [HighlightedTrace].
                 *
                 * The following fields are required:
                 * ```java
                 * .highlightReason()
                 * .rank()
                 * .runId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [HighlightedTrace]. */
            class Builder internal constructor() {

                private var highlightReason: JsonField<String>? = null
                private var rank: JsonField<Long>? = null
                private var runId: JsonField<String>? = null
                private var clusterId: JsonField<String> = JsonMissing.of()
                private var clusterName: JsonField<String> = JsonMissing.of()
                private var summary: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(highlightedTrace: HighlightedTrace) = apply {
                    highlightReason = highlightedTrace.highlightReason
                    rank = highlightedTrace.rank
                    runId = highlightedTrace.runId
                    clusterId = highlightedTrace.clusterId
                    clusterName = highlightedTrace.clusterName
                    summary = highlightedTrace.summary
                    additionalProperties = highlightedTrace.additionalProperties.toMutableMap()
                }

                fun highlightReason(highlightReason: String) =
                    highlightReason(JsonField.of(highlightReason))

                /**
                 * Sets [Builder.highlightReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.highlightReason] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun highlightReason(highlightReason: JsonField<String>) = apply {
                    this.highlightReason = highlightReason
                }

                fun rank(rank: Long) = rank(JsonField.of(rank))

                /**
                 * Sets [Builder.rank] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rank] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun rank(rank: JsonField<Long>) = apply { this.rank = rank }

                fun runId(runId: String) = runId(JsonField.of(runId))

                /**
                 * Sets [Builder.runId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.runId] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun runId(runId: JsonField<String>) = apply { this.runId = runId }

                fun clusterId(clusterId: String?) = clusterId(JsonField.ofNullable(clusterId))

                /** Alias for calling [Builder.clusterId] with `clusterId.orElse(null)`. */
                fun clusterId(clusterId: Optional<String>) = clusterId(clusterId.getOrNull())

                /**
                 * Sets [Builder.clusterId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clusterId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clusterId(clusterId: JsonField<String>) = apply { this.clusterId = clusterId }

                fun clusterName(clusterName: String?) =
                    clusterName(JsonField.ofNullable(clusterName))

                /** Alias for calling [Builder.clusterName] with `clusterName.orElse(null)`. */
                fun clusterName(clusterName: Optional<String>) =
                    clusterName(clusterName.getOrNull())

                /**
                 * Sets [Builder.clusterName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clusterName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clusterName(clusterName: JsonField<String>) = apply {
                    this.clusterName = clusterName
                }

                fun summary(summary: String?) = summary(JsonField.ofNullable(summary))

                /** Alias for calling [Builder.summary] with `summary.orElse(null)`. */
                fun summary(summary: Optional<String>) = summary(summary.getOrNull())

                /**
                 * Sets [Builder.summary] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.summary] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun summary(summary: JsonField<String>) = apply { this.summary = summary }

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
                 * Returns an immutable instance of [HighlightedTrace].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .highlightReason()
                 * .rank()
                 * .runId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): HighlightedTrace =
                    HighlightedTrace(
                        checkRequired("highlightReason", highlightReason),
                        checkRequired("rank", rank),
                        checkRequired("runId", runId),
                        clusterId,
                        clusterName,
                        summary,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): HighlightedTrace = apply {
                if (validated) {
                    return@apply
                }

                highlightReason()
                rank()
                runId()
                clusterId()
                clusterName()
                summary()
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
                (if (highlightReason.asKnown().isPresent) 1 else 0) +
                    (if (rank.asKnown().isPresent) 1 else 0) +
                    (if (runId.asKnown().isPresent) 1 else 0) +
                    (if (clusterId.asKnown().isPresent) 1 else 0) +
                    (if (clusterName.asKnown().isPresent) 1 else 0) +
                    (if (summary.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is HighlightedTrace &&
                    highlightReason == other.highlightReason &&
                    rank == other.rank &&
                    runId == other.runId &&
                    clusterId == other.clusterId &&
                    clusterName == other.clusterName &&
                    summary == other.summary &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    highlightReason,
                    rank,
                    runId,
                    clusterId,
                    clusterName,
                    summary,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "HighlightedTrace{highlightReason=$highlightReason, rank=$rank, runId=$runId, clusterId=$clusterId, clusterName=$clusterName, summary=$summary, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Report &&
                createdAt == other.createdAt &&
                highlightedTraces == other.highlightedTraces &&
                keyPoints == other.keyPoints &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(createdAt, highlightedTraces, keyPoints, title, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Report{createdAt=$createdAt, highlightedTraces=$highlightedTraces, keyPoints=$keyPoints, title=$title, additionalProperties=$additionalProperties}"
    }

    class Shape
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Shape]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Shape]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(shape: Shape) = apply {
                additionalProperties = shape.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Shape].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Shape = Shape(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Shape = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Shape && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Shape{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsightRetrieveJobResponse &&
            id == other.id &&
            clusters == other.clusters &&
            name == other.name &&
            status == other.status &&
            endTime == other.endTime &&
            error == other.error &&
            metadata == other.metadata &&
            report == other.report &&
            shape == other.shape &&
            startTime == other.startTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            clusters,
            name,
            status,
            endTime,
            error,
            metadata,
            report,
            shape,
            startTime,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InsightRetrieveJobResponse{id=$id, clusters=$clusters, name=$name, status=$status, endTime=$endTime, error=$error, metadata=$metadata, report=$report, shape=$shape, startTime=$startTime, additionalProperties=$additionalProperties}"
}
