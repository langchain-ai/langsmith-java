// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Generate a tokenized link that downloads a single file from a sandbox with no further
 * authentication. This mints a token rather than creating an addressable resource, so it returns
 * 200 with no Location header. The token pins the sandbox, the file path, and the response content
 * type and disposition, so a link cannot be repointed at another file. Links never expire unless
 * expires_in_seconds is set. The link is served from the sandbox service domain, not the API host.
 */
class BoxGenerateDownloadUrlParams
private constructor(
    private val name: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun name(): Optional<String> = Optional.ofNullable(name)

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun path(): String = body.path()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contentDisposition(): Optional<String> = body.contentDisposition()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contentType(): Optional<String> = body.contentType()

    /**
     * ExpiresInSeconds is optional; a link with no expiry never expires.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresInSeconds(): Optional<Long> = body.expiresInSeconds()

    /**
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _path(): JsonField<String> = body._path()

    /**
     * Returns the raw JSON value of [contentDisposition].
     *
     * Unlike [contentDisposition], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _contentDisposition(): JsonField<String> = body._contentDisposition()

    /**
     * Returns the raw JSON value of [contentType].
     *
     * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contentType(): JsonField<String> = body._contentType()

    /**
     * Returns the raw JSON value of [expiresInSeconds].
     *
     * Unlike [expiresInSeconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _expiresInSeconds(): JsonField<Long> = body._expiresInSeconds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BoxGenerateDownloadUrlParams].
         *
         * The following fields are required:
         * ```java
         * .path()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BoxGenerateDownloadUrlParams]. */
    class Builder internal constructor() {

        private var name: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(boxGenerateDownloadUrlParams: BoxGenerateDownloadUrlParams) = apply {
            name = boxGenerateDownloadUrlParams.name
            body = boxGenerateDownloadUrlParams.body.toBuilder()
            additionalHeaders = boxGenerateDownloadUrlParams.additionalHeaders.toBuilder()
            additionalQueryParams = boxGenerateDownloadUrlParams.additionalQueryParams.toBuilder()
        }

        fun name(name: String?) = apply { this.name = name }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [path]
         * - [contentDisposition]
         * - [contentType]
         * - [expiresInSeconds]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun path(path: String) = apply { body.path(path) }

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: JsonField<String>) = apply { body.path(path) }

        fun contentDisposition(contentDisposition: String) = apply {
            body.contentDisposition(contentDisposition)
        }

        /**
         * Sets [Builder.contentDisposition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentDisposition] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contentDisposition(contentDisposition: JsonField<String>) = apply {
            body.contentDisposition(contentDisposition)
        }

        fun contentType(contentType: String) = apply { body.contentType(contentType) }

        /**
         * Sets [Builder.contentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentType(contentType: JsonField<String>) = apply { body.contentType(contentType) }

        /** ExpiresInSeconds is optional; a link with no expiry never expires. */
        fun expiresInSeconds(expiresInSeconds: Long) = apply {
            body.expiresInSeconds(expiresInSeconds)
        }

        /**
         * Sets [Builder.expiresInSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresInSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresInSeconds(expiresInSeconds: JsonField<Long>) = apply {
            body.expiresInSeconds(expiresInSeconds)
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
         * Returns an immutable instance of [BoxGenerateDownloadUrlParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .path()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BoxGenerateDownloadUrlParams =
            BoxGenerateDownloadUrlParams(
                name,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> name ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val path: JsonField<String>,
        private val contentDisposition: JsonField<String>,
        private val contentType: JsonField<String>,
        private val expiresInSeconds: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content_disposition")
            @ExcludeMissing
            contentDisposition: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content_type")
            @ExcludeMissing
            contentType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expires_in_seconds")
            @ExcludeMissing
            expiresInSeconds: JsonField<Long> = JsonMissing.of(),
        ) : this(path, contentDisposition, contentType, expiresInSeconds, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun path(): String = path.getRequired("path")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contentDisposition(): Optional<String> =
            contentDisposition.getOptional("content_disposition")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contentType(): Optional<String> = contentType.getOptional("content_type")

        /**
         * ExpiresInSeconds is optional; a link with no expiry never expires.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun expiresInSeconds(): Optional<Long> = expiresInSeconds.getOptional("expires_in_seconds")

        /**
         * Returns the raw JSON value of [path].
         *
         * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

        /**
         * Returns the raw JSON value of [contentDisposition].
         *
         * Unlike [contentDisposition], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("content_disposition")
        @ExcludeMissing
        fun _contentDisposition(): JsonField<String> = contentDisposition

        /**
         * Returns the raw JSON value of [contentType].
         *
         * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content_type")
        @ExcludeMissing
        fun _contentType(): JsonField<String> = contentType

        /**
         * Returns the raw JSON value of [expiresInSeconds].
         *
         * Unlike [expiresInSeconds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expires_in_seconds")
        @ExcludeMissing
        fun _expiresInSeconds(): JsonField<Long> = expiresInSeconds

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
             * .path()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var path: JsonField<String>? = null
            private var contentDisposition: JsonField<String> = JsonMissing.of()
            private var contentType: JsonField<String> = JsonMissing.of()
            private var expiresInSeconds: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                path = body.path
                contentDisposition = body.contentDisposition
                contentType = body.contentType
                expiresInSeconds = body.expiresInSeconds
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun path(path: String) = path(JsonField.of(path))

            /**
             * Sets [Builder.path] to an arbitrary JSON value.
             *
             * You should usually call [Builder.path] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun path(path: JsonField<String>) = apply { this.path = path }

            fun contentDisposition(contentDisposition: String) =
                contentDisposition(JsonField.of(contentDisposition))

            /**
             * Sets [Builder.contentDisposition] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentDisposition] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentDisposition(contentDisposition: JsonField<String>) = apply {
                this.contentDisposition = contentDisposition
            }

            fun contentType(contentType: String) = contentType(JsonField.of(contentType))

            /**
             * Sets [Builder.contentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentType(contentType: JsonField<String>) = apply {
                this.contentType = contentType
            }

            /** ExpiresInSeconds is optional; a link with no expiry never expires. */
            fun expiresInSeconds(expiresInSeconds: Long) =
                expiresInSeconds(JsonField.of(expiresInSeconds))

            /**
             * Sets [Builder.expiresInSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresInSeconds] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresInSeconds(expiresInSeconds: JsonField<Long>) = apply {
                this.expiresInSeconds = expiresInSeconds
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
             * .path()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("path", path),
                    contentDisposition,
                    contentType,
                    expiresInSeconds,
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

            path()
            contentDisposition()
            contentType()
            expiresInSeconds()
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
            (if (path.asKnown().isPresent) 1 else 0) +
                (if (contentDisposition.asKnown().isPresent) 1 else 0) +
                (if (contentType.asKnown().isPresent) 1 else 0) +
                (if (expiresInSeconds.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                path == other.path &&
                contentDisposition == other.contentDisposition &&
                contentType == other.contentType &&
                expiresInSeconds == other.expiresInSeconds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                path,
                contentDisposition,
                contentType,
                expiresInSeconds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{path=$path, contentDisposition=$contentDisposition, contentType=$contentType, expiresInSeconds=$expiresInSeconds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BoxGenerateDownloadUrlParams &&
            name == other.name &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(name, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BoxGenerateDownloadUrlParams{name=$name, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
