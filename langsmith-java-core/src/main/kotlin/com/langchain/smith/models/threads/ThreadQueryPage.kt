// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.ThreadService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ThreadService.query */
class ThreadQueryPage
private constructor(
    private val service: ThreadService,
    private val params: ThreadQueryParams,
    private val response: ThreadQueryPageResponse,
) : Page<Thread> {

    /**
     * Delegates to [ThreadQueryPageResponse], but gracefully handles missing data.
     *
     * @see ThreadQueryPageResponse.items
     */
    override fun items(): List<Thread> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [ThreadQueryPageResponse], but gracefully handles missing data.
     *
     * @see ThreadQueryPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): ThreadQueryParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): ThreadQueryPage = service.query(nextPageParams())

    fun autoPager(): AutoPager<Thread> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ThreadQueryParams = params

    /** The response that this page was parsed from. */
    fun response(): ThreadQueryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ThreadQueryPage].
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

    /** A builder for [ThreadQueryPage]. */
    class Builder internal constructor() {

        private var service: ThreadService? = null
        private var params: ThreadQueryParams? = null
        private var response: ThreadQueryPageResponse? = null

        @JvmSynthetic
        internal fun from(threadQueryPage: ThreadQueryPage) = apply {
            service = threadQueryPage.service
            params = threadQueryPage.params
            response = threadQueryPage.response
        }

        fun service(service: ThreadService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ThreadQueryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ThreadQueryPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ThreadQueryPage].
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
        fun build(): ThreadQueryPage =
            ThreadQueryPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThreadQueryPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ThreadQueryPage{service=$service, params=$params, response=$response}"
}
