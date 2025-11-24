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
    private val metadata: JsonValue,
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
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("shape") @ExcludeMissing shape: JsonField<Shape> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, clusters, name, status, endTime, error, metadata, shape, startTime, mutableMapOf())

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

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

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
        private var metadata: JsonValue = JsonMissing.of()
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

        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

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
        private val stats: JsonValue,
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
            @JsonProperty("stats") @ExcludeMissing stats: JsonValue = JsonMissing.of(),
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

        @JsonProperty("stats") @ExcludeMissing fun _stats(): JsonValue = stats

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
            private var stats: JsonValue? = null
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

            fun stats(stats: JsonValue) = apply { this.stats = stats }

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
                (if (parentId.asKnown().isPresent) 1 else 0) +
                (if (parentName.asKnown().isPresent) 1 else 0)

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
            shape,
            startTime,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InsightRetrieveJobResponse{id=$id, clusters=$clusters, name=$name, status=$status, endTime=$endTime, error=$error, metadata=$metadata, shape=$shape, startTime=$startTime, additionalProperties=$additionalProperties}"
}
