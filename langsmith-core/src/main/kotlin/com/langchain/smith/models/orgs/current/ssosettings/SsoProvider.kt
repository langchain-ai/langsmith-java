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
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SsoProvider
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val defaultWorkspaceIds: JsonField<List<String>>,
    private val defaultWorkspaceRoleId: JsonField<String>,
    private val organizationId: JsonField<String>,
    private val providerId: JsonField<String>,
    private val metadataUrl: JsonField<String>,
    private val metadataXml: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("default_workspace_ids")
        @ExcludeMissing
        defaultWorkspaceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("default_workspace_role_id")
        @ExcludeMissing
        defaultWorkspaceRoleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata_url")
        @ExcludeMissing
        metadataUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata_xml")
        @ExcludeMissing
        metadataXml: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        defaultWorkspaceIds,
        defaultWorkspaceRoleId,
        organizationId,
        providerId,
        metadataUrl,
        metadataXml,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

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
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationId(): String = organizationId.getRequired("organization_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerId(): String = providerId.getRequired("provider_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadataUrl(): Optional<String> = metadataUrl.getOptional("metadata_url")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadataXml(): Optional<String> = metadataXml.getOptional("metadata_xml")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [defaultWorkspaceIds].
     *
     * Unlike [defaultWorkspaceIds], this method doesn't throw if the JSON field has an unexpected
     * type.
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
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [providerId].
     *
     * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

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
         * Returns a mutable builder for constructing an instance of [SsoProvider].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .defaultWorkspaceIds()
         * .defaultWorkspaceRoleId()
         * .organizationId()
         * .providerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SsoProvider]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var defaultWorkspaceIds: JsonField<MutableList<String>>? = null
        private var defaultWorkspaceRoleId: JsonField<String>? = null
        private var organizationId: JsonField<String>? = null
        private var providerId: JsonField<String>? = null
        private var metadataUrl: JsonField<String> = JsonMissing.of()
        private var metadataXml: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ssoProvider: SsoProvider) = apply {
            id = ssoProvider.id
            defaultWorkspaceIds = ssoProvider.defaultWorkspaceIds.map { it.toMutableList() }
            defaultWorkspaceRoleId = ssoProvider.defaultWorkspaceRoleId
            organizationId = ssoProvider.organizationId
            providerId = ssoProvider.providerId
            metadataUrl = ssoProvider.metadataUrl
            metadataXml = ssoProvider.metadataXml
            additionalProperties = ssoProvider.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun defaultWorkspaceIds(defaultWorkspaceIds: List<String>) =
            defaultWorkspaceIds(JsonField.of(defaultWorkspaceIds))

        /**
         * Sets [Builder.defaultWorkspaceIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultWorkspaceIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * You should usually call [Builder.defaultWorkspaceRoleId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultWorkspaceRoleId(defaultWorkspaceRoleId: JsonField<String>) = apply {
            this.defaultWorkspaceRoleId = defaultWorkspaceRoleId
        }

        fun organizationId(organizationId: String) = organizationId(JsonField.of(organizationId))

        /**
         * Sets [Builder.organizationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationId(organizationId: JsonField<String>) = apply {
            this.organizationId = organizationId
        }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /**
         * Sets [Builder.providerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun metadataUrl(metadataUrl: String?) = metadataUrl(JsonField.ofNullable(metadataUrl))

        /** Alias for calling [Builder.metadataUrl] with `metadataUrl.orElse(null)`. */
        fun metadataUrl(metadataUrl: Optional<String>) = metadataUrl(metadataUrl.getOrNull())

        /**
         * Sets [Builder.metadataUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadataUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadataUrl(metadataUrl: JsonField<String>) = apply { this.metadataUrl = metadataUrl }

        fun metadataXml(metadataXml: String?) = metadataXml(JsonField.ofNullable(metadataXml))

        /** Alias for calling [Builder.metadataXml] with `metadataXml.orElse(null)`. */
        fun metadataXml(metadataXml: Optional<String>) = metadataXml(metadataXml.getOrNull())

        /**
         * Sets [Builder.metadataXml] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadataXml] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadataXml(metadataXml: JsonField<String>) = apply { this.metadataXml = metadataXml }

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
         * Returns an immutable instance of [SsoProvider].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .defaultWorkspaceIds()
         * .defaultWorkspaceRoleId()
         * .organizationId()
         * .providerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SsoProvider =
            SsoProvider(
                checkRequired("id", id),
                checkRequired("defaultWorkspaceIds", defaultWorkspaceIds).map { it.toImmutable() },
                checkRequired("defaultWorkspaceRoleId", defaultWorkspaceRoleId),
                checkRequired("organizationId", organizationId),
                checkRequired("providerId", providerId),
                metadataUrl,
                metadataXml,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SsoProvider = apply {
        if (validated) {
            return@apply
        }

        id()
        defaultWorkspaceIds()
        defaultWorkspaceRoleId()
        organizationId()
        providerId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (defaultWorkspaceIds.asKnown().getOrNull()?.size ?: 0) +
            (if (defaultWorkspaceRoleId.asKnown().isPresent) 1 else 0) +
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (if (providerId.asKnown().isPresent) 1 else 0) +
            (if (metadataUrl.asKnown().isPresent) 1 else 0) +
            (if (metadataXml.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SsoProvider &&
            id == other.id &&
            defaultWorkspaceIds == other.defaultWorkspaceIds &&
            defaultWorkspaceRoleId == other.defaultWorkspaceRoleId &&
            organizationId == other.organizationId &&
            providerId == other.providerId &&
            metadataUrl == other.metadataUrl &&
            metadataXml == other.metadataXml &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            defaultWorkspaceIds,
            defaultWorkspaceRoleId,
            organizationId,
            providerId,
            metadataUrl,
            metadataXml,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SsoProvider{id=$id, defaultWorkspaceIds=$defaultWorkspaceIds, defaultWorkspaceRoleId=$defaultWorkspaceRoleId, organizationId=$organizationId, providerId=$providerId, metadataUrl=$metadataUrl, metadataXml=$metadataXml, additionalProperties=$additionalProperties}"
}
