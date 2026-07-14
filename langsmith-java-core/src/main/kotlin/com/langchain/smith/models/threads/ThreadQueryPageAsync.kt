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

/** @see ThreadServiceAsync.query */
class ThreadQueryPageAsync
private constructor(
    private val service: ThreadServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ThreadQueryParams,
    private val response: ThreadQueryPageResponse,
) : PageAsync<Thread> {

    /**
     * Delegates to [ThreadQueryPageResponse], but gracefully handles missing data.
     *
     * @see ThreadQueryPageResponse.items
     */
    override fun items(): List<Thread> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ThreadQueryPageResponse], but gracefully handles missing data.
     *
     * @see ThreadQueryPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ThreadQueryParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ThreadQueryPageAsync> =
        service.query(nextPageParams())

    fun autoPager(): AutoPagerAsync<Thread> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ThreadQueryParams = params

    /** The response that this page was parsed from. */
    fun response(): ThreadQueryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ThreadQueryPageAsync].
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

    /** A builder for [ThreadQueryPageAsync]. */
    class Builder internal constructor() {

        private var service: ThreadServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ThreadQueryParams? = null
        private var response: ThreadQueryPageResponse? = null

        @JvmSynthetic
        internal fun from(threadQueryPageAsync: ThreadQueryPageAsync) = apply {
            service = threadQueryPageAsync.service
            streamHandlerExecutor = threadQueryPageAsync.streamHandlerExecutor
            params = threadQueryPageAsync.params
            response = threadQueryPageAsync.response
        }

        fun service(service: ThreadServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ThreadQueryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ThreadQueryPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ThreadQueryPageAsync].
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
        fun build(): ThreadQueryPageAsync =
            ThreadQueryPageAsync(
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

        return other is ThreadQueryPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ThreadQueryPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
