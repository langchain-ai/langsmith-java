// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sso.SsoRetrieveParams
import com.langchain.smith.models.sso.SsoRetrieveResponse
import com.langchain.smith.services.async.sso.EmailVerificationServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SsoServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SsoServiceAsync

    fun emailVerification(): EmailVerificationServiceAsync

    /** Get SSO provider settings from login slug. */
    fun retrieve(ssoLoginSlug: String): CompletableFuture<List<SsoRetrieveResponse>> =
        retrieve(ssoLoginSlug, SsoRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        ssoLoginSlug: String,
        params: SsoRetrieveParams = SsoRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SsoRetrieveResponse>> =
        retrieve(params.toBuilder().ssoLoginSlug(ssoLoginSlug).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        ssoLoginSlug: String,
        params: SsoRetrieveParams = SsoRetrieveParams.none(),
    ): CompletableFuture<List<SsoRetrieveResponse>> =
        retrieve(ssoLoginSlug, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SsoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SsoRetrieveResponse>>

    /** @see retrieve */
    fun retrieve(params: SsoRetrieveParams): CompletableFuture<List<SsoRetrieveResponse>> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        ssoLoginSlug: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<SsoRetrieveResponse>> =
        retrieve(ssoLoginSlug, SsoRetrieveParams.none(), requestOptions)

    /** A view of [SsoServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SsoServiceAsync.WithRawResponse

        fun emailVerification(): EmailVerificationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/sso/settings/{sso_login_slug}`, but is
         * otherwise the same as [SsoServiceAsync.retrieve].
         */
        fun retrieve(
            ssoLoginSlug: String
        ): CompletableFuture<HttpResponseFor<List<SsoRetrieveResponse>>> =
            retrieve(ssoLoginSlug, SsoRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            ssoLoginSlug: String,
            params: SsoRetrieveParams = SsoRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SsoRetrieveResponse>>> =
            retrieve(params.toBuilder().ssoLoginSlug(ssoLoginSlug).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            ssoLoginSlug: String,
            params: SsoRetrieveParams = SsoRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<List<SsoRetrieveResponse>>> =
            retrieve(ssoLoginSlug, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SsoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SsoRetrieveResponse>>>

        /** @see retrieve */
        fun retrieve(
            params: SsoRetrieveParams
        ): CompletableFuture<HttpResponseFor<List<SsoRetrieveResponse>>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            ssoLoginSlug: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<SsoRetrieveResponse>>> =
            retrieve(ssoLoginSlug, SsoRetrieveParams.none(), requestOptions)
    }
}
