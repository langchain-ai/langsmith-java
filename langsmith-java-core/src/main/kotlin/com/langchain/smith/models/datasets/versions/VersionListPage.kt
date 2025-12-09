// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.versions

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.models.datasets.DatasetVersion
import com.langchain.smith.services.blocking.datasets.VersionService
import java.util.Objects
import kotlin.jvm.optionals.getOrDefault

/** @see VersionService.list */
class VersionListPage
private constructor(
    private val service: VersionService,
    private val params: VersionListParams,
    private val items: List<DatasetVersion>,
) : Page<DatasetVersion> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): VersionListParams {
        val offset = params.offset().getOrDefault(0)
        return params.toBuilder().offset(offset + items().size).build()
    }

    override fun nextPage(): VersionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DatasetVersion> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VersionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<DatasetVersion> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VersionListPage].
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

    /** A builder for [VersionListPage]. */
    class Builder internal constructor() {

        private var service: VersionService? = null
        private var params: VersionListParams? = null
        private var items: List<DatasetVersion>? = null

        @JvmSynthetic
        internal fun from(versionListPage: VersionListPage) = apply {
            service = versionListPage.service
            params = versionListPage.params
            items = versionListPage.items
        }

        fun service(service: VersionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VersionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<DatasetVersion>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [VersionListPage].
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
        fun build(): VersionListPage =
            VersionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VersionListPage &&
            service == other.service &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, params, items)

    override fun toString() = "VersionListPage{service=$service, params=$params, items=$items}"
}
