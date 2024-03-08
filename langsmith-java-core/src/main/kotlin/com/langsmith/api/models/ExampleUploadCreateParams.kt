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

class ExampleUploadCreateParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val datasetId: String, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val file: String,
    private val inputKeys: List<String>,
    private val outputKeys: List<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun datasetId(): String = datasetId // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun file(): String = file

    fun inputKeys(): List<String> = inputKeys

    fun outputKeys(): Optional<List<String>> = Optional.ofNullable(outputKeys)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:165:16
    internal fun getBody(): ExampleUploadCreateBody { // templates/JavaSDK/entities/params.ts:165:16
        return ExampleUploadCreateBody( // templates/JavaSDK/entities/params.ts:180:26 //
            // templates/JavaSDK/entities/params.ts:179:24
            file, // templates/JavaSDK/entities/params.ts:180:26
            inputKeys,
            outputKeys,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String { // templates/JavaSDK/entities/params.ts:555:13
        return when (index) { // templates/JavaSDK/entities/params.ts:560:26
            0 -> datasetId // templates/JavaSDK/entities/params.ts:560:26 //
            // templates/JavaSDK/entities/params.ts:560:26
            else -> ""
        }
    }

    @JsonDeserialize(
        builder = ExampleUploadCreateBody.Builder::class
    ) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    // // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    @NoAutoDetect
    class ExampleUploadCreateBody
    internal constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val file: String?, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val inputKeys: List<String>?,
        private val outputKeys: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("file") // templates/JavaSDK/entities/objects.ts:113:14
        fun file(): String? = file

        @JsonProperty("input_keys") // templates/JavaSDK/entities/objects.ts:113:14
        fun inputKeys(): List<String>? = inputKeys

        @JsonProperty("output_keys") // templates/JavaSDK/entities/objects.ts:113:14
        fun outputKeys(): List<String>? = outputKeys

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is
                ExampleUploadCreateBody && // templates/JavaSDK/entities/fields.ts:143:33
                this.file == other.file &&
                this.inputKeys == other.inputKeys &&
                this.outputKeys == other.outputKeys &&
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
                        file, // templates/JavaSDK/entities/fields.ts:163:19
                        inputKeys,
                        outputKeys,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ExampleUploadCreateBody{file=$file, inputKeys=$inputKeys, outputKeys=$outputKeys, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var file: String? = null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var inputKeys: List<String>? = null
            private var outputKeys: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(exampleUploadCreateBody: ExampleUploadCreateBody) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.file =
                        exampleUploadCreateBody
                            .file // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.inputKeys = exampleUploadCreateBody.inputKeys
                    this.outputKeys = exampleUploadCreateBody.outputKeys
                    additionalProperties(exampleUploadCreateBody.additionalProperties)
                }

            @JsonProperty("file") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun file(file: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.file = file
            }

            @JsonProperty("input_keys") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun inputKeys(inputKeys: List<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.inputKeys = inputKeys
                }

            @JsonProperty("output_keys") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun outputKeys(outputKeys: List<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.outputKeys = outputKeys
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

            fun build(): ExampleUploadCreateBody =
                ExampleUploadCreateBody( // templates/JavaSDK/entities/objects.ts:326:30
                    checkNotNull(file) { // templates/JavaSDK/entities/objects.ts:358:13 //
                        // templates/JavaSDK/entities/objects.ts:326:30
                        "`file` is required but was not set"
                    },
                    checkNotNull(inputKeys) { // templates/JavaSDK/entities/objects.ts:358:13
                            "`inputKeys` is required but was not set"
                        }
                        .toUnmodifiable(),
                    outputKeys?.toUnmodifiable(),
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

        return other is ExampleUploadCreateParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.datasetId == other.datasetId &&
            this.file == other.file &&
            this.inputKeys == other.inputKeys &&
            this.outputKeys == other.outputKeys &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            datasetId, // templates/JavaSDK/entities/fields.ts:163:19
            file,
            inputKeys,
            outputKeys,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ExampleUploadCreateParams{datasetId=$datasetId, file=$file, inputKeys=$inputKeys, outputKeys=$outputKeys, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var datasetId: String? = null // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
        private var file: String? = null
        private var inputKeys: MutableList<String> = mutableListOf()
        private var outputKeys: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(exampleUploadCreateParams: ExampleUploadCreateParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.datasetId =
                    exampleUploadCreateParams
                        .datasetId // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.file = exampleUploadCreateParams.file
                this.inputKeys(exampleUploadCreateParams.inputKeys)
                this.outputKeys(exampleUploadCreateParams.outputKeys ?: listOf())
                additionalQueryParams(exampleUploadCreateParams.additionalQueryParams)
                additionalHeaders(exampleUploadCreateParams.additionalHeaders)
                additionalBodyProperties(exampleUploadCreateParams.additionalBodyProperties)
            }

        fun datasetId(datasetId: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.datasetId = datasetId
        }

        fun file(file: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.file = file
        }

        fun inputKeys(inputKeys: List<String>) =
            apply { // templates/JavaSDK/entities/params.ts:609:26
                this.inputKeys.clear() // templates/JavaSDK/entities/params.ts:609:26 //
                // templates/JavaSDK/entities/params.ts:609:26
                this.inputKeys.addAll(inputKeys)
            }

        fun addInputKey(inputKey: String) = apply { // templates/JavaSDK/entities/params.ts:620:26
            this.inputKeys.add(inputKey)
        }

        fun outputKeys(outputKeys: List<String>) =
            apply { // templates/JavaSDK/entities/params.ts:609:26
                this.outputKeys.clear() // templates/JavaSDK/entities/params.ts:609:26 //
                // templates/JavaSDK/entities/params.ts:609:26
                this.outputKeys.addAll(outputKeys)
            }

        fun addOutputKey(outputKey: String) = apply { // templates/JavaSDK/entities/params.ts:620:26
            this.outputKeys.add(outputKey)
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

        fun build(): ExampleUploadCreateParams =
            ExampleUploadCreateParams( // templates/JavaSDK/entities/params.ts:683:22
                checkNotNull(datasetId) { // templates/JavaSDK/entities/params.ts:844:13 //
                    // templates/JavaSDK/entities/params.ts:683:22
                    "`datasetId` is required but was not set"
                },
                checkNotNull(file) { // templates/JavaSDK/entities/params.ts:844:13
                    "`file` is required but was not set"
                },
                checkNotNull(inputKeys) { // templates/JavaSDK/entities/params.ts:844:13
                        "`inputKeys` is required but was not set"
                    }
                    .toUnmodifiable(),
                if (outputKeys.size == 0) null else outputKeys.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
