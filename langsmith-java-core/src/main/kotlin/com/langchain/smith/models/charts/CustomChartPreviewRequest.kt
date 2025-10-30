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
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangsmithInvalidDataException
import com.langchain.smith.models.orgcharts.section.CustomChartsRequestBase
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class CustomChartPreviewRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bucketInfo: JsonField<CustomChartsRequestBase>,
    private val chart: JsonField<CustomChartCreatePreview>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bucket_info")
        @ExcludeMissing
        bucketInfo: JsonField<CustomChartsRequestBase> = JsonMissing.of(),
        @JsonProperty("chart")
        @ExcludeMissing
        chart: JsonField<CustomChartCreatePreview> = JsonMissing.of(),
    ) : this(bucketInfo, chart, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucketInfo(): CustomChartsRequestBase = bucketInfo.getRequired("bucket_info")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chart(): CustomChartCreatePreview = chart.getRequired("chart")

    /**
     * Returns the raw JSON value of [bucketInfo].
     *
     * Unlike [bucketInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bucket_info")
    @ExcludeMissing
    fun _bucketInfo(): JsonField<CustomChartsRequestBase> = bucketInfo

    /**
     * Returns the raw JSON value of [chart].
     *
     * Unlike [chart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chart") @ExcludeMissing fun _chart(): JsonField<CustomChartCreatePreview> = chart

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
         * Returns a mutable builder for constructing an instance of [CustomChartPreviewRequest].
         *
         * The following fields are required:
         * ```java
         * .bucketInfo()
         * .chart()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChartPreviewRequest]. */
    class Builder internal constructor() {

        private var bucketInfo: JsonField<CustomChartsRequestBase>? = null
        private var chart: JsonField<CustomChartCreatePreview>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customChartPreviewRequest: CustomChartPreviewRequest) = apply {
            bucketInfo = customChartPreviewRequest.bucketInfo
            chart = customChartPreviewRequest.chart
            additionalProperties = customChartPreviewRequest.additionalProperties.toMutableMap()
        }

        fun bucketInfo(bucketInfo: CustomChartsRequestBase) = bucketInfo(JsonField.of(bucketInfo))

        /**
         * Sets [Builder.bucketInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucketInfo] with a well-typed [CustomChartsRequestBase]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun bucketInfo(bucketInfo: JsonField<CustomChartsRequestBase>) = apply {
            this.bucketInfo = bucketInfo
        }

        fun chart(chart: CustomChartCreatePreview) = chart(JsonField.of(chart))

        /**
         * Sets [Builder.chart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chart] with a well-typed [CustomChartCreatePreview]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun chart(chart: JsonField<CustomChartCreatePreview>) = apply { this.chart = chart }

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
         * Returns an immutable instance of [CustomChartPreviewRequest].
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
        fun build(): CustomChartPreviewRequest =
            CustomChartPreviewRequest(
                checkRequired("bucketInfo", bucketInfo),
                checkRequired("chart", chart),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomChartPreviewRequest = apply {
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
        } catch (e: LangsmithInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
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

        return other is CustomChartPreviewRequest &&
            bucketInfo == other.bucketInfo &&
            chart == other.chart &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(bucketInfo, chart, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomChartPreviewRequest{bucketInfo=$bucketInfo, chart=$chart, additionalProperties=$additionalProperties}"
}
