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

@JsonDeserialize(builder = PendingIdentity.Builder::class)
@NoAutoDetect
class PendingIdentity
private constructor(
    private val email: JsonField<String>,
    private val readOnly: JsonField<Boolean>,
    private val id: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val organizationId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun email(): String = email.getRequired("email")

    fun readOnly(): Optional<Boolean> = Optional.ofNullable(readOnly.getNullable("read_only"))

    fun id(): String = id.getRequired("id")

    fun tenantId(): String = tenantId.getRequired("tenant_id")

    fun organizationId(): Optional<String> =
        Optional.ofNullable(organizationId.getNullable("organization_id"))

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    @JsonProperty("email") @ExcludeMissing fun _email() = email

    @JsonProperty("read_only") @ExcludeMissing fun _readOnly() = readOnly

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId() = tenantId

    @JsonProperty("organization_id") @ExcludeMissing fun _organizationId() = organizationId

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PendingIdentity = apply {
        if (!validated) {
            email()
            readOnly()
            id()
            tenantId()
            organizationId()
            createdAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PendingIdentity &&
            this.email == other.email &&
            this.readOnly == other.readOnly &&
            this.id == other.id &&
            this.tenantId == other.tenantId &&
            this.organizationId == other.organizationId &&
            this.createdAt == other.createdAt &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    email,
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

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var email: JsonField<String> = JsonMissing.of()
        private var readOnly: JsonField<Boolean> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pendingIdentity: PendingIdentity) = apply {
            this.email = pendingIdentity.email
            this.readOnly = pendingIdentity.readOnly
            this.id = pendingIdentity.id
            this.tenantId = pendingIdentity.tenantId
            this.organizationId = pendingIdentity.organizationId
            this.createdAt = pendingIdentity.createdAt
            additionalProperties(pendingIdentity.additionalProperties)
        }

        fun email(email: String) = email(JsonField.of(email))

        @JsonProperty("email")
        @ExcludeMissing
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

        @JsonProperty("read_only")
        @ExcludeMissing
        fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        @JsonProperty("tenant_id")
        @ExcludeMissing
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun organizationId(organizationId: String) = organizationId(JsonField.of(organizationId))

        @JsonProperty("organization_id")
        @ExcludeMissing
        fun organizationId(organizationId: JsonField<String>) = apply {
            this.organizationId = organizationId
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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

        fun build(): PendingIdentity =
            PendingIdentity(
                email,
                readOnly,
                id,
                tenantId,
                organizationId,
                createdAt,
                additionalProperties.toUnmodifiable(),
            )
    }
}
