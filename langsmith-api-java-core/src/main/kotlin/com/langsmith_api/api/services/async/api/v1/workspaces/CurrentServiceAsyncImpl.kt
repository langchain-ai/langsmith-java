// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.workspaces

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.handlers.errorBodyHandler
import com.langsmith_api.api.core.handlers.errorHandler
import com.langsmith_api.api.core.handlers.jsonHandler
import com.langsmith_api.api.core.http.HttpMethod
import com.langsmith_api.api.core.http.HttpRequest
import com.langsmith_api.api.core.http.HttpResponse
import com.langsmith_api.api.core.http.HttpResponse.Handler
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.api.v1.workspaces.current.CurrentRetrieveStatsParams
import com.langsmith_api.api.models.api.v1.workspaces.current.CurrentRetrieveStatsResponse
import com.langsmith_api.api.models.api.v1.workspaces.current.CurrentRetrieveUsageLimitsParams
import com.langsmith_api.api.models.api.v1.workspaces.current.CurrentRetrieveUsageLimitsResponse
import com.langsmith_api.api.services.async.api.v1.workspaces.current.MemberServiceAsync
import com.langsmith_api.api.services.async.api.v1.workspaces.current.MemberServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.workspaces.current.SecretServiceAsync
import com.langsmith_api.api.services.async.api.v1.workspaces.current.SecretServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.workspaces.current.SharedServiceAsync
import com.langsmith_api.api.services.async.api.v1.workspaces.current.SharedServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.workspaces.current.TagKeyServiceAsync
import com.langsmith_api.api.services.async.api.v1.workspaces.current.TagKeyServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.workspaces.current.TagServiceAsync
import com.langsmith_api.api.services.async.api.v1.workspaces.current.TagServiceAsyncImpl
import com.langsmith_api.api.services.async.api.v1.workspaces.current.TaggingServiceAsync
import com.langsmith_api.api.services.async.api.v1.workspaces.current.TaggingServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CurrentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CurrentServiceAsync {

    private val withRawResponse: CurrentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val members: MemberServiceAsync by lazy { MemberServiceAsyncImpl(clientOptions) }

    private val shared: SharedServiceAsync by lazy { SharedServiceAsyncImpl(clientOptions) }

    private val secrets: SecretServiceAsync by lazy { SecretServiceAsyncImpl(clientOptions) }

    private val tagKeys: TagKeyServiceAsync by lazy { TagKeyServiceAsyncImpl(clientOptions) }

    private val taggings: TaggingServiceAsync by lazy { TaggingServiceAsyncImpl(clientOptions) }

    private val tags: TagServiceAsync by lazy { TagServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CurrentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrentServiceAsync =
        CurrentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun members(): MemberServiceAsync = members

    override fun shared(): SharedServiceAsync = shared

    override fun secrets(): SecretServiceAsync = secrets

    override fun tagKeys(): TagKeyServiceAsync = tagKeys

    override fun taggings(): TaggingServiceAsync = taggings

    override fun tags(): TagServiceAsync = tags

    override fun retrieveStats(
        params: CurrentRetrieveStatsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrentRetrieveStatsResponse> =
        // get /api/v1/workspaces/current/stats
        withRawResponse().retrieveStats(params, requestOptions).thenApply { it.parse() }

    override fun retrieveUsageLimits(
        params: CurrentRetrieveUsageLimitsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrentRetrieveUsageLimitsResponse> =
        // get /api/v1/workspaces/current/usage_limits
        withRawResponse().retrieveUsageLimits(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CurrentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val members: MemberServiceAsync.WithRawResponse by lazy {
            MemberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val shared: SharedServiceAsync.WithRawResponse by lazy {
            SharedServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val secrets: SecretServiceAsync.WithRawResponse by lazy {
            SecretServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tagKeys: TagKeyServiceAsync.WithRawResponse by lazy {
            TagKeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val taggings: TaggingServiceAsync.WithRawResponse by lazy {
            TaggingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tags: TagServiceAsync.WithRawResponse by lazy {
            TagServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CurrentServiceAsync.WithRawResponse =
            CurrentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun members(): MemberServiceAsync.WithRawResponse = members

        override fun shared(): SharedServiceAsync.WithRawResponse = shared

        override fun secrets(): SecretServiceAsync.WithRawResponse = secrets

        override fun tagKeys(): TagKeyServiceAsync.WithRawResponse = tagKeys

        override fun taggings(): TaggingServiceAsync.WithRawResponse = taggings

        override fun tags(): TagServiceAsync.WithRawResponse = tags

        private val retrieveStatsHandler: Handler<CurrentRetrieveStatsResponse> =
            jsonHandler<CurrentRetrieveStatsResponse>(clientOptions.jsonMapper)

        override fun retrieveStats(
            params: CurrentRetrieveStatsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrentRetrieveStatsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "stats")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveStatsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveUsageLimitsHandler: Handler<CurrentRetrieveUsageLimitsResponse> =
            jsonHandler<CurrentRetrieveUsageLimitsResponse>(clientOptions.jsonMapper)

        override fun retrieveUsageLimits(
            params: CurrentRetrieveUsageLimitsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrentRetrieveUsageLimitsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "usage_limits")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
