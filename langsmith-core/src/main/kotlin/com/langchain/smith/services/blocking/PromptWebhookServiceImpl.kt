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
import com.langchain.smith.core.http.json
import com.langchain.smith.core.http.parseable
import com.langchain.smith.core.prepare
import com.langchain.smith.models.promptwebhooks.PromptWebhook
import com.langchain.smith.models.promptwebhooks.PromptWebhookDeleteParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookDeleteResponse
import com.langchain.smith.models.promptwebhooks.PromptWebhookPromptWebhooksParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookRetrieveParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookRetrievePromptWebhooksParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookTestParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookTestResponse
import com.langchain.smith.models.promptwebhooks.PromptWebhookUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PromptWebhookServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PromptWebhookService {

    private val withRawResponse: PromptWebhookService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PromptWebhookService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromptWebhookService =
        PromptWebhookServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: PromptWebhookRetrieveParams,
        requestOptions: RequestOptions,
    ): PromptWebhook =
        // get /api/v1/prompt-webhooks/{webhook_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PromptWebhookUpdateParams,
        requestOptions: RequestOptions,
    ): PromptWebhook =
        // patch /api/v1/prompt-webhooks/{webhook_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: PromptWebhookDeleteParams,
        requestOptions: RequestOptions,
    ): PromptWebhookDeleteResponse =
        // delete /api/v1/prompt-webhooks/{webhook_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun promptWebhooks(
        params: PromptWebhookPromptWebhooksParams,
        requestOptions: RequestOptions,
    ): PromptWebhook =
        // post /api/v1/prompt-webhooks
        withRawResponse().promptWebhooks(params, requestOptions).parse()

    override fun retrievePromptWebhooks(
        params: PromptWebhookRetrievePromptWebhooksParams,
        requestOptions: RequestOptions,
    ): List<PromptWebhook> =
        // get /api/v1/prompt-webhooks
        withRawResponse().retrievePromptWebhooks(params, requestOptions).parse()

    override fun test(
        params: PromptWebhookTestParams,
        requestOptions: RequestOptions,
    ): PromptWebhookTestResponse =
        // post /api/v1/prompt-webhooks/test
        withRawResponse().test(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PromptWebhookService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromptWebhookService.WithRawResponse =
            PromptWebhookServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<PromptWebhook> =
            jsonHandler<PromptWebhook>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PromptWebhookRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptWebhook> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookId", params.webhookId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "prompt-webhooks", params._pathParam(0))
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

        private val updateHandler: Handler<PromptWebhook> =
            jsonHandler<PromptWebhook>(clientOptions.jsonMapper)

        override fun update(
            params: PromptWebhookUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptWebhook> {
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

        private val deleteHandler: Handler<PromptWebhookDeleteResponse> =
            jsonHandler<PromptWebhookDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PromptWebhookDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptWebhookDeleteResponse> {
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

        private val promptWebhooksHandler: Handler<PromptWebhook> =
            jsonHandler<PromptWebhook>(clientOptions.jsonMapper)

        override fun promptWebhooks(
            params: PromptWebhookPromptWebhooksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptWebhook> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "prompt-webhooks")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { promptWebhooksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrievePromptWebhooksHandler: Handler<List<PromptWebhook>> =
            jsonHandler<List<PromptWebhook>>(clientOptions.jsonMapper)

        override fun retrievePromptWebhooks(
            params: PromptWebhookRetrievePromptWebhooksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<PromptWebhook>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "prompt-webhooks")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrievePromptWebhooksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val testHandler: Handler<PromptWebhookTestResponse> =
            jsonHandler<PromptWebhookTestResponse>(clientOptions.jsonMapper)

        override fun test(
            params: PromptWebhookTestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptWebhookTestResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "prompt-webhooks", "test")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
