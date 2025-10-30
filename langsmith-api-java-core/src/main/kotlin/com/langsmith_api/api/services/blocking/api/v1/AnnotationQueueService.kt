// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueAnnotationQueuesParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueDeleteParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueDeleteResponse
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueExportParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueExportResponse
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueuePopulateParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueuePopulateResponse
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveAnnotationQueuesParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveAnnotationQueuesResponse
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveQueuesParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveSizeParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveTotalArchivedParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueRetrieveTotalSizeParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueSchema
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueSizeSchema
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueUpdateParams
import com.langsmith_api.api.models.api.v1.annotationqueues.AnnotationQueueUpdateResponse
import com.langsmith_api.api.models.api.v1.annotationqueues.RunSchemaWithAnnotationQueueInfo
import com.langsmith_api.api.services.blocking.api.v1.annotationqueues.RunService
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

    /** Get a run from an annotation queue */
    fun retrieve(
        index: Long,
        params: AnnotationQueueRetrieveParams,
    ): RunSchemaWithAnnotationQueueInfo = retrieve(index, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        index: Long,
        params: AnnotationQueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunSchemaWithAnnotationQueueInfo =
        retrieve(params.toBuilder().index(index).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: AnnotationQueueRetrieveParams): RunSchemaWithAnnotationQueueInfo =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AnnotationQueueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunSchemaWithAnnotationQueueInfo

    /** Create Identity Annotation Queue Run Status */
    fun update(annotationQueueRunId: String): AnnotationQueueUpdateResponse =
        update(annotationQueueRunId, AnnotationQueueUpdateParams.none())

    /** @see update */
    fun update(
        annotationQueueRunId: String,
        params: AnnotationQueueUpdateParams = AnnotationQueueUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueUpdateResponse =
        update(
            params.toBuilder().annotationQueueRunId(annotationQueueRunId).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        annotationQueueRunId: String,
        params: AnnotationQueueUpdateParams = AnnotationQueueUpdateParams.none(),
    ): AnnotationQueueUpdateResponse = update(annotationQueueRunId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AnnotationQueueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnnotationQueueUpdateResponse

    /** @see update */
    fun update(params: AnnotationQueueUpdateParams): AnnotationQueueUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        annotationQueueRunId: String,
        requestOptions: RequestOptions,
    ): AnnotationQueueUpdateResponse =
        update(annotationQueueRunId, AnnotationQueueUpdateParams.none(), requestOptions)

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
    fun retrieveAnnotationQueues(): List<AnnotationQueueRetrieveAnnotationQueuesResponse> =
        retrieveAnnotationQueues(AnnotationQueueRetrieveAnnotationQueuesParams.none())

    /** @see retrieveAnnotationQueues */
    fun retrieveAnnotationQueues(
        params: AnnotationQueueRetrieveAnnotationQueuesParams =
            AnnotationQueueRetrieveAnnotationQueuesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AnnotationQueueRetrieveAnnotationQueuesResponse>

    /** @see retrieveAnnotationQueues */
    fun retrieveAnnotationQueues(
        params: AnnotationQueueRetrieveAnnotationQueuesParams =
            AnnotationQueueRetrieveAnnotationQueuesParams.none()
    ): List<AnnotationQueueRetrieveAnnotationQueuesResponse> =
        retrieveAnnotationQueues(params, RequestOptions.none())

    /** @see retrieveAnnotationQueues */
    fun retrieveAnnotationQueues(
        requestOptions: RequestOptions
    ): List<AnnotationQueueRetrieveAnnotationQueuesResponse> =
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

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}/run/{index}`,
         * but is otherwise the same as [AnnotationQueueService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            index: Long,
            params: AnnotationQueueRetrieveParams,
        ): HttpResponseFor<RunSchemaWithAnnotationQueueInfo> =
            retrieve(index, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            index: Long,
            params: AnnotationQueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunSchemaWithAnnotationQueueInfo> =
            retrieve(params.toBuilder().index(index).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AnnotationQueueRetrieveParams
        ): HttpResponseFor<RunSchemaWithAnnotationQueueInfo> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AnnotationQueueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunSchemaWithAnnotationQueueInfo>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/annotation-queues/status/{annotation_queue_run_id}`, but is otherwise the same as
         * [AnnotationQueueService.update].
         */
        @MustBeClosed
        fun update(annotationQueueRunId: String): HttpResponseFor<AnnotationQueueUpdateResponse> =
            update(annotationQueueRunId, AnnotationQueueUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            annotationQueueRunId: String,
            params: AnnotationQueueUpdateParams = AnnotationQueueUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnnotationQueueUpdateResponse> =
            update(
                params.toBuilder().annotationQueueRunId(annotationQueueRunId).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            annotationQueueRunId: String,
            params: AnnotationQueueUpdateParams = AnnotationQueueUpdateParams.none(),
        ): HttpResponseFor<AnnotationQueueUpdateResponse> =
            update(annotationQueueRunId, params, RequestOptions.none())

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
            annotationQueueRunId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnnotationQueueUpdateResponse> =
            update(annotationQueueRunId, AnnotationQueueUpdateParams.none(), requestOptions)

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
            HttpResponseFor<List<AnnotationQueueRetrieveAnnotationQueuesResponse>> =
            retrieveAnnotationQueues(AnnotationQueueRetrieveAnnotationQueuesParams.none())

        /** @see retrieveAnnotationQueues */
        @MustBeClosed
        fun retrieveAnnotationQueues(
            params: AnnotationQueueRetrieveAnnotationQueuesParams =
                AnnotationQueueRetrieveAnnotationQueuesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AnnotationQueueRetrieveAnnotationQueuesResponse>>

        /** @see retrieveAnnotationQueues */
        @MustBeClosed
        fun retrieveAnnotationQueues(
            params: AnnotationQueueRetrieveAnnotationQueuesParams =
                AnnotationQueueRetrieveAnnotationQueuesParams.none()
        ): HttpResponseFor<List<AnnotationQueueRetrieveAnnotationQueuesResponse>> =
            retrieveAnnotationQueues(params, RequestOptions.none())

        /** @see retrieveAnnotationQueues */
        @MustBeClosed
        fun retrieveAnnotationQueues(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<AnnotationQueueRetrieveAnnotationQueuesResponse>> =
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
