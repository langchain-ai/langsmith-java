// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.snapshots

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.models.sandboxes.SnapshotListResponse
import com.langchain.smith.models.sandboxes.SnapshotResponse
import com.langchain.smith.services.blocking.sandboxes.SnapshotService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SnapshotService.list */
class SnapshotListPage
private constructor(
    private val service: SnapshotService,
    private val params: SnapshotListParams,
    private val response: SnapshotListResponse,
) : Page<SnapshotResponse> {

    /**
     * Delegates to [SnapshotListResponse], but gracefully handles missing data.
     *
     * @see SnapshotListResponse.items
     */
    override fun items(): List<SnapshotResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [SnapshotListResponse], but gracefully handles missing data.
     *
     * @see SnapshotListResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): SnapshotListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): SnapshotListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SnapshotResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SnapshotListParams = params

    /** The response that this page was parsed from. */
    fun response(): SnapshotListResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SnapshotListPage].
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

    /** A builder for [SnapshotListPage]. */
    class Builder internal constructor() {

        private var service: SnapshotService? = null
        private var params: SnapshotListParams? = null
        private var response: SnapshotListResponse? = null

        @JvmSynthetic
        internal fun from(snapshotListPage: SnapshotListPage) = apply {
            service = snapshotListPage.service
            params = snapshotListPage.params
            response = snapshotListPage.response
        }

        fun service(service: SnapshotService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SnapshotListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SnapshotListResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SnapshotListPage].
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
        fun build(): SnapshotListPage =
            SnapshotListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SnapshotListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SnapshotListPage{service=$service, params=$params, response=$response}"
}
