// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.comments

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Comment
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val commentOn: JsonField<String>,
    private val content: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val numLikes: JsonField<Long>,
    private val numSubComments: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val commentBy: JsonField<String>,
    private val commentByName: JsonField<String>,
    private val likedByAuthUser: JsonField<Boolean>,
    private val parentId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comment_on") @ExcludeMissing commentOn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("num_likes") @ExcludeMissing numLikes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("num_sub_comments")
        @ExcludeMissing
        numSubComments: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("comment_by") @ExcludeMissing commentBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comment_by_name")
        @ExcludeMissing
        commentByName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("liked_by_auth_user")
        @ExcludeMissing
        likedByAuthUser: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("parent_id") @ExcludeMissing parentId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        commentOn,
        content,
        createdAt,
        numLikes,
        numSubComments,
        updatedAt,
        commentBy,
        commentByName,
        likedByAuthUser,
        parentId,
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
    fun commentOn(): String = commentOn.getRequired("comment_on")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): String = content.getRequired("content")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numLikes(): Long = numLikes.getRequired("num_likes")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numSubComments(): Long = numSubComments.getRequired("num_sub_comments")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun commentBy(): Optional<String> = commentBy.getOptional("comment_by")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun commentByName(): Optional<String> = commentByName.getOptional("comment_by_name")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun likedByAuthUser(): Optional<Boolean> = likedByAuthUser.getOptional("liked_by_auth_user")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun parentId(): Optional<String> = parentId.getOptional("parent_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [commentOn].
     *
     * Unlike [commentOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comment_on") @ExcludeMissing fun _commentOn(): JsonField<String> = commentOn

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [numLikes].
     *
     * Unlike [numLikes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_likes") @ExcludeMissing fun _numLikes(): JsonField<Long> = numLikes

    /**
     * Returns the raw JSON value of [numSubComments].
     *
     * Unlike [numSubComments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_sub_comments")
    @ExcludeMissing
    fun _numSubComments(): JsonField<Long> = numSubComments

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [commentBy].
     *
     * Unlike [commentBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comment_by") @ExcludeMissing fun _commentBy(): JsonField<String> = commentBy

    /**
     * Returns the raw JSON value of [commentByName].
     *
     * Unlike [commentByName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comment_by_name")
    @ExcludeMissing
    fun _commentByName(): JsonField<String> = commentByName

    /**
     * Returns the raw JSON value of [likedByAuthUser].
     *
     * Unlike [likedByAuthUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("liked_by_auth_user")
    @ExcludeMissing
    fun _likedByAuthUser(): JsonField<Boolean> = likedByAuthUser

    /**
     * Returns the raw JSON value of [parentId].
     *
     * Unlike [parentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parent_id") @ExcludeMissing fun _parentId(): JsonField<String> = parentId

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
         * Returns a mutable builder for constructing an instance of [Comment].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .commentOn()
         * .content()
         * .createdAt()
         * .numLikes()
         * .numSubComments()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Comment]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var commentOn: JsonField<String>? = null
        private var content: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var numLikes: JsonField<Long>? = null
        private var numSubComments: JsonField<Long>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var commentBy: JsonField<String> = JsonMissing.of()
        private var commentByName: JsonField<String> = JsonMissing.of()
        private var likedByAuthUser: JsonField<Boolean> = JsonMissing.of()
        private var parentId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(comment: Comment) = apply {
            id = comment.id
            commentOn = comment.commentOn
            content = comment.content
            createdAt = comment.createdAt
            numLikes = comment.numLikes
            numSubComments = comment.numSubComments
            updatedAt = comment.updatedAt
            commentBy = comment.commentBy
            commentByName = comment.commentByName
            likedByAuthUser = comment.likedByAuthUser
            parentId = comment.parentId
            additionalProperties = comment.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun commentOn(commentOn: String) = commentOn(JsonField.of(commentOn))

        /**
         * Sets [Builder.commentOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commentOn] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commentOn(commentOn: JsonField<String>) = apply { this.commentOn = commentOn }

        fun content(content: String) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<String>) = apply { this.content = content }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun numLikes(numLikes: Long) = numLikes(JsonField.of(numLikes))

        /**
         * Sets [Builder.numLikes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numLikes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numLikes(numLikes: JsonField<Long>) = apply { this.numLikes = numLikes }

        fun numSubComments(numSubComments: Long) = numSubComments(JsonField.of(numSubComments))

        /**
         * Sets [Builder.numSubComments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numSubComments] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numSubComments(numSubComments: JsonField<Long>) = apply {
            this.numSubComments = numSubComments
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

        fun commentBy(commentBy: String?) = commentBy(JsonField.ofNullable(commentBy))

        /** Alias for calling [Builder.commentBy] with `commentBy.orElse(null)`. */
        fun commentBy(commentBy: Optional<String>) = commentBy(commentBy.getOrNull())

        /**
         * Sets [Builder.commentBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commentBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commentBy(commentBy: JsonField<String>) = apply { this.commentBy = commentBy }

        fun commentByName(commentByName: String?) =
            commentByName(JsonField.ofNullable(commentByName))

        /** Alias for calling [Builder.commentByName] with `commentByName.orElse(null)`. */
        fun commentByName(commentByName: Optional<String>) =
            commentByName(commentByName.getOrNull())

        /**
         * Sets [Builder.commentByName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commentByName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commentByName(commentByName: JsonField<String>) = apply {
            this.commentByName = commentByName
        }

        fun likedByAuthUser(likedByAuthUser: Boolean?) =
            likedByAuthUser(JsonField.ofNullable(likedByAuthUser))

        /**
         * Alias for [Builder.likedByAuthUser].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun likedByAuthUser(likedByAuthUser: Boolean) = likedByAuthUser(likedByAuthUser as Boolean?)

        /** Alias for calling [Builder.likedByAuthUser] with `likedByAuthUser.orElse(null)`. */
        fun likedByAuthUser(likedByAuthUser: Optional<Boolean>) =
            likedByAuthUser(likedByAuthUser.getOrNull())

        /**
         * Sets [Builder.likedByAuthUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.likedByAuthUser] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun likedByAuthUser(likedByAuthUser: JsonField<Boolean>) = apply {
            this.likedByAuthUser = likedByAuthUser
        }

        fun parentId(parentId: String?) = parentId(JsonField.ofNullable(parentId))

        /** Alias for calling [Builder.parentId] with `parentId.orElse(null)`. */
        fun parentId(parentId: Optional<String>) = parentId(parentId.getOrNull())

        /**
         * Sets [Builder.parentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun parentId(parentId: JsonField<String>) = apply { this.parentId = parentId }

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
         * Returns an immutable instance of [Comment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .commentOn()
         * .content()
         * .createdAt()
         * .numLikes()
         * .numSubComments()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Comment =
            Comment(
                checkRequired("id", id),
                checkRequired("commentOn", commentOn),
                checkRequired("content", content),
                checkRequired("createdAt", createdAt),
                checkRequired("numLikes", numLikes),
                checkRequired("numSubComments", numSubComments),
                checkRequired("updatedAt", updatedAt),
                commentBy,
                commentByName,
                likedByAuthUser,
                parentId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Comment = apply {
        if (validated) {
            return@apply
        }

        id()
        commentOn()
        content()
        createdAt()
        numLikes()
        numSubComments()
        updatedAt()
        commentBy()
        commentByName()
        likedByAuthUser()
        parentId()
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
            (if (commentOn.asKnown().isPresent) 1 else 0) +
            (if (content.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (numLikes.asKnown().isPresent) 1 else 0) +
            (if (numSubComments.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (commentBy.asKnown().isPresent) 1 else 0) +
            (if (commentByName.asKnown().isPresent) 1 else 0) +
            (if (likedByAuthUser.asKnown().isPresent) 1 else 0) +
            (if (parentId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Comment &&
            id == other.id &&
            commentOn == other.commentOn &&
            content == other.content &&
            createdAt == other.createdAt &&
            numLikes == other.numLikes &&
            numSubComments == other.numSubComments &&
            updatedAt == other.updatedAt &&
            commentBy == other.commentBy &&
            commentByName == other.commentByName &&
            likedByAuthUser == other.likedByAuthUser &&
            parentId == other.parentId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            commentOn,
            content,
            createdAt,
            numLikes,
            numSubComments,
            updatedAt,
            commentBy,
            commentByName,
            likedByAuthUser,
            parentId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Comment{id=$id, commentOn=$commentOn, content=$content, createdAt=$createdAt, numLikes=$numLikes, numSubComments=$numSubComments, updatedAt=$updatedAt, commentBy=$commentBy, commentByName=$commentByName, likedByAuthUser=$likedByAuthUser, parentId=$parentId, additionalProperties=$additionalProperties}"
}
