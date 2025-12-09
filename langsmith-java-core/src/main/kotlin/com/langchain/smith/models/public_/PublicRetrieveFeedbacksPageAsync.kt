// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.services.async.PublicServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see PublicServiceAsync.retrieveFeedbacks */
class PublicRetrieveFeedbacksPageAsync
private constructor(
    private val service: PublicServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PublicRetrieveFeedbacksParams,
    private val items: List<FeedbackSchema>,
) : PageAsync<FeedbackSchema> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PublicRetrieveFeedbacksParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<PublicRetrieveFeedbacksPageAsync> =
        service.retrieveFeedbacks(nextPageParams())

    fun autoPager(): AutoPagerAsync<FeedbackSchema> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PublicRetrieveFeedbacksParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<FeedbackSchema> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PublicRetrieveFeedbacksPageAsync].
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

    /** A builder for [PublicRetrieveFeedbacksPageAsync]. */
    class Builder internal constructor() {

        private var service: PublicServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PublicRetrieveFeedbacksParams? = null
        private var items: List<FeedbackSchema>? = null

        @JvmSynthetic
        internal fun from(publicRetrieveFeedbacksPageAsync: PublicRetrieveFeedbacksPageAsync) =
            apply {
                service = publicRetrieveFeedbacksPageAsync.service
                streamHandlerExecutor = publicRetrieveFeedbacksPageAsync.streamHandlerExecutor
                params = publicRetrieveFeedbacksPageAsync.params
                items = publicRetrieveFeedbacksPageAsync.items
            }

        fun service(service: PublicServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PublicRetrieveFeedbacksParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<FeedbackSchema>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PublicRetrieveFeedbacksPageAsync].
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
        fun build(): PublicRetrieveFeedbacksPageAsync =
            PublicRetrieveFeedbacksPageAsync(
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

        return other is PublicRetrieveFeedbacksPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "PublicRetrieveFeedbacksPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
