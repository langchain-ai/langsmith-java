// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Tenant members schema. */
@JsonDeserialize(builder = TenantMembers.Builder::class)
@NoAutoDetect
class TenantMembers
private constructor(
    private val tenantId: JsonField<String>,
    private val members: JsonField<List<Member>>,
    private val pending: JsonField<List<PendingIdentity>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun tenantId(): String = tenantId.getRequired("tenant_id")

    fun members(): List<Member> = members.getRequired("members")

    fun pending(): List<PendingIdentity> = pending.getRequired("pending")

    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId() = tenantId

    @JsonProperty("members") @ExcludeMissing fun _members() = members

    @JsonProperty("pending") @ExcludeMissing fun _pending() = pending

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TenantMembers = apply {
        if (!validated) {
            tenantId()
            members().forEach { it.validate() }
            pending().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TenantMembers &&
            this.tenantId == other.tenantId &&
            this.members == other.members &&
            this.pending == other.pending &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    tenantId,
                    members,
                    pending,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "TenantMembers{tenantId=$tenantId, members=$members, pending=$pending, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var tenantId: JsonField<String> = JsonMissing.of()
        private var members: JsonField<List<Member>> = JsonMissing.of()
        private var pending: JsonField<List<PendingIdentity>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tenantMembers: TenantMembers) = apply {
            this.tenantId = tenantMembers.tenantId
            this.members = tenantMembers.members
            this.pending = tenantMembers.pending
            additionalProperties(tenantMembers.additionalProperties)
        }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        @JsonProperty("tenant_id")
        @ExcludeMissing
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun members(members: List<Member>) = members(JsonField.of(members))

        @JsonProperty("members")
        @ExcludeMissing
        fun members(members: JsonField<List<Member>>) = apply { this.members = members }

        fun pending(pending: List<PendingIdentity>) = pending(JsonField.of(pending))

        @JsonProperty("pending")
        @ExcludeMissing
        fun pending(pending: JsonField<List<PendingIdentity>>) = apply { this.pending = pending }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): TenantMembers =
            TenantMembers(
                tenantId,
                members.map { it.toUnmodifiable() },
                pending.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Member.Builder::class)
    @NoAutoDetect
    class Member
    private constructor(
        private val id: JsonField<String>,
        private val tenantId: JsonField<String>,
        private val organizationId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val userId: JsonField<String>,
        private val readOnly: JsonField<Boolean>,
        private val email: JsonField<String>,
        private val fullName: JsonField<String>,
        private val avatarUrl: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun tenantId(): String = tenantId.getRequired("tenant_id")

        fun organizationId(): Optional<String> =
            Optional.ofNullable(organizationId.getNullable("organization_id"))

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun userId(): String = userId.getRequired("user_id")

        fun readOnly(): Boolean = readOnly.getRequired("read_only")

        fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

        fun fullName(): Optional<String> = Optional.ofNullable(fullName.getNullable("full_name"))

        fun avatarUrl(): Optional<String> = Optional.ofNullable(avatarUrl.getNullable("avatar_url"))

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId() = tenantId

        @JsonProperty("organization_id") @ExcludeMissing fun _organizationId() = organizationId

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("user_id") @ExcludeMissing fun _userId() = userId

        @JsonProperty("read_only") @ExcludeMissing fun _readOnly() = readOnly

        @JsonProperty("email") @ExcludeMissing fun _email() = email

        @JsonProperty("full_name") @ExcludeMissing fun _fullName() = fullName

        @JsonProperty("avatar_url") @ExcludeMissing fun _avatarUrl() = avatarUrl

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Member = apply {
            if (!validated) {
                id()
                tenantId()
                organizationId()
                createdAt()
                userId()
                readOnly()
                email()
                fullName()
                avatarUrl()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Member &&
                this.id == other.id &&
                this.tenantId == other.tenantId &&
                this.organizationId == other.organizationId &&
                this.createdAt == other.createdAt &&
                this.userId == other.userId &&
                this.readOnly == other.readOnly &&
                this.email == other.email &&
                this.fullName == other.fullName &&
                this.avatarUrl == other.avatarUrl &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        tenantId,
                        organizationId,
                        createdAt,
                        userId,
                        readOnly,
                        email,
                        fullName,
                        avatarUrl,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Member{id=$id, tenantId=$tenantId, organizationId=$organizationId, createdAt=$createdAt, userId=$userId, readOnly=$readOnly, email=$email, fullName=$fullName, avatarUrl=$avatarUrl, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var tenantId: JsonField<String> = JsonMissing.of()
            private var organizationId: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var readOnly: JsonField<Boolean> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var fullName: JsonField<String> = JsonMissing.of()
            private var avatarUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(member: Member) = apply {
                this.id = member.id
                this.tenantId = member.tenantId
                this.organizationId = member.organizationId
                this.createdAt = member.createdAt
                this.userId = member.userId
                this.readOnly = member.readOnly
                this.email = member.email
                this.fullName = member.fullName
                this.avatarUrl = member.avatarUrl
                additionalProperties(member.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

            @JsonProperty("tenant_id")
            @ExcludeMissing
            fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

            fun organizationId(organizationId: String) =
                organizationId(JsonField.of(organizationId))

            @JsonProperty("organization_id")
            @ExcludeMissing
            fun organizationId(organizationId: JsonField<String>) = apply {
                this.organizationId = organizationId
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun userId(userId: String) = userId(JsonField.of(userId))

            @JsonProperty("user_id")
            @ExcludeMissing
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

            @JsonProperty("read_only")
            @ExcludeMissing
            fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

            fun email(email: String) = email(JsonField.of(email))

            @JsonProperty("email")
            @ExcludeMissing
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun fullName(fullName: String) = fullName(JsonField.of(fullName))

            @JsonProperty("full_name")
            @ExcludeMissing
            fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

            fun avatarUrl(avatarUrl: String) = avatarUrl(JsonField.of(avatarUrl))

            @JsonProperty("avatar_url")
            @ExcludeMissing
            fun avatarUrl(avatarUrl: JsonField<String>) = apply { this.avatarUrl = avatarUrl }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Member =
                Member(
                    id,
                    tenantId,
                    organizationId,
                    createdAt,
                    userId,
                    readOnly,
                    email,
                    fullName,
                    avatarUrl,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
