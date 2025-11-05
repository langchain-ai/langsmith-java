// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.info

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects

/** The LangSmith server info. */
class InfoRetrieveHealthResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clickhouseDiskFreePct: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clickhouse_disk_free_pct")
        @ExcludeMissing
        clickhouseDiskFreePct: JsonField<Double> = JsonMissing.of()
    ) : this(clickhouseDiskFreePct, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clickhouseDiskFreePct(): Double =
        clickhouseDiskFreePct.getRequired("clickhouse_disk_free_pct")

    /**
     * Returns the raw JSON value of [clickhouseDiskFreePct].
     *
     * Unlike [clickhouseDiskFreePct], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("clickhouse_disk_free_pct")
    @ExcludeMissing
    fun _clickhouseDiskFreePct(): JsonField<Double> = clickhouseDiskFreePct

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
         * Returns a mutable builder for constructing an instance of [InfoRetrieveHealthResponse].
         *
         * The following fields are required:
         * ```java
         * .clickhouseDiskFreePct()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InfoRetrieveHealthResponse]. */
    class Builder internal constructor() {

        private var clickhouseDiskFreePct: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(infoRetrieveHealthResponse: InfoRetrieveHealthResponse) = apply {
            clickhouseDiskFreePct = infoRetrieveHealthResponse.clickhouseDiskFreePct
            additionalProperties = infoRetrieveHealthResponse.additionalProperties.toMutableMap()
        }

        fun clickhouseDiskFreePct(clickhouseDiskFreePct: Double) =
            clickhouseDiskFreePct(JsonField.of(clickhouseDiskFreePct))

        /**
         * Sets [Builder.clickhouseDiskFreePct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clickhouseDiskFreePct] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clickhouseDiskFreePct(clickhouseDiskFreePct: JsonField<Double>) = apply {
            this.clickhouseDiskFreePct = clickhouseDiskFreePct
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
         * Returns an immutable instance of [InfoRetrieveHealthResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clickhouseDiskFreePct()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InfoRetrieveHealthResponse =
            InfoRetrieveHealthResponse(
                checkRequired("clickhouseDiskFreePct", clickhouseDiskFreePct),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InfoRetrieveHealthResponse = apply {
        if (validated) {
            return@apply
        }

        clickhouseDiskFreePct()
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
    internal fun validity(): Int = (if (clickhouseDiskFreePct.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InfoRetrieveHealthResponse &&
            clickhouseDiskFreePct == other.clickhouseDiskFreePct &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(clickhouseDiskFreePct, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InfoRetrieveHealthResponse{clickhouseDiskFreePct=$clickhouseDiskFreePct, additionalProperties=$additionalProperties}"
}
