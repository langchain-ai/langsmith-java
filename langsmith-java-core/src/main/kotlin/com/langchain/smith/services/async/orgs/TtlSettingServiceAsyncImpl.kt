// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs

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
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.orgs.ttlsettings.TtlSettingRetrieveTtlSettingsParams
import com.langchain.smith.models.orgs.ttlsettings.TtlSettingUpdateTtlSettingsParams
import com.langchain.smith.models.orgs.ttlsettings.TtlSettings
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class TtlSettingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TtlSettingServiceAsync {

    private val withRawResponse: TtlSettingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TtlSettingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TtlSettingServiceAsync =
        TtlSettingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveTtlSettings(
        params: TtlSettingRetrieveTtlSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TtlSettings>> =
        // get /api/v1/orgs/ttl-settings
        withRawResponse().retrieveTtlSettings(params, requestOptions).thenApply { it.parse() }

    override fun updateTtlSettings(
        params: TtlSettingUpdateTtlSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TtlSettings> =
        // put /api/v1/orgs/ttl-settings
        withRawResponse().updateTtlSettings(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TtlSettingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TtlSettingServiceAsync.WithRawResponse =
            TtlSettingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveTtlSettingsHandler: Handler<List<TtlSettings>> =
            jsonHandler<List<TtlSettings>>(clientOptions.jsonMapper)

        override fun retrieveTtlSettings(
            params: TtlSettingRetrieveTtlSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TtlSettings>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "ttl-settings")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveTtlSettingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val updateTtlSettingsHandler: Handler<TtlSettings> =
            jsonHandler<TtlSettings>(clientOptions.jsonMapper)

        override fun updateTtlSettings(
            params: TtlSettingUpdateTtlSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TtlSettings>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "ttl-settings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateTtlSettingsHandler.handle(it) }
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
