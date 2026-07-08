// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Updates a run identified by its ID. The body should contain only the fields to be changed;
 * unknown fields are ignored.
 */
class RunUpdateParams
private constructor(
    private val runId: String?,
    private val runIngest: RunIngest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun runId(): Optional<String> = Optional.ofNullable(runId)

    fun runIngest(): RunIngest = runIngest

    fun _additionalBodyProperties(): Map<String, JsonValue> = runIngest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .runIngest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunUpdateParams]. */
    class Builder internal constructor() {

        private var runId: String? = null
        private var runIngest: RunIngest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runUpdateParams: RunUpdateParams) = apply {
            runId = runUpdateParams.runId
            runIngest = runUpdateParams.runIngest
            additionalHeaders = runUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = runUpdateParams.additionalQueryParams.toBuilder()
        }

        fun runId(runId: String?) = apply { this.runId = runId }

        /** Alias for calling [Builder.runId] with `runId.orElse(null)`. */
        fun runId(runId: Optional<String>) = runId(runId.getOrNull())

        fun runIngest(runIngest: RunIngest) = apply { this.runIngest = runIngest }

        /** Binary attachments to upload with this run via `/runs/multipart`. */
        fun attachments(attachments: Map<String, RunAttachment>) = apply {
            runIngest = runIngestBuilder().attachments(attachments).build()
        }

        /** Adds a binary attachment to upload with this run via `/runs/multipart`. */
        fun putAttachment(name: String, attachment: RunAttachment) = apply {
            runIngest = runIngestBuilder().putAttachment(name, attachment).build()
        }

        fun putAllAttachments(attachments: Map<String, RunAttachment>) = apply {
            runIngest = runIngestBuilder().putAllAttachments(attachments).build()
        }

        fun removeAttachment(name: String) = apply {
            runIngest = runIngestBuilder().removeAttachment(name).build()
        }

        fun removeAllAttachments(names: Set<String>) = apply {
            runIngest = runIngestBuilder().removeAllAttachments(names).build()
        }

        private fun runIngestBuilder(): RunIngest.Builder =
            (runIngest ?: RunIngest.builder().build()).toBuilder()

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
         * Returns an immutable instance of [RunUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .runIngest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunUpdateParams =
            RunUpdateParams(
                runId,
                checkRequired("runIngest", runIngest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): RunIngest = runIngest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> runId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunUpdateParams &&
            runId == other.runId &&
            runIngest == other.runIngest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(runId, runIngest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RunUpdateParams{runId=$runId, runIngest=$runIngest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
