// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.RunService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see RunService.query */
class RunQueryPage
private constructor(
    private val service: RunService,
    private val params: RunQueryParams,
    private val response: RunQueryPageResponse,
) : Page<RunSchema> {

    /**
     * Delegates to [RunQueryPageResponse], but gracefully handles missing data.
     *
     * @see RunQueryPageResponse.runs
     */
    fun runs(): List<RunSchema> = response._runs().getOptional("runs").getOrNull() ?: emptyList()

    /**
     * Delegates to [RunQueryPageResponse], but gracefully handles missing data.
     *
     * @see RunQueryPageResponse.cursors
     */
    fun cursors(): Optional<RunQueryPageResponse.Cursors> =
        response._cursors().getOptional("cursors")

    override fun items(): List<RunSchema> = runs()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && cursors().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): RunQueryParams {
        val nextCursor =
            cursors().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): RunQueryPage = service.query(nextPageParams())

    fun autoPager(): AutoPager<RunSchema> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RunQueryParams = params

    /** The response that this page was parsed from. */
    fun response(): RunQueryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunQueryPage].
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

    /** A builder for [RunQueryPage]. */
    class Builder internal constructor() {

        private var service: RunService? = null
        private var params: RunQueryParams? = null
        private var response: RunQueryPageResponse? = null

        @JvmSynthetic
        internal fun from(runQueryPage: RunQueryPage) = apply {
            service = runQueryPage.service
            params = runQueryPage.params
            response = runQueryPage.response
        }

        fun service(service: RunService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RunQueryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RunQueryPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RunQueryPage].
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
        fun build(): RunQueryPage =
            RunQueryPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunQueryPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "RunQueryPage{service=$service, params=$params, response=$response}"
}
