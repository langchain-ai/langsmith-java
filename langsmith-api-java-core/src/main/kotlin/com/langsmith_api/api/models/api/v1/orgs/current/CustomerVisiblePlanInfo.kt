// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import com.langsmith_api.api.models.api.v1.orgs.PaymentPlanTier
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Customer visible plan information. */
class CustomerVisiblePlanInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val startedOn: JsonField<OffsetDateTime>,
    private val tier: JsonField<PaymentPlanTier>,
    private val endsOn: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("started_on")
        @ExcludeMissing
        startedOn: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("tier") @ExcludeMissing tier: JsonField<PaymentPlanTier> = JsonMissing.of(),
        @JsonProperty("ends_on")
        @ExcludeMissing
        endsOn: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(startedOn, tier, endsOn, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startedOn(): OffsetDateTime = startedOn.getRequired("started_on")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tier(): PaymentPlanTier = tier.getRequired("tier")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun endsOn(): Optional<OffsetDateTime> = endsOn.getOptional("ends_on")

    /**
     * Returns the raw JSON value of [startedOn].
     *
     * Unlike [startedOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("started_on")
    @ExcludeMissing
    fun _startedOn(): JsonField<OffsetDateTime> = startedOn

    /**
     * Returns the raw JSON value of [tier].
     *
     * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<PaymentPlanTier> = tier

    /**
     * Returns the raw JSON value of [endsOn].
     *
     * Unlike [endsOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ends_on") @ExcludeMissing fun _endsOn(): JsonField<OffsetDateTime> = endsOn

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
         * Returns a mutable builder for constructing an instance of [CustomerVisiblePlanInfo].
         *
         * The following fields are required:
         * ```java
         * .startedOn()
         * .tier()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerVisiblePlanInfo]. */
    class Builder internal constructor() {

        private var startedOn: JsonField<OffsetDateTime>? = null
        private var tier: JsonField<PaymentPlanTier>? = null
        private var endsOn: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerVisiblePlanInfo: CustomerVisiblePlanInfo) = apply {
            startedOn = customerVisiblePlanInfo.startedOn
            tier = customerVisiblePlanInfo.tier
            endsOn = customerVisiblePlanInfo.endsOn
            additionalProperties = customerVisiblePlanInfo.additionalProperties.toMutableMap()
        }

        fun startedOn(startedOn: OffsetDateTime) = startedOn(JsonField.of(startedOn))

        /**
         * Sets [Builder.startedOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedOn] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedOn(startedOn: JsonField<OffsetDateTime>) = apply { this.startedOn = startedOn }

        fun tier(tier: PaymentPlanTier) = tier(JsonField.of(tier))

        /**
         * Sets [Builder.tier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tier] with a well-typed [PaymentPlanTier] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tier(tier: JsonField<PaymentPlanTier>) = apply { this.tier = tier }

        fun endsOn(endsOn: OffsetDateTime?) = endsOn(JsonField.ofNullable(endsOn))

        /** Alias for calling [Builder.endsOn] with `endsOn.orElse(null)`. */
        fun endsOn(endsOn: Optional<OffsetDateTime>) = endsOn(endsOn.getOrNull())

        /**
         * Sets [Builder.endsOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endsOn] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endsOn(endsOn: JsonField<OffsetDateTime>) = apply { this.endsOn = endsOn }

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
         * Returns an immutable instance of [CustomerVisiblePlanInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .startedOn()
         * .tier()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerVisiblePlanInfo =
            CustomerVisiblePlanInfo(
                checkRequired("startedOn", startedOn),
                checkRequired("tier", tier),
                endsOn,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomerVisiblePlanInfo = apply {
        if (validated) {
            return@apply
        }

        startedOn()
        tier().validate()
        endsOn()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithApiInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (startedOn.asKnown().isPresent) 1 else 0) +
            (tier.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endsOn.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerVisiblePlanInfo &&
            startedOn == other.startedOn &&
            tier == other.tier &&
            endsOn == other.endsOn &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(startedOn, tier, endsOn, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerVisiblePlanInfo{startedOn=$startedOn, tier=$tier, endsOn=$endsOn, additionalProperties=$additionalProperties}"
}
