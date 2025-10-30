// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets

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
import com.langsmith_api.api.models.api.v1.sessions.TracerSession
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Class for uploading the results of an already-run experiment. */
class DatasetUploadExperimentResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dataset: JsonField<Dataset>,
    private val experiment: JsonField<TracerSession>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dataset") @ExcludeMissing dataset: JsonField<Dataset> = JsonMissing.of(),
        @JsonProperty("experiment")
        @ExcludeMissing
        experiment: JsonField<TracerSession> = JsonMissing.of(),
    ) : this(dataset, experiment, mutableMapOf())

    /**
     * Dataset schema.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataset(): Dataset = dataset.getRequired("dataset")

    /**
     * TracerSession schema.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun experiment(): TracerSession = experiment.getRequired("experiment")

    /**
     * Returns the raw JSON value of [dataset].
     *
     * Unlike [dataset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset") @ExcludeMissing fun _dataset(): JsonField<Dataset> = dataset

    /**
     * Returns the raw JSON value of [experiment].
     *
     * Unlike [experiment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("experiment")
    @ExcludeMissing
    fun _experiment(): JsonField<TracerSession> = experiment

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
         * Returns a mutable builder for constructing an instance of
         * [DatasetUploadExperimentResponse].
         *
         * The following fields are required:
         * ```java
         * .dataset()
         * .experiment()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetUploadExperimentResponse]. */
    class Builder internal constructor() {

        private var dataset: JsonField<Dataset>? = null
        private var experiment: JsonField<TracerSession>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetUploadExperimentResponse: DatasetUploadExperimentResponse) =
            apply {
                dataset = datasetUploadExperimentResponse.dataset
                experiment = datasetUploadExperimentResponse.experiment
                additionalProperties =
                    datasetUploadExperimentResponse.additionalProperties.toMutableMap()
            }

        /** Dataset schema. */
        fun dataset(dataset: Dataset) = dataset(JsonField.of(dataset))

        /**
         * Sets [Builder.dataset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataset] with a well-typed [Dataset] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dataset(dataset: JsonField<Dataset>) = apply { this.dataset = dataset }

        /** TracerSession schema. */
        fun experiment(experiment: TracerSession) = experiment(JsonField.of(experiment))

        /**
         * Sets [Builder.experiment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.experiment] with a well-typed [TracerSession] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun experiment(experiment: JsonField<TracerSession>) = apply {
            this.experiment = experiment
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
         * Returns an immutable instance of [DatasetUploadExperimentResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dataset()
         * .experiment()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetUploadExperimentResponse =
            DatasetUploadExperimentResponse(
                checkRequired("dataset", dataset),
                checkRequired("experiment", experiment),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DatasetUploadExperimentResponse = apply {
        if (validated) {
            return@apply
        }

        dataset().validate()
        experiment().validate()
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
        (dataset.asKnown().getOrNull()?.validity() ?: 0) +
            (experiment.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetUploadExperimentResponse &&
            dataset == other.dataset &&
            experiment == other.experiment &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(dataset, experiment, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DatasetUploadExperimentResponse{dataset=$dataset, experiment=$experiment, additionalProperties=$additionalProperties}"
}
