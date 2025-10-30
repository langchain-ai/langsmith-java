// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets.comparative

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** ComparativeExperiment schema. */
class ComparativeListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val experimentsInfo: JsonField<List<SimpleExperimentInfo>>,
    private val modifiedAt: JsonField<OffsetDateTime>,
    private val referenceDatasetId: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val description: JsonField<String>,
    private val extra: JsonValue,
    private val feedbackStats: JsonValue,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("experiments_info")
        @ExcludeMissing
        experimentsInfo: JsonField<List<SimpleExperimentInfo>> = JsonMissing.of(),
        @JsonProperty("modified_at")
        @ExcludeMissing
        modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("reference_dataset_id")
        @ExcludeMissing
        referenceDatasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extra") @ExcludeMissing extra: JsonValue = JsonMissing.of(),
        @JsonProperty("feedback_stats") @ExcludeMissing feedbackStats: JsonValue = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        experimentsInfo,
        modifiedAt,
        referenceDatasetId,
        tenantId,
        description,
        extra,
        feedbackStats,
        name,
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
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun experimentsInfo(): List<SimpleExperimentInfo> =
        experimentsInfo.getRequired("experiments_info")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modifiedAt(): OffsetDateTime = modifiedAt.getRequired("modified_at")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referenceDatasetId(): String = referenceDatasetId.getRequired("reference_dataset_id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonValue = extra

    @JsonProperty("feedback_stats") @ExcludeMissing fun _feedbackStats(): JsonValue = feedbackStats

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

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
     * Returns the raw JSON value of [experimentsInfo].
     *
     * Unlike [experimentsInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("experiments_info")
    @ExcludeMissing
    fun _experimentsInfo(): JsonField<List<SimpleExperimentInfo>> = experimentsInfo

    /**
     * Returns the raw JSON value of [modifiedAt].
     *
     * Unlike [modifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modified_at")
    @ExcludeMissing
    fun _modifiedAt(): JsonField<OffsetDateTime> = modifiedAt

    /**
     * Returns the raw JSON value of [referenceDatasetId].
     *
     * Unlike [referenceDatasetId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reference_dataset_id")
    @ExcludeMissing
    fun _referenceDatasetId(): JsonField<String> = referenceDatasetId

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [ComparativeListResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .experimentsInfo()
         * .modifiedAt()
         * .referenceDatasetId()
         * .tenantId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ComparativeListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var experimentsInfo: JsonField<MutableList<SimpleExperimentInfo>>? = null
        private var modifiedAt: JsonField<OffsetDateTime>? = null
        private var referenceDatasetId: JsonField<String>? = null
        private var tenantId: JsonField<String>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var extra: JsonValue = JsonMissing.of()
        private var feedbackStats: JsonValue = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(comparativeListResponse: ComparativeListResponse) = apply {
            id = comparativeListResponse.id
            createdAt = comparativeListResponse.createdAt
            experimentsInfo = comparativeListResponse.experimentsInfo.map { it.toMutableList() }
            modifiedAt = comparativeListResponse.modifiedAt
            referenceDatasetId = comparativeListResponse.referenceDatasetId
            tenantId = comparativeListResponse.tenantId
            description = comparativeListResponse.description
            extra = comparativeListResponse.extra
            feedbackStats = comparativeListResponse.feedbackStats
            name = comparativeListResponse.name
            additionalProperties = comparativeListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun experimentsInfo(experimentsInfo: List<SimpleExperimentInfo>) =
            experimentsInfo(JsonField.of(experimentsInfo))

        /**
         * Sets [Builder.experimentsInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.experimentsInfo] with a well-typed
         * `List<SimpleExperimentInfo>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun experimentsInfo(experimentsInfo: JsonField<List<SimpleExperimentInfo>>) = apply {
            this.experimentsInfo = experimentsInfo.map { it.toMutableList() }
        }

        /**
         * Adds a single [SimpleExperimentInfo] to [Builder.experimentsInfo].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExperimentsInfo(experimentsInfo: SimpleExperimentInfo) = apply {
            this.experimentsInfo =
                (this.experimentsInfo ?: JsonField.of(mutableListOf())).also {
                    checkKnown("experimentsInfo", it).add(experimentsInfo)
                }
        }

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

        fun referenceDatasetId(referenceDatasetId: String) =
            referenceDatasetId(JsonField.of(referenceDatasetId))

        /**
         * Sets [Builder.referenceDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceDatasetId(referenceDatasetId: JsonField<String>) = apply {
            this.referenceDatasetId = referenceDatasetId
        }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun extra(extra: JsonValue) = apply { this.extra = extra }

        fun feedbackStats(feedbackStats: JsonValue) = apply { this.feedbackStats = feedbackStats }

        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [ComparativeListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .experimentsInfo()
         * .modifiedAt()
         * .referenceDatasetId()
         * .tenantId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ComparativeListResponse =
            ComparativeListResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("experimentsInfo", experimentsInfo).map { it.toImmutable() },
                checkRequired("modifiedAt", modifiedAt),
                checkRequired("referenceDatasetId", referenceDatasetId),
                checkRequired("tenantId", tenantId),
                description,
                extra,
                feedbackStats,
                name,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ComparativeListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        experimentsInfo().forEach { it.validate() }
        modifiedAt()
        referenceDatasetId()
        tenantId()
        description()
        name()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (experimentsInfo.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (modifiedAt.asKnown().isPresent) 1 else 0) +
            (if (referenceDatasetId.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ComparativeListResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            experimentsInfo == other.experimentsInfo &&
            modifiedAt == other.modifiedAt &&
            referenceDatasetId == other.referenceDatasetId &&
            tenantId == other.tenantId &&
            description == other.description &&
            extra == other.extra &&
            feedbackStats == other.feedbackStats &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            experimentsInfo,
            modifiedAt,
            referenceDatasetId,
            tenantId,
            description,
            extra,
            feedbackStats,
            name,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ComparativeListResponse{id=$id, createdAt=$createdAt, experimentsInfo=$experimentsInfo, modifiedAt=$modifiedAt, referenceDatasetId=$referenceDatasetId, tenantId=$tenantId, description=$description, extra=$extra, feedbackStats=$feedbackStats, name=$name, additionalProperties=$additionalProperties}"
}
