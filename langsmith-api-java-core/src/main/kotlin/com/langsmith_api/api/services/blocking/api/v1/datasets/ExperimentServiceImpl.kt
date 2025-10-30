// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.datasets

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
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepare
import com.langsmith_api.api.models.api.v1.datasets.experiments.ExperimentGroupedParams
import com.langsmith_api.api.models.api.v1.datasets.experiments.ExperimentGroupedResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExperimentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExperimentService {

    private val withRawResponse: ExperimentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExperimentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExperimentService =
        ExperimentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun grouped(
        params: ExperimentGroupedParams,
        requestOptions: RequestOptions,
    ): ExperimentGroupedResponse =
        // post /api/v1/datasets/{dataset_id}/experiments/grouped
        withRawResponse().grouped(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExperimentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExperimentService.WithRawResponse =
            ExperimentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val groupedHandler: Handler<ExperimentGroupedResponse> =
            jsonHandler<ExperimentGroupedResponse>(clientOptions.jsonMapper)

        override fun grouped(
            params: ExperimentGroupedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExperimentGroupedResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "datasets",
                        params._pathParam(0),
                        "experiments",
                        "grouped",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { groupedHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
