// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Response to preview a thread. */
class RunRetrieveThreadPreviewResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val previews: JsonField<Previews>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("previews") @ExcludeMissing previews: JsonField<Previews> = JsonMissing.of()
    ) : this(previews, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun previews(): Previews = previews.getRequired("previews")

    /**
     * Returns the raw JSON value of [previews].
     *
     * Unlike [previews], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previews") @ExcludeMissing fun _previews(): JsonField<Previews> = previews

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
         * [RunRetrieveThreadPreviewResponse].
         *
         * The following fields are required:
         * ```java
         * .previews()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunRetrieveThreadPreviewResponse]. */
    class Builder internal constructor() {

        private var previews: JsonField<Previews>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runRetrieveThreadPreviewResponse: RunRetrieveThreadPreviewResponse) =
            apply {
                previews = runRetrieveThreadPreviewResponse.previews
                additionalProperties =
                    runRetrieveThreadPreviewResponse.additionalProperties.toMutableMap()
            }

        fun previews(previews: Previews) = previews(JsonField.of(previews))

        /**
         * Sets [Builder.previews] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previews] with a well-typed [Previews] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun previews(previews: JsonField<Previews>) = apply { this.previews = previews }

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
         * Returns an immutable instance of [RunRetrieveThreadPreviewResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .previews()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunRetrieveThreadPreviewResponse =
            RunRetrieveThreadPreviewResponse(
                checkRequired("previews", previews),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RunRetrieveThreadPreviewResponse = apply {
        if (validated) {
            return@apply
        }

        previews().validate()
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
    @JvmSynthetic internal fun validity(): Int = (previews.asKnown().getOrNull()?.validity() ?: 0)

    class Previews
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Previews]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Previews]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(previews: Previews) = apply {
                additionalProperties = previews.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Previews].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Previews = Previews(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Previews = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Previews && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Previews{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunRetrieveThreadPreviewResponse &&
            previews == other.previews &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(previews, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RunRetrieveThreadPreviewResponse{previews=$previews, additionalProperties=$additionalProperties}"
}
