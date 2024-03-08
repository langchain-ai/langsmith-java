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

/** Example schema. */
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@JsonDeserialize(builder = Example.Builder::class)
@NoAutoDetect
class Example
private constructor( // templates/JavaSDK/entities/objects.ts:76:13
    private val createdAt:
        JsonField<OffsetDateTime>, // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    private val inputs: JsonValue,
    private val outputs: JsonValue,
    private val datasetId: JsonField<String>,
    private val sourceRunId: JsonField<String>,
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val modifiedAt: JsonField<OffsetDateTime>,
    private val versionCount: JsonField<Long>,
    private val versionList: JsonField<List<OffsetDateTime>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

    private var hashCode: Int = 0

    fun createdAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(createdAt.getNullable("created_at"))

    fun datasetId(): String = datasetId.getRequired("dataset_id")

    fun sourceRunId(): Optional<String> =
        Optional.ofNullable(sourceRunId.getNullable("source_run_id"))

    fun id(): String = id.getRequired("id")

    fun name(): String = name.getRequired("name")

    fun modifiedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(modifiedAt.getNullable("modified_at"))

    fun versionCount(): Optional<Long> =
        Optional.ofNullable(versionCount.getNullable("version_count"))

    fun versionList(): Optional<List<OffsetDateTime>> =
        Optional.ofNullable(versionList.getNullable("version_list"))

    @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _createdAt() = createdAt

    @JsonProperty("inputs") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _inputs() = inputs

    @JsonProperty("outputs") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _outputs() = outputs

    @JsonProperty("dataset_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _datasetId() = datasetId

    @JsonProperty("source_run_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _sourceRunId() = sourceRunId

    @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _id() = id

    @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _name() = name

    @JsonProperty("modified_at") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _modifiedAt() = modifiedAt

    @JsonProperty("version_count") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _versionCount() = versionCount

    @JsonProperty("version_list") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _versionList() = versionList

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Example = apply { // templates/JavaSDK/entities/objects.ts:198:28
        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:198:28 //
            // templates/JavaSDK/entities/objects.ts:198:28
            createdAt() // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:201:20
            datasetId()
            sourceRunId()
            id()
            name()
            modifiedAt()
            versionCount()
            versionList()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is Example && // templates/JavaSDK/entities/fields.ts:143:33
            this.createdAt == other.createdAt &&
            this.inputs == other.inputs &&
            this.outputs == other.outputs &&
            this.datasetId == other.datasetId &&
            this.sourceRunId == other.sourceRunId &&
            this.id == other.id &&
            this.name == other.name &&
            this.modifiedAt == other.modifiedAt &&
            this.versionCount == other.versionCount &&
            this.versionList == other.versionList &&
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
                    createdAt, // templates/JavaSDK/entities/fields.ts:163:19
                    inputs,
                    outputs,
                    datasetId,
                    sourceRunId,
                    id,
                    name,
                    modifiedAt,
                    versionCount,
                    versionList,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Example{createdAt=$createdAt, inputs=$inputs, outputs=$outputs, datasetId=$datasetId, sourceRunId=$sourceRunId, id=$id, name=$name, modifiedAt=$modifiedAt, versionCount=$versionCount, versionList=$versionList, additionalProperties=$additionalProperties}"

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var createdAt: JsonField<OffsetDateTime> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
        private var inputs: JsonValue = JsonMissing.of()
        private var outputs: JsonValue = JsonMissing.of()
        private var datasetId: JsonField<String> = JsonMissing.of()
        private var sourceRunId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var versionCount: JsonField<Long> = JsonMissing.of()
        private var versionList: JsonField<List<OffsetDateTime>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(example: Example) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.createdAt =
                    example.createdAt // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
                this.inputs = example.inputs
                this.outputs = example.outputs
                this.datasetId = example.datasetId
                this.sourceRunId = example.sourceRunId
                this.id = example.id
                this.name = example.name
                this.modifiedAt = example.modifiedAt
                this.versionCount = example.versionCount
                this.versionList = example.versionList
                additionalProperties(example.additionalProperties)
            }

        fun createdAt(createdAt: OffsetDateTime) =
            createdAt(JsonField.of(createdAt)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.createdAt = createdAt
            }

        @JsonProperty("inputs") // templates/JavaSDK/entities/objects.ts:264:20 //
        // templates/JavaSDK/entities/objects.ts:252:20
        @ExcludeMissing
        fun inputs(inputs: JsonValue) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.inputs = inputs
        }

        @JsonProperty("outputs") // templates/JavaSDK/entities/objects.ts:264:20 //
        // templates/JavaSDK/entities/objects.ts:252:20
        @ExcludeMissing
        fun outputs(outputs: JsonValue) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.outputs = outputs
        }

        fun datasetId(datasetId: String) =
            datasetId(JsonField.of(datasetId)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("dataset_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun datasetId(datasetId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.datasetId = datasetId
            }

        fun sourceRunId(sourceRunId: String) =
            sourceRunId(JsonField.of(sourceRunId)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("source_run_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun sourceRunId(sourceRunId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.sourceRunId = sourceRunId
            }

        fun id(id: String) = id(JsonField.of(id)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.id = id
        }

        fun name(name: String) =
            name(JsonField.of(name)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.name = name
        }

        fun modifiedAt(modifiedAt: OffsetDateTime) =
            modifiedAt(JsonField.of(modifiedAt)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("modified_at") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun modifiedAt(modifiedAt: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.modifiedAt = modifiedAt
            }

        fun versionCount(versionCount: Long) =
            versionCount(JsonField.of(versionCount)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("version_count") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun versionCount(versionCount: JsonField<Long>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.versionCount = versionCount
            }

        fun versionList(versionList: List<OffsetDateTime>) =
            versionList(JsonField.of(versionList)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("version_list") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun versionList(versionList: JsonField<List<OffsetDateTime>>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.versionList = versionList
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

        fun build(): Example =
            Example( // templates/JavaSDK/entities/objects.ts:326:30
                createdAt, // templates/JavaSDK/entities/objects.ts:326:30
                inputs,
                outputs,
                datasetId,
                sourceRunId,
                id,
                name,
                modifiedAt,
                versionCount,
                versionList.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }
}
