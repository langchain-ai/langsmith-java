// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** AnnotationQueue schema. */
class AnnotationQueueSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val queueType: JsonField<QueueType>,
    private val tenantId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val defaultDataset: JsonField<String>,
    private val description: JsonField<String>,
    private val enableReservations: JsonField<Boolean>,
    private val metadata: JsonValue,
    private val numReviewersPerItem: JsonField<Long>,
    private val reservationMinutes: JsonField<Long>,
    private val runRuleId: JsonField<String>,
    private val sourceRuleId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("queue_type")
        @ExcludeMissing
        queueType: JsonField<QueueType> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("default_dataset")
        @ExcludeMissing
        defaultDataset: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enable_reservations")
        @ExcludeMissing
        enableReservations: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("num_reviewers_per_item")
        @ExcludeMissing
        numReviewersPerItem: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("reservation_minutes")
        @ExcludeMissing
        reservationMinutes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("run_rule_id")
        @ExcludeMissing
        runRuleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_rule_id")
        @ExcludeMissing
        sourceRuleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        name,
        queueType,
        tenantId,
        createdAt,
        defaultDataset,
        description,
        enableReservations,
        metadata,
        numReviewersPerItem,
        reservationMinutes,
        runRuleId,
        sourceRuleId,
        updatedAt,
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
    fun name(): String = name.getRequired("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun queueType(): QueueType = queueType.getRequired("queue_type")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultDataset(): Optional<String> = defaultDataset.getOptional("default_dataset")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableReservations(): Optional<Boolean> =
        enableReservations.getOptional("enable_reservations")

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numReviewersPerItem(): Optional<Long> =
        numReviewersPerItem.getOptional("num_reviewers_per_item")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reservationMinutes(): Optional<Long> = reservationMinutes.getOptional("reservation_minutes")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runRuleId(): Optional<String> = runRuleId.getOptional("run_rule_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceRuleId(): Optional<String> = sourceRuleId.getOptional("source_rule_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [queueType].
     *
     * Unlike [queueType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("queue_type") @ExcludeMissing fun _queueType(): JsonField<QueueType> = queueType

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [defaultDataset].
     *
     * Unlike [defaultDataset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("default_dataset")
    @ExcludeMissing
    fun _defaultDataset(): JsonField<String> = defaultDataset

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [enableReservations].
     *
     * Unlike [enableReservations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("enable_reservations")
    @ExcludeMissing
    fun _enableReservations(): JsonField<Boolean> = enableReservations

    /**
     * Returns the raw JSON value of [numReviewersPerItem].
     *
     * Unlike [numReviewersPerItem], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("num_reviewers_per_item")
    @ExcludeMissing
    fun _numReviewersPerItem(): JsonField<Long> = numReviewersPerItem

    /**
     * Returns the raw JSON value of [reservationMinutes].
     *
     * Unlike [reservationMinutes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reservation_minutes")
    @ExcludeMissing
    fun _reservationMinutes(): JsonField<Long> = reservationMinutes

    /**
     * Returns the raw JSON value of [runRuleId].
     *
     * Unlike [runRuleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_rule_id") @ExcludeMissing fun _runRuleId(): JsonField<String> = runRuleId

    /**
     * Returns the raw JSON value of [sourceRuleId].
     *
     * Unlike [sourceRuleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_rule_id")
    @ExcludeMissing
    fun _sourceRuleId(): JsonField<String> = sourceRuleId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [AnnotationQueueSchema].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .queueType()
         * .tenantId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnnotationQueueSchema]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var queueType: JsonField<QueueType>? = null
        private var tenantId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var defaultDataset: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var enableReservations: JsonField<Boolean> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var numReviewersPerItem: JsonField<Long> = JsonMissing.of()
        private var reservationMinutes: JsonField<Long> = JsonMissing.of()
        private var runRuleId: JsonField<String> = JsonMissing.of()
        private var sourceRuleId: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(annotationQueueSchema: AnnotationQueueSchema) = apply {
            id = annotationQueueSchema.id
            name = annotationQueueSchema.name
            queueType = annotationQueueSchema.queueType
            tenantId = annotationQueueSchema.tenantId
            createdAt = annotationQueueSchema.createdAt
            defaultDataset = annotationQueueSchema.defaultDataset
            description = annotationQueueSchema.description
            enableReservations = annotationQueueSchema.enableReservations
            metadata = annotationQueueSchema.metadata
            numReviewersPerItem = annotationQueueSchema.numReviewersPerItem
            reservationMinutes = annotationQueueSchema.reservationMinutes
            runRuleId = annotationQueueSchema.runRuleId
            sourceRuleId = annotationQueueSchema.sourceRuleId
            updatedAt = annotationQueueSchema.updatedAt
            additionalProperties = annotationQueueSchema.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun queueType(queueType: QueueType) = queueType(JsonField.of(queueType))

        /**
         * Sets [Builder.queueType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queueType] with a well-typed [QueueType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun queueType(queueType: JsonField<QueueType>) = apply { this.queueType = queueType }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun defaultDataset(defaultDataset: String?) =
            defaultDataset(JsonField.ofNullable(defaultDataset))

        /** Alias for calling [Builder.defaultDataset] with `defaultDataset.orElse(null)`. */
        fun defaultDataset(defaultDataset: Optional<String>) =
            defaultDataset(defaultDataset.getOrNull())

        /**
         * Sets [Builder.defaultDataset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultDataset] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultDataset(defaultDataset: JsonField<String>) = apply {
            this.defaultDataset = defaultDataset
        }

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

        fun enableReservations(enableReservations: Boolean?) =
            enableReservations(JsonField.ofNullable(enableReservations))

        /**
         * Alias for [Builder.enableReservations].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun enableReservations(enableReservations: Boolean) =
            enableReservations(enableReservations as Boolean?)

        /**
         * Alias for calling [Builder.enableReservations] with `enableReservations.orElse(null)`.
         */
        fun enableReservations(enableReservations: Optional<Boolean>) =
            enableReservations(enableReservations.getOrNull())

        /**
         * Sets [Builder.enableReservations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableReservations] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableReservations(enableReservations: JsonField<Boolean>) = apply {
            this.enableReservations = enableReservations
        }

        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        fun numReviewersPerItem(numReviewersPerItem: Long?) =
            numReviewersPerItem(JsonField.ofNullable(numReviewersPerItem))

        /**
         * Alias for [Builder.numReviewersPerItem].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun numReviewersPerItem(numReviewersPerItem: Long) =
            numReviewersPerItem(numReviewersPerItem as Long?)

        /**
         * Alias for calling [Builder.numReviewersPerItem] with `numReviewersPerItem.orElse(null)`.
         */
        fun numReviewersPerItem(numReviewersPerItem: Optional<Long>) =
            numReviewersPerItem(numReviewersPerItem.getOrNull())

        /**
         * Sets [Builder.numReviewersPerItem] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numReviewersPerItem] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numReviewersPerItem(numReviewersPerItem: JsonField<Long>) = apply {
            this.numReviewersPerItem = numReviewersPerItem
        }

        fun reservationMinutes(reservationMinutes: Long?) =
            reservationMinutes(JsonField.ofNullable(reservationMinutes))

        /**
         * Alias for [Builder.reservationMinutes].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun reservationMinutes(reservationMinutes: Long) =
            reservationMinutes(reservationMinutes as Long?)

        /**
         * Alias for calling [Builder.reservationMinutes] with `reservationMinutes.orElse(null)`.
         */
        fun reservationMinutes(reservationMinutes: Optional<Long>) =
            reservationMinutes(reservationMinutes.getOrNull())

        /**
         * Sets [Builder.reservationMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reservationMinutes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reservationMinutes(reservationMinutes: JsonField<Long>) = apply {
            this.reservationMinutes = reservationMinutes
        }

        fun runRuleId(runRuleId: String?) = runRuleId(JsonField.ofNullable(runRuleId))

        /** Alias for calling [Builder.runRuleId] with `runRuleId.orElse(null)`. */
        fun runRuleId(runRuleId: Optional<String>) = runRuleId(runRuleId.getOrNull())

        /**
         * Sets [Builder.runRuleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runRuleId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runRuleId(runRuleId: JsonField<String>) = apply { this.runRuleId = runRuleId }

        fun sourceRuleId(sourceRuleId: String?) = sourceRuleId(JsonField.ofNullable(sourceRuleId))

        /** Alias for calling [Builder.sourceRuleId] with `sourceRuleId.orElse(null)`. */
        fun sourceRuleId(sourceRuleId: Optional<String>) = sourceRuleId(sourceRuleId.getOrNull())

        /**
         * Sets [Builder.sourceRuleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceRuleId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceRuleId(sourceRuleId: JsonField<String>) = apply {
            this.sourceRuleId = sourceRuleId
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [AnnotationQueueSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .queueType()
         * .tenantId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AnnotationQueueSchema =
            AnnotationQueueSchema(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("queueType", queueType),
                checkRequired("tenantId", tenantId),
                createdAt,
                defaultDataset,
                description,
                enableReservations,
                metadata,
                numReviewersPerItem,
                reservationMinutes,
                runRuleId,
                sourceRuleId,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AnnotationQueueSchema = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        queueType().validate()
        tenantId()
        createdAt()
        defaultDataset()
        description()
        enableReservations()
        numReviewersPerItem()
        reservationMinutes()
        runRuleId()
        sourceRuleId()
        updatedAt()
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (queueType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (defaultDataset.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (enableReservations.asKnown().isPresent) 1 else 0) +
            (if (numReviewersPerItem.asKnown().isPresent) 1 else 0) +
            (if (reservationMinutes.asKnown().isPresent) 1 else 0) +
            (if (runRuleId.asKnown().isPresent) 1 else 0) +
            (if (sourceRuleId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class QueueType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SINGLE = of("single")

            @JvmField val PAIRWISE = of("pairwise")

            @JvmStatic fun of(value: String) = QueueType(JsonField.of(value))
        }

        /** An enum containing [QueueType]'s known values. */
        enum class Known {
            SINGLE,
            PAIRWISE,
        }

        /**
         * An enum containing [QueueType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [QueueType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SINGLE,
            PAIRWISE,
            /**
             * An enum member indicating that [QueueType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SINGLE -> Value.SINGLE
                PAIRWISE -> Value.PAIRWISE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SINGLE -> Known.SINGLE
                PAIRWISE -> Known.PAIRWISE
                else -> throw LangChainInvalidDataException("Unknown QueueType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangChainInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): QueueType = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is QueueType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnnotationQueueSchema &&
            id == other.id &&
            name == other.name &&
            queueType == other.queueType &&
            tenantId == other.tenantId &&
            createdAt == other.createdAt &&
            defaultDataset == other.defaultDataset &&
            description == other.description &&
            enableReservations == other.enableReservations &&
            metadata == other.metadata &&
            numReviewersPerItem == other.numReviewersPerItem &&
            reservationMinutes == other.reservationMinutes &&
            runRuleId == other.runRuleId &&
            sourceRuleId == other.sourceRuleId &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            name,
            queueType,
            tenantId,
            createdAt,
            defaultDataset,
            description,
            enableReservations,
            metadata,
            numReviewersPerItem,
            reservationMinutes,
            runRuleId,
            sourceRuleId,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnnotationQueueSchema{id=$id, name=$name, queueType=$queueType, tenantId=$tenantId, createdAt=$createdAt, defaultDataset=$defaultDataset, description=$description, enableReservations=$enableReservations, metadata=$metadata, numReviewersPerItem=$numReviewersPerItem, reservationMinutes=$reservationMinutes, runRuleId=$runRuleId, sourceRuleId=$sourceRuleId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
