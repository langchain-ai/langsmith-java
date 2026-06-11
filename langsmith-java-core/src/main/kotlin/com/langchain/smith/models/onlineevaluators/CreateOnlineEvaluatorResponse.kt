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

class CreateOnlineEvaluatorResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val evaluator: JsonField<OnlineEvaluator>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("evaluator")
        @ExcludeMissing
        evaluator: JsonField<OnlineEvaluator> = JsonMissing.of()
    ) : this(evaluator, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluator(): Optional<OnlineEvaluator> = evaluator.getOptional("evaluator")

    /**
     * Returns the raw JSON value of [evaluator].
     *
     * Unlike [evaluator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evaluator")
    @ExcludeMissing
    fun _evaluator(): JsonField<OnlineEvaluator> = evaluator

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
         * [CreateOnlineEvaluatorResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreateOnlineEvaluatorResponse]. */
    class Builder internal constructor() {

        private var evaluator: JsonField<OnlineEvaluator> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createOnlineEvaluatorResponse: CreateOnlineEvaluatorResponse) = apply {
            evaluator = createOnlineEvaluatorResponse.evaluator
            additionalProperties = createOnlineEvaluatorResponse.additionalProperties.toMutableMap()
        }

        fun evaluator(evaluator: OnlineEvaluator) = evaluator(JsonField.of(evaluator))

        /**
         * Sets [Builder.evaluator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluator] with a well-typed [OnlineEvaluator] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evaluator(evaluator: JsonField<OnlineEvaluator>) = apply { this.evaluator = evaluator }

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
         * Returns an immutable instance of [CreateOnlineEvaluatorResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CreateOnlineEvaluatorResponse =
            CreateOnlineEvaluatorResponse(evaluator, additionalProperties.toMutableMap())
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
    fun validate(): CreateOnlineEvaluatorResponse = apply {
        if (validated) {
            return@apply
        }

        evaluator().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (evaluator.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateOnlineEvaluatorResponse &&
            evaluator == other.evaluator &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(evaluator, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateOnlineEvaluatorResponse{evaluator=$evaluator, additionalProperties=$additionalProperties}"
}
