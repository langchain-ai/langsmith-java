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

/** API key POST schema. */
@JsonDeserialize(builder = ApiKeyCreateResponse.Builder::class)
@NoAutoDetect
class ApiKeyCreateResponse
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val shortKey: JsonField<String>,
    private val readOnly: JsonField<Boolean>,
    private val key: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun createdAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(createdAt.getNullable("created_at"))

    fun id(): String = id.getRequired("id")

    fun shortKey(): String = shortKey.getRequired("short_key")

    fun readOnly(): Boolean = readOnly.getRequired("read_only")

    fun key(): String = key.getRequired("key")

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("short_key") @ExcludeMissing fun _shortKey() = shortKey

    @JsonProperty("read_only") @ExcludeMissing fun _readOnly() = readOnly

    @JsonProperty("key") @ExcludeMissing fun _key() = key

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ApiKeyCreateResponse = apply {
        if (!validated) {
            createdAt()
            id()
            shortKey()
            readOnly()
            key()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiKeyCreateResponse &&
            this.createdAt == other.createdAt &&
            this.id == other.id &&
            this.shortKey == other.shortKey &&
            this.readOnly == other.readOnly &&
            this.key == other.key &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    createdAt,
                    id,
                    shortKey,
                    readOnly,
                    key,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ApiKeyCreateResponse{createdAt=$createdAt, id=$id, shortKey=$shortKey, readOnly=$readOnly, key=$key, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var shortKey: JsonField<String> = JsonMissing.of()
        private var readOnly: JsonField<Boolean> = JsonMissing.of()
        private var key: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiKeyCreateResponse: ApiKeyCreateResponse) = apply {
            this.createdAt = apiKeyCreateResponse.createdAt
            this.id = apiKeyCreateResponse.id
            this.shortKey = apiKeyCreateResponse.shortKey
            this.readOnly = apiKeyCreateResponse.readOnly
            this.key = apiKeyCreateResponse.key
            additionalProperties(apiKeyCreateResponse.additionalProperties)
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun shortKey(shortKey: String) = shortKey(JsonField.of(shortKey))

        @JsonProperty("short_key")
        @ExcludeMissing
        fun shortKey(shortKey: JsonField<String>) = apply { this.shortKey = shortKey }

        fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

        @JsonProperty("read_only")
        @ExcludeMissing
        fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

        fun key(key: String) = key(JsonField.of(key))

        @JsonProperty("key")
        @ExcludeMissing
        fun key(key: JsonField<String>) = apply { this.key = key }

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

        fun build(): ApiKeyCreateResponse =
            ApiKeyCreateResponse(
                createdAt,
                id,
                shortKey,
                readOnly,
                key,
                additionalProperties.toUnmodifiable(),
            )
    }
}
