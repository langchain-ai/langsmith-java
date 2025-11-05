// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.annotationqueues

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.annotationqueues.RunSchemaWithAnnotationQueueInfo
import com.langchain.smith.models.annotationqueues.runs.RunCreateParams
import com.langchain.smith.models.annotationqueues.runs.RunCreateResponse
import com.langchain.smith.models.annotationqueues.runs.RunDeleteAllParams
import com.langchain.smith.models.annotationqueues.runs.RunDeleteAllResponse
import com.langchain.smith.models.annotationqueues.runs.RunDeleteQueueParams
import com.langchain.smith.models.annotationqueues.runs.RunDeleteQueueResponse
import com.langchain.smith.models.annotationqueues.runs.RunListParams
import com.langchain.smith.models.annotationqueues.runs.RunUpdateParams
import com.langchain.smith.models.annotationqueues.runs.RunUpdateResponse
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
    fun deleteAll(queueId: String): CompletableFuture<RunDeleteAllResponse> =
        deleteAll(queueId, RunDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        queueId: String,
        params: RunDeleteAllParams = RunDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunDeleteAllResponse> =
        deleteAll(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        queueId: String,
        params: RunDeleteAllParams = RunDeleteAllParams.none(),
    ): CompletableFuture<RunDeleteAllResponse> = deleteAll(queueId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: RunDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunDeleteAllResponse>

    /** @see deleteAll */
    fun deleteAll(params: RunDeleteAllParams): CompletableFuture<RunDeleteAllResponse> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        queueId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunDeleteAllResponse> =
        deleteAll(queueId, RunDeleteAllParams.none(), requestOptions)

    /** Delete Run From Annotation Queue */
    fun deleteQueue(
        queueRunId: String,
        params: RunDeleteQueueParams,
    ): CompletableFuture<RunDeleteQueueResponse> =
        deleteQueue(queueRunId, params, RequestOptions.none())

    /** @see deleteQueue */
    fun deleteQueue(
        queueRunId: String,
        params: RunDeleteQueueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunDeleteQueueResponse> =
        deleteQueue(params.toBuilder().queueRunId(queueRunId).build(), requestOptions)

    /** @see deleteQueue */
    fun deleteQueue(params: RunDeleteQueueParams): CompletableFuture<RunDeleteQueueResponse> =
        deleteQueue(params, RequestOptions.none())

    /** @see deleteQueue */
    fun deleteQueue(
        params: RunDeleteQueueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunDeleteQueueResponse>

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
         * but is otherwise the same as [RunServiceAsync.deleteAll].
         */
        fun deleteAll(queueId: String): CompletableFuture<HttpResponseFor<RunDeleteAllResponse>> =
            deleteAll(queueId, RunDeleteAllParams.none())

        /** @see deleteAll */
        fun deleteAll(
            queueId: String,
            params: RunDeleteAllParams = RunDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunDeleteAllResponse>> =
            deleteAll(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see deleteAll */
        fun deleteAll(
            queueId: String,
            params: RunDeleteAllParams = RunDeleteAllParams.none(),
        ): CompletableFuture<HttpResponseFor<RunDeleteAllResponse>> =
            deleteAll(queueId, params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            params: RunDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunDeleteAllResponse>>

        /** @see deleteAll */
        fun deleteAll(
            params: RunDeleteAllParams
        ): CompletableFuture<HttpResponseFor<RunDeleteAllResponse>> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            queueId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunDeleteAllResponse>> =
            deleteAll(queueId, RunDeleteAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/annotation-queues/{queue_id}/runs/{queue_run_id}`, but is otherwise the same as
         * [RunServiceAsync.deleteQueue].
         */
        fun deleteQueue(
            queueRunId: String,
            params: RunDeleteQueueParams,
        ): CompletableFuture<HttpResponseFor<RunDeleteQueueResponse>> =
            deleteQueue(queueRunId, params, RequestOptions.none())

        /** @see deleteQueue */
        fun deleteQueue(
            queueRunId: String,
            params: RunDeleteQueueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunDeleteQueueResponse>> =
            deleteQueue(params.toBuilder().queueRunId(queueRunId).build(), requestOptions)

        /** @see deleteQueue */
        fun deleteQueue(
            params: RunDeleteQueueParams
        ): CompletableFuture<HttpResponseFor<RunDeleteQueueResponse>> =
            deleteQueue(params, RequestOptions.none())

        /** @see deleteQueue */
        fun deleteQueue(
            params: RunDeleteQueueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunDeleteQueueResponse>>
    }
}
