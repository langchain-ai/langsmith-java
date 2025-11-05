// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response to get a specific cluster from a specific cluster job. */
class InsightRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val description: JsonField<String>,
    private val level: JsonField<Long>,
    private val name: JsonField<String>,
    private val numChildren: JsonField<Long>,
    private val parentId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("level") @ExcludeMissing level: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("num_children")
        @ExcludeMissing
        numChildren: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("parent_id") @ExcludeMissing parentId: JsonField<String> = JsonMissing.of(),
    ) : this(id, description, level, name, numChildren, parentId, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun level(): Long = level.getRequired("level")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numChildren(): Long = numChildren.getRequired("num_children")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentId(): Optional<String> = parentId.getOptional("parent_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [level].
     *
     * Unlike [level], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<Long> = level

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [numChildren].
     *
     * Unlike [numChildren], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("num_children") @ExcludeMissing fun _numChildren(): JsonField<Long> = numChildren

    /**
     * Returns the raw JSON value of [parentId].
     *
     * Unlike [parentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parent_id") @ExcludeMissing fun _parentId(): JsonField<String> = parentId

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
         * Returns a mutable builder for constructing an instance of [InsightRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .description()
         * .level()
         * .name()
         * .numChildren()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InsightRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var level: JsonField<Long>? = null
        private var name: JsonField<String>? = null
        private var numChildren: JsonField<Long>? = null
        private var parentId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(insightRetrieveResponse: InsightRetrieveResponse) = apply {
            id = insightRetrieveResponse.id
            description = insightRetrieveResponse.description
            level = insightRetrieveResponse.level
            name = insightRetrieveResponse.name
            numChildren = insightRetrieveResponse.numChildren
            parentId = insightRetrieveResponse.parentId
            additionalProperties = insightRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun level(level: Long) = level(JsonField.of(level))

        /**
         * Sets [Builder.level] to an arbitrary JSON value.
         *
         * You should usually call [Builder.level] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun level(level: JsonField<Long>) = apply { this.level = level }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun numChildren(numChildren: Long) = numChildren(JsonField.of(numChildren))

        /**
         * Sets [Builder.numChildren] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numChildren] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numChildren(numChildren: JsonField<Long>) = apply { this.numChildren = numChildren }

        fun parentId(parentId: String?) = parentId(JsonField.ofNullable(parentId))

        /** Alias for calling [Builder.parentId] with `parentId.orElse(null)`. */
        fun parentId(parentId: Optional<String>) = parentId(parentId.getOrNull())

        /**
         * Sets [Builder.parentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun parentId(parentId: JsonField<String>) = apply { this.parentId = parentId }

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
         * Returns an immutable instance of [InsightRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .description()
         * .level()
         * .name()
         * .numChildren()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InsightRetrieveResponse =
            InsightRetrieveResponse(
                checkRequired("id", id),
                checkRequired("description", description),
                checkRequired("level", level),
                checkRequired("name", name),
                checkRequired("numChildren", numChildren),
                parentId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InsightRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        description()
        level()
        name()
        numChildren()
        parentId()
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
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (level.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (numChildren.asKnown().isPresent) 1 else 0) +
            (if (parentId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsightRetrieveResponse &&
            id == other.id &&
            description == other.description &&
            level == other.level &&
            name == other.name &&
            numChildren == other.numChildren &&
            parentId == other.parentId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, description, level, name, numChildren, parentId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InsightRetrieveResponse{id=$id, description=$description, level=$level, name=$name, numChildren=$numChildren, parentId=$parentId, additionalProperties=$additionalProperties}"
}
