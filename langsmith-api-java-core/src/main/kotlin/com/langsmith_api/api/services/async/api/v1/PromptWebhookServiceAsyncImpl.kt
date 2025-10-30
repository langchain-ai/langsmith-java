// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

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
import com.langsmith_api.api.core.prepareAsync
import com.langsmith_api.api.models.api.v1.promptwebhooks.PromptWebhook
import com.langsmith_api.api.models.api.v1.promptwebhooks.PromptWebhookDeleteParams
import com.langsmith_api.api.models.api.v1.promptwebhooks.PromptWebhookDeleteResponse
import com.langsmith_api.api.models.api.v1.promptwebhooks.PromptWebhookPromptWebhooksParams
import com.langsmith_api.api.models.api.v1.promptwebhooks.PromptWebhookRetrieveParams
import com.langsmith_api.api.models.api.v1.promptwebhooks.PromptWebhookRetrievePromptWebhooksParams
import com.langsmith_api.api.models.api.v1.promptwebhooks.PromptWebhookTestParams
import com.langsmith_api.api.models.api.v1.promptwebhooks.PromptWebhookTestResponse
import com.langsmith_api.api.models.api.v1.promptwebhooks.PromptWebhookUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PromptWebhookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PromptWebhookServiceAsync {

    private val withRawResponse: PromptWebhookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PromptWebhookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromptWebhookServiceAsync =
        PromptWebhookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: PromptWebhookRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromptWebhook> =
        // get /api/v1/prompt-webhooks/{webhook_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PromptWebhookUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromptWebhook> =
        // patch /api/v1/prompt-webhooks/{webhook_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PromptWebhookDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromptWebhookDeleteResponse> =
        // delete /api/v1/prompt-webhooks/{webhook_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun promptWebhooks(
        params: PromptWebhookPromptWebhooksParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromptWebhook> =
        // post /api/v1/prompt-webhooks
        withRawResponse().promptWebhooks(params, requestOptions).thenApply { it.parse() }

    override fun retrievePromptWebhooks(
        params: PromptWebhookRetrievePromptWebhooksParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<PromptWebhook>> =
        // get /api/v1/prompt-webhooks
        withRawResponse().retrievePromptWebhooks(params, requestOptions).thenApply { it.parse() }

    override fun test(
        params: PromptWebhookTestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromptWebhookTestResponse> =
        // post /api/v1/prompt-webhooks/test
        withRawResponse().test(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PromptWebhookServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromptWebhookServiceAsync.WithRawResponse =
            PromptWebhookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<PromptWebhook> =
            jsonHandler<PromptWebhook>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PromptWebhookRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromptWebhook>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookId", params.webhookId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "prompt-webhooks", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<PromptWebhook> =
            jsonHandler<PromptWebhook>(clientOptions.jsonMapper)

        override fun update(
            params: PromptWebhookUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromptWebhook>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookId", params.webhookId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "prompt-webhooks", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<PromptWebhookDeleteResponse> =
            jsonHandler<PromptWebhookDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PromptWebhookDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromptWebhookDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookId", params.webhookId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "prompt-webhooks", params._pathParam(0))
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

        private val promptWebhooksHandler: Handler<PromptWebhook> =
            jsonHandler<PromptWebhook>(clientOptions.jsonMapper)

        override fun promptWebhooks(
            params: PromptWebhookPromptWebhooksParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromptWebhook>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "prompt-webhooks")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { promptWebhooksHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrievePromptWebhooksHandler: Handler<List<PromptWebhook>> =
            jsonHandler<List<PromptWebhook>>(clientOptions.jsonMapper)

        override fun retrievePromptWebhooks(
            params: PromptWebhookRetrievePromptWebhooksParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<PromptWebhook>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "prompt-webhooks")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrievePromptWebhooksHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val testHandler: Handler<PromptWebhookTestResponse> =
            jsonHandler<PromptWebhookTestResponse>(clientOptions.jsonMapper)

        override fun test(
            params: PromptWebhookTestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromptWebhookTestResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "prompt-webhooks", "test")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { testHandler.handle(it) }
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
