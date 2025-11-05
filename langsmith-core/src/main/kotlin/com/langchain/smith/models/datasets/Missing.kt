// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects

class Missing
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val _missing: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("__missing__") @ExcludeMissing _missing: JsonValue = JsonMissing.of()
    ) : this(_missing, mutableMapOf())

    /**
     * Expected to always return the following:
     * ```java
     * JsonValue.from("__missing__")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("__missing__") @ExcludeMissing fun __missing(): JsonValue = _missing

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

        /** Returns a mutable builder for constructing an instance of [Missing]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Missing]. */
    class Builder internal constructor() {

        private var _missing: JsonValue = JsonValue.from("__missing__")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(missing: Missing) = apply {
            _missing = missing._missing
            additionalProperties = missing.additionalProperties.toMutableMap()
        }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("__missing__")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun _missing(_missing: JsonValue) = apply { this._missing = _missing }

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
         * Returns an immutable instance of [Missing].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Missing = Missing(_missing, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): Missing = apply {
        if (validated) {
            return@apply
        }

        __missing().let {
            if (it != JsonValue.from("__missing__")) {
                throw LangChainInvalidDataException("'_missing' is invalid, received $it")
            }
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
    @JvmSynthetic
    internal fun validity(): Int =
        _missing.let { if (it == JsonValue.from("__missing__")) 1 else 0 }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Missing &&
            _missing == other._missing &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(_missing, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Missing{_missing=$_missing, additionalProperties=$additionalProperties}"
}
