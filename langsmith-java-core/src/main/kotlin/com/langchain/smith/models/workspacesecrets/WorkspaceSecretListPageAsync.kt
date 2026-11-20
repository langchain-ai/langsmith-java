// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspacesecrets

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.WorkspaceSecretServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see WorkspaceSecretServiceAsync.list */
class WorkspaceSecretListPageAsync
private constructor(
    private val service: WorkspaceSecretServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WorkspaceSecretListParams,
    private val response: WorkspaceSecretListPageResponse,
) : PageAsync<WorkspaceSecret> {

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

    override fun nextPage(): CompletableFuture<WorkspaceSecretListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<WorkspaceSecret> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): WorkspaceSecretListParams = params

    /** The response that this page was parsed from. */
    fun response(): WorkspaceSecretListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WorkspaceSecretListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkspaceSecretListPageAsync]. */
    class Builder internal constructor() {

        private var service: WorkspaceSecretServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WorkspaceSecretListParams? = null
        private var response: WorkspaceSecretListPageResponse? = null

        @JvmSynthetic
        internal fun from(workspaceSecretListPageAsync: WorkspaceSecretListPageAsync) = apply {
            service = workspaceSecretListPageAsync.service
            streamHandlerExecutor = workspaceSecretListPageAsync.streamHandlerExecutor
            params = workspaceSecretListPageAsync.params
            response = workspaceSecretListPageAsync.response
        }

        fun service(service: WorkspaceSecretServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: WorkspaceSecretListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WorkspaceSecretListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WorkspaceSecretListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WorkspaceSecretListPageAsync =
            WorkspaceSecretListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WorkspaceSecretListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "WorkspaceSecretListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
