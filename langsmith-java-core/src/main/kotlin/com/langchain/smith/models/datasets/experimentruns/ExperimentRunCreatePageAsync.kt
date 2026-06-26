// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.experimentruns

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.datasets.ExperimentRunServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ExperimentRunServiceAsync.create */
class ExperimentRunCreatePageAsync
private constructor(
    private val service: ExperimentRunServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ExperimentRunCreateParams,
    private val response: ExperimentRunCreatePageResponse,
) : PageAsync<ExperimentRunCreateResponse> {

    /**
     * Delegates to [ExperimentRunCreatePageResponse], but gracefully handles missing data.
     *
     * @see ExperimentRunCreatePageResponse.items
     */
    override fun items(): List<ExperimentRunCreateResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExperimentRunCreatePageResponse], but gracefully handles missing data.
     *
     * @see ExperimentRunCreatePageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ExperimentRunCreateParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ExperimentRunCreatePageAsync> =
        service.create(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExperimentRunCreateResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ExperimentRunCreateParams = params

    /** The response that this page was parsed from. */
    fun response(): ExperimentRunCreatePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExperimentRunCreatePageAsync].
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

    /** A builder for [ExperimentRunCreatePageAsync]. */
    class Builder internal constructor() {

        private var service: ExperimentRunServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ExperimentRunCreateParams? = null
        private var response: ExperimentRunCreatePageResponse? = null

        @JvmSynthetic
        internal fun from(experimentRunCreatePageAsync: ExperimentRunCreatePageAsync) = apply {
            service = experimentRunCreatePageAsync.service
            streamHandlerExecutor = experimentRunCreatePageAsync.streamHandlerExecutor
            params = experimentRunCreatePageAsync.params
            response = experimentRunCreatePageAsync.response
        }

        fun service(service: ExperimentRunServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ExperimentRunCreateParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExperimentRunCreatePageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExperimentRunCreatePageAsync].
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
        fun build(): ExperimentRunCreatePageAsync =
            ExperimentRunCreatePageAsync(
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

        return other is ExperimentRunCreatePageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ExperimentRunCreatePageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
