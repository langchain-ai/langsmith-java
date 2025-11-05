// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.tags

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

/** Fields for a prompt tag */
class RepoTag
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val commitHash: JsonField<String>,
    private val commitId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val repoId: JsonField<String>,
    private val tagName: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commit_hash")
        @ExcludeMissing
        commitHash: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commit_id") @ExcludeMissing commitId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("repo_id") @ExcludeMissing repoId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tag_name") @ExcludeMissing tagName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, commitHash, commitId, createdAt, repoId, tagName, updatedAt, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun commitHash(): String = commitHash.getRequired("commit_hash")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun commitId(): String = commitId.getRequired("commit_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun repoId(): String = repoId.getRequired("repo_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tagName(): String = tagName.getRequired("tag_name")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [commitHash].
     *
     * Unlike [commitHash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commit_hash") @ExcludeMissing fun _commitHash(): JsonField<String> = commitHash

    /**
     * Returns the raw JSON value of [commitId].
     *
     * Unlike [commitId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commit_id") @ExcludeMissing fun _commitId(): JsonField<String> = commitId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [repoId].
     *
     * Unlike [repoId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("repo_id") @ExcludeMissing fun _repoId(): JsonField<String> = repoId

    /**
     * Returns the raw JSON value of [tagName].
     *
     * Unlike [tagName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tag_name") @ExcludeMissing fun _tagName(): JsonField<String> = tagName

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
         * Returns a mutable builder for constructing an instance of [RepoTag].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .commitHash()
         * .commitId()
         * .createdAt()
         * .repoId()
         * .tagName()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RepoTag]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var commitHash: JsonField<String>? = null
        private var commitId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var repoId: JsonField<String>? = null
        private var tagName: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(repoTag: RepoTag) = apply {
            id = repoTag.id
            commitHash = repoTag.commitHash
            commitId = repoTag.commitId
            createdAt = repoTag.createdAt
            repoId = repoTag.repoId
            tagName = repoTag.tagName
            updatedAt = repoTag.updatedAt
            additionalProperties = repoTag.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun commitHash(commitHash: String) = commitHash(JsonField.of(commitHash))

        /**
         * Sets [Builder.commitHash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commitHash] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commitHash(commitHash: JsonField<String>) = apply { this.commitHash = commitHash }

        fun commitId(commitId: String) = commitId(JsonField.of(commitId))

        /**
         * Sets [Builder.commitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commitId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun commitId(commitId: JsonField<String>) = apply { this.commitId = commitId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun repoId(repoId: String) = repoId(JsonField.of(repoId))

        /**
         * Sets [Builder.repoId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repoId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun repoId(repoId: JsonField<String>) = apply { this.repoId = repoId }

        fun tagName(tagName: String) = tagName(JsonField.of(tagName))

        /**
         * Sets [Builder.tagName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tagName(tagName: JsonField<String>) = apply { this.tagName = tagName }

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
         * Returns an immutable instance of [RepoTag].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .commitHash()
         * .commitId()
         * .createdAt()
         * .repoId()
         * .tagName()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RepoTag =
            RepoTag(
                checkRequired("id", id),
                checkRequired("commitHash", commitHash),
                checkRequired("commitId", commitId),
                checkRequired("createdAt", createdAt),
                checkRequired("repoId", repoId),
                checkRequired("tagName", tagName),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RepoTag = apply {
        if (validated) {
            return@apply
        }

        id()
        commitHash()
        commitId()
        createdAt()
        repoId()
        tagName()
        updatedAt()
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
            (if (commitHash.asKnown().isPresent) 1 else 0) +
            (if (commitId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (repoId.asKnown().isPresent) 1 else 0) +
            (if (tagName.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RepoTag &&
            id == other.id &&
            commitHash == other.commitHash &&
            commitId == other.commitId &&
            createdAt == other.createdAt &&
            repoId == other.repoId &&
            tagName == other.tagName &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            commitHash,
            commitId,
            createdAt,
            repoId,
            tagName,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RepoTag{id=$id, commitHash=$commitHash, commitId=$commitId, createdAt=$createdAt, repoId=$repoId, tagName=$tagName, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
