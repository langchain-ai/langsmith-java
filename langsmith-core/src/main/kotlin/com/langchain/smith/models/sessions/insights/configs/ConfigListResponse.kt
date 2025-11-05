// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights.configs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

/** Response to get clustering job configs. */
class ConfigListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val configs: JsonField<List<Config>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("configs") @ExcludeMissing configs: JsonField<List<Config>> = JsonMissing.of()
    ) : this(configs, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun configs(): List<Config> = configs.getRequired("configs")

    /**
     * Returns the raw JSON value of [configs].
     *
     * Unlike [configs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configs") @ExcludeMissing fun _configs(): JsonField<List<Config>> = configs

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
         * .configs()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConfigListResponse]. */
    class Builder internal constructor() {

        private var configs: JsonField<MutableList<Config>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(configListResponse: ConfigListResponse) = apply {
            configs = configListResponse.configs.map { it.toMutableList() }
            additionalProperties = configListResponse.additionalProperties.toMutableMap()
        }

        fun configs(configs: List<Config>) = configs(JsonField.of(configs))

        /**
         * Sets [Builder.configs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configs] with a well-typed `List<Config>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun configs(configs: JsonField<List<Config>>) = apply {
            this.configs = configs.map { it.toMutableList() }
        }

        /**
         * Adds a single [Config] to [configs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addConfig(config: Config) = apply {
            configs =
                (configs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("configs", it).add(config)
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
         * Returns an immutable instance of [ConfigListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .configs()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConfigListResponse =
            ConfigListResponse(
                checkRequired("configs", configs).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConfigListResponse = apply {
        if (validated) {
            return@apply
        }

        configs().forEach { it.validate() }
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
        (configs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** Full clustering job config with all details. */
    class Config
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val config: JsonField<SavedRunClusteringJobRequest>,
        private val name: JsonField<String>,
        private val prebuilt: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("config")
            @ExcludeMissing
            config: JsonField<SavedRunClusteringJobRequest> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prebuilt")
            @ExcludeMissing
            prebuilt: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
        ) : this(id, config, name, prebuilt, description, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Request to create a run clustering job.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun config(): SavedRunClusteringJobRequest = config.getRequired("config")

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
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

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
        @JsonProperty("config")
        @ExcludeMissing
        fun _config(): JsonField<SavedRunClusteringJobRequest> = config

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
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
             * .id()
             * .config()
             * .name()
             * .prebuilt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Config]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var config: JsonField<SavedRunClusteringJobRequest>? = null
            private var name: JsonField<String>? = null
            private var prebuilt: JsonField<Boolean>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(config: Config) = apply {
                id = config.id
                this.config = config.config
                name = config.name
                prebuilt = config.prebuilt
                description = config.description
                additionalProperties = config.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Request to create a run clustering job. */
            fun config(config: SavedRunClusteringJobRequest) = config(JsonField.of(config))

            /**
             * Sets [Builder.config] to an arbitrary JSON value.
             *
             * You should usually call [Builder.config] with a well-typed
             * [SavedRunClusteringJobRequest] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun config(config: JsonField<SavedRunClusteringJobRequest>) = apply {
                this.config = config
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun prebuilt(prebuilt: Boolean) = prebuilt(JsonField.of(prebuilt))

            /**
             * Sets [Builder.prebuilt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prebuilt] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prebuilt(prebuilt: JsonField<Boolean>) = apply { this.prebuilt = prebuilt }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
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
             * .id()
             * .config()
             * .name()
             * .prebuilt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Config =
                Config(
                    checkRequired("id", id),
                    checkRequired("config", config),
                    checkRequired("name", name),
                    checkRequired("prebuilt", prebuilt),
                    description,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Config = apply {
            if (validated) {
                return@apply
            }

            id()
            config().validate()
            name()
            prebuilt()
            description()
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
                (config.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (prebuilt.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Config &&
                id == other.id &&
                config == other.config &&
                name == other.name &&
                prebuilt == other.prebuilt &&
                description == other.description &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, config, name, prebuilt, description, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Config{id=$id, config=$config, name=$name, prebuilt=$prebuilt, description=$description, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConfigListResponse &&
            configs == other.configs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(configs, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConfigListResponse{configs=$configs, additionalProperties=$additionalProperties}"
}
