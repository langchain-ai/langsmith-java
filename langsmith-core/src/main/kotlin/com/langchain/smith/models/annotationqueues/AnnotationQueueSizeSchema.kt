// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects

/** Size of an Annotation Queue */
class AnnotationQueueSizeSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val size: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of()
    ) : this(size, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun size(): Long = size.getRequired("size")

    /**
     * Returns the raw JSON value of [size].
     *
     * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Long> = size

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
         * Returns a mutable builder for constructing an instance of [AnnotationQueueSizeSchema].
         *
         * The following fields are required:
         * ```java
         * .size()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnnotationQueueSizeSchema]. */
    class Builder internal constructor() {

        private var size: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(annotationQueueSizeSchema: AnnotationQueueSizeSchema) = apply {
            size = annotationQueueSizeSchema.size
            additionalProperties = annotationQueueSizeSchema.additionalProperties.toMutableMap()
        }

        fun size(size: Long) = size(JsonField.of(size))

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun size(size: JsonField<Long>) = apply { this.size = size }

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
         * Returns an immutable instance of [AnnotationQueueSizeSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .size()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AnnotationQueueSizeSchema =
            AnnotationQueueSizeSchema(
                checkRequired("size", size),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AnnotationQueueSizeSchema = apply {
        if (validated) {
            return@apply
        }

        size()
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
    @JvmSynthetic internal fun validity(): Int = (if (size.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnnotationQueueSizeSchema &&
            size == other.size &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(size, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnnotationQueueSizeSchema{size=$size, additionalProperties=$additionalProperties}"
}
