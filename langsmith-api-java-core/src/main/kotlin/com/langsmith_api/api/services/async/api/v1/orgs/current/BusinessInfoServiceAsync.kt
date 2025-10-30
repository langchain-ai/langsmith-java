// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.orgs.current

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.current.businessinfo.BusinessInfoBusinessInfoParams
import com.langsmith_api.api.models.api.v1.orgs.current.businessinfo.BusinessInfoBusinessInfoResponse
import com.langsmith_api.api.models.api.v1.orgs.current.businessinfo.BusinessInfoRetrieveBusinessInfoParams
import com.langsmith_api.api.models.api.v1.orgs.current.businessinfo.BusinessInfoRetrieveBusinessInfoResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BusinessInfoServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessInfoServiceAsync

    /** Set Company Info */
    fun businessInfo(): CompletableFuture<BusinessInfoBusinessInfoResponse> =
        businessInfo(BusinessInfoBusinessInfoParams.none())

    /** @see businessInfo */
    fun businessInfo(
        params: BusinessInfoBusinessInfoParams = BusinessInfoBusinessInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BusinessInfoBusinessInfoResponse>

    /** @see businessInfo */
    fun businessInfo(
        params: BusinessInfoBusinessInfoParams = BusinessInfoBusinessInfoParams.none()
    ): CompletableFuture<BusinessInfoBusinessInfoResponse> =
        businessInfo(params, RequestOptions.none())

    /** @see businessInfo */
    fun businessInfo(
        requestOptions: RequestOptions
    ): CompletableFuture<BusinessInfoBusinessInfoResponse> =
        businessInfo(BusinessInfoBusinessInfoParams.none(), requestOptions)

    /** Get Company Info */
    fun retrieveBusinessInfo(): CompletableFuture<BusinessInfoRetrieveBusinessInfoResponse> =
        retrieveBusinessInfo(BusinessInfoRetrieveBusinessInfoParams.none())

    /** @see retrieveBusinessInfo */
    fun retrieveBusinessInfo(
        params: BusinessInfoRetrieveBusinessInfoParams =
            BusinessInfoRetrieveBusinessInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BusinessInfoRetrieveBusinessInfoResponse>

    /** @see retrieveBusinessInfo */
    fun retrieveBusinessInfo(
        params: BusinessInfoRetrieveBusinessInfoParams =
            BusinessInfoRetrieveBusinessInfoParams.none()
    ): CompletableFuture<BusinessInfoRetrieveBusinessInfoResponse> =
        retrieveBusinessInfo(params, RequestOptions.none())

    /** @see retrieveBusinessInfo */
    fun retrieveBusinessInfo(
        requestOptions: RequestOptions
    ): CompletableFuture<BusinessInfoRetrieveBusinessInfoResponse> =
        retrieveBusinessInfo(BusinessInfoRetrieveBusinessInfoParams.none(), requestOptions)

    /**
     * A view of [BusinessInfoServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BusinessInfoServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/business-info`, but is
         * otherwise the same as [BusinessInfoServiceAsync.businessInfo].
         */
        fun businessInfo(): CompletableFuture<HttpResponseFor<BusinessInfoBusinessInfoResponse>> =
            businessInfo(BusinessInfoBusinessInfoParams.none())

        /** @see businessInfo */
        fun businessInfo(
            params: BusinessInfoBusinessInfoParams = BusinessInfoBusinessInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BusinessInfoBusinessInfoResponse>>

        /** @see businessInfo */
        fun businessInfo(
            params: BusinessInfoBusinessInfoParams = BusinessInfoBusinessInfoParams.none()
        ): CompletableFuture<HttpResponseFor<BusinessInfoBusinessInfoResponse>> =
            businessInfo(params, RequestOptions.none())

        /** @see businessInfo */
        fun businessInfo(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BusinessInfoBusinessInfoResponse>> =
            businessInfo(BusinessInfoBusinessInfoParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/business-info`, but is
         * otherwise the same as [BusinessInfoServiceAsync.retrieveBusinessInfo].
         */
        fun retrieveBusinessInfo():
            CompletableFuture<HttpResponseFor<BusinessInfoRetrieveBusinessInfoResponse>> =
            retrieveBusinessInfo(BusinessInfoRetrieveBusinessInfoParams.none())

        /** @see retrieveBusinessInfo */
        fun retrieveBusinessInfo(
            params: BusinessInfoRetrieveBusinessInfoParams =
                BusinessInfoRetrieveBusinessInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BusinessInfoRetrieveBusinessInfoResponse>>

        /** @see retrieveBusinessInfo */
        fun retrieveBusinessInfo(
            params: BusinessInfoRetrieveBusinessInfoParams =
                BusinessInfoRetrieveBusinessInfoParams.none()
        ): CompletableFuture<HttpResponseFor<BusinessInfoRetrieveBusinessInfoResponse>> =
            retrieveBusinessInfo(params, RequestOptions.none())

        /** @see retrieveBusinessInfo */
        fun retrieveBusinessInfo(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BusinessInfoRetrieveBusinessInfoResponse>> =
            retrieveBusinessInfo(BusinessInfoRetrieveBusinessInfoParams.none(), requestOptions)
    }
}
