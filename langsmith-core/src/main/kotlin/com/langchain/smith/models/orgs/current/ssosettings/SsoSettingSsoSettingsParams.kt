// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.ssosettings

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

/** Create SSO provider settings for the current organization. */
class SsoSettingSsoSettingsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultWorkspaceIds(): List<String> = body.defaultWorkspaceIds()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultWorkspaceRoleId(): String = body.defaultWorkspaceRoleId()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attributeMapping(): Optional<AttributeMapping> = body.attributeMapping()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadataUrl(): Optional<String> = body.metadataUrl()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadataXml(): Optional<String> = body.metadataXml()

    /**
     * Returns the raw JSON value of [defaultWorkspaceIds].
     *
     * Unlike [defaultWorkspaceIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _defaultWorkspaceIds(): JsonField<List<String>> = body._defaultWorkspaceIds()

    /**
     * Returns the raw JSON value of [defaultWorkspaceRoleId].
     *
     * Unlike [defaultWorkspaceRoleId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _defaultWorkspaceRoleId(): JsonField<String> = body._defaultWorkspaceRoleId()

    /**
     * Returns the raw JSON value of [attributeMapping].
     *
     * Unlike [attributeMapping], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _attributeMapping(): JsonField<AttributeMapping> = body._attributeMapping()

    /**
     * Returns the raw JSON value of [metadataUrl].
     *
     * Unlike [metadataUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadataUrl(): JsonField<String> = body._metadataUrl()

    /**
     * Returns the raw JSON value of [metadataXml].
     *
     * Unlike [metadataXml], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadataXml(): JsonField<String> = body._metadataXml()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SsoSettingSsoSettingsParams].
         *
         * The following fields are required:
         * ```java
         * .defaultWorkspaceIds()
         * .defaultWorkspaceRoleId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SsoSettingSsoSettingsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ssoSettingSsoSettingsParams: SsoSettingSsoSettingsParams) = apply {
            body = ssoSettingSsoSettingsParams.body.toBuilder()
            additionalHeaders = ssoSettingSsoSettingsParams.additionalHeaders.toBuilder()
            additionalQueryParams = ssoSettingSsoSettingsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [defaultWorkspaceIds]
         * - [defaultWorkspaceRoleId]
         * - [attributeMapping]
         * - [metadataUrl]
         * - [metadataXml]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun defaultWorkspaceIds(defaultWorkspaceIds: List<String>) = apply {
            body.defaultWorkspaceIds(defaultWorkspaceIds)
        }

        /**
         * Sets [Builder.defaultWorkspaceIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultWorkspaceIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun defaultWorkspaceIds(defaultWorkspaceIds: JsonField<List<String>>) = apply {
            body.defaultWorkspaceIds(defaultWorkspaceIds)
        }

        /**
         * Adds a single [String] to [defaultWorkspaceIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDefaultWorkspaceId(defaultWorkspaceId: String) = apply {
            body.addDefaultWorkspaceId(defaultWorkspaceId)
        }

        fun defaultWorkspaceRoleId(defaultWorkspaceRoleId: String) = apply {
            body.defaultWorkspaceRoleId(defaultWorkspaceRoleId)
        }

        /**
         * Sets [Builder.defaultWorkspaceRoleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultWorkspaceRoleId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultWorkspaceRoleId(defaultWorkspaceRoleId: JsonField<String>) = apply {
            body.defaultWorkspaceRoleId(defaultWorkspaceRoleId)
        }

        fun attributeMapping(attributeMapping: AttributeMapping) = apply {
            body.attributeMapping(attributeMapping)
        }

        /**
         * Sets [Builder.attributeMapping] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributeMapping] with a well-typed [AttributeMapping]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun attributeMapping(attributeMapping: JsonField<AttributeMapping>) = apply {
            body.attributeMapping(attributeMapping)
        }

        fun metadataUrl(metadataUrl: String?) = apply { body.metadataUrl(metadataUrl) }

        /** Alias for calling [Builder.metadataUrl] with `metadataUrl.orElse(null)`. */
        fun metadataUrl(metadataUrl: Optional<String>) = metadataUrl(metadataUrl.getOrNull())

        /**
         * Sets [Builder.metadataUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadataUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadataUrl(metadataUrl: JsonField<String>) = apply { body.metadataUrl(metadataUrl) }

        fun metadataXml(metadataXml: String?) = apply { body.metadataXml(metadataXml) }

        /** Alias for calling [Builder.metadataXml] with `metadataXml.orElse(null)`. */
        fun metadataXml(metadataXml: Optional<String>) = metadataXml(metadataXml.getOrNull())

        /**
         * Sets [Builder.metadataXml] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadataXml] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadataXml(metadataXml: JsonField<String>) = apply { body.metadataXml(metadataXml) }

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
         * Returns an immutable instance of [SsoSettingSsoSettingsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .defaultWorkspaceIds()
         * .defaultWorkspaceRoleId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SsoSettingSsoSettingsParams =
            SsoSettingSsoSettingsParams(
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
        private val defaultWorkspaceIds: JsonField<List<String>>,
        private val defaultWorkspaceRoleId: JsonField<String>,
        private val attributeMapping: JsonField<AttributeMapping>,
        private val metadataUrl: JsonField<String>,
        private val metadataXml: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("default_workspace_ids")
            @ExcludeMissing
            defaultWorkspaceIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("default_workspace_role_id")
            @ExcludeMissing
            defaultWorkspaceRoleId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attribute_mapping")
            @ExcludeMissing
            attributeMapping: JsonField<AttributeMapping> = JsonMissing.of(),
            @JsonProperty("metadata_url")
            @ExcludeMissing
            metadataUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata_xml")
            @ExcludeMissing
            metadataXml: JsonField<String> = JsonMissing.of(),
        ) : this(
            defaultWorkspaceIds,
            defaultWorkspaceRoleId,
            attributeMapping,
            metadataUrl,
            metadataXml,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun defaultWorkspaceIds(): List<String> =
            defaultWorkspaceIds.getRequired("default_workspace_ids")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun defaultWorkspaceRoleId(): String =
            defaultWorkspaceRoleId.getRequired("default_workspace_role_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun attributeMapping(): Optional<AttributeMapping> =
            attributeMapping.getOptional("attribute_mapping")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadataUrl(): Optional<String> = metadataUrl.getOptional("metadata_url")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadataXml(): Optional<String> = metadataXml.getOptional("metadata_xml")

        /**
         * Returns the raw JSON value of [defaultWorkspaceIds].
         *
         * Unlike [defaultWorkspaceIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("default_workspace_ids")
        @ExcludeMissing
        fun _defaultWorkspaceIds(): JsonField<List<String>> = defaultWorkspaceIds

        /**
         * Returns the raw JSON value of [defaultWorkspaceRoleId].
         *
         * Unlike [defaultWorkspaceRoleId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("default_workspace_role_id")
        @ExcludeMissing
        fun _defaultWorkspaceRoleId(): JsonField<String> = defaultWorkspaceRoleId

        /**
         * Returns the raw JSON value of [attributeMapping].
         *
         * Unlike [attributeMapping], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attribute_mapping")
        @ExcludeMissing
        fun _attributeMapping(): JsonField<AttributeMapping> = attributeMapping

        /**
         * Returns the raw JSON value of [metadataUrl].
         *
         * Unlike [metadataUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata_url")
        @ExcludeMissing
        fun _metadataUrl(): JsonField<String> = metadataUrl

        /**
         * Returns the raw JSON value of [metadataXml].
         *
         * Unlike [metadataXml], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata_xml")
        @ExcludeMissing
        fun _metadataXml(): JsonField<String> = metadataXml

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
             * .defaultWorkspaceIds()
             * .defaultWorkspaceRoleId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var defaultWorkspaceIds: JsonField<MutableList<String>>? = null
            private var defaultWorkspaceRoleId: JsonField<String>? = null
            private var attributeMapping: JsonField<AttributeMapping> = JsonMissing.of()
            private var metadataUrl: JsonField<String> = JsonMissing.of()
            private var metadataXml: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                defaultWorkspaceIds = body.defaultWorkspaceIds.map { it.toMutableList() }
                defaultWorkspaceRoleId = body.defaultWorkspaceRoleId
                attributeMapping = body.attributeMapping
                metadataUrl = body.metadataUrl
                metadataXml = body.metadataXml
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun defaultWorkspaceIds(defaultWorkspaceIds: List<String>) =
                defaultWorkspaceIds(JsonField.of(defaultWorkspaceIds))

            /**
             * Sets [Builder.defaultWorkspaceIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultWorkspaceIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun defaultWorkspaceIds(defaultWorkspaceIds: JsonField<List<String>>) = apply {
                this.defaultWorkspaceIds = defaultWorkspaceIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [defaultWorkspaceIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDefaultWorkspaceId(defaultWorkspaceId: String) = apply {
                defaultWorkspaceIds =
                    (defaultWorkspaceIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("defaultWorkspaceIds", it).add(defaultWorkspaceId)
                    }
            }

            fun defaultWorkspaceRoleId(defaultWorkspaceRoleId: String) =
                defaultWorkspaceRoleId(JsonField.of(defaultWorkspaceRoleId))

            /**
             * Sets [Builder.defaultWorkspaceRoleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultWorkspaceRoleId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun defaultWorkspaceRoleId(defaultWorkspaceRoleId: JsonField<String>) = apply {
                this.defaultWorkspaceRoleId = defaultWorkspaceRoleId
            }

            fun attributeMapping(attributeMapping: AttributeMapping) =
                attributeMapping(JsonField.of(attributeMapping))

            /**
             * Sets [Builder.attributeMapping] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attributeMapping] with a well-typed
             * [AttributeMapping] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun attributeMapping(attributeMapping: JsonField<AttributeMapping>) = apply {
                this.attributeMapping = attributeMapping
            }

            fun metadataUrl(metadataUrl: String?) = metadataUrl(JsonField.ofNullable(metadataUrl))

            /** Alias for calling [Builder.metadataUrl] with `metadataUrl.orElse(null)`. */
            fun metadataUrl(metadataUrl: Optional<String>) = metadataUrl(metadataUrl.getOrNull())

            /**
             * Sets [Builder.metadataUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadataUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadataUrl(metadataUrl: JsonField<String>) = apply {
                this.metadataUrl = metadataUrl
            }

            fun metadataXml(metadataXml: String?) = metadataXml(JsonField.ofNullable(metadataXml))

            /** Alias for calling [Builder.metadataXml] with `metadataXml.orElse(null)`. */
            fun metadataXml(metadataXml: Optional<String>) = metadataXml(metadataXml.getOrNull())

            /**
             * Sets [Builder.metadataXml] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadataXml] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadataXml(metadataXml: JsonField<String>) = apply {
                this.metadataXml = metadataXml
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
             * .defaultWorkspaceIds()
             * .defaultWorkspaceRoleId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("defaultWorkspaceIds", defaultWorkspaceIds).map {
                        it.toImmutable()
                    },
                    checkRequired("defaultWorkspaceRoleId", defaultWorkspaceRoleId),
                    attributeMapping,
                    metadataUrl,
                    metadataXml,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            defaultWorkspaceIds()
            defaultWorkspaceRoleId()
            attributeMapping().ifPresent { it.validate() }
            metadataUrl()
            metadataXml()
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
            (defaultWorkspaceIds.asKnown().getOrNull()?.size ?: 0) +
                (if (defaultWorkspaceRoleId.asKnown().isPresent) 1 else 0) +
                (attributeMapping.asKnown().getOrNull()?.validity() ?: 0) +
                (if (metadataUrl.asKnown().isPresent) 1 else 0) +
                (if (metadataXml.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                defaultWorkspaceIds == other.defaultWorkspaceIds &&
                defaultWorkspaceRoleId == other.defaultWorkspaceRoleId &&
                attributeMapping == other.attributeMapping &&
                metadataUrl == other.metadataUrl &&
                metadataXml == other.metadataXml &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                defaultWorkspaceIds,
                defaultWorkspaceRoleId,
                attributeMapping,
                metadataUrl,
                metadataXml,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{defaultWorkspaceIds=$defaultWorkspaceIds, defaultWorkspaceRoleId=$defaultWorkspaceRoleId, attributeMapping=$attributeMapping, metadataUrl=$metadataUrl, metadataXml=$metadataXml, additionalProperties=$additionalProperties}"
    }

    class AttributeMapping
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

            /** Returns a mutable builder for constructing an instance of [AttributeMapping]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AttributeMapping]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(attributeMapping: AttributeMapping) = apply {
                additionalProperties = attributeMapping.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [AttributeMapping].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AttributeMapping = AttributeMapping(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): AttributeMapping = apply {
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

            return other is AttributeMapping && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "AttributeMapping{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SsoSettingSsoSettingsParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SsoSettingSsoSettingsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
