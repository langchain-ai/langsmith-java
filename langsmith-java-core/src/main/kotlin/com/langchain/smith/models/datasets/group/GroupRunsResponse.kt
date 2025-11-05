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
import com.langchain.smith.models.datasets.runs.ExampleWithRuns
import com.langchain.smith.models.datasets.runs.ExampleWithRunsCh
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Grouped examples with runs. */
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

    /** Group of examples with runs. */
    class Group
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val examples: JsonField<Examples>,
        private val filter: JsonField<String>,
        private val groupKey: JsonValue,
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
            @JsonProperty("examples")
            @ExcludeMissing
            examples: JsonField<Examples> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("group_key") @ExcludeMissing groupKey: JsonValue = JsonMissing.of(),
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
            examples,
            filter,
            groupKey,
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
        fun examples(): Examples = examples.getRequired("examples")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filter(): String = filter.getRequired("filter")

        @JsonProperty("group_key") @ExcludeMissing fun _groupKey(): JsonValue = groupKey

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
         * Returns the raw JSON value of [examples].
         *
         * Unlike [examples], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("examples") @ExcludeMissing fun _examples(): JsonField<Examples> = examples

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

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
             * .examples()
             * .filter()
             * .groupKey()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Group]. */
        class Builder internal constructor() {

            private var examples: JsonField<Examples>? = null
            private var filter: JsonField<String>? = null
            private var groupKey: JsonValue? = null
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
                examples = group.examples
                filter = group.filter
                groupKey = group.groupKey
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

            fun examples(examples: Examples) = examples(JsonField.of(examples))

            /**
             * Sets [Builder.examples] to an arbitrary JSON value.
             *
             * You should usually call [Builder.examples] with a well-typed [Examples] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun examples(examples: JsonField<Examples>) = apply { this.examples = examples }

            /** Alias for calling [examples] with `Examples.ofExampleWithRuns(exampleWithRuns)`. */
            fun examplesOfExampleWithRuns(exampleWithRuns: List<ExampleWithRuns>) =
                examples(Examples.ofExampleWithRuns(exampleWithRuns))

            /**
             * Alias for calling [examples] with
             * `Examples.ofExampleWithRunsChes(exampleWithRunsChes)`.
             */
            fun examplesOfExampleWithRunsChes(exampleWithRunsChes: List<ExampleWithRunsCh>) =
                examples(Examples.ofExampleWithRunsChes(exampleWithRunsChes))

            fun filter(filter: String) = filter(JsonField.of(filter))

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            fun groupKey(groupKey: JsonValue) = apply { this.groupKey = groupKey }

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
             * .examples()
             * .filter()
             * .groupKey()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Group =
                Group(
                    checkRequired("examples", examples),
                    checkRequired("filter", filter),
                    checkRequired("groupKey", groupKey),
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

            examples().validate()
            filter()
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
            (examples.asKnown().getOrNull()?.validity() ?: 0) +
                (if (filter.asKnown().isPresent) 1 else 0) +
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

        @JsonDeserialize(using = Examples.Deserializer::class)
        @JsonSerialize(using = Examples.Serializer::class)
        class Examples
        private constructor(
            private val exampleWithRuns: List<ExampleWithRuns>? = null,
            private val exampleWithRunsChes: List<ExampleWithRunsCh>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun exampleWithRuns(): Optional<List<ExampleWithRuns>> =
                Optional.ofNullable(exampleWithRuns)

            fun exampleWithRunsChes(): Optional<List<ExampleWithRunsCh>> =
                Optional.ofNullable(exampleWithRunsChes)

            fun isExampleWithRuns(): Boolean = exampleWithRuns != null

            fun isExampleWithRunsChes(): Boolean = exampleWithRunsChes != null

            fun asExampleWithRuns(): List<ExampleWithRuns> =
                exampleWithRuns.getOrThrow("exampleWithRuns")

            fun asExampleWithRunsChes(): List<ExampleWithRunsCh> =
                exampleWithRunsChes.getOrThrow("exampleWithRunsChes")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    exampleWithRuns != null -> visitor.visitExampleWithRuns(exampleWithRuns)
                    exampleWithRunsChes != null ->
                        visitor.visitExampleWithRunsChes(exampleWithRunsChes)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Examples = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitExampleWithRuns(exampleWithRuns: List<ExampleWithRuns>) {
                            exampleWithRuns.forEach { it.validate() }
                        }

                        override fun visitExampleWithRunsChes(
                            exampleWithRunsChes: List<ExampleWithRunsCh>
                        ) {
                            exampleWithRunsChes.forEach { it.validate() }
                        }
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
                        override fun visitExampleWithRuns(exampleWithRuns: List<ExampleWithRuns>) =
                            exampleWithRuns.sumOf { it.validity().toInt() }

                        override fun visitExampleWithRunsChes(
                            exampleWithRunsChes: List<ExampleWithRunsCh>
                        ) = exampleWithRunsChes.sumOf { it.validity().toInt() }

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Examples &&
                    exampleWithRuns == other.exampleWithRuns &&
                    exampleWithRunsChes == other.exampleWithRunsChes
            }

            override fun hashCode(): Int = Objects.hash(exampleWithRuns, exampleWithRunsChes)

            override fun toString(): String =
                when {
                    exampleWithRuns != null -> "Examples{exampleWithRuns=$exampleWithRuns}"
                    exampleWithRunsChes != null ->
                        "Examples{exampleWithRunsChes=$exampleWithRunsChes}"
                    _json != null -> "Examples{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Examples")
                }

            companion object {

                @JvmStatic
                fun ofExampleWithRuns(exampleWithRuns: List<ExampleWithRuns>) =
                    Examples(exampleWithRuns = exampleWithRuns.toImmutable())

                @JvmStatic
                fun ofExampleWithRunsChes(exampleWithRunsChes: List<ExampleWithRunsCh>) =
                    Examples(exampleWithRunsChes = exampleWithRunsChes.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [Examples] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitExampleWithRuns(exampleWithRuns: List<ExampleWithRuns>): T

                fun visitExampleWithRunsChes(exampleWithRunsChes: List<ExampleWithRunsCh>): T

                /**
                 * Maps an unknown variant of [Examples] to a value of type [T].
                 *
                 * An instance of [Examples] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws LangChainInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LangChainInvalidDataException("Unknown Examples: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Examples>(Examples::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Examples {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<List<ExampleWithRuns>>())?.let {
                                    Examples(exampleWithRuns = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<ExampleWithRunsCh>>())
                                    ?.let { Examples(exampleWithRunsChes = it, _json = json) },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Examples(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Examples>(Examples::class) {

                override fun serialize(
                    value: Examples,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.exampleWithRuns != null ->
                            generator.writeObject(value.exampleWithRuns)
                        value.exampleWithRunsChes != null ->
                            generator.writeObject(value.exampleWithRunsChes)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Examples")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Group &&
                examples == other.examples &&
                filter == other.filter &&
                groupKey == other.groupKey &&
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
                examples,
                filter,
                groupKey,
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
            "Group{examples=$examples, filter=$filter, groupKey=$groupKey, completionCost=$completionCost, completionTokens=$completionTokens, count=$count, errorRate=$errorRate, feedbackStats=$feedbackStats, latencyP50=$latencyP50, latencyP99=$latencyP99, maxStartTime=$maxStartTime, minStartTime=$minStartTime, promptCost=$promptCost, promptTokens=$promptTokens, totalCost=$totalCost, totalTokens=$totalTokens, additionalProperties=$additionalProperties}"
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
