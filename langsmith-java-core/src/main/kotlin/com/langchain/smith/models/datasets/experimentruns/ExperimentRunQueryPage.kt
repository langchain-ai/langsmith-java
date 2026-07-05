// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.experimentruns

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.datasets.ExperimentRunService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ExperimentRunService.query */
class ExperimentRunQueryPage
private constructor(
    private val service: ExperimentRunService,
    private val params: ExperimentRunQueryParams,
    private val response: ExperimentRunQueryPageResponse,
) : Page<ExperimentRunQueryResponse> {

    /**
     * Delegates to [ExperimentRunQueryPageResponse], but gracefully handles missing data.
     *
     * @see ExperimentRunQueryPageResponse.items
     */
    override fun items(): List<ExperimentRunQueryResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExperimentRunQueryPageResponse], but gracefully handles missing data.
     *
     * @see ExperimentRunQueryPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ExperimentRunQueryParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): ExperimentRunQueryPage = service.query(nextPageParams())

    fun autoPager(): AutoPager<ExperimentRunQueryResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExperimentRunQueryParams = params

    /** The response that this page was parsed from. */
    fun response(): ExperimentRunQueryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExperimentRunQueryPage].
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

    /** A builder for [ExperimentRunQueryPage]. */
    class Builder internal constructor() {

        private var service: ExperimentRunService? = null
        private var params: ExperimentRunQueryParams? = null
        private var response: ExperimentRunQueryPageResponse? = null

        @JvmSynthetic
        internal fun from(experimentRunQueryPage: ExperimentRunQueryPage) = apply {
            service = experimentRunQueryPage.service
            params = experimentRunQueryPage.params
            response = experimentRunQueryPage.response
        }

        fun service(service: ExperimentRunService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExperimentRunQueryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExperimentRunQueryPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExperimentRunQueryPage].
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
        fun build(): ExperimentRunQueryPage =
            ExperimentRunQueryPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExperimentRunQueryPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ExperimentRunQueryPage{service=$service, params=$params, response=$response}"
}
