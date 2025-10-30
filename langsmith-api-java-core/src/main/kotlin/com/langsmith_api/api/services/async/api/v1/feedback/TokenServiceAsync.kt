// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.feedback

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.feedback.tokens.FeedbackIngestTokenSchema
import com.langsmith_api.api.models.api.v1.feedback.tokens.TokenCreateParams
import com.langsmith_api.api.models.api.v1.feedback.tokens.TokenCreateResponse
import com.langsmith_api.api.models.api.v1.feedback.tokens.TokenListParams
import com.langsmith_api.api.models.api.v1.feedback.tokens.TokenRetrieveParams
import com.langsmith_api.api.models.api.v1.feedback.tokens.TokenRetrieveResponse
import com.langsmith_api.api.models.api.v1.feedback.tokens.TokenUpdateParams
import com.langsmith_api.api.models.api.v1.feedback.tokens.TokenUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenServiceAsync

    /** Create a new feedback ingest token. */
    fun create(params: TokenCreateParams): CompletableFuture<TokenCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenCreateResponse>

    /** Create a new feedback with a token. */
    fun retrieve(token: String): CompletableFuture<TokenRetrieveResponse> =
        retrieve(token, TokenRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        token: String,
        params: TokenRetrieveParams = TokenRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenRetrieveResponse> =
        retrieve(params.toBuilder().token(token).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        token: String,
        params: TokenRetrieveParams = TokenRetrieveParams.none(),
    ): CompletableFuture<TokenRetrieveResponse> = retrieve(token, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: TokenRetrieveParams): CompletableFuture<TokenRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        token: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenRetrieveResponse> =
        retrieve(token, TokenRetrieveParams.none(), requestOptions)

    /** Create a new feedback with a token. */
    fun update(token: String): CompletableFuture<TokenUpdateResponse> =
        update(token, TokenUpdateParams.none())

    /** @see update */
    fun update(
        token: String,
        params: TokenUpdateParams = TokenUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenUpdateResponse> =
        update(params.toBuilder().token(token).build(), requestOptions)

    /** @see update */
    fun update(
        token: String,
        params: TokenUpdateParams = TokenUpdateParams.none(),
    ): CompletableFuture<TokenUpdateResponse> = update(token, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TokenUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenUpdateResponse>

    /** @see update */
    fun update(params: TokenUpdateParams): CompletableFuture<TokenUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        token: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenUpdateResponse> =
        update(token, TokenUpdateParams.none(), requestOptions)

    /** List all feedback ingest tokens for a run. */
    fun list(params: TokenListParams): CompletableFuture<List<FeedbackIngestTokenSchema>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TokenListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FeedbackIngestTokenSchema>>

    /** A view of [TokenServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/feedback/tokens`, but is otherwise the same
         * as [TokenServiceAsync.create].
         */
        fun create(
            params: TokenCreateParams
        ): CompletableFuture<HttpResponseFor<TokenCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TokenCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/feedback/tokens/{token}`, but is otherwise
         * the same as [TokenServiceAsync.retrieve].
         */
        fun retrieve(token: String): CompletableFuture<HttpResponseFor<TokenRetrieveResponse>> =
            retrieve(token, TokenRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            token: String,
            params: TokenRetrieveParams = TokenRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenRetrieveResponse>> =
            retrieve(params.toBuilder().token(token).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            token: String,
            params: TokenRetrieveParams = TokenRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TokenRetrieveResponse>> =
            retrieve(token, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TokenRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TokenRetrieveParams
        ): CompletableFuture<HttpResponseFor<TokenRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            token: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenRetrieveResponse>> =
            retrieve(token, TokenRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/feedback/tokens/{token}`, but is otherwise
         * the same as [TokenServiceAsync.update].
         */
        fun update(token: String): CompletableFuture<HttpResponseFor<TokenUpdateResponse>> =
            update(token, TokenUpdateParams.none())

        /** @see update */
        fun update(
            token: String,
            params: TokenUpdateParams = TokenUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenUpdateResponse>> =
            update(params.toBuilder().token(token).build(), requestOptions)

        /** @see update */
        fun update(
            token: String,
            params: TokenUpdateParams = TokenUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<TokenUpdateResponse>> =
            update(token, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TokenUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenUpdateResponse>>

        /** @see update */
        fun update(
            params: TokenUpdateParams
        ): CompletableFuture<HttpResponseFor<TokenUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            token: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenUpdateResponse>> =
            update(token, TokenUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/feedback/tokens`, but is otherwise the same
         * as [TokenServiceAsync.list].
         */
        fun list(
            params: TokenListParams
        ): CompletableFuture<HttpResponseFor<List<FeedbackIngestTokenSchema>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TokenListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FeedbackIngestTokenSchema>>>
    }
}
