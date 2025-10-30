// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.annotationqueues

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.annotationqueues.RunSchemaWithAnnotationQueueInfo
import com.langsmith_api.api.models.api.v1.annotationqueues.runs.RunCreateParams
import com.langsmith_api.api.models.api.v1.annotationqueues.runs.RunCreateResponse
import com.langsmith_api.api.models.api.v1.annotationqueues.runs.RunDeleteParams
import com.langsmith_api.api.models.api.v1.annotationqueues.runs.RunDeleteResponse
import com.langsmith_api.api.models.api.v1.annotationqueues.runs.RunListParams
import com.langsmith_api.api.models.api.v1.annotationqueues.runs.RunUpdateParams
import com.langsmith_api.api.models.api.v1.annotationqueues.runs.RunUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RunServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync

    /** Add Runs To Annotation Queue */
    fun create(
        queueId: String,
        params: RunCreateParams,
    ): CompletableFuture<List<RunCreateResponse>> = create(queueId, params, RequestOptions.none())

    /** @see create */
    fun create(
        queueId: String,
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RunCreateResponse>> =
        create(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see create */
    fun create(params: RunCreateParams): CompletableFuture<List<RunCreateResponse>> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RunCreateResponse>>

    /** Update Run In Annotation Queue */
    fun update(queueRunId: String, params: RunUpdateParams): CompletableFuture<RunUpdateResponse> =
        update(queueRunId, params, RequestOptions.none())

    /** @see update */
    fun update(
        queueRunId: String,
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunUpdateResponse> =
        update(params.toBuilder().queueRunId(queueRunId).build(), requestOptions)

    /** @see update */
    fun update(params: RunUpdateParams): CompletableFuture<RunUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunUpdateResponse>

    /** Get Runs From Annotation Queue */
    fun list(queueId: String): CompletableFuture<List<RunSchemaWithAnnotationQueueInfo>> =
        list(queueId, RunListParams.none())

    /** @see list */
    fun list(
        queueId: String,
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RunSchemaWithAnnotationQueueInfo>> =
        list(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see list */
    fun list(
        queueId: String,
        params: RunListParams = RunListParams.none(),
    ): CompletableFuture<List<RunSchemaWithAnnotationQueueInfo>> =
        list(queueId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RunSchemaWithAnnotationQueueInfo>>

    /** @see list */
    fun list(params: RunListParams): CompletableFuture<List<RunSchemaWithAnnotationQueueInfo>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        queueId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<RunSchemaWithAnnotationQueueInfo>> =
        list(queueId, RunListParams.none(), requestOptions)

    /** Delete Runs From Annotation Queue */
    fun delete(queueId: String): CompletableFuture<RunDeleteResponse> =
        delete(queueId, RunDeleteParams.none())

    /** @see delete */
    fun delete(
        queueId: String,
        params: RunDeleteParams = RunDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunDeleteResponse> =
        delete(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see delete */
    fun delete(
        queueId: String,
        params: RunDeleteParams = RunDeleteParams.none(),
    ): CompletableFuture<RunDeleteResponse> = delete(queueId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RunDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunDeleteResponse>

    /** @see delete */
    fun delete(params: RunDeleteParams): CompletableFuture<RunDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        queueId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunDeleteResponse> =
        delete(queueId, RunDeleteParams.none(), requestOptions)

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues/{queue_id}/runs`, but is
         * otherwise the same as [RunServiceAsync.create].
         */
        fun create(
            queueId: String,
            params: RunCreateParams,
        ): CompletableFuture<HttpResponseFor<List<RunCreateResponse>>> =
            create(queueId, params, RequestOptions.none())

        /** @see create */
        fun create(
            queueId: String,
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RunCreateResponse>>> =
            create(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see create */
        fun create(
            params: RunCreateParams
        ): CompletableFuture<HttpResponseFor<List<RunCreateResponse>>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RunCreateResponse>>>

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/annotation-queues/{queue_id}/runs/{queue_run_id}`, but is otherwise the same as
         * [RunServiceAsync.update].
         */
        fun update(
            queueRunId: String,
            params: RunUpdateParams,
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(queueRunId, params, RequestOptions.none())

        /** @see update */
        fun update(
            queueRunId: String,
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(params.toBuilder().queueRunId(queueRunId).build(), requestOptions)

        /** @see update */
        fun update(params: RunUpdateParams): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}/runs`, but is
         * otherwise the same as [RunServiceAsync.list].
         */
        fun list(
            queueId: String
        ): CompletableFuture<HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>>> =
            list(queueId, RunListParams.none())

        /** @see list */
        fun list(
            queueId: String,
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>>> =
            list(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see list */
        fun list(
            queueId: String,
            params: RunListParams = RunListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>>> =
            list(queueId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>>>

        /** @see list */
        fun list(
            params: RunListParams
        ): CompletableFuture<HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            queueId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>>> =
            list(queueId, RunListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues/{queue_id}/runs/delete`,
         * but is otherwise the same as [RunServiceAsync.delete].
         */
        fun delete(queueId: String): CompletableFuture<HttpResponseFor<RunDeleteResponse>> =
            delete(queueId, RunDeleteParams.none())

        /** @see delete */
        fun delete(
            queueId: String,
            params: RunDeleteParams = RunDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunDeleteResponse>> =
            delete(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see delete */
        fun delete(
            queueId: String,
            params: RunDeleteParams = RunDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<RunDeleteResponse>> =
            delete(queueId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RunDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunDeleteResponse>>

        /** @see delete */
        fun delete(params: RunDeleteParams): CompletableFuture<HttpResponseFor<RunDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            queueId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunDeleteResponse>> =
            delete(queueId, RunDeleteParams.none(), requestOptions)
    }
}
