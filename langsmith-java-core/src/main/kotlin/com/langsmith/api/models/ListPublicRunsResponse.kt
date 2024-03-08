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

@JsonDeserialize(builder = ListPublicRunsResponse.Builder::class)
@NoAutoDetect
class ListPublicRunsResponse
private constructor(
    private val runs: JsonField<List<RunPublicSchema>>,
    private val cursors: JsonField<Cursors>,
    private val parsedQuery: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun runs(): List<RunPublicSchema> = runs.getRequired("runs")

    fun cursors(): Cursors = cursors.getRequired("cursors")

    fun parsedQuery(): Optional<String> =
        Optional.ofNullable(parsedQuery.getNullable("parsed_query"))

    @JsonProperty("runs") @ExcludeMissing fun _runs() = runs

    @JsonProperty("cursors") @ExcludeMissing fun _cursors() = cursors

    @JsonProperty("parsed_query") @ExcludeMissing fun _parsedQuery() = parsedQuery

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ListPublicRunsResponse = apply {
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

        return other is ListPublicRunsResponse &&
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
        "ListPublicRunsResponse{runs=$runs, cursors=$cursors, parsedQuery=$parsedQuery, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var runs: JsonField<List<RunPublicSchema>> = JsonMissing.of()
        private var cursors: JsonField<Cursors> = JsonMissing.of()
        private var parsedQuery: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listPublicRunsResponse: ListPublicRunsResponse) = apply {
            this.runs = listPublicRunsResponse.runs
            this.cursors = listPublicRunsResponse.cursors
            this.parsedQuery = listPublicRunsResponse.parsedQuery
            additionalProperties(listPublicRunsResponse.additionalProperties)
        }

        fun runs(runs: List<RunPublicSchema>) = runs(JsonField.of(runs))

        @JsonProperty("runs")
        @ExcludeMissing
        fun runs(runs: JsonField<List<RunPublicSchema>>) = apply { this.runs = runs }

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

        fun build(): ListPublicRunsResponse =
            ListPublicRunsResponse(
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
