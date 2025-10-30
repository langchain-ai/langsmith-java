// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.annotationqueues.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Delete Runs From Annotation Queue */
class RunDeleteParams
private constructor(
    private val queueId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun queueId(): Optional<String> = Optional.ofNullable(queueId)

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun deleteAll(): Optional<Boolean> = body.deleteAll()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun excludeRunIds(): Optional<List<String>> = body.excludeRunIds()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun runIds(): Optional<List<String>> = body.runIds()

    /**
     * Returns the raw JSON value of [deleteAll].
     *
     * Unlike [deleteAll], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _deleteAll(): JsonField<Boolean> = body._deleteAll()

    /**
     * Returns the raw JSON value of [excludeRunIds].
     *
     * Unlike [excludeRunIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _excludeRunIds(): JsonField<List<String>> = body._excludeRunIds()

    /**
     * Returns the raw JSON value of [runIds].
     *
     * Unlike [runIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _runIds(): JsonField<List<String>> = body._runIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RunDeleteParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RunDeleteParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunDeleteParams]. */
    class Builder internal constructor() {

        private var queueId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runDeleteParams: RunDeleteParams) = apply {
            queueId = runDeleteParams.queueId
            body = runDeleteParams.body.toBuilder()
            additionalHeaders = runDeleteParams.additionalHeaders.toBuilder()
            additionalQueryParams = runDeleteParams.additionalQueryParams.toBuilder()
        }

        fun queueId(queueId: String?) = apply { this.queueId = queueId }

        /** Alias for calling [Builder.queueId] with `queueId.orElse(null)`. */
        fun queueId(queueId: Optional<String>) = queueId(queueId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [deleteAll]
         * - [excludeRunIds]
         * - [runIds]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun deleteAll(deleteAll: Boolean) = apply { body.deleteAll(deleteAll) }

        /**
         * Sets [Builder.deleteAll] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deleteAll] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deleteAll(deleteAll: JsonField<Boolean>) = apply { body.deleteAll(deleteAll) }

        fun excludeRunIds(excludeRunIds: List<String>?) = apply {
            body.excludeRunIds(excludeRunIds)
        }

        /** Alias for calling [Builder.excludeRunIds] with `excludeRunIds.orElse(null)`. */
        fun excludeRunIds(excludeRunIds: Optional<List<String>>) =
            excludeRunIds(excludeRunIds.getOrNull())

        /**
         * Sets [Builder.excludeRunIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludeRunIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun excludeRunIds(excludeRunIds: JsonField<List<String>>) = apply {
            body.excludeRunIds(excludeRunIds)
        }

        /**
         * Adds a single [String] to [excludeRunIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludeRunId(excludeRunId: String) = apply { body.addExcludeRunId(excludeRunId) }

        fun runIds(runIds: List<String>?) = apply { body.runIds(runIds) }

        /** Alias for calling [Builder.runIds] with `runIds.orElse(null)`. */
        fun runIds(runIds: Optional<List<String>>) = runIds(runIds.getOrNull())

        /**
         * Sets [Builder.runIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun runIds(runIds: JsonField<List<String>>) = apply { body.runIds(runIds) }

        /**
         * Adds a single [String] to [runIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRunId(runId: String) = apply { body.addRunId(runId) }

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
         * Returns an immutable instance of [RunDeleteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RunDeleteParams =
            RunDeleteParams(
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

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val deleteAll: JsonField<Boolean>,
        private val excludeRunIds: JsonField<List<String>>,
        private val runIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("delete_all")
            @ExcludeMissing
            deleteAll: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("exclude_run_ids")
            @ExcludeMissing
            excludeRunIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("run_ids")
            @ExcludeMissing
            runIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(deleteAll, excludeRunIds, runIds, mutableMapOf())

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun deleteAll(): Optional<Boolean> = deleteAll.getOptional("delete_all")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun excludeRunIds(): Optional<List<String>> = excludeRunIds.getOptional("exclude_run_ids")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun runIds(): Optional<List<String>> = runIds.getOptional("run_ids")

        /**
         * Returns the raw JSON value of [deleteAll].
         *
         * Unlike [deleteAll], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delete_all") @ExcludeMissing fun _deleteAll(): JsonField<Boolean> = deleteAll

        /**
         * Returns the raw JSON value of [excludeRunIds].
         *
         * Unlike [excludeRunIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("exclude_run_ids")
        @ExcludeMissing
        fun _excludeRunIds(): JsonField<List<String>> = excludeRunIds

        /**
         * Returns the raw JSON value of [runIds].
         *
         * Unlike [runIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_ids") @ExcludeMissing fun _runIds(): JsonField<List<String>> = runIds

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

            private var deleteAll: JsonField<Boolean> = JsonMissing.of()
            private var excludeRunIds: JsonField<MutableList<String>>? = null
            private var runIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                deleteAll = body.deleteAll
                excludeRunIds = body.excludeRunIds.map { it.toMutableList() }
                runIds = body.runIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun deleteAll(deleteAll: Boolean) = deleteAll(JsonField.of(deleteAll))

            /**
             * Sets [Builder.deleteAll] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deleteAll] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deleteAll(deleteAll: JsonField<Boolean>) = apply { this.deleteAll = deleteAll }

            fun excludeRunIds(excludeRunIds: List<String>?) =
                excludeRunIds(JsonField.ofNullable(excludeRunIds))

            /** Alias for calling [Builder.excludeRunIds] with `excludeRunIds.orElse(null)`. */
            fun excludeRunIds(excludeRunIds: Optional<List<String>>) =
                excludeRunIds(excludeRunIds.getOrNull())

            /**
             * Sets [Builder.excludeRunIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.excludeRunIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun excludeRunIds(excludeRunIds: JsonField<List<String>>) = apply {
                this.excludeRunIds = excludeRunIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [excludeRunIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExcludeRunId(excludeRunId: String) = apply {
                excludeRunIds =
                    (excludeRunIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("excludeRunIds", it).add(excludeRunId)
                    }
            }

            fun runIds(runIds: List<String>?) = runIds(JsonField.ofNullable(runIds))

            /** Alias for calling [Builder.runIds] with `runIds.orElse(null)`. */
            fun runIds(runIds: Optional<List<String>>) = runIds(runIds.getOrNull())

            /**
             * Sets [Builder.runIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runIds(runIds: JsonField<List<String>>) = apply {
                this.runIds = runIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [runIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRunId(runId: String) = apply {
                runIds =
                    (runIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("runIds", it).add(runId)
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
                    deleteAll,
                    (excludeRunIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (runIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            deleteAll()
            excludeRunIds()
            runIds()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithApiInvalidDataException) {
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
            (if (deleteAll.asKnown().isPresent) 1 else 0) +
                (excludeRunIds.asKnown().getOrNull()?.size ?: 0) +
                (runIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                deleteAll == other.deleteAll &&
                excludeRunIds == other.excludeRunIds &&
                runIds == other.runIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(deleteAll, excludeRunIds, runIds, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{deleteAll=$deleteAll, excludeRunIds=$excludeRunIds, runIds=$runIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunDeleteParams &&
            queueId == other.queueId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(queueId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RunDeleteParams{queueId=$queueId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
