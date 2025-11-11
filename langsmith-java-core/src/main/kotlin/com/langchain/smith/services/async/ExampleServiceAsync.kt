// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.examples.Example
import com.langchain.smith.models.examples.ExampleCreateParams
import com.langchain.smith.models.examples.ExampleDeleteAllParams
import com.langchain.smith.models.examples.ExampleDeleteAllResponse
import com.langchain.smith.models.examples.ExampleDeleteParams
import com.langchain.smith.models.examples.ExampleDeleteResponse
import com.langchain.smith.models.examples.ExampleListParams
import com.langchain.smith.models.examples.ExampleRetrieveCountParams
import com.langchain.smith.models.examples.ExampleRetrieveParams
import com.langchain.smith.models.examples.ExampleUpdateParams
import com.langchain.smith.models.examples.ExampleUpdateResponse
import com.langchain.smith.models.examples.ExampleUploadFromCsvParams
import com.langchain.smith.services.async.examples.BulkServiceAsync
import com.langchain.smith.services.async.examples.ValidateServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExampleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExampleServiceAsync

    fun bulk(): BulkServiceAsync

    fun validate(): ValidateServiceAsync

    /** Create a new example. */
    fun create(params: ExampleCreateParams): CompletableFuture<Example> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExampleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Example>

    /** Get a specific example. */
    fun retrieve(exampleId: String): CompletableFuture<Example> =
        retrieve(exampleId, ExampleRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        exampleId: String,
        params: ExampleRetrieveParams = ExampleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Example> =
        retrieve(params.toBuilder().exampleId(exampleId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        exampleId: String,
        params: ExampleRetrieveParams = ExampleRetrieveParams.none(),
    ): CompletableFuture<Example> = retrieve(exampleId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ExampleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Example>

    /** @see retrieve */
    fun retrieve(params: ExampleRetrieveParams): CompletableFuture<Example> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(exampleId: String, requestOptions: RequestOptions): CompletableFuture<Example> =
        retrieve(exampleId, ExampleRetrieveParams.none(), requestOptions)

    /** Update a specific example. */
    fun update(exampleId: String): CompletableFuture<ExampleUpdateResponse> =
        update(exampleId, ExampleUpdateParams.none())

    /** @see update */
    fun update(
        exampleId: String,
        params: ExampleUpdateParams = ExampleUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExampleUpdateResponse> =
        update(params.toBuilder().exampleId(exampleId).build(), requestOptions)

    /** @see update */
    fun update(
        exampleId: String,
        params: ExampleUpdateParams = ExampleUpdateParams.none(),
    ): CompletableFuture<ExampleUpdateResponse> = update(exampleId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ExampleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExampleUpdateResponse>

    /** @see update */
    fun update(params: ExampleUpdateParams): CompletableFuture<ExampleUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        exampleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExampleUpdateResponse> =
        update(exampleId, ExampleUpdateParams.none(), requestOptions)

    /** Get all examples by query params */
    fun list(): CompletableFuture<List<Example>> = list(ExampleListParams.none())

    /** @see list */
    fun list(
        params: ExampleListParams = ExampleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Example>>

    /** @see list */
    fun list(
        params: ExampleListParams = ExampleListParams.none()
    ): CompletableFuture<List<Example>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<Example>> =
        list(ExampleListParams.none(), requestOptions)

    /** Soft delete an example. Only deletes the example in the 'latest' version of the dataset. */
    fun delete(exampleId: String): CompletableFuture<ExampleDeleteResponse> =
        delete(exampleId, ExampleDeleteParams.none())

    /** @see delete */
    fun delete(
        exampleId: String,
        params: ExampleDeleteParams = ExampleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExampleDeleteResponse> =
        delete(params.toBuilder().exampleId(exampleId).build(), requestOptions)

    /** @see delete */
    fun delete(
        exampleId: String,
        params: ExampleDeleteParams = ExampleDeleteParams.none(),
    ): CompletableFuture<ExampleDeleteResponse> = delete(exampleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ExampleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExampleDeleteResponse>

    /** @see delete */
    fun delete(params: ExampleDeleteParams): CompletableFuture<ExampleDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        exampleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExampleDeleteResponse> =
        delete(exampleId, ExampleDeleteParams.none(), requestOptions)

    /** Soft delete examples. Only deletes the examples in the 'latest' version of the dataset. */
    fun deleteAll(params: ExampleDeleteAllParams): CompletableFuture<ExampleDeleteAllResponse> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: ExampleDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExampleDeleteAllResponse>

    /** Count all examples by query params */
    fun retrieveCount(): CompletableFuture<Long> = retrieveCount(ExampleRetrieveCountParams.none())

    /** @see retrieveCount */
    fun retrieveCount(
        params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Long>

    /** @see retrieveCount */
    fun retrieveCount(
        params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none()
    ): CompletableFuture<Long> = retrieveCount(params, RequestOptions.none())

    /** @see retrieveCount */
    fun retrieveCount(requestOptions: RequestOptions): CompletableFuture<Long> =
        retrieveCount(ExampleRetrieveCountParams.none(), requestOptions)

    /**
     * Upload examples from a CSV file.
     *
     * Note: For non-csv upload, please use the POST /v1/platform/datasets/{dataset_id}/examples
     * endpoint which provides more efficient upload.
     */
    fun uploadFromCsv(
        datasetId: String,
        params: ExampleUploadFromCsvParams,
    ): CompletableFuture<List<Example>> = uploadFromCsv(datasetId, params, RequestOptions.none())

    /** @see uploadFromCsv */
    fun uploadFromCsv(
        datasetId: String,
        params: ExampleUploadFromCsvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Example>> =
        uploadFromCsv(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see uploadFromCsv */
    fun uploadFromCsv(params: ExampleUploadFromCsvParams): CompletableFuture<List<Example>> =
        uploadFromCsv(params, RequestOptions.none())

    /** @see uploadFromCsv */
    fun uploadFromCsv(
        params: ExampleUploadFromCsvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Example>>

    /**
     * A view of [ExampleServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExampleServiceAsync.WithRawResponse

        fun bulk(): BulkServiceAsync.WithRawResponse

        fun validate(): ValidateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/examples`, but is otherwise the same as
         * [ExampleServiceAsync.create].
         */
        fun create(params: ExampleCreateParams): CompletableFuture<HttpResponseFor<Example>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ExampleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Example>>

        /**
         * Returns a raw HTTP response for `get /api/v1/examples/{example_id}`, but is otherwise the
         * same as [ExampleServiceAsync.retrieve].
         */
        fun retrieve(exampleId: String): CompletableFuture<HttpResponseFor<Example>> =
            retrieve(exampleId, ExampleRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            exampleId: String,
            params: ExampleRetrieveParams = ExampleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Example>> =
            retrieve(params.toBuilder().exampleId(exampleId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            exampleId: String,
            params: ExampleRetrieveParams = ExampleRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Example>> =
            retrieve(exampleId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ExampleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Example>>

        /** @see retrieve */
        fun retrieve(params: ExampleRetrieveParams): CompletableFuture<HttpResponseFor<Example>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            exampleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Example>> =
            retrieve(exampleId, ExampleRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/examples/{example_id}`, but is otherwise
         * the same as [ExampleServiceAsync.update].
         */
        fun update(exampleId: String): CompletableFuture<HttpResponseFor<ExampleUpdateResponse>> =
            update(exampleId, ExampleUpdateParams.none())

        /** @see update */
        fun update(
            exampleId: String,
            params: ExampleUpdateParams = ExampleUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExampleUpdateResponse>> =
            update(params.toBuilder().exampleId(exampleId).build(), requestOptions)

        /** @see update */
        fun update(
            exampleId: String,
            params: ExampleUpdateParams = ExampleUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ExampleUpdateResponse>> =
            update(exampleId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ExampleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExampleUpdateResponse>>

        /** @see update */
        fun update(
            params: ExampleUpdateParams
        ): CompletableFuture<HttpResponseFor<ExampleUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            exampleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExampleUpdateResponse>> =
            update(exampleId, ExampleUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/examples`, but is otherwise the same as
         * [ExampleServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<Example>>> =
            list(ExampleListParams.none())

        /** @see list */
        fun list(
            params: ExampleListParams = ExampleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Example>>>

        /** @see list */
        fun list(
            params: ExampleListParams = ExampleListParams.none()
        ): CompletableFuture<HttpResponseFor<List<Example>>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<Example>>> =
            list(ExampleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/examples/{example_id}`, but is otherwise
         * the same as [ExampleServiceAsync.delete].
         */
        fun delete(exampleId: String): CompletableFuture<HttpResponseFor<ExampleDeleteResponse>> =
            delete(exampleId, ExampleDeleteParams.none())

        /** @see delete */
        fun delete(
            exampleId: String,
            params: ExampleDeleteParams = ExampleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExampleDeleteResponse>> =
            delete(params.toBuilder().exampleId(exampleId).build(), requestOptions)

        /** @see delete */
        fun delete(
            exampleId: String,
            params: ExampleDeleteParams = ExampleDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ExampleDeleteResponse>> =
            delete(exampleId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ExampleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExampleDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ExampleDeleteParams
        ): CompletableFuture<HttpResponseFor<ExampleDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            exampleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExampleDeleteResponse>> =
            delete(exampleId, ExampleDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/examples`, but is otherwise the same as
         * [ExampleServiceAsync.deleteAll].
         */
        fun deleteAll(
            params: ExampleDeleteAllParams
        ): CompletableFuture<HttpResponseFor<ExampleDeleteAllResponse>> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            params: ExampleDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExampleDeleteAllResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/examples/count`, but is otherwise the same
         * as [ExampleServiceAsync.retrieveCount].
         */
        fun retrieveCount(): CompletableFuture<HttpResponseFor<Long>> =
            retrieveCount(ExampleRetrieveCountParams.none())

        /** @see retrieveCount */
        fun retrieveCount(
            params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Long>>

        /** @see retrieveCount */
        fun retrieveCount(
            params: ExampleRetrieveCountParams = ExampleRetrieveCountParams.none()
        ): CompletableFuture<HttpResponseFor<Long>> = retrieveCount(params, RequestOptions.none())

        /** @see retrieveCount */
        fun retrieveCount(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<Long>> =
            retrieveCount(ExampleRetrieveCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/examples/upload/{dataset_id}`, but is
         * otherwise the same as [ExampleServiceAsync.uploadFromCsv].
         */
        fun uploadFromCsv(
            datasetId: String,
            params: ExampleUploadFromCsvParams,
        ): CompletableFuture<HttpResponseFor<List<Example>>> =
            uploadFromCsv(datasetId, params, RequestOptions.none())

        /** @see uploadFromCsv */
        fun uploadFromCsv(
            datasetId: String,
            params: ExampleUploadFromCsvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Example>>> =
            uploadFromCsv(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see uploadFromCsv */
        fun uploadFromCsv(
            params: ExampleUploadFromCsvParams
        ): CompletableFuture<HttpResponseFor<List<Example>>> =
            uploadFromCsv(params, RequestOptions.none())

        /** @see uploadFromCsv */
        fun uploadFromCsv(
            params: ExampleUploadFromCsvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Example>>>
    }
}
