// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.Enum
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CurrentRetrieveUsageLimitsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val inRejectSet: JsonField<Boolean>,
    private val tenantLimit: JsonField<Long>,
    private val usageLimitType: JsonField<UsageLimitType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("in_reject_set")
        @ExcludeMissing
        inRejectSet: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tenant_limit")
        @ExcludeMissing
        tenantLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("usage_limit_type")
        @ExcludeMissing
        usageLimitType: JsonField<UsageLimitType> = JsonMissing.of(),
    ) : this(inRejectSet, tenantLimit, usageLimitType, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inRejectSet(): Boolean = inRejectSet.getRequired("in_reject_set")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tenantLimit(): Optional<Long> = tenantLimit.getOptional("tenant_limit")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun usageLimitType(): Optional<UsageLimitType> = usageLimitType.getOptional("usage_limit_type")

    /**
     * Returns the raw JSON value of [inRejectSet].
     *
     * Unlike [inRejectSet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("in_reject_set")
    @ExcludeMissing
    fun _inRejectSet(): JsonField<Boolean> = inRejectSet

    /**
     * Returns the raw JSON value of [tenantLimit].
     *
     * Unlike [tenantLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_limit") @ExcludeMissing fun _tenantLimit(): JsonField<Long> = tenantLimit

    /**
     * Returns the raw JSON value of [usageLimitType].
     *
     * Unlike [usageLimitType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage_limit_type")
    @ExcludeMissing
    fun _usageLimitType(): JsonField<UsageLimitType> = usageLimitType

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
         * Returns a mutable builder for constructing an instance of
         * [CurrentRetrieveUsageLimitsResponse].
         *
         * The following fields are required:
         * ```java
         * .inRejectSet()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CurrentRetrieveUsageLimitsResponse]. */
    class Builder internal constructor() {

        private var inRejectSet: JsonField<Boolean>? = null
        private var tenantLimit: JsonField<Long> = JsonMissing.of()
        private var usageLimitType: JsonField<UsageLimitType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(currentRetrieveUsageLimitsResponse: CurrentRetrieveUsageLimitsResponse) =
            apply {
                inRejectSet = currentRetrieveUsageLimitsResponse.inRejectSet
                tenantLimit = currentRetrieveUsageLimitsResponse.tenantLimit
                usageLimitType = currentRetrieveUsageLimitsResponse.usageLimitType
                additionalProperties =
                    currentRetrieveUsageLimitsResponse.additionalProperties.toMutableMap()
            }

        fun inRejectSet(inRejectSet: Boolean) = inRejectSet(JsonField.of(inRejectSet))

        /**
         * Sets [Builder.inRejectSet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inRejectSet] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inRejectSet(inRejectSet: JsonField<Boolean>) = apply { this.inRejectSet = inRejectSet }

        fun tenantLimit(tenantLimit: Long?) = tenantLimit(JsonField.ofNullable(tenantLimit))

        /**
         * Alias for [Builder.tenantLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun tenantLimit(tenantLimit: Long) = tenantLimit(tenantLimit as Long?)

        /** Alias for calling [Builder.tenantLimit] with `tenantLimit.orElse(null)`. */
        fun tenantLimit(tenantLimit: Optional<Long>) = tenantLimit(tenantLimit.getOrNull())

        /**
         * Sets [Builder.tenantLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tenantLimit(tenantLimit: JsonField<Long>) = apply { this.tenantLimit = tenantLimit }

        fun usageLimitType(usageLimitType: UsageLimitType?) =
            usageLimitType(JsonField.ofNullable(usageLimitType))

        /** Alias for calling [Builder.usageLimitType] with `usageLimitType.orElse(null)`. */
        fun usageLimitType(usageLimitType: Optional<UsageLimitType>) =
            usageLimitType(usageLimitType.getOrNull())

        /**
         * Sets [Builder.usageLimitType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageLimitType] with a well-typed [UsageLimitType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usageLimitType(usageLimitType: JsonField<UsageLimitType>) = apply {
            this.usageLimitType = usageLimitType
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
         * Returns an immutable instance of [CurrentRetrieveUsageLimitsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inRejectSet()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CurrentRetrieveUsageLimitsResponse =
            CurrentRetrieveUsageLimitsResponse(
                checkRequired("inRejectSet", inRejectSet),
                tenantLimit,
                usageLimitType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CurrentRetrieveUsageLimitsResponse = apply {
        if (validated) {
            return@apply
        }

        inRejectSet()
        tenantLimit()
        usageLimitType().ifPresent { it.validate() }
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
        (if (inRejectSet.asKnown().isPresent) 1 else 0) +
            (if (tenantLimit.asKnown().isPresent) 1 else 0) +
            (usageLimitType.asKnown().getOrNull()?.validity() ?: 0)

    class UsageLimitType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PAYLOAD_SIZE = of("payload_size")

            @JvmField val EVENTS_INGESTED_PER_HOUR = of("events_ingested_per_hour")

            @JvmField val TOTAL_UNIQUE_TRACES = of("total_unique_traces")

            @JvmField val EVENTS_INGESTED_PER_MINUTE = of("events_ingested_per_minute")

            @JvmField val USER_DEFINED_MONTHLY_TRACES = of("user_defined_monthly_traces")

            @JvmField
            val USER_DEFINED_MONTHLY_LONGLIVED_TRACES = of("user_defined_monthly_longlived_traces")

            @JvmField val USER_DEFINED_UNKNOWN = of("user_defined_unknown")

            @JvmStatic fun of(value: String) = UsageLimitType(JsonField.of(value))
        }

        /** An enum containing [UsageLimitType]'s known values. */
        enum class Known {
            PAYLOAD_SIZE,
            EVENTS_INGESTED_PER_HOUR,
            TOTAL_UNIQUE_TRACES,
            EVENTS_INGESTED_PER_MINUTE,
            USER_DEFINED_MONTHLY_TRACES,
            USER_DEFINED_MONTHLY_LONGLIVED_TRACES,
            USER_DEFINED_UNKNOWN,
        }

        /**
         * An enum containing [UsageLimitType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [UsageLimitType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAYLOAD_SIZE,
            EVENTS_INGESTED_PER_HOUR,
            TOTAL_UNIQUE_TRACES,
            EVENTS_INGESTED_PER_MINUTE,
            USER_DEFINED_MONTHLY_TRACES,
            USER_DEFINED_MONTHLY_LONGLIVED_TRACES,
            USER_DEFINED_UNKNOWN,
            /**
             * An enum member indicating that [UsageLimitType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PAYLOAD_SIZE -> Value.PAYLOAD_SIZE
                EVENTS_INGESTED_PER_HOUR -> Value.EVENTS_INGESTED_PER_HOUR
                TOTAL_UNIQUE_TRACES -> Value.TOTAL_UNIQUE_TRACES
                EVENTS_INGESTED_PER_MINUTE -> Value.EVENTS_INGESTED_PER_MINUTE
                USER_DEFINED_MONTHLY_TRACES -> Value.USER_DEFINED_MONTHLY_TRACES
                USER_DEFINED_MONTHLY_LONGLIVED_TRACES -> Value.USER_DEFINED_MONTHLY_LONGLIVED_TRACES
                USER_DEFINED_UNKNOWN -> Value.USER_DEFINED_UNKNOWN
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PAYLOAD_SIZE -> Known.PAYLOAD_SIZE
                EVENTS_INGESTED_PER_HOUR -> Known.EVENTS_INGESTED_PER_HOUR
                TOTAL_UNIQUE_TRACES -> Known.TOTAL_UNIQUE_TRACES
                EVENTS_INGESTED_PER_MINUTE -> Known.EVENTS_INGESTED_PER_MINUTE
                USER_DEFINED_MONTHLY_TRACES -> Known.USER_DEFINED_MONTHLY_TRACES
                USER_DEFINED_MONTHLY_LONGLIVED_TRACES -> Known.USER_DEFINED_MONTHLY_LONGLIVED_TRACES
                USER_DEFINED_UNKNOWN -> Known.USER_DEFINED_UNKNOWN
                else -> throw LangsmithApiInvalidDataException("Unknown UsageLimitType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithApiInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): UsageLimitType = apply {
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
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is UsageLimitType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CurrentRetrieveUsageLimitsResponse &&
            inRejectSet == other.inRejectSet &&
            tenantLimit == other.tenantLimit &&
            usageLimitType == other.usageLimitType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(inRejectSet, tenantLimit, usageLimitType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CurrentRetrieveUsageLimitsResponse{inRejectSet=$inRejectSet, tenantLimit=$tenantLimit, usageLimitType=$usageLimitType, additionalProperties=$additionalProperties}"
}
