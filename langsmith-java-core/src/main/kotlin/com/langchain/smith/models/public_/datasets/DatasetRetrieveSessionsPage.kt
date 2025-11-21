// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.models.sessions.TracerSession
import com.langchain.smith.services.blocking.public_.DatasetService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DatasetService.retrieveSessions */
class DatasetRetrieveSessionsPage
private constructor(
    private val service: DatasetService,
    private val params: DatasetRetrieveSessionsParams,
    private val items: List<TracerSession>,
) : Page<TracerSession> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatasetRetrieveSessionsParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): DatasetRetrieveSessionsPage =
        service.retrieveSessions(nextPageParams())

    fun autoPager(): AutoPager<TracerSession> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DatasetRetrieveSessionsParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<TracerSession> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetRetrieveSessionsPage].
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

    /** A builder for [DatasetRetrieveSessionsPage]. */
    class Builder internal constructor() {

        private var service: DatasetService? = null
        private var params: DatasetRetrieveSessionsParams? = null
        private var items: List<TracerSession>? = null

        @JvmSynthetic
        internal fun from(datasetRetrieveSessionsPage: DatasetRetrieveSessionsPage) = apply {
            service = datasetRetrieveSessionsPage.service
            params = datasetRetrieveSessionsPage.params
            items = datasetRetrieveSessionsPage.items
        }

        fun service(service: DatasetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetRetrieveSessionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<TracerSession>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DatasetRetrieveSessionsPage].
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
        fun build(): DatasetRetrieveSessionsPage =
            DatasetRetrieveSessionsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetRetrieveSessionsPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "DatasetRetrieveSessionsPage{service=$service, params=$params, items=$items}"
}
