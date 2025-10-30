// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sessions.insights

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response to get all cluster jobs for a session. */
class InsightListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clusteringJobs: JsonField<List<ClusteringJob>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clustering_jobs")
        @ExcludeMissing
        clusteringJobs: JsonField<List<ClusteringJob>> = JsonMissing.of()
    ) : this(clusteringJobs, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clusteringJobs(): List<ClusteringJob> = clusteringJobs.getRequired("clustering_jobs")

    /**
     * Returns the raw JSON value of [clusteringJobs].
     *
     * Unlike [clusteringJobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clustering_jobs")
    @ExcludeMissing
    fun _clusteringJobs(): JsonField<List<ClusteringJob>> = clusteringJobs

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
         * Returns a mutable builder for constructing an instance of [InsightListResponse].
         *
         * The following fields are required:
         * ```java
         * .clusteringJobs()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InsightListResponse]. */
    class Builder internal constructor() {

        private var clusteringJobs: JsonField<MutableList<ClusteringJob>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insightListResponse: InsightListResponse) = apply {
            clusteringJobs = insightListResponse.clusteringJobs.map { it.toMutableList() }
            additionalProperties = insightListResponse.additionalProperties.toMutableMap()
        }

        fun clusteringJobs(clusteringJobs: List<ClusteringJob>) =
            clusteringJobs(JsonField.of(clusteringJobs))

        /**
         * Sets [Builder.clusteringJobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clusteringJobs] with a well-typed `List<ClusteringJob>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun clusteringJobs(clusteringJobs: JsonField<List<ClusteringJob>>) = apply {
            this.clusteringJobs = clusteringJobs.map { it.toMutableList() }
        }

        /**
         * Adds a single [ClusteringJob] to [clusteringJobs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addClusteringJob(clusteringJob: ClusteringJob) = apply {
            clusteringJobs =
                (clusteringJobs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("clusteringJobs", it).add(clusteringJob)
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
         * Returns an immutable instance of [InsightListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clusteringJobs()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InsightListResponse =
            InsightListResponse(
                checkRequired("clusteringJobs", clusteringJobs).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InsightListResponse = apply {
        if (validated) {
            return@apply
        }

        clusteringJobs().forEach { it.validate() }
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
        (clusteringJobs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** Session cluster job */
    class ClusteringJob
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val status: JsonField<String>,
        private val endTime: JsonField<OffsetDateTime>,
        private val error: JsonField<String>,
        private val metadata: JsonValue,
        private val shape: JsonField<List<Long>>,
        private val startTime: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_time")
            @ExcludeMissing
            endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("shape") @ExcludeMissing shape: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(id, name, status, endTime, error, metadata, shape, startTime, mutableMapOf())

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): String = status.getRequired("status")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun shape(): Optional<List<Long>> = shape.getOptional("shape")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
        @JsonProperty("end_time")
        @ExcludeMissing
        fun _endTime(): JsonField<OffsetDateTime> = endTime

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
        @JsonProperty("shape") @ExcludeMissing fun _shape(): JsonField<List<Long>> = shape

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
             * Returns a mutable builder for constructing an instance of [ClusteringJob].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ClusteringJob]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var status: JsonField<String>? = null
            private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var error: JsonField<String> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var shape: JsonField<MutableList<Long>>? = null
            private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(clusteringJob: ClusteringJob) = apply {
                id = clusteringJob.id
                name = clusteringJob.name
                status = clusteringJob.status
                endTime = clusteringJob.endTime
                error = clusteringJob.error
                metadata = clusteringJob.metadata
                shape = clusteringJob.shape.map { it.toMutableList() }
                startTime = clusteringJob.startTime
                additionalProperties = clusteringJob.additionalProperties.toMutableMap()
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

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            fun shape(shape: List<Long>?) = shape(JsonField.ofNullable(shape))

            /** Alias for calling [Builder.shape] with `shape.orElse(null)`. */
            fun shape(shape: Optional<List<Long>>) = shape(shape.getOrNull())

            /**
             * Sets [Builder.shape] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shape] with a well-typed `List<Long>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shape(shape: JsonField<List<Long>>) = apply {
                this.shape = shape.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [Builder.shape].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addShape(shape: Long) = apply {
                this.shape =
                    (this.shape ?: JsonField.of(mutableListOf())).also {
                        checkKnown("shape", it).add(shape)
                    }
            }

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
            fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                this.startTime = startTime
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
             * Returns an immutable instance of [ClusteringJob].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .name()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ClusteringJob =
                ClusteringJob(
                    checkRequired("id", id),
                    checkRequired("name", name),
                    checkRequired("status", status),
                    endTime,
                    error,
                    metadata,
                    (shape ?: JsonMissing.of()).map { it.toImmutable() },
                    startTime,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ClusteringJob = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
            status()
            endTime()
            error()
            shape()
            startTime()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0) +
                (shape.asKnown().getOrNull()?.size ?: 0) +
                (if (startTime.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ClusteringJob &&
                id == other.id &&
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
            "ClusteringJob{id=$id, name=$name, status=$status, endTime=$endTime, error=$error, metadata=$metadata, shape=$shape, startTime=$startTime, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsightListResponse &&
            clusteringJobs == other.clusteringJobs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(clusteringJobs, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InsightListResponse{clusteringJobs=$clusteringJobs, additionalProperties=$additionalProperties}"
}
