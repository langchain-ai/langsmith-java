// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.members

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
import com.langchain.smith.errors.LangsmithInvalidDataException
import com.langchain.smith.models.orgs.current.members.pending.OrgPendingIdentity
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Organization members schema. */
class MemberListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val members: JsonField<List<OrgMemberIdentity>>,
    private val organizationId: JsonField<String>,
    private val pending: JsonField<List<OrgPendingIdentity>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("members")
        @ExcludeMissing
        members: JsonField<List<OrgMemberIdentity>> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pending")
        @ExcludeMissing
        pending: JsonField<List<OrgPendingIdentity>> = JsonMissing.of(),
    ) : this(members, organizationId, pending, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun members(): List<OrgMemberIdentity> = members.getRequired("members")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationId(): String = organizationId.getRequired("organization_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pending(): List<OrgPendingIdentity> = pending.getRequired("pending")

    /**
     * Returns the raw JSON value of [members].
     *
     * Unlike [members], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("members")
    @ExcludeMissing
    fun _members(): JsonField<List<OrgMemberIdentity>> = members

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [pending].
     *
     * Unlike [pending], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pending")
    @ExcludeMissing
    fun _pending(): JsonField<List<OrgPendingIdentity>> = pending

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
         * .organizationId()
         * .pending()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MemberListResponse]. */
    class Builder internal constructor() {

        private var members: JsonField<MutableList<OrgMemberIdentity>>? = null
        private var organizationId: JsonField<String>? = null
        private var pending: JsonField<MutableList<OrgPendingIdentity>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(memberListResponse: MemberListResponse) = apply {
            members = memberListResponse.members.map { it.toMutableList() }
            organizationId = memberListResponse.organizationId
            pending = memberListResponse.pending.map { it.toMutableList() }
            additionalProperties = memberListResponse.additionalProperties.toMutableMap()
        }

        fun members(members: List<OrgMemberIdentity>) = members(JsonField.of(members))

        /**
         * Sets [Builder.members] to an arbitrary JSON value.
         *
         * You should usually call [Builder.members] with a well-typed `List<OrgMemberIdentity>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun members(members: JsonField<List<OrgMemberIdentity>>) = apply {
            this.members = members.map { it.toMutableList() }
        }

        /**
         * Adds a single [OrgMemberIdentity] to [members].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMember(member: OrgMemberIdentity) = apply {
            members =
                (members ?: JsonField.of(mutableListOf())).also {
                    checkKnown("members", it).add(member)
                }
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

        fun pending(pending: List<OrgPendingIdentity>) = pending(JsonField.of(pending))

        /**
         * Sets [Builder.pending] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pending] with a well-typed `List<OrgPendingIdentity>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pending(pending: JsonField<List<OrgPendingIdentity>>) = apply {
            this.pending = pending.map { it.toMutableList() }
        }

        /**
         * Adds a single [OrgPendingIdentity] to [Builder.pending].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPending(pending: OrgPendingIdentity) = apply {
            this.pending =
                (this.pending ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pending", it).add(pending)
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
         * Returns an immutable instance of [MemberListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .members()
         * .organizationId()
         * .pending()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MemberListResponse =
            MemberListResponse(
                checkRequired("members", members).map { it.toImmutable() },
                checkRequired("organizationId", organizationId),
                checkRequired("pending", pending).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MemberListResponse = apply {
        if (validated) {
            return@apply
        }

        members().forEach { it.validate() }
        organizationId()
        pending().forEach { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithInvalidDataException) {
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
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (pending.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemberListResponse &&
            members == other.members &&
            organizationId == other.organizationId &&
            pending == other.pending &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(members, organizationId, pending, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MemberListResponse{members=$members, organizationId=$organizationId, pending=$pending, additionalProperties=$additionalProperties}"
}
