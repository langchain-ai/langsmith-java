// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs.current.members

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
import com.langchain.smith.models.orgs.current.members.pending.OrgPendingIdentity
import com.langchain.smith.models.orgs.current.members.pending.PendingDeleteAllParams
import com.langchain.smith.models.orgs.current.members.pending.PendingDeleteAllResponse
import com.langchain.smith.models.orgs.current.members.pending.PendingListParams
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
    ): List<OrgPendingIdentity> =
        // get /api/v1/orgs/current/members/pending
        withRawResponse().list(params, requestOptions).parse()

    override fun deleteAll(
        params: PendingDeleteAllParams,
        requestOptions: RequestOptions,
    ): PendingDeleteAllResponse =
        // delete /api/v1/orgs/current/members/{identity_id}/pending
        withRawResponse().deleteAll(params, requestOptions).parse()

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

        private val listHandler: Handler<List<OrgPendingIdentity>> =
            jsonHandler<List<OrgPendingIdentity>>(clientOptions.jsonMapper)

        override fun list(
            params: PendingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<OrgPendingIdentity>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "orgs", "current", "members", "pending")
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

        private val deleteAllHandler: Handler<PendingDeleteAllResponse> =
            jsonHandler<PendingDeleteAllResponse>(clientOptions.jsonMapper)

        override fun deleteAll(
            params: PendingDeleteAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingDeleteAllResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("identityId", params.identityId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "orgs",
                        "current",
                        "members",
                        params._pathParam(0),
                        "pending",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
