// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.aisearch

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
 * Translates a natural-language search into the scope, filters, semantic criterion and time bounds
 * for the runs, traces or threads query API, without running the search. No resources are created.
 * Send the returned fields to the query API named by scope, with the same projects. When scope is
 * omitted, it is inferred from the search and defaults to traces. A time period in the search sets
 * min_start_time or max_start_time; bounds the search does not mention are omitted so you can keep
 * your own time range. Requires AI search to be enabled for the organization and read access to
 * every project. Returns a single JSON response.
 */
class AiSearchParseParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Natural-language description of the runs, traces or threads to find, at most 2000 UTF-8
     * bytes.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun aiSearch(): String = body.aiSearch()

    /**
     * Tracing project UUIDs used to interpret the search. Send the same projects to the query API.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectIds(): List<String> = body.projectIds()

    /**
     * When true, an ambiguous search returns clarification options instead of a single plan.
     * Defaults to false.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowClarification(): Optional<Boolean> = body.allowClarification()

    /**
     * Query API to plan for: runs, traces or threads. When omitted, it is inferred from the search
     * and defaults to traces.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scope(): Optional<Scope> = body.scope()

    /**
     * Returns the raw JSON value of [aiSearch].
     *
     * Unlike [aiSearch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _aiSearch(): JsonField<String> = body._aiSearch()

    /**
     * Returns the raw JSON value of [projectIds].
     *
     * Unlike [projectIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _projectIds(): JsonField<List<String>> = body._projectIds()

    /**
     * Returns the raw JSON value of [allowClarification].
     *
     * Unlike [allowClarification], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allowClarification(): JsonField<Boolean> = body._allowClarification()

    /**
     * Returns the raw JSON value of [scope].
     *
     * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scope(): JsonField<Scope> = body._scope()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AiSearchParseParams].
         *
         * The following fields are required:
         * ```java
         * .aiSearch()
         * .projectIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AiSearchParseParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(aiSearchParseParams: AiSearchParseParams) = apply {
            body = aiSearchParseParams.body.toBuilder()
            additionalHeaders = aiSearchParseParams.additionalHeaders.toBuilder()
            additionalQueryParams = aiSearchParseParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [aiSearch]
         * - [projectIds]
         * - [allowClarification]
         * - [scope]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Natural-language description of the runs, traces or threads to find, at most 2000 UTF-8
         * bytes.
         */
        fun aiSearch(aiSearch: String) = apply { body.aiSearch(aiSearch) }

        /**
         * Sets [Builder.aiSearch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aiSearch] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun aiSearch(aiSearch: JsonField<String>) = apply { body.aiSearch(aiSearch) }

        /**
         * Tracing project UUIDs used to interpret the search. Send the same projects to the query
         * API.
         */
        fun projectIds(projectIds: List<String>) = apply { body.projectIds(projectIds) }

        /**
         * Sets [Builder.projectIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun projectIds(projectIds: JsonField<List<String>>) = apply { body.projectIds(projectIds) }

        /**
         * Adds a single [String] to [projectIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProjectId(projectId: String) = apply { body.addProjectId(projectId) }

        /**
         * When true, an ambiguous search returns clarification options instead of a single plan.
         * Defaults to false.
         */
        fun allowClarification(allowClarification: Boolean) = apply {
            body.allowClarification(allowClarification)
        }

        /**
         * Sets [Builder.allowClarification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowClarification] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowClarification(allowClarification: JsonField<Boolean>) = apply {
            body.allowClarification(allowClarification)
        }

        /**
         * Query API to plan for: runs, traces or threads. When omitted, it is inferred from the
         * search and defaults to traces.
         */
        fun scope(scope: Scope) = apply { body.scope(scope) }

        /**
         * Sets [Builder.scope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scope(scope: JsonField<Scope>) = apply { body.scope(scope) }

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
         * Returns an immutable instance of [AiSearchParseParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .aiSearch()
         * .projectIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AiSearchParseParams =
            AiSearchParseParams(
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
        private val aiSearch: JsonField<String>,
        private val projectIds: JsonField<List<String>>,
        private val allowClarification: JsonField<Boolean>,
        private val scope: JsonField<Scope>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ai_search")
            @ExcludeMissing
            aiSearch: JsonField<String> = JsonMissing.of(),
            @JsonProperty("project_ids")
            @ExcludeMissing
            projectIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("allow_clarification")
            @ExcludeMissing
            allowClarification: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
        ) : this(aiSearch, projectIds, allowClarification, scope, mutableMapOf())

        /**
         * Natural-language description of the runs, traces or threads to find, at most 2000 UTF-8
         * bytes.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun aiSearch(): String = aiSearch.getRequired("ai_search")

        /**
         * Tracing project UUIDs used to interpret the search. Send the same projects to the query
         * API.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun projectIds(): List<String> = projectIds.getRequired("project_ids")

        /**
         * When true, an ambiguous search returns clarification options instead of a single plan.
         * Defaults to false.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun allowClarification(): Optional<Boolean> =
            allowClarification.getOptional("allow_clarification")

        /**
         * Query API to plan for: runs, traces or threads. When omitted, it is inferred from the
         * search and defaults to traces.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scope(): Optional<Scope> = scope.getOptional("scope")

        /**
         * Returns the raw JSON value of [aiSearch].
         *
         * Unlike [aiSearch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ai_search") @ExcludeMissing fun _aiSearch(): JsonField<String> = aiSearch

        /**
         * Returns the raw JSON value of [projectIds].
         *
         * Unlike [projectIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_ids")
        @ExcludeMissing
        fun _projectIds(): JsonField<List<String>> = projectIds

        /**
         * Returns the raw JSON value of [allowClarification].
         *
         * Unlike [allowClarification], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_clarification")
        @ExcludeMissing
        fun _allowClarification(): JsonField<Boolean> = allowClarification

        /**
         * Returns the raw JSON value of [scope].
         *
         * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

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
             * .aiSearch()
             * .projectIds()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var aiSearch: JsonField<String>? = null
            private var projectIds: JsonField<MutableList<String>>? = null
            private var allowClarification: JsonField<Boolean> = JsonMissing.of()
            private var scope: JsonField<Scope> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                aiSearch = body.aiSearch
                projectIds = body.projectIds.map { it.toMutableList() }
                allowClarification = body.allowClarification
                scope = body.scope
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Natural-language description of the runs, traces or threads to find, at most 2000
             * UTF-8 bytes.
             */
            fun aiSearch(aiSearch: String) = aiSearch(JsonField.of(aiSearch))

            /**
             * Sets [Builder.aiSearch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aiSearch] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aiSearch(aiSearch: JsonField<String>) = apply { this.aiSearch = aiSearch }

            /**
             * Tracing project UUIDs used to interpret the search. Send the same projects to the
             * query API.
             */
            fun projectIds(projectIds: List<String>) = projectIds(JsonField.of(projectIds))

            /**
             * Sets [Builder.projectIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectIds(projectIds: JsonField<List<String>>) = apply {
                this.projectIds = projectIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [projectIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProjectId(projectId: String) = apply {
                projectIds =
                    (projectIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("projectIds", it).add(projectId)
                    }
            }

            /**
             * When true, an ambiguous search returns clarification options instead of a single
             * plan. Defaults to false.
             */
            fun allowClarification(allowClarification: Boolean) =
                allowClarification(JsonField.of(allowClarification))

            /**
             * Sets [Builder.allowClarification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowClarification] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allowClarification(allowClarification: JsonField<Boolean>) = apply {
                this.allowClarification = allowClarification
            }

            /**
             * Query API to plan for: runs, traces or threads. When omitted, it is inferred from the
             * search and defaults to traces.
             */
            fun scope(scope: Scope) = scope(JsonField.of(scope))

            /**
             * Sets [Builder.scope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

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
             * .aiSearch()
             * .projectIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("aiSearch", aiSearch),
                    checkRequired("projectIds", projectIds).map { it.toImmutable() },
                    allowClarification,
                    scope,
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

            aiSearch()
            projectIds()
            allowClarification()
            scope().ifPresent { it.validate() }
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
            (if (aiSearch.asKnown().isPresent) 1 else 0) +
                (projectIds.asKnown().getOrNull()?.size ?: 0) +
                (if (allowClarification.asKnown().isPresent) 1 else 0) +
                (scope.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                aiSearch == other.aiSearch &&
                projectIds == other.projectIds &&
                allowClarification == other.allowClarification &&
                scope == other.scope &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(aiSearch, projectIds, allowClarification, scope, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{aiSearch=$aiSearch, projectIds=$projectIds, allowClarification=$allowClarification, scope=$scope, additionalProperties=$additionalProperties}"
    }

    /**
     * Query API to plan for: runs, traces or threads. When omitted, it is inferred from the search
     * and defaults to traces.
     */
    class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val RUNS = of("runs")

            @JvmField val TRACES = of("traces")

            @JvmField val THREADS = of("threads")

            @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
        }

        /** An enum containing [Scope]'s known values. */
        enum class Known {
            RUNS,
            TRACES,
            THREADS,
        }

        /**
         * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Scope] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RUNS,
            TRACES,
            THREADS,
            /** An enum member indicating that [Scope] was instantiated with an unknown value. */
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
                RUNS -> Value.RUNS
                TRACES -> Value.TRACES
                THREADS -> Value.THREADS
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
                RUNS -> Known.RUNS
                TRACES -> Known.TRACES
                THREADS -> Known.THREADS
                else -> throw LangChainInvalidDataException("Unknown Scope: $value")
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
        fun validate(): Scope = apply {
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

            return other is Scope && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AiSearchParseParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AiSearchParseParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
