// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspaces.current.tagkeys

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
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.workspaces.current.tagkeys.tagvalues.TagValue
import com.langchain.smith.models.workspaces.current.tagkeys.tagvalues.TagValueDeleteParams
import com.langchain.smith.models.workspaces.current.tagkeys.tagvalues.TagValueDeleteResponse
import com.langchain.smith.models.workspaces.current.tagkeys.tagvalues.TagValueRetrieveParams
import com.langchain.smith.models.workspaces.current.tagkeys.tagvalues.TagValueRetrieveTagValuesParams
import com.langchain.smith.models.workspaces.current.tagkeys.tagvalues.TagValueTagValuesParams
import com.langchain.smith.models.workspaces.current.tagkeys.tagvalues.TagValueUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TagValueServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TagValueServiceAsync {

    private val withRawResponse: TagValueServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TagValueServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagValueServiceAsync =
        TagValueServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: TagValueRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TagValue> =
        // get /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values/{tag_value_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TagValueUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TagValue> =
        // patch /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values/{tag_value_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TagValueDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TagValueDeleteResponse> =
        // delete /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values/{tag_value_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun retrieveTagValues(
        params: TagValueRetrieveTagValuesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TagValue>> =
        // get /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values
        withRawResponse().retrieveTagValues(params, requestOptions).thenApply { it.parse() }

    override fun tagValues(
        params: TagValueTagValuesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TagValue> =
        // post /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values
        withRawResponse().tagValues(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TagValueServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TagValueServiceAsync.WithRawResponse =
            TagValueServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<TagValue> =
            jsonHandler<TagValue>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TagValueRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagValue>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tagValueId", params.tagValueId().getOrNull())
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
                        "tag-values",
                        params._pathParam(1),
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

        private val updateHandler: Handler<TagValue> =
            jsonHandler<TagValue>(clientOptions.jsonMapper)

        override fun update(
            params: TagValueUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagValue>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tagValueId", params.tagValueId().getOrNull())
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
                        "tag-values",
                        params._pathParam(1),
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

        private val deleteHandler: Handler<TagValueDeleteResponse> =
            jsonHandler<TagValueDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: TagValueDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagValueDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tagValueId", params.tagValueId().getOrNull())
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
                        "tag-values",
                        params._pathParam(1),
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

        private val retrieveTagValuesHandler: Handler<List<TagValue>> =
            jsonHandler<List<TagValue>>(clientOptions.jsonMapper)

        override fun retrieveTagValues(
            params: TagValueRetrieveTagValuesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TagValue>>> {
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
                        "tag-values",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveTagValuesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val tagValuesHandler: Handler<TagValue> =
            jsonHandler<TagValue>(clientOptions.jsonMapper)

        override fun tagValues(
            params: TagValueTagValuesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagValue>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tagKeyId", params.tagKeyId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "workspaces",
                        "current",
                        "tag-keys",
                        params._pathParam(0),
                        "tag-values",
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
                            .use { tagValuesHandler.handle(it) }
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
