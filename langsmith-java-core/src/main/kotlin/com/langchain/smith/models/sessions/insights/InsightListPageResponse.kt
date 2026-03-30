// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Response to get all cluster jobs for a session. */
class InsightListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clusteringJobs: JsonField<List<InsightListResponse>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clustering_jobs")
        @ExcludeMissing
        clusteringJobs: JsonField<List<InsightListResponse>> = JsonMissing.of()
    ) : this(clusteringJobs, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clusteringJobs(): List<InsightListResponse> = clusteringJobs.getRequired("clustering_jobs")

    /**
     * Returns the raw JSON value of [clusteringJobs].
     *
     * Unlike [clusteringJobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clustering_jobs")
    @ExcludeMissing
    fun _clusteringJobs(): JsonField<List<InsightListResponse>> = clusteringJobs

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
         * Returns a mutable builder for constructing an instance of [InsightListPageResponse].
         *
         * The following fields are required:
         * ```java
         * .clusteringJobs()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InsightListPageResponse]. */
    class Builder internal constructor() {

        private var clusteringJobs: JsonField<MutableList<InsightListResponse>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insightListPageResponse: InsightListPageResponse) = apply {
            clusteringJobs = insightListPageResponse.clusteringJobs.map { it.toMutableList() }
            additionalProperties = insightListPageResponse.additionalProperties.toMutableMap()
        }

        fun clusteringJobs(clusteringJobs: List<InsightListResponse>) =
            clusteringJobs(JsonField.of(clusteringJobs))

        /**
         * Sets [Builder.clusteringJobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clusteringJobs] with a well-typed
         * `List<InsightListResponse>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun clusteringJobs(clusteringJobs: JsonField<List<InsightListResponse>>) = apply {
            this.clusteringJobs = clusteringJobs.map { it.toMutableList() }
        }

        /**
         * Adds a single [InsightListResponse] to [clusteringJobs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addClusteringJob(clusteringJob: InsightListResponse) = apply {
            clusteringJobs =
                (clusteringJobs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("clusteringJobs", it).add(clusteringJob)
                }
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
         * Returns an immutable instance of [InsightListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clusteringJobs()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InsightListPageResponse =
            InsightListPageResponse(
                checkRequired("clusteringJobs", clusteringJobs).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InsightListPageResponse = apply {
        if (validated) {
            return@apply
        }

        clusteringJobs().forEach { it.validate() }
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
        (clusteringJobs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsightListPageResponse &&
            clusteringJobs == other.clusteringJobs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(clusteringJobs, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InsightListPageResponse{clusteringJobs=$clusteringJobs, additionalProperties=$additionalProperties}"
}
