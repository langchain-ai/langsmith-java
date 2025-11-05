// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.experimentviewoverrides

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new experiment view override configuration for a dataset with column display settings.
 * This endpoint allows you to customize how experiment results are displayed by configuring
 * column-specific overrides including colors, precision, and visibility.
 *
 * The request must include a 'column_overrides' array with at least one override configuration.
 * Each column override can specify:
 * - column: Required field name (must start with inputs, outputs, reference_outputs, feedback,
 *   metrics, attachments, or metadata)
 * - color_gradient: Optional array of [number, color] tuples for numeric data visualization
 * - precision: Optional number (1-6) for decimal places in numeric columns
 * - hide: Optional boolean to control column visibility
 *
 * Example request body: { "column_overrides":
 * [ { "column": "outputs.accuracy", "color_gradient": [[0.0, "#ff0000"], [0.5, "#ffff00"],
 * [1.0, "#00ff00"]], "precision": 3 }, { "column": "inputs.model_type", "hide": false } ] }
 *
 * This operation fails if an override already exists for the dataset (use PATCH to update).
 */
class ExperimentViewOverrideCreateParams
private constructor(
    private val datasetId: JsonValue?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasetId(): Optional<JsonValue> = Optional.ofNullable(datasetId)

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun columnOverrides(): List<ColumnOverride> = body.columnOverrides()

    /**
     * Returns the raw JSON value of [columnOverrides].
     *
     * Unlike [columnOverrides], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _columnOverrides(): JsonField<List<ColumnOverride>> = body._columnOverrides()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExperimentViewOverrideCreateParams].
         *
         * The following fields are required:
         * ```java
         * .columnOverrides()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExperimentViewOverrideCreateParams]. */
    class Builder internal constructor() {

        private var datasetId: JsonValue? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(experimentViewOverrideCreateParams: ExperimentViewOverrideCreateParams) =
            apply {
                datasetId = experimentViewOverrideCreateParams.datasetId
                body = experimentViewOverrideCreateParams.body.toBuilder()
                additionalHeaders = experimentViewOverrideCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    experimentViewOverrideCreateParams.additionalQueryParams.toBuilder()
            }

        fun datasetId(datasetId: JsonValue?) = apply { this.datasetId = datasetId }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<JsonValue>) = datasetId(datasetId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [columnOverrides]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun columnOverrides(columnOverrides: List<ColumnOverride>) = apply {
            body.columnOverrides(columnOverrides)
        }

        /**
         * Sets [Builder.columnOverrides] to an arbitrary JSON value.
         *
         * You should usually call [Builder.columnOverrides] with a well-typed
         * `List<ColumnOverride>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun columnOverrides(columnOverrides: JsonField<List<ColumnOverride>>) = apply {
            body.columnOverrides(columnOverrides)
        }

        /**
         * Adds a single [ColumnOverride] to [columnOverrides].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addColumnOverride(columnOverride: ColumnOverride) = apply {
            body.addColumnOverride(columnOverride)
        }

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
         * Returns an immutable instance of [ExperimentViewOverrideCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .columnOverrides()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExperimentViewOverrideCreateParams =
            ExperimentViewOverrideCreateParams(
                datasetId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> datasetId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val columnOverrides: JsonField<List<ColumnOverride>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("column_overrides")
            @ExcludeMissing
            columnOverrides: JsonField<List<ColumnOverride>> = JsonMissing.of()
        ) : this(columnOverrides, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun columnOverrides(): List<ColumnOverride> =
            columnOverrides.getRequired("column_overrides")

        /**
         * Returns the raw JSON value of [columnOverrides].
         *
         * Unlike [columnOverrides], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("column_overrides")
        @ExcludeMissing
        fun _columnOverrides(): JsonField<List<ColumnOverride>> = columnOverrides

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
             * .columnOverrides()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var columnOverrides: JsonField<MutableList<ColumnOverride>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                columnOverrides = body.columnOverrides.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun columnOverrides(columnOverrides: List<ColumnOverride>) =
                columnOverrides(JsonField.of(columnOverrides))

            /**
             * Sets [Builder.columnOverrides] to an arbitrary JSON value.
             *
             * You should usually call [Builder.columnOverrides] with a well-typed
             * `List<ColumnOverride>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun columnOverrides(columnOverrides: JsonField<List<ColumnOverride>>) = apply {
                this.columnOverrides = columnOverrides.map { it.toMutableList() }
            }

            /**
             * Adds a single [ColumnOverride] to [columnOverrides].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addColumnOverride(columnOverride: ColumnOverride) = apply {
                columnOverrides =
                    (columnOverrides ?: JsonField.of(mutableListOf())).also {
                        checkKnown("columnOverrides", it).add(columnOverride)
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
             * .columnOverrides()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("columnOverrides", columnOverrides).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            columnOverrides().forEach { it.validate() }
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
            (columnOverrides.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                columnOverrides == other.columnOverrides &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(columnOverrides, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{columnOverrides=$columnOverrides, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExperimentViewOverrideCreateParams &&
            datasetId == other.datasetId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(datasetId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExperimentViewOverrideCreateParams{datasetId=$datasetId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
