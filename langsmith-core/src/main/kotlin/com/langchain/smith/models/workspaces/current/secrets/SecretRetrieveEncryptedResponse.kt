// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.secrets

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

class SecretRetrieveEncryptedResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val encryptedSecrets: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("encrypted_secrets")
        @ExcludeMissing
        encryptedSecrets: JsonField<String> = JsonMissing.of()
    ) : this(encryptedSecrets, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun encryptedSecrets(): String = encryptedSecrets.getRequired("encrypted_secrets")

    /**
     * Returns the raw JSON value of [encryptedSecrets].
     *
     * Unlike [encryptedSecrets], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("encrypted_secrets")
    @ExcludeMissing
    fun _encryptedSecrets(): JsonField<String> = encryptedSecrets

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
         * Returns a mutable builder for constructing an instance of
         * [SecretRetrieveEncryptedResponse].
         *
         * The following fields are required:
         * ```java
         * .encryptedSecrets()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SecretRetrieveEncryptedResponse]. */
    class Builder internal constructor() {

        private var encryptedSecrets: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(secretRetrieveEncryptedResponse: SecretRetrieveEncryptedResponse) =
            apply {
                encryptedSecrets = secretRetrieveEncryptedResponse.encryptedSecrets
                additionalProperties =
                    secretRetrieveEncryptedResponse.additionalProperties.toMutableMap()
            }

        fun encryptedSecrets(encryptedSecrets: String) =
            encryptedSecrets(JsonField.of(encryptedSecrets))

        /**
         * Sets [Builder.encryptedSecrets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encryptedSecrets] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun encryptedSecrets(encryptedSecrets: JsonField<String>) = apply {
            this.encryptedSecrets = encryptedSecrets
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
         * Returns an immutable instance of [SecretRetrieveEncryptedResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .encryptedSecrets()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SecretRetrieveEncryptedResponse =
            SecretRetrieveEncryptedResponse(
                checkRequired("encryptedSecrets", encryptedSecrets),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SecretRetrieveEncryptedResponse = apply {
        if (validated) {
            return@apply
        }

        encryptedSecrets()
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
    internal fun validity(): Int = (if (encryptedSecrets.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SecretRetrieveEncryptedResponse &&
            encryptedSecrets == other.encryptedSecrets &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(encryptedSecrets, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SecretRetrieveEncryptedResponse{encryptedSecrets=$encryptedSecrets, additionalProperties=$additionalProperties}"
}
