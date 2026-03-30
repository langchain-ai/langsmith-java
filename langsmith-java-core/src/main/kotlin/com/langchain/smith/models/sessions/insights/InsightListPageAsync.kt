// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.sessions.InsightServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see InsightServiceAsync.list */
class InsightListPageAsync
private constructor(
    private val service: InsightServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: InsightListParams,
    private val response: InsightListPageResponse,
) : PageAsync<InsightListResponse> {

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

    override fun nextPage(): CompletableFuture<InsightListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InsightListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): InsightListParams = params

    /** The response that this page was parsed from. */
    fun response(): InsightListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InsightListPageAsync].
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

    /** A builder for [InsightListPageAsync]. */
    class Builder internal constructor() {

        private var service: InsightServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: InsightListParams? = null
        private var response: InsightListPageResponse? = null

        @JvmSynthetic
        internal fun from(insightListPageAsync: InsightListPageAsync) = apply {
            service = insightListPageAsync.service
            streamHandlerExecutor = insightListPageAsync.streamHandlerExecutor
            params = insightListPageAsync.params
            response = insightListPageAsync.response
        }

        fun service(service: InsightServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: InsightListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InsightListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InsightListPageAsync].
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
        fun build(): InsightListPageAsync =
            InsightListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InsightListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "InsightListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
