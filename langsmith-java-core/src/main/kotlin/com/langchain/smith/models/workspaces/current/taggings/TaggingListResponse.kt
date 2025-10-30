// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.taggings

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
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TaggingListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val resources: JsonField<Resources>,
    private val tagKey: JsonField<String>,
    private val tagKeyId: JsonField<String>,
    private val tagValue: JsonField<String>,
    private val tagValueId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("resources")
        @ExcludeMissing
        resources: JsonField<Resources> = JsonMissing.of(),
        @JsonProperty("tag_key") @ExcludeMissing tagKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tag_key_id") @ExcludeMissing tagKeyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tag_value") @ExcludeMissing tagValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tag_value_id")
        @ExcludeMissing
        tagValueId: JsonField<String> = JsonMissing.of(),
    ) : this(resources, tagKey, tagKeyId, tagValue, tagValueId, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun resources(): Resources = resources.getRequired("resources")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tagKey(): String = tagKey.getRequired("tag_key")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tagKeyId(): String = tagKeyId.getRequired("tag_key_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tagValue(): String = tagValue.getRequired("tag_value")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tagValueId(): String = tagValueId.getRequired("tag_value_id")

    /**
     * Returns the raw JSON value of [resources].
     *
     * Unlike [resources], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resources") @ExcludeMissing fun _resources(): JsonField<Resources> = resources

    /**
     * Returns the raw JSON value of [tagKey].
     *
     * Unlike [tagKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tag_key") @ExcludeMissing fun _tagKey(): JsonField<String> = tagKey

    /**
     * Returns the raw JSON value of [tagKeyId].
     *
     * Unlike [tagKeyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tag_key_id") @ExcludeMissing fun _tagKeyId(): JsonField<String> = tagKeyId

    /**
     * Returns the raw JSON value of [tagValue].
     *
     * Unlike [tagValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tag_value") @ExcludeMissing fun _tagValue(): JsonField<String> = tagValue

    /**
     * Returns the raw JSON value of [tagValueId].
     *
     * Unlike [tagValueId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tag_value_id") @ExcludeMissing fun _tagValueId(): JsonField<String> = tagValueId

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
         * Returns a mutable builder for constructing an instance of [TaggingListResponse].
         *
         * The following fields are required:
         * ```java
         * .resources()
         * .tagKey()
         * .tagKeyId()
         * .tagValue()
         * .tagValueId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TaggingListResponse]. */
    class Builder internal constructor() {

        private var resources: JsonField<Resources>? = null
        private var tagKey: JsonField<String>? = null
        private var tagKeyId: JsonField<String>? = null
        private var tagValue: JsonField<String>? = null
        private var tagValueId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(taggingListResponse: TaggingListResponse) = apply {
            resources = taggingListResponse.resources
            tagKey = taggingListResponse.tagKey
            tagKeyId = taggingListResponse.tagKeyId
            tagValue = taggingListResponse.tagValue
            tagValueId = taggingListResponse.tagValueId
            additionalProperties = taggingListResponse.additionalProperties.toMutableMap()
        }

        fun resources(resources: Resources) = resources(JsonField.of(resources))

        /**
         * Sets [Builder.resources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resources] with a well-typed [Resources] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resources(resources: JsonField<Resources>) = apply { this.resources = resources }

        fun tagKey(tagKey: String) = tagKey(JsonField.of(tagKey))

        /**
         * Sets [Builder.tagKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tagKey(tagKey: JsonField<String>) = apply { this.tagKey = tagKey }

        fun tagKeyId(tagKeyId: String) = tagKeyId(JsonField.of(tagKeyId))

        /**
         * Sets [Builder.tagKeyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagKeyId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tagKeyId(tagKeyId: JsonField<String>) = apply { this.tagKeyId = tagKeyId }

        fun tagValue(tagValue: String) = tagValue(JsonField.of(tagValue))

        /**
         * Sets [Builder.tagValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagValue] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tagValue(tagValue: JsonField<String>) = apply { this.tagValue = tagValue }

        fun tagValueId(tagValueId: String) = tagValueId(JsonField.of(tagValueId))

        /**
         * Sets [Builder.tagValueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagValueId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tagValueId(tagValueId: JsonField<String>) = apply { this.tagValueId = tagValueId }

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
         * Returns an immutable instance of [TaggingListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .resources()
         * .tagKey()
         * .tagKeyId()
         * .tagValue()
         * .tagValueId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TaggingListResponse =
            TaggingListResponse(
                checkRequired("resources", resources),
                checkRequired("tagKey", tagKey),
                checkRequired("tagKeyId", tagKeyId),
                checkRequired("tagValue", tagValue),
                checkRequired("tagValueId", tagValueId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TaggingListResponse = apply {
        if (validated) {
            return@apply
        }

        resources().validate()
        tagKey()
        tagKeyId()
        tagValue()
        tagValueId()
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
        (resources.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tagKey.asKnown().isPresent) 1 else 0) +
            (if (tagKeyId.asKnown().isPresent) 1 else 0) +
            (if (tagValue.asKnown().isPresent) 1 else 0) +
            (if (tagValueId.asKnown().isPresent) 1 else 0)

    class Resources
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dashboards: JsonField<List<Resource>>,
        private val datasets: JsonField<List<Resource>>,
        private val deployments: JsonField<List<Resource>>,
        private val experiments: JsonField<List<Resource>>,
        private val projects: JsonField<List<Resource>>,
        private val prompts: JsonField<List<Resource>>,
        private val queues: JsonField<List<Resource>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dashboards")
            @ExcludeMissing
            dashboards: JsonField<List<Resource>> = JsonMissing.of(),
            @JsonProperty("datasets")
            @ExcludeMissing
            datasets: JsonField<List<Resource>> = JsonMissing.of(),
            @JsonProperty("deployments")
            @ExcludeMissing
            deployments: JsonField<List<Resource>> = JsonMissing.of(),
            @JsonProperty("experiments")
            @ExcludeMissing
            experiments: JsonField<List<Resource>> = JsonMissing.of(),
            @JsonProperty("projects")
            @ExcludeMissing
            projects: JsonField<List<Resource>> = JsonMissing.of(),
            @JsonProperty("prompts")
            @ExcludeMissing
            prompts: JsonField<List<Resource>> = JsonMissing.of(),
            @JsonProperty("queues")
            @ExcludeMissing
            queues: JsonField<List<Resource>> = JsonMissing.of(),
        ) : this(
            dashboards,
            datasets,
            deployments,
            experiments,
            projects,
            prompts,
            queues,
            mutableMapOf(),
        )

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dashboards(): Optional<List<Resource>> = dashboards.getOptional("dashboards")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun datasets(): Optional<List<Resource>> = datasets.getOptional("datasets")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun deployments(): Optional<List<Resource>> = deployments.getOptional("deployments")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun experiments(): Optional<List<Resource>> = experiments.getOptional("experiments")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun projects(): Optional<List<Resource>> = projects.getOptional("projects")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun prompts(): Optional<List<Resource>> = prompts.getOptional("prompts")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun queues(): Optional<List<Resource>> = queues.getOptional("queues")

        /**
         * Returns the raw JSON value of [dashboards].
         *
         * Unlike [dashboards], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dashboards")
        @ExcludeMissing
        fun _dashboards(): JsonField<List<Resource>> = dashboards

        /**
         * Returns the raw JSON value of [datasets].
         *
         * Unlike [datasets], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("datasets")
        @ExcludeMissing
        fun _datasets(): JsonField<List<Resource>> = datasets

        /**
         * Returns the raw JSON value of [deployments].
         *
         * Unlike [deployments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deployments")
        @ExcludeMissing
        fun _deployments(): JsonField<List<Resource>> = deployments

        /**
         * Returns the raw JSON value of [experiments].
         *
         * Unlike [experiments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("experiments")
        @ExcludeMissing
        fun _experiments(): JsonField<List<Resource>> = experiments

        /**
         * Returns the raw JSON value of [projects].
         *
         * Unlike [projects], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("projects")
        @ExcludeMissing
        fun _projects(): JsonField<List<Resource>> = projects

        /**
         * Returns the raw JSON value of [prompts].
         *
         * Unlike [prompts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompts") @ExcludeMissing fun _prompts(): JsonField<List<Resource>> = prompts

        /**
         * Returns the raw JSON value of [queues].
         *
         * Unlike [queues], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("queues") @ExcludeMissing fun _queues(): JsonField<List<Resource>> = queues

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

            /** Returns a mutable builder for constructing an instance of [Resources]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Resources]. */
        class Builder internal constructor() {

            private var dashboards: JsonField<MutableList<Resource>>? = null
            private var datasets: JsonField<MutableList<Resource>>? = null
            private var deployments: JsonField<MutableList<Resource>>? = null
            private var experiments: JsonField<MutableList<Resource>>? = null
            private var projects: JsonField<MutableList<Resource>>? = null
            private var prompts: JsonField<MutableList<Resource>>? = null
            private var queues: JsonField<MutableList<Resource>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resources: Resources) = apply {
                dashboards = resources.dashboards.map { it.toMutableList() }
                datasets = resources.datasets.map { it.toMutableList() }
                deployments = resources.deployments.map { it.toMutableList() }
                experiments = resources.experiments.map { it.toMutableList() }
                projects = resources.projects.map { it.toMutableList() }
                prompts = resources.prompts.map { it.toMutableList() }
                queues = resources.queues.map { it.toMutableList() }
                additionalProperties = resources.additionalProperties.toMutableMap()
            }

            fun dashboards(dashboards: List<Resource>) = dashboards(JsonField.of(dashboards))

            /**
             * Sets [Builder.dashboards] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dashboards] with a well-typed `List<Resource>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dashboards(dashboards: JsonField<List<Resource>>) = apply {
                this.dashboards = dashboards.map { it.toMutableList() }
            }

            /**
             * Adds a single [Resource] to [dashboards].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDashboard(dashboard: Resource) = apply {
                dashboards =
                    (dashboards ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dashboards", it).add(dashboard)
                    }
            }

            fun datasets(datasets: List<Resource>) = datasets(JsonField.of(datasets))

            /**
             * Sets [Builder.datasets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasets] with a well-typed `List<Resource>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datasets(datasets: JsonField<List<Resource>>) = apply {
                this.datasets = datasets.map { it.toMutableList() }
            }

            /**
             * Adds a single [Resource] to [datasets].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDataset(dataset: Resource) = apply {
                datasets =
                    (datasets ?: JsonField.of(mutableListOf())).also {
                        checkKnown("datasets", it).add(dataset)
                    }
            }

            fun deployments(deployments: List<Resource>) = deployments(JsonField.of(deployments))

            /**
             * Sets [Builder.deployments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deployments] with a well-typed `List<Resource>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun deployments(deployments: JsonField<List<Resource>>) = apply {
                this.deployments = deployments.map { it.toMutableList() }
            }

            /**
             * Adds a single [Resource] to [deployments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDeployment(deployment: Resource) = apply {
                deployments =
                    (deployments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("deployments", it).add(deployment)
                    }
            }

            fun experiments(experiments: List<Resource>) = experiments(JsonField.of(experiments))

            /**
             * Sets [Builder.experiments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.experiments] with a well-typed `List<Resource>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun experiments(experiments: JsonField<List<Resource>>) = apply {
                this.experiments = experiments.map { it.toMutableList() }
            }

            /**
             * Adds a single [Resource] to [experiments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExperiment(experiment: Resource) = apply {
                experiments =
                    (experiments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("experiments", it).add(experiment)
                    }
            }

            fun projects(projects: List<Resource>) = projects(JsonField.of(projects))

            /**
             * Sets [Builder.projects] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projects] with a well-typed `List<Resource>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projects(projects: JsonField<List<Resource>>) = apply {
                this.projects = projects.map { it.toMutableList() }
            }

            /**
             * Adds a single [Resource] to [projects].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProject(project: Resource) = apply {
                projects =
                    (projects ?: JsonField.of(mutableListOf())).also {
                        checkKnown("projects", it).add(project)
                    }
            }

            fun prompts(prompts: List<Resource>) = prompts(JsonField.of(prompts))

            /**
             * Sets [Builder.prompts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prompts] with a well-typed `List<Resource>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prompts(prompts: JsonField<List<Resource>>) = apply {
                this.prompts = prompts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Resource] to [prompts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPrompt(prompt: Resource) = apply {
                prompts =
                    (prompts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("prompts", it).add(prompt)
                    }
            }

            fun queues(queues: List<Resource>) = queues(JsonField.of(queues))

            /**
             * Sets [Builder.queues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.queues] with a well-typed `List<Resource>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun queues(queues: JsonField<List<Resource>>) = apply {
                this.queues = queues.map { it.toMutableList() }
            }

            /**
             * Adds a single [Resource] to [queues].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addQueue(queue: Resource) = apply {
                queues =
                    (queues ?: JsonField.of(mutableListOf())).also {
                        checkKnown("queues", it).add(queue)
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
             * Returns an immutable instance of [Resources].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Resources =
                Resources(
                    (dashboards ?: JsonMissing.of()).map { it.toImmutable() },
                    (datasets ?: JsonMissing.of()).map { it.toImmutable() },
                    (deployments ?: JsonMissing.of()).map { it.toImmutable() },
                    (experiments ?: JsonMissing.of()).map { it.toImmutable() },
                    (projects ?: JsonMissing.of()).map { it.toImmutable() },
                    (prompts ?: JsonMissing.of()).map { it.toImmutable() },
                    (queues ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Resources = apply {
            if (validated) {
                return@apply
            }

            dashboards().ifPresent { it.forEach { it.validate() } }
            datasets().ifPresent { it.forEach { it.validate() } }
            deployments().ifPresent { it.forEach { it.validate() } }
            experiments().ifPresent { it.forEach { it.validate() } }
            projects().ifPresent { it.forEach { it.validate() } }
            prompts().ifPresent { it.forEach { it.validate() } }
            queues().ifPresent { it.forEach { it.validate() } }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (dashboards.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (datasets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (deployments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (experiments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (projects.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (prompts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (queues.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Resources &&
                dashboards == other.dashboards &&
                datasets == other.datasets &&
                deployments == other.deployments &&
                experiments == other.experiments &&
                projects == other.projects &&
                prompts == other.prompts &&
                queues == other.queues &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                dashboards,
                datasets,
                deployments,
                experiments,
                projects,
                prompts,
                queues,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Resources{dashboards=$dashboards, datasets=$datasets, deployments=$deployments, experiments=$experiments, projects=$projects, prompts=$prompts, queues=$queues, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TaggingListResponse &&
            resources == other.resources &&
            tagKey == other.tagKey &&
            tagKeyId == other.tagKeyId &&
            tagValue == other.tagValue &&
            tagValueId == other.tagValueId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(resources, tagKey, tagKeyId, tagValue, tagValueId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TaggingListResponse{resources=$resources, tagKey=$tagKey, tagKeyId=$tagKeyId, tagValue=$tagValue, tagValueId=$tagValueId, additionalProperties=$additionalProperties}"
}
