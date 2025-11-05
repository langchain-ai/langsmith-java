// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

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
import com.langchain.smith.core.prepare
import com.langchain.smith.models.orgs.OrgCreateParams
import com.langchain.smith.models.orgs.OrgListParams
import com.langchain.smith.models.orgs.OrgRetrievePermissionsParams
import com.langchain.smith.models.orgs.OrgRetrievePermissionsResponse
import com.langchain.smith.models.orgs.OrganizationPgSchemaSlim
import com.langchain.smith.services.blocking.orgs.CurrentService
import com.langchain.smith.services.blocking.orgs.CurrentServiceImpl
import com.langchain.smith.services.blocking.orgs.MemberService
import com.langchain.smith.services.blocking.orgs.MemberServiceImpl
import com.langchain.smith.services.blocking.orgs.PendingService
import com.langchain.smith.services.blocking.orgs.PendingServiceImpl
import com.langchain.smith.services.blocking.orgs.TtlSettingService
import com.langchain.smith.services.blocking.orgs.TtlSettingServiceImpl
import java.util.function.Consumer

class OrgServiceImpl internal constructor(private val clientOptions: ClientOptions) : OrgService {

    private val withRawResponse: OrgService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val current: CurrentService by lazy { CurrentServiceImpl(clientOptions) }

    private val pending: PendingService by lazy { PendingServiceImpl(clientOptions) }

    private val members: MemberService by lazy { MemberServiceImpl(clientOptions) }

    private val ttlSettings: TtlSettingService by lazy { TtlSettingServiceImpl(clientOptions) }

    override fun withRawResponse(): OrgService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OrgService =
        OrgServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun current(): CurrentService = current

    override fun pending(): PendingService = pending

    override fun members(): MemberService = members

    override fun ttlSettings(): TtlSettingService = ttlSettings

    override fun create(
        params: OrgCreateParams,
        requestOptions: RequestOptions,
    ): OrganizationPgSchemaSlim =
        // post /api/v1/orgs
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: OrgListParams,
        requestOptions: RequestOptions,
    ): List<OrganizationPgSchemaSlim> =
        // get /api/v1/orgs
        withRawResponse().list(params, requestOptions).parse()

    override fun retrievePermissions(
        params: OrgRetrievePermissionsParams,
        requestOptions: RequestOptions,
    ): List<OrgRetrievePermissionsResponse> =
        // get /api/v1/orgs/permissions
        withRawResponse().retrievePermissions(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrgService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val current: CurrentService.WithRawResponse by lazy {
            CurrentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val pending: PendingService.WithRawResponse by lazy {
            PendingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val members: MemberService.WithRawResponse by lazy {
            MemberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ttlSettings: TtlSettingService.WithRawResponse by lazy {
            TtlSettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OrgService.WithRawResponse =
            OrgServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun current(): CurrentService.WithRawResponse = current

        override fun pending(): PendingService.WithRawResponse = pending

        override fun members(): MemberService.WithRawResponse = members

        override fun ttlSettings(): TtlSettingService.WithRawResponse = ttlSettings

        private val createHandler: Handler<OrganizationPgSchemaSlim> =
            jsonHandler<OrganizationPgSchemaSlim>(clientOptions.jsonMapper)

        override fun create(
            params: OrgCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrganizationPgSchemaSlim> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<OrganizationPgSchemaSlim>> =
            jsonHandler<List<OrganizationPgSchemaSlim>>(clientOptions.jsonMapper)

        override fun list(
            params: OrgListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<OrganizationPgSchemaSlim>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val retrievePermissionsHandler: Handler<List<OrgRetrievePermissionsResponse>> =
            jsonHandler<List<OrgRetrievePermissionsResponse>>(clientOptions.jsonMapper)

        override fun retrievePermissions(
            params: OrgRetrievePermissionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<OrgRetrievePermissionsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "permissions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
