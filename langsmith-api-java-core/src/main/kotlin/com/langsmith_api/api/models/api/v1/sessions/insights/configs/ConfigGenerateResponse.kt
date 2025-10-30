// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sessions.insights.configs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Auto-generated clustering job config. */
class ConfigGenerateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val summaryPrompt: JsonField<String>,
    private val attributeSchemas: JsonField<AttributeSchemas>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("summary_prompt")
        @ExcludeMissing
        summaryPrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attribute_schemas")
        @ExcludeMissing
        attributeSchemas: JsonField<AttributeSchemas> = JsonMissing.of(),
    ) : this(name, summaryPrompt, attributeSchemas, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun summaryPrompt(): String = summaryPrompt.getRequired("summary_prompt")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun attributeSchemas(): Optional<AttributeSchemas> =
        attributeSchemas.getOptional("attribute_schemas")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [summaryPrompt].
     *
     * Unlike [summaryPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary_prompt")
    @ExcludeMissing
    fun _summaryPrompt(): JsonField<String> = summaryPrompt

    /**
     * Returns the raw JSON value of [attributeSchemas].
     *
     * Unlike [attributeSchemas], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("attribute_schemas")
    @ExcludeMissing
    fun _attributeSchemas(): JsonField<AttributeSchemas> = attributeSchemas

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
         * Returns a mutable builder for constructing an instance of [ConfigGenerateResponse].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .summaryPrompt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConfigGenerateResponse]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var summaryPrompt: JsonField<String>? = null
        private var attributeSchemas: JsonField<AttributeSchemas> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(configGenerateResponse: ConfigGenerateResponse) = apply {
            name = configGenerateResponse.name
            summaryPrompt = configGenerateResponse.summaryPrompt
            attributeSchemas = configGenerateResponse.attributeSchemas
            additionalProperties = configGenerateResponse.additionalProperties.toMutableMap()
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun summaryPrompt(summaryPrompt: String) = summaryPrompt(JsonField.of(summaryPrompt))

        /**
         * Sets [Builder.summaryPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summaryPrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun summaryPrompt(summaryPrompt: JsonField<String>) = apply {
            this.summaryPrompt = summaryPrompt
        }

        fun attributeSchemas(attributeSchemas: AttributeSchemas?) =
            attributeSchemas(JsonField.ofNullable(attributeSchemas))

        /** Alias for calling [Builder.attributeSchemas] with `attributeSchemas.orElse(null)`. */
        fun attributeSchemas(attributeSchemas: Optional<AttributeSchemas>) =
            attributeSchemas(attributeSchemas.getOrNull())

        /**
         * Sets [Builder.attributeSchemas] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributeSchemas] with a well-typed [AttributeSchemas]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun attributeSchemas(attributeSchemas: JsonField<AttributeSchemas>) = apply {
            this.attributeSchemas = attributeSchemas
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
         * Returns an immutable instance of [ConfigGenerateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .summaryPrompt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConfigGenerateResponse =
            ConfigGenerateResponse(
                checkRequired("name", name),
                checkRequired("summaryPrompt", summaryPrompt),
                attributeSchemas,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConfigGenerateResponse = apply {
        if (validated) {
            return@apply
        }

        name()
        summaryPrompt()
        attributeSchemas().ifPresent { it.validate() }
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (summaryPrompt.asKnown().isPresent) 1 else 0) +
            (attributeSchemas.asKnown().getOrNull()?.validity() ?: 0)

    class AttributeSchemas
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

            /** Returns a mutable builder for constructing an instance of [AttributeSchemas]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AttributeSchemas]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(attributeSchemas: AttributeSchemas) = apply {
                additionalProperties = attributeSchemas.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [AttributeSchemas].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AttributeSchemas = AttributeSchemas(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): AttributeSchemas = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AttributeSchemas && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "AttributeSchemas{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConfigGenerateResponse &&
            name == other.name &&
            summaryPrompt == other.summaryPrompt &&
            attributeSchemas == other.attributeSchemas &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(name, summaryPrompt, attributeSchemas, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConfigGenerateResponse{name=$name, summaryPrompt=$summaryPrompt, attributeSchemas=$attributeSchemas, additionalProperties=$additionalProperties}"
}
