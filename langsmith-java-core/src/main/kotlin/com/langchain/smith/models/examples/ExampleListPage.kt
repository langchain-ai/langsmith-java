// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.ExampleService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see ExampleService.list */
class ExampleListPage
private constructor(
    private val service: ExampleService,
    private val params: ExampleListParams,
    private val items: List<Example>,
) : Page<Example> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ExampleListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): ExampleListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Example> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExampleListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Example> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExampleListPage].
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

    /** A builder for [ExampleListPage]. */
    class Builder internal constructor() {

        private var service: ExampleService? = null
        private var params: ExampleListParams? = null
        private var items: List<Example>? = null

        @JvmSynthetic
        internal fun from(exampleListPage: ExampleListPage) = apply {
            service = exampleListPage.service
            params = exampleListPage.params
            items = exampleListPage.items
        }

        fun service(service: ExampleService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExampleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<Example>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ExampleListPage].
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
        fun build(): ExampleListPage =
            ExampleListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExampleListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "ExampleListPage{service=$service, params=$params, items=$items}"
}
