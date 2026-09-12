// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.productfeedback.ProductFeedbackCreateParams
import com.langchain.smith.models.productfeedback.ProductFeedbackCreateResponse
import com.langchain.smith.models.productfeedback.ProductFeedbackRetrieveParams
import com.langchain.smith.models.productfeedback.ProductFeedbackRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ProductFeedbackServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductFeedbackServiceAsync

    /**
     * **Alpha:** This endpoint is in active development and may change without notice.
     *
     * Submits concise product feedback with optional non-sensitive client details.
     */
    fun create(
        params: ProductFeedbackCreateParams
    ): CompletableFuture<ProductFeedbackCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProductFeedbackCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductFeedbackCreateResponse>

    /** **Alpha:** This endpoint is in active development and may change without notice. */
    fun retrieve(id: String): CompletableFuture<ProductFeedbackRetrieveResponse> =
        retrieve(id, ProductFeedbackRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProductFeedbackRetrieveParams = ProductFeedbackRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductFeedbackRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProductFeedbackRetrieveParams = ProductFeedbackRetrieveParams.none(),
    ): CompletableFuture<ProductFeedbackRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProductFeedbackRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductFeedbackRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: ProductFeedbackRetrieveParams
    ): CompletableFuture<ProductFeedbackRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProductFeedbackRetrieveResponse> =
        retrieve(id, ProductFeedbackRetrieveParams.none(), requestOptions)

    /**
     * A view of [ProductFeedbackServiceAsync] that provides access to raw HTTP responses for each
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
        ): ProductFeedbackServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/platform/product-feedbacks`, but is
         * otherwise the same as [ProductFeedbackServiceAsync.create].
         */
        fun create(
            params: ProductFeedbackCreateParams
        ): CompletableFuture<HttpResponseFor<ProductFeedbackCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ProductFeedbackCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductFeedbackCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/platform/product-feedbacks/{id}`, but is
         * otherwise the same as [ProductFeedbackServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<ProductFeedbackRetrieveResponse>> =
            retrieve(id, ProductFeedbackRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ProductFeedbackRetrieveParams = ProductFeedbackRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductFeedbackRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ProductFeedbackRetrieveParams = ProductFeedbackRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ProductFeedbackRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ProductFeedbackRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductFeedbackRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ProductFeedbackRetrieveParams
        ): CompletableFuture<HttpResponseFor<ProductFeedbackRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductFeedbackRetrieveResponse>> =
            retrieve(id, ProductFeedbackRetrieveParams.none(), requestOptions)
    }
}
