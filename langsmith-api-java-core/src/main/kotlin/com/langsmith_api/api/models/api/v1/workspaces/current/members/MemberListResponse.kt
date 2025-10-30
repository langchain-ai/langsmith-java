// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.members

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import com.langsmith_api.api.models.api.v1.orgs.current.members.PendingIdentity
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Tenant members schema. */
class MemberListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val members: JsonField<List<MemberIdentity>>,
    private val pending: JsonField<List<PendingIdentity>>,
    private val tenantId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("members")
        @ExcludeMissing
        members: JsonField<List<MemberIdentity>> = JsonMissing.of(),
        @JsonProperty("pending")
        @ExcludeMissing
        pending: JsonField<List<PendingIdentity>> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
    ) : this(members, pending, tenantId, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun members(): List<MemberIdentity> = members.getRequired("members")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pending(): List<PendingIdentity> = pending.getRequired("pending")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * Returns the raw JSON value of [members].
     *
     * Unlike [members], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("members")
    @ExcludeMissing
    fun _members(): JsonField<List<MemberIdentity>> = members

    /**
     * Returns the raw JSON value of [pending].
     *
     * Unlike [pending], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pending")
    @ExcludeMissing
    fun _pending(): JsonField<List<PendingIdentity>> = pending

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

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
         * Returns a mutable builder for constructing an instance of [MemberListResponse].
         *
         * The following fields are required:
         * ```java
         * .members()
         * .pending()
         * .tenantId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MemberListResponse]. */
    class Builder internal constructor() {

        private var members: JsonField<MutableList<MemberIdentity>>? = null
        private var pending: JsonField<MutableList<PendingIdentity>>? = null
        private var tenantId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(memberListResponse: MemberListResponse) = apply {
            members = memberListResponse.members.map { it.toMutableList() }
            pending = memberListResponse.pending.map { it.toMutableList() }
            tenantId = memberListResponse.tenantId
            additionalProperties = memberListResponse.additionalProperties.toMutableMap()
        }

        fun members(members: List<MemberIdentity>) = members(JsonField.of(members))

        /**
         * Sets [Builder.members] to an arbitrary JSON value.
         *
         * You should usually call [Builder.members] with a well-typed `List<MemberIdentity>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun members(members: JsonField<List<MemberIdentity>>) = apply {
            this.members = members.map { it.toMutableList() }
        }

        /**
         * Adds a single [MemberIdentity] to [members].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMember(member: MemberIdentity) = apply {
            members =
                (members ?: JsonField.of(mutableListOf())).also {
                    checkKnown("members", it).add(member)
                }
        }

        fun pending(pending: List<PendingIdentity>) = pending(JsonField.of(pending))

        /**
         * Sets [Builder.pending] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pending] with a well-typed `List<PendingIdentity>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pending(pending: JsonField<List<PendingIdentity>>) = apply {
            this.pending = pending.map { it.toMutableList() }
        }

        /**
         * Adds a single [PendingIdentity] to [Builder.pending].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPending(pending: PendingIdentity) = apply {
            this.pending =
                (this.pending ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pending", it).add(pending)
                }
        }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

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
         * Returns an immutable instance of [MemberListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .members()
         * .pending()
         * .tenantId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MemberListResponse =
            MemberListResponse(
                checkRequired("members", members).map { it.toImmutable() },
                checkRequired("pending", pending).map { it.toImmutable() },
                checkRequired("tenantId", tenantId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MemberListResponse = apply {
        if (validated) {
            return@apply
        }

        members().forEach { it.validate() }
        pending().forEach { it.validate() }
        tenantId()
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
        (members.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (pending.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemberListResponse &&
            members == other.members &&
            pending == other.pending &&
            tenantId == other.tenantId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(members, pending, tenantId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MemberListResponse{members=$members, pending=$pending, tenantId=$tenantId, additionalProperties=$additionalProperties}"
}
