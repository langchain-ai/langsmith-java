// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DownloadUrlResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val downloadUrl: JsonField<String>,
    private val expiresAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("download_url")
        @ExcludeMissing
        downloadUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at") @ExcludeMissing expiresAt: JsonField<String> = JsonMissing.of(),
    ) : this(token, downloadUrl, expiresAt, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun downloadUrl(): String = downloadUrl.getRequired("download_url")

    /**
     * ExpiresAt is null for a link that never expires.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<String> = expiresAt.getOptional("expires_at")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [downloadUrl].
     *
     * Unlike [downloadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("download_url")
    @ExcludeMissing
    fun _downloadUrl(): JsonField<String> = downloadUrl

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt(): JsonField<String> = expiresAt

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
         * Returns a mutable builder for constructing an instance of [DownloadUrlResponse].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .downloadUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DownloadUrlResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var downloadUrl: JsonField<String>? = null
        private var expiresAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(downloadUrlResponse: DownloadUrlResponse) = apply {
            token = downloadUrlResponse.token
            downloadUrl = downloadUrlResponse.downloadUrl
            expiresAt = downloadUrlResponse.expiresAt
            additionalProperties = downloadUrlResponse.additionalProperties.toMutableMap()
        }

        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun downloadUrl(downloadUrl: String) = downloadUrl(JsonField.of(downloadUrl))

        /**
         * Sets [Builder.downloadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downloadUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun downloadUrl(downloadUrl: JsonField<String>) = apply { this.downloadUrl = downloadUrl }

        /** ExpiresAt is null for a link that never expires. */
        fun expiresAt(expiresAt: String?) = expiresAt(JsonField.ofNullable(expiresAt))

        /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
        fun expiresAt(expiresAt: Optional<String>) = expiresAt(expiresAt.getOrNull())

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expiresAt(expiresAt: JsonField<String>) = apply { this.expiresAt = expiresAt }

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
         * Returns an immutable instance of [DownloadUrlResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .downloadUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DownloadUrlResponse =
            DownloadUrlResponse(
                checkRequired("token", token),
                checkRequired("downloadUrl", downloadUrl),
                expiresAt,
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
    fun validate(): DownloadUrlResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        downloadUrl()
        expiresAt()
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
            (if (downloadUrl.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DownloadUrlResponse &&
            token == other.token &&
            downloadUrl == other.downloadUrl &&
            expiresAt == other.expiresAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(token, downloadUrl, expiresAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DownloadUrlResponse{token=$token, downloadUrl=$downloadUrl, expiresAt=$expiresAt, additionalProperties=$additionalProperties}"
}
