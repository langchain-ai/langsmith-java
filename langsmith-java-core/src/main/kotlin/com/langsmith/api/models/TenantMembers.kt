// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
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
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@JsonDeserialize(builder = TenantMembers.Builder::class)
@NoAutoDetect
class TenantMembers
private constructor( // templates/JavaSDK/entities/objects.ts:76:13
    private val tenantId: JsonField<String>, // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    private val members: JsonField<List<TenantMemberIdentity>>,
    private val pending: JsonField<List<PendingIdentity>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

    private var hashCode: Int = 0

    fun tenantId(): String = tenantId.getRequired("tenant_id")

    fun members(): List<TenantMemberIdentity> = members.getRequired("members")

    fun pending(): List<PendingIdentity> = pending.getRequired("pending")

    @JsonProperty("tenant_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _tenantId() = tenantId

    @JsonProperty("members") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _members() = members

    @JsonProperty("pending") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _pending() = pending

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TenantMembers = apply { // templates/JavaSDK/entities/objects.ts:198:28
        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:198:28 //
            // templates/JavaSDK/entities/objects.ts:198:28
            tenantId() // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:201:20
            members().forEach { it.validate() }
            pending().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is TenantMembers && // templates/JavaSDK/entities/fields.ts:143:33
            this.tenantId == other.tenantId &&
            this.members == other.members &&
            this.pending == other.pending &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
            // templates/JavaSDK/entities/fields.ts:174:16 //
            // templates/JavaSDK/entities/fields.ts:174:16
            hashCode =
                Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                    // templates/JavaSDK/entities/fields.ts:175:16 //
                    // templates/JavaSDK/entities/fields.ts:175:16
                    tenantId, // templates/JavaSDK/entities/fields.ts:163:19
                    members,
                    pending,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "TenantMembers{tenantId=$tenantId, members=$members, pending=$pending, additionalProperties=$additionalProperties}"

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var tenantId: JsonField<String> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
        private var members: JsonField<List<TenantMemberIdentity>> = JsonMissing.of()
        private var pending: JsonField<List<PendingIdentity>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(tenantMembers: TenantMembers) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.tenantId =
                    tenantMembers.tenantId // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
                this.members = tenantMembers.members
                this.pending = tenantMembers.pending
                additionalProperties(tenantMembers.additionalProperties)
            }

        fun tenantId(tenantId: String) =
            tenantId(JsonField.of(tenantId)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("tenant_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun tenantId(tenantId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.tenantId = tenantId
            }

        fun members(members: List<TenantMemberIdentity>) =
            members(JsonField.of(members)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("members") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun members(members: JsonField<List<TenantMemberIdentity>>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.members = members
            }

        fun pending(pending: List<PendingIdentity>) =
            pending(JsonField.of(pending)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("pending") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun pending(pending: JsonField<List<PendingIdentity>>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.pending = pending
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.putAll(additionalProperties)
            }

        @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply { // templates/JavaSDK/entities/objects.ts:304:30
                this.additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:316:30
                this.additionalProperties.putAll(additionalProperties)
            }

        fun build(): TenantMembers =
            TenantMembers( // templates/JavaSDK/entities/objects.ts:326:30
                tenantId, // templates/JavaSDK/entities/objects.ts:326:30
                members.map { it.toUnmodifiable() },
                pending.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(
        builder = TenantMemberIdentity.Builder::class
    ) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    // // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    @NoAutoDetect
    class TenantMemberIdentity
    private constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val id: JsonField<String>, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
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

        private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

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

        @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _id() = id

        @JsonProperty("tenant_id") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _tenantId() = tenantId

        @JsonProperty("organization_id") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _organizationId() = organizationId

        @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _createdAt() = createdAt

        @JsonProperty("user_id") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _userId() = userId

        @JsonProperty("read_only") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _readOnly() = readOnly

        @JsonProperty("email") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _email() = email

        @JsonProperty("full_name") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _fullName() = fullName

        @JsonProperty("avatar_url") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _avatarUrl() = avatarUrl

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TenantMemberIdentity =
            apply { // templates/JavaSDK/entities/objects.ts:198:28
                if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                    // templates/JavaSDK/entities/objects.ts:198:28 //
                    // templates/JavaSDK/entities/objects.ts:198:28
                    id() // templates/JavaSDK/entities/objects.ts:201:20 //
                    // templates/JavaSDK/entities/objects.ts:201:20
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

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is TenantMemberIdentity && // templates/JavaSDK/entities/fields.ts:143:33
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

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
                // templates/JavaSDK/entities/fields.ts:174:16 //
                // templates/JavaSDK/entities/fields.ts:174:16
                hashCode =
                    Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                        // templates/JavaSDK/entities/fields.ts:175:16 //
                        // templates/JavaSDK/entities/fields.ts:175:16
                        id, // templates/JavaSDK/entities/fields.ts:163:19
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
            "TenantMemberIdentity{id=$id, tenantId=$tenantId, organizationId=$organizationId, createdAt=$createdAt, userId=$userId, readOnly=$readOnly, email=$email, fullName=$fullName, avatarUrl=$avatarUrl, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var id: JsonField<String> =
                JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var tenantId: JsonField<String> = JsonMissing.of()
            private var organizationId: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var readOnly: JsonField<Boolean> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var fullName: JsonField<String> = JsonMissing.of()
            private var avatarUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(tenantMemberIdentity: TenantMemberIdentity) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.id =
                        tenantMemberIdentity.id // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.tenantId = tenantMemberIdentity.tenantId
                    this.organizationId = tenantMemberIdentity.organizationId
                    this.createdAt = tenantMemberIdentity.createdAt
                    this.userId = tenantMemberIdentity.userId
                    this.readOnly = tenantMemberIdentity.readOnly
                    this.email = tenantMemberIdentity.email
                    this.fullName = tenantMemberIdentity.fullName
                    this.avatarUrl = tenantMemberIdentity.avatarUrl
                    additionalProperties(tenantMemberIdentity.additionalProperties)
                }

            fun id(id: String) =
                id(JsonField.of(id)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.id = id
            }

            fun tenantId(tenantId: String) =
                tenantId(JsonField.of(tenantId)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("tenant_id") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun tenantId(tenantId: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.tenantId = tenantId
                }

            fun organizationId(organizationId: String) =
                organizationId(
                    JsonField.of(organizationId)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("organization_id") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun organizationId(organizationId: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.organizationId = organizationId
                }

            fun createdAt(createdAt: OffsetDateTime) =
                createdAt(JsonField.of(createdAt)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.createdAt = createdAt
                }

            fun userId(userId: String) =
                userId(JsonField.of(userId)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("user_id") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun userId(userId: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.userId = userId
                }

            fun readOnly(readOnly: Boolean) =
                readOnly(JsonField.of(readOnly)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("read_only") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun readOnly(readOnly: JsonField<Boolean>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.readOnly = readOnly
                }

            fun email(email: String) =
                email(JsonField.of(email)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("email") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun email(email: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.email = email
                }

            fun fullName(fullName: String) =
                fullName(JsonField.of(fullName)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("full_name") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun fullName(fullName: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.fullName = fullName
                }

            fun avatarUrl(avatarUrl: String) =
                avatarUrl(JsonField.of(avatarUrl)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("avatar_url") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun avatarUrl(avatarUrl: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.avatarUrl = avatarUrl
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties
                        .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                    // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply { // templates/JavaSDK/entities/objects.ts:304:30
                    this.additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:316:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): TenantMemberIdentity =
                TenantMemberIdentity( // templates/JavaSDK/entities/objects.ts:326:30
                    id, // templates/JavaSDK/entities/objects.ts:326:30
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
