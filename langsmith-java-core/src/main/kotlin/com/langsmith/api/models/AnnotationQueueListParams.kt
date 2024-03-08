// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.models.*
import java.util.Objects
import java.util.Optional

class AnnotationQueueListParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val ids: List<String>?, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val limit: Long?,
    private val name: String?,
    private val nameContains: String?,
    private val offset: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun ids(): Optional<List<String>> =
        Optional.ofNullable(ids) // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun nameContains(): Optional<String> = Optional.ofNullable(nameContains)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams():
        Map<String, List<String>> { // templates/JavaSDK/entities/params.ts:201:14
        val params =
            mutableMapOf<String, List<String>>() // templates/JavaSDK/entities/params.ts:210:30 //
        // templates/JavaSDK/entities/params.ts:210:30
        this.ids?.let { // templates/JavaSDK/entities/objects.ts:392:21
            params.put("ids", listOf(it.joinToString(separator = ",")))
        }
        this.limit?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("limit", listOf(it.toString()))
        }
        this.name?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("name", listOf(it.toString()))
        }
        this.nameContains?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("name_contains", listOf(it.toString()))
        }
        this.offset?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("offset", listOf(it.toString()))
        }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is AnnotationQueueListParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.ids == other.ids &&
            this.limit == other.limit &&
            this.name == other.name &&
            this.nameContains == other.nameContains &&
            this.offset == other.offset &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            ids, // templates/JavaSDK/entities/fields.ts:163:19
            limit,
            name,
            nameContains,
            offset,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "AnnotationQueueListParams{ids=$ids, limit=$limit, name=$name, nameContains=$nameContains, offset=$offset, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var ids: MutableList<String> =
            mutableListOf() // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
        private var limit: Long? = null
        private var name: String? = null
        private var nameContains: String? = null
        private var offset: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(annotationQueueListParams: AnnotationQueueListParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.ids(
                    annotationQueueListParams.ids ?: listOf()
                ) // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.limit = annotationQueueListParams.limit
                this.name = annotationQueueListParams.name
                this.nameContains = annotationQueueListParams.nameContains
                this.offset = annotationQueueListParams.offset
                additionalQueryParams(annotationQueueListParams.additionalQueryParams)
                additionalHeaders(annotationQueueListParams.additionalHeaders)
            }

        fun ids(ids: List<String>) = apply { // templates/JavaSDK/entities/params.ts:609:26
            this.ids.clear() // templates/JavaSDK/entities/params.ts:609:26 //
            // templates/JavaSDK/entities/params.ts:609:26
            this.ids.addAll(ids)
        }

        fun addId(id: String) = apply { // templates/JavaSDK/entities/params.ts:620:26
            this.ids.add(id)
        }

        fun limit(limit: Long) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.limit = limit
        }

        fun name(name: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.name = name
        }

        fun nameContains(nameContains: String) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.nameContains = nameContains
            }

        fun offset(offset: Long) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.offset = offset
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

        fun build(): AnnotationQueueListParams =
            AnnotationQueueListParams( // templates/JavaSDK/entities/params.ts:683:22
                if (ids.size == 0) null
                else ids.toUnmodifiable(), // templates/JavaSDK/entities/params.ts:683:22
                limit,
                name,
                nameContains,
                offset,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
