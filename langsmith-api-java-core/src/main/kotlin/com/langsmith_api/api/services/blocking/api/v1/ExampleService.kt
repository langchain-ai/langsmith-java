// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.examples.Example
import com.langsmith_api.api.models.api.v1.examples.ExampleCreateParams
import com.langsmith_api.api.models.api.v1.examples.ExampleDeleteAllParams
import com.langsmith_api.api.models.api.v1.examples.ExampleDeleteAllResponse
import com.langsmith_api.api.models.api.v1.examples.ExampleDeleteParams
import com.langsmith_api.api.models.api.v1.examples.ExampleDeleteResponse
import com.langsmith_api.api.models.api.v1.examples.ExampleListParams
import com.langsmith_api.api.models.api.v1.examples.ExampleRetrieveCountParams
import com.langsmith_api.api.models.api.v1.examples.ExampleRetrieveParams
import com.langsmith_api.api.models.api.v1.examples.ExampleUpdateParams
import com.langsmith_api.api.services.blocking.api.v1.examples.BulkService
import com.langsmith_api.api.services.blocking.api.v1.examples.ValidateService
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
    fun create(): Example = create(ExampleCreateParams.none())

    /** @see create */
    fun create(
        params: ExampleCreateParams = ExampleCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Example

    /** @see create */
    fun create(params: ExampleCreateParams = ExampleCreateParams.none()): Example =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): Example =
        create(ExampleCreateParams.none(), requestOptions)

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

    /**
     * Upload examples from a CSV file.
     *
     * Note: For non-csv upload, please use the POST /v1/platform/datasets/{dataset_id}/examples
     * endpoint which provides more efficient upload.
     */
    fun update(datasetId: String, params: ExampleUpdateParams): List<Example> =
        update(datasetId, params, RequestOptions.none())

    /** @see update */
    fun update(
        datasetId: String,
        params: ExampleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Example> = update(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see update */
    fun update(params: ExampleUpdateParams): List<Example> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ExampleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Example>

    /** Get all examples by query params */
    fun list(): List<Example> = list(ExampleListParams.none())

    /** @see list */
    fun list(
        params: ExampleListParams = ExampleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Example>

    /** @see list */
    fun list(params: ExampleListParams = ExampleListParams.none()): List<Example> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<Example> =
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
        @MustBeClosed fun create(): HttpResponseFor<Example> = create(ExampleCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ExampleCreateParams = ExampleCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Example>

        /** @see create */
        @MustBeClosed
        fun create(
            params: ExampleCreateParams = ExampleCreateParams.none()
        ): HttpResponseFor<Example> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<Example> =
            create(ExampleCreateParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /api/v1/examples/upload/{dataset_id}`, but is
         * otherwise the same as [ExampleService.update].
         */
        @MustBeClosed
        fun update(datasetId: String, params: ExampleUpdateParams): HttpResponseFor<List<Example>> =
            update(datasetId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            datasetId: String,
            params: ExampleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Example>> =
            update(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ExampleUpdateParams): HttpResponseFor<List<Example>> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ExampleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Example>>

        /**
         * Returns a raw HTTP response for `get /api/v1/examples`, but is otherwise the same as
         * [ExampleService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<List<Example>> = list(ExampleListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExampleListParams = ExampleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Example>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExampleListParams = ExampleListParams.none()
        ): HttpResponseFor<List<Example>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Example>> =
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
    }
}
