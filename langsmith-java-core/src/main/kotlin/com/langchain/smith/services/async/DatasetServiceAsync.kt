// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.Dataset
import com.langchain.smith.models.datasets.DatasetCloneParams
import com.langchain.smith.models.datasets.DatasetCloneResponse
import com.langchain.smith.models.datasets.DatasetCreateParams
import com.langchain.smith.models.datasets.DatasetDeleteParams
import com.langchain.smith.models.datasets.DatasetDeleteResponse
import com.langchain.smith.models.datasets.DatasetListPageAsync
import com.langchain.smith.models.datasets.DatasetListParams
import com.langchain.smith.models.datasets.DatasetRetrieveCsvParams
import com.langchain.smith.models.datasets.DatasetRetrieveCsvResponse
import com.langchain.smith.models.datasets.DatasetRetrieveJsonlParams
import com.langchain.smith.models.datasets.DatasetRetrieveJsonlResponse
import com.langchain.smith.models.datasets.DatasetRetrieveOpenAIFtParams
import com.langchain.smith.models.datasets.DatasetRetrieveOpenAIFtResponse
import com.langchain.smith.models.datasets.DatasetRetrieveOpenAIParams
import com.langchain.smith.models.datasets.DatasetRetrieveOpenAIResponse
import com.langchain.smith.models.datasets.DatasetRetrieveParams
import com.langchain.smith.models.datasets.DatasetRetrieveVersionParams
import com.langchain.smith.models.datasets.DatasetUpdateParams
import com.langchain.smith.models.datasets.DatasetUpdateResponse
import com.langchain.smith.models.datasets.DatasetUpdateTagsParams
import com.langchain.smith.models.datasets.DatasetUploadParams
import com.langchain.smith.models.datasets.DatasetVersion
import com.langchain.smith.services.async.datasets.ComparativeServiceAsync
import com.langchain.smith.services.async.datasets.ExperimentServiceAsync
import com.langchain.smith.services.async.datasets.GroupServiceAsync
import com.langchain.smith.services.async.datasets.IndexServiceAsync
import com.langchain.smith.services.async.datasets.PlaygroundExperimentServiceAsync
import com.langchain.smith.services.async.datasets.RunServiceAsync
import com.langchain.smith.services.async.datasets.ShareServiceAsync
import com.langchain.smith.services.async.datasets.SplitServiceAsync
import com.langchain.smith.services.async.datasets.VersionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DatasetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetServiceAsync

    fun versions(): VersionServiceAsync

    fun runs(): RunServiceAsync

    fun group(): GroupServiceAsync

    fun experiments(): ExperimentServiceAsync

    fun share(): ShareServiceAsync

    fun comparative(): ComparativeServiceAsync

    fun splits(): SplitServiceAsync

    fun index(): IndexServiceAsync

    fun playgroundExperiment(): PlaygroundExperimentServiceAsync

    /** Create a new dataset. */
    fun create(params: DatasetCreateParams): CompletableFuture<Dataset> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DatasetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dataset>

    /** Get a specific dataset. */
    fun retrieve(datasetId: String): CompletableFuture<Dataset> =
        retrieve(datasetId, DatasetRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        datasetId: String,
        params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dataset> =
        retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        datasetId: String,
        params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
    ): CompletableFuture<Dataset> = retrieve(datasetId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dataset>

    /** @see retrieve */
    fun retrieve(params: DatasetRetrieveParams): CompletableFuture<Dataset> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(datasetId: String, requestOptions: RequestOptions): CompletableFuture<Dataset> =
        retrieve(datasetId, DatasetRetrieveParams.none(), requestOptions)

    /** Update a specific dataset. */
    fun update(datasetId: String): CompletableFuture<DatasetUpdateResponse> =
        update(datasetId, DatasetUpdateParams.none())

    /** @see update */
    fun update(
        datasetId: String,
        params: DatasetUpdateParams = DatasetUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetUpdateResponse> =
        update(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see update */
    fun update(
        datasetId: String,
        params: DatasetUpdateParams = DatasetUpdateParams.none(),
    ): CompletableFuture<DatasetUpdateResponse> = update(datasetId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DatasetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetUpdateResponse>

    /** @see update */
    fun update(params: DatasetUpdateParams): CompletableFuture<DatasetUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetUpdateResponse> =
        update(datasetId, DatasetUpdateParams.none(), requestOptions)

    /** Get all datasets by query params and owner. */
    fun list(): CompletableFuture<DatasetListPageAsync> = list(DatasetListParams.none())

    /** @see list */
    fun list(
        params: DatasetListParams = DatasetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetListPageAsync>

    /** @see list */
    fun list(
        params: DatasetListParams = DatasetListParams.none()
    ): CompletableFuture<DatasetListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DatasetListPageAsync> =
        list(DatasetListParams.none(), requestOptions)

    /** Delete a specific dataset. */
    fun delete(datasetId: String): CompletableFuture<DatasetDeleteResponse> =
        delete(datasetId, DatasetDeleteParams.none())

    /** @see delete */
    fun delete(
        datasetId: String,
        params: DatasetDeleteParams = DatasetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetDeleteResponse> =
        delete(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see delete */
    fun delete(
        datasetId: String,
        params: DatasetDeleteParams = DatasetDeleteParams.none(),
    ): CompletableFuture<DatasetDeleteResponse> = delete(datasetId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DatasetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetDeleteResponse>

    /** @see delete */
    fun delete(params: DatasetDeleteParams): CompletableFuture<DatasetDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetDeleteResponse> =
        delete(datasetId, DatasetDeleteParams.none(), requestOptions)

    /** Clone a dataset. */
    fun clone(params: DatasetCloneParams): CompletableFuture<List<DatasetCloneResponse>> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: DatasetCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DatasetCloneResponse>>

    /** Download a dataset as CSV format. */
    fun retrieveCsv(datasetId: String): CompletableFuture<DatasetRetrieveCsvResponse> =
        retrieveCsv(datasetId, DatasetRetrieveCsvParams.none())

    /** @see retrieveCsv */
    fun retrieveCsv(
        datasetId: String,
        params: DatasetRetrieveCsvParams = DatasetRetrieveCsvParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetRetrieveCsvResponse> =
        retrieveCsv(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieveCsv */
    fun retrieveCsv(
        datasetId: String,
        params: DatasetRetrieveCsvParams = DatasetRetrieveCsvParams.none(),
    ): CompletableFuture<DatasetRetrieveCsvResponse> =
        retrieveCsv(datasetId, params, RequestOptions.none())

    /** @see retrieveCsv */
    fun retrieveCsv(
        params: DatasetRetrieveCsvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetRetrieveCsvResponse>

    /** @see retrieveCsv */
    fun retrieveCsv(
        params: DatasetRetrieveCsvParams
    ): CompletableFuture<DatasetRetrieveCsvResponse> = retrieveCsv(params, RequestOptions.none())

    /** @see retrieveCsv */
    fun retrieveCsv(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetRetrieveCsvResponse> =
        retrieveCsv(datasetId, DatasetRetrieveCsvParams.none(), requestOptions)

    /** Download a dataset as CSV format. */
    fun retrieveJsonl(datasetId: String): CompletableFuture<DatasetRetrieveJsonlResponse> =
        retrieveJsonl(datasetId, DatasetRetrieveJsonlParams.none())

    /** @see retrieveJsonl */
    fun retrieveJsonl(
        datasetId: String,
        params: DatasetRetrieveJsonlParams = DatasetRetrieveJsonlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetRetrieveJsonlResponse> =
        retrieveJsonl(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieveJsonl */
    fun retrieveJsonl(
        datasetId: String,
        params: DatasetRetrieveJsonlParams = DatasetRetrieveJsonlParams.none(),
    ): CompletableFuture<DatasetRetrieveJsonlResponse> =
        retrieveJsonl(datasetId, params, RequestOptions.none())

    /** @see retrieveJsonl */
    fun retrieveJsonl(
        params: DatasetRetrieveJsonlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetRetrieveJsonlResponse>

    /** @see retrieveJsonl */
    fun retrieveJsonl(
        params: DatasetRetrieveJsonlParams
    ): CompletableFuture<DatasetRetrieveJsonlResponse> =
        retrieveJsonl(params, RequestOptions.none())

    /** @see retrieveJsonl */
    fun retrieveJsonl(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetRetrieveJsonlResponse> =
        retrieveJsonl(datasetId, DatasetRetrieveJsonlParams.none(), requestOptions)

    /** Download a dataset as OpenAI Evals Jsonl format. */
    fun retrieveOpenAI(datasetId: String): CompletableFuture<DatasetRetrieveOpenAIResponse> =
        retrieveOpenAI(datasetId, DatasetRetrieveOpenAIParams.none())

    /** @see retrieveOpenAI */
    fun retrieveOpenAI(
        datasetId: String,
        params: DatasetRetrieveOpenAIParams = DatasetRetrieveOpenAIParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetRetrieveOpenAIResponse> =
        retrieveOpenAI(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieveOpenAI */
    fun retrieveOpenAI(
        datasetId: String,
        params: DatasetRetrieveOpenAIParams = DatasetRetrieveOpenAIParams.none(),
    ): CompletableFuture<DatasetRetrieveOpenAIResponse> =
        retrieveOpenAI(datasetId, params, RequestOptions.none())

    /** @see retrieveOpenAI */
    fun retrieveOpenAI(
        params: DatasetRetrieveOpenAIParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetRetrieveOpenAIResponse>

    /** @see retrieveOpenAI */
    fun retrieveOpenAI(
        params: DatasetRetrieveOpenAIParams
    ): CompletableFuture<DatasetRetrieveOpenAIResponse> =
        retrieveOpenAI(params, RequestOptions.none())

    /** @see retrieveOpenAI */
    fun retrieveOpenAI(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetRetrieveOpenAIResponse> =
        retrieveOpenAI(datasetId, DatasetRetrieveOpenAIParams.none(), requestOptions)

    /** Download a dataset as OpenAI Jsonl format. */
    fun retrieveOpenAIFt(datasetId: String): CompletableFuture<DatasetRetrieveOpenAIFtResponse> =
        retrieveOpenAIFt(datasetId, DatasetRetrieveOpenAIFtParams.none())

    /** @see retrieveOpenAIFt */
    fun retrieveOpenAIFt(
        datasetId: String,
        params: DatasetRetrieveOpenAIFtParams = DatasetRetrieveOpenAIFtParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetRetrieveOpenAIFtResponse> =
        retrieveOpenAIFt(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieveOpenAIFt */
    fun retrieveOpenAIFt(
        datasetId: String,
        params: DatasetRetrieveOpenAIFtParams = DatasetRetrieveOpenAIFtParams.none(),
    ): CompletableFuture<DatasetRetrieveOpenAIFtResponse> =
        retrieveOpenAIFt(datasetId, params, RequestOptions.none())

    /** @see retrieveOpenAIFt */
    fun retrieveOpenAIFt(
        params: DatasetRetrieveOpenAIFtParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetRetrieveOpenAIFtResponse>

    /** @see retrieveOpenAIFt */
    fun retrieveOpenAIFt(
        params: DatasetRetrieveOpenAIFtParams
    ): CompletableFuture<DatasetRetrieveOpenAIFtResponse> =
        retrieveOpenAIFt(params, RequestOptions.none())

    /** @see retrieveOpenAIFt */
    fun retrieveOpenAIFt(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetRetrieveOpenAIFtResponse> =
        retrieveOpenAIFt(datasetId, DatasetRetrieveOpenAIFtParams.none(), requestOptions)

    /** Get dataset version by as_of or exact tag. */
    fun retrieveVersion(datasetId: String): CompletableFuture<DatasetVersion> =
        retrieveVersion(datasetId, DatasetRetrieveVersionParams.none())

    /** @see retrieveVersion */
    fun retrieveVersion(
        datasetId: String,
        params: DatasetRetrieveVersionParams = DatasetRetrieveVersionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetVersion> =
        retrieveVersion(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieveVersion */
    fun retrieveVersion(
        datasetId: String,
        params: DatasetRetrieveVersionParams = DatasetRetrieveVersionParams.none(),
    ): CompletableFuture<DatasetVersion> = retrieveVersion(datasetId, params, RequestOptions.none())

    /** @see retrieveVersion */
    fun retrieveVersion(
        params: DatasetRetrieveVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetVersion>

    /** @see retrieveVersion */
    fun retrieveVersion(params: DatasetRetrieveVersionParams): CompletableFuture<DatasetVersion> =
        retrieveVersion(params, RequestOptions.none())

    /** @see retrieveVersion */
    fun retrieveVersion(
        datasetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetVersion> =
        retrieveVersion(datasetId, DatasetRetrieveVersionParams.none(), requestOptions)

    /** Set a tag on a dataset version. */
    fun updateTags(
        datasetId: String,
        params: DatasetUpdateTagsParams,
    ): CompletableFuture<DatasetVersion> = updateTags(datasetId, params, RequestOptions.none())

    /** @see updateTags */
    fun updateTags(
        datasetId: String,
        params: DatasetUpdateTagsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetVersion> =
        updateTags(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see updateTags */
    fun updateTags(params: DatasetUpdateTagsParams): CompletableFuture<DatasetVersion> =
        updateTags(params, RequestOptions.none())

    /** @see updateTags */
    fun updateTags(
        params: DatasetUpdateTagsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetVersion>

    /** Create a new dataset from a CSV or JSONL file. */
    fun upload(params: DatasetUploadParams): CompletableFuture<Dataset> =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: DatasetUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dataset>

    /**
     * A view of [DatasetServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatasetServiceAsync.WithRawResponse

        fun versions(): VersionServiceAsync.WithRawResponse

        fun runs(): RunServiceAsync.WithRawResponse

        fun group(): GroupServiceAsync.WithRawResponse

        fun experiments(): ExperimentServiceAsync.WithRawResponse

        fun share(): ShareServiceAsync.WithRawResponse

        fun comparative(): ComparativeServiceAsync.WithRawResponse

        fun splits(): SplitServiceAsync.WithRawResponse

        fun index(): IndexServiceAsync.WithRawResponse

        fun playgroundExperiment(): PlaygroundExperimentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets`, but is otherwise the same as
         * [DatasetServiceAsync.create].
         */
        fun create(params: DatasetCreateParams): CompletableFuture<HttpResponseFor<Dataset>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DatasetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dataset>>

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}`, but is otherwise the
         * same as [DatasetServiceAsync.retrieve].
         */
        fun retrieve(datasetId: String): CompletableFuture<HttpResponseFor<Dataset>> =
            retrieve(datasetId, DatasetRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            datasetId: String,
            params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dataset>> =
            retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            datasetId: String,
            params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Dataset>> =
            retrieve(datasetId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DatasetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dataset>>

        /** @see retrieve */
        fun retrieve(params: DatasetRetrieveParams): CompletableFuture<HttpResponseFor<Dataset>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Dataset>> =
            retrieve(datasetId, DatasetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/datasets/{dataset_id}`, but is otherwise
         * the same as [DatasetServiceAsync.update].
         */
        fun update(datasetId: String): CompletableFuture<HttpResponseFor<DatasetUpdateResponse>> =
            update(datasetId, DatasetUpdateParams.none())

        /** @see update */
        fun update(
            datasetId: String,
            params: DatasetUpdateParams = DatasetUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetUpdateResponse>> =
            update(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see update */
        fun update(
            datasetId: String,
            params: DatasetUpdateParams = DatasetUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<DatasetUpdateResponse>> =
            update(datasetId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DatasetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetUpdateResponse>>

        /** @see update */
        fun update(
            params: DatasetUpdateParams
        ): CompletableFuture<HttpResponseFor<DatasetUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetUpdateResponse>> =
            update(datasetId, DatasetUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets`, but is otherwise the same as
         * [DatasetServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DatasetListPageAsync>> =
            list(DatasetListParams.none())

        /** @see list */
        fun list(
            params: DatasetListParams = DatasetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetListPageAsync>>

        /** @see list */
        fun list(
            params: DatasetListParams = DatasetListParams.none()
        ): CompletableFuture<HttpResponseFor<DatasetListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DatasetListPageAsync>> =
            list(DatasetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/datasets/{dataset_id}`, but is otherwise
         * the same as [DatasetServiceAsync.delete].
         */
        fun delete(datasetId: String): CompletableFuture<HttpResponseFor<DatasetDeleteResponse>> =
            delete(datasetId, DatasetDeleteParams.none())

        /** @see delete */
        fun delete(
            datasetId: String,
            params: DatasetDeleteParams = DatasetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetDeleteResponse>> =
            delete(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see delete */
        fun delete(
            datasetId: String,
            params: DatasetDeleteParams = DatasetDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<DatasetDeleteResponse>> =
            delete(datasetId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DatasetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetDeleteResponse>>

        /** @see delete */
        fun delete(
            params: DatasetDeleteParams
        ): CompletableFuture<HttpResponseFor<DatasetDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetDeleteResponse>> =
            delete(datasetId, DatasetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/clone`, but is otherwise the same
         * as [DatasetServiceAsync.clone].
         */
        fun clone(
            params: DatasetCloneParams
        ): CompletableFuture<HttpResponseFor<List<DatasetCloneResponse>>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: DatasetCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DatasetCloneResponse>>>

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/csv`, but is otherwise
         * the same as [DatasetServiceAsync.retrieveCsv].
         */
        fun retrieveCsv(
            datasetId: String
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveCsvResponse>> =
            retrieveCsv(datasetId, DatasetRetrieveCsvParams.none())

        /** @see retrieveCsv */
        fun retrieveCsv(
            datasetId: String,
            params: DatasetRetrieveCsvParams = DatasetRetrieveCsvParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveCsvResponse>> =
            retrieveCsv(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieveCsv */
        fun retrieveCsv(
            datasetId: String,
            params: DatasetRetrieveCsvParams = DatasetRetrieveCsvParams.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveCsvResponse>> =
            retrieveCsv(datasetId, params, RequestOptions.none())

        /** @see retrieveCsv */
        fun retrieveCsv(
            params: DatasetRetrieveCsvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveCsvResponse>>

        /** @see retrieveCsv */
        fun retrieveCsv(
            params: DatasetRetrieveCsvParams
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveCsvResponse>> =
            retrieveCsv(params, RequestOptions.none())

        /** @see retrieveCsv */
        fun retrieveCsv(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveCsvResponse>> =
            retrieveCsv(datasetId, DatasetRetrieveCsvParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/jsonl`, but is
         * otherwise the same as [DatasetServiceAsync.retrieveJsonl].
         */
        fun retrieveJsonl(
            datasetId: String
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveJsonlResponse>> =
            retrieveJsonl(datasetId, DatasetRetrieveJsonlParams.none())

        /** @see retrieveJsonl */
        fun retrieveJsonl(
            datasetId: String,
            params: DatasetRetrieveJsonlParams = DatasetRetrieveJsonlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveJsonlResponse>> =
            retrieveJsonl(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieveJsonl */
        fun retrieveJsonl(
            datasetId: String,
            params: DatasetRetrieveJsonlParams = DatasetRetrieveJsonlParams.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveJsonlResponse>> =
            retrieveJsonl(datasetId, params, RequestOptions.none())

        /** @see retrieveJsonl */
        fun retrieveJsonl(
            params: DatasetRetrieveJsonlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveJsonlResponse>>

        /** @see retrieveJsonl */
        fun retrieveJsonl(
            params: DatasetRetrieveJsonlParams
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveJsonlResponse>> =
            retrieveJsonl(params, RequestOptions.none())

        /** @see retrieveJsonl */
        fun retrieveJsonl(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveJsonlResponse>> =
            retrieveJsonl(datasetId, DatasetRetrieveJsonlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/openai`, but is
         * otherwise the same as [DatasetServiceAsync.retrieveOpenAI].
         */
        fun retrieveOpenAI(
            datasetId: String
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveOpenAIResponse>> =
            retrieveOpenAI(datasetId, DatasetRetrieveOpenAIParams.none())

        /** @see retrieveOpenAI */
        fun retrieveOpenAI(
            datasetId: String,
            params: DatasetRetrieveOpenAIParams = DatasetRetrieveOpenAIParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveOpenAIResponse>> =
            retrieveOpenAI(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieveOpenAI */
        fun retrieveOpenAI(
            datasetId: String,
            params: DatasetRetrieveOpenAIParams = DatasetRetrieveOpenAIParams.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveOpenAIResponse>> =
            retrieveOpenAI(datasetId, params, RequestOptions.none())

        /** @see retrieveOpenAI */
        fun retrieveOpenAI(
            params: DatasetRetrieveOpenAIParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveOpenAIResponse>>

        /** @see retrieveOpenAI */
        fun retrieveOpenAI(
            params: DatasetRetrieveOpenAIParams
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveOpenAIResponse>> =
            retrieveOpenAI(params, RequestOptions.none())

        /** @see retrieveOpenAI */
        fun retrieveOpenAI(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveOpenAIResponse>> =
            retrieveOpenAI(datasetId, DatasetRetrieveOpenAIParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/openai_ft`, but is
         * otherwise the same as [DatasetServiceAsync.retrieveOpenAIFt].
         */
        fun retrieveOpenAIFt(
            datasetId: String
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveOpenAIFtResponse>> =
            retrieveOpenAIFt(datasetId, DatasetRetrieveOpenAIFtParams.none())

        /** @see retrieveOpenAIFt */
        fun retrieveOpenAIFt(
            datasetId: String,
            params: DatasetRetrieveOpenAIFtParams = DatasetRetrieveOpenAIFtParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveOpenAIFtResponse>> =
            retrieveOpenAIFt(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieveOpenAIFt */
        fun retrieveOpenAIFt(
            datasetId: String,
            params: DatasetRetrieveOpenAIFtParams = DatasetRetrieveOpenAIFtParams.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveOpenAIFtResponse>> =
            retrieveOpenAIFt(datasetId, params, RequestOptions.none())

        /** @see retrieveOpenAIFt */
        fun retrieveOpenAIFt(
            params: DatasetRetrieveOpenAIFtParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveOpenAIFtResponse>>

        /** @see retrieveOpenAIFt */
        fun retrieveOpenAIFt(
            params: DatasetRetrieveOpenAIFtParams
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveOpenAIFtResponse>> =
            retrieveOpenAIFt(params, RequestOptions.none())

        /** @see retrieveOpenAIFt */
        fun retrieveOpenAIFt(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveOpenAIFtResponse>> =
            retrieveOpenAIFt(datasetId, DatasetRetrieveOpenAIFtParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/version`, but is
         * otherwise the same as [DatasetServiceAsync.retrieveVersion].
         */
        fun retrieveVersion(datasetId: String): CompletableFuture<HttpResponseFor<DatasetVersion>> =
            retrieveVersion(datasetId, DatasetRetrieveVersionParams.none())

        /** @see retrieveVersion */
        fun retrieveVersion(
            datasetId: String,
            params: DatasetRetrieveVersionParams = DatasetRetrieveVersionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetVersion>> =
            retrieveVersion(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieveVersion */
        fun retrieveVersion(
            datasetId: String,
            params: DatasetRetrieveVersionParams = DatasetRetrieveVersionParams.none(),
        ): CompletableFuture<HttpResponseFor<DatasetVersion>> =
            retrieveVersion(datasetId, params, RequestOptions.none())

        /** @see retrieveVersion */
        fun retrieveVersion(
            params: DatasetRetrieveVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetVersion>>

        /** @see retrieveVersion */
        fun retrieveVersion(
            params: DatasetRetrieveVersionParams
        ): CompletableFuture<HttpResponseFor<DatasetVersion>> =
            retrieveVersion(params, RequestOptions.none())

        /** @see retrieveVersion */
        fun retrieveVersion(
            datasetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetVersion>> =
            retrieveVersion(datasetId, DatasetRetrieveVersionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/datasets/{dataset_id}/tags`, but is
         * otherwise the same as [DatasetServiceAsync.updateTags].
         */
        fun updateTags(
            datasetId: String,
            params: DatasetUpdateTagsParams,
        ): CompletableFuture<HttpResponseFor<DatasetVersion>> =
            updateTags(datasetId, params, RequestOptions.none())

        /** @see updateTags */
        fun updateTags(
            datasetId: String,
            params: DatasetUpdateTagsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetVersion>> =
            updateTags(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see updateTags */
        fun updateTags(
            params: DatasetUpdateTagsParams
        ): CompletableFuture<HttpResponseFor<DatasetVersion>> =
            updateTags(params, RequestOptions.none())

        /** @see updateTags */
        fun updateTags(
            params: DatasetUpdateTagsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetVersion>>

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/upload`, but is otherwise the same
         * as [DatasetServiceAsync.upload].
         */
        fun upload(params: DatasetUploadParams): CompletableFuture<HttpResponseFor<Dataset>> =
            upload(params, RequestOptions.none())

        /** @see upload */
        fun upload(
            params: DatasetUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dataset>>
    }
}
