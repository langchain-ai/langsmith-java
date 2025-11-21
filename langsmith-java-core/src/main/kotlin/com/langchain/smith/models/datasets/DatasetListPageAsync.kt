// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.DatasetServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see DatasetServiceAsync.list */
class DatasetListPageAsync
private constructor(
    private val service: DatasetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DatasetListParams,
    private val items: List<Dataset>,
) : PageAsync<Dataset> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatasetListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<DatasetListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Dataset> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DatasetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Dataset> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetListPageAsync]. */
    class Builder internal constructor() {

        private var service: DatasetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DatasetListParams? = null
        private var items: List<Dataset>? = null

        @JvmSynthetic
        internal fun from(datasetListPageAsync: DatasetListPageAsync) = apply {
            service = datasetListPageAsync.service
            streamHandlerExecutor = datasetListPageAsync.streamHandlerExecutor
            params = datasetListPageAsync.params
            items = datasetListPageAsync.items
        }

        fun service(service: DatasetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<Dataset>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DatasetListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetListPageAsync =
            DatasetListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "DatasetListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
