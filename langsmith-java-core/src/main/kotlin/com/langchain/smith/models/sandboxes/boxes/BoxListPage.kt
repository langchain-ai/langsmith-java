// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.models.sandboxes.SandboxListResponse
import com.langchain.smith.models.sandboxes.SandboxResponse
import com.langchain.smith.services.blocking.sandboxes.BoxService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see BoxService.list */
class BoxListPage
private constructor(
    private val service: BoxService,
    private val params: BoxListParams,
    private val response: SandboxListResponse,
) : Page<SandboxResponse> {

    /**
     * Delegates to [SandboxListResponse], but gracefully handles missing data.
     *
     * @see SandboxListResponse.items
     */
    override fun items(): List<SandboxResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [SandboxListResponse], but gracefully handles missing data.
     *
     * @see SandboxListResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): BoxListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): BoxListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SandboxResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BoxListParams = params

    /** The response that this page was parsed from. */
    fun response(): SandboxListResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BoxListPage].
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

    /** A builder for [BoxListPage]. */
    class Builder internal constructor() {

        private var service: BoxService? = null
        private var params: BoxListParams? = null
        private var response: SandboxListResponse? = null

        @JvmSynthetic
        internal fun from(boxListPage: BoxListPage) = apply {
            service = boxListPage.service
            params = boxListPage.params
            response = boxListPage.response
        }

        fun service(service: BoxService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BoxListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SandboxListResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BoxListPage].
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
        fun build(): BoxListPage =
            BoxListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BoxListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "BoxListPage{service=$service, params=$params, response=$response}"
}
