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
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.issues.Issue
import com.langchain.smith.models.issues.IssueListPage
import com.langchain.smith.models.issues.IssueListParams
import com.langchain.smith.models.issues.IssueRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class IssueServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IssueService {

    private val withRawResponse: IssueService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IssueService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IssueService =
        IssueServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(params: IssueRetrieveParams, requestOptions: RequestOptions): Issue =
        // get /v1/platform/issues/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: IssueListParams, requestOptions: RequestOptions): IssueListPage =
        // get /v1/platform/issues
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IssueService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IssueService.WithRawResponse =
            IssueServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<Issue> = jsonHandler<Issue>(clientOptions.jsonMapper)

        override fun retrieve(
            params: IssueRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Issue> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "issues", params._pathParam(0))
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

        private val listHandler: Handler<List<Issue>> =
            jsonHandler<List<Issue>>(clientOptions.jsonMapper)

        override fun list(
            params: IssueListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IssueListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "platform", "issues")
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
                    .let {
                        IssueListPage.builder()
                            .service(IssueServiceImpl(clientOptions))
                            .params(params)
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
