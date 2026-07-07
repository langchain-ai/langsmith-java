// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.traces

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.TraceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see TraceService.query */
class TraceQueryPage
private constructor(
    private val service: TraceService,
    private val params: TraceQueryParams,
    private val response: TraceQueryPageResponse,
) : Page<Trace> {

    /**
     * Delegates to [TraceQueryPageResponse], but gracefully handles missing data.
     *
     * @see TraceQueryPageResponse.items
     */
    override fun items(): List<Trace> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [TraceQueryPageResponse], but gracefully handles missing data.
     *
     * @see TraceQueryPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): TraceQueryParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): TraceQueryPage = service.query(nextPageParams())

    fun autoPager(): AutoPager<Trace> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TraceQueryParams = params

    /** The response that this page was parsed from. */
    fun response(): TraceQueryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TraceQueryPage].
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

    /** A builder for [TraceQueryPage]. */
    class Builder internal constructor() {

        private var service: TraceService? = null
        private var params: TraceQueryParams? = null
        private var response: TraceQueryPageResponse? = null

        @JvmSynthetic
        internal fun from(traceQueryPage: TraceQueryPage) = apply {
            service = traceQueryPage.service
            params = traceQueryPage.params
            response = traceQueryPage.response
        }

        fun service(service: TraceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TraceQueryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TraceQueryPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TraceQueryPage].
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
        fun build(): TraceQueryPage =
            TraceQueryPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TraceQueryPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "TraceQueryPage{service=$service, params=$params, response=$response}"
}
