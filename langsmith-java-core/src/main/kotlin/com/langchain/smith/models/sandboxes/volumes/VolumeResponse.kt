// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.volumes

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

class VolumeResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val attachments: JsonField<List<Attachment>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val description: JsonField<String>,
    private val labels: JsonField<Labels>,
    private val name: JsonField<String>,
    private val sizeBytes: JsonField<Long>,
    private val sourceVolumeId: JsonField<String>,
    private val status: JsonField<String>,
    private val statusMessage: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attachments")
        @ExcludeMissing
        attachments: JsonField<List<Attachment>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("labels") @ExcludeMissing labels: JsonField<Labels> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("size_bytes") @ExcludeMissing sizeBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("source_volume_id")
        @ExcludeMissing
        sourceVolumeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status_message")
        @ExcludeMissing
        statusMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_by") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        attachments,
        createdAt,
        createdBy,
        description,
        labels,
        name,
        sizeBytes,
        sourceVolumeId,
        status,
        statusMessage,
        updatedAt,
        updatedBy,
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
    fun attachments(): Optional<List<Attachment>> = attachments.getOptional("attachments")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

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
    fun labels(): Optional<Labels> = labels.getOptional("labels")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sizeBytes(): Optional<Long> = sizeBytes.getOptional("size_bytes")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceVolumeId(): Optional<String> = sourceVolumeId.getOptional("source_volume_id")

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
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedBy(): Optional<String> = updatedBy.getOptional("updated_by")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [attachments].
     *
     * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attachments")
    @ExcludeMissing
    fun _attachments(): JsonField<List<Attachment>> = attachments

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
     * Returns the raw JSON value of [labels].
     *
     * Unlike [labels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("labels") @ExcludeMissing fun _labels(): JsonField<Labels> = labels

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [sizeBytes].
     *
     * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size_bytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

    /**
     * Returns the raw JSON value of [sourceVolumeId].
     *
     * Unlike [sourceVolumeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_volume_id")
    @ExcludeMissing
    fun _sourceVolumeId(): JsonField<String> = sourceVolumeId

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
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [updatedBy].
     *
     * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_by") @ExcludeMissing fun _updatedBy(): JsonField<String> = updatedBy

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

        /** Returns a mutable builder for constructing an instance of [VolumeResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VolumeResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var attachments: JsonField<MutableList<Attachment>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var labels: JsonField<Labels> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var sizeBytes: JsonField<Long> = JsonMissing.of()
        private var sourceVolumeId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var statusMessage: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(volumeResponse: VolumeResponse) = apply {
            id = volumeResponse.id
            attachments = volumeResponse.attachments.map { it.toMutableList() }
            createdAt = volumeResponse.createdAt
            createdBy = volumeResponse.createdBy
            description = volumeResponse.description
            labels = volumeResponse.labels
            name = volumeResponse.name
            sizeBytes = volumeResponse.sizeBytes
            sourceVolumeId = volumeResponse.sourceVolumeId
            status = volumeResponse.status
            statusMessage = volumeResponse.statusMessage
            updatedAt = volumeResponse.updatedAt
            updatedBy = volumeResponse.updatedBy
            additionalProperties = volumeResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun attachments(attachments: List<Attachment>) = attachments(JsonField.of(attachments))

        /**
         * Sets [Builder.attachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachments] with a well-typed `List<Attachment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attachments(attachments: JsonField<List<Attachment>>) = apply {
            this.attachments = attachments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Attachment] to [attachments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttachment(attachment: Attachment) = apply {
            attachments =
                (attachments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("attachments", it).add(attachment)
                }
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun labels(labels: Labels) = labels(JsonField.of(labels))

        /**
         * Sets [Builder.labels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labels] with a well-typed [Labels] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun labels(labels: JsonField<Labels>) = apply { this.labels = labels }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun sizeBytes(sizeBytes: Long) = sizeBytes(JsonField.of(sizeBytes))

        /**
         * Sets [Builder.sizeBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sizeBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

        fun sourceVolumeId(sourceVolumeId: String) = sourceVolumeId(JsonField.of(sourceVolumeId))

        /**
         * Sets [Builder.sourceVolumeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceVolumeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceVolumeId(sourceVolumeId: JsonField<String>) = apply {
            this.sourceVolumeId = sourceVolumeId
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

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

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
         * Returns an immutable instance of [VolumeResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VolumeResponse =
            VolumeResponse(
                id,
                (attachments ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                createdBy,
                description,
                labels,
                name,
                sizeBytes,
                sourceVolumeId,
                status,
                statusMessage,
                updatedAt,
                updatedBy,
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
    fun validate(): VolumeResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        attachments().ifPresent { it.forEach { it.validate() } }
        createdAt()
        createdBy()
        description()
        labels().ifPresent { it.validate() }
        name()
        sizeBytes()
        sourceVolumeId()
        status()
        statusMessage()
        updatedAt()
        updatedBy()
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
            (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (labels.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (sizeBytes.asKnown().isPresent) 1 else 0) +
            (if (sourceVolumeId.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (statusMessage.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0)

    class Attachment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val mountPath: JsonField<String>,
        private val readOnly: JsonField<Boolean>,
        private val sandboxId: JsonField<String>,
        private val sandboxName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("mount_path")
            @ExcludeMissing
            mountPath: JsonField<String> = JsonMissing.of(),
            @JsonProperty("read_only")
            @ExcludeMissing
            readOnly: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("sandbox_id")
            @ExcludeMissing
            sandboxId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sandbox_name")
            @ExcludeMissing
            sandboxName: JsonField<String> = JsonMissing.of(),
        ) : this(mountPath, readOnly, sandboxId, sandboxName, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mountPath(): Optional<String> = mountPath.getOptional("mount_path")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun readOnly(): Optional<Boolean> = readOnly.getOptional("read_only")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sandboxId(): Optional<String> = sandboxId.getOptional("sandbox_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sandboxName(): Optional<String> = sandboxName.getOptional("sandbox_name")

        /**
         * Returns the raw JSON value of [mountPath].
         *
         * Unlike [mountPath], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mount_path") @ExcludeMissing fun _mountPath(): JsonField<String> = mountPath

        /**
         * Returns the raw JSON value of [readOnly].
         *
         * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("read_only") @ExcludeMissing fun _readOnly(): JsonField<Boolean> = readOnly

        /**
         * Returns the raw JSON value of [sandboxId].
         *
         * Unlike [sandboxId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sandbox_id") @ExcludeMissing fun _sandboxId(): JsonField<String> = sandboxId

        /**
         * Returns the raw JSON value of [sandboxName].
         *
         * Unlike [sandboxName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sandbox_name")
        @ExcludeMissing
        fun _sandboxName(): JsonField<String> = sandboxName

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

            /** Returns a mutable builder for constructing an instance of [Attachment]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Attachment]. */
        class Builder internal constructor() {

            private var mountPath: JsonField<String> = JsonMissing.of()
            private var readOnly: JsonField<Boolean> = JsonMissing.of()
            private var sandboxId: JsonField<String> = JsonMissing.of()
            private var sandboxName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(attachment: Attachment) = apply {
                mountPath = attachment.mountPath
                readOnly = attachment.readOnly
                sandboxId = attachment.sandboxId
                sandboxName = attachment.sandboxName
                additionalProperties = attachment.additionalProperties.toMutableMap()
            }

            fun mountPath(mountPath: String) = mountPath(JsonField.of(mountPath))

            /**
             * Sets [Builder.mountPath] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mountPath] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mountPath(mountPath: JsonField<String>) = apply { this.mountPath = mountPath }

            fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

            /**
             * Sets [Builder.readOnly] to an arbitrary JSON value.
             *
             * You should usually call [Builder.readOnly] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

            fun sandboxId(sandboxId: String) = sandboxId(JsonField.of(sandboxId))

            /**
             * Sets [Builder.sandboxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sandboxId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sandboxId(sandboxId: JsonField<String>) = apply { this.sandboxId = sandboxId }

            fun sandboxName(sandboxName: String) = sandboxName(JsonField.of(sandboxName))

            /**
             * Sets [Builder.sandboxName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sandboxName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sandboxName(sandboxName: JsonField<String>) = apply {
                this.sandboxName = sandboxName
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
             * Returns an immutable instance of [Attachment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Attachment =
                Attachment(
                    mountPath,
                    readOnly,
                    sandboxId,
                    sandboxName,
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
        fun validate(): Attachment = apply {
            if (validated) {
                return@apply
            }

            mountPath()
            readOnly()
            sandboxId()
            sandboxName()
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
            (if (mountPath.asKnown().isPresent) 1 else 0) +
                (if (readOnly.asKnown().isPresent) 1 else 0) +
                (if (sandboxId.asKnown().isPresent) 1 else 0) +
                (if (sandboxName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attachment &&
                mountPath == other.mountPath &&
                readOnly == other.readOnly &&
                sandboxId == other.sandboxId &&
                sandboxName == other.sandboxName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(mountPath, readOnly, sandboxId, sandboxName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attachment{mountPath=$mountPath, readOnly=$readOnly, sandboxId=$sandboxId, sandboxName=$sandboxName, additionalProperties=$additionalProperties}"
    }

    class Labels
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Labels]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Labels]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(labels: Labels) = apply {
                additionalProperties = labels.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Labels].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Labels = Labels(additionalProperties.toImmutable())
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
        fun validate(): Labels = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Labels && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Labels{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VolumeResponse &&
            id == other.id &&
            attachments == other.attachments &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            description == other.description &&
            labels == other.labels &&
            name == other.name &&
            sizeBytes == other.sizeBytes &&
            sourceVolumeId == other.sourceVolumeId &&
            status == other.status &&
            statusMessage == other.statusMessage &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            attachments,
            createdAt,
            createdBy,
            description,
            labels,
            name,
            sizeBytes,
            sourceVolumeId,
            status,
            statusMessage,
            updatedAt,
            updatedBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VolumeResponse{id=$id, attachments=$attachments, createdAt=$createdAt, createdBy=$createdBy, description=$description, labels=$labels, name=$name, sizeBytes=$sizeBytes, sourceVolumeId=$sourceVolumeId, status=$status, statusMessage=$statusMessage, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}
