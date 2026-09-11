// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

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
 * Generate a tokenized link that downloads a single file from a sandbox with no further
 * authentication. This mints a token rather than creating an addressable resource, so it returns
 * 200 with no Location header. The token pins the sandbox, the file path, the response content type
 * and disposition, and the sandbox flags, so a link cannot be repointed at another file or served
 * under a weaker policy. The file is always served with a Content-Security-Policy: a sandbox
 * directive, plus a default-src holding every fetch to the sandbox's own download host and a set of
 * pre-approved third-party origins. csp_sandbox_flags may loosen the sandbox with allow-downloads,
 * allow-forms, allow-modals, allow-orientation-lock, allow-pointer-lock, allow-popups,
 * allow-presentation, allow-scripts, or allow-top-navigation-by-user-activation. allow-same-origin
 * is not accepted, so a served file never shares an origin with anything. csp_source_bundles
 * selects the third-party origins: cdnjs, google-fonts, jsdelivr, and unpkg are all allowed when
 * the field is omitted, and 'none' holds the file to the sandbox alone. Because every file of one
 * sandbox is served from the same host, a page can load sibling files it has links for, but only by
 * their own link URLs. Links never expire unless expires_in_seconds is set. The link is served from
 * the sandbox service domain, not the API host.
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
     * CSPSandboxFlags loosen the CSP sandbox the file is served under; omit for the most
     * restrictive policy.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cspSandboxFlags(): Optional<List<CspSandboxFlag>> = body.cspSandboxFlags()

    /**
     * CSPSourceBundles allow the served file to fetch from named third-party origins; omit to send
     * no fetch directive.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cspSourceBundles(): Optional<List<CspSourceBundle>> = body.cspSourceBundles()

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
     * Returns the raw JSON value of [cspSandboxFlags].
     *
     * Unlike [cspSandboxFlags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cspSandboxFlags(): JsonField<List<CspSandboxFlag>> = body._cspSandboxFlags()

    /**
     * Returns the raw JSON value of [cspSourceBundles].
     *
     * Unlike [cspSourceBundles], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cspSourceBundles(): JsonField<List<CspSourceBundle>> = body._cspSourceBundles()

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
         * - [cspSandboxFlags]
         * - [cspSourceBundles]
         * - etc.
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

        /**
         * CSPSandboxFlags loosen the CSP sandbox the file is served under; omit for the most
         * restrictive policy.
         */
        fun cspSandboxFlags(cspSandboxFlags: List<CspSandboxFlag>) = apply {
            body.cspSandboxFlags(cspSandboxFlags)
        }

        /**
         * Sets [Builder.cspSandboxFlags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cspSandboxFlags] with a well-typed
         * `List<CspSandboxFlag>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun cspSandboxFlags(cspSandboxFlags: JsonField<List<CspSandboxFlag>>) = apply {
            body.cspSandboxFlags(cspSandboxFlags)
        }

        /**
         * Adds a single [CspSandboxFlag] to [cspSandboxFlags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCspSandboxFlag(cspSandboxFlag: CspSandboxFlag) = apply {
            body.addCspSandboxFlag(cspSandboxFlag)
        }

        /**
         * CSPSourceBundles allow the served file to fetch from named third-party origins; omit to
         * send no fetch directive.
         */
        fun cspSourceBundles(cspSourceBundles: List<CspSourceBundle>) = apply {
            body.cspSourceBundles(cspSourceBundles)
        }

        /**
         * Sets [Builder.cspSourceBundles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cspSourceBundles] with a well-typed
         * `List<CspSourceBundle>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun cspSourceBundles(cspSourceBundles: JsonField<List<CspSourceBundle>>) = apply {
            body.cspSourceBundles(cspSourceBundles)
        }

        /**
         * Adds a single [CspSourceBundle] to [cspSourceBundles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCspSourceBundle(cspSourceBundle: CspSourceBundle) = apply {
            body.addCspSourceBundle(cspSourceBundle)
        }

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
        private val cspSandboxFlags: JsonField<List<CspSandboxFlag>>,
        private val cspSourceBundles: JsonField<List<CspSourceBundle>>,
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
            @JsonProperty("csp_sandbox_flags")
            @ExcludeMissing
            cspSandboxFlags: JsonField<List<CspSandboxFlag>> = JsonMissing.of(),
            @JsonProperty("csp_source_bundles")
            @ExcludeMissing
            cspSourceBundles: JsonField<List<CspSourceBundle>> = JsonMissing.of(),
            @JsonProperty("expires_in_seconds")
            @ExcludeMissing
            expiresInSeconds: JsonField<Long> = JsonMissing.of(),
        ) : this(
            path,
            contentDisposition,
            contentType,
            cspSandboxFlags,
            cspSourceBundles,
            expiresInSeconds,
            mutableMapOf(),
        )

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
         * CSPSandboxFlags loosen the CSP sandbox the file is served under; omit for the most
         * restrictive policy.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cspSandboxFlags(): Optional<List<CspSandboxFlag>> =
            cspSandboxFlags.getOptional("csp_sandbox_flags")

        /**
         * CSPSourceBundles allow the served file to fetch from named third-party origins; omit to
         * send no fetch directive.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cspSourceBundles(): Optional<List<CspSourceBundle>> =
            cspSourceBundles.getOptional("csp_source_bundles")

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
         * Returns the raw JSON value of [cspSandboxFlags].
         *
         * Unlike [cspSandboxFlags], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("csp_sandbox_flags")
        @ExcludeMissing
        fun _cspSandboxFlags(): JsonField<List<CspSandboxFlag>> = cspSandboxFlags

        /**
         * Returns the raw JSON value of [cspSourceBundles].
         *
         * Unlike [cspSourceBundles], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("csp_source_bundles")
        @ExcludeMissing
        fun _cspSourceBundles(): JsonField<List<CspSourceBundle>> = cspSourceBundles

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
            private var cspSandboxFlags: JsonField<MutableList<CspSandboxFlag>>? = null
            private var cspSourceBundles: JsonField<MutableList<CspSourceBundle>>? = null
            private var expiresInSeconds: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                path = body.path
                contentDisposition = body.contentDisposition
                contentType = body.contentType
                cspSandboxFlags = body.cspSandboxFlags.map { it.toMutableList() }
                cspSourceBundles = body.cspSourceBundles.map { it.toMutableList() }
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

            /**
             * CSPSandboxFlags loosen the CSP sandbox the file is served under; omit for the most
             * restrictive policy.
             */
            fun cspSandboxFlags(cspSandboxFlags: List<CspSandboxFlag>) =
                cspSandboxFlags(JsonField.of(cspSandboxFlags))

            /**
             * Sets [Builder.cspSandboxFlags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cspSandboxFlags] with a well-typed
             * `List<CspSandboxFlag>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun cspSandboxFlags(cspSandboxFlags: JsonField<List<CspSandboxFlag>>) = apply {
                this.cspSandboxFlags = cspSandboxFlags.map { it.toMutableList() }
            }

            /**
             * Adds a single [CspSandboxFlag] to [cspSandboxFlags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCspSandboxFlag(cspSandboxFlag: CspSandboxFlag) = apply {
                cspSandboxFlags =
                    (cspSandboxFlags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("cspSandboxFlags", it).add(cspSandboxFlag)
                    }
            }

            /**
             * CSPSourceBundles allow the served file to fetch from named third-party origins; omit
             * to send no fetch directive.
             */
            fun cspSourceBundles(cspSourceBundles: List<CspSourceBundle>) =
                cspSourceBundles(JsonField.of(cspSourceBundles))

            /**
             * Sets [Builder.cspSourceBundles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cspSourceBundles] with a well-typed
             * `List<CspSourceBundle>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun cspSourceBundles(cspSourceBundles: JsonField<List<CspSourceBundle>>) = apply {
                this.cspSourceBundles = cspSourceBundles.map { it.toMutableList() }
            }

            /**
             * Adds a single [CspSourceBundle] to [cspSourceBundles].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCspSourceBundle(cspSourceBundle: CspSourceBundle) = apply {
                cspSourceBundles =
                    (cspSourceBundles ?: JsonField.of(mutableListOf())).also {
                        checkKnown("cspSourceBundles", it).add(cspSourceBundle)
                    }
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
                    (cspSandboxFlags ?: JsonMissing.of()).map { it.toImmutable() },
                    (cspSourceBundles ?: JsonMissing.of()).map { it.toImmutable() },
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
            cspSandboxFlags().ifPresent { it.forEach { it.validate() } }
            cspSourceBundles().ifPresent { it.forEach { it.validate() } }
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
                (cspSandboxFlags.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (cspSourceBundles.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (expiresInSeconds.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                path == other.path &&
                contentDisposition == other.contentDisposition &&
                contentType == other.contentType &&
                cspSandboxFlags == other.cspSandboxFlags &&
                cspSourceBundles == other.cspSourceBundles &&
                expiresInSeconds == other.expiresInSeconds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                path,
                contentDisposition,
                contentType,
                cspSandboxFlags,
                cspSourceBundles,
                expiresInSeconds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{path=$path, contentDisposition=$contentDisposition, contentType=$contentType, cspSandboxFlags=$cspSandboxFlags, cspSourceBundles=$cspSourceBundles, expiresInSeconds=$expiresInSeconds, additionalProperties=$additionalProperties}"
    }

    class CspSandboxFlag @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ALLOW_DOWNLOADS = of("allow-downloads")

            @JvmField val ALLOW_FORMS = of("allow-forms")

            @JvmField val ALLOW_MODALS = of("allow-modals")

            @JvmField val ALLOW_ORIENTATION_LOCK = of("allow-orientation-lock")

            @JvmField val ALLOW_POINTER_LOCK = of("allow-pointer-lock")

            @JvmField val ALLOW_POPUPS = of("allow-popups")

            @JvmField val ALLOW_PRESENTATION = of("allow-presentation")

            @JvmField val ALLOW_SCRIPTS = of("allow-scripts")

            @JvmField
            val ALLOW_TOP_NAVIGATION_BY_USER_ACTIVATION =
                of("allow-top-navigation-by-user-activation")

            @JvmStatic fun of(value: String) = CspSandboxFlag(JsonField.of(value))
        }

        /** An enum containing [CspSandboxFlag]'s known values. */
        enum class Known {
            ALLOW_DOWNLOADS,
            ALLOW_FORMS,
            ALLOW_MODALS,
            ALLOW_ORIENTATION_LOCK,
            ALLOW_POINTER_LOCK,
            ALLOW_POPUPS,
            ALLOW_PRESENTATION,
            ALLOW_SCRIPTS,
            ALLOW_TOP_NAVIGATION_BY_USER_ACTIVATION,
        }

        /**
         * An enum containing [CspSandboxFlag]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CspSandboxFlag] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALLOW_DOWNLOADS,
            ALLOW_FORMS,
            ALLOW_MODALS,
            ALLOW_ORIENTATION_LOCK,
            ALLOW_POINTER_LOCK,
            ALLOW_POPUPS,
            ALLOW_PRESENTATION,
            ALLOW_SCRIPTS,
            ALLOW_TOP_NAVIGATION_BY_USER_ACTIVATION,
            /**
             * An enum member indicating that [CspSandboxFlag] was instantiated with an unknown
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
                ALLOW_DOWNLOADS -> Value.ALLOW_DOWNLOADS
                ALLOW_FORMS -> Value.ALLOW_FORMS
                ALLOW_MODALS -> Value.ALLOW_MODALS
                ALLOW_ORIENTATION_LOCK -> Value.ALLOW_ORIENTATION_LOCK
                ALLOW_POINTER_LOCK -> Value.ALLOW_POINTER_LOCK
                ALLOW_POPUPS -> Value.ALLOW_POPUPS
                ALLOW_PRESENTATION -> Value.ALLOW_PRESENTATION
                ALLOW_SCRIPTS -> Value.ALLOW_SCRIPTS
                ALLOW_TOP_NAVIGATION_BY_USER_ACTIVATION ->
                    Value.ALLOW_TOP_NAVIGATION_BY_USER_ACTIVATION
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
                ALLOW_DOWNLOADS -> Known.ALLOW_DOWNLOADS
                ALLOW_FORMS -> Known.ALLOW_FORMS
                ALLOW_MODALS -> Known.ALLOW_MODALS
                ALLOW_ORIENTATION_LOCK -> Known.ALLOW_ORIENTATION_LOCK
                ALLOW_POINTER_LOCK -> Known.ALLOW_POINTER_LOCK
                ALLOW_POPUPS -> Known.ALLOW_POPUPS
                ALLOW_PRESENTATION -> Known.ALLOW_PRESENTATION
                ALLOW_SCRIPTS -> Known.ALLOW_SCRIPTS
                ALLOW_TOP_NAVIGATION_BY_USER_ACTIVATION ->
                    Known.ALLOW_TOP_NAVIGATION_BY_USER_ACTIVATION
                else -> throw LangChainInvalidDataException("Unknown CspSandboxFlag: $value")
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
        fun validate(): CspSandboxFlag = apply {
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

            return other is CspSandboxFlag && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class CspSourceBundle @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CDNJS = of("cdnjs")

            @JvmField val GOOGLE_FONTS = of("google-fonts")

            @JvmField val JSDELIVR = of("jsdelivr")

            @JvmField val UNPKG = of("unpkg")

            @JvmField val NONE = of("none")

            @JvmStatic fun of(value: String) = CspSourceBundle(JsonField.of(value))
        }

        /** An enum containing [CspSourceBundle]'s known values. */
        enum class Known {
            CDNJS,
            GOOGLE_FONTS,
            JSDELIVR,
            UNPKG,
            NONE,
        }

        /**
         * An enum containing [CspSourceBundle]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CspSourceBundle] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CDNJS,
            GOOGLE_FONTS,
            JSDELIVR,
            UNPKG,
            NONE,
            /**
             * An enum member indicating that [CspSourceBundle] was instantiated with an unknown
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
                CDNJS -> Value.CDNJS
                GOOGLE_FONTS -> Value.GOOGLE_FONTS
                JSDELIVR -> Value.JSDELIVR
                UNPKG -> Value.UNPKG
                NONE -> Value.NONE
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
                CDNJS -> Known.CDNJS
                GOOGLE_FONTS -> Known.GOOGLE_FONTS
                JSDELIVR -> Known.JSDELIVR
                UNPKG -> Known.UNPKG
                NONE -> Known.NONE
                else -> throw LangChainInvalidDataException("Unknown CspSourceBundle: $value")
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
        fun validate(): CspSourceBundle = apply {
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

            return other is CspSourceBundle && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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
