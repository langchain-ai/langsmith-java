// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.splits

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

/** Update Dataset Splits */
class SplitCreateParams
private constructor(
    private val datasetId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun examples(): List<String> = body.examples()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun splitName(): String = body.splitName()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun remove(): Optional<Boolean> = body.remove()

    /**
     * Returns the raw JSON value of [examples].
     *
     * Unlike [examples], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _examples(): JsonField<List<String>> = body._examples()

    /**
     * Returns the raw JSON value of [splitName].
     *
     * Unlike [splitName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _splitName(): JsonField<String> = body._splitName()

    /**
     * Returns the raw JSON value of [remove].
     *
     * Unlike [remove], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _remove(): JsonField<Boolean> = body._remove()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SplitCreateParams].
         *
         * The following fields are required:
         * ```java
         * .examples()
         * .splitName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SplitCreateParams]. */
    class Builder internal constructor() {

        private var datasetId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(splitCreateParams: SplitCreateParams) = apply {
            datasetId = splitCreateParams.datasetId
            body = splitCreateParams.body.toBuilder()
            additionalHeaders = splitCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = splitCreateParams.additionalQueryParams.toBuilder()
        }

        fun datasetId(datasetId: String?) = apply { this.datasetId = datasetId }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [examples]
         * - [splitName]
         * - [remove]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun examples(examples: List<String>) = apply { body.examples(examples) }

        /**
         * Sets [Builder.examples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.examples] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun examples(examples: JsonField<List<String>>) = apply { body.examples(examples) }

        /**
         * Adds a single [String] to [examples].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExample(example: String) = apply { body.addExample(example) }

        fun splitName(splitName: String) = apply { body.splitName(splitName) }

        /**
         * Sets [Builder.splitName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.splitName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun splitName(splitName: JsonField<String>) = apply { body.splitName(splitName) }

        fun remove(remove: Boolean) = apply { body.remove(remove) }

        /**
         * Sets [Builder.remove] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remove] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun remove(remove: JsonField<Boolean>) = apply { body.remove(remove) }

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
         * Returns an immutable instance of [SplitCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .examples()
         * .splitName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SplitCreateParams =
            SplitCreateParams(
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
        private val examples: JsonField<List<String>>,
        private val splitName: JsonField<String>,
        private val remove: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("examples")
            @ExcludeMissing
            examples: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("split_name")
            @ExcludeMissing
            splitName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("remove") @ExcludeMissing remove: JsonField<Boolean> = JsonMissing.of(),
        ) : this(examples, splitName, remove, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun examples(): List<String> = examples.getRequired("examples")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun splitName(): String = splitName.getRequired("split_name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun remove(): Optional<Boolean> = remove.getOptional("remove")

        /**
         * Returns the raw JSON value of [examples].
         *
         * Unlike [examples], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("examples")
        @ExcludeMissing
        fun _examples(): JsonField<List<String>> = examples

        /**
         * Returns the raw JSON value of [splitName].
         *
         * Unlike [splitName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("split_name") @ExcludeMissing fun _splitName(): JsonField<String> = splitName

        /**
         * Returns the raw JSON value of [remove].
         *
         * Unlike [remove], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("remove") @ExcludeMissing fun _remove(): JsonField<Boolean> = remove

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
             * .examples()
             * .splitName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var examples: JsonField<MutableList<String>>? = null
            private var splitName: JsonField<String>? = null
            private var remove: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                examples = body.examples.map { it.toMutableList() }
                splitName = body.splitName
                remove = body.remove
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun examples(examples: List<String>) = examples(JsonField.of(examples))

            /**
             * Sets [Builder.examples] to an arbitrary JSON value.
             *
             * You should usually call [Builder.examples] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun examples(examples: JsonField<List<String>>) = apply {
                this.examples = examples.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [examples].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExample(example: String) = apply {
                examples =
                    (examples ?: JsonField.of(mutableListOf())).also {
                        checkKnown("examples", it).add(example)
                    }
            }

            fun splitName(splitName: String) = splitName(JsonField.of(splitName))

            /**
             * Sets [Builder.splitName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.splitName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun splitName(splitName: JsonField<String>) = apply { this.splitName = splitName }

            fun remove(remove: Boolean) = remove(JsonField.of(remove))

            /**
             * Sets [Builder.remove] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remove] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun remove(remove: JsonField<Boolean>) = apply { this.remove = remove }

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
             * .examples()
             * .splitName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("examples", examples).map { it.toImmutable() },
                    checkRequired("splitName", splitName),
                    remove,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            examples()
            splitName()
            remove()
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
            (examples.asKnown().getOrNull()?.size ?: 0) +
                (if (splitName.asKnown().isPresent) 1 else 0) +
                (if (remove.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                examples == other.examples &&
                splitName == other.splitName &&
                remove == other.remove &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(examples, splitName, remove, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{examples=$examples, splitName=$splitName, remove=$remove, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SplitCreateParams &&
            datasetId == other.datasetId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(datasetId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SplitCreateParams{datasetId=$datasetId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
