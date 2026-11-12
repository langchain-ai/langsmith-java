// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.evaluators

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.EvaluatorServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see EvaluatorServiceAsync.listV2 */
class EvaluatorListV2PageAsync
private constructor(
    private val service: EvaluatorServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EvaluatorListV2Params,
    private val requestOptions: RequestOptions,
    private val response: EvaluatorListV2PageResponse,
) : PageAsync<Rule> {

    /**
     * Delegates to [EvaluatorListV2PageResponse], but gracefully handles missing data.
     *
     * @see EvaluatorListV2PageResponse.items
     */
    override fun items(): List<Rule> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [EvaluatorListV2PageResponse], but gracefully handles missing data.
     *
     * @see EvaluatorListV2PageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): EvaluatorListV2Params {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<EvaluatorListV2PageAsync> =
        service.listV2(nextPageParams(), requestOptions)

    fun autoPager(): AutoPagerAsync<Rule> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): EvaluatorListV2Params = params

    /** The response that this page was parsed from. */
    fun response(): EvaluatorListV2PageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EvaluatorListV2PageAsync].
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

    /** A builder for [EvaluatorListV2PageAsync]. */
    class Builder internal constructor() {

        private var service: EvaluatorServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EvaluatorListV2Params? = null
        private var requestOptions: RequestOptions = RequestOptions.none()
        private var response: EvaluatorListV2PageResponse? = null

        @JvmSynthetic
        internal fun from(evaluatorListV2PageAsync: EvaluatorListV2PageAsync) = apply {
            service = evaluatorListV2PageAsync.service
            streamHandlerExecutor = evaluatorListV2PageAsync.streamHandlerExecutor
            params = evaluatorListV2PageAsync.params
            requestOptions = evaluatorListV2PageAsync.requestOptions
            response = evaluatorListV2PageAsync.response
        }

        fun service(service: EvaluatorServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: EvaluatorListV2Params) = apply { this.params = params }

        fun requestOptions(requestOptions: RequestOptions) = apply {
            this.requestOptions = requestOptions
        }

        /** The response that this page was parsed from. */
        fun response(response: EvaluatorListV2PageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EvaluatorListV2PageAsync].
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
        fun build(): EvaluatorListV2PageAsync =
            EvaluatorListV2PageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                requestOptions,
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EvaluatorListV2PageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            requestOptions == other.requestOptions &&
            response == other.response
    }

    override fun hashCode(): Int =
        Objects.hash(service, streamHandlerExecutor, params, requestOptions, response)

    override fun toString() =
        "EvaluatorListV2PageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, requestOptions=$requestOptions, response=$response}"
}
