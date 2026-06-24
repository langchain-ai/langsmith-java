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

/** @see RunServiceAsync.queryV1 */
class RunQueryV1PageAsync
private constructor(
    private val service: RunServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RunQueryV1Params,
    private val response: RunQueryV1PageResponse,
) : PageAsync<RunSchema> {

    /**
     * Delegates to [RunQueryV1PageResponse], but gracefully handles missing data.
     *
     * @see RunQueryV1PageResponse.runs
     */
    fun runs(): List<RunSchema> = response._runs().getOptional("runs").getOrNull() ?: emptyList()

    /**
     * Delegates to [RunQueryV1PageResponse], but gracefully handles missing data.
     *
     * @see RunQueryV1PageResponse.cursors
     */
    fun cursors(): Optional<RunQueryV1PageResponse.Cursors> =
        response._cursors().getOptional("cursors")

    override fun items(): List<RunSchema> = runs()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && cursors().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): RunQueryV1Params {
        val nextCursor =
            cursors().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<RunQueryV1PageAsync> =
        service.queryV1(nextPageParams())

    fun autoPager(): AutoPagerAsync<RunSchema> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RunQueryV1Params = params

    /** The response that this page was parsed from. */
    fun response(): RunQueryV1PageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunQueryV1PageAsync].
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

    /** A builder for [RunQueryV1PageAsync]. */
    class Builder internal constructor() {

        private var service: RunServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RunQueryV1Params? = null
        private var response: RunQueryV1PageResponse? = null

        @JvmSynthetic
        internal fun from(runQueryV1PageAsync: RunQueryV1PageAsync) = apply {
            service = runQueryV1PageAsync.service
            streamHandlerExecutor = runQueryV1PageAsync.streamHandlerExecutor
            params = runQueryV1PageAsync.params
            response = runQueryV1PageAsync.response
        }

        fun service(service: RunServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RunQueryV1Params) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RunQueryV1PageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RunQueryV1PageAsync].
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
        fun build(): RunQueryV1PageAsync =
            RunQueryV1PageAsync(
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

        return other is RunQueryV1PageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RunQueryV1PageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
