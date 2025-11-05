// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Given a session, a number K, and (optionally) a list of metadata keys, return the top K values
 * for each key.
 */
class SessionRetrieveMetadataParams
private constructor(
    private val sessionId: String?,
    private val k: Long?,
    private val metadataKeys: List<String>?,
    private val rootRunsOnly: Boolean?,
    private val startTime: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun sessionId(): Optional<String> = Optional.ofNullable(sessionId)

    fun k(): Optional<Long> = Optional.ofNullable(k)

    fun metadataKeys(): Optional<List<String>> = Optional.ofNullable(metadataKeys)

    fun rootRunsOnly(): Optional<Boolean> = Optional.ofNullable(rootRunsOnly)

    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SessionRetrieveMetadataParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [SessionRetrieveMetadataParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionRetrieveMetadataParams]. */
    class Builder internal constructor() {

        private var sessionId: String? = null
        private var k: Long? = null
        private var metadataKeys: MutableList<String>? = null
        private var rootRunsOnly: Boolean? = null
        private var startTime: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sessionRetrieveMetadataParams: SessionRetrieveMetadataParams) = apply {
            sessionId = sessionRetrieveMetadataParams.sessionId
            k = sessionRetrieveMetadataParams.k
            metadataKeys = sessionRetrieveMetadataParams.metadataKeys?.toMutableList()
            rootRunsOnly = sessionRetrieveMetadataParams.rootRunsOnly
            startTime = sessionRetrieveMetadataParams.startTime
            additionalHeaders = sessionRetrieveMetadataParams.additionalHeaders.toBuilder()
            additionalQueryParams = sessionRetrieveMetadataParams.additionalQueryParams.toBuilder()
        }

        fun sessionId(sessionId: String?) = apply { this.sessionId = sessionId }

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

        fun k(k: Long?) = apply { this.k = k }

        /**
         * Alias for [Builder.k].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun k(k: Long) = k(k as Long?)

        /** Alias for calling [Builder.k] with `k.orElse(null)`. */
        fun k(k: Optional<Long>) = k(k.getOrNull())

        fun metadataKeys(metadataKeys: List<String>?) = apply {
            this.metadataKeys = metadataKeys?.toMutableList()
        }

        /** Alias for calling [Builder.metadataKeys] with `metadataKeys.orElse(null)`. */
        fun metadataKeys(metadataKeys: Optional<List<String>>) =
            metadataKeys(metadataKeys.getOrNull())

        /**
         * Adds a single [String] to [metadataKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMetadataKey(metadataKey: String) = apply {
            metadataKeys = (metadataKeys ?: mutableListOf()).apply { add(metadataKey) }
        }

        fun rootRunsOnly(rootRunsOnly: Boolean?) = apply { this.rootRunsOnly = rootRunsOnly }

        /**
         * Alias for [Builder.rootRunsOnly].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun rootRunsOnly(rootRunsOnly: Boolean) = rootRunsOnly(rootRunsOnly as Boolean?)

        /** Alias for calling [Builder.rootRunsOnly] with `rootRunsOnly.orElse(null)`. */
        fun rootRunsOnly(rootRunsOnly: Optional<Boolean>) = rootRunsOnly(rootRunsOnly.getOrNull())

        fun startTime(startTime: OffsetDateTime?) = apply { this.startTime = startTime }

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

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
         * Returns an immutable instance of [SessionRetrieveMetadataParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SessionRetrieveMetadataParams =
            SessionRetrieveMetadataParams(
                sessionId,
                k,
                metadataKeys?.toImmutable(),
                rootRunsOnly,
                startTime,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> sessionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                k?.let { put("k", it.toString()) }
                metadataKeys?.let { put("metadata_keys", it.joinToString(",")) }
                rootRunsOnly?.let { put("root_runs_only", it.toString()) }
                startTime?.let {
                    put("start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionRetrieveMetadataParams &&
            sessionId == other.sessionId &&
            k == other.k &&
            metadataKeys == other.metadataKeys &&
            rootRunsOnly == other.rootRunsOnly &&
            startTime == other.startTime &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            sessionId,
            k,
            metadataKeys,
            rootRunsOnly,
            startTime,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SessionRetrieveMetadataParams{sessionId=$sessionId, k=$k, metadataKeys=$metadataKeys, rootRunsOnly=$rootRunsOnly, startTime=$startTime, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
