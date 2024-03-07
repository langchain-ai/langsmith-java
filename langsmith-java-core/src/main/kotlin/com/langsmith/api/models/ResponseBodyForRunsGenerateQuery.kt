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

@JsonDeserialize(builder = ResponseBodyForRunsGenerateQuery.Builder::class)
@NoAutoDetect
class ResponseBodyForRunsGenerateQuery
private constructor(
    private val filter: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun filter(): String = filter.getRequired("filter")

    @JsonProperty("filter") @ExcludeMissing fun _filter() = filter

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ResponseBodyForRunsGenerateQuery = apply {
        if (!validated) {
            filter()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ResponseBodyForRunsGenerateQuery &&
            this.filter == other.filter &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(filter, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "ResponseBodyForRunsGenerateQuery{filter=$filter, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var filter: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(responseBodyForRunsGenerateQuery: ResponseBodyForRunsGenerateQuery) =
            apply {
                this.filter = responseBodyForRunsGenerateQuery.filter
                additionalProperties(responseBodyForRunsGenerateQuery.additionalProperties)
            }

        fun filter(filter: String) = filter(JsonField.of(filter))

        @JsonProperty("filter")
        @ExcludeMissing
        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

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

        fun build(): ResponseBodyForRunsGenerateQuery =
            ResponseBodyForRunsGenerateQuery(filter, additionalProperties.toUnmodifiable())
    }
}
