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
import java.util.Objects

@JsonDeserialize(builder = RunManifestSchema.Builder::class)
@NoAutoDetect
class RunManifestSchema
private constructor(
    private val id: JsonField<String>,
    private val manifest: JsonValue,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("manifest") @ExcludeMissing fun _manifest() = manifest

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RunManifestSchema = apply {
        if (!validated) {
            id()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunManifestSchema &&
            this.id == other.id &&
            this.manifest == other.manifest &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    manifest,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "RunManifestSchema{id=$id, manifest=$manifest, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var manifest: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runManifestSchema: RunManifestSchema) = apply {
            this.id = runManifestSchema.id
            this.manifest = runManifestSchema.manifest
            additionalProperties(runManifestSchema.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        @JsonProperty("manifest")
        @ExcludeMissing
        fun manifest(manifest: JsonValue) = apply { this.manifest = manifest }

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

        fun build(): RunManifestSchema =
            RunManifestSchema(
                id,
                manifest,
                additionalProperties.toUnmodifiable(),
            )
    }
}
