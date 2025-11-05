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

class QueryFeedbackDelta
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val baselineSessionId: JsonField<String>,
    private val comparisonSessionIds: JsonField<List<String>>,
    private val feedbackKey: JsonField<String>,
    private val comparativeExperimentId: JsonField<String>,
    private val filters: JsonField<Filters>,
    private val limit: JsonField<Long>,
    private val offset: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("baseline_session_id")
        @ExcludeMissing
        baselineSessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comparison_session_ids")
        @ExcludeMissing
        comparisonSessionIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("feedback_key")
        @ExcludeMissing
        feedbackKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comparative_experiment_id")
        @ExcludeMissing
        comparativeExperimentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filters") @ExcludeMissing filters: JsonField<Filters> = JsonMissing.of(),
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
    ) : this(
        baselineSessionId,
        comparisonSessionIds,
        feedbackKey,
        comparativeExperimentId,
        filters,
        limit,
        offset,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun baselineSessionId(): String = baselineSessionId.getRequired("baseline_session_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun comparisonSessionIds(): List<String> =
        comparisonSessionIds.getRequired("comparison_session_ids")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

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
     * Returns the raw JSON value of [baselineSessionId].
     *
     * Unlike [baselineSessionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("baseline_session_id")
    @ExcludeMissing
    fun _baselineSessionId(): JsonField<String> = baselineSessionId

    /**
     * Returns the raw JSON value of [comparisonSessionIds].
     *
     * Unlike [comparisonSessionIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("comparison_session_ids")
    @ExcludeMissing
    fun _comparisonSessionIds(): JsonField<List<String>> = comparisonSessionIds

    /**
     * Returns the raw JSON value of [feedbackKey].
     *
     * Unlike [feedbackKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_key")
    @ExcludeMissing
    fun _feedbackKey(): JsonField<String> = feedbackKey

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
         * Returns a mutable builder for constructing an instance of [QueryFeedbackDelta].
         *
         * The following fields are required:
         * ```java
         * .baselineSessionId()
         * .comparisonSessionIds()
         * .feedbackKey()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [QueryFeedbackDelta]. */
    class Builder internal constructor() {

        private var baselineSessionId: JsonField<String>? = null
        private var comparisonSessionIds: JsonField<MutableList<String>>? = null
        private var feedbackKey: JsonField<String>? = null
        private var comparativeExperimentId: JsonField<String> = JsonMissing.of()
        private var filters: JsonField<Filters> = JsonMissing.of()
        private var limit: JsonField<Long> = JsonMissing.of()
        private var offset: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(queryFeedbackDelta: QueryFeedbackDelta) = apply {
            baselineSessionId = queryFeedbackDelta.baselineSessionId
            comparisonSessionIds =
                queryFeedbackDelta.comparisonSessionIds.map { it.toMutableList() }
            feedbackKey = queryFeedbackDelta.feedbackKey
            comparativeExperimentId = queryFeedbackDelta.comparativeExperimentId
            filters = queryFeedbackDelta.filters
            limit = queryFeedbackDelta.limit
            offset = queryFeedbackDelta.offset
            additionalProperties = queryFeedbackDelta.additionalProperties.toMutableMap()
        }

        fun baselineSessionId(baselineSessionId: String) =
            baselineSessionId(JsonField.of(baselineSessionId))

        /**
         * Sets [Builder.baselineSessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baselineSessionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun baselineSessionId(baselineSessionId: JsonField<String>) = apply {
            this.baselineSessionId = baselineSessionId
        }

        fun comparisonSessionIds(comparisonSessionIds: List<String>) =
            comparisonSessionIds(JsonField.of(comparisonSessionIds))

        /**
         * Sets [Builder.comparisonSessionIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comparisonSessionIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun comparisonSessionIds(comparisonSessionIds: JsonField<List<String>>) = apply {
            this.comparisonSessionIds = comparisonSessionIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [comparisonSessionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addComparisonSessionId(comparisonSessionId: String) = apply {
            comparisonSessionIds =
                (comparisonSessionIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("comparisonSessionIds", it).add(comparisonSessionId)
                }
        }

        fun feedbackKey(feedbackKey: String) = feedbackKey(JsonField.of(feedbackKey))

        /**
         * Sets [Builder.feedbackKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun feedbackKey(feedbackKey: JsonField<String>) = apply { this.feedbackKey = feedbackKey }

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
         * Returns an immutable instance of [QueryFeedbackDelta].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .baselineSessionId()
         * .comparisonSessionIds()
         * .feedbackKey()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QueryFeedbackDelta =
            QueryFeedbackDelta(
                checkRequired("baselineSessionId", baselineSessionId),
                checkRequired("comparisonSessionIds", comparisonSessionIds).map {
                    it.toImmutable()
                },
                checkRequired("feedbackKey", feedbackKey),
                comparativeExperimentId,
                filters,
                limit,
                offset,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): QueryFeedbackDelta = apply {
        if (validated) {
            return@apply
        }

        baselineSessionId()
        comparisonSessionIds()
        feedbackKey()
        comparativeExperimentId()
        filters().ifPresent { it.validate() }
        limit()
        offset()
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
        (if (baselineSessionId.asKnown().isPresent) 1 else 0) +
            (comparisonSessionIds.asKnown().getOrNull()?.size ?: 0) +
            (if (feedbackKey.asKnown().isPresent) 1 else 0) +
            (if (comparativeExperimentId.asKnown().isPresent) 1 else 0) +
            (filters.asKnown().getOrNull()?.validity() ?: 0) +
            (if (limit.asKnown().isPresent) 1 else 0) +
            (if (offset.asKnown().isPresent) 1 else 0)

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

        return other is QueryFeedbackDelta &&
            baselineSessionId == other.baselineSessionId &&
            comparisonSessionIds == other.comparisonSessionIds &&
            feedbackKey == other.feedbackKey &&
            comparativeExperimentId == other.comparativeExperimentId &&
            filters == other.filters &&
            limit == other.limit &&
            offset == other.offset &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            baselineSessionId,
            comparisonSessionIds,
            feedbackKey,
            comparativeExperimentId,
            filters,
            limit,
            offset,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QueryFeedbackDelta{baselineSessionId=$baselineSessionId, comparisonSessionIds=$comparisonSessionIds, feedbackKey=$feedbackKey, comparativeExperimentId=$comparativeExperimentId, filters=$filters, limit=$limit, offset=$offset, additionalProperties=$additionalProperties}"
}
