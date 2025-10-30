// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.billing

import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get Org Usage */
class BillingRetrieveUsageParams
private constructor(
    private val endingBefore: OffsetDateTime,
    private val startingOn: OffsetDateTime,
    private val onCurrentPlan: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun endingBefore(): OffsetDateTime = endingBefore

    fun startingOn(): OffsetDateTime = startingOn

    fun onCurrentPlan(): Optional<Boolean> = Optional.ofNullable(onCurrentPlan)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillingRetrieveUsageParams].
         *
         * The following fields are required:
         * ```java
         * .endingBefore()
         * .startingOn()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillingRetrieveUsageParams]. */
    class Builder internal constructor() {

        private var endingBefore: OffsetDateTime? = null
        private var startingOn: OffsetDateTime? = null
        private var onCurrentPlan: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(billingRetrieveUsageParams: BillingRetrieveUsageParams) = apply {
            endingBefore = billingRetrieveUsageParams.endingBefore
            startingOn = billingRetrieveUsageParams.startingOn
            onCurrentPlan = billingRetrieveUsageParams.onCurrentPlan
            additionalHeaders = billingRetrieveUsageParams.additionalHeaders.toBuilder()
            additionalQueryParams = billingRetrieveUsageParams.additionalQueryParams.toBuilder()
        }

        fun endingBefore(endingBefore: OffsetDateTime) = apply { this.endingBefore = endingBefore }

        fun startingOn(startingOn: OffsetDateTime) = apply { this.startingOn = startingOn }

        fun onCurrentPlan(onCurrentPlan: Boolean?) = apply { this.onCurrentPlan = onCurrentPlan }

        /**
         * Alias for [Builder.onCurrentPlan].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun onCurrentPlan(onCurrentPlan: Boolean) = onCurrentPlan(onCurrentPlan as Boolean?)

        /** Alias for calling [Builder.onCurrentPlan] with `onCurrentPlan.orElse(null)`. */
        fun onCurrentPlan(onCurrentPlan: Optional<Boolean>) =
            onCurrentPlan(onCurrentPlan.getOrNull())

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
         * Returns an immutable instance of [BillingRetrieveUsageParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endingBefore()
         * .startingOn()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BillingRetrieveUsageParams =
            BillingRetrieveUsageParams(
                checkRequired("endingBefore", endingBefore),
                checkRequired("startingOn", startingOn),
                onCurrentPlan,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("ending_before", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(endingBefore))
                put("starting_on", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(startingOn))
                onCurrentPlan?.let { put("on_current_plan", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillingRetrieveUsageParams &&
            endingBefore == other.endingBefore &&
            startingOn == other.startingOn &&
            onCurrentPlan == other.onCurrentPlan &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            endingBefore,
            startingOn,
            onCurrentPlan,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BillingRetrieveUsageParams{endingBefore=$endingBefore, startingOn=$startingOn, onCurrentPlan=$onCurrentPlan, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
