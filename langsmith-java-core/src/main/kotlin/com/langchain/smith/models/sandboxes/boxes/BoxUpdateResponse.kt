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
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BoxUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val dataplaneUrl: JsonField<String>,
    private val expiresAt: JsonField<String>,
    private val fsCapacityBytes: JsonField<Long>,
    private val idleTtlSeconds: JsonField<Long>,
    private val memBytes: JsonField<Long>,
    private val name: JsonField<String>,
    private val proxyConfig: JsonField<ProxyConfig>,
    private val snapshotId: JsonField<String>,
    private val status: JsonField<String>,
    private val statusMessage: JsonField<String>,
    private val templateName: JsonField<String>,
    private val ttlSeconds: JsonField<Long>,
    private val updatedAt: JsonField<String>,
    private val vcpus: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataplane_url")
        @ExcludeMissing
        dataplaneUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at") @ExcludeMissing expiresAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fs_capacity_bytes")
        @ExcludeMissing
        fsCapacityBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("idle_ttl_seconds")
        @ExcludeMissing
        idleTtlSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mem_bytes") @ExcludeMissing memBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("proxy_config")
        @ExcludeMissing
        proxyConfig: JsonField<ProxyConfig> = JsonMissing.of(),
        @JsonProperty("snapshot_id")
        @ExcludeMissing
        snapshotId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status_message")
        @ExcludeMissing
        statusMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("template_name")
        @ExcludeMissing
        templateName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ttl_seconds") @ExcludeMissing ttlSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vcpus") @ExcludeMissing vcpus: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        dataplaneUrl,
        expiresAt,
        fsCapacityBytes,
        idleTtlSeconds,
        memBytes,
        name,
        proxyConfig,
        snapshotId,
        status,
        statusMessage,
        templateName,
        ttlSeconds,
        updatedAt,
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
    fun dataplaneUrl(): Optional<String> = dataplaneUrl.getOptional("dataplane_url")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<String> = expiresAt.getOptional("expires_at")

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
    fun templateName(): Optional<String> = templateName.getOptional("template_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ttlSeconds(): Optional<Long> = ttlSeconds.getOptional("ttl_seconds")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

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
     * Returns the raw JSON value of [dataplaneUrl].
     *
     * Unlike [dataplaneUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataplane_url")
    @ExcludeMissing
    fun _dataplaneUrl(): JsonField<String> = dataplaneUrl

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt(): JsonField<String> = expiresAt

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
     * Returns the raw JSON value of [templateName].
     *
     * Unlike [templateName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("template_name")
    @ExcludeMissing
    fun _templateName(): JsonField<String> = templateName

    /**
     * Returns the raw JSON value of [ttlSeconds].
     *
     * Unlike [ttlSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ttl_seconds") @ExcludeMissing fun _ttlSeconds(): JsonField<Long> = ttlSeconds

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [BoxUpdateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BoxUpdateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var dataplaneUrl: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<String> = JsonMissing.of()
        private var fsCapacityBytes: JsonField<Long> = JsonMissing.of()
        private var idleTtlSeconds: JsonField<Long> = JsonMissing.of()
        private var memBytes: JsonField<Long> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var proxyConfig: JsonField<ProxyConfig> = JsonMissing.of()
        private var snapshotId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var statusMessage: JsonField<String> = JsonMissing.of()
        private var templateName: JsonField<String> = JsonMissing.of()
        private var ttlSeconds: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var vcpus: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(boxUpdateResponse: BoxUpdateResponse) = apply {
            id = boxUpdateResponse.id
            createdAt = boxUpdateResponse.createdAt
            dataplaneUrl = boxUpdateResponse.dataplaneUrl
            expiresAt = boxUpdateResponse.expiresAt
            fsCapacityBytes = boxUpdateResponse.fsCapacityBytes
            idleTtlSeconds = boxUpdateResponse.idleTtlSeconds
            memBytes = boxUpdateResponse.memBytes
            name = boxUpdateResponse.name
            proxyConfig = boxUpdateResponse.proxyConfig
            snapshotId = boxUpdateResponse.snapshotId
            status = boxUpdateResponse.status
            statusMessage = boxUpdateResponse.statusMessage
            templateName = boxUpdateResponse.templateName
            ttlSeconds = boxUpdateResponse.ttlSeconds
            updatedAt = boxUpdateResponse.updatedAt
            vcpus = boxUpdateResponse.vcpus
            additionalProperties = boxUpdateResponse.additionalProperties.toMutableMap()
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

        fun expiresAt(expiresAt: String) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expiresAt(expiresAt: JsonField<String>) = apply { this.expiresAt = expiresAt }

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

        fun templateName(templateName: String) = templateName(JsonField.of(templateName))

        /**
         * Sets [Builder.templateName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templateName(templateName: JsonField<String>) = apply {
            this.templateName = templateName
        }

        fun ttlSeconds(ttlSeconds: Long) = ttlSeconds(JsonField.of(ttlSeconds))

        /**
         * Sets [Builder.ttlSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ttlSeconds] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ttlSeconds(ttlSeconds: JsonField<Long>) = apply { this.ttlSeconds = ttlSeconds }

        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [BoxUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BoxUpdateResponse =
            BoxUpdateResponse(
                id,
                createdAt,
                dataplaneUrl,
                expiresAt,
                fsCapacityBytes,
                idleTtlSeconds,
                memBytes,
                name,
                proxyConfig,
                snapshotId,
                status,
                statusMessage,
                templateName,
                ttlSeconds,
                updatedAt,
                vcpus,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BoxUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        dataplaneUrl()
        expiresAt()
        fsCapacityBytes()
        idleTtlSeconds()
        memBytes()
        name()
        proxyConfig().ifPresent { it.validate() }
        snapshotId()
        status()
        statusMessage()
        templateName()
        ttlSeconds()
        updatedAt()
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
            (if (dataplaneUrl.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (fsCapacityBytes.asKnown().isPresent) 1 else 0) +
            (if (idleTtlSeconds.asKnown().isPresent) 1 else 0) +
            (if (memBytes.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (proxyConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (snapshotId.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (statusMessage.asKnown().isPresent) 1 else 0) +
            (if (templateName.asKnown().isPresent) 1 else 0) +
            (if (ttlSeconds.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (vcpus.asKnown().isPresent) 1 else 0)

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
                @JsonProperty("request_headers")
                @ExcludeMissing
                requestHeaders: JsonField<List<RequestHeader>> = JsonMissing.of(),
            ) : this(matchHosts, ttlSeconds, url, requestHeaders, mutableMapOf())

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun matchHosts(): List<String> = matchHosts.getRequired("match_hosts")

            /**
             * TTLSeconds is how long resolved headers are cached before the proxy re-invokes URL.
             * Must be between 60 and 3600 seconds.
             *
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
                private var requestHeaders: JsonField<MutableList<RequestHeader>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(callback: Callback) = apply {
                    matchHosts = callback.matchHosts.map { it.toMutableList() }
                    ttlSeconds = callback.ttlSeconds
                    url = callback.url
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

                /**
                 * TTLSeconds is how long resolved headers are cached before the proxy re-invokes
                 * URL. Must be between 60 and 3600 seconds.
                 */
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
                        (requestHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Callback = apply {
                if (validated) {
                    return@apply
                }

                matchHosts()
                ttlSeconds()
                url()
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
                    requestHeaders == other.requestHeaders &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(matchHosts, ttlSeconds, url, requestHeaders, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Callback{matchHosts=$matchHosts, ttlSeconds=$ttlSeconds, url=$url, requestHeaders=$requestHeaders, additionalProperties=$additionalProperties}"
        }

        class Rule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val matchHosts: JsonField<List<String>>,
            private val name: JsonField<String>,
            private val enabled: JsonField<Boolean>,
            private val headers: JsonField<List<Header>>,
            private val matchPaths: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("match_hosts")
                @ExcludeMissing
                matchHosts: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("enabled")
                @ExcludeMissing
                enabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("headers")
                @ExcludeMissing
                headers: JsonField<List<Header>> = JsonMissing.of(),
                @JsonProperty("match_paths")
                @ExcludeMissing
                matchPaths: JsonField<List<String>> = JsonMissing.of(),
            ) : this(matchHosts, name, enabled, headers, matchPaths, mutableMapOf())

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
            fun name(): String = name.getRequired("name")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun headers(): Optional<List<Header>> = headers.getOptional("headers")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun matchPaths(): Optional<List<String>> = matchPaths.getOptional("match_paths")

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
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [enabled].
             *
             * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

            /**
             * Returns the raw JSON value of [headers].
             *
             * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("headers")
            @ExcludeMissing
            fun _headers(): JsonField<List<Header>> = headers

            /**
             * Returns the raw JSON value of [matchPaths].
             *
             * Unlike [matchPaths], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("match_paths")
            @ExcludeMissing
            fun _matchPaths(): JsonField<List<String>> = matchPaths

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
                 * .matchHosts()
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Rule]. */
            class Builder internal constructor() {

                private var matchHosts: JsonField<MutableList<String>>? = null
                private var name: JsonField<String>? = null
                private var enabled: JsonField<Boolean> = JsonMissing.of()
                private var headers: JsonField<MutableList<Header>>? = null
                private var matchPaths: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(rule: Rule) = apply {
                    matchHosts = rule.matchHosts.map { it.toMutableList() }
                    name = rule.name
                    enabled = rule.enabled
                    headers = rule.headers.map { it.toMutableList() }
                    matchPaths = rule.matchPaths.map { it.toMutableList() }
                    additionalProperties = rule.additionalProperties.toMutableMap()
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

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

                /**
                 * Sets [Builder.enabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enabled] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

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
                 * .matchHosts()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Rule =
                    Rule(
                        checkRequired("matchHosts", matchHosts).map { it.toImmutable() },
                        checkRequired("name", name),
                        enabled,
                        (headers ?: JsonMissing.of()).map { it.toImmutable() },
                        (matchPaths ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Rule = apply {
                if (validated) {
                    return@apply
                }

                matchHosts()
                name()
                enabled()
                headers().ifPresent { it.forEach { it.validate() } }
                matchPaths()
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (enabled.asKnown().isPresent) 1 else 0) +
                    (headers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (matchPaths.asKnown().getOrNull()?.size ?: 0)

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
                    matchHosts == other.matchHosts &&
                    name == other.name &&
                    enabled == other.enabled &&
                    headers == other.headers &&
                    matchPaths == other.matchPaths &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(matchHosts, name, enabled, headers, matchPaths, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Rule{matchHosts=$matchHosts, name=$name, enabled=$enabled, headers=$headers, matchPaths=$matchPaths, additionalProperties=$additionalProperties}"
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

        return other is BoxUpdateResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            dataplaneUrl == other.dataplaneUrl &&
            expiresAt == other.expiresAt &&
            fsCapacityBytes == other.fsCapacityBytes &&
            idleTtlSeconds == other.idleTtlSeconds &&
            memBytes == other.memBytes &&
            name == other.name &&
            proxyConfig == other.proxyConfig &&
            snapshotId == other.snapshotId &&
            status == other.status &&
            statusMessage == other.statusMessage &&
            templateName == other.templateName &&
            ttlSeconds == other.ttlSeconds &&
            updatedAt == other.updatedAt &&
            vcpus == other.vcpus &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            dataplaneUrl,
            expiresAt,
            fsCapacityBytes,
            idleTtlSeconds,
            memBytes,
            name,
            proxyConfig,
            snapshotId,
            status,
            statusMessage,
            templateName,
            ttlSeconds,
            updatedAt,
            vcpus,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BoxUpdateResponse{id=$id, createdAt=$createdAt, dataplaneUrl=$dataplaneUrl, expiresAt=$expiresAt, fsCapacityBytes=$fsCapacityBytes, idleTtlSeconds=$idleTtlSeconds, memBytes=$memBytes, name=$name, proxyConfig=$proxyConfig, snapshotId=$snapshotId, status=$status, statusMessage=$statusMessage, templateName=$templateName, ttlSeconds=$ttlSeconds, updatedAt=$updatedAt, vcpus=$vcpus, additionalProperties=$additionalProperties}"
}
