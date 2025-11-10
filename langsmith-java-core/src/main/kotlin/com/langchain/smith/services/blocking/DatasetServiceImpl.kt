// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.handlers.errorBodyHandler
import com.langchain.smith.core.handlers.errorHandler
import com.langchain.smith.core.handlers.jsonHandler
import com.langchain.smith.core.http.HttpMethod
import com.langchain.smith.core.http.HttpRequest
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponse.Handler
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.core.http.json
import com.langchain.smith.core.http.multipartFormData
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.datasets.Dataset
import com.langchain.smith.models.datasets.DatasetCloneParams
import com.langchain.smith.models.datasets.DatasetCloneResponse
import com.langchain.smith.models.datasets.DatasetCreateParams
import com.langchain.smith.models.datasets.DatasetDeleteParams
import com.langchain.smith.models.datasets.DatasetDeleteResponse
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
import com.langchain.smith.models.datasets.DatasetSearchParams
import com.langchain.smith.models.datasets.DatasetSearchResponse
import com.langchain.smith.models.datasets.DatasetUpdateParams
import com.langchain.smith.models.datasets.DatasetUpdateResponse
import com.langchain.smith.models.datasets.DatasetUpdateTagsParams
import com.langchain.smith.models.datasets.DatasetUploadExperimentParams
import com.langchain.smith.models.datasets.DatasetUploadExperimentResponse
import com.langchain.smith.models.datasets.DatasetUploadParams
import com.langchain.smith.models.datasets.DatasetVersion
import com.langchain.smith.services.blocking.datasets.ComparativeService
import com.langchain.smith.services.blocking.datasets.ComparativeServiceImpl
import com.langchain.smith.services.blocking.datasets.ExperimentService
import com.langchain.smith.services.blocking.datasets.ExperimentServiceImpl
import com.langchain.smith.services.blocking.datasets.GroupService
import com.langchain.smith.services.blocking.datasets.GroupServiceImpl
import com.langchain.smith.services.blocking.datasets.IndexService
import com.langchain.smith.services.blocking.datasets.IndexServiceImpl
import com.langchain.smith.services.blocking.datasets.PlaygroundExperimentService
import com.langchain.smith.services.blocking.datasets.PlaygroundExperimentServiceImpl
import com.langchain.smith.services.blocking.datasets.RunService
import com.langchain.smith.services.blocking.datasets.RunServiceImpl
import com.langchain.smith.services.blocking.datasets.ShareService
import com.langchain.smith.services.blocking.datasets.ShareServiceImpl
import com.langchain.smith.services.blocking.datasets.SplitService
import com.langchain.smith.services.blocking.datasets.SplitServiceImpl
import com.langchain.smith.services.blocking.datasets.VersionService
import com.langchain.smith.services.blocking.datasets.VersionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DatasetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasetService {

    private val withRawResponse: DatasetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val versions: VersionService by lazy { VersionServiceImpl(clientOptions) }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    private val group: GroupService by lazy { GroupServiceImpl(clientOptions) }

    private val experiments: ExperimentService by lazy { ExperimentServiceImpl(clientOptions) }

    private val share: ShareService by lazy { ShareServiceImpl(clientOptions) }

    private val comparative: ComparativeService by lazy { ComparativeServiceImpl(clientOptions) }

    private val splits: SplitService by lazy { SplitServiceImpl(clientOptions) }

    private val index: IndexService by lazy { IndexServiceImpl(clientOptions) }

    private val playgroundExperiment: PlaygroundExperimentService by lazy {
        PlaygroundExperimentServiceImpl(clientOptions)
    }

    override fun withRawResponse(): DatasetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetService =
        DatasetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun versions(): VersionService = versions

    override fun runs(): RunService = runs

    override fun group(): GroupService = group

    override fun experiments(): ExperimentService = experiments

    override fun share(): ShareService = share

    override fun comparative(): ComparativeService = comparative

    override fun splits(): SplitService = splits

    override fun index(): IndexService = index

    override fun playgroundExperiment(): PlaygroundExperimentService = playgroundExperiment

    override fun create(params: DatasetCreateParams, requestOptions: RequestOptions): Dataset =
        // post /api/v1/datasets
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: DatasetRetrieveParams, requestOptions: RequestOptions): Dataset =
        // get /api/v1/datasets/{dataset_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: DatasetUpdateParams,
        requestOptions: RequestOptions,
    ): DatasetUpdateResponse =
        // patch /api/v1/datasets/{dataset_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: DatasetListParams, requestOptions: RequestOptions): List<Dataset> =
        // get /api/v1/datasets
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: DatasetDeleteParams,
        requestOptions: RequestOptions,
    ): DatasetDeleteResponse =
        // delete /api/v1/datasets/{dataset_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun clone(
        params: DatasetCloneParams,
        requestOptions: RequestOptions,
    ): List<DatasetCloneResponse> =
        // post /api/v1/datasets/clone
        withRawResponse().clone(params, requestOptions).parse()

    override fun retrieveCsv(
        params: DatasetRetrieveCsvParams,
        requestOptions: RequestOptions,
    ): DatasetRetrieveCsvResponse =
        // get /api/v1/datasets/{dataset_id}/csv
        withRawResponse().retrieveCsv(params, requestOptions).parse()

    override fun retrieveJsonl(
        params: DatasetRetrieveJsonlParams,
        requestOptions: RequestOptions,
    ): DatasetRetrieveJsonlResponse =
        // get /api/v1/datasets/{dataset_id}/jsonl
        withRawResponse().retrieveJsonl(params, requestOptions).parse()

    override fun retrieveOpenAI(
        params: DatasetRetrieveOpenAIParams,
        requestOptions: RequestOptions,
    ): DatasetRetrieveOpenAIResponse =
        // get /api/v1/datasets/{dataset_id}/openai
        withRawResponse().retrieveOpenAI(params, requestOptions).parse()

    override fun retrieveOpenAIFt(
        params: DatasetRetrieveOpenAIFtParams,
        requestOptions: RequestOptions,
    ): DatasetRetrieveOpenAIFtResponse =
        // get /api/v1/datasets/{dataset_id}/openai_ft
        withRawResponse().retrieveOpenAIFt(params, requestOptions).parse()

    override fun retrieveVersion(
        params: DatasetRetrieveVersionParams,
        requestOptions: RequestOptions,
    ): DatasetVersion =
        // get /api/v1/datasets/{dataset_id}/version
        withRawResponse().retrieveVersion(params, requestOptions).parse()

    override fun search(
        params: DatasetSearchParams,
        requestOptions: RequestOptions,
    ): DatasetSearchResponse =
        // post /api/v1/datasets/{dataset_id}/search
        withRawResponse().search(params, requestOptions).parse()

    override fun updateTags(
        params: DatasetUpdateTagsParams,
        requestOptions: RequestOptions,
    ): DatasetVersion =
        // put /api/v1/datasets/{dataset_id}/tags
        withRawResponse().updateTags(params, requestOptions).parse()

    override fun upload(params: DatasetUploadParams, requestOptions: RequestOptions): Dataset =
        // post /api/v1/datasets/upload
        withRawResponse().upload(params, requestOptions).parse()

    override fun uploadExperiment(
        params: DatasetUploadExperimentParams,
        requestOptions: RequestOptions,
    ): DatasetUploadExperimentResponse =
        // post /api/v1/datasets/upload-experiment
        withRawResponse().uploadExperiment(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatasetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val versions: VersionService.WithRawResponse by lazy {
            VersionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunService.WithRawResponse by lazy {
            RunServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val group: GroupService.WithRawResponse by lazy {
            GroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val experiments: ExperimentService.WithRawResponse by lazy {
            ExperimentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val share: ShareService.WithRawResponse by lazy {
            ShareServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val comparative: ComparativeService.WithRawResponse by lazy {
            ComparativeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val splits: SplitService.WithRawResponse by lazy {
            SplitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val index: IndexService.WithRawResponse by lazy {
            IndexServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val playgroundExperiment: PlaygroundExperimentService.WithRawResponse by lazy {
            PlaygroundExperimentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatasetService.WithRawResponse =
            DatasetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun versions(): VersionService.WithRawResponse = versions

        override fun runs(): RunService.WithRawResponse = runs

        override fun group(): GroupService.WithRawResponse = group

        override fun experiments(): ExperimentService.WithRawResponse = experiments

        override fun share(): ShareService.WithRawResponse = share

        override fun comparative(): ComparativeService.WithRawResponse = comparative

        override fun splits(): SplitService.WithRawResponse = splits

        override fun index(): IndexService.WithRawResponse = index

        override fun playgroundExperiment(): PlaygroundExperimentService.WithRawResponse =
            playgroundExperiment

        private val createHandler: Handler<Dataset> = jsonHandler<Dataset>(clientOptions.jsonMapper)

        override fun create(
            params: DatasetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Dataset> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Dataset> =
            jsonHandler<Dataset>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DatasetRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Dataset> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<DatasetUpdateResponse> =
            jsonHandler<DatasetUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: DatasetUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<Dataset>> =
            jsonHandler<List<Dataset>>(clientOptions.jsonMapper)

        override fun list(
            params: DatasetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Dataset>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<DatasetDeleteResponse> =
            jsonHandler<DatasetDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: DatasetDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cloneHandler: Handler<List<DatasetCloneResponse>> =
            jsonHandler<List<DatasetCloneResponse>>(clientOptions.jsonMapper)

        override fun clone(
            params: DatasetCloneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<DatasetCloneResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", "clone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cloneHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val retrieveCsvHandler: Handler<DatasetRetrieveCsvResponse> =
            jsonHandler<DatasetRetrieveCsvResponse>(clientOptions.jsonMapper)

        override fun retrieveCsv(
            params: DatasetRetrieveCsvParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveCsvResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "csv")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveCsvHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveJsonlHandler: Handler<DatasetRetrieveJsonlResponse> =
            jsonHandler<DatasetRetrieveJsonlResponse>(clientOptions.jsonMapper)

        override fun retrieveJsonl(
            params: DatasetRetrieveJsonlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveJsonlResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "jsonl")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveJsonlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveOpenAIHandler: Handler<DatasetRetrieveOpenAIResponse> =
            jsonHandler<DatasetRetrieveOpenAIResponse>(clientOptions.jsonMapper)

        override fun retrieveOpenAI(
            params: DatasetRetrieveOpenAIParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveOpenAIResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "openai")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveOpenAIHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveOpenAIFtHandler: Handler<DatasetRetrieveOpenAIFtResponse> =
            jsonHandler<DatasetRetrieveOpenAIFtResponse>(clientOptions.jsonMapper)

        override fun retrieveOpenAIFt(
            params: DatasetRetrieveOpenAIFtParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveOpenAIFtResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "openai_ft")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveOpenAIFtHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveVersionHandler: Handler<DatasetVersion> =
            jsonHandler<DatasetVersion>(clientOptions.jsonMapper)

        override fun retrieveVersion(
            params: DatasetRetrieveVersionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetVersion> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "version")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveVersionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<DatasetSearchResponse> =
            jsonHandler<DatasetSearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: DatasetSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetSearchResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateTagsHandler: Handler<DatasetVersion> =
            jsonHandler<DatasetVersion>(clientOptions.jsonMapper)

        override fun updateTags(
            params: DatasetUpdateTagsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetVersion> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "tags")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateTagsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uploadHandler: Handler<Dataset> = jsonHandler<Dataset>(clientOptions.jsonMapper)

        override fun upload(
            params: DatasetUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Dataset> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", "upload")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val uploadExperimentHandler: Handler<DatasetUploadExperimentResponse> =
            jsonHandler<DatasetUploadExperimentResponse>(clientOptions.jsonMapper)

        override fun uploadExperiment(
            params: DatasetUploadExperimentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetUploadExperimentResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", "upload-experiment")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { uploadExperimentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
