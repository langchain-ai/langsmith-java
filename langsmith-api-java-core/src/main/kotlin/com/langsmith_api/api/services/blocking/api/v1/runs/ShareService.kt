// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.runs

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.runs.share.RunShareSchema
import com.langsmith_api.api.models.api.v1.runs.share.ShareCreateParams
import com.langsmith_api.api.models.api.v1.runs.share.ShareDeleteAllParams
import com.langsmith_api.api.models.api.v1.runs.share.ShareDeleteAllResponse
import com.langsmith_api.api.models.api.v1.runs.share.ShareListParams
import java.util.Optional
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

    /** Share a run. */
    fun create(runId: String): RunShareSchema = create(runId, ShareCreateParams.none())

    /** @see create */
    fun create(
        runId: String,
        params: ShareCreateParams = ShareCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunShareSchema = create(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see create */
    fun create(
        runId: String,
        params: ShareCreateParams = ShareCreateParams.none(),
    ): RunShareSchema = create(runId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ShareCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunShareSchema

    /** @see create */
    fun create(params: ShareCreateParams): RunShareSchema = create(params, RequestOptions.none())

    /** @see create */
    fun create(runId: String, requestOptions: RequestOptions): RunShareSchema =
        create(runId, ShareCreateParams.none(), requestOptions)

    /** Get the state of sharing of a run. */
    fun list(runId: String): Optional<RunShareSchema> = list(runId, ShareListParams.none())

    /** @see list */
    fun list(
        runId: String,
        params: ShareListParams = ShareListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Optional<RunShareSchema> = list(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see list */
    fun list(
        runId: String,
        params: ShareListParams = ShareListParams.none(),
    ): Optional<RunShareSchema> = list(runId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ShareListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Optional<RunShareSchema>

    /** @see list */
    fun list(params: ShareListParams): Optional<RunShareSchema> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(runId: String, requestOptions: RequestOptions): Optional<RunShareSchema> =
        list(runId, ShareListParams.none(), requestOptions)

    /** Unshare a run. */
    fun deleteAll(runId: String): ShareDeleteAllResponse =
        deleteAll(runId, ShareDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        runId: String,
        params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShareDeleteAllResponse = deleteAll(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        runId: String,
        params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
    ): ShareDeleteAllResponse = deleteAll(runId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: ShareDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShareDeleteAllResponse

    /** @see deleteAll */
    fun deleteAll(params: ShareDeleteAllParams): ShareDeleteAllResponse =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(runId: String, requestOptions: RequestOptions): ShareDeleteAllResponse =
        deleteAll(runId, ShareDeleteAllParams.none(), requestOptions)

    /** A view of [ShareService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShareService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /api/v1/runs/{run_id}/share`, but is otherwise the
         * same as [ShareService.create].
         */
        @MustBeClosed
        fun create(runId: String): HttpResponseFor<RunShareSchema> =
            create(runId, ShareCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            runId: String,
            params: ShareCreateParams = ShareCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunShareSchema> =
            create(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            runId: String,
            params: ShareCreateParams = ShareCreateParams.none(),
        ): HttpResponseFor<RunShareSchema> = create(runId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunShareSchema>

        /** @see create */
        @MustBeClosed
        fun create(params: ShareCreateParams): HttpResponseFor<RunShareSchema> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(runId: String, requestOptions: RequestOptions): HttpResponseFor<RunShareSchema> =
            create(runId, ShareCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/{run_id}/share`, but is otherwise the
         * same as [ShareService.list].
         */
        @MustBeClosed
        fun list(runId: String): HttpResponseFor<Optional<RunShareSchema>> =
            list(runId, ShareListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            runId: String,
            params: ShareListParams = ShareListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Optional<RunShareSchema>> =
            list(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            runId: String,
            params: ShareListParams = ShareListParams.none(),
        ): HttpResponseFor<Optional<RunShareSchema>> = list(runId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ShareListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Optional<RunShareSchema>>

        /** @see list */
        @MustBeClosed
        fun list(params: ShareListParams): HttpResponseFor<Optional<RunShareSchema>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            runId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Optional<RunShareSchema>> =
            list(runId, ShareListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/runs/{run_id}/share`, but is otherwise
         * the same as [ShareService.deleteAll].
         */
        @MustBeClosed
        fun deleteAll(runId: String): HttpResponseFor<ShareDeleteAllResponse> =
            deleteAll(runId, ShareDeleteAllParams.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            runId: String,
            params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShareDeleteAllResponse> =
            deleteAll(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            runId: String,
            params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
        ): HttpResponseFor<ShareDeleteAllResponse> = deleteAll(runId, params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: ShareDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShareDeleteAllResponse>

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(params: ShareDeleteAllParams): HttpResponseFor<ShareDeleteAllResponse> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            runId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShareDeleteAllResponse> =
            deleteAll(runId, ShareDeleteAllParams.none(), requestOptions)
    }
}
