// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Tenant schema. */
@JsonDeserialize(builder = TenantForUser.Builder::class)
@NoAutoDetect
class TenantForUser
private constructor(
    private val id: JsonField<String>,
    private val organizationId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val displayName: JsonField<String>,
    private val config: JsonField<Config>,
    private val tenantHandle: JsonField<String>,
    private val readOnly: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    fun organizationId(): Optional<String> =
        Optional.ofNullable(organizationId.getNullable("organization_id"))

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun displayName(): String = displayName.getRequired("display_name")

    /**
     * Base class for settings, allowing values to be overridden by environment variables.
     *
     * This is useful in production for secrets you do not wish to save in code, it plays nicely
     * with docker(-compose), Heroku and any 12 factor app design.
     */
    fun config(): Config = config.getRequired("config")

    fun tenantHandle(): Optional<String> =
        Optional.ofNullable(tenantHandle.getNullable("tenant_handle"))

    fun readOnly(): Optional<Boolean> = Optional.ofNullable(readOnly.getNullable("read_only"))

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("organization_id") @ExcludeMissing fun _organizationId() = organizationId

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("display_name") @ExcludeMissing fun _displayName() = displayName

    /**
     * Base class for settings, allowing values to be overridden by environment variables.
     *
     * This is useful in production for secrets you do not wish to save in code, it plays nicely
     * with docker(-compose), Heroku and any 12 factor app design.
     */
    @JsonProperty("config") @ExcludeMissing fun _config() = config

    @JsonProperty("tenant_handle") @ExcludeMissing fun _tenantHandle() = tenantHandle

    @JsonProperty("read_only") @ExcludeMissing fun _readOnly() = readOnly

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TenantForUser = apply {
        if (!validated) {
            id()
            organizationId()
            createdAt()
            displayName()
            config().validate()
            tenantHandle()
            readOnly()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TenantForUser &&
            this.id == other.id &&
            this.organizationId == other.organizationId &&
            this.createdAt == other.createdAt &&
            this.displayName == other.displayName &&
            this.config == other.config &&
            this.tenantHandle == other.tenantHandle &&
            this.readOnly == other.readOnly &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    organizationId,
                    createdAt,
                    displayName,
                    config,
                    tenantHandle,
                    readOnly,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "TenantForUser{id=$id, organizationId=$organizationId, createdAt=$createdAt, displayName=$displayName, config=$config, tenantHandle=$tenantHandle, readOnly=$readOnly, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var displayName: JsonField<String> = JsonMissing.of()
        private var config: JsonField<Config> = JsonMissing.of()
        private var tenantHandle: JsonField<String> = JsonMissing.of()
        private var readOnly: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tenantForUser: TenantForUser) = apply {
            this.id = tenantForUser.id
            this.organizationId = tenantForUser.organizationId
            this.createdAt = tenantForUser.createdAt
            this.displayName = tenantForUser.displayName
            this.config = tenantForUser.config
            this.tenantHandle = tenantForUser.tenantHandle
            this.readOnly = tenantForUser.readOnly
            additionalProperties(tenantForUser.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun organizationId(organizationId: String) = organizationId(JsonField.of(organizationId))

        @JsonProperty("organization_id")
        @ExcludeMissing
        fun organizationId(organizationId: JsonField<String>) = apply {
            this.organizationId = organizationId
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        @JsonProperty("display_name")
        @ExcludeMissing
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        /**
         * Base class for settings, allowing values to be overridden by environment variables.
         *
         * This is useful in production for secrets you do not wish to save in code, it plays nicely
         * with docker(-compose), Heroku and any 12 factor app design.
         */
        fun config(config: Config) = config(JsonField.of(config))

        /**
         * Base class for settings, allowing values to be overridden by environment variables.
         *
         * This is useful in production for secrets you do not wish to save in code, it plays nicely
         * with docker(-compose), Heroku and any 12 factor app design.
         */
        @JsonProperty("config")
        @ExcludeMissing
        fun config(config: JsonField<Config>) = apply { this.config = config }

        fun tenantHandle(tenantHandle: String) = tenantHandle(JsonField.of(tenantHandle))

        @JsonProperty("tenant_handle")
        @ExcludeMissing
        fun tenantHandle(tenantHandle: JsonField<String>) = apply {
            this.tenantHandle = tenantHandle
        }

        fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

        @JsonProperty("read_only")
        @ExcludeMissing
        fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

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

        fun build(): TenantForUser =
            TenantForUser(
                id,
                organizationId,
                createdAt,
                displayName,
                config,
                tenantHandle,
                readOnly,
                additionalProperties.toUnmodifiable(),
            )
    }

    /**
     * Base class for settings, allowing values to be overridden by environment variables.
     *
     * This is useful in production for secrets you do not wish to save in code, it plays nicely
     * with docker(-compose), Heroku and any 12 factor app design.
     */
    @JsonDeserialize(builder = Config.Builder::class)
    @NoAutoDetect
    class Config
    private constructor(
        private val isPersonal: JsonField<Boolean>,
        private val maxIdentities: JsonField<Long>,
        private val maxHourlyTracingRequests: JsonField<Long>,
        private val maxHourlyTracingBytes: JsonField<Long>,
        private val maxMonthlyTotalUniqueTraces: JsonField<Long>,
        private val flags: JsonField<Flags>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun isPersonal(): Optional<Boolean> =
            Optional.ofNullable(isPersonal.getNullable("is_personal"))

        fun maxIdentities(): Optional<Long> =
            Optional.ofNullable(maxIdentities.getNullable("max_identities"))

        fun maxHourlyTracingRequests(): Optional<Long> =
            Optional.ofNullable(maxHourlyTracingRequests.getNullable("max_hourly_tracing_requests"))

        fun maxHourlyTracingBytes(): Optional<Long> =
            Optional.ofNullable(maxHourlyTracingBytes.getNullable("max_hourly_tracing_bytes"))

        fun maxMonthlyTotalUniqueTraces(): Optional<Long> =
            Optional.ofNullable(
                maxMonthlyTotalUniqueTraces.getNullable("max_monthly_total_unique_traces")
            )

        fun flags(): Optional<Flags> = Optional.ofNullable(flags.getNullable("flags"))

        @JsonProperty("is_personal") @ExcludeMissing fun _isPersonal() = isPersonal

        @JsonProperty("max_identities") @ExcludeMissing fun _maxIdentities() = maxIdentities

        @JsonProperty("max_hourly_tracing_requests")
        @ExcludeMissing
        fun _maxHourlyTracingRequests() = maxHourlyTracingRequests

        @JsonProperty("max_hourly_tracing_bytes")
        @ExcludeMissing
        fun _maxHourlyTracingBytes() = maxHourlyTracingBytes

        @JsonProperty("max_monthly_total_unique_traces")
        @ExcludeMissing
        fun _maxMonthlyTotalUniqueTraces() = maxMonthlyTotalUniqueTraces

        @JsonProperty("flags") @ExcludeMissing fun _flags() = flags

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Config = apply {
            if (!validated) {
                isPersonal()
                maxIdentities()
                maxHourlyTracingRequests()
                maxHourlyTracingBytes()
                maxMonthlyTotalUniqueTraces()
                flags().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Config &&
                this.isPersonal == other.isPersonal &&
                this.maxIdentities == other.maxIdentities &&
                this.maxHourlyTracingRequests == other.maxHourlyTracingRequests &&
                this.maxHourlyTracingBytes == other.maxHourlyTracingBytes &&
                this.maxMonthlyTotalUniqueTraces == other.maxMonthlyTotalUniqueTraces &&
                this.flags == other.flags &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        isPersonal,
                        maxIdentities,
                        maxHourlyTracingRequests,
                        maxHourlyTracingBytes,
                        maxMonthlyTotalUniqueTraces,
                        flags,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Config{isPersonal=$isPersonal, maxIdentities=$maxIdentities, maxHourlyTracingRequests=$maxHourlyTracingRequests, maxHourlyTracingBytes=$maxHourlyTracingBytes, maxMonthlyTotalUniqueTraces=$maxMonthlyTotalUniqueTraces, flags=$flags, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var isPersonal: JsonField<Boolean> = JsonMissing.of()
            private var maxIdentities: JsonField<Long> = JsonMissing.of()
            private var maxHourlyTracingRequests: JsonField<Long> = JsonMissing.of()
            private var maxHourlyTracingBytes: JsonField<Long> = JsonMissing.of()
            private var maxMonthlyTotalUniqueTraces: JsonField<Long> = JsonMissing.of()
            private var flags: JsonField<Flags> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(config: Config) = apply {
                this.isPersonal = config.isPersonal
                this.maxIdentities = config.maxIdentities
                this.maxHourlyTracingRequests = config.maxHourlyTracingRequests
                this.maxHourlyTracingBytes = config.maxHourlyTracingBytes
                this.maxMonthlyTotalUniqueTraces = config.maxMonthlyTotalUniqueTraces
                this.flags = config.flags
                additionalProperties(config.additionalProperties)
            }

            fun isPersonal(isPersonal: Boolean) = isPersonal(JsonField.of(isPersonal))

            @JsonProperty("is_personal")
            @ExcludeMissing
            fun isPersonal(isPersonal: JsonField<Boolean>) = apply { this.isPersonal = isPersonal }

            fun maxIdentities(maxIdentities: Long) = maxIdentities(JsonField.of(maxIdentities))

            @JsonProperty("max_identities")
            @ExcludeMissing
            fun maxIdentities(maxIdentities: JsonField<Long>) = apply {
                this.maxIdentities = maxIdentities
            }

            fun maxHourlyTracingRequests(maxHourlyTracingRequests: Long) =
                maxHourlyTracingRequests(JsonField.of(maxHourlyTracingRequests))

            @JsonProperty("max_hourly_tracing_requests")
            @ExcludeMissing
            fun maxHourlyTracingRequests(maxHourlyTracingRequests: JsonField<Long>) = apply {
                this.maxHourlyTracingRequests = maxHourlyTracingRequests
            }

            fun maxHourlyTracingBytes(maxHourlyTracingBytes: Long) =
                maxHourlyTracingBytes(JsonField.of(maxHourlyTracingBytes))

            @JsonProperty("max_hourly_tracing_bytes")
            @ExcludeMissing
            fun maxHourlyTracingBytes(maxHourlyTracingBytes: JsonField<Long>) = apply {
                this.maxHourlyTracingBytes = maxHourlyTracingBytes
            }

            fun maxMonthlyTotalUniqueTraces(maxMonthlyTotalUniqueTraces: Long) =
                maxMonthlyTotalUniqueTraces(JsonField.of(maxMonthlyTotalUniqueTraces))

            @JsonProperty("max_monthly_total_unique_traces")
            @ExcludeMissing
            fun maxMonthlyTotalUniqueTraces(maxMonthlyTotalUniqueTraces: JsonField<Long>) = apply {
                this.maxMonthlyTotalUniqueTraces = maxMonthlyTotalUniqueTraces
            }

            fun flags(flags: Flags) = flags(JsonField.of(flags))

            @JsonProperty("flags")
            @ExcludeMissing
            fun flags(flags: JsonField<Flags>) = apply { this.flags = flags }

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

            fun build(): Config =
                Config(
                    isPersonal,
                    maxIdentities,
                    maxHourlyTracingRequests,
                    maxHourlyTracingBytes,
                    maxMonthlyTotalUniqueTraces,
                    flags,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Flags.Builder::class)
        @NoAutoDetect
        class Flags
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Flags = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Flags && this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Flags{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(flags: Flags) = apply {
                    additionalProperties(flags.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Flags = Flags(additionalProperties.toUnmodifiable())
            }
        }
    }
}
