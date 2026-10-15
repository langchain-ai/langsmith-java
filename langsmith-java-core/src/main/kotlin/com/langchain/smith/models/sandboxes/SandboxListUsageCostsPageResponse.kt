// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SandboxListUsageCostsPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<SandboxListUsageCostsResponse>>,
    private val nextCursor: JsonField<String>,
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
        @JsonProperty("totals") @ExcludeMissing totals: JsonField<Totals> = JsonMissing.of(),
    ) : this(items, nextCursor, totals, mutableMapOf())

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
        private var totals: JsonField<Totals> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sandboxListUsageCostsPageResponse: SandboxListUsageCostsPageResponse) =
            apply {
                items = sandboxListUsageCostsPageResponse.items.map { it.toMutableList() }
                nextCursor = sandboxListUsageCostsPageResponse.nextCursor
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
            (totals.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Totals cover the entire filtered interval, independently of the cursor. Omitted unless
     * requested and unrestricted resource access is verified.
     */
    class Totals
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val lcu: JsonField<String>,
        private val lsu: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("lcu") @ExcludeMissing lcu: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lsu") @ExcludeMissing lsu: JsonField<String> = JsonMissing.of(),
        ) : this(lcu, lsu, mutableMapOf())

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
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(totals: Totals) = apply {
                lcu = totals.lcu
                lsu = totals.lsu
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
            (if (lcu.asKnown().isPresent) 1 else 0) + (if (lsu.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Totals &&
                lcu == other.lcu &&
                lsu == other.lsu &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(lcu, lsu, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Totals{lcu=$lcu, lsu=$lsu, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SandboxListUsageCostsPageResponse &&
            items == other.items &&
            nextCursor == other.nextCursor &&
            totals == other.totals &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(items, nextCursor, totals, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SandboxListUsageCostsPageResponse{items=$items, nextCursor=$nextCursor, totals=$totals, additionalProperties=$additionalProperties}"
}
