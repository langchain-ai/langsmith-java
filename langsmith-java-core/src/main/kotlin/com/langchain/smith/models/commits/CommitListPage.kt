// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.CommitService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CommitService.list */
class CommitListPage
private constructor(
    private val service: CommitService,
    private val params: CommitListParams,
    private val response: CommitListPageResponse,
) : Page<CommitWithLookups> {

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

    override fun nextPage(): CommitListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CommitWithLookups> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CommitListParams = params

    /** The response that this page was parsed from. */
    fun response(): CommitListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommitListPage].
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

    /** A builder for [CommitListPage]. */
    class Builder internal constructor() {

        private var service: CommitService? = null
        private var params: CommitListParams? = null
        private var response: CommitListPageResponse? = null

        @JvmSynthetic
        internal fun from(commitListPage: CommitListPage) = apply {
            service = commitListPage.service
            params = commitListPage.params
            response = commitListPage.response
        }

        fun service(service: CommitService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CommitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CommitListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CommitListPage].
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
        fun build(): CommitListPage =
            CommitListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "CommitListPage{service=$service, params=$params, response=$response}"
}
