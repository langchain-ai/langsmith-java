// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.SessionService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SessionService.list */
class SessionListPage
private constructor(
    private val service: SessionService,
    private val params: SessionListParams,
    private val items: List<TracerSession>,
) : Page<TracerSession> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SessionListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): SessionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TracerSession> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SessionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<TracerSession> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SessionListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionListPage]. */
    class Builder internal constructor() {

        private var service: SessionService? = null
        private var params: SessionListParams? = null
        private var items: List<TracerSession>? = null

        @JvmSynthetic
        internal fun from(sessionListPage: SessionListPage) = apply {
            service = sessionListPage.service
            params = sessionListPage.params
            items = sessionListPage.items
        }

        fun service(service: SessionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SessionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<TracerSession>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SessionListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionListPage =
            SessionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "SessionListPage{service=$service, params=$params, items=$items}"
}
