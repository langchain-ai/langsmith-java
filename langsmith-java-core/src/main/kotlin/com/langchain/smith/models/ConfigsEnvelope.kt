// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.contentEquals
import com.langchain.smith.core.contentHash
import com.langchain.smith.core.contentToString
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections

class ConfigsEnvelope<T : Any>
private constructor(
    private val configs: JsonField<T>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("configs") @ExcludeMissing configs: JsonField<T> = JsonMissing.of()
    ) : this(configs, mutableMapOf())

    fun configs(): T = configs.getRequired("configs")

    @JsonProperty("configs") @ExcludeMissing fun _configs(): JsonField<T> = configs

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LangChainInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ConfigsEnvelope<T> = apply {
        if (validated) {
            return@apply
        }

        configs()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangChainInvalidDataException) {
            false
        }

    fun toBuilder() = Builder<T>().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConfigsEnvelope<*> &&
            configs contentEquals other.configs &&
            additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int = contentHash(configs, additionalProperties)

    override fun toString() =
        "ConfigsEnvelope{configs=${configs.contentToString()}, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun <T : Any> builder() = Builder<T>()
    }

    class Builder<T : Any> {

        private var configs: JsonField<T> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ConfigsEnvelope: ConfigsEnvelope<T>) = apply {
            this.configs = ConfigsEnvelope.configs
            this.additionalProperties.putAll(ConfigsEnvelope.additionalProperties)
        }

        fun configs(configs: T) = configs(JsonField.of(configs))

        fun configs(configs: JsonField<T>) = apply { this.configs = configs }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun build() = ConfigsEnvelope(configs, additionalProperties.toMutableMap())
    }
}
