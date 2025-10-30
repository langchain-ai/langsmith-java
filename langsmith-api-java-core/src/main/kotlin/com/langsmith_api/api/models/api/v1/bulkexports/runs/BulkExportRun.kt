// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.bulkexports.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.Enum
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

class BulkExportRun
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val bulkExportId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val finishedAt: JsonField<OffsetDateTime>,
    private val metadata: JsonField<Metadata>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val errors: JsonValue,
    private val retryNumber: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bulk_export_id")
        @ExcludeMissing
        bulkExportId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("finished_at")
        @ExcludeMissing
        finishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("errors") @ExcludeMissing errors: JsonValue = JsonMissing.of(),
        @JsonProperty("retry_number")
        @ExcludeMissing
        retryNumber: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        bulkExportId,
        createdAt,
        finishedAt,
        metadata,
        status,
        updatedAt,
        errors,
        retryNumber,
        mutableMapOf(),
    )

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bulkExportId(): String = bulkExportId.getRequired("bulk_export_id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun finishedAt(): Optional<OffsetDateTime> = finishedAt.getOptional("finished_at")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonValue = errors

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun retryNumber(): Optional<Long> = retryNumber.getOptional("retry_number")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [bulkExportId].
     *
     * Unlike [bulkExportId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bulk_export_id")
    @ExcludeMissing
    fun _bulkExportId(): JsonField<String> = bulkExportId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [finishedAt].
     *
     * Unlike [finishedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("finished_at")
    @ExcludeMissing
    fun _finishedAt(): JsonField<OffsetDateTime> = finishedAt

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [retryNumber].
     *
     * Unlike [retryNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retry_number") @ExcludeMissing fun _retryNumber(): JsonField<Long> = retryNumber

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
         * Returns a mutable builder for constructing an instance of [BulkExportRun].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .bulkExportId()
         * .createdAt()
         * .finishedAt()
         * .metadata()
         * .status()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BulkExportRun]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var bulkExportId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var finishedAt: JsonField<OffsetDateTime>? = null
        private var metadata: JsonField<Metadata>? = null
        private var status: JsonField<Status>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var errors: JsonValue = JsonMissing.of()
        private var retryNumber: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bulkExportRun: BulkExportRun) = apply {
            id = bulkExportRun.id
            bulkExportId = bulkExportRun.bulkExportId
            createdAt = bulkExportRun.createdAt
            finishedAt = bulkExportRun.finishedAt
            metadata = bulkExportRun.metadata
            status = bulkExportRun.status
            updatedAt = bulkExportRun.updatedAt
            errors = bulkExportRun.errors
            retryNumber = bulkExportRun.retryNumber
            additionalProperties = bulkExportRun.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun bulkExportId(bulkExportId: String) = bulkExportId(JsonField.of(bulkExportId))

        /**
         * Sets [Builder.bulkExportId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bulkExportId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bulkExportId(bulkExportId: JsonField<String>) = apply {
            this.bulkExportId = bulkExportId
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun finishedAt(finishedAt: OffsetDateTime?) = finishedAt(JsonField.ofNullable(finishedAt))

        /** Alias for calling [Builder.finishedAt] with `finishedAt.orElse(null)`. */
        fun finishedAt(finishedAt: Optional<OffsetDateTime>) = finishedAt(finishedAt.getOrNull())

        /**
         * Sets [Builder.finishedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.finishedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun finishedAt(finishedAt: JsonField<OffsetDateTime>) = apply {
            this.finishedAt = finishedAt
        }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun errors(errors: JsonValue) = apply { this.errors = errors }

        fun retryNumber(retryNumber: Long) = retryNumber(JsonField.of(retryNumber))

        /**
         * Sets [Builder.retryNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retryNumber] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun retryNumber(retryNumber: JsonField<Long>) = apply { this.retryNumber = retryNumber }

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
         * Returns an immutable instance of [BulkExportRun].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .bulkExportId()
         * .createdAt()
         * .finishedAt()
         * .metadata()
         * .status()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BulkExportRun =
            BulkExportRun(
                checkRequired("id", id),
                checkRequired("bulkExportId", bulkExportId),
                checkRequired("createdAt", createdAt),
                checkRequired("finishedAt", finishedAt),
                checkRequired("metadata", metadata),
                checkRequired("status", status),
                checkRequired("updatedAt", updatedAt),
                errors,
                retryNumber,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BulkExportRun = apply {
        if (validated) {
            return@apply
        }

        id()
        bulkExportId()
        createdAt()
        finishedAt()
        metadata().validate()
        status().validate()
        updatedAt()
        retryNumber()
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
            (if (bulkExportId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (finishedAt.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (retryNumber.asKnown().isPresent) 1 else 0)

    class Metadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endTime: JsonField<OffsetDateTime>,
        private val prefix: JsonField<String>,
        private val startTime: JsonField<OffsetDateTime>,
        private val result: JsonField<Result>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_time")
            @ExcludeMissing
            endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("prefix") @ExcludeMissing prefix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
        ) : this(endTime, prefix, startTime, result, mutableMapOf())

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endTime(): OffsetDateTime = endTime.getRequired("end_time")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun prefix(): String = prefix.getRequired("prefix")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startTime(): OffsetDateTime = startTime.getRequired("start_time")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun result(): Optional<Result> = result.getOptional("result")

        /**
         * Returns the raw JSON value of [endTime].
         *
         * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_time")
        @ExcludeMissing
        fun _endTime(): JsonField<OffsetDateTime> = endTime

        /**
         * Returns the raw JSON value of [prefix].
         *
         * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time")
        @ExcludeMissing
        fun _startTime(): JsonField<OffsetDateTime> = startTime

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

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
             * Returns a mutable builder for constructing an instance of [Metadata].
             *
             * The following fields are required:
             * ```java
             * .endTime()
             * .prefix()
             * .startTime()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var endTime: JsonField<OffsetDateTime>? = null
            private var prefix: JsonField<String>? = null
            private var startTime: JsonField<OffsetDateTime>? = null
            private var result: JsonField<Result> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                endTime = metadata.endTime
                prefix = metadata.prefix
                startTime = metadata.startTime
                result = metadata.result
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

            /**
             * Sets [Builder.endTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

            fun prefix(prefix: String) = prefix(JsonField.of(prefix))

            /**
             * Sets [Builder.prefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prefix] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

            fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

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

            fun result(result: Result?) = result(JsonField.ofNullable(result))

            /** Alias for calling [Builder.result] with `result.orElse(null)`. */
            fun result(result: Optional<Result>) = result(result.getOrNull())

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [Result] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun result(result: JsonField<Result>) = apply { this.result = result }

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
             *
             * The following fields are required:
             * ```java
             * .endTime()
             * .prefix()
             * .startTime()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Metadata =
                Metadata(
                    checkRequired("endTime", endTime),
                    checkRequired("prefix", prefix),
                    checkRequired("startTime", startTime),
                    result,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            endTime()
            prefix()
            startTime()
            result().ifPresent { it.validate() }
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
            (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (prefix.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (result.asKnown().getOrNull()?.validity() ?: 0)

        class Result
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val exportPath: JsonField<String>,
            private val exportedFiles: JsonField<List<String>>,
            private val latestCursor: JsonField<String>,
            private val rowsWritten: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("export_path")
                @ExcludeMissing
                exportPath: JsonField<String> = JsonMissing.of(),
                @JsonProperty("exported_files")
                @ExcludeMissing
                exportedFiles: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("latest_cursor")
                @ExcludeMissing
                latestCursor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("rows_written")
                @ExcludeMissing
                rowsWritten: JsonField<Long> = JsonMissing.of(),
            ) : this(exportPath, exportedFiles, latestCursor, rowsWritten, mutableMapOf())

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun exportPath(): String = exportPath.getRequired("export_path")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun exportedFiles(): List<String> = exportedFiles.getRequired("exported_files")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun latestCursor(): Optional<String> = latestCursor.getOptional("latest_cursor")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun rowsWritten(): Long = rowsWritten.getRequired("rows_written")

            /**
             * Returns the raw JSON value of [exportPath].
             *
             * Unlike [exportPath], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("export_path")
            @ExcludeMissing
            fun _exportPath(): JsonField<String> = exportPath

            /**
             * Returns the raw JSON value of [exportedFiles].
             *
             * Unlike [exportedFiles], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("exported_files")
            @ExcludeMissing
            fun _exportedFiles(): JsonField<List<String>> = exportedFiles

            /**
             * Returns the raw JSON value of [latestCursor].
             *
             * Unlike [latestCursor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("latest_cursor")
            @ExcludeMissing
            fun _latestCursor(): JsonField<String> = latestCursor

            /**
             * Returns the raw JSON value of [rowsWritten].
             *
             * Unlike [rowsWritten], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rows_written")
            @ExcludeMissing
            fun _rowsWritten(): JsonField<Long> = rowsWritten

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
                 * Returns a mutable builder for constructing an instance of [Result].
                 *
                 * The following fields are required:
                 * ```java
                 * .exportPath()
                 * .exportedFiles()
                 * .latestCursor()
                 * .rowsWritten()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Result]. */
            class Builder internal constructor() {

                private var exportPath: JsonField<String>? = null
                private var exportedFiles: JsonField<MutableList<String>>? = null
                private var latestCursor: JsonField<String>? = null
                private var rowsWritten: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(result: Result) = apply {
                    exportPath = result.exportPath
                    exportedFiles = result.exportedFiles.map { it.toMutableList() }
                    latestCursor = result.latestCursor
                    rowsWritten = result.rowsWritten
                    additionalProperties = result.additionalProperties.toMutableMap()
                }

                fun exportPath(exportPath: String) = exportPath(JsonField.of(exportPath))

                /**
                 * Sets [Builder.exportPath] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.exportPath] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun exportPath(exportPath: JsonField<String>) = apply {
                    this.exportPath = exportPath
                }

                fun exportedFiles(exportedFiles: List<String>) =
                    exportedFiles(JsonField.of(exportedFiles))

                /**
                 * Sets [Builder.exportedFiles] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.exportedFiles] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun exportedFiles(exportedFiles: JsonField<List<String>>) = apply {
                    this.exportedFiles = exportedFiles.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [exportedFiles].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addExportedFile(exportedFile: String) = apply {
                    exportedFiles =
                        (exportedFiles ?: JsonField.of(mutableListOf())).also {
                            checkKnown("exportedFiles", it).add(exportedFile)
                        }
                }

                fun latestCursor(latestCursor: String?) =
                    latestCursor(JsonField.ofNullable(latestCursor))

                /** Alias for calling [Builder.latestCursor] with `latestCursor.orElse(null)`. */
                fun latestCursor(latestCursor: Optional<String>) =
                    latestCursor(latestCursor.getOrNull())

                /**
                 * Sets [Builder.latestCursor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latestCursor] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun latestCursor(latestCursor: JsonField<String>) = apply {
                    this.latestCursor = latestCursor
                }

                fun rowsWritten(rowsWritten: Long) = rowsWritten(JsonField.of(rowsWritten))

                /**
                 * Sets [Builder.rowsWritten] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rowsWritten] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rowsWritten(rowsWritten: JsonField<Long>) = apply {
                    this.rowsWritten = rowsWritten
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
                 * Returns an immutable instance of [Result].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .exportPath()
                 * .exportedFiles()
                 * .latestCursor()
                 * .rowsWritten()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Result =
                    Result(
                        checkRequired("exportPath", exportPath),
                        checkRequired("exportedFiles", exportedFiles).map { it.toImmutable() },
                        checkRequired("latestCursor", latestCursor),
                        checkRequired("rowsWritten", rowsWritten),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Result = apply {
                if (validated) {
                    return@apply
                }

                exportPath()
                exportedFiles()
                latestCursor()
                rowsWritten()
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
                (if (exportPath.asKnown().isPresent) 1 else 0) +
                    (exportedFiles.asKnown().getOrNull()?.size ?: 0) +
                    (if (latestCursor.asKnown().isPresent) 1 else 0) +
                    (if (rowsWritten.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Result &&
                    exportPath == other.exportPath &&
                    exportedFiles == other.exportedFiles &&
                    latestCursor == other.latestCursor &&
                    rowsWritten == other.rowsWritten &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    exportPath,
                    exportedFiles,
                    latestCursor,
                    rowsWritten,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Result{exportPath=$exportPath, exportedFiles=$exportedFiles, latestCursor=$latestCursor, rowsWritten=$rowsWritten, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata &&
                endTime == other.endTime &&
                prefix == other.prefix &&
                startTime == other.startTime &&
                result == other.result &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(endTime, prefix, startTime, result, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{endTime=$endTime, prefix=$prefix, startTime=$startTime, result=$result, additionalProperties=$additionalProperties}"
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CANCELLED = of("Cancelled")

            @JvmField val COMPLETED = of("Completed")

            @JvmField val CREATED = of("Created")

            @JvmField val FAILED = of("Failed")

            @JvmField val TIMED_OUT = of("TimedOut")

            @JvmField val RUNNING = of("Running")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CANCELLED,
            COMPLETED,
            CREATED,
            FAILED,
            TIMED_OUT,
            RUNNING,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CANCELLED,
            COMPLETED,
            CREATED,
            FAILED,
            TIMED_OUT,
            RUNNING,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CANCELLED -> Value.CANCELLED
                COMPLETED -> Value.COMPLETED
                CREATED -> Value.CREATED
                FAILED -> Value.FAILED
                TIMED_OUT -> Value.TIMED_OUT
                RUNNING -> Value.RUNNING
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CANCELLED -> Known.CANCELLED
                COMPLETED -> Known.COMPLETED
                CREATED -> Known.CREATED
                FAILED -> Known.FAILED
                TIMED_OUT -> Known.TIMED_OUT
                RUNNING -> Known.RUNNING
                else -> throw LangsmithApiInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithApiInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Status = apply {
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
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BulkExportRun &&
            id == other.id &&
            bulkExportId == other.bulkExportId &&
            createdAt == other.createdAt &&
            finishedAt == other.finishedAt &&
            metadata == other.metadata &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            errors == other.errors &&
            retryNumber == other.retryNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            bulkExportId,
            createdAt,
            finishedAt,
            metadata,
            status,
            updatedAt,
            errors,
            retryNumber,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkExportRun{id=$id, bulkExportId=$bulkExportId, createdAt=$createdAt, finishedAt=$finishedAt, metadata=$metadata, status=$status, updatedAt=$updatedAt, errors=$errors, retryNumber=$retryNumber, additionalProperties=$additionalProperties}"
}
