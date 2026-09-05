// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.snapshots

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.models.sandboxes.SnapshotListResponse
import com.langchain.smith.models.sandboxes.SnapshotResponse
import com.langchain.smith.services.async.sandboxes.SnapshotServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SnapshotServiceAsync.list */
class SnapshotListPageAsync
private constructor(
    private val service: SnapshotServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SnapshotListParams,
    private val response: SnapshotListResponse,
) : PageAsync<SnapshotResponse> {

    /**
     * Delegates to [SnapshotListResponse], but gracefully handles missing data.
     *
     * @see SnapshotListResponse.items
     */
    override fun items(): List<SnapshotResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [SnapshotListResponse], but gracefully handles missing data.
     *
     * @see SnapshotListResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): SnapshotListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<SnapshotListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SnapshotResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SnapshotListParams = params

    /** The response that this page was parsed from. */
    fun response(): SnapshotListResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SnapshotListPageAsync].
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

    /** A builder for [SnapshotListPageAsync]. */
    class Builder internal constructor() {

        private var service: SnapshotServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SnapshotListParams? = null
        private var response: SnapshotListResponse? = null

        @JvmSynthetic
        internal fun from(snapshotListPageAsync: SnapshotListPageAsync) = apply {
            service = snapshotListPageAsync.service
            streamHandlerExecutor = snapshotListPageAsync.streamHandlerExecutor
            params = snapshotListPageAsync.params
            response = snapshotListPageAsync.response
        }

        fun service(service: SnapshotServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SnapshotListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SnapshotListResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SnapshotListPageAsync].
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
        fun build(): SnapshotListPageAsync =
            SnapshotListPageAsync(
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

        return other is SnapshotListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SnapshotListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
