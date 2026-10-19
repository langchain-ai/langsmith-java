// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

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
import com.langchain.smith.core.BaseDeserializer
import com.langchain.smith.core.BaseSerializer
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ProxyConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accessControl: JsonField<AccessControl>,
    private val callbacks: JsonField<List<Callback>>,
    private val description: JsonField<String>,
    private val noProxy: JsonField<List<String>>,
    private val rules: JsonField<List<Rule>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("access_control")
        @ExcludeMissing
        accessControl: JsonField<AccessControl> = JsonMissing.of(),
        @JsonProperty("callbacks")
        @ExcludeMissing
        callbacks: JsonField<List<Callback>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("no_proxy")
        @ExcludeMissing
        noProxy: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("rules") @ExcludeMissing rules: JsonField<List<Rule>> = JsonMissing.of(),
    ) : this(accessControl, callbacks, description, noProxy, rules, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accessControl(): Optional<AccessControl> = accessControl.getOptional("access_control")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callbacks(): Optional<List<Callback>> = callbacks.getOptional("callbacks")

    /**
     * Description says what this configuration as a whole lets the sandbox reach, complementing the
     * per-rule descriptions. At most 1024 characters.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noProxy(): Optional<List<String>> = noProxy.getOptional("no_proxy")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rules(): Optional<List<Rule>> = rules.getOptional("rules")

    /**
     * Returns the raw JSON value of [accessControl].
     *
     * Unlike [accessControl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access_control")
    @ExcludeMissing
    fun _accessControl(): JsonField<AccessControl> = accessControl

    /**
     * Returns the raw JSON value of [callbacks].
     *
     * Unlike [callbacks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callbacks")
    @ExcludeMissing
    fun _callbacks(): JsonField<List<Callback>> = callbacks

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [noProxy].
     *
     * Unlike [noProxy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("no_proxy") @ExcludeMissing fun _noProxy(): JsonField<List<String>> = noProxy

    /**
     * Returns the raw JSON value of [rules].
     *
     * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rules") @ExcludeMissing fun _rules(): JsonField<List<Rule>> = rules

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

        /** Returns a mutable builder for constructing an instance of [ProxyConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProxyConfig]. */
    class Builder internal constructor() {

        private var accessControl: JsonField<AccessControl> = JsonMissing.of()
        private var callbacks: JsonField<MutableList<Callback>>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var noProxy: JsonField<MutableList<String>>? = null
        private var rules: JsonField<MutableList<Rule>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(proxyConfig: ProxyConfig) = apply {
            accessControl = proxyConfig.accessControl
            callbacks = proxyConfig.callbacks.map { it.toMutableList() }
            description = proxyConfig.description
            noProxy = proxyConfig.noProxy.map { it.toMutableList() }
            rules = proxyConfig.rules.map { it.toMutableList() }
            additionalProperties = proxyConfig.additionalProperties.toMutableMap()
        }

        fun accessControl(accessControl: AccessControl) = accessControl(JsonField.of(accessControl))

        /**
         * Sets [Builder.accessControl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessControl] with a well-typed [AccessControl] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accessControl(accessControl: JsonField<AccessControl>) = apply {
            this.accessControl = accessControl
        }

        fun callbacks(callbacks: List<Callback>) = callbacks(JsonField.of(callbacks))

        /**
         * Sets [Builder.callbacks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbacks] with a well-typed `List<Callback>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callbacks(callbacks: JsonField<List<Callback>>) = apply {
            this.callbacks = callbacks.map { it.toMutableList() }
        }

        /**
         * Adds a single [Callback] to [callbacks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCallback(callback: Callback) = apply {
            callbacks =
                (callbacks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("callbacks", it).add(callback)
                }
        }

        /**
         * Description says what this configuration as a whole lets the sandbox reach, complementing
         * the per-rule descriptions. At most 1024 characters.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun noProxy(noProxy: List<String>) = noProxy(JsonField.of(noProxy))

        /**
         * Sets [Builder.noProxy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noProxy] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun noProxy(noProxy: JsonField<List<String>>) = apply {
            this.noProxy = noProxy.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.noProxy].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNoProxy(noProxy: String) = apply {
            this.noProxy =
                (this.noProxy ?: JsonField.of(mutableListOf())).also {
                    checkKnown("noProxy", it).add(noProxy)
                }
        }

        fun rules(rules: List<Rule>) = rules(JsonField.of(rules))

        /**
         * Sets [Builder.rules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rules] with a well-typed `List<Rule>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rules(rules: JsonField<List<Rule>>) = apply {
            this.rules = rules.map { it.toMutableList() }
        }

        /**
         * Adds a single [Rule] to [rules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRule(rule: Rule) = apply {
            rules =
                (rules ?: JsonField.of(mutableListOf())).also { checkKnown("rules", it).add(rule) }
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
         * Returns an immutable instance of [ProxyConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ProxyConfig =
            ProxyConfig(
                accessControl,
                (callbacks ?: JsonMissing.of()).map { it.toImmutable() },
                description,
                (noProxy ?: JsonMissing.of()).map { it.toImmutable() },
                (rules ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): ProxyConfig = apply {
        if (validated) {
            return@apply
        }

        accessControl().ifPresent { it.validate() }
        callbacks().ifPresent { it.forEach { it.validate() } }
        description()
        noProxy()
        rules().ifPresent { it.forEach { it.validate() } }
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
        (accessControl.asKnown().getOrNull()?.validity() ?: 0) +
            (callbacks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (noProxy.asKnown().getOrNull()?.size ?: 0) +
            (rules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class AccessControl
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowList: JsonField<List<String>>,
        private val denyList: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allow_list")
            @ExcludeMissing
            allowList: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("deny_list")
            @ExcludeMissing
            denyList: JsonField<List<String>> = JsonMissing.of(),
        ) : this(allowList, denyList, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun allowList(): Optional<List<String>> = allowList.getOptional("allow_list")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun denyList(): Optional<List<String>> = denyList.getOptional("deny_list")

        /**
         * Returns the raw JSON value of [allowList].
         *
         * Unlike [allowList], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("allow_list")
        @ExcludeMissing
        fun _allowList(): JsonField<List<String>> = allowList

        /**
         * Returns the raw JSON value of [denyList].
         *
         * Unlike [denyList], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deny_list")
        @ExcludeMissing
        fun _denyList(): JsonField<List<String>> = denyList

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

            /** Returns a mutable builder for constructing an instance of [AccessControl]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccessControl]. */
        class Builder internal constructor() {

            private var allowList: JsonField<MutableList<String>>? = null
            private var denyList: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accessControl: AccessControl) = apply {
                allowList = accessControl.allowList.map { it.toMutableList() }
                denyList = accessControl.denyList.map { it.toMutableList() }
                additionalProperties = accessControl.additionalProperties.toMutableMap()
            }

            fun allowList(allowList: List<String>) = allowList(JsonField.of(allowList))

            /**
             * Sets [Builder.allowList] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowList] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allowList(allowList: JsonField<List<String>>) = apply {
                this.allowList = allowList.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.allowList].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowList(allowList: String) = apply {
                this.allowList =
                    (this.allowList ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowList", it).add(allowList)
                    }
            }

            fun denyList(denyList: List<String>) = denyList(JsonField.of(denyList))

            /**
             * Sets [Builder.denyList] to an arbitrary JSON value.
             *
             * You should usually call [Builder.denyList] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun denyList(denyList: JsonField<List<String>>) = apply {
                this.denyList = denyList.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.denyList].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDenyList(denyList: String) = apply {
                this.denyList =
                    (this.denyList ?: JsonField.of(mutableListOf())).also {
                        checkKnown("denyList", it).add(denyList)
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
             * Returns an immutable instance of [AccessControl].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AccessControl =
                AccessControl(
                    (allowList ?: JsonMissing.of()).map { it.toImmutable() },
                    (denyList ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): AccessControl = apply {
            if (validated) {
                return@apply
            }

            allowList()
            denyList()
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
            (allowList.asKnown().getOrNull()?.size ?: 0) +
                (denyList.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccessControl &&
                allowList == other.allowList &&
                denyList == other.denyList &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(allowList, denyList, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccessControl{allowList=$allowList, denyList=$denyList, additionalProperties=$additionalProperties}"
    }

    class Callback
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val matchHosts: JsonField<List<String>>,
        private val ttlSeconds: JsonField<Long>,
        private val url: JsonField<String>,
        private val fullRequest: JsonField<Boolean>,
        private val requestHeaders: JsonField<List<RequestHeader>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("match_hosts")
            @ExcludeMissing
            matchHosts: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("ttl_seconds")
            @ExcludeMissing
            ttlSeconds: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("full_request")
            @ExcludeMissing
            fullRequest: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("request_headers")
            @ExcludeMissing
            requestHeaders: JsonField<List<RequestHeader>> = JsonMissing.of(),
        ) : this(matchHosts, ttlSeconds, url, fullRequest, requestHeaders, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun matchHosts(): List<String> = matchHosts.getRequired("match_hosts")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ttlSeconds(): Long = ttlSeconds.getRequired("ttl_seconds")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fullRequest(): Optional<Boolean> = fullRequest.getOptional("full_request")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun requestHeaders(): Optional<List<RequestHeader>> =
            requestHeaders.getOptional("request_headers")

        /**
         * Returns the raw JSON value of [matchHosts].
         *
         * Unlike [matchHosts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("match_hosts")
        @ExcludeMissing
        fun _matchHosts(): JsonField<List<String>> = matchHosts

        /**
         * Returns the raw JSON value of [ttlSeconds].
         *
         * Unlike [ttlSeconds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ttl_seconds") @ExcludeMissing fun _ttlSeconds(): JsonField<Long> = ttlSeconds

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [fullRequest].
         *
         * Unlike [fullRequest], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("full_request")
        @ExcludeMissing
        fun _fullRequest(): JsonField<Boolean> = fullRequest

        /**
         * Returns the raw JSON value of [requestHeaders].
         *
         * Unlike [requestHeaders], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("request_headers")
        @ExcludeMissing
        fun _requestHeaders(): JsonField<List<RequestHeader>> = requestHeaders

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
             * Returns a mutable builder for constructing an instance of [Callback].
             *
             * The following fields are required:
             * ```java
             * .matchHosts()
             * .ttlSeconds()
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Callback]. */
        class Builder internal constructor() {

            private var matchHosts: JsonField<MutableList<String>>? = null
            private var ttlSeconds: JsonField<Long>? = null
            private var url: JsonField<String>? = null
            private var fullRequest: JsonField<Boolean> = JsonMissing.of()
            private var requestHeaders: JsonField<MutableList<RequestHeader>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(callback: Callback) = apply {
                matchHosts = callback.matchHosts.map { it.toMutableList() }
                ttlSeconds = callback.ttlSeconds
                url = callback.url
                fullRequest = callback.fullRequest
                requestHeaders = callback.requestHeaders.map { it.toMutableList() }
                additionalProperties = callback.additionalProperties.toMutableMap()
            }

            fun matchHosts(matchHosts: List<String>) = matchHosts(JsonField.of(matchHosts))

            /**
             * Sets [Builder.matchHosts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matchHosts] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun matchHosts(matchHosts: JsonField<List<String>>) = apply {
                this.matchHosts = matchHosts.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [matchHosts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMatchHost(matchHost: String) = apply {
                matchHosts =
                    (matchHosts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("matchHosts", it).add(matchHost)
                    }
            }

            fun ttlSeconds(ttlSeconds: Long) = ttlSeconds(JsonField.of(ttlSeconds))

            /**
             * Sets [Builder.ttlSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ttlSeconds] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ttlSeconds(ttlSeconds: JsonField<Long>) = apply { this.ttlSeconds = ttlSeconds }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            fun fullRequest(fullRequest: Boolean) = fullRequest(JsonField.of(fullRequest))

            /**
             * Sets [Builder.fullRequest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fullRequest] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fullRequest(fullRequest: JsonField<Boolean>) = apply {
                this.fullRequest = fullRequest
            }

            fun requestHeaders(requestHeaders: List<RequestHeader>) =
                requestHeaders(JsonField.of(requestHeaders))

            /**
             * Sets [Builder.requestHeaders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestHeaders] with a well-typed
             * `List<RequestHeader>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun requestHeaders(requestHeaders: JsonField<List<RequestHeader>>) = apply {
                this.requestHeaders = requestHeaders.map { it.toMutableList() }
            }

            /**
             * Adds a single [RequestHeader] to [requestHeaders].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRequestHeader(requestHeader: RequestHeader) = apply {
                requestHeaders =
                    (requestHeaders ?: JsonField.of(mutableListOf())).also {
                        checkKnown("requestHeaders", it).add(requestHeader)
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
             * Returns an immutable instance of [Callback].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .matchHosts()
             * .ttlSeconds()
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Callback =
                Callback(
                    checkRequired("matchHosts", matchHosts).map { it.toImmutable() },
                    checkRequired("ttlSeconds", ttlSeconds),
                    checkRequired("url", url),
                    fullRequest,
                    (requestHeaders ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Callback = apply {
            if (validated) {
                return@apply
            }

            matchHosts()
            ttlSeconds()
            url()
            fullRequest()
            requestHeaders().ifPresent { it.forEach { it.validate() } }
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
            (matchHosts.asKnown().getOrNull()?.size ?: 0) +
                (if (ttlSeconds.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0) +
                (if (fullRequest.asKnown().isPresent) 1 else 0) +
                (requestHeaders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class RequestHeader
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val type: JsonField<Type>,
            private val isSet: JsonField<Boolean>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("is_set")
                @ExcludeMissing
                isSet: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(name, type, isSet, value, mutableMapOf())

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun value(): Optional<String> = value.getOptional("value")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [isSet].
             *
             * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                 * Returns a mutable builder for constructing an instance of [RequestHeader].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RequestHeader]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var isSet: JsonField<Boolean> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(requestHeader: RequestHeader) = apply {
                    name = requestHeader.name
                    type = requestHeader.type
                    isSet = requestHeader.isSet
                    value = requestHeader.value
                    additionalProperties = requestHeader.additionalProperties.toMutableMap()
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                /**
                 * Sets [Builder.isSet] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

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
                 * Returns an immutable instance of [RequestHeader].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RequestHeader =
                    RequestHeader(
                        checkRequired("name", name),
                        checkRequired("type", type),
                        isSet,
                        value,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): RequestHeader = apply {
                if (validated) {
                    return@apply
                }

                name()
                type().validate()
                isSet()
                value()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (isSet.asKnown().isPresent) 1 else 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PLAINTEXT = of("plaintext")

                    @JvmField val OPAQUE = of("opaque")

                    @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PLAINTEXT,
                    OPAQUE,
                    WORKSPACE_SECRET,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PLAINTEXT,
                    OPAQUE,
                    WORKSPACE_SECRET,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PLAINTEXT -> Value.PLAINTEXT
                        OPAQUE -> Value.OPAQUE
                        WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PLAINTEXT -> Known.PLAINTEXT
                        OPAQUE -> Known.OPAQUE
                        WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                        else -> throw LangChainInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
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
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RequestHeader &&
                    name == other.name &&
                    type == other.type &&
                    isSet == other.isSet &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(name, type, isSet, value, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RequestHeader{name=$name, type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Callback &&
                matchHosts == other.matchHosts &&
                ttlSeconds == other.ttlSeconds &&
                url == other.url &&
                fullRequest == other.fullRequest &&
                requestHeaders == other.requestHeaders &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                matchHosts,
                ttlSeconds,
                url,
                fullRequest,
                requestHeaders,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Callback{matchHosts=$matchHosts, ttlSeconds=$ttlSeconds, url=$url, fullRequest=$fullRequest, requestHeaders=$requestHeaders, additionalProperties=$additionalProperties}"
    }

    class Rule
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val aws: JsonField<Aws>,
        private val azure: JsonField<Azure>,
        private val description: JsonField<String>,
        private val enabled: JsonField<Boolean>,
        private val envVars: JsonField<EnvVars>,
        private val gcp: JsonField<Gcp>,
        private val headers: JsonField<List<Header>>,
        private val matchHeaders: JsonField<List<String>>,
        private val matchHosts: JsonField<List<String>>,
        private val matchPaths: JsonField<List<String>>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws") @ExcludeMissing aws: JsonField<Aws> = JsonMissing.of(),
            @JsonProperty("azure") @ExcludeMissing azure: JsonField<Azure> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("env_vars")
            @ExcludeMissing
            envVars: JsonField<EnvVars> = JsonMissing.of(),
            @JsonProperty("gcp") @ExcludeMissing gcp: JsonField<Gcp> = JsonMissing.of(),
            @JsonProperty("headers")
            @ExcludeMissing
            headers: JsonField<List<Header>> = JsonMissing.of(),
            @JsonProperty("match_headers")
            @ExcludeMissing
            matchHeaders: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("match_hosts")
            @ExcludeMissing
            matchHosts: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("match_paths")
            @ExcludeMissing
            matchPaths: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(
            name,
            aws,
            azure,
            description,
            enabled,
            envVars,
            gcp,
            headers,
            matchHeaders,
            matchHosts,
            matchPaths,
            type,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun aws(): Optional<Aws> = aws.getOptional("aws")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun azure(): Optional<Azure> = azure.getOptional("azure")

        /**
         * Description says what this rule lets the sandbox reach, so an agent driving the sandbox
         * can be told its capabilities. At most 1024 characters.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

        /**
         * EnvVars are plaintext env vars set for every command in the sandbox while this rule is
         * enabled. Use them for tools that refuse to run unless a credential env var is present
         * (e.g. gh needs GH_TOKEN) even though this rule injects the real credential on the wire —
         * set a dummy value here so the command starts. Explicit per-sandbox env_vars win over
         * these, and provider-managed (AWS/GCP) vars win over both.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun envVars(): Optional<EnvVars> = envVars.getOptional("env_vars")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gcp(): Optional<Gcp> = gcp.getOptional("gcp")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun headers(): Optional<List<Header>> = headers.getOptional("headers")

        /**
         * MatchHeaders restricts a header injection rule to requests carrying every listed header,
         * each written "name: value" with a lowercase name and an exact value. Pair with headers of
         * the same name to swap a placeholder the sandbox sends (e.g. "authorization: Bearer
         * account-b") for a real credential, so one host can serve several accounts. Rules are
         * evaluated in order and the first match wins.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun matchHeaders(): Optional<List<String>> = matchHeaders.getOptional("match_headers")

        /**
         * MatchHosts is only accepted for header injection rules. Provider auth rules use built-in
         * host matching.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun matchHosts(): Optional<List<String>> = matchHosts.getOptional("match_hosts")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun matchPaths(): Optional<List<String>> = matchPaths.getOptional("match_paths")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [aws].
         *
         * Unlike [aws], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aws") @ExcludeMissing fun _aws(): JsonField<Aws> = aws

        /**
         * Returns the raw JSON value of [azure].
         *
         * Unlike [azure], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("azure") @ExcludeMissing fun _azure(): JsonField<Azure> = azure

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [envVars].
         *
         * Unlike [envVars], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("env_vars") @ExcludeMissing fun _envVars(): JsonField<EnvVars> = envVars

        /**
         * Returns the raw JSON value of [gcp].
         *
         * Unlike [gcp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gcp") @ExcludeMissing fun _gcp(): JsonField<Gcp> = gcp

        /**
         * Returns the raw JSON value of [headers].
         *
         * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<List<Header>> = headers

        /**
         * Returns the raw JSON value of [matchHeaders].
         *
         * Unlike [matchHeaders], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("match_headers")
        @ExcludeMissing
        fun _matchHeaders(): JsonField<List<String>> = matchHeaders

        /**
         * Returns the raw JSON value of [matchHosts].
         *
         * Unlike [matchHosts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("match_hosts")
        @ExcludeMissing
        fun _matchHosts(): JsonField<List<String>> = matchHosts

        /**
         * Returns the raw JSON value of [matchPaths].
         *
         * Unlike [matchPaths], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("match_paths")
        @ExcludeMissing
        fun _matchPaths(): JsonField<List<String>> = matchPaths

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
             * Returns a mutable builder for constructing an instance of [Rule].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Rule]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var aws: JsonField<Aws> = JsonMissing.of()
            private var azure: JsonField<Azure> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var enabled: JsonField<Boolean> = JsonMissing.of()
            private var envVars: JsonField<EnvVars> = JsonMissing.of()
            private var gcp: JsonField<Gcp> = JsonMissing.of()
            private var headers: JsonField<MutableList<Header>>? = null
            private var matchHeaders: JsonField<MutableList<String>>? = null
            private var matchHosts: JsonField<MutableList<String>>? = null
            private var matchPaths: JsonField<MutableList<String>>? = null
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rule: Rule) = apply {
                name = rule.name
                aws = rule.aws
                azure = rule.azure
                description = rule.description
                enabled = rule.enabled
                envVars = rule.envVars
                gcp = rule.gcp
                headers = rule.headers.map { it.toMutableList() }
                matchHeaders = rule.matchHeaders.map { it.toMutableList() }
                matchHosts = rule.matchHosts.map { it.toMutableList() }
                matchPaths = rule.matchPaths.map { it.toMutableList() }
                type = rule.type
                additionalProperties = rule.additionalProperties.toMutableMap()
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

            fun aws(aws: Aws) = aws(JsonField.of(aws))

            /**
             * Sets [Builder.aws] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aws] with a well-typed [Aws] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun aws(aws: JsonField<Aws>) = apply { this.aws = aws }

            /**
             * Alias for calling [aws] with
             * `Aws.ofSandboxesProxyAwsRoleConfig(sandboxesProxyAwsRoleConfig)`.
             */
            fun aws(sandboxesProxyAwsRoleConfig: Aws.SandboxesProxyAwsRoleConfig) =
                aws(Aws.ofSandboxesProxyAwsRoleConfig(sandboxesProxyAwsRoleConfig))

            /**
             * Alias for calling [aws] with
             * `Aws.ofSandboxesProxyAwsStaticConfig(sandboxesProxyAwsStaticConfig)`.
             */
            fun aws(sandboxesProxyAwsStaticConfig: Aws.SandboxesProxyAwsStaticConfig) =
                aws(Aws.ofSandboxesProxyAwsStaticConfig(sandboxesProxyAwsStaticConfig))

            fun azure(azure: Azure) = azure(JsonField.of(azure))

            /**
             * Sets [Builder.azure] to an arbitrary JSON value.
             *
             * You should usually call [Builder.azure] with a well-typed [Azure] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun azure(azure: JsonField<Azure>) = apply { this.azure = azure }

            /**
             * Alias for calling [azure] with
             * `Azure.ofSandboxesProxyAzureWorkloadIdentityConfig(sandboxesProxyAzureWorkloadIdentityConfig)`.
             */
            fun azure(
                sandboxesProxyAzureWorkloadIdentityConfig:
                    Azure.SandboxesProxyAzureWorkloadIdentityConfig
            ) =
                azure(
                    Azure.ofSandboxesProxyAzureWorkloadIdentityConfig(
                        sandboxesProxyAzureWorkloadIdentityConfig
                    )
                )

            /**
             * Alias for calling [azure] with
             * `Azure.ofSandboxesProxyAzureAccountKeyConfig(sandboxesProxyAzureAccountKeyConfig)`.
             */
            fun azure(
                sandboxesProxyAzureAccountKeyConfig: Azure.SandboxesProxyAzureAccountKeyConfig
            ) =
                azure(
                    Azure.ofSandboxesProxyAzureAccountKeyConfig(sandboxesProxyAzureAccountKeyConfig)
                )

            /**
             * Alias for calling [azure] with
             * `Azure.ofSandboxesProxyAzureSasConfig(sandboxesProxyAzureSasConfig)`.
             */
            fun azure(sandboxesProxyAzureSasConfig: Azure.SandboxesProxyAzureSasConfig) =
                azure(Azure.ofSandboxesProxyAzureSasConfig(sandboxesProxyAzureSasConfig))

            /**
             * Description says what this rule lets the sandbox reach, so an agent driving the
             * sandbox can be told its capabilities. At most 1024 characters.
             */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            /**
             * EnvVars are plaintext env vars set for every command in the sandbox while this rule
             * is enabled. Use them for tools that refuse to run unless a credential env var is
             * present (e.g. gh needs GH_TOKEN) even though this rule injects the real credential on
             * the wire — set a dummy value here so the command starts. Explicit per-sandbox
             * env_vars win over these, and provider-managed (AWS/GCP) vars win over both.
             */
            fun envVars(envVars: EnvVars) = envVars(JsonField.of(envVars))

            /**
             * Sets [Builder.envVars] to an arbitrary JSON value.
             *
             * You should usually call [Builder.envVars] with a well-typed [EnvVars] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun envVars(envVars: JsonField<EnvVars>) = apply { this.envVars = envVars }

            fun gcp(gcp: Gcp) = gcp(JsonField.of(gcp))

            /**
             * Sets [Builder.gcp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gcp] with a well-typed [Gcp] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun gcp(gcp: JsonField<Gcp>) = apply { this.gcp = gcp }

            /**
             * Alias for calling [gcp] with
             * `Gcp.ofSandboxesProxyGcpWorkloadIdentityConfig(sandboxesProxyGcpWorkloadIdentityConfig)`.
             */
            fun gcp(
                sandboxesProxyGcpWorkloadIdentityConfig: Gcp.SandboxesProxyGcpWorkloadIdentityConfig
            ) =
                gcp(
                    Gcp.ofSandboxesProxyGcpWorkloadIdentityConfig(
                        sandboxesProxyGcpWorkloadIdentityConfig
                    )
                )

            /**
             * Alias for calling [gcp] with
             * `Gcp.ofSandboxesProxyGcpServiceAccountConfig(sandboxesProxyGcpServiceAccountConfig)`.
             */
            fun gcp(
                sandboxesProxyGcpServiceAccountConfig: Gcp.SandboxesProxyGcpServiceAccountConfig
            ) =
                gcp(
                    Gcp.ofSandboxesProxyGcpServiceAccountConfig(
                        sandboxesProxyGcpServiceAccountConfig
                    )
                )

            fun headers(headers: List<Header>) = headers(JsonField.of(headers))

            /**
             * Sets [Builder.headers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headers] with a well-typed `List<Header>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headers(headers: JsonField<List<Header>>) = apply {
                this.headers = headers.map { it.toMutableList() }
            }

            /**
             * Adds a single [Header] to [headers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addHeader(header: Header) = apply {
                headers =
                    (headers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("headers", it).add(header)
                    }
            }

            /**
             * MatchHeaders restricts a header injection rule to requests carrying every listed
             * header, each written "name: value" with a lowercase name and an exact value. Pair
             * with headers of the same name to swap a placeholder the sandbox sends (e.g.
             * "authorization: Bearer account-b") for a real credential, so one host can serve
             * several accounts. Rules are evaluated in order and the first match wins.
             */
            fun matchHeaders(matchHeaders: List<String>) = matchHeaders(JsonField.of(matchHeaders))

            /**
             * Sets [Builder.matchHeaders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matchHeaders] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun matchHeaders(matchHeaders: JsonField<List<String>>) = apply {
                this.matchHeaders = matchHeaders.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [matchHeaders].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMatchHeader(matchHeader: String) = apply {
                matchHeaders =
                    (matchHeaders ?: JsonField.of(mutableListOf())).also {
                        checkKnown("matchHeaders", it).add(matchHeader)
                    }
            }

            /**
             * MatchHosts is only accepted for header injection rules. Provider auth rules use
             * built-in host matching.
             */
            fun matchHosts(matchHosts: List<String>) = matchHosts(JsonField.of(matchHosts))

            /**
             * Sets [Builder.matchHosts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matchHosts] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun matchHosts(matchHosts: JsonField<List<String>>) = apply {
                this.matchHosts = matchHosts.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [matchHosts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMatchHost(matchHost: String) = apply {
                matchHosts =
                    (matchHosts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("matchHosts", it).add(matchHost)
                    }
            }

            fun matchPaths(matchPaths: List<String>) = matchPaths(JsonField.of(matchPaths))

            /**
             * Sets [Builder.matchPaths] to an arbitrary JSON value.
             *
             * You should usually call [Builder.matchPaths] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun matchPaths(matchPaths: JsonField<List<String>>) = apply {
                this.matchPaths = matchPaths.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [matchPaths].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMatchPath(matchPath: String) = apply {
                matchPaths =
                    (matchPaths ?: JsonField.of(mutableListOf())).also {
                        checkKnown("matchPaths", it).add(matchPath)
                    }
            }

            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [Rule].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Rule =
                Rule(
                    checkRequired("name", name),
                    aws,
                    azure,
                    description,
                    enabled,
                    envVars,
                    gcp,
                    (headers ?: JsonMissing.of()).map { it.toImmutable() },
                    (matchHeaders ?: JsonMissing.of()).map { it.toImmutable() },
                    (matchHosts ?: JsonMissing.of()).map { it.toImmutable() },
                    (matchPaths ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
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
        fun validate(): Rule = apply {
            if (validated) {
                return@apply
            }

            name()
            aws().ifPresent { it.validate() }
            azure().ifPresent { it.validate() }
            description()
            enabled()
            envVars().ifPresent { it.validate() }
            gcp().ifPresent { it.validate() }
            headers().ifPresent { it.forEach { it.validate() } }
            matchHeaders()
            matchHosts()
            matchPaths()
            type()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (aws.asKnown().getOrNull()?.validity() ?: 0) +
                (azure.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (enabled.asKnown().isPresent) 1 else 0) +
                (envVars.asKnown().getOrNull()?.validity() ?: 0) +
                (gcp.asKnown().getOrNull()?.validity() ?: 0) +
                (headers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (matchHeaders.asKnown().getOrNull()?.size ?: 0) +
                (matchHosts.asKnown().getOrNull()?.size ?: 0) +
                (matchPaths.asKnown().getOrNull()?.size ?: 0) +
                (if (type.asKnown().isPresent) 1 else 0)

        @JsonDeserialize(using = Aws.Deserializer::class)
        @JsonSerialize(using = Aws.Serializer::class)
        class Aws
        private constructor(
            private val sandboxesProxyAwsRoleConfig: SandboxesProxyAwsRoleConfig? = null,
            private val sandboxesProxyAwsStaticConfig: SandboxesProxyAwsStaticConfig? = null,
            private val _json: JsonValue? = null,
        ) {

            fun sandboxesProxyAwsRoleConfig(): Optional<SandboxesProxyAwsRoleConfig> =
                Optional.ofNullable(sandboxesProxyAwsRoleConfig)

            fun sandboxesProxyAwsStaticConfig(): Optional<SandboxesProxyAwsStaticConfig> =
                Optional.ofNullable(sandboxesProxyAwsStaticConfig)

            fun isSandboxesProxyAwsRoleConfig(): Boolean = sandboxesProxyAwsRoleConfig != null

            fun isSandboxesProxyAwsStaticConfig(): Boolean = sandboxesProxyAwsStaticConfig != null

            fun asSandboxesProxyAwsRoleConfig(): SandboxesProxyAwsRoleConfig =
                sandboxesProxyAwsRoleConfig.getOrThrow("sandboxesProxyAwsRoleConfig")

            fun asSandboxesProxyAwsStaticConfig(): SandboxesProxyAwsStaticConfig =
                sandboxesProxyAwsStaticConfig.getOrThrow("sandboxesProxyAwsStaticConfig")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.langchain.smith.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = aws.accept(new Aws.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitSandboxesProxyAwsRoleConfig(SandboxesProxyAwsRoleConfig sandboxesProxyAwsRoleConfig) {
             *         return Optional.of(sandboxesProxyAwsRoleConfig.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws LangChainInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    sandboxesProxyAwsRoleConfig != null ->
                        visitor.visitSandboxesProxyAwsRoleConfig(sandboxesProxyAwsRoleConfig)
                    sandboxesProxyAwsStaticConfig != null ->
                        visitor.visitSandboxesProxyAwsStaticConfig(sandboxesProxyAwsStaticConfig)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Aws = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitSandboxesProxyAwsRoleConfig(
                            sandboxesProxyAwsRoleConfig: SandboxesProxyAwsRoleConfig
                        ) {
                            sandboxesProxyAwsRoleConfig.validate()
                        }

                        override fun visitSandboxesProxyAwsStaticConfig(
                            sandboxesProxyAwsStaticConfig: SandboxesProxyAwsStaticConfig
                        ) {
                            sandboxesProxyAwsStaticConfig.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitSandboxesProxyAwsRoleConfig(
                            sandboxesProxyAwsRoleConfig: SandboxesProxyAwsRoleConfig
                        ) = sandboxesProxyAwsRoleConfig.validity()

                        override fun visitSandboxesProxyAwsStaticConfig(
                            sandboxesProxyAwsStaticConfig: SandboxesProxyAwsStaticConfig
                        ) = sandboxesProxyAwsStaticConfig.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Aws &&
                    sandboxesProxyAwsRoleConfig == other.sandboxesProxyAwsRoleConfig &&
                    sandboxesProxyAwsStaticConfig == other.sandboxesProxyAwsStaticConfig
            }

            override fun hashCode(): Int =
                Objects.hash(sandboxesProxyAwsRoleConfig, sandboxesProxyAwsStaticConfig)

            override fun toString(): String =
                when {
                    sandboxesProxyAwsRoleConfig != null ->
                        "Aws{sandboxesProxyAwsRoleConfig=$sandboxesProxyAwsRoleConfig}"
                    sandboxesProxyAwsStaticConfig != null ->
                        "Aws{sandboxesProxyAwsStaticConfig=$sandboxesProxyAwsStaticConfig}"
                    _json != null -> "Aws{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Aws")
                }

            companion object {

                @JvmStatic
                fun ofSandboxesProxyAwsRoleConfig(
                    sandboxesProxyAwsRoleConfig: SandboxesProxyAwsRoleConfig
                ) = Aws(sandboxesProxyAwsRoleConfig = sandboxesProxyAwsRoleConfig)

                @JvmStatic
                fun ofSandboxesProxyAwsStaticConfig(
                    sandboxesProxyAwsStaticConfig: SandboxesProxyAwsStaticConfig
                ) = Aws(sandboxesProxyAwsStaticConfig = sandboxesProxyAwsStaticConfig)
            }

            /**
             * An interface that defines how to map each variant of [Aws] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitSandboxesProxyAwsRoleConfig(
                    sandboxesProxyAwsRoleConfig: SandboxesProxyAwsRoleConfig
                ): T

                fun visitSandboxesProxyAwsStaticConfig(
                    sandboxesProxyAwsStaticConfig: SandboxesProxyAwsStaticConfig
                ): T

                /**
                 * Maps an unknown variant of [Aws] to a value of type [T].
                 *
                 * An instance of [Aws] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws LangChainInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LangChainInvalidDataException("Unknown Aws: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Aws>(Aws::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Aws {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<SandboxesProxyAwsRoleConfig>())
                                    ?.let { Aws(sandboxesProxyAwsRoleConfig = it, _json = json) },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<SandboxesProxyAwsStaticConfig>(),
                                    )
                                    ?.let { Aws(sandboxesProxyAwsStaticConfig = it, _json = json) },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Aws(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Aws>(Aws::class) {

                override fun serialize(
                    value: Aws,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.sandboxesProxyAwsRoleConfig != null ->
                            generator.writeObject(value.sandboxesProxyAwsRoleConfig)
                        value.sandboxesProxyAwsStaticConfig != null ->
                            generator.writeObject(value.sandboxesProxyAwsStaticConfig)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Aws")
                    }
                }
            }

            class SandboxesProxyAwsRoleConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val roleArn: JsonField<String>,
                private val subjectScope: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("role_arn")
                    @ExcludeMissing
                    roleArn: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("subject_scope")
                    @ExcludeMissing
                    subjectScope: JsonField<String> = JsonMissing.of(),
                ) : this(roleArn, subjectScope, mutableMapOf())

                /**
                 * IAM role to assume with AssumeRoleWithWebIdentity, using a short-lived OIDC token
                 * LangSmith signs for this workspace. The role's trust policy must trust
                 * LangSmith's issuer for the token subject. Credentials renew automatically, and
                 * access follows the role's effective AWS permissions. Mutually exclusive with
                 * static keys, and cannot be changed after creation.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun roleArn(): String = roleArn.getRequired("role_arn")

                /**
                 * SubjectScope picks the token subject the role trusts: "workspace" (the default)
                 * or "tag:<tag value id>", which must be one of the sandbox's tag_value_ids. Only
                 * valid with role_arn.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun subjectScope(): Optional<String> = subjectScope.getOptional("subject_scope")

                /**
                 * Returns the raw JSON value of [roleArn].
                 *
                 * Unlike [roleArn], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("role_arn")
                @ExcludeMissing
                fun _roleArn(): JsonField<String> = roleArn

                /**
                 * Returns the raw JSON value of [subjectScope].
                 *
                 * Unlike [subjectScope], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("subject_scope")
                @ExcludeMissing
                fun _subjectScope(): JsonField<String> = subjectScope

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
                     * [SandboxesProxyAwsRoleConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .roleArn()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxesProxyAwsRoleConfig]. */
                class Builder internal constructor() {

                    private var roleArn: JsonField<String>? = null
                    private var subjectScope: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(sandboxesProxyAwsRoleConfig: SandboxesProxyAwsRoleConfig) =
                        apply {
                            roleArn = sandboxesProxyAwsRoleConfig.roleArn
                            subjectScope = sandboxesProxyAwsRoleConfig.subjectScope
                            additionalProperties =
                                sandboxesProxyAwsRoleConfig.additionalProperties.toMutableMap()
                        }

                    /**
                     * IAM role to assume with AssumeRoleWithWebIdentity, using a short-lived OIDC
                     * token LangSmith signs for this workspace. The role's trust policy must trust
                     * LangSmith's issuer for the token subject. Credentials renew automatically,
                     * and access follows the role's effective AWS permissions. Mutually exclusive
                     * with static keys, and cannot be changed after creation.
                     */
                    fun roleArn(roleArn: String) = roleArn(JsonField.of(roleArn))

                    /**
                     * Sets [Builder.roleArn] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.roleArn] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun roleArn(roleArn: JsonField<String>) = apply { this.roleArn = roleArn }

                    /**
                     * SubjectScope picks the token subject the role trusts: "workspace" (the
                     * default) or "tag:<tag value id>", which must be one of the sandbox's
                     * tag_value_ids. Only valid with role_arn.
                     */
                    fun subjectScope(subjectScope: String) =
                        subjectScope(JsonField.of(subjectScope))

                    /**
                     * Sets [Builder.subjectScope] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subjectScope] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun subjectScope(subjectScope: JsonField<String>) = apply {
                        this.subjectScope = subjectScope
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
                     * Returns an immutable instance of [SandboxesProxyAwsRoleConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .roleArn()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxesProxyAwsRoleConfig =
                        SandboxesProxyAwsRoleConfig(
                            checkRequired("roleArn", roleArn),
                            subjectScope,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxesProxyAwsRoleConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    roleArn()
                    subjectScope()
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
                    (if (roleArn.asKnown().isPresent) 1 else 0) +
                        (if (subjectScope.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxesProxyAwsRoleConfig &&
                        roleArn == other.roleArn &&
                        subjectScope == other.subjectScope &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(roleArn, subjectScope, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxesProxyAwsRoleConfig{roleArn=$roleArn, subjectScope=$subjectScope, additionalProperties=$additionalProperties}"
            }

            class SandboxesProxyAwsStaticConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val accessKeyId: JsonField<AccessKeyId>,
                private val secretAccessKey: JsonField<SecretAccessKey>,
                private val roleArn: JsonField<RoleArn>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("access_key_id")
                    @ExcludeMissing
                    accessKeyId: JsonField<AccessKeyId> = JsonMissing.of(),
                    @JsonProperty("secret_access_key")
                    @ExcludeMissing
                    secretAccessKey: JsonField<SecretAccessKey> = JsonMissing.of(),
                    @JsonProperty("role_arn")
                    @ExcludeMissing
                    roleArn: JsonField<RoleArn> = JsonMissing.of(),
                ) : this(accessKeyId, secretAccessKey, roleArn, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun accessKeyId(): AccessKeyId = accessKeyId.getRequired("access_key_id")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun secretAccessKey(): SecretAccessKey =
                    secretAccessKey.getRequired("secret_access_key")

                /**
                 * IAM role to assume with AssumeRoleWithWebIdentity, using a short-lived OIDC token
                 * LangSmith signs for this workspace. The role's trust policy must trust
                 * LangSmith's issuer for the token subject. Credentials renew automatically, and
                 * access follows the role's effective AWS permissions. Mutually exclusive with
                 * static keys, and cannot be changed after creation.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun roleArn(): Optional<RoleArn> = roleArn.getOptional("role_arn")

                /**
                 * Returns the raw JSON value of [accessKeyId].
                 *
                 * Unlike [accessKeyId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("access_key_id")
                @ExcludeMissing
                fun _accessKeyId(): JsonField<AccessKeyId> = accessKeyId

                /**
                 * Returns the raw JSON value of [secretAccessKey].
                 *
                 * Unlike [secretAccessKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("secret_access_key")
                @ExcludeMissing
                fun _secretAccessKey(): JsonField<SecretAccessKey> = secretAccessKey

                /**
                 * Returns the raw JSON value of [roleArn].
                 *
                 * Unlike [roleArn], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("role_arn")
                @ExcludeMissing
                fun _roleArn(): JsonField<RoleArn> = roleArn

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
                     * [SandboxesProxyAwsStaticConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .accessKeyId()
                     * .secretAccessKey()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxesProxyAwsStaticConfig]. */
                class Builder internal constructor() {

                    private var accessKeyId: JsonField<AccessKeyId>? = null
                    private var secretAccessKey: JsonField<SecretAccessKey>? = null
                    private var roleArn: JsonField<RoleArn> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        sandboxesProxyAwsStaticConfig: SandboxesProxyAwsStaticConfig
                    ) = apply {
                        accessKeyId = sandboxesProxyAwsStaticConfig.accessKeyId
                        secretAccessKey = sandboxesProxyAwsStaticConfig.secretAccessKey
                        roleArn = sandboxesProxyAwsStaticConfig.roleArn
                        additionalProperties =
                            sandboxesProxyAwsStaticConfig.additionalProperties.toMutableMap()
                    }

                    fun accessKeyId(accessKeyId: AccessKeyId) =
                        accessKeyId(JsonField.of(accessKeyId))

                    /**
                     * Sets [Builder.accessKeyId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accessKeyId] with a well-typed [AccessKeyId]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accessKeyId(accessKeyId: JsonField<AccessKeyId>) = apply {
                        this.accessKeyId = accessKeyId
                    }

                    fun secretAccessKey(secretAccessKey: SecretAccessKey) =
                        secretAccessKey(JsonField.of(secretAccessKey))

                    /**
                     * Sets [Builder.secretAccessKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.secretAccessKey] with a well-typed
                     * [SecretAccessKey] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun secretAccessKey(secretAccessKey: JsonField<SecretAccessKey>) = apply {
                        this.secretAccessKey = secretAccessKey
                    }

                    /**
                     * IAM role to assume with AssumeRoleWithWebIdentity, using a short-lived OIDC
                     * token LangSmith signs for this workspace. The role's trust policy must trust
                     * LangSmith's issuer for the token subject. Credentials renew automatically,
                     * and access follows the role's effective AWS permissions. Mutually exclusive
                     * with static keys, and cannot be changed after creation.
                     */
                    fun roleArn(roleArn: RoleArn) = roleArn(JsonField.of(roleArn))

                    /**
                     * Sets [Builder.roleArn] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.roleArn] with a well-typed [RoleArn] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun roleArn(roleArn: JsonField<RoleArn>) = apply { this.roleArn = roleArn }

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
                     * Returns an immutable instance of [SandboxesProxyAwsStaticConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .accessKeyId()
                     * .secretAccessKey()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxesProxyAwsStaticConfig =
                        SandboxesProxyAwsStaticConfig(
                            checkRequired("accessKeyId", accessKeyId),
                            checkRequired("secretAccessKey", secretAccessKey),
                            roleArn,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxesProxyAwsStaticConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    accessKeyId().validate()
                    secretAccessKey().validate()
                    roleArn().ifPresent { it.validate() }
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
                    (accessKeyId.asKnown().getOrNull()?.validity() ?: 0) +
                        (secretAccessKey.asKnown().getOrNull()?.validity() ?: 0) +
                        (roleArn.asKnown().getOrNull()?.validity() ?: 0)

                class AccessKeyId
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                         * Returns a mutable builder for constructing an instance of [AccessKeyId].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [AccessKeyId]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(accessKeyId: AccessKeyId) = apply {
                            type = accessKeyId.type
                            isSet = accessKeyId.isSet
                            value = accessKeyId.value
                            additionalProperties = accessKeyId.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [AccessKeyId].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): AccessKeyId =
                            AccessKeyId(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): AccessKeyId = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
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
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AccessKeyId &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AccessKeyId{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                class SecretAccessKey
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                         * [SecretAccessKey].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SecretAccessKey]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(secretAccessKey: SecretAccessKey) = apply {
                            type = secretAccessKey.type
                            isSet = secretAccessKey.isSet
                            value = secretAccessKey.value
                            additionalProperties =
                                secretAccessKey.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SecretAccessKey].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): SecretAccessKey =
                            SecretAccessKey(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): SecretAccessKey = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
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
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SecretAccessKey &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SecretAccessKey{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                /**
                 * IAM role to assume with AssumeRoleWithWebIdentity, using a short-lived OIDC token
                 * LangSmith signs for this workspace. The role's trust policy must trust
                 * LangSmith's issuer for the token subject. Credentials renew automatically, and
                 * access follows the role's effective AWS permissions. Mutually exclusive with
                 * static keys, and cannot be changed after creation.
                 */
                class RoleArn
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val EMPTY = of("")

                        @JvmStatic fun of(value: String) = RoleArn(JsonField.of(value))
                    }

                    /** An enum containing [RoleArn]'s known values. */
                    enum class Known {
                        EMPTY
                    }

                    /**
                     * An enum containing [RoleArn]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [RoleArn] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        EMPTY,
                        /**
                         * An enum member indicating that [RoleArn] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            EMPTY -> Value.EMPTY
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            EMPTY -> Known.EMPTY
                            else -> throw LangChainInvalidDataException("Unknown RoleArn: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LangChainInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): RoleArn = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is RoleArn && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxesProxyAwsStaticConfig &&
                        accessKeyId == other.accessKeyId &&
                        secretAccessKey == other.secretAccessKey &&
                        roleArn == other.roleArn &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(accessKeyId, secretAccessKey, roleArn, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxesProxyAwsStaticConfig{accessKeyId=$accessKeyId, secretAccessKey=$secretAccessKey, roleArn=$roleArn, additionalProperties=$additionalProperties}"
            }
        }

        @JsonDeserialize(using = Azure.Deserializer::class)
        @JsonSerialize(using = Azure.Serializer::class)
        class Azure
        private constructor(
            private val sandboxesProxyAzureWorkloadIdentityConfig:
                SandboxesProxyAzureWorkloadIdentityConfig? =
                null,
            private val sandboxesProxyAzureAccountKeyConfig: SandboxesProxyAzureAccountKeyConfig? =
                null,
            private val sandboxesProxyAzureSasConfig: SandboxesProxyAzureSasConfig? = null,
            private val _json: JsonValue? = null,
        ) {

            fun sandboxesProxyAzureWorkloadIdentityConfig():
                Optional<SandboxesProxyAzureWorkloadIdentityConfig> =
                Optional.ofNullable(sandboxesProxyAzureWorkloadIdentityConfig)

            fun sandboxesProxyAzureAccountKeyConfig():
                Optional<SandboxesProxyAzureAccountKeyConfig> =
                Optional.ofNullable(sandboxesProxyAzureAccountKeyConfig)

            fun sandboxesProxyAzureSasConfig(): Optional<SandboxesProxyAzureSasConfig> =
                Optional.ofNullable(sandboxesProxyAzureSasConfig)

            fun isSandboxesProxyAzureWorkloadIdentityConfig(): Boolean =
                sandboxesProxyAzureWorkloadIdentityConfig != null

            fun isSandboxesProxyAzureAccountKeyConfig(): Boolean =
                sandboxesProxyAzureAccountKeyConfig != null

            fun isSandboxesProxyAzureSasConfig(): Boolean = sandboxesProxyAzureSasConfig != null

            fun asSandboxesProxyAzureWorkloadIdentityConfig():
                SandboxesProxyAzureWorkloadIdentityConfig =
                sandboxesProxyAzureWorkloadIdentityConfig.getOrThrow(
                    "sandboxesProxyAzureWorkloadIdentityConfig"
                )

            fun asSandboxesProxyAzureAccountKeyConfig(): SandboxesProxyAzureAccountKeyConfig =
                sandboxesProxyAzureAccountKeyConfig.getOrThrow(
                    "sandboxesProxyAzureAccountKeyConfig"
                )

            fun asSandboxesProxyAzureSasConfig(): SandboxesProxyAzureSasConfig =
                sandboxesProxyAzureSasConfig.getOrThrow("sandboxesProxyAzureSasConfig")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.langchain.smith.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = azure.accept(new Azure.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitSandboxesProxyAzureWorkloadIdentityConfig(SandboxesProxyAzureWorkloadIdentityConfig sandboxesProxyAzureWorkloadIdentityConfig) {
             *         return Optional.of(sandboxesProxyAzureWorkloadIdentityConfig.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws LangChainInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    sandboxesProxyAzureWorkloadIdentityConfig != null ->
                        visitor.visitSandboxesProxyAzureWorkloadIdentityConfig(
                            sandboxesProxyAzureWorkloadIdentityConfig
                        )
                    sandboxesProxyAzureAccountKeyConfig != null ->
                        visitor.visitSandboxesProxyAzureAccountKeyConfig(
                            sandboxesProxyAzureAccountKeyConfig
                        )
                    sandboxesProxyAzureSasConfig != null ->
                        visitor.visitSandboxesProxyAzureSasConfig(sandboxesProxyAzureSasConfig)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Azure = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitSandboxesProxyAzureWorkloadIdentityConfig(
                            sandboxesProxyAzureWorkloadIdentityConfig:
                                SandboxesProxyAzureWorkloadIdentityConfig
                        ) {
                            sandboxesProxyAzureWorkloadIdentityConfig.validate()
                        }

                        override fun visitSandboxesProxyAzureAccountKeyConfig(
                            sandboxesProxyAzureAccountKeyConfig: SandboxesProxyAzureAccountKeyConfig
                        ) {
                            sandboxesProxyAzureAccountKeyConfig.validate()
                        }

                        override fun visitSandboxesProxyAzureSasConfig(
                            sandboxesProxyAzureSasConfig: SandboxesProxyAzureSasConfig
                        ) {
                            sandboxesProxyAzureSasConfig.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitSandboxesProxyAzureWorkloadIdentityConfig(
                            sandboxesProxyAzureWorkloadIdentityConfig:
                                SandboxesProxyAzureWorkloadIdentityConfig
                        ) = sandboxesProxyAzureWorkloadIdentityConfig.validity()

                        override fun visitSandboxesProxyAzureAccountKeyConfig(
                            sandboxesProxyAzureAccountKeyConfig: SandboxesProxyAzureAccountKeyConfig
                        ) = sandboxesProxyAzureAccountKeyConfig.validity()

                        override fun visitSandboxesProxyAzureSasConfig(
                            sandboxesProxyAzureSasConfig: SandboxesProxyAzureSasConfig
                        ) = sandboxesProxyAzureSasConfig.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Azure &&
                    sandboxesProxyAzureWorkloadIdentityConfig ==
                        other.sandboxesProxyAzureWorkloadIdentityConfig &&
                    sandboxesProxyAzureAccountKeyConfig ==
                        other.sandboxesProxyAzureAccountKeyConfig &&
                    sandboxesProxyAzureSasConfig == other.sandboxesProxyAzureSasConfig
            }

            override fun hashCode(): Int =
                Objects.hash(
                    sandboxesProxyAzureWorkloadIdentityConfig,
                    sandboxesProxyAzureAccountKeyConfig,
                    sandboxesProxyAzureSasConfig,
                )

            override fun toString(): String =
                when {
                    sandboxesProxyAzureWorkloadIdentityConfig != null ->
                        "Azure{sandboxesProxyAzureWorkloadIdentityConfig=$sandboxesProxyAzureWorkloadIdentityConfig}"
                    sandboxesProxyAzureAccountKeyConfig != null ->
                        "Azure{sandboxesProxyAzureAccountKeyConfig=$sandboxesProxyAzureAccountKeyConfig}"
                    sandboxesProxyAzureSasConfig != null ->
                        "Azure{sandboxesProxyAzureSasConfig=$sandboxesProxyAzureSasConfig}"
                    _json != null -> "Azure{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Azure")
                }

            companion object {

                @JvmStatic
                fun ofSandboxesProxyAzureWorkloadIdentityConfig(
                    sandboxesProxyAzureWorkloadIdentityConfig:
                        SandboxesProxyAzureWorkloadIdentityConfig
                ) =
                    Azure(
                        sandboxesProxyAzureWorkloadIdentityConfig =
                            sandboxesProxyAzureWorkloadIdentityConfig
                    )

                @JvmStatic
                fun ofSandboxesProxyAzureAccountKeyConfig(
                    sandboxesProxyAzureAccountKeyConfig: SandboxesProxyAzureAccountKeyConfig
                ) = Azure(sandboxesProxyAzureAccountKeyConfig = sandboxesProxyAzureAccountKeyConfig)

                @JvmStatic
                fun ofSandboxesProxyAzureSasConfig(
                    sandboxesProxyAzureSasConfig: SandboxesProxyAzureSasConfig
                ) = Azure(sandboxesProxyAzureSasConfig = sandboxesProxyAzureSasConfig)
            }

            /**
             * An interface that defines how to map each variant of [Azure] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitSandboxesProxyAzureWorkloadIdentityConfig(
                    sandboxesProxyAzureWorkloadIdentityConfig:
                        SandboxesProxyAzureWorkloadIdentityConfig
                ): T

                fun visitSandboxesProxyAzureAccountKeyConfig(
                    sandboxesProxyAzureAccountKeyConfig: SandboxesProxyAzureAccountKeyConfig
                ): T

                fun visitSandboxesProxyAzureSasConfig(
                    sandboxesProxyAzureSasConfig: SandboxesProxyAzureSasConfig
                ): T

                /**
                 * Maps an unknown variant of [Azure] to a value of type [T].
                 *
                 * An instance of [Azure] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws LangChainInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LangChainInvalidDataException("Unknown Azure: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Azure>(Azure::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Azure {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<SandboxesProxyAzureWorkloadIdentityConfig>(),
                                    )
                                    ?.let {
                                        Azure(
                                            sandboxesProxyAzureWorkloadIdentityConfig = it,
                                            _json = json,
                                        )
                                    },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<SandboxesProxyAzureAccountKeyConfig>(),
                                    )
                                    ?.let {
                                        Azure(
                                            sandboxesProxyAzureAccountKeyConfig = it,
                                            _json = json,
                                        )
                                    },
                                tryDeserialize(node, jacksonTypeRef<SandboxesProxyAzureSasConfig>())
                                    ?.let { Azure(sandboxesProxyAzureSasConfig = it, _json = json) },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Azure(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Azure>(Azure::class) {

                override fun serialize(
                    value: Azure,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.sandboxesProxyAzureWorkloadIdentityConfig != null ->
                            generator.writeObject(value.sandboxesProxyAzureWorkloadIdentityConfig)
                        value.sandboxesProxyAzureAccountKeyConfig != null ->
                            generator.writeObject(value.sandboxesProxyAzureAccountKeyConfig)
                        value.sandboxesProxyAzureSasConfig != null ->
                            generator.writeObject(value.sandboxesProxyAzureSasConfig)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Azure")
                    }
                }
            }

            class SandboxesProxyAzureWorkloadIdentityConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val clientId: JsonField<String>,
                private val tenantId: JsonField<String>,
                private val resources: JsonField<List<Resource>>,
                private val subjectScope: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("client_id")
                    @ExcludeMissing
                    clientId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tenant_id")
                    @ExcludeMissing
                    tenantId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("resources")
                    @ExcludeMissing
                    resources: JsonField<List<Resource>> = JsonMissing.of(),
                    @JsonProperty("subject_scope")
                    @ExcludeMissing
                    subjectScope: JsonField<String> = JsonMissing.of(),
                ) : this(clientId, tenantId, resources, subjectScope, mutableMapOf())

                /**
                 * ClientID is the application (client) ID, a GUID, of the app registration or
                 * user-assigned managed identity whose federated identity credential trusts
                 * LangSmith's issuer. Required with tenant_id.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun clientId(): String = clientId.getRequired("client_id")

                /**
                 * TenantID is the Entra tenant (directory) ID, a GUID. Setting it selects workload
                 * identity: LangSmith signs an OIDC token for this workspace and exchanges it at
                 * Entra ID for access tokens of client_id, so no secret is stored. Cannot be
                 * changed after creation.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun tenantId(): String = tenantId.getRequired("tenant_id")

                /**
                 * Resources narrows the Entra resources access tokens are obtained for, from
                 * https://storage.azure.com, https://vault.azure.net, https://management.azure.com
                 * and https://cognitiveservices.azure.com. Defaults to all of them. Only valid with
                 * tenant_id.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun resources(): Optional<List<Resource>> = resources.getOptional("resources")

                /**
                 * SubjectScope picks the token subject the federated credential trusts: "workspace"
                 * (the default) or "tag:<tag value id>", which must be one of the sandbox's
                 * tag_value_ids. Only valid with tenant_id.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun subjectScope(): Optional<String> = subjectScope.getOptional("subject_scope")

                /**
                 * Returns the raw JSON value of [clientId].
                 *
                 * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("client_id")
                @ExcludeMissing
                fun _clientId(): JsonField<String> = clientId

                /**
                 * Returns the raw JSON value of [tenantId].
                 *
                 * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tenant_id")
                @ExcludeMissing
                fun _tenantId(): JsonField<String> = tenantId

                /**
                 * Returns the raw JSON value of [resources].
                 *
                 * Unlike [resources], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("resources")
                @ExcludeMissing
                fun _resources(): JsonField<List<Resource>> = resources

                /**
                 * Returns the raw JSON value of [subjectScope].
                 *
                 * Unlike [subjectScope], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("subject_scope")
                @ExcludeMissing
                fun _subjectScope(): JsonField<String> = subjectScope

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
                     * [SandboxesProxyAzureWorkloadIdentityConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .clientId()
                     * .tenantId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxesProxyAzureWorkloadIdentityConfig]. */
                class Builder internal constructor() {

                    private var clientId: JsonField<String>? = null
                    private var tenantId: JsonField<String>? = null
                    private var resources: JsonField<MutableList<Resource>>? = null
                    private var subjectScope: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        sandboxesProxyAzureWorkloadIdentityConfig:
                            SandboxesProxyAzureWorkloadIdentityConfig
                    ) = apply {
                        clientId = sandboxesProxyAzureWorkloadIdentityConfig.clientId
                        tenantId = sandboxesProxyAzureWorkloadIdentityConfig.tenantId
                        resources =
                            sandboxesProxyAzureWorkloadIdentityConfig.resources.map {
                                it.toMutableList()
                            }
                        subjectScope = sandboxesProxyAzureWorkloadIdentityConfig.subjectScope
                        additionalProperties =
                            sandboxesProxyAzureWorkloadIdentityConfig.additionalProperties
                                .toMutableMap()
                    }

                    /**
                     * ClientID is the application (client) ID, a GUID, of the app registration or
                     * user-assigned managed identity whose federated identity credential trusts
                     * LangSmith's issuer. Required with tenant_id.
                     */
                    fun clientId(clientId: String) = clientId(JsonField.of(clientId))

                    /**
                     * Sets [Builder.clientId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.clientId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

                    /**
                     * TenantID is the Entra tenant (directory) ID, a GUID. Setting it selects
                     * workload identity: LangSmith signs an OIDC token for this workspace and
                     * exchanges it at Entra ID for access tokens of client_id, so no secret is
                     * stored. Cannot be changed after creation.
                     */
                    fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

                    /**
                     * Sets [Builder.tenantId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tenantId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

                    /**
                     * Resources narrows the Entra resources access tokens are obtained for, from
                     * https://storage.azure.com, https://vault.azure.net,
                     * https://management.azure.com and https://cognitiveservices.azure.com.
                     * Defaults to all of them. Only valid with tenant_id.
                     */
                    fun resources(resources: List<Resource>) = resources(JsonField.of(resources))

                    /**
                     * Sets [Builder.resources] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.resources] with a well-typed
                     * `List<Resource>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun resources(resources: JsonField<List<Resource>>) = apply {
                        this.resources = resources.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Resource] to [resources].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addResource(resource: Resource) = apply {
                        resources =
                            (resources ?: JsonField.of(mutableListOf())).also {
                                checkKnown("resources", it).add(resource)
                            }
                    }

                    /**
                     * SubjectScope picks the token subject the federated credential trusts:
                     * "workspace" (the default) or "tag:<tag value id>", which must be one of the
                     * sandbox's tag_value_ids. Only valid with tenant_id.
                     */
                    fun subjectScope(subjectScope: String) =
                        subjectScope(JsonField.of(subjectScope))

                    /**
                     * Sets [Builder.subjectScope] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subjectScope] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun subjectScope(subjectScope: JsonField<String>) = apply {
                        this.subjectScope = subjectScope
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
                     * Returns an immutable instance of [SandboxesProxyAzureWorkloadIdentityConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .clientId()
                     * .tenantId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxesProxyAzureWorkloadIdentityConfig =
                        SandboxesProxyAzureWorkloadIdentityConfig(
                            checkRequired("clientId", clientId),
                            checkRequired("tenantId", tenantId),
                            (resources ?: JsonMissing.of()).map { it.toImmutable() },
                            subjectScope,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxesProxyAzureWorkloadIdentityConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    clientId()
                    tenantId()
                    resources().ifPresent { it.forEach { it.validate() } }
                    subjectScope()
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
                    (if (clientId.asKnown().isPresent) 1 else 0) +
                        (if (tenantId.asKnown().isPresent) 1 else 0) +
                        (resources.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (subjectScope.asKnown().isPresent) 1 else 0)

                class Resource
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val HTTPS_STORAGE_AZURE_COM = of("https://storage.azure.com")

                        @JvmField val HTTPS_VAULT_AZURE_NET = of("https://vault.azure.net")

                        @JvmField
                        val HTTPS_MANAGEMENT_AZURE_COM = of("https://management.azure.com")

                        @JvmField
                        val HTTPS_COGNITIVESERVICES_AZURE_COM =
                            of("https://cognitiveservices.azure.com")

                        @JvmStatic fun of(value: String) = Resource(JsonField.of(value))
                    }

                    /** An enum containing [Resource]'s known values. */
                    enum class Known {
                        HTTPS_STORAGE_AZURE_COM,
                        HTTPS_VAULT_AZURE_NET,
                        HTTPS_MANAGEMENT_AZURE_COM,
                        HTTPS_COGNITIVESERVICES_AZURE_COM,
                    }

                    /**
                     * An enum containing [Resource]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Resource] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        HTTPS_STORAGE_AZURE_COM,
                        HTTPS_VAULT_AZURE_NET,
                        HTTPS_MANAGEMENT_AZURE_COM,
                        HTTPS_COGNITIVESERVICES_AZURE_COM,
                        /**
                         * An enum member indicating that [Resource] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            HTTPS_STORAGE_AZURE_COM -> Value.HTTPS_STORAGE_AZURE_COM
                            HTTPS_VAULT_AZURE_NET -> Value.HTTPS_VAULT_AZURE_NET
                            HTTPS_MANAGEMENT_AZURE_COM -> Value.HTTPS_MANAGEMENT_AZURE_COM
                            HTTPS_COGNITIVESERVICES_AZURE_COM ->
                                Value.HTTPS_COGNITIVESERVICES_AZURE_COM
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            HTTPS_STORAGE_AZURE_COM -> Known.HTTPS_STORAGE_AZURE_COM
                            HTTPS_VAULT_AZURE_NET -> Known.HTTPS_VAULT_AZURE_NET
                            HTTPS_MANAGEMENT_AZURE_COM -> Known.HTTPS_MANAGEMENT_AZURE_COM
                            HTTPS_COGNITIVESERVICES_AZURE_COM ->
                                Known.HTTPS_COGNITIVESERVICES_AZURE_COM
                            else -> throw LangChainInvalidDataException("Unknown Resource: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            LangChainInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Resource = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Resource && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxesProxyAzureWorkloadIdentityConfig &&
                        clientId == other.clientId &&
                        tenantId == other.tenantId &&
                        resources == other.resources &&
                        subjectScope == other.subjectScope &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(clientId, tenantId, resources, subjectScope, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxesProxyAzureWorkloadIdentityConfig{clientId=$clientId, tenantId=$tenantId, resources=$resources, subjectScope=$subjectScope, additionalProperties=$additionalProperties}"
            }

            class SandboxesProxyAzureAccountKeyConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val accountKey: JsonField<AccountKey>,
                private val storageAccount: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("account_key")
                    @ExcludeMissing
                    accountKey: JsonField<AccountKey> = JsonMissing.of(),
                    @JsonProperty("storage_account")
                    @ExcludeMissing
                    storageAccount: JsonField<String> = JsonMissing.of(),
                ) : this(accountKey, storageAccount, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun accountKey(): AccountKey = accountKey.getRequired("account_key")

                /**
                 * StorageAccount is the storage account static credentials authenticate to:
                 * requests to its blob, dfs, queue, table and file endpoints. Requires exactly one
                 * of account_key (requests are signed with SharedKey) or sas_token (appended to
                 * each request).
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun storageAccount(): String = storageAccount.getRequired("storage_account")

                /**
                 * Returns the raw JSON value of [accountKey].
                 *
                 * Unlike [accountKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("account_key")
                @ExcludeMissing
                fun _accountKey(): JsonField<AccountKey> = accountKey

                /**
                 * Returns the raw JSON value of [storageAccount].
                 *
                 * Unlike [storageAccount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("storage_account")
                @ExcludeMissing
                fun _storageAccount(): JsonField<String> = storageAccount

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
                     * [SandboxesProxyAzureAccountKeyConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .accountKey()
                     * .storageAccount()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxesProxyAzureAccountKeyConfig]. */
                class Builder internal constructor() {

                    private var accountKey: JsonField<AccountKey>? = null
                    private var storageAccount: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        sandboxesProxyAzureAccountKeyConfig: SandboxesProxyAzureAccountKeyConfig
                    ) = apply {
                        accountKey = sandboxesProxyAzureAccountKeyConfig.accountKey
                        storageAccount = sandboxesProxyAzureAccountKeyConfig.storageAccount
                        additionalProperties =
                            sandboxesProxyAzureAccountKeyConfig.additionalProperties.toMutableMap()
                    }

                    fun accountKey(accountKey: AccountKey) = accountKey(JsonField.of(accountKey))

                    /**
                     * Sets [Builder.accountKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.accountKey] with a well-typed [AccountKey]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun accountKey(accountKey: JsonField<AccountKey>) = apply {
                        this.accountKey = accountKey
                    }

                    /**
                     * StorageAccount is the storage account static credentials authenticate to:
                     * requests to its blob, dfs, queue, table and file endpoints. Requires exactly
                     * one of account_key (requests are signed with SharedKey) or sas_token
                     * (appended to each request).
                     */
                    fun storageAccount(storageAccount: String) =
                        storageAccount(JsonField.of(storageAccount))

                    /**
                     * Sets [Builder.storageAccount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.storageAccount] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun storageAccount(storageAccount: JsonField<String>) = apply {
                        this.storageAccount = storageAccount
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
                     * Returns an immutable instance of [SandboxesProxyAzureAccountKeyConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .accountKey()
                     * .storageAccount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxesProxyAzureAccountKeyConfig =
                        SandboxesProxyAzureAccountKeyConfig(
                            checkRequired("accountKey", accountKey),
                            checkRequired("storageAccount", storageAccount),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxesProxyAzureAccountKeyConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    accountKey().validate()
                    storageAccount()
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
                    (accountKey.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (storageAccount.asKnown().isPresent) 1 else 0)

                class AccountKey
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                         * Returns a mutable builder for constructing an instance of [AccountKey].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [AccountKey]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(accountKey: AccountKey) = apply {
                            type = accountKey.type
                            isSet = accountKey.isSet
                            value = accountKey.value
                            additionalProperties = accountKey.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [AccountKey].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): AccountKey =
                            AccountKey(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): AccountKey = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
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
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AccountKey &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AccountKey{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxesProxyAzureAccountKeyConfig &&
                        accountKey == other.accountKey &&
                        storageAccount == other.storageAccount &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(accountKey, storageAccount, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxesProxyAzureAccountKeyConfig{accountKey=$accountKey, storageAccount=$storageAccount, additionalProperties=$additionalProperties}"
            }

            class SandboxesProxyAzureSasConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val sasToken: JsonField<SasToken>,
                private val storageAccount: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("sas_token")
                    @ExcludeMissing
                    sasToken: JsonField<SasToken> = JsonMissing.of(),
                    @JsonProperty("storage_account")
                    @ExcludeMissing
                    storageAccount: JsonField<String> = JsonMissing.of(),
                ) : this(sasToken, storageAccount, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun sasToken(): SasToken = sasToken.getRequired("sas_token")

                /**
                 * StorageAccount is the storage account static credentials authenticate to:
                 * requests to its blob, dfs, queue, table and file endpoints. Requires exactly one
                 * of account_key (requests are signed with SharedKey) or sas_token (appended to
                 * each request).
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun storageAccount(): String = storageAccount.getRequired("storage_account")

                /**
                 * Returns the raw JSON value of [sasToken].
                 *
                 * Unlike [sasToken], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("sas_token")
                @ExcludeMissing
                fun _sasToken(): JsonField<SasToken> = sasToken

                /**
                 * Returns the raw JSON value of [storageAccount].
                 *
                 * Unlike [storageAccount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("storage_account")
                @ExcludeMissing
                fun _storageAccount(): JsonField<String> = storageAccount

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
                     * [SandboxesProxyAzureSasConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .sasToken()
                     * .storageAccount()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxesProxyAzureSasConfig]. */
                class Builder internal constructor() {

                    private var sasToken: JsonField<SasToken>? = null
                    private var storageAccount: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(sandboxesProxyAzureSasConfig: SandboxesProxyAzureSasConfig) =
                        apply {
                            sasToken = sandboxesProxyAzureSasConfig.sasToken
                            storageAccount = sandboxesProxyAzureSasConfig.storageAccount
                            additionalProperties =
                                sandboxesProxyAzureSasConfig.additionalProperties.toMutableMap()
                        }

                    fun sasToken(sasToken: SasToken) = sasToken(JsonField.of(sasToken))

                    /**
                     * Sets [Builder.sasToken] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sasToken] with a well-typed [SasToken] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun sasToken(sasToken: JsonField<SasToken>) = apply { this.sasToken = sasToken }

                    /**
                     * StorageAccount is the storage account static credentials authenticate to:
                     * requests to its blob, dfs, queue, table and file endpoints. Requires exactly
                     * one of account_key (requests are signed with SharedKey) or sas_token
                     * (appended to each request).
                     */
                    fun storageAccount(storageAccount: String) =
                        storageAccount(JsonField.of(storageAccount))

                    /**
                     * Sets [Builder.storageAccount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.storageAccount] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun storageAccount(storageAccount: JsonField<String>) = apply {
                        this.storageAccount = storageAccount
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
                     * Returns an immutable instance of [SandboxesProxyAzureSasConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .sasToken()
                     * .storageAccount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxesProxyAzureSasConfig =
                        SandboxesProxyAzureSasConfig(
                            checkRequired("sasToken", sasToken),
                            checkRequired("storageAccount", storageAccount),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxesProxyAzureSasConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    sasToken().validate()
                    storageAccount()
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
                    (sasToken.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (storageAccount.asKnown().isPresent) 1 else 0)

                class SasToken
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                         * Returns a mutable builder for constructing an instance of [SasToken].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SasToken]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(sasToken: SasToken) = apply {
                            type = sasToken.type
                            isSet = sasToken.isSet
                            value = sasToken.value
                            additionalProperties = sasToken.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SasToken].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): SasToken =
                            SasToken(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): SasToken = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
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
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SasToken &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SasToken{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxesProxyAzureSasConfig &&
                        sasToken == other.sasToken &&
                        storageAccount == other.storageAccount &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(sasToken, storageAccount, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxesProxyAzureSasConfig{sasToken=$sasToken, storageAccount=$storageAccount, additionalProperties=$additionalProperties}"
            }
        }

        /**
         * EnvVars are plaintext env vars set for every command in the sandbox while this rule is
         * enabled. Use them for tools that refuse to run unless a credential env var is present
         * (e.g. gh needs GH_TOKEN) even though this rule injects the real credential on the wire —
         * set a dummy value here so the command starts. Explicit per-sandbox env_vars win over
         * these, and provider-managed (AWS/GCP) vars win over both.
         */
        class EnvVars
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

                /** Returns a mutable builder for constructing an instance of [EnvVars]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [EnvVars]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(envVars: EnvVars) = apply {
                    additionalProperties = envVars.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [EnvVars].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): EnvVars = EnvVars(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): EnvVars = apply {
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

                return other is EnvVars && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "EnvVars{additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(using = Gcp.Deserializer::class)
        @JsonSerialize(using = Gcp.Serializer::class)
        class Gcp
        private constructor(
            private val sandboxesProxyGcpWorkloadIdentityConfig:
                SandboxesProxyGcpWorkloadIdentityConfig? =
                null,
            private val sandboxesProxyGcpServiceAccountConfig:
                SandboxesProxyGcpServiceAccountConfig? =
                null,
            private val _json: JsonValue? = null,
        ) {

            fun sandboxesProxyGcpWorkloadIdentityConfig():
                Optional<SandboxesProxyGcpWorkloadIdentityConfig> =
                Optional.ofNullable(sandboxesProxyGcpWorkloadIdentityConfig)

            fun sandboxesProxyGcpServiceAccountConfig():
                Optional<SandboxesProxyGcpServiceAccountConfig> =
                Optional.ofNullable(sandboxesProxyGcpServiceAccountConfig)

            fun isSandboxesProxyGcpWorkloadIdentityConfig(): Boolean =
                sandboxesProxyGcpWorkloadIdentityConfig != null

            fun isSandboxesProxyGcpServiceAccountConfig(): Boolean =
                sandboxesProxyGcpServiceAccountConfig != null

            fun asSandboxesProxyGcpWorkloadIdentityConfig():
                SandboxesProxyGcpWorkloadIdentityConfig =
                sandboxesProxyGcpWorkloadIdentityConfig.getOrThrow(
                    "sandboxesProxyGcpWorkloadIdentityConfig"
                )

            fun asSandboxesProxyGcpServiceAccountConfig(): SandboxesProxyGcpServiceAccountConfig =
                sandboxesProxyGcpServiceAccountConfig.getOrThrow(
                    "sandboxesProxyGcpServiceAccountConfig"
                )

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.langchain.smith.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = gcp.accept(new Gcp.Visitor<Optional<String>>() {
             *     @Override
             *     public Optional<String> visitSandboxesProxyGcpWorkloadIdentityConfig(SandboxesProxyGcpWorkloadIdentityConfig sandboxesProxyGcpWorkloadIdentityConfig) {
             *         return Optional.of(sandboxesProxyGcpWorkloadIdentityConfig.toString());
             *     }
             *
             *     // ...
             *
             *     @Override
             *     public Optional<String> unknown(JsonValue json) {
             *         // Or inspect the `json`.
             *         return Optional.empty();
             *     }
             * });
             * ```
             *
             * @throws LangChainInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    sandboxesProxyGcpWorkloadIdentityConfig != null ->
                        visitor.visitSandboxesProxyGcpWorkloadIdentityConfig(
                            sandboxesProxyGcpWorkloadIdentityConfig
                        )
                    sandboxesProxyGcpServiceAccountConfig != null ->
                        visitor.visitSandboxesProxyGcpServiceAccountConfig(
                            sandboxesProxyGcpServiceAccountConfig
                        )
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Gcp = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitSandboxesProxyGcpWorkloadIdentityConfig(
                            sandboxesProxyGcpWorkloadIdentityConfig:
                                SandboxesProxyGcpWorkloadIdentityConfig
                        ) {
                            sandboxesProxyGcpWorkloadIdentityConfig.validate()
                        }

                        override fun visitSandboxesProxyGcpServiceAccountConfig(
                            sandboxesProxyGcpServiceAccountConfig:
                                SandboxesProxyGcpServiceAccountConfig
                        ) {
                            sandboxesProxyGcpServiceAccountConfig.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitSandboxesProxyGcpWorkloadIdentityConfig(
                            sandboxesProxyGcpWorkloadIdentityConfig:
                                SandboxesProxyGcpWorkloadIdentityConfig
                        ) = sandboxesProxyGcpWorkloadIdentityConfig.validity()

                        override fun visitSandboxesProxyGcpServiceAccountConfig(
                            sandboxesProxyGcpServiceAccountConfig:
                                SandboxesProxyGcpServiceAccountConfig
                        ) = sandboxesProxyGcpServiceAccountConfig.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Gcp &&
                    sandboxesProxyGcpWorkloadIdentityConfig ==
                        other.sandboxesProxyGcpWorkloadIdentityConfig &&
                    sandboxesProxyGcpServiceAccountConfig ==
                        other.sandboxesProxyGcpServiceAccountConfig
            }

            override fun hashCode(): Int =
                Objects.hash(
                    sandboxesProxyGcpWorkloadIdentityConfig,
                    sandboxesProxyGcpServiceAccountConfig,
                )

            override fun toString(): String =
                when {
                    sandboxesProxyGcpWorkloadIdentityConfig != null ->
                        "Gcp{sandboxesProxyGcpWorkloadIdentityConfig=$sandboxesProxyGcpWorkloadIdentityConfig}"
                    sandboxesProxyGcpServiceAccountConfig != null ->
                        "Gcp{sandboxesProxyGcpServiceAccountConfig=$sandboxesProxyGcpServiceAccountConfig}"
                    _json != null -> "Gcp{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Gcp")
                }

            companion object {

                @JvmStatic
                fun ofSandboxesProxyGcpWorkloadIdentityConfig(
                    sandboxesProxyGcpWorkloadIdentityConfig: SandboxesProxyGcpWorkloadIdentityConfig
                ) =
                    Gcp(
                        sandboxesProxyGcpWorkloadIdentityConfig =
                            sandboxesProxyGcpWorkloadIdentityConfig
                    )

                @JvmStatic
                fun ofSandboxesProxyGcpServiceAccountConfig(
                    sandboxesProxyGcpServiceAccountConfig: SandboxesProxyGcpServiceAccountConfig
                ) =
                    Gcp(
                        sandboxesProxyGcpServiceAccountConfig =
                            sandboxesProxyGcpServiceAccountConfig
                    )
            }

            /**
             * An interface that defines how to map each variant of [Gcp] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitSandboxesProxyGcpWorkloadIdentityConfig(
                    sandboxesProxyGcpWorkloadIdentityConfig: SandboxesProxyGcpWorkloadIdentityConfig
                ): T

                fun visitSandboxesProxyGcpServiceAccountConfig(
                    sandboxesProxyGcpServiceAccountConfig: SandboxesProxyGcpServiceAccountConfig
                ): T

                /**
                 * Maps an unknown variant of [Gcp] to a value of type [T].
                 *
                 * An instance of [Gcp] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws LangChainInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LangChainInvalidDataException("Unknown Gcp: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Gcp>(Gcp::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Gcp {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<SandboxesProxyGcpWorkloadIdentityConfig>(),
                                    )
                                    ?.let {
                                        Gcp(
                                            sandboxesProxyGcpWorkloadIdentityConfig = it,
                                            _json = json,
                                        )
                                    },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<SandboxesProxyGcpServiceAccountConfig>(),
                                    )
                                    ?.let {
                                        Gcp(
                                            sandboxesProxyGcpServiceAccountConfig = it,
                                            _json = json,
                                        )
                                    },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Gcp(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Gcp>(Gcp::class) {

                override fun serialize(
                    value: Gcp,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.sandboxesProxyGcpWorkloadIdentityConfig != null ->
                            generator.writeObject(value.sandboxesProxyGcpWorkloadIdentityConfig)
                        value.sandboxesProxyGcpServiceAccountConfig != null ->
                            generator.writeObject(value.sandboxesProxyGcpServiceAccountConfig)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Gcp")
                    }
                }
            }

            class SandboxesProxyGcpWorkloadIdentityConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val workloadIdentityProvider: JsonField<String>,
                private val scopes: JsonField<List<String>>,
                private val serviceAccountEmail: JsonField<String>,
                private val subjectScope: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("workload_identity_provider")
                    @ExcludeMissing
                    workloadIdentityProvider: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("scopes")
                    @ExcludeMissing
                    scopes: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("service_account_email")
                    @ExcludeMissing
                    serviceAccountEmail: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("subject_scope")
                    @ExcludeMissing
                    subjectScope: JsonField<String> = JsonMissing.of(),
                ) : this(
                    workloadIdentityProvider,
                    scopes,
                    serviceAccountEmail,
                    subjectScope,
                    mutableMapOf(),
                )

                /**
                 * WorkloadIdentityProvider federates an OIDC token LangSmith signs for this
                 * workspace through Workload Identity Federation instead of a service account key.
                 * Use the full resource name:
                 * //iam.googleapis.com/projects/<number>/locations/global/workloadIdentityPools/<pool>/providers/<provider>.
                 * Cannot be changed after creation.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun workloadIdentityProvider(): String =
                    workloadIdentityProvider.getRequired("workload_identity_provider")

                /**
                 * Scopes are the OAuth scopes requested for the access token. Omit them to use
                 * https://www.googleapis.com/auth/cloud-platform.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun scopes(): Optional<List<String>> = scopes.getOptional("scopes")

                /**
                 * ServiceAccountEmail is the service account to impersonate with the federated
                 * token. Omit it to use the federated principal directly.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun serviceAccountEmail(): Optional<String> =
                    serviceAccountEmail.getOptional("service_account_email")

                /**
                 * SubjectScope picks the token subject the provider trusts: "workspace" (the
                 * default) or "tag:<tag value id>", which must be one of the sandbox's
                 * tag_value_ids. Only valid with workload_identity_provider.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun subjectScope(): Optional<String> = subjectScope.getOptional("subject_scope")

                /**
                 * Returns the raw JSON value of [workloadIdentityProvider].
                 *
                 * Unlike [workloadIdentityProvider], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("workload_identity_provider")
                @ExcludeMissing
                fun _workloadIdentityProvider(): JsonField<String> = workloadIdentityProvider

                /**
                 * Returns the raw JSON value of [scopes].
                 *
                 * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("scopes")
                @ExcludeMissing
                fun _scopes(): JsonField<List<String>> = scopes

                /**
                 * Returns the raw JSON value of [serviceAccountEmail].
                 *
                 * Unlike [serviceAccountEmail], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("service_account_email")
                @ExcludeMissing
                fun _serviceAccountEmail(): JsonField<String> = serviceAccountEmail

                /**
                 * Returns the raw JSON value of [subjectScope].
                 *
                 * Unlike [subjectScope], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("subject_scope")
                @ExcludeMissing
                fun _subjectScope(): JsonField<String> = subjectScope

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
                     * [SandboxesProxyGcpWorkloadIdentityConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .workloadIdentityProvider()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxesProxyGcpWorkloadIdentityConfig]. */
                class Builder internal constructor() {

                    private var workloadIdentityProvider: JsonField<String>? = null
                    private var scopes: JsonField<MutableList<String>>? = null
                    private var serviceAccountEmail: JsonField<String> = JsonMissing.of()
                    private var subjectScope: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        sandboxesProxyGcpWorkloadIdentityConfig:
                            SandboxesProxyGcpWorkloadIdentityConfig
                    ) = apply {
                        workloadIdentityProvider =
                            sandboxesProxyGcpWorkloadIdentityConfig.workloadIdentityProvider
                        scopes =
                            sandboxesProxyGcpWorkloadIdentityConfig.scopes.map {
                                it.toMutableList()
                            }
                        serviceAccountEmail =
                            sandboxesProxyGcpWorkloadIdentityConfig.serviceAccountEmail
                        subjectScope = sandboxesProxyGcpWorkloadIdentityConfig.subjectScope
                        additionalProperties =
                            sandboxesProxyGcpWorkloadIdentityConfig.additionalProperties
                                .toMutableMap()
                    }

                    /**
                     * WorkloadIdentityProvider federates an OIDC token LangSmith signs for this
                     * workspace through Workload Identity Federation instead of a service account
                     * key. Use the full resource name:
                     * //iam.googleapis.com/projects/<number>/locations/global/workloadIdentityPools/<pool>/providers/<provider>.
                     * Cannot be changed after creation.
                     */
                    fun workloadIdentityProvider(workloadIdentityProvider: String) =
                        workloadIdentityProvider(JsonField.of(workloadIdentityProvider))

                    /**
                     * Sets [Builder.workloadIdentityProvider] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.workloadIdentityProvider] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun workloadIdentityProvider(workloadIdentityProvider: JsonField<String>) =
                        apply {
                            this.workloadIdentityProvider = workloadIdentityProvider
                        }

                    /**
                     * Scopes are the OAuth scopes requested for the access token. Omit them to use
                     * https://www.googleapis.com/auth/cloud-platform.
                     */
                    fun scopes(scopes: List<String>) = scopes(JsonField.of(scopes))

                    /**
                     * Sets [Builder.scopes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.scopes] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun scopes(scopes: JsonField<List<String>>) = apply {
                        this.scopes = scopes.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [scopes].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addScope(scope: String) = apply {
                        scopes =
                            (scopes ?: JsonField.of(mutableListOf())).also {
                                checkKnown("scopes", it).add(scope)
                            }
                    }

                    /**
                     * ServiceAccountEmail is the service account to impersonate with the federated
                     * token. Omit it to use the federated principal directly.
                     */
                    fun serviceAccountEmail(serviceAccountEmail: String) =
                        serviceAccountEmail(JsonField.of(serviceAccountEmail))

                    /**
                     * Sets [Builder.serviceAccountEmail] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serviceAccountEmail] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun serviceAccountEmail(serviceAccountEmail: JsonField<String>) = apply {
                        this.serviceAccountEmail = serviceAccountEmail
                    }

                    /**
                     * SubjectScope picks the token subject the provider trusts: "workspace" (the
                     * default) or "tag:<tag value id>", which must be one of the sandbox's
                     * tag_value_ids. Only valid with workload_identity_provider.
                     */
                    fun subjectScope(subjectScope: String) =
                        subjectScope(JsonField.of(subjectScope))

                    /**
                     * Sets [Builder.subjectScope] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subjectScope] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun subjectScope(subjectScope: JsonField<String>) = apply {
                        this.subjectScope = subjectScope
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
                     * Returns an immutable instance of [SandboxesProxyGcpWorkloadIdentityConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .workloadIdentityProvider()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxesProxyGcpWorkloadIdentityConfig =
                        SandboxesProxyGcpWorkloadIdentityConfig(
                            checkRequired("workloadIdentityProvider", workloadIdentityProvider),
                            (scopes ?: JsonMissing.of()).map { it.toImmutable() },
                            serviceAccountEmail,
                            subjectScope,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxesProxyGcpWorkloadIdentityConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    workloadIdentityProvider()
                    scopes()
                    serviceAccountEmail()
                    subjectScope()
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
                    (if (workloadIdentityProvider.asKnown().isPresent) 1 else 0) +
                        (scopes.asKnown().getOrNull()?.size ?: 0) +
                        (if (serviceAccountEmail.asKnown().isPresent) 1 else 0) +
                        (if (subjectScope.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxesProxyGcpWorkloadIdentityConfig &&
                        workloadIdentityProvider == other.workloadIdentityProvider &&
                        scopes == other.scopes &&
                        serviceAccountEmail == other.serviceAccountEmail &&
                        subjectScope == other.subjectScope &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        workloadIdentityProvider,
                        scopes,
                        serviceAccountEmail,
                        subjectScope,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxesProxyGcpWorkloadIdentityConfig{workloadIdentityProvider=$workloadIdentityProvider, scopes=$scopes, serviceAccountEmail=$serviceAccountEmail, subjectScope=$subjectScope, additionalProperties=$additionalProperties}"
            }

            class SandboxesProxyGcpServiceAccountConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val serviceAccountJson: JsonField<ServiceAccountJson>,
                private val scopes: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("service_account_json")
                    @ExcludeMissing
                    serviceAccountJson: JsonField<ServiceAccountJson> = JsonMissing.of(),
                    @JsonProperty("scopes")
                    @ExcludeMissing
                    scopes: JsonField<List<String>> = JsonMissing.of(),
                ) : this(serviceAccountJson, scopes, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun serviceAccountJson(): ServiceAccountJson =
                    serviceAccountJson.getRequired("service_account_json")

                /**
                 * Scopes are the OAuth scopes requested for the access token. Omit them to use
                 * https://www.googleapis.com/auth/cloud-platform.
                 *
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun scopes(): Optional<List<String>> = scopes.getOptional("scopes")

                /**
                 * Returns the raw JSON value of [serviceAccountJson].
                 *
                 * Unlike [serviceAccountJson], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("service_account_json")
                @ExcludeMissing
                fun _serviceAccountJson(): JsonField<ServiceAccountJson> = serviceAccountJson

                /**
                 * Returns the raw JSON value of [scopes].
                 *
                 * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("scopes")
                @ExcludeMissing
                fun _scopes(): JsonField<List<String>> = scopes

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
                     * [SandboxesProxyGcpServiceAccountConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceAccountJson()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SandboxesProxyGcpServiceAccountConfig]. */
                class Builder internal constructor() {

                    private var serviceAccountJson: JsonField<ServiceAccountJson>? = null
                    private var scopes: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        sandboxesProxyGcpServiceAccountConfig: SandboxesProxyGcpServiceAccountConfig
                    ) = apply {
                        serviceAccountJson =
                            sandboxesProxyGcpServiceAccountConfig.serviceAccountJson
                        scopes =
                            sandboxesProxyGcpServiceAccountConfig.scopes.map { it.toMutableList() }
                        additionalProperties =
                            sandboxesProxyGcpServiceAccountConfig.additionalProperties
                                .toMutableMap()
                    }

                    fun serviceAccountJson(serviceAccountJson: ServiceAccountJson) =
                        serviceAccountJson(JsonField.of(serviceAccountJson))

                    /**
                     * Sets [Builder.serviceAccountJson] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.serviceAccountJson] with a well-typed
                     * [ServiceAccountJson] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun serviceAccountJson(serviceAccountJson: JsonField<ServiceAccountJson>) =
                        apply {
                            this.serviceAccountJson = serviceAccountJson
                        }

                    /**
                     * Scopes are the OAuth scopes requested for the access token. Omit them to use
                     * https://www.googleapis.com/auth/cloud-platform.
                     */
                    fun scopes(scopes: List<String>) = scopes(JsonField.of(scopes))

                    /**
                     * Sets [Builder.scopes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.scopes] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun scopes(scopes: JsonField<List<String>>) = apply {
                        this.scopes = scopes.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [scopes].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addScope(scope: String) = apply {
                        scopes =
                            (scopes ?: JsonField.of(mutableListOf())).also {
                                checkKnown("scopes", it).add(scope)
                            }
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
                     * Returns an immutable instance of [SandboxesProxyGcpServiceAccountConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .serviceAccountJson()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SandboxesProxyGcpServiceAccountConfig =
                        SandboxesProxyGcpServiceAccountConfig(
                            checkRequired("serviceAccountJson", serviceAccountJson),
                            (scopes ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SandboxesProxyGcpServiceAccountConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    serviceAccountJson().validate()
                    scopes()
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
                    (serviceAccountJson.asKnown().getOrNull()?.validity() ?: 0) +
                        (scopes.asKnown().getOrNull()?.size ?: 0)

                class ServiceAccountJson
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonField<Type>,
                    private val isSet: JsonField<Boolean>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("is_set")
                        @ExcludeMissing
                        isSet: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(type, isSet, value, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<String> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [isSet].
                     *
                     * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                         * [ServiceAccountJson].
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ServiceAccountJson]. */
                    class Builder internal constructor() {

                        private var type: JsonField<Type>? = null
                        private var isSet: JsonField<Boolean> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(serviceAccountJson: ServiceAccountJson) = apply {
                            type = serviceAccountJson.type
                            isSet = serviceAccountJson.isSet
                            value = serviceAccountJson.value
                            additionalProperties =
                                serviceAccountJson.additionalProperties.toMutableMap()
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                        /**
                         * Sets [Builder.isSet] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ServiceAccountJson].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): ServiceAccountJson =
                            ServiceAccountJson(
                                checkRequired("type", type),
                                isSet,
                                value,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): ServiceAccountJson = apply {
                        if (validated) {
                            return@apply
                        }

                        type().validate()
                        isSet()
                        value()
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
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (isSet.asKnown().isPresent) 1 else 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLAINTEXT = of("plaintext")

                            @JvmField val OPAQUE = of("opaque")

                            @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLAINTEXT,
                            OPAQUE,
                            WORKSPACE_SECRET,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLAINTEXT -> Value.PLAINTEXT
                                OPAQUE -> Value.OPAQUE
                                WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLAINTEXT -> Known.PLAINTEXT
                                OPAQUE -> Known.OPAQUE
                                WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ServiceAccountJson &&
                            type == other.type &&
                            isSet == other.isSet &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, isSet, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ServiceAccountJson{type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SandboxesProxyGcpServiceAccountConfig &&
                        serviceAccountJson == other.serviceAccountJson &&
                        scopes == other.scopes &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(serviceAccountJson, scopes, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SandboxesProxyGcpServiceAccountConfig{serviceAccountJson=$serviceAccountJson, scopes=$scopes, additionalProperties=$additionalProperties}"
            }
        }

        class Header
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val type: JsonField<Type>,
            private val isSet: JsonField<Boolean>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("is_set")
                @ExcludeMissing
                isSet: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(name, type, isSet, value, mutableMapOf())

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun isSet(): Optional<Boolean> = isSet.getOptional("is_set")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun value(): Optional<String> = value.getOptional("value")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [isSet].
             *
             * Unlike [isSet], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("is_set") @ExcludeMissing fun _isSet(): JsonField<Boolean> = isSet

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                 * Returns a mutable builder for constructing an instance of [Header].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Header]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var isSet: JsonField<Boolean> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(header: Header) = apply {
                    name = header.name
                    type = header.type
                    isSet = header.isSet
                    value = header.value
                    additionalProperties = header.additionalProperties.toMutableMap()
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun isSet(isSet: Boolean) = isSet(JsonField.of(isSet))

                /**
                 * Sets [Builder.isSet] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isSet] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isSet(isSet: JsonField<Boolean>) = apply { this.isSet = isSet }

                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

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
                 * Returns an immutable instance of [Header].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Header =
                    Header(
                        checkRequired("name", name),
                        checkRequired("type", type),
                        isSet,
                        value,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Header = apply {
                if (validated) {
                    return@apply
                }

                name()
                type().validate()
                isSet()
                value()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (isSet.asKnown().isPresent) 1 else 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PLAINTEXT = of("plaintext")

                    @JvmField val OPAQUE = of("opaque")

                    @JvmField val WORKSPACE_SECRET = of("workspace_secret")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PLAINTEXT,
                    OPAQUE,
                    WORKSPACE_SECRET,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PLAINTEXT,
                    OPAQUE,
                    WORKSPACE_SECRET,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PLAINTEXT -> Value.PLAINTEXT
                        OPAQUE -> Value.OPAQUE
                        WORKSPACE_SECRET -> Value.WORKSPACE_SECRET
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PLAINTEXT -> Known.PLAINTEXT
                        OPAQUE -> Known.OPAQUE
                        WORKSPACE_SECRET -> Known.WORKSPACE_SECRET
                        else -> throw LangChainInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
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
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Header &&
                    name == other.name &&
                    type == other.type &&
                    isSet == other.isSet &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(name, type, isSet, value, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Header{name=$name, type=$type, isSet=$isSet, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Rule &&
                name == other.name &&
                aws == other.aws &&
                azure == other.azure &&
                description == other.description &&
                enabled == other.enabled &&
                envVars == other.envVars &&
                gcp == other.gcp &&
                headers == other.headers &&
                matchHeaders == other.matchHeaders &&
                matchHosts == other.matchHosts &&
                matchPaths == other.matchPaths &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                aws,
                azure,
                description,
                enabled,
                envVars,
                gcp,
                headers,
                matchHeaders,
                matchHosts,
                matchPaths,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rule{name=$name, aws=$aws, azure=$azure, description=$description, enabled=$enabled, envVars=$envVars, gcp=$gcp, headers=$headers, matchHeaders=$matchHeaders, matchHosts=$matchHosts, matchPaths=$matchPaths, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProxyConfig &&
            accessControl == other.accessControl &&
            callbacks == other.callbacks &&
            description == other.description &&
            noProxy == other.noProxy &&
            rules == other.rules &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accessControl, callbacks, description, noProxy, rules, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProxyConfig{accessControl=$accessControl, callbacks=$callbacks, description=$description, noProxy=$noProxy, rules=$rules, additionalProperties=$additionalProperties}"
}
