// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs.share

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects

class RunShareSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val runId: JsonField<String>,
    private val shareToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("share_token")
        @ExcludeMissing
        shareToken: JsonField<String> = JsonMissing.of(),
    ) : this(runId, shareToken, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runId(): String = runId.getRequired("run_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shareToken(): String = shareToken.getRequired("share_token")

    /**
     * Returns the raw JSON value of [runId].
     *
     * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

    /**
     * Returns the raw JSON value of [shareToken].
     *
     * Unlike [shareToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("share_token") @ExcludeMissing fun _shareToken(): JsonField<String> = shareToken

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunShareSchema].
         *
         * The following fields are required:
         * ```java
         * .runId()
         * .shareToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunShareSchema]. */
    class Builder internal constructor() {

        private var runId: JsonField<String>? = null
        private var shareToken: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runShareSchema: RunShareSchema) = apply {
            runId = runShareSchema.runId
            shareToken = runShareSchema.shareToken
            additionalProperties = runShareSchema.additionalProperties.toMutableMap()
        }

        fun runId(runId: String) = runId(JsonField.of(runId))

        /**
         * Sets [Builder.runId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runId(runId: JsonField<String>) = apply { this.runId = runId }

        fun shareToken(shareToken: String) = shareToken(JsonField.of(shareToken))

        /**
         * Sets [Builder.shareToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shareToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shareToken(shareToken: JsonField<String>) = apply { this.shareToken = shareToken }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [RunShareSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .runId()
         * .shareToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunShareSchema =
            RunShareSchema(
                checkRequired("runId", runId),
                checkRequired("shareToken", shareToken),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RunShareSchema = apply {
        if (validated) {
            return@apply
        }

        runId()
        shareToken()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangChainInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (runId.asKnown().isPresent) 1 else 0) + (if (shareToken.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunShareSchema &&
            runId == other.runId &&
            shareToken == other.shareToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(runId, shareToken, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RunShareSchema{runId=$runId, shareToken=$shareToken, additionalProperties=$additionalProperties}"
}
