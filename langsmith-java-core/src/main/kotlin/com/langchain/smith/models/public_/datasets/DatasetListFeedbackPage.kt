// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.services.blocking.public_.DatasetService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DatasetService.listFeedback */
class DatasetListFeedbackPage
private constructor(
    private val service: DatasetService,
    private val params: DatasetListFeedbackParams,
    private val items: List<FeedbackSchema>,
) : Page<FeedbackSchema> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatasetListFeedbackParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): DatasetListFeedbackPage = service.listFeedback(nextPageParams())

    fun autoPager(): AutoPager<FeedbackSchema> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DatasetListFeedbackParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<FeedbackSchema> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetListFeedbackPage].
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

    /** A builder for [DatasetListFeedbackPage]. */
    class Builder internal constructor() {

        private var service: DatasetService? = null
        private var params: DatasetListFeedbackParams? = null
        private var items: List<FeedbackSchema>? = null

        @JvmSynthetic
        internal fun from(datasetListFeedbackPage: DatasetListFeedbackPage) = apply {
            service = datasetListFeedbackPage.service
            params = datasetListFeedbackPage.params
            items = datasetListFeedbackPage.items
        }

        fun service(service: DatasetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetListFeedbackParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<FeedbackSchema>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DatasetListFeedbackPage].
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
        fun build(): DatasetListFeedbackPage =
            DatasetListFeedbackPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetListFeedbackPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "DatasetListFeedbackPage{service=$service, params=$params, items=$items}"
}
