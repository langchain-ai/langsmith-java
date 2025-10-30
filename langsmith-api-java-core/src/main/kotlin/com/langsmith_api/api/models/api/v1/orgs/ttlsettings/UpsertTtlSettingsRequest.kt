// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.ttlsettings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Base TTL settings model. */
class UpsertTtlSettingsRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val defaultTraceTier: JsonField<TraceTier>,
    private val applyToAllProjects: JsonField<Boolean>,
    private val tenantId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("default_trace_tier")
        @ExcludeMissing
        defaultTraceTier: JsonField<TraceTier> = JsonMissing.of(),
        @JsonProperty("apply_to_all_projects")
        @ExcludeMissing
        applyToAllProjects: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
    ) : this(defaultTraceTier, applyToAllProjects, tenantId, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultTraceTier(): TraceTier = defaultTraceTier.getRequired("default_trace_tier")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun applyToAllProjects(): Optional<Boolean> =
        applyToAllProjects.getOptional("apply_to_all_projects")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tenantId(): Optional<String> = tenantId.getOptional("tenant_id")

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
         * Returns a mutable builder for constructing an instance of [UpsertTtlSettingsRequest].
         *
         * The following fields are required:
         * ```java
         * .defaultTraceTier()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UpsertTtlSettingsRequest]. */
    class Builder internal constructor() {

        private var defaultTraceTier: JsonField<TraceTier>? = null
        private var applyToAllProjects: JsonField<Boolean> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(upsertTtlSettingsRequest: UpsertTtlSettingsRequest) = apply {
            defaultTraceTier = upsertTtlSettingsRequest.defaultTraceTier
            applyToAllProjects = upsertTtlSettingsRequest.applyToAllProjects
            tenantId = upsertTtlSettingsRequest.tenantId
            additionalProperties = upsertTtlSettingsRequest.additionalProperties.toMutableMap()
        }

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
         * Returns an immutable instance of [UpsertTtlSettingsRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .defaultTraceTier()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UpsertTtlSettingsRequest =
            UpsertTtlSettingsRequest(
                checkRequired("defaultTraceTier", defaultTraceTier),
                applyToAllProjects,
                tenantId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UpsertTtlSettingsRequest = apply {
        if (validated) {
            return@apply
        }

        defaultTraceTier().validate()
        applyToAllProjects()
        tenantId()
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
        (defaultTraceTier.asKnown().getOrNull()?.validity() ?: 0) +
            (if (applyToAllProjects.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpsertTtlSettingsRequest &&
            defaultTraceTier == other.defaultTraceTier &&
            applyToAllProjects == other.applyToAllProjects &&
            tenantId == other.tenantId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(defaultTraceTier, applyToAllProjects, tenantId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UpsertTtlSettingsRequest{defaultTraceTier=$defaultTraceTier, applyToAllProjects=$applyToAllProjects, tenantId=$tenantId, additionalProperties=$additionalProperties}"
}
