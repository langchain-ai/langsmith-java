// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import java.util.Objects

/** Size of an Annotation Queue */
@JsonDeserialize(builder = AnnotationQueueSizeSchema.Builder::class)
@NoAutoDetect
class AnnotationQueueSizeSchema
private constructor(
    private val size: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun size(): Long = size.getRequired("size")

    @JsonProperty("size") @ExcludeMissing fun _size() = size

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AnnotationQueueSizeSchema = apply {
        if (!validated) {
            size()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnnotationQueueSizeSchema &&
            this.size == other.size &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(size, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "AnnotationQueueSizeSchema{size=$size, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var size: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(annotationQueueSizeSchema: AnnotationQueueSizeSchema) = apply {
            this.size = annotationQueueSizeSchema.size
            additionalProperties(annotationQueueSizeSchema.additionalProperties)
        }

        fun size(size: Long) = size(JsonField.of(size))

        @JsonProperty("size")
        @ExcludeMissing
        fun size(size: JsonField<Long>) = apply { this.size = size }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): AnnotationQueueSizeSchema =
            AnnotationQueueSizeSchema(size, additionalProperties.toUnmodifiable())
    }
}
