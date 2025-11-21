// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.public_.DatasetServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see DatasetServiceAsync.listComparative */
class DatasetListComparativePageAsync
private constructor(
    private val service: DatasetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DatasetListComparativeParams,
    private val items: List<DatasetListComparativeResponse>,
) : PageAsync<DatasetListComparativeResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatasetListComparativeParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<DatasetListComparativePageAsync> =
        service.listComparative(nextPageParams())

    fun autoPager(): AutoPagerAsync<DatasetListComparativeResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DatasetListComparativeParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DatasetListComparativeResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DatasetListComparativePageAsync].
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

    /** A builder for [DatasetListComparativePageAsync]. */
    class Builder internal constructor() {

        private var service: DatasetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DatasetListComparativeParams? = null
        private var items: List<DatasetListComparativeResponse>? = null

        @JvmSynthetic
        internal fun from(datasetListComparativePageAsync: DatasetListComparativePageAsync) =
            apply {
                service = datasetListComparativePageAsync.service
                streamHandlerExecutor = datasetListComparativePageAsync.streamHandlerExecutor
                params = datasetListComparativePageAsync.params
                items = datasetListComparativePageAsync.items
            }

        fun service(service: DatasetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetListComparativeParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DatasetListComparativeResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DatasetListComparativePageAsync].
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
        fun build(): DatasetListComparativePageAsync =
            DatasetListComparativePageAsync(
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

        return other is DatasetListComparativePageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "DatasetListComparativePageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
