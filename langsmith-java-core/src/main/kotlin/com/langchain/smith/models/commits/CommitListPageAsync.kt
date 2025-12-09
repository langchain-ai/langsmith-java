// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.CommitServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CommitServiceAsync.list */
class CommitListPageAsync
private constructor(
    private val service: CommitServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CommitListParams,
    private val response: CommitListPageResponse,
) : PageAsync<CommitWithLookups> {

    /**
     * Delegates to [CommitListPageResponse], but gracefully handles missing data.
     *
     * @see CommitListPageResponse.commits
     */
    fun commits(): List<CommitWithLookups> =
        response._commits().getOptional("commits").getOrNull() ?: emptyList()

    /**
     * Delegates to [CommitListPageResponse], but gracefully handles missing data.
     *
     * @see CommitListPageResponse.total
     */
    fun total(): Optional<Long> = response._total().getOptional("total")

    override fun items(): List<CommitWithLookups> = commits()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CommitListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<CommitListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CommitWithLookups> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CommitListParams = params

    /** The response that this page was parsed from. */
    fun response(): CommitListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommitListPageAsync].
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

    /** A builder for [CommitListPageAsync]. */
    class Builder internal constructor() {

        private var service: CommitServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CommitListParams? = null
        private var response: CommitListPageResponse? = null

        @JvmSynthetic
        internal fun from(commitListPageAsync: CommitListPageAsync) = apply {
            service = commitListPageAsync.service
            streamHandlerExecutor = commitListPageAsync.streamHandlerExecutor
            params = commitListPageAsync.params
            response = commitListPageAsync.response
        }

        fun service(service: CommitServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CommitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CommitListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CommitListPageAsync].
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
        fun build(): CommitListPageAsync =
            CommitListPageAsync(
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

        return other is CommitListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CommitListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
