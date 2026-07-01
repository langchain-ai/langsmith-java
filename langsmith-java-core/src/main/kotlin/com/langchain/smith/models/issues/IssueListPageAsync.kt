// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.issues

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.IssueServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see IssueServiceAsync.list */
class IssueListPageAsync
private constructor(
    private val service: IssueServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: IssueListParams,
    private val items: List<Issue>,
) : PageAsync<Issue> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): IssueListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<IssueListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Issue> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): IssueListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Issue> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IssueListPageAsync].
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

    /** A builder for [IssueListPageAsync]. */
    class Builder internal constructor() {

        private var service: IssueServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: IssueListParams? = null
        private var items: List<Issue>? = null

        @JvmSynthetic
        internal fun from(issueListPageAsync: IssueListPageAsync) = apply {
            service = issueListPageAsync.service
            streamHandlerExecutor = issueListPageAsync.streamHandlerExecutor
            params = issueListPageAsync.params
            items = issueListPageAsync.items
        }

        fun service(service: IssueServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: IssueListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<Issue>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [IssueListPageAsync].
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
        fun build(): IssueListPageAsync =
            IssueListPageAsync(
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

        return other is IssueListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "IssueListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
