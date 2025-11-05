// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class RunCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val queueId: JsonField<String>,
    private val runId: JsonField<String>,
    private val addedAt: JsonField<OffsetDateTime>,
    private val lastReviewedTime: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("queue_id") @ExcludeMissing queueId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("added_at")
        @ExcludeMissing
        addedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("last_reviewed_time")
        @ExcludeMissing
        lastReviewedTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, queueId, runId, addedAt, lastReviewedTime, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun queueId(): String = queueId.getRequired("queue_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runId(): String = runId.getRequired("run_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addedAt(): Optional<OffsetDateTime> = addedAt.getOptional("added_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastReviewedTime(): Optional<OffsetDateTime> =
        lastReviewedTime.getOptional("last_reviewed_time")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [queueId].
     *
     * Unlike [queueId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("queue_id") @ExcludeMissing fun _queueId(): JsonField<String> = queueId

    /**
     * Returns the raw JSON value of [runId].
     *
     * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

    /**
     * Returns the raw JSON value of [addedAt].
     *
     * Unlike [addedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("added_at") @ExcludeMissing fun _addedAt(): JsonField<OffsetDateTime> = addedAt

    /**
     * Returns the raw JSON value of [lastReviewedTime].
     *
     * Unlike [lastReviewedTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("last_reviewed_time")
    @ExcludeMissing
    fun _lastReviewedTime(): JsonField<OffsetDateTime> = lastReviewedTime

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
         * Returns a mutable builder for constructing an instance of [RunCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .queueId()
         * .runId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var queueId: JsonField<String>? = null
        private var runId: JsonField<String>? = null
        private var addedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastReviewedTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runCreateResponse: RunCreateResponse) = apply {
            id = runCreateResponse.id
            queueId = runCreateResponse.queueId
            runId = runCreateResponse.runId
            addedAt = runCreateResponse.addedAt
            lastReviewedTime = runCreateResponse.lastReviewedTime
            additionalProperties = runCreateResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun queueId(queueId: String) = queueId(JsonField.of(queueId))

        /**
         * Sets [Builder.queueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queueId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun queueId(queueId: JsonField<String>) = apply { this.queueId = queueId }

        fun runId(runId: String) = runId(JsonField.of(runId))

        /**
         * Sets [Builder.runId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runId(runId: JsonField<String>) = apply { this.runId = runId }

        fun addedAt(addedAt: OffsetDateTime) = addedAt(JsonField.of(addedAt))

        /**
         * Sets [Builder.addedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addedAt(addedAt: JsonField<OffsetDateTime>) = apply { this.addedAt = addedAt }

        fun lastReviewedTime(lastReviewedTime: OffsetDateTime?) =
            lastReviewedTime(JsonField.ofNullable(lastReviewedTime))

        /** Alias for calling [Builder.lastReviewedTime] with `lastReviewedTime.orElse(null)`. */
        fun lastReviewedTime(lastReviewedTime: Optional<OffsetDateTime>) =
            lastReviewedTime(lastReviewedTime.getOrNull())

        /**
         * Sets [Builder.lastReviewedTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastReviewedTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastReviewedTime(lastReviewedTime: JsonField<OffsetDateTime>) = apply {
            this.lastReviewedTime = lastReviewedTime
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
         * Returns an immutable instance of [RunCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .queueId()
         * .runId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunCreateResponse =
            RunCreateResponse(
                checkRequired("id", id),
                checkRequired("queueId", queueId),
                checkRequired("runId", runId),
                addedAt,
                lastReviewedTime,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RunCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        queueId()
        runId()
        addedAt()
        lastReviewedTime()
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
            (if (queueId.asKnown().isPresent) 1 else 0) +
            (if (runId.asKnown().isPresent) 1 else 0) +
            (if (addedAt.asKnown().isPresent) 1 else 0) +
            (if (lastReviewedTime.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunCreateResponse &&
            id == other.id &&
            queueId == other.queueId &&
            runId == other.runId &&
            addedAt == other.addedAt &&
            lastReviewedTime == other.lastReviewedTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, queueId, runId, addedAt, lastReviewedTime, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RunCreateResponse{id=$id, queueId=$queueId, runId=$runId, addedAt=$addedAt, lastReviewedTime=$lastReviewedTime, additionalProperties=$additionalProperties}"
}
