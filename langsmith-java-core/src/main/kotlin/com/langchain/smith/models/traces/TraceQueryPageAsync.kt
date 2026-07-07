// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.traces

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.TraceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see TraceServiceAsync.query */
class TraceQueryPageAsync
private constructor(
    private val service: TraceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TraceQueryParams,
    private val response: TraceQueryPageResponse,
) : PageAsync<Trace> {

    /**
     * Delegates to [TraceQueryPageResponse], but gracefully handles missing data.
     *
     * @see TraceQueryPageResponse.items
     */
    override fun items(): List<Trace> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [TraceQueryPageResponse], but gracefully handles missing data.
     *
     * @see TraceQueryPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): TraceQueryParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<TraceQueryPageAsync> =
        service.query(nextPageParams())

    fun autoPager(): AutoPagerAsync<Trace> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TraceQueryParams = params

    /** The response that this page was parsed from. */
    fun response(): TraceQueryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TraceQueryPageAsync].
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

    /** A builder for [TraceQueryPageAsync]. */
    class Builder internal constructor() {

        private var service: TraceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TraceQueryParams? = null
        private var response: TraceQueryPageResponse? = null

        @JvmSynthetic
        internal fun from(traceQueryPageAsync: TraceQueryPageAsync) = apply {
            service = traceQueryPageAsync.service
            streamHandlerExecutor = traceQueryPageAsync.streamHandlerExecutor
            params = traceQueryPageAsync.params
            response = traceQueryPageAsync.response
        }

        fun service(service: TraceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TraceQueryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TraceQueryPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TraceQueryPageAsync].
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
        fun build(): TraceQueryPageAsync =
            TraceQueryPageAsync(
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

        return other is TraceQueryPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TraceQueryPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
