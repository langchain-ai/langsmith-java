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

/** @see DatasetServiceAsync.retrieveComparative */
class DatasetRetrieveComparativePageAsync
private constructor(
    private val service: DatasetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DatasetRetrieveComparativeParams,
    private val items: List<DatasetRetrieveComparativeResponse>,
) : PageAsync<DatasetRetrieveComparativeResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatasetRetrieveComparativeParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<DatasetRetrieveComparativePageAsync> =
        service.retrieveComparative(nextPageParams())

    fun autoPager(): AutoPagerAsync<DatasetRetrieveComparativeResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DatasetRetrieveComparativeParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DatasetRetrieveComparativeResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DatasetRetrieveComparativePageAsync].
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

    /** A builder for [DatasetRetrieveComparativePageAsync]. */
    class Builder internal constructor() {

        private var service: DatasetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DatasetRetrieveComparativeParams? = null
        private var items: List<DatasetRetrieveComparativeResponse>? = null

        @JvmSynthetic
        internal fun from(
            datasetRetrieveComparativePageAsync: DatasetRetrieveComparativePageAsync
        ) = apply {
            service = datasetRetrieveComparativePageAsync.service
            streamHandlerExecutor = datasetRetrieveComparativePageAsync.streamHandlerExecutor
            params = datasetRetrieveComparativePageAsync.params
            items = datasetRetrieveComparativePageAsync.items
        }

        fun service(service: DatasetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetRetrieveComparativeParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DatasetRetrieveComparativeResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DatasetRetrieveComparativePageAsync].
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
        fun build(): DatasetRetrieveComparativePageAsync =
            DatasetRetrieveComparativePageAsync(
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

        return other is DatasetRetrieveComparativePageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "DatasetRetrieveComparativePageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
