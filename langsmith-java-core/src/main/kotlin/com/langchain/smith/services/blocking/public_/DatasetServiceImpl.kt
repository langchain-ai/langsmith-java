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
import com.langchain.smith.models.public_.datasets.DatasetListParams
import com.langchain.smith.models.public_.datasets.DatasetListResponse
import com.langchain.smith.models.public_.datasets.DatasetRetrieveComparativePage
import com.langchain.smith.models.public_.datasets.DatasetRetrieveComparativeParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveComparativeResponse
import com.langchain.smith.models.public_.datasets.DatasetRetrieveFeedbackPage
import com.langchain.smith.models.public_.datasets.DatasetRetrieveFeedbackParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsBulkParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsPage
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsParams
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

    override fun retrieveComparative(
        params: DatasetRetrieveComparativeParams,
        requestOptions: RequestOptions,
    ): DatasetRetrieveComparativePage =
        // get /api/v1/public/{share_token}/datasets/comparative
        withRawResponse().retrieveComparative(params, requestOptions).parse()

    override fun retrieveFeedback(
        params: DatasetRetrieveFeedbackParams,
        requestOptions: RequestOptions,
    ): DatasetRetrieveFeedbackPage =
        // get /api/v1/public/{share_token}/datasets/feedback
        withRawResponse().retrieveFeedback(params, requestOptions).parse()

    override fun retrieveSessions(
        params: DatasetRetrieveSessionsParams,
        requestOptions: RequestOptions,
    ): DatasetRetrieveSessionsPage =
        // get /api/v1/public/{share_token}/datasets/sessions
        withRawResponse().retrieveSessions(params, requestOptions).parse()

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

        private val retrieveComparativeHandler: Handler<List<DatasetRetrieveComparativeResponse>> =
            jsonHandler<List<DatasetRetrieveComparativeResponse>>(clientOptions.jsonMapper)

        override fun retrieveComparative(
            params: DatasetRetrieveComparativeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveComparativePage> {
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
                    .use { retrieveComparativeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        DatasetRetrieveComparativePage.builder()
                            .service(DatasetServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val retrieveFeedbackHandler: Handler<List<FeedbackSchema>> =
            jsonHandler<List<FeedbackSchema>>(clientOptions.jsonMapper)

        override fun retrieveFeedback(
            params: DatasetRetrieveFeedbackParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveFeedbackPage> {
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
                    .use { retrieveFeedbackHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        DatasetRetrieveFeedbackPage.builder()
                            .service(DatasetServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }

        private val retrieveSessionsHandler: Handler<List<TracerSession>> =
            jsonHandler<List<TracerSession>>(clientOptions.jsonMapper)

        override fun retrieveSessions(
            params: DatasetRetrieveSessionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveSessionsPage> {
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
                    .use { retrieveSessionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        DatasetRetrieveSessionsPage.builder()
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
