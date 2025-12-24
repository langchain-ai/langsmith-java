// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class QueryExampleSchemaWithRuns
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val sessionIds: JsonField<List<String>>,
    private val comparativeExperimentId: JsonField<String>,
    private val filters: JsonField<Filters>,
    private val limit: JsonField<Long>,
    private val offset: JsonField<Long>,
    private val preview: JsonField<Boolean>,
    private val sortParams: JsonField<SortParamsForRunsComparisonView>,
    private val stream: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("session_ids")
        @ExcludeMissing
        sessionIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("comparative_experiment_id")
        @ExcludeMissing
        comparativeExperimentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filters") @ExcludeMissing filters: JsonField<Filters> = JsonMissing.of(),
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("preview") @ExcludeMissing preview: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sort_params")
        @ExcludeMissing
        sortParams: JsonField<SortParamsForRunsComparisonView> = JsonMissing.of(),
        @JsonProperty("stream") @ExcludeMissing stream: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        sessionIds,
        comparativeExperimentId,
        filters,
        limit,
        offset,
        preview,
        sortParams,
        stream,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionIds(): List<String> = sessionIds.getRequired("session_ids")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comparativeExperimentId(): Optional<String> =
        comparativeExperimentId.getOptional("comparative_experiment_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filters(): Optional<Filters> = filters.getOptional("filters")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Long> = limit.getOptional("limit")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<Long> = offset.getOptional("offset")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preview(): Optional<Boolean> = preview.getOptional("preview")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortParams(): Optional<SortParamsForRunsComparisonView> =
        sortParams.getOptional("sort_params")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stream(): Optional<Boolean> = stream.getOptional("stream")

    /**
     * Returns the raw JSON value of [sessionIds].
     *
     * Unlike [sessionIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_ids")
    @ExcludeMissing
    fun _sessionIds(): JsonField<List<String>> = sessionIds

    /**
     * Returns the raw JSON value of [comparativeExperimentId].
     *
     * Unlike [comparativeExperimentId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("comparative_experiment_id")
    @ExcludeMissing
    fun _comparativeExperimentId(): JsonField<String> = comparativeExperimentId

    /**
     * Returns the raw JSON value of [filters].
     *
     * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<Filters> = filters

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

    /**
     * Returns the raw JSON value of [preview].
     *
     * Unlike [preview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preview") @ExcludeMissing fun _preview(): JsonField<Boolean> = preview

    /**
     * Returns the raw JSON value of [sortParams].
     *
     * Unlike [sortParams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sort_params")
    @ExcludeMissing
    fun _sortParams(): JsonField<SortParamsForRunsComparisonView> = sortParams

    /**
     * Returns the raw JSON value of [stream].
     *
     * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

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
         * Returns a mutable builder for constructing an instance of [QueryExampleSchemaWithRuns].
         *
         * The following fields are required:
         * ```java
         * .sessionIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QueryExampleSchemaWithRuns]. */
    class Builder internal constructor() {

        private var sessionIds: JsonField<MutableList<String>>? = null
        private var comparativeExperimentId: JsonField<String> = JsonMissing.of()
        private var filters: JsonField<Filters> = JsonMissing.of()
        private var limit: JsonField<Long> = JsonMissing.of()
        private var offset: JsonField<Long> = JsonMissing.of()
        private var preview: JsonField<Boolean> = JsonMissing.of()
        private var sortParams: JsonField<SortParamsForRunsComparisonView> = JsonMissing.of()
        private var stream: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(queryExampleSchemaWithRuns: QueryExampleSchemaWithRuns) = apply {
            sessionIds = queryExampleSchemaWithRuns.sessionIds.map { it.toMutableList() }
            comparativeExperimentId = queryExampleSchemaWithRuns.comparativeExperimentId
            filters = queryExampleSchemaWithRuns.filters
            limit = queryExampleSchemaWithRuns.limit
            offset = queryExampleSchemaWithRuns.offset
            preview = queryExampleSchemaWithRuns.preview
            sortParams = queryExampleSchemaWithRuns.sortParams
            stream = queryExampleSchemaWithRuns.stream
            additionalProperties = queryExampleSchemaWithRuns.additionalProperties.toMutableMap()
        }

        fun sessionIds(sessionIds: List<String>) = sessionIds(JsonField.of(sessionIds))

        /**
         * Sets [Builder.sessionIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sessionIds(sessionIds: JsonField<List<String>>) = apply {
            this.sessionIds = sessionIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [sessionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSessionId(sessionId: String) = apply {
            sessionIds =
                (sessionIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sessionIds", it).add(sessionId)
                }
        }

        fun comparativeExperimentId(comparativeExperimentId: String?) =
            comparativeExperimentId(JsonField.ofNullable(comparativeExperimentId))

        /**
         * Alias for calling [Builder.comparativeExperimentId] with
         * `comparativeExperimentId.orElse(null)`.
         */
        fun comparativeExperimentId(comparativeExperimentId: Optional<String>) =
            comparativeExperimentId(comparativeExperimentId.getOrNull())

        /**
         * Sets [Builder.comparativeExperimentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comparativeExperimentId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun comparativeExperimentId(comparativeExperimentId: JsonField<String>) = apply {
            this.comparativeExperimentId = comparativeExperimentId
        }

        fun filters(filters: Filters?) = filters(JsonField.ofNullable(filters))

        /** Alias for calling [Builder.filters] with `filters.orElse(null)`. */
        fun filters(filters: Optional<Filters>) = filters(filters.getOrNull())

        /**
         * Sets [Builder.filters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filters] with a well-typed [Filters] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filters(filters: JsonField<Filters>) = apply { this.filters = filters }

        fun limit(limit: Long) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        fun offset(offset: Long) = offset(JsonField.of(offset))

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

        fun preview(preview: Boolean) = preview(JsonField.of(preview))

        /**
         * Sets [Builder.preview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preview] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun preview(preview: JsonField<Boolean>) = apply { this.preview = preview }

        fun sortParams(sortParams: SortParamsForRunsComparisonView?) =
            sortParams(JsonField.ofNullable(sortParams))

        /** Alias for calling [Builder.sortParams] with `sortParams.orElse(null)`. */
        fun sortParams(sortParams: Optional<SortParamsForRunsComparisonView>) =
            sortParams(sortParams.getOrNull())

        /**
         * Sets [Builder.sortParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sortParams] with a well-typed
         * [SortParamsForRunsComparisonView] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun sortParams(sortParams: JsonField<SortParamsForRunsComparisonView>) = apply {
            this.sortParams = sortParams
        }

        fun stream(stream: Boolean) = stream(JsonField.of(stream))

        /**
         * Sets [Builder.stream] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stream] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

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
         * Returns an immutable instance of [QueryExampleSchemaWithRuns].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sessionIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QueryExampleSchemaWithRuns =
            QueryExampleSchemaWithRuns(
                checkRequired("sessionIds", sessionIds).map { it.toImmutable() },
                comparativeExperimentId,
                filters,
                limit,
                offset,
                preview,
                sortParams,
                stream,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): QueryExampleSchemaWithRuns = apply {
        if (validated) {
            return@apply
        }

        sessionIds()
        comparativeExperimentId()
        filters().ifPresent { it.validate() }
        limit()
        offset()
        preview()
        sortParams().ifPresent { it.validate() }
        stream()
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
        (sessionIds.asKnown().getOrNull()?.size ?: 0) +
            (if (comparativeExperimentId.asKnown().isPresent) 1 else 0) +
            (filters.asKnown().getOrNull()?.validity() ?: 0) +
            (if (limit.asKnown().isPresent) 1 else 0) +
            (if (offset.asKnown().isPresent) 1 else 0) +
            (if (preview.asKnown().isPresent) 1 else 0) +
            (sortParams.asKnown().getOrNull()?.validity() ?: 0) +
            (if (stream.asKnown().isPresent) 1 else 0)

    class Filters
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filters: Filters) = apply {
                additionalProperties = filters.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Filters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filters = Filters(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Filters = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filters && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Filters{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QueryExampleSchemaWithRuns &&
            sessionIds == other.sessionIds &&
            comparativeExperimentId == other.comparativeExperimentId &&
            filters == other.filters &&
            limit == other.limit &&
            offset == other.offset &&
            preview == other.preview &&
            sortParams == other.sortParams &&
            stream == other.stream &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            sessionIds,
            comparativeExperimentId,
            filters,
            limit,
            offset,
            preview,
            sortParams,
            stream,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QueryExampleSchemaWithRuns{sessionIds=$sessionIds, comparativeExperimentId=$comparativeExperimentId, filters=$filters, limit=$limit, offset=$offset, preview=$preview, sortParams=$sortParams, stream=$stream, additionalProperties=$additionalProperties}"
}
