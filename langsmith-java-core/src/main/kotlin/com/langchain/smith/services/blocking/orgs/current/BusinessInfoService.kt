// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs.current

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.orgs.current.businessinfo.BusinessInfoBusinessInfoParams
import com.langchain.smith.models.orgs.current.businessinfo.BusinessInfoBusinessInfoResponse
import com.langchain.smith.models.orgs.current.businessinfo.BusinessInfoRetrieveBusinessInfoParams
import com.langchain.smith.models.orgs.current.businessinfo.BusinessInfoRetrieveBusinessInfoResponse
import java.util.function.Consumer

interface BusinessInfoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessInfoService

    /** Set Company Info */
    fun businessInfo(): BusinessInfoBusinessInfoResponse =
        businessInfo(BusinessInfoBusinessInfoParams.none())

    /** @see businessInfo */
    fun businessInfo(
        params: BusinessInfoBusinessInfoParams = BusinessInfoBusinessInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BusinessInfoBusinessInfoResponse

    /** @see businessInfo */
    fun businessInfo(
        params: BusinessInfoBusinessInfoParams = BusinessInfoBusinessInfoParams.none()
    ): BusinessInfoBusinessInfoResponse = businessInfo(params, RequestOptions.none())

    /** @see businessInfo */
    fun businessInfo(requestOptions: RequestOptions): BusinessInfoBusinessInfoResponse =
        businessInfo(BusinessInfoBusinessInfoParams.none(), requestOptions)

    /** Get Company Info */
    fun retrieveBusinessInfo(): BusinessInfoRetrieveBusinessInfoResponse =
        retrieveBusinessInfo(BusinessInfoRetrieveBusinessInfoParams.none())

    /** @see retrieveBusinessInfo */
    fun retrieveBusinessInfo(
        params: BusinessInfoRetrieveBusinessInfoParams =
            BusinessInfoRetrieveBusinessInfoParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BusinessInfoRetrieveBusinessInfoResponse

    /** @see retrieveBusinessInfo */
    fun retrieveBusinessInfo(
        params: BusinessInfoRetrieveBusinessInfoParams =
            BusinessInfoRetrieveBusinessInfoParams.none()
    ): BusinessInfoRetrieveBusinessInfoResponse =
        retrieveBusinessInfo(params, RequestOptions.none())

    /** @see retrieveBusinessInfo */
    fun retrieveBusinessInfo(
        requestOptions: RequestOptions
    ): BusinessInfoRetrieveBusinessInfoResponse =
        retrieveBusinessInfo(BusinessInfoRetrieveBusinessInfoParams.none(), requestOptions)

    /**
     * A view of [BusinessInfoService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BusinessInfoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/business-info`, but is
         * otherwise the same as [BusinessInfoService.businessInfo].
         */
        @MustBeClosed
        fun businessInfo(): HttpResponseFor<BusinessInfoBusinessInfoResponse> =
            businessInfo(BusinessInfoBusinessInfoParams.none())

        /** @see businessInfo */
        @MustBeClosed
        fun businessInfo(
            params: BusinessInfoBusinessInfoParams = BusinessInfoBusinessInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BusinessInfoBusinessInfoResponse>

        /** @see businessInfo */
        @MustBeClosed
        fun businessInfo(
            params: BusinessInfoBusinessInfoParams = BusinessInfoBusinessInfoParams.none()
        ): HttpResponseFor<BusinessInfoBusinessInfoResponse> =
            businessInfo(params, RequestOptions.none())

        /** @see businessInfo */
        @MustBeClosed
        fun businessInfo(
            requestOptions: RequestOptions
        ): HttpResponseFor<BusinessInfoBusinessInfoResponse> =
            businessInfo(BusinessInfoBusinessInfoParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/business-info`, but is
         * otherwise the same as [BusinessInfoService.retrieveBusinessInfo].
         */
        @MustBeClosed
        fun retrieveBusinessInfo(): HttpResponseFor<BusinessInfoRetrieveBusinessInfoResponse> =
            retrieveBusinessInfo(BusinessInfoRetrieveBusinessInfoParams.none())

        /** @see retrieveBusinessInfo */
        @MustBeClosed
        fun retrieveBusinessInfo(
            params: BusinessInfoRetrieveBusinessInfoParams =
                BusinessInfoRetrieveBusinessInfoParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BusinessInfoRetrieveBusinessInfoResponse>

        /** @see retrieveBusinessInfo */
        @MustBeClosed
        fun retrieveBusinessInfo(
            params: BusinessInfoRetrieveBusinessInfoParams =
                BusinessInfoRetrieveBusinessInfoParams.none()
        ): HttpResponseFor<BusinessInfoRetrieveBusinessInfoResponse> =
            retrieveBusinessInfo(params, RequestOptions.none())

        /** @see retrieveBusinessInfo */
        @MustBeClosed
        fun retrieveBusinessInfo(
            requestOptions: RequestOptions
        ): HttpResponseFor<BusinessInfoRetrieveBusinessInfoResponse> =
            retrieveBusinessInfo(BusinessInfoRetrieveBusinessInfoParams.none(), requestOptions)
    }
}
