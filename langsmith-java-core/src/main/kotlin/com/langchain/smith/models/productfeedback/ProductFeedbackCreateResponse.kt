// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.productfeedback

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ProductFeedbackCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val category: JsonField<Category>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val message: JsonField<String>,
    private val source: JsonField<Source>,
    private val client: JsonField<Client>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
        @JsonProperty("client") @ExcludeMissing client: JsonField<Client> = JsonMissing.of(),
    ) : this(id, category, createdAt, message, source, client, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): Category = category.getRequired("category")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): String = message.getRequired("message")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): Source = source.getRequired("source")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun client(): Optional<Client> = client.getOptional("client")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

    /**
     * Returns the raw JSON value of [client].
     *
     * Unlike [client], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client") @ExcludeMissing fun _client(): JsonField<Client> = client

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
         * Returns a mutable builder for constructing an instance of
         * [ProductFeedbackCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .category()
         * .createdAt()
         * .message()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProductFeedbackCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var category: JsonField<Category>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var message: JsonField<String>? = null
        private var source: JsonField<Source>? = null
        private var client: JsonField<Client> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(productFeedbackCreateResponse: ProductFeedbackCreateResponse) = apply {
            id = productFeedbackCreateResponse.id
            category = productFeedbackCreateResponse.category
            createdAt = productFeedbackCreateResponse.createdAt
            message = productFeedbackCreateResponse.message
            source = productFeedbackCreateResponse.source
            client = productFeedbackCreateResponse.client
            additionalProperties = productFeedbackCreateResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { this.category = category }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        fun source(source: Source) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        fun client(client: Client) = client(JsonField.of(client))

        /**
         * Sets [Builder.client] to an arbitrary JSON value.
         *
         * You should usually call [Builder.client] with a well-typed [Client] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun client(client: JsonField<Client>) = apply { this.client = client }

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
         * Returns an immutable instance of [ProductFeedbackCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .category()
         * .createdAt()
         * .message()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProductFeedbackCreateResponse =
            ProductFeedbackCreateResponse(
                checkRequired("id", id),
                checkRequired("category", category),
                checkRequired("createdAt", createdAt),
                checkRequired("message", message),
                checkRequired("source", source),
                client,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LangChainInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ProductFeedbackCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        category().validate()
        createdAt()
        message()
        source().validate()
        client().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (category.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (source.asKnown().getOrNull()?.validity() ?: 0) +
            (client.asKnown().getOrNull()?.validity() ?: 0)

    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BUG = of("BUG")

            @JvmField val FEATURE_REQUEST = of("FEATURE_REQUEST")

            @JvmField val USABILITY = of("USABILITY")

            @JvmField val DOCUMENTATION = of("DOCUMENTATION")

            @JvmField val OTHER = of("OTHER")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            BUG,
            FEATURE_REQUEST,
            USABILITY,
            DOCUMENTATION,
            OTHER,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUG,
            FEATURE_REQUEST,
            USABILITY,
            DOCUMENTATION,
            OTHER,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BUG -> Value.BUG
                FEATURE_REQUEST -> Value.FEATURE_REQUEST
                USABILITY -> Value.USABILITY
                DOCUMENTATION -> Value.DOCUMENTATION
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BUG -> Known.BUG
                FEATURE_REQUEST -> Known.FEATURE_REQUEST
                USABILITY -> Known.USABILITY
                DOCUMENTATION -> Known.DOCUMENTATION
                OTHER -> Known.OTHER
                else -> throw LangChainInvalidDataException("Unknown Category: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangChainInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Category = apply {
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
            } catch (e: LangChainInvalidDataException) {
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

            return other is Category && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LANGSMITH_CLI = of("LANGSMITH_CLI")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        /** An enum containing [Source]'s known values. */
        enum class Known {
            LANGSMITH_CLI
        }

        /**
         * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Source] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LANGSMITH_CLI,
            /** An enum member indicating that [Source] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LANGSMITH_CLI -> Value.LANGSMITH_CLI
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LANGSMITH_CLI -> Known.LANGSMITH_CLI
                else -> throw LangChainInvalidDataException("Unknown Source: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangChainInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Source = apply {
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
            } catch (e: LangChainInvalidDataException) {
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

            return other is Source && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Client
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val architecture: JsonField<String>,
        private val os: JsonField<String>,
        private val version: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("architecture")
            @ExcludeMissing
            architecture: JsonField<String> = JsonMissing.of(),
            @JsonProperty("os") @ExcludeMissing os: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
        ) : this(architecture, os, version, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun architecture(): Optional<String> = architecture.getOptional("architecture")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun os(): Optional<String> = os.getOptional("os")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun version(): Optional<String> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [architecture].
         *
         * Unlike [architecture], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("architecture")
        @ExcludeMissing
        fun _architecture(): JsonField<String> = architecture

        /**
         * Returns the raw JSON value of [os].
         *
         * Unlike [os], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("os") @ExcludeMissing fun _os(): JsonField<String> = os

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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

            /** Returns a mutable builder for constructing an instance of [Client]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Client]. */
        class Builder internal constructor() {

            private var architecture: JsonField<String> = JsonMissing.of()
            private var os: JsonField<String> = JsonMissing.of()
            private var version: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(client: Client) = apply {
                architecture = client.architecture
                os = client.os
                version = client.version
                additionalProperties = client.additionalProperties.toMutableMap()
            }

            fun architecture(architecture: String) = architecture(JsonField.of(architecture))

            /**
             * Sets [Builder.architecture] to an arbitrary JSON value.
             *
             * You should usually call [Builder.architecture] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun architecture(architecture: JsonField<String>) = apply {
                this.architecture = architecture
            }

            fun os(os: String) = os(JsonField.of(os))

            /**
             * Sets [Builder.os] to an arbitrary JSON value.
             *
             * You should usually call [Builder.os] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun os(os: JsonField<String>) = apply { this.os = os }

            fun version(version: String) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<String>) = apply { this.version = version }

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
             * Returns an immutable instance of [Client].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Client =
                Client(architecture, os, version, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Client = apply {
            if (validated) {
                return@apply
            }

            architecture()
            os()
            version()
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
            (if (architecture.asKnown().isPresent) 1 else 0) +
                (if (os.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Client &&
                architecture == other.architecture &&
                os == other.os &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(architecture, os, version, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Client{architecture=$architecture, os=$os, version=$version, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductFeedbackCreateResponse &&
            id == other.id &&
            category == other.category &&
            createdAt == other.createdAt &&
            message == other.message &&
            source == other.source &&
            client == other.client &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, category, createdAt, message, source, client, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductFeedbackCreateResponse{id=$id, category=$category, createdAt=$createdAt, message=$message, source=$source, client=$client, additionalProperties=$additionalProperties}"
}
