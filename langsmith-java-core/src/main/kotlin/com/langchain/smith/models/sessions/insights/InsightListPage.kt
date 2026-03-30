// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.sessions.InsightService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see InsightService.list */
class InsightListPage
private constructor(
    private val service: InsightService,
    private val params: InsightListParams,
    private val response: InsightListPageResponse,
) : Page<InsightListResponse> {

    /**
     * Delegates to [InsightListPageResponse], but gracefully handles missing data.
     *
     * @see InsightListPageResponse.clusteringJobs
     */
    fun clusteringJobs(): List<InsightListResponse> =
        response._clusteringJobs().getOptional("clustering_jobs").getOrNull() ?: emptyList()

    override fun items(): List<InsightListResponse> = clusteringJobs()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): InsightListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): InsightListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<InsightListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InsightListParams = params

    /** The response that this page was parsed from. */
    fun response(): InsightListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InsightListPage].
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

    /** A builder for [InsightListPage]. */
    class Builder internal constructor() {

        private var service: InsightService? = null
        private var params: InsightListParams? = null
        private var response: InsightListPageResponse? = null

        @JvmSynthetic
        internal fun from(insightListPage: InsightListPage) = apply {
            service = insightListPage.service
            params = insightListPage.params
            response = insightListPage.response
        }

        fun service(service: InsightService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InsightListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InsightListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InsightListPage].
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
        fun build(): InsightListPage =
            InsightListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsightListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InsightListPage{service=$service, params=$params, response=$response}"
}
