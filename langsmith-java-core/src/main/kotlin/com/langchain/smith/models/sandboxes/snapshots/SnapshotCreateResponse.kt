// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.snapshots

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class SnapshotCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val dockerImage: JsonField<String>,
    private val fsCapacityBytes: JsonField<Long>,
    private val fsUsedBytes: JsonField<Long>,
    private val imageDigest: JsonField<String>,
    private val memorySnapshotSizeBytes: JsonField<Long>,
    private val name: JsonField<String>,
    private val registryId: JsonField<String>,
    private val sourceSandboxId: JsonField<String>,
    private val status: JsonField<String>,
    private val statusMessage: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_by") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("docker_image")
        @ExcludeMissing
        dockerImage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fs_capacity_bytes")
        @ExcludeMissing
        fsCapacityBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("fs_used_bytes")
        @ExcludeMissing
        fsUsedBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("image_digest")
        @ExcludeMissing
        imageDigest: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memory_snapshot_size_bytes")
        @ExcludeMissing
        memorySnapshotSizeBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("registry_id")
        @ExcludeMissing
        registryId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_sandbox_id")
        @ExcludeMissing
        sourceSandboxId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status_message")
        @ExcludeMissing
        statusMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        createdBy,
        dockerImage,
        fsCapacityBytes,
        fsUsedBytes,
        imageDigest,
        memorySnapshotSizeBytes,
        name,
        registryId,
        sourceSandboxId,
        status,
        statusMessage,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("created_by")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dockerImage(): Optional<String> = dockerImage.getOptional("docker_image")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fsCapacityBytes(): Optional<Long> = fsCapacityBytes.getOptional("fs_capacity_bytes")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fsUsedBytes(): Optional<Long> = fsUsedBytes.getOptional("fs_used_bytes")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun imageDigest(): Optional<String> = imageDigest.getOptional("image_digest")

    /**
     * MemorySnapshotSizeBytes is non-nil iff the snapshot was captured with VM memory state. A
     * non-nil value is the canonical signal that this snapshot can warm-restore from memory; nil
     * means rootfs only.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memorySnapshotSizeBytes(): Optional<Long> =
        memorySnapshotSizeBytes.getOptional("memory_snapshot_size_bytes")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registryId(): Optional<String> = registryId.getOptional("registry_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceSandboxId(): Optional<String> = sourceSandboxId.getOptional("source_sandbox_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusMessage(): Optional<String> = statusMessage.getOptional("status_message")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

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
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [dockerImage].
     *
     * Unlike [dockerImage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("docker_image")
    @ExcludeMissing
    fun _dockerImage(): JsonField<String> = dockerImage

    /**
     * Returns the raw JSON value of [fsCapacityBytes].
     *
     * Unlike [fsCapacityBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fs_capacity_bytes")
    @ExcludeMissing
    fun _fsCapacityBytes(): JsonField<Long> = fsCapacityBytes

    /**
     * Returns the raw JSON value of [fsUsedBytes].
     *
     * Unlike [fsUsedBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fs_used_bytes") @ExcludeMissing fun _fsUsedBytes(): JsonField<Long> = fsUsedBytes

    /**
     * Returns the raw JSON value of [imageDigest].
     *
     * Unlike [imageDigest], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("image_digest")
    @ExcludeMissing
    fun _imageDigest(): JsonField<String> = imageDigest

    /**
     * Returns the raw JSON value of [memorySnapshotSizeBytes].
     *
     * Unlike [memorySnapshotSizeBytes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("memory_snapshot_size_bytes")
    @ExcludeMissing
    fun _memorySnapshotSizeBytes(): JsonField<Long> = memorySnapshotSizeBytes

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [registryId].
     *
     * Unlike [registryId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("registry_id") @ExcludeMissing fun _registryId(): JsonField<String> = registryId

    /**
     * Returns the raw JSON value of [sourceSandboxId].
     *
     * Unlike [sourceSandboxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_sandbox_id")
    @ExcludeMissing
    fun _sourceSandboxId(): JsonField<String> = sourceSandboxId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [statusMessage].
     *
     * Unlike [statusMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status_message")
    @ExcludeMissing
    fun _statusMessage(): JsonField<String> = statusMessage

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [SnapshotCreateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SnapshotCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dockerImage: JsonField<String> = JsonMissing.of()
        private var fsCapacityBytes: JsonField<Long> = JsonMissing.of()
        private var fsUsedBytes: JsonField<Long> = JsonMissing.of()
        private var imageDigest: JsonField<String> = JsonMissing.of()
        private var memorySnapshotSizeBytes: JsonField<Long> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var registryId: JsonField<String> = JsonMissing.of()
        private var sourceSandboxId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var statusMessage: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(snapshotCreateResponse: SnapshotCreateResponse) = apply {
            id = snapshotCreateResponse.id
            createdAt = snapshotCreateResponse.createdAt
            createdBy = snapshotCreateResponse.createdBy
            dockerImage = snapshotCreateResponse.dockerImage
            fsCapacityBytes = snapshotCreateResponse.fsCapacityBytes
            fsUsedBytes = snapshotCreateResponse.fsUsedBytes
            imageDigest = snapshotCreateResponse.imageDigest
            memorySnapshotSizeBytes = snapshotCreateResponse.memorySnapshotSizeBytes
            name = snapshotCreateResponse.name
            registryId = snapshotCreateResponse.registryId
            sourceSandboxId = snapshotCreateResponse.sourceSandboxId
            status = snapshotCreateResponse.status
            statusMessage = snapshotCreateResponse.statusMessage
            updatedAt = snapshotCreateResponse.updatedAt
            additionalProperties = snapshotCreateResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun dockerImage(dockerImage: String) = dockerImage(JsonField.of(dockerImage))

        /**
         * Sets [Builder.dockerImage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dockerImage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dockerImage(dockerImage: JsonField<String>) = apply { this.dockerImage = dockerImage }

        fun fsCapacityBytes(fsCapacityBytes: Long) = fsCapacityBytes(JsonField.of(fsCapacityBytes))

        /**
         * Sets [Builder.fsCapacityBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fsCapacityBytes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fsCapacityBytes(fsCapacityBytes: JsonField<Long>) = apply {
            this.fsCapacityBytes = fsCapacityBytes
        }

        fun fsUsedBytes(fsUsedBytes: Long) = fsUsedBytes(JsonField.of(fsUsedBytes))

        /**
         * Sets [Builder.fsUsedBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fsUsedBytes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fsUsedBytes(fsUsedBytes: JsonField<Long>) = apply { this.fsUsedBytes = fsUsedBytes }

        fun imageDigest(imageDigest: String) = imageDigest(JsonField.of(imageDigest))

        /**
         * Sets [Builder.imageDigest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageDigest] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun imageDigest(imageDigest: JsonField<String>) = apply { this.imageDigest = imageDigest }

        /**
         * MemorySnapshotSizeBytes is non-nil iff the snapshot was captured with VM memory state. A
         * non-nil value is the canonical signal that this snapshot can warm-restore from memory;
         * nil means rootfs only.
         */
        fun memorySnapshotSizeBytes(memorySnapshotSizeBytes: Long) =
            memorySnapshotSizeBytes(JsonField.of(memorySnapshotSizeBytes))

        /**
         * Sets [Builder.memorySnapshotSizeBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memorySnapshotSizeBytes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun memorySnapshotSizeBytes(memorySnapshotSizeBytes: JsonField<Long>) = apply {
            this.memorySnapshotSizeBytes = memorySnapshotSizeBytes
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun registryId(registryId: String) = registryId(JsonField.of(registryId))

        /**
         * Sets [Builder.registryId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registryId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun registryId(registryId: JsonField<String>) = apply { this.registryId = registryId }

        fun sourceSandboxId(sourceSandboxId: String) =
            sourceSandboxId(JsonField.of(sourceSandboxId))

        /**
         * Sets [Builder.sourceSandboxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceSandboxId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceSandboxId(sourceSandboxId: JsonField<String>) = apply {
            this.sourceSandboxId = sourceSandboxId
        }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun statusMessage(statusMessage: String) = statusMessage(JsonField.of(statusMessage))

        /**
         * Sets [Builder.statusMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun statusMessage(statusMessage: JsonField<String>) = apply {
            this.statusMessage = statusMessage
        }

        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [SnapshotCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SnapshotCreateResponse =
            SnapshotCreateResponse(
                id,
                createdAt,
                createdBy,
                dockerImage,
                fsCapacityBytes,
                fsUsedBytes,
                imageDigest,
                memorySnapshotSizeBytes,
                name,
                registryId,
                sourceSandboxId,
                status,
                statusMessage,
                updatedAt,
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
    fun validate(): SnapshotCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        createdBy()
        dockerImage()
        fsCapacityBytes()
        fsUsedBytes()
        imageDigest()
        memorySnapshotSizeBytes()
        name()
        registryId()
        sourceSandboxId()
        status()
        statusMessage()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dockerImage.asKnown().isPresent) 1 else 0) +
            (if (fsCapacityBytes.asKnown().isPresent) 1 else 0) +
            (if (fsUsedBytes.asKnown().isPresent) 1 else 0) +
            (if (imageDigest.asKnown().isPresent) 1 else 0) +
            (if (memorySnapshotSizeBytes.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (registryId.asKnown().isPresent) 1 else 0) +
            (if (sourceSandboxId.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (statusMessage.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SnapshotCreateResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            dockerImage == other.dockerImage &&
            fsCapacityBytes == other.fsCapacityBytes &&
            fsUsedBytes == other.fsUsedBytes &&
            imageDigest == other.imageDigest &&
            memorySnapshotSizeBytes == other.memorySnapshotSizeBytes &&
            name == other.name &&
            registryId == other.registryId &&
            sourceSandboxId == other.sourceSandboxId &&
            status == other.status &&
            statusMessage == other.statusMessage &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            createdBy,
            dockerImage,
            fsCapacityBytes,
            fsUsedBytes,
            imageDigest,
            memorySnapshotSizeBytes,
            name,
            registryId,
            sourceSandboxId,
            status,
            statusMessage,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SnapshotCreateResponse{id=$id, createdAt=$createdAt, createdBy=$createdBy, dockerImage=$dockerImage, fsCapacityBytes=$fsCapacityBytes, fsUsedBytes=$fsUsedBytes, imageDigest=$imageDigest, memorySnapshotSizeBytes=$memorySnapshotSizeBytes, name=$name, registryId=$registryId, sourceSandboxId=$sourceSandboxId, status=$status, statusMessage=$statusMessage, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
