// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
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
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@JsonDeserialize(builder = Tenant.Builder::class)
@NoAutoDetect
class Tenant
private constructor( // templates/JavaSDK/entities/objects.ts:76:13
    private val id: JsonField<String>, // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    private val organizationId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val displayName: JsonField<String>,
    private val config: JsonField<Config>,
    private val tenantHandle: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

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

    @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _id() = id

    @JsonProperty("organization_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _organizationId() = organizationId

    @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _createdAt() = createdAt

    @JsonProperty("display_name") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _displayName() = displayName

    /**
     * Base class for settings, allowing values to be overridden by environment variables.
     *
     * This is useful in production for secrets you do not wish to save in code, it plays nicely
     * with docker(-compose), Heroku and any 12 factor app design.
     */
    @JsonProperty("config") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _config() = config

    @JsonProperty("tenant_handle") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _tenantHandle() = tenantHandle

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Tenant = apply { // templates/JavaSDK/entities/objects.ts:198:28
        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:198:28 //
            // templates/JavaSDK/entities/objects.ts:198:28
            id() // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:201:20
            organizationId()
            createdAt()
            displayName()
            config().validate()
            tenantHandle()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is Tenant && // templates/JavaSDK/entities/fields.ts:143:33
            this.id == other.id &&
            this.organizationId == other.organizationId &&
            this.createdAt == other.createdAt &&
            this.displayName == other.displayName &&
            this.config == other.config &&
            this.tenantHandle == other.tenantHandle &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
            // templates/JavaSDK/entities/fields.ts:174:16 //
            // templates/JavaSDK/entities/fields.ts:174:16
            hashCode =
                Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                    // templates/JavaSDK/entities/fields.ts:175:16 //
                    // templates/JavaSDK/entities/fields.ts:175:16
                    id, // templates/JavaSDK/entities/fields.ts:163:19
                    organizationId,
                    createdAt,
                    displayName,
                    config,
                    tenantHandle,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Tenant{id=$id, organizationId=$organizationId, createdAt=$createdAt, displayName=$displayName, config=$config, tenantHandle=$tenantHandle, additionalProperties=$additionalProperties}"

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var id: JsonField<String> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var displayName: JsonField<String> = JsonMissing.of()
        private var config: JsonField<Config> = JsonMissing.of()
        private var tenantHandle: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(tenant: Tenant) = apply { // templates/JavaSDK/entities/objects.ts:240:30
            this.id = tenant.id // templates/JavaSDK/entities/objects.ts:240:30 //
            // templates/JavaSDK/entities/objects.ts:240:30
            this.organizationId = tenant.organizationId
            this.createdAt = tenant.createdAt
            this.displayName = tenant.displayName
            this.config = tenant.config
            this.tenantHandle = tenant.tenantHandle
            additionalProperties(tenant.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.id = id
        }

        fun organizationId(organizationId: String) =
            organizationId(
                JsonField.of(organizationId)
            ) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("organization_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun organizationId(organizationId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.organizationId = organizationId
            }

        fun createdAt(createdAt: OffsetDateTime) =
            createdAt(JsonField.of(createdAt)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.createdAt = createdAt
            }

        fun displayName(displayName: String) =
            displayName(JsonField.of(displayName)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("display_name") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun displayName(displayName: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.displayName = displayName
            }

        /**
         * // templates/JavaSDK/entities/objects.ts:252:20 Base class for settings, allowing values
         * to be overridden by environment variables.
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
        @JsonProperty("config") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun config(config: JsonField<Config>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.config = config
            }

        fun tenantHandle(tenantHandle: String) =
            tenantHandle(JsonField.of(tenantHandle)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("tenant_handle") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun tenantHandle(tenantHandle: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.tenantHandle = tenantHandle
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.putAll(additionalProperties)
            }

        @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply { // templates/JavaSDK/entities/objects.ts:304:30
                this.additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:316:30
                this.additionalProperties.putAll(additionalProperties)
            }

        fun build(): Tenant =
            Tenant( // templates/JavaSDK/entities/objects.ts:326:30
                id, // templates/JavaSDK/entities/objects.ts:326:30
                organizationId,
                createdAt,
                displayName,
                config,
                tenantHandle,
                additionalProperties.toUnmodifiable(),
            )
    }

    /**
     * // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
     * // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
     * // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
     * // templates/JavaSDK/entities/objects.ts:76:13 Base class for settings, allowing values to be
     * overridden by environment variables.
     *
     * This is useful in production for secrets you do not wish to save in code, it plays nicely
     * with docker(-compose), Heroku and any 12 factor app design.
     */
    @JsonDeserialize(builder = Config.Builder::class)
    @NoAutoDetect
    class Config
    private constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val isPersonal:
            JsonField<Boolean>, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val maxIdentities: JsonField<Long>,
        private val maxHourlyTracingRequests: JsonField<Long>,
        private val maxHourlyTracingBytes: JsonField<Long>,
        private val maxMonthlyTotalUniqueTraces: JsonField<Long>,
        private val flags: JsonField<Flags>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

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

        @JsonProperty("is_personal") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _isPersonal() = isPersonal

        @JsonProperty("max_identities") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _maxIdentities() = maxIdentities

        @JsonProperty("max_hourly_tracing_requests") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _maxHourlyTracingRequests() = maxHourlyTracingRequests

        @JsonProperty("max_hourly_tracing_bytes") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _maxHourlyTracingBytes() = maxHourlyTracingBytes

        @JsonProperty(
            "max_monthly_total_unique_traces"
        ) // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _maxMonthlyTotalUniqueTraces() = maxMonthlyTotalUniqueTraces

        @JsonProperty("flags") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _flags() = flags

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Config = apply { // templates/JavaSDK/entities/objects.ts:198:28
            if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:198:28 //
                // templates/JavaSDK/entities/objects.ts:198:28
                isPersonal() // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:201:20
                maxIdentities()
                maxHourlyTracingRequests()
                maxHourlyTracingBytes()
                maxMonthlyTotalUniqueTraces()
                flags().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is Config && // templates/JavaSDK/entities/fields.ts:143:33
                this.isPersonal == other.isPersonal &&
                this.maxIdentities == other.maxIdentities &&
                this.maxHourlyTracingRequests == other.maxHourlyTracingRequests &&
                this.maxHourlyTracingBytes == other.maxHourlyTracingBytes &&
                this.maxMonthlyTotalUniqueTraces == other.maxMonthlyTotalUniqueTraces &&
                this.flags == other.flags &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
                // templates/JavaSDK/entities/fields.ts:174:16 //
                // templates/JavaSDK/entities/fields.ts:174:16
                hashCode =
                    Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                        // templates/JavaSDK/entities/fields.ts:175:16 //
                        // templates/JavaSDK/entities/fields.ts:175:16
                        isPersonal, // templates/JavaSDK/entities/fields.ts:163:19
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

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var isPersonal: JsonField<Boolean> =
                JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var maxIdentities: JsonField<Long> = JsonMissing.of()
            private var maxHourlyTracingRequests: JsonField<Long> = JsonMissing.of()
            private var maxHourlyTracingBytes: JsonField<Long> = JsonMissing.of()
            private var maxMonthlyTotalUniqueTraces: JsonField<Long> = JsonMissing.of()
            private var flags: JsonField<Flags> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(config: Config) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.isPersonal =
                        config.isPersonal // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.maxIdentities = config.maxIdentities
                    this.maxHourlyTracingRequests = config.maxHourlyTracingRequests
                    this.maxHourlyTracingBytes = config.maxHourlyTracingBytes
                    this.maxMonthlyTotalUniqueTraces = config.maxMonthlyTotalUniqueTraces
                    this.flags = config.flags
                    additionalProperties(config.additionalProperties)
                }

            fun isPersonal(isPersonal: Boolean) =
                isPersonal(JsonField.of(isPersonal)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("is_personal") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun isPersonal(isPersonal: JsonField<Boolean>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.isPersonal = isPersonal
                }

            fun maxIdentities(maxIdentities: Long) =
                maxIdentities(
                    JsonField.of(maxIdentities)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("max_identities") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun maxIdentities(maxIdentities: JsonField<Long>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.maxIdentities = maxIdentities
                }

            fun maxHourlyTracingRequests(maxHourlyTracingRequests: Long) =
                maxHourlyTracingRequests(
                    JsonField.of(maxHourlyTracingRequests)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty(
                "max_hourly_tracing_requests"
            ) // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun maxHourlyTracingRequests(maxHourlyTracingRequests: JsonField<Long>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.maxHourlyTracingRequests = maxHourlyTracingRequests
                }

            fun maxHourlyTracingBytes(maxHourlyTracingBytes: Long) =
                maxHourlyTracingBytes(
                    JsonField.of(maxHourlyTracingBytes)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty(
                "max_hourly_tracing_bytes"
            ) // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun maxHourlyTracingBytes(maxHourlyTracingBytes: JsonField<Long>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.maxHourlyTracingBytes = maxHourlyTracingBytes
                }

            fun maxMonthlyTotalUniqueTraces(maxMonthlyTotalUniqueTraces: Long) =
                maxMonthlyTotalUniqueTraces(
                    JsonField.of(maxMonthlyTotalUniqueTraces)
                ) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty(
                "max_monthly_total_unique_traces"
            ) // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun maxMonthlyTotalUniqueTraces(maxMonthlyTotalUniqueTraces: JsonField<Long>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.maxMonthlyTotalUniqueTraces = maxMonthlyTotalUniqueTraces
                }

            fun flags(flags: Flags) =
                flags(JsonField.of(flags)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("flags") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun flags(flags: JsonField<Flags>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.flags = flags
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties
                        .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                    // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply { // templates/JavaSDK/entities/objects.ts:304:30
                    this.additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:316:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): Config =
                Config( // templates/JavaSDK/entities/objects.ts:326:30
                    isPersonal, // templates/JavaSDK/entities/objects.ts:326:30
                    maxIdentities,
                    maxHourlyTracingRequests,
                    maxHourlyTracingBytes,
                    maxMonthlyTotalUniqueTraces,
                    flags,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(
            builder = Flags.Builder::class
        ) // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        @NoAutoDetect
        class Flags
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
            // templates/JavaSDK/entities/objects.ts:76:13

            private var hashCode: Int = 0

            @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
            // templates/JavaSDK/entities/objects.ts:180:12
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Flags = apply { // templates/JavaSDK/entities/objects.ts:198:28
                if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                    // templates/JavaSDK/entities/objects.ts:198:28 //
                    // templates/JavaSDK/entities/objects.ts:198:28
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(
                other: Any?
            ): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
                if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                    return true
                }

                return other is Flags && // templates/JavaSDK/entities/fields.ts:143:33
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
                if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
                    // templates/JavaSDK/entities/fields.ts:174:16 //
                    // templates/JavaSDK/entities/fields.ts:174:16
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Flags{additionalProperties=$additionalProperties}"

            companion object { // templates/JavaSDK/entities/objects.ts:217:10

                @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
                // templates/JavaSDK/entities/objects.ts:217:10
                fun builder() = Builder()
            }

            class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
                // templates/JavaSDK/entities/objects.ts:224:10 //
                // templates/JavaSDK/entities/objects.ts:224:10

                private var additionalProperties: MutableMap<String, JsonValue> =
                    mutableMapOf() // templates/JavaSDK/entities/objects.ts:224:10

                @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
                internal fun from(flags: Flags) =
                    apply { // templates/JavaSDK/entities/objects.ts:240:30
                        additionalProperties(flags.additionalProperties)
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply { // templates/JavaSDK/entities/objects.ts:290:30
                        this.additionalProperties
                            .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                        // templates/JavaSDK/entities/objects.ts:290:30
                        this.additionalProperties.putAll(additionalProperties)
                    }

                @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply { // templates/JavaSDK/entities/objects.ts:304:30
                        this.additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply { // templates/JavaSDK/entities/objects.ts:316:30
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Flags = Flags(additionalProperties.toUnmodifiable())
            }
        }
    }
}
