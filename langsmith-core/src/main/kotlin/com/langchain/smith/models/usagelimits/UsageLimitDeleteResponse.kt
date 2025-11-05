// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.usagelimits

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects

class UsageLimitDeleteResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

    @JsonCreator private constructor() : this(mutableMapOf())

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

        /** Returns a mutable builder for constructing an instance of [UsageLimitDeleteResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageLimitDeleteResponse]. */
    class Builder internal constructor() {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageLimitDeleteResponse: UsageLimitDeleteResponse) = apply {
            additionalProperties = usageLimitDeleteResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [UsageLimitDeleteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UsageLimitDeleteResponse =
            UsageLimitDeleteResponse(additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): UsageLimitDeleteResponse = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = 0

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageLimitDeleteResponse &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() = "UsageLimitDeleteResponse{additionalProperties=$additionalProperties}"
}
