// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.models.orgs.OrgCreateParams
import com.langchain.smith.models.orgs.OrgListParams
import com.langchain.smith.models.orgs.OrgRetrievePermissionsParams
import com.langchain.smith.models.orgs.OrgRetrievePermissionsResponse
import com.langchain.smith.models.orgs.OrganizationPgSchemaSlim
import com.langchain.smith.services.async.orgs.CurrentServiceAsync
import com.langchain.smith.services.async.orgs.CurrentServiceAsyncImpl
import com.langchain.smith.services.async.orgs.MemberServiceAsync
import com.langchain.smith.services.async.orgs.MemberServiceAsyncImpl
import com.langchain.smith.services.async.orgs.PendingServiceAsync
import com.langchain.smith.services.async.orgs.PendingServiceAsyncImpl
import com.langchain.smith.services.async.orgs.TtlSettingServiceAsync
import com.langchain.smith.services.async.orgs.TtlSettingServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class OrgServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OrgServiceAsync {

    private val withRawResponse: OrgServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val current: CurrentServiceAsync by lazy { CurrentServiceAsyncImpl(clientOptions) }

    private val pending: PendingServiceAsync by lazy { PendingServiceAsyncImpl(clientOptions) }

    private val members: MemberServiceAsync by lazy { MemberServiceAsyncImpl(clientOptions) }

    private val ttlSettings: TtlSettingServiceAsync by lazy {
        TtlSettingServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): OrgServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgServiceAsync =
        OrgServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun current(): CurrentServiceAsync = current

    override fun pending(): PendingServiceAsync = pending

    override fun members(): MemberServiceAsync = members

    override fun ttlSettings(): TtlSettingServiceAsync = ttlSettings

    override fun create(
        params: OrgCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OrganizationPgSchemaSlim> =
        // post /api/v1/orgs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: OrgListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<OrganizationPgSchemaSlim>> =
        // get /api/v1/orgs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun retrievePermissions(
        params: OrgRetrievePermissionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<OrgRetrievePermissionsResponse>> =
        // get /api/v1/orgs/permissions
        withRawResponse().retrievePermissions(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrgServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val current: CurrentServiceAsync.WithRawResponse by lazy {
            CurrentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val pending: PendingServiceAsync.WithRawResponse by lazy {
            PendingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val members: MemberServiceAsync.WithRawResponse by lazy {
            MemberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ttlSettings: TtlSettingServiceAsync.WithRawResponse by lazy {
            TtlSettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrgServiceAsync.WithRawResponse =
            OrgServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun current(): CurrentServiceAsync.WithRawResponse = current

        override fun pending(): PendingServiceAsync.WithRawResponse = pending

        override fun members(): MemberServiceAsync.WithRawResponse = members

        override fun ttlSettings(): TtlSettingServiceAsync.WithRawResponse = ttlSettings

        private val createHandler: Handler<OrganizationPgSchemaSlim> =
            jsonHandler<OrganizationPgSchemaSlim>(clientOptions.jsonMapper)

        override fun create(
            params: OrgCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OrganizationPgSchemaSlim>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<List<OrganizationPgSchemaSlim>> =
            jsonHandler<List<OrganizationPgSchemaSlim>>(clientOptions.jsonMapper)

        override fun list(
            params: OrgListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<OrganizationPgSchemaSlim>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val retrievePermissionsHandler: Handler<List<OrgRetrievePermissionsResponse>> =
            jsonHandler<List<OrgRetrievePermissionsResponse>>(clientOptions.jsonMapper)

        override fun retrievePermissions(
            params: OrgRetrievePermissionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<OrgRetrievePermissionsResponse>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "permissions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrievePermissionsHandler.handle(it) }
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
