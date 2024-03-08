// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
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
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@JsonDeserialize(builder = InfoGetResponse.Builder::class)
@NoAutoDetect
class InfoGetResponse
private constructor( // templates/JavaSDK/entities/objects.ts:76:13
    private val version: JsonField<String>, // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    private val licenseExpirationTime: JsonField<OffsetDateTime>,
    private val batchIngestConfig: JsonField<BatchIngestConfig>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

    private var hashCode: Int = 0

    fun version(): String = version.getRequired("version")

    fun licenseExpirationTime(): Optional<OffsetDateTime> =
        Optional.ofNullable(licenseExpirationTime.getNullable("license_expiration_time"))

    /** Batch ingest config. */
    fun batchIngestConfig(): Optional<BatchIngestConfig> =
        Optional.ofNullable(batchIngestConfig.getNullable("batch_ingest_config"))

    @JsonProperty("version") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _version() = version

    @JsonProperty("license_expiration_time") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _licenseExpirationTime() = licenseExpirationTime

    /** Batch ingest config. */
    @JsonProperty("batch_ingest_config") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _batchIngestConfig() = batchIngestConfig

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InfoGetResponse = apply { // templates/JavaSDK/entities/objects.ts:198:28
        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:198:28 //
            // templates/JavaSDK/entities/objects.ts:198:28
            version() // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:201:20
            licenseExpirationTime()
            batchIngestConfig().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is InfoGetResponse && // templates/JavaSDK/entities/fields.ts:143:33
            this.version == other.version &&
            this.licenseExpirationTime == other.licenseExpirationTime &&
            this.batchIngestConfig == other.batchIngestConfig &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
            // templates/JavaSDK/entities/fields.ts:174:16 //
            // templates/JavaSDK/entities/fields.ts:174:16
            hashCode =
                Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                    // templates/JavaSDK/entities/fields.ts:175:16 //
                    // templates/JavaSDK/entities/fields.ts:175:16
                    version, // templates/JavaSDK/entities/fields.ts:163:19
                    licenseExpirationTime,
                    batchIngestConfig,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "InfoGetResponse{version=$version, licenseExpirationTime=$licenseExpirationTime, batchIngestConfig=$batchIngestConfig, additionalProperties=$additionalProperties}"

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var version: JsonField<String> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
        private var licenseExpirationTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var batchIngestConfig: JsonField<BatchIngestConfig> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(infoGetResponse: InfoGetResponse) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.version =
                    infoGetResponse.version // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
                this.licenseExpirationTime = infoGetResponse.licenseExpirationTime
                this.batchIngestConfig = infoGetResponse.batchIngestConfig
                additionalProperties(infoGetResponse.additionalProperties)
            }

        fun version(version: String) =
            version(JsonField.of(version)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("version") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun version(version: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.version = version
            }

        fun licenseExpirationTime(licenseExpirationTime: OffsetDateTime) =
            licenseExpirationTime(
                JsonField.of(licenseExpirationTime)
            ) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("license_expiration_time") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun licenseExpirationTime(licenseExpirationTime: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.licenseExpirationTime = licenseExpirationTime
            }

        /** Batch ingest config. */
        // templates/JavaSDK/entities/objects.ts:252:20
        fun batchIngestConfig(batchIngestConfig: BatchIngestConfig) =
            batchIngestConfig(JsonField.of(batchIngestConfig))

        /** Batch ingest config. */
        @JsonProperty("batch_ingest_config") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun batchIngestConfig(batchIngestConfig: JsonField<BatchIngestConfig>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.batchIngestConfig = batchIngestConfig
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.putAll(additionalProperties)
            }

        @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply { // templates/JavaSDK/entities/objects.ts:304:30
                this.additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:316:30
                this.additionalProperties.putAll(additionalProperties)
            }

        fun build(): InfoGetResponse =
            InfoGetResponse( // templates/JavaSDK/entities/objects.ts:326:30
                version, // templates/JavaSDK/entities/objects.ts:326:30
                licenseExpirationTime,
                batchIngestConfig,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** Batch ingest config. */
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    @JsonDeserialize(builder = BatchIngestConfig.Builder::class)
    @NoAutoDetect
    class BatchIngestConfig
    private constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val scaleUpQsizeTrigger:
            JsonField<Long>, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val scaleUpNthreadsLimit: JsonField<Long>,
        private val scaleDownNemptyTrigger: JsonField<Long>,
        private val sizeLimit: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        private var hashCode: Int = 0

        fun scaleUpQsizeTrigger(): Optional<Long> =
            Optional.ofNullable(scaleUpQsizeTrigger.getNullable("scale_up_qsize_trigger"))

        fun scaleUpNthreadsLimit(): Optional<Long> =
            Optional.ofNullable(scaleUpNthreadsLimit.getNullable("scale_up_nthreads_limit"))

        fun scaleDownNemptyTrigger(): Optional<Long> =
            Optional.ofNullable(scaleDownNemptyTrigger.getNullable("scale_down_nempty_trigger"))

        fun sizeLimit(): Optional<Long> = Optional.ofNullable(sizeLimit.getNullable("size_limit"))

        @JsonProperty("scale_up_qsize_trigger") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _scaleUpQsizeTrigger() = scaleUpQsizeTrigger

        @JsonProperty("scale_up_nthreads_limit") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _scaleUpNthreadsLimit() = scaleUpNthreadsLimit

        @JsonProperty("scale_down_nempty_trigger") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _scaleDownNemptyTrigger() = scaleDownNemptyTrigger

        @JsonProperty("size_limit") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _sizeLimit() = sizeLimit

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): BatchIngestConfig = apply { // templates/JavaSDK/entities/objects.ts:198:28
            if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:198:28 //
                // templates/JavaSDK/entities/objects.ts:198:28
                scaleUpQsizeTrigger() // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:201:20
                scaleUpNthreadsLimit()
                scaleDownNemptyTrigger()
                sizeLimit()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is BatchIngestConfig && // templates/JavaSDK/entities/fields.ts:143:33
                this.scaleUpQsizeTrigger == other.scaleUpQsizeTrigger &&
                this.scaleUpNthreadsLimit == other.scaleUpNthreadsLimit &&
                this.scaleDownNemptyTrigger == other.scaleDownNemptyTrigger &&
                this.sizeLimit == other.sizeLimit &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
                // templates/JavaSDK/entities/fields.ts:174:16 //
                // templates/JavaSDK/entities/fields.ts:174:16
                hashCode =
                    Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                        // templates/JavaSDK/entities/fields.ts:175:16 //
                        // templates/JavaSDK/entities/fields.ts:175:16
                        scaleUpQsizeTrigger, // templates/JavaSDK/entities/fields.ts:163:19
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

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var scaleUpQsizeTrigger: JsonField<Long> =
                JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var scaleUpNthreadsLimit: JsonField<Long> = JsonMissing.of()
            private var scaleDownNemptyTrigger: JsonField<Long> = JsonMissing.of()
            private var sizeLimit: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(batchIngestConfig: BatchIngestConfig) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.scaleUpQsizeTrigger =
                        batchIngestConfig
                            .scaleUpQsizeTrigger // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.scaleUpNthreadsLimit = batchIngestConfig.scaleUpNthreadsLimit
                    this.scaleDownNemptyTrigger = batchIngestConfig.scaleDownNemptyTrigger
                    this.sizeLimit = batchIngestConfig.sizeLimit
                    additionalProperties(batchIngestConfig.additionalProperties)
                }

            fun scaleUpQsizeTrigger(scaleUpQsizeTrigger: Long) =
                scaleUpQsizeTrigger(
                    JsonField.of(scaleUpQsizeTrigger)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("scale_up_qsize_trigger") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun scaleUpQsizeTrigger(scaleUpQsizeTrigger: JsonField<Long>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.scaleUpQsizeTrigger = scaleUpQsizeTrigger
                }

            fun scaleUpNthreadsLimit(scaleUpNthreadsLimit: Long) =
                scaleUpNthreadsLimit(
                    JsonField.of(scaleUpNthreadsLimit)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("scale_up_nthreads_limit") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun scaleUpNthreadsLimit(scaleUpNthreadsLimit: JsonField<Long>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.scaleUpNthreadsLimit = scaleUpNthreadsLimit
                }

            fun scaleDownNemptyTrigger(scaleDownNemptyTrigger: Long) =
                scaleDownNemptyTrigger(
                    JsonField.of(scaleDownNemptyTrigger)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty(
                "scale_down_nempty_trigger"
            ) // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun scaleDownNemptyTrigger(scaleDownNemptyTrigger: JsonField<Long>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.scaleDownNemptyTrigger = scaleDownNemptyTrigger
                }

            fun sizeLimit(sizeLimit: Long) =
                sizeLimit(JsonField.of(sizeLimit)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("size_limit") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun sizeLimit(sizeLimit: JsonField<Long>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.sizeLimit = sizeLimit
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties
                        .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                    // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply { // templates/JavaSDK/entities/objects.ts:304:30
                    this.additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:316:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): BatchIngestConfig =
                BatchIngestConfig( // templates/JavaSDK/entities/objects.ts:326:30
                    scaleUpQsizeTrigger, // templates/JavaSDK/entities/objects.ts:326:30
                    scaleUpNthreadsLimit,
                    scaleDownNemptyTrigger,
                    sizeLimit,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
