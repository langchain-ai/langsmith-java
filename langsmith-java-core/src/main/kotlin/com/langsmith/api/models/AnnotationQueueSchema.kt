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

/** AnnotationQueue schema. */
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@JsonDeserialize(builder = AnnotationQueueSchema.Builder::class)
@NoAutoDetect
class AnnotationQueueSchema
private constructor( // templates/JavaSDK/entities/objects.ts:76:13
    private val name: JsonField<String>, // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    private val description: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

    private var hashCode: Int = 0

    fun name(): String = name.getRequired("name")

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun createdAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(createdAt.getNullable("created_at"))

    fun updatedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(updatedAt.getNullable("updated_at"))

    fun id(): String = id.getRequired("id")

    fun tenantId(): String = tenantId.getRequired("tenant_id")

    @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _name() = name

    @JsonProperty("description") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _description() = description

    @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _createdAt() = createdAt

    @JsonProperty("updated_at") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _updatedAt() = updatedAt

    @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _id() = id

    @JsonProperty("tenant_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _tenantId() = tenantId

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AnnotationQueueSchema = apply { // templates/JavaSDK/entities/objects.ts:198:28
        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:198:28 //
            // templates/JavaSDK/entities/objects.ts:198:28
            name() // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:201:20
            description()
            createdAt()
            updatedAt()
            id()
            tenantId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is AnnotationQueueSchema && // templates/JavaSDK/entities/fields.ts:143:33
            this.name == other.name &&
            this.description == other.description &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.id == other.id &&
            this.tenantId == other.tenantId &&
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
                    name, // templates/JavaSDK/entities/fields.ts:163:19
                    description,
                    createdAt,
                    updatedAt,
                    id,
                    tenantId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AnnotationQueueSchema{name=$name, description=$description, createdAt=$createdAt, updatedAt=$updatedAt, id=$id, tenantId=$tenantId, additionalProperties=$additionalProperties}"

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var name: JsonField<String> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
        private var description: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(annotationQueueSchema: AnnotationQueueSchema) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.name =
                    annotationQueueSchema.name // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
                this.description = annotationQueueSchema.description
                this.createdAt = annotationQueueSchema.createdAt
                this.updatedAt = annotationQueueSchema.updatedAt
                this.id = annotationQueueSchema.id
                this.tenantId = annotationQueueSchema.tenantId
                additionalProperties(annotationQueueSchema.additionalProperties)
            }

        fun name(name: String) =
            name(JsonField.of(name)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.name = name
        }

        fun description(description: String) =
            description(JsonField.of(description)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("description") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun description(description: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.description = description
            }

        fun createdAt(createdAt: OffsetDateTime) =
            createdAt(JsonField.of(createdAt)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.createdAt = createdAt
            }

        fun updatedAt(updatedAt: OffsetDateTime) =
            updatedAt(JsonField.of(updatedAt)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("updated_at") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.updatedAt = updatedAt
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

        fun build(): AnnotationQueueSchema =
            AnnotationQueueSchema( // templates/JavaSDK/entities/objects.ts:326:30
                name, // templates/JavaSDK/entities/objects.ts:326:30
                description,
                createdAt,
                updatedAt,
                id,
                tenantId,
                additionalProperties.toUnmodifiable(),
            )
    }
}
