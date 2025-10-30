// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.serviceaccounts.ServiceAccountDeleteParams
import com.langchain.smith.models.serviceaccounts.ServiceAccountDeleteResponse
import com.langchain.smith.models.serviceaccounts.ServiceAccountRetrieveServiceAccountsParams
import com.langchain.smith.models.serviceaccounts.ServiceAccountRetrieveServiceAccountsResponse
import com.langchain.smith.models.serviceaccounts.ServiceAccountServiceAccountsParams
import com.langchain.smith.models.serviceaccounts.ServiceAccountServiceAccountsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ServiceAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ServiceAccountServiceAsync

    /** Delete a service account */
    fun delete(serviceAccountId: String): CompletableFuture<ServiceAccountDeleteResponse> =
        delete(serviceAccountId, ServiceAccountDeleteParams.none())

    /** @see delete */
    fun delete(
        serviceAccountId: String,
        params: ServiceAccountDeleteParams = ServiceAccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ServiceAccountDeleteResponse> =
        delete(params.toBuilder().serviceAccountId(serviceAccountId).build(), requestOptions)

    /** @see delete */
    fun delete(
        serviceAccountId: String,
        params: ServiceAccountDeleteParams = ServiceAccountDeleteParams.none(),
    ): CompletableFuture<ServiceAccountDeleteResponse> =
        delete(serviceAccountId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ServiceAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ServiceAccountDeleteResponse>

    /** @see delete */
    fun delete(
        params: ServiceAccountDeleteParams
    ): CompletableFuture<ServiceAccountDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        serviceAccountId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ServiceAccountDeleteResponse> =
        delete(serviceAccountId, ServiceAccountDeleteParams.none(), requestOptions)

    /** Get the current organization's service accounts. */
    fun retrieveServiceAccounts():
        CompletableFuture<List<ServiceAccountRetrieveServiceAccountsResponse>> =
        retrieveServiceAccounts(ServiceAccountRetrieveServiceAccountsParams.none())

    /** @see retrieveServiceAccounts */
    fun retrieveServiceAccounts(
        params: ServiceAccountRetrieveServiceAccountsParams =
            ServiceAccountRetrieveServiceAccountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ServiceAccountRetrieveServiceAccountsResponse>>

    /** @see retrieveServiceAccounts */
    fun retrieveServiceAccounts(
        params: ServiceAccountRetrieveServiceAccountsParams =
            ServiceAccountRetrieveServiceAccountsParams.none()
    ): CompletableFuture<List<ServiceAccountRetrieveServiceAccountsResponse>> =
        retrieveServiceAccounts(params, RequestOptions.none())

    /** @see retrieveServiceAccounts */
    fun retrieveServiceAccounts(
        requestOptions: RequestOptions
    ): CompletableFuture<List<ServiceAccountRetrieveServiceAccountsResponse>> =
        retrieveServiceAccounts(ServiceAccountRetrieveServiceAccountsParams.none(), requestOptions)

    /** Create a service account */
    fun serviceAccounts(
        params: ServiceAccountServiceAccountsParams
    ): CompletableFuture<ServiceAccountServiceAccountsResponse> =
        serviceAccounts(params, RequestOptions.none())

    /** @see serviceAccounts */
    fun serviceAccounts(
        params: ServiceAccountServiceAccountsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ServiceAccountServiceAccountsResponse>

    /**
     * A view of [ServiceAccountServiceAsync] that provides access to raw HTTP responses for each
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
        ): ServiceAccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /api/v1/service-accounts/{service_account_id}`,
         * but is otherwise the same as [ServiceAccountServiceAsync.delete].
         */
        fun delete(
            serviceAccountId: String
        ): CompletableFuture<HttpResponseFor<ServiceAccountDeleteResponse>> =
            delete(serviceAccountId, ServiceAccountDeleteParams.none())

        /** @see delete */
        fun delete(
            serviceAccountId: String,
            params: ServiceAccountDeleteParams = ServiceAccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ServiceAccountDeleteResponse>> =
            delete(params.toBuilder().serviceAccountId(serviceAccountId).build(), requestOptions)

        /** @see delete */
        fun delete(
            serviceAccountId: String,
            params: ServiceAccountDeleteParams = ServiceAccountDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ServiceAccountDeleteResponse>> =
            delete(serviceAccountId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ServiceAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ServiceAccountDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ServiceAccountDeleteParams
        ): CompletableFuture<HttpResponseFor<ServiceAccountDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            serviceAccountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ServiceAccountDeleteResponse>> =
            delete(serviceAccountId, ServiceAccountDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/service-accounts`, but is otherwise the same
         * as [ServiceAccountServiceAsync.retrieveServiceAccounts].
         */
        fun retrieveServiceAccounts():
            CompletableFuture<
                HttpResponseFor<List<ServiceAccountRetrieveServiceAccountsResponse>>
            > = retrieveServiceAccounts(ServiceAccountRetrieveServiceAccountsParams.none())

        /** @see retrieveServiceAccounts */
        fun retrieveServiceAccounts(
            params: ServiceAccountRetrieveServiceAccountsParams =
                ServiceAccountRetrieveServiceAccountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ServiceAccountRetrieveServiceAccountsResponse>>>

        /** @see retrieveServiceAccounts */
        fun retrieveServiceAccounts(
            params: ServiceAccountRetrieveServiceAccountsParams =
                ServiceAccountRetrieveServiceAccountsParams.none()
        ): CompletableFuture<HttpResponseFor<List<ServiceAccountRetrieveServiceAccountsResponse>>> =
            retrieveServiceAccounts(params, RequestOptions.none())

        /** @see retrieveServiceAccounts */
        fun retrieveServiceAccounts(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<ServiceAccountRetrieveServiceAccountsResponse>>> =
            retrieveServiceAccounts(
                ServiceAccountRetrieveServiceAccountsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /api/v1/service-accounts`, but is otherwise the
         * same as [ServiceAccountServiceAsync.serviceAccounts].
         */
        fun serviceAccounts(
            params: ServiceAccountServiceAccountsParams
        ): CompletableFuture<HttpResponseFor<ServiceAccountServiceAccountsResponse>> =
            serviceAccounts(params, RequestOptions.none())

        /** @see serviceAccounts */
        fun serviceAccounts(
            params: ServiceAccountServiceAccountsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ServiceAccountServiceAccountsResponse>>
    }
}
