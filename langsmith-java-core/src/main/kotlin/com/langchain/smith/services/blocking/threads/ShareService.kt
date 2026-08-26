// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.threads

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.threads.share.ShareCreateParams
import com.langchain.smith.models.threads.share.ShareCreateResponse
import com.langchain.smith.models.threads.share.ShareDeleteParams
import com.langchain.smith.models.threads.share.ShareRetrieveParams
import com.langchain.smith.models.threads.share.ShareRetrieveResponse
import java.util.function.Consumer

interface ShareService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShareService

    /**
     * Mints a public share token for a thread. Idempotent: sharing an already-shared thread returns
     * the existing token.
     */
    fun create(threadId: String, params: ShareCreateParams): ShareCreateResponse =
        create(threadId, params, RequestOptions.none())

    /** @see create */
    fun create(
        threadId: String,
        params: ShareCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShareCreateResponse = create(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see create */
    fun create(params: ShareCreateParams): ShareCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ShareCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShareCreateResponse

    /**
     * Returns the share token for a thread, or 404 when it is not shared. Gated on runs:share so
     * the control's state matches the control's permission.
     */
    fun retrieve(threadId: String, params: ShareRetrieveParams): ShareRetrieveResponse =
        retrieve(threadId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        threadId: String,
        params: ShareRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShareRetrieveResponse =
        retrieve(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ShareRetrieveParams): ShareRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ShareRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShareRetrieveResponse

    /**
     * Deletes the share token for a thread. Idempotent: returns 204 whether or not a share token
     * existed. Deliberately does not verify the thread still exists.
     */
    fun delete(threadId: String, params: ShareDeleteParams) =
        delete(threadId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        threadId: String,
        params: ShareDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ShareDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ShareDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [ShareService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShareService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/threads/{thread_id}/share`, but is
         * otherwise the same as [ShareService.create].
         */
        @MustBeClosed
        fun create(
            threadId: String,
            params: ShareCreateParams,
        ): HttpResponseFor<ShareCreateResponse> = create(threadId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            threadId: String,
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShareCreateResponse> =
            create(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ShareCreateParams): HttpResponseFor<ShareCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ShareCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShareCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v2/threads/{thread_id}/share`, but is otherwise
         * the same as [ShareService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            threadId: String,
            params: ShareRetrieveParams,
        ): HttpResponseFor<ShareRetrieveResponse> =
            retrieve(threadId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            threadId: String,
            params: ShareRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShareRetrieveResponse> =
            retrieve(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ShareRetrieveParams): HttpResponseFor<ShareRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ShareRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShareRetrieveResponse>

        /**
         * Returns a raw HTTP response for `delete /api/v2/threads/{thread_id}/share`, but is
         * otherwise the same as [ShareService.delete].
         */
        @MustBeClosed
        fun delete(threadId: String, params: ShareDeleteParams): HttpResponse =
            delete(threadId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            threadId: String,
            params: ShareDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ShareDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ShareDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
