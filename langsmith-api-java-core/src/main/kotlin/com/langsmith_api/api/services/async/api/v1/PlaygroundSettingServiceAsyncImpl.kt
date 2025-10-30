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
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingDeleteParams
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingDeleteResponse
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingPlaygroundSettingsParams
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingRetrievePlaygroundSettingsParams
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingUpdateParams
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PlaygroundSettingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PlaygroundSettingServiceAsync {

    private val withRawResponse: PlaygroundSettingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlaygroundSettingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PlaygroundSettingServiceAsync =
        PlaygroundSettingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: PlaygroundSettingUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlaygroundSettingsResponse> =
        // patch /api/v1/playground-settings/{playground_settings_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PlaygroundSettingDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlaygroundSettingDeleteResponse> =
        // delete /api/v1/playground-settings/{playground_settings_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun playgroundSettings(
        params: PlaygroundSettingPlaygroundSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlaygroundSettingsResponse> =
        // post /api/v1/playground-settings
        withRawResponse().playgroundSettings(params, requestOptions).thenApply { it.parse() }

    override fun retrievePlaygroundSettings(
        params: PlaygroundSettingRetrievePlaygroundSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<PlaygroundSettingsResponse>> =
        // get /api/v1/playground-settings
        withRawResponse().retrievePlaygroundSettings(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlaygroundSettingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlaygroundSettingServiceAsync.WithRawResponse =
            PlaygroundSettingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<PlaygroundSettingsResponse> =
            jsonHandler<PlaygroundSettingsResponse>(clientOptions.jsonMapper)

        override fun update(
            params: PlaygroundSettingUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("playgroundSettingsId", params.playgroundSettingsId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "playground-settings", params._pathParam(0))
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

        private val deleteHandler: Handler<PlaygroundSettingDeleteResponse> =
            jsonHandler<PlaygroundSettingDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PlaygroundSettingDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("playgroundSettingsId", params.playgroundSettingsId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "playground-settings", params._pathParam(0))
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

        private val playgroundSettingsHandler: Handler<PlaygroundSettingsResponse> =
            jsonHandler<PlaygroundSettingsResponse>(clientOptions.jsonMapper)

        override fun playgroundSettings(
            params: PlaygroundSettingPlaygroundSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "playground-settings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { playgroundSettingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrievePlaygroundSettingsHandler: Handler<List<PlaygroundSettingsResponse>> =
            jsonHandler<List<PlaygroundSettingsResponse>>(clientOptions.jsonMapper)

        override fun retrievePlaygroundSettings(
            params: PlaygroundSettingRetrievePlaygroundSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<PlaygroundSettingsResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "playground-settings")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrievePlaygroundSettingsHandler.handle(it) }
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
