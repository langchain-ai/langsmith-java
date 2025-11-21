// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.public_

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
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.models.public_.datasets.DatasetListComparativePageAsync
import com.langchain.smith.models.public_.datasets.DatasetListComparativeParams
import com.langchain.smith.models.public_.datasets.DatasetListComparativeResponse
import com.langchain.smith.models.public_.datasets.DatasetListFeedbackPageAsync
import com.langchain.smith.models.public_.datasets.DatasetListFeedbackParams
import com.langchain.smith.models.public_.datasets.DatasetListParams
import com.langchain.smith.models.public_.datasets.DatasetListResponse
import com.langchain.smith.models.public_.datasets.DatasetListSessionsPageAsync
import com.langchain.smith.models.public_.datasets.DatasetListSessionsParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsBulkParams
import com.langchain.smith.models.sessions.TracerSession
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DatasetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasetServiceAsync {

    private val withRawResponse: DatasetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DatasetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetServiceAsync =
        DatasetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetListResponse> =
        // get /api/v1/public/{share_token}/datasets
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun listComparative(
        params: DatasetListComparativeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetListComparativePageAsync> =
        // get /api/v1/public/{share_token}/datasets/comparative
        withRawResponse().listComparative(params, requestOptions).thenApply { it.parse() }

    override fun listFeedback(
        params: DatasetListFeedbackParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetListFeedbackPageAsync> =
        // get /api/v1/public/{share_token}/datasets/feedback
        withRawResponse().listFeedback(params, requestOptions).thenApply { it.parse() }

    override fun listSessions(
        params: DatasetListSessionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetListSessionsPageAsync> =
        // get /api/v1/public/{share_token}/datasets/sessions
        withRawResponse().listSessions(params, requestOptions).thenApply { it.parse() }

    override fun retrieveSessionsBulk(
        params: DatasetRetrieveSessionsBulkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TracerSession>> =
        // get /api/v1/public/datasets/sessions-bulk
        withRawResponse().retrieveSessionsBulk(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatasetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatasetServiceAsync.WithRawResponse =
            DatasetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<DatasetListResponse> =
            jsonHandler<DatasetListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DatasetListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "public", params._pathParam(0), "datasets")
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
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listComparativeHandler: Handler<List<DatasetListComparativeResponse>> =
            jsonHandler<List<DatasetListComparativeResponse>>(clientOptions.jsonMapper)

        override fun listComparative(
            params: DatasetListComparativeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetListComparativePageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "public",
                        params._pathParam(0),
                        "datasets",
                        "comparative",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listComparativeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                            .let {
                                DatasetListComparativePageAsync.builder()
                                    .service(DatasetServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val listFeedbackHandler: Handler<List<FeedbackSchema>> =
            jsonHandler<List<FeedbackSchema>>(clientOptions.jsonMapper)

        override fun listFeedback(
            params: DatasetListFeedbackParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetListFeedbackPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "public",
                        params._pathParam(0),
                        "datasets",
                        "feedback",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listFeedbackHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                            .let {
                                DatasetListFeedbackPageAsync.builder()
                                    .service(DatasetServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val listSessionsHandler: Handler<List<TracerSession>> =
            jsonHandler<List<TracerSession>>(clientOptions.jsonMapper)

        override fun listSessions(
            params: DatasetListSessionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetListSessionsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "public",
                        params._pathParam(0),
                        "datasets",
                        "sessions",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listSessionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                            .let {
                                DatasetListSessionsPageAsync.builder()
                                    .service(DatasetServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .items(it)
                                    .build()
                            }
                    }
                }
        }

        private val retrieveSessionsBulkHandler: Handler<List<TracerSession>> =
            jsonHandler<List<TracerSession>>(clientOptions.jsonMapper)

        override fun retrieveSessionsBulk(
            params: DatasetRetrieveSessionsBulkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TracerSession>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "public", "datasets", "sessions-bulk")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveSessionsBulkHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }
    }
}
