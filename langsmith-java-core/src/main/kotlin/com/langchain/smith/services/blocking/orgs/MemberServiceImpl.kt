// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
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
import com.langchain.smith.models.orgs.members.MemberUpdateBasicParams
import com.langchain.smith.models.orgs.members.MemberUpdateBasicResponse
import java.util.function.Consumer

class MemberServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MemberService {

    private val withRawResponse: MemberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MemberService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberService =
        MemberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun updateBasic(
        params: MemberUpdateBasicParams,
        requestOptions: RequestOptions,
    ): MemberUpdateBasicResponse =
        // patch /api/v1/orgs/members/basic
        withRawResponse().updateBasic(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MemberService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MemberService.WithRawResponse =
            MemberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateBasicHandler: Handler<MemberUpdateBasicResponse> =
            jsonHandler<MemberUpdateBasicResponse>(clientOptions.jsonMapper)

        override fun updateBasic(
            params: MemberUpdateBasicParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MemberUpdateBasicResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "members", "basic")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateBasicHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
