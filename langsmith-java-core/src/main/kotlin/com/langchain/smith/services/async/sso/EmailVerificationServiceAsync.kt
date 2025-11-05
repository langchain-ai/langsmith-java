// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sso

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sso.emailverification.EmailVerificationConfirmParams
import com.langchain.smith.models.sso.emailverification.EmailVerificationConfirmResponse
import com.langchain.smith.models.sso.emailverification.EmailVerificationSendParams
import com.langchain.smith.models.sso.emailverification.EmailVerificationSendResponse
import com.langchain.smith.models.sso.emailverification.EmailVerificationStatusParams
import com.langchain.smith.models.sso.emailverification.EmailVerificationStatusResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EmailVerificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailVerificationServiceAsync

    /** Confirm the email of an SSO user. */
    fun confirm(
        params: EmailVerificationConfirmParams
    ): CompletableFuture<EmailVerificationConfirmResponse> = confirm(params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        params: EmailVerificationConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailVerificationConfirmResponse>

    /** Send an email to confirm the email address for an SSO user. */
    fun send(
        params: EmailVerificationSendParams
    ): CompletableFuture<EmailVerificationSendResponse> = send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: EmailVerificationSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailVerificationSendResponse>

    /** Retrieve the email verification status of an SSO user. */
    fun status(
        params: EmailVerificationStatusParams
    ): CompletableFuture<EmailVerificationStatusResponse> = status(params, RequestOptions.none())

    /** @see status */
    fun status(
        params: EmailVerificationStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailVerificationStatusResponse>

    /**
     * A view of [EmailVerificationServiceAsync] that provides access to raw HTTP responses for each
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
        ): EmailVerificationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/sso/email-verification/confirm`, but is
         * otherwise the same as [EmailVerificationServiceAsync.confirm].
         */
        fun confirm(
            params: EmailVerificationConfirmParams
        ): CompletableFuture<HttpResponseFor<EmailVerificationConfirmResponse>> =
            confirm(params, RequestOptions.none())

        /** @see confirm */
        fun confirm(
            params: EmailVerificationConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailVerificationConfirmResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/sso/email-verification/send`, but is
         * otherwise the same as [EmailVerificationServiceAsync.send].
         */
        fun send(
            params: EmailVerificationSendParams
        ): CompletableFuture<HttpResponseFor<EmailVerificationSendResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: EmailVerificationSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailVerificationSendResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/sso/email-verification/status`, but is
         * otherwise the same as [EmailVerificationServiceAsync.status].
         */
        fun status(
            params: EmailVerificationStatusParams
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusResponse>> =
            status(params, RequestOptions.none())

        /** @see status */
        fun status(
            params: EmailVerificationStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailVerificationStatusResponse>>
    }
}
