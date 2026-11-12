// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.SessionService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see SessionService.listV1 */
@Deprecated(
    "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. The v1 endpoint is scheduled for removal on Jul 1, 2027."
)
class SessionListV1Page
private constructor(
    private val service: SessionService,
    private val params: SessionListV1Params,
    private val items: List<TracerSession>,
) : Page<TracerSession> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SessionListV1Params {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): SessionListV1Page = service.listV1(nextPageParams())

    fun autoPager(): AutoPager<TracerSession> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SessionListV1Params = params

    /** The response that this page was parsed from. */
    override fun items(): List<TracerSession> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SessionListV1Page].
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

    /** A builder for [SessionListV1Page]. */
    class Builder internal constructor() {

        private var service: SessionService? = null
        private var params: SessionListV1Params? = null
        private var items: List<TracerSession>? = null

        @JvmSynthetic
        internal fun from(sessionListV1Page: SessionListV1Page) = apply {
            service = sessionListV1Page.service
            params = sessionListV1Page.params
            items = sessionListV1Page.items
        }

        fun service(service: SessionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SessionListV1Params) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<TracerSession>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [SessionListV1Page].
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
        fun build(): SessionListV1Page =
            SessionListV1Page(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionListV1Page &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "SessionListV1Page{service=$service, params=$params, items=$items}"
}
