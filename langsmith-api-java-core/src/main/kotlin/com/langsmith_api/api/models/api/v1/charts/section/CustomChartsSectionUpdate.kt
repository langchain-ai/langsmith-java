// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.charts.section

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
import com.langsmith_api.api.core.BaseDeserializer
import com.langsmith_api.api.core.BaseSerializer
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.allMaxBy
import com.langsmith_api.api.core.getOrThrow
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import com.langsmith_api.api.models.api.v1.datasets.Missing
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomChartsSectionUpdate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<Description>,
    private val index: JsonField<Index>,
    private val title: JsonField<Title>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<Description> = JsonMissing.of(),
        @JsonProperty("index") @ExcludeMissing index: JsonField<Index> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<Title> = JsonMissing.of(),
    ) : this(description, index, title, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<Description> = description.getOptional("description")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun index(): Optional<Index> = index.getOptional("index")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun title(): Optional<Title> = title.getOptional("title")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description")
    @ExcludeMissing
    fun _description(): JsonField<Description> = description

    /**
     * Returns the raw JSON value of [index].
     *
     * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Index> = index

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<Title> = title

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
         * Returns a mutable builder for constructing an instance of [CustomChartsSectionUpdate].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChartsSectionUpdate]. */
    class Builder internal constructor() {

        private var description: JsonField<Description> = JsonMissing.of()
        private var index: JsonField<Index> = JsonMissing.of()
        private var title: JsonField<Title> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customChartsSectionUpdate: CustomChartsSectionUpdate) = apply {
            description = customChartsSectionUpdate.description
            index = customChartsSectionUpdate.index
            title = customChartsSectionUpdate.title
            additionalProperties = customChartsSectionUpdate.additionalProperties.toMutableMap()
        }

        fun description(description: Description?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<Description>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [Description] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun description(description: JsonField<Description>) = apply {
            this.description = description
        }

        /** Alias for calling [description] with `Description.ofString(string)`. */
        fun description(string: String) = description(Description.ofString(string))

        /** Alias for calling [description] with `Description.ofMissing(missing)`. */
        fun description(missing: Missing) = description(Description.ofMissing(missing))

        fun index(index: Index) = index(JsonField.of(index))

        /**
         * Sets [Builder.index] to an arbitrary JSON value.
         *
         * You should usually call [Builder.index] with a well-typed [Index] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun index(index: JsonField<Index>) = apply { this.index = index }

        /** Alias for calling [index] with `Index.ofInteger(integer)`. */
        fun index(integer: Long) = index(Index.ofInteger(integer))

        /** Alias for calling [index] with `Index.ofMissing(missing)`. */
        fun index(missing: Missing) = index(Index.ofMissing(missing))

        fun title(title: Title) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [Title] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<Title>) = apply { this.title = title }

        /** Alias for calling [title] with `Title.ofString(string)`. */
        fun title(string: String) = title(Title.ofString(string))

        /** Alias for calling [title] with `Title.ofMissing(missing)`. */
        fun title(missing: Missing) = title(Title.ofMissing(missing))

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
         * Returns an immutable instance of [CustomChartsSectionUpdate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomChartsSectionUpdate =
            CustomChartsSectionUpdate(
                description,
                index,
                title,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomChartsSectionUpdate = apply {
        if (validated) {
            return@apply
        }

        description().ifPresent { it.validate() }
        index().ifPresent { it.validate() }
        title().ifPresent { it.validate() }
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
        (description.asKnown().getOrNull()?.validity() ?: 0) +
            (index.asKnown().getOrNull()?.validity() ?: 0) +
            (title.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = Description.Deserializer::class)
    @JsonSerialize(using = Description.Serializer::class)
    class Description
    private constructor(
        private val string: String? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isString(): Boolean = string != null

        fun isMissing(): Boolean = missing != null

        fun asString(): String = string.getOrThrow("string")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Description = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Description && string == other.string && missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(string, missing)

        override fun toString(): String =
            when {
                string != null -> "Description{string=$string}"
                missing != null -> "Description{missing=$missing}"
                _json != null -> "Description{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Description")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Description(string = string)

            @JvmStatic fun ofMissing(missing: Missing) = Description(missing = missing)
        }

        /**
         * An interface that defines how to map each variant of [Description] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [Description] to a value of type [T].
             *
             * An instance of [Description] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LangsmithApiInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangsmithApiInvalidDataException("Unknown Description: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Description>(Description::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Description {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                Description(missing = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Description(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from array).
                    0 -> Description(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Description>(Description::class) {

            override fun serialize(
                value: Description,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Description")
                }
            }
        }
    }

    @JsonDeserialize(using = Index.Deserializer::class)
    @JsonSerialize(using = Index.Serializer::class)
    class Index
    private constructor(
        private val integer: Long? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun integer(): Optional<Long> = Optional.ofNullable(integer)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isInteger(): Boolean = integer != null

        fun isMissing(): Boolean = missing != null

        fun asInteger(): Long = integer.getOrThrow("integer")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                integer != null -> visitor.visitInteger(integer)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Index = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitInteger(integer: Long) {}

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitInteger(integer: Long) = 1

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Index && integer == other.integer && missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(integer, missing)

        override fun toString(): String =
            when {
                integer != null -> "Index{integer=$integer}"
                missing != null -> "Index{missing=$missing}"
                _json != null -> "Index{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Index")
            }

        companion object {

            @JvmStatic fun ofInteger(integer: Long) = Index(integer = integer)

            @JvmStatic fun ofMissing(missing: Missing) = Index(missing = missing)
        }

        /** An interface that defines how to map each variant of [Index] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitInteger(integer: Long): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [Index] to a value of type [T].
             *
             * An instance of [Index] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangsmithApiInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangsmithApiInvalidDataException("Unknown Index: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Index>(Index::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Index {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                Index(missing = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                Index(integer = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Index(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Index>(Index::class) {

            override fun serialize(
                value: Index,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.integer != null -> generator.writeObject(value.integer)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Index")
                }
            }
        }
    }

    @JsonDeserialize(using = Title.Deserializer::class)
    @JsonSerialize(using = Title.Serializer::class)
    class Title
    private constructor(
        private val string: String? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isString(): Boolean = string != null

        fun isMissing(): Boolean = missing != null

        fun asString(): String = string.getOrThrow("string")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Title = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Title && string == other.string && missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(string, missing)

        override fun toString(): String =
            when {
                string != null -> "Title{string=$string}"
                missing != null -> "Title{missing=$missing}"
                _json != null -> "Title{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Title")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Title(string = string)

            @JvmStatic fun ofMissing(missing: Missing) = Title(missing = missing)
        }

        /** An interface that defines how to map each variant of [Title] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [Title] to a value of type [T].
             *
             * An instance of [Title] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangsmithApiInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangsmithApiInvalidDataException("Unknown Title: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Title>(Title::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Title {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                Title(missing = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Title(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from array).
                    0 -> Title(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Title>(Title::class) {

            override fun serialize(
                value: Title,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Title")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChartsSectionUpdate &&
            description == other.description &&
            index == other.index &&
            title == other.title &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(description, index, title, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomChartsSectionUpdate{description=$description, index=$index, title=$title, additionalProperties=$additionalProperties}"
}
