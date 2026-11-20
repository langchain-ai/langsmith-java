// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.volumes

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.sandboxes.VolumeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see VolumeServiceAsync.list */
class VolumeListPageAsync
private constructor(
    private val service: VolumeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: VolumeListParams,
    private val response: VolumeListPageResponse,
) : PageAsync<VolumeResponse> {

    /**
     * Delegates to [VolumeListPageResponse], but gracefully handles missing data.
     *
     * @see VolumeListPageResponse.items
     */
    override fun items(): List<VolumeResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [VolumeListPageResponse], but gracefully handles missing data.
     *
     * @see VolumeListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): VolumeListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<VolumeListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VolumeResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): VolumeListParams = params

    /** The response that this page was parsed from. */
    fun response(): VolumeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VolumeListPageAsync].
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

    /** A builder for [VolumeListPageAsync]. */
    class Builder internal constructor() {

        private var service: VolumeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: VolumeListParams? = null
        private var response: VolumeListPageResponse? = null

        @JvmSynthetic
        internal fun from(volumeListPageAsync: VolumeListPageAsync) = apply {
            service = volumeListPageAsync.service
            streamHandlerExecutor = volumeListPageAsync.streamHandlerExecutor
            params = volumeListPageAsync.params
            response = volumeListPageAsync.response
        }

        fun service(service: VolumeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: VolumeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VolumeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VolumeListPageAsync].
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
        fun build(): VolumeListPageAsync =
            VolumeListPageAsync(
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

        return other is VolumeListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "VolumeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
