// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.bulkexports

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
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BulkExport
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val bulkExportDestinationId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val finishedAt: JsonField<OffsetDateTime>,
    private val sessionId: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val tenantId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val compression: JsonField<BulkExportCompression>,
    private val endTime: JsonField<OffsetDateTime>,
    private val exportFormatVersion: JsonField<ExportFormatVersion>,
    private val filter: JsonField<String>,
    private val format: JsonField<BulkExportFormat>,
    private val intervalHours: JsonField<Long>,
    private val sourceBulkExportId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bulk_export_destination_id")
        @ExcludeMissing
        bulkExportDestinationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("finished_at")
        @ExcludeMissing
        finishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("compression")
        @ExcludeMissing
        compression: JsonField<BulkExportCompression> = JsonMissing.of(),
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("export_format_version")
        @ExcludeMissing
        exportFormatVersion: JsonField<ExportFormatVersion> = JsonMissing.of(),
        @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("format")
        @ExcludeMissing
        format: JsonField<BulkExportFormat> = JsonMissing.of(),
        @JsonProperty("interval_hours")
        @ExcludeMissing
        intervalHours: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("source_bulk_export_id")
        @ExcludeMissing
        sourceBulkExportId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        bulkExportDestinationId,
        createdAt,
        finishedAt,
        sessionId,
        startTime,
        status,
        tenantId,
        updatedAt,
        compression,
        endTime,
        exportFormatVersion,
        filter,
        format,
        intervalHours,
        sourceBulkExportId,
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
    fun bulkExportDestinationId(): String =
        bulkExportDestinationId.getRequired("bulk_export_destination_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun finishedAt(): Optional<OffsetDateTime> = finishedAt.getOptional("finished_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("session_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = startTime.getRequired("start_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun compression(): Optional<BulkExportCompression> = compression.getOptional("compression")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

    /**
     * Enum for bulk export format versions.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exportFormatVersion(): Optional<ExportFormatVersion> =
        exportFormatVersion.getOptional("export_format_version")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<String> = filter.getOptional("filter")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun format(): Optional<BulkExportFormat> = format.getOptional("format")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun intervalHours(): Optional<Long> = intervalHours.getOptional("interval_hours")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceBulkExportId(): Optional<String> =
        sourceBulkExportId.getOptional("source_bulk_export_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [bulkExportDestinationId].
     *
     * Unlike [bulkExportDestinationId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("bulk_export_destination_id")
    @ExcludeMissing
    fun _bulkExportDestinationId(): JsonField<String> = bulkExportDestinationId

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
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [compression].
     *
     * Unlike [compression], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("compression")
    @ExcludeMissing
    fun _compression(): JsonField<BulkExportCompression> = compression

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [exportFormatVersion].
     *
     * Unlike [exportFormatVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("export_format_version")
    @ExcludeMissing
    fun _exportFormatVersion(): JsonField<ExportFormatVersion> = exportFormatVersion

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

    /**
     * Returns the raw JSON value of [format].
     *
     * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<BulkExportFormat> = format

    /**
     * Returns the raw JSON value of [intervalHours].
     *
     * Unlike [intervalHours], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interval_hours")
    @ExcludeMissing
    fun _intervalHours(): JsonField<Long> = intervalHours

    /**
     * Returns the raw JSON value of [sourceBulkExportId].
     *
     * Unlike [sourceBulkExportId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("source_bulk_export_id")
    @ExcludeMissing
    fun _sourceBulkExportId(): JsonField<String> = sourceBulkExportId

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
         * Returns a mutable builder for constructing an instance of [BulkExport].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .bulkExportDestinationId()
         * .createdAt()
         * .finishedAt()
         * .sessionId()
         * .startTime()
         * .status()
         * .tenantId()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BulkExport]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var bulkExportDestinationId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var finishedAt: JsonField<OffsetDateTime>? = null
        private var sessionId: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var tenantId: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var compression: JsonField<BulkExportCompression> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var exportFormatVersion: JsonField<ExportFormatVersion> = JsonMissing.of()
        private var filter: JsonField<String> = JsonMissing.of()
        private var format: JsonField<BulkExportFormat> = JsonMissing.of()
        private var intervalHours: JsonField<Long> = JsonMissing.of()
        private var sourceBulkExportId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bulkExport: BulkExport) = apply {
            id = bulkExport.id
            bulkExportDestinationId = bulkExport.bulkExportDestinationId
            createdAt = bulkExport.createdAt
            finishedAt = bulkExport.finishedAt
            sessionId = bulkExport.sessionId
            startTime = bulkExport.startTime
            status = bulkExport.status
            tenantId = bulkExport.tenantId
            updatedAt = bulkExport.updatedAt
            compression = bulkExport.compression
            endTime = bulkExport.endTime
            exportFormatVersion = bulkExport.exportFormatVersion
            filter = bulkExport.filter
            format = bulkExport.format
            intervalHours = bulkExport.intervalHours
            sourceBulkExportId = bulkExport.sourceBulkExportId
            additionalProperties = bulkExport.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun bulkExportDestinationId(bulkExportDestinationId: String) =
            bulkExportDestinationId(JsonField.of(bulkExportDestinationId))

        /**
         * Sets [Builder.bulkExportDestinationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bulkExportDestinationId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun bulkExportDestinationId(bulkExportDestinationId: JsonField<String>) = apply {
            this.bulkExportDestinationId = bulkExportDestinationId
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

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun compression(compression: BulkExportCompression) = compression(JsonField.of(compression))

        /**
         * Sets [Builder.compression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.compression] with a well-typed [BulkExportCompression]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun compression(compression: JsonField<BulkExportCompression>) = apply {
            this.compression = compression
        }

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

        /** Enum for bulk export format versions. */
        fun exportFormatVersion(exportFormatVersion: ExportFormatVersion) =
            exportFormatVersion(JsonField.of(exportFormatVersion))

        /**
         * Sets [Builder.exportFormatVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exportFormatVersion] with a well-typed
         * [ExportFormatVersion] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun exportFormatVersion(exportFormatVersion: JsonField<ExportFormatVersion>) = apply {
            this.exportFormatVersion = exportFormatVersion
        }

        fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

        fun format(format: BulkExportFormat) = format(JsonField.of(format))

        /**
         * Sets [Builder.format] to an arbitrary JSON value.
         *
         * You should usually call [Builder.format] with a well-typed [BulkExportFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun format(format: JsonField<BulkExportFormat>) = apply { this.format = format }

        fun intervalHours(intervalHours: Long?) = intervalHours(JsonField.ofNullable(intervalHours))

        /**
         * Alias for [Builder.intervalHours].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun intervalHours(intervalHours: Long) = intervalHours(intervalHours as Long?)

        /** Alias for calling [Builder.intervalHours] with `intervalHours.orElse(null)`. */
        fun intervalHours(intervalHours: Optional<Long>) = intervalHours(intervalHours.getOrNull())

        /**
         * Sets [Builder.intervalHours] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intervalHours] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun intervalHours(intervalHours: JsonField<Long>) = apply {
            this.intervalHours = intervalHours
        }

        fun sourceBulkExportId(sourceBulkExportId: String?) =
            sourceBulkExportId(JsonField.ofNullable(sourceBulkExportId))

        /**
         * Alias for calling [Builder.sourceBulkExportId] with `sourceBulkExportId.orElse(null)`.
         */
        fun sourceBulkExportId(sourceBulkExportId: Optional<String>) =
            sourceBulkExportId(sourceBulkExportId.getOrNull())

        /**
         * Sets [Builder.sourceBulkExportId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceBulkExportId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceBulkExportId(sourceBulkExportId: JsonField<String>) = apply {
            this.sourceBulkExportId = sourceBulkExportId
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
         * Returns an immutable instance of [BulkExport].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .bulkExportDestinationId()
         * .createdAt()
         * .finishedAt()
         * .sessionId()
         * .startTime()
         * .status()
         * .tenantId()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BulkExport =
            BulkExport(
                checkRequired("id", id),
                checkRequired("bulkExportDestinationId", bulkExportDestinationId),
                checkRequired("createdAt", createdAt),
                checkRequired("finishedAt", finishedAt),
                checkRequired("sessionId", sessionId),
                checkRequired("startTime", startTime),
                checkRequired("status", status),
                checkRequired("tenantId", tenantId),
                checkRequired("updatedAt", updatedAt),
                compression,
                endTime,
                exportFormatVersion,
                filter,
                format,
                intervalHours,
                sourceBulkExportId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BulkExport = apply {
        if (validated) {
            return@apply
        }

        id()
        bulkExportDestinationId()
        createdAt()
        finishedAt()
        sessionId()
        startTime()
        status().validate()
        tenantId()
        updatedAt()
        compression().ifPresent { it.validate() }
        endTime()
        exportFormatVersion().ifPresent { it.validate() }
        filter()
        format().ifPresent { it.validate() }
        intervalHours()
        sourceBulkExportId()
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
            (if (bulkExportDestinationId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (finishedAt.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (compression.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (exportFormatVersion.asKnown().getOrNull()?.validity() ?: 0) +
            (if (filter.asKnown().isPresent) 1 else 0) +
            (format.asKnown().getOrNull()?.validity() ?: 0) +
            (if (intervalHours.asKnown().isPresent) 1 else 0) +
            (if (sourceBulkExportId.asKnown().isPresent) 1 else 0)

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

            @JvmField val INTERVAL_SCHEDULED = of("IntervalScheduled")

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
            INTERVAL_SCHEDULED,
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
            INTERVAL_SCHEDULED,
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
                INTERVAL_SCHEDULED -> Value.INTERVAL_SCHEDULED
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
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CANCELLED -> Known.CANCELLED
                COMPLETED -> Known.COMPLETED
                CREATED -> Known.CREATED
                INTERVAL_SCHEDULED -> Known.INTERVAL_SCHEDULED
                FAILED -> Known.FAILED
                TIMED_OUT -> Known.TIMED_OUT
                RUNNING -> Known.RUNNING
                else -> throw LangChainInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangChainInvalidDataException("Value is not a String")
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Enum for bulk export format versions. */
    class ExportFormatVersion
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val V1 = of("v1")

            @JvmField val V2_BETA = of("v2_beta")

            @JvmStatic fun of(value: String) = ExportFormatVersion(JsonField.of(value))
        }

        /** An enum containing [ExportFormatVersion]'s known values. */
        enum class Known {
            V1,
            V2_BETA,
        }

        /**
         * An enum containing [ExportFormatVersion]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ExportFormatVersion] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            V1,
            V2_BETA,
            /**
             * An enum member indicating that [ExportFormatVersion] was instantiated with an unknown
             * value.
             */
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
                V1 -> Value.V1
                V2_BETA -> Value.V2_BETA
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                V1 -> Known.V1
                V2_BETA -> Known.V2_BETA
                else -> throw LangChainInvalidDataException("Unknown ExportFormatVersion: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangChainInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): ExportFormatVersion = apply {
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

            return other is ExportFormatVersion && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BulkExport &&
            id == other.id &&
            bulkExportDestinationId == other.bulkExportDestinationId &&
            createdAt == other.createdAt &&
            finishedAt == other.finishedAt &&
            sessionId == other.sessionId &&
            startTime == other.startTime &&
            status == other.status &&
            tenantId == other.tenantId &&
            updatedAt == other.updatedAt &&
            compression == other.compression &&
            endTime == other.endTime &&
            exportFormatVersion == other.exportFormatVersion &&
            filter == other.filter &&
            format == other.format &&
            intervalHours == other.intervalHours &&
            sourceBulkExportId == other.sourceBulkExportId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            bulkExportDestinationId,
            createdAt,
            finishedAt,
            sessionId,
            startTime,
            status,
            tenantId,
            updatedAt,
            compression,
            endTime,
            exportFormatVersion,
            filter,
            format,
            intervalHours,
            sourceBulkExportId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkExport{id=$id, bulkExportDestinationId=$bulkExportDestinationId, createdAt=$createdAt, finishedAt=$finishedAt, sessionId=$sessionId, startTime=$startTime, status=$status, tenantId=$tenantId, updatedAt=$updatedAt, compression=$compression, endTime=$endTime, exportFormatVersion=$exportFormatVersion, filter=$filter, format=$format, intervalHours=$intervalHours, sourceBulkExportId=$sourceBulkExportId, additionalProperties=$additionalProperties}"
}
