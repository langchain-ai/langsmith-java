// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.sessions.TimedeltaInput
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomChartsRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val afterIndex: JsonField<Long>,
    private val endTime: JsonField<OffsetDateTime>,
    private val omitData: JsonField<Boolean>,
    private val startTime: JsonField<OffsetDateTime>,
    private val stride: JsonField<TimedeltaInput>,
    private val tagValueId: JsonField<List<String>>,
    private val timezone: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("after_index") @ExcludeMissing afterIndex: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("omit_data") @ExcludeMissing omitData: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("stride")
        @ExcludeMissing
        stride: JsonField<TimedeltaInput> = JsonMissing.of(),
        @JsonProperty("tag_value_id")
        @ExcludeMissing
        tagValueId: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
    ) : this(afterIndex, endTime, omitData, startTime, stride, tagValueId, timezone, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun afterIndex(): Optional<Long> = afterIndex.getOptional("after_index")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun omitData(): Optional<Boolean> = omitData.getOptional("omit_data")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

    /**
     * Timedelta input.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stride(): Optional<TimedeltaInput> = stride.getOptional("stride")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tagValueId(): Optional<List<String>> = tagValueId.getOptional("tag_value_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezone(): Optional<String> = timezone.getOptional("timezone")

    /**
     * Returns the raw JSON value of [afterIndex].
     *
     * Unlike [afterIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("after_index") @ExcludeMissing fun _afterIndex(): JsonField<Long> = afterIndex

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

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
     * Returns the raw JSON value of [tagValueId].
     *
     * Unlike [tagValueId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tag_value_id")
    @ExcludeMissing
    fun _tagValueId(): JsonField<List<String>> = tagValueId

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

        /** Returns a mutable builder for constructing an instance of [CustomChartsRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChartsRequest]. */
    class Builder internal constructor() {

        private var afterIndex: JsonField<Long> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var omitData: JsonField<Boolean> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var stride: JsonField<TimedeltaInput> = JsonMissing.of()
        private var tagValueId: JsonField<MutableList<String>>? = null
        private var timezone: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customChartsRequest: CustomChartsRequest) = apply {
            afterIndex = customChartsRequest.afterIndex
            endTime = customChartsRequest.endTime
            omitData = customChartsRequest.omitData
            startTime = customChartsRequest.startTime
            stride = customChartsRequest.stride
            tagValueId = customChartsRequest.tagValueId.map { it.toMutableList() }
            timezone = customChartsRequest.timezone
            additionalProperties = customChartsRequest.additionalProperties.toMutableMap()
        }

        fun afterIndex(afterIndex: Long?) = afterIndex(JsonField.ofNullable(afterIndex))

        /**
         * Alias for [Builder.afterIndex].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun afterIndex(afterIndex: Long) = afterIndex(afterIndex as Long?)

        /** Alias for calling [Builder.afterIndex] with `afterIndex.orElse(null)`. */
        fun afterIndex(afterIndex: Optional<Long>) = afterIndex(afterIndex.getOrNull())

        /**
         * Sets [Builder.afterIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.afterIndex] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun afterIndex(afterIndex: JsonField<Long>) = apply { this.afterIndex = afterIndex }

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

        fun tagValueId(tagValueId: List<String>?) = tagValueId(JsonField.ofNullable(tagValueId))

        /** Alias for calling [Builder.tagValueId] with `tagValueId.orElse(null)`. */
        fun tagValueId(tagValueId: Optional<List<String>>) = tagValueId(tagValueId.getOrNull())

        /**
         * Sets [Builder.tagValueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagValueId] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tagValueId(tagValueId: JsonField<List<String>>) = apply {
            this.tagValueId = tagValueId.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.tagValueId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTagValueId(tagValueId: String) = apply {
            this.tagValueId =
                (this.tagValueId ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tagValueId", it).add(tagValueId)
                }
        }

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
         * Returns an immutable instance of [CustomChartsRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomChartsRequest =
            CustomChartsRequest(
                afterIndex,
                endTime,
                omitData,
                startTime,
                stride,
                (tagValueId ?: JsonMissing.of()).map { it.toImmutable() },
                timezone,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomChartsRequest = apply {
        if (validated) {
            return@apply
        }

        afterIndex()
        endTime()
        omitData()
        startTime()
        stride().ifPresent { it.validate() }
        tagValueId()
        timezone()
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
        (if (afterIndex.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (omitData.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (stride.asKnown().getOrNull()?.validity() ?: 0) +
            (tagValueId.asKnown().getOrNull()?.size ?: 0) +
            (if (timezone.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChartsRequest &&
            afterIndex == other.afterIndex &&
            endTime == other.endTime &&
            omitData == other.omitData &&
            startTime == other.startTime &&
            stride == other.stride &&
            tagValueId == other.tagValueId &&
            timezone == other.timezone &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            afterIndex,
            endTime,
            omitData,
            startTime,
            stride,
            tagValueId,
            timezone,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomChartsRequest{afterIndex=$afterIndex, endTime=$endTime, omitData=$omitData, startTime=$startTime, stride=$stride, tagValueId=$tagValueId, timezone=$timezone, additionalProperties=$additionalProperties}"
}
