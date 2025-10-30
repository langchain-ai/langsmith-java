// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

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
import com.langchain.smith.models.charts.SingleCustomChartResponse
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomChartsSection
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val charts: JsonField<List<SingleCustomChartResponse>>,
    private val title: JsonField<String>,
    private val description: JsonField<String>,
    private val index: JsonField<Long>,
    private val sessionId: JsonField<String>,
    private val subSections: JsonField<List<SubSection>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("charts")
        @ExcludeMissing
        charts: JsonField<List<SingleCustomChartResponse>> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sub_sections")
        @ExcludeMissing
        subSections: JsonField<List<SubSection>> = JsonMissing.of(),
    ) : this(id, charts, title, description, index, sessionId, subSections, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun charts(): List<SingleCustomChartResponse> = charts.getRequired("charts")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun index(): Optional<Long> = index.getOptional("index")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subSections(): Optional<List<SubSection>> = subSections.getOptional("sub_sections")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [charts].
     *
     * Unlike [charts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("charts")
    @ExcludeMissing
    fun _charts(): JsonField<List<SingleCustomChartResponse>> = charts

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [index].
     *
     * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [subSections].
     *
     * Unlike [subSections], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sub_sections")
    @ExcludeMissing
    fun _subSections(): JsonField<List<SubSection>> = subSections

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
         * Returns a mutable builder for constructing an instance of [CustomChartsSection].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .charts()
         * .title()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChartsSection]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var charts: JsonField<MutableList<SingleCustomChartResponse>>? = null
        private var title: JsonField<String>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var index: JsonField<Long> = JsonMissing.of()
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var subSections: JsonField<MutableList<SubSection>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customChartsSection: CustomChartsSection) = apply {
            id = customChartsSection.id
            charts = customChartsSection.charts.map { it.toMutableList() }
            title = customChartsSection.title
            description = customChartsSection.description
            index = customChartsSection.index
            sessionId = customChartsSection.sessionId
            subSections = customChartsSection.subSections.map { it.toMutableList() }
            additionalProperties = customChartsSection.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun charts(charts: List<SingleCustomChartResponse>) = charts(JsonField.of(charts))

        /**
         * Sets [Builder.charts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.charts] with a well-typed
         * `List<SingleCustomChartResponse>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun charts(charts: JsonField<List<SingleCustomChartResponse>>) = apply {
            this.charts = charts.map { it.toMutableList() }
        }

        /**
         * Adds a single [SingleCustomChartResponse] to [charts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChart(chart: SingleCustomChartResponse) = apply {
            charts =
                (charts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("charts", it).add(chart)
                }
        }

        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

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

        fun index(index: Long?) = index(JsonField.ofNullable(index))

        /**
         * Alias for [Builder.index].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun index(index: Long) = index(index as Long?)

        /** Alias for calling [Builder.index] with `index.orElse(null)`. */
        fun index(index: Optional<Long>) = index(index.getOrNull())

        /**
         * Sets [Builder.index] to an arbitrary JSON value.
         *
         * You should usually call [Builder.index] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun index(index: JsonField<Long>) = apply { this.index = index }

        fun sessionId(sessionId: String?) = sessionId(JsonField.ofNullable(sessionId))

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun subSections(subSections: List<SubSection>?) =
            subSections(JsonField.ofNullable(subSections))

        /** Alias for calling [Builder.subSections] with `subSections.orElse(null)`. */
        fun subSections(subSections: Optional<List<SubSection>>) =
            subSections(subSections.getOrNull())

        /**
         * Sets [Builder.subSections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subSections] with a well-typed `List<SubSection>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subSections(subSections: JsonField<List<SubSection>>) = apply {
            this.subSections = subSections.map { it.toMutableList() }
        }

        /**
         * Adds a single [SubSection] to [subSections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubSection(subSection: SubSection) = apply {
            subSections =
                (subSections ?: JsonField.of(mutableListOf())).also {
                    checkKnown("subSections", it).add(subSection)
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
         * Returns an immutable instance of [CustomChartsSection].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .charts()
         * .title()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomChartsSection =
            CustomChartsSection(
                checkRequired("id", id),
                checkRequired("charts", charts).map { it.toImmutable() },
                checkRequired("title", title),
                description,
                index,
                sessionId,
                (subSections ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomChartsSection = apply {
        if (validated) {
            return@apply
        }

        id()
        charts().forEach { it.validate() }
        title()
        description()
        index()
        sessionId()
        subSections().ifPresent { it.forEach { it.validate() } }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (charts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (index.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (subSections.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class SubSection
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val charts: JsonField<List<SingleCustomChartResponse>>,
        private val index: JsonField<Long>,
        private val title: JsonField<String>,
        private val description: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("charts")
            @ExcludeMissing
            charts: JsonField<List<SingleCustomChartResponse>> = JsonMissing.of(),
            @JsonProperty("index") @ExcludeMissing index: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
        ) : this(id, charts, index, title, description, mutableMapOf())

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun charts(): List<SingleCustomChartResponse> = charts.getRequired("charts")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun index(): Long = index.getRequired("index")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun title(): String = title.getRequired("title")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
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
         * Returns the raw JSON value of [charts].
         *
         * Unlike [charts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("charts")
        @ExcludeMissing
        fun _charts(): JsonField<List<SingleCustomChartResponse>> = charts

        /**
         * Returns the raw JSON value of [index].
         *
         * Unlike [index], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("index") @ExcludeMissing fun _index(): JsonField<Long> = index

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
             * Returns a mutable builder for constructing an instance of [SubSection].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .charts()
             * .index()
             * .title()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SubSection]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var charts: JsonField<MutableList<SingleCustomChartResponse>>? = null
            private var index: JsonField<Long>? = null
            private var title: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subSection: SubSection) = apply {
                id = subSection.id
                charts = subSection.charts.map { it.toMutableList() }
                index = subSection.index
                title = subSection.title
                description = subSection.description
                additionalProperties = subSection.additionalProperties.toMutableMap()
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

            fun charts(charts: List<SingleCustomChartResponse>) = charts(JsonField.of(charts))

            /**
             * Sets [Builder.charts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.charts] with a well-typed
             * `List<SingleCustomChartResponse>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun charts(charts: JsonField<List<SingleCustomChartResponse>>) = apply {
                this.charts = charts.map { it.toMutableList() }
            }

            /**
             * Adds a single [SingleCustomChartResponse] to [charts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addChart(chart: SingleCustomChartResponse) = apply {
                charts =
                    (charts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("charts", it).add(chart)
                    }
            }

            fun index(index: Long) = index(JsonField.of(index))

            /**
             * Sets [Builder.index] to an arbitrary JSON value.
             *
             * You should usually call [Builder.index] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun index(index: JsonField<Long>) = apply { this.index = index }

            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * Returns an immutable instance of [SubSection].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .charts()
             * .index()
             * .title()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SubSection =
                SubSection(
                    checkRequired("id", id),
                    checkRequired("charts", charts).map { it.toImmutable() },
                    checkRequired("index", index),
                    checkRequired("title", title),
                    description,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SubSection = apply {
            if (validated) {
                return@apply
            }

            id()
            charts().forEach { it.validate() }
            index()
            title()
            description()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (charts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (index.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SubSection &&
                id == other.id &&
                charts == other.charts &&
                index == other.index &&
                title == other.title &&
                description == other.description &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, charts, index, title, description, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SubSection{id=$id, charts=$charts, index=$index, title=$title, description=$description, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChartsSection &&
            id == other.id &&
            charts == other.charts &&
            title == other.title &&
            description == other.description &&
            index == other.index &&
            sessionId == other.sessionId &&
            subSections == other.subSections &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            charts,
            title,
            description,
            index,
            sessionId,
            subSections,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomChartsSection{id=$id, charts=$charts, title=$title, description=$description, index=$index, sessionId=$sessionId, subSections=$subSections, additionalProperties=$additionalProperties}"
}
