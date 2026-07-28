// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.annotationqueues

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.annotationqueues.items.ItemCreateParams
import com.langchain.smith.models.annotationqueues.items.ItemCreateResponse
import com.langchain.smith.models.annotationqueues.items.ItemCreateStatusParams
import com.langchain.smith.models.annotationqueues.items.ItemCreateStatusResponse
import com.langchain.smith.models.annotationqueues.items.ItemDeleteAllParams
import com.langchain.smith.models.annotationqueues.items.ItemDeleteAllResponse
import com.langchain.smith.models.annotationqueues.items.ItemListPageAsync
import com.langchain.smith.models.annotationqueues.items.ItemListParams
import com.langchain.smith.models.annotationqueues.items.ItemRetrieveCountParams
import com.langchain.smith.models.annotationqueues.items.ItemRetrieveCountResponse
import com.langchain.smith.models.annotationqueues.items.ItemRetrievePlacementParams
import com.langchain.smith.models.annotationqueues.items.ItemRetrievePlacementResponse
import com.langchain.smith.models.annotationqueues.items.ItemUpdateParams
import com.langchain.smith.models.annotationqueues.items.ItemUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemServiceAsync

    /**
     * Add RUN or THREAD items to a single annotation queue. RUN items require run_id unless they
     * are created from a suggested example. THREAD items require thread_id and session_id.
     */
    fun create(queueId: String): CompletableFuture<ItemCreateResponse> =
        create(queueId, ItemCreateParams.none())

    /** @see create */
    fun create(
        queueId: String,
        params: ItemCreateParams = ItemCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemCreateResponse> =
        create(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see create */
    fun create(
        queueId: String,
        params: ItemCreateParams = ItemCreateParams.none(),
    ): CompletableFuture<ItemCreateResponse> = create(queueId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemCreateResponse>

    /** @see create */
    fun create(params: ItemCreateParams): CompletableFuture<ItemCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        queueId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ItemCreateResponse> =
        create(queueId, ItemCreateParams.none(), requestOptions)

    /**
     * Partially update mutable timestamps (added_at, last_reviewed_time) for a RUN or THREAD
     * annotation queue item. Omit a field, or pass JSON null, to leave it unchanged.
     */
    fun update(itemId: String, params: ItemUpdateParams): CompletableFuture<ItemUpdateResponse> =
        update(itemId, params, RequestOptions.none())

    /** @see update */
    fun update(
        itemId: String,
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemUpdateResponse> =
        update(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see update */
    fun update(params: ItemUpdateParams): CompletableFuture<ItemUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemUpdateResponse>

    /**
     * List RUN and THREAD items in a single annotation queue for one review status section, with
     * opaque cursor pagination. Optional item_type=RUN|THREAD filters the page. direction=backward
     * returns items before the supplied cursor. The response contains item metadata only, not
     * expanded run or thread payloads. status=archived returns items whose queue review
     * requirements have been satisfied, not merely items the caller personally marked completed.
     */
    fun list(queueId: String, params: ItemListParams): CompletableFuture<ItemListPageAsync> =
        list(queueId, params, RequestOptions.none())

    /** @see list */
    fun list(
        queueId: String,
        params: ItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemListPageAsync> =
        list(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see list */
    fun list(params: ItemListParams): CompletableFuture<ItemListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemListPageAsync>

    /**
     * Log the caller's reviewer status for a RUN or THREAD annotation queue item. A null status
     * re-shows the item for this reviewer.
     */
    fun createStatus(queueItemId: String): CompletableFuture<ItemCreateStatusResponse> =
        createStatus(queueItemId, ItemCreateStatusParams.none())

    /** @see createStatus */
    fun createStatus(
        queueItemId: String,
        params: ItemCreateStatusParams = ItemCreateStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemCreateStatusResponse> =
        createStatus(params.toBuilder().queueItemId(queueItemId).build(), requestOptions)

    /** @see createStatus */
    fun createStatus(
        queueItemId: String,
        params: ItemCreateStatusParams = ItemCreateStatusParams.none(),
    ): CompletableFuture<ItemCreateStatusResponse> =
        createStatus(queueItemId, params, RequestOptions.none())

    /** @see createStatus */
    fun createStatus(
        params: ItemCreateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemCreateStatusResponse>

    /** @see createStatus */
    fun createStatus(params: ItemCreateStatusParams): CompletableFuture<ItemCreateStatusResponse> =
        createStatus(params, RequestOptions.none())

    /** @see createStatus */
    fun createStatus(
        queueItemId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ItemCreateStatusResponse> =
        createStatus(queueItemId, ItemCreateStatusParams.none(), requestOptions)

    /** Remove RUN or THREAD items from a single annotation queue by item ID. */
    fun deleteAll(queueId: String): CompletableFuture<ItemDeleteAllResponse> =
        deleteAll(queueId, ItemDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        queueId: String,
        params: ItemDeleteAllParams = ItemDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemDeleteAllResponse> =
        deleteAll(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        queueId: String,
        params: ItemDeleteAllParams = ItemDeleteAllParams.none(),
    ): CompletableFuture<ItemDeleteAllResponse> = deleteAll(queueId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: ItemDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemDeleteAllResponse>

    /** @see deleteAll */
    fun deleteAll(params: ItemDeleteAllParams): CompletableFuture<ItemDeleteAllResponse> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        queueId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ItemDeleteAllResponse> =
        deleteAll(queueId, ItemDeleteAllParams.none(), requestOptions)

    /**
     * Returns the number of annotation queue items for the requested reviewer-specific or archived
     * bucket.
     */
    fun retrieveCount(
        queueId: String,
        params: ItemRetrieveCountParams,
    ): CompletableFuture<ItemRetrieveCountResponse> =
        retrieveCount(queueId, params, RequestOptions.none())

    /** @see retrieveCount */
    fun retrieveCount(
        queueId: String,
        params: ItemRetrieveCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemRetrieveCountResponse> =
        retrieveCount(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see retrieveCount */
    fun retrieveCount(
        params: ItemRetrieveCountParams
    ): CompletableFuture<ItemRetrieveCountResponse> = retrieveCount(params, RequestOptions.none())

    /** @see retrieveCount */
    fun retrieveCount(
        params: ItemRetrieveCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemRetrieveCountResponse>

    /**
     * Resolve a RUN or THREAD item to its current review section and zero-based position for deep
     * linking.
     */
    fun retrievePlacement(
        itemId: String,
        params: ItemRetrievePlacementParams,
    ): CompletableFuture<ItemRetrievePlacementResponse> =
        retrievePlacement(itemId, params, RequestOptions.none())

    /** @see retrievePlacement */
    fun retrievePlacement(
        itemId: String,
        params: ItemRetrievePlacementParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemRetrievePlacementResponse> =
        retrievePlacement(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see retrievePlacement */
    fun retrievePlacement(
        params: ItemRetrievePlacementParams
    ): CompletableFuture<ItemRetrievePlacementResponse> =
        retrievePlacement(params, RequestOptions.none())

    /** @see retrievePlacement */
    fun retrievePlacement(
        params: ItemRetrievePlacementParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemRetrievePlacementResponse>

    /** A view of [ItemServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues/{queue_id}/items`, but is
         * otherwise the same as [ItemServiceAsync.create].
         */
        fun create(queueId: String): CompletableFuture<HttpResponseFor<ItemCreateResponse>> =
            create(queueId, ItemCreateParams.none())

        /** @see create */
        fun create(
            queueId: String,
            params: ItemCreateParams = ItemCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemCreateResponse>> =
            create(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see create */
        fun create(
            queueId: String,
            params: ItemCreateParams = ItemCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<ItemCreateResponse>> =
            create(queueId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemCreateResponse>>

        /** @see create */
        fun create(
            params: ItemCreateParams
        ): CompletableFuture<HttpResponseFor<ItemCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            queueId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ItemCreateResponse>> =
            create(queueId, ItemCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/annotation-queues/{queue_id}/items/{item_id}`, but is otherwise the same as
         * [ItemServiceAsync.update].
         */
        fun update(
            itemId: String,
            params: ItemUpdateParams,
        ): CompletableFuture<HttpResponseFor<ItemUpdateResponse>> =
            update(itemId, params, RequestOptions.none())

        /** @see update */
        fun update(
            itemId: String,
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemUpdateResponse>> =
            update(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ItemUpdateParams
        ): CompletableFuture<HttpResponseFor<ItemUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}/items`, but is
         * otherwise the same as [ItemServiceAsync.list].
         */
        fun list(
            queueId: String,
            params: ItemListParams,
        ): CompletableFuture<HttpResponseFor<ItemListPageAsync>> =
            list(queueId, params, RequestOptions.none())

        /** @see list */
        fun list(
            queueId: String,
            params: ItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemListPageAsync>> =
            list(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see list */
        fun list(params: ItemListParams): CompletableFuture<HttpResponseFor<ItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemListPageAsync>>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/annotation-queues/items/{queue_item_id}/status`, but is otherwise the same as
         * [ItemServiceAsync.createStatus].
         */
        fun createStatus(
            queueItemId: String
        ): CompletableFuture<HttpResponseFor<ItemCreateStatusResponse>> =
            createStatus(queueItemId, ItemCreateStatusParams.none())

        /** @see createStatus */
        fun createStatus(
            queueItemId: String,
            params: ItemCreateStatusParams = ItemCreateStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemCreateStatusResponse>> =
            createStatus(params.toBuilder().queueItemId(queueItemId).build(), requestOptions)

        /** @see createStatus */
        fun createStatus(
            queueItemId: String,
            params: ItemCreateStatusParams = ItemCreateStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<ItemCreateStatusResponse>> =
            createStatus(queueItemId, params, RequestOptions.none())

        /** @see createStatus */
        fun createStatus(
            params: ItemCreateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemCreateStatusResponse>>

        /** @see createStatus */
        fun createStatus(
            params: ItemCreateStatusParams
        ): CompletableFuture<HttpResponseFor<ItemCreateStatusResponse>> =
            createStatus(params, RequestOptions.none())

        /** @see createStatus */
        fun createStatus(
            queueItemId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ItemCreateStatusResponse>> =
            createStatus(queueItemId, ItemCreateStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues/{queue_id}/items/delete`,
         * but is otherwise the same as [ItemServiceAsync.deleteAll].
         */
        fun deleteAll(queueId: String): CompletableFuture<HttpResponseFor<ItemDeleteAllResponse>> =
            deleteAll(queueId, ItemDeleteAllParams.none())

        /** @see deleteAll */
        fun deleteAll(
            queueId: String,
            params: ItemDeleteAllParams = ItemDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemDeleteAllResponse>> =
            deleteAll(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see deleteAll */
        fun deleteAll(
            queueId: String,
            params: ItemDeleteAllParams = ItemDeleteAllParams.none(),
        ): CompletableFuture<HttpResponseFor<ItemDeleteAllResponse>> =
            deleteAll(queueId, params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            params: ItemDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemDeleteAllResponse>>

        /** @see deleteAll */
        fun deleteAll(
            params: ItemDeleteAllParams
        ): CompletableFuture<HttpResponseFor<ItemDeleteAllResponse>> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            queueId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ItemDeleteAllResponse>> =
            deleteAll(queueId, ItemDeleteAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}/items/count`,
         * but is otherwise the same as [ItemServiceAsync.retrieveCount].
         */
        fun retrieveCount(
            queueId: String,
            params: ItemRetrieveCountParams,
        ): CompletableFuture<HttpResponseFor<ItemRetrieveCountResponse>> =
            retrieveCount(queueId, params, RequestOptions.none())

        /** @see retrieveCount */
        fun retrieveCount(
            queueId: String,
            params: ItemRetrieveCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemRetrieveCountResponse>> =
            retrieveCount(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see retrieveCount */
        fun retrieveCount(
            params: ItemRetrieveCountParams
        ): CompletableFuture<HttpResponseFor<ItemRetrieveCountResponse>> =
            retrieveCount(params, RequestOptions.none())

        /** @see retrieveCount */
        fun retrieveCount(
            params: ItemRetrieveCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemRetrieveCountResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/annotation-queues/{queue_id}/items/{item_id}/placement`, but is otherwise the
         * same as [ItemServiceAsync.retrievePlacement].
         */
        fun retrievePlacement(
            itemId: String,
            params: ItemRetrievePlacementParams,
        ): CompletableFuture<HttpResponseFor<ItemRetrievePlacementResponse>> =
            retrievePlacement(itemId, params, RequestOptions.none())

        /** @see retrievePlacement */
        fun retrievePlacement(
            itemId: String,
            params: ItemRetrievePlacementParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemRetrievePlacementResponse>> =
            retrievePlacement(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see retrievePlacement */
        fun retrievePlacement(
            params: ItemRetrievePlacementParams
        ): CompletableFuture<HttpResponseFor<ItemRetrievePlacementResponse>> =
            retrievePlacement(params, RequestOptions.none())

        /** @see retrievePlacement */
        fun retrievePlacement(
            params: ItemRetrievePlacementParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemRetrievePlacementResponse>>
    }
}
