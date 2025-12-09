// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.langchain.smith.models.annotationqueues.AnnotationQueueRetrieveAnnotationQueuesPage
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
import com.langchain.smith.services.blocking.annotationqueues.InfoService
import com.langchain.smith.services.blocking.annotationqueues.RunService
import java.util.function.Consumer

interface AnnotationQueueService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnnotationQueueService

    fun runs(): RunService

    fun info(): InfoService

    /** Get Annotation Queue */
    fun retrieve(queueId: String): AnnotationQueueRetrieveResponse =
        retrieve(queueId, AnnotationQueueRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        queueId: String,
        params: AnnotationQueueRetrieveParams = AnnotationQueueRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueRetrieveResponse =
        retrieve(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        queueId: String,
        params: AnnotationQueueRetrieveParams = AnnotationQueueRetrieveParams.none(),
    ): AnnotationQueueRetrieveResponse = retrieve(queueId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AnnotationQueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: AnnotationQueueRetrieveParams): AnnotationQueueRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(queueId: String, requestOptions: RequestOptions): AnnotationQueueRetrieveResponse =
        retrieve(queueId, AnnotationQueueRetrieveParams.none(), requestOptions)

    /** Update Annotation Queue */
    fun update(queueId: String): AnnotationQueueUpdateResponse =
        update(queueId, AnnotationQueueUpdateParams.none())

    /** @see update */
    fun update(
        queueId: String,
        params: AnnotationQueueUpdateParams = AnnotationQueueUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueUpdateResponse =
        update(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see update */
    fun update(
        queueId: String,
        params: AnnotationQueueUpdateParams = AnnotationQueueUpdateParams.none(),
    ): AnnotationQueueUpdateResponse = update(queueId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AnnotationQueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueUpdateResponse

    /** @see update */
    fun update(params: AnnotationQueueUpdateParams): AnnotationQueueUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(queueId: String, requestOptions: RequestOptions): AnnotationQueueUpdateResponse =
        update(queueId, AnnotationQueueUpdateParams.none(), requestOptions)

    /** Delete Annotation Queue */
    fun delete(queueId: String): AnnotationQueueDeleteResponse =
        delete(queueId, AnnotationQueueDeleteParams.none())

    /** @see delete */
    fun delete(
        queueId: String,
        params: AnnotationQueueDeleteParams = AnnotationQueueDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueDeleteResponse =
        delete(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see delete */
    fun delete(
        queueId: String,
        params: AnnotationQueueDeleteParams = AnnotationQueueDeleteParams.none(),
    ): AnnotationQueueDeleteResponse = delete(queueId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AnnotationQueueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueDeleteResponse

    /** @see delete */
    fun delete(params: AnnotationQueueDeleteParams): AnnotationQueueDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(queueId: String, requestOptions: RequestOptions): AnnotationQueueDeleteResponse =
        delete(queueId, AnnotationQueueDeleteParams.none(), requestOptions)

    /** Create Annotation Queue */
    fun annotationQueues(params: AnnotationQueueAnnotationQueuesParams): AnnotationQueueSchema =
        annotationQueues(params, RequestOptions.none())

    /** @see annotationQueues */
    fun annotationQueues(
        params: AnnotationQueueAnnotationQueuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueSchema

    /** Create Identity Annotation Queue Run Status */
    fun createRunStatus(annotationQueueRunId: String): AnnotationQueueCreateRunStatusResponse =
        createRunStatus(annotationQueueRunId, AnnotationQueueCreateRunStatusParams.none())

    /** @see createRunStatus */
    fun createRunStatus(
        annotationQueueRunId: String,
        params: AnnotationQueueCreateRunStatusParams = AnnotationQueueCreateRunStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueCreateRunStatusResponse =
        createRunStatus(
            params.toBuilder().annotationQueueRunId(annotationQueueRunId).build(),
            requestOptions,
        )

    /** @see createRunStatus */
    fun createRunStatus(
        annotationQueueRunId: String,
        params: AnnotationQueueCreateRunStatusParams = AnnotationQueueCreateRunStatusParams.none(),
    ): AnnotationQueueCreateRunStatusResponse =
        createRunStatus(annotationQueueRunId, params, RequestOptions.none())

    /** @see createRunStatus */
    fun createRunStatus(
        params: AnnotationQueueCreateRunStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueCreateRunStatusResponse

    /** @see createRunStatus */
    fun createRunStatus(
        params: AnnotationQueueCreateRunStatusParams
    ): AnnotationQueueCreateRunStatusResponse = createRunStatus(params, RequestOptions.none())

    /** @see createRunStatus */
    fun createRunStatus(
        annotationQueueRunId: String,
        requestOptions: RequestOptions,
    ): AnnotationQueueCreateRunStatusResponse =
        createRunStatus(
            annotationQueueRunId,
            AnnotationQueueCreateRunStatusParams.none(),
            requestOptions,
        )

    /** Export Annotation Queue Archived Runs */
    fun export(queueId: String): AnnotationQueueExportResponse =
        export(queueId, AnnotationQueueExportParams.none())

    /** @see export */
    fun export(
        queueId: String,
        params: AnnotationQueueExportParams = AnnotationQueueExportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueExportResponse =
        export(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see export */
    fun export(
        queueId: String,
        params: AnnotationQueueExportParams = AnnotationQueueExportParams.none(),
    ): AnnotationQueueExportResponse = export(queueId, params, RequestOptions.none())

    /** @see export */
    fun export(
        params: AnnotationQueueExportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueExportResponse

    /** @see export */
    fun export(params: AnnotationQueueExportParams): AnnotationQueueExportResponse =
        export(params, RequestOptions.none())

    /** @see export */
    fun export(queueId: String, requestOptions: RequestOptions): AnnotationQueueExportResponse =
        export(queueId, AnnotationQueueExportParams.none(), requestOptions)

    /** Populate annotation queue with runs from an experiment. */
    fun populate(params: AnnotationQueuePopulateParams): AnnotationQueuePopulateResponse =
        populate(params, RequestOptions.none())

    /** @see populate */
    fun populate(
        params: AnnotationQueuePopulateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueuePopulateResponse

    /** Get Annotation Queues */
    fun retrieveAnnotationQueues(): AnnotationQueueRetrieveAnnotationQueuesPage =
        retrieveAnnotationQueues(AnnotationQueueRetrieveAnnotationQueuesParams.none())

    /** @see retrieveAnnotationQueues */
    fun retrieveAnnotationQueues(
        params: AnnotationQueueRetrieveAnnotationQueuesParams =
            AnnotationQueueRetrieveAnnotationQueuesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueRetrieveAnnotationQueuesPage

    /** @see retrieveAnnotationQueues */
    fun retrieveAnnotationQueues(
        params: AnnotationQueueRetrieveAnnotationQueuesParams =
            AnnotationQueueRetrieveAnnotationQueuesParams.none()
    ): AnnotationQueueRetrieveAnnotationQueuesPage =
        retrieveAnnotationQueues(params, RequestOptions.none())

    /** @see retrieveAnnotationQueues */
    fun retrieveAnnotationQueues(
        requestOptions: RequestOptions
    ): AnnotationQueueRetrieveAnnotationQueuesPage =
        retrieveAnnotationQueues(
            AnnotationQueueRetrieveAnnotationQueuesParams.none(),
            requestOptions,
        )

    /** Get Annotation Queues For Run */
    fun retrieveQueues(runId: String): List<AnnotationQueueSchema> =
        retrieveQueues(runId, AnnotationQueueRetrieveQueuesParams.none())

    /** @see retrieveQueues */
    fun retrieveQueues(
        runId: String,
        params: AnnotationQueueRetrieveQueuesParams = AnnotationQueueRetrieveQueuesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AnnotationQueueSchema> =
        retrieveQueues(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieveQueues */
    fun retrieveQueues(
        runId: String,
        params: AnnotationQueueRetrieveQueuesParams = AnnotationQueueRetrieveQueuesParams.none(),
    ): List<AnnotationQueueSchema> = retrieveQueues(runId, params, RequestOptions.none())

    /** @see retrieveQueues */
    fun retrieveQueues(
        params: AnnotationQueueRetrieveQueuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AnnotationQueueSchema>

    /** @see retrieveQueues */
    fun retrieveQueues(params: AnnotationQueueRetrieveQueuesParams): List<AnnotationQueueSchema> =
        retrieveQueues(params, RequestOptions.none())

    /** @see retrieveQueues */
    fun retrieveQueues(runId: String, requestOptions: RequestOptions): List<AnnotationQueueSchema> =
        retrieveQueues(runId, AnnotationQueueRetrieveQueuesParams.none(), requestOptions)

    /** Get a run from an annotation queue */
    fun retrieveRun(
        index: Long,
        params: AnnotationQueueRetrieveRunParams,
    ): RunSchemaWithAnnotationQueueInfo = retrieveRun(index, params, RequestOptions.none())

    /** @see retrieveRun */
    fun retrieveRun(
        index: Long,
        params: AnnotationQueueRetrieveRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunSchemaWithAnnotationQueueInfo =
        retrieveRun(params.toBuilder().index(index).build(), requestOptions)

    /** @see retrieveRun */
    fun retrieveRun(params: AnnotationQueueRetrieveRunParams): RunSchemaWithAnnotationQueueInfo =
        retrieveRun(params, RequestOptions.none())

    /** @see retrieveRun */
    fun retrieveRun(
        params: AnnotationQueueRetrieveRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunSchemaWithAnnotationQueueInfo

    /** Get Size From Annotation Queue */
    fun retrieveSize(queueId: String): AnnotationQueueSizeSchema =
        retrieveSize(queueId, AnnotationQueueRetrieveSizeParams.none())

    /** @see retrieveSize */
    fun retrieveSize(
        queueId: String,
        params: AnnotationQueueRetrieveSizeParams = AnnotationQueueRetrieveSizeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueSizeSchema =
        retrieveSize(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see retrieveSize */
    fun retrieveSize(
        queueId: String,
        params: AnnotationQueueRetrieveSizeParams = AnnotationQueueRetrieveSizeParams.none(),
    ): AnnotationQueueSizeSchema = retrieveSize(queueId, params, RequestOptions.none())

    /** @see retrieveSize */
    fun retrieveSize(
        params: AnnotationQueueRetrieveSizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueSizeSchema

    /** @see retrieveSize */
    fun retrieveSize(params: AnnotationQueueRetrieveSizeParams): AnnotationQueueSizeSchema =
        retrieveSize(params, RequestOptions.none())

    /** @see retrieveSize */
    fun retrieveSize(queueId: String, requestOptions: RequestOptions): AnnotationQueueSizeSchema =
        retrieveSize(queueId, AnnotationQueueRetrieveSizeParams.none(), requestOptions)

    /** Get Total Archived From Annotation Queue */
    fun retrieveTotalArchived(queueId: String): AnnotationQueueSizeSchema =
        retrieveTotalArchived(queueId, AnnotationQueueRetrieveTotalArchivedParams.none())

    /** @see retrieveTotalArchived */
    fun retrieveTotalArchived(
        queueId: String,
        params: AnnotationQueueRetrieveTotalArchivedParams =
            AnnotationQueueRetrieveTotalArchivedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueSizeSchema =
        retrieveTotalArchived(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see retrieveTotalArchived */
    fun retrieveTotalArchived(
        queueId: String,
        params: AnnotationQueueRetrieveTotalArchivedParams =
            AnnotationQueueRetrieveTotalArchivedParams.none(),
    ): AnnotationQueueSizeSchema = retrieveTotalArchived(queueId, params, RequestOptions.none())

    /** @see retrieveTotalArchived */
    fun retrieveTotalArchived(
        params: AnnotationQueueRetrieveTotalArchivedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueSizeSchema

    /** @see retrieveTotalArchived */
    fun retrieveTotalArchived(
        params: AnnotationQueueRetrieveTotalArchivedParams
    ): AnnotationQueueSizeSchema = retrieveTotalArchived(params, RequestOptions.none())

    /** @see retrieveTotalArchived */
    fun retrieveTotalArchived(
        queueId: String,
        requestOptions: RequestOptions,
    ): AnnotationQueueSizeSchema =
        retrieveTotalArchived(
            queueId,
            AnnotationQueueRetrieveTotalArchivedParams.none(),
            requestOptions,
        )

    /** Get Total Size From Annotation Queue */
    fun retrieveTotalSize(queueId: String): AnnotationQueueSizeSchema =
        retrieveTotalSize(queueId, AnnotationQueueRetrieveTotalSizeParams.none())

    /** @see retrieveTotalSize */
    fun retrieveTotalSize(
        queueId: String,
        params: AnnotationQueueRetrieveTotalSizeParams =
            AnnotationQueueRetrieveTotalSizeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueSizeSchema =
        retrieveTotalSize(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see retrieveTotalSize */
    fun retrieveTotalSize(
        queueId: String,
        params: AnnotationQueueRetrieveTotalSizeParams =
            AnnotationQueueRetrieveTotalSizeParams.none(),
    ): AnnotationQueueSizeSchema = retrieveTotalSize(queueId, params, RequestOptions.none())

    /** @see retrieveTotalSize */
    fun retrieveTotalSize(
        params: AnnotationQueueRetrieveTotalSizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueSizeSchema

    /** @see retrieveTotalSize */
    fun retrieveTotalSize(
        params: AnnotationQueueRetrieveTotalSizeParams
    ): AnnotationQueueSizeSchema = retrieveTotalSize(params, RequestOptions.none())

    /** @see retrieveTotalSize */
    fun retrieveTotalSize(
        queueId: String,
        requestOptions: RequestOptions,
    ): AnnotationQueueSizeSchema =
        retrieveTotalSize(queueId, AnnotationQueueRetrieveTotalSizeParams.none(), requestOptions)

    /**
     * A view of [AnnotationQueueService] that provides access to raw HTTP responses for each
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
        ): AnnotationQueueService.WithRawResponse

        fun runs(): RunService.WithRawResponse

        fun info(): InfoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}`, but is
         * otherwise the same as [AnnotationQueueService.retrieve].
         */
        @MustBeClosed
        fun retrieve(queueId: String): HttpResponseFor<AnnotationQueueRetrieveResponse> =
            retrieve(queueId, AnnotationQueueRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            queueId: String,
            params: AnnotationQueueRetrieveParams = AnnotationQueueRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueRetrieveResponse> =
            retrieve(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            queueId: String,
            params: AnnotationQueueRetrieveParams = AnnotationQueueRetrieveParams.none(),
        ): HttpResponseFor<AnnotationQueueRetrieveResponse> =
            retrieve(queueId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AnnotationQueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AnnotationQueueRetrieveParams
        ): HttpResponseFor<AnnotationQueueRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            queueId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueRetrieveResponse> =
            retrieve(queueId, AnnotationQueueRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/annotation-queues/{queue_id}`, but is
         * otherwise the same as [AnnotationQueueService.update].
         */
        @MustBeClosed
        fun update(queueId: String): HttpResponseFor<AnnotationQueueUpdateResponse> =
            update(queueId, AnnotationQueueUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            queueId: String,
            params: AnnotationQueueUpdateParams = AnnotationQueueUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueUpdateResponse> =
            update(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            queueId: String,
            params: AnnotationQueueUpdateParams = AnnotationQueueUpdateParams.none(),
        ): HttpResponseFor<AnnotationQueueUpdateResponse> =
            update(queueId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AnnotationQueueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: AnnotationQueueUpdateParams
        ): HttpResponseFor<AnnotationQueueUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            queueId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueUpdateResponse> =
            update(queueId, AnnotationQueueUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/annotation-queues/{queue_id}`, but is
         * otherwise the same as [AnnotationQueueService.delete].
         */
        @MustBeClosed
        fun delete(queueId: String): HttpResponseFor<AnnotationQueueDeleteResponse> =
            delete(queueId, AnnotationQueueDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            queueId: String,
            params: AnnotationQueueDeleteParams = AnnotationQueueDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueDeleteResponse> =
            delete(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            queueId: String,
            params: AnnotationQueueDeleteParams = AnnotationQueueDeleteParams.none(),
        ): HttpResponseFor<AnnotationQueueDeleteResponse> =
            delete(queueId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AnnotationQueueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AnnotationQueueDeleteParams
        ): HttpResponseFor<AnnotationQueueDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            queueId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueDeleteResponse> =
            delete(queueId, AnnotationQueueDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues`, but is otherwise the
         * same as [AnnotationQueueService.annotationQueues].
         */
        @MustBeClosed
        fun annotationQueues(
            params: AnnotationQueueAnnotationQueuesParams
        ): HttpResponseFor<AnnotationQueueSchema> = annotationQueues(params, RequestOptions.none())

        /** @see annotationQueues */
        @MustBeClosed
        fun annotationQueues(
            params: AnnotationQueueAnnotationQueuesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueSchema>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/annotation-queues/status/{annotation_queue_run_id}`, but is otherwise the same as
         * [AnnotationQueueService.createRunStatus].
         */
        @MustBeClosed
        fun createRunStatus(
            annotationQueueRunId: String
        ): HttpResponseFor<AnnotationQueueCreateRunStatusResponse> =
            createRunStatus(annotationQueueRunId, AnnotationQueueCreateRunStatusParams.none())

        /** @see createRunStatus */
        @MustBeClosed
        fun createRunStatus(
            annotationQueueRunId: String,
            params: AnnotationQueueCreateRunStatusParams =
                AnnotationQueueCreateRunStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueCreateRunStatusResponse> =
            createRunStatus(
                params.toBuilder().annotationQueueRunId(annotationQueueRunId).build(),
                requestOptions,
            )

        /** @see createRunStatus */
        @MustBeClosed
        fun createRunStatus(
            annotationQueueRunId: String,
            params: AnnotationQueueCreateRunStatusParams =
                AnnotationQueueCreateRunStatusParams.none(),
        ): HttpResponseFor<AnnotationQueueCreateRunStatusResponse> =
            createRunStatus(annotationQueueRunId, params, RequestOptions.none())

        /** @see createRunStatus */
        @MustBeClosed
        fun createRunStatus(
            params: AnnotationQueueCreateRunStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueCreateRunStatusResponse>

        /** @see createRunStatus */
        @MustBeClosed
        fun createRunStatus(
            params: AnnotationQueueCreateRunStatusParams
        ): HttpResponseFor<AnnotationQueueCreateRunStatusResponse> =
            createRunStatus(params, RequestOptions.none())

        /** @see createRunStatus */
        @MustBeClosed
        fun createRunStatus(
            annotationQueueRunId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueCreateRunStatusResponse> =
            createRunStatus(
                annotationQueueRunId,
                AnnotationQueueCreateRunStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues/{queue_id}/export`, but
         * is otherwise the same as [AnnotationQueueService.export].
         */
        @MustBeClosed
        fun export(queueId: String): HttpResponseFor<AnnotationQueueExportResponse> =
            export(queueId, AnnotationQueueExportParams.none())

        /** @see export */
        @MustBeClosed
        fun export(
            queueId: String,
            params: AnnotationQueueExportParams = AnnotationQueueExportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueExportResponse> =
            export(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see export */
        @MustBeClosed
        fun export(
            queueId: String,
            params: AnnotationQueueExportParams = AnnotationQueueExportParams.none(),
        ): HttpResponseFor<AnnotationQueueExportResponse> =
            export(queueId, params, RequestOptions.none())

        /** @see export */
        @MustBeClosed
        fun export(
            params: AnnotationQueueExportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueExportResponse>

        /** @see export */
        @MustBeClosed
        fun export(
            params: AnnotationQueueExportParams
        ): HttpResponseFor<AnnotationQueueExportResponse> = export(params, RequestOptions.none())

        /** @see export */
        @MustBeClosed
        fun export(
            queueId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueExportResponse> =
            export(queueId, AnnotationQueueExportParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues/populate`, but is
         * otherwise the same as [AnnotationQueueService.populate].
         */
        @MustBeClosed
        fun populate(
            params: AnnotationQueuePopulateParams
        ): HttpResponseFor<AnnotationQueuePopulateResponse> =
            populate(params, RequestOptions.none())

        /** @see populate */
        @MustBeClosed
        fun populate(
            params: AnnotationQueuePopulateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueuePopulateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues`, but is otherwise the
         * same as [AnnotationQueueService.retrieveAnnotationQueues].
         */
        @MustBeClosed
        fun retrieveAnnotationQueues():
            HttpResponseFor<AnnotationQueueRetrieveAnnotationQueuesPage> =
            retrieveAnnotationQueues(AnnotationQueueRetrieveAnnotationQueuesParams.none())

        /** @see retrieveAnnotationQueues */
        @MustBeClosed
        fun retrieveAnnotationQueues(
            params: AnnotationQueueRetrieveAnnotationQueuesParams =
                AnnotationQueueRetrieveAnnotationQueuesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueRetrieveAnnotationQueuesPage>

        /** @see retrieveAnnotationQueues */
        @MustBeClosed
        fun retrieveAnnotationQueues(
            params: AnnotationQueueRetrieveAnnotationQueuesParams =
                AnnotationQueueRetrieveAnnotationQueuesParams.none()
        ): HttpResponseFor<AnnotationQueueRetrieveAnnotationQueuesPage> =
            retrieveAnnotationQueues(params, RequestOptions.none())

        /** @see retrieveAnnotationQueues */
        @MustBeClosed
        fun retrieveAnnotationQueues(
            requestOptions: RequestOptions
        ): HttpResponseFor<AnnotationQueueRetrieveAnnotationQueuesPage> =
            retrieveAnnotationQueues(
                AnnotationQueueRetrieveAnnotationQueuesParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{run_id}/queues`, but is
         * otherwise the same as [AnnotationQueueService.retrieveQueues].
         */
        @MustBeClosed
        fun retrieveQueues(runId: String): HttpResponseFor<List<AnnotationQueueSchema>> =
            retrieveQueues(runId, AnnotationQueueRetrieveQueuesParams.none())

        /** @see retrieveQueues */
        @MustBeClosed
        fun retrieveQueues(
            runId: String,
            params: AnnotationQueueRetrieveQueuesParams =
                AnnotationQueueRetrieveQueuesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AnnotationQueueSchema>> =
            retrieveQueues(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieveQueues */
        @MustBeClosed
        fun retrieveQueues(
            runId: String,
            params: AnnotationQueueRetrieveQueuesParams = AnnotationQueueRetrieveQueuesParams.none(),
        ): HttpResponseFor<List<AnnotationQueueSchema>> =
            retrieveQueues(runId, params, RequestOptions.none())

        /** @see retrieveQueues */
        @MustBeClosed
        fun retrieveQueues(
            params: AnnotationQueueRetrieveQueuesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AnnotationQueueSchema>>

        /** @see retrieveQueues */
        @MustBeClosed
        fun retrieveQueues(
            params: AnnotationQueueRetrieveQueuesParams
        ): HttpResponseFor<List<AnnotationQueueSchema>> =
            retrieveQueues(params, RequestOptions.none())

        /** @see retrieveQueues */
        @MustBeClosed
        fun retrieveQueues(
            runId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AnnotationQueueSchema>> =
            retrieveQueues(runId, AnnotationQueueRetrieveQueuesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}/run/{index}`,
         * but is otherwise the same as [AnnotationQueueService.retrieveRun].
         */
        @MustBeClosed
        fun retrieveRun(
            index: Long,
            params: AnnotationQueueRetrieveRunParams,
        ): HttpResponseFor<RunSchemaWithAnnotationQueueInfo> =
            retrieveRun(index, params, RequestOptions.none())

        /** @see retrieveRun */
        @MustBeClosed
        fun retrieveRun(
            index: Long,
            params: AnnotationQueueRetrieveRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunSchemaWithAnnotationQueueInfo> =
            retrieveRun(params.toBuilder().index(index).build(), requestOptions)

        /** @see retrieveRun */
        @MustBeClosed
        fun retrieveRun(
            params: AnnotationQueueRetrieveRunParams
        ): HttpResponseFor<RunSchemaWithAnnotationQueueInfo> =
            retrieveRun(params, RequestOptions.none())

        /** @see retrieveRun */
        @MustBeClosed
        fun retrieveRun(
            params: AnnotationQueueRetrieveRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunSchemaWithAnnotationQueueInfo>

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}/size`, but is
         * otherwise the same as [AnnotationQueueService.retrieveSize].
         */
        @MustBeClosed
        fun retrieveSize(queueId: String): HttpResponseFor<AnnotationQueueSizeSchema> =
            retrieveSize(queueId, AnnotationQueueRetrieveSizeParams.none())

        /** @see retrieveSize */
        @MustBeClosed
        fun retrieveSize(
            queueId: String,
            params: AnnotationQueueRetrieveSizeParams = AnnotationQueueRetrieveSizeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueSizeSchema> =
            retrieveSize(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see retrieveSize */
        @MustBeClosed
        fun retrieveSize(
            queueId: String,
            params: AnnotationQueueRetrieveSizeParams = AnnotationQueueRetrieveSizeParams.none(),
        ): HttpResponseFor<AnnotationQueueSizeSchema> =
            retrieveSize(queueId, params, RequestOptions.none())

        /** @see retrieveSize */
        @MustBeClosed
        fun retrieveSize(
            params: AnnotationQueueRetrieveSizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueSizeSchema>

        /** @see retrieveSize */
        @MustBeClosed
        fun retrieveSize(
            params: AnnotationQueueRetrieveSizeParams
        ): HttpResponseFor<AnnotationQueueSizeSchema> = retrieveSize(params, RequestOptions.none())

        /** @see retrieveSize */
        @MustBeClosed
        fun retrieveSize(
            queueId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueSizeSchema> =
            retrieveSize(queueId, AnnotationQueueRetrieveSizeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/annotation-queues/{queue_id}/total_archived`, but is otherwise the same as
         * [AnnotationQueueService.retrieveTotalArchived].
         */
        @MustBeClosed
        fun retrieveTotalArchived(queueId: String): HttpResponseFor<AnnotationQueueSizeSchema> =
            retrieveTotalArchived(queueId, AnnotationQueueRetrieveTotalArchivedParams.none())

        /** @see retrieveTotalArchived */
        @MustBeClosed
        fun retrieveTotalArchived(
            queueId: String,
            params: AnnotationQueueRetrieveTotalArchivedParams =
                AnnotationQueueRetrieveTotalArchivedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueSizeSchema> =
            retrieveTotalArchived(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see retrieveTotalArchived */
        @MustBeClosed
        fun retrieveTotalArchived(
            queueId: String,
            params: AnnotationQueueRetrieveTotalArchivedParams =
                AnnotationQueueRetrieveTotalArchivedParams.none(),
        ): HttpResponseFor<AnnotationQueueSizeSchema> =
            retrieveTotalArchived(queueId, params, RequestOptions.none())

        /** @see retrieveTotalArchived */
        @MustBeClosed
        fun retrieveTotalArchived(
            params: AnnotationQueueRetrieveTotalArchivedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueSizeSchema>

        /** @see retrieveTotalArchived */
        @MustBeClosed
        fun retrieveTotalArchived(
            params: AnnotationQueueRetrieveTotalArchivedParams
        ): HttpResponseFor<AnnotationQueueSizeSchema> =
            retrieveTotalArchived(params, RequestOptions.none())

        /** @see retrieveTotalArchived */
        @MustBeClosed
        fun retrieveTotalArchived(
            queueId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueSizeSchema> =
            retrieveTotalArchived(
                queueId,
                AnnotationQueueRetrieveTotalArchivedParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}/total_size`,
         * but is otherwise the same as [AnnotationQueueService.retrieveTotalSize].
         */
        @MustBeClosed
        fun retrieveTotalSize(queueId: String): HttpResponseFor<AnnotationQueueSizeSchema> =
            retrieveTotalSize(queueId, AnnotationQueueRetrieveTotalSizeParams.none())

        /** @see retrieveTotalSize */
        @MustBeClosed
        fun retrieveTotalSize(
            queueId: String,
            params: AnnotationQueueRetrieveTotalSizeParams =
                AnnotationQueueRetrieveTotalSizeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueSizeSchema> =
            retrieveTotalSize(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see retrieveTotalSize */
        @MustBeClosed
        fun retrieveTotalSize(
            queueId: String,
            params: AnnotationQueueRetrieveTotalSizeParams =
                AnnotationQueueRetrieveTotalSizeParams.none(),
        ): HttpResponseFor<AnnotationQueueSizeSchema> =
            retrieveTotalSize(queueId, params, RequestOptions.none())

        /** @see retrieveTotalSize */
        @MustBeClosed
        fun retrieveTotalSize(
            params: AnnotationQueueRetrieveTotalSizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueSizeSchema>

        /** @see retrieveTotalSize */
        @MustBeClosed
        fun retrieveTotalSize(
            params: AnnotationQueueRetrieveTotalSizeParams
        ): HttpResponseFor<AnnotationQueueSizeSchema> =
            retrieveTotalSize(params, RequestOptions.none())

        /** @see retrieveTotalSize */
        @MustBeClosed
        fun retrieveTotalSize(
            queueId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueSizeSchema> =
            retrieveTotalSize(
                queueId,
                AnnotationQueueRetrieveTotalSizeParams.none(),
                requestOptions,
            )
    }
}
