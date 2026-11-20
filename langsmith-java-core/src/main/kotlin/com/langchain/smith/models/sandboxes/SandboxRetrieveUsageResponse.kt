// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

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

class SandboxRetrieveUsageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cpuLimitMillicores: JsonField<Long>,
    private val cpuUsedMillicores: JsonField<Long>,
    private val memoryLimitBytes: JsonField<Long>,
    private val memoryUsedBytes: JsonField<Long>,
    private val poolsCount: JsonField<Long>,
    private val registriesCount: JsonField<Long>,
    private val sandboxDirectCount: JsonField<Long>,
    private val sandboxPoolReplicasCount: JsonField<Long>,
    private val sandboxRunningCount: JsonField<Long>,
    private val sandboxStoppedCount: JsonField<Long>,
    private val sandboxesLimit: JsonField<Long>,
    private val sandboxesUsed: JsonField<Long>,
    private val snapshotsCount: JsonField<Long>,
    private val templatesCount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cpu_limit_millicores")
        @ExcludeMissing
        cpuLimitMillicores: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("cpu_used_millicores")
        @ExcludeMissing
        cpuUsedMillicores: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("memory_limit_bytes")
        @ExcludeMissing
        memoryLimitBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("memory_used_bytes")
        @ExcludeMissing
        memoryUsedBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("pools_count") @ExcludeMissing poolsCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("registries_count")
        @ExcludeMissing
        registriesCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sandbox_direct_count")
        @ExcludeMissing
        sandboxDirectCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sandbox_pool_replicas_count")
        @ExcludeMissing
        sandboxPoolReplicasCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sandbox_running_count")
        @ExcludeMissing
        sandboxRunningCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sandbox_stopped_count")
        @ExcludeMissing
        sandboxStoppedCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sandboxes_limit")
        @ExcludeMissing
        sandboxesLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sandboxes_used")
        @ExcludeMissing
        sandboxesUsed: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("snapshots_count")
        @ExcludeMissing
        snapshotsCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("templates_count")
        @ExcludeMissing
        templatesCount: JsonField<Long> = JsonMissing.of(),
    ) : this(
        cpuLimitMillicores,
        cpuUsedMillicores,
        memoryLimitBytes,
        memoryUsedBytes,
        poolsCount,
        registriesCount,
        sandboxDirectCount,
        sandboxPoolReplicasCount,
        sandboxRunningCount,
        sandboxStoppedCount,
        sandboxesLimit,
        sandboxesUsed,
        snapshotsCount,
        templatesCount,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cpuLimitMillicores(): Optional<Long> =
        cpuLimitMillicores.getOptional("cpu_limit_millicores")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cpuUsedMillicores(): Optional<Long> = cpuUsedMillicores.getOptional("cpu_used_millicores")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memoryLimitBytes(): Optional<Long> = memoryLimitBytes.getOptional("memory_limit_bytes")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun memoryUsedBytes(): Optional<Long> = memoryUsedBytes.getOptional("memory_used_bytes")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun poolsCount(): Optional<Long> = poolsCount.getOptional("pools_count")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registriesCount(): Optional<Long> = registriesCount.getOptional("registries_count")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sandboxDirectCount(): Optional<Long> =
        sandboxDirectCount.getOptional("sandbox_direct_count")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sandboxPoolReplicasCount(): Optional<Long> =
        sandboxPoolReplicasCount.getOptional("sandbox_pool_replicas_count")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sandboxRunningCount(): Optional<Long> =
        sandboxRunningCount.getOptional("sandbox_running_count")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sandboxStoppedCount(): Optional<Long> =
        sandboxStoppedCount.getOptional("sandbox_stopped_count")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sandboxesLimit(): Optional<Long> = sandboxesLimit.getOptional("sandboxes_limit")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sandboxesUsed(): Optional<Long> = sandboxesUsed.getOptional("sandboxes_used")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun snapshotsCount(): Optional<Long> = snapshotsCount.getOptional("snapshots_count")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templatesCount(): Optional<Long> = templatesCount.getOptional("templates_count")

    /**
     * Returns the raw JSON value of [cpuLimitMillicores].
     *
     * Unlike [cpuLimitMillicores], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cpu_limit_millicores")
    @ExcludeMissing
    fun _cpuLimitMillicores(): JsonField<Long> = cpuLimitMillicores

    /**
     * Returns the raw JSON value of [cpuUsedMillicores].
     *
     * Unlike [cpuUsedMillicores], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cpu_used_millicores")
    @ExcludeMissing
    fun _cpuUsedMillicores(): JsonField<Long> = cpuUsedMillicores

    /**
     * Returns the raw JSON value of [memoryLimitBytes].
     *
     * Unlike [memoryLimitBytes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("memory_limit_bytes")
    @ExcludeMissing
    fun _memoryLimitBytes(): JsonField<Long> = memoryLimitBytes

    /**
     * Returns the raw JSON value of [memoryUsedBytes].
     *
     * Unlike [memoryUsedBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("memory_used_bytes")
    @ExcludeMissing
    fun _memoryUsedBytes(): JsonField<Long> = memoryUsedBytes

    /**
     * Returns the raw JSON value of [poolsCount].
     *
     * Unlike [poolsCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pools_count") @ExcludeMissing fun _poolsCount(): JsonField<Long> = poolsCount

    /**
     * Returns the raw JSON value of [registriesCount].
     *
     * Unlike [registriesCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("registries_count")
    @ExcludeMissing
    fun _registriesCount(): JsonField<Long> = registriesCount

    /**
     * Returns the raw JSON value of [sandboxDirectCount].
     *
     * Unlike [sandboxDirectCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sandbox_direct_count")
    @ExcludeMissing
    fun _sandboxDirectCount(): JsonField<Long> = sandboxDirectCount

    /**
     * Returns the raw JSON value of [sandboxPoolReplicasCount].
     *
     * Unlike [sandboxPoolReplicasCount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sandbox_pool_replicas_count")
    @ExcludeMissing
    fun _sandboxPoolReplicasCount(): JsonField<Long> = sandboxPoolReplicasCount

    /**
     * Returns the raw JSON value of [sandboxRunningCount].
     *
     * Unlike [sandboxRunningCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sandbox_running_count")
    @ExcludeMissing
    fun _sandboxRunningCount(): JsonField<Long> = sandboxRunningCount

    /**
     * Returns the raw JSON value of [sandboxStoppedCount].
     *
     * Unlike [sandboxStoppedCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sandbox_stopped_count")
    @ExcludeMissing
    fun _sandboxStoppedCount(): JsonField<Long> = sandboxStoppedCount

    /**
     * Returns the raw JSON value of [sandboxesLimit].
     *
     * Unlike [sandboxesLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sandboxes_limit")
    @ExcludeMissing
    fun _sandboxesLimit(): JsonField<Long> = sandboxesLimit

    /**
     * Returns the raw JSON value of [sandboxesUsed].
     *
     * Unlike [sandboxesUsed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sandboxes_used")
    @ExcludeMissing
    fun _sandboxesUsed(): JsonField<Long> = sandboxesUsed

    /**
     * Returns the raw JSON value of [snapshotsCount].
     *
     * Unlike [snapshotsCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("snapshots_count")
    @ExcludeMissing
    fun _snapshotsCount(): JsonField<Long> = snapshotsCount

    /**
     * Returns the raw JSON value of [templatesCount].
     *
     * Unlike [templatesCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("templates_count")
    @ExcludeMissing
    fun _templatesCount(): JsonField<Long> = templatesCount

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
         * Returns a mutable builder for constructing an instance of [SandboxRetrieveUsageResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SandboxRetrieveUsageResponse]. */
    class Builder internal constructor() {

        private var cpuLimitMillicores: JsonField<Long> = JsonMissing.of()
        private var cpuUsedMillicores: JsonField<Long> = JsonMissing.of()
        private var memoryLimitBytes: JsonField<Long> = JsonMissing.of()
        private var memoryUsedBytes: JsonField<Long> = JsonMissing.of()
        private var poolsCount: JsonField<Long> = JsonMissing.of()
        private var registriesCount: JsonField<Long> = JsonMissing.of()
        private var sandboxDirectCount: JsonField<Long> = JsonMissing.of()
        private var sandboxPoolReplicasCount: JsonField<Long> = JsonMissing.of()
        private var sandboxRunningCount: JsonField<Long> = JsonMissing.of()
        private var sandboxStoppedCount: JsonField<Long> = JsonMissing.of()
        private var sandboxesLimit: JsonField<Long> = JsonMissing.of()
        private var sandboxesUsed: JsonField<Long> = JsonMissing.of()
        private var snapshotsCount: JsonField<Long> = JsonMissing.of()
        private var templatesCount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sandboxRetrieveUsageResponse: SandboxRetrieveUsageResponse) = apply {
            cpuLimitMillicores = sandboxRetrieveUsageResponse.cpuLimitMillicores
            cpuUsedMillicores = sandboxRetrieveUsageResponse.cpuUsedMillicores
            memoryLimitBytes = sandboxRetrieveUsageResponse.memoryLimitBytes
            memoryUsedBytes = sandboxRetrieveUsageResponse.memoryUsedBytes
            poolsCount = sandboxRetrieveUsageResponse.poolsCount
            registriesCount = sandboxRetrieveUsageResponse.registriesCount
            sandboxDirectCount = sandboxRetrieveUsageResponse.sandboxDirectCount
            sandboxPoolReplicasCount = sandboxRetrieveUsageResponse.sandboxPoolReplicasCount
            sandboxRunningCount = sandboxRetrieveUsageResponse.sandboxRunningCount
            sandboxStoppedCount = sandboxRetrieveUsageResponse.sandboxStoppedCount
            sandboxesLimit = sandboxRetrieveUsageResponse.sandboxesLimit
            sandboxesUsed = sandboxRetrieveUsageResponse.sandboxesUsed
            snapshotsCount = sandboxRetrieveUsageResponse.snapshotsCount
            templatesCount = sandboxRetrieveUsageResponse.templatesCount
            additionalProperties = sandboxRetrieveUsageResponse.additionalProperties.toMutableMap()
        }

        fun cpuLimitMillicores(cpuLimitMillicores: Long) =
            cpuLimitMillicores(JsonField.of(cpuLimitMillicores))

        /**
         * Sets [Builder.cpuLimitMillicores] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cpuLimitMillicores] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cpuLimitMillicores(cpuLimitMillicores: JsonField<Long>) = apply {
            this.cpuLimitMillicores = cpuLimitMillicores
        }

        fun cpuUsedMillicores(cpuUsedMillicores: Long) =
            cpuUsedMillicores(JsonField.of(cpuUsedMillicores))

        /**
         * Sets [Builder.cpuUsedMillicores] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cpuUsedMillicores] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cpuUsedMillicores(cpuUsedMillicores: JsonField<Long>) = apply {
            this.cpuUsedMillicores = cpuUsedMillicores
        }

        fun memoryLimitBytes(memoryLimitBytes: Long) =
            memoryLimitBytes(JsonField.of(memoryLimitBytes))

        /**
         * Sets [Builder.memoryLimitBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memoryLimitBytes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun memoryLimitBytes(memoryLimitBytes: JsonField<Long>) = apply {
            this.memoryLimitBytes = memoryLimitBytes
        }

        fun memoryUsedBytes(memoryUsedBytes: Long) = memoryUsedBytes(JsonField.of(memoryUsedBytes))

        /**
         * Sets [Builder.memoryUsedBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memoryUsedBytes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun memoryUsedBytes(memoryUsedBytes: JsonField<Long>) = apply {
            this.memoryUsedBytes = memoryUsedBytes
        }

        fun poolsCount(poolsCount: Long) = poolsCount(JsonField.of(poolsCount))

        /**
         * Sets [Builder.poolsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.poolsCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun poolsCount(poolsCount: JsonField<Long>) = apply { this.poolsCount = poolsCount }

        fun registriesCount(registriesCount: Long) = registriesCount(JsonField.of(registriesCount))

        /**
         * Sets [Builder.registriesCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registriesCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun registriesCount(registriesCount: JsonField<Long>) = apply {
            this.registriesCount = registriesCount
        }

        fun sandboxDirectCount(sandboxDirectCount: Long) =
            sandboxDirectCount(JsonField.of(sandboxDirectCount))

        /**
         * Sets [Builder.sandboxDirectCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sandboxDirectCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sandboxDirectCount(sandboxDirectCount: JsonField<Long>) = apply {
            this.sandboxDirectCount = sandboxDirectCount
        }

        fun sandboxPoolReplicasCount(sandboxPoolReplicasCount: Long) =
            sandboxPoolReplicasCount(JsonField.of(sandboxPoolReplicasCount))

        /**
         * Sets [Builder.sandboxPoolReplicasCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sandboxPoolReplicasCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sandboxPoolReplicasCount(sandboxPoolReplicasCount: JsonField<Long>) = apply {
            this.sandboxPoolReplicasCount = sandboxPoolReplicasCount
        }

        fun sandboxRunningCount(sandboxRunningCount: Long) =
            sandboxRunningCount(JsonField.of(sandboxRunningCount))

        /**
         * Sets [Builder.sandboxRunningCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sandboxRunningCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sandboxRunningCount(sandboxRunningCount: JsonField<Long>) = apply {
            this.sandboxRunningCount = sandboxRunningCount
        }

        fun sandboxStoppedCount(sandboxStoppedCount: Long) =
            sandboxStoppedCount(JsonField.of(sandboxStoppedCount))

        /**
         * Sets [Builder.sandboxStoppedCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sandboxStoppedCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sandboxStoppedCount(sandboxStoppedCount: JsonField<Long>) = apply {
            this.sandboxStoppedCount = sandboxStoppedCount
        }

        fun sandboxesLimit(sandboxesLimit: Long) = sandboxesLimit(JsonField.of(sandboxesLimit))

        /**
         * Sets [Builder.sandboxesLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sandboxesLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sandboxesLimit(sandboxesLimit: JsonField<Long>) = apply {
            this.sandboxesLimit = sandboxesLimit
        }

        fun sandboxesUsed(sandboxesUsed: Long) = sandboxesUsed(JsonField.of(sandboxesUsed))

        /**
         * Sets [Builder.sandboxesUsed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sandboxesUsed] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sandboxesUsed(sandboxesUsed: JsonField<Long>) = apply {
            this.sandboxesUsed = sandboxesUsed
        }

        fun snapshotsCount(snapshotsCount: Long) = snapshotsCount(JsonField.of(snapshotsCount))

        /**
         * Sets [Builder.snapshotsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snapshotsCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun snapshotsCount(snapshotsCount: JsonField<Long>) = apply {
            this.snapshotsCount = snapshotsCount
        }

        fun templatesCount(templatesCount: Long) = templatesCount(JsonField.of(templatesCount))

        /**
         * Sets [Builder.templatesCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templatesCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templatesCount(templatesCount: JsonField<Long>) = apply {
            this.templatesCount = templatesCount
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
         * Returns an immutable instance of [SandboxRetrieveUsageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SandboxRetrieveUsageResponse =
            SandboxRetrieveUsageResponse(
                cpuLimitMillicores,
                cpuUsedMillicores,
                memoryLimitBytes,
                memoryUsedBytes,
                poolsCount,
                registriesCount,
                sandboxDirectCount,
                sandboxPoolReplicasCount,
                sandboxRunningCount,
                sandboxStoppedCount,
                sandboxesLimit,
                sandboxesUsed,
                snapshotsCount,
                templatesCount,
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
    fun validate(): SandboxRetrieveUsageResponse = apply {
        if (validated) {
            return@apply
        }

        cpuLimitMillicores()
        cpuUsedMillicores()
        memoryLimitBytes()
        memoryUsedBytes()
        poolsCount()
        registriesCount()
        sandboxDirectCount()
        sandboxPoolReplicasCount()
        sandboxRunningCount()
        sandboxStoppedCount()
        sandboxesLimit()
        sandboxesUsed()
        snapshotsCount()
        templatesCount()
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
        (if (cpuLimitMillicores.asKnown().isPresent) 1 else 0) +
            (if (cpuUsedMillicores.asKnown().isPresent) 1 else 0) +
            (if (memoryLimitBytes.asKnown().isPresent) 1 else 0) +
            (if (memoryUsedBytes.asKnown().isPresent) 1 else 0) +
            (if (poolsCount.asKnown().isPresent) 1 else 0) +
            (if (registriesCount.asKnown().isPresent) 1 else 0) +
            (if (sandboxDirectCount.asKnown().isPresent) 1 else 0) +
            (if (sandboxPoolReplicasCount.asKnown().isPresent) 1 else 0) +
            (if (sandboxRunningCount.asKnown().isPresent) 1 else 0) +
            (if (sandboxStoppedCount.asKnown().isPresent) 1 else 0) +
            (if (sandboxesLimit.asKnown().isPresent) 1 else 0) +
            (if (sandboxesUsed.asKnown().isPresent) 1 else 0) +
            (if (snapshotsCount.asKnown().isPresent) 1 else 0) +
            (if (templatesCount.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SandboxRetrieveUsageResponse &&
            cpuLimitMillicores == other.cpuLimitMillicores &&
            cpuUsedMillicores == other.cpuUsedMillicores &&
            memoryLimitBytes == other.memoryLimitBytes &&
            memoryUsedBytes == other.memoryUsedBytes &&
            poolsCount == other.poolsCount &&
            registriesCount == other.registriesCount &&
            sandboxDirectCount == other.sandboxDirectCount &&
            sandboxPoolReplicasCount == other.sandboxPoolReplicasCount &&
            sandboxRunningCount == other.sandboxRunningCount &&
            sandboxStoppedCount == other.sandboxStoppedCount &&
            sandboxesLimit == other.sandboxesLimit &&
            sandboxesUsed == other.sandboxesUsed &&
            snapshotsCount == other.snapshotsCount &&
            templatesCount == other.templatesCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            cpuLimitMillicores,
            cpuUsedMillicores,
            memoryLimitBytes,
            memoryUsedBytes,
            poolsCount,
            registriesCount,
            sandboxDirectCount,
            sandboxPoolReplicasCount,
            sandboxRunningCount,
            sandboxStoppedCount,
            sandboxesLimit,
            sandboxesUsed,
            snapshotsCount,
            templatesCount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SandboxRetrieveUsageResponse{cpuLimitMillicores=$cpuLimitMillicores, cpuUsedMillicores=$cpuUsedMillicores, memoryLimitBytes=$memoryLimitBytes, memoryUsedBytes=$memoryUsedBytes, poolsCount=$poolsCount, registriesCount=$registriesCount, sandboxDirectCount=$sandboxDirectCount, sandboxPoolReplicasCount=$sandboxPoolReplicasCount, sandboxRunningCount=$sandboxRunningCount, sandboxStoppedCount=$sandboxStoppedCount, sandboxesLimit=$sandboxesLimit, sandboxesUsed=$sandboxesUsed, snapshotsCount=$snapshotsCount, templatesCount=$templatesCount, additionalProperties=$additionalProperties}"
}
