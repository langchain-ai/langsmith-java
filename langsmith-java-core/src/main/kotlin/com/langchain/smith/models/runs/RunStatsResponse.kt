// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.BaseDeserializer
import com.langchain.smith.core.BaseSerializer
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangsmithInvalidDataException
import com.langchain.smith.models.public_.datasets.runs.RunStats
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = RunStatsResponse.Deserializer::class)
@JsonSerialize(using = RunStatsResponse.Serializer::class)
class RunStatsResponse
private constructor(
    private val runStats: RunStats? = null,
    private val unionMember1: UnionMember1? = null,
    private val _json: JsonValue? = null,
) {

    fun runStats(): Optional<RunStats> = Optional.ofNullable(runStats)

    fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

    fun isRunStats(): Boolean = runStats != null

    fun isUnionMember1(): Boolean = unionMember1 != null

    fun asRunStats(): RunStats = runStats.getOrThrow("runStats")

    fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            runStats != null -> visitor.visitRunStats(runStats)
            unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): RunStatsResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitRunStats(runStats: RunStats) {
                    runStats.validate()
                }

                override fun visitUnionMember1(unionMember1: UnionMember1) {
                    unionMember1.validate()
                }
            }
        )
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitRunStats(runStats: RunStats) = runStats.validity()

                override fun visitUnionMember1(unionMember1: UnionMember1) = unionMember1.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunStatsResponse &&
            runStats == other.runStats &&
            unionMember1 == other.unionMember1
    }

    override fun hashCode(): Int = Objects.hash(runStats, unionMember1)

    override fun toString(): String =
        when {
            runStats != null -> "RunStatsResponse{runStats=$runStats}"
            unionMember1 != null -> "RunStatsResponse{unionMember1=$unionMember1}"
            _json != null -> "RunStatsResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid RunStatsResponse")
        }

    companion object {

        @JvmStatic fun ofRunStats(runStats: RunStats) = RunStatsResponse(runStats = runStats)

        @JvmStatic
        fun ofUnionMember1(unionMember1: UnionMember1) =
            RunStatsResponse(unionMember1 = unionMember1)
    }

    /**
     * An interface that defines how to map each variant of [RunStatsResponse] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitRunStats(runStats: RunStats): T

        fun visitUnionMember1(unionMember1: UnionMember1): T

        /**
         * Maps an unknown variant of [RunStatsResponse] to a value of type [T].
         *
         * An instance of [RunStatsResponse] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LangsmithInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LangsmithInvalidDataException("Unknown RunStatsResponse: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<RunStatsResponse>(RunStatsResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): RunStatsResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<RunStats>())?.let {
                            RunStatsResponse(runStats = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                            RunStatsResponse(unionMember1 = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> RunStatsResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<RunStatsResponse>(RunStatsResponse::class) {

        override fun serialize(
            value: RunStatsResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.runStats != null -> generator.writeObject(value.runStats)
                value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid RunStatsResponse")
            }
        }
    }

    class UnionMember1
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

            /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember1]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember1: UnionMember1) = apply {
                additionalProperties = unionMember1.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [UnionMember1].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember1 = UnionMember1(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): UnionMember1 = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember1 && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "UnionMember1{additionalProperties=$additionalProperties}"
    }
}
