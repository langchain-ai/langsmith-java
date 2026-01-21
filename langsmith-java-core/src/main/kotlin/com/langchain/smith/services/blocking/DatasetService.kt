// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.Dataset
import com.langchain.smith.models.datasets.DatasetCloneParams
import com.langchain.smith.models.datasets.DatasetCloneResponse
import com.langchain.smith.models.datasets.DatasetCreateParams
import com.langchain.smith.models.datasets.DatasetDeleteParams
import com.langchain.smith.models.datasets.DatasetDeleteResponse
import com.langchain.smith.models.datasets.DatasetListPage
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
import com.langchain.smith.services.blocking.datasets.ComparativeService
import com.langchain.smith.services.blocking.datasets.ExperimentService
import com.langchain.smith.services.blocking.datasets.GroupService
import com.langchain.smith.services.blocking.datasets.IndexService
import com.langchain.smith.services.blocking.datasets.PlaygroundExperimentService
import com.langchain.smith.services.blocking.datasets.RunService
import com.langchain.smith.services.blocking.datasets.ShareService
import com.langchain.smith.services.blocking.datasets.SplitService
import com.langchain.smith.services.blocking.datasets.VersionService
import java.util.function.Consumer

interface DatasetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetService

    fun versions(): VersionService

    fun runs(): RunService

    fun group(): GroupService

    fun experiments(): ExperimentService

    fun share(): ShareService

    fun comparative(): ComparativeService

    fun splits(): SplitService

    fun index(): IndexService

    fun playgroundExperiment(): PlaygroundExperimentService

    /** Create a new dataset. */
    fun create(params: DatasetCreateParams): Dataset = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DatasetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dataset

    /** Get a specific dataset. */
    fun retrieve(datasetId: String): Dataset = retrieve(datasetId, DatasetRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        datasetId: String,
        params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dataset = retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        datasetId: String,
        params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
    ): Dataset = retrieve(datasetId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dataset

    /** @see retrieve */
    fun retrieve(params: DatasetRetrieveParams): Dataset = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(datasetId: String, requestOptions: RequestOptions): Dataset =
        retrieve(datasetId, DatasetRetrieveParams.none(), requestOptions)

    /** Update a specific dataset. */
    fun update(datasetId: String): DatasetUpdateResponse =
        update(datasetId, DatasetUpdateParams.none())

    /** @see update */
    fun update(
        datasetId: String,
        params: DatasetUpdateParams = DatasetUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetUpdateResponse =
        update(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see update */
    fun update(
        datasetId: String,
        params: DatasetUpdateParams = DatasetUpdateParams.none(),
    ): DatasetUpdateResponse = update(datasetId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DatasetUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetUpdateResponse

    /** @see update */
    fun update(params: DatasetUpdateParams): DatasetUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(datasetId: String, requestOptions: RequestOptions): DatasetUpdateResponse =
        update(datasetId, DatasetUpdateParams.none(), requestOptions)

    /** Get all datasets by query params and owner. */
    fun list(): DatasetListPage = list(DatasetListParams.none())

    /** @see list */
    fun list(
        params: DatasetListParams = DatasetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetListPage

    /** @see list */
    fun list(params: DatasetListParams = DatasetListParams.none()): DatasetListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DatasetListPage =
        list(DatasetListParams.none(), requestOptions)

    /** Delete a specific dataset. */
    fun delete(datasetId: String): DatasetDeleteResponse =
        delete(datasetId, DatasetDeleteParams.none())

    /** @see delete */
    fun delete(
        datasetId: String,
        params: DatasetDeleteParams = DatasetDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetDeleteResponse =
        delete(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see delete */
    fun delete(
        datasetId: String,
        params: DatasetDeleteParams = DatasetDeleteParams.none(),
    ): DatasetDeleteResponse = delete(datasetId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DatasetDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetDeleteResponse

    /** @see delete */
    fun delete(params: DatasetDeleteParams): DatasetDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(datasetId: String, requestOptions: RequestOptions): DatasetDeleteResponse =
        delete(datasetId, DatasetDeleteParams.none(), requestOptions)

    /** Clone a dataset. */
    fun clone(params: DatasetCloneParams): List<DatasetCloneResponse> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: DatasetCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<DatasetCloneResponse>

    /** Download a dataset as CSV format. */
    fun retrieveCsv(datasetId: String): DatasetRetrieveCsvResponse =
        retrieveCsv(datasetId, DatasetRetrieveCsvParams.none())

    /** @see retrieveCsv */
    fun retrieveCsv(
        datasetId: String,
        params: DatasetRetrieveCsvParams = DatasetRetrieveCsvParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveCsvResponse =
        retrieveCsv(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieveCsv */
    fun retrieveCsv(
        datasetId: String,
        params: DatasetRetrieveCsvParams = DatasetRetrieveCsvParams.none(),
    ): DatasetRetrieveCsvResponse = retrieveCsv(datasetId, params, RequestOptions.none())

    /** @see retrieveCsv */
    fun retrieveCsv(
        params: DatasetRetrieveCsvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveCsvResponse

    /** @see retrieveCsv */
    fun retrieveCsv(params: DatasetRetrieveCsvParams): DatasetRetrieveCsvResponse =
        retrieveCsv(params, RequestOptions.none())

    /** @see retrieveCsv */
    fun retrieveCsv(datasetId: String, requestOptions: RequestOptions): DatasetRetrieveCsvResponse =
        retrieveCsv(datasetId, DatasetRetrieveCsvParams.none(), requestOptions)

    /** Download a dataset as CSV format. */
    fun retrieveJsonl(datasetId: String): DatasetRetrieveJsonlResponse =
        retrieveJsonl(datasetId, DatasetRetrieveJsonlParams.none())

    /** @see retrieveJsonl */
    fun retrieveJsonl(
        datasetId: String,
        params: DatasetRetrieveJsonlParams = DatasetRetrieveJsonlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveJsonlResponse =
        retrieveJsonl(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieveJsonl */
    fun retrieveJsonl(
        datasetId: String,
        params: DatasetRetrieveJsonlParams = DatasetRetrieveJsonlParams.none(),
    ): DatasetRetrieveJsonlResponse = retrieveJsonl(datasetId, params, RequestOptions.none())

    /** @see retrieveJsonl */
    fun retrieveJsonl(
        params: DatasetRetrieveJsonlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveJsonlResponse

    /** @see retrieveJsonl */
    fun retrieveJsonl(params: DatasetRetrieveJsonlParams): DatasetRetrieveJsonlResponse =
        retrieveJsonl(params, RequestOptions.none())

    /** @see retrieveJsonl */
    fun retrieveJsonl(
        datasetId: String,
        requestOptions: RequestOptions,
    ): DatasetRetrieveJsonlResponse =
        retrieveJsonl(datasetId, DatasetRetrieveJsonlParams.none(), requestOptions)

    /** Download a dataset as OpenAI Evals Jsonl format. */
    fun retrieveOpenAI(datasetId: String): DatasetRetrieveOpenAIResponse =
        retrieveOpenAI(datasetId, DatasetRetrieveOpenAIParams.none())

    /** @see retrieveOpenAI */
    fun retrieveOpenAI(
        datasetId: String,
        params: DatasetRetrieveOpenAIParams = DatasetRetrieveOpenAIParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveOpenAIResponse =
        retrieveOpenAI(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieveOpenAI */
    fun retrieveOpenAI(
        datasetId: String,
        params: DatasetRetrieveOpenAIParams = DatasetRetrieveOpenAIParams.none(),
    ): DatasetRetrieveOpenAIResponse = retrieveOpenAI(datasetId, params, RequestOptions.none())

    /** @see retrieveOpenAI */
    fun retrieveOpenAI(
        params: DatasetRetrieveOpenAIParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveOpenAIResponse

    /** @see retrieveOpenAI */
    fun retrieveOpenAI(params: DatasetRetrieveOpenAIParams): DatasetRetrieveOpenAIResponse =
        retrieveOpenAI(params, RequestOptions.none())

    /** @see retrieveOpenAI */
    fun retrieveOpenAI(
        datasetId: String,
        requestOptions: RequestOptions,
    ): DatasetRetrieveOpenAIResponse =
        retrieveOpenAI(datasetId, DatasetRetrieveOpenAIParams.none(), requestOptions)

    /** Download a dataset as OpenAI Jsonl format. */
    fun retrieveOpenAIFt(datasetId: String): DatasetRetrieveOpenAIFtResponse =
        retrieveOpenAIFt(datasetId, DatasetRetrieveOpenAIFtParams.none())

    /** @see retrieveOpenAIFt */
    fun retrieveOpenAIFt(
        datasetId: String,
        params: DatasetRetrieveOpenAIFtParams = DatasetRetrieveOpenAIFtParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveOpenAIFtResponse =
        retrieveOpenAIFt(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieveOpenAIFt */
    fun retrieveOpenAIFt(
        datasetId: String,
        params: DatasetRetrieveOpenAIFtParams = DatasetRetrieveOpenAIFtParams.none(),
    ): DatasetRetrieveOpenAIFtResponse = retrieveOpenAIFt(datasetId, params, RequestOptions.none())

    /** @see retrieveOpenAIFt */
    fun retrieveOpenAIFt(
        params: DatasetRetrieveOpenAIFtParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveOpenAIFtResponse

    /** @see retrieveOpenAIFt */
    fun retrieveOpenAIFt(params: DatasetRetrieveOpenAIFtParams): DatasetRetrieveOpenAIFtResponse =
        retrieveOpenAIFt(params, RequestOptions.none())

    /** @see retrieveOpenAIFt */
    fun retrieveOpenAIFt(
        datasetId: String,
        requestOptions: RequestOptions,
    ): DatasetRetrieveOpenAIFtResponse =
        retrieveOpenAIFt(datasetId, DatasetRetrieveOpenAIFtParams.none(), requestOptions)

    /** Get dataset version by as_of or exact tag. */
    fun retrieveVersion(datasetId: String): DatasetVersion =
        retrieveVersion(datasetId, DatasetRetrieveVersionParams.none())

    /** @see retrieveVersion */
    fun retrieveVersion(
        datasetId: String,
        params: DatasetRetrieveVersionParams = DatasetRetrieveVersionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetVersion =
        retrieveVersion(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see retrieveVersion */
    fun retrieveVersion(
        datasetId: String,
        params: DatasetRetrieveVersionParams = DatasetRetrieveVersionParams.none(),
    ): DatasetVersion = retrieveVersion(datasetId, params, RequestOptions.none())

    /** @see retrieveVersion */
    fun retrieveVersion(
        params: DatasetRetrieveVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetVersion

    /** @see retrieveVersion */
    fun retrieveVersion(params: DatasetRetrieveVersionParams): DatasetVersion =
        retrieveVersion(params, RequestOptions.none())

    /** @see retrieveVersion */
    fun retrieveVersion(datasetId: String, requestOptions: RequestOptions): DatasetVersion =
        retrieveVersion(datasetId, DatasetRetrieveVersionParams.none(), requestOptions)

    /** Set a tag on a dataset version. */
    fun updateTags(datasetId: String, params: DatasetUpdateTagsParams): DatasetVersion =
        updateTags(datasetId, params, RequestOptions.none())

    /** @see updateTags */
    fun updateTags(
        datasetId: String,
        params: DatasetUpdateTagsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetVersion = updateTags(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see updateTags */
    fun updateTags(params: DatasetUpdateTagsParams): DatasetVersion =
        updateTags(params, RequestOptions.none())

    /** @see updateTags */
    fun updateTags(
        params: DatasetUpdateTagsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetVersion

    /** Create a new dataset from a CSV or JSONL file. */
    fun upload(params: DatasetUploadParams): Dataset = upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: DatasetUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Dataset

    /** A view of [DatasetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetService.WithRawResponse

        fun versions(): VersionService.WithRawResponse

        fun runs(): RunService.WithRawResponse

        fun group(): GroupService.WithRawResponse

        fun experiments(): ExperimentService.WithRawResponse

        fun share(): ShareService.WithRawResponse

        fun comparative(): ComparativeService.WithRawResponse

        fun splits(): SplitService.WithRawResponse

        fun index(): IndexService.WithRawResponse

        fun playgroundExperiment(): PlaygroundExperimentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets`, but is otherwise the same as
         * [DatasetService.create].
         */
        @MustBeClosed
        fun create(params: DatasetCreateParams): HttpResponseFor<Dataset> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DatasetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Dataset>

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}`, but is otherwise the
         * same as [DatasetService.retrieve].
         */
        @MustBeClosed
        fun retrieve(datasetId: String): HttpResponseFor<Dataset> =
            retrieve(datasetId, DatasetRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            datasetId: String,
            params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Dataset> =
            retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            datasetId: String,
            params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
        ): HttpResponseFor<Dataset> = retrieve(datasetId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DatasetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Dataset>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DatasetRetrieveParams): HttpResponseFor<Dataset> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(datasetId: String, requestOptions: RequestOptions): HttpResponseFor<Dataset> =
            retrieve(datasetId, DatasetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/datasets/{dataset_id}`, but is otherwise
         * the same as [DatasetService.update].
         */
        @MustBeClosed
        fun update(datasetId: String): HttpResponseFor<DatasetUpdateResponse> =
            update(datasetId, DatasetUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            datasetId: String,
            params: DatasetUpdateParams = DatasetUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetUpdateResponse> =
            update(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            datasetId: String,
            params: DatasetUpdateParams = DatasetUpdateParams.none(),
        ): HttpResponseFor<DatasetUpdateResponse> = update(datasetId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DatasetUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: DatasetUpdateParams): HttpResponseFor<DatasetUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetUpdateResponse> =
            update(datasetId, DatasetUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets`, but is otherwise the same as
         * [DatasetService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<DatasetListPage> = list(DatasetListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DatasetListParams = DatasetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DatasetListParams = DatasetListParams.none()
        ): HttpResponseFor<DatasetListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DatasetListPage> =
            list(DatasetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/datasets/{dataset_id}`, but is otherwise
         * the same as [DatasetService.delete].
         */
        @MustBeClosed
        fun delete(datasetId: String): HttpResponseFor<DatasetDeleteResponse> =
            delete(datasetId, DatasetDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            datasetId: String,
            params: DatasetDeleteParams = DatasetDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetDeleteResponse> =
            delete(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            datasetId: String,
            params: DatasetDeleteParams = DatasetDeleteParams.none(),
        ): HttpResponseFor<DatasetDeleteResponse> = delete(datasetId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DatasetDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: DatasetDeleteParams): HttpResponseFor<DatasetDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetDeleteResponse> =
            delete(datasetId, DatasetDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/clone`, but is otherwise the same
         * as [DatasetService.clone].
         */
        @MustBeClosed
        fun clone(params: DatasetCloneParams): HttpResponseFor<List<DatasetCloneResponse>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            params: DatasetCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<DatasetCloneResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/csv`, but is otherwise
         * the same as [DatasetService.retrieveCsv].
         */
        @MustBeClosed
        fun retrieveCsv(datasetId: String): HttpResponseFor<DatasetRetrieveCsvResponse> =
            retrieveCsv(datasetId, DatasetRetrieveCsvParams.none())

        /** @see retrieveCsv */
        @MustBeClosed
        fun retrieveCsv(
            datasetId: String,
            params: DatasetRetrieveCsvParams = DatasetRetrieveCsvParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveCsvResponse> =
            retrieveCsv(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieveCsv */
        @MustBeClosed
        fun retrieveCsv(
            datasetId: String,
            params: DatasetRetrieveCsvParams = DatasetRetrieveCsvParams.none(),
        ): HttpResponseFor<DatasetRetrieveCsvResponse> =
            retrieveCsv(datasetId, params, RequestOptions.none())

        /** @see retrieveCsv */
        @MustBeClosed
        fun retrieveCsv(
            params: DatasetRetrieveCsvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveCsvResponse>

        /** @see retrieveCsv */
        @MustBeClosed
        fun retrieveCsv(
            params: DatasetRetrieveCsvParams
        ): HttpResponseFor<DatasetRetrieveCsvResponse> = retrieveCsv(params, RequestOptions.none())

        /** @see retrieveCsv */
        @MustBeClosed
        fun retrieveCsv(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveCsvResponse> =
            retrieveCsv(datasetId, DatasetRetrieveCsvParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/jsonl`, but is
         * otherwise the same as [DatasetService.retrieveJsonl].
         */
        @MustBeClosed
        fun retrieveJsonl(datasetId: String): HttpResponseFor<DatasetRetrieveJsonlResponse> =
            retrieveJsonl(datasetId, DatasetRetrieveJsonlParams.none())

        /** @see retrieveJsonl */
        @MustBeClosed
        fun retrieveJsonl(
            datasetId: String,
            params: DatasetRetrieveJsonlParams = DatasetRetrieveJsonlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveJsonlResponse> =
            retrieveJsonl(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieveJsonl */
        @MustBeClosed
        fun retrieveJsonl(
            datasetId: String,
            params: DatasetRetrieveJsonlParams = DatasetRetrieveJsonlParams.none(),
        ): HttpResponseFor<DatasetRetrieveJsonlResponse> =
            retrieveJsonl(datasetId, params, RequestOptions.none())

        /** @see retrieveJsonl */
        @MustBeClosed
        fun retrieveJsonl(
            params: DatasetRetrieveJsonlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveJsonlResponse>

        /** @see retrieveJsonl */
        @MustBeClosed
        fun retrieveJsonl(
            params: DatasetRetrieveJsonlParams
        ): HttpResponseFor<DatasetRetrieveJsonlResponse> =
            retrieveJsonl(params, RequestOptions.none())

        /** @see retrieveJsonl */
        @MustBeClosed
        fun retrieveJsonl(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveJsonlResponse> =
            retrieveJsonl(datasetId, DatasetRetrieveJsonlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/openai`, but is
         * otherwise the same as [DatasetService.retrieveOpenAI].
         */
        @MustBeClosed
        fun retrieveOpenAI(datasetId: String): HttpResponseFor<DatasetRetrieveOpenAIResponse> =
            retrieveOpenAI(datasetId, DatasetRetrieveOpenAIParams.none())

        /** @see retrieveOpenAI */
        @MustBeClosed
        fun retrieveOpenAI(
            datasetId: String,
            params: DatasetRetrieveOpenAIParams = DatasetRetrieveOpenAIParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveOpenAIResponse> =
            retrieveOpenAI(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieveOpenAI */
        @MustBeClosed
        fun retrieveOpenAI(
            datasetId: String,
            params: DatasetRetrieveOpenAIParams = DatasetRetrieveOpenAIParams.none(),
        ): HttpResponseFor<DatasetRetrieveOpenAIResponse> =
            retrieveOpenAI(datasetId, params, RequestOptions.none())

        /** @see retrieveOpenAI */
        @MustBeClosed
        fun retrieveOpenAI(
            params: DatasetRetrieveOpenAIParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveOpenAIResponse>

        /** @see retrieveOpenAI */
        @MustBeClosed
        fun retrieveOpenAI(
            params: DatasetRetrieveOpenAIParams
        ): HttpResponseFor<DatasetRetrieveOpenAIResponse> =
            retrieveOpenAI(params, RequestOptions.none())

        /** @see retrieveOpenAI */
        @MustBeClosed
        fun retrieveOpenAI(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveOpenAIResponse> =
            retrieveOpenAI(datasetId, DatasetRetrieveOpenAIParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/openai_ft`, but is
         * otherwise the same as [DatasetService.retrieveOpenAIFt].
         */
        @MustBeClosed
        fun retrieveOpenAIFt(datasetId: String): HttpResponseFor<DatasetRetrieveOpenAIFtResponse> =
            retrieveOpenAIFt(datasetId, DatasetRetrieveOpenAIFtParams.none())

        /** @see retrieveOpenAIFt */
        @MustBeClosed
        fun retrieveOpenAIFt(
            datasetId: String,
            params: DatasetRetrieveOpenAIFtParams = DatasetRetrieveOpenAIFtParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveOpenAIFtResponse> =
            retrieveOpenAIFt(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieveOpenAIFt */
        @MustBeClosed
        fun retrieveOpenAIFt(
            datasetId: String,
            params: DatasetRetrieveOpenAIFtParams = DatasetRetrieveOpenAIFtParams.none(),
        ): HttpResponseFor<DatasetRetrieveOpenAIFtResponse> =
            retrieveOpenAIFt(datasetId, params, RequestOptions.none())

        /** @see retrieveOpenAIFt */
        @MustBeClosed
        fun retrieveOpenAIFt(
            params: DatasetRetrieveOpenAIFtParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveOpenAIFtResponse>

        /** @see retrieveOpenAIFt */
        @MustBeClosed
        fun retrieveOpenAIFt(
            params: DatasetRetrieveOpenAIFtParams
        ): HttpResponseFor<DatasetRetrieveOpenAIFtResponse> =
            retrieveOpenAIFt(params, RequestOptions.none())

        /** @see retrieveOpenAIFt */
        @MustBeClosed
        fun retrieveOpenAIFt(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveOpenAIFtResponse> =
            retrieveOpenAIFt(datasetId, DatasetRetrieveOpenAIFtParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/datasets/{dataset_id}/version`, but is
         * otherwise the same as [DatasetService.retrieveVersion].
         */
        @MustBeClosed
        fun retrieveVersion(datasetId: String): HttpResponseFor<DatasetVersion> =
            retrieveVersion(datasetId, DatasetRetrieveVersionParams.none())

        /** @see retrieveVersion */
        @MustBeClosed
        fun retrieveVersion(
            datasetId: String,
            params: DatasetRetrieveVersionParams = DatasetRetrieveVersionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetVersion> =
            retrieveVersion(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see retrieveVersion */
        @MustBeClosed
        fun retrieveVersion(
            datasetId: String,
            params: DatasetRetrieveVersionParams = DatasetRetrieveVersionParams.none(),
        ): HttpResponseFor<DatasetVersion> =
            retrieveVersion(datasetId, params, RequestOptions.none())

        /** @see retrieveVersion */
        @MustBeClosed
        fun retrieveVersion(
            params: DatasetRetrieveVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetVersion>

        /** @see retrieveVersion */
        @MustBeClosed
        fun retrieveVersion(params: DatasetRetrieveVersionParams): HttpResponseFor<DatasetVersion> =
            retrieveVersion(params, RequestOptions.none())

        /** @see retrieveVersion */
        @MustBeClosed
        fun retrieveVersion(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetVersion> =
            retrieveVersion(datasetId, DatasetRetrieveVersionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/datasets/{dataset_id}/tags`, but is
         * otherwise the same as [DatasetService.updateTags].
         */
        @MustBeClosed
        fun updateTags(
            datasetId: String,
            params: DatasetUpdateTagsParams,
        ): HttpResponseFor<DatasetVersion> = updateTags(datasetId, params, RequestOptions.none())

        /** @see updateTags */
        @MustBeClosed
        fun updateTags(
            datasetId: String,
            params: DatasetUpdateTagsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetVersion> =
            updateTags(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see updateTags */
        @MustBeClosed
        fun updateTags(params: DatasetUpdateTagsParams): HttpResponseFor<DatasetVersion> =
            updateTags(params, RequestOptions.none())

        /** @see updateTags */
        @MustBeClosed
        fun updateTags(
            params: DatasetUpdateTagsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetVersion>

        /**
         * Returns a raw HTTP response for `post /api/v1/datasets/upload`, but is otherwise the same
         * as [DatasetService.upload].
         */
        @MustBeClosed
        fun upload(params: DatasetUploadParams): HttpResponseFor<Dataset> =
            upload(params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: DatasetUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Dataset>
    }
}
