// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets.versions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Dataset diff schema. */
class VersionRetrieveDiffResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val examplesAdded: JsonField<List<String>>,
    private val examplesModified: JsonField<List<String>>,
    private val examplesRemoved: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("examples_added")
        @ExcludeMissing
        examplesAdded: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("examples_modified")
        @ExcludeMissing
        examplesModified: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("examples_removed")
        @ExcludeMissing
        examplesRemoved: JsonField<List<String>> = JsonMissing.of(),
    ) : this(examplesAdded, examplesModified, examplesRemoved, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun examplesAdded(): List<String> = examplesAdded.getRequired("examples_added")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun examplesModified(): List<String> = examplesModified.getRequired("examples_modified")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun examplesRemoved(): List<String> = examplesRemoved.getRequired("examples_removed")

    /**
     * Returns the raw JSON value of [examplesAdded].
     *
     * Unlike [examplesAdded], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("examples_added")
    @ExcludeMissing
    fun _examplesAdded(): JsonField<List<String>> = examplesAdded

    /**
     * Returns the raw JSON value of [examplesModified].
     *
     * Unlike [examplesModified], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("examples_modified")
    @ExcludeMissing
    fun _examplesModified(): JsonField<List<String>> = examplesModified

    /**
     * Returns the raw JSON value of [examplesRemoved].
     *
     * Unlike [examplesRemoved], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("examples_removed")
    @ExcludeMissing
    fun _examplesRemoved(): JsonField<List<String>> = examplesRemoved

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
         * Returns a mutable builder for constructing an instance of [VersionRetrieveDiffResponse].
         *
         * The following fields are required:
         * ```java
         * .examplesAdded()
         * .examplesModified()
         * .examplesRemoved()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VersionRetrieveDiffResponse]. */
    class Builder internal constructor() {

        private var examplesAdded: JsonField<MutableList<String>>? = null
        private var examplesModified: JsonField<MutableList<String>>? = null
        private var examplesRemoved: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(versionRetrieveDiffResponse: VersionRetrieveDiffResponse) = apply {
            examplesAdded = versionRetrieveDiffResponse.examplesAdded.map { it.toMutableList() }
            examplesModified =
                versionRetrieveDiffResponse.examplesModified.map { it.toMutableList() }
            examplesRemoved = versionRetrieveDiffResponse.examplesRemoved.map { it.toMutableList() }
            additionalProperties = versionRetrieveDiffResponse.additionalProperties.toMutableMap()
        }

        fun examplesAdded(examplesAdded: List<String>) = examplesAdded(JsonField.of(examplesAdded))

        /**
         * Sets [Builder.examplesAdded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.examplesAdded] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun examplesAdded(examplesAdded: JsonField<List<String>>) = apply {
            this.examplesAdded = examplesAdded.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.examplesAdded].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExamplesAdded(examplesAdded: String) = apply {
            this.examplesAdded =
                (this.examplesAdded ?: JsonField.of(mutableListOf())).also {
                    checkKnown("examplesAdded", it).add(examplesAdded)
                }
        }

        fun examplesModified(examplesModified: List<String>) =
            examplesModified(JsonField.of(examplesModified))

        /**
         * Sets [Builder.examplesModified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.examplesModified] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun examplesModified(examplesModified: JsonField<List<String>>) = apply {
            this.examplesModified = examplesModified.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.examplesModified].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExamplesModified(examplesModified: String) = apply {
            this.examplesModified =
                (this.examplesModified ?: JsonField.of(mutableListOf())).also {
                    checkKnown("examplesModified", it).add(examplesModified)
                }
        }

        fun examplesRemoved(examplesRemoved: List<String>) =
            examplesRemoved(JsonField.of(examplesRemoved))

        /**
         * Sets [Builder.examplesRemoved] to an arbitrary JSON value.
         *
         * You should usually call [Builder.examplesRemoved] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun examplesRemoved(examplesRemoved: JsonField<List<String>>) = apply {
            this.examplesRemoved = examplesRemoved.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.examplesRemoved].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExamplesRemoved(examplesRemoved: String) = apply {
            this.examplesRemoved =
                (this.examplesRemoved ?: JsonField.of(mutableListOf())).also {
                    checkKnown("examplesRemoved", it).add(examplesRemoved)
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
         * Returns an immutable instance of [VersionRetrieveDiffResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .examplesAdded()
         * .examplesModified()
         * .examplesRemoved()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VersionRetrieveDiffResponse =
            VersionRetrieveDiffResponse(
                checkRequired("examplesAdded", examplesAdded).map { it.toImmutable() },
                checkRequired("examplesModified", examplesModified).map { it.toImmutable() },
                checkRequired("examplesRemoved", examplesRemoved).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VersionRetrieveDiffResponse = apply {
        if (validated) {
            return@apply
        }

        examplesAdded()
        examplesModified()
        examplesRemoved()
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
        (examplesAdded.asKnown().getOrNull()?.size ?: 0) +
            (examplesModified.asKnown().getOrNull()?.size ?: 0) +
            (examplesRemoved.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VersionRetrieveDiffResponse &&
            examplesAdded == other.examplesAdded &&
            examplesModified == other.examplesModified &&
            examplesRemoved == other.examplesRemoved &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(examplesAdded, examplesModified, examplesRemoved, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VersionRetrieveDiffResponse{examplesAdded=$examplesAdded, examplesModified=$examplesModified, examplesRemoved=$examplesRemoved, additionalProperties=$additionalProperties}"
}
