// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.usagelimits.UsageLimit
import com.langchain.smith.models.usagelimits.UsageLimitDeleteParams
import com.langchain.smith.models.usagelimits.UsageLimitDeleteResponse
import com.langchain.smith.models.usagelimits.UsageLimitRetrieveOrgParams
import com.langchain.smith.models.usagelimits.UsageLimitRetrieveUsageLimitsParams
import com.langchain.smith.models.usagelimits.UsageLimitUpdateUsageLimitsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UsageLimitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageLimitServiceAsync {

    private val withRawResponse: UsageLimitServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsageLimitServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageLimitServiceAsync =
        UsageLimitServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun delete(
        params: UsageLimitDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageLimitDeleteResponse> =
        // delete /api/v1/usage-limits/{usage_limit_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun retrieveOrg(
        params: UsageLimitRetrieveOrgParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<UsageLimit>> =
        // get /api/v1/usage-limits/org
        withRawResponse().retrieveOrg(params, requestOptions).thenApply { it.parse() }

    override fun retrieveUsageLimits(
        params: UsageLimitRetrieveUsageLimitsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<UsageLimit>> =
        // get /api/v1/usage-limits
        withRawResponse().retrieveUsageLimits(params, requestOptions).thenApply { it.parse() }

    override fun updateUsageLimits(
        params: UsageLimitUpdateUsageLimitsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageLimit> =
        // put /api/v1/usage-limits
        withRawResponse().updateUsageLimits(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageLimitServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageLimitServiceAsync.WithRawResponse =
            UsageLimitServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteHandler: Handler<UsageLimitDeleteResponse> =
            jsonHandler<UsageLimitDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: UsageLimitDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageLimitDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("usageLimitId", params.usageLimitId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "usage-limits", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveOrgHandler: Handler<List<UsageLimit>> =
            jsonHandler<List<UsageLimit>>(clientOptions.jsonMapper)

        override fun retrieveOrg(
            params: UsageLimitRetrieveOrgParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<UsageLimit>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "usage-limits", "org")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveOrgHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val retrieveUsageLimitsHandler: Handler<List<UsageLimit>> =
            jsonHandler<List<UsageLimit>>(clientOptions.jsonMapper)

        override fun retrieveUsageLimits(
            params: UsageLimitRetrieveUsageLimitsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<UsageLimit>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "usage-limits")
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
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val updateUsageLimitsHandler: Handler<UsageLimit> =
            jsonHandler<UsageLimit>(clientOptions.jsonMapper)

        override fun updateUsageLimits(
            params: UsageLimitUpdateUsageLimitsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageLimit>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "usage-limits")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateUsageLimitsHandler.handle(it) }
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
