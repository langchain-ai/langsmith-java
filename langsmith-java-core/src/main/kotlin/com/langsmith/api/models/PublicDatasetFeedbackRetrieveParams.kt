// File generated from our OpenAPI spec by Stainless.

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

class PublicDatasetFeedbackRetrieveParams
constructor(
    private val shareToken: String,
    private val hasComment: Boolean?,
    private val hasScore: Boolean?,
    private val key: List<String>?,
    private val limit: Long?,
    private val offset: Long?,
    private val run: List<String>?,
    private val session: List<String>?,
    private val source: List<Source>?,
    private val user: List<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun shareToken(): String = shareToken

    fun hasComment(): Optional<Boolean> = Optional.ofNullable(hasComment)

    fun hasScore(): Optional<Boolean> = Optional.ofNullable(hasScore)

    fun key(): Optional<List<String>> = Optional.ofNullable(key)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun run(): Optional<List<String>> = Optional.ofNullable(run)

    fun session(): Optional<List<String>> = Optional.ofNullable(session)

    fun source(): Optional<List<Source>> = Optional.ofNullable(source)

    fun user(): Optional<List<String>> = Optional.ofNullable(user)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.hasComment?.let { params.put("has_comment", listOf(it.toString())) }
        this.hasScore?.let { params.put("has_score", listOf(it.toString())) }
        this.key?.let { params.put("key", listOf(it.joinToString(separator = ","))) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.offset?.let { params.put("offset", listOf(it.toString())) }
        this.run?.let { params.put("run", listOf(it.joinToString(separator = ","))) }
        this.session?.let { params.put("session", listOf(it.joinToString(separator = ","))) }
        this.source?.let { params.put("source", listOf(it.joinToString(separator = ","))) }
        this.user?.let { params.put("user", listOf(it.joinToString(separator = ","))) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> shareToken
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicDatasetFeedbackRetrieveParams &&
            this.shareToken == other.shareToken &&
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

    override fun hashCode(): Int {
        return Objects.hash(
            shareToken,
            hasComment,
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
        "PublicDatasetFeedbackRetrieveParams{shareToken=$shareToken, hasComment=$hasComment, hasScore=$hasScore, key=$key, limit=$limit, offset=$offset, run=$run, session=$session, source=$source, user=$user, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var shareToken: String? = null
        private var hasComment: Boolean? = null
        private var hasScore: Boolean? = null
        private var key: MutableList<String> = mutableListOf()
        private var limit: Long? = null
        private var offset: Long? = null
        private var run: MutableList<String> = mutableListOf()
        private var session: MutableList<String> = mutableListOf()
        private var source: MutableList<Source> = mutableListOf()
        private var user: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicDatasetFeedbackRetrieveParams: PublicDatasetFeedbackRetrieveParams
        ) = apply {
            this.shareToken = publicDatasetFeedbackRetrieveParams.shareToken
            this.hasComment = publicDatasetFeedbackRetrieveParams.hasComment
            this.hasScore = publicDatasetFeedbackRetrieveParams.hasScore
            this.key(publicDatasetFeedbackRetrieveParams.key ?: listOf())
            this.limit = publicDatasetFeedbackRetrieveParams.limit
            this.offset = publicDatasetFeedbackRetrieveParams.offset
            this.run(publicDatasetFeedbackRetrieveParams.run ?: listOf())
            this.session(publicDatasetFeedbackRetrieveParams.session ?: listOf())
            this.source(publicDatasetFeedbackRetrieveParams.source ?: listOf())
            this.user(publicDatasetFeedbackRetrieveParams.user ?: listOf())
            additionalQueryParams(publicDatasetFeedbackRetrieveParams.additionalQueryParams)
            additionalHeaders(publicDatasetFeedbackRetrieveParams.additionalHeaders)
        }

        fun shareToken(shareToken: String) = apply { this.shareToken = shareToken }

        fun hasComment(hasComment: Boolean) = apply { this.hasComment = hasComment }

        fun hasScore(hasScore: Boolean) = apply { this.hasScore = hasScore }

        fun key(key: List<String>) = apply {
            this.key.clear()
            this.key.addAll(key)
        }

        fun addKey(key: String) = apply { this.key.add(key) }

        fun limit(limit: Long) = apply { this.limit = limit }

        fun offset(offset: Long) = apply { this.offset = offset }

        fun run(run: List<String>) = apply {
            this.run.clear()
            this.run.addAll(run)
        }

        fun addRun(run: String) = apply { this.run.add(run) }

        fun session(session: List<String>) = apply {
            this.session.clear()
            this.session.addAll(session)
        }

        fun addSession(session: String) = apply { this.session.add(session) }

        fun source(source: List<Source>) = apply {
            this.source.clear()
            this.source.addAll(source)
        }

        fun addSource(source: Source) = apply { this.source.add(source) }

        fun user(user: List<String>) = apply {
            this.user.clear()
            this.user.addAll(user)
        }

        fun addUser(user: String) = apply { this.user.add(user) }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): PublicDatasetFeedbackRetrieveParams =
            PublicDatasetFeedbackRetrieveParams(
                checkNotNull(shareToken) { "`shareToken` is required but was not set" },
                hasComment,
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

    class Source
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Source && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val API = Source(JsonField.of("api"))

            @JvmField val MODEL = Source(JsonField.of("model"))

            @JvmField val APP = Source(JsonField.of("app"))

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        enum class Known {
            API,
            MODEL,
            APP,
        }

        enum class Value {
            API,
            MODEL,
            APP,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                API -> Value.API
                MODEL -> Value.MODEL
                APP -> Value.APP
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                API -> Known.API
                MODEL -> Known.MODEL
                APP -> Known.APP
                else -> throw LangSmithInvalidDataException("Unknown Source: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
