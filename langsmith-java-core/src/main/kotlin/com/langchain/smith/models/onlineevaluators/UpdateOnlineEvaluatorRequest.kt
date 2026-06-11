// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UpdateOnlineEvaluatorRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val codeEvaluator: JsonField<UpdateOnlineCodeEvaluatorRequest>,
    private val llmEvaluator: JsonField<UpdateOnlineLlmEvaluatorRequest>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code_evaluator")
        @ExcludeMissing
        codeEvaluator: JsonField<UpdateOnlineCodeEvaluatorRequest> = JsonMissing.of(),
        @JsonProperty("llm_evaluator")
        @ExcludeMissing
        llmEvaluator: JsonField<UpdateOnlineLlmEvaluatorRequest> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(codeEvaluator, llmEvaluator, name, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun codeEvaluator(): Optional<UpdateOnlineCodeEvaluatorRequest> =
        codeEvaluator.getOptional("code_evaluator")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmEvaluator(): Optional<UpdateOnlineLlmEvaluatorRequest> =
        llmEvaluator.getOptional("llm_evaluator")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Returns the raw JSON value of [codeEvaluator].
     *
     * Unlike [codeEvaluator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code_evaluator")
    @ExcludeMissing
    fun _codeEvaluator(): JsonField<UpdateOnlineCodeEvaluatorRequest> = codeEvaluator

    /**
     * Returns the raw JSON value of [llmEvaluator].
     *
     * Unlike [llmEvaluator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("llm_evaluator")
    @ExcludeMissing
    fun _llmEvaluator(): JsonField<UpdateOnlineLlmEvaluatorRequest> = llmEvaluator

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [UpdateOnlineEvaluatorRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdateOnlineEvaluatorRequest]. */
    class Builder internal constructor() {

        private var codeEvaluator: JsonField<UpdateOnlineCodeEvaluatorRequest> = JsonMissing.of()
        private var llmEvaluator: JsonField<UpdateOnlineLlmEvaluatorRequest> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateOnlineEvaluatorRequest: UpdateOnlineEvaluatorRequest) = apply {
            codeEvaluator = updateOnlineEvaluatorRequest.codeEvaluator
            llmEvaluator = updateOnlineEvaluatorRequest.llmEvaluator
            name = updateOnlineEvaluatorRequest.name
            additionalProperties = updateOnlineEvaluatorRequest.additionalProperties.toMutableMap()
        }

        fun codeEvaluator(codeEvaluator: UpdateOnlineCodeEvaluatorRequest) =
            codeEvaluator(JsonField.of(codeEvaluator))

        /**
         * Sets [Builder.codeEvaluator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.codeEvaluator] with a well-typed
         * [UpdateOnlineCodeEvaluatorRequest] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun codeEvaluator(codeEvaluator: JsonField<UpdateOnlineCodeEvaluatorRequest>) = apply {
            this.codeEvaluator = codeEvaluator
        }

        fun llmEvaluator(llmEvaluator: UpdateOnlineLlmEvaluatorRequest) =
            llmEvaluator(JsonField.of(llmEvaluator))

        /**
         * Sets [Builder.llmEvaluator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmEvaluator] with a well-typed
         * [UpdateOnlineLlmEvaluatorRequest] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun llmEvaluator(llmEvaluator: JsonField<UpdateOnlineLlmEvaluatorRequest>) = apply {
            this.llmEvaluator = llmEvaluator
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [UpdateOnlineEvaluatorRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UpdateOnlineEvaluatorRequest =
            UpdateOnlineEvaluatorRequest(
                codeEvaluator,
                llmEvaluator,
                name,
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
    fun validate(): UpdateOnlineEvaluatorRequest = apply {
        if (validated) {
            return@apply
        }

        codeEvaluator().ifPresent { it.validate() }
        llmEvaluator().ifPresent { it.validate() }
        name()
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
        (codeEvaluator.asKnown().getOrNull()?.validity() ?: 0) +
            (llmEvaluator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateOnlineEvaluatorRequest &&
            codeEvaluator == other.codeEvaluator &&
            llmEvaluator == other.llmEvaluator &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(codeEvaluator, llmEvaluator, name, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateOnlineEvaluatorRequest{codeEvaluator=$codeEvaluator, llmEvaluator=$llmEvaluator, name=$name, additionalProperties=$additionalProperties}"
}
