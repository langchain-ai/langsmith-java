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

/** Generate synthetic examples for a dataset. */
class DatasetGenerateParams
private constructor(
    private val datasetId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numExamples(): Long = body.numExamples()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun exampleIds(): Optional<List<String>> = body.exampleIds()

    /**
     * Returns the raw JSON value of [numExamples].
     *
     * Unlike [numExamples], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numExamples(): JsonField<Long> = body._numExamples()

    /**
     * Returns the raw JSON value of [exampleIds].
     *
     * Unlike [exampleIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _exampleIds(): JsonField<List<String>> = body._exampleIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetGenerateParams].
         *
         * The following fields are required:
         * ```java
         * .numExamples()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetGenerateParams]. */
    class Builder internal constructor() {

        private var datasetId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(datasetGenerateParams: DatasetGenerateParams) = apply {
            datasetId = datasetGenerateParams.datasetId
            body = datasetGenerateParams.body.toBuilder()
            additionalHeaders = datasetGenerateParams.additionalHeaders.toBuilder()
            additionalQueryParams = datasetGenerateParams.additionalQueryParams.toBuilder()
        }

        fun datasetId(datasetId: String?) = apply { this.datasetId = datasetId }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [numExamples]
         * - [exampleIds]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun numExamples(numExamples: Long) = apply { body.numExamples(numExamples) }

        /**
         * Sets [Builder.numExamples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numExamples] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numExamples(numExamples: JsonField<Long>) = apply { body.numExamples(numExamples) }

        fun exampleIds(exampleIds: List<String>?) = apply { body.exampleIds(exampleIds) }

        /** Alias for calling [Builder.exampleIds] with `exampleIds.orElse(null)`. */
        fun exampleIds(exampleIds: Optional<List<String>>) = exampleIds(exampleIds.getOrNull())

        /**
         * Sets [Builder.exampleIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exampleIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exampleIds(exampleIds: JsonField<List<String>>) = apply { body.exampleIds(exampleIds) }

        /**
         * Adds a single [String] to [exampleIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExampleId(exampleId: String) = apply { body.addExampleId(exampleId) }

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
         * Returns an immutable instance of [DatasetGenerateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .numExamples()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetGenerateParams =
            DatasetGenerateParams(
                datasetId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> datasetId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val numExamples: JsonField<Long>,
        private val exampleIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("num_examples")
            @ExcludeMissing
            numExamples: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("example_ids")
            @ExcludeMissing
            exampleIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(numExamples, exampleIds, mutableMapOf())

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun numExamples(): Long = numExamples.getRequired("num_examples")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun exampleIds(): Optional<List<String>> = exampleIds.getOptional("example_ids")

        /**
         * Returns the raw JSON value of [numExamples].
         *
         * Unlike [numExamples], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("num_examples")
        @ExcludeMissing
        fun _numExamples(): JsonField<Long> = numExamples

        /**
         * Returns the raw JSON value of [exampleIds].
         *
         * Unlike [exampleIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("example_ids")
        @ExcludeMissing
        fun _exampleIds(): JsonField<List<String>> = exampleIds

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
             * .numExamples()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var numExamples: JsonField<Long>? = null
            private var exampleIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                numExamples = body.numExamples
                exampleIds = body.exampleIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun numExamples(numExamples: Long) = numExamples(JsonField.of(numExamples))

            /**
             * Sets [Builder.numExamples] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numExamples] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numExamples(numExamples: JsonField<Long>) = apply { this.numExamples = numExamples }

            fun exampleIds(exampleIds: List<String>?) = exampleIds(JsonField.ofNullable(exampleIds))

            /** Alias for calling [Builder.exampleIds] with `exampleIds.orElse(null)`. */
            fun exampleIds(exampleIds: Optional<List<String>>) = exampleIds(exampleIds.getOrNull())

            /**
             * Sets [Builder.exampleIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exampleIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exampleIds(exampleIds: JsonField<List<String>>) = apply {
                this.exampleIds = exampleIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [exampleIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExampleId(exampleId: String) = apply {
                exampleIds =
                    (exampleIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("exampleIds", it).add(exampleId)
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
             * .numExamples()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("numExamples", numExamples),
                    (exampleIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            numExamples()
            exampleIds()
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
            (if (numExamples.asKnown().isPresent) 1 else 0) +
                (exampleIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                numExamples == other.numExamples &&
                exampleIds == other.exampleIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(numExamples, exampleIds, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{numExamples=$numExamples, exampleIds=$exampleIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetGenerateParams &&
            datasetId == other.datasetId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(datasetId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DatasetGenerateParams{datasetId=$datasetId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
