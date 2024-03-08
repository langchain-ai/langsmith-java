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

/** Example schema. */
@JsonDeserialize(builder = Example.Builder::class)
@NoAutoDetect
class Example
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

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Example = apply {
        if (!validated) {
            createdAt()
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Example &&
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
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Example{createdAt=$createdAt, inputs=$inputs, outputs=$outputs, datasetId=$datasetId, sourceRunId=$sourceRunId, id=$id, name=$name, modifiedAt=$modifiedAt, versionCount=$versionCount, versionList=$versionList, additionalProperties=$additionalProperties}"

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
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(example: Example) = apply {
            this.createdAt = example.createdAt
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

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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
        fun sourceRunId(sourceRunId: JsonField<String>) = apply { this.sourceRunId = sourceRunId }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

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
        fun versionCount(versionCount: JsonField<Long>) = apply { this.versionCount = versionCount }

        fun versionList(versionList: List<OffsetDateTime>) = versionList(JsonField.of(versionList))

        @JsonProperty("version_list")
        @ExcludeMissing
        fun versionList(versionList: JsonField<List<OffsetDateTime>>) = apply {
            this.versionList = versionList
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

        fun build(): Example =
            Example(
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
                additionalProperties.toUnmodifiable(),
            )
    }
}
