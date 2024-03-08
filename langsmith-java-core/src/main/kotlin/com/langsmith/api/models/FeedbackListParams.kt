// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import com.langsmith.api.models.*
import java.util.Objects
import java.util.Optional

class FeedbackListParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val hasComment: Boolean?, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val hasScore: Boolean?,
    private val key: List<String>?,
    private val limit: Long?,
    private val offset: Long?,
    private val run: List<String>?,
    private val session: List<String>?,
    private val source: List<SourceType>?,
    private val user: List<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun hasComment(): Optional<Boolean> =
        Optional.ofNullable(hasComment) // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun hasScore(): Optional<Boolean> = Optional.ofNullable(hasScore)

    fun key(): Optional<List<String>> = Optional.ofNullable(key)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun run(): Optional<List<String>> = Optional.ofNullable(run)

    fun session(): Optional<List<String>> = Optional.ofNullable(session)

    fun source(): Optional<List<SourceType>> = Optional.ofNullable(source)

    fun user(): Optional<List<String>> = Optional.ofNullable(user)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams():
        Map<String, List<String>> { // templates/JavaSDK/entities/params.ts:201:14
        val params =
            mutableMapOf<String, List<String>>() // templates/JavaSDK/entities/params.ts:210:30 //
        // templates/JavaSDK/entities/params.ts:210:30
        this.hasComment?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("has_comment", listOf(it.toString()))
        }
        this.hasScore?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("has_score", listOf(it.toString()))
        }
        this.key?.let { // templates/JavaSDK/entities/objects.ts:392:21
            params.put("key", listOf(it.joinToString(separator = ",")))
        }
        this.limit?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("limit", listOf(it.toString()))
        }
        this.offset?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("offset", listOf(it.toString()))
        }
        this.run?.let { // templates/JavaSDK/entities/objects.ts:392:21
            params.put("run", listOf(it.joinToString(separator = ",")))
        }
        this.session?.let { // templates/JavaSDK/entities/objects.ts:392:21
            params.put("session", listOf(it.joinToString(separator = ",")))
        }
        this.source?.let { // templates/JavaSDK/entities/objects.ts:392:21
            params.put("source", listOf(it.joinToString(separator = ",")))
        }
        this.user?.let { // templates/JavaSDK/entities/objects.ts:392:21
            params.put("user", listOf(it.joinToString(separator = ",")))
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

        return other is FeedbackListParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.hasComment == other.hasComment &&
            this.hasScore == other.hasScore &&
            this.key == other.key &&
            this.limit == other.limit &&
            this.offset == other.offset &&
            this.run == other.run &&
            this.session == other.session &&
            this.source == other.source &&
            this.user == other.user &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            hasComment, // templates/JavaSDK/entities/fields.ts:163:19
            hasScore,
            key,
            limit,
            offset,
            run,
            session,
            source,
            user,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "FeedbackListParams{hasComment=$hasComment, hasScore=$hasScore, key=$key, limit=$limit, offset=$offset, run=$run, session=$session, source=$source, user=$user, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var hasComment: Boolean? = null // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
        private var hasScore: Boolean? = null
        private var key: MutableList<String> = mutableListOf()
        private var limit: Long? = null
        private var offset: Long? = null
        private var run: MutableList<String> = mutableListOf()
        private var session: MutableList<String> = mutableListOf()
        private var source: MutableList<SourceType> = mutableListOf()
        private var user: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(feedbackListParams: FeedbackListParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.hasComment =
                    feedbackListParams.hasComment // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.hasScore = feedbackListParams.hasScore
                this.key(feedbackListParams.key ?: listOf())
                this.limit = feedbackListParams.limit
                this.offset = feedbackListParams.offset
                this.run(feedbackListParams.run ?: listOf())
                this.session(feedbackListParams.session ?: listOf())
                this.source(feedbackListParams.source ?: listOf())
                this.user(feedbackListParams.user ?: listOf())
                additionalQueryParams(feedbackListParams.additionalQueryParams)
                additionalHeaders(feedbackListParams.additionalHeaders)
            }

        fun hasComment(hasComment: Boolean) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.hasComment = hasComment
        }

        fun hasScore(hasScore: Boolean) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.hasScore = hasScore
        }

        fun key(key: List<String>) = apply { // templates/JavaSDK/entities/params.ts:609:26
            this.key.clear() // templates/JavaSDK/entities/params.ts:609:26 //
            // templates/JavaSDK/entities/params.ts:609:26
            this.key.addAll(key)
        }

        fun addKey(key: String) = apply { // templates/JavaSDK/entities/params.ts:620:26
            this.key.add(key)
        }

        fun limit(limit: Long) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.limit = limit
        }

        fun offset(offset: Long) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.offset = offset
        }

        fun run(run: List<String>) = apply { // templates/JavaSDK/entities/params.ts:609:26
            this.run.clear() // templates/JavaSDK/entities/params.ts:609:26 //
            // templates/JavaSDK/entities/params.ts:609:26
            this.run.addAll(run)
        }

        fun addRun(run: String) = apply { // templates/JavaSDK/entities/params.ts:620:26
            this.run.add(run)
        }

        fun session(session: List<String>) = apply { // templates/JavaSDK/entities/params.ts:609:26
            this.session.clear() // templates/JavaSDK/entities/params.ts:609:26 //
            // templates/JavaSDK/entities/params.ts:609:26
            this.session.addAll(session)
        }

        fun addSession(session: String) = apply { // templates/JavaSDK/entities/params.ts:620:26
            this.session.add(session)
        }

        fun source(source: List<SourceType>) =
            apply { // templates/JavaSDK/entities/params.ts:609:26
                this.source.clear() // templates/JavaSDK/entities/params.ts:609:26 //
                // templates/JavaSDK/entities/params.ts:609:26
                this.source.addAll(source)
            }

        fun addSource(source: SourceType) = apply { // templates/JavaSDK/entities/params.ts:620:26
            this.source.add(source)
        }

        fun user(user: List<String>) = apply { // templates/JavaSDK/entities/params.ts:609:26
            this.user.clear() // templates/JavaSDK/entities/params.ts:609:26 //
            // templates/JavaSDK/entities/params.ts:609:26
            this.user.addAll(user)
        }

        fun addUser(user: String) = apply { // templates/JavaSDK/entities/params.ts:620:26
            this.user.add(user)
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

        fun build(): FeedbackListParams =
            FeedbackListParams( // templates/JavaSDK/entities/params.ts:683:22
                hasComment, // templates/JavaSDK/entities/params.ts:683:22
                hasScore,
                if (key.size == 0) null else key.toUnmodifiable(),
                limit,
                offset,
                if (run.size == 0) null else run.toUnmodifiable(),
                if (session.size == 0) null else session.toUnmodifiable(),
                if (source.size == 0) null else source.toUnmodifiable(),
                if (user.size == 0) null else user.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class SourceType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) { // templates/JavaSDK/entities/enums.ts:56:13 // templates/JavaSDK/entities/enums.ts:56:13 //
        // templates/JavaSDK/entities/enums.ts:56:13

        @com.fasterxml.jackson.annotation.JsonValue // templates/JavaSDK/entities/enums.ts:62:10 //
        // templates/JavaSDK/entities/enums.ts:56:13
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is SourceType && // templates/JavaSDK/entities/fields.ts:143:33
                this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object { // templates/JavaSDK/entities/enums.ts:71:10

            @JvmField
            val API = SourceType(JsonField.of("api")) // templates/JavaSDK/entities/enums.ts:71:10

            @JvmField val MODEL = SourceType(JsonField.of("model"))

            @JvmField val APP = SourceType(JsonField.of("app"))

            @JvmStatic fun of(value: String) = SourceType(JsonField.of(value))
        }

        enum class Known { // templates/JavaSDK/entities/enums.ts:78:10
            API, // templates/JavaSDK/entities/enums.ts:78:10 //
            // templates/JavaSDK/entities/enums.ts:78:10
            MODEL,
            APP,
        }

        enum class Value { // templates/JavaSDK/entities/enums.ts:82:10
            API, // templates/JavaSDK/entities/enums.ts:82:10 //
            // templates/JavaSDK/entities/enums.ts:82:10
            MODEL,
            APP,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) { // templates/JavaSDK/entities/enums.ts:91:29
                API -> Value.API // templates/JavaSDK/entities/enums.ts:54:10 //
                // templates/JavaSDK/entities/enums.ts:54:10
                MODEL -> Value.MODEL
                APP -> Value.APP
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) { // templates/JavaSDK/entities/enums.ts:104:29
                API -> Known.API // templates/JavaSDK/entities/enums.ts:54:10 //
                // templates/JavaSDK/entities/enums.ts:54:10
                MODEL -> Known.MODEL
                APP -> Known.APP
                else -> throw LangSmithInvalidDataException("Unknown SourceType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
