// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sessions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.Enum
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

/** Group by param for run stats. */
class RunStatsGroupBy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val attribute: JsonField<Attribute>,
    private val maxGroups: JsonField<Long>,
    private val path: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("attribute")
        @ExcludeMissing
        attribute: JsonField<Attribute> = JsonMissing.of(),
        @JsonProperty("max_groups") @ExcludeMissing maxGroups: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
    ) : this(attribute, maxGroups, path, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attribute(): Attribute = attribute.getRequired("attribute")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxGroups(): Optional<Long> = maxGroups.getOptional("max_groups")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun path(): Optional<String> = path.getOptional("path")

    /**
     * Returns the raw JSON value of [attribute].
     *
     * Unlike [attribute], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attribute") @ExcludeMissing fun _attribute(): JsonField<Attribute> = attribute

    /**
     * Returns the raw JSON value of [maxGroups].
     *
     * Unlike [maxGroups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_groups") @ExcludeMissing fun _maxGroups(): JsonField<Long> = maxGroups

    /**
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

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
         * Returns a mutable builder for constructing an instance of [RunStatsGroupBy].
         *
         * The following fields are required:
         * ```java
         * .attribute()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunStatsGroupBy]. */
    class Builder internal constructor() {

        private var attribute: JsonField<Attribute>? = null
        private var maxGroups: JsonField<Long> = JsonMissing.of()
        private var path: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runStatsGroupBy: RunStatsGroupBy) = apply {
            attribute = runStatsGroupBy.attribute
            maxGroups = runStatsGroupBy.maxGroups
            path = runStatsGroupBy.path
            additionalProperties = runStatsGroupBy.additionalProperties.toMutableMap()
        }

        fun attribute(attribute: Attribute) = attribute(JsonField.of(attribute))

        /**
         * Sets [Builder.attribute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attribute] with a well-typed [Attribute] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun attribute(attribute: JsonField<Attribute>) = apply { this.attribute = attribute }

        fun maxGroups(maxGroups: Long) = maxGroups(JsonField.of(maxGroups))

        /**
         * Sets [Builder.maxGroups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxGroups] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxGroups(maxGroups: JsonField<Long>) = apply { this.maxGroups = maxGroups }

        fun path(path: String?) = path(JsonField.ofNullable(path))

        /** Alias for calling [Builder.path] with `path.orElse(null)`. */
        fun path(path: Optional<String>) = path(path.getOrNull())

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: JsonField<String>) = apply { this.path = path }

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
         * Returns an immutable instance of [RunStatsGroupBy].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .attribute()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunStatsGroupBy =
            RunStatsGroupBy(
                checkRequired("attribute", attribute),
                maxGroups,
                path,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RunStatsGroupBy = apply {
        if (validated) {
            return@apply
        }

        attribute().validate()
        maxGroups()
        path()
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
        (attribute.asKnown().getOrNull()?.validity() ?: 0) +
            (if (maxGroups.asKnown().isPresent) 1 else 0) +
            (if (path.asKnown().isPresent) 1 else 0)

    class Attribute @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NAME = of("name")

            @JvmField val RUN_TYPE = of("run_type")

            @JvmField val TAG = of("tag")

            @JvmField val METADATA = of("metadata")

            @JvmStatic fun of(value: String) = Attribute(JsonField.of(value))
        }

        /** An enum containing [Attribute]'s known values. */
        enum class Known {
            NAME,
            RUN_TYPE,
            TAG,
            METADATA,
        }

        /**
         * An enum containing [Attribute]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Attribute] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NAME,
            RUN_TYPE,
            TAG,
            METADATA,
            /**
             * An enum member indicating that [Attribute] was instantiated with an unknown value.
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
                NAME -> Value.NAME
                RUN_TYPE -> Value.RUN_TYPE
                TAG -> Value.TAG
                METADATA -> Value.METADATA
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                NAME -> Known.NAME
                RUN_TYPE -> Known.RUN_TYPE
                TAG -> Known.TAG
                METADATA -> Known.METADATA
                else -> throw LangsmithApiInvalidDataException("Unknown Attribute: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithApiInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Attribute = apply {
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
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is Attribute && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunStatsGroupBy &&
            attribute == other.attribute &&
            maxGroups == other.maxGroups &&
            path == other.path &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(attribute, maxGroups, path, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RunStatsGroupBy{attribute=$attribute, maxGroups=$maxGroups, path=$path, additionalProperties=$additionalProperties}"
}
