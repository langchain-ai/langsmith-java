// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
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

class ItemCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of()
    ) : this(items, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun items(): Optional<List<Item>> = items.getOptional("items")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

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

        /** Returns a mutable builder for constructing an instance of [ItemCreateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ItemCreateResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(itemCreateResponse: ItemCreateResponse) = apply {
            items = itemCreateResponse.items.map { it.toMutableList() }
            additionalProperties = itemCreateResponse.additionalProperties.toMutableMap()
        }

        fun items(items: List<Item>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
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
         * Returns an immutable instance of [ItemCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ItemCreateResponse =
            ItemCreateResponse(
                (items ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): ItemCreateResponse = apply {
        if (validated) {
            return@apply
        }

        items().ifPresent { it.forEach { it.validate() } }
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Item
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val addedAt: JsonField<String>,
        private val itemType: JsonField<ItemType>,
        private val lastReviewedTime: JsonField<String>,
        private val projectId: JsonField<String>,
        private val queueId: JsonField<String>,
        private val runId: JsonField<String>,
        private val sourceProposedExampleId: JsonField<String>,
        private val startTime: JsonField<String>,
        private val threadId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("added_at") @ExcludeMissing addedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("item_type")
            @ExcludeMissing
            itemType: JsonField<ItemType> = JsonMissing.of(),
            @JsonProperty("last_reviewed_time")
            @ExcludeMissing
            lastReviewedTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("project_id")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("queue_id") @ExcludeMissing queueId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source_proposed_example_id")
            @ExcludeMissing
            sourceProposedExampleId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("thread_id")
            @ExcludeMissing
            threadId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            addedAt,
            itemType,
            lastReviewedTime,
            projectId,
            queueId,
            runId,
            sourceProposedExampleId,
            startTime,
            threadId,
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
        fun addedAt(): Optional<String> = addedAt.getOptional("added_at")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun itemType(): Optional<ItemType> = itemType.getOptional("item_type")

        /**
         * LastReviewedTime is always present on the wire (null until reviewed).
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lastReviewedTime(): Optional<String> =
            lastReviewedTime.getOptional("last_reviewed_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun projectId(): Optional<String> = projectId.getOptional("project_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun queueId(): Optional<String> = queueId.getOptional("queue_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun runId(): Optional<String> = runId.getOptional("run_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sourceProposedExampleId(): Optional<String> =
            sourceProposedExampleId.getOptional("source_proposed_example_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startTime(): Optional<String> = startTime.getOptional("start_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun threadId(): Optional<String> = threadId.getOptional("thread_id")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [addedAt].
         *
         * Unlike [addedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("added_at") @ExcludeMissing fun _addedAt(): JsonField<String> = addedAt

        /**
         * Returns the raw JSON value of [itemType].
         *
         * Unlike [itemType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("item_type") @ExcludeMissing fun _itemType(): JsonField<ItemType> = itemType

        /**
         * Returns the raw JSON value of [lastReviewedTime].
         *
         * Unlike [lastReviewedTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("last_reviewed_time")
        @ExcludeMissing
        fun _lastReviewedTime(): JsonField<String> = lastReviewedTime

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /**
         * Returns the raw JSON value of [queueId].
         *
         * Unlike [queueId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("queue_id") @ExcludeMissing fun _queueId(): JsonField<String> = queueId

        /**
         * Returns the raw JSON value of [runId].
         *
         * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

        /**
         * Returns the raw JSON value of [sourceProposedExampleId].
         *
         * Unlike [sourceProposedExampleId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("source_proposed_example_id")
        @ExcludeMissing
        fun _sourceProposedExampleId(): JsonField<String> = sourceProposedExampleId

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time") @ExcludeMissing fun _startTime(): JsonField<String> = startTime

        /**
         * Returns the raw JSON value of [threadId].
         *
         * Unlike [threadId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("thread_id") @ExcludeMissing fun _threadId(): JsonField<String> = threadId

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

            /** Returns a mutable builder for constructing an instance of [Item]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var addedAt: JsonField<String> = JsonMissing.of()
            private var itemType: JsonField<ItemType> = JsonMissing.of()
            private var lastReviewedTime: JsonField<String> = JsonMissing.of()
            private var projectId: JsonField<String> = JsonMissing.of()
            private var queueId: JsonField<String> = JsonMissing.of()
            private var runId: JsonField<String> = JsonMissing.of()
            private var sourceProposedExampleId: JsonField<String> = JsonMissing.of()
            private var startTime: JsonField<String> = JsonMissing.of()
            private var threadId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                id = item.id
                addedAt = item.addedAt
                itemType = item.itemType
                lastReviewedTime = item.lastReviewedTime
                projectId = item.projectId
                queueId = item.queueId
                runId = item.runId
                sourceProposedExampleId = item.sourceProposedExampleId
                startTime = item.startTime
                threadId = item.threadId
                additionalProperties = item.additionalProperties.toMutableMap()
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

            fun addedAt(addedAt: String) = addedAt(JsonField.of(addedAt))

            /**
             * Sets [Builder.addedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addedAt(addedAt: JsonField<String>) = apply { this.addedAt = addedAt }

            fun itemType(itemType: ItemType) = itemType(JsonField.of(itemType))

            /**
             * Sets [Builder.itemType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.itemType] with a well-typed [ItemType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun itemType(itemType: JsonField<ItemType>) = apply { this.itemType = itemType }

            /** LastReviewedTime is always present on the wire (null until reviewed). */
            fun lastReviewedTime(lastReviewedTime: String) =
                lastReviewedTime(JsonField.of(lastReviewedTime))

            /**
             * Sets [Builder.lastReviewedTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastReviewedTime] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastReviewedTime(lastReviewedTime: JsonField<String>) = apply {
                this.lastReviewedTime = lastReviewedTime
            }

            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            fun queueId(queueId: String) = queueId(JsonField.of(queueId))

            /**
             * Sets [Builder.queueId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.queueId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun queueId(queueId: JsonField<String>) = apply { this.queueId = queueId }

            fun runId(runId: String) = runId(JsonField.of(runId))

            /**
             * Sets [Builder.runId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runId(runId: JsonField<String>) = apply { this.runId = runId }

            fun sourceProposedExampleId(sourceProposedExampleId: String) =
                sourceProposedExampleId(JsonField.of(sourceProposedExampleId))

            /**
             * Sets [Builder.sourceProposedExampleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceProposedExampleId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sourceProposedExampleId(sourceProposedExampleId: JsonField<String>) = apply {
                this.sourceProposedExampleId = sourceProposedExampleId
            }

            fun startTime(startTime: String) = startTime(JsonField.of(startTime))

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<String>) = apply { this.startTime = startTime }

            fun threadId(threadId: String) = threadId(JsonField.of(threadId))

            /**
             * Sets [Builder.threadId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.threadId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun threadId(threadId: JsonField<String>) = apply { this.threadId = threadId }

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
             * Returns an immutable instance of [Item].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Item =
                Item(
                    id,
                    addedAt,
                    itemType,
                    lastReviewedTime,
                    projectId,
                    queueId,
                    runId,
                    sourceProposedExampleId,
                    startTime,
                    threadId,
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
        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            id()
            addedAt()
            itemType().ifPresent { it.validate() }
            lastReviewedTime()
            projectId()
            queueId()
            runId()
            sourceProposedExampleId()
            startTime()
            threadId()
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
                (if (addedAt.asKnown().isPresent) 1 else 0) +
                (itemType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (lastReviewedTime.asKnown().isPresent) 1 else 0) +
                (if (projectId.asKnown().isPresent) 1 else 0) +
                (if (queueId.asKnown().isPresent) 1 else 0) +
                (if (runId.asKnown().isPresent) 1 else 0) +
                (if (sourceProposedExampleId.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (if (threadId.asKnown().isPresent) 1 else 0)

        class ItemType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val RUN = of("RUN")

                @JvmField val THREAD = of("THREAD")

                @JvmStatic fun of(value: String) = ItemType(JsonField.of(value))
            }

            /** An enum containing [ItemType]'s known values. */
            enum class Known {
                RUN,
                THREAD,
            }

            /**
             * An enum containing [ItemType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ItemType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                RUN,
                THREAD,
                /**
                 * An enum member indicating that [ItemType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    RUN -> Value.RUN
                    THREAD -> Value.THREAD
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    RUN -> Known.RUN
                    THREAD -> Known.THREAD
                    else -> throw LangChainInvalidDataException("Unknown ItemType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ItemType = apply {
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

                return other is ItemType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                id == other.id &&
                addedAt == other.addedAt &&
                itemType == other.itemType &&
                lastReviewedTime == other.lastReviewedTime &&
                projectId == other.projectId &&
                queueId == other.queueId &&
                runId == other.runId &&
                sourceProposedExampleId == other.sourceProposedExampleId &&
                startTime == other.startTime &&
                threadId == other.threadId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                addedAt,
                itemType,
                lastReviewedTime,
                projectId,
                queueId,
                runId,
                sourceProposedExampleId,
                startTime,
                threadId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{id=$id, addedAt=$addedAt, itemType=$itemType, lastReviewedTime=$lastReviewedTime, projectId=$projectId, queueId=$queueId, runId=$runId, sourceProposedExampleId=$sourceProposedExampleId, startTime=$startTime, threadId=$threadId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ItemCreateResponse &&
            items == other.items &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ItemCreateResponse{items=$items, additionalProperties=$additionalProperties}"
}
