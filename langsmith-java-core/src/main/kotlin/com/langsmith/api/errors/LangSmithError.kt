// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.errors

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(
    builder = LangSmithError.Builder::class
) // templates/JavaSDK/errors.ts:36:13 // templates/JavaSDK/errors.ts:36:13 //
// templates/JavaSDK/errors.ts:36:13 // templates/JavaSDK/errors.ts:36:13 //
// templates/JavaSDK/errors.ts:36:13
@NoAutoDetect
class LangSmithError
constructor(
    private val additionalProperties: Map<String, JsonValue>,
) {

    @JsonAnyGetter // templates/JavaSDK/errors.ts:41:10 // templates/JavaSDK/errors.ts:36:13
    fun additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toBuilder() = Builder()

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is LangSmithError && // templates/JavaSDK/entities/fields.ts:143:33
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash(additionalProperties)
    }

    override fun toString() = "LangSmithError{additionalProperties=$additionalProperties}"

    companion object { // templates/JavaSDK/errors.ts:54:10

        @JvmStatic // templates/JavaSDK/errors.ts:55:12 // templates/JavaSDK/errors.ts:54:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/errors.ts:61:10 // templates/JavaSDK/errors.ts:61:10 //
        // templates/JavaSDK/errors.ts:61:10

        private var additionalProperties: MutableMap<String, JsonValue> =
            mutableMapOf() // templates/JavaSDK/errors.ts:61:10

        fun from(error: LangSmithError) = apply { // templates/JavaSDK/errors.ts:69:30
            additionalProperties(error.additionalProperties)
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/errors.ts:79:30
                this.additionalProperties.clear() // templates/JavaSDK/errors.ts:79:30 //
                // templates/JavaSDK/errors.ts:79:30
                this.additionalProperties.putAll(additionalProperties)
            }

        @JsonAnySetter // templates/JavaSDK/errors.ts:88:14
        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply { // templates/JavaSDK/errors.ts:93:30
                this.additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/errors.ts:103:30
                this.additionalProperties.putAll(additionalProperties)
            }

        fun build(): LangSmithError = LangSmithError(additionalProperties.toUnmodifiable())
    }
}
