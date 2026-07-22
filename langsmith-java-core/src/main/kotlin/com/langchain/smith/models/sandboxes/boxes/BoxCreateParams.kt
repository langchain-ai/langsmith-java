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
import com.langchain.smith.core.Params
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a new sandbox from a snapshot. Provide at most one of `snapshot_id` or `snapshot_name`; if
 * neither is provided, the server uses the default snapshot.
 */
class BoxCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * CPUMillicores optionally requests CPU at millicore granularity (e.g. 500 = 0.5 vCPU); takes
     * precedence over VCPUs. Fractional (sub-vCPU) values are not available for every sandbox.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cpuMillicores(): Optional<Long> = body.cpuMillicores()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deleteAfterStopSeconds(): Optional<Long> = body.deleteAfterStopSeconds()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun envVars(): Optional<EnvVars> = body.envVars()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fsCapacityBytes(): Optional<Long> = body.fsCapacityBytes()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idleTtlSeconds(): Optional<Long> = body.idleTtlSeconds()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memBytes(): Optional<Long> = body.memBytes()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mountConfig(): Optional<MountConfig> = body.mountConfig()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * PreserveMemoryOnStop, when true, suspends the sandbox's memory on a voluntary stop (idle
     * timeout or explicit stop) so the next start resumes from where it left off. Default false
     * discards memory and keeps only the filesystem, so the next start is a cold boot. Restarts
     * triggered by infrastructure maintenance always preserve memory regardless of this setting.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preserveMemoryOnStop(): Optional<Boolean> = body.preserveMemoryOnStop()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proxyConfig(): Optional<ProxyConfig> = body.proxyConfig()

    /**
     * RestoreMemory selects how the sandbox handles a snapshot's captured memory:
     *
     * nil → if-present: resume from memory when the snapshot has it, else cold-boot (default). true
     * → always: resume from memory; rejected if the snapshot has none. false → never: always
     * cold-boot.
     *
     * Applies to this request only.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun restoreMemory(): Optional<Boolean> = body.restoreMemory()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun snapshotId(): Optional<String> = body.snapshotId()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun snapshotName(): Optional<String> = body.snapshotName()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tagValueIds(): Optional<List<String>> = body.tagValueIds()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vcpus(): Optional<Long> = body.vcpus()

    /**
     * Returns the raw JSON value of [cpuMillicores].
     *
     * Unlike [cpuMillicores], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cpuMillicores(): JsonField<Long> = body._cpuMillicores()

    /**
     * Returns the raw JSON value of [deleteAfterStopSeconds].
     *
     * Unlike [deleteAfterStopSeconds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _deleteAfterStopSeconds(): JsonField<Long> = body._deleteAfterStopSeconds()

    /**
     * Returns the raw JSON value of [envVars].
     *
     * Unlike [envVars], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _envVars(): JsonField<EnvVars> = body._envVars()

    /**
     * Returns the raw JSON value of [fsCapacityBytes].
     *
     * Unlike [fsCapacityBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fsCapacityBytes(): JsonField<Long> = body._fsCapacityBytes()

    /**
     * Returns the raw JSON value of [idleTtlSeconds].
     *
     * Unlike [idleTtlSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _idleTtlSeconds(): JsonField<Long> = body._idleTtlSeconds()

    /**
     * Returns the raw JSON value of [memBytes].
     *
     * Unlike [memBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _memBytes(): JsonField<Long> = body._memBytes()

    /**
     * Returns the raw JSON value of [mountConfig].
     *
     * Unlike [mountConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mountConfig(): JsonField<MountConfig> = body._mountConfig()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [preserveMemoryOnStop].
     *
     * Unlike [preserveMemoryOnStop], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _preserveMemoryOnStop(): JsonField<Boolean> = body._preserveMemoryOnStop()

    /**
     * Returns the raw JSON value of [proxyConfig].
     *
     * Unlike [proxyConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _proxyConfig(): JsonField<ProxyConfig> = body._proxyConfig()

    /**
     * Returns the raw JSON value of [restoreMemory].
     *
     * Unlike [restoreMemory], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _restoreMemory(): JsonField<Boolean> = body._restoreMemory()

    /**
     * Returns the raw JSON value of [snapshotId].
     *
     * Unlike [snapshotId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _snapshotId(): JsonField<String> = body._snapshotId()

    /**
     * Returns the raw JSON value of [snapshotName].
     *
     * Unlike [snapshotName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _snapshotName(): JsonField<String> = body._snapshotName()

    /**
     * Returns the raw JSON value of [tagValueIds].
     *
     * Unlike [tagValueIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tagValueIds(): JsonField<List<String>> = body._tagValueIds()

    /**
     * Returns the raw JSON value of [vcpus].
     *
     * Unlike [vcpus], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vcpus(): JsonField<Long> = body._vcpus()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BoxCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [BoxCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BoxCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(boxCreateParams: BoxCreateParams) = apply {
            body = boxCreateParams.body.toBuilder()
            additionalHeaders = boxCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = boxCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [cpuMillicores]
         * - [deleteAfterStopSeconds]
         * - [envVars]
         * - [fsCapacityBytes]
         * - [idleTtlSeconds]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * CPUMillicores optionally requests CPU at millicore granularity (e.g. 500 = 0.5 vCPU);
         * takes precedence over VCPUs. Fractional (sub-vCPU) values are not available for every
         * sandbox.
         */
        fun cpuMillicores(cpuMillicores: Long) = apply { body.cpuMillicores(cpuMillicores) }

        /**
         * Sets [Builder.cpuMillicores] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cpuMillicores] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cpuMillicores(cpuMillicores: JsonField<Long>) = apply {
            body.cpuMillicores(cpuMillicores)
        }

        fun deleteAfterStopSeconds(deleteAfterStopSeconds: Long) = apply {
            body.deleteAfterStopSeconds(deleteAfterStopSeconds)
        }

        /**
         * Sets [Builder.deleteAfterStopSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deleteAfterStopSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deleteAfterStopSeconds(deleteAfterStopSeconds: JsonField<Long>) = apply {
            body.deleteAfterStopSeconds(deleteAfterStopSeconds)
        }

        fun envVars(envVars: EnvVars) = apply { body.envVars(envVars) }

        /**
         * Sets [Builder.envVars] to an arbitrary JSON value.
         *
         * You should usually call [Builder.envVars] with a well-typed [EnvVars] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun envVars(envVars: JsonField<EnvVars>) = apply { body.envVars(envVars) }

        fun fsCapacityBytes(fsCapacityBytes: Long) = apply { body.fsCapacityBytes(fsCapacityBytes) }

        /**
         * Sets [Builder.fsCapacityBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fsCapacityBytes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fsCapacityBytes(fsCapacityBytes: JsonField<Long>) = apply {
            body.fsCapacityBytes(fsCapacityBytes)
        }

        fun idleTtlSeconds(idleTtlSeconds: Long) = apply { body.idleTtlSeconds(idleTtlSeconds) }

        /**
         * Sets [Builder.idleTtlSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idleTtlSeconds] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idleTtlSeconds(idleTtlSeconds: JsonField<Long>) = apply {
            body.idleTtlSeconds(idleTtlSeconds)
        }

        fun memBytes(memBytes: Long) = apply { body.memBytes(memBytes) }

        /**
         * Sets [Builder.memBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memBytes(memBytes: JsonField<Long>) = apply { body.memBytes(memBytes) }

        fun mountConfig(mountConfig: MountConfig) = apply { body.mountConfig(mountConfig) }

        /**
         * Sets [Builder.mountConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mountConfig] with a well-typed [MountConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mountConfig(mountConfig: JsonField<MountConfig>) = apply {
            body.mountConfig(mountConfig)
        }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * PreserveMemoryOnStop, when true, suspends the sandbox's memory on a voluntary stop (idle
         * timeout or explicit stop) so the next start resumes from where it left off. Default false
         * discards memory and keeps only the filesystem, so the next start is a cold boot. Restarts
         * triggered by infrastructure maintenance always preserve memory regardless of this
         * setting.
         */
        fun preserveMemoryOnStop(preserveMemoryOnStop: Boolean) = apply {
            body.preserveMemoryOnStop(preserveMemoryOnStop)
        }

        /**
         * Sets [Builder.preserveMemoryOnStop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preserveMemoryOnStop] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preserveMemoryOnStop(preserveMemoryOnStop: JsonField<Boolean>) = apply {
            body.preserveMemoryOnStop(preserveMemoryOnStop)
        }

        fun proxyConfig(proxyConfig: ProxyConfig) = apply { body.proxyConfig(proxyConfig) }

        /**
         * Sets [Builder.proxyConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proxyConfig] with a well-typed [ProxyConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun proxyConfig(proxyConfig: JsonField<ProxyConfig>) = apply {
            body.proxyConfig(proxyConfig)
        }

        /**
         * RestoreMemory selects how the sandbox handles a snapshot's captured memory:
         *
         * nil → if-present: resume from memory when the snapshot has it, else cold-boot (default).
         * true → always: resume from memory; rejected if the snapshot has none. false → never:
         * always cold-boot.
         *
         * Applies to this request only.
         */
        fun restoreMemory(restoreMemory: Boolean) = apply { body.restoreMemory(restoreMemory) }

        /**
         * Sets [Builder.restoreMemory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restoreMemory] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun restoreMemory(restoreMemory: JsonField<Boolean>) = apply {
            body.restoreMemory(restoreMemory)
        }

        fun snapshotId(snapshotId: String) = apply { body.snapshotId(snapshotId) }

        /**
         * Sets [Builder.snapshotId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snapshotId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun snapshotId(snapshotId: JsonField<String>) = apply { body.snapshotId(snapshotId) }

        fun snapshotName(snapshotName: String) = apply { body.snapshotName(snapshotName) }

        /**
         * Sets [Builder.snapshotName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snapshotName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun snapshotName(snapshotName: JsonField<String>) = apply {
            body.snapshotName(snapshotName)
        }

        fun tagValueIds(tagValueIds: List<String>) = apply { body.tagValueIds(tagValueIds) }

        /**
         * Sets [Builder.tagValueIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagValueIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tagValueIds(tagValueIds: JsonField<List<String>>) = apply {
            body.tagValueIds(tagValueIds)
        }

        /**
         * Adds a single [String] to [tagValueIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTagValueId(tagValueId: String) = apply { body.addTagValueId(tagValueId) }

        fun vcpus(vcpus: Long) = apply { body.vcpus(vcpus) }

        /**
         * Sets [Builder.vcpus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vcpus] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vcpus(vcpus: JsonField<Long>) = apply { body.vcpus(vcpus) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [BoxCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BoxCreateParams =
            BoxCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cpuMillicores: JsonField<Long>,
        private val deleteAfterStopSeconds: JsonField<Long>,
        private val envVars: JsonField<EnvVars>,
        private val fsCapacityBytes: JsonField<Long>,
        private val idleTtlSeconds: JsonField<Long>,
        private val memBytes: JsonField<Long>,
        private val mountConfig: JsonField<MountConfig>,
        private val name: JsonField<String>,
        private val preserveMemoryOnStop: JsonField<Boolean>,
        private val proxyConfig: JsonField<ProxyConfig>,
        private val restoreMemory: JsonField<Boolean>,
        private val snapshotId: JsonField<String>,
        private val snapshotName: JsonField<String>,
        private val tagValueIds: JsonField<List<String>>,
        private val vcpus: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cpu_millicores")
            @ExcludeMissing
            cpuMillicores: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("delete_after_stop_seconds")
            @ExcludeMissing
            deleteAfterStopSeconds: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("env_vars")
            @ExcludeMissing
            envVars: JsonField<EnvVars> = JsonMissing.of(),
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
            @JsonProperty("preserve_memory_on_stop")
            @ExcludeMissing
            preserveMemoryOnStop: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("proxy_config")
            @ExcludeMissing
            proxyConfig: JsonField<ProxyConfig> = JsonMissing.of(),
            @JsonProperty("restore_memory")
            @ExcludeMissing
            restoreMemory: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("snapshot_id")
            @ExcludeMissing
            snapshotId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("snapshot_name")
            @ExcludeMissing
            snapshotName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tag_value_ids")
            @ExcludeMissing
            tagValueIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("vcpus") @ExcludeMissing vcpus: JsonField<Long> = JsonMissing.of(),
        ) : this(
            cpuMillicores,
            deleteAfterStopSeconds,
            envVars,
            fsCapacityBytes,
            idleTtlSeconds,
            memBytes,
            mountConfig,
            name,
            preserveMemoryOnStop,
            proxyConfig,
            restoreMemory,
            snapshotId,
            snapshotName,
            tagValueIds,
            vcpus,
            mutableMapOf(),
        )

        /**
         * CPUMillicores optionally requests CPU at millicore granularity (e.g. 500 = 0.5 vCPU);
         * takes precedence over VCPUs. Fractional (sub-vCPU) values are not available for every
         * sandbox.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cpuMillicores(): Optional<Long> = cpuMillicores.getOptional("cpu_millicores")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun deleteAfterStopSeconds(): Optional<Long> =
            deleteAfterStopSeconds.getOptional("delete_after_stop_seconds")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun envVars(): Optional<EnvVars> = envVars.getOptional("env_vars")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fsCapacityBytes(): Optional<Long> = fsCapacityBytes.getOptional("fs_capacity_bytes")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun idleTtlSeconds(): Optional<Long> = idleTtlSeconds.getOptional("idle_ttl_seconds")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun memBytes(): Optional<Long> = memBytes.getOptional("mem_bytes")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mountConfig(): Optional<MountConfig> = mountConfig.getOptional("mount_config")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * PreserveMemoryOnStop, when true, suspends the sandbox's memory on a voluntary stop (idle
         * timeout or explicit stop) so the next start resumes from where it left off. Default false
         * discards memory and keeps only the filesystem, so the next start is a cold boot. Restarts
         * triggered by infrastructure maintenance always preserve memory regardless of this
         * setting.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun preserveMemoryOnStop(): Optional<Boolean> =
            preserveMemoryOnStop.getOptional("preserve_memory_on_stop")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun proxyConfig(): Optional<ProxyConfig> = proxyConfig.getOptional("proxy_config")

        /**
         * RestoreMemory selects how the sandbox handles a snapshot's captured memory:
         *
         * nil → if-present: resume from memory when the snapshot has it, else cold-boot (default).
         * true → always: resume from memory; rejected if the snapshot has none. false → never:
         * always cold-boot.
         *
         * Applies to this request only.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun restoreMemory(): Optional<Boolean> = restoreMemory.getOptional("restore_memory")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun snapshotId(): Optional<String> = snapshotId.getOptional("snapshot_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun snapshotName(): Optional<String> = snapshotName.getOptional("snapshot_name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tagValueIds(): Optional<List<String>> = tagValueIds.getOptional("tag_value_ids")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun vcpus(): Optional<Long> = vcpus.getOptional("vcpus")

        /**
         * Returns the raw JSON value of [cpuMillicores].
         *
         * Unlike [cpuMillicores], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cpu_millicores")
        @ExcludeMissing
        fun _cpuMillicores(): JsonField<Long> = cpuMillicores

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
         * Returns the raw JSON value of [envVars].
         *
         * Unlike [envVars], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("env_vars") @ExcludeMissing fun _envVars(): JsonField<EnvVars> = envVars

        /**
         * Returns the raw JSON value of [fsCapacityBytes].
         *
         * Unlike [fsCapacityBytes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fs_capacity_bytes")
        @ExcludeMissing
        fun _fsCapacityBytes(): JsonField<Long> = fsCapacityBytes

        /**
         * Returns the raw JSON value of [idleTtlSeconds].
         *
         * Unlike [idleTtlSeconds], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [preserveMemoryOnStop].
         *
         * Unlike [preserveMemoryOnStop], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [restoreMemory].
         *
         * Unlike [restoreMemory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("restore_memory")
        @ExcludeMissing
        fun _restoreMemory(): JsonField<Boolean> = restoreMemory

        /**
         * Returns the raw JSON value of [snapshotId].
         *
         * Unlike [snapshotId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("snapshot_id")
        @ExcludeMissing
        fun _snapshotId(): JsonField<String> = snapshotId

        /**
         * Returns the raw JSON value of [snapshotName].
         *
         * Unlike [snapshotName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("snapshot_name")
        @ExcludeMissing
        fun _snapshotName(): JsonField<String> = snapshotName

        /**
         * Returns the raw JSON value of [tagValueIds].
         *
         * Unlike [tagValueIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_value_ids")
        @ExcludeMissing
        fun _tagValueIds(): JsonField<List<String>> = tagValueIds

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var cpuMillicores: JsonField<Long> = JsonMissing.of()
            private var deleteAfterStopSeconds: JsonField<Long> = JsonMissing.of()
            private var envVars: JsonField<EnvVars> = JsonMissing.of()
            private var fsCapacityBytes: JsonField<Long> = JsonMissing.of()
            private var idleTtlSeconds: JsonField<Long> = JsonMissing.of()
            private var memBytes: JsonField<Long> = JsonMissing.of()
            private var mountConfig: JsonField<MountConfig> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var preserveMemoryOnStop: JsonField<Boolean> = JsonMissing.of()
            private var proxyConfig: JsonField<ProxyConfig> = JsonMissing.of()
            private var restoreMemory: JsonField<Boolean> = JsonMissing.of()
            private var snapshotId: JsonField<String> = JsonMissing.of()
            private var snapshotName: JsonField<String> = JsonMissing.of()
            private var tagValueIds: JsonField<MutableList<String>>? = null
            private var vcpus: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                cpuMillicores = body.cpuMillicores
                deleteAfterStopSeconds = body.deleteAfterStopSeconds
                envVars = body.envVars
                fsCapacityBytes = body.fsCapacityBytes
                idleTtlSeconds = body.idleTtlSeconds
                memBytes = body.memBytes
                mountConfig = body.mountConfig
                name = body.name
                preserveMemoryOnStop = body.preserveMemoryOnStop
                proxyConfig = body.proxyConfig
                restoreMemory = body.restoreMemory
                snapshotId = body.snapshotId
                snapshotName = body.snapshotName
                tagValueIds = body.tagValueIds.map { it.toMutableList() }
                vcpus = body.vcpus
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * CPUMillicores optionally requests CPU at millicore granularity (e.g. 500 = 0.5 vCPU);
             * takes precedence over VCPUs. Fractional (sub-vCPU) values are not available for every
             * sandbox.
             */
            fun cpuMillicores(cpuMillicores: Long) = cpuMillicores(JsonField.of(cpuMillicores))

            /**
             * Sets [Builder.cpuMillicores] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cpuMillicores] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cpuMillicores(cpuMillicores: JsonField<Long>) = apply {
                this.cpuMillicores = cpuMillicores
            }

            fun deleteAfterStopSeconds(deleteAfterStopSeconds: Long) =
                deleteAfterStopSeconds(JsonField.of(deleteAfterStopSeconds))

            /**
             * Sets [Builder.deleteAfterStopSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deleteAfterStopSeconds] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun deleteAfterStopSeconds(deleteAfterStopSeconds: JsonField<Long>) = apply {
                this.deleteAfterStopSeconds = deleteAfterStopSeconds
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

            fun fsCapacityBytes(fsCapacityBytes: Long) =
                fsCapacityBytes(JsonField.of(fsCapacityBytes))

            /**
             * Sets [Builder.fsCapacityBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fsCapacityBytes] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fsCapacityBytes(fsCapacityBytes: JsonField<Long>) = apply {
                this.fsCapacityBytes = fsCapacityBytes
            }

            fun idleTtlSeconds(idleTtlSeconds: Long) = idleTtlSeconds(JsonField.of(idleTtlSeconds))

            /**
             * Sets [Builder.idleTtlSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idleTtlSeconds] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idleTtlSeconds(idleTtlSeconds: JsonField<Long>) = apply {
                this.idleTtlSeconds = idleTtlSeconds
            }

            fun memBytes(memBytes: Long) = memBytes(JsonField.of(memBytes))

            /**
             * Sets [Builder.memBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memBytes] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * PreserveMemoryOnStop, when true, suspends the sandbox's memory on a voluntary stop
             * (idle timeout or explicit stop) so the next start resumes from where it left off.
             * Default false discards memory and keeps only the filesystem, so the next start is a
             * cold boot. Restarts triggered by infrastructure maintenance always preserve memory
             * regardless of this setting.
             */
            fun preserveMemoryOnStop(preserveMemoryOnStop: Boolean) =
                preserveMemoryOnStop(JsonField.of(preserveMemoryOnStop))

            /**
             * Sets [Builder.preserveMemoryOnStop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preserveMemoryOnStop] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * RestoreMemory selects how the sandbox handles a snapshot's captured memory:
             *
             * nil → if-present: resume from memory when the snapshot has it, else cold-boot
             * (default). true → always: resume from memory; rejected if the snapshot has none.
             * false → never: always cold-boot.
             *
             * Applies to this request only.
             */
            fun restoreMemory(restoreMemory: Boolean) = restoreMemory(JsonField.of(restoreMemory))

            /**
             * Sets [Builder.restoreMemory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.restoreMemory] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun restoreMemory(restoreMemory: JsonField<Boolean>) = apply {
                this.restoreMemory = restoreMemory
            }

            fun snapshotId(snapshotId: String) = snapshotId(JsonField.of(snapshotId))

            /**
             * Sets [Builder.snapshotId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.snapshotId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun snapshotId(snapshotId: JsonField<String>) = apply { this.snapshotId = snapshotId }

            fun snapshotName(snapshotName: String) = snapshotName(JsonField.of(snapshotName))

            /**
             * Sets [Builder.snapshotName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.snapshotName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun snapshotName(snapshotName: JsonField<String>) = apply {
                this.snapshotName = snapshotName
            }

            fun tagValueIds(tagValueIds: List<String>) = tagValueIds(JsonField.of(tagValueIds))

            /**
             * Sets [Builder.tagValueIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tagValueIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tagValueIds(tagValueIds: JsonField<List<String>>) = apply {
                this.tagValueIds = tagValueIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tagValueIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTagValueId(tagValueId: String) = apply {
                tagValueIds =
                    (tagValueIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tagValueIds", it).add(tagValueId)
                    }
            }

            fun vcpus(vcpus: Long) = vcpus(JsonField.of(vcpus))

            /**
             * Sets [Builder.vcpus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vcpus] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    cpuMillicores,
                    deleteAfterStopSeconds,
                    envVars,
                    fsCapacityBytes,
                    idleTtlSeconds,
                    memBytes,
                    mountConfig,
                    name,
                    preserveMemoryOnStop,
                    proxyConfig,
                    restoreMemory,
                    snapshotId,
                    snapshotName,
                    (tagValueIds ?: JsonMissing.of()).map { it.toImmutable() },
                    vcpus,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            cpuMillicores()
            deleteAfterStopSeconds()
            envVars().ifPresent { it.validate() }
            fsCapacityBytes()
            idleTtlSeconds()
            memBytes()
            mountConfig().ifPresent { it.validate() }
            name()
            preserveMemoryOnStop()
            proxyConfig().ifPresent { it.validate() }
            restoreMemory()
            snapshotId()
            snapshotName()
            tagValueIds()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (cpuMillicores.asKnown().isPresent) 1 else 0) +
                (if (deleteAfterStopSeconds.asKnown().isPresent) 1 else 0) +
                (envVars.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fsCapacityBytes.asKnown().isPresent) 1 else 0) +
                (if (idleTtlSeconds.asKnown().isPresent) 1 else 0) +
                (if (memBytes.asKnown().isPresent) 1 else 0) +
                (mountConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (preserveMemoryOnStop.asKnown().isPresent) 1 else 0) +
                (proxyConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (restoreMemory.asKnown().isPresent) 1 else 0) +
                (if (snapshotId.asKnown().isPresent) 1 else 0) +
                (if (snapshotName.asKnown().isPresent) 1 else 0) +
                (tagValueIds.asKnown().getOrNull()?.size ?: 0) +
                (if (vcpus.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                cpuMillicores == other.cpuMillicores &&
                deleteAfterStopSeconds == other.deleteAfterStopSeconds &&
                envVars == other.envVars &&
                fsCapacityBytes == other.fsCapacityBytes &&
                idleTtlSeconds == other.idleTtlSeconds &&
                memBytes == other.memBytes &&
                mountConfig == other.mountConfig &&
                name == other.name &&
                preserveMemoryOnStop == other.preserveMemoryOnStop &&
                proxyConfig == other.proxyConfig &&
                restoreMemory == other.restoreMemory &&
                snapshotId == other.snapshotId &&
                snapshotName == other.snapshotName &&
                tagValueIds == other.tagValueIds &&
                vcpus == other.vcpus &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cpuMillicores,
                deleteAfterStopSeconds,
                envVars,
                fsCapacityBytes,
                idleTtlSeconds,
                memBytes,
                mountConfig,
                name,
                preserveMemoryOnStop,
                proxyConfig,
                restoreMemory,
                snapshotId,
                snapshotName,
                tagValueIds,
                vcpus,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{cpuMillicores=$cpuMillicores, deleteAfterStopSeconds=$deleteAfterStopSeconds, envVars=$envVars, fsCapacityBytes=$fsCapacityBytes, idleTtlSeconds=$idleTtlSeconds, memBytes=$memBytes, mountConfig=$mountConfig, name=$name, preserveMemoryOnStop=$preserveMemoryOnStop, proxyConfig=$proxyConfig, restoreMemory=$restoreMemory, snapshotId=$snapshotId, snapshotName=$snapshotName, tagValueIds=$tagValueIds, vcpus=$vcpus, additionalProperties=$additionalProperties}"
    }

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
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

            /**
             * Alias for calling [addMount] with
             * `Mount.ofSandboxapiContextHubRepoMountSpec(sandboxapiContextHubRepoMountSpec)`.
             */
            fun addMount(
                sandboxapiContextHubRepoMountSpec: Mount.SandboxapiContextHubRepoMountSpec
            ) =
                addMount(
                    Mount.ofSandboxapiContextHubRepoMountSpec(sandboxapiContextHubRepoMountSpec)
                )

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
            private val sandboxapiContextHubRepoMountSpec: SandboxapiContextHubRepoMountSpec? =
                null,
            private val _json: JsonValue? = null,
        ) {

            fun sandboxapiS3BucketMountSpec(): Optional<SandboxapiS3BucketMountSpec> =
                Optional.ofNullable(sandboxapiS3BucketMountSpec)

            fun sandboxapiGcsBucketMountSpec(): Optional<SandboxapiGcsBucketMountSpec> =
                Optional.ofNullable(sandboxapiGcsBucketMountSpec)

            fun sandboxapiGitRepoMountSpec(): Optional<SandboxapiGitRepoMountSpec> =
                Optional.ofNullable(sandboxapiGitRepoMountSpec)

            fun sandboxapiContextHubRepoMountSpec(): Optional<SandboxapiContextHubRepoMountSpec> =
                Optional.ofNullable(sandboxapiContextHubRepoMountSpec)

            fun isSandboxapiS3BucketMountSpec(): Boolean = sandboxapiS3BucketMountSpec != null

            fun isSandboxapiGcsBucketMountSpec(): Boolean = sandboxapiGcsBucketMountSpec != null

            fun isSandboxapiGitRepoMountSpec(): Boolean = sandboxapiGitRepoMountSpec != null

            fun isSandboxapiContextHubRepoMountSpec(): Boolean =
                sandboxapiContextHubRepoMountSpec != null

            fun asSandboxapiS3BucketMountSpec(): SandboxapiS3BucketMountSpec =
                sandboxapiS3BucketMountSpec.getOrThrow("sandboxapiS3BucketMountSpec")

            fun asSandboxapiGcsBucketMountSpec(): SandboxapiGcsBucketMountSpec =
                sandboxapiGcsBucketMountSpec.getOrThrow("sandboxapiGcsBucketMountSpec")

            fun asSandboxapiGitRepoMountSpec(): SandboxapiGitRepoMountSpec =
                sandboxapiGitRepoMountSpec.getOrThrow("sandboxapiGitRepoMountSpec")

            fun asSandboxapiContextHubRepoMountSpec(): SandboxapiContextHubRepoMountSpec =
                sandboxapiContextHubRepoMountSpec.getOrThrow("sandboxapiContextHubRepoMountSpec")

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
                    sandboxapiContextHubRepoMountSpec != null ->
                        visitor.visitSandboxapiContextHubRepoMountSpec(
                            sandboxapiContextHubRepoMountSpec
                        )
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

                        override fun visitSandboxapiContextHubRepoMountSpec(
                            sandboxapiContextHubRepoMountSpec: SandboxapiContextHubRepoMountSpec
                        ) {
                            sandboxapiContextHubRepoMountSpec.validate()
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

                        override fun visitSandboxapiContextHubRepoMountSpec(
                            sandboxapiContextHubRepoMountSpec: SandboxapiContextHubRepoMountSpec
                        ) = sandboxapiContextHubRepoMountSpec.validity()

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
                    sandboxapiGitRepoMountSpec == other.sandboxapiGitRepoMountSpec &&
                    sandboxapiContextHubRepoMountSpec == other.sandboxapiContextHubRepoMountSpec
            }

            override fun hashCode(): Int =
                Objects.hash(
                    sandboxapiS3BucketMountSpec,
                    sandboxapiGcsBucketMountSpec,
                    sandboxapiGitRepoMountSpec,
                    sandboxapiContextHubRepoMountSpec,
                )

            override fun toString(): String =
                when {
                    sandboxapiS3BucketMountSpec != null ->
                        "Mount{sandboxapiS3BucketMountSpec=$sandboxapiS3BucketMountSpec}"
                    sandboxapiGcsBucketMountSpec != null ->
                        "Mount{sandboxapiGcsBucketMountSpec=$sandboxapiGcsBucketMountSpec}"
                    sandboxapiGitRepoMountSpec != null ->
                        "Mount{sandboxapiGitRepoMountSpec=$sandboxapiGitRepoMountSpec}"
                    sandboxapiContextHubRepoMountSpec != null ->
                        "Mount{sandboxapiContextHubRepoMountSpec=$sandboxapiContextHubRepoMountSpec}"
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

                @JvmStatic
                fun ofSandboxapiContextHubRepoMountSpec(
                    sandboxapiContextHubRepoMountSpec: SandboxapiContextHubRepoMountSpec
                ) = Mount(sandboxapiContextHubRepoMountSpec = sandboxapiContextHubRepoMountSpec)
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

                fun visitSandboxapiContextHubRepoMountSpec(
                    sandboxapiContextHubRepoMountSpec: SandboxapiContextHubRepoMountSpec
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
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<SandboxapiContextHubRepoMountSpec>(),
                                    )
                                    ?.let {
                                        Mount(sandboxapiContextHubRepoMountSpec = it, _json = json)
                                    },
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
                        value.sandboxapiContextHubRepoMountSpec != null ->
                            generator.writeObject(value.sandboxapiContextHubRepoMountSpec)
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
                private val contexthub: JsonField<Contexthub>,
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
                    @JsonProperty("contexthub")
                    @ExcludeMissing
                    contexthub: JsonField<Contexthub> = JsonMissing.of(),
                    @JsonProperty("gcs") @ExcludeMissing gcs: JsonField<Gcs> = JsonMissing.of(),
                    @JsonProperty("git") @ExcludeMissing git: JsonField<Git> = JsonMissing.of(),
                    @JsonProperty("read_only")
                    @ExcludeMissing
                    readOnly: JsonField<Boolean> = JsonMissing.of(),
                ) : this(
                    id,
                    mountPath,
                    s3,
                    type,
                    cache,
                    contexthub,
                    gcs,
                    git,
                    readOnly,
                    mutableMapOf(),
                )

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
                fun contexthub(): Optional<Contexthub> = contexthub.getOptional("contexthub")

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
                 * Returns the raw JSON value of [contexthub].
                 *
                 * Unlike [contexthub], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("contexthub")
                @ExcludeMissing
                fun _contexthub(): JsonField<Contexthub> = contexthub

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
                    private var contexthub: JsonField<Contexthub> = JsonMissing.of()
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
                            contexthub = sandboxapiS3BucketMountSpec.contexthub
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

                    fun contexthub(contexthub: Contexthub) = contexthub(JsonField.of(contexthub))

                    /**
                     * Sets [Builder.contexthub] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.contexthub] with a well-typed [Contexthub]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun contexthub(contexthub: JsonField<Contexthub>) = apply {
                        this.contexthub = contexthub
                    }

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
                            contexthub,
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
                    contexthub().ifPresent { it.validate() }
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
                        (contexthub.asKnown().getOrNull()?.validity() ?: 0) +
                        (gcs.asKnown().getOrNull()?.validity() ?: 0) +
                        (git.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (readOnly.asKnown().isPresent) 1 else 0)

                class S3
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val bucket: JsonField<String>,
                    private val region: JsonField<String>,
                    private val endpointUrl: JsonField<String>,
                    private val pathStyle: JsonField<Boolean>,
                    private val prefix: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bucket")
                        @ExcludeMissing
                        bucket: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("region")
                        @ExcludeMissing
                        region: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("endpoint_url")
                        @ExcludeMissing
                        endpointUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("path_style")
                        @ExcludeMissing
                        pathStyle: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("prefix")
                        @ExcludeMissing
                        prefix: JsonField<String> = JsonMissing.of(),
                    ) : this(bucket, region, endpointUrl, pathStyle, prefix, mutableMapOf())

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
                    fun region(): String = region.getRequired("region")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun endpointUrl(): Optional<String> = endpointUrl.getOptional("endpoint_url")

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
                     * Returns the raw JSON value of [region].
                     *
                     * Unlike [region], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("region")
                    @ExcludeMissing
                    fun _region(): JsonField<String> = region

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
                         * .region()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [S3]. */
                    class Builder internal constructor() {

                        private var bucket: JsonField<String>? = null
                        private var region: JsonField<String>? = null
                        private var endpointUrl: JsonField<String> = JsonMissing.of()
                        private var pathStyle: JsonField<Boolean> = JsonMissing.of()
                        private var prefix: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(s3: S3) = apply {
                            bucket = s3.bucket
                            region = s3.region
                            endpointUrl = s3.endpointUrl
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

                        fun region(region: String) = region(JsonField.of(region))

                        /**
                         * Sets [Builder.region] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.region] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun region(region: JsonField<String>) = apply { this.region = region }

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
                         * .region()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): S3 =
                            S3(
                                checkRequired("bucket", bucket),
                                checkRequired("region", region),
                                endpointUrl,
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
                        region()
                        endpointUrl()
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
                            (if (region.asKnown().isPresent) 1 else 0) +
                            (if (endpointUrl.asKnown().isPresent) 1 else 0) +
                            (if (pathStyle.asKnown().isPresent) 1 else 0) +
                            (if (prefix.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is S3 &&
                            bucket == other.bucket &&
                            region == other.region &&
                            endpointUrl == other.endpointUrl &&
                            pathStyle == other.pathStyle &&
                            prefix == other.prefix &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            bucket,
                            region,
                            endpointUrl,
                            pathStyle,
                            prefix,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "S3{bucket=$bucket, region=$region, endpointUrl=$endpointUrl, pathStyle=$pathStyle, prefix=$prefix, additionalProperties=$additionalProperties}"
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

                        @JvmField val CONTEXTHUB = of("contexthub")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        S3,
                        GCS,
                        GIT,
                        CONTEXTHUB,
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
                        CONTEXTHUB,
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
                            CONTEXTHUB -> Value.CONTEXTHUB
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
                            CONTEXTHUB -> Known.CONTEXTHUB
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

                class Contexthub
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val repo: JsonField<String>,
                    private val initialPullOnly: JsonField<Boolean>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("repo")
                        @ExcludeMissing
                        repo: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("initial_pull_only")
                        @ExcludeMissing
                        initialPullOnly: JsonField<Boolean> = JsonMissing.of(),
                    ) : this(repo, initialPullOnly, mutableMapOf())

                    /**
                     * Repo is the Context Hub repository to sync, as "owner/repo" (e.g.
                     * "-/my-agent", where "-" is the current workspace). The repo's latest commit
                     * tree is mirrored into the mount path.
                     *
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun repo(): String = repo.getRequired("repo")

                    /**
                     * InitialPullOnly syncs the repo once at startup instead of polling for updates
                     * for the sandbox's lifetime.
                     *
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun initialPullOnly(): Optional<Boolean> =
                        initialPullOnly.getOptional("initial_pull_only")

                    /**
                     * Returns the raw JSON value of [repo].
                     *
                     * Unlike [repo], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("repo") @ExcludeMissing fun _repo(): JsonField<String> = repo

                    /**
                     * Returns the raw JSON value of [initialPullOnly].
                     *
                     * Unlike [initialPullOnly], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("initial_pull_only")
                    @ExcludeMissing
                    fun _initialPullOnly(): JsonField<Boolean> = initialPullOnly

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
                         * Returns a mutable builder for constructing an instance of [Contexthub].
                         *
                         * The following fields are required:
                         * ```java
                         * .repo()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Contexthub]. */
                    class Builder internal constructor() {

                        private var repo: JsonField<String>? = null
                        private var initialPullOnly: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(contexthub: Contexthub) = apply {
                            repo = contexthub.repo
                            initialPullOnly = contexthub.initialPullOnly
                            additionalProperties = contexthub.additionalProperties.toMutableMap()
                        }

                        /**
                         * Repo is the Context Hub repository to sync, as "owner/repo" (e.g.
                         * "-/my-agent", where "-" is the current workspace). The repo's latest
                         * commit tree is mirrored into the mount path.
                         */
                        fun repo(repo: String) = repo(JsonField.of(repo))

                        /**
                         * Sets [Builder.repo] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.repo] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun repo(repo: JsonField<String>) = apply { this.repo = repo }

                        /**
                         * InitialPullOnly syncs the repo once at startup instead of polling for
                         * updates for the sandbox's lifetime.
                         */
                        fun initialPullOnly(initialPullOnly: Boolean) =
                            initialPullOnly(JsonField.of(initialPullOnly))

                        /**
                         * Sets [Builder.initialPullOnly] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.initialPullOnly] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun initialPullOnly(initialPullOnly: JsonField<Boolean>) = apply {
                            this.initialPullOnly = initialPullOnly
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
                         * Returns an immutable instance of [Contexthub].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .repo()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Contexthub =
                            Contexthub(
                                checkRequired("repo", repo),
                                initialPullOnly,
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
                    fun validate(): Contexthub = apply {
                        if (validated) {
                            return@apply
                        }

                        repo()
                        initialPullOnly()
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
                        (if (repo.asKnown().isPresent) 1 else 0) +
                            (if (initialPullOnly.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Contexthub &&
                            repo == other.repo &&
                            initialPullOnly == other.initialPullOnly &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(repo, initialPullOnly, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Contexthub{repo=$repo, initialPullOnly=$initialPullOnly, additionalProperties=$additionalProperties}"
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
                        contexthub == other.contexthub &&
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
                        contexthub,
                        gcs,
                        git,
                        readOnly,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxapiS3BucketMountSpec{id=$id, mountPath=$mountPath, s3=$s3, type=$type, cache=$cache, contexthub=$contexthub, gcs=$gcs, git=$git, readOnly=$readOnly, additionalProperties=$additionalProperties}"
            }

            class SandboxapiGcsBucketMountSpec
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val gcs: JsonField<Gcs>,
                private val mountPath: JsonField<String>,
                private val type: JsonField<Type>,
                private val cache: JsonField<Cache>,
                private val contexthub: JsonField<Contexthub>,
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
                    @JsonProperty("contexthub")
                    @ExcludeMissing
                    contexthub: JsonField<Contexthub> = JsonMissing.of(),
                    @JsonProperty("git") @ExcludeMissing git: JsonField<Git> = JsonMissing.of(),
                    @JsonProperty("read_only")
                    @ExcludeMissing
                    readOnly: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("s3") @ExcludeMissing s3: JsonField<S3> = JsonMissing.of(),
                ) : this(
                    id,
                    gcs,
                    mountPath,
                    type,
                    cache,
                    contexthub,
                    git,
                    readOnly,
                    s3,
                    mutableMapOf(),
                )

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
                fun contexthub(): Optional<Contexthub> = contexthub.getOptional("contexthub")

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
                 * Returns the raw JSON value of [contexthub].
                 *
                 * Unlike [contexthub], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("contexthub")
                @ExcludeMissing
                fun _contexthub(): JsonField<Contexthub> = contexthub

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
                    private var contexthub: JsonField<Contexthub> = JsonMissing.of()
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
                            contexthub = sandboxapiGcsBucketMountSpec.contexthub
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

                    fun contexthub(contexthub: Contexthub) = contexthub(JsonField.of(contexthub))

                    /**
                     * Sets [Builder.contexthub] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.contexthub] with a well-typed [Contexthub]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun contexthub(contexthub: JsonField<Contexthub>) = apply {
                        this.contexthub = contexthub
                    }

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
                            contexthub,
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
                    contexthub().ifPresent { it.validate() }
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
                        (contexthub.asKnown().getOrNull()?.validity() ?: 0) +
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

                        @JvmField val CONTEXTHUB = of("contexthub")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        S3,
                        GCS,
                        GIT,
                        CONTEXTHUB,
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
                        CONTEXTHUB,
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
                            CONTEXTHUB -> Value.CONTEXTHUB
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
                            CONTEXTHUB -> Known.CONTEXTHUB
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

                class Contexthub
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val repo: JsonField<String>,
                    private val initialPullOnly: JsonField<Boolean>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("repo")
                        @ExcludeMissing
                        repo: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("initial_pull_only")
                        @ExcludeMissing
                        initialPullOnly: JsonField<Boolean> = JsonMissing.of(),
                    ) : this(repo, initialPullOnly, mutableMapOf())

                    /**
                     * Repo is the Context Hub repository to sync, as "owner/repo" (e.g.
                     * "-/my-agent", where "-" is the current workspace). The repo's latest commit
                     * tree is mirrored into the mount path.
                     *
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun repo(): String = repo.getRequired("repo")

                    /**
                     * InitialPullOnly syncs the repo once at startup instead of polling for updates
                     * for the sandbox's lifetime.
                     *
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun initialPullOnly(): Optional<Boolean> =
                        initialPullOnly.getOptional("initial_pull_only")

                    /**
                     * Returns the raw JSON value of [repo].
                     *
                     * Unlike [repo], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("repo") @ExcludeMissing fun _repo(): JsonField<String> = repo

                    /**
                     * Returns the raw JSON value of [initialPullOnly].
                     *
                     * Unlike [initialPullOnly], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("initial_pull_only")
                    @ExcludeMissing
                    fun _initialPullOnly(): JsonField<Boolean> = initialPullOnly

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
                         * Returns a mutable builder for constructing an instance of [Contexthub].
                         *
                         * The following fields are required:
                         * ```java
                         * .repo()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Contexthub]. */
                    class Builder internal constructor() {

                        private var repo: JsonField<String>? = null
                        private var initialPullOnly: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(contexthub: Contexthub) = apply {
                            repo = contexthub.repo
                            initialPullOnly = contexthub.initialPullOnly
                            additionalProperties = contexthub.additionalProperties.toMutableMap()
                        }

                        /**
                         * Repo is the Context Hub repository to sync, as "owner/repo" (e.g.
                         * "-/my-agent", where "-" is the current workspace). The repo's latest
                         * commit tree is mirrored into the mount path.
                         */
                        fun repo(repo: String) = repo(JsonField.of(repo))

                        /**
                         * Sets [Builder.repo] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.repo] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun repo(repo: JsonField<String>) = apply { this.repo = repo }

                        /**
                         * InitialPullOnly syncs the repo once at startup instead of polling for
                         * updates for the sandbox's lifetime.
                         */
                        fun initialPullOnly(initialPullOnly: Boolean) =
                            initialPullOnly(JsonField.of(initialPullOnly))

                        /**
                         * Sets [Builder.initialPullOnly] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.initialPullOnly] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun initialPullOnly(initialPullOnly: JsonField<Boolean>) = apply {
                            this.initialPullOnly = initialPullOnly
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
                         * Returns an immutable instance of [Contexthub].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .repo()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Contexthub =
                            Contexthub(
                                checkRequired("repo", repo),
                                initialPullOnly,
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
                    fun validate(): Contexthub = apply {
                        if (validated) {
                            return@apply
                        }

                        repo()
                        initialPullOnly()
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
                        (if (repo.asKnown().isPresent) 1 else 0) +
                            (if (initialPullOnly.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Contexthub &&
                            repo == other.repo &&
                            initialPullOnly == other.initialPullOnly &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(repo, initialPullOnly, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Contexthub{repo=$repo, initialPullOnly=$initialPullOnly, additionalProperties=$additionalProperties}"
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
                    private val region: JsonField<String>,
                    private val endpointUrl: JsonField<String>,
                    private val pathStyle: JsonField<Boolean>,
                    private val prefix: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bucket")
                        @ExcludeMissing
                        bucket: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("region")
                        @ExcludeMissing
                        region: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("endpoint_url")
                        @ExcludeMissing
                        endpointUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("path_style")
                        @ExcludeMissing
                        pathStyle: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("prefix")
                        @ExcludeMissing
                        prefix: JsonField<String> = JsonMissing.of(),
                    ) : this(bucket, region, endpointUrl, pathStyle, prefix, mutableMapOf())

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
                    fun region(): String = region.getRequired("region")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun endpointUrl(): Optional<String> = endpointUrl.getOptional("endpoint_url")

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
                     * Returns the raw JSON value of [region].
                     *
                     * Unlike [region], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("region")
                    @ExcludeMissing
                    fun _region(): JsonField<String> = region

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
                         * .region()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [S3]. */
                    class Builder internal constructor() {

                        private var bucket: JsonField<String>? = null
                        private var region: JsonField<String>? = null
                        private var endpointUrl: JsonField<String> = JsonMissing.of()
                        private var pathStyle: JsonField<Boolean> = JsonMissing.of()
                        private var prefix: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(s3: S3) = apply {
                            bucket = s3.bucket
                            region = s3.region
                            endpointUrl = s3.endpointUrl
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

                        fun region(region: String) = region(JsonField.of(region))

                        /**
                         * Sets [Builder.region] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.region] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun region(region: JsonField<String>) = apply { this.region = region }

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
                         * .region()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): S3 =
                            S3(
                                checkRequired("bucket", bucket),
                                checkRequired("region", region),
                                endpointUrl,
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
                        region()
                        endpointUrl()
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
                            (if (region.asKnown().isPresent) 1 else 0) +
                            (if (endpointUrl.asKnown().isPresent) 1 else 0) +
                            (if (pathStyle.asKnown().isPresent) 1 else 0) +
                            (if (prefix.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is S3 &&
                            bucket == other.bucket &&
                            region == other.region &&
                            endpointUrl == other.endpointUrl &&
                            pathStyle == other.pathStyle &&
                            prefix == other.prefix &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            bucket,
                            region,
                            endpointUrl,
                            pathStyle,
                            prefix,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "S3{bucket=$bucket, region=$region, endpointUrl=$endpointUrl, pathStyle=$pathStyle, prefix=$prefix, additionalProperties=$additionalProperties}"
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
                        contexthub == other.contexthub &&
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
                        contexthub,
                        git,
                        readOnly,
                        s3,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxapiGcsBucketMountSpec{id=$id, gcs=$gcs, mountPath=$mountPath, type=$type, cache=$cache, contexthub=$contexthub, git=$git, readOnly=$readOnly, s3=$s3, additionalProperties=$additionalProperties}"
            }

            class SandboxapiGitRepoMountSpec
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val git: JsonField<Git>,
                private val mountPath: JsonField<String>,
                private val type: JsonField<Type>,
                private val cache: JsonField<Cache>,
                private val contexthub: JsonField<Contexthub>,
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
                    @JsonProperty("contexthub")
                    @ExcludeMissing
                    contexthub: JsonField<Contexthub> = JsonMissing.of(),
                    @JsonProperty("gcs") @ExcludeMissing gcs: JsonField<Gcs> = JsonMissing.of(),
                    @JsonProperty("read_only")
                    @ExcludeMissing
                    readOnly: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("s3") @ExcludeMissing s3: JsonField<S3> = JsonMissing.of(),
                ) : this(
                    id,
                    git,
                    mountPath,
                    type,
                    cache,
                    contexthub,
                    gcs,
                    readOnly,
                    s3,
                    mutableMapOf(),
                )

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
                fun contexthub(): Optional<Contexthub> = contexthub.getOptional("contexthub")

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
                 * Returns the raw JSON value of [contexthub].
                 *
                 * Unlike [contexthub], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("contexthub")
                @ExcludeMissing
                fun _contexthub(): JsonField<Contexthub> = contexthub

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
                    private var contexthub: JsonField<Contexthub> = JsonMissing.of()
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
                            contexthub = sandboxapiGitRepoMountSpec.contexthub
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

                    fun contexthub(contexthub: Contexthub) = contexthub(JsonField.of(contexthub))

                    /**
                     * Sets [Builder.contexthub] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.contexthub] with a well-typed [Contexthub]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun contexthub(contexthub: JsonField<Contexthub>) = apply {
                        this.contexthub = contexthub
                    }

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
                            contexthub,
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
                    contexthub().ifPresent { it.validate() }
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
                        (contexthub.asKnown().getOrNull()?.validity() ?: 0) +
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

                        @JvmField val CONTEXTHUB = of("contexthub")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        S3,
                        GCS,
                        GIT,
                        CONTEXTHUB,
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
                        CONTEXTHUB,
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
                            CONTEXTHUB -> Value.CONTEXTHUB
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
                            CONTEXTHUB -> Known.CONTEXTHUB
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

                class Contexthub
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val repo: JsonField<String>,
                    private val initialPullOnly: JsonField<Boolean>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("repo")
                        @ExcludeMissing
                        repo: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("initial_pull_only")
                        @ExcludeMissing
                        initialPullOnly: JsonField<Boolean> = JsonMissing.of(),
                    ) : this(repo, initialPullOnly, mutableMapOf())

                    /**
                     * Repo is the Context Hub repository to sync, as "owner/repo" (e.g.
                     * "-/my-agent", where "-" is the current workspace). The repo's latest commit
                     * tree is mirrored into the mount path.
                     *
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun repo(): String = repo.getRequired("repo")

                    /**
                     * InitialPullOnly syncs the repo once at startup instead of polling for updates
                     * for the sandbox's lifetime.
                     *
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun initialPullOnly(): Optional<Boolean> =
                        initialPullOnly.getOptional("initial_pull_only")

                    /**
                     * Returns the raw JSON value of [repo].
                     *
                     * Unlike [repo], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("repo") @ExcludeMissing fun _repo(): JsonField<String> = repo

                    /**
                     * Returns the raw JSON value of [initialPullOnly].
                     *
                     * Unlike [initialPullOnly], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("initial_pull_only")
                    @ExcludeMissing
                    fun _initialPullOnly(): JsonField<Boolean> = initialPullOnly

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
                         * Returns a mutable builder for constructing an instance of [Contexthub].
                         *
                         * The following fields are required:
                         * ```java
                         * .repo()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Contexthub]. */
                    class Builder internal constructor() {

                        private var repo: JsonField<String>? = null
                        private var initialPullOnly: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(contexthub: Contexthub) = apply {
                            repo = contexthub.repo
                            initialPullOnly = contexthub.initialPullOnly
                            additionalProperties = contexthub.additionalProperties.toMutableMap()
                        }

                        /**
                         * Repo is the Context Hub repository to sync, as "owner/repo" (e.g.
                         * "-/my-agent", where "-" is the current workspace). The repo's latest
                         * commit tree is mirrored into the mount path.
                         */
                        fun repo(repo: String) = repo(JsonField.of(repo))

                        /**
                         * Sets [Builder.repo] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.repo] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun repo(repo: JsonField<String>) = apply { this.repo = repo }

                        /**
                         * InitialPullOnly syncs the repo once at startup instead of polling for
                         * updates for the sandbox's lifetime.
                         */
                        fun initialPullOnly(initialPullOnly: Boolean) =
                            initialPullOnly(JsonField.of(initialPullOnly))

                        /**
                         * Sets [Builder.initialPullOnly] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.initialPullOnly] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun initialPullOnly(initialPullOnly: JsonField<Boolean>) = apply {
                            this.initialPullOnly = initialPullOnly
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
                         * Returns an immutable instance of [Contexthub].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .repo()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Contexthub =
                            Contexthub(
                                checkRequired("repo", repo),
                                initialPullOnly,
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
                    fun validate(): Contexthub = apply {
                        if (validated) {
                            return@apply
                        }

                        repo()
                        initialPullOnly()
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
                        (if (repo.asKnown().isPresent) 1 else 0) +
                            (if (initialPullOnly.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Contexthub &&
                            repo == other.repo &&
                            initialPullOnly == other.initialPullOnly &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(repo, initialPullOnly, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Contexthub{repo=$repo, initialPullOnly=$initialPullOnly, additionalProperties=$additionalProperties}"
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
                    private val region: JsonField<String>,
                    private val endpointUrl: JsonField<String>,
                    private val pathStyle: JsonField<Boolean>,
                    private val prefix: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bucket")
                        @ExcludeMissing
                        bucket: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("region")
                        @ExcludeMissing
                        region: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("endpoint_url")
                        @ExcludeMissing
                        endpointUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("path_style")
                        @ExcludeMissing
                        pathStyle: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("prefix")
                        @ExcludeMissing
                        prefix: JsonField<String> = JsonMissing.of(),
                    ) : this(bucket, region, endpointUrl, pathStyle, prefix, mutableMapOf())

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
                    fun region(): String = region.getRequired("region")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun endpointUrl(): Optional<String> = endpointUrl.getOptional("endpoint_url")

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
                     * Returns the raw JSON value of [region].
                     *
                     * Unlike [region], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("region")
                    @ExcludeMissing
                    fun _region(): JsonField<String> = region

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
                         * .region()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [S3]. */
                    class Builder internal constructor() {

                        private var bucket: JsonField<String>? = null
                        private var region: JsonField<String>? = null
                        private var endpointUrl: JsonField<String> = JsonMissing.of()
                        private var pathStyle: JsonField<Boolean> = JsonMissing.of()
                        private var prefix: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(s3: S3) = apply {
                            bucket = s3.bucket
                            region = s3.region
                            endpointUrl = s3.endpointUrl
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

                        fun region(region: String) = region(JsonField.of(region))

                        /**
                         * Sets [Builder.region] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.region] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun region(region: JsonField<String>) = apply { this.region = region }

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
                         * .region()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): S3 =
                            S3(
                                checkRequired("bucket", bucket),
                                checkRequired("region", region),
                                endpointUrl,
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
                        region()
                        endpointUrl()
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
                            (if (region.asKnown().isPresent) 1 else 0) +
                            (if (endpointUrl.asKnown().isPresent) 1 else 0) +
                            (if (pathStyle.asKnown().isPresent) 1 else 0) +
                            (if (prefix.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is S3 &&
                            bucket == other.bucket &&
                            region == other.region &&
                            endpointUrl == other.endpointUrl &&
                            pathStyle == other.pathStyle &&
                            prefix == other.prefix &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            bucket,
                            region,
                            endpointUrl,
                            pathStyle,
                            prefix,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "S3{bucket=$bucket, region=$region, endpointUrl=$endpointUrl, pathStyle=$pathStyle, prefix=$prefix, additionalProperties=$additionalProperties}"
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
                        contexthub == other.contexthub &&
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
                        contexthub,
                        gcs,
                        readOnly,
                        s3,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxapiGitRepoMountSpec{id=$id, git=$git, mountPath=$mountPath, type=$type, cache=$cache, contexthub=$contexthub, gcs=$gcs, readOnly=$readOnly, s3=$s3, additionalProperties=$additionalProperties}"
            }

            class SandboxapiContextHubRepoMountSpec
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val contexthub: JsonField<Contexthub>,
                private val mountPath: JsonField<String>,
                private val type: JsonField<Type>,
                private val cache: JsonField<Cache>,
                private val gcs: JsonField<Gcs>,
                private val git: JsonField<Git>,
                private val readOnly: JsonField<Boolean>,
                private val s3: JsonField<S3>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("contexthub")
                    @ExcludeMissing
                    contexthub: JsonField<Contexthub> = JsonMissing.of(),
                    @JsonProperty("mount_path")
                    @ExcludeMissing
                    mountPath: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("cache")
                    @ExcludeMissing
                    cache: JsonField<Cache> = JsonMissing.of(),
                    @JsonProperty("gcs") @ExcludeMissing gcs: JsonField<Gcs> = JsonMissing.of(),
                    @JsonProperty("git") @ExcludeMissing git: JsonField<Git> = JsonMissing.of(),
                    @JsonProperty("read_only")
                    @ExcludeMissing
                    readOnly: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("s3") @ExcludeMissing s3: JsonField<S3> = JsonMissing.of(),
                ) : this(
                    id,
                    contexthub,
                    mountPath,
                    type,
                    cache,
                    gcs,
                    git,
                    readOnly,
                    s3,
                    mutableMapOf(),
                )

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
                fun contexthub(): Contexthub = contexthub.getRequired("contexthub")

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
                 * Returns the raw JSON value of [contexthub].
                 *
                 * Unlike [contexthub], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("contexthub")
                @ExcludeMissing
                fun _contexthub(): JsonField<Contexthub> = contexthub

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
                     * [SandboxapiContextHubRepoMountSpec].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .contexthub()
                     * .mountPath()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxapiContextHubRepoMountSpec]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var contexthub: JsonField<Contexthub>? = null
                    private var mountPath: JsonField<String>? = null
                    private var type: JsonField<Type>? = null
                    private var cache: JsonField<Cache> = JsonMissing.of()
                    private var gcs: JsonField<Gcs> = JsonMissing.of()
                    private var git: JsonField<Git> = JsonMissing.of()
                    private var readOnly: JsonField<Boolean> = JsonMissing.of()
                    private var s3: JsonField<S3> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        sandboxapiContextHubRepoMountSpec: SandboxapiContextHubRepoMountSpec
                    ) = apply {
                        id = sandboxapiContextHubRepoMountSpec.id
                        contexthub = sandboxapiContextHubRepoMountSpec.contexthub
                        mountPath = sandboxapiContextHubRepoMountSpec.mountPath
                        type = sandboxapiContextHubRepoMountSpec.type
                        cache = sandboxapiContextHubRepoMountSpec.cache
                        gcs = sandboxapiContextHubRepoMountSpec.gcs
                        git = sandboxapiContextHubRepoMountSpec.git
                        readOnly = sandboxapiContextHubRepoMountSpec.readOnly
                        s3 = sandboxapiContextHubRepoMountSpec.s3
                        additionalProperties =
                            sandboxapiContextHubRepoMountSpec.additionalProperties.toMutableMap()
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

                    fun contexthub(contexthub: Contexthub) = contexthub(JsonField.of(contexthub))

                    /**
                     * Sets [Builder.contexthub] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.contexthub] with a well-typed [Contexthub]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun contexthub(contexthub: JsonField<Contexthub>) = apply {
                        this.contexthub = contexthub
                    }

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
                     * Returns an immutable instance of [SandboxapiContextHubRepoMountSpec].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .contexthub()
                     * .mountPath()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxapiContextHubRepoMountSpec =
                        SandboxapiContextHubRepoMountSpec(
                            checkRequired("id", id),
                            checkRequired("contexthub", contexthub),
                            checkRequired("mountPath", mountPath),
                            checkRequired("type", type),
                            cache,
                            gcs,
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
                fun validate(): SandboxapiContextHubRepoMountSpec = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    contexthub().validate()
                    mountPath()
                    type().validate()
                    cache().ifPresent { it.validate() }
                    gcs().ifPresent { it.validate() }
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
                        (contexthub.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (mountPath.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (cache.asKnown().getOrNull()?.validity() ?: 0) +
                        (gcs.asKnown().getOrNull()?.validity() ?: 0) +
                        (git.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (readOnly.asKnown().isPresent) 1 else 0) +
                        (s3.asKnown().getOrNull()?.validity() ?: 0)

                class Contexthub
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val repo: JsonField<String>,
                    private val initialPullOnly: JsonField<Boolean>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("repo")
                        @ExcludeMissing
                        repo: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("initial_pull_only")
                        @ExcludeMissing
                        initialPullOnly: JsonField<Boolean> = JsonMissing.of(),
                    ) : this(repo, initialPullOnly, mutableMapOf())

                    /**
                     * Repo is the Context Hub repository to sync, as "owner/repo" (e.g.
                     * "-/my-agent", where "-" is the current workspace). The repo's latest commit
                     * tree is mirrored into the mount path.
                     *
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun repo(): String = repo.getRequired("repo")

                    /**
                     * InitialPullOnly syncs the repo once at startup instead of polling for updates
                     * for the sandbox's lifetime.
                     *
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun initialPullOnly(): Optional<Boolean> =
                        initialPullOnly.getOptional("initial_pull_only")

                    /**
                     * Returns the raw JSON value of [repo].
                     *
                     * Unlike [repo], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("repo") @ExcludeMissing fun _repo(): JsonField<String> = repo

                    /**
                     * Returns the raw JSON value of [initialPullOnly].
                     *
                     * Unlike [initialPullOnly], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("initial_pull_only")
                    @ExcludeMissing
                    fun _initialPullOnly(): JsonField<Boolean> = initialPullOnly

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
                         * Returns a mutable builder for constructing an instance of [Contexthub].
                         *
                         * The following fields are required:
                         * ```java
                         * .repo()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Contexthub]. */
                    class Builder internal constructor() {

                        private var repo: JsonField<String>? = null
                        private var initialPullOnly: JsonField<Boolean> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(contexthub: Contexthub) = apply {
                            repo = contexthub.repo
                            initialPullOnly = contexthub.initialPullOnly
                            additionalProperties = contexthub.additionalProperties.toMutableMap()
                        }

                        /**
                         * Repo is the Context Hub repository to sync, as "owner/repo" (e.g.
                         * "-/my-agent", where "-" is the current workspace). The repo's latest
                         * commit tree is mirrored into the mount path.
                         */
                        fun repo(repo: String) = repo(JsonField.of(repo))

                        /**
                         * Sets [Builder.repo] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.repo] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun repo(repo: JsonField<String>) = apply { this.repo = repo }

                        /**
                         * InitialPullOnly syncs the repo once at startup instead of polling for
                         * updates for the sandbox's lifetime.
                         */
                        fun initialPullOnly(initialPullOnly: Boolean) =
                            initialPullOnly(JsonField.of(initialPullOnly))

                        /**
                         * Sets [Builder.initialPullOnly] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.initialPullOnly] with a well-typed
                         * [Boolean] value instead. This method is primarily for setting the field
                         * to an undocumented or not yet supported value.
                         */
                        fun initialPullOnly(initialPullOnly: JsonField<Boolean>) = apply {
                            this.initialPullOnly = initialPullOnly
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
                         * Returns an immutable instance of [Contexthub].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .repo()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Contexthub =
                            Contexthub(
                                checkRequired("repo", repo),
                                initialPullOnly,
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
                    fun validate(): Contexthub = apply {
                        if (validated) {
                            return@apply
                        }

                        repo()
                        initialPullOnly()
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
                        (if (repo.asKnown().isPresent) 1 else 0) +
                            (if (initialPullOnly.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Contexthub &&
                            repo == other.repo &&
                            initialPullOnly == other.initialPullOnly &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(repo, initialPullOnly, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Contexthub{repo=$repo, initialPullOnly=$initialPullOnly, additionalProperties=$additionalProperties}"
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

                        @JvmField val CONTEXTHUB = of("contexthub")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        S3,
                        GCS,
                        GIT,
                        CONTEXTHUB,
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
                        CONTEXTHUB,
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
                            CONTEXTHUB -> Value.CONTEXTHUB
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
                            CONTEXTHUB -> Known.CONTEXTHUB
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

                class S3
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val bucket: JsonField<String>,
                    private val region: JsonField<String>,
                    private val endpointUrl: JsonField<String>,
                    private val pathStyle: JsonField<Boolean>,
                    private val prefix: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("bucket")
                        @ExcludeMissing
                        bucket: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("region")
                        @ExcludeMissing
                        region: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("endpoint_url")
                        @ExcludeMissing
                        endpointUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("path_style")
                        @ExcludeMissing
                        pathStyle: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("prefix")
                        @ExcludeMissing
                        prefix: JsonField<String> = JsonMissing.of(),
                    ) : this(bucket, region, endpointUrl, pathStyle, prefix, mutableMapOf())

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
                    fun region(): String = region.getRequired("region")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun endpointUrl(): Optional<String> = endpointUrl.getOptional("endpoint_url")

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
                     * Returns the raw JSON value of [region].
                     *
                     * Unlike [region], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("region")
                    @ExcludeMissing
                    fun _region(): JsonField<String> = region

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
                         * .region()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [S3]. */
                    class Builder internal constructor() {

                        private var bucket: JsonField<String>? = null
                        private var region: JsonField<String>? = null
                        private var endpointUrl: JsonField<String> = JsonMissing.of()
                        private var pathStyle: JsonField<Boolean> = JsonMissing.of()
                        private var prefix: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(s3: S3) = apply {
                            bucket = s3.bucket
                            region = s3.region
                            endpointUrl = s3.endpointUrl
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

                        fun region(region: String) = region(JsonField.of(region))

                        /**
                         * Sets [Builder.region] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.region] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun region(region: JsonField<String>) = apply { this.region = region }

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
                         * .region()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): S3 =
                            S3(
                                checkRequired("bucket", bucket),
                                checkRequired("region", region),
                                endpointUrl,
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
                        region()
                        endpointUrl()
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
                            (if (region.asKnown().isPresent) 1 else 0) +
                            (if (endpointUrl.asKnown().isPresent) 1 else 0) +
                            (if (pathStyle.asKnown().isPresent) 1 else 0) +
                            (if (prefix.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is S3 &&
                            bucket == other.bucket &&
                            region == other.region &&
                            endpointUrl == other.endpointUrl &&
                            pathStyle == other.pathStyle &&
                            prefix == other.prefix &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            bucket,
                            region,
                            endpointUrl,
                            pathStyle,
                            prefix,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "S3{bucket=$bucket, region=$region, endpointUrl=$endpointUrl, pathStyle=$pathStyle, prefix=$prefix, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxapiContextHubRepoMountSpec &&
                        id == other.id &&
                        contexthub == other.contexthub &&
                        mountPath == other.mountPath &&
                        type == other.type &&
                        cache == other.cache &&
                        gcs == other.gcs &&
                        git == other.git &&
                        readOnly == other.readOnly &&
                        s3 == other.s3 &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        contexthub,
                        mountPath,
                        type,
                        cache,
                        gcs,
                        git,
                        readOnly,
                        s3,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxapiContextHubRepoMountSpec{id=$id, contexthub=$contexthub, mountPath=$mountPath, type=$type, cache=$cache, gcs=$gcs, git=$git, readOnly=$readOnly, s3=$s3, additionalProperties=$additionalProperties}"
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
            private val envVars: JsonField<EnvVars>,
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
                @JsonProperty("env_vars")
                @ExcludeMissing
                envVars: JsonField<EnvVars> = JsonMissing.of(),
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
            ) : this(
                name,
                aws,
                enabled,
                envVars,
                gcp,
                headers,
                matchHosts,
                matchPaths,
                type,
                mutableMapOf(),
            )

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
             * EnvVars are plaintext env vars set for every command in the sandbox while this rule
             * is enabled. Use them for tools that refuse to run unless a credential env var is
             * present (e.g. gh needs GH_TOKEN) even though this rule injects the real credential on
             * the wire — set a dummy value here so the command starts. Explicit per-sandbox
             * env_vars win over these, and provider-managed (AWS/GCP) vars win over both.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun envVars(): Optional<EnvVars> = envVars.getOptional("env_vars")

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
             * Returns the raw JSON value of [envVars].
             *
             * Unlike [envVars], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("env_vars") @ExcludeMissing fun _envVars(): JsonField<EnvVars> = envVars

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
                private var envVars: JsonField<EnvVars> = JsonMissing.of()
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
                    envVars = rule.envVars
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

                /**
                 * EnvVars are plaintext env vars set for every command in the sandbox while this
                 * rule is enabled. Use them for tools that refuse to run unless a credential env
                 * var is present (e.g. gh needs GH_TOKEN) even though this rule injects the real
                 * credential on the wire — set a dummy value here so the command starts. Explicit
                 * per-sandbox env_vars win over these, and provider-managed (AWS/GCP) vars win over
                 * both.
                 */
                fun envVars(envVars: EnvVars) = envVars(JsonField.of(envVars))

                /**
                 * Sets [Builder.envVars] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.envVars] with a well-typed [EnvVars] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun envVars(envVars: JsonField<EnvVars>) = apply { this.envVars = envVars }

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
                        envVars,
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
                envVars().ifPresent { it.validate() }
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
                    (envVars.asKnown().getOrNull()?.validity() ?: 0) +
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

            /**
             * EnvVars are plaintext env vars set for every command in the sandbox while this rule
             * is enabled. Use them for tools that refuse to run unless a credential env var is
             * present (e.g. gh needs GH_TOKEN) even though this rule injects the real credential on
             * the wire — set a dummy value here so the command starts. Explicit per-sandbox
             * env_vars win over these, and provider-managed (AWS/GCP) vars win over both.
             */
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
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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
                    envVars == other.envVars &&
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
                    envVars,
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
                "Rule{name=$name, aws=$aws, enabled=$enabled, envVars=$envVars, gcp=$gcp, headers=$headers, matchHosts=$matchHosts, matchPaths=$matchPaths, type=$type, additionalProperties=$additionalProperties}"
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

        return other is BoxCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BoxCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
