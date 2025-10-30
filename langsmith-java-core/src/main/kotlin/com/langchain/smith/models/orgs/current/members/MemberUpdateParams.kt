// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.members

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
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** This is used for updating a user's role (all auth modes) or full_name/password (basic auth) */
class MemberUpdateParams
private constructor(
    private val identityId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun identityId(): Optional<String> = Optional.ofNullable(identityId)

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fullName(): Optional<String> = body.fullName()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun password(): Optional<String> = body.password()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roleId(): Optional<String> = body.roleId()

    /**
     * Returns the raw JSON value of [fullName].
     *
     * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fullName(): JsonField<String> = body._fullName()

    /**
     * Returns the raw JSON value of [password].
     *
     * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _password(): JsonField<String> = body._password()

    /**
     * Returns the raw JSON value of [roleId].
     *
     * Unlike [roleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _roleId(): JsonField<String> = body._roleId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MemberUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [MemberUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MemberUpdateParams]. */
    class Builder internal constructor() {

        private var identityId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(memberUpdateParams: MemberUpdateParams) = apply {
            identityId = memberUpdateParams.identityId
            body = memberUpdateParams.body.toBuilder()
            additionalHeaders = memberUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = memberUpdateParams.additionalQueryParams.toBuilder()
        }

        fun identityId(identityId: String?) = apply { this.identityId = identityId }

        /** Alias for calling [Builder.identityId] with `identityId.orElse(null)`. */
        fun identityId(identityId: Optional<String>) = identityId(identityId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [fullName]
         * - [password]
         * - [roleId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun fullName(fullName: String?) = apply { body.fullName(fullName) }

        /** Alias for calling [Builder.fullName] with `fullName.orElse(null)`. */
        fun fullName(fullName: Optional<String>) = fullName(fullName.getOrNull())

        /**
         * Sets [Builder.fullName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fullName(fullName: JsonField<String>) = apply { body.fullName(fullName) }

        fun password(password: String?) = apply { body.password(password) }

        /** Alias for calling [Builder.password] with `password.orElse(null)`. */
        fun password(password: Optional<String>) = password(password.getOrNull())

        /**
         * Sets [Builder.password] to an arbitrary JSON value.
         *
         * You should usually call [Builder.password] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun password(password: JsonField<String>) = apply { body.password(password) }

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
         * Returns an immutable instance of [MemberUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MemberUpdateParams =
            MemberUpdateParams(
                identityId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> identityId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fullName: JsonField<String>,
        private val password: JsonField<String>,
        private val roleId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("full_name")
            @ExcludeMissing
            fullName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("password")
            @ExcludeMissing
            password: JsonField<String> = JsonMissing.of(),
            @JsonProperty("role_id") @ExcludeMissing roleId: JsonField<String> = JsonMissing.of(),
        ) : this(fullName, password, roleId, mutableMapOf())

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fullName(): Optional<String> = fullName.getOptional("full_name")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun password(): Optional<String> = password.getOptional("password")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun roleId(): Optional<String> = roleId.getOptional("role_id")

        /**
         * Returns the raw JSON value of [fullName].
         *
         * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("full_name") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

        /**
         * Returns the raw JSON value of [password].
         *
         * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

        /**
         * Returns the raw JSON value of [roleId].
         *
         * Unlike [roleId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("role_id") @ExcludeMissing fun _roleId(): JsonField<String> = roleId

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

            private var fullName: JsonField<String> = JsonMissing.of()
            private var password: JsonField<String> = JsonMissing.of()
            private var roleId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                fullName = body.fullName
                password = body.password
                roleId = body.roleId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun fullName(fullName: String?) = fullName(JsonField.ofNullable(fullName))

            /** Alias for calling [Builder.fullName] with `fullName.orElse(null)`. */
            fun fullName(fullName: Optional<String>) = fullName(fullName.getOrNull())

            /**
             * Sets [Builder.fullName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fullName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

            fun password(password: String?) = password(JsonField.ofNullable(password))

            /** Alias for calling [Builder.password] with `password.orElse(null)`. */
            fun password(password: Optional<String>) = password(password.getOrNull())

            /**
             * Sets [Builder.password] to an arbitrary JSON value.
             *
             * You should usually call [Builder.password] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun password(password: JsonField<String>) = apply { this.password = password }

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
                Body(fullName, password, roleId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            fullName()
            password()
            roleId()
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
            (if (fullName.asKnown().isPresent) 1 else 0) +
                (if (password.asKnown().isPresent) 1 else 0) +
                (if (roleId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                fullName == other.fullName &&
                password == other.password &&
                roleId == other.roleId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(fullName, password, roleId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{fullName=$fullName, password=$password, roleId=$roleId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemberUpdateParams &&
            identityId == other.identityId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(identityId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MemberUpdateParams{identityId=$identityId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
