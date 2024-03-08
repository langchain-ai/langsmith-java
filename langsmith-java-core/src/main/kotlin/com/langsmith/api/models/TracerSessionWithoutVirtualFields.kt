// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
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
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@JsonDeserialize(builder = TracerSessionWithoutVirtualFields.Builder::class)
@NoAutoDetect
class TracerSessionWithoutVirtualFields
private constructor( // templates/JavaSDK/entities/objects.ts:76:13
    private val startTime:
        JsonField<OffsetDateTime>, // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
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

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

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

    @JsonProperty("start_time") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _startTime() = startTime

    @JsonProperty("end_time") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _endTime() = endTime

    @JsonProperty("extra") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _extra() = extra

    @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _name() = name

    @JsonProperty("description") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _description() = description

    @JsonProperty("default_dataset_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _defaultDatasetId() = defaultDatasetId

    @JsonProperty("reference_dataset_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _referenceDatasetId() = referenceDatasetId

    @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _id() = id

    @JsonProperty("tenant_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _tenantId() = tenantId

    @JsonProperty("last_run_start_time_live") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _lastRunStartTimeLive() = lastRunStartTimeLive

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TracerSessionWithoutVirtualFields =
        apply { // templates/JavaSDK/entities/objects.ts:198:28
            if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:198:28 //
                // templates/JavaSDK/entities/objects.ts:198:28
                startTime() // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:201:20
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

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is
            TracerSessionWithoutVirtualFields && // templates/JavaSDK/entities/fields.ts:143:33
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

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
            // templates/JavaSDK/entities/fields.ts:174:16 //
            // templates/JavaSDK/entities/fields.ts:174:16
            hashCode =
                Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                    // templates/JavaSDK/entities/fields.ts:175:16 //
                    // templates/JavaSDK/entities/fields.ts:175:16
                    startTime, // templates/JavaSDK/entities/fields.ts:163:19
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

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var startTime: JsonField<OffsetDateTime> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
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

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(tracerSessionWithoutVirtualFields: TracerSessionWithoutVirtualFields) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.startTime =
                    tracerSessionWithoutVirtualFields
                        .startTime // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
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

        fun startTime(startTime: OffsetDateTime) =
            startTime(JsonField.of(startTime)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("start_time") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun startTime(startTime: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.startTime = startTime
            }

        fun endTime(endTime: OffsetDateTime) =
            endTime(JsonField.of(endTime)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("end_time") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun endTime(endTime: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.endTime = endTime
            }

        @JsonProperty("extra") // templates/JavaSDK/entities/objects.ts:264:20 //
        // templates/JavaSDK/entities/objects.ts:252:20
        @ExcludeMissing
        fun extra(extra: JsonValue) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.extra = extra
        }

        fun name(name: String) =
            name(JsonField.of(name)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.name = name
        }

        fun description(description: String) =
            description(JsonField.of(description)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("description") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun description(description: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.description = description
            }

        fun defaultDatasetId(defaultDatasetId: String) =
            defaultDatasetId(
                JsonField.of(defaultDatasetId)
            ) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("default_dataset_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun defaultDatasetId(defaultDatasetId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.defaultDatasetId = defaultDatasetId
            }

        fun referenceDatasetId(referenceDatasetId: String) =
            referenceDatasetId(
                JsonField.of(referenceDatasetId)
            ) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("reference_dataset_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun referenceDatasetId(referenceDatasetId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.referenceDatasetId = referenceDatasetId
            }

        fun id(id: String) = id(JsonField.of(id)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.id = id
        }

        fun tenantId(tenantId: String) =
            tenantId(JsonField.of(tenantId)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("tenant_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun tenantId(tenantId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.tenantId = tenantId
            }

        fun lastRunStartTimeLive(lastRunStartTimeLive: OffsetDateTime) =
            lastRunStartTimeLive(
                JsonField.of(lastRunStartTimeLive)
            ) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("last_run_start_time_live") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun lastRunStartTimeLive(lastRunStartTimeLive: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.lastRunStartTimeLive = lastRunStartTimeLive
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.putAll(additionalProperties)
            }

        @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply { // templates/JavaSDK/entities/objects.ts:304:30
                this.additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:316:30
                this.additionalProperties.putAll(additionalProperties)
            }

        fun build(): TracerSessionWithoutVirtualFields =
            TracerSessionWithoutVirtualFields( // templates/JavaSDK/entities/objects.ts:326:30
                startTime, // templates/JavaSDK/entities/objects.ts:326:30
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
