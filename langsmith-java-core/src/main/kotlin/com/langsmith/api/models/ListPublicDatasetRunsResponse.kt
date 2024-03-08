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
import java.util.Optional

@JsonDeserialize(builder = ListPublicDatasetRunsResponse.Builder::class)
@NoAutoDetect
class ListPublicDatasetRunsResponse
private constructor(
    private val runs: JsonField<List<RunPublicDatasetSchema>>,
    private val cursors: JsonField<Cursors>,
    private val parsedQuery: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun runs(): List<RunPublicDatasetSchema> = runs.getRequired("runs")

    fun cursors(): Cursors = cursors.getRequired("cursors")

    fun parsedQuery(): Optional<String> =
        Optional.ofNullable(parsedQuery.getNullable("parsed_query"))

    @JsonProperty("runs") @ExcludeMissing fun _runs() = runs

    @JsonProperty("cursors") @ExcludeMissing fun _cursors() = cursors

    @JsonProperty("parsed_query") @ExcludeMissing fun _parsedQuery() = parsedQuery

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ListPublicDatasetRunsResponse = apply {
        if (!validated) {
            runs().forEach { it.validate() }
            cursors().validate()
            parsedQuery()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListPublicDatasetRunsResponse &&
            this.runs == other.runs &&
            this.cursors == other.cursors &&
            this.parsedQuery == other.parsedQuery &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    runs,
                    cursors,
                    parsedQuery,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ListPublicDatasetRunsResponse{runs=$runs, cursors=$cursors, parsedQuery=$parsedQuery, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var runs: JsonField<List<RunPublicDatasetSchema>> = JsonMissing.of()
        private var cursors: JsonField<Cursors> = JsonMissing.of()
        private var parsedQuery: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listPublicDatasetRunsResponse: ListPublicDatasetRunsResponse) = apply {
            this.runs = listPublicDatasetRunsResponse.runs
            this.cursors = listPublicDatasetRunsResponse.cursors
            this.parsedQuery = listPublicDatasetRunsResponse.parsedQuery
            additionalProperties(listPublicDatasetRunsResponse.additionalProperties)
        }

        fun runs(runs: List<RunPublicDatasetSchema>) = runs(JsonField.of(runs))

        @JsonProperty("runs")
        @ExcludeMissing
        fun runs(runs: JsonField<List<RunPublicDatasetSchema>>) = apply { this.runs = runs }

        fun cursors(cursors: Cursors) = cursors(JsonField.of(cursors))

        @JsonProperty("cursors")
        @ExcludeMissing
        fun cursors(cursors: JsonField<Cursors>) = apply { this.cursors = cursors }

        fun parsedQuery(parsedQuery: String) = parsedQuery(JsonField.of(parsedQuery))

        @JsonProperty("parsed_query")
        @ExcludeMissing
        fun parsedQuery(parsedQuery: JsonField<String>) = apply { this.parsedQuery = parsedQuery }

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

        fun build(): ListPublicDatasetRunsResponse =
            ListPublicDatasetRunsResponse(
                runs.map { it.toUnmodifiable() },
                cursors,
                parsedQuery,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Cursors.Builder::class)
    @NoAutoDetect
    class Cursors
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Cursors = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cursors && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Cursors{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cursors: Cursors) = apply {
                additionalProperties(cursors.additionalProperties)
            }

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

            fun build(): Cursors = Cursors(additionalProperties.toUnmodifiable())
        }
    }
}
