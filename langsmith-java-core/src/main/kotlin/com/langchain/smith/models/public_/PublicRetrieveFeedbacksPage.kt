// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.services.blocking.PublicService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see PublicService.retrieveFeedbacks */
class PublicRetrieveFeedbacksPage
private constructor(
    private val service: PublicService,
    private val params: PublicRetrieveFeedbacksParams,
    private val items: List<FeedbackSchema>,
) : Page<FeedbackSchema> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PublicRetrieveFeedbacksParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): PublicRetrieveFeedbacksPage =
        service.retrieveFeedbacks(nextPageParams())

    fun autoPager(): AutoPager<FeedbackSchema> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PublicRetrieveFeedbacksParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<FeedbackSchema> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PublicRetrieveFeedbacksPage].
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

    /** A builder for [PublicRetrieveFeedbacksPage]. */
    class Builder internal constructor() {

        private var service: PublicService? = null
        private var params: PublicRetrieveFeedbacksParams? = null
        private var items: List<FeedbackSchema>? = null

        @JvmSynthetic
        internal fun from(publicRetrieveFeedbacksPage: PublicRetrieveFeedbacksPage) = apply {
            service = publicRetrieveFeedbacksPage.service
            params = publicRetrieveFeedbacksPage.params
            items = publicRetrieveFeedbacksPage.items
        }

        fun service(service: PublicService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PublicRetrieveFeedbacksParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<FeedbackSchema>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [PublicRetrieveFeedbacksPage].
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
        fun build(): PublicRetrieveFeedbacksPage =
            PublicRetrieveFeedbacksPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicRetrieveFeedbacksPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "PublicRetrieveFeedbacksPage{service=$service, params=$params, items=$items}"
}
