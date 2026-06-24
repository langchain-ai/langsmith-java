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

/** @see RunServiceAsync.query */
class RunQueryPageAsync
private constructor(
    private val service: RunServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RunQueryParams,
    private val response: RunQueryPageResponse,
) : PageAsync<RunSchema> {

    /**
     * Delegates to [RunQueryPageResponse], but gracefully handles missing data.
     *
     * @see RunQueryPageResponse.runs
     */
    fun runs(): List<RunSchema> = response._runs().getOptional("runs").getOrNull() ?: emptyList()

    /**
     * Delegates to [RunQueryPageResponse], but gracefully handles missing data.
     *
     * @see RunQueryPageResponse.cursors
     */
    fun cursors(): Optional<RunQueryPageResponse.Cursors> =
        response._cursors().getOptional("cursors")

    override fun items(): List<RunSchema> = runs()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && cursors().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): RunQueryParams {
        val nextCursor =
            cursors().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<RunQueryPageAsync> = service.query(nextPageParams())

    fun autoPager(): AutoPagerAsync<RunSchema> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RunQueryParams = params

    /** The response that this page was parsed from. */
    fun response(): RunQueryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunQueryPageAsync].
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

    /** A builder for [RunQueryPageAsync]. */
    class Builder internal constructor() {

        private var service: RunServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RunQueryParams? = null
        private var response: RunQueryPageResponse? = null

        @JvmSynthetic
        internal fun from(runQueryPageAsync: RunQueryPageAsync) = apply {
            service = runQueryPageAsync.service
            streamHandlerExecutor = runQueryPageAsync.streamHandlerExecutor
            params = runQueryPageAsync.params
            response = runQueryPageAsync.response
        }

        fun service(service: RunServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RunQueryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RunQueryPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RunQueryPageAsync].
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
        fun build(): RunQueryPageAsync =
            RunQueryPageAsync(
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

        return other is RunQueryPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RunQueryPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
