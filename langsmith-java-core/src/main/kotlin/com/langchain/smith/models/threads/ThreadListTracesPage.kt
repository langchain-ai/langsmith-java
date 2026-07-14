// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.ThreadService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ThreadService.listTraces */
class ThreadListTracesPage
private constructor(
    private val service: ThreadService,
    private val params: ThreadListTracesParams,
    private val response: ThreadListTracesPageResponse,
) : Page<ThreadTrace> {

    /**
     * Delegates to [ThreadListTracesPageResponse], but gracefully handles missing data.
     *
     * @see ThreadListTracesPageResponse.items
     */
    override fun items(): List<ThreadTrace> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ThreadListTracesPageResponse], but gracefully handles missing data.
     *
     * @see ThreadListTracesPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ThreadListTracesParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): ThreadListTracesPage = service.listTraces(nextPageParams())

    fun autoPager(): AutoPager<ThreadTrace> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ThreadListTracesParams = params

    /** The response that this page was parsed from. */
    fun response(): ThreadListTracesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ThreadListTracesPage].
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

    /** A builder for [ThreadListTracesPage]. */
    class Builder internal constructor() {

        private var service: ThreadService? = null
        private var params: ThreadListTracesParams? = null
        private var response: ThreadListTracesPageResponse? = null

        @JvmSynthetic
        internal fun from(threadListTracesPage: ThreadListTracesPage) = apply {
            service = threadListTracesPage.service
            params = threadListTracesPage.params
            response = threadListTracesPage.response
        }

        fun service(service: ThreadService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ThreadListTracesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ThreadListTracesPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ThreadListTracesPage].
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
        fun build(): ThreadListTracesPage =
            ThreadListTracesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThreadListTracesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ThreadListTracesPage{service=$service, params=$params, response=$response}"
}
