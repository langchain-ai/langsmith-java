// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspacetags

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.workspacetags.keys.KeyCreateParams
import com.langchain.smith.models.workspacetags.keys.KeyDeleteParams
import com.langchain.smith.models.workspacetags.keys.KeyListParams
import com.langchain.smith.models.workspacetags.keys.KeyRetrieveParams
import com.langchain.smith.models.workspacetags.keys.KeyUpdateParams
import com.langchain.smith.models.workspacetags.keys.TagKey
import com.langchain.smith.services.async.workspacetags.keys.ValueServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface KeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): KeyServiceAsync

    fun values(): ValueServiceAsync

    /** Create Tag Key */
    fun create(params: KeyCreateParams): CompletableFuture<TagKey> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: KeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagKey>

    /** Get Tag Key */
    fun retrieve(tagKeyId: String): CompletableFuture<TagKey> =
        retrieve(tagKeyId, KeyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        tagKeyId: String,
        params: KeyRetrieveParams = KeyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagKey> =
        retrieve(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        tagKeyId: String,
        params: KeyRetrieveParams = KeyRetrieveParams.none(),
    ): CompletableFuture<TagKey> = retrieve(tagKeyId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: KeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagKey>

    /** @see retrieve */
    fun retrieve(params: KeyRetrieveParams): CompletableFuture<TagKey> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(tagKeyId: String, requestOptions: RequestOptions): CompletableFuture<TagKey> =
        retrieve(tagKeyId, KeyRetrieveParams.none(), requestOptions)

    /** Update Tag Key */
    fun update(tagKeyId: String): CompletableFuture<TagKey> =
        update(tagKeyId, KeyUpdateParams.none())

    /** @see update */
    fun update(
        tagKeyId: String,
        params: KeyUpdateParams = KeyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagKey> =
        update(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see update */
    fun update(
        tagKeyId: String,
        params: KeyUpdateParams = KeyUpdateParams.none(),
    ): CompletableFuture<TagKey> = update(tagKeyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: KeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagKey>

    /** @see update */
    fun update(params: KeyUpdateParams): CompletableFuture<TagKey> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(tagKeyId: String, requestOptions: RequestOptions): CompletableFuture<TagKey> =
        update(tagKeyId, KeyUpdateParams.none(), requestOptions)

    /** List Tag Keys */
    fun list(): CompletableFuture<List<TagKey>> = list(KeyListParams.none())

    /** @see list */
    fun list(
        params: KeyListParams = KeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TagKey>>

    /** @see list */
    fun list(params: KeyListParams = KeyListParams.none()): CompletableFuture<List<TagKey>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<TagKey>> =
        list(KeyListParams.none(), requestOptions)

    /** Delete Tag Key */
    fun delete(tagKeyId: String): CompletableFuture<Void?> =
        delete(tagKeyId, KeyDeleteParams.none())

    /** @see delete */
    fun delete(
        tagKeyId: String,
        params: KeyDeleteParams = KeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see delete */
    fun delete(
        tagKeyId: String,
        params: KeyDeleteParams = KeyDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(tagKeyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: KeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: KeyDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(tagKeyId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(tagKeyId, KeyDeleteParams.none(), requestOptions)

    /** A view of [KeyServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): KeyServiceAsync.WithRawResponse

        fun values(): ValueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces/current/tag-keys`, but is
         * otherwise the same as [KeyServiceAsync.create].
         */
        fun create(params: KeyCreateParams): CompletableFuture<HttpResponseFor<TagKey>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: KeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagKey>>

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/tag-keys/{tag_key_id}`,
         * but is otherwise the same as [KeyServiceAsync.retrieve].
         */
        fun retrieve(tagKeyId: String): CompletableFuture<HttpResponseFor<TagKey>> =
            retrieve(tagKeyId, KeyRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            tagKeyId: String,
            params: KeyRetrieveParams = KeyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagKey>> =
            retrieve(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            tagKeyId: String,
            params: KeyRetrieveParams = KeyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TagKey>> =
            retrieve(tagKeyId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: KeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagKey>>

        /** @see retrieve */
        fun retrieve(params: KeyRetrieveParams): CompletableFuture<HttpResponseFor<TagKey>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            tagKeyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagKey>> =
            retrieve(tagKeyId, KeyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/workspaces/current/tag-keys/{tag_key_id}`,
         * but is otherwise the same as [KeyServiceAsync.update].
         */
        fun update(tagKeyId: String): CompletableFuture<HttpResponseFor<TagKey>> =
            update(tagKeyId, KeyUpdateParams.none())

        /** @see update */
        fun update(
            tagKeyId: String,
            params: KeyUpdateParams = KeyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagKey>> =
            update(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see update */
        fun update(
            tagKeyId: String,
            params: KeyUpdateParams = KeyUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<TagKey>> =
            update(tagKeyId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: KeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagKey>>

        /** @see update */
        fun update(params: KeyUpdateParams): CompletableFuture<HttpResponseFor<TagKey>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            tagKeyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagKey>> =
            update(tagKeyId, KeyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/tag-keys`, but is
         * otherwise the same as [KeyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<TagKey>>> = list(KeyListParams.none())

        /** @see list */
        fun list(
            params: KeyListParams = KeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TagKey>>>

        /** @see list */
        fun list(
            params: KeyListParams = KeyListParams.none()
        ): CompletableFuture<HttpResponseFor<List<TagKey>>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<List<TagKey>>> =
            list(KeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}`, but is otherwise the same as
         * [KeyServiceAsync.delete].
         */
        fun delete(tagKeyId: String): CompletableFuture<HttpResponse> =
            delete(tagKeyId, KeyDeleteParams.none())

        /** @see delete */
        fun delete(
            tagKeyId: String,
            params: KeyDeleteParams = KeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see delete */
        fun delete(
            tagKeyId: String,
            params: KeyDeleteParams = KeyDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(tagKeyId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: KeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: KeyDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            tagKeyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(tagKeyId, KeyDeleteParams.none(), requestOptions)
    }
}
