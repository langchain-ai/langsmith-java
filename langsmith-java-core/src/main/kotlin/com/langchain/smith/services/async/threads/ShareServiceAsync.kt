// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.threads

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.threads.share.ShareCreateParams
import com.langchain.smith.models.threads.share.ShareCreateResponse
import com.langchain.smith.models.threads.share.ShareDeleteParams
import com.langchain.smith.models.threads.share.ShareRetrieveParams
import com.langchain.smith.models.threads.share.ShareRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ShareServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShareServiceAsync

    /**
     * Mints a public share token for a thread. Idempotent: sharing an already-shared thread returns
     * the existing token.
     */
    fun create(
        threadId: String,
        params: ShareCreateParams,
    ): CompletableFuture<ShareCreateResponse> = create(threadId, params, RequestOptions.none())

    /** @see create */
    fun create(
        threadId: String,
        params: ShareCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShareCreateResponse> =
        create(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see create */
    fun create(params: ShareCreateParams): CompletableFuture<ShareCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ShareCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShareCreateResponse>

    /**
     * Returns the share token for a thread, or 404 when it is not shared. Gated on runs:share so
     * the control's state matches the control's permission.
     */
    fun retrieve(
        threadId: String,
        params: ShareRetrieveParams,
    ): CompletableFuture<ShareRetrieveResponse> = retrieve(threadId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        threadId: String,
        params: ShareRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShareRetrieveResponse> =
        retrieve(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ShareRetrieveParams): CompletableFuture<ShareRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ShareRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShareRetrieveResponse>

    /**
     * Deletes the share token for a thread. Idempotent: returns 204 whether or not a share token
     * existed. Deliberately does not verify the thread still exists.
     */
    fun delete(threadId: String, params: ShareDeleteParams): CompletableFuture<Void?> =
        delete(threadId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        threadId: String,
        params: ShareDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ShareDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ShareDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [ShareServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ShareServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/threads/{thread_id}/share`, but is
         * otherwise the same as [ShareServiceAsync.create].
         */
        fun create(
            threadId: String,
            params: ShareCreateParams,
        ): CompletableFuture<HttpResponseFor<ShareCreateResponse>> =
            create(threadId, params, RequestOptions.none())

        /** @see create */
        fun create(
            threadId: String,
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShareCreateResponse>> =
            create(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ShareCreateParams
        ): CompletableFuture<HttpResponseFor<ShareCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShareCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v2/threads/{thread_id}/share`, but is otherwise
         * the same as [ShareServiceAsync.retrieve].
         */
        fun retrieve(
            threadId: String,
            params: ShareRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ShareRetrieveResponse>> =
            retrieve(threadId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            threadId: String,
            params: ShareRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShareRetrieveResponse>> =
            retrieve(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: ShareRetrieveParams
        ): CompletableFuture<HttpResponseFor<ShareRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ShareRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShareRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `delete /api/v2/threads/{thread_id}/share`, but is
         * otherwise the same as [ShareServiceAsync.delete].
         */
        fun delete(threadId: String, params: ShareDeleteParams): CompletableFuture<HttpResponse> =
            delete(threadId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            threadId: String,
            params: ShareDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see delete */
        fun delete(params: ShareDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ShareDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
