// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.group

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

/**
 * Fetch examples for a dataset, and fetch the runs for each example if they are associated with the
 * given session_ids.
 */
class GroupRunsParams
private constructor(
    private val datasetId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun groupBy(): GroupBy = body.groupBy()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadataKey(): String = body.metadataKey()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionIds(): List<String> = body.sessionIds()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Long> = body.limit()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<Long> = body.offset()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun perGroupLimit(): Optional<Long> = body.perGroupLimit()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preview(): Optional<Boolean> = body.preview()

    /**
     * Returns the raw JSON value of [groupBy].
     *
     * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groupBy(): JsonField<GroupBy> = body._groupBy()

    /**
     * Returns the raw JSON value of [metadataKey].
     *
     * Unlike [metadataKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadataKey(): JsonField<String> = body._metadataKey()

    /**
     * Returns the raw JSON value of [sessionIds].
     *
     * Unlike [sessionIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sessionIds(): JsonField<List<String>> = body._sessionIds()

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limit(): JsonField<Long> = body._limit()

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _offset(): JsonField<Long> = body._offset()

    /**
     * Returns the raw JSON value of [perGroupLimit].
     *
     * Unlike [perGroupLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _perGroupLimit(): JsonField<Long> = body._perGroupLimit()

    /**
     * Returns the raw JSON value of [preview].
     *
     * Unlike [preview], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _preview(): JsonField<Boolean> = body._preview()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GroupRunsParams].
         *
         * The following fields are required:
         * ```java
         * .groupBy()
         * .metadataKey()
         * .sessionIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GroupRunsParams]. */
    class Builder internal constructor() {

        private var datasetId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(groupRunsParams: GroupRunsParams) = apply {
            datasetId = groupRunsParams.datasetId
            body = groupRunsParams.body.toBuilder()
            additionalHeaders = groupRunsParams.additionalHeaders.toBuilder()
            additionalQueryParams = groupRunsParams.additionalQueryParams.toBuilder()
        }

        fun datasetId(datasetId: String?) = apply { this.datasetId = datasetId }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [groupBy]
         * - [metadataKey]
         * - [sessionIds]
         * - [limit]
         * - [offset]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun groupBy(groupBy: GroupBy) = apply { body.groupBy(groupBy) }

        /**
         * Sets [Builder.groupBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupBy] with a well-typed [GroupBy] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupBy(groupBy: JsonField<GroupBy>) = apply { body.groupBy(groupBy) }

        fun metadataKey(metadataKey: String) = apply { body.metadataKey(metadataKey) }

        /**
         * Sets [Builder.metadataKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadataKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadataKey(metadataKey: JsonField<String>) = apply { body.metadataKey(metadataKey) }

        fun sessionIds(sessionIds: List<String>) = apply { body.sessionIds(sessionIds) }

        /**
         * Sets [Builder.sessionIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sessionIds(sessionIds: JsonField<List<String>>) = apply { body.sessionIds(sessionIds) }

        /**
         * Adds a single [String] to [sessionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSessionId(sessionId: String) = apply { body.addSessionId(sessionId) }

        fun limit(limit: Long) = apply { body.limit(limit) }

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { body.limit(limit) }

        fun offset(offset: Long) = apply { body.offset(offset) }

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { body.offset(offset) }

        fun perGroupLimit(perGroupLimit: Long) = apply { body.perGroupLimit(perGroupLimit) }

        /**
         * Sets [Builder.perGroupLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perGroupLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun perGroupLimit(perGroupLimit: JsonField<Long>) = apply {
            body.perGroupLimit(perGroupLimit)
        }

        fun preview(preview: Boolean) = apply { body.preview(preview) }

        /**
         * Sets [Builder.preview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preview] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun preview(preview: JsonField<Boolean>) = apply { body.preview(preview) }

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
         * Returns an immutable instance of [GroupRunsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .groupBy()
         * .metadataKey()
         * .sessionIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GroupRunsParams =
            GroupRunsParams(
                datasetId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> datasetId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val groupBy: JsonField<GroupBy>,
        private val metadataKey: JsonField<String>,
        private val sessionIds: JsonField<List<String>>,
        private val limit: JsonField<Long>,
        private val offset: JsonField<Long>,
        private val perGroupLimit: JsonField<Long>,
        private val preview: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("group_by")
            @ExcludeMissing
            groupBy: JsonField<GroupBy> = JsonMissing.of(),
            @JsonProperty("metadata_key")
            @ExcludeMissing
            metadataKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("session_ids")
            @ExcludeMissing
            sessionIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("per_group_limit")
            @ExcludeMissing
            perGroupLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("preview") @ExcludeMissing preview: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            groupBy,
            metadataKey,
            sessionIds,
            limit,
            offset,
            perGroupLimit,
            preview,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun groupBy(): GroupBy = groupBy.getRequired("group_by")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadataKey(): String = metadataKey.getRequired("metadata_key")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sessionIds(): List<String> = sessionIds.getRequired("session_ids")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun offset(): Optional<Long> = offset.getOptional("offset")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun perGroupLimit(): Optional<Long> = perGroupLimit.getOptional("per_group_limit")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun preview(): Optional<Boolean> = preview.getOptional("preview")

        /**
         * Returns the raw JSON value of [groupBy].
         *
         * Unlike [groupBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_by") @ExcludeMissing fun _groupBy(): JsonField<GroupBy> = groupBy

        /**
         * Returns the raw JSON value of [metadataKey].
         *
         * Unlike [metadataKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata_key")
        @ExcludeMissing
        fun _metadataKey(): JsonField<String> = metadataKey

        /**
         * Returns the raw JSON value of [sessionIds].
         *
         * Unlike [sessionIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("session_ids")
        @ExcludeMissing
        fun _sessionIds(): JsonField<List<String>> = sessionIds

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

        /**
         * Returns the raw JSON value of [offset].
         *
         * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

        /**
         * Returns the raw JSON value of [perGroupLimit].
         *
         * Unlike [perGroupLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("per_group_limit")
        @ExcludeMissing
        fun _perGroupLimit(): JsonField<Long> = perGroupLimit

        /**
         * Returns the raw JSON value of [preview].
         *
         * Unlike [preview], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preview") @ExcludeMissing fun _preview(): JsonField<Boolean> = preview

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
             * .groupBy()
             * .metadataKey()
             * .sessionIds()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var groupBy: JsonField<GroupBy>? = null
            private var metadataKey: JsonField<String>? = null
            private var sessionIds: JsonField<MutableList<String>>? = null
            private var limit: JsonField<Long> = JsonMissing.of()
            private var offset: JsonField<Long> = JsonMissing.of()
            private var perGroupLimit: JsonField<Long> = JsonMissing.of()
            private var preview: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                groupBy = body.groupBy
                metadataKey = body.metadataKey
                sessionIds = body.sessionIds.map { it.toMutableList() }
                limit = body.limit
                offset = body.offset
                perGroupLimit = body.perGroupLimit
                preview = body.preview
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun groupBy(groupBy: GroupBy) = groupBy(JsonField.of(groupBy))

            /**
             * Sets [Builder.groupBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupBy] with a well-typed [GroupBy] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupBy(groupBy: JsonField<GroupBy>) = apply { this.groupBy = groupBy }

            fun metadataKey(metadataKey: String) = metadataKey(JsonField.of(metadataKey))

            /**
             * Sets [Builder.metadataKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadataKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadataKey(metadataKey: JsonField<String>) = apply {
                this.metadataKey = metadataKey
            }

            fun sessionIds(sessionIds: List<String>) = sessionIds(JsonField.of(sessionIds))

            /**
             * Sets [Builder.sessionIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionIds(sessionIds: JsonField<List<String>>) = apply {
                this.sessionIds = sessionIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [sessionIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSessionId(sessionId: String) = apply {
                sessionIds =
                    (sessionIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("sessionIds", it).add(sessionId)
                    }
            }

            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            fun offset(offset: Long) = offset(JsonField.of(offset))

            /**
             * Sets [Builder.offset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

            fun perGroupLimit(perGroupLimit: Long) = perGroupLimit(JsonField.of(perGroupLimit))

            /**
             * Sets [Builder.perGroupLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.perGroupLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun perGroupLimit(perGroupLimit: JsonField<Long>) = apply {
                this.perGroupLimit = perGroupLimit
            }

            fun preview(preview: Boolean) = preview(JsonField.of(preview))

            /**
             * Sets [Builder.preview] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preview] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preview(preview: JsonField<Boolean>) = apply { this.preview = preview }

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
             * .groupBy()
             * .metadataKey()
             * .sessionIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("groupBy", groupBy),
                    checkRequired("metadataKey", metadataKey),
                    checkRequired("sessionIds", sessionIds).map { it.toImmutable() },
                    limit,
                    offset,
                    perGroupLimit,
                    preview,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            groupBy().validate()
            metadataKey()
            sessionIds()
            limit()
            offset()
            perGroupLimit()
            preview()
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
            (groupBy.asKnown().getOrNull()?.validity() ?: 0) +
                (if (metadataKey.asKnown().isPresent) 1 else 0) +
                (sessionIds.asKnown().getOrNull()?.size ?: 0) +
                (if (limit.asKnown().isPresent) 1 else 0) +
                (if (offset.asKnown().isPresent) 1 else 0) +
                (if (perGroupLimit.asKnown().isPresent) 1 else 0) +
                (if (preview.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                groupBy == other.groupBy &&
                metadataKey == other.metadataKey &&
                sessionIds == other.sessionIds &&
                limit == other.limit &&
                offset == other.offset &&
                perGroupLimit == other.perGroupLimit &&
                preview == other.preview &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                groupBy,
                metadataKey,
                sessionIds,
                limit,
                offset,
                perGroupLimit,
                preview,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{groupBy=$groupBy, metadataKey=$metadataKey, sessionIds=$sessionIds, limit=$limit, offset=$offset, perGroupLimit=$perGroupLimit, preview=$preview, additionalProperties=$additionalProperties}"
    }

    class GroupBy @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val RUN_METADATA = of("run_metadata")

            @JvmField val EXAMPLE_METADATA = of("example_metadata")

            @JvmStatic fun of(value: String) = GroupBy(JsonField.of(value))
        }

        /** An enum containing [GroupBy]'s known values. */
        enum class Known {
            RUN_METADATA,
            EXAMPLE_METADATA,
        }

        /**
         * An enum containing [GroupBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [GroupBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RUN_METADATA,
            EXAMPLE_METADATA,
            /** An enum member indicating that [GroupBy] was instantiated with an unknown value. */
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
                RUN_METADATA -> Value.RUN_METADATA
                EXAMPLE_METADATA -> Value.EXAMPLE_METADATA
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
                RUN_METADATA -> Known.RUN_METADATA
                EXAMPLE_METADATA -> Known.EXAMPLE_METADATA
                else -> throw LangChainInvalidDataException("Unknown GroupBy: $value")
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

        fun validate(): GroupBy = apply {
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

            return other is GroupBy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GroupRunsParams &&
            datasetId == other.datasetId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(datasetId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "GroupRunsParams{datasetId=$datasetId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
