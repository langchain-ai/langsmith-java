// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.platform.orgs.current.accesspolicies

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AccessPolicyListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accessPolicies: JsonField<List<AccessPolicy>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("access_policies")
        @ExcludeMissing
        accessPolicies: JsonField<List<AccessPolicy>> = JsonMissing.of()
    ) : this(accessPolicies, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accessPolicies(): Optional<List<AccessPolicy>> =
        accessPolicies.getOptional("access_policies")

    /**
     * Returns the raw JSON value of [accessPolicies].
     *
     * Unlike [accessPolicies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access_policies")
    @ExcludeMissing
    fun _accessPolicies(): JsonField<List<AccessPolicy>> = accessPolicies

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

        /** Returns a mutable builder for constructing an instance of [AccessPolicyListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccessPolicyListResponse]. */
    class Builder internal constructor() {

        private var accessPolicies: JsonField<MutableList<AccessPolicy>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accessPolicyListResponse: AccessPolicyListResponse) = apply {
            accessPolicies = accessPolicyListResponse.accessPolicies.map { it.toMutableList() }
            additionalProperties = accessPolicyListResponse.additionalProperties.toMutableMap()
        }

        fun accessPolicies(accessPolicies: List<AccessPolicy>) =
            accessPolicies(JsonField.of(accessPolicies))

        /**
         * Sets [Builder.accessPolicies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessPolicies] with a well-typed `List<AccessPolicy>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accessPolicies(accessPolicies: JsonField<List<AccessPolicy>>) = apply {
            this.accessPolicies = accessPolicies.map { it.toMutableList() }
        }

        /**
         * Adds a single [AccessPolicy] to [accessPolicies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccessPolicy(accessPolicy: AccessPolicy) = apply {
            accessPolicies =
                (accessPolicies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accessPolicies", it).add(accessPolicy)
                }
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
         * Returns an immutable instance of [AccessPolicyListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccessPolicyListResponse =
            AccessPolicyListResponse(
                (accessPolicies ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccessPolicyListResponse = apply {
        if (validated) {
            return@apply
        }

        accessPolicies().ifPresent { it.forEach { it.validate() } }
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
        (accessPolicies.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccessPolicyListResponse &&
            accessPolicies == other.accessPolicies &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(accessPolicies, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccessPolicyListResponse{accessPolicies=$accessPolicies, additionalProperties=$additionalProperties}"
}
