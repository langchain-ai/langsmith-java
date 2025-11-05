// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangsmithInvalidDataException
import com.langchain.smith.models.orgs.ttlsettings.TraceTier
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** TracerSession schema. */
class TracerSessionWithoutVirtualFields
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val defaultDatasetId: JsonField<String>,
    private val description: JsonField<String>,
    private val endTime: JsonField<OffsetDateTime>,
    private val extra: JsonValue,
    private val lastRunStartTimeLive: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val referenceDatasetId: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val traceTier: JsonField<TraceTier>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("default_dataset_id")
        @ExcludeMissing
        defaultDatasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("extra") @ExcludeMissing extra: JsonValue = JsonMissing.of(),
        @JsonProperty("last_run_start_time_live")
        @ExcludeMissing
        lastRunStartTimeLive: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_dataset_id")
        @ExcludeMissing
        referenceDatasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("trace_tier")
        @ExcludeMissing
        traceTier: JsonField<TraceTier> = JsonMissing.of(),
    ) : this(
        id,
        tenantId,
        defaultDatasetId,
        description,
        endTime,
        extra,
        lastRunStartTimeLive,
        name,
        referenceDatasetId,
        startTime,
        traceTier,
        mutableMapOf(),
    )

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultDatasetId(): Optional<String> = defaultDatasetId.getOptional("default_dataset_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

    @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonValue = extra

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastRunStartTimeLive(): Optional<OffsetDateTime> =
        lastRunStartTimeLive.getOptional("last_run_start_time_live")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referenceDatasetId(): Optional<String> =
        referenceDatasetId.getOptional("reference_dataset_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceTier(): Optional<TraceTier> = traceTier.getOptional("trace_tier")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [defaultDatasetId].
     *
     * Unlike [defaultDatasetId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_dataset_id")
    @ExcludeMissing
    fun _defaultDatasetId(): JsonField<String> = defaultDatasetId

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [lastRunStartTimeLive].
     *
     * Unlike [lastRunStartTimeLive], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("last_run_start_time_live")
    @ExcludeMissing
    fun _lastRunStartTimeLive(): JsonField<OffsetDateTime> = lastRunStartTimeLive

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [referenceDatasetId].
     *
     * Unlike [referenceDatasetId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reference_dataset_id")
    @ExcludeMissing
    fun _referenceDatasetId(): JsonField<String> = referenceDatasetId

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [traceTier].
     *
     * Unlike [traceTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_tier") @ExcludeMissing fun _traceTier(): JsonField<TraceTier> = traceTier

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
         * Returns a mutable builder for constructing an instance of
         * [TracerSessionWithoutVirtualFields].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .tenantId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TracerSessionWithoutVirtualFields]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var tenantId: JsonField<String>? = null
        private var defaultDatasetId: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var extra: JsonValue = JsonMissing.of()
        private var lastRunStartTimeLive: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var referenceDatasetId: JsonField<String> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var traceTier: JsonField<TraceTier> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tracerSessionWithoutVirtualFields: TracerSessionWithoutVirtualFields) =
            apply {
                id = tracerSessionWithoutVirtualFields.id
                tenantId = tracerSessionWithoutVirtualFields.tenantId
                defaultDatasetId = tracerSessionWithoutVirtualFields.defaultDatasetId
                description = tracerSessionWithoutVirtualFields.description
                endTime = tracerSessionWithoutVirtualFields.endTime
                extra = tracerSessionWithoutVirtualFields.extra
                lastRunStartTimeLive = tracerSessionWithoutVirtualFields.lastRunStartTimeLive
                name = tracerSessionWithoutVirtualFields.name
                referenceDatasetId = tracerSessionWithoutVirtualFields.referenceDatasetId
                startTime = tracerSessionWithoutVirtualFields.startTime
                traceTier = tracerSessionWithoutVirtualFields.traceTier
                additionalProperties =
                    tracerSessionWithoutVirtualFields.additionalProperties.toMutableMap()
            }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun defaultDatasetId(defaultDatasetId: String?) =
            defaultDatasetId(JsonField.ofNullable(defaultDatasetId))

        /** Alias for calling [Builder.defaultDatasetId] with `defaultDatasetId.orElse(null)`. */
        fun defaultDatasetId(defaultDatasetId: Optional<String>) =
            defaultDatasetId(defaultDatasetId.getOrNull())

        /**
         * Sets [Builder.defaultDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultDatasetId(defaultDatasetId: JsonField<String>) = apply {
            this.defaultDatasetId = defaultDatasetId
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

        fun extra(extra: JsonValue) = apply { this.extra = extra }

        fun lastRunStartTimeLive(lastRunStartTimeLive: OffsetDateTime?) =
            lastRunStartTimeLive(JsonField.ofNullable(lastRunStartTimeLive))

        /**
         * Alias for calling [Builder.lastRunStartTimeLive] with
         * `lastRunStartTimeLive.orElse(null)`.
         */
        fun lastRunStartTimeLive(lastRunStartTimeLive: Optional<OffsetDateTime>) =
            lastRunStartTimeLive(lastRunStartTimeLive.getOrNull())

        /**
         * Sets [Builder.lastRunStartTimeLive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastRunStartTimeLive] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastRunStartTimeLive(lastRunStartTimeLive: JsonField<OffsetDateTime>) = apply {
            this.lastRunStartTimeLive = lastRunStartTimeLive
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun referenceDatasetId(referenceDatasetId: String?) =
            referenceDatasetId(JsonField.ofNullable(referenceDatasetId))

        /**
         * Alias for calling [Builder.referenceDatasetId] with `referenceDatasetId.orElse(null)`.
         */
        fun referenceDatasetId(referenceDatasetId: Optional<String>) =
            referenceDatasetId(referenceDatasetId.getOrNull())

        /**
         * Sets [Builder.referenceDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceDatasetId(referenceDatasetId: JsonField<String>) = apply {
            this.referenceDatasetId = referenceDatasetId
        }

        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        fun traceTier(traceTier: TraceTier?) = traceTier(JsonField.ofNullable(traceTier))

        /** Alias for calling [Builder.traceTier] with `traceTier.orElse(null)`. */
        fun traceTier(traceTier: Optional<TraceTier>) = traceTier(traceTier.getOrNull())

        /**
         * Sets [Builder.traceTier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceTier] with a well-typed [TraceTier] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun traceTier(traceTier: JsonField<TraceTier>) = apply { this.traceTier = traceTier }

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
         * Returns an immutable instance of [TracerSessionWithoutVirtualFields].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .tenantId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TracerSessionWithoutVirtualFields =
            TracerSessionWithoutVirtualFields(
                checkRequired("id", id),
                checkRequired("tenantId", tenantId),
                defaultDatasetId,
                description,
                endTime,
                extra,
                lastRunStartTimeLive,
                name,
                referenceDatasetId,
                startTime,
                traceTier,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TracerSessionWithoutVirtualFields = apply {
        if (validated) {
            return@apply
        }

        id()
        tenantId()
        defaultDatasetId()
        description()
        endTime()
        lastRunStartTimeLive()
        name()
        referenceDatasetId()
        startTime()
        traceTier().ifPresent { it.validate() }
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
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (defaultDatasetId.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (lastRunStartTimeLive.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (referenceDatasetId.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (traceTier.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TracerSessionWithoutVirtualFields &&
            id == other.id &&
            tenantId == other.tenantId &&
            defaultDatasetId == other.defaultDatasetId &&
            description == other.description &&
            endTime == other.endTime &&
            extra == other.extra &&
            lastRunStartTimeLive == other.lastRunStartTimeLive &&
            name == other.name &&
            referenceDatasetId == other.referenceDatasetId &&
            startTime == other.startTime &&
            traceTier == other.traceTier &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            tenantId,
            defaultDatasetId,
            description,
            endTime,
            extra,
            lastRunStartTimeLive,
            name,
            referenceDatasetId,
            startTime,
            traceTier,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TracerSessionWithoutVirtualFields{id=$id, tenantId=$tenantId, defaultDatasetId=$defaultDatasetId, description=$description, endTime=$endTime, extra=$extra, lastRunStartTimeLive=$lastRunStartTimeLive, name=$name, referenceDatasetId=$referenceDatasetId, startTime=$startTime, traceTier=$traceTier, additionalProperties=$additionalProperties}"
}
