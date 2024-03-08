// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.models.*
import java.util.Objects
import java.util.Optional

class ExampleUpdateParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val exampleId: String, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val datasetId: String?,
    private val inputs: JsonValue?,
    private val outputs: JsonValue?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun exampleId(): String = exampleId // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    fun inputs(): Optional<JsonValue> = Optional.ofNullable(inputs)

    fun outputs(): Optional<JsonValue> = Optional.ofNullable(outputs)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:165:16
    internal fun getBody(): ExampleUpdateBody { // templates/JavaSDK/entities/params.ts:165:16
        return ExampleUpdateBody( // templates/JavaSDK/entities/params.ts:180:26 //
            // templates/JavaSDK/entities/params.ts:179:24
            datasetId, // templates/JavaSDK/entities/params.ts:180:26
            inputs,
            outputs,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String { // templates/JavaSDK/entities/params.ts:555:13
        return when (index) { // templates/JavaSDK/entities/params.ts:560:26
            0 -> exampleId // templates/JavaSDK/entities/params.ts:560:26 //
            // templates/JavaSDK/entities/params.ts:560:26
            else -> ""
        }
    }

    /** Update class for Example. */
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    @JsonDeserialize(builder = ExampleUpdateBody.Builder::class)
    @NoAutoDetect
    class ExampleUpdateBody
    internal constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val datasetId: String?, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val inputs: JsonValue?,
        private val outputs: JsonValue?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("dataset_id") // templates/JavaSDK/entities/objects.ts:113:14
        fun datasetId(): String? = datasetId

        @JsonProperty("inputs") // templates/JavaSDK/entities/objects.ts:113:14
        fun inputs(): JsonValue? = inputs

        @JsonProperty("outputs") // templates/JavaSDK/entities/objects.ts:113:14
        fun outputs(): JsonValue? = outputs

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is ExampleUpdateBody && // templates/JavaSDK/entities/fields.ts:143:33
                this.datasetId == other.datasetId &&
                this.inputs == other.inputs &&
                this.outputs == other.outputs &&
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
                        datasetId, // templates/JavaSDK/entities/fields.ts:163:19
                        inputs,
                        outputs,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ExampleUpdateBody{datasetId=$datasetId, inputs=$inputs, outputs=$outputs, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var datasetId: String? = null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var inputs: JsonValue? = null
            private var outputs: JsonValue? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(exampleUpdateBody: ExampleUpdateBody) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.datasetId =
                        exampleUpdateBody
                            .datasetId // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.inputs = exampleUpdateBody.inputs
                    this.outputs = exampleUpdateBody.outputs
                    additionalProperties(exampleUpdateBody.additionalProperties)
                }

            @JsonProperty("dataset_id") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun datasetId(datasetId: String) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.datasetId = datasetId
                }

            @JsonProperty("inputs") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun inputs(inputs: JsonValue) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.inputs = inputs
            }

            @JsonProperty("outputs") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun outputs(outputs: JsonValue) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.outputs = outputs
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

            fun build(): ExampleUpdateBody =
                ExampleUpdateBody( // templates/JavaSDK/entities/objects.ts:326:30
                    datasetId, // templates/JavaSDK/entities/objects.ts:326:30
                    inputs,
                    outputs,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is ExampleUpdateParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.exampleId == other.exampleId &&
            this.datasetId == other.datasetId &&
            this.inputs == other.inputs &&
            this.outputs == other.outputs &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            exampleId, // templates/JavaSDK/entities/fields.ts:163:19
            datasetId,
            inputs,
            outputs,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ExampleUpdateParams{exampleId=$exampleId, datasetId=$datasetId, inputs=$inputs, outputs=$outputs, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var exampleId: String? = null // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
        private var datasetId: String? = null
        private var inputs: JsonValue? = null
        private var outputs: JsonValue? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(exampleUpdateParams: ExampleUpdateParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.exampleId =
                    exampleUpdateParams.exampleId // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.datasetId = exampleUpdateParams.datasetId
                this.inputs = exampleUpdateParams.inputs
                this.outputs = exampleUpdateParams.outputs
                additionalQueryParams(exampleUpdateParams.additionalQueryParams)
                additionalHeaders(exampleUpdateParams.additionalHeaders)
                additionalBodyProperties(exampleUpdateParams.additionalBodyProperties)
            }

        fun exampleId(exampleId: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.exampleId = exampleId
        }

        fun datasetId(datasetId: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.datasetId = datasetId
        }

        fun inputs(inputs: JsonValue) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.inputs = inputs
        }

        fun outputs(outputs: JsonValue) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.outputs = outputs
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:703:24
                this.additionalQueryParams.clear() // templates/JavaSDK/entities/params.ts:703:24 //
                // templates/JavaSDK/entities/params.ts:703:24
                putAllQueryParams(additionalQueryParams)
            }

        fun putQueryParam(name: String, value: String) =
            apply { // templates/JavaSDK/entities/params.ts:713:24
                this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
            }

        fun putQueryParams(name: String, values: Iterable<String>) =
            apply { // templates/JavaSDK/entities/params.ts:723:24
                this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
            }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:733:24
                additionalQueryParams.forEach(this::putQueryParams)
            }

        fun removeQueryParam(name: String) = apply { // templates/JavaSDK/entities/params.ts:743:24
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:755:24
                this.additionalHeaders.clear() // templates/JavaSDK/entities/params.ts:755:24 //
                // templates/JavaSDK/entities/params.ts:755:24
                putAllHeaders(additionalHeaders)
            }

        fun putHeader(name: String, value: String) =
            apply { // templates/JavaSDK/entities/params.ts:765:24
                this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
            }

        fun putHeaders(name: String, values: Iterable<String>) =
            apply { // templates/JavaSDK/entities/params.ts:775:24
                this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
            }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:785:24
                additionalHeaders.forEach(this::putHeaders)
            }

        fun removeHeader(name: String) = apply { // templates/JavaSDK/entities/params.ts:795:24
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/params.ts:809:28
                this.additionalBodyProperties
                    .clear() // templates/JavaSDK/entities/params.ts:809:28 //
                // templates/JavaSDK/entities/params.ts:809:28
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply { // templates/JavaSDK/entities/params.ts:822:28
                this.additionalBodyProperties.put(key, value)
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/params.ts:832:28
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): ExampleUpdateParams =
            ExampleUpdateParams( // templates/JavaSDK/entities/params.ts:683:22
                checkNotNull(exampleId) { // templates/JavaSDK/entities/params.ts:844:13 //
                    // templates/JavaSDK/entities/params.ts:683:22
                    "`exampleId` is required but was not set"
                },
                datasetId,
                inputs,
                outputs,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
