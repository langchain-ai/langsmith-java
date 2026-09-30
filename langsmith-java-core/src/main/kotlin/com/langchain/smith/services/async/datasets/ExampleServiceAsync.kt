// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.models.datasets.examples.ExampleDeleteParams
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
     * Soft-delete an example, preserving prior versions and their attachments. If the latest
     * version is already deleted, the request succeeds without creating another version. Deletion
     * is recorded at the current time or just after the latest version, whichever is later. For
     * future-dated versions, latest reads reflect deletion immediately; timestamp reads reflect
     * deletion only at or after the recorded deletion timestamp.
     */
    fun delete(exampleId: String, params: ExampleDeleteParams): CompletableFuture<Void?> =
        delete(exampleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        exampleId: String,
        params: ExampleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().exampleId(exampleId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ExampleDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ExampleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

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
         * Returns a raw HTTP response for `delete
         * /api/v1/platform/datasets/{dataset_id}/examples/{example_id}`, but is otherwise the same
         * as [ExampleServiceAsync.delete].
         */
        fun delete(
            exampleId: String,
            params: ExampleDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(exampleId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            exampleId: String,
            params: ExampleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().exampleId(exampleId).build(), requestOptions)

        /** @see delete */
        fun delete(params: ExampleDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ExampleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
