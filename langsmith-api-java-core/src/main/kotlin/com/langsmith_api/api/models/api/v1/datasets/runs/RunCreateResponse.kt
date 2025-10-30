// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets.runs

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.BaseDeserializer
import com.langsmith_api.api.core.BaseSerializer
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.allMaxBy
import com.langsmith_api.api.core.getOrThrow
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = RunCreateResponse.Deserializer::class)
@JsonSerialize(using = RunCreateResponse.Serializer::class)
class RunCreateResponse
private constructor(
    private val exampleWithRuns: List<ExampleWithRuns>? = null,
    private val exampleWithRunsChes: List<ExampleWithRunsCh>? = null,
    private val _json: JsonValue? = null,
) {

    fun exampleWithRuns(): Optional<List<ExampleWithRuns>> = Optional.ofNullable(exampleWithRuns)

    fun exampleWithRunsChes(): Optional<List<ExampleWithRunsCh>> =
        Optional.ofNullable(exampleWithRunsChes)

    fun isExampleWithRuns(): Boolean = exampleWithRuns != null

    fun isExampleWithRunsChes(): Boolean = exampleWithRunsChes != null

    fun asExampleWithRuns(): List<ExampleWithRuns> = exampleWithRuns.getOrThrow("exampleWithRuns")

    fun asExampleWithRunsChes(): List<ExampleWithRunsCh> =
        exampleWithRunsChes.getOrThrow("exampleWithRunsChes")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            exampleWithRuns != null -> visitor.visitExampleWithRuns(exampleWithRuns)
            exampleWithRunsChes != null -> visitor.visitExampleWithRunsChes(exampleWithRunsChes)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): RunCreateResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitExampleWithRuns(exampleWithRuns: List<ExampleWithRuns>) {
                    exampleWithRuns.forEach { it.validate() }
                }

                override fun visitExampleWithRunsChes(
                    exampleWithRunsChes: List<ExampleWithRunsCh>
                ) {
                    exampleWithRunsChes.forEach { it.validate() }
                }
            }
        )
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitExampleWithRuns(exampleWithRuns: List<ExampleWithRuns>) =
                    exampleWithRuns.sumOf { it.validity().toInt() }

                override fun visitExampleWithRunsChes(
                    exampleWithRunsChes: List<ExampleWithRunsCh>
                ) = exampleWithRunsChes.sumOf { it.validity().toInt() }

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunCreateResponse &&
            exampleWithRuns == other.exampleWithRuns &&
            exampleWithRunsChes == other.exampleWithRunsChes
    }

    override fun hashCode(): Int = Objects.hash(exampleWithRuns, exampleWithRunsChes)

    override fun toString(): String =
        when {
            exampleWithRuns != null -> "RunCreateResponse{exampleWithRuns=$exampleWithRuns}"
            exampleWithRunsChes != null ->
                "RunCreateResponse{exampleWithRunsChes=$exampleWithRunsChes}"
            _json != null -> "RunCreateResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid RunCreateResponse")
        }

    companion object {

        @JvmStatic
        fun ofExampleWithRuns(exampleWithRuns: List<ExampleWithRuns>) =
            RunCreateResponse(exampleWithRuns = exampleWithRuns.toImmutable())

        @JvmStatic
        fun ofExampleWithRunsChes(exampleWithRunsChes: List<ExampleWithRunsCh>) =
            RunCreateResponse(exampleWithRunsChes = exampleWithRunsChes.toImmutable())
    }

    /**
     * An interface that defines how to map each variant of [RunCreateResponse] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitExampleWithRuns(exampleWithRuns: List<ExampleWithRuns>): T

        fun visitExampleWithRunsChes(exampleWithRunsChes: List<ExampleWithRunsCh>): T

        /**
         * Maps an unknown variant of [RunCreateResponse] to a value of type [T].
         *
         * An instance of [RunCreateResponse] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LangsmithApiInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LangsmithApiInvalidDataException("Unknown RunCreateResponse: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<RunCreateResponse>(RunCreateResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): RunCreateResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<List<ExampleWithRuns>>())?.let {
                            RunCreateResponse(exampleWithRuns = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<ExampleWithRunsCh>>())?.let {
                            RunCreateResponse(exampleWithRunsChes = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> RunCreateResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<RunCreateResponse>(RunCreateResponse::class) {

        override fun serialize(
            value: RunCreateResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.exampleWithRuns != null -> generator.writeObject(value.exampleWithRuns)
                value.exampleWithRunsChes != null ->
                    generator.writeObject(value.exampleWithRunsChes)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid RunCreateResponse")
            }
        }
    }
}
