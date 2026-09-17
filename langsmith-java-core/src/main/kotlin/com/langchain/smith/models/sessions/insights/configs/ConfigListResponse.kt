// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights.configs

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
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** An Insights job configuration. */
class ConfigListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val config: JsonField<Config>,
    private val name: JsonField<String>,
    private val prebuilt: JsonField<Boolean>,
    private val description: JsonField<String>,
    private val scheduleCron: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("config") @ExcludeMissing config: JsonField<Config> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prebuilt") @ExcludeMissing prebuilt: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("schedule_cron")
        @ExcludeMissing
        scheduleCron: JsonField<String> = JsonMissing.of(),
    ) : this(id, config, name, prebuilt, description, scheduleCron, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Saved configuration for an Insights job.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun config(): Config = config.getRequired("config")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prebuilt(): Boolean = prebuilt.getRequired("prebuilt")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduleCron(): Optional<String> = scheduleCron.getOptional("schedule_cron")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [prebuilt].
     *
     * Unlike [prebuilt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prebuilt") @ExcludeMissing fun _prebuilt(): JsonField<Boolean> = prebuilt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [scheduleCron].
     *
     * Unlike [scheduleCron], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("schedule_cron")
    @ExcludeMissing
    fun _scheduleCron(): JsonField<String> = scheduleCron

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
         * Returns a mutable builder for constructing an instance of [ConfigListResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .config()
         * .name()
         * .prebuilt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConfigListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var config: JsonField<Config>? = null
        private var name: JsonField<String>? = null
        private var prebuilt: JsonField<Boolean>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var scheduleCron: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(configListResponse: ConfigListResponse) = apply {
            id = configListResponse.id
            config = configListResponse.config
            name = configListResponse.name
            prebuilt = configListResponse.prebuilt
            description = configListResponse.description
            scheduleCron = configListResponse.scheduleCron
            additionalProperties = configListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Saved configuration for an Insights job. */
        fun config(config: Config) = config(JsonField.of(config))

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed [Config] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun config(config: JsonField<Config>) = apply { this.config = config }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun prebuilt(prebuilt: Boolean) = prebuilt(JsonField.of(prebuilt))

        /**
         * Sets [Builder.prebuilt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prebuilt] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prebuilt(prebuilt: JsonField<Boolean>) = apply { this.prebuilt = prebuilt }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun scheduleCron(scheduleCron: String?) = scheduleCron(JsonField.ofNullable(scheduleCron))

        /** Alias for calling [Builder.scheduleCron] with `scheduleCron.orElse(null)`. */
        fun scheduleCron(scheduleCron: Optional<String>) = scheduleCron(scheduleCron.getOrNull())

        /**
         * Sets [Builder.scheduleCron] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduleCron] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scheduleCron(scheduleCron: JsonField<String>) = apply {
            this.scheduleCron = scheduleCron
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
         * Returns an immutable instance of [ConfigListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .config()
         * .name()
         * .prebuilt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConfigListResponse =
            ConfigListResponse(
                checkRequired("id", id),
                checkRequired("config", config),
                checkRequired("name", name),
                checkRequired("prebuilt", prebuilt),
                description,
                scheduleCron,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LangChainInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ConfigListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        config().validate()
        name()
        prebuilt()
        description()
        scheduleCron()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (config.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (prebuilt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (scheduleCron.asKnown().isPresent) 1 else 0)

    /** Saved configuration for an Insights job. */
    class Config
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val attributeSchemas: JsonField<AttributeSchemas>,
        private val filter: JsonField<String>,
        private val hierarchy: JsonField<List<Long>>,
        private val model: JsonField<Model>,
        private val name: JsonField<String>,
        private val partitions: JsonField<Partitions>,
        private val sample: JsonField<Double>,
        private val summaryPrompt: JsonField<String>,
        private val clusterModel: JsonField<String>,
        private val endTime: JsonField<String>,
        private val lastNHours: JsonField<Long>,
        private val startTime: JsonField<String>,
        private val summaryModel: JsonField<String>,
        private val userContext: JsonField<UserContext>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attribute_schemas")
            @ExcludeMissing
            attributeSchemas: JsonField<AttributeSchemas> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hierarchy")
            @ExcludeMissing
            hierarchy: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("partitions")
            @ExcludeMissing
            partitions: JsonField<Partitions> = JsonMissing.of(),
            @JsonProperty("sample") @ExcludeMissing sample: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("summary_prompt")
            @ExcludeMissing
            summaryPrompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cluster_model")
            @ExcludeMissing
            clusterModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_time") @ExcludeMissing endTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_n_hours")
            @ExcludeMissing
            lastNHours: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("summary_model")
            @ExcludeMissing
            summaryModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_context")
            @ExcludeMissing
            userContext: JsonField<UserContext> = JsonMissing.of(),
        ) : this(
            attributeSchemas,
            filter,
            hierarchy,
            model,
            name,
            partitions,
            sample,
            summaryPrompt,
            clusterModel,
            endTime,
            lastNHours,
            startTime,
            summaryModel,
            userContext,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun attributeSchemas(): Optional<AttributeSchemas> =
            attributeSchemas.getOptional("attribute_schemas")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filter(): Optional<String> = filter.getOptional("filter")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun hierarchy(): Optional<List<Long>> = hierarchy.getOptional("hierarchy")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): Model = model.getRequired("model")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun partitions(): Optional<Partitions> = partitions.getOptional("partitions")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sample(): Optional<Double> = sample.getOptional("sample")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun summaryPrompt(): Optional<String> = summaryPrompt.getOptional("summary_prompt")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun clusterModel(): Optional<String> = clusterModel.getOptional("cluster_model")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endTime(): Optional<String> = endTime.getOptional("end_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lastNHours(): Optional<Long> = lastNHours.getOptional("last_n_hours")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startTime(): Optional<String> = startTime.getOptional("start_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun summaryModel(): Optional<String> = summaryModel.getOptional("summary_model")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun userContext(): Optional<UserContext> = userContext.getOptional("user_context")

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
        @JsonProperty("hierarchy")
        @ExcludeMissing
        fun _hierarchy(): JsonField<List<Long>> = hierarchy

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
         * Returns the raw JSON value of [summaryPrompt].
         *
         * Unlike [summaryPrompt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("summary_prompt")
        @ExcludeMissing
        fun _summaryPrompt(): JsonField<String> = summaryPrompt

        /**
         * Returns the raw JSON value of [clusterModel].
         *
         * Unlike [clusterModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cluster_model")
        @ExcludeMissing
        fun _clusterModel(): JsonField<String> = clusterModel

        /**
         * Returns the raw JSON value of [endTime].
         *
         * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<String> = endTime

        /**
         * Returns the raw JSON value of [lastNHours].
         *
         * Unlike [lastNHours], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_n_hours")
        @ExcludeMissing
        fun _lastNHours(): JsonField<Long> = lastNHours

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time") @ExcludeMissing fun _startTime(): JsonField<String> = startTime

        /**
         * Returns the raw JSON value of [summaryModel].
         *
         * Unlike [summaryModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("summary_model")
        @ExcludeMissing
        fun _summaryModel(): JsonField<String> = summaryModel

        /**
         * Returns the raw JSON value of [userContext].
         *
         * Unlike [userContext], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_context")
        @ExcludeMissing
        fun _userContext(): JsonField<UserContext> = userContext

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
             * Returns a mutable builder for constructing an instance of [Config].
             *
             * The following fields are required:
             * ```java
             * .attributeSchemas()
             * .filter()
             * .hierarchy()
             * .model()
             * .name()
             * .partitions()
             * .sample()
             * .summaryPrompt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Config]. */
        class Builder internal constructor() {

            private var attributeSchemas: JsonField<AttributeSchemas>? = null
            private var filter: JsonField<String>? = null
            private var hierarchy: JsonField<MutableList<Long>>? = null
            private var model: JsonField<Model>? = null
            private var name: JsonField<String>? = null
            private var partitions: JsonField<Partitions>? = null
            private var sample: JsonField<Double>? = null
            private var summaryPrompt: JsonField<String>? = null
            private var clusterModel: JsonField<String> = JsonMissing.of()
            private var endTime: JsonField<String> = JsonMissing.of()
            private var lastNHours: JsonField<Long> = JsonMissing.of()
            private var startTime: JsonField<String> = JsonMissing.of()
            private var summaryModel: JsonField<String> = JsonMissing.of()
            private var userContext: JsonField<UserContext> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(config: Config) = apply {
                attributeSchemas = config.attributeSchemas
                filter = config.filter
                hierarchy = config.hierarchy.map { it.toMutableList() }
                model = config.model
                name = config.name
                partitions = config.partitions
                sample = config.sample
                summaryPrompt = config.summaryPrompt
                clusterModel = config.clusterModel
                endTime = config.endTime
                lastNHours = config.lastNHours
                startTime = config.startTime
                summaryModel = config.summaryModel
                userContext = config.userContext
                additionalProperties = config.additionalProperties.toMutableMap()
            }

            fun attributeSchemas(attributeSchemas: AttributeSchemas?) =
                attributeSchemas(JsonField.ofNullable(attributeSchemas))

            /**
             * Alias for calling [Builder.attributeSchemas] with `attributeSchemas.orElse(null)`.
             */
            fun attributeSchemas(attributeSchemas: Optional<AttributeSchemas>) =
                attributeSchemas(attributeSchemas.getOrNull())

            /**
             * Sets [Builder.attributeSchemas] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attributeSchemas] with a well-typed
             * [AttributeSchemas] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun attributeSchemas(attributeSchemas: JsonField<AttributeSchemas>) = apply {
                this.attributeSchemas = attributeSchemas
            }

            fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

            /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
            fun filter(filter: Optional<String>) = filter(filter.getOrNull())

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            fun hierarchy(hierarchy: List<Long>?) = hierarchy(JsonField.ofNullable(hierarchy))

            /** Alias for calling [Builder.hierarchy] with `hierarchy.orElse(null)`. */
            fun hierarchy(hierarchy: Optional<List<Long>>) = hierarchy(hierarchy.getOrNull())

            /**
             * Sets [Builder.hierarchy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hierarchy] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun model(model: Model) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [Model] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun model(model: JsonField<Model>) = apply { this.model = model }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
            fun partitions(partitions: JsonField<Partitions>) = apply {
                this.partitions = partitions
            }

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
             * You should usually call [Builder.sample] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sample(sample: JsonField<Double>) = apply { this.sample = sample }

            fun summaryPrompt(summaryPrompt: String?) =
                summaryPrompt(JsonField.ofNullable(summaryPrompt))

            /** Alias for calling [Builder.summaryPrompt] with `summaryPrompt.orElse(null)`. */
            fun summaryPrompt(summaryPrompt: Optional<String>) =
                summaryPrompt(summaryPrompt.getOrNull())

            /**
             * Sets [Builder.summaryPrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summaryPrompt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summaryPrompt(summaryPrompt: JsonField<String>) = apply {
                this.summaryPrompt = summaryPrompt
            }

            fun clusterModel(clusterModel: String?) =
                clusterModel(JsonField.ofNullable(clusterModel))

            /** Alias for calling [Builder.clusterModel] with `clusterModel.orElse(null)`. */
            fun clusterModel(clusterModel: Optional<String>) =
                clusterModel(clusterModel.getOrNull())

            /**
             * Sets [Builder.clusterModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clusterModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clusterModel(clusterModel: JsonField<String>) = apply {
                this.clusterModel = clusterModel
            }

            fun endTime(endTime: String?) = endTime(JsonField.ofNullable(endTime))

            /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
            fun endTime(endTime: Optional<String>) = endTime(endTime.getOrNull())

            /**
             * Sets [Builder.endTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endTime(endTime: JsonField<String>) = apply { this.endTime = endTime }

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
             * You should usually call [Builder.lastNHours] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastNHours(lastNHours: JsonField<Long>) = apply { this.lastNHours = lastNHours }

            fun startTime(startTime: String?) = startTime(JsonField.ofNullable(startTime))

            /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
            fun startTime(startTime: Optional<String>) = startTime(startTime.getOrNull())

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<String>) = apply { this.startTime = startTime }

            fun summaryModel(summaryModel: String?) =
                summaryModel(JsonField.ofNullable(summaryModel))

            /** Alias for calling [Builder.summaryModel] with `summaryModel.orElse(null)`. */
            fun summaryModel(summaryModel: Optional<String>) =
                summaryModel(summaryModel.getOrNull())

            /**
             * Sets [Builder.summaryModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summaryModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summaryModel(summaryModel: JsonField<String>) = apply {
                this.summaryModel = summaryModel
            }

            fun userContext(userContext: UserContext?) =
                userContext(JsonField.ofNullable(userContext))

            /** Alias for calling [Builder.userContext] with `userContext.orElse(null)`. */
            fun userContext(userContext: Optional<UserContext>) =
                userContext(userContext.getOrNull())

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
             * Returns an immutable instance of [Config].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .attributeSchemas()
             * .filter()
             * .hierarchy()
             * .model()
             * .name()
             * .partitions()
             * .sample()
             * .summaryPrompt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Config =
                Config(
                    checkRequired("attributeSchemas", attributeSchemas),
                    checkRequired("filter", filter),
                    checkRequired("hierarchy", hierarchy).map { it.toImmutable() },
                    checkRequired("model", model),
                    checkRequired("name", name),
                    checkRequired("partitions", partitions),
                    checkRequired("sample", sample),
                    checkRequired("summaryPrompt", summaryPrompt),
                    clusterModel,
                    endTime,
                    lastNHours,
                    startTime,
                    summaryModel,
                    userContext,
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
        fun validate(): Config = apply {
            if (validated) {
                return@apply
            }

            attributeSchemas().ifPresent { it.validate() }
            filter()
            hierarchy()
            model().validate()
            name()
            partitions().ifPresent { it.validate() }
            sample()
            summaryPrompt()
            clusterModel()
            endTime()
            lastNHours()
            startTime()
            summaryModel()
            userContext().ifPresent { it.validate() }
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
            (attributeSchemas.asKnown().getOrNull()?.validity() ?: 0) +
                (if (filter.asKnown().isPresent) 1 else 0) +
                (hierarchy.asKnown().getOrNull()?.size ?: 0) +
                (model.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (partitions.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sample.asKnown().isPresent) 1 else 0) +
                (if (summaryPrompt.asKnown().isPresent) 1 else 0) +
                (if (clusterModel.asKnown().isPresent) 1 else 0) +
                (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (lastNHours.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (if (summaryModel.asKnown().isPresent) 1 else 0) +
                (userContext.asKnown().getOrNull()?.validity() ?: 0)

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
                 * Returns an immutable instance of [AttributeSchemas].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AttributeSchemas = AttributeSchemas(additionalProperties.toImmutable())
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

                return other is AttributeSchemas &&
                    additionalProperties == other.additionalProperties
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
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                OPENAI,
                ANTHROPIC,
                /**
                 * An enum member indicating that [Model] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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
                 * Returns an immutable instance of [Partitions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Partitions = Partitions(additionalProperties.toImmutable())
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
                 * Returns an immutable instance of [UserContext].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UserContext = UserContext(additionalProperties.toImmutable())
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

            return other is Config &&
                attributeSchemas == other.attributeSchemas &&
                filter == other.filter &&
                hierarchy == other.hierarchy &&
                model == other.model &&
                name == other.name &&
                partitions == other.partitions &&
                sample == other.sample &&
                summaryPrompt == other.summaryPrompt &&
                clusterModel == other.clusterModel &&
                endTime == other.endTime &&
                lastNHours == other.lastNHours &&
                startTime == other.startTime &&
                summaryModel == other.summaryModel &&
                userContext == other.userContext &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                attributeSchemas,
                filter,
                hierarchy,
                model,
                name,
                partitions,
                sample,
                summaryPrompt,
                clusterModel,
                endTime,
                lastNHours,
                startTime,
                summaryModel,
                userContext,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Config{attributeSchemas=$attributeSchemas, filter=$filter, hierarchy=$hierarchy, model=$model, name=$name, partitions=$partitions, sample=$sample, summaryPrompt=$summaryPrompt, clusterModel=$clusterModel, endTime=$endTime, lastNHours=$lastNHours, startTime=$startTime, summaryModel=$summaryModel, userContext=$userContext, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConfigListResponse &&
            id == other.id &&
            config == other.config &&
            name == other.name &&
            prebuilt == other.prebuilt &&
            description == other.description &&
            scheduleCron == other.scheduleCron &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, config, name, prebuilt, description, scheduleCron, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConfigListResponse{id=$id, config=$config, name=$name, prebuilt=$prebuilt, description=$description, scheduleCron=$scheduleCron, additionalProperties=$additionalProperties}"
}
