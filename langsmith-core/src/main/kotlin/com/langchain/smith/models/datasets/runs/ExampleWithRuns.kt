// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.runs.RunSchema
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Example schema with list of runs. */
class ExampleWithRuns
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val datasetId: JsonField<String>,
    private val inputs: JsonValue,
    private val name: JsonField<String>,
    private val runs: JsonField<List<RunSchema>>,
    private val attachmentUrls: JsonValue,
    private val createdAt: JsonField<OffsetDateTime>,
    private val metadata: JsonValue,
    private val modifiedAt: JsonField<OffsetDateTime>,
    private val outputs: JsonValue,
    private val sourceRunId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataset_id") @ExcludeMissing datasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inputs") @ExcludeMissing inputs: JsonValue = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("runs") @ExcludeMissing runs: JsonField<List<RunSchema>> = JsonMissing.of(),
        @JsonProperty("attachment_urls")
        @ExcludeMissing
        attachmentUrls: JsonValue = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("modified_at")
        @ExcludeMissing
        modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("outputs") @ExcludeMissing outputs: JsonValue = JsonMissing.of(),
        @JsonProperty("source_run_id")
        @ExcludeMissing
        sourceRunId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        datasetId,
        inputs,
        name,
        runs,
        attachmentUrls,
        createdAt,
        metadata,
        modifiedAt,
        outputs,
        sourceRunId,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasetId(): String = datasetId.getRequired("dataset_id")

    @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonValue = inputs

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runs(): List<RunSchema> = runs.getRequired("runs")

    @JsonProperty("attachment_urls")
    @ExcludeMissing
    fun _attachmentUrls(): JsonValue = attachmentUrls

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modifiedAt(): Optional<OffsetDateTime> = modifiedAt.getOptional("modified_at")

    @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonValue = outputs

    /**
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
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

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
    @JsonProperty("runs") @ExcludeMissing fun _runs(): JsonField<List<RunSchema>> = runs

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [modifiedAt].
     *
     * Unlike [modifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modified_at")
    @ExcludeMissing
    fun _modifiedAt(): JsonField<OffsetDateTime> = modifiedAt

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
         * Returns a mutable builder for constructing an instance of [ExampleWithRuns].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .datasetId()
         * .inputs()
         * .name()
         * .runs()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExampleWithRuns]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var datasetId: JsonField<String>? = null
        private var inputs: JsonValue? = null
        private var name: JsonField<String>? = null
        private var runs: JsonField<MutableList<RunSchema>>? = null
        private var attachmentUrls: JsonValue = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var outputs: JsonValue = JsonMissing.of()
        private var sourceRunId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(exampleWithRuns: ExampleWithRuns) = apply {
            id = exampleWithRuns.id
            datasetId = exampleWithRuns.datasetId
            inputs = exampleWithRuns.inputs
            name = exampleWithRuns.name
            runs = exampleWithRuns.runs.map { it.toMutableList() }
            attachmentUrls = exampleWithRuns.attachmentUrls
            createdAt = exampleWithRuns.createdAt
            metadata = exampleWithRuns.metadata
            modifiedAt = exampleWithRuns.modifiedAt
            outputs = exampleWithRuns.outputs
            sourceRunId = exampleWithRuns.sourceRunId
            additionalProperties = exampleWithRuns.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

        fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun runs(runs: List<RunSchema>) = runs(JsonField.of(runs))

        /**
         * Sets [Builder.runs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runs] with a well-typed `List<RunSchema>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runs(runs: JsonField<List<RunSchema>>) = apply {
            this.runs = runs.map { it.toMutableList() }
        }

        /**
         * Adds a single [RunSchema] to [runs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRun(run: RunSchema) = apply {
            runs = (runs ?: JsonField.of(mutableListOf())).also { checkKnown("runs", it).add(run) }
        }

        fun attachmentUrls(attachmentUrls: JsonValue) = apply {
            this.attachmentUrls = attachmentUrls
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        fun modifiedAt(modifiedAt: OffsetDateTime?) = modifiedAt(JsonField.ofNullable(modifiedAt))

        /** Alias for calling [Builder.modifiedAt] with `modifiedAt.orElse(null)`. */
        fun modifiedAt(modifiedAt: Optional<OffsetDateTime>) = modifiedAt(modifiedAt.getOrNull())

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

        fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

        fun sourceRunId(sourceRunId: String?) = sourceRunId(JsonField.ofNullable(sourceRunId))

        /** Alias for calling [Builder.sourceRunId] with `sourceRunId.orElse(null)`. */
        fun sourceRunId(sourceRunId: Optional<String>) = sourceRunId(sourceRunId.getOrNull())

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
         * Returns an immutable instance of [ExampleWithRuns].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .datasetId()
         * .inputs()
         * .name()
         * .runs()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExampleWithRuns =
            ExampleWithRuns(
                checkRequired("id", id),
                checkRequired("datasetId", datasetId),
                checkRequired("inputs", inputs),
                checkRequired("name", name),
                checkRequired("runs", runs).map { it.toImmutable() },
                attachmentUrls,
                createdAt,
                metadata,
                modifiedAt,
                outputs,
                sourceRunId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExampleWithRuns = apply {
        if (validated) {
            return@apply
        }

        id()
        datasetId()
        name()
        runs().forEach { it.validate() }
        createdAt()
        modifiedAt()
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
            (if (datasetId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (runs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (modifiedAt.asKnown().isPresent) 1 else 0) +
            (if (sourceRunId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExampleWithRuns &&
            id == other.id &&
            datasetId == other.datasetId &&
            inputs == other.inputs &&
            name == other.name &&
            runs == other.runs &&
            attachmentUrls == other.attachmentUrls &&
            createdAt == other.createdAt &&
            metadata == other.metadata &&
            modifiedAt == other.modifiedAt &&
            outputs == other.outputs &&
            sourceRunId == other.sourceRunId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            datasetId,
            inputs,
            name,
            runs,
            attachmentUrls,
            createdAt,
            metadata,
            modifiedAt,
            outputs,
            sourceRunId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExampleWithRuns{id=$id, datasetId=$datasetId, inputs=$inputs, name=$name, runs=$runs, attachmentUrls=$attachmentUrls, createdAt=$createdAt, metadata=$metadata, modifiedAt=$modifiedAt, outputs=$outputs, sourceRunId=$sourceRunId, additionalProperties=$additionalProperties}"
}
