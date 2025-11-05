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
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class GetRepoResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val repo: JsonField<RepoWithLookups>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("repo") @ExcludeMissing repo: JsonField<RepoWithLookups> = JsonMissing.of()
    ) : this(repo, mutableMapOf())

    /**
     * All database fields for repos, plus helpful computed fields.
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun repo(): RepoWithLookups = repo.getRequired("repo")

    /**
     * Returns the raw JSON value of [repo].
     *
     * Unlike [repo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("repo") @ExcludeMissing fun _repo(): JsonField<RepoWithLookups> = repo

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
         * Returns a mutable builder for constructing an instance of [GetRepoResponse].
         *
         * The following fields are required:
         * ```java
         * .repo()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GetRepoResponse]. */
    class Builder internal constructor() {

        private var repo: JsonField<RepoWithLookups>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(getRepoResponse: GetRepoResponse) = apply {
            repo = getRepoResponse.repo
            additionalProperties = getRepoResponse.additionalProperties.toMutableMap()
        }

        /** All database fields for repos, plus helpful computed fields. */
        fun repo(repo: RepoWithLookups) = repo(JsonField.of(repo))

        /**
         * Sets [Builder.repo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repo] with a well-typed [RepoWithLookups] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun repo(repo: JsonField<RepoWithLookups>) = apply { this.repo = repo }

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
         * Returns an immutable instance of [GetRepoResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .repo()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GetRepoResponse =
            GetRepoResponse(checkRequired("repo", repo), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): GetRepoResponse = apply {
        if (validated) {
            return@apply
        }

        repo().validate()
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
    @JvmSynthetic internal fun validity(): Int = (repo.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GetRepoResponse &&
            repo == other.repo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(repo, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GetRepoResponse{repo=$repo, additionalProperties=$additionalProperties}"
}
