// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback.tokens

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.BaseDeserializer
import com.langchain.smith.core.BaseSerializer
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Objects
import java.util.Optional

/** Create a new feedback ingest token. */
class TokenCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Feedback ingest token create schema. */
    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TokenCreateParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenCreateParams]. */
    class Builder internal constructor() {

        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tokenCreateParams: TokenCreateParams) = apply {
            body = tokenCreateParams.body
            additionalHeaders = tokenCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = tokenCreateParams.additionalQueryParams.toBuilder()
        }

        /** Feedback ingest token create schema. */
        fun body(body: Body) = apply { this.body = body }

        /**
         * Alias for calling [body] with
         * `Body.ofFeedbackIngestTokenCreateSchema(feedbackIngestTokenCreateSchema)`.
         */
        fun body(feedbackIngestTokenCreateSchema: FeedbackIngestTokenCreateSchema) =
            body(Body.ofFeedbackIngestTokenCreateSchema(feedbackIngestTokenCreateSchema))

        /**
         * Alias for calling [body] with
         * `Body.ofFeedbackIngestTokenCreateSchemas(feedbackIngestTokenCreateSchemas)`.
         */
        fun bodyOfFeedbackIngestTokenCreateSchemas(
            feedbackIngestTokenCreateSchemas: List<FeedbackIngestTokenCreateSchema>
        ) = body(Body.ofFeedbackIngestTokenCreateSchemas(feedbackIngestTokenCreateSchemas))

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
         * Returns an immutable instance of [TokenCreateParams].
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
        fun build(): TokenCreateParams =
            TokenCreateParams(
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Feedback ingest token create schema. */
    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val feedbackIngestTokenCreateSchema: FeedbackIngestTokenCreateSchema? = null,
        private val feedbackIngestTokenCreateSchemas: List<FeedbackIngestTokenCreateSchema>? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Feedback ingest token create schema. */
        fun feedbackIngestTokenCreateSchema(): Optional<FeedbackIngestTokenCreateSchema> =
            Optional.ofNullable(feedbackIngestTokenCreateSchema)

        fun feedbackIngestTokenCreateSchemas(): Optional<List<FeedbackIngestTokenCreateSchema>> =
            Optional.ofNullable(feedbackIngestTokenCreateSchemas)

        fun isFeedbackIngestTokenCreateSchema(): Boolean = feedbackIngestTokenCreateSchema != null

        fun isFeedbackIngestTokenCreateSchemas(): Boolean = feedbackIngestTokenCreateSchemas != null

        /** Feedback ingest token create schema. */
        fun asFeedbackIngestTokenCreateSchema(): FeedbackIngestTokenCreateSchema =
            feedbackIngestTokenCreateSchema.getOrThrow("feedbackIngestTokenCreateSchema")

        fun asFeedbackIngestTokenCreateSchemas(): List<FeedbackIngestTokenCreateSchema> =
            feedbackIngestTokenCreateSchemas.getOrThrow("feedbackIngestTokenCreateSchemas")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                feedbackIngestTokenCreateSchema != null ->
                    visitor.visitFeedbackIngestTokenCreateSchema(feedbackIngestTokenCreateSchema)
                feedbackIngestTokenCreateSchemas != null ->
                    visitor.visitFeedbackIngestTokenCreateSchemas(feedbackIngestTokenCreateSchemas)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitFeedbackIngestTokenCreateSchema(
                        feedbackIngestTokenCreateSchema: FeedbackIngestTokenCreateSchema
                    ) {
                        feedbackIngestTokenCreateSchema.validate()
                    }

                    override fun visitFeedbackIngestTokenCreateSchemas(
                        feedbackIngestTokenCreateSchemas: List<FeedbackIngestTokenCreateSchema>
                    ) {
                        feedbackIngestTokenCreateSchemas.forEach { it.validate() }
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitFeedbackIngestTokenCreateSchema(
                        feedbackIngestTokenCreateSchema: FeedbackIngestTokenCreateSchema
                    ) = feedbackIngestTokenCreateSchema.validity()

                    override fun visitFeedbackIngestTokenCreateSchemas(
                        feedbackIngestTokenCreateSchemas: List<FeedbackIngestTokenCreateSchema>
                    ) = feedbackIngestTokenCreateSchemas.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                feedbackIngestTokenCreateSchema == other.feedbackIngestTokenCreateSchema &&
                feedbackIngestTokenCreateSchemas == other.feedbackIngestTokenCreateSchemas
        }

        override fun hashCode(): Int =
            Objects.hash(feedbackIngestTokenCreateSchema, feedbackIngestTokenCreateSchemas)

        override fun toString(): String =
            when {
                feedbackIngestTokenCreateSchema != null ->
                    "Body{feedbackIngestTokenCreateSchema=$feedbackIngestTokenCreateSchema}"
                feedbackIngestTokenCreateSchemas != null ->
                    "Body{feedbackIngestTokenCreateSchemas=$feedbackIngestTokenCreateSchemas}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            /** Feedback ingest token create schema. */
            @JvmStatic
            fun ofFeedbackIngestTokenCreateSchema(
                feedbackIngestTokenCreateSchema: FeedbackIngestTokenCreateSchema
            ) = Body(feedbackIngestTokenCreateSchema = feedbackIngestTokenCreateSchema)

            @JvmStatic
            fun ofFeedbackIngestTokenCreateSchemas(
                feedbackIngestTokenCreateSchemas: List<FeedbackIngestTokenCreateSchema>
            ) =
                Body(
                    feedbackIngestTokenCreateSchemas =
                        feedbackIngestTokenCreateSchemas.toImmutable()
                )
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            /** Feedback ingest token create schema. */
            fun visitFeedbackIngestTokenCreateSchema(
                feedbackIngestTokenCreateSchema: FeedbackIngestTokenCreateSchema
            ): T

            fun visitFeedbackIngestTokenCreateSchemas(
                feedbackIngestTokenCreateSchemas: List<FeedbackIngestTokenCreateSchema>
            ): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<FeedbackIngestTokenCreateSchema>())
                                ?.let { Body(feedbackIngestTokenCreateSchema = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<List<FeedbackIngestTokenCreateSchema>>(),
                                )
                                ?.let { Body(feedbackIngestTokenCreateSchemas = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.feedbackIngestTokenCreateSchema != null ->
                        generator.writeObject(value.feedbackIngestTokenCreateSchema)
                    value.feedbackIngestTokenCreateSchemas != null ->
                        generator.writeObject(value.feedbackIngestTokenCreateSchemas)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TokenCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
