// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.workspaces.current

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKey
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyDeleteParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyDeleteResponse
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyRetrieveParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyRetrieveTagKeysParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyTagKeysParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.TagKeyUpdateParams
import com.langsmith_api.api.services.async.api.v1.workspaces.current.tagkeys.TagValueServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TagKeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagKeyServiceAsync

    fun tagValues(): TagValueServiceAsync

    /** Get Tag Key */
    fun retrieve(tagKeyId: String): CompletableFuture<TagKey> =
        retrieve(tagKeyId, TagKeyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        tagKeyId: String,
        params: TagKeyRetrieveParams = TagKeyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagKey> =
        retrieve(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        tagKeyId: String,
        params: TagKeyRetrieveParams = TagKeyRetrieveParams.none(),
    ): CompletableFuture<TagKey> = retrieve(tagKeyId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TagKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagKey>

    /** @see retrieve */
    fun retrieve(params: TagKeyRetrieveParams): CompletableFuture<TagKey> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(tagKeyId: String, requestOptions: RequestOptions): CompletableFuture<TagKey> =
        retrieve(tagKeyId, TagKeyRetrieveParams.none(), requestOptions)

    /** Update Tag Key */
    fun update(tagKeyId: String): CompletableFuture<TagKey> =
        update(tagKeyId, TagKeyUpdateParams.none())

    /** @see update */
    fun update(
        tagKeyId: String,
        params: TagKeyUpdateParams = TagKeyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagKey> =
        update(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see update */
    fun update(
        tagKeyId: String,
        params: TagKeyUpdateParams = TagKeyUpdateParams.none(),
    ): CompletableFuture<TagKey> = update(tagKeyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TagKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagKey>

    /** @see update */
    fun update(params: TagKeyUpdateParams): CompletableFuture<TagKey> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(tagKeyId: String, requestOptions: RequestOptions): CompletableFuture<TagKey> =
        update(tagKeyId, TagKeyUpdateParams.none(), requestOptions)

    /** Delete Tag Key */
    fun delete(tagKeyId: String): CompletableFuture<TagKeyDeleteResponse> =
        delete(tagKeyId, TagKeyDeleteParams.none())

    /** @see delete */
    fun delete(
        tagKeyId: String,
        params: TagKeyDeleteParams = TagKeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagKeyDeleteResponse> =
        delete(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see delete */
    fun delete(
        tagKeyId: String,
        params: TagKeyDeleteParams = TagKeyDeleteParams.none(),
    ): CompletableFuture<TagKeyDeleteResponse> = delete(tagKeyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TagKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagKeyDeleteResponse>

    /** @see delete */
    fun delete(params: TagKeyDeleteParams): CompletableFuture<TagKeyDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        tagKeyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TagKeyDeleteResponse> =
        delete(tagKeyId, TagKeyDeleteParams.none(), requestOptions)

    /** List Tag Keys */
    fun retrieveTagKeys(): CompletableFuture<List<TagKey>> =
        retrieveTagKeys(TagKeyRetrieveTagKeysParams.none())

    /** @see retrieveTagKeys */
    fun retrieveTagKeys(
        params: TagKeyRetrieveTagKeysParams = TagKeyRetrieveTagKeysParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TagKey>>

    /** @see retrieveTagKeys */
    fun retrieveTagKeys(
        params: TagKeyRetrieveTagKeysParams = TagKeyRetrieveTagKeysParams.none()
    ): CompletableFuture<List<TagKey>> = retrieveTagKeys(params, RequestOptions.none())

    /** @see retrieveTagKeys */
    fun retrieveTagKeys(requestOptions: RequestOptions): CompletableFuture<List<TagKey>> =
        retrieveTagKeys(TagKeyRetrieveTagKeysParams.none(), requestOptions)

    /** Create Tag Key */
    fun tagKeys(params: TagKeyTagKeysParams): CompletableFuture<TagKey> =
        tagKeys(params, RequestOptions.none())

    /** @see tagKeys */
    fun tagKeys(
        params: TagKeyTagKeysParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagKey>

    /**
     * A view of [TagKeyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TagKeyServiceAsync.WithRawResponse

        fun tagValues(): TagValueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/tag-keys/{tag_key_id}`,
         * but is otherwise the same as [TagKeyServiceAsync.retrieve].
         */
        fun retrieve(tagKeyId: String): CompletableFuture<HttpResponseFor<TagKey>> =
            retrieve(tagKeyId, TagKeyRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            tagKeyId: String,
            params: TagKeyRetrieveParams = TagKeyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagKey>> =
            retrieve(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            tagKeyId: String,
            params: TagKeyRetrieveParams = TagKeyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TagKey>> =
            retrieve(tagKeyId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TagKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagKey>>

        /** @see retrieve */
        fun retrieve(params: TagKeyRetrieveParams): CompletableFuture<HttpResponseFor<TagKey>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            tagKeyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagKey>> =
            retrieve(tagKeyId, TagKeyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/workspaces/current/tag-keys/{tag_key_id}`,
         * but is otherwise the same as [TagKeyServiceAsync.update].
         */
        fun update(tagKeyId: String): CompletableFuture<HttpResponseFor<TagKey>> =
            update(tagKeyId, TagKeyUpdateParams.none())

        /** @see update */
        fun update(
            tagKeyId: String,
            params: TagKeyUpdateParams = TagKeyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagKey>> =
            update(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see update */
        fun update(
            tagKeyId: String,
            params: TagKeyUpdateParams = TagKeyUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<TagKey>> =
            update(tagKeyId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TagKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagKey>>

        /** @see update */
        fun update(params: TagKeyUpdateParams): CompletableFuture<HttpResponseFor<TagKey>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            tagKeyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagKey>> =
            update(tagKeyId, TagKeyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}`, but is otherwise the same as
         * [TagKeyServiceAsync.delete].
         */
        fun delete(tagKeyId: String): CompletableFuture<HttpResponseFor<TagKeyDeleteResponse>> =
            delete(tagKeyId, TagKeyDeleteParams.none())

        /** @see delete */
        fun delete(
            tagKeyId: String,
            params: TagKeyDeleteParams = TagKeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagKeyDeleteResponse>> =
            delete(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see delete */
        fun delete(
            tagKeyId: String,
            params: TagKeyDeleteParams = TagKeyDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<TagKeyDeleteResponse>> =
            delete(tagKeyId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TagKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagKeyDeleteResponse>>

        /** @see delete */
        fun delete(
            params: TagKeyDeleteParams
        ): CompletableFuture<HttpResponseFor<TagKeyDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            tagKeyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TagKeyDeleteResponse>> =
            delete(tagKeyId, TagKeyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/tag-keys`, but is
         * otherwise the same as [TagKeyServiceAsync.retrieveTagKeys].
         */
        fun retrieveTagKeys(): CompletableFuture<HttpResponseFor<List<TagKey>>> =
            retrieveTagKeys(TagKeyRetrieveTagKeysParams.none())

        /** @see retrieveTagKeys */
        fun retrieveTagKeys(
            params: TagKeyRetrieveTagKeysParams = TagKeyRetrieveTagKeysParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TagKey>>>

        /** @see retrieveTagKeys */
        fun retrieveTagKeys(
            params: TagKeyRetrieveTagKeysParams = TagKeyRetrieveTagKeysParams.none()
        ): CompletableFuture<HttpResponseFor<List<TagKey>>> =
            retrieveTagKeys(params, RequestOptions.none())

        /** @see retrieveTagKeys */
        fun retrieveTagKeys(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<TagKey>>> =
            retrieveTagKeys(TagKeyRetrieveTagKeysParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces/current/tag-keys`, but is
         * otherwise the same as [TagKeyServiceAsync.tagKeys].
         */
        fun tagKeys(params: TagKeyTagKeysParams): CompletableFuture<HttpResponseFor<TagKey>> =
            tagKeys(params, RequestOptions.none())

        /** @see tagKeys */
        fun tagKeys(
            params: TagKeyTagKeysParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagKey>>
    }
}
