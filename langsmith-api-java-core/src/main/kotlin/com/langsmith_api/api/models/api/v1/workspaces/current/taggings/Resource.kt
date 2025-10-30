// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.taggings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects

class Resource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val resourceId: JsonField<String>,
    private val resourceName: JsonField<String>,
    private val taggingId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("resource_id")
        @ExcludeMissing
        resourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resource_name")
        @ExcludeMissing
        resourceName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tagging_id") @ExcludeMissing taggingId: JsonField<String> = JsonMissing.of(),
    ) : this(resourceId, resourceName, taggingId, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resourceId(): String = resourceId.getRequired("resource_id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resourceName(): String = resourceName.getRequired("resource_name")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taggingId(): String = taggingId.getRequired("tagging_id")

    /**
     * Returns the raw JSON value of [resourceId].
     *
     * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_id") @ExcludeMissing fun _resourceId(): JsonField<String> = resourceId

    /**
     * Returns the raw JSON value of [resourceName].
     *
     * Unlike [resourceName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_name")
    @ExcludeMissing
    fun _resourceName(): JsonField<String> = resourceName

    /**
     * Returns the raw JSON value of [taggingId].
     *
     * Unlike [taggingId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tagging_id") @ExcludeMissing fun _taggingId(): JsonField<String> = taggingId

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
         * Returns a mutable builder for constructing an instance of [Resource].
         *
         * The following fields are required:
         * ```java
         * .resourceId()
         * .resourceName()
         * .taggingId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Resource]. */
    class Builder internal constructor() {

        private var resourceId: JsonField<String>? = null
        private var resourceName: JsonField<String>? = null
        private var taggingId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(resource: Resource) = apply {
            resourceId = resource.resourceId
            resourceName = resource.resourceName
            taggingId = resource.taggingId
            additionalProperties = resource.additionalProperties.toMutableMap()
        }

        fun resourceId(resourceId: String) = resourceId(JsonField.of(resourceId))

        /**
         * Sets [Builder.resourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

        fun resourceName(resourceName: String) = resourceName(JsonField.of(resourceName))

        /**
         * Sets [Builder.resourceName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceName(resourceName: JsonField<String>) = apply {
            this.resourceName = resourceName
        }

        fun taggingId(taggingId: String) = taggingId(JsonField.of(taggingId))

        /**
         * Sets [Builder.taggingId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taggingId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taggingId(taggingId: JsonField<String>) = apply { this.taggingId = taggingId }

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
         * Returns an immutable instance of [Resource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .resourceId()
         * .resourceName()
         * .taggingId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Resource =
            Resource(
                checkRequired("resourceId", resourceId),
                checkRequired("resourceName", resourceName),
                checkRequired("taggingId", taggingId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Resource = apply {
        if (validated) {
            return@apply
        }

        resourceId()
        resourceName()
        taggingId()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithApiInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (resourceId.asKnown().isPresent) 1 else 0) +
            (if (resourceName.asKnown().isPresent) 1 else 0) +
            (if (taggingId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Resource &&
            resourceId == other.resourceId &&
            resourceName == other.resourceName &&
            taggingId == other.taggingId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(resourceId, resourceName, taggingId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Resource{resourceId=$resourceId, resourceName=$resourceName, taggingId=$taggingId, additionalProperties=$additionalProperties}"
}
