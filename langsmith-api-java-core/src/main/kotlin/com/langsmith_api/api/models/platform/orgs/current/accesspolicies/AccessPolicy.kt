// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.platform.orgs.current.accesspolicies

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class AccessPolicy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val conditionGroups: JsonField<List<ConditionGroup>>,
    private val createdAt: JsonField<String>,
    private val description: JsonField<String>,
    private val effect: JsonField<String>,
    private val name: JsonField<String>,
    private val roleIds: JsonField<List<String>>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("condition_groups")
        @ExcludeMissing
        conditionGroups: JsonField<List<ConditionGroup>> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effect") @ExcludeMissing effect: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("role_ids")
        @ExcludeMissing
        roleIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        conditionGroups,
        createdAt,
        description,
        effect,
        name,
        roleIds,
        updatedAt,
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
    fun conditionGroups(): Optional<List<ConditionGroup>> =
        conditionGroups.getOptional("condition_groups")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun effect(): Optional<String> = effect.getOptional("effect")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun roleIds(): Optional<List<String>> = roleIds.getOptional("role_ids")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [conditionGroups].
     *
     * Unlike [conditionGroups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("condition_groups")
    @ExcludeMissing
    fun _conditionGroups(): JsonField<List<ConditionGroup>> = conditionGroups

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [effect].
     *
     * Unlike [effect], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effect") @ExcludeMissing fun _effect(): JsonField<String> = effect

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [roleIds].
     *
     * Unlike [roleIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("role_ids") @ExcludeMissing fun _roleIds(): JsonField<List<String>> = roleIds

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

        /** Returns a mutable builder for constructing an instance of [AccessPolicy]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccessPolicy]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var conditionGroups: JsonField<MutableList<ConditionGroup>>? = null
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var effect: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var roleIds: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accessPolicy: AccessPolicy) = apply {
            id = accessPolicy.id
            conditionGroups = accessPolicy.conditionGroups.map { it.toMutableList() }
            createdAt = accessPolicy.createdAt
            description = accessPolicy.description
            effect = accessPolicy.effect
            name = accessPolicy.name
            roleIds = accessPolicy.roleIds.map { it.toMutableList() }
            updatedAt = accessPolicy.updatedAt
            additionalProperties = accessPolicy.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun conditionGroups(conditionGroups: List<ConditionGroup>) =
            conditionGroups(JsonField.of(conditionGroups))

        /**
         * Sets [Builder.conditionGroups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditionGroups] with a well-typed
         * `List<ConditionGroup>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun conditionGroups(conditionGroups: JsonField<List<ConditionGroup>>) = apply {
            this.conditionGroups = conditionGroups.map { it.toMutableList() }
        }

        /**
         * Adds a single [ConditionGroup] to [conditionGroups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addConditionGroup(conditionGroup: ConditionGroup) = apply {
            conditionGroups =
                (conditionGroups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("conditionGroups", it).add(conditionGroup)
                }
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

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun effect(effect: String) = effect(JsonField.of(effect))

        /**
         * Sets [Builder.effect] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effect] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun effect(effect: JsonField<String>) = apply { this.effect = effect }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun roleIds(roleIds: List<String>) = roleIds(JsonField.of(roleIds))

        /**
         * Sets [Builder.roleIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roleIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun roleIds(roleIds: JsonField<List<String>>) = apply {
            this.roleIds = roleIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [roleIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRoleId(roleId: String) = apply {
            roleIds =
                (roleIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("roleIds", it).add(roleId)
                }
        }

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
         * Returns an immutable instance of [AccessPolicy].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccessPolicy =
            AccessPolicy(
                id,
                (conditionGroups ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                description,
                effect,
                name,
                (roleIds ?: JsonMissing.of()).map { it.toImmutable() },
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccessPolicy = apply {
        if (validated) {
            return@apply
        }

        id()
        conditionGroups().ifPresent { it.forEach { it.validate() } }
        createdAt()
        description()
        effect()
        name()
        roleIds()
        updatedAt()
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
            (conditionGroups.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (effect.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (roleIds.asKnown().getOrNull()?.size ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccessPolicy &&
            id == other.id &&
            conditionGroups == other.conditionGroups &&
            createdAt == other.createdAt &&
            description == other.description &&
            effect == other.effect &&
            name == other.name &&
            roleIds == other.roleIds &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            conditionGroups,
            createdAt,
            description,
            effect,
            name,
            roleIds,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccessPolicy{id=$id, conditionGroups=$conditionGroups, createdAt=$createdAt, description=$description, effect=$effect, name=$name, roleIds=$roleIds, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
