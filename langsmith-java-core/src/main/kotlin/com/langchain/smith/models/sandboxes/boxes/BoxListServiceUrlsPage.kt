// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.sandboxes.BoxService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see BoxService.listServiceUrls */
class BoxListServiceUrlsPage
private constructor(
    private val service: BoxService,
    private val params: BoxListServiceUrlsParams,
    private val response: BoxListServiceUrlsPageResponse,
) : Page<BoxListServiceUrlsResponse> {

    /**
     * Delegates to [BoxListServiceUrlsPageResponse], but gracefully handles missing data.
     *
     * @see BoxListServiceUrlsPageResponse.items
     */
    override fun items(): List<BoxListServiceUrlsResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [BoxListServiceUrlsPageResponse], but gracefully handles missing data.
     *
     * @see BoxListServiceUrlsPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): BoxListServiceUrlsParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): BoxListServiceUrlsPage = service.listServiceUrls(nextPageParams())

    fun autoPager(): AutoPager<BoxListServiceUrlsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BoxListServiceUrlsParams = params

    /** The response that this page was parsed from. */
    fun response(): BoxListServiceUrlsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BoxListServiceUrlsPage].
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

    /** A builder for [BoxListServiceUrlsPage]. */
    class Builder internal constructor() {

        private var service: BoxService? = null
        private var params: BoxListServiceUrlsParams? = null
        private var response: BoxListServiceUrlsPageResponse? = null

        @JvmSynthetic
        internal fun from(boxListServiceUrlsPage: BoxListServiceUrlsPage) = apply {
            service = boxListServiceUrlsPage.service
            params = boxListServiceUrlsPage.params
            response = boxListServiceUrlsPage.response
        }

        fun service(service: BoxService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BoxListServiceUrlsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BoxListServiceUrlsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BoxListServiceUrlsPage].
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
        fun build(): BoxListServiceUrlsPage =
            BoxListServiceUrlsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BoxListServiceUrlsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BoxListServiceUrlsPage{service=$service, params=$params, response=$response}"
}
