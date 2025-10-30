// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.info

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The LangSmith server info. */
class InfoListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val version: JsonField<String>,
    private val batchIngestConfig: JsonField<BatchIngestConfig>,
    private val customerInfo: JsonField<CustomerInfo>,
    private val instanceFlags: JsonValue,
    private val licenseExpirationTime: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
        @JsonProperty("batch_ingest_config")
        @ExcludeMissing
        batchIngestConfig: JsonField<BatchIngestConfig> = JsonMissing.of(),
        @JsonProperty("customer_info")
        @ExcludeMissing
        customerInfo: JsonField<CustomerInfo> = JsonMissing.of(),
        @JsonProperty("instance_flags") @ExcludeMissing instanceFlags: JsonValue = JsonMissing.of(),
        @JsonProperty("license_expiration_time")
        @ExcludeMissing
        licenseExpirationTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        version,
        batchIngestConfig,
        customerInfo,
        instanceFlags,
        licenseExpirationTime,
        mutableMapOf(),
    )

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): String = version.getRequired("version")

    /**
     * Batch ingest config.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun batchIngestConfig(): Optional<BatchIngestConfig> =
        batchIngestConfig.getOptional("batch_ingest_config")

    /**
     * Customer info.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customerInfo(): Optional<CustomerInfo> = customerInfo.getOptional("customer_info")

    @JsonProperty("instance_flags") @ExcludeMissing fun _instanceFlags(): JsonValue = instanceFlags

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun licenseExpirationTime(): Optional<OffsetDateTime> =
        licenseExpirationTime.getOptional("license_expiration_time")

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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
     * Returns the raw JSON value of [customerInfo].
     *
     * Unlike [customerInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_info")
    @ExcludeMissing
    fun _customerInfo(): JsonField<CustomerInfo> = customerInfo

    /**
     * Returns the raw JSON value of [licenseExpirationTime].
     *
     * Unlike [licenseExpirationTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("license_expiration_time")
    @ExcludeMissing
    fun _licenseExpirationTime(): JsonField<OffsetDateTime> = licenseExpirationTime

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
         * Returns a mutable builder for constructing an instance of [InfoListResponse].
         *
         * The following fields are required:
         * ```java
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InfoListResponse]. */
    class Builder internal constructor() {

        private var version: JsonField<String>? = null
        private var batchIngestConfig: JsonField<BatchIngestConfig> = JsonMissing.of()
        private var customerInfo: JsonField<CustomerInfo> = JsonMissing.of()
        private var instanceFlags: JsonValue = JsonMissing.of()
        private var licenseExpirationTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(infoListResponse: InfoListResponse) = apply {
            version = infoListResponse.version
            batchIngestConfig = infoListResponse.batchIngestConfig
            customerInfo = infoListResponse.customerInfo
            instanceFlags = infoListResponse.instanceFlags
            licenseExpirationTime = infoListResponse.licenseExpirationTime
            additionalProperties = infoListResponse.additionalProperties.toMutableMap()
        }

        fun version(version: String) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<String>) = apply { this.version = version }

        /** Batch ingest config. */
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

        /** Customer info. */
        fun customerInfo(customerInfo: CustomerInfo?) =
            customerInfo(JsonField.ofNullable(customerInfo))

        /** Alias for calling [Builder.customerInfo] with `customerInfo.orElse(null)`. */
        fun customerInfo(customerInfo: Optional<CustomerInfo>) =
            customerInfo(customerInfo.getOrNull())

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

        fun instanceFlags(instanceFlags: JsonValue) = apply { this.instanceFlags = instanceFlags }

        fun licenseExpirationTime(licenseExpirationTime: OffsetDateTime?) =
            licenseExpirationTime(JsonField.ofNullable(licenseExpirationTime))

        /**
         * Alias for calling [Builder.licenseExpirationTime] with
         * `licenseExpirationTime.orElse(null)`.
         */
        fun licenseExpirationTime(licenseExpirationTime: Optional<OffsetDateTime>) =
            licenseExpirationTime(licenseExpirationTime.getOrNull())

        /**
         * Sets [Builder.licenseExpirationTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseExpirationTime] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun licenseExpirationTime(licenseExpirationTime: JsonField<OffsetDateTime>) = apply {
            this.licenseExpirationTime = licenseExpirationTime
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
         * Returns an immutable instance of [InfoListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InfoListResponse =
            InfoListResponse(
                checkRequired("version", version),
                batchIngestConfig,
                customerInfo,
                instanceFlags,
                licenseExpirationTime,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InfoListResponse = apply {
        if (validated) {
            return@apply
        }

        version()
        batchIngestConfig().ifPresent { it.validate() }
        customerInfo().ifPresent { it.validate() }
        licenseExpirationTime()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithApiInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (version.asKnown().isPresent) 1 else 0) +
            (batchIngestConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (customerInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (licenseExpirationTime.asKnown().isPresent) 1 else 0)

    /** Batch ingest config. */
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
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun scaleDownNemptyTrigger(): Optional<Long> =
            scaleDownNemptyTrigger.getOptional("scale_down_nempty_trigger")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun scaleUpNthreadsLimit(): Optional<Long> =
            scaleUpNthreadsLimit.getOptional("scale_up_nthreads_limit")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun scaleUpQsizeTrigger(): Optional<Long> =
            scaleUpQsizeTrigger.getOptional("scale_up_qsize_trigger")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sizeLimit(): Optional<Long> = sizeLimit.getOptional("size_limit")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sizeLimitBytes(): Optional<Long> = sizeLimitBytes.getOptional("size_limit_bytes")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
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
            } catch (e: LangsmithApiInvalidDataException) {
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

    /** Customer info. */
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
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerName(): String = customerName.getRequired("customer_name")

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

            /**
             * Returns a mutable builder for constructing an instance of [CustomerInfo].
             *
             * The following fields are required:
             * ```java
             * .customerId()
             * .customerName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomerInfo]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var customerName: JsonField<String>? = null
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
             *
             * The following fields are required:
             * ```java
             * .customerId()
             * .customerName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CustomerInfo =
                CustomerInfo(
                    checkRequired("customerId", customerId),
                    checkRequired("customerName", customerName),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

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
            } catch (e: LangsmithApiInvalidDataException) {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InfoListResponse &&
            version == other.version &&
            batchIngestConfig == other.batchIngestConfig &&
            customerInfo == other.customerInfo &&
            instanceFlags == other.instanceFlags &&
            licenseExpirationTime == other.licenseExpirationTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            version,
            batchIngestConfig,
            customerInfo,
            instanceFlags,
            licenseExpirationTime,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InfoListResponse{version=$version, batchIngestConfig=$batchIngestConfig, customerInfo=$customerInfo, instanceFlags=$instanceFlags, licenseExpirationTime=$licenseExpirationTime, additionalProperties=$additionalProperties}"
}
