// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.feedback

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.feedback.tokens.FeedbackIngestTokenSchema
import com.langchain.smith.models.feedback.tokens.TokenCreateParams
import com.langchain.smith.models.feedback.tokens.TokenCreateResponse
import com.langchain.smith.models.feedback.tokens.TokenListParams
import com.langchain.smith.models.feedback.tokens.TokenRetrieveParams
import com.langchain.smith.models.feedback.tokens.TokenRetrieveResponse
import com.langchain.smith.models.feedback.tokens.TokenUpdateParams
import com.langchain.smith.models.feedback.tokens.TokenUpdateResponse
import java.util.function.Consumer

interface TokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenService

    /** Create a new feedback ingest token. */
    fun create(params: TokenCreateParams): TokenCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenCreateResponse

    /** Create a new feedback with a token. */
    fun retrieve(token: String): TokenRetrieveResponse = retrieve(token, TokenRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        token: String,
        params: TokenRetrieveParams = TokenRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenRetrieveResponse = retrieve(params.toBuilder().token(token).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        token: String,
        params: TokenRetrieveParams = TokenRetrieveParams.none(),
    ): TokenRetrieveResponse = retrieve(token, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: TokenRetrieveParams): TokenRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(token: String, requestOptions: RequestOptions): TokenRetrieveResponse =
        retrieve(token, TokenRetrieveParams.none(), requestOptions)

    /** Create a new feedback with a token. */
    fun update(token: String): TokenUpdateResponse = update(token, TokenUpdateParams.none())

    /** @see update */
    fun update(
        token: String,
        params: TokenUpdateParams = TokenUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenUpdateResponse = update(params.toBuilder().token(token).build(), requestOptions)

    /** @see update */
    fun update(
        token: String,
        params: TokenUpdateParams = TokenUpdateParams.none(),
    ): TokenUpdateResponse = update(token, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TokenUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenUpdateResponse

    /** @see update */
    fun update(params: TokenUpdateParams): TokenUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(token: String, requestOptions: RequestOptions): TokenUpdateResponse =
        update(token, TokenUpdateParams.none(), requestOptions)

    /** List all feedback ingest tokens for a run. */
    fun list(params: TokenListParams): List<FeedbackIngestTokenSchema> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TokenListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FeedbackIngestTokenSchema>

    /** A view of [TokenService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/feedback/tokens`, but is otherwise the same
         * as [TokenService.create].
         */
        @MustBeClosed
        fun create(params: TokenCreateParams): HttpResponseFor<TokenCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TokenCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/feedback/tokens/{token}`, but is otherwise
         * the same as [TokenService.retrieve].
         */
        @MustBeClosed
        fun retrieve(token: String): HttpResponseFor<TokenRetrieveResponse> =
            retrieve(token, TokenRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            token: String,
            params: TokenRetrieveParams = TokenRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenRetrieveResponse> =
            retrieve(params.toBuilder().token(token).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            token: String,
            params: TokenRetrieveParams = TokenRetrieveParams.none(),
        ): HttpResponseFor<TokenRetrieveResponse> = retrieve(token, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TokenRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TokenRetrieveParams): HttpResponseFor<TokenRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            token: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenRetrieveResponse> =
            retrieve(token, TokenRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/feedback/tokens/{token}`, but is otherwise
         * the same as [TokenService.update].
         */
        @MustBeClosed
        fun update(token: String): HttpResponseFor<TokenUpdateResponse> =
            update(token, TokenUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            token: String,
            params: TokenUpdateParams = TokenUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenUpdateResponse> =
            update(params.toBuilder().token(token).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            token: String,
            params: TokenUpdateParams = TokenUpdateParams.none(),
        ): HttpResponseFor<TokenUpdateResponse> = update(token, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TokenUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: TokenUpdateParams): HttpResponseFor<TokenUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            token: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenUpdateResponse> =
            update(token, TokenUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/feedback/tokens`, but is otherwise the same
         * as [TokenService.list].
         */
        @MustBeClosed
        fun list(params: TokenListParams): HttpResponseFor<List<FeedbackIngestTokenSchema>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TokenListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FeedbackIngestTokenSchema>>
    }
}
