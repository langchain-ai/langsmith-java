// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.annotationqueues

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.annotationqueues.items.ItemCreateParams
import com.langchain.smith.models.annotationqueues.items.ItemCreateResponse
import com.langchain.smith.models.annotationqueues.items.ItemCreateStatusParams
import com.langchain.smith.models.annotationqueues.items.ItemCreateStatusResponse
import com.langchain.smith.models.annotationqueues.items.ItemDeleteAllParams
import com.langchain.smith.models.annotationqueues.items.ItemDeleteAllResponse
import com.langchain.smith.models.annotationqueues.items.ItemListPage
import com.langchain.smith.models.annotationqueues.items.ItemListParams
import com.langchain.smith.models.annotationqueues.items.ItemRetrieveCountParams
import com.langchain.smith.models.annotationqueues.items.ItemRetrieveCountResponse
import com.langchain.smith.models.annotationqueues.items.ItemRetrievePlacementParams
import com.langchain.smith.models.annotationqueues.items.ItemRetrievePlacementResponse
import com.langchain.smith.models.annotationqueues.items.ItemUpdateParams
import com.langchain.smith.models.annotationqueues.items.ItemUpdateResponse
import java.util.function.Consumer

interface ItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemService

    /**
     * Add RUN or THREAD items to a single annotation queue. RUN items require run_id unless they
     * are created from a suggested example. THREAD items require thread_id and session_id.
     */
    fun create(queueId: String): ItemCreateResponse = create(queueId, ItemCreateParams.none())

    /** @see create */
    fun create(
        queueId: String,
        params: ItemCreateParams = ItemCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemCreateResponse = create(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see create */
    fun create(
        queueId: String,
        params: ItemCreateParams = ItemCreateParams.none(),
    ): ItemCreateResponse = create(queueId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemCreateResponse

    /** @see create */
    fun create(params: ItemCreateParams): ItemCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(queueId: String, requestOptions: RequestOptions): ItemCreateResponse =
        create(queueId, ItemCreateParams.none(), requestOptions)

    /**
     * Partially update mutable timestamps (added_at, last_reviewed_time) for a RUN or THREAD
     * annotation queue item. Omit a field, or pass JSON null, to leave it unchanged.
     */
    fun update(itemId: String, params: ItemUpdateParams): ItemUpdateResponse =
        update(itemId, params, RequestOptions.none())

    /** @see update */
    fun update(
        itemId: String,
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemUpdateResponse = update(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see update */
    fun update(params: ItemUpdateParams): ItemUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemUpdateResponse

    /**
     * List RUN and THREAD items in a single annotation queue for one review status section, with
     * opaque cursor pagination. Optional item_type=RUN|THREAD filters the page. direction=backward
     * returns items before the supplied cursor. The response contains item metadata only, not
     * expanded run or thread payloads. status=archived returns items whose queue review
     * requirements have been satisfied, not merely items the caller personally marked completed.
     */
    fun list(queueId: String, params: ItemListParams): ItemListPage =
        list(queueId, params, RequestOptions.none())

    /** @see list */
    fun list(
        queueId: String,
        params: ItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemListPage = list(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see list */
    fun list(params: ItemListParams): ItemListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemListPage

    /**
     * Log the caller's reviewer status for a RUN or THREAD annotation queue item. A null status
     * re-shows the item for this reviewer.
     */
    fun createStatus(queueItemId: String): ItemCreateStatusResponse =
        createStatus(queueItemId, ItemCreateStatusParams.none())

    /** @see createStatus */
    fun createStatus(
        queueItemId: String,
        params: ItemCreateStatusParams = ItemCreateStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemCreateStatusResponse =
        createStatus(params.toBuilder().queueItemId(queueItemId).build(), requestOptions)

    /** @see createStatus */
    fun createStatus(
        queueItemId: String,
        params: ItemCreateStatusParams = ItemCreateStatusParams.none(),
    ): ItemCreateStatusResponse = createStatus(queueItemId, params, RequestOptions.none())

    /** @see createStatus */
    fun createStatus(
        params: ItemCreateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemCreateStatusResponse

    /** @see createStatus */
    fun createStatus(params: ItemCreateStatusParams): ItemCreateStatusResponse =
        createStatus(params, RequestOptions.none())

    /** @see createStatus */
    fun createStatus(
        queueItemId: String,
        requestOptions: RequestOptions,
    ): ItemCreateStatusResponse =
        createStatus(queueItemId, ItemCreateStatusParams.none(), requestOptions)

    /** Remove RUN or THREAD items from a single annotation queue by item ID. */
    fun deleteAll(queueId: String): ItemDeleteAllResponse =
        deleteAll(queueId, ItemDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        queueId: String,
        params: ItemDeleteAllParams = ItemDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemDeleteAllResponse =
        deleteAll(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        queueId: String,
        params: ItemDeleteAllParams = ItemDeleteAllParams.none(),
    ): ItemDeleteAllResponse = deleteAll(queueId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: ItemDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemDeleteAllResponse

    /** @see deleteAll */
    fun deleteAll(params: ItemDeleteAllParams): ItemDeleteAllResponse =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(queueId: String, requestOptions: RequestOptions): ItemDeleteAllResponse =
        deleteAll(queueId, ItemDeleteAllParams.none(), requestOptions)

    /**
     * Returns the number of annotation queue items for the requested reviewer-specific or archived
     * bucket.
     */
    fun retrieveCount(queueId: String, params: ItemRetrieveCountParams): ItemRetrieveCountResponse =
        retrieveCount(queueId, params, RequestOptions.none())

    /** @see retrieveCount */
    fun retrieveCount(
        queueId: String,
        params: ItemRetrieveCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemRetrieveCountResponse =
        retrieveCount(params.toBuilder().queueId(queueId).build(), requestOptions)

    /** @see retrieveCount */
    fun retrieveCount(params: ItemRetrieveCountParams): ItemRetrieveCountResponse =
        retrieveCount(params, RequestOptions.none())

    /** @see retrieveCount */
    fun retrieveCount(
        params: ItemRetrieveCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemRetrieveCountResponse

    /**
     * Resolve a RUN or THREAD item to its current review section and zero-based position for deep
     * linking.
     */
    fun retrievePlacement(
        itemId: String,
        params: ItemRetrievePlacementParams,
    ): ItemRetrievePlacementResponse = retrievePlacement(itemId, params, RequestOptions.none())

    /** @see retrievePlacement */
    fun retrievePlacement(
        itemId: String,
        params: ItemRetrievePlacementParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemRetrievePlacementResponse =
        retrievePlacement(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see retrievePlacement */
    fun retrievePlacement(params: ItemRetrievePlacementParams): ItemRetrievePlacementResponse =
        retrievePlacement(params, RequestOptions.none())

    /** @see retrievePlacement */
    fun retrievePlacement(
        params: ItemRetrievePlacementParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemRetrievePlacementResponse

    /** A view of [ItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues/{queue_id}/items`, but is
         * otherwise the same as [ItemService.create].
         */
        @MustBeClosed
        fun create(queueId: String): HttpResponseFor<ItemCreateResponse> =
            create(queueId, ItemCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            queueId: String,
            params: ItemCreateParams = ItemCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemCreateResponse> =
            create(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            queueId: String,
            params: ItemCreateParams = ItemCreateParams.none(),
        ): HttpResponseFor<ItemCreateResponse> = create(queueId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(params: ItemCreateParams): HttpResponseFor<ItemCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            queueId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ItemCreateResponse> =
            create(queueId, ItemCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/annotation-queues/{queue_id}/items/{item_id}`, but is otherwise the same as
         * [ItemService.update].
         */
        @MustBeClosed
        fun update(itemId: String, params: ItemUpdateParams): HttpResponseFor<ItemUpdateResponse> =
            update(itemId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            itemId: String,
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemUpdateResponse> =
            update(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ItemUpdateParams): HttpResponseFor<ItemUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}/items`, but is
         * otherwise the same as [ItemService.list].
         */
        @MustBeClosed
        fun list(queueId: String, params: ItemListParams): HttpResponseFor<ItemListPage> =
            list(queueId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            queueId: String,
            params: ItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemListPage> =
            list(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: ItemListParams): HttpResponseFor<ItemListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemListPage>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/annotation-queues/items/{queue_item_id}/status`, but is otherwise the same as
         * [ItemService.createStatus].
         */
        @MustBeClosed
        fun createStatus(queueItemId: String): HttpResponseFor<ItemCreateStatusResponse> =
            createStatus(queueItemId, ItemCreateStatusParams.none())

        /** @see createStatus */
        @MustBeClosed
        fun createStatus(
            queueItemId: String,
            params: ItemCreateStatusParams = ItemCreateStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemCreateStatusResponse> =
            createStatus(params.toBuilder().queueItemId(queueItemId).build(), requestOptions)

        /** @see createStatus */
        @MustBeClosed
        fun createStatus(
            queueItemId: String,
            params: ItemCreateStatusParams = ItemCreateStatusParams.none(),
        ): HttpResponseFor<ItemCreateStatusResponse> =
            createStatus(queueItemId, params, RequestOptions.none())

        /** @see createStatus */
        @MustBeClosed
        fun createStatus(
            params: ItemCreateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemCreateStatusResponse>

        /** @see createStatus */
        @MustBeClosed
        fun createStatus(
            params: ItemCreateStatusParams
        ): HttpResponseFor<ItemCreateStatusResponse> = createStatus(params, RequestOptions.none())

        /** @see createStatus */
        @MustBeClosed
        fun createStatus(
            queueItemId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ItemCreateStatusResponse> =
            createStatus(queueItemId, ItemCreateStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/annotation-queues/{queue_id}/items/delete`,
         * but is otherwise the same as [ItemService.deleteAll].
         */
        @MustBeClosed
        fun deleteAll(queueId: String): HttpResponseFor<ItemDeleteAllResponse> =
            deleteAll(queueId, ItemDeleteAllParams.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            queueId: String,
            params: ItemDeleteAllParams = ItemDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemDeleteAllResponse> =
            deleteAll(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            queueId: String,
            params: ItemDeleteAllParams = ItemDeleteAllParams.none(),
        ): HttpResponseFor<ItemDeleteAllResponse> =
            deleteAll(queueId, params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: ItemDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemDeleteAllResponse>

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(params: ItemDeleteAllParams): HttpResponseFor<ItemDeleteAllResponse> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            queueId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ItemDeleteAllResponse> =
            deleteAll(queueId, ItemDeleteAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/annotation-queues/{queue_id}/items/count`,
         * but is otherwise the same as [ItemService.retrieveCount].
         */
        @MustBeClosed
        fun retrieveCount(
            queueId: String,
            params: ItemRetrieveCountParams,
        ): HttpResponseFor<ItemRetrieveCountResponse> =
            retrieveCount(queueId, params, RequestOptions.none())

        /** @see retrieveCount */
        @MustBeClosed
        fun retrieveCount(
            queueId: String,
            params: ItemRetrieveCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemRetrieveCountResponse> =
            retrieveCount(params.toBuilder().queueId(queueId).build(), requestOptions)

        /** @see retrieveCount */
        @MustBeClosed
        fun retrieveCount(
            params: ItemRetrieveCountParams
        ): HttpResponseFor<ItemRetrieveCountResponse> = retrieveCount(params, RequestOptions.none())

        /** @see retrieveCount */
        @MustBeClosed
        fun retrieveCount(
            params: ItemRetrieveCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemRetrieveCountResponse>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/annotation-queues/{queue_id}/items/{item_id}/placement`, but is otherwise the
         * same as [ItemService.retrievePlacement].
         */
        @MustBeClosed
        fun retrievePlacement(
            itemId: String,
            params: ItemRetrievePlacementParams,
        ): HttpResponseFor<ItemRetrievePlacementResponse> =
            retrievePlacement(itemId, params, RequestOptions.none())

        /** @see retrievePlacement */
        @MustBeClosed
        fun retrievePlacement(
            itemId: String,
            params: ItemRetrievePlacementParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemRetrievePlacementResponse> =
            retrievePlacement(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see retrievePlacement */
        @MustBeClosed
        fun retrievePlacement(
            params: ItemRetrievePlacementParams
        ): HttpResponseFor<ItemRetrievePlacementResponse> =
            retrievePlacement(params, RequestOptions.none())

        /** @see retrievePlacement */
        @MustBeClosed
        fun retrievePlacement(
            params: ItemRetrievePlacementParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemRetrievePlacementResponse>
    }
}
