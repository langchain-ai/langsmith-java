// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(
    builder = TenantUsageLimitInfo.Builder::class
) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@NoAutoDetect
class TenantUsageLimitInfo
private constructor( // templates/JavaSDK/entities/objects.ts:76:13
    private val inRejectSet: JsonField<Boolean>, // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    private val usageLimitType: JsonField<UsageLimitType>,
    private val tenantLimit: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

    private var hashCode: Int = 0

    fun inRejectSet(): Boolean = inRejectSet.getRequired("in_reject_set")

    /** An enumeration. */
    fun usageLimitType(): Optional<UsageLimitType> =
        Optional.ofNullable(usageLimitType.getNullable("usage_limit_type"))

    fun tenantLimit(): Optional<Long> = Optional.ofNullable(tenantLimit.getNullable("tenant_limit"))

    @JsonProperty("in_reject_set") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _inRejectSet() = inRejectSet

    /** An enumeration. */
    @JsonProperty("usage_limit_type") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _usageLimitType() = usageLimitType

    @JsonProperty("tenant_limit") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _tenantLimit() = tenantLimit

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TenantUsageLimitInfo = apply { // templates/JavaSDK/entities/objects.ts:198:28
        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:198:28 //
            // templates/JavaSDK/entities/objects.ts:198:28
            inRejectSet() // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:201:20
            usageLimitType()
            tenantLimit()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is TenantUsageLimitInfo && // templates/JavaSDK/entities/fields.ts:143:33
            this.inRejectSet == other.inRejectSet &&
            this.usageLimitType == other.usageLimitType &&
            this.tenantLimit == other.tenantLimit &&
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
                    inRejectSet, // templates/JavaSDK/entities/fields.ts:163:19
                    usageLimitType,
                    tenantLimit,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "TenantUsageLimitInfo{inRejectSet=$inRejectSet, usageLimitType=$usageLimitType, tenantLimit=$tenantLimit, additionalProperties=$additionalProperties}"

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var inRejectSet: JsonField<Boolean> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
        private var usageLimitType: JsonField<UsageLimitType> = JsonMissing.of()
        private var tenantLimit: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(tenantUsageLimitInfo: TenantUsageLimitInfo) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.inRejectSet =
                    tenantUsageLimitInfo
                        .inRejectSet // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
                this.usageLimitType = tenantUsageLimitInfo.usageLimitType
                this.tenantLimit = tenantUsageLimitInfo.tenantLimit
                additionalProperties(tenantUsageLimitInfo.additionalProperties)
            }

        fun inRejectSet(inRejectSet: Boolean) =
            inRejectSet(JsonField.of(inRejectSet)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("in_reject_set") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun inRejectSet(inRejectSet: JsonField<Boolean>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.inRejectSet = inRejectSet
            }

        /** An enumeration. */
        // templates/JavaSDK/entities/objects.ts:252:20
        fun usageLimitType(usageLimitType: UsageLimitType) =
            usageLimitType(JsonField.of(usageLimitType))

        /** An enumeration. */
        @JsonProperty("usage_limit_type") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun usageLimitType(usageLimitType: JsonField<UsageLimitType>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.usageLimitType = usageLimitType
            }

        fun tenantLimit(tenantLimit: Long) =
            tenantLimit(JsonField.of(tenantLimit)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("tenant_limit") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun tenantLimit(tenantLimit: JsonField<Long>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.tenantLimit = tenantLimit
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

        fun build(): TenantUsageLimitInfo =
            TenantUsageLimitInfo( // templates/JavaSDK/entities/objects.ts:326:30
                inRejectSet, // templates/JavaSDK/entities/objects.ts:326:30
                usageLimitType,
                tenantLimit,
                additionalProperties.toUnmodifiable(),
            )
    }

    class UsageLimitType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) { // templates/JavaSDK/entities/enums.ts:56:13 // templates/JavaSDK/entities/enums.ts:56:13 //
        // templates/JavaSDK/entities/enums.ts:56:13

        @com.fasterxml.jackson.annotation.JsonValue // templates/JavaSDK/entities/enums.ts:62:10 //
        // templates/JavaSDK/entities/enums.ts:56:13
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is UsageLimitType && // templates/JavaSDK/entities/fields.ts:143:33
                this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object { // templates/JavaSDK/entities/enums.ts:71:10

            @JvmField
            val PAYLOAD_SIZE =
                UsageLimitType(
                    JsonField.of("payload_size")
                ) // templates/JavaSDK/entities/enums.ts:71:10

            @JvmField val REQUEST_COUNT = UsageLimitType(JsonField.of("request_count"))

            @JvmField val TOTAL_UNIQUE_TRACES = UsageLimitType(JsonField.of("total_unique_traces"))

            @JvmStatic fun of(value: String) = UsageLimitType(JsonField.of(value))
        }

        enum class Known { // templates/JavaSDK/entities/enums.ts:78:10
            PAYLOAD_SIZE, // templates/JavaSDK/entities/enums.ts:78:10 //
            // templates/JavaSDK/entities/enums.ts:78:10
            REQUEST_COUNT,
            TOTAL_UNIQUE_TRACES,
        }

        enum class Value { // templates/JavaSDK/entities/enums.ts:82:10
            PAYLOAD_SIZE, // templates/JavaSDK/entities/enums.ts:82:10 //
            // templates/JavaSDK/entities/enums.ts:82:10
            REQUEST_COUNT,
            TOTAL_UNIQUE_TRACES,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) { // templates/JavaSDK/entities/enums.ts:91:29
                PAYLOAD_SIZE -> Value.PAYLOAD_SIZE // templates/JavaSDK/entities/enums.ts:54:10 //
                // templates/JavaSDK/entities/enums.ts:54:10
                REQUEST_COUNT -> Value.REQUEST_COUNT
                TOTAL_UNIQUE_TRACES -> Value.TOTAL_UNIQUE_TRACES
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) { // templates/JavaSDK/entities/enums.ts:104:29
                PAYLOAD_SIZE -> Known.PAYLOAD_SIZE // templates/JavaSDK/entities/enums.ts:54:10 //
                // templates/JavaSDK/entities/enums.ts:54:10
                REQUEST_COUNT -> Known.REQUEST_COUNT
                TOTAL_UNIQUE_TRACES -> Known.TOTAL_UNIQUE_TRACES
                else -> throw LangSmithInvalidDataException("Unknown UsageLimitType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
