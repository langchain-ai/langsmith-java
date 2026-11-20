// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ItemRetrieveReviewsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val keys: JsonField<List<AnnotationQueueItemKeyReviews>>,
    private val reviewers: JsonField<List<Reviewer>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("keys")
        @ExcludeMissing
        keys: JsonField<List<AnnotationQueueItemKeyReviews>> = JsonMissing.of(),
        @JsonProperty("reviewers")
        @ExcludeMissing
        reviewers: JsonField<List<Reviewer>> = JsonMissing.of(),
    ) : this(keys, reviewers, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keys(): Optional<List<AnnotationQueueItemKeyReviews>> = keys.getOptional("keys")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reviewers(): Optional<List<Reviewer>> = reviewers.getOptional("reviewers")

    /**
     * Returns the raw JSON value of [keys].
     *
     * Unlike [keys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("keys")
    @ExcludeMissing
    fun _keys(): JsonField<List<AnnotationQueueItemKeyReviews>> = keys

    /**
     * Returns the raw JSON value of [reviewers].
     *
     * Unlike [reviewers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reviewers")
    @ExcludeMissing
    fun _reviewers(): JsonField<List<Reviewer>> = reviewers

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
         * Returns a mutable builder for constructing an instance of [ItemRetrieveReviewsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ItemRetrieveReviewsResponse]. */
    class Builder internal constructor() {

        private var keys: JsonField<MutableList<AnnotationQueueItemKeyReviews>>? = null
        private var reviewers: JsonField<MutableList<Reviewer>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(itemRetrieveReviewsResponse: ItemRetrieveReviewsResponse) = apply {
            keys = itemRetrieveReviewsResponse.keys.map { it.toMutableList() }
            reviewers = itemRetrieveReviewsResponse.reviewers.map { it.toMutableList() }
            additionalProperties = itemRetrieveReviewsResponse.additionalProperties.toMutableMap()
        }

        fun keys(keys: List<AnnotationQueueItemKeyReviews>) = keys(JsonField.of(keys))

        /**
         * Sets [Builder.keys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keys] with a well-typed
         * `List<AnnotationQueueItemKeyReviews>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun keys(keys: JsonField<List<AnnotationQueueItemKeyReviews>>) = apply {
            this.keys = keys.map { it.toMutableList() }
        }

        /**
         * Adds a single [AnnotationQueueItemKeyReviews] to [keys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKey(key: AnnotationQueueItemKeyReviews) = apply {
            keys = (keys ?: JsonField.of(mutableListOf())).also { checkKnown("keys", it).add(key) }
        }

        fun reviewers(reviewers: List<Reviewer>) = reviewers(JsonField.of(reviewers))

        /**
         * Sets [Builder.reviewers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewers] with a well-typed `List<Reviewer>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reviewers(reviewers: JsonField<List<Reviewer>>) = apply {
            this.reviewers = reviewers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Reviewer] to [reviewers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReviewer(reviewer: Reviewer) = apply {
            reviewers =
                (reviewers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("reviewers", it).add(reviewer)
                }
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
         * Returns an immutable instance of [ItemRetrieveReviewsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ItemRetrieveReviewsResponse =
            ItemRetrieveReviewsResponse(
                (keys ?: JsonMissing.of()).map { it.toImmutable() },
                (reviewers ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): ItemRetrieveReviewsResponse = apply {
        if (validated) {
            return@apply
        }

        keys().ifPresent { it.forEach { it.validate() } }
        reviewers().ifPresent { it.forEach { it.validate() } }
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
        (keys.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (reviewers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Reviewer
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val completedAt: JsonField<OffsetDateTime>,
        private val email: JsonField<String>,
        private val identityId: JsonField<String>,
        private val lsUserId: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("completed_at")
            @ExcludeMissing
            completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("identity_id")
            @ExcludeMissing
            identityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ls_user_id")
            @ExcludeMissing
            lsUserId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(completedAt, email, identityId, lsUserId, name, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completed_at")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun identityId(): Optional<String> = identityId.getOptional("identity_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lsUserId(): Optional<String> = lsUserId.getOptional("ls_user_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [completedAt].
         *
         * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("completed_at")
        @ExcludeMissing
        fun _completedAt(): JsonField<OffsetDateTime> = completedAt

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
        @JsonProperty("identity_id")
        @ExcludeMissing
        fun _identityId(): JsonField<String> = identityId

        /**
         * Returns the raw JSON value of [lsUserId].
         *
         * Unlike [lsUserId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ls_user_id") @ExcludeMissing fun _lsUserId(): JsonField<String> = lsUserId

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

            /** Returns a mutable builder for constructing an instance of [Reviewer]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Reviewer]. */
        class Builder internal constructor() {

            private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var identityId: JsonField<String> = JsonMissing.of()
            private var lsUserId: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reviewer: Reviewer) = apply {
                completedAt = reviewer.completedAt
                email = reviewer.email
                identityId = reviewer.identityId
                lsUserId = reviewer.lsUserId
                name = reviewer.name
                additionalProperties = reviewer.additionalProperties.toMutableMap()
            }

            fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

            /**
             * Sets [Builder.completedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
                this.completedAt = completedAt
            }

            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun identityId(identityId: String) = identityId(JsonField.of(identityId))

            /**
             * Sets [Builder.identityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identityId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun identityId(identityId: JsonField<String>) = apply { this.identityId = identityId }

            fun lsUserId(lsUserId: String) = lsUserId(JsonField.of(lsUserId))

            /**
             * Sets [Builder.lsUserId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lsUserId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lsUserId(lsUserId: JsonField<String>) = apply { this.lsUserId = lsUserId }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Reviewer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Reviewer =
                Reviewer(
                    completedAt,
                    email,
                    identityId,
                    lsUserId,
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Reviewer = apply {
            if (validated) {
                return@apply
            }

            completedAt()
            email()
            identityId()
            lsUserId()
            name()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (completedAt.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (identityId.asKnown().isPresent) 1 else 0) +
                (if (lsUserId.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reviewer &&
                completedAt == other.completedAt &&
                email == other.email &&
                identityId == other.identityId &&
                lsUserId == other.lsUserId &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(completedAt, email, identityId, lsUserId, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Reviewer{completedAt=$completedAt, email=$email, identityId=$identityId, lsUserId=$lsUserId, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ItemRetrieveReviewsResponse &&
            keys == other.keys &&
            reviewers == other.reviewers &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(keys, reviewers, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ItemRetrieveReviewsResponse{keys=$keys, reviewers=$reviewers, additionalProperties=$additionalProperties}"
}
