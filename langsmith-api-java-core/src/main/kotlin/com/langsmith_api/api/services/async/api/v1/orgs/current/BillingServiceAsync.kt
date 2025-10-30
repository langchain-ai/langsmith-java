// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.orgs.current

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.current.billing.BillingListParams
import com.langsmith_api.api.models.api.v1.orgs.current.billing.BillingListResponse
import com.langsmith_api.api.models.api.v1.orgs.current.billing.BillingRetrieveUsageParams
import com.langsmith_api.api.models.api.v1.orgs.current.billing.BillingRetrieveUsageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BillingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingServiceAsync

    /** Get Organization Billing Info */
    fun list(): CompletableFuture<BillingListResponse> = list(BillingListParams.none())

    /** @see list */
    fun list(
        params: BillingListParams = BillingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingListResponse>

    /** @see list */
    fun list(
        params: BillingListParams = BillingListParams.none()
    ): CompletableFuture<BillingListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BillingListResponse> =
        list(BillingListParams.none(), requestOptions)

    /** Get Org Usage */
    fun retrieveUsage(
        params: BillingRetrieveUsageParams
    ): CompletableFuture<List<BillingRetrieveUsageResponse>> =
        retrieveUsage(params, RequestOptions.none())

    /** @see retrieveUsage */
    fun retrieveUsage(
        params: BillingRetrieveUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BillingRetrieveUsageResponse>>

    /**
     * A view of [BillingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BillingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/billing`, but is otherwise the
         * same as [BillingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BillingListResponse>> =
            list(BillingListParams.none())

        /** @see list */
        fun list(
            params: BillingListParams = BillingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingListResponse>>

        /** @see list */
        fun list(
            params: BillingListParams = BillingListParams.none()
        ): CompletableFuture<HttpResponseFor<BillingListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BillingListResponse>> =
            list(BillingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/billing/usage`, but is
         * otherwise the same as [BillingServiceAsync.retrieveUsage].
         */
        fun retrieveUsage(
            params: BillingRetrieveUsageParams
        ): CompletableFuture<HttpResponseFor<List<BillingRetrieveUsageResponse>>> =
            retrieveUsage(params, RequestOptions.none())

        /** @see retrieveUsage */
        fun retrieveUsage(
            params: BillingRetrieveUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BillingRetrieveUsageResponse>>>
    }
}
