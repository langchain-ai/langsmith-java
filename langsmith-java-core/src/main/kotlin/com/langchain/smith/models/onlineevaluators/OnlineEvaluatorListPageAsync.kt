// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.OnlineEvaluatorServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see OnlineEvaluatorServiceAsync.list */
class OnlineEvaluatorListPageAsync
private constructor(
    private val service: OnlineEvaluatorServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: OnlineEvaluatorListParams,
    private val response: OnlineEvaluatorListPageResponse,
) : PageAsync<OnlineEvaluator> {

    /**
     * Delegates to [OnlineEvaluatorListPageResponse], but gracefully handles missing data.
     *
     * @see OnlineEvaluatorListPageResponse.evaluators
     */
    fun evaluators(): List<OnlineEvaluator> =
        response._evaluators().getOptional("evaluators").getOrNull() ?: emptyList()

    /**
     * Delegates to [OnlineEvaluatorListPageResponse], but gracefully handles missing data.
     *
     * @see OnlineEvaluatorListPageResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    override fun items(): List<OnlineEvaluator> = evaluators()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): OnlineEvaluatorListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<OnlineEvaluatorListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OnlineEvaluator> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): OnlineEvaluatorListParams = params

    /** The response that this page was parsed from. */
    fun response(): OnlineEvaluatorListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnlineEvaluatorListPageAsync].
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

    /** A builder for [OnlineEvaluatorListPageAsync]. */
    class Builder internal constructor() {

        private var service: OnlineEvaluatorServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: OnlineEvaluatorListParams? = null
        private var response: OnlineEvaluatorListPageResponse? = null

        @JvmSynthetic
        internal fun from(onlineEvaluatorListPageAsync: OnlineEvaluatorListPageAsync) = apply {
            service = onlineEvaluatorListPageAsync.service
            streamHandlerExecutor = onlineEvaluatorListPageAsync.streamHandlerExecutor
            params = onlineEvaluatorListPageAsync.params
            response = onlineEvaluatorListPageAsync.response
        }

        fun service(service: OnlineEvaluatorServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: OnlineEvaluatorListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OnlineEvaluatorListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OnlineEvaluatorListPageAsync].
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
        fun build(): OnlineEvaluatorListPageAsync =
            OnlineEvaluatorListPageAsync(
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

        return other is OnlineEvaluatorListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "OnlineEvaluatorListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
