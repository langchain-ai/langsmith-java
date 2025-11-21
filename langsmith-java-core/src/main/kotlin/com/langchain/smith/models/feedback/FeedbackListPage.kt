// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.FeedbackService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see FeedbackService.list */
class FeedbackListPage
private constructor(
    private val service: FeedbackService,
    private val params: FeedbackListParams,
    private val items: List<FeedbackSchema>,
) : Page<FeedbackSchema> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FeedbackListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): FeedbackListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<FeedbackSchema> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FeedbackListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<FeedbackSchema> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FeedbackListPage].
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

    /** A builder for [FeedbackListPage]. */
    class Builder internal constructor() {

        private var service: FeedbackService? = null
        private var params: FeedbackListParams? = null
        private var items: List<FeedbackSchema>? = null

        @JvmSynthetic
        internal fun from(feedbackListPage: FeedbackListPage) = apply {
            service = feedbackListPage.service
            params = feedbackListPage.params
            items = feedbackListPage.items
        }

        fun service(service: FeedbackService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FeedbackListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<FeedbackSchema>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [FeedbackListPage].
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
        fun build(): FeedbackListPage =
            FeedbackListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "FeedbackListPage{service=$service, params=$params, items=$items}"
}
