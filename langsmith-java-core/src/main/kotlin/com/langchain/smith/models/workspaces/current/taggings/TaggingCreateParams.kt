// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.taggings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.workspaces.current.tags.ResourceType
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Create Tagging */
class TaggingCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resourceId(): String = body.resourceId()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resourceType(): ResourceType = body.resourceType()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tagValueId(): String = body.tagValueId()

    /**
     * Returns the raw JSON value of [resourceId].
     *
     * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _resourceId(): JsonField<String> = body._resourceId()

    /**
     * Returns the raw JSON value of [resourceType].
     *
     * Unlike [resourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _resourceType(): JsonField<ResourceType> = body._resourceType()

    /**
     * Returns the raw JSON value of [tagValueId].
     *
     * Unlike [tagValueId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tagValueId(): JsonField<String> = body._tagValueId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TaggingCreateParams].
         *
         * The following fields are required:
         * ```java
         * .resourceId()
         * .resourceType()
         * .tagValueId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TaggingCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(taggingCreateParams: TaggingCreateParams) = apply {
            body = taggingCreateParams.body.toBuilder()
            additionalHeaders = taggingCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = taggingCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [resourceId]
         * - [resourceType]
         * - [tagValueId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun resourceId(resourceId: String) = apply { body.resourceId(resourceId) }

        /**
         * Sets [Builder.resourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceId(resourceId: JsonField<String>) = apply { body.resourceId(resourceId) }

        fun resourceType(resourceType: ResourceType) = apply { body.resourceType(resourceType) }

        /**
         * Sets [Builder.resourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceType] with a well-typed [ResourceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resourceType(resourceType: JsonField<ResourceType>) = apply {
            body.resourceType(resourceType)
        }

        fun tagValueId(tagValueId: String) = apply { body.tagValueId(tagValueId) }

        /**
         * Sets [Builder.tagValueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagValueId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tagValueId(tagValueId: JsonField<String>) = apply { body.tagValueId(tagValueId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [TaggingCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .resourceId()
         * .resourceType()
         * .tagValueId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TaggingCreateParams =
            TaggingCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val resourceId: JsonField<String>,
        private val resourceType: JsonField<ResourceType>,
        private val tagValueId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("resource_id")
            @ExcludeMissing
            resourceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("resource_type")
            @ExcludeMissing
            resourceType: JsonField<ResourceType> = JsonMissing.of(),
            @JsonProperty("tag_value_id")
            @ExcludeMissing
            tagValueId: JsonField<String> = JsonMissing.of(),
        ) : this(resourceId, resourceType, tagValueId, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun resourceId(): String = resourceId.getRequired("resource_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun resourceType(): ResourceType = resourceType.getRequired("resource_type")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tagValueId(): String = tagValueId.getRequired("tag_value_id")

        /**
         * Returns the raw JSON value of [resourceId].
         *
         * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resource_id")
        @ExcludeMissing
        fun _resourceId(): JsonField<String> = resourceId

        /**
         * Returns the raw JSON value of [resourceType].
         *
         * Unlike [resourceType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("resource_type")
        @ExcludeMissing
        fun _resourceType(): JsonField<ResourceType> = resourceType

        /**
         * Returns the raw JSON value of [tagValueId].
         *
         * Unlike [tagValueId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tag_value_id")
        @ExcludeMissing
        fun _tagValueId(): JsonField<String> = tagValueId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .resourceId()
             * .resourceType()
             * .tagValueId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var resourceId: JsonField<String>? = null
            private var resourceType: JsonField<ResourceType>? = null
            private var tagValueId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                resourceId = body.resourceId
                resourceType = body.resourceType
                tagValueId = body.tagValueId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun resourceId(resourceId: String) = resourceId(JsonField.of(resourceId))

            /**
             * Sets [Builder.resourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resourceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

            fun resourceType(resourceType: ResourceType) = resourceType(JsonField.of(resourceType))

            /**
             * Sets [Builder.resourceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resourceType] with a well-typed [ResourceType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resourceType(resourceType: JsonField<ResourceType>) = apply {
                this.resourceType = resourceType
            }

            fun tagValueId(tagValueId: String) = tagValueId(JsonField.of(tagValueId))

            /**
             * Sets [Builder.tagValueId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tagValueId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tagValueId(tagValueId: JsonField<String>) = apply { this.tagValueId = tagValueId }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .resourceId()
             * .resourceType()
             * .tagValueId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("resourceId", resourceId),
                    checkRequired("resourceType", resourceType),
                    checkRequired("tagValueId", tagValueId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            resourceId()
            resourceType().validate()
            tagValueId()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (resourceId.asKnown().isPresent) 1 else 0) +
                (resourceType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (tagValueId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                resourceId == other.resourceId &&
                resourceType == other.resourceType &&
                tagValueId == other.tagValueId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(resourceId, resourceType, tagValueId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{resourceId=$resourceId, resourceType=$resourceType, tagValueId=$tagValueId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TaggingCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TaggingCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
