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
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new commit in a repository. Requires authentication and write access to the repository.
 */
class CommitCreateParams
private constructor(
    private val owner: JsonValue,
    private val repo: JsonValue?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun owner(): JsonValue = owner

    fun repo(): Optional<JsonValue> = Optional.ofNullable(repo)

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = commitCreateParams.manifest().convert(MyClass.class);
     * ```
     */
    fun _manifest(): JsonValue = body._manifest()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentCommit(): Optional<String> = body.parentCommit()

    /**
     * SkipWebhooks allows skipping webhook notifications. Can be true (boolean) to skip all, or an
     * array of webhook UUIDs to skip specific ones.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = commitCreateParams.skipWebhooks().convert(MyClass.class);
     * ```
     */
    fun _skipWebhooks(): JsonValue = body._skipWebhooks()

    /**
     * Returns the raw JSON value of [parentCommit].
     *
     * Unlike [parentCommit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _parentCommit(): JsonField<String> = body._parentCommit()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommitCreateParams].
         *
         * The following fields are required:
         * ```java
         * .owner()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitCreateParams]. */
    class Builder internal constructor() {

        private var owner: JsonValue? = null
        private var repo: JsonValue? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(commitCreateParams: CommitCreateParams) = apply {
            owner = commitCreateParams.owner
            repo = commitCreateParams.repo
            body = commitCreateParams.body.toBuilder()
            additionalHeaders = commitCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = commitCreateParams.additionalQueryParams.toBuilder()
        }

        fun owner(owner: JsonValue) = apply { this.owner = owner }

        fun repo(repo: JsonValue?) = apply { this.repo = repo }

        /** Alias for calling [Builder.repo] with `repo.orElse(null)`. */
        fun repo(repo: Optional<JsonValue>) = repo(repo.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [manifest]
         * - [parentCommit]
         * - [skipWebhooks]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun manifest(manifest: JsonValue) = apply { body.manifest(manifest) }

        fun parentCommit(parentCommit: String) = apply { body.parentCommit(parentCommit) }

        /**
         * Sets [Builder.parentCommit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentCommit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentCommit(parentCommit: JsonField<String>) = apply {
            body.parentCommit(parentCommit)
        }

        /**
         * SkipWebhooks allows skipping webhook notifications. Can be true (boolean) to skip all, or
         * an array of webhook UUIDs to skip specific ones.
         */
        fun skipWebhooks(skipWebhooks: JsonValue) = apply { body.skipWebhooks(skipWebhooks) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CommitCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .owner()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CommitCreateParams =
            CommitCreateParams(
                checkRequired("owner", owner),
                repo,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> owner.toString()
            1 -> repo?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val manifest: JsonValue,
        private val parentCommit: JsonField<String>,
        private val skipWebhooks: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("manifest") @ExcludeMissing manifest: JsonValue = JsonMissing.of(),
            @JsonProperty("parent_commit")
            @ExcludeMissing
            parentCommit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("skip_webhooks")
            @ExcludeMissing
            skipWebhooks: JsonValue = JsonMissing.of(),
        ) : this(manifest, parentCommit, skipWebhooks, mutableMapOf())

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = body.manifest().convert(MyClass.class);
         * ```
         */
        @JsonProperty("manifest") @ExcludeMissing fun _manifest(): JsonValue = manifest

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun parentCommit(): Optional<String> = parentCommit.getOptional("parent_commit")

        /**
         * SkipWebhooks allows skipping webhook notifications. Can be true (boolean) to skip all, or
         * an array of webhook UUIDs to skip specific ones.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = body.skipWebhooks().convert(MyClass.class);
         * ```
         */
        @JsonProperty("skip_webhooks") @ExcludeMissing fun _skipWebhooks(): JsonValue = skipWebhooks

        /**
         * Returns the raw JSON value of [parentCommit].
         *
         * Unlike [parentCommit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("parent_commit")
        @ExcludeMissing
        fun _parentCommit(): JsonField<String> = parentCommit

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var manifest: JsonValue = JsonMissing.of()
            private var parentCommit: JsonField<String> = JsonMissing.of()
            private var skipWebhooks: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                manifest = body.manifest
                parentCommit = body.parentCommit
                skipWebhooks = body.skipWebhooks
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun manifest(manifest: JsonValue) = apply { this.manifest = manifest }

            fun parentCommit(parentCommit: String) = parentCommit(JsonField.of(parentCommit))

            /**
             * Sets [Builder.parentCommit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parentCommit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parentCommit(parentCommit: JsonField<String>) = apply {
                this.parentCommit = parentCommit
            }

            /**
             * SkipWebhooks allows skipping webhook notifications. Can be true (boolean) to skip
             * all, or an array of webhook UUIDs to skip specific ones.
             */
            fun skipWebhooks(skipWebhooks: JsonValue) = apply { this.skipWebhooks = skipWebhooks }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(manifest, parentCommit, skipWebhooks, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            parentCommit()
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
        @JvmSynthetic
        internal fun validity(): Int = (if (parentCommit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                manifest == other.manifest &&
                parentCommit == other.parentCommit &&
                skipWebhooks == other.skipWebhooks &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(manifest, parentCommit, skipWebhooks, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{manifest=$manifest, parentCommit=$parentCommit, skipWebhooks=$skipWebhooks, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitCreateParams &&
            owner == other.owner &&
            repo == other.repo &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(owner, repo, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CommitCreateParams{owner=$owner, repo=$repo, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
