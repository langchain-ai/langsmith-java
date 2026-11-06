// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.DatasetService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DatasetService.listV1 */
@Deprecated("Use listV2 instead, which calls GET /api/v2/datasets and pages with a cursor.")
class DatasetListV1Page
private constructor(
    private val service: DatasetService,
    private val params: DatasetListV1Params,
    private val items: List<Dataset>,
) : Page<Dataset> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatasetListV1Params {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): DatasetListV1Page = service.listV1(nextPageParams())

    fun autoPager(): AutoPager<Dataset> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DatasetListV1Params = params

    /** The response that this page was parsed from. */
    override fun items(): List<Dataset> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetListV1Page].
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

    /** A builder for [DatasetListV1Page]. */
    class Builder internal constructor() {

        private var service: DatasetService? = null
        private var params: DatasetListV1Params? = null
        private var items: List<Dataset>? = null

        @JvmSynthetic
        internal fun from(datasetListV1Page: DatasetListV1Page) = apply {
            service = datasetListV1Page.service
            params = datasetListV1Page.params
            items = datasetListV1Page.items
        }

        fun service(service: DatasetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetListV1Params) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<Dataset>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DatasetListV1Page].
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
        fun build(): DatasetListV1Page =
            DatasetListV1Page(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetListV1Page &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "DatasetListV1Page{service=$service, params=$params, items=$items}"
}
