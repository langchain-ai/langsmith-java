// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.evaluators

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.EvaluatorService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EvaluatorService.listV2 */
class EvaluatorListV2Page
private constructor(
    private val service: EvaluatorService,
    private val params: EvaluatorListV2Params,
    private val requestOptions: RequestOptions,
    private val response: EvaluatorListV2PageResponse,
) : Page<Rule> {

    /**
     * Delegates to [EvaluatorListV2PageResponse], but gracefully handles missing data.
     *
     * @see EvaluatorListV2PageResponse.items
     */
    override fun items(): List<Rule> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [EvaluatorListV2PageResponse], but gracefully handles missing data.
     *
     * @see EvaluatorListV2PageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): EvaluatorListV2Params {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): EvaluatorListV2Page = service.listV2(nextPageParams(), requestOptions)

    fun autoPager(): AutoPager<Rule> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EvaluatorListV2Params = params

    /** The response that this page was parsed from. */
    fun response(): EvaluatorListV2PageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EvaluatorListV2Page].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EvaluatorListV2Page]. */
    class Builder internal constructor() {

        private var service: EvaluatorService? = null
        private var params: EvaluatorListV2Params? = null
        private var requestOptions: RequestOptions = RequestOptions.none()
        private var response: EvaluatorListV2PageResponse? = null

        @JvmSynthetic
        internal fun from(evaluatorListV2Page: EvaluatorListV2Page) = apply {
            service = evaluatorListV2Page.service
            params = evaluatorListV2Page.params
            requestOptions = evaluatorListV2Page.requestOptions
            response = evaluatorListV2Page.response
        }

        fun service(service: EvaluatorService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EvaluatorListV2Params) = apply { this.params = params }

        fun requestOptions(requestOptions: RequestOptions) = apply {
            this.requestOptions = requestOptions
        }

        /** The response that this page was parsed from. */
        fun response(response: EvaluatorListV2PageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EvaluatorListV2Page].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EvaluatorListV2Page =
            EvaluatorListV2Page(
                checkRequired("service", service),
                checkRequired("params", params),
                requestOptions,
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EvaluatorListV2Page &&
            service == other.service &&
            params == other.params &&
            requestOptions == other.requestOptions &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, requestOptions, response)

    override fun toString() =
        "EvaluatorListV2Page{service=$service, params=$params, requestOptions=$requestOptions, response=$response}"
}
