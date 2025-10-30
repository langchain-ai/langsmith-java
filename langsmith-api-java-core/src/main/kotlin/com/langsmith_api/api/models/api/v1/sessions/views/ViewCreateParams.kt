// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sessions.views

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new filter view. */
class ViewCreateParams
private constructor(
    private val sessionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun sessionId(): Optional<String> = Optional.ofNullable(sessionId)

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = body.displayName()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun filterString(): Optional<String> = body.filterString()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun traceFilterString(): Optional<String> = body.traceFilterString()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun treeFilterString(): Optional<String> = body.treeFilterString()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun type(): Optional<FilterViewType> = body.type()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [filterString].
     *
     * Unlike [filterString], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filterString(): JsonField<String> = body._filterString()

    /**
     * Returns the raw JSON value of [traceFilterString].
     *
     * Unlike [traceFilterString], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _traceFilterString(): JsonField<String> = body._traceFilterString()

    /**
     * Returns the raw JSON value of [treeFilterString].
     *
     * Unlike [treeFilterString], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _treeFilterString(): JsonField<String> = body._treeFilterString()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<FilterViewType> = body._type()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ViewCreateParams].
         *
         * The following fields are required:
         * ```java
         * .displayName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ViewCreateParams]. */
    class Builder internal constructor() {

        private var sessionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(viewCreateParams: ViewCreateParams) = apply {
            sessionId = viewCreateParams.sessionId
            body = viewCreateParams.body.toBuilder()
            additionalHeaders = viewCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = viewCreateParams.additionalQueryParams.toBuilder()
        }

        fun sessionId(sessionId: String?) = apply { this.sessionId = sessionId }

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [displayName]
         * - [description]
         * - [filterString]
         * - [traceFilterString]
         * - [treeFilterString]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun displayName(displayName: String) = apply { body.displayName(displayName) }

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { body.displayName(displayName) }

        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun filterString(filterString: String?) = apply { body.filterString(filterString) }

        /** Alias for calling [Builder.filterString] with `filterString.orElse(null)`. */
        fun filterString(filterString: Optional<String>) = filterString(filterString.getOrNull())

        /**
         * Sets [Builder.filterString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterString] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filterString(filterString: JsonField<String>) = apply {
            body.filterString(filterString)
        }

        fun traceFilterString(traceFilterString: String?) = apply {
            body.traceFilterString(traceFilterString)
        }

        /** Alias for calling [Builder.traceFilterString] with `traceFilterString.orElse(null)`. */
        fun traceFilterString(traceFilterString: Optional<String>) =
            traceFilterString(traceFilterString.getOrNull())

        /**
         * Sets [Builder.traceFilterString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceFilterString] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun traceFilterString(traceFilterString: JsonField<String>) = apply {
            body.traceFilterString(traceFilterString)
        }

        fun treeFilterString(treeFilterString: String?) = apply {
            body.treeFilterString(treeFilterString)
        }

        /** Alias for calling [Builder.treeFilterString] with `treeFilterString.orElse(null)`. */
        fun treeFilterString(treeFilterString: Optional<String>) =
            treeFilterString(treeFilterString.getOrNull())

        /**
         * Sets [Builder.treeFilterString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.treeFilterString] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun treeFilterString(treeFilterString: JsonField<String>) = apply {
            body.treeFilterString(treeFilterString)
        }

        fun type(type: FilterViewType) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [FilterViewType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<FilterViewType>) = apply { body.type(type) }

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
         * Returns an immutable instance of [ViewCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .displayName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ViewCreateParams =
            ViewCreateParams(
                sessionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> sessionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val displayName: JsonField<String>,
        private val description: JsonField<String>,
        private val filterString: JsonField<String>,
        private val traceFilterString: JsonField<String>,
        private val treeFilterString: JsonField<String>,
        private val type: JsonField<FilterViewType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filter_string")
            @ExcludeMissing
            filterString: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trace_filter_string")
            @ExcludeMissing
            traceFilterString: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tree_filter_string")
            @ExcludeMissing
            treeFilterString: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<FilterViewType> = JsonMissing.of(),
        ) : this(
            displayName,
            description,
            filterString,
            traceFilterString,
            treeFilterString,
            type,
            mutableMapOf(),
        )

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun displayName(): String = displayName.getRequired("display_name")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun filterString(): Optional<String> = filterString.getOptional("filter_string")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun traceFilterString(): Optional<String> =
            traceFilterString.getOptional("trace_filter_string")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun treeFilterString(): Optional<String> =
            treeFilterString.getOptional("tree_filter_string")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun type(): Optional<FilterViewType> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [filterString].
         *
         * Unlike [filterString], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("filter_string")
        @ExcludeMissing
        fun _filterString(): JsonField<String> = filterString

        /**
         * Returns the raw JSON value of [traceFilterString].
         *
         * Unlike [traceFilterString], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trace_filter_string")
        @ExcludeMissing
        fun _traceFilterString(): JsonField<String> = traceFilterString

        /**
         * Returns the raw JSON value of [treeFilterString].
         *
         * Unlike [treeFilterString], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tree_filter_string")
        @ExcludeMissing
        fun _treeFilterString(): JsonField<String> = treeFilterString

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<FilterViewType> = type

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
             * .displayName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var displayName: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var filterString: JsonField<String> = JsonMissing.of()
            private var traceFilterString: JsonField<String> = JsonMissing.of()
            private var treeFilterString: JsonField<String> = JsonMissing.of()
            private var type: JsonField<FilterViewType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                displayName = body.displayName
                description = body.description
                filterString = body.filterString
                traceFilterString = body.traceFilterString
                treeFilterString = body.treeFilterString
                type = body.type
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun filterString(filterString: String?) =
                filterString(JsonField.ofNullable(filterString))

            /** Alias for calling [Builder.filterString] with `filterString.orElse(null)`. */
            fun filterString(filterString: Optional<String>) =
                filterString(filterString.getOrNull())

            /**
             * Sets [Builder.filterString] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filterString] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filterString(filterString: JsonField<String>) = apply {
                this.filterString = filterString
            }

            fun traceFilterString(traceFilterString: String?) =
                traceFilterString(JsonField.ofNullable(traceFilterString))

            /**
             * Alias for calling [Builder.traceFilterString] with `traceFilterString.orElse(null)`.
             */
            fun traceFilterString(traceFilterString: Optional<String>) =
                traceFilterString(traceFilterString.getOrNull())

            /**
             * Sets [Builder.traceFilterString] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceFilterString] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traceFilterString(traceFilterString: JsonField<String>) = apply {
                this.traceFilterString = traceFilterString
            }

            fun treeFilterString(treeFilterString: String?) =
                treeFilterString(JsonField.ofNullable(treeFilterString))

            /**
             * Alias for calling [Builder.treeFilterString] with `treeFilterString.orElse(null)`.
             */
            fun treeFilterString(treeFilterString: Optional<String>) =
                treeFilterString(treeFilterString.getOrNull())

            /**
             * Sets [Builder.treeFilterString] to an arbitrary JSON value.
             *
             * You should usually call [Builder.treeFilterString] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun treeFilterString(treeFilterString: JsonField<String>) = apply {
                this.treeFilterString = treeFilterString
            }

            fun type(type: FilterViewType) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [FilterViewType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<FilterViewType>) = apply { this.type = type }

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
             * .displayName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("displayName", displayName),
                    description,
                    filterString,
                    traceFilterString,
                    treeFilterString,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            displayName()
            description()
            filterString()
            traceFilterString()
            treeFilterString()
            type().ifPresent { it.validate() }
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
            (if (displayName.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (filterString.asKnown().isPresent) 1 else 0) +
                (if (traceFilterString.asKnown().isPresent) 1 else 0) +
                (if (treeFilterString.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                displayName == other.displayName &&
                description == other.description &&
                filterString == other.filterString &&
                traceFilterString == other.traceFilterString &&
                treeFilterString == other.treeFilterString &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                displayName,
                description,
                filterString,
                traceFilterString,
                treeFilterString,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{displayName=$displayName, description=$description, filterString=$filterString, traceFilterString=$traceFilterString, treeFilterString=$treeFilterString, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ViewCreateParams &&
            sessionId == other.sessionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(sessionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ViewCreateParams{sessionId=$sessionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
