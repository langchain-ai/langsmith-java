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

class BulkDeleteEvaluatorsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val failed: JsonField<List<BulkDeleteEvaluatorFailedItem>>,
    private val succeeded: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("failed")
        @ExcludeMissing
        failed: JsonField<List<BulkDeleteEvaluatorFailedItem>> = JsonMissing.of(),
        @JsonProperty("succeeded")
        @ExcludeMissing
        succeeded: JsonField<List<String>> = JsonMissing.of(),
    ) : this(failed, succeeded, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failed(): Optional<List<BulkDeleteEvaluatorFailedItem>> = failed.getOptional("failed")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun succeeded(): Optional<List<String>> = succeeded.getOptional("succeeded")

    /**
     * Returns the raw JSON value of [failed].
     *
     * Unlike [failed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failed")
    @ExcludeMissing
    fun _failed(): JsonField<List<BulkDeleteEvaluatorFailedItem>> = failed

    /**
     * Returns the raw JSON value of [succeeded].
     *
     * Unlike [succeeded], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("succeeded") @ExcludeMissing fun _succeeded(): JsonField<List<String>> = succeeded

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
         * Returns a mutable builder for constructing an instance of [BulkDeleteEvaluatorsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BulkDeleteEvaluatorsResponse]. */
    class Builder internal constructor() {

        private var failed: JsonField<MutableList<BulkDeleteEvaluatorFailedItem>>? = null
        private var succeeded: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bulkDeleteEvaluatorsResponse: BulkDeleteEvaluatorsResponse) = apply {
            failed = bulkDeleteEvaluatorsResponse.failed.map { it.toMutableList() }
            succeeded = bulkDeleteEvaluatorsResponse.succeeded.map { it.toMutableList() }
            additionalProperties = bulkDeleteEvaluatorsResponse.additionalProperties.toMutableMap()
        }

        fun failed(failed: List<BulkDeleteEvaluatorFailedItem>) = failed(JsonField.of(failed))

        /**
         * Sets [Builder.failed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failed] with a well-typed
         * `List<BulkDeleteEvaluatorFailedItem>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun failed(failed: JsonField<List<BulkDeleteEvaluatorFailedItem>>) = apply {
            this.failed = failed.map { it.toMutableList() }
        }

        /**
         * Adds a single [BulkDeleteEvaluatorFailedItem] to [Builder.failed].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFailed(failed: BulkDeleteEvaluatorFailedItem) = apply {
            this.failed =
                (this.failed ?: JsonField.of(mutableListOf())).also {
                    checkKnown("failed", it).add(failed)
                }
        }

        fun succeeded(succeeded: List<String>) = succeeded(JsonField.of(succeeded))

        /**
         * Sets [Builder.succeeded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.succeeded] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun succeeded(succeeded: JsonField<List<String>>) = apply {
            this.succeeded = succeeded.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.succeeded].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSucceeded(succeeded: String) = apply {
            this.succeeded =
                (this.succeeded ?: JsonField.of(mutableListOf())).also {
                    checkKnown("succeeded", it).add(succeeded)
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
         * Returns an immutable instance of [BulkDeleteEvaluatorsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BulkDeleteEvaluatorsResponse =
            BulkDeleteEvaluatorsResponse(
                (failed ?: JsonMissing.of()).map { it.toImmutable() },
                (succeeded ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): BulkDeleteEvaluatorsResponse = apply {
        if (validated) {
            return@apply
        }

        failed().ifPresent { it.forEach { it.validate() } }
        succeeded()
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
        (failed.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (succeeded.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BulkDeleteEvaluatorsResponse &&
            failed == other.failed &&
            succeeded == other.succeeded &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(failed, succeeded, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkDeleteEvaluatorsResponse{failed=$failed, succeeded=$succeeded, additionalProperties=$additionalProperties}"
}
