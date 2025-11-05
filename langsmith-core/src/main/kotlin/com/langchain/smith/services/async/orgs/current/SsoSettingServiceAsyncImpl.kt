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
import com.langchain.smith.models.orgs.current.ssosettings.SsoProvider
import com.langchain.smith.models.orgs.current.ssosettings.SsoSettingDeleteParams
import com.langchain.smith.models.orgs.current.ssosettings.SsoSettingRetrieveSsoSettingsParams
import com.langchain.smith.models.orgs.current.ssosettings.SsoSettingSsoSettingsParams
import com.langchain.smith.models.orgs.current.ssosettings.SsoSettingUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SsoSettingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SsoSettingServiceAsync {

    private val withRawResponse: SsoSettingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SsoSettingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SsoSettingServiceAsync =
        SsoSettingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: SsoSettingUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SsoProvider> =
        // patch /api/v1/orgs/current/sso-settings/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SsoSettingDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SsoProvider> =
        // delete /api/v1/orgs/current/sso-settings/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun retrieveSsoSettings(
        params: SsoSettingRetrieveSsoSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<SsoProvider>> =
        // get /api/v1/orgs/current/sso-settings
        withRawResponse().retrieveSsoSettings(params, requestOptions).thenApply { it.parse() }

    override fun ssoSettings(
        params: SsoSettingSsoSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SsoProvider> =
        // post /api/v1/orgs/current/sso-settings
        withRawResponse().ssoSettings(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SsoSettingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SsoSettingServiceAsync.WithRawResponse =
            SsoSettingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<SsoProvider> =
            jsonHandler<SsoProvider>(clientOptions.jsonMapper)

        override fun update(
            params: SsoSettingUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SsoProvider>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "orgs",
                        "current",
                        "sso-settings",
                        params._pathParam(0),
                    )
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

        private val deleteHandler: Handler<SsoProvider> =
            jsonHandler<SsoProvider>(clientOptions.jsonMapper)

        override fun delete(
            params: SsoSettingDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SsoProvider>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "orgs",
                        "current",
                        "sso-settings",
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

        private val retrieveSsoSettingsHandler: Handler<List<SsoProvider>> =
            jsonHandler<List<SsoProvider>>(clientOptions.jsonMapper)

        override fun retrieveSsoSettings(
            params: SsoSettingRetrieveSsoSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<SsoProvider>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "sso-settings")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveSsoSettingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val ssoSettingsHandler: Handler<SsoProvider> =
            jsonHandler<SsoProvider>(clientOptions.jsonMapper)

        override fun ssoSettings(
            params: SsoSettingSsoSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SsoProvider>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "sso-settings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { ssoSettingsHandler.handle(it) }
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
