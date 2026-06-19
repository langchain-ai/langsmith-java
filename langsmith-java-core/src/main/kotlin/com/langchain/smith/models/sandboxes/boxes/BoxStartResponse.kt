// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.BaseDeserializer
import com.langchain.smith.core.BaseSerializer
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BoxStartResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val dataplaneUrl: JsonField<String>,
    private val deleteAfterStopSeconds: JsonField<Long>,
    private val fsCapacityBytes: JsonField<Long>,
    private val idleTtlSeconds: JsonField<Long>,
    private val memBytes: JsonField<Long>,
    private val mountConfig: JsonField<MountConfig>,
    private val name: JsonField<String>,
    private val proxyConfig: JsonField<ProxyConfig>,
    private val sizeClass: JsonField<String>,
    private val snapshotId: JsonField<String>,
    private val status: JsonField<String>,
    private val statusMessage: JsonField<String>,
    private val stoppedAt: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val updatedBy: JsonField<String>,
    private val vcpus: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_by") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataplane_url")
        @ExcludeMissing
        dataplaneUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("delete_after_stop_seconds")
        @ExcludeMissing
        deleteAfterStopSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("fs_capacity_bytes")
        @ExcludeMissing
        fsCapacityBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("idle_ttl_seconds")
        @ExcludeMissing
        idleTtlSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mem_bytes") @ExcludeMissing memBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mount_config")
        @ExcludeMissing
        mountConfig: JsonField<MountConfig> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("proxy_config")
        @ExcludeMissing
        proxyConfig: JsonField<ProxyConfig> = JsonMissing.of(),
        @JsonProperty("size_class") @ExcludeMissing sizeClass: JsonField<String> = JsonMissing.of(),
        @JsonProperty("snapshot_id")
        @ExcludeMissing
        snapshotId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status_message")
        @ExcludeMissing
        statusMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stopped_at") @ExcludeMissing stoppedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_by") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vcpus") @ExcludeMissing vcpus: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        createdBy,
        dataplaneUrl,
        deleteAfterStopSeconds,
        fsCapacityBytes,
        idleTtlSeconds,
        memBytes,
        mountConfig,
        name,
        proxyConfig,
        sizeClass,
        snapshotId,
        status,
        statusMessage,
        stoppedAt,
        updatedAt,
        updatedBy,
        vcpus,
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
    fun dataplaneUrl(): Optional<String> = dataplaneUrl.getOptional("dataplane_url")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deleteAfterStopSeconds(): Optional<Long> =
        deleteAfterStopSeconds.getOptional("delete_after_stop_seconds")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fsCapacityBytes(): Optional<Long> = fsCapacityBytes.getOptional("fs_capacity_bytes")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idleTtlSeconds(): Optional<Long> = idleTtlSeconds.getOptional("idle_ttl_seconds")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memBytes(): Optional<Long> = memBytes.getOptional("mem_bytes")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mountConfig(): Optional<MountConfig> = mountConfig.getOptional("mount_config")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proxyConfig(): Optional<ProxyConfig> = proxyConfig.getOptional("proxy_config")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sizeClass(): Optional<String> = sizeClass.getOptional("size_class")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun snapshotId(): Optional<String> = snapshotId.getOptional("snapshot_id")

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
    fun stoppedAt(): Optional<String> = stoppedAt.getOptional("stopped_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedBy(): Optional<String> = updatedBy.getOptional("updated_by")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vcpus(): Optional<Long> = vcpus.getOptional("vcpus")

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
     * Returns the raw JSON value of [dataplaneUrl].
     *
     * Unlike [dataplaneUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataplane_url")
    @ExcludeMissing
    fun _dataplaneUrl(): JsonField<String> = dataplaneUrl

    /**
     * Returns the raw JSON value of [deleteAfterStopSeconds].
     *
     * Unlike [deleteAfterStopSeconds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("delete_after_stop_seconds")
    @ExcludeMissing
    fun _deleteAfterStopSeconds(): JsonField<Long> = deleteAfterStopSeconds

    /**
     * Returns the raw JSON value of [fsCapacityBytes].
     *
     * Unlike [fsCapacityBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fs_capacity_bytes")
    @ExcludeMissing
    fun _fsCapacityBytes(): JsonField<Long> = fsCapacityBytes

    /**
     * Returns the raw JSON value of [idleTtlSeconds].
     *
     * Unlike [idleTtlSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idle_ttl_seconds")
    @ExcludeMissing
    fun _idleTtlSeconds(): JsonField<Long> = idleTtlSeconds

    /**
     * Returns the raw JSON value of [memBytes].
     *
     * Unlike [memBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mem_bytes") @ExcludeMissing fun _memBytes(): JsonField<Long> = memBytes

    /**
     * Returns the raw JSON value of [mountConfig].
     *
     * Unlike [mountConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mount_config")
    @ExcludeMissing
    fun _mountConfig(): JsonField<MountConfig> = mountConfig

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [proxyConfig].
     *
     * Unlike [proxyConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("proxy_config")
    @ExcludeMissing
    fun _proxyConfig(): JsonField<ProxyConfig> = proxyConfig

    /**
     * Returns the raw JSON value of [sizeClass].
     *
     * Unlike [sizeClass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size_class") @ExcludeMissing fun _sizeClass(): JsonField<String> = sizeClass

    /**
     * Returns the raw JSON value of [snapshotId].
     *
     * Unlike [snapshotId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("snapshot_id") @ExcludeMissing fun _snapshotId(): JsonField<String> = snapshotId

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
     * Returns the raw JSON value of [stoppedAt].
     *
     * Unlike [stoppedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stopped_at") @ExcludeMissing fun _stoppedAt(): JsonField<String> = stoppedAt

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [updatedBy].
     *
     * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_by") @ExcludeMissing fun _updatedBy(): JsonField<String> = updatedBy

    /**
     * Returns the raw JSON value of [vcpus].
     *
     * Unlike [vcpus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vcpus") @ExcludeMissing fun _vcpus(): JsonField<Long> = vcpus

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

        /** Returns a mutable builder for constructing an instance of [BoxStartResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BoxStartResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dataplaneUrl: JsonField<String> = JsonMissing.of()
        private var deleteAfterStopSeconds: JsonField<Long> = JsonMissing.of()
        private var fsCapacityBytes: JsonField<Long> = JsonMissing.of()
        private var idleTtlSeconds: JsonField<Long> = JsonMissing.of()
        private var memBytes: JsonField<Long> = JsonMissing.of()
        private var mountConfig: JsonField<MountConfig> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var proxyConfig: JsonField<ProxyConfig> = JsonMissing.of()
        private var sizeClass: JsonField<String> = JsonMissing.of()
        private var snapshotId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var statusMessage: JsonField<String> = JsonMissing.of()
        private var stoppedAt: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var vcpus: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(boxStartResponse: BoxStartResponse) = apply {
            id = boxStartResponse.id
            createdAt = boxStartResponse.createdAt
            createdBy = boxStartResponse.createdBy
            dataplaneUrl = boxStartResponse.dataplaneUrl
            deleteAfterStopSeconds = boxStartResponse.deleteAfterStopSeconds
            fsCapacityBytes = boxStartResponse.fsCapacityBytes
            idleTtlSeconds = boxStartResponse.idleTtlSeconds
            memBytes = boxStartResponse.memBytes
            mountConfig = boxStartResponse.mountConfig
            name = boxStartResponse.name
            proxyConfig = boxStartResponse.proxyConfig
            sizeClass = boxStartResponse.sizeClass
            snapshotId = boxStartResponse.snapshotId
            status = boxStartResponse.status
            statusMessage = boxStartResponse.statusMessage
            stoppedAt = boxStartResponse.stoppedAt
            updatedAt = boxStartResponse.updatedAt
            updatedBy = boxStartResponse.updatedBy
            vcpus = boxStartResponse.vcpus
            additionalProperties = boxStartResponse.additionalProperties.toMutableMap()
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

        fun dataplaneUrl(dataplaneUrl: String) = dataplaneUrl(JsonField.of(dataplaneUrl))

        /**
         * Sets [Builder.dataplaneUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataplaneUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataplaneUrl(dataplaneUrl: JsonField<String>) = apply {
            this.dataplaneUrl = dataplaneUrl
        }

        fun deleteAfterStopSeconds(deleteAfterStopSeconds: Long) =
            deleteAfterStopSeconds(JsonField.of(deleteAfterStopSeconds))

        /**
         * Sets [Builder.deleteAfterStopSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deleteAfterStopSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deleteAfterStopSeconds(deleteAfterStopSeconds: JsonField<Long>) = apply {
            this.deleteAfterStopSeconds = deleteAfterStopSeconds
        }

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

        fun idleTtlSeconds(idleTtlSeconds: Long) = idleTtlSeconds(JsonField.of(idleTtlSeconds))

        /**
         * Sets [Builder.idleTtlSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idleTtlSeconds] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idleTtlSeconds(idleTtlSeconds: JsonField<Long>) = apply {
            this.idleTtlSeconds = idleTtlSeconds
        }

        fun memBytes(memBytes: Long) = memBytes(JsonField.of(memBytes))

        /**
         * Sets [Builder.memBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memBytes(memBytes: JsonField<Long>) = apply { this.memBytes = memBytes }

        fun mountConfig(mountConfig: MountConfig) = mountConfig(JsonField.of(mountConfig))

        /**
         * Sets [Builder.mountConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mountConfig] with a well-typed [MountConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mountConfig(mountConfig: JsonField<MountConfig>) = apply {
            this.mountConfig = mountConfig
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun proxyConfig(proxyConfig: ProxyConfig) = proxyConfig(JsonField.of(proxyConfig))

        /**
         * Sets [Builder.proxyConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proxyConfig] with a well-typed [ProxyConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun proxyConfig(proxyConfig: JsonField<ProxyConfig>) = apply {
            this.proxyConfig = proxyConfig
        }

        fun sizeClass(sizeClass: String) = sizeClass(JsonField.of(sizeClass))

        /**
         * Sets [Builder.sizeClass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sizeClass] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sizeClass(sizeClass: JsonField<String>) = apply { this.sizeClass = sizeClass }

        fun snapshotId(snapshotId: String) = snapshotId(JsonField.of(snapshotId))

        /**
         * Sets [Builder.snapshotId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snapshotId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun snapshotId(snapshotId: JsonField<String>) = apply { this.snapshotId = snapshotId }

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

        fun stoppedAt(stoppedAt: String) = stoppedAt(JsonField.of(stoppedAt))

        /**
         * Sets [Builder.stoppedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stoppedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stoppedAt(stoppedAt: JsonField<String>) = apply { this.stoppedAt = stoppedAt }

        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

        fun vcpus(vcpus: Long) = vcpus(JsonField.of(vcpus))

        /**
         * Sets [Builder.vcpus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vcpus] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vcpus(vcpus: JsonField<Long>) = apply { this.vcpus = vcpus }

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
         * Returns an immutable instance of [BoxStartResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BoxStartResponse =
            BoxStartResponse(
                id,
                createdAt,
                createdBy,
                dataplaneUrl,
                deleteAfterStopSeconds,
                fsCapacityBytes,
                idleTtlSeconds,
                memBytes,
                mountConfig,
                name,
                proxyConfig,
                sizeClass,
                snapshotId,
                status,
                statusMessage,
                stoppedAt,
                updatedAt,
                updatedBy,
                vcpus,
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
    fun validate(): BoxStartResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        createdBy()
        dataplaneUrl()
        deleteAfterStopSeconds()
        fsCapacityBytes()
        idleTtlSeconds()
        memBytes()
        mountConfig().ifPresent { it.validate() }
        name()
        proxyConfig().ifPresent { it.validate() }
        sizeClass()
        snapshotId()
        status()
        statusMessage()
        stoppedAt()
        updatedAt()
        updatedBy()
        vcpus()
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
            (if (dataplaneUrl.asKnown().isPresent) 1 else 0) +
            (if (deleteAfterStopSeconds.asKnown().isPresent) 1 else 0) +
            (if (fsCapacityBytes.asKnown().isPresent) 1 else 0) +
            (if (idleTtlSeconds.asKnown().isPresent) 1 else 0) +
            (if (memBytes.asKnown().isPresent) 1 else 0) +
            (mountConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (proxyConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sizeClass.asKnown().isPresent) 1 else 0) +
            (if (snapshotId.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (statusMessage.asKnown().isPresent) 1 else 0) +
            (if (stoppedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (vcpus.asKnown().isPresent) 1 else 0)

    class MountConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val auth: JsonField<Auth>,
        private val mounts: JsonField<List<Mount>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("auth") @ExcludeMissing auth: JsonField<Auth> = JsonMissing.of(),
            @JsonProperty("mounts")
            @ExcludeMissing
            mounts: JsonField<List<Mount>> = JsonMissing.of(),
        ) : this(auth, mounts, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun auth(): Optional<Auth> = auth.getOptional("auth")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mounts(): Optional<List<Mount>> = mounts.getOptional("mounts")

        /**
         * Returns the raw JSON value of [auth].
         *
         * Unlike [auth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auth") @ExcludeMissing fun _auth(): JsonField<Auth> = auth

        /**
         * Returns the raw JSON value of [mounts].
         *
         * Unlike [mounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mounts") @ExcludeMissing fun _mounts(): JsonField<List<Mount>> = mounts

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

            /** Returns a mutable builder for constructing an instance of [MountConfig]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MountConfig]. */
        class Builder internal constructor() {

            private var auth: JsonField<Auth> = JsonMissing.of()
            private var mounts: JsonField<MutableList<Mount>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(mountConfig: MountConfig) = apply {
                auth = mountConfig.auth
                mounts = mountConfig.mounts.map { it.toMutableList() }
                additionalProperties = mountConfig.additionalProperties.toMutableMap()
            }

            fun auth(auth: Auth) = auth(JsonField.of(auth))

            /**
             * Sets [Builder.auth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.auth] with a well-typed [Auth] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun auth(auth: JsonField<Auth>) = apply { this.auth = auth }

            fun mounts(mounts: List<Mount>) = mounts(JsonField.of(mounts))

            /**
             * Sets [Builder.mounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mounts] with a well-typed `List<Mount>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mounts(mounts: JsonField<List<Mount>>) = apply {
                this.mounts = mounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Mount] to [mounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMount(mount: Mount) = apply {
                mounts =
                    (mounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("mounts", it).add(mount)
                    }
            }

            /**
             * Alias for calling [addMount] with
             * `Mount.ofSandboxapiS3BucketMountSpec(sandboxapiS3BucketMountSpec)`.
             */
            fun addMount(sandboxapiS3BucketMountSpec: Mount.SandboxapiS3BucketMountSpec) =
                addMount(Mount.ofSandboxapiS3BucketMountSpec(sandboxapiS3BucketMountSpec))

            /**
             * Alias for calling [addMount] with
             * `Mount.ofSandboxapiGcsBucketMountSpec(sandboxapiGcsBucketMountSpec)`.
             */
            fun addMount(sandboxapiGcsBucketMountSpec: Mount.SandboxapiGcsBucketMountSpec) =
                addMount(Mount.ofSandboxapiGcsBucketMountSpec(sandboxapiGcsBucketMountSpec))

            /**
             * Alias for calling [addMount] with
             * `Mount.ofSandboxapiGitRepoMountSpec(sandboxapiGitRepoMountSpec)`.
             */
            fun addMount(sandboxapiGitRepoMountSpec: Mount.SandboxapiGitRepoMountSpec) =
                addMount(Mount.ofSandboxapiGitRepoMountSpec(sandboxapiGitRepoMountSpec))

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
             * Returns an immutable instance of [MountConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): MountConfig =
                MountConfig(
                    auth,
                    (mounts ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): MountConfig = apply {
            if (validated) {
                return@apply
            }

            auth().ifPresent { it.validate() }
            mounts().ifPresent { it.forEach { it.validate() } }
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
            (auth.asKnown().getOrNull()?.validity() ?: 0) +
                (mounts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Auth
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val aws: JsonField<Aws>,
            private val gcp: JsonField<Gcp>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("aws") @ExcludeMissing aws: JsonField<Aws> = JsonMissing.of(),
                @JsonProperty("gcp") @ExcludeMissing gcp: JsonField<Gcp> = JsonMissing.of(),
            ) : this(aws, gcp, mutableMapOf())

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun aws(): Optional<Aws> = aws.getOptional("aws")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun gcp(): Optional<Gcp> = gcp.getOptional("gcp")

            /**
             * Returns the raw JSON value of [aws].
             *
             * Unlike [aws], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("aws") @ExcludeMissing fun _aws(): JsonField<Aws> = aws

            /**
             * Returns the raw JSON value of [gcp].
             *
             * Unlike [gcp], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gcp") @ExcludeMissing fun _gcp(): JsonField<Gcp> = gcp

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

                /** Returns a mutable builder for constructing an instance of [Auth]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Auth]. */
            class Builder internal constructor() {

                private var aws: JsonField<Aws> = JsonMissing.of()
                private var gcp: JsonField<Gcp> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(auth: Auth) = apply {
                    aws = auth.aws
                    gcp = auth.gcp
                    additionalProperties = auth.additionalProperties.toMutableMap()
                }

                fun aws(aws: Aws) = aws(JsonField.of(aws))

                /**
                 * Sets [Builder.aws] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.aws] with a well-typed [Aws] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun aws(aws: JsonField<Aws>) = apply { this.aws = aws }

                fun gcp(gcp: Gcp) = gcp(JsonField.of(gcp))

                /**
                 * Sets [Builder.gcp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gcp] with a well-typed [Gcp] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun gcp(gcp: JsonField<Gcp>) = apply { this.gcp = gcp }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Auth].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Auth = Auth(aws, gcp, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Auth = apply {
                if (validated) {
                    return@apply
                }

                aws().ifPresent { it.validate() }
                gcp().ifPresent { it.validate() }
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
                (aws.asKnown().getOrNull()?.validity() ?: 0) +
                    (gcp.asKnown().getOrNull()?.validity() ?: 0)

            class Aws
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val accessKeyId: JsonField<AccessKeyId>,
                private val secretAccessKey: JsonField<SecretAccessKey>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("access_key_id")
                    @ExcludeMissing
                    accessKeyId: JsonField<AccessKeyId> = JsonMissing.of(),
                    @JsonProperty("secret_access_key")
                    @ExcludeMissing
                    secretAccessKey: JsonField<SecretAccessKey> = JsonMissing.of(),
                ) : this(accessKeyId, secretAccessKey, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun accessKeyId(): AccessKeyId = accessKeyId.getRequired("access_key_id")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun secretAccessKey(): SecretAccessKey =
                    secretAccessKey.getRequired("secret_access_key")

                /**
                 * Returns the raw JSON value of [accessKeyId].
                 *
                 * Unlike [accessKeyId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("access_key_id")
                @ExcludeMissing
                fun _accessKeyId(): JsonField<AccessKeyId> = accessKeyId

                /**
                 * Returns the raw JSON value of [secretAccessKey].
                 *
                 * Unlike [secretAccessKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("secret_access_key")
                @ExcludeMissing
                fun _secretAccessKey(): JsonField<SecretAccessKey> = secretAccessKey

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
                     * Returns a mutable builder for constructing an instance of [Aws].
                     *
                     * The following fields are required:
                     * ```java
                     * .accessKeyId()
                     * .secretAccessKey()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Aws]. */
                class Builder internal constructor() {

                    private var accessKeyId: JsonField<AccessKeyId>? = null
                    private var secretAccessKey: JsonField<SecretAccessKey>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(aws: Aws) = apply {
                        accessKeyId = aws.accessKeyId
                        secretAccessKey = aws.secretAccessKey
                        additionalProperties = aws.additionalProperties.toMutableMap()
                    }

                    fun accessKeyId(accessKeyId: AccessKeyId) =
                        accessKeyId(JsonField.of(accessKeyId))

                    /**
                     * Sets [Builder.accessKeyId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accessKeyId] with a well-typed [AccessKeyId]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accessKeyId(accessKeyId: JsonField<AccessKeyId>) = apply {
                        this.accessKeyId = accessKeyId
                    }

                    fun secretAccessKey(secretAccessKey: SecretAccessKey) =
                        secretAccessKey(JsonField.of(secretAccessKey))

                    /**
                     * Sets [Builder.secretAccessKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.secretAccessKey] with a well-typed
                     * [SecretAccessKey] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun secretAccessKey(secretAccessKey: JsonField<SecretAccessKey>) = apply {
                        this.secretAccessKey = secretAccessKey
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Aws].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .accessKeyId()
                     * .secretAccessKey()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Aws =
                        Aws(
                            checkRequired("accessKeyId", accessKeyId),
                            checkRequired("secretAccessKey", secretAccessKey),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Aws = apply {
                    if (validated) {
                        return@apply
                    }

                    accessKeyId().validate()
                    secretAccessKey().validate()
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
                    (accessKeyId.asKnown().getOrNull()?.validity() ?: 0) +
                        (secretAccessKey.asKnown().getOrNull()?.validity() ?: 0)

                class AccessKeyId
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                         * Returns a mutable builder for constructing an instance of [AccessKeyId].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [AccessKeyId]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(accessKeyId: AccessKeyId) = apply {
                            type = accessKeyId.type
                            isSet = accessKeyId.isSet
                            value = accessKeyId.value
                            additionalProperties = accessKeyId.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [AccessKeyId].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): AccessKeyId =
                            AccessKeyId(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): AccessKeyId = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
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
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AccessKeyId &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AccessKeyId{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                class SecretAccessKey
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                         * Returns a mutable builder for constructing an instance of
                         * [SecretAccessKey].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SecretAccessKey]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(secretAccessKey: SecretAccessKey) = apply {
                            type = secretAccessKey.type
                            isSet = secretAccessKey.isSet
                            value = secretAccessKey.value
                            additionalProperties =
                                secretAccessKey.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SecretAccessKey].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): SecretAccessKey =
                            SecretAccessKey(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): SecretAccessKey = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
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
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SecretAccessKey &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SecretAccessKey{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Aws &&
                        accessKeyId == other.accessKeyId &&
                        secretAccessKey == other.secretAccessKey &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(accessKeyId, secretAccessKey, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Aws{accessKeyId=$accessKeyId, secretAccessKey=$secretAccessKey, additionalProperties=$additionalProperties}"
            }

            class Gcp
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val serviceAccountJson: JsonField<ServiceAccountJson>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("service_account_json")
                    @ExcludeMissing
                    serviceAccountJson: JsonField<ServiceAccountJson> = JsonMissing.of()
                ) : this(serviceAccountJson, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun serviceAccountJson(): ServiceAccountJson =
                    serviceAccountJson.getRequired("service_account_json")

                /**
                 * Returns the raw JSON value of [serviceAccountJson].
                 *
                 * Unlike [serviceAccountJson], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("service_account_json")
                @ExcludeMissing
                fun _serviceAccountJson(): JsonField<ServiceAccountJson> = serviceAccountJson

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
                     * Returns a mutable builder for constructing an instance of [Gcp].
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceAccountJson()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Gcp]. */
                class Builder internal constructor() {

                    private var serviceAccountJson: JsonField<ServiceAccountJson>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(gcp: Gcp) = apply {
                        serviceAccountJson = gcp.serviceAccountJson
                        additionalProperties = gcp.additionalProperties.toMutableMap()
                    }

                    fun serviceAccountJson(serviceAccountJson: ServiceAccountJson) =
                        serviceAccountJson(JsonField.of(serviceAccountJson))

                    /**
                     * Sets [Builder.serviceAccountJson] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serviceAccountJson] with a well-typed
                     * [ServiceAccountJson] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun serviceAccountJson(serviceAccountJson: JsonField<ServiceAccountJson>) =
                        apply {
                            this.serviceAccountJson = serviceAccountJson
                        }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Gcp].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceAccountJson()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Gcp =
                        Gcp(
                            checkRequired("serviceAccountJson", serviceAccountJson),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Gcp = apply {
                    if (validated) {
                        return@apply
                    }

                    serviceAccountJson().validate()
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
                    (serviceAccountJson.asKnown().getOrNull()?.validity() ?: 0)

                class ServiceAccountJson
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                         * Returns a mutable builder for constructing an instance of
                         * [ServiceAccountJson].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ServiceAccountJson]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(serviceAccountJson: ServiceAccountJson) = apply {
                            type = serviceAccountJson.type
                            isSet = serviceAccountJson.isSet
                            value = serviceAccountJson.value
                            additionalProperties =
                                serviceAccountJson.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ServiceAccountJson].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): ServiceAccountJson =
                            ServiceAccountJson(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): ServiceAccountJson = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
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
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ServiceAccountJson &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ServiceAccountJson{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Gcp &&
                        serviceAccountJson == other.serviceAccountJson &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(serviceAccountJson, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Gcp{serviceAccountJson=$serviceAccountJson, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Auth &&
                    aws == other.aws &&
                    gcp == other.gcp &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(aws, gcp, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Auth{aws=$aws, gcp=$gcp, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(using = Mount.Deserializer::class)
        @JsonSerialize(using = Mount.Serializer::class)
        class Mount
        private constructor(
            private val sandboxapiS3BucketMountSpec: SandboxapiS3BucketMountSpec? = null,
            private val sandboxapiGcsBucketMountSpec: SandboxapiGcsBucketMountSpec? = null,
            private val sandboxapiGitRepoMountSpec: SandboxapiGitRepoMountSpec? = null,
            private val _json: JsonValue? = null,
        ) {

            fun sandboxapiS3BucketMountSpec(): Optional<SandboxapiS3BucketMountSpec> =
                Optional.ofNullable(sandboxapiS3BucketMountSpec)

            fun sandboxapiGcsBucketMountSpec(): Optional<SandboxapiGcsBucketMountSpec> =
                Optional.ofNullable(sandboxapiGcsBucketMountSpec)

            fun sandboxapiGitRepoMountSpec(): Optional<SandboxapiGitRepoMountSpec> =
                Optional.ofNullable(sandboxapiGitRepoMountSpec)

            fun isSandboxapiS3BucketMountSpec(): Boolean = sandboxapiS3BucketMountSpec != null

            fun isSandboxapiGcsBucketMountSpec(): Boolean = sandboxapiGcsBucketMountSpec != null

            fun isSandboxapiGitRepoMountSpec(): Boolean = sandboxapiGitRepoMountSpec != null

            fun asSandboxapiS3BucketMountSpec(): SandboxapiS3BucketMountSpec =
                sandboxapiS3BucketMountSpec.getOrThrow("sandboxapiS3BucketMountSpec")

            fun asSandboxapiGcsBucketMountSpec(): SandboxapiGcsBucketMountSpec =
                sandboxapiGcsBucketMountSpec.getOrThrow("sandboxapiGcsBucketMountSpec")

            fun asSandboxapiGitRepoMountSpec(): SandboxapiGitRepoMountSpec =
                sandboxapiGitRepoMountSpec.getOrThrow("sandboxapiGitRepoMountSpec")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.langchain.smith.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = mount.accept(new Mount.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitSandboxapiS3BucketMountSpec(SandboxapiS3BucketMountSpec sandboxapiS3BucketMountSpec) {
             *         return Optional.of(sandboxapiS3BucketMountSpec.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws LangChainInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    sandboxapiS3BucketMountSpec != null ->
                        visitor.visitSandboxapiS3BucketMountSpec(sandboxapiS3BucketMountSpec)
                    sandboxapiGcsBucketMountSpec != null ->
                        visitor.visitSandboxapiGcsBucketMountSpec(sandboxapiGcsBucketMountSpec)
                    sandboxapiGitRepoMountSpec != null ->
                        visitor.visitSandboxapiGitRepoMountSpec(sandboxapiGitRepoMountSpec)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Mount = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitSandboxapiS3BucketMountSpec(
                            sandboxapiS3BucketMountSpec: SandboxapiS3BucketMountSpec
                        ) {
                            sandboxapiS3BucketMountSpec.validate()
                        }

                        override fun visitSandboxapiGcsBucketMountSpec(
                            sandboxapiGcsBucketMountSpec: SandboxapiGcsBucketMountSpec
                        ) {
                            sandboxapiGcsBucketMountSpec.validate()
                        }

                        override fun visitSandboxapiGitRepoMountSpec(
                            sandboxapiGitRepoMountSpec: SandboxapiGitRepoMountSpec
                        ) {
                            sandboxapiGitRepoMountSpec.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitSandboxapiS3BucketMountSpec(
                            sandboxapiS3BucketMountSpec: SandboxapiS3BucketMountSpec
                        ) = sandboxapiS3BucketMountSpec.validity()

                        override fun visitSandboxapiGcsBucketMountSpec(
                            sandboxapiGcsBucketMountSpec: SandboxapiGcsBucketMountSpec
                        ) = sandboxapiGcsBucketMountSpec.validity()

                        override fun visitSandboxapiGitRepoMountSpec(
                            sandboxapiGitRepoMountSpec: SandboxapiGitRepoMountSpec
                        ) = sandboxapiGitRepoMountSpec.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Mount &&
                    sandboxapiS3BucketMountSpec == other.sandboxapiS3BucketMountSpec &&
                    sandboxapiGcsBucketMountSpec == other.sandboxapiGcsBucketMountSpec &&
                    sandboxapiGitRepoMountSpec == other.sandboxapiGitRepoMountSpec
            }

            override fun hashCode(): Int =
                Objects.hash(
                    sandboxapiS3BucketMountSpec,
                    sandboxapiGcsBucketMountSpec,
                    sandboxapiGitRepoMountSpec,
                )

            override fun toString(): String =
                when {
                    sandboxapiS3BucketMountSpec != null ->
                        "Mount{sandboxapiS3BucketMountSpec=$sandboxapiS3BucketMountSpec}"
                    sandboxapiGcsBucketMountSpec != null ->
                        "Mount{sandboxapiGcsBucketMountSpec=$sandboxapiGcsBucketMountSpec}"
                    sandboxapiGitRepoMountSpec != null ->
                        "Mount{sandboxapiGitRepoMountSpec=$sandboxapiGitRepoMountSpec}"
                    _json != null -> "Mount{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Mount")
                }

            companion object {

                @JvmStatic
                fun ofSandboxapiS3BucketMountSpec(
                    sandboxapiS3BucketMountSpec: SandboxapiS3BucketMountSpec
                ) = Mount(sandboxapiS3BucketMountSpec = sandboxapiS3BucketMountSpec)

                @JvmStatic
                fun ofSandboxapiGcsBucketMountSpec(
                    sandboxapiGcsBucketMountSpec: SandboxapiGcsBucketMountSpec
                ) = Mount(sandboxapiGcsBucketMountSpec = sandboxapiGcsBucketMountSpec)

                @JvmStatic
                fun ofSandboxapiGitRepoMountSpec(
                    sandboxapiGitRepoMountSpec: SandboxapiGitRepoMountSpec
                ) = Mount(sandboxapiGitRepoMountSpec = sandboxapiGitRepoMountSpec)
            }

            /**
             * An interface that defines how to map each variant of [Mount] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitSandboxapiS3BucketMountSpec(
                    sandboxapiS3BucketMountSpec: SandboxapiS3BucketMountSpec
                ): T

                fun visitSandboxapiGcsBucketMountSpec(
                    sandboxapiGcsBucketMountSpec: SandboxapiGcsBucketMountSpec
                ): T

                fun visitSandboxapiGitRepoMountSpec(
                    sandboxapiGitRepoMountSpec: SandboxapiGitRepoMountSpec
                ): T

                /**
                 * Maps an unknown variant of [Mount] to a value of type [T].
                 *
                 * An instance of [Mount] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws LangChainInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LangChainInvalidDataException("Unknown Mount: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Mount>(Mount::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Mount {
                    val json = JsonValue.fromJsonNode(node)
                    val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                    when (type) {}

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<SandboxapiS3BucketMountSpec>())
                                    ?.let { Mount(sandboxapiS3BucketMountSpec = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<SandboxapiGcsBucketMountSpec>())
                                    ?.let {
                                        Mount(sandboxapiGcsBucketMountSpec = it, _json = json)
                                    },
                                tryDeserialize(node, jacksonTypeRef<SandboxapiGitRepoMountSpec>())
                                    ?.let { Mount(sandboxapiGitRepoMountSpec = it, _json = json) },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Mount(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Mount>(Mount::class) {

                override fun serialize(
                    value: Mount,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.sandboxapiS3BucketMountSpec != null ->
                            generator.writeObject(value.sandboxapiS3BucketMountSpec)
                        value.sandboxapiGcsBucketMountSpec != null ->
                            generator.writeObject(value.sandboxapiGcsBucketMountSpec)
                        value.sandboxapiGitRepoMountSpec != null ->
                            generator.writeObject(value.sandboxapiGitRepoMountSpec)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Mount")
                    }
                }
            }

            class SandboxapiS3BucketMountSpec
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val mountPath: JsonField<String>,
                private val s3: JsonField<S3>,
                private val type: JsonField<Type>,
                private val cache: JsonField<Cache>,
                private val gcs: JsonField<Gcs>,
                private val git: JsonField<Git>,
                private val readOnly: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("mount_path")
                    @ExcludeMissing
                    mountPath: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("s3") @ExcludeMissing s3: JsonField<S3> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("cache")
                    @ExcludeMissing
                    cache: JsonField<Cache> = JsonMissing.of(),
                    @JsonProperty("gcs") @ExcludeMissing gcs: JsonField<Gcs> = JsonMissing.of(),
                    @JsonProperty("git") @ExcludeMissing git: JsonField<Git> = JsonMissing.of(),
                    @JsonProperty("read_only")
                    @ExcludeMissing
                    readOnly: JsonField<Boolean> = JsonMissing.of(),
                ) : this(id, mountPath, s3, type, cache, gcs, git, readOnly, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun mountPath(): String = mountPath.getRequired("mount_path")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun s3(): S3 = s3.getRequired("s3")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun cache(): Optional<Cache> = cache.getOptional("cache")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun gcs(): Optional<Gcs> = gcs.getOptional("gcs")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun git(): Optional<Git> = git.getOptional("git")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun readOnly(): Optional<Boolean> = readOnly.getOptional("read_only")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [mountPath].
                 *
                 * Unlike [mountPath], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("mount_path")
                @ExcludeMissing
                fun _mountPath(): JsonField<String> = mountPath

                /**
                 * Returns the raw JSON value of [s3].
                 *
                 * Unlike [s3], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("s3") @ExcludeMissing fun _s3(): JsonField<S3> = s3

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [cache].
                 *
                 * Unlike [cache], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cache") @ExcludeMissing fun _cache(): JsonField<Cache> = cache

                /**
                 * Returns the raw JSON value of [gcs].
                 *
                 * Unlike [gcs], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("gcs") @ExcludeMissing fun _gcs(): JsonField<Gcs> = gcs

                /**
                 * Returns the raw JSON value of [git].
                 *
                 * Unlike [git], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("git") @ExcludeMissing fun _git(): JsonField<Git> = git

                /**
                 * Returns the raw JSON value of [readOnly].
                 *
                 * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("read_only")
                @ExcludeMissing
                fun _readOnly(): JsonField<Boolean> = readOnly

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
                     * Returns a mutable builder for constructing an instance of
                     * [SandboxapiS3BucketMountSpec].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .mountPath()
                     * .s3()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxapiS3BucketMountSpec]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var mountPath: JsonField<String>? = null
                    private var s3: JsonField<S3>? = null
                    private var type: JsonField<Type>? = null
                    private var cache: JsonField<Cache> = JsonMissing.of()
                    private var gcs: JsonField<Gcs> = JsonMissing.of()
                    private var git: JsonField<Git> = JsonMissing.of()
                    private var readOnly: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(sandboxapiS3BucketMountSpec: SandboxapiS3BucketMountSpec) =
                        apply {
                            id = sandboxapiS3BucketMountSpec.id
                            mountPath = sandboxapiS3BucketMountSpec.mountPath
                            s3 = sandboxapiS3BucketMountSpec.s3
                            type = sandboxapiS3BucketMountSpec.type
                            cache = sandboxapiS3BucketMountSpec.cache
                            gcs = sandboxapiS3BucketMountSpec.gcs
                            git = sandboxapiS3BucketMountSpec.git
                            readOnly = sandboxapiS3BucketMountSpec.readOnly
                            additionalProperties =
                                sandboxapiS3BucketMountSpec.additionalProperties.toMutableMap()
                        }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun mountPath(mountPath: String) = mountPath(JsonField.of(mountPath))

                    /**
                     * Sets [Builder.mountPath] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mountPath] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun mountPath(mountPath: JsonField<String>) = apply {
                        this.mountPath = mountPath
                    }

                    fun s3(s3: S3) = s3(JsonField.of(s3))

                    /**
                     * Sets [Builder.s3] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.s3] with a well-typed [S3] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun s3(s3: JsonField<S3>) = apply { this.s3 = s3 }

                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun cache(cache: Cache) = cache(JsonField.of(cache))

                    /**
                     * Sets [Builder.cache] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cache] with a well-typed [Cache] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cache(cache: JsonField<Cache>) = apply { this.cache = cache }

                    fun gcs(gcs: Gcs) = gcs(JsonField.of(gcs))

                    /**
                     * Sets [Builder.gcs] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gcs] with a well-typed [Gcs] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun gcs(gcs: JsonField<Gcs>) = apply { this.gcs = gcs }

                    fun git(git: Git) = git(JsonField.of(git))

                    /**
                     * Sets [Builder.git] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.git] with a well-typed [Git] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun git(git: JsonField<Git>) = apply { this.git = git }

                    fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

                    /**
                     * Sets [Builder.readOnly] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.readOnly] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [SandboxapiS3BucketMountSpec].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .mountPath()
                     * .s3()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxapiS3BucketMountSpec =
                        SandboxapiS3BucketMountSpec(
                            checkRequired("id", id),
                            checkRequired("mountPath", mountPath),
                            checkRequired("s3", s3),
                            checkRequired("type", type),
                            cache,
                            gcs,
                            git,
                            readOnly,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxapiS3BucketMountSpec = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    mountPath()
                    s3().validate()
                    type().validate()
                    cache().ifPresent { it.validate() }
                    gcs().ifPresent { it.validate() }
                    git().ifPresent { it.validate() }
                    readOnly()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (mountPath.asKnown().isPresent) 1 else 0) +
                        (s3.asKnown().getOrNull()?.validity() ?: 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (cache.asKnown().getOrNull()?.validity() ?: 0) +
                        (gcs.asKnown().getOrNull()?.validity() ?: 0) +
                        (git.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (readOnly.asKnown().isPresent) 1 else 0)

                class S3
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val bucket: JsonField<String>,
                    private val endpointUrl: JsonField<String>,
                    private val region: JsonField<String>,
                    private val pathStyle: JsonField<Boolean>,
                    private val prefix: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bucket")
                        @ExcludeMissing
                        bucket: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("endpoint_url")
                        @ExcludeMissing
                        endpointUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("region")
                        @ExcludeMissing
                        region: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("path_style")
                        @ExcludeMissing
                        pathStyle: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("prefix")
                        @ExcludeMissing
                        prefix: JsonField<String> = JsonMissing.of(),
                    ) : this(bucket, endpointUrl, region, pathStyle, prefix, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun bucket(): String = bucket.getRequired("bucket")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun endpointUrl(): String = endpointUrl.getRequired("endpoint_url")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun region(): String = region.getRequired("region")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun pathStyle(): Optional<Boolean> = pathStyle.getOptional("path_style")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun prefix(): Optional<String> = prefix.getOptional("prefix")

                    /**
                     * Returns the raw JSON value of [bucket].
                     *
                     * Unlike [bucket], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    fun _bucket(): JsonField<String> = bucket

                    /**
                     * Returns the raw JSON value of [endpointUrl].
                     *
                     * Unlike [endpointUrl], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("endpoint_url")
                    @ExcludeMissing
                    fun _endpointUrl(): JsonField<String> = endpointUrl

                    /**
                     * Returns the raw JSON value of [region].
                     *
                     * Unlike [region], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("region")
                    @ExcludeMissing
                    fun _region(): JsonField<String> = region

                    /**
                     * Returns the raw JSON value of [pathStyle].
                     *
                     * Unlike [pathStyle], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("path_style")
                    @ExcludeMissing
                    fun _pathStyle(): JsonField<Boolean> = pathStyle

                    /**
                     * Returns the raw JSON value of [prefix].
                     *
                     * Unlike [prefix], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    fun _prefix(): JsonField<String> = prefix

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
                         * Returns a mutable builder for constructing an instance of [S3].
                         *
                         * The following fields are required:
                         * ```java
                         * .bucket()
                         * .endpointUrl()
                         * .region()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [S3]. */
                    class Builder internal constructor() {

                        private var bucket: JsonField<String>? = null
                        private var endpointUrl: JsonField<String>? = null
                        private var region: JsonField<String>? = null
                        private var pathStyle: JsonField<Boolean> = JsonMissing.of()
                        private var prefix: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(s3: S3) = apply {
                            bucket = s3.bucket
                            endpointUrl = s3.endpointUrl
                            region = s3.region
                            pathStyle = s3.pathStyle
                            prefix = s3.prefix
                            additionalProperties = s3.additionalProperties.toMutableMap()
                        }

                        fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                        /**
                         * Sets [Builder.bucket] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bucket] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                        fun endpointUrl(endpointUrl: String) =
                            endpointUrl(JsonField.of(endpointUrl))

                        /**
                         * Sets [Builder.endpointUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.endpointUrl] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun endpointUrl(endpointUrl: JsonField<String>) = apply {
                            this.endpointUrl = endpointUrl
                        }

                        fun region(region: String) = region(JsonField.of(region))

                        /**
                         * Sets [Builder.region] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.region] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun region(region: JsonField<String>) = apply { this.region = region }

                        fun pathStyle(pathStyle: Boolean) = pathStyle(JsonField.of(pathStyle))

                        /**
                         * Sets [Builder.pathStyle] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.pathStyle] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun pathStyle(pathStyle: JsonField<Boolean>) = apply {
                            this.pathStyle = pathStyle
                        }

                        fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                        /**
                         * Sets [Builder.prefix] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.prefix] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [S3].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .bucket()
                         * .endpointUrl()
                         * .region()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): S3 =
                            S3(
                                checkRequired("bucket", bucket),
                                checkRequired("endpointUrl", endpointUrl),
                                checkRequired("region", region),
                                pathStyle,
                                prefix,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): S3 = apply {
                        if (validated) {
                            return@apply
                        }

                        bucket()
                        endpointUrl()
                        region()
                        pathStyle()
                        prefix()
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
                        (if (bucket.asKnown().isPresent) 1 else 0) +
                            (if (endpointUrl.asKnown().isPresent) 1 else 0) +
                            (if (region.asKnown().isPresent) 1 else 0) +
                            (if (pathStyle.asKnown().isPresent) 1 else 0) +
                            (if (prefix.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is S3 &&
                            bucket == other.bucket &&
                            endpointUrl == other.endpointUrl &&
                            region == other.region &&
                            pathStyle == other.pathStyle &&
                            prefix == other.prefix &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            bucket,
                            endpointUrl,
                            region,
                            pathStyle,
                            prefix,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "S3{bucket=$bucket, endpointUrl=$endpointUrl, region=$region, pathStyle=$pathStyle, prefix=$prefix, additionalProperties=$additionalProperties}"
                }

                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val S3 = of("s3")

                        @JvmField val GCS = of("gcs")

                        @JvmField val GIT = of("git")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        S3,
                        GCS,
                        GIT,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        S3,
                        GCS,
                        GIT,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            S3 -> Value.S3
                            GCS -> Value.GCS
                            GIT -> Value.GIT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            S3 -> Known.S3
                            GCS -> Known.GCS
                            GIT -> Known.GIT
                            else -> throw LangChainInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LangChainInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Type = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Cache
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val maxSizeBytes: JsonField<Long>,
                    private val writebackSeconds: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("max_size_bytes")
                        @ExcludeMissing
                        maxSizeBytes: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("writeback_seconds")
                        @ExcludeMissing
                        writebackSeconds: JsonField<Long> = JsonMissing.of(),
                    ) : this(maxSizeBytes, writebackSeconds, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun maxSizeBytes(): Optional<Long> = maxSizeBytes.getOptional("max_size_bytes")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun writebackSeconds(): Optional<Long> =
                        writebackSeconds.getOptional("writeback_seconds")

                    /**
                     * Returns the raw JSON value of [maxSizeBytes].
                     *
                     * Unlike [maxSizeBytes], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("max_size_bytes")
                    @ExcludeMissing
                    fun _maxSizeBytes(): JsonField<Long> = maxSizeBytes

                    /**
                     * Returns the raw JSON value of [writebackSeconds].
                     *
                     * Unlike [writebackSeconds], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("writeback_seconds")
                    @ExcludeMissing
                    fun _writebackSeconds(): JsonField<Long> = writebackSeconds

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

                        /** Returns a mutable builder for constructing an instance of [Cache]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Cache]. */
                    class Builder internal constructor() {

                        private var maxSizeBytes: JsonField<Long> = JsonMissing.of()
                        private var writebackSeconds: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(cache: Cache) = apply {
                            maxSizeBytes = cache.maxSizeBytes
                            writebackSeconds = cache.writebackSeconds
                            additionalProperties = cache.additionalProperties.toMutableMap()
                        }

                        fun maxSizeBytes(maxSizeBytes: Long) =
                            maxSizeBytes(JsonField.of(maxSizeBytes))

                        /**
                         * Sets [Builder.maxSizeBytes] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.maxSizeBytes] with a well-typed [Long]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun maxSizeBytes(maxSizeBytes: JsonField<Long>) = apply {
                            this.maxSizeBytes = maxSizeBytes
                        }

                        fun writebackSeconds(writebackSeconds: Long) =
                            writebackSeconds(JsonField.of(writebackSeconds))

                        /**
                         * Sets [Builder.writebackSeconds] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.writebackSeconds] with a well-typed
                         * [Long] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun writebackSeconds(writebackSeconds: JsonField<Long>) = apply {
                            this.writebackSeconds = writebackSeconds
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Cache].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Cache =
                            Cache(
                                maxSizeBytes,
                                writebackSeconds,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Cache = apply {
                        if (validated) {
                            return@apply
                        }

                        maxSizeBytes()
                        writebackSeconds()
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
                        (if (maxSizeBytes.asKnown().isPresent) 1 else 0) +
                            (if (writebackSeconds.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cache &&
                            maxSizeBytes == other.maxSizeBytes &&
                            writebackSeconds == other.writebackSeconds &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(maxSizeBytes, writebackSeconds, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Cache{maxSizeBytes=$maxSizeBytes, writebackSeconds=$writebackSeconds, additionalProperties=$additionalProperties}"
                }

                class Gcs
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val bucket: JsonField<String>,
                    private val prefix: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bucket")
                        @ExcludeMissing
                        bucket: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("prefix")
                        @ExcludeMissing
                        prefix: JsonField<String> = JsonMissing.of(),
                    ) : this(bucket, prefix, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun bucket(): String = bucket.getRequired("bucket")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun prefix(): Optional<String> = prefix.getOptional("prefix")

                    /**
                     * Returns the raw JSON value of [bucket].
                     *
                     * Unlike [bucket], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    fun _bucket(): JsonField<String> = bucket

                    /**
                     * Returns the raw JSON value of [prefix].
                     *
                     * Unlike [prefix], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    fun _prefix(): JsonField<String> = prefix

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
                         * Returns a mutable builder for constructing an instance of [Gcs].
                         *
                         * The following fields are required:
                         * ```java
                         * .bucket()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Gcs]. */
                    class Builder internal constructor() {

                        private var bucket: JsonField<String>? = null
                        private var prefix: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(gcs: Gcs) = apply {
                            bucket = gcs.bucket
                            prefix = gcs.prefix
                            additionalProperties = gcs.additionalProperties.toMutableMap()
                        }

                        fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                        /**
                         * Sets [Builder.bucket] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bucket] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                        fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                        /**
                         * Sets [Builder.prefix] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.prefix] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Gcs].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .bucket()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Gcs =
                            Gcs(
                                checkRequired("bucket", bucket),
                                prefix,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Gcs = apply {
                        if (validated) {
                            return@apply
                        }

                        bucket()
                        prefix()
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
                        (if (bucket.asKnown().isPresent) 1 else 0) +
                            (if (prefix.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Gcs &&
                            bucket == other.bucket &&
                            prefix == other.prefix &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(bucket, prefix, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Gcs{bucket=$bucket, prefix=$prefix, additionalProperties=$additionalProperties}"
                }

                class Git
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val remoteUrl: JsonField<String>,
                    private val ref: JsonField<Ref>,
                    private val refreshIntervalSeconds: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("remote_url")
                        @ExcludeMissing
                        remoteUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("ref") @ExcludeMissing ref: JsonField<Ref> = JsonMissing.of(),
                        @JsonProperty("refresh_interval_seconds")
                        @ExcludeMissing
                        refreshIntervalSeconds: JsonField<Long> = JsonMissing.of(),
                    ) : this(remoteUrl, ref, refreshIntervalSeconds, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun remoteUrl(): String = remoteUrl.getRequired("remote_url")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun ref(): Optional<Ref> = ref.getOptional("ref")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun refreshIntervalSeconds(): Optional<Long> =
                        refreshIntervalSeconds.getOptional("refresh_interval_seconds")

                    /**
                     * Returns the raw JSON value of [remoteUrl].
                     *
                     * Unlike [remoteUrl], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("remote_url")
                    @ExcludeMissing
                    fun _remoteUrl(): JsonField<String> = remoteUrl

                    /**
                     * Returns the raw JSON value of [ref].
                     *
                     * Unlike [ref], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<Ref> = ref

                    /**
                     * Returns the raw JSON value of [refreshIntervalSeconds].
                     *
                     * Unlike [refreshIntervalSeconds], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("refresh_interval_seconds")
                    @ExcludeMissing
                    fun _refreshIntervalSeconds(): JsonField<Long> = refreshIntervalSeconds

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
                         * Returns a mutable builder for constructing an instance of [Git].
                         *
                         * The following fields are required:
                         * ```java
                         * .remoteUrl()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Git]. */
                    class Builder internal constructor() {

                        private var remoteUrl: JsonField<String>? = null
                        private var ref: JsonField<Ref> = JsonMissing.of()
                        private var refreshIntervalSeconds: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(git: Git) = apply {
                            remoteUrl = git.remoteUrl
                            ref = git.ref
                            refreshIntervalSeconds = git.refreshIntervalSeconds
                            additionalProperties = git.additionalProperties.toMutableMap()
                        }

                        fun remoteUrl(remoteUrl: String) = remoteUrl(JsonField.of(remoteUrl))

                        /**
                         * Sets [Builder.remoteUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.remoteUrl] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun remoteUrl(remoteUrl: JsonField<String>) = apply {
                            this.remoteUrl = remoteUrl
                        }

                        fun ref(ref: Ref) = ref(JsonField.of(ref))

                        /**
                         * Sets [Builder.ref] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.ref] with a well-typed [Ref] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun ref(ref: JsonField<Ref>) = apply { this.ref = ref }

                        fun refreshIntervalSeconds(refreshIntervalSeconds: Long) =
                            refreshIntervalSeconds(JsonField.of(refreshIntervalSeconds))

                        /**
                         * Sets [Builder.refreshIntervalSeconds] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.refreshIntervalSeconds] with a
                         * well-typed [Long] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun refreshIntervalSeconds(refreshIntervalSeconds: JsonField<Long>) =
                            apply {
                                this.refreshIntervalSeconds = refreshIntervalSeconds
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Git].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .remoteUrl()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Git =
                            Git(
                                checkRequired("remoteUrl", remoteUrl),
                                ref,
                                refreshIntervalSeconds,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Git = apply {
                        if (validated) {
                            return@apply
                        }

                        remoteUrl()
                        ref().ifPresent { it.validate() }
                        refreshIntervalSeconds()
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
                        (if (remoteUrl.asKnown().isPresent) 1 else 0) +
                            (ref.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (refreshIntervalSeconds.asKnown().isPresent) 1 else 0)

                    class Ref
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val name: JsonField<String>,
                        private val type: JsonField<Type>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("name")
                            @ExcludeMissing
                            name: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Type> = JsonMissing.of(),
                        ) : this(name, type, mutableMapOf())

                        /**
                         * @throws LangChainInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun name(): String = name.getRequired("name")

                        /**
                         * @throws LangChainInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun type(): Type = type.getRequired("type")

                        /**
                         * Returns the raw JSON value of [name].
                         *
                         * Unlike [name], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                             * Returns a mutable builder for constructing an instance of [Ref].
                             *
                             * The following fields are required:
                             * ```java
                             * .name()
                             * .type()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Ref]. */
                        class Builder internal constructor() {

                            private var name: JsonField<String>? = null
                            private var type: JsonField<Type>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(ref: Ref) = apply {
                                name = ref.name
                                type = ref.type
                                additionalProperties = ref.additionalProperties.toMutableMap()
                            }

                            fun name(name: String) = name(JsonField.of(name))

                            /**
                             * Sets [Builder.name] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.name] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun name(name: JsonField<String>) = apply { this.name = name }

                            fun type(type: Type) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Type] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Ref].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .name()
                             * .type()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Ref =
                                Ref(
                                    checkRequired("name", name),
                                    checkRequired("type", type),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Ref = apply {
                            if (validated) {
                                return@apply
                            }

                            name()
                            type().validate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (name.asKnown().isPresent) 1 else 0) +
                                (type.asKnown().getOrNull()?.validity() ?: 0)

                        class Type
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val BRANCH = of("branch")

                                @JvmField val TAG = of("tag")

                                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                            }

                            /** An enum containing [Type]'s known values. */
                            enum class Known {
                                BRANCH,
                                TAG,
                            }

                            /**
                             * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Type] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                BRANCH,
                                TAG,
                                /**
                                 * An enum member indicating that [Type] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    BRANCH -> Value.BRANCH
                                    TAG -> Value.TAG
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LangChainInvalidDataException if this class instance's value
                             *   is a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    BRANCH -> Known.BRANCH
                                    TAG -> Known.TAG
                                    else ->
                                        throw LangChainInvalidDataException("Unknown Type: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LangChainInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    LangChainInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LangChainInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): Type = apply {
                                if (validated) {
                                    return@apply
                                }

                                known()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Ref &&
                                name == other.name &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(name, type, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Ref{name=$name, type=$type, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Git &&
                            remoteUrl == other.remoteUrl &&
                            ref == other.ref &&
                            refreshIntervalSeconds == other.refreshIntervalSeconds &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(remoteUrl, ref, refreshIntervalSeconds, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Git{remoteUrl=$remoteUrl, ref=$ref, refreshIntervalSeconds=$refreshIntervalSeconds, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxapiS3BucketMountSpec &&
                        id == other.id &&
                        mountPath == other.mountPath &&
                        s3 == other.s3 &&
                        type == other.type &&
                        cache == other.cache &&
                        gcs == other.gcs &&
                        git == other.git &&
                        readOnly == other.readOnly &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        mountPath,
                        s3,
                        type,
                        cache,
                        gcs,
                        git,
                        readOnly,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxapiS3BucketMountSpec{id=$id, mountPath=$mountPath, s3=$s3, type=$type, cache=$cache, gcs=$gcs, git=$git, readOnly=$readOnly, additionalProperties=$additionalProperties}"
            }

            class SandboxapiGcsBucketMountSpec
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val gcs: JsonField<Gcs>,
                private val mountPath: JsonField<String>,
                private val type: JsonField<Type>,
                private val cache: JsonField<Cache>,
                private val git: JsonField<Git>,
                private val readOnly: JsonField<Boolean>,
                private val s3: JsonField<S3>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("gcs") @ExcludeMissing gcs: JsonField<Gcs> = JsonMissing.of(),
                    @JsonProperty("mount_path")
                    @ExcludeMissing
                    mountPath: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("cache")
                    @ExcludeMissing
                    cache: JsonField<Cache> = JsonMissing.of(),
                    @JsonProperty("git") @ExcludeMissing git: JsonField<Git> = JsonMissing.of(),
                    @JsonProperty("read_only")
                    @ExcludeMissing
                    readOnly: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("s3") @ExcludeMissing s3: JsonField<S3> = JsonMissing.of(),
                ) : this(id, gcs, mountPath, type, cache, git, readOnly, s3, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun gcs(): Gcs = gcs.getRequired("gcs")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun mountPath(): String = mountPath.getRequired("mount_path")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun cache(): Optional<Cache> = cache.getOptional("cache")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun git(): Optional<Git> = git.getOptional("git")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun readOnly(): Optional<Boolean> = readOnly.getOptional("read_only")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun s3(): Optional<S3> = s3.getOptional("s3")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [gcs].
                 *
                 * Unlike [gcs], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("gcs") @ExcludeMissing fun _gcs(): JsonField<Gcs> = gcs

                /**
                 * Returns the raw JSON value of [mountPath].
                 *
                 * Unlike [mountPath], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("mount_path")
                @ExcludeMissing
                fun _mountPath(): JsonField<String> = mountPath

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [cache].
                 *
                 * Unlike [cache], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cache") @ExcludeMissing fun _cache(): JsonField<Cache> = cache

                /**
                 * Returns the raw JSON value of [git].
                 *
                 * Unlike [git], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("git") @ExcludeMissing fun _git(): JsonField<Git> = git

                /**
                 * Returns the raw JSON value of [readOnly].
                 *
                 * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("read_only")
                @ExcludeMissing
                fun _readOnly(): JsonField<Boolean> = readOnly

                /**
                 * Returns the raw JSON value of [s3].
                 *
                 * Unlike [s3], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("s3") @ExcludeMissing fun _s3(): JsonField<S3> = s3

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
                     * Returns a mutable builder for constructing an instance of
                     * [SandboxapiGcsBucketMountSpec].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .gcs()
                     * .mountPath()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxapiGcsBucketMountSpec]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var gcs: JsonField<Gcs>? = null
                    private var mountPath: JsonField<String>? = null
                    private var type: JsonField<Type>? = null
                    private var cache: JsonField<Cache> = JsonMissing.of()
                    private var git: JsonField<Git> = JsonMissing.of()
                    private var readOnly: JsonField<Boolean> = JsonMissing.of()
                    private var s3: JsonField<S3> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(sandboxapiGcsBucketMountSpec: SandboxapiGcsBucketMountSpec) =
                        apply {
                            id = sandboxapiGcsBucketMountSpec.id
                            gcs = sandboxapiGcsBucketMountSpec.gcs
                            mountPath = sandboxapiGcsBucketMountSpec.mountPath
                            type = sandboxapiGcsBucketMountSpec.type
                            cache = sandboxapiGcsBucketMountSpec.cache
                            git = sandboxapiGcsBucketMountSpec.git
                            readOnly = sandboxapiGcsBucketMountSpec.readOnly
                            s3 = sandboxapiGcsBucketMountSpec.s3
                            additionalProperties =
                                sandboxapiGcsBucketMountSpec.additionalProperties.toMutableMap()
                        }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun gcs(gcs: Gcs) = gcs(JsonField.of(gcs))

                    /**
                     * Sets [Builder.gcs] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gcs] with a well-typed [Gcs] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun gcs(gcs: JsonField<Gcs>) = apply { this.gcs = gcs }

                    fun mountPath(mountPath: String) = mountPath(JsonField.of(mountPath))

                    /**
                     * Sets [Builder.mountPath] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mountPath] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun mountPath(mountPath: JsonField<String>) = apply {
                        this.mountPath = mountPath
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun cache(cache: Cache) = cache(JsonField.of(cache))

                    /**
                     * Sets [Builder.cache] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cache] with a well-typed [Cache] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cache(cache: JsonField<Cache>) = apply { this.cache = cache }

                    fun git(git: Git) = git(JsonField.of(git))

                    /**
                     * Sets [Builder.git] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.git] with a well-typed [Git] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun git(git: JsonField<Git>) = apply { this.git = git }

                    fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

                    /**
                     * Sets [Builder.readOnly] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.readOnly] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

                    fun s3(s3: S3) = s3(JsonField.of(s3))

                    /**
                     * Sets [Builder.s3] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.s3] with a well-typed [S3] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun s3(s3: JsonField<S3>) = apply { this.s3 = s3 }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [SandboxapiGcsBucketMountSpec].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .gcs()
                     * .mountPath()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxapiGcsBucketMountSpec =
                        SandboxapiGcsBucketMountSpec(
                            checkRequired("id", id),
                            checkRequired("gcs", gcs),
                            checkRequired("mountPath", mountPath),
                            checkRequired("type", type),
                            cache,
                            git,
                            readOnly,
                            s3,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxapiGcsBucketMountSpec = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    gcs().validate()
                    mountPath()
                    type().validate()
                    cache().ifPresent { it.validate() }
                    git().ifPresent { it.validate() }
                    readOnly()
                    s3().ifPresent { it.validate() }
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (gcs.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (mountPath.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (cache.asKnown().getOrNull()?.validity() ?: 0) +
                        (git.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (readOnly.asKnown().isPresent) 1 else 0) +
                        (s3.asKnown().getOrNull()?.validity() ?: 0)

                class Gcs
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val bucket: JsonField<String>,
                    private val prefix: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bucket")
                        @ExcludeMissing
                        bucket: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("prefix")
                        @ExcludeMissing
                        prefix: JsonField<String> = JsonMissing.of(),
                    ) : this(bucket, prefix, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun bucket(): String = bucket.getRequired("bucket")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun prefix(): Optional<String> = prefix.getOptional("prefix")

                    /**
                     * Returns the raw JSON value of [bucket].
                     *
                     * Unlike [bucket], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    fun _bucket(): JsonField<String> = bucket

                    /**
                     * Returns the raw JSON value of [prefix].
                     *
                     * Unlike [prefix], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    fun _prefix(): JsonField<String> = prefix

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
                         * Returns a mutable builder for constructing an instance of [Gcs].
                         *
                         * The following fields are required:
                         * ```java
                         * .bucket()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Gcs]. */
                    class Builder internal constructor() {

                        private var bucket: JsonField<String>? = null
                        private var prefix: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(gcs: Gcs) = apply {
                            bucket = gcs.bucket
                            prefix = gcs.prefix
                            additionalProperties = gcs.additionalProperties.toMutableMap()
                        }

                        fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                        /**
                         * Sets [Builder.bucket] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bucket] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                        fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                        /**
                         * Sets [Builder.prefix] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.prefix] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Gcs].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .bucket()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Gcs =
                            Gcs(
                                checkRequired("bucket", bucket),
                                prefix,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Gcs = apply {
                        if (validated) {
                            return@apply
                        }

                        bucket()
                        prefix()
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
                        (if (bucket.asKnown().isPresent) 1 else 0) +
                            (if (prefix.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Gcs &&
                            bucket == other.bucket &&
                            prefix == other.prefix &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(bucket, prefix, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Gcs{bucket=$bucket, prefix=$prefix, additionalProperties=$additionalProperties}"
                }

                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val S3 = of("s3")

                        @JvmField val GCS = of("gcs")

                        @JvmField val GIT = of("git")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        S3,
                        GCS,
                        GIT,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        S3,
                        GCS,
                        GIT,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            S3 -> Value.S3
                            GCS -> Value.GCS
                            GIT -> Value.GIT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            S3 -> Known.S3
                            GCS -> Known.GCS
                            GIT -> Known.GIT
                            else -> throw LangChainInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LangChainInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Type = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Cache
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val maxSizeBytes: JsonField<Long>,
                    private val writebackSeconds: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("max_size_bytes")
                        @ExcludeMissing
                        maxSizeBytes: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("writeback_seconds")
                        @ExcludeMissing
                        writebackSeconds: JsonField<Long> = JsonMissing.of(),
                    ) : this(maxSizeBytes, writebackSeconds, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun maxSizeBytes(): Optional<Long> = maxSizeBytes.getOptional("max_size_bytes")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun writebackSeconds(): Optional<Long> =
                        writebackSeconds.getOptional("writeback_seconds")

                    /**
                     * Returns the raw JSON value of [maxSizeBytes].
                     *
                     * Unlike [maxSizeBytes], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("max_size_bytes")
                    @ExcludeMissing
                    fun _maxSizeBytes(): JsonField<Long> = maxSizeBytes

                    /**
                     * Returns the raw JSON value of [writebackSeconds].
                     *
                     * Unlike [writebackSeconds], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("writeback_seconds")
                    @ExcludeMissing
                    fun _writebackSeconds(): JsonField<Long> = writebackSeconds

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

                        /** Returns a mutable builder for constructing an instance of [Cache]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Cache]. */
                    class Builder internal constructor() {

                        private var maxSizeBytes: JsonField<Long> = JsonMissing.of()
                        private var writebackSeconds: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(cache: Cache) = apply {
                            maxSizeBytes = cache.maxSizeBytes
                            writebackSeconds = cache.writebackSeconds
                            additionalProperties = cache.additionalProperties.toMutableMap()
                        }

                        fun maxSizeBytes(maxSizeBytes: Long) =
                            maxSizeBytes(JsonField.of(maxSizeBytes))

                        /**
                         * Sets [Builder.maxSizeBytes] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.maxSizeBytes] with a well-typed [Long]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun maxSizeBytes(maxSizeBytes: JsonField<Long>) = apply {
                            this.maxSizeBytes = maxSizeBytes
                        }

                        fun writebackSeconds(writebackSeconds: Long) =
                            writebackSeconds(JsonField.of(writebackSeconds))

                        /**
                         * Sets [Builder.writebackSeconds] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.writebackSeconds] with a well-typed
                         * [Long] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun writebackSeconds(writebackSeconds: JsonField<Long>) = apply {
                            this.writebackSeconds = writebackSeconds
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Cache].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Cache =
                            Cache(
                                maxSizeBytes,
                                writebackSeconds,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Cache = apply {
                        if (validated) {
                            return@apply
                        }

                        maxSizeBytes()
                        writebackSeconds()
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
                        (if (maxSizeBytes.asKnown().isPresent) 1 else 0) +
                            (if (writebackSeconds.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cache &&
                            maxSizeBytes == other.maxSizeBytes &&
                            writebackSeconds == other.writebackSeconds &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(maxSizeBytes, writebackSeconds, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Cache{maxSizeBytes=$maxSizeBytes, writebackSeconds=$writebackSeconds, additionalProperties=$additionalProperties}"
                }

                class Git
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val remoteUrl: JsonField<String>,
                    private val ref: JsonField<Ref>,
                    private val refreshIntervalSeconds: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("remote_url")
                        @ExcludeMissing
                        remoteUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("ref") @ExcludeMissing ref: JsonField<Ref> = JsonMissing.of(),
                        @JsonProperty("refresh_interval_seconds")
                        @ExcludeMissing
                        refreshIntervalSeconds: JsonField<Long> = JsonMissing.of(),
                    ) : this(remoteUrl, ref, refreshIntervalSeconds, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun remoteUrl(): String = remoteUrl.getRequired("remote_url")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun ref(): Optional<Ref> = ref.getOptional("ref")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun refreshIntervalSeconds(): Optional<Long> =
                        refreshIntervalSeconds.getOptional("refresh_interval_seconds")

                    /**
                     * Returns the raw JSON value of [remoteUrl].
                     *
                     * Unlike [remoteUrl], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("remote_url")
                    @ExcludeMissing
                    fun _remoteUrl(): JsonField<String> = remoteUrl

                    /**
                     * Returns the raw JSON value of [ref].
                     *
                     * Unlike [ref], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<Ref> = ref

                    /**
                     * Returns the raw JSON value of [refreshIntervalSeconds].
                     *
                     * Unlike [refreshIntervalSeconds], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("refresh_interval_seconds")
                    @ExcludeMissing
                    fun _refreshIntervalSeconds(): JsonField<Long> = refreshIntervalSeconds

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
                         * Returns a mutable builder for constructing an instance of [Git].
                         *
                         * The following fields are required:
                         * ```java
                         * .remoteUrl()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Git]. */
                    class Builder internal constructor() {

                        private var remoteUrl: JsonField<String>? = null
                        private var ref: JsonField<Ref> = JsonMissing.of()
                        private var refreshIntervalSeconds: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(git: Git) = apply {
                            remoteUrl = git.remoteUrl
                            ref = git.ref
                            refreshIntervalSeconds = git.refreshIntervalSeconds
                            additionalProperties = git.additionalProperties.toMutableMap()
                        }

                        fun remoteUrl(remoteUrl: String) = remoteUrl(JsonField.of(remoteUrl))

                        /**
                         * Sets [Builder.remoteUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.remoteUrl] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun remoteUrl(remoteUrl: JsonField<String>) = apply {
                            this.remoteUrl = remoteUrl
                        }

                        fun ref(ref: Ref) = ref(JsonField.of(ref))

                        /**
                         * Sets [Builder.ref] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.ref] with a well-typed [Ref] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun ref(ref: JsonField<Ref>) = apply { this.ref = ref }

                        fun refreshIntervalSeconds(refreshIntervalSeconds: Long) =
                            refreshIntervalSeconds(JsonField.of(refreshIntervalSeconds))

                        /**
                         * Sets [Builder.refreshIntervalSeconds] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.refreshIntervalSeconds] with a
                         * well-typed [Long] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun refreshIntervalSeconds(refreshIntervalSeconds: JsonField<Long>) =
                            apply {
                                this.refreshIntervalSeconds = refreshIntervalSeconds
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Git].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .remoteUrl()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Git =
                            Git(
                                checkRequired("remoteUrl", remoteUrl),
                                ref,
                                refreshIntervalSeconds,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Git = apply {
                        if (validated) {
                            return@apply
                        }

                        remoteUrl()
                        ref().ifPresent { it.validate() }
                        refreshIntervalSeconds()
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
                        (if (remoteUrl.asKnown().isPresent) 1 else 0) +
                            (ref.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (refreshIntervalSeconds.asKnown().isPresent) 1 else 0)

                    class Ref
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val name: JsonField<String>,
                        private val type: JsonField<Type>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("name")
                            @ExcludeMissing
                            name: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Type> = JsonMissing.of(),
                        ) : this(name, type, mutableMapOf())

                        /**
                         * @throws LangChainInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun name(): String = name.getRequired("name")

                        /**
                         * @throws LangChainInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun type(): Type = type.getRequired("type")

                        /**
                         * Returns the raw JSON value of [name].
                         *
                         * Unlike [name], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                             * Returns a mutable builder for constructing an instance of [Ref].
                             *
                             * The following fields are required:
                             * ```java
                             * .name()
                             * .type()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Ref]. */
                        class Builder internal constructor() {

                            private var name: JsonField<String>? = null
                            private var type: JsonField<Type>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(ref: Ref) = apply {
                                name = ref.name
                                type = ref.type
                                additionalProperties = ref.additionalProperties.toMutableMap()
                            }

                            fun name(name: String) = name(JsonField.of(name))

                            /**
                             * Sets [Builder.name] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.name] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun name(name: JsonField<String>) = apply { this.name = name }

                            fun type(type: Type) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Type] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Ref].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .name()
                             * .type()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Ref =
                                Ref(
                                    checkRequired("name", name),
                                    checkRequired("type", type),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Ref = apply {
                            if (validated) {
                                return@apply
                            }

                            name()
                            type().validate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (name.asKnown().isPresent) 1 else 0) +
                                (type.asKnown().getOrNull()?.validity() ?: 0)

                        class Type
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val BRANCH = of("branch")

                                @JvmField val TAG = of("tag")

                                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                            }

                            /** An enum containing [Type]'s known values. */
                            enum class Known {
                                BRANCH,
                                TAG,
                            }

                            /**
                             * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Type] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                BRANCH,
                                TAG,
                                /**
                                 * An enum member indicating that [Type] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    BRANCH -> Value.BRANCH
                                    TAG -> Value.TAG
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LangChainInvalidDataException if this class instance's value
                             *   is a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    BRANCH -> Known.BRANCH
                                    TAG -> Known.TAG
                                    else ->
                                        throw LangChainInvalidDataException("Unknown Type: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LangChainInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    LangChainInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LangChainInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): Type = apply {
                                if (validated) {
                                    return@apply
                                }

                                known()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Ref &&
                                name == other.name &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(name, type, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Ref{name=$name, type=$type, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Git &&
                            remoteUrl == other.remoteUrl &&
                            ref == other.ref &&
                            refreshIntervalSeconds == other.refreshIntervalSeconds &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(remoteUrl, ref, refreshIntervalSeconds, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Git{remoteUrl=$remoteUrl, ref=$ref, refreshIntervalSeconds=$refreshIntervalSeconds, additionalProperties=$additionalProperties}"
                }

                class S3
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val bucket: JsonField<String>,
                    private val endpointUrl: JsonField<String>,
                    private val region: JsonField<String>,
                    private val pathStyle: JsonField<Boolean>,
                    private val prefix: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bucket")
                        @ExcludeMissing
                        bucket: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("endpoint_url")
                        @ExcludeMissing
                        endpointUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("region")
                        @ExcludeMissing
                        region: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("path_style")
                        @ExcludeMissing
                        pathStyle: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("prefix")
                        @ExcludeMissing
                        prefix: JsonField<String> = JsonMissing.of(),
                    ) : this(bucket, endpointUrl, region, pathStyle, prefix, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun bucket(): String = bucket.getRequired("bucket")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun endpointUrl(): String = endpointUrl.getRequired("endpoint_url")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun region(): String = region.getRequired("region")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun pathStyle(): Optional<Boolean> = pathStyle.getOptional("path_style")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun prefix(): Optional<String> = prefix.getOptional("prefix")

                    /**
                     * Returns the raw JSON value of [bucket].
                     *
                     * Unlike [bucket], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    fun _bucket(): JsonField<String> = bucket

                    /**
                     * Returns the raw JSON value of [endpointUrl].
                     *
                     * Unlike [endpointUrl], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("endpoint_url")
                    @ExcludeMissing
                    fun _endpointUrl(): JsonField<String> = endpointUrl

                    /**
                     * Returns the raw JSON value of [region].
                     *
                     * Unlike [region], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("region")
                    @ExcludeMissing
                    fun _region(): JsonField<String> = region

                    /**
                     * Returns the raw JSON value of [pathStyle].
                     *
                     * Unlike [pathStyle], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("path_style")
                    @ExcludeMissing
                    fun _pathStyle(): JsonField<Boolean> = pathStyle

                    /**
                     * Returns the raw JSON value of [prefix].
                     *
                     * Unlike [prefix], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    fun _prefix(): JsonField<String> = prefix

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
                         * Returns a mutable builder for constructing an instance of [S3].
                         *
                         * The following fields are required:
                         * ```java
                         * .bucket()
                         * .endpointUrl()
                         * .region()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [S3]. */
                    class Builder internal constructor() {

                        private var bucket: JsonField<String>? = null
                        private var endpointUrl: JsonField<String>? = null
                        private var region: JsonField<String>? = null
                        private var pathStyle: JsonField<Boolean> = JsonMissing.of()
                        private var prefix: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(s3: S3) = apply {
                            bucket = s3.bucket
                            endpointUrl = s3.endpointUrl
                            region = s3.region
                            pathStyle = s3.pathStyle
                            prefix = s3.prefix
                            additionalProperties = s3.additionalProperties.toMutableMap()
                        }

                        fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                        /**
                         * Sets [Builder.bucket] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bucket] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                        fun endpointUrl(endpointUrl: String) =
                            endpointUrl(JsonField.of(endpointUrl))

                        /**
                         * Sets [Builder.endpointUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.endpointUrl] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun endpointUrl(endpointUrl: JsonField<String>) = apply {
                            this.endpointUrl = endpointUrl
                        }

                        fun region(region: String) = region(JsonField.of(region))

                        /**
                         * Sets [Builder.region] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.region] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun region(region: JsonField<String>) = apply { this.region = region }

                        fun pathStyle(pathStyle: Boolean) = pathStyle(JsonField.of(pathStyle))

                        /**
                         * Sets [Builder.pathStyle] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.pathStyle] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun pathStyle(pathStyle: JsonField<Boolean>) = apply {
                            this.pathStyle = pathStyle
                        }

                        fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                        /**
                         * Sets [Builder.prefix] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.prefix] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [S3].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .bucket()
                         * .endpointUrl()
                         * .region()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): S3 =
                            S3(
                                checkRequired("bucket", bucket),
                                checkRequired("endpointUrl", endpointUrl),
                                checkRequired("region", region),
                                pathStyle,
                                prefix,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): S3 = apply {
                        if (validated) {
                            return@apply
                        }

                        bucket()
                        endpointUrl()
                        region()
                        pathStyle()
                        prefix()
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
                        (if (bucket.asKnown().isPresent) 1 else 0) +
                            (if (endpointUrl.asKnown().isPresent) 1 else 0) +
                            (if (region.asKnown().isPresent) 1 else 0) +
                            (if (pathStyle.asKnown().isPresent) 1 else 0) +
                            (if (prefix.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is S3 &&
                            bucket == other.bucket &&
                            endpointUrl == other.endpointUrl &&
                            region == other.region &&
                            pathStyle == other.pathStyle &&
                            prefix == other.prefix &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            bucket,
                            endpointUrl,
                            region,
                            pathStyle,
                            prefix,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "S3{bucket=$bucket, endpointUrl=$endpointUrl, region=$region, pathStyle=$pathStyle, prefix=$prefix, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxapiGcsBucketMountSpec &&
                        id == other.id &&
                        gcs == other.gcs &&
                        mountPath == other.mountPath &&
                        type == other.type &&
                        cache == other.cache &&
                        git == other.git &&
                        readOnly == other.readOnly &&
                        s3 == other.s3 &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        gcs,
                        mountPath,
                        type,
                        cache,
                        git,
                        readOnly,
                        s3,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxapiGcsBucketMountSpec{id=$id, gcs=$gcs, mountPath=$mountPath, type=$type, cache=$cache, git=$git, readOnly=$readOnly, s3=$s3, additionalProperties=$additionalProperties}"
            }

            class SandboxapiGitRepoMountSpec
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val git: JsonField<Git>,
                private val mountPath: JsonField<String>,
                private val type: JsonField<Type>,
                private val cache: JsonField<Cache>,
                private val gcs: JsonField<Gcs>,
                private val readOnly: JsonField<Boolean>,
                private val s3: JsonField<S3>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("git") @ExcludeMissing git: JsonField<Git> = JsonMissing.of(),
                    @JsonProperty("mount_path")
                    @ExcludeMissing
                    mountPath: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("cache")
                    @ExcludeMissing
                    cache: JsonField<Cache> = JsonMissing.of(),
                    @JsonProperty("gcs") @ExcludeMissing gcs: JsonField<Gcs> = JsonMissing.of(),
                    @JsonProperty("read_only")
                    @ExcludeMissing
                    readOnly: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("s3") @ExcludeMissing s3: JsonField<S3> = JsonMissing.of(),
                ) : this(id, git, mountPath, type, cache, gcs, readOnly, s3, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun git(): Git = git.getRequired("git")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun mountPath(): String = mountPath.getRequired("mount_path")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun cache(): Optional<Cache> = cache.getOptional("cache")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun gcs(): Optional<Gcs> = gcs.getOptional("gcs")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun readOnly(): Optional<Boolean> = readOnly.getOptional("read_only")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun s3(): Optional<S3> = s3.getOptional("s3")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [git].
                 *
                 * Unlike [git], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("git") @ExcludeMissing fun _git(): JsonField<Git> = git

                /**
                 * Returns the raw JSON value of [mountPath].
                 *
                 * Unlike [mountPath], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("mount_path")
                @ExcludeMissing
                fun _mountPath(): JsonField<String> = mountPath

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [cache].
                 *
                 * Unlike [cache], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cache") @ExcludeMissing fun _cache(): JsonField<Cache> = cache

                /**
                 * Returns the raw JSON value of [gcs].
                 *
                 * Unlike [gcs], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("gcs") @ExcludeMissing fun _gcs(): JsonField<Gcs> = gcs

                /**
                 * Returns the raw JSON value of [readOnly].
                 *
                 * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("read_only")
                @ExcludeMissing
                fun _readOnly(): JsonField<Boolean> = readOnly

                /**
                 * Returns the raw JSON value of [s3].
                 *
                 * Unlike [s3], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("s3") @ExcludeMissing fun _s3(): JsonField<S3> = s3

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
                     * Returns a mutable builder for constructing an instance of
                     * [SandboxapiGitRepoMountSpec].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .git()
                     * .mountPath()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxapiGitRepoMountSpec]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var git: JsonField<Git>? = null
                    private var mountPath: JsonField<String>? = null
                    private var type: JsonField<Type>? = null
                    private var cache: JsonField<Cache> = JsonMissing.of()
                    private var gcs: JsonField<Gcs> = JsonMissing.of()
                    private var readOnly: JsonField<Boolean> = JsonMissing.of()
                    private var s3: JsonField<S3> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(sandboxapiGitRepoMountSpec: SandboxapiGitRepoMountSpec) =
                        apply {
                            id = sandboxapiGitRepoMountSpec.id
                            git = sandboxapiGitRepoMountSpec.git
                            mountPath = sandboxapiGitRepoMountSpec.mountPath
                            type = sandboxapiGitRepoMountSpec.type
                            cache = sandboxapiGitRepoMountSpec.cache
                            gcs = sandboxapiGitRepoMountSpec.gcs
                            readOnly = sandboxapiGitRepoMountSpec.readOnly
                            s3 = sandboxapiGitRepoMountSpec.s3
                            additionalProperties =
                                sandboxapiGitRepoMountSpec.additionalProperties.toMutableMap()
                        }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun git(git: Git) = git(JsonField.of(git))

                    /**
                     * Sets [Builder.git] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.git] with a well-typed [Git] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun git(git: JsonField<Git>) = apply { this.git = git }

                    fun mountPath(mountPath: String) = mountPath(JsonField.of(mountPath))

                    /**
                     * Sets [Builder.mountPath] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.mountPath] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun mountPath(mountPath: JsonField<String>) = apply {
                        this.mountPath = mountPath
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun cache(cache: Cache) = cache(JsonField.of(cache))

                    /**
                     * Sets [Builder.cache] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cache] with a well-typed [Cache] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cache(cache: JsonField<Cache>) = apply { this.cache = cache }

                    fun gcs(gcs: Gcs) = gcs(JsonField.of(gcs))

                    /**
                     * Sets [Builder.gcs] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.gcs] with a well-typed [Gcs] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun gcs(gcs: JsonField<Gcs>) = apply { this.gcs = gcs }

                    fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

                    /**
                     * Sets [Builder.readOnly] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.readOnly] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

                    fun s3(s3: S3) = s3(JsonField.of(s3))

                    /**
                     * Sets [Builder.s3] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.s3] with a well-typed [S3] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun s3(s3: JsonField<S3>) = apply { this.s3 = s3 }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [SandboxapiGitRepoMountSpec].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .git()
                     * .mountPath()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxapiGitRepoMountSpec =
                        SandboxapiGitRepoMountSpec(
                            checkRequired("id", id),
                            checkRequired("git", git),
                            checkRequired("mountPath", mountPath),
                            checkRequired("type", type),
                            cache,
                            gcs,
                            readOnly,
                            s3,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxapiGitRepoMountSpec = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    git().validate()
                    mountPath()
                    type().validate()
                    cache().ifPresent { it.validate() }
                    gcs().ifPresent { it.validate() }
                    readOnly()
                    s3().ifPresent { it.validate() }
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (git.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (mountPath.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (cache.asKnown().getOrNull()?.validity() ?: 0) +
                        (gcs.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (readOnly.asKnown().isPresent) 1 else 0) +
                        (s3.asKnown().getOrNull()?.validity() ?: 0)

                class Git
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val remoteUrl: JsonField<String>,
                    private val ref: JsonField<Ref>,
                    private val refreshIntervalSeconds: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("remote_url")
                        @ExcludeMissing
                        remoteUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("ref") @ExcludeMissing ref: JsonField<Ref> = JsonMissing.of(),
                        @JsonProperty("refresh_interval_seconds")
                        @ExcludeMissing
                        refreshIntervalSeconds: JsonField<Long> = JsonMissing.of(),
                    ) : this(remoteUrl, ref, refreshIntervalSeconds, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun remoteUrl(): String = remoteUrl.getRequired("remote_url")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun ref(): Optional<Ref> = ref.getOptional("ref")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun refreshIntervalSeconds(): Optional<Long> =
                        refreshIntervalSeconds.getOptional("refresh_interval_seconds")

                    /**
                     * Returns the raw JSON value of [remoteUrl].
                     *
                     * Unlike [remoteUrl], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("remote_url")
                    @ExcludeMissing
                    fun _remoteUrl(): JsonField<String> = remoteUrl

                    /**
                     * Returns the raw JSON value of [ref].
                     *
                     * Unlike [ref], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<Ref> = ref

                    /**
                     * Returns the raw JSON value of [refreshIntervalSeconds].
                     *
                     * Unlike [refreshIntervalSeconds], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("refresh_interval_seconds")
                    @ExcludeMissing
                    fun _refreshIntervalSeconds(): JsonField<Long> = refreshIntervalSeconds

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
                         * Returns a mutable builder for constructing an instance of [Git].
                         *
                         * The following fields are required:
                         * ```java
                         * .remoteUrl()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Git]. */
                    class Builder internal constructor() {

                        private var remoteUrl: JsonField<String>? = null
                        private var ref: JsonField<Ref> = JsonMissing.of()
                        private var refreshIntervalSeconds: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(git: Git) = apply {
                            remoteUrl = git.remoteUrl
                            ref = git.ref
                            refreshIntervalSeconds = git.refreshIntervalSeconds
                            additionalProperties = git.additionalProperties.toMutableMap()
                        }

                        fun remoteUrl(remoteUrl: String) = remoteUrl(JsonField.of(remoteUrl))

                        /**
                         * Sets [Builder.remoteUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.remoteUrl] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun remoteUrl(remoteUrl: JsonField<String>) = apply {
                            this.remoteUrl = remoteUrl
                        }

                        fun ref(ref: Ref) = ref(JsonField.of(ref))

                        /**
                         * Sets [Builder.ref] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.ref] with a well-typed [Ref] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun ref(ref: JsonField<Ref>) = apply { this.ref = ref }

                        fun refreshIntervalSeconds(refreshIntervalSeconds: Long) =
                            refreshIntervalSeconds(JsonField.of(refreshIntervalSeconds))

                        /**
                         * Sets [Builder.refreshIntervalSeconds] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.refreshIntervalSeconds] with a
                         * well-typed [Long] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun refreshIntervalSeconds(refreshIntervalSeconds: JsonField<Long>) =
                            apply {
                                this.refreshIntervalSeconds = refreshIntervalSeconds
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Git].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .remoteUrl()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Git =
                            Git(
                                checkRequired("remoteUrl", remoteUrl),
                                ref,
                                refreshIntervalSeconds,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Git = apply {
                        if (validated) {
                            return@apply
                        }

                        remoteUrl()
                        ref().ifPresent { it.validate() }
                        refreshIntervalSeconds()
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
                        (if (remoteUrl.asKnown().isPresent) 1 else 0) +
                            (ref.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (refreshIntervalSeconds.asKnown().isPresent) 1 else 0)

                    class Ref
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val name: JsonField<String>,
                        private val type: JsonField<Type>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("name")
                            @ExcludeMissing
                            name: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonField<Type> = JsonMissing.of(),
                        ) : this(name, type, mutableMapOf())

                        /**
                         * @throws LangChainInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun name(): String = name.getRequired("name")

                        /**
                         * @throws LangChainInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun type(): Type = type.getRequired("type")

                        /**
                         * Returns the raw JSON value of [name].
                         *
                         * Unlike [name], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                        /**
                         * Returns the raw JSON value of [type].
                         *
                         * Unlike [type], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                             * Returns a mutable builder for constructing an instance of [Ref].
                             *
                             * The following fields are required:
                             * ```java
                             * .name()
                             * .type()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Ref]. */
                        class Builder internal constructor() {

                            private var name: JsonField<String>? = null
                            private var type: JsonField<Type>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(ref: Ref) = apply {
                                name = ref.name
                                type = ref.type
                                additionalProperties = ref.additionalProperties.toMutableMap()
                            }

                            fun name(name: String) = name(JsonField.of(name))

                            /**
                             * Sets [Builder.name] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.name] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun name(name: JsonField<String>) = apply { this.name = name }

                            fun type(type: Type) = type(JsonField.of(type))

                            /**
                             * Sets [Builder.type] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.type] with a well-typed [Type] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Ref].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .name()
                             * .type()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Ref =
                                Ref(
                                    checkRequired("name", name),
                                    checkRequired("type", type),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Ref = apply {
                            if (validated) {
                                return@apply
                            }

                            name()
                            type().validate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (name.asKnown().isPresent) 1 else 0) +
                                (type.asKnown().getOrNull()?.validity() ?: 0)

                        class Type
                        @JsonCreator
                        private constructor(private val value: JsonField<String>) : Enum {

                            /**
                             * Returns this class instance's raw value.
                             *
                             * This is usually only useful if this instance was deserialized from
                             * data that doesn't match any known member, and you want to know that
                             * value. For example, if the SDK is on an older version than the API,
                             * then the API may respond with new members that the SDK is unaware of.
                             */
                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            companion object {

                                @JvmField val BRANCH = of("branch")

                                @JvmField val TAG = of("tag")

                                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                            }

                            /** An enum containing [Type]'s known values. */
                            enum class Known {
                                BRANCH,
                                TAG,
                            }

                            /**
                             * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                             * member.
                             *
                             * An instance of [Type] can contain an unknown value in a couple of
                             * cases:
                             * - It was deserialized from data that doesn't match any known member.
                             *   For example, if the SDK is on an older version than the API, then
                             *   the API may respond with new members that the SDK is unaware of.
                             * - It was constructed with an arbitrary value using the [of] method.
                             */
                            enum class Value {
                                BRANCH,
                                TAG,
                                /**
                                 * An enum member indicating that [Type] was instantiated with an
                                 * unknown value.
                                 */
                                _UNKNOWN,
                            }

                            /**
                             * Returns an enum member corresponding to this class instance's value,
                             * or [Value._UNKNOWN] if the class was instantiated with an unknown
                             * value.
                             *
                             * Use the [known] method instead if you're certain the value is always
                             * known or if you want to throw for the unknown case.
                             */
                            fun value(): Value =
                                when (this) {
                                    BRANCH -> Value.BRANCH
                                    TAG -> Value.TAG
                                    else -> Value._UNKNOWN
                                }

                            /**
                             * Returns an enum member corresponding to this class instance's value.
                             *
                             * Use the [value] method instead if you're uncertain the value is
                             * always known and don't want to throw for the unknown case.
                             *
                             * @throws LangChainInvalidDataException if this class instance's value
                             *   is a not a known member.
                             */
                            fun known(): Known =
                                when (this) {
                                    BRANCH -> Known.BRANCH
                                    TAG -> Known.TAG
                                    else ->
                                        throw LangChainInvalidDataException("Unknown Type: $value")
                                }

                            /**
                             * Returns this class instance's primitive wire representation.
                             *
                             * This differs from the [toString] method because that method is
                             * primarily for debugging and generally doesn't throw.
                             *
                             * @throws LangChainInvalidDataException if this class instance's value
                             *   does not have the expected primitive type.
                             */
                            fun asString(): String =
                                _value().asString().orElseThrow {
                                    LangChainInvalidDataException("Value is not a String")
                                }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LangChainInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): Type = apply {
                                if (validated) {
                                    return@apply
                                }

                                known()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Ref &&
                                name == other.name &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(name, type, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Ref{name=$name, type=$type, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Git &&
                            remoteUrl == other.remoteUrl &&
                            ref == other.ref &&
                            refreshIntervalSeconds == other.refreshIntervalSeconds &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(remoteUrl, ref, refreshIntervalSeconds, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Git{remoteUrl=$remoteUrl, ref=$ref, refreshIntervalSeconds=$refreshIntervalSeconds, additionalProperties=$additionalProperties}"
                }

                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val S3 = of("s3")

                        @JvmField val GCS = of("gcs")

                        @JvmField val GIT = of("git")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        S3,
                        GCS,
                        GIT,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        S3,
                        GCS,
                        GIT,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            S3 -> Value.S3
                            GCS -> Value.GCS
                            GIT -> Value.GIT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            S3 -> Known.S3
                            GCS -> Known.GCS
                            GIT -> Known.GIT
                            else -> throw LangChainInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LangChainInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Type = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Cache
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val maxSizeBytes: JsonField<Long>,
                    private val writebackSeconds: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("max_size_bytes")
                        @ExcludeMissing
                        maxSizeBytes: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("writeback_seconds")
                        @ExcludeMissing
                        writebackSeconds: JsonField<Long> = JsonMissing.of(),
                    ) : this(maxSizeBytes, writebackSeconds, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun maxSizeBytes(): Optional<Long> = maxSizeBytes.getOptional("max_size_bytes")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun writebackSeconds(): Optional<Long> =
                        writebackSeconds.getOptional("writeback_seconds")

                    /**
                     * Returns the raw JSON value of [maxSizeBytes].
                     *
                     * Unlike [maxSizeBytes], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("max_size_bytes")
                    @ExcludeMissing
                    fun _maxSizeBytes(): JsonField<Long> = maxSizeBytes

                    /**
                     * Returns the raw JSON value of [writebackSeconds].
                     *
                     * Unlike [writebackSeconds], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("writeback_seconds")
                    @ExcludeMissing
                    fun _writebackSeconds(): JsonField<Long> = writebackSeconds

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

                        /** Returns a mutable builder for constructing an instance of [Cache]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Cache]. */
                    class Builder internal constructor() {

                        private var maxSizeBytes: JsonField<Long> = JsonMissing.of()
                        private var writebackSeconds: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(cache: Cache) = apply {
                            maxSizeBytes = cache.maxSizeBytes
                            writebackSeconds = cache.writebackSeconds
                            additionalProperties = cache.additionalProperties.toMutableMap()
                        }

                        fun maxSizeBytes(maxSizeBytes: Long) =
                            maxSizeBytes(JsonField.of(maxSizeBytes))

                        /**
                         * Sets [Builder.maxSizeBytes] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.maxSizeBytes] with a well-typed [Long]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun maxSizeBytes(maxSizeBytes: JsonField<Long>) = apply {
                            this.maxSizeBytes = maxSizeBytes
                        }

                        fun writebackSeconds(writebackSeconds: Long) =
                            writebackSeconds(JsonField.of(writebackSeconds))

                        /**
                         * Sets [Builder.writebackSeconds] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.writebackSeconds] with a well-typed
                         * [Long] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun writebackSeconds(writebackSeconds: JsonField<Long>) = apply {
                            this.writebackSeconds = writebackSeconds
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Cache].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Cache =
                            Cache(
                                maxSizeBytes,
                                writebackSeconds,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Cache = apply {
                        if (validated) {
                            return@apply
                        }

                        maxSizeBytes()
                        writebackSeconds()
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
                        (if (maxSizeBytes.asKnown().isPresent) 1 else 0) +
                            (if (writebackSeconds.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Cache &&
                            maxSizeBytes == other.maxSizeBytes &&
                            writebackSeconds == other.writebackSeconds &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(maxSizeBytes, writebackSeconds, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Cache{maxSizeBytes=$maxSizeBytes, writebackSeconds=$writebackSeconds, additionalProperties=$additionalProperties}"
                }

                class Gcs
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val bucket: JsonField<String>,
                    private val prefix: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bucket")
                        @ExcludeMissing
                        bucket: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("prefix")
                        @ExcludeMissing
                        prefix: JsonField<String> = JsonMissing.of(),
                    ) : this(bucket, prefix, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun bucket(): String = bucket.getRequired("bucket")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun prefix(): Optional<String> = prefix.getOptional("prefix")

                    /**
                     * Returns the raw JSON value of [bucket].
                     *
                     * Unlike [bucket], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    fun _bucket(): JsonField<String> = bucket

                    /**
                     * Returns the raw JSON value of [prefix].
                     *
                     * Unlike [prefix], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    fun _prefix(): JsonField<String> = prefix

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
                         * Returns a mutable builder for constructing an instance of [Gcs].
                         *
                         * The following fields are required:
                         * ```java
                         * .bucket()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Gcs]. */
                    class Builder internal constructor() {

                        private var bucket: JsonField<String>? = null
                        private var prefix: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(gcs: Gcs) = apply {
                            bucket = gcs.bucket
                            prefix = gcs.prefix
                            additionalProperties = gcs.additionalProperties.toMutableMap()
                        }

                        fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                        /**
                         * Sets [Builder.bucket] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bucket] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                        fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                        /**
                         * Sets [Builder.prefix] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.prefix] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Gcs].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .bucket()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Gcs =
                            Gcs(
                                checkRequired("bucket", bucket),
                                prefix,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Gcs = apply {
                        if (validated) {
                            return@apply
                        }

                        bucket()
                        prefix()
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
                        (if (bucket.asKnown().isPresent) 1 else 0) +
                            (if (prefix.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Gcs &&
                            bucket == other.bucket &&
                            prefix == other.prefix &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(bucket, prefix, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Gcs{bucket=$bucket, prefix=$prefix, additionalProperties=$additionalProperties}"
                }

                class S3
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val bucket: JsonField<String>,
                    private val endpointUrl: JsonField<String>,
                    private val region: JsonField<String>,
                    private val pathStyle: JsonField<Boolean>,
                    private val prefix: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bucket")
                        @ExcludeMissing
                        bucket: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("endpoint_url")
                        @ExcludeMissing
                        endpointUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("region")
                        @ExcludeMissing
                        region: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("path_style")
                        @ExcludeMissing
                        pathStyle: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("prefix")
                        @ExcludeMissing
                        prefix: JsonField<String> = JsonMissing.of(),
                    ) : this(bucket, endpointUrl, region, pathStyle, prefix, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun bucket(): String = bucket.getRequired("bucket")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun endpointUrl(): String = endpointUrl.getRequired("endpoint_url")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun region(): String = region.getRequired("region")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun pathStyle(): Optional<Boolean> = pathStyle.getOptional("path_style")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun prefix(): Optional<String> = prefix.getOptional("prefix")

                    /**
                     * Returns the raw JSON value of [bucket].
                     *
                     * Unlike [bucket], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("bucket")
                    @ExcludeMissing
                    fun _bucket(): JsonField<String> = bucket

                    /**
                     * Returns the raw JSON value of [endpointUrl].
                     *
                     * Unlike [endpointUrl], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("endpoint_url")
                    @ExcludeMissing
                    fun _endpointUrl(): JsonField<String> = endpointUrl

                    /**
                     * Returns the raw JSON value of [region].
                     *
                     * Unlike [region], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("region")
                    @ExcludeMissing
                    fun _region(): JsonField<String> = region

                    /**
                     * Returns the raw JSON value of [pathStyle].
                     *
                     * Unlike [pathStyle], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("path_style")
                    @ExcludeMissing
                    fun _pathStyle(): JsonField<Boolean> = pathStyle

                    /**
                     * Returns the raw JSON value of [prefix].
                     *
                     * Unlike [prefix], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("prefix")
                    @ExcludeMissing
                    fun _prefix(): JsonField<String> = prefix

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
                         * Returns a mutable builder for constructing an instance of [S3].
                         *
                         * The following fields are required:
                         * ```java
                         * .bucket()
                         * .endpointUrl()
                         * .region()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [S3]. */
                    class Builder internal constructor() {

                        private var bucket: JsonField<String>? = null
                        private var endpointUrl: JsonField<String>? = null
                        private var region: JsonField<String>? = null
                        private var pathStyle: JsonField<Boolean> = JsonMissing.of()
                        private var prefix: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(s3: S3) = apply {
                            bucket = s3.bucket
                            endpointUrl = s3.endpointUrl
                            region = s3.region
                            pathStyle = s3.pathStyle
                            prefix = s3.prefix
                            additionalProperties = s3.additionalProperties.toMutableMap()
                        }

                        fun bucket(bucket: String) = bucket(JsonField.of(bucket))

                        /**
                         * Sets [Builder.bucket] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.bucket] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun bucket(bucket: JsonField<String>) = apply { this.bucket = bucket }

                        fun endpointUrl(endpointUrl: String) =
                            endpointUrl(JsonField.of(endpointUrl))

                        /**
                         * Sets [Builder.endpointUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.endpointUrl] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun endpointUrl(endpointUrl: JsonField<String>) = apply {
                            this.endpointUrl = endpointUrl
                        }

                        fun region(region: String) = region(JsonField.of(region))

                        /**
                         * Sets [Builder.region] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.region] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun region(region: JsonField<String>) = apply { this.region = region }

                        fun pathStyle(pathStyle: Boolean) = pathStyle(JsonField.of(pathStyle))

                        /**
                         * Sets [Builder.pathStyle] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.pathStyle] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun pathStyle(pathStyle: JsonField<Boolean>) = apply {
                            this.pathStyle = pathStyle
                        }

                        fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                        /**
                         * Sets [Builder.prefix] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.prefix] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [S3].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .bucket()
                         * .endpointUrl()
                         * .region()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): S3 =
                            S3(
                                checkRequired("bucket", bucket),
                                checkRequired("endpointUrl", endpointUrl),
                                checkRequired("region", region),
                                pathStyle,
                                prefix,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): S3 = apply {
                        if (validated) {
                            return@apply
                        }

                        bucket()
                        endpointUrl()
                        region()
                        pathStyle()
                        prefix()
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
                        (if (bucket.asKnown().isPresent) 1 else 0) +
                            (if (endpointUrl.asKnown().isPresent) 1 else 0) +
                            (if (region.asKnown().isPresent) 1 else 0) +
                            (if (pathStyle.asKnown().isPresent) 1 else 0) +
                            (if (prefix.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is S3 &&
                            bucket == other.bucket &&
                            endpointUrl == other.endpointUrl &&
                            region == other.region &&
                            pathStyle == other.pathStyle &&
                            prefix == other.prefix &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            bucket,
                            endpointUrl,
                            region,
                            pathStyle,
                            prefix,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "S3{bucket=$bucket, endpointUrl=$endpointUrl, region=$region, pathStyle=$pathStyle, prefix=$prefix, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxapiGitRepoMountSpec &&
                        id == other.id &&
                        git == other.git &&
                        mountPath == other.mountPath &&
                        type == other.type &&
                        cache == other.cache &&
                        gcs == other.gcs &&
                        readOnly == other.readOnly &&
                        s3 == other.s3 &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        git,
                        mountPath,
                        type,
                        cache,
                        gcs,
                        readOnly,
                        s3,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxapiGitRepoMountSpec{id=$id, git=$git, mountPath=$mountPath, type=$type, cache=$cache, gcs=$gcs, readOnly=$readOnly, s3=$s3, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MountConfig &&
                auth == other.auth &&
                mounts == other.mounts &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(auth, mounts, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MountConfig{auth=$auth, mounts=$mounts, additionalProperties=$additionalProperties}"
    }

    class ProxyConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accessControl: JsonField<AccessControl>,
        private val callbacks: JsonField<List<Callback>>,
        private val noProxy: JsonField<List<String>>,
        private val rules: JsonField<List<Rule>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("access_control")
            @ExcludeMissing
            accessControl: JsonField<AccessControl> = JsonMissing.of(),
            @JsonProperty("callbacks")
            @ExcludeMissing
            callbacks: JsonField<List<Callback>> = JsonMissing.of(),
            @JsonProperty("no_proxy")
            @ExcludeMissing
            noProxy: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("rules") @ExcludeMissing rules: JsonField<List<Rule>> = JsonMissing.of(),
        ) : this(accessControl, callbacks, noProxy, rules, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accessControl(): Optional<AccessControl> = accessControl.getOptional("access_control")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun callbacks(): Optional<List<Callback>> = callbacks.getOptional("callbacks")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun noProxy(): Optional<List<String>> = noProxy.getOptional("no_proxy")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rules(): Optional<List<Rule>> = rules.getOptional("rules")

        /**
         * Returns the raw JSON value of [accessControl].
         *
         * Unlike [accessControl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("access_control")
        @ExcludeMissing
        fun _accessControl(): JsonField<AccessControl> = accessControl

        /**
         * Returns the raw JSON value of [callbacks].
         *
         * Unlike [callbacks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callbacks")
        @ExcludeMissing
        fun _callbacks(): JsonField<List<Callback>> = callbacks

        /**
         * Returns the raw JSON value of [noProxy].
         *
         * Unlike [noProxy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("no_proxy") @ExcludeMissing fun _noProxy(): JsonField<List<String>> = noProxy

        /**
         * Returns the raw JSON value of [rules].
         *
         * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rules") @ExcludeMissing fun _rules(): JsonField<List<Rule>> = rules

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

            /** Returns a mutable builder for constructing an instance of [ProxyConfig]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ProxyConfig]. */
        class Builder internal constructor() {

            private var accessControl: JsonField<AccessControl> = JsonMissing.of()
            private var callbacks: JsonField<MutableList<Callback>>? = null
            private var noProxy: JsonField<MutableList<String>>? = null
            private var rules: JsonField<MutableList<Rule>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(proxyConfig: ProxyConfig) = apply {
                accessControl = proxyConfig.accessControl
                callbacks = proxyConfig.callbacks.map { it.toMutableList() }
                noProxy = proxyConfig.noProxy.map { it.toMutableList() }
                rules = proxyConfig.rules.map { it.toMutableList() }
                additionalProperties = proxyConfig.additionalProperties.toMutableMap()
            }

            fun accessControl(accessControl: AccessControl) =
                accessControl(JsonField.of(accessControl))

            /**
             * Sets [Builder.accessControl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accessControl] with a well-typed [AccessControl]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accessControl(accessControl: JsonField<AccessControl>) = apply {
                this.accessControl = accessControl
            }

            fun callbacks(callbacks: List<Callback>) = callbacks(JsonField.of(callbacks))

            /**
             * Sets [Builder.callbacks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callbacks] with a well-typed `List<Callback>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callbacks(callbacks: JsonField<List<Callback>>) = apply {
                this.callbacks = callbacks.map { it.toMutableList() }
            }

            /**
             * Adds a single [Callback] to [callbacks].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCallback(callback: Callback) = apply {
                callbacks =
                    (callbacks ?: JsonField.of(mutableListOf())).also {
                        checkKnown("callbacks", it).add(callback)
                    }
            }

            fun noProxy(noProxy: List<String>) = noProxy(JsonField.of(noProxy))

            /**
             * Sets [Builder.noProxy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.noProxy] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun noProxy(noProxy: JsonField<List<String>>) = apply {
                this.noProxy = noProxy.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.noProxy].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addNoProxy(noProxy: String) = apply {
                this.noProxy =
                    (this.noProxy ?: JsonField.of(mutableListOf())).also {
                        checkKnown("noProxy", it).add(noProxy)
                    }
            }

            fun rules(rules: List<Rule>) = rules(JsonField.of(rules))

            /**
             * Sets [Builder.rules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rules] with a well-typed `List<Rule>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rules(rules: JsonField<List<Rule>>) = apply {
                this.rules = rules.map { it.toMutableList() }
            }

            /**
             * Adds a single [Rule] to [rules].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRule(rule: Rule) = apply {
                rules =
                    (rules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("rules", it).add(rule)
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
             * Returns an immutable instance of [ProxyConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ProxyConfig =
                ProxyConfig(
                    accessControl,
                    (callbacks ?: JsonMissing.of()).map { it.toImmutable() },
                    (noProxy ?: JsonMissing.of()).map { it.toImmutable() },
                    (rules ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): ProxyConfig = apply {
            if (validated) {
                return@apply
            }

            accessControl().ifPresent { it.validate() }
            callbacks().ifPresent { it.forEach { it.validate() } }
            noProxy()
            rules().ifPresent { it.forEach { it.validate() } }
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
            (accessControl.asKnown().getOrNull()?.validity() ?: 0) +
                (callbacks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (noProxy.asKnown().getOrNull()?.size ?: 0) +
                (rules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class AccessControl
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val allowList: JsonField<List<String>>,
            private val denyList: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("allow_list")
                @ExcludeMissing
                allowList: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("deny_list")
                @ExcludeMissing
                denyList: JsonField<List<String>> = JsonMissing.of(),
            ) : this(allowList, denyList, mutableMapOf())

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun allowList(): Optional<List<String>> = allowList.getOptional("allow_list")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun denyList(): Optional<List<String>> = denyList.getOptional("deny_list")

            /**
             * Returns the raw JSON value of [allowList].
             *
             * Unlike [allowList], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("allow_list")
            @ExcludeMissing
            fun _allowList(): JsonField<List<String>> = allowList

            /**
             * Returns the raw JSON value of [denyList].
             *
             * Unlike [denyList], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("deny_list")
            @ExcludeMissing
            fun _denyList(): JsonField<List<String>> = denyList

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

                /** Returns a mutable builder for constructing an instance of [AccessControl]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AccessControl]. */
            class Builder internal constructor() {

                private var allowList: JsonField<MutableList<String>>? = null
                private var denyList: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accessControl: AccessControl) = apply {
                    allowList = accessControl.allowList.map { it.toMutableList() }
                    denyList = accessControl.denyList.map { it.toMutableList() }
                    additionalProperties = accessControl.additionalProperties.toMutableMap()
                }

                fun allowList(allowList: List<String>) = allowList(JsonField.of(allowList))

                /**
                 * Sets [Builder.allowList] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowList] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun allowList(allowList: JsonField<List<String>>) = apply {
                    this.allowList = allowList.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.allowList].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAllowList(allowList: String) = apply {
                    this.allowList =
                        (this.allowList ?: JsonField.of(mutableListOf())).also {
                            checkKnown("allowList", it).add(allowList)
                        }
                }

                fun denyList(denyList: List<String>) = denyList(JsonField.of(denyList))

                /**
                 * Sets [Builder.denyList] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.denyList] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun denyList(denyList: JsonField<List<String>>) = apply {
                    this.denyList = denyList.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.denyList].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDenyList(denyList: String) = apply {
                    this.denyList =
                        (this.denyList ?: JsonField.of(mutableListOf())).also {
                            checkKnown("denyList", it).add(denyList)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AccessControl].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AccessControl =
                    AccessControl(
                        (allowList ?: JsonMissing.of()).map { it.toImmutable() },
                        (denyList ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): AccessControl = apply {
                if (validated) {
                    return@apply
                }

                allowList()
                denyList()
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
                (allowList.asKnown().getOrNull()?.size ?: 0) +
                    (denyList.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccessControl &&
                    allowList == other.allowList &&
                    denyList == other.denyList &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(allowList, denyList, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessControl{allowList=$allowList, denyList=$denyList, additionalProperties=$additionalProperties}"
        }

        class Callback
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val matchHosts: JsonField<List<String>>,
            private val ttlSeconds: JsonField<Long>,
            private val url: JsonField<String>,
            private val fullRequest: JsonField<Boolean>,
            private val requestHeaders: JsonField<List<RequestHeader>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("match_hosts")
                @ExcludeMissing
                matchHosts: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("ttl_seconds")
                @ExcludeMissing
                ttlSeconds: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                @JsonProperty("full_request")
                @ExcludeMissing
                fullRequest: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("request_headers")
                @ExcludeMissing
                requestHeaders: JsonField<List<RequestHeader>> = JsonMissing.of(),
            ) : this(matchHosts, ttlSeconds, url, fullRequest, requestHeaders, mutableMapOf())

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun matchHosts(): List<String> = matchHosts.getRequired("match_hosts")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ttlSeconds(): Long = ttlSeconds.getRequired("ttl_seconds")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun fullRequest(): Optional<Boolean> = fullRequest.getOptional("full_request")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun requestHeaders(): Optional<List<RequestHeader>> =
                requestHeaders.getOptional("request_headers")

            /**
             * Returns the raw JSON value of [matchHosts].
             *
             * Unlike [matchHosts], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("match_hosts")
            @ExcludeMissing
            fun _matchHosts(): JsonField<List<String>> = matchHosts

            /**
             * Returns the raw JSON value of [ttlSeconds].
             *
             * Unlike [ttlSeconds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ttl_seconds")
            @ExcludeMissing
            fun _ttlSeconds(): JsonField<Long> = ttlSeconds

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            /**
             * Returns the raw JSON value of [fullRequest].
             *
             * Unlike [fullRequest], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("full_request")
            @ExcludeMissing
            fun _fullRequest(): JsonField<Boolean> = fullRequest

            /**
             * Returns the raw JSON value of [requestHeaders].
             *
             * Unlike [requestHeaders], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("request_headers")
            @ExcludeMissing
            fun _requestHeaders(): JsonField<List<RequestHeader>> = requestHeaders

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
                 * Returns a mutable builder for constructing an instance of [Callback].
                 *
                 * The following fields are required:
                 * ```java
                 * .matchHosts()
                 * .ttlSeconds()
                 * .url()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Callback]. */
            class Builder internal constructor() {

                private var matchHosts: JsonField<MutableList<String>>? = null
                private var ttlSeconds: JsonField<Long>? = null
                private var url: JsonField<String>? = null
                private var fullRequest: JsonField<Boolean> = JsonMissing.of()
                private var requestHeaders: JsonField<MutableList<RequestHeader>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(callback: Callback) = apply {
                    matchHosts = callback.matchHosts.map { it.toMutableList() }
                    ttlSeconds = callback.ttlSeconds
                    url = callback.url
                    fullRequest = callback.fullRequest
                    requestHeaders = callback.requestHeaders.map { it.toMutableList() }
                    additionalProperties = callback.additionalProperties.toMutableMap()
                }

                fun matchHosts(matchHosts: List<String>) = matchHosts(JsonField.of(matchHosts))

                /**
                 * Sets [Builder.matchHosts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.matchHosts] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun matchHosts(matchHosts: JsonField<List<String>>) = apply {
                    this.matchHosts = matchHosts.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [matchHosts].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMatchHost(matchHost: String) = apply {
                    matchHosts =
                        (matchHosts ?: JsonField.of(mutableListOf())).also {
                            checkKnown("matchHosts", it).add(matchHost)
                        }
                }

                fun ttlSeconds(ttlSeconds: Long) = ttlSeconds(JsonField.of(ttlSeconds))

                /**
                 * Sets [Builder.ttlSeconds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ttlSeconds] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ttlSeconds(ttlSeconds: JsonField<Long>) = apply { this.ttlSeconds = ttlSeconds }

                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                fun fullRequest(fullRequest: Boolean) = fullRequest(JsonField.of(fullRequest))

                /**
                 * Sets [Builder.fullRequest] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fullRequest] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fullRequest(fullRequest: JsonField<Boolean>) = apply {
                    this.fullRequest = fullRequest
                }

                fun requestHeaders(requestHeaders: List<RequestHeader>) =
                    requestHeaders(JsonField.of(requestHeaders))

                /**
                 * Sets [Builder.requestHeaders] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestHeaders] with a well-typed
                 * `List<RequestHeader>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun requestHeaders(requestHeaders: JsonField<List<RequestHeader>>) = apply {
                    this.requestHeaders = requestHeaders.map { it.toMutableList() }
                }

                /**
                 * Adds a single [RequestHeader] to [requestHeaders].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRequestHeader(requestHeader: RequestHeader) = apply {
                    requestHeaders =
                        (requestHeaders ?: JsonField.of(mutableListOf())).also {
                            checkKnown("requestHeaders", it).add(requestHeader)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Callback].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .matchHosts()
                 * .ttlSeconds()
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Callback =
                    Callback(
                        checkRequired("matchHosts", matchHosts).map { it.toImmutable() },
                        checkRequired("ttlSeconds", ttlSeconds),
                        checkRequired("url", url),
                        fullRequest,
                        (requestHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Callback = apply {
                if (validated) {
                    return@apply
                }

                matchHosts()
                ttlSeconds()
                url()
                fullRequest()
                requestHeaders().ifPresent { it.forEach { it.validate() } }
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
                (matchHosts.asKnown().getOrNull()?.size ?: 0) +
                    (if (ttlSeconds.asKnown().isPresent) 1 else 0) +
                    (if (url.asKnown().isPresent) 1 else 0) +
                    (if (fullRequest.asKnown().isPresent) 1 else 0) +
                    (requestHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class RequestHeader
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val type: JsonField<Type>,
                private val isSet: JsonField<Boolean>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("is_set")
                    @ExcludeMissing
                    isSet: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(name, type, isSet, value, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun value(): Optional<String> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [isSet].
                 *
                 * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                     * Returns a mutable builder for constructing an instance of [RequestHeader].
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RequestHeader]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var type: JsonField<Type>? = null
                    private var isSet: JsonField<Boolean> = JsonMissing.of()
                    private var value: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(requestHeader: RequestHeader) = apply {
                        name = requestHeader.name
                        type = requestHeader.type
                        isSet = requestHeader.isSet
                        value = requestHeader.value
                        additionalProperties = requestHeader.additionalProperties.toMutableMap()
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                    /**
                     * Sets [Builder.isSet] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [RequestHeader].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): RequestHeader =
                        RequestHeader(
                            checkRequired("name", name),
                            checkRequired("type", type),
                            isSet,
                            value,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): RequestHeader = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    type().validate()
                    isSet()
                    value()
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (isSet.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val PLAINTEXT = of("plaintext")

                        @JvmField val OPAQUE = of("opaque")

                        @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        PLAINTEXT,
                        OPAQUE,
                        WORKSPACE_SECRET,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PLAINTEXT,
                        OPAQUE,
                        WORKSPACE_SECRET,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PLAINTEXT -> Value.PLAINTEXT
                            OPAQUE -> Value.OPAQUE
                            WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PLAINTEXT -> Known.PLAINTEXT
                            OPAQUE -> Known.OPAQUE
                            WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                            else -> throw LangChainInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LangChainInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Type = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RequestHeader &&
                        name == other.name &&
                        type == other.type &&
                        isSet == other.isSet &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, type, isSet, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RequestHeader{name=$name, type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Callback &&
                    matchHosts == other.matchHosts &&
                    ttlSeconds == other.ttlSeconds &&
                    url == other.url &&
                    fullRequest == other.fullRequest &&
                    requestHeaders == other.requestHeaders &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    matchHosts,
                    ttlSeconds,
                    url,
                    fullRequest,
                    requestHeaders,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Callback{matchHosts=$matchHosts, ttlSeconds=$ttlSeconds, url=$url, fullRequest=$fullRequest, requestHeaders=$requestHeaders, additionalProperties=$additionalProperties}"
        }

        class Rule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val aws: JsonField<Aws>,
            private val enabled: JsonField<Boolean>,
            private val gcp: JsonField<Gcp>,
            private val headers: JsonField<List<Header>>,
            private val matchHosts: JsonField<List<String>>,
            private val matchPaths: JsonField<List<String>>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("aws") @ExcludeMissing aws: JsonField<Aws> = JsonMissing.of(),
                @JsonProperty("enabled")
                @ExcludeMissing
                enabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("gcp") @ExcludeMissing gcp: JsonField<Gcp> = JsonMissing.of(),
                @JsonProperty("headers")
                @ExcludeMissing
                headers: JsonField<List<Header>> = JsonMissing.of(),
                @JsonProperty("match_hosts")
                @ExcludeMissing
                matchHosts: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("match_paths")
                @ExcludeMissing
                matchPaths: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(name, aws, enabled, gcp, headers, matchHosts, matchPaths, type, mutableMapOf())

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun aws(): Optional<Aws> = aws.getOptional("aws")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun gcp(): Optional<Gcp> = gcp.getOptional("gcp")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun headers(): Optional<List<Header>> = headers.getOptional("headers")

            /**
             * MatchHosts is only accepted for header injection rules. Provider auth rules use
             * built-in host matching.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun matchHosts(): Optional<List<String>> = matchHosts.getOptional("match_hosts")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun matchPaths(): Optional<List<String>> = matchPaths.getOptional("match_paths")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [aws].
             *
             * Unlike [aws], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("aws") @ExcludeMissing fun _aws(): JsonField<Aws> = aws

            /**
             * Returns the raw JSON value of [enabled].
             *
             * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

            /**
             * Returns the raw JSON value of [gcp].
             *
             * Unlike [gcp], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gcp") @ExcludeMissing fun _gcp(): JsonField<Gcp> = gcp

            /**
             * Returns the raw JSON value of [headers].
             *
             * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("headers")
            @ExcludeMissing
            fun _headers(): JsonField<List<Header>> = headers

            /**
             * Returns the raw JSON value of [matchHosts].
             *
             * Unlike [matchHosts], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("match_hosts")
            @ExcludeMissing
            fun _matchHosts(): JsonField<List<String>> = matchHosts

            /**
             * Returns the raw JSON value of [matchPaths].
             *
             * Unlike [matchPaths], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("match_paths")
            @ExcludeMissing
            fun _matchPaths(): JsonField<List<String>> = matchPaths

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
                 * Returns a mutable builder for constructing an instance of [Rule].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Rule]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var aws: JsonField<Aws> = JsonMissing.of()
                private var enabled: JsonField<Boolean> = JsonMissing.of()
                private var gcp: JsonField<Gcp> = JsonMissing.of()
                private var headers: JsonField<MutableList<Header>>? = null
                private var matchHosts: JsonField<MutableList<String>>? = null
                private var matchPaths: JsonField<MutableList<String>>? = null
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(rule: Rule) = apply {
                    name = rule.name
                    aws = rule.aws
                    enabled = rule.enabled
                    gcp = rule.gcp
                    headers = rule.headers.map { it.toMutableList() }
                    matchHosts = rule.matchHosts.map { it.toMutableList() }
                    matchPaths = rule.matchPaths.map { it.toMutableList() }
                    type = rule.type
                    additionalProperties = rule.additionalProperties.toMutableMap()
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun aws(aws: Aws) = aws(JsonField.of(aws))

                /**
                 * Sets [Builder.aws] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.aws] with a well-typed [Aws] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun aws(aws: JsonField<Aws>) = apply { this.aws = aws }

                fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

                /**
                 * Sets [Builder.enabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enabled] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

                fun gcp(gcp: Gcp) = gcp(JsonField.of(gcp))

                /**
                 * Sets [Builder.gcp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gcp] with a well-typed [Gcp] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun gcp(gcp: JsonField<Gcp>) = apply { this.gcp = gcp }

                fun headers(headers: List<Header>) = headers(JsonField.of(headers))

                /**
                 * Sets [Builder.headers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.headers] with a well-typed `List<Header>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun headers(headers: JsonField<List<Header>>) = apply {
                    this.headers = headers.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Header] to [headers].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addHeader(header: Header) = apply {
                    headers =
                        (headers ?: JsonField.of(mutableListOf())).also {
                            checkKnown("headers", it).add(header)
                        }
                }

                /**
                 * MatchHosts is only accepted for header injection rules. Provider auth rules use
                 * built-in host matching.
                 */
                fun matchHosts(matchHosts: List<String>) = matchHosts(JsonField.of(matchHosts))

                /**
                 * Sets [Builder.matchHosts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.matchHosts] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun matchHosts(matchHosts: JsonField<List<String>>) = apply {
                    this.matchHosts = matchHosts.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [matchHosts].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMatchHost(matchHost: String) = apply {
                    matchHosts =
                        (matchHosts ?: JsonField.of(mutableListOf())).also {
                            checkKnown("matchHosts", it).add(matchHost)
                        }
                }

                fun matchPaths(matchPaths: List<String>) = matchPaths(JsonField.of(matchPaths))

                /**
                 * Sets [Builder.matchPaths] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.matchPaths] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun matchPaths(matchPaths: JsonField<List<String>>) = apply {
                    this.matchPaths = matchPaths.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [matchPaths].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMatchPath(matchPath: String) = apply {
                    matchPaths =
                        (matchPaths ?: JsonField.of(mutableListOf())).also {
                            checkKnown("matchPaths", it).add(matchPath)
                        }
                }

                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Rule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Rule =
                    Rule(
                        checkRequired("name", name),
                        aws,
                        enabled,
                        gcp,
                        (headers ?: JsonMissing.of()).map { it.toImmutable() },
                        (matchHosts ?: JsonMissing.of()).map { it.toImmutable() },
                        (matchPaths ?: JsonMissing.of()).map { it.toImmutable() },
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Rule = apply {
                if (validated) {
                    return@apply
                }

                name()
                aws().ifPresent { it.validate() }
                enabled()
                gcp().ifPresent { it.validate() }
                headers().ifPresent { it.forEach { it.validate() } }
                matchHosts()
                matchPaths()
                type()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                    (aws.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (enabled.asKnown().isPresent) 1 else 0) +
                    (gcp.asKnown().getOrNull()?.validity() ?: 0) +
                    (headers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (matchHosts.asKnown().getOrNull()?.size ?: 0) +
                    (matchPaths.asKnown().getOrNull()?.size ?: 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            class Aws
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val accessKeyId: JsonField<AccessKeyId>,
                private val secretAccessKey: JsonField<SecretAccessKey>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("access_key_id")
                    @ExcludeMissing
                    accessKeyId: JsonField<AccessKeyId> = JsonMissing.of(),
                    @JsonProperty("secret_access_key")
                    @ExcludeMissing
                    secretAccessKey: JsonField<SecretAccessKey> = JsonMissing.of(),
                ) : this(accessKeyId, secretAccessKey, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun accessKeyId(): AccessKeyId = accessKeyId.getRequired("access_key_id")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun secretAccessKey(): SecretAccessKey =
                    secretAccessKey.getRequired("secret_access_key")

                /**
                 * Returns the raw JSON value of [accessKeyId].
                 *
                 * Unlike [accessKeyId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("access_key_id")
                @ExcludeMissing
                fun _accessKeyId(): JsonField<AccessKeyId> = accessKeyId

                /**
                 * Returns the raw JSON value of [secretAccessKey].
                 *
                 * Unlike [secretAccessKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("secret_access_key")
                @ExcludeMissing
                fun _secretAccessKey(): JsonField<SecretAccessKey> = secretAccessKey

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
                     * Returns a mutable builder for constructing an instance of [Aws].
                     *
                     * The following fields are required:
                     * ```java
                     * .accessKeyId()
                     * .secretAccessKey()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Aws]. */
                class Builder internal constructor() {

                    private var accessKeyId: JsonField<AccessKeyId>? = null
                    private var secretAccessKey: JsonField<SecretAccessKey>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(aws: Aws) = apply {
                        accessKeyId = aws.accessKeyId
                        secretAccessKey = aws.secretAccessKey
                        additionalProperties = aws.additionalProperties.toMutableMap()
                    }

                    fun accessKeyId(accessKeyId: AccessKeyId) =
                        accessKeyId(JsonField.of(accessKeyId))

                    /**
                     * Sets [Builder.accessKeyId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accessKeyId] with a well-typed [AccessKeyId]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accessKeyId(accessKeyId: JsonField<AccessKeyId>) = apply {
                        this.accessKeyId = accessKeyId
                    }

                    fun secretAccessKey(secretAccessKey: SecretAccessKey) =
                        secretAccessKey(JsonField.of(secretAccessKey))

                    /**
                     * Sets [Builder.secretAccessKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.secretAccessKey] with a well-typed
                     * [SecretAccessKey] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun secretAccessKey(secretAccessKey: JsonField<SecretAccessKey>) = apply {
                        this.secretAccessKey = secretAccessKey
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Aws].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .accessKeyId()
                     * .secretAccessKey()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Aws =
                        Aws(
                            checkRequired("accessKeyId", accessKeyId),
                            checkRequired("secretAccessKey", secretAccessKey),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Aws = apply {
                    if (validated) {
                        return@apply
                    }

                    accessKeyId().validate()
                    secretAccessKey().validate()
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
                    (accessKeyId.asKnown().getOrNull()?.validity() ?: 0) +
                        (secretAccessKey.asKnown().getOrNull()?.validity() ?: 0)

                class AccessKeyId
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                         * Returns a mutable builder for constructing an instance of [AccessKeyId].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [AccessKeyId]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(accessKeyId: AccessKeyId) = apply {
                            type = accessKeyId.type
                            isSet = accessKeyId.isSet
                            value = accessKeyId.value
                            additionalProperties = accessKeyId.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [AccessKeyId].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): AccessKeyId =
                            AccessKeyId(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): AccessKeyId = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
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
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AccessKeyId &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AccessKeyId{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                class SecretAccessKey
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                         * Returns a mutable builder for constructing an instance of
                         * [SecretAccessKey].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SecretAccessKey]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(secretAccessKey: SecretAccessKey) = apply {
                            type = secretAccessKey.type
                            isSet = secretAccessKey.isSet
                            value = secretAccessKey.value
                            additionalProperties =
                                secretAccessKey.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SecretAccessKey].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): SecretAccessKey =
                            SecretAccessKey(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): SecretAccessKey = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
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
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SecretAccessKey &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SecretAccessKey{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Aws &&
                        accessKeyId == other.accessKeyId &&
                        secretAccessKey == other.secretAccessKey &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(accessKeyId, secretAccessKey, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Aws{accessKeyId=$accessKeyId, secretAccessKey=$secretAccessKey, additionalProperties=$additionalProperties}"
            }

            class Gcp
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val scopes: JsonField<List<String>>,
                private val serviceAccountJson: JsonField<ServiceAccountJson>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("scopes")
                    @ExcludeMissing
                    scopes: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("service_account_json")
                    @ExcludeMissing
                    serviceAccountJson: JsonField<ServiceAccountJson> = JsonMissing.of(),
                ) : this(scopes, serviceAccountJson, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun scopes(): List<String> = scopes.getRequired("scopes")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun serviceAccountJson(): ServiceAccountJson =
                    serviceAccountJson.getRequired("service_account_json")

                /**
                 * Returns the raw JSON value of [scopes].
                 *
                 * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("scopes")
                @ExcludeMissing
                fun _scopes(): JsonField<List<String>> = scopes

                /**
                 * Returns the raw JSON value of [serviceAccountJson].
                 *
                 * Unlike [serviceAccountJson], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("service_account_json")
                @ExcludeMissing
                fun _serviceAccountJson(): JsonField<ServiceAccountJson> = serviceAccountJson

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
                     * Returns a mutable builder for constructing an instance of [Gcp].
                     *
                     * The following fields are required:
                     * ```java
                     * .scopes()
                     * .serviceAccountJson()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Gcp]. */
                class Builder internal constructor() {

                    private var scopes: JsonField<MutableList<String>>? = null
                    private var serviceAccountJson: JsonField<ServiceAccountJson>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(gcp: Gcp) = apply {
                        scopes = gcp.scopes.map { it.toMutableList() }
                        serviceAccountJson = gcp.serviceAccountJson
                        additionalProperties = gcp.additionalProperties.toMutableMap()
                    }

                    fun scopes(scopes: List<String>) = scopes(JsonField.of(scopes))

                    /**
                     * Sets [Builder.scopes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.scopes] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun scopes(scopes: JsonField<List<String>>) = apply {
                        this.scopes = scopes.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [scopes].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addScope(scope: String) = apply {
                        scopes =
                            (scopes ?: JsonField.of(mutableListOf())).also {
                                checkKnown("scopes", it).add(scope)
                            }
                    }

                    fun serviceAccountJson(serviceAccountJson: ServiceAccountJson) =
                        serviceAccountJson(JsonField.of(serviceAccountJson))

                    /**
                     * Sets [Builder.serviceAccountJson] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serviceAccountJson] with a well-typed
                     * [ServiceAccountJson] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun serviceAccountJson(serviceAccountJson: JsonField<ServiceAccountJson>) =
                        apply {
                            this.serviceAccountJson = serviceAccountJson
                        }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Gcp].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .scopes()
                     * .serviceAccountJson()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Gcp =
                        Gcp(
                            checkRequired("scopes", scopes).map { it.toImmutable() },
                            checkRequired("serviceAccountJson", serviceAccountJson),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Gcp = apply {
                    if (validated) {
                        return@apply
                    }

                    scopes()
                    serviceAccountJson().validate()
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
                    (scopes.asKnown().getOrNull()?.size ?: 0) +
                        (serviceAccountJson.asKnown().getOrNull()?.validity() ?: 0)

                class ServiceAccountJson
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                         * Returns a mutable builder for constructing an instance of
                         * [ServiceAccountJson].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ServiceAccountJson]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(serviceAccountJson: ServiceAccountJson) = apply {
                            type = serviceAccountJson.type
                            isSet = serviceAccountJson.isSet
                            value = serviceAccountJson.value
                            additionalProperties =
                                serviceAccountJson.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ServiceAccountJson].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): ServiceAccountJson =
                            ServiceAccountJson(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): ServiceAccountJson = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
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
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
                            if (validated) {
                                return@apply
                            }

                            known()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ServiceAccountJson &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ServiceAccountJson{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Gcp &&
                        scopes == other.scopes &&
                        serviceAccountJson == other.serviceAccountJson &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(scopes, serviceAccountJson, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Gcp{scopes=$scopes, serviceAccountJson=$serviceAccountJson, additionalProperties=$additionalProperties}"
            }

            class Header
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val type: JsonField<Type>,
                private val isSet: JsonField<Boolean>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("is_set")
                    @ExcludeMissing
                    isSet: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(name, type, isSet, value, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun value(): Optional<String> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [isSet].
                 *
                 * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                     * Returns a mutable builder for constructing an instance of [Header].
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Header]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var type: JsonField<Type>? = null
                    private var isSet: JsonField<Boolean> = JsonMissing.of()
                    private var value: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(header: Header) = apply {
                        name = header.name
                        type = header.type
                        isSet = header.isSet
                        value = header.value
                        additionalProperties = header.additionalProperties.toMutableMap()
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                    /**
                     * Sets [Builder.isSet] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Header].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Header =
                        Header(
                            checkRequired("name", name),
                            checkRequired("type", type),
                            isSet,
                            value,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Header = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    type().validate()
                    isSet()
                    value()
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (isSet.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val PLAINTEXT = of("plaintext")

                        @JvmField val OPAQUE = of("opaque")

                        @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        PLAINTEXT,
                        OPAQUE,
                        WORKSPACE_SECRET,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PLAINTEXT,
                        OPAQUE,
                        WORKSPACE_SECRET,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PLAINTEXT -> Value.PLAINTEXT
                            OPAQUE -> Value.OPAQUE
                            WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PLAINTEXT -> Known.PLAINTEXT
                            OPAQUE -> Known.OPAQUE
                            WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                            else -> throw LangChainInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LangChainInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Type = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Header &&
                        name == other.name &&
                        type == other.type &&
                        isSet == other.isSet &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, type, isSet, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Header{name=$name, type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Rule &&
                    name == other.name &&
                    aws == other.aws &&
                    enabled == other.enabled &&
                    gcp == other.gcp &&
                    headers == other.headers &&
                    matchHosts == other.matchHosts &&
                    matchPaths == other.matchPaths &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    name,
                    aws,
                    enabled,
                    gcp,
                    headers,
                    matchHosts,
                    matchPaths,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Rule{name=$name, aws=$aws, enabled=$enabled, gcp=$gcp, headers=$headers, matchHosts=$matchHosts, matchPaths=$matchPaths, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProxyConfig &&
                accessControl == other.accessControl &&
                callbacks == other.callbacks &&
                noProxy == other.noProxy &&
                rules == other.rules &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accessControl, callbacks, noProxy, rules, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProxyConfig{accessControl=$accessControl, callbacks=$callbacks, noProxy=$noProxy, rules=$rules, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BoxStartResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            dataplaneUrl == other.dataplaneUrl &&
            deleteAfterStopSeconds == other.deleteAfterStopSeconds &&
            fsCapacityBytes == other.fsCapacityBytes &&
            idleTtlSeconds == other.idleTtlSeconds &&
            memBytes == other.memBytes &&
            mountConfig == other.mountConfig &&
            name == other.name &&
            proxyConfig == other.proxyConfig &&
            sizeClass == other.sizeClass &&
            snapshotId == other.snapshotId &&
            status == other.status &&
            statusMessage == other.statusMessage &&
            stoppedAt == other.stoppedAt &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            vcpus == other.vcpus &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            createdBy,
            dataplaneUrl,
            deleteAfterStopSeconds,
            fsCapacityBytes,
            idleTtlSeconds,
            memBytes,
            mountConfig,
            name,
            proxyConfig,
            sizeClass,
            snapshotId,
            status,
            statusMessage,
            stoppedAt,
            updatedAt,
            updatedBy,
            vcpus,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BoxStartResponse{id=$id, createdAt=$createdAt, createdBy=$createdBy, dataplaneUrl=$dataplaneUrl, deleteAfterStopSeconds=$deleteAfterStopSeconds, fsCapacityBytes=$fsCapacityBytes, idleTtlSeconds=$idleTtlSeconds, memBytes=$memBytes, mountConfig=$mountConfig, name=$name, proxyConfig=$proxyConfig, sizeClass=$sizeClass, snapshotId=$snapshotId, status=$status, statusMessage=$statusMessage, stoppedAt=$stoppedAt, updatedAt=$updatedAt, updatedBy=$updatedBy, vcpus=$vcpus, additionalProperties=$additionalProperties}"
}
