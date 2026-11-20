// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.volumes

import com.langchain.smith.core.AutoPager
import com.langchain.smith.core.Page
import com.langchain.smith.core.checkRequired
import com.langchain.smith.services.blocking.sandboxes.VolumeService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see VolumeService.list */
class VolumeListPage
private constructor(
    private val service: VolumeService,
    private val params: VolumeListParams,
    private val response: VolumeListPageResponse,
) : Page<VolumeResponse> {

    /**
     * Delegates to [VolumeListPageResponse], but gracefully handles missing data.
     *
     * @see VolumeListPageResponse.items
     */
    override fun items(): List<VolumeResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    /**
     * Delegates to [VolumeListPageResponse], but gracefully handles missing data.
     *
     * @see VolumeListPageResponse.nextCursor
     */
    fun nextCursor(): Optional<String> = response._nextCursor().getOptional("next_cursor")

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor().isPresent

    fun nextPageParams(): VolumeListParams {
        val nextCursor =
            nextCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): VolumeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<VolumeResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VolumeListParams = params

    /** The response that this page was parsed from. */
    fun response(): VolumeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VolumeListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VolumeListPage]. */
    class Builder internal constructor() {

        private var service: VolumeService? = null
        private var params: VolumeListParams? = null
        private var response: VolumeListPageResponse? = null

        @JvmSynthetic
        internal fun from(volumeListPage: VolumeListPage) = apply {
            service = volumeListPage.service
            params = volumeListPage.params
            response = volumeListPage.response
        }

        fun service(service: VolumeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VolumeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VolumeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [VolumeListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VolumeListPage =
            VolumeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VolumeListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "VolumeListPage{service=$service, params=$params, response=$response}"
}
