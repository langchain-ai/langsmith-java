// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.evaluators

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a decision-model evaluator (Jev, SemIf or OpenAI Decisions) from its prompt and questions,
 * and attach it to a project or dataset. Each question's key becomes a feedback key.
 */
class EvaluatorCreateDecisionModelParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The evaluator's name.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = body.displayName()

    /**
     * The prompt the model reads, as (role, template) pairs.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prompt(): List<List<JsonValue>> = body.prompt()

    /**
     * The questions, keyed by feedback key, in the order to ask them.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun questions(): Questions = body.questions()

    /**
     * Call this endpoint directly instead of through the LangSmith gateway, with the workspace's
     * TYPESAFE_API_KEY or OPENAI_API_KEY secret. Required for typesafe_compatible.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun baseUrl(): Optional<String> = body.baseUrl()

    /**
     * The dataset whose experiments to evaluate.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun datasetId(): Optional<String> = body.datasetId()

    /**
     * Only evaluate runs that match this filter.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<String> = body.filter()

    /**
     * How many times to retry a failed model call. openai_decisions only.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxRetries(): Optional<Long> = body.maxRetries()

    /**
     * Defaults to jev-latest for typesafe and gpt-6-luna for openai_decisions. Use semif-qwen3.5-4b
     * for SemIf.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * Headers sent with each model call. They are saved in the evaluator's prompt as given, so do
     * not put API keys here.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelHeaders(): Optional<ModelHeaders> = body.modelHeaders()

    /**
     * A saved model configuration to start from: its model, endpoint, key and settings apply unless
     * set here.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun playgroundSettingsId(): Optional<String> = body.playgroundSettingsId()

    /**
     * typesafe for Jev and SemIf, typesafe_compatible for a TypeSafe-compatible endpoint, or
     * openai_decisions.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provider(): Optional<Provider> = body.provider()

    /**
     * The fraction of runs to evaluate.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun samplingRate(): Optional<Double> = body.samplingRate()

    /**
     * The tracing project to evaluate.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionId(): Optional<String> = body.sessionId()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateFormat(): Optional<TemplateFormat> = body.templateFormat()

    /**
     * Seconds to wait for each model call. openai_decisions only.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeoutSeconds(): Optional<Long> = body.timeoutSeconds()

    /**
     * Maps the prompt's variables to run fields.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun variableMapping(): Optional<VariableMapping> = body.variableMapping()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [prompt].
     *
     * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _prompt(): JsonField<List<List<JsonValue>>> = body._prompt()

    /**
     * Returns the raw JSON value of [questions].
     *
     * Unlike [questions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _questions(): JsonField<Questions> = body._questions()

    /**
     * Returns the raw JSON value of [baseUrl].
     *
     * Unlike [baseUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _baseUrl(): JsonField<String> = body._baseUrl()

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _datasetId(): JsonField<String> = body._datasetId()

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filter(): JsonField<String> = body._filter()

    /**
     * Returns the raw JSON value of [maxRetries].
     *
     * Unlike [maxRetries], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxRetries(): JsonField<Long> = body._maxRetries()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [modelHeaders].
     *
     * Unlike [modelHeaders], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelHeaders(): JsonField<ModelHeaders> = body._modelHeaders()

    /**
     * Returns the raw JSON value of [playgroundSettingsId].
     *
     * Unlike [playgroundSettingsId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _playgroundSettingsId(): JsonField<String> = body._playgroundSettingsId()

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _provider(): JsonField<Provider> = body._provider()

    /**
     * Returns the raw JSON value of [samplingRate].
     *
     * Unlike [samplingRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _samplingRate(): JsonField<Double> = body._samplingRate()

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sessionId(): JsonField<String> = body._sessionId()

    /**
     * Returns the raw JSON value of [templateFormat].
     *
     * Unlike [templateFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _templateFormat(): JsonField<TemplateFormat> = body._templateFormat()

    /**
     * Returns the raw JSON value of [timeoutSeconds].
     *
     * Unlike [timeoutSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeoutSeconds(): JsonField<Long> = body._timeoutSeconds()

    /**
     * Returns the raw JSON value of [variableMapping].
     *
     * Unlike [variableMapping], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _variableMapping(): JsonField<VariableMapping> = body._variableMapping()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EvaluatorCreateDecisionModelParams].
         *
         * The following fields are required:
         * ```java
         * .displayName()
         * .prompt()
         * .questions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EvaluatorCreateDecisionModelParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(evaluatorCreateDecisionModelParams: EvaluatorCreateDecisionModelParams) =
            apply {
                body = evaluatorCreateDecisionModelParams.body.toBuilder()
                additionalHeaders = evaluatorCreateDecisionModelParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    evaluatorCreateDecisionModelParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [displayName]
         * - [prompt]
         * - [questions]
         * - [baseUrl]
         * - [datasetId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The evaluator's name. */
        fun displayName(displayName: String) = apply { body.displayName(displayName) }

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { body.displayName(displayName) }

        /** The prompt the model reads, as (role, template) pairs. */
        fun prompt(prompt: List<List<JsonValue>>) = apply { body.prompt(prompt) }

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed `List<List<JsonValue>>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun prompt(prompt: JsonField<List<List<JsonValue>>>) = apply { body.prompt(prompt) }

        /**
         * Adds a single [List<JsonValue>] to [Builder.prompt].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPrompt(prompt: List<JsonValue>) = apply { body.addPrompt(prompt) }

        /** The questions, keyed by feedback key, in the order to ask them. */
        fun questions(questions: Questions) = apply { body.questions(questions) }

        /**
         * Sets [Builder.questions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.questions] with a well-typed [Questions] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun questions(questions: JsonField<Questions>) = apply { body.questions(questions) }

        /**
         * Call this endpoint directly instead of through the LangSmith gateway, with the
         * workspace's TYPESAFE_API_KEY or OPENAI_API_KEY secret. Required for typesafe_compatible.
         */
        fun baseUrl(baseUrl: String?) = apply { body.baseUrl(baseUrl) }

        /** Alias for calling [Builder.baseUrl] with `baseUrl.orElse(null)`. */
        fun baseUrl(baseUrl: Optional<String>) = baseUrl(baseUrl.getOrNull())

        /**
         * Sets [Builder.baseUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun baseUrl(baseUrl: JsonField<String>) = apply { body.baseUrl(baseUrl) }

        /** The dataset whose experiments to evaluate. */
        fun datasetId(datasetId: String?) = apply { body.datasetId(datasetId) }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { body.datasetId(datasetId) }

        /** Only evaluate runs that match this filter. */
        fun filter(filter: String?) = apply { body.filter(filter) }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { body.filter(filter) }

        /** How many times to retry a failed model call. openai_decisions only. */
        fun maxRetries(maxRetries: Long?) = apply { body.maxRetries(maxRetries) }

        /**
         * Alias for [Builder.maxRetries].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxRetries(maxRetries: Long) = maxRetries(maxRetries as Long?)

        /** Alias for calling [Builder.maxRetries] with `maxRetries.orElse(null)`. */
        fun maxRetries(maxRetries: Optional<Long>) = maxRetries(maxRetries.getOrNull())

        /**
         * Sets [Builder.maxRetries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxRetries] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxRetries(maxRetries: JsonField<Long>) = apply { body.maxRetries(maxRetries) }

        /**
         * Defaults to jev-latest for typesafe and gpt-6-luna for openai_decisions. Use
         * semif-qwen3.5-4b for SemIf.
         */
        fun model(model: String?) = apply { body.model(model) }

        /** Alias for calling [Builder.model] with `model.orElse(null)`. */
        fun model(model: Optional<String>) = model(model.getOrNull())

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        /**
         * Headers sent with each model call. They are saved in the evaluator's prompt as given, so
         * do not put API keys here.
         */
        fun modelHeaders(modelHeaders: ModelHeaders?) = apply { body.modelHeaders(modelHeaders) }

        /** Alias for calling [Builder.modelHeaders] with `modelHeaders.orElse(null)`. */
        fun modelHeaders(modelHeaders: Optional<ModelHeaders>) =
            modelHeaders(modelHeaders.getOrNull())

        /**
         * Sets [Builder.modelHeaders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelHeaders] with a well-typed [ModelHeaders] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelHeaders(modelHeaders: JsonField<ModelHeaders>) = apply {
            body.modelHeaders(modelHeaders)
        }

        /**
         * A saved model configuration to start from: its model, endpoint, key and settings apply
         * unless set here.
         */
        fun playgroundSettingsId(playgroundSettingsId: String?) = apply {
            body.playgroundSettingsId(playgroundSettingsId)
        }

        /**
         * Alias for calling [Builder.playgroundSettingsId] with
         * `playgroundSettingsId.orElse(null)`.
         */
        fun playgroundSettingsId(playgroundSettingsId: Optional<String>) =
            playgroundSettingsId(playgroundSettingsId.getOrNull())

        /**
         * Sets [Builder.playgroundSettingsId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.playgroundSettingsId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun playgroundSettingsId(playgroundSettingsId: JsonField<String>) = apply {
            body.playgroundSettingsId(playgroundSettingsId)
        }

        /**
         * typesafe for Jev and SemIf, typesafe_compatible for a TypeSafe-compatible endpoint, or
         * openai_decisions.
         */
        fun provider(provider: Provider) = apply { body.provider(provider) }

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [Provider] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun provider(provider: JsonField<Provider>) = apply { body.provider(provider) }

        /** The fraction of runs to evaluate. */
        fun samplingRate(samplingRate: Double) = apply { body.samplingRate(samplingRate) }

        /**
         * Sets [Builder.samplingRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.samplingRate] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun samplingRate(samplingRate: JsonField<Double>) = apply {
            body.samplingRate(samplingRate)
        }

        /** The tracing project to evaluate. */
        fun sessionId(sessionId: String?) = apply { body.sessionId(sessionId) }

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { body.sessionId(sessionId) }

        fun templateFormat(templateFormat: TemplateFormat) = apply {
            body.templateFormat(templateFormat)
        }

        /**
         * Sets [Builder.templateFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateFormat] with a well-typed [TemplateFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun templateFormat(templateFormat: JsonField<TemplateFormat>) = apply {
            body.templateFormat(templateFormat)
        }

        /** Seconds to wait for each model call. openai_decisions only. */
        fun timeoutSeconds(timeoutSeconds: Long?) = apply { body.timeoutSeconds(timeoutSeconds) }

        /**
         * Alias for [Builder.timeoutSeconds].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun timeoutSeconds(timeoutSeconds: Long) = timeoutSeconds(timeoutSeconds as Long?)

        /** Alias for calling [Builder.timeoutSeconds] with `timeoutSeconds.orElse(null)`. */
        fun timeoutSeconds(timeoutSeconds: Optional<Long>) =
            timeoutSeconds(timeoutSeconds.getOrNull())

        /**
         * Sets [Builder.timeoutSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutSeconds] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeoutSeconds(timeoutSeconds: JsonField<Long>) = apply {
            body.timeoutSeconds(timeoutSeconds)
        }

        /** Maps the prompt's variables to run fields. */
        fun variableMapping(variableMapping: VariableMapping?) = apply {
            body.variableMapping(variableMapping)
        }

        /** Alias for calling [Builder.variableMapping] with `variableMapping.orElse(null)`. */
        fun variableMapping(variableMapping: Optional<VariableMapping>) =
            variableMapping(variableMapping.getOrNull())

        /**
         * Sets [Builder.variableMapping] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variableMapping] with a well-typed [VariableMapping]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun variableMapping(variableMapping: JsonField<VariableMapping>) = apply {
            body.variableMapping(variableMapping)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [EvaluatorCreateDecisionModelParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .displayName()
         * .prompt()
         * .questions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EvaluatorCreateDecisionModelParams =
            EvaluatorCreateDecisionModelParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** A decision-model evaluator to create and attach to a project or dataset. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val displayName: JsonField<String>,
        private val prompt: JsonField<List<List<JsonValue>>>,
        private val questions: JsonField<Questions>,
        private val baseUrl: JsonField<String>,
        private val datasetId: JsonField<String>,
        private val filter: JsonField<String>,
        private val maxRetries: JsonField<Long>,
        private val model: JsonField<String>,
        private val modelHeaders: JsonField<ModelHeaders>,
        private val playgroundSettingsId: JsonField<String>,
        private val provider: JsonField<Provider>,
        private val samplingRate: JsonField<Double>,
        private val sessionId: JsonField<String>,
        private val templateFormat: JsonField<TemplateFormat>,
        private val timeoutSeconds: JsonField<Long>,
        private val variableMapping: JsonField<VariableMapping>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt")
            @ExcludeMissing
            prompt: JsonField<List<List<JsonValue>>> = JsonMissing.of(),
            @JsonProperty("questions")
            @ExcludeMissing
            questions: JsonField<Questions> = JsonMissing.of(),
            @JsonProperty("base_url") @ExcludeMissing baseUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataset_id")
            @ExcludeMissing
            datasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_retries")
            @ExcludeMissing
            maxRetries: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_headers")
            @ExcludeMissing
            modelHeaders: JsonField<ModelHeaders> = JsonMissing.of(),
            @JsonProperty("playground_settings_id")
            @ExcludeMissing
            playgroundSettingsId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
            @JsonProperty("sampling_rate")
            @ExcludeMissing
            samplingRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("session_id")
            @ExcludeMissing
            sessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("template_format")
            @ExcludeMissing
            templateFormat: JsonField<TemplateFormat> = JsonMissing.of(),
            @JsonProperty("timeout_seconds")
            @ExcludeMissing
            timeoutSeconds: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("variable_mapping")
            @ExcludeMissing
            variableMapping: JsonField<VariableMapping> = JsonMissing.of(),
        ) : this(
            displayName,
            prompt,
            questions,
            baseUrl,
            datasetId,
            filter,
            maxRetries,
            model,
            modelHeaders,
            playgroundSettingsId,
            provider,
            samplingRate,
            sessionId,
            templateFormat,
            timeoutSeconds,
            variableMapping,
            mutableMapOf(),
        )

        /**
         * The evaluator's name.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun displayName(): String = displayName.getRequired("display_name")

        /**
         * The prompt the model reads, as (role, template) pairs.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun prompt(): List<List<JsonValue>> = prompt.getRequired("prompt")

        /**
         * The questions, keyed by feedback key, in the order to ask them.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun questions(): Questions = questions.getRequired("questions")

        /**
         * Call this endpoint directly instead of through the LangSmith gateway, with the
         * workspace's TYPESAFE_API_KEY or OPENAI_API_KEY secret. Required for typesafe_compatible.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun baseUrl(): Optional<String> = baseUrl.getOptional("base_url")

        /**
         * The dataset whose experiments to evaluate.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun datasetId(): Optional<String> = datasetId.getOptional("dataset_id")

        /**
         * Only evaluate runs that match this filter.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filter(): Optional<String> = filter.getOptional("filter")

        /**
         * How many times to retry a failed model call. openai_decisions only.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxRetries(): Optional<Long> = maxRetries.getOptional("max_retries")

        /**
         * Defaults to jev-latest for typesafe and gpt-6-luna for openai_decisions. Use
         * semif-qwen3.5-4b for SemIf.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Headers sent with each model call. They are saved in the evaluator's prompt as given, so
         * do not put API keys here.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun modelHeaders(): Optional<ModelHeaders> = modelHeaders.getOptional("model_headers")

        /**
         * A saved model configuration to start from: its model, endpoint, key and settings apply
         * unless set here.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun playgroundSettingsId(): Optional<String> =
            playgroundSettingsId.getOptional("playground_settings_id")

        /**
         * typesafe for Jev and SemIf, typesafe_compatible for a TypeSafe-compatible endpoint, or
         * openai_decisions.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun provider(): Optional<Provider> = provider.getOptional("provider")

        /**
         * The fraction of runs to evaluate.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun samplingRate(): Optional<Double> = samplingRate.getOptional("sampling_rate")

        /**
         * The tracing project to evaluate.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun templateFormat(): Optional<TemplateFormat> =
            templateFormat.getOptional("template_format")

        /**
         * Seconds to wait for each model call. openai_decisions only.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun timeoutSeconds(): Optional<Long> = timeoutSeconds.getOptional("timeout_seconds")

        /**
         * Maps the prompt's variables to run fields.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun variableMapping(): Optional<VariableMapping> =
            variableMapping.getOptional("variable_mapping")

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [prompt].
         *
         * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt")
        @ExcludeMissing
        fun _prompt(): JsonField<List<List<JsonValue>>> = prompt

        /**
         * Returns the raw JSON value of [questions].
         *
         * Unlike [questions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("questions")
        @ExcludeMissing
        fun _questions(): JsonField<Questions> = questions

        /**
         * Returns the raw JSON value of [baseUrl].
         *
         * Unlike [baseUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("base_url") @ExcludeMissing fun _baseUrl(): JsonField<String> = baseUrl

        /**
         * Returns the raw JSON value of [datasetId].
         *
         * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Returns the raw JSON value of [maxRetries].
         *
         * Unlike [maxRetries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_retries") @ExcludeMissing fun _maxRetries(): JsonField<Long> = maxRetries

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [modelHeaders].
         *
         * Unlike [modelHeaders], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("model_headers")
        @ExcludeMissing
        fun _modelHeaders(): JsonField<ModelHeaders> = modelHeaders

        /**
         * Returns the raw JSON value of [playgroundSettingsId].
         *
         * Unlike [playgroundSettingsId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("playground_settings_id")
        @ExcludeMissing
        fun _playgroundSettingsId(): JsonField<String> = playgroundSettingsId

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

        /**
         * Returns the raw JSON value of [samplingRate].
         *
         * Unlike [samplingRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sampling_rate")
        @ExcludeMissing
        fun _samplingRate(): JsonField<Double> = samplingRate

        /**
         * Returns the raw JSON value of [sessionId].
         *
         * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

        /**
         * Returns the raw JSON value of [templateFormat].
         *
         * Unlike [templateFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("template_format")
        @ExcludeMissing
        fun _templateFormat(): JsonField<TemplateFormat> = templateFormat

        /**
         * Returns the raw JSON value of [timeoutSeconds].
         *
         * Unlike [timeoutSeconds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timeout_seconds")
        @ExcludeMissing
        fun _timeoutSeconds(): JsonField<Long> = timeoutSeconds

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .displayName()
             * .prompt()
             * .questions()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var displayName: JsonField<String>? = null
            private var prompt: JsonField<MutableList<List<JsonValue>>>? = null
            private var questions: JsonField<Questions>? = null
            private var baseUrl: JsonField<String> = JsonMissing.of()
            private var datasetId: JsonField<String> = JsonMissing.of()
            private var filter: JsonField<String> = JsonMissing.of()
            private var maxRetries: JsonField<Long> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var modelHeaders: JsonField<ModelHeaders> = JsonMissing.of()
            private var playgroundSettingsId: JsonField<String> = JsonMissing.of()
            private var provider: JsonField<Provider> = JsonMissing.of()
            private var samplingRate: JsonField<Double> = JsonMissing.of()
            private var sessionId: JsonField<String> = JsonMissing.of()
            private var templateFormat: JsonField<TemplateFormat> = JsonMissing.of()
            private var timeoutSeconds: JsonField<Long> = JsonMissing.of()
            private var variableMapping: JsonField<VariableMapping> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                displayName = body.displayName
                prompt = body.prompt.map { it.toMutableList() }
                questions = body.questions
                baseUrl = body.baseUrl
                datasetId = body.datasetId
                filter = body.filter
                maxRetries = body.maxRetries
                model = body.model
                modelHeaders = body.modelHeaders
                playgroundSettingsId = body.playgroundSettingsId
                provider = body.provider
                samplingRate = body.samplingRate
                sessionId = body.sessionId
                templateFormat = body.templateFormat
                timeoutSeconds = body.timeoutSeconds
                variableMapping = body.variableMapping
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The evaluator's name. */
            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            /** The prompt the model reads, as (role, template) pairs. */
            fun prompt(prompt: List<List<JsonValue>>) = prompt(JsonField.of(prompt))

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

            /** The questions, keyed by feedback key, in the order to ask them. */
            fun questions(questions: Questions) = questions(JsonField.of(questions))

            /**
             * Sets [Builder.questions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.questions] with a well-typed [Questions] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun questions(questions: JsonField<Questions>) = apply { this.questions = questions }

            /**
             * Call this endpoint directly instead of through the LangSmith gateway, with the
             * workspace's TYPESAFE_API_KEY or OPENAI_API_KEY secret. Required for
             * typesafe_compatible.
             */
            fun baseUrl(baseUrl: String?) = baseUrl(JsonField.ofNullable(baseUrl))

            /** Alias for calling [Builder.baseUrl] with `baseUrl.orElse(null)`. */
            fun baseUrl(baseUrl: Optional<String>) = baseUrl(baseUrl.getOrNull())

            /**
             * Sets [Builder.baseUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

            /** The dataset whose experiments to evaluate. */
            fun datasetId(datasetId: String?) = datasetId(JsonField.ofNullable(datasetId))

            /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
            fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

            /**
             * Sets [Builder.datasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

            /** Only evaluate runs that match this filter. */
            fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

            /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
            fun filter(filter: Optional<String>) = filter(filter.getOrNull())

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            /** How many times to retry a failed model call. openai_decisions only. */
            fun maxRetries(maxRetries: Long?) = maxRetries(JsonField.ofNullable(maxRetries))

            /**
             * Alias for [Builder.maxRetries].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxRetries(maxRetries: Long) = maxRetries(maxRetries as Long?)

            /** Alias for calling [Builder.maxRetries] with `maxRetries.orElse(null)`. */
            fun maxRetries(maxRetries: Optional<Long>) = maxRetries(maxRetries.getOrNull())

            /**
             * Sets [Builder.maxRetries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxRetries] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxRetries(maxRetries: JsonField<Long>) = apply { this.maxRetries = maxRetries }

            /**
             * Defaults to jev-latest for typesafe and gpt-6-luna for openai_decisions. Use
             * semif-qwen3.5-4b for SemIf.
             */
            fun model(model: String?) = model(JsonField.ofNullable(model))

            /** Alias for calling [Builder.model] with `model.orElse(null)`. */
            fun model(model: Optional<String>) = model(model.getOrNull())

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /**
             * Headers sent with each model call. They are saved in the evaluator's prompt as given,
             * so do not put API keys here.
             */
            fun modelHeaders(modelHeaders: ModelHeaders?) =
                modelHeaders(JsonField.ofNullable(modelHeaders))

            /** Alias for calling [Builder.modelHeaders] with `modelHeaders.orElse(null)`. */
            fun modelHeaders(modelHeaders: Optional<ModelHeaders>) =
                modelHeaders(modelHeaders.getOrNull())

            /**
             * Sets [Builder.modelHeaders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelHeaders] with a well-typed [ModelHeaders] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelHeaders(modelHeaders: JsonField<ModelHeaders>) = apply {
                this.modelHeaders = modelHeaders
            }

            /**
             * A saved model configuration to start from: its model, endpoint, key and settings
             * apply unless set here.
             */
            fun playgroundSettingsId(playgroundSettingsId: String?) =
                playgroundSettingsId(JsonField.ofNullable(playgroundSettingsId))

            /**
             * Alias for calling [Builder.playgroundSettingsId] with
             * `playgroundSettingsId.orElse(null)`.
             */
            fun playgroundSettingsId(playgroundSettingsId: Optional<String>) =
                playgroundSettingsId(playgroundSettingsId.getOrNull())

            /**
             * Sets [Builder.playgroundSettingsId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.playgroundSettingsId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun playgroundSettingsId(playgroundSettingsId: JsonField<String>) = apply {
                this.playgroundSettingsId = playgroundSettingsId
            }

            /**
             * typesafe for Jev and SemIf, typesafe_compatible for a TypeSafe-compatible endpoint,
             * or openai_decisions.
             */
            fun provider(provider: Provider) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

            /** The fraction of runs to evaluate. */
            fun samplingRate(samplingRate: Double) = samplingRate(JsonField.of(samplingRate))

            /**
             * Sets [Builder.samplingRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.samplingRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun samplingRate(samplingRate: JsonField<Double>) = apply {
                this.samplingRate = samplingRate
            }

            /** The tracing project to evaluate. */
            fun sessionId(sessionId: String?) = sessionId(JsonField.ofNullable(sessionId))

            /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
            fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

            /**
             * Sets [Builder.sessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

            fun templateFormat(templateFormat: TemplateFormat) =
                templateFormat(JsonField.of(templateFormat))

            /**
             * Sets [Builder.templateFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateFormat] with a well-typed [TemplateFormat]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun templateFormat(templateFormat: JsonField<TemplateFormat>) = apply {
                this.templateFormat = templateFormat
            }

            /** Seconds to wait for each model call. openai_decisions only. */
            fun timeoutSeconds(timeoutSeconds: Long?) =
                timeoutSeconds(JsonField.ofNullable(timeoutSeconds))

            /**
             * Alias for [Builder.timeoutSeconds].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun timeoutSeconds(timeoutSeconds: Long) = timeoutSeconds(timeoutSeconds as Long?)

            /** Alias for calling [Builder.timeoutSeconds] with `timeoutSeconds.orElse(null)`. */
            fun timeoutSeconds(timeoutSeconds: Optional<Long>) =
                timeoutSeconds(timeoutSeconds.getOrNull())

            /**
             * Sets [Builder.timeoutSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeoutSeconds] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeoutSeconds(timeoutSeconds: JsonField<Long>) = apply {
                this.timeoutSeconds = timeoutSeconds
            }

            /** Maps the prompt's variables to run fields. */
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .displayName()
             * .prompt()
             * .questions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("displayName", displayName),
                    checkRequired("prompt", prompt).map { it.toImmutable() },
                    checkRequired("questions", questions),
                    baseUrl,
                    datasetId,
                    filter,
                    maxRetries,
                    model,
                    modelHeaders,
                    playgroundSettingsId,
                    provider,
                    samplingRate,
                    sessionId,
                    templateFormat,
                    timeoutSeconds,
                    variableMapping,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            displayName()
            prompt()
            questions().validate()
            baseUrl()
            datasetId()
            filter()
            maxRetries()
            model()
            modelHeaders().ifPresent { it.validate() }
            playgroundSettingsId()
            provider().ifPresent { it.validate() }
            samplingRate()
            sessionId()
            templateFormat().ifPresent { it.validate() }
            timeoutSeconds()
            variableMapping().ifPresent { it.validate() }
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
            (if (displayName.asKnown().isPresent) 1 else 0) +
                (prompt.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                (questions.asKnown().getOrNull()?.validity() ?: 0) +
                (if (baseUrl.asKnown().isPresent) 1 else 0) +
                (if (datasetId.asKnown().isPresent) 1 else 0) +
                (if (filter.asKnown().isPresent) 1 else 0) +
                (if (maxRetries.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (modelHeaders.asKnown().getOrNull()?.validity() ?: 0) +
                (if (playgroundSettingsId.asKnown().isPresent) 1 else 0) +
                (provider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (samplingRate.asKnown().isPresent) 1 else 0) +
                (if (sessionId.asKnown().isPresent) 1 else 0) +
                (templateFormat.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timeoutSeconds.asKnown().isPresent) 1 else 0) +
                (variableMapping.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                displayName == other.displayName &&
                prompt == other.prompt &&
                questions == other.questions &&
                baseUrl == other.baseUrl &&
                datasetId == other.datasetId &&
                filter == other.filter &&
                maxRetries == other.maxRetries &&
                model == other.model &&
                modelHeaders == other.modelHeaders &&
                playgroundSettingsId == other.playgroundSettingsId &&
                provider == other.provider &&
                samplingRate == other.samplingRate &&
                sessionId == other.sessionId &&
                templateFormat == other.templateFormat &&
                timeoutSeconds == other.timeoutSeconds &&
                variableMapping == other.variableMapping &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                displayName,
                prompt,
                questions,
                baseUrl,
                datasetId,
                filter,
                maxRetries,
                model,
                modelHeaders,
                playgroundSettingsId,
                provider,
                samplingRate,
                sessionId,
                templateFormat,
                timeoutSeconds,
                variableMapping,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{displayName=$displayName, prompt=$prompt, questions=$questions, baseUrl=$baseUrl, datasetId=$datasetId, filter=$filter, maxRetries=$maxRetries, model=$model, modelHeaders=$modelHeaders, playgroundSettingsId=$playgroundSettingsId, provider=$provider, samplingRate=$samplingRate, sessionId=$sessionId, templateFormat=$templateFormat, timeoutSeconds=$timeoutSeconds, variableMapping=$variableMapping, additionalProperties=$additionalProperties}"
    }

    /** The questions, keyed by feedback key, in the order to ask them. */
    class Questions
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

            /** Returns a mutable builder for constructing an instance of [Questions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Questions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(questions: Questions) = apply {
                additionalProperties = questions.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Questions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Questions = Questions(additionalProperties.toImmutable())
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
        fun validate(): Questions = apply {
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

            return other is Questions && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Questions{additionalProperties=$additionalProperties}"
    }

    /**
     * Headers sent with each model call. They are saved in the evaluator's prompt as given, so do
     * not put API keys here.
     */
    class ModelHeaders
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

            /** Returns a mutable builder for constructing an instance of [ModelHeaders]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ModelHeaders]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(modelHeaders: ModelHeaders) = apply {
                additionalProperties = modelHeaders.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ModelHeaders].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ModelHeaders = ModelHeaders(additionalProperties.toImmutable())
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
        fun validate(): ModelHeaders = apply {
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

            return other is ModelHeaders && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ModelHeaders{additionalProperties=$additionalProperties}"
    }

    /**
     * typesafe for Jev and SemIf, typesafe_compatible for a TypeSafe-compatible endpoint, or
     * openai_decisions.
     */
    class Provider @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TYPESAFE = of("typesafe")

            @JvmField val TYPESAFE_COMPATIBLE = of("typesafe_compatible")

            @JvmField val OPENAI_DECISIONS = of("openai_decisions")

            @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
        }

        /** An enum containing [Provider]'s known values. */
        enum class Known {
            TYPESAFE,
            TYPESAFE_COMPATIBLE,
            OPENAI_DECISIONS,
        }

        /**
         * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Provider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TYPESAFE,
            TYPESAFE_COMPATIBLE,
            OPENAI_DECISIONS,
            /** An enum member indicating that [Provider] was instantiated with an unknown value. */
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
                TYPESAFE -> Value.TYPESAFE
                TYPESAFE_COMPATIBLE -> Value.TYPESAFE_COMPATIBLE
                OPENAI_DECISIONS -> Value.OPENAI_DECISIONS
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
                TYPESAFE -> Known.TYPESAFE
                TYPESAFE_COMPATIBLE -> Known.TYPESAFE_COMPATIBLE
                OPENAI_DECISIONS -> Known.OPENAI_DECISIONS
                else -> throw LangChainInvalidDataException("Unknown Provider: $value")
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
        fun validate(): Provider = apply {
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

            return other is Provider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TemplateFormat @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val MUSTACHE = of("mustache")

            @JvmField val F_STRING = of("f-string")

            @JvmStatic fun of(value: String) = TemplateFormat(JsonField.of(value))
        }

        /** An enum containing [TemplateFormat]'s known values. */
        enum class Known {
            MUSTACHE,
            F_STRING,
        }

        /**
         * An enum containing [TemplateFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TemplateFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MUSTACHE,
            F_STRING,
            /**
             * An enum member indicating that [TemplateFormat] was instantiated with an unknown
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
                MUSTACHE -> Value.MUSTACHE
                F_STRING -> Value.F_STRING
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
                MUSTACHE -> Known.MUSTACHE
                F_STRING -> Known.F_STRING
                else -> throw LangChainInvalidDataException("Unknown TemplateFormat: $value")
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
        fun validate(): TemplateFormat = apply {
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

            return other is TemplateFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Maps the prompt's variables to run fields. */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

            return other is VariableMapping && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "VariableMapping{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EvaluatorCreateDecisionModelParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EvaluatorCreateDecisionModelParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
