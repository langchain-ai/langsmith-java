// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.sandboxes.BoxServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see BoxServiceAsync.listServiceUrls */
class BoxListServiceUrlsPageAsync
private constructor(
    private val service: BoxServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BoxListServiceUrlsParams,
    private val response: BoxListServiceUrlsPageResponse,
) : PageAsync<BoxListServiceUrlsResponse> {

    /**
     * Delegates to [BoxListServiceUrlsPageResponse], but gracefully handles missing data.
     *
     * @see BoxListServiceUrlsPageResponse.items
     */
    override fun items(): List<BoxListServiceUrlsResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [BoxListServiceUrlsPageResponse], but gracefully handles missing data.
     *
     * @see BoxListServiceUrlsPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): BoxListServiceUrlsParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BoxListServiceUrlsPageAsync> =
        service.listServiceUrls(nextPageParams())

    fun autoPager(): AutoPagerAsync<BoxListServiceUrlsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BoxListServiceUrlsParams = params

    /** The response that this page was parsed from. */
    fun response(): BoxListServiceUrlsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BoxListServiceUrlsPageAsync].
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

    /** A builder for [BoxListServiceUrlsPageAsync]. */
    class Builder internal constructor() {

        private var service: BoxServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BoxListServiceUrlsParams? = null
        private var response: BoxListServiceUrlsPageResponse? = null

        @JvmSynthetic
        internal fun from(boxListServiceUrlsPageAsync: BoxListServiceUrlsPageAsync) = apply {
            service = boxListServiceUrlsPageAsync.service
            streamHandlerExecutor = boxListServiceUrlsPageAsync.streamHandlerExecutor
            params = boxListServiceUrlsPageAsync.params
            response = boxListServiceUrlsPageAsync.response
        }

        fun service(service: BoxServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BoxListServiceUrlsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BoxListServiceUrlsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BoxListServiceUrlsPageAsync].
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
        fun build(): BoxListServiceUrlsPageAsync =
            BoxListServiceUrlsPageAsync(
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

        return other is BoxListServiceUrlsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BoxListServiceUrlsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
