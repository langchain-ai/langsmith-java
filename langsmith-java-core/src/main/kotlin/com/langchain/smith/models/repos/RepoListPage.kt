// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.RepoService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RepoService.list */
class RepoListPage
private constructor(
    private val service: RepoService,
    private val params: RepoListParams,
    private val response: RepoListPageResponse,
) : Page<RepoWithLookups> {

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

    override fun nextPage(): RepoListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<RepoWithLookups> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RepoListParams = params

    /** The response that this page was parsed from. */
    fun response(): RepoListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RepoListPage].
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

    /** A builder for [RepoListPage]. */
    class Builder internal constructor() {

        private var service: RepoService? = null
        private var params: RepoListParams? = null
        private var response: RepoListPageResponse? = null

        @JvmSynthetic
        internal fun from(repoListPage: RepoListPage) = apply {
            service = repoListPage.service
            params = repoListPage.params
            response = repoListPage.response
        }

        fun service(service: RepoService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RepoListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RepoListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RepoListPage].
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
        fun build(): RepoListPage =
            RepoListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RepoListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "RepoListPage{service=$service, params=$params, response=$response}"
}
