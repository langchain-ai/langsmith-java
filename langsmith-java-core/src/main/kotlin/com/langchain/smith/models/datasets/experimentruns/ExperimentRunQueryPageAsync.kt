// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.experimentruns

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.datasets.ExperimentRunServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ExperimentRunServiceAsync.query */
class ExperimentRunQueryPageAsync
private constructor(
    private val service: ExperimentRunServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ExperimentRunQueryParams,
    private val response: ExperimentRunQueryPageResponse,
) : PageAsync<ExperimentRunQueryResponse> {

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

    override fun nextPage(): CompletableFuture<ExperimentRunQueryPageAsync> =
        service.query(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExperimentRunQueryResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ExperimentRunQueryParams = params

    /** The response that this page was parsed from. */
    fun response(): ExperimentRunQueryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExperimentRunQueryPageAsync].
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

    /** A builder for [ExperimentRunQueryPageAsync]. */
    class Builder internal constructor() {

        private var service: ExperimentRunServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ExperimentRunQueryParams? = null
        private var response: ExperimentRunQueryPageResponse? = null

        @JvmSynthetic
        internal fun from(experimentRunQueryPageAsync: ExperimentRunQueryPageAsync) = apply {
            service = experimentRunQueryPageAsync.service
            streamHandlerExecutor = experimentRunQueryPageAsync.streamHandlerExecutor
            params = experimentRunQueryPageAsync.params
            response = experimentRunQueryPageAsync.response
        }

        fun service(service: ExperimentRunServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ExperimentRunQueryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExperimentRunQueryPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExperimentRunQueryPageAsync].
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
        fun build(): ExperimentRunQueryPageAsync =
            ExperimentRunQueryPageAsync(
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

        return other is ExperimentRunQueryPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ExperimentRunQueryPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
