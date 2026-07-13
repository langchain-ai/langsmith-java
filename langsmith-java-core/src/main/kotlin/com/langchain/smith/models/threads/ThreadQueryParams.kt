// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * **Alpha:** The request and response contract may change; Query threads within a project
 * (session), with cursor-based pagination. Returns threads matching the given time range and
 * optional filter.
 */
class ThreadQueryParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * `cursor` is the opaque string from a previous response's `next_cursor`. Omit on the first
     * request; pass the returned cursor to fetch the next page.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cursor(): Optional<String> = body.cursor()

    /**
     * `filter` narrows which threads are returned, using a LangSmith filter expression evaluated
     * against each thread's root run. For example: has(tags, "production") or eq(status, "error").
     * See https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<String> = body.filter()

    /**
     * `max_start_time` is the exclusive upper bound on thread activity (RFC3339 date-time).
     * Defaults to now (UTC) when omitted.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxStartTime(): Optional<OffsetDateTime> = body.maxStartTime()

    /**
     * `min_start_time` is the inclusive lower bound on thread activity (RFC3339 date-time).
     * Defaults to 1 day before now (UTC) when omitted.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minStartTime(): Optional<OffsetDateTime> = body.minStartTime()

    /**
     * `page_size` is the maximum number of threads to return in this response. Defaults to 20 when
     * omitted; must be between 1 and 100 inclusive when set. The response may contain fewer threads
     * than `page_size` even when `next_cursor` is non-null.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageSize(): Optional<Long> = body.pageSize()

    /**
     * `project_id` is the tracing project UUID.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectId(): Optional<String> = body.projectId()

    /**
     * Returns the raw JSON value of [cursor].
     *
     * Unlike [cursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cursor(): JsonField<String> = body._cursor()

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filter(): JsonField<String> = body._filter()

    /**
     * Returns the raw JSON value of [maxStartTime].
     *
     * Unlike [maxStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxStartTime(): JsonField<OffsetDateTime> = body._maxStartTime()

    /**
     * Returns the raw JSON value of [minStartTime].
     *
     * Unlike [minStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _minStartTime(): JsonField<OffsetDateTime> = body._minStartTime()

    /**
     * Returns the raw JSON value of [pageSize].
     *
     * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageSize(): JsonField<Long> = body._pageSize()

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _projectId(): JsonField<String> = body._projectId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ThreadQueryParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ThreadQueryParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreadQueryParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(threadQueryParams: ThreadQueryParams) = apply {
            body = threadQueryParams.body.toBuilder()
            additionalHeaders = threadQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = threadQueryParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [cursor]
         * - [filter]
         * - [maxStartTime]
         * - [minStartTime]
         * - [pageSize]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * `cursor` is the opaque string from a previous response's `next_cursor`. Omit on the first
         * request; pass the returned cursor to fetch the next page.
         */
        fun cursor(cursor: String) = apply { body.cursor(cursor) }

        /**
         * Sets [Builder.cursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cursor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cursor(cursor: JsonField<String>) = apply { body.cursor(cursor) }

        /**
         * `filter` narrows which threads are returned, using a LangSmith filter expression
         * evaluated against each thread's root run. For example: has(tags, "production") or
         * eq(status, "error"). See
         * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
         */
        fun filter(filter: String) = apply { body.filter(filter) }

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { body.filter(filter) }

        /**
         * `max_start_time` is the exclusive upper bound on thread activity (RFC3339 date-time).
         * Defaults to now (UTC) when omitted.
         */
        fun maxStartTime(maxStartTime: OffsetDateTime) = apply { body.maxStartTime(maxStartTime) }

        /**
         * Sets [Builder.maxStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxStartTime(maxStartTime: JsonField<OffsetDateTime>) = apply {
            body.maxStartTime(maxStartTime)
        }

        /**
         * `min_start_time` is the inclusive lower bound on thread activity (RFC3339 date-time).
         * Defaults to 1 day before now (UTC) when omitted.
         */
        fun minStartTime(minStartTime: OffsetDateTime) = apply { body.minStartTime(minStartTime) }

        /**
         * Sets [Builder.minStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minStartTime(minStartTime: JsonField<OffsetDateTime>) = apply {
            body.minStartTime(minStartTime)
        }

        /**
         * `page_size` is the maximum number of threads to return in this response. Defaults to 20
         * when omitted; must be between 1 and 100 inclusive when set. The response may contain
         * fewer threads than `page_size` even when `next_cursor` is non-null.
         */
        fun pageSize(pageSize: Long) = apply { body.pageSize(pageSize) }

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Long>) = apply { body.pageSize(pageSize) }

        /** `project_id` is the tracing project UUID. */
        fun projectId(projectId: String) = apply { body.projectId(projectId) }

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { body.projectId(projectId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [ThreadQueryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ThreadQueryParams =
            ThreadQueryParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cursor: JsonField<String>,
        private val filter: JsonField<String>,
        private val maxStartTime: JsonField<OffsetDateTime>,
        private val minStartTime: JsonField<OffsetDateTime>,
        private val pageSize: JsonField<Long>,
        private val projectId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_start_time")
            @ExcludeMissing
            maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("min_start_time")
            @ExcludeMissing
            minStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("project_id")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
        ) : this(cursor, filter, maxStartTime, minStartTime, pageSize, projectId, mutableMapOf())

        /**
         * `cursor` is the opaque string from a previous response's `next_cursor`. Omit on the first
         * request; pass the returned cursor to fetch the next page.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cursor(): Optional<String> = cursor.getOptional("cursor")

        /**
         * `filter` narrows which threads are returned, using a LangSmith filter expression
         * evaluated against each thread's root run. For example: has(tags, "production") or
         * eq(status, "error"). See
         * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filter(): Optional<String> = filter.getOptional("filter")

        /**
         * `max_start_time` is the exclusive upper bound on thread activity (RFC3339 date-time).
         * Defaults to now (UTC) when omitted.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxStartTime(): Optional<OffsetDateTime> = maxStartTime.getOptional("max_start_time")

        /**
         * `min_start_time` is the inclusive lower bound on thread activity (RFC3339 date-time).
         * Defaults to 1 day before now (UTC) when omitted.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun minStartTime(): Optional<OffsetDateTime> = minStartTime.getOptional("min_start_time")

        /**
         * `page_size` is the maximum number of threads to return in this response. Defaults to 20
         * when omitted; must be between 1 and 100 inclusive when set. The response may contain
         * fewer threads than `page_size` even when `next_cursor` is non-null.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

        /**
         * `project_id` is the tracing project UUID.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun projectId(): Optional<String> = projectId.getOptional("project_id")

        /**
         * Returns the raw JSON value of [cursor].
         *
         * Unlike [cursor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cursor") @ExcludeMissing fun _cursor(): JsonField<String> = cursor

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Returns the raw JSON value of [maxStartTime].
         *
         * Unlike [maxStartTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_start_time")
        @ExcludeMissing
        fun _maxStartTime(): JsonField<OffsetDateTime> = maxStartTime

        /**
         * Returns the raw JSON value of [minStartTime].
         *
         * Unlike [minStartTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("min_start_time")
        @ExcludeMissing
        fun _minStartTime(): JsonField<OffsetDateTime> = minStartTime

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var cursor: JsonField<String> = JsonMissing.of()
            private var filter: JsonField<String> = JsonMissing.of()
            private var maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var minStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var projectId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                cursor = body.cursor
                filter = body.filter
                maxStartTime = body.maxStartTime
                minStartTime = body.minStartTime
                pageSize = body.pageSize
                projectId = body.projectId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * `cursor` is the opaque string from a previous response's `next_cursor`. Omit on the
             * first request; pass the returned cursor to fetch the next page.
             */
            fun cursor(cursor: String) = cursor(JsonField.of(cursor))

            /**
             * Sets [Builder.cursor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cursor] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cursor(cursor: JsonField<String>) = apply { this.cursor = cursor }

            /**
             * `filter` narrows which threads are returned, using a LangSmith filter expression
             * evaluated against each thread's root run. For example: has(tags, "production") or
             * eq(status, "error"). See
             * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for
             * syntax.
             */
            fun filter(filter: String) = filter(JsonField.of(filter))

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            /**
             * `max_start_time` is the exclusive upper bound on thread activity (RFC3339 date-time).
             * Defaults to now (UTC) when omitted.
             */
            fun maxStartTime(maxStartTime: OffsetDateTime) =
                maxStartTime(JsonField.of(maxStartTime))

            /**
             * Sets [Builder.maxStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxStartTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun maxStartTime(maxStartTime: JsonField<OffsetDateTime>) = apply {
                this.maxStartTime = maxStartTime
            }

            /**
             * `min_start_time` is the inclusive lower bound on thread activity (RFC3339 date-time).
             * Defaults to 1 day before now (UTC) when omitted.
             */
            fun minStartTime(minStartTime: OffsetDateTime) =
                minStartTime(JsonField.of(minStartTime))

            /**
             * Sets [Builder.minStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minStartTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun minStartTime(minStartTime: JsonField<OffsetDateTime>) = apply {
                this.minStartTime = minStartTime
            }

            /**
             * `page_size` is the maximum number of threads to return in this response. Defaults to
             * 20 when omitted; must be between 1 and 100 inclusive when set. The response may
             * contain fewer threads than `page_size` even when `next_cursor` is non-null.
             */
            fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

            /** `project_id` is the tracing project UUID. */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    cursor,
                    filter,
                    maxStartTime,
                    minStartTime,
                    pageSize,
                    projectId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            cursor()
            filter()
            maxStartTime()
            minStartTime()
            pageSize()
            projectId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (cursor.asKnown().isPresent) 1 else 0) +
                (if (filter.asKnown().isPresent) 1 else 0) +
                (if (maxStartTime.asKnown().isPresent) 1 else 0) +
                (if (minStartTime.asKnown().isPresent) 1 else 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (projectId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                cursor == other.cursor &&
                filter == other.filter &&
                maxStartTime == other.maxStartTime &&
                minStartTime == other.minStartTime &&
                pageSize == other.pageSize &&
                projectId == other.projectId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cursor,
                filter,
                maxStartTime,
                minStartTime,
                pageSize,
                projectId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{cursor=$cursor, filter=$filter, maxStartTime=$maxStartTime, minStartTime=$minStartTime, pageSize=$pageSize, projectId=$projectId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThreadQueryParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ThreadQueryParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
