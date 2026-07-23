// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.runs

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
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * **Alpha:** The request and response contract may change; Returns all runs within the trace
 * identified by the share token. The share token supplies the tenant, project, and trace scope.
 */
class RunQueryParams
private constructor(
    private val shareToken: String?,
    private val accept: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun shareToken(): Optional<String> = Optional.ofNullable(shareToken)

    fun accept(): Optional<String> = Optional.ofNullable(accept)

    /**
     * `selects` lists which public run properties to include on each returned run.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun selects(): Optional<List<Select>> = body.selects()

    /**
     * Returns the raw JSON value of [selects].
     *
     * Unlike [selects], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _selects(): JsonField<List<Select>> = body._selects()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RunQueryParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RunQueryParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunQueryParams]. */
    class Builder internal constructor() {

        private var shareToken: String? = null
        private var accept: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runQueryParams: RunQueryParams) = apply {
            shareToken = runQueryParams.shareToken
            accept = runQueryParams.accept
            body = runQueryParams.body.toBuilder()
            additionalHeaders = runQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = runQueryParams.additionalQueryParams.toBuilder()
        }

        fun shareToken(shareToken: String?) = apply { this.shareToken = shareToken }

        /** Alias for calling [Builder.shareToken] with `shareToken.orElse(null)`. */
        fun shareToken(shareToken: Optional<String>) = shareToken(shareToken.getOrNull())

        fun accept(accept: String?) = apply { this.accept = accept }

        /** Alias for calling [Builder.accept] with `accept.orElse(null)`. */
        fun accept(accept: Optional<String>) = accept(accept.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [selects]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** `selects` lists which public run properties to include on each returned run. */
        fun selects(selects: List<Select>) = apply { body.selects(selects) }

        /**
         * Sets [Builder.selects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.selects] with a well-typed `List<Select>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun selects(selects: JsonField<List<Select>>) = apply { body.selects(selects) }

        /**
         * Adds a single [Select] to [selects].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSelect(select: Select) = apply { body.addSelect(select) }

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
         * Returns an immutable instance of [RunQueryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RunQueryParams =
            RunQueryParams(
                shareToken,
                accept,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> shareToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                accept?.let { put("Accept", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val selects: JsonField<List<Select>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("selects")
            @ExcludeMissing
            selects: JsonField<List<Select>> = JsonMissing.of()
        ) : this(selects, mutableMapOf())

        /**
         * `selects` lists which public run properties to include on each returned run.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun selects(): Optional<List<Select>> = selects.getOptional("selects")

        /**
         * Returns the raw JSON value of [selects].
         *
         * Unlike [selects], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("selects") @ExcludeMissing fun _selects(): JsonField<List<Select>> = selects

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var selects: JsonField<MutableList<Select>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                selects = body.selects.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** `selects` lists which public run properties to include on each returned run. */
            fun selects(selects: List<Select>) = selects(JsonField.of(selects))

            /**
             * Sets [Builder.selects] to an arbitrary JSON value.
             *
             * You should usually call [Builder.selects] with a well-typed `List<Select>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun selects(selects: JsonField<List<Select>>) = apply {
                this.selects = selects.map { it.toMutableList() }
            }

            /**
             * Adds a single [Select] to [selects].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSelect(select: Select) = apply {
                selects =
                    (selects ?: JsonField.of(mutableListOf())).also {
                        checkKnown("selects", it).add(select)
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
             */
            fun build(): Body =
                Body(
                    (selects ?: JsonMissing.of()).map { it.toImmutable() },
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

            selects().ifPresent { it.forEach { it.validate() } }
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
            (selects.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                selects == other.selects &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(selects, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{selects=$selects, additionalProperties=$additionalProperties}"
    }

    class Select @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ID = of("ID")

            @JvmField val NAME = of("NAME")

            @JvmField val RUN_TYPE = of("RUN_TYPE")

            @JvmField val STATUS = of("STATUS")

            @JvmField val START_TIME = of("START_TIME")

            @JvmField val END_TIME = of("END_TIME")

            @JvmField val LATENCY_SECONDS = of("LATENCY_SECONDS")

            @JvmField val FIRST_TOKEN_TIME = of("FIRST_TOKEN_TIME")

            @JvmField val ERROR = of("ERROR")

            @JvmField val ERROR_PREVIEW = of("ERROR_PREVIEW")

            @JvmField val EXTRA = of("EXTRA")

            @JvmField val METADATA = of("METADATA")

            @JvmField val INPUTS_PREVIEW = of("INPUTS_PREVIEW")

            @JvmField val OUTPUTS_PREVIEW = of("OUTPUTS_PREVIEW")

            @JvmField val PARENT_RUN_ID = of("PARENT_RUN_ID")

            @JvmField val PARENT_RUN_IDS = of("PARENT_RUN_IDS")

            @JvmField val PROJECT_ID = of("PROJECT_ID")

            @JvmField val TRACE_ID = of("TRACE_ID")

            @JvmField val THREAD_ID = of("THREAD_ID")

            @JvmField val DOTTED_ORDER = of("DOTTED_ORDER")

            @JvmField val IS_ROOT = of("IS_ROOT")

            @JvmField val REFERENCE_DATASET_ID = of("REFERENCE_DATASET_ID")

            @JvmField val TOTAL_TOKENS = of("TOTAL_TOKENS")

            @JvmField val PROMPT_TOKENS = of("PROMPT_TOKENS")

            @JvmField val COMPLETION_TOKENS = of("COMPLETION_TOKENS")

            @JvmField val TOTAL_COST = of("TOTAL_COST")

            @JvmField val PROMPT_COST = of("PROMPT_COST")

            @JvmField val COMPLETION_COST = of("COMPLETION_COST")

            @JvmField val PROMPT_TOKEN_DETAILS = of("PROMPT_TOKEN_DETAILS")

            @JvmField val COMPLETION_TOKEN_DETAILS = of("COMPLETION_TOKEN_DETAILS")

            @JvmField val PROMPT_COST_DETAILS = of("PROMPT_COST_DETAILS")

            @JvmField val COMPLETION_COST_DETAILS = of("COMPLETION_COST_DETAILS")

            @JvmField val PRICE_MODEL_ID = of("PRICE_MODEL_ID")

            @JvmField val TAGS = of("TAGS")

            @JvmField val THREAD_EVALUATION_TIME = of("THREAD_EVALUATION_TIME")

            @JvmField val FEEDBACK_STATS = of("FEEDBACK_STATS")

            @JvmStatic fun of(value: String) = Select(JsonField.of(value))
        }

        /** An enum containing [Select]'s known values. */
        enum class Known {
            ID,
            NAME,
            RUN_TYPE,
            STATUS,
            START_TIME,
            END_TIME,
            LATENCY_SECONDS,
            FIRST_TOKEN_TIME,
            ERROR,
            ERROR_PREVIEW,
            EXTRA,
            METADATA,
            INPUTS_PREVIEW,
            OUTPUTS_PREVIEW,
            PARENT_RUN_ID,
            PARENT_RUN_IDS,
            PROJECT_ID,
            TRACE_ID,
            THREAD_ID,
            DOTTED_ORDER,
            IS_ROOT,
            REFERENCE_DATASET_ID,
            TOTAL_TOKENS,
            PROMPT_TOKENS,
            COMPLETION_TOKENS,
            TOTAL_COST,
            PROMPT_COST,
            COMPLETION_COST,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKEN_DETAILS,
            PROMPT_COST_DETAILS,
            COMPLETION_COST_DETAILS,
            PRICE_MODEL_ID,
            TAGS,
            THREAD_EVALUATION_TIME,
            FEEDBACK_STATS,
        }

        /**
         * An enum containing [Select]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Select] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ID,
            NAME,
            RUN_TYPE,
            STATUS,
            START_TIME,
            END_TIME,
            LATENCY_SECONDS,
            FIRST_TOKEN_TIME,
            ERROR,
            ERROR_PREVIEW,
            EXTRA,
            METADATA,
            INPUTS_PREVIEW,
            OUTPUTS_PREVIEW,
            PARENT_RUN_ID,
            PARENT_RUN_IDS,
            PROJECT_ID,
            TRACE_ID,
            THREAD_ID,
            DOTTED_ORDER,
            IS_ROOT,
            REFERENCE_DATASET_ID,
            TOTAL_TOKENS,
            PROMPT_TOKENS,
            COMPLETION_TOKENS,
            TOTAL_COST,
            PROMPT_COST,
            COMPLETION_COST,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKEN_DETAILS,
            PROMPT_COST_DETAILS,
            COMPLETION_COST_DETAILS,
            PRICE_MODEL_ID,
            TAGS,
            THREAD_EVALUATION_TIME,
            FEEDBACK_STATS,
            /** An enum member indicating that [Select] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ID -> Value.ID
                NAME -> Value.NAME
                RUN_TYPE -> Value.RUN_TYPE
                STATUS -> Value.STATUS
                START_TIME -> Value.START_TIME
                END_TIME -> Value.END_TIME
                LATENCY_SECONDS -> Value.LATENCY_SECONDS
                FIRST_TOKEN_TIME -> Value.FIRST_TOKEN_TIME
                ERROR -> Value.ERROR
                ERROR_PREVIEW -> Value.ERROR_PREVIEW
                EXTRA -> Value.EXTRA
                METADATA -> Value.METADATA
                INPUTS_PREVIEW -> Value.INPUTS_PREVIEW
                OUTPUTS_PREVIEW -> Value.OUTPUTS_PREVIEW
                PARENT_RUN_ID -> Value.PARENT_RUN_ID
                PARENT_RUN_IDS -> Value.PARENT_RUN_IDS
                PROJECT_ID -> Value.PROJECT_ID
                TRACE_ID -> Value.TRACE_ID
                THREAD_ID -> Value.THREAD_ID
                DOTTED_ORDER -> Value.DOTTED_ORDER
                IS_ROOT -> Value.IS_ROOT
                REFERENCE_DATASET_ID -> Value.REFERENCE_DATASET_ID
                TOTAL_TOKENS -> Value.TOTAL_TOKENS
                PROMPT_TOKENS -> Value.PROMPT_TOKENS
                COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                TOTAL_COST -> Value.TOTAL_COST
                PROMPT_COST -> Value.PROMPT_COST
                COMPLETION_COST -> Value.COMPLETION_COST
                PROMPT_TOKEN_DETAILS -> Value.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKEN_DETAILS -> Value.COMPLETION_TOKEN_DETAILS
                PROMPT_COST_DETAILS -> Value.PROMPT_COST_DETAILS
                COMPLETION_COST_DETAILS -> Value.COMPLETION_COST_DETAILS
                PRICE_MODEL_ID -> Value.PRICE_MODEL_ID
                TAGS -> Value.TAGS
                THREAD_EVALUATION_TIME -> Value.THREAD_EVALUATION_TIME
                FEEDBACK_STATS -> Value.FEEDBACK_STATS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ID -> Known.ID
                NAME -> Known.NAME
                RUN_TYPE -> Known.RUN_TYPE
                STATUS -> Known.STATUS
                START_TIME -> Known.START_TIME
                END_TIME -> Known.END_TIME
                LATENCY_SECONDS -> Known.LATENCY_SECONDS
                FIRST_TOKEN_TIME -> Known.FIRST_TOKEN_TIME
                ERROR -> Known.ERROR
                ERROR_PREVIEW -> Known.ERROR_PREVIEW
                EXTRA -> Known.EXTRA
                METADATA -> Known.METADATA
                INPUTS_PREVIEW -> Known.INPUTS_PREVIEW
                OUTPUTS_PREVIEW -> Known.OUTPUTS_PREVIEW
                PARENT_RUN_ID -> Known.PARENT_RUN_ID
                PARENT_RUN_IDS -> Known.PARENT_RUN_IDS
                PROJECT_ID -> Known.PROJECT_ID
                TRACE_ID -> Known.TRACE_ID
                THREAD_ID -> Known.THREAD_ID
                DOTTED_ORDER -> Known.DOTTED_ORDER
                IS_ROOT -> Known.IS_ROOT
                REFERENCE_DATASET_ID -> Known.REFERENCE_DATASET_ID
                TOTAL_TOKENS -> Known.TOTAL_TOKENS
                PROMPT_TOKENS -> Known.PROMPT_TOKENS
                COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                TOTAL_COST -> Known.TOTAL_COST
                PROMPT_COST -> Known.PROMPT_COST
                COMPLETION_COST -> Known.COMPLETION_COST
                PROMPT_TOKEN_DETAILS -> Known.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKEN_DETAILS -> Known.COMPLETION_TOKEN_DETAILS
                PROMPT_COST_DETAILS -> Known.PROMPT_COST_DETAILS
                COMPLETION_COST_DETAILS -> Known.COMPLETION_COST_DETAILS
                PRICE_MODEL_ID -> Known.PRICE_MODEL_ID
                TAGS -> Known.TAGS
                THREAD_EVALUATION_TIME -> Known.THREAD_EVALUATION_TIME
                FEEDBACK_STATS -> Known.FEEDBACK_STATS
                else -> throw LangChainInvalidDataException("Unknown Select: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Select = apply {
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

            return other is Select && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunQueryParams &&
            shareToken == other.shareToken &&
            accept == other.accept &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(shareToken, accept, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RunQueryParams{shareToken=$shareToken, accept=$accept, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
