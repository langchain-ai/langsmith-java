// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.serviceaccounts.ServiceAccountDeleteParams
import com.langchain.smith.models.serviceaccounts.ServiceAccountDeleteResponse
import com.langchain.smith.models.serviceaccounts.ServiceAccountRetrieveServiceAccountsParams
import com.langchain.smith.models.serviceaccounts.ServiceAccountRetrieveServiceAccountsResponse
import com.langchain.smith.models.serviceaccounts.ServiceAccountServiceAccountsParams
import com.langchain.smith.models.serviceaccounts.ServiceAccountServiceAccountsResponse
import java.util.function.Consumer

interface ServiceAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ServiceAccountService

    /** Delete a service account */
    fun delete(serviceAccountId: String): ServiceAccountDeleteResponse =
        delete(serviceAccountId, ServiceAccountDeleteParams.none())

    /** @see delete */
    fun delete(
        serviceAccountId: String,
        params: ServiceAccountDeleteParams = ServiceAccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ServiceAccountDeleteResponse =
        delete(params.toBuilder().serviceAccountId(serviceAccountId).build(), requestOptions)

    /** @see delete */
    fun delete(
        serviceAccountId: String,
        params: ServiceAccountDeleteParams = ServiceAccountDeleteParams.none(),
    ): ServiceAccountDeleteResponse = delete(serviceAccountId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ServiceAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ServiceAccountDeleteResponse

    /** @see delete */
    fun delete(params: ServiceAccountDeleteParams): ServiceAccountDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        serviceAccountId: String,
        requestOptions: RequestOptions,
    ): ServiceAccountDeleteResponse =
        delete(serviceAccountId, ServiceAccountDeleteParams.none(), requestOptions)

    /** Get the current organization's service accounts. */
    fun retrieveServiceAccounts(): List<ServiceAccountRetrieveServiceAccountsResponse> =
        retrieveServiceAccounts(ServiceAccountRetrieveServiceAccountsParams.none())

    /** @see retrieveServiceAccounts */
    fun retrieveServiceAccounts(
        params: ServiceAccountRetrieveServiceAccountsParams =
            ServiceAccountRetrieveServiceAccountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ServiceAccountRetrieveServiceAccountsResponse>

    /** @see retrieveServiceAccounts */
    fun retrieveServiceAccounts(
        params: ServiceAccountRetrieveServiceAccountsParams =
            ServiceAccountRetrieveServiceAccountsParams.none()
    ): List<ServiceAccountRetrieveServiceAccountsResponse> =
        retrieveServiceAccounts(params, RequestOptions.none())

    /** @see retrieveServiceAccounts */
    fun retrieveServiceAccounts(
        requestOptions: RequestOptions
    ): List<ServiceAccountRetrieveServiceAccountsResponse> =
        retrieveServiceAccounts(ServiceAccountRetrieveServiceAccountsParams.none(), requestOptions)

    /** Create a service account */
    fun serviceAccounts(
        params: ServiceAccountServiceAccountsParams
    ): ServiceAccountServiceAccountsResponse = serviceAccounts(params, RequestOptions.none())

    /** @see serviceAccounts */
    fun serviceAccounts(
        params: ServiceAccountServiceAccountsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ServiceAccountServiceAccountsResponse

    /**
     * A view of [ServiceAccountService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ServiceAccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /api/v1/service-accounts/{service_account_id}`,
         * but is otherwise the same as [ServiceAccountService.delete].
         */
        @MustBeClosed
        fun delete(serviceAccountId: String): HttpResponseFor<ServiceAccountDeleteResponse> =
            delete(serviceAccountId, ServiceAccountDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            serviceAccountId: String,
            params: ServiceAccountDeleteParams = ServiceAccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ServiceAccountDeleteResponse> =
            delete(params.toBuilder().serviceAccountId(serviceAccountId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            serviceAccountId: String,
            params: ServiceAccountDeleteParams = ServiceAccountDeleteParams.none(),
        ): HttpResponseFor<ServiceAccountDeleteResponse> =
            delete(serviceAccountId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ServiceAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ServiceAccountDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ServiceAccountDeleteParams
        ): HttpResponseFor<ServiceAccountDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            serviceAccountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ServiceAccountDeleteResponse> =
            delete(serviceAccountId, ServiceAccountDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/service-accounts`, but is otherwise the same
         * as [ServiceAccountService.retrieveServiceAccounts].
         */
        @MustBeClosed
        fun retrieveServiceAccounts():
            HttpResponseFor<List<ServiceAccountRetrieveServiceAccountsResponse>> =
            retrieveServiceAccounts(ServiceAccountRetrieveServiceAccountsParams.none())

        /** @see retrieveServiceAccounts */
        @MustBeClosed
        fun retrieveServiceAccounts(
            params: ServiceAccountRetrieveServiceAccountsParams =
                ServiceAccountRetrieveServiceAccountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ServiceAccountRetrieveServiceAccountsResponse>>

        /** @see retrieveServiceAccounts */
        @MustBeClosed
        fun retrieveServiceAccounts(
            params: ServiceAccountRetrieveServiceAccountsParams =
                ServiceAccountRetrieveServiceAccountsParams.none()
        ): HttpResponseFor<List<ServiceAccountRetrieveServiceAccountsResponse>> =
            retrieveServiceAccounts(params, RequestOptions.none())

        /** @see retrieveServiceAccounts */
        @MustBeClosed
        fun retrieveServiceAccounts(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<ServiceAccountRetrieveServiceAccountsResponse>> =
            retrieveServiceAccounts(
                ServiceAccountRetrieveServiceAccountsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /api/v1/service-accounts`, but is otherwise the
         * same as [ServiceAccountService.serviceAccounts].
         */
        @MustBeClosed
        fun serviceAccounts(
            params: ServiceAccountServiceAccountsParams
        ): HttpResponseFor<ServiceAccountServiceAccountsResponse> =
            serviceAccounts(params, RequestOptions.none())

        /** @see serviceAccounts */
        @MustBeClosed
        fun serviceAccounts(
            params: ServiceAccountServiceAccountsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ServiceAccountServiceAccountsResponse>
    }
}
