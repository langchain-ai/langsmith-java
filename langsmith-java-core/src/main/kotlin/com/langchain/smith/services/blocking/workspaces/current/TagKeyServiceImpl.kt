// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspaces.current

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
import com.langchain.smith.models.workspaces.current.tagkeys.TagKey
import com.langchain.smith.models.workspaces.current.tagkeys.TagKeyDeleteParams
import com.langchain.smith.models.workspaces.current.tagkeys.TagKeyDeleteResponse
import com.langchain.smith.models.workspaces.current.tagkeys.TagKeyRetrieveParams
import com.langchain.smith.models.workspaces.current.tagkeys.TagKeyRetrieveTagKeysParams
import com.langchain.smith.models.workspaces.current.tagkeys.TagKeyTagKeysParams
import com.langchain.smith.models.workspaces.current.tagkeys.TagKeyUpdateParams
import com.langchain.smith.services.blocking.workspaces.current.tagkeys.TagValueService
import com.langchain.smith.services.blocking.workspaces.current.tagkeys.TagValueServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TagKeyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TagKeyService {

    private val withRawResponse: TagKeyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val tagValues: TagValueService by lazy { TagValueServiceImpl(clientOptions) }

    override fun withRawResponse(): TagKeyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagKeyService =
        TagKeyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun tagValues(): TagValueService = tagValues

    override fun retrieve(params: TagKeyRetrieveParams, requestOptions: RequestOptions): TagKey =
        // get /api/v1/workspaces/current/tag-keys/{tag_key_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: TagKeyUpdateParams, requestOptions: RequestOptions): TagKey =
        // patch /api/v1/workspaces/current/tag-keys/{tag_key_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: TagKeyDeleteParams,
        requestOptions: RequestOptions,
    ): TagKeyDeleteResponse =
        // delete /api/v1/workspaces/current/tag-keys/{tag_key_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveTagKeys(
        params: TagKeyRetrieveTagKeysParams,
        requestOptions: RequestOptions,
    ): List<TagKey> =
        // get /api/v1/workspaces/current/tag-keys
        withRawResponse().retrieveTagKeys(params, requestOptions).parse()

    override fun tagKeys(params: TagKeyTagKeysParams, requestOptions: RequestOptions): TagKey =
        // post /api/v1/workspaces/current/tag-keys
        withRawResponse().tagKeys(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TagKeyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val tagValues: TagValueService.WithRawResponse by lazy {
            TagValueServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TagKeyService.WithRawResponse =
            TagKeyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun tagValues(): TagValueService.WithRawResponse = tagValues

        private val retrieveHandler: Handler<TagKey> = jsonHandler<TagKey>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TagKeyRetrieveParams,
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
            params: TagKeyUpdateParams,
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

        private val deleteHandler: Handler<TagKeyDeleteResponse> =
            jsonHandler<TagKeyDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: TagKeyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TagKeyDeleteResponse> {
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
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveTagKeysHandler: Handler<List<TagKey>> =
            jsonHandler<List<TagKey>>(clientOptions.jsonMapper)

        override fun retrieveTagKeys(
            params: TagKeyRetrieveTagKeysParams,
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
                    .use { retrieveTagKeysHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val tagKeysHandler: Handler<TagKey> = jsonHandler<TagKey>(clientOptions.jsonMapper)

        override fun tagKeys(
            params: TagKeyTagKeysParams,
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
                    .use { tagKeysHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
