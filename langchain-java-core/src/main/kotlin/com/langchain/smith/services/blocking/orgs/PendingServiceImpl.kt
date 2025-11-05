// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs

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
import com.langchain.smith.models.orgs.OrganizationPgSchemaSlim
import com.langchain.smith.models.orgs.pending.Identity
import com.langchain.smith.models.orgs.pending.PendingClaimParams
import com.langchain.smith.models.orgs.pending.PendingDeleteParams
import com.langchain.smith.models.orgs.pending.PendingDeleteResponse
import com.langchain.smith.models.orgs.pending.PendingListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PendingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PendingService {

    private val withRawResponse: PendingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PendingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PendingService =
        PendingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: PendingListParams,
        requestOptions: RequestOptions,
    ): List<OrganizationPgSchemaSlim> =
        // get /api/v1/orgs/pending
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: PendingDeleteParams,
        requestOptions: RequestOptions,
    ): PendingDeleteResponse =
        // delete /api/v1/orgs/pending/{organization_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun claim(params: PendingClaimParams, requestOptions: RequestOptions): Identity =
        // post /api/v1/orgs/pending/{organization_id}/claim
        withRawResponse().claim(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PendingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PendingService.WithRawResponse =
            PendingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<OrganizationPgSchemaSlim>> =
            jsonHandler<List<OrganizationPgSchemaSlim>>(clientOptions.jsonMapper)

        override fun list(
            params: PendingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<OrganizationPgSchemaSlim>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "pending")
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

        private val deleteHandler: Handler<PendingDeleteResponse> =
            jsonHandler<PendingDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PendingDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("organizationId", params.organizationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "pending", params._pathParam(0))
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

        private val claimHandler: Handler<Identity> =
            jsonHandler<Identity>(clientOptions.jsonMapper)

        override fun claim(
            params: PendingClaimParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Identity> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("organizationId", params.organizationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "pending", params._pathParam(0), "claim")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { claimHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
