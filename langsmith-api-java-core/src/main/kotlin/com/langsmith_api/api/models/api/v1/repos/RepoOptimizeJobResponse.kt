// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos

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

/** Response from optimizing a prompt. */
class RepoOptimizeJobResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val optimizationJobId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("optimization_job_id")
        @ExcludeMissing
        optimizationJobId: JsonField<String> = JsonMissing.of()
    ) : this(optimizationJobId, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optimizationJobId(): String = optimizationJobId.getRequired("optimization_job_id")

    /**
     * Returns the raw JSON value of [optimizationJobId].
     *
     * Unlike [optimizationJobId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("optimization_job_id")
    @ExcludeMissing
    fun _optimizationJobId(): JsonField<String> = optimizationJobId

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
         * Returns a mutable builder for constructing an instance of [RepoOptimizeJobResponse].
         *
         * The following fields are required:
         * ```java
         * .optimizationJobId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RepoOptimizeJobResponse]. */
    class Builder internal constructor() {

        private var optimizationJobId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(repoOptimizeJobResponse: RepoOptimizeJobResponse) = apply {
            optimizationJobId = repoOptimizeJobResponse.optimizationJobId
            additionalProperties = repoOptimizeJobResponse.additionalProperties.toMutableMap()
        }

        fun optimizationJobId(optimizationJobId: String) =
            optimizationJobId(JsonField.of(optimizationJobId))

        /**
         * Sets [Builder.optimizationJobId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optimizationJobId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun optimizationJobId(optimizationJobId: JsonField<String>) = apply {
            this.optimizationJobId = optimizationJobId
        }

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
         * Returns an immutable instance of [RepoOptimizeJobResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .optimizationJobId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RepoOptimizeJobResponse =
            RepoOptimizeJobResponse(
                checkRequired("optimizationJobId", optimizationJobId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RepoOptimizeJobResponse = apply {
        if (validated) {
            return@apply
        }

        optimizationJobId()
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
    internal fun validity(): Int = (if (optimizationJobId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RepoOptimizeJobResponse &&
            optimizationJobId == other.optimizationJobId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(optimizationJobId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RepoOptimizeJobResponse{optimizationJobId=$optimizationJobId, additionalProperties=$additionalProperties}"
}
