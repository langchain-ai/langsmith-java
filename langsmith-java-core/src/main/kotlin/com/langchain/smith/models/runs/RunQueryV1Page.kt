// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.RunService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see RunService.queryV1 */
class RunQueryV1Page
private constructor(
    private val service: RunService,
    private val params: RunQueryV1Params,
    private val response: RunQueryV1PageResponse,
) : Page<RunSchema> {

    /**
     * Delegates to [RunQueryV1PageResponse], but gracefully handles missing data.
     *
     * @see RunQueryV1PageResponse.runs
     */
    fun runs(): List<RunSchema> = response._runs().getOptional("runs").getOrNull() ?: emptyList()

    /**
     * Delegates to [RunQueryV1PageResponse], but gracefully handles missing data.
     *
     * @see RunQueryV1PageResponse.cursors
     */
    fun cursors(): Optional<RunQueryV1PageResponse.Cursors> =
        response._cursors().getOptional("cursors")

    override fun items(): List<RunSchema> = runs()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() && cursors().flatMap { it._next().getOptional("next") }.isPresent

    fun nextPageParams(): RunQueryV1Params {
        val nextCursor =
            cursors().flatMap { it._next().getOptional("next") }.getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): RunQueryV1Page = service.queryV1(nextPageParams())

    fun autoPager(): AutoPager<RunSchema> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RunQueryV1Params = params

    /** The response that this page was parsed from. */
    fun response(): RunQueryV1PageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunQueryV1Page].
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

    /** A builder for [RunQueryV1Page]. */
    class Builder internal constructor() {

        private var service: RunService? = null
        private var params: RunQueryV1Params? = null
        private var response: RunQueryV1PageResponse? = null

        @JvmSynthetic
        internal fun from(runQueryV1Page: RunQueryV1Page) = apply {
            service = runQueryV1Page.service
            params = runQueryV1Page.params
            response = runQueryV1Page.response
        }

        fun service(service: RunService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RunQueryV1Params) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RunQueryV1PageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RunQueryV1Page].
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
        fun build(): RunQueryV1Page =
            RunQueryV1Page(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunQueryV1Page &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "RunQueryV1Page{service=$service, params=$params, response=$response}"
}
