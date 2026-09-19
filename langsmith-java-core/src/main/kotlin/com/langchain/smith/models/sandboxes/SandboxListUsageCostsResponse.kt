// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class SandboxListUsageCostsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val lcu: JsonField<String>,
    private val lsu: JsonField<String>,
    private val periodStart: JsonField<OffsetDateTime>,
    private val resourceId: JsonField<String>,
    private val resourceType: JsonField<ResourceType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("lcu") @ExcludeMissing lcu: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lsu") @ExcludeMissing lsu: JsonField<String> = JsonMissing.of(),
        @JsonProperty("period_start")
        @ExcludeMissing
        periodStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("resource_id")
        @ExcludeMissing
        resourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resource_type")
        @ExcludeMissing
        resourceType: JsonField<ResourceType> = JsonMissing.of(),
    ) : this(lcu, lsu, periodStart, resourceId, resourceType, mutableMapOf())

    /**
     * Recorded compute usage in LangSmith Compute Units (LCU), as a decimal string with up to six
     * fractional digits and trailing zeros omitted. Snapshots return "0".
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lcu(): String = lcu.getRequired("lcu")

    /**
     * Allocated storage usage in LangSmith Storage Units (LSU), as a decimal string with up to six
     * fractional digits and trailing zeros omitted.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lsu(): String = lsu.getRequired("lsu")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun periodStart(): OffsetDateTime = periodStart.getRequired("period_start")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resourceId(): String = resourceId.getRequired("resource_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resourceType(): ResourceType = resourceType.getRequired("resource_type")

    /**
     * Returns the raw JSON value of [lcu].
     *
     * Unlike [lcu], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lcu") @ExcludeMissing fun _lcu(): JsonField<String> = lcu

    /**
     * Returns the raw JSON value of [lsu].
     *
     * Unlike [lsu], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lsu") @ExcludeMissing fun _lsu(): JsonField<String> = lsu

    /**
     * Returns the raw JSON value of [periodStart].
     *
     * Unlike [periodStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_start")
    @ExcludeMissing
    fun _periodStart(): JsonField<OffsetDateTime> = periodStart

    /**
     * Returns the raw JSON value of [resourceId].
     *
     * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_id") @ExcludeMissing fun _resourceId(): JsonField<String> = resourceId

    /**
     * Returns the raw JSON value of [resourceType].
     *
     * Unlike [resourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_type")
    @ExcludeMissing
    fun _resourceType(): JsonField<ResourceType> = resourceType

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
         * [SandboxListUsageCostsResponse].
         *
         * The following fields are required:
         * ```java
         * .lcu()
         * .lsu()
         * .periodStart()
         * .resourceId()
         * .resourceType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SandboxListUsageCostsResponse]. */
    class Builder internal constructor() {

        private var lcu: JsonField<String>? = null
        private var lsu: JsonField<String>? = null
        private var periodStart: JsonField<OffsetDateTime>? = null
        private var resourceId: JsonField<String>? = null
        private var resourceType: JsonField<ResourceType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sandboxListUsageCostsResponse: SandboxListUsageCostsResponse) = apply {
            lcu = sandboxListUsageCostsResponse.lcu
            lsu = sandboxListUsageCostsResponse.lsu
            periodStart = sandboxListUsageCostsResponse.periodStart
            resourceId = sandboxListUsageCostsResponse.resourceId
            resourceType = sandboxListUsageCostsResponse.resourceType
            additionalProperties = sandboxListUsageCostsResponse.additionalProperties.toMutableMap()
        }

        /**
         * Recorded compute usage in LangSmith Compute Units (LCU), as a decimal string with up to
         * six fractional digits and trailing zeros omitted. Snapshots return "0".
         */
        fun lcu(lcu: String) = lcu(JsonField.of(lcu))

        /**
         * Sets [Builder.lcu] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lcu] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lcu(lcu: JsonField<String>) = apply { this.lcu = lcu }

        /**
         * Allocated storage usage in LangSmith Storage Units (LSU), as a decimal string with up to
         * six fractional digits and trailing zeros omitted.
         */
        fun lsu(lsu: String) = lsu(JsonField.of(lsu))

        /**
         * Sets [Builder.lsu] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lsu] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lsu(lsu: JsonField<String>) = apply { this.lsu = lsu }

        fun periodStart(periodStart: OffsetDateTime) = periodStart(JsonField.of(periodStart))

        /**
         * Sets [Builder.periodStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodStart] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
            this.periodStart = periodStart
        }

        fun resourceId(resourceId: String) = resourceId(JsonField.of(resourceId))

        /**
         * Sets [Builder.resourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

        fun resourceType(resourceType: ResourceType) = resourceType(JsonField.of(resourceType))

        /**
         * Sets [Builder.resourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceType] with a well-typed [ResourceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resourceType(resourceType: JsonField<ResourceType>) = apply {
            this.resourceType = resourceType
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
         * Returns an immutable instance of [SandboxListUsageCostsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .lcu()
         * .lsu()
         * .periodStart()
         * .resourceId()
         * .resourceType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SandboxListUsageCostsResponse =
            SandboxListUsageCostsResponse(
                checkRequired("lcu", lcu),
                checkRequired("lsu", lsu),
                checkRequired("periodStart", periodStart),
                checkRequired("resourceId", resourceId),
                checkRequired("resourceType", resourceType),
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
    fun validate(): SandboxListUsageCostsResponse = apply {
        if (validated) {
            return@apply
        }

        lcu()
        lsu()
        periodStart()
        resourceId()
        resourceType().validate()
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
        (if (lcu.asKnown().isPresent) 1 else 0) +
            (if (lsu.asKnown().isPresent) 1 else 0) +
            (if (periodStart.asKnown().isPresent) 1 else 0) +
            (if (resourceId.asKnown().isPresent) 1 else 0) +
            (resourceType.asKnown().getOrNull()?.validity() ?: 0)

    class ResourceType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SANDBOX = of("SANDBOX")

            @JvmField val SNAPSHOT = of("SNAPSHOT")

            @JvmStatic fun of(value: String) = ResourceType(JsonField.of(value))
        }

        /** An enum containing [ResourceType]'s known values. */
        enum class Known {
            SANDBOX,
            SNAPSHOT,
        }

        /**
         * An enum containing [ResourceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ResourceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SANDBOX,
            SNAPSHOT,
            /**
             * An enum member indicating that [ResourceType] was instantiated with an unknown value.
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
                SANDBOX -> Value.SANDBOX
                SNAPSHOT -> Value.SNAPSHOT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SANDBOX -> Known.SANDBOX
                SNAPSHOT -> Known.SNAPSHOT
                else -> throw LangChainInvalidDataException("Unknown ResourceType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangChainInvalidDataException("Value is not a String")
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
        fun validate(): ResourceType = apply {
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResourceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SandboxListUsageCostsResponse &&
            lcu == other.lcu &&
            lsu == other.lsu &&
            periodStart == other.periodStart &&
            resourceId == other.resourceId &&
            resourceType == other.resourceType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(lcu, lsu, periodStart, resourceId, resourceType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SandboxListUsageCostsResponse{lcu=$lcu, lsu=$lsu, periodStart=$periodStart, resourceId=$resourceId, resourceType=$resourceType, additionalProperties=$additionalProperties}"
}
