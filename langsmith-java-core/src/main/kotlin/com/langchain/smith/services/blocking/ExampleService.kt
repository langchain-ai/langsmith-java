// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.examples.ExampleCreateParams
import com.langchain.smith.models.examples.ExampleDeleteAllParams
import com.langchain.smith.models.examples.ExampleDeleteAllResponse
import com.langchain.smith.models.examples.ExampleDeleteParams
import com.langchain.smith.models.examples.ExampleDeleteResponse
import com.langchain.smith.models.examples.ExampleListPage
import com.langchain.smith.models.examples.ExampleListParams
import com.langchain.smith.models.examples.ExampleRetrieveCountParams
import com.langchain.smith.models.examples.ExampleRetrieveParams
import com.langchain.smith.models.examples.ExampleUpdateParams
import com.langchain.smith.models.examples.ExampleUpdateResponse
import com.langchain.smith.models.examples.ExampleUploadFromCsvParams
import com.langchain.smith.services.blocking.examples.BulkService
import com.langchain.smith.services.blocking.examples.ValidateService
import java.util.function.Consumer

interface ExampleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleService

    fun bulk(): BulkService

    fun validate(): ValidateService

    /** Create a new example. */
    fun create(params: ExampleCreateParams): Example = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExampleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Example

    /** Get a specific example. */
    fun retrieve(exampleId: String): Example = retrieve(exampleId, ExampleRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        exampleId: String,
        params: ExampleRetrieveParams = ExampleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Example = retrieve(params.toBuilder().exampleId(exampleId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        exampleId: String,
        params: ExampleRetrieveParams = ExampleRetrieveParams.none(),
    ): Example = retrieve(exampleId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ExampleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Example

    /** @see retrieve */
    fun retrieve(params: ExampleRetrieveParams): Example = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(exampleId: String, requestOptions: RequestOptions): Example =
        retrieve(exampleId, ExampleRetrieveParams.none(), requestOptions)

    /** Update a specific example. */
    fun update(exampleId: String): ExampleUpdateResponse =
        update(exampleId, ExampleUpdateParams.none())

    /** @see update */
    fun update(
        exampleId: String,
        params: ExampleUpdateParams = ExampleUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleUpdateResponse =
        update(params.toBuilder().exampleId(exampleId).build(), requestOptions)

    /** @see update */
    fun update(
        exampleId: String,
        params: ExampleUpdateParams = ExampleUpdateParams.none(),
    ): ExampleUpdateResponse = update(exampleId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ExampleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleUpdateResponse

    /** @see update */
    fun update(params: ExampleUpdateParams): ExampleUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(exampleId: String, requestOptions: RequestOptions): ExampleUpdateResponse =
        update(exampleId, ExampleUpdateParams.none(), requestOptions)

    /** Get all examples by query params */
    fun list(): ExampleListPage = list(ExampleListParams.none())

    /** @see list */
    fun list(
        params: ExampleListParams = ExampleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleListPage

    /** @see list */
    fun list(params: ExampleListParams = ExampleListParams.none()): ExampleListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ExampleListPage =
        list(ExampleListParams.none(), requestOptions)

    /** Soft delete an example. Only deletes the example in the 'latest' version of the dataset. */
    fun delete(exampleId: String): ExampleDeleteResponse =
        delete(exampleId, ExampleDeleteParams.none())

    /** @see delete */
    fun delete(
        exampleId: String,
        params: ExampleDeleteParams = ExampleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleDeleteResponse =
        delete(params.toBuilder().exampleId(exampleId).build(), requestOptions)

    /** @see delete */
    fun delete(
        exampleId: String,
        params: ExampleDeleteParams = ExampleDeleteParams.none(),
    ): ExampleDeleteResponse = delete(exampleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ExampleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleDeleteResponse

    /** @see delete */
    fun delete(params: ExampleDeleteParams): ExampleDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(exampleId: String, requestOptions: RequestOptions): ExampleDeleteResponse =
        delete(exampleId, ExampleDeleteParams.none(), requestOptions)

    /** Soft delete examples. Only deletes the examples in the 'latest' version of the dataset. */
    fun deleteAll(params: ExampleDeleteAllParams): ExampleDeleteAllResponse =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: ExampleDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExampleDeleteAllResponse

    /** Count all examples by query params */
    fun retrieveCount(): Long = retrieveCount(ExampleRetrieveCountParams.none())

    /** @see retrieveCount */
    fun retrieveCount(
        params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Long

    /** @see retrieveCount */
    fun retrieveCount(
        params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none()
    ): Long = retrieveCount(params, RequestOptions.none())

    /** @see retrieveCount */
    fun retrieveCount(requestOptions: RequestOptions): Long =
        retrieveCount(ExampleRetrieveCountParams.none(), requestOptions)

    /**
     * Upload examples from a CSV file.
     *
     * Note: For non-csv upload, please use the POST /v1/platform/datasets/{dataset_id}/examples
     * endpoint which provides more efficient upload.
     */
    fun uploadFromCsv(datasetId: String, params: ExampleUploadFromCsvParams): List<Example> =
        uploadFromCsv(datasetId, params, RequestOptions.none())

    /** @see uploadFromCsv */
    fun uploadFromCsv(
        datasetId: String,
        params: ExampleUploadFromCsvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Example> =
        uploadFromCsv(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see uploadFromCsv */
    fun uploadFromCsv(params: ExampleUploadFromCsvParams): List<Example> =
        uploadFromCsv(params, RequestOptions.none())

    /** @see uploadFromCsv */
    fun uploadFromCsv(
        params: ExampleUploadFromCsvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Example>

    /** A view of [ExampleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleService.WithRawResponse

        fun bulk(): BulkService.WithRawResponse

        fun validate(): ValidateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/examples`, but is otherwise the same as
         * [ExampleService.create].
         */
        @MustBeClosed
        fun create(params: ExampleCreateParams): HttpResponseFor<Example> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ExampleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Example>

        /**
         * Returns a raw HTTP response for `get /api/v1/examples/{example_id}`, but is otherwise the
         * same as [ExampleService.retrieve].
         */
        @MustBeClosed
        fun retrieve(exampleId: String): HttpResponseFor<Example> =
            retrieve(exampleId, ExampleRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            exampleId: String,
            params: ExampleRetrieveParams = ExampleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Example> =
            retrieve(params.toBuilder().exampleId(exampleId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            exampleId: String,
            params: ExampleRetrieveParams = ExampleRetrieveParams.none(),
        ): HttpResponseFor<Example> = retrieve(exampleId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ExampleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Example>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ExampleRetrieveParams): HttpResponseFor<Example> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(exampleId: String, requestOptions: RequestOptions): HttpResponseFor<Example> =
            retrieve(exampleId, ExampleRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/examples/{example_id}`, but is otherwise
         * the same as [ExampleService.update].
         */
        @MustBeClosed
        fun update(exampleId: String): HttpResponseFor<ExampleUpdateResponse> =
            update(exampleId, ExampleUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            exampleId: String,
            params: ExampleUpdateParams = ExampleUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleUpdateResponse> =
            update(params.toBuilder().exampleId(exampleId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            exampleId: String,
            params: ExampleUpdateParams = ExampleUpdateParams.none(),
        ): HttpResponseFor<ExampleUpdateResponse> = update(exampleId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ExampleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: ExampleUpdateParams): HttpResponseFor<ExampleUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            exampleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExampleUpdateResponse> =
            update(exampleId, ExampleUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/examples`, but is otherwise the same as
         * [ExampleService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ExampleListPage> = list(ExampleListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExampleListParams = ExampleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExampleListParams = ExampleListParams.none()
        ): HttpResponseFor<ExampleListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExampleListPage> =
            list(ExampleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/examples/{example_id}`, but is otherwise
         * the same as [ExampleService.delete].
         */
        @MustBeClosed
        fun delete(exampleId: String): HttpResponseFor<ExampleDeleteResponse> =
            delete(exampleId, ExampleDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            exampleId: String,
            params: ExampleDeleteParams = ExampleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleDeleteResponse> =
            delete(params.toBuilder().exampleId(exampleId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            exampleId: String,
            params: ExampleDeleteParams = ExampleDeleteParams.none(),
        ): HttpResponseFor<ExampleDeleteResponse> = delete(exampleId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ExampleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ExampleDeleteParams): HttpResponseFor<ExampleDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            exampleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExampleDeleteResponse> =
            delete(exampleId, ExampleDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/examples`, but is otherwise the same as
         * [ExampleService.deleteAll].
         */
        @MustBeClosed
        fun deleteAll(params: ExampleDeleteAllParams): HttpResponseFor<ExampleDeleteAllResponse> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: ExampleDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExampleDeleteAllResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/examples/count`, but is otherwise the same
         * as [ExampleService.retrieveCount].
         */
        @MustBeClosed
        fun retrieveCount(): HttpResponseFor<Long> =
            retrieveCount(ExampleRetrieveCountParams.none())

        /** @see retrieveCount */
        @MustBeClosed
        fun retrieveCount(
            params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Long>

        /** @see retrieveCount */
        @MustBeClosed
        fun retrieveCount(
            params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none()
        ): HttpResponseFor<Long> = retrieveCount(params, RequestOptions.none())

        /** @see retrieveCount */
        @MustBeClosed
        fun retrieveCount(requestOptions: RequestOptions): HttpResponseFor<Long> =
            retrieveCount(ExampleRetrieveCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/examples/upload/{dataset_id}`, but is
         * otherwise the same as [ExampleService.uploadFromCsv].
         */
        @MustBeClosed
        fun uploadFromCsv(
            datasetId: String,
            params: ExampleUploadFromCsvParams,
        ): HttpResponseFor<List<Example>> = uploadFromCsv(datasetId, params, RequestOptions.none())

        /** @see uploadFromCsv */
        @MustBeClosed
        fun uploadFromCsv(
            datasetId: String,
            params: ExampleUploadFromCsvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Example>> =
            uploadFromCsv(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see uploadFromCsv */
        @MustBeClosed
        fun uploadFromCsv(params: ExampleUploadFromCsvParams): HttpResponseFor<List<Example>> =
            uploadFromCsv(params, RequestOptions.none())

        /** @see uploadFromCsv */
        @MustBeClosed
        fun uploadFromCsv(
            params: ExampleUploadFromCsvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Example>>
    }
}
