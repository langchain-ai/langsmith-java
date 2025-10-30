// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets.runs

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

class RunQueryResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cursors: JsonField<Cursors>,
    private val runs: JsonField<List<RunPublicDatasetSchema>>,
    private val parsedQuery: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cursors") @ExcludeMissing cursors: JsonField<Cursors> = JsonMissing.of(),
        @JsonProperty("runs")
        @ExcludeMissing
        runs: JsonField<List<RunPublicDatasetSchema>> = JsonMissing.of(),
        @JsonProperty("parsed_query")
        @ExcludeMissing
        parsedQuery: JsonField<String> = JsonMissing.of(),
    ) : this(cursors, runs, parsedQuery, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cursors(): Cursors = cursors.getRequired("cursors")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runs(): List<RunPublicDatasetSchema> = runs.getRequired("runs")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parsedQuery(): Optional<String> = parsedQuery.getOptional("parsed_query")

    /**
     * Returns the raw JSON value of [cursors].
     *
     * Unlike [cursors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cursors") @ExcludeMissing fun _cursors(): JsonField<Cursors> = cursors

    /**
     * Returns the raw JSON value of [runs].
     *
     * Unlike [runs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runs")
    @ExcludeMissing
    fun _runs(): JsonField<List<RunPublicDatasetSchema>> = runs

    /**
     * Returns the raw JSON value of [parsedQuery].
     *
     * Unlike [parsedQuery], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parsed_query")
    @ExcludeMissing
    fun _parsedQuery(): JsonField<String> = parsedQuery

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
         * Returns a mutable builder for constructing an instance of [RunQueryResponse].
         *
         * The following fields are required:
         * ```java
         * .cursors()
         * .runs()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunQueryResponse]. */
    class Builder internal constructor() {

        private var cursors: JsonField<Cursors>? = null
        private var runs: JsonField<MutableList<RunPublicDatasetSchema>>? = null
        private var parsedQuery: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runQueryResponse: RunQueryResponse) = apply {
            cursors = runQueryResponse.cursors
            runs = runQueryResponse.runs.map { it.toMutableList() }
            parsedQuery = runQueryResponse.parsedQuery
            additionalProperties = runQueryResponse.additionalProperties.toMutableMap()
        }

        fun cursors(cursors: Cursors) = cursors(JsonField.of(cursors))

        /**
         * Sets [Builder.cursors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cursors] with a well-typed [Cursors] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cursors(cursors: JsonField<Cursors>) = apply { this.cursors = cursors }

        fun runs(runs: List<RunPublicDatasetSchema>) = runs(JsonField.of(runs))

        /**
         * Sets [Builder.runs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runs] with a well-typed `List<RunPublicDatasetSchema>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun runs(runs: JsonField<List<RunPublicDatasetSchema>>) = apply {
            this.runs = runs.map { it.toMutableList() }
        }

        /**
         * Adds a single [RunPublicDatasetSchema] to [runs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRun(run: RunPublicDatasetSchema) = apply {
            runs = (runs ?: JsonField.of(mutableListOf())).also { checkKnown("runs", it).add(run) }
        }

        fun parsedQuery(parsedQuery: String?) = parsedQuery(JsonField.ofNullable(parsedQuery))

        /** Alias for calling [Builder.parsedQuery] with `parsedQuery.orElse(null)`. */
        fun parsedQuery(parsedQuery: Optional<String>) = parsedQuery(parsedQuery.getOrNull())

        /**
         * Sets [Builder.parsedQuery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parsedQuery] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parsedQuery(parsedQuery: JsonField<String>) = apply { this.parsedQuery = parsedQuery }

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
         * Returns an immutable instance of [RunQueryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cursors()
         * .runs()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunQueryResponse =
            RunQueryResponse(
                checkRequired("cursors", cursors),
                checkRequired("runs", runs).map { it.toImmutable() },
                parsedQuery,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RunQueryResponse = apply {
        if (validated) {
            return@apply
        }

        cursors().validate()
        runs().forEach { it.validate() }
        parsedQuery()
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
        (cursors.asKnown().getOrNull()?.validity() ?: 0) +
            (runs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (parsedQuery.asKnown().isPresent) 1 else 0)

    class Cursors
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

            /** Returns a mutable builder for constructing an instance of [Cursors]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cursors]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cursors: Cursors) = apply {
                additionalProperties = cursors.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Cursors].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Cursors = Cursors(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Cursors = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cursors && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Cursors{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunQueryResponse &&
            cursors == other.cursors &&
            runs == other.runs &&
            parsedQuery == other.parsedQuery &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(cursors, runs, parsedQuery, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RunQueryResponse{cursors=$cursors, runs=$runs, parsedQuery=$parsedQuery, additionalProperties=$additionalProperties}"
}
