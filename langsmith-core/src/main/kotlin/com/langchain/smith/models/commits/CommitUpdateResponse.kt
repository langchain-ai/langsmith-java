// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class CommitUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val commit: JsonField<CommitWithLookups>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("commit")
        @ExcludeMissing
        commit: JsonField<CommitWithLookups> = JsonMissing.of()
    ) : this(commit, mutableMapOf())

    /**
     * All database fields for commits, plus helpful computed fields and user info for private
     * prompts.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun commit(): CommitWithLookups = commit.getRequired("commit")

    /**
     * Returns the raw JSON value of [commit].
     *
     * Unlike [commit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commit") @ExcludeMissing fun _commit(): JsonField<CommitWithLookups> = commit

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
         * Returns a mutable builder for constructing an instance of [CommitUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .commit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitUpdateResponse]. */
    class Builder internal constructor() {

        private var commit: JsonField<CommitWithLookups>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commitUpdateResponse: CommitUpdateResponse) = apply {
            commit = commitUpdateResponse.commit
            additionalProperties = commitUpdateResponse.additionalProperties.toMutableMap()
        }

        /**
         * All database fields for commits, plus helpful computed fields and user info for private
         * prompts.
         */
        fun commit(commit: CommitWithLookups) = commit(JsonField.of(commit))

        /**
         * Sets [Builder.commit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commit] with a well-typed [CommitWithLookups] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commit(commit: JsonField<CommitWithLookups>) = apply { this.commit = commit }

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
         * Returns an immutable instance of [CommitUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .commit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CommitUpdateResponse =
            CommitUpdateResponse(
                checkRequired("commit", commit),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CommitUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        commit().validate()
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
    @JvmSynthetic internal fun validity(): Int = (commit.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitUpdateResponse &&
            commit == other.commit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(commit, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommitUpdateResponse{commit=$commit, additionalProperties=$additionalProperties}"
}
