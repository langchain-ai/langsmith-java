// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
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

@JsonDeserialize(
    builder = ListRunsResponse.Builder::class
) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@NoAutoDetect
class ListRunsResponse
private constructor( // templates/JavaSDK/entities/objects.ts:76:13
    private val runs: JsonField<List<RunSchema>>, // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    private val cursors: JsonField<Cursors>,
    private val parsedQuery: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

    private var hashCode: Int = 0

    fun runs(): List<RunSchema> = runs.getRequired("runs")

    fun cursors(): Cursors = cursors.getRequired("cursors")

    fun parsedQuery(): Optional<String> =
        Optional.ofNullable(parsedQuery.getNullable("parsed_query"))

    @JsonProperty("runs") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _runs() = runs

    @JsonProperty("cursors") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _cursors() = cursors

    @JsonProperty("parsed_query") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _parsedQuery() = parsedQuery

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ListRunsResponse = apply { // templates/JavaSDK/entities/objects.ts:198:28
        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:198:28 //
            // templates/JavaSDK/entities/objects.ts:198:28
            runs().forEach { it.validate() } // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:201:20
            cursors().validate()
            parsedQuery()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is ListRunsResponse && // templates/JavaSDK/entities/fields.ts:143:33
            this.runs == other.runs &&
            this.cursors == other.cursors &&
            this.parsedQuery == other.parsedQuery &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
            // templates/JavaSDK/entities/fields.ts:174:16 //
            // templates/JavaSDK/entities/fields.ts:174:16
            hashCode =
                Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                    // templates/JavaSDK/entities/fields.ts:175:16 //
                    // templates/JavaSDK/entities/fields.ts:175:16
                    runs, // templates/JavaSDK/entities/fields.ts:163:19
                    cursors,
                    parsedQuery,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ListRunsResponse{runs=$runs, cursors=$cursors, parsedQuery=$parsedQuery, additionalProperties=$additionalProperties}"

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var runs: JsonField<List<RunSchema>> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
        private var cursors: JsonField<Cursors> = JsonMissing.of()
        private var parsedQuery: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(listRunsResponse: ListRunsResponse) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.runs = listRunsResponse.runs // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
                this.cursors = listRunsResponse.cursors
                this.parsedQuery = listRunsResponse.parsedQuery
                additionalProperties(listRunsResponse.additionalProperties)
            }

        fun runs(runs: List<RunSchema>) =
            runs(JsonField.of(runs)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("runs") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun runs(runs: JsonField<List<RunSchema>>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.runs = runs
            }

        fun cursors(cursors: Cursors) =
            cursors(JsonField.of(cursors)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("cursors") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun cursors(cursors: JsonField<Cursors>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.cursors = cursors
            }

        fun parsedQuery(parsedQuery: String) =
            parsedQuery(JsonField.of(parsedQuery)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("parsed_query") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun parsedQuery(parsedQuery: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.parsedQuery = parsedQuery
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.putAll(additionalProperties)
            }

        @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply { // templates/JavaSDK/entities/objects.ts:304:30
                this.additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:316:30
                this.additionalProperties.putAll(additionalProperties)
            }

        fun build(): ListRunsResponse =
            ListRunsResponse( // templates/JavaSDK/entities/objects.ts:326:30
                runs.map { it.toUnmodifiable() }, // templates/JavaSDK/entities/objects.ts:326:30
                cursors,
                parsedQuery,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(
        builder = Cursors.Builder::class
    ) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    // // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    @NoAutoDetect
    class Cursors
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        private var hashCode: Int = 0

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Cursors = apply { // templates/JavaSDK/entities/objects.ts:198:28
            if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:198:28 //
                // templates/JavaSDK/entities/objects.ts:198:28
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is Cursors && // templates/JavaSDK/entities/fields.ts:143:33
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
                // templates/JavaSDK/entities/fields.ts:174:16 //
                // templates/JavaSDK/entities/fields.ts:174:16
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Cursors{additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var additionalProperties: MutableMap<String, JsonValue> =
                mutableMapOf() // templates/JavaSDK/entities/objects.ts:224:10

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(cursors: Cursors) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    additionalProperties(cursors.additionalProperties)
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties
                        .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                    // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply { // templates/JavaSDK/entities/objects.ts:304:30
                    this.additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:316:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): Cursors = Cursors(additionalProperties.toUnmodifiable())
        }
    }
}
