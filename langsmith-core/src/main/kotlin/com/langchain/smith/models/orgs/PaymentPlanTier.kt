// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs

import com.fasterxml.jackson.annotation.JsonCreator
import com.langchain.smith.core.Enum
import com.langchain.smith.core.JsonField
import com.langchain.smith.errors.LangChainInvalidDataException

class PaymentPlanTier @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val NO_PLAN = of("no_plan")

        @JvmField val DEVELOPER = of("developer")

        @JvmField val PLUS = of("plus")

        @JvmField val ENTERPRISE = of("enterprise")

        @JvmField val DEVELOPER_LEGACY = of("developer_legacy")

        @JvmField val PLUS_LEGACY = of("plus_legacy")

        @JvmField val FREE = of("free")

        @JvmField val ENTERPRISE_LEGACY = of("enterprise_legacy")

        @JvmField val STARTUP = of("startup")

        @JvmField val STARTUP_V0 = of("startup_v0")

        @JvmField val PARTNER = of("partner")

        @JvmField val PREMIER = of("premier")

        @JvmStatic fun of(value: String) = PaymentPlanTier(JsonField.of(value))
    }

    /** An enum containing [PaymentPlanTier]'s known values. */
    enum class Known {
        NO_PLAN,
        DEVELOPER,
        PLUS,
        ENTERPRISE,
        DEVELOPER_LEGACY,
        PLUS_LEGACY,
        FREE,
        ENTERPRISE_LEGACY,
        STARTUP,
        STARTUP_V0,
        PARTNER,
        PREMIER,
    }

    /**
     * An enum containing [PaymentPlanTier]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [PaymentPlanTier] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        NO_PLAN,
        DEVELOPER,
        PLUS,
        ENTERPRISE,
        DEVELOPER_LEGACY,
        PLUS_LEGACY,
        FREE,
        ENTERPRISE_LEGACY,
        STARTUP,
        STARTUP_V0,
        PARTNER,
        PREMIER,
        /**
         * An enum member indicating that [PaymentPlanTier] was instantiated with an unknown value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            NO_PLAN -> Value.NO_PLAN
            DEVELOPER -> Value.DEVELOPER
            PLUS -> Value.PLUS
            ENTERPRISE -> Value.ENTERPRISE
            DEVELOPER_LEGACY -> Value.DEVELOPER_LEGACY
            PLUS_LEGACY -> Value.PLUS_LEGACY
            FREE -> Value.FREE
            ENTERPRISE_LEGACY -> Value.ENTERPRISE_LEGACY
            STARTUP -> Value.STARTUP
            STARTUP_V0 -> Value.STARTUP_V0
            PARTNER -> Value.PARTNER
            PREMIER -> Value.PREMIER
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LangChainInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            NO_PLAN -> Known.NO_PLAN
            DEVELOPER -> Known.DEVELOPER
            PLUS -> Known.PLUS
            ENTERPRISE -> Known.ENTERPRISE
            DEVELOPER_LEGACY -> Known.DEVELOPER_LEGACY
            PLUS_LEGACY -> Known.PLUS_LEGACY
            FREE -> Known.FREE
            ENTERPRISE_LEGACY -> Known.ENTERPRISE_LEGACY
            STARTUP -> Known.STARTUP
            STARTUP_V0 -> Known.STARTUP_V0
            PARTNER -> Known.PARTNER
            PREMIER -> Known.PREMIER
            else -> throw LangChainInvalidDataException("Unknown PaymentPlanTier: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LangChainInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { LangChainInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): PaymentPlanTier = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentPlanTier && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
