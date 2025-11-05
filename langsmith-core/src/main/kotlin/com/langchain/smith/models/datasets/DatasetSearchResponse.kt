// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

/** Dataset schema for serving. */
class DatasetSearchResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val examples: JsonField<List<Example>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("examples")
        @ExcludeMissing
        examples: JsonField<List<Example>> = JsonMissing.of()
    ) : this(examples, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun examples(): List<Example> = examples.getRequired("examples")

    /**
     * Returns the raw JSON value of [examples].
     *
     * Unlike [examples], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("examples") @ExcludeMissing fun _examples(): JsonField<List<Example>> = examples

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
         * Returns a mutable builder for constructing an instance of [DatasetSearchResponse].
         *
         * The following fields are required:
         * ```java
         * .examples()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetSearchResponse]. */
    class Builder internal constructor() {

        private var examples: JsonField<MutableList<Example>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetSearchResponse: DatasetSearchResponse) = apply {
            examples = datasetSearchResponse.examples.map { it.toMutableList() }
            additionalProperties = datasetSearchResponse.additionalProperties.toMutableMap()
        }

        fun examples(examples: List<Example>) = examples(JsonField.of(examples))

        /**
         * Sets [Builder.examples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.examples] with a well-typed `List<Example>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun examples(examples: JsonField<List<Example>>) = apply {
            this.examples = examples.map { it.toMutableList() }
        }

        /**
         * Adds a single [Example] to [examples].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExample(example: Example) = apply {
            examples =
                (examples ?: JsonField.of(mutableListOf())).also {
                    checkKnown("examples", it).add(example)
                }
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
         * Returns an immutable instance of [DatasetSearchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .examples()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetSearchResponse =
            DatasetSearchResponse(
                checkRequired("examples", examples).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DatasetSearchResponse = apply {
        if (validated) {
            return@apply
        }

        examples().forEach { it.validate() }
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
        (examples.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** Dataset schema for serving. */
    class Example
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val inputs: JsonValue,
        private val outputs: JsonValue,
        private val debugInfo: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inputs") @ExcludeMissing inputs: JsonValue = JsonMissing.of(),
            @JsonProperty("outputs") @ExcludeMissing outputs: JsonValue = JsonMissing.of(),
            @JsonProperty("debug_info") @ExcludeMissing debugInfo: JsonValue = JsonMissing.of(),
        ) : this(id, inputs, outputs, debugInfo, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonValue = inputs

        @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonValue = outputs

        @JsonProperty("debug_info") @ExcludeMissing fun _debugInfo(): JsonValue = debugInfo

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
             * Returns a mutable builder for constructing an instance of [Example].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .inputs()
             * .outputs()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Example]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var inputs: JsonValue? = null
            private var outputs: JsonValue? = null
            private var debugInfo: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(example: Example) = apply {
                id = example.id
                inputs = example.inputs
                outputs = example.outputs
                debugInfo = example.debugInfo
                additionalProperties = example.additionalProperties.toMutableMap()
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

            fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

            fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

            fun debugInfo(debugInfo: JsonValue) = apply { this.debugInfo = debugInfo }

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
             * Returns an immutable instance of [Example].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .inputs()
             * .outputs()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Example =
                Example(
                    checkRequired("id", id),
                    checkRequired("inputs", inputs),
                    checkRequired("outputs", outputs),
                    debugInfo,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Example = apply {
            if (validated) {
                return@apply
            }

            id()
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
        @JvmSynthetic internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Example &&
                id == other.id &&
                inputs == other.inputs &&
                outputs == other.outputs &&
                debugInfo == other.debugInfo &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, inputs, outputs, debugInfo, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Example{id=$id, inputs=$inputs, outputs=$outputs, debugInfo=$debugInfo, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetSearchResponse &&
            examples == other.examples &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(examples, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DatasetSearchResponse{examples=$examples, additionalProperties=$additionalProperties}"
}
