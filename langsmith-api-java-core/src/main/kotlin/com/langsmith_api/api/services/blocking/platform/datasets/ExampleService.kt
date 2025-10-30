// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.platform.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.platform.datasets.examples.ExampleHardDeleteParams
import com.langsmith_api.api.models.platform.datasets.examples.ExampleHardDeleteResponse
import com.langsmith_api.api.models.platform.datasets.examples.ExampleUpdateParams
import com.langsmith_api.api.models.platform.datasets.examples.ExampleUpdateResponse
import com.langsmith_api.api.models.platform.datasets.examples.ExampleUploadParams
import com.langsmith_api.api.models.platform.datasets.examples.ExampleUploadResponse
import java.util.function.Consumer

interface ExampleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleService

    /**
     * This endpoint allows clients to update existing examples in a specified dataset by sending a
     * multipart/form-data PATCH request. Each form part contains either JSON-encoded data or binary
     * attachment files to update an example.
     */
    fun update(datasetId: JsonValue, params: ExampleUpdateParams): ExampleUpdateResponse =
        update(datasetId, params, RequestOptions.none())

    /** @see update */
    fun update(
        datasetId: JsonValue,
        params: ExampleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleUpdateResponse =
        update(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see update */
    fun update(params: ExampleUpdateParams): ExampleUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ExampleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleUpdateResponse

    /**
     * This endpoint hard deletes *all* versions of a dataset example(s). Deletion is performed by
     * setting inputs, outputs, and metadata to null and deleting attachment files while keeping the
     * example ID, dataset ID, and creation timestamp. IMPORTANT: attachment files can take up to 7
     * days to be deleted. inputs, outputs and metadata are nullified immediately.
     */
    fun hardDelete(params: ExampleHardDeleteParams): ExampleHardDeleteResponse =
        hardDelete(params, RequestOptions.none())

    /** @see hardDelete */
    fun hardDelete(
        params: ExampleHardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleHardDeleteResponse

    /**
     * This endpoint allows clients to upload examples to a specified dataset by sending a
     * multipart/form-data POST request. Each form part contains either JSON-encoded data or binary
     * attachment files associated with an example.
     */
    fun upload(datasetId: JsonValue, params: ExampleUploadParams): ExampleUploadResponse =
        upload(datasetId, params, RequestOptions.none())

    /** @see upload */
    fun upload(
        datasetId: JsonValue,
        params: ExampleUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleUploadResponse =
        upload(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see upload */
    fun upload(params: ExampleUploadParams): ExampleUploadResponse =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: ExampleUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleUploadResponse

    /** A view of [ExampleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /v1/platform/datasets/{dataset_id}/examples`, but
         * is otherwise the same as [ExampleService.update].
         */
        @MustBeClosed
        fun update(
            datasetId: JsonValue,
            params: ExampleUpdateParams,
        ): HttpResponseFor<ExampleUpdateResponse> = update(datasetId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            datasetId: JsonValue,
            params: ExampleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleUpdateResponse> =
            update(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ExampleUpdateParams): HttpResponseFor<ExampleUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ExampleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleUpdateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/platform/datasets/examples/delete`, but is
         * otherwise the same as [ExampleService.hardDelete].
         */
        @MustBeClosed
        fun hardDelete(
            params: ExampleHardDeleteParams
        ): HttpResponseFor<ExampleHardDeleteResponse> = hardDelete(params, RequestOptions.none())

        /** @see hardDelete */
        @MustBeClosed
        fun hardDelete(
            params: ExampleHardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleHardDeleteResponse>

        /**
         * Returns a raw HTTP response for `post /v1/platform/datasets/{dataset_id}/examples`, but
         * is otherwise the same as [ExampleService.upload].
         */
        @MustBeClosed
        fun upload(
            datasetId: JsonValue,
            params: ExampleUploadParams,
        ): HttpResponseFor<ExampleUploadResponse> = upload(datasetId, params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            datasetId: JsonValue,
            params: ExampleUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleUploadResponse> =
            upload(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        fun upload(params: ExampleUploadParams): HttpResponseFor<ExampleUploadResponse> =
            upload(params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: ExampleUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleUploadResponse>
    }
}
