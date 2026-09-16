// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.SandboxServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SandboxServiceAsync.listUsageCosts */
class SandboxListUsageCostsPageAsync
private constructor(
    private val service: SandboxServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SandboxListUsageCostsParams,
    private val response: SandboxListUsageCostsPageResponse,
) : PageAsync<SandboxListUsageCostsResponse> {

    /**
     * Delegates to [SandboxListUsageCostsPageResponse], but gracefully handles missing data.
     *
     * @see SandboxListUsageCostsPageResponse.items
     */
    override fun items(): List<SandboxListUsageCostsResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [SandboxListUsageCostsPageResponse], but gracefully handles missing data.
     *
     * @see SandboxListUsageCostsPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): SandboxListUsageCostsParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<SandboxListUsageCostsPageAsync> =
        service.listUsageCosts(nextPageParams())

    fun autoPager(): AutoPagerAsync<SandboxListUsageCostsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SandboxListUsageCostsParams = params

    /** The response that this page was parsed from. */
    fun response(): SandboxListUsageCostsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SandboxListUsageCostsPageAsync].
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

    /** A builder for [SandboxListUsageCostsPageAsync]. */
    class Builder internal constructor() {

        private var service: SandboxServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SandboxListUsageCostsParams? = null
        private var response: SandboxListUsageCostsPageResponse? = null

        @JvmSynthetic
        internal fun from(sandboxListUsageCostsPageAsync: SandboxListUsageCostsPageAsync) = apply {
            service = sandboxListUsageCostsPageAsync.service
            streamHandlerExecutor = sandboxListUsageCostsPageAsync.streamHandlerExecutor
            params = sandboxListUsageCostsPageAsync.params
            response = sandboxListUsageCostsPageAsync.response
        }

        fun service(service: SandboxServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SandboxListUsageCostsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SandboxListUsageCostsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SandboxListUsageCostsPageAsync].
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
        fun build(): SandboxListUsageCostsPageAsync =
            SandboxListUsageCostsPageAsync(
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

        return other is SandboxListUsageCostsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SandboxListUsageCostsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
