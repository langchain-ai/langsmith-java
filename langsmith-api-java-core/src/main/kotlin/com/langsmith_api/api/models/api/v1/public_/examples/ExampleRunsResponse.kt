// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.public_.examples

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
import com.langsmith_api.api.core.BaseDeserializer
import com.langsmith_api.api.core.BaseSerializer
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.allMaxBy
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.getOrThrow
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import com.langsmith_api.api.models.api.v1.datasets.runs.ExampleWithRunsCh
import com.langsmith_api.api.models.api.v1.public_.datasets.runs.RunPublicDatasetSchema
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = ExampleRunsResponse.Deserializer::class)
@JsonSerialize(using = ExampleRunsResponse.Serializer::class)
class ExampleRunsResponse
private constructor(
    private val publicExampleWithRuns: List<PublicExampleWithRun>? = null,
    private val withRunsChes: List<ExampleWithRunsCh>? = null,
    private val _json: JsonValue? = null,
) {

    fun publicExampleWithRuns(): Optional<List<PublicExampleWithRun>> =
        Optional.ofNullable(publicExampleWithRuns)

    fun withRunsChes(): Optional<List<ExampleWithRunsCh>> = Optional.ofNullable(withRunsChes)

    fun isPublicExampleWithRuns(): Boolean = publicExampleWithRuns != null

    fun isWithRunsChes(): Boolean = withRunsChes != null

    fun asPublicExampleWithRuns(): List<PublicExampleWithRun> =
        publicExampleWithRuns.getOrThrow("publicExampleWithRuns")

    fun asWithRunsChes(): List<ExampleWithRunsCh> = withRunsChes.getOrThrow("withRunsChes")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            publicExampleWithRuns != null ->
                visitor.visitPublicExampleWithRuns(publicExampleWithRuns)
            withRunsChes != null -> visitor.visitWithRunsChes(withRunsChes)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ExampleRunsResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPublicExampleWithRuns(
                    publicExampleWithRuns: List<PublicExampleWithRun>
                ) {
                    publicExampleWithRuns.forEach { it.validate() }
                }

                override fun visitWithRunsChes(withRunsChes: List<ExampleWithRunsCh>) {
                    withRunsChes.forEach { it.validate() }
                }
            }
        )
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithApiInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitPublicExampleWithRuns(
                    publicExampleWithRuns: List<PublicExampleWithRun>
                ) = publicExampleWithRuns.sumOf { it.validity().toInt() }

                override fun visitWithRunsChes(withRunsChes: List<ExampleWithRunsCh>) =
                    withRunsChes.sumOf { it.validity().toInt() }

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExampleRunsResponse &&
            publicExampleWithRuns == other.publicExampleWithRuns &&
            withRunsChes == other.withRunsChes
    }

    override fun hashCode(): Int = Objects.hash(publicExampleWithRuns, withRunsChes)

    override fun toString(): String =
        when {
            publicExampleWithRuns != null ->
                "ExampleRunsResponse{publicExampleWithRuns=$publicExampleWithRuns}"
            withRunsChes != null -> "ExampleRunsResponse{withRunsChes=$withRunsChes}"
            _json != null -> "ExampleRunsResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ExampleRunsResponse")
        }

    companion object {

        @JvmStatic
        fun ofPublicExampleWithRuns(publicExampleWithRuns: List<PublicExampleWithRun>) =
            ExampleRunsResponse(publicExampleWithRuns = publicExampleWithRuns.toImmutable())

        @JvmStatic
        fun ofWithRunsChes(withRunsChes: List<ExampleWithRunsCh>) =
            ExampleRunsResponse(withRunsChes = withRunsChes.toImmutable())
    }

    /**
     * An interface that defines how to map each variant of [ExampleRunsResponse] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitPublicExampleWithRuns(publicExampleWithRuns: List<PublicExampleWithRun>): T

        fun visitWithRunsChes(withRunsChes: List<ExampleWithRunsCh>): T

        /**
         * Maps an unknown variant of [ExampleRunsResponse] to a value of type [T].
         *
         * An instance of [ExampleRunsResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LangsmithApiInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LangsmithApiInvalidDataException("Unknown ExampleRunsResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<ExampleRunsResponse>(ExampleRunsResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ExampleRunsResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<List<PublicExampleWithRun>>())?.let {
                            ExampleRunsResponse(publicExampleWithRuns = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<ExampleWithRunsCh>>())?.let {
                            ExampleRunsResponse(withRunsChes = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ExampleRunsResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<ExampleRunsResponse>(ExampleRunsResponse::class) {

        override fun serialize(
            value: ExampleRunsResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.publicExampleWithRuns != null ->
                    generator.writeObject(value.publicExampleWithRuns)
                value.withRunsChes != null -> generator.writeObject(value.withRunsChes)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ExampleRunsResponse")
            }
        }
    }

    /** Schema for an example in a publicly-shared dataset with list of runs. */
    class PublicExampleWithRun
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val datasetId: JsonField<String>,
        private val inputs: JsonValue,
        private val name: JsonField<String>,
        private val runs: JsonField<List<RunPublicDatasetSchema>>,
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
            @JsonProperty("dataset_id")
            @ExcludeMissing
            datasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inputs") @ExcludeMissing inputs: JsonValue = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("runs")
            @ExcludeMissing
            runs: JsonField<List<RunPublicDatasetSchema>> = JsonMissing.of(),
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
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun datasetId(): String = datasetId.getRequired("dataset_id")

        @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonValue = inputs

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun runs(): List<RunPublicDatasetSchema> = runs.getRequired("runs")

        @JsonProperty("attachment_urls")
        @ExcludeMissing
        fun _attachmentUrls(): JsonValue = attachmentUrls

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun modifiedAt(): Optional<OffsetDateTime> = modifiedAt.getOptional("modified_at")

        @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonValue = outputs

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
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
        @JsonProperty("runs")
        @ExcludeMissing
        fun _runs(): JsonField<List<RunPublicDatasetSchema>> = runs

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
             * Returns a mutable builder for constructing an instance of [PublicExampleWithRun].
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

        /** A builder for [PublicExampleWithRun]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var datasetId: JsonField<String>? = null
            private var inputs: JsonValue? = null
            private var name: JsonField<String>? = null
            private var runs: JsonField<MutableList<RunPublicDatasetSchema>>? = null
            private var attachmentUrls: JsonValue = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var outputs: JsonValue = JsonMissing.of()
            private var sourceRunId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(publicExampleWithRun: PublicExampleWithRun) = apply {
                id = publicExampleWithRun.id
                datasetId = publicExampleWithRun.datasetId
                inputs = publicExampleWithRun.inputs
                name = publicExampleWithRun.name
                runs = publicExampleWithRun.runs.map { it.toMutableList() }
                attachmentUrls = publicExampleWithRun.attachmentUrls
                createdAt = publicExampleWithRun.createdAt
                metadata = publicExampleWithRun.metadata
                modifiedAt = publicExampleWithRun.modifiedAt
                outputs = publicExampleWithRun.outputs
                sourceRunId = publicExampleWithRun.sourceRunId
                additionalProperties = publicExampleWithRun.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

            /**
             * Sets [Builder.datasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

            fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun runs(runs: List<RunPublicDatasetSchema>) = runs(JsonField.of(runs))

            /**
             * Sets [Builder.runs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runs] with a well-typed
             * `List<RunPublicDatasetSchema>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun runs(runs: JsonField<List<RunPublicDatasetSchema>>) = apply {
                this.runs = runs.map { it.toMutableList() }
            }

            /**
             * Adds a single [RunPublicDatasetSchema] to [runs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRun(run: RunPublicDatasetSchema) = apply {
                runs =
                    (runs ?: JsonField.of(mutableListOf())).also { checkKnown("runs", it).add(run) }
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            fun modifiedAt(modifiedAt: OffsetDateTime?) =
                modifiedAt(JsonField.ofNullable(modifiedAt))

            /** Alias for calling [Builder.modifiedAt] with `modifiedAt.orElse(null)`. */
            fun modifiedAt(modifiedAt: Optional<OffsetDateTime>) =
                modifiedAt(modifiedAt.getOrNull())

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
             * You should usually call [Builder.sourceRunId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceRunId(sourceRunId: JsonField<String>) = apply {
                this.sourceRunId = sourceRunId
            }

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
             * Returns an immutable instance of [PublicExampleWithRun].
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
            fun build(): PublicExampleWithRun =
                PublicExampleWithRun(
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

        fun validate(): PublicExampleWithRun = apply {
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
            } catch (e: LangsmithApiInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is PublicExampleWithRun &&
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
            "PublicExampleWithRun{id=$id, datasetId=$datasetId, inputs=$inputs, name=$name, runs=$runs, attachmentUrls=$attachmentUrls, createdAt=$createdAt, metadata=$metadata, modifiedAt=$modifiedAt, outputs=$outputs, sourceRunId=$sourceRunId, additionalProperties=$additionalProperties}"
    }
}
