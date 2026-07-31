// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.annotationqueues

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.annotationqueues.RunSchemaWithAnnotationQueueInfo
import com.langchain.smith.models.annotationqueues.runs.RunCreateByKeyParams
import com.langchain.smith.models.annotationqueues.runs.RunCreateByKeyResponse
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
    @Deprecated(
        "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
    )
    fun create(
        queueId: String,
        params: RunCreateParams,
    ): CompletableFuture<List<RunCreateResponse>> = create(queueId, params, RequestOptions.none())

    /** @see create */
    @Deprecated(
        "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
    )
    fun create(
        queueId: String,
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RunCreateResponse>> =
        create(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see create */
    @Deprecated(
        "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
    )
    fun create(params: RunCreateParams): CompletableFuture<List<RunCreateResponse>> =
        create(params, RequestOptions.none())

    /** @see create */
    @Deprecated(
        "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
    )
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RunCreateResponse>>

    /** Update Run In Annotation Queue */
    @Deprecated(
        "Deprecated: use the annotation queue items update method (PATCH /api/v1/platform/annotation-queues/{queue_id}/items/{item_id}) instead. Will be removed after Jan 31, 2027."
    )
    fun update(queueRunId: String, params: RunUpdateParams): CompletableFuture<RunUpdateResponse> =
        update(queueRunId, params, RequestOptions.none())

    /** @see update */
    @Deprecated(
        "Deprecated: use the annotation queue items update method (PATCH /api/v1/platform/annotation-queues/{queue_id}/items/{item_id}) instead. Will be removed after Jan 31, 2027."
    )
    fun update(
        queueRunId: String,
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunUpdateResponse> =
        update(params.toBuilder().queueRunId(queueRunId).build(), requestOptions)

    /** @see update */
    @Deprecated(
        "Deprecated: use the annotation queue items update method (PATCH /api/v1/platform/annotation-queues/{queue_id}/items/{item_id}) instead. Will be removed after Jan 31, 2027."
    )
    fun update(params: RunUpdateParams): CompletableFuture<RunUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    @Deprecated(
        "Deprecated: use the annotation queue items update method (PATCH /api/v1/platform/annotation-queues/{queue_id}/items/{item_id}) instead. Will be removed after Jan 31, 2027."
    )
    fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunUpdateResponse>

    /** Get Runs From Annotation Queue */
    @Deprecated(
        "Deprecated: use the annotation queue items list method (GET /api/v1/platform/annotation-queues/{queue_id}/items) instead. Will be removed after Jan 31, 2027."
    )
    fun list(queueId: String): CompletableFuture<List<RunSchemaWithAnnotationQueueInfo>> =
        list(queueId, RunListParams.none())

    /** @see list */
    @Deprecated(
        "Deprecated: use the annotation queue items list method (GET /api/v1/platform/annotation-queues/{queue_id}/items) instead. Will be removed after Jan 31, 2027."
    )
    fun list(
        queueId: String,
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RunSchemaWithAnnotationQueueInfo>> =
        list(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see list */
    @Deprecated(
        "Deprecated: use the annotation queue items list method (GET /api/v1/platform/annotation-queues/{queue_id}/items) instead. Will be removed after Jan 31, 2027."
    )
    fun list(
        queueId: String,
        params: RunListParams = RunListParams.none(),
    ): CompletableFuture<List<RunSchemaWithAnnotationQueueInfo>> =
        list(queueId, params, RequestOptions.none())

    /** @see list */
    @Deprecated(
        "Deprecated: use the annotation queue items list method (GET /api/v1/platform/annotation-queues/{queue_id}/items) instead. Will be removed after Jan 31, 2027."
    )
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RunSchemaWithAnnotationQueueInfo>>

    /** @see list */
    @Deprecated(
        "Deprecated: use the annotation queue items list method (GET /api/v1/platform/annotation-queues/{queue_id}/items) instead. Will be removed after Jan 31, 2027."
    )
    fun list(params: RunListParams): CompletableFuture<List<RunSchemaWithAnnotationQueueInfo>> =
        list(params, RequestOptions.none())

    /** @see list */
    @Deprecated(
        "Deprecated: use the annotation queue items list method (GET /api/v1/platform/annotation-queues/{queue_id}/items) instead. Will be removed after Jan 31, 2027."
    )
    fun list(
        queueId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<RunSchemaWithAnnotationQueueInfo>> =
        list(queueId, RunListParams.none(), requestOptions)

    /** Self-hosted deployments require LangSmith `v0.16` or later. */
    @Deprecated(
        "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
    )
    fun createByKey(
        queueId: String,
        params: RunCreateByKeyParams,
    ): CompletableFuture<List<RunCreateByKeyResponse>> =
        createByKey(queueId, params, RequestOptions.none())

    /** @see createByKey */
    @Deprecated(
        "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
    )
    fun createByKey(
        queueId: String,
        params: RunCreateByKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RunCreateByKeyResponse>> =
        createByKey(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see createByKey */
    @Deprecated(
        "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
    )
    fun createByKey(params: RunCreateByKeyParams): CompletableFuture<List<RunCreateByKeyResponse>> =
        createByKey(params, RequestOptions.none())

    /** @see createByKey */
    @Deprecated(
        "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
    )
    fun createByKey(
        params: RunCreateByKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RunCreateByKeyResponse>>

    /** Delete Runs From Annotation Queue */
    @Deprecated(
        "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) instead. Will be removed after Jan 31, 2027."
    )
    fun deleteAll(queueId: String): CompletableFuture<RunDeleteAllResponse> =
        deleteAll(queueId, RunDeleteAllParams.none())

    /** @see deleteAll */
    @Deprecated(
        "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) instead. Will be removed after Jan 31, 2027."
    )
    fun deleteAll(
        queueId: String,
        params: RunDeleteAllParams = RunDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunDeleteAllResponse> =
        deleteAll(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see deleteAll */
    @Deprecated(
        "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) instead. Will be removed after Jan 31, 2027."
    )
    fun deleteAll(
        queueId: String,
        params: RunDeleteAllParams = RunDeleteAllParams.none(),
    ): CompletableFuture<RunDeleteAllResponse> = deleteAll(queueId, params, RequestOptions.none())

    /** @see deleteAll */
    @Deprecated(
        "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) instead. Will be removed after Jan 31, 2027."
    )
    fun deleteAll(
        params: RunDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunDeleteAllResponse>

    /** @see deleteAll */
    @Deprecated(
        "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) instead. Will be removed after Jan 31, 2027."
    )
    fun deleteAll(params: RunDeleteAllParams): CompletableFuture<RunDeleteAllResponse> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    @Deprecated(
        "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) instead. Will be removed after Jan 31, 2027."
    )
    fun deleteAll(
        queueId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunDeleteAllResponse> =
        deleteAll(queueId, RunDeleteAllParams.none(), requestOptions)

    /** Delete Run From Annotation Queue */
    @Deprecated(
        "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) with the item ID instead. Will be removed after Jan 31, 2027."
    )
    fun deleteQueue(
        queueRunId: String,
        params: RunDeleteQueueParams,
    ): CompletableFuture<RunDeleteQueueResponse> =
        deleteQueue(queueRunId, params, RequestOptions.none())

    /** @see deleteQueue */
    @Deprecated(
        "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) with the item ID instead. Will be removed after Jan 31, 2027."
    )
    fun deleteQueue(
        queueRunId: String,
        params: RunDeleteQueueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunDeleteQueueResponse> =
        deleteQueue(params.toBuilder().queueRunId(queueRunId).build(), requestOptions)

    /** @see deleteQueue */
    @Deprecated(
        "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) with the item ID instead. Will be removed after Jan 31, 2027."
    )
    fun deleteQueue(params: RunDeleteQueueParams): CompletableFuture<RunDeleteQueueResponse> =
        deleteQueue(params, RequestOptions.none())

    /** @see deleteQueue */
    @Deprecated(
        "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) with the item ID instead. Will be removed after Jan 31, 2027."
    )
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
        @Deprecated(
            "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
        )
        fun create(
            queueId: String,
            params: RunCreateParams,
        ): CompletableFuture<HttpResponseFor<List<RunCreateResponse>>> =
            create(queueId, params, RequestOptions.none())

        /** @see create */
        @Deprecated(
            "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
        )
        fun create(
            queueId: String,
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RunCreateResponse>>> =
            create(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see create */
        @Deprecated(
            "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
        )
        fun create(
            params: RunCreateParams
        ): CompletableFuture<HttpResponseFor<List<RunCreateResponse>>> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated(
            "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
        )
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RunCreateResponse>>>

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/annotation-queues/{queue_id}/runs/{queue_run_id}`, but is otherwise the same as
         * [RunServiceAsync.update].
         */
        @Deprecated(
            "Deprecated: use the annotation queue items update method (PATCH /api/v1/platform/annotation-queues/{queue_id}/items/{item_id}) instead. Will be removed after Jan 31, 2027."
        )
        fun update(
            queueRunId: String,
            params: RunUpdateParams,
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(queueRunId, params, RequestOptions.none())

        /** @see update */
        @Deprecated(
            "Deprecated: use the annotation queue items update method (PATCH /api/v1/platform/annotation-queues/{queue_id}/items/{item_id}) instead. Will be removed after Jan 31, 2027."
        )
        fun update(
            queueRunId: String,
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(params.toBuilder().queueRunId(queueRunId).build(), requestOptions)

        /** @see update */
        @Deprecated(
            "Deprecated: use the annotation queue items update method (PATCH /api/v1/platform/annotation-queues/{queue_id}/items/{item_id}) instead. Will be removed after Jan 31, 2027."
        )
        fun update(params: RunUpdateParams): CompletableFuture<HttpResponseFor<RunUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        @Deprecated(
            "Deprecated: use the annotation queue items update method (PATCH /api/v1/platform/annotation-queues/{queue_id}/items/{item_id}) instead. Will be removed after Jan 31, 2027."
        )
        fun update(
            params: RunUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}/runs`, but is
         * otherwise the same as [RunServiceAsync.list].
         */
        @Deprecated(
            "Deprecated: use the annotation queue items list method (GET /api/v1/platform/annotation-queues/{queue_id}/items) instead. Will be removed after Jan 31, 2027."
        )
        fun list(
            queueId: String
        ): CompletableFuture<HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>>> =
            list(queueId, RunListParams.none())

        /** @see list */
        @Deprecated(
            "Deprecated: use the annotation queue items list method (GET /api/v1/platform/annotation-queues/{queue_id}/items) instead. Will be removed after Jan 31, 2027."
        )
        fun list(
            queueId: String,
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>>> =
            list(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see list */
        @Deprecated(
            "Deprecated: use the annotation queue items list method (GET /api/v1/platform/annotation-queues/{queue_id}/items) instead. Will be removed after Jan 31, 2027."
        )
        fun list(
            queueId: String,
            params: RunListParams = RunListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>>> =
            list(queueId, params, RequestOptions.none())

        /** @see list */
        @Deprecated(
            "Deprecated: use the annotation queue items list method (GET /api/v1/platform/annotation-queues/{queue_id}/items) instead. Will be removed after Jan 31, 2027."
        )
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>>>

        /** @see list */
        @Deprecated(
            "Deprecated: use the annotation queue items list method (GET /api/v1/platform/annotation-queues/{queue_id}/items) instead. Will be removed after Jan 31, 2027."
        )
        fun list(
            params: RunListParams
        ): CompletableFuture<HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>>> =
            list(params, RequestOptions.none())

        /** @see list */
        @Deprecated(
            "Deprecated: use the annotation queue items list method (GET /api/v1/platform/annotation-queues/{queue_id}/items) instead. Will be removed after Jan 31, 2027."
        )
        fun list(
            queueId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<RunSchemaWithAnnotationQueueInfo>>> =
            list(queueId, RunListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues/{queue_id}/runs/by-key`,
         * but is otherwise the same as [RunServiceAsync.createByKey].
         */
        @Deprecated(
            "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
        )
        fun createByKey(
            queueId: String,
            params: RunCreateByKeyParams,
        ): CompletableFuture<HttpResponseFor<List<RunCreateByKeyResponse>>> =
            createByKey(queueId, params, RequestOptions.none())

        /** @see createByKey */
        @Deprecated(
            "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
        )
        fun createByKey(
            queueId: String,
            params: RunCreateByKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RunCreateByKeyResponse>>> =
            createByKey(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see createByKey */
        @Deprecated(
            "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
        )
        fun createByKey(
            params: RunCreateByKeyParams
        ): CompletableFuture<HttpResponseFor<List<RunCreateByKeyResponse>>> =
            createByKey(params, RequestOptions.none())

        /** @see createByKey */
        @Deprecated(
            "Deprecated: use annotationQueues().items().create() instead. Will be removed after Jan 31, 2027."
        )
        fun createByKey(
            params: RunCreateByKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RunCreateByKeyResponse>>>

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues/{queue_id}/runs/delete`,
         * but is otherwise the same as [RunServiceAsync.deleteAll].
         */
        @Deprecated(
            "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) instead. Will be removed after Jan 31, 2027."
        )
        fun deleteAll(queueId: String): CompletableFuture<HttpResponseFor<RunDeleteAllResponse>> =
            deleteAll(queueId, RunDeleteAllParams.none())

        /** @see deleteAll */
        @Deprecated(
            "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) instead. Will be removed after Jan 31, 2027."
        )
        fun deleteAll(
            queueId: String,
            params: RunDeleteAllParams = RunDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunDeleteAllResponse>> =
            deleteAll(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see deleteAll */
        @Deprecated(
            "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) instead. Will be removed after Jan 31, 2027."
        )
        fun deleteAll(
            queueId: String,
            params: RunDeleteAllParams = RunDeleteAllParams.none(),
        ): CompletableFuture<HttpResponseFor<RunDeleteAllResponse>> =
            deleteAll(queueId, params, RequestOptions.none())

        /** @see deleteAll */
        @Deprecated(
            "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) instead. Will be removed after Jan 31, 2027."
        )
        fun deleteAll(
            params: RunDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunDeleteAllResponse>>

        /** @see deleteAll */
        @Deprecated(
            "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) instead. Will be removed after Jan 31, 2027."
        )
        fun deleteAll(
            params: RunDeleteAllParams
        ): CompletableFuture<HttpResponseFor<RunDeleteAllResponse>> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @Deprecated(
            "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) instead. Will be removed after Jan 31, 2027."
        )
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
        @Deprecated(
            "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) with the item ID instead. Will be removed after Jan 31, 2027."
        )
        fun deleteQueue(
            queueRunId: String,
            params: RunDeleteQueueParams,
        ): CompletableFuture<HttpResponseFor<RunDeleteQueueResponse>> =
            deleteQueue(queueRunId, params, RequestOptions.none())

        /** @see deleteQueue */
        @Deprecated(
            "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) with the item ID instead. Will be removed after Jan 31, 2027."
        )
        fun deleteQueue(
            queueRunId: String,
            params: RunDeleteQueueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunDeleteQueueResponse>> =
            deleteQueue(params.toBuilder().queueRunId(queueRunId).build(), requestOptions)

        /** @see deleteQueue */
        @Deprecated(
            "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) with the item ID instead. Will be removed after Jan 31, 2027."
        )
        fun deleteQueue(
            params: RunDeleteQueueParams
        ): CompletableFuture<HttpResponseFor<RunDeleteQueueResponse>> =
            deleteQueue(params, RequestOptions.none())

        /** @see deleteQueue */
        @Deprecated(
            "Deprecated: use the annotation queue items delete_all method (POST /api/v1/platform/annotation-queues/{queue_id}/items/delete) with the item ID instead. Will be removed after Jan 31, 2027."
        )
        fun deleteQueue(
            params: RunDeleteQueueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunDeleteQueueResponse>>
    }
}
