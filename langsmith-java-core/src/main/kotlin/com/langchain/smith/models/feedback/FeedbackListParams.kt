// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback

import com.langchain.smith.core.Params
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List all Feedback by query params. */
class FeedbackListParams
private constructor(
    private val comparativeExperimentId: String?,
    private val feedbackThreadId: String?,
    private val hasComment: Boolean?,
    private val hasScore: Boolean?,
    private val includeUserNames: Boolean?,
    private val key: List<String>?,
    private val level: FeedbackLevel?,
    private val limit: Long?,
    private val maxCreatedAt: OffsetDateTime?,
    private val minCreatedAt: OffsetDateTime?,
    private val offset: Long?,
    private val run: Run?,
    private val session: Session?,
    private val source: List<SourceType>?,
    private val user: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun comparativeExperimentId(): Optional<String> = Optional.ofNullable(comparativeExperimentId)

    fun feedbackThreadId(): Optional<String> = Optional.ofNullable(feedbackThreadId)

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

    fun run(): Optional<Run> = Optional.ofNullable(run)

    fun session(): Optional<Session> = Optional.ofNullable(session)

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

        private var comparativeExperimentId: String? = null
        private var feedbackThreadId: String? = null
        private var hasComment: Boolean? = null
        private var hasScore: Boolean? = null
        private var includeUserNames: Boolean? = null
        private var key: MutableList<String>? = null
        private var level: FeedbackLevel? = null
        private var limit: Long? = null
        private var maxCreatedAt: OffsetDateTime? = null
        private var minCreatedAt: OffsetDateTime? = null
        private var offset: Long? = null
        private var run: Run? = null
        private var session: Session? = null
        private var source: MutableList<SourceType>? = null
        private var user: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(feedbackListParams: FeedbackListParams) = apply {
            comparativeExperimentId = feedbackListParams.comparativeExperimentId
            feedbackThreadId = feedbackListParams.feedbackThreadId
            hasComment = feedbackListParams.hasComment
            hasScore = feedbackListParams.hasScore
            includeUserNames = feedbackListParams.includeUserNames
            key = feedbackListParams.key?.toMutableList()
            level = feedbackListParams.level
            limit = feedbackListParams.limit
            maxCreatedAt = feedbackListParams.maxCreatedAt
            minCreatedAt = feedbackListParams.minCreatedAt
            offset = feedbackListParams.offset
            run = feedbackListParams.run
            session = feedbackListParams.session
            source = feedbackListParams.source?.toMutableList()
            user = feedbackListParams.user?.toMutableList()
            additionalHeaders = feedbackListParams.additionalHeaders.toBuilder()
            additionalQueryParams = feedbackListParams.additionalQueryParams.toBuilder()
        }

        fun comparativeExperimentId(comparativeExperimentId: String?) = apply {
            this.comparativeExperimentId = comparativeExperimentId
        }

        /**
         * Alias for calling [Builder.comparativeExperimentId] with
         * `comparativeExperimentId.orElse(null)`.
         */
        fun comparativeExperimentId(comparativeExperimentId: Optional<String>) =
            comparativeExperimentId(comparativeExperimentId.getOrNull())

        fun feedbackThreadId(feedbackThreadId: String?) = apply {
            this.feedbackThreadId = feedbackThreadId
        }

        /** Alias for calling [Builder.feedbackThreadId] with `feedbackThreadId.orElse(null)`. */
        fun feedbackThreadId(feedbackThreadId: Optional<String>) =
            feedbackThreadId(feedbackThreadId.getOrNull())

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

        fun run(run: Run?) = apply { this.run = run }

        /** Alias for calling [Builder.run] with `run.orElse(null)`. */
        fun run(run: Optional<Run>) = run(run.getOrNull())

        /** Alias for calling [run] with `Run.ofStrings(strings)`. */
        fun runOfStrings(strings: List<String>) = run(Run.ofStrings(strings))

        /** Alias for calling [run] with `Run.ofString(string)`. */
        fun run(string: String) = run(Run.ofString(string))

        fun session(session: Session?) = apply { this.session = session }

        /** Alias for calling [Builder.session] with `session.orElse(null)`. */
        fun session(session: Optional<Session>) = session(session.getOrNull())

        /** Alias for calling [session] with `Session.ofStrings(strings)`. */
        fun sessionOfStrings(strings: List<String>) = session(Session.ofStrings(strings))

        /** Alias for calling [session] with `Session.ofString(string)`. */
        fun session(string: String) = session(Session.ofString(string))

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
                comparativeExperimentId,
                feedbackThreadId,
                hasComment,
                hasScore,
                includeUserNames,
                key?.toImmutable(),
                level,
                limit,
                maxCreatedAt,
                minCreatedAt,
                offset,
                run,
                session,
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
                comparativeExperimentId?.let { put("comparative_experiment_id", it) }
                feedbackThreadId?.let { put("feedback_thread_id", it) }
                hasComment?.let { put("has_comment", it.toString()) }
                hasScore?.let { put("has_score", it.toString()) }
                includeUserNames?.let { put("include_user_names", it.toString()) }
                key?.forEach { put("key", it) }
                level?.let { put("level", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                maxCreatedAt?.let {
                    put("max_created_at", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                minCreatedAt?.let {
                    put("min_created_at", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                offset?.let { put("offset", it.toString()) }
                run?.accept(
                    object : Run.Visitor<Unit> {
                        override fun visitStrings(strings: List<String>) {
                            strings.forEach { put("run", it) }
                        }

                        override fun visitString(string: String) {
                            put("run", string)
                        }
                    }
                )
                session?.accept(
                    object : Session.Visitor<Unit> {
                        override fun visitStrings(strings: List<String>) {
                            strings.forEach { put("session", it) }
                        }

                        override fun visitString(string: String) {
                            put("session", string)
                        }
                    }
                )
                source?.forEach { put("source", it.toString()) }
                user?.forEach { put("user", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Run
    private constructor(
        private val strings: List<String>? = null,
        private val string: String? = null,
    ) {

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isStrings(): Boolean = strings != null

        fun isString(): Boolean = string != null

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun asString(): String = string.getOrThrow("string")

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                strings != null -> visitor.visitStrings(strings)
                string != null -> visitor.visitString(string)
                else -> throw IllegalStateException("Invalid Run")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Run && strings == other.strings && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(strings, string)

        override fun toString(): String =
            when {
                strings != null -> "Run{strings=$strings}"
                string != null -> "Run{string=$string}"
                else -> throw IllegalStateException("Invalid Run")
            }

        companion object {

            @JvmStatic fun ofStrings(strings: List<String>) = Run(strings = strings.toImmutable())

            @JvmStatic fun ofString(string: String) = Run(string = string)
        }

        /** An interface that defines how to map each variant of [Run] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitStrings(strings: List<String>): T

            fun visitString(string: String): T
        }
    }

    class Session
    private constructor(
        private val strings: List<String>? = null,
        private val string: String? = null,
    ) {

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isStrings(): Boolean = strings != null

        fun isString(): Boolean = string != null

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun asString(): String = string.getOrThrow("string")

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                strings != null -> visitor.visitStrings(strings)
                string != null -> visitor.visitString(string)
                else -> throw IllegalStateException("Invalid Session")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Session && strings == other.strings && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(strings, string)

        override fun toString(): String =
            when {
                strings != null -> "Session{strings=$strings}"
                string != null -> "Session{string=$string}"
                else -> throw IllegalStateException("Invalid Session")
            }

        companion object {

            @JvmStatic
            fun ofStrings(strings: List<String>) = Session(strings = strings.toImmutable())

            @JvmStatic fun ofString(string: String) = Session(string = string)
        }

        /**
         * An interface that defines how to map each variant of [Session] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitStrings(strings: List<String>): T

            fun visitString(string: String): T
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackListParams &&
            comparativeExperimentId == other.comparativeExperimentId &&
            feedbackThreadId == other.feedbackThreadId &&
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
            comparativeExperimentId,
            feedbackThreadId,
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
        "FeedbackListParams{comparativeExperimentId=$comparativeExperimentId, feedbackThreadId=$feedbackThreadId, hasComment=$hasComment, hasScore=$hasScore, includeUserNames=$includeUserNames, key=$key, level=$level, limit=$limit, maxCreatedAt=$maxCreatedAt, minCreatedAt=$minCreatedAt, offset=$offset, run=$run, session=$session, source=$source, user=$user, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
