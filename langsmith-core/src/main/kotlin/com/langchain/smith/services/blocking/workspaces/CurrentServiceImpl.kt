// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspaces

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
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.workspaces.current.CurrentRetrieveStatsParams
import com.langchain.smith.models.workspaces.current.CurrentRetrieveStatsResponse
import com.langchain.smith.models.workspaces.current.CurrentRetrieveUsageLimitsParams
import com.langchain.smith.models.workspaces.current.CurrentRetrieveUsageLimitsResponse
import com.langchain.smith.services.blocking.workspaces.current.MemberService
import com.langchain.smith.services.blocking.workspaces.current.MemberServiceImpl
import com.langchain.smith.services.blocking.workspaces.current.SecretService
import com.langchain.smith.services.blocking.workspaces.current.SecretServiceImpl
import com.langchain.smith.services.blocking.workspaces.current.SharedService
import com.langchain.smith.services.blocking.workspaces.current.SharedServiceImpl
import com.langchain.smith.services.blocking.workspaces.current.TagKeyService
import com.langchain.smith.services.blocking.workspaces.current.TagKeyServiceImpl
import com.langchain.smith.services.blocking.workspaces.current.TagService
import com.langchain.smith.services.blocking.workspaces.current.TagServiceImpl
import com.langchain.smith.services.blocking.workspaces.current.TaggingService
import com.langchain.smith.services.blocking.workspaces.current.TaggingServiceImpl
import java.util.function.Consumer

class CurrentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CurrentService {

    private val withRawResponse: CurrentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val members: MemberService by lazy { MemberServiceImpl(clientOptions) }

    private val shared: SharedService by lazy { SharedServiceImpl(clientOptions) }

    private val secrets: SecretService by lazy { SecretServiceImpl(clientOptions) }

    private val tagKeys: TagKeyService by lazy { TagKeyServiceImpl(clientOptions) }

    private val taggings: TaggingService by lazy { TaggingServiceImpl(clientOptions) }

    private val tags: TagService by lazy { TagServiceImpl(clientOptions) }

    override fun withRawResponse(): CurrentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentService =
        CurrentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun members(): MemberService = members

    override fun shared(): SharedService = shared

    override fun secrets(): SecretService = secrets

    override fun tagKeys(): TagKeyService = tagKeys

    override fun taggings(): TaggingService = taggings

    override fun tags(): TagService = tags

    override fun retrieveStats(
        params: CurrentRetrieveStatsParams,
        requestOptions: RequestOptions,
    ): CurrentRetrieveStatsResponse =
        // get /api/v1/workspaces/current/stats
        withRawResponse().retrieveStats(params, requestOptions).parse()

    override fun retrieveUsageLimits(
        params: CurrentRetrieveUsageLimitsParams,
        requestOptions: RequestOptions,
    ): CurrentRetrieveUsageLimitsResponse =
        // get /api/v1/workspaces/current/usage_limits
        withRawResponse().retrieveUsageLimits(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CurrentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val members: MemberService.WithRawResponse by lazy {
            MemberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val shared: SharedService.WithRawResponse by lazy {
            SharedServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val secrets: SecretService.WithRawResponse by lazy {
            SecretServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tagKeys: TagKeyService.WithRawResponse by lazy {
            TagKeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val taggings: TaggingService.WithRawResponse by lazy {
            TaggingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tags: TagService.WithRawResponse by lazy {
            TagServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CurrentService.WithRawResponse =
            CurrentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun members(): MemberService.WithRawResponse = members

        override fun shared(): SharedService.WithRawResponse = shared

        override fun secrets(): SecretService.WithRawResponse = secrets

        override fun tagKeys(): TagKeyService.WithRawResponse = tagKeys

        override fun taggings(): TaggingService.WithRawResponse = taggings

        override fun tags(): TagService.WithRawResponse = tags

        private val retrieveStatsHandler: Handler<CurrentRetrieveStatsResponse> =
            jsonHandler<CurrentRetrieveStatsResponse>(clientOptions.jsonMapper)

        override fun retrieveStats(
            params: CurrentRetrieveStatsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrentRetrieveStatsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "stats")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveStatsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveUsageLimitsHandler: Handler<CurrentRetrieveUsageLimitsResponse> =
            jsonHandler<CurrentRetrieveUsageLimitsResponse>(clientOptions.jsonMapper)

        override fun retrieveUsageLimits(
            params: CurrentRetrieveUsageLimitsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrentRetrieveUsageLimitsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "usage_limits")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveUsageLimitsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
