// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import com.langchain.smith.core.AutoPagerAsync
import com.langchain.smith.core.PageAsync
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.async.AnnotationQueueServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see AnnotationQueueServiceAsync.retrieveAnnotationQueues */
class AnnotationQueueRetrieveAnnotationQueuesPageAsync
private constructor(
    private val service: AnnotationQueueServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AnnotationQueueRetrieveAnnotationQueuesParams,
    private val items: List<AnnotationQueueRetrieveAnnotationQueuesResponse>,
) : PageAsync<AnnotationQueueRetrieveAnnotationQueuesResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AnnotationQueueRetrieveAnnotationQueuesParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): CompletableFuture<AnnotationQueueRetrieveAnnotationQueuesPageAsync> =
        service.retrieveAnnotationQueues(nextPageParams())

    fun autoPager(): AutoPagerAsync<AnnotationQueueRetrieveAnnotationQueuesResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AnnotationQueueRetrieveAnnotationQueuesParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AnnotationQueueRetrieveAnnotationQueuesResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AnnotationQueueRetrieveAnnotationQueuesPageAsync].
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

    /** A builder for [AnnotationQueueRetrieveAnnotationQueuesPageAsync]. */
    class Builder internal constructor() {

        private var service: AnnotationQueueServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AnnotationQueueRetrieveAnnotationQueuesParams? = null
        private var items: List<AnnotationQueueRetrieveAnnotationQueuesResponse>? = null

        @JvmSynthetic
        internal fun from(
            annotationQueueRetrieveAnnotationQueuesPageAsync:
                AnnotationQueueRetrieveAnnotationQueuesPageAsync
        ) = apply {
            service = annotationQueueRetrieveAnnotationQueuesPageAsync.service
            streamHandlerExecutor =
                annotationQueueRetrieveAnnotationQueuesPageAsync.streamHandlerExecutor
            params = annotationQueueRetrieveAnnotationQueuesPageAsync.params
            items = annotationQueueRetrieveAnnotationQueuesPageAsync.items
        }

        fun service(service: AnnotationQueueServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AnnotationQueueRetrieveAnnotationQueuesParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun items(items: List<AnnotationQueueRetrieveAnnotationQueuesResponse>) = apply {
            this.items = items
        }

        /**
         * Returns an immutable instance of [AnnotationQueueRetrieveAnnotationQueuesPageAsync].
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
        fun build(): AnnotationQueueRetrieveAnnotationQueuesPageAsync =
            AnnotationQueueRetrieveAnnotationQueuesPageAsync(
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

        return other is AnnotationQueueRetrieveAnnotationQueuesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "AnnotationQueueRetrieveAnnotationQueuesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
