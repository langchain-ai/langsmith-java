// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
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
@JsonDeserialize(builder = DatasetSchemaForUpdate.Builder::class)
@NoAutoDetect
class DatasetSchemaForUpdate
private constructor(
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dataType: JsonField<DataType>,
    private val id: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** Enum for dataset data types. */
    @JsonProperty("data_type") @ExcludeMissing fun _dataType() = dataType

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId() = tenantId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DatasetSchemaForUpdate = apply {
        if (!validated) {
            name()
            description()
            createdAt()
            dataType()
            id()
            tenantId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetSchemaForUpdate &&
            this.name == other.name &&
            this.description == other.description &&
            this.createdAt == other.createdAt &&
            this.dataType == other.dataType &&
            this.id == other.id &&
            this.tenantId == other.tenantId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    name,
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

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dataType: JsonField<DataType> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetSchemaForUpdate: DatasetSchemaForUpdate) = apply {
            this.name = datasetSchemaForUpdate.name
            this.description = datasetSchemaForUpdate.description
            this.createdAt = datasetSchemaForUpdate.createdAt
            this.dataType = datasetSchemaForUpdate.dataType
            this.id = datasetSchemaForUpdate.id
            this.tenantId = datasetSchemaForUpdate.tenantId
            additionalProperties(datasetSchemaForUpdate.additionalProperties)
        }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun description(description: String) = description(JsonField.of(description))

        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Enum for dataset data types. */
        fun dataType(dataType: DataType) = dataType(JsonField.of(dataType))

        /** Enum for dataset data types. */
        @JsonProperty("data_type")
        @ExcludeMissing
        fun dataType(dataType: JsonField<DataType>) = apply { this.dataType = dataType }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        @JsonProperty("tenant_id")
        @ExcludeMissing
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

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

        fun build(): DatasetSchemaForUpdate =
            DatasetSchemaForUpdate(
                name,
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
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val KV = DataType(JsonField.of("kv"))

            @JvmField val LLM = DataType(JsonField.of("llm"))

            @JvmField val CHAT = DataType(JsonField.of("chat"))

            @JvmStatic fun of(value: String) = DataType(JsonField.of(value))
        }

        enum class Known {
            KV,
            LLM,
            CHAT,
        }

        enum class Value {
            KV,
            LLM,
            CHAT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                KV -> Value.KV
                LLM -> Value.LLM
                CHAT -> Value.CHAT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                KV -> Known.KV
                LLM -> Known.LLM
                CHAT -> Known.CHAT
                else -> throw LangSmithInvalidDataException("Unknown DataType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
