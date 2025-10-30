// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

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
import com.langchain.smith.errors.LangsmithInvalidDataException
import com.langchain.smith.models.sessions.CustomChartsSection
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class CustomChartsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val sections: JsonField<List<CustomChartsSection>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("sections")
        @ExcludeMissing
        sections: JsonField<List<CustomChartsSection>> = JsonMissing.of()
    ) : this(sections, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sections(): List<CustomChartsSection> = sections.getRequired("sections")

    /**
     * Returns the raw JSON value of [sections].
     *
     * Unlike [sections], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sections")
    @ExcludeMissing
    fun _sections(): JsonField<List<CustomChartsSection>> = sections

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
         * Returns a mutable builder for constructing an instance of [CustomChartsResponse].
         *
         * The following fields are required:
         * ```java
         * .sections()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomChartsResponse]. */
    class Builder internal constructor() {

        private var sections: JsonField<MutableList<CustomChartsSection>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customChartsResponse: CustomChartsResponse) = apply {
            sections = customChartsResponse.sections.map { it.toMutableList() }
            additionalProperties = customChartsResponse.additionalProperties.toMutableMap()
        }

        fun sections(sections: List<CustomChartsSection>) = sections(JsonField.of(sections))

        /**
         * Sets [Builder.sections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sections] with a well-typed `List<CustomChartsSection>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sections(sections: JsonField<List<CustomChartsSection>>) = apply {
            this.sections = sections.map { it.toMutableList() }
        }

        /**
         * Adds a single [CustomChartsSection] to [sections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSection(section: CustomChartsSection) = apply {
            sections =
                (sections ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sections", it).add(section)
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
         * Returns an immutable instance of [CustomChartsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sections()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomChartsResponse =
            CustomChartsResponse(
                checkRequired("sections", sections).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomChartsResponse = apply {
        if (validated) {
            return@apply
        }

        sections().forEach { it.validate() }
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
        (sections.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChartsResponse &&
            sections == other.sections &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(sections, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomChartsResponse{sections=$sections, additionalProperties=$additionalProperties}"
}
