// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a repo. */
class RepoCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPublic(): Boolean = body.isPublic()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun repoHandle(): String = body.repoHandle()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readme(): Optional<String> = body.readme()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun repoType(): Optional<RepoType> = body.repoType()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun restrictedMode(): Optional<Boolean> = body.restrictedMode()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * Returns the raw JSON value of [isPublic].
     *
     * Unlike [isPublic], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isPublic(): JsonField<Boolean> = body._isPublic()

    /**
     * Returns the raw JSON value of [repoHandle].
     *
     * Unlike [repoHandle], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _repoHandle(): JsonField<String> = body._repoHandle()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [readme].
     *
     * Unlike [readme], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _readme(): JsonField<String> = body._readme()

    /**
     * Returns the raw JSON value of [repoType].
     *
     * Unlike [repoType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _repoType(): JsonField<RepoType> = body._repoType()

    /**
     * Returns the raw JSON value of [restrictedMode].
     *
     * Unlike [restrictedMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _restrictedMode(): JsonField<Boolean> = body._restrictedMode()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RepoCreateParams].
         *
         * The following fields are required:
         * ```java
         * .isPublic()
         * .repoHandle()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RepoCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(repoCreateParams: RepoCreateParams) = apply {
            body = repoCreateParams.body.toBuilder()
            additionalHeaders = repoCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = repoCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [isPublic]
         * - [repoHandle]
         * - [description]
         * - [readme]
         * - [repoType]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun isPublic(isPublic: Boolean) = apply { body.isPublic(isPublic) }

        /**
         * Sets [Builder.isPublic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPublic] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPublic(isPublic: JsonField<Boolean>) = apply { body.isPublic(isPublic) }

        fun repoHandle(repoHandle: String) = apply { body.repoHandle(repoHandle) }

        /**
         * Sets [Builder.repoHandle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repoHandle] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun repoHandle(repoHandle: JsonField<String>) = apply { body.repoHandle(repoHandle) }

        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun readme(readme: String?) = apply { body.readme(readme) }

        /** Alias for calling [Builder.readme] with `readme.orElse(null)`. */
        fun readme(readme: Optional<String>) = readme(readme.getOrNull())

        /**
         * Sets [Builder.readme] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readme] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun readme(readme: JsonField<String>) = apply { body.readme(readme) }

        fun repoType(repoType: RepoType) = apply { body.repoType(repoType) }

        /**
         * Sets [Builder.repoType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repoType] with a well-typed [RepoType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun repoType(repoType: JsonField<RepoType>) = apply { body.repoType(repoType) }

        fun restrictedMode(restrictedMode: Boolean?) = apply { body.restrictedMode(restrictedMode) }

        /**
         * Alias for [Builder.restrictedMode].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun restrictedMode(restrictedMode: Boolean) = restrictedMode(restrictedMode as Boolean?)

        /** Alias for calling [Builder.restrictedMode] with `restrictedMode.orElse(null)`. */
        fun restrictedMode(restrictedMode: Optional<Boolean>) =
            restrictedMode(restrictedMode.getOrNull())

        /**
         * Sets [Builder.restrictedMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restrictedMode] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun restrictedMode(restrictedMode: JsonField<Boolean>) = apply {
            body.restrictedMode(restrictedMode)
        }

        fun tags(tags: List<String>?) = apply { body.tags(tags) }

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

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
         * Returns an immutable instance of [RepoCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .isPublic()
         * .repoHandle()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RepoCreateParams =
            RepoCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Fields to create a repo */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val isPublic: JsonField<Boolean>,
        private val repoHandle: JsonField<String>,
        private val description: JsonField<String>,
        private val readme: JsonField<String>,
        private val repoType: JsonField<RepoType>,
        private val restrictedMode: JsonField<Boolean>,
        private val tags: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("is_public")
            @ExcludeMissing
            isPublic: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("repo_handle")
            @ExcludeMissing
            repoHandle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("readme") @ExcludeMissing readme: JsonField<String> = JsonMissing.of(),
            @JsonProperty("repo_type")
            @ExcludeMissing
            repoType: JsonField<RepoType> = JsonMissing.of(),
            @JsonProperty("restricted_mode")
            @ExcludeMissing
            restrictedMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            isPublic,
            repoHandle,
            description,
            readme,
            repoType,
            restrictedMode,
            tags,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isPublic(): Boolean = isPublic.getRequired("is_public")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun repoHandle(): String = repoHandle.getRequired("repo_handle")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun readme(): Optional<String> = readme.getOptional("readme")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun repoType(): Optional<RepoType> = repoType.getOptional("repo_type")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun restrictedMode(): Optional<Boolean> = restrictedMode.getOptional("restricted_mode")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * Returns the raw JSON value of [isPublic].
         *
         * Unlike [isPublic], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_public") @ExcludeMissing fun _isPublic(): JsonField<Boolean> = isPublic

        /**
         * Returns the raw JSON value of [repoHandle].
         *
         * Unlike [repoHandle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("repo_handle")
        @ExcludeMissing
        fun _repoHandle(): JsonField<String> = repoHandle

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [readme].
         *
         * Unlike [readme], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("readme") @ExcludeMissing fun _readme(): JsonField<String> = readme

        /**
         * Returns the raw JSON value of [repoType].
         *
         * Unlike [repoType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("repo_type") @ExcludeMissing fun _repoType(): JsonField<RepoType> = repoType

        /**
         * Returns the raw JSON value of [restrictedMode].
         *
         * Unlike [restrictedMode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("restricted_mode")
        @ExcludeMissing
        fun _restrictedMode(): JsonField<Boolean> = restrictedMode

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .isPublic()
             * .repoHandle()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var isPublic: JsonField<Boolean>? = null
            private var repoHandle: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var readme: JsonField<String> = JsonMissing.of()
            private var repoType: JsonField<RepoType> = JsonMissing.of()
            private var restrictedMode: JsonField<Boolean> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                isPublic = body.isPublic
                repoHandle = body.repoHandle
                description = body.description
                readme = body.readme
                repoType = body.repoType
                restrictedMode = body.restrictedMode
                tags = body.tags.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun isPublic(isPublic: Boolean) = isPublic(JsonField.of(isPublic))

            /**
             * Sets [Builder.isPublic] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isPublic] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isPublic(isPublic: JsonField<Boolean>) = apply { this.isPublic = isPublic }

            fun repoHandle(repoHandle: String) = repoHandle(JsonField.of(repoHandle))

            /**
             * Sets [Builder.repoHandle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repoHandle] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun repoHandle(repoHandle: JsonField<String>) = apply { this.repoHandle = repoHandle }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun readme(readme: String?) = readme(JsonField.ofNullable(readme))

            /** Alias for calling [Builder.readme] with `readme.orElse(null)`. */
            fun readme(readme: Optional<String>) = readme(readme.getOrNull())

            /**
             * Sets [Builder.readme] to an arbitrary JSON value.
             *
             * You should usually call [Builder.readme] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun readme(readme: JsonField<String>) = apply { this.readme = readme }

            fun repoType(repoType: RepoType) = repoType(JsonField.of(repoType))

            /**
             * Sets [Builder.repoType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repoType] with a well-typed [RepoType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun repoType(repoType: JsonField<RepoType>) = apply { this.repoType = repoType }

            fun restrictedMode(restrictedMode: Boolean?) =
                restrictedMode(JsonField.ofNullable(restrictedMode))

            /**
             * Alias for [Builder.restrictedMode].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun restrictedMode(restrictedMode: Boolean) = restrictedMode(restrictedMode as Boolean?)

            /** Alias for calling [Builder.restrictedMode] with `restrictedMode.orElse(null)`. */
            fun restrictedMode(restrictedMode: Optional<Boolean>) =
                restrictedMode(restrictedMode.getOrNull())

            /**
             * Sets [Builder.restrictedMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.restrictedMode] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun restrictedMode(restrictedMode: JsonField<Boolean>) = apply {
                this.restrictedMode = restrictedMode
            }

            fun tags(tags: List<String>?) = tags(JsonField.ofNullable(tags))

            /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
            fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
             *
             * The following fields are required:
             * ```java
             * .isPublic()
             * .repoHandle()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("isPublic", isPublic),
                    checkRequired("repoHandle", repoHandle),
                    description,
                    readme,
                    repoType,
                    restrictedMode,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
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

            isPublic()
            repoHandle()
            description()
            readme()
            repoType().ifPresent { it.validate() }
            restrictedMode()
            tags()
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
            (if (isPublic.asKnown().isPresent) 1 else 0) +
                (if (repoHandle.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (readme.asKnown().isPresent) 1 else 0) +
                (repoType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (restrictedMode.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                isPublic == other.isPublic &&
                repoHandle == other.repoHandle &&
                description == other.description &&
                readme == other.readme &&
                repoType == other.repoType &&
                restrictedMode == other.restrictedMode &&
                tags == other.tags &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                isPublic,
                repoHandle,
                description,
                readme,
                repoType,
                restrictedMode,
                tags,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{isPublic=$isPublic, repoHandle=$repoHandle, description=$description, readme=$readme, repoType=$repoType, restrictedMode=$restrictedMode, tags=$tags, additionalProperties=$additionalProperties}"
    }

    class RepoType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PROMPT = of("prompt")

            @JvmField val FILE = of("file")

            @JvmField val AGENT = of("agent")

            @JvmField val SKILL = of("skill")

            @JvmStatic fun of(value: String) = RepoType(JsonField.of(value))
        }

        /** An enum containing [RepoType]'s known values. */
        enum class Known {
            PROMPT,
            FILE,
            AGENT,
            SKILL,
        }

        /**
         * An enum containing [RepoType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RepoType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROMPT,
            FILE,
            AGENT,
            SKILL,
            /** An enum member indicating that [RepoType] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PROMPT -> Value.PROMPT
                FILE -> Value.FILE
                AGENT -> Value.AGENT
                SKILL -> Value.SKILL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PROMPT -> Known.PROMPT
                FILE -> Known.FILE
                AGENT -> Known.AGENT
                SKILL -> Known.SKILL
                else -> throw LangChainInvalidDataException("Unknown RepoType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangChainInvalidDataException("Value is not a String")
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
        fun validate(): RepoType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RepoType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RepoCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RepoCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
