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

@JsonDeserialize(
    builder = PendingIdentity.Builder::class
) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@NoAutoDetect
class PendingIdentity
private constructor( // templates/JavaSDK/entities/objects.ts:76:13
    private val email: JsonField<String>, // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    private val readOnly: JsonField<Boolean>,
    private val id: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val organizationId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

    private var hashCode: Int = 0

    fun email(): String = email.getRequired("email")

    fun readOnly(): Optional<Boolean> = Optional.ofNullable(readOnly.getNullable("read_only"))

    fun id(): String = id.getRequired("id")

    fun tenantId(): String = tenantId.getRequired("tenant_id")

    fun organizationId(): Optional<String> =
        Optional.ofNullable(organizationId.getNullable("organization_id"))

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    @JsonProperty("email") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _email() = email

    @JsonProperty("read_only") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _readOnly() = readOnly

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

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PendingIdentity = apply { // templates/JavaSDK/entities/objects.ts:198:28
        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:198:28 //
            // templates/JavaSDK/entities/objects.ts:198:28
            email() // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:201:20
            readOnly()
            id()
            tenantId()
            organizationId()
            createdAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is PendingIdentity && // templates/JavaSDK/entities/fields.ts:143:33
            this.email == other.email &&
            this.readOnly == other.readOnly &&
            this.id == other.id &&
            this.tenantId == other.tenantId &&
            this.organizationId == other.organizationId &&
            this.createdAt == other.createdAt &&
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
                    email, // templates/JavaSDK/entities/fields.ts:163:19
                    readOnly,
                    id,
                    tenantId,
                    organizationId,
                    createdAt,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PendingIdentity{email=$email, readOnly=$readOnly, id=$id, tenantId=$tenantId, organizationId=$organizationId, createdAt=$createdAt, additionalProperties=$additionalProperties}"

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var email: JsonField<String> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
        private var readOnly: JsonField<Boolean> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(pendingIdentity: PendingIdentity) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.email =
                    pendingIdentity.email // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
                this.readOnly = pendingIdentity.readOnly
                this.id = pendingIdentity.id
                this.tenantId = pendingIdentity.tenantId
                this.organizationId = pendingIdentity.organizationId
                this.createdAt = pendingIdentity.createdAt
                additionalProperties(pendingIdentity.additionalProperties)
            }

        fun email(email: String) =
            email(JsonField.of(email)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("email") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun email(email: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.email = email
            }

        fun readOnly(readOnly: Boolean) =
            readOnly(JsonField.of(readOnly)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("read_only") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun readOnly(readOnly: JsonField<Boolean>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.readOnly = readOnly
            }

        fun id(id: String) = id(JsonField.of(id)) // templates/JavaSDK/entities/objects.ts:252:20

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

        fun build(): PendingIdentity =
            PendingIdentity( // templates/JavaSDK/entities/objects.ts:326:30
                email, // templates/JavaSDK/entities/objects.ts:326:30
                readOnly,
                id,
                tenantId,
                organizationId,
                createdAt,
                additionalProperties.toUnmodifiable(),
            )
    }
}
