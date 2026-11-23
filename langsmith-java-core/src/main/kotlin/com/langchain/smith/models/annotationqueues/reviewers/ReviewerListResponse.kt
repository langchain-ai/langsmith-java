// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.reviewers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class ReviewerListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val completedCount: JsonField<Long>,
    private val email: JsonField<String>,
    private val identityId: JsonField<String>,
    private val isOnRoster: JsonField<Boolean>,
    private val lastActiveAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val pendingCount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("completed_count")
        @ExcludeMissing
        completedCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identity_id")
        @ExcludeMissing
        identityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_on_roster")
        @ExcludeMissing
        isOnRoster: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("last_active_at")
        @ExcludeMissing
        lastActiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pending_count")
        @ExcludeMissing
        pendingCount: JsonField<Long> = JsonMissing.of(),
    ) : this(
        completedCount,
        email,
        identityId,
        isOnRoster,
        lastActiveAt,
        name,
        pendingCount,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedCount(): Optional<Long> = completedCount.getOptional("completed_count")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun identityId(): Optional<String> = identityId.getOptional("identity_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isOnRoster(): Optional<Boolean> = isOnRoster.getOptional("is_on_roster")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastActiveAt(): Optional<OffsetDateTime> = lastActiveAt.getOptional("last_active_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pendingCount(): Optional<Long> = pendingCount.getOptional("pending_count")

    /**
     * Returns the raw JSON value of [completedCount].
     *
     * Unlike [completedCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completed_count")
    @ExcludeMissing
    fun _completedCount(): JsonField<Long> = completedCount

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [identityId].
     *
     * Unlike [identityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identity_id") @ExcludeMissing fun _identityId(): JsonField<String> = identityId

    /**
     * Returns the raw JSON value of [isOnRoster].
     *
     * Unlike [isOnRoster], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_on_roster") @ExcludeMissing fun _isOnRoster(): JsonField<Boolean> = isOnRoster

    /**
     * Returns the raw JSON value of [lastActiveAt].
     *
     * Unlike [lastActiveAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_active_at")
    @ExcludeMissing
    fun _lastActiveAt(): JsonField<OffsetDateTime> = lastActiveAt

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [pendingCount].
     *
     * Unlike [pendingCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pending_count")
    @ExcludeMissing
    fun _pendingCount(): JsonField<Long> = pendingCount

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

        /** Returns a mutable builder for constructing an instance of [ReviewerListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReviewerListResponse]. */
    class Builder internal constructor() {

        private var completedCount: JsonField<Long> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var identityId: JsonField<String> = JsonMissing.of()
        private var isOnRoster: JsonField<Boolean> = JsonMissing.of()
        private var lastActiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var pendingCount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reviewerListResponse: ReviewerListResponse) = apply {
            completedCount = reviewerListResponse.completedCount
            email = reviewerListResponse.email
            identityId = reviewerListResponse.identityId
            isOnRoster = reviewerListResponse.isOnRoster
            lastActiveAt = reviewerListResponse.lastActiveAt
            name = reviewerListResponse.name
            pendingCount = reviewerListResponse.pendingCount
            additionalProperties = reviewerListResponse.additionalProperties.toMutableMap()
        }

        fun completedCount(completedCount: Long) = completedCount(JsonField.of(completedCount))

        /**
         * Sets [Builder.completedCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun completedCount(completedCount: JsonField<Long>) = apply {
            this.completedCount = completedCount
        }

        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun identityId(identityId: String) = identityId(JsonField.of(identityId))

        /**
         * Sets [Builder.identityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identityId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun identityId(identityId: JsonField<String>) = apply { this.identityId = identityId }

        fun isOnRoster(isOnRoster: Boolean) = isOnRoster(JsonField.of(isOnRoster))

        /**
         * Sets [Builder.isOnRoster] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isOnRoster] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isOnRoster(isOnRoster: JsonField<Boolean>) = apply { this.isOnRoster = isOnRoster }

        fun lastActiveAt(lastActiveAt: OffsetDateTime) = lastActiveAt(JsonField.of(lastActiveAt))

        /**
         * Sets [Builder.lastActiveAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastActiveAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastActiveAt(lastActiveAt: JsonField<OffsetDateTime>) = apply {
            this.lastActiveAt = lastActiveAt
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun pendingCount(pendingCount: Long) = pendingCount(JsonField.of(pendingCount))

        /**
         * Sets [Builder.pendingCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pendingCount(pendingCount: JsonField<Long>) = apply { this.pendingCount = pendingCount }

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
         * Returns an immutable instance of [ReviewerListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReviewerListResponse =
            ReviewerListResponse(
                completedCount,
                email,
                identityId,
                isOnRoster,
                lastActiveAt,
                name,
                pendingCount,
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
    fun validate(): ReviewerListResponse = apply {
        if (validated) {
            return@apply
        }

        completedCount()
        email()
        identityId()
        isOnRoster()
        lastActiveAt()
        name()
        pendingCount()
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
        (if (completedCount.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (identityId.asKnown().isPresent) 1 else 0) +
            (if (isOnRoster.asKnown().isPresent) 1 else 0) +
            (if (lastActiveAt.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (pendingCount.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReviewerListResponse &&
            completedCount == other.completedCount &&
            email == other.email &&
            identityId == other.identityId &&
            isOnRoster == other.isOnRoster &&
            lastActiveAt == other.lastActiveAt &&
            name == other.name &&
            pendingCount == other.pendingCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            completedCount,
            email,
            identityId,
            isOnRoster,
            lastActiveAt,
            name,
            pendingCount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReviewerListResponse{completedCount=$completedCount, email=$email, identityId=$identityId, isOnRoster=$isOnRoster, lastActiveAt=$lastActiveAt, name=$name, pendingCount=$pendingCount, additionalProperties=$additionalProperties}"
}
