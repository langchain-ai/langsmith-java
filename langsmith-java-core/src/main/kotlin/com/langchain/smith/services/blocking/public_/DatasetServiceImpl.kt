// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.public_

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
import com.langchain.smith.core.prepare
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.models.public_.datasets.DatasetListComparativePage
import com.langchain.smith.models.public_.datasets.DatasetListComparativeParams
import com.langchain.smith.models.public_.datasets.DatasetListComparativeResponse
import com.langchain.smith.models.public_.datasets.DatasetListFeedbackPage
import com.langchain.smith.models.public_.datasets.DatasetListFeedbackParams
import com.langchain.smith.models.public_.datasets.DatasetListParams
import com.langchain.smith.models.public_.datasets.DatasetListResponse
import com.langchain.smith.models.public_.datasets.DatasetListSessionsPage
import com.langchain.smith.models.public_.datasets.DatasetListSessionsParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsBulkParams
import com.langchain.smith.models.sessions.TracerSession
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DatasetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasetService {

    private val withRawResponse: DatasetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DatasetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetService =
        DatasetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions,
    ): DatasetListResponse =
        // get /api/v1/public/{share_token}/datasets
        withRawResponse().list(params, requestOptions).parse()

    override fun listComparative(
        params: DatasetListComparativeParams,
        requestOptions: RequestOptions,
    ): DatasetListComparativePage =
        // get /api/v1/public/{share_token}/datasets/comparative
        withRawResponse().listComparative(params, requestOptions).parse()

    override fun listFeedback(
        params: DatasetListFeedbackParams,
        requestOptions: RequestOptions,
    ): DatasetListFeedbackPage =
        // get /api/v1/public/{share_token}/datasets/feedback
        withRawResponse().listFeedback(params, requestOptions).parse()

    override fun listSessions(
        params: DatasetListSessionsParams,
        requestOptions: RequestOptions,
    ): DatasetListSessionsPage =
        // get /api/v1/public/{share_token}/datasets/sessions
        withRawResponse().listSessions(params, requestOptions).parse()

    override fun retrieveSessionsBulk(
        params: DatasetRetrieveSessionsBulkParams,
        requestOptions: RequestOptions,
    ): List<TracerSession> =
        // get /api/v1/public/datasets/sessions-bulk
        withRawResponse().retrieveSessionsBulk(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatasetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatasetService.WithRawResponse =
            DatasetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<DatasetListResponse> =
            jsonHandler<DatasetListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DatasetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("shareToken", params.shareToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "public", params._pathParam(0), "datasets")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listComparativeHandler: Handler<List<DatasetListComparativeResponse>> =
            jsonHandler<List<DatasetListComparativeResponse>>(clientOptions.jsonMapper)

        override fun listComparative(
            params: DatasetListComparativeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetListComparativePage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listComparativeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        DatasetListComparativePage.builder()
                            .service(DatasetServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val listFeedbackHandler: Handler<List<FeedbackSchema>> =
            jsonHandler<List<FeedbackSchema>>(clientOptions.jsonMapper)

        override fun listFeedback(
            params: DatasetListFeedbackParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetListFeedbackPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listFeedbackHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        DatasetListFeedbackPage.builder()
                            .service(DatasetServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val listSessionsHandler: Handler<List<TracerSession>> =
            jsonHandler<List<TracerSession>>(clientOptions.jsonMapper)

        override fun listSessions(
            params: DatasetListSessionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetListSessionsPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listSessionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        DatasetListSessionsPage.builder()
                            .service(DatasetServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val retrieveSessionsBulkHandler: Handler<List<TracerSession>> =
            jsonHandler<List<TracerSession>>(clientOptions.jsonMapper)

        override fun retrieveSessionsBulk(
            params: DatasetRetrieveSessionsBulkParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TracerSession>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "public", "datasets", "sessions-bulk")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
