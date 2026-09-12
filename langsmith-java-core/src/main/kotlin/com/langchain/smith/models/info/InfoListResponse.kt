// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.info

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InfoListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val batchIngestConfig: JsonField<BatchIngestConfig>,
    private val billingInstallationId: JsonField<String>,
    private val customerInfo: JsonField<CustomerInfo>,
    private val gitSha: JsonField<String>,
    private val instanceFlags: JsonField<InstanceFlags>,
    private val licenseExpirationTime: JsonField<String>,
    private val sdkVersions: JsonField<SdkVersions>,
    private val version: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("batch_ingest_config")
        @ExcludeMissing
        batchIngestConfig: JsonField<BatchIngestConfig> = JsonMissing.of(),
        @JsonProperty("billing_installation_id")
        @ExcludeMissing
        billingInstallationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_info")
        @ExcludeMissing
        customerInfo: JsonField<CustomerInfo> = JsonMissing.of(),
        @JsonProperty("git_sha") @ExcludeMissing gitSha: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instance_flags")
        @ExcludeMissing
        instanceFlags: JsonField<InstanceFlags> = JsonMissing.of(),
        @JsonProperty("license_expiration_time")
        @ExcludeMissing
        licenseExpirationTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sdk_versions")
        @ExcludeMissing
        sdkVersions: JsonField<SdkVersions> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
    ) : this(
        batchIngestConfig,
        billingInstallationId,
        customerInfo,
        gitSha,
        instanceFlags,
        licenseExpirationTime,
        sdkVersions,
        version,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun batchIngestConfig(): Optional<BatchIngestConfig> =
        batchIngestConfig.getOptional("batch_ingest_config")

    /**
     * BillingInstallationID is the persistent per-installation identity for self-hosted
     * deployments.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingInstallationId(): Optional<String> =
        billingInstallationId.getOptional("billing_installation_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerInfo(): Optional<CustomerInfo> = customerInfo.getOptional("customer_info")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gitSha(): Optional<String> = gitSha.getOptional("git_sha")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instanceFlags(): Optional<InstanceFlags> = instanceFlags.getOptional("instance_flags")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun licenseExpirationTime(): Optional<String> =
        licenseExpirationTime.getOptional("license_expiration_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sdkVersions(): Optional<SdkVersions> = sdkVersions.getOptional("sdk_versions")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<String> = version.getOptional("version")

    /**
     * Returns the raw JSON value of [batchIngestConfig].
     *
     * Unlike [batchIngestConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("batch_ingest_config")
    @ExcludeMissing
    fun _batchIngestConfig(): JsonField<BatchIngestConfig> = batchIngestConfig

    /**
     * Returns the raw JSON value of [billingInstallationId].
     *
     * Unlike [billingInstallationId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("billing_installation_id")
    @ExcludeMissing
    fun _billingInstallationId(): JsonField<String> = billingInstallationId

    /**
     * Returns the raw JSON value of [customerInfo].
     *
     * Unlike [customerInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_info")
    @ExcludeMissing
    fun _customerInfo(): JsonField<CustomerInfo> = customerInfo

    /**
     * Returns the raw JSON value of [gitSha].
     *
     * Unlike [gitSha], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("git_sha") @ExcludeMissing fun _gitSha(): JsonField<String> = gitSha

    /**
     * Returns the raw JSON value of [instanceFlags].
     *
     * Unlike [instanceFlags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instance_flags")
    @ExcludeMissing
    fun _instanceFlags(): JsonField<InstanceFlags> = instanceFlags

    /**
     * Returns the raw JSON value of [licenseExpirationTime].
     *
     * Unlike [licenseExpirationTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("license_expiration_time")
    @ExcludeMissing
    fun _licenseExpirationTime(): JsonField<String> = licenseExpirationTime

    /**
     * Returns the raw JSON value of [sdkVersions].
     *
     * Unlike [sdkVersions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sdk_versions")
    @ExcludeMissing
    fun _sdkVersions(): JsonField<SdkVersions> = sdkVersions

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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

        /** Returns a mutable builder for constructing an instance of [InfoListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InfoListResponse]. */
    class Builder internal constructor() {

        private var batchIngestConfig: JsonField<BatchIngestConfig> = JsonMissing.of()
        private var billingInstallationId: JsonField<String> = JsonMissing.of()
        private var customerInfo: JsonField<CustomerInfo> = JsonMissing.of()
        private var gitSha: JsonField<String> = JsonMissing.of()
        private var instanceFlags: JsonField<InstanceFlags> = JsonMissing.of()
        private var licenseExpirationTime: JsonField<String> = JsonMissing.of()
        private var sdkVersions: JsonField<SdkVersions> = JsonMissing.of()
        private var version: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(infoListResponse: InfoListResponse) = apply {
            batchIngestConfig = infoListResponse.batchIngestConfig
            billingInstallationId = infoListResponse.billingInstallationId
            customerInfo = infoListResponse.customerInfo
            gitSha = infoListResponse.gitSha
            instanceFlags = infoListResponse.instanceFlags
            licenseExpirationTime = infoListResponse.licenseExpirationTime
            sdkVersions = infoListResponse.sdkVersions
            version = infoListResponse.version
            additionalProperties = infoListResponse.additionalProperties.toMutableMap()
        }

        fun batchIngestConfig(batchIngestConfig: BatchIngestConfig) =
            batchIngestConfig(JsonField.of(batchIngestConfig))

        /**
         * Sets [Builder.batchIngestConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.batchIngestConfig] with a well-typed [BatchIngestConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun batchIngestConfig(batchIngestConfig: JsonField<BatchIngestConfig>) = apply {
            this.batchIngestConfig = batchIngestConfig
        }

        /**
         * BillingInstallationID is the persistent per-installation identity for self-hosted
         * deployments.
         */
        fun billingInstallationId(billingInstallationId: String) =
            billingInstallationId(JsonField.of(billingInstallationId))

        /**
         * Sets [Builder.billingInstallationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingInstallationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingInstallationId(billingInstallationId: JsonField<String>) = apply {
            this.billingInstallationId = billingInstallationId
        }

        fun customerInfo(customerInfo: CustomerInfo) = customerInfo(JsonField.of(customerInfo))

        /**
         * Sets [Builder.customerInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerInfo] with a well-typed [CustomerInfo] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerInfo(customerInfo: JsonField<CustomerInfo>) = apply {
            this.customerInfo = customerInfo
        }

        fun gitSha(gitSha: String) = gitSha(JsonField.of(gitSha))

        /**
         * Sets [Builder.gitSha] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gitSha] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gitSha(gitSha: JsonField<String>) = apply { this.gitSha = gitSha }

        fun instanceFlags(instanceFlags: InstanceFlags) = instanceFlags(JsonField.of(instanceFlags))

        /**
         * Sets [Builder.instanceFlags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instanceFlags] with a well-typed [InstanceFlags] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instanceFlags(instanceFlags: JsonField<InstanceFlags>) = apply {
            this.instanceFlags = instanceFlags
        }

        fun licenseExpirationTime(licenseExpirationTime: String) =
            licenseExpirationTime(JsonField.of(licenseExpirationTime))

        /**
         * Sets [Builder.licenseExpirationTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseExpirationTime] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun licenseExpirationTime(licenseExpirationTime: JsonField<String>) = apply {
            this.licenseExpirationTime = licenseExpirationTime
        }

        fun sdkVersions(sdkVersions: SdkVersions) = sdkVersions(JsonField.of(sdkVersions))

        /**
         * Sets [Builder.sdkVersions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sdkVersions] with a well-typed [SdkVersions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sdkVersions(sdkVersions: JsonField<SdkVersions>) = apply {
            this.sdkVersions = sdkVersions
        }

        fun version(version: String) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<String>) = apply { this.version = version }

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
         * Returns an immutable instance of [InfoListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InfoListResponse =
            InfoListResponse(
                batchIngestConfig,
                billingInstallationId,
                customerInfo,
                gitSha,
                instanceFlags,
                licenseExpirationTime,
                sdkVersions,
                version,
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
    fun validate(): InfoListResponse = apply {
        if (validated) {
            return@apply
        }

        batchIngestConfig().ifPresent { it.validate() }
        billingInstallationId()
        customerInfo().ifPresent { it.validate() }
        gitSha()
        instanceFlags().ifPresent { it.validate() }
        licenseExpirationTime()
        sdkVersions().ifPresent { it.validate() }
        version()
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
        (batchIngestConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (billingInstallationId.asKnown().isPresent) 1 else 0) +
            (customerInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (gitSha.asKnown().isPresent) 1 else 0) +
            (instanceFlags.asKnown().getOrNull()?.validity() ?: 0) +
            (if (licenseExpirationTime.asKnown().isPresent) 1 else 0) +
            (sdkVersions.asKnown().getOrNull()?.validity() ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    class BatchIngestConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val scaleDownNemptyTrigger: JsonField<Long>,
        private val scaleUpNthreadsLimit: JsonField<Long>,
        private val scaleUpQsizeTrigger: JsonField<Long>,
        private val sizeLimit: JsonField<Long>,
        private val sizeLimitBytes: JsonField<Long>,
        private val useMultipartEndpoint: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("scale_down_nempty_trigger")
            @ExcludeMissing
            scaleDownNemptyTrigger: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("scale_up_nthreads_limit")
            @ExcludeMissing
            scaleUpNthreadsLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("scale_up_qsize_trigger")
            @ExcludeMissing
            scaleUpQsizeTrigger: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("size_limit")
            @ExcludeMissing
            sizeLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("size_limit_bytes")
            @ExcludeMissing
            sizeLimitBytes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("use_multipart_endpoint")
            @ExcludeMissing
            useMultipartEndpoint: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            scaleDownNemptyTrigger,
            scaleUpNthreadsLimit,
            scaleUpQsizeTrigger,
            sizeLimit,
            sizeLimitBytes,
            useMultipartEndpoint,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scaleDownNemptyTrigger(): Optional<Long> =
            scaleDownNemptyTrigger.getOptional("scale_down_nempty_trigger")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scaleUpNthreadsLimit(): Optional<Long> =
            scaleUpNthreadsLimit.getOptional("scale_up_nthreads_limit")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scaleUpQsizeTrigger(): Optional<Long> =
            scaleUpQsizeTrigger.getOptional("scale_up_qsize_trigger")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sizeLimit(): Optional<Long> = sizeLimit.getOptional("size_limit")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sizeLimitBytes(): Optional<Long> = sizeLimitBytes.getOptional("size_limit_bytes")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun useMultipartEndpoint(): Optional<Boolean> =
            useMultipartEndpoint.getOptional("use_multipart_endpoint")

        /**
         * Returns the raw JSON value of [scaleDownNemptyTrigger].
         *
         * Unlike [scaleDownNemptyTrigger], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("scale_down_nempty_trigger")
        @ExcludeMissing
        fun _scaleDownNemptyTrigger(): JsonField<Long> = scaleDownNemptyTrigger

        /**
         * Returns the raw JSON value of [scaleUpNthreadsLimit].
         *
         * Unlike [scaleUpNthreadsLimit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("scale_up_nthreads_limit")
        @ExcludeMissing
        fun _scaleUpNthreadsLimit(): JsonField<Long> = scaleUpNthreadsLimit

        /**
         * Returns the raw JSON value of [scaleUpQsizeTrigger].
         *
         * Unlike [scaleUpQsizeTrigger], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("scale_up_qsize_trigger")
        @ExcludeMissing
        fun _scaleUpQsizeTrigger(): JsonField<Long> = scaleUpQsizeTrigger

        /**
         * Returns the raw JSON value of [sizeLimit].
         *
         * Unlike [sizeLimit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("size_limit") @ExcludeMissing fun _sizeLimit(): JsonField<Long> = sizeLimit

        /**
         * Returns the raw JSON value of [sizeLimitBytes].
         *
         * Unlike [sizeLimitBytes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("size_limit_bytes")
        @ExcludeMissing
        fun _sizeLimitBytes(): JsonField<Long> = sizeLimitBytes

        /**
         * Returns the raw JSON value of [useMultipartEndpoint].
         *
         * Unlike [useMultipartEndpoint], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("use_multipart_endpoint")
        @ExcludeMissing
        fun _useMultipartEndpoint(): JsonField<Boolean> = useMultipartEndpoint

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

            /** Returns a mutable builder for constructing an instance of [BatchIngestConfig]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BatchIngestConfig]. */
        class Builder internal constructor() {

            private var scaleDownNemptyTrigger: JsonField<Long> = JsonMissing.of()
            private var scaleUpNthreadsLimit: JsonField<Long> = JsonMissing.of()
            private var scaleUpQsizeTrigger: JsonField<Long> = JsonMissing.of()
            private var sizeLimit: JsonField<Long> = JsonMissing.of()
            private var sizeLimitBytes: JsonField<Long> = JsonMissing.of()
            private var useMultipartEndpoint: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(batchIngestConfig: BatchIngestConfig) = apply {
                scaleDownNemptyTrigger = batchIngestConfig.scaleDownNemptyTrigger
                scaleUpNthreadsLimit = batchIngestConfig.scaleUpNthreadsLimit
                scaleUpQsizeTrigger = batchIngestConfig.scaleUpQsizeTrigger
                sizeLimit = batchIngestConfig.sizeLimit
                sizeLimitBytes = batchIngestConfig.sizeLimitBytes
                useMultipartEndpoint = batchIngestConfig.useMultipartEndpoint
                additionalProperties = batchIngestConfig.additionalProperties.toMutableMap()
            }

            fun scaleDownNemptyTrigger(scaleDownNemptyTrigger: Long) =
                scaleDownNemptyTrigger(JsonField.of(scaleDownNemptyTrigger))

            /**
             * Sets [Builder.scaleDownNemptyTrigger] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scaleDownNemptyTrigger] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun scaleDownNemptyTrigger(scaleDownNemptyTrigger: JsonField<Long>) = apply {
                this.scaleDownNemptyTrigger = scaleDownNemptyTrigger
            }

            fun scaleUpNthreadsLimit(scaleUpNthreadsLimit: Long) =
                scaleUpNthreadsLimit(JsonField.of(scaleUpNthreadsLimit))

            /**
             * Sets [Builder.scaleUpNthreadsLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scaleUpNthreadsLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scaleUpNthreadsLimit(scaleUpNthreadsLimit: JsonField<Long>) = apply {
                this.scaleUpNthreadsLimit = scaleUpNthreadsLimit
            }

            fun scaleUpQsizeTrigger(scaleUpQsizeTrigger: Long) =
                scaleUpQsizeTrigger(JsonField.of(scaleUpQsizeTrigger))

            /**
             * Sets [Builder.scaleUpQsizeTrigger] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scaleUpQsizeTrigger] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scaleUpQsizeTrigger(scaleUpQsizeTrigger: JsonField<Long>) = apply {
                this.scaleUpQsizeTrigger = scaleUpQsizeTrigger
            }

            fun sizeLimit(sizeLimit: Long) = sizeLimit(JsonField.of(sizeLimit))

            /**
             * Sets [Builder.sizeLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sizeLimit] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sizeLimit(sizeLimit: JsonField<Long>) = apply { this.sizeLimit = sizeLimit }

            fun sizeLimitBytes(sizeLimitBytes: Long) = sizeLimitBytes(JsonField.of(sizeLimitBytes))

            /**
             * Sets [Builder.sizeLimitBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sizeLimitBytes] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sizeLimitBytes(sizeLimitBytes: JsonField<Long>) = apply {
                this.sizeLimitBytes = sizeLimitBytes
            }

            fun useMultipartEndpoint(useMultipartEndpoint: Boolean) =
                useMultipartEndpoint(JsonField.of(useMultipartEndpoint))

            /**
             * Sets [Builder.useMultipartEndpoint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useMultipartEndpoint] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun useMultipartEndpoint(useMultipartEndpoint: JsonField<Boolean>) = apply {
                this.useMultipartEndpoint = useMultipartEndpoint
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
             * Returns an immutable instance of [BatchIngestConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BatchIngestConfig =
                BatchIngestConfig(
                    scaleDownNemptyTrigger,
                    scaleUpNthreadsLimit,
                    scaleUpQsizeTrigger,
                    sizeLimit,
                    sizeLimitBytes,
                    useMultipartEndpoint,
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
        fun validate(): BatchIngestConfig = apply {
            if (validated) {
                return@apply
            }

            scaleDownNemptyTrigger()
            scaleUpNthreadsLimit()
            scaleUpQsizeTrigger()
            sizeLimit()
            sizeLimitBytes()
            useMultipartEndpoint()
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
            (if (scaleDownNemptyTrigger.asKnown().isPresent) 1 else 0) +
                (if (scaleUpNthreadsLimit.asKnown().isPresent) 1 else 0) +
                (if (scaleUpQsizeTrigger.asKnown().isPresent) 1 else 0) +
                (if (sizeLimit.asKnown().isPresent) 1 else 0) +
                (if (sizeLimitBytes.asKnown().isPresent) 1 else 0) +
                (if (useMultipartEndpoint.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BatchIngestConfig &&
                scaleDownNemptyTrigger == other.scaleDownNemptyTrigger &&
                scaleUpNthreadsLimit == other.scaleUpNthreadsLimit &&
                scaleUpQsizeTrigger == other.scaleUpQsizeTrigger &&
                sizeLimit == other.sizeLimit &&
                sizeLimitBytes == other.sizeLimitBytes &&
                useMultipartEndpoint == other.useMultipartEndpoint &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                scaleDownNemptyTrigger,
                scaleUpNthreadsLimit,
                scaleUpQsizeTrigger,
                sizeLimit,
                sizeLimitBytes,
                useMultipartEndpoint,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BatchIngestConfig{scaleDownNemptyTrigger=$scaleDownNemptyTrigger, scaleUpNthreadsLimit=$scaleUpNthreadsLimit, scaleUpQsizeTrigger=$scaleUpQsizeTrigger, sizeLimit=$sizeLimit, sizeLimitBytes=$sizeLimitBytes, useMultipartEndpoint=$useMultipartEndpoint, additionalProperties=$additionalProperties}"
    }

    class CustomerInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customerId: JsonField<String>,
        private val customerName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_name")
            @ExcludeMissing
            customerName: JsonField<String> = JsonMissing.of(),
        ) : this(customerId, customerName, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customerId(): Optional<String> = customerId.getOptional("customer_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customerName(): Optional<String> = customerName.getOptional("customer_name")

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [customerName].
         *
         * Unlike [customerName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_name")
        @ExcludeMissing
        fun _customerName(): JsonField<String> = customerName

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

            /** Returns a mutable builder for constructing an instance of [CustomerInfo]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomerInfo]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String> = JsonMissing.of()
            private var customerName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerInfo: CustomerInfo) = apply {
                customerId = customerInfo.customerId
                customerName = customerInfo.customerName
                additionalProperties = customerInfo.additionalProperties.toMutableMap()
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun customerName(customerName: String) = customerName(JsonField.of(customerName))

            /**
             * Sets [Builder.customerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerName(customerName: JsonField<String>) = apply {
                this.customerName = customerName
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
             * Returns an immutable instance of [CustomerInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomerInfo =
                CustomerInfo(customerId, customerName, additionalProperties.toMutableMap())
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
        fun validate(): CustomerInfo = apply {
            if (validated) {
                return@apply
            }

            customerId()
            customerName()
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
            (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (customerName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomerInfo &&
                customerId == other.customerId &&
                customerName == other.customerName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(customerId, customerName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerInfo{customerId=$customerId, customerName=$customerName, additionalProperties=$additionalProperties}"
    }

    class InstanceFlags
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

            /** Returns a mutable builder for constructing an instance of [InstanceFlags]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InstanceFlags]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(instanceFlags: InstanceFlags) = apply {
                additionalProperties = instanceFlags.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [InstanceFlags].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InstanceFlags = InstanceFlags(additionalProperties.toImmutable())
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
        fun validate(): InstanceFlags = apply {
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

            return other is InstanceFlags && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "InstanceFlags{additionalProperties=$additionalProperties}"
    }

    class SdkVersions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val maxGoSdkVersion: JsonField<String>,
        private val maxJavaSdkVersion: JsonField<String>,
        private val maxJsSdkVersion: JsonField<String>,
        private val maxPythonSdkVersion: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("max_go_sdk_version")
            @ExcludeMissing
            maxGoSdkVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_java_sdk_version")
            @ExcludeMissing
            maxJavaSdkVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_js_sdk_version")
            @ExcludeMissing
            maxJsSdkVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_python_sdk_version")
            @ExcludeMissing
            maxPythonSdkVersion: JsonField<String> = JsonMissing.of(),
        ) : this(
            maxGoSdkVersion,
            maxJavaSdkVersion,
            maxJsSdkVersion,
            maxPythonSdkVersion,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxGoSdkVersion(): Optional<String> = maxGoSdkVersion.getOptional("max_go_sdk_version")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxJavaSdkVersion(): Optional<String> =
            maxJavaSdkVersion.getOptional("max_java_sdk_version")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxJsSdkVersion(): Optional<String> = maxJsSdkVersion.getOptional("max_js_sdk_version")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxPythonSdkVersion(): Optional<String> =
            maxPythonSdkVersion.getOptional("max_python_sdk_version")

        /**
         * Returns the raw JSON value of [maxGoSdkVersion].
         *
         * Unlike [maxGoSdkVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_go_sdk_version")
        @ExcludeMissing
        fun _maxGoSdkVersion(): JsonField<String> = maxGoSdkVersion

        /**
         * Returns the raw JSON value of [maxJavaSdkVersion].
         *
         * Unlike [maxJavaSdkVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_java_sdk_version")
        @ExcludeMissing
        fun _maxJavaSdkVersion(): JsonField<String> = maxJavaSdkVersion

        /**
         * Returns the raw JSON value of [maxJsSdkVersion].
         *
         * Unlike [maxJsSdkVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_js_sdk_version")
        @ExcludeMissing
        fun _maxJsSdkVersion(): JsonField<String> = maxJsSdkVersion

        /**
         * Returns the raw JSON value of [maxPythonSdkVersion].
         *
         * Unlike [maxPythonSdkVersion], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("max_python_sdk_version")
        @ExcludeMissing
        fun _maxPythonSdkVersion(): JsonField<String> = maxPythonSdkVersion

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

            /** Returns a mutable builder for constructing an instance of [SdkVersions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SdkVersions]. */
        class Builder internal constructor() {

            private var maxGoSdkVersion: JsonField<String> = JsonMissing.of()
            private var maxJavaSdkVersion: JsonField<String> = JsonMissing.of()
            private var maxJsSdkVersion: JsonField<String> = JsonMissing.of()
            private var maxPythonSdkVersion: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sdkVersions: SdkVersions) = apply {
                maxGoSdkVersion = sdkVersions.maxGoSdkVersion
                maxJavaSdkVersion = sdkVersions.maxJavaSdkVersion
                maxJsSdkVersion = sdkVersions.maxJsSdkVersion
                maxPythonSdkVersion = sdkVersions.maxPythonSdkVersion
                additionalProperties = sdkVersions.additionalProperties.toMutableMap()
            }

            fun maxGoSdkVersion(maxGoSdkVersion: String) =
                maxGoSdkVersion(JsonField.of(maxGoSdkVersion))

            /**
             * Sets [Builder.maxGoSdkVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxGoSdkVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxGoSdkVersion(maxGoSdkVersion: JsonField<String>) = apply {
                this.maxGoSdkVersion = maxGoSdkVersion
            }

            fun maxJavaSdkVersion(maxJavaSdkVersion: String) =
                maxJavaSdkVersion(JsonField.of(maxJavaSdkVersion))

            /**
             * Sets [Builder.maxJavaSdkVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxJavaSdkVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxJavaSdkVersion(maxJavaSdkVersion: JsonField<String>) = apply {
                this.maxJavaSdkVersion = maxJavaSdkVersion
            }

            fun maxJsSdkVersion(maxJsSdkVersion: String) =
                maxJsSdkVersion(JsonField.of(maxJsSdkVersion))

            /**
             * Sets [Builder.maxJsSdkVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxJsSdkVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxJsSdkVersion(maxJsSdkVersion: JsonField<String>) = apply {
                this.maxJsSdkVersion = maxJsSdkVersion
            }

            fun maxPythonSdkVersion(maxPythonSdkVersion: String) =
                maxPythonSdkVersion(JsonField.of(maxPythonSdkVersion))

            /**
             * Sets [Builder.maxPythonSdkVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxPythonSdkVersion] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun maxPythonSdkVersion(maxPythonSdkVersion: JsonField<String>) = apply {
                this.maxPythonSdkVersion = maxPythonSdkVersion
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
             * Returns an immutable instance of [SdkVersions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SdkVersions =
                SdkVersions(
                    maxGoSdkVersion,
                    maxJavaSdkVersion,
                    maxJsSdkVersion,
                    maxPythonSdkVersion,
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
        fun validate(): SdkVersions = apply {
            if (validated) {
                return@apply
            }

            maxGoSdkVersion()
            maxJavaSdkVersion()
            maxJsSdkVersion()
            maxPythonSdkVersion()
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
            (if (maxGoSdkVersion.asKnown().isPresent) 1 else 0) +
                (if (maxJavaSdkVersion.asKnown().isPresent) 1 else 0) +
                (if (maxJsSdkVersion.asKnown().isPresent) 1 else 0) +
                (if (maxPythonSdkVersion.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SdkVersions &&
                maxGoSdkVersion == other.maxGoSdkVersion &&
                maxJavaSdkVersion == other.maxJavaSdkVersion &&
                maxJsSdkVersion == other.maxJsSdkVersion &&
                maxPythonSdkVersion == other.maxPythonSdkVersion &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                maxGoSdkVersion,
                maxJavaSdkVersion,
                maxJsSdkVersion,
                maxPythonSdkVersion,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SdkVersions{maxGoSdkVersion=$maxGoSdkVersion, maxJavaSdkVersion=$maxJavaSdkVersion, maxJsSdkVersion=$maxJsSdkVersion, maxPythonSdkVersion=$maxPythonSdkVersion, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InfoListResponse &&
            batchIngestConfig == other.batchIngestConfig &&
            billingInstallationId == other.billingInstallationId &&
            customerInfo == other.customerInfo &&
            gitSha == other.gitSha &&
            instanceFlags == other.instanceFlags &&
            licenseExpirationTime == other.licenseExpirationTime &&
            sdkVersions == other.sdkVersions &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            batchIngestConfig,
            billingInstallationId,
            customerInfo,
            gitSha,
            instanceFlags,
            licenseExpirationTime,
            sdkVersions,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InfoListResponse{batchIngestConfig=$batchIngestConfig, billingInstallationId=$billingInstallationId, customerInfo=$customerInfo, gitSha=$gitSha, instanceFlags=$instanceFlags, licenseExpirationTime=$licenseExpirationTime, sdkVersions=$sdkVersions, version=$version, additionalProperties=$additionalProperties}"
}
