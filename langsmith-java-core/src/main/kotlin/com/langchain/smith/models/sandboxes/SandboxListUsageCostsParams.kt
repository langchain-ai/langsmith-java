// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.annotation.JsonCreator
import com.langchain.smith.core.Enum
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns priced usage per sandbox or snapshot and UTC hour in the half-open requested interval.
 * LCU uses the recorded compute amount for sandboxes; snapshots have zero LCU. LSU allocates the
 * recorded workspace storage amount proportionally to attributed bytes, including checkpoints on
 * their sandbox and snapshots as separate resources. Resource filters preserve each resource's
 * share. Rate changes do not reprice recorded amounts. An access-filtered page can have no items
 * and a non-null next_cursor; continue until next_cursor is null.
 */
class SandboxListUsageCostsParams
private constructor(
    private val endTime: OffsetDateTime,
    private val startTime: OffsetDateTime,
    private val cursor: String?,
    private val pageSize: Long?,
    private val resourceIds: List<String>?,
    private val resourceType: ResourceType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Exclusive RFC3339 end time; the range must not exceed 31 days */
    fun endTime(): OffsetDateTime = endTime

    /** Inclusive RFC3339 start time */
    fun startTime(): OffsetDateTime = startTime

    /** Opaque pagination cursor */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Maximum rows to return */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Resource UUID filter; repeat this parameter up to 100 times */
    fun resourceIds(): Optional<List<String>> = Optional.ofNullable(resourceIds)

    /** Resource type filter */
    fun resourceType(): Optional<ResourceType> = Optional.ofNullable(resourceType)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SandboxListUsageCostsParams].
         *
         * The following fields are required:
         * ```java
         * .endTime()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SandboxListUsageCostsParams]. */
    class Builder internal constructor() {

        private var endTime: OffsetDateTime? = null
        private var startTime: OffsetDateTime? = null
        private var cursor: String? = null
        private var pageSize: Long? = null
        private var resourceIds: MutableList<String>? = null
        private var resourceType: ResourceType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sandboxListUsageCostsParams: SandboxListUsageCostsParams) = apply {
            endTime = sandboxListUsageCostsParams.endTime
            startTime = sandboxListUsageCostsParams.startTime
            cursor = sandboxListUsageCostsParams.cursor
            pageSize = sandboxListUsageCostsParams.pageSize
            resourceIds = sandboxListUsageCostsParams.resourceIds?.toMutableList()
            resourceType = sandboxListUsageCostsParams.resourceType
            additionalHeaders = sandboxListUsageCostsParams.additionalHeaders.toBuilder()
            additionalQueryParams = sandboxListUsageCostsParams.additionalQueryParams.toBuilder()
        }

        /** Exclusive RFC3339 end time; the range must not exceed 31 days */
        fun endTime(endTime: OffsetDateTime) = apply { this.endTime = endTime }

        /** Inclusive RFC3339 start time */
        fun startTime(startTime: OffsetDateTime) = apply { this.startTime = startTime }

        /** Opaque pagination cursor */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Maximum rows to return */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Resource UUID filter; repeat this parameter up to 100 times */
        fun resourceIds(resourceIds: List<String>?) = apply {
            this.resourceIds = resourceIds?.toMutableList()
        }

        /** Alias for calling [Builder.resourceIds] with `resourceIds.orElse(null)`. */
        fun resourceIds(resourceIds: Optional<List<String>>) = resourceIds(resourceIds.getOrNull())

        /**
         * Adds a single [String] to [resourceIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResourceId(resourceId: String) = apply {
            resourceIds = (resourceIds ?: mutableListOf()).apply { add(resourceId) }
        }

        /** Resource type filter */
        fun resourceType(resourceType: ResourceType?) = apply { this.resourceType = resourceType }

        /** Alias for calling [Builder.resourceType] with `resourceType.orElse(null)`. */
        fun resourceType(resourceType: Optional<ResourceType>) =
            resourceType(resourceType.getOrNull())

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
         * Returns an immutable instance of [SandboxListUsageCostsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endTime()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SandboxListUsageCostsParams =
            SandboxListUsageCostsParams(
                checkRequired("endTime", endTime),
                checkRequired("startTime", startTime),
                cursor,
                pageSize,
                resourceIds?.toImmutable(),
                resourceType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("end_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(endTime))
                put("start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(startTime))
                cursor?.let { put("cursor", it) }
                pageSize?.let { put("page_size", it.toString()) }
                resourceIds?.forEach { put("resource_ids", it) }
                resourceType?.let { put("resource_type", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Resource type filter */
    class ResourceType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val SANDBOX = of("SANDBOX")

            @JvmField val SNAPSHOT = of("SNAPSHOT")

            @JvmStatic fun of(value: String) = ResourceType(JsonField.of(value))
        }

        /** An enum containing [ResourceType]'s known values. */
        enum class Known {
            SANDBOX,
            SNAPSHOT,
        }

        /**
         * An enum containing [ResourceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ResourceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SANDBOX,
            SNAPSHOT,
            /**
             * An enum member indicating that [ResourceType] was instantiated with an unknown value.
             */
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
                SANDBOX -> Value.SANDBOX
                SNAPSHOT -> Value.SNAPSHOT
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
                SANDBOX -> Known.SANDBOX
                SNAPSHOT -> Known.SNAPSHOT
                else -> throw LangChainInvalidDataException("Unknown ResourceType: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ResourceType = apply {
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

            return other is ResourceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SandboxListUsageCostsParams &&
            endTime == other.endTime &&
            startTime == other.startTime &&
            cursor == other.cursor &&
            pageSize == other.pageSize &&
            resourceIds == other.resourceIds &&
            resourceType == other.resourceType &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            endTime,
            startTime,
            cursor,
            pageSize,
            resourceIds,
            resourceType,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SandboxListUsageCostsParams{endTime=$endTime, startTime=$startTime, cursor=$cursor, pageSize=$pageSize, resourceIds=$resourceIds, resourceType=$resourceType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
