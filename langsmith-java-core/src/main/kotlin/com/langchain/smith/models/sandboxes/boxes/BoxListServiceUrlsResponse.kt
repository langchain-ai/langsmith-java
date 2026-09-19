// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

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

class BoxListServiceUrlsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val access: JsonField<Access>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val port: JsonField<Long>,
    private val createdBy: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("access") @ExcludeMissing access: JsonField<Access> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("port") @ExcludeMissing port: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created_by") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(access, createdAt, port, createdBy, expiresAt, mutableMapOf())

    /**
     * How the port is shared: "token" for a minted service token, or "restricted"/"workspace" for
     * LangSmith login.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun access(): Access = access.getRequired("access")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun port(): Long = port.getRequired("port")

    /**
     * The LangSmith user who first shared this port, when known.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("created_by")

    /**
     * When the share expires. Set only for "token"; a login grant does not expire.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

    /**
     * Returns the raw JSON value of [access].
     *
     * Unlike [access], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access") @ExcludeMissing fun _access(): JsonField<Access> = access

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [port].
     *
     * Unlike [port], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("port") @ExcludeMissing fun _port(): JsonField<Long> = port

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

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
         * Returns a mutable builder for constructing an instance of [BoxListServiceUrlsResponse].
         *
         * The following fields are required:
         * ```java
         * .access()
         * .createdAt()
         * .port()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BoxListServiceUrlsResponse]. */
    class Builder internal constructor() {

        private var access: JsonField<Access>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var port: JsonField<Long>? = null
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(boxListServiceUrlsResponse: BoxListServiceUrlsResponse) = apply {
            access = boxListServiceUrlsResponse.access
            createdAt = boxListServiceUrlsResponse.createdAt
            port = boxListServiceUrlsResponse.port
            createdBy = boxListServiceUrlsResponse.createdBy
            expiresAt = boxListServiceUrlsResponse.expiresAt
            additionalProperties = boxListServiceUrlsResponse.additionalProperties.toMutableMap()
        }

        /**
         * How the port is shared: "token" for a minted service token, or "restricted"/"workspace"
         * for LangSmith login.
         */
        fun access(access: Access) = access(JsonField.of(access))

        /**
         * Sets [Builder.access] to an arbitrary JSON value.
         *
         * You should usually call [Builder.access] with a well-typed [Access] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun access(access: JsonField<Access>) = apply { this.access = access }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun port(port: Long) = port(JsonField.of(port))

        /**
         * Sets [Builder.port] to an arbitrary JSON value.
         *
         * You should usually call [Builder.port] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun port(port: JsonField<Long>) = apply { this.port = port }

        /** The LangSmith user who first shared this port, when known. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** When the share expires. Set only for "token"; a login grant does not expire. */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

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
         * Returns an immutable instance of [BoxListServiceUrlsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .access()
         * .createdAt()
         * .port()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BoxListServiceUrlsResponse =
            BoxListServiceUrlsResponse(
                checkRequired("access", access),
                checkRequired("createdAt", createdAt),
                checkRequired("port", port),
                createdBy,
                expiresAt,
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
    fun validate(): BoxListServiceUrlsResponse = apply {
        if (validated) {
            return@apply
        }

        access().validate()
        createdAt()
        port()
        createdBy()
        expiresAt()
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
        (access.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (port.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0)

    /**
     * How the port is shared: "token" for a minted service token, or "restricted"/"workspace" for
     * LangSmith login.
     */
    class Access @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TOKEN = of("token")

            @JvmField val RESTRICTED = of("restricted")

            @JvmField val WORKSPACE = of("workspace")

            @JvmStatic fun of(value: String) = Access(JsonField.of(value))
        }

        /** An enum containing [Access]'s known values. */
        enum class Known {
            TOKEN,
            RESTRICTED,
            WORKSPACE,
        }

        /**
         * An enum containing [Access]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Access] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TOKEN,
            RESTRICTED,
            WORKSPACE,
            /** An enum member indicating that [Access] was instantiated with an unknown value. */
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
                TOKEN -> Value.TOKEN
                RESTRICTED -> Value.RESTRICTED
                WORKSPACE -> Value.WORKSPACE
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
                TOKEN -> Known.TOKEN
                RESTRICTED -> Known.RESTRICTED
                WORKSPACE -> Known.WORKSPACE
                else -> throw LangChainInvalidDataException("Unknown Access: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Access = apply {
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

            return other is Access && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BoxListServiceUrlsResponse &&
            access == other.access &&
            createdAt == other.createdAt &&
            port == other.port &&
            createdBy == other.createdBy &&
            expiresAt == other.expiresAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(access, createdAt, port, createdBy, expiresAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BoxListServiceUrlsResponse{access=$access, createdAt=$createdAt, port=$port, createdBy=$createdBy, expiresAt=$expiresAt, additionalProperties=$additionalProperties}"
}
