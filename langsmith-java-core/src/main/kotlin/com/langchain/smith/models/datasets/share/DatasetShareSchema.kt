// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.share

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects

class DatasetShareSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val datasetId: JsonField<String>,
    private val shareToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dataset_id") @ExcludeMissing datasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("share_token")
        @ExcludeMissing
        shareToken: JsonField<String> = JsonMissing.of(),
    ) : this(datasetId, shareToken, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasetId(): String = datasetId.getRequired("dataset_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shareToken(): String = shareToken.getRequired("share_token")

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

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
         * Returns a mutable builder for constructing an instance of [DatasetShareSchema].
         *
         * The following fields are required:
         * ```java
         * .datasetId()
         * .shareToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetShareSchema]. */
    class Builder internal constructor() {

        private var datasetId: JsonField<String>? = null
        private var shareToken: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetShareSchema: DatasetShareSchema) = apply {
            datasetId = datasetShareSchema.datasetId
            shareToken = datasetShareSchema.shareToken
            additionalProperties = datasetShareSchema.additionalProperties.toMutableMap()
        }

        fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

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
         * Returns an immutable instance of [DatasetShareSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .datasetId()
         * .shareToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetShareSchema =
            DatasetShareSchema(
                checkRequired("datasetId", datasetId),
                checkRequired("shareToken", shareToken),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DatasetShareSchema = apply {
        if (validated) {
            return@apply
        }

        datasetId()
        shareToken()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (datasetId.asKnown().isPresent) 1 else 0) +
            (if (shareToken.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetShareSchema &&
            datasetId == other.datasetId &&
            shareToken == other.shareToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(datasetId, shareToken, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DatasetShareSchema{datasetId=$datasetId, shareToken=$shareToken, additionalProperties=$additionalProperties}"
}
