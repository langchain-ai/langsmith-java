// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Base class for Dataset. */
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@JsonDeserialize(builder = DatasetSchemaForUpdate.Builder::class)
@NoAutoDetect
class DatasetSchemaForUpdate
private constructor( // templates/JavaSDK/entities/objects.ts:76:13
    private val name: JsonField<String>, // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    private val description: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dataType: JsonField<DataType>,
    private val id: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

    private var hashCode: Int = 0

    fun name(): String = name.getRequired("name")

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun createdAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(createdAt.getNullable("created_at"))

    /** Enum for dataset data types. */
    fun dataType(): Optional<DataType> = Optional.ofNullable(dataType.getNullable("data_type"))

    fun id(): String = id.getRequired("id")

    fun tenantId(): String = tenantId.getRequired("tenant_id")

    @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _name() = name

    @JsonProperty("description") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _description() = description

    @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _createdAt() = createdAt

    /** Enum for dataset data types. */
    @JsonProperty("data_type") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _dataType() = dataType

    @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _id() = id

    @JsonProperty("tenant_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _tenantId() = tenantId

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DatasetSchemaForUpdate = apply { // templates/JavaSDK/entities/objects.ts:198:28
        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:198:28 //
            // templates/JavaSDK/entities/objects.ts:198:28
            name() // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:201:20
            description()
            createdAt()
            dataType()
            id()
            tenantId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is DatasetSchemaForUpdate && // templates/JavaSDK/entities/fields.ts:143:33
            this.name == other.name &&
            this.description == other.description &&
            this.createdAt == other.createdAt &&
            this.dataType == other.dataType &&
            this.id == other.id &&
            this.tenantId == other.tenantId &&
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
                    name, // templates/JavaSDK/entities/fields.ts:163:19
                    description,
                    createdAt,
                    dataType,
                    id,
                    tenantId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "DatasetSchemaForUpdate{name=$name, description=$description, createdAt=$createdAt, dataType=$dataType, id=$id, tenantId=$tenantId, additionalProperties=$additionalProperties}"

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var name: JsonField<String> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
        private var description: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dataType: JsonField<DataType> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(datasetSchemaForUpdate: DatasetSchemaForUpdate) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.name =
                    datasetSchemaForUpdate.name // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
                this.description = datasetSchemaForUpdate.description
                this.createdAt = datasetSchemaForUpdate.createdAt
                this.dataType = datasetSchemaForUpdate.dataType
                this.id = datasetSchemaForUpdate.id
                this.tenantId = datasetSchemaForUpdate.tenantId
                additionalProperties(datasetSchemaForUpdate.additionalProperties)
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

        fun createdAt(createdAt: OffsetDateTime) =
            createdAt(JsonField.of(createdAt)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.createdAt = createdAt
            }

        /** Enum for dataset data types. */
        // templates/JavaSDK/entities/objects.ts:252:20
        fun dataType(dataType: DataType) = dataType(JsonField.of(dataType))

        /** Enum for dataset data types. */
        @JsonProperty("data_type") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun dataType(dataType: JsonField<DataType>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.dataType = dataType
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

        fun build(): DatasetSchemaForUpdate =
            DatasetSchemaForUpdate( // templates/JavaSDK/entities/objects.ts:326:30
                name, // templates/JavaSDK/entities/objects.ts:326:30
                description,
                createdAt,
                dataType,
                id,
                tenantId,
                additionalProperties.toUnmodifiable(),
            )
    }

    class DataType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) { // templates/JavaSDK/entities/enums.ts:56:13 // templates/JavaSDK/entities/enums.ts:56:13 //
        // templates/JavaSDK/entities/enums.ts:56:13

        @com.fasterxml.jackson.annotation.JsonValue // templates/JavaSDK/entities/enums.ts:62:10 //
        // templates/JavaSDK/entities/enums.ts:56:13
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is DataType && // templates/JavaSDK/entities/fields.ts:143:33
                this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object { // templates/JavaSDK/entities/enums.ts:71:10

            @JvmField
            val KV = DataType(JsonField.of("kv")) // templates/JavaSDK/entities/enums.ts:71:10

            @JvmField val LLM = DataType(JsonField.of("llm"))

            @JvmField val CHAT = DataType(JsonField.of("chat"))

            @JvmStatic fun of(value: String) = DataType(JsonField.of(value))
        }

        enum class Known { // templates/JavaSDK/entities/enums.ts:78:10
            KV, // templates/JavaSDK/entities/enums.ts:78:10 //
            // templates/JavaSDK/entities/enums.ts:78:10
            LLM,
            CHAT,
        }

        enum class Value { // templates/JavaSDK/entities/enums.ts:82:10
            KV, // templates/JavaSDK/entities/enums.ts:82:10 //
            // templates/JavaSDK/entities/enums.ts:82:10
            LLM,
            CHAT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) { // templates/JavaSDK/entities/enums.ts:91:29
                KV -> Value.KV // templates/JavaSDK/entities/enums.ts:54:10 //
                // templates/JavaSDK/entities/enums.ts:54:10
                LLM -> Value.LLM
                CHAT -> Value.CHAT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) { // templates/JavaSDK/entities/enums.ts:104:29
                KV -> Known.KV // templates/JavaSDK/entities/enums.ts:54:10 //
                // templates/JavaSDK/entities/enums.ts:54:10
                LLM -> Known.LLM
                CHAT -> Known.CHAT
                else -> throw LangSmithInvalidDataException("Unknown DataType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
