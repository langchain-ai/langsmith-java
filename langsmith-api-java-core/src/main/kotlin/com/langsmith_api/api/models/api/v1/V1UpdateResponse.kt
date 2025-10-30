// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1

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

class V1UpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val likes: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("likes") @ExcludeMissing likes: JsonField<Long> = JsonMissing.of()
    ) : this(likes, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun likes(): Long = likes.getRequired("likes")

    /**
     * Returns the raw JSON value of [likes].
     *
     * Unlike [likes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("likes") @ExcludeMissing fun _likes(): JsonField<Long> = likes

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
         * Returns a mutable builder for constructing an instance of [V1UpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .likes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1UpdateResponse]. */
    class Builder internal constructor() {

        private var likes: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1UpdateResponse: V1UpdateResponse) = apply {
            likes = v1UpdateResponse.likes
            additionalProperties = v1UpdateResponse.additionalProperties.toMutableMap()
        }

        fun likes(likes: Long) = likes(JsonField.of(likes))

        /**
         * Sets [Builder.likes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.likes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun likes(likes: JsonField<Long>) = apply { this.likes = likes }

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
         * Returns an immutable instance of [V1UpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .likes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1UpdateResponse =
            V1UpdateResponse(checkRequired("likes", likes), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): V1UpdateResponse = apply {
        if (validated) {
            return@apply
        }

        likes()
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
    @JvmSynthetic internal fun validity(): Int = (if (likes.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1UpdateResponse &&
            likes == other.likes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(likes, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1UpdateResponse{likes=$likes, additionalProperties=$additionalProperties}"
}
