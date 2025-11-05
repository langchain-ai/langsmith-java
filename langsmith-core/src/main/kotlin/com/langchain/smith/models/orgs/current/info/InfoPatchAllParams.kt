// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.info

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

/** Update Current Organization Info */
class InfoPatchAllParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = body.displayName()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jitProvisioningEnabled(): Optional<Boolean> = body.jitProvisioningEnabled()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun patCreationDisabled(): Optional<Boolean> = body.patCreationDisabled()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publicSharingDisabled(): Optional<Boolean> = body.publicSharingDisabled()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unshareAll(): Optional<Boolean> = body.unshareAll()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workspaceAdminCanInviteToOrg(): Optional<Boolean> = body.workspaceAdminCanInviteToOrg()

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _displayName(): JsonField<String> = body._displayName()

    /**
     * Returns the raw JSON value of [jitProvisioningEnabled].
     *
     * Unlike [jitProvisioningEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _jitProvisioningEnabled(): JsonField<Boolean> = body._jitProvisioningEnabled()

    /**
     * Returns the raw JSON value of [patCreationDisabled].
     *
     * Unlike [patCreationDisabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _patCreationDisabled(): JsonField<Boolean> = body._patCreationDisabled()

    /**
     * Returns the raw JSON value of [publicSharingDisabled].
     *
     * Unlike [publicSharingDisabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _publicSharingDisabled(): JsonField<Boolean> = body._publicSharingDisabled()

    /**
     * Returns the raw JSON value of [unshareAll].
     *
     * Unlike [unshareAll], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _unshareAll(): JsonField<Boolean> = body._unshareAll()

    /**
     * Returns the raw JSON value of [workspaceAdminCanInviteToOrg].
     *
     * Unlike [workspaceAdminCanInviteToOrg], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _workspaceAdminCanInviteToOrg(): JsonField<Boolean> = body._workspaceAdminCanInviteToOrg()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InfoPatchAllParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [InfoPatchAllParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InfoPatchAllParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(infoPatchAllParams: InfoPatchAllParams) = apply {
            body = infoPatchAllParams.body.toBuilder()
            additionalHeaders = infoPatchAllParams.additionalHeaders.toBuilder()
            additionalQueryParams = infoPatchAllParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [displayName]
         * - [jitProvisioningEnabled]
         * - [patCreationDisabled]
         * - [publicSharingDisabled]
         * - [unshareAll]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun displayName(displayName: String) = apply { body.displayName(displayName) }

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { body.displayName(displayName) }

        fun jitProvisioningEnabled(jitProvisioningEnabled: Boolean?) = apply {
            body.jitProvisioningEnabled(jitProvisioningEnabled)
        }

        /**
         * Alias for [Builder.jitProvisioningEnabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun jitProvisioningEnabled(jitProvisioningEnabled: Boolean) =
            jitProvisioningEnabled(jitProvisioningEnabled as Boolean?)

        /**
         * Alias for calling [Builder.jitProvisioningEnabled] with
         * `jitProvisioningEnabled.orElse(null)`.
         */
        fun jitProvisioningEnabled(jitProvisioningEnabled: Optional<Boolean>) =
            jitProvisioningEnabled(jitProvisioningEnabled.getOrNull())

        /**
         * Sets [Builder.jitProvisioningEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jitProvisioningEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun jitProvisioningEnabled(jitProvisioningEnabled: JsonField<Boolean>) = apply {
            body.jitProvisioningEnabled(jitProvisioningEnabled)
        }

        fun patCreationDisabled(patCreationDisabled: Boolean?) = apply {
            body.patCreationDisabled(patCreationDisabled)
        }

        /**
         * Alias for [Builder.patCreationDisabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun patCreationDisabled(patCreationDisabled: Boolean) =
            patCreationDisabled(patCreationDisabled as Boolean?)

        /**
         * Alias for calling [Builder.patCreationDisabled] with `patCreationDisabled.orElse(null)`.
         */
        fun patCreationDisabled(patCreationDisabled: Optional<Boolean>) =
            patCreationDisabled(patCreationDisabled.getOrNull())

        /**
         * Sets [Builder.patCreationDisabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.patCreationDisabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun patCreationDisabled(patCreationDisabled: JsonField<Boolean>) = apply {
            body.patCreationDisabled(patCreationDisabled)
        }

        fun publicSharingDisabled(publicSharingDisabled: Boolean?) = apply {
            body.publicSharingDisabled(publicSharingDisabled)
        }

        /**
         * Alias for [Builder.publicSharingDisabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun publicSharingDisabled(publicSharingDisabled: Boolean) =
            publicSharingDisabled(publicSharingDisabled as Boolean?)

        /**
         * Alias for calling [Builder.publicSharingDisabled] with
         * `publicSharingDisabled.orElse(null)`.
         */
        fun publicSharingDisabled(publicSharingDisabled: Optional<Boolean>) =
            publicSharingDisabled(publicSharingDisabled.getOrNull())

        /**
         * Sets [Builder.publicSharingDisabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publicSharingDisabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun publicSharingDisabled(publicSharingDisabled: JsonField<Boolean>) = apply {
            body.publicSharingDisabled(publicSharingDisabled)
        }

        fun unshareAll(unshareAll: Boolean?) = apply { body.unshareAll(unshareAll) }

        /**
         * Alias for [Builder.unshareAll].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun unshareAll(unshareAll: Boolean) = unshareAll(unshareAll as Boolean?)

        /** Alias for calling [Builder.unshareAll] with `unshareAll.orElse(null)`. */
        fun unshareAll(unshareAll: Optional<Boolean>) = unshareAll(unshareAll.getOrNull())

        /**
         * Sets [Builder.unshareAll] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unshareAll] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unshareAll(unshareAll: JsonField<Boolean>) = apply { body.unshareAll(unshareAll) }

        fun workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg: Boolean?) = apply {
            body.workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg)
        }

        /**
         * Alias for [Builder.workspaceAdminCanInviteToOrg].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg: Boolean) =
            workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg as Boolean?)

        /**
         * Alias for calling [Builder.workspaceAdminCanInviteToOrg] with
         * `workspaceAdminCanInviteToOrg.orElse(null)`.
         */
        fun workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg: Optional<Boolean>) =
            workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg.getOrNull())

        /**
         * Sets [Builder.workspaceAdminCanInviteToOrg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceAdminCanInviteToOrg] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg: JsonField<Boolean>) = apply {
            body.workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg)
        }

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
         * Returns an immutable instance of [InfoPatchAllParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InfoPatchAllParams =
            InfoPatchAllParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Update organization schema. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val displayName: JsonField<String>,
        private val jitProvisioningEnabled: JsonField<Boolean>,
        private val patCreationDisabled: JsonField<Boolean>,
        private val publicSharingDisabled: JsonField<Boolean>,
        private val unshareAll: JsonField<Boolean>,
        private val workspaceAdminCanInviteToOrg: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("jit_provisioning_enabled")
            @ExcludeMissing
            jitProvisioningEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("pat_creation_disabled")
            @ExcludeMissing
            patCreationDisabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("public_sharing_disabled")
            @ExcludeMissing
            publicSharingDisabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("unshare_all")
            @ExcludeMissing
            unshareAll: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("workspace_admin_can_invite_to_org")
            @ExcludeMissing
            workspaceAdminCanInviteToOrg: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            displayName,
            jitProvisioningEnabled,
            patCreationDisabled,
            publicSharingDisabled,
            unshareAll,
            workspaceAdminCanInviteToOrg,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun displayName(): Optional<String> = displayName.getOptional("display_name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun jitProvisioningEnabled(): Optional<Boolean> =
            jitProvisioningEnabled.getOptional("jit_provisioning_enabled")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun patCreationDisabled(): Optional<Boolean> =
            patCreationDisabled.getOptional("pat_creation_disabled")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun publicSharingDisabled(): Optional<Boolean> =
            publicSharingDisabled.getOptional("public_sharing_disabled")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unshareAll(): Optional<Boolean> = unshareAll.getOptional("unshare_all")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun workspaceAdminCanInviteToOrg(): Optional<Boolean> =
            workspaceAdminCanInviteToOrg.getOptional("workspace_admin_can_invite_to_org")

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [jitProvisioningEnabled].
         *
         * Unlike [jitProvisioningEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("jit_provisioning_enabled")
        @ExcludeMissing
        fun _jitProvisioningEnabled(): JsonField<Boolean> = jitProvisioningEnabled

        /**
         * Returns the raw JSON value of [patCreationDisabled].
         *
         * Unlike [patCreationDisabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("pat_creation_disabled")
        @ExcludeMissing
        fun _patCreationDisabled(): JsonField<Boolean> = patCreationDisabled

        /**
         * Returns the raw JSON value of [publicSharingDisabled].
         *
         * Unlike [publicSharingDisabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("public_sharing_disabled")
        @ExcludeMissing
        fun _publicSharingDisabled(): JsonField<Boolean> = publicSharingDisabled

        /**
         * Returns the raw JSON value of [unshareAll].
         *
         * Unlike [unshareAll], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unshare_all")
        @ExcludeMissing
        fun _unshareAll(): JsonField<Boolean> = unshareAll

        /**
         * Returns the raw JSON value of [workspaceAdminCanInviteToOrg].
         *
         * Unlike [workspaceAdminCanInviteToOrg], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("workspace_admin_can_invite_to_org")
        @ExcludeMissing
        fun _workspaceAdminCanInviteToOrg(): JsonField<Boolean> = workspaceAdminCanInviteToOrg

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

            private var displayName: JsonField<String> = JsonMissing.of()
            private var jitProvisioningEnabled: JsonField<Boolean> = JsonMissing.of()
            private var patCreationDisabled: JsonField<Boolean> = JsonMissing.of()
            private var publicSharingDisabled: JsonField<Boolean> = JsonMissing.of()
            private var unshareAll: JsonField<Boolean> = JsonMissing.of()
            private var workspaceAdminCanInviteToOrg: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                displayName = body.displayName
                jitProvisioningEnabled = body.jitProvisioningEnabled
                patCreationDisabled = body.patCreationDisabled
                publicSharingDisabled = body.publicSharingDisabled
                unshareAll = body.unshareAll
                workspaceAdminCanInviteToOrg = body.workspaceAdminCanInviteToOrg
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            fun jitProvisioningEnabled(jitProvisioningEnabled: Boolean?) =
                jitProvisioningEnabled(JsonField.ofNullable(jitProvisioningEnabled))

            /**
             * Alias for [Builder.jitProvisioningEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun jitProvisioningEnabled(jitProvisioningEnabled: Boolean) =
                jitProvisioningEnabled(jitProvisioningEnabled as Boolean?)

            /**
             * Alias for calling [Builder.jitProvisioningEnabled] with
             * `jitProvisioningEnabled.orElse(null)`.
             */
            fun jitProvisioningEnabled(jitProvisioningEnabled: Optional<Boolean>) =
                jitProvisioningEnabled(jitProvisioningEnabled.getOrNull())

            /**
             * Sets [Builder.jitProvisioningEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jitProvisioningEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun jitProvisioningEnabled(jitProvisioningEnabled: JsonField<Boolean>) = apply {
                this.jitProvisioningEnabled = jitProvisioningEnabled
            }

            fun patCreationDisabled(patCreationDisabled: Boolean?) =
                patCreationDisabled(JsonField.ofNullable(patCreationDisabled))

            /**
             * Alias for [Builder.patCreationDisabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun patCreationDisabled(patCreationDisabled: Boolean) =
                patCreationDisabled(patCreationDisabled as Boolean?)

            /**
             * Alias for calling [Builder.patCreationDisabled] with
             * `patCreationDisabled.orElse(null)`.
             */
            fun patCreationDisabled(patCreationDisabled: Optional<Boolean>) =
                patCreationDisabled(patCreationDisabled.getOrNull())

            /**
             * Sets [Builder.patCreationDisabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.patCreationDisabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun patCreationDisabled(patCreationDisabled: JsonField<Boolean>) = apply {
                this.patCreationDisabled = patCreationDisabled
            }

            fun publicSharingDisabled(publicSharingDisabled: Boolean?) =
                publicSharingDisabled(JsonField.ofNullable(publicSharingDisabled))

            /**
             * Alias for [Builder.publicSharingDisabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun publicSharingDisabled(publicSharingDisabled: Boolean) =
                publicSharingDisabled(publicSharingDisabled as Boolean?)

            /**
             * Alias for calling [Builder.publicSharingDisabled] with
             * `publicSharingDisabled.orElse(null)`.
             */
            fun publicSharingDisabled(publicSharingDisabled: Optional<Boolean>) =
                publicSharingDisabled(publicSharingDisabled.getOrNull())

            /**
             * Sets [Builder.publicSharingDisabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.publicSharingDisabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun publicSharingDisabled(publicSharingDisabled: JsonField<Boolean>) = apply {
                this.publicSharingDisabled = publicSharingDisabled
            }

            fun unshareAll(unshareAll: Boolean?) = unshareAll(JsonField.ofNullable(unshareAll))

            /**
             * Alias for [Builder.unshareAll].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun unshareAll(unshareAll: Boolean) = unshareAll(unshareAll as Boolean?)

            /** Alias for calling [Builder.unshareAll] with `unshareAll.orElse(null)`. */
            fun unshareAll(unshareAll: Optional<Boolean>) = unshareAll(unshareAll.getOrNull())

            /**
             * Sets [Builder.unshareAll] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unshareAll] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unshareAll(unshareAll: JsonField<Boolean>) = apply { this.unshareAll = unshareAll }

            fun workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg: Boolean?) =
                workspaceAdminCanInviteToOrg(JsonField.ofNullable(workspaceAdminCanInviteToOrg))

            /**
             * Alias for [Builder.workspaceAdminCanInviteToOrg].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg: Boolean) =
                workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg as Boolean?)

            /**
             * Alias for calling [Builder.workspaceAdminCanInviteToOrg] with
             * `workspaceAdminCanInviteToOrg.orElse(null)`.
             */
            fun workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg: Optional<Boolean>) =
                workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg.getOrNull())

            /**
             * Sets [Builder.workspaceAdminCanInviteToOrg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workspaceAdminCanInviteToOrg] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg: JsonField<Boolean>) =
                apply {
                    this.workspaceAdminCanInviteToOrg = workspaceAdminCanInviteToOrg
                }

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
                    displayName,
                    jitProvisioningEnabled,
                    patCreationDisabled,
                    publicSharingDisabled,
                    unshareAll,
                    workspaceAdminCanInviteToOrg,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            displayName()
            jitProvisioningEnabled()
            patCreationDisabled()
            publicSharingDisabled()
            unshareAll()
            workspaceAdminCanInviteToOrg()
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
            (if (displayName.asKnown().isPresent) 1 else 0) +
                (if (jitProvisioningEnabled.asKnown().isPresent) 1 else 0) +
                (if (patCreationDisabled.asKnown().isPresent) 1 else 0) +
                (if (publicSharingDisabled.asKnown().isPresent) 1 else 0) +
                (if (unshareAll.asKnown().isPresent) 1 else 0) +
                (if (workspaceAdminCanInviteToOrg.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                displayName == other.displayName &&
                jitProvisioningEnabled == other.jitProvisioningEnabled &&
                patCreationDisabled == other.patCreationDisabled &&
                publicSharingDisabled == other.publicSharingDisabled &&
                unshareAll == other.unshareAll &&
                workspaceAdminCanInviteToOrg == other.workspaceAdminCanInviteToOrg &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                displayName,
                jitProvisioningEnabled,
                patCreationDisabled,
                publicSharingDisabled,
                unshareAll,
                workspaceAdminCanInviteToOrg,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{displayName=$displayName, jitProvisioningEnabled=$jitProvisioningEnabled, patCreationDisabled=$patCreationDisabled, publicSharingDisabled=$publicSharingDisabled, unshareAll=$unshareAll, workspaceAdminCanInviteToOrg=$workspaceAdminCanInviteToOrg, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InfoPatchAllParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InfoPatchAllParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
