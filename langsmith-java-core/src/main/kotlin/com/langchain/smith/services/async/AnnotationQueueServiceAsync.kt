// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.annotationqueues.AnnotationQueueAnnotationQueuesParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueCreateRunStatusParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueCreateRunStatusResponse
import com.langchain.smith.models.annotationqueues.AnnotationQueueDeleteParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueDeleteResponse
import com.langchain.smith.models.annotationqueues.AnnotationQueueExportParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueExportResponse
import com.langchain.smith.models.annotationqueues.AnnotationQueuePopulateParams
import com.langchain.smith.models.annotationqueues.AnnotationQueuePopulateResponse
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveAnnotationQueuesPageAsync
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveAnnotationQueuesParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveQueuesParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveResponse
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveRunParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveSizeParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveTotalArchivedParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveTotalSizeParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueSchema
import com.langchain.smith.models.annotationqueues.AnnotationQueueSizeSchema
import com.langchain.smith.models.annotationqueues.AnnotationQueueUpdateParams
import com.langchain.smith.models.annotationqueues.AnnotationQueueUpdateResponse
import com.langchain.smith.models.annotationqueues.RunSchemaWithAnnotationQueueInfo
import com.langchain.smith.services.async.annotationqueues.InfoServiceAsync
import com.langchain.smith.services.async.annotationqueues.RunServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AnnotationQueueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnnotationQueueServiceAsync

    fun runs(): RunServiceAsync

    fun info(): InfoServiceAsync

    /** Get Annotation Queue */
    fun retrieve(queueId: String): CompletableFuture<AnnotationQueueRetrieveResponse> =
        retrieve(queueId, AnnotationQueueRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        queueId: String,
        params: AnnotationQueueRetrieveParams = AnnotationQueueRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueRetrieveResponse> =
        retrieve(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        queueId: String,
        params: AnnotationQueueRetrieveParams = AnnotationQueueRetrieveParams.none(),
    ): CompletableFuture<AnnotationQueueRetrieveResponse> =
        retrieve(queueId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AnnotationQueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: AnnotationQueueRetrieveParams
    ): CompletableFuture<AnnotationQueueRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        queueId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueRetrieveResponse> =
        retrieve(queueId, AnnotationQueueRetrieveParams.none(), requestOptions)

    /** Update Annotation Queue */
    fun update(queueId: String): CompletableFuture<AnnotationQueueUpdateResponse> =
        update(queueId, AnnotationQueueUpdateParams.none())

    /** @see update */
    fun update(
        queueId: String,
        params: AnnotationQueueUpdateParams = AnnotationQueueUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueUpdateResponse> =
        update(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see update */
    fun update(
        queueId: String,
        params: AnnotationQueueUpdateParams = AnnotationQueueUpdateParams.none(),
    ): CompletableFuture<AnnotationQueueUpdateResponse> =
        update(queueId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AnnotationQueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueUpdateResponse>

    /** @see update */
    fun update(
        params: AnnotationQueueUpdateParams
    ): CompletableFuture<AnnotationQueueUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        queueId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueUpdateResponse> =
        update(queueId, AnnotationQueueUpdateParams.none(), requestOptions)

    /** Delete Annotation Queue */
    fun delete(queueId: String): CompletableFuture<AnnotationQueueDeleteResponse> =
        delete(queueId, AnnotationQueueDeleteParams.none())

    /** @see delete */
    fun delete(
        queueId: String,
        params: AnnotationQueueDeleteParams = AnnotationQueueDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueDeleteResponse> =
        delete(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see delete */
    fun delete(
        queueId: String,
        params: AnnotationQueueDeleteParams = AnnotationQueueDeleteParams.none(),
    ): CompletableFuture<AnnotationQueueDeleteResponse> =
        delete(queueId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AnnotationQueueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueDeleteResponse>

    /** @see delete */
    fun delete(
        params: AnnotationQueueDeleteParams
    ): CompletableFuture<AnnotationQueueDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        queueId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueDeleteResponse> =
        delete(queueId, AnnotationQueueDeleteParams.none(), requestOptions)

    /** Create Annotation Queue */
    fun annotationQueues(
        params: AnnotationQueueAnnotationQueuesParams
    ): CompletableFuture<AnnotationQueueSchema> = annotationQueues(params, RequestOptions.none())

    /** @see annotationQueues */
    fun annotationQueues(
        params: AnnotationQueueAnnotationQueuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueSchema>

    /** Create Identity Annotation Queue Run Status */
    fun createRunStatus(
        annotationQueueRunId: String
    ): CompletableFuture<AnnotationQueueCreateRunStatusResponse> =
        createRunStatus(annotationQueueRunId, AnnotationQueueCreateRunStatusParams.none())

    /** @see createRunStatus */
    fun createRunStatus(
        annotationQueueRunId: String,
        params: AnnotationQueueCreateRunStatusParams = AnnotationQueueCreateRunStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueCreateRunStatusResponse> =
        createRunStatus(
            params.toBuilder().annotationQueueRunId(annotationQueueRunId).build(),
            requestOptions,
        )

    /** @see createRunStatus */
    fun createRunStatus(
        annotationQueueRunId: String,
        params: AnnotationQueueCreateRunStatusParams = AnnotationQueueCreateRunStatusParams.none(),
    ): CompletableFuture<AnnotationQueueCreateRunStatusResponse> =
        createRunStatus(annotationQueueRunId, params, RequestOptions.none())

    /** @see createRunStatus */
    fun createRunStatus(
        params: AnnotationQueueCreateRunStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueCreateRunStatusResponse>

    /** @see createRunStatus */
    fun createRunStatus(
        params: AnnotationQueueCreateRunStatusParams
    ): CompletableFuture<AnnotationQueueCreateRunStatusResponse> =
        createRunStatus(params, RequestOptions.none())

    /** @see createRunStatus */
    fun createRunStatus(
        annotationQueueRunId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueCreateRunStatusResponse> =
        createRunStatus(
            annotationQueueRunId,
            AnnotationQueueCreateRunStatusParams.none(),
            requestOptions,
        )

    /** Export Annotation Queue Archived Runs */
    fun export(queueId: String): CompletableFuture<AnnotationQueueExportResponse> =
        export(queueId, AnnotationQueueExportParams.none())

    /** @see export */
    fun export(
        queueId: String,
        params: AnnotationQueueExportParams = AnnotationQueueExportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueExportResponse> =
        export(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see export */
    fun export(
        queueId: String,
        params: AnnotationQueueExportParams = AnnotationQueueExportParams.none(),
    ): CompletableFuture<AnnotationQueueExportResponse> =
        export(queueId, params, RequestOptions.none())

    /** @see export */
    fun export(
        params: AnnotationQueueExportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueExportResponse>

    /** @see export */
    fun export(
        params: AnnotationQueueExportParams
    ): CompletableFuture<AnnotationQueueExportResponse> = export(params, RequestOptions.none())

    /** @see export */
    fun export(
        queueId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueExportResponse> =
        export(queueId, AnnotationQueueExportParams.none(), requestOptions)

    /** Populate annotation queue with runs from an experiment. */
    fun populate(
        params: AnnotationQueuePopulateParams
    ): CompletableFuture<AnnotationQueuePopulateResponse> = populate(params, RequestOptions.none())

    /** @see populate */
    fun populate(
        params: AnnotationQueuePopulateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueuePopulateResponse>

    /** Get Annotation Queues */
    fun retrieveAnnotationQueues():
        CompletableFuture<AnnotationQueueRetrieveAnnotationQueuesPageAsync> =
        retrieveAnnotationQueues(AnnotationQueueRetrieveAnnotationQueuesParams.none())

    /** @see retrieveAnnotationQueues */
    fun retrieveAnnotationQueues(
        params: AnnotationQueueRetrieveAnnotationQueuesParams =
            AnnotationQueueRetrieveAnnotationQueuesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueRetrieveAnnotationQueuesPageAsync>

    /** @see retrieveAnnotationQueues */
    fun retrieveAnnotationQueues(
        params: AnnotationQueueRetrieveAnnotationQueuesParams =
            AnnotationQueueRetrieveAnnotationQueuesParams.none()
    ): CompletableFuture<AnnotationQueueRetrieveAnnotationQueuesPageAsync> =
        retrieveAnnotationQueues(params, RequestOptions.none())

    /** @see retrieveAnnotationQueues */
    fun retrieveAnnotationQueues(
        requestOptions: RequestOptions
    ): CompletableFuture<AnnotationQueueRetrieveAnnotationQueuesPageAsync> =
        retrieveAnnotationQueues(
            AnnotationQueueRetrieveAnnotationQueuesParams.none(),
            requestOptions,
        )

    /** Get Annotation Queues For Run */
    fun retrieveQueues(runId: String): CompletableFuture<List<AnnotationQueueSchema>> =
        retrieveQueues(runId, AnnotationQueueRetrieveQueuesParams.none())

    /** @see retrieveQueues */
    fun retrieveQueues(
        runId: String,
        params: AnnotationQueueRetrieveQueuesParams = AnnotationQueueRetrieveQueuesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AnnotationQueueSchema>> =
        retrieveQueues(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieveQueues */
    fun retrieveQueues(
        runId: String,
        params: AnnotationQueueRetrieveQueuesParams = AnnotationQueueRetrieveQueuesParams.none(),
    ): CompletableFuture<List<AnnotationQueueSchema>> =
        retrieveQueues(runId, params, RequestOptions.none())

    /** @see retrieveQueues */
    fun retrieveQueues(
        params: AnnotationQueueRetrieveQueuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AnnotationQueueSchema>>

    /** @see retrieveQueues */
    fun retrieveQueues(
        params: AnnotationQueueRetrieveQueuesParams
    ): CompletableFuture<List<AnnotationQueueSchema>> =
        retrieveQueues(params, RequestOptions.none())

    /** @see retrieveQueues */
    fun retrieveQueues(
        runId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<AnnotationQueueSchema>> =
        retrieveQueues(runId, AnnotationQueueRetrieveQueuesParams.none(), requestOptions)

    /** Get a run from an annotation queue */
    fun retrieveRun(
        index: Long,
        params: AnnotationQueueRetrieveRunParams,
    ): CompletableFuture<RunSchemaWithAnnotationQueueInfo> =
        retrieveRun(index, params, RequestOptions.none())

    /** @see retrieveRun */
    fun retrieveRun(
        index: Long,
        params: AnnotationQueueRetrieveRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunSchemaWithAnnotationQueueInfo> =
        retrieveRun(params.toBuilder().index(index).build(), requestOptions)

    /** @see retrieveRun */
    fun retrieveRun(
        params: AnnotationQueueRetrieveRunParams
    ): CompletableFuture<RunSchemaWithAnnotationQueueInfo> =
        retrieveRun(params, RequestOptions.none())

    /** @see retrieveRun */
    fun retrieveRun(
        params: AnnotationQueueRetrieveRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunSchemaWithAnnotationQueueInfo>

    /** Get Size From Annotation Queue */
    fun retrieveSize(queueId: String): CompletableFuture<AnnotationQueueSizeSchema> =
        retrieveSize(queueId, AnnotationQueueRetrieveSizeParams.none())

    /** @see retrieveSize */
    fun retrieveSize(
        queueId: String,
        params: AnnotationQueueRetrieveSizeParams = AnnotationQueueRetrieveSizeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueSizeSchema> =
        retrieveSize(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see retrieveSize */
    fun retrieveSize(
        queueId: String,
        params: AnnotationQueueRetrieveSizeParams = AnnotationQueueRetrieveSizeParams.none(),
    ): CompletableFuture<AnnotationQueueSizeSchema> =
        retrieveSize(queueId, params, RequestOptions.none())

    /** @see retrieveSize */
    fun retrieveSize(
        params: AnnotationQueueRetrieveSizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueSizeSchema>

    /** @see retrieveSize */
    fun retrieveSize(
        params: AnnotationQueueRetrieveSizeParams
    ): CompletableFuture<AnnotationQueueSizeSchema> = retrieveSize(params, RequestOptions.none())

    /** @see retrieveSize */
    fun retrieveSize(
        queueId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueSizeSchema> =
        retrieveSize(queueId, AnnotationQueueRetrieveSizeParams.none(), requestOptions)

    /** Get Total Archived From Annotation Queue */
    fun retrieveTotalArchived(queueId: String): CompletableFuture<AnnotationQueueSizeSchema> =
        retrieveTotalArchived(queueId, AnnotationQueueRetrieveTotalArchivedParams.none())

    /** @see retrieveTotalArchived */
    fun retrieveTotalArchived(
        queueId: String,
        params: AnnotationQueueRetrieveTotalArchivedParams =
            AnnotationQueueRetrieveTotalArchivedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueSizeSchema> =
        retrieveTotalArchived(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see retrieveTotalArchived */
    fun retrieveTotalArchived(
        queueId: String,
        params: AnnotationQueueRetrieveTotalArchivedParams =
            AnnotationQueueRetrieveTotalArchivedParams.none(),
    ): CompletableFuture<AnnotationQueueSizeSchema> =
        retrieveTotalArchived(queueId, params, RequestOptions.none())

    /** @see retrieveTotalArchived */
    fun retrieveTotalArchived(
        params: AnnotationQueueRetrieveTotalArchivedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueSizeSchema>

    /** @see retrieveTotalArchived */
    fun retrieveTotalArchived(
        params: AnnotationQueueRetrieveTotalArchivedParams
    ): CompletableFuture<AnnotationQueueSizeSchema> =
        retrieveTotalArchived(params, RequestOptions.none())

    /** @see retrieveTotalArchived */
    fun retrieveTotalArchived(
        queueId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueSizeSchema> =
        retrieveTotalArchived(
            queueId,
            AnnotationQueueRetrieveTotalArchivedParams.none(),
            requestOptions,
        )

    /** Get Total Size From Annotation Queue */
    fun retrieveTotalSize(queueId: String): CompletableFuture<AnnotationQueueSizeSchema> =
        retrieveTotalSize(queueId, AnnotationQueueRetrieveTotalSizeParams.none())

    /** @see retrieveTotalSize */
    fun retrieveTotalSize(
        queueId: String,
        params: AnnotationQueueRetrieveTotalSizeParams =
            AnnotationQueueRetrieveTotalSizeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueSizeSchema> =
        retrieveTotalSize(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see retrieveTotalSize */
    fun retrieveTotalSize(
        queueId: String,
        params: AnnotationQueueRetrieveTotalSizeParams =
            AnnotationQueueRetrieveTotalSizeParams.none(),
    ): CompletableFuture<AnnotationQueueSizeSchema> =
        retrieveTotalSize(queueId, params, RequestOptions.none())

    /** @see retrieveTotalSize */
    fun retrieveTotalSize(
        params: AnnotationQueueRetrieveTotalSizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnnotationQueueSizeSchema>

    /** @see retrieveTotalSize */
    fun retrieveTotalSize(
        params: AnnotationQueueRetrieveTotalSizeParams
    ): CompletableFuture<AnnotationQueueSizeSchema> =
        retrieveTotalSize(params, RequestOptions.none())

    /** @see retrieveTotalSize */
    fun retrieveTotalSize(
        queueId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueSizeSchema> =
        retrieveTotalSize(queueId, AnnotationQueueRetrieveTotalSizeParams.none(), requestOptions)

    /**
     * A view of [AnnotationQueueServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AnnotationQueueServiceAsync.WithRawResponse

        fun runs(): RunServiceAsync.WithRawResponse

        fun info(): InfoServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}`, but is
         * otherwise the same as [AnnotationQueueServiceAsync.retrieve].
         */
        fun retrieve(
            queueId: String
        ): CompletableFuture<HttpResponseFor<AnnotationQueueRetrieveResponse>> =
            retrieve(queueId, AnnotationQueueRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            queueId: String,
            params: AnnotationQueueRetrieveParams = AnnotationQueueRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueRetrieveResponse>> =
            retrieve(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            queueId: String,
            params: AnnotationQueueRetrieveParams = AnnotationQueueRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueRetrieveResponse>> =
            retrieve(queueId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AnnotationQueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AnnotationQueueRetrieveParams
        ): CompletableFuture<HttpResponseFor<AnnotationQueueRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            queueId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueRetrieveResponse>> =
            retrieve(queueId, AnnotationQueueRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/annotation-queues/{queue_id}`, but is
         * otherwise the same as [AnnotationQueueServiceAsync.update].
         */
        fun update(
            queueId: String
        ): CompletableFuture<HttpResponseFor<AnnotationQueueUpdateResponse>> =
            update(queueId, AnnotationQueueUpdateParams.none())

        /** @see update */
        fun update(
            queueId: String,
            params: AnnotationQueueUpdateParams = AnnotationQueueUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueUpdateResponse>> =
            update(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see update */
        fun update(
            queueId: String,
            params: AnnotationQueueUpdateParams = AnnotationQueueUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueUpdateResponse>> =
            update(queueId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AnnotationQueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueUpdateResponse>>

        /** @see update */
        fun update(
            params: AnnotationQueueUpdateParams
        ): CompletableFuture<HttpResponseFor<AnnotationQueueUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            queueId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueUpdateResponse>> =
            update(queueId, AnnotationQueueUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/annotation-queues/{queue_id}`, but is
         * otherwise the same as [AnnotationQueueServiceAsync.delete].
         */
        fun delete(
            queueId: String
        ): CompletableFuture<HttpResponseFor<AnnotationQueueDeleteResponse>> =
            delete(queueId, AnnotationQueueDeleteParams.none())

        /** @see delete */
        fun delete(
            queueId: String,
            params: AnnotationQueueDeleteParams = AnnotationQueueDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueDeleteResponse>> =
            delete(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see delete */
        fun delete(
            queueId: String,
            params: AnnotationQueueDeleteParams = AnnotationQueueDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueDeleteResponse>> =
            delete(queueId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AnnotationQueueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueDeleteResponse>>

        /** @see delete */
        fun delete(
            params: AnnotationQueueDeleteParams
        ): CompletableFuture<HttpResponseFor<AnnotationQueueDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            queueId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueDeleteResponse>> =
            delete(queueId, AnnotationQueueDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues`, but is otherwise the
         * same as [AnnotationQueueServiceAsync.annotationQueues].
         */
        fun annotationQueues(
            params: AnnotationQueueAnnotationQueuesParams
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSchema>> =
            annotationQueues(params, RequestOptions.none())

        /** @see annotationQueues */
        fun annotationQueues(
            params: AnnotationQueueAnnotationQueuesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSchema>>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/annotation-queues/status/{annotation_queue_run_id}`, but is otherwise the same as
         * [AnnotationQueueServiceAsync.createRunStatus].
         */
        fun createRunStatus(
            annotationQueueRunId: String
        ): CompletableFuture<HttpResponseFor<AnnotationQueueCreateRunStatusResponse>> =
            createRunStatus(annotationQueueRunId, AnnotationQueueCreateRunStatusParams.none())

        /** @see createRunStatus */
        fun createRunStatus(
            annotationQueueRunId: String,
            params: AnnotationQueueCreateRunStatusParams =
                AnnotationQueueCreateRunStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueCreateRunStatusResponse>> =
            createRunStatus(
                params.toBuilder().annotationQueueRunId(annotationQueueRunId).build(),
                requestOptions,
            )

        /** @see createRunStatus */
        fun createRunStatus(
            annotationQueueRunId: String,
            params: AnnotationQueueCreateRunStatusParams =
                AnnotationQueueCreateRunStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueCreateRunStatusResponse>> =
            createRunStatus(annotationQueueRunId, params, RequestOptions.none())

        /** @see createRunStatus */
        fun createRunStatus(
            params: AnnotationQueueCreateRunStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueCreateRunStatusResponse>>

        /** @see createRunStatus */
        fun createRunStatus(
            params: AnnotationQueueCreateRunStatusParams
        ): CompletableFuture<HttpResponseFor<AnnotationQueueCreateRunStatusResponse>> =
            createRunStatus(params, RequestOptions.none())

        /** @see createRunStatus */
        fun createRunStatus(
            annotationQueueRunId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueCreateRunStatusResponse>> =
            createRunStatus(
                annotationQueueRunId,
                AnnotationQueueCreateRunStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues/{queue_id}/export`, but
         * is otherwise the same as [AnnotationQueueServiceAsync.export].
         */
        fun export(
            queueId: String
        ): CompletableFuture<HttpResponseFor<AnnotationQueueExportResponse>> =
            export(queueId, AnnotationQueueExportParams.none())

        /** @see export */
        fun export(
            queueId: String,
            params: AnnotationQueueExportParams = AnnotationQueueExportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueExportResponse>> =
            export(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see export */
        fun export(
            queueId: String,
            params: AnnotationQueueExportParams = AnnotationQueueExportParams.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueExportResponse>> =
            export(queueId, params, RequestOptions.none())

        /** @see export */
        fun export(
            params: AnnotationQueueExportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueExportResponse>>

        /** @see export */
        fun export(
            params: AnnotationQueueExportParams
        ): CompletableFuture<HttpResponseFor<AnnotationQueueExportResponse>> =
            export(params, RequestOptions.none())

        /** @see export */
        fun export(
            queueId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueExportResponse>> =
            export(queueId, AnnotationQueueExportParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues/populate`, but is
         * otherwise the same as [AnnotationQueueServiceAsync.populate].
         */
        fun populate(
            params: AnnotationQueuePopulateParams
        ): CompletableFuture<HttpResponseFor<AnnotationQueuePopulateResponse>> =
            populate(params, RequestOptions.none())

        /** @see populate */
        fun populate(
            params: AnnotationQueuePopulateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueuePopulateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues`, but is otherwise the
         * same as [AnnotationQueueServiceAsync.retrieveAnnotationQueues].
         */
        fun retrieveAnnotationQueues():
            CompletableFuture<HttpResponseFor<AnnotationQueueRetrieveAnnotationQueuesPageAsync>> =
            retrieveAnnotationQueues(AnnotationQueueRetrieveAnnotationQueuesParams.none())

        /** @see retrieveAnnotationQueues */
        fun retrieveAnnotationQueues(
            params: AnnotationQueueRetrieveAnnotationQueuesParams =
                AnnotationQueueRetrieveAnnotationQueuesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueRetrieveAnnotationQueuesPageAsync>>

        /** @see retrieveAnnotationQueues */
        fun retrieveAnnotationQueues(
            params: AnnotationQueueRetrieveAnnotationQueuesParams =
                AnnotationQueueRetrieveAnnotationQueuesParams.none()
        ): CompletableFuture<HttpResponseFor<AnnotationQueueRetrieveAnnotationQueuesPageAsync>> =
            retrieveAnnotationQueues(params, RequestOptions.none())

        /** @see retrieveAnnotationQueues */
        fun retrieveAnnotationQueues(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AnnotationQueueRetrieveAnnotationQueuesPageAsync>> =
            retrieveAnnotationQueues(
                AnnotationQueueRetrieveAnnotationQueuesParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{run_id}/queues`, but is
         * otherwise the same as [AnnotationQueueServiceAsync.retrieveQueues].
         */
        fun retrieveQueues(
            runId: String
        ): CompletableFuture<HttpResponseFor<List<AnnotationQueueSchema>>> =
            retrieveQueues(runId, AnnotationQueueRetrieveQueuesParams.none())

        /** @see retrieveQueues */
        fun retrieveQueues(
            runId: String,
            params: AnnotationQueueRetrieveQueuesParams =
                AnnotationQueueRetrieveQueuesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AnnotationQueueSchema>>> =
            retrieveQueues(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieveQueues */
        fun retrieveQueues(
            runId: String,
            params: AnnotationQueueRetrieveQueuesParams = AnnotationQueueRetrieveQueuesParams.none(),
        ): CompletableFuture<HttpResponseFor<List<AnnotationQueueSchema>>> =
            retrieveQueues(runId, params, RequestOptions.none())

        /** @see retrieveQueues */
        fun retrieveQueues(
            params: AnnotationQueueRetrieveQueuesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AnnotationQueueSchema>>>

        /** @see retrieveQueues */
        fun retrieveQueues(
            params: AnnotationQueueRetrieveQueuesParams
        ): CompletableFuture<HttpResponseFor<List<AnnotationQueueSchema>>> =
            retrieveQueues(params, RequestOptions.none())

        /** @see retrieveQueues */
        fun retrieveQueues(
            runId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<AnnotationQueueSchema>>> =
            retrieveQueues(runId, AnnotationQueueRetrieveQueuesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}/run/{index}`,
         * but is otherwise the same as [AnnotationQueueServiceAsync.retrieveRun].
         */
        fun retrieveRun(
            index: Long,
            params: AnnotationQueueRetrieveRunParams,
        ): CompletableFuture<HttpResponseFor<RunSchemaWithAnnotationQueueInfo>> =
            retrieveRun(index, params, RequestOptions.none())

        /** @see retrieveRun */
        fun retrieveRun(
            index: Long,
            params: AnnotationQueueRetrieveRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunSchemaWithAnnotationQueueInfo>> =
            retrieveRun(params.toBuilder().index(index).build(), requestOptions)

        /** @see retrieveRun */
        fun retrieveRun(
            params: AnnotationQueueRetrieveRunParams
        ): CompletableFuture<HttpResponseFor<RunSchemaWithAnnotationQueueInfo>> =
            retrieveRun(params, RequestOptions.none())

        /** @see retrieveRun */
        fun retrieveRun(
            params: AnnotationQueueRetrieveRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunSchemaWithAnnotationQueueInfo>>

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}/size`, but is
         * otherwise the same as [AnnotationQueueServiceAsync.retrieveSize].
         */
        fun retrieveSize(
            queueId: String
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> =
            retrieveSize(queueId, AnnotationQueueRetrieveSizeParams.none())

        /** @see retrieveSize */
        fun retrieveSize(
            queueId: String,
            params: AnnotationQueueRetrieveSizeParams = AnnotationQueueRetrieveSizeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> =
            retrieveSize(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see retrieveSize */
        fun retrieveSize(
            queueId: String,
            params: AnnotationQueueRetrieveSizeParams = AnnotationQueueRetrieveSizeParams.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> =
            retrieveSize(queueId, params, RequestOptions.none())

        /** @see retrieveSize */
        fun retrieveSize(
            params: AnnotationQueueRetrieveSizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>>

        /** @see retrieveSize */
        fun retrieveSize(
            params: AnnotationQueueRetrieveSizeParams
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> =
            retrieveSize(params, RequestOptions.none())

        /** @see retrieveSize */
        fun retrieveSize(
            queueId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> =
            retrieveSize(queueId, AnnotationQueueRetrieveSizeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/annotation-queues/{queue_id}/total_archived`, but is otherwise the same as
         * [AnnotationQueueServiceAsync.retrieveTotalArchived].
         */
        fun retrieveTotalArchived(
            queueId: String
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> =
            retrieveTotalArchived(queueId, AnnotationQueueRetrieveTotalArchivedParams.none())

        /** @see retrieveTotalArchived */
        fun retrieveTotalArchived(
            queueId: String,
            params: AnnotationQueueRetrieveTotalArchivedParams =
                AnnotationQueueRetrieveTotalArchivedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> =
            retrieveTotalArchived(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see retrieveTotalArchived */
        fun retrieveTotalArchived(
            queueId: String,
            params: AnnotationQueueRetrieveTotalArchivedParams =
                AnnotationQueueRetrieveTotalArchivedParams.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> =
            retrieveTotalArchived(queueId, params, RequestOptions.none())

        /** @see retrieveTotalArchived */
        fun retrieveTotalArchived(
            params: AnnotationQueueRetrieveTotalArchivedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>>

        /** @see retrieveTotalArchived */
        fun retrieveTotalArchived(
            params: AnnotationQueueRetrieveTotalArchivedParams
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> =
            retrieveTotalArchived(params, RequestOptions.none())

        /** @see retrieveTotalArchived */
        fun retrieveTotalArchived(
            queueId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> =
            retrieveTotalArchived(
                queueId,
                AnnotationQueueRetrieveTotalArchivedParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}/total_size`,
         * but is otherwise the same as [AnnotationQueueServiceAsync.retrieveTotalSize].
         */
        fun retrieveTotalSize(
            queueId: String
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> =
            retrieveTotalSize(queueId, AnnotationQueueRetrieveTotalSizeParams.none())

        /** @see retrieveTotalSize */
        fun retrieveTotalSize(
            queueId: String,
            params: AnnotationQueueRetrieveTotalSizeParams =
                AnnotationQueueRetrieveTotalSizeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> =
            retrieveTotalSize(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see retrieveTotalSize */
        fun retrieveTotalSize(
            queueId: String,
            params: AnnotationQueueRetrieveTotalSizeParams =
                AnnotationQueueRetrieveTotalSizeParams.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> =
            retrieveTotalSize(queueId, params, RequestOptions.none())

        /** @see retrieveTotalSize */
        fun retrieveTotalSize(
            params: AnnotationQueueRetrieveTotalSizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>>

        /** @see retrieveTotalSize */
        fun retrieveTotalSize(
            params: AnnotationQueueRetrieveTotalSizeParams
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> =
            retrieveTotalSize(params, RequestOptions.none())

        /** @see retrieveTotalSize */
        fun retrieveTotalSize(
            queueId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueSizeSchema>> =
            retrieveTotalSize(
                queueId,
                AnnotationQueueRetrieveTotalSizeParams.none(),
                requestOptions,
            )
    }
}
