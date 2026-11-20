// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspacetags

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.handlers.emptyHandler
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
import com.langchain.smith.models.workspacetags.keys.KeyCreateParams
import com.langchain.smith.models.workspacetags.keys.KeyDeleteParams
import com.langchain.smith.models.workspacetags.keys.KeyListParams
import com.langchain.smith.models.workspacetags.keys.KeyRetrieveParams
import com.langchain.smith.models.workspacetags.keys.KeyUpdateParams
import com.langchain.smith.models.workspacetags.keys.TagKey
import com.langchain.smith.services.blocking.workspacetags.keys.ValueService
import com.langchain.smith.services.blocking.workspacetags.keys.ValueServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class KeyServiceImpl internal constructor(private val clientOptions: ClientOptions) : KeyService {

    private val withRawResponse: KeyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val values: ValueService by lazy { ValueServiceImpl(clientOptions) }

    override fun withRawResponse(): KeyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): KeyService =
        KeyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun values(): ValueService = values

    override fun create(params: KeyCreateParams, requestOptions: RequestOptions): TagKey =
        // post /api/v1/workspaces/current/tag-keys
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: KeyRetrieveParams, requestOptions: RequestOptions): TagKey =
        // get /api/v1/workspaces/current/tag-keys/{tag_key_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: KeyUpdateParams, requestOptions: RequestOptions): TagKey =
        // patch /api/v1/workspaces/current/tag-keys/{tag_key_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: KeyListParams, requestOptions: RequestOptions): List<TagKey> =
        // get /api/v1/workspaces/current/tag-keys
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: KeyDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v1/workspaces/current/tag-keys/{tag_key_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        KeyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val values: ValueService.WithRawResponse by lazy {
            ValueServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): KeyService.WithRawResponse =
            KeyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun values(): ValueService.WithRawResponse = values

        private val createHandler: Handler<TagKey> = jsonHandler<TagKey>(clientOptions.jsonMapper)

        override fun create(
            params: KeyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TagKey> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "tag-keys")
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

        private val retrieveHandler: Handler<TagKey> = jsonHandler<TagKey>(clientOptions.jsonMapper)

        override fun retrieve(
            params: KeyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TagKey> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tagKeyId", params.tagKeyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "workspaces",
                        "current",
                        "tag-keys",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<TagKey> = jsonHandler<TagKey>(clientOptions.jsonMapper)

        override fun update(
            params: KeyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TagKey> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tagKeyId", params.tagKeyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "workspaces",
                        "current",
                        "tag-keys",
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

        private val listHandler: Handler<List<TagKey>> =
            jsonHandler<List<TagKey>>(clientOptions.jsonMapper)

        override fun list(
            params: KeyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TagKey>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "tag-keys")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: KeyDeleteParams, requestOptions: RequestOptions): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tagKeyId", params.tagKeyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "workspaces",
                        "current",
                        "tag-keys",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
