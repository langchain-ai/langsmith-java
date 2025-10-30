// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.feedback

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.Enum
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Ingests a batch of feedback objects in a single JSON array payload. */
class FeedbackIngestBatchParams
private constructor(
    private val body: List<Body>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun body(): List<Body> = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FeedbackIngestBatchParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedbackIngestBatchParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(feedbackIngestBatchParams: FeedbackIngestBatchParams) = apply {
            body = feedbackIngestBatchParams.body.toMutableList()
            additionalHeaders = feedbackIngestBatchParams.additionalHeaders.toBuilder()
            additionalQueryParams = feedbackIngestBatchParams.additionalQueryParams.toBuilder()
        }

        fun body(body: List<Body>) = apply { this.body = body.toMutableList() }

        /**
         * Adds a single [Body] to [Builder.body].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBody(body: Body) = apply {
            this.body = (this.body ?: mutableListOf()).apply { add(body) }
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
         * Returns an immutable instance of [FeedbackIngestBatchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FeedbackIngestBatchParams =
            FeedbackIngestBatchParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val comment: JsonField<String>,
        private val comparativeExperimentId: JsonField<String>,
        private val correction: JsonValue,
        private val createdAt: JsonField<String>,
        private val error: JsonField<Boolean>,
        private val feedbackConfig: JsonField<FeedbackConfig>,
        private val feedbackGroupId: JsonField<String>,
        private val feedbackSource: JsonField<FeedbackSource>,
        private val key: JsonField<String>,
        private val modifiedAt: JsonField<String>,
        private val runId: JsonField<String>,
        private val score: JsonValue,
        private val sessionId: JsonField<String>,
        private val traceId: JsonField<String>,
        private val value: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("comparative_experiment_id")
            @ExcludeMissing
            comparativeExperimentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("correction") @ExcludeMissing correction: JsonValue = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error") @ExcludeMissing error: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("feedback_config")
            @ExcludeMissing
            feedbackConfig: JsonField<FeedbackConfig> = JsonMissing.of(),
            @JsonProperty("feedback_group_id")
            @ExcludeMissing
            feedbackGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("feedback_source")
            @ExcludeMissing
            feedbackSource: JsonField<FeedbackSource> = JsonMissing.of(),
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("modified_at")
            @ExcludeMissing
            modifiedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonValue = JsonMissing.of(),
            @JsonProperty("session_id")
            @ExcludeMissing
            sessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trace_id") @ExcludeMissing traceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonValue = JsonMissing.of(),
        ) : this(
            id,
            comment,
            comparativeExperimentId,
            correction,
            createdAt,
            error,
            feedbackConfig,
            feedbackGroupId,
            feedbackSource,
            key,
            modifiedAt,
            runId,
            score,
            sessionId,
            traceId,
            value,
            mutableMapOf(),
        )

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun comment(): Optional<String> = comment.getOptional("comment")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun comparativeExperimentId(): Optional<String> =
            comparativeExperimentId.getOptional("comparative_experiment_id")

        @JsonProperty("correction") @ExcludeMissing fun _correction(): JsonValue = correction

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun error(): Optional<Boolean> = error.getOptional("error")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun feedbackConfig(): Optional<FeedbackConfig> =
            feedbackConfig.getOptional("feedback_config")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun feedbackGroupId(): Optional<String> = feedbackGroupId.getOptional("feedback_group_id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun feedbackSource(): Optional<FeedbackSource> =
            feedbackSource.getOptional("feedback_source")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun key(): Optional<String> = key.getOptional("key")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun modifiedAt(): Optional<String> = modifiedAt.getOptional("modified_at")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun runId(): Optional<String> = runId.getOptional("run_id")

        @JsonProperty("score") @ExcludeMissing fun _score(): JsonValue = score

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun traceId(): Optional<String> = traceId.getOptional("trace_id")

        @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [comment].
         *
         * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

        /**
         * Returns the raw JSON value of [comparativeExperimentId].
         *
         * Unlike [comparativeExperimentId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("comparative_experiment_id")
        @ExcludeMissing
        fun _comparativeExperimentId(): JsonField<String> = comparativeExperimentId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Boolean> = error

        /**
         * Returns the raw JSON value of [feedbackConfig].
         *
         * Unlike [feedbackConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("feedback_config")
        @ExcludeMissing
        fun _feedbackConfig(): JsonField<FeedbackConfig> = feedbackConfig

        /**
         * Returns the raw JSON value of [feedbackGroupId].
         *
         * Unlike [feedbackGroupId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("feedback_group_id")
        @ExcludeMissing
        fun _feedbackGroupId(): JsonField<String> = feedbackGroupId

        /**
         * Returns the raw JSON value of [feedbackSource].
         *
         * Unlike [feedbackSource], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("feedback_source")
        @ExcludeMissing
        fun _feedbackSource(): JsonField<FeedbackSource> = feedbackSource

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [modifiedAt].
         *
         * Unlike [modifiedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modified_at")
        @ExcludeMissing
        fun _modifiedAt(): JsonField<String> = modifiedAt

        /**
         * Returns the raw JSON value of [runId].
         *
         * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

        /**
         * Returns the raw JSON value of [sessionId].
         *
         * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

        /**
         * Returns the raw JSON value of [traceId].
         *
         * Unlike [traceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

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

            private var id: JsonField<String> = JsonMissing.of()
            private var comment: JsonField<String> = JsonMissing.of()
            private var comparativeExperimentId: JsonField<String> = JsonMissing.of()
            private var correction: JsonValue = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var error: JsonField<Boolean> = JsonMissing.of()
            private var feedbackConfig: JsonField<FeedbackConfig> = JsonMissing.of()
            private var feedbackGroupId: JsonField<String> = JsonMissing.of()
            private var feedbackSource: JsonField<FeedbackSource> = JsonMissing.of()
            private var key: JsonField<String> = JsonMissing.of()
            private var modifiedAt: JsonField<String> = JsonMissing.of()
            private var runId: JsonField<String> = JsonMissing.of()
            private var score: JsonValue = JsonMissing.of()
            private var sessionId: JsonField<String> = JsonMissing.of()
            private var traceId: JsonField<String> = JsonMissing.of()
            private var value: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                id = body.id
                comment = body.comment
                comparativeExperimentId = body.comparativeExperimentId
                correction = body.correction
                createdAt = body.createdAt
                error = body.error
                feedbackConfig = body.feedbackConfig
                feedbackGroupId = body.feedbackGroupId
                feedbackSource = body.feedbackSource
                key = body.key
                modifiedAt = body.modifiedAt
                runId = body.runId
                score = body.score
                sessionId = body.sessionId
                traceId = body.traceId
                value = body.value
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun comment(comment: String) = comment(JsonField.of(comment))

            /**
             * Sets [Builder.comment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.comment] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun comment(comment: JsonField<String>) = apply { this.comment = comment }

            fun comparativeExperimentId(comparativeExperimentId: String) =
                comparativeExperimentId(JsonField.of(comparativeExperimentId))

            /**
             * Sets [Builder.comparativeExperimentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.comparativeExperimentId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun comparativeExperimentId(comparativeExperimentId: JsonField<String>) = apply {
                this.comparativeExperimentId = comparativeExperimentId
            }

            fun correction(correction: JsonValue) = apply { this.correction = correction }

            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            fun error(error: Boolean) = error(JsonField.of(error))

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<Boolean>) = apply { this.error = error }

            fun feedbackConfig(feedbackConfig: FeedbackConfig) =
                feedbackConfig(JsonField.of(feedbackConfig))

            /**
             * Sets [Builder.feedbackConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.feedbackConfig] with a well-typed [FeedbackConfig]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun feedbackConfig(feedbackConfig: JsonField<FeedbackConfig>) = apply {
                this.feedbackConfig = feedbackConfig
            }

            fun feedbackGroupId(feedbackGroupId: String) =
                feedbackGroupId(JsonField.of(feedbackGroupId))

            /**
             * Sets [Builder.feedbackGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.feedbackGroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun feedbackGroupId(feedbackGroupId: JsonField<String>) = apply {
                this.feedbackGroupId = feedbackGroupId
            }

            fun feedbackSource(feedbackSource: FeedbackSource) =
                feedbackSource(JsonField.of(feedbackSource))

            /**
             * Sets [Builder.feedbackSource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.feedbackSource] with a well-typed [FeedbackSource]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun feedbackSource(feedbackSource: JsonField<FeedbackSource>) = apply {
                this.feedbackSource = feedbackSource
            }

            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            fun modifiedAt(modifiedAt: String) = modifiedAt(JsonField.of(modifiedAt))

            /**
             * Sets [Builder.modifiedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modifiedAt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modifiedAt(modifiedAt: JsonField<String>) = apply { this.modifiedAt = modifiedAt }

            fun runId(runId: String) = runId(JsonField.of(runId))

            /**
             * Sets [Builder.runId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runId(runId: JsonField<String>) = apply { this.runId = runId }

            fun score(score: JsonValue) = apply { this.score = score }

            fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

            /**
             * Sets [Builder.sessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

            fun traceId(traceId: String) = traceId(JsonField.of(traceId))

            /**
             * Sets [Builder.traceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

            fun value(value: JsonValue) = apply { this.value = value }

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
                    id,
                    comment,
                    comparativeExperimentId,
                    correction,
                    createdAt,
                    error,
                    feedbackConfig,
                    feedbackGroupId,
                    feedbackSource,
                    key,
                    modifiedAt,
                    runId,
                    score,
                    sessionId,
                    traceId,
                    value,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            id()
            comment()
            comparativeExperimentId()
            createdAt()
            error()
            feedbackConfig().ifPresent { it.validate() }
            feedbackGroupId()
            feedbackSource().ifPresent { it.validate() }
            key()
            modifiedAt()
            runId()
            sessionId()
            traceId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithApiInvalidDataException) {
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (comment.asKnown().isPresent) 1 else 0) +
                (if (comparativeExperimentId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (error.asKnown().isPresent) 1 else 0) +
                (feedbackConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (feedbackGroupId.asKnown().isPresent) 1 else 0) +
                (feedbackSource.asKnown().getOrNull()?.validity() ?: 0) +
                (if (key.asKnown().isPresent) 1 else 0) +
                (if (modifiedAt.asKnown().isPresent) 1 else 0) +
                (if (runId.asKnown().isPresent) 1 else 0) +
                (if (sessionId.asKnown().isPresent) 1 else 0) +
                (if (traceId.asKnown().isPresent) 1 else 0)

        class FeedbackConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val categories: JsonField<List<Category>>,
            private val max: JsonField<Double>,
            private val min: JsonField<Double>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("categories")
                @ExcludeMissing
                categories: JsonField<List<Category>> = JsonMissing.of(),
                @JsonProperty("max") @ExcludeMissing max: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("min") @ExcludeMissing min: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(categories, max, min, type, mutableMapOf())

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun categories(): Optional<List<Category>> = categories.getOptional("categories")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun max(): Optional<Double> = max.getOptional("max")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun min(): Optional<Double> = min.getOptional("min")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [categories].
             *
             * Unlike [categories], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("categories")
            @ExcludeMissing
            fun _categories(): JsonField<List<Category>> = categories

            /**
             * Returns the raw JSON value of [max].
             *
             * Unlike [max], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("max") @ExcludeMissing fun _max(): JsonField<Double> = max

            /**
             * Returns the raw JSON value of [min].
             *
             * Unlike [min], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("min") @ExcludeMissing fun _min(): JsonField<Double> = min

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

                /** Returns a mutable builder for constructing an instance of [FeedbackConfig]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FeedbackConfig]. */
            class Builder internal constructor() {

                private var categories: JsonField<MutableList<Category>>? = null
                private var max: JsonField<Double> = JsonMissing.of()
                private var min: JsonField<Double> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(feedbackConfig: FeedbackConfig) = apply {
                    categories = feedbackConfig.categories.map { it.toMutableList() }
                    max = feedbackConfig.max
                    min = feedbackConfig.min
                    type = feedbackConfig.type
                    additionalProperties = feedbackConfig.additionalProperties.toMutableMap()
                }

                fun categories(categories: List<Category>) = categories(JsonField.of(categories))

                /**
                 * Sets [Builder.categories] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.categories] with a well-typed `List<Category>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun categories(categories: JsonField<List<Category>>) = apply {
                    this.categories = categories.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Category] to [categories].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCategory(category: Category) = apply {
                    categories =
                        (categories ?: JsonField.of(mutableListOf())).also {
                            checkKnown("categories", it).add(category)
                        }
                }

                fun max(max: Double) = max(JsonField.of(max))

                /**
                 * Sets [Builder.max] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.max] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun max(max: JsonField<Double>) = apply { this.max = max }

                fun min(min: Double) = min(JsonField.of(min))

                /**
                 * Sets [Builder.min] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.min] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun min(min: JsonField<Double>) = apply { this.min = min }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [FeedbackConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): FeedbackConfig =
                    FeedbackConfig(
                        (categories ?: JsonMissing.of()).map { it.toImmutable() },
                        max,
                        min,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FeedbackConfig = apply {
                if (validated) {
                    return@apply
                }

                categories().ifPresent { it.forEach { it.validate() } }
                max()
                min()
                type().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangsmithApiInvalidDataException) {
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
                (categories.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (max.asKnown().isPresent) 1 else 0) +
                    (if (min.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Category
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val label: JsonField<String>,
                private val value: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("label")
                    @ExcludeMissing
                    label: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<Double> = JsonMissing.of(),
                ) : this(label, value, mutableMapOf())

                /**
                 * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun label(): Optional<String> = label.getOptional("label")

                /**
                 * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun value(): Optional<Double> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [label].
                 *
                 * Unlike [label], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

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

                    /** Returns a mutable builder for constructing an instance of [Category]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Category]. */
                class Builder internal constructor() {

                    private var label: JsonField<String> = JsonMissing.of()
                    private var value: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(category: Category) = apply {
                        label = category.label
                        value = category.value
                        additionalProperties = category.additionalProperties.toMutableMap()
                    }

                    fun label(label: String) = label(JsonField.of(label))

                    /**
                     * Sets [Builder.label] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.label] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun label(label: JsonField<String>) = apply { this.label = label }

                    fun value(value: Double) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Double>) = apply { this.value = value }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Category].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Category =
                        Category(label, value, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Category = apply {
                    if (validated) {
                        return@apply
                    }

                    label()
                    value()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangsmithApiInvalidDataException) {
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
                    (if (label.asKnown().isPresent) 1 else 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Category &&
                        label == other.label &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(label, value, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Category{label=$label, value=$value, additionalProperties=$additionalProperties}"
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CONTINUOUS = of("continuous")

                    @JvmField val CATEGORICAL = of("categorical")

                    @JvmField val FREEFORM = of("freeform")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CONTINUOUS,
                    CATEGORICAL,
                    FREEFORM,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONTINUOUS,
                    CATEGORICAL,
                    FREEFORM,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CONTINUOUS -> Value.CONTINUOUS
                        CATEGORICAL -> Value.CATEGORICAL
                        FREEFORM -> Value.FREEFORM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value is a not
                 *   a known member.
                 */
                fun known(): Known =
                    when (this) {
                        CONTINUOUS -> Known.CONTINUOUS
                        CATEGORICAL -> Known.CATEGORICAL
                        FREEFORM -> Known.FREEFORM
                        else -> throw LangsmithApiInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangsmithApiInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangsmithApiInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangsmithApiInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FeedbackConfig &&
                    categories == other.categories &&
                    max == other.max &&
                    min == other.min &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(categories, max, min, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FeedbackConfig{categories=$categories, max=$max, min=$min, type=$type, additionalProperties=$additionalProperties}"
        }

        class FeedbackSource
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val metadata: JsonField<Metadata>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(metadata, type, mutableMapOf())

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

            /**
             * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [FeedbackSource]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FeedbackSource]. */
            class Builder internal constructor() {

                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(feedbackSource: FeedbackSource) = apply {
                    metadata = feedbackSource.metadata
                    type = feedbackSource.type
                    additionalProperties = feedbackSource.additionalProperties.toMutableMap()
                }

                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [FeedbackSource].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): FeedbackSource =
                    FeedbackSource(metadata, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): FeedbackSource = apply {
                if (validated) {
                    return@apply
                }

                metadata().ifPresent { it.validate() }
                type()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangsmithApiInvalidDataException) {
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
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            class Metadata
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LangsmithApiInvalidDataException) {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FeedbackSource &&
                    metadata == other.metadata &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(metadata, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FeedbackSource{metadata=$metadata, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
                comment == other.comment &&
                comparativeExperimentId == other.comparativeExperimentId &&
                correction == other.correction &&
                createdAt == other.createdAt &&
                error == other.error &&
                feedbackConfig == other.feedbackConfig &&
                feedbackGroupId == other.feedbackGroupId &&
                feedbackSource == other.feedbackSource &&
                key == other.key &&
                modifiedAt == other.modifiedAt &&
                runId == other.runId &&
                score == other.score &&
                sessionId == other.sessionId &&
                traceId == other.traceId &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                comment,
                comparativeExperimentId,
                correction,
                createdAt,
                error,
                feedbackConfig,
                feedbackGroupId,
                feedbackSource,
                key,
                modifiedAt,
                runId,
                score,
                sessionId,
                traceId,
                value,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, comment=$comment, comparativeExperimentId=$comparativeExperimentId, correction=$correction, createdAt=$createdAt, error=$error, feedbackConfig=$feedbackConfig, feedbackGroupId=$feedbackGroupId, feedbackSource=$feedbackSource, key=$key, modifiedAt=$modifiedAt, runId=$runId, score=$score, sessionId=$sessionId, traceId=$traceId, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackIngestBatchParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FeedbackIngestBatchParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
