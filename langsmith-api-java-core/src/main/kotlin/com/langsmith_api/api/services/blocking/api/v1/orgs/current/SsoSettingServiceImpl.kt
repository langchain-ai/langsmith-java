// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs.current

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
import com.langsmith_api.api.core.prepare
import com.langsmith_api.api.models.api.v1.orgs.current.ssosettings.SsoProvider
import com.langsmith_api.api.models.api.v1.orgs.current.ssosettings.SsoSettingDeleteParams
import com.langsmith_api.api.models.api.v1.orgs.current.ssosettings.SsoSettingRetrieveSsoSettingsParams
import com.langsmith_api.api.models.api.v1.orgs.current.ssosettings.SsoSettingSsoSettingsParams
import com.langsmith_api.api.models.api.v1.orgs.current.ssosettings.SsoSettingUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SsoSettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SsoSettingService {

    private val withRawResponse: SsoSettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SsoSettingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SsoSettingService =
        SsoSettingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: SsoSettingUpdateParams,
        requestOptions: RequestOptions,
    ): SsoProvider =
        // patch /api/v1/orgs/current/sso-settings/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: SsoSettingDeleteParams,
        requestOptions: RequestOptions,
    ): SsoProvider =
        // delete /api/v1/orgs/current/sso-settings/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveSsoSettings(
        params: SsoSettingRetrieveSsoSettingsParams,
        requestOptions: RequestOptions,
    ): List<SsoProvider> =
        // get /api/v1/orgs/current/sso-settings
        withRawResponse().retrieveSsoSettings(params, requestOptions).parse()

    override fun ssoSettings(
        params: SsoSettingSsoSettingsParams,
        requestOptions: RequestOptions,
    ): SsoProvider =
        // post /api/v1/orgs/current/sso-settings
        withRawResponse().ssoSettings(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SsoSettingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SsoSettingService.WithRawResponse =
            SsoSettingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<SsoProvider> =
            jsonHandler<SsoProvider>(clientOptions.jsonMapper)

        override fun update(
            params: SsoSettingUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SsoProvider> {
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

        private val deleteHandler: Handler<SsoProvider> =
            jsonHandler<SsoProvider>(clientOptions.jsonMapper)

        override fun delete(
            params: SsoSettingDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SsoProvider> {
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

        private val retrieveSsoSettingsHandler: Handler<List<SsoProvider>> =
            jsonHandler<List<SsoProvider>>(clientOptions.jsonMapper)

        override fun retrieveSsoSettings(
            params: SsoSettingRetrieveSsoSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SsoProvider>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "sso-settings")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveSsoSettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val ssoSettingsHandler: Handler<SsoProvider> =
            jsonHandler<SsoProvider>(clientOptions.jsonMapper)

        override fun ssoSettings(
            params: SsoSettingSsoSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SsoProvider> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "sso-settings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
