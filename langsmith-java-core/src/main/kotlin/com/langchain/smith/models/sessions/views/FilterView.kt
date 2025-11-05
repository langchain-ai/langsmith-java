// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.views

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

class FilterView
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val displayName: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val filterString: JsonField<String>,
    private val sessionId: JsonField<String>,
    private val traceFilterString: JsonField<String>,
    private val treeFilterString: JsonField<String>,
    private val type: JsonField<FilterViewType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filter_string")
        @ExcludeMissing
        filterString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trace_filter_string")
        @ExcludeMissing
        traceFilterString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tree_filter_string")
        @ExcludeMissing
        treeFilterString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<FilterViewType> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        displayName,
        updatedAt,
        description,
        filterString,
        sessionId,
        traceFilterString,
        treeFilterString,
        type,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = displayName.getRequired("display_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filterString(): Optional<String> = filterString.getOptional("filter_string")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceFilterString(): Optional<String> = traceFilterString.getOptional("trace_filter_string")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun treeFilterString(): Optional<String> = treeFilterString.getOptional("tree_filter_string")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<FilterViewType> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [filterString].
     *
     * Unlike [filterString], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filter_string")
    @ExcludeMissing
    fun _filterString(): JsonField<String> = filterString

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [traceFilterString].
     *
     * Unlike [traceFilterString], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("trace_filter_string")
    @ExcludeMissing
    fun _traceFilterString(): JsonField<String> = traceFilterString

    /**
     * Returns the raw JSON value of [treeFilterString].
     *
     * Unlike [treeFilterString], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("tree_filter_string")
    @ExcludeMissing
    fun _treeFilterString(): JsonField<String> = treeFilterString

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<FilterViewType> = type

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
         * Returns a mutable builder for constructing an instance of [FilterView].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .displayName()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FilterView]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var displayName: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var filterString: JsonField<String> = JsonMissing.of()
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var traceFilterString: JsonField<String> = JsonMissing.of()
        private var treeFilterString: JsonField<String> = JsonMissing.of()
        private var type: JsonField<FilterViewType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(filterView: FilterView) = apply {
            id = filterView.id
            createdAt = filterView.createdAt
            displayName = filterView.displayName
            updatedAt = filterView.updatedAt
            description = filterView.description
            filterString = filterView.filterString
            sessionId = filterView.sessionId
            traceFilterString = filterView.traceFilterString
            treeFilterString = filterView.treeFilterString
            type = filterView.type
            additionalProperties = filterView.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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

        fun filterString(filterString: String?) = filterString(JsonField.ofNullable(filterString))

        /** Alias for calling [Builder.filterString] with `filterString.orElse(null)`. */
        fun filterString(filterString: Optional<String>) = filterString(filterString.getOrNull())

        /**
         * Sets [Builder.filterString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterString] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filterString(filterString: JsonField<String>) = apply {
            this.filterString = filterString
        }

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

        fun traceFilterString(traceFilterString: String?) =
            traceFilterString(JsonField.ofNullable(traceFilterString))

        /** Alias for calling [Builder.traceFilterString] with `traceFilterString.orElse(null)`. */
        fun traceFilterString(traceFilterString: Optional<String>) =
            traceFilterString(traceFilterString.getOrNull())

        /**
         * Sets [Builder.traceFilterString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceFilterString] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun traceFilterString(traceFilterString: JsonField<String>) = apply {
            this.traceFilterString = traceFilterString
        }

        fun treeFilterString(treeFilterString: String?) =
            treeFilterString(JsonField.ofNullable(treeFilterString))

        /** Alias for calling [Builder.treeFilterString] with `treeFilterString.orElse(null)`. */
        fun treeFilterString(treeFilterString: Optional<String>) =
            treeFilterString(treeFilterString.getOrNull())

        /**
         * Sets [Builder.treeFilterString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.treeFilterString] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun treeFilterString(treeFilterString: JsonField<String>) = apply {
            this.treeFilterString = treeFilterString
        }

        fun type(type: FilterViewType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [FilterViewType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<FilterViewType>) = apply { this.type = type }

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
         * Returns an immutable instance of [FilterView].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .displayName()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FilterView =
            FilterView(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("displayName", displayName),
                checkRequired("updatedAt", updatedAt),
                description,
                filterString,
                sessionId,
                traceFilterString,
                treeFilterString,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FilterView = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        displayName()
        updatedAt()
        description()
        filterString()
        sessionId()
        traceFilterString()
        treeFilterString()
        type().ifPresent { it.validate() }
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (filterString.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (traceFilterString.asKnown().isPresent) 1 else 0) +
            (if (treeFilterString.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FilterView &&
            id == other.id &&
            createdAt == other.createdAt &&
            displayName == other.displayName &&
            updatedAt == other.updatedAt &&
            description == other.description &&
            filterString == other.filterString &&
            sessionId == other.sessionId &&
            traceFilterString == other.traceFilterString &&
            treeFilterString == other.treeFilterString &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            displayName,
            updatedAt,
            description,
            filterString,
            sessionId,
            traceFilterString,
            treeFilterString,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FilterView{id=$id, createdAt=$createdAt, displayName=$displayName, updatedAt=$updatedAt, description=$description, filterString=$filterString, sessionId=$sessionId, traceFilterString=$traceFilterString, treeFilterString=$treeFilterString, type=$type, additionalProperties=$additionalProperties}"
}
