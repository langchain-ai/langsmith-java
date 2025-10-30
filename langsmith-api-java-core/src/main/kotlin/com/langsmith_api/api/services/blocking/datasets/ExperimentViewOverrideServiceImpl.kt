// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.datasets

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.handlers.emptyHandler
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
import com.langsmith_api.api.models.datasets.experimentviewoverrides.ExperimentViewOverride
import com.langsmith_api.api.models.datasets.experimentviewoverrides.ExperimentViewOverrideCreateParams
import com.langsmith_api.api.models.datasets.experimentviewoverrides.ExperimentViewOverrideDeleteParams
import com.langsmith_api.api.models.datasets.experimentviewoverrides.ExperimentViewOverrideListParams
import com.langsmith_api.api.models.datasets.experimentviewoverrides.ExperimentViewOverrideRetrieveParams
import com.langsmith_api.api.models.datasets.experimentviewoverrides.ExperimentViewOverrideUpdateParams
import java.util.function.Consumer

class ExperimentViewOverrideServiceImpl
internal constructor(private val clientOptions: ClientOptions) : ExperimentViewOverrideService {

    private val withRawResponse: ExperimentViewOverrideService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExperimentViewOverrideService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ExperimentViewOverrideService =
        ExperimentViewOverrideServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ExperimentViewOverrideCreateParams,
        requestOptions: RequestOptions,
    ): ExperimentViewOverride =
        // post /datasets/{dataset_id}/experiment-view-overrides
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ExperimentViewOverrideRetrieveParams,
        requestOptions: RequestOptions,
    ): ExperimentViewOverride =
        // get /datasets/{dataset_id}/experiment-view-overrides/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ExperimentViewOverrideUpdateParams,
        requestOptions: RequestOptions,
    ): ExperimentViewOverride =
        // patch /datasets/{dataset_id}/experiment-view-overrides/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ExperimentViewOverrideListParams,
        requestOptions: RequestOptions,
    ): List<ExperimentViewOverride> =
        // get /datasets/{dataset_id}/experiment-view-overrides
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ExperimentViewOverrideDeleteParams,
        requestOptions: RequestOptions,
    ) {
        // delete /datasets/{dataset_id}/experiment-view-overrides/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExperimentViewOverrideService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExperimentViewOverrideService.WithRawResponse =
            ExperimentViewOverrideServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ExperimentViewOverride> =
            jsonHandler<ExperimentViewOverride>(clientOptions.jsonMapper)

        override fun create(
            params: ExperimentViewOverrideCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExperimentViewOverride> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("datasets", params._pathParam(0), "experiment-view-overrides")
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

        private val retrieveHandler: Handler<ExperimentViewOverride> =
            jsonHandler<ExperimentViewOverride>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ExperimentViewOverrideRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExperimentViewOverride> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "datasets",
                        params._pathParam(0),
                        "experiment-view-overrides",
                        params._pathParam(1),
                    )
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

        private val updateHandler: Handler<ExperimentViewOverride> =
            jsonHandler<ExperimentViewOverride>(clientOptions.jsonMapper)

        override fun update(
            params: ExperimentViewOverrideUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExperimentViewOverride> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "datasets",
                        params._pathParam(0),
                        "experiment-view-overrides",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<List<ExperimentViewOverride>> =
            jsonHandler<List<ExperimentViewOverride>>(clientOptions.jsonMapper)

        override fun list(
            params: ExperimentViewOverrideListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ExperimentViewOverride>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("datasets", params._pathParam(0), "experiment-view-overrides")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ExperimentViewOverrideDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "datasets",
                        params._pathParam(0),
                        "experiment-view-overrides",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
