// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.AnnotationQueueService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see AnnotationQueueService.retrieveAnnotationQueues */
class AnnotationQueueRetrieveAnnotationQueuesPage
private constructor(
    private val service: AnnotationQueueService,
    private val params: AnnotationQueueRetrieveAnnotationQueuesParams,
    private val items: List<AnnotationQueueRetrieveAnnotationQueuesResponse>,
) : Page<AnnotationQueueRetrieveAnnotationQueuesResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AnnotationQueueRetrieveAnnotationQueuesParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): AnnotationQueueRetrieveAnnotationQueuesPage =
        service.retrieveAnnotationQueues(nextPageParams())

    fun autoPager(): AutoPager<AnnotationQueueRetrieveAnnotationQueuesResponse> =
        AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AnnotationQueueRetrieveAnnotationQueuesParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<AnnotationQueueRetrieveAnnotationQueuesResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AnnotationQueueRetrieveAnnotationQueuesPage].
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

    /** A builder for [AnnotationQueueRetrieveAnnotationQueuesPage]. */
    class Builder internal constructor() {

        private var service: AnnotationQueueService? = null
        private var params: AnnotationQueueRetrieveAnnotationQueuesParams? = null
        private var items: List<AnnotationQueueRetrieveAnnotationQueuesResponse>? = null

        @JvmSynthetic
        internal fun from(
            annotationQueueRetrieveAnnotationQueuesPage: AnnotationQueueRetrieveAnnotationQueuesPage
        ) = apply {
            service = annotationQueueRetrieveAnnotationQueuesPage.service
            params = annotationQueueRetrieveAnnotationQueuesPage.params
            items = annotationQueueRetrieveAnnotationQueuesPage.items
        }

        fun service(service: AnnotationQueueService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AnnotationQueueRetrieveAnnotationQueuesParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun items(items: List<AnnotationQueueRetrieveAnnotationQueuesResponse>) = apply {
            this.items = items
        }

        /**
         * Returns an immutable instance of [AnnotationQueueRetrieveAnnotationQueuesPage].
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
        fun build(): AnnotationQueueRetrieveAnnotationQueuesPage =
            AnnotationQueueRetrieveAnnotationQueuesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnnotationQueueRetrieveAnnotationQueuesPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "AnnotationQueueRetrieveAnnotationQueuesPage{service=$service, params=$params, items=$items}"
}
