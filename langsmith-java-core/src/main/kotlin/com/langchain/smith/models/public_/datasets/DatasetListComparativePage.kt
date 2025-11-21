// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.public_.DatasetService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DatasetService.listComparative */
class DatasetListComparativePage
private constructor(
    private val service: DatasetService,
    private val params: DatasetListComparativeParams,
    private val items: List<DatasetListComparativeResponse>,
) : Page<DatasetListComparativeResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatasetListComparativeParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): DatasetListComparativePage = service.listComparative(nextPageParams())

    fun autoPager(): AutoPager<DatasetListComparativeResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DatasetListComparativeParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DatasetListComparativeResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetListComparativePage].
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

    /** A builder for [DatasetListComparativePage]. */
    class Builder internal constructor() {

        private var service: DatasetService? = null
        private var params: DatasetListComparativeParams? = null
        private var items: List<DatasetListComparativeResponse>? = null

        @JvmSynthetic
        internal fun from(datasetListComparativePage: DatasetListComparativePage) = apply {
            service = datasetListComparativePage.service
            params = datasetListComparativePage.params
            items = datasetListComparativePage.items
        }

        fun service(service: DatasetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetListComparativeParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DatasetListComparativeResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DatasetListComparativePage].
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
        fun build(): DatasetListComparativePage =
            DatasetListComparativePage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetListComparativePage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "DatasetListComparativePage{service=$service, params=$params, items=$items}"
}
