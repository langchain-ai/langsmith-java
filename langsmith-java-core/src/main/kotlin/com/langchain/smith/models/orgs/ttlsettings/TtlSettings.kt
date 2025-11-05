// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.ttlsettings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
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

/** TTL settings model. */
class TtlSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val configuredBy: JsonField<ConfiguredBy>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val defaultTraceTier: JsonField<TraceTier>,
    private val organizationId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val applyToAllProjects: JsonField<Boolean>,
    private val tenantId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("configured_by")
        @ExcludeMissing
        configuredBy: JsonField<ConfiguredBy> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("default_trace_tier")
        @ExcludeMissing
        defaultTraceTier: JsonField<TraceTier> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("apply_to_all_projects")
        @ExcludeMissing
        applyToAllProjects: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        configuredBy,
        createdAt,
        defaultTraceTier,
        organizationId,
        updatedAt,
        applyToAllProjects,
        tenantId,
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
    fun configuredBy(): ConfiguredBy = configuredBy.getRequired("configured_by")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultTraceTier(): TraceTier = defaultTraceTier.getRequired("default_trace_tier")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationId(): String = organizationId.getRequired("organization_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applyToAllProjects(): Optional<Boolean> =
        applyToAllProjects.getOptional("apply_to_all_projects")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tenantId(): Optional<String> = tenantId.getOptional("tenant_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [configuredBy].
     *
     * Unlike [configuredBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configured_by")
    @ExcludeMissing
    fun _configuredBy(): JsonField<ConfiguredBy> = configuredBy

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [defaultTraceTier].
     *
     * Unlike [defaultTraceTier], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_trace_tier")
    @ExcludeMissing
    fun _defaultTraceTier(): JsonField<TraceTier> = defaultTraceTier

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [applyToAllProjects].
     *
     * Unlike [applyToAllProjects], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("apply_to_all_projects")
    @ExcludeMissing
    fun _applyToAllProjects(): JsonField<Boolean> = applyToAllProjects

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

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
         * Returns a mutable builder for constructing an instance of [TtlSettings].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .configuredBy()
         * .createdAt()
         * .defaultTraceTier()
         * .organizationId()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TtlSettings]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var configuredBy: JsonField<ConfiguredBy>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var defaultTraceTier: JsonField<TraceTier>? = null
        private var organizationId: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var applyToAllProjects: JsonField<Boolean> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ttlSettings: TtlSettings) = apply {
            id = ttlSettings.id
            configuredBy = ttlSettings.configuredBy
            createdAt = ttlSettings.createdAt
            defaultTraceTier = ttlSettings.defaultTraceTier
            organizationId = ttlSettings.organizationId
            updatedAt = ttlSettings.updatedAt
            applyToAllProjects = ttlSettings.applyToAllProjects
            tenantId = ttlSettings.tenantId
            additionalProperties = ttlSettings.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun configuredBy(configuredBy: ConfiguredBy) = configuredBy(JsonField.of(configuredBy))

        /**
         * Sets [Builder.configuredBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configuredBy] with a well-typed [ConfiguredBy] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun configuredBy(configuredBy: JsonField<ConfiguredBy>) = apply {
            this.configuredBy = configuredBy
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun defaultTraceTier(defaultTraceTier: TraceTier) =
            defaultTraceTier(JsonField.of(defaultTraceTier))

        /**
         * Sets [Builder.defaultTraceTier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultTraceTier] with a well-typed [TraceTier] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultTraceTier(defaultTraceTier: JsonField<TraceTier>) = apply {
            this.defaultTraceTier = defaultTraceTier
        }

        fun organizationId(organizationId: String) = organizationId(JsonField.of(organizationId))

        /**
         * Sets [Builder.organizationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationId(organizationId: JsonField<String>) = apply {
            this.organizationId = organizationId
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun applyToAllProjects(applyToAllProjects: Boolean) =
            applyToAllProjects(JsonField.of(applyToAllProjects))

        /**
         * Sets [Builder.applyToAllProjects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applyToAllProjects] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun applyToAllProjects(applyToAllProjects: JsonField<Boolean>) = apply {
            this.applyToAllProjects = applyToAllProjects
        }

        fun tenantId(tenantId: String?) = tenantId(JsonField.ofNullable(tenantId))

        /** Alias for calling [Builder.tenantId] with `tenantId.orElse(null)`. */
        fun tenantId(tenantId: Optional<String>) = tenantId(tenantId.getOrNull())

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

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
         * Returns an immutable instance of [TtlSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .configuredBy()
         * .createdAt()
         * .defaultTraceTier()
         * .organizationId()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TtlSettings =
            TtlSettings(
                checkRequired("id", id),
                checkRequired("configuredBy", configuredBy),
                checkRequired("createdAt", createdAt),
                checkRequired("defaultTraceTier", defaultTraceTier),
                checkRequired("organizationId", organizationId),
                checkRequired("updatedAt", updatedAt),
                applyToAllProjects,
                tenantId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TtlSettings = apply {
        if (validated) {
            return@apply
        }

        id()
        configuredBy().validate()
        createdAt()
        defaultTraceTier().validate()
        organizationId()
        updatedAt()
        applyToAllProjects()
        tenantId()
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
            (configuredBy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (defaultTraceTier.asKnown().getOrNull()?.validity() ?: 0) +
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (applyToAllProjects.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0)

    class ConfiguredBy @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val SYSTEM = of("system")

            @JvmField val USER = of("user")

            @JvmStatic fun of(value: String) = ConfiguredBy(JsonField.of(value))
        }

        /** An enum containing [ConfiguredBy]'s known values. */
        enum class Known {
            SYSTEM,
            USER,
        }

        /**
         * An enum containing [ConfiguredBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ConfiguredBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SYSTEM,
            USER,
            /**
             * An enum member indicating that [ConfiguredBy] was instantiated with an unknown value.
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
                SYSTEM -> Value.SYSTEM
                USER -> Value.USER
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
                SYSTEM -> Known.SYSTEM
                USER -> Known.USER
                else -> throw LangChainInvalidDataException("Unknown ConfiguredBy: $value")
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

        fun validate(): ConfiguredBy = apply {
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

            return other is ConfiguredBy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TtlSettings &&
            id == other.id &&
            configuredBy == other.configuredBy &&
            createdAt == other.createdAt &&
            defaultTraceTier == other.defaultTraceTier &&
            organizationId == other.organizationId &&
            updatedAt == other.updatedAt &&
            applyToAllProjects == other.applyToAllProjects &&
            tenantId == other.tenantId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            configuredBy,
            createdAt,
            defaultTraceTier,
            organizationId,
            updatedAt,
            applyToAllProjects,
            tenantId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TtlSettings{id=$id, configuredBy=$configuredBy, createdAt=$createdAt, defaultTraceTier=$defaultTraceTier, organizationId=$organizationId, updatedAt=$updatedAt, applyToAllProjects=$applyToAllProjects, tenantId=$tenantId, additionalProperties=$additionalProperties}"
}
