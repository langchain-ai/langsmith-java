// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangsmithInvalidDataException
import com.langchain.smith.models.orgs.current.members.AccessScope
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class OrgRetrievePermissionsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accessScope: JsonField<AccessScope>,
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("access_scope")
        @ExcludeMissing
        accessScope: JsonField<AccessScope> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(accessScope, description, name, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accessScope(): AccessScope = accessScope.getRequired("access_scope")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Returns the raw JSON value of [accessScope].
     *
     * Unlike [accessScope], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access_scope")
    @ExcludeMissing
    fun _accessScope(): JsonField<AccessScope> = accessScope

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of
         * [OrgRetrievePermissionsResponse].
         *
         * The following fields are required:
         * ```java
         * .accessScope()
         * .description()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrgRetrievePermissionsResponse]. */
    class Builder internal constructor() {

        private var accessScope: JsonField<AccessScope>? = null
        private var description: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(orgRetrievePermissionsResponse: OrgRetrievePermissionsResponse) = apply {
            accessScope = orgRetrievePermissionsResponse.accessScope
            description = orgRetrievePermissionsResponse.description
            name = orgRetrievePermissionsResponse.name
            additionalProperties =
                orgRetrievePermissionsResponse.additionalProperties.toMutableMap()
        }

        fun accessScope(accessScope: AccessScope) = accessScope(JsonField.of(accessScope))

        /**
         * Sets [Builder.accessScope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessScope] with a well-typed [AccessScope] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accessScope(accessScope: JsonField<AccessScope>) = apply {
            this.accessScope = accessScope
        }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [OrgRetrievePermissionsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accessScope()
         * .description()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrgRetrievePermissionsResponse =
            OrgRetrievePermissionsResponse(
                checkRequired("accessScope", accessScope),
                checkRequired("description", description),
                checkRequired("name", name),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OrgRetrievePermissionsResponse = apply {
        if (validated) {
            return@apply
        }

        accessScope().validate()
        description()
        name()
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
        (accessScope.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrgRetrievePermissionsResponse &&
            accessScope == other.accessScope &&
            description == other.description &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accessScope, description, name, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrgRetrievePermissionsResponse{accessScope=$accessScope, description=$description, name=$name, additionalProperties=$additionalProperties}"
}
