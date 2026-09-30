// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.models.datasets.examples.ExampleDeleteParams
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
    }
}
