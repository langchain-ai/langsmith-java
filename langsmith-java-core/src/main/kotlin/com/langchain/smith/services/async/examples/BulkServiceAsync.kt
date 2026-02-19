// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.examples

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.examples.bulk.BulkCreateParams
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

    /** Create bulk examples. */
    fun create(params: BulkCreateParams): CompletableFuture<List<Example>> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BulkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Example>>

    /** @see create */
    fun create(
        body: List<BulkCreateParams.Body>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Example>> =
        create(BulkCreateParams.builder().body(body).build(), requestOptions)

    /** @see create */
    fun create(body: List<BulkCreateParams.Body>): CompletableFuture<List<Example>> =
        create(body, RequestOptions.none())

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

    /** @see patchAll */
    fun patchAll(
        body: List<BulkPatchAllParams.Body>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkPatchAllResponse> =
        patchAll(BulkPatchAllParams.builder().body(body).build(), requestOptions)

    /** @see patchAll */
    fun patchAll(body: List<BulkPatchAllParams.Body>): CompletableFuture<BulkPatchAllResponse> =
        patchAll(body, RequestOptions.none())

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
        fun create(params: BulkCreateParams): CompletableFuture<HttpResponseFor<List<Example>>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BulkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Example>>>

        /** @see create */
        fun create(
            body: List<BulkCreateParams.Body>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Example>>> =
            create(BulkCreateParams.builder().body(body).build(), requestOptions)

        /** @see create */
        fun create(
            body: List<BulkCreateParams.Body>
        ): CompletableFuture<HttpResponseFor<List<Example>>> = create(body, RequestOptions.none())

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

        /** @see patchAll */
        fun patchAll(
            body: List<BulkPatchAllParams.Body>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkPatchAllResponse>> =
            patchAll(BulkPatchAllParams.builder().body(body).build(), requestOptions)

        /** @see patchAll */
        fun patchAll(
            body: List<BulkPatchAllParams.Body>
        ): CompletableFuture<HttpResponseFor<BulkPatchAllResponse>> =
            patchAll(body, RequestOptions.none())
    }
}
