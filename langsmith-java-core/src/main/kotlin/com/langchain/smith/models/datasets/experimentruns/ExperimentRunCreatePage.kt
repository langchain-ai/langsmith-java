// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.experimentruns

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.datasets.ExperimentRunService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ExperimentRunService.create */
class ExperimentRunCreatePage
private constructor(
    private val service: ExperimentRunService,
    private val params: ExperimentRunCreateParams,
    private val response: ExperimentRunCreatePageResponse,
) : Page<ExperimentRunCreateResponse> {

    /**
     * Delegates to [ExperimentRunCreatePageResponse], but gracefully handles missing data.
     *
     * @see ExperimentRunCreatePageResponse.items
     */
    override fun items(): List<ExperimentRunCreateResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExperimentRunCreatePageResponse], but gracefully handles missing data.
     *
     * @see ExperimentRunCreatePageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ExperimentRunCreateParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): ExperimentRunCreatePage = service.create(nextPageParams())

    fun autoPager(): AutoPager<ExperimentRunCreateResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExperimentRunCreateParams = params

    /** The response that this page was parsed from. */
    fun response(): ExperimentRunCreatePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExperimentRunCreatePage].
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

    /** A builder for [ExperimentRunCreatePage]. */
    class Builder internal constructor() {

        private var service: ExperimentRunService? = null
        private var params: ExperimentRunCreateParams? = null
        private var response: ExperimentRunCreatePageResponse? = null

        @JvmSynthetic
        internal fun from(experimentRunCreatePage: ExperimentRunCreatePage) = apply {
            service = experimentRunCreatePage.service
            params = experimentRunCreatePage.params
            response = experimentRunCreatePage.response
        }

        fun service(service: ExperimentRunService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExperimentRunCreateParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExperimentRunCreatePageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExperimentRunCreatePage].
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
        fun build(): ExperimentRunCreatePage =
            ExperimentRunCreatePage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExperimentRunCreatePage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ExperimentRunCreatePage{service=$service, params=$params, response=$response}"
}
