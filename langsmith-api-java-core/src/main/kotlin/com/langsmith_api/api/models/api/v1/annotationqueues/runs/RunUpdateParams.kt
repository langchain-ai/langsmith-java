// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.annotationqueues.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update Run In Annotation Queue */
class RunUpdateParams
private constructor(
    private val queueId: String,
    private val queueRunId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun queueId(): String = queueId

    fun queueRunId(): Optional<String> = Optional.ofNullable(queueRunId)

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun addedAt(): Optional<OffsetDateTime> = body.addedAt()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lastReviewedTime(): Optional<OffsetDateTime> = body.lastReviewedTime()

    /**
     * Returns the raw JSON value of [addedAt].
     *
     * Unlike [addedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addedAt(): JsonField<OffsetDateTime> = body._addedAt()

    /**
     * Returns the raw JSON value of [lastReviewedTime].
     *
     * Unlike [lastReviewedTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _lastReviewedTime(): JsonField<OffsetDateTime> = body._lastReviewedTime()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .queueId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunUpdateParams]. */
    class Builder internal constructor() {

        private var queueId: String? = null
        private var queueRunId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runUpdateParams: RunUpdateParams) = apply {
            queueId = runUpdateParams.queueId
            queueRunId = runUpdateParams.queueRunId
            body = runUpdateParams.body.toBuilder()
            additionalHeaders = runUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = runUpdateParams.additionalQueryParams.toBuilder()
        }

        fun queueId(queueId: String) = apply { this.queueId = queueId }

        fun queueRunId(queueRunId: String?) = apply { this.queueRunId = queueRunId }

        /** Alias for calling [Builder.queueRunId] with `queueRunId.orElse(null)`. */
        fun queueRunId(queueRunId: Optional<String>) = queueRunId(queueRunId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [addedAt]
         * - [lastReviewedTime]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun addedAt(addedAt: OffsetDateTime?) = apply { body.addedAt(addedAt) }

        /** Alias for calling [Builder.addedAt] with `addedAt.orElse(null)`. */
        fun addedAt(addedAt: Optional<OffsetDateTime>) = addedAt(addedAt.getOrNull())

        /**
         * Sets [Builder.addedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addedAt(addedAt: JsonField<OffsetDateTime>) = apply { body.addedAt(addedAt) }

        fun lastReviewedTime(lastReviewedTime: OffsetDateTime?) = apply {
            body.lastReviewedTime(lastReviewedTime)
        }

        /** Alias for calling [Builder.lastReviewedTime] with `lastReviewedTime.orElse(null)`. */
        fun lastReviewedTime(lastReviewedTime: Optional<OffsetDateTime>) =
            lastReviewedTime(lastReviewedTime.getOrNull())

        /**
         * Sets [Builder.lastReviewedTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastReviewedTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastReviewedTime(lastReviewedTime: JsonField<OffsetDateTime>) = apply {
            body.lastReviewedTime(lastReviewedTime)
        }

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
         * Returns an immutable instance of [RunUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .queueId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunUpdateParams =
            RunUpdateParams(
                checkRequired("queueId", queueId),
                queueRunId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> queueId
            1 -> queueRunId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val addedAt: JsonField<OffsetDateTime>,
        private val lastReviewedTime: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("added_at")
            @ExcludeMissing
            addedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("last_reviewed_time")
            @ExcludeMissing
            lastReviewedTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(addedAt, lastReviewedTime, mutableMapOf())

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun addedAt(): Optional<OffsetDateTime> = addedAt.getOptional("added_at")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lastReviewedTime(): Optional<OffsetDateTime> =
            lastReviewedTime.getOptional("last_reviewed_time")

        /**
         * Returns the raw JSON value of [addedAt].
         *
         * Unlike [addedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("added_at")
        @ExcludeMissing
        fun _addedAt(): JsonField<OffsetDateTime> = addedAt

        /**
         * Returns the raw JSON value of [lastReviewedTime].
         *
         * Unlike [lastReviewedTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("last_reviewed_time")
        @ExcludeMissing
        fun _lastReviewedTime(): JsonField<OffsetDateTime> = lastReviewedTime

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

            private var addedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var lastReviewedTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                addedAt = body.addedAt
                lastReviewedTime = body.lastReviewedTime
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun addedAt(addedAt: OffsetDateTime?) = addedAt(JsonField.ofNullable(addedAt))

            /** Alias for calling [Builder.addedAt] with `addedAt.orElse(null)`. */
            fun addedAt(addedAt: Optional<OffsetDateTime>) = addedAt(addedAt.getOrNull())

            /**
             * Sets [Builder.addedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addedAt(addedAt: JsonField<OffsetDateTime>) = apply { this.addedAt = addedAt }

            fun lastReviewedTime(lastReviewedTime: OffsetDateTime?) =
                lastReviewedTime(JsonField.ofNullable(lastReviewedTime))

            /**
             * Alias for calling [Builder.lastReviewedTime] with `lastReviewedTime.orElse(null)`.
             */
            fun lastReviewedTime(lastReviewedTime: Optional<OffsetDateTime>) =
                lastReviewedTime(lastReviewedTime.getOrNull())

            /**
             * Sets [Builder.lastReviewedTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastReviewedTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lastReviewedTime(lastReviewedTime: JsonField<OffsetDateTime>) = apply {
                this.lastReviewedTime = lastReviewedTime
            }

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
            fun build(): Body = Body(addedAt, lastReviewedTime, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            addedAt()
            lastReviewedTime()
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
            (if (addedAt.asKnown().isPresent) 1 else 0) +
                (if (lastReviewedTime.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                addedAt == other.addedAt &&
                lastReviewedTime == other.lastReviewedTime &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(addedAt, lastReviewedTime, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{addedAt=$addedAt, lastReviewedTime=$lastReviewedTime, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunUpdateParams &&
            queueId == other.queueId &&
            queueRunId == other.queueRunId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(queueId, queueRunId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RunUpdateParams{queueId=$queueId, queueRunId=$queueRunId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
