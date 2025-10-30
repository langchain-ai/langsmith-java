// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos

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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class RepoListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val repos: JsonField<List<RepoWithLookups>>,
    private val total: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("repos")
        @ExcludeMissing
        repos: JsonField<List<RepoWithLookups>> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
    ) : this(repos, total, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun repos(): List<RepoWithLookups> = repos.getRequired("repos")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): Long = total.getRequired("total")

    /**
     * Returns the raw JSON value of [repos].
     *
     * Unlike [repos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("repos") @ExcludeMissing fun _repos(): JsonField<List<RepoWithLookups>> = repos

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

        /**
         * Returns a mutable builder for constructing an instance of [RepoListResponse].
         *
         * The following fields are required:
         * ```java
         * .repos()
         * .total()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RepoListResponse]. */
    class Builder internal constructor() {

        private var repos: JsonField<MutableList<RepoWithLookups>>? = null
        private var total: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(repoListResponse: RepoListResponse) = apply {
            repos = repoListResponse.repos.map { it.toMutableList() }
            total = repoListResponse.total
            additionalProperties = repoListResponse.additionalProperties.toMutableMap()
        }

        fun repos(repos: List<RepoWithLookups>) = repos(JsonField.of(repos))

        /**
         * Sets [Builder.repos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repos] with a well-typed `List<RepoWithLookups>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun repos(repos: JsonField<List<RepoWithLookups>>) = apply {
            this.repos = repos.map { it.toMutableList() }
        }

        /**
         * Adds a single [RepoWithLookups] to [repos].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRepo(repo: RepoWithLookups) = apply {
            repos =
                (repos ?: JsonField.of(mutableListOf())).also { checkKnown("repos", it).add(repo) }
        }

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
         * Returns an immutable instance of [RepoListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .repos()
         * .total()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RepoListResponse =
            RepoListResponse(
                checkRequired("repos", repos).map { it.toImmutable() },
                checkRequired("total", total),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RepoListResponse = apply {
        if (validated) {
            return@apply
        }

        repos().forEach { it.validate() }
        total()
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
        (repos.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (total.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RepoListResponse &&
            repos == other.repos &&
            total == other.total &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(repos, total, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RepoListResponse{repos=$repos, total=$total, additionalProperties=$additionalProperties}"
}
