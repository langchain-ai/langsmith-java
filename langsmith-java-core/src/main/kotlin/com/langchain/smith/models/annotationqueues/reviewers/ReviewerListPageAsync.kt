// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.reviewers

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.annotationqueues.ReviewerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ReviewerServiceAsync.list */
class ReviewerListPageAsync
private constructor(
    private val service: ReviewerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ReviewerListParams,
    private val response: ReviewerListPageResponse,
) : PageAsync<ReviewerListResponse> {

    /**
     * Delegates to [ReviewerListPageResponse], but gracefully handles missing data.
     *
     * @see ReviewerListPageResponse.items
     */
    override fun items(): List<ReviewerListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ReviewerListPageResponse], but gracefully handles missing data.
     *
     * @see ReviewerListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ReviewerListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ReviewerListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ReviewerListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ReviewerListParams = params

    /** The response that this page was parsed from. */
    fun response(): ReviewerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReviewerListPageAsync].
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

    /** A builder for [ReviewerListPageAsync]. */
    class Builder internal constructor() {

        private var service: ReviewerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ReviewerListParams? = null
        private var response: ReviewerListPageResponse? = null

        @JvmSynthetic
        internal fun from(reviewerListPageAsync: ReviewerListPageAsync) = apply {
            service = reviewerListPageAsync.service
            streamHandlerExecutor = reviewerListPageAsync.streamHandlerExecutor
            params = reviewerListPageAsync.params
            response = reviewerListPageAsync.response
        }

        fun service(service: ReviewerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ReviewerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReviewerListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ReviewerListPageAsync].
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
        fun build(): ReviewerListPageAsync =
            ReviewerListPageAsync(
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

        return other is ReviewerListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ReviewerListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
