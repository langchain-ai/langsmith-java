// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.experimentviewoverrides

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExperimentViewOverride
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val columnOverrides: JsonField<List<ColumnOverride>>,
    private val createdAt: JsonField<String>,
    private val datasetId: JsonField<String>,
    private val modifiedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("column_overrides")
        @ExcludeMissing
        columnOverrides: JsonField<List<ColumnOverride>> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataset_id") @ExcludeMissing datasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("modified_at")
        @ExcludeMissing
        modifiedAt: JsonField<String> = JsonMissing.of(),
    ) : this(id, columnOverrides, createdAt, datasetId, modifiedAt, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun columnOverrides(): Optional<List<ColumnOverride>> =
        columnOverrides.getOptional("column_overrides")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun datasetId(): Optional<String> = datasetId.getOptional("dataset_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modifiedAt(): Optional<String> = modifiedAt.getOptional("modified_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [columnOverrides].
     *
     * Unlike [columnOverrides], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("column_overrides")
    @ExcludeMissing
    fun _columnOverrides(): JsonField<List<ColumnOverride>> = columnOverrides

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

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
    @JsonProperty("modified_at") @ExcludeMissing fun _modifiedAt(): JsonField<String> = modifiedAt

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

        /** Returns a mutable builder for constructing an instance of [ExperimentViewOverride]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExperimentViewOverride]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var columnOverrides: JsonField<MutableList<ColumnOverride>>? = null
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var datasetId: JsonField<String> = JsonMissing.of()
        private var modifiedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(experimentViewOverride: ExperimentViewOverride) = apply {
            id = experimentViewOverride.id
            columnOverrides = experimentViewOverride.columnOverrides.map { it.toMutableList() }
            createdAt = experimentViewOverride.createdAt
            datasetId = experimentViewOverride.datasetId
            modifiedAt = experimentViewOverride.modifiedAt
            additionalProperties = experimentViewOverride.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun columnOverrides(columnOverrides: List<ColumnOverride>) =
            columnOverrides(JsonField.of(columnOverrides))

        /**
         * Sets [Builder.columnOverrides] to an arbitrary JSON value.
         *
         * You should usually call [Builder.columnOverrides] with a well-typed
         * `List<ColumnOverride>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun columnOverrides(columnOverrides: JsonField<List<ColumnOverride>>) = apply {
            this.columnOverrides = columnOverrides.map { it.toMutableList() }
        }

        /**
         * Adds a single [ColumnOverride] to [columnOverrides].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addColumnOverride(columnOverride: ColumnOverride) = apply {
            columnOverrides =
                (columnOverrides ?: JsonField.of(mutableListOf())).also {
                    checkKnown("columnOverrides", it).add(columnOverride)
                }
        }

        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

        fun modifiedAt(modifiedAt: String) = modifiedAt(JsonField.of(modifiedAt))

        /**
         * Sets [Builder.modifiedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modifiedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modifiedAt(modifiedAt: JsonField<String>) = apply { this.modifiedAt = modifiedAt }

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
         * Returns an immutable instance of [ExperimentViewOverride].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExperimentViewOverride =
            ExperimentViewOverride(
                id,
                (columnOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                datasetId,
                modifiedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExperimentViewOverride = apply {
        if (validated) {
            return@apply
        }

        id()
        columnOverrides().ifPresent { it.forEach { it.validate() } }
        createdAt()
        datasetId()
        modifiedAt()
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
            (columnOverrides.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (datasetId.asKnown().isPresent) 1 else 0) +
            (if (modifiedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExperimentViewOverride &&
            id == other.id &&
            columnOverrides == other.columnOverrides &&
            createdAt == other.createdAt &&
            datasetId == other.datasetId &&
            modifiedAt == other.modifiedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, columnOverrides, createdAt, datasetId, modifiedAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExperimentViewOverride{id=$id, columnOverrides=$columnOverrides, createdAt=$createdAt, datasetId=$datasetId, modifiedAt=$modifiedAt, additionalProperties=$additionalProperties}"
}
