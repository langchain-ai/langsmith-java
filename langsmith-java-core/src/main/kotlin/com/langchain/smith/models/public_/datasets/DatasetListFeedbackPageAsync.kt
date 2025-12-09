// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.services.async.public_.DatasetServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see DatasetServiceAsync.listFeedback */
class DatasetListFeedbackPageAsync
private constructor(
    private val service: DatasetServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DatasetListFeedbackParams,
    private val items: List<FeedbackSchema>,
) : PageAsync<FeedbackSchema> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatasetListFeedbackParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<DatasetListFeedbackPageAsync> =
        service.listFeedback(nextPageParams())

    fun autoPager(): AutoPagerAsync<FeedbackSchema> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DatasetListFeedbackParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<FeedbackSchema> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetListFeedbackPageAsync].
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

    /** A builder for [DatasetListFeedbackPageAsync]. */
    class Builder internal constructor() {

        private var service: DatasetServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DatasetListFeedbackParams? = null
        private var items: List<FeedbackSchema>? = null

        @JvmSynthetic
        internal fun from(datasetListFeedbackPageAsync: DatasetListFeedbackPageAsync) = apply {
            service = datasetListFeedbackPageAsync.service
            streamHandlerExecutor = datasetListFeedbackPageAsync.streamHandlerExecutor
            params = datasetListFeedbackPageAsync.params
            items = datasetListFeedbackPageAsync.items
        }

        fun service(service: DatasetServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetListFeedbackParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<FeedbackSchema>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DatasetListFeedbackPageAsync].
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
        fun build(): DatasetListFeedbackPageAsync =
            DatasetListFeedbackPageAsync(
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

        return other is DatasetListFeedbackPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "DatasetListFeedbackPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
