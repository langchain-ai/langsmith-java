// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.DatasetService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see DatasetService.listV2 */
class DatasetListV2Page
private constructor(
    private val service: DatasetService,
    private val params: DatasetListV2Params,
    private val response: DatasetListV2PageResponse,
) : Page<Dataset> {

    /**
     * Delegates to [DatasetListV2PageResponse], but gracefully handles missing data.
     *
     * @see DatasetListV2PageResponse.items
     */
    override fun items(): List<Dataset> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [DatasetListV2PageResponse], but gracefully handles missing data.
     *
     * @see DatasetListV2PageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): DatasetListV2Params {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): DatasetListV2Page = service.listV2(nextPageParams())

    fun autoPager(): AutoPager<Dataset> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DatasetListV2Params = params

    /** The response that this page was parsed from. */
    fun response(): DatasetListV2PageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetListV2Page].
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

    /** A builder for [DatasetListV2Page]. */
    class Builder internal constructor() {

        private var service: DatasetService? = null
        private var params: DatasetListV2Params? = null
        private var response: DatasetListV2PageResponse? = null

        @JvmSynthetic
        internal fun from(datasetListV2Page: DatasetListV2Page) = apply {
            service = datasetListV2Page.service
            params = datasetListV2Page.params
            response = datasetListV2Page.response
        }

        fun service(service: DatasetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetListV2Params) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DatasetListV2PageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DatasetListV2Page].
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
        fun build(): DatasetListV2Page =
            DatasetListV2Page(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetListV2Page &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DatasetListV2Page{service=$service, params=$params, response=$response}"
}
