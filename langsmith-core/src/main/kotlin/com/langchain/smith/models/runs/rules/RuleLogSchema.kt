// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs.rules

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Run rules log schema. */
class RuleLogSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val endTime: JsonField<OffsetDateTime>,
    private val ruleId: JsonField<String>,
    private val runId: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val addToAnnotationQueue: JsonField<RuleLogActionResponse>,
    private val addToDataset: JsonField<RuleLogActionResponse>,
    private val alerts: JsonField<RuleLogActionResponse>,
    private val applicationTime: JsonField<OffsetDateTime>,
    private val evaluators: JsonField<RuleLogActionResponse>,
    private val runName: JsonField<String>,
    private val runSessionId: JsonField<String>,
    private val runType: JsonField<String>,
    private val threadId: JsonField<String>,
    private val webhooks: JsonField<RuleLogActionResponse>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("rule_id") @ExcludeMissing ruleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("add_to_annotation_queue")
        @ExcludeMissing
        addToAnnotationQueue: JsonField<RuleLogActionResponse> = JsonMissing.of(),
        @JsonProperty("add_to_dataset")
        @ExcludeMissing
        addToDataset: JsonField<RuleLogActionResponse> = JsonMissing.of(),
        @JsonProperty("alerts")
        @ExcludeMissing
        alerts: JsonField<RuleLogActionResponse> = JsonMissing.of(),
        @JsonProperty("application_time")
        @ExcludeMissing
        applicationTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("evaluators")
        @ExcludeMissing
        evaluators: JsonField<RuleLogActionResponse> = JsonMissing.of(),
        @JsonProperty("run_name") @ExcludeMissing runName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("run_session_id")
        @ExcludeMissing
        runSessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("run_type") @ExcludeMissing runType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("thread_id") @ExcludeMissing threadId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhooks")
        @ExcludeMissing
        webhooks: JsonField<RuleLogActionResponse> = JsonMissing.of(),
    ) : this(
        endTime,
        ruleId,
        runId,
        startTime,
        addToAnnotationQueue,
        addToDataset,
        alerts,
        applicationTime,
        evaluators,
        runName,
        runSessionId,
        runType,
        threadId,
        webhooks,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endTime(): OffsetDateTime = endTime.getRequired("end_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ruleId(): String = ruleId.getRequired("rule_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runId(): String = runId.getRequired("run_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = startTime.getRequired("start_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addToAnnotationQueue(): Optional<RuleLogActionResponse> =
        addToAnnotationQueue.getOptional("add_to_annotation_queue")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addToDataset(): Optional<RuleLogActionResponse> = addToDataset.getOptional("add_to_dataset")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alerts(): Optional<RuleLogActionResponse> = alerts.getOptional("alerts")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applicationTime(): Optional<OffsetDateTime> =
        applicationTime.getOptional("application_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluators(): Optional<RuleLogActionResponse> = evaluators.getOptional("evaluators")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runName(): Optional<String> = runName.getOptional("run_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runSessionId(): Optional<String> = runSessionId.getOptional("run_session_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runType(): Optional<String> = runType.getOptional("run_type")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadId(): Optional<String> = threadId.getOptional("thread_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhooks(): Optional<RuleLogActionResponse> = webhooks.getOptional("webhooks")

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [ruleId].
     *
     * Unlike [ruleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rule_id") @ExcludeMissing fun _ruleId(): JsonField<String> = ruleId

    /**
     * Returns the raw JSON value of [runId].
     *
     * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [addToAnnotationQueue].
     *
     * Unlike [addToAnnotationQueue], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("add_to_annotation_queue")
    @ExcludeMissing
    fun _addToAnnotationQueue(): JsonField<RuleLogActionResponse> = addToAnnotationQueue

    /**
     * Returns the raw JSON value of [addToDataset].
     *
     * Unlike [addToDataset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("add_to_dataset")
    @ExcludeMissing
    fun _addToDataset(): JsonField<RuleLogActionResponse> = addToDataset

    /**
     * Returns the raw JSON value of [alerts].
     *
     * Unlike [alerts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alerts") @ExcludeMissing fun _alerts(): JsonField<RuleLogActionResponse> = alerts

    /**
     * Returns the raw JSON value of [applicationTime].
     *
     * Unlike [applicationTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("application_time")
    @ExcludeMissing
    fun _applicationTime(): JsonField<OffsetDateTime> = applicationTime

    /**
     * Returns the raw JSON value of [evaluators].
     *
     * Unlike [evaluators], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evaluators")
    @ExcludeMissing
    fun _evaluators(): JsonField<RuleLogActionResponse> = evaluators

    /**
     * Returns the raw JSON value of [runName].
     *
     * Unlike [runName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_name") @ExcludeMissing fun _runName(): JsonField<String> = runName

    /**
     * Returns the raw JSON value of [runSessionId].
     *
     * Unlike [runSessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_session_id")
    @ExcludeMissing
    fun _runSessionId(): JsonField<String> = runSessionId

    /**
     * Returns the raw JSON value of [runType].
     *
     * Unlike [runType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_type") @ExcludeMissing fun _runType(): JsonField<String> = runType

    /**
     * Returns the raw JSON value of [threadId].
     *
     * Unlike [threadId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thread_id") @ExcludeMissing fun _threadId(): JsonField<String> = threadId

    /**
     * Returns the raw JSON value of [webhooks].
     *
     * Unlike [webhooks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhooks")
    @ExcludeMissing
    fun _webhooks(): JsonField<RuleLogActionResponse> = webhooks

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
         * Returns a mutable builder for constructing an instance of [RuleLogSchema].
         *
         * The following fields are required:
         * ```java
         * .endTime()
         * .ruleId()
         * .runId()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuleLogSchema]. */
    class Builder internal constructor() {

        private var endTime: JsonField<OffsetDateTime>? = null
        private var ruleId: JsonField<String>? = null
        private var runId: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var addToAnnotationQueue: JsonField<RuleLogActionResponse> = JsonMissing.of()
        private var addToDataset: JsonField<RuleLogActionResponse> = JsonMissing.of()
        private var alerts: JsonField<RuleLogActionResponse> = JsonMissing.of()
        private var applicationTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var evaluators: JsonField<RuleLogActionResponse> = JsonMissing.of()
        private var runName: JsonField<String> = JsonMissing.of()
        private var runSessionId: JsonField<String> = JsonMissing.of()
        private var runType: JsonField<String> = JsonMissing.of()
        private var threadId: JsonField<String> = JsonMissing.of()
        private var webhooks: JsonField<RuleLogActionResponse> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ruleLogSchema: RuleLogSchema) = apply {
            endTime = ruleLogSchema.endTime
            ruleId = ruleLogSchema.ruleId
            runId = ruleLogSchema.runId
            startTime = ruleLogSchema.startTime
            addToAnnotationQueue = ruleLogSchema.addToAnnotationQueue
            addToDataset = ruleLogSchema.addToDataset
            alerts = ruleLogSchema.alerts
            applicationTime = ruleLogSchema.applicationTime
            evaluators = ruleLogSchema.evaluators
            runName = ruleLogSchema.runName
            runSessionId = ruleLogSchema.runSessionId
            runType = ruleLogSchema.runType
            threadId = ruleLogSchema.threadId
            webhooks = ruleLogSchema.webhooks
            additionalProperties = ruleLogSchema.additionalProperties.toMutableMap()
        }

        fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        fun ruleId(ruleId: String) = ruleId(JsonField.of(ruleId))

        /**
         * Sets [Builder.ruleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ruleId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ruleId(ruleId: JsonField<String>) = apply { this.ruleId = ruleId }

        fun runId(runId: String) = runId(JsonField.of(runId))

        /**
         * Sets [Builder.runId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runId(runId: JsonField<String>) = apply { this.runId = runId }

        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        fun addToAnnotationQueue(addToAnnotationQueue: RuleLogActionResponse?) =
            addToAnnotationQueue(JsonField.ofNullable(addToAnnotationQueue))

        /**
         * Alias for calling [Builder.addToAnnotationQueue] with
         * `addToAnnotationQueue.orElse(null)`.
         */
        fun addToAnnotationQueue(addToAnnotationQueue: Optional<RuleLogActionResponse>) =
            addToAnnotationQueue(addToAnnotationQueue.getOrNull())

        /**
         * Sets [Builder.addToAnnotationQueue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addToAnnotationQueue] with a well-typed
         * [RuleLogActionResponse] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun addToAnnotationQueue(addToAnnotationQueue: JsonField<RuleLogActionResponse>) = apply {
            this.addToAnnotationQueue = addToAnnotationQueue
        }

        fun addToDataset(addToDataset: RuleLogActionResponse?) =
            addToDataset(JsonField.ofNullable(addToDataset))

        /** Alias for calling [Builder.addToDataset] with `addToDataset.orElse(null)`. */
        fun addToDataset(addToDataset: Optional<RuleLogActionResponse>) =
            addToDataset(addToDataset.getOrNull())

        /**
         * Sets [Builder.addToDataset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addToDataset] with a well-typed [RuleLogActionResponse]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun addToDataset(addToDataset: JsonField<RuleLogActionResponse>) = apply {
            this.addToDataset = addToDataset
        }

        fun alerts(alerts: RuleLogActionResponse?) = alerts(JsonField.ofNullable(alerts))

        /** Alias for calling [Builder.alerts] with `alerts.orElse(null)`. */
        fun alerts(alerts: Optional<RuleLogActionResponse>) = alerts(alerts.getOrNull())

        /**
         * Sets [Builder.alerts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alerts] with a well-typed [RuleLogActionResponse] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun alerts(alerts: JsonField<RuleLogActionResponse>) = apply { this.alerts = alerts }

        fun applicationTime(applicationTime: OffsetDateTime?) =
            applicationTime(JsonField.ofNullable(applicationTime))

        /** Alias for calling [Builder.applicationTime] with `applicationTime.orElse(null)`. */
        fun applicationTime(applicationTime: Optional<OffsetDateTime>) =
            applicationTime(applicationTime.getOrNull())

        /**
         * Sets [Builder.applicationTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun applicationTime(applicationTime: JsonField<OffsetDateTime>) = apply {
            this.applicationTime = applicationTime
        }

        fun evaluators(evaluators: RuleLogActionResponse?) =
            evaluators(JsonField.ofNullable(evaluators))

        /** Alias for calling [Builder.evaluators] with `evaluators.orElse(null)`. */
        fun evaluators(evaluators: Optional<RuleLogActionResponse>) =
            evaluators(evaluators.getOrNull())

        /**
         * Sets [Builder.evaluators] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluators] with a well-typed [RuleLogActionResponse]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun evaluators(evaluators: JsonField<RuleLogActionResponse>) = apply {
            this.evaluators = evaluators
        }

        fun runName(runName: String?) = runName(JsonField.ofNullable(runName))

        /** Alias for calling [Builder.runName] with `runName.orElse(null)`. */
        fun runName(runName: Optional<String>) = runName(runName.getOrNull())

        /**
         * Sets [Builder.runName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runName(runName: JsonField<String>) = apply { this.runName = runName }

        fun runSessionId(runSessionId: String?) = runSessionId(JsonField.ofNullable(runSessionId))

        /** Alias for calling [Builder.runSessionId] with `runSessionId.orElse(null)`. */
        fun runSessionId(runSessionId: Optional<String>) = runSessionId(runSessionId.getOrNull())

        /**
         * Sets [Builder.runSessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runSessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runSessionId(runSessionId: JsonField<String>) = apply {
            this.runSessionId = runSessionId
        }

        fun runType(runType: String?) = runType(JsonField.ofNullable(runType))

        /** Alias for calling [Builder.runType] with `runType.orElse(null)`. */
        fun runType(runType: Optional<String>) = runType(runType.getOrNull())

        /**
         * Sets [Builder.runType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runType(runType: JsonField<String>) = apply { this.runType = runType }

        fun threadId(threadId: String?) = threadId(JsonField.ofNullable(threadId))

        /** Alias for calling [Builder.threadId] with `threadId.orElse(null)`. */
        fun threadId(threadId: Optional<String>) = threadId(threadId.getOrNull())

        /**
         * Sets [Builder.threadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun threadId(threadId: JsonField<String>) = apply { this.threadId = threadId }

        fun webhooks(webhooks: RuleLogActionResponse?) = webhooks(JsonField.ofNullable(webhooks))

        /** Alias for calling [Builder.webhooks] with `webhooks.orElse(null)`. */
        fun webhooks(webhooks: Optional<RuleLogActionResponse>) = webhooks(webhooks.getOrNull())

        /**
         * Sets [Builder.webhooks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhooks] with a well-typed [RuleLogActionResponse]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhooks(webhooks: JsonField<RuleLogActionResponse>) = apply {
            this.webhooks = webhooks
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
         * Returns an immutable instance of [RuleLogSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endTime()
         * .ruleId()
         * .runId()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RuleLogSchema =
            RuleLogSchema(
                checkRequired("endTime", endTime),
                checkRequired("ruleId", ruleId),
                checkRequired("runId", runId),
                checkRequired("startTime", startTime),
                addToAnnotationQueue,
                addToDataset,
                alerts,
                applicationTime,
                evaluators,
                runName,
                runSessionId,
                runType,
                threadId,
                webhooks,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RuleLogSchema = apply {
        if (validated) {
            return@apply
        }

        endTime()
        ruleId()
        runId()
        startTime()
        addToAnnotationQueue().ifPresent { it.validate() }
        addToDataset().ifPresent { it.validate() }
        alerts().ifPresent { it.validate() }
        applicationTime()
        evaluators().ifPresent { it.validate() }
        runName()
        runSessionId()
        runType()
        threadId()
        webhooks().ifPresent { it.validate() }
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
        (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (ruleId.asKnown().isPresent) 1 else 0) +
            (if (runId.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (addToAnnotationQueue.asKnown().getOrNull()?.validity() ?: 0) +
            (addToDataset.asKnown().getOrNull()?.validity() ?: 0) +
            (alerts.asKnown().getOrNull()?.validity() ?: 0) +
            (if (applicationTime.asKnown().isPresent) 1 else 0) +
            (evaluators.asKnown().getOrNull()?.validity() ?: 0) +
            (if (runName.asKnown().isPresent) 1 else 0) +
            (if (runSessionId.asKnown().isPresent) 1 else 0) +
            (if (runType.asKnown().isPresent) 1 else 0) +
            (if (threadId.asKnown().isPresent) 1 else 0) +
            (webhooks.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleLogSchema &&
            endTime == other.endTime &&
            ruleId == other.ruleId &&
            runId == other.runId &&
            startTime == other.startTime &&
            addToAnnotationQueue == other.addToAnnotationQueue &&
            addToDataset == other.addToDataset &&
            alerts == other.alerts &&
            applicationTime == other.applicationTime &&
            evaluators == other.evaluators &&
            runName == other.runName &&
            runSessionId == other.runSessionId &&
            runType == other.runType &&
            threadId == other.threadId &&
            webhooks == other.webhooks &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            endTime,
            ruleId,
            runId,
            startTime,
            addToAnnotationQueue,
            addToDataset,
            alerts,
            applicationTime,
            evaluators,
            runName,
            runSessionId,
            runType,
            threadId,
            webhooks,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RuleLogSchema{endTime=$endTime, ruleId=$ruleId, runId=$runId, startTime=$startTime, addToAnnotationQueue=$addToAnnotationQueue, addToDataset=$addToDataset, alerts=$alerts, applicationTime=$applicationTime, evaluators=$evaluators, runName=$runName, runSessionId=$runSessionId, runType=$runType, threadId=$threadId, webhooks=$webhooks, additionalProperties=$additionalProperties}"
}
