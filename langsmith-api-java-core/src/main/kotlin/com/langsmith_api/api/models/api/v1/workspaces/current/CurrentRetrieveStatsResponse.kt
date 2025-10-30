// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current

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

/** Stats for a tenant. */
class CurrentRetrieveStatsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val annotationQueueCount: JsonField<Long>,
    private val dashboardsCount: JsonField<Long>,
    private val datasetCount: JsonField<Long>,
    private val deploymentCount: JsonField<Long>,
    private val repoCount: JsonField<Long>,
    private val tenantId: JsonField<String>,
    private val tracerSessionCount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("annotation_queue_count")
        @ExcludeMissing
        annotationQueueCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("dashboards_count")
        @ExcludeMissing
        dashboardsCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("dataset_count")
        @ExcludeMissing
        datasetCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("deployment_count")
        @ExcludeMissing
        deploymentCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("repo_count") @ExcludeMissing repoCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tracer_session_count")
        @ExcludeMissing
        tracerSessionCount: JsonField<Long> = JsonMissing.of(),
    ) : this(
        annotationQueueCount,
        dashboardsCount,
        datasetCount,
        deploymentCount,
        repoCount,
        tenantId,
        tracerSessionCount,
        mutableMapOf(),
    )

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun annotationQueueCount(): Long = annotationQueueCount.getRequired("annotation_queue_count")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dashboardsCount(): Long = dashboardsCount.getRequired("dashboards_count")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasetCount(): Long = datasetCount.getRequired("dataset_count")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deploymentCount(): Long = deploymentCount.getRequired("deployment_count")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun repoCount(): Long = repoCount.getRequired("repo_count")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tracerSessionCount(): Long = tracerSessionCount.getRequired("tracer_session_count")

    /**
     * Returns the raw JSON value of [annotationQueueCount].
     *
     * Unlike [annotationQueueCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("annotation_queue_count")
    @ExcludeMissing
    fun _annotationQueueCount(): JsonField<Long> = annotationQueueCount

    /**
     * Returns the raw JSON value of [dashboardsCount].
     *
     * Unlike [dashboardsCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dashboards_count")
    @ExcludeMissing
    fun _dashboardsCount(): JsonField<Long> = dashboardsCount

    /**
     * Returns the raw JSON value of [datasetCount].
     *
     * Unlike [datasetCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset_count")
    @ExcludeMissing
    fun _datasetCount(): JsonField<Long> = datasetCount

    /**
     * Returns the raw JSON value of [deploymentCount].
     *
     * Unlike [deploymentCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deployment_count")
    @ExcludeMissing
    fun _deploymentCount(): JsonField<Long> = deploymentCount

    /**
     * Returns the raw JSON value of [repoCount].
     *
     * Unlike [repoCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("repo_count") @ExcludeMissing fun _repoCount(): JsonField<Long> = repoCount

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [tracerSessionCount].
     *
     * Unlike [tracerSessionCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tracer_session_count")
    @ExcludeMissing
    fun _tracerSessionCount(): JsonField<Long> = tracerSessionCount

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
         * Returns a mutable builder for constructing an instance of [CurrentRetrieveStatsResponse].
         *
         * The following fields are required:
         * ```java
         * .annotationQueueCount()
         * .dashboardsCount()
         * .datasetCount()
         * .deploymentCount()
         * .repoCount()
         * .tenantId()
         * .tracerSessionCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CurrentRetrieveStatsResponse]. */
    class Builder internal constructor() {

        private var annotationQueueCount: JsonField<Long>? = null
        private var dashboardsCount: JsonField<Long>? = null
        private var datasetCount: JsonField<Long>? = null
        private var deploymentCount: JsonField<Long>? = null
        private var repoCount: JsonField<Long>? = null
        private var tenantId: JsonField<String>? = null
        private var tracerSessionCount: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(currentRetrieveStatsResponse: CurrentRetrieveStatsResponse) = apply {
            annotationQueueCount = currentRetrieveStatsResponse.annotationQueueCount
            dashboardsCount = currentRetrieveStatsResponse.dashboardsCount
            datasetCount = currentRetrieveStatsResponse.datasetCount
            deploymentCount = currentRetrieveStatsResponse.deploymentCount
            repoCount = currentRetrieveStatsResponse.repoCount
            tenantId = currentRetrieveStatsResponse.tenantId
            tracerSessionCount = currentRetrieveStatsResponse.tracerSessionCount
            additionalProperties = currentRetrieveStatsResponse.additionalProperties.toMutableMap()
        }

        fun annotationQueueCount(annotationQueueCount: Long) =
            annotationQueueCount(JsonField.of(annotationQueueCount))

        /**
         * Sets [Builder.annotationQueueCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.annotationQueueCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun annotationQueueCount(annotationQueueCount: JsonField<Long>) = apply {
            this.annotationQueueCount = annotationQueueCount
        }

        fun dashboardsCount(dashboardsCount: Long) = dashboardsCount(JsonField.of(dashboardsCount))

        /**
         * Sets [Builder.dashboardsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dashboardsCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dashboardsCount(dashboardsCount: JsonField<Long>) = apply {
            this.dashboardsCount = dashboardsCount
        }

        fun datasetCount(datasetCount: Long) = datasetCount(JsonField.of(datasetCount))

        /**
         * Sets [Builder.datasetCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetCount(datasetCount: JsonField<Long>) = apply { this.datasetCount = datasetCount }

        fun deploymentCount(deploymentCount: Long) = deploymentCount(JsonField.of(deploymentCount))

        /**
         * Sets [Builder.deploymentCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deploymentCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deploymentCount(deploymentCount: JsonField<Long>) = apply {
            this.deploymentCount = deploymentCount
        }

        fun repoCount(repoCount: Long) = repoCount(JsonField.of(repoCount))

        /**
         * Sets [Builder.repoCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repoCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun repoCount(repoCount: JsonField<Long>) = apply { this.repoCount = repoCount }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun tracerSessionCount(tracerSessionCount: Long) =
            tracerSessionCount(JsonField.of(tracerSessionCount))

        /**
         * Sets [Builder.tracerSessionCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tracerSessionCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tracerSessionCount(tracerSessionCount: JsonField<Long>) = apply {
            this.tracerSessionCount = tracerSessionCount
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
         * Returns an immutable instance of [CurrentRetrieveStatsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .annotationQueueCount()
         * .dashboardsCount()
         * .datasetCount()
         * .deploymentCount()
         * .repoCount()
         * .tenantId()
         * .tracerSessionCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CurrentRetrieveStatsResponse =
            CurrentRetrieveStatsResponse(
                checkRequired("annotationQueueCount", annotationQueueCount),
                checkRequired("dashboardsCount", dashboardsCount),
                checkRequired("datasetCount", datasetCount),
                checkRequired("deploymentCount", deploymentCount),
                checkRequired("repoCount", repoCount),
                checkRequired("tenantId", tenantId),
                checkRequired("tracerSessionCount", tracerSessionCount),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CurrentRetrieveStatsResponse = apply {
        if (validated) {
            return@apply
        }

        annotationQueueCount()
        dashboardsCount()
        datasetCount()
        deploymentCount()
        repoCount()
        tenantId()
        tracerSessionCount()
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
        (if (annotationQueueCount.asKnown().isPresent) 1 else 0) +
            (if (dashboardsCount.asKnown().isPresent) 1 else 0) +
            (if (datasetCount.asKnown().isPresent) 1 else 0) +
            (if (deploymentCount.asKnown().isPresent) 1 else 0) +
            (if (repoCount.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (tracerSessionCount.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CurrentRetrieveStatsResponse &&
            annotationQueueCount == other.annotationQueueCount &&
            dashboardsCount == other.dashboardsCount &&
            datasetCount == other.datasetCount &&
            deploymentCount == other.deploymentCount &&
            repoCount == other.repoCount &&
            tenantId == other.tenantId &&
            tracerSessionCount == other.tracerSessionCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            annotationQueueCount,
            dashboardsCount,
            datasetCount,
            deploymentCount,
            repoCount,
            tenantId,
            tracerSessionCount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CurrentRetrieveStatsResponse{annotationQueueCount=$annotationQueueCount, dashboardsCount=$dashboardsCount, datasetCount=$datasetCount, deploymentCount=$deploymentCount, repoCount=$repoCount, tenantId=$tenantId, tracerSessionCount=$tracerSessionCount, additionalProperties=$additionalProperties}"
}
