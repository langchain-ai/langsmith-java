// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspacesecrets

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
 * Create or update a workspace secret and the hosts it may be sent to.
 *
 * Requires workspace admin. Omit value to keep the current one; it is required to create a secret.
 * configs replaces the secret's hosts; omitted or empty restores the built-in defaults for known
 * provider keys. The value is never returned.
 */
class WorkspaceSecretUpsertParams
private constructor(
    private val key: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun key(): Optional<String> = Optional.ofNullable(key)

    /**
     * Full replacement of the allowed hosts. Omitted or empty removes custom hosts so the built-in
     * defaults, if any, apply.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configs(): Optional<List<Config>> = body.configs()

    /**
     * Secret value. Required to create a secret; omit to keep the current value.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<String> = body.value()

    /**
     * Returns the raw JSON value of [configs].
     *
     * Unlike [configs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _configs(): JsonField<List<Config>> = body._configs()

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _value(): JsonField<String> = body._value()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): WorkspaceSecretUpsertParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [WorkspaceSecretUpsertParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkspaceSecretUpsertParams]. */
    class Builder internal constructor() {

        private var key: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(workspaceSecretUpsertParams: WorkspaceSecretUpsertParams) = apply {
            key = workspaceSecretUpsertParams.key
            body = workspaceSecretUpsertParams.body.toBuilder()
            additionalHeaders = workspaceSecretUpsertParams.additionalHeaders.toBuilder()
            additionalQueryParams = workspaceSecretUpsertParams.additionalQueryParams.toBuilder()
        }

        fun key(key: String?) = apply { this.key = key }

        /** Alias for calling [Builder.key] with `key.orElse(null)`. */
        fun key(key: Optional<String>) = key(key.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [configs]
         * - [value]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Full replacement of the allowed hosts. Omitted or empty removes custom hosts so the
         * built-in defaults, if any, apply.
         */
        fun configs(configs: List<Config>?) = apply { body.configs(configs) }

        /** Alias for calling [Builder.configs] with `configs.orElse(null)`. */
        fun configs(configs: Optional<List<Config>>) = configs(configs.getOrNull())

        /**
         * Sets [Builder.configs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configs] with a well-typed `List<Config>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun configs(configs: JsonField<List<Config>>) = apply { body.configs(configs) }

        /**
         * Adds a single [Config] to [configs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addConfig(config: Config) = apply { body.addConfig(config) }

        /** Secret value. Required to create a secret; omit to keep the current value. */
        fun value(value: String?) = apply { body.value(value) }

        /** Alias for calling [Builder.value] with `value.orElse(null)`. */
        fun value(value: Optional<String>) = value(value.getOrNull())

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { body.value(value) }

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
         * Returns an immutable instance of [WorkspaceSecretUpsertParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WorkspaceSecretUpsertParams =
            WorkspaceSecretUpsertParams(
                key,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> key ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val configs: JsonField<List<Config>>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("configs")
            @ExcludeMissing
            configs: JsonField<List<Config>> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(configs, value, mutableMapOf())

        /**
         * Full replacement of the allowed hosts. Omitted or empty removes custom hosts so the
         * built-in defaults, if any, apply.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun configs(): Optional<List<Config>> = configs.getOptional("configs")

        /**
         * Secret value. Required to create a secret; omit to keep the current value.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun value(): Optional<String> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [configs].
         *
         * Unlike [configs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("configs") @ExcludeMissing fun _configs(): JsonField<List<Config>> = configs

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var configs: JsonField<MutableList<Config>>? = null
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                configs = body.configs.map { it.toMutableList() }
                value = body.value
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Full replacement of the allowed hosts. Omitted or empty removes custom hosts so the
             * built-in defaults, if any, apply.
             */
            fun configs(configs: List<Config>?) = configs(JsonField.ofNullable(configs))

            /** Alias for calling [Builder.configs] with `configs.orElse(null)`. */
            fun configs(configs: Optional<List<Config>>) = configs(configs.getOrNull())

            /**
             * Sets [Builder.configs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configs] with a well-typed `List<Config>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun configs(configs: JsonField<List<Config>>) = apply {
                this.configs = configs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Config] to [configs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addConfig(config: Config) = apply {
                configs =
                    (configs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("configs", it).add(config)
                    }
            }

            /** Secret value. Required to create a secret; omit to keep the current value. */
            fun value(value: String?) = value(JsonField.ofNullable(value))

            /** Alias for calling [Builder.value] with `value.orElse(null)`. */
            fun value(value: Optional<String>) = value(value.getOrNull())

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
                    (configs ?: JsonMissing.of()).map { it.toImmutable() },
                    value,
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

            configs().ifPresent { it.forEach { it.validate() } }
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
            (configs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                configs == other.configs &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(configs, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{configs=$configs, value=$value, additionalProperties=$additionalProperties}"
    }

    /** A host a workspace secret may be sent to, and how it is sent. */
    class Config
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val hostPattern: JsonField<String>,
        private val headerName: JsonField<String>,
        private val headerValueTemplate: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("host_pattern")
            @ExcludeMissing
            hostPattern: JsonField<String> = JsonMissing.of(),
            @JsonProperty("header_name")
            @ExcludeMissing
            headerName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("header_value_template")
            @ExcludeMissing
            headerValueTemplate: JsonField<String> = JsonMissing.of(),
        ) : this(hostPattern, headerName, headerValueTemplate, mutableMapOf())

        /**
         * Exact host or a leading '*.' wildcard, e.g. 'api.openai.com'.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hostPattern(): String = hostPattern.getRequired("host_pattern")

        /**
         * HTTP header the secret is sent in. Null leaves it to the consumer.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun headerName(): Optional<String> = headerName.getOptional("header_name")

        /**
         * Header value with '{value}' replaced by the secret, e.g. 'Bearer {value}'. Null sends the
         * raw secret.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun headerValueTemplate(): Optional<String> =
            headerValueTemplate.getOptional("header_value_template")

        /**
         * Returns the raw JSON value of [hostPattern].
         *
         * Unlike [hostPattern], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("host_pattern")
        @ExcludeMissing
        fun _hostPattern(): JsonField<String> = hostPattern

        /**
         * Returns the raw JSON value of [headerName].
         *
         * Unlike [headerName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("header_name")
        @ExcludeMissing
        fun _headerName(): JsonField<String> = headerName

        /**
         * Returns the raw JSON value of [headerValueTemplate].
         *
         * Unlike [headerValueTemplate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("header_value_template")
        @ExcludeMissing
        fun _headerValueTemplate(): JsonField<String> = headerValueTemplate

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
             * Returns a mutable builder for constructing an instance of [Config].
             *
             * The following fields are required:
             * ```java
             * .hostPattern()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Config]. */
        class Builder internal constructor() {

            private var hostPattern: JsonField<String>? = null
            private var headerName: JsonField<String> = JsonMissing.of()
            private var headerValueTemplate: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(config: Config) = apply {
                hostPattern = config.hostPattern
                headerName = config.headerName
                headerValueTemplate = config.headerValueTemplate
                additionalProperties = config.additionalProperties.toMutableMap()
            }

            /** Exact host or a leading '*.' wildcard, e.g. 'api.openai.com'. */
            fun hostPattern(hostPattern: String) = hostPattern(JsonField.of(hostPattern))

            /**
             * Sets [Builder.hostPattern] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hostPattern] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hostPattern(hostPattern: JsonField<String>) = apply {
                this.hostPattern = hostPattern
            }

            /** HTTP header the secret is sent in. Null leaves it to the consumer. */
            fun headerName(headerName: String?) = headerName(JsonField.ofNullable(headerName))

            /** Alias for calling [Builder.headerName] with `headerName.orElse(null)`. */
            fun headerName(headerName: Optional<String>) = headerName(headerName.getOrNull())

            /**
             * Sets [Builder.headerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headerName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headerName(headerName: JsonField<String>) = apply { this.headerName = headerName }

            /**
             * Header value with '{value}' replaced by the secret, e.g. 'Bearer {value}'. Null sends
             * the raw secret.
             */
            fun headerValueTemplate(headerValueTemplate: String?) =
                headerValueTemplate(JsonField.ofNullable(headerValueTemplate))

            /**
             * Alias for calling [Builder.headerValueTemplate] with
             * `headerValueTemplate.orElse(null)`.
             */
            fun headerValueTemplate(headerValueTemplate: Optional<String>) =
                headerValueTemplate(headerValueTemplate.getOrNull())

            /**
             * Sets [Builder.headerValueTemplate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headerValueTemplate] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun headerValueTemplate(headerValueTemplate: JsonField<String>) = apply {
                this.headerValueTemplate = headerValueTemplate
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
             * Returns an immutable instance of [Config].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .hostPattern()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Config =
                Config(
                    checkRequired("hostPattern", hostPattern),
                    headerName,
                    headerValueTemplate,
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
        fun validate(): Config = apply {
            if (validated) {
                return@apply
            }

            hostPattern()
            headerName()
            headerValueTemplate()
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
            (if (hostPattern.asKnown().isPresent) 1 else 0) +
                (if (headerName.asKnown().isPresent) 1 else 0) +
                (if (headerValueTemplate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Config &&
                hostPattern == other.hostPattern &&
                headerName == other.headerName &&
                headerValueTemplate == other.headerValueTemplate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(hostPattern, headerName, headerValueTemplate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Config{hostPattern=$hostPattern, headerName=$headerName, headerValueTemplate=$headerValueTemplate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WorkspaceSecretUpsertParams &&
            key == other.key &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(key, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WorkspaceSecretUpsertParams{key=$key, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
