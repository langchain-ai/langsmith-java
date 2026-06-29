// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.registries

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RegistryListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val offset: JsonField<Long>,
    private val registries: JsonField<List<RegistryResponse>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("registries")
        @ExcludeMissing
        registries: JsonField<List<RegistryResponse>> = JsonMissing.of(),
    ) : this(offset, registries, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<Long> = offset.getOptional("offset")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun registries(): Optional<List<RegistryResponse>> = registries.getOptional("registries")

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

    /**
     * Returns the raw JSON value of [registries].
     *
     * Unlike [registries], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("registries")
    @ExcludeMissing
    fun _registries(): JsonField<List<RegistryResponse>> = registries

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

        /** Returns a mutable builder for constructing an instance of [RegistryListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RegistryListResponse]. */
    class Builder internal constructor() {

        private var offset: JsonField<Long> = JsonMissing.of()
        private var registries: JsonField<MutableList<RegistryResponse>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(registryListResponse: RegistryListResponse) = apply {
            offset = registryListResponse.offset
            registries = registryListResponse.registries.map { it.toMutableList() }
            additionalProperties = registryListResponse.additionalProperties.toMutableMap()
        }

        fun offset(offset: Long) = offset(JsonField.of(offset))

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

        fun registries(registries: List<RegistryResponse>) = registries(JsonField.of(registries))

        /**
         * Sets [Builder.registries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registries] with a well-typed `List<RegistryResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun registries(registries: JsonField<List<RegistryResponse>>) = apply {
            this.registries = registries.map { it.toMutableList() }
        }

        /**
         * Adds a single [RegistryResponse] to [registries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRegistry(registry: RegistryResponse) = apply {
            registries =
                (registries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("registries", it).add(registry)
                }
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
         * Returns an immutable instance of [RegistryListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RegistryListResponse =
            RegistryListResponse(
                offset,
                (registries ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): RegistryListResponse = apply {
        if (validated) {
            return@apply
        }

        offset()
        registries().ifPresent { it.forEach { it.validate() } }
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
        (if (offset.asKnown().isPresent) 1 else 0) +
            (registries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RegistryListResponse &&
            offset == other.offset &&
            registries == other.registries &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(offset, registries, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RegistryListResponse{offset=$offset, registries=$registries, additionalProperties=$additionalProperties}"
}
