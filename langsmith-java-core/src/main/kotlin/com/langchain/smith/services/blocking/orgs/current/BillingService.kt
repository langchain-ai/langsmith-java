// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs.current

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.orgs.current.billing.BillingListParams
import com.langchain.smith.models.orgs.current.billing.BillingListResponse
import com.langchain.smith.models.orgs.current.billing.BillingRetrieveUsageParams
import com.langchain.smith.models.orgs.current.billing.BillingRetrieveUsageResponse
import java.util.function.Consumer

interface BillingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingService

    /** Get Organization Billing Info */
    fun list(): BillingListResponse = list(BillingListParams.none())

    /** @see list */
    fun list(
        params: BillingListParams = BillingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingListResponse

    /** @see list */
    fun list(params: BillingListParams = BillingListParams.none()): BillingListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BillingListResponse =
        list(BillingListParams.none(), requestOptions)

    /** Get Org Usage */
    fun retrieveUsage(params: BillingRetrieveUsageParams): List<BillingRetrieveUsageResponse> =
        retrieveUsage(params, RequestOptions.none())

    /** @see retrieveUsage */
    fun retrieveUsage(
        params: BillingRetrieveUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BillingRetrieveUsageResponse>

    /** A view of [BillingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/billing`, but is otherwise the
         * same as [BillingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BillingListResponse> = list(BillingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BillingListParams = BillingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BillingListParams = BillingListParams.none()
        ): HttpResponseFor<BillingListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BillingListResponse> =
            list(BillingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/billing/usage`, but is
         * otherwise the same as [BillingService.retrieveUsage].
         */
        @MustBeClosed
        fun retrieveUsage(
            params: BillingRetrieveUsageParams
        ): HttpResponseFor<List<BillingRetrieveUsageResponse>> =
            retrieveUsage(params, RequestOptions.none())

        /** @see retrieveUsage */
        @MustBeClosed
        fun retrieveUsage(
            params: BillingRetrieveUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BillingRetrieveUsageResponse>>
    }
}
