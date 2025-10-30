// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomChartsDataPoint
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val seriesId: JsonField<String>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val value: JsonField<Value>,
    private val group: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("series_id") @ExcludeMissing seriesId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
        @JsonProperty("group") @ExcludeMissing group: JsonField<String> = JsonMissing.of(),
    ) : this(seriesId, timestamp, value, group, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun seriesId(): String = seriesId.getRequired("series_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<Value> = value.getOptional("value")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun group(): Optional<String> = group.getOptional("group")

    /**
     * Returns the raw JSON value of [seriesId].
     *
     * Unlike [seriesId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("series_id") @ExcludeMissing fun _seriesId(): JsonField<String> = seriesId

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

    /**
     * Returns the raw JSON value of [group].
     *
     * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<String> = group

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

        /**
         * Returns a mutable builder for constructing an instance of [CustomChartsDataPoint].
         *
         * The following fields are required:
         * ```java
         * .seriesId()
         * .timestamp()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChartsDataPoint]. */
    class Builder internal constructor() {

        private var seriesId: JsonField<String>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var value: JsonField<Value>? = null
        private var group: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customChartsDataPoint: CustomChartsDataPoint) = apply {
            seriesId = customChartsDataPoint.seriesId
            timestamp = customChartsDataPoint.timestamp
            value = customChartsDataPoint.value
            group = customChartsDataPoint.group
            additionalProperties = customChartsDataPoint.additionalProperties.toMutableMap()
        }

        fun seriesId(seriesId: String) = seriesId(JsonField.of(seriesId))

        /**
         * Sets [Builder.seriesId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seriesId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun seriesId(seriesId: JsonField<String>) = apply { this.seriesId = seriesId }

        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        fun value(value: Value?) = value(JsonField.ofNullable(value))

        /** Alias for calling [Builder.value] with `value.orElse(null)`. */
        fun value(value: Optional<Value>) = value(value.getOrNull())

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Value] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Value>) = apply { this.value = value }

        /** Alias for calling [value] with `Value.ofNumber(number)`. */
        fun value(number: Double) = value(Value.ofNumber(number))

        /** Alias for calling [value] with `Value.ofJson(json)`. */
        fun value(json: JsonValue) = value(Value.ofJson(json))

        fun group(group: String?) = group(JsonField.ofNullable(group))

        /** Alias for calling [Builder.group] with `group.orElse(null)`. */
        fun group(group: Optional<String>) = group(group.getOrNull())

        /**
         * Sets [Builder.group] to an arbitrary JSON value.
         *
         * You should usually call [Builder.group] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun group(group: JsonField<String>) = apply { this.group = group }

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
         * Returns an immutable instance of [CustomChartsDataPoint].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .seriesId()
         * .timestamp()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomChartsDataPoint =
            CustomChartsDataPoint(
                checkRequired("seriesId", seriesId),
                checkRequired("timestamp", timestamp),
                checkRequired("value", value),
                group,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomChartsDataPoint = apply {
        if (validated) {
            return@apply
        }

        seriesId()
        timestamp()
        value().ifPresent { it.validate() }
        group()
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
        (if (seriesId.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (value.asKnown().getOrNull()?.validity() ?: 0) +
            (if (group.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = Value.Deserializer::class)
    @JsonSerialize(using = Value.Serializer::class)
    class Value
    private constructor(
        private val number: Double? = null,
        private val json: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun json(): Optional<JsonValue> = Optional.ofNullable(json)

        fun isNumber(): Boolean = number != null

        fun isJson(): Boolean = json != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asJson(): JsonValue = json.getOrThrow("json")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                json != null -> visitor.visitJson(json)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Value = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitJson(json: JsonValue) {}
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitNumber(number: Double) = 1

                    override fun visitJson(json: JsonValue) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Value && number == other.number && json == other.json
        }

        override fun hashCode(): Int = Objects.hash(number, json)

        override fun toString(): String =
            when {
                number != null -> "Value{number=$number}"
                json != null -> "Value{json=$json}"
                _json != null -> "Value{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Value")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = Value(number = number)

            @JvmStatic fun ofJson(json: JsonValue) = Value(json = json)
        }

        /** An interface that defines how to map each variant of [Value] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitJson(json: JsonValue): T

            /**
             * Maps an unknown variant of [Value] to a value of type [T].
             *
             * An instance of [Value] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangsmithInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangsmithInvalidDataException("Unknown Value: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Value>(Value::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Value {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                Value(number = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                Value(json = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants.
                    0 -> Value(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Value>(Value::class) {

            override fun serialize(
                value: Value,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.json != null -> generator.writeObject(value.json)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Value")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChartsDataPoint &&
            seriesId == other.seriesId &&
            timestamp == other.timestamp &&
            value == other.value &&
            group == other.group &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(seriesId, timestamp, value, group, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomChartsDataPoint{seriesId=$seriesId, timestamp=$timestamp, value=$value, group=$group, additionalProperties=$additionalProperties}"
}
