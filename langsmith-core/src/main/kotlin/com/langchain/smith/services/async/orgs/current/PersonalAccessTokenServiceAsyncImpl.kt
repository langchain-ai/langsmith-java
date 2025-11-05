// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current

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
import com.langchain.smith.models.orgs.current.personalaccesstokens.PersonalAccessTokenDeleteParams
import com.langchain.smith.models.orgs.current.personalaccesstokens.PersonalAccessTokenPersonalAccessTokensParams
import com.langchain.smith.models.orgs.current.personalaccesstokens.PersonalAccessTokenRetrievePersonalAccessTokensParams
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyCreateResponse
import com.langchain.smith.models.orgs.current.servicekeys.ApiKeyGetResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PersonalAccessTokenServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PersonalAccessTokenServiceAsync {

    private val withRawResponse: PersonalAccessTokenServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PersonalAccessTokenServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PersonalAccessTokenServiceAsync =
        PersonalAccessTokenServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun delete(
        params: PersonalAccessTokenDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiKeyGetResponse> =
        // delete /api/v1/orgs/current/personal-access-tokens/{pat_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun personalAccessTokens(
        params: PersonalAccessTokenPersonalAccessTokensParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiKeyCreateResponse> =
        // post /api/v1/orgs/current/personal-access-tokens
        withRawResponse().personalAccessTokens(params, requestOptions).thenApply { it.parse() }

    override fun retrievePersonalAccessTokens(
        params: PersonalAccessTokenRetrievePersonalAccessTokensParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<ApiKeyGetResponse>> =
        // get /api/v1/orgs/current/personal-access-tokens
        withRawResponse().retrievePersonalAccessTokens(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PersonalAccessTokenServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PersonalAccessTokenServiceAsync.WithRawResponse =
            PersonalAccessTokenServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteHandler: Handler<ApiKeyGetResponse> =
            jsonHandler<ApiKeyGetResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PersonalAccessTokenDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKeyGetResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("patId", params.patId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "orgs",
                        "current",
                        "personal-access-tokens",
                        params._pathParam(0),
                    )
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

        private val personalAccessTokensHandler: Handler<ApiKeyCreateResponse> =
            jsonHandler<ApiKeyCreateResponse>(clientOptions.jsonMapper)

        override fun personalAccessTokens(
            params: PersonalAccessTokenPersonalAccessTokensParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "personal-access-tokens")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { personalAccessTokensHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrievePersonalAccessTokensHandler: Handler<List<ApiKeyGetResponse>> =
            jsonHandler<List<ApiKeyGetResponse>>(clientOptions.jsonMapper)

        override fun retrievePersonalAccessTokens(
            params: PersonalAccessTokenRetrievePersonalAccessTokensParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ApiKeyGetResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "personal-access-tokens")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrievePersonalAccessTokensHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }
    }
}
