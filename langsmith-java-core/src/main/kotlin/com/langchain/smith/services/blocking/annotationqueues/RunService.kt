// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.annotationqueues

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface RunService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService

    /** Add Runs To Annotation Queue */
    fun create(queueId: String, params: RunCreateParams): List<RunCreateResponse> =
        create(queueId, params, RequestOptions.none())

    /** @see create */
    fun create(
        queueId: String,
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RunCreateResponse> = create(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see create */
    fun create(params: RunCreateParams): List<RunCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RunCreateResponse>

    /** Update Run In Annotation Queue */
    fun update(queueRunId: String, params: RunUpdateParams): RunUpdateResponse =
        update(queueRunId, params, RequestOptions.none())

    /** @see update */
    fun update(
        queueRunId: String,
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunUpdateResponse = update(params.toBuilder().queueRunId(queueRunId).build(), requestOptions)

    /** @see update */
    fun update(params: RunUpdateParams): RunUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunUpdateResponse

    /** Get Runs From Annotation Queue */
    fun list(queueId: String): List<RunSchemaWithAnnotationQueueInfo> =
        list(queueId, RunListParams.none())

    /** @see list */
    fun list(
        queueId: String,
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RunSchemaWithAnnotationQueueInfo> =
        list(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see list */
    fun list(
        queueId: String,
        params: RunListParams = RunListParams.none(),
    ): List<RunSchemaWithAnnotationQueueInfo> = list(queueId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RunSchemaWithAnnotationQueueInfo>

    /** @see list */
    fun list(params: RunListParams): List<RunSchemaWithAnnotationQueueInfo> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        queueId: String,
        requestOptions: RequestOptions,
    ): List<RunSchemaWithAnnotationQueueInfo> = list(queueId, RunListParams.none(), requestOptions)

    /** Delete Runs From Annotation Queue */
    fun deleteAll(queueId: String): RunDeleteAllResponse =
        deleteAll(queueId, RunDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        queueId: String,
        params: RunDeleteAllParams = RunDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunDeleteAllResponse = deleteAll(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        queueId: String,
        params: RunDeleteAllParams = RunDeleteAllParams.none(),
    ): RunDeleteAllResponse = deleteAll(queueId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: RunDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunDeleteAllResponse

    /** @see deleteAll */
    fun deleteAll(params: RunDeleteAllParams): RunDeleteAllResponse =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(queueId: String, requestOptions: RequestOptions): RunDeleteAllResponse =
        deleteAll(queueId, RunDeleteAllParams.none(), requestOptions)

    /** Delete Run From Annotation Queue */
    fun deleteQueue(queueRunId: String, params: RunDeleteQueueParams): RunDeleteQueueResponse =
        deleteQueue(queueRunId, params, RequestOptions.none())

    /** @see deleteQueue */
    fun deleteQueue(
        queueRunId: String,
        params: RunDeleteQueueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunDeleteQueueResponse =
        deleteQueue(params.toBuilder().queueRunId(queueRunId).build(), requestOptions)

    /** @see deleteQueue */
    fun deleteQueue(params: RunDeleteQueueParams): RunDeleteQueueResponse =
        deleteQueue(params, RequestOptions.none())

    /** @see deleteQueue */
    fun deleteQueue(
        params: RunDeleteQueueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunDeleteQueueResponse

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues/{queue_id}/runs`, but is
         * otherwise the same as [RunService.create].
         */
        @MustBeClosed
        fun create(
            queueId: String,
            params: RunCreateParams,
        ): HttpResponseFor<List<RunCreateResponse>> = create(queueId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            queueId: String,
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RunCreateResponse>> =
            create(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: RunCreateParams): HttpResponseFor<List<RunCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RunCreateResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/annotation-queues/{queue_id}/runs/{queue_run_id}`, but is otherwise the same as
         * [RunService.update].
         */
        @MustBeClosed
        fun update(
            queueRunId: String,
            params: RunUpdateParams,
        ): HttpResponseFor<RunUpdateResponse> = update(queueRunId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            queueRunId: String,
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunUpdateResponse> =
            update(params.toBuilder().queueRunId(queueRunId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: RunUpdateParams): HttpResponseFor<RunUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}/runs`, but is
         * otherwise the same as [RunService.list].
         */
        @MustBeClosed
        fun list(queueId: String): HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>> =
            list(queueId, RunListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            queueId: String,
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>> =
            list(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            queueId: String,
            params: RunListParams = RunListParams.none(),
        ): HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>> =
            list(queueId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>>

        /** @see list */
        @MustBeClosed
        fun list(params: RunListParams): HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            queueId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>> =
            list(queueId, RunListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues/{queue_id}/runs/delete`,
         * but is otherwise the same as [RunService.deleteAll].
         */
        @MustBeClosed
        fun deleteAll(queueId: String): HttpResponseFor<RunDeleteAllResponse> =
            deleteAll(queueId, RunDeleteAllParams.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            queueId: String,
            params: RunDeleteAllParams = RunDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunDeleteAllResponse> =
            deleteAll(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            queueId: String,
            params: RunDeleteAllParams = RunDeleteAllParams.none(),
        ): HttpResponseFor<RunDeleteAllResponse> = deleteAll(queueId, params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: RunDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunDeleteAllResponse>

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(params: RunDeleteAllParams): HttpResponseFor<RunDeleteAllResponse> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            queueId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunDeleteAllResponse> =
            deleteAll(queueId, RunDeleteAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/annotation-queues/{queue_id}/runs/{queue_run_id}`, but is otherwise the same as
         * [RunService.deleteQueue].
         */
        @MustBeClosed
        fun deleteQueue(
            queueRunId: String,
            params: RunDeleteQueueParams,
        ): HttpResponseFor<RunDeleteQueueResponse> =
            deleteQueue(queueRunId, params, RequestOptions.none())

        /** @see deleteQueue */
        @MustBeClosed
        fun deleteQueue(
            queueRunId: String,
            params: RunDeleteQueueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunDeleteQueueResponse> =
            deleteQueue(params.toBuilder().queueRunId(queueRunId).build(), requestOptions)

        /** @see deleteQueue */
        @MustBeClosed
        fun deleteQueue(params: RunDeleteQueueParams): HttpResponseFor<RunDeleteQueueResponse> =
            deleteQueue(params, RequestOptions.none())

        /** @see deleteQueue */
        @MustBeClosed
        fun deleteQueue(
            params: RunDeleteQueueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunDeleteQueueResponse>
    }
}
