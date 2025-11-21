// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.services.blocking.public_.DatasetService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see DatasetService.retrieveFeedback */
class DatasetRetrieveFeedbackPage
private constructor(
    private val service: DatasetService,
    private val params: DatasetRetrieveFeedbackParams,
    private val items: List<FeedbackSchema>,
) : Page<FeedbackSchema> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DatasetRetrieveFeedbackParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): DatasetRetrieveFeedbackPage =
        service.retrieveFeedback(nextPageParams())

    fun autoPager(): AutoPager<FeedbackSchema> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DatasetRetrieveFeedbackParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<FeedbackSchema> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetRetrieveFeedbackPage].
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

    /** A builder for [DatasetRetrieveFeedbackPage]. */
    class Builder internal constructor() {

        private var service: DatasetService? = null
        private var params: DatasetRetrieveFeedbackParams? = null
        private var items: List<FeedbackSchema>? = null

        @JvmSynthetic
        internal fun from(datasetRetrieveFeedbackPage: DatasetRetrieveFeedbackPage) = apply {
            service = datasetRetrieveFeedbackPage.service
            params = datasetRetrieveFeedbackPage.params
            items = datasetRetrieveFeedbackPage.items
        }

        fun service(service: DatasetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DatasetRetrieveFeedbackParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<FeedbackSchema>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [DatasetRetrieveFeedbackPage].
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
        fun build(): DatasetRetrieveFeedbackPage =
            DatasetRetrieveFeedbackPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetRetrieveFeedbackPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() =
        "DatasetRetrieveFeedbackPage{service=$service, params=$params, items=$items}"
}
