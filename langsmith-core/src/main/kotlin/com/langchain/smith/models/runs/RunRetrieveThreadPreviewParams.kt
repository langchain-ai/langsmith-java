// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.annotation.JsonCreator
import com.langchain.smith.core.Enum
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get preview of a thread. */
class RunRetrieveThreadPreviewParams
private constructor(
    private val threadId: String?,
    private val sessionId: String,
    private val select: List<Select>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun threadId(): Optional<String> = Optional.ofNullable(threadId)

    fun sessionId(): String = sessionId

    fun select(): Optional<List<Select>> = Optional.ofNullable(select)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RunRetrieveThreadPreviewParams].
         *
         * The following fields are required:
         * ```java
         * .sessionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunRetrieveThreadPreviewParams]. */
    class Builder internal constructor() {

        private var threadId: String? = null
        private var sessionId: String? = null
        private var select: MutableList<Select>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runRetrieveThreadPreviewParams: RunRetrieveThreadPreviewParams) = apply {
            threadId = runRetrieveThreadPreviewParams.threadId
            sessionId = runRetrieveThreadPreviewParams.sessionId
            select = runRetrieveThreadPreviewParams.select?.toMutableList()
            additionalHeaders = runRetrieveThreadPreviewParams.additionalHeaders.toBuilder()
            additionalQueryParams = runRetrieveThreadPreviewParams.additionalQueryParams.toBuilder()
        }

        fun threadId(threadId: String?) = apply { this.threadId = threadId }

        /** Alias for calling [Builder.threadId] with `threadId.orElse(null)`. */
        fun threadId(threadId: Optional<String>) = threadId(threadId.getOrNull())

        fun sessionId(sessionId: String) = apply { this.sessionId = sessionId }

        fun select(select: List<Select>?) = apply { this.select = select?.toMutableList() }

        /** Alias for calling [Builder.select] with `select.orElse(null)`. */
        fun select(select: Optional<List<Select>>) = select(select.getOrNull())

        /**
         * Adds a single [Select] to [Builder.select].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSelect(select: Select) = apply {
            this.select = (this.select ?: mutableListOf()).apply { add(select) }
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
         * Returns an immutable instance of [RunRetrieveThreadPreviewParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sessionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunRetrieveThreadPreviewParams =
            RunRetrieveThreadPreviewParams(
                threadId,
                checkRequired("sessionId", sessionId),
                select?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> threadId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("session_id", sessionId)
                select?.let { put("select", it.joinToString(",") { it.toString() }) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Enum for thread messages format types. */
    class Select @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ALL_MESSAGES = of("all_messages")

            @JvmField val HUMAN_AI_PAIRS = of("human_ai_pairs")

            @JvmField val FIRST_HUMAN_LAST_AI = of("first_human_last_ai")

            @JvmStatic fun of(value: String) = Select(JsonField.of(value))
        }

        /** An enum containing [Select]'s known values. */
        enum class Known {
            ALL_MESSAGES,
            HUMAN_AI_PAIRS,
            FIRST_HUMAN_LAST_AI,
        }

        /**
         * An enum containing [Select]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Select] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALL_MESSAGES,
            HUMAN_AI_PAIRS,
            FIRST_HUMAN_LAST_AI,
            /** An enum member indicating that [Select] was instantiated with an unknown value. */
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
                ALL_MESSAGES -> Value.ALL_MESSAGES
                HUMAN_AI_PAIRS -> Value.HUMAN_AI_PAIRS
                FIRST_HUMAN_LAST_AI -> Value.FIRST_HUMAN_LAST_AI
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
                ALL_MESSAGES -> Known.ALL_MESSAGES
                HUMAN_AI_PAIRS -> Known.HUMAN_AI_PAIRS
                FIRST_HUMAN_LAST_AI -> Known.FIRST_HUMAN_LAST_AI
                else -> throw LangChainInvalidDataException("Unknown Select: $value")
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

        fun validate(): Select = apply {
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

            return other is Select && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunRetrieveThreadPreviewParams &&
            threadId == other.threadId &&
            sessionId == other.sessionId &&
            select == other.select &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(threadId, sessionId, select, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RunRetrieveThreadPreviewParams{threadId=$threadId, sessionId=$sessionId, select=$select, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
