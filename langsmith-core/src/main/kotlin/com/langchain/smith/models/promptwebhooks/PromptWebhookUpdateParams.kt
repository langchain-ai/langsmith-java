// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.promptwebhooks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a specific prompt webhook. */
class PromptWebhookUpdateParams
private constructor(
    private val webhookId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun webhookId(): Optional<String> = Optional.ofNullable(webhookId)

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludePrompts(): Optional<List<String>> = body.excludePrompts()

    fun _headers_(): JsonValue = body._headers_()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includePrompts(): Optional<List<String>> = body.includePrompts()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun triggers(): Optional<List<EPromptWebhookTrigger>> = body.triggers()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = body.url()

    /**
     * Returns the raw JSON value of [excludePrompts].
     *
     * Unlike [excludePrompts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _excludePrompts(): JsonField<List<String>> = body._excludePrompts()

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
    fun _triggers(): JsonField<List<EPromptWebhookTrigger>> = body._triggers()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PromptWebhookUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [PromptWebhookUpdateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PromptWebhookUpdateParams]. */
    class Builder internal constructor() {

        private var webhookId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(promptWebhookUpdateParams: PromptWebhookUpdateParams) = apply {
            webhookId = promptWebhookUpdateParams.webhookId
            body = promptWebhookUpdateParams.body.toBuilder()
            additionalHeaders = promptWebhookUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = promptWebhookUpdateParams.additionalQueryParams.toBuilder()
        }

        fun webhookId(webhookId: String?) = apply { this.webhookId = webhookId }

        /** Alias for calling [Builder.webhookId] with `webhookId.orElse(null)`. */
        fun webhookId(webhookId: Optional<String>) = webhookId(webhookId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [excludePrompts]
         * - [headers]
         * - [includePrompts]
         * - [triggers]
         * - [url]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

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

        fun headers(headers: JsonValue) = apply { body.headers(headers) }

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

        fun triggers(triggers: List<EPromptWebhookTrigger>?) = apply { body.triggers(triggers) }

        /** Alias for calling [Builder.triggers] with `triggers.orElse(null)`. */
        fun triggers(triggers: Optional<List<EPromptWebhookTrigger>>) =
            triggers(triggers.getOrNull())

        /**
         * Sets [Builder.triggers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggers] with a well-typed
         * `List<EPromptWebhookTrigger>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun triggers(triggers: JsonField<List<EPromptWebhookTrigger>>) = apply {
            body.triggers(triggers)
        }

        /**
         * Adds a single [EPromptWebhookTrigger] to [triggers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTrigger(trigger: EPromptWebhookTrigger) = apply { body.addTrigger(trigger) }

        fun url(url: String?) = apply { body.url(url) }

        /** Alias for calling [Builder.url] with `url.orElse(null)`. */
        fun url(url: Optional<String>) = url(url.getOrNull())

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

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
         * Returns an immutable instance of [PromptWebhookUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PromptWebhookUpdateParams =
            PromptWebhookUpdateParams(
                webhookId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> webhookId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Schema for updating a prompt webhook. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val excludePrompts: JsonField<List<String>>,
        private val headers: JsonValue,
        private val includePrompts: JsonField<List<String>>,
        private val triggers: JsonField<List<EPromptWebhookTrigger>>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("exclude_prompts")
            @ExcludeMissing
            excludePrompts: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("headers") @ExcludeMissing headers: JsonValue = JsonMissing.of(),
            @JsonProperty("include_prompts")
            @ExcludeMissing
            includePrompts: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("triggers")
            @ExcludeMissing
            triggers: JsonField<List<EPromptWebhookTrigger>> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(excludePrompts, headers, includePrompts, triggers, url, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun excludePrompts(): Optional<List<String>> = excludePrompts.getOptional("exclude_prompts")

        @JsonProperty("headers") @ExcludeMissing fun _headers_(): JsonValue = headers

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun includePrompts(): Optional<List<String>> = includePrompts.getOptional("include_prompts")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun triggers(): Optional<List<EPromptWebhookTrigger>> = triggers.getOptional("triggers")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

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
        fun _triggers(): JsonField<List<EPromptWebhookTrigger>> = triggers

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var excludePrompts: JsonField<MutableList<String>>? = null
            private var headers: JsonValue = JsonMissing.of()
            private var includePrompts: JsonField<MutableList<String>>? = null
            private var triggers: JsonField<MutableList<EPromptWebhookTrigger>>? = null
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                excludePrompts = body.excludePrompts.map { it.toMutableList() }
                headers = body.headers
                includePrompts = body.includePrompts.map { it.toMutableList() }
                triggers = body.triggers.map { it.toMutableList() }
                url = body.url
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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

            fun headers(headers: JsonValue) = apply { this.headers = headers }

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

            fun triggers(triggers: List<EPromptWebhookTrigger>?) =
                triggers(JsonField.ofNullable(triggers))

            /** Alias for calling [Builder.triggers] with `triggers.orElse(null)`. */
            fun triggers(triggers: Optional<List<EPromptWebhookTrigger>>) =
                triggers(triggers.getOrNull())

            /**
             * Sets [Builder.triggers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.triggers] with a well-typed
             * `List<EPromptWebhookTrigger>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun triggers(triggers: JsonField<List<EPromptWebhookTrigger>>) = apply {
                this.triggers = triggers.map { it.toMutableList() }
            }

            /**
             * Adds a single [EPromptWebhookTrigger] to [triggers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTrigger(trigger: EPromptWebhookTrigger) = apply {
                triggers =
                    (triggers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("triggers", it).add(trigger)
                    }
            }

            fun url(url: String?) = url(JsonField.ofNullable(url))

            /** Alias for calling [Builder.url] with `url.orElse(null)`. */
            fun url(url: Optional<String>) = url(url.getOrNull())

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             */
            fun build(): Body =
                Body(
                    (excludePrompts ?: JsonMissing.of()).map { it.toImmutable() },
                    headers,
                    (includePrompts ?: JsonMissing.of()).map { it.toImmutable() },
                    (triggers ?: JsonMissing.of()).map { it.toImmutable() },
                    url,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            excludePrompts()
            includePrompts()
            triggers().ifPresent { it.forEach { it.validate() } }
            url()
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
            (excludePrompts.asKnown().getOrNull()?.size ?: 0) +
                (includePrompts.asKnown().getOrNull()?.size ?: 0) +
                (triggers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                excludePrompts == other.excludePrompts &&
                headers == other.headers &&
                includePrompts == other.includePrompts &&
                triggers == other.triggers &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                excludePrompts,
                headers,
                includePrompts,
                triggers,
                url,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{excludePrompts=$excludePrompts, headers=$headers, includePrompts=$includePrompts, triggers=$triggers, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PromptWebhookUpdateParams &&
            webhookId == other.webhookId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(webhookId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PromptWebhookUpdateParams{webhookId=$webhookId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
