// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.platform.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.platform.datasets.examples.ExampleHardDeleteParams
import com.langchain.smith.models.platform.datasets.examples.ExampleHardDeleteResponse
import com.langchain.smith.models.platform.datasets.examples.ExampleUpdateParams
import com.langchain.smith.models.platform.datasets.examples.ExampleUpdateResponse
import com.langchain.smith.models.platform.datasets.examples.ExampleUploadParams
import com.langchain.smith.models.platform.datasets.examples.ExampleUploadResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExampleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleServiceAsync

    /**
     * This endpoint allows clients to update existing examples in a specified dataset by sending a
     * multipart/form-data PATCH request. Each form part contains either JSON-encoded data or binary
     * attachment files to update an example.
     */
    fun update(
        datasetId: JsonValue,
        params: ExampleUpdateParams,
    ): CompletableFuture<ExampleUpdateResponse> = update(datasetId, params, RequestOptions.none())

    /** @see update */
    fun update(
        datasetId: JsonValue,
        params: ExampleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExampleUpdateResponse> =
        update(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see update */
    fun update(params: ExampleUpdateParams): CompletableFuture<ExampleUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ExampleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExampleUpdateResponse>

    /**
     * This endpoint hard deletes *all* versions of a dataset example(s). Deletion is performed by
     * setting inputs, outputs, and metadata to null and deleting attachment files while keeping the
     * example ID, dataset ID, and creation timestamp. IMPORTANT: attachment files can take up to 7
     * days to be deleted. inputs, outputs and metadata are nullified immediately.
     */
    fun hardDelete(params: ExampleHardDeleteParams): CompletableFuture<ExampleHardDeleteResponse> =
        hardDelete(params, RequestOptions.none())

    /** @see hardDelete */
    fun hardDelete(
        params: ExampleHardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExampleHardDeleteResponse>

    /**
     * This endpoint allows clients to upload examples to a specified dataset by sending a
     * multipart/form-data POST request. Each form part contains either JSON-encoded data or binary
     * attachment files associated with an example.
     */
    fun upload(
        datasetId: JsonValue,
        params: ExampleUploadParams,
    ): CompletableFuture<ExampleUploadResponse> = upload(datasetId, params, RequestOptions.none())

    /** @see upload */
    fun upload(
        datasetId: JsonValue,
        params: ExampleUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExampleUploadResponse> =
        upload(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see upload */
    fun upload(params: ExampleUploadParams): CompletableFuture<ExampleUploadResponse> =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: ExampleUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExampleUploadResponse>

    /**
     * A view of [ExampleServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExampleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /v1/platform/datasets/{dataset_id}/examples`, but
         * is otherwise the same as [ExampleServiceAsync.update].
         */
        fun update(
            datasetId: JsonValue,
            params: ExampleUpdateParams,
        ): CompletableFuture<HttpResponseFor<ExampleUpdateResponse>> =
            update(datasetId, params, RequestOptions.none())

        /** @see update */
        fun update(
            datasetId: JsonValue,
            params: ExampleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExampleUpdateResponse>> =
            update(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ExampleUpdateParams
        ): CompletableFuture<HttpResponseFor<ExampleUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ExampleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExampleUpdateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/platform/datasets/examples/delete`, but is
         * otherwise the same as [ExampleServiceAsync.hardDelete].
         */
        fun hardDelete(
            params: ExampleHardDeleteParams
        ): CompletableFuture<HttpResponseFor<ExampleHardDeleteResponse>> =
            hardDelete(params, RequestOptions.none())

        /** @see hardDelete */
        fun hardDelete(
            params: ExampleHardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExampleHardDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/platform/datasets/{dataset_id}/examples`, but
         * is otherwise the same as [ExampleServiceAsync.upload].
         */
        fun upload(
            datasetId: JsonValue,
            params: ExampleUploadParams,
        ): CompletableFuture<HttpResponseFor<ExampleUploadResponse>> =
            upload(datasetId, params, RequestOptions.none())

        /** @see upload */
        fun upload(
            datasetId: JsonValue,
            params: ExampleUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExampleUploadResponse>> =
            upload(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see upload */
        fun upload(
            params: ExampleUploadParams
        ): CompletableFuture<HttpResponseFor<ExampleUploadResponse>> =
            upload(params, RequestOptions.none())

        /** @see upload */
        fun upload(
            params: ExampleUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExampleUploadResponse>>
    }
}
