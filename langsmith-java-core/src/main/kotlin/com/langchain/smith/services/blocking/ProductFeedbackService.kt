// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.productfeedback.ProductFeedbackCreateParams
import com.langchain.smith.models.productfeedback.ProductFeedbackCreateResponse
import com.langchain.smith.models.productfeedback.ProductFeedbackRetrieveParams
import com.langchain.smith.models.productfeedback.ProductFeedbackRetrieveResponse
import java.util.function.Consumer

interface ProductFeedbackService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductFeedbackService

    /**
     * **Alpha:** This endpoint is in active development and may change without notice.
     *
     * Submits concise product feedback with optional non-sensitive client details.
     */
    fun create(params: ProductFeedbackCreateParams): ProductFeedbackCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProductFeedbackCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductFeedbackCreateResponse

    /** **Alpha:** This endpoint is in active development and may change without notice. */
    fun retrieve(id: String): ProductFeedbackRetrieveResponse =
        retrieve(id, ProductFeedbackRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProductFeedbackRetrieveParams = ProductFeedbackRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductFeedbackRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProductFeedbackRetrieveParams = ProductFeedbackRetrieveParams.none(),
    ): ProductFeedbackRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProductFeedbackRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductFeedbackRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ProductFeedbackRetrieveParams): ProductFeedbackRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ProductFeedbackRetrieveResponse =
        retrieve(id, ProductFeedbackRetrieveParams.none(), requestOptions)

    /**
     * A view of [ProductFeedbackService] that provides access to raw HTTP responses for each
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
        ): ProductFeedbackService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/platform/product-feedbacks`, but is
         * otherwise the same as [ProductFeedbackService.create].
         */
        @MustBeClosed
        fun create(
            params: ProductFeedbackCreateParams
        ): HttpResponseFor<ProductFeedbackCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ProductFeedbackCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductFeedbackCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/platform/product-feedbacks/{id}`, but is
         * otherwise the same as [ProductFeedbackService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ProductFeedbackRetrieveResponse> =
            retrieve(id, ProductFeedbackRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ProductFeedbackRetrieveParams = ProductFeedbackRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductFeedbackRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ProductFeedbackRetrieveParams = ProductFeedbackRetrieveParams.none(),
        ): HttpResponseFor<ProductFeedbackRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProductFeedbackRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductFeedbackRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProductFeedbackRetrieveParams
        ): HttpResponseFor<ProductFeedbackRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductFeedbackRetrieveResponse> =
            retrieve(id, ProductFeedbackRetrieveParams.none(), requestOptions)
    }
}
