// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

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

class CommitWithLookups
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val commitHash: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val exampleRunIds: JsonField<List<String>>,
    private val fullName: JsonField<String>,
    private val manifest: JsonValue,
    private val manifestSha: JsonField<List<Long>>,
    private val numDownloads: JsonField<Long>,
    private val numViews: JsonField<Long>,
    private val parentCommitHash: JsonField<String>,
    private val parentId: JsonField<String>,
    private val repoId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commit_hash")
        @ExcludeMissing
        commitHash: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("example_run_ids")
        @ExcludeMissing
        exampleRunIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("full_name") @ExcludeMissing fullName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("manifest") @ExcludeMissing manifest: JsonValue = JsonMissing.of(),
        @JsonProperty("manifest_sha")
        @ExcludeMissing
        manifestSha: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("num_downloads")
        @ExcludeMissing
        numDownloads: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("num_views") @ExcludeMissing numViews: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("parent_commit_hash")
        @ExcludeMissing
        parentCommitHash: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parent_id") @ExcludeMissing parentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("repo_id") @ExcludeMissing repoId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        commitHash,
        createdAt,
        exampleRunIds,
        fullName,
        manifest,
        manifestSha,
        numDownloads,
        numViews,
        parentCommitHash,
        parentId,
        repoId,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * The commit ID
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The hash of the commit
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitHash(): Optional<String> = commitHash.getOptional("commit_hash")

    /**
     * When the commit was created
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Example run IDs associated with the commit
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exampleRunIds(): Optional<List<String>> = exampleRunIds.getOptional("example_run_ids")

    /**
     * Author's full name
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fullName(): Optional<String> = fullName.getOptional("full_name")

    /**
     * The manifest of the commit
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = commitWithLookups.manifest().convert(MyClass.class);
     * ```
     */
    @JsonProperty("manifest") @ExcludeMissing fun _manifest(): JsonValue = manifest

    /**
     * The SHA of the manifest
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun manifestSha(): Optional<List<Long>> = manifestSha.getOptional("manifest_sha")

    /**
     * Number of API downloads
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numDownloads(): Optional<Long> = numDownloads.getOptional("num_downloads")

    /**
     * Number of web views
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numViews(): Optional<Long> = numViews.getOptional("num_views")

    /**
     * The hash of the parent commit
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentCommitHash(): Optional<String> = parentCommitHash.getOptional("parent_commit_hash")

    /**
     * The ID of the parent commit
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentId(): Optional<String> = parentId.getOptional("parent_id")

    /**
     * Repository ID
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun repoId(): Optional<String> = repoId.getOptional("repo_id")

    /**
     * When the commit was last updated
     *
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
     * Returns the raw JSON value of [commitHash].
     *
     * Unlike [commitHash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commit_hash") @ExcludeMissing fun _commitHash(): JsonField<String> = commitHash

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [exampleRunIds].
     *
     * Unlike [exampleRunIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("example_run_ids")
    @ExcludeMissing
    fun _exampleRunIds(): JsonField<List<String>> = exampleRunIds

    /**
     * Returns the raw JSON value of [fullName].
     *
     * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("full_name") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

    /**
     * Returns the raw JSON value of [manifestSha].
     *
     * Unlike [manifestSha], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("manifest_sha")
    @ExcludeMissing
    fun _manifestSha(): JsonField<List<Long>> = manifestSha

    /**
     * Returns the raw JSON value of [numDownloads].
     *
     * Unlike [numDownloads], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_downloads")
    @ExcludeMissing
    fun _numDownloads(): JsonField<Long> = numDownloads

    /**
     * Returns the raw JSON value of [numViews].
     *
     * Unlike [numViews], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_views") @ExcludeMissing fun _numViews(): JsonField<Long> = numViews

    /**
     * Returns the raw JSON value of [parentCommitHash].
     *
     * Unlike [parentCommitHash], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("parent_commit_hash")
    @ExcludeMissing
    fun _parentCommitHash(): JsonField<String> = parentCommitHash

    /**
     * Returns the raw JSON value of [parentId].
     *
     * Unlike [parentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parent_id") @ExcludeMissing fun _parentId(): JsonField<String> = parentId

    /**
     * Returns the raw JSON value of [repoId].
     *
     * Unlike [repoId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("repo_id") @ExcludeMissing fun _repoId(): JsonField<String> = repoId

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

        /** Returns a mutable builder for constructing an instance of [CommitWithLookups]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitWithLookups]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var commitHash: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var exampleRunIds: JsonField<MutableList<String>>? = null
        private var fullName: JsonField<String> = JsonMissing.of()
        private var manifest: JsonValue = JsonMissing.of()
        private var manifestSha: JsonField<MutableList<Long>>? = null
        private var numDownloads: JsonField<Long> = JsonMissing.of()
        private var numViews: JsonField<Long> = JsonMissing.of()
        private var parentCommitHash: JsonField<String> = JsonMissing.of()
        private var parentId: JsonField<String> = JsonMissing.of()
        private var repoId: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commitWithLookups: CommitWithLookups) = apply {
            id = commitWithLookups.id
            commitHash = commitWithLookups.commitHash
            createdAt = commitWithLookups.createdAt
            exampleRunIds = commitWithLookups.exampleRunIds.map { it.toMutableList() }
            fullName = commitWithLookups.fullName
            manifest = commitWithLookups.manifest
            manifestSha = commitWithLookups.manifestSha.map { it.toMutableList() }
            numDownloads = commitWithLookups.numDownloads
            numViews = commitWithLookups.numViews
            parentCommitHash = commitWithLookups.parentCommitHash
            parentId = commitWithLookups.parentId
            repoId = commitWithLookups.repoId
            updatedAt = commitWithLookups.updatedAt
            additionalProperties = commitWithLookups.additionalProperties.toMutableMap()
        }

        /** The commit ID */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The hash of the commit */
        fun commitHash(commitHash: String) = commitHash(JsonField.of(commitHash))

        /**
         * Sets [Builder.commitHash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commitHash] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commitHash(commitHash: JsonField<String>) = apply { this.commitHash = commitHash }

        /** When the commit was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Example run IDs associated with the commit */
        fun exampleRunIds(exampleRunIds: List<String>) = exampleRunIds(JsonField.of(exampleRunIds))

        /**
         * Sets [Builder.exampleRunIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exampleRunIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exampleRunIds(exampleRunIds: JsonField<List<String>>) = apply {
            this.exampleRunIds = exampleRunIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [exampleRunIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExampleRunId(exampleRunId: String) = apply {
            exampleRunIds =
                (exampleRunIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("exampleRunIds", it).add(exampleRunId)
                }
        }

        /** Author's full name */
        fun fullName(fullName: String) = fullName(JsonField.of(fullName))

        /**
         * Sets [Builder.fullName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

        /** The manifest of the commit */
        fun manifest(manifest: JsonValue) = apply { this.manifest = manifest }

        /** The SHA of the manifest */
        fun manifestSha(manifestSha: List<Long>) = manifestSha(JsonField.of(manifestSha))

        /**
         * Sets [Builder.manifestSha] to an arbitrary JSON value.
         *
         * You should usually call [Builder.manifestSha] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun manifestSha(manifestSha: JsonField<List<Long>>) = apply {
            this.manifestSha = manifestSha.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [Builder.manifestSha].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addManifestSha(manifestSha: Long) = apply {
            this.manifestSha =
                (this.manifestSha ?: JsonField.of(mutableListOf())).also {
                    checkKnown("manifestSha", it).add(manifestSha)
                }
        }

        /** Number of API downloads */
        fun numDownloads(numDownloads: Long) = numDownloads(JsonField.of(numDownloads))

        /**
         * Sets [Builder.numDownloads] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numDownloads] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numDownloads(numDownloads: JsonField<Long>) = apply { this.numDownloads = numDownloads }

        /** Number of web views */
        fun numViews(numViews: Long) = numViews(JsonField.of(numViews))

        /**
         * Sets [Builder.numViews] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numViews] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numViews(numViews: JsonField<Long>) = apply { this.numViews = numViews }

        /** The hash of the parent commit */
        fun parentCommitHash(parentCommitHash: String) =
            parentCommitHash(JsonField.of(parentCommitHash))

        /**
         * Sets [Builder.parentCommitHash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentCommitHash] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parentCommitHash(parentCommitHash: JsonField<String>) = apply {
            this.parentCommitHash = parentCommitHash
        }

        /** The ID of the parent commit */
        fun parentId(parentId: String) = parentId(JsonField.of(parentId))

        /**
         * Sets [Builder.parentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun parentId(parentId: JsonField<String>) = apply { this.parentId = parentId }

        /** Repository ID */
        fun repoId(repoId: String) = repoId(JsonField.of(repoId))

        /**
         * Sets [Builder.repoId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repoId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun repoId(repoId: JsonField<String>) = apply { this.repoId = repoId }

        /** When the commit was last updated */
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
         * Returns an immutable instance of [CommitWithLookups].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CommitWithLookups =
            CommitWithLookups(
                id,
                commitHash,
                createdAt,
                (exampleRunIds ?: JsonMissing.of()).map { it.toImmutable() },
                fullName,
                manifest,
                (manifestSha ?: JsonMissing.of()).map { it.toImmutable() },
                numDownloads,
                numViews,
                parentCommitHash,
                parentId,
                repoId,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CommitWithLookups = apply {
        if (validated) {
            return@apply
        }

        id()
        commitHash()
        createdAt()
        exampleRunIds()
        fullName()
        manifestSha()
        numDownloads()
        numViews()
        parentCommitHash()
        parentId()
        repoId()
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
            (if (commitHash.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (exampleRunIds.asKnown().getOrNull()?.size ?: 0) +
            (if (fullName.asKnown().isPresent) 1 else 0) +
            (manifestSha.asKnown().getOrNull()?.size ?: 0) +
            (if (numDownloads.asKnown().isPresent) 1 else 0) +
            (if (numViews.asKnown().isPresent) 1 else 0) +
            (if (parentCommitHash.asKnown().isPresent) 1 else 0) +
            (if (parentId.asKnown().isPresent) 1 else 0) +
            (if (repoId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitWithLookups &&
            id == other.id &&
            commitHash == other.commitHash &&
            createdAt == other.createdAt &&
            exampleRunIds == other.exampleRunIds &&
            fullName == other.fullName &&
            manifest == other.manifest &&
            manifestSha == other.manifestSha &&
            numDownloads == other.numDownloads &&
            numViews == other.numViews &&
            parentCommitHash == other.parentCommitHash &&
            parentId == other.parentId &&
            repoId == other.repoId &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            commitHash,
            createdAt,
            exampleRunIds,
            fullName,
            manifest,
            manifestSha,
            numDownloads,
            numViews,
            parentCommitHash,
            parentId,
            repoId,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommitWithLookups{id=$id, commitHash=$commitHash, createdAt=$createdAt, exampleRunIds=$exampleRunIds, fullName=$fullName, manifest=$manifest, manifestSha=$manifestSha, numDownloads=$numDownloads, numViews=$numViews, parentCommitHash=$parentCommitHash, parentId=$parentId, repoId=$repoId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
