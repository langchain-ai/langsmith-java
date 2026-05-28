// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new session. */
class SessionCreateParams
private constructor(
    private val upsert: Boolean?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun upsert(): Optional<Boolean> = Optional.ofNullable(upsert)

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = body.id()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultDatasetId(): Optional<String> = body.defaultDatasetId()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = body.endTime()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluatorKeys(): Optional<List<String>> = body.evaluatorKeys()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extra(): Optional<Extra> = body.extra()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun kickedOffBy(): Optional<String> = body.kickedOffBy()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numExamples(): Optional<Long> = body.numExamples()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numRepetitions(): Optional<Long> = body.numRepetitions()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referenceDatasetId(): Optional<String> = body.referenceDatasetId()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = body.startTime()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceTier(): Optional<TraceTier> = body.traceTier()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [defaultDatasetId].
     *
     * Unlike [defaultDatasetId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _defaultDatasetId(): JsonField<String> = body._defaultDatasetId()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endTime(): JsonField<OffsetDateTime> = body._endTime()

    /**
     * Returns the raw JSON value of [evaluatorKeys].
     *
     * Unlike [evaluatorKeys], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _evaluatorKeys(): JsonField<List<String>> = body._evaluatorKeys()

    /**
     * Returns the raw JSON value of [extra].
     *
     * Unlike [extra], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _extra(): JsonField<Extra> = body._extra()

    /**
     * Returns the raw JSON value of [kickedOffBy].
     *
     * Unlike [kickedOffBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _kickedOffBy(): JsonField<String> = body._kickedOffBy()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [numExamples].
     *
     * Unlike [numExamples], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numExamples(): JsonField<Long> = body._numExamples()

    /**
     * Returns the raw JSON value of [numRepetitions].
     *
     * Unlike [numRepetitions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numRepetitions(): JsonField<Long> = body._numRepetitions()

    /**
     * Returns the raw JSON value of [referenceDatasetId].
     *
     * Unlike [referenceDatasetId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _referenceDatasetId(): JsonField<String> = body._referenceDatasetId()

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startTime(): JsonField<OffsetDateTime> = body._startTime()

    /**
     * Returns the raw JSON value of [traceTier].
     *
     * Unlike [traceTier], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _traceTier(): JsonField<TraceTier> = body._traceTier()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SessionCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SessionCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionCreateParams]. */
    class Builder internal constructor() {

        private var upsert: Boolean? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sessionCreateParams: SessionCreateParams) = apply {
            upsert = sessionCreateParams.upsert
            body = sessionCreateParams.body.toBuilder()
            additionalHeaders = sessionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sessionCreateParams.additionalQueryParams.toBuilder()
        }

        fun upsert(upsert: Boolean?) = apply { this.upsert = upsert }

        /**
         * Alias for [Builder.upsert].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun upsert(upsert: Boolean) = upsert(upsert as Boolean?)

        /** Alias for calling [Builder.upsert] with `upsert.orElse(null)`. */
        fun upsert(upsert: Optional<Boolean>) = upsert(upsert.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [id]
         * - [defaultDatasetId]
         * - [description]
         * - [endTime]
         * - [evaluatorKeys]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun id(id: String?) = apply { body.id(id) }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        fun defaultDatasetId(defaultDatasetId: String?) = apply {
            body.defaultDatasetId(defaultDatasetId)
        }

        /** Alias for calling [Builder.defaultDatasetId] with `defaultDatasetId.orElse(null)`. */
        fun defaultDatasetId(defaultDatasetId: Optional<String>) =
            defaultDatasetId(defaultDatasetId.getOrNull())

        /**
         * Sets [Builder.defaultDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultDatasetId(defaultDatasetId: JsonField<String>) = apply {
            body.defaultDatasetId(defaultDatasetId)
        }

        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun endTime(endTime: OffsetDateTime?) = apply { body.endTime(endTime) }

        /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
        fun endTime(endTime: Optional<OffsetDateTime>) = endTime(endTime.getOrNull())

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { body.endTime(endTime) }

        fun evaluatorKeys(evaluatorKeys: List<String>?) = apply {
            body.evaluatorKeys(evaluatorKeys)
        }

        /** Alias for calling [Builder.evaluatorKeys] with `evaluatorKeys.orElse(null)`. */
        fun evaluatorKeys(evaluatorKeys: Optional<List<String>>) =
            evaluatorKeys(evaluatorKeys.getOrNull())

        /**
         * Sets [Builder.evaluatorKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluatorKeys] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evaluatorKeys(evaluatorKeys: JsonField<List<String>>) = apply {
            body.evaluatorKeys(evaluatorKeys)
        }

        /**
         * Adds a single [String] to [evaluatorKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvaluatorKey(evaluatorKey: String) = apply { body.addEvaluatorKey(evaluatorKey) }

        fun extra(extra: Extra?) = apply { body.extra(extra) }

        /** Alias for calling [Builder.extra] with `extra.orElse(null)`. */
        fun extra(extra: Optional<Extra>) = extra(extra.getOrNull())

        /**
         * Sets [Builder.extra] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extra] with a well-typed [Extra] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun extra(extra: JsonField<Extra>) = apply { body.extra(extra) }

        fun kickedOffBy(kickedOffBy: String?) = apply { body.kickedOffBy(kickedOffBy) }

        /** Alias for calling [Builder.kickedOffBy] with `kickedOffBy.orElse(null)`. */
        fun kickedOffBy(kickedOffBy: Optional<String>) = kickedOffBy(kickedOffBy.getOrNull())

        /**
         * Sets [Builder.kickedOffBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kickedOffBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun kickedOffBy(kickedOffBy: JsonField<String>) = apply { body.kickedOffBy(kickedOffBy) }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun numExamples(numExamples: Long?) = apply { body.numExamples(numExamples) }

        /**
         * Alias for [Builder.numExamples].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun numExamples(numExamples: Long) = numExamples(numExamples as Long?)

        /** Alias for calling [Builder.numExamples] with `numExamples.orElse(null)`. */
        fun numExamples(numExamples: Optional<Long>) = numExamples(numExamples.getOrNull())

        /**
         * Sets [Builder.numExamples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numExamples] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numExamples(numExamples: JsonField<Long>) = apply { body.numExamples(numExamples) }

        fun numRepetitions(numRepetitions: Long?) = apply { body.numRepetitions(numRepetitions) }

        /**
         * Alias for [Builder.numRepetitions].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun numRepetitions(numRepetitions: Long) = numRepetitions(numRepetitions as Long?)

        /** Alias for calling [Builder.numRepetitions] with `numRepetitions.orElse(null)`. */
        fun numRepetitions(numRepetitions: Optional<Long>) =
            numRepetitions(numRepetitions.getOrNull())

        /**
         * Sets [Builder.numRepetitions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numRepetitions] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numRepetitions(numRepetitions: JsonField<Long>) = apply {
            body.numRepetitions(numRepetitions)
        }

        fun referenceDatasetId(referenceDatasetId: String?) = apply {
            body.referenceDatasetId(referenceDatasetId)
        }

        /**
         * Alias for calling [Builder.referenceDatasetId] with `referenceDatasetId.orElse(null)`.
         */
        fun referenceDatasetId(referenceDatasetId: Optional<String>) =
            referenceDatasetId(referenceDatasetId.getOrNull())

        /**
         * Sets [Builder.referenceDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceDatasetId(referenceDatasetId: JsonField<String>) = apply {
            body.referenceDatasetId(referenceDatasetId)
        }

        fun startTime(startTime: OffsetDateTime) = apply { body.startTime(startTime) }

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { body.startTime(startTime) }

        fun traceTier(traceTier: TraceTier?) = apply { body.traceTier(traceTier) }

        /** Alias for calling [Builder.traceTier] with `traceTier.orElse(null)`. */
        fun traceTier(traceTier: Optional<TraceTier>) = traceTier(traceTier.getOrNull())

        /**
         * Sets [Builder.traceTier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceTier] with a well-typed [TraceTier] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun traceTier(traceTier: JsonField<TraceTier>) = apply { body.traceTier(traceTier) }

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
         * Returns an immutable instance of [SessionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SessionCreateParams =
            SessionCreateParams(
                upsert,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                upsert?.let { put("upsert", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Create class for TracerSession. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val defaultDatasetId: JsonField<String>,
        private val description: JsonField<String>,
        private val endTime: JsonField<OffsetDateTime>,
        private val evaluatorKeys: JsonField<List<String>>,
        private val extra: JsonField<Extra>,
        private val kickedOffBy: JsonField<String>,
        private val name: JsonField<String>,
        private val numExamples: JsonField<Long>,
        private val numRepetitions: JsonField<Long>,
        private val referenceDatasetId: JsonField<String>,
        private val startTime: JsonField<OffsetDateTime>,
        private val traceTier: JsonField<TraceTier>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("default_dataset_id")
            @ExcludeMissing
            defaultDatasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_time")
            @ExcludeMissing
            endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("evaluator_keys")
            @ExcludeMissing
            evaluatorKeys: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("extra") @ExcludeMissing extra: JsonField<Extra> = JsonMissing.of(),
            @JsonProperty("kicked_off_by")
            @ExcludeMissing
            kickedOffBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("num_examples")
            @ExcludeMissing
            numExamples: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("num_repetitions")
            @ExcludeMissing
            numRepetitions: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("reference_dataset_id")
            @ExcludeMissing
            referenceDatasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("trace_tier")
            @ExcludeMissing
            traceTier: JsonField<TraceTier> = JsonMissing.of(),
        ) : this(
            id,
            defaultDatasetId,
            description,
            endTime,
            evaluatorKeys,
            extra,
            kickedOffBy,
            name,
            numExamples,
            numRepetitions,
            referenceDatasetId,
            startTime,
            traceTier,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun defaultDatasetId(): Optional<String> =
            defaultDatasetId.getOptional("default_dataset_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun evaluatorKeys(): Optional<List<String>> = evaluatorKeys.getOptional("evaluator_keys")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun extra(): Optional<Extra> = extra.getOptional("extra")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun kickedOffBy(): Optional<String> = kickedOffBy.getOptional("kicked_off_by")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun numExamples(): Optional<Long> = numExamples.getOptional("num_examples")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun numRepetitions(): Optional<Long> = numRepetitions.getOptional("num_repetitions")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referenceDatasetId(): Optional<String> =
            referenceDatasetId.getOptional("reference_dataset_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun traceTier(): Optional<TraceTier> = traceTier.getOptional("trace_tier")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [defaultDatasetId].
         *
         * Unlike [defaultDatasetId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("default_dataset_id")
        @ExcludeMissing
        fun _defaultDatasetId(): JsonField<String> = defaultDatasetId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [endTime].
         *
         * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_time")
        @ExcludeMissing
        fun _endTime(): JsonField<OffsetDateTime> = endTime

        /**
         * Returns the raw JSON value of [evaluatorKeys].
         *
         * Unlike [evaluatorKeys], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("evaluator_keys")
        @ExcludeMissing
        fun _evaluatorKeys(): JsonField<List<String>> = evaluatorKeys

        /**
         * Returns the raw JSON value of [extra].
         *
         * Unlike [extra], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonField<Extra> = extra

        /**
         * Returns the raw JSON value of [kickedOffBy].
         *
         * Unlike [kickedOffBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("kicked_off_by")
        @ExcludeMissing
        fun _kickedOffBy(): JsonField<String> = kickedOffBy

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [numExamples].
         *
         * Unlike [numExamples], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("num_examples")
        @ExcludeMissing
        fun _numExamples(): JsonField<Long> = numExamples

        /**
         * Returns the raw JSON value of [numRepetitions].
         *
         * Unlike [numRepetitions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("num_repetitions")
        @ExcludeMissing
        fun _numRepetitions(): JsonField<Long> = numRepetitions

        /**
         * Returns the raw JSON value of [referenceDatasetId].
         *
         * Unlike [referenceDatasetId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("reference_dataset_id")
        @ExcludeMissing
        fun _referenceDatasetId(): JsonField<String> = referenceDatasetId

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time")
        @ExcludeMissing
        fun _startTime(): JsonField<OffsetDateTime> = startTime

        /**
         * Returns the raw JSON value of [traceTier].
         *
         * Unlike [traceTier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trace_tier")
        @ExcludeMissing
        fun _traceTier(): JsonField<TraceTier> = traceTier

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var defaultDatasetId: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var evaluatorKeys: JsonField<MutableList<String>>? = null
            private var extra: JsonField<Extra> = JsonMissing.of()
            private var kickedOffBy: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var numExamples: JsonField<Long> = JsonMissing.of()
            private var numRepetitions: JsonField<Long> = JsonMissing.of()
            private var referenceDatasetId: JsonField<String> = JsonMissing.of()
            private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var traceTier: JsonField<TraceTier> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                id = body.id
                defaultDatasetId = body.defaultDatasetId
                description = body.description
                endTime = body.endTime
                evaluatorKeys = body.evaluatorKeys.map { it.toMutableList() }
                extra = body.extra
                kickedOffBy = body.kickedOffBy
                name = body.name
                numExamples = body.numExamples
                numRepetitions = body.numRepetitions
                referenceDatasetId = body.referenceDatasetId
                startTime = body.startTime
                traceTier = body.traceTier
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun id(id: String?) = id(JsonField.ofNullable(id))

            /** Alias for calling [Builder.id] with `id.orElse(null)`. */
            fun id(id: Optional<String>) = id(id.getOrNull())

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun defaultDatasetId(defaultDatasetId: String?) =
                defaultDatasetId(JsonField.ofNullable(defaultDatasetId))

            /**
             * Alias for calling [Builder.defaultDatasetId] with `defaultDatasetId.orElse(null)`.
             */
            fun defaultDatasetId(defaultDatasetId: Optional<String>) =
                defaultDatasetId(defaultDatasetId.getOrNull())

            /**
             * Sets [Builder.defaultDatasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultDatasetId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultDatasetId(defaultDatasetId: JsonField<String>) = apply {
                this.defaultDatasetId = defaultDatasetId
            }

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

            fun evaluatorKeys(evaluatorKeys: List<String>?) =
                evaluatorKeys(JsonField.ofNullable(evaluatorKeys))

            /** Alias for calling [Builder.evaluatorKeys] with `evaluatorKeys.orElse(null)`. */
            fun evaluatorKeys(evaluatorKeys: Optional<List<String>>) =
                evaluatorKeys(evaluatorKeys.getOrNull())

            /**
             * Sets [Builder.evaluatorKeys] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evaluatorKeys] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun evaluatorKeys(evaluatorKeys: JsonField<List<String>>) = apply {
                this.evaluatorKeys = evaluatorKeys.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [evaluatorKeys].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEvaluatorKey(evaluatorKey: String) = apply {
                evaluatorKeys =
                    (evaluatorKeys ?: JsonField.of(mutableListOf())).also {
                        checkKnown("evaluatorKeys", it).add(evaluatorKey)
                    }
            }

            fun extra(extra: Extra?) = extra(JsonField.ofNullable(extra))

            /** Alias for calling [Builder.extra] with `extra.orElse(null)`. */
            fun extra(extra: Optional<Extra>) = extra(extra.getOrNull())

            /**
             * Sets [Builder.extra] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extra] with a well-typed [Extra] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun extra(extra: JsonField<Extra>) = apply { this.extra = extra }

            fun kickedOffBy(kickedOffBy: String?) = kickedOffBy(JsonField.ofNullable(kickedOffBy))

            /** Alias for calling [Builder.kickedOffBy] with `kickedOffBy.orElse(null)`. */
            fun kickedOffBy(kickedOffBy: Optional<String>) = kickedOffBy(kickedOffBy.getOrNull())

            /**
             * Sets [Builder.kickedOffBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.kickedOffBy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun kickedOffBy(kickedOffBy: JsonField<String>) = apply {
                this.kickedOffBy = kickedOffBy
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

            fun numExamples(numExamples: Long?) = numExamples(JsonField.ofNullable(numExamples))

            /**
             * Alias for [Builder.numExamples].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun numExamples(numExamples: Long) = numExamples(numExamples as Long?)

            /** Alias for calling [Builder.numExamples] with `numExamples.orElse(null)`. */
            fun numExamples(numExamples: Optional<Long>) = numExamples(numExamples.getOrNull())

            /**
             * Sets [Builder.numExamples] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numExamples] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numExamples(numExamples: JsonField<Long>) = apply { this.numExamples = numExamples }

            fun numRepetitions(numRepetitions: Long?) =
                numRepetitions(JsonField.ofNullable(numRepetitions))

            /**
             * Alias for [Builder.numRepetitions].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun numRepetitions(numRepetitions: Long) = numRepetitions(numRepetitions as Long?)

            /** Alias for calling [Builder.numRepetitions] with `numRepetitions.orElse(null)`. */
            fun numRepetitions(numRepetitions: Optional<Long>) =
                numRepetitions(numRepetitions.getOrNull())

            /**
             * Sets [Builder.numRepetitions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numRepetitions] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numRepetitions(numRepetitions: JsonField<Long>) = apply {
                this.numRepetitions = numRepetitions
            }

            fun referenceDatasetId(referenceDatasetId: String?) =
                referenceDatasetId(JsonField.ofNullable(referenceDatasetId))

            /**
             * Alias for calling [Builder.referenceDatasetId] with
             * `referenceDatasetId.orElse(null)`.
             */
            fun referenceDatasetId(referenceDatasetId: Optional<String>) =
                referenceDatasetId(referenceDatasetId.getOrNull())

            /**
             * Sets [Builder.referenceDatasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referenceDatasetId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referenceDatasetId(referenceDatasetId: JsonField<String>) = apply {
                this.referenceDatasetId = referenceDatasetId
            }

            fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

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

            fun traceTier(traceTier: TraceTier?) = traceTier(JsonField.ofNullable(traceTier))

            /** Alias for calling [Builder.traceTier] with `traceTier.orElse(null)`. */
            fun traceTier(traceTier: Optional<TraceTier>) = traceTier(traceTier.getOrNull())

            /**
             * Sets [Builder.traceTier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceTier] with a well-typed [TraceTier] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traceTier(traceTier: JsonField<TraceTier>) = apply { this.traceTier = traceTier }

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
             */
            fun build(): Body =
                Body(
                    id,
                    defaultDatasetId,
                    description,
                    endTime,
                    (evaluatorKeys ?: JsonMissing.of()).map { it.toImmutable() },
                    extra,
                    kickedOffBy,
                    name,
                    numExamples,
                    numRepetitions,
                    referenceDatasetId,
                    startTime,
                    traceTier,
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

            id()
            defaultDatasetId()
            description()
            endTime()
            evaluatorKeys()
            extra().ifPresent { it.validate() }
            kickedOffBy()
            name()
            numExamples()
            numRepetitions()
            referenceDatasetId()
            startTime()
            traceTier().ifPresent { it.validate() }
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
                (if (defaultDatasetId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (endTime.asKnown().isPresent) 1 else 0) +
                (evaluatorKeys.asKnown().getOrNull()?.size ?: 0) +
                (extra.asKnown().getOrNull()?.validity() ?: 0) +
                (if (kickedOffBy.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (numExamples.asKnown().isPresent) 1 else 0) +
                (if (numRepetitions.asKnown().isPresent) 1 else 0) +
                (if (referenceDatasetId.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (traceTier.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
                defaultDatasetId == other.defaultDatasetId &&
                description == other.description &&
                endTime == other.endTime &&
                evaluatorKeys == other.evaluatorKeys &&
                extra == other.extra &&
                kickedOffBy == other.kickedOffBy &&
                name == other.name &&
                numExamples == other.numExamples &&
                numRepetitions == other.numRepetitions &&
                referenceDatasetId == other.referenceDatasetId &&
                startTime == other.startTime &&
                traceTier == other.traceTier &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                defaultDatasetId,
                description,
                endTime,
                evaluatorKeys,
                extra,
                kickedOffBy,
                name,
                numExamples,
                numRepetitions,
                referenceDatasetId,
                startTime,
                traceTier,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, defaultDatasetId=$defaultDatasetId, description=$description, endTime=$endTime, evaluatorKeys=$evaluatorKeys, extra=$extra, kickedOffBy=$kickedOffBy, name=$name, numExamples=$numExamples, numRepetitions=$numRepetitions, referenceDatasetId=$referenceDatasetId, startTime=$startTime, traceTier=$traceTier, additionalProperties=$additionalProperties}"
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

            return other is Extra && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Extra{additionalProperties=$additionalProperties}"
    }

    class TraceTier @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LONGLIVED = of("longlived")

            @JvmField val SHORTLIVED = of("shortlived")

            @JvmStatic fun of(value: String) = TraceTier(JsonField.of(value))
        }

        /** An enum containing [TraceTier]'s known values. */
        enum class Known {
            LONGLIVED,
            SHORTLIVED,
        }

        /**
         * An enum containing [TraceTier]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TraceTier] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LONGLIVED,
            SHORTLIVED,
            /**
             * An enum member indicating that [TraceTier] was instantiated with an unknown value.
             */
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
                LONGLIVED -> Value.LONGLIVED
                SHORTLIVED -> Value.SHORTLIVED
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
                LONGLIVED -> Known.LONGLIVED
                SHORTLIVED -> Known.SHORTLIVED
                else -> throw LangChainInvalidDataException("Unknown TraceTier: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TraceTier = apply {
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

            return other is TraceTier && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionCreateParams &&
            upsert == other.upsert &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(upsert, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SessionCreateParams{upsert=$upsert, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
