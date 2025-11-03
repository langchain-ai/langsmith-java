// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.platform.orgs.current.accesspolicies

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
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ConditionGroup
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val conditions: JsonField<List<Condition>>,
    private val permission: JsonField<Permission>,
    private val resourceType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("conditions")
        @ExcludeMissing
        conditions: JsonField<List<Condition>> = JsonMissing.of(),
        @JsonProperty("permission")
        @ExcludeMissing
        permission: JsonField<Permission> = JsonMissing.of(),
        @JsonProperty("resource_type")
        @ExcludeMissing
        resourceType: JsonField<String> = JsonMissing.of(),
    ) : this(conditions, permission, resourceType, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conditions(): Optional<List<Condition>> = conditions.getOptional("conditions")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permission(): Optional<Permission> = permission.getOptional("permission")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourceType(): Optional<String> = resourceType.getOptional("resource_type")

    /**
     * Returns the raw JSON value of [conditions].
     *
     * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conditions")
    @ExcludeMissing
    fun _conditions(): JsonField<List<Condition>> = conditions

    /**
     * Returns the raw JSON value of [permission].
     *
     * Unlike [permission], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("permission")
    @ExcludeMissing
    fun _permission(): JsonField<Permission> = permission

    /**
     * Returns the raw JSON value of [resourceType].
     *
     * Unlike [resourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resource_type")
    @ExcludeMissing
    fun _resourceType(): JsonField<String> = resourceType

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

        /** Returns a mutable builder for constructing an instance of [ConditionGroup]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ConditionGroup]. */
    class Builder internal constructor() {

        private var conditions: JsonField<MutableList<Condition>>? = null
        private var permission: JsonField<Permission> = JsonMissing.of()
        private var resourceType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(conditionGroup: ConditionGroup) = apply {
            conditions = conditionGroup.conditions.map { it.toMutableList() }
            permission = conditionGroup.permission
            resourceType = conditionGroup.resourceType
            additionalProperties = conditionGroup.additionalProperties.toMutableMap()
        }

        fun conditions(conditions: List<Condition>) = conditions(JsonField.of(conditions))

        /**
         * Sets [Builder.conditions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditions] with a well-typed `List<Condition>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conditions(conditions: JsonField<List<Condition>>) = apply {
            this.conditions = conditions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Condition] to [conditions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCondition(condition: Condition) = apply {
            conditions =
                (conditions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("conditions", it).add(condition)
                }
        }

        fun permission(permission: Permission) = permission(JsonField.of(permission))

        /**
         * Sets [Builder.permission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permission] with a well-typed [Permission] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun permission(permission: JsonField<Permission>) = apply { this.permission = permission }

        fun resourceType(resourceType: String) = resourceType(JsonField.of(resourceType))

        /**
         * Sets [Builder.resourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourceType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resourceType(resourceType: JsonField<String>) = apply {
            this.resourceType = resourceType
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
         * Returns an immutable instance of [ConditionGroup].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConditionGroup =
            ConditionGroup(
                (conditions ?: JsonMissing.of()).map { it.toImmutable() },
                permission,
                resourceType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ConditionGroup = apply {
        if (validated) {
            return@apply
        }

        conditions().ifPresent { it.forEach { it.validate() } }
        permission().ifPresent { it.validate() }
        resourceType()
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
        (conditions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (permission.asKnown().getOrNull()?.validity() ?: 0) +
            (if (resourceType.asKnown().isPresent) 1 else 0)

    class Condition
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val attributeKey: JsonField<String>,
        private val attributeName: JsonField<AttributeName>,
        private val attributeValue: JsonField<String>,
        private val operator: JsonField<Operator>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attribute_key")
            @ExcludeMissing
            attributeKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attribute_name")
            @ExcludeMissing
            attributeName: JsonField<AttributeName> = JsonMissing.of(),
            @JsonProperty("attribute_value")
            @ExcludeMissing
            attributeValue: JsonField<String> = JsonMissing.of(),
            @JsonProperty("operator")
            @ExcludeMissing
            operator: JsonField<Operator> = JsonMissing.of(),
        ) : this(attributeKey, attributeName, attributeValue, operator, mutableMapOf())

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun attributeKey(): Optional<String> = attributeKey.getOptional("attribute_key")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun attributeName(): Optional<AttributeName> = attributeName.getOptional("attribute_name")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun attributeValue(): Optional<String> = attributeValue.getOptional("attribute_value")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun operator(): Optional<Operator> = operator.getOptional("operator")

        /**
         * Returns the raw JSON value of [attributeKey].
         *
         * Unlike [attributeKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attribute_key")
        @ExcludeMissing
        fun _attributeKey(): JsonField<String> = attributeKey

        /**
         * Returns the raw JSON value of [attributeName].
         *
         * Unlike [attributeName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attribute_name")
        @ExcludeMissing
        fun _attributeName(): JsonField<AttributeName> = attributeName

        /**
         * Returns the raw JSON value of [attributeValue].
         *
         * Unlike [attributeValue], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attribute_value")
        @ExcludeMissing
        fun _attributeValue(): JsonField<String> = attributeValue

        /**
         * Returns the raw JSON value of [operator].
         *
         * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

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

            /** Returns a mutable builder for constructing an instance of [Condition]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Condition]. */
        class Builder internal constructor() {

            private var attributeKey: JsonField<String> = JsonMissing.of()
            private var attributeName: JsonField<AttributeName> = JsonMissing.of()
            private var attributeValue: JsonField<String> = JsonMissing.of()
            private var operator: JsonField<Operator> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(condition: Condition) = apply {
                attributeKey = condition.attributeKey
                attributeName = condition.attributeName
                attributeValue = condition.attributeValue
                operator = condition.operator
                additionalProperties = condition.additionalProperties.toMutableMap()
            }

            fun attributeKey(attributeKey: String) = attributeKey(JsonField.of(attributeKey))

            /**
             * Sets [Builder.attributeKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attributeKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attributeKey(attributeKey: JsonField<String>) = apply {
                this.attributeKey = attributeKey
            }

            fun attributeName(attributeName: AttributeName) =
                attributeName(JsonField.of(attributeName))

            /**
             * Sets [Builder.attributeName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attributeName] with a well-typed [AttributeName]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun attributeName(attributeName: JsonField<AttributeName>) = apply {
                this.attributeName = attributeName
            }

            fun attributeValue(attributeValue: String) =
                attributeValue(JsonField.of(attributeValue))

            /**
             * Sets [Builder.attributeValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attributeValue] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attributeValue(attributeValue: JsonField<String>) = apply {
                this.attributeValue = attributeValue
            }

            fun operator(operator: Operator) = operator(JsonField.of(operator))

            /**
             * Sets [Builder.operator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operator] with a well-typed [Operator] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

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
             * Returns an immutable instance of [Condition].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Condition =
                Condition(
                    attributeKey,
                    attributeName,
                    attributeValue,
                    operator,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Condition = apply {
            if (validated) {
                return@apply
            }

            attributeKey()
            attributeName().ifPresent { it.validate() }
            attributeValue()
            operator().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (attributeKey.asKnown().isPresent) 1 else 0) +
                (attributeName.asKnown().getOrNull()?.validity() ?: 0) +
                (if (attributeValue.asKnown().isPresent) 1 else 0) +
                (operator.asKnown().getOrNull()?.validity() ?: 0)

        class AttributeName @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val RESOURCE_TAG_KEY = of("resource_tag_key")

                @JvmStatic fun of(value: String) = AttributeName(JsonField.of(value))
            }

            /** An enum containing [AttributeName]'s known values. */
            enum class Known {
                RESOURCE_TAG_KEY
            }

            /**
             * An enum containing [AttributeName]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AttributeName] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                RESOURCE_TAG_KEY,
                /**
                 * An enum member indicating that [AttributeName] was instantiated with an unknown
                 * value.
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
                    RESOURCE_TAG_KEY -> Value.RESOURCE_TAG_KEY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangsmithInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    RESOURCE_TAG_KEY -> Known.RESOURCE_TAG_KEY
                    else -> throw LangsmithInvalidDataException("Unknown AttributeName: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangsmithInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangsmithInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): AttributeName = apply {
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
                } catch (e: LangsmithInvalidDataException) {
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

                return other is AttributeName && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val EQUALS = of("equals")

                @JvmField val NOT_EQUALS = of("not_equals")

                @JvmField val EQUALS_IGNORE_CASE = of("equals_ignore_case")

                @JvmField val NOT_EQUALS_IGNORE_CASE = of("not_equals_ignore_case")

                @JvmField val MATCHES = of("matches")

                @JvmField val NOT_MATCHES = of("not_matches")

                @JvmField val NOT_EQUALS_IF_EXISTS = of("not_equals_if_exists")

                @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
            }

            /** An enum containing [Operator]'s known values. */
            enum class Known {
                EQUALS,
                NOT_EQUALS,
                EQUALS_IGNORE_CASE,
                NOT_EQUALS_IGNORE_CASE,
                MATCHES,
                NOT_MATCHES,
                NOT_EQUALS_IF_EXISTS,
            }

            /**
             * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Operator] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EQUALS,
                NOT_EQUALS,
                EQUALS_IGNORE_CASE,
                NOT_EQUALS_IGNORE_CASE,
                MATCHES,
                NOT_MATCHES,
                NOT_EQUALS_IF_EXISTS,
                /**
                 * An enum member indicating that [Operator] was instantiated with an unknown value.
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
                    EQUALS -> Value.EQUALS
                    NOT_EQUALS -> Value.NOT_EQUALS
                    EQUALS_IGNORE_CASE -> Value.EQUALS_IGNORE_CASE
                    NOT_EQUALS_IGNORE_CASE -> Value.NOT_EQUALS_IGNORE_CASE
                    MATCHES -> Value.MATCHES
                    NOT_MATCHES -> Value.NOT_MATCHES
                    NOT_EQUALS_IF_EXISTS -> Value.NOT_EQUALS_IF_EXISTS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangsmithInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    EQUALS -> Known.EQUALS
                    NOT_EQUALS -> Known.NOT_EQUALS
                    EQUALS_IGNORE_CASE -> Known.EQUALS_IGNORE_CASE
                    NOT_EQUALS_IGNORE_CASE -> Known.NOT_EQUALS_IGNORE_CASE
                    MATCHES -> Known.MATCHES
                    NOT_MATCHES -> Known.NOT_MATCHES
                    NOT_EQUALS_IF_EXISTS -> Known.NOT_EQUALS_IF_EXISTS
                    else -> throw LangsmithInvalidDataException("Unknown Operator: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangsmithInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangsmithInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Operator = apply {
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
                } catch (e: LangsmithInvalidDataException) {
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

                return other is Operator && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Condition &&
                attributeKey == other.attributeKey &&
                attributeName == other.attributeName &&
                attributeValue == other.attributeValue &&
                operator == other.operator &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                attributeKey,
                attributeName,
                attributeValue,
                operator,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Condition{attributeKey=$attributeKey, attributeName=$attributeName, attributeValue=$attributeValue, operator=$operator, additionalProperties=$additionalProperties}"
    }

    class Permission @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ANNOTATION_QUEUES_CREATE = of("annotation-queues:create")

            @JvmField val ANNOTATION_QUEUES_DELETE = of("annotation-queues:delete")

            @JvmField val ANNOTATION_QUEUES_READ = of("annotation-queues:read")

            @JvmField val ANNOTATION_QUEUES_UPDATE = of("annotation-queues:update")

            @JvmField val CHARTS_CREATE = of("charts:create")

            @JvmField val CHARTS_DELETE = of("charts:delete")

            @JvmField val CHARTS_READ = of("charts:read")

            @JvmField val CHARTS_UPDATE = of("charts:update")

            @JvmField val DATASETS_CREATE = of("datasets:create")

            @JvmField val DATASETS_DELETE = of("datasets:delete")

            @JvmField val DATASETS_READ = of("datasets:read")

            @JvmField val DATASETS_SHARE = of("datasets:share")

            @JvmField val DATASETS_UPDATE = of("datasets:update")

            @JvmField val DEPLOYMENTS_CREATE = of("deployments:create")

            @JvmField val DEPLOYMENTS_DELETE = of("deployments:delete")

            @JvmField val DEPLOYMENTS_READ = of("deployments:read")

            @JvmField val DEPLOYMENTS_UPDATE = of("deployments:update")

            @JvmField val FEEDBACK_CREATE = of("feedback:create")

            @JvmField val FEEDBACK_DELETE = of("feedback:delete")

            @JvmField val FEEDBACK_READ = of("feedback:read")

            @JvmField val FEEDBACK_UPDATE = of("feedback:update")

            @JvmField val PROJECTS_CREATE = of("projects:create")

            @JvmField val PROJECTS_DELETE = of("projects:delete")

            @JvmField val PROJECTS_READ = of("projects:read")

            @JvmField val PROJECTS_UPDATE = of("projects:update")

            @JvmField val PROMPTS_CREATE = of("prompts:create")

            @JvmField val PROMPTS_DELETE = of("prompts:delete")

            @JvmField val PROMPTS_READ = of("prompts:read")

            @JvmField val PROMPTS_UPDATE = of("prompts:update")

            @JvmField val PROMPTS_SHARE = of("prompts:share")

            @JvmField val RULES_CREATE = of("rules:create")

            @JvmField val RULES_DELETE = of("rules:delete")

            @JvmField val RULES_READ = of("rules:read")

            @JvmField val RULES_UPDATE = of("rules:update")

            @JvmField val RUNS_CREATE = of("runs:create")

            @JvmField val RUNS_READ = of("runs:read")

            @JvmField val RUNS_SHARE = of("runs:share")

            @JvmField val RUNS_DELETE = of("runs:delete")

            @JvmField val WORKSPACES_MANAGE = of("workspaces:manage")

            @JvmField val WORKSPACES_READ = of("workspaces:read")

            @JvmField val ALERTS_CREATE = of("alerts:create")

            @JvmField val ALERTS_UPDATE = of("alerts:update")

            @JvmField val ALERTS_DELETE = of("alerts:delete")

            @JvmField val ALERTS_READ = of("alerts:read")

            @JvmField val ORGANIZATION_PATS_CREATE = of("organization:pats:create")

            @JvmField val ORGANIZATION_READ = of("organization:read")

            @JvmField val ORGANIZATION_MANAGE = of("organization:manage")

            @JvmStatic fun of(value: String) = Permission(JsonField.of(value))
        }

        /** An enum containing [Permission]'s known values. */
        enum class Known {
            ANNOTATION_QUEUES_CREATE,
            ANNOTATION_QUEUES_DELETE,
            ANNOTATION_QUEUES_READ,
            ANNOTATION_QUEUES_UPDATE,
            CHARTS_CREATE,
            CHARTS_DELETE,
            CHARTS_READ,
            CHARTS_UPDATE,
            DATASETS_CREATE,
            DATASETS_DELETE,
            DATASETS_READ,
            DATASETS_SHARE,
            DATASETS_UPDATE,
            DEPLOYMENTS_CREATE,
            DEPLOYMENTS_DELETE,
            DEPLOYMENTS_READ,
            DEPLOYMENTS_UPDATE,
            FEEDBACK_CREATE,
            FEEDBACK_DELETE,
            FEEDBACK_READ,
            FEEDBACK_UPDATE,
            PROJECTS_CREATE,
            PROJECTS_DELETE,
            PROJECTS_READ,
            PROJECTS_UPDATE,
            PROMPTS_CREATE,
            PROMPTS_DELETE,
            PROMPTS_READ,
            PROMPTS_UPDATE,
            PROMPTS_SHARE,
            RULES_CREATE,
            RULES_DELETE,
            RULES_READ,
            RULES_UPDATE,
            RUNS_CREATE,
            RUNS_READ,
            RUNS_SHARE,
            RUNS_DELETE,
            WORKSPACES_MANAGE,
            WORKSPACES_READ,
            ALERTS_CREATE,
            ALERTS_UPDATE,
            ALERTS_DELETE,
            ALERTS_READ,
            ORGANIZATION_PATS_CREATE,
            ORGANIZATION_READ,
            ORGANIZATION_MANAGE,
        }

        /**
         * An enum containing [Permission]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Permission] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ANNOTATION_QUEUES_CREATE,
            ANNOTATION_QUEUES_DELETE,
            ANNOTATION_QUEUES_READ,
            ANNOTATION_QUEUES_UPDATE,
            CHARTS_CREATE,
            CHARTS_DELETE,
            CHARTS_READ,
            CHARTS_UPDATE,
            DATASETS_CREATE,
            DATASETS_DELETE,
            DATASETS_READ,
            DATASETS_SHARE,
            DATASETS_UPDATE,
            DEPLOYMENTS_CREATE,
            DEPLOYMENTS_DELETE,
            DEPLOYMENTS_READ,
            DEPLOYMENTS_UPDATE,
            FEEDBACK_CREATE,
            FEEDBACK_DELETE,
            FEEDBACK_READ,
            FEEDBACK_UPDATE,
            PROJECTS_CREATE,
            PROJECTS_DELETE,
            PROJECTS_READ,
            PROJECTS_UPDATE,
            PROMPTS_CREATE,
            PROMPTS_DELETE,
            PROMPTS_READ,
            PROMPTS_UPDATE,
            PROMPTS_SHARE,
            RULES_CREATE,
            RULES_DELETE,
            RULES_READ,
            RULES_UPDATE,
            RUNS_CREATE,
            RUNS_READ,
            RUNS_SHARE,
            RUNS_DELETE,
            WORKSPACES_MANAGE,
            WORKSPACES_READ,
            ALERTS_CREATE,
            ALERTS_UPDATE,
            ALERTS_DELETE,
            ALERTS_READ,
            ORGANIZATION_PATS_CREATE,
            ORGANIZATION_READ,
            ORGANIZATION_MANAGE,
            /**
             * An enum member indicating that [Permission] was instantiated with an unknown value.
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
                ANNOTATION_QUEUES_CREATE -> Value.ANNOTATION_QUEUES_CREATE
                ANNOTATION_QUEUES_DELETE -> Value.ANNOTATION_QUEUES_DELETE
                ANNOTATION_QUEUES_READ -> Value.ANNOTATION_QUEUES_READ
                ANNOTATION_QUEUES_UPDATE -> Value.ANNOTATION_QUEUES_UPDATE
                CHARTS_CREATE -> Value.CHARTS_CREATE
                CHARTS_DELETE -> Value.CHARTS_DELETE
                CHARTS_READ -> Value.CHARTS_READ
                CHARTS_UPDATE -> Value.CHARTS_UPDATE
                DATASETS_CREATE -> Value.DATASETS_CREATE
                DATASETS_DELETE -> Value.DATASETS_DELETE
                DATASETS_READ -> Value.DATASETS_READ
                DATASETS_SHARE -> Value.DATASETS_SHARE
                DATASETS_UPDATE -> Value.DATASETS_UPDATE
                DEPLOYMENTS_CREATE -> Value.DEPLOYMENTS_CREATE
                DEPLOYMENTS_DELETE -> Value.DEPLOYMENTS_DELETE
                DEPLOYMENTS_READ -> Value.DEPLOYMENTS_READ
                DEPLOYMENTS_UPDATE -> Value.DEPLOYMENTS_UPDATE
                FEEDBACK_CREATE -> Value.FEEDBACK_CREATE
                FEEDBACK_DELETE -> Value.FEEDBACK_DELETE
                FEEDBACK_READ -> Value.FEEDBACK_READ
                FEEDBACK_UPDATE -> Value.FEEDBACK_UPDATE
                PROJECTS_CREATE -> Value.PROJECTS_CREATE
                PROJECTS_DELETE -> Value.PROJECTS_DELETE
                PROJECTS_READ -> Value.PROJECTS_READ
                PROJECTS_UPDATE -> Value.PROJECTS_UPDATE
                PROMPTS_CREATE -> Value.PROMPTS_CREATE
                PROMPTS_DELETE -> Value.PROMPTS_DELETE
                PROMPTS_READ -> Value.PROMPTS_READ
                PROMPTS_UPDATE -> Value.PROMPTS_UPDATE
                PROMPTS_SHARE -> Value.PROMPTS_SHARE
                RULES_CREATE -> Value.RULES_CREATE
                RULES_DELETE -> Value.RULES_DELETE
                RULES_READ -> Value.RULES_READ
                RULES_UPDATE -> Value.RULES_UPDATE
                RUNS_CREATE -> Value.RUNS_CREATE
                RUNS_READ -> Value.RUNS_READ
                RUNS_SHARE -> Value.RUNS_SHARE
                RUNS_DELETE -> Value.RUNS_DELETE
                WORKSPACES_MANAGE -> Value.WORKSPACES_MANAGE
                WORKSPACES_READ -> Value.WORKSPACES_READ
                ALERTS_CREATE -> Value.ALERTS_CREATE
                ALERTS_UPDATE -> Value.ALERTS_UPDATE
                ALERTS_DELETE -> Value.ALERTS_DELETE
                ALERTS_READ -> Value.ALERTS_READ
                ORGANIZATION_PATS_CREATE -> Value.ORGANIZATION_PATS_CREATE
                ORGANIZATION_READ -> Value.ORGANIZATION_READ
                ORGANIZATION_MANAGE -> Value.ORGANIZATION_MANAGE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ANNOTATION_QUEUES_CREATE -> Known.ANNOTATION_QUEUES_CREATE
                ANNOTATION_QUEUES_DELETE -> Known.ANNOTATION_QUEUES_DELETE
                ANNOTATION_QUEUES_READ -> Known.ANNOTATION_QUEUES_READ
                ANNOTATION_QUEUES_UPDATE -> Known.ANNOTATION_QUEUES_UPDATE
                CHARTS_CREATE -> Known.CHARTS_CREATE
                CHARTS_DELETE -> Known.CHARTS_DELETE
                CHARTS_READ -> Known.CHARTS_READ
                CHARTS_UPDATE -> Known.CHARTS_UPDATE
                DATASETS_CREATE -> Known.DATASETS_CREATE
                DATASETS_DELETE -> Known.DATASETS_DELETE
                DATASETS_READ -> Known.DATASETS_READ
                DATASETS_SHARE -> Known.DATASETS_SHARE
                DATASETS_UPDATE -> Known.DATASETS_UPDATE
                DEPLOYMENTS_CREATE -> Known.DEPLOYMENTS_CREATE
                DEPLOYMENTS_DELETE -> Known.DEPLOYMENTS_DELETE
                DEPLOYMENTS_READ -> Known.DEPLOYMENTS_READ
                DEPLOYMENTS_UPDATE -> Known.DEPLOYMENTS_UPDATE
                FEEDBACK_CREATE -> Known.FEEDBACK_CREATE
                FEEDBACK_DELETE -> Known.FEEDBACK_DELETE
                FEEDBACK_READ -> Known.FEEDBACK_READ
                FEEDBACK_UPDATE -> Known.FEEDBACK_UPDATE
                PROJECTS_CREATE -> Known.PROJECTS_CREATE
                PROJECTS_DELETE -> Known.PROJECTS_DELETE
                PROJECTS_READ -> Known.PROJECTS_READ
                PROJECTS_UPDATE -> Known.PROJECTS_UPDATE
                PROMPTS_CREATE -> Known.PROMPTS_CREATE
                PROMPTS_DELETE -> Known.PROMPTS_DELETE
                PROMPTS_READ -> Known.PROMPTS_READ
                PROMPTS_UPDATE -> Known.PROMPTS_UPDATE
                PROMPTS_SHARE -> Known.PROMPTS_SHARE
                RULES_CREATE -> Known.RULES_CREATE
                RULES_DELETE -> Known.RULES_DELETE
                RULES_READ -> Known.RULES_READ
                RULES_UPDATE -> Known.RULES_UPDATE
                RUNS_CREATE -> Known.RUNS_CREATE
                RUNS_READ -> Known.RUNS_READ
                RUNS_SHARE -> Known.RUNS_SHARE
                RUNS_DELETE -> Known.RUNS_DELETE
                WORKSPACES_MANAGE -> Known.WORKSPACES_MANAGE
                WORKSPACES_READ -> Known.WORKSPACES_READ
                ALERTS_CREATE -> Known.ALERTS_CREATE
                ALERTS_UPDATE -> Known.ALERTS_UPDATE
                ALERTS_DELETE -> Known.ALERTS_DELETE
                ALERTS_READ -> Known.ALERTS_READ
                ORGANIZATION_PATS_CREATE -> Known.ORGANIZATION_PATS_CREATE
                ORGANIZATION_READ -> Known.ORGANIZATION_READ
                ORGANIZATION_MANAGE -> Known.ORGANIZATION_MANAGE
                else -> throw LangsmithInvalidDataException("Unknown Permission: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Permission = apply {
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
            } catch (e: LangsmithInvalidDataException) {
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

            return other is Permission && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConditionGroup &&
            conditions == other.conditions &&
            permission == other.permission &&
            resourceType == other.resourceType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(conditions, permission, resourceType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConditionGroup{conditions=$conditions, permission=$permission, resourceType=$resourceType, additionalProperties=$additionalProperties}"
}
