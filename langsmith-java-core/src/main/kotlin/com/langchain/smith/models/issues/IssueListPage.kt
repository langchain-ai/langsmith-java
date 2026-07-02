// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.issues

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.IssueService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see IssueService.list */
class IssueListPage
private constructor(
    private val service: IssueService,
    private val params: IssueListParams,
    private val items: List<Issue>,
) : Page<Issue> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): IssueListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): IssueListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Issue> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): IssueListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Issue> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IssueListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IssueListPage]. */
    class Builder internal constructor() {

        private var service: IssueService? = null
        private var params: IssueListParams? = null
        private var items: List<Issue>? = null

        @JvmSynthetic
        internal fun from(issueListPage: IssueListPage) = apply {
            service = issueListPage.service
            params = issueListPage.params
            items = issueListPage.items
        }

        fun service(service: IssueService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IssueListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<Issue>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [IssueListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IssueListPage =
            IssueListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IssueListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "IssueListPage{service=$service, params=$params, items=$items}"
}
