// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class CreateOnlineCodeEvaluatorRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val advancedFeaturesEnabled: JsonField<Boolean>,
    private val code: JsonField<String>,
    private val dependencies: JsonField<String>,
    private val language: JsonField<String>,
    private val managedCodeEvaluatorKey: JsonField<String>,
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
        @JsonProperty("dependencies")
        @ExcludeMissing
        dependencies: JsonField<String> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("managed_code_evaluator_key")
        @ExcludeMissing
        managedCodeEvaluatorKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("managed_code_evaluator_settings")
        @ExcludeMissing
        managedCodeEvaluatorSettings: JsonField<ManagedCodeEvaluatorSettings> = JsonMissing.of(),
        @JsonProperty("require_attachments")
        @ExcludeMissing
        requireAttachments: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        advancedFeaturesEnabled,
        code,
        dependencies,
        language,
        managedCodeEvaluatorKey,
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
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dependencies(): Optional<String> = dependencies.getOptional("dependencies")

    /**
     * Default: "python"
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = language.getOptional("language")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managedCodeEvaluatorKey(): Optional<String> =
        managedCodeEvaluatorKey.getOptional("managed_code_evaluator_key")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managedCodeEvaluatorSettings(): Optional<ManagedCodeEvaluatorSettings> =
        managedCodeEvaluatorSettings.getOptional("managed_code_evaluator_settings")

    /**
     * RequireAttachments opts the evaluator into selecting/presigning run attachments (s3_urls) at
     * evaluation time. Default false.
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
     * Returns the raw JSON value of [managedCodeEvaluatorKey].
     *
     * Unlike [managedCodeEvaluatorKey], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("managed_code_evaluator_key")
    @ExcludeMissing
    fun _managedCodeEvaluatorKey(): JsonField<String> = managedCodeEvaluatorKey

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
         * [CreateOnlineCodeEvaluatorRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreateOnlineCodeEvaluatorRequest]. */
    class Builder internal constructor() {

        private var advancedFeaturesEnabled: JsonField<Boolean> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var dependencies: JsonField<String> = JsonMissing.of()
        private var language: JsonField<String> = JsonMissing.of()
        private var managedCodeEvaluatorKey: JsonField<String> = JsonMissing.of()
        private var managedCodeEvaluatorSettings: JsonField<ManagedCodeEvaluatorSettings> =
            JsonMissing.of()
        private var requireAttachments: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createOnlineCodeEvaluatorRequest: CreateOnlineCodeEvaluatorRequest) =
            apply {
                advancedFeaturesEnabled = createOnlineCodeEvaluatorRequest.advancedFeaturesEnabled
                code = createOnlineCodeEvaluatorRequest.code
                dependencies = createOnlineCodeEvaluatorRequest.dependencies
                language = createOnlineCodeEvaluatorRequest.language
                managedCodeEvaluatorKey = createOnlineCodeEvaluatorRequest.managedCodeEvaluatorKey
                managedCodeEvaluatorSettings =
                    createOnlineCodeEvaluatorRequest.managedCodeEvaluatorSettings
                requireAttachments = createOnlineCodeEvaluatorRequest.requireAttachments
                additionalProperties =
                    createOnlineCodeEvaluatorRequest.additionalProperties.toMutableMap()
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

        /** Default: "python" */
        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        fun managedCodeEvaluatorKey(managedCodeEvaluatorKey: String) =
            managedCodeEvaluatorKey(JsonField.of(managedCodeEvaluatorKey))

        /**
         * Sets [Builder.managedCodeEvaluatorKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.managedCodeEvaluatorKey] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun managedCodeEvaluatorKey(managedCodeEvaluatorKey: JsonField<String>) = apply {
            this.managedCodeEvaluatorKey = managedCodeEvaluatorKey
        }

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
         * RequireAttachments opts the evaluator into selecting/presigning run attachments (s3_urls)
         * at evaluation time. Default false.
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
         * Returns an immutable instance of [CreateOnlineCodeEvaluatorRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CreateOnlineCodeEvaluatorRequest =
            CreateOnlineCodeEvaluatorRequest(
                advancedFeaturesEnabled,
                code,
                dependencies,
                language,
                managedCodeEvaluatorKey,
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
    fun validate(): CreateOnlineCodeEvaluatorRequest = apply {
        if (validated) {
            return@apply
        }

        advancedFeaturesEnabled()
        code()
        dependencies()
        language()
        managedCodeEvaluatorKey()
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
            (if (dependencies.asKnown().isPresent) 1 else 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (if (managedCodeEvaluatorKey.asKnown().isPresent) 1 else 0) +
            (managedCodeEvaluatorSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (requireAttachments.asKnown().isPresent) 1 else 0)

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

        return other is CreateOnlineCodeEvaluatorRequest &&
            advancedFeaturesEnabled == other.advancedFeaturesEnabled &&
            code == other.code &&
            dependencies == other.dependencies &&
            language == other.language &&
            managedCodeEvaluatorKey == other.managedCodeEvaluatorKey &&
            managedCodeEvaluatorSettings == other.managedCodeEvaluatorSettings &&
            requireAttachments == other.requireAttachments &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            advancedFeaturesEnabled,
            code,
            dependencies,
            language,
            managedCodeEvaluatorKey,
            managedCodeEvaluatorSettings,
            requireAttachments,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateOnlineCodeEvaluatorRequest{advancedFeaturesEnabled=$advancedFeaturesEnabled, code=$code, dependencies=$dependencies, language=$language, managedCodeEvaluatorKey=$managedCodeEvaluatorKey, managedCodeEvaluatorSettings=$managedCodeEvaluatorSettings, requireAttachments=$requireAttachments, additionalProperties=$additionalProperties}"
}
