// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.platform.datasets.examples

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

class ExampleUploadResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val count: JsonField<Long>,
    private val exampleIds: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("example_ids")
        @ExcludeMissing
        exampleIds: JsonField<List<String>> = JsonMissing.of(),
    ) : this(count, exampleIds, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun count(): Optional<Long> = count.getOptional("count")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exampleIds(): Optional<List<String>> = exampleIds.getOptional("example_ids")

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

    /**
     * Returns the raw JSON value of [exampleIds].
     *
     * Unlike [exampleIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("example_ids")
    @ExcludeMissing
    fun _exampleIds(): JsonField<List<String>> = exampleIds

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

        /** Returns a mutable builder for constructing an instance of [ExampleUploadResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExampleUploadResponse]. */
    class Builder internal constructor() {

        private var count: JsonField<Long> = JsonMissing.of()
        private var exampleIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(exampleUploadResponse: ExampleUploadResponse) = apply {
            count = exampleUploadResponse.count
            exampleIds = exampleUploadResponse.exampleIds.map { it.toMutableList() }
            additionalProperties = exampleUploadResponse.additionalProperties.toMutableMap()
        }

        fun count(count: Long) = count(JsonField.of(count))

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Long>) = apply { this.count = count }

        fun exampleIds(exampleIds: List<String>) = exampleIds(JsonField.of(exampleIds))

        /**
         * Sets [Builder.exampleIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exampleIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exampleIds(exampleIds: JsonField<List<String>>) = apply {
            this.exampleIds = exampleIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [exampleIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExampleId(exampleId: String) = apply {
            exampleIds =
                (exampleIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("exampleIds", it).add(exampleId)
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
         * Returns an immutable instance of [ExampleUploadResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExampleUploadResponse =
            ExampleUploadResponse(
                count,
                (exampleIds ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExampleUploadResponse = apply {
        if (validated) {
            return@apply
        }

        count()
        exampleIds()
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
        (if (count.asKnown().isPresent) 1 else 0) + (exampleIds.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExampleUploadResponse &&
            count == other.count &&
            exampleIds == other.exampleIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(count, exampleIds, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExampleUploadResponse{count=$count, exampleIds=$exampleIds, additionalProperties=$additionalProperties}"
}
