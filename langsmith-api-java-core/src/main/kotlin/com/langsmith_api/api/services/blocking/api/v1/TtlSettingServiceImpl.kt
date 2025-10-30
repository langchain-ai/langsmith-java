// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

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
import com.langsmith_api.api.core.http.json
import com.langsmith_api.api.core.http.parseable
import com.langsmith_api.api.core.prepare
import com.langsmith_api.api.models.api.v1.orgs.ttlsettings.TtlSettings
import com.langsmith_api.api.models.api.v1.ttlsettings.TtlSettingRetrieveTtlSettingsParams
import com.langsmith_api.api.models.api.v1.ttlsettings.TtlSettingUpdateTtlSettingsParams
import java.util.function.Consumer

class TtlSettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TtlSettingService {

    private val withRawResponse: TtlSettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TtlSettingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TtlSettingService =
        TtlSettingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveTtlSettings(
        params: TtlSettingRetrieveTtlSettingsParams,
        requestOptions: RequestOptions,
    ): List<TtlSettings> =
        // get /api/v1/ttl-settings
        withRawResponse().retrieveTtlSettings(params, requestOptions).parse()

    override fun updateTtlSettings(
        params: TtlSettingUpdateTtlSettingsParams,
        requestOptions: RequestOptions,
    ): TtlSettings =
        // put /api/v1/ttl-settings
        withRawResponse().updateTtlSettings(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TtlSettingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TtlSettingService.WithRawResponse =
            TtlSettingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveTtlSettingsHandler: Handler<List<TtlSettings>> =
            jsonHandler<List<TtlSettings>>(clientOptions.jsonMapper)

        override fun retrieveTtlSettings(
            params: TtlSettingRetrieveTtlSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TtlSettings>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ttl-settings")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveTtlSettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val updateTtlSettingsHandler: Handler<TtlSettings> =
            jsonHandler<TtlSettings>(clientOptions.jsonMapper)

        override fun updateTtlSettings(
            params: TtlSettingUpdateTtlSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TtlSettings> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "ttl-settings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
