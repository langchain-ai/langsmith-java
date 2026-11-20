// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspacesecrets

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.WorkspaceSecretService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see WorkspaceSecretService.list */
class WorkspaceSecretListPage
private constructor(
    private val service: WorkspaceSecretService,
    private val params: WorkspaceSecretListParams,
    private val response: WorkspaceSecretListPageResponse,
) : Page<WorkspaceSecret> {

    /**
     * Delegates to [WorkspaceSecretListPageResponse], but gracefully handles missing data.
     *
     * @see WorkspaceSecretListPageResponse.items
     */
    override fun items(): List<WorkspaceSecret> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [WorkspaceSecretListPageResponse], but gracefully handles missing data.
     *
     * @see WorkspaceSecretListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): WorkspaceSecretListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): WorkspaceSecretListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<WorkspaceSecret> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WorkspaceSecretListParams = params

    /** The response that this page was parsed from. */
    fun response(): WorkspaceSecretListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WorkspaceSecretListPage].
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

    /** A builder for [WorkspaceSecretListPage]. */
    class Builder internal constructor() {

        private var service: WorkspaceSecretService? = null
        private var params: WorkspaceSecretListParams? = null
        private var response: WorkspaceSecretListPageResponse? = null

        @JvmSynthetic
        internal fun from(workspaceSecretListPage: WorkspaceSecretListPage) = apply {
            service = workspaceSecretListPage.service
            params = workspaceSecretListPage.params
            response = workspaceSecretListPage.response
        }

        fun service(service: WorkspaceSecretService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WorkspaceSecretListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WorkspaceSecretListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WorkspaceSecretListPage].
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
        fun build(): WorkspaceSecretListPage =
            WorkspaceSecretListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WorkspaceSecretListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "WorkspaceSecretListPage{service=$service, params=$params, response=$response}"
}
