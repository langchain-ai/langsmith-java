// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.RepoServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RepoServiceAsync.list */
class RepoListPageAsync
private constructor(
    private val service: RepoServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RepoListParams,
    private val response: RepoListPageResponse,
) : PageAsync<RepoWithLookups> {

    /**
     * Delegates to [RepoListPageResponse], but gracefully handles missing data.
     *
     * @see RepoListPageResponse.repos
     */
    fun repos(): List<RepoWithLookups> =
        response._repos().getOptional("repos").getOrNull() ?: emptyList()

    /**
     * Delegates to [RepoListPageResponse], but gracefully handles missing data.
     *
     * @see RepoListPageResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    override fun items(): List<RepoWithLookups> = repos()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): RepoListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<RepoListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RepoWithLookups> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RepoListParams = params

    /** The response that this page was parsed from. */
    fun response(): RepoListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RepoListPageAsync].
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

    /** A builder for [RepoListPageAsync]. */
    class Builder internal constructor() {

        private var service: RepoServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RepoListParams? = null
        private var response: RepoListPageResponse? = null

        @JvmSynthetic
        internal fun from(repoListPageAsync: RepoListPageAsync) = apply {
            service = repoListPageAsync.service
            streamHandlerExecutor = repoListPageAsync.streamHandlerExecutor
            params = repoListPageAsync.params
            response = repoListPageAsync.response
        }

        fun service(service: RepoServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RepoListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RepoListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RepoListPageAsync].
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
        fun build(): RepoListPageAsync =
            RepoListPageAsync(
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

        return other is RepoListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RepoListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
