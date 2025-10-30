// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

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
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create Identity Annotation Queue Run Status */
class AnnotationQueueCreateRunStatusParams
private constructor(
    private val annotationQueueRunId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun annotationQueueRunId(): Optional<String> = Optional.ofNullable(annotationQueueRunId)

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overrideAddedAt(): Optional<OffsetDateTime> = body.overrideAddedAt()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = body.status()

    /**
     * Returns the raw JSON value of [overrideAddedAt].
     *
     * Unlike [overrideAddedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _overrideAddedAt(): JsonField<OffsetDateTime> = body._overrideAddedAt()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<String> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AnnotationQueueCreateRunStatusParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [AnnotationQueueCreateRunStatusParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnnotationQueueCreateRunStatusParams]. */
    class Builder internal constructor() {

        private var annotationQueueRunId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            annotationQueueCreateRunStatusParams: AnnotationQueueCreateRunStatusParams
        ) = apply {
            annotationQueueRunId = annotationQueueCreateRunStatusParams.annotationQueueRunId
            body = annotationQueueCreateRunStatusParams.body.toBuilder()
            additionalHeaders = annotationQueueCreateRunStatusParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                annotationQueueCreateRunStatusParams.additionalQueryParams.toBuilder()
        }

        fun annotationQueueRunId(annotationQueueRunId: String?) = apply {
            this.annotationQueueRunId = annotationQueueRunId
        }

        /**
         * Alias for calling [Builder.annotationQueueRunId] with
         * `annotationQueueRunId.orElse(null)`.
         */
        fun annotationQueueRunId(annotationQueueRunId: Optional<String>) =
            annotationQueueRunId(annotationQueueRunId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [overrideAddedAt]
         * - [status]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun overrideAddedAt(overrideAddedAt: OffsetDateTime?) = apply {
            body.overrideAddedAt(overrideAddedAt)
        }

        /** Alias for calling [Builder.overrideAddedAt] with `overrideAddedAt.orElse(null)`. */
        fun overrideAddedAt(overrideAddedAt: Optional<OffsetDateTime>) =
            overrideAddedAt(overrideAddedAt.getOrNull())

        /**
         * Sets [Builder.overrideAddedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overrideAddedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun overrideAddedAt(overrideAddedAt: JsonField<OffsetDateTime>) = apply {
            body.overrideAddedAt(overrideAddedAt)
        }

        fun status(status: String?) = apply { body.status(status) }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<String>) = status(status.getOrNull())

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { body.status(status) }

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
         * Returns an immutable instance of [AnnotationQueueCreateRunStatusParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AnnotationQueueCreateRunStatusParams =
            AnnotationQueueCreateRunStatusParams(
                annotationQueueRunId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> annotationQueueRunId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Identity annotation queue run status create schema. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val overrideAddedAt: JsonField<OffsetDateTime>,
        private val status: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("override_added_at")
            @ExcludeMissing
            overrideAddedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        ) : this(overrideAddedAt, status, mutableMapOf())

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun overrideAddedAt(): Optional<OffsetDateTime> =
            overrideAddedAt.getOptional("override_added_at")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [overrideAddedAt].
         *
         * Unlike [overrideAddedAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("override_added_at")
        @ExcludeMissing
        fun _overrideAddedAt(): JsonField<OffsetDateTime> = overrideAddedAt

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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

            private var overrideAddedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                overrideAddedAt = body.overrideAddedAt
                status = body.status
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun overrideAddedAt(overrideAddedAt: OffsetDateTime?) =
                overrideAddedAt(JsonField.ofNullable(overrideAddedAt))

            /** Alias for calling [Builder.overrideAddedAt] with `overrideAddedAt.orElse(null)`. */
            fun overrideAddedAt(overrideAddedAt: Optional<OffsetDateTime>) =
                overrideAddedAt(overrideAddedAt.getOrNull())

            /**
             * Sets [Builder.overrideAddedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overrideAddedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun overrideAddedAt(overrideAddedAt: JsonField<OffsetDateTime>) = apply {
                this.overrideAddedAt = overrideAddedAt
            }

            fun status(status: String?) = status(JsonField.ofNullable(status))

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<String>) = status(status.getOrNull())

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

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
            fun build(): Body = Body(overrideAddedAt, status, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            overrideAddedAt()
            status()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithInvalidDataException) {
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
            (if (overrideAddedAt.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                overrideAddedAt == other.overrideAddedAt &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(overrideAddedAt, status, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{overrideAddedAt=$overrideAddedAt, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnnotationQueueCreateRunStatusParams &&
            annotationQueueRunId == other.annotationQueueRunId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(annotationQueueRunId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AnnotationQueueCreateRunStatusParams{annotationQueueRunId=$annotationQueueRunId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
