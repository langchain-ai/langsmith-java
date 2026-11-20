// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspacetags

import com.google.errorprone.annotations.MustBeClosed
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
import com.langchain.smith.services.blocking.workspacetags.keys.ValueService
import java.util.function.Consumer

interface KeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): KeyService

    fun values(): ValueService

    /** Create Tag Key */
    fun create(params: KeyCreateParams): TagKey = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: KeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagKey

    /** Get Tag Key */
    fun retrieve(tagKeyId: String): TagKey = retrieve(tagKeyId, KeyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        tagKeyId: String,
        params: KeyRetrieveParams = KeyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagKey = retrieve(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(tagKeyId: String, params: KeyRetrieveParams = KeyRetrieveParams.none()): TagKey =
        retrieve(tagKeyId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: KeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagKey

    /** @see retrieve */
    fun retrieve(params: KeyRetrieveParams): TagKey = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(tagKeyId: String, requestOptions: RequestOptions): TagKey =
        retrieve(tagKeyId, KeyRetrieveParams.none(), requestOptions)

    /** Update Tag Key */
    fun update(tagKeyId: String): TagKey = update(tagKeyId, KeyUpdateParams.none())

    /** @see update */
    fun update(
        tagKeyId: String,
        params: KeyUpdateParams = KeyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagKey = update(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see update */
    fun update(tagKeyId: String, params: KeyUpdateParams = KeyUpdateParams.none()): TagKey =
        update(tagKeyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: KeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagKey

    /** @see update */
    fun update(params: KeyUpdateParams): TagKey = update(params, RequestOptions.none())

    /** @see update */
    fun update(tagKeyId: String, requestOptions: RequestOptions): TagKey =
        update(tagKeyId, KeyUpdateParams.none(), requestOptions)

    /** List Tag Keys */
    fun list(): List<TagKey> = list(KeyListParams.none())

    /** @see list */
    fun list(
        params: KeyListParams = KeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TagKey>

    /** @see list */
    fun list(params: KeyListParams = KeyListParams.none()): List<TagKey> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<TagKey> =
        list(KeyListParams.none(), requestOptions)

    /** Delete Tag Key */
    fun delete(tagKeyId: String) = delete(tagKeyId, KeyDeleteParams.none())

    /** @see delete */
    fun delete(
        tagKeyId: String,
        params: KeyDeleteParams = KeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see delete */
    fun delete(tagKeyId: String, params: KeyDeleteParams = KeyDeleteParams.none()) =
        delete(tagKeyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: KeyDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: KeyDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(tagKeyId: String, requestOptions: RequestOptions) =
        delete(tagKeyId, KeyDeleteParams.none(), requestOptions)

    /** A view of [KeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): KeyService.WithRawResponse

        fun values(): ValueService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces/current/tag-keys`, but is
         * otherwise the same as [KeyService.create].
         */
        @MustBeClosed
        fun create(params: KeyCreateParams): HttpResponseFor<TagKey> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: KeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagKey>

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/tag-keys/{tag_key_id}`,
         * but is otherwise the same as [KeyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(tagKeyId: String): HttpResponseFor<TagKey> =
            retrieve(tagKeyId, KeyRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            tagKeyId: String,
            params: KeyRetrieveParams = KeyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagKey> =
            retrieve(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            tagKeyId: String,
            params: KeyRetrieveParams = KeyRetrieveParams.none(),
        ): HttpResponseFor<TagKey> = retrieve(tagKeyId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: KeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagKey>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: KeyRetrieveParams): HttpResponseFor<TagKey> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(tagKeyId: String, requestOptions: RequestOptions): HttpResponseFor<TagKey> =
            retrieve(tagKeyId, KeyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/workspaces/current/tag-keys/{tag_key_id}`,
         * but is otherwise the same as [KeyService.update].
         */
        @MustBeClosed
        fun update(tagKeyId: String): HttpResponseFor<TagKey> =
            update(tagKeyId, KeyUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            tagKeyId: String,
            params: KeyUpdateParams = KeyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagKey> =
            update(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            tagKeyId: String,
            params: KeyUpdateParams = KeyUpdateParams.none(),
        ): HttpResponseFor<TagKey> = update(tagKeyId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: KeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagKey>

        /** @see update */
        @MustBeClosed
        fun update(params: KeyUpdateParams): HttpResponseFor<TagKey> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(tagKeyId: String, requestOptions: RequestOptions): HttpResponseFor<TagKey> =
            update(tagKeyId, KeyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/tag-keys`, but is
         * otherwise the same as [KeyService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<List<TagKey>> = list(KeyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: KeyListParams = KeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TagKey>>

        /** @see list */
        @MustBeClosed
        fun list(params: KeyListParams = KeyListParams.none()): HttpResponseFor<List<TagKey>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<TagKey>> =
            list(KeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}`, but is otherwise the same as
         * [KeyService.delete].
         */
        @MustBeClosed
        fun delete(tagKeyId: String): HttpResponse = delete(tagKeyId, KeyDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            tagKeyId: String,
            params: KeyDeleteParams = KeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            tagKeyId: String,
            params: KeyDeleteParams = KeyDeleteParams.none(),
        ): HttpResponse = delete(tagKeyId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: KeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: KeyDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(tagKeyId: String, requestOptions: RequestOptions): HttpResponse =
            delete(tagKeyId, KeyDeleteParams.none(), requestOptions)
    }
}
