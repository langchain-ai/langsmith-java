// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.OnlineEvaluatorService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see OnlineEvaluatorService.list */
class OnlineEvaluatorListPage
private constructor(
    private val service: OnlineEvaluatorService,
    private val params: OnlineEvaluatorListParams,
    private val response: OnlineEvaluatorListPageResponse,
) : Page<OnlineEvaluator> {

    /**
     * Delegates to [OnlineEvaluatorListPageResponse], but gracefully handles missing data.
     *
     * @see OnlineEvaluatorListPageResponse.evaluators
     */
    fun evaluators(): List<OnlineEvaluator> =
        response._evaluators().getOptional("evaluators").getOrNull() ?: emptyList()

    /**
     * Delegates to [OnlineEvaluatorListPageResponse], but gracefully handles missing data.
     *
     * @see OnlineEvaluatorListPageResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    override fun items(): List<OnlineEvaluator> = evaluators()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnlineEvaluatorListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): OnlineEvaluatorListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OnlineEvaluator> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OnlineEvaluatorListParams = params

    /** The response that this page was parsed from. */
    fun response(): OnlineEvaluatorListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnlineEvaluatorListPage].
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

    /** A builder for [OnlineEvaluatorListPage]. */
    class Builder internal constructor() {

        private var service: OnlineEvaluatorService? = null
        private var params: OnlineEvaluatorListParams? = null
        private var response: OnlineEvaluatorListPageResponse? = null

        @JvmSynthetic
        internal fun from(onlineEvaluatorListPage: OnlineEvaluatorListPage) = apply {
            service = onlineEvaluatorListPage.service
            params = onlineEvaluatorListPage.params
            response = onlineEvaluatorListPage.response
        }

        fun service(service: OnlineEvaluatorService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OnlineEvaluatorListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OnlineEvaluatorListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OnlineEvaluatorListPage].
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
        fun build(): OnlineEvaluatorListPage =
            OnlineEvaluatorListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnlineEvaluatorListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "OnlineEvaluatorListPage{service=$service, params=$params, response=$response}"
}
