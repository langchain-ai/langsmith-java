// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.handlers.errorBodyHandler
import com.langsmith_api.api.core.handlers.errorHandler
import com.langsmith_api.api.core.handlers.jsonHandler
import com.langsmith_api.api.core.http.HttpMethod
import com.langsmith_api.api.core.http.HttpRequest
import com.langsmith_api.api.core.http.HttpResponse
import com.langsmith_api.api.core.http.HttpResponse.Handler
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.core.http.json
import com.langsmith_api.api.core.http.multipartFormData
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.api.v1.datasets.Dataset
import com.langsmith_api.api.models.api.v1.datasets.DatasetCloneParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetCloneResponse
import com.langsmith_api.api.models.api.v1.datasets.DatasetCreateParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetDeleteParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetDeleteResponse
import com.langsmith_api.api.models.api.v1.datasets.DatasetGenerateParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetGenerateResponse
import com.langsmith_api.api.models.api.v1.datasets.DatasetListParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetRetrieveCsvParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetRetrieveCsvResponse
import com.langsmith_api.api.models.api.v1.datasets.DatasetRetrieveJsonlParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetRetrieveJsonlResponse
import com.langsmith_api.api.models.api.v1.datasets.DatasetRetrieveOpenAIFtParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetRetrieveOpenAIFtResponse
import com.langsmith_api.api.models.api.v1.datasets.DatasetRetrieveOpenAIParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetRetrieveOpenAIResponse
import com.langsmith_api.api.models.api.v1.datasets.DatasetRetrieveParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetRetrieveVersionParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetSearchParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetSearchResponse
import com.langsmith_api.api.models.api.v1.datasets.DatasetStudioExperimentParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetStudioExperimentResponse
import com.langsmith_api.api.models.api.v1.datasets.DatasetUpdateParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetUpdateResponse
import com.langsmith_api.api.models.api.v1.datasets.DatasetUpdateTagsParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetUploadExperimentParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetUploadExperimentResponse
import com.langsmith_api.api.models.api.v1.datasets.DatasetUploadParams
import com.langsmith_api.api.models.api.v1.datasets.DatasetVersion
import com.langsmith_api.api.services.async.api.v1.datasets.ComparativeServiceAsync
import com.langsmith_api.api.services.async.api.v1.datasets.ComparativeServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.datasets.ExperimentServiceAsync
import com.langsmith_api.api.services.async.api.v1.datasets.ExperimentServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.datasets.GroupServiceAsync
import com.langsmith_api.api.services.async.api.v1.datasets.GroupServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.datasets.IndexServiceAsync
import com.langsmith_api.api.services.async.api.v1.datasets.IndexServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.datasets.PlaygroundExperimentServiceAsync
import com.langsmith_api.api.services.async.api.v1.datasets.PlaygroundExperimentServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.datasets.RunServiceAsync
import com.langsmith_api.api.services.async.api.v1.datasets.RunServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.datasets.ShareServiceAsync
import com.langsmith_api.api.services.async.api.v1.datasets.ShareServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.datasets.SplitServiceAsync
import com.langsmith_api.api.services.async.api.v1.datasets.SplitServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.datasets.VersionServiceAsync
import com.langsmith_api.api.services.async.api.v1.datasets.VersionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DatasetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasetServiceAsync {

    private val withRawResponse: DatasetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val versions: VersionServiceAsync by lazy { VersionServiceAsyncImpl(clientOptions) }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    private val group: GroupServiceAsync by lazy { GroupServiceAsyncImpl(clientOptions) }

    private val experiments: ExperimentServiceAsync by lazy {
        ExperimentServiceAsyncImpl(clientOptions)
    }

    private val share: ShareServiceAsync by lazy { ShareServiceAsyncImpl(clientOptions) }

    private val comparative: ComparativeServiceAsync by lazy {
        ComparativeServiceAsyncImpl(clientOptions)
    }

    private val splits: SplitServiceAsync by lazy { SplitServiceAsyncImpl(clientOptions) }

    private val index: IndexServiceAsync by lazy { IndexServiceAsyncImpl(clientOptions) }

    private val playgroundExperiment: PlaygroundExperimentServiceAsync by lazy {
        PlaygroundExperimentServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): DatasetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetServiceAsync =
        DatasetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun versions(): VersionServiceAsync = versions

    override fun runs(): RunServiceAsync = runs

    override fun group(): GroupServiceAsync = group

    override fun experiments(): ExperimentServiceAsync = experiments

    override fun share(): ShareServiceAsync = share

    override fun comparative(): ComparativeServiceAsync = comparative

    override fun splits(): SplitServiceAsync = splits

    override fun index(): IndexServiceAsync = index

    override fun playgroundExperiment(): PlaygroundExperimentServiceAsync = playgroundExperiment

    override fun create(
        params: DatasetCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Dataset> =
        // post /api/v1/datasets
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Dataset> =
        // get /api/v1/datasets/{dataset_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: DatasetUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetUpdateResponse> =
        // patch /api/v1/datasets/{dataset_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Dataset>> =
        // get /api/v1/datasets
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: DatasetDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetDeleteResponse> =
        // delete /api/v1/datasets/{dataset_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun clone(
        params: DatasetCloneParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<DatasetCloneResponse>> =
        // post /api/v1/datasets/clone
        withRawResponse().clone(params, requestOptions).thenApply { it.parse() }

    override fun generate(
        params: DatasetGenerateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetGenerateResponse> =
        // post /api/v1/datasets/{dataset_id}/generate
        withRawResponse().generate(params, requestOptions).thenApply { it.parse() }

    override fun retrieveCsv(
        params: DatasetRetrieveCsvParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetRetrieveCsvResponse> =
        // get /api/v1/datasets/{dataset_id}/csv
        withRawResponse().retrieveCsv(params, requestOptions).thenApply { it.parse() }

    override fun retrieveJsonl(
        params: DatasetRetrieveJsonlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetRetrieveJsonlResponse> =
        // get /api/v1/datasets/{dataset_id}/jsonl
        withRawResponse().retrieveJsonl(params, requestOptions).thenApply { it.parse() }

    override fun retrieveOpenAI(
        params: DatasetRetrieveOpenAIParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetRetrieveOpenAIResponse> =
        // get /api/v1/datasets/{dataset_id}/openai
        withRawResponse().retrieveOpenAI(params, requestOptions).thenApply { it.parse() }

    override fun retrieveOpenAIFt(
        params: DatasetRetrieveOpenAIFtParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetRetrieveOpenAIFtResponse> =
        // get /api/v1/datasets/{dataset_id}/openai_ft
        withRawResponse().retrieveOpenAIFt(params, requestOptions).thenApply { it.parse() }

    override fun retrieveVersion(
        params: DatasetRetrieveVersionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetVersion> =
        // get /api/v1/datasets/{dataset_id}/version
        withRawResponse().retrieveVersion(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: DatasetSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetSearchResponse> =
        // post /api/v1/datasets/{dataset_id}/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    override fun studioExperiment(
        params: DatasetStudioExperimentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetStudioExperimentResponse> =
        // post /api/v1/datasets/studio_experiment
        withRawResponse().studioExperiment(params, requestOptions).thenApply { it.parse() }

    override fun updateTags(
        params: DatasetUpdateTagsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetVersion> =
        // put /api/v1/datasets/{dataset_id}/tags
        withRawResponse().updateTags(params, requestOptions).thenApply { it.parse() }

    override fun upload(
        params: DatasetUploadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Dataset> =
        // post /api/v1/datasets/upload
        withRawResponse().upload(params, requestOptions).thenApply { it.parse() }

    override fun uploadExperiment(
        params: DatasetUploadExperimentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetUploadExperimentResponse> =
        // post /api/v1/datasets/upload-experiment
        withRawResponse().uploadExperiment(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatasetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val versions: VersionServiceAsync.WithRawResponse by lazy {
            VersionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val group: GroupServiceAsync.WithRawResponse by lazy {
            GroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val experiments: ExperimentServiceAsync.WithRawResponse by lazy {
            ExperimentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val share: ShareServiceAsync.WithRawResponse by lazy {
            ShareServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val comparative: ComparativeServiceAsync.WithRawResponse by lazy {
            ComparativeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val splits: SplitServiceAsync.WithRawResponse by lazy {
            SplitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val index: IndexServiceAsync.WithRawResponse by lazy {
            IndexServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val playgroundExperiment: PlaygroundExperimentServiceAsync.WithRawResponse by lazy {
            PlaygroundExperimentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatasetServiceAsync.WithRawResponse =
            DatasetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun versions(): VersionServiceAsync.WithRawResponse = versions

        override fun runs(): RunServiceAsync.WithRawResponse = runs

        override fun group(): GroupServiceAsync.WithRawResponse = group

        override fun experiments(): ExperimentServiceAsync.WithRawResponse = experiments

        override fun share(): ShareServiceAsync.WithRawResponse = share

        override fun comparative(): ComparativeServiceAsync.WithRawResponse = comparative

        override fun splits(): SplitServiceAsync.WithRawResponse = splits

        override fun index(): IndexServiceAsync.WithRawResponse = index

        override fun playgroundExperiment(): PlaygroundExperimentServiceAsync.WithRawResponse =
            playgroundExperiment

        private val createHandler: Handler<Dataset> = jsonHandler<Dataset>(clientOptions.jsonMapper)

        override fun create(
            params: DatasetCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Dataset>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<Dataset> =
            jsonHandler<Dataset>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DatasetRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Dataset>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<DatasetUpdateResponse> =
            jsonHandler<DatasetUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: DatasetUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetUpdateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<List<Dataset>> =
            jsonHandler<List<Dataset>>(clientOptions.jsonMapper)

        override fun list(
            params: DatasetListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Dataset>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<DatasetDeleteResponse> =
            jsonHandler<DatasetDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: DatasetDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetDeleteResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val cloneHandler: Handler<List<DatasetCloneResponse>> =
            jsonHandler<List<DatasetCloneResponse>>(clientOptions.jsonMapper)

        override fun clone(
            params: DatasetCloneParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<DatasetCloneResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", "clone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cloneHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val generateHandler: Handler<DatasetGenerateResponse> =
            jsonHandler<DatasetGenerateResponse>(clientOptions.jsonMapper)

        override fun generate(
            params: DatasetGenerateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetGenerateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "generate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { generateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveCsvHandler: Handler<DatasetRetrieveCsvResponse> =
            jsonHandler<DatasetRetrieveCsvResponse>(clientOptions.jsonMapper)

        override fun retrieveCsv(
            params: DatasetRetrieveCsvParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveCsvResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "csv")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveCsvHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveJsonlHandler: Handler<DatasetRetrieveJsonlResponse> =
            jsonHandler<DatasetRetrieveJsonlResponse>(clientOptions.jsonMapper)

        override fun retrieveJsonl(
            params: DatasetRetrieveJsonlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveJsonlResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "jsonl")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveJsonlHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveOpenAIHandler: Handler<DatasetRetrieveOpenAIResponse> =
            jsonHandler<DatasetRetrieveOpenAIResponse>(clientOptions.jsonMapper)

        override fun retrieveOpenAI(
            params: DatasetRetrieveOpenAIParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveOpenAIResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "openai")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveOpenAIHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveOpenAIFtHandler: Handler<DatasetRetrieveOpenAIFtResponse> =
            jsonHandler<DatasetRetrieveOpenAIFtResponse>(clientOptions.jsonMapper)

        override fun retrieveOpenAIFt(
            params: DatasetRetrieveOpenAIFtParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveOpenAIFtResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "openai_ft")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveOpenAIFtHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveVersionHandler: Handler<DatasetVersion> =
            jsonHandler<DatasetVersion>(clientOptions.jsonMapper)

        override fun retrieveVersion(
            params: DatasetRetrieveVersionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetVersion>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", params._pathParam(0), "version")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveVersionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val searchHandler: Handler<DatasetSearchResponse> =
            jsonHandler<DatasetSearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: DatasetSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetSearchResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val studioExperimentHandler: Handler<DatasetStudioExperimentResponse> =
            jsonHandler<DatasetStudioExperimentResponse>(clientOptions.jsonMapper)

        override fun studioExperiment(
            params: DatasetStudioExperimentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetStudioExperimentResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", "studio_experiment")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { studioExperimentHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateTagsHandler: Handler<DatasetVersion> =
            jsonHandler<DatasetVersion>(clientOptions.jsonMapper)

        override fun updateTags(
            params: DatasetUpdateTagsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetVersion>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateTagsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val uploadHandler: Handler<Dataset> = jsonHandler<Dataset>(clientOptions.jsonMapper)

        override fun upload(
            params: DatasetUploadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Dataset>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", "upload")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { uploadHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val uploadExperimentHandler: Handler<DatasetUploadExperimentResponse> =
            jsonHandler<DatasetUploadExperimentResponse>(clientOptions.jsonMapper)

        override fun uploadExperiment(
            params: DatasetUploadExperimentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetUploadExperimentResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "datasets", "upload-experiment")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
