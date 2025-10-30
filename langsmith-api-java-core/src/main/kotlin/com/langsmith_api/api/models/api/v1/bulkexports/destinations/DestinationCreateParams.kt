// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.bulkexports.destinations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new bulk export destination */
class DestinationCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun config(): BulkExportDestinationS3Config = body.config()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = body.displayName()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun credentials(): Optional<Credentials> = body.credentials()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun destinationType(): Optional<BulkExportDestinationType> = body.destinationType()

    /**
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _config(): JsonField<BulkExportDestinationS3Config> = body._config()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [credentials].
     *
     * Unlike [credentials], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _credentials(): JsonField<Credentials> = body._credentials()

    /**
     * Returns the raw JSON value of [destinationType].
     *
     * Unlike [destinationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _destinationType(): JsonField<BulkExportDestinationType> = body._destinationType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DestinationCreateParams].
         *
         * The following fields are required:
         * ```java
         * .config()
         * .displayName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DestinationCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(destinationCreateParams: DestinationCreateParams) = apply {
            body = destinationCreateParams.body.toBuilder()
            additionalHeaders = destinationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = destinationCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [config]
         * - [displayName]
         * - [credentials]
         * - [destinationType]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun config(config: BulkExportDestinationS3Config) = apply { body.config(config) }

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed
         * [BulkExportDestinationS3Config] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun config(config: JsonField<BulkExportDestinationS3Config>) = apply { body.config(config) }

        fun displayName(displayName: String) = apply { body.displayName(displayName) }

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { body.displayName(displayName) }

        fun credentials(credentials: Credentials?) = apply { body.credentials(credentials) }

        /** Alias for calling [Builder.credentials] with `credentials.orElse(null)`. */
        fun credentials(credentials: Optional<Credentials>) = credentials(credentials.getOrNull())

        /**
         * Sets [Builder.credentials] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentials] with a well-typed [Credentials] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun credentials(credentials: JsonField<Credentials>) = apply {
            body.credentials(credentials)
        }

        fun destinationType(destinationType: BulkExportDestinationType) = apply {
            body.destinationType(destinationType)
        }

        /**
         * Sets [Builder.destinationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationType] with a well-typed
         * [BulkExportDestinationType] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun destinationType(destinationType: JsonField<BulkExportDestinationType>) = apply {
            body.destinationType(destinationType)
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
         * Returns an immutable instance of [DestinationCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .config()
         * .displayName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DestinationCreateParams =
            DestinationCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val config: JsonField<BulkExportDestinationS3Config>,
        private val displayName: JsonField<String>,
        private val credentials: JsonField<Credentials>,
        private val destinationType: JsonField<BulkExportDestinationType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("config")
            @ExcludeMissing
            config: JsonField<BulkExportDestinationS3Config> = JsonMissing.of(),
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credentials")
            @ExcludeMissing
            credentials: JsonField<Credentials> = JsonMissing.of(),
            @JsonProperty("destination_type")
            @ExcludeMissing
            destinationType: JsonField<BulkExportDestinationType> = JsonMissing.of(),
        ) : this(config, displayName, credentials, destinationType, mutableMapOf())

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun config(): BulkExportDestinationS3Config = config.getRequired("config")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun displayName(): String = displayName.getRequired("display_name")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun credentials(): Optional<Credentials> = credentials.getOptional("credentials")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun destinationType(): Optional<BulkExportDestinationType> =
            destinationType.getOptional("destination_type")

        /**
         * Returns the raw JSON value of [config].
         *
         * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("config")
        @ExcludeMissing
        fun _config(): JsonField<BulkExportDestinationS3Config> = config

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [credentials].
         *
         * Unlike [credentials], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credentials")
        @ExcludeMissing
        fun _credentials(): JsonField<Credentials> = credentials

        /**
         * Returns the raw JSON value of [destinationType].
         *
         * Unlike [destinationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destination_type")
        @ExcludeMissing
        fun _destinationType(): JsonField<BulkExportDestinationType> = destinationType

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
             * .config()
             * .displayName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var config: JsonField<BulkExportDestinationS3Config>? = null
            private var displayName: JsonField<String>? = null
            private var credentials: JsonField<Credentials> = JsonMissing.of()
            private var destinationType: JsonField<BulkExportDestinationType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                config = body.config
                displayName = body.displayName
                credentials = body.credentials
                destinationType = body.destinationType
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun config(config: BulkExportDestinationS3Config) = config(JsonField.of(config))

            /**
             * Sets [Builder.config] to an arbitrary JSON value.
             *
             * You should usually call [Builder.config] with a well-typed
             * [BulkExportDestinationS3Config] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun config(config: JsonField<BulkExportDestinationS3Config>) = apply {
                this.config = config
            }

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

            fun credentials(credentials: Credentials?) =
                credentials(JsonField.ofNullable(credentials))

            /** Alias for calling [Builder.credentials] with `credentials.orElse(null)`. */
            fun credentials(credentials: Optional<Credentials>) =
                credentials(credentials.getOrNull())

            /**
             * Sets [Builder.credentials] to an arbitrary JSON value.
             *
             * You should usually call [Builder.credentials] with a well-typed [Credentials] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun credentials(credentials: JsonField<Credentials>) = apply {
                this.credentials = credentials
            }

            fun destinationType(destinationType: BulkExportDestinationType) =
                destinationType(JsonField.of(destinationType))

            /**
             * Sets [Builder.destinationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationType] with a well-typed
             * [BulkExportDestinationType] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun destinationType(destinationType: JsonField<BulkExportDestinationType>) = apply {
                this.destinationType = destinationType
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
             * .config()
             * .displayName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("config", config),
                    checkRequired("displayName", displayName),
                    credentials,
                    destinationType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            config().validate()
            displayName()
            credentials().ifPresent { it.validate() }
            destinationType().ifPresent { it.validate() }
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
            (config.asKnown().getOrNull()?.validity() ?: 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (credentials.asKnown().getOrNull()?.validity() ?: 0) +
                (destinationType.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                config == other.config &&
                displayName == other.displayName &&
                credentials == other.credentials &&
                destinationType == other.destinationType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(config, displayName, credentials, destinationType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{config=$config, displayName=$displayName, credentials=$credentials, destinationType=$destinationType, additionalProperties=$additionalProperties}"
    }

    class Credentials
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accessKeyId: JsonField<String>,
        private val secretAccessKey: JsonField<String>,
        private val sessionToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("access_key_id")
            @ExcludeMissing
            accessKeyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("secret_access_key")
            @ExcludeMissing
            secretAccessKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("session_token")
            @ExcludeMissing
            sessionToken: JsonField<String> = JsonMissing.of(),
        ) : this(accessKeyId, secretAccessKey, sessionToken, mutableMapOf())

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accessKeyId(): String = accessKeyId.getRequired("access_key_id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun secretAccessKey(): String = secretAccessKey.getRequired("secret_access_key")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sessionToken(): Optional<String> = sessionToken.getOptional("session_token")

        /**
         * Returns the raw JSON value of [accessKeyId].
         *
         * Unlike [accessKeyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("access_key_id")
        @ExcludeMissing
        fun _accessKeyId(): JsonField<String> = accessKeyId

        /**
         * Returns the raw JSON value of [secretAccessKey].
         *
         * Unlike [secretAccessKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("secret_access_key")
        @ExcludeMissing
        fun _secretAccessKey(): JsonField<String> = secretAccessKey

        /**
         * Returns the raw JSON value of [sessionToken].
         *
         * Unlike [sessionToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("session_token")
        @ExcludeMissing
        fun _sessionToken(): JsonField<String> = sessionToken

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
             * Returns a mutable builder for constructing an instance of [Credentials].
             *
             * The following fields are required:
             * ```java
             * .accessKeyId()
             * .secretAccessKey()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Credentials]. */
        class Builder internal constructor() {

            private var accessKeyId: JsonField<String>? = null
            private var secretAccessKey: JsonField<String>? = null
            private var sessionToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(credentials: Credentials) = apply {
                accessKeyId = credentials.accessKeyId
                secretAccessKey = credentials.secretAccessKey
                sessionToken = credentials.sessionToken
                additionalProperties = credentials.additionalProperties.toMutableMap()
            }

            fun accessKeyId(accessKeyId: String) = accessKeyId(JsonField.of(accessKeyId))

            /**
             * Sets [Builder.accessKeyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accessKeyId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accessKeyId(accessKeyId: JsonField<String>) = apply {
                this.accessKeyId = accessKeyId
            }

            fun secretAccessKey(secretAccessKey: String) =
                secretAccessKey(JsonField.of(secretAccessKey))

            /**
             * Sets [Builder.secretAccessKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secretAccessKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secretAccessKey(secretAccessKey: JsonField<String>) = apply {
                this.secretAccessKey = secretAccessKey
            }

            fun sessionToken(sessionToken: String?) =
                sessionToken(JsonField.ofNullable(sessionToken))

            /** Alias for calling [Builder.sessionToken] with `sessionToken.orElse(null)`. */
            fun sessionToken(sessionToken: Optional<String>) =
                sessionToken(sessionToken.getOrNull())

            /**
             * Sets [Builder.sessionToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionToken(sessionToken: JsonField<String>) = apply {
                this.sessionToken = sessionToken
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
             * Returns an immutable instance of [Credentials].
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
            fun build(): Credentials =
                Credentials(
                    checkRequired("accessKeyId", accessKeyId),
                    checkRequired("secretAccessKey", secretAccessKey),
                    sessionToken,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Credentials = apply {
            if (validated) {
                return@apply
            }

            accessKeyId()
            secretAccessKey()
            sessionToken()
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
            (if (accessKeyId.asKnown().isPresent) 1 else 0) +
                (if (secretAccessKey.asKnown().isPresent) 1 else 0) +
                (if (sessionToken.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Credentials &&
                accessKeyId == other.accessKeyId &&
                secretAccessKey == other.secretAccessKey &&
                sessionToken == other.sessionToken &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accessKeyId, secretAccessKey, sessionToken, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Credentials{accessKeyId=$accessKeyId, secretAccessKey=$secretAccessKey, sessionToken=$sessionToken, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DestinationCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DestinationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
