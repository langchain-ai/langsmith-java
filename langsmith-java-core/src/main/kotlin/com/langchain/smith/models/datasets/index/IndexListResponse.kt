// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.index

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Dataset schema for serving. */
class IndexListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val datasetId: JsonField<String>,
    private val lastUpdatedVersion: JsonField<OffsetDateTime>,
    private val tag: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dataset_id") @ExcludeMissing datasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_updated_version")
        @ExcludeMissing
        lastUpdatedVersion: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("tag") @ExcludeMissing tag: JsonField<String> = JsonMissing.of(),
    ) : this(datasetId, lastUpdatedVersion, tag, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasetId(): String = datasetId.getRequired("dataset_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastUpdatedVersion(): Optional<OffsetDateTime> =
        lastUpdatedVersion.getOptional("last_updated_version")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tag(): Optional<String> = tag.getOptional("tag")

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

    /**
     * Returns the raw JSON value of [lastUpdatedVersion].
     *
     * Unlike [lastUpdatedVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("last_updated_version")
    @ExcludeMissing
    fun _lastUpdatedVersion(): JsonField<OffsetDateTime> = lastUpdatedVersion

    /**
     * Returns the raw JSON value of [tag].
     *
     * Unlike [tag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tag") @ExcludeMissing fun _tag(): JsonField<String> = tag

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
         * Returns a mutable builder for constructing an instance of [IndexListResponse].
         *
         * The following fields are required:
         * ```java
         * .datasetId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IndexListResponse]. */
    class Builder internal constructor() {

        private var datasetId: JsonField<String>? = null
        private var lastUpdatedVersion: JsonField<OffsetDateTime> = JsonMissing.of()
        private var tag: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(indexListResponse: IndexListResponse) = apply {
            datasetId = indexListResponse.datasetId
            lastUpdatedVersion = indexListResponse.lastUpdatedVersion
            tag = indexListResponse.tag
            additionalProperties = indexListResponse.additionalProperties.toMutableMap()
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

        fun lastUpdatedVersion(lastUpdatedVersion: OffsetDateTime?) =
            lastUpdatedVersion(JsonField.ofNullable(lastUpdatedVersion))

        /**
         * Alias for calling [Builder.lastUpdatedVersion] with `lastUpdatedVersion.orElse(null)`.
         */
        fun lastUpdatedVersion(lastUpdatedVersion: Optional<OffsetDateTime>) =
            lastUpdatedVersion(lastUpdatedVersion.getOrNull())

        /**
         * Sets [Builder.lastUpdatedVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastUpdatedVersion] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastUpdatedVersion(lastUpdatedVersion: JsonField<OffsetDateTime>) = apply {
            this.lastUpdatedVersion = lastUpdatedVersion
        }

        fun tag(tag: String?) = tag(JsonField.ofNullable(tag))

        /** Alias for calling [Builder.tag] with `tag.orElse(null)`. */
        fun tag(tag: Optional<String>) = tag(tag.getOrNull())

        /**
         * Sets [Builder.tag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tag] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tag(tag: JsonField<String>) = apply { this.tag = tag }

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
         * Returns an immutable instance of [IndexListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .datasetId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IndexListResponse =
            IndexListResponse(
                checkRequired("datasetId", datasetId),
                lastUpdatedVersion,
                tag,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IndexListResponse = apply {
        if (validated) {
            return@apply
        }

        datasetId()
        lastUpdatedVersion()
        tag()
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
            (if (lastUpdatedVersion.asKnown().isPresent) 1 else 0) +
            (if (tag.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IndexListResponse &&
            datasetId == other.datasetId &&
            lastUpdatedVersion == other.lastUpdatedVersion &&
            tag == other.tag &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(datasetId, lastUpdatedVersion, tag, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IndexListResponse{datasetId=$datasetId, lastUpdatedVersion=$lastUpdatedVersion, tag=$tag, additionalProperties=$additionalProperties}"
}
