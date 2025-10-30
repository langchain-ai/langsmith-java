// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sso

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects

class SsoRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val organizationDisplayName: JsonField<String>,
    private val organizationId: JsonField<String>,
    private val providerId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("organization_display_name")
        @ExcludeMissing
        organizationDisplayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        providerId: JsonField<String> = JsonMissing.of(),
    ) : this(organizationDisplayName, organizationId, providerId, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationDisplayName(): String =
        organizationDisplayName.getRequired("organization_display_name")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationId(): String = organizationId.getRequired("organization_id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerId(): String = providerId.getRequired("provider_id")

    /**
     * Returns the raw JSON value of [organizationDisplayName].
     *
     * Unlike [organizationDisplayName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("organization_display_name")
    @ExcludeMissing
    fun _organizationDisplayName(): JsonField<String> = organizationDisplayName

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
         * Returns a mutable builder for constructing an instance of [SsoRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .organizationDisplayName()
         * .organizationId()
         * .providerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SsoRetrieveResponse]. */
    class Builder internal constructor() {

        private var organizationDisplayName: JsonField<String>? = null
        private var organizationId: JsonField<String>? = null
        private var providerId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ssoRetrieveResponse: SsoRetrieveResponse) = apply {
            organizationDisplayName = ssoRetrieveResponse.organizationDisplayName
            organizationId = ssoRetrieveResponse.organizationId
            providerId = ssoRetrieveResponse.providerId
            additionalProperties = ssoRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun organizationDisplayName(organizationDisplayName: String) =
            organizationDisplayName(JsonField.of(organizationDisplayName))

        /**
         * Sets [Builder.organizationDisplayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationDisplayName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun organizationDisplayName(organizationDisplayName: JsonField<String>) = apply {
            this.organizationDisplayName = organizationDisplayName
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
         * Returns an immutable instance of [SsoRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .organizationDisplayName()
         * .organizationId()
         * .providerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SsoRetrieveResponse =
            SsoRetrieveResponse(
                checkRequired("organizationDisplayName", organizationDisplayName),
                checkRequired("organizationId", organizationId),
                checkRequired("providerId", providerId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SsoRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        organizationDisplayName()
        organizationId()
        providerId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (organizationDisplayName.asKnown().isPresent) 1 else 0) +
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (if (providerId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SsoRetrieveResponse &&
            organizationDisplayName == other.organizationDisplayName &&
            organizationId == other.organizationId &&
            providerId == other.providerId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(organizationDisplayName, organizationId, providerId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SsoRetrieveResponse{organizationDisplayName=$organizationDisplayName, organizationId=$organizationId, providerId=$providerId, additionalProperties=$additionalProperties}"
}
