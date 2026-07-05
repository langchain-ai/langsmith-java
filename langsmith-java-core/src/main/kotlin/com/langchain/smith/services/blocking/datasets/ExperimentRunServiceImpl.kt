// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

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
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.datasets.experimentruns.ExperimentRunQueryPage
import com.langchain.smith.models.datasets.experimentruns.ExperimentRunQueryPageResponse
import com.langchain.smith.models.datasets.experimentruns.ExperimentRunQueryParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExperimentRunServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExperimentRunService {

    private val withRawResponse: ExperimentRunService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExperimentRunService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExperimentRunService =
        ExperimentRunServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun query(
        params: ExperimentRunQueryParams,
        requestOptions: RequestOptions,
    ): ExperimentRunQueryPage =
        // post /v2/datasets/{dataset_id}/experiment-runs
        withRawResponse().query(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExperimentRunService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExperimentRunService.WithRawResponse =
            ExperimentRunServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val queryHandler: Handler<ExperimentRunQueryPageResponse> =
            jsonHandler<ExperimentRunQueryPageResponse>(clientOptions.jsonMapper)

        override fun query(
            params: ExperimentRunQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExperimentRunQueryPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "datasets", params._pathParam(0), "experiment-runs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ExperimentRunQueryPage.builder()
                            .service(ExperimentRunServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
