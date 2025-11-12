// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.examples

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.examples.bulk.BulkCreateParams
import com.langchain.smith.models.examples.bulk.BulkPatchAllParams
import com.langchain.smith.models.examples.bulk.BulkPatchAllResponse
import java.util.function.Consumer

interface BulkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkService

    /** Create bulk examples. */
    fun create(params: BulkCreateParams): List<Example> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BulkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Example>

    /**
     * Legacy update examples in bulk. For update involving attachments, use PATCH
     * /v1/platform/datasets/{dataset_id}/examples instead.
     */
    fun patchAll(params: BulkPatchAllParams): BulkPatchAllResponse =
        patchAll(params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        params: BulkPatchAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkPatchAllResponse

    /** A view of [BulkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/examples/bulk`, but is otherwise the same
         * as [BulkService.create].
         */
        @MustBeClosed
        fun create(params: BulkCreateParams): HttpResponseFor<List<Example>> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BulkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Example>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/examples/bulk`, but is otherwise the same
         * as [BulkService.patchAll].
         */
        @MustBeClosed
        fun patchAll(params: BulkPatchAllParams): HttpResponseFor<BulkPatchAllResponse> =
            patchAll(params, RequestOptions.none())

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            params: BulkPatchAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkPatchAllResponse>
    }
}
