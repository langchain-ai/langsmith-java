// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.traces

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.runs.Run
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Trace
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val rootRun: JsonField<Run>,
    private val traceAggregates: JsonField<TraceAggregates>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("root_run") @ExcludeMissing rootRun: JsonField<Run> = JsonMissing.of(),
        @JsonProperty("trace_aggregates")
        @ExcludeMissing
        traceAggregates: JsonField<TraceAggregates> = JsonMissing.of(),
    ) : this(rootRun, traceAggregates, mutableMapOf())

    /**
     * `root_run` is the trace's root run. Which properties are populated is controlled by `selects`
     * in the request.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rootRun(): Optional<Run> = rootRun.getOptional("root_run")

    /**
     * `trace_aggregates` carries trace-wide aggregate metrics. Omitted when no aggregate field was
     * selected, or `null` (then later filled) on the streaming wire while the aggregate values are
     * still being computed.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceAggregates(): Optional<TraceAggregates> =
        traceAggregates.getOptional("trace_aggregates")

    /**
     * Returns the raw JSON value of [rootRun].
     *
     * Unlike [rootRun], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("root_run") @ExcludeMissing fun _rootRun(): JsonField<Run> = rootRun

    /**
     * Returns the raw JSON value of [traceAggregates].
     *
     * Unlike [traceAggregates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_aggregates")
    @ExcludeMissing
    fun _traceAggregates(): JsonField<TraceAggregates> = traceAggregates

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

        /** Returns a mutable builder for constructing an instance of [Trace]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Trace]. */
    class Builder internal constructor() {

        private var rootRun: JsonField<Run> = JsonMissing.of()
        private var traceAggregates: JsonField<TraceAggregates> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(trace: Trace) = apply {
            rootRun = trace.rootRun
            traceAggregates = trace.traceAggregates
            additionalProperties = trace.additionalProperties.toMutableMap()
        }

        /**
         * `root_run` is the trace's root run. Which properties are populated is controlled by
         * `selects` in the request.
         */
        fun rootRun(rootRun: Run) = rootRun(JsonField.of(rootRun))

        /**
         * Sets [Builder.rootRun] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rootRun] with a well-typed [Run] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rootRun(rootRun: JsonField<Run>) = apply { this.rootRun = rootRun }

        /**
         * `trace_aggregates` carries trace-wide aggregate metrics. Omitted when no aggregate field
         * was selected, or `null` (then later filled) on the streaming wire while the aggregate
         * values are still being computed.
         */
        fun traceAggregates(traceAggregates: TraceAggregates) =
            traceAggregates(JsonField.of(traceAggregates))

        /**
         * Sets [Builder.traceAggregates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceAggregates] with a well-typed [TraceAggregates]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun traceAggregates(traceAggregates: JsonField<TraceAggregates>) = apply {
            this.traceAggregates = traceAggregates
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
         * Returns an immutable instance of [Trace].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Trace = Trace(rootRun, traceAggregates, additionalProperties.toMutableMap())
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
    fun validate(): Trace = apply {
        if (validated) {
            return@apply
        }

        rootRun().ifPresent { it.validate() }
        traceAggregates().ifPresent { it.validate() }
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
        (rootRun.asKnown().getOrNull()?.validity() ?: 0) +
            (traceAggregates.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Trace &&
            rootRun == other.rootRun &&
            traceAggregates == other.traceAggregates &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(rootRun, traceAggregates, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Trace{rootRun=$rootRun, traceAggregates=$traceAggregates, additionalProperties=$additionalProperties}"
}
