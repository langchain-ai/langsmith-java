// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.comparative

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.datasets.ComparativeService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see ComparativeService.list */
class ComparativeListPage
private constructor(
    private val service: ComparativeService,
    private val params: ComparativeListParams,
    private val items: List<ComparativeListResponse>,
) : Page<ComparativeListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ComparativeListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): ComparativeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ComparativeListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ComparativeListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<ComparativeListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ComparativeListPage].
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

    /** A builder for [ComparativeListPage]. */
    class Builder internal constructor() {

        private var service: ComparativeService? = null
        private var params: ComparativeListParams? = null
        private var items: List<ComparativeListResponse>? = null

        @JvmSynthetic
        internal fun from(comparativeListPage: ComparativeListPage) = apply {
            service = comparativeListPage.service
            params = comparativeListPage.params
            items = comparativeListPage.items
        }

        fun service(service: ComparativeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ComparativeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<ComparativeListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ComparativeListPage].
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
        fun build(): ComparativeListPage =
            ComparativeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ComparativeListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "ComparativeListPage{service=$service, params=$params, items=$items}"
}
