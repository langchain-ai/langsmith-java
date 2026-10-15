// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.promptwebhooks

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
 * Create a new prompt webhook.
 *
 * LangSmith sends a POST request to the webhook URL for each event listed in triggers on the
 * prompts it matches. A workspace can have one prompt webhook unless its limit was raised; creating
 * one past the limit returns 400.
 */
class PromptWebhookCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * URL that receives a POST request with the prompt event payload.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = body.url()

    /**
     * ID to assign to the webhook. Generated when omitted.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = body.id()

    /**
     * IDs of prompts whose events never fire the webhook.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludePrompts(): Optional<List<String>> = body.excludePrompts()

    /**
     * HTTP headers sent with each request, for example an Authorization header. Values are stored
     * encrypted and are masked in responses to callers who cannot update prompts.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headers(): Optional<WebhookHeaders> = body.headers()

    /**
     * IDs of the prompts whose events fire the webhook. When empty, events from every prompt in the
     * workspace fire it.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includePrompts(): Optional<List<String>> = body.includePrompts()

    /**
     * Events that fire the webhook: commit (a new prompt commit), tag:create, and tag:update. A
     * webhook with no triggers never fires.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun triggers(): Optional<List<Trigger>> = body.triggers()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [excludePrompts].
     *
     * Unlike [excludePrompts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _excludePrompts(): JsonField<List<String>> = body._excludePrompts()

    /**
     * Returns the raw JSON value of [headers].
     *
     * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _headers_(): JsonField<WebhookHeaders> = body._headers_()

    /**
     * Returns the raw JSON value of [includePrompts].
     *
     * Unlike [includePrompts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _includePrompts(): JsonField<List<String>> = body._includePrompts()

    /**
     * Returns the raw JSON value of [triggers].
     *
     * Unlike [triggers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _triggers(): JsonField<List<Trigger>> = body._triggers()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PromptWebhookCreateParams].
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PromptWebhookCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(promptWebhookCreateParams: PromptWebhookCreateParams) = apply {
            body = promptWebhookCreateParams.body.toBuilder()
            additionalHeaders = promptWebhookCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = promptWebhookCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [url]
         * - [id]
         * - [excludePrompts]
         * - [headers]
         * - [includePrompts]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** URL that receives a POST request with the prompt event payload. */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

        /** ID to assign to the webhook. Generated when omitted. */
        fun id(id: String?) = apply { body.id(id) }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        /** IDs of prompts whose events never fire the webhook. */
        fun excludePrompts(excludePrompts: List<String>?) = apply {
            body.excludePrompts(excludePrompts)
        }

        /** Alias for calling [Builder.excludePrompts] with `excludePrompts.orElse(null)`. */
        fun excludePrompts(excludePrompts: Optional<List<String>>) =
            excludePrompts(excludePrompts.getOrNull())

        /**
         * Sets [Builder.excludePrompts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludePrompts] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun excludePrompts(excludePrompts: JsonField<List<String>>) = apply {
            body.excludePrompts(excludePrompts)
        }

        /**
         * Adds a single [String] to [excludePrompts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludePrompt(excludePrompt: String) = apply { body.addExcludePrompt(excludePrompt) }

        /**
         * HTTP headers sent with each request, for example an Authorization header. Values are
         * stored encrypted and are masked in responses to callers who cannot update prompts.
         */
        fun headers(headers: WebhookHeaders?) = apply { body.headers(headers) }

        /** Alias for calling [Builder.headers] with `headers.orElse(null)`. */
        fun headers(headers: Optional<WebhookHeaders>) = headers(headers.getOrNull())

        /**
         * Sets [Builder.headers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headers] with a well-typed [WebhookHeaders] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun headers(headers: JsonField<WebhookHeaders>) = apply { body.headers(headers) }

        /**
         * IDs of the prompts whose events fire the webhook. When empty, events from every prompt in
         * the workspace fire it.
         */
        fun includePrompts(includePrompts: List<String>?) = apply {
            body.includePrompts(includePrompts)
        }

        /** Alias for calling [Builder.includePrompts] with `includePrompts.orElse(null)`. */
        fun includePrompts(includePrompts: Optional<List<String>>) =
            includePrompts(includePrompts.getOrNull())

        /**
         * Sets [Builder.includePrompts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includePrompts] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includePrompts(includePrompts: JsonField<List<String>>) = apply {
            body.includePrompts(includePrompts)
        }

        /**
         * Adds a single [String] to [includePrompts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIncludePrompt(includePrompt: String) = apply { body.addIncludePrompt(includePrompt) }

        /**
         * Events that fire the webhook: commit (a new prompt commit), tag:create, and tag:update. A
         * webhook with no triggers never fires.
         */
        fun triggers(triggers: List<Trigger>) = apply { body.triggers(triggers) }

        /**
         * Sets [Builder.triggers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggers] with a well-typed `List<Trigger>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun triggers(triggers: JsonField<List<Trigger>>) = apply { body.triggers(triggers) }

        /**
         * Adds a single [Trigger] to [triggers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTrigger(trigger: Trigger) = apply { body.addTrigger(trigger) }

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
         * Returns an immutable instance of [PromptWebhookCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PromptWebhookCreateParams =
            PromptWebhookCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Schema for creating a prompt webhook. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val url: JsonField<String>,
        private val id: JsonField<String>,
        private val excludePrompts: JsonField<List<String>>,
        private val headers: JsonField<WebhookHeaders>,
        private val includePrompts: JsonField<List<String>>,
        private val triggers: JsonField<List<Trigger>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("exclude_prompts")
            @ExcludeMissing
            excludePrompts: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("headers")
            @ExcludeMissing
            headers: JsonField<WebhookHeaders> = JsonMissing.of(),
            @JsonProperty("include_prompts")
            @ExcludeMissing
            includePrompts: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("triggers")
            @ExcludeMissing
            triggers: JsonField<List<Trigger>> = JsonMissing.of(),
        ) : this(url, id, excludePrompts, headers, includePrompts, triggers, mutableMapOf())

        /**
         * URL that receives a POST request with the prompt event payload.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * ID to assign to the webhook. Generated when omitted.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * IDs of prompts whose events never fire the webhook.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun excludePrompts(): Optional<List<String>> = excludePrompts.getOptional("exclude_prompts")

        /**
         * HTTP headers sent with each request, for example an Authorization header. Values are
         * stored encrypted and are masked in responses to callers who cannot update prompts.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun headers(): Optional<WebhookHeaders> = headers.getOptional("headers")

        /**
         * IDs of the prompts whose events fire the webhook. When empty, events from every prompt in
         * the workspace fire it.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun includePrompts(): Optional<List<String>> = includePrompts.getOptional("include_prompts")

        /**
         * Events that fire the webhook: commit (a new prompt commit), tag:create, and tag:update. A
         * webhook with no triggers never fires.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun triggers(): Optional<List<Trigger>> = triggers.getOptional("triggers")

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [excludePrompts].
         *
         * Unlike [excludePrompts], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("exclude_prompts")
        @ExcludeMissing
        fun _excludePrompts(): JsonField<List<String>> = excludePrompts

        /**
         * Returns the raw JSON value of [headers].
         *
         * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("headers")
        @ExcludeMissing
        fun _headers_(): JsonField<WebhookHeaders> = headers

        /**
         * Returns the raw JSON value of [includePrompts].
         *
         * Unlike [includePrompts], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("include_prompts")
        @ExcludeMissing
        fun _includePrompts(): JsonField<List<String>> = includePrompts

        /**
         * Returns the raw JSON value of [triggers].
         *
         * Unlike [triggers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("triggers")
        @ExcludeMissing
        fun _triggers(): JsonField<List<Trigger>> = triggers

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
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var url: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var excludePrompts: JsonField<MutableList<String>>? = null
            private var headers: JsonField<WebhookHeaders> = JsonMissing.of()
            private var includePrompts: JsonField<MutableList<String>>? = null
            private var triggers: JsonField<MutableList<Trigger>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                url = body.url
                id = body.id
                excludePrompts = body.excludePrompts.map { it.toMutableList() }
                headers = body.headers
                includePrompts = body.includePrompts.map { it.toMutableList() }
                triggers = body.triggers.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** URL that receives a POST request with the prompt event payload. */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /** ID to assign to the webhook. Generated when omitted. */
            fun id(id: String?) = id(JsonField.ofNullable(id))

            /** Alias for calling [Builder.id] with `id.orElse(null)`. */
            fun id(id: Optional<String>) = id(id.getOrNull())

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** IDs of prompts whose events never fire the webhook. */
            fun excludePrompts(excludePrompts: List<String>?) =
                excludePrompts(JsonField.ofNullable(excludePrompts))

            /** Alias for calling [Builder.excludePrompts] with `excludePrompts.orElse(null)`. */
            fun excludePrompts(excludePrompts: Optional<List<String>>) =
                excludePrompts(excludePrompts.getOrNull())

            /**
             * Sets [Builder.excludePrompts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.excludePrompts] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun excludePrompts(excludePrompts: JsonField<List<String>>) = apply {
                this.excludePrompts = excludePrompts.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [excludePrompts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExcludePrompt(excludePrompt: String) = apply {
                excludePrompts =
                    (excludePrompts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("excludePrompts", it).add(excludePrompt)
                    }
            }

            /**
             * HTTP headers sent with each request, for example an Authorization header. Values are
             * stored encrypted and are masked in responses to callers who cannot update prompts.
             */
            fun headers(headers: WebhookHeaders?) = headers(JsonField.ofNullable(headers))

            /** Alias for calling [Builder.headers] with `headers.orElse(null)`. */
            fun headers(headers: Optional<WebhookHeaders>) = headers(headers.getOrNull())

            /**
             * Sets [Builder.headers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headers] with a well-typed [WebhookHeaders] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headers(headers: JsonField<WebhookHeaders>) = apply { this.headers = headers }

            /**
             * IDs of the prompts whose events fire the webhook. When empty, events from every
             * prompt in the workspace fire it.
             */
            fun includePrompts(includePrompts: List<String>?) =
                includePrompts(JsonField.ofNullable(includePrompts))

            /** Alias for calling [Builder.includePrompts] with `includePrompts.orElse(null)`. */
            fun includePrompts(includePrompts: Optional<List<String>>) =
                includePrompts(includePrompts.getOrNull())

            /**
             * Sets [Builder.includePrompts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includePrompts] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun includePrompts(includePrompts: JsonField<List<String>>) = apply {
                this.includePrompts = includePrompts.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [includePrompts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIncludePrompt(includePrompt: String) = apply {
                includePrompts =
                    (includePrompts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("includePrompts", it).add(includePrompt)
                    }
            }

            /**
             * Events that fire the webhook: commit (a new prompt commit), tag:create, and
             * tag:update. A webhook with no triggers never fires.
             */
            fun triggers(triggers: List<Trigger>) = triggers(JsonField.of(triggers))

            /**
             * Sets [Builder.triggers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.triggers] with a well-typed `List<Trigger>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun triggers(triggers: JsonField<List<Trigger>>) = apply {
                this.triggers = triggers.map { it.toMutableList() }
            }

            /**
             * Adds a single [Trigger] to [triggers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTrigger(trigger: Trigger) = apply {
                triggers =
                    (triggers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("triggers", it).add(trigger)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("url", url),
                    id,
                    (excludePrompts ?: JsonMissing.of()).map { it.toImmutable() },
                    headers,
                    (includePrompts ?: JsonMissing.of()).map { it.toImmutable() },
                    (triggers ?: JsonMissing.of()).map { it.toImmutable() },
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

            url()
            id()
            excludePrompts()
            headers().ifPresent { it.validate() }
            includePrompts()
            triggers().ifPresent { it.forEach { it.validate() } }
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
            (if (url.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (excludePrompts.asKnown().getOrNull()?.size ?: 0) +
                (headers.asKnown().getOrNull()?.validity() ?: 0) +
                (includePrompts.asKnown().getOrNull()?.size ?: 0) +
                (triggers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                url == other.url &&
                id == other.id &&
                excludePrompts == other.excludePrompts &&
                headers == other.headers &&
                includePrompts == other.includePrompts &&
                triggers == other.triggers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                url,
                id,
                excludePrompts,
                headers,
                includePrompts,
                triggers,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{url=$url, id=$id, excludePrompts=$excludePrompts, headers=$headers, includePrompts=$includePrompts, triggers=$triggers, additionalProperties=$additionalProperties}"
    }

    /**
     * HTTP headers sent with each request, for example an Authorization header. Values are stored
     * encrypted and are masked in responses to callers who cannot update prompts.
     */
    class WebhookHeaders
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

            /** Returns a mutable builder for constructing an instance of [WebhookHeaders]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WebhookHeaders]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(webhookHeaders: WebhookHeaders) = apply {
                additionalProperties = webhookHeaders.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [WebhookHeaders].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): WebhookHeaders = WebhookHeaders(additionalProperties.toImmutable())
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
        fun validate(): WebhookHeaders = apply {
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

            return other is WebhookHeaders && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "WebhookHeaders{additionalProperties=$additionalProperties}"
    }

    /** Valid trigger types for prompt webhooks. */
    class Trigger @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val COMMIT = of("commit")

            @JvmField val TAG_CREATE = of("tag:create")

            @JvmField val TAG_UPDATE = of("tag:update")

            @JvmStatic fun of(value: String) = Trigger(JsonField.of(value))
        }

        /** An enum containing [Trigger]'s known values. */
        enum class Known {
            COMMIT,
            TAG_CREATE,
            TAG_UPDATE,
        }

        /**
         * An enum containing [Trigger]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Trigger] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMMIT,
            TAG_CREATE,
            TAG_UPDATE,
            /** An enum member indicating that [Trigger] was instantiated with an unknown value. */
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
                COMMIT -> Value.COMMIT
                TAG_CREATE -> Value.TAG_CREATE
                TAG_UPDATE -> Value.TAG_UPDATE
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
                COMMIT -> Known.COMMIT
                TAG_CREATE -> Known.TAG_CREATE
                TAG_UPDATE -> Known.TAG_UPDATE
                else -> throw LangChainInvalidDataException("Unknown Trigger: $value")
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
        fun validate(): Trigger = apply {
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

            return other is Trigger && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PromptWebhookCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PromptWebhookCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
