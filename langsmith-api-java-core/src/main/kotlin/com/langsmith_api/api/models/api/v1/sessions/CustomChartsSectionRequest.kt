// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sessions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomChartsSectionRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val endTime: JsonField<OffsetDateTime>,
    private val groupBy: JsonField<RunStatsGroupBy>,
    private val omitData: JsonField<Boolean>,
    private val startTime: JsonField<OffsetDateTime>,
    private val stride: JsonField<TimedeltaInput>,
    private val timezone: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("group_by")
        @ExcludeMissing
        groupBy: JsonField<RunStatsGroupBy> = JsonMissing.of(),
        @JsonProperty("omit_data") @ExcludeMissing omitData: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("stride")
        @ExcludeMissing
        stride: JsonField<TimedeltaInput> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
    ) : this(endTime, groupBy, omitData, startTime, stride, timezone, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

    /**
     * Group by param for run stats.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun groupBy(): Optional<RunStatsGroupBy> = groupBy.getOptional("group_by")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun omitData(): Optional<Boolean> = omitData.getOptional("omit_data")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

    /**
     * Timedelta input.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun stride(): Optional<TimedeltaInput> = stride.getOptional("stride")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun timezone(): Optional<String> = timezone.getOptional("timezone")

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [groupBy].
     *
     * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_by") @ExcludeMissing fun _groupBy(): JsonField<RunStatsGroupBy> = groupBy

    /**
     * Returns the raw JSON value of [omitData].
     *
     * Unlike [omitData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("omit_data") @ExcludeMissing fun _omitData(): JsonField<Boolean> = omitData

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [stride].
     *
     * Unlike [stride], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stride") @ExcludeMissing fun _stride(): JsonField<TimedeltaInput> = stride

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

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
         * Returns a mutable builder for constructing an instance of [CustomChartsSectionRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChartsSectionRequest]. */
    class Builder internal constructor() {

        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var groupBy: JsonField<RunStatsGroupBy> = JsonMissing.of()
        private var omitData: JsonField<Boolean> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var stride: JsonField<TimedeltaInput> = JsonMissing.of()
        private var timezone: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customChartsSectionRequest: CustomChartsSectionRequest) = apply {
            endTime = customChartsSectionRequest.endTime
            groupBy = customChartsSectionRequest.groupBy
            omitData = customChartsSectionRequest.omitData
            startTime = customChartsSectionRequest.startTime
            stride = customChartsSectionRequest.stride
            timezone = customChartsSectionRequest.timezone
            additionalProperties = customChartsSectionRequest.additionalProperties.toMutableMap()
        }

        fun endTime(endTime: OffsetDateTime?) = endTime(JsonField.ofNullable(endTime))

        /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
        fun endTime(endTime: Optional<OffsetDateTime>) = endTime(endTime.getOrNull())

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        /** Group by param for run stats. */
        fun groupBy(groupBy: RunStatsGroupBy?) = groupBy(JsonField.ofNullable(groupBy))

        /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
        fun groupBy(groupBy: Optional<RunStatsGroupBy>) = groupBy(groupBy.getOrNull())

        /**
         * Sets [Builder.groupBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupBy] with a well-typed [RunStatsGroupBy] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun groupBy(groupBy: JsonField<RunStatsGroupBy>) = apply { this.groupBy = groupBy }

        fun omitData(omitData: Boolean) = omitData(JsonField.of(omitData))

        /**
         * Sets [Builder.omitData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.omitData] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun omitData(omitData: JsonField<Boolean>) = apply { this.omitData = omitData }

        fun startTime(startTime: OffsetDateTime?) = startTime(JsonField.ofNullable(startTime))

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        /** Timedelta input. */
        fun stride(stride: TimedeltaInput) = stride(JsonField.of(stride))

        /**
         * Sets [Builder.stride] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stride] with a well-typed [TimedeltaInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stride(stride: JsonField<TimedeltaInput>) = apply { this.stride = stride }

        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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
         * Returns an immutable instance of [CustomChartsSectionRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomChartsSectionRequest =
            CustomChartsSectionRequest(
                endTime,
                groupBy,
                omitData,
                startTime,
                stride,
                timezone,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomChartsSectionRequest = apply {
        if (validated) {
            return@apply
        }

        endTime()
        groupBy().ifPresent { it.validate() }
        omitData()
        startTime()
        stride().ifPresent { it.validate() }
        timezone()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (endTime.asKnown().isPresent) 1 else 0) +
            (groupBy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (omitData.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (stride.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timezone.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChartsSectionRequest &&
            endTime == other.endTime &&
            groupBy == other.groupBy &&
            omitData == other.omitData &&
            startTime == other.startTime &&
            stride == other.stride &&
            timezone == other.timezone &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(endTime, groupBy, omitData, startTime, stride, timezone, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomChartsSectionRequest{endTime=$endTime, groupBy=$groupBy, omitData=$omitData, startTime=$startTime, stride=$stride, timezone=$timezone, additionalProperties=$additionalProperties}"
}
