// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

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
import com.langsmith.api.core.BaseDeserializer
import com.langsmith.api.core.BaseSerializer
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.getOrThrow
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class FeedbackEagerParams
constructor(
    private val key: String,
    private val runId: String,
    private val id: String?,
    private val comment: String?,
    private val correction: JsonValue?,
    private val createdAt: OffsetDateTime?,
    private val feedbackConfig: FeedbackConfig?,
    private val feedbackSource: FeedbackSource?,
    private val modifiedAt: OffsetDateTime?,
    private val score: Score?,
    private val value: Value?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun key(): String = key

    fun runId(): String = runId

    fun id(): Optional<String> = Optional.ofNullable(id)

    fun comment(): Optional<String> = Optional.ofNullable(comment)

    fun correction(): Optional<JsonValue> = Optional.ofNullable(correction)

    fun createdAt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAt)

    fun feedbackConfig(): Optional<FeedbackConfig> = Optional.ofNullable(feedbackConfig)

    fun feedbackSource(): Optional<FeedbackSource> = Optional.ofNullable(feedbackSource)

    fun modifiedAt(): Optional<OffsetDateTime> = Optional.ofNullable(modifiedAt)

    fun score(): Optional<Score> = Optional.ofNullable(score)

    fun value(): Optional<Value> = Optional.ofNullable(value)

    @JvmSynthetic
    internal fun getBody(): FeedbackEagerBody {
        return FeedbackEagerBody(
            key,
            runId,
            id,
            comment,
            correction,
            createdAt,
            feedbackConfig,
            feedbackSource,
            modifiedAt,
            score,
            value,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    /** Schema used for creating feedback. */
    @JsonDeserialize(builder = FeedbackEagerBody.Builder::class)
    @NoAutoDetect
    class FeedbackEagerBody
    internal constructor(
        private val key: String?,
        private val runId: String?,
        private val id: String?,
        private val comment: String?,
        private val correction: JsonValue?,
        private val createdAt: OffsetDateTime?,
        private val feedbackConfig: FeedbackConfig?,
        private val feedbackSource: FeedbackSource?,
        private val modifiedAt: OffsetDateTime?,
        private val score: Score?,
        private val value: Value?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("key") fun key(): String? = key

        @JsonProperty("run_id") fun runId(): String? = runId

        @JsonProperty("id") fun id(): String? = id

        @JsonProperty("comment") fun comment(): String? = comment

        @JsonProperty("correction") fun correction(): JsonValue? = correction

        @JsonProperty("created_at") fun createdAt(): OffsetDateTime? = createdAt

        @JsonProperty("feedback_config") fun feedbackConfig(): FeedbackConfig? = feedbackConfig

        @JsonProperty("feedback_source") fun feedbackSource(): FeedbackSource? = feedbackSource

        @JsonProperty("modified_at") fun modifiedAt(): OffsetDateTime? = modifiedAt

        @JsonProperty("score") fun score(): Score? = score

        @JsonProperty("value") fun value(): Value? = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeedbackEagerBody &&
                this.key == other.key &&
                this.runId == other.runId &&
                this.id == other.id &&
                this.comment == other.comment &&
                this.correction == other.correction &&
                this.createdAt == other.createdAt &&
                this.feedbackConfig == other.feedbackConfig &&
                this.feedbackSource == other.feedbackSource &&
                this.modifiedAt == other.modifiedAt &&
                this.score == other.score &&
                this.value == other.value &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        key,
                        runId,
                        id,
                        comment,
                        correction,
                        createdAt,
                        feedbackConfig,
                        feedbackSource,
                        modifiedAt,
                        score,
                        value,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FeedbackEagerBody{key=$key, runId=$runId, id=$id, comment=$comment, correction=$correction, createdAt=$createdAt, feedbackConfig=$feedbackConfig, feedbackSource=$feedbackSource, modifiedAt=$modifiedAt, score=$score, value=$value, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var key: String? = null
            private var runId: String? = null
            private var id: String? = null
            private var comment: String? = null
            private var correction: JsonValue? = null
            private var createdAt: OffsetDateTime? = null
            private var feedbackConfig: FeedbackConfig? = null
            private var feedbackSource: FeedbackSource? = null
            private var modifiedAt: OffsetDateTime? = null
            private var score: Score? = null
            private var value: Value? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(feedbackEagerBody: FeedbackEagerBody) = apply {
                this.key = feedbackEagerBody.key
                this.runId = feedbackEagerBody.runId
                this.id = feedbackEagerBody.id
                this.comment = feedbackEagerBody.comment
                this.correction = feedbackEagerBody.correction
                this.createdAt = feedbackEagerBody.createdAt
                this.feedbackConfig = feedbackEagerBody.feedbackConfig
                this.feedbackSource = feedbackEagerBody.feedbackSource
                this.modifiedAt = feedbackEagerBody.modifiedAt
                this.score = feedbackEagerBody.score
                this.value = feedbackEagerBody.value
                additionalProperties(feedbackEagerBody.additionalProperties)
            }

            @JsonProperty("key") fun key(key: String) = apply { this.key = key }

            @JsonProperty("run_id") fun runId(runId: String) = apply { this.runId = runId }

            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            @JsonProperty("comment") fun comment(comment: String) = apply { this.comment = comment }

            @JsonProperty("correction")
            fun correction(correction: JsonValue) = apply { this.correction = correction }

            @JsonProperty("created_at")
            fun createdAt(createdAt: OffsetDateTime) = apply { this.createdAt = createdAt }

            @JsonProperty("feedback_config")
            fun feedbackConfig(feedbackConfig: FeedbackConfig) = apply {
                this.feedbackConfig = feedbackConfig
            }

            @JsonProperty("feedback_source")
            fun feedbackSource(feedbackSource: FeedbackSource) = apply {
                this.feedbackSource = feedbackSource
            }

            @JsonProperty("modified_at")
            fun modifiedAt(modifiedAt: OffsetDateTime) = apply { this.modifiedAt = modifiedAt }

            @JsonProperty("score") fun score(score: Score) = apply { this.score = score }

            @JsonProperty("value") fun value(value: Value) = apply { this.value = value }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): FeedbackEagerBody =
                FeedbackEagerBody(
                    checkNotNull(key) { "`key` is required but was not set" },
                    checkNotNull(runId) { "`runId` is required but was not set" },
                    id,
                    comment,
                    correction,
                    createdAt,
                    feedbackConfig,
                    feedbackSource,
                    modifiedAt,
                    score,
                    value,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackEagerParams &&
            this.key == other.key &&
            this.runId == other.runId &&
            this.id == other.id &&
            this.comment == other.comment &&
            this.correction == other.correction &&
            this.createdAt == other.createdAt &&
            this.feedbackConfig == other.feedbackConfig &&
            this.feedbackSource == other.feedbackSource &&
            this.modifiedAt == other.modifiedAt &&
            this.score == other.score &&
            this.value == other.value &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            key,
            runId,
            id,
            comment,
            correction,
            createdAt,
            feedbackConfig,
            feedbackSource,
            modifiedAt,
            score,
            value,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "FeedbackEagerParams{key=$key, runId=$runId, id=$id, comment=$comment, correction=$correction, createdAt=$createdAt, feedbackConfig=$feedbackConfig, feedbackSource=$feedbackSource, modifiedAt=$modifiedAt, score=$score, value=$value, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var key: String? = null
        private var runId: String? = null
        private var id: String? = null
        private var comment: String? = null
        private var correction: JsonValue? = null
        private var createdAt: OffsetDateTime? = null
        private var feedbackConfig: FeedbackConfig? = null
        private var feedbackSource: FeedbackSource? = null
        private var modifiedAt: OffsetDateTime? = null
        private var score: Score? = null
        private var value: Value? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(feedbackEagerParams: FeedbackEagerParams) = apply {
            this.key = feedbackEagerParams.key
            this.runId = feedbackEagerParams.runId
            this.id = feedbackEagerParams.id
            this.comment = feedbackEagerParams.comment
            this.correction = feedbackEagerParams.correction
            this.createdAt = feedbackEagerParams.createdAt
            this.feedbackConfig = feedbackEagerParams.feedbackConfig
            this.feedbackSource = feedbackEagerParams.feedbackSource
            this.modifiedAt = feedbackEagerParams.modifiedAt
            this.score = feedbackEagerParams.score
            this.value = feedbackEagerParams.value
            additionalQueryParams(feedbackEagerParams.additionalQueryParams)
            additionalHeaders(feedbackEagerParams.additionalHeaders)
            additionalBodyProperties(feedbackEagerParams.additionalBodyProperties)
        }

        fun key(key: String) = apply { this.key = key }

        fun runId(runId: String) = apply { this.runId = runId }

        fun id(id: String) = apply { this.id = id }

        fun comment(comment: String) = apply { this.comment = comment }

        fun correction(correction: JsonValue) = apply { this.correction = correction }

        fun createdAt(createdAt: OffsetDateTime) = apply { this.createdAt = createdAt }

        fun feedbackConfig(feedbackConfig: FeedbackConfig) = apply {
            this.feedbackConfig = feedbackConfig
        }

        /** Feedback from the LangChainPlus App. */
        fun feedbackSource(feedbackSource: FeedbackSource) = apply {
            this.feedbackSource = feedbackSource
        }

        /** Feedback from the LangChainPlus App. */
        fun feedbackSource(appFeedbackSource: AppFeedbackSource) = apply {
            this.feedbackSource = FeedbackSource.ofAppFeedbackSource(appFeedbackSource)
        }

        /** Feedback from the LangChainPlus App. */
        fun feedbackSource(apiFeedbackSource: ApiFeedbackSource) = apply {
            this.feedbackSource = FeedbackSource.ofApiFeedbackSource(apiFeedbackSource)
        }

        /** Feedback from the LangChainPlus App. */
        fun feedbackSource(modelFeedbackSource: ModelFeedbackSource) = apply {
            this.feedbackSource = FeedbackSource.ofModelFeedbackSource(modelFeedbackSource)
        }

        fun modifiedAt(modifiedAt: OffsetDateTime) = apply { this.modifiedAt = modifiedAt }

        fun score(score: Score) = apply { this.score = score }

        fun score(double: Double) = apply { this.score = Score.ofDouble(double) }

        fun score(boolean: Boolean) = apply { this.score = Score.ofBoolean(boolean) }

        fun value(value: Value) = apply { this.value = value }

        fun value(double: Double) = apply { this.value = Value.ofDouble(double) }

        fun value(boolean: Boolean) = apply { this.value = Value.ofBoolean(boolean) }

        fun value(string: String) = apply { this.value = Value.ofString(string) }

        fun value(jsonValue: JsonValue) = apply { this.value = Value.ofJsonValue(jsonValue) }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): FeedbackEagerParams =
            FeedbackEagerParams(
                checkNotNull(key) { "`key` is required but was not set" },
                checkNotNull(runId) { "`runId` is required but was not set" },
                id,
                comment,
                correction,
                createdAt,
                feedbackConfig,
                feedbackSource,
                modifiedAt,
                score,
                value,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = FeedbackConfig.Builder::class)
    @NoAutoDetect
    class FeedbackConfig
    private constructor(
        private val type: Type?,
        private val min: Double?,
        private val max: Double?,
        private val categories: List<Category>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Enum for feedback types. */
        @JsonProperty("type") fun type(): Type? = type

        @JsonProperty("min") fun min(): Double? = min

        @JsonProperty("max") fun max(): Double? = max

        @JsonProperty("categories") fun categories(): List<Category>? = categories

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeedbackConfig &&
                this.type == other.type &&
                this.min == other.min &&
                this.max == other.max &&
                this.categories == other.categories &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        type,
                        min,
                        max,
                        categories,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FeedbackConfig{type=$type, min=$min, max=$max, categories=$categories, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var min: Double? = null
            private var max: Double? = null
            private var categories: List<Category>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(feedbackConfig: FeedbackConfig) = apply {
                this.type = feedbackConfig.type
                this.min = feedbackConfig.min
                this.max = feedbackConfig.max
                this.categories = feedbackConfig.categories
                additionalProperties(feedbackConfig.additionalProperties)
            }

            /** Enum for feedback types. */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            @JsonProperty("min") fun min(min: Double) = apply { this.min = min }

            @JsonProperty("max") fun max(max: Double) = apply { this.max = max }

            @JsonProperty("categories")
            fun categories(categories: List<Category>) = apply { this.categories = categories }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): FeedbackConfig =
                FeedbackConfig(
                    checkNotNull(type) { "`type` is required but was not set" },
                    min,
                    max,
                    categories?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CONTINUOUS = Type(JsonField.of("continuous"))

                @JvmField val CATEGORICAL = Type(JsonField.of("categorical"))

                @JvmField val FREEFORM = Type(JsonField.of("freeform"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                CONTINUOUS,
                CATEGORICAL,
                FREEFORM,
            }

            enum class Value {
                CONTINUOUS,
                CATEGORICAL,
                FREEFORM,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CONTINUOUS -> Value.CONTINUOUS
                    CATEGORICAL -> Value.CATEGORICAL
                    FREEFORM -> Value.FREEFORM
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CONTINUOUS -> Known.CONTINUOUS
                    CATEGORICAL -> Known.CATEGORICAL
                    FREEFORM -> Known.FREEFORM
                    else -> throw LangSmithInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /** Specific value and label pair for feedback */
        @JsonDeserialize(builder = Category.Builder::class)
        @NoAutoDetect
        class Category
        private constructor(
            private val value: Double?,
            private val label: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("value") fun value(): Double? = value

            @JsonProperty("label") fun label(): String? = label

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category &&
                    this.value == other.value &&
                    this.label == other.label &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            value,
                            label,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Category{value=$value, label=$label, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var value: Double? = null
                private var label: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(category: Category) = apply {
                    this.value = category.value
                    this.label = category.label
                    additionalProperties(category.additionalProperties)
                }

                @JsonProperty("value") fun value(value: Double) = apply { this.value = value }

                @JsonProperty("label") fun label(label: String) = apply { this.label = label }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Category =
                    Category(
                        checkNotNull(value) { "`value` is required but was not set" },
                        label,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }

    @JsonDeserialize(using = FeedbackSource.Deserializer::class)
    @JsonSerialize(using = FeedbackSource.Serializer::class)
    class FeedbackSource
    private constructor(
        private val appFeedbackSource: AppFeedbackSource? = null,
        private val apiFeedbackSource: ApiFeedbackSource? = null,
        private val modelFeedbackSource: ModelFeedbackSource? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        /** Feedback from the LangChainPlus App. */
        fun appFeedbackSource(): Optional<AppFeedbackSource> =
            Optional.ofNullable(appFeedbackSource)
        /** API feedback source. */
        fun apiFeedbackSource(): Optional<ApiFeedbackSource> =
            Optional.ofNullable(apiFeedbackSource)
        /** Model feedback source. */
        fun modelFeedbackSource(): Optional<ModelFeedbackSource> =
            Optional.ofNullable(modelFeedbackSource)

        fun isAppFeedbackSource(): Boolean = appFeedbackSource != null

        fun isApiFeedbackSource(): Boolean = apiFeedbackSource != null

        fun isModelFeedbackSource(): Boolean = modelFeedbackSource != null

        fun asAppFeedbackSource(): AppFeedbackSource =
            appFeedbackSource.getOrThrow("appFeedbackSource")

        fun asApiFeedbackSource(): ApiFeedbackSource =
            apiFeedbackSource.getOrThrow("apiFeedbackSource")

        fun asModelFeedbackSource(): ModelFeedbackSource =
            modelFeedbackSource.getOrThrow("modelFeedbackSource")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                appFeedbackSource != null -> visitor.visitAppFeedbackSource(appFeedbackSource)
                apiFeedbackSource != null -> visitor.visitApiFeedbackSource(apiFeedbackSource)
                modelFeedbackSource != null -> visitor.visitModelFeedbackSource(modelFeedbackSource)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): FeedbackSource = apply {
            if (!validated) {
                if (
                    appFeedbackSource == null &&
                        apiFeedbackSource == null &&
                        modelFeedbackSource == null
                ) {
                    throw LangSmithInvalidDataException("Unknown FeedbackSource: $_json")
                }
                appFeedbackSource?.validate()
                apiFeedbackSource?.validate()
                modelFeedbackSource?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeedbackSource &&
                this.appFeedbackSource == other.appFeedbackSource &&
                this.apiFeedbackSource == other.apiFeedbackSource &&
                this.modelFeedbackSource == other.modelFeedbackSource
        }

        override fun hashCode(): Int {
            return Objects.hash(
                appFeedbackSource,
                apiFeedbackSource,
                modelFeedbackSource,
            )
        }

        override fun toString(): String {
            return when {
                appFeedbackSource != null -> "FeedbackSource{appFeedbackSource=$appFeedbackSource}"
                apiFeedbackSource != null -> "FeedbackSource{apiFeedbackSource=$apiFeedbackSource}"
                modelFeedbackSource != null ->
                    "FeedbackSource{modelFeedbackSource=$modelFeedbackSource}"
                _json != null -> "FeedbackSource{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FeedbackSource")
            }
        }

        companion object {

            @JvmStatic
            fun ofAppFeedbackSource(appFeedbackSource: AppFeedbackSource) =
                FeedbackSource(appFeedbackSource = appFeedbackSource)

            @JvmStatic
            fun ofApiFeedbackSource(apiFeedbackSource: ApiFeedbackSource) =
                FeedbackSource(apiFeedbackSource = apiFeedbackSource)

            @JvmStatic
            fun ofModelFeedbackSource(modelFeedbackSource: ModelFeedbackSource) =
                FeedbackSource(modelFeedbackSource = modelFeedbackSource)
        }

        interface Visitor<out T> {

            fun visitAppFeedbackSource(appFeedbackSource: AppFeedbackSource): T

            fun visitApiFeedbackSource(apiFeedbackSource: ApiFeedbackSource): T

            fun visitModelFeedbackSource(modelFeedbackSource: ModelFeedbackSource): T

            fun unknown(json: JsonValue?): T {
                throw LangSmithInvalidDataException("Unknown FeedbackSource: $json")
            }
        }

        class Deserializer : BaseDeserializer<FeedbackSource>(FeedbackSource::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FeedbackSource {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<AppFeedbackSource>()) { it.validate() }
                    ?.let {
                        return FeedbackSource(appFeedbackSource = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ApiFeedbackSource>()) { it.validate() }
                    ?.let {
                        return FeedbackSource(apiFeedbackSource = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ModelFeedbackSource>()) { it.validate() }
                    ?.let {
                        return FeedbackSource(modelFeedbackSource = it, _json = json)
                    }

                return FeedbackSource(_json = json)
            }
        }

        class Serializer : BaseSerializer<FeedbackSource>(FeedbackSource::class) {

            override fun serialize(
                value: FeedbackSource,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.appFeedbackSource != null ->
                        generator.writeObject(value.appFeedbackSource)
                    value.apiFeedbackSource != null ->
                        generator.writeObject(value.apiFeedbackSource)
                    value.modelFeedbackSource != null ->
                        generator.writeObject(value.modelFeedbackSource)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid FeedbackSource")
                }
            }
        }

        /** Feedback from the LangChainPlus App. */
        @JsonDeserialize(builder = AppFeedbackSource.Builder::class)
        @NoAutoDetect
        class AppFeedbackSource
        private constructor(
            private val type: JsonField<String>,
            private val metadata: JsonValue,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AppFeedbackSource = apply {
                if (!validated) {
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AppFeedbackSource &&
                    this.type == other.type &&
                    this.metadata == other.metadata &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            type,
                            metadata,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AppFeedbackSource{type=$type, metadata=$metadata, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<String> = JsonMissing.of()
                private var metadata: JsonValue = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(appFeedbackSource: AppFeedbackSource) = apply {
                    this.type = appFeedbackSource.type
                    this.metadata = appFeedbackSource.metadata
                    additionalProperties(appFeedbackSource.additionalProperties)
                }

                fun type(type: String) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<String>) = apply { this.type = type }

                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AppFeedbackSource =
                    AppFeedbackSource(
                        type,
                        metadata,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /** API feedback source. */
        @JsonDeserialize(builder = ApiFeedbackSource.Builder::class)
        @NoAutoDetect
        class ApiFeedbackSource
        private constructor(
            private val type: JsonField<String>,
            private val metadata: JsonValue,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ApiFeedbackSource = apply {
                if (!validated) {
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ApiFeedbackSource &&
                    this.type == other.type &&
                    this.metadata == other.metadata &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            type,
                            metadata,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "ApiFeedbackSource{type=$type, metadata=$metadata, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<String> = JsonMissing.of()
                private var metadata: JsonValue = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(apiFeedbackSource: ApiFeedbackSource) = apply {
                    this.type = apiFeedbackSource.type
                    this.metadata = apiFeedbackSource.metadata
                    additionalProperties(apiFeedbackSource.additionalProperties)
                }

                fun type(type: String) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<String>) = apply { this.type = type }

                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ApiFeedbackSource =
                    ApiFeedbackSource(
                        type,
                        metadata,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /** Model feedback source. */
        @JsonDeserialize(builder = ModelFeedbackSource.Builder::class)
        @NoAutoDetect
        class ModelFeedbackSource
        private constructor(
            private val type: JsonField<String>,
            private val metadata: JsonValue,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ModelFeedbackSource = apply {
                if (!validated) {
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ModelFeedbackSource &&
                    this.type == other.type &&
                    this.metadata == other.metadata &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            type,
                            metadata,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "ModelFeedbackSource{type=$type, metadata=$metadata, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<String> = JsonMissing.of()
                private var metadata: JsonValue = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(modelFeedbackSource: ModelFeedbackSource) = apply {
                    this.type = modelFeedbackSource.type
                    this.metadata = modelFeedbackSource.metadata
                    additionalProperties(modelFeedbackSource.additionalProperties)
                }

                fun type(type: String) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<String>) = apply { this.type = type }

                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ModelFeedbackSource =
                    ModelFeedbackSource(
                        type,
                        metadata,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }

    @JsonDeserialize(using = Score.Deserializer::class)
    @JsonSerialize(using = Score.Serializer::class)
    class Score
    private constructor(
        private val double: Double? = null,
        private val boolean: Boolean? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun double(): Optional<Double> = Optional.ofNullable(double)

        fun boolean(): Optional<Boolean> = Optional.ofNullable(boolean)

        fun isDouble(): Boolean = double != null

        fun isBoolean(): Boolean = boolean != null

        fun asDouble(): Double = double.getOrThrow("double")

        fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                double != null -> visitor.visitDouble(double)
                boolean != null -> visitor.visitBoolean(boolean)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Score = apply {
            if (!validated) {
                if (double == null && boolean == null) {
                    throw LangSmithInvalidDataException("Unknown Score: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Score && this.double == other.double && this.boolean == other.boolean
        }

        override fun hashCode(): Int {
            return Objects.hash(double, boolean)
        }

        override fun toString(): String {
            return when {
                double != null -> "Score{double=$double}"
                boolean != null -> "Score{boolean=$boolean}"
                _json != null -> "Score{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Score")
            }
        }

        companion object {

            @JvmStatic fun ofDouble(double: Double) = Score(double = double)

            @JvmStatic fun ofBoolean(boolean: Boolean) = Score(boolean = boolean)
        }

        interface Visitor<out T> {

            fun visitDouble(double: Double): T

            fun visitBoolean(boolean: Boolean): T

            fun unknown(json: JsonValue?): T {
                throw LangSmithInvalidDataException("Unknown Score: $json")
            }
        }

        class Deserializer : BaseDeserializer<Score>(Score::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Score {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                    return Score(double = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                    return Score(boolean = it, _json = json)
                }

                return Score(_json = json)
            }
        }

        class Serializer : BaseSerializer<Score>(Score::class) {

            override fun serialize(
                value: Score,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.double != null -> generator.writeObject(value.double)
                    value.boolean != null -> generator.writeObject(value.boolean)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Score")
                }
            }
        }
    }

    @JsonDeserialize(using = Value.Deserializer::class)
    @JsonSerialize(using = Value.Serializer::class)
    class Value
    private constructor(
        private val double: Double? = null,
        private val boolean: Boolean? = null,
        private val string: String? = null,
        private val jsonValue: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun double(): Optional<Double> = Optional.ofNullable(double)

        fun boolean(): Optional<Boolean> = Optional.ofNullable(boolean)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

        fun isDouble(): Boolean = double != null

        fun isBoolean(): Boolean = boolean != null

        fun isString(): Boolean = string != null

        fun isJsonValue(): Boolean = jsonValue != null

        fun asDouble(): Double = double.getOrThrow("double")

        fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

        fun asString(): String = string.getOrThrow("string")

        fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                double != null -> visitor.visitDouble(double)
                boolean != null -> visitor.visitBoolean(boolean)
                string != null -> visitor.visitString(string)
                jsonValue != null -> visitor.visitJsonValue(jsonValue)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Value = apply {
            if (!validated) {
                if (double == null && boolean == null && string == null && jsonValue == null) {
                    throw LangSmithInvalidDataException("Unknown Value: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Value &&
                this.double == other.double &&
                this.boolean == other.boolean &&
                this.string == other.string &&
                this.jsonValue == other.jsonValue
        }

        override fun hashCode(): Int {
            return Objects.hash(
                double,
                boolean,
                string,
                jsonValue,
            )
        }

        override fun toString(): String {
            return when {
                double != null -> "Value{double=$double}"
                boolean != null -> "Value{boolean=$boolean}"
                string != null -> "Value{string=$string}"
                jsonValue != null -> "Value{jsonValue=$jsonValue}"
                _json != null -> "Value{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Value")
            }
        }

        companion object {

            @JvmStatic fun ofDouble(double: Double) = Value(double = double)

            @JvmStatic fun ofBoolean(boolean: Boolean) = Value(boolean = boolean)

            @JvmStatic fun ofString(string: String) = Value(string = string)

            @JvmStatic fun ofJsonValue(jsonValue: JsonValue) = Value(jsonValue = jsonValue)
        }

        interface Visitor<out T> {

            fun visitDouble(double: Double): T

            fun visitBoolean(boolean: Boolean): T

            fun visitString(string: String): T

            fun visitJsonValue(jsonValue: JsonValue): T

            fun unknown(json: JsonValue?): T {
                throw LangSmithInvalidDataException("Unknown Value: $json")
            }
        }

        class Deserializer : BaseDeserializer<Value>(Value::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Value {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                    return Value(double = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                    return Value(boolean = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Value(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                    return Value(jsonValue = it, _json = json)
                }

                return Value(_json = json)
            }
        }

        class Serializer : BaseSerializer<Value>(Value::class) {

            override fun serialize(
                value: Value,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.double != null -> generator.writeObject(value.double)
                    value.boolean != null -> generator.writeObject(value.boolean)
                    value.string != null -> generator.writeObject(value.string)
                    value.jsonValue != null -> generator.writeObject(value.jsonValue)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Value")
                }
            }
        }
    }
}
