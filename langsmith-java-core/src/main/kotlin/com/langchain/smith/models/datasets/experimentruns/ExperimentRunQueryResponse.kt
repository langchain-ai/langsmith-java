// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.experimentruns

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.runs.Run
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExperimentRunQueryResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val attachmentUrls: JsonValue,
    private val createdAt: JsonField<OffsetDateTime>,
    private val datasetId: JsonField<String>,
    private val inputs: JsonValue,
    private val metadata: JsonValue,
    private val modifiedAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val outputs: JsonValue,
    private val runs: JsonField<List<Run>>,
    private val sourceRunId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attachment_urls")
        @ExcludeMissing
        attachmentUrls: JsonValue = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dataset_id") @ExcludeMissing datasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inputs") @ExcludeMissing inputs: JsonValue = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("modified_at")
        @ExcludeMissing
        modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("outputs") @ExcludeMissing outputs: JsonValue = JsonMissing.of(),
        @JsonProperty("runs") @ExcludeMissing runs: JsonField<List<Run>> = JsonMissing.of(),
        @JsonProperty("source_run_id")
        @ExcludeMissing
        sourceRunId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        attachmentUrls,
        createdAt,
        datasetId,
        inputs,
        metadata,
        modifiedAt,
        name,
        outputs,
        runs,
        sourceRunId,
        mutableMapOf(),
    )

    /**
     * `id` is the dataset example UUID.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * `attachment_urls` maps each attachment name to a pre-signed download URL.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = experimentRunQueryResponse.attachmentUrls().convert(MyClass.class);
     * ```
     */
    @JsonProperty("attachment_urls")
    @ExcludeMissing
    fun _attachmentUrls(): JsonValue = attachmentUrls

    /**
     * `created_at` is when the example was created (RFC3339 date-time).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * `dataset_id` is the parent dataset UUID.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun datasetId(): Optional<String> = datasetId.getOptional("dataset_id")

    /**
     * `inputs` is the example input payload (arbitrary JSON object).
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = experimentRunQueryResponse.inputs().convert(MyClass.class);
     * ```
     */
    @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonValue = inputs

    /**
     * `metadata` is arbitrary user-defined JSON metadata on the example.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = experimentRunQueryResponse.metadata().convert(MyClass.class);
     * ```
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * `modified_at` is when the example was last modified (RFC3339 date-time).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modifiedAt(): Optional<OffsetDateTime> = modifiedAt.getOptional("modified_at")

    /**
     * `name` is the example's optional name.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * `outputs` is the example reference-output payload (arbitrary JSON object).
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = experimentRunQueryResponse.outputs().convert(MyClass.class);
     * ```
     */
    @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonValue = outputs

    /**
     * `runs` is the list of experiment runs produced for this example.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runs(): Optional<List<Run>> = runs.getOptional("runs")

    /**
     * `source_run_id` is the run UUID the example was created from, if any.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceRunId(): Optional<String> = sourceRunId.getOptional("source_run_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

    /**
     * Returns the raw JSON value of [modifiedAt].
     *
     * Unlike [modifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modified_at")
    @ExcludeMissing
    fun _modifiedAt(): JsonField<OffsetDateTime> = modifiedAt

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [runs].
     *
     * Unlike [runs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runs") @ExcludeMissing fun _runs(): JsonField<List<Run>> = runs

    /**
     * Returns the raw JSON value of [sourceRunId].
     *
     * Unlike [sourceRunId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_run_id")
    @ExcludeMissing
    fun _sourceRunId(): JsonField<String> = sourceRunId

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
         * Returns a mutable builder for constructing an instance of [ExperimentRunQueryResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExperimentRunQueryResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var attachmentUrls: JsonValue = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var datasetId: JsonField<String> = JsonMissing.of()
        private var inputs: JsonValue = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var outputs: JsonValue = JsonMissing.of()
        private var runs: JsonField<MutableList<Run>>? = null
        private var sourceRunId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(experimentRunQueryResponse: ExperimentRunQueryResponse) = apply {
            id = experimentRunQueryResponse.id
            attachmentUrls = experimentRunQueryResponse.attachmentUrls
            createdAt = experimentRunQueryResponse.createdAt
            datasetId = experimentRunQueryResponse.datasetId
            inputs = experimentRunQueryResponse.inputs
            metadata = experimentRunQueryResponse.metadata
            modifiedAt = experimentRunQueryResponse.modifiedAt
            name = experimentRunQueryResponse.name
            outputs = experimentRunQueryResponse.outputs
            runs = experimentRunQueryResponse.runs.map { it.toMutableList() }
            sourceRunId = experimentRunQueryResponse.sourceRunId
            additionalProperties = experimentRunQueryResponse.additionalProperties.toMutableMap()
        }

        /** `id` is the dataset example UUID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** `attachment_urls` maps each attachment name to a pre-signed download URL. */
        fun attachmentUrls(attachmentUrls: JsonValue) = apply {
            this.attachmentUrls = attachmentUrls
        }

        /** `created_at` is when the example was created (RFC3339 date-time). */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** `dataset_id` is the parent dataset UUID. */
        fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

        /** `inputs` is the example input payload (arbitrary JSON object). */
        fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

        /** `metadata` is arbitrary user-defined JSON metadata on the example. */
        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        /** `modified_at` is when the example was last modified (RFC3339 date-time). */
        fun modifiedAt(modifiedAt: OffsetDateTime) = modifiedAt(JsonField.of(modifiedAt))

        /**
         * Sets [Builder.modifiedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modifiedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modifiedAt(modifiedAt: JsonField<OffsetDateTime>) = apply {
            this.modifiedAt = modifiedAt
        }

        /** `name` is the example's optional name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** `outputs` is the example reference-output payload (arbitrary JSON object). */
        fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

        /** `runs` is the list of experiment runs produced for this example. */
        fun runs(runs: List<Run>) = runs(JsonField.of(runs))

        /**
         * Sets [Builder.runs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runs] with a well-typed `List<Run>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runs(runs: JsonField<List<Run>>) = apply { this.runs = runs.map { it.toMutableList() } }

        /**
         * Adds a single [Run] to [runs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRun(run: Run) = apply {
            runs = (runs ?: JsonField.of(mutableListOf())).also { checkKnown("runs", it).add(run) }
        }

        /** `source_run_id` is the run UUID the example was created from, if any. */
        fun sourceRunId(sourceRunId: String) = sourceRunId(JsonField.of(sourceRunId))

        /**
         * Sets [Builder.sourceRunId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceRunId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceRunId(sourceRunId: JsonField<String>) = apply { this.sourceRunId = sourceRunId }

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
         * Returns an immutable instance of [ExperimentRunQueryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExperimentRunQueryResponse =
            ExperimentRunQueryResponse(
                id,
                attachmentUrls,
                createdAt,
                datasetId,
                inputs,
                metadata,
                modifiedAt,
                name,
                outputs,
                (runs ?: JsonMissing.of()).map { it.toImmutable() },
                sourceRunId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LangChainInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ExperimentRunQueryResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        datasetId()
        modifiedAt()
        name()
        runs().ifPresent { it.forEach { it.validate() } }
        sourceRunId()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (datasetId.asKnown().isPresent) 1 else 0) +
            (if (modifiedAt.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (runs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (sourceRunId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExperimentRunQueryResponse &&
            id == other.id &&
            attachmentUrls == other.attachmentUrls &&
            createdAt == other.createdAt &&
            datasetId == other.datasetId &&
            inputs == other.inputs &&
            metadata == other.metadata &&
            modifiedAt == other.modifiedAt &&
            name == other.name &&
            outputs == other.outputs &&
            runs == other.runs &&
            sourceRunId == other.sourceRunId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            attachmentUrls,
            createdAt,
            datasetId,
            inputs,
            metadata,
            modifiedAt,
            name,
            outputs,
            runs,
            sourceRunId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExperimentRunQueryResponse{id=$id, attachmentUrls=$attachmentUrls, createdAt=$createdAt, datasetId=$datasetId, inputs=$inputs, metadata=$metadata, modifiedAt=$modifiedAt, name=$name, outputs=$outputs, runs=$runs, sourceRunId=$sourceRunId, additionalProperties=$additionalProperties}"
}
