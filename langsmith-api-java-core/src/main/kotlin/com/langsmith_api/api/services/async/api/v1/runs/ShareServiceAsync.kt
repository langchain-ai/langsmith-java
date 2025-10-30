// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.runs

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.runs.share.RunShareSchema
import com.langsmith_api.api.models.api.v1.runs.share.ShareCreateParams
import com.langsmith_api.api.models.api.v1.runs.share.ShareDeleteAllParams
import com.langsmith_api.api.models.api.v1.runs.share.ShareDeleteAllResponse
import com.langsmith_api.api.models.api.v1.runs.share.ShareListParams
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ShareServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShareServiceAsync

    /** Share a run. */
    fun create(runId: String): CompletableFuture<RunShareSchema> =
        create(runId, ShareCreateParams.none())

    /** @see create */
    fun create(
        runId: String,
        params: ShareCreateParams = ShareCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunShareSchema> =
        create(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see create */
    fun create(
        runId: String,
        params: ShareCreateParams = ShareCreateParams.none(),
    ): CompletableFuture<RunShareSchema> = create(runId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ShareCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunShareSchema>

    /** @see create */
    fun create(params: ShareCreateParams): CompletableFuture<RunShareSchema> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(runId: String, requestOptions: RequestOptions): CompletableFuture<RunShareSchema> =
        create(runId, ShareCreateParams.none(), requestOptions)

    /** Get the state of sharing of a run. */
    fun list(runId: String): CompletableFuture<Optional<RunShareSchema>> =
        list(runId, ShareListParams.none())

    /** @see list */
    fun list(
        runId: String,
        params: ShareListParams = ShareListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Optional<RunShareSchema>> =
        list(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see list */
    fun list(
        runId: String,
        params: ShareListParams = ShareListParams.none(),
    ): CompletableFuture<Optional<RunShareSchema>> = list(runId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ShareListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Optional<RunShareSchema>>

    /** @see list */
    fun list(params: ShareListParams): CompletableFuture<Optional<RunShareSchema>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        runId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Optional<RunShareSchema>> =
        list(runId, ShareListParams.none(), requestOptions)

    /** Unshare a run. */
    fun deleteAll(runId: String): CompletableFuture<ShareDeleteAllResponse> =
        deleteAll(runId, ShareDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        runId: String,
        params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShareDeleteAllResponse> =
        deleteAll(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        runId: String,
        params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
    ): CompletableFuture<ShareDeleteAllResponse> = deleteAll(runId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: ShareDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShareDeleteAllResponse>

    /** @see deleteAll */
    fun deleteAll(params: ShareDeleteAllParams): CompletableFuture<ShareDeleteAllResponse> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        runId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ShareDeleteAllResponse> =
        deleteAll(runId, ShareDeleteAllParams.none(), requestOptions)

    /** A view of [ShareServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ShareServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /api/v1/runs/{run_id}/share`, but is otherwise the
         * same as [ShareServiceAsync.create].
         */
        fun create(runId: String): CompletableFuture<HttpResponseFor<RunShareSchema>> =
            create(runId, ShareCreateParams.none())

        /** @see create */
        fun create(
            runId: String,
            params: ShareCreateParams = ShareCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunShareSchema>> =
            create(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see create */
        fun create(
            runId: String,
            params: ShareCreateParams = ShareCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<RunShareSchema>> =
            create(runId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunShareSchema>>

        /** @see create */
        fun create(params: ShareCreateParams): CompletableFuture<HttpResponseFor<RunShareSchema>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            runId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunShareSchema>> =
            create(runId, ShareCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/{run_id}/share`, but is otherwise the
         * same as [ShareServiceAsync.list].
         */
        fun list(runId: String): CompletableFuture<HttpResponseFor<Optional<RunShareSchema>>> =
            list(runId, ShareListParams.none())

        /** @see list */
        fun list(
            runId: String,
            params: ShareListParams = ShareListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Optional<RunShareSchema>>> =
            list(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see list */
        fun list(
            runId: String,
            params: ShareListParams = ShareListParams.none(),
        ): CompletableFuture<HttpResponseFor<Optional<RunShareSchema>>> =
            list(runId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ShareListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Optional<RunShareSchema>>>

        /** @see list */
        fun list(
            params: ShareListParams
        ): CompletableFuture<HttpResponseFor<Optional<RunShareSchema>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            runId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Optional<RunShareSchema>>> =
            list(runId, ShareListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/runs/{run_id}/share`, but is otherwise
         * the same as [ShareServiceAsync.deleteAll].
         */
        fun deleteAll(runId: String): CompletableFuture<HttpResponseFor<ShareDeleteAllResponse>> =
            deleteAll(runId, ShareDeleteAllParams.none())

        /** @see deleteAll */
        fun deleteAll(
            runId: String,
            params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShareDeleteAllResponse>> =
            deleteAll(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see deleteAll */
        fun deleteAll(
            runId: String,
            params: ShareDeleteAllParams = ShareDeleteAllParams.none(),
        ): CompletableFuture<HttpResponseFor<ShareDeleteAllResponse>> =
            deleteAll(runId, params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            params: ShareDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShareDeleteAllResponse>>

        /** @see deleteAll */
        fun deleteAll(
            params: ShareDeleteAllParams
        ): CompletableFuture<HttpResponseFor<ShareDeleteAllResponse>> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            runId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ShareDeleteAllResponse>> =
            deleteAll(runId, ShareDeleteAllParams.none(), requestOptions)
    }
}
