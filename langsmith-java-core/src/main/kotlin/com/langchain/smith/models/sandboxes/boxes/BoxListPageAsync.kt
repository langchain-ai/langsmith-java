// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.models.sandboxes.SandboxListResponse
import com.langchain.smith.models.sandboxes.SandboxResponse
import com.langchain.smith.services.async.sandboxes.BoxServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see BoxServiceAsync.list */
class BoxListPageAsync
private constructor(
    private val service: BoxServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BoxListParams,
    private val response: SandboxListResponse,
) : PageAsync<SandboxResponse> {

    /**
     * Delegates to [SandboxListResponse], but gracefully handles missing data.
     *
     * @see SandboxListResponse.items
     */
    override fun items(): List<SandboxResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [SandboxListResponse], but gracefully handles missing data.
     *
     * @see SandboxListResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): BoxListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BoxListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SandboxResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BoxListParams = params

    /** The response that this page was parsed from. */
    fun response(): SandboxListResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BoxListPageAsync].
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

    /** A builder for [BoxListPageAsync]. */
    class Builder internal constructor() {

        private var service: BoxServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BoxListParams? = null
        private var response: SandboxListResponse? = null

        @JvmSynthetic
        internal fun from(boxListPageAsync: BoxListPageAsync) = apply {
            service = boxListPageAsync.service
            streamHandlerExecutor = boxListPageAsync.streamHandlerExecutor
            params = boxListPageAsync.params
            response = boxListPageAsync.response
        }

        fun service(service: BoxServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BoxListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SandboxListResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BoxListPageAsync].
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
        fun build(): BoxListPageAsync =
            BoxListPageAsync(
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

        return other is BoxListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BoxListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
