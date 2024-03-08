// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
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

@JsonDeserialize(builder = TenantUsageLimitInfo.Builder::class)
@NoAutoDetect
class TenantUsageLimitInfo
private constructor(
    private val inRejectSet: JsonField<Boolean>,
    private val usageLimitType: JsonField<UsageLimitType>,
    private val tenantLimit: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun inRejectSet(): Boolean = inRejectSet.getRequired("in_reject_set")

    /** An enumeration. */
    fun usageLimitType(): Optional<UsageLimitType> =
        Optional.ofNullable(usageLimitType.getNullable("usage_limit_type"))

    fun tenantLimit(): Optional<Long> = Optional.ofNullable(tenantLimit.getNullable("tenant_limit"))

    @JsonProperty("in_reject_set") @ExcludeMissing fun _inRejectSet() = inRejectSet

    /** An enumeration. */
    @JsonProperty("usage_limit_type") @ExcludeMissing fun _usageLimitType() = usageLimitType

    @JsonProperty("tenant_limit") @ExcludeMissing fun _tenantLimit() = tenantLimit

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TenantUsageLimitInfo = apply {
        if (!validated) {
            inRejectSet()
            usageLimitType()
            tenantLimit()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TenantUsageLimitInfo &&
            this.inRejectSet == other.inRejectSet &&
            this.usageLimitType == other.usageLimitType &&
            this.tenantLimit == other.tenantLimit &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    inRejectSet,
                    usageLimitType,
                    tenantLimit,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "TenantUsageLimitInfo{inRejectSet=$inRejectSet, usageLimitType=$usageLimitType, tenantLimit=$tenantLimit, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var inRejectSet: JsonField<Boolean> = JsonMissing.of()
        private var usageLimitType: JsonField<UsageLimitType> = JsonMissing.of()
        private var tenantLimit: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tenantUsageLimitInfo: TenantUsageLimitInfo) = apply {
            this.inRejectSet = tenantUsageLimitInfo.inRejectSet
            this.usageLimitType = tenantUsageLimitInfo.usageLimitType
            this.tenantLimit = tenantUsageLimitInfo.tenantLimit
            additionalProperties(tenantUsageLimitInfo.additionalProperties)
        }

        fun inRejectSet(inRejectSet: Boolean) = inRejectSet(JsonField.of(inRejectSet))

        @JsonProperty("in_reject_set")
        @ExcludeMissing
        fun inRejectSet(inRejectSet: JsonField<Boolean>) = apply { this.inRejectSet = inRejectSet }

        /** An enumeration. */
        fun usageLimitType(usageLimitType: UsageLimitType) =
            usageLimitType(JsonField.of(usageLimitType))

        /** An enumeration. */
        @JsonProperty("usage_limit_type")
        @ExcludeMissing
        fun usageLimitType(usageLimitType: JsonField<UsageLimitType>) = apply {
            this.usageLimitType = usageLimitType
        }

        fun tenantLimit(tenantLimit: Long) = tenantLimit(JsonField.of(tenantLimit))

        @JsonProperty("tenant_limit")
        @ExcludeMissing
        fun tenantLimit(tenantLimit: JsonField<Long>) = apply { this.tenantLimit = tenantLimit }

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

        fun build(): TenantUsageLimitInfo =
            TenantUsageLimitInfo(
                inRejectSet,
                usageLimitType,
                tenantLimit,
                additionalProperties.toUnmodifiable(),
            )
    }

    class UsageLimitType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UsageLimitType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PAYLOAD_SIZE = UsageLimitType(JsonField.of("payload_size"))

            @JvmField val REQUEST_COUNT = UsageLimitType(JsonField.of("request_count"))

            @JvmField val TOTAL_UNIQUE_TRACES = UsageLimitType(JsonField.of("total_unique_traces"))

            @JvmStatic fun of(value: String) = UsageLimitType(JsonField.of(value))
        }

        enum class Known {
            PAYLOAD_SIZE,
            REQUEST_COUNT,
            TOTAL_UNIQUE_TRACES,
        }

        enum class Value {
            PAYLOAD_SIZE,
            REQUEST_COUNT,
            TOTAL_UNIQUE_TRACES,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PAYLOAD_SIZE -> Value.PAYLOAD_SIZE
                REQUEST_COUNT -> Value.REQUEST_COUNT
                TOTAL_UNIQUE_TRACES -> Value.TOTAL_UNIQUE_TRACES
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PAYLOAD_SIZE -> Known.PAYLOAD_SIZE
                REQUEST_COUNT -> Known.REQUEST_COUNT
                TOTAL_UNIQUE_TRACES -> Known.TOTAL_UNIQUE_TRACES
                else -> throw LangSmithInvalidDataException("Unknown UsageLimitType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
