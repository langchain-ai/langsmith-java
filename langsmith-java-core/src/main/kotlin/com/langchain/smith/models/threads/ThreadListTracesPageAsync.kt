// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.ThreadServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ThreadServiceAsync.listTraces */
class ThreadListTracesPageAsync
private constructor(
    private val service: ThreadServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ThreadListTracesParams,
    private val response: ThreadListTracesPageResponse,
) : PageAsync<ThreadTraceListItem> {

    /**
     * Delegates to [ThreadListTracesPageResponse], but gracefully handles missing data.
     *
     * @see ThreadListTracesPageResponse.items
     */
    override fun items(): List<ThreadTraceListItem> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ThreadListTracesPageResponse], but gracefully handles missing data.
     *
     * @see ThreadListTracesPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ThreadListTracesParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ThreadListTracesPageAsync> =
        service.listTraces(nextPageParams())

    fun autoPager(): AutoPagerAsync<ThreadTraceListItem> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ThreadListTracesParams = params

    /** The response that this page was parsed from. */
    fun response(): ThreadListTracesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ThreadListTracesPageAsync].
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

    /** A builder for [ThreadListTracesPageAsync]. */
    class Builder internal constructor() {

        private var service: ThreadServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ThreadListTracesParams? = null
        private var response: ThreadListTracesPageResponse? = null

        @JvmSynthetic
        internal fun from(threadListTracesPageAsync: ThreadListTracesPageAsync) = apply {
            service = threadListTracesPageAsync.service
            streamHandlerExecutor = threadListTracesPageAsync.streamHandlerExecutor
            params = threadListTracesPageAsync.params
            response = threadListTracesPageAsync.response
        }

        fun service(service: ThreadServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ThreadListTracesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ThreadListTracesPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ThreadListTracesPageAsync].
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
        fun build(): ThreadListTracesPageAsync =
            ThreadListTracesPageAsync(
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

        return other is ThreadListTracesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ThreadListTracesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
