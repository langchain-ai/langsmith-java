// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.me.onboardingstate

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UserOnboardingStateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val lsUserId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val evaluationCompletedAt: JsonField<OffsetDateTime>,
    private val lgstudioCompletedAt: JsonField<OffsetDateTime>,
    private val playgroundCompletedAt: JsonField<OffsetDateTime>,
    private val successViewedAt: JsonField<OffsetDateTime>,
    private val tracingCompletedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ls_user_id") @ExcludeMissing lsUserId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("evaluation_completed_at")
        @ExcludeMissing
        evaluationCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lgstudio_completed_at")
        @ExcludeMissing
        lgstudioCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("playground_completed_at")
        @ExcludeMissing
        playgroundCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("success_viewed_at")
        @ExcludeMissing
        successViewedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("tracing_completed_at")
        @ExcludeMissing
        tracingCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        lsUserId,
        updatedAt,
        evaluationCompletedAt,
        lgstudioCompletedAt,
        playgroundCompletedAt,
        successViewedAt,
        tracingCompletedAt,
        mutableMapOf(),
    )

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lsUserId(): String = lsUserId.getRequired("ls_user_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluationCompletedAt(): Optional<OffsetDateTime> =
        evaluationCompletedAt.getOptional("evaluation_completed_at")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lgstudioCompletedAt(): Optional<OffsetDateTime> =
        lgstudioCompletedAt.getOptional("lgstudio_completed_at")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun playgroundCompletedAt(): Optional<OffsetDateTime> =
        playgroundCompletedAt.getOptional("playground_completed_at")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun successViewedAt(): Optional<OffsetDateTime> =
        successViewedAt.getOptional("success_viewed_at")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tracingCompletedAt(): Optional<OffsetDateTime> =
        tracingCompletedAt.getOptional("tracing_completed_at")

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
     * Returns the raw JSON value of [lsUserId].
     *
     * Unlike [lsUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ls_user_id") @ExcludeMissing fun _lsUserId(): JsonField<String> = lsUserId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [evaluationCompletedAt].
     *
     * Unlike [evaluationCompletedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("evaluation_completed_at")
    @ExcludeMissing
    fun _evaluationCompletedAt(): JsonField<OffsetDateTime> = evaluationCompletedAt

    /**
     * Returns the raw JSON value of [lgstudioCompletedAt].
     *
     * Unlike [lgstudioCompletedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lgstudio_completed_at")
    @ExcludeMissing
    fun _lgstudioCompletedAt(): JsonField<OffsetDateTime> = lgstudioCompletedAt

    /**
     * Returns the raw JSON value of [playgroundCompletedAt].
     *
     * Unlike [playgroundCompletedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("playground_completed_at")
    @ExcludeMissing
    fun _playgroundCompletedAt(): JsonField<OffsetDateTime> = playgroundCompletedAt

    /**
     * Returns the raw JSON value of [successViewedAt].
     *
     * Unlike [successViewedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success_viewed_at")
    @ExcludeMissing
    fun _successViewedAt(): JsonField<OffsetDateTime> = successViewedAt

    /**
     * Returns the raw JSON value of [tracingCompletedAt].
     *
     * Unlike [tracingCompletedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tracing_completed_at")
    @ExcludeMissing
    fun _tracingCompletedAt(): JsonField<OffsetDateTime> = tracingCompletedAt

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
         * Returns a mutable builder for constructing an instance of [UserOnboardingStateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .lsUserId()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserOnboardingStateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var lsUserId: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var evaluationCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lgstudioCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var playgroundCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var successViewedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var tracingCompletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userOnboardingStateResponse: UserOnboardingStateResponse) = apply {
            id = userOnboardingStateResponse.id
            createdAt = userOnboardingStateResponse.createdAt
            lsUserId = userOnboardingStateResponse.lsUserId
            updatedAt = userOnboardingStateResponse.updatedAt
            evaluationCompletedAt = userOnboardingStateResponse.evaluationCompletedAt
            lgstudioCompletedAt = userOnboardingStateResponse.lgstudioCompletedAt
            playgroundCompletedAt = userOnboardingStateResponse.playgroundCompletedAt
            successViewedAt = userOnboardingStateResponse.successViewedAt
            tracingCompletedAt = userOnboardingStateResponse.tracingCompletedAt
            additionalProperties = userOnboardingStateResponse.additionalProperties.toMutableMap()
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

        fun lsUserId(lsUserId: String) = lsUserId(JsonField.of(lsUserId))

        /**
         * Sets [Builder.lsUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lsUserId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lsUserId(lsUserId: JsonField<String>) = apply { this.lsUserId = lsUserId }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun evaluationCompletedAt(evaluationCompletedAt: OffsetDateTime?) =
            evaluationCompletedAt(JsonField.ofNullable(evaluationCompletedAt))

        /**
         * Alias for calling [Builder.evaluationCompletedAt] with
         * `evaluationCompletedAt.orElse(null)`.
         */
        fun evaluationCompletedAt(evaluationCompletedAt: Optional<OffsetDateTime>) =
            evaluationCompletedAt(evaluationCompletedAt.getOrNull())

        /**
         * Sets [Builder.evaluationCompletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluationCompletedAt] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun evaluationCompletedAt(evaluationCompletedAt: JsonField<OffsetDateTime>) = apply {
            this.evaluationCompletedAt = evaluationCompletedAt
        }

        fun lgstudioCompletedAt(lgstudioCompletedAt: OffsetDateTime?) =
            lgstudioCompletedAt(JsonField.ofNullable(lgstudioCompletedAt))

        /**
         * Alias for calling [Builder.lgstudioCompletedAt] with `lgstudioCompletedAt.orElse(null)`.
         */
        fun lgstudioCompletedAt(lgstudioCompletedAt: Optional<OffsetDateTime>) =
            lgstudioCompletedAt(lgstudioCompletedAt.getOrNull())

        /**
         * Sets [Builder.lgstudioCompletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lgstudioCompletedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lgstudioCompletedAt(lgstudioCompletedAt: JsonField<OffsetDateTime>) = apply {
            this.lgstudioCompletedAt = lgstudioCompletedAt
        }

        fun playgroundCompletedAt(playgroundCompletedAt: OffsetDateTime?) =
            playgroundCompletedAt(JsonField.ofNullable(playgroundCompletedAt))

        /**
         * Alias for calling [Builder.playgroundCompletedAt] with
         * `playgroundCompletedAt.orElse(null)`.
         */
        fun playgroundCompletedAt(playgroundCompletedAt: Optional<OffsetDateTime>) =
            playgroundCompletedAt(playgroundCompletedAt.getOrNull())

        /**
         * Sets [Builder.playgroundCompletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.playgroundCompletedAt] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun playgroundCompletedAt(playgroundCompletedAt: JsonField<OffsetDateTime>) = apply {
            this.playgroundCompletedAt = playgroundCompletedAt
        }

        fun successViewedAt(successViewedAt: OffsetDateTime?) =
            successViewedAt(JsonField.ofNullable(successViewedAt))

        /** Alias for calling [Builder.successViewedAt] with `successViewedAt.orElse(null)`. */
        fun successViewedAt(successViewedAt: Optional<OffsetDateTime>) =
            successViewedAt(successViewedAt.getOrNull())

        /**
         * Sets [Builder.successViewedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.successViewedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun successViewedAt(successViewedAt: JsonField<OffsetDateTime>) = apply {
            this.successViewedAt = successViewedAt
        }

        fun tracingCompletedAt(tracingCompletedAt: OffsetDateTime?) =
            tracingCompletedAt(JsonField.ofNullable(tracingCompletedAt))

        /**
         * Alias for calling [Builder.tracingCompletedAt] with `tracingCompletedAt.orElse(null)`.
         */
        fun tracingCompletedAt(tracingCompletedAt: Optional<OffsetDateTime>) =
            tracingCompletedAt(tracingCompletedAt.getOrNull())

        /**
         * Sets [Builder.tracingCompletedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tracingCompletedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun tracingCompletedAt(tracingCompletedAt: JsonField<OffsetDateTime>) = apply {
            this.tracingCompletedAt = tracingCompletedAt
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
         * Returns an immutable instance of [UserOnboardingStateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .lsUserId()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserOnboardingStateResponse =
            UserOnboardingStateResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("lsUserId", lsUserId),
                checkRequired("updatedAt", updatedAt),
                evaluationCompletedAt,
                lgstudioCompletedAt,
                playgroundCompletedAt,
                successViewedAt,
                tracingCompletedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserOnboardingStateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        lsUserId()
        updatedAt()
        evaluationCompletedAt()
        lgstudioCompletedAt()
        playgroundCompletedAt()
        successViewedAt()
        tracingCompletedAt()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithInvalidDataException) {
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
            (if (lsUserId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (evaluationCompletedAt.asKnown().isPresent) 1 else 0) +
            (if (lgstudioCompletedAt.asKnown().isPresent) 1 else 0) +
            (if (playgroundCompletedAt.asKnown().isPresent) 1 else 0) +
            (if (successViewedAt.asKnown().isPresent) 1 else 0) +
            (if (tracingCompletedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserOnboardingStateResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            lsUserId == other.lsUserId &&
            updatedAt == other.updatedAt &&
            evaluationCompletedAt == other.evaluationCompletedAt &&
            lgstudioCompletedAt == other.lgstudioCompletedAt &&
            playgroundCompletedAt == other.playgroundCompletedAt &&
            successViewedAt == other.successViewedAt &&
            tracingCompletedAt == other.tracingCompletedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            lsUserId,
            updatedAt,
            evaluationCompletedAt,
            lgstudioCompletedAt,
            playgroundCompletedAt,
            successViewedAt,
            tracingCompletedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserOnboardingStateResponse{id=$id, createdAt=$createdAt, lsUserId=$lsUserId, updatedAt=$updatedAt, evaluationCompletedAt=$evaluationCompletedAt, lgstudioCompletedAt=$lgstudioCompletedAt, playgroundCompletedAt=$playgroundCompletedAt, successViewedAt=$successViewedAt, tracingCompletedAt=$tracingCompletedAt, additionalProperties=$additionalProperties}"
}
