// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.comparative

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a comparative experiment. */
class ComparativeCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun experimentIds(): List<String> = body.experimentIds()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = body.id()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = body.createdAt()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    fun _extra(): JsonValue = body._extra()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modifiedAt(): Optional<OffsetDateTime> = body.modifiedAt()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referenceDatasetId(): Optional<String> = body.referenceDatasetId()

    /**
     * Returns the raw JSON value of [experimentIds].
     *
     * Unlike [experimentIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _experimentIds(): JsonField<List<String>> = body._experimentIds()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _createdAt(): JsonField<OffsetDateTime> = body._createdAt()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [modifiedAt].
     *
     * Unlike [modifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modifiedAt(): JsonField<OffsetDateTime> = body._modifiedAt()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [referenceDatasetId].
     *
     * Unlike [referenceDatasetId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _referenceDatasetId(): JsonField<String> = body._referenceDatasetId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ComparativeCreateParams].
         *
         * The following fields are required:
         * ```java
         * .experimentIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ComparativeCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(comparativeCreateParams: ComparativeCreateParams) = apply {
            body = comparativeCreateParams.body.toBuilder()
            additionalHeaders = comparativeCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = comparativeCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [experimentIds]
         * - [id]
         * - [createdAt]
         * - [description]
         * - [extra]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun experimentIds(experimentIds: List<String>) = apply { body.experimentIds(experimentIds) }

        /**
         * Sets [Builder.experimentIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.experimentIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun experimentIds(experimentIds: JsonField<List<String>>) = apply {
            body.experimentIds(experimentIds)
        }

        /**
         * Adds a single [String] to [experimentIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExperimentId(experimentId: String) = apply { body.addExperimentId(experimentId) }

        fun id(id: String) = apply { body.id(id) }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        fun createdAt(createdAt: OffsetDateTime) = apply { body.createdAt(createdAt) }

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { body.createdAt(createdAt) }

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

        fun extra(extra: JsonValue) = apply { body.extra(extra) }

        fun modifiedAt(modifiedAt: OffsetDateTime) = apply { body.modifiedAt(modifiedAt) }

        /**
         * Sets [Builder.modifiedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modifiedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modifiedAt(modifiedAt: JsonField<OffsetDateTime>) = apply {
            body.modifiedAt(modifiedAt)
        }

        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun referenceDatasetId(referenceDatasetId: String?) = apply {
            body.referenceDatasetId(referenceDatasetId)
        }

        /**
         * Alias for calling [Builder.referenceDatasetId] with `referenceDatasetId.orElse(null)`.
         */
        fun referenceDatasetId(referenceDatasetId: Optional<String>) =
            referenceDatasetId(referenceDatasetId.getOrNull())

        /**
         * Sets [Builder.referenceDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceDatasetId(referenceDatasetId: JsonField<String>) = apply {
            body.referenceDatasetId(referenceDatasetId)
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
         * Returns an immutable instance of [ComparativeCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .experimentIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ComparativeCreateParams =
            ComparativeCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Create class for ComparativeExperiment. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val experimentIds: JsonField<List<String>>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val extra: JsonValue,
        private val modifiedAt: JsonField<OffsetDateTime>,
        private val name: JsonField<String>,
        private val referenceDatasetId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("experiment_ids")
            @ExcludeMissing
            experimentIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("extra") @ExcludeMissing extra: JsonValue = JsonMissing.of(),
            @JsonProperty("modified_at")
            @ExcludeMissing
            modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reference_dataset_id")
            @ExcludeMissing
            referenceDatasetId: JsonField<String> = JsonMissing.of(),
        ) : this(
            experimentIds,
            id,
            createdAt,
            description,
            extra,
            modifiedAt,
            name,
            referenceDatasetId,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun experimentIds(): List<String> = experimentIds.getRequired("experiment_ids")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonValue = extra

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun modifiedAt(): Optional<OffsetDateTime> = modifiedAt.getOptional("modified_at")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referenceDatasetId(): Optional<String> =
            referenceDatasetId.getOptional("reference_dataset_id")

        /**
         * Returns the raw JSON value of [experimentIds].
         *
         * Unlike [experimentIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("experiment_ids")
        @ExcludeMissing
        fun _experimentIds(): JsonField<List<String>> = experimentIds

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [modifiedAt].
         *
         * Unlike [modifiedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modified_at")
        @ExcludeMissing
        fun _modifiedAt(): JsonField<OffsetDateTime> = modifiedAt

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [referenceDatasetId].
         *
         * Unlike [referenceDatasetId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("reference_dataset_id")
        @ExcludeMissing
        fun _referenceDatasetId(): JsonField<String> = referenceDatasetId

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
             * .experimentIds()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var experimentIds: JsonField<MutableList<String>>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var extra: JsonValue = JsonMissing.of()
            private var modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var referenceDatasetId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                experimentIds = body.experimentIds.map { it.toMutableList() }
                id = body.id
                createdAt = body.createdAt
                description = body.description
                extra = body.extra
                modifiedAt = body.modifiedAt
                name = body.name
                referenceDatasetId = body.referenceDatasetId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun experimentIds(experimentIds: List<String>) =
                experimentIds(JsonField.of(experimentIds))

            /**
             * Sets [Builder.experimentIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.experimentIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun experimentIds(experimentIds: JsonField<List<String>>) = apply {
                this.experimentIds = experimentIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [experimentIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExperimentId(experimentId: String) = apply {
                experimentIds =
                    (experimentIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("experimentIds", it).add(experimentId)
                    }
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

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

            fun extra(extra: JsonValue) = apply { this.extra = extra }

            fun modifiedAt(modifiedAt: OffsetDateTime) = modifiedAt(JsonField.of(modifiedAt))

            /**
             * Sets [Builder.modifiedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modifiedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modifiedAt(modifiedAt: JsonField<OffsetDateTime>) = apply {
                this.modifiedAt = modifiedAt
            }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun referenceDatasetId(referenceDatasetId: String?) =
                referenceDatasetId(JsonField.ofNullable(referenceDatasetId))

            /**
             * Alias for calling [Builder.referenceDatasetId] with
             * `referenceDatasetId.orElse(null)`.
             */
            fun referenceDatasetId(referenceDatasetId: Optional<String>) =
                referenceDatasetId(referenceDatasetId.getOrNull())

            /**
             * Sets [Builder.referenceDatasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referenceDatasetId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referenceDatasetId(referenceDatasetId: JsonField<String>) = apply {
                this.referenceDatasetId = referenceDatasetId
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
             * .experimentIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("experimentIds", experimentIds).map { it.toImmutable() },
                    id,
                    createdAt,
                    description,
                    extra,
                    modifiedAt,
                    name,
                    referenceDatasetId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            experimentIds()
            id()
            createdAt()
            description()
            modifiedAt()
            name()
            referenceDatasetId()
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
            (experimentIds.asKnown().getOrNull()?.size ?: 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (modifiedAt.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (referenceDatasetId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                experimentIds == other.experimentIds &&
                id == other.id &&
                createdAt == other.createdAt &&
                description == other.description &&
                extra == other.extra &&
                modifiedAt == other.modifiedAt &&
                name == other.name &&
                referenceDatasetId == other.referenceDatasetId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                experimentIds,
                id,
                createdAt,
                description,
                extra,
                modifiedAt,
                name,
                referenceDatasetId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{experimentIds=$experimentIds, id=$id, createdAt=$createdAt, description=$description, extra=$extra, modifiedAt=$modifiedAt, name=$name, referenceDatasetId=$referenceDatasetId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ComparativeCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ComparativeCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
