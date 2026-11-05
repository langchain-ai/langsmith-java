// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.examples

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
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
 * Applies the same metadata changes, in order, to every listed example in a dataset. Examples that
 * are not in the dataset or were deleted are skipped; the rest are updated together, so if the
 * update fails none of them change. Answers 207 with one status per submitted example ID: UPDATED,
 * or NOT_FOUND for a skipped example. Metadata keys the operations do not name keep their values.
 * To add examples to a split or remove them from one, use ARRAY_ADD or ARRAY_REMOVE on the
 * dataset_split key. Requires permission to update datasets.
 */
class ExampleUpdateMetadataParams
private constructor(
    private val datasetId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    /**
     * The IDs of the examples to change; at most 10000. IDs of examples that are not in the
     * dataset, or were deleted, are skipped and reported as NOT_FOUND.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exampleIds(): List<String> = body.exampleIds()

    /**
     * The metadata changes to apply, in order; at most 50, of which at most 10 are array
     * operations.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operations(): List<Operation> = body.operations()

    /**
     * Returns the raw JSON value of [exampleIds].
     *
     * Unlike [exampleIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _exampleIds(): JsonField<List<String>> = body._exampleIds()

    /**
     * Returns the raw JSON value of [operations].
     *
     * Unlike [operations], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _operations(): JsonField<List<Operation>> = body._operations()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExampleUpdateMetadataParams].
         *
         * The following fields are required:
         * ```java
         * .exampleIds()
         * .operations()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExampleUpdateMetadataParams]. */
    class Builder internal constructor() {

        private var datasetId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(exampleUpdateMetadataParams: ExampleUpdateMetadataParams) = apply {
            datasetId = exampleUpdateMetadataParams.datasetId
            body = exampleUpdateMetadataParams.body.toBuilder()
            additionalHeaders = exampleUpdateMetadataParams.additionalHeaders.toBuilder()
            additionalQueryParams = exampleUpdateMetadataParams.additionalQueryParams.toBuilder()
        }

        fun datasetId(datasetId: String?) = apply { this.datasetId = datasetId }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [exampleIds]
         * - [operations]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The IDs of the examples to change; at most 10000. IDs of examples that are not in the
         * dataset, or were deleted, are skipped and reported as NOT_FOUND.
         */
        fun exampleIds(exampleIds: List<String>) = apply { body.exampleIds(exampleIds) }

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

        /**
         * The metadata changes to apply, in order; at most 50, of which at most 10 are array
         * operations.
         */
        fun operations(operations: List<Operation>) = apply { body.operations(operations) }

        /**
         * Sets [Builder.operations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operations] with a well-typed `List<Operation>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun operations(operations: JsonField<List<Operation>>) = apply {
            body.operations(operations)
        }

        /**
         * Adds a single [Operation] to [operations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOperation(operation: Operation) = apply { body.addOperation(operation) }

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
         * Returns an immutable instance of [ExampleUpdateMetadataParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .exampleIds()
         * .operations()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExampleUpdateMetadataParams =
            ExampleUpdateMetadataParams(
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
        private val exampleIds: JsonField<List<String>>,
        private val operations: JsonField<List<Operation>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("example_ids")
            @ExcludeMissing
            exampleIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("operations")
            @ExcludeMissing
            operations: JsonField<List<Operation>> = JsonMissing.of(),
        ) : this(exampleIds, operations, mutableMapOf())

        /**
         * The IDs of the examples to change; at most 10000. IDs of examples that are not in the
         * dataset, or were deleted, are skipped and reported as NOT_FOUND.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun exampleIds(): List<String> = exampleIds.getRequired("example_ids")

        /**
         * The metadata changes to apply, in order; at most 50, of which at most 10 are array
         * operations.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun operations(): List<Operation> = operations.getRequired("operations")

        /**
         * Returns the raw JSON value of [exampleIds].
         *
         * Unlike [exampleIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("example_ids")
        @ExcludeMissing
        fun _exampleIds(): JsonField<List<String>> = exampleIds

        /**
         * Returns the raw JSON value of [operations].
         *
         * Unlike [operations], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operations")
        @ExcludeMissing
        fun _operations(): JsonField<List<Operation>> = operations

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
             * .exampleIds()
             * .operations()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var exampleIds: JsonField<MutableList<String>>? = null
            private var operations: JsonField<MutableList<Operation>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                exampleIds = body.exampleIds.map { it.toMutableList() }
                operations = body.operations.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The IDs of the examples to change; at most 10000. IDs of examples that are not in the
             * dataset, or were deleted, are skipped and reported as NOT_FOUND.
             */
            fun exampleIds(exampleIds: List<String>) = exampleIds(JsonField.of(exampleIds))

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

            /**
             * The metadata changes to apply, in order; at most 50, of which at most 10 are array
             * operations.
             */
            fun operations(operations: List<Operation>) = operations(JsonField.of(operations))

            /**
             * Sets [Builder.operations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operations] with a well-typed `List<Operation>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun operations(operations: JsonField<List<Operation>>) = apply {
                this.operations = operations.map { it.toMutableList() }
            }

            /**
             * Adds a single [Operation] to [operations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOperation(operation: Operation) = apply {
                operations =
                    (operations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("operations", it).add(operation)
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
             * .exampleIds()
             * .operations()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("exampleIds", exampleIds).map { it.toImmutable() },
                    checkRequired("operations", operations).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            exampleIds()
            operations().forEach { it.validate() }
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
            (exampleIds.asKnown().getOrNull()?.size ?: 0) +
                (operations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                exampleIds == other.exampleIds &&
                operations == other.operations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(exampleIds, operations, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{exampleIds=$exampleIds, operations=$operations, additionalProperties=$additionalProperties}"
    }

    class Operation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val key: JsonField<String>,
        private val operation: JsonField<InnerOperation>,
        private val value: JsonValue,
        private val values: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("operation")
            @ExcludeMissing
            operation: JsonField<InnerOperation> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonValue = JsonMissing.of(),
            @JsonProperty("values")
            @ExcludeMissing
            values: JsonField<List<String>> = JsonMissing.of(),
        ) : this(key, operation, value, values, mutableMapOf())

        /**
         * The top-level metadata key to change, at most 255 bytes. Use dataset_split with ARRAY_ADD
         * or ARRAY_REMOVE to change which splits the examples belong to.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun key(): String = key.getRequired("key")

        /**
         * The change to make: SET replaces the value at key; ARRAY_ADD adds values to the list at
         * key; ARRAY_REMOVE removes values from it. For array operations, a missing or non-list
         * value starts as an empty list, except for dataset_split, where it starts as the base
         * split.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun operation(): InnerOperation = operation.getRequired("operation")

        /**
         * The new value for a SET operation; any JSON value, at most 64 KB. Ignored by array
         * operations.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = operation.value().convert(MyClass.class);
         * ```
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

        /**
         * The values to add or remove for an array operation; at most 1000 values of at most 255
         * bytes each. Ignored by SET.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun values(): Optional<List<String>> = values.getOptional("values")

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [operation].
         *
         * Unlike [operation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operation")
        @ExcludeMissing
        fun _operation(): JsonField<InnerOperation> = operation

        /**
         * Returns the raw JSON value of [values].
         *
         * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

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
             * Returns a mutable builder for constructing an instance of [Operation].
             *
             * The following fields are required:
             * ```java
             * .key()
             * .operation()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Operation]. */
        class Builder internal constructor() {

            private var key: JsonField<String>? = null
            private var operation: JsonField<InnerOperation>? = null
            private var value: JsonValue = JsonMissing.of()
            private var values: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(operation: Operation) = apply {
                key = operation.key
                this.operation = operation.operation
                value = operation.value
                values = operation.values.map { it.toMutableList() }
                additionalProperties = operation.additionalProperties.toMutableMap()
            }

            /**
             * The top-level metadata key to change, at most 255 bytes. Use dataset_split with
             * ARRAY_ADD or ARRAY_REMOVE to change which splits the examples belong to.
             */
            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            /**
             * The change to make: SET replaces the value at key; ARRAY_ADD adds values to the list
             * at key; ARRAY_REMOVE removes values from it. For array operations, a missing or
             * non-list value starts as an empty list, except for dataset_split, where it starts as
             * the base split.
             */
            fun operation(operation: InnerOperation) = operation(JsonField.of(operation))

            /**
             * Sets [Builder.operation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operation] with a well-typed [InnerOperation] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operation(operation: JsonField<InnerOperation>) = apply {
                this.operation = operation
            }

            /**
             * The new value for a SET operation; any JSON value, at most 64 KB. Ignored by array
             * operations.
             */
            fun value(value: JsonValue) = apply { this.value = value }

            /**
             * The values to add or remove for an array operation; at most 1000 values of at most
             * 255 bytes each. Ignored by SET.
             */
            fun values(values: List<String>) = values(JsonField.of(values))

            /**
             * Sets [Builder.values] to an arbitrary JSON value.
             *
             * You should usually call [Builder.values] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun values(values: JsonField<List<String>>) = apply {
                this.values = values.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [values].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addValue(value: String) = apply {
                values =
                    (values ?: JsonField.of(mutableListOf())).also {
                        checkKnown("values", it).add(value)
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
             * Returns an immutable instance of [Operation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .key()
             * .operation()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Operation =
                Operation(
                    checkRequired("key", key),
                    checkRequired("operation", operation),
                    value,
                    (values ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Operation = apply {
            if (validated) {
                return@apply
            }

            key()
            operation().validate()
            values()
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
            (if (key.asKnown().isPresent) 1 else 0) +
                (operation.asKnown().getOrNull()?.validity() ?: 0) +
                (values.asKnown().getOrNull()?.size ?: 0)

        /**
         * The change to make: SET replaces the value at key; ARRAY_ADD adds values to the list at
         * key; ARRAY_REMOVE removes values from it. For array operations, a missing or non-list
         * value starts as an empty list, except for dataset_split, where it starts as the base
         * split.
         */
        class InnerOperation
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SET = of("SET")

                @JvmField val ARRAY_ADD = of("ARRAY_ADD")

                @JvmField val ARRAY_REMOVE = of("ARRAY_REMOVE")

                @JvmStatic fun of(value: String) = InnerOperation(JsonField.of(value))
            }

            /** An enum containing [InnerOperation]'s known values. */
            enum class Known {
                SET,
                ARRAY_ADD,
                ARRAY_REMOVE,
            }

            /**
             * An enum containing [InnerOperation]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [InnerOperation] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SET,
                ARRAY_ADD,
                ARRAY_REMOVE,
                /**
                 * An enum member indicating that [InnerOperation] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SET -> Value.SET
                    ARRAY_ADD -> Value.ARRAY_ADD
                    ARRAY_REMOVE -> Value.ARRAY_REMOVE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SET -> Known.SET
                    ARRAY_ADD -> Known.ARRAY_ADD
                    ARRAY_REMOVE -> Known.ARRAY_REMOVE
                    else -> throw LangChainInvalidDataException("Unknown InnerOperation: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangChainInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): InnerOperation = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InnerOperation && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Operation &&
                key == other.key &&
                operation == other.operation &&
                value == other.value &&
                values == other.values &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(key, operation, value, values, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Operation{key=$key, operation=$operation, value=$value, values=$values, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExampleUpdateMetadataParams &&
            datasetId == other.datasetId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(datasetId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExampleUpdateMetadataParams{datasetId=$datasetId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
