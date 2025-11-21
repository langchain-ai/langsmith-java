// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.versions

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.models.datasets.DatasetVersion
import com.langchain.smith.services.async.datasets.VersionServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see VersionServiceAsync.list */
class VersionListPageAsync
private constructor(
    private val service: VersionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: VersionListParams,
    private val items: List<DatasetVersion>,
) : PageAsync<DatasetVersion> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): VersionListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<VersionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DatasetVersion> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): VersionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DatasetVersion> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VersionListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VersionListPageAsync]. */
    class Builder internal constructor() {

        private var service: VersionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: VersionListParams? = null
        private var items: List<DatasetVersion>? = null

        @JvmSynthetic
        internal fun from(versionListPageAsync: VersionListPageAsync) = apply {
            service = versionListPageAsync.service
            streamHandlerExecutor = versionListPageAsync.streamHandlerExecutor
            params = versionListPageAsync.params
            items = versionListPageAsync.items
        }

        fun service(service: VersionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: VersionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DatasetVersion>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [VersionListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VersionListPageAsync =
            VersionListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VersionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "VersionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
