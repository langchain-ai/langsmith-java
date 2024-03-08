// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith.api.core.BaseDeserializer
import com.langsmith.api.core.BaseSerializer
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.getOrThrow
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(
    using = DatasetRunCreateResponse.Deserializer::class
) // templates/JavaSDK/entities/unions.ts:68:13 // templates/JavaSDK/entities/unions.ts:68:13 //
// templates/JavaSDK/entities/unions.ts:68:13 // templates/JavaSDK/entities/unions.ts:68:13 //
// templates/JavaSDK/entities/unions.ts:68:13
@JsonSerialize(using = DatasetRunCreateResponse.Serializer::class)
class DatasetRunCreateResponse
private constructor(
    private val exampleWithRuns: List<ExampleWithRun>? = null,
    private val exampleWithRunsChes: List<ExampleWithRunsCh>? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/unions.ts:68:13

    fun exampleWithRuns(): Optional<List<ExampleWithRun>> =
        Optional.ofNullable(exampleWithRuns) // templates/JavaSDK/entities/unions.ts:89:12 //
    // templates/JavaSDK/entities/unions.ts:89:12

    fun exampleWithRunsChes(): Optional<List<ExampleWithRunsCh>> =
        Optional.ofNullable(exampleWithRunsChes)

    fun isExampleWithRuns(): Boolean =
        exampleWithRuns != null // templates/JavaSDK/entities/unions.ts:104:12 //
    // templates/JavaSDK/entities/unions.ts:104:12

    fun isExampleWithRunsChes(): Boolean = exampleWithRunsChes != null

    fun asExampleWithRuns(): List<ExampleWithRun> =
        exampleWithRuns.getOrThrow(
            "exampleWithRuns"
        ) // templates/JavaSDK/entities/unions.ts:113:12 //
    // templates/JavaSDK/entities/unions.ts:113:12

    fun asExampleWithRunsChes(): List<ExampleWithRunsCh> =
        exampleWithRunsChes.getOrThrow("exampleWithRunsChes")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T { // templates/JavaSDK/entities/unions.ts:128:10
        return when { // templates/JavaSDK/entities/unions.ts:134:30
            exampleWithRuns != null ->
                visitor.visitExampleWithRuns(
                    exampleWithRuns
                ) // templates/JavaSDK/entities/unions.ts:134:30 //
            // templates/JavaSDK/entities/unions.ts:134:30
            exampleWithRunsChes != null -> visitor.visitExampleWithRunsChes(exampleWithRunsChes)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): DatasetRunCreateResponse =
        apply { // templates/JavaSDK/entities/unions.ts:151:28
            if (!validated) { // templates/JavaSDK/entities/unions.ts:154:20 //
                // templates/JavaSDK/entities/unions.ts:151:28 //
                // templates/JavaSDK/entities/unions.ts:151:28
                if (
                    exampleWithRuns == null && exampleWithRunsChes == null
                ) { // templates/JavaSDK/entities/unions.ts:157:24 //
                    // templates/JavaSDK/entities/unions.ts:154:20 //
                    // templates/JavaSDK/entities/unions.ts:154:20
                    throw LangSmithInvalidDataException("Unknown DatasetRunCreateResponse: $_json")
                }
                exampleWithRuns?.forEach { it.validate() }
                exampleWithRunsChes?.forEach { it.validate() }
                validated = true
            }
        }

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is DatasetRunCreateResponse && // templates/JavaSDK/entities/fields.ts:143:33
            this.exampleWithRuns == other.exampleWithRuns &&
            this.exampleWithRunsChes == other.exampleWithRunsChes
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash(exampleWithRuns, exampleWithRunsChes)
    }

    override fun toString(): String { // templates/JavaSDK/entities/unions.ts:181:10
        return when { // templates/JavaSDK/entities/unions.ts:188:16
            exampleWithRuns != null ->
                "DatasetRunCreateResponse{exampleWithRuns=$exampleWithRuns}" // templates/JavaSDK/entities/unions.ts:188:16 // templates/JavaSDK/entities/unions.ts:188:16
            exampleWithRunsChes != null ->
                "DatasetRunCreateResponse{exampleWithRunsChes=$exampleWithRunsChes}"
            _json != null -> "DatasetRunCreateResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid DatasetRunCreateResponse")
        }
    }

    companion object { // templates/JavaSDK/entities/unions.ts:201:10

        @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14 //
        // templates/JavaSDK/entities/unions.ts:201:10
        fun ofExampleWithRuns(exampleWithRuns: List<ExampleWithRun>) =
            DatasetRunCreateResponse(exampleWithRuns = exampleWithRuns)

        @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14
        fun ofExampleWithRunsChes(exampleWithRunsChes: List<ExampleWithRunsCh>) =
            DatasetRunCreateResponse(exampleWithRunsChes = exampleWithRunsChes)
    }

    interface Visitor<out T> { // templates/JavaSDK/entities/unions.ts:211:10 //
        // templates/JavaSDK/entities/unions.ts:211:10 //
        // templates/JavaSDK/entities/unions.ts:211:10

        fun visitExampleWithRuns(
            exampleWithRuns: List<ExampleWithRun>
        ): T // templates/JavaSDK/entities/unions.ts:211:10

        fun visitExampleWithRunsChes(exampleWithRunsChes: List<ExampleWithRunsCh>): T

        fun unknown(json: JsonValue?): T { // templates/JavaSDK/entities/unions.ts:230:14
            throw LangSmithInvalidDataException("Unknown DatasetRunCreateResponse: $json")
        }
    }

    class Deserializer :
        BaseDeserializer<DatasetRunCreateResponse>(
            DatasetRunCreateResponse::class
        ) { // templates/JavaSDK/entities/unions.ts:240:10 //
        // templates/JavaSDK/entities/unions.ts:240:10 //
        // templates/JavaSDK/entities/unions.ts:240:10

        override fun ObjectCodec.deserialize(
            node: JsonNode
        ): DatasetRunCreateResponse { // templates/JavaSDK/entities/unions.ts:244:14 //
            // templates/JavaSDK/entities/unions.ts:240:10
            val json =
                JsonValue.fromJsonNode(node) // templates/JavaSDK/entities/unions.ts:251:22 //
            // templates/JavaSDK/entities/unions.ts:251:22 //
            // templates/JavaSDK/entities/unions.ts:250:28
            tryDeserialize(node, jacksonTypeRef<List<ExampleWithRun>>()) {
                    it.forEach { it.validate() }
                }
                ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                    return DatasetRunCreateResponse(exampleWithRuns = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<List<ExampleWithRunsCh>>()) {
                    it.forEach { it.validate() }
                }
                ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                    return DatasetRunCreateResponse(exampleWithRunsChes = it, _json = json)
                }

            return DatasetRunCreateResponse(_json = json)
        }
    }

    class Serializer :
        BaseSerializer<DatasetRunCreateResponse>(
            DatasetRunCreateResponse::class
        ) { // templates/JavaSDK/entities/unions.ts:269:10 //
        // templates/JavaSDK/entities/unions.ts:269:10 //
        // templates/JavaSDK/entities/unions.ts:269:10

        override fun serialize(
            value: DatasetRunCreateResponse,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) { // templates/JavaSDK/entities/unions.ts:273:14 //
            // templates/JavaSDK/entities/unions.ts:269:10
            when { // templates/JavaSDK/entities/unions.ts:278:24
                value.exampleWithRuns != null ->
                    generator.writeObject(
                        value.exampleWithRuns
                    ) // templates/JavaSDK/entities/unions.ts:278:24 //
                // templates/JavaSDK/entities/unions.ts:278:24
                value.exampleWithRunsChes != null ->
                    generator.writeObject(value.exampleWithRunsChes)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid DatasetRunCreateResponse")
            }
        }
    }

    /** Example schema with list of runs. */
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    @JsonDeserialize(builder = ExampleWithRun.Builder::class)
    @NoAutoDetect
    class ExampleWithRun
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
        private val runs: JsonField<List<RunSchema>>,
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

        fun runs(): List<RunSchema> = runs.getRequired("runs")

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

        @JsonProperty("runs") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _runs() = runs

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ExampleWithRun = apply { // templates/JavaSDK/entities/objects.ts:198:28
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
                runs().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is ExampleWithRun && // templates/JavaSDK/entities/fields.ts:143:33
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
                this.runs == other.runs &&
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
                        runs,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ExampleWithRun{createdAt=$createdAt, inputs=$inputs, outputs=$outputs, datasetId=$datasetId, sourceRunId=$sourceRunId, id=$id, name=$name, modifiedAt=$modifiedAt, versionCount=$versionCount, versionList=$versionList, runs=$runs, additionalProperties=$additionalProperties}"

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
            private var runs: JsonField<List<RunSchema>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(exampleWithRun: ExampleWithRun) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.createdAt =
                        exampleWithRun.createdAt // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.inputs = exampleWithRun.inputs
                    this.outputs = exampleWithRun.outputs
                    this.datasetId = exampleWithRun.datasetId
                    this.sourceRunId = exampleWithRun.sourceRunId
                    this.id = exampleWithRun.id
                    this.name = exampleWithRun.name
                    this.modifiedAt = exampleWithRun.modifiedAt
                    this.versionCount = exampleWithRun.versionCount
                    this.versionList = exampleWithRun.versionList
                    this.runs = exampleWithRun.runs
                    additionalProperties(exampleWithRun.additionalProperties)
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
            fun outputs(outputs: JsonValue) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
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
                sourceRunId(
                    JsonField.of(sourceRunId)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("source_run_id") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun sourceRunId(sourceRunId: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.sourceRunId = sourceRunId
                }

            fun id(id: String) =
                id(JsonField.of(id)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.id = id
            }

            fun name(name: String) =
                name(JsonField.of(name)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun name(name: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
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
                versionCount(
                    JsonField.of(versionCount)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("version_count") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun versionCount(versionCount: JsonField<Long>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.versionCount = versionCount
                }

            fun versionList(versionList: List<OffsetDateTime>) =
                versionList(
                    JsonField.of(versionList)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("version_list") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun versionList(versionList: JsonField<List<OffsetDateTime>>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.versionList = versionList
                }

            fun runs(runs: List<RunSchema>) =
                runs(JsonField.of(runs)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("runs") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun runs(runs: JsonField<List<RunSchema>>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.runs = runs
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties
                        .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
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

            fun build(): ExampleWithRun =
                ExampleWithRun( // templates/JavaSDK/entities/objects.ts:326:30
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
                    runs.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** Example schema with list of runs. */
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    @JsonDeserialize(builder = ExampleWithRunsCh.Builder::class)
    @NoAutoDetect
    class ExampleWithRunsCh
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
        private val runs: JsonField<List<RunSchemaComparisonView>>,
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

        fun runs(): List<RunSchemaComparisonView> = runs.getRequired("runs")

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

        @JsonProperty("runs") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _runs() = runs

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ExampleWithRunsCh = apply { // templates/JavaSDK/entities/objects.ts:198:28
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
                runs().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is ExampleWithRunsCh && // templates/JavaSDK/entities/fields.ts:143:33
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
                this.runs == other.runs &&
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
                        runs,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ExampleWithRunsCh{createdAt=$createdAt, inputs=$inputs, outputs=$outputs, datasetId=$datasetId, sourceRunId=$sourceRunId, id=$id, name=$name, modifiedAt=$modifiedAt, versionCount=$versionCount, versionList=$versionList, runs=$runs, additionalProperties=$additionalProperties}"

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
            private var runs: JsonField<List<RunSchemaComparisonView>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(exampleWithRunsCh: ExampleWithRunsCh) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.createdAt =
                        exampleWithRunsCh
                            .createdAt // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.inputs = exampleWithRunsCh.inputs
                    this.outputs = exampleWithRunsCh.outputs
                    this.datasetId = exampleWithRunsCh.datasetId
                    this.sourceRunId = exampleWithRunsCh.sourceRunId
                    this.id = exampleWithRunsCh.id
                    this.name = exampleWithRunsCh.name
                    this.modifiedAt = exampleWithRunsCh.modifiedAt
                    this.versionCount = exampleWithRunsCh.versionCount
                    this.versionList = exampleWithRunsCh.versionList
                    this.runs = exampleWithRunsCh.runs
                    additionalProperties(exampleWithRunsCh.additionalProperties)
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
            fun outputs(outputs: JsonValue) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
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
                sourceRunId(
                    JsonField.of(sourceRunId)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("source_run_id") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun sourceRunId(sourceRunId: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.sourceRunId = sourceRunId
                }

            fun id(id: String) =
                id(JsonField.of(id)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.id = id
            }

            fun name(name: String) =
                name(JsonField.of(name)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun name(name: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
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
                versionCount(
                    JsonField.of(versionCount)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("version_count") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun versionCount(versionCount: JsonField<Long>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.versionCount = versionCount
                }

            fun versionList(versionList: List<OffsetDateTime>) =
                versionList(
                    JsonField.of(versionList)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("version_list") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun versionList(versionList: JsonField<List<OffsetDateTime>>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.versionList = versionList
                }

            fun runs(runs: List<RunSchemaComparisonView>) =
                runs(JsonField.of(runs)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("runs") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun runs(runs: JsonField<List<RunSchemaComparisonView>>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.runs = runs
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties
                        .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
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

            fun build(): ExampleWithRunsCh =
                ExampleWithRunsCh( // templates/JavaSDK/entities/objects.ts:326:30
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
                    runs.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** Run schema for comparison view. */
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        @JsonDeserialize(builder = RunSchemaComparisonView.Builder::class)
        @NoAutoDetect
        class RunSchemaComparisonView
        private constructor( // templates/JavaSDK/entities/objects.ts:76:13
            private val name: JsonField<String>, // templates/JavaSDK/entities/objects.ts:76:13 //
            // templates/JavaSDK/entities/objects.ts:76:13
            private val inputs: JsonValue,
            private val runType: JsonField<RunType>,
            private val startTime: JsonField<OffsetDateTime>,
            private val endTime: JsonField<OffsetDateTime>,
            private val extra: JsonValue,
            private val error: JsonField<String>,
            private val executionOrder: JsonField<Long>,
            private val serialized: JsonValue,
            private val outputs: JsonValue,
            private val parentRunId: JsonField<String>,
            private val manifestId: JsonField<String>,
            private val manifestS3Id: JsonField<String>,
            private val events: JsonField<List<JsonValue>>,
            private val tags: JsonField<List<String>>,
            private val inputsS3Urls: JsonValue,
            private val outputsS3Urls: JsonValue,
            private val traceId: JsonField<String>,
            private val dottedOrder: JsonField<String>,
            private val id: JsonField<String>,
            private val sessionId: JsonField<String>,
            private val referenceExampleId: JsonField<String>,
            private val totalTokens: JsonField<Long>,
            private val promptTokens: JsonField<Long>,
            private val completionTokens: JsonField<Long>,
            private val totalCost: JsonField<Double>,
            private val promptCost: JsonField<Double>,
            private val completionCost: JsonField<Double>,
            private val status: JsonField<String>,
            private val feedbackStats: JsonField<FeedbackStats>,
            private val appPath: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
            // templates/JavaSDK/entities/objects.ts:76:13

            private var hashCode: Int = 0

            fun name(): String = name.getRequired("name")

            /** Enum for run types. */
            fun runType(): RunType = runType.getRequired("run_type")

            fun startTime(): Optional<OffsetDateTime> =
                Optional.ofNullable(startTime.getNullable("start_time"))

            fun endTime(): Optional<OffsetDateTime> =
                Optional.ofNullable(endTime.getNullable("end_time"))

            fun error(): Optional<String> = Optional.ofNullable(error.getNullable("error"))

            fun executionOrder(): Optional<Long> =
                Optional.ofNullable(executionOrder.getNullable("execution_order"))

            fun parentRunId(): Optional<String> =
                Optional.ofNullable(parentRunId.getNullable("parent_run_id"))

            fun manifestId(): Optional<String> =
                Optional.ofNullable(manifestId.getNullable("manifest_id"))

            fun manifestS3Id(): Optional<String> =
                Optional.ofNullable(manifestS3Id.getNullable("manifest_s3_id"))

            fun events(): Optional<List<JsonValue>> =
                Optional.ofNullable(events.getNullable("events"))

            fun tags(): Optional<List<String>> = Optional.ofNullable(tags.getNullable("tags"))

            fun traceId(): String = traceId.getRequired("trace_id")

            fun dottedOrder(): Optional<String> =
                Optional.ofNullable(dottedOrder.getNullable("dotted_order"))

            fun id(): String = id.getRequired("id")

            fun sessionId(): String = sessionId.getRequired("session_id")

            fun referenceExampleId(): Optional<String> =
                Optional.ofNullable(referenceExampleId.getNullable("reference_example_id"))

            fun totalTokens(): Optional<Long> =
                Optional.ofNullable(totalTokens.getNullable("total_tokens"))

            fun promptTokens(): Optional<Long> =
                Optional.ofNullable(promptTokens.getNullable("prompt_tokens"))

            fun completionTokens(): Optional<Long> =
                Optional.ofNullable(completionTokens.getNullable("completion_tokens"))

            fun totalCost(): Optional<Double> =
                Optional.ofNullable(totalCost.getNullable("total_cost"))

            fun promptCost(): Optional<Double> =
                Optional.ofNullable(promptCost.getNullable("prompt_cost"))

            fun completionCost(): Optional<Double> =
                Optional.ofNullable(completionCost.getNullable("completion_cost"))

            fun status(): String = status.getRequired("status")

            fun feedbackStats(): Optional<FeedbackStats> =
                Optional.ofNullable(feedbackStats.getNullable("feedback_stats"))

            fun appPath(): Optional<String> = Optional.ofNullable(appPath.getNullable("app_path"))

            @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _name() = name

            @JsonProperty("inputs") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _inputs() = inputs

            /** Enum for run types. */
            @JsonProperty("run_type") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _runType() = runType

            @JsonProperty("start_time") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _startTime() = startTime

            @JsonProperty("end_time") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _endTime() = endTime

            @JsonProperty("extra") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _extra() = extra

            @JsonProperty("error") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _error() = error

            @JsonProperty("execution_order") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _executionOrder() = executionOrder

            @JsonProperty("serialized") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _serialized() = serialized

            @JsonProperty("outputs") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _outputs() = outputs

            @JsonProperty("parent_run_id") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _parentRunId() = parentRunId

            @JsonProperty("manifest_id") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _manifestId() = manifestId

            @JsonProperty("manifest_s3_id") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _manifestS3Id() = manifestS3Id

            @JsonProperty("events") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _events() = events

            @JsonProperty("tags") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _tags() = tags

            @JsonProperty("inputs_s3_urls") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _inputsS3Urls() = inputsS3Urls

            @JsonProperty("outputs_s3_urls") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _outputsS3Urls() = outputsS3Urls

            @JsonProperty("trace_id") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _traceId() = traceId

            @JsonProperty("dotted_order") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _dottedOrder() = dottedOrder

            @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _id() = id

            @JsonProperty("session_id") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _sessionId() = sessionId

            @JsonProperty("reference_example_id") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _referenceExampleId() = referenceExampleId

            @JsonProperty("total_tokens") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _totalTokens() = totalTokens

            @JsonProperty("prompt_tokens") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _promptTokens() = promptTokens

            @JsonProperty("completion_tokens") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _completionTokens() = completionTokens

            @JsonProperty("total_cost") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _totalCost() = totalCost

            @JsonProperty("prompt_cost") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _promptCost() = promptCost

            @JsonProperty("completion_cost") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _completionCost() = completionCost

            @JsonProperty("status") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _status() = status

            @JsonProperty("feedback_stats") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _feedbackStats() = feedbackStats

            @JsonProperty("app_path") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _appPath() = appPath

            @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
            // templates/JavaSDK/entities/objects.ts:180:12
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): RunSchemaComparisonView =
                apply { // templates/JavaSDK/entities/objects.ts:198:28
                    if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                        // templates/JavaSDK/entities/objects.ts:198:28 //
                        // templates/JavaSDK/entities/objects.ts:198:28
                        name() // templates/JavaSDK/entities/objects.ts:201:20 //
                        // templates/JavaSDK/entities/objects.ts:201:20
                        runType()
                        startTime()
                        endTime()
                        error()
                        executionOrder()
                        parentRunId()
                        manifestId()
                        manifestS3Id()
                        events()
                        tags()
                        traceId()
                        dottedOrder()
                        id()
                        sessionId()
                        referenceExampleId()
                        totalTokens()
                        promptTokens()
                        completionTokens()
                        totalCost()
                        promptCost()
                        completionCost()
                        status()
                        feedbackStats().map { it.validate() }
                        appPath()
                        validated = true
                    }
                }

            fun toBuilder() = Builder().from(this)

            override fun equals(
                other: Any?
            ): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
                if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                    return true
                }

                return other is
                    RunSchemaComparisonView && // templates/JavaSDK/entities/fields.ts:143:33
                    this.name == other.name &&
                    this.inputs == other.inputs &&
                    this.runType == other.runType &&
                    this.startTime == other.startTime &&
                    this.endTime == other.endTime &&
                    this.extra == other.extra &&
                    this.error == other.error &&
                    this.executionOrder == other.executionOrder &&
                    this.serialized == other.serialized &&
                    this.outputs == other.outputs &&
                    this.parentRunId == other.parentRunId &&
                    this.manifestId == other.manifestId &&
                    this.manifestS3Id == other.manifestS3Id &&
                    this.events == other.events &&
                    this.tags == other.tags &&
                    this.inputsS3Urls == other.inputsS3Urls &&
                    this.outputsS3Urls == other.outputsS3Urls &&
                    this.traceId == other.traceId &&
                    this.dottedOrder == other.dottedOrder &&
                    this.id == other.id &&
                    this.sessionId == other.sessionId &&
                    this.referenceExampleId == other.referenceExampleId &&
                    this.totalTokens == other.totalTokens &&
                    this.promptTokens == other.promptTokens &&
                    this.completionTokens == other.completionTokens &&
                    this.totalCost == other.totalCost &&
                    this.promptCost == other.promptCost &&
                    this.completionCost == other.completionCost &&
                    this.status == other.status &&
                    this.feedbackStats == other.feedbackStats &&
                    this.appPath == other.appPath &&
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
                            inputs,
                            runType,
                            startTime,
                            endTime,
                            extra,
                            error,
                            executionOrder,
                            serialized,
                            outputs,
                            parentRunId,
                            manifestId,
                            manifestS3Id,
                            events,
                            tags,
                            inputsS3Urls,
                            outputsS3Urls,
                            traceId,
                            dottedOrder,
                            id,
                            sessionId,
                            referenceExampleId,
                            totalTokens,
                            promptTokens,
                            completionTokens,
                            totalCost,
                            promptCost,
                            completionCost,
                            status,
                            feedbackStats,
                            appPath,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "RunSchemaComparisonView{name=$name, inputs=$inputs, runType=$runType, startTime=$startTime, endTime=$endTime, extra=$extra, error=$error, executionOrder=$executionOrder, serialized=$serialized, outputs=$outputs, parentRunId=$parentRunId, manifestId=$manifestId, manifestS3Id=$manifestS3Id, events=$events, tags=$tags, inputsS3Urls=$inputsS3Urls, outputsS3Urls=$outputsS3Urls, traceId=$traceId, dottedOrder=$dottedOrder, id=$id, sessionId=$sessionId, referenceExampleId=$referenceExampleId, totalTokens=$totalTokens, promptTokens=$promptTokens, completionTokens=$completionTokens, totalCost=$totalCost, promptCost=$promptCost, completionCost=$completionCost, status=$status, feedbackStats=$feedbackStats, appPath=$appPath, additionalProperties=$additionalProperties}"

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
                private var inputs: JsonValue = JsonMissing.of()
                private var runType: JsonField<RunType> = JsonMissing.of()
                private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var extra: JsonValue = JsonMissing.of()
                private var error: JsonField<String> = JsonMissing.of()
                private var executionOrder: JsonField<Long> = JsonMissing.of()
                private var serialized: JsonValue = JsonMissing.of()
                private var outputs: JsonValue = JsonMissing.of()
                private var parentRunId: JsonField<String> = JsonMissing.of()
                private var manifestId: JsonField<String> = JsonMissing.of()
                private var manifestS3Id: JsonField<String> = JsonMissing.of()
                private var events: JsonField<List<JsonValue>> = JsonMissing.of()
                private var tags: JsonField<List<String>> = JsonMissing.of()
                private var inputsS3Urls: JsonValue = JsonMissing.of()
                private var outputsS3Urls: JsonValue = JsonMissing.of()
                private var traceId: JsonField<String> = JsonMissing.of()
                private var dottedOrder: JsonField<String> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var sessionId: JsonField<String> = JsonMissing.of()
                private var referenceExampleId: JsonField<String> = JsonMissing.of()
                private var totalTokens: JsonField<Long> = JsonMissing.of()
                private var promptTokens: JsonField<Long> = JsonMissing.of()
                private var completionTokens: JsonField<Long> = JsonMissing.of()
                private var totalCost: JsonField<Double> = JsonMissing.of()
                private var promptCost: JsonField<Double> = JsonMissing.of()
                private var completionCost: JsonField<Double> = JsonMissing.of()
                private var status: JsonField<String> = JsonMissing.of()
                private var feedbackStats: JsonField<FeedbackStats> = JsonMissing.of()
                private var appPath: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
                internal fun from(runSchemaComparisonView: RunSchemaComparisonView) =
                    apply { // templates/JavaSDK/entities/objects.ts:240:30
                        this.name =
                            runSchemaComparisonView
                                .name // templates/JavaSDK/entities/objects.ts:240:30 //
                        // templates/JavaSDK/entities/objects.ts:240:30
                        this.inputs = runSchemaComparisonView.inputs
                        this.runType = runSchemaComparisonView.runType
                        this.startTime = runSchemaComparisonView.startTime
                        this.endTime = runSchemaComparisonView.endTime
                        this.extra = runSchemaComparisonView.extra
                        this.error = runSchemaComparisonView.error
                        this.executionOrder = runSchemaComparisonView.executionOrder
                        this.serialized = runSchemaComparisonView.serialized
                        this.outputs = runSchemaComparisonView.outputs
                        this.parentRunId = runSchemaComparisonView.parentRunId
                        this.manifestId = runSchemaComparisonView.manifestId
                        this.manifestS3Id = runSchemaComparisonView.manifestS3Id
                        this.events = runSchemaComparisonView.events
                        this.tags = runSchemaComparisonView.tags
                        this.inputsS3Urls = runSchemaComparisonView.inputsS3Urls
                        this.outputsS3Urls = runSchemaComparisonView.outputsS3Urls
                        this.traceId = runSchemaComparisonView.traceId
                        this.dottedOrder = runSchemaComparisonView.dottedOrder
                        this.id = runSchemaComparisonView.id
                        this.sessionId = runSchemaComparisonView.sessionId
                        this.referenceExampleId = runSchemaComparisonView.referenceExampleId
                        this.totalTokens = runSchemaComparisonView.totalTokens
                        this.promptTokens = runSchemaComparisonView.promptTokens
                        this.completionTokens = runSchemaComparisonView.completionTokens
                        this.totalCost = runSchemaComparisonView.totalCost
                        this.promptCost = runSchemaComparisonView.promptCost
                        this.completionCost = runSchemaComparisonView.completionCost
                        this.status = runSchemaComparisonView.status
                        this.feedbackStats = runSchemaComparisonView.feedbackStats
                        this.appPath = runSchemaComparisonView.appPath
                        additionalProperties(runSchemaComparisonView.additionalProperties)
                    }

                fun name(name: String) =
                    name(JsonField.of(name)) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun name(name: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.name = name
                    }

                @JsonProperty("inputs") // templates/JavaSDK/entities/objects.ts:264:20 //
                // templates/JavaSDK/entities/objects.ts:252:20
                @ExcludeMissing
                fun inputs(inputs: JsonValue) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.inputs = inputs
                    }

                /** Enum for run types. */
                // templates/JavaSDK/entities/objects.ts:252:20
                fun runType(runType: RunType) = runType(JsonField.of(runType))

                /** Enum for run types. */
                @JsonProperty("run_type") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun runType(runType: JsonField<RunType>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.runType = runType
                    }

                fun startTime(startTime: OffsetDateTime) =
                    startTime(
                        JsonField.of(startTime)
                    ) // templates/JavaSDK/entities/objects.ts:252:20

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
                fun extra(extra: JsonValue) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.extra = extra
                    }

                fun error(error: String) =
                    error(JsonField.of(error)) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("error") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun error(error: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.error = error
                    }

                fun executionOrder(executionOrder: Long) =
                    executionOrder(
                        JsonField.of(executionOrder)
                    ) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("execution_order") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun executionOrder(executionOrder: JsonField<Long>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.executionOrder = executionOrder
                    }

                @JsonProperty("serialized") // templates/JavaSDK/entities/objects.ts:264:20 //
                // templates/JavaSDK/entities/objects.ts:252:20
                @ExcludeMissing
                fun serialized(serialized: JsonValue) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.serialized = serialized
                    }

                @JsonProperty("outputs") // templates/JavaSDK/entities/objects.ts:264:20 //
                // templates/JavaSDK/entities/objects.ts:252:20
                @ExcludeMissing
                fun outputs(outputs: JsonValue) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.outputs = outputs
                    }

                fun parentRunId(parentRunId: String) =
                    parentRunId(
                        JsonField.of(parentRunId)
                    ) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("parent_run_id") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun parentRunId(parentRunId: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.parentRunId = parentRunId
                    }

                fun manifestId(manifestId: String) =
                    manifestId(
                        JsonField.of(manifestId)
                    ) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("manifest_id") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun manifestId(manifestId: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.manifestId = manifestId
                    }

                fun manifestS3Id(manifestS3Id: String) =
                    manifestS3Id(
                        JsonField.of(manifestS3Id)
                    ) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("manifest_s3_id") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun manifestS3Id(manifestS3Id: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.manifestS3Id = manifestS3Id
                    }

                fun events(events: List<JsonValue>) =
                    events(JsonField.of(events)) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("events") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun events(events: JsonField<List<JsonValue>>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.events = events
                    }

                fun tags(tags: List<String>) =
                    tags(JsonField.of(tags)) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("tags") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun tags(tags: JsonField<List<String>>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.tags = tags
                    }

                @JsonProperty("inputs_s3_urls") // templates/JavaSDK/entities/objects.ts:264:20 //
                // templates/JavaSDK/entities/objects.ts:252:20
                @ExcludeMissing
                fun inputsS3Urls(inputsS3Urls: JsonValue) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.inputsS3Urls = inputsS3Urls
                    }

                @JsonProperty("outputs_s3_urls") // templates/JavaSDK/entities/objects.ts:264:20 //
                // templates/JavaSDK/entities/objects.ts:252:20
                @ExcludeMissing
                fun outputsS3Urls(outputsS3Urls: JsonValue) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.outputsS3Urls = outputsS3Urls
                    }

                fun traceId(traceId: String) =
                    traceId(JsonField.of(traceId)) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("trace_id") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun traceId(traceId: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.traceId = traceId
                    }

                fun dottedOrder(dottedOrder: String) =
                    dottedOrder(
                        JsonField.of(dottedOrder)
                    ) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("dotted_order") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun dottedOrder(dottedOrder: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.dottedOrder = dottedOrder
                    }

                fun id(id: String) =
                    id(JsonField.of(id)) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun id(id: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.id = id
                    }

                fun sessionId(sessionId: String) =
                    sessionId(
                        JsonField.of(sessionId)
                    ) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("session_id") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun sessionId(sessionId: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.sessionId = sessionId
                    }

                fun referenceExampleId(referenceExampleId: String) =
                    referenceExampleId(
                        JsonField.of(referenceExampleId)
                    ) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty(
                    "reference_example_id"
                ) // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun referenceExampleId(referenceExampleId: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.referenceExampleId = referenceExampleId
                    }

                fun totalTokens(totalTokens: Long) =
                    totalTokens(
                        JsonField.of(totalTokens)
                    ) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("total_tokens") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun totalTokens(totalTokens: JsonField<Long>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.totalTokens = totalTokens
                    }

                fun promptTokens(promptTokens: Long) =
                    promptTokens(
                        JsonField.of(promptTokens)
                    ) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("prompt_tokens") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun promptTokens(promptTokens: JsonField<Long>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.promptTokens = promptTokens
                    }

                fun completionTokens(completionTokens: Long) =
                    completionTokens(
                        JsonField.of(completionTokens)
                    ) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("completion_tokens") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun completionTokens(completionTokens: JsonField<Long>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.completionTokens = completionTokens
                    }

                fun totalCost(totalCost: Double) =
                    totalCost(
                        JsonField.of(totalCost)
                    ) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("total_cost") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun totalCost(totalCost: JsonField<Double>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.totalCost = totalCost
                    }

                fun promptCost(promptCost: Double) =
                    promptCost(
                        JsonField.of(promptCost)
                    ) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("prompt_cost") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun promptCost(promptCost: JsonField<Double>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.promptCost = promptCost
                    }

                fun completionCost(completionCost: Double) =
                    completionCost(
                        JsonField.of(completionCost)
                    ) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("completion_cost") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun completionCost(completionCost: JsonField<Double>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.completionCost = completionCost
                    }

                fun status(status: String) =
                    status(JsonField.of(status)) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("status") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun status(status: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.status = status
                    }

                fun feedbackStats(feedbackStats: FeedbackStats) =
                    feedbackStats(
                        JsonField.of(feedbackStats)
                    ) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("feedback_stats") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun feedbackStats(feedbackStats: JsonField<FeedbackStats>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.feedbackStats = feedbackStats
                    }

                fun appPath(appPath: String) =
                    appPath(JsonField.of(appPath)) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("app_path") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun appPath(appPath: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.appPath = appPath
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply { // templates/JavaSDK/entities/objects.ts:290:30
                        this.additionalProperties
                            .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
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

                fun build(): RunSchemaComparisonView =
                    RunSchemaComparisonView( // templates/JavaSDK/entities/objects.ts:326:30
                        name, // templates/JavaSDK/entities/objects.ts:326:30
                        inputs,
                        runType,
                        startTime,
                        endTime,
                        extra,
                        error,
                        executionOrder,
                        serialized,
                        outputs,
                        parentRunId,
                        manifestId,
                        manifestS3Id,
                        events.map { it.toUnmodifiable() },
                        tags.map { it.toUnmodifiable() },
                        inputsS3Urls,
                        outputsS3Urls,
                        traceId,
                        dottedOrder,
                        id,
                        sessionId,
                        referenceExampleId,
                        totalTokens,
                        promptTokens,
                        completionTokens,
                        totalCost,
                        promptCost,
                        completionCost,
                        status,
                        feedbackStats,
                        appPath,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class RunType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) { // templates/JavaSDK/entities/enums.ts:56:13 //
                // templates/JavaSDK/entities/enums.ts:56:13 //
                // templates/JavaSDK/entities/enums.ts:56:13

                @com.fasterxml.jackson.annotation.JsonValue // templates/JavaSDK/entities/enums.ts:62:10 // templates/JavaSDK/entities/enums.ts:56:13
                fun _value(): JsonField<String> = value

                override fun equals(
                    other: Any?
                ): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
                    if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                        return true
                    }

                    return other is RunType && // templates/JavaSDK/entities/fields.ts:143:33
                        this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object { // templates/JavaSDK/entities/enums.ts:71:10

                    @JvmField
                    val TOOL =
                        RunType(JsonField.of("tool")) // templates/JavaSDK/entities/enums.ts:71:10

                    @JvmField val CHAIN = RunType(JsonField.of("chain"))

                    @JvmField val LLM = RunType(JsonField.of("llm"))

                    @JvmField val RETRIEVER = RunType(JsonField.of("retriever"))

                    @JvmField val EMBEDDING = RunType(JsonField.of("embedding"))

                    @JvmField val PROMPT = RunType(JsonField.of("prompt"))

                    @JvmField val PARSER = RunType(JsonField.of("parser"))

                    @JvmStatic fun of(value: String) = RunType(JsonField.of(value))
                }

                enum class Known { // templates/JavaSDK/entities/enums.ts:78:10
                    TOOL, // templates/JavaSDK/entities/enums.ts:78:10 //
                    // templates/JavaSDK/entities/enums.ts:78:10
                    CHAIN,
                    LLM,
                    RETRIEVER,
                    EMBEDDING,
                    PROMPT,
                    PARSER,
                }

                enum class Value { // templates/JavaSDK/entities/enums.ts:82:10
                    TOOL, // templates/JavaSDK/entities/enums.ts:82:10 //
                    // templates/JavaSDK/entities/enums.ts:82:10
                    CHAIN,
                    LLM,
                    RETRIEVER,
                    EMBEDDING,
                    PROMPT,
                    PARSER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) { // templates/JavaSDK/entities/enums.ts:91:29
                        TOOL -> Value.TOOL // templates/JavaSDK/entities/enums.ts:54:10 //
                        // templates/JavaSDK/entities/enums.ts:54:10
                        CHAIN -> Value.CHAIN
                        LLM -> Value.LLM
                        RETRIEVER -> Value.RETRIEVER
                        EMBEDDING -> Value.EMBEDDING
                        PROMPT -> Value.PROMPT
                        PARSER -> Value.PARSER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) { // templates/JavaSDK/entities/enums.ts:104:29
                        TOOL -> Known.TOOL // templates/JavaSDK/entities/enums.ts:54:10 //
                        // templates/JavaSDK/entities/enums.ts:54:10
                        CHAIN -> Known.CHAIN
                        LLM -> Known.LLM
                        RETRIEVER -> Known.RETRIEVER
                        EMBEDDING -> Known.EMBEDDING
                        PROMPT -> Known.PROMPT
                        PARSER -> Known.PARSER
                        else -> throw LangSmithInvalidDataException("Unknown RunType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(
                builder = FeedbackStats.Builder::class
            ) // templates/JavaSDK/entities/objects.ts:76:13 //
            // templates/JavaSDK/entities/objects.ts:76:13 //
            // templates/JavaSDK/entities/objects.ts:76:13 //
            // templates/JavaSDK/entities/objects.ts:76:13 //
            // templates/JavaSDK/entities/objects.ts:76:13
            @NoAutoDetect
            class FeedbackStats
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean =
                    false // templates/JavaSDK/entities/objects.ts:94:14 //
                // templates/JavaSDK/entities/objects.ts:76:13

                private var hashCode: Int = 0

                @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
                // templates/JavaSDK/entities/objects.ts:180:12
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): FeedbackStats =
                    apply { // templates/JavaSDK/entities/objects.ts:198:28
                        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                            // templates/JavaSDK/entities/objects.ts:198:28 //
                            // templates/JavaSDK/entities/objects.ts:198:28
                            validated = true
                        }
                    }

                fun toBuilder() = Builder().from(this)

                override fun equals(
                    other: Any?
                ): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
                    if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                        return true
                    }

                    return other is FeedbackStats && // templates/JavaSDK/entities/fields.ts:143:33
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
                    if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
                        // templates/JavaSDK/entities/fields.ts:174:16 //
                        // templates/JavaSDK/entities/fields.ts:174:16
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "FeedbackStats{additionalProperties=$additionalProperties}"

                companion object { // templates/JavaSDK/entities/objects.ts:217:10

                    @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
                    // templates/JavaSDK/entities/objects.ts:217:10
                    fun builder() = Builder()
                }

                class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
                    // templates/JavaSDK/entities/objects.ts:224:10 //
                    // templates/JavaSDK/entities/objects.ts:224:10

                    private var additionalProperties: MutableMap<String, JsonValue> =
                        mutableMapOf() // templates/JavaSDK/entities/objects.ts:224:10

                    @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
                    internal fun from(feedbackStats: FeedbackStats) =
                        apply { // templates/JavaSDK/entities/objects.ts:240:30
                            additionalProperties(feedbackStats.additionalProperties)
                        }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply { // templates/JavaSDK/entities/objects.ts:290:30
                            this.additionalProperties
                                .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
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

                    fun build(): FeedbackStats =
                        FeedbackStats(additionalProperties.toUnmodifiable())
                }
            }
        }
    }
}
