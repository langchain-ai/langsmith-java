// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.rules

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EvaluatorTopLevel
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val structured: JsonField<Structured>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("structured")
        @ExcludeMissing
        structured: JsonField<Structured> = JsonMissing.of()
    ) : this(structured, mutableMapOf())

    /**
     * Evaluator structured output schema.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun structured(): Structured = structured.getRequired("structured")

    /**
     * Returns the raw JSON value of [structured].
     *
     * Unlike [structured], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("structured")
    @ExcludeMissing
    fun _structured(): JsonField<Structured> = structured

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
         * Returns a mutable builder for constructing an instance of [EvaluatorTopLevel].
         *
         * The following fields are required:
         * ```java
         * .structured()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EvaluatorTopLevel]. */
    class Builder internal constructor() {

        private var structured: JsonField<Structured>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(evaluatorTopLevel: EvaluatorTopLevel) = apply {
            structured = evaluatorTopLevel.structured
            additionalProperties = evaluatorTopLevel.additionalProperties.toMutableMap()
        }

        /** Evaluator structured output schema. */
        fun structured(structured: Structured) = structured(JsonField.of(structured))

        /**
         * Sets [Builder.structured] to an arbitrary JSON value.
         *
         * You should usually call [Builder.structured] with a well-typed [Structured] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun structured(structured: JsonField<Structured>) = apply { this.structured = structured }

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
         * Returns an immutable instance of [EvaluatorTopLevel].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .structured()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EvaluatorTopLevel =
            EvaluatorTopLevel(
                checkRequired("structured", structured),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EvaluatorTopLevel = apply {
        if (validated) {
            return@apply
        }

        structured().validate()
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
    @JvmSynthetic internal fun validity(): Int = (structured.asKnown().getOrNull()?.validity() ?: 0)

    /** Evaluator structured output schema. */
    class Structured
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val hubRef: JsonField<String>,
        private val model: JsonValue,
        private val prompt: JsonField<List<List<JsonValue>>>,
        private val schema: JsonValue,
        private val templateFormat: JsonField<String>,
        private val variableMapping: JsonField<VariableMapping>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("hub_ref") @ExcludeMissing hubRef: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonValue = JsonMissing.of(),
            @JsonProperty("prompt")
            @ExcludeMissing
            prompt: JsonField<List<List<JsonValue>>> = JsonMissing.of(),
            @JsonProperty("schema") @ExcludeMissing schema: JsonValue = JsonMissing.of(),
            @JsonProperty("template_format")
            @ExcludeMissing
            templateFormat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("variable_mapping")
            @ExcludeMissing
            variableMapping: JsonField<VariableMapping> = JsonMissing.of(),
        ) : this(hubRef, model, prompt, schema, templateFormat, variableMapping, mutableMapOf())

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun hubRef(): Optional<String> = hubRef.getOptional("hub_ref")

        @JsonProperty("model") @ExcludeMissing fun _model(): JsonValue = model

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun prompt(): Optional<List<List<JsonValue>>> = prompt.getOptional("prompt")

        @JsonProperty("schema") @ExcludeMissing fun _schema(): JsonValue = schema

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun templateFormat(): Optional<String> = templateFormat.getOptional("template_format")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun variableMapping(): Optional<VariableMapping> =
            variableMapping.getOptional("variable_mapping")

        /**
         * Returns the raw JSON value of [hubRef].
         *
         * Unlike [hubRef], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hub_ref") @ExcludeMissing fun _hubRef(): JsonField<String> = hubRef

        /**
         * Returns the raw JSON value of [prompt].
         *
         * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt")
        @ExcludeMissing
        fun _prompt(): JsonField<List<List<JsonValue>>> = prompt

        /**
         * Returns the raw JSON value of [templateFormat].
         *
         * Unlike [templateFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("template_format")
        @ExcludeMissing
        fun _templateFormat(): JsonField<String> = templateFormat

        /**
         * Returns the raw JSON value of [variableMapping].
         *
         * Unlike [variableMapping], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("variable_mapping")
        @ExcludeMissing
        fun _variableMapping(): JsonField<VariableMapping> = variableMapping

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

            /** Returns a mutable builder for constructing an instance of [Structured]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Structured]. */
        class Builder internal constructor() {

            private var hubRef: JsonField<String> = JsonMissing.of()
            private var model: JsonValue = JsonMissing.of()
            private var prompt: JsonField<MutableList<List<JsonValue>>>? = null
            private var schema: JsonValue = JsonMissing.of()
            private var templateFormat: JsonField<String> = JsonMissing.of()
            private var variableMapping: JsonField<VariableMapping> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(structured: Structured) = apply {
                hubRef = structured.hubRef
                model = structured.model
                prompt = structured.prompt.map { it.toMutableList() }
                schema = structured.schema
                templateFormat = structured.templateFormat
                variableMapping = structured.variableMapping
                additionalProperties = structured.additionalProperties.toMutableMap()
            }

            fun hubRef(hubRef: String?) = hubRef(JsonField.ofNullable(hubRef))

            /** Alias for calling [Builder.hubRef] with `hubRef.orElse(null)`. */
            fun hubRef(hubRef: Optional<String>) = hubRef(hubRef.getOrNull())

            /**
             * Sets [Builder.hubRef] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hubRef] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hubRef(hubRef: JsonField<String>) = apply { this.hubRef = hubRef }

            fun model(model: JsonValue) = apply { this.model = model }

            fun prompt(prompt: List<List<JsonValue>>?) = prompt(JsonField.ofNullable(prompt))

            /** Alias for calling [Builder.prompt] with `prompt.orElse(null)`. */
            fun prompt(prompt: Optional<List<List<JsonValue>>>) = prompt(prompt.getOrNull())

            /**
             * Sets [Builder.prompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prompt] with a well-typed `List<List<JsonValue>>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun prompt(prompt: JsonField<List<List<JsonValue>>>) = apply {
                this.prompt = prompt.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<JsonValue>] to [Builder.prompt].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPrompt(prompt: List<JsonValue>) = apply {
                this.prompt =
                    (this.prompt ?: JsonField.of(mutableListOf())).also {
                        checkKnown("prompt", it).add(prompt)
                    }
            }

            fun schema(schema: JsonValue) = apply { this.schema = schema }

            fun templateFormat(templateFormat: String?) =
                templateFormat(JsonField.ofNullable(templateFormat))

            /** Alias for calling [Builder.templateFormat] with `templateFormat.orElse(null)`. */
            fun templateFormat(templateFormat: Optional<String>) =
                templateFormat(templateFormat.getOrNull())

            /**
             * Sets [Builder.templateFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateFormat] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun templateFormat(templateFormat: JsonField<String>) = apply {
                this.templateFormat = templateFormat
            }

            fun variableMapping(variableMapping: VariableMapping?) =
                variableMapping(JsonField.ofNullable(variableMapping))

            /** Alias for calling [Builder.variableMapping] with `variableMapping.orElse(null)`. */
            fun variableMapping(variableMapping: Optional<VariableMapping>) =
                variableMapping(variableMapping.getOrNull())

            /**
             * Sets [Builder.variableMapping] to an arbitrary JSON value.
             *
             * You should usually call [Builder.variableMapping] with a well-typed [VariableMapping]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun variableMapping(variableMapping: JsonField<VariableMapping>) = apply {
                this.variableMapping = variableMapping
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
             * Returns an immutable instance of [Structured].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Structured =
                Structured(
                    hubRef,
                    model,
                    (prompt ?: JsonMissing.of()).map { it.toImmutable() },
                    schema,
                    templateFormat,
                    variableMapping,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Structured = apply {
            if (validated) {
                return@apply
            }

            hubRef()
            prompt()
            templateFormat()
            variableMapping().ifPresent { it.validate() }
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
            (if (hubRef.asKnown().isPresent) 1 else 0) +
                (prompt.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                (if (templateFormat.asKnown().isPresent) 1 else 0) +
                (variableMapping.asKnown().getOrNull()?.validity() ?: 0)

        class VariableMapping
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

                /** Returns a mutable builder for constructing an instance of [VariableMapping]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [VariableMapping]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(variableMapping: VariableMapping) = apply {
                    additionalProperties = variableMapping.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [VariableMapping].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): VariableMapping = VariableMapping(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): VariableMapping = apply {
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

                return other is VariableMapping &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "VariableMapping{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Structured &&
                hubRef == other.hubRef &&
                model == other.model &&
                prompt == other.prompt &&
                schema == other.schema &&
                templateFormat == other.templateFormat &&
                variableMapping == other.variableMapping &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                hubRef,
                model,
                prompt,
                schema,
                templateFormat,
                variableMapping,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Structured{hubRef=$hubRef, model=$model, prompt=$prompt, schema=$schema, templateFormat=$templateFormat, variableMapping=$variableMapping, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EvaluatorTopLevel &&
            structured == other.structured &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(structured, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EvaluatorTopLevel{structured=$structured, additionalProperties=$additionalProperties}"
}
