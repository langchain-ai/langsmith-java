// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.models.sessions.TracerSession
import com.langchain.smith.services.blocking.public_.DatasetService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DatasetService.listSessions */
class DatasetListSessionsPage
private constructor(
    private val service: DatasetService,
    private val params: DatasetListSessionsParams,
    private val items: List<TracerSession>,
) : Page<TracerSession> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatasetListSessionsParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): DatasetListSessionsPage = service.listSessions(nextPageParams())

    fun autoPager(): AutoPager<TracerSession> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DatasetListSessionsParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<TracerSession> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetListSessionsPage].
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

    /** A builder for [DatasetListSessionsPage]. */
    class Builder internal constructor() {

        private var service: DatasetService? = null
        private var params: DatasetListSessionsParams? = null
        private var items: List<TracerSession>? = null

        @JvmSynthetic
        internal fun from(datasetListSessionsPage: DatasetListSessionsPage) = apply {
            service = datasetListSessionsPage.service
            params = datasetListSessionsPage.params
            items = datasetListSessionsPage.items
        }

        fun service(service: DatasetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetListSessionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<TracerSession>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DatasetListSessionsPage].
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
        fun build(): DatasetListSessionsPage =
            DatasetListSessionsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetListSessionsPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "DatasetListSessionsPage{service=$service, params=$params, items=$items}"
}
