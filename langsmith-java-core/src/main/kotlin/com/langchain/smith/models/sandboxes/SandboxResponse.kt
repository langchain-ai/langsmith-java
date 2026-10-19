// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SandboxResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accessDelegation: JsonField<AccessDelegation>,
    private val cpuMillicores: JsonField<Long>,
    private val createdAt: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val dataplaneUrl: JsonField<String>,
    private val deleteAfterStopSeconds: JsonField<Long>,
    private val fsCapacityBytes: JsonField<Long>,
    private val idleTtlSeconds: JsonField<Long>,
    private val labels: JsonField<Labels>,
    private val memBytes: JsonField<Long>,
    private val mountConfig: JsonField<SandboxMountConfig>,
    private val name: JsonField<String>,
    private val preserveMemoryOnStop: JsonField<Boolean>,
    private val proxyConfig: JsonField<ProxyConfig>,
    private val runConfig: JsonField<RunConfig>,
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
        @JsonProperty("access_delegation")
        @ExcludeMissing
        accessDelegation: JsonField<AccessDelegation> = JsonMissing.of(),
        @JsonProperty("cpu_millicores")
        @ExcludeMissing
        cpuMillicores: JsonField<Long> = JsonMissing.of(),
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
        @JsonProperty("labels") @ExcludeMissing labels: JsonField<Labels> = JsonMissing.of(),
        @JsonProperty("mem_bytes") @ExcludeMissing memBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mount_config")
        @ExcludeMissing
        mountConfig: JsonField<SandboxMountConfig> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("preserve_memory_on_stop")
        @ExcludeMissing
        preserveMemoryOnStop: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("proxy_config")
        @ExcludeMissing
        proxyConfig: JsonField<ProxyConfig> = JsonMissing.of(),
        @JsonProperty("run_config")
        @ExcludeMissing
        runConfig: JsonField<RunConfig> = JsonMissing.of(),
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
        accessDelegation,
        cpuMillicores,
        createdAt,
        createdBy,
        dataplaneUrl,
        deleteAfterStopSeconds,
        fsCapacityBytes,
        idleTtlSeconds,
        labels,
        memBytes,
        mountConfig,
        name,
        preserveMemoryOnStop,
        proxyConfig,
        runConfig,
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
     * AccessDelegation is the LangSmith access this sandbox was granted, absent when it has none.
     * It is reported exactly as it was requested at create.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accessDelegation(): Optional<AccessDelegation> =
        accessDelegation.getOptional("access_delegation")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cpuMillicores(): Optional<Long> = cpuMillicores.getOptional("cpu_millicores")

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
    fun labels(): Optional<Labels> = labels.getOptional("labels")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memBytes(): Optional<Long> = memBytes.getOptional("mem_bytes")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mountConfig(): Optional<SandboxMountConfig> = mountConfig.getOptional("mount_config")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preserveMemoryOnStop(): Optional<Boolean> =
        preserveMemoryOnStop.getOptional("preserve_memory_on_stop")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proxyConfig(): Optional<ProxyConfig> = proxyConfig.getOptional("proxy_config")

    /**
     * RunConfig is what the sandbox's commands run with: the user, working directory and base env
     * beneath env_vars.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runConfig(): Optional<RunConfig> = runConfig.getOptional("run_config")

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
     * Returns the raw JSON value of [accessDelegation].
     *
     * Unlike [accessDelegation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("access_delegation")
    @ExcludeMissing
    fun _accessDelegation(): JsonField<AccessDelegation> = accessDelegation

    /**
     * Returns the raw JSON value of [cpuMillicores].
     *
     * Unlike [cpuMillicores], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cpu_millicores")
    @ExcludeMissing
    fun _cpuMillicores(): JsonField<Long> = cpuMillicores

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
     * Returns the raw JSON value of [labels].
     *
     * Unlike [labels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("labels") @ExcludeMissing fun _labels(): JsonField<Labels> = labels

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
    fun _mountConfig(): JsonField<SandboxMountConfig> = mountConfig

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [preserveMemoryOnStop].
     *
     * Unlike [preserveMemoryOnStop], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("preserve_memory_on_stop")
    @ExcludeMissing
    fun _preserveMemoryOnStop(): JsonField<Boolean> = preserveMemoryOnStop

    /**
     * Returns the raw JSON value of [proxyConfig].
     *
     * Unlike [proxyConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("proxy_config")
    @ExcludeMissing
    fun _proxyConfig(): JsonField<ProxyConfig> = proxyConfig

    /**
     * Returns the raw JSON value of [runConfig].
     *
     * Unlike [runConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_config") @ExcludeMissing fun _runConfig(): JsonField<RunConfig> = runConfig

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

        /** Returns a mutable builder for constructing an instance of [SandboxResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SandboxResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var accessDelegation: JsonField<AccessDelegation> = JsonMissing.of()
        private var cpuMillicores: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dataplaneUrl: JsonField<String> = JsonMissing.of()
        private var deleteAfterStopSeconds: JsonField<Long> = JsonMissing.of()
        private var fsCapacityBytes: JsonField<Long> = JsonMissing.of()
        private var idleTtlSeconds: JsonField<Long> = JsonMissing.of()
        private var labels: JsonField<Labels> = JsonMissing.of()
        private var memBytes: JsonField<Long> = JsonMissing.of()
        private var mountConfig: JsonField<SandboxMountConfig> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var preserveMemoryOnStop: JsonField<Boolean> = JsonMissing.of()
        private var proxyConfig: JsonField<ProxyConfig> = JsonMissing.of()
        private var runConfig: JsonField<RunConfig> = JsonMissing.of()
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
        internal fun from(sandboxResponse: SandboxResponse) = apply {
            id = sandboxResponse.id
            accessDelegation = sandboxResponse.accessDelegation
            cpuMillicores = sandboxResponse.cpuMillicores
            createdAt = sandboxResponse.createdAt
            createdBy = sandboxResponse.createdBy
            dataplaneUrl = sandboxResponse.dataplaneUrl
            deleteAfterStopSeconds = sandboxResponse.deleteAfterStopSeconds
            fsCapacityBytes = sandboxResponse.fsCapacityBytes
            idleTtlSeconds = sandboxResponse.idleTtlSeconds
            labels = sandboxResponse.labels
            memBytes = sandboxResponse.memBytes
            mountConfig = sandboxResponse.mountConfig
            name = sandboxResponse.name
            preserveMemoryOnStop = sandboxResponse.preserveMemoryOnStop
            proxyConfig = sandboxResponse.proxyConfig
            runConfig = sandboxResponse.runConfig
            sizeClass = sandboxResponse.sizeClass
            snapshotId = sandboxResponse.snapshotId
            status = sandboxResponse.status
            statusMessage = sandboxResponse.statusMessage
            stoppedAt = sandboxResponse.stoppedAt
            updatedAt = sandboxResponse.updatedAt
            updatedBy = sandboxResponse.updatedBy
            vcpus = sandboxResponse.vcpus
            additionalProperties = sandboxResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * AccessDelegation is the LangSmith access this sandbox was granted, absent when it has
         * none. It is reported exactly as it was requested at create.
         */
        fun accessDelegation(accessDelegation: AccessDelegation) =
            accessDelegation(JsonField.of(accessDelegation))

        /**
         * Sets [Builder.accessDelegation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessDelegation] with a well-typed [AccessDelegation]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accessDelegation(accessDelegation: JsonField<AccessDelegation>) = apply {
            this.accessDelegation = accessDelegation
        }

        fun cpuMillicores(cpuMillicores: Long) = cpuMillicores(JsonField.of(cpuMillicores))

        /**
         * Sets [Builder.cpuMillicores] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cpuMillicores] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cpuMillicores(cpuMillicores: JsonField<Long>) = apply {
            this.cpuMillicores = cpuMillicores
        }

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

        fun labels(labels: Labels) = labels(JsonField.of(labels))

        /**
         * Sets [Builder.labels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labels] with a well-typed [Labels] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun labels(labels: JsonField<Labels>) = apply { this.labels = labels }

        fun memBytes(memBytes: Long) = memBytes(JsonField.of(memBytes))

        /**
         * Sets [Builder.memBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memBytes(memBytes: JsonField<Long>) = apply { this.memBytes = memBytes }

        fun mountConfig(mountConfig: SandboxMountConfig) = mountConfig(JsonField.of(mountConfig))

        /**
         * Sets [Builder.mountConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mountConfig] with a well-typed [SandboxMountConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun mountConfig(mountConfig: JsonField<SandboxMountConfig>) = apply {
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

        fun preserveMemoryOnStop(preserveMemoryOnStop: Boolean) =
            preserveMemoryOnStop(JsonField.of(preserveMemoryOnStop))

        /**
         * Sets [Builder.preserveMemoryOnStop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preserveMemoryOnStop] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preserveMemoryOnStop(preserveMemoryOnStop: JsonField<Boolean>) = apply {
            this.preserveMemoryOnStop = preserveMemoryOnStop
        }

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

        /**
         * RunConfig is what the sandbox's commands run with: the user, working directory and base
         * env beneath env_vars.
         */
        fun runConfig(runConfig: RunConfig) = runConfig(JsonField.of(runConfig))

        /**
         * Sets [Builder.runConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runConfig] with a well-typed [RunConfig] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runConfig(runConfig: JsonField<RunConfig>) = apply { this.runConfig = runConfig }

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
         * Returns an immutable instance of [SandboxResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SandboxResponse =
            SandboxResponse(
                id,
                accessDelegation,
                cpuMillicores,
                createdAt,
                createdBy,
                dataplaneUrl,
                deleteAfterStopSeconds,
                fsCapacityBytes,
                idleTtlSeconds,
                labels,
                memBytes,
                mountConfig,
                name,
                preserveMemoryOnStop,
                proxyConfig,
                runConfig,
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
    fun validate(): SandboxResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        accessDelegation().ifPresent { it.validate() }
        cpuMillicores()
        createdAt()
        createdBy()
        dataplaneUrl()
        deleteAfterStopSeconds()
        fsCapacityBytes()
        idleTtlSeconds()
        labels().ifPresent { it.validate() }
        memBytes()
        mountConfig().ifPresent { it.validate() }
        name()
        preserveMemoryOnStop()
        proxyConfig().ifPresent { it.validate() }
        runConfig().ifPresent { it.validate() }
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
            (accessDelegation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cpuMillicores.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dataplaneUrl.asKnown().isPresent) 1 else 0) +
            (if (deleteAfterStopSeconds.asKnown().isPresent) 1 else 0) +
            (if (fsCapacityBytes.asKnown().isPresent) 1 else 0) +
            (if (idleTtlSeconds.asKnown().isPresent) 1 else 0) +
            (labels.asKnown().getOrNull()?.validity() ?: 0) +
            (if (memBytes.asKnown().isPresent) 1 else 0) +
            (mountConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (preserveMemoryOnStop.asKnown().isPresent) 1 else 0) +
            (proxyConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (runConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sizeClass.asKnown().isPresent) 1 else 0) +
            (if (snapshotId.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (statusMessage.asKnown().isPresent) 1 else 0) +
            (if (stoppedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (vcpus.asKnown().isPresent) 1 else 0)

    /**
     * AccessDelegation is the LangSmith access this sandbox was granted, absent when it has none.
     * It is reported exactly as it was requested at create.
     */
    class AccessDelegation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val mode: JsonField<Mode>,
        private val permissions: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
            @JsonProperty("permissions")
            @ExcludeMissing
            permissions: JsonField<List<String>> = JsonMissing.of(),
        ) : this(mode, permissions, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mode(): Mode = mode.getRequired("mode")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun permissions(): Optional<List<String>> = permissions.getOptional("permissions")

        /**
         * Returns the raw JSON value of [mode].
         *
         * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

        /**
         * Returns the raw JSON value of [permissions].
         *
         * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("permissions")
        @ExcludeMissing
        fun _permissions(): JsonField<List<String>> = permissions

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
             * Returns a mutable builder for constructing an instance of [AccessDelegation].
             *
             * The following fields are required:
             * ```java
             * .mode()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccessDelegation]. */
        class Builder internal constructor() {

            private var mode: JsonField<Mode>? = null
            private var permissions: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accessDelegation: AccessDelegation) = apply {
                mode = accessDelegation.mode
                permissions = accessDelegation.permissions.map { it.toMutableList() }
                additionalProperties = accessDelegation.additionalProperties.toMutableMap()
            }

            fun mode(mode: Mode) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

            fun permissions(permissions: List<String>) = permissions(JsonField.of(permissions))

            /**
             * Sets [Builder.permissions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.permissions] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun permissions(permissions: JsonField<List<String>>) = apply {
                this.permissions = permissions.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [permissions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPermission(permission: String) = apply {
                permissions =
                    (permissions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("permissions", it).add(permission)
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
             * Returns an immutable instance of [AccessDelegation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .mode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccessDelegation =
                AccessDelegation(
                    checkRequired("mode", mode),
                    (permissions ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): AccessDelegation = apply {
            if (validated) {
                return@apply
            }

            mode().validate()
            permissions()
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
            (mode.asKnown().getOrNull()?.validity() ?: 0) +
                (permissions.asKnown().getOrNull()?.size ?: 0)

        class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val INHERIT = of("INHERIT")

                @JvmField val EXPLICIT = of("EXPLICIT")

                @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
            }

            /** An enum containing [Mode]'s known values. */
            enum class Known {
                INHERIT,
                EXPLICIT,
            }

            /**
             * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Mode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INHERIT,
                EXPLICIT,
                /** An enum member indicating that [Mode] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    INHERIT -> Value.INHERIT
                    EXPLICIT -> Value.EXPLICIT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    INHERIT -> Known.INHERIT
                    EXPLICIT -> Known.EXPLICIT
                    else -> throw LangChainInvalidDataException("Unknown Mode: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangChainInvalidDataException("Value is not a String")
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
            fun validate(): Mode = apply {
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Mode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccessDelegation &&
                mode == other.mode &&
                permissions == other.permissions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(mode, permissions, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccessDelegation{mode=$mode, permissions=$permissions, additionalProperties=$additionalProperties}"
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

    /**
     * RunConfig is what the sandbox's commands run with: the user, working directory and base env
     * beneath env_vars.
     */
    class RunConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val envVars: JsonField<EnvVars>,
        private val user: JsonField<String>,
        private val workDir: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("env_vars")
            @ExcludeMissing
            envVars: JsonField<EnvVars> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
            @JsonProperty("work_dir") @ExcludeMissing workDir: JsonField<String> = JsonMissing.of(),
        ) : this(envVars, user, workDir, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun envVars(): Optional<EnvVars> = envVars.getOptional("env_vars")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun user(): Optional<String> = user.getOptional("user")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun workDir(): Optional<String> = workDir.getOptional("work_dir")

        /**
         * Returns the raw JSON value of [envVars].
         *
         * Unlike [envVars], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("env_vars") @ExcludeMissing fun _envVars(): JsonField<EnvVars> = envVars

        /**
         * Returns the raw JSON value of [user].
         *
         * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

        /**
         * Returns the raw JSON value of [workDir].
         *
         * Unlike [workDir], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("work_dir") @ExcludeMissing fun _workDir(): JsonField<String> = workDir

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

            /** Returns a mutable builder for constructing an instance of [RunConfig]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RunConfig]. */
        class Builder internal constructor() {

            private var envVars: JsonField<EnvVars> = JsonMissing.of()
            private var user: JsonField<String> = JsonMissing.of()
            private var workDir: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(runConfig: RunConfig) = apply {
                envVars = runConfig.envVars
                user = runConfig.user
                workDir = runConfig.workDir
                additionalProperties = runConfig.additionalProperties.toMutableMap()
            }

            fun envVars(envVars: EnvVars) = envVars(JsonField.of(envVars))

            /**
             * Sets [Builder.envVars] to an arbitrary JSON value.
             *
             * You should usually call [Builder.envVars] with a well-typed [EnvVars] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun envVars(envVars: JsonField<EnvVars>) = apply { this.envVars = envVars }

            fun user(user: String) = user(JsonField.of(user))

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun user(user: JsonField<String>) = apply { this.user = user }

            fun workDir(workDir: String) = workDir(JsonField.of(workDir))

            /**
             * Sets [Builder.workDir] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workDir] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun workDir(workDir: JsonField<String>) = apply { this.workDir = workDir }

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
             * Returns an immutable instance of [RunConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RunConfig =
                RunConfig(envVars, user, workDir, additionalProperties.toMutableMap())
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
        fun validate(): RunConfig = apply {
            if (validated) {
                return@apply
            }

            envVars().ifPresent { it.validate() }
            user()
            workDir()
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
            (envVars.asKnown().getOrNull()?.validity() ?: 0) +
                (if (user.asKnown().isPresent) 1 else 0) +
                (if (workDir.asKnown().isPresent) 1 else 0)

        class EnvVars
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

                /** Returns a mutable builder for constructing an instance of [EnvVars]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [EnvVars]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(envVars: EnvVars) = apply {
                    additionalProperties = envVars.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [EnvVars].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): EnvVars = EnvVars(additionalProperties.toImmutable())
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
            fun validate(): EnvVars = apply {
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

                return other is EnvVars && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "EnvVars{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RunConfig &&
                envVars == other.envVars &&
                user == other.user &&
                workDir == other.workDir &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(envVars, user, workDir, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RunConfig{envVars=$envVars, user=$user, workDir=$workDir, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SandboxResponse &&
            id == other.id &&
            accessDelegation == other.accessDelegation &&
            cpuMillicores == other.cpuMillicores &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            dataplaneUrl == other.dataplaneUrl &&
            deleteAfterStopSeconds == other.deleteAfterStopSeconds &&
            fsCapacityBytes == other.fsCapacityBytes &&
            idleTtlSeconds == other.idleTtlSeconds &&
            labels == other.labels &&
            memBytes == other.memBytes &&
            mountConfig == other.mountConfig &&
            name == other.name &&
            preserveMemoryOnStop == other.preserveMemoryOnStop &&
            proxyConfig == other.proxyConfig &&
            runConfig == other.runConfig &&
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
            accessDelegation,
            cpuMillicores,
            createdAt,
            createdBy,
            dataplaneUrl,
            deleteAfterStopSeconds,
            fsCapacityBytes,
            idleTtlSeconds,
            labels,
            memBytes,
            mountConfig,
            name,
            preserveMemoryOnStop,
            proxyConfig,
            runConfig,
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
        "SandboxResponse{id=$id, accessDelegation=$accessDelegation, cpuMillicores=$cpuMillicores, createdAt=$createdAt, createdBy=$createdBy, dataplaneUrl=$dataplaneUrl, deleteAfterStopSeconds=$deleteAfterStopSeconds, fsCapacityBytes=$fsCapacityBytes, idleTtlSeconds=$idleTtlSeconds, labels=$labels, memBytes=$memBytes, mountConfig=$mountConfig, name=$name, preserveMemoryOnStop=$preserveMemoryOnStop, proxyConfig=$proxyConfig, runConfig=$runConfig, sizeClass=$sizeClass, snapshotId=$snapshotId, status=$status, statusMessage=$statusMessage, stoppedAt=$stoppedAt, updatedAt=$updatedAt, updatedBy=$updatedBy, vcpus=$vcpus, additionalProperties=$additionalProperties}"
}
