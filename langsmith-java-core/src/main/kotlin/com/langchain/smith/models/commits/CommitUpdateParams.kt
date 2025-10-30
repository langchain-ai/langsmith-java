// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.BaseDeserializer
import com.langchain.smith.core.BaseSerializer
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Upload a repo. */
class CommitUpdateParams
private constructor(
    private val owner: String,
    private val repo: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun owner(): String = owner

    fun repo(): Optional<String> = Optional.ofNullable(repo)

    fun _manifest(): JsonValue = body._manifest()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exampleRunIds(): Optional<List<String>> = body.exampleRunIds()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentCommit(): Optional<String> = body.parentCommit()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun skipWebhooks(): Optional<SkipWebhooks> = body.skipWebhooks()

    /**
     * Returns the raw JSON value of [exampleRunIds].
     *
     * Unlike [exampleRunIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _exampleRunIds(): JsonField<List<String>> = body._exampleRunIds()

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
    fun _skipWebhooks(): JsonField<SkipWebhooks> = body._skipWebhooks()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommitUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .owner()
         * .manifest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitUpdateParams]. */
    class Builder internal constructor() {

        private var owner: String? = null
        private var repo: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(commitUpdateParams: CommitUpdateParams) = apply {
            owner = commitUpdateParams.owner
            repo = commitUpdateParams.repo
            body = commitUpdateParams.body.toBuilder()
            additionalHeaders = commitUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = commitUpdateParams.additionalQueryParams.toBuilder()
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
         * - [manifest]
         * - [exampleRunIds]
         * - [parentCommit]
         * - [skipWebhooks]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun manifest(manifest: JsonValue) = apply { body.manifest(manifest) }

        fun exampleRunIds(exampleRunIds: List<String>?) = apply {
            body.exampleRunIds(exampleRunIds)
        }

        /** Alias for calling [Builder.exampleRunIds] with `exampleRunIds.orElse(null)`. */
        fun exampleRunIds(exampleRunIds: Optional<List<String>>) =
            exampleRunIds(exampleRunIds.getOrNull())

        /**
         * Sets [Builder.exampleRunIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exampleRunIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exampleRunIds(exampleRunIds: JsonField<List<String>>) = apply {
            body.exampleRunIds(exampleRunIds)
        }

        /**
         * Adds a single [String] to [exampleRunIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExampleRunId(exampleRunId: String) = apply { body.addExampleRunId(exampleRunId) }

        fun parentCommit(parentCommit: String?) = apply { body.parentCommit(parentCommit) }

        /** Alias for calling [Builder.parentCommit] with `parentCommit.orElse(null)`. */
        fun parentCommit(parentCommit: Optional<String>) = parentCommit(parentCommit.getOrNull())

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

        fun skipWebhooks(skipWebhooks: SkipWebhooks) = apply { body.skipWebhooks(skipWebhooks) }

        /**
         * Sets [Builder.skipWebhooks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skipWebhooks] with a well-typed [SkipWebhooks] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun skipWebhooks(skipWebhooks: JsonField<SkipWebhooks>) = apply {
            body.skipWebhooks(skipWebhooks)
        }

        /** Alias for calling [skipWebhooks] with `SkipWebhooks.ofBool(bool)`. */
        fun skipWebhooks(bool: Boolean) = apply { body.skipWebhooks(bool) }

        /** Alias for calling [skipWebhooks] with `SkipWebhooks.ofStrings(strings)`. */
        fun skipWebhooksOfStrings(strings: List<String>) = apply {
            body.skipWebhooksOfStrings(strings)
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
         * Returns an immutable instance of [CommitUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .owner()
         * .manifest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CommitUpdateParams =
            CommitUpdateParams(
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
        private val manifest: JsonValue,
        private val exampleRunIds: JsonField<List<String>>,
        private val parentCommit: JsonField<String>,
        private val skipWebhooks: JsonField<SkipWebhooks>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("manifest") @ExcludeMissing manifest: JsonValue = JsonMissing.of(),
            @JsonProperty("example_run_ids")
            @ExcludeMissing
            exampleRunIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("parent_commit")
            @ExcludeMissing
            parentCommit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("skip_webhooks")
            @ExcludeMissing
            skipWebhooks: JsonField<SkipWebhooks> = JsonMissing.of(),
        ) : this(manifest, exampleRunIds, parentCommit, skipWebhooks, mutableMapOf())

        @JsonProperty("manifest") @ExcludeMissing fun _manifest(): JsonValue = manifest

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun exampleRunIds(): Optional<List<String>> = exampleRunIds.getOptional("example_run_ids")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun parentCommit(): Optional<String> = parentCommit.getOptional("parent_commit")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun skipWebhooks(): Optional<SkipWebhooks> = skipWebhooks.getOptional("skip_webhooks")

        /**
         * Returns the raw JSON value of [exampleRunIds].
         *
         * Unlike [exampleRunIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("example_run_ids")
        @ExcludeMissing
        fun _exampleRunIds(): JsonField<List<String>> = exampleRunIds

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
        fun _skipWebhooks(): JsonField<SkipWebhooks> = skipWebhooks

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
             * .manifest()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var manifest: JsonValue? = null
            private var exampleRunIds: JsonField<MutableList<String>>? = null
            private var parentCommit: JsonField<String> = JsonMissing.of()
            private var skipWebhooks: JsonField<SkipWebhooks> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                manifest = body.manifest
                exampleRunIds = body.exampleRunIds.map { it.toMutableList() }
                parentCommit = body.parentCommit
                skipWebhooks = body.skipWebhooks
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun manifest(manifest: JsonValue) = apply { this.manifest = manifest }

            fun exampleRunIds(exampleRunIds: List<String>?) =
                exampleRunIds(JsonField.ofNullable(exampleRunIds))

            /** Alias for calling [Builder.exampleRunIds] with `exampleRunIds.orElse(null)`. */
            fun exampleRunIds(exampleRunIds: Optional<List<String>>) =
                exampleRunIds(exampleRunIds.getOrNull())

            /**
             * Sets [Builder.exampleRunIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exampleRunIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun exampleRunIds(exampleRunIds: JsonField<List<String>>) = apply {
                this.exampleRunIds = exampleRunIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [exampleRunIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExampleRunId(exampleRunId: String) = apply {
                exampleRunIds =
                    (exampleRunIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("exampleRunIds", it).add(exampleRunId)
                    }
            }

            fun parentCommit(parentCommit: String?) =
                parentCommit(JsonField.ofNullable(parentCommit))

            /** Alias for calling [Builder.parentCommit] with `parentCommit.orElse(null)`. */
            fun parentCommit(parentCommit: Optional<String>) =
                parentCommit(parentCommit.getOrNull())

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

            fun skipWebhooks(skipWebhooks: SkipWebhooks) = skipWebhooks(JsonField.of(skipWebhooks))

            /**
             * Sets [Builder.skipWebhooks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipWebhooks] with a well-typed [SkipWebhooks] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun skipWebhooks(skipWebhooks: JsonField<SkipWebhooks>) = apply {
                this.skipWebhooks = skipWebhooks
            }

            /** Alias for calling [skipWebhooks] with `SkipWebhooks.ofBool(bool)`. */
            fun skipWebhooks(bool: Boolean) = skipWebhooks(SkipWebhooks.ofBool(bool))

            /** Alias for calling [skipWebhooks] with `SkipWebhooks.ofStrings(strings)`. */
            fun skipWebhooksOfStrings(strings: List<String>) =
                skipWebhooks(SkipWebhooks.ofStrings(strings))

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
             * .manifest()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("manifest", manifest),
                    (exampleRunIds ?: JsonMissing.of()).map { it.toImmutable() },
                    parentCommit,
                    skipWebhooks,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            exampleRunIds()
            parentCommit()
            skipWebhooks().ifPresent { it.validate() }
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
            (exampleRunIds.asKnown().getOrNull()?.size ?: 0) +
                (if (parentCommit.asKnown().isPresent) 1 else 0) +
                (skipWebhooks.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                manifest == other.manifest &&
                exampleRunIds == other.exampleRunIds &&
                parentCommit == other.parentCommit &&
                skipWebhooks == other.skipWebhooks &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(manifest, exampleRunIds, parentCommit, skipWebhooks, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{manifest=$manifest, exampleRunIds=$exampleRunIds, parentCommit=$parentCommit, skipWebhooks=$skipWebhooks, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = SkipWebhooks.Deserializer::class)
    @JsonSerialize(using = SkipWebhooks.Serializer::class)
    class SkipWebhooks
    private constructor(
        private val bool: Boolean? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isBool(): Boolean = bool != null

        fun isStrings(): Boolean = strings != null

        fun asBool(): Boolean = bool.getOrThrow("bool")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                bool != null -> visitor.visitBool(bool)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): SkipWebhooks = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitBool(bool: Boolean) {}

                    override fun visitStrings(strings: List<String>) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitBool(bool: Boolean) = 1

                    override fun visitStrings(strings: List<String>) = strings.size

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SkipWebhooks && bool == other.bool && strings == other.strings
        }

        override fun hashCode(): Int = Objects.hash(bool, strings)

        override fun toString(): String =
            when {
                bool != null -> "SkipWebhooks{bool=$bool}"
                strings != null -> "SkipWebhooks{strings=$strings}"
                _json != null -> "SkipWebhooks{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid SkipWebhooks")
            }

        companion object {

            @JvmStatic fun ofBool(bool: Boolean) = SkipWebhooks(bool = bool)

            @JvmStatic
            fun ofStrings(strings: List<String>) = SkipWebhooks(strings = strings.toImmutable())
        }

        /**
         * An interface that defines how to map each variant of [SkipWebhooks] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitBool(bool: Boolean): T

            fun visitStrings(strings: List<String>): T

            /**
             * Maps an unknown variant of [SkipWebhooks] to a value of type [T].
             *
             * An instance of [SkipWebhooks] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LangsmithInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangsmithInvalidDataException("Unknown SkipWebhooks: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<SkipWebhooks>(SkipWebhooks::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): SkipWebhooks {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                SkipWebhooks(bool = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                SkipWebhooks(strings = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from string).
                    0 -> SkipWebhooks(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<SkipWebhooks>(SkipWebhooks::class) {

            override fun serialize(
                value: SkipWebhooks,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.bool != null -> generator.writeObject(value.bool)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid SkipWebhooks")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitUpdateParams &&
            owner == other.owner &&
            repo == other.repo &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(owner, repo, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CommitUpdateParams{owner=$owner, repo=$repo, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
