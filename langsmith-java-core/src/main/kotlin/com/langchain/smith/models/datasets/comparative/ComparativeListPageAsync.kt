// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.comparative

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.datasets.ComparativeServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see ComparativeServiceAsync.list */
class ComparativeListPageAsync
private constructor(
    private val service: ComparativeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ComparativeListParams,
    private val items: List<ComparativeListResponse>,
) : PageAsync<ComparativeListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ComparativeListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<ComparativeListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ComparativeListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ComparativeListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ComparativeListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ComparativeListPageAsync].
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

    /** A builder for [ComparativeListPageAsync]. */
    class Builder internal constructor() {

        private var service: ComparativeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ComparativeListParams? = null
        private var items: List<ComparativeListResponse>? = null

        @JvmSynthetic
        internal fun from(comparativeListPageAsync: ComparativeListPageAsync) = apply {
            service = comparativeListPageAsync.service
            streamHandlerExecutor = comparativeListPageAsync.streamHandlerExecutor
            params = comparativeListPageAsync.params
            items = comparativeListPageAsync.items
        }

        fun service(service: ComparativeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ComparativeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ComparativeListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ComparativeListPageAsync].
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
        fun build(): ComparativeListPageAsync =
            ComparativeListPageAsync(
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

        return other is ComparativeListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "ComparativeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
