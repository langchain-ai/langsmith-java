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
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AiSearchParseResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clarification: JsonField<Clarification>,
    private val filter: JsonField<String>,
    private val maxStartTime: JsonField<OffsetDateTime>,
    private val minStartTime: JsonField<OffsetDateTime>,
    private val scope: JsonField<Scope>,
    private val semFilter: JsonField<String>,
    private val threadFilter: JsonField<String>,
    private val traceFilter: JsonField<String>,
    private val treeFilter: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clarification")
        @ExcludeMissing
        clarification: JsonField<Clarification> = JsonMissing.of(),
        @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("max_start_time")
        @ExcludeMissing
        maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("min_start_time")
        @ExcludeMissing
        minStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
        @JsonProperty("sem_filter") @ExcludeMissing semFilter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("thread_filter")
        @ExcludeMissing
        threadFilter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trace_filter")
        @ExcludeMissing
        traceFilter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tree_filter")
        @ExcludeMissing
        treeFilter: JsonField<String> = JsonMissing.of(),
    ) : this(
        clarification,
        filter,
        maxStartTime,
        minStartTime,
        scope,
        semFilter,
        threadFilter,
        traceFilter,
        treeFilter,
        mutableMapOf(),
    )

    /**
     * Interpretations to choose from. Returned only when allow_clarification is true and the search
     * is ambiguous; no other fields are set.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clarification(): Optional<Clarification> = clarification.getOptional("clarification")

    /**
     * Filter expression for the query API's filter parameter. Omitted when there is none.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<String> = filter.getOptional("filter")

    /**
     * Upper bound on start time (RFC 3339, UTC) for the query API's max_start_time parameter.
     * Omitted when the search names no end; keep your own time range.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxStartTime(): Optional<OffsetDateTime> = maxStartTime.getOptional("max_start_time")

    /**
     * Lower bound on start time (RFC 3339, UTC) for the query API's min_start_time parameter.
     * Omitted when the search names no start; keep your own time range.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minStartTime(): Optional<OffsetDateTime> = minStartTime.getOptional("min_start_time")

    /**
     * Query API to send the plan to: runs, traces or threads.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scope(): Optional<Scope> = scope.getOptional("scope")

    /**
     * Plain-language criterion for the query API's sem_filter parameter, matched against
     * conversation messages. Null when the search has no conversational criterion.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun semFilter(): Optional<String> = semFilter.getOptional("sem_filter")

    /**
     * Filter expression for the threads query API's thread_filter parameter. Omitted when there is
     * none.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadFilter(): Optional<String> = threadFilter.getOptional("thread_filter")

    /**
     * Filter expression for the query API's trace_filter parameter. Omitted when there is none.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

    /**
     * Filter expression for the query API's tree_filter parameter. Omitted when there is none.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

    /**
     * Returns the raw JSON value of [clarification].
     *
     * Unlike [clarification], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clarification")
    @ExcludeMissing
    fun _clarification(): JsonField<Clarification> = clarification

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

    /**
     * Returns the raw JSON value of [maxStartTime].
     *
     * Unlike [maxStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_start_time")
    @ExcludeMissing
    fun _maxStartTime(): JsonField<OffsetDateTime> = maxStartTime

    /**
     * Returns the raw JSON value of [minStartTime].
     *
     * Unlike [minStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("min_start_time")
    @ExcludeMissing
    fun _minStartTime(): JsonField<OffsetDateTime> = minStartTime

    /**
     * Returns the raw JSON value of [scope].
     *
     * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

    /**
     * Returns the raw JSON value of [semFilter].
     *
     * Unlike [semFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sem_filter") @ExcludeMissing fun _semFilter(): JsonField<String> = semFilter

    /**
     * Returns the raw JSON value of [threadFilter].
     *
     * Unlike [threadFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thread_filter")
    @ExcludeMissing
    fun _threadFilter(): JsonField<String> = threadFilter

    /**
     * Returns the raw JSON value of [traceFilter].
     *
     * Unlike [traceFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_filter")
    @ExcludeMissing
    fun _traceFilter(): JsonField<String> = traceFilter

    /**
     * Returns the raw JSON value of [treeFilter].
     *
     * Unlike [treeFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tree_filter") @ExcludeMissing fun _treeFilter(): JsonField<String> = treeFilter

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

        /** Returns a mutable builder for constructing an instance of [AiSearchParseResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AiSearchParseResponse]. */
    class Builder internal constructor() {

        private var clarification: JsonField<Clarification> = JsonMissing.of()
        private var filter: JsonField<String> = JsonMissing.of()
        private var maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var minStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var scope: JsonField<Scope> = JsonMissing.of()
        private var semFilter: JsonField<String> = JsonMissing.of()
        private var threadFilter: JsonField<String> = JsonMissing.of()
        private var traceFilter: JsonField<String> = JsonMissing.of()
        private var treeFilter: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(aiSearchParseResponse: AiSearchParseResponse) = apply {
            clarification = aiSearchParseResponse.clarification
            filter = aiSearchParseResponse.filter
            maxStartTime = aiSearchParseResponse.maxStartTime
            minStartTime = aiSearchParseResponse.minStartTime
            scope = aiSearchParseResponse.scope
            semFilter = aiSearchParseResponse.semFilter
            threadFilter = aiSearchParseResponse.threadFilter
            traceFilter = aiSearchParseResponse.traceFilter
            treeFilter = aiSearchParseResponse.treeFilter
            additionalProperties = aiSearchParseResponse.additionalProperties.toMutableMap()
        }

        /**
         * Interpretations to choose from. Returned only when allow_clarification is true and the
         * search is ambiguous; no other fields are set.
         */
        fun clarification(clarification: Clarification) = clarification(JsonField.of(clarification))

        /**
         * Sets [Builder.clarification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clarification] with a well-typed [Clarification] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clarification(clarification: JsonField<Clarification>) = apply {
            this.clarification = clarification
        }

        /** Filter expression for the query API's filter parameter. Omitted when there is none. */
        fun filter(filter: String) = filter(JsonField.of(filter))

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

        /**
         * Upper bound on start time (RFC 3339, UTC) for the query API's max_start_time parameter.
         * Omitted when the search names no end; keep your own time range.
         */
        fun maxStartTime(maxStartTime: OffsetDateTime) = maxStartTime(JsonField.of(maxStartTime))

        /**
         * Sets [Builder.maxStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxStartTime(maxStartTime: JsonField<OffsetDateTime>) = apply {
            this.maxStartTime = maxStartTime
        }

        /**
         * Lower bound on start time (RFC 3339, UTC) for the query API's min_start_time parameter.
         * Omitted when the search names no start; keep your own time range.
         */
        fun minStartTime(minStartTime: OffsetDateTime) = minStartTime(JsonField.of(minStartTime))

        /**
         * Sets [Builder.minStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minStartTime(minStartTime: JsonField<OffsetDateTime>) = apply {
            this.minStartTime = minStartTime
        }

        /** Query API to send the plan to: runs, traces or threads. */
        fun scope(scope: Scope) = scope(JsonField.of(scope))

        /**
         * Sets [Builder.scope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

        /**
         * Plain-language criterion for the query API's sem_filter parameter, matched against
         * conversation messages. Null when the search has no conversational criterion.
         */
        fun semFilter(semFilter: String?) = semFilter(JsonField.ofNullable(semFilter))

        /** Alias for calling [Builder.semFilter] with `semFilter.orElse(null)`. */
        fun semFilter(semFilter: Optional<String>) = semFilter(semFilter.getOrNull())

        /**
         * Sets [Builder.semFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.semFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun semFilter(semFilter: JsonField<String>) = apply { this.semFilter = semFilter }

        /**
         * Filter expression for the threads query API's thread_filter parameter. Omitted when there
         * is none.
         */
        fun threadFilter(threadFilter: String) = threadFilter(JsonField.of(threadFilter))

        /**
         * Sets [Builder.threadFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun threadFilter(threadFilter: JsonField<String>) = apply {
            this.threadFilter = threadFilter
        }

        /**
         * Filter expression for the query API's trace_filter parameter. Omitted when there is none.
         */
        fun traceFilter(traceFilter: String) = traceFilter(JsonField.of(traceFilter))

        /**
         * Sets [Builder.traceFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun traceFilter(traceFilter: JsonField<String>) = apply { this.traceFilter = traceFilter }

        /**
         * Filter expression for the query API's tree_filter parameter. Omitted when there is none.
         */
        fun treeFilter(treeFilter: String) = treeFilter(JsonField.of(treeFilter))

        /**
         * Sets [Builder.treeFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.treeFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun treeFilter(treeFilter: JsonField<String>) = apply { this.treeFilter = treeFilter }

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
         * Returns an immutable instance of [AiSearchParseResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AiSearchParseResponse =
            AiSearchParseResponse(
                clarification,
                filter,
                maxStartTime,
                minStartTime,
                scope,
                semFilter,
                threadFilter,
                traceFilter,
                treeFilter,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LangChainInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AiSearchParseResponse = apply {
        if (validated) {
            return@apply
        }

        clarification().ifPresent { it.validate() }
        filter()
        maxStartTime()
        minStartTime()
        scope().ifPresent { it.validate() }
        semFilter()
        threadFilter()
        traceFilter()
        treeFilter()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (clarification.asKnown().getOrNull()?.validity() ?: 0) +
            (if (filter.asKnown().isPresent) 1 else 0) +
            (if (maxStartTime.asKnown().isPresent) 1 else 0) +
            (if (minStartTime.asKnown().isPresent) 1 else 0) +
            (scope.asKnown().getOrNull()?.validity() ?: 0) +
            (if (semFilter.asKnown().isPresent) 1 else 0) +
            (if (threadFilter.asKnown().isPresent) 1 else 0) +
            (if (traceFilter.asKnown().isPresent) 1 else 0) +
            (if (treeFilter.asKnown().isPresent) 1 else 0)

    /**
     * Interpretations to choose from. Returned only when allow_clarification is true and the search
     * is ambiguous; no other fields are set.
     */
    class Clarification
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val options: JsonField<List<Option>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("options")
            @ExcludeMissing
            options: JsonField<List<Option>> = JsonMissing.of()
        ) : this(options, mutableMapOf())

        /**
         * Two or three interpretations of the search.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun options(): Optional<List<Option>> = options.getOptional("options")

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<List<Option>> = options

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

            /** Returns a mutable builder for constructing an instance of [Clarification]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Clarification]. */
        class Builder internal constructor() {

            private var options: JsonField<MutableList<Option>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(clarification: Clarification) = apply {
                options = clarification.options.map { it.toMutableList() }
                additionalProperties = clarification.additionalProperties.toMutableMap()
            }

            /** Two or three interpretations of the search. */
            fun options(options: List<Option>) = options(JsonField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed `List<Option>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<List<Option>>) = apply {
                this.options = options.map { it.toMutableList() }
            }

            /**
             * Adds a single [Option] to [options].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOption(option: Option) = apply {
                options =
                    (options ?: JsonField.of(mutableListOf())).also {
                        checkKnown("options", it).add(option)
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
             * Returns an immutable instance of [Clarification].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Clarification =
                Clarification(
                    (options ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Clarification = apply {
            if (validated) {
                return@apply
            }

            options().ifPresent { it.forEach { it.validate() } }
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
            (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Option
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val filter: JsonField<String>,
            private val label: JsonField<String>,
            private val maxStartTime: JsonField<OffsetDateTime>,
            private val minStartTime: JsonField<OffsetDateTime>,
            private val scope: JsonField<Scope>,
            private val semFilter: JsonField<String>,
            private val threadFilter: JsonField<String>,
            private val traceFilter: JsonField<String>,
            private val treeFilter: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("filter")
                @ExcludeMissing
                filter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
                @JsonProperty("max_start_time")
                @ExcludeMissing
                maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("min_start_time")
                @ExcludeMissing
                minStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
                @JsonProperty("sem_filter")
                @ExcludeMissing
                semFilter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("thread_filter")
                @ExcludeMissing
                threadFilter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("trace_filter")
                @ExcludeMissing
                traceFilter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tree_filter")
                @ExcludeMissing
                treeFilter: JsonField<String> = JsonMissing.of(),
            ) : this(
                filter,
                label,
                maxStartTime,
                minStartTime,
                scope,
                semFilter,
                threadFilter,
                traceFilter,
                treeFilter,
                mutableMapOf(),
            )

            /**
             * Filter expression for the query API's filter parameter. Omitted when there is none.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun filter(): Optional<String> = filter.getOptional("filter")

            /**
             * Short description of this interpretation to show the user.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun label(): Optional<String> = label.getOptional("label")

            /**
             * Upper bound on start time (RFC 3339, UTC) for the query API's max_start_time
             * parameter. Omitted when the search names no end; keep your own time range.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun maxStartTime(): Optional<OffsetDateTime> =
                maxStartTime.getOptional("max_start_time")

            /**
             * Lower bound on start time (RFC 3339, UTC) for the query API's min_start_time
             * parameter. Omitted when the search names no start; keep your own time range.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun minStartTime(): Optional<OffsetDateTime> =
                minStartTime.getOptional("min_start_time")

            /**
             * Query API this interpretation is planned for.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun scope(): Optional<Scope> = scope.getOptional("scope")

            /**
             * Plain-language criterion for the query API's sem_filter parameter, matched against
             * conversation messages. Null when the search has no conversational criterion.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun semFilter(): Optional<String> = semFilter.getOptional("sem_filter")

            /**
             * Filter expression for the threads query API's thread_filter parameter. Omitted when
             * there is none.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun threadFilter(): Optional<String> = threadFilter.getOptional("thread_filter")

            /**
             * Filter expression for the query API's trace_filter parameter. Omitted when there is
             * none.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

            /**
             * Filter expression for the query API's tree_filter parameter. Omitted when there is
             * none.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

            /**
             * Returns the raw JSON value of [filter].
             *
             * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

            /**
             * Returns the raw JSON value of [label].
             *
             * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

            /**
             * Returns the raw JSON value of [maxStartTime].
             *
             * Unlike [maxStartTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("max_start_time")
            @ExcludeMissing
            fun _maxStartTime(): JsonField<OffsetDateTime> = maxStartTime

            /**
             * Returns the raw JSON value of [minStartTime].
             *
             * Unlike [minStartTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("min_start_time")
            @ExcludeMissing
            fun _minStartTime(): JsonField<OffsetDateTime> = minStartTime

            /**
             * Returns the raw JSON value of [scope].
             *
             * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

            /**
             * Returns the raw JSON value of [semFilter].
             *
             * Unlike [semFilter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sem_filter")
            @ExcludeMissing
            fun _semFilter(): JsonField<String> = semFilter

            /**
             * Returns the raw JSON value of [threadFilter].
             *
             * Unlike [threadFilter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("thread_filter")
            @ExcludeMissing
            fun _threadFilter(): JsonField<String> = threadFilter

            /**
             * Returns the raw JSON value of [traceFilter].
             *
             * Unlike [traceFilter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("trace_filter")
            @ExcludeMissing
            fun _traceFilter(): JsonField<String> = traceFilter

            /**
             * Returns the raw JSON value of [treeFilter].
             *
             * Unlike [treeFilter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tree_filter")
            @ExcludeMissing
            fun _treeFilter(): JsonField<String> = treeFilter

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

                /** Returns a mutable builder for constructing an instance of [Option]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Option]. */
            class Builder internal constructor() {

                private var filter: JsonField<String> = JsonMissing.of()
                private var label: JsonField<String> = JsonMissing.of()
                private var maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var minStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var scope: JsonField<Scope> = JsonMissing.of()
                private var semFilter: JsonField<String> = JsonMissing.of()
                private var threadFilter: JsonField<String> = JsonMissing.of()
                private var traceFilter: JsonField<String> = JsonMissing.of()
                private var treeFilter: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(option: Option) = apply {
                    filter = option.filter
                    label = option.label
                    maxStartTime = option.maxStartTime
                    minStartTime = option.minStartTime
                    scope = option.scope
                    semFilter = option.semFilter
                    threadFilter = option.threadFilter
                    traceFilter = option.traceFilter
                    treeFilter = option.treeFilter
                    additionalProperties = option.additionalProperties.toMutableMap()
                }

                /**
                 * Filter expression for the query API's filter parameter. Omitted when there is
                 * none.
                 */
                fun filter(filter: String) = filter(JsonField.of(filter))

                /**
                 * Sets [Builder.filter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filter] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filter(filter: JsonField<String>) = apply { this.filter = filter }

                /** Short description of this interpretation to show the user. */
                fun label(label: String) = label(JsonField.of(label))

                /**
                 * Sets [Builder.label] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.label] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun label(label: JsonField<String>) = apply { this.label = label }

                /**
                 * Upper bound on start time (RFC 3339, UTC) for the query API's max_start_time
                 * parameter. Omitted when the search names no end; keep your own time range.
                 */
                fun maxStartTime(maxStartTime: OffsetDateTime) =
                    maxStartTime(JsonField.of(maxStartTime))

                /**
                 * Sets [Builder.maxStartTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxStartTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun maxStartTime(maxStartTime: JsonField<OffsetDateTime>) = apply {
                    this.maxStartTime = maxStartTime
                }

                /**
                 * Lower bound on start time (RFC 3339, UTC) for the query API's min_start_time
                 * parameter. Omitted when the search names no start; keep your own time range.
                 */
                fun minStartTime(minStartTime: OffsetDateTime) =
                    minStartTime(JsonField.of(minStartTime))

                /**
                 * Sets [Builder.minStartTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.minStartTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun minStartTime(minStartTime: JsonField<OffsetDateTime>) = apply {
                    this.minStartTime = minStartTime
                }

                /** Query API this interpretation is planned for. */
                fun scope(scope: Scope) = scope(JsonField.of(scope))

                /**
                 * Sets [Builder.scope] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scope] with a well-typed [Scope] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

                /**
                 * Plain-language criterion for the query API's sem_filter parameter, matched
                 * against conversation messages. Null when the search has no conversational
                 * criterion.
                 */
                fun semFilter(semFilter: String?) = semFilter(JsonField.ofNullable(semFilter))

                /** Alias for calling [Builder.semFilter] with `semFilter.orElse(null)`. */
                fun semFilter(semFilter: Optional<String>) = semFilter(semFilter.getOrNull())

                /**
                 * Sets [Builder.semFilter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.semFilter] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun semFilter(semFilter: JsonField<String>) = apply { this.semFilter = semFilter }

                /**
                 * Filter expression for the threads query API's thread_filter parameter. Omitted
                 * when there is none.
                 */
                fun threadFilter(threadFilter: String) = threadFilter(JsonField.of(threadFilter))

                /**
                 * Sets [Builder.threadFilter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.threadFilter] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun threadFilter(threadFilter: JsonField<String>) = apply {
                    this.threadFilter = threadFilter
                }

                /**
                 * Filter expression for the query API's trace_filter parameter. Omitted when there
                 * is none.
                 */
                fun traceFilter(traceFilter: String) = traceFilter(JsonField.of(traceFilter))

                /**
                 * Sets [Builder.traceFilter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.traceFilter] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun traceFilter(traceFilter: JsonField<String>) = apply {
                    this.traceFilter = traceFilter
                }

                /**
                 * Filter expression for the query API's tree_filter parameter. Omitted when there
                 * is none.
                 */
                fun treeFilter(treeFilter: String) = treeFilter(JsonField.of(treeFilter))

                /**
                 * Sets [Builder.treeFilter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.treeFilter] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun treeFilter(treeFilter: JsonField<String>) = apply {
                    this.treeFilter = treeFilter
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Option].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Option =
                    Option(
                        filter,
                        label,
                        maxStartTime,
                        minStartTime,
                        scope,
                        semFilter,
                        threadFilter,
                        traceFilter,
                        treeFilter,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Option = apply {
                if (validated) {
                    return@apply
                }

                filter()
                label()
                maxStartTime()
                minStartTime()
                scope().ifPresent { it.validate() }
                semFilter()
                threadFilter()
                traceFilter()
                treeFilter()
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
                (if (filter.asKnown().isPresent) 1 else 0) +
                    (if (label.asKnown().isPresent) 1 else 0) +
                    (if (maxStartTime.asKnown().isPresent) 1 else 0) +
                    (if (minStartTime.asKnown().isPresent) 1 else 0) +
                    (scope.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (semFilter.asKnown().isPresent) 1 else 0) +
                    (if (threadFilter.asKnown().isPresent) 1 else 0) +
                    (if (traceFilter.asKnown().isPresent) 1 else 0) +
                    (if (treeFilter.asKnown().isPresent) 1 else 0)

            /** Query API this interpretation is planned for. */
            class Scope @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    RUNS,
                    TRACES,
                    THREADS,
                    /**
                     * An enum member indicating that [Scope] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
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
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
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

                return other is Option &&
                    filter == other.filter &&
                    label == other.label &&
                    maxStartTime == other.maxStartTime &&
                    minStartTime == other.minStartTime &&
                    scope == other.scope &&
                    semFilter == other.semFilter &&
                    threadFilter == other.threadFilter &&
                    traceFilter == other.traceFilter &&
                    treeFilter == other.treeFilter &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    filter,
                    label,
                    maxStartTime,
                    minStartTime,
                    scope,
                    semFilter,
                    threadFilter,
                    traceFilter,
                    treeFilter,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Option{filter=$filter, label=$label, maxStartTime=$maxStartTime, minStartTime=$minStartTime, scope=$scope, semFilter=$semFilter, threadFilter=$threadFilter, traceFilter=$traceFilter, treeFilter=$treeFilter, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Clarification &&
                options == other.options &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(options, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Clarification{options=$options, additionalProperties=$additionalProperties}"
    }

    /** Query API to send the plan to: runs, traces or threads. */
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

        return other is AiSearchParseResponse &&
            clarification == other.clarification &&
            filter == other.filter &&
            maxStartTime == other.maxStartTime &&
            minStartTime == other.minStartTime &&
            scope == other.scope &&
            semFilter == other.semFilter &&
            threadFilter == other.threadFilter &&
            traceFilter == other.traceFilter &&
            treeFilter == other.treeFilter &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            clarification,
            filter,
            maxStartTime,
            minStartTime,
            scope,
            semFilter,
            threadFilter,
            traceFilter,
            treeFilter,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AiSearchParseResponse{clarification=$clarification, filter=$filter, maxStartTime=$maxStartTime, minStartTime=$minStartTime, scope=$scope, semFilter=$semFilter, threadFilter=$threadFilter, traceFilter=$traceFilter, treeFilter=$treeFilter, additionalProperties=$additionalProperties}"
}
