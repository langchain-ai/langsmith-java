// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.annotationqueues

import com.google.errorprone.annotations.MustBeClosed
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
    fun delete(queueId: String): RunDeleteResponse = delete(queueId, RunDeleteParams.none())

    /** @see delete */
    fun delete(
        queueId: String,
        params: RunDeleteParams = RunDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunDeleteResponse = delete(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see delete */
    fun delete(
        queueId: String,
        params: RunDeleteParams = RunDeleteParams.none(),
    ): RunDeleteResponse = delete(queueId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RunDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunDeleteResponse

    /** @see delete */
    fun delete(params: RunDeleteParams): RunDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(queueId: String, requestOptions: RequestOptions): RunDeleteResponse =
        delete(queueId, RunDeleteParams.none(), requestOptions)

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
         * but is otherwise the same as [RunService.delete].
         */
        @MustBeClosed
        fun delete(queueId: String): HttpResponseFor<RunDeleteResponse> =
            delete(queueId, RunDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            queueId: String,
            params: RunDeleteParams = RunDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunDeleteResponse> =
            delete(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            queueId: String,
            params: RunDeleteParams = RunDeleteParams.none(),
        ): HttpResponseFor<RunDeleteResponse> = delete(queueId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RunDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: RunDeleteParams): HttpResponseFor<RunDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            queueId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunDeleteResponse> =
            delete(queueId, RunDeleteParams.none(), requestOptions)
    }
}
