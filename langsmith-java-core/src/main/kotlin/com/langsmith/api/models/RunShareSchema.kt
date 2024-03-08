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

@JsonDeserialize(builder = RunShareSchema.Builder::class)
@NoAutoDetect
class RunShareSchema
private constructor(
    private val runId: JsonField<String>,
    private val shareToken: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun runId(): String = runId.getRequired("run_id")

    fun shareToken(): String = shareToken.getRequired("share_token")

    @JsonProperty("run_id") @ExcludeMissing fun _runId() = runId

    @JsonProperty("share_token") @ExcludeMissing fun _shareToken() = shareToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RunShareSchema = apply {
        if (!validated) {
            runId()
            shareToken()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunShareSchema &&
            this.runId == other.runId &&
            this.shareToken == other.shareToken &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    runId,
                    shareToken,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "RunShareSchema{runId=$runId, shareToken=$shareToken, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var runId: JsonField<String> = JsonMissing.of()
        private var shareToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runShareSchema: RunShareSchema) = apply {
            this.runId = runShareSchema.runId
            this.shareToken = runShareSchema.shareToken
            additionalProperties(runShareSchema.additionalProperties)
        }

        fun runId(runId: String) = runId(JsonField.of(runId))

        @JsonProperty("run_id")
        @ExcludeMissing
        fun runId(runId: JsonField<String>) = apply { this.runId = runId }

        fun shareToken(shareToken: String) = shareToken(JsonField.of(shareToken))

        @JsonProperty("share_token")
        @ExcludeMissing
        fun shareToken(shareToken: JsonField<String>) = apply { this.shareToken = shareToken }

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

        fun build(): RunShareSchema =
            RunShareSchema(
                runId,
                shareToken,
                additionalProperties.toUnmodifiable(),
            )
    }
}
