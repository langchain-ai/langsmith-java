// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets.versions

import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.getOrThrow
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get diff between two dataset versions. */
class VersionRetrieveDiffParams
private constructor(
    private val datasetId: String?,
    private val fromVersion: FromVersion,
    private val toVersion: ToVersion,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    fun fromVersion(): FromVersion = fromVersion

    fun toVersion(): ToVersion = toVersion

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VersionRetrieveDiffParams].
         *
         * The following fields are required:
         * ```java
         * .fromVersion()
         * .toVersion()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VersionRetrieveDiffParams]. */
    class Builder internal constructor() {

        private var datasetId: String? = null
        private var fromVersion: FromVersion? = null
        private var toVersion: ToVersion? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(versionRetrieveDiffParams: VersionRetrieveDiffParams) = apply {
            datasetId = versionRetrieveDiffParams.datasetId
            fromVersion = versionRetrieveDiffParams.fromVersion
            toVersion = versionRetrieveDiffParams.toVersion
            additionalHeaders = versionRetrieveDiffParams.additionalHeaders.toBuilder()
            additionalQueryParams = versionRetrieveDiffParams.additionalQueryParams.toBuilder()
        }

        fun datasetId(datasetId: String?) = apply { this.datasetId = datasetId }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        fun fromVersion(fromVersion: FromVersion) = apply { this.fromVersion = fromVersion }

        /** Alias for calling [fromVersion] with `FromVersion.ofOffsetDateTime(offsetDateTime)`. */
        fun fromVersion(offsetDateTime: OffsetDateTime) =
            fromVersion(FromVersion.ofOffsetDateTime(offsetDateTime))

        /** Alias for calling [fromVersion] with `FromVersion.ofString(string)`. */
        fun fromVersion(string: String) = fromVersion(FromVersion.ofString(string))

        fun toVersion(toVersion: ToVersion) = apply { this.toVersion = toVersion }

        /** Alias for calling [toVersion] with `ToVersion.ofOffsetDateTime(offsetDateTime)`. */
        fun toVersion(offsetDateTime: OffsetDateTime) =
            toVersion(ToVersion.ofOffsetDateTime(offsetDateTime))

        /** Alias for calling [toVersion] with `ToVersion.ofString(string)`. */
        fun toVersion(string: String) = toVersion(ToVersion.ofString(string))

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
         * Returns an immutable instance of [VersionRetrieveDiffParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fromVersion()
         * .toVersion()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VersionRetrieveDiffParams =
            VersionRetrieveDiffParams(
                datasetId,
                checkRequired("fromVersion", fromVersion),
                checkRequired("toVersion", toVersion),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> datasetId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                fromVersion.accept(
                    object : FromVersion.Visitor<Unit> {
                        override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) {
                            put(
                                "from_version",
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(offsetDateTime),
                            )
                        }

                        override fun visitString(string: String) {
                            put("from_version", string)
                        }
                    }
                )
                toVersion.accept(
                    object : ToVersion.Visitor<Unit> {
                        override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) {
                            put(
                                "to_version",
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(offsetDateTime),
                            )
                        }

                        override fun visitString(string: String) {
                            put("to_version", string)
                        }
                    }
                )
                putAll(additionalQueryParams)
            }
            .build()

    class FromVersion
    private constructor(
        private val offsetDateTime: OffsetDateTime? = null,
        private val string: String? = null,
    ) {

        fun offsetDateTime(): Optional<OffsetDateTime> = Optional.ofNullable(offsetDateTime)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isOffsetDateTime(): Boolean = offsetDateTime != null

        fun isString(): Boolean = string != null

        fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

        fun asString(): String = string.getOrThrow("string")

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                string != null -> visitor.visitString(string)
                else -> throw IllegalStateException("Invalid FromVersion")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FromVersion &&
                offsetDateTime == other.offsetDateTime &&
                string == other.string
        }

        override fun hashCode(): Int = Objects.hash(offsetDateTime, string)

        override fun toString(): String =
            when {
                offsetDateTime != null -> "FromVersion{offsetDateTime=$offsetDateTime}"
                string != null -> "FromVersion{string=$string}"
                else -> throw IllegalStateException("Invalid FromVersion")
            }

        companion object {

            @JvmStatic
            fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                FromVersion(offsetDateTime = offsetDateTime)

            @JvmStatic fun ofString(string: String) = FromVersion(string = string)
        }

        /**
         * An interface that defines how to map each variant of [FromVersion] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

            fun visitString(string: String): T
        }
    }

    class ToVersion
    private constructor(
        private val offsetDateTime: OffsetDateTime? = null,
        private val string: String? = null,
    ) {

        fun offsetDateTime(): Optional<OffsetDateTime> = Optional.ofNullable(offsetDateTime)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isOffsetDateTime(): Boolean = offsetDateTime != null

        fun isString(): Boolean = string != null

        fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

        fun asString(): String = string.getOrThrow("string")

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                string != null -> visitor.visitString(string)
                else -> throw IllegalStateException("Invalid ToVersion")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ToVersion &&
                offsetDateTime == other.offsetDateTime &&
                string == other.string
        }

        override fun hashCode(): Int = Objects.hash(offsetDateTime, string)

        override fun toString(): String =
            when {
                offsetDateTime != null -> "ToVersion{offsetDateTime=$offsetDateTime}"
                string != null -> "ToVersion{string=$string}"
                else -> throw IllegalStateException("Invalid ToVersion")
            }

        companion object {

            @JvmStatic
            fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                ToVersion(offsetDateTime = offsetDateTime)

            @JvmStatic fun ofString(string: String) = ToVersion(string = string)
        }

        /**
         * An interface that defines how to map each variant of [ToVersion] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

            fun visitString(string: String): T
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VersionRetrieveDiffParams &&
            datasetId == other.datasetId &&
            fromVersion == other.fromVersion &&
            toVersion == other.toVersion &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(datasetId, fromVersion, toVersion, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VersionRetrieveDiffParams{datasetId=$datasetId, fromVersion=$fromVersion, toVersion=$toVersion, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
