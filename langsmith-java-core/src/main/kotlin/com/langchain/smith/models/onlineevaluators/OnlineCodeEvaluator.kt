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
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OnlineCodeEvaluator
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val code: JsonField<String>,
    private val dependencies: JsonField<String>,
    private val evaluatorBuildError: JsonField<String>,
    private val evaluatorBuildStatus: JsonField<EvaluatorBuildStatus>,
    private val evaluatorId: JsonField<String>,
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
        @JsonProperty("evaluator_build_error")
        @ExcludeMissing
        evaluatorBuildError: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluator_build_status")
        @ExcludeMissing
        evaluatorBuildStatus: JsonField<EvaluatorBuildStatus> = JsonMissing.of(),
        @JsonProperty("evaluator_id")
        @ExcludeMissing
        evaluatorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("workspace_secrets_keys")
        @ExcludeMissing
        workspaceSecretsKeys: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        code,
        dependencies,
        evaluatorBuildError,
        evaluatorBuildStatus,
        evaluatorId,
        language,
        workspaceSecretsKeys,
        mutableMapOf(),
    )

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
    fun evaluatorBuildError(): Optional<String> =
        evaluatorBuildError.getOptional("evaluator_build_error")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluatorBuildStatus(): Optional<EvaluatorBuildStatus> =
        evaluatorBuildStatus.getOptional("evaluator_build_status")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluatorId(): Optional<String> = evaluatorId.getOptional("evaluator_id")

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
     * Returns the raw JSON value of [evaluatorBuildError].
     *
     * Unlike [evaluatorBuildError], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("evaluator_build_error")
    @ExcludeMissing
    fun _evaluatorBuildError(): JsonField<String> = evaluatorBuildError

    /**
     * Returns the raw JSON value of [evaluatorBuildStatus].
     *
     * Unlike [evaluatorBuildStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("evaluator_build_status")
    @ExcludeMissing
    fun _evaluatorBuildStatus(): JsonField<EvaluatorBuildStatus> = evaluatorBuildStatus

    /**
     * Returns the raw JSON value of [evaluatorId].
     *
     * Unlike [evaluatorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evaluator_id")
    @ExcludeMissing
    fun _evaluatorId(): JsonField<String> = evaluatorId

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

        /** Returns a mutable builder for constructing an instance of [OnlineCodeEvaluator]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnlineCodeEvaluator]. */
    class Builder internal constructor() {

        private var code: JsonField<String> = JsonMissing.of()
        private var dependencies: JsonField<String> = JsonMissing.of()
        private var evaluatorBuildError: JsonField<String> = JsonMissing.of()
        private var evaluatorBuildStatus: JsonField<EvaluatorBuildStatus> = JsonMissing.of()
        private var evaluatorId: JsonField<String> = JsonMissing.of()
        private var language: JsonField<String> = JsonMissing.of()
        private var workspaceSecretsKeys: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onlineCodeEvaluator: OnlineCodeEvaluator) = apply {
            code = onlineCodeEvaluator.code
            dependencies = onlineCodeEvaluator.dependencies
            evaluatorBuildError = onlineCodeEvaluator.evaluatorBuildError
            evaluatorBuildStatus = onlineCodeEvaluator.evaluatorBuildStatus
            evaluatorId = onlineCodeEvaluator.evaluatorId
            language = onlineCodeEvaluator.language
            workspaceSecretsKeys =
                onlineCodeEvaluator.workspaceSecretsKeys.map { it.toMutableList() }
            additionalProperties = onlineCodeEvaluator.additionalProperties.toMutableMap()
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

        fun evaluatorBuildError(evaluatorBuildError: String) =
            evaluatorBuildError(JsonField.of(evaluatorBuildError))

        /**
         * Sets [Builder.evaluatorBuildError] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluatorBuildError] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evaluatorBuildError(evaluatorBuildError: JsonField<String>) = apply {
            this.evaluatorBuildError = evaluatorBuildError
        }

        fun evaluatorBuildStatus(evaluatorBuildStatus: EvaluatorBuildStatus) =
            evaluatorBuildStatus(JsonField.of(evaluatorBuildStatus))

        /**
         * Sets [Builder.evaluatorBuildStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluatorBuildStatus] with a well-typed
         * [EvaluatorBuildStatus] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun evaluatorBuildStatus(evaluatorBuildStatus: JsonField<EvaluatorBuildStatus>) = apply {
            this.evaluatorBuildStatus = evaluatorBuildStatus
        }

        fun evaluatorId(evaluatorId: String) = evaluatorId(JsonField.of(evaluatorId))

        /**
         * Sets [Builder.evaluatorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluatorId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun evaluatorId(evaluatorId: JsonField<String>) = apply { this.evaluatorId = evaluatorId }

        /** Default: "python" */
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
         * Returns an immutable instance of [OnlineCodeEvaluator].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OnlineCodeEvaluator =
            OnlineCodeEvaluator(
                code,
                dependencies,
                evaluatorBuildError,
                evaluatorBuildStatus,
                evaluatorId,
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
    fun validate(): OnlineCodeEvaluator = apply {
        if (validated) {
            return@apply
        }

        code()
        dependencies()
        evaluatorBuildError()
        evaluatorBuildStatus().ifPresent { it.validate() }
        evaluatorId()
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
            (if (evaluatorBuildError.asKnown().isPresent) 1 else 0) +
            (evaluatorBuildStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (evaluatorId.asKnown().isPresent) 1 else 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (workspaceSecretsKeys.asKnown().getOrNull()?.size ?: 0)

    class EvaluatorBuildStatus
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

            @JvmField val ENQUEUED = of("ENQUEUED")

            @JvmField val BUILDING = of("BUILDING")

            @JvmField val READY = of("READY")

            @JvmField val FAILED = of("FAILED")

            @JvmStatic fun of(value: String) = EvaluatorBuildStatus(JsonField.of(value))
        }

        /** An enum containing [EvaluatorBuildStatus]'s known values. */
        enum class Known {
            ENQUEUED,
            BUILDING,
            READY,
            FAILED,
        }

        /**
         * An enum containing [EvaluatorBuildStatus]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [EvaluatorBuildStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENQUEUED,
            BUILDING,
            READY,
            FAILED,
            /**
             * An enum member indicating that [EvaluatorBuildStatus] was instantiated with an
             * unknown value.
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
                ENQUEUED -> Value.ENQUEUED
                BUILDING -> Value.BUILDING
                READY -> Value.READY
                FAILED -> Value.FAILED
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
                ENQUEUED -> Known.ENQUEUED
                BUILDING -> Known.BUILDING
                READY -> Known.READY
                FAILED -> Known.FAILED
                else -> throw LangChainInvalidDataException("Unknown EvaluatorBuildStatus: $value")
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
        fun validate(): EvaluatorBuildStatus = apply {
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

            return other is EvaluatorBuildStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnlineCodeEvaluator &&
            code == other.code &&
            dependencies == other.dependencies &&
            evaluatorBuildError == other.evaluatorBuildError &&
            evaluatorBuildStatus == other.evaluatorBuildStatus &&
            evaluatorId == other.evaluatorId &&
            language == other.language &&
            workspaceSecretsKeys == other.workspaceSecretsKeys &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            code,
            dependencies,
            evaluatorBuildError,
            evaluatorBuildStatus,
            evaluatorId,
            language,
            workspaceSecretsKeys,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OnlineCodeEvaluator{code=$code, dependencies=$dependencies, evaluatorBuildError=$evaluatorBuildError, evaluatorBuildStatus=$evaluatorBuildStatus, evaluatorId=$evaluatorId, language=$language, workspaceSecretsKeys=$workspaceSecretsKeys, additionalProperties=$additionalProperties}"
}
