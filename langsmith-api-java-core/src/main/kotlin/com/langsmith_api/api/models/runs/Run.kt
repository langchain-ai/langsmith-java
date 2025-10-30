// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.Enum
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Run
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val dottedOrder: JsonField<String>,
    private val endTime: JsonField<String>,
    private val error: JsonField<String>,
    private val events: JsonField<List<Event>>,
    private val extra: JsonField<Extra>,
    private val inputAttachments: JsonField<InputAttachments>,
    private val inputs: JsonField<Inputs>,
    private val name: JsonField<String>,
    private val outputAttachments: JsonField<OutputAttachments>,
    private val outputs: JsonField<Outputs>,
    private val parentRunId: JsonField<String>,
    private val referenceExampleId: JsonField<String>,
    private val runType: JsonField<RunType>,
    private val serialized: JsonField<Serialized>,
    private val sessionId: JsonField<String>,
    private val sessionName: JsonField<String>,
    private val startTime: JsonField<String>,
    private val status: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val traceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dotted_order")
        @ExcludeMissing
        dottedOrder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_time") @ExcludeMissing endTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("events") @ExcludeMissing events: JsonField<List<Event>> = JsonMissing.of(),
        @JsonProperty("extra") @ExcludeMissing extra: JsonField<Extra> = JsonMissing.of(),
        @JsonProperty("input_attachments")
        @ExcludeMissing
        inputAttachments: JsonField<InputAttachments> = JsonMissing.of(),
        @JsonProperty("inputs") @ExcludeMissing inputs: JsonField<Inputs> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("output_attachments")
        @ExcludeMissing
        outputAttachments: JsonField<OutputAttachments> = JsonMissing.of(),
        @JsonProperty("outputs") @ExcludeMissing outputs: JsonField<Outputs> = JsonMissing.of(),
        @JsonProperty("parent_run_id")
        @ExcludeMissing
        parentRunId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_example_id")
        @ExcludeMissing
        referenceExampleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("run_type") @ExcludeMissing runType: JsonField<RunType> = JsonMissing.of(),
        @JsonProperty("serialized")
        @ExcludeMissing
        serialized: JsonField<Serialized> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session_name")
        @ExcludeMissing
        sessionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_time") @ExcludeMissing startTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("trace_id") @ExcludeMissing traceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        dottedOrder,
        endTime,
        error,
        events,
        extra,
        inputAttachments,
        inputs,
        name,
        outputAttachments,
        outputs,
        parentRunId,
        referenceExampleId,
        runType,
        serialized,
        sessionId,
        sessionName,
        startTime,
        status,
        tags,
        traceId,
        mutableMapOf(),
    )

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dottedOrder(): Optional<String> = dottedOrder.getOptional("dotted_order")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun endTime(): Optional<String> = endTime.getOptional("end_time")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun events(): Optional<List<Event>> = events.getOptional("events")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun extra(): Optional<Extra> = extra.getOptional("extra")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun inputAttachments(): Optional<InputAttachments> =
        inputAttachments.getOptional("input_attachments")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun inputs(): Optional<Inputs> = inputs.getOptional("inputs")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun outputAttachments(): Optional<OutputAttachments> =
        outputAttachments.getOptional("output_attachments")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun outputs(): Optional<Outputs> = outputs.getOptional("outputs")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun parentRunId(): Optional<String> = parentRunId.getOptional("parent_run_id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun referenceExampleId(): Optional<String> =
        referenceExampleId.getOptional("reference_example_id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun runType(): Optional<RunType> = runType.getOptional("run_type")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun serialized(): Optional<Serialized> = serialized.getOptional("serialized")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sessionName(): Optional<String> = sessionName.getOptional("session_name")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun startTime(): Optional<String> = startTime.getOptional("start_time")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun traceId(): Optional<String> = traceId.getOptional("trace_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [dottedOrder].
     *
     * Unlike [dottedOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dotted_order")
    @ExcludeMissing
    fun _dottedOrder(): JsonField<String> = dottedOrder

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<String> = endTime

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<Event>> = events

    /**
     * Returns the raw JSON value of [extra].
     *
     * Unlike [extra], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonField<Extra> = extra

    /**
     * Returns the raw JSON value of [inputAttachments].
     *
     * Unlike [inputAttachments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("input_attachments")
    @ExcludeMissing
    fun _inputAttachments(): JsonField<InputAttachments> = inputAttachments

    /**
     * Returns the raw JSON value of [inputs].
     *
     * Unlike [inputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonField<Inputs> = inputs

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [outputAttachments].
     *
     * Unlike [outputAttachments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("output_attachments")
    @ExcludeMissing
    fun _outputAttachments(): JsonField<OutputAttachments> = outputAttachments

    /**
     * Returns the raw JSON value of [outputs].
     *
     * Unlike [outputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonField<Outputs> = outputs

    /**
     * Returns the raw JSON value of [parentRunId].
     *
     * Unlike [parentRunId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parent_run_id")
    @ExcludeMissing
    fun _parentRunId(): JsonField<String> = parentRunId

    /**
     * Returns the raw JSON value of [referenceExampleId].
     *
     * Unlike [referenceExampleId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reference_example_id")
    @ExcludeMissing
    fun _referenceExampleId(): JsonField<String> = referenceExampleId

    /**
     * Returns the raw JSON value of [runType].
     *
     * Unlike [runType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_type") @ExcludeMissing fun _runType(): JsonField<RunType> = runType

    /**
     * Returns the raw JSON value of [serialized].
     *
     * Unlike [serialized], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("serialized")
    @ExcludeMissing
    fun _serialized(): JsonField<Serialized> = serialized

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [sessionName].
     *
     * Unlike [sessionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_name")
    @ExcludeMissing
    fun _sessionName(): JsonField<String> = sessionName

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time") @ExcludeMissing fun _startTime(): JsonField<String> = startTime

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [traceId].
     *
     * Unlike [traceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

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

        /** Returns a mutable builder for constructing an instance of [Run]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Run]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var dottedOrder: JsonField<String> = JsonMissing.of()
        private var endTime: JsonField<String> = JsonMissing.of()
        private var error: JsonField<String> = JsonMissing.of()
        private var events: JsonField<MutableList<Event>>? = null
        private var extra: JsonField<Extra> = JsonMissing.of()
        private var inputAttachments: JsonField<InputAttachments> = JsonMissing.of()
        private var inputs: JsonField<Inputs> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var outputAttachments: JsonField<OutputAttachments> = JsonMissing.of()
        private var outputs: JsonField<Outputs> = JsonMissing.of()
        private var parentRunId: JsonField<String> = JsonMissing.of()
        private var referenceExampleId: JsonField<String> = JsonMissing.of()
        private var runType: JsonField<RunType> = JsonMissing.of()
        private var serialized: JsonField<Serialized> = JsonMissing.of()
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var sessionName: JsonField<String> = JsonMissing.of()
        private var startTime: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var traceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(run: Run) = apply {
            id = run.id
            dottedOrder = run.dottedOrder
            endTime = run.endTime
            error = run.error
            events = run.events.map { it.toMutableList() }
            extra = run.extra
            inputAttachments = run.inputAttachments
            inputs = run.inputs
            name = run.name
            outputAttachments = run.outputAttachments
            outputs = run.outputs
            parentRunId = run.parentRunId
            referenceExampleId = run.referenceExampleId
            runType = run.runType
            serialized = run.serialized
            sessionId = run.sessionId
            sessionName = run.sessionName
            startTime = run.startTime
            status = run.status
            tags = run.tags.map { it.toMutableList() }
            traceId = run.traceId
            additionalProperties = run.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun dottedOrder(dottedOrder: String) = dottedOrder(JsonField.of(dottedOrder))

        /**
         * Sets [Builder.dottedOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dottedOrder] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dottedOrder(dottedOrder: JsonField<String>) = apply { this.dottedOrder = dottedOrder }

        fun endTime(endTime: String) = endTime(JsonField.of(endTime))

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endTime(endTime: JsonField<String>) = apply { this.endTime = endTime }

        fun error(error: String) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        fun events(events: List<Event>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<Event>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun events(events: JsonField<List<Event>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [Event] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: Event) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        fun extra(extra: Extra) = extra(JsonField.of(extra))

        /**
         * Sets [Builder.extra] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extra] with a well-typed [Extra] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun extra(extra: JsonField<Extra>) = apply { this.extra = extra }

        fun inputAttachments(inputAttachments: InputAttachments) =
            inputAttachments(JsonField.of(inputAttachments))

        /**
         * Sets [Builder.inputAttachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputAttachments] with a well-typed [InputAttachments]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun inputAttachments(inputAttachments: JsonField<InputAttachments>) = apply {
            this.inputAttachments = inputAttachments
        }

        fun inputs(inputs: Inputs) = inputs(JsonField.of(inputs))

        /**
         * Sets [Builder.inputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputs] with a well-typed [Inputs] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inputs(inputs: JsonField<Inputs>) = apply { this.inputs = inputs }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun outputAttachments(outputAttachments: OutputAttachments) =
            outputAttachments(JsonField.of(outputAttachments))

        /**
         * Sets [Builder.outputAttachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputAttachments] with a well-typed [OutputAttachments]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun outputAttachments(outputAttachments: JsonField<OutputAttachments>) = apply {
            this.outputAttachments = outputAttachments
        }

        fun outputs(outputs: Outputs) = outputs(JsonField.of(outputs))

        /**
         * Sets [Builder.outputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputs] with a well-typed [Outputs] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun outputs(outputs: JsonField<Outputs>) = apply { this.outputs = outputs }

        fun parentRunId(parentRunId: String) = parentRunId(JsonField.of(parentRunId))

        /**
         * Sets [Builder.parentRunId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentRunId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentRunId(parentRunId: JsonField<String>) = apply { this.parentRunId = parentRunId }

        fun referenceExampleId(referenceExampleId: String) =
            referenceExampleId(JsonField.of(referenceExampleId))

        /**
         * Sets [Builder.referenceExampleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceExampleId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceExampleId(referenceExampleId: JsonField<String>) = apply {
            this.referenceExampleId = referenceExampleId
        }

        fun runType(runType: RunType) = runType(JsonField.of(runType))

        /**
         * Sets [Builder.runType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runType] with a well-typed [RunType] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runType(runType: JsonField<RunType>) = apply { this.runType = runType }

        fun serialized(serialized: Serialized) = serialized(JsonField.of(serialized))

        /**
         * Sets [Builder.serialized] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serialized] with a well-typed [Serialized] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun serialized(serialized: JsonField<Serialized>) = apply { this.serialized = serialized }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun sessionName(sessionName: String) = sessionName(JsonField.of(sessionName))

        /**
         * Sets [Builder.sessionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionName(sessionName: JsonField<String>) = apply { this.sessionName = sessionName }

        fun startTime(startTime: String) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startTime(startTime: JsonField<String>) = apply { this.startTime = startTime }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        fun traceId(traceId: String) = traceId(JsonField.of(traceId))

        /**
         * Sets [Builder.traceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

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
         * Returns an immutable instance of [Run].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Run =
            Run(
                id,
                dottedOrder,
                endTime,
                error,
                (events ?: JsonMissing.of()).map { it.toImmutable() },
                extra,
                inputAttachments,
                inputs,
                name,
                outputAttachments,
                outputs,
                parentRunId,
                referenceExampleId,
                runType,
                serialized,
                sessionId,
                sessionName,
                startTime,
                status,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                traceId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Run = apply {
        if (validated) {
            return@apply
        }

        id()
        dottedOrder()
        endTime()
        error()
        events().ifPresent { it.forEach { it.validate() } }
        extra().ifPresent { it.validate() }
        inputAttachments().ifPresent { it.validate() }
        inputs().ifPresent { it.validate() }
        name()
        outputAttachments().ifPresent { it.validate() }
        outputs().ifPresent { it.validate() }
        parentRunId()
        referenceExampleId()
        runType().ifPresent { it.validate() }
        serialized().ifPresent { it.validate() }
        sessionId()
        sessionName()
        startTime()
        status()
        tags()
        traceId()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithApiInvalidDataException) {
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
            (if (dottedOrder.asKnown().isPresent) 1 else 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (extra.asKnown().getOrNull()?.validity() ?: 0) +
            (inputAttachments.asKnown().getOrNull()?.validity() ?: 0) +
            (inputs.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (outputAttachments.asKnown().getOrNull()?.validity() ?: 0) +
            (outputs.asKnown().getOrNull()?.validity() ?: 0) +
            (if (parentRunId.asKnown().isPresent) 1 else 0) +
            (if (referenceExampleId.asKnown().isPresent) 1 else 0) +
            (runType.asKnown().getOrNull()?.validity() ?: 0) +
            (serialized.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (sessionName.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (traceId.asKnown().isPresent) 1 else 0)

    class Event
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

            /** Returns a mutable builder for constructing an instance of [Event]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Event]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(event: Event) = apply {
                additionalProperties = event.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Event].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Event = Event(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Event = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is Event && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Event{additionalProperties=$additionalProperties}"
    }

    class Extra
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

            /** Returns a mutable builder for constructing an instance of [Extra]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Extra]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(extra: Extra) = apply {
                additionalProperties = extra.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Extra].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Extra = Extra(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Extra = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is Extra && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Extra{additionalProperties=$additionalProperties}"
    }

    class InputAttachments
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

            /** Returns a mutable builder for constructing an instance of [InputAttachments]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InputAttachments]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inputAttachments: InputAttachments) = apply {
                additionalProperties = inputAttachments.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [InputAttachments].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InputAttachments = InputAttachments(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): InputAttachments = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is InputAttachments && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "InputAttachments{additionalProperties=$additionalProperties}"
    }

    class Inputs
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

            /** Returns a mutable builder for constructing an instance of [Inputs]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Inputs]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inputs: Inputs) = apply {
                additionalProperties = inputs.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Inputs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Inputs = Inputs(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Inputs = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is Inputs && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Inputs{additionalProperties=$additionalProperties}"
    }

    class OutputAttachments
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

            /** Returns a mutable builder for constructing an instance of [OutputAttachments]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OutputAttachments]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(outputAttachments: OutputAttachments) = apply {
                additionalProperties = outputAttachments.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [OutputAttachments].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OutputAttachments = OutputAttachments(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): OutputAttachments = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is OutputAttachments && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "OutputAttachments{additionalProperties=$additionalProperties}"
    }

    class Outputs
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

            /** Returns a mutable builder for constructing an instance of [Outputs]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Outputs]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(outputs: Outputs) = apply {
                additionalProperties = outputs.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Outputs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Outputs = Outputs(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Outputs = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is Outputs && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Outputs{additionalProperties=$additionalProperties}"
    }

    class RunType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TOOL = of("tool")

            @JvmField val CHAIN = of("chain")

            @JvmField val LLM = of("llm")

            @JvmField val RETRIEVER = of("retriever")

            @JvmField val EMBEDDING = of("embedding")

            @JvmField val PROMPT = of("prompt")

            @JvmField val PARSER = of("parser")

            @JvmStatic fun of(value: String) = RunType(JsonField.of(value))
        }

        /** An enum containing [RunType]'s known values. */
        enum class Known {
            TOOL,
            CHAIN,
            LLM,
            RETRIEVER,
            EMBEDDING,
            PROMPT,
            PARSER,
        }

        /**
         * An enum containing [RunType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RunType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TOOL,
            CHAIN,
            LLM,
            RETRIEVER,
            EMBEDDING,
            PROMPT,
            PARSER,
            /** An enum member indicating that [RunType] was instantiated with an unknown value. */
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
                TOOL -> Value.TOOL
                CHAIN -> Value.CHAIN
                LLM -> Value.LLM
                RETRIEVER -> Value.RETRIEVER
                EMBEDDING -> Value.EMBEDDING
                PROMPT -> Value.PROMPT
                PARSER -> Value.PARSER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TOOL -> Known.TOOL
                CHAIN -> Known.CHAIN
                LLM -> Known.LLM
                RETRIEVER -> Known.RETRIEVER
                EMBEDDING -> Known.EMBEDDING
                PROMPT -> Known.PROMPT
                PARSER -> Known.PARSER
                else -> throw LangsmithApiInvalidDataException("Unknown RunType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithApiInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): RunType = apply {
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
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is RunType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Serialized
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

            /** Returns a mutable builder for constructing an instance of [Serialized]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Serialized]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(serialized: Serialized) = apply {
                additionalProperties = serialized.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Serialized].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Serialized = Serialized(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Serialized = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is Serialized && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Serialized{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Run &&
            id == other.id &&
            dottedOrder == other.dottedOrder &&
            endTime == other.endTime &&
            error == other.error &&
            events == other.events &&
            extra == other.extra &&
            inputAttachments == other.inputAttachments &&
            inputs == other.inputs &&
            name == other.name &&
            outputAttachments == other.outputAttachments &&
            outputs == other.outputs &&
            parentRunId == other.parentRunId &&
            referenceExampleId == other.referenceExampleId &&
            runType == other.runType &&
            serialized == other.serialized &&
            sessionId == other.sessionId &&
            sessionName == other.sessionName &&
            startTime == other.startTime &&
            status == other.status &&
            tags == other.tags &&
            traceId == other.traceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            dottedOrder,
            endTime,
            error,
            events,
            extra,
            inputAttachments,
            inputs,
            name,
            outputAttachments,
            outputs,
            parentRunId,
            referenceExampleId,
            runType,
            serialized,
            sessionId,
            sessionName,
            startTime,
            status,
            tags,
            traceId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Run{id=$id, dottedOrder=$dottedOrder, endTime=$endTime, error=$error, events=$events, extra=$extra, inputAttachments=$inputAttachments, inputs=$inputs, name=$name, outputAttachments=$outputAttachments, outputs=$outputs, parentRunId=$parentRunId, referenceExampleId=$referenceExampleId, runType=$runType, serialized=$serialized, sessionId=$sessionId, sessionName=$sessionName, startTime=$startTime, status=$status, tags=$tags, traceId=$traceId, additionalProperties=$additionalProperties}"
}
