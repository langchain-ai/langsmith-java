// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomChartSeriesFilters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filter: JsonField<String>,
    private val session: JsonField<List<String>>,
    private val traceFilter: JsonField<String>,
    private val treeFilter: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session")
        @ExcludeMissing
        session: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("trace_filter")
        @ExcludeMissing
        traceFilter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tree_filter")
        @ExcludeMissing
        treeFilter: JsonField<String> = JsonMissing.of(),
    ) : this(filter, session, traceFilter, treeFilter, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<String> = filter.getOptional("filter")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun session(): Optional<List<String>> = session.getOptional("session")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceFilter(): Optional<String> = traceFilter.getOptional("trace_filter")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun treeFilter(): Optional<String> = treeFilter.getOptional("tree_filter")

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

    /**
     * Returns the raw JSON value of [session].
     *
     * Unlike [session], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session") @ExcludeMissing fun _session(): JsonField<List<String>> = session

    /**
     * Returns the raw JSON value of [traceFilter].
     *
     * Unlike [traceFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_filter")
    @ExcludeMissing
    fun _traceFilter(): JsonField<String> = traceFilter

    /**
     * Returns the raw JSON value of [treeFilter].
     *
     * Unlike [treeFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tree_filter") @ExcludeMissing fun _treeFilter(): JsonField<String> = treeFilter

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

        /** Returns a mutable builder for constructing an instance of [CustomChartSeriesFilters]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChartSeriesFilters]. */
    class Builder internal constructor() {

        private var filter: JsonField<String> = JsonMissing.of()
        private var session: JsonField<MutableList<String>>? = null
        private var traceFilter: JsonField<String> = JsonMissing.of()
        private var treeFilter: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customChartSeriesFilters: CustomChartSeriesFilters) = apply {
            filter = customChartSeriesFilters.filter
            session = customChartSeriesFilters.session.map { it.toMutableList() }
            traceFilter = customChartSeriesFilters.traceFilter
            treeFilter = customChartSeriesFilters.treeFilter
            additionalProperties = customChartSeriesFilters.additionalProperties.toMutableMap()
        }

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

        fun session(session: List<String>?) = session(JsonField.ofNullable(session))

        /** Alias for calling [Builder.session] with `session.orElse(null)`. */
        fun session(session: Optional<List<String>>) = session(session.getOrNull())

        /**
         * Sets [Builder.session] to an arbitrary JSON value.
         *
         * You should usually call [Builder.session] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun session(session: JsonField<List<String>>) = apply {
            this.session = session.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.session].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSession(session: String) = apply {
            this.session =
                (this.session ?: JsonField.of(mutableListOf())).also {
                    checkKnown("session", it).add(session)
                }
        }

        fun traceFilter(traceFilter: String?) = traceFilter(JsonField.ofNullable(traceFilter))

        /** Alias for calling [Builder.traceFilter] with `traceFilter.orElse(null)`. */
        fun traceFilter(traceFilter: Optional<String>) = traceFilter(traceFilter.getOrNull())

        /**
         * Sets [Builder.traceFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun traceFilter(traceFilter: JsonField<String>) = apply { this.traceFilter = traceFilter }

        fun treeFilter(treeFilter: String?) = treeFilter(JsonField.ofNullable(treeFilter))

        /** Alias for calling [Builder.treeFilter] with `treeFilter.orElse(null)`. */
        fun treeFilter(treeFilter: Optional<String>) = treeFilter(treeFilter.getOrNull())

        /**
         * Sets [Builder.treeFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.treeFilter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun treeFilter(treeFilter: JsonField<String>) = apply { this.treeFilter = treeFilter }

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
         * Returns an immutable instance of [CustomChartSeriesFilters].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomChartSeriesFilters =
            CustomChartSeriesFilters(
                filter,
                (session ?: JsonMissing.of()).map { it.toImmutable() },
                traceFilter,
                treeFilter,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomChartSeriesFilters = apply {
        if (validated) {
            return@apply
        }

        filter()
        session()
        traceFilter()
        treeFilter()
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
        (if (filter.asKnown().isPresent) 1 else 0) +
            (session.asKnown().getOrNull()?.size ?: 0) +
            (if (traceFilter.asKnown().isPresent) 1 else 0) +
            (if (treeFilter.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChartSeriesFilters &&
            filter == other.filter &&
            session == other.session &&
            traceFilter == other.traceFilter &&
            treeFilter == other.treeFilter &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(filter, session, traceFilter, treeFilter, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomChartSeriesFilters{filter=$filter, session=$session, traceFilter=$traceFilter, treeFilter=$treeFilter, additionalProperties=$additionalProperties}"
}
