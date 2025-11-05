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
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Objects
import java.util.Optional

/** Feedback ingest token schema. */
@JsonDeserialize(using = TokenCreateResponse.Deserializer::class)
@JsonSerialize(using = TokenCreateResponse.Serializer::class)
class TokenCreateResponse
private constructor(
    private val feedbackIngestTokenSchema: FeedbackIngestTokenSchema? = null,
    private val feedbackIngestTokenSchemas: List<FeedbackIngestTokenSchema>? = null,
    private val _json: JsonValue? = null,
) {

    /** Feedback ingest token schema. */
    fun feedbackIngestTokenSchema(): Optional<FeedbackIngestTokenSchema> =
        Optional.ofNullable(feedbackIngestTokenSchema)

    fun feedbackIngestTokenSchemas(): Optional<List<FeedbackIngestTokenSchema>> =
        Optional.ofNullable(feedbackIngestTokenSchemas)

    fun isFeedbackIngestTokenSchema(): Boolean = feedbackIngestTokenSchema != null

    fun isFeedbackIngestTokenSchemas(): Boolean = feedbackIngestTokenSchemas != null

    /** Feedback ingest token schema. */
    fun asFeedbackIngestTokenSchema(): FeedbackIngestTokenSchema =
        feedbackIngestTokenSchema.getOrThrow("feedbackIngestTokenSchema")

    fun asFeedbackIngestTokenSchemas(): List<FeedbackIngestTokenSchema> =
        feedbackIngestTokenSchemas.getOrThrow("feedbackIngestTokenSchemas")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            feedbackIngestTokenSchema != null ->
                visitor.visitFeedbackIngestTokenSchema(feedbackIngestTokenSchema)
            feedbackIngestTokenSchemas != null ->
                visitor.visitFeedbackIngestTokenSchemas(feedbackIngestTokenSchemas)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): TokenCreateResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitFeedbackIngestTokenSchema(
                    feedbackIngestTokenSchema: FeedbackIngestTokenSchema
                ) {
                    feedbackIngestTokenSchema.validate()
                }

                override fun visitFeedbackIngestTokenSchemas(
                    feedbackIngestTokenSchemas: List<FeedbackIngestTokenSchema>
                ) {
                    feedbackIngestTokenSchemas.forEach { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitFeedbackIngestTokenSchema(
                    feedbackIngestTokenSchema: FeedbackIngestTokenSchema
                ) = feedbackIngestTokenSchema.validity()

                override fun visitFeedbackIngestTokenSchemas(
                    feedbackIngestTokenSchemas: List<FeedbackIngestTokenSchema>
                ) = feedbackIngestTokenSchemas.sumOf { it.validity().toInt() }

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenCreateResponse &&
            feedbackIngestTokenSchema == other.feedbackIngestTokenSchema &&
            feedbackIngestTokenSchemas == other.feedbackIngestTokenSchemas
    }

    override fun hashCode(): Int =
        Objects.hash(feedbackIngestTokenSchema, feedbackIngestTokenSchemas)

    override fun toString(): String =
        when {
            feedbackIngestTokenSchema != null ->
                "TokenCreateResponse{feedbackIngestTokenSchema=$feedbackIngestTokenSchema}"
            feedbackIngestTokenSchemas != null ->
                "TokenCreateResponse{feedbackIngestTokenSchemas=$feedbackIngestTokenSchemas}"
            _json != null -> "TokenCreateResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TokenCreateResponse")
        }

    companion object {

        /** Feedback ingest token schema. */
        @JvmStatic
        fun ofFeedbackIngestTokenSchema(feedbackIngestTokenSchema: FeedbackIngestTokenSchema) =
            TokenCreateResponse(feedbackIngestTokenSchema = feedbackIngestTokenSchema)

        @JvmStatic
        fun ofFeedbackIngestTokenSchemas(
            feedbackIngestTokenSchemas: List<FeedbackIngestTokenSchema>
        ) =
            TokenCreateResponse(
                feedbackIngestTokenSchemas = feedbackIngestTokenSchemas.toImmutable()
            )
    }

    /**
     * An interface that defines how to map each variant of [TokenCreateResponse] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /** Feedback ingest token schema. */
        fun visitFeedbackIngestTokenSchema(feedbackIngestTokenSchema: FeedbackIngestTokenSchema): T

        fun visitFeedbackIngestTokenSchemas(
            feedbackIngestTokenSchemas: List<FeedbackIngestTokenSchema>
        ): T

        /**
         * Maps an unknown variant of [TokenCreateResponse] to a value of type [T].
         *
         * An instance of [TokenCreateResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LangChainInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LangChainInvalidDataException("Unknown TokenCreateResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TokenCreateResponse>(TokenCreateResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): TokenCreateResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<FeedbackIngestTokenSchema>())?.let {
                            TokenCreateResponse(feedbackIngestTokenSchema = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<FeedbackIngestTokenSchema>>())
                            ?.let {
                                TokenCreateResponse(feedbackIngestTokenSchemas = it, _json = json)
                            },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> TokenCreateResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<TokenCreateResponse>(TokenCreateResponse::class) {

        override fun serialize(
            value: TokenCreateResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.feedbackIngestTokenSchema != null ->
                    generator.writeObject(value.feedbackIngestTokenSchema)
                value.feedbackIngestTokenSchemas != null ->
                    generator.writeObject(value.feedbackIngestTokenSchemas)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TokenCreateResponse")
            }
        }
    }
}
