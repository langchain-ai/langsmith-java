// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.members

import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get Current Active Workspace Members */
class MemberRetrieveActiveParams
private constructor(
    private val emails: List<String>?,
    private val isDisabled: Boolean?,
    private val limit: Long?,
    private val lsUserIds: List<String>?,
    private val offset: Long?,
    private val userIds: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun emails(): Optional<List<String>> = Optional.ofNullable(emails)

    fun isDisabled(): Optional<Boolean> = Optional.ofNullable(isDisabled)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun lsUserIds(): Optional<List<String>> = Optional.ofNullable(lsUserIds)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    @Deprecated("deprecated") fun userIds(): Optional<List<String>> = Optional.ofNullable(userIds)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MemberRetrieveActiveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [MemberRetrieveActiveParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MemberRetrieveActiveParams]. */
    class Builder internal constructor() {

        private var emails: MutableList<String>? = null
        private var isDisabled: Boolean? = null
        private var limit: Long? = null
        private var lsUserIds: MutableList<String>? = null
        private var offset: Long? = null
        private var userIds: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(memberRetrieveActiveParams: MemberRetrieveActiveParams) = apply {
            emails = memberRetrieveActiveParams.emails?.toMutableList()
            isDisabled = memberRetrieveActiveParams.isDisabled
            limit = memberRetrieveActiveParams.limit
            lsUserIds = memberRetrieveActiveParams.lsUserIds?.toMutableList()
            offset = memberRetrieveActiveParams.offset
            userIds = memberRetrieveActiveParams.userIds?.toMutableList()
            additionalHeaders = memberRetrieveActiveParams.additionalHeaders.toBuilder()
            additionalQueryParams = memberRetrieveActiveParams.additionalQueryParams.toBuilder()
        }

        fun emails(emails: List<String>?) = apply { this.emails = emails?.toMutableList() }

        /** Alias for calling [Builder.emails] with `emails.orElse(null)`. */
        fun emails(emails: Optional<List<String>>) = emails(emails.getOrNull())

        /**
         * Adds a single [String] to [emails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEmail(email: String) = apply {
            emails = (emails ?: mutableListOf()).apply { add(email) }
        }

        fun isDisabled(isDisabled: Boolean?) = apply { this.isDisabled = isDisabled }

        /**
         * Alias for [Builder.isDisabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isDisabled(isDisabled: Boolean) = isDisabled(isDisabled as Boolean?)

        /** Alias for calling [Builder.isDisabled] with `isDisabled.orElse(null)`. */
        fun isDisabled(isDisabled: Optional<Boolean>) = isDisabled(isDisabled.getOrNull())

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        fun lsUserIds(lsUserIds: List<String>?) = apply {
            this.lsUserIds = lsUserIds?.toMutableList()
        }

        /** Alias for calling [Builder.lsUserIds] with `lsUserIds.orElse(null)`. */
        fun lsUserIds(lsUserIds: Optional<List<String>>) = lsUserIds(lsUserIds.getOrNull())

        /**
         * Adds a single [String] to [lsUserIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLsUserId(lsUserId: String) = apply {
            lsUserIds = (lsUserIds ?: mutableListOf()).apply { add(lsUserId) }
        }

        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        @Deprecated("deprecated")
        fun userIds(userIds: List<String>?) = apply { this.userIds = userIds?.toMutableList() }

        /** Alias for calling [Builder.userIds] with `userIds.orElse(null)`. */
        @Deprecated("deprecated")
        fun userIds(userIds: Optional<List<String>>) = userIds(userIds.getOrNull())

        /**
         * Adds a single [String] to [userIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        @Deprecated("deprecated")
        fun addUserId(userId: String) = apply {
            userIds = (userIds ?: mutableListOf()).apply { add(userId) }
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
         * Returns an immutable instance of [MemberRetrieveActiveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MemberRetrieveActiveParams =
            MemberRetrieveActiveParams(
                emails?.toImmutable(),
                isDisabled,
                limit,
                lsUserIds?.toImmutable(),
                offset,
                userIds?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                emails?.let { put("emails", it.joinToString(",")) }
                isDisabled?.let { put("is_disabled", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                lsUserIds?.let { put("ls_user_ids", it.joinToString(",")) }
                offset?.let { put("offset", it.toString()) }
                userIds?.let { put("user_ids", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemberRetrieveActiveParams &&
            emails == other.emails &&
            isDisabled == other.isDisabled &&
            limit == other.limit &&
            lsUserIds == other.lsUserIds &&
            offset == other.offset &&
            userIds == other.userIds &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            emails,
            isDisabled,
            limit,
            lsUserIds,
            offset,
            userIds,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MemberRetrieveActiveParams{emails=$emails, isDisabled=$isDisabled, limit=$limit, lsUserIds=$lsUserIds, offset=$offset, userIds=$userIds, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
