// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

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
import com.langsmith_api.api.models.api.v1.runs.ResponseBodyForRunsGenerateQuery
import com.langsmith_api.api.models.api.v1.runs.RunDeleteParams
import com.langsmith_api.api.models.api.v1.runs.RunDeleteResponse
import com.langsmith_api.api.models.api.v1.runs.RunGenerateQueryParams
import com.langsmith_api.api.models.api.v1.runs.RunQueryParams
import com.langsmith_api.api.models.api.v1.runs.RunQueryResponse
import com.langsmith_api.api.models.api.v1.runs.RunRetrieveParams
import com.langsmith_api.api.models.api.v1.runs.RunSchema
import com.langsmith_api.api.models.api.v1.runs.RunStatsParams
import com.langsmith_api.api.models.api.v1.runs.RunStatsResponse
import com.langsmith_api.api.models.api.v1.runs.RunUpdateParams
import com.langsmith_api.api.models.api.v1.runs.RunUpdateResponse
import com.langsmith_api.api.services.blocking.api.v1.runs.GroupService
import com.langsmith_api.api.services.blocking.api.v1.runs.GroupServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.runs.RuleService
import com.langsmith_api.api.services.blocking.api.v1.runs.RuleServiceImpl
import com.langsmith_api.api.services.blocking.api.v1.runs.ShareService
import com.langsmith_api.api.services.blocking.api.v1.runs.ShareServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RunServiceImpl internal constructor(private val clientOptions: ClientOptions) : RunService {

    private val withRawResponse: RunService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val rules: RuleService by lazy { RuleServiceImpl(clientOptions) }

    private val share: ShareService by lazy { ShareServiceImpl(clientOptions) }

    private val group: GroupService by lazy { GroupServiceImpl(clientOptions) }

    override fun withRawResponse(): RunService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService =
        RunServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun rules(): RuleService = rules

    override fun share(): ShareService = share

    override fun group(): GroupService = group

    override fun retrieve(params: RunRetrieveParams, requestOptions: RequestOptions): RunSchema =
        // get /api/v1/runs/{run_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: RunUpdateParams,
        requestOptions: RequestOptions,
    ): RunUpdateResponse =
        // patch /api/v1/runs/{run_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: RunDeleteParams,
        requestOptions: RequestOptions,
    ): RunDeleteResponse =
        // post /api/v1/runs/delete
        withRawResponse().delete(params, requestOptions).parse()

    override fun generateQuery(
        params: RunGenerateQueryParams,
        requestOptions: RequestOptions,
    ): ResponseBodyForRunsGenerateQuery =
        // post /api/v1/runs/generate-query
        withRawResponse().generateQuery(params, requestOptions).parse()

    override fun query(params: RunQueryParams, requestOptions: RequestOptions): RunQueryResponse =
        // post /api/v1/runs/query
        withRawResponse().query(params, requestOptions).parse()

    override fun stats(params: RunStatsParams, requestOptions: RequestOptions): RunStatsResponse =
        // post /api/v1/runs/stats
        withRawResponse().stats(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val rules: RuleService.WithRawResponse by lazy {
            RuleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val share: ShareService.WithRawResponse by lazy {
            ShareServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val group: GroupService.WithRawResponse by lazy {
            GroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunService.WithRawResponse =
            RunServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun rules(): RuleService.WithRawResponse = rules

        override fun share(): ShareService.WithRawResponse = share

        override fun group(): GroupService.WithRawResponse = group

        private val retrieveHandler: Handler<RunSchema> =
            jsonHandler<RunSchema>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunSchema> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", params._pathParam(0))
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

        private val updateHandler: Handler<RunUpdateResponse> =
            jsonHandler<RunUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: RunUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("runId", params.runId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val deleteHandler: Handler<RunDeleteResponse> =
            jsonHandler<RunDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: RunDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "delete")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val generateQueryHandler: Handler<ResponseBodyForRunsGenerateQuery> =
            jsonHandler<ResponseBodyForRunsGenerateQuery>(clientOptions.jsonMapper)

        override fun generateQuery(
            params: RunGenerateQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseBodyForRunsGenerateQuery> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "generate-query")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { generateQueryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val queryHandler: Handler<RunQueryResponse> =
            jsonHandler<RunQueryResponse>(clientOptions.jsonMapper)

        override fun query(
            params: RunQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunQueryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "query")
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
            }
        }

        private val statsHandler: Handler<RunStatsResponse> =
            jsonHandler<RunStatsResponse>(clientOptions.jsonMapper)

        override fun stats(
            params: RunStatsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunStatsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "runs", "stats")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { statsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
