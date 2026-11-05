// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.SessionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SessionService.listV2 */
class SessionListV2Page
private constructor(
    private val service: SessionService,
    private val params: SessionListV2Params,
    private val response: SessionListV2PageResponse,
) : Page<Session> {

    /**
     * Delegates to [SessionListV2PageResponse], but gracefully handles missing data.
     *
     * @see SessionListV2PageResponse.items
     */
    override fun items(): List<Session> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [SessionListV2PageResponse], but gracefully handles missing data.
     *
     * @see SessionListV2PageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): SessionListV2Params {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): SessionListV2Page = service.listV2(nextPageParams())

    fun autoPager(): AutoPager<Session> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SessionListV2Params = params

    /** The response that this page was parsed from. */
    fun response(): SessionListV2PageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SessionListV2Page].
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

    /** A builder for [SessionListV2Page]. */
    class Builder internal constructor() {

        private var service: SessionService? = null
        private var params: SessionListV2Params? = null
        private var response: SessionListV2PageResponse? = null

        @JvmSynthetic
        internal fun from(sessionListV2Page: SessionListV2Page) = apply {
            service = sessionListV2Page.service
            params = sessionListV2Page.params
            response = sessionListV2Page.response
        }

        fun service(service: SessionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SessionListV2Params) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SessionListV2PageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SessionListV2Page].
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
        fun build(): SessionListV2Page =
            SessionListV2Page(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionListV2Page &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SessionListV2Page{service=$service, params=$params, response=$response}"
}
