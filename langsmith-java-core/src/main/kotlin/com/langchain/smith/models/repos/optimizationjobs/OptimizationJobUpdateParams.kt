// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.optimizationjobs

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
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Replace an existing prompt optimization job with a new, modified job. */
class OptimizationJobUpdateParams
private constructor(
    private val owner: String,
    private val repo: String,
    private val jobId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun owner(): String = owner

    fun repo(): String = repo

    fun jobId(): Optional<String> = Optional.ofNullable(jobId)

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<PromptOptimizationResult> = body.result()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<EPromptOptimizationJobStatus> = body.status()

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _result(): JsonField<PromptOptimizationResult> = body._result()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<EPromptOptimizationJobStatus> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OptimizationJobUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .owner()
         * .repo()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OptimizationJobUpdateParams]. */
    class Builder internal constructor() {

        private var owner: String? = null
        private var repo: String? = null
        private var jobId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(optimizationJobUpdateParams: OptimizationJobUpdateParams) = apply {
            owner = optimizationJobUpdateParams.owner
            repo = optimizationJobUpdateParams.repo
            jobId = optimizationJobUpdateParams.jobId
            body = optimizationJobUpdateParams.body.toBuilder()
            additionalHeaders = optimizationJobUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = optimizationJobUpdateParams.additionalQueryParams.toBuilder()
        }

        fun owner(owner: String) = apply { this.owner = owner }

        fun repo(repo: String) = apply { this.repo = repo }

        fun jobId(jobId: String?) = apply { this.jobId = jobId }

        /** Alias for calling [Builder.jobId] with `jobId.orElse(null)`. */
        fun jobId(jobId: Optional<String>) = jobId(jobId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [result]
         * - [status]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun result(result: PromptOptimizationResult?) = apply { body.result(result) }

        /** Alias for calling [Builder.result] with `result.orElse(null)`. */
        fun result(result: Optional<PromptOptimizationResult>) = result(result.getOrNull())

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [PromptOptimizationResult]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun result(result: JsonField<PromptOptimizationResult>) = apply { body.result(result) }

        fun status(status: EPromptOptimizationJobStatus?) = apply { body.status(status) }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<EPromptOptimizationJobStatus>) = status(status.getOrNull())

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [EPromptOptimizationJobStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun status(status: JsonField<EPromptOptimizationJobStatus>) = apply { body.status(status) }

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
         * Returns an immutable instance of [OptimizationJobUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .owner()
         * .repo()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OptimizationJobUpdateParams =
            OptimizationJobUpdateParams(
                checkRequired("owner", owner),
                checkRequired("repo", repo),
                jobId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> owner
            1 -> repo
            2 -> jobId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val result: JsonField<PromptOptimizationResult>,
        private val status: JsonField<EPromptOptimizationJobStatus>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("result")
            @ExcludeMissing
            result: JsonField<PromptOptimizationResult> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<EPromptOptimizationJobStatus> = JsonMissing.of(),
        ) : this(result, status, mutableMapOf())

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun result(): Optional<PromptOptimizationResult> = result.getOptional("result")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): Optional<EPromptOptimizationJobStatus> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result")
        @ExcludeMissing
        fun _result(): JsonField<PromptOptimizationResult> = result

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<EPromptOptimizationJobStatus> = status

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

            private var result: JsonField<PromptOptimizationResult> = JsonMissing.of()
            private var status: JsonField<EPromptOptimizationJobStatus> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                result = body.result
                status = body.status
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun result(result: PromptOptimizationResult?) = result(JsonField.ofNullable(result))

            /** Alias for calling [Builder.result] with `result.orElse(null)`. */
            fun result(result: Optional<PromptOptimizationResult>) = result(result.getOrNull())

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [PromptOptimizationResult]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun result(result: JsonField<PromptOptimizationResult>) = apply { this.result = result }

            fun status(status: EPromptOptimizationJobStatus?) = status(JsonField.ofNullable(status))

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<EPromptOptimizationJobStatus>) = status(status.getOrNull())

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed
             * [EPromptOptimizationJobStatus] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun status(status: JsonField<EPromptOptimizationJobStatus>) = apply {
                this.status = status
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
            fun build(): Body = Body(result, status, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            result().ifPresent { it.validate() }
            status().ifPresent { it.validate() }
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
            (result.asKnown().getOrNull()?.validity() ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                result == other.result &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(result, status, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{result=$result, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OptimizationJobUpdateParams &&
            owner == other.owner &&
            repo == other.repo &&
            jobId == other.jobId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(owner, repo, jobId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OptimizationJobUpdateParams{owner=$owner, repo=$repo, jobId=$jobId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
