// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.SandboxService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SandboxService.listUsageCosts */
class SandboxListUsageCostsPage
private constructor(
    private val service: SandboxService,
    private val params: SandboxListUsageCostsParams,
    private val response: SandboxListUsageCostsPageResponse,
) : Page<SandboxListUsageCostsResponse> {

    /**
     * Delegates to [SandboxListUsageCostsPageResponse], but gracefully handles missing data.
     *
     * @see SandboxListUsageCostsPageResponse.items
     */
    override fun items(): List<SandboxListUsageCostsResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [SandboxListUsageCostsPageResponse], but gracefully handles missing data.
     *
     * @see SandboxListUsageCostsPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): SandboxListUsageCostsParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): SandboxListUsageCostsPage = service.listUsageCosts(nextPageParams())

    fun autoPager(): AutoPager<SandboxListUsageCostsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SandboxListUsageCostsParams = params

    /** The response that this page was parsed from. */
    fun response(): SandboxListUsageCostsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SandboxListUsageCostsPage].
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

    /** A builder for [SandboxListUsageCostsPage]. */
    class Builder internal constructor() {

        private var service: SandboxService? = null
        private var params: SandboxListUsageCostsParams? = null
        private var response: SandboxListUsageCostsPageResponse? = null

        @JvmSynthetic
        internal fun from(sandboxListUsageCostsPage: SandboxListUsageCostsPage) = apply {
            service = sandboxListUsageCostsPage.service
            params = sandboxListUsageCostsPage.params
            response = sandboxListUsageCostsPage.response
        }

        fun service(service: SandboxService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SandboxListUsageCostsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SandboxListUsageCostsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SandboxListUsageCostsPage].
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
        fun build(): SandboxListUsageCostsPage =
            SandboxListUsageCostsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SandboxListUsageCostsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SandboxListUsageCostsPage{service=$service, params=$params, response=$response}"
}
