// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.modelpricemap

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
import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.allMaxBy
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.getOrThrow
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create New Model Price */
class ModelPriceMapModelPriceMapParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun completionCost(): CompletionCost = body.completionCost()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun matchPattern(): String = body.matchPattern()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun promptCost(): PromptCost = body.promptCost()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun completionCostDetails(): Optional<CompletionCostDetails> = body.completionCostDetails()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun matchPath(): Optional<List<String>> = body.matchPath()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun promptCostDetails(): Optional<PromptCostDetails> = body.promptCostDetails()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun provider(): Optional<String> = body.provider()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = body.startTime()

    /**
     * Returns the raw JSON value of [completionCost].
     *
     * Unlike [completionCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _completionCost(): JsonField<CompletionCost> = body._completionCost()

    /**
     * Returns the raw JSON value of [matchPattern].
     *
     * Unlike [matchPattern], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _matchPattern(): JsonField<String> = body._matchPattern()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [promptCost].
     *
     * Unlike [promptCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _promptCost(): JsonField<PromptCost> = body._promptCost()

    /**
     * Returns the raw JSON value of [completionCostDetails].
     *
     * Unlike [completionCostDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _completionCostDetails(): JsonField<CompletionCostDetails> = body._completionCostDetails()

    /**
     * Returns the raw JSON value of [matchPath].
     *
     * Unlike [matchPath], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _matchPath(): JsonField<List<String>> = body._matchPath()

    /**
     * Returns the raw JSON value of [promptCostDetails].
     *
     * Unlike [promptCostDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _promptCostDetails(): JsonField<PromptCostDetails> = body._promptCostDetails()

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _provider(): JsonField<String> = body._provider()

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startTime(): JsonField<OffsetDateTime> = body._startTime()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ModelPriceMapModelPriceMapParams].
         *
         * The following fields are required:
         * ```java
         * .completionCost()
         * .matchPattern()
         * .name()
         * .promptCost()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ModelPriceMapModelPriceMapParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(modelPriceMapModelPriceMapParams: ModelPriceMapModelPriceMapParams) =
            apply {
                body = modelPriceMapModelPriceMapParams.body.toBuilder()
                additionalHeaders = modelPriceMapModelPriceMapParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    modelPriceMapModelPriceMapParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [completionCost]
         * - [matchPattern]
         * - [name]
         * - [promptCost]
         * - [completionCostDetails]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun completionCost(completionCost: CompletionCost) = apply {
            body.completionCost(completionCost)
        }

        /**
         * Sets [Builder.completionCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionCost] with a well-typed [CompletionCost] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completionCost(completionCost: JsonField<CompletionCost>) = apply {
            body.completionCost(completionCost)
        }

        /** Alias for calling [completionCost] with `CompletionCost.ofNumber(number)`. */
        fun completionCost(number: Double) = apply { body.completionCost(number) }

        /** Alias for calling [completionCost] with `CompletionCost.ofString(string)`. */
        fun completionCost(string: String) = apply { body.completionCost(string) }

        fun matchPattern(matchPattern: String) = apply { body.matchPattern(matchPattern) }

        /**
         * Sets [Builder.matchPattern] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matchPattern] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun matchPattern(matchPattern: JsonField<String>) = apply {
            body.matchPattern(matchPattern)
        }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun promptCost(promptCost: PromptCost) = apply { body.promptCost(promptCost) }

        /**
         * Sets [Builder.promptCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptCost] with a well-typed [PromptCost] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun promptCost(promptCost: JsonField<PromptCost>) = apply { body.promptCost(promptCost) }

        /** Alias for calling [promptCost] with `PromptCost.ofNumber(number)`. */
        fun promptCost(number: Double) = apply { body.promptCost(number) }

        /** Alias for calling [promptCost] with `PromptCost.ofString(string)`. */
        fun promptCost(string: String) = apply { body.promptCost(string) }

        fun completionCostDetails(completionCostDetails: CompletionCostDetails?) = apply {
            body.completionCostDetails(completionCostDetails)
        }

        /**
         * Alias for calling [Builder.completionCostDetails] with
         * `completionCostDetails.orElse(null)`.
         */
        fun completionCostDetails(completionCostDetails: Optional<CompletionCostDetails>) =
            completionCostDetails(completionCostDetails.getOrNull())

        /**
         * Sets [Builder.completionCostDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionCostDetails] with a well-typed
         * [CompletionCostDetails] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun completionCostDetails(completionCostDetails: JsonField<CompletionCostDetails>) = apply {
            body.completionCostDetails(completionCostDetails)
        }

        fun matchPath(matchPath: List<String>) = apply { body.matchPath(matchPath) }

        /**
         * Sets [Builder.matchPath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matchPath] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun matchPath(matchPath: JsonField<List<String>>) = apply { body.matchPath(matchPath) }

        /**
         * Adds a single [String] to [Builder.matchPath].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMatchPath(matchPath: String) = apply { body.addMatchPath(matchPath) }

        fun promptCostDetails(promptCostDetails: PromptCostDetails?) = apply {
            body.promptCostDetails(promptCostDetails)
        }

        /** Alias for calling [Builder.promptCostDetails] with `promptCostDetails.orElse(null)`. */
        fun promptCostDetails(promptCostDetails: Optional<PromptCostDetails>) =
            promptCostDetails(promptCostDetails.getOrNull())

        /**
         * Sets [Builder.promptCostDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptCostDetails] with a well-typed [PromptCostDetails]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun promptCostDetails(promptCostDetails: JsonField<PromptCostDetails>) = apply {
            body.promptCostDetails(promptCostDetails)
        }

        fun provider(provider: String?) = apply { body.provider(provider) }

        /** Alias for calling [Builder.provider] with `provider.orElse(null)`. */
        fun provider(provider: Optional<String>) = provider(provider.getOrNull())

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun provider(provider: JsonField<String>) = apply { body.provider(provider) }

        fun startTime(startTime: OffsetDateTime?) = apply { body.startTime(startTime) }

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { body.startTime(startTime) }

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
         * Returns an immutable instance of [ModelPriceMapModelPriceMapParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .completionCost()
         * .matchPattern()
         * .name()
         * .promptCost()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ModelPriceMapModelPriceMapParams =
            ModelPriceMapModelPriceMapParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Model price map create schema. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val completionCost: JsonField<CompletionCost>,
        private val matchPattern: JsonField<String>,
        private val name: JsonField<String>,
        private val promptCost: JsonField<PromptCost>,
        private val completionCostDetails: JsonField<CompletionCostDetails>,
        private val matchPath: JsonField<List<String>>,
        private val promptCostDetails: JsonField<PromptCostDetails>,
        private val provider: JsonField<String>,
        private val startTime: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("completion_cost")
            @ExcludeMissing
            completionCost: JsonField<CompletionCost> = JsonMissing.of(),
            @JsonProperty("match_pattern")
            @ExcludeMissing
            matchPattern: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt_cost")
            @ExcludeMissing
            promptCost: JsonField<PromptCost> = JsonMissing.of(),
            @JsonProperty("completion_cost_details")
            @ExcludeMissing
            completionCostDetails: JsonField<CompletionCostDetails> = JsonMissing.of(),
            @JsonProperty("match_path")
            @ExcludeMissing
            matchPath: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("prompt_cost_details")
            @ExcludeMissing
            promptCostDetails: JsonField<PromptCostDetails> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            completionCost,
            matchPattern,
            name,
            promptCost,
            completionCostDetails,
            matchPath,
            promptCostDetails,
            provider,
            startTime,
            mutableMapOf(),
        )

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun completionCost(): CompletionCost = completionCost.getRequired("completion_cost")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun matchPattern(): String = matchPattern.getRequired("match_pattern")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun promptCost(): PromptCost = promptCost.getRequired("prompt_cost")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun completionCostDetails(): Optional<CompletionCostDetails> =
            completionCostDetails.getOptional("completion_cost_details")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun matchPath(): Optional<List<String>> = matchPath.getOptional("match_path")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun promptCostDetails(): Optional<PromptCostDetails> =
            promptCostDetails.getOptional("prompt_cost_details")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun provider(): Optional<String> = provider.getOptional("provider")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

        /**
         * Returns the raw JSON value of [completionCost].
         *
         * Unlike [completionCost], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("completion_cost")
        @ExcludeMissing
        fun _completionCost(): JsonField<CompletionCost> = completionCost

        /**
         * Returns the raw JSON value of [matchPattern].
         *
         * Unlike [matchPattern], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("match_pattern")
        @ExcludeMissing
        fun _matchPattern(): JsonField<String> = matchPattern

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [promptCost].
         *
         * Unlike [promptCost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt_cost")
        @ExcludeMissing
        fun _promptCost(): JsonField<PromptCost> = promptCost

        /**
         * Returns the raw JSON value of [completionCostDetails].
         *
         * Unlike [completionCostDetails], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("completion_cost_details")
        @ExcludeMissing
        fun _completionCostDetails(): JsonField<CompletionCostDetails> = completionCostDetails

        /**
         * Returns the raw JSON value of [matchPath].
         *
         * Unlike [matchPath], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("match_path")
        @ExcludeMissing
        fun _matchPath(): JsonField<List<String>> = matchPath

        /**
         * Returns the raw JSON value of [promptCostDetails].
         *
         * Unlike [promptCostDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prompt_cost_details")
        @ExcludeMissing
        fun _promptCostDetails(): JsonField<PromptCostDetails> = promptCostDetails

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time")
        @ExcludeMissing
        fun _startTime(): JsonField<OffsetDateTime> = startTime

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
             * .completionCost()
             * .matchPattern()
             * .name()
             * .promptCost()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var completionCost: JsonField<CompletionCost>? = null
            private var matchPattern: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var promptCost: JsonField<PromptCost>? = null
            private var completionCostDetails: JsonField<CompletionCostDetails> = JsonMissing.of()
            private var matchPath: JsonField<MutableList<String>>? = null
            private var promptCostDetails: JsonField<PromptCostDetails> = JsonMissing.of()
            private var provider: JsonField<String> = JsonMissing.of()
            private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                completionCost = body.completionCost
                matchPattern = body.matchPattern
                name = body.name
                promptCost = body.promptCost
                completionCostDetails = body.completionCostDetails
                matchPath = body.matchPath.map { it.toMutableList() }
                promptCostDetails = body.promptCostDetails
                provider = body.provider
                startTime = body.startTime
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun completionCost(completionCost: CompletionCost) =
                completionCost(JsonField.of(completionCost))

            /**
             * Sets [Builder.completionCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completionCost] with a well-typed [CompletionCost]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun completionCost(completionCost: JsonField<CompletionCost>) = apply {
                this.completionCost = completionCost
            }

            /** Alias for calling [completionCost] with `CompletionCost.ofNumber(number)`. */
            fun completionCost(number: Double) = completionCost(CompletionCost.ofNumber(number))

            /** Alias for calling [completionCost] with `CompletionCost.ofString(string)`. */
            fun completionCost(string: String) = completionCost(CompletionCost.ofString(string))

            fun matchPattern(matchPattern: String) = matchPattern(JsonField.of(matchPattern))

            /**
             * Sets [Builder.matchPattern] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matchPattern] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun matchPattern(matchPattern: JsonField<String>) = apply {
                this.matchPattern = matchPattern
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun promptCost(promptCost: PromptCost) = promptCost(JsonField.of(promptCost))

            /**
             * Sets [Builder.promptCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptCost] with a well-typed [PromptCost] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptCost(promptCost: JsonField<PromptCost>) = apply {
                this.promptCost = promptCost
            }

            /** Alias for calling [promptCost] with `PromptCost.ofNumber(number)`. */
            fun promptCost(number: Double) = promptCost(PromptCost.ofNumber(number))

            /** Alias for calling [promptCost] with `PromptCost.ofString(string)`. */
            fun promptCost(string: String) = promptCost(PromptCost.ofString(string))

            fun completionCostDetails(completionCostDetails: CompletionCostDetails?) =
                completionCostDetails(JsonField.ofNullable(completionCostDetails))

            /**
             * Alias for calling [Builder.completionCostDetails] with
             * `completionCostDetails.orElse(null)`.
             */
            fun completionCostDetails(completionCostDetails: Optional<CompletionCostDetails>) =
                completionCostDetails(completionCostDetails.getOrNull())

            /**
             * Sets [Builder.completionCostDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completionCostDetails] with a well-typed
             * [CompletionCostDetails] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun completionCostDetails(completionCostDetails: JsonField<CompletionCostDetails>) =
                apply {
                    this.completionCostDetails = completionCostDetails
                }

            fun matchPath(matchPath: List<String>) = matchPath(JsonField.of(matchPath))

            /**
             * Sets [Builder.matchPath] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matchPath] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun matchPath(matchPath: JsonField<List<String>>) = apply {
                this.matchPath = matchPath.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.matchPath].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMatchPath(matchPath: String) = apply {
                this.matchPath =
                    (this.matchPath ?: JsonField.of(mutableListOf())).also {
                        checkKnown("matchPath", it).add(matchPath)
                    }
            }

            fun promptCostDetails(promptCostDetails: PromptCostDetails?) =
                promptCostDetails(JsonField.ofNullable(promptCostDetails))

            /**
             * Alias for calling [Builder.promptCostDetails] with `promptCostDetails.orElse(null)`.
             */
            fun promptCostDetails(promptCostDetails: Optional<PromptCostDetails>) =
                promptCostDetails(promptCostDetails.getOrNull())

            /**
             * Sets [Builder.promptCostDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptCostDetails] with a well-typed
             * [PromptCostDetails] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun promptCostDetails(promptCostDetails: JsonField<PromptCostDetails>) = apply {
                this.promptCostDetails = promptCostDetails
            }

            fun provider(provider: String?) = provider(JsonField.ofNullable(provider))

            /** Alias for calling [Builder.provider] with `provider.orElse(null)`. */
            fun provider(provider: Optional<String>) = provider(provider.getOrNull())

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

            fun startTime(startTime: OffsetDateTime?) = startTime(JsonField.ofNullable(startTime))

            /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
            fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                this.startTime = startTime
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
             * .completionCost()
             * .matchPattern()
             * .name()
             * .promptCost()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("completionCost", completionCost),
                    checkRequired("matchPattern", matchPattern),
                    checkRequired("name", name),
                    checkRequired("promptCost", promptCost),
                    completionCostDetails,
                    (matchPath ?: JsonMissing.of()).map { it.toImmutable() },
                    promptCostDetails,
                    provider,
                    startTime,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            completionCost().validate()
            matchPattern()
            name()
            promptCost().validate()
            completionCostDetails().ifPresent { it.validate() }
            matchPath()
            promptCostDetails().ifPresent { it.validate() }
            provider()
            startTime()
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
            (completionCost.asKnown().getOrNull()?.validity() ?: 0) +
                (if (matchPattern.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (promptCost.asKnown().getOrNull()?.validity() ?: 0) +
                (completionCostDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (matchPath.asKnown().getOrNull()?.size ?: 0) +
                (promptCostDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (if (provider.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                completionCost == other.completionCost &&
                matchPattern == other.matchPattern &&
                name == other.name &&
                promptCost == other.promptCost &&
                completionCostDetails == other.completionCostDetails &&
                matchPath == other.matchPath &&
                promptCostDetails == other.promptCostDetails &&
                provider == other.provider &&
                startTime == other.startTime &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                completionCost,
                matchPattern,
                name,
                promptCost,
                completionCostDetails,
                matchPath,
                promptCostDetails,
                provider,
                startTime,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{completionCost=$completionCost, matchPattern=$matchPattern, name=$name, promptCost=$promptCost, completionCostDetails=$completionCostDetails, matchPath=$matchPath, promptCostDetails=$promptCostDetails, provider=$provider, startTime=$startTime, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = CompletionCost.Deserializer::class)
    @JsonSerialize(using = CompletionCost.Serializer::class)
    class CompletionCost
    private constructor(
        private val number: Double? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isNumber(): Boolean = number != null

        fun isString(): Boolean = string != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): CompletionCost = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitString(string: String) {}
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
                    override fun visitNumber(number: Double) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CompletionCost && number == other.number && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(number, string)

        override fun toString(): String =
            when {
                number != null -> "CompletionCost{number=$number}"
                string != null -> "CompletionCost{string=$string}"
                _json != null -> "CompletionCost{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CompletionCost")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = CompletionCost(number = number)

            @JvmStatic fun ofString(string: String) = CompletionCost(string = string)
        }

        /**
         * An interface that defines how to map each variant of [CompletionCost] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [CompletionCost] to a value of type [T].
             *
             * An instance of [CompletionCost] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LangsmithApiInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangsmithApiInvalidDataException("Unknown CompletionCost: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<CompletionCost>(CompletionCost::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): CompletionCost {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                CompletionCost(number = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                CompletionCost(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> CompletionCost(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<CompletionCost>(CompletionCost::class) {

            override fun serialize(
                value: CompletionCost,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid CompletionCost")
                }
            }
        }
    }

    @JsonDeserialize(using = PromptCost.Deserializer::class)
    @JsonSerialize(using = PromptCost.Serializer::class)
    class PromptCost
    private constructor(
        private val number: Double? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isNumber(): Boolean = number != null

        fun isString(): Boolean = string != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): PromptCost = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitString(string: String) {}
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
                    override fun visitNumber(number: Double) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PromptCost && number == other.number && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(number, string)

        override fun toString(): String =
            when {
                number != null -> "PromptCost{number=$number}"
                string != null -> "PromptCost{string=$string}"
                _json != null -> "PromptCost{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid PromptCost")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = PromptCost(number = number)

            @JvmStatic fun ofString(string: String) = PromptCost(string = string)
        }

        /**
         * An interface that defines how to map each variant of [PromptCost] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [PromptCost] to a value of type [T].
             *
             * An instance of [PromptCost] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LangsmithApiInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangsmithApiInvalidDataException("Unknown PromptCost: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<PromptCost>(PromptCost::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): PromptCost {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                PromptCost(number = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                PromptCost(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> PromptCost(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<PromptCost>(PromptCost::class) {

            override fun serialize(
                value: PromptCost,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid PromptCost")
                }
            }
        }
    }

    class CompletionCostDetails
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
             * Returns a mutable builder for constructing an instance of [CompletionCostDetails].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CompletionCostDetails]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(completionCostDetails: CompletionCostDetails) = apply {
                additionalProperties = completionCostDetails.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CompletionCostDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CompletionCostDetails =
                CompletionCostDetails(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CompletionCostDetails = apply {
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

            return other is CompletionCostDetails &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CompletionCostDetails{additionalProperties=$additionalProperties}"
    }

    class PromptCostDetails
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

            /** Returns a mutable builder for constructing an instance of [PromptCostDetails]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PromptCostDetails]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(promptCostDetails: PromptCostDetails) = apply {
                additionalProperties = promptCostDetails.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [PromptCostDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PromptCostDetails = PromptCostDetails(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): PromptCostDetails = apply {
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

            return other is PromptCostDetails && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PromptCostDetails{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModelPriceMapModelPriceMapParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ModelPriceMapModelPriceMapParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
