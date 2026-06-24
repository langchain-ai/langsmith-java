// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.RunService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see RunService.queryV2 */
class RunQueryV2Page
private constructor(
    private val service: RunService,
    private val params: RunQueryV2Params,
    private val response: RunQueryV2PageResponse,
) : Page<QueryRunResponse> {

    /**
     * Delegates to [RunQueryV2PageResponse], but gracefully handles missing data.
     *
     * @see RunQueryV2PageResponse.items
     */
    override fun items(): List<QueryRunResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [RunQueryV2PageResponse], but gracefully handles missing data.
     *
     * @see RunQueryV2PageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): RunQueryV2Params {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): RunQueryV2Page = service.queryV2(nextPageParams())

    fun autoPager(): AutoPager<QueryRunResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RunQueryV2Params = params

    /** The response that this page was parsed from. */
    fun response(): RunQueryV2PageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunQueryV2Page].
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

    /** A builder for [RunQueryV2Page]. */
    class Builder internal constructor() {

        private var service: RunService? = null
        private var params: RunQueryV2Params? = null
        private var response: RunQueryV2PageResponse? = null

        @JvmSynthetic
        internal fun from(runQueryV2Page: RunQueryV2Page) = apply {
            service = runQueryV2Page.service
            params = runQueryV2Page.params
            response = runQueryV2Page.response
        }

        fun service(service: RunService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RunQueryV2Params) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RunQueryV2PageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RunQueryV2Page].
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
        fun build(): RunQueryV2Page =
            RunQueryV2Page(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunQueryV2Page &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "RunQueryV2Page{service=$service, params=$params, response=$response}"
}
