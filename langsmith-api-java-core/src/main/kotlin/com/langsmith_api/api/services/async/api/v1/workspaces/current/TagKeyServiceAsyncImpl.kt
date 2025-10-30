// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.workspaces.current

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
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKey
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyDeleteParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyDeleteResponse
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyRetrieveParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyRetrieveTagKeysParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyTagKeysParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyUpdateParams
import com.langsmith_api.api.services.async.api.v1.workspaces.current.tagkeys.TagValueServiceAsync
import com.langsmith_api.api.services.async.api.v1.workspaces.current.tagkeys.TagValueServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TagKeyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TagKeyServiceAsync {

    private val withRawResponse: TagKeyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val tagValues: TagValueServiceAsync by lazy { TagValueServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TagKeyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagKeyServiceAsync =
        TagKeyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun tagValues(): TagValueServiceAsync = tagValues

    override fun retrieve(
        params: TagKeyRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TagKey> =
        // get /api/v1/workspaces/current/tag-keys/{tag_key_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TagKeyUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TagKey> =
        // patch /api/v1/workspaces/current/tag-keys/{tag_key_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TagKeyDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TagKeyDeleteResponse> =
        // delete /api/v1/workspaces/current/tag-keys/{tag_key_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun retrieveTagKeys(
        params: TagKeyRetrieveTagKeysParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TagKey>> =
        // get /api/v1/workspaces/current/tag-keys
        withRawResponse().retrieveTagKeys(params, requestOptions).thenApply { it.parse() }

    override fun tagKeys(
        params: TagKeyTagKeysParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TagKey> =
        // post /api/v1/workspaces/current/tag-keys
        withRawResponse().tagKeys(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TagKeyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val tagValues: TagValueServiceAsync.WithRawResponse by lazy {
            TagValueServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TagKeyServiceAsync.WithRawResponse =
            TagKeyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun tagValues(): TagValueServiceAsync.WithRawResponse = tagValues

        private val retrieveHandler: Handler<TagKey> = jsonHandler<TagKey>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TagKeyRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagKey>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<TagKey> = jsonHandler<TagKey>(clientOptions.jsonMapper)

        override fun update(
            params: TagKeyUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagKey>> {
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

        private val deleteHandler: Handler<TagKeyDeleteResponse> =
            jsonHandler<TagKeyDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: TagKeyDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagKeyDeleteResponse>> {
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

        private val retrieveTagKeysHandler: Handler<List<TagKey>> =
            jsonHandler<List<TagKey>>(clientOptions.jsonMapper)

        override fun retrieveTagKeys(
            params: TagKeyRetrieveTagKeysParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TagKey>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "tag-keys")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveTagKeysHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val tagKeysHandler: Handler<TagKey> = jsonHandler<TagKey>(clientOptions.jsonMapper)

        override fun tagKeys(
            params: TagKeyTagKeysParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagKey>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "workspaces", "current", "tag-keys")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
