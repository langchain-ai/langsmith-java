// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
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
import com.langsmith.api.core.Enum
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

@JsonDeserialize(using = PublicExampleRunCreateResponse.Deserializer::class)
@JsonSerialize(using = PublicExampleRunCreateResponse.Serializer::class)
class PublicExampleRunCreateResponse
private constructor(
    private val publicExampleWithRuns: List<PublicExampleWithRun>? = null,
    private val exampleWithRunsChes: List<ExampleWithRunsCh>? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun publicExampleWithRuns(): Optional<List<PublicExampleWithRun>> =
        Optional.ofNullable(publicExampleWithRuns)

    fun exampleWithRunsChes(): Optional<List<ExampleWithRunsCh>> =
        Optional.ofNullable(exampleWithRunsChes)

    fun isPublicExampleWithRuns(): Boolean = publicExampleWithRuns != null

    fun isExampleWithRunsChes(): Boolean = exampleWithRunsChes != null

    fun asPublicExampleWithRuns(): List<PublicExampleWithRun> =
        publicExampleWithRuns.getOrThrow("publicExampleWithRuns")

    fun asExampleWithRunsChes(): List<ExampleWithRunsCh> =
        exampleWithRunsChes.getOrThrow("exampleWithRunsChes")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            publicExampleWithRuns != null ->
                visitor.visitPublicExampleWithRuns(publicExampleWithRuns)
            exampleWithRunsChes != null -> visitor.visitExampleWithRunsChes(exampleWithRunsChes)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): PublicExampleRunCreateResponse = apply {
        if (!validated) {
            if (publicExampleWithRuns == null && exampleWithRunsChes == null) {
                throw LangSmithInvalidDataException(
                    "Unknown PublicExampleRunCreateResponse: $_json"
                )
            }
            publicExampleWithRuns?.forEach { it.validate() }
            exampleWithRunsChes?.forEach { it.validate() }
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicExampleRunCreateResponse &&
            this.publicExampleWithRuns == other.publicExampleWithRuns &&
            this.exampleWithRunsChes == other.exampleWithRunsChes
    }

    override fun hashCode(): Int {
        return Objects.hash(publicExampleWithRuns, exampleWithRunsChes)
    }

    override fun toString(): String {
        return when {
            publicExampleWithRuns != null ->
                "PublicExampleRunCreateResponse{publicExampleWithRuns=$publicExampleWithRuns}"
            exampleWithRunsChes != null ->
                "PublicExampleRunCreateResponse{exampleWithRunsChes=$exampleWithRunsChes}"
            _json != null -> "PublicExampleRunCreateResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid PublicExampleRunCreateResponse")
        }
    }

    companion object {

        @JvmStatic
        fun ofPublicExampleWithRuns(publicExampleWithRuns: List<PublicExampleWithRun>) =
            PublicExampleRunCreateResponse(publicExampleWithRuns = publicExampleWithRuns)

        @JvmStatic
        fun ofExampleWithRunsChes(exampleWithRunsChes: List<ExampleWithRunsCh>) =
            PublicExampleRunCreateResponse(exampleWithRunsChes = exampleWithRunsChes)
    }

    interface Visitor<out T> {

        fun visitPublicExampleWithRuns(publicExampleWithRuns: List<PublicExampleWithRun>): T

        fun visitExampleWithRunsChes(exampleWithRunsChes: List<ExampleWithRunsCh>): T

        fun unknown(json: JsonValue?): T {
            throw LangSmithInvalidDataException("Unknown PublicExampleRunCreateResponse: $json")
        }
    }

    class Deserializer :
        BaseDeserializer<PublicExampleRunCreateResponse>(PublicExampleRunCreateResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): PublicExampleRunCreateResponse {
            val json = JsonValue.fromJsonNode(node)
            tryDeserialize(node, jacksonTypeRef<List<PublicExampleWithRun>>()) {
                    it.forEach { it.validate() }
                }
                ?.let {
                    return PublicExampleRunCreateResponse(publicExampleWithRuns = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<List<ExampleWithRunsCh>>()) {
                    it.forEach { it.validate() }
                }
                ?.let {
                    return PublicExampleRunCreateResponse(exampleWithRunsChes = it, _json = json)
                }

            return PublicExampleRunCreateResponse(_json = json)
        }
    }

    class Serializer :
        BaseSerializer<PublicExampleRunCreateResponse>(PublicExampleRunCreateResponse::class) {

        override fun serialize(
            value: PublicExampleRunCreateResponse,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.publicExampleWithRuns != null ->
                    generator.writeObject(value.publicExampleWithRuns)
                value.exampleWithRunsChes != null ->
                    generator.writeObject(value.exampleWithRunsChes)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid PublicExampleRunCreateResponse")
            }
        }
    }

    /** Schema for an example in a publicly-shared dataset with list of runs. */
    @JsonDeserialize(builder = PublicExampleWithRun.Builder::class)
    @NoAutoDetect
    class PublicExampleWithRun
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val inputs: JsonValue,
        private val outputs: JsonValue,
        private val datasetId: JsonField<String>,
        private val sourceRunId: JsonField<String>,
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val modifiedAt: JsonField<OffsetDateTime>,
        private val versionCount: JsonField<Long>,
        private val versionList: JsonField<List<OffsetDateTime>>,
        private val runs: JsonField<List<RunPublicDatasetSchema>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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

        fun runs(): List<RunPublicDatasetSchema> = runs.getRequired("runs")

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("inputs") @ExcludeMissing fun _inputs() = inputs

        @JsonProperty("outputs") @ExcludeMissing fun _outputs() = outputs

        @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId() = datasetId

        @JsonProperty("source_run_id") @ExcludeMissing fun _sourceRunId() = sourceRunId

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("modified_at") @ExcludeMissing fun _modifiedAt() = modifiedAt

        @JsonProperty("version_count") @ExcludeMissing fun _versionCount() = versionCount

        @JsonProperty("version_list") @ExcludeMissing fun _versionList() = versionList

        @JsonProperty("runs") @ExcludeMissing fun _runs() = runs

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PublicExampleWithRun = apply {
            if (!validated) {
                createdAt()
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PublicExampleWithRun &&
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

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        createdAt,
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
            "PublicExampleWithRun{createdAt=$createdAt, inputs=$inputs, outputs=$outputs, datasetId=$datasetId, sourceRunId=$sourceRunId, id=$id, name=$name, modifiedAt=$modifiedAt, versionCount=$versionCount, versionList=$versionList, runs=$runs, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var inputs: JsonValue = JsonMissing.of()
            private var outputs: JsonValue = JsonMissing.of()
            private var datasetId: JsonField<String> = JsonMissing.of()
            private var sourceRunId: JsonField<String> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var versionCount: JsonField<Long> = JsonMissing.of()
            private var versionList: JsonField<List<OffsetDateTime>> = JsonMissing.of()
            private var runs: JsonField<List<RunPublicDatasetSchema>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(publicExampleWithRun: PublicExampleWithRun) = apply {
                this.createdAt = publicExampleWithRun.createdAt
                this.inputs = publicExampleWithRun.inputs
                this.outputs = publicExampleWithRun.outputs
                this.datasetId = publicExampleWithRun.datasetId
                this.sourceRunId = publicExampleWithRun.sourceRunId
                this.id = publicExampleWithRun.id
                this.name = publicExampleWithRun.name
                this.modifiedAt = publicExampleWithRun.modifiedAt
                this.versionCount = publicExampleWithRun.versionCount
                this.versionList = publicExampleWithRun.versionList
                this.runs = publicExampleWithRun.runs
                additionalProperties(publicExampleWithRun.additionalProperties)
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            @JsonProperty("inputs")
            @ExcludeMissing
            fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

            @JsonProperty("outputs")
            @ExcludeMissing
            fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

            fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

            @JsonProperty("dataset_id")
            @ExcludeMissing
            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

            fun sourceRunId(sourceRunId: String) = sourceRunId(JsonField.of(sourceRunId))

            @JsonProperty("source_run_id")
            @ExcludeMissing
            fun sourceRunId(sourceRunId: JsonField<String>) = apply {
                this.sourceRunId = sourceRunId
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun modifiedAt(modifiedAt: OffsetDateTime) = modifiedAt(JsonField.of(modifiedAt))

            @JsonProperty("modified_at")
            @ExcludeMissing
            fun modifiedAt(modifiedAt: JsonField<OffsetDateTime>) = apply {
                this.modifiedAt = modifiedAt
            }

            fun versionCount(versionCount: Long) = versionCount(JsonField.of(versionCount))

            @JsonProperty("version_count")
            @ExcludeMissing
            fun versionCount(versionCount: JsonField<Long>) = apply {
                this.versionCount = versionCount
            }

            fun versionList(versionList: List<OffsetDateTime>) =
                versionList(JsonField.of(versionList))

            @JsonProperty("version_list")
            @ExcludeMissing
            fun versionList(versionList: JsonField<List<OffsetDateTime>>) = apply {
                this.versionList = versionList
            }

            fun runs(runs: List<RunPublicDatasetSchema>) = runs(JsonField.of(runs))

            @JsonProperty("runs")
            @ExcludeMissing
            fun runs(runs: JsonField<List<RunPublicDatasetSchema>>) = apply { this.runs = runs }

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

            fun build(): PublicExampleWithRun =
                PublicExampleWithRun(
                    createdAt,
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
    @JsonDeserialize(builder = ExampleWithRunsCh.Builder::class)
    @NoAutoDetect
    class ExampleWithRunsCh
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val inputs: JsonValue,
        private val outputs: JsonValue,
        private val datasetId: JsonField<String>,
        private val sourceRunId: JsonField<String>,
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val modifiedAt: JsonField<OffsetDateTime>,
        private val versionCount: JsonField<Long>,
        private val versionList: JsonField<List<OffsetDateTime>>,
        private val runs: JsonField<List<Run>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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

        fun runs(): List<Run> = runs.getRequired("runs")

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("inputs") @ExcludeMissing fun _inputs() = inputs

        @JsonProperty("outputs") @ExcludeMissing fun _outputs() = outputs

        @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId() = datasetId

        @JsonProperty("source_run_id") @ExcludeMissing fun _sourceRunId() = sourceRunId

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("modified_at") @ExcludeMissing fun _modifiedAt() = modifiedAt

        @JsonProperty("version_count") @ExcludeMissing fun _versionCount() = versionCount

        @JsonProperty("version_list") @ExcludeMissing fun _versionList() = versionList

        @JsonProperty("runs") @ExcludeMissing fun _runs() = runs

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ExampleWithRunsCh = apply {
            if (!validated) {
                createdAt()
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExampleWithRunsCh &&
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

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        createdAt,
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

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var inputs: JsonValue = JsonMissing.of()
            private var outputs: JsonValue = JsonMissing.of()
            private var datasetId: JsonField<String> = JsonMissing.of()
            private var sourceRunId: JsonField<String> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var versionCount: JsonField<Long> = JsonMissing.of()
            private var versionList: JsonField<List<OffsetDateTime>> = JsonMissing.of()
            private var runs: JsonField<List<Run>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(exampleWithRunsCh: ExampleWithRunsCh) = apply {
                this.createdAt = exampleWithRunsCh.createdAt
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

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            @JsonProperty("inputs")
            @ExcludeMissing
            fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

            @JsonProperty("outputs")
            @ExcludeMissing
            fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

            fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

            @JsonProperty("dataset_id")
            @ExcludeMissing
            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

            fun sourceRunId(sourceRunId: String) = sourceRunId(JsonField.of(sourceRunId))

            @JsonProperty("source_run_id")
            @ExcludeMissing
            fun sourceRunId(sourceRunId: JsonField<String>) = apply {
                this.sourceRunId = sourceRunId
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun modifiedAt(modifiedAt: OffsetDateTime) = modifiedAt(JsonField.of(modifiedAt))

            @JsonProperty("modified_at")
            @ExcludeMissing
            fun modifiedAt(modifiedAt: JsonField<OffsetDateTime>) = apply {
                this.modifiedAt = modifiedAt
            }

            fun versionCount(versionCount: Long) = versionCount(JsonField.of(versionCount))

            @JsonProperty("version_count")
            @ExcludeMissing
            fun versionCount(versionCount: JsonField<Long>) = apply {
                this.versionCount = versionCount
            }

            fun versionList(versionList: List<OffsetDateTime>) =
                versionList(JsonField.of(versionList))

            @JsonProperty("version_list")
            @ExcludeMissing
            fun versionList(versionList: JsonField<List<OffsetDateTime>>) = apply {
                this.versionList = versionList
            }

            fun runs(runs: List<Run>) = runs(JsonField.of(runs))

            @JsonProperty("runs")
            @ExcludeMissing
            fun runs(runs: JsonField<List<Run>>) = apply { this.runs = runs }

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

            fun build(): ExampleWithRunsCh =
                ExampleWithRunsCh(
                    createdAt,
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
        @JsonDeserialize(builder = Run.Builder::class)
        @NoAutoDetect
        class Run
        private constructor(
            private val name: JsonField<String>,
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

            private var validated: Boolean = false

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

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonProperty("inputs") @ExcludeMissing fun _inputs() = inputs

            /** Enum for run types. */
            @JsonProperty("run_type") @ExcludeMissing fun _runType() = runType

            @JsonProperty("start_time") @ExcludeMissing fun _startTime() = startTime

            @JsonProperty("end_time") @ExcludeMissing fun _endTime() = endTime

            @JsonProperty("extra") @ExcludeMissing fun _extra() = extra

            @JsonProperty("error") @ExcludeMissing fun _error() = error

            @JsonProperty("execution_order") @ExcludeMissing fun _executionOrder() = executionOrder

            @JsonProperty("serialized") @ExcludeMissing fun _serialized() = serialized

            @JsonProperty("outputs") @ExcludeMissing fun _outputs() = outputs

            @JsonProperty("parent_run_id") @ExcludeMissing fun _parentRunId() = parentRunId

            @JsonProperty("manifest_id") @ExcludeMissing fun _manifestId() = manifestId

            @JsonProperty("manifest_s3_id") @ExcludeMissing fun _manifestS3Id() = manifestS3Id

            @JsonProperty("events") @ExcludeMissing fun _events() = events

            @JsonProperty("tags") @ExcludeMissing fun _tags() = tags

            @JsonProperty("inputs_s3_urls") @ExcludeMissing fun _inputsS3Urls() = inputsS3Urls

            @JsonProperty("outputs_s3_urls") @ExcludeMissing fun _outputsS3Urls() = outputsS3Urls

            @JsonProperty("trace_id") @ExcludeMissing fun _traceId() = traceId

            @JsonProperty("dotted_order") @ExcludeMissing fun _dottedOrder() = dottedOrder

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("session_id") @ExcludeMissing fun _sessionId() = sessionId

            @JsonProperty("reference_example_id")
            @ExcludeMissing
            fun _referenceExampleId() = referenceExampleId

            @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens() = totalTokens

            @JsonProperty("prompt_tokens") @ExcludeMissing fun _promptTokens() = promptTokens

            @JsonProperty("completion_tokens")
            @ExcludeMissing
            fun _completionTokens() = completionTokens

            @JsonProperty("total_cost") @ExcludeMissing fun _totalCost() = totalCost

            @JsonProperty("prompt_cost") @ExcludeMissing fun _promptCost() = promptCost

            @JsonProperty("completion_cost") @ExcludeMissing fun _completionCost() = completionCost

            @JsonProperty("status") @ExcludeMissing fun _status() = status

            @JsonProperty("feedback_stats") @ExcludeMissing fun _feedbackStats() = feedbackStats

            @JsonProperty("app_path") @ExcludeMissing fun _appPath() = appPath

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Run = apply {
                if (!validated) {
                    name()
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Run &&
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

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            name,
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
                "Run{name=$name, inputs=$inputs, runType=$runType, startTime=$startTime, endTime=$endTime, extra=$extra, error=$error, executionOrder=$executionOrder, serialized=$serialized, outputs=$outputs, parentRunId=$parentRunId, manifestId=$manifestId, manifestS3Id=$manifestS3Id, events=$events, tags=$tags, inputsS3Urls=$inputsS3Urls, outputsS3Urls=$outputsS3Urls, traceId=$traceId, dottedOrder=$dottedOrder, id=$id, sessionId=$sessionId, referenceExampleId=$referenceExampleId, totalTokens=$totalTokens, promptTokens=$promptTokens, completionTokens=$completionTokens, totalCost=$totalCost, promptCost=$promptCost, completionCost=$completionCost, status=$status, feedbackStats=$feedbackStats, appPath=$appPath, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
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

                @JvmSynthetic
                internal fun from(run: Run) = apply {
                    this.name = run.name
                    this.inputs = run.inputs
                    this.runType = run.runType
                    this.startTime = run.startTime
                    this.endTime = run.endTime
                    this.extra = run.extra
                    this.error = run.error
                    this.executionOrder = run.executionOrder
                    this.serialized = run.serialized
                    this.outputs = run.outputs
                    this.parentRunId = run.parentRunId
                    this.manifestId = run.manifestId
                    this.manifestS3Id = run.manifestS3Id
                    this.events = run.events
                    this.tags = run.tags
                    this.inputsS3Urls = run.inputsS3Urls
                    this.outputsS3Urls = run.outputsS3Urls
                    this.traceId = run.traceId
                    this.dottedOrder = run.dottedOrder
                    this.id = run.id
                    this.sessionId = run.sessionId
                    this.referenceExampleId = run.referenceExampleId
                    this.totalTokens = run.totalTokens
                    this.promptTokens = run.promptTokens
                    this.completionTokens = run.completionTokens
                    this.totalCost = run.totalCost
                    this.promptCost = run.promptCost
                    this.completionCost = run.completionCost
                    this.status = run.status
                    this.feedbackStats = run.feedbackStats
                    this.appPath = run.appPath
                    additionalProperties(run.additionalProperties)
                }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                @JsonProperty("inputs")
                @ExcludeMissing
                fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

                /** Enum for run types. */
                fun runType(runType: RunType) = runType(JsonField.of(runType))

                /** Enum for run types. */
                @JsonProperty("run_type")
                @ExcludeMissing
                fun runType(runType: JsonField<RunType>) = apply { this.runType = runType }

                fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

                @JsonProperty("start_time")
                @ExcludeMissing
                fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                    this.startTime = startTime
                }

                fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

                @JsonProperty("end_time")
                @ExcludeMissing
                fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

                @JsonProperty("extra")
                @ExcludeMissing
                fun extra(extra: JsonValue) = apply { this.extra = extra }

                fun error(error: String) = error(JsonField.of(error))

                @JsonProperty("error")
                @ExcludeMissing
                fun error(error: JsonField<String>) = apply { this.error = error }

                fun executionOrder(executionOrder: Long) =
                    executionOrder(JsonField.of(executionOrder))

                @JsonProperty("execution_order")
                @ExcludeMissing
                fun executionOrder(executionOrder: JsonField<Long>) = apply {
                    this.executionOrder = executionOrder
                }

                @JsonProperty("serialized")
                @ExcludeMissing
                fun serialized(serialized: JsonValue) = apply { this.serialized = serialized }

                @JsonProperty("outputs")
                @ExcludeMissing
                fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

                fun parentRunId(parentRunId: String) = parentRunId(JsonField.of(parentRunId))

                @JsonProperty("parent_run_id")
                @ExcludeMissing
                fun parentRunId(parentRunId: JsonField<String>) = apply {
                    this.parentRunId = parentRunId
                }

                fun manifestId(manifestId: String) = manifestId(JsonField.of(manifestId))

                @JsonProperty("manifest_id")
                @ExcludeMissing
                fun manifestId(manifestId: JsonField<String>) = apply {
                    this.manifestId = manifestId
                }

                fun manifestS3Id(manifestS3Id: String) = manifestS3Id(JsonField.of(manifestS3Id))

                @JsonProperty("manifest_s3_id")
                @ExcludeMissing
                fun manifestS3Id(manifestS3Id: JsonField<String>) = apply {
                    this.manifestS3Id = manifestS3Id
                }

                fun events(events: List<JsonValue>) = events(JsonField.of(events))

                @JsonProperty("events")
                @ExcludeMissing
                fun events(events: JsonField<List<JsonValue>>) = apply { this.events = events }

                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                @JsonProperty("tags")
                @ExcludeMissing
                fun tags(tags: JsonField<List<String>>) = apply { this.tags = tags }

                @JsonProperty("inputs_s3_urls")
                @ExcludeMissing
                fun inputsS3Urls(inputsS3Urls: JsonValue) = apply {
                    this.inputsS3Urls = inputsS3Urls
                }

                @JsonProperty("outputs_s3_urls")
                @ExcludeMissing
                fun outputsS3Urls(outputsS3Urls: JsonValue) = apply {
                    this.outputsS3Urls = outputsS3Urls
                }

                fun traceId(traceId: String) = traceId(JsonField.of(traceId))

                @JsonProperty("trace_id")
                @ExcludeMissing
                fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

                fun dottedOrder(dottedOrder: String) = dottedOrder(JsonField.of(dottedOrder))

                @JsonProperty("dotted_order")
                @ExcludeMissing
                fun dottedOrder(dottedOrder: JsonField<String>) = apply {
                    this.dottedOrder = dottedOrder
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

                @JsonProperty("session_id")
                @ExcludeMissing
                fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

                fun referenceExampleId(referenceExampleId: String) =
                    referenceExampleId(JsonField.of(referenceExampleId))

                @JsonProperty("reference_example_id")
                @ExcludeMissing
                fun referenceExampleId(referenceExampleId: JsonField<String>) = apply {
                    this.referenceExampleId = referenceExampleId
                }

                fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

                @JsonProperty("total_tokens")
                @ExcludeMissing
                fun totalTokens(totalTokens: JsonField<Long>) = apply {
                    this.totalTokens = totalTokens
                }

                fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

                @JsonProperty("prompt_tokens")
                @ExcludeMissing
                fun promptTokens(promptTokens: JsonField<Long>) = apply {
                    this.promptTokens = promptTokens
                }

                fun completionTokens(completionTokens: Long) =
                    completionTokens(JsonField.of(completionTokens))

                @JsonProperty("completion_tokens")
                @ExcludeMissing
                fun completionTokens(completionTokens: JsonField<Long>) = apply {
                    this.completionTokens = completionTokens
                }

                fun totalCost(totalCost: Double) = totalCost(JsonField.of(totalCost))

                @JsonProperty("total_cost")
                @ExcludeMissing
                fun totalCost(totalCost: JsonField<Double>) = apply { this.totalCost = totalCost }

                fun promptCost(promptCost: Double) = promptCost(JsonField.of(promptCost))

                @JsonProperty("prompt_cost")
                @ExcludeMissing
                fun promptCost(promptCost: JsonField<Double>) = apply {
                    this.promptCost = promptCost
                }

                fun completionCost(completionCost: Double) =
                    completionCost(JsonField.of(completionCost))

                @JsonProperty("completion_cost")
                @ExcludeMissing
                fun completionCost(completionCost: JsonField<Double>) = apply {
                    this.completionCost = completionCost
                }

                fun status(status: String) = status(JsonField.of(status))

                @JsonProperty("status")
                @ExcludeMissing
                fun status(status: JsonField<String>) = apply { this.status = status }

                fun feedbackStats(feedbackStats: FeedbackStats) =
                    feedbackStats(JsonField.of(feedbackStats))

                @JsonProperty("feedback_stats")
                @ExcludeMissing
                fun feedbackStats(feedbackStats: JsonField<FeedbackStats>) = apply {
                    this.feedbackStats = feedbackStats
                }

                fun appPath(appPath: String) = appPath(JsonField.of(appPath))

                @JsonProperty("app_path")
                @ExcludeMissing
                fun appPath(appPath: JsonField<String>) = apply { this.appPath = appPath }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Run =
                    Run(
                        name,
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
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RunType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val TOOL = RunType(JsonField.of("tool"))

                    @JvmField val CHAIN = RunType(JsonField.of("chain"))

                    @JvmField val LLM = RunType(JsonField.of("llm"))

                    @JvmField val RETRIEVER = RunType(JsonField.of("retriever"))

                    @JvmField val EMBEDDING = RunType(JsonField.of("embedding"))

                    @JvmField val PROMPT = RunType(JsonField.of("prompt"))

                    @JvmField val PARSER = RunType(JsonField.of("parser"))

                    @JvmStatic fun of(value: String) = RunType(JsonField.of(value))
                }

                enum class Known {
                    TOOL,
                    CHAIN,
                    LLM,
                    RETRIEVER,
                    EMBEDDING,
                    PROMPT,
                    PARSER,
                }

                enum class Value {
                    TOOL,
                    CHAIN,
                    LLM,
                    RETRIEVER,
                    EMBEDDING,
                    PROMPT,
                    PARSER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TOOL -> Value.TOOL
                        CHAIN -> Value.CHAIN
                        LLM -> Value.LLM
                        RETRIEVER -> Value.RETRIEVER
                        EMBEDDING -> Value.EMBEDDING
                        PROMPT -> Value.PROMPT
                        PARSER -> Value.PARSER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TOOL -> Known.TOOL
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

            @JsonDeserialize(builder = FeedbackStats.Builder::class)
            @NoAutoDetect
            class FeedbackStats
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): FeedbackStats = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FeedbackStats &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "FeedbackStats{additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(feedbackStats: FeedbackStats) = apply {
                        additionalProperties(feedbackStats.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): FeedbackStats =
                        FeedbackStats(additionalProperties.toUnmodifiable())
                }
            }
        }
    }
}
