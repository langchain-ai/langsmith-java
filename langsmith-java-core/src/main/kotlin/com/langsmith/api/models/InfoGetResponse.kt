// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** The LangSmith server info. */
@JsonDeserialize(builder = InfoGetResponse.Builder::class)
@NoAutoDetect
class InfoGetResponse
private constructor(
    private val version: JsonField<String>,
    private val licenseExpirationTime: JsonField<OffsetDateTime>,
    private val batchIngestConfig: JsonField<BatchIngestConfig>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun version(): String = version.getRequired("version")

    fun licenseExpirationTime(): Optional<OffsetDateTime> =
        Optional.ofNullable(licenseExpirationTime.getNullable("license_expiration_time"))

    /** Batch ingest config. */
    fun batchIngestConfig(): Optional<BatchIngestConfig> =
        Optional.ofNullable(batchIngestConfig.getNullable("batch_ingest_config"))

    @JsonProperty("version") @ExcludeMissing fun _version() = version

    @JsonProperty("license_expiration_time")
    @ExcludeMissing
    fun _licenseExpirationTime() = licenseExpirationTime

    /** Batch ingest config. */
    @JsonProperty("batch_ingest_config")
    @ExcludeMissing
    fun _batchIngestConfig() = batchIngestConfig

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InfoGetResponse = apply {
        if (!validated) {
            version()
            licenseExpirationTime()
            batchIngestConfig().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InfoGetResponse &&
            this.version == other.version &&
            this.licenseExpirationTime == other.licenseExpirationTime &&
            this.batchIngestConfig == other.batchIngestConfig &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    version,
                    licenseExpirationTime,
                    batchIngestConfig,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "InfoGetResponse{version=$version, licenseExpirationTime=$licenseExpirationTime, batchIngestConfig=$batchIngestConfig, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var version: JsonField<String> = JsonMissing.of()
        private var licenseExpirationTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var batchIngestConfig: JsonField<BatchIngestConfig> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(infoGetResponse: InfoGetResponse) = apply {
            this.version = infoGetResponse.version
            this.licenseExpirationTime = infoGetResponse.licenseExpirationTime
            this.batchIngestConfig = infoGetResponse.batchIngestConfig
            additionalProperties(infoGetResponse.additionalProperties)
        }

        fun version(version: String) = version(JsonField.of(version))

        @JsonProperty("version")
        @ExcludeMissing
        fun version(version: JsonField<String>) = apply { this.version = version }

        fun licenseExpirationTime(licenseExpirationTime: OffsetDateTime) =
            licenseExpirationTime(JsonField.of(licenseExpirationTime))

        @JsonProperty("license_expiration_time")
        @ExcludeMissing
        fun licenseExpirationTime(licenseExpirationTime: JsonField<OffsetDateTime>) = apply {
            this.licenseExpirationTime = licenseExpirationTime
        }

        /** Batch ingest config. */
        fun batchIngestConfig(batchIngestConfig: BatchIngestConfig) =
            batchIngestConfig(JsonField.of(batchIngestConfig))

        /** Batch ingest config. */
        @JsonProperty("batch_ingest_config")
        @ExcludeMissing
        fun batchIngestConfig(batchIngestConfig: JsonField<BatchIngestConfig>) = apply {
            this.batchIngestConfig = batchIngestConfig
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): InfoGetResponse =
            InfoGetResponse(
                version,
                licenseExpirationTime,
                batchIngestConfig,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** Batch ingest config. */
    @JsonDeserialize(builder = BatchIngestConfig.Builder::class)
    @NoAutoDetect
    class BatchIngestConfig
    private constructor(
        private val scaleUpQsizeTrigger: JsonField<Long>,
        private val scaleUpNthreadsLimit: JsonField<Long>,
        private val scaleDownNemptyTrigger: JsonField<Long>,
        private val sizeLimit: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun scaleUpQsizeTrigger(): Optional<Long> =
            Optional.ofNullable(scaleUpQsizeTrigger.getNullable("scale_up_qsize_trigger"))

        fun scaleUpNthreadsLimit(): Optional<Long> =
            Optional.ofNullable(scaleUpNthreadsLimit.getNullable("scale_up_nthreads_limit"))

        fun scaleDownNemptyTrigger(): Optional<Long> =
            Optional.ofNullable(scaleDownNemptyTrigger.getNullable("scale_down_nempty_trigger"))

        fun sizeLimit(): Optional<Long> = Optional.ofNullable(sizeLimit.getNullable("size_limit"))

        @JsonProperty("scale_up_qsize_trigger")
        @ExcludeMissing
        fun _scaleUpQsizeTrigger() = scaleUpQsizeTrigger

        @JsonProperty("scale_up_nthreads_limit")
        @ExcludeMissing
        fun _scaleUpNthreadsLimit() = scaleUpNthreadsLimit

        @JsonProperty("scale_down_nempty_trigger")
        @ExcludeMissing
        fun _scaleDownNemptyTrigger() = scaleDownNemptyTrigger

        @JsonProperty("size_limit") @ExcludeMissing fun _sizeLimit() = sizeLimit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): BatchIngestConfig = apply {
            if (!validated) {
                scaleUpQsizeTrigger()
                scaleUpNthreadsLimit()
                scaleDownNemptyTrigger()
                sizeLimit()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BatchIngestConfig &&
                this.scaleUpQsizeTrigger == other.scaleUpQsizeTrigger &&
                this.scaleUpNthreadsLimit == other.scaleUpNthreadsLimit &&
                this.scaleDownNemptyTrigger == other.scaleDownNemptyTrigger &&
                this.sizeLimit == other.sizeLimit &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        scaleUpQsizeTrigger,
                        scaleUpNthreadsLimit,
                        scaleDownNemptyTrigger,
                        sizeLimit,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BatchIngestConfig{scaleUpQsizeTrigger=$scaleUpQsizeTrigger, scaleUpNthreadsLimit=$scaleUpNthreadsLimit, scaleDownNemptyTrigger=$scaleDownNemptyTrigger, sizeLimit=$sizeLimit, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var scaleUpQsizeTrigger: JsonField<Long> = JsonMissing.of()
            private var scaleUpNthreadsLimit: JsonField<Long> = JsonMissing.of()
            private var scaleDownNemptyTrigger: JsonField<Long> = JsonMissing.of()
            private var sizeLimit: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(batchIngestConfig: BatchIngestConfig) = apply {
                this.scaleUpQsizeTrigger = batchIngestConfig.scaleUpQsizeTrigger
                this.scaleUpNthreadsLimit = batchIngestConfig.scaleUpNthreadsLimit
                this.scaleDownNemptyTrigger = batchIngestConfig.scaleDownNemptyTrigger
                this.sizeLimit = batchIngestConfig.sizeLimit
                additionalProperties(batchIngestConfig.additionalProperties)
            }

            fun scaleUpQsizeTrigger(scaleUpQsizeTrigger: Long) =
                scaleUpQsizeTrigger(JsonField.of(scaleUpQsizeTrigger))

            @JsonProperty("scale_up_qsize_trigger")
            @ExcludeMissing
            fun scaleUpQsizeTrigger(scaleUpQsizeTrigger: JsonField<Long>) = apply {
                this.scaleUpQsizeTrigger = scaleUpQsizeTrigger
            }

            fun scaleUpNthreadsLimit(scaleUpNthreadsLimit: Long) =
                scaleUpNthreadsLimit(JsonField.of(scaleUpNthreadsLimit))

            @JsonProperty("scale_up_nthreads_limit")
            @ExcludeMissing
            fun scaleUpNthreadsLimit(scaleUpNthreadsLimit: JsonField<Long>) = apply {
                this.scaleUpNthreadsLimit = scaleUpNthreadsLimit
            }

            fun scaleDownNemptyTrigger(scaleDownNemptyTrigger: Long) =
                scaleDownNemptyTrigger(JsonField.of(scaleDownNemptyTrigger))

            @JsonProperty("scale_down_nempty_trigger")
            @ExcludeMissing
            fun scaleDownNemptyTrigger(scaleDownNemptyTrigger: JsonField<Long>) = apply {
                this.scaleDownNemptyTrigger = scaleDownNemptyTrigger
            }

            fun sizeLimit(sizeLimit: Long) = sizeLimit(JsonField.of(sizeLimit))

            @JsonProperty("size_limit")
            @ExcludeMissing
            fun sizeLimit(sizeLimit: JsonField<Long>) = apply { this.sizeLimit = sizeLimit }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): BatchIngestConfig =
                BatchIngestConfig(
                    scaleUpQsizeTrigger,
                    scaleUpNthreadsLimit,
                    scaleDownNemptyTrigger,
                    sizeLimit,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
