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
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.datasets.Missing
import com.langchain.smith.models.sessions.RunStatsGroupBy
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomChartUpdate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chartType: JsonField<ChartType>,
    private val commonFilters: JsonField<CommonFilters>,
    private val description: JsonField<Description>,
    private val index: JsonField<Index>,
    private val metadata: JsonField<Metadata>,
    private val sectionId: JsonField<SectionId>,
    private val series: JsonField<Series>,
    private val title: JsonField<Title>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chart_type")
        @ExcludeMissing
        chartType: JsonField<ChartType> = JsonMissing.of(),
        @JsonProperty("common_filters")
        @ExcludeMissing
        commonFilters: JsonField<CommonFilters> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<Description> = JsonMissing.of(),
        @JsonProperty("index") @ExcludeMissing index: JsonField<Index> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("section_id")
        @ExcludeMissing
        sectionId: JsonField<SectionId> = JsonMissing.of(),
        @JsonProperty("series") @ExcludeMissing series: JsonField<Series> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<Title> = JsonMissing.of(),
    ) : this(
        chartType,
        commonFilters,
        description,
        index,
        metadata,
        sectionId,
        series,
        title,
        mutableMapOf(),
    )

    /**
     * Enum for custom chart types.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chartType(): Optional<ChartType> = chartType.getOptional("chart_type")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commonFilters(): Optional<CommonFilters> = commonFilters.getOptional("common_filters")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<Description> = description.getOptional("description")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun index(): Optional<Index> = index.getOptional("index")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sectionId(): Optional<SectionId> = sectionId.getOptional("section_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun series(): Optional<Series> = series.getOptional("series")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<Title> = title.getOptional("title")

    /**
     * Returns the raw JSON value of [chartType].
     *
     * Unlike [chartType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chart_type") @ExcludeMissing fun _chartType(): JsonField<ChartType> = chartType

    /**
     * Returns the raw JSON value of [commonFilters].
     *
     * Unlike [commonFilters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("common_filters")
    @ExcludeMissing
    fun _commonFilters(): JsonField<CommonFilters> = commonFilters

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description")
    @ExcludeMissing
    fun _description(): JsonField<Description> = description

    /**
     * Returns the raw JSON value of [index].
     *
     * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Index> = index

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [sectionId].
     *
     * Unlike [sectionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("section_id") @ExcludeMissing fun _sectionId(): JsonField<SectionId> = sectionId

    /**
     * Returns the raw JSON value of [series].
     *
     * Unlike [series], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("series") @ExcludeMissing fun _series(): JsonField<Series> = series

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<Title> = title

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

        /** Returns a mutable builder for constructing an instance of [CustomChartUpdate]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChartUpdate]. */
    class Builder internal constructor() {

        private var chartType: JsonField<ChartType> = JsonMissing.of()
        private var commonFilters: JsonField<CommonFilters> = JsonMissing.of()
        private var description: JsonField<Description> = JsonMissing.of()
        private var index: JsonField<Index> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var sectionId: JsonField<SectionId> = JsonMissing.of()
        private var series: JsonField<Series> = JsonMissing.of()
        private var title: JsonField<Title> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customChartUpdate: CustomChartUpdate) = apply {
            chartType = customChartUpdate.chartType
            commonFilters = customChartUpdate.commonFilters
            description = customChartUpdate.description
            index = customChartUpdate.index
            metadata = customChartUpdate.metadata
            sectionId = customChartUpdate.sectionId
            series = customChartUpdate.series
            title = customChartUpdate.title
            additionalProperties = customChartUpdate.additionalProperties.toMutableMap()
        }

        /** Enum for custom chart types. */
        fun chartType(chartType: ChartType) = chartType(JsonField.of(chartType))

        /**
         * Sets [Builder.chartType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chartType] with a well-typed [ChartType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun chartType(chartType: JsonField<ChartType>) = apply { this.chartType = chartType }

        /** Alias for calling [chartType] with `ChartType.ofCustom(custom)`. */
        fun chartType(custom: CustomChartType) = chartType(ChartType.ofCustom(custom))

        /** Alias for calling [chartType] with `ChartType.ofMissing(missing)`. */
        fun chartType(missing: Missing) = chartType(ChartType.ofMissing(missing))

        fun commonFilters(commonFilters: CommonFilters?) =
            commonFilters(JsonField.ofNullable(commonFilters))

        /** Alias for calling [Builder.commonFilters] with `commonFilters.orElse(null)`. */
        fun commonFilters(commonFilters: Optional<CommonFilters>) =
            commonFilters(commonFilters.getOrNull())

        /**
         * Sets [Builder.commonFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commonFilters] with a well-typed [CommonFilters] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commonFilters(commonFilters: JsonField<CommonFilters>) = apply {
            this.commonFilters = commonFilters
        }

        /**
         * Alias for calling [commonFilters] with
         * `CommonFilters.ofCustomChartSeries(customChartSeries)`.
         */
        fun commonFilters(customChartSeries: CustomChartSeriesFilters) =
            commonFilters(CommonFilters.ofCustomChartSeries(customChartSeries))

        /** Alias for calling [commonFilters] with `CommonFilters.ofMissing(missing)`. */
        fun commonFilters(missing: Missing) = commonFilters(CommonFilters.ofMissing(missing))

        fun description(description: Description?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<Description>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [Description] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun description(description: JsonField<Description>) = apply {
            this.description = description
        }

        /** Alias for calling [description] with `Description.ofString(string)`. */
        fun description(string: String) = description(Description.ofString(string))

        /** Alias for calling [description] with `Description.ofMissing(missing)`. */
        fun description(missing: Missing) = description(Description.ofMissing(missing))

        fun index(index: Index) = index(JsonField.of(index))

        /**
         * Sets [Builder.index] to an arbitrary JSON value.
         *
         * You should usually call [Builder.index] with a well-typed [Index] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun index(index: JsonField<Index>) = apply { this.index = index }

        /** Alias for calling [index] with `Index.ofInteger(integer)`. */
        fun index(integer: Long) = index(Index.ofInteger(integer))

        /** Alias for calling [index] with `Index.ofMissing(missing)`. */
        fun index(missing: Missing) = index(Index.ofMissing(missing))

        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Alias for calling [metadata] with `Metadata.ofJsonValue(jsonValue)`. */
        fun metadata(jsonValue: JsonValue) = metadata(Metadata.ofJsonValue(jsonValue))

        /** Alias for calling [metadata] with `Metadata.ofMissing(missing)`. */
        fun metadata(missing: Missing) = metadata(Metadata.ofMissing(missing))

        fun sectionId(sectionId: SectionId) = sectionId(JsonField.of(sectionId))

        /**
         * Sets [Builder.sectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sectionId] with a well-typed [SectionId] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sectionId(sectionId: JsonField<SectionId>) = apply { this.sectionId = sectionId }

        /** Alias for calling [sectionId] with `SectionId.ofString(string)`. */
        fun sectionId(string: String) = sectionId(SectionId.ofString(string))

        /** Alias for calling [sectionId] with `SectionId.ofMissing(missing)`. */
        fun sectionId(missing: Missing) = sectionId(SectionId.ofMissing(missing))

        fun series(series: Series) = series(JsonField.of(series))

        /**
         * Sets [Builder.series] to an arbitrary JSON value.
         *
         * You should usually call [Builder.series] with a well-typed [Series] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun series(series: JsonField<Series>) = apply { this.series = series }

        /**
         * Alias for calling [series] with
         * `Series.ofCustomChartSeriesUpdates(customChartSeriesUpdates)`.
         */
        fun seriesOfCustomChartSeriesUpdates(
            customChartSeriesUpdates: List<Series.CustomChartSeriesUpdate>
        ) = series(Series.ofCustomChartSeriesUpdates(customChartSeriesUpdates))

        /** Alias for calling [series] with `Series.ofMissing(missing)`. */
        fun series(missing: Missing) = series(Series.ofMissing(missing))

        fun title(title: Title) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [Title] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<Title>) = apply { this.title = title }

        /** Alias for calling [title] with `Title.ofString(string)`. */
        fun title(string: String) = title(Title.ofString(string))

        /** Alias for calling [title] with `Title.ofMissing(missing)`. */
        fun title(missing: Missing) = title(Title.ofMissing(missing))

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
         * Returns an immutable instance of [CustomChartUpdate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomChartUpdate =
            CustomChartUpdate(
                chartType,
                commonFilters,
                description,
                index,
                metadata,
                sectionId,
                series,
                title,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomChartUpdate = apply {
        if (validated) {
            return@apply
        }

        chartType().ifPresent { it.validate() }
        commonFilters().ifPresent { it.validate() }
        description().ifPresent { it.validate() }
        index().ifPresent { it.validate() }
        metadata().ifPresent { it.validate() }
        sectionId().ifPresent { it.validate() }
        series().ifPresent { it.validate() }
        title().ifPresent { it.validate() }
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
        (chartType.asKnown().getOrNull()?.validity() ?: 0) +
            (commonFilters.asKnown().getOrNull()?.validity() ?: 0) +
            (description.asKnown().getOrNull()?.validity() ?: 0) +
            (index.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (sectionId.asKnown().getOrNull()?.validity() ?: 0) +
            (series.asKnown().getOrNull()?.validity() ?: 0) +
            (title.asKnown().getOrNull()?.validity() ?: 0)

    /** Enum for custom chart types. */
    @JsonDeserialize(using = ChartType.Deserializer::class)
    @JsonSerialize(using = ChartType.Serializer::class)
    class ChartType
    private constructor(
        private val custom: CustomChartType? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Enum for custom chart types. */
        fun custom(): Optional<CustomChartType> = Optional.ofNullable(custom)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isCustom(): Boolean = custom != null

        fun isMissing(): Boolean = missing != null

        /** Enum for custom chart types. */
        fun asCustom(): CustomChartType = custom.getOrThrow("custom")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                custom != null -> visitor.visitCustom(custom)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): ChartType = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCustom(custom: CustomChartType) {
                        custom.validate()
                    }

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
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
                    override fun visitCustom(custom: CustomChartType) = custom.validity()

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ChartType && custom == other.custom && missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(custom, missing)

        override fun toString(): String =
            when {
                custom != null -> "ChartType{custom=$custom}"
                missing != null -> "ChartType{missing=$missing}"
                _json != null -> "ChartType{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ChartType")
            }

        companion object {

            /** Enum for custom chart types. */
            @JvmStatic fun ofCustom(custom: CustomChartType) = ChartType(custom = custom)

            @JvmStatic fun ofMissing(missing: Missing) = ChartType(missing = missing)
        }

        /**
         * An interface that defines how to map each variant of [ChartType] to a value of type [T].
         */
        interface Visitor<out T> {

            /** Enum for custom chart types. */
            fun visitCustom(custom: CustomChartType): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [ChartType] to a value of type [T].
             *
             * An instance of [ChartType] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown ChartType: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ChartType>(ChartType::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ChartType {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<CustomChartType>())?.let {
                                ChartType(custom = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                ChartType(missing = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from array).
                    0 -> ChartType(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ChartType>(ChartType::class) {

            override fun serialize(
                value: ChartType,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.custom != null -> generator.writeObject(value.custom)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ChartType")
                }
            }
        }
    }

    @JsonDeserialize(using = CommonFilters.Deserializer::class)
    @JsonSerialize(using = CommonFilters.Serializer::class)
    class CommonFilters
    private constructor(
        private val customChartSeries: CustomChartSeriesFilters? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun customChartSeries(): Optional<CustomChartSeriesFilters> =
            Optional.ofNullable(customChartSeries)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isCustomChartSeries(): Boolean = customChartSeries != null

        fun isMissing(): Boolean = missing != null

        fun asCustomChartSeries(): CustomChartSeriesFilters =
            customChartSeries.getOrThrow("customChartSeries")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                customChartSeries != null -> visitor.visitCustomChartSeries(customChartSeries)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): CommonFilters = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCustomChartSeries(
                        customChartSeries: CustomChartSeriesFilters
                    ) {
                        customChartSeries.validate()
                    }

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
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
                    override fun visitCustomChartSeries(
                        customChartSeries: CustomChartSeriesFilters
                    ) = customChartSeries.validity()

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CommonFilters &&
                customChartSeries == other.customChartSeries &&
                missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(customChartSeries, missing)

        override fun toString(): String =
            when {
                customChartSeries != null -> "CommonFilters{customChartSeries=$customChartSeries}"
                missing != null -> "CommonFilters{missing=$missing}"
                _json != null -> "CommonFilters{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CommonFilters")
            }

        companion object {

            @JvmStatic
            fun ofCustomChartSeries(customChartSeries: CustomChartSeriesFilters) =
                CommonFilters(customChartSeries = customChartSeries)

            @JvmStatic fun ofMissing(missing: Missing) = CommonFilters(missing = missing)
        }

        /**
         * An interface that defines how to map each variant of [CommonFilters] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitCustomChartSeries(customChartSeries: CustomChartSeriesFilters): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [CommonFilters] to a value of type [T].
             *
             * An instance of [CommonFilters] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown CommonFilters: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<CommonFilters>(CommonFilters::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): CommonFilters {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<CustomChartSeriesFilters>())?.let {
                                CommonFilters(customChartSeries = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                CommonFilters(missing = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> CommonFilters(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<CommonFilters>(CommonFilters::class) {

            override fun serialize(
                value: CommonFilters,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.customChartSeries != null ->
                        generator.writeObject(value.customChartSeries)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid CommonFilters")
                }
            }
        }
    }

    @JsonDeserialize(using = Description.Deserializer::class)
    @JsonSerialize(using = Description.Serializer::class)
    class Description
    private constructor(
        private val string: String? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isString(): Boolean = string != null

        fun isMissing(): Boolean = missing != null

        fun asString(): String = string.getOrThrow("string")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Description = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
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
                    override fun visitString(string: String) = 1

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Description && string == other.string && missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(string, missing)

        override fun toString(): String =
            when {
                string != null -> "Description{string=$string}"
                missing != null -> "Description{missing=$missing}"
                _json != null -> "Description{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Description")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Description(string = string)

            @JvmStatic fun ofMissing(missing: Missing) = Description(missing = missing)
        }

        /**
         * An interface that defines how to map each variant of [Description] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [Description] to a value of type [T].
             *
             * An instance of [Description] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Description: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Description>(Description::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Description {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                Description(missing = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Description(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from array).
                    0 -> Description(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Description>(Description::class) {

            override fun serialize(
                value: Description,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Description")
                }
            }
        }
    }

    @JsonDeserialize(using = Index.Deserializer::class)
    @JsonSerialize(using = Index.Serializer::class)
    class Index
    private constructor(
        private val integer: Long? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun integer(): Optional<Long> = Optional.ofNullable(integer)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isInteger(): Boolean = integer != null

        fun isMissing(): Boolean = missing != null

        fun asInteger(): Long = integer.getOrThrow("integer")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                integer != null -> visitor.visitInteger(integer)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Index = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitInteger(integer: Long) {}

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
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
                    override fun visitInteger(integer: Long) = 1

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Index && integer == other.integer && missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(integer, missing)

        override fun toString(): String =
            when {
                integer != null -> "Index{integer=$integer}"
                missing != null -> "Index{missing=$missing}"
                _json != null -> "Index{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Index")
            }

        companion object {

            @JvmStatic fun ofInteger(integer: Long) = Index(integer = integer)

            @JvmStatic fun ofMissing(missing: Missing) = Index(missing = missing)
        }

        /** An interface that defines how to map each variant of [Index] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitInteger(integer: Long): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [Index] to a value of type [T].
             *
             * An instance of [Index] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Index: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Index>(Index::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Index {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                Index(missing = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Long>())?.let {
                                Index(integer = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Index(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Index>(Index::class) {

            override fun serialize(
                value: Index,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.integer != null -> generator.writeObject(value.integer)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Index")
                }
            }
        }
    }

    @JsonDeserialize(using = Metadata.Deserializer::class)
    @JsonSerialize(using = Metadata.Serializer::class)
    class Metadata
    private constructor(
        private val jsonValue: JsonValue? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isJsonValue(): Boolean = jsonValue != null

        fun isMissing(): Boolean = missing != null

        fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                jsonValue != null -> visitor.visitJsonValue(jsonValue)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitJsonValue(jsonValue: JsonValue) {}

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
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
                    override fun visitJsonValue(jsonValue: JsonValue) = 1

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && jsonValue == other.jsonValue && missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(jsonValue, missing)

        override fun toString(): String =
            when {
                jsonValue != null -> "Metadata{jsonValue=$jsonValue}"
                missing != null -> "Metadata{missing=$missing}"
                _json != null -> "Metadata{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Metadata")
            }

        companion object {

            @JvmStatic fun ofJsonValue(jsonValue: JsonValue) = Metadata(jsonValue = jsonValue)

            @JvmStatic fun ofMissing(missing: Missing) = Metadata(missing = missing)
        }

        /**
         * An interface that defines how to map each variant of [Metadata] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitJsonValue(jsonValue: JsonValue): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [Metadata] to a value of type [T].
             *
             * An instance of [Metadata] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Metadata: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Metadata>(Metadata::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Metadata {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                Metadata(missing = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                Metadata(jsonValue = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants.
                    0 -> Metadata(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Metadata>(Metadata::class) {

            override fun serialize(
                value: Metadata,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.jsonValue != null -> generator.writeObject(value.jsonValue)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Metadata")
                }
            }
        }
    }

    @JsonDeserialize(using = SectionId.Deserializer::class)
    @JsonSerialize(using = SectionId.Serializer::class)
    class SectionId
    private constructor(
        private val string: String? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isString(): Boolean = string != null

        fun isMissing(): Boolean = missing != null

        fun asString(): String = string.getOrThrow("string")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): SectionId = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
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
                    override fun visitString(string: String) = 1

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SectionId && string == other.string && missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(string, missing)

        override fun toString(): String =
            when {
                string != null -> "SectionId{string=$string}"
                missing != null -> "SectionId{missing=$missing}"
                _json != null -> "SectionId{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid SectionId")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = SectionId(string = string)

            @JvmStatic fun ofMissing(missing: Missing) = SectionId(missing = missing)
        }

        /**
         * An interface that defines how to map each variant of [SectionId] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [SectionId] to a value of type [T].
             *
             * An instance of [SectionId] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown SectionId: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<SectionId>(SectionId::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): SectionId {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                SectionId(missing = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                SectionId(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from array).
                    0 -> SectionId(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<SectionId>(SectionId::class) {

            override fun serialize(
                value: SectionId,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid SectionId")
                }
            }
        }
    }

    @JsonDeserialize(using = Series.Deserializer::class)
    @JsonSerialize(using = Series.Serializer::class)
    class Series
    private constructor(
        private val customChartSeriesUpdates: List<CustomChartSeriesUpdate>? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun customChartSeriesUpdates(): Optional<List<CustomChartSeriesUpdate>> =
            Optional.ofNullable(customChartSeriesUpdates)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isCustomChartSeriesUpdates(): Boolean = customChartSeriesUpdates != null

        fun isMissing(): Boolean = missing != null

        fun asCustomChartSeriesUpdates(): List<CustomChartSeriesUpdate> =
            customChartSeriesUpdates.getOrThrow("customChartSeriesUpdates")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                customChartSeriesUpdates != null ->
                    visitor.visitCustomChartSeriesUpdates(customChartSeriesUpdates)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Series = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCustomChartSeriesUpdates(
                        customChartSeriesUpdates: List<CustomChartSeriesUpdate>
                    ) {
                        customChartSeriesUpdates.forEach { it.validate() }
                    }

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
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
                    override fun visitCustomChartSeriesUpdates(
                        customChartSeriesUpdates: List<CustomChartSeriesUpdate>
                    ) = customChartSeriesUpdates.sumOf { it.validity().toInt() }

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Series &&
                customChartSeriesUpdates == other.customChartSeriesUpdates &&
                missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(customChartSeriesUpdates, missing)

        override fun toString(): String =
            when {
                customChartSeriesUpdates != null ->
                    "Series{customChartSeriesUpdates=$customChartSeriesUpdates}"
                missing != null -> "Series{missing=$missing}"
                _json != null -> "Series{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Series")
            }

        companion object {

            @JvmStatic
            fun ofCustomChartSeriesUpdates(
                customChartSeriesUpdates: List<CustomChartSeriesUpdate>
            ) = Series(customChartSeriesUpdates = customChartSeriesUpdates.toImmutable())

            @JvmStatic fun ofMissing(missing: Missing) = Series(missing = missing)
        }

        /** An interface that defines how to map each variant of [Series] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitCustomChartSeriesUpdates(
                customChartSeriesUpdates: List<CustomChartSeriesUpdate>
            ): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [Series] to a value of type [T].
             *
             * An instance of [Series] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Series: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Series>(Series::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Series {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                Series(missing = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<CustomChartSeriesUpdate>>())
                                ?.let { Series(customChartSeriesUpdates = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Series(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Series>(Series::class) {

            override fun serialize(
                value: Series,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.customChartSeriesUpdates != null ->
                        generator.writeObject(value.customChartSeriesUpdates)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Series")
                }
            }
        }

        class CustomChartSeriesUpdate
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val metric: JsonField<CustomChartMetric>,
            private val name: JsonField<String>,
            private val id: JsonField<String>,
            private val feedbackKey: JsonField<String>,
            private val filters: JsonField<CustomChartSeriesFilters>,
            private val groupBy: JsonField<RunStatsGroupBy>,
            private val projectMetric: JsonField<HostProjectChartMetric>,
            private val workspaceId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("metric")
                @ExcludeMissing
                metric: JsonField<CustomChartMetric> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("feedback_key")
                @ExcludeMissing
                feedbackKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("filters")
                @ExcludeMissing
                filters: JsonField<CustomChartSeriesFilters> = JsonMissing.of(),
                @JsonProperty("group_by")
                @ExcludeMissing
                groupBy: JsonField<RunStatsGroupBy> = JsonMissing.of(),
                @JsonProperty("project_metric")
                @ExcludeMissing
                projectMetric: JsonField<HostProjectChartMetric> = JsonMissing.of(),
                @JsonProperty("workspace_id")
                @ExcludeMissing
                workspaceId: JsonField<String> = JsonMissing.of(),
            ) : this(
                metric,
                name,
                id,
                feedbackKey,
                filters,
                groupBy,
                projectMetric,
                workspaceId,
                mutableMapOf(),
            )

            /**
             * Metrics you can chart. Feedback metrics are not available for organization-scoped
             * charts.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun metric(): CustomChartMetric = metric.getRequired("metric")

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
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun feedbackKey(): Optional<String> = feedbackKey.getOptional("feedback_key")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun filters(): Optional<CustomChartSeriesFilters> = filters.getOptional("filters")

            /**
             * Group by param for run stats.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun groupBy(): Optional<RunStatsGroupBy> = groupBy.getOptional("group_by")

            /**
             * LGP Metrics you can chart.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun projectMetric(): Optional<HostProjectChartMetric> =
                projectMetric.getOptional("project_metric")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun workspaceId(): Optional<String> = workspaceId.getOptional("workspace_id")

            /**
             * Returns the raw JSON value of [metric].
             *
             * Unlike [metric], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("metric")
            @ExcludeMissing
            fun _metric(): JsonField<CustomChartMetric> = metric

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
             * Returns the raw JSON value of [filters].
             *
             * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("filters")
            @ExcludeMissing
            fun _filters(): JsonField<CustomChartSeriesFilters> = filters

            /**
             * Returns the raw JSON value of [groupBy].
             *
             * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("group_by")
            @ExcludeMissing
            fun _groupBy(): JsonField<RunStatsGroupBy> = groupBy

            /**
             * Returns the raw JSON value of [projectMetric].
             *
             * Unlike [projectMetric], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("project_metric")
            @ExcludeMissing
            fun _projectMetric(): JsonField<HostProjectChartMetric> = projectMetric

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
                 * Returns a mutable builder for constructing an instance of
                 * [CustomChartSeriesUpdate].
                 *
                 * The following fields are required:
                 * ```java
                 * .metric()
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomChartSeriesUpdate]. */
            class Builder internal constructor() {

                private var metric: JsonField<CustomChartMetric>? = null
                private var name: JsonField<String>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var feedbackKey: JsonField<String> = JsonMissing.of()
                private var filters: JsonField<CustomChartSeriesFilters> = JsonMissing.of()
                private var groupBy: JsonField<RunStatsGroupBy> = JsonMissing.of()
                private var projectMetric: JsonField<HostProjectChartMetric> = JsonMissing.of()
                private var workspaceId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customChartSeriesUpdate: CustomChartSeriesUpdate) = apply {
                    metric = customChartSeriesUpdate.metric
                    name = customChartSeriesUpdate.name
                    id = customChartSeriesUpdate.id
                    feedbackKey = customChartSeriesUpdate.feedbackKey
                    filters = customChartSeriesUpdate.filters
                    groupBy = customChartSeriesUpdate.groupBy
                    projectMetric = customChartSeriesUpdate.projectMetric
                    workspaceId = customChartSeriesUpdate.workspaceId
                    additionalProperties =
                        customChartSeriesUpdate.additionalProperties.toMutableMap()
                }

                /**
                 * Metrics you can chart. Feedback metrics are not available for organization-scoped
                 * charts.
                 */
                fun metric(metric: CustomChartMetric) = metric(JsonField.of(metric))

                /**
                 * Sets [Builder.metric] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metric] with a well-typed [CustomChartMetric]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun metric(metric: JsonField<CustomChartMetric>) = apply { this.metric = metric }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun filters(filters: CustomChartSeriesFilters?) =
                    filters(JsonField.ofNullable(filters))

                /** Alias for calling [Builder.filters] with `filters.orElse(null)`. */
                fun filters(filters: Optional<CustomChartSeriesFilters>) =
                    filters(filters.getOrNull())

                /**
                 * Sets [Builder.filters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filters] with a well-typed
                 * [CustomChartSeriesFilters] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun filters(filters: JsonField<CustomChartSeriesFilters>) = apply {
                    this.filters = filters
                }

                /** Group by param for run stats. */
                fun groupBy(groupBy: RunStatsGroupBy?) = groupBy(JsonField.ofNullable(groupBy))

                /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
                fun groupBy(groupBy: Optional<RunStatsGroupBy>) = groupBy(groupBy.getOrNull())

                /**
                 * Sets [Builder.groupBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupBy] with a well-typed [RunStatsGroupBy]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun groupBy(groupBy: JsonField<RunStatsGroupBy>) = apply { this.groupBy = groupBy }

                /** LGP Metrics you can chart. */
                fun projectMetric(projectMetric: HostProjectChartMetric?) =
                    projectMetric(JsonField.ofNullable(projectMetric))

                /** Alias for calling [Builder.projectMetric] with `projectMetric.orElse(null)`. */
                fun projectMetric(projectMetric: Optional<HostProjectChartMetric>) =
                    projectMetric(projectMetric.getOrNull())

                /**
                 * Sets [Builder.projectMetric] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projectMetric] with a well-typed
                 * [HostProjectChartMetric] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun projectMetric(projectMetric: JsonField<HostProjectChartMetric>) = apply {
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
                 * Returns an immutable instance of [CustomChartSeriesUpdate].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .metric()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CustomChartSeriesUpdate =
                    CustomChartSeriesUpdate(
                        checkRequired("metric", metric),
                        checkRequired("name", name),
                        id,
                        feedbackKey,
                        filters,
                        groupBy,
                        projectMetric,
                        workspaceId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CustomChartSeriesUpdate = apply {
                if (validated) {
                    return@apply
                }

                metric().validate()
                name()
                id()
                feedbackKey()
                filters().ifPresent { it.validate() }
                groupBy().ifPresent { it.validate() }
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
                (metric.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (id.asKnown().isPresent) 1 else 0) +
                    (if (feedbackKey.asKnown().isPresent) 1 else 0) +
                    (filters.asKnown().getOrNull()?.validity() ?: 0) +
                    (groupBy.asKnown().getOrNull()?.validity() ?: 0) +
                    (projectMetric.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (workspaceId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomChartSeriesUpdate &&
                    metric == other.metric &&
                    name == other.name &&
                    id == other.id &&
                    feedbackKey == other.feedbackKey &&
                    filters == other.filters &&
                    groupBy == other.groupBy &&
                    projectMetric == other.projectMetric &&
                    workspaceId == other.workspaceId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    metric,
                    name,
                    id,
                    feedbackKey,
                    filters,
                    groupBy,
                    projectMetric,
                    workspaceId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CustomChartSeriesUpdate{metric=$metric, name=$name, id=$id, feedbackKey=$feedbackKey, filters=$filters, groupBy=$groupBy, projectMetric=$projectMetric, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
        }
    }

    @JsonDeserialize(using = Title.Deserializer::class)
    @JsonSerialize(using = Title.Serializer::class)
    class Title
    private constructor(
        private val string: String? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isString(): Boolean = string != null

        fun isMissing(): Boolean = missing != null

        fun asString(): String = string.getOrThrow("string")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Title = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
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
                    override fun visitString(string: String) = 1

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Title && string == other.string && missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(string, missing)

        override fun toString(): String =
            when {
                string != null -> "Title{string=$string}"
                missing != null -> "Title{missing=$missing}"
                _json != null -> "Title{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Title")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Title(string = string)

            @JvmStatic fun ofMissing(missing: Missing) = Title(missing = missing)
        }

        /** An interface that defines how to map each variant of [Title] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [Title] to a value of type [T].
             *
             * An instance of [Title] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Title: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Title>(Title::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Title {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                Title(missing = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Title(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from array).
                    0 -> Title(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Title>(Title::class) {

            override fun serialize(
                value: Title,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Title")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChartUpdate &&
            chartType == other.chartType &&
            commonFilters == other.commonFilters &&
            description == other.description &&
            index == other.index &&
            metadata == other.metadata &&
            sectionId == other.sectionId &&
            series == other.series &&
            title == other.title &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            chartType,
            commonFilters,
            description,
            index,
            metadata,
            sectionId,
            series,
            title,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomChartUpdate{chartType=$chartType, commonFilters=$commonFilters, description=$description, index=$index, metadata=$metadata, sectionId=$sectionId, series=$series, title=$title, additionalProperties=$additionalProperties}"
}
