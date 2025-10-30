// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos

import com.fasterxml.jackson.annotation.JsonCreator
import com.langsmith_api.api.core.Enum
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get all repos. */
class RepoListParams
private constructor(
    private val hasCommits: Boolean?,
    private val isArchived: IsArchived?,
    private val isPublic: IsPublic?,
    private val limit: Long?,
    private val offset: Long?,
    private val query: String?,
    private val sortDirection: SortDirection?,
    private val sortField: SortField?,
    private val tagValueId: List<String>?,
    private val tags: List<String>?,
    private val tenantHandle: String?,
    private val tenantId: String?,
    private val upstreamRepoHandle: String?,
    private val upstreamRepoOwner: String?,
    private val withLatestManifest: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun hasCommits(): Optional<Boolean> = Optional.ofNullable(hasCommits)

    fun isArchived(): Optional<IsArchived> = Optional.ofNullable(isArchived)

    fun isPublic(): Optional<IsPublic> = Optional.ofNullable(isPublic)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun query(): Optional<String> = Optional.ofNullable(query)

    fun sortDirection(): Optional<SortDirection> = Optional.ofNullable(sortDirection)

    fun sortField(): Optional<SortField> = Optional.ofNullable(sortField)

    fun tagValueId(): Optional<List<String>> = Optional.ofNullable(tagValueId)

    fun tags(): Optional<List<String>> = Optional.ofNullable(tags)

    fun tenantHandle(): Optional<String> = Optional.ofNullable(tenantHandle)

    fun tenantId(): Optional<String> = Optional.ofNullable(tenantId)

    fun upstreamRepoHandle(): Optional<String> = Optional.ofNullable(upstreamRepoHandle)

    fun upstreamRepoOwner(): Optional<String> = Optional.ofNullable(upstreamRepoOwner)

    fun withLatestManifest(): Optional<Boolean> = Optional.ofNullable(withLatestManifest)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RepoListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RepoListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RepoListParams]. */
    class Builder internal constructor() {

        private var hasCommits: Boolean? = null
        private var isArchived: IsArchived? = null
        private var isPublic: IsPublic? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var query: String? = null
        private var sortDirection: SortDirection? = null
        private var sortField: SortField? = null
        private var tagValueId: MutableList<String>? = null
        private var tags: MutableList<String>? = null
        private var tenantHandle: String? = null
        private var tenantId: String? = null
        private var upstreamRepoHandle: String? = null
        private var upstreamRepoOwner: String? = null
        private var withLatestManifest: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(repoListParams: RepoListParams) = apply {
            hasCommits = repoListParams.hasCommits
            isArchived = repoListParams.isArchived
            isPublic = repoListParams.isPublic
            limit = repoListParams.limit
            offset = repoListParams.offset
            query = repoListParams.query
            sortDirection = repoListParams.sortDirection
            sortField = repoListParams.sortField
            tagValueId = repoListParams.tagValueId?.toMutableList()
            tags = repoListParams.tags?.toMutableList()
            tenantHandle = repoListParams.tenantHandle
            tenantId = repoListParams.tenantId
            upstreamRepoHandle = repoListParams.upstreamRepoHandle
            upstreamRepoOwner = repoListParams.upstreamRepoOwner
            withLatestManifest = repoListParams.withLatestManifest
            additionalHeaders = repoListParams.additionalHeaders.toBuilder()
            additionalQueryParams = repoListParams.additionalQueryParams.toBuilder()
        }

        fun hasCommits(hasCommits: Boolean?) = apply { this.hasCommits = hasCommits }

        /**
         * Alias for [Builder.hasCommits].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun hasCommits(hasCommits: Boolean) = hasCommits(hasCommits as Boolean?)

        /** Alias for calling [Builder.hasCommits] with `hasCommits.orElse(null)`. */
        fun hasCommits(hasCommits: Optional<Boolean>) = hasCommits(hasCommits.getOrNull())

        fun isArchived(isArchived: IsArchived?) = apply { this.isArchived = isArchived }

        /** Alias for calling [Builder.isArchived] with `isArchived.orElse(null)`. */
        fun isArchived(isArchived: Optional<IsArchived>) = isArchived(isArchived.getOrNull())

        fun isPublic(isPublic: IsPublic?) = apply { this.isPublic = isPublic }

        /** Alias for calling [Builder.isPublic] with `isPublic.orElse(null)`. */
        fun isPublic(isPublic: Optional<IsPublic>) = isPublic(isPublic.getOrNull())

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        fun query(query: String?) = apply { this.query = query }

        /** Alias for calling [Builder.query] with `query.orElse(null)`. */
        fun query(query: Optional<String>) = query(query.getOrNull())

        fun sortDirection(sortDirection: SortDirection?) = apply {
            this.sortDirection = sortDirection
        }

        /** Alias for calling [Builder.sortDirection] with `sortDirection.orElse(null)`. */
        fun sortDirection(sortDirection: Optional<SortDirection>) =
            sortDirection(sortDirection.getOrNull())

        fun sortField(sortField: SortField?) = apply { this.sortField = sortField }

        /** Alias for calling [Builder.sortField] with `sortField.orElse(null)`. */
        fun sortField(sortField: Optional<SortField>) = sortField(sortField.getOrNull())

        fun tagValueId(tagValueId: List<String>?) = apply {
            this.tagValueId = tagValueId?.toMutableList()
        }

        /** Alias for calling [Builder.tagValueId] with `tagValueId.orElse(null)`. */
        fun tagValueId(tagValueId: Optional<List<String>>) = tagValueId(tagValueId.getOrNull())

        /**
         * Adds a single [String] to [Builder.tagValueId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTagValueId(tagValueId: String) = apply {
            this.tagValueId = (this.tagValueId ?: mutableListOf()).apply { add(tagValueId) }
        }

        fun tags(tags: List<String>?) = apply { this.tags = tags?.toMutableList() }

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { tags = (tags ?: mutableListOf()).apply { add(tag) } }

        fun tenantHandle(tenantHandle: String?) = apply { this.tenantHandle = tenantHandle }

        /** Alias for calling [Builder.tenantHandle] with `tenantHandle.orElse(null)`. */
        fun tenantHandle(tenantHandle: Optional<String>) = tenantHandle(tenantHandle.getOrNull())

        fun tenantId(tenantId: String?) = apply { this.tenantId = tenantId }

        /** Alias for calling [Builder.tenantId] with `tenantId.orElse(null)`. */
        fun tenantId(tenantId: Optional<String>) = tenantId(tenantId.getOrNull())

        fun upstreamRepoHandle(upstreamRepoHandle: String?) = apply {
            this.upstreamRepoHandle = upstreamRepoHandle
        }

        /**
         * Alias for calling [Builder.upstreamRepoHandle] with `upstreamRepoHandle.orElse(null)`.
         */
        fun upstreamRepoHandle(upstreamRepoHandle: Optional<String>) =
            upstreamRepoHandle(upstreamRepoHandle.getOrNull())

        fun upstreamRepoOwner(upstreamRepoOwner: String?) = apply {
            this.upstreamRepoOwner = upstreamRepoOwner
        }

        /** Alias for calling [Builder.upstreamRepoOwner] with `upstreamRepoOwner.orElse(null)`. */
        fun upstreamRepoOwner(upstreamRepoOwner: Optional<String>) =
            upstreamRepoOwner(upstreamRepoOwner.getOrNull())

        fun withLatestManifest(withLatestManifest: Boolean?) = apply {
            this.withLatestManifest = withLatestManifest
        }

        /**
         * Alias for [Builder.withLatestManifest].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun withLatestManifest(withLatestManifest: Boolean) =
            withLatestManifest(withLatestManifest as Boolean?)

        /**
         * Alias for calling [Builder.withLatestManifest] with `withLatestManifest.orElse(null)`.
         */
        fun withLatestManifest(withLatestManifest: Optional<Boolean>) =
            withLatestManifest(withLatestManifest.getOrNull())

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
         * Returns an immutable instance of [RepoListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RepoListParams =
            RepoListParams(
                hasCommits,
                isArchived,
                isPublic,
                limit,
                offset,
                query,
                sortDirection,
                sortField,
                tagValueId?.toImmutable(),
                tags?.toImmutable(),
                tenantHandle,
                tenantId,
                upstreamRepoHandle,
                upstreamRepoOwner,
                withLatestManifest,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                hasCommits?.let { put("has_commits", it.toString()) }
                isArchived?.let { put("is_archived", it.toString()) }
                isPublic?.let { put("is_public", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                query?.let { put("query", it) }
                sortDirection?.let { put("sort_direction", it.toString()) }
                sortField?.let { put("sort_field", it.toString()) }
                tagValueId?.let { put("tag_value_id", it.joinToString(",")) }
                tags?.let { put("tags", it.joinToString(",")) }
                tenantHandle?.let { put("tenant_handle", it) }
                tenantId?.let { put("tenant_id", it) }
                upstreamRepoHandle?.let { put("upstream_repo_handle", it) }
                upstreamRepoOwner?.let { put("upstream_repo_owner", it) }
                withLatestManifest?.let { put("with_latest_manifest", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class IsArchived @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TRUE = of("true")

            @JvmField val ALLOW = of("allow")

            @JvmField val FALSE = of("false")

            @JvmStatic fun of(value: String) = IsArchived(JsonField.of(value))
        }

        /** An enum containing [IsArchived]'s known values. */
        enum class Known {
            TRUE,
            ALLOW,
            FALSE,
        }

        /**
         * An enum containing [IsArchived]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [IsArchived] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            ALLOW,
            FALSE,
            /**
             * An enum member indicating that [IsArchived] was instantiated with an unknown value.
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
                TRUE -> Value.TRUE
                ALLOW -> Value.ALLOW
                FALSE -> Value.FALSE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TRUE -> Known.TRUE
                ALLOW -> Known.ALLOW
                FALSE -> Known.FALSE
                else -> throw LangsmithApiInvalidDataException("Unknown IsArchived: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithApiInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): IsArchived = apply {
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
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is IsArchived && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class IsPublic @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmStatic fun of(value: String) = IsPublic(JsonField.of(value))
        }

        /** An enum containing [IsPublic]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
        }

        /**
         * An enum containing [IsPublic]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [IsPublic] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            /** An enum member indicating that [IsPublic] was instantiated with an unknown value. */
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                else -> throw LangsmithApiInvalidDataException("Unknown IsPublic: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithApiInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): IsPublic = apply {
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
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is IsPublic && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class SortDirection @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ASC = of("asc")

            @JvmField val DESC = of("desc")

            @JvmStatic fun of(value: String) = SortDirection(JsonField.of(value))
        }

        /** An enum containing [SortDirection]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [SortDirection]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortDirection] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /**
             * An enum member indicating that [SortDirection] was instantiated with an unknown
             * value.
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
                ASC -> Value.ASC
                DESC -> Value.DESC
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw LangsmithApiInvalidDataException("Unknown SortDirection: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithApiInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): SortDirection = apply {
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
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is SortDirection && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class SortField @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NUM_LIKES = of("num_likes")

            @JvmField val NUM_DOWNLOADS = of("num_downloads")

            @JvmField val NUM_VIEWS = of("num_views")

            @JvmField val UPDATED_AT = of("updated_at")

            @JvmField val RELEVANCE = of("relevance")

            @JvmStatic fun of(value: String) = SortField(JsonField.of(value))
        }

        /** An enum containing [SortField]'s known values. */
        enum class Known {
            NUM_LIKES,
            NUM_DOWNLOADS,
            NUM_VIEWS,
            UPDATED_AT,
            RELEVANCE,
        }

        /**
         * An enum containing [SortField]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortField] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NUM_LIKES,
            NUM_DOWNLOADS,
            NUM_VIEWS,
            UPDATED_AT,
            RELEVANCE,
            /**
             * An enum member indicating that [SortField] was instantiated with an unknown value.
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
                NUM_LIKES -> Value.NUM_LIKES
                NUM_DOWNLOADS -> Value.NUM_DOWNLOADS
                NUM_VIEWS -> Value.NUM_VIEWS
                UPDATED_AT -> Value.UPDATED_AT
                RELEVANCE -> Value.RELEVANCE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                NUM_LIKES -> Known.NUM_LIKES
                NUM_DOWNLOADS -> Known.NUM_DOWNLOADS
                NUM_VIEWS -> Known.NUM_VIEWS
                UPDATED_AT -> Known.UPDATED_AT
                RELEVANCE -> Known.RELEVANCE
                else -> throw LangsmithApiInvalidDataException("Unknown SortField: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithApiInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): SortField = apply {
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
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is SortField && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RepoListParams &&
            hasCommits == other.hasCommits &&
            isArchived == other.isArchived &&
            isPublic == other.isPublic &&
            limit == other.limit &&
            offset == other.offset &&
            query == other.query &&
            sortDirection == other.sortDirection &&
            sortField == other.sortField &&
            tagValueId == other.tagValueId &&
            tags == other.tags &&
            tenantHandle == other.tenantHandle &&
            tenantId == other.tenantId &&
            upstreamRepoHandle == other.upstreamRepoHandle &&
            upstreamRepoOwner == other.upstreamRepoOwner &&
            withLatestManifest == other.withLatestManifest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            hasCommits,
            isArchived,
            isPublic,
            limit,
            offset,
            query,
            sortDirection,
            sortField,
            tagValueId,
            tags,
            tenantHandle,
            tenantId,
            upstreamRepoHandle,
            upstreamRepoOwner,
            withLatestManifest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RepoListParams{hasCommits=$hasCommits, isArchived=$isArchived, isPublic=$isPublic, limit=$limit, offset=$offset, query=$query, sortDirection=$sortDirection, sortField=$sortField, tagValueId=$tagValueId, tags=$tags, tenantHandle=$tenantHandle, tenantId=$tenantId, upstreamRepoHandle=$upstreamRepoHandle, upstreamRepoOwner=$upstreamRepoOwner, withLatestManifest=$withLatestManifest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
