// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs.share

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class ShareCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val shareToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("share_token")
        @ExcludeMissing
        shareToken: JsonField<String> = JsonMissing.of()
    ) : this(shareToken, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shareToken(): Optional<String> = shareToken.getOptional("share_token")

    /**
     * Returns the raw JSON value of [shareToken].
     *
     * Unlike [shareToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("share_token") @ExcludeMissing fun _shareToken(): JsonField<String> = shareToken

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

        /** Returns a mutable builder for constructing an instance of [ShareCreateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ShareCreateResponse]. */
    class Builder internal constructor() {

        private var shareToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(shareCreateResponse: ShareCreateResponse) = apply {
            shareToken = shareCreateResponse.shareToken
            additionalProperties = shareCreateResponse.additionalProperties.toMutableMap()
        }

        fun shareToken(shareToken: String) = shareToken(JsonField.of(shareToken))

        /**
         * Sets [Builder.shareToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shareToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shareToken(shareToken: JsonField<String>) = apply { this.shareToken = shareToken }

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
         * Returns an immutable instance of [ShareCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ShareCreateResponse =
            ShareCreateResponse(shareToken, additionalProperties.toMutableMap())
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
    fun validate(): ShareCreateResponse = apply {
        if (validated) {
            return@apply
        }

        shareToken()
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
    @JvmSynthetic internal fun validity(): Int = (if (shareToken.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ShareCreateResponse &&
            shareToken == other.shareToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(shareToken, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ShareCreateResponse{shareToken=$shareToken, additionalProperties=$additionalProperties}"
}
