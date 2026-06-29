// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

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

class SandboxListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val offset: JsonField<Long>,
    private val sandboxes: JsonField<List<SandboxResponse>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("sandboxes")
        @ExcludeMissing
        sandboxes: JsonField<List<SandboxResponse>> = JsonMissing.of(),
    ) : this(offset, sandboxes, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<Long> = offset.getOptional("offset")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sandboxes(): Optional<List<SandboxResponse>> = sandboxes.getOptional("sandboxes")

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

    /**
     * Returns the raw JSON value of [sandboxes].
     *
     * Unlike [sandboxes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sandboxes")
    @ExcludeMissing
    fun _sandboxes(): JsonField<List<SandboxResponse>> = sandboxes

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

        /** Returns a mutable builder for constructing an instance of [SandboxListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SandboxListResponse]. */
    class Builder internal constructor() {

        private var offset: JsonField<Long> = JsonMissing.of()
        private var sandboxes: JsonField<MutableList<SandboxResponse>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sandboxListResponse: SandboxListResponse) = apply {
            offset = sandboxListResponse.offset
            sandboxes = sandboxListResponse.sandboxes.map { it.toMutableList() }
            additionalProperties = sandboxListResponse.additionalProperties.toMutableMap()
        }

        fun offset(offset: Long) = offset(JsonField.of(offset))

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

        fun sandboxes(sandboxes: List<SandboxResponse>) = sandboxes(JsonField.of(sandboxes))

        /**
         * Sets [Builder.sandboxes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sandboxes] with a well-typed `List<SandboxResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sandboxes(sandboxes: JsonField<List<SandboxResponse>>) = apply {
            this.sandboxes = sandboxes.map { it.toMutableList() }
        }

        /**
         * Adds a single [SandboxResponse] to [sandboxes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSandbox(sandbox: SandboxResponse) = apply {
            sandboxes =
                (sandboxes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sandboxes", it).add(sandbox)
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
         * Returns an immutable instance of [SandboxListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SandboxListResponse =
            SandboxListResponse(
                offset,
                (sandboxes ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): SandboxListResponse = apply {
        if (validated) {
            return@apply
        }

        offset()
        sandboxes().ifPresent { it.forEach { it.validate() } }
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
            (sandboxes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SandboxListResponse &&
            offset == other.offset &&
            sandboxes == other.sandboxes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(offset, sandboxes, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SandboxListResponse{offset=$offset, sandboxes=$sandboxes, additionalProperties=$additionalProperties}"
}
