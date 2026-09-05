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
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UpdateOnlineCodeEvaluatorRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val code: JsonField<String>,
    private val dependencies: JsonField<String>,
    private val language: JsonField<String>,
    private val workspaceSecretsKeys: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dependencies")
        @ExcludeMissing
        dependencies: JsonField<String> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("workspace_secrets_keys")
        @ExcludeMissing
        workspaceSecretsKeys: JsonField<List<String>> = JsonMissing.of(),
    ) : this(code, dependencies, language, workspaceSecretsKeys, mutableMapOf())

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
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = language.getOptional("language")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workspaceSecretsKeys(): Optional<List<String>> =
        workspaceSecretsKeys.getOptional("workspace_secrets_keys")

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
     * Returns the raw JSON value of [workspaceSecretsKeys].
     *
     * Unlike [workspaceSecretsKeys], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("workspace_secrets_keys")
    @ExcludeMissing
    fun _workspaceSecretsKeys(): JsonField<List<String>> = workspaceSecretsKeys

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

        private var code: JsonField<String> = JsonMissing.of()
        private var dependencies: JsonField<String> = JsonMissing.of()
        private var language: JsonField<String> = JsonMissing.of()
        private var workspaceSecretsKeys: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(updateOnlineCodeEvaluatorRequest: UpdateOnlineCodeEvaluatorRequest) =
            apply {
                code = updateOnlineCodeEvaluatorRequest.code
                dependencies = updateOnlineCodeEvaluatorRequest.dependencies
                language = updateOnlineCodeEvaluatorRequest.language
                workspaceSecretsKeys =
                    updateOnlineCodeEvaluatorRequest.workspaceSecretsKeys.map { it.toMutableList() }
                additionalProperties =
                    updateOnlineCodeEvaluatorRequest.additionalProperties.toMutableMap()
            }

        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        fun dependencies(dependencies: String) = dependencies(JsonField.of(dependencies))

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

        fun workspaceSecretsKeys(workspaceSecretsKeys: List<String>) =
            workspaceSecretsKeys(JsonField.of(workspaceSecretsKeys))

        /**
         * Sets [Builder.workspaceSecretsKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceSecretsKeys] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun workspaceSecretsKeys(workspaceSecretsKeys: JsonField<List<String>>) = apply {
            this.workspaceSecretsKeys = workspaceSecretsKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [workspaceSecretsKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWorkspaceSecretsKey(workspaceSecretsKey: String) = apply {
            workspaceSecretsKeys =
                (workspaceSecretsKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("workspaceSecretsKeys", it).add(workspaceSecretsKey)
                }
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
                code,
                dependencies,
                language,
                (workspaceSecretsKeys ?: JsonMissing.of()).map { it.toImmutable() },
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

        code()
        dependencies()
        language()
        workspaceSecretsKeys()
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
        (if (code.asKnown().isPresent) 1 else 0) +
            (if (dependencies.asKnown().isPresent) 1 else 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (workspaceSecretsKeys.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateOnlineCodeEvaluatorRequest &&
            code == other.code &&
            dependencies == other.dependencies &&
            language == other.language &&
            workspaceSecretsKeys == other.workspaceSecretsKeys &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(code, dependencies, language, workspaceSecretsKeys, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpdateOnlineCodeEvaluatorRequest{code=$code, dependencies=$dependencies, language=$language, workspaceSecretsKeys=$workspaceSecretsKeys, additionalProperties=$additionalProperties}"
}
