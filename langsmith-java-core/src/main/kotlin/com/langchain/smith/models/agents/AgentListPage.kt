// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.agents

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.AgentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AgentService.list */
class AgentListPage
private constructor(
    private val service: AgentService,
    private val params: AgentListParams,
    private val requestOptions: RequestOptions,
    private val response: AgentListPageResponse,
) : Page<Agent> {

    /**
     * Delegates to [AgentListPageResponse], but gracefully handles missing data.
     *
     * @see AgentListPageResponse.items
     */
    override fun items(): List<Agent> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [AgentListPageResponse], but gracefully handles missing data.
     *
     * @see AgentListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): AgentListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): AgentListPage = service.list(nextPageParams(), requestOptions)

    fun autoPager(): AutoPager<Agent> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AgentListParams = params

    /** The response that this page was parsed from. */
    fun response(): AgentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentListPage].
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

    /** A builder for [AgentListPage]. */
    class Builder internal constructor() {

        private var service: AgentService? = null
        private var params: AgentListParams? = null
        private var requestOptions: RequestOptions = RequestOptions.none()
        private var response: AgentListPageResponse? = null

        @JvmSynthetic
        internal fun from(agentListPage: AgentListPage) = apply {
            service = agentListPage.service
            params = agentListPage.params
            requestOptions = agentListPage.requestOptions
            response = agentListPage.response
        }

        fun service(service: AgentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AgentListParams) = apply { this.params = params }

        fun requestOptions(requestOptions: RequestOptions) = apply {
            this.requestOptions = requestOptions
        }

        /** The response that this page was parsed from. */
        fun response(response: AgentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AgentListPage].
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
        fun build(): AgentListPage =
            AgentListPage(
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

        return other is AgentListPage &&
            service == other.service &&
            params == other.params &&
            requestOptions == other.requestOptions &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, requestOptions, response)

    override fun toString() =
        "AgentListPage{service=$service, params=$params, requestOptions=$requestOptions, response=$response}"
}
