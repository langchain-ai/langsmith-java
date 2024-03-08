// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** TracerSession schema. */
@JsonDeserialize(builder = TracerSessionWithoutVirtualFields.Builder::class)
@NoAutoDetect
class TracerSessionWithoutVirtualFields
private constructor(
    private val startTime: JsonField<OffsetDateTime>,
    private val endTime: JsonField<OffsetDateTime>,
    private val extra: JsonValue,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val defaultDatasetId: JsonField<String>,
    private val referenceDatasetId: JsonField<String>,
    private val id: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val lastRunStartTimeLive: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun startTime(): Optional<OffsetDateTime> =
        Optional.ofNullable(startTime.getNullable("start_time"))

    fun endTime(): Optional<OffsetDateTime> = Optional.ofNullable(endTime.getNullable("end_time"))

    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun defaultDatasetId(): Optional<String> =
        Optional.ofNullable(defaultDatasetId.getNullable("default_dataset_id"))

    fun referenceDatasetId(): Optional<String> =
        Optional.ofNullable(referenceDatasetId.getNullable("reference_dataset_id"))

    fun id(): String = id.getRequired("id")

    fun tenantId(): String = tenantId.getRequired("tenant_id")

    fun lastRunStartTimeLive(): Optional<OffsetDateTime> =
        Optional.ofNullable(lastRunStartTimeLive.getNullable("last_run_start_time_live"))

    @JsonProperty("start_time") @ExcludeMissing fun _startTime() = startTime

    @JsonProperty("end_time") @ExcludeMissing fun _endTime() = endTime

    @JsonProperty("extra") @ExcludeMissing fun _extra() = extra

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonProperty("default_dataset_id") @ExcludeMissing fun _defaultDatasetId() = defaultDatasetId

    @JsonProperty("reference_dataset_id")
    @ExcludeMissing
    fun _referenceDatasetId() = referenceDatasetId

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId() = tenantId

    @JsonProperty("last_run_start_time_live")
    @ExcludeMissing
    fun _lastRunStartTimeLive() = lastRunStartTimeLive

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TracerSessionWithoutVirtualFields = apply {
        if (!validated) {
            startTime()
            endTime()
            name()
            description()
            defaultDatasetId()
            referenceDatasetId()
            id()
            tenantId()
            lastRunStartTimeLive()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TracerSessionWithoutVirtualFields &&
            this.startTime == other.startTime &&
            this.endTime == other.endTime &&
            this.extra == other.extra &&
            this.name == other.name &&
            this.description == other.description &&
            this.defaultDatasetId == other.defaultDatasetId &&
            this.referenceDatasetId == other.referenceDatasetId &&
            this.id == other.id &&
            this.tenantId == other.tenantId &&
            this.lastRunStartTimeLive == other.lastRunStartTimeLive &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    startTime,
                    endTime,
                    extra,
                    name,
                    description,
                    defaultDatasetId,
                    referenceDatasetId,
                    id,
                    tenantId,
                    lastRunStartTimeLive,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "TracerSessionWithoutVirtualFields{startTime=$startTime, endTime=$endTime, extra=$extra, name=$name, description=$description, defaultDatasetId=$defaultDatasetId, referenceDatasetId=$referenceDatasetId, id=$id, tenantId=$tenantId, lastRunStartTimeLive=$lastRunStartTimeLive, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var extra: JsonValue = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var defaultDatasetId: JsonField<String> = JsonMissing.of()
        private var referenceDatasetId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var lastRunStartTimeLive: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tracerSessionWithoutVirtualFields: TracerSessionWithoutVirtualFields) =
            apply {
                this.startTime = tracerSessionWithoutVirtualFields.startTime
                this.endTime = tracerSessionWithoutVirtualFields.endTime
                this.extra = tracerSessionWithoutVirtualFields.extra
                this.name = tracerSessionWithoutVirtualFields.name
                this.description = tracerSessionWithoutVirtualFields.description
                this.defaultDatasetId = tracerSessionWithoutVirtualFields.defaultDatasetId
                this.referenceDatasetId = tracerSessionWithoutVirtualFields.referenceDatasetId
                this.id = tracerSessionWithoutVirtualFields.id
                this.tenantId = tracerSessionWithoutVirtualFields.tenantId
                this.lastRunStartTimeLive = tracerSessionWithoutVirtualFields.lastRunStartTimeLive
                additionalProperties(tracerSessionWithoutVirtualFields.additionalProperties)
            }

        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        @JsonProperty("start_time")
        @ExcludeMissing
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

        @JsonProperty("end_time")
        @ExcludeMissing
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        @JsonProperty("extra")
        @ExcludeMissing
        fun extra(extra: JsonValue) = apply { this.extra = extra }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun description(description: String) = description(JsonField.of(description))

        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun defaultDatasetId(defaultDatasetId: String) =
            defaultDatasetId(JsonField.of(defaultDatasetId))

        @JsonProperty("default_dataset_id")
        @ExcludeMissing
        fun defaultDatasetId(defaultDatasetId: JsonField<String>) = apply {
            this.defaultDatasetId = defaultDatasetId
        }

        fun referenceDatasetId(referenceDatasetId: String) =
            referenceDatasetId(JsonField.of(referenceDatasetId))

        @JsonProperty("reference_dataset_id")
        @ExcludeMissing
        fun referenceDatasetId(referenceDatasetId: JsonField<String>) = apply {
            this.referenceDatasetId = referenceDatasetId
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        @JsonProperty("tenant_id")
        @ExcludeMissing
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun lastRunStartTimeLive(lastRunStartTimeLive: OffsetDateTime) =
            lastRunStartTimeLive(JsonField.of(lastRunStartTimeLive))

        @JsonProperty("last_run_start_time_live")
        @ExcludeMissing
        fun lastRunStartTimeLive(lastRunStartTimeLive: JsonField<OffsetDateTime>) = apply {
            this.lastRunStartTimeLive = lastRunStartTimeLive
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): TracerSessionWithoutVirtualFields =
            TracerSessionWithoutVirtualFields(
                startTime,
                endTime,
                extra,
                name,
                description,
                defaultDatasetId,
                referenceDatasetId,
                id,
                tenantId,
                lastRunStartTimeLive,
                additionalProperties.toUnmodifiable(),
            )
    }
}
