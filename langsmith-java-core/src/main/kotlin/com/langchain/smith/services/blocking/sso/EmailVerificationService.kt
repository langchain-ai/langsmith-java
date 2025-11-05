// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sso

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sso.emailverification.EmailVerificationConfirmParams
import com.langchain.smith.models.sso.emailverification.EmailVerificationConfirmResponse
import com.langchain.smith.models.sso.emailverification.EmailVerificationSendParams
import com.langchain.smith.models.sso.emailverification.EmailVerificationSendResponse
import com.langchain.smith.models.sso.emailverification.EmailVerificationStatusParams
import com.langchain.smith.models.sso.emailverification.EmailVerificationStatusResponse
import java.util.function.Consumer

interface EmailVerificationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailVerificationService

    /** Confirm the email of an SSO user. */
    fun confirm(params: EmailVerificationConfirmParams): EmailVerificationConfirmResponse =
        confirm(params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        params: EmailVerificationConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailVerificationConfirmResponse

    /** Send an email to confirm the email address for an SSO user. */
    fun send(params: EmailVerificationSendParams): EmailVerificationSendResponse =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: EmailVerificationSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailVerificationSendResponse

    /** Retrieve the email verification status of an SSO user. */
    fun status(params: EmailVerificationStatusParams): EmailVerificationStatusResponse =
        status(params, RequestOptions.none())

    /** @see status */
    fun status(
        params: EmailVerificationStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailVerificationStatusResponse

    /**
     * A view of [EmailVerificationService] that provides access to raw HTTP responses for each
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
        ): EmailVerificationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/sso/email-verification/confirm`, but is
         * otherwise the same as [EmailVerificationService.confirm].
         */
        @MustBeClosed
        fun confirm(
            params: EmailVerificationConfirmParams
        ): HttpResponseFor<EmailVerificationConfirmResponse> =
            confirm(params, RequestOptions.none())

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            params: EmailVerificationConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailVerificationConfirmResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/sso/email-verification/send`, but is
         * otherwise the same as [EmailVerificationService.send].
         */
        @MustBeClosed
        fun send(
            params: EmailVerificationSendParams
        ): HttpResponseFor<EmailVerificationSendResponse> = send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: EmailVerificationSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailVerificationSendResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/sso/email-verification/status`, but is
         * otherwise the same as [EmailVerificationService.status].
         */
        @MustBeClosed
        fun status(
            params: EmailVerificationStatusParams
        ): HttpResponseFor<EmailVerificationStatusResponse> = status(params, RequestOptions.none())

        /** @see status */
        @MustBeClosed
        fun status(
            params: EmailVerificationStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailVerificationStatusResponse>
    }
}
