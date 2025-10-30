// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedback

import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List all Feedback by query params. */
class FeedbackListParams
private constructor(
    private val hasComment: Boolean?,
    private val hasScore: Boolean?,
    private val includeUserNames: Boolean?,
    private val key: List<String>?,
    private val level: FeedbackLevel?,
    private val limit: Long?,
    private val maxCreatedAt: OffsetDateTime?,
    private val minCreatedAt: OffsetDateTime?,
    private val offset: Long?,
    private val run: List<String>?,
    private val session: List<String>?,
    private val source: List<SourceType>?,
    private val user: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun hasComment(): Optional<Boolean> = Optional.ofNullable(hasComment)

    fun hasScore(): Optional<Boolean> = Optional.ofNullable(hasScore)

    fun includeUserNames(): Optional<Boolean> = Optional.ofNullable(includeUserNames)

    fun key(): Optional<List<String>> = Optional.ofNullable(key)

    /** Enum for feedback levels. */
    fun level(): Optional<FeedbackLevel> = Optional.ofNullable(level)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun maxCreatedAt(): Optional<OffsetDateTime> = Optional.ofNullable(maxCreatedAt)

    fun minCreatedAt(): Optional<OffsetDateTime> = Optional.ofNullable(minCreatedAt)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun run(): Optional<List<String>> = Optional.ofNullable(run)

    fun session(): Optional<List<String>> = Optional.ofNullable(session)

    fun source(): Optional<List<SourceType>> = Optional.ofNullable(source)

    fun user(): Optional<List<String>> = Optional.ofNullable(user)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FeedbackListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FeedbackListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedbackListParams]. */
    class Builder internal constructor() {

        private var hasComment: Boolean? = null
        private var hasScore: Boolean? = null
        private var includeUserNames: Boolean? = null
        private var key: MutableList<String>? = null
        private var level: FeedbackLevel? = null
        private var limit: Long? = null
        private var maxCreatedAt: OffsetDateTime? = null
        private var minCreatedAt: OffsetDateTime? = null
        private var offset: Long? = null
        private var run: MutableList<String>? = null
        private var session: MutableList<String>? = null
        private var source: MutableList<SourceType>? = null
        private var user: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(feedbackListParams: FeedbackListParams) = apply {
            hasComment = feedbackListParams.hasComment
            hasScore = feedbackListParams.hasScore
            includeUserNames = feedbackListParams.includeUserNames
            key = feedbackListParams.key?.toMutableList()
            level = feedbackListParams.level
            limit = feedbackListParams.limit
            maxCreatedAt = feedbackListParams.maxCreatedAt
            minCreatedAt = feedbackListParams.minCreatedAt
            offset = feedbackListParams.offset
            run = feedbackListParams.run?.toMutableList()
            session = feedbackListParams.session?.toMutableList()
            source = feedbackListParams.source?.toMutableList()
            user = feedbackListParams.user?.toMutableList()
            additionalHeaders = feedbackListParams.additionalHeaders.toBuilder()
            additionalQueryParams = feedbackListParams.additionalQueryParams.toBuilder()
        }

        fun hasComment(hasComment: Boolean?) = apply { this.hasComment = hasComment }

        /**
         * Alias for [Builder.hasComment].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun hasComment(hasComment: Boolean) = hasComment(hasComment as Boolean?)

        /** Alias for calling [Builder.hasComment] with `hasComment.orElse(null)`. */
        fun hasComment(hasComment: Optional<Boolean>) = hasComment(hasComment.getOrNull())

        fun hasScore(hasScore: Boolean?) = apply { this.hasScore = hasScore }

        /**
         * Alias for [Builder.hasScore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun hasScore(hasScore: Boolean) = hasScore(hasScore as Boolean?)

        /** Alias for calling [Builder.hasScore] with `hasScore.orElse(null)`. */
        fun hasScore(hasScore: Optional<Boolean>) = hasScore(hasScore.getOrNull())

        fun includeUserNames(includeUserNames: Boolean?) = apply {
            this.includeUserNames = includeUserNames
        }

        /**
         * Alias for [Builder.includeUserNames].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeUserNames(includeUserNames: Boolean) =
            includeUserNames(includeUserNames as Boolean?)

        /** Alias for calling [Builder.includeUserNames] with `includeUserNames.orElse(null)`. */
        fun includeUserNames(includeUserNames: Optional<Boolean>) =
            includeUserNames(includeUserNames.getOrNull())

        fun key(key: List<String>?) = apply { this.key = key?.toMutableList() }

        /** Alias for calling [Builder.key] with `key.orElse(null)`. */
        fun key(key: Optional<List<String>>) = key(key.getOrNull())

        /**
         * Adds a single [String] to [Builder.key].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKey(key: String) = apply {
            this.key = (this.key ?: mutableListOf()).apply { add(key) }
        }

        /** Enum for feedback levels. */
        fun level(level: FeedbackLevel?) = apply { this.level = level }

        /** Alias for calling [Builder.level] with `level.orElse(null)`. */
        fun level(level: Optional<FeedbackLevel>) = level(level.getOrNull())

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        fun maxCreatedAt(maxCreatedAt: OffsetDateTime?) = apply { this.maxCreatedAt = maxCreatedAt }

        /** Alias for calling [Builder.maxCreatedAt] with `maxCreatedAt.orElse(null)`. */
        fun maxCreatedAt(maxCreatedAt: Optional<OffsetDateTime>) =
            maxCreatedAt(maxCreatedAt.getOrNull())

        fun minCreatedAt(minCreatedAt: OffsetDateTime?) = apply { this.minCreatedAt = minCreatedAt }

        /** Alias for calling [Builder.minCreatedAt] with `minCreatedAt.orElse(null)`. */
        fun minCreatedAt(minCreatedAt: Optional<OffsetDateTime>) =
            minCreatedAt(minCreatedAt.getOrNull())

        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        fun run(run: List<String>?) = apply { this.run = run?.toMutableList() }

        /** Alias for calling [Builder.run] with `run.orElse(null)`. */
        fun run(run: Optional<List<String>>) = run(run.getOrNull())

        /**
         * Adds a single [String] to [Builder.run].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRun(run: String) = apply {
            this.run = (this.run ?: mutableListOf()).apply { add(run) }
        }

        fun session(session: List<String>?) = apply { this.session = session?.toMutableList() }

        /** Alias for calling [Builder.session] with `session.orElse(null)`. */
        fun session(session: Optional<List<String>>) = session(session.getOrNull())

        /**
         * Adds a single [String] to [Builder.session].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSession(session: String) = apply {
            this.session = (this.session ?: mutableListOf()).apply { add(session) }
        }

        fun source(source: List<SourceType>?) = apply { this.source = source?.toMutableList() }

        /** Alias for calling [Builder.source] with `source.orElse(null)`. */
        fun source(source: Optional<List<SourceType>>) = source(source.getOrNull())

        /**
         * Adds a single [SourceType] to [Builder.source].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSource(source: SourceType) = apply {
            this.source = (this.source ?: mutableListOf()).apply { add(source) }
        }

        fun user(user: List<String>?) = apply { this.user = user?.toMutableList() }

        /** Alias for calling [Builder.user] with `user.orElse(null)`. */
        fun user(user: Optional<List<String>>) = user(user.getOrNull())

        /**
         * Adds a single [String] to [Builder.user].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUser(user: String) = apply {
            this.user = (this.user ?: mutableListOf()).apply { add(user) }
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [FeedbackListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FeedbackListParams =
            FeedbackListParams(
                hasComment,
                hasScore,
                includeUserNames,
                key?.toImmutable(),
                level,
                limit,
                maxCreatedAt,
                minCreatedAt,
                offset,
                run?.toImmutable(),
                session?.toImmutable(),
                source?.toImmutable(),
                user?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                hasComment?.let { put("has_comment", it.toString()) }
                hasScore?.let { put("has_score", it.toString()) }
                includeUserNames?.let { put("include_user_names", it.toString()) }
                key?.let { put("key", it.joinToString(",")) }
                level?.let { put("level", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                maxCreatedAt?.let {
                    put("max_created_at", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                minCreatedAt?.let {
                    put("min_created_at", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                offset?.let { put("offset", it.toString()) }
                run?.let { put("run", it.joinToString(",")) }
                session?.let { put("session", it.joinToString(",")) }
                source?.let { put("source", it.joinToString(",") { it.toString() }) }
                user?.let { put("user", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackListParams &&
            hasComment == other.hasComment &&
            hasScore == other.hasScore &&
            includeUserNames == other.includeUserNames &&
            key == other.key &&
            level == other.level &&
            limit == other.limit &&
            maxCreatedAt == other.maxCreatedAt &&
            minCreatedAt == other.minCreatedAt &&
            offset == other.offset &&
            run == other.run &&
            session == other.session &&
            source == other.source &&
            user == other.user &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            hasComment,
            hasScore,
            includeUserNames,
            key,
            level,
            limit,
            maxCreatedAt,
            minCreatedAt,
            offset,
            run,
            session,
            source,
            user,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FeedbackListParams{hasComment=$hasComment, hasScore=$hasScore, includeUserNames=$includeUserNames, key=$key, level=$level, limit=$limit, maxCreatedAt=$maxCreatedAt, minCreatedAt=$minCreatedAt, offset=$offset, run=$run, session=$session, source=$source, user=$user, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
