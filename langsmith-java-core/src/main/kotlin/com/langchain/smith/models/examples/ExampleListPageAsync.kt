// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.ExampleServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see ExampleServiceAsync.list */
class ExampleListPageAsync
private constructor(
    private val service: ExampleServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ExampleListParams,
    private val items: List<Example>,
) : PageAsync<Example> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ExampleListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<ExampleListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Example> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ExampleListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Example> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExampleListPageAsync].
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

    /** A builder for [ExampleListPageAsync]. */
    class Builder internal constructor() {

        private var service: ExampleServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ExampleListParams? = null
        private var items: List<Example>? = null

        @JvmSynthetic
        internal fun from(exampleListPageAsync: ExampleListPageAsync) = apply {
            service = exampleListPageAsync.service
            streamHandlerExecutor = exampleListPageAsync.streamHandlerExecutor
            params = exampleListPageAsync.params
            items = exampleListPageAsync.items
        }

        fun service(service: ExampleServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ExampleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<Example>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ExampleListPageAsync].
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
        fun build(): ExampleListPageAsync =
            ExampleListPageAsync(
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

        return other is ExampleListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "ExampleListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
