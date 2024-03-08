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

/** API key POST schema. */
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@JsonDeserialize(builder = ApiKeyCreateResponse.Builder::class)
@NoAutoDetect
class ApiKeyCreateResponse
private constructor( // templates/JavaSDK/entities/objects.ts:76:13
    private val createdAt:
        JsonField<OffsetDateTime>, // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    private val id: JsonField<String>,
    private val shortKey: JsonField<String>,
    private val readOnly: JsonField<Boolean>,
    private val key: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

    private var hashCode: Int = 0

    fun createdAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(createdAt.getNullable("created_at"))

    fun id(): String = id.getRequired("id")

    fun shortKey(): String = shortKey.getRequired("short_key")

    fun readOnly(): Boolean = readOnly.getRequired("read_only")

    fun key(): String = key.getRequired("key")

    @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _createdAt() = createdAt

    @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _id() = id

    @JsonProperty("short_key") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _shortKey() = shortKey

    @JsonProperty("read_only") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _readOnly() = readOnly

    @JsonProperty("key") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _key() = key

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ApiKeyCreateResponse = apply { // templates/JavaSDK/entities/objects.ts:198:28
        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:198:28 //
            // templates/JavaSDK/entities/objects.ts:198:28
            createdAt() // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:201:20
            id()
            shortKey()
            readOnly()
            key()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is ApiKeyCreateResponse && // templates/JavaSDK/entities/fields.ts:143:33
            this.createdAt == other.createdAt &&
            this.id == other.id &&
            this.shortKey == other.shortKey &&
            this.readOnly == other.readOnly &&
            this.key == other.key &&
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
                    createdAt, // templates/JavaSDK/entities/fields.ts:163:19
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

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var createdAt: JsonField<OffsetDateTime> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
        private var id: JsonField<String> = JsonMissing.of()
        private var shortKey: JsonField<String> = JsonMissing.of()
        private var readOnly: JsonField<Boolean> = JsonMissing.of()
        private var key: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(apiKeyCreateResponse: ApiKeyCreateResponse) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.createdAt =
                    apiKeyCreateResponse
                        .createdAt // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
                this.id = apiKeyCreateResponse.id
                this.shortKey = apiKeyCreateResponse.shortKey
                this.readOnly = apiKeyCreateResponse.readOnly
                this.key = apiKeyCreateResponse.key
                additionalProperties(apiKeyCreateResponse.additionalProperties)
            }

        fun createdAt(createdAt: OffsetDateTime) =
            createdAt(JsonField.of(createdAt)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.createdAt = createdAt
            }

        fun id(id: String) = id(JsonField.of(id)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.id = id
        }

        fun shortKey(shortKey: String) =
            shortKey(JsonField.of(shortKey)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("short_key") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun shortKey(shortKey: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.shortKey = shortKey
            }

        fun readOnly(readOnly: Boolean) =
            readOnly(JsonField.of(readOnly)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("read_only") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun readOnly(readOnly: JsonField<Boolean>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.readOnly = readOnly
            }

        fun key(key: String) =
            key(JsonField.of(key)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("key") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun key(key: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.key = key
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

        fun build(): ApiKeyCreateResponse =
            ApiKeyCreateResponse( // templates/JavaSDK/entities/objects.ts:326:30
                createdAt, // templates/JavaSDK/entities/objects.ts:326:30
                id,
                shortKey,
                readOnly,
                key,
                additionalProperties.toUnmodifiable(),
            )
    }
}
