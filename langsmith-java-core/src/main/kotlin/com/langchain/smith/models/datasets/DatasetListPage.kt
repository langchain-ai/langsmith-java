// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.DatasetService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DatasetService.list */
class DatasetListPage
private constructor(
    private val service: DatasetService,
    private val params: DatasetListParams,
    private val items: List<Dataset>,
) : Page<Dataset> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatasetListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): DatasetListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Dataset> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DatasetListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Dataset> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetListPage].
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

    /** A builder for [DatasetListPage]. */
    class Builder internal constructor() {

        private var service: DatasetService? = null
        private var params: DatasetListParams? = null
        private var items: List<Dataset>? = null

        @JvmSynthetic
        internal fun from(datasetListPage: DatasetListPage) = apply {
            service = datasetListPage.service
            params = datasetListPage.params
            items = datasetListPage.items
        }

        fun service(service: DatasetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<Dataset>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DatasetListPage].
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
        fun build(): DatasetListPage =
            DatasetListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "DatasetListPage{service=$service, params=$params, items=$items}"
}
