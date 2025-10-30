// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

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
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update Annotation Queue */
class AnnotationQueueUpdateParams
private constructor(
    private val queueId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun queueId(): Optional<String> = Optional.ofNullable(queueId)

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultDataset(): Optional<String> = body.defaultDataset()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableReservations(): Optional<Boolean> = body.enableReservations()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numReviewersPerItem(): Optional<Long> = body.numReviewersPerItem()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reservationMinutes(): Optional<Long> = body.reservationMinutes()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rubricInstructions(): Optional<String> = body.rubricInstructions()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rubricItems(): Optional<List<AnnotationQueueRubricItemSchema>> = body.rubricItems()

    /**
     * Returns the raw JSON value of [defaultDataset].
     *
     * Unlike [defaultDataset], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _defaultDataset(): JsonField<String> = body._defaultDataset()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [enableReservations].
     *
     * Unlike [enableReservations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _enableReservations(): JsonField<Boolean> = body._enableReservations()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [numReviewersPerItem].
     *
     * Unlike [numReviewersPerItem], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _numReviewersPerItem(): JsonField<Long> = body._numReviewersPerItem()

    /**
     * Returns the raw JSON value of [reservationMinutes].
     *
     * Unlike [reservationMinutes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _reservationMinutes(): JsonField<Long> = body._reservationMinutes()

    /**
     * Returns the raw JSON value of [rubricInstructions].
     *
     * Unlike [rubricInstructions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _rubricInstructions(): JsonField<String> = body._rubricInstructions()

    /**
     * Returns the raw JSON value of [rubricItems].
     *
     * Unlike [rubricItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rubricItems(): JsonField<List<AnnotationQueueRubricItemSchema>> = body._rubricItems()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AnnotationQueueUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [AnnotationQueueUpdateParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnnotationQueueUpdateParams]. */
    class Builder internal constructor() {

        private var queueId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(annotationQueueUpdateParams: AnnotationQueueUpdateParams) = apply {
            queueId = annotationQueueUpdateParams.queueId
            body = annotationQueueUpdateParams.body.toBuilder()
            additionalHeaders = annotationQueueUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = annotationQueueUpdateParams.additionalQueryParams.toBuilder()
        }

        fun queueId(queueId: String?) = apply { this.queueId = queueId }

        /** Alias for calling [Builder.queueId] with `queueId.orElse(null)`. */
        fun queueId(queueId: Optional<String>) = queueId(queueId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [defaultDataset]
         * - [description]
         * - [enableReservations]
         * - [name]
         * - [numReviewersPerItem]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun defaultDataset(defaultDataset: String?) = apply { body.defaultDataset(defaultDataset) }

        /** Alias for calling [Builder.defaultDataset] with `defaultDataset.orElse(null)`. */
        fun defaultDataset(defaultDataset: Optional<String>) =
            defaultDataset(defaultDataset.getOrNull())

        /**
         * Sets [Builder.defaultDataset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultDataset] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultDataset(defaultDataset: JsonField<String>) = apply {
            body.defaultDataset(defaultDataset)
        }

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

        fun enableReservations(enableReservations: Boolean) = apply {
            body.enableReservations(enableReservations)
        }

        /**
         * Sets [Builder.enableReservations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableReservations] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableReservations(enableReservations: JsonField<Boolean>) = apply {
            body.enableReservations(enableReservations)
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

        fun numReviewersPerItem(numReviewersPerItem: Long?) = apply {
            body.numReviewersPerItem(numReviewersPerItem)
        }

        /**
         * Alias for [Builder.numReviewersPerItem].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun numReviewersPerItem(numReviewersPerItem: Long) =
            numReviewersPerItem(numReviewersPerItem as Long?)

        /**
         * Alias for calling [Builder.numReviewersPerItem] with `numReviewersPerItem.orElse(null)`.
         */
        fun numReviewersPerItem(numReviewersPerItem: Optional<Long>) =
            numReviewersPerItem(numReviewersPerItem.getOrNull())

        /**
         * Sets [Builder.numReviewersPerItem] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numReviewersPerItem] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numReviewersPerItem(numReviewersPerItem: JsonField<Long>) = apply {
            body.numReviewersPerItem(numReviewersPerItem)
        }

        fun reservationMinutes(reservationMinutes: Long?) = apply {
            body.reservationMinutes(reservationMinutes)
        }

        /**
         * Alias for [Builder.reservationMinutes].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun reservationMinutes(reservationMinutes: Long) =
            reservationMinutes(reservationMinutes as Long?)

        /**
         * Alias for calling [Builder.reservationMinutes] with `reservationMinutes.orElse(null)`.
         */
        fun reservationMinutes(reservationMinutes: Optional<Long>) =
            reservationMinutes(reservationMinutes.getOrNull())

        /**
         * Sets [Builder.reservationMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reservationMinutes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reservationMinutes(reservationMinutes: JsonField<Long>) = apply {
            body.reservationMinutes(reservationMinutes)
        }

        fun rubricInstructions(rubricInstructions: String?) = apply {
            body.rubricInstructions(rubricInstructions)
        }

        /**
         * Alias for calling [Builder.rubricInstructions] with `rubricInstructions.orElse(null)`.
         */
        fun rubricInstructions(rubricInstructions: Optional<String>) =
            rubricInstructions(rubricInstructions.getOrNull())

        /**
         * Sets [Builder.rubricInstructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rubricInstructions] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rubricInstructions(rubricInstructions: JsonField<String>) = apply {
            body.rubricInstructions(rubricInstructions)
        }

        fun rubricItems(rubricItems: List<AnnotationQueueRubricItemSchema>?) = apply {
            body.rubricItems(rubricItems)
        }

        /** Alias for calling [Builder.rubricItems] with `rubricItems.orElse(null)`. */
        fun rubricItems(rubricItems: Optional<List<AnnotationQueueRubricItemSchema>>) =
            rubricItems(rubricItems.getOrNull())

        /**
         * Sets [Builder.rubricItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rubricItems] with a well-typed
         * `List<AnnotationQueueRubricItemSchema>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun rubricItems(rubricItems: JsonField<List<AnnotationQueueRubricItemSchema>>) = apply {
            body.rubricItems(rubricItems)
        }

        /**
         * Adds a single [AnnotationQueueRubricItemSchema] to [rubricItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRubricItem(rubricItem: AnnotationQueueRubricItemSchema) = apply {
            body.addRubricItem(rubricItem)
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
         * Returns an immutable instance of [AnnotationQueueUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AnnotationQueueUpdateParams =
            AnnotationQueueUpdateParams(
                queueId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> queueId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** AnnotationQueue update schema. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val defaultDataset: JsonField<String>,
        private val description: JsonField<String>,
        private val enableReservations: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val numReviewersPerItem: JsonField<Long>,
        private val reservationMinutes: JsonField<Long>,
        private val rubricInstructions: JsonField<String>,
        private val rubricItems: JsonField<List<AnnotationQueueRubricItemSchema>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("default_dataset")
            @ExcludeMissing
            defaultDataset: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enable_reservations")
            @ExcludeMissing
            enableReservations: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("num_reviewers_per_item")
            @ExcludeMissing
            numReviewersPerItem: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("reservation_minutes")
            @ExcludeMissing
            reservationMinutes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("rubric_instructions")
            @ExcludeMissing
            rubricInstructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rubric_items")
            @ExcludeMissing
            rubricItems: JsonField<List<AnnotationQueueRubricItemSchema>> = JsonMissing.of(),
        ) : this(
            defaultDataset,
            description,
            enableReservations,
            name,
            numReviewersPerItem,
            reservationMinutes,
            rubricInstructions,
            rubricItems,
            mutableMapOf(),
        )

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun defaultDataset(): Optional<String> = defaultDataset.getOptional("default_dataset")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun enableReservations(): Optional<Boolean> =
            enableReservations.getOptional("enable_reservations")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun numReviewersPerItem(): Optional<Long> =
            numReviewersPerItem.getOptional("num_reviewers_per_item")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun reservationMinutes(): Optional<Long> =
            reservationMinutes.getOptional("reservation_minutes")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rubricInstructions(): Optional<String> =
            rubricInstructions.getOptional("rubric_instructions")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rubricItems(): Optional<List<AnnotationQueueRubricItemSchema>> =
            rubricItems.getOptional("rubric_items")

        /**
         * Returns the raw JSON value of [defaultDataset].
         *
         * Unlike [defaultDataset], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("default_dataset")
        @ExcludeMissing
        fun _defaultDataset(): JsonField<String> = defaultDataset

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [enableReservations].
         *
         * Unlike [enableReservations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("enable_reservations")
        @ExcludeMissing
        fun _enableReservations(): JsonField<Boolean> = enableReservations

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [numReviewersPerItem].
         *
         * Unlike [numReviewersPerItem], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("num_reviewers_per_item")
        @ExcludeMissing
        fun _numReviewersPerItem(): JsonField<Long> = numReviewersPerItem

        /**
         * Returns the raw JSON value of [reservationMinutes].
         *
         * Unlike [reservationMinutes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("reservation_minutes")
        @ExcludeMissing
        fun _reservationMinutes(): JsonField<Long> = reservationMinutes

        /**
         * Returns the raw JSON value of [rubricInstructions].
         *
         * Unlike [rubricInstructions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("rubric_instructions")
        @ExcludeMissing
        fun _rubricInstructions(): JsonField<String> = rubricInstructions

        /**
         * Returns the raw JSON value of [rubricItems].
         *
         * Unlike [rubricItems], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rubric_items")
        @ExcludeMissing
        fun _rubricItems(): JsonField<List<AnnotationQueueRubricItemSchema>> = rubricItems

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

            private var defaultDataset: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var enableReservations: JsonField<Boolean> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var numReviewersPerItem: JsonField<Long> = JsonMissing.of()
            private var reservationMinutes: JsonField<Long> = JsonMissing.of()
            private var rubricInstructions: JsonField<String> = JsonMissing.of()
            private var rubricItems: JsonField<MutableList<AnnotationQueueRubricItemSchema>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                defaultDataset = body.defaultDataset
                description = body.description
                enableReservations = body.enableReservations
                name = body.name
                numReviewersPerItem = body.numReviewersPerItem
                reservationMinutes = body.reservationMinutes
                rubricInstructions = body.rubricInstructions
                rubricItems = body.rubricItems.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun defaultDataset(defaultDataset: String?) =
                defaultDataset(JsonField.ofNullable(defaultDataset))

            /** Alias for calling [Builder.defaultDataset] with `defaultDataset.orElse(null)`. */
            fun defaultDataset(defaultDataset: Optional<String>) =
                defaultDataset(defaultDataset.getOrNull())

            /**
             * Sets [Builder.defaultDataset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultDataset] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultDataset(defaultDataset: JsonField<String>) = apply {
                this.defaultDataset = defaultDataset
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

            fun enableReservations(enableReservations: Boolean) =
                enableReservations(JsonField.of(enableReservations))

            /**
             * Sets [Builder.enableReservations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enableReservations] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun enableReservations(enableReservations: JsonField<Boolean>) = apply {
                this.enableReservations = enableReservations
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

            fun numReviewersPerItem(numReviewersPerItem: Long?) =
                numReviewersPerItem(JsonField.ofNullable(numReviewersPerItem))

            /**
             * Alias for [Builder.numReviewersPerItem].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun numReviewersPerItem(numReviewersPerItem: Long) =
                numReviewersPerItem(numReviewersPerItem as Long?)

            /**
             * Alias for calling [Builder.numReviewersPerItem] with
             * `numReviewersPerItem.orElse(null)`.
             */
            fun numReviewersPerItem(numReviewersPerItem: Optional<Long>) =
                numReviewersPerItem(numReviewersPerItem.getOrNull())

            /**
             * Sets [Builder.numReviewersPerItem] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numReviewersPerItem] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numReviewersPerItem(numReviewersPerItem: JsonField<Long>) = apply {
                this.numReviewersPerItem = numReviewersPerItem
            }

            fun reservationMinutes(reservationMinutes: Long?) =
                reservationMinutes(JsonField.ofNullable(reservationMinutes))

            /**
             * Alias for [Builder.reservationMinutes].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun reservationMinutes(reservationMinutes: Long) =
                reservationMinutes(reservationMinutes as Long?)

            /**
             * Alias for calling [Builder.reservationMinutes] with
             * `reservationMinutes.orElse(null)`.
             */
            fun reservationMinutes(reservationMinutes: Optional<Long>) =
                reservationMinutes(reservationMinutes.getOrNull())

            /**
             * Sets [Builder.reservationMinutes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reservationMinutes] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reservationMinutes(reservationMinutes: JsonField<Long>) = apply {
                this.reservationMinutes = reservationMinutes
            }

            fun rubricInstructions(rubricInstructions: String?) =
                rubricInstructions(JsonField.ofNullable(rubricInstructions))

            /**
             * Alias for calling [Builder.rubricInstructions] with
             * `rubricInstructions.orElse(null)`.
             */
            fun rubricInstructions(rubricInstructions: Optional<String>) =
                rubricInstructions(rubricInstructions.getOrNull())

            /**
             * Sets [Builder.rubricInstructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rubricInstructions] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rubricInstructions(rubricInstructions: JsonField<String>) = apply {
                this.rubricInstructions = rubricInstructions
            }

            fun rubricItems(rubricItems: List<AnnotationQueueRubricItemSchema>?) =
                rubricItems(JsonField.ofNullable(rubricItems))

            /** Alias for calling [Builder.rubricItems] with `rubricItems.orElse(null)`. */
            fun rubricItems(rubricItems: Optional<List<AnnotationQueueRubricItemSchema>>) =
                rubricItems(rubricItems.getOrNull())

            /**
             * Sets [Builder.rubricItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rubricItems] with a well-typed
             * `List<AnnotationQueueRubricItemSchema>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun rubricItems(rubricItems: JsonField<List<AnnotationQueueRubricItemSchema>>) = apply {
                this.rubricItems = rubricItems.map { it.toMutableList() }
            }

            /**
             * Adds a single [AnnotationQueueRubricItemSchema] to [rubricItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRubricItem(rubricItem: AnnotationQueueRubricItemSchema) = apply {
                rubricItems =
                    (rubricItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("rubricItems", it).add(rubricItem)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    defaultDataset,
                    description,
                    enableReservations,
                    name,
                    numReviewersPerItem,
                    reservationMinutes,
                    rubricInstructions,
                    (rubricItems ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            defaultDataset()
            description()
            enableReservations()
            name()
            numReviewersPerItem()
            reservationMinutes()
            rubricInstructions()
            rubricItems().ifPresent { it.forEach { it.validate() } }
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
            (if (defaultDataset.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (enableReservations.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (numReviewersPerItem.asKnown().isPresent) 1 else 0) +
                (if (reservationMinutes.asKnown().isPresent) 1 else 0) +
                (if (rubricInstructions.asKnown().isPresent) 1 else 0) +
                (rubricItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                defaultDataset == other.defaultDataset &&
                description == other.description &&
                enableReservations == other.enableReservations &&
                name == other.name &&
                numReviewersPerItem == other.numReviewersPerItem &&
                reservationMinutes == other.reservationMinutes &&
                rubricInstructions == other.rubricInstructions &&
                rubricItems == other.rubricItems &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                defaultDataset,
                description,
                enableReservations,
                name,
                numReviewersPerItem,
                reservationMinutes,
                rubricInstructions,
                rubricItems,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{defaultDataset=$defaultDataset, description=$description, enableReservations=$enableReservations, name=$name, numReviewersPerItem=$numReviewersPerItem, reservationMinutes=$reservationMinutes, rubricInstructions=$rubricInstructions, rubricItems=$rubricItems, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnnotationQueueUpdateParams &&
            queueId == other.queueId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(queueId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AnnotationQueueUpdateParams{queueId=$queueId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
