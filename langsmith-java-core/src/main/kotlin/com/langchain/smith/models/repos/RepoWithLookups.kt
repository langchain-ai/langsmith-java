// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.commits.CommitManifestResponse
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** All database fields for repos, plus helpful computed fields. */
class RepoWithLookups
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val fullName: JsonField<String>,
    private val isArchived: JsonField<Boolean>,
    private val isPublic: JsonField<Boolean>,
    private val numCommits: JsonField<Long>,
    private val numDownloads: JsonField<Long>,
    private val numLikes: JsonField<Long>,
    private val numViews: JsonField<Long>,
    private val owner: JsonField<String>,
    private val repoHandle: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val tenantId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val description: JsonField<String>,
    private val lastCommitHash: JsonField<String>,
    private val latestCommitManifest: JsonField<CommitManifestResponse>,
    private val likedByAuthUser: JsonField<Boolean>,
    private val originalRepoFullName: JsonField<String>,
    private val originalRepoId: JsonField<String>,
    private val readme: JsonField<String>,
    private val upstreamRepoFullName: JsonField<String>,
    private val upstreamRepoId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("full_name") @ExcludeMissing fullName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_archived")
        @ExcludeMissing
        isArchived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_public") @ExcludeMissing isPublic: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("num_commits") @ExcludeMissing numCommits: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("num_downloads")
        @ExcludeMissing
        numDownloads: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("num_likes") @ExcludeMissing numLikes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("num_views") @ExcludeMissing numViews: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("owner") @ExcludeMissing owner: JsonField<String> = JsonMissing.of(),
        @JsonProperty("repo_handle")
        @ExcludeMissing
        repoHandle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_commit_hash")
        @ExcludeMissing
        lastCommitHash: JsonField<String> = JsonMissing.of(),
        @JsonProperty("latest_commit_manifest")
        @ExcludeMissing
        latestCommitManifest: JsonField<CommitManifestResponse> = JsonMissing.of(),
        @JsonProperty("liked_by_auth_user")
        @ExcludeMissing
        likedByAuthUser: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("original_repo_full_name")
        @ExcludeMissing
        originalRepoFullName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("original_repo_id")
        @ExcludeMissing
        originalRepoId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("readme") @ExcludeMissing readme: JsonField<String> = JsonMissing.of(),
        @JsonProperty("upstream_repo_full_name")
        @ExcludeMissing
        upstreamRepoFullName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("upstream_repo_id")
        @ExcludeMissing
        upstreamRepoId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        fullName,
        isArchived,
        isPublic,
        numCommits,
        numDownloads,
        numLikes,
        numViews,
        owner,
        repoHandle,
        tags,
        tenantId,
        updatedAt,
        createdBy,
        description,
        lastCommitHash,
        latestCommitManifest,
        likedByAuthUser,
        originalRepoFullName,
        originalRepoId,
        readme,
        upstreamRepoFullName,
        upstreamRepoId,
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
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fullName(): String = fullName.getRequired("full_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isArchived(): Boolean = isArchived.getRequired("is_archived")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPublic(): Boolean = isPublic.getRequired("is_public")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numCommits(): Long = numCommits.getRequired("num_commits")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numDownloads(): Long = numDownloads.getRequired("num_downloads")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numLikes(): Long = numLikes.getRequired("num_likes")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numViews(): Long = numViews.getRequired("num_views")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun owner(): Optional<String> = owner.getOptional("owner")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun repoHandle(): String = repoHandle.getRequired("repo_handle")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tags(): List<String> = tags.getRequired("tags")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("created_by")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastCommitHash(): Optional<String> = lastCommitHash.getOptional("last_commit_hash")

    /**
     * Response model for get_commit_manifest.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestCommitManifest(): Optional<CommitManifestResponse> =
        latestCommitManifest.getOptional("latest_commit_manifest")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun likedByAuthUser(): Optional<Boolean> = likedByAuthUser.getOptional("liked_by_auth_user")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originalRepoFullName(): Optional<String> =
        originalRepoFullName.getOptional("original_repo_full_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originalRepoId(): Optional<String> = originalRepoId.getOptional("original_repo_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readme(): Optional<String> = readme.getOptional("readme")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun upstreamRepoFullName(): Optional<String> =
        upstreamRepoFullName.getOptional("upstream_repo_full_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun upstreamRepoId(): Optional<String> = upstreamRepoId.getOptional("upstream_repo_id")

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
     * Returns the raw JSON value of [fullName].
     *
     * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("full_name") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

    /**
     * Returns the raw JSON value of [isArchived].
     *
     * Unlike [isArchived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_archived") @ExcludeMissing fun _isArchived(): JsonField<Boolean> = isArchived

    /**
     * Returns the raw JSON value of [isPublic].
     *
     * Unlike [isPublic], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_public") @ExcludeMissing fun _isPublic(): JsonField<Boolean> = isPublic

    /**
     * Returns the raw JSON value of [numCommits].
     *
     * Unlike [numCommits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_commits") @ExcludeMissing fun _numCommits(): JsonField<Long> = numCommits

    /**
     * Returns the raw JSON value of [numDownloads].
     *
     * Unlike [numDownloads], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_downloads")
    @ExcludeMissing
    fun _numDownloads(): JsonField<Long> = numDownloads

    /**
     * Returns the raw JSON value of [numLikes].
     *
     * Unlike [numLikes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_likes") @ExcludeMissing fun _numLikes(): JsonField<Long> = numLikes

    /**
     * Returns the raw JSON value of [numViews].
     *
     * Unlike [numViews], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_views") @ExcludeMissing fun _numViews(): JsonField<Long> = numViews

    /**
     * Returns the raw JSON value of [owner].
     *
     * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

    /**
     * Returns the raw JSON value of [repoHandle].
     *
     * Unlike [repoHandle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("repo_handle") @ExcludeMissing fun _repoHandle(): JsonField<String> = repoHandle

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [lastCommitHash].
     *
     * Unlike [lastCommitHash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_commit_hash")
    @ExcludeMissing
    fun _lastCommitHash(): JsonField<String> = lastCommitHash

    /**
     * Returns the raw JSON value of [latestCommitManifest].
     *
     * Unlike [latestCommitManifest], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("latest_commit_manifest")
    @ExcludeMissing
    fun _latestCommitManifest(): JsonField<CommitManifestResponse> = latestCommitManifest

    /**
     * Returns the raw JSON value of [likedByAuthUser].
     *
     * Unlike [likedByAuthUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("liked_by_auth_user")
    @ExcludeMissing
    fun _likedByAuthUser(): JsonField<Boolean> = likedByAuthUser

    /**
     * Returns the raw JSON value of [originalRepoFullName].
     *
     * Unlike [originalRepoFullName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("original_repo_full_name")
    @ExcludeMissing
    fun _originalRepoFullName(): JsonField<String> = originalRepoFullName

    /**
     * Returns the raw JSON value of [originalRepoId].
     *
     * Unlike [originalRepoId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("original_repo_id")
    @ExcludeMissing
    fun _originalRepoId(): JsonField<String> = originalRepoId

    /**
     * Returns the raw JSON value of [readme].
     *
     * Unlike [readme], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readme") @ExcludeMissing fun _readme(): JsonField<String> = readme

    /**
     * Returns the raw JSON value of [upstreamRepoFullName].
     *
     * Unlike [upstreamRepoFullName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("upstream_repo_full_name")
    @ExcludeMissing
    fun _upstreamRepoFullName(): JsonField<String> = upstreamRepoFullName

    /**
     * Returns the raw JSON value of [upstreamRepoId].
     *
     * Unlike [upstreamRepoId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upstream_repo_id")
    @ExcludeMissing
    fun _upstreamRepoId(): JsonField<String> = upstreamRepoId

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
         * Returns a mutable builder for constructing an instance of [RepoWithLookups].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .fullName()
         * .isArchived()
         * .isPublic()
         * .numCommits()
         * .numDownloads()
         * .numLikes()
         * .numViews()
         * .owner()
         * .repoHandle()
         * .tags()
         * .tenantId()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RepoWithLookups]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var fullName: JsonField<String>? = null
        private var isArchived: JsonField<Boolean>? = null
        private var isPublic: JsonField<Boolean>? = null
        private var numCommits: JsonField<Long>? = null
        private var numDownloads: JsonField<Long>? = null
        private var numLikes: JsonField<Long>? = null
        private var numViews: JsonField<Long>? = null
        private var owner: JsonField<String>? = null
        private var repoHandle: JsonField<String>? = null
        private var tags: JsonField<MutableList<String>>? = null
        private var tenantId: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var lastCommitHash: JsonField<String> = JsonMissing.of()
        private var latestCommitManifest: JsonField<CommitManifestResponse> = JsonMissing.of()
        private var likedByAuthUser: JsonField<Boolean> = JsonMissing.of()
        private var originalRepoFullName: JsonField<String> = JsonMissing.of()
        private var originalRepoId: JsonField<String> = JsonMissing.of()
        private var readme: JsonField<String> = JsonMissing.of()
        private var upstreamRepoFullName: JsonField<String> = JsonMissing.of()
        private var upstreamRepoId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(repoWithLookups: RepoWithLookups) = apply {
            id = repoWithLookups.id
            createdAt = repoWithLookups.createdAt
            fullName = repoWithLookups.fullName
            isArchived = repoWithLookups.isArchived
            isPublic = repoWithLookups.isPublic
            numCommits = repoWithLookups.numCommits
            numDownloads = repoWithLookups.numDownloads
            numLikes = repoWithLookups.numLikes
            numViews = repoWithLookups.numViews
            owner = repoWithLookups.owner
            repoHandle = repoWithLookups.repoHandle
            tags = repoWithLookups.tags.map { it.toMutableList() }
            tenantId = repoWithLookups.tenantId
            updatedAt = repoWithLookups.updatedAt
            createdBy = repoWithLookups.createdBy
            description = repoWithLookups.description
            lastCommitHash = repoWithLookups.lastCommitHash
            latestCommitManifest = repoWithLookups.latestCommitManifest
            likedByAuthUser = repoWithLookups.likedByAuthUser
            originalRepoFullName = repoWithLookups.originalRepoFullName
            originalRepoId = repoWithLookups.originalRepoId
            readme = repoWithLookups.readme
            upstreamRepoFullName = repoWithLookups.upstreamRepoFullName
            upstreamRepoId = repoWithLookups.upstreamRepoId
            additionalProperties = repoWithLookups.additionalProperties.toMutableMap()
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

        fun fullName(fullName: String) = fullName(JsonField.of(fullName))

        /**
         * Sets [Builder.fullName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

        fun isArchived(isArchived: Boolean) = isArchived(JsonField.of(isArchived))

        /**
         * Sets [Builder.isArchived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isArchived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isArchived(isArchived: JsonField<Boolean>) = apply { this.isArchived = isArchived }

        fun isPublic(isPublic: Boolean) = isPublic(JsonField.of(isPublic))

        /**
         * Sets [Builder.isPublic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPublic] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPublic(isPublic: JsonField<Boolean>) = apply { this.isPublic = isPublic }

        fun numCommits(numCommits: Long) = numCommits(JsonField.of(numCommits))

        /**
         * Sets [Builder.numCommits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numCommits] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numCommits(numCommits: JsonField<Long>) = apply { this.numCommits = numCommits }

        fun numDownloads(numDownloads: Long) = numDownloads(JsonField.of(numDownloads))

        /**
         * Sets [Builder.numDownloads] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numDownloads] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numDownloads(numDownloads: JsonField<Long>) = apply { this.numDownloads = numDownloads }

        fun numLikes(numLikes: Long) = numLikes(JsonField.of(numLikes))

        /**
         * Sets [Builder.numLikes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numLikes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numLikes(numLikes: JsonField<Long>) = apply { this.numLikes = numLikes }

        fun numViews(numViews: Long) = numViews(JsonField.of(numViews))

        /**
         * Sets [Builder.numViews] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numViews] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numViews(numViews: JsonField<Long>) = apply { this.numViews = numViews }

        fun owner(owner: String?) = owner(JsonField.ofNullable(owner))

        /** Alias for calling [Builder.owner] with `owner.orElse(null)`. */
        fun owner(owner: Optional<String>) = owner(owner.getOrNull())

        /**
         * Sets [Builder.owner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.owner] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun owner(owner: JsonField<String>) = apply { this.owner = owner }

        fun repoHandle(repoHandle: String) = repoHandle(JsonField.of(repoHandle))

        /**
         * Sets [Builder.repoHandle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repoHandle] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun repoHandle(repoHandle: JsonField<String>) = apply { this.repoHandle = repoHandle }

        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun createdBy(createdBy: String?) = createdBy(JsonField.ofNullable(createdBy))

        /** Alias for calling [Builder.createdBy] with `createdBy.orElse(null)`. */
        fun createdBy(createdBy: Optional<String>) = createdBy(createdBy.getOrNull())

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

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

        fun lastCommitHash(lastCommitHash: String?) =
            lastCommitHash(JsonField.ofNullable(lastCommitHash))

        /** Alias for calling [Builder.lastCommitHash] with `lastCommitHash.orElse(null)`. */
        fun lastCommitHash(lastCommitHash: Optional<String>) =
            lastCommitHash(lastCommitHash.getOrNull())

        /**
         * Sets [Builder.lastCommitHash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastCommitHash] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastCommitHash(lastCommitHash: JsonField<String>) = apply {
            this.lastCommitHash = lastCommitHash
        }

        /** Response model for get_commit_manifest. */
        fun latestCommitManifest(latestCommitManifest: CommitManifestResponse?) =
            latestCommitManifest(JsonField.ofNullable(latestCommitManifest))

        /**
         * Alias for calling [Builder.latestCommitManifest] with
         * `latestCommitManifest.orElse(null)`.
         */
        fun latestCommitManifest(latestCommitManifest: Optional<CommitManifestResponse>) =
            latestCommitManifest(latestCommitManifest.getOrNull())

        /**
         * Sets [Builder.latestCommitManifest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestCommitManifest] with a well-typed
         * [CommitManifestResponse] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun latestCommitManifest(latestCommitManifest: JsonField<CommitManifestResponse>) = apply {
            this.latestCommitManifest = latestCommitManifest
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

        fun originalRepoFullName(originalRepoFullName: String?) =
            originalRepoFullName(JsonField.ofNullable(originalRepoFullName))

        /**
         * Alias for calling [Builder.originalRepoFullName] with
         * `originalRepoFullName.orElse(null)`.
         */
        fun originalRepoFullName(originalRepoFullName: Optional<String>) =
            originalRepoFullName(originalRepoFullName.getOrNull())

        /**
         * Sets [Builder.originalRepoFullName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originalRepoFullName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originalRepoFullName(originalRepoFullName: JsonField<String>) = apply {
            this.originalRepoFullName = originalRepoFullName
        }

        fun originalRepoId(originalRepoId: String?) =
            originalRepoId(JsonField.ofNullable(originalRepoId))

        /** Alias for calling [Builder.originalRepoId] with `originalRepoId.orElse(null)`. */
        fun originalRepoId(originalRepoId: Optional<String>) =
            originalRepoId(originalRepoId.getOrNull())

        /**
         * Sets [Builder.originalRepoId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originalRepoId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originalRepoId(originalRepoId: JsonField<String>) = apply {
            this.originalRepoId = originalRepoId
        }

        fun readme(readme: String?) = readme(JsonField.ofNullable(readme))

        /** Alias for calling [Builder.readme] with `readme.orElse(null)`. */
        fun readme(readme: Optional<String>) = readme(readme.getOrNull())

        /**
         * Sets [Builder.readme] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readme] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun readme(readme: JsonField<String>) = apply { this.readme = readme }

        fun upstreamRepoFullName(upstreamRepoFullName: String?) =
            upstreamRepoFullName(JsonField.ofNullable(upstreamRepoFullName))

        /**
         * Alias for calling [Builder.upstreamRepoFullName] with
         * `upstreamRepoFullName.orElse(null)`.
         */
        fun upstreamRepoFullName(upstreamRepoFullName: Optional<String>) =
            upstreamRepoFullName(upstreamRepoFullName.getOrNull())

        /**
         * Sets [Builder.upstreamRepoFullName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upstreamRepoFullName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun upstreamRepoFullName(upstreamRepoFullName: JsonField<String>) = apply {
            this.upstreamRepoFullName = upstreamRepoFullName
        }

        fun upstreamRepoId(upstreamRepoId: String?) =
            upstreamRepoId(JsonField.ofNullable(upstreamRepoId))

        /** Alias for calling [Builder.upstreamRepoId] with `upstreamRepoId.orElse(null)`. */
        fun upstreamRepoId(upstreamRepoId: Optional<String>) =
            upstreamRepoId(upstreamRepoId.getOrNull())

        /**
         * Sets [Builder.upstreamRepoId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upstreamRepoId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun upstreamRepoId(upstreamRepoId: JsonField<String>) = apply {
            this.upstreamRepoId = upstreamRepoId
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
         * Returns an immutable instance of [RepoWithLookups].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .fullName()
         * .isArchived()
         * .isPublic()
         * .numCommits()
         * .numDownloads()
         * .numLikes()
         * .numViews()
         * .owner()
         * .repoHandle()
         * .tags()
         * .tenantId()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RepoWithLookups =
            RepoWithLookups(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("fullName", fullName),
                checkRequired("isArchived", isArchived),
                checkRequired("isPublic", isPublic),
                checkRequired("numCommits", numCommits),
                checkRequired("numDownloads", numDownloads),
                checkRequired("numLikes", numLikes),
                checkRequired("numViews", numViews),
                checkRequired("owner", owner),
                checkRequired("repoHandle", repoHandle),
                checkRequired("tags", tags).map { it.toImmutable() },
                checkRequired("tenantId", tenantId),
                checkRequired("updatedAt", updatedAt),
                createdBy,
                description,
                lastCommitHash,
                latestCommitManifest,
                likedByAuthUser,
                originalRepoFullName,
                originalRepoId,
                readme,
                upstreamRepoFullName,
                upstreamRepoId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RepoWithLookups = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        fullName()
        isArchived()
        isPublic()
        numCommits()
        numDownloads()
        numLikes()
        numViews()
        owner()
        repoHandle()
        tags()
        tenantId()
        updatedAt()
        createdBy()
        description()
        lastCommitHash()
        latestCommitManifest().ifPresent { it.validate() }
        likedByAuthUser()
        originalRepoFullName()
        originalRepoId()
        readme()
        upstreamRepoFullName()
        upstreamRepoId()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (fullName.asKnown().isPresent) 1 else 0) +
            (if (isArchived.asKnown().isPresent) 1 else 0) +
            (if (isPublic.asKnown().isPresent) 1 else 0) +
            (if (numCommits.asKnown().isPresent) 1 else 0) +
            (if (numDownloads.asKnown().isPresent) 1 else 0) +
            (if (numLikes.asKnown().isPresent) 1 else 0) +
            (if (numViews.asKnown().isPresent) 1 else 0) +
            (if (owner.asKnown().isPresent) 1 else 0) +
            (if (repoHandle.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (lastCommitHash.asKnown().isPresent) 1 else 0) +
            (latestCommitManifest.asKnown().getOrNull()?.validity() ?: 0) +
            (if (likedByAuthUser.asKnown().isPresent) 1 else 0) +
            (if (originalRepoFullName.asKnown().isPresent) 1 else 0) +
            (if (originalRepoId.asKnown().isPresent) 1 else 0) +
            (if (readme.asKnown().isPresent) 1 else 0) +
            (if (upstreamRepoFullName.asKnown().isPresent) 1 else 0) +
            (if (upstreamRepoId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RepoWithLookups &&
            id == other.id &&
            createdAt == other.createdAt &&
            fullName == other.fullName &&
            isArchived == other.isArchived &&
            isPublic == other.isPublic &&
            numCommits == other.numCommits &&
            numDownloads == other.numDownloads &&
            numLikes == other.numLikes &&
            numViews == other.numViews &&
            owner == other.owner &&
            repoHandle == other.repoHandle &&
            tags == other.tags &&
            tenantId == other.tenantId &&
            updatedAt == other.updatedAt &&
            createdBy == other.createdBy &&
            description == other.description &&
            lastCommitHash == other.lastCommitHash &&
            latestCommitManifest == other.latestCommitManifest &&
            likedByAuthUser == other.likedByAuthUser &&
            originalRepoFullName == other.originalRepoFullName &&
            originalRepoId == other.originalRepoId &&
            readme == other.readme &&
            upstreamRepoFullName == other.upstreamRepoFullName &&
            upstreamRepoId == other.upstreamRepoId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            fullName,
            isArchived,
            isPublic,
            numCommits,
            numDownloads,
            numLikes,
            numViews,
            owner,
            repoHandle,
            tags,
            tenantId,
            updatedAt,
            createdBy,
            description,
            lastCommitHash,
            latestCommitManifest,
            likedByAuthUser,
            originalRepoFullName,
            originalRepoId,
            readme,
            upstreamRepoFullName,
            upstreamRepoId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RepoWithLookups{id=$id, createdAt=$createdAt, fullName=$fullName, isArchived=$isArchived, isPublic=$isPublic, numCommits=$numCommits, numDownloads=$numDownloads, numLikes=$numLikes, numViews=$numViews, owner=$owner, repoHandle=$repoHandle, tags=$tags, tenantId=$tenantId, updatedAt=$updatedAt, createdBy=$createdBy, description=$description, lastCommitHash=$lastCommitHash, latestCommitManifest=$latestCommitManifest, likedByAuthUser=$likedByAuthUser, originalRepoFullName=$originalRepoFullName, originalRepoId=$originalRepoId, readme=$readme, upstreamRepoFullName=$upstreamRepoFullName, upstreamRepoId=$upstreamRepoId, additionalProperties=$additionalProperties}"
}
