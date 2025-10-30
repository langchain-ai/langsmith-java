// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.sso.SsoRetrieveParams
import com.langsmith_api.api.models.api.v1.sso.SsoRetrieveResponse
import com.langsmith_api.api.services.blocking.api.v1.sso.EmailVerificationService
import java.util.function.Consumer

interface SsoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SsoService

    fun emailVerification(): EmailVerificationService

    /** Get SSO provider settings from login slug. */
    fun retrieve(ssoLoginSlug: String): List<SsoRetrieveResponse> =
        retrieve(ssoLoginSlug, SsoRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        ssoLoginSlug: String,
        params: SsoRetrieveParams = SsoRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SsoRetrieveResponse> =
        retrieve(params.toBuilder().ssoLoginSlug(ssoLoginSlug).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        ssoLoginSlug: String,
        params: SsoRetrieveParams = SsoRetrieveParams.none(),
    ): List<SsoRetrieveResponse> = retrieve(ssoLoginSlug, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SsoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SsoRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: SsoRetrieveParams): List<SsoRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(ssoLoginSlug: String, requestOptions: RequestOptions): List<SsoRetrieveResponse> =
        retrieve(ssoLoginSlug, SsoRetrieveParams.none(), requestOptions)

    /** A view of [SsoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SsoService.WithRawResponse

        fun emailVerification(): EmailVerificationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/sso/settings/{sso_login_slug}`, but is
         * otherwise the same as [SsoService.retrieve].
         */
        @MustBeClosed
        fun retrieve(ssoLoginSlug: String): HttpResponseFor<List<SsoRetrieveResponse>> =
            retrieve(ssoLoginSlug, SsoRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            ssoLoginSlug: String,
            params: SsoRetrieveParams = SsoRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SsoRetrieveResponse>> =
            retrieve(params.toBuilder().ssoLoginSlug(ssoLoginSlug).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            ssoLoginSlug: String,
            params: SsoRetrieveParams = SsoRetrieveParams.none(),
        ): HttpResponseFor<List<SsoRetrieveResponse>> =
            retrieve(ssoLoginSlug, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SsoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SsoRetrieveResponse>>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: SsoRetrieveParams): HttpResponseFor<List<SsoRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            ssoLoginSlug: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SsoRetrieveResponse>> =
            retrieve(ssoLoginSlug, SsoRetrieveParams.none(), requestOptions)
    }
}
