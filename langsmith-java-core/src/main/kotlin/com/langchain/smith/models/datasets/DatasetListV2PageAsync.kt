// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.DatasetServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see DatasetServiceAsync.listV2 */
class DatasetListV2PageAsync
private constructor(
    private val service: DatasetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DatasetListV2Params,
    private val response: DatasetListV2PageResponse,
) : PageAsync<Dataset> {

    /**
     * Delegates to [DatasetListV2PageResponse], but gracefully handles missing data.
     *
     * @see DatasetListV2PageResponse.items
     */
    override fun items(): List<Dataset> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [DatasetListV2PageResponse], but gracefully handles missing data.
     *
     * @see DatasetListV2PageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): DatasetListV2Params {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<DatasetListV2PageAsync> =
        service.listV2(nextPageParams())

    fun autoPager(): AutoPagerAsync<Dataset> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DatasetListV2Params = params

    /** The response that this page was parsed from. */
    fun response(): DatasetListV2PageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetListV2PageAsync].
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

    /** A builder for [DatasetListV2PageAsync]. */
    class Builder internal constructor() {

        private var service: DatasetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DatasetListV2Params? = null
        private var response: DatasetListV2PageResponse? = null

        @JvmSynthetic
        internal fun from(datasetListV2PageAsync: DatasetListV2PageAsync) = apply {
            service = datasetListV2PageAsync.service
            streamHandlerExecutor = datasetListV2PageAsync.streamHandlerExecutor
            params = datasetListV2PageAsync.params
            response = datasetListV2PageAsync.response
        }

        fun service(service: DatasetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetListV2Params) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DatasetListV2PageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DatasetListV2PageAsync].
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
        fun build(): DatasetListV2PageAsync =
            DatasetListV2PageAsync(
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

        return other is DatasetListV2PageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DatasetListV2PageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
