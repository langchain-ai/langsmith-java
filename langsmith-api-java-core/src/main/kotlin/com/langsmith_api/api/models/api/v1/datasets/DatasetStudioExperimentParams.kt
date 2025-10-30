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
import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Studio Experiment */
class DatasetStudioExperimentParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasetId(): String = body.datasetId()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectName(): String = body.projectName()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun evaluatorRules(): Optional<List<String>> = body.evaluatorRules()

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _datasetId(): JsonField<String> = body._datasetId()

    /**
     * Returns the raw JSON value of [projectName].
     *
     * Unlike [projectName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _projectName(): JsonField<String> = body._projectName()

    /**
     * Returns the raw JSON value of [evaluatorRules].
     *
     * Unlike [evaluatorRules], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _evaluatorRules(): JsonField<List<String>> = body._evaluatorRules()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DatasetStudioExperimentParams].
         *
         * The following fields are required:
         * ```java
         * .datasetId()
         * .projectName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetStudioExperimentParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(datasetStudioExperimentParams: DatasetStudioExperimentParams) = apply {
            body = datasetStudioExperimentParams.body.toBuilder()
            additionalHeaders = datasetStudioExperimentParams.additionalHeaders.toBuilder()
            additionalQueryParams = datasetStudioExperimentParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [datasetId]
         * - [projectName]
         * - [evaluatorRules]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun datasetId(datasetId: String) = apply { body.datasetId(datasetId) }

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { body.datasetId(datasetId) }

        fun projectName(projectName: String) = apply { body.projectName(projectName) }

        /**
         * Sets [Builder.projectName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectName(projectName: JsonField<String>) = apply { body.projectName(projectName) }

        fun evaluatorRules(evaluatorRules: List<String>?) = apply {
            body.evaluatorRules(evaluatorRules)
        }

        /** Alias for calling [Builder.evaluatorRules] with `evaluatorRules.orElse(null)`. */
        fun evaluatorRules(evaluatorRules: Optional<List<String>>) =
            evaluatorRules(evaluatorRules.getOrNull())

        /**
         * Sets [Builder.evaluatorRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluatorRules] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evaluatorRules(evaluatorRules: JsonField<List<String>>) = apply {
            body.evaluatorRules(evaluatorRules)
        }

        /**
         * Adds a single [String] to [evaluatorRules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvaluatorRule(evaluatorRule: String) = apply { body.addEvaluatorRule(evaluatorRule) }

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
         * Returns an immutable instance of [DatasetStudioExperimentParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .datasetId()
         * .projectName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetStudioExperimentParams =
            DatasetStudioExperimentParams(
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
        private val datasetId: JsonField<String>,
        private val projectName: JsonField<String>,
        private val evaluatorRules: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dataset_id")
            @ExcludeMissing
            datasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("project_name")
            @ExcludeMissing
            projectName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("evaluator_rules")
            @ExcludeMissing
            evaluatorRules: JsonField<List<String>> = JsonMissing.of(),
        ) : this(datasetId, projectName, evaluatorRules, mutableMapOf())

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun datasetId(): String = datasetId.getRequired("dataset_id")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun projectName(): String = projectName.getRequired("project_name")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun evaluatorRules(): Optional<List<String>> = evaluatorRules.getOptional("evaluator_rules")

        /**
         * Returns the raw JSON value of [datasetId].
         *
         * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

        /**
         * Returns the raw JSON value of [projectName].
         *
         * Unlike [projectName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_name")
        @ExcludeMissing
        fun _projectName(): JsonField<String> = projectName

        /**
         * Returns the raw JSON value of [evaluatorRules].
         *
         * Unlike [evaluatorRules], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("evaluator_rules")
        @ExcludeMissing
        fun _evaluatorRules(): JsonField<List<String>> = evaluatorRules

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
             * .datasetId()
             * .projectName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var datasetId: JsonField<String>? = null
            private var projectName: JsonField<String>? = null
            private var evaluatorRules: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                datasetId = body.datasetId
                projectName = body.projectName
                evaluatorRules = body.evaluatorRules.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

            /**
             * Sets [Builder.datasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

            fun projectName(projectName: String) = projectName(JsonField.of(projectName))

            /**
             * Sets [Builder.projectName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectName(projectName: JsonField<String>) = apply {
                this.projectName = projectName
            }

            fun evaluatorRules(evaluatorRules: List<String>?) =
                evaluatorRules(JsonField.ofNullable(evaluatorRules))

            /** Alias for calling [Builder.evaluatorRules] with `evaluatorRules.orElse(null)`. */
            fun evaluatorRules(evaluatorRules: Optional<List<String>>) =
                evaluatorRules(evaluatorRules.getOrNull())

            /**
             * Sets [Builder.evaluatorRules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evaluatorRules] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun evaluatorRules(evaluatorRules: JsonField<List<String>>) = apply {
                this.evaluatorRules = evaluatorRules.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [evaluatorRules].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEvaluatorRule(evaluatorRule: String) = apply {
                evaluatorRules =
                    (evaluatorRules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("evaluatorRules", it).add(evaluatorRule)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .datasetId()
             * .projectName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("datasetId", datasetId),
                    checkRequired("projectName", projectName),
                    (evaluatorRules ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            datasetId()
            projectName()
            evaluatorRules()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (datasetId.asKnown().isPresent) 1 else 0) +
                (if (projectName.asKnown().isPresent) 1 else 0) +
                (evaluatorRules.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                datasetId == other.datasetId &&
                projectName == other.projectName &&
                evaluatorRules == other.evaluatorRules &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(datasetId, projectName, evaluatorRules, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{datasetId=$datasetId, projectName=$projectName, evaluatorRules=$evaluatorRules, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetStudioExperimentParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DatasetStudioExperimentParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
