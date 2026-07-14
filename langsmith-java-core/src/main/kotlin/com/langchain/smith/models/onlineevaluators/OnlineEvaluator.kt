// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

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

class OnlineEvaluator
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val codeEvaluator: JsonField<OnlineCodeEvaluator>,
    private val createdAt: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val feedbackKeys: JsonField<List<String>>,
    private val isManaged: JsonField<Boolean>,
    private val llmEvaluator: JsonField<OnlineLlmEvaluator>,
    private val name: JsonField<String>,
    private val runRules: JsonField<List<OnlineEvaluatorRunRule>>,
    private val tenantId: JsonField<String>,
    private val type: JsonField<OnlineEvaluatorType>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code_evaluator")
        @ExcludeMissing
        codeEvaluator: JsonField<OnlineCodeEvaluator> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_by") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("feedback_keys")
        @ExcludeMissing
        feedbackKeys: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("is_managed")
        @ExcludeMissing
        isManaged: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("llm_evaluator")
        @ExcludeMissing
        llmEvaluator: JsonField<OnlineLlmEvaluator> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("run_rules")
        @ExcludeMissing
        runRules: JsonField<List<OnlineEvaluatorRunRule>> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        type: JsonField<OnlineEvaluatorType> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        codeEvaluator,
        createdAt,
        createdBy,
        feedbackKeys,
        isManaged,
        llmEvaluator,
        name,
        runRules,
        tenantId,
        type,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun codeEvaluator(): Optional<OnlineCodeEvaluator> = codeEvaluator.getOptional("code_evaluator")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("created_by")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackKeys(): Optional<List<String>> = feedbackKeys.getOptional("feedback_keys")

    /**
     * IsManaged marks a LangChain-managed evaluator (currently the managed Perceived Error judge).
     * NULL in the DB is read as false via COALESCE.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isManaged(): Optional<Boolean> = isManaged.getOptional("is_managed")

    /**
     * Embedded child evaluator (populated based on type)
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun llmEvaluator(): Optional<OnlineLlmEvaluator> = llmEvaluator.getOptional("llm_evaluator")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runRules(): Optional<List<OnlineEvaluatorRunRule>> = runRules.getOptional("run_rules")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tenantId(): Optional<String> = tenantId.getOptional("tenant_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<OnlineEvaluatorType> = type.getOptional("type")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [codeEvaluator].
     *
     * Unlike [codeEvaluator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code_evaluator")
    @ExcludeMissing
    fun _codeEvaluator(): JsonField<OnlineCodeEvaluator> = codeEvaluator

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [feedbackKeys].
     *
     * Unlike [feedbackKeys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_keys")
    @ExcludeMissing
    fun _feedbackKeys(): JsonField<List<String>> = feedbackKeys

    /**
     * Returns the raw JSON value of [isManaged].
     *
     * Unlike [isManaged], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_managed") @ExcludeMissing fun _isManaged(): JsonField<Boolean> = isManaged

    /**
     * Returns the raw JSON value of [llmEvaluator].
     *
     * Unlike [llmEvaluator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("llm_evaluator")
    @ExcludeMissing
    fun _llmEvaluator(): JsonField<OnlineLlmEvaluator> = llmEvaluator

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [runRules].
     *
     * Unlike [runRules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_rules")
    @ExcludeMissing
    fun _runRules(): JsonField<List<OnlineEvaluatorRunRule>> = runRules

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<OnlineEvaluatorType> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [OnlineEvaluator]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnlineEvaluator]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var codeEvaluator: JsonField<OnlineCodeEvaluator> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var feedbackKeys: JsonField<MutableList<String>>? = null
        private var isManaged: JsonField<Boolean> = JsonMissing.of()
        private var llmEvaluator: JsonField<OnlineLlmEvaluator> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var runRules: JsonField<MutableList<OnlineEvaluatorRunRule>>? = null
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<OnlineEvaluatorType> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onlineEvaluator: OnlineEvaluator) = apply {
            id = onlineEvaluator.id
            codeEvaluator = onlineEvaluator.codeEvaluator
            createdAt = onlineEvaluator.createdAt
            createdBy = onlineEvaluator.createdBy
            feedbackKeys = onlineEvaluator.feedbackKeys.map { it.toMutableList() }
            isManaged = onlineEvaluator.isManaged
            llmEvaluator = onlineEvaluator.llmEvaluator
            name = onlineEvaluator.name
            runRules = onlineEvaluator.runRules.map { it.toMutableList() }
            tenantId = onlineEvaluator.tenantId
            type = onlineEvaluator.type
            updatedAt = onlineEvaluator.updatedAt
            additionalProperties = onlineEvaluator.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun codeEvaluator(codeEvaluator: OnlineCodeEvaluator) =
            codeEvaluator(JsonField.of(codeEvaluator))

        /**
         * Sets [Builder.codeEvaluator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.codeEvaluator] with a well-typed [OnlineCodeEvaluator]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun codeEvaluator(codeEvaluator: JsonField<OnlineCodeEvaluator>) = apply {
            this.codeEvaluator = codeEvaluator
        }

        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun feedbackKeys(feedbackKeys: List<String>) = feedbackKeys(JsonField.of(feedbackKeys))

        /**
         * Sets [Builder.feedbackKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackKeys] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun feedbackKeys(feedbackKeys: JsonField<List<String>>) = apply {
            this.feedbackKeys = feedbackKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [feedbackKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFeedbackKey(feedbackKey: String) = apply {
            feedbackKeys =
                (feedbackKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("feedbackKeys", it).add(feedbackKey)
                }
        }

        /**
         * IsManaged marks a LangChain-managed evaluator (currently the managed Perceived Error
         * judge). NULL in the DB is read as false via COALESCE.
         */
        fun isManaged(isManaged: Boolean) = isManaged(JsonField.of(isManaged))

        /**
         * Sets [Builder.isManaged] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isManaged] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isManaged(isManaged: JsonField<Boolean>) = apply { this.isManaged = isManaged }

        /** Embedded child evaluator (populated based on type) */
        fun llmEvaluator(llmEvaluator: OnlineLlmEvaluator) =
            llmEvaluator(JsonField.of(llmEvaluator))

        /**
         * Sets [Builder.llmEvaluator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.llmEvaluator] with a well-typed [OnlineLlmEvaluator]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun llmEvaluator(llmEvaluator: JsonField<OnlineLlmEvaluator>) = apply {
            this.llmEvaluator = llmEvaluator
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun runRules(runRules: List<OnlineEvaluatorRunRule>) = runRules(JsonField.of(runRules))

        /**
         * Sets [Builder.runRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runRules] with a well-typed
         * `List<OnlineEvaluatorRunRule>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun runRules(runRules: JsonField<List<OnlineEvaluatorRunRule>>) = apply {
            this.runRules = runRules.map { it.toMutableList() }
        }

        /**
         * Adds a single [OnlineEvaluatorRunRule] to [runRules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRunRule(runRule: OnlineEvaluatorRunRule) = apply {
            runRules =
                (runRules ?: JsonField.of(mutableListOf())).also {
                    checkKnown("runRules", it).add(runRule)
                }
        }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun type(type: OnlineEvaluatorType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [OnlineEvaluatorType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<OnlineEvaluatorType>) = apply { this.type = type }

        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [OnlineEvaluator].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OnlineEvaluator =
            OnlineEvaluator(
                id,
                codeEvaluator,
                createdAt,
                createdBy,
                (feedbackKeys ?: JsonMissing.of()).map { it.toImmutable() },
                isManaged,
                llmEvaluator,
                name,
                (runRules ?: JsonMissing.of()).map { it.toImmutable() },
                tenantId,
                type,
                updatedAt,
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
    fun validate(): OnlineEvaluator = apply {
        if (validated) {
            return@apply
        }

        id()
        codeEvaluator().ifPresent { it.validate() }
        createdAt()
        createdBy()
        feedbackKeys()
        isManaged()
        llmEvaluator().ifPresent { it.validate() }
        name()
        runRules().ifPresent { it.forEach { it.validate() } }
        tenantId()
        type().ifPresent { it.validate() }
        updatedAt()
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
            (codeEvaluator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (feedbackKeys.asKnown().getOrNull()?.size ?: 0) +
            (if (isManaged.asKnown().isPresent) 1 else 0) +
            (llmEvaluator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (runRules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnlineEvaluator &&
            id == other.id &&
            codeEvaluator == other.codeEvaluator &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            feedbackKeys == other.feedbackKeys &&
            isManaged == other.isManaged &&
            llmEvaluator == other.llmEvaluator &&
            name == other.name &&
            runRules == other.runRules &&
            tenantId == other.tenantId &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            codeEvaluator,
            createdAt,
            createdBy,
            feedbackKeys,
            isManaged,
            llmEvaluator,
            name,
            runRules,
            tenantId,
            type,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OnlineEvaluator{id=$id, codeEvaluator=$codeEvaluator, createdAt=$createdAt, createdBy=$createdBy, feedbackKeys=$feedbackKeys, isManaged=$isManaged, llmEvaluator=$llmEvaluator, name=$name, runRules=$runRules, tenantId=$tenantId, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
