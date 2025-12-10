// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Request to create a run clustering job. */
class CreateRunClusteringJobRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val attributeSchemas: JsonField<AttributeSchemas>,
    private val endTime: JsonField<OffsetDateTime>,
    private val filter: JsonField<String>,
    private val hierarchy: JsonField<List<Long>>,
    private val lastNHours: JsonField<Long>,
    private val model: JsonField<Model>,
    private val name: JsonField<String>,
    private val partitions: JsonField<Partitions>,
    private val sample: JsonField<Double>,
    private val startTime: JsonField<OffsetDateTime>,
    private val summaryPrompt: JsonField<String>,
    private val userContext: JsonField<UserContext>,
    private val validateModelSecrets: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("attribute_schemas")
        @ExcludeMissing
        attributeSchemas: JsonField<AttributeSchemas> = JsonMissing.of(),
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hierarchy")
        @ExcludeMissing
        hierarchy: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("last_n_hours")
        @ExcludeMissing
        lastNHours: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("partitions")
        @ExcludeMissing
        partitions: JsonField<Partitions> = JsonMissing.of(),
        @JsonProperty("sample") @ExcludeMissing sample: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("summary_prompt")
        @ExcludeMissing
        summaryPrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_context")
        @ExcludeMissing
        userContext: JsonField<UserContext> = JsonMissing.of(),
        @JsonProperty("validate_model_secrets")
        @ExcludeMissing
        validateModelSecrets: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        attributeSchemas,
        endTime,
        filter,
        hierarchy,
        lastNHours,
        model,
        name,
        partitions,
        sample,
        startTime,
        summaryPrompt,
        userContext,
        validateModelSecrets,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attributeSchemas(): Optional<AttributeSchemas> =
        attributeSchemas.getOptional("attribute_schemas")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<String> = filter.getOptional("filter")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hierarchy(): Optional<List<Long>> = hierarchy.getOptional("hierarchy")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastNHours(): Optional<Long> = lastNHours.getOptional("last_n_hours")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<Model> = model.getOptional("model")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun partitions(): Optional<Partitions> = partitions.getOptional("partitions")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sample(): Optional<Double> = sample.getOptional("sample")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun summaryPrompt(): Optional<String> = summaryPrompt.getOptional("summary_prompt")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userContext(): Optional<UserContext> = userContext.getOptional("user_context")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validateModelSecrets(): Optional<Boolean> =
        validateModelSecrets.getOptional("validate_model_secrets")

    /**
     * Returns the raw JSON value of [attributeSchemas].
     *
     * Unlike [attributeSchemas], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("attribute_schemas")
    @ExcludeMissing
    fun _attributeSchemas(): JsonField<AttributeSchemas> = attributeSchemas

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

    /**
     * Returns the raw JSON value of [hierarchy].
     *
     * Unlike [hierarchy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hierarchy") @ExcludeMissing fun _hierarchy(): JsonField<List<Long>> = hierarchy

    /**
     * Returns the raw JSON value of [lastNHours].
     *
     * Unlike [lastNHours], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_n_hours") @ExcludeMissing fun _lastNHours(): JsonField<Long> = lastNHours

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<Model> = model

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [partitions].
     *
     * Unlike [partitions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("partitions")
    @ExcludeMissing
    fun _partitions(): JsonField<Partitions> = partitions

    /**
     * Returns the raw JSON value of [sample].
     *
     * Unlike [sample], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sample") @ExcludeMissing fun _sample(): JsonField<Double> = sample

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [summaryPrompt].
     *
     * Unlike [summaryPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary_prompt")
    @ExcludeMissing
    fun _summaryPrompt(): JsonField<String> = summaryPrompt

    /**
     * Returns the raw JSON value of [userContext].
     *
     * Unlike [userContext], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_context")
    @ExcludeMissing
    fun _userContext(): JsonField<UserContext> = userContext

    /**
     * Returns the raw JSON value of [validateModelSecrets].
     *
     * Unlike [validateModelSecrets], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("validate_model_secrets")
    @ExcludeMissing
    fun _validateModelSecrets(): JsonField<Boolean> = validateModelSecrets

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
         * [CreateRunClusteringJobRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreateRunClusteringJobRequest]. */
    class Builder internal constructor() {

        private var attributeSchemas: JsonField<AttributeSchemas> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var filter: JsonField<String> = JsonMissing.of()
        private var hierarchy: JsonField<MutableList<Long>>? = null
        private var lastNHours: JsonField<Long> = JsonMissing.of()
        private var model: JsonField<Model> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var partitions: JsonField<Partitions> = JsonMissing.of()
        private var sample: JsonField<Double> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var summaryPrompt: JsonField<String> = JsonMissing.of()
        private var userContext: JsonField<UserContext> = JsonMissing.of()
        private var validateModelSecrets: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createRunClusteringJobRequest: CreateRunClusteringJobRequest) = apply {
            attributeSchemas = createRunClusteringJobRequest.attributeSchemas
            endTime = createRunClusteringJobRequest.endTime
            filter = createRunClusteringJobRequest.filter
            hierarchy = createRunClusteringJobRequest.hierarchy.map { it.toMutableList() }
            lastNHours = createRunClusteringJobRequest.lastNHours
            model = createRunClusteringJobRequest.model
            name = createRunClusteringJobRequest.name
            partitions = createRunClusteringJobRequest.partitions
            sample = createRunClusteringJobRequest.sample
            startTime = createRunClusteringJobRequest.startTime
            summaryPrompt = createRunClusteringJobRequest.summaryPrompt
            userContext = createRunClusteringJobRequest.userContext
            validateModelSecrets = createRunClusteringJobRequest.validateModelSecrets
            additionalProperties = createRunClusteringJobRequest.additionalProperties.toMutableMap()
        }

        fun attributeSchemas(attributeSchemas: AttributeSchemas?) =
            attributeSchemas(JsonField.ofNullable(attributeSchemas))

        /** Alias for calling [Builder.attributeSchemas] with `attributeSchemas.orElse(null)`. */
        fun attributeSchemas(attributeSchemas: Optional<AttributeSchemas>) =
            attributeSchemas(attributeSchemas.getOrNull())

        /**
         * Sets [Builder.attributeSchemas] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributeSchemas] with a well-typed [AttributeSchemas]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun attributeSchemas(attributeSchemas: JsonField<AttributeSchemas>) = apply {
            this.attributeSchemas = attributeSchemas
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

        fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

        fun hierarchy(hierarchy: List<Long>?) = hierarchy(JsonField.ofNullable(hierarchy))

        /** Alias for calling [Builder.hierarchy] with `hierarchy.orElse(null)`. */
        fun hierarchy(hierarchy: Optional<List<Long>>) = hierarchy(hierarchy.getOrNull())

        /**
         * Sets [Builder.hierarchy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hierarchy] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hierarchy(hierarchy: JsonField<List<Long>>) = apply {
            this.hierarchy = hierarchy.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [Builder.hierarchy].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHierarchy(hierarchy: Long) = apply {
            this.hierarchy =
                (this.hierarchy ?: JsonField.of(mutableListOf())).also {
                    checkKnown("hierarchy", it).add(hierarchy)
                }
        }

        fun lastNHours(lastNHours: Long?) = lastNHours(JsonField.ofNullable(lastNHours))

        /**
         * Alias for [Builder.lastNHours].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun lastNHours(lastNHours: Long) = lastNHours(lastNHours as Long?)

        /** Alias for calling [Builder.lastNHours] with `lastNHours.orElse(null)`. */
        fun lastNHours(lastNHours: Optional<Long>) = lastNHours(lastNHours.getOrNull())

        /**
         * Sets [Builder.lastNHours] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastNHours] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastNHours(lastNHours: JsonField<Long>) = apply { this.lastNHours = lastNHours }

        fun model(model: Model) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [Model] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<Model>) = apply { this.model = model }

        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun partitions(partitions: Partitions?) = partitions(JsonField.ofNullable(partitions))

        /** Alias for calling [Builder.partitions] with `partitions.orElse(null)`. */
        fun partitions(partitions: Optional<Partitions>) = partitions(partitions.getOrNull())

        /**
         * Sets [Builder.partitions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partitions] with a well-typed [Partitions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun partitions(partitions: JsonField<Partitions>) = apply { this.partitions = partitions }

        fun sample(sample: Double?) = sample(JsonField.ofNullable(sample))

        /**
         * Alias for [Builder.sample].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sample(sample: Double) = sample(sample as Double?)

        /** Alias for calling [Builder.sample] with `sample.orElse(null)`. */
        fun sample(sample: Optional<Double>) = sample(sample.getOrNull())

        /**
         * Sets [Builder.sample] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sample] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sample(sample: JsonField<Double>) = apply { this.sample = sample }

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

        fun summaryPrompt(summaryPrompt: String?) =
            summaryPrompt(JsonField.ofNullable(summaryPrompt))

        /** Alias for calling [Builder.summaryPrompt] with `summaryPrompt.orElse(null)`. */
        fun summaryPrompt(summaryPrompt: Optional<String>) =
            summaryPrompt(summaryPrompt.getOrNull())

        /**
         * Sets [Builder.summaryPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summaryPrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun summaryPrompt(summaryPrompt: JsonField<String>) = apply {
            this.summaryPrompt = summaryPrompt
        }

        fun userContext(userContext: UserContext?) = userContext(JsonField.ofNullable(userContext))

        /** Alias for calling [Builder.userContext] with `userContext.orElse(null)`. */
        fun userContext(userContext: Optional<UserContext>) = userContext(userContext.getOrNull())

        /**
         * Sets [Builder.userContext] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userContext] with a well-typed [UserContext] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun userContext(userContext: JsonField<UserContext>) = apply {
            this.userContext = userContext
        }

        fun validateModelSecrets(validateModelSecrets: Boolean) =
            validateModelSecrets(JsonField.of(validateModelSecrets))

        /**
         * Sets [Builder.validateModelSecrets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validateModelSecrets] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun validateModelSecrets(validateModelSecrets: JsonField<Boolean>) = apply {
            this.validateModelSecrets = validateModelSecrets
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
         * Returns an immutable instance of [CreateRunClusteringJobRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CreateRunClusteringJobRequest =
            CreateRunClusteringJobRequest(
                attributeSchemas,
                endTime,
                filter,
                (hierarchy ?: JsonMissing.of()).map { it.toImmutable() },
                lastNHours,
                model,
                name,
                partitions,
                sample,
                startTime,
                summaryPrompt,
                userContext,
                validateModelSecrets,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CreateRunClusteringJobRequest = apply {
        if (validated) {
            return@apply
        }

        attributeSchemas().ifPresent { it.validate() }
        endTime()
        filter()
        hierarchy()
        lastNHours()
        model().ifPresent { it.validate() }
        name()
        partitions().ifPresent { it.validate() }
        sample()
        startTime()
        summaryPrompt()
        userContext().ifPresent { it.validate() }
        validateModelSecrets()
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
        (attributeSchemas.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (filter.asKnown().isPresent) 1 else 0) +
            (hierarchy.asKnown().getOrNull()?.size ?: 0) +
            (if (lastNHours.asKnown().isPresent) 1 else 0) +
            (model.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (partitions.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sample.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (summaryPrompt.asKnown().isPresent) 1 else 0) +
            (userContext.asKnown().getOrNull()?.validity() ?: 0) +
            (if (validateModelSecrets.asKnown().isPresent) 1 else 0)

    class AttributeSchemas
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

            /** Returns a mutable builder for constructing an instance of [AttributeSchemas]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AttributeSchemas]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(attributeSchemas: AttributeSchemas) = apply {
                additionalProperties = attributeSchemas.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [AttributeSchemas].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AttributeSchemas = AttributeSchemas(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): AttributeSchemas = apply {
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

            return other is AttributeSchemas && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "AttributeSchemas{additionalProperties=$additionalProperties}"
    }

    class Model @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val OPENAI = of("openai")

            @JvmField val ANTHROPIC = of("anthropic")

            @JvmStatic fun of(value: String) = Model(JsonField.of(value))
        }

        /** An enum containing [Model]'s known values. */
        enum class Known {
            OPENAI,
            ANTHROPIC,
        }

        /**
         * An enum containing [Model]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Model] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPENAI,
            ANTHROPIC,
            /** An enum member indicating that [Model] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                OPENAI -> Value.OPENAI
                ANTHROPIC -> Value.ANTHROPIC
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                OPENAI -> Known.OPENAI
                ANTHROPIC -> Known.ANTHROPIC
                else -> throw LangChainInvalidDataException("Unknown Model: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangChainInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Model = apply {
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

            return other is Model && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Partitions
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

            /** Returns a mutable builder for constructing an instance of [Partitions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Partitions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(partitions: Partitions) = apply {
                additionalProperties = partitions.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Partitions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Partitions = Partitions(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Partitions = apply {
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

            return other is Partitions && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Partitions{additionalProperties=$additionalProperties}"
    }

    class UserContext
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

            /** Returns a mutable builder for constructing an instance of [UserContext]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UserContext]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(userContext: UserContext) = apply {
                additionalProperties = userContext.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [UserContext].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UserContext = UserContext(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): UserContext = apply {
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

            return other is UserContext && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "UserContext{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateRunClusteringJobRequest &&
            attributeSchemas == other.attributeSchemas &&
            endTime == other.endTime &&
            filter == other.filter &&
            hierarchy == other.hierarchy &&
            lastNHours == other.lastNHours &&
            model == other.model &&
            name == other.name &&
            partitions == other.partitions &&
            sample == other.sample &&
            startTime == other.startTime &&
            summaryPrompt == other.summaryPrompt &&
            userContext == other.userContext &&
            validateModelSecrets == other.validateModelSecrets &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            attributeSchemas,
            endTime,
            filter,
            hierarchy,
            lastNHours,
            model,
            name,
            partitions,
            sample,
            startTime,
            summaryPrompt,
            userContext,
            validateModelSecrets,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateRunClusteringJobRequest{attributeSchemas=$attributeSchemas, endTime=$endTime, filter=$filter, hierarchy=$hierarchy, lastNHours=$lastNHours, model=$model, name=$name, partitions=$partitions, sample=$sample, startTime=$startTime, summaryPrompt=$summaryPrompt, userContext=$userContext, validateModelSecrets=$validateModelSecrets, additionalProperties=$additionalProperties}"
}
