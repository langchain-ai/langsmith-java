// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

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
import com.langchain.smith.core.Params
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.sessions.TimedeltaInput
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a preview for a chart without actually creating it. */
class ChartPreviewParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucketInfo(): BucketInfo = body.bucketInfo()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chart(): Chart = body.chart()

    /**
     * Returns the raw JSON value of [bucketInfo].
     *
     * Unlike [bucketInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bucketInfo(): JsonField<BucketInfo> = body._bucketInfo()

    /**
     * Returns the raw JSON value of [chart].
     *
     * Unlike [chart], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _chart(): JsonField<Chart> = body._chart()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChartPreviewParams].
         *
         * The following fields are required:
         * ```java
         * .bucketInfo()
         * .chart()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChartPreviewParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(chartPreviewParams: ChartPreviewParams) = apply {
            body = chartPreviewParams.body.toBuilder()
            additionalHeaders = chartPreviewParams.additionalHeaders.toBuilder()
            additionalQueryParams = chartPreviewParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bucketInfo]
         * - [chart]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun bucketInfo(bucketInfo: BucketInfo) = apply { body.bucketInfo(bucketInfo) }

        /**
         * Sets [Builder.bucketInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucketInfo] with a well-typed [BucketInfo] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bucketInfo(bucketInfo: JsonField<BucketInfo>) = apply { body.bucketInfo(bucketInfo) }

        fun chart(chart: Chart) = apply { body.chart(chart) }

        /**
         * Sets [Builder.chart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chart] with a well-typed [Chart] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chart(chart: JsonField<Chart>) = apply { body.chart(chart) }

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
         * Returns an immutable instance of [ChartPreviewParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bucketInfo()
         * .chart()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChartPreviewParams =
            ChartPreviewParams(
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
        private val bucketInfo: JsonField<BucketInfo>,
        private val chart: JsonField<Chart>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bucket_info")
            @ExcludeMissing
            bucketInfo: JsonField<BucketInfo> = JsonMissing.of(),
            @JsonProperty("chart") @ExcludeMissing chart: JsonField<Chart> = JsonMissing.of(),
        ) : this(bucketInfo, chart, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bucketInfo(): BucketInfo = bucketInfo.getRequired("bucket_info")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun chart(): Chart = chart.getRequired("chart")

        /**
         * Returns the raw JSON value of [bucketInfo].
         *
         * Unlike [bucketInfo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bucket_info")
        @ExcludeMissing
        fun _bucketInfo(): JsonField<BucketInfo> = bucketInfo

        /**
         * Returns the raw JSON value of [chart].
         *
         * Unlike [chart], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chart") @ExcludeMissing fun _chart(): JsonField<Chart> = chart

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
             * .bucketInfo()
             * .chart()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var bucketInfo: JsonField<BucketInfo>? = null
            private var chart: JsonField<Chart>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                bucketInfo = body.bucketInfo
                chart = body.chart
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun bucketInfo(bucketInfo: BucketInfo) = bucketInfo(JsonField.of(bucketInfo))

            /**
             * Sets [Builder.bucketInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bucketInfo] with a well-typed [BucketInfo] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bucketInfo(bucketInfo: JsonField<BucketInfo>) = apply {
                this.bucketInfo = bucketInfo
            }

            fun chart(chart: Chart) = chart(JsonField.of(chart))

            /**
             * Sets [Builder.chart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chart] with a well-typed [Chart] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun chart(chart: JsonField<Chart>) = apply { this.chart = chart }

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
             * .bucketInfo()
             * .chart()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("bucketInfo", bucketInfo),
                    checkRequired("chart", chart),
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

            bucketInfo().validate()
            chart().validate()
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
            (bucketInfo.asKnown().getOrNull()?.validity() ?: 0) +
                (chart.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bucketInfo == other.bucketInfo &&
                chart == other.chart &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(bucketInfo, chart, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bucketInfo=$bucketInfo, chart=$chart, additionalProperties=$additionalProperties}"
    }

    class BucketInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endTime: JsonField<OffsetDateTime>,
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
            @JsonProperty("omit_data")
            @ExcludeMissing
            omitData: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("stride")
            @ExcludeMissing
            stride: JsonField<TimedeltaInput> = JsonMissing.of(),
            @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
        ) : this(endTime, omitData, startTime, stride, timezone, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun omitData(): Optional<Boolean> = omitData.getOptional("omit_data")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

        /**
         * Timedelta input.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun stride(): Optional<TimedeltaInput> = stride.getOptional("stride")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun timezone(): Optional<String> = timezone.getOptional("timezone")

        /**
         * Returns the raw JSON value of [endTime].
         *
         * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_time")
        @ExcludeMissing
        fun _endTime(): JsonField<OffsetDateTime> = endTime

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

            /** Returns a mutable builder for constructing an instance of [BucketInfo]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BucketInfo]. */
        class Builder internal constructor() {

            private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var omitData: JsonField<Boolean> = JsonMissing.of()
            private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var stride: JsonField<TimedeltaInput> = JsonMissing.of()
            private var timezone: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bucketInfo: BucketInfo) = apply {
                endTime = bucketInfo.endTime
                omitData = bucketInfo.omitData
                startTime = bucketInfo.startTime
                stride = bucketInfo.stride
                timezone = bucketInfo.timezone
                additionalProperties = bucketInfo.additionalProperties.toMutableMap()
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

            fun omitData(omitData: Boolean) = omitData(JsonField.of(omitData))

            /**
             * Sets [Builder.omitData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.omitData] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                this.startTime = startTime
            }

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
             * You should usually call [Builder.timezone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [BucketInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BucketInfo =
                BucketInfo(
                    endTime,
                    omitData,
                    startTime,
                    stride,
                    timezone,
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
        fun validate(): BucketInfo = apply {
            if (validated) {
                return@apply
            }

            endTime()
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
            (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (omitData.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (stride.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timezone.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BucketInfo &&
                endTime == other.endTime &&
                omitData == other.omitData &&
                startTime == other.startTime &&
                stride == other.stride &&
                timezone == other.timezone &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(endTime, omitData, startTime, stride, timezone, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BucketInfo{endTime=$endTime, omitData=$omitData, startTime=$startTime, stride=$stride, timezone=$timezone, additionalProperties=$additionalProperties}"
    }

    class Chart
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val series: JsonField<List<Series>>,
        private val commonFilters: JsonField<CommonFilters>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("series")
            @ExcludeMissing
            series: JsonField<List<Series>> = JsonMissing.of(),
            @JsonProperty("common_filters")
            @ExcludeMissing
            commonFilters: JsonField<CommonFilters> = JsonMissing.of(),
        ) : this(series, commonFilters, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun series(): List<Series> = series.getRequired("series")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commonFilters(): Optional<CommonFilters> = commonFilters.getOptional("common_filters")

        /**
         * Returns the raw JSON value of [series].
         *
         * Unlike [series], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("series") @ExcludeMissing fun _series(): JsonField<List<Series>> = series

        /**
         * Returns the raw JSON value of [commonFilters].
         *
         * Unlike [commonFilters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("common_filters")
        @ExcludeMissing
        fun _commonFilters(): JsonField<CommonFilters> = commonFilters

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
             * Returns a mutable builder for constructing an instance of [Chart].
             *
             * The following fields are required:
             * ```java
             * .series()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Chart]. */
        class Builder internal constructor() {

            private var series: JsonField<MutableList<Series>>? = null
            private var commonFilters: JsonField<CommonFilters> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(chart: Chart) = apply {
                series = chart.series.map { it.toMutableList() }
                commonFilters = chart.commonFilters
                additionalProperties = chart.additionalProperties.toMutableMap()
            }

            fun series(series: List<Series>) = series(JsonField.of(series))

            /**
             * Sets [Builder.series] to an arbitrary JSON value.
             *
             * You should usually call [Builder.series] with a well-typed `List<Series>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun series(series: JsonField<List<Series>>) = apply {
                this.series = series.map { it.toMutableList() }
            }

            /**
             * Adds a single [Series] to [Builder.series].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSeries(series: Series) = apply {
                this.series =
                    (this.series ?: JsonField.of(mutableListOf())).also {
                        checkKnown("series", it).add(series)
                    }
            }

            fun commonFilters(commonFilters: CommonFilters?) =
                commonFilters(JsonField.ofNullable(commonFilters))

            /** Alias for calling [Builder.commonFilters] with `commonFilters.orElse(null)`. */
            fun commonFilters(commonFilters: Optional<CommonFilters>) =
                commonFilters(commonFilters.getOrNull())

            /**
             * Sets [Builder.commonFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commonFilters] with a well-typed [CommonFilters]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun commonFilters(commonFilters: JsonField<CommonFilters>) = apply {
                this.commonFilters = commonFilters
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
             * Returns an immutable instance of [Chart].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .series()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Chart =
                Chart(
                    checkRequired("series", series).map { it.toImmutable() },
                    commonFilters,
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
        fun validate(): Chart = apply {
            if (validated) {
                return@apply
            }

            series().forEach { it.validate() }
            commonFilters().ifPresent { it.validate() }
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
            (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (commonFilters.asKnown().getOrNull()?.validity() ?: 0)

        class Series
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val name: JsonField<String>,
            private val feedbackKey: JsonField<String>,
            private val filterDefinition: JsonField<FilterDefinition>,
            private val filters: JsonField<Filters>,
            private val groupBy: JsonField<GroupBy>,
            private val groupByDefinitions: JsonField<List<GroupByDefinition>>,
            private val metadata: JsonField<Metadata>,
            private val metric: JsonField<Metric>,
            private val metricDefinition: JsonField<MetricDefinition>,
            private val projectMetric: JsonField<ProjectMetric>,
            private val workspaceId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("feedback_key")
                @ExcludeMissing
                feedbackKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("filter_definition")
                @ExcludeMissing
                filterDefinition: JsonField<FilterDefinition> = JsonMissing.of(),
                @JsonProperty("filters")
                @ExcludeMissing
                filters: JsonField<Filters> = JsonMissing.of(),
                @JsonProperty("group_by")
                @ExcludeMissing
                groupBy: JsonField<GroupBy> = JsonMissing.of(),
                @JsonProperty("group_by_definitions")
                @ExcludeMissing
                groupByDefinitions: JsonField<List<GroupByDefinition>> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("metric")
                @ExcludeMissing
                metric: JsonField<Metric> = JsonMissing.of(),
                @JsonProperty("metric_definition")
                @ExcludeMissing
                metricDefinition: JsonField<MetricDefinition> = JsonMissing.of(),
                @JsonProperty("project_metric")
                @ExcludeMissing
                projectMetric: JsonField<ProjectMetric> = JsonMissing.of(),
                @JsonProperty("workspace_id")
                @ExcludeMissing
                workspaceId: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                name,
                feedbackKey,
                filterDefinition,
                filters,
                groupBy,
                groupByDefinitions,
                metadata,
                metric,
                metricDefinition,
                projectMetric,
                workspaceId,
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
            fun name(): String = name.getRequired("name")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun feedbackKey(): Optional<String> = feedbackKey.getOptional("feedback_key")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun filterDefinition(): Optional<FilterDefinition> =
                filterDefinition.getOptional("filter_definition")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun filters(): Optional<Filters> = filters.getOptional("filters")

            /**
             * Include additional information about where the group_by param was set.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun groupBy(): Optional<GroupBy> = groupBy.getOptional("group_by")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun groupByDefinitions(): Optional<List<GroupByDefinition>> =
                groupByDefinitions.getOptional("group_by_definitions")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

            /**
             * Metrics you can chart. Feedback metrics are not available for organization-scoped
             * charts.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun metric(): Optional<Metric> = metric.getOptional("metric")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun metricDefinition(): Optional<MetricDefinition> =
                metricDefinition.getOptional("metric_definition")

            /**
             * LGP Metrics you can chart.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun projectMetric(): Optional<ProjectMetric> =
                projectMetric.getOptional("project_metric")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun workspaceId(): Optional<String> = workspaceId.getOptional("workspace_id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [feedbackKey].
             *
             * Unlike [feedbackKey], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("feedback_key")
            @ExcludeMissing
            fun _feedbackKey(): JsonField<String> = feedbackKey

            /**
             * Returns the raw JSON value of [filterDefinition].
             *
             * Unlike [filterDefinition], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("filter_definition")
            @ExcludeMissing
            fun _filterDefinition(): JsonField<FilterDefinition> = filterDefinition

            /**
             * Returns the raw JSON value of [filters].
             *
             * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<Filters> = filters

            /**
             * Returns the raw JSON value of [groupBy].
             *
             * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("group_by") @ExcludeMissing fun _groupBy(): JsonField<GroupBy> = groupBy

            /**
             * Returns the raw JSON value of [groupByDefinitions].
             *
             * Unlike [groupByDefinitions], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("group_by_definitions")
            @ExcludeMissing
            fun _groupByDefinitions(): JsonField<List<GroupByDefinition>> = groupByDefinitions

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [metric].
             *
             * Unlike [metric], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<Metric> = metric

            /**
             * Returns the raw JSON value of [metricDefinition].
             *
             * Unlike [metricDefinition], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("metric_definition")
            @ExcludeMissing
            fun _metricDefinition(): JsonField<MetricDefinition> = metricDefinition

            /**
             * Returns the raw JSON value of [projectMetric].
             *
             * Unlike [projectMetric], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("project_metric")
            @ExcludeMissing
            fun _projectMetric(): JsonField<ProjectMetric> = projectMetric

            /**
             * Returns the raw JSON value of [workspaceId].
             *
             * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("workspace_id")
            @ExcludeMissing
            fun _workspaceId(): JsonField<String> = workspaceId

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
                 * Returns a mutable builder for constructing an instance of [Series].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Series]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var feedbackKey: JsonField<String> = JsonMissing.of()
                private var filterDefinition: JsonField<FilterDefinition> = JsonMissing.of()
                private var filters: JsonField<Filters> = JsonMissing.of()
                private var groupBy: JsonField<GroupBy> = JsonMissing.of()
                private var groupByDefinitions: JsonField<MutableList<GroupByDefinition>>? = null
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var metric: JsonField<Metric> = JsonMissing.of()
                private var metricDefinition: JsonField<MetricDefinition> = JsonMissing.of()
                private var projectMetric: JsonField<ProjectMetric> = JsonMissing.of()
                private var workspaceId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(series: Series) = apply {
                    id = series.id
                    name = series.name
                    feedbackKey = series.feedbackKey
                    filterDefinition = series.filterDefinition
                    filters = series.filters
                    groupBy = series.groupBy
                    groupByDefinitions = series.groupByDefinitions.map { it.toMutableList() }
                    metadata = series.metadata
                    metric = series.metric
                    metricDefinition = series.metricDefinition
                    projectMetric = series.projectMetric
                    workspaceId = series.workspaceId
                    additionalProperties = series.additionalProperties.toMutableMap()
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

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun feedbackKey(feedbackKey: String?) =
                    feedbackKey(JsonField.ofNullable(feedbackKey))

                /** Alias for calling [Builder.feedbackKey] with `feedbackKey.orElse(null)`. */
                fun feedbackKey(feedbackKey: Optional<String>) =
                    feedbackKey(feedbackKey.getOrNull())

                /**
                 * Sets [Builder.feedbackKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.feedbackKey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun feedbackKey(feedbackKey: JsonField<String>) = apply {
                    this.feedbackKey = feedbackKey
                }

                fun filterDefinition(filterDefinition: FilterDefinition?) =
                    filterDefinition(JsonField.ofNullable(filterDefinition))

                /**
                 * Alias for calling [Builder.filterDefinition] with
                 * `filterDefinition.orElse(null)`.
                 */
                fun filterDefinition(filterDefinition: Optional<FilterDefinition>) =
                    filterDefinition(filterDefinition.getOrNull())

                /**
                 * Sets [Builder.filterDefinition] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filterDefinition] with a well-typed
                 * [FilterDefinition] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun filterDefinition(filterDefinition: JsonField<FilterDefinition>) = apply {
                    this.filterDefinition = filterDefinition
                }

                /**
                 * Alias for calling [filterDefinition] with
                 * `FilterDefinition.ofCustomChartFilterByTracingProject(customChartFilterByTracingProject)`.
                 */
                fun filterDefinition(
                    customChartFilterByTracingProject:
                        FilterDefinition.CustomChartFilterByTracingProject
                ) =
                    filterDefinition(
                        FilterDefinition.ofCustomChartFilterByTracingProject(
                            customChartFilterByTracingProject
                        )
                    )

                /**
                 * Alias for calling [filterDefinition] with
                 * `FilterDefinition.ofCustomChartFilterByDataset(customChartFilterByDataset)`.
                 */
                fun filterDefinition(
                    customChartFilterByDataset: FilterDefinition.CustomChartFilterByDataset
                ) =
                    filterDefinition(
                        FilterDefinition.ofCustomChartFilterByDataset(customChartFilterByDataset)
                    )

                fun filters(filters: Filters?) = filters(JsonField.ofNullable(filters))

                /** Alias for calling [Builder.filters] with `filters.orElse(null)`. */
                fun filters(filters: Optional<Filters>) = filters(filters.getOrNull())

                /**
                 * Sets [Builder.filters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filters] with a well-typed [Filters] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filters(filters: JsonField<Filters>) = apply { this.filters = filters }

                /** Include additional information about where the group_by param was set. */
                fun groupBy(groupBy: GroupBy?) = groupBy(JsonField.ofNullable(groupBy))

                /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
                fun groupBy(groupBy: Optional<GroupBy>) = groupBy(groupBy.getOrNull())

                /**
                 * Sets [Builder.groupBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupBy] with a well-typed [GroupBy] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun groupBy(groupBy: JsonField<GroupBy>) = apply { this.groupBy = groupBy }

                fun groupByDefinitions(groupByDefinitions: List<GroupByDefinition>?) =
                    groupByDefinitions(JsonField.ofNullable(groupByDefinitions))

                /**
                 * Alias for calling [Builder.groupByDefinitions] with
                 * `groupByDefinitions.orElse(null)`.
                 */
                fun groupByDefinitions(groupByDefinitions: Optional<List<GroupByDefinition>>) =
                    groupByDefinitions(groupByDefinitions.getOrNull())

                /**
                 * Sets [Builder.groupByDefinitions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupByDefinitions] with a well-typed
                 * `List<GroupByDefinition>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun groupByDefinitions(groupByDefinitions: JsonField<List<GroupByDefinition>>) =
                    apply {
                        this.groupByDefinitions = groupByDefinitions.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [GroupByDefinition] to [groupByDefinitions].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addGroupByDefinition(groupByDefinition: GroupByDefinition) = apply {
                    groupByDefinitions =
                        (groupByDefinitions ?: JsonField.of(mutableListOf())).also {
                            checkKnown("groupByDefinitions", it).add(groupByDefinition)
                        }
                }

                /**
                 * Alias for calling [addGroupByDefinition] with
                 * `GroupByDefinition.ofCustomChartGroupByPlain(customChartGroupByPlain)`.
                 */
                fun addGroupByDefinition(
                    customChartGroupByPlain: GroupByDefinition.CustomChartGroupByPlain
                ) =
                    addGroupByDefinition(
                        GroupByDefinition.ofCustomChartGroupByPlain(customChartGroupByPlain)
                    )

                /**
                 * Alias for calling [addGroupByDefinition] with
                 * `GroupByDefinition.ofCustomChartGroupByComplex(customChartGroupByComplex)`.
                 */
                fun addGroupByDefinition(
                    customChartGroupByComplex: GroupByDefinition.CustomChartGroupByComplex
                ) =
                    addGroupByDefinition(
                        GroupByDefinition.ofCustomChartGroupByComplex(customChartGroupByComplex)
                    )

                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
                fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /**
                 * Metrics you can chart. Feedback metrics are not available for organization-scoped
                 * charts.
                 */
                fun metric(metric: Metric?) = metric(JsonField.ofNullable(metric))

                /** Alias for calling [Builder.metric] with `metric.orElse(null)`. */
                fun metric(metric: Optional<Metric>) = metric(metric.getOrNull())

                /**
                 * Sets [Builder.metric] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metric] with a well-typed [Metric] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metric(metric: JsonField<Metric>) = apply { this.metric = metric }

                fun metricDefinition(metricDefinition: MetricDefinition?) =
                    metricDefinition(JsonField.ofNullable(metricDefinition))

                /**
                 * Alias for calling [Builder.metricDefinition] with
                 * `metricDefinition.orElse(null)`.
                 */
                fun metricDefinition(metricDefinition: Optional<MetricDefinition>) =
                    metricDefinition(metricDefinition.getOrNull())

                /**
                 * Sets [Builder.metricDefinition] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metricDefinition] with a well-typed
                 * [MetricDefinition] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun metricDefinition(metricDefinition: JsonField<MetricDefinition>) = apply {
                    this.metricDefinition = metricDefinition
                }

                /**
                 * Alias for calling [metricDefinition] with
                 * `MetricDefinition.ofCustomChartFeedbackCountMetric(customChartFeedbackCountMetric)`.
                 */
                fun metricDefinition(
                    customChartFeedbackCountMetric: MetricDefinition.CustomChartFeedbackCountMetric
                ) =
                    metricDefinition(
                        MetricDefinition.ofCustomChartFeedbackCountMetric(
                            customChartFeedbackCountMetric
                        )
                    )

                /**
                 * Alias for calling [metricDefinition] with
                 * `MetricDefinition.ofCustomChartMetricCount(customChartMetricCount)`.
                 */
                fun metricDefinition(
                    customChartMetricCount: MetricDefinition.CustomChartMetricCount
                ) =
                    metricDefinition(
                        MetricDefinition.ofCustomChartMetricCount(customChartMetricCount)
                    )

                /**
                 * Alias for calling [metricDefinition] with
                 * `MetricDefinition.ofCustomChartFeedbackScoreMetricScalar(customChartFeedbackScoreMetricScalar)`.
                 */
                fun metricDefinition(
                    customChartFeedbackScoreMetricScalar:
                        MetricDefinition.CustomChartFeedbackScoreMetricScalar
                ) =
                    metricDefinition(
                        MetricDefinition.ofCustomChartFeedbackScoreMetricScalar(
                            customChartFeedbackScoreMetricScalar
                        )
                    )

                /**
                 * Alias for calling [metricDefinition] with
                 * `MetricDefinition.ofCustomChartMetricScalar(customChartMetricScalar)`.
                 */
                fun metricDefinition(
                    customChartMetricScalar: MetricDefinition.CustomChartMetricScalar
                ) =
                    metricDefinition(
                        MetricDefinition.ofCustomChartMetricScalar(customChartMetricScalar)
                    )

                /**
                 * Alias for calling [metricDefinition] with
                 * `MetricDefinition.ofCustomChartFeedbackScoreMetricPercentile(customChartFeedbackScoreMetricPercentile)`.
                 */
                fun metricDefinition(
                    customChartFeedbackScoreMetricPercentile:
                        MetricDefinition.CustomChartFeedbackScoreMetricPercentile
                ) =
                    metricDefinition(
                        MetricDefinition.ofCustomChartFeedbackScoreMetricPercentile(
                            customChartFeedbackScoreMetricPercentile
                        )
                    )

                /**
                 * Alias for calling [metricDefinition] with
                 * `MetricDefinition.ofCustomChartMetricPercentile(customChartMetricPercentile)`.
                 */
                fun metricDefinition(
                    customChartMetricPercentile: MetricDefinition.CustomChartMetricPercentile
                ) =
                    metricDefinition(
                        MetricDefinition.ofCustomChartMetricPercentile(customChartMetricPercentile)
                    )

                /**
                 * Alias for calling [metricDefinition] with
                 * `MetricDefinition.ofCustomChartMetricRatioInput(customChartMetricRatioInput)`.
                 */
                fun metricDefinition(
                    customChartMetricRatioInput: MetricDefinition.CustomChartMetricRatioInput
                ) =
                    metricDefinition(
                        MetricDefinition.ofCustomChartMetricRatioInput(customChartMetricRatioInput)
                    )

                /** LGP Metrics you can chart. */
                fun projectMetric(projectMetric: ProjectMetric?) =
                    projectMetric(JsonField.ofNullable(projectMetric))

                /** Alias for calling [Builder.projectMetric] with `projectMetric.orElse(null)`. */
                fun projectMetric(projectMetric: Optional<ProjectMetric>) =
                    projectMetric(projectMetric.getOrNull())

                /**
                 * Sets [Builder.projectMetric] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projectMetric] with a well-typed [ProjectMetric]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun projectMetric(projectMetric: JsonField<ProjectMetric>) = apply {
                    this.projectMetric = projectMetric
                }

                fun workspaceId(workspaceId: String?) =
                    workspaceId(JsonField.ofNullable(workspaceId))

                /** Alias for calling [Builder.workspaceId] with `workspaceId.orElse(null)`. */
                fun workspaceId(workspaceId: Optional<String>) =
                    workspaceId(workspaceId.getOrNull())

                /**
                 * Sets [Builder.workspaceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.workspaceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun workspaceId(workspaceId: JsonField<String>) = apply {
                    this.workspaceId = workspaceId
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
                 * Returns an immutable instance of [Series].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Series =
                    Series(
                        checkRequired("id", id),
                        checkRequired("name", name),
                        feedbackKey,
                        filterDefinition,
                        filters,
                        groupBy,
                        (groupByDefinitions ?: JsonMissing.of()).map { it.toImmutable() },
                        metadata,
                        metric,
                        metricDefinition,
                        projectMetric,
                        workspaceId,
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
            fun validate(): Series = apply {
                if (validated) {
                    return@apply
                }

                id()
                name()
                feedbackKey()
                filterDefinition().ifPresent { it.validate() }
                filters().ifPresent { it.validate() }
                groupBy().ifPresent { it.validate() }
                groupByDefinitions().ifPresent { it.forEach { it.validate() } }
                metadata().ifPresent { it.validate() }
                metric().ifPresent { it.validate() }
                metricDefinition().ifPresent { it.validate() }
                projectMetric().ifPresent { it.validate() }
                workspaceId()
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (feedbackKey.asKnown().isPresent) 1 else 0) +
                    (filterDefinition.asKnown().getOrNull()?.validity() ?: 0) +
                    (filters.asKnown().getOrNull()?.validity() ?: 0) +
                    (groupBy.asKnown().getOrNull()?.validity() ?: 0) +
                    (groupByDefinitions.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (metric.asKnown().getOrNull()?.validity() ?: 0) +
                    (metricDefinition.asKnown().getOrNull()?.validity() ?: 0) +
                    (projectMetric.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (workspaceId.asKnown().isPresent) 1 else 0)

            @JsonDeserialize(using = FilterDefinition.Deserializer::class)
            @JsonSerialize(using = FilterDefinition.Serializer::class)
            class FilterDefinition
            private constructor(
                private val customChartFilterByTracingProject: CustomChartFilterByTracingProject? =
                    null,
                private val customChartFilterByDataset: CustomChartFilterByDataset? = null,
                private val _json: JsonValue? = null,
            ) {

                fun customChartFilterByTracingProject():
                    Optional<CustomChartFilterByTracingProject> =
                    Optional.ofNullable(customChartFilterByTracingProject)

                fun customChartFilterByDataset(): Optional<CustomChartFilterByDataset> =
                    Optional.ofNullable(customChartFilterByDataset)

                fun isCustomChartFilterByTracingProject(): Boolean =
                    customChartFilterByTracingProject != null

                fun isCustomChartFilterByDataset(): Boolean = customChartFilterByDataset != null

                fun asCustomChartFilterByTracingProject(): CustomChartFilterByTracingProject =
                    customChartFilterByTracingProject.getOrThrow(
                        "customChartFilterByTracingProject"
                    )

                fun asCustomChartFilterByDataset(): CustomChartFilterByDataset =
                    customChartFilterByDataset.getOrThrow("customChartFilterByDataset")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.langchain.smith.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = filterDefinition.accept(new FilterDefinition.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitCustomChartFilterByTracingProject(CustomChartFilterByTracingProject customChartFilterByTracingProject) {
                 *         return Optional.of(customChartFilterByTracingProject.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LangChainInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        customChartFilterByTracingProject != null ->
                            visitor.visitCustomChartFilterByTracingProject(
                                customChartFilterByTracingProject
                            )
                        customChartFilterByDataset != null ->
                            visitor.visitCustomChartFilterByDataset(customChartFilterByDataset)
                        else -> visitor.unknown(_json)
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
                fun validate(): FilterDefinition = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitCustomChartFilterByTracingProject(
                                customChartFilterByTracingProject: CustomChartFilterByTracingProject
                            ) {
                                customChartFilterByTracingProject.validate()
                            }

                            override fun visitCustomChartFilterByDataset(
                                customChartFilterByDataset: CustomChartFilterByDataset
                            ) {
                                customChartFilterByDataset.validate()
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
                            override fun visitCustomChartFilterByTracingProject(
                                customChartFilterByTracingProject: CustomChartFilterByTracingProject
                            ) = customChartFilterByTracingProject.validity()

                            override fun visitCustomChartFilterByDataset(
                                customChartFilterByDataset: CustomChartFilterByDataset
                            ) = customChartFilterByDataset.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FilterDefinition &&
                        customChartFilterByTracingProject ==
                            other.customChartFilterByTracingProject &&
                        customChartFilterByDataset == other.customChartFilterByDataset
                }

                override fun hashCode(): Int =
                    Objects.hash(customChartFilterByTracingProject, customChartFilterByDataset)

                override fun toString(): String =
                    when {
                        customChartFilterByTracingProject != null ->
                            "FilterDefinition{customChartFilterByTracingProject=$customChartFilterByTracingProject}"
                        customChartFilterByDataset != null ->
                            "FilterDefinition{customChartFilterByDataset=$customChartFilterByDataset}"
                        _json != null -> "FilterDefinition{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid FilterDefinition")
                    }

                companion object {

                    @JvmStatic
                    fun ofCustomChartFilterByTracingProject(
                        customChartFilterByTracingProject: CustomChartFilterByTracingProject
                    ) =
                        FilterDefinition(
                            customChartFilterByTracingProject = customChartFilterByTracingProject
                        )

                    @JvmStatic
                    fun ofCustomChartFilterByDataset(
                        customChartFilterByDataset: CustomChartFilterByDataset
                    ) = FilterDefinition(customChartFilterByDataset = customChartFilterByDataset)
                }

                /**
                 * An interface that defines how to map each variant of [FilterDefinition] to a
                 * value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitCustomChartFilterByTracingProject(
                        customChartFilterByTracingProject: CustomChartFilterByTracingProject
                    ): T

                    fun visitCustomChartFilterByDataset(
                        customChartFilterByDataset: CustomChartFilterByDataset
                    ): T

                    /**
                     * Maps an unknown variant of [FilterDefinition] to a value of type [T].
                     *
                     * An instance of [FilterDefinition] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LangChainInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangChainInvalidDataException("Unknown FilterDefinition: $json")
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<FilterDefinition>(FilterDefinition::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): FilterDefinition {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<CustomChartFilterByTracingProject>(),
                                        )
                                        ?.let {
                                            FilterDefinition(
                                                customChartFilterByTracingProject = it,
                                                _json = json,
                                            )
                                        },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<CustomChartFilterByDataset>(),
                                        )
                                        ?.let {
                                            FilterDefinition(
                                                customChartFilterByDataset = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> FilterDefinition(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<FilterDefinition>(FilterDefinition::class) {

                    override fun serialize(
                        value: FilterDefinition,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.customChartFilterByTracingProject != null ->
                                generator.writeObject(value.customChartFilterByTracingProject)
                            value.customChartFilterByDataset != null ->
                                generator.writeObject(value.customChartFilterByDataset)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid FilterDefinition")
                        }
                    }
                }

                class CustomChartFilterByTracingProject
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val projectIds: JsonField<List<String>>,
                    private val sourceType: JsonValue,
                    private val runFilter: JsonField<String>,
                    private val traceFilter: JsonField<String>,
                    private val treeFilter: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("project_ids")
                        @ExcludeMissing
                        projectIds: JsonField<List<String>> = JsonMissing.of(),
                        @JsonProperty("source_type")
                        @ExcludeMissing
                        sourceType: JsonValue = JsonMissing.of(),
                        @JsonProperty("run_filter")
                        @ExcludeMissing
                        runFilter: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("trace_filter")
                        @ExcludeMissing
                        traceFilter: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("tree_filter")
                        @ExcludeMissing
                        treeFilter: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        projectIds,
                        sourceType,
                        runFilter,
                        traceFilter,
                        treeFilter,
                        mutableMapOf(),
                    )

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun projectIds(): List<String> = projectIds.getRequired("project_ids")

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("tracing_project")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("source_type")
                    @ExcludeMissing
                    fun _sourceType(): JsonValue = sourceType

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun runFilter(): Optional<String> = runFilter.getOptional("run_filter")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

                    /**
                     * Returns the raw JSON value of [projectIds].
                     *
                     * Unlike [projectIds], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("project_ids")
                    @ExcludeMissing
                    fun _projectIds(): JsonField<List<String>> = projectIds

                    /**
                     * Returns the raw JSON value of [runFilter].
                     *
                     * Unlike [runFilter], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("run_filter")
                    @ExcludeMissing
                    fun _runFilter(): JsonField<String> = runFilter

                    /**
                     * Returns the raw JSON value of [traceFilter].
                     *
                     * Unlike [traceFilter], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("trace_filter")
                    @ExcludeMissing
                    fun _traceFilter(): JsonField<String> = traceFilter

                    /**
                     * Returns the raw JSON value of [treeFilter].
                     *
                     * Unlike [treeFilter], this method doesn't throw if the JSON field has an
                     * unexpected type.
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

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [CustomChartFilterByTracingProject].
                         *
                         * The following fields are required:
                         * ```java
                         * .projectIds()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CustomChartFilterByTracingProject]. */
                    class Builder internal constructor() {

                        private var projectIds: JsonField<MutableList<String>>? = null
                        private var sourceType: JsonValue = JsonValue.from("tracing_project")
                        private var runFilter: JsonField<String> = JsonMissing.of()
                        private var traceFilter: JsonField<String> = JsonMissing.of()
                        private var treeFilter: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(
                            customChartFilterByTracingProject: CustomChartFilterByTracingProject
                        ) = apply {
                            projectIds =
                                customChartFilterByTracingProject.projectIds.map {
                                    it.toMutableList()
                                }
                            sourceType = customChartFilterByTracingProject.sourceType
                            runFilter = customChartFilterByTracingProject.runFilter
                            traceFilter = customChartFilterByTracingProject.traceFilter
                            treeFilter = customChartFilterByTracingProject.treeFilter
                            additionalProperties =
                                customChartFilterByTracingProject.additionalProperties
                                    .toMutableMap()
                        }

                        fun projectIds(projectIds: List<String>) =
                            projectIds(JsonField.of(projectIds))

                        /**
                         * Sets [Builder.projectIds] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.projectIds] with a well-typed
                         * `List<String>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun projectIds(projectIds: JsonField<List<String>>) = apply {
                            this.projectIds = projectIds.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [projectIds].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addProjectId(projectId: String) = apply {
                            projectIds =
                                (projectIds ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("projectIds", it).add(projectId)
                                }
                        }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("tracing_project")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun sourceType(sourceType: JsonValue) = apply {
                            this.sourceType = sourceType
                        }

                        fun runFilter(runFilter: String?) =
                            runFilter(JsonField.ofNullable(runFilter))

                        /** Alias for calling [Builder.runFilter] with `runFilter.orElse(null)`. */
                        fun runFilter(runFilter: Optional<String>) =
                            runFilter(runFilter.getOrNull())

                        /**
                         * Sets [Builder.runFilter] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.runFilter] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun runFilter(runFilter: JsonField<String>) = apply {
                            this.runFilter = runFilter
                        }

                        fun traceFilter(traceFilter: String?) =
                            traceFilter(JsonField.ofNullable(traceFilter))

                        /**
                         * Alias for calling [Builder.traceFilter] with `traceFilter.orElse(null)`.
                         */
                        fun traceFilter(traceFilter: Optional<String>) =
                            traceFilter(traceFilter.getOrNull())

                        /**
                         * Sets [Builder.traceFilter] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.traceFilter] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun traceFilter(traceFilter: JsonField<String>) = apply {
                            this.traceFilter = traceFilter
                        }

                        fun treeFilter(treeFilter: String?) =
                            treeFilter(JsonField.ofNullable(treeFilter))

                        /**
                         * Alias for calling [Builder.treeFilter] with `treeFilter.orElse(null)`.
                         */
                        fun treeFilter(treeFilter: Optional<String>) =
                            treeFilter(treeFilter.getOrNull())

                        /**
                         * Sets [Builder.treeFilter] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.treeFilter] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun treeFilter(treeFilter: JsonField<String>) = apply {
                            this.treeFilter = treeFilter
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [CustomChartFilterByTracingProject].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .projectIds()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CustomChartFilterByTracingProject =
                            CustomChartFilterByTracingProject(
                                checkRequired("projectIds", projectIds).map { it.toImmutable() },
                                sourceType,
                                runFilter,
                                traceFilter,
                                treeFilter,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): CustomChartFilterByTracingProject = apply {
                        if (validated) {
                            return@apply
                        }

                        projectIds()
                        _sourceType().let {
                            if (it != JsonValue.from("tracing_project")) {
                                throw LangChainInvalidDataException(
                                    "'sourceType' is invalid, received $it"
                                )
                            }
                        }
                        runFilter()
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
                        (projectIds.asKnown().getOrNull()?.size ?: 0) +
                            sourceType.let {
                                if (it == JsonValue.from("tracing_project")) 1 else 0
                            } +
                            (if (runFilter.asKnown().isPresent) 1 else 0) +
                            (if (traceFilter.asKnown().isPresent) 1 else 0) +
                            (if (treeFilter.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CustomChartFilterByTracingProject &&
                            projectIds == other.projectIds &&
                            sourceType == other.sourceType &&
                            runFilter == other.runFilter &&
                            traceFilter == other.traceFilter &&
                            treeFilter == other.treeFilter &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            projectIds,
                            sourceType,
                            runFilter,
                            traceFilter,
                            treeFilter,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CustomChartFilterByTracingProject{projectIds=$projectIds, sourceType=$sourceType, runFilter=$runFilter, traceFilter=$traceFilter, treeFilter=$treeFilter, additionalProperties=$additionalProperties}"
                }

                class CustomChartFilterByDataset
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val datasetIds: JsonField<List<String>>,
                    private val sourceType: JsonValue,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("dataset_ids")
                        @ExcludeMissing
                        datasetIds: JsonField<List<String>> = JsonMissing.of(),
                        @JsonProperty("source_type")
                        @ExcludeMissing
                        sourceType: JsonValue = JsonMissing.of(),
                    ) : this(datasetIds, sourceType, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun datasetIds(): List<String> = datasetIds.getRequired("dataset_ids")

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("dataset")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("source_type")
                    @ExcludeMissing
                    fun _sourceType(): JsonValue = sourceType

                    /**
                     * Returns the raw JSON value of [datasetIds].
                     *
                     * Unlike [datasetIds], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("dataset_ids")
                    @ExcludeMissing
                    fun _datasetIds(): JsonField<List<String>> = datasetIds

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
                         * Returns a mutable builder for constructing an instance of
                         * [CustomChartFilterByDataset].
                         *
                         * The following fields are required:
                         * ```java
                         * .datasetIds()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CustomChartFilterByDataset]. */
                    class Builder internal constructor() {

                        private var datasetIds: JsonField<MutableList<String>>? = null
                        private var sourceType: JsonValue = JsonValue.from("dataset")
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(customChartFilterByDataset: CustomChartFilterByDataset) =
                            apply {
                                datasetIds =
                                    customChartFilterByDataset.datasetIds.map { it.toMutableList() }
                                sourceType = customChartFilterByDataset.sourceType
                                additionalProperties =
                                    customChartFilterByDataset.additionalProperties.toMutableMap()
                            }

                        fun datasetIds(datasetIds: List<String>) =
                            datasetIds(JsonField.of(datasetIds))

                        /**
                         * Sets [Builder.datasetIds] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.datasetIds] with a well-typed
                         * `List<String>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun datasetIds(datasetIds: JsonField<List<String>>) = apply {
                            this.datasetIds = datasetIds.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [String] to [datasetIds].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addDatasetId(datasetId: String) = apply {
                            datasetIds =
                                (datasetIds ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("datasetIds", it).add(datasetId)
                                }
                        }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("dataset")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun sourceType(sourceType: JsonValue) = apply {
                            this.sourceType = sourceType
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [CustomChartFilterByDataset].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .datasetIds()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CustomChartFilterByDataset =
                            CustomChartFilterByDataset(
                                checkRequired("datasetIds", datasetIds).map { it.toImmutable() },
                                sourceType,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): CustomChartFilterByDataset = apply {
                        if (validated) {
                            return@apply
                        }

                        datasetIds()
                        _sourceType().let {
                            if (it != JsonValue.from("dataset")) {
                                throw LangChainInvalidDataException(
                                    "'sourceType' is invalid, received $it"
                                )
                            }
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
                        (datasetIds.asKnown().getOrNull()?.size ?: 0) +
                            sourceType.let { if (it == JsonValue.from("dataset")) 1 else 0 }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CustomChartFilterByDataset &&
                            datasetIds == other.datasetIds &&
                            sourceType == other.sourceType &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(datasetIds, sourceType, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CustomChartFilterByDataset{datasetIds=$datasetIds, sourceType=$sourceType, additionalProperties=$additionalProperties}"
                }
            }

            class Filters
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val filter: JsonField<String>,
                private val session: JsonField<List<String>>,
                private val traceFilter: JsonField<String>,
                private val treeFilter: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("filter")
                    @ExcludeMissing
                    filter: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("session")
                    @ExcludeMissing
                    session: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("trace_filter")
                    @ExcludeMissing
                    traceFilter: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tree_filter")
                    @ExcludeMissing
                    treeFilter: JsonField<String> = JsonMissing.of(),
                ) : this(filter, session, traceFilter, treeFilter, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun filter(): Optional<String> = filter.getOptional("filter")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun session(): Optional<List<String>> = session.getOptional("session")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

                /**
                 * Returns the raw JSON value of [filter].
                 *
                 * Unlike [filter], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

                /**
                 * Returns the raw JSON value of [session].
                 *
                 * Unlike [session], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("session")
                @ExcludeMissing
                fun _session(): JsonField<List<String>> = session

                /**
                 * Returns the raw JSON value of [traceFilter].
                 *
                 * Unlike [traceFilter], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("trace_filter")
                @ExcludeMissing
                fun _traceFilter(): JsonField<String> = traceFilter

                /**
                 * Returns the raw JSON value of [treeFilter].
                 *
                 * Unlike [treeFilter], this method doesn't throw if the JSON field has an
                 * unexpected type.
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

                    /** Returns a mutable builder for constructing an instance of [Filters]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Filters]. */
                class Builder internal constructor() {

                    private var filter: JsonField<String> = JsonMissing.of()
                    private var session: JsonField<MutableList<String>>? = null
                    private var traceFilter: JsonField<String> = JsonMissing.of()
                    private var treeFilter: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(filters: Filters) = apply {
                        filter = filters.filter
                        session = filters.session.map { it.toMutableList() }
                        traceFilter = filters.traceFilter
                        treeFilter = filters.treeFilter
                        additionalProperties = filters.additionalProperties.toMutableMap()
                    }

                    fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                    /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
                    fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                    /**
                     * Sets [Builder.filter] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.filter] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun filter(filter: JsonField<String>) = apply { this.filter = filter }

                    fun session(session: List<String>?) = session(JsonField.ofNullable(session))

                    /** Alias for calling [Builder.session] with `session.orElse(null)`. */
                    fun session(session: Optional<List<String>>) = session(session.getOrNull())

                    /**
                     * Sets [Builder.session] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.session] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun session(session: JsonField<List<String>>) = apply {
                        this.session = session.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [Builder.session].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSession(session: String) = apply {
                        this.session =
                            (this.session ?: JsonField.of(mutableListOf())).also {
                                checkKnown("session", it).add(session)
                            }
                    }

                    fun traceFilter(traceFilter: String?) =
                        traceFilter(JsonField.ofNullable(traceFilter))

                    /** Alias for calling [Builder.traceFilter] with `traceFilter.orElse(null)`. */
                    fun traceFilter(traceFilter: Optional<String>) =
                        traceFilter(traceFilter.getOrNull())

                    /**
                     * Sets [Builder.traceFilter] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.traceFilter] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun traceFilter(traceFilter: JsonField<String>) = apply {
                        this.traceFilter = traceFilter
                    }

                    fun treeFilter(treeFilter: String?) =
                        treeFilter(JsonField.ofNullable(treeFilter))

                    /** Alias for calling [Builder.treeFilter] with `treeFilter.orElse(null)`. */
                    fun treeFilter(treeFilter: Optional<String>) =
                        treeFilter(treeFilter.getOrNull())

                    /**
                     * Sets [Builder.treeFilter] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.treeFilter] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * Returns an immutable instance of [Filters].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Filters =
                        Filters(
                            filter,
                            (session ?: JsonMissing.of()).map { it.toImmutable() },
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
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Filters = apply {
                    if (validated) {
                        return@apply
                    }

                    filter()
                    session()
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
                        (session.asKnown().getOrNull()?.size ?: 0) +
                        (if (traceFilter.asKnown().isPresent) 1 else 0) +
                        (if (treeFilter.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Filters &&
                        filter == other.filter &&
                        session == other.session &&
                        traceFilter == other.traceFilter &&
                        treeFilter == other.treeFilter &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(filter, session, traceFilter, treeFilter, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Filters{filter=$filter, session=$session, traceFilter=$traceFilter, treeFilter=$treeFilter, additionalProperties=$additionalProperties}"
            }

            /** Include additional information about where the group_by param was set. */
            class GroupBy
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val attribute: JsonField<Attribute>,
                private val maxGroups: JsonField<Long>,
                private val path: JsonField<String>,
                private val setBy: JsonField<SetBy>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("attribute")
                    @ExcludeMissing
                    attribute: JsonField<Attribute> = JsonMissing.of(),
                    @JsonProperty("max_groups")
                    @ExcludeMissing
                    maxGroups: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("path")
                    @ExcludeMissing
                    path: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("set_by")
                    @ExcludeMissing
                    setBy: JsonField<SetBy> = JsonMissing.of(),
                ) : this(attribute, maxGroups, path, setBy, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun attribute(): Attribute = attribute.getRequired("attribute")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun maxGroups(): Optional<Long> = maxGroups.getOptional("max_groups")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun path(): Optional<String> = path.getOptional("path")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun setBy(): Optional<SetBy> = setBy.getOptional("set_by")

                /**
                 * Returns the raw JSON value of [attribute].
                 *
                 * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("attribute")
                @ExcludeMissing
                fun _attribute(): JsonField<Attribute> = attribute

                /**
                 * Returns the raw JSON value of [maxGroups].
                 *
                 * Unlike [maxGroups], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("max_groups")
                @ExcludeMissing
                fun _maxGroups(): JsonField<Long> = maxGroups

                /**
                 * Returns the raw JSON value of [path].
                 *
                 * Unlike [path], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

                /**
                 * Returns the raw JSON value of [setBy].
                 *
                 * Unlike [setBy], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("set_by") @ExcludeMissing fun _setBy(): JsonField<SetBy> = setBy

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
                     * Returns a mutable builder for constructing an instance of [GroupBy].
                     *
                     * The following fields are required:
                     * ```java
                     * .attribute()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [GroupBy]. */
                class Builder internal constructor() {

                    private var attribute: JsonField<Attribute>? = null
                    private var maxGroups: JsonField<Long> = JsonMissing.of()
                    private var path: JsonField<String> = JsonMissing.of()
                    private var setBy: JsonField<SetBy> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(groupBy: GroupBy) = apply {
                        attribute = groupBy.attribute
                        maxGroups = groupBy.maxGroups
                        path = groupBy.path
                        setBy = groupBy.setBy
                        additionalProperties = groupBy.additionalProperties.toMutableMap()
                    }

                    fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                    /**
                     * Sets [Builder.attribute] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attribute] with a well-typed [Attribute]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun attribute(attribute: JsonField<Attribute>) = apply {
                        this.attribute = attribute
                    }

                    fun maxGroups(maxGroups: Long) = maxGroups(JsonField.of(maxGroups))

                    /**
                     * Sets [Builder.maxGroups] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxGroups] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun maxGroups(maxGroups: JsonField<Long>) = apply { this.maxGroups = maxGroups }

                    fun path(path: String?) = path(JsonField.ofNullable(path))

                    /** Alias for calling [Builder.path] with `path.orElse(null)`. */
                    fun path(path: Optional<String>) = path(path.getOrNull())

                    /**
                     * Sets [Builder.path] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.path] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun path(path: JsonField<String>) = apply { this.path = path }

                    fun setBy(setBy: SetBy?) = setBy(JsonField.ofNullable(setBy))

                    /** Alias for calling [Builder.setBy] with `setBy.orElse(null)`. */
                    fun setBy(setBy: Optional<SetBy>) = setBy(setBy.getOrNull())

                    /**
                     * Sets [Builder.setBy] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.setBy] with a well-typed [SetBy] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun setBy(setBy: JsonField<SetBy>) = apply { this.setBy = setBy }

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
                     * Returns an immutable instance of [GroupBy].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .attribute()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): GroupBy =
                        GroupBy(
                            checkRequired("attribute", attribute),
                            maxGroups,
                            path,
                            setBy,
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
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): GroupBy = apply {
                    if (validated) {
                        return@apply
                    }

                    attribute().validate()
                    maxGroups()
                    path()
                    setBy().ifPresent { it.validate() }
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
                    (attribute.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (maxGroups.asKnown().isPresent) 1 else 0) +
                        (if (path.asKnown().isPresent) 1 else 0) +
                        (setBy.asKnown().getOrNull()?.validity() ?: 0)

                class Attribute
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val NAME = of("name")

                        @JvmField val RUN_TYPE = of("run_type")

                        @JvmField val TAG = of("tag")

                        @JvmField val METADATA = of("metadata")

                        @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
                    }

                    /** An enum containing [Attribute]'s known values. */
                    enum class Known {
                        NAME,
                        RUN_TYPE,
                        TAG,
                        METADATA,
                    }

                    /**
                     * An enum containing [Attribute]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Attribute] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        NAME,
                        RUN_TYPE,
                        TAG,
                        METADATA,
                        /**
                         * An enum member indicating that [Attribute] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            NAME -> Value.NAME
                            RUN_TYPE -> Value.RUN_TYPE
                            TAG -> Value.TAG
                            METADATA -> Value.METADATA
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            NAME -> Known.NAME
                            RUN_TYPE -> Known.RUN_TYPE
                            TAG -> Known.TAG
                            METADATA -> Known.METADATA
                            else -> throw LangChainInvalidDataException("Unknown Attribute: $value")
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
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Attribute = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Attribute && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class SetBy @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SECTION = of("section")

                        @JvmField val SERIES = of("series")

                        @JvmStatic fun of(value: String) = SetBy(JsonField.of(value))
                    }

                    /** An enum containing [SetBy]'s known values. */
                    enum class Known {
                        SECTION,
                        SERIES,
                    }

                    /**
                     * An enum containing [SetBy]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [SetBy] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SECTION,
                        SERIES,
                        /**
                         * An enum member indicating that [SetBy] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SECTION -> Value.SECTION
                            SERIES -> Value.SERIES
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LangChainInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SECTION -> Known.SECTION
                            SERIES -> Known.SERIES
                            else -> throw LangChainInvalidDataException("Unknown SetBy: $value")
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
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): SetBy = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SetBy && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is GroupBy &&
                        attribute == other.attribute &&
                        maxGroups == other.maxGroups &&
                        path == other.path &&
                        setBy == other.setBy &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(attribute, maxGroups, path, setBy, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "GroupBy{attribute=$attribute, maxGroups=$maxGroups, path=$path, setBy=$setBy, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(using = GroupByDefinition.Deserializer::class)
            @JsonSerialize(using = GroupByDefinition.Serializer::class)
            class GroupByDefinition
            private constructor(
                private val customChartGroupByPlain: CustomChartGroupByPlain? = null,
                private val customChartGroupByComplex: CustomChartGroupByComplex? = null,
                private val _json: JsonValue? = null,
            ) {

                fun customChartGroupByPlain(): Optional<CustomChartGroupByPlain> =
                    Optional.ofNullable(customChartGroupByPlain)

                fun customChartGroupByComplex(): Optional<CustomChartGroupByComplex> =
                    Optional.ofNullable(customChartGroupByComplex)

                fun isCustomChartGroupByPlain(): Boolean = customChartGroupByPlain != null

                fun isCustomChartGroupByComplex(): Boolean = customChartGroupByComplex != null

                fun asCustomChartGroupByPlain(): CustomChartGroupByPlain =
                    customChartGroupByPlain.getOrThrow("customChartGroupByPlain")

                fun asCustomChartGroupByComplex(): CustomChartGroupByComplex =
                    customChartGroupByComplex.getOrThrow("customChartGroupByComplex")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.langchain.smith.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = groupByDefinition.accept(new GroupByDefinition.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitCustomChartGroupByPlain(CustomChartGroupByPlain customChartGroupByPlain) {
                 *         return Optional.of(customChartGroupByPlain.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LangChainInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        customChartGroupByPlain != null ->
                            visitor.visitCustomChartGroupByPlain(customChartGroupByPlain)
                        customChartGroupByComplex != null ->
                            visitor.visitCustomChartGroupByComplex(customChartGroupByComplex)
                        else -> visitor.unknown(_json)
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
                fun validate(): GroupByDefinition = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitCustomChartGroupByPlain(
                                customChartGroupByPlain: CustomChartGroupByPlain
                            ) {
                                customChartGroupByPlain.validate()
                            }

                            override fun visitCustomChartGroupByComplex(
                                customChartGroupByComplex: CustomChartGroupByComplex
                            ) {
                                customChartGroupByComplex.validate()
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
                            override fun visitCustomChartGroupByPlain(
                                customChartGroupByPlain: CustomChartGroupByPlain
                            ) = customChartGroupByPlain.validity()

                            override fun visitCustomChartGroupByComplex(
                                customChartGroupByComplex: CustomChartGroupByComplex
                            ) = customChartGroupByComplex.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is GroupByDefinition &&
                        customChartGroupByPlain == other.customChartGroupByPlain &&
                        customChartGroupByComplex == other.customChartGroupByComplex
                }

                override fun hashCode(): Int =
                    Objects.hash(customChartGroupByPlain, customChartGroupByComplex)

                override fun toString(): String =
                    when {
                        customChartGroupByPlain != null ->
                            "GroupByDefinition{customChartGroupByPlain=$customChartGroupByPlain}"
                        customChartGroupByComplex != null ->
                            "GroupByDefinition{customChartGroupByComplex=$customChartGroupByComplex}"
                        _json != null -> "GroupByDefinition{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid GroupByDefinition")
                    }

                companion object {

                    @JvmStatic
                    fun ofCustomChartGroupByPlain(
                        customChartGroupByPlain: CustomChartGroupByPlain
                    ) = GroupByDefinition(customChartGroupByPlain = customChartGroupByPlain)

                    @JvmStatic
                    fun ofCustomChartGroupByComplex(
                        customChartGroupByComplex: CustomChartGroupByComplex
                    ) = GroupByDefinition(customChartGroupByComplex = customChartGroupByComplex)
                }

                /**
                 * An interface that defines how to map each variant of [GroupByDefinition] to a
                 * value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitCustomChartGroupByPlain(
                        customChartGroupByPlain: CustomChartGroupByPlain
                    ): T

                    fun visitCustomChartGroupByComplex(
                        customChartGroupByComplex: CustomChartGroupByComplex
                    ): T

                    /**
                     * Maps an unknown variant of [GroupByDefinition] to a value of type [T].
                     *
                     * An instance of [GroupByDefinition] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LangChainInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangChainInvalidDataException("Unknown GroupByDefinition: $json")
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<GroupByDefinition>(GroupByDefinition::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): GroupByDefinition {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<CustomChartGroupByPlain>())
                                        ?.let {
                                            GroupByDefinition(
                                                customChartGroupByPlain = it,
                                                _json = json,
                                            )
                                        },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<CustomChartGroupByComplex>(),
                                        )
                                        ?.let {
                                            GroupByDefinition(
                                                customChartGroupByComplex = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> GroupByDefinition(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<GroupByDefinition>(GroupByDefinition::class) {

                    override fun serialize(
                        value: GroupByDefinition,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.customChartGroupByPlain != null ->
                                generator.writeObject(value.customChartGroupByPlain)
                            value.customChartGroupByComplex != null ->
                                generator.writeObject(value.customChartGroupByComplex)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid GroupByDefinition")
                        }
                    }
                }

                class CustomChartGroupByPlain
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val attribute: JsonField<Attribute>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("attribute")
                        @ExcludeMissing
                        attribute: JsonField<Attribute> = JsonMissing.of()
                    ) : this(attribute, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun attribute(): Attribute = attribute.getRequired("attribute")

                    /**
                     * Returns the raw JSON value of [attribute].
                     *
                     * Unlike [attribute], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("attribute")
                    @ExcludeMissing
                    fun _attribute(): JsonField<Attribute> = attribute

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
                         * Returns a mutable builder for constructing an instance of
                         * [CustomChartGroupByPlain].
                         *
                         * The following fields are required:
                         * ```java
                         * .attribute()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CustomChartGroupByPlain]. */
                    class Builder internal constructor() {

                        private var attribute: JsonField<Attribute>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(customChartGroupByPlain: CustomChartGroupByPlain) =
                            apply {
                                attribute = customChartGroupByPlain.attribute
                                additionalProperties =
                                    customChartGroupByPlain.additionalProperties.toMutableMap()
                            }

                        fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                        /**
                         * Sets [Builder.attribute] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.attribute] with a well-typed [Attribute]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun attribute(attribute: JsonField<Attribute>) = apply {
                            this.attribute = attribute
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [CustomChartGroupByPlain].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .attribute()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CustomChartGroupByPlain =
                            CustomChartGroupByPlain(
                                checkRequired("attribute", attribute),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): CustomChartGroupByPlain = apply {
                        if (validated) {
                            return@apply
                        }

                        attribute().validate()
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
                        (attribute.asKnown().getOrNull()?.validity() ?: 0)

                    class Attribute
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val NAME = of("name")

                            @JvmField val RUN_TYPE = of("run_type")

                            @JvmField val TAG = of("tag")

                            @JvmField val PROJECT = of("project")

                            @JvmField val STATUS = of("status")

                            @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
                        }

                        /** An enum containing [Attribute]'s known values. */
                        enum class Known {
                            NAME,
                            RUN_TYPE,
                            TAG,
                            PROJECT,
                            STATUS,
                        }

                        /**
                         * An enum containing [Attribute]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Attribute] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            NAME,
                            RUN_TYPE,
                            TAG,
                            PROJECT,
                            STATUS,
                            /**
                             * An enum member indicating that [Attribute] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                NAME -> Value.NAME
                                RUN_TYPE -> Value.RUN_TYPE
                                TAG -> Value.TAG
                                PROJECT -> Value.PROJECT
                                STATUS -> Value.STATUS
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                NAME -> Known.NAME
                                RUN_TYPE -> Known.RUN_TYPE
                                TAG -> Known.TAG
                                PROJECT -> Known.PROJECT
                                STATUS -> Known.STATUS
                                else ->
                                    throw LangChainInvalidDataException("Unknown Attribute: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Attribute = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Attribute && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CustomChartGroupByPlain &&
                            attribute == other.attribute &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(attribute, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CustomChartGroupByPlain{attribute=$attribute, additionalProperties=$additionalProperties}"
                }

                class CustomChartGroupByComplex
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val attribute: JsonField<Attribute>,
                    private val path: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("attribute")
                        @ExcludeMissing
                        attribute: JsonField<Attribute> = JsonMissing.of(),
                        @JsonProperty("path")
                        @ExcludeMissing
                        path: JsonField<String> = JsonMissing.of(),
                    ) : this(attribute, path, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun attribute(): Attribute = attribute.getRequired("attribute")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun path(): String = path.getRequired("path")

                    /**
                     * Returns the raw JSON value of [attribute].
                     *
                     * Unlike [attribute], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("attribute")
                    @ExcludeMissing
                    fun _attribute(): JsonField<Attribute> = attribute

                    /**
                     * Returns the raw JSON value of [path].
                     *
                     * Unlike [path], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

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
                         * Returns a mutable builder for constructing an instance of
                         * [CustomChartGroupByComplex].
                         *
                         * The following fields are required:
                         * ```java
                         * .attribute()
                         * .path()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CustomChartGroupByComplex]. */
                    class Builder internal constructor() {

                        private var attribute: JsonField<Attribute>? = null
                        private var path: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(customChartGroupByComplex: CustomChartGroupByComplex) =
                            apply {
                                attribute = customChartGroupByComplex.attribute
                                path = customChartGroupByComplex.path
                                additionalProperties =
                                    customChartGroupByComplex.additionalProperties.toMutableMap()
                            }

                        fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

                        /**
                         * Sets [Builder.attribute] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.attribute] with a well-typed [Attribute]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun attribute(attribute: JsonField<Attribute>) = apply {
                            this.attribute = attribute
                        }

                        fun path(path: String) = path(JsonField.of(path))

                        /**
                         * Sets [Builder.path] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.path] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun path(path: JsonField<String>) = apply { this.path = path }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [CustomChartGroupByComplex].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .attribute()
                         * .path()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CustomChartGroupByComplex =
                            CustomChartGroupByComplex(
                                checkRequired("attribute", attribute),
                                checkRequired("path", path),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): CustomChartGroupByComplex = apply {
                        if (validated) {
                            return@apply
                        }

                        attribute().validate()
                        path()
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
                        (attribute.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (path.asKnown().isPresent) 1 else 0)

                    class Attribute
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val METADATA = of("metadata")

                            @JvmField val FEEDBACK_LABEL = of("feedback_label")

                            @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
                        }

                        /** An enum containing [Attribute]'s known values. */
                        enum class Known {
                            METADATA,
                            FEEDBACK_LABEL,
                        }

                        /**
                         * An enum containing [Attribute]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Attribute] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            METADATA,
                            FEEDBACK_LABEL,
                            /**
                             * An enum member indicating that [Attribute] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                METADATA -> Value.METADATA
                                FEEDBACK_LABEL -> Value.FEEDBACK_LABEL
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                METADATA -> Known.METADATA
                                FEEDBACK_LABEL -> Known.FEEDBACK_LABEL
                                else ->
                                    throw LangChainInvalidDataException("Unknown Attribute: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Attribute = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Attribute && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CustomChartGroupByComplex &&
                            attribute == other.attribute &&
                            path == other.path &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(attribute, path, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CustomChartGroupByComplex{attribute=$attribute, path=$path, additionalProperties=$additionalProperties}"
                }
            }

            class Metadata
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

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
                fun validate(): Metadata = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            /**
             * Metrics you can chart. Feedback metrics are not available for organization-scoped
             * charts.
             */
            class Metric @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val RUN_COUNT = of("run_count")

                    @JvmField val LATENCY_P50 = of("latency_p50")

                    @JvmField val LATENCY_P99 = of("latency_p99")

                    @JvmField val LATENCY_AVG = of("latency_avg")

                    @JvmField val FIRST_TOKEN_P50 = of("first_token_p50")

                    @JvmField val FIRST_TOKEN_P99 = of("first_token_p99")

                    @JvmField val TOTAL_TOKENS = of("total_tokens")

                    @JvmField val PROMPT_TOKENS = of("prompt_tokens")

                    @JvmField val COMPLETION_TOKENS = of("completion_tokens")

                    @JvmField val MEDIAN_TOKENS = of("median_tokens")

                    @JvmField val COMPLETION_TOKENS_P50 = of("completion_tokens_p50")

                    @JvmField val PROMPT_TOKENS_P50 = of("prompt_tokens_p50")

                    @JvmField val TOKENS_P99 = of("tokens_p99")

                    @JvmField val COMPLETION_TOKENS_P99 = of("completion_tokens_p99")

                    @JvmField val PROMPT_TOKENS_P99 = of("prompt_tokens_p99")

                    @JvmField val FEEDBACK = of("feedback")

                    @JvmField val FEEDBACK_SCORE_AVG = of("feedback_score_avg")

                    @JvmField val FEEDBACK_VALUES = of("feedback_values")

                    @JvmField val TOTAL_COST = of("total_cost")

                    @JvmField val PROMPT_COST = of("prompt_cost")

                    @JvmField val COMPLETION_COST = of("completion_cost")

                    @JvmField val ERROR_RATE = of("error_rate")

                    @JvmField val STREAMING_RATE = of("streaming_rate")

                    @JvmField val COST_P50 = of("cost_p50")

                    @JvmField val COST_P99 = of("cost_p99")

                    @JvmStatic fun of(value: String) = Metric(JsonField.of(value))
                }

                /** An enum containing [Metric]'s known values. */
                enum class Known {
                    RUN_COUNT,
                    LATENCY_P50,
                    LATENCY_P99,
                    LATENCY_AVG,
                    FIRST_TOKEN_P50,
                    FIRST_TOKEN_P99,
                    TOTAL_TOKENS,
                    PROMPT_TOKENS,
                    COMPLETION_TOKENS,
                    MEDIAN_TOKENS,
                    COMPLETION_TOKENS_P50,
                    PROMPT_TOKENS_P50,
                    TOKENS_P99,
                    COMPLETION_TOKENS_P99,
                    PROMPT_TOKENS_P99,
                    FEEDBACK,
                    FEEDBACK_SCORE_AVG,
                    FEEDBACK_VALUES,
                    TOTAL_COST,
                    PROMPT_COST,
                    COMPLETION_COST,
                    ERROR_RATE,
                    STREAMING_RATE,
                    COST_P50,
                    COST_P99,
                }

                /**
                 * An enum containing [Metric]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Metric] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    RUN_COUNT,
                    LATENCY_P50,
                    LATENCY_P99,
                    LATENCY_AVG,
                    FIRST_TOKEN_P50,
                    FIRST_TOKEN_P99,
                    TOTAL_TOKENS,
                    PROMPT_TOKENS,
                    COMPLETION_TOKENS,
                    MEDIAN_TOKENS,
                    COMPLETION_TOKENS_P50,
                    PROMPT_TOKENS_P50,
                    TOKENS_P99,
                    COMPLETION_TOKENS_P99,
                    PROMPT_TOKENS_P99,
                    FEEDBACK,
                    FEEDBACK_SCORE_AVG,
                    FEEDBACK_VALUES,
                    TOTAL_COST,
                    PROMPT_COST,
                    COMPLETION_COST,
                    ERROR_RATE,
                    STREAMING_RATE,
                    COST_P50,
                    COST_P99,
                    /**
                     * An enum member indicating that [Metric] was instantiated with an unknown
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
                        RUN_COUNT -> Value.RUN_COUNT
                        LATENCY_P50 -> Value.LATENCY_P50
                        LATENCY_P99 -> Value.LATENCY_P99
                        LATENCY_AVG -> Value.LATENCY_AVG
                        FIRST_TOKEN_P50 -> Value.FIRST_TOKEN_P50
                        FIRST_TOKEN_P99 -> Value.FIRST_TOKEN_P99
                        TOTAL_TOKENS -> Value.TOTAL_TOKENS
                        PROMPT_TOKENS -> Value.PROMPT_TOKENS
                        COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                        MEDIAN_TOKENS -> Value.MEDIAN_TOKENS
                        COMPLETION_TOKENS_P50 -> Value.COMPLETION_TOKENS_P50
                        PROMPT_TOKENS_P50 -> Value.PROMPT_TOKENS_P50
                        TOKENS_P99 -> Value.TOKENS_P99
                        COMPLETION_TOKENS_P99 -> Value.COMPLETION_TOKENS_P99
                        PROMPT_TOKENS_P99 -> Value.PROMPT_TOKENS_P99
                        FEEDBACK -> Value.FEEDBACK
                        FEEDBACK_SCORE_AVG -> Value.FEEDBACK_SCORE_AVG
                        FEEDBACK_VALUES -> Value.FEEDBACK_VALUES
                        TOTAL_COST -> Value.TOTAL_COST
                        PROMPT_COST -> Value.PROMPT_COST
                        COMPLETION_COST -> Value.COMPLETION_COST
                        ERROR_RATE -> Value.ERROR_RATE
                        STREAMING_RATE -> Value.STREAMING_RATE
                        COST_P50 -> Value.COST_P50
                        COST_P99 -> Value.COST_P99
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
                        RUN_COUNT -> Known.RUN_COUNT
                        LATENCY_P50 -> Known.LATENCY_P50
                        LATENCY_P99 -> Known.LATENCY_P99
                        LATENCY_AVG -> Known.LATENCY_AVG
                        FIRST_TOKEN_P50 -> Known.FIRST_TOKEN_P50
                        FIRST_TOKEN_P99 -> Known.FIRST_TOKEN_P99
                        TOTAL_TOKENS -> Known.TOTAL_TOKENS
                        PROMPT_TOKENS -> Known.PROMPT_TOKENS
                        COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                        MEDIAN_TOKENS -> Known.MEDIAN_TOKENS
                        COMPLETION_TOKENS_P50 -> Known.COMPLETION_TOKENS_P50
                        PROMPT_TOKENS_P50 -> Known.PROMPT_TOKENS_P50
                        TOKENS_P99 -> Known.TOKENS_P99
                        COMPLETION_TOKENS_P99 -> Known.COMPLETION_TOKENS_P99
                        PROMPT_TOKENS_P99 -> Known.PROMPT_TOKENS_P99
                        FEEDBACK -> Known.FEEDBACK
                        FEEDBACK_SCORE_AVG -> Known.FEEDBACK_SCORE_AVG
                        FEEDBACK_VALUES -> Known.FEEDBACK_VALUES
                        TOTAL_COST -> Known.TOTAL_COST
                        PROMPT_COST -> Known.PROMPT_COST
                        COMPLETION_COST -> Known.COMPLETION_COST
                        ERROR_RATE -> Known.ERROR_RATE
                        STREAMING_RATE -> Known.STREAMING_RATE
                        COST_P50 -> Known.COST_P50
                        COST_P99 -> Known.COST_P99
                        else -> throw LangChainInvalidDataException("Unknown Metric: $value")
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
                fun validate(): Metric = apply {
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

                    return other is Metric && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            @JsonDeserialize(using = MetricDefinition.Deserializer::class)
            @JsonSerialize(using = MetricDefinition.Serializer::class)
            class MetricDefinition
            private constructor(
                private val customChartFeedbackCountMetric: CustomChartFeedbackCountMetric? = null,
                private val customChartMetricCount: CustomChartMetricCount? = null,
                private val customChartFeedbackScoreMetricScalar:
                    CustomChartFeedbackScoreMetricScalar? =
                    null,
                private val customChartMetricScalar: CustomChartMetricScalar? = null,
                private val customChartFeedbackScoreMetricPercentile:
                    CustomChartFeedbackScoreMetricPercentile? =
                    null,
                private val customChartMetricPercentile: CustomChartMetricPercentile? = null,
                private val customChartMetricRatioInput: CustomChartMetricRatioInput? = null,
                private val _json: JsonValue? = null,
            ) {

                fun customChartFeedbackCountMetric(): Optional<CustomChartFeedbackCountMetric> =
                    Optional.ofNullable(customChartFeedbackCountMetric)

                fun customChartMetricCount(): Optional<CustomChartMetricCount> =
                    Optional.ofNullable(customChartMetricCount)

                fun customChartFeedbackScoreMetricScalar():
                    Optional<CustomChartFeedbackScoreMetricScalar> =
                    Optional.ofNullable(customChartFeedbackScoreMetricScalar)

                fun customChartMetricScalar(): Optional<CustomChartMetricScalar> =
                    Optional.ofNullable(customChartMetricScalar)

                fun customChartFeedbackScoreMetricPercentile():
                    Optional<CustomChartFeedbackScoreMetricPercentile> =
                    Optional.ofNullable(customChartFeedbackScoreMetricPercentile)

                fun customChartMetricPercentile(): Optional<CustomChartMetricPercentile> =
                    Optional.ofNullable(customChartMetricPercentile)

                fun customChartMetricRatioInput(): Optional<CustomChartMetricRatioInput> =
                    Optional.ofNullable(customChartMetricRatioInput)

                fun isCustomChartFeedbackCountMetric(): Boolean =
                    customChartFeedbackCountMetric != null

                fun isCustomChartMetricCount(): Boolean = customChartMetricCount != null

                fun isCustomChartFeedbackScoreMetricScalar(): Boolean =
                    customChartFeedbackScoreMetricScalar != null

                fun isCustomChartMetricScalar(): Boolean = customChartMetricScalar != null

                fun isCustomChartFeedbackScoreMetricPercentile(): Boolean =
                    customChartFeedbackScoreMetricPercentile != null

                fun isCustomChartMetricPercentile(): Boolean = customChartMetricPercentile != null

                fun isCustomChartMetricRatioInput(): Boolean = customChartMetricRatioInput != null

                fun asCustomChartFeedbackCountMetric(): CustomChartFeedbackCountMetric =
                    customChartFeedbackCountMetric.getOrThrow("customChartFeedbackCountMetric")

                fun asCustomChartMetricCount(): CustomChartMetricCount =
                    customChartMetricCount.getOrThrow("customChartMetricCount")

                fun asCustomChartFeedbackScoreMetricScalar(): CustomChartFeedbackScoreMetricScalar =
                    customChartFeedbackScoreMetricScalar.getOrThrow(
                        "customChartFeedbackScoreMetricScalar"
                    )

                fun asCustomChartMetricScalar(): CustomChartMetricScalar =
                    customChartMetricScalar.getOrThrow("customChartMetricScalar")

                fun asCustomChartFeedbackScoreMetricPercentile():
                    CustomChartFeedbackScoreMetricPercentile =
                    customChartFeedbackScoreMetricPercentile.getOrThrow(
                        "customChartFeedbackScoreMetricPercentile"
                    )

                fun asCustomChartMetricPercentile(): CustomChartMetricPercentile =
                    customChartMetricPercentile.getOrThrow("customChartMetricPercentile")

                fun asCustomChartMetricRatioInput(): CustomChartMetricRatioInput =
                    customChartMetricRatioInput.getOrThrow("customChartMetricRatioInput")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.langchain.smith.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = metricDefinition.accept(new MetricDefinition.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitCustomChartFeedbackCountMetric(CustomChartFeedbackCountMetric customChartFeedbackCountMetric) {
                 *         return Optional.of(customChartFeedbackCountMetric.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws LangChainInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        customChartFeedbackCountMetric != null ->
                            visitor.visitCustomChartFeedbackCountMetric(
                                customChartFeedbackCountMetric
                            )
                        customChartMetricCount != null ->
                            visitor.visitCustomChartMetricCount(customChartMetricCount)
                        customChartFeedbackScoreMetricScalar != null ->
                            visitor.visitCustomChartFeedbackScoreMetricScalar(
                                customChartFeedbackScoreMetricScalar
                            )
                        customChartMetricScalar != null ->
                            visitor.visitCustomChartMetricScalar(customChartMetricScalar)
                        customChartFeedbackScoreMetricPercentile != null ->
                            visitor.visitCustomChartFeedbackScoreMetricPercentile(
                                customChartFeedbackScoreMetricPercentile
                            )
                        customChartMetricPercentile != null ->
                            visitor.visitCustomChartMetricPercentile(customChartMetricPercentile)
                        customChartMetricRatioInput != null ->
                            visitor.visitCustomChartMetricRatioInput(customChartMetricRatioInput)
                        else -> visitor.unknown(_json)
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
                fun validate(): MetricDefinition = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitCustomChartFeedbackCountMetric(
                                customChartFeedbackCountMetric: CustomChartFeedbackCountMetric
                            ) {
                                customChartFeedbackCountMetric.validate()
                            }

                            override fun visitCustomChartMetricCount(
                                customChartMetricCount: CustomChartMetricCount
                            ) {
                                customChartMetricCount.validate()
                            }

                            override fun visitCustomChartFeedbackScoreMetricScalar(
                                customChartFeedbackScoreMetricScalar:
                                    CustomChartFeedbackScoreMetricScalar
                            ) {
                                customChartFeedbackScoreMetricScalar.validate()
                            }

                            override fun visitCustomChartMetricScalar(
                                customChartMetricScalar: CustomChartMetricScalar
                            ) {
                                customChartMetricScalar.validate()
                            }

                            override fun visitCustomChartFeedbackScoreMetricPercentile(
                                customChartFeedbackScoreMetricPercentile:
                                    CustomChartFeedbackScoreMetricPercentile
                            ) {
                                customChartFeedbackScoreMetricPercentile.validate()
                            }

                            override fun visitCustomChartMetricPercentile(
                                customChartMetricPercentile: CustomChartMetricPercentile
                            ) {
                                customChartMetricPercentile.validate()
                            }

                            override fun visitCustomChartMetricRatioInput(
                                customChartMetricRatioInput: CustomChartMetricRatioInput
                            ) {
                                customChartMetricRatioInput.validate()
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
                            override fun visitCustomChartFeedbackCountMetric(
                                customChartFeedbackCountMetric: CustomChartFeedbackCountMetric
                            ) = customChartFeedbackCountMetric.validity()

                            override fun visitCustomChartMetricCount(
                                customChartMetricCount: CustomChartMetricCount
                            ) = customChartMetricCount.validity()

                            override fun visitCustomChartFeedbackScoreMetricScalar(
                                customChartFeedbackScoreMetricScalar:
                                    CustomChartFeedbackScoreMetricScalar
                            ) = customChartFeedbackScoreMetricScalar.validity()

                            override fun visitCustomChartMetricScalar(
                                customChartMetricScalar: CustomChartMetricScalar
                            ) = customChartMetricScalar.validity()

                            override fun visitCustomChartFeedbackScoreMetricPercentile(
                                customChartFeedbackScoreMetricPercentile:
                                    CustomChartFeedbackScoreMetricPercentile
                            ) = customChartFeedbackScoreMetricPercentile.validity()

                            override fun visitCustomChartMetricPercentile(
                                customChartMetricPercentile: CustomChartMetricPercentile
                            ) = customChartMetricPercentile.validity()

                            override fun visitCustomChartMetricRatioInput(
                                customChartMetricRatioInput: CustomChartMetricRatioInput
                            ) = customChartMetricRatioInput.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MetricDefinition &&
                        customChartFeedbackCountMetric == other.customChartFeedbackCountMetric &&
                        customChartMetricCount == other.customChartMetricCount &&
                        customChartFeedbackScoreMetricScalar ==
                            other.customChartFeedbackScoreMetricScalar &&
                        customChartMetricScalar == other.customChartMetricScalar &&
                        customChartFeedbackScoreMetricPercentile ==
                            other.customChartFeedbackScoreMetricPercentile &&
                        customChartMetricPercentile == other.customChartMetricPercentile &&
                        customChartMetricRatioInput == other.customChartMetricRatioInput
                }

                override fun hashCode(): Int =
                    Objects.hash(
                        customChartFeedbackCountMetric,
                        customChartMetricCount,
                        customChartFeedbackScoreMetricScalar,
                        customChartMetricScalar,
                        customChartFeedbackScoreMetricPercentile,
                        customChartMetricPercentile,
                        customChartMetricRatioInput,
                    )

                override fun toString(): String =
                    when {
                        customChartFeedbackCountMetric != null ->
                            "MetricDefinition{customChartFeedbackCountMetric=$customChartFeedbackCountMetric}"
                        customChartMetricCount != null ->
                            "MetricDefinition{customChartMetricCount=$customChartMetricCount}"
                        customChartFeedbackScoreMetricScalar != null ->
                            "MetricDefinition{customChartFeedbackScoreMetricScalar=$customChartFeedbackScoreMetricScalar}"
                        customChartMetricScalar != null ->
                            "MetricDefinition{customChartMetricScalar=$customChartMetricScalar}"
                        customChartFeedbackScoreMetricPercentile != null ->
                            "MetricDefinition{customChartFeedbackScoreMetricPercentile=$customChartFeedbackScoreMetricPercentile}"
                        customChartMetricPercentile != null ->
                            "MetricDefinition{customChartMetricPercentile=$customChartMetricPercentile}"
                        customChartMetricRatioInput != null ->
                            "MetricDefinition{customChartMetricRatioInput=$customChartMetricRatioInput}"
                        _json != null -> "MetricDefinition{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid MetricDefinition")
                    }

                companion object {

                    @JvmStatic
                    fun ofCustomChartFeedbackCountMetric(
                        customChartFeedbackCountMetric: CustomChartFeedbackCountMetric
                    ) =
                        MetricDefinition(
                            customChartFeedbackCountMetric = customChartFeedbackCountMetric
                        )

                    @JvmStatic
                    fun ofCustomChartMetricCount(customChartMetricCount: CustomChartMetricCount) =
                        MetricDefinition(customChartMetricCount = customChartMetricCount)

                    @JvmStatic
                    fun ofCustomChartFeedbackScoreMetricScalar(
                        customChartFeedbackScoreMetricScalar: CustomChartFeedbackScoreMetricScalar
                    ) =
                        MetricDefinition(
                            customChartFeedbackScoreMetricScalar =
                                customChartFeedbackScoreMetricScalar
                        )

                    @JvmStatic
                    fun ofCustomChartMetricScalar(
                        customChartMetricScalar: CustomChartMetricScalar
                    ) = MetricDefinition(customChartMetricScalar = customChartMetricScalar)

                    @JvmStatic
                    fun ofCustomChartFeedbackScoreMetricPercentile(
                        customChartFeedbackScoreMetricPercentile:
                            CustomChartFeedbackScoreMetricPercentile
                    ) =
                        MetricDefinition(
                            customChartFeedbackScoreMetricPercentile =
                                customChartFeedbackScoreMetricPercentile
                        )

                    @JvmStatic
                    fun ofCustomChartMetricPercentile(
                        customChartMetricPercentile: CustomChartMetricPercentile
                    ) = MetricDefinition(customChartMetricPercentile = customChartMetricPercentile)

                    @JvmStatic
                    fun ofCustomChartMetricRatioInput(
                        customChartMetricRatioInput: CustomChartMetricRatioInput
                    ) = MetricDefinition(customChartMetricRatioInput = customChartMetricRatioInput)
                }

                /**
                 * An interface that defines how to map each variant of [MetricDefinition] to a
                 * value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitCustomChartFeedbackCountMetric(
                        customChartFeedbackCountMetric: CustomChartFeedbackCountMetric
                    ): T

                    fun visitCustomChartMetricCount(
                        customChartMetricCount: CustomChartMetricCount
                    ): T

                    fun visitCustomChartFeedbackScoreMetricScalar(
                        customChartFeedbackScoreMetricScalar: CustomChartFeedbackScoreMetricScalar
                    ): T

                    fun visitCustomChartMetricScalar(
                        customChartMetricScalar: CustomChartMetricScalar
                    ): T

                    fun visitCustomChartFeedbackScoreMetricPercentile(
                        customChartFeedbackScoreMetricPercentile:
                            CustomChartFeedbackScoreMetricPercentile
                    ): T

                    fun visitCustomChartMetricPercentile(
                        customChartMetricPercentile: CustomChartMetricPercentile
                    ): T

                    fun visitCustomChartMetricRatioInput(
                        customChartMetricRatioInput: CustomChartMetricRatioInput
                    ): T

                    /**
                     * Maps an unknown variant of [MetricDefinition] to a value of type [T].
                     *
                     * An instance of [MetricDefinition] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws LangChainInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw LangChainInvalidDataException("Unknown MetricDefinition: $json")
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<MetricDefinition>(MetricDefinition::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): MetricDefinition {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<CustomChartFeedbackCountMetric>(),
                                        )
                                        ?.let {
                                            MetricDefinition(
                                                customChartFeedbackCountMetric = it,
                                                _json = json,
                                            )
                                        },
                                    tryDeserialize(node, jacksonTypeRef<CustomChartMetricCount>())
                                        ?.let {
                                            MetricDefinition(
                                                customChartMetricCount = it,
                                                _json = json,
                                            )
                                        },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<CustomChartFeedbackScoreMetricScalar>(),
                                        )
                                        ?.let {
                                            MetricDefinition(
                                                customChartFeedbackScoreMetricScalar = it,
                                                _json = json,
                                            )
                                        },
                                    tryDeserialize(node, jacksonTypeRef<CustomChartMetricScalar>())
                                        ?.let {
                                            MetricDefinition(
                                                customChartMetricScalar = it,
                                                _json = json,
                                            )
                                        },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<
                                                CustomChartFeedbackScoreMetricPercentile
                                            >(),
                                        )
                                        ?.let {
                                            MetricDefinition(
                                                customChartFeedbackScoreMetricPercentile = it,
                                                _json = json,
                                            )
                                        },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<CustomChartMetricPercentile>(),
                                        )
                                        ?.let {
                                            MetricDefinition(
                                                customChartMetricPercentile = it,
                                                _json = json,
                                            )
                                        },
                                    tryDeserialize(
                                            node,
                                            jacksonTypeRef<CustomChartMetricRatioInput>(),
                                        )
                                        ?.let {
                                            MetricDefinition(
                                                customChartMetricRatioInput = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> MetricDefinition(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<MetricDefinition>(MetricDefinition::class) {

                    override fun serialize(
                        value: MetricDefinition,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.customChartFeedbackCountMetric != null ->
                                generator.writeObject(value.customChartFeedbackCountMetric)
                            value.customChartMetricCount != null ->
                                generator.writeObject(value.customChartMetricCount)
                            value.customChartFeedbackScoreMetricScalar != null ->
                                generator.writeObject(value.customChartFeedbackScoreMetricScalar)
                            value.customChartMetricScalar != null ->
                                generator.writeObject(value.customChartMetricScalar)
                            value.customChartFeedbackScoreMetricPercentile != null ->
                                generator.writeObject(
                                    value.customChartFeedbackScoreMetricPercentile
                                )
                            value.customChartMetricPercentile != null ->
                                generator.writeObject(value.customChartMetricPercentile)
                            value.customChartMetricRatioInput != null ->
                                generator.writeObject(value.customChartMetricRatioInput)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid MetricDefinition")
                        }
                    }
                }

                class CustomChartFeedbackCountMetric
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val entity: JsonValue,
                    private val params: JsonField<Params>,
                    private val filter: JsonField<String>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("entity")
                        @ExcludeMissing
                        entity: JsonValue = JsonMissing.of(),
                        @JsonProperty("params")
                        @ExcludeMissing
                        params: JsonField<Params> = JsonMissing.of(),
                        @JsonProperty("filter")
                        @ExcludeMissing
                        filter: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(entity, params, filter, type, mutableMapOf())

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("feedback")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonValue = entity

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun params(): Params = params.getRequired("params")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun filter(): Optional<String> = filter.getOptional("filter")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun type(): Optional<Type> = type.getOptional("type")

                    /**
                     * Returns the raw JSON value of [params].
                     *
                     * Unlike [params], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("params")
                    @ExcludeMissing
                    fun _params(): JsonField<Params> = params

                    /**
                     * Returns the raw JSON value of [filter].
                     *
                     * Unlike [filter], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("filter")
                    @ExcludeMissing
                    fun _filter(): JsonField<String> = filter

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                         * Returns a mutable builder for constructing an instance of
                         * [CustomChartFeedbackCountMetric].
                         *
                         * The following fields are required:
                         * ```java
                         * .params()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CustomChartFeedbackCountMetric]. */
                    class Builder internal constructor() {

                        private var entity: JsonValue = JsonValue.from("feedback")
                        private var params: JsonField<Params>? = null
                        private var filter: JsonField<String> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(
                            customChartFeedbackCountMetric: CustomChartFeedbackCountMetric
                        ) = apply {
                            entity = customChartFeedbackCountMetric.entity
                            params = customChartFeedbackCountMetric.params
                            filter = customChartFeedbackCountMetric.filter
                            type = customChartFeedbackCountMetric.type
                            additionalProperties =
                                customChartFeedbackCountMetric.additionalProperties.toMutableMap()
                        }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("feedback")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun entity(entity: JsonValue) = apply { this.entity = entity }

                        fun params(params: Params) = params(JsonField.of(params))

                        /**
                         * Sets [Builder.params] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.params] with a well-typed [Params] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun params(params: JsonField<Params>) = apply { this.params = params }

                        fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
                        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                        /**
                         * Sets [Builder.filter] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.filter] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [CustomChartFeedbackCountMetric].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .params()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CustomChartFeedbackCountMetric =
                            CustomChartFeedbackCountMetric(
                                entity,
                                checkRequired("params", params),
                                filter,
                                type,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): CustomChartFeedbackCountMetric = apply {
                        if (validated) {
                            return@apply
                        }

                        _entity().let {
                            if (it != JsonValue.from("feedback")) {
                                throw LangChainInvalidDataException(
                                    "'entity' is invalid, received $it"
                                )
                            }
                        }
                        params().validate()
                        filter()
                        type().ifPresent { it.validate() }
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
                        entity.let { if (it == JsonValue.from("feedback")) 1 else 0 } +
                            (params.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (filter.asKnown().isPresent) 1 else 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    class Params
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val feedbackKey: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("feedback_key")
                            @ExcludeMissing
                            feedbackKey: JsonField<String> = JsonMissing.of()
                        ) : this(feedbackKey, mutableMapOf())

                        /**
                         * @throws LangChainInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

                        /**
                         * Returns the raw JSON value of [feedbackKey].
                         *
                         * Unlike [feedbackKey], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("feedback_key")
                        @ExcludeMissing
                        fun _feedbackKey(): JsonField<String> = feedbackKey

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
                             * Returns a mutable builder for constructing an instance of [Params].
                             *
                             * The following fields are required:
                             * ```java
                             * .feedbackKey()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Params]. */
                        class Builder internal constructor() {

                            private var feedbackKey: JsonField<String>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(params: Params) = apply {
                                feedbackKey = params.feedbackKey
                                additionalProperties = params.additionalProperties.toMutableMap()
                            }

                            fun feedbackKey(feedbackKey: String) =
                                feedbackKey(JsonField.of(feedbackKey))

                            /**
                             * Sets [Builder.feedbackKey] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.feedbackKey] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun feedbackKey(feedbackKey: JsonField<String>) = apply {
                                this.feedbackKey = feedbackKey
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Params].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .feedbackKey()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Params =
                                Params(
                                    checkRequired("feedbackKey", feedbackKey),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Params = apply {
                            if (validated) {
                                return@apply
                            }

                            feedbackKey()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (feedbackKey.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Params &&
                                feedbackKey == other.feedbackKey &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(feedbackKey, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Params{feedbackKey=$feedbackKey, additionalProperties=$additionalProperties}"
                    }

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val COUNT = of("count")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            COUNT
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            COUNT,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                COUNT -> Value.COUNT
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                COUNT -> Known.COUNT
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CustomChartFeedbackCountMetric &&
                            entity == other.entity &&
                            params == other.params &&
                            filter == other.filter &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(entity, params, filter, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CustomChartFeedbackCountMetric{entity=$entity, params=$params, filter=$filter, type=$type, additionalProperties=$additionalProperties}"
                }

                class CustomChartMetricCount
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val filter: JsonField<String>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("filter")
                        @ExcludeMissing
                        filter: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                    ) : this(filter, type, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun filter(): Optional<String> = filter.getOptional("filter")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun type(): Optional<Type> = type.getOptional("type")

                    /**
                     * Returns the raw JSON value of [filter].
                     *
                     * Unlike [filter], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("filter")
                    @ExcludeMissing
                    fun _filter(): JsonField<String> = filter

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                         * Returns a mutable builder for constructing an instance of
                         * [CustomChartMetricCount].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CustomChartMetricCount]. */
                    class Builder internal constructor() {

                        private var filter: JsonField<String> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(customChartMetricCount: CustomChartMetricCount) = apply {
                            filter = customChartMetricCount.filter
                            type = customChartMetricCount.type
                            additionalProperties =
                                customChartMetricCount.additionalProperties.toMutableMap()
                        }

                        fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
                        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                        /**
                         * Sets [Builder.filter] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.filter] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [CustomChartMetricCount].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): CustomChartMetricCount =
                            CustomChartMetricCount(
                                filter,
                                type,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): CustomChartMetricCount = apply {
                        if (validated) {
                            return@apply
                        }

                        filter()
                        type().ifPresent { it.validate() }
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
                            (type.asKnown().getOrNull()?.validity() ?: 0)

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val COUNT = of("count")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            COUNT
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            COUNT,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                COUNT -> Value.COUNT
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                COUNT -> Known.COUNT
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CustomChartMetricCount &&
                            filter == other.filter &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(filter, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CustomChartMetricCount{filter=$filter, type=$type, additionalProperties=$additionalProperties}"
                }

                class CustomChartFeedbackScoreMetricScalar
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val field: JsonValue,
                    private val params: JsonField<Params>,
                    private val type: JsonField<Type>,
                    private val filter: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("field") @ExcludeMissing field: JsonValue = JsonMissing.of(),
                        @JsonProperty("params")
                        @ExcludeMissing
                        params: JsonField<Params> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("filter")
                        @ExcludeMissing
                        filter: JsonField<String> = JsonMissing.of(),
                    ) : this(field, params, type, filter, mutableMapOf())

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("feedback_score")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("field") @ExcludeMissing fun _field(): JsonValue = field

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun params(): Params = params.getRequired("params")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun filter(): Optional<String> = filter.getOptional("filter")

                    /**
                     * Returns the raw JSON value of [params].
                     *
                     * Unlike [params], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("params")
                    @ExcludeMissing
                    fun _params(): JsonField<Params> = params

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [filter].
                     *
                     * Unlike [filter], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("filter")
                    @ExcludeMissing
                    fun _filter(): JsonField<String> = filter

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
                         * Returns a mutable builder for constructing an instance of
                         * [CustomChartFeedbackScoreMetricScalar].
                         *
                         * The following fields are required:
                         * ```java
                         * .params()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CustomChartFeedbackScoreMetricScalar]. */
                    class Builder internal constructor() {

                        private var field: JsonValue = JsonValue.from("feedback_score")
                        private var params: JsonField<Params>? = null
                        private var type: JsonField<Type>? = null
                        private var filter: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(
                            customChartFeedbackScoreMetricScalar:
                                CustomChartFeedbackScoreMetricScalar
                        ) = apply {
                            field = customChartFeedbackScoreMetricScalar.field
                            params = customChartFeedbackScoreMetricScalar.params
                            type = customChartFeedbackScoreMetricScalar.type
                            filter = customChartFeedbackScoreMetricScalar.filter
                            additionalProperties =
                                customChartFeedbackScoreMetricScalar.additionalProperties
                                    .toMutableMap()
                        }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("feedback_score")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun field(field: JsonValue) = apply { this.field = field }

                        fun params(params: Params) = params(JsonField.of(params))

                        /**
                         * Sets [Builder.params] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.params] with a well-typed [Params] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun params(params: JsonField<Params>) = apply { this.params = params }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
                        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                        /**
                         * Sets [Builder.filter] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.filter] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [CustomChartFeedbackScoreMetricScalar].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .params()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CustomChartFeedbackScoreMetricScalar =
                            CustomChartFeedbackScoreMetricScalar(
                                field,
                                checkRequired("params", params),
                                checkRequired("type", type),
                                filter,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): CustomChartFeedbackScoreMetricScalar = apply {
                        if (validated) {
                            return@apply
                        }

                        _field().let {
                            if (it != JsonValue.from("feedback_score")) {
                                throw LangChainInvalidDataException(
                                    "'field' is invalid, received $it"
                                )
                            }
                        }
                        params().validate()
                        type().validate()
                        filter()
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
                        field.let { if (it == JsonValue.from("feedback_score")) 1 else 0 } +
                            (params.asKnown().getOrNull()?.validity() ?: 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (filter.asKnown().isPresent) 1 else 0)

                    class Params
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val feedbackKey: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("feedback_key")
                            @ExcludeMissing
                            feedbackKey: JsonField<String> = JsonMissing.of()
                        ) : this(feedbackKey, mutableMapOf())

                        /**
                         * @throws LangChainInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

                        /**
                         * Returns the raw JSON value of [feedbackKey].
                         *
                         * Unlike [feedbackKey], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("feedback_key")
                        @ExcludeMissing
                        fun _feedbackKey(): JsonField<String> = feedbackKey

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
                             * Returns a mutable builder for constructing an instance of [Params].
                             *
                             * The following fields are required:
                             * ```java
                             * .feedbackKey()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Params]. */
                        class Builder internal constructor() {

                            private var feedbackKey: JsonField<String>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(params: Params) = apply {
                                feedbackKey = params.feedbackKey
                                additionalProperties = params.additionalProperties.toMutableMap()
                            }

                            fun feedbackKey(feedbackKey: String) =
                                feedbackKey(JsonField.of(feedbackKey))

                            /**
                             * Sets [Builder.feedbackKey] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.feedbackKey] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun feedbackKey(feedbackKey: JsonField<String>) = apply {
                                this.feedbackKey = feedbackKey
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Params].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .feedbackKey()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Params =
                                Params(
                                    checkRequired("feedbackKey", feedbackKey),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Params = apply {
                            if (validated) {
                                return@apply
                            }

                            feedbackKey()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (feedbackKey.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Params &&
                                feedbackKey == other.feedbackKey &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(feedbackKey, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Params{feedbackKey=$feedbackKey, additionalProperties=$additionalProperties}"
                    }

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val SUM = of("sum")

                            @JvmField val MAX = of("max")

                            @JvmField val MIN = of("min")

                            @JvmField val AVG = of("avg")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            SUM,
                            MAX,
                            MIN,
                            AVG,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            SUM,
                            MAX,
                            MIN,
                            AVG,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                SUM -> Value.SUM
                                MAX -> Value.MAX
                                MIN -> Value.MIN
                                AVG -> Value.AVG
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                SUM -> Known.SUM
                                MAX -> Known.MAX
                                MIN -> Known.MIN
                                AVG -> Known.AVG
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CustomChartFeedbackScoreMetricScalar &&
                            field == other.field &&
                            params == other.params &&
                            type == other.type &&
                            filter == other.filter &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(field, params, type, filter, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CustomChartFeedbackScoreMetricScalar{field=$field, params=$params, type=$type, filter=$filter, additionalProperties=$additionalProperties}"
                }

                class CustomChartMetricScalar
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val field: JsonField<Field>,
                    private val type: JsonField<Type>,
                    private val filter: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("field")
                        @ExcludeMissing
                        field: JsonField<Field> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("filter")
                        @ExcludeMissing
                        filter: JsonField<String> = JsonMissing.of(),
                    ) : this(field, type, filter, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun field(): Field = field.getRequired("field")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun filter(): Optional<String> = filter.getOptional("filter")

                    /**
                     * Returns the raw JSON value of [field].
                     *
                     * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [filter].
                     *
                     * Unlike [filter], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("filter")
                    @ExcludeMissing
                    fun _filter(): JsonField<String> = filter

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
                         * Returns a mutable builder for constructing an instance of
                         * [CustomChartMetricScalar].
                         *
                         * The following fields are required:
                         * ```java
                         * .field()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CustomChartMetricScalar]. */
                    class Builder internal constructor() {

                        private var field: JsonField<Field>? = null
                        private var type: JsonField<Type>? = null
                        private var filter: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(customChartMetricScalar: CustomChartMetricScalar) =
                            apply {
                                field = customChartMetricScalar.field
                                type = customChartMetricScalar.type
                                filter = customChartMetricScalar.filter
                                additionalProperties =
                                    customChartMetricScalar.additionalProperties.toMutableMap()
                            }

                        fun field(field: Field) = field(JsonField.of(field))

                        /**
                         * Sets [Builder.field] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.field] with a well-typed [Field] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun field(field: JsonField<Field>) = apply { this.field = field }

                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
                        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                        /**
                         * Sets [Builder.filter] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.filter] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [CustomChartMetricScalar].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .field()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CustomChartMetricScalar =
                            CustomChartMetricScalar(
                                checkRequired("field", field),
                                checkRequired("type", type),
                                filter,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): CustomChartMetricScalar = apply {
                        if (validated) {
                            return@apply
                        }

                        field().validate()
                        type().validate()
                        filter()
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
                        (field.asKnown().getOrNull()?.validity() ?: 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (filter.asKnown().isPresent) 1 else 0)

                    class Field
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val LATENCY_SECONDS = of("latency_seconds")

                            @JvmField val FIRST_TOKEN_SECONDS = of("first_token_seconds")

                            @JvmField val TOTAL_TOKENS = of("total_tokens")

                            @JvmField val PROMPT_TOKENS = of("prompt_tokens")

                            @JvmField val COMPLETION_TOKENS = of("completion_tokens")

                            @JvmField val TOTAL_COST = of("total_cost")

                            @JvmField val PROMPT_COST = of("prompt_cost")

                            @JvmField val COMPLETION_COST = of("completion_cost")

                            @JvmField val FEEDBACK_SCORE = of("feedback_score")

                            @JvmStatic fun of(value: String) = Field(JsonField.of(value))
                        }

                        /** An enum containing [Field]'s known values. */
                        enum class Known {
                            LATENCY_SECONDS,
                            FIRST_TOKEN_SECONDS,
                            TOTAL_TOKENS,
                            PROMPT_TOKENS,
                            COMPLETION_TOKENS,
                            TOTAL_COST,
                            PROMPT_COST,
                            COMPLETION_COST,
                            FEEDBACK_SCORE,
                        }

                        /**
                         * An enum containing [Field]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Field] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            LATENCY_SECONDS,
                            FIRST_TOKEN_SECONDS,
                            TOTAL_TOKENS,
                            PROMPT_TOKENS,
                            COMPLETION_TOKENS,
                            TOTAL_COST,
                            PROMPT_COST,
                            COMPLETION_COST,
                            FEEDBACK_SCORE,
                            /**
                             * An enum member indicating that [Field] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                LATENCY_SECONDS -> Value.LATENCY_SECONDS
                                FIRST_TOKEN_SECONDS -> Value.FIRST_TOKEN_SECONDS
                                TOTAL_TOKENS -> Value.TOTAL_TOKENS
                                PROMPT_TOKENS -> Value.PROMPT_TOKENS
                                COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                                TOTAL_COST -> Value.TOTAL_COST
                                PROMPT_COST -> Value.PROMPT_COST
                                COMPLETION_COST -> Value.COMPLETION_COST
                                FEEDBACK_SCORE -> Value.FEEDBACK_SCORE
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                LATENCY_SECONDS -> Known.LATENCY_SECONDS
                                FIRST_TOKEN_SECONDS -> Known.FIRST_TOKEN_SECONDS
                                TOTAL_TOKENS -> Known.TOTAL_TOKENS
                                PROMPT_TOKENS -> Known.PROMPT_TOKENS
                                COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                                TOTAL_COST -> Known.TOTAL_COST
                                PROMPT_COST -> Known.PROMPT_COST
                                COMPLETION_COST -> Known.COMPLETION_COST
                                FEEDBACK_SCORE -> Known.FEEDBACK_SCORE
                                else -> throw LangChainInvalidDataException("Unknown Field: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Field = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Field && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val SUM = of("sum")

                            @JvmField val MAX = of("max")

                            @JvmField val MIN = of("min")

                            @JvmField val AVG = of("avg")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            SUM,
                            MAX,
                            MIN,
                            AVG,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            SUM,
                            MAX,
                            MIN,
                            AVG,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                SUM -> Value.SUM
                                MAX -> Value.MAX
                                MIN -> Value.MIN
                                AVG -> Value.AVG
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                SUM -> Known.SUM
                                MAX -> Known.MAX
                                MIN -> Known.MIN
                                AVG -> Known.AVG
                                else -> throw LangChainInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CustomChartMetricScalar &&
                            field == other.field &&
                            type == other.type &&
                            filter == other.filter &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(field, type, filter, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CustomChartMetricScalar{field=$field, type=$type, filter=$filter, additionalProperties=$additionalProperties}"
                }

                class CustomChartFeedbackScoreMetricPercentile
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val field: JsonValue,
                    private val params: JsonField<Params>,
                    private val type: JsonValue,
                    private val filter: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("field") @ExcludeMissing field: JsonValue = JsonMissing.of(),
                        @JsonProperty("params")
                        @ExcludeMissing
                        params: JsonField<Params> = JsonMissing.of(),
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        @JsonProperty("filter")
                        @ExcludeMissing
                        filter: JsonField<String> = JsonMissing.of(),
                    ) : this(field, params, type, filter, mutableMapOf())

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("feedback_score")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("field") @ExcludeMissing fun _field(): JsonValue = field

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun params(): Params = params.getRequired("params")

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("percentile")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun filter(): Optional<String> = filter.getOptional("filter")

                    /**
                     * Returns the raw JSON value of [params].
                     *
                     * Unlike [params], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("params")
                    @ExcludeMissing
                    fun _params(): JsonField<Params> = params

                    /**
                     * Returns the raw JSON value of [filter].
                     *
                     * Unlike [filter], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("filter")
                    @ExcludeMissing
                    fun _filter(): JsonField<String> = filter

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
                         * Returns a mutable builder for constructing an instance of
                         * [CustomChartFeedbackScoreMetricPercentile].
                         *
                         * The following fields are required:
                         * ```java
                         * .params()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CustomChartFeedbackScoreMetricPercentile]. */
                    class Builder internal constructor() {

                        private var field: JsonValue = JsonValue.from("feedback_score")
                        private var params: JsonField<Params>? = null
                        private var type: JsonValue = JsonValue.from("percentile")
                        private var filter: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(
                            customChartFeedbackScoreMetricPercentile:
                                CustomChartFeedbackScoreMetricPercentile
                        ) = apply {
                            field = customChartFeedbackScoreMetricPercentile.field
                            params = customChartFeedbackScoreMetricPercentile.params
                            type = customChartFeedbackScoreMetricPercentile.type
                            filter = customChartFeedbackScoreMetricPercentile.filter
                            additionalProperties =
                                customChartFeedbackScoreMetricPercentile.additionalProperties
                                    .toMutableMap()
                        }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("feedback_score")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun field(field: JsonValue) = apply { this.field = field }

                        fun params(params: Params) = params(JsonField.of(params))

                        /**
                         * Sets [Builder.params] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.params] with a well-typed [Params] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun params(params: JsonField<Params>) = apply { this.params = params }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("percentile")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
                        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                        /**
                         * Sets [Builder.filter] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.filter] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of
                         * [CustomChartFeedbackScoreMetricPercentile].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .params()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CustomChartFeedbackScoreMetricPercentile =
                            CustomChartFeedbackScoreMetricPercentile(
                                field,
                                checkRequired("params", params),
                                type,
                                filter,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): CustomChartFeedbackScoreMetricPercentile = apply {
                        if (validated) {
                            return@apply
                        }

                        _field().let {
                            if (it != JsonValue.from("feedback_score")) {
                                throw LangChainInvalidDataException(
                                    "'field' is invalid, received $it"
                                )
                            }
                        }
                        params().validate()
                        _type().let {
                            if (it != JsonValue.from("percentile")) {
                                throw LangChainInvalidDataException(
                                    "'type' is invalid, received $it"
                                )
                            }
                        }
                        filter()
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
                        field.let { if (it == JsonValue.from("feedback_score")) 1 else 0 } +
                            (params.asKnown().getOrNull()?.validity() ?: 0) +
                            type.let { if (it == JsonValue.from("percentile")) 1 else 0 } +
                            (if (filter.asKnown().isPresent) 1 else 0)

                    class Params
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val feedbackKey: JsonField<String>,
                        private val p: JsonField<Double>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("feedback_key")
                            @ExcludeMissing
                            feedbackKey: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("p")
                            @ExcludeMissing
                            p: JsonField<Double> = JsonMissing.of(),
                        ) : this(feedbackKey, p, mutableMapOf())

                        /**
                         * @throws LangChainInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

                        /**
                         * @throws LangChainInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun p(): Double = p.getRequired("p")

                        /**
                         * Returns the raw JSON value of [feedbackKey].
                         *
                         * Unlike [feedbackKey], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("feedback_key")
                        @ExcludeMissing
                        fun _feedbackKey(): JsonField<String> = feedbackKey

                        /**
                         * Returns the raw JSON value of [p].
                         *
                         * Unlike [p], this method doesn't throw if the JSON field has an unexpected
                         * type.
                         */
                        @JsonProperty("p") @ExcludeMissing fun _p(): JsonField<Double> = p

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
                             * Returns a mutable builder for constructing an instance of [Params].
                             *
                             * The following fields are required:
                             * ```java
                             * .feedbackKey()
                             * .p()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Params]. */
                        class Builder internal constructor() {

                            private var feedbackKey: JsonField<String>? = null
                            private var p: JsonField<Double>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(params: Params) = apply {
                                feedbackKey = params.feedbackKey
                                p = params.p
                                additionalProperties = params.additionalProperties.toMutableMap()
                            }

                            fun feedbackKey(feedbackKey: String) =
                                feedbackKey(JsonField.of(feedbackKey))

                            /**
                             * Sets [Builder.feedbackKey] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.feedbackKey] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun feedbackKey(feedbackKey: JsonField<String>) = apply {
                                this.feedbackKey = feedbackKey
                            }

                            fun p(p: Double) = p(JsonField.of(p))

                            /**
                             * Sets [Builder.p] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.p] with a well-typed [Double] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun p(p: JsonField<Double>) = apply { this.p = p }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Params].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .feedbackKey()
                             * .p()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Params =
                                Params(
                                    checkRequired("feedbackKey", feedbackKey),
                                    checkRequired("p", p),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Params = apply {
                            if (validated) {
                                return@apply
                            }

                            feedbackKey()
                            p()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (feedbackKey.asKnown().isPresent) 1 else 0) +
                                (if (p.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Params &&
                                feedbackKey == other.feedbackKey &&
                                p == other.p &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(feedbackKey, p, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Params{feedbackKey=$feedbackKey, p=$p, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CustomChartFeedbackScoreMetricPercentile &&
                            field == other.field &&
                            params == other.params &&
                            type == other.type &&
                            filter == other.filter &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(field, params, type, filter, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CustomChartFeedbackScoreMetricPercentile{field=$field, params=$params, type=$type, filter=$filter, additionalProperties=$additionalProperties}"
                }

                class CustomChartMetricPercentile
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val field: JsonField<Field>,
                    private val params: JsonField<Params>,
                    private val type: JsonValue,
                    private val filter: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("field")
                        @ExcludeMissing
                        field: JsonField<Field> = JsonMissing.of(),
                        @JsonProperty("params")
                        @ExcludeMissing
                        params: JsonField<Params> = JsonMissing.of(),
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        @JsonProperty("filter")
                        @ExcludeMissing
                        filter: JsonField<String> = JsonMissing.of(),
                    ) : this(field, params, type, filter, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun field(): Field = field.getRequired("field")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun params(): Params = params.getRequired("params")

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("percentile")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun filter(): Optional<String> = filter.getOptional("filter")

                    /**
                     * Returns the raw JSON value of [field].
                     *
                     * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                    /**
                     * Returns the raw JSON value of [params].
                     *
                     * Unlike [params], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("params")
                    @ExcludeMissing
                    fun _params(): JsonField<Params> = params

                    /**
                     * Returns the raw JSON value of [filter].
                     *
                     * Unlike [filter], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("filter")
                    @ExcludeMissing
                    fun _filter(): JsonField<String> = filter

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
                         * Returns a mutable builder for constructing an instance of
                         * [CustomChartMetricPercentile].
                         *
                         * The following fields are required:
                         * ```java
                         * .field()
                         * .params()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CustomChartMetricPercentile]. */
                    class Builder internal constructor() {

                        private var field: JsonField<Field>? = null
                        private var params: JsonField<Params>? = null
                        private var type: JsonValue = JsonValue.from("percentile")
                        private var filter: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(
                            customChartMetricPercentile: CustomChartMetricPercentile
                        ) = apply {
                            field = customChartMetricPercentile.field
                            params = customChartMetricPercentile.params
                            type = customChartMetricPercentile.type
                            filter = customChartMetricPercentile.filter
                            additionalProperties =
                                customChartMetricPercentile.additionalProperties.toMutableMap()
                        }

                        fun field(field: Field) = field(JsonField.of(field))

                        /**
                         * Sets [Builder.field] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.field] with a well-typed [Field] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun field(field: JsonField<Field>) = apply { this.field = field }

                        fun params(params: Params) = params(JsonField.of(params))

                        /**
                         * Sets [Builder.params] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.params] with a well-typed [Params] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun params(params: JsonField<Params>) = apply { this.params = params }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("percentile")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
                        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                        /**
                         * Sets [Builder.filter] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.filter] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [CustomChartMetricPercentile].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .field()
                         * .params()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CustomChartMetricPercentile =
                            CustomChartMetricPercentile(
                                checkRequired("field", field),
                                checkRequired("params", params),
                                type,
                                filter,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): CustomChartMetricPercentile = apply {
                        if (validated) {
                            return@apply
                        }

                        field().validate()
                        params().validate()
                        _type().let {
                            if (it != JsonValue.from("percentile")) {
                                throw LangChainInvalidDataException(
                                    "'type' is invalid, received $it"
                                )
                            }
                        }
                        filter()
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
                        (field.asKnown().getOrNull()?.validity() ?: 0) +
                            (params.asKnown().getOrNull()?.validity() ?: 0) +
                            type.let { if (it == JsonValue.from("percentile")) 1 else 0 } +
                            (if (filter.asKnown().isPresent) 1 else 0)

                    class Field
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val LATENCY_SECONDS = of("latency_seconds")

                            @JvmField val FIRST_TOKEN_SECONDS = of("first_token_seconds")

                            @JvmField val TOTAL_TOKENS = of("total_tokens")

                            @JvmField val PROMPT_TOKENS = of("prompt_tokens")

                            @JvmField val COMPLETION_TOKENS = of("completion_tokens")

                            @JvmField val TOTAL_COST = of("total_cost")

                            @JvmField val PROMPT_COST = of("prompt_cost")

                            @JvmField val COMPLETION_COST = of("completion_cost")

                            @JvmField val FEEDBACK_SCORE = of("feedback_score")

                            @JvmStatic fun of(value: String) = Field(JsonField.of(value))
                        }

                        /** An enum containing [Field]'s known values. */
                        enum class Known {
                            LATENCY_SECONDS,
                            FIRST_TOKEN_SECONDS,
                            TOTAL_TOKENS,
                            PROMPT_TOKENS,
                            COMPLETION_TOKENS,
                            TOTAL_COST,
                            PROMPT_COST,
                            COMPLETION_COST,
                            FEEDBACK_SCORE,
                        }

                        /**
                         * An enum containing [Field]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Field] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            LATENCY_SECONDS,
                            FIRST_TOKEN_SECONDS,
                            TOTAL_TOKENS,
                            PROMPT_TOKENS,
                            COMPLETION_TOKENS,
                            TOTAL_COST,
                            PROMPT_COST,
                            COMPLETION_COST,
                            FEEDBACK_SCORE,
                            /**
                             * An enum member indicating that [Field] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                LATENCY_SECONDS -> Value.LATENCY_SECONDS
                                FIRST_TOKEN_SECONDS -> Value.FIRST_TOKEN_SECONDS
                                TOTAL_TOKENS -> Value.TOTAL_TOKENS
                                PROMPT_TOKENS -> Value.PROMPT_TOKENS
                                COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                                TOTAL_COST -> Value.TOTAL_COST
                                PROMPT_COST -> Value.PROMPT_COST
                                COMPLETION_COST -> Value.COMPLETION_COST
                                FEEDBACK_SCORE -> Value.FEEDBACK_SCORE
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                LATENCY_SECONDS -> Known.LATENCY_SECONDS
                                FIRST_TOKEN_SECONDS -> Known.FIRST_TOKEN_SECONDS
                                TOTAL_TOKENS -> Known.TOTAL_TOKENS
                                PROMPT_TOKENS -> Known.PROMPT_TOKENS
                                COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                                TOTAL_COST -> Known.TOTAL_COST
                                PROMPT_COST -> Known.PROMPT_COST
                                COMPLETION_COST -> Known.COMPLETION_COST
                                FEEDBACK_SCORE -> Known.FEEDBACK_SCORE
                                else -> throw LangChainInvalidDataException("Unknown Field: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws LangChainInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                LangChainInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Field = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Field && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class Params
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val p: JsonField<Double>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("p")
                            @ExcludeMissing
                            p: JsonField<Double> = JsonMissing.of()
                        ) : this(p, mutableMapOf())

                        /**
                         * @throws LangChainInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun p(): Double = p.getRequired("p")

                        /**
                         * Returns the raw JSON value of [p].
                         *
                         * Unlike [p], this method doesn't throw if the JSON field has an unexpected
                         * type.
                         */
                        @JsonProperty("p") @ExcludeMissing fun _p(): JsonField<Double> = p

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
                             * Returns a mutable builder for constructing an instance of [Params].
                             *
                             * The following fields are required:
                             * ```java
                             * .p()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Params]. */
                        class Builder internal constructor() {

                            private var p: JsonField<Double>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(params: Params) = apply {
                                p = params.p
                                additionalProperties = params.additionalProperties.toMutableMap()
                            }

                            fun p(p: Double) = p(JsonField.of(p))

                            /**
                             * Sets [Builder.p] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.p] with a well-typed [Double] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun p(p: JsonField<Double>) = apply { this.p = p }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Params].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .p()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Params =
                                Params(checkRequired("p", p), additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Params = apply {
                            if (validated) {
                                return@apply
                            }

                            p()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = (if (p.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Params &&
                                p == other.p &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy { Objects.hash(p, additionalProperties) }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Params{p=$p, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CustomChartMetricPercentile &&
                            field == other.field &&
                            params == other.params &&
                            type == other.type &&
                            filter == other.filter &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(field, params, type, filter, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CustomChartMetricPercentile{field=$field, params=$params, type=$type, filter=$filter, additionalProperties=$additionalProperties}"
                }

                class CustomChartMetricRatioInput
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val denominator: JsonField<Denominator>,
                    private val numerator: JsonField<Numerator>,
                    private val type: JsonValue,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("denominator")
                        @ExcludeMissing
                        denominator: JsonField<Denominator> = JsonMissing.of(),
                        @JsonProperty("numerator")
                        @ExcludeMissing
                        numerator: JsonField<Numerator> = JsonMissing.of(),
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    ) : this(denominator, numerator, type, mutableMapOf())

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun denominator(): Denominator = denominator.getRequired("denominator")

                    /**
                     * @throws LangChainInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun numerator(): Numerator = numerator.getRequired("numerator")

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("ratio")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * Returns the raw JSON value of [denominator].
                     *
                     * Unlike [denominator], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("denominator")
                    @ExcludeMissing
                    fun _denominator(): JsonField<Denominator> = denominator

                    /**
                     * Returns the raw JSON value of [numerator].
                     *
                     * Unlike [numerator], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("numerator")
                    @ExcludeMissing
                    fun _numerator(): JsonField<Numerator> = numerator

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
                         * Returns a mutable builder for constructing an instance of
                         * [CustomChartMetricRatioInput].
                         *
                         * The following fields are required:
                         * ```java
                         * .denominator()
                         * .numerator()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CustomChartMetricRatioInput]. */
                    class Builder internal constructor() {

                        private var denominator: JsonField<Denominator>? = null
                        private var numerator: JsonField<Numerator>? = null
                        private var type: JsonValue = JsonValue.from("ratio")
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(
                            customChartMetricRatioInput: CustomChartMetricRatioInput
                        ) = apply {
                            denominator = customChartMetricRatioInput.denominator
                            numerator = customChartMetricRatioInput.numerator
                            type = customChartMetricRatioInput.type
                            additionalProperties =
                                customChartMetricRatioInput.additionalProperties.toMutableMap()
                        }

                        fun denominator(denominator: Denominator) =
                            denominator(JsonField.of(denominator))

                        /**
                         * Sets [Builder.denominator] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.denominator] with a well-typed
                         * [Denominator] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun denominator(denominator: JsonField<Denominator>) = apply {
                            this.denominator = denominator
                        }

                        /**
                         * Alias for calling [denominator] with
                         * `Denominator.ofCustomChartFeedbackCountMetric(customChartFeedbackCountMetric)`.
                         */
                        fun denominator(
                            customChartFeedbackCountMetric:
                                Denominator.CustomChartFeedbackCountMetric
                        ) =
                            denominator(
                                Denominator.ofCustomChartFeedbackCountMetric(
                                    customChartFeedbackCountMetric
                                )
                            )

                        /**
                         * Alias for calling [denominator] with
                         * `Denominator.ofCustomChartMetricCount(customChartMetricCount)`.
                         */
                        fun denominator(
                            customChartMetricCount: Denominator.CustomChartMetricCount
                        ) =
                            denominator(
                                Denominator.ofCustomChartMetricCount(customChartMetricCount)
                            )

                        /**
                         * Alias for calling [denominator] with
                         * `Denominator.ofCustomChartFeedbackScoreMetricScalar(customChartFeedbackScoreMetricScalar)`.
                         */
                        fun denominator(
                            customChartFeedbackScoreMetricScalar:
                                Denominator.CustomChartFeedbackScoreMetricScalar
                        ) =
                            denominator(
                                Denominator.ofCustomChartFeedbackScoreMetricScalar(
                                    customChartFeedbackScoreMetricScalar
                                )
                            )

                        /**
                         * Alias for calling [denominator] with
                         * `Denominator.ofCustomChartMetricScalar(customChartMetricScalar)`.
                         */
                        fun denominator(
                            customChartMetricScalar: Denominator.CustomChartMetricScalar
                        ) =
                            denominator(
                                Denominator.ofCustomChartMetricScalar(customChartMetricScalar)
                            )

                        /**
                         * Alias for calling [denominator] with
                         * `Denominator.ofCustomChartFeedbackScoreMetricPercentile(customChartFeedbackScoreMetricPercentile)`.
                         */
                        fun denominator(
                            customChartFeedbackScoreMetricPercentile:
                                Denominator.CustomChartFeedbackScoreMetricPercentile
                        ) =
                            denominator(
                                Denominator.ofCustomChartFeedbackScoreMetricPercentile(
                                    customChartFeedbackScoreMetricPercentile
                                )
                            )

                        /**
                         * Alias for calling [denominator] with
                         * `Denominator.ofCustomChartMetricPercentile(customChartMetricPercentile)`.
                         */
                        fun denominator(
                            customChartMetricPercentile: Denominator.CustomChartMetricPercentile
                        ) =
                            denominator(
                                Denominator.ofCustomChartMetricPercentile(
                                    customChartMetricPercentile
                                )
                            )

                        fun numerator(numerator: Numerator) = numerator(JsonField.of(numerator))

                        /**
                         * Sets [Builder.numerator] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.numerator] with a well-typed [Numerator]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun numerator(numerator: JsonField<Numerator>) = apply {
                            this.numerator = numerator
                        }

                        /**
                         * Alias for calling [numerator] with
                         * `Numerator.ofCustomChartFeedbackCountMetric(customChartFeedbackCountMetric)`.
                         */
                        fun numerator(
                            customChartFeedbackCountMetric: Numerator.CustomChartFeedbackCountMetric
                        ) =
                            numerator(
                                Numerator.ofCustomChartFeedbackCountMetric(
                                    customChartFeedbackCountMetric
                                )
                            )

                        /**
                         * Alias for calling [numerator] with
                         * `Numerator.ofCustomChartMetricCount(customChartMetricCount)`.
                         */
                        fun numerator(customChartMetricCount: Numerator.CustomChartMetricCount) =
                            numerator(Numerator.ofCustomChartMetricCount(customChartMetricCount))

                        /**
                         * Alias for calling [numerator] with
                         * `Numerator.ofCustomChartFeedbackScoreMetricScalar(customChartFeedbackScoreMetricScalar)`.
                         */
                        fun numerator(
                            customChartFeedbackScoreMetricScalar:
                                Numerator.CustomChartFeedbackScoreMetricScalar
                        ) =
                            numerator(
                                Numerator.ofCustomChartFeedbackScoreMetricScalar(
                                    customChartFeedbackScoreMetricScalar
                                )
                            )

                        /**
                         * Alias for calling [numerator] with
                         * `Numerator.ofCustomChartMetricScalar(customChartMetricScalar)`.
                         */
                        fun numerator(customChartMetricScalar: Numerator.CustomChartMetricScalar) =
                            numerator(Numerator.ofCustomChartMetricScalar(customChartMetricScalar))

                        /**
                         * Alias for calling [numerator] with
                         * `Numerator.ofCustomChartFeedbackScoreMetricPercentile(customChartFeedbackScoreMetricPercentile)`.
                         */
                        fun numerator(
                            customChartFeedbackScoreMetricPercentile:
                                Numerator.CustomChartFeedbackScoreMetricPercentile
                        ) =
                            numerator(
                                Numerator.ofCustomChartFeedbackScoreMetricPercentile(
                                    customChartFeedbackScoreMetricPercentile
                                )
                            )

                        /**
                         * Alias for calling [numerator] with
                         * `Numerator.ofCustomChartMetricPercentile(customChartMetricPercentile)`.
                         */
                        fun numerator(
                            customChartMetricPercentile: Numerator.CustomChartMetricPercentile
                        ) =
                            numerator(
                                Numerator.ofCustomChartMetricPercentile(customChartMetricPercentile)
                            )

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("ratio")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [CustomChartMetricRatioInput].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .denominator()
                         * .numerator()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CustomChartMetricRatioInput =
                            CustomChartMetricRatioInput(
                                checkRequired("denominator", denominator),
                                checkRequired("numerator", numerator),
                                type,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws LangChainInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): CustomChartMetricRatioInput = apply {
                        if (validated) {
                            return@apply
                        }

                        denominator().validate()
                        numerator().validate()
                        _type().let {
                            if (it != JsonValue.from("ratio")) {
                                throw LangChainInvalidDataException(
                                    "'type' is invalid, received $it"
                                )
                            }
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
                        (denominator.asKnown().getOrNull()?.validity() ?: 0) +
                            (numerator.asKnown().getOrNull()?.validity() ?: 0) +
                            type.let { if (it == JsonValue.from("ratio")) 1 else 0 }

                    @JsonDeserialize(using = Denominator.Deserializer::class)
                    @JsonSerialize(using = Denominator.Serializer::class)
                    class Denominator
                    private constructor(
                        private val customChartFeedbackCountMetric:
                            CustomChartFeedbackCountMetric? =
                            null,
                        private val customChartMetricCount: CustomChartMetricCount? = null,
                        private val customChartFeedbackScoreMetricScalar:
                            CustomChartFeedbackScoreMetricScalar? =
                            null,
                        private val customChartMetricScalar: CustomChartMetricScalar? = null,
                        private val customChartFeedbackScoreMetricPercentile:
                            CustomChartFeedbackScoreMetricPercentile? =
                            null,
                        private val customChartMetricPercentile: CustomChartMetricPercentile? =
                            null,
                        private val _json: JsonValue? = null,
                    ) {

                        fun customChartFeedbackCountMetric():
                            Optional<CustomChartFeedbackCountMetric> =
                            Optional.ofNullable(customChartFeedbackCountMetric)

                        fun customChartMetricCount(): Optional<CustomChartMetricCount> =
                            Optional.ofNullable(customChartMetricCount)

                        fun customChartFeedbackScoreMetricScalar():
                            Optional<CustomChartFeedbackScoreMetricScalar> =
                            Optional.ofNullable(customChartFeedbackScoreMetricScalar)

                        fun customChartMetricScalar(): Optional<CustomChartMetricScalar> =
                            Optional.ofNullable(customChartMetricScalar)

                        fun customChartFeedbackScoreMetricPercentile():
                            Optional<CustomChartFeedbackScoreMetricPercentile> =
                            Optional.ofNullable(customChartFeedbackScoreMetricPercentile)

                        fun customChartMetricPercentile(): Optional<CustomChartMetricPercentile> =
                            Optional.ofNullable(customChartMetricPercentile)

                        fun isCustomChartFeedbackCountMetric(): Boolean =
                            customChartFeedbackCountMetric != null

                        fun isCustomChartMetricCount(): Boolean = customChartMetricCount != null

                        fun isCustomChartFeedbackScoreMetricScalar(): Boolean =
                            customChartFeedbackScoreMetricScalar != null

                        fun isCustomChartMetricScalar(): Boolean = customChartMetricScalar != null

                        fun isCustomChartFeedbackScoreMetricPercentile(): Boolean =
                            customChartFeedbackScoreMetricPercentile != null

                        fun isCustomChartMetricPercentile(): Boolean =
                            customChartMetricPercentile != null

                        fun asCustomChartFeedbackCountMetric(): CustomChartFeedbackCountMetric =
                            customChartFeedbackCountMetric.getOrThrow(
                                "customChartFeedbackCountMetric"
                            )

                        fun asCustomChartMetricCount(): CustomChartMetricCount =
                            customChartMetricCount.getOrThrow("customChartMetricCount")

                        fun asCustomChartFeedbackScoreMetricScalar():
                            CustomChartFeedbackScoreMetricScalar =
                            customChartFeedbackScoreMetricScalar.getOrThrow(
                                "customChartFeedbackScoreMetricScalar"
                            )

                        fun asCustomChartMetricScalar(): CustomChartMetricScalar =
                            customChartMetricScalar.getOrThrow("customChartMetricScalar")

                        fun asCustomChartFeedbackScoreMetricPercentile():
                            CustomChartFeedbackScoreMetricPercentile =
                            customChartFeedbackScoreMetricPercentile.getOrThrow(
                                "customChartFeedbackScoreMetricPercentile"
                            )

                        fun asCustomChartMetricPercentile(): CustomChartMetricPercentile =
                            customChartMetricPercentile.getOrThrow("customChartMetricPercentile")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        /**
                         * Maps this instance's current variant to a value of type [T] using the
                         * given [visitor].
                         *
                         * Note that this method is _not_ forwards compatible with new variants from
                         * the API, unless [visitor] overrides [Visitor.unknown]. To handle variants
                         * not known to this version of the SDK gracefully, consider overriding
                         * [Visitor.unknown]:
                         * ```java
                         * import com.langchain.smith.core.JsonValue;
                         * import java.util.Optional;
                         *
                         * Optional<String> result = denominator.accept(new Denominator.Visitor<Optional<String>>() {
                         *     @Override
                         *     public Optional<String> visitCustomChartFeedbackCountMetric(CustomChartFeedbackCountMetric customChartFeedbackCountMetric) {
                         *         return Optional.of(customChartFeedbackCountMetric.toString());
                         *     }
                         *
                         *     // ...
                         *
                         *     @Override
                         *     public Optional<String> unknown(JsonValue json) {
                         *         // Or inspect the `json`.
                         *         return Optional.empty();
                         *     }
                         * });
                         * ```
                         *
                         * @throws LangChainInvalidDataException if [Visitor.unknown] is not
                         *   overridden in [visitor] and the current variant is unknown.
                         */
                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                customChartFeedbackCountMetric != null ->
                                    visitor.visitCustomChartFeedbackCountMetric(
                                        customChartFeedbackCountMetric
                                    )
                                customChartMetricCount != null ->
                                    visitor.visitCustomChartMetricCount(customChartMetricCount)
                                customChartFeedbackScoreMetricScalar != null ->
                                    visitor.visitCustomChartFeedbackScoreMetricScalar(
                                        customChartFeedbackScoreMetricScalar
                                    )
                                customChartMetricScalar != null ->
                                    visitor.visitCustomChartMetricScalar(customChartMetricScalar)
                                customChartFeedbackScoreMetricPercentile != null ->
                                    visitor.visitCustomChartFeedbackScoreMetricPercentile(
                                        customChartFeedbackScoreMetricPercentile
                                    )
                                customChartMetricPercentile != null ->
                                    visitor.visitCustomChartMetricPercentile(
                                        customChartMetricPercentile
                                    )
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Denominator = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitCustomChartFeedbackCountMetric(
                                        customChartFeedbackCountMetric:
                                            CustomChartFeedbackCountMetric
                                    ) {
                                        customChartFeedbackCountMetric.validate()
                                    }

                                    override fun visitCustomChartMetricCount(
                                        customChartMetricCount: CustomChartMetricCount
                                    ) {
                                        customChartMetricCount.validate()
                                    }

                                    override fun visitCustomChartFeedbackScoreMetricScalar(
                                        customChartFeedbackScoreMetricScalar:
                                            CustomChartFeedbackScoreMetricScalar
                                    ) {
                                        customChartFeedbackScoreMetricScalar.validate()
                                    }

                                    override fun visitCustomChartMetricScalar(
                                        customChartMetricScalar: CustomChartMetricScalar
                                    ) {
                                        customChartMetricScalar.validate()
                                    }

                                    override fun visitCustomChartFeedbackScoreMetricPercentile(
                                        customChartFeedbackScoreMetricPercentile:
                                            CustomChartFeedbackScoreMetricPercentile
                                    ) {
                                        customChartFeedbackScoreMetricPercentile.validate()
                                    }

                                    override fun visitCustomChartMetricPercentile(
                                        customChartMetricPercentile: CustomChartMetricPercentile
                                    ) {
                                        customChartMetricPercentile.validate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitCustomChartFeedbackCountMetric(
                                        customChartFeedbackCountMetric:
                                            CustomChartFeedbackCountMetric
                                    ) = customChartFeedbackCountMetric.validity()

                                    override fun visitCustomChartMetricCount(
                                        customChartMetricCount: CustomChartMetricCount
                                    ) = customChartMetricCount.validity()

                                    override fun visitCustomChartFeedbackScoreMetricScalar(
                                        customChartFeedbackScoreMetricScalar:
                                            CustomChartFeedbackScoreMetricScalar
                                    ) = customChartFeedbackScoreMetricScalar.validity()

                                    override fun visitCustomChartMetricScalar(
                                        customChartMetricScalar: CustomChartMetricScalar
                                    ) = customChartMetricScalar.validity()

                                    override fun visitCustomChartFeedbackScoreMetricPercentile(
                                        customChartFeedbackScoreMetricPercentile:
                                            CustomChartFeedbackScoreMetricPercentile
                                    ) = customChartFeedbackScoreMetricPercentile.validity()

                                    override fun visitCustomChartMetricPercentile(
                                        customChartMetricPercentile: CustomChartMetricPercentile
                                    ) = customChartMetricPercentile.validity()

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Denominator &&
                                customChartFeedbackCountMetric ==
                                    other.customChartFeedbackCountMetric &&
                                customChartMetricCount == other.customChartMetricCount &&
                                customChartFeedbackScoreMetricScalar ==
                                    other.customChartFeedbackScoreMetricScalar &&
                                customChartMetricScalar == other.customChartMetricScalar &&
                                customChartFeedbackScoreMetricPercentile ==
                                    other.customChartFeedbackScoreMetricPercentile &&
                                customChartMetricPercentile == other.customChartMetricPercentile
                        }

                        override fun hashCode(): Int =
                            Objects.hash(
                                customChartFeedbackCountMetric,
                                customChartMetricCount,
                                customChartFeedbackScoreMetricScalar,
                                customChartMetricScalar,
                                customChartFeedbackScoreMetricPercentile,
                                customChartMetricPercentile,
                            )

                        override fun toString(): String =
                            when {
                                customChartFeedbackCountMetric != null ->
                                    "Denominator{customChartFeedbackCountMetric=$customChartFeedbackCountMetric}"
                                customChartMetricCount != null ->
                                    "Denominator{customChartMetricCount=$customChartMetricCount}"
                                customChartFeedbackScoreMetricScalar != null ->
                                    "Denominator{customChartFeedbackScoreMetricScalar=$customChartFeedbackScoreMetricScalar}"
                                customChartMetricScalar != null ->
                                    "Denominator{customChartMetricScalar=$customChartMetricScalar}"
                                customChartFeedbackScoreMetricPercentile != null ->
                                    "Denominator{customChartFeedbackScoreMetricPercentile=$customChartFeedbackScoreMetricPercentile}"
                                customChartMetricPercentile != null ->
                                    "Denominator{customChartMetricPercentile=$customChartMetricPercentile}"
                                _json != null -> "Denominator{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Denominator")
                            }

                        companion object {

                            @JvmStatic
                            fun ofCustomChartFeedbackCountMetric(
                                customChartFeedbackCountMetric: CustomChartFeedbackCountMetric
                            ) =
                                Denominator(
                                    customChartFeedbackCountMetric = customChartFeedbackCountMetric
                                )

                            @JvmStatic
                            fun ofCustomChartMetricCount(
                                customChartMetricCount: CustomChartMetricCount
                            ) = Denominator(customChartMetricCount = customChartMetricCount)

                            @JvmStatic
                            fun ofCustomChartFeedbackScoreMetricScalar(
                                customChartFeedbackScoreMetricScalar:
                                    CustomChartFeedbackScoreMetricScalar
                            ) =
                                Denominator(
                                    customChartFeedbackScoreMetricScalar =
                                        customChartFeedbackScoreMetricScalar
                                )

                            @JvmStatic
                            fun ofCustomChartMetricScalar(
                                customChartMetricScalar: CustomChartMetricScalar
                            ) = Denominator(customChartMetricScalar = customChartMetricScalar)

                            @JvmStatic
                            fun ofCustomChartFeedbackScoreMetricPercentile(
                                customChartFeedbackScoreMetricPercentile:
                                    CustomChartFeedbackScoreMetricPercentile
                            ) =
                                Denominator(
                                    customChartFeedbackScoreMetricPercentile =
                                        customChartFeedbackScoreMetricPercentile
                                )

                            @JvmStatic
                            fun ofCustomChartMetricPercentile(
                                customChartMetricPercentile: CustomChartMetricPercentile
                            ) =
                                Denominator(
                                    customChartMetricPercentile = customChartMetricPercentile
                                )
                        }

                        /**
                         * An interface that defines how to map each variant of [Denominator] to a
                         * value of type [T].
                         */
                        interface Visitor<out T> {

                            fun visitCustomChartFeedbackCountMetric(
                                customChartFeedbackCountMetric: CustomChartFeedbackCountMetric
                            ): T

                            fun visitCustomChartMetricCount(
                                customChartMetricCount: CustomChartMetricCount
                            ): T

                            fun visitCustomChartFeedbackScoreMetricScalar(
                                customChartFeedbackScoreMetricScalar:
                                    CustomChartFeedbackScoreMetricScalar
                            ): T

                            fun visitCustomChartMetricScalar(
                                customChartMetricScalar: CustomChartMetricScalar
                            ): T

                            fun visitCustomChartFeedbackScoreMetricPercentile(
                                customChartFeedbackScoreMetricPercentile:
                                    CustomChartFeedbackScoreMetricPercentile
                            ): T

                            fun visitCustomChartMetricPercentile(
                                customChartMetricPercentile: CustomChartMetricPercentile
                            ): T

                            /**
                             * Maps an unknown variant of [Denominator] to a value of type [T].
                             *
                             * An instance of [Denominator] can contain an unknown variant if it was
                             * deserialized from data that doesn't match any known variant. For
                             * example, if the SDK is on an older version than the API, then the API
                             * may respond with new variants that the SDK is unaware of.
                             *
                             * @throws LangChainInvalidDataException in the default implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                                throw LangChainInvalidDataException("Unknown Denominator: $json")
                            }
                        }

                        internal class Deserializer :
                            BaseDeserializer<Denominator>(Denominator::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Denominator {
                                val json = JsonValue.fromJsonNode(node)

                                val bestMatches =
                                    sequenceOf(
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<CustomChartFeedbackCountMetric>(),
                                                )
                                                ?.let {
                                                    Denominator(
                                                        customChartFeedbackCountMetric = it,
                                                        _json = json,
                                                    )
                                                },
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<CustomChartMetricCount>(),
                                                )
                                                ?.let {
                                                    Denominator(
                                                        customChartMetricCount = it,
                                                        _json = json,
                                                    )
                                                },
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<
                                                        CustomChartFeedbackScoreMetricScalar
                                                    >(),
                                                )
                                                ?.let {
                                                    Denominator(
                                                        customChartFeedbackScoreMetricScalar = it,
                                                        _json = json,
                                                    )
                                                },
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<CustomChartMetricScalar>(),
                                                )
                                                ?.let {
                                                    Denominator(
                                                        customChartMetricScalar = it,
                                                        _json = json,
                                                    )
                                                },
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<
                                                        CustomChartFeedbackScoreMetricPercentile
                                                    >(),
                                                )
                                                ?.let {
                                                    Denominator(
                                                        customChartFeedbackScoreMetricPercentile =
                                                            it,
                                                        _json = json,
                                                    )
                                                },
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<CustomChartMetricPercentile>(),
                                                )
                                                ?.let {
                                                    Denominator(
                                                        customChartMetricPercentile = it,
                                                        _json = json,
                                                    )
                                                },
                                        )
                                        .filterNotNull()
                                        .allMaxBy { it.validity() }
                                        .toList()
                                return when (bestMatches.size) {
                                    // This can happen if what we're deserializing is completely
                                    // incompatible with all the possible variants (e.g.
                                    // deserializing from boolean).
                                    0 -> Denominator(_json = json)
                                    1 -> bestMatches.single()
                                    // If there's more than one match with the highest validity,
                                    // then use the first completely valid match, or simply the
                                    // first match if none are completely valid.
                                    else ->
                                        bestMatches.firstOrNull { it.isValid() }
                                            ?: bestMatches.first()
                                }
                            }
                        }

                        internal class Serializer :
                            BaseSerializer<Denominator>(Denominator::class) {

                            override fun serialize(
                                value: Denominator,
                                generator: JsonGenerator,
                                provider: SerializerProvider,
                            ) {
                                when {
                                    value.customChartFeedbackCountMetric != null ->
                                        generator.writeObject(value.customChartFeedbackCountMetric)
                                    value.customChartMetricCount != null ->
                                        generator.writeObject(value.customChartMetricCount)
                                    value.customChartFeedbackScoreMetricScalar != null ->
                                        generator.writeObject(
                                            value.customChartFeedbackScoreMetricScalar
                                        )
                                    value.customChartMetricScalar != null ->
                                        generator.writeObject(value.customChartMetricScalar)
                                    value.customChartFeedbackScoreMetricPercentile != null ->
                                        generator.writeObject(
                                            value.customChartFeedbackScoreMetricPercentile
                                        )
                                    value.customChartMetricPercentile != null ->
                                        generator.writeObject(value.customChartMetricPercentile)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid Denominator")
                                }
                            }
                        }

                        class CustomChartFeedbackCountMetric
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val entity: JsonValue,
                            private val params: JsonField<Params>,
                            private val filter: JsonField<String>,
                            private val type: JsonField<Type>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("entity")
                                @ExcludeMissing
                                entity: JsonValue = JsonMissing.of(),
                                @JsonProperty("params")
                                @ExcludeMissing
                                params: JsonField<Params> = JsonMissing.of(),
                                @JsonProperty("filter")
                                @ExcludeMissing
                                filter: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonField<Type> = JsonMissing.of(),
                            ) : this(entity, params, filter, type, mutableMapOf())

                            /**
                             * Expected to always return the following:
                             * ```java
                             * JsonValue.from("feedback")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("entity")
                            @ExcludeMissing
                            fun _entity(): JsonValue = entity

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun params(): Params = params.getRequired("params")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun filter(): Optional<String> = filter.getOptional("filter")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun type(): Optional<Type> = type.getOptional("type")

                            /**
                             * Returns the raw JSON value of [params].
                             *
                             * Unlike [params], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("params")
                            @ExcludeMissing
                            fun _params(): JsonField<Params> = params

                            /**
                             * Returns the raw JSON value of [filter].
                             *
                             * Unlike [filter], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("filter")
                            @ExcludeMissing
                            fun _filter(): JsonField<String> = filter

                            /**
                             * Returns the raw JSON value of [type].
                             *
                             * Unlike [type], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Type> = type

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [CustomChartFeedbackCountMetric].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .params()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [CustomChartFeedbackCountMetric]. */
                            class Builder internal constructor() {

                                private var entity: JsonValue = JsonValue.from("feedback")
                                private var params: JsonField<Params>? = null
                                private var filter: JsonField<String> = JsonMissing.of()
                                private var type: JsonField<Type> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(
                                    customChartFeedbackCountMetric: CustomChartFeedbackCountMetric
                                ) = apply {
                                    entity = customChartFeedbackCountMetric.entity
                                    params = customChartFeedbackCountMetric.params
                                    filter = customChartFeedbackCountMetric.filter
                                    type = customChartFeedbackCountMetric.type
                                    additionalProperties =
                                        customChartFeedbackCountMetric.additionalProperties
                                            .toMutableMap()
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```java
                                 * JsonValue.from("feedback")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun entity(entity: JsonValue) = apply { this.entity = entity }

                                fun params(params: Params) = params(JsonField.of(params))

                                /**
                                 * Sets [Builder.params] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.params] with a well-typed
                                 * [Params] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun params(params: JsonField<Params>) = apply {
                                    this.params = params
                                }

                                fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                                /**
                                 * Alias for calling [Builder.filter] with `filter.orElse(null)`.
                                 */
                                fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                                /**
                                 * Sets [Builder.filter] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.filter] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun filter(filter: JsonField<String>) = apply {
                                    this.filter = filter
                                }

                                fun type(type: Type) = type(JsonField.of(type))

                                /**
                                 * Sets [Builder.type] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.type] with a well-typed [Type]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun type(type: JsonField<Type>) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of
                                 * [CustomChartFeedbackCountMetric].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .params()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): CustomChartFeedbackCountMetric =
                                    CustomChartFeedbackCountMetric(
                                        entity,
                                        checkRequired("params", params),
                                        filter,
                                        type,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LangChainInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): CustomChartFeedbackCountMetric = apply {
                                if (validated) {
                                    return@apply
                                }

                                _entity().let {
                                    if (it != JsonValue.from("feedback")) {
                                        throw LangChainInvalidDataException(
                                            "'entity' is invalid, received $it"
                                        )
                                    }
                                }
                                params().validate()
                                filter()
                                type().ifPresent { it.validate() }
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                entity.let { if (it == JsonValue.from("feedback")) 1 else 0 } +
                                    (params.asKnown().getOrNull()?.validity() ?: 0) +
                                    (if (filter.asKnown().isPresent) 1 else 0) +
                                    (type.asKnown().getOrNull()?.validity() ?: 0)

                            class Params
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val feedbackKey: JsonField<String>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("feedback_key")
                                    @ExcludeMissing
                                    feedbackKey: JsonField<String> = JsonMissing.of()
                                ) : this(feedbackKey, mutableMapOf())

                                /**
                                 * @throws LangChainInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

                                /**
                                 * Returns the raw JSON value of [feedbackKey].
                                 *
                                 * Unlike [feedbackKey], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("feedback_key")
                                @ExcludeMissing
                                fun _feedbackKey(): JsonField<String> = feedbackKey

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
                                     * Returns a mutable builder for constructing an instance of
                                     * [Params].
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .feedbackKey()
                                     * ```
                                     */
                                    @JvmStatic fun builder() = Builder()
                                }

                                /** A builder for [Params]. */
                                class Builder internal constructor() {

                                    private var feedbackKey: JsonField<String>? = null
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    @JvmSynthetic
                                    internal fun from(params: Params) = apply {
                                        feedbackKey = params.feedbackKey
                                        additionalProperties =
                                            params.additionalProperties.toMutableMap()
                                    }

                                    fun feedbackKey(feedbackKey: String) =
                                        feedbackKey(JsonField.of(feedbackKey))

                                    /**
                                     * Sets [Builder.feedbackKey] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.feedbackKey] with a
                                     * well-typed [String] value instead. This method is primarily
                                     * for setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun feedbackKey(feedbackKey: JsonField<String>) = apply {
                                        this.feedbackKey = feedbackKey
                                    }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [Params].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .feedbackKey()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): Params =
                                        Params(
                                            checkRequired("feedbackKey", feedbackKey),
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Params = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    feedbackKey()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    (if (feedbackKey.asKnown().isPresent) 1 else 0)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Params &&
                                        feedbackKey == other.feedbackKey &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(feedbackKey, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "Params{feedbackKey=$feedbackKey, additionalProperties=$additionalProperties}"
                            }

                            class Type
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val COUNT = of("count")

                                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                }

                                /** An enum containing [Type]'s known values. */
                                enum class Known {
                                    COUNT
                                }

                                /**
                                 * An enum containing [Type]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Type] can contain an unknown value in a couple of
                                 * cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    COUNT,
                                    /**
                                     * An enum member indicating that [Type] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        COUNT -> Value.COUNT
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        COUNT -> Known.COUNT
                                        else ->
                                            throw LangChainInvalidDataException(
                                                "Unknown Type: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LangChainInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Type = apply {
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Type && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CustomChartFeedbackCountMetric &&
                                    entity == other.entity &&
                                    params == other.params &&
                                    filter == other.filter &&
                                    type == other.type &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(entity, params, filter, type, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "CustomChartFeedbackCountMetric{entity=$entity, params=$params, filter=$filter, type=$type, additionalProperties=$additionalProperties}"
                        }

                        class CustomChartMetricCount
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val filter: JsonField<String>,
                            private val type: JsonField<Type>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("filter")
                                @ExcludeMissing
                                filter: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonField<Type> = JsonMissing.of(),
                            ) : this(filter, type, mutableMapOf())

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun filter(): Optional<String> = filter.getOptional("filter")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun type(): Optional<Type> = type.getOptional("type")

                            /**
                             * Returns the raw JSON value of [filter].
                             *
                             * Unlike [filter], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("filter")
                            @ExcludeMissing
                            fun _filter(): JsonField<String> = filter

                            /**
                             * Returns the raw JSON value of [type].
                             *
                             * Unlike [type], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Type> = type

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [CustomChartMetricCount].
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [CustomChartMetricCount]. */
                            class Builder internal constructor() {

                                private var filter: JsonField<String> = JsonMissing.of()
                                private var type: JsonField<Type> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(customChartMetricCount: CustomChartMetricCount) =
                                    apply {
                                        filter = customChartMetricCount.filter
                                        type = customChartMetricCount.type
                                        additionalProperties =
                                            customChartMetricCount.additionalProperties
                                                .toMutableMap()
                                    }

                                fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                                /**
                                 * Alias for calling [Builder.filter] with `filter.orElse(null)`.
                                 */
                                fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                                /**
                                 * Sets [Builder.filter] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.filter] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun filter(filter: JsonField<String>) = apply {
                                    this.filter = filter
                                }

                                fun type(type: Type) = type(JsonField.of(type))

                                /**
                                 * Sets [Builder.type] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.type] with a well-typed [Type]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun type(type: JsonField<Type>) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [CustomChartMetricCount].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): CustomChartMetricCount =
                                    CustomChartMetricCount(
                                        filter,
                                        type,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LangChainInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): CustomChartMetricCount = apply {
                                if (validated) {
                                    return@apply
                                }

                                filter()
                                type().ifPresent { it.validate() }
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                (if (filter.asKnown().isPresent) 1 else 0) +
                                    (type.asKnown().getOrNull()?.validity() ?: 0)

                            class Type
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val COUNT = of("count")

                                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                }

                                /** An enum containing [Type]'s known values. */
                                enum class Known {
                                    COUNT
                                }

                                /**
                                 * An enum containing [Type]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Type] can contain an unknown value in a couple of
                                 * cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    COUNT,
                                    /**
                                     * An enum member indicating that [Type] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        COUNT -> Value.COUNT
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        COUNT -> Known.COUNT
                                        else ->
                                            throw LangChainInvalidDataException(
                                                "Unknown Type: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LangChainInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Type = apply {
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Type && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CustomChartMetricCount &&
                                    filter == other.filter &&
                                    type == other.type &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(filter, type, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "CustomChartMetricCount{filter=$filter, type=$type, additionalProperties=$additionalProperties}"
                        }

                        class CustomChartFeedbackScoreMetricScalar
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val field: JsonValue,
                            private val params: JsonField<Params>,
                            private val type: JsonField<Type>,
                            private val filter: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("field")
                                @ExcludeMissing
                                field: JsonValue = JsonMissing.of(),
                                @JsonProperty("params")
                                @ExcludeMissing
                                params: JsonField<Params> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonField<Type> = JsonMissing.of(),
                                @JsonProperty("filter")
                                @ExcludeMissing
                                filter: JsonField<String> = JsonMissing.of(),
                            ) : this(field, params, type, filter, mutableMapOf())

                            /**
                             * Expected to always return the following:
                             * ```java
                             * JsonValue.from("feedback_score")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("field") @ExcludeMissing fun _field(): JsonValue = field

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun params(): Params = params.getRequired("params")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun type(): Type = type.getRequired("type")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun filter(): Optional<String> = filter.getOptional("filter")

                            /**
                             * Returns the raw JSON value of [params].
                             *
                             * Unlike [params], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("params")
                            @ExcludeMissing
                            fun _params(): JsonField<Params> = params

                            /**
                             * Returns the raw JSON value of [type].
                             *
                             * Unlike [type], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Type> = type

                            /**
                             * Returns the raw JSON value of [filter].
                             *
                             * Unlike [filter], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("filter")
                            @ExcludeMissing
                            fun _filter(): JsonField<String> = filter

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [CustomChartFeedbackScoreMetricScalar].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .params()
                                 * .type()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [CustomChartFeedbackScoreMetricScalar]. */
                            class Builder internal constructor() {

                                private var field: JsonValue = JsonValue.from("feedback_score")
                                private var params: JsonField<Params>? = null
                                private var type: JsonField<Type>? = null
                                private var filter: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(
                                    customChartFeedbackScoreMetricScalar:
                                        CustomChartFeedbackScoreMetricScalar
                                ) = apply {
                                    field = customChartFeedbackScoreMetricScalar.field
                                    params = customChartFeedbackScoreMetricScalar.params
                                    type = customChartFeedbackScoreMetricScalar.type
                                    filter = customChartFeedbackScoreMetricScalar.filter
                                    additionalProperties =
                                        customChartFeedbackScoreMetricScalar.additionalProperties
                                            .toMutableMap()
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```java
                                 * JsonValue.from("feedback_score")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun field(field: JsonValue) = apply { this.field = field }

                                fun params(params: Params) = params(JsonField.of(params))

                                /**
                                 * Sets [Builder.params] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.params] with a well-typed
                                 * [Params] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun params(params: JsonField<Params>) = apply {
                                    this.params = params
                                }

                                fun type(type: Type) = type(JsonField.of(type))

                                /**
                                 * Sets [Builder.type] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.type] with a well-typed [Type]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun type(type: JsonField<Type>) = apply { this.type = type }

                                fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                                /**
                                 * Alias for calling [Builder.filter] with `filter.orElse(null)`.
                                 */
                                fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                                /**
                                 * Sets [Builder.filter] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.filter] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun filter(filter: JsonField<String>) = apply {
                                    this.filter = filter
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of
                                 * [CustomChartFeedbackScoreMetricScalar].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .params()
                                 * .type()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): CustomChartFeedbackScoreMetricScalar =
                                    CustomChartFeedbackScoreMetricScalar(
                                        field,
                                        checkRequired("params", params),
                                        checkRequired("type", type),
                                        filter,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LangChainInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): CustomChartFeedbackScoreMetricScalar = apply {
                                if (validated) {
                                    return@apply
                                }

                                _field().let {
                                    if (it != JsonValue.from("feedback_score")) {
                                        throw LangChainInvalidDataException(
                                            "'field' is invalid, received $it"
                                        )
                                    }
                                }
                                params().validate()
                                type().validate()
                                filter()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                field.let { if (it == JsonValue.from("feedback_score")) 1 else 0 } +
                                    (params.asKnown().getOrNull()?.validity() ?: 0) +
                                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                                    (if (filter.asKnown().isPresent) 1 else 0)

                            class Params
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val feedbackKey: JsonField<String>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("feedback_key")
                                    @ExcludeMissing
                                    feedbackKey: JsonField<String> = JsonMissing.of()
                                ) : this(feedbackKey, mutableMapOf())

                                /**
                                 * @throws LangChainInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

                                /**
                                 * Returns the raw JSON value of [feedbackKey].
                                 *
                                 * Unlike [feedbackKey], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("feedback_key")
                                @ExcludeMissing
                                fun _feedbackKey(): JsonField<String> = feedbackKey

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
                                     * Returns a mutable builder for constructing an instance of
                                     * [Params].
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .feedbackKey()
                                     * ```
                                     */
                                    @JvmStatic fun builder() = Builder()
                                }

                                /** A builder for [Params]. */
                                class Builder internal constructor() {

                                    private var feedbackKey: JsonField<String>? = null
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    @JvmSynthetic
                                    internal fun from(params: Params) = apply {
                                        feedbackKey = params.feedbackKey
                                        additionalProperties =
                                            params.additionalProperties.toMutableMap()
                                    }

                                    fun feedbackKey(feedbackKey: String) =
                                        feedbackKey(JsonField.of(feedbackKey))

                                    /**
                                     * Sets [Builder.feedbackKey] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.feedbackKey] with a
                                     * well-typed [String] value instead. This method is primarily
                                     * for setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun feedbackKey(feedbackKey: JsonField<String>) = apply {
                                        this.feedbackKey = feedbackKey
                                    }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [Params].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .feedbackKey()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): Params =
                                        Params(
                                            checkRequired("feedbackKey", feedbackKey),
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Params = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    feedbackKey()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    (if (feedbackKey.asKnown().isPresent) 1 else 0)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Params &&
                                        feedbackKey == other.feedbackKey &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(feedbackKey, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "Params{feedbackKey=$feedbackKey, additionalProperties=$additionalProperties}"
                            }

                            class Type
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val SUM = of("sum")

                                    @JvmField val MAX = of("max")

                                    @JvmField val MIN = of("min")

                                    @JvmField val AVG = of("avg")

                                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                }

                                /** An enum containing [Type]'s known values. */
                                enum class Known {
                                    SUM,
                                    MAX,
                                    MIN,
                                    AVG,
                                }

                                /**
                                 * An enum containing [Type]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Type] can contain an unknown value in a couple of
                                 * cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    SUM,
                                    MAX,
                                    MIN,
                                    AVG,
                                    /**
                                     * An enum member indicating that [Type] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        SUM -> Value.SUM
                                        MAX -> Value.MAX
                                        MIN -> Value.MIN
                                        AVG -> Value.AVG
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        SUM -> Known.SUM
                                        MAX -> Known.MAX
                                        MIN -> Known.MIN
                                        AVG -> Known.AVG
                                        else ->
                                            throw LangChainInvalidDataException(
                                                "Unknown Type: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LangChainInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Type = apply {
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Type && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CustomChartFeedbackScoreMetricScalar &&
                                    field == other.field &&
                                    params == other.params &&
                                    type == other.type &&
                                    filter == other.filter &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(field, params, type, filter, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "CustomChartFeedbackScoreMetricScalar{field=$field, params=$params, type=$type, filter=$filter, additionalProperties=$additionalProperties}"
                        }

                        class CustomChartMetricScalar
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val field: JsonField<Field>,
                            private val type: JsonField<Type>,
                            private val filter: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("field")
                                @ExcludeMissing
                                field: JsonField<Field> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonField<Type> = JsonMissing.of(),
                                @JsonProperty("filter")
                                @ExcludeMissing
                                filter: JsonField<String> = JsonMissing.of(),
                            ) : this(field, type, filter, mutableMapOf())

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun field(): Field = field.getRequired("field")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun type(): Type = type.getRequired("type")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun filter(): Optional<String> = filter.getOptional("filter")

                            /**
                             * Returns the raw JSON value of [field].
                             *
                             * Unlike [field], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("field")
                            @ExcludeMissing
                            fun _field(): JsonField<Field> = field

                            /**
                             * Returns the raw JSON value of [type].
                             *
                             * Unlike [type], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Type> = type

                            /**
                             * Returns the raw JSON value of [filter].
                             *
                             * Unlike [filter], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("filter")
                            @ExcludeMissing
                            fun _filter(): JsonField<String> = filter

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [CustomChartMetricScalar].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .field()
                                 * .type()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [CustomChartMetricScalar]. */
                            class Builder internal constructor() {

                                private var field: JsonField<Field>? = null
                                private var type: JsonField<Type>? = null
                                private var filter: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(
                                    customChartMetricScalar: CustomChartMetricScalar
                                ) = apply {
                                    field = customChartMetricScalar.field
                                    type = customChartMetricScalar.type
                                    filter = customChartMetricScalar.filter
                                    additionalProperties =
                                        customChartMetricScalar.additionalProperties.toMutableMap()
                                }

                                fun field(field: Field) = field(JsonField.of(field))

                                /**
                                 * Sets [Builder.field] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.field] with a well-typed [Field]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun field(field: JsonField<Field>) = apply { this.field = field }

                                fun type(type: Type) = type(JsonField.of(type))

                                /**
                                 * Sets [Builder.type] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.type] with a well-typed [Type]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun type(type: JsonField<Type>) = apply { this.type = type }

                                fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                                /**
                                 * Alias for calling [Builder.filter] with `filter.orElse(null)`.
                                 */
                                fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                                /**
                                 * Sets [Builder.filter] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.filter] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun filter(filter: JsonField<String>) = apply {
                                    this.filter = filter
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [CustomChartMetricScalar].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .field()
                                 * .type()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): CustomChartMetricScalar =
                                    CustomChartMetricScalar(
                                        checkRequired("field", field),
                                        checkRequired("type", type),
                                        filter,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LangChainInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): CustomChartMetricScalar = apply {
                                if (validated) {
                                    return@apply
                                }

                                field().validate()
                                type().validate()
                                filter()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                (field.asKnown().getOrNull()?.validity() ?: 0) +
                                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                                    (if (filter.asKnown().isPresent) 1 else 0)

                            class Field
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val LATENCY_SECONDS = of("latency_seconds")

                                    @JvmField val FIRST_TOKEN_SECONDS = of("first_token_seconds")

                                    @JvmField val TOTAL_TOKENS = of("total_tokens")

                                    @JvmField val PROMPT_TOKENS = of("prompt_tokens")

                                    @JvmField val COMPLETION_TOKENS = of("completion_tokens")

                                    @JvmField val TOTAL_COST = of("total_cost")

                                    @JvmField val PROMPT_COST = of("prompt_cost")

                                    @JvmField val COMPLETION_COST = of("completion_cost")

                                    @JvmField val FEEDBACK_SCORE = of("feedback_score")

                                    @JvmStatic fun of(value: String) = Field(JsonField.of(value))
                                }

                                /** An enum containing [Field]'s known values. */
                                enum class Known {
                                    LATENCY_SECONDS,
                                    FIRST_TOKEN_SECONDS,
                                    TOTAL_TOKENS,
                                    PROMPT_TOKENS,
                                    COMPLETION_TOKENS,
                                    TOTAL_COST,
                                    PROMPT_COST,
                                    COMPLETION_COST,
                                    FEEDBACK_SCORE,
                                }

                                /**
                                 * An enum containing [Field]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Field] can contain an unknown value in a couple
                                 * of cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    LATENCY_SECONDS,
                                    FIRST_TOKEN_SECONDS,
                                    TOTAL_TOKENS,
                                    PROMPT_TOKENS,
                                    COMPLETION_TOKENS,
                                    TOTAL_COST,
                                    PROMPT_COST,
                                    COMPLETION_COST,
                                    FEEDBACK_SCORE,
                                    /**
                                     * An enum member indicating that [Field] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        LATENCY_SECONDS -> Value.LATENCY_SECONDS
                                        FIRST_TOKEN_SECONDS -> Value.FIRST_TOKEN_SECONDS
                                        TOTAL_TOKENS -> Value.TOTAL_TOKENS
                                        PROMPT_TOKENS -> Value.PROMPT_TOKENS
                                        COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                                        TOTAL_COST -> Value.TOTAL_COST
                                        PROMPT_COST -> Value.PROMPT_COST
                                        COMPLETION_COST -> Value.COMPLETION_COST
                                        FEEDBACK_SCORE -> Value.FEEDBACK_SCORE
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        LATENCY_SECONDS -> Known.LATENCY_SECONDS
                                        FIRST_TOKEN_SECONDS -> Known.FIRST_TOKEN_SECONDS
                                        TOTAL_TOKENS -> Known.TOTAL_TOKENS
                                        PROMPT_TOKENS -> Known.PROMPT_TOKENS
                                        COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                                        TOTAL_COST -> Known.TOTAL_COST
                                        PROMPT_COST -> Known.PROMPT_COST
                                        COMPLETION_COST -> Known.COMPLETION_COST
                                        FEEDBACK_SCORE -> Known.FEEDBACK_SCORE
                                        else ->
                                            throw LangChainInvalidDataException(
                                                "Unknown Field: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LangChainInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Field = apply {
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Field && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            class Type
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val SUM = of("sum")

                                    @JvmField val MAX = of("max")

                                    @JvmField val MIN = of("min")

                                    @JvmField val AVG = of("avg")

                                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                }

                                /** An enum containing [Type]'s known values. */
                                enum class Known {
                                    SUM,
                                    MAX,
                                    MIN,
                                    AVG,
                                }

                                /**
                                 * An enum containing [Type]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Type] can contain an unknown value in a couple of
                                 * cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    SUM,
                                    MAX,
                                    MIN,
                                    AVG,
                                    /**
                                     * An enum member indicating that [Type] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        SUM -> Value.SUM
                                        MAX -> Value.MAX
                                        MIN -> Value.MIN
                                        AVG -> Value.AVG
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        SUM -> Known.SUM
                                        MAX -> Known.MAX
                                        MIN -> Known.MIN
                                        AVG -> Known.AVG
                                        else ->
                                            throw LangChainInvalidDataException(
                                                "Unknown Type: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LangChainInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Type = apply {
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Type && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CustomChartMetricScalar &&
                                    field == other.field &&
                                    type == other.type &&
                                    filter == other.filter &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(field, type, filter, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "CustomChartMetricScalar{field=$field, type=$type, filter=$filter, additionalProperties=$additionalProperties}"
                        }

                        class CustomChartFeedbackScoreMetricPercentile
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val field: JsonValue,
                            private val params: JsonField<Params>,
                            private val type: JsonValue,
                            private val filter: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("field")
                                @ExcludeMissing
                                field: JsonValue = JsonMissing.of(),
                                @JsonProperty("params")
                                @ExcludeMissing
                                params: JsonField<Params> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                                @JsonProperty("filter")
                                @ExcludeMissing
                                filter: JsonField<String> = JsonMissing.of(),
                            ) : this(field, params, type, filter, mutableMapOf())

                            /**
                             * Expected to always return the following:
                             * ```java
                             * JsonValue.from("feedback_score")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("field") @ExcludeMissing fun _field(): JsonValue = field

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun params(): Params = params.getRequired("params")

                            /**
                             * Expected to always return the following:
                             * ```java
                             * JsonValue.from("percentile")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun filter(): Optional<String> = filter.getOptional("filter")

                            /**
                             * Returns the raw JSON value of [params].
                             *
                             * Unlike [params], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("params")
                            @ExcludeMissing
                            fun _params(): JsonField<Params> = params

                            /**
                             * Returns the raw JSON value of [filter].
                             *
                             * Unlike [filter], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("filter")
                            @ExcludeMissing
                            fun _filter(): JsonField<String> = filter

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [CustomChartFeedbackScoreMetricPercentile].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .params()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [CustomChartFeedbackScoreMetricPercentile]. */
                            class Builder internal constructor() {

                                private var field: JsonValue = JsonValue.from("feedback_score")
                                private var params: JsonField<Params>? = null
                                private var type: JsonValue = JsonValue.from("percentile")
                                private var filter: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(
                                    customChartFeedbackScoreMetricPercentile:
                                        CustomChartFeedbackScoreMetricPercentile
                                ) = apply {
                                    field = customChartFeedbackScoreMetricPercentile.field
                                    params = customChartFeedbackScoreMetricPercentile.params
                                    type = customChartFeedbackScoreMetricPercentile.type
                                    filter = customChartFeedbackScoreMetricPercentile.filter
                                    additionalProperties =
                                        customChartFeedbackScoreMetricPercentile
                                            .additionalProperties
                                            .toMutableMap()
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```java
                                 * JsonValue.from("feedback_score")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun field(field: JsonValue) = apply { this.field = field }

                                fun params(params: Params) = params(JsonField.of(params))

                                /**
                                 * Sets [Builder.params] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.params] with a well-typed
                                 * [Params] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun params(params: JsonField<Params>) = apply {
                                    this.params = params
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```java
                                 * JsonValue.from("percentile")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                                /**
                                 * Alias for calling [Builder.filter] with `filter.orElse(null)`.
                                 */
                                fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                                /**
                                 * Sets [Builder.filter] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.filter] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun filter(filter: JsonField<String>) = apply {
                                    this.filter = filter
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of
                                 * [CustomChartFeedbackScoreMetricPercentile].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .params()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): CustomChartFeedbackScoreMetricPercentile =
                                    CustomChartFeedbackScoreMetricPercentile(
                                        field,
                                        checkRequired("params", params),
                                        type,
                                        filter,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LangChainInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): CustomChartFeedbackScoreMetricPercentile = apply {
                                if (validated) {
                                    return@apply
                                }

                                _field().let {
                                    if (it != JsonValue.from("feedback_score")) {
                                        throw LangChainInvalidDataException(
                                            "'field' is invalid, received $it"
                                        )
                                    }
                                }
                                params().validate()
                                _type().let {
                                    if (it != JsonValue.from("percentile")) {
                                        throw LangChainInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
                                }
                                filter()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                field.let { if (it == JsonValue.from("feedback_score")) 1 else 0 } +
                                    (params.asKnown().getOrNull()?.validity() ?: 0) +
                                    type.let { if (it == JsonValue.from("percentile")) 1 else 0 } +
                                    (if (filter.asKnown().isPresent) 1 else 0)

                            class Params
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val feedbackKey: JsonField<String>,
                                private val p: JsonField<Double>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("feedback_key")
                                    @ExcludeMissing
                                    feedbackKey: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("p")
                                    @ExcludeMissing
                                    p: JsonField<Double> = JsonMissing.of(),
                                ) : this(feedbackKey, p, mutableMapOf())

                                /**
                                 * @throws LangChainInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

                                /**
                                 * @throws LangChainInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun p(): Double = p.getRequired("p")

                                /**
                                 * Returns the raw JSON value of [feedbackKey].
                                 *
                                 * Unlike [feedbackKey], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("feedback_key")
                                @ExcludeMissing
                                fun _feedbackKey(): JsonField<String> = feedbackKey

                                /**
                                 * Returns the raw JSON value of [p].
                                 *
                                 * Unlike [p], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("p") @ExcludeMissing fun _p(): JsonField<Double> = p

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
                                     * Returns a mutable builder for constructing an instance of
                                     * [Params].
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .feedbackKey()
                                     * .p()
                                     * ```
                                     */
                                    @JvmStatic fun builder() = Builder()
                                }

                                /** A builder for [Params]. */
                                class Builder internal constructor() {

                                    private var feedbackKey: JsonField<String>? = null
                                    private var p: JsonField<Double>? = null
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    @JvmSynthetic
                                    internal fun from(params: Params) = apply {
                                        feedbackKey = params.feedbackKey
                                        p = params.p
                                        additionalProperties =
                                            params.additionalProperties.toMutableMap()
                                    }

                                    fun feedbackKey(feedbackKey: String) =
                                        feedbackKey(JsonField.of(feedbackKey))

                                    /**
                                     * Sets [Builder.feedbackKey] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.feedbackKey] with a
                                     * well-typed [String] value instead. This method is primarily
                                     * for setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun feedbackKey(feedbackKey: JsonField<String>) = apply {
                                        this.feedbackKey = feedbackKey
                                    }

                                    fun p(p: Double) = p(JsonField.of(p))

                                    /**
                                     * Sets [Builder.p] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.p] with a well-typed
                                     * [Double] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun p(p: JsonField<Double>) = apply { this.p = p }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [Params].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .feedbackKey()
                                     * .p()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): Params =
                                        Params(
                                            checkRequired("feedbackKey", feedbackKey),
                                            checkRequired("p", p),
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Params = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    feedbackKey()
                                    p()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    (if (feedbackKey.asKnown().isPresent) 1 else 0) +
                                        (if (p.asKnown().isPresent) 1 else 0)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Params &&
                                        feedbackKey == other.feedbackKey &&
                                        p == other.p &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(feedbackKey, p, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "Params{feedbackKey=$feedbackKey, p=$p, additionalProperties=$additionalProperties}"
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CustomChartFeedbackScoreMetricPercentile &&
                                    field == other.field &&
                                    params == other.params &&
                                    type == other.type &&
                                    filter == other.filter &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(field, params, type, filter, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "CustomChartFeedbackScoreMetricPercentile{field=$field, params=$params, type=$type, filter=$filter, additionalProperties=$additionalProperties}"
                        }

                        class CustomChartMetricPercentile
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val field: JsonField<Field>,
                            private val params: JsonField<Params>,
                            private val type: JsonValue,
                            private val filter: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("field")
                                @ExcludeMissing
                                field: JsonField<Field> = JsonMissing.of(),
                                @JsonProperty("params")
                                @ExcludeMissing
                                params: JsonField<Params> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                                @JsonProperty("filter")
                                @ExcludeMissing
                                filter: JsonField<String> = JsonMissing.of(),
                            ) : this(field, params, type, filter, mutableMapOf())

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun field(): Field = field.getRequired("field")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun params(): Params = params.getRequired("params")

                            /**
                             * Expected to always return the following:
                             * ```java
                             * JsonValue.from("percentile")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun filter(): Optional<String> = filter.getOptional("filter")

                            /**
                             * Returns the raw JSON value of [field].
                             *
                             * Unlike [field], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("field")
                            @ExcludeMissing
                            fun _field(): JsonField<Field> = field

                            /**
                             * Returns the raw JSON value of [params].
                             *
                             * Unlike [params], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("params")
                            @ExcludeMissing
                            fun _params(): JsonField<Params> = params

                            /**
                             * Returns the raw JSON value of [filter].
                             *
                             * Unlike [filter], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("filter")
                            @ExcludeMissing
                            fun _filter(): JsonField<String> = filter

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [CustomChartMetricPercentile].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .field()
                                 * .params()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [CustomChartMetricPercentile]. */
                            class Builder internal constructor() {

                                private var field: JsonField<Field>? = null
                                private var params: JsonField<Params>? = null
                                private var type: JsonValue = JsonValue.from("percentile")
                                private var filter: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(
                                    customChartMetricPercentile: CustomChartMetricPercentile
                                ) = apply {
                                    field = customChartMetricPercentile.field
                                    params = customChartMetricPercentile.params
                                    type = customChartMetricPercentile.type
                                    filter = customChartMetricPercentile.filter
                                    additionalProperties =
                                        customChartMetricPercentile.additionalProperties
                                            .toMutableMap()
                                }

                                fun field(field: Field) = field(JsonField.of(field))

                                /**
                                 * Sets [Builder.field] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.field] with a well-typed [Field]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun field(field: JsonField<Field>) = apply { this.field = field }

                                fun params(params: Params) = params(JsonField.of(params))

                                /**
                                 * Sets [Builder.params] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.params] with a well-typed
                                 * [Params] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun params(params: JsonField<Params>) = apply {
                                    this.params = params
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```java
                                 * JsonValue.from("percentile")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                                /**
                                 * Alias for calling [Builder.filter] with `filter.orElse(null)`.
                                 */
                                fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                                /**
                                 * Sets [Builder.filter] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.filter] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun filter(filter: JsonField<String>) = apply {
                                    this.filter = filter
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [CustomChartMetricPercentile].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .field()
                                 * .params()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): CustomChartMetricPercentile =
                                    CustomChartMetricPercentile(
                                        checkRequired("field", field),
                                        checkRequired("params", params),
                                        type,
                                        filter,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LangChainInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): CustomChartMetricPercentile = apply {
                                if (validated) {
                                    return@apply
                                }

                                field().validate()
                                params().validate()
                                _type().let {
                                    if (it != JsonValue.from("percentile")) {
                                        throw LangChainInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
                                }
                                filter()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                (field.asKnown().getOrNull()?.validity() ?: 0) +
                                    (params.asKnown().getOrNull()?.validity() ?: 0) +
                                    type.let { if (it == JsonValue.from("percentile")) 1 else 0 } +
                                    (if (filter.asKnown().isPresent) 1 else 0)

                            class Field
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val LATENCY_SECONDS = of("latency_seconds")

                                    @JvmField val FIRST_TOKEN_SECONDS = of("first_token_seconds")

                                    @JvmField val TOTAL_TOKENS = of("total_tokens")

                                    @JvmField val PROMPT_TOKENS = of("prompt_tokens")

                                    @JvmField val COMPLETION_TOKENS = of("completion_tokens")

                                    @JvmField val TOTAL_COST = of("total_cost")

                                    @JvmField val PROMPT_COST = of("prompt_cost")

                                    @JvmField val COMPLETION_COST = of("completion_cost")

                                    @JvmField val FEEDBACK_SCORE = of("feedback_score")

                                    @JvmStatic fun of(value: String) = Field(JsonField.of(value))
                                }

                                /** An enum containing [Field]'s known values. */
                                enum class Known {
                                    LATENCY_SECONDS,
                                    FIRST_TOKEN_SECONDS,
                                    TOTAL_TOKENS,
                                    PROMPT_TOKENS,
                                    COMPLETION_TOKENS,
                                    TOTAL_COST,
                                    PROMPT_COST,
                                    COMPLETION_COST,
                                    FEEDBACK_SCORE,
                                }

                                /**
                                 * An enum containing [Field]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Field] can contain an unknown value in a couple
                                 * of cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    LATENCY_SECONDS,
                                    FIRST_TOKEN_SECONDS,
                                    TOTAL_TOKENS,
                                    PROMPT_TOKENS,
                                    COMPLETION_TOKENS,
                                    TOTAL_COST,
                                    PROMPT_COST,
                                    COMPLETION_COST,
                                    FEEDBACK_SCORE,
                                    /**
                                     * An enum member indicating that [Field] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        LATENCY_SECONDS -> Value.LATENCY_SECONDS
                                        FIRST_TOKEN_SECONDS -> Value.FIRST_TOKEN_SECONDS
                                        TOTAL_TOKENS -> Value.TOTAL_TOKENS
                                        PROMPT_TOKENS -> Value.PROMPT_TOKENS
                                        COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                                        TOTAL_COST -> Value.TOTAL_COST
                                        PROMPT_COST -> Value.PROMPT_COST
                                        COMPLETION_COST -> Value.COMPLETION_COST
                                        FEEDBACK_SCORE -> Value.FEEDBACK_SCORE
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        LATENCY_SECONDS -> Known.LATENCY_SECONDS
                                        FIRST_TOKEN_SECONDS -> Known.FIRST_TOKEN_SECONDS
                                        TOTAL_TOKENS -> Known.TOTAL_TOKENS
                                        PROMPT_TOKENS -> Known.PROMPT_TOKENS
                                        COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                                        TOTAL_COST -> Known.TOTAL_COST
                                        PROMPT_COST -> Known.PROMPT_COST
                                        COMPLETION_COST -> Known.COMPLETION_COST
                                        FEEDBACK_SCORE -> Known.FEEDBACK_SCORE
                                        else ->
                                            throw LangChainInvalidDataException(
                                                "Unknown Field: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LangChainInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Field = apply {
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Field && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            class Params
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val p: JsonField<Double>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("p")
                                    @ExcludeMissing
                                    p: JsonField<Double> = JsonMissing.of()
                                ) : this(p, mutableMapOf())

                                /**
                                 * @throws LangChainInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun p(): Double = p.getRequired("p")

                                /**
                                 * Returns the raw JSON value of [p].
                                 *
                                 * Unlike [p], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("p") @ExcludeMissing fun _p(): JsonField<Double> = p

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
                                     * Returns a mutable builder for constructing an instance of
                                     * [Params].
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .p()
                                     * ```
                                     */
                                    @JvmStatic fun builder() = Builder()
                                }

                                /** A builder for [Params]. */
                                class Builder internal constructor() {

                                    private var p: JsonField<Double>? = null
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    @JvmSynthetic
                                    internal fun from(params: Params) = apply {
                                        p = params.p
                                        additionalProperties =
                                            params.additionalProperties.toMutableMap()
                                    }

                                    fun p(p: Double) = p(JsonField.of(p))

                                    /**
                                     * Sets [Builder.p] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.p] with a well-typed
                                     * [Double] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun p(p: JsonField<Double>) = apply { this.p = p }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [Params].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .p()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): Params =
                                        Params(
                                            checkRequired("p", p),
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Params = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    p()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int = (if (p.asKnown().isPresent) 1 else 0)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Params &&
                                        p == other.p &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(p, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "Params{p=$p, additionalProperties=$additionalProperties}"
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CustomChartMetricPercentile &&
                                    field == other.field &&
                                    params == other.params &&
                                    type == other.type &&
                                    filter == other.filter &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(field, params, type, filter, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "CustomChartMetricPercentile{field=$field, params=$params, type=$type, filter=$filter, additionalProperties=$additionalProperties}"
                        }
                    }

                    @JsonDeserialize(using = Numerator.Deserializer::class)
                    @JsonSerialize(using = Numerator.Serializer::class)
                    class Numerator
                    private constructor(
                        private val customChartFeedbackCountMetric:
                            CustomChartFeedbackCountMetric? =
                            null,
                        private val customChartMetricCount: CustomChartMetricCount? = null,
                        private val customChartFeedbackScoreMetricScalar:
                            CustomChartFeedbackScoreMetricScalar? =
                            null,
                        private val customChartMetricScalar: CustomChartMetricScalar? = null,
                        private val customChartFeedbackScoreMetricPercentile:
                            CustomChartFeedbackScoreMetricPercentile? =
                            null,
                        private val customChartMetricPercentile: CustomChartMetricPercentile? =
                            null,
                        private val _json: JsonValue? = null,
                    ) {

                        fun customChartFeedbackCountMetric():
                            Optional<CustomChartFeedbackCountMetric> =
                            Optional.ofNullable(customChartFeedbackCountMetric)

                        fun customChartMetricCount(): Optional<CustomChartMetricCount> =
                            Optional.ofNullable(customChartMetricCount)

                        fun customChartFeedbackScoreMetricScalar():
                            Optional<CustomChartFeedbackScoreMetricScalar> =
                            Optional.ofNullable(customChartFeedbackScoreMetricScalar)

                        fun customChartMetricScalar(): Optional<CustomChartMetricScalar> =
                            Optional.ofNullable(customChartMetricScalar)

                        fun customChartFeedbackScoreMetricPercentile():
                            Optional<CustomChartFeedbackScoreMetricPercentile> =
                            Optional.ofNullable(customChartFeedbackScoreMetricPercentile)

                        fun customChartMetricPercentile(): Optional<CustomChartMetricPercentile> =
                            Optional.ofNullable(customChartMetricPercentile)

                        fun isCustomChartFeedbackCountMetric(): Boolean =
                            customChartFeedbackCountMetric != null

                        fun isCustomChartMetricCount(): Boolean = customChartMetricCount != null

                        fun isCustomChartFeedbackScoreMetricScalar(): Boolean =
                            customChartFeedbackScoreMetricScalar != null

                        fun isCustomChartMetricScalar(): Boolean = customChartMetricScalar != null

                        fun isCustomChartFeedbackScoreMetricPercentile(): Boolean =
                            customChartFeedbackScoreMetricPercentile != null

                        fun isCustomChartMetricPercentile(): Boolean =
                            customChartMetricPercentile != null

                        fun asCustomChartFeedbackCountMetric(): CustomChartFeedbackCountMetric =
                            customChartFeedbackCountMetric.getOrThrow(
                                "customChartFeedbackCountMetric"
                            )

                        fun asCustomChartMetricCount(): CustomChartMetricCount =
                            customChartMetricCount.getOrThrow("customChartMetricCount")

                        fun asCustomChartFeedbackScoreMetricScalar():
                            CustomChartFeedbackScoreMetricScalar =
                            customChartFeedbackScoreMetricScalar.getOrThrow(
                                "customChartFeedbackScoreMetricScalar"
                            )

                        fun asCustomChartMetricScalar(): CustomChartMetricScalar =
                            customChartMetricScalar.getOrThrow("customChartMetricScalar")

                        fun asCustomChartFeedbackScoreMetricPercentile():
                            CustomChartFeedbackScoreMetricPercentile =
                            customChartFeedbackScoreMetricPercentile.getOrThrow(
                                "customChartFeedbackScoreMetricPercentile"
                            )

                        fun asCustomChartMetricPercentile(): CustomChartMetricPercentile =
                            customChartMetricPercentile.getOrThrow("customChartMetricPercentile")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        /**
                         * Maps this instance's current variant to a value of type [T] using the
                         * given [visitor].
                         *
                         * Note that this method is _not_ forwards compatible with new variants from
                         * the API, unless [visitor] overrides [Visitor.unknown]. To handle variants
                         * not known to this version of the SDK gracefully, consider overriding
                         * [Visitor.unknown]:
                         * ```java
                         * import com.langchain.smith.core.JsonValue;
                         * import java.util.Optional;
                         *
                         * Optional<String> result = numerator.accept(new Numerator.Visitor<Optional<String>>() {
                         *     @Override
                         *     public Optional<String> visitCustomChartFeedbackCountMetric(CustomChartFeedbackCountMetric customChartFeedbackCountMetric) {
                         *         return Optional.of(customChartFeedbackCountMetric.toString());
                         *     }
                         *
                         *     // ...
                         *
                         *     @Override
                         *     public Optional<String> unknown(JsonValue json) {
                         *         // Or inspect the `json`.
                         *         return Optional.empty();
                         *     }
                         * });
                         * ```
                         *
                         * @throws LangChainInvalidDataException if [Visitor.unknown] is not
                         *   overridden in [visitor] and the current variant is unknown.
                         */
                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                customChartFeedbackCountMetric != null ->
                                    visitor.visitCustomChartFeedbackCountMetric(
                                        customChartFeedbackCountMetric
                                    )
                                customChartMetricCount != null ->
                                    visitor.visitCustomChartMetricCount(customChartMetricCount)
                                customChartFeedbackScoreMetricScalar != null ->
                                    visitor.visitCustomChartFeedbackScoreMetricScalar(
                                        customChartFeedbackScoreMetricScalar
                                    )
                                customChartMetricScalar != null ->
                                    visitor.visitCustomChartMetricScalar(customChartMetricScalar)
                                customChartFeedbackScoreMetricPercentile != null ->
                                    visitor.visitCustomChartFeedbackScoreMetricPercentile(
                                        customChartFeedbackScoreMetricPercentile
                                    )
                                customChartMetricPercentile != null ->
                                    visitor.visitCustomChartMetricPercentile(
                                        customChartMetricPercentile
                                    )
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws LangChainInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Numerator = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitCustomChartFeedbackCountMetric(
                                        customChartFeedbackCountMetric:
                                            CustomChartFeedbackCountMetric
                                    ) {
                                        customChartFeedbackCountMetric.validate()
                                    }

                                    override fun visitCustomChartMetricCount(
                                        customChartMetricCount: CustomChartMetricCount
                                    ) {
                                        customChartMetricCount.validate()
                                    }

                                    override fun visitCustomChartFeedbackScoreMetricScalar(
                                        customChartFeedbackScoreMetricScalar:
                                            CustomChartFeedbackScoreMetricScalar
                                    ) {
                                        customChartFeedbackScoreMetricScalar.validate()
                                    }

                                    override fun visitCustomChartMetricScalar(
                                        customChartMetricScalar: CustomChartMetricScalar
                                    ) {
                                        customChartMetricScalar.validate()
                                    }

                                    override fun visitCustomChartFeedbackScoreMetricPercentile(
                                        customChartFeedbackScoreMetricPercentile:
                                            CustomChartFeedbackScoreMetricPercentile
                                    ) {
                                        customChartFeedbackScoreMetricPercentile.validate()
                                    }

                                    override fun visitCustomChartMetricPercentile(
                                        customChartMetricPercentile: CustomChartMetricPercentile
                                    ) {
                                        customChartMetricPercentile.validate()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitCustomChartFeedbackCountMetric(
                                        customChartFeedbackCountMetric:
                                            CustomChartFeedbackCountMetric
                                    ) = customChartFeedbackCountMetric.validity()

                                    override fun visitCustomChartMetricCount(
                                        customChartMetricCount: CustomChartMetricCount
                                    ) = customChartMetricCount.validity()

                                    override fun visitCustomChartFeedbackScoreMetricScalar(
                                        customChartFeedbackScoreMetricScalar:
                                            CustomChartFeedbackScoreMetricScalar
                                    ) = customChartFeedbackScoreMetricScalar.validity()

                                    override fun visitCustomChartMetricScalar(
                                        customChartMetricScalar: CustomChartMetricScalar
                                    ) = customChartMetricScalar.validity()

                                    override fun visitCustomChartFeedbackScoreMetricPercentile(
                                        customChartFeedbackScoreMetricPercentile:
                                            CustomChartFeedbackScoreMetricPercentile
                                    ) = customChartFeedbackScoreMetricPercentile.validity()

                                    override fun visitCustomChartMetricPercentile(
                                        customChartMetricPercentile: CustomChartMetricPercentile
                                    ) = customChartMetricPercentile.validity()

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Numerator &&
                                customChartFeedbackCountMetric ==
                                    other.customChartFeedbackCountMetric &&
                                customChartMetricCount == other.customChartMetricCount &&
                                customChartFeedbackScoreMetricScalar ==
                                    other.customChartFeedbackScoreMetricScalar &&
                                customChartMetricScalar == other.customChartMetricScalar &&
                                customChartFeedbackScoreMetricPercentile ==
                                    other.customChartFeedbackScoreMetricPercentile &&
                                customChartMetricPercentile == other.customChartMetricPercentile
                        }

                        override fun hashCode(): Int =
                            Objects.hash(
                                customChartFeedbackCountMetric,
                                customChartMetricCount,
                                customChartFeedbackScoreMetricScalar,
                                customChartMetricScalar,
                                customChartFeedbackScoreMetricPercentile,
                                customChartMetricPercentile,
                            )

                        override fun toString(): String =
                            when {
                                customChartFeedbackCountMetric != null ->
                                    "Numerator{customChartFeedbackCountMetric=$customChartFeedbackCountMetric}"
                                customChartMetricCount != null ->
                                    "Numerator{customChartMetricCount=$customChartMetricCount}"
                                customChartFeedbackScoreMetricScalar != null ->
                                    "Numerator{customChartFeedbackScoreMetricScalar=$customChartFeedbackScoreMetricScalar}"
                                customChartMetricScalar != null ->
                                    "Numerator{customChartMetricScalar=$customChartMetricScalar}"
                                customChartFeedbackScoreMetricPercentile != null ->
                                    "Numerator{customChartFeedbackScoreMetricPercentile=$customChartFeedbackScoreMetricPercentile}"
                                customChartMetricPercentile != null ->
                                    "Numerator{customChartMetricPercentile=$customChartMetricPercentile}"
                                _json != null -> "Numerator{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Numerator")
                            }

                        companion object {

                            @JvmStatic
                            fun ofCustomChartFeedbackCountMetric(
                                customChartFeedbackCountMetric: CustomChartFeedbackCountMetric
                            ) =
                                Numerator(
                                    customChartFeedbackCountMetric = customChartFeedbackCountMetric
                                )

                            @JvmStatic
                            fun ofCustomChartMetricCount(
                                customChartMetricCount: CustomChartMetricCount
                            ) = Numerator(customChartMetricCount = customChartMetricCount)

                            @JvmStatic
                            fun ofCustomChartFeedbackScoreMetricScalar(
                                customChartFeedbackScoreMetricScalar:
                                    CustomChartFeedbackScoreMetricScalar
                            ) =
                                Numerator(
                                    customChartFeedbackScoreMetricScalar =
                                        customChartFeedbackScoreMetricScalar
                                )

                            @JvmStatic
                            fun ofCustomChartMetricScalar(
                                customChartMetricScalar: CustomChartMetricScalar
                            ) = Numerator(customChartMetricScalar = customChartMetricScalar)

                            @JvmStatic
                            fun ofCustomChartFeedbackScoreMetricPercentile(
                                customChartFeedbackScoreMetricPercentile:
                                    CustomChartFeedbackScoreMetricPercentile
                            ) =
                                Numerator(
                                    customChartFeedbackScoreMetricPercentile =
                                        customChartFeedbackScoreMetricPercentile
                                )

                            @JvmStatic
                            fun ofCustomChartMetricPercentile(
                                customChartMetricPercentile: CustomChartMetricPercentile
                            ) = Numerator(customChartMetricPercentile = customChartMetricPercentile)
                        }

                        /**
                         * An interface that defines how to map each variant of [Numerator] to a
                         * value of type [T].
                         */
                        interface Visitor<out T> {

                            fun visitCustomChartFeedbackCountMetric(
                                customChartFeedbackCountMetric: CustomChartFeedbackCountMetric
                            ): T

                            fun visitCustomChartMetricCount(
                                customChartMetricCount: CustomChartMetricCount
                            ): T

                            fun visitCustomChartFeedbackScoreMetricScalar(
                                customChartFeedbackScoreMetricScalar:
                                    CustomChartFeedbackScoreMetricScalar
                            ): T

                            fun visitCustomChartMetricScalar(
                                customChartMetricScalar: CustomChartMetricScalar
                            ): T

                            fun visitCustomChartFeedbackScoreMetricPercentile(
                                customChartFeedbackScoreMetricPercentile:
                                    CustomChartFeedbackScoreMetricPercentile
                            ): T

                            fun visitCustomChartMetricPercentile(
                                customChartMetricPercentile: CustomChartMetricPercentile
                            ): T

                            /**
                             * Maps an unknown variant of [Numerator] to a value of type [T].
                             *
                             * An instance of [Numerator] can contain an unknown variant if it was
                             * deserialized from data that doesn't match any known variant. For
                             * example, if the SDK is on an older version than the API, then the API
                             * may respond with new variants that the SDK is unaware of.
                             *
                             * @throws LangChainInvalidDataException in the default implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                                throw LangChainInvalidDataException("Unknown Numerator: $json")
                            }
                        }

                        internal class Deserializer :
                            BaseDeserializer<Numerator>(Numerator::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Numerator {
                                val json = JsonValue.fromJsonNode(node)

                                val bestMatches =
                                    sequenceOf(
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<CustomChartFeedbackCountMetric>(),
                                                )
                                                ?.let {
                                                    Numerator(
                                                        customChartFeedbackCountMetric = it,
                                                        _json = json,
                                                    )
                                                },
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<CustomChartMetricCount>(),
                                                )
                                                ?.let {
                                                    Numerator(
                                                        customChartMetricCount = it,
                                                        _json = json,
                                                    )
                                                },
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<
                                                        CustomChartFeedbackScoreMetricScalar
                                                    >(),
                                                )
                                                ?.let {
                                                    Numerator(
                                                        customChartFeedbackScoreMetricScalar = it,
                                                        _json = json,
                                                    )
                                                },
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<CustomChartMetricScalar>(),
                                                )
                                                ?.let {
                                                    Numerator(
                                                        customChartMetricScalar = it,
                                                        _json = json,
                                                    )
                                                },
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<
                                                        CustomChartFeedbackScoreMetricPercentile
                                                    >(),
                                                )
                                                ?.let {
                                                    Numerator(
                                                        customChartFeedbackScoreMetricPercentile =
                                                            it,
                                                        _json = json,
                                                    )
                                                },
                                            tryDeserialize(
                                                    node,
                                                    jacksonTypeRef<CustomChartMetricPercentile>(),
                                                )
                                                ?.let {
                                                    Numerator(
                                                        customChartMetricPercentile = it,
                                                        _json = json,
                                                    )
                                                },
                                        )
                                        .filterNotNull()
                                        .allMaxBy { it.validity() }
                                        .toList()
                                return when (bestMatches.size) {
                                    // This can happen if what we're deserializing is completely
                                    // incompatible with all the possible variants (e.g.
                                    // deserializing from boolean).
                                    0 -> Numerator(_json = json)
                                    1 -> bestMatches.single()
                                    // If there's more than one match with the highest validity,
                                    // then use the first completely valid match, or simply the
                                    // first match if none are completely valid.
                                    else ->
                                        bestMatches.firstOrNull { it.isValid() }
                                            ?: bestMatches.first()
                                }
                            }
                        }

                        internal class Serializer : BaseSerializer<Numerator>(Numerator::class) {

                            override fun serialize(
                                value: Numerator,
                                generator: JsonGenerator,
                                provider: SerializerProvider,
                            ) {
                                when {
                                    value.customChartFeedbackCountMetric != null ->
                                        generator.writeObject(value.customChartFeedbackCountMetric)
                                    value.customChartMetricCount != null ->
                                        generator.writeObject(value.customChartMetricCount)
                                    value.customChartFeedbackScoreMetricScalar != null ->
                                        generator.writeObject(
                                            value.customChartFeedbackScoreMetricScalar
                                        )
                                    value.customChartMetricScalar != null ->
                                        generator.writeObject(value.customChartMetricScalar)
                                    value.customChartFeedbackScoreMetricPercentile != null ->
                                        generator.writeObject(
                                            value.customChartFeedbackScoreMetricPercentile
                                        )
                                    value.customChartMetricPercentile != null ->
                                        generator.writeObject(value.customChartMetricPercentile)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid Numerator")
                                }
                            }
                        }

                        class CustomChartFeedbackCountMetric
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val entity: JsonValue,
                            private val params: JsonField<Params>,
                            private val filter: JsonField<String>,
                            private val type: JsonField<Type>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("entity")
                                @ExcludeMissing
                                entity: JsonValue = JsonMissing.of(),
                                @JsonProperty("params")
                                @ExcludeMissing
                                params: JsonField<Params> = JsonMissing.of(),
                                @JsonProperty("filter")
                                @ExcludeMissing
                                filter: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonField<Type> = JsonMissing.of(),
                            ) : this(entity, params, filter, type, mutableMapOf())

                            /**
                             * Expected to always return the following:
                             * ```java
                             * JsonValue.from("feedback")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("entity")
                            @ExcludeMissing
                            fun _entity(): JsonValue = entity

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun params(): Params = params.getRequired("params")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun filter(): Optional<String> = filter.getOptional("filter")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun type(): Optional<Type> = type.getOptional("type")

                            /**
                             * Returns the raw JSON value of [params].
                             *
                             * Unlike [params], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("params")
                            @ExcludeMissing
                            fun _params(): JsonField<Params> = params

                            /**
                             * Returns the raw JSON value of [filter].
                             *
                             * Unlike [filter], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("filter")
                            @ExcludeMissing
                            fun _filter(): JsonField<String> = filter

                            /**
                             * Returns the raw JSON value of [type].
                             *
                             * Unlike [type], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Type> = type

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [CustomChartFeedbackCountMetric].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .params()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [CustomChartFeedbackCountMetric]. */
                            class Builder internal constructor() {

                                private var entity: JsonValue = JsonValue.from("feedback")
                                private var params: JsonField<Params>? = null
                                private var filter: JsonField<String> = JsonMissing.of()
                                private var type: JsonField<Type> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(
                                    customChartFeedbackCountMetric: CustomChartFeedbackCountMetric
                                ) = apply {
                                    entity = customChartFeedbackCountMetric.entity
                                    params = customChartFeedbackCountMetric.params
                                    filter = customChartFeedbackCountMetric.filter
                                    type = customChartFeedbackCountMetric.type
                                    additionalProperties =
                                        customChartFeedbackCountMetric.additionalProperties
                                            .toMutableMap()
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```java
                                 * JsonValue.from("feedback")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun entity(entity: JsonValue) = apply { this.entity = entity }

                                fun params(params: Params) = params(JsonField.of(params))

                                /**
                                 * Sets [Builder.params] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.params] with a well-typed
                                 * [Params] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun params(params: JsonField<Params>) = apply {
                                    this.params = params
                                }

                                fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                                /**
                                 * Alias for calling [Builder.filter] with `filter.orElse(null)`.
                                 */
                                fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                                /**
                                 * Sets [Builder.filter] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.filter] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun filter(filter: JsonField<String>) = apply {
                                    this.filter = filter
                                }

                                fun type(type: Type) = type(JsonField.of(type))

                                /**
                                 * Sets [Builder.type] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.type] with a well-typed [Type]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun type(type: JsonField<Type>) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of
                                 * [CustomChartFeedbackCountMetric].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .params()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): CustomChartFeedbackCountMetric =
                                    CustomChartFeedbackCountMetric(
                                        entity,
                                        checkRequired("params", params),
                                        filter,
                                        type,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LangChainInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): CustomChartFeedbackCountMetric = apply {
                                if (validated) {
                                    return@apply
                                }

                                _entity().let {
                                    if (it != JsonValue.from("feedback")) {
                                        throw LangChainInvalidDataException(
                                            "'entity' is invalid, received $it"
                                        )
                                    }
                                }
                                params().validate()
                                filter()
                                type().ifPresent { it.validate() }
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                entity.let { if (it == JsonValue.from("feedback")) 1 else 0 } +
                                    (params.asKnown().getOrNull()?.validity() ?: 0) +
                                    (if (filter.asKnown().isPresent) 1 else 0) +
                                    (type.asKnown().getOrNull()?.validity() ?: 0)

                            class Params
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val feedbackKey: JsonField<String>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("feedback_key")
                                    @ExcludeMissing
                                    feedbackKey: JsonField<String> = JsonMissing.of()
                                ) : this(feedbackKey, mutableMapOf())

                                /**
                                 * @throws LangChainInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

                                /**
                                 * Returns the raw JSON value of [feedbackKey].
                                 *
                                 * Unlike [feedbackKey], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("feedback_key")
                                @ExcludeMissing
                                fun _feedbackKey(): JsonField<String> = feedbackKey

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
                                     * Returns a mutable builder for constructing an instance of
                                     * [Params].
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .feedbackKey()
                                     * ```
                                     */
                                    @JvmStatic fun builder() = Builder()
                                }

                                /** A builder for [Params]. */
                                class Builder internal constructor() {

                                    private var feedbackKey: JsonField<String>? = null
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    @JvmSynthetic
                                    internal fun from(params: Params) = apply {
                                        feedbackKey = params.feedbackKey
                                        additionalProperties =
                                            params.additionalProperties.toMutableMap()
                                    }

                                    fun feedbackKey(feedbackKey: String) =
                                        feedbackKey(JsonField.of(feedbackKey))

                                    /**
                                     * Sets [Builder.feedbackKey] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.feedbackKey] with a
                                     * well-typed [String] value instead. This method is primarily
                                     * for setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun feedbackKey(feedbackKey: JsonField<String>) = apply {
                                        this.feedbackKey = feedbackKey
                                    }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [Params].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .feedbackKey()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): Params =
                                        Params(
                                            checkRequired("feedbackKey", feedbackKey),
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Params = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    feedbackKey()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    (if (feedbackKey.asKnown().isPresent) 1 else 0)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Params &&
                                        feedbackKey == other.feedbackKey &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(feedbackKey, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "Params{feedbackKey=$feedbackKey, additionalProperties=$additionalProperties}"
                            }

                            class Type
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val COUNT = of("count")

                                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                }

                                /** An enum containing [Type]'s known values. */
                                enum class Known {
                                    COUNT
                                }

                                /**
                                 * An enum containing [Type]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Type] can contain an unknown value in a couple of
                                 * cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    COUNT,
                                    /**
                                     * An enum member indicating that [Type] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        COUNT -> Value.COUNT
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        COUNT -> Known.COUNT
                                        else ->
                                            throw LangChainInvalidDataException(
                                                "Unknown Type: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LangChainInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Type = apply {
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Type && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CustomChartFeedbackCountMetric &&
                                    entity == other.entity &&
                                    params == other.params &&
                                    filter == other.filter &&
                                    type == other.type &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(entity, params, filter, type, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "CustomChartFeedbackCountMetric{entity=$entity, params=$params, filter=$filter, type=$type, additionalProperties=$additionalProperties}"
                        }

                        class CustomChartMetricCount
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val filter: JsonField<String>,
                            private val type: JsonField<Type>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("filter")
                                @ExcludeMissing
                                filter: JsonField<String> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonField<Type> = JsonMissing.of(),
                            ) : this(filter, type, mutableMapOf())

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun filter(): Optional<String> = filter.getOptional("filter")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun type(): Optional<Type> = type.getOptional("type")

                            /**
                             * Returns the raw JSON value of [filter].
                             *
                             * Unlike [filter], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("filter")
                            @ExcludeMissing
                            fun _filter(): JsonField<String> = filter

                            /**
                             * Returns the raw JSON value of [type].
                             *
                             * Unlike [type], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Type> = type

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [CustomChartMetricCount].
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [CustomChartMetricCount]. */
                            class Builder internal constructor() {

                                private var filter: JsonField<String> = JsonMissing.of()
                                private var type: JsonField<Type> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(customChartMetricCount: CustomChartMetricCount) =
                                    apply {
                                        filter = customChartMetricCount.filter
                                        type = customChartMetricCount.type
                                        additionalProperties =
                                            customChartMetricCount.additionalProperties
                                                .toMutableMap()
                                    }

                                fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                                /**
                                 * Alias for calling [Builder.filter] with `filter.orElse(null)`.
                                 */
                                fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                                /**
                                 * Sets [Builder.filter] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.filter] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun filter(filter: JsonField<String>) = apply {
                                    this.filter = filter
                                }

                                fun type(type: Type) = type(JsonField.of(type))

                                /**
                                 * Sets [Builder.type] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.type] with a well-typed [Type]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun type(type: JsonField<Type>) = apply { this.type = type }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [CustomChartMetricCount].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): CustomChartMetricCount =
                                    CustomChartMetricCount(
                                        filter,
                                        type,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LangChainInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): CustomChartMetricCount = apply {
                                if (validated) {
                                    return@apply
                                }

                                filter()
                                type().ifPresent { it.validate() }
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                (if (filter.asKnown().isPresent) 1 else 0) +
                                    (type.asKnown().getOrNull()?.validity() ?: 0)

                            class Type
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val COUNT = of("count")

                                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                }

                                /** An enum containing [Type]'s known values. */
                                enum class Known {
                                    COUNT
                                }

                                /**
                                 * An enum containing [Type]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Type] can contain an unknown value in a couple of
                                 * cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    COUNT,
                                    /**
                                     * An enum member indicating that [Type] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        COUNT -> Value.COUNT
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        COUNT -> Known.COUNT
                                        else ->
                                            throw LangChainInvalidDataException(
                                                "Unknown Type: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LangChainInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Type = apply {
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Type && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CustomChartMetricCount &&
                                    filter == other.filter &&
                                    type == other.type &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(filter, type, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "CustomChartMetricCount{filter=$filter, type=$type, additionalProperties=$additionalProperties}"
                        }

                        class CustomChartFeedbackScoreMetricScalar
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val field: JsonValue,
                            private val params: JsonField<Params>,
                            private val type: JsonField<Type>,
                            private val filter: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("field")
                                @ExcludeMissing
                                field: JsonValue = JsonMissing.of(),
                                @JsonProperty("params")
                                @ExcludeMissing
                                params: JsonField<Params> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonField<Type> = JsonMissing.of(),
                                @JsonProperty("filter")
                                @ExcludeMissing
                                filter: JsonField<String> = JsonMissing.of(),
                            ) : this(field, params, type, filter, mutableMapOf())

                            /**
                             * Expected to always return the following:
                             * ```java
                             * JsonValue.from("feedback_score")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("field") @ExcludeMissing fun _field(): JsonValue = field

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun params(): Params = params.getRequired("params")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun type(): Type = type.getRequired("type")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun filter(): Optional<String> = filter.getOptional("filter")

                            /**
                             * Returns the raw JSON value of [params].
                             *
                             * Unlike [params], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("params")
                            @ExcludeMissing
                            fun _params(): JsonField<Params> = params

                            /**
                             * Returns the raw JSON value of [type].
                             *
                             * Unlike [type], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Type> = type

                            /**
                             * Returns the raw JSON value of [filter].
                             *
                             * Unlike [filter], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("filter")
                            @ExcludeMissing
                            fun _filter(): JsonField<String> = filter

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [CustomChartFeedbackScoreMetricScalar].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .params()
                                 * .type()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [CustomChartFeedbackScoreMetricScalar]. */
                            class Builder internal constructor() {

                                private var field: JsonValue = JsonValue.from("feedback_score")
                                private var params: JsonField<Params>? = null
                                private var type: JsonField<Type>? = null
                                private var filter: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(
                                    customChartFeedbackScoreMetricScalar:
                                        CustomChartFeedbackScoreMetricScalar
                                ) = apply {
                                    field = customChartFeedbackScoreMetricScalar.field
                                    params = customChartFeedbackScoreMetricScalar.params
                                    type = customChartFeedbackScoreMetricScalar.type
                                    filter = customChartFeedbackScoreMetricScalar.filter
                                    additionalProperties =
                                        customChartFeedbackScoreMetricScalar.additionalProperties
                                            .toMutableMap()
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```java
                                 * JsonValue.from("feedback_score")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun field(field: JsonValue) = apply { this.field = field }

                                fun params(params: Params) = params(JsonField.of(params))

                                /**
                                 * Sets [Builder.params] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.params] with a well-typed
                                 * [Params] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun params(params: JsonField<Params>) = apply {
                                    this.params = params
                                }

                                fun type(type: Type) = type(JsonField.of(type))

                                /**
                                 * Sets [Builder.type] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.type] with a well-typed [Type]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun type(type: JsonField<Type>) = apply { this.type = type }

                                fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                                /**
                                 * Alias for calling [Builder.filter] with `filter.orElse(null)`.
                                 */
                                fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                                /**
                                 * Sets [Builder.filter] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.filter] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun filter(filter: JsonField<String>) = apply {
                                    this.filter = filter
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of
                                 * [CustomChartFeedbackScoreMetricScalar].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .params()
                                 * .type()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): CustomChartFeedbackScoreMetricScalar =
                                    CustomChartFeedbackScoreMetricScalar(
                                        field,
                                        checkRequired("params", params),
                                        checkRequired("type", type),
                                        filter,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LangChainInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): CustomChartFeedbackScoreMetricScalar = apply {
                                if (validated) {
                                    return@apply
                                }

                                _field().let {
                                    if (it != JsonValue.from("feedback_score")) {
                                        throw LangChainInvalidDataException(
                                            "'field' is invalid, received $it"
                                        )
                                    }
                                }
                                params().validate()
                                type().validate()
                                filter()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                field.let { if (it == JsonValue.from("feedback_score")) 1 else 0 } +
                                    (params.asKnown().getOrNull()?.validity() ?: 0) +
                                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                                    (if (filter.asKnown().isPresent) 1 else 0)

                            class Params
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val feedbackKey: JsonField<String>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("feedback_key")
                                    @ExcludeMissing
                                    feedbackKey: JsonField<String> = JsonMissing.of()
                                ) : this(feedbackKey, mutableMapOf())

                                /**
                                 * @throws LangChainInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

                                /**
                                 * Returns the raw JSON value of [feedbackKey].
                                 *
                                 * Unlike [feedbackKey], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("feedback_key")
                                @ExcludeMissing
                                fun _feedbackKey(): JsonField<String> = feedbackKey

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
                                     * Returns a mutable builder for constructing an instance of
                                     * [Params].
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .feedbackKey()
                                     * ```
                                     */
                                    @JvmStatic fun builder() = Builder()
                                }

                                /** A builder for [Params]. */
                                class Builder internal constructor() {

                                    private var feedbackKey: JsonField<String>? = null
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    @JvmSynthetic
                                    internal fun from(params: Params) = apply {
                                        feedbackKey = params.feedbackKey
                                        additionalProperties =
                                            params.additionalProperties.toMutableMap()
                                    }

                                    fun feedbackKey(feedbackKey: String) =
                                        feedbackKey(JsonField.of(feedbackKey))

                                    /**
                                     * Sets [Builder.feedbackKey] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.feedbackKey] with a
                                     * well-typed [String] value instead. This method is primarily
                                     * for setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun feedbackKey(feedbackKey: JsonField<String>) = apply {
                                        this.feedbackKey = feedbackKey
                                    }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [Params].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .feedbackKey()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): Params =
                                        Params(
                                            checkRequired("feedbackKey", feedbackKey),
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Params = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    feedbackKey()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    (if (feedbackKey.asKnown().isPresent) 1 else 0)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Params &&
                                        feedbackKey == other.feedbackKey &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(feedbackKey, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "Params{feedbackKey=$feedbackKey, additionalProperties=$additionalProperties}"
                            }

                            class Type
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val SUM = of("sum")

                                    @JvmField val MAX = of("max")

                                    @JvmField val MIN = of("min")

                                    @JvmField val AVG = of("avg")

                                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                }

                                /** An enum containing [Type]'s known values. */
                                enum class Known {
                                    SUM,
                                    MAX,
                                    MIN,
                                    AVG,
                                }

                                /**
                                 * An enum containing [Type]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Type] can contain an unknown value in a couple of
                                 * cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    SUM,
                                    MAX,
                                    MIN,
                                    AVG,
                                    /**
                                     * An enum member indicating that [Type] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        SUM -> Value.SUM
                                        MAX -> Value.MAX
                                        MIN -> Value.MIN
                                        AVG -> Value.AVG
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        SUM -> Known.SUM
                                        MAX -> Known.MAX
                                        MIN -> Known.MIN
                                        AVG -> Known.AVG
                                        else ->
                                            throw LangChainInvalidDataException(
                                                "Unknown Type: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LangChainInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Type = apply {
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Type && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CustomChartFeedbackScoreMetricScalar &&
                                    field == other.field &&
                                    params == other.params &&
                                    type == other.type &&
                                    filter == other.filter &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(field, params, type, filter, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "CustomChartFeedbackScoreMetricScalar{field=$field, params=$params, type=$type, filter=$filter, additionalProperties=$additionalProperties}"
                        }

                        class CustomChartMetricScalar
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val field: JsonField<Field>,
                            private val type: JsonField<Type>,
                            private val filter: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("field")
                                @ExcludeMissing
                                field: JsonField<Field> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonField<Type> = JsonMissing.of(),
                                @JsonProperty("filter")
                                @ExcludeMissing
                                filter: JsonField<String> = JsonMissing.of(),
                            ) : this(field, type, filter, mutableMapOf())

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun field(): Field = field.getRequired("field")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun type(): Type = type.getRequired("type")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun filter(): Optional<String> = filter.getOptional("filter")

                            /**
                             * Returns the raw JSON value of [field].
                             *
                             * Unlike [field], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("field")
                            @ExcludeMissing
                            fun _field(): JsonField<Field> = field

                            /**
                             * Returns the raw JSON value of [type].
                             *
                             * Unlike [type], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun _type(): JsonField<Type> = type

                            /**
                             * Returns the raw JSON value of [filter].
                             *
                             * Unlike [filter], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("filter")
                            @ExcludeMissing
                            fun _filter(): JsonField<String> = filter

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [CustomChartMetricScalar].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .field()
                                 * .type()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [CustomChartMetricScalar]. */
                            class Builder internal constructor() {

                                private var field: JsonField<Field>? = null
                                private var type: JsonField<Type>? = null
                                private var filter: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(
                                    customChartMetricScalar: CustomChartMetricScalar
                                ) = apply {
                                    field = customChartMetricScalar.field
                                    type = customChartMetricScalar.type
                                    filter = customChartMetricScalar.filter
                                    additionalProperties =
                                        customChartMetricScalar.additionalProperties.toMutableMap()
                                }

                                fun field(field: Field) = field(JsonField.of(field))

                                /**
                                 * Sets [Builder.field] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.field] with a well-typed [Field]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun field(field: JsonField<Field>) = apply { this.field = field }

                                fun type(type: Type) = type(JsonField.of(type))

                                /**
                                 * Sets [Builder.type] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.type] with a well-typed [Type]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun type(type: JsonField<Type>) = apply { this.type = type }

                                fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                                /**
                                 * Alias for calling [Builder.filter] with `filter.orElse(null)`.
                                 */
                                fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                                /**
                                 * Sets [Builder.filter] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.filter] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun filter(filter: JsonField<String>) = apply {
                                    this.filter = filter
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [CustomChartMetricScalar].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .field()
                                 * .type()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): CustomChartMetricScalar =
                                    CustomChartMetricScalar(
                                        checkRequired("field", field),
                                        checkRequired("type", type),
                                        filter,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LangChainInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): CustomChartMetricScalar = apply {
                                if (validated) {
                                    return@apply
                                }

                                field().validate()
                                type().validate()
                                filter()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                (field.asKnown().getOrNull()?.validity() ?: 0) +
                                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                                    (if (filter.asKnown().isPresent) 1 else 0)

                            class Field
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val LATENCY_SECONDS = of("latency_seconds")

                                    @JvmField val FIRST_TOKEN_SECONDS = of("first_token_seconds")

                                    @JvmField val TOTAL_TOKENS = of("total_tokens")

                                    @JvmField val PROMPT_TOKENS = of("prompt_tokens")

                                    @JvmField val COMPLETION_TOKENS = of("completion_tokens")

                                    @JvmField val TOTAL_COST = of("total_cost")

                                    @JvmField val PROMPT_COST = of("prompt_cost")

                                    @JvmField val COMPLETION_COST = of("completion_cost")

                                    @JvmField val FEEDBACK_SCORE = of("feedback_score")

                                    @JvmStatic fun of(value: String) = Field(JsonField.of(value))
                                }

                                /** An enum containing [Field]'s known values. */
                                enum class Known {
                                    LATENCY_SECONDS,
                                    FIRST_TOKEN_SECONDS,
                                    TOTAL_TOKENS,
                                    PROMPT_TOKENS,
                                    COMPLETION_TOKENS,
                                    TOTAL_COST,
                                    PROMPT_COST,
                                    COMPLETION_COST,
                                    FEEDBACK_SCORE,
                                }

                                /**
                                 * An enum containing [Field]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Field] can contain an unknown value in a couple
                                 * of cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    LATENCY_SECONDS,
                                    FIRST_TOKEN_SECONDS,
                                    TOTAL_TOKENS,
                                    PROMPT_TOKENS,
                                    COMPLETION_TOKENS,
                                    TOTAL_COST,
                                    PROMPT_COST,
                                    COMPLETION_COST,
                                    FEEDBACK_SCORE,
                                    /**
                                     * An enum member indicating that [Field] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        LATENCY_SECONDS -> Value.LATENCY_SECONDS
                                        FIRST_TOKEN_SECONDS -> Value.FIRST_TOKEN_SECONDS
                                        TOTAL_TOKENS -> Value.TOTAL_TOKENS
                                        PROMPT_TOKENS -> Value.PROMPT_TOKENS
                                        COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                                        TOTAL_COST -> Value.TOTAL_COST
                                        PROMPT_COST -> Value.PROMPT_COST
                                        COMPLETION_COST -> Value.COMPLETION_COST
                                        FEEDBACK_SCORE -> Value.FEEDBACK_SCORE
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        LATENCY_SECONDS -> Known.LATENCY_SECONDS
                                        FIRST_TOKEN_SECONDS -> Known.FIRST_TOKEN_SECONDS
                                        TOTAL_TOKENS -> Known.TOTAL_TOKENS
                                        PROMPT_TOKENS -> Known.PROMPT_TOKENS
                                        COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                                        TOTAL_COST -> Known.TOTAL_COST
                                        PROMPT_COST -> Known.PROMPT_COST
                                        COMPLETION_COST -> Known.COMPLETION_COST
                                        FEEDBACK_SCORE -> Known.FEEDBACK_SCORE
                                        else ->
                                            throw LangChainInvalidDataException(
                                                "Unknown Field: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LangChainInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Field = apply {
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Field && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            class Type
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val SUM = of("sum")

                                    @JvmField val MAX = of("max")

                                    @JvmField val MIN = of("min")

                                    @JvmField val AVG = of("avg")

                                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                                }

                                /** An enum containing [Type]'s known values. */
                                enum class Known {
                                    SUM,
                                    MAX,
                                    MIN,
                                    AVG,
                                }

                                /**
                                 * An enum containing [Type]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Type] can contain an unknown value in a couple of
                                 * cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    SUM,
                                    MAX,
                                    MIN,
                                    AVG,
                                    /**
                                     * An enum member indicating that [Type] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        SUM -> Value.SUM
                                        MAX -> Value.MAX
                                        MIN -> Value.MIN
                                        AVG -> Value.AVG
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        SUM -> Known.SUM
                                        MAX -> Known.MAX
                                        MIN -> Known.MIN
                                        AVG -> Known.AVG
                                        else ->
                                            throw LangChainInvalidDataException(
                                                "Unknown Type: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LangChainInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Type = apply {
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Type && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CustomChartMetricScalar &&
                                    field == other.field &&
                                    type == other.type &&
                                    filter == other.filter &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(field, type, filter, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "CustomChartMetricScalar{field=$field, type=$type, filter=$filter, additionalProperties=$additionalProperties}"
                        }

                        class CustomChartFeedbackScoreMetricPercentile
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val field: JsonValue,
                            private val params: JsonField<Params>,
                            private val type: JsonValue,
                            private val filter: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("field")
                                @ExcludeMissing
                                field: JsonValue = JsonMissing.of(),
                                @JsonProperty("params")
                                @ExcludeMissing
                                params: JsonField<Params> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                                @JsonProperty("filter")
                                @ExcludeMissing
                                filter: JsonField<String> = JsonMissing.of(),
                            ) : this(field, params, type, filter, mutableMapOf())

                            /**
                             * Expected to always return the following:
                             * ```java
                             * JsonValue.from("feedback_score")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("field") @ExcludeMissing fun _field(): JsonValue = field

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun params(): Params = params.getRequired("params")

                            /**
                             * Expected to always return the following:
                             * ```java
                             * JsonValue.from("percentile")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun filter(): Optional<String> = filter.getOptional("filter")

                            /**
                             * Returns the raw JSON value of [params].
                             *
                             * Unlike [params], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("params")
                            @ExcludeMissing
                            fun _params(): JsonField<Params> = params

                            /**
                             * Returns the raw JSON value of [filter].
                             *
                             * Unlike [filter], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("filter")
                            @ExcludeMissing
                            fun _filter(): JsonField<String> = filter

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [CustomChartFeedbackScoreMetricPercentile].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .params()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [CustomChartFeedbackScoreMetricPercentile]. */
                            class Builder internal constructor() {

                                private var field: JsonValue = JsonValue.from("feedback_score")
                                private var params: JsonField<Params>? = null
                                private var type: JsonValue = JsonValue.from("percentile")
                                private var filter: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(
                                    customChartFeedbackScoreMetricPercentile:
                                        CustomChartFeedbackScoreMetricPercentile
                                ) = apply {
                                    field = customChartFeedbackScoreMetricPercentile.field
                                    params = customChartFeedbackScoreMetricPercentile.params
                                    type = customChartFeedbackScoreMetricPercentile.type
                                    filter = customChartFeedbackScoreMetricPercentile.filter
                                    additionalProperties =
                                        customChartFeedbackScoreMetricPercentile
                                            .additionalProperties
                                            .toMutableMap()
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```java
                                 * JsonValue.from("feedback_score")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun field(field: JsonValue) = apply { this.field = field }

                                fun params(params: Params) = params(JsonField.of(params))

                                /**
                                 * Sets [Builder.params] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.params] with a well-typed
                                 * [Params] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun params(params: JsonField<Params>) = apply {
                                    this.params = params
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```java
                                 * JsonValue.from("percentile")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                                /**
                                 * Alias for calling [Builder.filter] with `filter.orElse(null)`.
                                 */
                                fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                                /**
                                 * Sets [Builder.filter] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.filter] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun filter(filter: JsonField<String>) = apply {
                                    this.filter = filter
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of
                                 * [CustomChartFeedbackScoreMetricPercentile].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .params()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): CustomChartFeedbackScoreMetricPercentile =
                                    CustomChartFeedbackScoreMetricPercentile(
                                        field,
                                        checkRequired("params", params),
                                        type,
                                        filter,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LangChainInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): CustomChartFeedbackScoreMetricPercentile = apply {
                                if (validated) {
                                    return@apply
                                }

                                _field().let {
                                    if (it != JsonValue.from("feedback_score")) {
                                        throw LangChainInvalidDataException(
                                            "'field' is invalid, received $it"
                                        )
                                    }
                                }
                                params().validate()
                                _type().let {
                                    if (it != JsonValue.from("percentile")) {
                                        throw LangChainInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
                                }
                                filter()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                field.let { if (it == JsonValue.from("feedback_score")) 1 else 0 } +
                                    (params.asKnown().getOrNull()?.validity() ?: 0) +
                                    type.let { if (it == JsonValue.from("percentile")) 1 else 0 } +
                                    (if (filter.asKnown().isPresent) 1 else 0)

                            class Params
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val feedbackKey: JsonField<String>,
                                private val p: JsonField<Double>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("feedback_key")
                                    @ExcludeMissing
                                    feedbackKey: JsonField<String> = JsonMissing.of(),
                                    @JsonProperty("p")
                                    @ExcludeMissing
                                    p: JsonField<Double> = JsonMissing.of(),
                                ) : this(feedbackKey, p, mutableMapOf())

                                /**
                                 * @throws LangChainInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

                                /**
                                 * @throws LangChainInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun p(): Double = p.getRequired("p")

                                /**
                                 * Returns the raw JSON value of [feedbackKey].
                                 *
                                 * Unlike [feedbackKey], this method doesn't throw if the JSON field
                                 * has an unexpected type.
                                 */
                                @JsonProperty("feedback_key")
                                @ExcludeMissing
                                fun _feedbackKey(): JsonField<String> = feedbackKey

                                /**
                                 * Returns the raw JSON value of [p].
                                 *
                                 * Unlike [p], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("p") @ExcludeMissing fun _p(): JsonField<Double> = p

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
                                     * Returns a mutable builder for constructing an instance of
                                     * [Params].
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .feedbackKey()
                                     * .p()
                                     * ```
                                     */
                                    @JvmStatic fun builder() = Builder()
                                }

                                /** A builder for [Params]. */
                                class Builder internal constructor() {

                                    private var feedbackKey: JsonField<String>? = null
                                    private var p: JsonField<Double>? = null
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    @JvmSynthetic
                                    internal fun from(params: Params) = apply {
                                        feedbackKey = params.feedbackKey
                                        p = params.p
                                        additionalProperties =
                                            params.additionalProperties.toMutableMap()
                                    }

                                    fun feedbackKey(feedbackKey: String) =
                                        feedbackKey(JsonField.of(feedbackKey))

                                    /**
                                     * Sets [Builder.feedbackKey] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.feedbackKey] with a
                                     * well-typed [String] value instead. This method is primarily
                                     * for setting the field to an undocumented or not yet supported
                                     * value.
                                     */
                                    fun feedbackKey(feedbackKey: JsonField<String>) = apply {
                                        this.feedbackKey = feedbackKey
                                    }

                                    fun p(p: Double) = p(JsonField.of(p))

                                    /**
                                     * Sets [Builder.p] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.p] with a well-typed
                                     * [Double] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun p(p: JsonField<Double>) = apply { this.p = p }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [Params].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .feedbackKey()
                                     * .p()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): Params =
                                        Params(
                                            checkRequired("feedbackKey", feedbackKey),
                                            checkRequired("p", p),
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Params = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    feedbackKey()
                                    p()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    (if (feedbackKey.asKnown().isPresent) 1 else 0) +
                                        (if (p.asKnown().isPresent) 1 else 0)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Params &&
                                        feedbackKey == other.feedbackKey &&
                                        p == other.p &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(feedbackKey, p, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "Params{feedbackKey=$feedbackKey, p=$p, additionalProperties=$additionalProperties}"
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CustomChartFeedbackScoreMetricPercentile &&
                                    field == other.field &&
                                    params == other.params &&
                                    type == other.type &&
                                    filter == other.filter &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(field, params, type, filter, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "CustomChartFeedbackScoreMetricPercentile{field=$field, params=$params, type=$type, filter=$filter, additionalProperties=$additionalProperties}"
                        }

                        class CustomChartMetricPercentile
                        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                        private constructor(
                            private val field: JsonField<Field>,
                            private val params: JsonField<Params>,
                            private val type: JsonValue,
                            private val filter: JsonField<String>,
                            private val additionalProperties: MutableMap<String, JsonValue>,
                        ) {

                            @JsonCreator
                            private constructor(
                                @JsonProperty("field")
                                @ExcludeMissing
                                field: JsonField<Field> = JsonMissing.of(),
                                @JsonProperty("params")
                                @ExcludeMissing
                                params: JsonField<Params> = JsonMissing.of(),
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                                @JsonProperty("filter")
                                @ExcludeMissing
                                filter: JsonField<String> = JsonMissing.of(),
                            ) : this(field, params, type, filter, mutableMapOf())

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun field(): Field = field.getRequired("field")

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun params(): Params = params.getRequired("params")

                            /**
                             * Expected to always return the following:
                             * ```java
                             * JsonValue.from("percentile")
                             * ```
                             *
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * @throws LangChainInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun filter(): Optional<String> = filter.getOptional("filter")

                            /**
                             * Returns the raw JSON value of [field].
                             *
                             * Unlike [field], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("field")
                            @ExcludeMissing
                            fun _field(): JsonField<Field> = field

                            /**
                             * Returns the raw JSON value of [params].
                             *
                             * Unlike [params], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("params")
                            @ExcludeMissing
                            fun _params(): JsonField<Params> = params

                            /**
                             * Returns the raw JSON value of [filter].
                             *
                             * Unlike [filter], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("filter")
                            @ExcludeMissing
                            fun _filter(): JsonField<String> = filter

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
                                 * Returns a mutable builder for constructing an instance of
                                 * [CustomChartMetricPercentile].
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .field()
                                 * .params()
                                 * ```
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [CustomChartMetricPercentile]. */
                            class Builder internal constructor() {

                                private var field: JsonField<Field>? = null
                                private var params: JsonField<Params>? = null
                                private var type: JsonValue = JsonValue.from("percentile")
                                private var filter: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(
                                    customChartMetricPercentile: CustomChartMetricPercentile
                                ) = apply {
                                    field = customChartMetricPercentile.field
                                    params = customChartMetricPercentile.params
                                    type = customChartMetricPercentile.type
                                    filter = customChartMetricPercentile.filter
                                    additionalProperties =
                                        customChartMetricPercentile.additionalProperties
                                            .toMutableMap()
                                }

                                fun field(field: Field) = field(JsonField.of(field))

                                /**
                                 * Sets [Builder.field] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.field] with a well-typed [Field]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun field(field: JsonField<Field>) = apply { this.field = field }

                                fun params(params: Params) = params(JsonField.of(params))

                                /**
                                 * Sets [Builder.params] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.params] with a well-typed
                                 * [Params] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun params(params: JsonField<Params>) = apply {
                                    this.params = params
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```java
                                 * JsonValue.from("percentile")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                                /**
                                 * Alias for calling [Builder.filter] with `filter.orElse(null)`.
                                 */
                                fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                                /**
                                 * Sets [Builder.filter] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.filter] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun filter(filter: JsonField<String>) = apply {
                                    this.filter = filter
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [CustomChartMetricPercentile].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 *
                                 * The following fields are required:
                                 * ```java
                                 * .field()
                                 * .params()
                                 * ```
                                 *
                                 * @throws IllegalStateException if any required field is unset.
                                 */
                                fun build(): CustomChartMetricPercentile =
                                    CustomChartMetricPercentile(
                                        checkRequired("field", field),
                                        checkRequired("params", params),
                                        type,
                                        filter,
                                        additionalProperties.toMutableMap(),
                                    )
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws LangChainInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): CustomChartMetricPercentile = apply {
                                if (validated) {
                                    return@apply
                                }

                                field().validate()
                                params().validate()
                                _type().let {
                                    if (it != JsonValue.from("percentile")) {
                                        throw LangChainInvalidDataException(
                                            "'type' is invalid, received $it"
                                        )
                                    }
                                }
                                filter()
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
                             *
                             * Used for best match union deserialization.
                             */
                            @JvmSynthetic
                            internal fun validity(): Int =
                                (field.asKnown().getOrNull()?.validity() ?: 0) +
                                    (params.asKnown().getOrNull()?.validity() ?: 0) +
                                    type.let { if (it == JsonValue.from("percentile")) 1 else 0 } +
                                    (if (filter.asKnown().isPresent) 1 else 0)

                            class Field
                            @JsonCreator
                            private constructor(private val value: JsonField<String>) : Enum {

                                /**
                                 * Returns this class instance's raw value.
                                 *
                                 * This is usually only useful if this instance was deserialized
                                 * from data that doesn't match any known member, and you want to
                                 * know that value. For example, if the SDK is on an older version
                                 * than the API, then the API may respond with new members that the
                                 * SDK is unaware of.
                                 */
                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                companion object {

                                    @JvmField val LATENCY_SECONDS = of("latency_seconds")

                                    @JvmField val FIRST_TOKEN_SECONDS = of("first_token_seconds")

                                    @JvmField val TOTAL_TOKENS = of("total_tokens")

                                    @JvmField val PROMPT_TOKENS = of("prompt_tokens")

                                    @JvmField val COMPLETION_TOKENS = of("completion_tokens")

                                    @JvmField val TOTAL_COST = of("total_cost")

                                    @JvmField val PROMPT_COST = of("prompt_cost")

                                    @JvmField val COMPLETION_COST = of("completion_cost")

                                    @JvmField val FEEDBACK_SCORE = of("feedback_score")

                                    @JvmStatic fun of(value: String) = Field(JsonField.of(value))
                                }

                                /** An enum containing [Field]'s known values. */
                                enum class Known {
                                    LATENCY_SECONDS,
                                    FIRST_TOKEN_SECONDS,
                                    TOTAL_TOKENS,
                                    PROMPT_TOKENS,
                                    COMPLETION_TOKENS,
                                    TOTAL_COST,
                                    PROMPT_COST,
                                    COMPLETION_COST,
                                    FEEDBACK_SCORE,
                                }

                                /**
                                 * An enum containing [Field]'s known values, as well as an
                                 * [_UNKNOWN] member.
                                 *
                                 * An instance of [Field] can contain an unknown value in a couple
                                 * of cases:
                                 * - It was deserialized from data that doesn't match any known
                                 *   member. For example, if the SDK is on an older version than the
                                 *   API, then the API may respond with new members that the SDK is
                                 *   unaware of.
                                 * - It was constructed with an arbitrary value using the [of]
                                 *   method.
                                 */
                                enum class Value {
                                    LATENCY_SECONDS,
                                    FIRST_TOKEN_SECONDS,
                                    TOTAL_TOKENS,
                                    PROMPT_TOKENS,
                                    COMPLETION_TOKENS,
                                    TOTAL_COST,
                                    PROMPT_COST,
                                    COMPLETION_COST,
                                    FEEDBACK_SCORE,
                                    /**
                                     * An enum member indicating that [Field] was instantiated with
                                     * an unknown value.
                                     */
                                    _UNKNOWN,
                                }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value, or [Value._UNKNOWN] if the class was instantiated with an
                                 * unknown value.
                                 *
                                 * Use the [known] method instead if you're certain the value is
                                 * always known or if you want to throw for the unknown case.
                                 */
                                fun value(): Value =
                                    when (this) {
                                        LATENCY_SECONDS -> Value.LATENCY_SECONDS
                                        FIRST_TOKEN_SECONDS -> Value.FIRST_TOKEN_SECONDS
                                        TOTAL_TOKENS -> Value.TOTAL_TOKENS
                                        PROMPT_TOKENS -> Value.PROMPT_TOKENS
                                        COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                                        TOTAL_COST -> Value.TOTAL_COST
                                        PROMPT_COST -> Value.PROMPT_COST
                                        COMPLETION_COST -> Value.COMPLETION_COST
                                        FEEDBACK_SCORE -> Value.FEEDBACK_SCORE
                                        else -> Value._UNKNOWN
                                    }

                                /**
                                 * Returns an enum member corresponding to this class instance's
                                 * value.
                                 *
                                 * Use the [value] method instead if you're uncertain the value is
                                 * always known and don't want to throw for the unknown case.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value is a not a known member.
                                 */
                                fun known(): Known =
                                    when (this) {
                                        LATENCY_SECONDS -> Known.LATENCY_SECONDS
                                        FIRST_TOKEN_SECONDS -> Known.FIRST_TOKEN_SECONDS
                                        TOTAL_TOKENS -> Known.TOTAL_TOKENS
                                        PROMPT_TOKENS -> Known.PROMPT_TOKENS
                                        COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                                        TOTAL_COST -> Known.TOTAL_COST
                                        PROMPT_COST -> Known.PROMPT_COST
                                        COMPLETION_COST -> Known.COMPLETION_COST
                                        FEEDBACK_SCORE -> Known.FEEDBACK_SCORE
                                        else ->
                                            throw LangChainInvalidDataException(
                                                "Unknown Field: $value"
                                            )
                                    }

                                /**
                                 * Returns this class instance's primitive wire representation.
                                 *
                                 * This differs from the [toString] method because that method is
                                 * primarily for debugging and generally doesn't throw.
                                 *
                                 * @throws LangChainInvalidDataException if this class instance's
                                 *   value does not have the expected primitive type.
                                 */
                                fun asString(): String =
                                    _value().asString().orElseThrow {
                                        LangChainInvalidDataException("Value is not a String")
                                    }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Field = apply {
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int =
                                    if (value() == Value._UNKNOWN) 0 else 1

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Field && value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()
                            }

                            class Params
                            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                            private constructor(
                                private val p: JsonField<Double>,
                                private val additionalProperties: MutableMap<String, JsonValue>,
                            ) {

                                @JsonCreator
                                private constructor(
                                    @JsonProperty("p")
                                    @ExcludeMissing
                                    p: JsonField<Double> = JsonMissing.of()
                                ) : this(p, mutableMapOf())

                                /**
                                 * @throws LangChainInvalidDataException if the JSON field has an
                                 *   unexpected type or is unexpectedly missing or null (e.g. if the
                                 *   server responded with an unexpected value).
                                 */
                                fun p(): Double = p.getRequired("p")

                                /**
                                 * Returns the raw JSON value of [p].
                                 *
                                 * Unlike [p], this method doesn't throw if the JSON field has an
                                 * unexpected type.
                                 */
                                @JsonProperty("p") @ExcludeMissing fun _p(): JsonField<Double> = p

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
                                     * Returns a mutable builder for constructing an instance of
                                     * [Params].
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .p()
                                     * ```
                                     */
                                    @JvmStatic fun builder() = Builder()
                                }

                                /** A builder for [Params]. */
                                class Builder internal constructor() {

                                    private var p: JsonField<Double>? = null
                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
                                        mutableMapOf()

                                    @JvmSynthetic
                                    internal fun from(params: Params) = apply {
                                        p = params.p
                                        additionalProperties =
                                            params.additionalProperties.toMutableMap()
                                    }

                                    fun p(p: Double) = p(JsonField.of(p))

                                    /**
                                     * Sets [Builder.p] to an arbitrary JSON value.
                                     *
                                     * You should usually call [Builder.p] with a well-typed
                                     * [Double] value instead. This method is primarily for setting
                                     * the field to an undocumented or not yet supported value.
                                     */
                                    fun p(p: JsonField<Double>) = apply { this.p = p }

                                    fun additionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.clear()
                                        putAllAdditionalProperties(additionalProperties)
                                    }

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [Params].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     *
                                     * The following fields are required:
                                     * ```java
                                     * .p()
                                     * ```
                                     *
                                     * @throws IllegalStateException if any required field is unset.
                                     */
                                    fun build(): Params =
                                        Params(
                                            checkRequired("p", p),
                                            additionalProperties.toMutableMap(),
                                        )
                                }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
                                 *
                                 * @throws LangChainInvalidDataException if any value type in this
                                 *   object doesn't match its expected type.
                                 */
                                fun validate(): Params = apply {
                                    if (validated) {
                                        return@apply
                                    }

                                    p()
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
                                 * Returns a score indicating how many valid values are contained in
                                 * this object recursively.
                                 *
                                 * Used for best match union deserialization.
                                 */
                                @JvmSynthetic
                                internal fun validity(): Int = (if (p.asKnown().isPresent) 1 else 0)

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Params &&
                                        p == other.p &&
                                        additionalProperties == other.additionalProperties
                                }

                                private val hashCode: Int by lazy {
                                    Objects.hash(p, additionalProperties)
                                }

                                override fun hashCode(): Int = hashCode

                                override fun toString() =
                                    "Params{p=$p, additionalProperties=$additionalProperties}"
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CustomChartMetricPercentile &&
                                    field == other.field &&
                                    params == other.params &&
                                    type == other.type &&
                                    filter == other.filter &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy {
                                Objects.hash(field, params, type, filter, additionalProperties)
                            }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "CustomChartMetricPercentile{field=$field, params=$params, type=$type, filter=$filter, additionalProperties=$additionalProperties}"
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CustomChartMetricRatioInput &&
                            denominator == other.denominator &&
                            numerator == other.numerator &&
                            type == other.type &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(denominator, numerator, type, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CustomChartMetricRatioInput{denominator=$denominator, numerator=$numerator, type=$type, additionalProperties=$additionalProperties}"
                }
            }

            /** LGP Metrics you can chart. */
            class ProjectMetric
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val MEMORY_USAGE = of("memory_usage")

                    @JvmField val CPU_USAGE = of("cpu_usage")

                    @JvmField val DISK_USAGE = of("disk_usage")

                    @JvmField val RESTART_COUNT = of("restart_count")

                    @JvmField val REPLICA_COUNT = of("replica_count")

                    @JvmField val WORKER_COUNT = of("worker_count")

                    @JvmField val LG_RUN_COUNT = of("lg_run_count")

                    @JvmField val RESPONSES_PER_SECOND = of("responses_per_second")

                    @JvmField val ERROR_RESPONSES_PER_SECOND = of("error_responses_per_second")

                    @JvmField val P95_LATENCY = of("p95_latency")

                    @JvmField val RUN_QUEUE_WAIT_TIME = of("run_queue_wait_time")

                    @JvmStatic fun of(value: String) = ProjectMetric(JsonField.of(value))
                }

                /** An enum containing [ProjectMetric]'s known values. */
                enum class Known {
                    MEMORY_USAGE,
                    CPU_USAGE,
                    DISK_USAGE,
                    RESTART_COUNT,
                    REPLICA_COUNT,
                    WORKER_COUNT,
                    LG_RUN_COUNT,
                    RESPONSES_PER_SECOND,
                    ERROR_RESPONSES_PER_SECOND,
                    P95_LATENCY,
                    RUN_QUEUE_WAIT_TIME,
                }

                /**
                 * An enum containing [ProjectMetric]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ProjectMetric] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MEMORY_USAGE,
                    CPU_USAGE,
                    DISK_USAGE,
                    RESTART_COUNT,
                    REPLICA_COUNT,
                    WORKER_COUNT,
                    LG_RUN_COUNT,
                    RESPONSES_PER_SECOND,
                    ERROR_RESPONSES_PER_SECOND,
                    P95_LATENCY,
                    RUN_QUEUE_WAIT_TIME,
                    /**
                     * An enum member indicating that [ProjectMetric] was instantiated with an
                     * unknown value.
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
                        MEMORY_USAGE -> Value.MEMORY_USAGE
                        CPU_USAGE -> Value.CPU_USAGE
                        DISK_USAGE -> Value.DISK_USAGE
                        RESTART_COUNT -> Value.RESTART_COUNT
                        REPLICA_COUNT -> Value.REPLICA_COUNT
                        WORKER_COUNT -> Value.WORKER_COUNT
                        LG_RUN_COUNT -> Value.LG_RUN_COUNT
                        RESPONSES_PER_SECOND -> Value.RESPONSES_PER_SECOND
                        ERROR_RESPONSES_PER_SECOND -> Value.ERROR_RESPONSES_PER_SECOND
                        P95_LATENCY -> Value.P95_LATENCY
                        RUN_QUEUE_WAIT_TIME -> Value.RUN_QUEUE_WAIT_TIME
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
                        MEMORY_USAGE -> Known.MEMORY_USAGE
                        CPU_USAGE -> Known.CPU_USAGE
                        DISK_USAGE -> Known.DISK_USAGE
                        RESTART_COUNT -> Known.RESTART_COUNT
                        REPLICA_COUNT -> Known.REPLICA_COUNT
                        WORKER_COUNT -> Known.WORKER_COUNT
                        LG_RUN_COUNT -> Known.LG_RUN_COUNT
                        RESPONSES_PER_SECOND -> Known.RESPONSES_PER_SECOND
                        ERROR_RESPONSES_PER_SECOND -> Known.ERROR_RESPONSES_PER_SECOND
                        P95_LATENCY -> Known.P95_LATENCY
                        RUN_QUEUE_WAIT_TIME -> Known.RUN_QUEUE_WAIT_TIME
                        else -> throw LangChainInvalidDataException("Unknown ProjectMetric: $value")
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
                fun validate(): ProjectMetric = apply {
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

                    return other is ProjectMetric && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Series &&
                    id == other.id &&
                    name == other.name &&
                    feedbackKey == other.feedbackKey &&
                    filterDefinition == other.filterDefinition &&
                    filters == other.filters &&
                    groupBy == other.groupBy &&
                    groupByDefinitions == other.groupByDefinitions &&
                    metadata == other.metadata &&
                    metric == other.metric &&
                    metricDefinition == other.metricDefinition &&
                    projectMetric == other.projectMetric &&
                    workspaceId == other.workspaceId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    name,
                    feedbackKey,
                    filterDefinition,
                    filters,
                    groupBy,
                    groupByDefinitions,
                    metadata,
                    metric,
                    metricDefinition,
                    projectMetric,
                    workspaceId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Series{id=$id, name=$name, feedbackKey=$feedbackKey, filterDefinition=$filterDefinition, filters=$filters, groupBy=$groupBy, groupByDefinitions=$groupByDefinitions, metadata=$metadata, metric=$metric, metricDefinition=$metricDefinition, projectMetric=$projectMetric, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
        }

        class CommonFilters
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val filter: JsonField<String>,
            private val session: JsonField<List<String>>,
            private val traceFilter: JsonField<String>,
            private val treeFilter: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("filter")
                @ExcludeMissing
                filter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("session")
                @ExcludeMissing
                session: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("trace_filter")
                @ExcludeMissing
                traceFilter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tree_filter")
                @ExcludeMissing
                treeFilter: JsonField<String> = JsonMissing.of(),
            ) : this(filter, session, traceFilter, treeFilter, mutableMapOf())

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun filter(): Optional<String> = filter.getOptional("filter")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun session(): Optional<List<String>> = session.getOptional("session")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

            /**
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
             * Returns the raw JSON value of [session].
             *
             * Unlike [session], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("session")
            @ExcludeMissing
            fun _session(): JsonField<List<String>> = session

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

                /** Returns a mutable builder for constructing an instance of [CommonFilters]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CommonFilters]. */
            class Builder internal constructor() {

                private var filter: JsonField<String> = JsonMissing.of()
                private var session: JsonField<MutableList<String>>? = null
                private var traceFilter: JsonField<String> = JsonMissing.of()
                private var treeFilter: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(commonFilters: CommonFilters) = apply {
                    filter = commonFilters.filter
                    session = commonFilters.session.map { it.toMutableList() }
                    traceFilter = commonFilters.traceFilter
                    treeFilter = commonFilters.treeFilter
                    additionalProperties = commonFilters.additionalProperties.toMutableMap()
                }

                fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

                /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
                fun filter(filter: Optional<String>) = filter(filter.getOrNull())

                /**
                 * Sets [Builder.filter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filter] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun filter(filter: JsonField<String>) = apply { this.filter = filter }

                fun session(session: List<String>?) = session(JsonField.ofNullable(session))

                /** Alias for calling [Builder.session] with `session.orElse(null)`. */
                fun session(session: Optional<List<String>>) = session(session.getOrNull())

                /**
                 * Sets [Builder.session] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.session] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun session(session: JsonField<List<String>>) = apply {
                    this.session = session.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.session].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSession(session: String) = apply {
                    this.session =
                        (this.session ?: JsonField.of(mutableListOf())).also {
                            checkKnown("session", it).add(session)
                        }
                }

                fun traceFilter(traceFilter: String?) =
                    traceFilter(JsonField.ofNullable(traceFilter))

                /** Alias for calling [Builder.traceFilter] with `traceFilter.orElse(null)`. */
                fun traceFilter(traceFilter: Optional<String>) =
                    traceFilter(traceFilter.getOrNull())

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

                fun treeFilter(treeFilter: String?) = treeFilter(JsonField.ofNullable(treeFilter))

                /** Alias for calling [Builder.treeFilter] with `treeFilter.orElse(null)`. */
                fun treeFilter(treeFilter: Optional<String>) = treeFilter(treeFilter.getOrNull())

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
                 * Returns an immutable instance of [CommonFilters].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CommonFilters =
                    CommonFilters(
                        filter,
                        (session ?: JsonMissing.of()).map { it.toImmutable() },
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
            fun validate(): CommonFilters = apply {
                if (validated) {
                    return@apply
                }

                filter()
                session()
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
                    (session.asKnown().getOrNull()?.size ?: 0) +
                    (if (traceFilter.asKnown().isPresent) 1 else 0) +
                    (if (treeFilter.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CommonFilters &&
                    filter == other.filter &&
                    session == other.session &&
                    traceFilter == other.traceFilter &&
                    treeFilter == other.treeFilter &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(filter, session, traceFilter, treeFilter, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CommonFilters{filter=$filter, session=$session, traceFilter=$traceFilter, treeFilter=$treeFilter, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Chart &&
                series == other.series &&
                commonFilters == other.commonFilters &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(series, commonFilters, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Chart{series=$series, commonFilters=$commonFilters, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChartPreviewParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ChartPreviewParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
