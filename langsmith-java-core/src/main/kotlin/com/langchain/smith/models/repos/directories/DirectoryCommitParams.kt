// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.directories

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
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new directory commit for an agent or skill repository by applying file/link create,
 * update, and delete operations.
 */
class DirectoryCommitParams
private constructor(
    private val owner: String,
    private val repo: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun owner(): String = owner

    fun repo(): Optional<String> = Optional.ofNullable(repo)

    /**
     * Files maps path to an Entry (object = create/update/link, null = delete/unlink).
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun files(): Optional<Files> = body.files()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentCommit(): Optional<String> = body.parentCommit()

    /**
     * SkipWebhooks, when true, suppresses Context Hub commit webhooks for this commit. Deliberately
     * a plain bool, not the any (bool | []string) shape of the prompt-hub
     * CreateCommitReq.SkipWebhooks: Context Hub v1 has no per-webhook filtering, so a bool is the
     * correct shape.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun skipWebhooks(): Optional<Boolean> = body.skipWebhooks()

    /**
     * Returns the raw JSON value of [files].
     *
     * Unlike [files], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _files(): JsonField<Files> = body._files()

    /**
     * Returns the raw JSON value of [parentCommit].
     *
     * Unlike [parentCommit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _parentCommit(): JsonField<String> = body._parentCommit()

    /**
     * Returns the raw JSON value of [skipWebhooks].
     *
     * Unlike [skipWebhooks], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _skipWebhooks(): JsonField<Boolean> = body._skipWebhooks()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DirectoryCommitParams].
         *
         * The following fields are required:
         * ```java
         * .owner()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DirectoryCommitParams]. */
    class Builder internal constructor() {

        private var owner: String? = null
        private var repo: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(directoryCommitParams: DirectoryCommitParams) = apply {
            owner = directoryCommitParams.owner
            repo = directoryCommitParams.repo
            body = directoryCommitParams.body.toBuilder()
            additionalHeaders = directoryCommitParams.additionalHeaders.toBuilder()
            additionalQueryParams = directoryCommitParams.additionalQueryParams.toBuilder()
        }

        fun owner(owner: String) = apply { this.owner = owner }

        fun repo(repo: String?) = apply { this.repo = repo }

        /** Alias for calling [Builder.repo] with `repo.orElse(null)`. */
        fun repo(repo: Optional<String>) = repo(repo.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [files]
         * - [parentCommit]
         * - [skipWebhooks]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Files maps path to an Entry (object = create/update/link, null = delete/unlink). */
        fun files(files: Files) = apply { body.files(files) }

        /**
         * Sets [Builder.files] to an arbitrary JSON value.
         *
         * You should usually call [Builder.files] with a well-typed [Files] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun files(files: JsonField<Files>) = apply { body.files(files) }

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
         * SkipWebhooks, when true, suppresses Context Hub commit webhooks for this commit.
         * Deliberately a plain bool, not the any (bool | []string) shape of the prompt-hub
         * CreateCommitReq.SkipWebhooks: Context Hub v1 has no per-webhook filtering, so a bool is
         * the correct shape.
         */
        fun skipWebhooks(skipWebhooks: Boolean) = apply { body.skipWebhooks(skipWebhooks) }

        /**
         * Sets [Builder.skipWebhooks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skipWebhooks] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun skipWebhooks(skipWebhooks: JsonField<Boolean>) = apply {
            body.skipWebhooks(skipWebhooks)
        }

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
         * Returns an immutable instance of [DirectoryCommitParams].
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
        fun build(): DirectoryCommitParams =
            DirectoryCommitParams(
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
            0 -> owner
            1 -> repo ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val files: JsonField<Files>,
        private val parentCommit: JsonField<String>,
        private val skipWebhooks: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("files") @ExcludeMissing files: JsonField<Files> = JsonMissing.of(),
            @JsonProperty("parent_commit")
            @ExcludeMissing
            parentCommit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("skip_webhooks")
            @ExcludeMissing
            skipWebhooks: JsonField<Boolean> = JsonMissing.of(),
        ) : this(files, parentCommit, skipWebhooks, mutableMapOf())

        /**
         * Files maps path to an Entry (object = create/update/link, null = delete/unlink).
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun files(): Optional<Files> = files.getOptional("files")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun parentCommit(): Optional<String> = parentCommit.getOptional("parent_commit")

        /**
         * SkipWebhooks, when true, suppresses Context Hub commit webhooks for this commit.
         * Deliberately a plain bool, not the any (bool | []string) shape of the prompt-hub
         * CreateCommitReq.SkipWebhooks: Context Hub v1 has no per-webhook filtering, so a bool is
         * the correct shape.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun skipWebhooks(): Optional<Boolean> = skipWebhooks.getOptional("skip_webhooks")

        /**
         * Returns the raw JSON value of [files].
         *
         * Unlike [files], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("files") @ExcludeMissing fun _files(): JsonField<Files> = files

        /**
         * Returns the raw JSON value of [parentCommit].
         *
         * Unlike [parentCommit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("parent_commit")
        @ExcludeMissing
        fun _parentCommit(): JsonField<String> = parentCommit

        /**
         * Returns the raw JSON value of [skipWebhooks].
         *
         * Unlike [skipWebhooks], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("skip_webhooks")
        @ExcludeMissing
        fun _skipWebhooks(): JsonField<Boolean> = skipWebhooks

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

            private var files: JsonField<Files> = JsonMissing.of()
            private var parentCommit: JsonField<String> = JsonMissing.of()
            private var skipWebhooks: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                files = body.files
                parentCommit = body.parentCommit
                skipWebhooks = body.skipWebhooks
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Files maps path to an Entry (object = create/update/link, null = delete/unlink). */
            fun files(files: Files) = files(JsonField.of(files))

            /**
             * Sets [Builder.files] to an arbitrary JSON value.
             *
             * You should usually call [Builder.files] with a well-typed [Files] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun files(files: JsonField<Files>) = apply { this.files = files }

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
             * SkipWebhooks, when true, suppresses Context Hub commit webhooks for this commit.
             * Deliberately a plain bool, not the any (bool | []string) shape of the prompt-hub
             * CreateCommitReq.SkipWebhooks: Context Hub v1 has no per-webhook filtering, so a bool
             * is the correct shape.
             */
            fun skipWebhooks(skipWebhooks: Boolean) = skipWebhooks(JsonField.of(skipWebhooks))

            /**
             * Sets [Builder.skipWebhooks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipWebhooks] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun skipWebhooks(skipWebhooks: JsonField<Boolean>) = apply {
                this.skipWebhooks = skipWebhooks
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(files, parentCommit, skipWebhooks, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            files().ifPresent { it.validate() }
            parentCommit()
            skipWebhooks()
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
        internal fun validity(): Int =
            (files.asKnown().getOrNull()?.validity() ?: 0) +
                (if (parentCommit.asKnown().isPresent) 1 else 0) +
                (if (skipWebhooks.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                files == other.files &&
                parentCommit == other.parentCommit &&
                skipWebhooks == other.skipWebhooks &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(files, parentCommit, skipWebhooks, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{files=$files, parentCommit=$parentCommit, skipWebhooks=$skipWebhooks, additionalProperties=$additionalProperties}"
    }

    /** Files maps path to an Entry (object = create/update/link, null = delete/unlink). */
    class Files
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

            /** Returns a mutable builder for constructing an instance of [Files]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Files]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(files: Files) = apply {
                additionalProperties = files.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Files].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Files = Files(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Files = apply {
            if (validated) {
                return@apply
            }

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
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Files && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Files{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DirectoryCommitParams &&
            owner == other.owner &&
            repo == other.repo &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(owner, repo, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DirectoryCommitParams{owner=$owner, repo=$repo, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
