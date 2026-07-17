// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.runs

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.runs.share.ShareCreateParams
import com.langchain.smith.models.runs.share.ShareCreateResponse
import com.langchain.smith.models.runs.share.ShareDeleteParams
import java.util.function.Consumer

interface ShareService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShareService

    /** Creates or returns a share token for a run. Child runs share their trace root. */
    fun create(runId: String): ShareCreateResponse = create(runId, ShareCreateParams.none())

    /** @see create */
    fun create(
        runId: String,
        params: ShareCreateParams = ShareCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShareCreateResponse = create(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see create */
    fun create(
        runId: String,
        params: ShareCreateParams = ShareCreateParams.none(),
    ): ShareCreateResponse = create(runId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ShareCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShareCreateResponse

    /** @see create */
    fun create(params: ShareCreateParams): ShareCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(runId: String, requestOptions: RequestOptions): ShareCreateResponse =
        create(runId, ShareCreateParams.none(), requestOptions)

    /**
     * Deletes the share token for the trace identified by trace_id and session_id. Idempotent:
     * returns 204 whether or not a share token existed.
     */
    fun delete(traceId: String) = delete(traceId, ShareDeleteParams.none())

    /** @see delete */
    fun delete(
        traceId: String,
        params: ShareDeleteParams = ShareDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().traceId(traceId).build(), requestOptions)

    /** @see delete */
    fun delete(traceId: String, params: ShareDeleteParams = ShareDeleteParams.none()) =
        delete(traceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ShareDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ShareDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(traceId: String, requestOptions: RequestOptions) =
        delete(traceId, ShareDeleteParams.none(), requestOptions)

    /** A view of [ShareService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShareService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/runs/{run_id}/share`, but is otherwise the same
         * as [ShareService.create].
         */
        @MustBeClosed
        fun create(runId: String): HttpResponseFor<ShareCreateResponse> =
            create(runId, ShareCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            runId: String,
            params: ShareCreateParams = ShareCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShareCreateResponse> =
            create(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            runId: String,
            params: ShareCreateParams = ShareCreateParams.none(),
        ): HttpResponseFor<ShareCreateResponse> = create(runId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShareCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(params: ShareCreateParams): HttpResponseFor<ShareCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            runId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShareCreateResponse> =
            create(runId, ShareCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/runs/{trace_id}/share`, but is otherwise the
         * same as [ShareService.delete].
         */
        @MustBeClosed
        fun delete(traceId: String): HttpResponse = delete(traceId, ShareDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            traceId: String,
            params: ShareDeleteParams = ShareDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().traceId(traceId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            traceId: String,
            params: ShareDeleteParams = ShareDeleteParams.none(),
        ): HttpResponse = delete(traceId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ShareDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ShareDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(traceId: String, requestOptions: RequestOptions): HttpResponse =
            delete(traceId, ShareDeleteParams.none(), requestOptions)
    }
}
