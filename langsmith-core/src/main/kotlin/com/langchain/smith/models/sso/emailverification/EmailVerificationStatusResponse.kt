// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sso.emailverification

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EmailVerificationStatusResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val emailConfirmedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("email_confirmed_at")
        @ExcludeMissing
        emailConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of()
    ) : this(emailConfirmedAt, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailConfirmedAt(): Optional<OffsetDateTime> =
        emailConfirmedAt.getOptional("email_confirmed_at")

    /**
     * Returns the raw JSON value of [emailConfirmedAt].
     *
     * Unlike [emailConfirmedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("email_confirmed_at")
    @ExcludeMissing
    fun _emailConfirmedAt(): JsonField<OffsetDateTime> = emailConfirmedAt

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
         * [EmailVerificationStatusResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailVerificationStatusResponse]. */
    class Builder internal constructor() {

        private var emailConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailVerificationStatusResponse: EmailVerificationStatusResponse) =
            apply {
                emailConfirmedAt = emailVerificationStatusResponse.emailConfirmedAt
                additionalProperties =
                    emailVerificationStatusResponse.additionalProperties.toMutableMap()
            }

        fun emailConfirmedAt(emailConfirmedAt: OffsetDateTime?) =
            emailConfirmedAt(JsonField.ofNullable(emailConfirmedAt))

        /** Alias for calling [Builder.emailConfirmedAt] with `emailConfirmedAt.orElse(null)`. */
        fun emailConfirmedAt(emailConfirmedAt: Optional<OffsetDateTime>) =
            emailConfirmedAt(emailConfirmedAt.getOrNull())

        /**
         * Sets [Builder.emailConfirmedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailConfirmedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun emailConfirmedAt(emailConfirmedAt: JsonField<OffsetDateTime>) = apply {
            this.emailConfirmedAt = emailConfirmedAt
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
         * Returns an immutable instance of [EmailVerificationStatusResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailVerificationStatusResponse =
            EmailVerificationStatusResponse(emailConfirmedAt, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): EmailVerificationStatusResponse = apply {
        if (validated) {
            return@apply
        }

        emailConfirmedAt()
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
    internal fun validity(): Int = (if (emailConfirmedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailVerificationStatusResponse &&
            emailConfirmedAt == other.emailConfirmedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(emailConfirmedAt, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailVerificationStatusResponse{emailConfirmedAt=$emailConfirmedAt, additionalProperties=$additionalProperties}"
}
