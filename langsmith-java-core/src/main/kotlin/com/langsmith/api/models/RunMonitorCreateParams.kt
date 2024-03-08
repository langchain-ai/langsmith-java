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

class RunMonitorCreateParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val groups: List<MonitorGroupSpec>, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val interval: Interval?,
    private val stride: Stride?,
    private val timezone: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun groups(): List<MonitorGroupSpec> = groups // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun interval(): Optional<Interval> = Optional.ofNullable(interval)

    fun stride(): Optional<Stride> = Optional.ofNullable(stride)

    fun timezone(): Optional<String> = Optional.ofNullable(timezone)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:165:16
    internal fun getBody(): RunMonitorCreateBody { // templates/JavaSDK/entities/params.ts:165:16
        return RunMonitorCreateBody( // templates/JavaSDK/entities/params.ts:180:26 //
            // templates/JavaSDK/entities/params.ts:179:24
            groups, // templates/JavaSDK/entities/params.ts:180:26
            interval,
            stride,
            timezone,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(
        builder = RunMonitorCreateBody.Builder::class
    ) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    // // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    @NoAutoDetect
    class RunMonitorCreateBody
    internal constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val groups:
            List<MonitorGroupSpec>?, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val interval: Interval?,
        private val stride: Stride?,
        private val timezone: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("groups") // templates/JavaSDK/entities/objects.ts:113:14
        fun groups(): List<MonitorGroupSpec>? = groups

        /** Timedelta input. */
        @JsonProperty("interval") // templates/JavaSDK/entities/objects.ts:113:14
        fun interval(): Interval? = interval

        /** Timedelta input. */
        @JsonProperty("stride") // templates/JavaSDK/entities/objects.ts:113:14
        fun stride(): Stride? = stride

        @JsonProperty("timezone") // templates/JavaSDK/entities/objects.ts:113:14
        fun timezone(): String? = timezone

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is RunMonitorCreateBody && // templates/JavaSDK/entities/fields.ts:143:33
                this.groups == other.groups &&
                this.interval == other.interval &&
                this.stride == other.stride &&
                this.timezone == other.timezone &&
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
                        groups, // templates/JavaSDK/entities/fields.ts:163:19
                        interval,
                        stride,
                        timezone,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "RunMonitorCreateBody{groups=$groups, interval=$interval, stride=$stride, timezone=$timezone, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var groups: List<MonitorGroupSpec>? =
                null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var interval: Interval? = null
            private var stride: Stride? = null
            private var timezone: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(runMonitorCreateBody: RunMonitorCreateBody) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.groups =
                        runMonitorCreateBody
                            .groups // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.interval = runMonitorCreateBody.interval
                    this.stride = runMonitorCreateBody.stride
                    this.timezone = runMonitorCreateBody.timezone
                    additionalProperties(runMonitorCreateBody.additionalProperties)
                }

            @JsonProperty("groups") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun groups(groups: List<MonitorGroupSpec>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.groups = groups
                }

            /** Timedelta input. */
            // templates/JavaSDK/entities/objects.ts:252:20
            @JsonProperty("interval") // templates/JavaSDK/entities/objects.ts:264:20
            fun interval(interval: Interval) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.interval = interval
                }

            /** Timedelta input. */
            // templates/JavaSDK/entities/objects.ts:252:20
            @JsonProperty("stride") // templates/JavaSDK/entities/objects.ts:264:20
            fun stride(stride: Stride) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.stride = stride
            }

            @JsonProperty("timezone") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun timezone(timezone: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.timezone = timezone
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

            fun build(): RunMonitorCreateBody =
                RunMonitorCreateBody( // templates/JavaSDK/entities/objects.ts:326:30
                    checkNotNull(groups) { // templates/JavaSDK/entities/objects.ts:358:13 //
                            // templates/JavaSDK/entities/objects.ts:326:30
                            "`groups` is required but was not set"
                        }
                        .toUnmodifiable(),
                    interval,
                    stride,
                    timezone,
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

        return other is RunMonitorCreateParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.groups == other.groups &&
            this.interval == other.interval &&
            this.stride == other.stride &&
            this.timezone == other.timezone &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            groups, // templates/JavaSDK/entities/fields.ts:163:19
            interval,
            stride,
            timezone,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "RunMonitorCreateParams{groups=$groups, interval=$interval, stride=$stride, timezone=$timezone, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var groups: MutableList<MonitorGroupSpec> =
            mutableListOf() // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
        private var interval: Interval? = null
        private var stride: Stride? = null
        private var timezone: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(runMonitorCreateParams: RunMonitorCreateParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.groups(
                    runMonitorCreateParams.groups
                ) // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.interval = runMonitorCreateParams.interval
                this.stride = runMonitorCreateParams.stride
                this.timezone = runMonitorCreateParams.timezone
                additionalQueryParams(runMonitorCreateParams.additionalQueryParams)
                additionalHeaders(runMonitorCreateParams.additionalHeaders)
                additionalBodyProperties(runMonitorCreateParams.additionalBodyProperties)
            }

        fun groups(groups: List<MonitorGroupSpec>) =
            apply { // templates/JavaSDK/entities/params.ts:609:26
                this.groups.clear() // templates/JavaSDK/entities/params.ts:609:26 //
                // templates/JavaSDK/entities/params.ts:609:26
                this.groups.addAll(groups)
            }

        fun addGroup(group: MonitorGroupSpec) =
            apply { // templates/JavaSDK/entities/params.ts:620:26
                this.groups.add(group)
            }

        /** Timedelta input. */
        fun interval(interval: Interval) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.interval = interval
        }

        /** Timedelta input. */
        fun stride(stride: Stride) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.stride = stride
        }

        fun timezone(timezone: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.timezone = timezone
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

        fun build(): RunMonitorCreateParams =
            RunMonitorCreateParams( // templates/JavaSDK/entities/params.ts:683:22
                checkNotNull(groups) { // templates/JavaSDK/entities/params.ts:844:13 //
                        // templates/JavaSDK/entities/params.ts:683:22
                        "`groups` is required but was not set"
                    }
                    .toUnmodifiable(),
                interval,
                stride,
                timezone,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(
        builder = MonitorGroupSpec.Builder::class
    ) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    // // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    @NoAutoDetect
    class MonitorGroupSpec
    private constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val session: String?, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val tag: String?,
        private val metadata: Metadata?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("session") // templates/JavaSDK/entities/objects.ts:113:14
        fun session(): String? = session

        @JsonProperty("tag") // templates/JavaSDK/entities/objects.ts:113:14
        fun tag(): String? = tag

        @JsonProperty("metadata") // templates/JavaSDK/entities/objects.ts:113:14
        fun metadata(): Metadata? = metadata

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is MonitorGroupSpec && // templates/JavaSDK/entities/fields.ts:143:33
                this.session == other.session &&
                this.tag == other.tag &&
                this.metadata == other.metadata &&
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
                        session, // templates/JavaSDK/entities/fields.ts:163:19
                        tag,
                        metadata,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "MonitorGroupSpec{session=$session, tag=$tag, metadata=$metadata, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var session: String? = null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var tag: String? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(monitorGroupSpec: MonitorGroupSpec) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.session =
                        monitorGroupSpec.session // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.tag = monitorGroupSpec.tag
                    this.metadata = monitorGroupSpec.metadata
                    additionalProperties(monitorGroupSpec.additionalProperties)
                }

            @JsonProperty("session") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun session(session: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.session = session
            }

            @JsonProperty("tag") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun tag(tag: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.tag = tag
            }

            @JsonProperty("metadata") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun metadata(metadata: Metadata) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.metadata = metadata
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

            fun build(): MonitorGroupSpec =
                MonitorGroupSpec( // templates/JavaSDK/entities/objects.ts:326:30
                    checkNotNull(session) { // templates/JavaSDK/entities/objects.ts:358:13 //
                        // templates/JavaSDK/entities/objects.ts:326:30
                        "`session` is required but was not set"
                    },
                    tag,
                    metadata,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(
            builder = Metadata.Builder::class
        ) // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        @NoAutoDetect
        class Metadata
        private constructor(
            private val key: String?,
            private val value: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
            // templates/JavaSDK/entities/objects.ts:76:13

            @JsonProperty("key") // templates/JavaSDK/entities/objects.ts:113:14
            fun key(): String? = key

            @JsonProperty("value") // templates/JavaSDK/entities/objects.ts:113:14
            fun value(): String? = value

            @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
            // templates/JavaSDK/entities/objects.ts:180:12
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(
                other: Any?
            ): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
                if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                    return true
                }

                return other is Metadata && // templates/JavaSDK/entities/fields.ts:143:33
                    this.key == other.key &&
                    this.value == other.value &&
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
                            key, // templates/JavaSDK/entities/fields.ts:163:19
                            value,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Metadata{key=$key, value=$value, additionalProperties=$additionalProperties}"

            companion object { // templates/JavaSDK/entities/objects.ts:217:10

                @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
                // templates/JavaSDK/entities/objects.ts:217:10
                fun builder() = Builder()
            }

            class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
                // templates/JavaSDK/entities/objects.ts:224:10 //
                // templates/JavaSDK/entities/objects.ts:224:10

                private var key: String? = null // templates/JavaSDK/entities/objects.ts:226:16 //
                // templates/JavaSDK/entities/objects.ts:226:16 //
                // templates/JavaSDK/entities/objects.ts:224:10
                private var value: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
                internal fun from(metadata: Metadata) =
                    apply { // templates/JavaSDK/entities/objects.ts:240:30
                        this.key = metadata.key // templates/JavaSDK/entities/objects.ts:240:30 //
                        // templates/JavaSDK/entities/objects.ts:240:30
                        this.value = metadata.value
                        additionalProperties(metadata.additionalProperties)
                    }

                @JsonProperty("key") // templates/JavaSDK/entities/objects.ts:264:20 //
                // templates/JavaSDK/entities/objects.ts:252:20
                fun key(key: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.key = key
                }

                @JsonProperty("value") // templates/JavaSDK/entities/objects.ts:264:20 //
                // templates/JavaSDK/entities/objects.ts:252:20
                fun value(value: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.value = value
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

                fun build(): Metadata =
                    Metadata( // templates/JavaSDK/entities/objects.ts:326:30
                        checkNotNull(key) { // templates/JavaSDK/entities/objects.ts:358:13 //
                            // templates/JavaSDK/entities/objects.ts:326:30
                            "`key` is required but was not set"
                        },
                        checkNotNull(value) { // templates/JavaSDK/entities/objects.ts:358:13
                            "`value` is required but was not set"
                        },
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }

    /** Timedelta input. */
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    @JsonDeserialize(builder = Interval.Builder::class)
    @NoAutoDetect
    class Interval
    private constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val days: Long?, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val minutes: Long?,
        private val hours: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("days") // templates/JavaSDK/entities/objects.ts:113:14
        fun days(): Long? = days

        @JsonProperty("minutes") // templates/JavaSDK/entities/objects.ts:113:14
        fun minutes(): Long? = minutes

        @JsonProperty("hours") // templates/JavaSDK/entities/objects.ts:113:14
        fun hours(): Long? = hours

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is Interval && // templates/JavaSDK/entities/fields.ts:143:33
                this.days == other.days &&
                this.minutes == other.minutes &&
                this.hours == other.hours &&
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
                        days, // templates/JavaSDK/entities/fields.ts:163:19
                        minutes,
                        hours,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Interval{days=$days, minutes=$minutes, hours=$hours, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var days: Long? = null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var minutes: Long? = null
            private var hours: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(interval: Interval) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.days = interval.days // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.minutes = interval.minutes
                    this.hours = interval.hours
                    additionalProperties(interval.additionalProperties)
                }

            @JsonProperty("days") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun days(days: Long) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.days = days
            }

            @JsonProperty("minutes") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun minutes(minutes: Long) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.minutes = minutes
            }

            @JsonProperty("hours") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun hours(hours: Long) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.hours = hours
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

            fun build(): Interval =
                Interval( // templates/JavaSDK/entities/objects.ts:326:30
                    days, // templates/JavaSDK/entities/objects.ts:326:30
                    minutes,
                    hours,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** Timedelta input. */
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    @JsonDeserialize(builder = Stride.Builder::class)
    @NoAutoDetect
    class Stride
    private constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val days: Long?, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val minutes: Long?,
        private val hours: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("days") // templates/JavaSDK/entities/objects.ts:113:14
        fun days(): Long? = days

        @JsonProperty("minutes") // templates/JavaSDK/entities/objects.ts:113:14
        fun minutes(): Long? = minutes

        @JsonProperty("hours") // templates/JavaSDK/entities/objects.ts:113:14
        fun hours(): Long? = hours

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is Stride && // templates/JavaSDK/entities/fields.ts:143:33
                this.days == other.days &&
                this.minutes == other.minutes &&
                this.hours == other.hours &&
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
                        days, // templates/JavaSDK/entities/fields.ts:163:19
                        minutes,
                        hours,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Stride{days=$days, minutes=$minutes, hours=$hours, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var days: Long? = null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var minutes: Long? = null
            private var hours: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(stride: Stride) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.days = stride.days // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.minutes = stride.minutes
                    this.hours = stride.hours
                    additionalProperties(stride.additionalProperties)
                }

            @JsonProperty("days") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun days(days: Long) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.days = days
            }

            @JsonProperty("minutes") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun minutes(minutes: Long) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.minutes = minutes
            }

            @JsonProperty("hours") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun hours(hours: Long) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.hours = hours
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

            fun build(): Stride =
                Stride( // templates/JavaSDK/entities/objects.ts:326:30
                    days, // templates/JavaSDK/entities/objects.ts:326:30
                    minutes,
                    hours,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
