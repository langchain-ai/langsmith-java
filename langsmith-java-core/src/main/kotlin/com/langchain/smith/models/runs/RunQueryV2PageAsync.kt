// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.RunServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see RunServiceAsync.queryV2 */
class RunQueryV2PageAsync
private constructor(
    private val service: RunServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RunQueryV2Params,
    private val response: RunQueryV2PageResponse,
) : PageAsync<Run> {

    /**
     * Delegates to [RunQueryV2PageResponse], but gracefully handles missing data.
     *
     * @see RunQueryV2PageResponse.items
     */
    override fun items(): List<Run> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [RunQueryV2PageResponse], but gracefully handles missing data.
     *
     * @see RunQueryV2PageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): RunQueryV2Params {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<RunQueryV2PageAsync> =
        service.queryV2(nextPageParams())

    fun autoPager(): AutoPagerAsync<Run> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RunQueryV2Params = params

    /** The response that this page was parsed from. */
    fun response(): RunQueryV2PageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunQueryV2PageAsync].
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

    /** A builder for [RunQueryV2PageAsync]. */
    class Builder internal constructor() {

        private var service: RunServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RunQueryV2Params? = null
        private var response: RunQueryV2PageResponse? = null

        @JvmSynthetic
        internal fun from(runQueryV2PageAsync: RunQueryV2PageAsync) = apply {
            service = runQueryV2PageAsync.service
            streamHandlerExecutor = runQueryV2PageAsync.streamHandlerExecutor
            params = runQueryV2PageAsync.params
            response = runQueryV2PageAsync.response
        }

        fun service(service: RunServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RunQueryV2Params) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RunQueryV2PageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RunQueryV2PageAsync].
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
        fun build(): RunQueryV2PageAsync =
            RunQueryV2PageAsync(
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

        return other is RunQueryV2PageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RunQueryV2PageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
