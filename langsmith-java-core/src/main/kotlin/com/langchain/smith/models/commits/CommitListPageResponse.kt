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
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CommitListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val commits: JsonField<List<CommitWithLookups>>,
    private val nextCursor: JsonField<String>,
    private val total: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("commits")
        @ExcludeMissing
        commits: JsonField<List<CommitWithLookups>> = JsonMissing.of(),
        @JsonProperty("next_cursor")
        @ExcludeMissing
        nextCursor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
    ) : this(commits, nextCursor, total, mutableMapOf())

    /**
     * List of commits with lookup information
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commits(): Optional<List<CommitWithLookups>> = commits.getOptional("commits")

    /**
     * NextCursor is the cursor for the next page, or null when there are no more commits.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextCursor(): Optional<String> = nextCursor.getOptional("next_cursor")

    /**
     * Total number of commits
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun total(): Optional<Long> = total.getOptional("total")

    /**
     * Returns the raw JSON value of [commits].
     *
     * Unlike [commits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commits")
    @ExcludeMissing
    fun _commits(): JsonField<List<CommitWithLookups>> = commits

    /**
     * Returns the raw JSON value of [nextCursor].
     *
     * Unlike [nextCursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_cursor") @ExcludeMissing fun _nextCursor(): JsonField<String> = nextCursor

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

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

        /** Returns a mutable builder for constructing an instance of [CommitListPageResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitListPageResponse]. */
    class Builder internal constructor() {

        private var commits: JsonField<MutableList<CommitWithLookups>>? = null
        private var nextCursor: JsonField<String> = JsonMissing.of()
        private var total: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commitListPageResponse: CommitListPageResponse) = apply {
            commits = commitListPageResponse.commits.map { it.toMutableList() }
            nextCursor = commitListPageResponse.nextCursor
            total = commitListPageResponse.total
            additionalProperties = commitListPageResponse.additionalProperties.toMutableMap()
        }

        /** List of commits with lookup information */
        fun commits(commits: List<CommitWithLookups>) = commits(JsonField.of(commits))

        /**
         * Sets [Builder.commits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commits] with a well-typed `List<CommitWithLookups>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun commits(commits: JsonField<List<CommitWithLookups>>) = apply {
            this.commits = commits.map { it.toMutableList() }
        }

        /**
         * Adds a single [CommitWithLookups] to [commits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCommit(commit: CommitWithLookups) = apply {
            commits =
                (commits ?: JsonField.of(mutableListOf())).also {
                    checkKnown("commits", it).add(commit)
                }
        }

        /** NextCursor is the cursor for the next page, or null when there are no more commits. */
        fun nextCursor(nextCursor: String?) = nextCursor(JsonField.ofNullable(nextCursor))

        /** Alias for calling [Builder.nextCursor] with `nextCursor.orElse(null)`. */
        fun nextCursor(nextCursor: Optional<String>) = nextCursor(nextCursor.getOrNull())

        /**
         * Sets [Builder.nextCursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextCursor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

        /** Total number of commits */
        fun total(total: Long) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Long>) = apply { this.total = total }

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
         * Returns an immutable instance of [CommitListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CommitListPageResponse =
            CommitListPageResponse(
                (commits ?: JsonMissing.of()).map { it.toImmutable() },
                nextCursor,
                total,
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
    fun validate(): CommitListPageResponse = apply {
        if (validated) {
            return@apply
        }

        commits().ifPresent { it.forEach { it.validate() } }
        nextCursor()
        total()
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
        (commits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextCursor.asKnown().isPresent) 1 else 0) +
            (if (total.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitListPageResponse &&
            commits == other.commits &&
            nextCursor == other.nextCursor &&
            total == other.total &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(commits, nextCursor, total, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommitListPageResponse{commits=$commits, nextCursor=$nextCursor, total=$total, additionalProperties=$additionalProperties}"
}
