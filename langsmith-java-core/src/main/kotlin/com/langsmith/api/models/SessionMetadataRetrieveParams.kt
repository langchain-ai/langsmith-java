// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class SessionMetadataRetrieveParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val sessionId: String, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val k: Long?,
    private val metadataKeys: List<String>?,
    private val startTime: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun sessionId(): String = sessionId // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun k(): Optional<Long> = Optional.ofNullable(k)

    fun metadataKeys(): Optional<List<String>> = Optional.ofNullable(metadataKeys)

    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams():
        Map<String, List<String>> { // templates/JavaSDK/entities/params.ts:201:14
        val params =
            mutableMapOf<String, List<String>>() // templates/JavaSDK/entities/params.ts:210:30 //
        // templates/JavaSDK/entities/params.ts:210:30
        this.k?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("k", listOf(it.toString()))
        }
        this.metadataKeys?.let { // templates/JavaSDK/entities/objects.ts:392:21
            params.put("metadata_keys", listOf(it.joinToString(separator = ",")))
        }
        this.startTime?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("start_time", listOf(it.toString()))
        }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String { // templates/JavaSDK/entities/params.ts:555:13
        return when (index) { // templates/JavaSDK/entities/params.ts:560:26
            0 -> sessionId // templates/JavaSDK/entities/params.ts:560:26 //
            // templates/JavaSDK/entities/params.ts:560:26
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is
            SessionMetadataRetrieveParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.sessionId == other.sessionId &&
            this.k == other.k &&
            this.metadataKeys == other.metadataKeys &&
            this.startTime == other.startTime &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            sessionId, // templates/JavaSDK/entities/fields.ts:163:19
            k,
            metadataKeys,
            startTime,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "SessionMetadataRetrieveParams{sessionId=$sessionId, k=$k, metadataKeys=$metadataKeys, startTime=$startTime, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var sessionId: String? = null // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
        private var k: Long? = null
        private var metadataKeys: MutableList<String> = mutableListOf()
        private var startTime: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(sessionMetadataRetrieveParams: SessionMetadataRetrieveParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.sessionId =
                    sessionMetadataRetrieveParams
                        .sessionId // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.k = sessionMetadataRetrieveParams.k
                this.metadataKeys(sessionMetadataRetrieveParams.metadataKeys ?: listOf())
                this.startTime = sessionMetadataRetrieveParams.startTime
                additionalQueryParams(sessionMetadataRetrieveParams.additionalQueryParams)
                additionalHeaders(sessionMetadataRetrieveParams.additionalHeaders)
            }

        fun sessionId(sessionId: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.sessionId = sessionId
        }

        fun k(k: Long) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.k = k
        }

        fun metadataKeys(metadataKeys: List<String>) =
            apply { // templates/JavaSDK/entities/params.ts:609:26
                this.metadataKeys.clear() // templates/JavaSDK/entities/params.ts:609:26 //
                // templates/JavaSDK/entities/params.ts:609:26
                this.metadataKeys.addAll(metadataKeys)
            }

        fun addMetadataKey(metadataKey: String) =
            apply { // templates/JavaSDK/entities/params.ts:620:26
                this.metadataKeys.add(metadataKey)
            }

        fun startTime(startTime: OffsetDateTime) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.startTime = startTime
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

        fun build(): SessionMetadataRetrieveParams =
            SessionMetadataRetrieveParams( // templates/JavaSDK/entities/params.ts:683:22
                checkNotNull(sessionId) { // templates/JavaSDK/entities/params.ts:844:13 //
                    // templates/JavaSDK/entities/params.ts:683:22
                    "`sessionId` is required but was not set"
                },
                k,
                if (metadataKeys.size == 0) null else metadataKeys.toUnmodifiable(),
                startTime,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
