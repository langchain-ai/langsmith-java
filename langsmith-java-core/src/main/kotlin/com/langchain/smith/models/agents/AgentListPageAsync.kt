// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.agents

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.AgentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AgentServiceAsync.list */
class AgentListPageAsync
private constructor(
    private val service: AgentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AgentListParams,
    private val requestOptions: RequestOptions,
    private val response: AgentListPageResponse,
) : PageAsync<Agent> {

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

    override fun nextPage(): CompletableFuture<AgentListPageAsync> =
        service.list(nextPageParams(), requestOptions)

    fun autoPager(): AutoPagerAsync<Agent> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AgentListParams = params

    /** The response that this page was parsed from. */
    fun response(): AgentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentListPageAsync]. */
    class Builder internal constructor() {

        private var service: AgentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AgentListParams? = null
        private var requestOptions: RequestOptions = RequestOptions.none()
        private var response: AgentListPageResponse? = null

        @JvmSynthetic
        internal fun from(agentListPageAsync: AgentListPageAsync) = apply {
            service = agentListPageAsync.service
            streamHandlerExecutor = agentListPageAsync.streamHandlerExecutor
            params = agentListPageAsync.params
            requestOptions = agentListPageAsync.requestOptions
            response = agentListPageAsync.response
        }

        fun service(service: AgentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AgentListParams) = apply { this.params = params }

        fun requestOptions(requestOptions: RequestOptions) = apply {
            this.requestOptions = requestOptions
        }

        /** The response that this page was parsed from. */
        fun response(response: AgentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AgentListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentListPageAsync =
            AgentListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                requestOptions,
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            requestOptions == other.requestOptions &&
            response == other.response
    }

    override fun hashCode(): Int =
        Objects.hash(service, streamHandlerExecutor, params, requestOptions, response)

    override fun toString() =
        "AgentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, requestOptions=$requestOptions, response=$response}"
}
