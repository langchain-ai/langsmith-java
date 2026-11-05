// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.SessionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SessionServiceAsync.listV2 */
class SessionListV2PageAsync
private constructor(
    private val service: SessionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SessionListV2Params,
    private val response: SessionListV2PageResponse,
) : PageAsync<Session> {

    /**
     * Delegates to [SessionListV2PageResponse], but gracefully handles missing data.
     *
     * @see SessionListV2PageResponse.items
     */
    override fun items(): List<Session> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [SessionListV2PageResponse], but gracefully handles missing data.
     *
     * @see SessionListV2PageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): SessionListV2Params {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<SessionListV2PageAsync> =
        service.listV2(nextPageParams())

    fun autoPager(): AutoPagerAsync<Session> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SessionListV2Params = params

    /** The response that this page was parsed from. */
    fun response(): SessionListV2PageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SessionListV2PageAsync].
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

    /** A builder for [SessionListV2PageAsync]. */
    class Builder internal constructor() {

        private var service: SessionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SessionListV2Params? = null
        private var response: SessionListV2PageResponse? = null

        @JvmSynthetic
        internal fun from(sessionListV2PageAsync: SessionListV2PageAsync) = apply {
            service = sessionListV2PageAsync.service
            streamHandlerExecutor = sessionListV2PageAsync.streamHandlerExecutor
            params = sessionListV2PageAsync.params
            response = sessionListV2PageAsync.response
        }

        fun service(service: SessionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SessionListV2Params) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SessionListV2PageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SessionListV2PageAsync].
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
        fun build(): SessionListV2PageAsync =
            SessionListV2PageAsync(
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

        return other is SessionListV2PageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SessionListV2PageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
