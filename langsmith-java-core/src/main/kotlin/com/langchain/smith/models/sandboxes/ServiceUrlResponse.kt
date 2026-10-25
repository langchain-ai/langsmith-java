// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

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

class ServiceUrlResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val access: JsonField<Access>,
    private val browserUrl: JsonField<String>,
    private val embedOrigins: JsonField<List<String>>,
    private val embedUrl: JsonField<String>,
    private val expiresAt: JsonField<String>,
    private val serviceUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("access") @ExcludeMissing access: JsonField<Access> = JsonMissing.of(),
        @JsonProperty("browser_url")
        @ExcludeMissing
        browserUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("embed_origins")
        @ExcludeMissing
        embedOrigins: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("embed_url") @ExcludeMissing embedUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at") @ExcludeMissing expiresAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("service_url")
        @ExcludeMissing
        serviceUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        token,
        access,
        browserUrl,
        embedOrigins,
        embedUrl,
        expiresAt,
        serviceUrl,
        mutableMapOf(),
    )

    /**
     * Token and ExpiresAt are empty in LangSmith login mode (no token is minted).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): Optional<String> = token.getOptional("token")

    /**
     * Access echoes the enabled LangSmith login level ("restricted"/"workspace"); omitted in token
     * mode.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun access(): Optional<Access> = access.getOptional("access")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun browserUrl(): Optional<String> = browserUrl.getOptional("browser_url")

    /**
     * EmbedOrigins echoes the origins that may embed the URL, normalized; omitted when there are
     * none.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embedOrigins(): Optional<List<String>> = embedOrigins.getOptional("embed_origins")

    /**
     * EmbedURL opens the service in an iframe: the token rides the URL fragment, which no server,
     * log or Referer header sees, and the page it loads trades it for the cookie. Append
     * &redirect=/path to land elsewhere than /. Omitted in LangSmith login mode.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun embedUrl(): Optional<String> = embedUrl.getOptional("embed_url")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<String> = expiresAt.getOptional("expires_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceUrl(): Optional<String> = serviceUrl.getOptional("service_url")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [access].
     *
     * Unlike [access], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access") @ExcludeMissing fun _access(): JsonField<Access> = access

    /**
     * Returns the raw JSON value of [browserUrl].
     *
     * Unlike [browserUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("browser_url") @ExcludeMissing fun _browserUrl(): JsonField<String> = browserUrl

    /**
     * Returns the raw JSON value of [embedOrigins].
     *
     * Unlike [embedOrigins], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("embed_origins")
    @ExcludeMissing
    fun _embedOrigins(): JsonField<List<String>> = embedOrigins

    /**
     * Returns the raw JSON value of [embedUrl].
     *
     * Unlike [embedUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("embed_url") @ExcludeMissing fun _embedUrl(): JsonField<String> = embedUrl

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt(): JsonField<String> = expiresAt

    /**
     * Returns the raw JSON value of [serviceUrl].
     *
     * Unlike [serviceUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service_url") @ExcludeMissing fun _serviceUrl(): JsonField<String> = serviceUrl

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

        /** Returns a mutable builder for constructing an instance of [ServiceUrlResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ServiceUrlResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String> = JsonMissing.of()
        private var access: JsonField<Access> = JsonMissing.of()
        private var browserUrl: JsonField<String> = JsonMissing.of()
        private var embedOrigins: JsonField<MutableList<String>>? = null
        private var embedUrl: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<String> = JsonMissing.of()
        private var serviceUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(serviceUrlResponse: ServiceUrlResponse) = apply {
            token = serviceUrlResponse.token
            access = serviceUrlResponse.access
            browserUrl = serviceUrlResponse.browserUrl
            embedOrigins = serviceUrlResponse.embedOrigins.map { it.toMutableList() }
            embedUrl = serviceUrlResponse.embedUrl
            expiresAt = serviceUrlResponse.expiresAt
            serviceUrl = serviceUrlResponse.serviceUrl
            additionalProperties = serviceUrlResponse.additionalProperties.toMutableMap()
        }

        /** Token and ExpiresAt are empty in LangSmith login mode (no token is minted). */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /**
         * Access echoes the enabled LangSmith login level ("restricted"/"workspace"); omitted in
         * token mode.
         */
        fun access(access: Access) = access(JsonField.of(access))

        /**
         * Sets [Builder.access] to an arbitrary JSON value.
         *
         * You should usually call [Builder.access] with a well-typed [Access] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun access(access: JsonField<Access>) = apply { this.access = access }

        fun browserUrl(browserUrl: String) = browserUrl(JsonField.of(browserUrl))

        /**
         * Sets [Builder.browserUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.browserUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun browserUrl(browserUrl: JsonField<String>) = apply { this.browserUrl = browserUrl }

        /**
         * EmbedOrigins echoes the origins that may embed the URL, normalized; omitted when there
         * are none.
         */
        fun embedOrigins(embedOrigins: List<String>) = embedOrigins(JsonField.of(embedOrigins))

        /**
         * Sets [Builder.embedOrigins] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embedOrigins] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun embedOrigins(embedOrigins: JsonField<List<String>>) = apply {
            this.embedOrigins = embedOrigins.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [embedOrigins].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEmbedOrigin(embedOrigin: String) = apply {
            embedOrigins =
                (embedOrigins ?: JsonField.of(mutableListOf())).also {
                    checkKnown("embedOrigins", it).add(embedOrigin)
                }
        }

        /**
         * EmbedURL opens the service in an iframe: the token rides the URL fragment, which no
         * server, log or Referer header sees, and the page it loads trades it for the cookie.
         * Append &redirect=/path to land elsewhere than /. Omitted in LangSmith login mode.
         */
        fun embedUrl(embedUrl: String) = embedUrl(JsonField.of(embedUrl))

        /**
         * Sets [Builder.embedUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embedUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun embedUrl(embedUrl: JsonField<String>) = apply { this.embedUrl = embedUrl }

        fun expiresAt(expiresAt: String) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expiresAt(expiresAt: JsonField<String>) = apply { this.expiresAt = expiresAt }

        fun serviceUrl(serviceUrl: String) = serviceUrl(JsonField.of(serviceUrl))

        /**
         * Sets [Builder.serviceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serviceUrl(serviceUrl: JsonField<String>) = apply { this.serviceUrl = serviceUrl }

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
         * Returns an immutable instance of [ServiceUrlResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ServiceUrlResponse =
            ServiceUrlResponse(
                token,
                access,
                browserUrl,
                (embedOrigins ?: JsonMissing.of()).map { it.toImmutable() },
                embedUrl,
                expiresAt,
                serviceUrl,
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
    fun validate(): ServiceUrlResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        access().ifPresent { it.validate() }
        browserUrl()
        embedOrigins()
        embedUrl()
        expiresAt()
        serviceUrl()
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
        (if (token.asKnown().isPresent) 1 else 0) +
            (access.asKnown().getOrNull()?.validity() ?: 0) +
            (if (browserUrl.asKnown().isPresent) 1 else 0) +
            (embedOrigins.asKnown().getOrNull()?.size ?: 0) +
            (if (embedUrl.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (serviceUrl.asKnown().isPresent) 1 else 0)

    /**
     * Access echoes the enabled LangSmith login level ("restricted"/"workspace"); omitted in token
     * mode.
     */
    class Access @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val RESTRICTED = of("restricted")

            @JvmField val WORKSPACE = of("workspace")

            @JvmStatic fun of(value: String) = Access(JsonField.of(value))
        }

        /** An enum containing [Access]'s known values. */
        enum class Known {
            RESTRICTED,
            WORKSPACE,
        }

        /**
         * An enum containing [Access]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Access] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RESTRICTED,
            WORKSPACE,
            /** An enum member indicating that [Access] was instantiated with an unknown value. */
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
                RESTRICTED -> Value.RESTRICTED
                WORKSPACE -> Value.WORKSPACE
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
                RESTRICTED -> Known.RESTRICTED
                WORKSPACE -> Known.WORKSPACE
                else -> throw LangChainInvalidDataException("Unknown Access: $value")
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
        fun validate(): Access = apply {
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

            return other is Access && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ServiceUrlResponse &&
            token == other.token &&
            access == other.access &&
            browserUrl == other.browserUrl &&
            embedOrigins == other.embedOrigins &&
            embedUrl == other.embedUrl &&
            expiresAt == other.expiresAt &&
            serviceUrl == other.serviceUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            access,
            browserUrl,
            embedOrigins,
            embedUrl,
            expiresAt,
            serviceUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ServiceUrlResponse{token=$token, access=$access, browserUrl=$browserUrl, embedOrigins=$embedOrigins, embedUrl=$embedUrl, expiresAt=$expiresAt, serviceUrl=$serviceUrl, additionalProperties=$additionalProperties}"
}
