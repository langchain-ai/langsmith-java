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
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OnlineEvaluatorListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val evaluators: JsonField<List<OnlineEvaluator>>,
    private val total: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("evaluators")
        @ExcludeMissing
        evaluators: JsonField<List<OnlineEvaluator>> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
    ) : this(evaluators, total, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluators(): Optional<List<OnlineEvaluator>> = evaluators.getOptional("evaluators")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun total(): Optional<Long> = total.getOptional("total")

    /**
     * Returns the raw JSON value of [evaluators].
     *
     * Unlike [evaluators], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evaluators")
    @ExcludeMissing
    fun _evaluators(): JsonField<List<OnlineEvaluator>> = evaluators

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

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
         * [OnlineEvaluatorListPageResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnlineEvaluatorListPageResponse]. */
    class Builder internal constructor() {

        private var evaluators: JsonField<MutableList<OnlineEvaluator>>? = null
        private var total: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onlineEvaluatorListPageResponse: OnlineEvaluatorListPageResponse) =
            apply {
                evaluators = onlineEvaluatorListPageResponse.evaluators.map { it.toMutableList() }
                total = onlineEvaluatorListPageResponse.total
                additionalProperties =
                    onlineEvaluatorListPageResponse.additionalProperties.toMutableMap()
            }

        fun evaluators(evaluators: List<OnlineEvaluator>) = evaluators(JsonField.of(evaluators))

        /**
         * Sets [Builder.evaluators] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluators] with a well-typed `List<OnlineEvaluator>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun evaluators(evaluators: JsonField<List<OnlineEvaluator>>) = apply {
            this.evaluators = evaluators.map { it.toMutableList() }
        }

        /**
         * Adds a single [OnlineEvaluator] to [evaluators].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvaluator(evaluator: OnlineEvaluator) = apply {
            evaluators =
                (evaluators ?: JsonField.of(mutableListOf())).also {
                    checkKnown("evaluators", it).add(evaluator)
                }
        }

        fun total(total: Long) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Long>) = apply { this.total = total }

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
         * Returns an immutable instance of [OnlineEvaluatorListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OnlineEvaluatorListPageResponse =
            OnlineEvaluatorListPageResponse(
                (evaluators ?: JsonMissing.of()).map { it.toImmutable() },
                total,
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
    fun validate(): OnlineEvaluatorListPageResponse = apply {
        if (validated) {
            return@apply
        }

        evaluators().ifPresent { it.forEach { it.validate() } }
        total()
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
        (evaluators.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (total.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnlineEvaluatorListPageResponse &&
            evaluators == other.evaluators &&
            total == other.total &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(evaluators, total, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OnlineEvaluatorListPageResponse{evaluators=$evaluators, total=$total, additionalProperties=$additionalProperties}"
}
