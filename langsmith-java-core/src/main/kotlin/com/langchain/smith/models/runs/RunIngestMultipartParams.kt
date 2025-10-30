// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.MultipartField
import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.io.path.inputStream
import kotlin.io.path.name

/**
 * Ingests multiple runs, feedback objects, and binary attachments in a single `multipart/form-data`
 * request. **Partâ€‘name pattern**: `<event>.<run_id>[.<field>]` where `event` âˆˆ {`post`,
 * `patch`, `feedback`, `attachment`}.
 * * `post|patch.<run_id>` â€“Â JSON run payload.
 * * `post|patch.<run_id>.<field>` â€“ outâ€‘ofâ€‘band run data (`inputs`, `outputs`, `events`,
 *   `error`, `extra`, `serialized`).
 * * `feedback.<run_id>` â€“ JSON feedback payload (must include `trace_id`).
 * * `attachment.<run_id>.<filename>` â€“ arbitrary binary attachment stored in S3. **Headers**:
 *   every part must set `Content-Type` **and** either a `Content-Length` header or `length`
 *   parameter. Perâ€‘part `Content-Encoding` is **not** allowed; the topâ€‘level request may be
 *   `Content-Encoding: gzip` or `Content-Encoding: zstd`. **Best performance** for highâ€‘volume
 *   ingestion.
 */
class RunIngestMultipartParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Binary attachment linked to run {run_id} */
    fun _attachmentRunIdFilename(): JsonValue = body._attachmentRunIdFilename()

    /**
     * Feedback object (JSON) â€“ must include trace_id
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackRunId(): Optional<InputStream> = body.feedbackRunId()

    /**
     * Run to update (JSON)
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun patchRunId(): Optional<InputStream> = body.patchRunId()

    /**
     * Large outputs object (JSON) stored outâ€‘ofâ€‘band
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun patchRunIdOutputs(): Optional<InputStream> = body.patchRunIdOutputs()

    /**
     * Run to create (JSON)
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postRunId(): Optional<InputStream> = body.postRunId()

    /**
     * Large inputs object (JSON) stored outâ€‘ofâ€‘band
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postRunIdInputs(): Optional<InputStream> = body.postRunIdInputs()

    /**
     * Returns the raw multipart value of [feedbackRunId].
     *
     * Unlike [feedbackRunId], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _feedbackRunId(): MultipartField<InputStream> = body._feedbackRunId()

    /**
     * Returns the raw multipart value of [patchRunId].
     *
     * Unlike [patchRunId], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _patchRunId(): MultipartField<InputStream> = body._patchRunId()

    /**
     * Returns the raw multipart value of [patchRunIdOutputs].
     *
     * Unlike [patchRunIdOutputs], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _patchRunIdOutputs(): MultipartField<InputStream> = body._patchRunIdOutputs()

    /**
     * Returns the raw multipart value of [postRunId].
     *
     * Unlike [postRunId], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _postRunId(): MultipartField<InputStream> = body._postRunId()

    /**
     * Returns the raw multipart value of [postRunIdInputs].
     *
     * Unlike [postRunIdInputs], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _postRunIdInputs(): MultipartField<InputStream> = body._postRunIdInputs()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RunIngestMultipartParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RunIngestMultipartParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunIngestMultipartParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runIngestMultipartParams: RunIngestMultipartParams) = apply {
            body = runIngestMultipartParams.body.toBuilder()
            additionalHeaders = runIngestMultipartParams.additionalHeaders.toBuilder()
            additionalQueryParams = runIngestMultipartParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [attachmentRunIdFilename]
         * - [feedbackRunId]
         * - [patchRunId]
         * - [patchRunIdOutputs]
         * - [postRunId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Binary attachment linked to run {run_id} */
        fun attachmentRunIdFilename(attachmentRunIdFilename: JsonValue) = apply {
            body.attachmentRunIdFilename(attachmentRunIdFilename)
        }

        /** Feedback object (JSON) â€“ must include trace_id */
        fun feedbackRunId(feedbackRunId: InputStream) = apply { body.feedbackRunId(feedbackRunId) }

        /**
         * Sets [Builder.feedbackRunId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.feedbackRunId] with a well-typed [InputStream] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun feedbackRunId(feedbackRunId: MultipartField<InputStream>) = apply {
            body.feedbackRunId(feedbackRunId)
        }

        /** Feedback object (JSON) â€“ must include trace_id */
        fun feedbackRunId(feedbackRunId: ByteArray) = apply { body.feedbackRunId(feedbackRunId) }

        /** Feedback object (JSON) â€“ must include trace_id */
        fun feedbackRunId(path: Path) = apply { body.feedbackRunId(path) }

        /** Run to update (JSON) */
        fun patchRunId(patchRunId: InputStream) = apply { body.patchRunId(patchRunId) }

        /**
         * Sets [Builder.patchRunId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.patchRunId] with a well-typed [InputStream] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun patchRunId(patchRunId: MultipartField<InputStream>) = apply {
            body.patchRunId(patchRunId)
        }

        /** Run to update (JSON) */
        fun patchRunId(patchRunId: ByteArray) = apply { body.patchRunId(patchRunId) }

        /** Run to update (JSON) */
        fun patchRunId(path: Path) = apply { body.patchRunId(path) }

        /** Large outputs object (JSON) stored outâ€‘ofâ€‘band */
        fun patchRunIdOutputs(patchRunIdOutputs: InputStream) = apply {
            body.patchRunIdOutputs(patchRunIdOutputs)
        }

        /**
         * Sets [Builder.patchRunIdOutputs] to an arbitrary multipart value.
         *
         * You should usually call [Builder.patchRunIdOutputs] with a well-typed [InputStream] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun patchRunIdOutputs(patchRunIdOutputs: MultipartField<InputStream>) = apply {
            body.patchRunIdOutputs(patchRunIdOutputs)
        }

        /** Large outputs object (JSON) stored outâ€‘ofâ€‘band */
        fun patchRunIdOutputs(patchRunIdOutputs: ByteArray) = apply {
            body.patchRunIdOutputs(patchRunIdOutputs)
        }

        /** Large outputs object (JSON) stored outâ€‘ofâ€‘band */
        fun patchRunIdOutputs(path: Path) = apply { body.patchRunIdOutputs(path) }

        /** Run to create (JSON) */
        fun postRunId(postRunId: InputStream) = apply { body.postRunId(postRunId) }

        /**
         * Sets [Builder.postRunId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.postRunId] with a well-typed [InputStream] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun postRunId(postRunId: MultipartField<InputStream>) = apply { body.postRunId(postRunId) }

        /** Run to create (JSON) */
        fun postRunId(postRunId: ByteArray) = apply { body.postRunId(postRunId) }

        /** Run to create (JSON) */
        fun postRunId(path: Path) = apply { body.postRunId(path) }

        /** Large inputs object (JSON) stored outâ€‘ofâ€‘band */
        fun postRunIdInputs(postRunIdInputs: InputStream) = apply {
            body.postRunIdInputs(postRunIdInputs)
        }

        /**
         * Sets [Builder.postRunIdInputs] to an arbitrary multipart value.
         *
         * You should usually call [Builder.postRunIdInputs] with a well-typed [InputStream] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun postRunIdInputs(postRunIdInputs: MultipartField<InputStream>) = apply {
            body.postRunIdInputs(postRunIdInputs)
        }

        /** Large inputs object (JSON) stored outâ€‘ofâ€‘band */
        fun postRunIdInputs(postRunIdInputs: ByteArray) = apply {
            body.postRunIdInputs(postRunIdInputs)
        }

        /** Large inputs object (JSON) stored outâ€‘ofâ€‘band */
        fun postRunIdInputs(path: Path) = apply { body.postRunIdInputs(path) }

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
         * Returns an immutable instance of [RunIngestMultipartParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RunIngestMultipartParams =
            RunIngestMultipartParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "attachment.{run_id}.{filename}" to _attachmentRunIdFilename(),
                "feedback.{run_id}" to _feedbackRunId(),
                "patch.{run_id}" to _patchRunId(),
                "patch.{run_id}.outputs" to _patchRunIdOutputs(),
                "post.{run_id}" to _postRunId(),
                "post.{run_id}.inputs" to _postRunIdInputs(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val attachmentRunIdFilename: JsonValue,
        private val feedbackRunId: MultipartField<InputStream>,
        private val patchRunId: MultipartField<InputStream>,
        private val patchRunIdOutputs: MultipartField<InputStream>,
        private val postRunId: MultipartField<InputStream>,
        private val postRunIdInputs: MultipartField<InputStream>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /** Binary attachment linked to run {run_id} */
        @JsonProperty("attachment.{run_id}.{filename}")
        @ExcludeMissing
        fun _attachmentRunIdFilename(): JsonValue = attachmentRunIdFilename

        /**
         * Feedback object (JSON) â€“ must include trace_id
         *
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun feedbackRunId(): Optional<InputStream> =
            feedbackRunId.value.getOptional("feedback.{run_id}")

        /**
         * Run to update (JSON)
         *
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun patchRunId(): Optional<InputStream> = patchRunId.value.getOptional("patch.{run_id}")

        /**
         * Large outputs object (JSON) stored outâ€‘ofâ€‘band
         *
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun patchRunIdOutputs(): Optional<InputStream> =
            patchRunIdOutputs.value.getOptional("patch.{run_id}.outputs")

        /**
         * Run to create (JSON)
         *
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun postRunId(): Optional<InputStream> = postRunId.value.getOptional("post.{run_id}")

        /**
         * Large inputs object (JSON) stored outâ€‘ofâ€‘band
         *
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun postRunIdInputs(): Optional<InputStream> =
            postRunIdInputs.value.getOptional("post.{run_id}.inputs")

        /**
         * Returns the raw multipart value of [feedbackRunId].
         *
         * Unlike [feedbackRunId], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("feedback.{run_id}")
        @ExcludeMissing
        fun _feedbackRunId(): MultipartField<InputStream> = feedbackRunId

        /**
         * Returns the raw multipart value of [patchRunId].
         *
         * Unlike [patchRunId], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("patch.{run_id}")
        @ExcludeMissing
        fun _patchRunId(): MultipartField<InputStream> = patchRunId

        /**
         * Returns the raw multipart value of [patchRunIdOutputs].
         *
         * Unlike [patchRunIdOutputs], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("patch.{run_id}.outputs")
        @ExcludeMissing
        fun _patchRunIdOutputs(): MultipartField<InputStream> = patchRunIdOutputs

        /**
         * Returns the raw multipart value of [postRunId].
         *
         * Unlike [postRunId], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("post.{run_id}")
        @ExcludeMissing
        fun _postRunId(): MultipartField<InputStream> = postRunId

        /**
         * Returns the raw multipart value of [postRunIdInputs].
         *
         * Unlike [postRunIdInputs], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("post.{run_id}.inputs")
        @ExcludeMissing
        fun _postRunIdInputs(): MultipartField<InputStream> = postRunIdInputs

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

            private var attachmentRunIdFilename: JsonValue = JsonMissing.of()
            private var feedbackRunId: MultipartField<InputStream> = MultipartField.of(null)
            private var patchRunId: MultipartField<InputStream> = MultipartField.of(null)
            private var patchRunIdOutputs: MultipartField<InputStream> = MultipartField.of(null)
            private var postRunId: MultipartField<InputStream> = MultipartField.of(null)
            private var postRunIdInputs: MultipartField<InputStream> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                attachmentRunIdFilename = body.attachmentRunIdFilename
                feedbackRunId = body.feedbackRunId
                patchRunId = body.patchRunId
                patchRunIdOutputs = body.patchRunIdOutputs
                postRunId = body.postRunId
                postRunIdInputs = body.postRunIdInputs
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Binary attachment linked to run {run_id} */
            fun attachmentRunIdFilename(attachmentRunIdFilename: JsonValue) = apply {
                this.attachmentRunIdFilename = attachmentRunIdFilename
            }

            /** Feedback object (JSON) â€“ must include trace_id */
            fun feedbackRunId(feedbackRunId: InputStream) =
                feedbackRunId(MultipartField.of(feedbackRunId))

            /**
             * Sets [Builder.feedbackRunId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.feedbackRunId] with a well-typed [InputStream] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun feedbackRunId(feedbackRunId: MultipartField<InputStream>) = apply {
                this.feedbackRunId = feedbackRunId
            }

            /** Feedback object (JSON) â€“ must include trace_id */
            fun feedbackRunId(feedbackRunId: ByteArray) = feedbackRunId(feedbackRunId.inputStream())

            /** Feedback object (JSON) â€“ must include trace_id */
            fun feedbackRunId(path: Path) =
                feedbackRunId(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** Run to update (JSON) */
            fun patchRunId(patchRunId: InputStream) = patchRunId(MultipartField.of(patchRunId))

            /**
             * Sets [Builder.patchRunId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.patchRunId] with a well-typed [InputStream] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun patchRunId(patchRunId: MultipartField<InputStream>) = apply {
                this.patchRunId = patchRunId
            }

            /** Run to update (JSON) */
            fun patchRunId(patchRunId: ByteArray) = patchRunId(patchRunId.inputStream())

            /** Run to update (JSON) */
            fun patchRunId(path: Path) =
                patchRunId(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** Large outputs object (JSON) stored outâ€‘ofâ€‘band */
            fun patchRunIdOutputs(patchRunIdOutputs: InputStream) =
                patchRunIdOutputs(MultipartField.of(patchRunIdOutputs))

            /**
             * Sets [Builder.patchRunIdOutputs] to an arbitrary multipart value.
             *
             * You should usually call [Builder.patchRunIdOutputs] with a well-typed [InputStream]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun patchRunIdOutputs(patchRunIdOutputs: MultipartField<InputStream>) = apply {
                this.patchRunIdOutputs = patchRunIdOutputs
            }

            /** Large outputs object (JSON) stored outâ€‘ofâ€‘band */
            fun patchRunIdOutputs(patchRunIdOutputs: ByteArray) =
                patchRunIdOutputs(patchRunIdOutputs.inputStream())

            /** Large outputs object (JSON) stored outâ€‘ofâ€‘band */
            fun patchRunIdOutputs(path: Path) =
                patchRunIdOutputs(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** Run to create (JSON) */
            fun postRunId(postRunId: InputStream) = postRunId(MultipartField.of(postRunId))

            /**
             * Sets [Builder.postRunId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.postRunId] with a well-typed [InputStream] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postRunId(postRunId: MultipartField<InputStream>) = apply {
                this.postRunId = postRunId
            }

            /** Run to create (JSON) */
            fun postRunId(postRunId: ByteArray) = postRunId(postRunId.inputStream())

            /** Run to create (JSON) */
            fun postRunId(path: Path) =
                postRunId(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** Large inputs object (JSON) stored outâ€‘ofâ€‘band */
            fun postRunIdInputs(postRunIdInputs: InputStream) =
                postRunIdInputs(MultipartField.of(postRunIdInputs))

            /**
             * Sets [Builder.postRunIdInputs] to an arbitrary multipart value.
             *
             * You should usually call [Builder.postRunIdInputs] with a well-typed [InputStream]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun postRunIdInputs(postRunIdInputs: MultipartField<InputStream>) = apply {
                this.postRunIdInputs = postRunIdInputs
            }

            /** Large inputs object (JSON) stored outâ€‘ofâ€‘band */
            fun postRunIdInputs(postRunIdInputs: ByteArray) =
                postRunIdInputs(postRunIdInputs.inputStream())

            /** Large inputs object (JSON) stored outâ€‘ofâ€‘band */
            fun postRunIdInputs(path: Path) =
                postRunIdInputs(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

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
                    attachmentRunIdFilename,
                    feedbackRunId,
                    patchRunId,
                    patchRunIdOutputs,
                    postRunId,
                    postRunIdInputs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            feedbackRunId()
            patchRunId()
            patchRunIdOutputs()
            postRunId()
            postRunIdInputs()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                attachmentRunIdFilename == other.attachmentRunIdFilename &&
                feedbackRunId == other.feedbackRunId &&
                patchRunId == other.patchRunId &&
                patchRunIdOutputs == other.patchRunIdOutputs &&
                postRunId == other.postRunId &&
                postRunIdInputs == other.postRunIdInputs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                attachmentRunIdFilename,
                feedbackRunId,
                patchRunId,
                patchRunIdOutputs,
                postRunId,
                postRunIdInputs,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{attachmentRunIdFilename=$attachmentRunIdFilename, feedbackRunId=$feedbackRunId, patchRunId=$patchRunId, patchRunIdOutputs=$patchRunIdOutputs, postRunId=$postRunId, postRunIdInputs=$postRunIdInputs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunIngestMultipartParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RunIngestMultipartParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
