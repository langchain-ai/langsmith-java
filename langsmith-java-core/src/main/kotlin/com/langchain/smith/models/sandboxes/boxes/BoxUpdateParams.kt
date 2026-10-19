// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.sandboxes.ProxyConfig
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update a sandbox's display name, retention, resources, tags, or proxy configuration. The name
 * must be unique within the tenant. Proxy configuration sent to a sandbox that is not running is
 * stored and applied when it next starts.
 */
class BoxUpdateParams
private constructor(
    private val pathName: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathName(): Optional<String> = Optional.ofNullable(pathName)

    /**
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
    fun fsCapacityBytes(): Optional<Long> = body.fsCapacityBytes()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idleTtlSeconds(): Optional<Long> = body.idleTtlSeconds()

    /**
     * New memory for the sandbox, in bytes. The 4 GiB per vCPU ratio applies when the sandbox is
     * created; a resize enforces only the maximum of 64 GiB.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memBytes(): Optional<Long> = body.memBytes()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bodyName(): Optional<String> = body.bodyName()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proxyConfig(): Optional<ProxyConfig> = body.proxyConfig()

    /**
     * RunConfig changes what subsequent commands run with: user and work_dir replace the current
     * values, env_vars merge over them. Commands already running are unaffected.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runConfig(): Optional<RunConfig> = body.runConfig()

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
     * Returns the raw JSON value of [bodyName].
     *
     * Unlike [bodyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bodyName(): JsonField<String> = body._bodyName()

    /**
     * Returns the raw JSON value of [proxyConfig].
     *
     * Unlike [proxyConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _proxyConfig(): JsonField<ProxyConfig> = body._proxyConfig()

    /**
     * Returns the raw JSON value of [runConfig].
     *
     * Unlike [runConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _runConfig(): JsonField<RunConfig> = body._runConfig()

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

        @JvmStatic fun none(): BoxUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [BoxUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BoxUpdateParams]. */
    class Builder internal constructor() {

        private var pathName: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(boxUpdateParams: BoxUpdateParams) = apply {
            pathName = boxUpdateParams.pathName
            body = boxUpdateParams.body.toBuilder()
            additionalHeaders = boxUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = boxUpdateParams.additionalQueryParams.toBuilder()
        }

        fun pathName(pathName: String?) = apply { this.pathName = pathName }

        /** Alias for calling [Builder.pathName] with `pathName.orElse(null)`. */
        fun pathName(pathName: Optional<String>) = pathName(pathName.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [cpuMillicores]
         * - [deleteAfterStopSeconds]
         * - [fsCapacityBytes]
         * - [idleTtlSeconds]
         * - [memBytes]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

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
         * New memory for the sandbox, in bytes. The 4 GiB per vCPU ratio applies when the sandbox
         * is created; a resize enforces only the maximum of 64 GiB.
         */
        fun memBytes(memBytes: Long) = apply { body.memBytes(memBytes) }

        /**
         * Sets [Builder.memBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memBytes(memBytes: JsonField<Long>) = apply { body.memBytes(memBytes) }

        fun bodyName(bodyName: String) = apply { body.bodyName(bodyName) }

        /**
         * Sets [Builder.bodyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bodyName(bodyName: JsonField<String>) = apply { body.bodyName(bodyName) }

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
         * RunConfig changes what subsequent commands run with: user and work_dir replace the
         * current values, env_vars merge over them. Commands already running are unaffected.
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
         * Returns an immutable instance of [BoxUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BoxUpdateParams =
            BoxUpdateParams(
                pathName,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pathName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cpuMillicores: JsonField<Long>,
        private val deleteAfterStopSeconds: JsonField<Long>,
        private val fsCapacityBytes: JsonField<Long>,
        private val idleTtlSeconds: JsonField<Long>,
        private val memBytes: JsonField<Long>,
        private val bodyName: JsonField<String>,
        private val proxyConfig: JsonField<ProxyConfig>,
        private val runConfig: JsonField<RunConfig>,
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
            @JsonProperty("fs_capacity_bytes")
            @ExcludeMissing
            fsCapacityBytes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("idle_ttl_seconds")
            @ExcludeMissing
            idleTtlSeconds: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("mem_bytes") @ExcludeMissing memBytes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing bodyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("proxy_config")
            @ExcludeMissing
            proxyConfig: JsonField<ProxyConfig> = JsonMissing.of(),
            @JsonProperty("run_config")
            @ExcludeMissing
            runConfig: JsonField<RunConfig> = JsonMissing.of(),
            @JsonProperty("tag_value_ids")
            @ExcludeMissing
            tagValueIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("vcpus") @ExcludeMissing vcpus: JsonField<Long> = JsonMissing.of(),
        ) : this(
            cpuMillicores,
            deleteAfterStopSeconds,
            fsCapacityBytes,
            idleTtlSeconds,
            memBytes,
            bodyName,
            proxyConfig,
            runConfig,
            tagValueIds,
            vcpus,
            mutableMapOf(),
        )

        /**
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
        fun fsCapacityBytes(): Optional<Long> = fsCapacityBytes.getOptional("fs_capacity_bytes")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun idleTtlSeconds(): Optional<Long> = idleTtlSeconds.getOptional("idle_ttl_seconds")

        /**
         * New memory for the sandbox, in bytes. The 4 GiB per vCPU ratio applies when the sandbox
         * is created; a resize enforces only the maximum of 64 GiB.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun memBytes(): Optional<Long> = memBytes.getOptional("mem_bytes")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun bodyName(): Optional<String> = bodyName.getOptional("name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun proxyConfig(): Optional<ProxyConfig> = proxyConfig.getOptional("proxy_config")

        /**
         * RunConfig changes what subsequent commands run with: user and work_dir replace the
         * current values, env_vars merge over them. Commands already running are unaffected.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun runConfig(): Optional<RunConfig> = runConfig.getOptional("run_config")

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
         * Returns the raw JSON value of [bodyName].
         *
         * Unlike [bodyName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _bodyName(): JsonField<String> = bodyName

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
        @JsonProperty("run_config")
        @ExcludeMissing
        fun _runConfig(): JsonField<RunConfig> = runConfig

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
            private var fsCapacityBytes: JsonField<Long> = JsonMissing.of()
            private var idleTtlSeconds: JsonField<Long> = JsonMissing.of()
            private var memBytes: JsonField<Long> = JsonMissing.of()
            private var bodyName: JsonField<String> = JsonMissing.of()
            private var proxyConfig: JsonField<ProxyConfig> = JsonMissing.of()
            private var runConfig: JsonField<RunConfig> = JsonMissing.of()
            private var tagValueIds: JsonField<MutableList<String>>? = null
            private var vcpus: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                cpuMillicores = body.cpuMillicores
                deleteAfterStopSeconds = body.deleteAfterStopSeconds
                fsCapacityBytes = body.fsCapacityBytes
                idleTtlSeconds = body.idleTtlSeconds
                memBytes = body.memBytes
                bodyName = body.bodyName
                proxyConfig = body.proxyConfig
                runConfig = body.runConfig
                tagValueIds = body.tagValueIds.map { it.toMutableList() }
                vcpus = body.vcpus
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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
             * New memory for the sandbox, in bytes. The 4 GiB per vCPU ratio applies when the
             * sandbox is created; a resize enforces only the maximum of 64 GiB.
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

            fun bodyName(bodyName: String) = bodyName(JsonField.of(bodyName))

            /**
             * Sets [Builder.bodyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyName(bodyName: JsonField<String>) = apply { this.bodyName = bodyName }

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
             * RunConfig changes what subsequent commands run with: user and work_dir replace the
             * current values, env_vars merge over them. Commands already running are unaffected.
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
                    fsCapacityBytes,
                    idleTtlSeconds,
                    memBytes,
                    bodyName,
                    proxyConfig,
                    runConfig,
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
            fsCapacityBytes()
            idleTtlSeconds()
            memBytes()
            bodyName()
            proxyConfig().ifPresent { it.validate() }
            runConfig().ifPresent { it.validate() }
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
                (if (fsCapacityBytes.asKnown().isPresent) 1 else 0) +
                (if (idleTtlSeconds.asKnown().isPresent) 1 else 0) +
                (if (memBytes.asKnown().isPresent) 1 else 0) +
                (if (bodyName.asKnown().isPresent) 1 else 0) +
                (proxyConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (runConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (tagValueIds.asKnown().getOrNull()?.size ?: 0) +
                (if (vcpus.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                cpuMillicores == other.cpuMillicores &&
                deleteAfterStopSeconds == other.deleteAfterStopSeconds &&
                fsCapacityBytes == other.fsCapacityBytes &&
                idleTtlSeconds == other.idleTtlSeconds &&
                memBytes == other.memBytes &&
                bodyName == other.bodyName &&
                proxyConfig == other.proxyConfig &&
                runConfig == other.runConfig &&
                tagValueIds == other.tagValueIds &&
                vcpus == other.vcpus &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cpuMillicores,
                deleteAfterStopSeconds,
                fsCapacityBytes,
                idleTtlSeconds,
                memBytes,
                bodyName,
                proxyConfig,
                runConfig,
                tagValueIds,
                vcpus,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{cpuMillicores=$cpuMillicores, deleteAfterStopSeconds=$deleteAfterStopSeconds, fsCapacityBytes=$fsCapacityBytes, idleTtlSeconds=$idleTtlSeconds, memBytes=$memBytes, bodyName=$bodyName, proxyConfig=$proxyConfig, runConfig=$runConfig, tagValueIds=$tagValueIds, vcpus=$vcpus, additionalProperties=$additionalProperties}"
    }

    /**
     * RunConfig changes what subsequent commands run with: user and work_dir replace the current
     * values, env_vars merge over them. Commands already running are unaffected.
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

        return other is BoxUpdateParams &&
            pathName == other.pathName &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pathName, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BoxUpdateParams{pathName=$pathName, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
