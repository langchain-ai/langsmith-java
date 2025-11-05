// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.members

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Add an existing organization member to the current workspace. */
class MemberCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lsUserId(): Optional<String> = body.lsUserId()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orgIdentityId(): Optional<String> = body.orgIdentityId()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readOnly(): Optional<Boolean> = body.readOnly()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roleId(): Optional<String> = body.roleId()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun userId(): Optional<String> = body.userId()

    /**
     * Returns the raw JSON value of [lsUserId].
     *
     * Unlike [lsUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lsUserId(): JsonField<String> = body._lsUserId()

    /**
     * Returns the raw JSON value of [orgIdentityId].
     *
     * Unlike [orgIdentityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _orgIdentityId(): JsonField<String> = body._orgIdentityId()

    /**
     * Returns the raw JSON value of [readOnly].
     *
     * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _readOnly(): JsonField<Boolean> = body._readOnly()

    /**
     * Returns the raw JSON value of [roleId].
     *
     * Unlike [roleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _roleId(): JsonField<String> = body._roleId()

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated") fun _userId(): JsonField<String> = body._userId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MemberCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [MemberCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MemberCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(memberCreateParams: MemberCreateParams) = apply {
            body = memberCreateParams.body.toBuilder()
            additionalHeaders = memberCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = memberCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [lsUserId]
         * - [orgIdentityId]
         * - [readOnly]
         * - [roleId]
         * - [userId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun lsUserId(lsUserId: String?) = apply { body.lsUserId(lsUserId) }

        /** Alias for calling [Builder.lsUserId] with `lsUserId.orElse(null)`. */
        fun lsUserId(lsUserId: Optional<String>) = lsUserId(lsUserId.getOrNull())

        /**
         * Sets [Builder.lsUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lsUserId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lsUserId(lsUserId: JsonField<String>) = apply { body.lsUserId(lsUserId) }

        fun orgIdentityId(orgIdentityId: String?) = apply { body.orgIdentityId(orgIdentityId) }

        /** Alias for calling [Builder.orgIdentityId] with `orgIdentityId.orElse(null)`. */
        fun orgIdentityId(orgIdentityId: Optional<String>) =
            orgIdentityId(orgIdentityId.getOrNull())

        /**
         * Sets [Builder.orgIdentityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orgIdentityId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun orgIdentityId(orgIdentityId: JsonField<String>) = apply {
            body.orgIdentityId(orgIdentityId)
        }

        fun readOnly(readOnly: Boolean?) = apply { body.readOnly(readOnly) }

        /**
         * Alias for [Builder.readOnly].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun readOnly(readOnly: Boolean) = readOnly(readOnly as Boolean?)

        /** Alias for calling [Builder.readOnly] with `readOnly.orElse(null)`. */
        fun readOnly(readOnly: Optional<Boolean>) = readOnly(readOnly.getOrNull())

        /**
         * Sets [Builder.readOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun readOnly(readOnly: JsonField<Boolean>) = apply { body.readOnly(readOnly) }

        fun roleId(roleId: String?) = apply { body.roleId(roleId) }

        /** Alias for calling [Builder.roleId] with `roleId.orElse(null)`. */
        fun roleId(roleId: Optional<String>) = roleId(roleId.getOrNull())

        /**
         * Sets [Builder.roleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roleId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun roleId(roleId: JsonField<String>) = apply { body.roleId(roleId) }

        @Deprecated("deprecated") fun userId(userId: String?) = apply { body.userId(userId) }

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        @Deprecated("deprecated") fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun userId(userId: JsonField<String>) = apply { body.userId(userId) }

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
         * Returns an immutable instance of [MemberCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MemberCreateParams =
            MemberCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val lsUserId: JsonField<String>,
        private val orgIdentityId: JsonField<String>,
        private val readOnly: JsonField<Boolean>,
        private val roleId: JsonField<String>,
        private val userId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ls_user_id")
            @ExcludeMissing
            lsUserId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("org_identity_id")
            @ExcludeMissing
            orgIdentityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("read_only")
            @ExcludeMissing
            readOnly: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("role_id") @ExcludeMissing roleId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        ) : this(lsUserId, orgIdentityId, readOnly, roleId, userId, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lsUserId(): Optional<String> = lsUserId.getOptional("ls_user_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun orgIdentityId(): Optional<String> = orgIdentityId.getOptional("org_identity_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun readOnly(): Optional<Boolean> = readOnly.getOptional("read_only")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun roleId(): Optional<String> = roleId.getOptional("role_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun userId(): Optional<String> = userId.getOptional("user_id")

        /**
         * Returns the raw JSON value of [lsUserId].
         *
         * Unlike [lsUserId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ls_user_id") @ExcludeMissing fun _lsUserId(): JsonField<String> = lsUserId

        /**
         * Returns the raw JSON value of [orgIdentityId].
         *
         * Unlike [orgIdentityId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("org_identity_id")
        @ExcludeMissing
        fun _orgIdentityId(): JsonField<String> = orgIdentityId

        /**
         * Returns the raw JSON value of [readOnly].
         *
         * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("read_only") @ExcludeMissing fun _readOnly(): JsonField<Boolean> = readOnly

        /**
         * Returns the raw JSON value of [roleId].
         *
         * Unlike [roleId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role_id") @ExcludeMissing fun _roleId(): JsonField<String> = roleId

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("user_id")
        @ExcludeMissing
        fun _userId(): JsonField<String> = userId

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

            private var lsUserId: JsonField<String> = JsonMissing.of()
            private var orgIdentityId: JsonField<String> = JsonMissing.of()
            private var readOnly: JsonField<Boolean> = JsonMissing.of()
            private var roleId: JsonField<String> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                lsUserId = body.lsUserId
                orgIdentityId = body.orgIdentityId
                readOnly = body.readOnly
                roleId = body.roleId
                userId = body.userId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun lsUserId(lsUserId: String?) = lsUserId(JsonField.ofNullable(lsUserId))

            /** Alias for calling [Builder.lsUserId] with `lsUserId.orElse(null)`. */
            fun lsUserId(lsUserId: Optional<String>) = lsUserId(lsUserId.getOrNull())

            /**
             * Sets [Builder.lsUserId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lsUserId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lsUserId(lsUserId: JsonField<String>) = apply { this.lsUserId = lsUserId }

            fun orgIdentityId(orgIdentityId: String?) =
                orgIdentityId(JsonField.ofNullable(orgIdentityId))

            /** Alias for calling [Builder.orgIdentityId] with `orgIdentityId.orElse(null)`. */
            fun orgIdentityId(orgIdentityId: Optional<String>) =
                orgIdentityId(orgIdentityId.getOrNull())

            /**
             * Sets [Builder.orgIdentityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orgIdentityId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orgIdentityId(orgIdentityId: JsonField<String>) = apply {
                this.orgIdentityId = orgIdentityId
            }

            fun readOnly(readOnly: Boolean?) = readOnly(JsonField.ofNullable(readOnly))

            /**
             * Alias for [Builder.readOnly].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun readOnly(readOnly: Boolean) = readOnly(readOnly as Boolean?)

            /** Alias for calling [Builder.readOnly] with `readOnly.orElse(null)`. */
            fun readOnly(readOnly: Optional<Boolean>) = readOnly(readOnly.getOrNull())

            /**
             * Sets [Builder.readOnly] to an arbitrary JSON value.
             *
             * You should usually call [Builder.readOnly] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

            fun roleId(roleId: String?) = roleId(JsonField.ofNullable(roleId))

            /** Alias for calling [Builder.roleId] with `roleId.orElse(null)`. */
            fun roleId(roleId: Optional<String>) = roleId(roleId.getOrNull())

            /**
             * Sets [Builder.roleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roleId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roleId(roleId: JsonField<String>) = apply { this.roleId = roleId }

            @Deprecated("deprecated")
            fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

            /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
            @Deprecated("deprecated")
            fun userId(userId: Optional<String>) = userId(userId.getOrNull())

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
                    lsUserId,
                    orgIdentityId,
                    readOnly,
                    roleId,
                    userId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            lsUserId()
            orgIdentityId()
            readOnly()
            roleId()
            userId()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (lsUserId.asKnown().isPresent) 1 else 0) +
                (if (orgIdentityId.asKnown().isPresent) 1 else 0) +
                (if (readOnly.asKnown().isPresent) 1 else 0) +
                (if (roleId.asKnown().isPresent) 1 else 0) +
                (if (userId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                lsUserId == other.lsUserId &&
                orgIdentityId == other.orgIdentityId &&
                readOnly == other.readOnly &&
                roleId == other.roleId &&
                userId == other.userId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(lsUserId, orgIdentityId, readOnly, roleId, userId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{lsUserId=$lsUserId, orgIdentityId=$orgIdentityId, readOnly=$readOnly, roleId=$roleId, userId=$userId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemberCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MemberCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
