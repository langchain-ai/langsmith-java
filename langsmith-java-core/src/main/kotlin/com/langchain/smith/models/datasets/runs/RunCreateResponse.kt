// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.runs

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

@JsonDeserialize(using = RunCreateResponse.Deserializer::class)
@JsonSerialize(using = RunCreateResponse.Serializer::class)
class RunCreateResponse
private constructor(
    private val examplesWithRuns: List<ExampleWithRuns>? = null,
    private val exampleWithRunsChes: List<ExampleWithRunsCh>? = null,
    private val _json: JsonValue? = null,
) {

    fun examplesWithRuns(): Optional<List<ExampleWithRuns>> = Optional.ofNullable(examplesWithRuns)

    fun exampleWithRunsChes(): Optional<List<ExampleWithRunsCh>> =
        Optional.ofNullable(exampleWithRunsChes)

    fun isExamplesWithRuns(): Boolean = examplesWithRuns != null

    fun isExampleWithRunsChes(): Boolean = exampleWithRunsChes != null

    fun asExamplesWithRuns(): List<ExampleWithRuns> =
        examplesWithRuns.getOrThrow("examplesWithRuns")

    fun asExampleWithRunsChes(): List<ExampleWithRunsCh> =
        exampleWithRunsChes.getOrThrow("exampleWithRunsChes")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            examplesWithRuns != null -> visitor.visitExamplesWithRuns(examplesWithRuns)
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
                override fun visitExamplesWithRuns(examplesWithRuns: List<ExampleWithRuns>) {
                    examplesWithRuns.forEach { it.validate() }
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
                override fun visitExamplesWithRuns(examplesWithRuns: List<ExampleWithRuns>) =
                    examplesWithRuns.sumOf { it.validity().toInt() }

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
            examplesWithRuns == other.examplesWithRuns &&
            exampleWithRunsChes == other.exampleWithRunsChes
    }

    override fun hashCode(): Int = Objects.hash(examplesWithRuns, exampleWithRunsChes)

    override fun toString(): String =
        when {
            examplesWithRuns != null -> "RunCreateResponse{examplesWithRuns=$examplesWithRuns}"
            exampleWithRunsChes != null ->
                "RunCreateResponse{exampleWithRunsChes=$exampleWithRunsChes}"
            _json != null -> "RunCreateResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid RunCreateResponse")
        }

    companion object {

        @JvmStatic
        fun ofExamplesWithRuns(examplesWithRuns: List<ExampleWithRuns>) =
            RunCreateResponse(examplesWithRuns = examplesWithRuns.toImmutable())

        @JvmStatic
        fun ofExampleWithRunsChes(exampleWithRunsChes: List<ExampleWithRunsCh>) =
            RunCreateResponse(exampleWithRunsChes = exampleWithRunsChes.toImmutable())
    }

    /**
     * An interface that defines how to map each variant of [RunCreateResponse] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitExamplesWithRuns(examplesWithRuns: List<ExampleWithRuns>): T

        fun visitExampleWithRunsChes(exampleWithRunsChes: List<ExampleWithRunsCh>): T

        /**
         * Maps an unknown variant of [RunCreateResponse] to a value of type [T].
         *
         * An instance of [RunCreateResponse] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LangChainInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LangChainInvalidDataException("Unknown RunCreateResponse: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<RunCreateResponse>(RunCreateResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): RunCreateResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<List<ExampleWithRuns>>())?.let {
                            RunCreateResponse(examplesWithRuns = it, _json = json)
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
                value.examplesWithRuns != null -> generator.writeObject(value.examplesWithRuns)
                value.exampleWithRunsChes != null ->
                    generator.writeObject(value.exampleWithRunsChes)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid RunCreateResponse")
            }
        }
    }
}
