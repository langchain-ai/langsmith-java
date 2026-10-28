// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.sandboxes.ProxyConfig
import com.langchain.smith.models.sandboxes.SandboxMountConfig
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a new sandbox from a snapshot. Provide at most one of `snapshot_id` or `snapshot_name`; if
 * neither is provided, the server uses the default snapshot. `snapshot_name` accepts a Docker-style
 * `name` or `name:tag` reference (a bare name resolves to `name:latest`).
 */
class BoxCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * AccessDelegation lets code inside the sandbox call the LangSmith API as you, with at most the
     * permissions granted here. Omit for no access.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accessDelegation(): Optional<AccessDelegation> = body.accessDelegation()

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
     * Disk for the sandbox, in bytes; defaults to the snapshot's and cannot be smaller. A sandbox
     * with persistent=false gets at most 16 GiB of disk per vCPU, so at most 256 GiB: omit CPU and
     * it is derived from the disk, set it and a larger disk is rejected.
     *
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
     * Labels are free-form key/value metadata persisted with the sandbox and returned on reads.
     * Labels from the source snapshot are inherited unless overridden here.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun labels(): Optional<Labels> = body.labels()

    /**
     * Memory for the sandbox, in bytes. Memory is tied to CPU at 4 GiB per vCPU: omit it and it
     * follows that ratio; set it and it must stay within 50% of the ratio for the requested CPU, so
     * a 1 vCPU sandbox accepts 2-6 GiB. Setting memory without CPU derives the CPU from the same
     * ratio. Maximum 64 GiB.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memBytes(): Optional<Long> = body.memBytes()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mountConfig(): Optional<SandboxMountConfig> = body.mountConfig()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Persistent (private beta) keeps the sandbox's filesystem across stops (the default, true).
     * Set it to false for a disposable sandbox: its writes are discarded whenever it stops, the
     * next start boots it fresh from its snapshot, and it is never charged for storage. A sandbox
     * that is not persistent cannot preserve memory on stop or have its filesystem captured as a
     * snapshot (exporting a Docker image from it with docker_image still works), and some snapshots
     * captured from other sandboxes cannot start one; such a create is rejected. Setting it to
     * false requires the private beta to be enabled for your workspace.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun persistent(): Optional<Boolean> = body.persistent()

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
     * RunConfig overrides the snapshot's run config for this sandbox: user and work_dir replace the
     * snapshot's, env_vars merge over it. The result is what the sandbox boots with, and what a
     * snapshot captured from it carries.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runConfig(): Optional<RunConfig> = body.runConfig()

    /**
     * Snapshot is a Docker-style name or name:tag reference to boot from. A bare name resolves to
     * name:latest.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun snapshot(): Optional<String> = body.snapshot()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun snapshotId(): Optional<String> = body.snapshotId()

    /**
     * SnapshotName is a synonym for Snapshot, accepted for compatibility with clients that predate
     * it. Set one or the other.
     *
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
     * Volumes (beta) attaches existing volumes at mount paths inside the sandbox. At most 4;
     * requires sandbox volumes to be enabled for your workspace. Attaching a volume requires being
     * its creator or holding sandboxes:exec.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun volumes(): Optional<List<Volume>> = body.volumes()

    /**
     * Returns the raw JSON value of [accessDelegation].
     *
     * Unlike [accessDelegation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _accessDelegation(): JsonField<AccessDelegation> = body._accessDelegation()

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
     * Returns the raw JSON value of [labels].
     *
     * Unlike [labels], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _labels(): JsonField<Labels> = body._labels()

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
    fun _mountConfig(): JsonField<SandboxMountConfig> = body._mountConfig()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [persistent].
     *
     * Unlike [persistent], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _persistent(): JsonField<Boolean> = body._persistent()

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
     * Returns the raw JSON value of [runConfig].
     *
     * Unlike [runConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _runConfig(): JsonField<RunConfig> = body._runConfig()

    /**
     * Returns the raw JSON value of [snapshot].
     *
     * Unlike [snapshot], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _snapshot(): JsonField<String> = body._snapshot()

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

    /**
     * Returns the raw JSON value of [volumes].
     *
     * Unlike [volumes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _volumes(): JsonField<List<Volume>> = body._volumes()

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
         * - [accessDelegation]
         * - [cpuMillicores]
         * - [deleteAfterStopSeconds]
         * - [envVars]
         * - [fsCapacityBytes]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * AccessDelegation lets code inside the sandbox call the LangSmith API as you, with at most
         * the permissions granted here. Omit for no access.
         */
        fun accessDelegation(accessDelegation: AccessDelegation) = apply {
            body.accessDelegation(accessDelegation)
        }

        /**
         * Sets [Builder.accessDelegation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessDelegation] with a well-typed [AccessDelegation]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accessDelegation(accessDelegation: JsonField<AccessDelegation>) = apply {
            body.accessDelegation(accessDelegation)
        }

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

        /**
         * Disk for the sandbox, in bytes; defaults to the snapshot's and cannot be smaller. A
         * sandbox with persistent=false gets at most 16 GiB of disk per vCPU, so at most 256 GiB:
         * omit CPU and it is derived from the disk, set it and a larger disk is rejected.
         */
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

        /**
         * Labels are free-form key/value metadata persisted with the sandbox and returned on reads.
         * Labels from the source snapshot are inherited unless overridden here.
         */
        fun labels(labels: Labels) = apply { body.labels(labels) }

        /**
         * Sets [Builder.labels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labels] with a well-typed [Labels] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun labels(labels: JsonField<Labels>) = apply { body.labels(labels) }

        /**
         * Memory for the sandbox, in bytes. Memory is tied to CPU at 4 GiB per vCPU: omit it and it
         * follows that ratio; set it and it must stay within 50% of the ratio for the requested
         * CPU, so a 1 vCPU sandbox accepts 2-6 GiB. Setting memory without CPU derives the CPU from
         * the same ratio. Maximum 64 GiB.
         */
        fun memBytes(memBytes: Long) = apply { body.memBytes(memBytes) }

        /**
         * Sets [Builder.memBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memBytes(memBytes: JsonField<Long>) = apply { body.memBytes(memBytes) }

        fun mountConfig(mountConfig: SandboxMountConfig) = apply { body.mountConfig(mountConfig) }

        /**
         * Sets [Builder.mountConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mountConfig] with a well-typed [SandboxMountConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun mountConfig(mountConfig: JsonField<SandboxMountConfig>) = apply {
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
         * Persistent (private beta) keeps the sandbox's filesystem across stops (the default,
         * true). Set it to false for a disposable sandbox: its writes are discarded whenever it
         * stops, the next start boots it fresh from its snapshot, and it is never charged for
         * storage. A sandbox that is not persistent cannot preserve memory on stop or have its
         * filesystem captured as a snapshot (exporting a Docker image from it with docker_image
         * still works), and some snapshots captured from other sandboxes cannot start one; such a
         * create is rejected. Setting it to false requires the private beta to be enabled for your
         * workspace.
         */
        fun persistent(persistent: Boolean) = apply { body.persistent(persistent) }

        /**
         * Sets [Builder.persistent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.persistent] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun persistent(persistent: JsonField<Boolean>) = apply { body.persistent(persistent) }

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

        /**
         * RunConfig overrides the snapshot's run config for this sandbox: user and work_dir replace
         * the snapshot's, env_vars merge over it. The result is what the sandbox boots with, and
         * what a snapshot captured from it carries.
         */
        fun runConfig(runConfig: RunConfig) = apply { body.runConfig(runConfig) }

        /**
         * Sets [Builder.runConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runConfig] with a well-typed [RunConfig] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runConfig(runConfig: JsonField<RunConfig>) = apply { body.runConfig(runConfig) }

        /**
         * Snapshot is a Docker-style name or name:tag reference to boot from. A bare name resolves
         * to name:latest.
         */
        fun snapshot(snapshot: String) = apply { body.snapshot(snapshot) }

        /**
         * Sets [Builder.snapshot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snapshot] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun snapshot(snapshot: JsonField<String>) = apply { body.snapshot(snapshot) }

        fun snapshotId(snapshotId: String) = apply { body.snapshotId(snapshotId) }

        /**
         * Sets [Builder.snapshotId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snapshotId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun snapshotId(snapshotId: JsonField<String>) = apply { body.snapshotId(snapshotId) }

        /**
         * SnapshotName is a synonym for Snapshot, accepted for compatibility with clients that
         * predate it. Set one or the other.
         */
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

        /**
         * Volumes (beta) attaches existing volumes at mount paths inside the sandbox. At most 4;
         * requires sandbox volumes to be enabled for your workspace. Attaching a volume requires
         * being its creator or holding sandboxes:exec.
         */
        fun volumes(volumes: List<Volume>) = apply { body.volumes(volumes) }

        /**
         * Sets [Builder.volumes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.volumes] with a well-typed `List<Volume>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun volumes(volumes: JsonField<List<Volume>>) = apply { body.volumes(volumes) }

        /**
         * Adds a single [Volume] to [volumes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVolume(volume: Volume) = apply { body.addVolume(volume) }

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
        private val accessDelegation: JsonField<AccessDelegation>,
        private val cpuMillicores: JsonField<Long>,
        private val deleteAfterStopSeconds: JsonField<Long>,
        private val envVars: JsonField<EnvVars>,
        private val fsCapacityBytes: JsonField<Long>,
        private val idleTtlSeconds: JsonField<Long>,
        private val labels: JsonField<Labels>,
        private val memBytes: JsonField<Long>,
        private val mountConfig: JsonField<SandboxMountConfig>,
        private val name: JsonField<String>,
        private val persistent: JsonField<Boolean>,
        private val preserveMemoryOnStop: JsonField<Boolean>,
        private val proxyConfig: JsonField<ProxyConfig>,
        private val restoreMemory: JsonField<Boolean>,
        private val runConfig: JsonField<RunConfig>,
        private val snapshot: JsonField<String>,
        private val snapshotId: JsonField<String>,
        private val snapshotName: JsonField<String>,
        private val tagValueIds: JsonField<List<String>>,
        private val vcpus: JsonField<Long>,
        private val volumes: JsonField<List<Volume>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("access_delegation")
            @ExcludeMissing
            accessDelegation: JsonField<AccessDelegation> = JsonMissing.of(),
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
            @JsonProperty("labels") @ExcludeMissing labels: JsonField<Labels> = JsonMissing.of(),
            @JsonProperty("mem_bytes") @ExcludeMissing memBytes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("mount_config")
            @ExcludeMissing
            mountConfig: JsonField<SandboxMountConfig> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("persistent")
            @ExcludeMissing
            persistent: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("preserve_memory_on_stop")
            @ExcludeMissing
            preserveMemoryOnStop: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("proxy_config")
            @ExcludeMissing
            proxyConfig: JsonField<ProxyConfig> = JsonMissing.of(),
            @JsonProperty("restore_memory")
            @ExcludeMissing
            restoreMemory: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("run_config")
            @ExcludeMissing
            runConfig: JsonField<RunConfig> = JsonMissing.of(),
            @JsonProperty("snapshot")
            @ExcludeMissing
            snapshot: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("volumes")
            @ExcludeMissing
            volumes: JsonField<List<Volume>> = JsonMissing.of(),
        ) : this(
            accessDelegation,
            cpuMillicores,
            deleteAfterStopSeconds,
            envVars,
            fsCapacityBytes,
            idleTtlSeconds,
            labels,
            memBytes,
            mountConfig,
            name,
            persistent,
            preserveMemoryOnStop,
            proxyConfig,
            restoreMemory,
            runConfig,
            snapshot,
            snapshotId,
            snapshotName,
            tagValueIds,
            vcpus,
            volumes,
            mutableMapOf(),
        )

        /**
         * AccessDelegation lets code inside the sandbox call the LangSmith API as you, with at most
         * the permissions granted here. Omit for no access.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accessDelegation(): Optional<AccessDelegation> =
            accessDelegation.getOptional("access_delegation")

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
         * Disk for the sandbox, in bytes; defaults to the snapshot's and cannot be smaller. A
         * sandbox with persistent=false gets at most 16 GiB of disk per vCPU, so at most 256 GiB:
         * omit CPU and it is derived from the disk, set it and a larger disk is rejected.
         *
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
         * Labels are free-form key/value metadata persisted with the sandbox and returned on reads.
         * Labels from the source snapshot are inherited unless overridden here.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun labels(): Optional<Labels> = labels.getOptional("labels")

        /**
         * Memory for the sandbox, in bytes. Memory is tied to CPU at 4 GiB per vCPU: omit it and it
         * follows that ratio; set it and it must stay within 50% of the ratio for the requested
         * CPU, so a 1 vCPU sandbox accepts 2-6 GiB. Setting memory without CPU derives the CPU from
         * the same ratio. Maximum 64 GiB.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun memBytes(): Optional<Long> = memBytes.getOptional("mem_bytes")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mountConfig(): Optional<SandboxMountConfig> = mountConfig.getOptional("mount_config")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Persistent (private beta) keeps the sandbox's filesystem across stops (the default,
         * true). Set it to false for a disposable sandbox: its writes are discarded whenever it
         * stops, the next start boots it fresh from its snapshot, and it is never charged for
         * storage. A sandbox that is not persistent cannot preserve memory on stop or have its
         * filesystem captured as a snapshot (exporting a Docker image from it with docker_image
         * still works), and some snapshots captured from other sandboxes cannot start one; such a
         * create is rejected. Setting it to false requires the private beta to be enabled for your
         * workspace.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun persistent(): Optional<Boolean> = persistent.getOptional("persistent")

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
         * RunConfig overrides the snapshot's run config for this sandbox: user and work_dir replace
         * the snapshot's, env_vars merge over it. The result is what the sandbox boots with, and
         * what a snapshot captured from it carries.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun runConfig(): Optional<RunConfig> = runConfig.getOptional("run_config")

        /**
         * Snapshot is a Docker-style name or name:tag reference to boot from. A bare name resolves
         * to name:latest.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun snapshot(): Optional<String> = snapshot.getOptional("snapshot")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun snapshotId(): Optional<String> = snapshotId.getOptional("snapshot_id")

        /**
         * SnapshotName is a synonym for Snapshot, accepted for compatibility with clients that
         * predate it. Set one or the other.
         *
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
         * Volumes (beta) attaches existing volumes at mount paths inside the sandbox. At most 4;
         * requires sandbox volumes to be enabled for your workspace. Attaching a volume requires
         * being its creator or holding sandboxes:exec.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun volumes(): Optional<List<Volume>> = volumes.getOptional("volumes")

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
         * Returns the raw JSON value of [persistent].
         *
         * Unlike [persistent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("persistent")
        @ExcludeMissing
        fun _persistent(): JsonField<Boolean> = persistent

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
         * Returns the raw JSON value of [runConfig].
         *
         * Unlike [runConfig], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_config")
        @ExcludeMissing
        fun _runConfig(): JsonField<RunConfig> = runConfig

        /**
         * Returns the raw JSON value of [snapshot].
         *
         * Unlike [snapshot], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("snapshot") @ExcludeMissing fun _snapshot(): JsonField<String> = snapshot

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

        /**
         * Returns the raw JSON value of [volumes].
         *
         * Unlike [volumes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("volumes") @ExcludeMissing fun _volumes(): JsonField<List<Volume>> = volumes

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

            private var accessDelegation: JsonField<AccessDelegation> = JsonMissing.of()
            private var cpuMillicores: JsonField<Long> = JsonMissing.of()
            private var deleteAfterStopSeconds: JsonField<Long> = JsonMissing.of()
            private var envVars: JsonField<EnvVars> = JsonMissing.of()
            private var fsCapacityBytes: JsonField<Long> = JsonMissing.of()
            private var idleTtlSeconds: JsonField<Long> = JsonMissing.of()
            private var labels: JsonField<Labels> = JsonMissing.of()
            private var memBytes: JsonField<Long> = JsonMissing.of()
            private var mountConfig: JsonField<SandboxMountConfig> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var persistent: JsonField<Boolean> = JsonMissing.of()
            private var preserveMemoryOnStop: JsonField<Boolean> = JsonMissing.of()
            private var proxyConfig: JsonField<ProxyConfig> = JsonMissing.of()
            private var restoreMemory: JsonField<Boolean> = JsonMissing.of()
            private var runConfig: JsonField<RunConfig> = JsonMissing.of()
            private var snapshot: JsonField<String> = JsonMissing.of()
            private var snapshotId: JsonField<String> = JsonMissing.of()
            private var snapshotName: JsonField<String> = JsonMissing.of()
            private var tagValueIds: JsonField<MutableList<String>>? = null
            private var vcpus: JsonField<Long> = JsonMissing.of()
            private var volumes: JsonField<MutableList<Volume>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accessDelegation = body.accessDelegation
                cpuMillicores = body.cpuMillicores
                deleteAfterStopSeconds = body.deleteAfterStopSeconds
                envVars = body.envVars
                fsCapacityBytes = body.fsCapacityBytes
                idleTtlSeconds = body.idleTtlSeconds
                labels = body.labels
                memBytes = body.memBytes
                mountConfig = body.mountConfig
                name = body.name
                persistent = body.persistent
                preserveMemoryOnStop = body.preserveMemoryOnStop
                proxyConfig = body.proxyConfig
                restoreMemory = body.restoreMemory
                runConfig = body.runConfig
                snapshot = body.snapshot
                snapshotId = body.snapshotId
                snapshotName = body.snapshotName
                tagValueIds = body.tagValueIds.map { it.toMutableList() }
                vcpus = body.vcpus
                volumes = body.volumes.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * AccessDelegation lets code inside the sandbox call the LangSmith API as you, with at
             * most the permissions granted here. Omit for no access.
             */
            fun accessDelegation(accessDelegation: AccessDelegation) =
                accessDelegation(JsonField.of(accessDelegation))

            /**
             * Sets [Builder.accessDelegation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accessDelegation] with a well-typed
             * [AccessDelegation] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun accessDelegation(accessDelegation: JsonField<AccessDelegation>) = apply {
                this.accessDelegation = accessDelegation
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

            /**
             * Disk for the sandbox, in bytes; defaults to the snapshot's and cannot be smaller. A
             * sandbox with persistent=false gets at most 16 GiB of disk per vCPU, so at most 256
             * GiB: omit CPU and it is derived from the disk, set it and a larger disk is rejected.
             */
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

            /**
             * Labels are free-form key/value metadata persisted with the sandbox and returned on
             * reads. Labels from the source snapshot are inherited unless overridden here.
             */
            fun labels(labels: Labels) = labels(JsonField.of(labels))

            /**
             * Sets [Builder.labels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.labels] with a well-typed [Labels] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun labels(labels: JsonField<Labels>) = apply { this.labels = labels }

            /**
             * Memory for the sandbox, in bytes. Memory is tied to CPU at 4 GiB per vCPU: omit it
             * and it follows that ratio; set it and it must stay within 50% of the ratio for the
             * requested CPU, so a 1 vCPU sandbox accepts 2-6 GiB. Setting memory without CPU
             * derives the CPU from the same ratio. Maximum 64 GiB.
             */
            fun memBytes(memBytes: Long) = memBytes(JsonField.of(memBytes))

            /**
             * Sets [Builder.memBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memBytes] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memBytes(memBytes: JsonField<Long>) = apply { this.memBytes = memBytes }

            fun mountConfig(mountConfig: SandboxMountConfig) =
                mountConfig(JsonField.of(mountConfig))

            /**
             * Sets [Builder.mountConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mountConfig] with a well-typed [SandboxMountConfig]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun mountConfig(mountConfig: JsonField<SandboxMountConfig>) = apply {
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
             * Persistent (private beta) keeps the sandbox's filesystem across stops (the default,
             * true). Set it to false for a disposable sandbox: its writes are discarded whenever it
             * stops, the next start boots it fresh from its snapshot, and it is never charged for
             * storage. A sandbox that is not persistent cannot preserve memory on stop or have its
             * filesystem captured as a snapshot (exporting a Docker image from it with docker_image
             * still works), and some snapshots captured from other sandboxes cannot start one; such
             * a create is rejected. Setting it to false requires the private beta to be enabled for
             * your workspace.
             */
            fun persistent(persistent: Boolean) = persistent(JsonField.of(persistent))

            /**
             * Sets [Builder.persistent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.persistent] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun persistent(persistent: JsonField<Boolean>) = apply { this.persistent = persistent }

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

            /**
             * RunConfig overrides the snapshot's run config for this sandbox: user and work_dir
             * replace the snapshot's, env_vars merge over it. The result is what the sandbox boots
             * with, and what a snapshot captured from it carries.
             */
            fun runConfig(runConfig: RunConfig) = runConfig(JsonField.of(runConfig))

            /**
             * Sets [Builder.runConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runConfig] with a well-typed [RunConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runConfig(runConfig: JsonField<RunConfig>) = apply { this.runConfig = runConfig }

            /**
             * Snapshot is a Docker-style name or name:tag reference to boot from. A bare name
             * resolves to name:latest.
             */
            fun snapshot(snapshot: String) = snapshot(JsonField.of(snapshot))

            /**
             * Sets [Builder.snapshot] to an arbitrary JSON value.
             *
             * You should usually call [Builder.snapshot] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun snapshot(snapshot: JsonField<String>) = apply { this.snapshot = snapshot }

            fun snapshotId(snapshotId: String) = snapshotId(JsonField.of(snapshotId))

            /**
             * Sets [Builder.snapshotId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.snapshotId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun snapshotId(snapshotId: JsonField<String>) = apply { this.snapshotId = snapshotId }

            /**
             * SnapshotName is a synonym for Snapshot, accepted for compatibility with clients that
             * predate it. Set one or the other.
             */
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

            /**
             * Volumes (beta) attaches existing volumes at mount paths inside the sandbox. At most
             * 4; requires sandbox volumes to be enabled for your workspace. Attaching a volume
             * requires being its creator or holding sandboxes:exec.
             */
            fun volumes(volumes: List<Volume>) = volumes(JsonField.of(volumes))

            /**
             * Sets [Builder.volumes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.volumes] with a well-typed `List<Volume>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun volumes(volumes: JsonField<List<Volume>>) = apply {
                this.volumes = volumes.map { it.toMutableList() }
            }

            /**
             * Adds a single [Volume] to [volumes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVolume(volume: Volume) = apply {
                volumes =
                    (volumes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("volumes", it).add(volume)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    accessDelegation,
                    cpuMillicores,
                    deleteAfterStopSeconds,
                    envVars,
                    fsCapacityBytes,
                    idleTtlSeconds,
                    labels,
                    memBytes,
                    mountConfig,
                    name,
                    persistent,
                    preserveMemoryOnStop,
                    proxyConfig,
                    restoreMemory,
                    runConfig,
                    snapshot,
                    snapshotId,
                    snapshotName,
                    (tagValueIds ?: JsonMissing.of()).map { it.toImmutable() },
                    vcpus,
                    (volumes ?: JsonMissing.of()).map { it.toImmutable() },
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

            accessDelegation().ifPresent { it.validate() }
            cpuMillicores()
            deleteAfterStopSeconds()
            envVars().ifPresent { it.validate() }
            fsCapacityBytes()
            idleTtlSeconds()
            labels().ifPresent { it.validate() }
            memBytes()
            mountConfig().ifPresent { it.validate() }
            name()
            persistent()
            preserveMemoryOnStop()
            proxyConfig().ifPresent { it.validate() }
            restoreMemory()
            runConfig().ifPresent { it.validate() }
            snapshot()
            snapshotId()
            snapshotName()
            tagValueIds()
            vcpus()
            volumes().ifPresent { it.forEach { it.validate() } }
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
            (accessDelegation.asKnown().getOrNull()?.validity() ?: 0) +
                (if (cpuMillicores.asKnown().isPresent) 1 else 0) +
                (if (deleteAfterStopSeconds.asKnown().isPresent) 1 else 0) +
                (envVars.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fsCapacityBytes.asKnown().isPresent) 1 else 0) +
                (if (idleTtlSeconds.asKnown().isPresent) 1 else 0) +
                (labels.asKnown().getOrNull()?.validity() ?: 0) +
                (if (memBytes.asKnown().isPresent) 1 else 0) +
                (mountConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (persistent.asKnown().isPresent) 1 else 0) +
                (if (preserveMemoryOnStop.asKnown().isPresent) 1 else 0) +
                (proxyConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (restoreMemory.asKnown().isPresent) 1 else 0) +
                (runConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (snapshot.asKnown().isPresent) 1 else 0) +
                (if (snapshotId.asKnown().isPresent) 1 else 0) +
                (if (snapshotName.asKnown().isPresent) 1 else 0) +
                (tagValueIds.asKnown().getOrNull()?.size ?: 0) +
                (if (vcpus.asKnown().isPresent) 1 else 0) +
                (volumes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accessDelegation == other.accessDelegation &&
                cpuMillicores == other.cpuMillicores &&
                deleteAfterStopSeconds == other.deleteAfterStopSeconds &&
                envVars == other.envVars &&
                fsCapacityBytes == other.fsCapacityBytes &&
                idleTtlSeconds == other.idleTtlSeconds &&
                labels == other.labels &&
                memBytes == other.memBytes &&
                mountConfig == other.mountConfig &&
                name == other.name &&
                persistent == other.persistent &&
                preserveMemoryOnStop == other.preserveMemoryOnStop &&
                proxyConfig == other.proxyConfig &&
                restoreMemory == other.restoreMemory &&
                runConfig == other.runConfig &&
                snapshot == other.snapshot &&
                snapshotId == other.snapshotId &&
                snapshotName == other.snapshotName &&
                tagValueIds == other.tagValueIds &&
                vcpus == other.vcpus &&
                volumes == other.volumes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accessDelegation,
                cpuMillicores,
                deleteAfterStopSeconds,
                envVars,
                fsCapacityBytes,
                idleTtlSeconds,
                labels,
                memBytes,
                mountConfig,
                name,
                persistent,
                preserveMemoryOnStop,
                proxyConfig,
                restoreMemory,
                runConfig,
                snapshot,
                snapshotId,
                snapshotName,
                tagValueIds,
                vcpus,
                volumes,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accessDelegation=$accessDelegation, cpuMillicores=$cpuMillicores, deleteAfterStopSeconds=$deleteAfterStopSeconds, envVars=$envVars, fsCapacityBytes=$fsCapacityBytes, idleTtlSeconds=$idleTtlSeconds, labels=$labels, memBytes=$memBytes, mountConfig=$mountConfig, name=$name, persistent=$persistent, preserveMemoryOnStop=$preserveMemoryOnStop, proxyConfig=$proxyConfig, restoreMemory=$restoreMemory, runConfig=$runConfig, snapshot=$snapshot, snapshotId=$snapshotId, snapshotName=$snapshotName, tagValueIds=$tagValueIds, vcpus=$vcpus, volumes=$volumes, additionalProperties=$additionalProperties}"
    }

    /**
     * AccessDelegation lets code inside the sandbox call the LangSmith API as you, with at most the
     * permissions granted here. Omit for no access.
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

    /**
     * Labels are free-form key/value metadata persisted with the sandbox and returned on reads.
     * Labels from the source snapshot are inherited unless overridden here.
     */
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
     * RunConfig overrides the snapshot's run config for this sandbox: user and work_dir replace the
     * snapshot's, env_vars merge over it. The result is what the sandbox boots with, and what a
     * snapshot captured from it carries.
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

    class Volume
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val mountPath: JsonField<String>,
        private val volume: JsonField<String>,
        private val readOnly: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("mount_path")
            @ExcludeMissing
            mountPath: JsonField<String> = JsonMissing.of(),
            @JsonProperty("volume") @ExcludeMissing volume: JsonField<String> = JsonMissing.of(),
            @JsonProperty("read_only")
            @ExcludeMissing
            readOnly: JsonField<Boolean> = JsonMissing.of(),
        ) : this(mountPath, volume, readOnly, mutableMapOf())

        /**
         * MountPath is the absolute directory inside the sandbox where the volume appears.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mountPath(): String = mountPath.getRequired("mount_path")

        /**
         * Volume is the volume's ID or name.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun volume(): String = volume.getRequired("volume")

        /**
         * ReadOnly mounts the volume read-only; many sandboxes may do so at once.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun readOnly(): Optional<Boolean> = readOnly.getOptional("read_only")

        /**
         * Returns the raw JSON value of [mountPath].
         *
         * Unlike [mountPath], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mount_path") @ExcludeMissing fun _mountPath(): JsonField<String> = mountPath

        /**
         * Returns the raw JSON value of [volume].
         *
         * Unlike [volume], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("volume") @ExcludeMissing fun _volume(): JsonField<String> = volume

        /**
         * Returns the raw JSON value of [readOnly].
         *
         * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("read_only") @ExcludeMissing fun _readOnly(): JsonField<Boolean> = readOnly

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
             * Returns a mutable builder for constructing an instance of [Volume].
             *
             * The following fields are required:
             * ```java
             * .mountPath()
             * .volume()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Volume]. */
        class Builder internal constructor() {

            private var mountPath: JsonField<String>? = null
            private var volume: JsonField<String>? = null
            private var readOnly: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(volume: Volume) = apply {
                mountPath = volume.mountPath
                this.volume = volume.volume
                readOnly = volume.readOnly
                additionalProperties = volume.additionalProperties.toMutableMap()
            }

            /** MountPath is the absolute directory inside the sandbox where the volume appears. */
            fun mountPath(mountPath: String) = mountPath(JsonField.of(mountPath))

            /**
             * Sets [Builder.mountPath] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mountPath] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mountPath(mountPath: JsonField<String>) = apply { this.mountPath = mountPath }

            /** Volume is the volume's ID or name. */
            fun volume(volume: String) = volume(JsonField.of(volume))

            /**
             * Sets [Builder.volume] to an arbitrary JSON value.
             *
             * You should usually call [Builder.volume] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun volume(volume: JsonField<String>) = apply { this.volume = volume }

            /** ReadOnly mounts the volume read-only; many sandboxes may do so at once. */
            fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

            /**
             * Sets [Builder.readOnly] to an arbitrary JSON value.
             *
             * You should usually call [Builder.readOnly] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

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
             * Returns an immutable instance of [Volume].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .mountPath()
             * .volume()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Volume =
                Volume(
                    checkRequired("mountPath", mountPath),
                    checkRequired("volume", volume),
                    readOnly,
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
        fun validate(): Volume = apply {
            if (validated) {
                return@apply
            }

            mountPath()
            volume()
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
            (if (mountPath.asKnown().isPresent) 1 else 0) +
                (if (volume.asKnown().isPresent) 1 else 0) +
                (if (readOnly.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Volume &&
                mountPath == other.mountPath &&
                volume == other.volume &&
                readOnly == other.readOnly &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(mountPath, volume, readOnly, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Volume{mountPath=$mountPath, volume=$volume, readOnly=$readOnly, additionalProperties=$additionalProperties}"
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
