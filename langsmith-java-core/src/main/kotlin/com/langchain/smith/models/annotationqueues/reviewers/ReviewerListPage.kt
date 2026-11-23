// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.reviewers

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.annotationqueues.ReviewerService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ReviewerService.list */
class ReviewerListPage
private constructor(
    private val service: ReviewerService,
    private val params: ReviewerListParams,
    private val response: ReviewerListPageResponse,
) : Page<ReviewerListResponse> {

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

    override fun nextPage(): ReviewerListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ReviewerListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ReviewerListParams = params

    /** The response that this page was parsed from. */
    fun response(): ReviewerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReviewerListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReviewerListPage]. */
    class Builder internal constructor() {

        private var service: ReviewerService? = null
        private var params: ReviewerListParams? = null
        private var response: ReviewerListPageResponse? = null

        @JvmSynthetic
        internal fun from(reviewerListPage: ReviewerListPage) = apply {
            service = reviewerListPage.service
            params = reviewerListPage.params
            response = reviewerListPage.response
        }

        fun service(service: ReviewerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReviewerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReviewerListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ReviewerListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReviewerListPage =
            ReviewerListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReviewerListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ReviewerListPage{service=$service, params=$params, response=$response}"
}
