// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SandboxListUsageCostsPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<SandboxListUsageCostsResponse>>,
    private val nextCursor: JsonField<String>,
    private val daily: JsonField<Daily>,
    private val totals: JsonField<Totals>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items")
        @ExcludeMissing
        items: JsonField<List<SandboxListUsageCostsResponse>> = JsonMissing.of(),
        @JsonProperty("next_cursor")
        @ExcludeMissing
        nextCursor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("daily") @ExcludeMissing daily: JsonField<Daily> = JsonMissing.of(),
        @JsonProperty("totals") @ExcludeMissing totals: JsonField<Totals> = JsonMissing.of(),
    ) : this(items, nextCursor, daily, totals, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<SandboxListUsageCostsResponse> = items.getRequired("items")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextCursor(): Optional<String> = nextCursor.getOptional("next_cursor")

    /**
     * Daily usage over the full filtered interval, independent of pagination. Omitted unless
     * requested, supported, and unrestricted resource access is verified.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun daily(): Optional<Daily> = daily.getOptional("daily")

    /**
     * Totals cover the entire filtered interval, independently of the cursor. Omitted unless
     * requested and unrestricted resource access is verified.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totals(): Optional<Totals> = totals.getOptional("totals")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items")
    @ExcludeMissing
    fun _items(): JsonField<List<SandboxListUsageCostsResponse>> = items

    /**
     * Returns the raw JSON value of [nextCursor].
     *
     * Unlike [nextCursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_cursor") @ExcludeMissing fun _nextCursor(): JsonField<String> = nextCursor

    /**
     * Returns the raw JSON value of [daily].
     *
     * Unlike [daily], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("daily") @ExcludeMissing fun _daily(): JsonField<Daily> = daily

    /**
     * Returns the raw JSON value of [totals].
     *
     * Unlike [totals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totals") @ExcludeMissing fun _totals(): JsonField<Totals> = totals

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [SandboxListUsageCostsPageResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * .nextCursor()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SandboxListUsageCostsPageResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<SandboxListUsageCostsResponse>>? = null
        private var nextCursor: JsonField<String>? = null
        private var daily: JsonField<Daily> = JsonMissing.of()
        private var totals: JsonField<Totals> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sandboxListUsageCostsPageResponse: SandboxListUsageCostsPageResponse) =
            apply {
                items = sandboxListUsageCostsPageResponse.items.map { it.toMutableList() }
                nextCursor = sandboxListUsageCostsPageResponse.nextCursor
                daily = sandboxListUsageCostsPageResponse.daily
                totals = sandboxListUsageCostsPageResponse.totals
                additionalProperties =
                    sandboxListUsageCostsPageResponse.additionalProperties.toMutableMap()
            }

        fun items(items: List<SandboxListUsageCostsResponse>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed
         * `List<SandboxListUsageCostsResponse>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun items(items: JsonField<List<SandboxListUsageCostsResponse>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [SandboxListUsageCostsResponse] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: SandboxListUsageCostsResponse) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        fun nextCursor(nextCursor: String?) = nextCursor(JsonField.ofNullable(nextCursor))

        /** Alias for calling [Builder.nextCursor] with `nextCursor.orElse(null)`. */
        fun nextCursor(nextCursor: Optional<String>) = nextCursor(nextCursor.getOrNull())

        /**
         * Sets [Builder.nextCursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextCursor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

        /**
         * Daily usage over the full filtered interval, independent of pagination. Omitted unless
         * requested, supported, and unrestricted resource access is verified.
         */
        fun daily(daily: Daily) = daily(JsonField.of(daily))

        /**
         * Sets [Builder.daily] to an arbitrary JSON value.
         *
         * You should usually call [Builder.daily] with a well-typed [Daily] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun daily(daily: JsonField<Daily>) = apply { this.daily = daily }

        /**
         * Totals cover the entire filtered interval, independently of the cursor. Omitted unless
         * requested and unrestricted resource access is verified.
         */
        fun totals(totals: Totals) = totals(JsonField.of(totals))

        /**
         * Sets [Builder.totals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totals] with a well-typed [Totals] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totals(totals: JsonField<Totals>) = apply { this.totals = totals }

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
         * Returns an immutable instance of [SandboxListUsageCostsPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .items()
         * .nextCursor()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SandboxListUsageCostsPageResponse =
            SandboxListUsageCostsPageResponse(
                checkRequired("items", items).map { it.toImmutable() },
                checkRequired("nextCursor", nextCursor),
                daily,
                totals,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LangChainInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): SandboxListUsageCostsPageResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        nextCursor()
        daily().ifPresent { it.validate() }
        totals().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextCursor.asKnown().isPresent) 1 else 0) +
            (daily.asKnown().getOrNull()?.validity() ?: 0) +
            (totals.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Daily usage over the full filtered interval, independent of pagination. Omitted unless
     * requested, supported, and unrestricted resource access is verified.
     */
    class Daily
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val entries: JsonField<List<Entry>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("entries")
            @ExcludeMissing
            entries: JsonField<List<Entry>> = JsonMissing.of()
        ) : this(entries, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entries(): List<Entry> = entries.getRequired("entries")

        /**
         * Returns the raw JSON value of [entries].
         *
         * Unlike [entries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entries") @ExcludeMissing fun _entries(): JsonField<List<Entry>> = entries

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

            /**
             * Returns a mutable builder for constructing an instance of [Daily].
             *
             * The following fields are required:
             * ```java
             * .entries()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Daily]. */
        class Builder internal constructor() {

            private var entries: JsonField<MutableList<Entry>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(daily: Daily) = apply {
                entries = daily.entries.map { it.toMutableList() }
                additionalProperties = daily.additionalProperties.toMutableMap()
            }

            fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

            /**
             * Sets [Builder.entries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entries] with a well-typed `List<Entry>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entries(entries: JsonField<List<Entry>>) = apply {
                this.entries = entries.map { it.toMutableList() }
            }

            /**
             * Adds a single [Entry] to [entries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEntry(entry: Entry) = apply {
                entries =
                    (entries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("entries", it).add(entry)
                    }
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
             * Returns an immutable instance of [Daily].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .entries()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Daily =
                Daily(
                    checkRequired("entries", entries).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Daily = apply {
            if (validated) {
                return@apply
            }

            entries().forEach { it.validate() }
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
            (entries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Entry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val isOther: JsonField<Boolean>,
            private val periodStart: JsonField<OffsetDateTime>,
            private val memoryGibHours: JsonField<String>,
            private val resourceId: JsonField<String>,
            private val resourceType: JsonField<ResourceType>,
            private val storageGibHours: JsonField<String>,
            private val vcpuHours: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("is_other")
                @ExcludeMissing
                isOther: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("period_start")
                @ExcludeMissing
                periodStart: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("memory_gib_hours")
                @ExcludeMissing
                memoryGibHours: JsonField<String> = JsonMissing.of(),
                @JsonProperty("resource_id")
                @ExcludeMissing
                resourceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("resource_type")
                @ExcludeMissing
                resourceType: JsonField<ResourceType> = JsonMissing.of(),
                @JsonProperty("storage_gib_hours")
                @ExcludeMissing
                storageGibHours: JsonField<String> = JsonMissing.of(),
                @JsonProperty("vcpu_hours")
                @ExcludeMissing
                vcpuHours: JsonField<String> = JsonMissing.of(),
            ) : this(
                isOther,
                periodStart,
                memoryGibHours,
                resourceId,
                resourceType,
                storageGibHours,
                vcpuHours,
                mutableMapOf(),
            )

            /**
             * Other combines resources outside the top groups. Their individual IDs are omitted.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun isOther(): Boolean = isOther.getRequired("is_other")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun periodStart(): OffsetDateTime = periodStart.getRequired("period_start")

            /**
             * Memory usage in GiB-hours, as a decimal string. Null means complete usage is
             * unavailable.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun memoryGibHours(): Optional<String> = memoryGibHours.getOptional("memory_gib_hours")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun resourceId(): Optional<String> = resourceId.getOptional("resource_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun resourceType(): Optional<ResourceType> = resourceType.getOptional("resource_type")

            /**
             * Recorded storage usage in GiB-hours from hourly samples. Missing intervals are
             * excluded; null means no usable measurements are available.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun storageGibHours(): Optional<String> =
                storageGibHours.getOptional("storage_gib_hours")

            /**
             * CPU usage in vCPU-hours, as a decimal string. Null means complete usage is
             * unavailable.
             *
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun vcpuHours(): Optional<String> = vcpuHours.getOptional("vcpu_hours")

            /**
             * Returns the raw JSON value of [isOther].
             *
             * Unlike [isOther], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("is_other") @ExcludeMissing fun _isOther(): JsonField<Boolean> = isOther

            /**
             * Returns the raw JSON value of [periodStart].
             *
             * Unlike [periodStart], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("period_start")
            @ExcludeMissing
            fun _periodStart(): JsonField<OffsetDateTime> = periodStart

            /**
             * Returns the raw JSON value of [memoryGibHours].
             *
             * Unlike [memoryGibHours], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("memory_gib_hours")
            @ExcludeMissing
            fun _memoryGibHours(): JsonField<String> = memoryGibHours

            /**
             * Returns the raw JSON value of [resourceId].
             *
             * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("resource_id")
            @ExcludeMissing
            fun _resourceId(): JsonField<String> = resourceId

            /**
             * Returns the raw JSON value of [resourceType].
             *
             * Unlike [resourceType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("resource_type")
            @ExcludeMissing
            fun _resourceType(): JsonField<ResourceType> = resourceType

            /**
             * Returns the raw JSON value of [storageGibHours].
             *
             * Unlike [storageGibHours], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("storage_gib_hours")
            @ExcludeMissing
            fun _storageGibHours(): JsonField<String> = storageGibHours

            /**
             * Returns the raw JSON value of [vcpuHours].
             *
             * Unlike [vcpuHours], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("vcpu_hours")
            @ExcludeMissing
            fun _vcpuHours(): JsonField<String> = vcpuHours

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

                /**
                 * Returns a mutable builder for constructing an instance of [Entry].
                 *
                 * The following fields are required:
                 * ```java
                 * .isOther()
                 * .periodStart()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entry]. */
            class Builder internal constructor() {

                private var isOther: JsonField<Boolean>? = null
                private var periodStart: JsonField<OffsetDateTime>? = null
                private var memoryGibHours: JsonField<String> = JsonMissing.of()
                private var resourceId: JsonField<String> = JsonMissing.of()
                private var resourceType: JsonField<ResourceType> = JsonMissing.of()
                private var storageGibHours: JsonField<String> = JsonMissing.of()
                private var vcpuHours: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    isOther = entry.isOther
                    periodStart = entry.periodStart
                    memoryGibHours = entry.memoryGibHours
                    resourceId = entry.resourceId
                    resourceType = entry.resourceType
                    storageGibHours = entry.storageGibHours
                    vcpuHours = entry.vcpuHours
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                /**
                 * Other combines resources outside the top groups. Their individual IDs are
                 * omitted.
                 */
                fun isOther(isOther: Boolean) = isOther(JsonField.of(isOther))

                /**
                 * Sets [Builder.isOther] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isOther] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isOther(isOther: JsonField<Boolean>) = apply { this.isOther = isOther }

                fun periodStart(periodStart: OffsetDateTime) =
                    periodStart(JsonField.of(periodStart))

                /**
                 * Sets [Builder.periodStart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.periodStart] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
                    this.periodStart = periodStart
                }

                /**
                 * Memory usage in GiB-hours, as a decimal string. Null means complete usage is
                 * unavailable.
                 */
                fun memoryGibHours(memoryGibHours: String?) =
                    memoryGibHours(JsonField.ofNullable(memoryGibHours))

                /**
                 * Alias for calling [Builder.memoryGibHours] with `memoryGibHours.orElse(null)`.
                 */
                fun memoryGibHours(memoryGibHours: Optional<String>) =
                    memoryGibHours(memoryGibHours.getOrNull())

                /**
                 * Sets [Builder.memoryGibHours] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memoryGibHours] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun memoryGibHours(memoryGibHours: JsonField<String>) = apply {
                    this.memoryGibHours = memoryGibHours
                }

                fun resourceId(resourceId: String) = resourceId(JsonField.of(resourceId))

                /**
                 * Sets [Builder.resourceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.resourceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun resourceId(resourceId: JsonField<String>) = apply {
                    this.resourceId = resourceId
                }

                fun resourceType(resourceType: ResourceType) =
                    resourceType(JsonField.of(resourceType))

                /**
                 * Sets [Builder.resourceType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.resourceType] with a well-typed [ResourceType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun resourceType(resourceType: JsonField<ResourceType>) = apply {
                    this.resourceType = resourceType
                }

                /**
                 * Recorded storage usage in GiB-hours from hourly samples. Missing intervals are
                 * excluded; null means no usable measurements are available.
                 */
                fun storageGibHours(storageGibHours: String?) =
                    storageGibHours(JsonField.ofNullable(storageGibHours))

                /**
                 * Alias for calling [Builder.storageGibHours] with `storageGibHours.orElse(null)`.
                 */
                fun storageGibHours(storageGibHours: Optional<String>) =
                    storageGibHours(storageGibHours.getOrNull())

                /**
                 * Sets [Builder.storageGibHours] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.storageGibHours] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun storageGibHours(storageGibHours: JsonField<String>) = apply {
                    this.storageGibHours = storageGibHours
                }

                /**
                 * CPU usage in vCPU-hours, as a decimal string. Null means complete usage is
                 * unavailable.
                 */
                fun vcpuHours(vcpuHours: String?) = vcpuHours(JsonField.ofNullable(vcpuHours))

                /** Alias for calling [Builder.vcpuHours] with `vcpuHours.orElse(null)`. */
                fun vcpuHours(vcpuHours: Optional<String>) = vcpuHours(vcpuHours.getOrNull())

                /**
                 * Sets [Builder.vcpuHours] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vcpuHours] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun vcpuHours(vcpuHours: JsonField<String>) = apply { this.vcpuHours = vcpuHours }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Entry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .isOther()
                 * .periodStart()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Entry =
                    Entry(
                        checkRequired("isOther", isOther),
                        checkRequired("periodStart", periodStart),
                        memoryGibHours,
                        resourceId,
                        resourceType,
                        storageGibHours,
                        vcpuHours,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Entry = apply {
                if (validated) {
                    return@apply
                }

                isOther()
                periodStart()
                memoryGibHours()
                resourceId()
                resourceType().ifPresent { it.validate() }
                storageGibHours()
                vcpuHours()
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
                (if (isOther.asKnown().isPresent) 1 else 0) +
                    (if (periodStart.asKnown().isPresent) 1 else 0) +
                    (if (memoryGibHours.asKnown().isPresent) 1 else 0) +
                    (if (resourceId.asKnown().isPresent) 1 else 0) +
                    (resourceType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (storageGibHours.asKnown().isPresent) 1 else 0) +
                    (if (vcpuHours.asKnown().isPresent) 1 else 0)

            class ResourceType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * An enum containing [ResourceType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ResourceType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SANDBOX,
                    SNAPSHOT,
                    /**
                     * An enum member indicating that [ResourceType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
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
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
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

                return other is Entry &&
                    isOther == other.isOther &&
                    periodStart == other.periodStart &&
                    memoryGibHours == other.memoryGibHours &&
                    resourceId == other.resourceId &&
                    resourceType == other.resourceType &&
                    storageGibHours == other.storageGibHours &&
                    vcpuHours == other.vcpuHours &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    isOther,
                    periodStart,
                    memoryGibHours,
                    resourceId,
                    resourceType,
                    storageGibHours,
                    vcpuHours,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{isOther=$isOther, periodStart=$periodStart, memoryGibHours=$memoryGibHours, resourceId=$resourceId, resourceType=$resourceType, storageGibHours=$storageGibHours, vcpuHours=$vcpuHours, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Daily &&
                entries == other.entries &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(entries, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Daily{entries=$entries, additionalProperties=$additionalProperties}"
    }

    /**
     * Totals cover the entire filtered interval, independently of the cursor. Omitted unless
     * requested and unrestricted resource access is verified.
     */
    class Totals
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val lcu: JsonField<String>,
        private val lsu: JsonField<String>,
        private val computeStandardUnits: JsonField<String>,
        private val memoryGibHours: JsonField<String>,
        private val storageGibHours: JsonField<String>,
        private val storageStandardUnits: JsonField<String>,
        private val vcpuHours: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("lcu") @ExcludeMissing lcu: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lsu") @ExcludeMissing lsu: JsonField<String> = JsonMissing.of(),
            @JsonProperty("compute_standard_units")
            @ExcludeMissing
            computeStandardUnits: JsonField<String> = JsonMissing.of(),
            @JsonProperty("memory_gib_hours")
            @ExcludeMissing
            memoryGibHours: JsonField<String> = JsonMissing.of(),
            @JsonProperty("storage_gib_hours")
            @ExcludeMissing
            storageGibHours: JsonField<String> = JsonMissing.of(),
            @JsonProperty("storage_standard_units")
            @ExcludeMissing
            storageStandardUnits: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vcpu_hours")
            @ExcludeMissing
            vcpuHours: JsonField<String> = JsonMissing.of(),
        ) : this(
            lcu,
            lsu,
            computeStandardUnits,
            memoryGibHours,
            storageGibHours,
            storageStandardUnits,
            vcpuHours,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lcu(): String = lcu.getRequired("lcu")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lsu(): String = lsu.getRequired("lsu")

        /**
         * Total compute usage in Standard Units across the entire filtered interval, independent of
         * pagination, as a decimal string, separate from LCU. Null means complete Standard compute
         * usage is unavailable; "0" means known zero usage.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun computeStandardUnits(): Optional<String> =
            computeStandardUnits.getOptional("compute_standard_units")

        /**
         * Memory usage in GiB-hours, as a decimal string. Null means complete usage is unavailable.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun memoryGibHours(): Optional<String> = memoryGibHours.getOptional("memory_gib_hours")

        /**
         * Recorded storage usage in GiB-hours from hourly samples, including checkpoints. Missing
         * intervals are excluded; null means no usable measurements are available.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun storageGibHours(): Optional<String> = storageGibHours.getOptional("storage_gib_hours")

        /**
         * Total storage usage in Standard Units across the entire filtered interval, independent of
         * pagination, as a decimal string, separate from LSU. Null means complete Standard storage
         * usage is unavailable; "0" means known zero usage.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun storageStandardUnits(): Optional<String> =
            storageStandardUnits.getOptional("storage_standard_units")

        /**
         * CPU usage in vCPU-hours, as a decimal string. Null means complete usage is unavailable.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun vcpuHours(): Optional<String> = vcpuHours.getOptional("vcpu_hours")

        /**
         * Returns the raw JSON value of [lcu].
         *
         * Unlike [lcu], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lcu") @ExcludeMissing fun _lcu(): JsonField<String> = lcu

        /**
         * Returns the raw JSON value of [lsu].
         *
         * Unlike [lsu], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lsu") @ExcludeMissing fun _lsu(): JsonField<String> = lsu

        /**
         * Returns the raw JSON value of [computeStandardUnits].
         *
         * Unlike [computeStandardUnits], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("compute_standard_units")
        @ExcludeMissing
        fun _computeStandardUnits(): JsonField<String> = computeStandardUnits

        /**
         * Returns the raw JSON value of [memoryGibHours].
         *
         * Unlike [memoryGibHours], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("memory_gib_hours")
        @ExcludeMissing
        fun _memoryGibHours(): JsonField<String> = memoryGibHours

        /**
         * Returns the raw JSON value of [storageGibHours].
         *
         * Unlike [storageGibHours], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("storage_gib_hours")
        @ExcludeMissing
        fun _storageGibHours(): JsonField<String> = storageGibHours

        /**
         * Returns the raw JSON value of [storageStandardUnits].
         *
         * Unlike [storageStandardUnits], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("storage_standard_units")
        @ExcludeMissing
        fun _storageStandardUnits(): JsonField<String> = storageStandardUnits

        /**
         * Returns the raw JSON value of [vcpuHours].
         *
         * Unlike [vcpuHours], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vcpu_hours") @ExcludeMissing fun _vcpuHours(): JsonField<String> = vcpuHours

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

            /**
             * Returns a mutable builder for constructing an instance of [Totals].
             *
             * The following fields are required:
             * ```java
             * .lcu()
             * .lsu()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Totals]. */
        class Builder internal constructor() {

            private var lcu: JsonField<String>? = null
            private var lsu: JsonField<String>? = null
            private var computeStandardUnits: JsonField<String> = JsonMissing.of()
            private var memoryGibHours: JsonField<String> = JsonMissing.of()
            private var storageGibHours: JsonField<String> = JsonMissing.of()
            private var storageStandardUnits: JsonField<String> = JsonMissing.of()
            private var vcpuHours: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(totals: Totals) = apply {
                lcu = totals.lcu
                lsu = totals.lsu
                computeStandardUnits = totals.computeStandardUnits
                memoryGibHours = totals.memoryGibHours
                storageGibHours = totals.storageGibHours
                storageStandardUnits = totals.storageStandardUnits
                vcpuHours = totals.vcpuHours
                additionalProperties = totals.additionalProperties.toMutableMap()
            }

            fun lcu(lcu: String) = lcu(JsonField.of(lcu))

            /**
             * Sets [Builder.lcu] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lcu] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lcu(lcu: JsonField<String>) = apply { this.lcu = lcu }

            fun lsu(lsu: String) = lsu(JsonField.of(lsu))

            /**
             * Sets [Builder.lsu] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lsu] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lsu(lsu: JsonField<String>) = apply { this.lsu = lsu }

            /**
             * Total compute usage in Standard Units across the entire filtered interval,
             * independent of pagination, as a decimal string, separate from LCU. Null means
             * complete Standard compute usage is unavailable; "0" means known zero usage.
             */
            fun computeStandardUnits(computeStandardUnits: String?) =
                computeStandardUnits(JsonField.ofNullable(computeStandardUnits))

            /**
             * Alias for calling [Builder.computeStandardUnits] with
             * `computeStandardUnits.orElse(null)`.
             */
            fun computeStandardUnits(computeStandardUnits: Optional<String>) =
                computeStandardUnits(computeStandardUnits.getOrNull())

            /**
             * Sets [Builder.computeStandardUnits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.computeStandardUnits] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun computeStandardUnits(computeStandardUnits: JsonField<String>) = apply {
                this.computeStandardUnits = computeStandardUnits
            }

            /**
             * Memory usage in GiB-hours, as a decimal string. Null means complete usage is
             * unavailable.
             */
            fun memoryGibHours(memoryGibHours: String?) =
                memoryGibHours(JsonField.ofNullable(memoryGibHours))

            /** Alias for calling [Builder.memoryGibHours] with `memoryGibHours.orElse(null)`. */
            fun memoryGibHours(memoryGibHours: Optional<String>) =
                memoryGibHours(memoryGibHours.getOrNull())

            /**
             * Sets [Builder.memoryGibHours] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memoryGibHours] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memoryGibHours(memoryGibHours: JsonField<String>) = apply {
                this.memoryGibHours = memoryGibHours
            }

            /**
             * Recorded storage usage in GiB-hours from hourly samples, including checkpoints.
             * Missing intervals are excluded; null means no usable measurements are available.
             */
            fun storageGibHours(storageGibHours: String?) =
                storageGibHours(JsonField.ofNullable(storageGibHours))

            /** Alias for calling [Builder.storageGibHours] with `storageGibHours.orElse(null)`. */
            fun storageGibHours(storageGibHours: Optional<String>) =
                storageGibHours(storageGibHours.getOrNull())

            /**
             * Sets [Builder.storageGibHours] to an arbitrary JSON value.
             *
             * You should usually call [Builder.storageGibHours] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun storageGibHours(storageGibHours: JsonField<String>) = apply {
                this.storageGibHours = storageGibHours
            }

            /**
             * Total storage usage in Standard Units across the entire filtered interval,
             * independent of pagination, as a decimal string, separate from LSU. Null means
             * complete Standard storage usage is unavailable; "0" means known zero usage.
             */
            fun storageStandardUnits(storageStandardUnits: String?) =
                storageStandardUnits(JsonField.ofNullable(storageStandardUnits))

            /**
             * Alias for calling [Builder.storageStandardUnits] with
             * `storageStandardUnits.orElse(null)`.
             */
            fun storageStandardUnits(storageStandardUnits: Optional<String>) =
                storageStandardUnits(storageStandardUnits.getOrNull())

            /**
             * Sets [Builder.storageStandardUnits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.storageStandardUnits] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun storageStandardUnits(storageStandardUnits: JsonField<String>) = apply {
                this.storageStandardUnits = storageStandardUnits
            }

            /**
             * CPU usage in vCPU-hours, as a decimal string. Null means complete usage is
             * unavailable.
             */
            fun vcpuHours(vcpuHours: String?) = vcpuHours(JsonField.ofNullable(vcpuHours))

            /** Alias for calling [Builder.vcpuHours] with `vcpuHours.orElse(null)`. */
            fun vcpuHours(vcpuHours: Optional<String>) = vcpuHours(vcpuHours.getOrNull())

            /**
             * Sets [Builder.vcpuHours] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vcpuHours] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vcpuHours(vcpuHours: JsonField<String>) = apply { this.vcpuHours = vcpuHours }

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
             * Returns an immutable instance of [Totals].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .lcu()
             * .lsu()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Totals =
                Totals(
                    checkRequired("lcu", lcu),
                    checkRequired("lsu", lsu),
                    computeStandardUnits,
                    memoryGibHours,
                    storageGibHours,
                    storageStandardUnits,
                    vcpuHours,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Totals = apply {
            if (validated) {
                return@apply
            }

            lcu()
            lsu()
            computeStandardUnits()
            memoryGibHours()
            storageGibHours()
            storageStandardUnits()
            vcpuHours()
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
            (if (lcu.asKnown().isPresent) 1 else 0) +
                (if (lsu.asKnown().isPresent) 1 else 0) +
                (if (computeStandardUnits.asKnown().isPresent) 1 else 0) +
                (if (memoryGibHours.asKnown().isPresent) 1 else 0) +
                (if (storageGibHours.asKnown().isPresent) 1 else 0) +
                (if (storageStandardUnits.asKnown().isPresent) 1 else 0) +
                (if (vcpuHours.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Totals &&
                lcu == other.lcu &&
                lsu == other.lsu &&
                computeStandardUnits == other.computeStandardUnits &&
                memoryGibHours == other.memoryGibHours &&
                storageGibHours == other.storageGibHours &&
                storageStandardUnits == other.storageStandardUnits &&
                vcpuHours == other.vcpuHours &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                lcu,
                lsu,
                computeStandardUnits,
                memoryGibHours,
                storageGibHours,
                storageStandardUnits,
                vcpuHours,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Totals{lcu=$lcu, lsu=$lsu, computeStandardUnits=$computeStandardUnits, memoryGibHours=$memoryGibHours, storageGibHours=$storageGibHours, storageStandardUnits=$storageStandardUnits, vcpuHours=$vcpuHours, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SandboxListUsageCostsPageResponse &&
            items == other.items &&
            nextCursor == other.nextCursor &&
            daily == other.daily &&
            totals == other.totals &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(items, nextCursor, daily, totals, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SandboxListUsageCostsPageResponse{items=$items, nextCursor=$nextCursor, daily=$daily, totals=$totals, additionalProperties=$additionalProperties}"
}
