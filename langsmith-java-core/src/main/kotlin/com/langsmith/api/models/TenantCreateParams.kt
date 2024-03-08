// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.models.*
import java.util.Objects
import java.util.Optional

class TenantCreateParams
constructor(
    private val displayName: String,
    private val id: String?,
    private val organizationId: String?,
    private val tenantHandle: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun displayName(): String = displayName

    fun id(): Optional<String> = Optional.ofNullable(id)

    fun organizationId(): Optional<String> = Optional.ofNullable(organizationId)

    fun tenantHandle(): Optional<String> = Optional.ofNullable(tenantHandle)

    @JvmSynthetic
    internal fun getBody(): TenantCreateBody {
        return TenantCreateBody(
            displayName,
            id,
            organizationId,
            tenantHandle,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    /** Creation model for the tenant. */
    @JsonDeserialize(builder = TenantCreateBody.Builder::class)
    @NoAutoDetect
    class TenantCreateBody
    internal constructor(
        private val displayName: String?,
        private val id: String?,
        private val organizationId: String?,
        private val tenantHandle: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("display_name") fun displayName(): String? = displayName

        @JsonProperty("id") fun id(): String? = id

        @JsonProperty("organization_id") fun organizationId(): String? = organizationId

        @JsonProperty("tenant_handle") fun tenantHandle(): String? = tenantHandle

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TenantCreateBody &&
                this.displayName == other.displayName &&
                this.id == other.id &&
                this.organizationId == other.organizationId &&
                this.tenantHandle == other.tenantHandle &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        displayName,
                        id,
                        organizationId,
                        tenantHandle,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TenantCreateBody{displayName=$displayName, id=$id, organizationId=$organizationId, tenantHandle=$tenantHandle, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var displayName: String? = null
            private var id: String? = null
            private var organizationId: String? = null
            private var tenantHandle: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tenantCreateBody: TenantCreateBody) = apply {
                this.displayName = tenantCreateBody.displayName
                this.id = tenantCreateBody.id
                this.organizationId = tenantCreateBody.organizationId
                this.tenantHandle = tenantCreateBody.tenantHandle
                additionalProperties(tenantCreateBody.additionalProperties)
            }

            @JsonProperty("display_name")
            fun displayName(displayName: String) = apply { this.displayName = displayName }

            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            @JsonProperty("organization_id")
            fun organizationId(organizationId: String) = apply {
                this.organizationId = organizationId
            }

            @JsonProperty("tenant_handle")
            fun tenantHandle(tenantHandle: String) = apply { this.tenantHandle = tenantHandle }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): TenantCreateBody =
                TenantCreateBody(
                    checkNotNull(displayName) { "`displayName` is required but was not set" },
                    id,
                    organizationId,
                    tenantHandle,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TenantCreateParams &&
            this.displayName == other.displayName &&
            this.id == other.id &&
            this.organizationId == other.organizationId &&
            this.tenantHandle == other.tenantHandle &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            displayName,
            id,
            organizationId,
            tenantHandle,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "TenantCreateParams{displayName=$displayName, id=$id, organizationId=$organizationId, tenantHandle=$tenantHandle, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var displayName: String? = null
        private var id: String? = null
        private var organizationId: String? = null
        private var tenantHandle: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tenantCreateParams: TenantCreateParams) = apply {
            this.displayName = tenantCreateParams.displayName
            this.id = tenantCreateParams.id
            this.organizationId = tenantCreateParams.organizationId
            this.tenantHandle = tenantCreateParams.tenantHandle
            additionalQueryParams(tenantCreateParams.additionalQueryParams)
            additionalHeaders(tenantCreateParams.additionalHeaders)
            additionalBodyProperties(tenantCreateParams.additionalBodyProperties)
        }

        fun displayName(displayName: String) = apply { this.displayName = displayName }

        fun id(id: String) = apply { this.id = id }

        fun organizationId(organizationId: String) = apply { this.organizationId = organizationId }

        fun tenantHandle(tenantHandle: String) = apply { this.tenantHandle = tenantHandle }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): TenantCreateParams =
            TenantCreateParams(
                checkNotNull(displayName) { "`displayName` is required but was not set" },
                id,
                organizationId,
                tenantHandle,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
