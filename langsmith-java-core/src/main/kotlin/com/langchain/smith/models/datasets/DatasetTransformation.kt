// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

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
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class DatasetTransformation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val path: JsonField<List<String>>,
    private val transformationType: JsonField<TransformationType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("path") @ExcludeMissing path: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("transformation_type")
        @ExcludeMissing
        transformationType: JsonField<TransformationType> = JsonMissing.of(),
    ) : this(path, transformationType, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun path(): List<String> = path.getRequired("path")

    /**
     * Enum for dataset transformation types. Ordering determines the order in which transformations
     * are applied if there are multiple transformations on the same path.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transformationType(): TransformationType =
        transformationType.getRequired("transformation_type")

    /**
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<List<String>> = path

    /**
     * Returns the raw JSON value of [transformationType].
     *
     * Unlike [transformationType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transformation_type")
    @ExcludeMissing
    fun _transformationType(): JsonField<TransformationType> = transformationType

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
         * Returns a mutable builder for constructing an instance of [DatasetTransformation].
         *
         * The following fields are required:
         * ```java
         * .path()
         * .transformationType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetTransformation]. */
    class Builder internal constructor() {

        private var path: JsonField<MutableList<String>>? = null
        private var transformationType: JsonField<TransformationType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetTransformation: DatasetTransformation) = apply {
            path = datasetTransformation.path.map { it.toMutableList() }
            transformationType = datasetTransformation.transformationType
            additionalProperties = datasetTransformation.additionalProperties.toMutableMap()
        }

        fun path(path: List<String>) = path(JsonField.of(path))

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun path(path: JsonField<List<String>>) = apply {
            this.path = path.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.path].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPath(path: String) = apply {
            this.path =
                (this.path ?: JsonField.of(mutableListOf())).also {
                    checkKnown("path", it).add(path)
                }
        }

        /**
         * Enum for dataset transformation types. Ordering determines the order in which
         * transformations are applied if there are multiple transformations on the same path.
         */
        fun transformationType(transformationType: TransformationType) =
            transformationType(JsonField.of(transformationType))

        /**
         * Sets [Builder.transformationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transformationType] with a well-typed
         * [TransformationType] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun transformationType(transformationType: JsonField<TransformationType>) = apply {
            this.transformationType = transformationType
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
         * Returns an immutable instance of [DatasetTransformation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .path()
         * .transformationType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetTransformation =
            DatasetTransformation(
                checkRequired("path", path).map { it.toImmutable() },
                checkRequired("transformationType", transformationType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DatasetTransformation = apply {
        if (validated) {
            return@apply
        }

        path()
        transformationType().validate()
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
        (path.asKnown().getOrNull()?.size ?: 0) +
            (transformationType.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Enum for dataset transformation types. Ordering determines the order in which transformations
     * are applied if there are multiple transformations on the same path.
     */
    class TransformationType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CONVERT_TO_OPENAI_MESSAGE = of("convert_to_openai_message")

            @JvmField val CONVERT_TO_OPENAI_TOOL = of("convert_to_openai_tool")

            @JvmField val REMOVE_SYSTEM_MESSAGES = of("remove_system_messages")

            @JvmField val REMOVE_EXTRA_FIELDS = of("remove_extra_fields")

            @JvmField val EXTRACT_TOOLS_FROM_RUN = of("extract_tools_from_run")

            @JvmStatic fun of(value: String) = TransformationType(JsonField.of(value))
        }

        /** An enum containing [TransformationType]'s known values. */
        enum class Known {
            CONVERT_TO_OPENAI_MESSAGE,
            CONVERT_TO_OPENAI_TOOL,
            REMOVE_SYSTEM_MESSAGES,
            REMOVE_EXTRA_FIELDS,
            EXTRACT_TOOLS_FROM_RUN,
        }

        /**
         * An enum containing [TransformationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransformationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONVERT_TO_OPENAI_MESSAGE,
            CONVERT_TO_OPENAI_TOOL,
            REMOVE_SYSTEM_MESSAGES,
            REMOVE_EXTRA_FIELDS,
            EXTRACT_TOOLS_FROM_RUN,
            /**
             * An enum member indicating that [TransformationType] was instantiated with an unknown
             * value.
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
                CONVERT_TO_OPENAI_MESSAGE -> Value.CONVERT_TO_OPENAI_MESSAGE
                CONVERT_TO_OPENAI_TOOL -> Value.CONVERT_TO_OPENAI_TOOL
                REMOVE_SYSTEM_MESSAGES -> Value.REMOVE_SYSTEM_MESSAGES
                REMOVE_EXTRA_FIELDS -> Value.REMOVE_EXTRA_FIELDS
                EXTRACT_TOOLS_FROM_RUN -> Value.EXTRACT_TOOLS_FROM_RUN
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
                CONVERT_TO_OPENAI_MESSAGE -> Known.CONVERT_TO_OPENAI_MESSAGE
                CONVERT_TO_OPENAI_TOOL -> Known.CONVERT_TO_OPENAI_TOOL
                REMOVE_SYSTEM_MESSAGES -> Known.REMOVE_SYSTEM_MESSAGES
                REMOVE_EXTRA_FIELDS -> Known.REMOVE_EXTRA_FIELDS
                EXTRACT_TOOLS_FROM_RUN -> Known.EXTRACT_TOOLS_FROM_RUN
                else -> throw LangChainInvalidDataException("Unknown TransformationType: $value")
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

        fun validate(): TransformationType = apply {
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

            return other is TransformationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetTransformation &&
            path == other.path &&
            transformationType == other.transformationType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(path, transformationType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DatasetTransformation{path=$path, transformationType=$transformationType, additionalProperties=$additionalProperties}"
}
