// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.examples

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.examples.bulk.BulkCreateParams
import com.langchain.smith.models.examples.bulk.BulkCreateResponse
import com.langchain.smith.models.examples.bulk.BulkPatchAllParams
import com.langchain.smith.models.examples.bulk.BulkPatchAllResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BulkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkServiceAsync

    /** Create a new example. */
    fun create(): CompletableFuture<BulkCreateResponse> = create(BulkCreateParams.none())

    /** @see create */
    fun create(
        params: BulkCreateParams = BulkCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkCreateResponse>

    /** @see create */
    fun create(
        params: BulkCreateParams = BulkCreateParams.none()
    ): CompletableFuture<BulkCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<BulkCreateResponse> =
        create(BulkCreateParams.none(), requestOptions)

    /**
     * Legacy update examples in bulk. For update involving attachments, use PATCH
     * /v1/platform/datasets/{dataset_id}/examples instead.
     */
    fun patchAll(params: BulkPatchAllParams): CompletableFuture<BulkPatchAllResponse> =
        patchAll(params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        params: BulkPatchAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkPatchAllResponse>

    /** A view of [BulkServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/examples/bulk`, but is otherwise the same
         * as [BulkServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<BulkCreateResponse>> =
            create(BulkCreateParams.none())

        /** @see create */
        fun create(
            params: BulkCreateParams = BulkCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkCreateResponse>>

        /** @see create */
        fun create(
            params: BulkCreateParams = BulkCreateParams.none()
        ): CompletableFuture<HttpResponseFor<BulkCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BulkCreateResponse>> =
            create(BulkCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/examples/bulk`, but is otherwise the same
         * as [BulkServiceAsync.patchAll].
         */
        fun patchAll(
            params: BulkPatchAllParams
        ): CompletableFuture<HttpResponseFor<BulkPatchAllResponse>> =
            patchAll(params, RequestOptions.none())

        /** @see patchAll */
        fun patchAll(
            params: BulkPatchAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkPatchAllResponse>>
    }
}
