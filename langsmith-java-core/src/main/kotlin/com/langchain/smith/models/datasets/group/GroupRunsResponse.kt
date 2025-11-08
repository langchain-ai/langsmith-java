// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.group

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.BaseDeserializer
import com.langchain.smith.core.BaseSerializer
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.datasets.runs.ExampleWithRunsCh
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Response for grouped comparison view of dataset examples.
 *
 * Returns dataset examples grouped by a run metadata value (e.g., model='gpt-4'). Optional filters
 * are applied to all runs before grouping.
 *
 * Shows:
 * - Which examples were executed with each metadata value
 * - Per-session aggregate statistics for runs on those examples
 * - The actual example data with their associated runs
 *
 * Used for comparing how different sessions performed on the same set of examples.
 */
class GroupRunsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val groups: JsonField<List<Group>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("groups") @ExcludeMissing groups: JsonField<List<Group>> = JsonMissing.of()
    ) : this(groups, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun groups(): List<Group> = groups.getRequired("groups")

    /**
     * Returns the raw JSON value of [groups].
     *
     * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groups") @ExcludeMissing fun _groups(): JsonField<List<Group>> = groups

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
         * Returns a mutable builder for constructing an instance of [GroupRunsResponse].
         *
         * The following fields are required:
         * ```java
         * .groups()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GroupRunsResponse]. */
    class Builder internal constructor() {

        private var groups: JsonField<MutableList<Group>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(groupRunsResponse: GroupRunsResponse) = apply {
            groups = groupRunsResponse.groups.map { it.toMutableList() }
            additionalProperties = groupRunsResponse.additionalProperties.toMutableMap()
        }

        fun groups(groups: List<Group>) = groups(JsonField.of(groups))

        /**
         * Sets [Builder.groups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groups] with a well-typed `List<Group>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groups(groups: JsonField<List<Group>>) = apply {
            this.groups = groups.map { it.toMutableList() }
        }

        /**
         * Adds a single [Group] to [groups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroup(group: Group) = apply {
            groups =
                (groups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("groups", it).add(group)
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
         * Returns an immutable instance of [GroupRunsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .groups()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GroupRunsResponse =
            GroupRunsResponse(
                checkRequired("groups", groups).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GroupRunsResponse = apply {
        if (validated) {
            return@apply
        }

        groups().forEach { it.validate() }
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
        (groups.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * Group of examples with a specific metadata value across multiple sessions.
     *
     * Extends RunGroupBase with:
     * - group_key: metadata value that defines this group
     * - sessions: per-session stats for runs matching this metadata value
     * - examples: shared examples across all sessions (intersection logic) with flat array of runs
     *   (each run has session_id field for frontend to determine column)
     * - example_count: unique example count (pagination-aware, same across all sessions due to
     *   intersection)
     *
     * Inherited from RunGroupBase:
     * - filter: metadata filter for this group (e.g., "and(eq(is_root, true), and(eq(metadata_key,
     *   'model'), eq(metadata_value, 'gpt-4')))")
     * - count: total run count across all sessions (includes duplicate runs)
     * - total_tokens, total_cost: aggregate across sessions
     * - min_start_time, max_start_time: time range across sessions
     * - latency_p50, latency_p99: aggregate latency stats across sessions
     * - feedback_stats: weighted average feedback across sessions
     *
     * Additional aggregate stats (from ExampleWithRunsGroup):
     * - prompt_tokens, completion_tokens: separate token counts
     * - prompt_cost, completion_cost: separate costs
     * - error_rate: average error rate
     */
    class Group
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val exampleCount: JsonField<Long>,
        private val examples: JsonField<List<ExampleWithRunsCh>>,
        private val filter: JsonField<String>,
        private val groupKey: JsonField<GroupKey>,
        private val sessions: JsonField<List<Session>>,
        private val completionCost: JsonField<String>,
        private val completionTokens: JsonField<Long>,
        private val count: JsonField<Long>,
        private val errorRate: JsonField<Double>,
        private val feedbackStats: JsonValue,
        private val latencyP50: JsonField<Double>,
        private val latencyP99: JsonField<Double>,
        private val maxStartTime: JsonField<OffsetDateTime>,
        private val minStartTime: JsonField<OffsetDateTime>,
        private val promptCost: JsonField<String>,
        private val promptTokens: JsonField<Long>,
        private val totalCost: JsonField<String>,
        private val totalTokens: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("example_count")
            @ExcludeMissing
            exampleCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("examples")
            @ExcludeMissing
            examples: JsonField<List<ExampleWithRunsCh>> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("group_key")
            @ExcludeMissing
            groupKey: JsonField<GroupKey> = JsonMissing.of(),
            @JsonProperty("sessions")
            @ExcludeMissing
            sessions: JsonField<List<Session>> = JsonMissing.of(),
            @JsonProperty("completion_cost")
            @ExcludeMissing
            completionCost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("completion_tokens")
            @ExcludeMissing
            completionTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("error_rate")
            @ExcludeMissing
            errorRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("feedback_stats")
            @ExcludeMissing
            feedbackStats: JsonValue = JsonMissing.of(),
            @JsonProperty("latency_p50")
            @ExcludeMissing
            latencyP50: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("latency_p99")
            @ExcludeMissing
            latencyP99: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("max_start_time")
            @ExcludeMissing
            maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("min_start_time")
            @ExcludeMissing
            minStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("prompt_cost")
            @ExcludeMissing
            promptCost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt_tokens")
            @ExcludeMissing
            promptTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_cost")
            @ExcludeMissing
            totalCost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total_tokens")
            @ExcludeMissing
            totalTokens: JsonField<Long> = JsonMissing.of(),
        ) : this(
            exampleCount,
            examples,
            filter,
            groupKey,
            sessions,
            completionCost,
            completionTokens,
            count,
            errorRate,
            feedbackStats,
            latencyP50,
            latencyP99,
            maxStartTime,
            minStartTime,
            promptCost,
            promptTokens,
            totalCost,
            totalTokens,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun exampleCount(): Long = exampleCount.getRequired("example_count")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun examples(): List<ExampleWithRunsCh> = examples.getRequired("examples")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filter(): String = filter.getRequired("filter")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun groupKey(): GroupKey = groupKey.getRequired("group_key")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sessions(): List<Session> = sessions.getRequired("sessions")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun completionCost(): Optional<String> = completionCost.getOptional("completion_cost")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun completionTokens(): Optional<Long> = completionTokens.getOptional("completion_tokens")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun count(): Optional<Long> = count.getOptional("count")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun errorRate(): Optional<Double> = errorRate.getOptional("error_rate")

        @JsonProperty("feedback_stats")
        @ExcludeMissing
        fun _feedbackStats(): JsonValue = feedbackStats

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun latencyP50(): Optional<Double> = latencyP50.getOptional("latency_p50")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun latencyP99(): Optional<Double> = latencyP99.getOptional("latency_p99")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxStartTime(): Optional<OffsetDateTime> = maxStartTime.getOptional("max_start_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun minStartTime(): Optional<OffsetDateTime> = minStartTime.getOptional("min_start_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptCost(): Optional<String> = promptCost.getOptional("prompt_cost")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptTokens(): Optional<Long> = promptTokens.getOptional("prompt_tokens")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalCost(): Optional<String> = totalCost.getOptional("total_cost")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalTokens(): Optional<Long> = totalTokens.getOptional("total_tokens")

        /**
         * Returns the raw JSON value of [exampleCount].
         *
         * Unlike [exampleCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("example_count")
        @ExcludeMissing
        fun _exampleCount(): JsonField<Long> = exampleCount

        /**
         * Returns the raw JSON value of [examples].
         *
         * Unlike [examples], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("examples")
        @ExcludeMissing
        fun _examples(): JsonField<List<ExampleWithRunsCh>> = examples

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Returns the raw JSON value of [groupKey].
         *
         * Unlike [groupKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_key") @ExcludeMissing fun _groupKey(): JsonField<GroupKey> = groupKey

        /**
         * Returns the raw JSON value of [sessions].
         *
         * Unlike [sessions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sessions")
        @ExcludeMissing
        fun _sessions(): JsonField<List<Session>> = sessions

        /**
         * Returns the raw JSON value of [completionCost].
         *
         * Unlike [completionCost], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("completion_cost")
        @ExcludeMissing
        fun _completionCost(): JsonField<String> = completionCost

        /**
         * Returns the raw JSON value of [completionTokens].
         *
         * Unlike [completionTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        fun _completionTokens(): JsonField<Long> = completionTokens

        /**
         * Returns the raw JSON value of [count].
         *
         * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

        /**
         * Returns the raw JSON value of [errorRate].
         *
         * Unlike [errorRate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error_rate") @ExcludeMissing fun _errorRate(): JsonField<Double> = errorRate

        /**
         * Returns the raw JSON value of [latencyP50].
         *
         * Unlike [latencyP50], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("latency_p50")
        @ExcludeMissing
        fun _latencyP50(): JsonField<Double> = latencyP50

        /**
         * Returns the raw JSON value of [latencyP99].
         *
         * Unlike [latencyP99], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("latency_p99")
        @ExcludeMissing
        fun _latencyP99(): JsonField<Double> = latencyP99

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
         * Returns the raw JSON value of [promptCost].
         *
         * Unlike [promptCost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt_cost")
        @ExcludeMissing
        fun _promptCost(): JsonField<String> = promptCost

        /**
         * Returns the raw JSON value of [promptTokens].
         *
         * Unlike [promptTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        fun _promptTokens(): JsonField<Long> = promptTokens

        /**
         * Returns the raw JSON value of [totalCost].
         *
         * Unlike [totalCost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_cost") @ExcludeMissing fun _totalCost(): JsonField<String> = totalCost

        /**
         * Returns the raw JSON value of [totalTokens].
         *
         * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_tokens")
        @ExcludeMissing
        fun _totalTokens(): JsonField<Long> = totalTokens

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
             * Returns a mutable builder for constructing an instance of [Group].
             *
             * The following fields are required:
             * ```java
             * .exampleCount()
             * .examples()
             * .filter()
             * .groupKey()
             * .sessions()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Group]. */
        class Builder internal constructor() {

            private var exampleCount: JsonField<Long>? = null
            private var examples: JsonField<MutableList<ExampleWithRunsCh>>? = null
            private var filter: JsonField<String>? = null
            private var groupKey: JsonField<GroupKey>? = null
            private var sessions: JsonField<MutableList<Session>>? = null
            private var completionCost: JsonField<String> = JsonMissing.of()
            private var completionTokens: JsonField<Long> = JsonMissing.of()
            private var count: JsonField<Long> = JsonMissing.of()
            private var errorRate: JsonField<Double> = JsonMissing.of()
            private var feedbackStats: JsonValue = JsonMissing.of()
            private var latencyP50: JsonField<Double> = JsonMissing.of()
            private var latencyP99: JsonField<Double> = JsonMissing.of()
            private var maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var minStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var promptCost: JsonField<String> = JsonMissing.of()
            private var promptTokens: JsonField<Long> = JsonMissing.of()
            private var totalCost: JsonField<String> = JsonMissing.of()
            private var totalTokens: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(group: Group) = apply {
                exampleCount = group.exampleCount
                examples = group.examples.map { it.toMutableList() }
                filter = group.filter
                groupKey = group.groupKey
                sessions = group.sessions.map { it.toMutableList() }
                completionCost = group.completionCost
                completionTokens = group.completionTokens
                count = group.count
                errorRate = group.errorRate
                feedbackStats = group.feedbackStats
                latencyP50 = group.latencyP50
                latencyP99 = group.latencyP99
                maxStartTime = group.maxStartTime
                minStartTime = group.minStartTime
                promptCost = group.promptCost
                promptTokens = group.promptTokens
                totalCost = group.totalCost
                totalTokens = group.totalTokens
                additionalProperties = group.additionalProperties.toMutableMap()
            }

            fun exampleCount(exampleCount: Long) = exampleCount(JsonField.of(exampleCount))

            /**
             * Sets [Builder.exampleCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exampleCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exampleCount(exampleCount: JsonField<Long>) = apply {
                this.exampleCount = exampleCount
            }

            fun examples(examples: List<ExampleWithRunsCh>) = examples(JsonField.of(examples))

            /**
             * Sets [Builder.examples] to an arbitrary JSON value.
             *
             * You should usually call [Builder.examples] with a well-typed
             * `List<ExampleWithRunsCh>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun examples(examples: JsonField<List<ExampleWithRunsCh>>) = apply {
                this.examples = examples.map { it.toMutableList() }
            }

            /**
             * Adds a single [ExampleWithRunsCh] to [examples].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExample(example: ExampleWithRunsCh) = apply {
                examples =
                    (examples ?: JsonField.of(mutableListOf())).also {
                        checkKnown("examples", it).add(example)
                    }
            }

            fun filter(filter: String) = filter(JsonField.of(filter))

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            fun groupKey(groupKey: GroupKey) = groupKey(JsonField.of(groupKey))

            /**
             * Sets [Builder.groupKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupKey] with a well-typed [GroupKey] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupKey(groupKey: JsonField<GroupKey>) = apply { this.groupKey = groupKey }

            /** Alias for calling [groupKey] with `GroupKey.ofString(string)`. */
            fun groupKey(string: String) = groupKey(GroupKey.ofString(string))

            /** Alias for calling [groupKey] with `GroupKey.ofNumber(number)`. */
            fun groupKey(number: Double) = groupKey(GroupKey.ofNumber(number))

            fun sessions(sessions: List<Session>) = sessions(JsonField.of(sessions))

            /**
             * Sets [Builder.sessions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessions] with a well-typed `List<Session>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessions(sessions: JsonField<List<Session>>) = apply {
                this.sessions = sessions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Session] to [sessions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSession(session: Session) = apply {
                sessions =
                    (sessions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("sessions", it).add(session)
                    }
            }

            fun completionCost(completionCost: String?) =
                completionCost(JsonField.ofNullable(completionCost))

            /** Alias for calling [Builder.completionCost] with `completionCost.orElse(null)`. */
            fun completionCost(completionCost: Optional<String>) =
                completionCost(completionCost.getOrNull())

            /**
             * Sets [Builder.completionCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completionCost] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun completionCost(completionCost: JsonField<String>) = apply {
                this.completionCost = completionCost
            }

            fun completionTokens(completionTokens: Long?) =
                completionTokens(JsonField.ofNullable(completionTokens))

            /**
             * Alias for [Builder.completionTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun completionTokens(completionTokens: Long) =
                completionTokens(completionTokens as Long?)

            /**
             * Alias for calling [Builder.completionTokens] with `completionTokens.orElse(null)`.
             */
            fun completionTokens(completionTokens: Optional<Long>) =
                completionTokens(completionTokens.getOrNull())

            /**
             * Sets [Builder.completionTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completionTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun completionTokens(completionTokens: JsonField<Long>) = apply {
                this.completionTokens = completionTokens
            }

            fun count(count: Long?) = count(JsonField.ofNullable(count))

            /**
             * Alias for [Builder.count].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun count(count: Long) = count(count as Long?)

            /** Alias for calling [Builder.count] with `count.orElse(null)`. */
            fun count(count: Optional<Long>) = count(count.getOrNull())

            /**
             * Sets [Builder.count] to an arbitrary JSON value.
             *
             * You should usually call [Builder.count] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun count(count: JsonField<Long>) = apply { this.count = count }

            fun errorRate(errorRate: Double?) = errorRate(JsonField.ofNullable(errorRate))

            /**
             * Alias for [Builder.errorRate].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun errorRate(errorRate: Double) = errorRate(errorRate as Double?)

            /** Alias for calling [Builder.errorRate] with `errorRate.orElse(null)`. */
            fun errorRate(errorRate: Optional<Double>) = errorRate(errorRate.getOrNull())

            /**
             * Sets [Builder.errorRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorRate] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorRate(errorRate: JsonField<Double>) = apply { this.errorRate = errorRate }

            fun feedbackStats(feedbackStats: JsonValue) = apply {
                this.feedbackStats = feedbackStats
            }

            fun latencyP50(latencyP50: Double?) = latencyP50(JsonField.ofNullable(latencyP50))

            /**
             * Alias for [Builder.latencyP50].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun latencyP50(latencyP50: Double) = latencyP50(latencyP50 as Double?)

            /** Alias for calling [Builder.latencyP50] with `latencyP50.orElse(null)`. */
            fun latencyP50(latencyP50: Optional<Double>) = latencyP50(latencyP50.getOrNull())

            /**
             * Sets [Builder.latencyP50] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latencyP50] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latencyP50(latencyP50: JsonField<Double>) = apply { this.latencyP50 = latencyP50 }

            fun latencyP99(latencyP99: Double?) = latencyP99(JsonField.ofNullable(latencyP99))

            /**
             * Alias for [Builder.latencyP99].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun latencyP99(latencyP99: Double) = latencyP99(latencyP99 as Double?)

            /** Alias for calling [Builder.latencyP99] with `latencyP99.orElse(null)`. */
            fun latencyP99(latencyP99: Optional<Double>) = latencyP99(latencyP99.getOrNull())

            /**
             * Sets [Builder.latencyP99] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latencyP99] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latencyP99(latencyP99: JsonField<Double>) = apply { this.latencyP99 = latencyP99 }

            fun maxStartTime(maxStartTime: OffsetDateTime?) =
                maxStartTime(JsonField.ofNullable(maxStartTime))

            /** Alias for calling [Builder.maxStartTime] with `maxStartTime.orElse(null)`. */
            fun maxStartTime(maxStartTime: Optional<OffsetDateTime>) =
                maxStartTime(maxStartTime.getOrNull())

            /**
             * Sets [Builder.maxStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxStartTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun maxStartTime(maxStartTime: JsonField<OffsetDateTime>) = apply {
                this.maxStartTime = maxStartTime
            }

            fun minStartTime(minStartTime: OffsetDateTime?) =
                minStartTime(JsonField.ofNullable(minStartTime))

            /** Alias for calling [Builder.minStartTime] with `minStartTime.orElse(null)`. */
            fun minStartTime(minStartTime: Optional<OffsetDateTime>) =
                minStartTime(minStartTime.getOrNull())

            /**
             * Sets [Builder.minStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minStartTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun minStartTime(minStartTime: JsonField<OffsetDateTime>) = apply {
                this.minStartTime = minStartTime
            }

            fun promptCost(promptCost: String?) = promptCost(JsonField.ofNullable(promptCost))

            /** Alias for calling [Builder.promptCost] with `promptCost.orElse(null)`. */
            fun promptCost(promptCost: Optional<String>) = promptCost(promptCost.getOrNull())

            /**
             * Sets [Builder.promptCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptCost] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptCost(promptCost: JsonField<String>) = apply { this.promptCost = promptCost }

            fun promptTokens(promptTokens: Long?) = promptTokens(JsonField.ofNullable(promptTokens))

            /**
             * Alias for [Builder.promptTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun promptTokens(promptTokens: Long) = promptTokens(promptTokens as Long?)

            /** Alias for calling [Builder.promptTokens] with `promptTokens.orElse(null)`. */
            fun promptTokens(promptTokens: Optional<Long>) = promptTokens(promptTokens.getOrNull())

            /**
             * Sets [Builder.promptTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptTokens(promptTokens: JsonField<Long>) = apply {
                this.promptTokens = promptTokens
            }

            fun totalCost(totalCost: String?) = totalCost(JsonField.ofNullable(totalCost))

            /** Alias for calling [Builder.totalCost] with `totalCost.orElse(null)`. */
            fun totalCost(totalCost: Optional<String>) = totalCost(totalCost.getOrNull())

            /**
             * Sets [Builder.totalCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCost] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCost(totalCost: JsonField<String>) = apply { this.totalCost = totalCost }

            fun totalTokens(totalTokens: Long?) = totalTokens(JsonField.ofNullable(totalTokens))

            /**
             * Alias for [Builder.totalTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun totalTokens(totalTokens: Long) = totalTokens(totalTokens as Long?)

            /** Alias for calling [Builder.totalTokens] with `totalTokens.orElse(null)`. */
            fun totalTokens(totalTokens: Optional<Long>) = totalTokens(totalTokens.getOrNull())

            /**
             * Sets [Builder.totalTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

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
             * Returns an immutable instance of [Group].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .exampleCount()
             * .examples()
             * .filter()
             * .groupKey()
             * .sessions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Group =
                Group(
                    checkRequired("exampleCount", exampleCount),
                    checkRequired("examples", examples).map { it.toImmutable() },
                    checkRequired("filter", filter),
                    checkRequired("groupKey", groupKey),
                    checkRequired("sessions", sessions).map { it.toImmutable() },
                    completionCost,
                    completionTokens,
                    count,
                    errorRate,
                    feedbackStats,
                    latencyP50,
                    latencyP99,
                    maxStartTime,
                    minStartTime,
                    promptCost,
                    promptTokens,
                    totalCost,
                    totalTokens,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Group = apply {
            if (validated) {
                return@apply
            }

            exampleCount()
            examples().forEach { it.validate() }
            filter()
            groupKey().validate()
            sessions().forEach { it.validate() }
            completionCost()
            completionTokens()
            count()
            errorRate()
            latencyP50()
            latencyP99()
            maxStartTime()
            minStartTime()
            promptCost()
            promptTokens()
            totalCost()
            totalTokens()
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
            (if (exampleCount.asKnown().isPresent) 1 else 0) +
                (examples.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (filter.asKnown().isPresent) 1 else 0) +
                (groupKey.asKnown().getOrNull()?.validity() ?: 0) +
                (sessions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (completionCost.asKnown().isPresent) 1 else 0) +
                (if (completionTokens.asKnown().isPresent) 1 else 0) +
                (if (count.asKnown().isPresent) 1 else 0) +
                (if (errorRate.asKnown().isPresent) 1 else 0) +
                (if (latencyP50.asKnown().isPresent) 1 else 0) +
                (if (latencyP99.asKnown().isPresent) 1 else 0) +
                (if (maxStartTime.asKnown().isPresent) 1 else 0) +
                (if (minStartTime.asKnown().isPresent) 1 else 0) +
                (if (promptCost.asKnown().isPresent) 1 else 0) +
                (if (promptTokens.asKnown().isPresent) 1 else 0) +
                (if (totalCost.asKnown().isPresent) 1 else 0) +
                (if (totalTokens.asKnown().isPresent) 1 else 0)

        @JsonDeserialize(using = GroupKey.Deserializer::class)
        @JsonSerialize(using = GroupKey.Serializer::class)
        class GroupKey
        private constructor(
            private val string: String? = null,
            private val number: Double? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun number(): Optional<Double> = Optional.ofNullable(number)

            fun isString(): Boolean = string != null

            fun isNumber(): Boolean = number != null

            fun asString(): String = string.getOrThrow("string")

            fun asNumber(): Double = number.getOrThrow("number")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    number != null -> visitor.visitNumber(number)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): GroupKey = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitNumber(number: Double) {}
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitNumber(number: Double) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GroupKey && string == other.string && number == other.number
            }

            override fun hashCode(): Int = Objects.hash(string, number)

            override fun toString(): String =
                when {
                    string != null -> "GroupKey{string=$string}"
                    number != null -> "GroupKey{number=$number}"
                    _json != null -> "GroupKey{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid GroupKey")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = GroupKey(string = string)

                @JvmStatic fun ofNumber(number: Double) = GroupKey(number = number)
            }

            /**
             * An interface that defines how to map each variant of [GroupKey] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitNumber(number: Double): T

                /**
                 * Maps an unknown variant of [GroupKey] to a value of type [T].
                 *
                 * An instance of [GroupKey] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws LangChainInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LangChainInvalidDataException("Unknown GroupKey: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<GroupKey>(GroupKey::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): GroupKey {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    GroupKey(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    GroupKey(number = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> GroupKey(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<GroupKey>(GroupKey::class) {

                override fun serialize(
                    value: GroupKey,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.number != null -> generator.writeObject(value.number)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid GroupKey")
                    }
                }
            }
        }

        /**
         * TracerSession stats filtered to runs matching a specific metadata value.
         *
         * Extends TracerSession with:
         * - example_count: unique examples (vs run_count = total runs including duplicates)
         * - filter: ClickHouse filter for fetching runs in this session/group
         * - min/max_start_time: time range for runs in this session/group
         */
        class Session
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val filter: JsonField<String>,
            private val tenantId: JsonField<String>,
            private val completionCost: JsonField<String>,
            private val completionTokens: JsonField<Long>,
            private val defaultDatasetId: JsonField<String>,
            private val description: JsonField<String>,
            private val endTime: JsonField<OffsetDateTime>,
            private val errorRate: JsonField<Double>,
            private val exampleCount: JsonField<Long>,
            private val extra: JsonValue,
            private val feedbackStats: JsonValue,
            private val firstTokenP50: JsonField<Double>,
            private val firstTokenP99: JsonField<Double>,
            private val lastRunStartTime: JsonField<OffsetDateTime>,
            private val lastRunStartTimeLive: JsonField<OffsetDateTime>,
            private val latencyP50: JsonField<Double>,
            private val latencyP99: JsonField<Double>,
            private val maxStartTime: JsonField<OffsetDateTime>,
            private val minStartTime: JsonField<OffsetDateTime>,
            private val name: JsonField<String>,
            private val promptCost: JsonField<String>,
            private val promptTokens: JsonField<Long>,
            private val referenceDatasetId: JsonField<String>,
            private val runCount: JsonField<Long>,
            private val runFacets: JsonField<List<JsonValue>>,
            private val sessionFeedbackStats: JsonValue,
            private val startTime: JsonField<OffsetDateTime>,
            private val streamingRate: JsonField<Double>,
            private val testRunNumber: JsonField<Long>,
            private val totalCost: JsonField<String>,
            private val totalTokens: JsonField<Long>,
            private val traceTier: JsonField<TraceTier>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("filter")
                @ExcludeMissing
                filter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tenant_id")
                @ExcludeMissing
                tenantId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("completion_cost")
                @ExcludeMissing
                completionCost: JsonField<String> = JsonMissing.of(),
                @JsonProperty("completion_tokens")
                @ExcludeMissing
                completionTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("default_dataset_id")
                @ExcludeMissing
                defaultDatasetId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("end_time")
                @ExcludeMissing
                endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("error_rate")
                @ExcludeMissing
                errorRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("example_count")
                @ExcludeMissing
                exampleCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("extra") @ExcludeMissing extra: JsonValue = JsonMissing.of(),
                @JsonProperty("feedback_stats")
                @ExcludeMissing
                feedbackStats: JsonValue = JsonMissing.of(),
                @JsonProperty("first_token_p50")
                @ExcludeMissing
                firstTokenP50: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("first_token_p99")
                @ExcludeMissing
                firstTokenP99: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("last_run_start_time")
                @ExcludeMissing
                lastRunStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("last_run_start_time_live")
                @ExcludeMissing
                lastRunStartTimeLive: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("latency_p50")
                @ExcludeMissing
                latencyP50: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("latency_p99")
                @ExcludeMissing
                latencyP99: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("max_start_time")
                @ExcludeMissing
                maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("min_start_time")
                @ExcludeMissing
                minStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("prompt_cost")
                @ExcludeMissing
                promptCost: JsonField<String> = JsonMissing.of(),
                @JsonProperty("prompt_tokens")
                @ExcludeMissing
                promptTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reference_dataset_id")
                @ExcludeMissing
                referenceDatasetId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("run_count")
                @ExcludeMissing
                runCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("run_facets")
                @ExcludeMissing
                runFacets: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("session_feedback_stats")
                @ExcludeMissing
                sessionFeedbackStats: JsonValue = JsonMissing.of(),
                @JsonProperty("start_time")
                @ExcludeMissing
                startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("streaming_rate")
                @ExcludeMissing
                streamingRate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("test_run_number")
                @ExcludeMissing
                testRunNumber: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("total_cost")
                @ExcludeMissing
                totalCost: JsonField<String> = JsonMissing.of(),
                @JsonProperty("total_tokens")
                @ExcludeMissing
                totalTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("trace_tier")
                @ExcludeMissing
                traceTier: JsonField<TraceTier> = JsonMissing.of(),
            ) : this(
                id,
                filter,
                tenantId,
                completionCost,
                completionTokens,
                defaultDatasetId,
                description,
                endTime,
                errorRate,
                exampleCount,
                extra,
                feedbackStats,
                firstTokenP50,
                firstTokenP99,
                lastRunStartTime,
                lastRunStartTimeLive,
                latencyP50,
                latencyP99,
                maxStartTime,
                minStartTime,
                name,
                promptCost,
                promptTokens,
                referenceDatasetId,
                runCount,
                runFacets,
                sessionFeedbackStats,
                startTime,
                streamingRate,
                testRunNumber,
                totalCost,
                totalTokens,
                traceTier,
                mutableMapOf(),
            )

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun filter(): String = filter.getRequired("filter")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tenantId(): String = tenantId.getRequired("tenant_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun completionCost(): Optional<String> = completionCost.getOptional("completion_cost")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun completionTokens(): Optional<Long> =
                completionTokens.getOptional("completion_tokens")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun defaultDatasetId(): Optional<String> =
                defaultDatasetId.getOptional("default_dataset_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun errorRate(): Optional<Double> = errorRate.getOptional("error_rate")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun exampleCount(): Optional<Long> = exampleCount.getOptional("example_count")

            @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonValue = extra

            @JsonProperty("feedback_stats")
            @ExcludeMissing
            fun _feedbackStats(): JsonValue = feedbackStats

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun firstTokenP50(): Optional<Double> = firstTokenP50.getOptional("first_token_p50")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun firstTokenP99(): Optional<Double> = firstTokenP99.getOptional("first_token_p99")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun lastRunStartTime(): Optional<OffsetDateTime> =
                lastRunStartTime.getOptional("last_run_start_time")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun lastRunStartTimeLive(): Optional<OffsetDateTime> =
                lastRunStartTimeLive.getOptional("last_run_start_time_live")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun latencyP50(): Optional<Double> = latencyP50.getOptional("latency_p50")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun latencyP99(): Optional<Double> = latencyP99.getOptional("latency_p99")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun maxStartTime(): Optional<OffsetDateTime> =
                maxStartTime.getOptional("max_start_time")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun minStartTime(): Optional<OffsetDateTime> =
                minStartTime.getOptional("min_start_time")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun promptCost(): Optional<String> = promptCost.getOptional("prompt_cost")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun promptTokens(): Optional<Long> = promptTokens.getOptional("prompt_tokens")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun referenceDatasetId(): Optional<String> =
                referenceDatasetId.getOptional("reference_dataset_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun runCount(): Optional<Long> = runCount.getOptional("run_count")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun runFacets(): Optional<List<JsonValue>> = runFacets.getOptional("run_facets")

            @JsonProperty("session_feedback_stats")
            @ExcludeMissing
            fun _sessionFeedbackStats(): JsonValue = sessionFeedbackStats

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun streamingRate(): Optional<Double> = streamingRate.getOptional("streaming_rate")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun testRunNumber(): Optional<Long> = testRunNumber.getOptional("test_run_number")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun totalCost(): Optional<String> = totalCost.getOptional("total_cost")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun totalTokens(): Optional<Long> = totalTokens.getOptional("total_tokens")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun traceTier(): Optional<TraceTier> = traceTier.getOptional("trace_tier")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [filter].
             *
             * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

            /**
             * Returns the raw JSON value of [tenantId].
             *
             * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

            /**
             * Returns the raw JSON value of [completionCost].
             *
             * Unlike [completionCost], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("completion_cost")
            @ExcludeMissing
            fun _completionCost(): JsonField<String> = completionCost

            /**
             * Returns the raw JSON value of [completionTokens].
             *
             * Unlike [completionTokens], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("completion_tokens")
            @ExcludeMissing
            fun _completionTokens(): JsonField<Long> = completionTokens

            /**
             * Returns the raw JSON value of [defaultDatasetId].
             *
             * Unlike [defaultDatasetId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("default_dataset_id")
            @ExcludeMissing
            fun _defaultDatasetId(): JsonField<String> = defaultDatasetId

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [endTime].
             *
             * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("end_time")
            @ExcludeMissing
            fun _endTime(): JsonField<OffsetDateTime> = endTime

            /**
             * Returns the raw JSON value of [errorRate].
             *
             * Unlike [errorRate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("error_rate")
            @ExcludeMissing
            fun _errorRate(): JsonField<Double> = errorRate

            /**
             * Returns the raw JSON value of [exampleCount].
             *
             * Unlike [exampleCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("example_count")
            @ExcludeMissing
            fun _exampleCount(): JsonField<Long> = exampleCount

            /**
             * Returns the raw JSON value of [firstTokenP50].
             *
             * Unlike [firstTokenP50], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("first_token_p50")
            @ExcludeMissing
            fun _firstTokenP50(): JsonField<Double> = firstTokenP50

            /**
             * Returns the raw JSON value of [firstTokenP99].
             *
             * Unlike [firstTokenP99], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("first_token_p99")
            @ExcludeMissing
            fun _firstTokenP99(): JsonField<Double> = firstTokenP99

            /**
             * Returns the raw JSON value of [lastRunStartTime].
             *
             * Unlike [lastRunStartTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("last_run_start_time")
            @ExcludeMissing
            fun _lastRunStartTime(): JsonField<OffsetDateTime> = lastRunStartTime

            /**
             * Returns the raw JSON value of [lastRunStartTimeLive].
             *
             * Unlike [lastRunStartTimeLive], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("last_run_start_time_live")
            @ExcludeMissing
            fun _lastRunStartTimeLive(): JsonField<OffsetDateTime> = lastRunStartTimeLive

            /**
             * Returns the raw JSON value of [latencyP50].
             *
             * Unlike [latencyP50], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("latency_p50")
            @ExcludeMissing
            fun _latencyP50(): JsonField<Double> = latencyP50

            /**
             * Returns the raw JSON value of [latencyP99].
             *
             * Unlike [latencyP99], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("latency_p99")
            @ExcludeMissing
            fun _latencyP99(): JsonField<Double> = latencyP99

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
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [promptCost].
             *
             * Unlike [promptCost], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("prompt_cost")
            @ExcludeMissing
            fun _promptCost(): JsonField<String> = promptCost

            /**
             * Returns the raw JSON value of [promptTokens].
             *
             * Unlike [promptTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("prompt_tokens")
            @ExcludeMissing
            fun _promptTokens(): JsonField<Long> = promptTokens

            /**
             * Returns the raw JSON value of [referenceDatasetId].
             *
             * Unlike [referenceDatasetId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("reference_dataset_id")
            @ExcludeMissing
            fun _referenceDatasetId(): JsonField<String> = referenceDatasetId

            /**
             * Returns the raw JSON value of [runCount].
             *
             * Unlike [runCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("run_count") @ExcludeMissing fun _runCount(): JsonField<Long> = runCount

            /**
             * Returns the raw JSON value of [runFacets].
             *
             * Unlike [runFacets], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("run_facets")
            @ExcludeMissing
            fun _runFacets(): JsonField<List<JsonValue>> = runFacets

            /**
             * Returns the raw JSON value of [startTime].
             *
             * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_time")
            @ExcludeMissing
            fun _startTime(): JsonField<OffsetDateTime> = startTime

            /**
             * Returns the raw JSON value of [streamingRate].
             *
             * Unlike [streamingRate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("streaming_rate")
            @ExcludeMissing
            fun _streamingRate(): JsonField<Double> = streamingRate

            /**
             * Returns the raw JSON value of [testRunNumber].
             *
             * Unlike [testRunNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("test_run_number")
            @ExcludeMissing
            fun _testRunNumber(): JsonField<Long> = testRunNumber

            /**
             * Returns the raw JSON value of [totalCost].
             *
             * Unlike [totalCost], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("total_cost")
            @ExcludeMissing
            fun _totalCost(): JsonField<String> = totalCost

            /**
             * Returns the raw JSON value of [totalTokens].
             *
             * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("total_tokens")
            @ExcludeMissing
            fun _totalTokens(): JsonField<Long> = totalTokens

            /**
             * Returns the raw JSON value of [traceTier].
             *
             * Unlike [traceTier], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("trace_tier")
            @ExcludeMissing
            fun _traceTier(): JsonField<TraceTier> = traceTier

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
                 * Returns a mutable builder for constructing an instance of [Session].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .filter()
                 * .tenantId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Session]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var filter: JsonField<String>? = null
                private var tenantId: JsonField<String>? = null
                private var completionCost: JsonField<String> = JsonMissing.of()
                private var completionTokens: JsonField<Long> = JsonMissing.of()
                private var defaultDatasetId: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var errorRate: JsonField<Double> = JsonMissing.of()
                private var exampleCount: JsonField<Long> = JsonMissing.of()
                private var extra: JsonValue = JsonMissing.of()
                private var feedbackStats: JsonValue = JsonMissing.of()
                private var firstTokenP50: JsonField<Double> = JsonMissing.of()
                private var firstTokenP99: JsonField<Double> = JsonMissing.of()
                private var lastRunStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var lastRunStartTimeLive: JsonField<OffsetDateTime> = JsonMissing.of()
                private var latencyP50: JsonField<Double> = JsonMissing.of()
                private var latencyP99: JsonField<Double> = JsonMissing.of()
                private var maxStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var minStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var promptCost: JsonField<String> = JsonMissing.of()
                private var promptTokens: JsonField<Long> = JsonMissing.of()
                private var referenceDatasetId: JsonField<String> = JsonMissing.of()
                private var runCount: JsonField<Long> = JsonMissing.of()
                private var runFacets: JsonField<MutableList<JsonValue>>? = null
                private var sessionFeedbackStats: JsonValue = JsonMissing.of()
                private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var streamingRate: JsonField<Double> = JsonMissing.of()
                private var testRunNumber: JsonField<Long> = JsonMissing.of()
                private var totalCost: JsonField<String> = JsonMissing.of()
                private var totalTokens: JsonField<Long> = JsonMissing.of()
                private var traceTier: JsonField<TraceTier> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(session: Session) = apply {
                    id = session.id
                    filter = session.filter
                    tenantId = session.tenantId
                    completionCost = session.completionCost
                    completionTokens = session.completionTokens
                    defaultDatasetId = session.defaultDatasetId
                    description = session.description
                    endTime = session.endTime
                    errorRate = session.errorRate
                    exampleCount = session.exampleCount
                    extra = session.extra
                    feedbackStats = session.feedbackStats
                    firstTokenP50 = session.firstTokenP50
                    firstTokenP99 = session.firstTokenP99
                    lastRunStartTime = session.lastRunStartTime
                    lastRunStartTimeLive = session.lastRunStartTimeLive
                    latencyP50 = session.latencyP50
                    latencyP99 = session.latencyP99
                    maxStartTime = session.maxStartTime
                    minStartTime = session.minStartTime
                    name = session.name
                    promptCost = session.promptCost
                    promptTokens = session.promptTokens
                    referenceDatasetId = session.referenceDatasetId
                    runCount = session.runCount
                    runFacets = session.runFacets.map { it.toMutableList() }
                    sessionFeedbackStats = session.sessionFeedbackStats
                    startTime = session.startTime
                    streamingRate = session.streamingRate
                    testRunNumber = session.testRunNumber
                    totalCost = session.totalCost
                    totalTokens = session.totalTokens
                    traceTier = session.traceTier
                    additionalProperties = session.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun filter(filter: String) = filter(JsonField.of(filter))

                /**
                 * Sets [Builder.filter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filter] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filter(filter: JsonField<String>) = apply { this.filter = filter }

                fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

                /**
                 * Sets [Builder.tenantId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tenantId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

                fun completionCost(completionCost: String?) =
                    completionCost(JsonField.ofNullable(completionCost))

                /**
                 * Alias for calling [Builder.completionCost] with `completionCost.orElse(null)`.
                 */
                fun completionCost(completionCost: Optional<String>) =
                    completionCost(completionCost.getOrNull())

                /**
                 * Sets [Builder.completionCost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.completionCost] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun completionCost(completionCost: JsonField<String>) = apply {
                    this.completionCost = completionCost
                }

                fun completionTokens(completionTokens: Long?) =
                    completionTokens(JsonField.ofNullable(completionTokens))

                /**
                 * Alias for [Builder.completionTokens].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun completionTokens(completionTokens: Long) =
                    completionTokens(completionTokens as Long?)

                /**
                 * Alias for calling [Builder.completionTokens] with
                 * `completionTokens.orElse(null)`.
                 */
                fun completionTokens(completionTokens: Optional<Long>) =
                    completionTokens(completionTokens.getOrNull())

                /**
                 * Sets [Builder.completionTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.completionTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun completionTokens(completionTokens: JsonField<Long>) = apply {
                    this.completionTokens = completionTokens
                }

                fun defaultDatasetId(defaultDatasetId: String?) =
                    defaultDatasetId(JsonField.ofNullable(defaultDatasetId))

                /**
                 * Alias for calling [Builder.defaultDatasetId] with
                 * `defaultDatasetId.orElse(null)`.
                 */
                fun defaultDatasetId(defaultDatasetId: Optional<String>) =
                    defaultDatasetId(defaultDatasetId.getOrNull())

                /**
                 * Sets [Builder.defaultDatasetId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.defaultDatasetId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun defaultDatasetId(defaultDatasetId: JsonField<String>) = apply {
                    this.defaultDatasetId = defaultDatasetId
                }

                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** Alias for calling [Builder.description] with `description.orElse(null)`. */
                fun description(description: Optional<String>) =
                    description(description.getOrNull())

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun endTime(endTime: OffsetDateTime?) = endTime(JsonField.ofNullable(endTime))

                /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
                fun endTime(endTime: Optional<OffsetDateTime>) = endTime(endTime.getOrNull())

                /**
                 * Sets [Builder.endTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

                fun errorRate(errorRate: Double?) = errorRate(JsonField.ofNullable(errorRate))

                /**
                 * Alias for [Builder.errorRate].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun errorRate(errorRate: Double) = errorRate(errorRate as Double?)

                /** Alias for calling [Builder.errorRate] with `errorRate.orElse(null)`. */
                fun errorRate(errorRate: Optional<Double>) = errorRate(errorRate.getOrNull())

                /**
                 * Sets [Builder.errorRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorRate] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorRate(errorRate: JsonField<Double>) = apply { this.errorRate = errorRate }

                fun exampleCount(exampleCount: Long?) =
                    exampleCount(JsonField.ofNullable(exampleCount))

                /**
                 * Alias for [Builder.exampleCount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun exampleCount(exampleCount: Long) = exampleCount(exampleCount as Long?)

                /** Alias for calling [Builder.exampleCount] with `exampleCount.orElse(null)`. */
                fun exampleCount(exampleCount: Optional<Long>) =
                    exampleCount(exampleCount.getOrNull())

                /**
                 * Sets [Builder.exampleCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.exampleCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun exampleCount(exampleCount: JsonField<Long>) = apply {
                    this.exampleCount = exampleCount
                }

                fun extra(extra: JsonValue) = apply { this.extra = extra }

                fun feedbackStats(feedbackStats: JsonValue) = apply {
                    this.feedbackStats = feedbackStats
                }

                fun firstTokenP50(firstTokenP50: Double?) =
                    firstTokenP50(JsonField.ofNullable(firstTokenP50))

                /**
                 * Alias for [Builder.firstTokenP50].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun firstTokenP50(firstTokenP50: Double) = firstTokenP50(firstTokenP50 as Double?)

                /** Alias for calling [Builder.firstTokenP50] with `firstTokenP50.orElse(null)`. */
                fun firstTokenP50(firstTokenP50: Optional<Double>) =
                    firstTokenP50(firstTokenP50.getOrNull())

                /**
                 * Sets [Builder.firstTokenP50] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.firstTokenP50] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun firstTokenP50(firstTokenP50: JsonField<Double>) = apply {
                    this.firstTokenP50 = firstTokenP50
                }

                fun firstTokenP99(firstTokenP99: Double?) =
                    firstTokenP99(JsonField.ofNullable(firstTokenP99))

                /**
                 * Alias for [Builder.firstTokenP99].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun firstTokenP99(firstTokenP99: Double) = firstTokenP99(firstTokenP99 as Double?)

                /** Alias for calling [Builder.firstTokenP99] with `firstTokenP99.orElse(null)`. */
                fun firstTokenP99(firstTokenP99: Optional<Double>) =
                    firstTokenP99(firstTokenP99.getOrNull())

                /**
                 * Sets [Builder.firstTokenP99] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.firstTokenP99] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun firstTokenP99(firstTokenP99: JsonField<Double>) = apply {
                    this.firstTokenP99 = firstTokenP99
                }

                fun lastRunStartTime(lastRunStartTime: OffsetDateTime?) =
                    lastRunStartTime(JsonField.ofNullable(lastRunStartTime))

                /**
                 * Alias for calling [Builder.lastRunStartTime] with
                 * `lastRunStartTime.orElse(null)`.
                 */
                fun lastRunStartTime(lastRunStartTime: Optional<OffsetDateTime>) =
                    lastRunStartTime(lastRunStartTime.getOrNull())

                /**
                 * Sets [Builder.lastRunStartTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastRunStartTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun lastRunStartTime(lastRunStartTime: JsonField<OffsetDateTime>) = apply {
                    this.lastRunStartTime = lastRunStartTime
                }

                fun lastRunStartTimeLive(lastRunStartTimeLive: OffsetDateTime?) =
                    lastRunStartTimeLive(JsonField.ofNullable(lastRunStartTimeLive))

                /**
                 * Alias for calling [Builder.lastRunStartTimeLive] with
                 * `lastRunStartTimeLive.orElse(null)`.
                 */
                fun lastRunStartTimeLive(lastRunStartTimeLive: Optional<OffsetDateTime>) =
                    lastRunStartTimeLive(lastRunStartTimeLive.getOrNull())

                /**
                 * Sets [Builder.lastRunStartTimeLive] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastRunStartTimeLive] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun lastRunStartTimeLive(lastRunStartTimeLive: JsonField<OffsetDateTime>) = apply {
                    this.lastRunStartTimeLive = lastRunStartTimeLive
                }

                fun latencyP50(latencyP50: Double?) = latencyP50(JsonField.ofNullable(latencyP50))

                /**
                 * Alias for [Builder.latencyP50].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun latencyP50(latencyP50: Double) = latencyP50(latencyP50 as Double?)

                /** Alias for calling [Builder.latencyP50] with `latencyP50.orElse(null)`. */
                fun latencyP50(latencyP50: Optional<Double>) = latencyP50(latencyP50.getOrNull())

                /**
                 * Sets [Builder.latencyP50] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latencyP50] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun latencyP50(latencyP50: JsonField<Double>) = apply {
                    this.latencyP50 = latencyP50
                }

                fun latencyP99(latencyP99: Double?) = latencyP99(JsonField.ofNullable(latencyP99))

                /**
                 * Alias for [Builder.latencyP99].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun latencyP99(latencyP99: Double) = latencyP99(latencyP99 as Double?)

                /** Alias for calling [Builder.latencyP99] with `latencyP99.orElse(null)`. */
                fun latencyP99(latencyP99: Optional<Double>) = latencyP99(latencyP99.getOrNull())

                /**
                 * Sets [Builder.latencyP99] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latencyP99] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun latencyP99(latencyP99: JsonField<Double>) = apply {
                    this.latencyP99 = latencyP99
                }

                fun maxStartTime(maxStartTime: OffsetDateTime?) =
                    maxStartTime(JsonField.ofNullable(maxStartTime))

                /** Alias for calling [Builder.maxStartTime] with `maxStartTime.orElse(null)`. */
                fun maxStartTime(maxStartTime: Optional<OffsetDateTime>) =
                    maxStartTime(maxStartTime.getOrNull())

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

                fun minStartTime(minStartTime: OffsetDateTime?) =
                    minStartTime(JsonField.ofNullable(minStartTime))

                /** Alias for calling [Builder.minStartTime] with `minStartTime.orElse(null)`. */
                fun minStartTime(minStartTime: Optional<OffsetDateTime>) =
                    minStartTime(minStartTime.getOrNull())

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

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun promptCost(promptCost: String?) = promptCost(JsonField.ofNullable(promptCost))

                /** Alias for calling [Builder.promptCost] with `promptCost.orElse(null)`. */
                fun promptCost(promptCost: Optional<String>) = promptCost(promptCost.getOrNull())

                /**
                 * Sets [Builder.promptCost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.promptCost] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun promptCost(promptCost: JsonField<String>) = apply {
                    this.promptCost = promptCost
                }

                fun promptTokens(promptTokens: Long?) =
                    promptTokens(JsonField.ofNullable(promptTokens))

                /**
                 * Alias for [Builder.promptTokens].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun promptTokens(promptTokens: Long) = promptTokens(promptTokens as Long?)

                /** Alias for calling [Builder.promptTokens] with `promptTokens.orElse(null)`. */
                fun promptTokens(promptTokens: Optional<Long>) =
                    promptTokens(promptTokens.getOrNull())

                /**
                 * Sets [Builder.promptTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.promptTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun promptTokens(promptTokens: JsonField<Long>) = apply {
                    this.promptTokens = promptTokens
                }

                fun referenceDatasetId(referenceDatasetId: String?) =
                    referenceDatasetId(JsonField.ofNullable(referenceDatasetId))

                /**
                 * Alias for calling [Builder.referenceDatasetId] with
                 * `referenceDatasetId.orElse(null)`.
                 */
                fun referenceDatasetId(referenceDatasetId: Optional<String>) =
                    referenceDatasetId(referenceDatasetId.getOrNull())

                /**
                 * Sets [Builder.referenceDatasetId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.referenceDatasetId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun referenceDatasetId(referenceDatasetId: JsonField<String>) = apply {
                    this.referenceDatasetId = referenceDatasetId
                }

                fun runCount(runCount: Long?) = runCount(JsonField.ofNullable(runCount))

                /**
                 * Alias for [Builder.runCount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun runCount(runCount: Long) = runCount(runCount as Long?)

                /** Alias for calling [Builder.runCount] with `runCount.orElse(null)`. */
                fun runCount(runCount: Optional<Long>) = runCount(runCount.getOrNull())

                /**
                 * Sets [Builder.runCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.runCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun runCount(runCount: JsonField<Long>) = apply { this.runCount = runCount }

                fun runFacets(runFacets: List<JsonValue>?) =
                    runFacets(JsonField.ofNullable(runFacets))

                /** Alias for calling [Builder.runFacets] with `runFacets.orElse(null)`. */
                fun runFacets(runFacets: Optional<List<JsonValue>>) =
                    runFacets(runFacets.getOrNull())

                /**
                 * Sets [Builder.runFacets] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.runFacets] with a well-typed `List<JsonValue>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun runFacets(runFacets: JsonField<List<JsonValue>>) = apply {
                    this.runFacets = runFacets.map { it.toMutableList() }
                }

                /**
                 * Adds a single [JsonValue] to [runFacets].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRunFacet(runFacet: JsonValue) = apply {
                    runFacets =
                        (runFacets ?: JsonField.of(mutableListOf())).also {
                            checkKnown("runFacets", it).add(runFacet)
                        }
                }

                fun sessionFeedbackStats(sessionFeedbackStats: JsonValue) = apply {
                    this.sessionFeedbackStats = sessionFeedbackStats
                }

                fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

                /**
                 * Sets [Builder.startTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                    this.startTime = startTime
                }

                fun streamingRate(streamingRate: Double?) =
                    streamingRate(JsonField.ofNullable(streamingRate))

                /**
                 * Alias for [Builder.streamingRate].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun streamingRate(streamingRate: Double) = streamingRate(streamingRate as Double?)

                /** Alias for calling [Builder.streamingRate] with `streamingRate.orElse(null)`. */
                fun streamingRate(streamingRate: Optional<Double>) =
                    streamingRate(streamingRate.getOrNull())

                /**
                 * Sets [Builder.streamingRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.streamingRate] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun streamingRate(streamingRate: JsonField<Double>) = apply {
                    this.streamingRate = streamingRate
                }

                fun testRunNumber(testRunNumber: Long?) =
                    testRunNumber(JsonField.ofNullable(testRunNumber))

                /**
                 * Alias for [Builder.testRunNumber].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun testRunNumber(testRunNumber: Long) = testRunNumber(testRunNumber as Long?)

                /** Alias for calling [Builder.testRunNumber] with `testRunNumber.orElse(null)`. */
                fun testRunNumber(testRunNumber: Optional<Long>) =
                    testRunNumber(testRunNumber.getOrNull())

                /**
                 * Sets [Builder.testRunNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.testRunNumber] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun testRunNumber(testRunNumber: JsonField<Long>) = apply {
                    this.testRunNumber = testRunNumber
                }

                fun totalCost(totalCost: String?) = totalCost(JsonField.ofNullable(totalCost))

                /** Alias for calling [Builder.totalCost] with `totalCost.orElse(null)`. */
                fun totalCost(totalCost: Optional<String>) = totalCost(totalCost.getOrNull())

                /**
                 * Sets [Builder.totalCost] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalCost] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalCost(totalCost: JsonField<String>) = apply { this.totalCost = totalCost }

                fun totalTokens(totalTokens: Long?) = totalTokens(JsonField.ofNullable(totalTokens))

                /**
                 * Alias for [Builder.totalTokens].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun totalTokens(totalTokens: Long) = totalTokens(totalTokens as Long?)

                /** Alias for calling [Builder.totalTokens] with `totalTokens.orElse(null)`. */
                fun totalTokens(totalTokens: Optional<Long>) = totalTokens(totalTokens.getOrNull())

                /**
                 * Sets [Builder.totalTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalTokens(totalTokens: JsonField<Long>) = apply {
                    this.totalTokens = totalTokens
                }

                fun traceTier(traceTier: TraceTier?) = traceTier(JsonField.ofNullable(traceTier))

                /** Alias for calling [Builder.traceTier] with `traceTier.orElse(null)`. */
                fun traceTier(traceTier: Optional<TraceTier>) = traceTier(traceTier.getOrNull())

                /**
                 * Sets [Builder.traceTier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.traceTier] with a well-typed [TraceTier] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun traceTier(traceTier: JsonField<TraceTier>) = apply {
                    this.traceTier = traceTier
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
                 * Returns an immutable instance of [Session].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .filter()
                 * .tenantId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Session =
                    Session(
                        checkRequired("id", id),
                        checkRequired("filter", filter),
                        checkRequired("tenantId", tenantId),
                        completionCost,
                        completionTokens,
                        defaultDatasetId,
                        description,
                        endTime,
                        errorRate,
                        exampleCount,
                        extra,
                        feedbackStats,
                        firstTokenP50,
                        firstTokenP99,
                        lastRunStartTime,
                        lastRunStartTimeLive,
                        latencyP50,
                        latencyP99,
                        maxStartTime,
                        minStartTime,
                        name,
                        promptCost,
                        promptTokens,
                        referenceDatasetId,
                        runCount,
                        (runFacets ?: JsonMissing.of()).map { it.toImmutable() },
                        sessionFeedbackStats,
                        startTime,
                        streamingRate,
                        testRunNumber,
                        totalCost,
                        totalTokens,
                        traceTier,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Session = apply {
                if (validated) {
                    return@apply
                }

                id()
                filter()
                tenantId()
                completionCost()
                completionTokens()
                defaultDatasetId()
                description()
                endTime()
                errorRate()
                exampleCount()
                firstTokenP50()
                firstTokenP99()
                lastRunStartTime()
                lastRunStartTimeLive()
                latencyP50()
                latencyP99()
                maxStartTime()
                minStartTime()
                name()
                promptCost()
                promptTokens()
                referenceDatasetId()
                runCount()
                runFacets()
                startTime()
                streamingRate()
                testRunNumber()
                totalCost()
                totalTokens()
                traceTier().ifPresent { it.validate() }
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (filter.asKnown().isPresent) 1 else 0) +
                    (if (tenantId.asKnown().isPresent) 1 else 0) +
                    (if (completionCost.asKnown().isPresent) 1 else 0) +
                    (if (completionTokens.asKnown().isPresent) 1 else 0) +
                    (if (defaultDatasetId.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (endTime.asKnown().isPresent) 1 else 0) +
                    (if (errorRate.asKnown().isPresent) 1 else 0) +
                    (if (exampleCount.asKnown().isPresent) 1 else 0) +
                    (if (firstTokenP50.asKnown().isPresent) 1 else 0) +
                    (if (firstTokenP99.asKnown().isPresent) 1 else 0) +
                    (if (lastRunStartTime.asKnown().isPresent) 1 else 0) +
                    (if (lastRunStartTimeLive.asKnown().isPresent) 1 else 0) +
                    (if (latencyP50.asKnown().isPresent) 1 else 0) +
                    (if (latencyP99.asKnown().isPresent) 1 else 0) +
                    (if (maxStartTime.asKnown().isPresent) 1 else 0) +
                    (if (minStartTime.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (promptCost.asKnown().isPresent) 1 else 0) +
                    (if (promptTokens.asKnown().isPresent) 1 else 0) +
                    (if (referenceDatasetId.asKnown().isPresent) 1 else 0) +
                    (if (runCount.asKnown().isPresent) 1 else 0) +
                    (runFacets.asKnown().getOrNull()?.size ?: 0) +
                    (if (startTime.asKnown().isPresent) 1 else 0) +
                    (if (streamingRate.asKnown().isPresent) 1 else 0) +
                    (if (testRunNumber.asKnown().isPresent) 1 else 0) +
                    (if (totalCost.asKnown().isPresent) 1 else 0) +
                    (if (totalTokens.asKnown().isPresent) 1 else 0) +
                    (traceTier.asKnown().getOrNull()?.validity() ?: 0)

            class TraceTier @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val LONGLIVED = of("longlived")

                    @JvmField val SHORTLIVED = of("shortlived")

                    @JvmStatic fun of(value: String) = TraceTier(JsonField.of(value))
                }

                /** An enum containing [TraceTier]'s known values. */
                enum class Known {
                    LONGLIVED,
                    SHORTLIVED,
                }

                /**
                 * An enum containing [TraceTier]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [TraceTier] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LONGLIVED,
                    SHORTLIVED,
                    /**
                     * An enum member indicating that [TraceTier] was instantiated with an unknown
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
                        LONGLIVED -> Value.LONGLIVED
                        SHORTLIVED -> Value.SHORTLIVED
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
                        LONGLIVED -> Known.LONGLIVED
                        SHORTLIVED -> Known.SHORTLIVED
                        else -> throw LangChainInvalidDataException("Unknown TraceTier: $value")
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

                fun validate(): TraceTier = apply {
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

                    return other is TraceTier && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Session &&
                    id == other.id &&
                    filter == other.filter &&
                    tenantId == other.tenantId &&
                    completionCost == other.completionCost &&
                    completionTokens == other.completionTokens &&
                    defaultDatasetId == other.defaultDatasetId &&
                    description == other.description &&
                    endTime == other.endTime &&
                    errorRate == other.errorRate &&
                    exampleCount == other.exampleCount &&
                    extra == other.extra &&
                    feedbackStats == other.feedbackStats &&
                    firstTokenP50 == other.firstTokenP50 &&
                    firstTokenP99 == other.firstTokenP99 &&
                    lastRunStartTime == other.lastRunStartTime &&
                    lastRunStartTimeLive == other.lastRunStartTimeLive &&
                    latencyP50 == other.latencyP50 &&
                    latencyP99 == other.latencyP99 &&
                    maxStartTime == other.maxStartTime &&
                    minStartTime == other.minStartTime &&
                    name == other.name &&
                    promptCost == other.promptCost &&
                    promptTokens == other.promptTokens &&
                    referenceDatasetId == other.referenceDatasetId &&
                    runCount == other.runCount &&
                    runFacets == other.runFacets &&
                    sessionFeedbackStats == other.sessionFeedbackStats &&
                    startTime == other.startTime &&
                    streamingRate == other.streamingRate &&
                    testRunNumber == other.testRunNumber &&
                    totalCost == other.totalCost &&
                    totalTokens == other.totalTokens &&
                    traceTier == other.traceTier &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    filter,
                    tenantId,
                    completionCost,
                    completionTokens,
                    defaultDatasetId,
                    description,
                    endTime,
                    errorRate,
                    exampleCount,
                    extra,
                    feedbackStats,
                    firstTokenP50,
                    firstTokenP99,
                    lastRunStartTime,
                    lastRunStartTimeLive,
                    latencyP50,
                    latencyP99,
                    maxStartTime,
                    minStartTime,
                    name,
                    promptCost,
                    promptTokens,
                    referenceDatasetId,
                    runCount,
                    runFacets,
                    sessionFeedbackStats,
                    startTime,
                    streamingRate,
                    testRunNumber,
                    totalCost,
                    totalTokens,
                    traceTier,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Session{id=$id, filter=$filter, tenantId=$tenantId, completionCost=$completionCost, completionTokens=$completionTokens, defaultDatasetId=$defaultDatasetId, description=$description, endTime=$endTime, errorRate=$errorRate, exampleCount=$exampleCount, extra=$extra, feedbackStats=$feedbackStats, firstTokenP50=$firstTokenP50, firstTokenP99=$firstTokenP99, lastRunStartTime=$lastRunStartTime, lastRunStartTimeLive=$lastRunStartTimeLive, latencyP50=$latencyP50, latencyP99=$latencyP99, maxStartTime=$maxStartTime, minStartTime=$minStartTime, name=$name, promptCost=$promptCost, promptTokens=$promptTokens, referenceDatasetId=$referenceDatasetId, runCount=$runCount, runFacets=$runFacets, sessionFeedbackStats=$sessionFeedbackStats, startTime=$startTime, streamingRate=$streamingRate, testRunNumber=$testRunNumber, totalCost=$totalCost, totalTokens=$totalTokens, traceTier=$traceTier, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Group &&
                exampleCount == other.exampleCount &&
                examples == other.examples &&
                filter == other.filter &&
                groupKey == other.groupKey &&
                sessions == other.sessions &&
                completionCost == other.completionCost &&
                completionTokens == other.completionTokens &&
                count == other.count &&
                errorRate == other.errorRate &&
                feedbackStats == other.feedbackStats &&
                latencyP50 == other.latencyP50 &&
                latencyP99 == other.latencyP99 &&
                maxStartTime == other.maxStartTime &&
                minStartTime == other.minStartTime &&
                promptCost == other.promptCost &&
                promptTokens == other.promptTokens &&
                totalCost == other.totalCost &&
                totalTokens == other.totalTokens &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                exampleCount,
                examples,
                filter,
                groupKey,
                sessions,
                completionCost,
                completionTokens,
                count,
                errorRate,
                feedbackStats,
                latencyP50,
                latencyP99,
                maxStartTime,
                minStartTime,
                promptCost,
                promptTokens,
                totalCost,
                totalTokens,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Group{exampleCount=$exampleCount, examples=$examples, filter=$filter, groupKey=$groupKey, sessions=$sessions, completionCost=$completionCost, completionTokens=$completionTokens, count=$count, errorRate=$errorRate, feedbackStats=$feedbackStats, latencyP50=$latencyP50, latencyP99=$latencyP99, maxStartTime=$maxStartTime, minStartTime=$minStartTime, promptCost=$promptCost, promptTokens=$promptTokens, totalCost=$totalCost, totalTokens=$totalTokens, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GroupRunsResponse &&
            groups == other.groups &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(groups, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GroupRunsResponse{groups=$groups, additionalProperties=$additionalProperties}"
}
