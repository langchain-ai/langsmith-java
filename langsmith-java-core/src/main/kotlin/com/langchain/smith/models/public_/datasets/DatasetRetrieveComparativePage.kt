// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.public_.DatasetService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DatasetService.retrieveComparative */
class DatasetRetrieveComparativePage
private constructor(
    private val service: DatasetService,
    private val params: DatasetRetrieveComparativeParams,
    private val items: List<DatasetRetrieveComparativeResponse>,
) : Page<DatasetRetrieveComparativeResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatasetRetrieveComparativeParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): DatasetRetrieveComparativePage =
        service.retrieveComparative(nextPageParams())

    fun autoPager(): AutoPager<DatasetRetrieveComparativeResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DatasetRetrieveComparativeParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DatasetRetrieveComparativeResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DatasetRetrieveComparativePage].
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

    /** A builder for [DatasetRetrieveComparativePage]. */
    class Builder internal constructor() {

        private var service: DatasetService? = null
        private var params: DatasetRetrieveComparativeParams? = null
        private var items: List<DatasetRetrieveComparativeResponse>? = null

        @JvmSynthetic
        internal fun from(datasetRetrieveComparativePage: DatasetRetrieveComparativePage) = apply {
            service = datasetRetrieveComparativePage.service
            params = datasetRetrieveComparativePage.params
            items = datasetRetrieveComparativePage.items
        }

        fun service(service: DatasetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetRetrieveComparativeParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DatasetRetrieveComparativeResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DatasetRetrieveComparativePage].
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
        fun build(): DatasetRetrieveComparativePage =
            DatasetRetrieveComparativePage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetRetrieveComparativePage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "DatasetRetrieveComparativePage{service=$service, params=$params, items=$items}"
}
