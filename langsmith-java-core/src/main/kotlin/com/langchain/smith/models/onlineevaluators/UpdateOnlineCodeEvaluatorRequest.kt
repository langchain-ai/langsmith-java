// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UpdateOnlineCodeEvaluatorRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val advancedFeaturesEnabled: JsonField<Boolean>,
    private val code: JsonField<String>,
    private val codeEvaluatorInput: JsonField<CodeEvaluatorInput>,
    private val dependencies: JsonField<String>,
    private val language: JsonField<String>,
    private val managedCodeEvaluatorSettings: JsonField<ManagedCodeEvaluatorSettings>,
    private val requireAttachments: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("advanced_features_enabled")
        @ExcludeMissing
        advancedFeaturesEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code_evaluator_input")
        @ExcludeMissing
        codeEvaluatorInput: JsonField<CodeEvaluatorInput> = JsonMissing.of(),
        @JsonProperty("dependencies")
        @ExcludeMissing
        dependencies: JsonField<String> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("managed_code_evaluator_settings")
        @ExcludeMissing
        managedCodeEvaluatorSettings: JsonField<ManagedCodeEvaluatorSettings> = JsonMissing.of(),
        @JsonProperty("require_attachments")
        @ExcludeMissing
        requireAttachments: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        advancedFeaturesEnabled,
        code,
        codeEvaluatorInput,
        dependencies,
        language,
        managedCodeEvaluatorSettings,
        requireAttachments,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun advancedFeaturesEnabled(): Optional<Boolean> =
        advancedFeaturesEnabled.getOptional("advanced_features_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = code.getOptional("code")

    /**
     * CodeEvaluatorInput is config (not a snapshot rebuild). Null clears it.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun codeEvaluatorInput(): Optional<CodeEvaluatorInput> =
        codeEvaluatorInput.getOptional("code_evaluator_input")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dependencies(): Optional<String> = dependencies.getOptional("dependencies")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = language.getOptional("language")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managedCodeEvaluatorSettings(): Optional<ManagedCodeEvaluatorSettings> =
        managedCodeEvaluatorSettings.getOptional("managed_code_evaluator_settings")

    /**
     * RequireAttachments is fetch-time config: updating it does not rebuild the sandbox snapshot.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requireAttachments(): Optional<Boolean> =
        requireAttachments.getOptional("require_attachments")

    /**
     * Returns the raw JSON value of [advancedFeaturesEnabled].
     *
     * Unlike [advancedFeaturesEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("advanced_features_enabled")
    @ExcludeMissing
    fun _advancedFeaturesEnabled(): JsonField<Boolean> = advancedFeaturesEnabled

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [codeEvaluatorInput].
     *
     * Unlike [codeEvaluatorInput], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("code_evaluator_input")
    @ExcludeMissing
    fun _codeEvaluatorInput(): JsonField<CodeEvaluatorInput> = codeEvaluatorInput

    /**
     * Returns the raw JSON value of [dependencies].
     *
     * Unlike [dependencies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dependencies")
    @ExcludeMissing
    fun _dependencies(): JsonField<String> = dependencies

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

    /**
     * Returns the raw JSON value of [managedCodeEvaluatorSettings].
     *
     * Unlike [managedCodeEvaluatorSettings], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("managed_code_evaluator_settings")
    @ExcludeMissing
    fun _managedCodeEvaluatorSettings(): JsonField<ManagedCodeEvaluatorSettings> =
        managedCodeEvaluatorSettings

    /**
     * Returns the raw JSON value of [requireAttachments].
     *
     * Unlike [requireAttachments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("require_attachments")
    @ExcludeMissing
    fun _requireAttachments(): JsonField<Boolean> = requireAttachments

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
         * [UpdateOnlineCodeEvaluatorRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpdateOnlineCodeEvaluatorRequest]. */
    class Builder internal constructor() {

        private var advancedFeaturesEnabled: JsonField<Boolean> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var codeEvaluatorInput: JsonField<CodeEvaluatorInput> = JsonMissing.of()
        private var dependencies: JsonField<String> = JsonMissing.of()
        private var language: JsonField<String> = JsonMissing.of()
        private var managedCodeEvaluatorSettings: JsonField<ManagedCodeEvaluatorSettings> =
            JsonMissing.of()
        private var requireAttachments: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateOnlineCodeEvaluatorRequest: UpdateOnlineCodeEvaluatorRequest) =
            apply {
                advancedFeaturesEnabled = updateOnlineCodeEvaluatorRequest.advancedFeaturesEnabled
                code = updateOnlineCodeEvaluatorRequest.code
                codeEvaluatorInput = updateOnlineCodeEvaluatorRequest.codeEvaluatorInput
                dependencies = updateOnlineCodeEvaluatorRequest.dependencies
                language = updateOnlineCodeEvaluatorRequest.language
                managedCodeEvaluatorSettings =
                    updateOnlineCodeEvaluatorRequest.managedCodeEvaluatorSettings
                requireAttachments = updateOnlineCodeEvaluatorRequest.requireAttachments
                additionalProperties =
                    updateOnlineCodeEvaluatorRequest.additionalProperties.toMutableMap()
            }

        fun advancedFeaturesEnabled(advancedFeaturesEnabled: Boolean) =
            advancedFeaturesEnabled(JsonField.of(advancedFeaturesEnabled))

        /**
         * Sets [Builder.advancedFeaturesEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.advancedFeaturesEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun advancedFeaturesEnabled(advancedFeaturesEnabled: JsonField<Boolean>) = apply {
            this.advancedFeaturesEnabled = advancedFeaturesEnabled
        }

        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** CodeEvaluatorInput is config (not a snapshot rebuild). Null clears it. */
        fun codeEvaluatorInput(codeEvaluatorInput: CodeEvaluatorInput?) =
            codeEvaluatorInput(JsonField.ofNullable(codeEvaluatorInput))

        /**
         * Alias for calling [Builder.codeEvaluatorInput] with `codeEvaluatorInput.orElse(null)`.
         */
        fun codeEvaluatorInput(codeEvaluatorInput: Optional<CodeEvaluatorInput>) =
            codeEvaluatorInput(codeEvaluatorInput.getOrNull())

        /**
         * Sets [Builder.codeEvaluatorInput] to an arbitrary JSON value.
         *
         * You should usually call [Builder.codeEvaluatorInput] with a well-typed
         * [CodeEvaluatorInput] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun codeEvaluatorInput(codeEvaluatorInput: JsonField<CodeEvaluatorInput>) = apply {
            this.codeEvaluatorInput = codeEvaluatorInput
        }

        fun dependencies(dependencies: String?) = dependencies(JsonField.ofNullable(dependencies))

        /** Alias for calling [Builder.dependencies] with `dependencies.orElse(null)`. */
        fun dependencies(dependencies: Optional<String>) = dependencies(dependencies.getOrNull())

        /**
         * Sets [Builder.dependencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dependencies] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dependencies(dependencies: JsonField<String>) = apply {
            this.dependencies = dependencies
        }

        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        fun managedCodeEvaluatorSettings(
            managedCodeEvaluatorSettings: ManagedCodeEvaluatorSettings
        ) = managedCodeEvaluatorSettings(JsonField.of(managedCodeEvaluatorSettings))

        /**
         * Sets [Builder.managedCodeEvaluatorSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.managedCodeEvaluatorSettings] with a well-typed
         * [ManagedCodeEvaluatorSettings] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun managedCodeEvaluatorSettings(
            managedCodeEvaluatorSettings: JsonField<ManagedCodeEvaluatorSettings>
        ) = apply { this.managedCodeEvaluatorSettings = managedCodeEvaluatorSettings }

        /**
         * RequireAttachments is fetch-time config: updating it does not rebuild the sandbox
         * snapshot.
         */
        fun requireAttachments(requireAttachments: Boolean) =
            requireAttachments(JsonField.of(requireAttachments))

        /**
         * Sets [Builder.requireAttachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requireAttachments] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requireAttachments(requireAttachments: JsonField<Boolean>) = apply {
            this.requireAttachments = requireAttachments
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
         * Returns an immutable instance of [UpdateOnlineCodeEvaluatorRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UpdateOnlineCodeEvaluatorRequest =
            UpdateOnlineCodeEvaluatorRequest(
                advancedFeaturesEnabled,
                code,
                codeEvaluatorInput,
                dependencies,
                language,
                managedCodeEvaluatorSettings,
                requireAttachments,
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
    fun validate(): UpdateOnlineCodeEvaluatorRequest = apply {
        if (validated) {
            return@apply
        }

        advancedFeaturesEnabled()
        code()
        codeEvaluatorInput().ifPresent { it.validate() }
        dependencies()
        language()
        managedCodeEvaluatorSettings().ifPresent { it.validate() }
        requireAttachments()
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
        (if (advancedFeaturesEnabled.asKnown().isPresent) 1 else 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (codeEvaluatorInput.asKnown().getOrNull()?.validity() ?: 0) +
            (if (dependencies.asKnown().isPresent) 1 else 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (managedCodeEvaluatorSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (requireAttachments.asKnown().isPresent) 1 else 0)

    /** CodeEvaluatorInput is config (not a snapshot rebuild). Null clears it. */
    class CodeEvaluatorInput
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val THREAD = of("thread")

            @JvmField val ALL_MESSAGES = of("all_messages")

            @JvmField val HUMAN_AI_PAIRS = of("human_ai_pairs")

            @JvmField val FIRST_HUMAN_LAST_AI = of("first_human_last_ai")

            @JvmStatic fun of(value: String) = CodeEvaluatorInput(JsonField.of(value))
        }

        /** An enum containing [CodeEvaluatorInput]'s known values. */
        enum class Known {
            THREAD,
            ALL_MESSAGES,
            HUMAN_AI_PAIRS,
            FIRST_HUMAN_LAST_AI,
        }

        /**
         * An enum containing [CodeEvaluatorInput]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CodeEvaluatorInput] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            THREAD,
            ALL_MESSAGES,
            HUMAN_AI_PAIRS,
            FIRST_HUMAN_LAST_AI,
            /**
             * An enum member indicating that [CodeEvaluatorInput] was instantiated with an unknown
             * value.
             */
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
                THREAD -> Value.THREAD
                ALL_MESSAGES -> Value.ALL_MESSAGES
                HUMAN_AI_PAIRS -> Value.HUMAN_AI_PAIRS
                FIRST_HUMAN_LAST_AI -> Value.FIRST_HUMAN_LAST_AI
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
                THREAD -> Known.THREAD
                ALL_MESSAGES -> Known.ALL_MESSAGES
                HUMAN_AI_PAIRS -> Known.HUMAN_AI_PAIRS
                FIRST_HUMAN_LAST_AI -> Known.FIRST_HUMAN_LAST_AI
                else -> throw LangChainInvalidDataException("Unknown CodeEvaluatorInput: $value")
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
        fun validate(): CodeEvaluatorInput = apply {
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

            return other is CodeEvaluatorInput && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ManagedCodeEvaluatorSettings
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

            /**
             * Returns a mutable builder for constructing an instance of
             * [ManagedCodeEvaluatorSettings].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ManagedCodeEvaluatorSettings]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(managedCodeEvaluatorSettings: ManagedCodeEvaluatorSettings) = apply {
                additionalProperties =
                    managedCodeEvaluatorSettings.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ManagedCodeEvaluatorSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ManagedCodeEvaluatorSettings =
                ManagedCodeEvaluatorSettings(additionalProperties.toImmutable())
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
        fun validate(): ManagedCodeEvaluatorSettings = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ManagedCodeEvaluatorSettings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ManagedCodeEvaluatorSettings{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateOnlineCodeEvaluatorRequest &&
            advancedFeaturesEnabled == other.advancedFeaturesEnabled &&
            code == other.code &&
            codeEvaluatorInput == other.codeEvaluatorInput &&
            dependencies == other.dependencies &&
            language == other.language &&
            managedCodeEvaluatorSettings == other.managedCodeEvaluatorSettings &&
            requireAttachments == other.requireAttachments &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            advancedFeaturesEnabled,
            code,
            codeEvaluatorInput,
            dependencies,
            language,
            managedCodeEvaluatorSettings,
            requireAttachments,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateOnlineCodeEvaluatorRequest{advancedFeaturesEnabled=$advancedFeaturesEnabled, code=$code, codeEvaluatorInput=$codeEvaluatorInput, dependencies=$dependencies, language=$language, managedCodeEvaluatorSettings=$managedCodeEvaluatorSettings, requireAttachments=$requireAttachments, additionalProperties=$additionalProperties}"
}
