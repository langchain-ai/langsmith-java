// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.examples.ExampleDeleteParams
import com.langchain.smith.models.datasets.examples.ExampleUpdateMetadataParams
import com.langchain.smith.models.datasets.examples.ExampleUpdateMetadataResponse
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
     * Soft-delete an example, preserving prior versions and their attachments. If the latest
     * version is already deleted, the request succeeds without creating another version. Deletion
     * is recorded at the current time or just after the latest version, whichever is later. For
     * future-dated versions, latest reads reflect deletion immediately; timestamp reads reflect
     * deletion only at or after the recorded deletion timestamp.
     */
    fun delete(exampleId: String, params: ExampleDeleteParams) =
        delete(exampleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        exampleId: String,
        params: ExampleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().exampleId(exampleId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ExampleDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ExampleDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Applies the same metadata changes, in order, to every listed example in a dataset. Examples
     * that are not in the dataset or were deleted are skipped; the rest are updated together, so if
     * the update fails none of them change. Answers 207 with one status per submitted example ID:
     * UPDATED, or NOT_FOUND for a skipped example. Metadata keys the operations do not name keep
     * their values. To add examples to a split or remove them from one, use ARRAY_ADD or
     * ARRAY_REMOVE on the dataset_split key. Requires permission to update datasets.
     */
    fun updateMetadata(
        datasetId: String,
        params: ExampleUpdateMetadataParams,
    ): ExampleUpdateMetadataResponse = updateMetadata(datasetId, params, RequestOptions.none())

    /** @see updateMetadata */
    fun updateMetadata(
        datasetId: String,
        params: ExampleUpdateMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleUpdateMetadataResponse =
        updateMetadata(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see updateMetadata */
    fun updateMetadata(params: ExampleUpdateMetadataParams): ExampleUpdateMetadataResponse =
        updateMetadata(params, RequestOptions.none())

    /** @see updateMetadata */
    fun updateMetadata(
        params: ExampleUpdateMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleUpdateMetadataResponse

    /** A view of [ExampleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/platform/datasets/{dataset_id}/examples/{example_id}`, but is otherwise the same
         * as [ExampleService.delete].
         */
        @MustBeClosed
        fun delete(exampleId: String, params: ExampleDeleteParams): HttpResponse =
            delete(exampleId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            exampleId: String,
            params: ExampleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().exampleId(exampleId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ExampleDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ExampleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/platform/datasets/{dataset_id}/examples/metadata`, but is otherwise the same as
         * [ExampleService.updateMetadata].
         */
        @MustBeClosed
        fun updateMetadata(
            datasetId: String,
            params: ExampleUpdateMetadataParams,
        ): HttpResponseFor<ExampleUpdateMetadataResponse> =
            updateMetadata(datasetId, params, RequestOptions.none())

        /** @see updateMetadata */
        @MustBeClosed
        fun updateMetadata(
            datasetId: String,
            params: ExampleUpdateMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleUpdateMetadataResponse> =
            updateMetadata(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see updateMetadata */
        @MustBeClosed
        fun updateMetadata(
            params: ExampleUpdateMetadataParams
        ): HttpResponseFor<ExampleUpdateMetadataResponse> =
            updateMetadata(params, RequestOptions.none())

        /** @see updateMetadata */
        @MustBeClosed
        fun updateMetadata(
            params: ExampleUpdateMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleUpdateMetadataResponse>
    }
}
