// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class GetOnlineEvaluatorSpendResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val groups: JsonField<List<OnlineEvaluatorSpendGroup>>,
    private val periodEnd: JsonField<String>,
    private val periodStart: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("groups")
        @ExcludeMissing
        groups: JsonField<List<OnlineEvaluatorSpendGroup>> = JsonMissing.of(),
        @JsonProperty("period_end") @ExcludeMissing periodEnd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("period_start")
        @ExcludeMissing
        periodStart: JsonField<String> = JsonMissing.of(),
    ) : this(groups, periodEnd, periodStart, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groups(): Optional<List<OnlineEvaluatorSpendGroup>> = groups.getOptional("groups")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun periodEnd(): Optional<String> = periodEnd.getOptional("period_end")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun periodStart(): Optional<String> = periodStart.getOptional("period_start")

    /**
     * Returns the raw JSON value of [groups].
     *
     * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groups")
    @ExcludeMissing
    fun _groups(): JsonField<List<OnlineEvaluatorSpendGroup>> = groups

    /**
     * Returns the raw JSON value of [periodEnd].
     *
     * Unlike [periodEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_end") @ExcludeMissing fun _periodEnd(): JsonField<String> = periodEnd

    /**
     * Returns the raw JSON value of [periodStart].
     *
     * Unlike [periodStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_start")
    @ExcludeMissing
    fun _periodStart(): JsonField<String> = periodStart

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
         * [GetOnlineEvaluatorSpendResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GetOnlineEvaluatorSpendResponse]. */
    class Builder internal constructor() {

        private var groups: JsonField<MutableList<OnlineEvaluatorSpendGroup>>? = null
        private var periodEnd: JsonField<String> = JsonMissing.of()
        private var periodStart: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(getOnlineEvaluatorSpendResponse: GetOnlineEvaluatorSpendResponse) =
            apply {
                groups = getOnlineEvaluatorSpendResponse.groups.map { it.toMutableList() }
                periodEnd = getOnlineEvaluatorSpendResponse.periodEnd
                periodStart = getOnlineEvaluatorSpendResponse.periodStart
                additionalProperties =
                    getOnlineEvaluatorSpendResponse.additionalProperties.toMutableMap()
            }

        fun groups(groups: List<OnlineEvaluatorSpendGroup>) = groups(JsonField.of(groups))

        /**
         * Sets [Builder.groups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groups] with a well-typed
         * `List<OnlineEvaluatorSpendGroup>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun groups(groups: JsonField<List<OnlineEvaluatorSpendGroup>>) = apply {
            this.groups = groups.map { it.toMutableList() }
        }

        /**
         * Adds a single [OnlineEvaluatorSpendGroup] to [groups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroup(group: OnlineEvaluatorSpendGroup) = apply {
            groups =
                (groups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("groups", it).add(group)
                }
        }

        fun periodEnd(periodEnd: String) = periodEnd(JsonField.of(periodEnd))

        /**
         * Sets [Builder.periodEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodEnd] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun periodEnd(periodEnd: JsonField<String>) = apply { this.periodEnd = periodEnd }

        fun periodStart(periodStart: String) = periodStart(JsonField.of(periodStart))

        /**
         * Sets [Builder.periodStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodStart] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun periodStart(periodStart: JsonField<String>) = apply { this.periodStart = periodStart }

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
         * Returns an immutable instance of [GetOnlineEvaluatorSpendResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GetOnlineEvaluatorSpendResponse =
            GetOnlineEvaluatorSpendResponse(
                (groups ?: JsonMissing.of()).map { it.toImmutable() },
                periodEnd,
                periodStart,
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
    fun validate(): GetOnlineEvaluatorSpendResponse = apply {
        if (validated) {
            return@apply
        }

        groups().ifPresent { it.forEach { it.validate() } }
        periodEnd()
        periodStart()
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
        (groups.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (periodEnd.asKnown().isPresent) 1 else 0) +
            (if (periodStart.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GetOnlineEvaluatorSpendResponse &&
            groups == other.groups &&
            periodEnd == other.periodEnd &&
            periodStart == other.periodStart &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(groups, periodEnd, periodStart, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GetOnlineEvaluatorSpendResponse{groups=$groups, periodEnd=$periodEnd, periodStart=$periodStart, additionalProperties=$additionalProperties}"
}
