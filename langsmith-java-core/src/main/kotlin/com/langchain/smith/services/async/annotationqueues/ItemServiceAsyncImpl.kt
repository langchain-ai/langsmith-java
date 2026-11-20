// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.annotationqueues

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
import com.langchain.smith.core.prepareAsync
import com.langchain.smith.models.annotationqueues.items.AnnotationQueueItemKeyReviews
import com.langchain.smith.models.annotationqueues.items.ItemClearFinalParams
import com.langchain.smith.models.annotationqueues.items.ItemCreateParams
import com.langchain.smith.models.annotationqueues.items.ItemCreateResponse
import com.langchain.smith.models.annotationqueues.items.ItemCreateStatusParams
import com.langchain.smith.models.annotationqueues.items.ItemCreateStatusResponse
import com.langchain.smith.models.annotationqueues.items.ItemDeleteAllParams
import com.langchain.smith.models.annotationqueues.items.ItemDeleteAllResponse
import com.langchain.smith.models.annotationqueues.items.ItemListPageAsync
import com.langchain.smith.models.annotationqueues.items.ItemListPageResponse
import com.langchain.smith.models.annotationqueues.items.ItemListParams
import com.langchain.smith.models.annotationqueues.items.ItemRetrieveCountParams
import com.langchain.smith.models.annotationqueues.items.ItemRetrieveCountResponse
import com.langchain.smith.models.annotationqueues.items.ItemRetrievePlacementParams
import com.langchain.smith.models.annotationqueues.items.ItemRetrievePlacementResponse
import com.langchain.smith.models.annotationqueues.items.ItemRetrieveReviewsParams
import com.langchain.smith.models.annotationqueues.items.ItemRetrieveReviewsResponse
import com.langchain.smith.models.annotationqueues.items.ItemSetFinalParams
import com.langchain.smith.models.annotationqueues.items.ItemSetFinalResponse
import com.langchain.smith.models.annotationqueues.items.ItemSetReviewParams
import com.langchain.smith.models.annotationqueues.items.ItemUpdateParams
import com.langchain.smith.models.annotationqueues.items.ItemUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ItemServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ItemServiceAsync {

    private val withRawResponse: ItemServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ItemServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemServiceAsync =
        ItemServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ItemCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ItemCreateResponse> =
        // post /api/v1/platform/annotation-queues/{queue_id}/items
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ItemUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ItemUpdateResponse> =
        // patch /api/v1/platform/annotation-queues/{queue_id}/items/{item_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ItemListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ItemListPageAsync> =
        // get /api/v1/platform/annotation-queues/{queue_id}/items
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun clearFinal(
        params: ItemClearFinalParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /api/v1/platform/annotation-queues/{queue_id}/items/{item_id}/finals/{key}
        withRawResponse().clearFinal(params, requestOptions).thenAccept {}

    override fun createStatus(
        params: ItemCreateStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ItemCreateStatusResponse> =
        // post /api/v1/platform/annotation-queues/items/{queue_item_id}/status
        withRawResponse().createStatus(params, requestOptions).thenApply { it.parse() }

    override fun deleteAll(
        params: ItemDeleteAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ItemDeleteAllResponse> =
        // post /api/v1/platform/annotation-queues/{queue_id}/items/delete
        withRawResponse().deleteAll(params, requestOptions).thenApply { it.parse() }

    override fun retrieveCount(
        params: ItemRetrieveCountParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ItemRetrieveCountResponse> =
        // get /api/v1/platform/annotation-queues/{queue_id}/items/count
        withRawResponse().retrieveCount(params, requestOptions).thenApply { it.parse() }

    override fun retrievePlacement(
        params: ItemRetrievePlacementParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ItemRetrievePlacementResponse> =
        // get /api/v1/platform/annotation-queues/{queue_id}/items/{item_id}/placement
        withRawResponse().retrievePlacement(params, requestOptions).thenApply { it.parse() }

    override fun retrieveReviews(
        params: ItemRetrieveReviewsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ItemRetrieveReviewsResponse> =
        // get /api/v1/platform/annotation-queues/{queue_id}/items/{item_id}/reviews
        withRawResponse().retrieveReviews(params, requestOptions).thenApply { it.parse() }

    override fun setFinal(
        params: ItemSetFinalParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ItemSetFinalResponse> =
        // put /api/v1/platform/annotation-queues/{queue_id}/items/{item_id}/finals/{key}
        withRawResponse().setFinal(params, requestOptions).thenApply { it.parse() }

    override fun setReview(
        params: ItemSetReviewParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnnotationQueueItemKeyReviews> =
        // put /api/v1/platform/annotation-queues/{queue_id}/items/{item_id}/reviews/{key}
        withRawResponse().setReview(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ItemServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ItemServiceAsync.WithRawResponse =
            ItemServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ItemCreateResponse> =
            jsonHandler<ItemCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ItemCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ItemCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueId", params.queueId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "platform",
                        "annotation-queues",
                        params._pathParam(0),
                        "items",
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
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<ItemUpdateResponse> =
            jsonHandler<ItemUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ItemUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ItemUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("itemId", params.itemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "platform",
                        "annotation-queues",
                        params._pathParam(0),
                        "items",
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

        private val listHandler: Handler<ItemListPageResponse> =
            jsonHandler<ItemListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ItemListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ItemListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueId", params.queueId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "platform",
                        "annotation-queues",
                        params._pathParam(0),
                        "items",
                    )
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
                                    it.validate()
                                }
                            }
                            .let {
                                ItemListPageAsync.builder()
                                    .service(ItemServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val clearFinalHandler: Handler<Void?> = emptyHandler()

        override fun clearFinal(
            params: ItemClearFinalParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("key", params.key().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "platform",
                        "annotation-queues",
                        params._pathParam(0),
                        "items",
                        params._pathParam(1),
                        "finals",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { clearFinalHandler.handle(it) }
                    }
                }
        }

        private val createStatusHandler: Handler<ItemCreateStatusResponse> =
            jsonHandler<ItemCreateStatusResponse>(clientOptions.jsonMapper)

        override fun createStatus(
            params: ItemCreateStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ItemCreateStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueItemId", params.queueItemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "platform",
                        "annotation-queues",
                        "items",
                        params._pathParam(0),
                        "status",
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
                            .use { createStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteAllHandler: Handler<ItemDeleteAllResponse> =
            jsonHandler<ItemDeleteAllResponse>(clientOptions.jsonMapper)

        override fun deleteAll(
            params: ItemDeleteAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ItemDeleteAllResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueId", params.queueId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "platform",
                        "annotation-queues",
                        params._pathParam(0),
                        "items",
                        "delete",
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
                            .use { deleteAllHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveCountHandler: Handler<ItemRetrieveCountResponse> =
            jsonHandler<ItemRetrieveCountResponse>(clientOptions.jsonMapper)

        override fun retrieveCount(
            params: ItemRetrieveCountParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ItemRetrieveCountResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueId", params.queueId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "platform",
                        "annotation-queues",
                        params._pathParam(0),
                        "items",
                        "count",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveCountHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrievePlacementHandler: Handler<ItemRetrievePlacementResponse> =
            jsonHandler<ItemRetrievePlacementResponse>(clientOptions.jsonMapper)

        override fun retrievePlacement(
            params: ItemRetrievePlacementParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ItemRetrievePlacementResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("itemId", params.itemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "platform",
                        "annotation-queues",
                        params._pathParam(0),
                        "items",
                        params._pathParam(1),
                        "placement",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrievePlacementHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveReviewsHandler: Handler<ItemRetrieveReviewsResponse> =
            jsonHandler<ItemRetrieveReviewsResponse>(clientOptions.jsonMapper)

        override fun retrieveReviews(
            params: ItemRetrieveReviewsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ItemRetrieveReviewsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("itemId", params.itemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "platform",
                        "annotation-queues",
                        params._pathParam(0),
                        "items",
                        params._pathParam(1),
                        "reviews",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveReviewsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val setFinalHandler: Handler<ItemSetFinalResponse> =
            jsonHandler<ItemSetFinalResponse>(clientOptions.jsonMapper)

        override fun setFinal(
            params: ItemSetFinalParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ItemSetFinalResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("key", params.key().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "platform",
                        "annotation-queues",
                        params._pathParam(0),
                        "items",
                        params._pathParam(1),
                        "finals",
                        params._pathParam(2),
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
                            .use { setFinalHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val setReviewHandler: Handler<AnnotationQueueItemKeyReviews> =
            jsonHandler<AnnotationQueueItemKeyReviews>(clientOptions.jsonMapper)

        override fun setReview(
            params: ItemSetReviewParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AnnotationQueueItemKeyReviews>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("key", params.key().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "v1",
                        "platform",
                        "annotation-queues",
                        params._pathParam(0),
                        "items",
                        params._pathParam(1),
                        "reviews",
                        params._pathParam(2),
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
                            .use { setReviewHandler.handle(it) }
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
