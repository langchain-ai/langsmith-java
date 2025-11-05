// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspaces.current

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.workspaces.current.tagkeys.TagKey
import com.langchain.smith.models.workspaces.current.tagkeys.TagKeyDeleteParams
import com.langchain.smith.models.workspaces.current.tagkeys.TagKeyDeleteResponse
import com.langchain.smith.models.workspaces.current.tagkeys.TagKeyRetrieveParams
import com.langchain.smith.models.workspaces.current.tagkeys.TagKeyRetrieveTagKeysParams
import com.langchain.smith.models.workspaces.current.tagkeys.TagKeyTagKeysParams
import com.langchain.smith.models.workspaces.current.tagkeys.TagKeyUpdateParams
import com.langchain.smith.services.blocking.workspaces.current.tagkeys.TagValueService
import java.util.function.Consumer

interface TagKeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagKeyService

    fun tagValues(): TagValueService

    /** Get Tag Key */
    fun retrieve(tagKeyId: String): TagKey = retrieve(tagKeyId, TagKeyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        tagKeyId: String,
        params: TagKeyRetrieveParams = TagKeyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagKey = retrieve(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        tagKeyId: String,
        params: TagKeyRetrieveParams = TagKeyRetrieveParams.none(),
    ): TagKey = retrieve(tagKeyId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TagKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagKey

    /** @see retrieve */
    fun retrieve(params: TagKeyRetrieveParams): TagKey = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(tagKeyId: String, requestOptions: RequestOptions): TagKey =
        retrieve(tagKeyId, TagKeyRetrieveParams.none(), requestOptions)

    /** Update Tag Key */
    fun update(tagKeyId: String): TagKey = update(tagKeyId, TagKeyUpdateParams.none())

    /** @see update */
    fun update(
        tagKeyId: String,
        params: TagKeyUpdateParams = TagKeyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagKey = update(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see update */
    fun update(tagKeyId: String, params: TagKeyUpdateParams = TagKeyUpdateParams.none()): TagKey =
        update(tagKeyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TagKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagKey

    /** @see update */
    fun update(params: TagKeyUpdateParams): TagKey = update(params, RequestOptions.none())

    /** @see update */
    fun update(tagKeyId: String, requestOptions: RequestOptions): TagKey =
        update(tagKeyId, TagKeyUpdateParams.none(), requestOptions)

    /** Delete Tag Key */
    fun delete(tagKeyId: String): TagKeyDeleteResponse = delete(tagKeyId, TagKeyDeleteParams.none())

    /** @see delete */
    fun delete(
        tagKeyId: String,
        params: TagKeyDeleteParams = TagKeyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagKeyDeleteResponse = delete(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see delete */
    fun delete(
        tagKeyId: String,
        params: TagKeyDeleteParams = TagKeyDeleteParams.none(),
    ): TagKeyDeleteResponse = delete(tagKeyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TagKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagKeyDeleteResponse

    /** @see delete */
    fun delete(params: TagKeyDeleteParams): TagKeyDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(tagKeyId: String, requestOptions: RequestOptions): TagKeyDeleteResponse =
        delete(tagKeyId, TagKeyDeleteParams.none(), requestOptions)

    /** List Tag Keys */
    fun retrieveTagKeys(): List<TagKey> = retrieveTagKeys(TagKeyRetrieveTagKeysParams.none())

    /** @see retrieveTagKeys */
    fun retrieveTagKeys(
        params: TagKeyRetrieveTagKeysParams = TagKeyRetrieveTagKeysParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TagKey>

    /** @see retrieveTagKeys */
    fun retrieveTagKeys(
        params: TagKeyRetrieveTagKeysParams = TagKeyRetrieveTagKeysParams.none()
    ): List<TagKey> = retrieveTagKeys(params, RequestOptions.none())

    /** @see retrieveTagKeys */
    fun retrieveTagKeys(requestOptions: RequestOptions): List<TagKey> =
        retrieveTagKeys(TagKeyRetrieveTagKeysParams.none(), requestOptions)

    /** Create Tag Key */
    fun tagKeys(params: TagKeyTagKeysParams): TagKey = tagKeys(params, RequestOptions.none())

    /** @see tagKeys */
    fun tagKeys(
        params: TagKeyTagKeysParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagKey

    /** A view of [TagKeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagKeyService.WithRawResponse

        fun tagValues(): TagValueService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/tag-keys/{tag_key_id}`,
         * but is otherwise the same as [TagKeyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(tagKeyId: String): HttpResponseFor<TagKey> =
            retrieve(tagKeyId, TagKeyRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            tagKeyId: String,
            params: TagKeyRetrieveParams = TagKeyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagKey> =
            retrieve(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            tagKeyId: String,
            params: TagKeyRetrieveParams = TagKeyRetrieveParams.none(),
        ): HttpResponseFor<TagKey> = retrieve(tagKeyId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TagKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagKey>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TagKeyRetrieveParams): HttpResponseFor<TagKey> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(tagKeyId: String, requestOptions: RequestOptions): HttpResponseFor<TagKey> =
            retrieve(tagKeyId, TagKeyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/workspaces/current/tag-keys/{tag_key_id}`,
         * but is otherwise the same as [TagKeyService.update].
         */
        @MustBeClosed
        fun update(tagKeyId: String): HttpResponseFor<TagKey> =
            update(tagKeyId, TagKeyUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            tagKeyId: String,
            params: TagKeyUpdateParams = TagKeyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagKey> =
            update(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            tagKeyId: String,
            params: TagKeyUpdateParams = TagKeyUpdateParams.none(),
        ): HttpResponseFor<TagKey> = update(tagKeyId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TagKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagKey>

        /** @see update */
        @MustBeClosed
        fun update(params: TagKeyUpdateParams): HttpResponseFor<TagKey> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(tagKeyId: String, requestOptions: RequestOptions): HttpResponseFor<TagKey> =
            update(tagKeyId, TagKeyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}`, but is otherwise the same as
         * [TagKeyService.delete].
         */
        @MustBeClosed
        fun delete(tagKeyId: String): HttpResponseFor<TagKeyDeleteResponse> =
            delete(tagKeyId, TagKeyDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            tagKeyId: String,
            params: TagKeyDeleteParams = TagKeyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagKeyDeleteResponse> =
            delete(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            tagKeyId: String,
            params: TagKeyDeleteParams = TagKeyDeleteParams.none(),
        ): HttpResponseFor<TagKeyDeleteResponse> = delete(tagKeyId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TagKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagKeyDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: TagKeyDeleteParams): HttpResponseFor<TagKeyDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            tagKeyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TagKeyDeleteResponse> =
            delete(tagKeyId, TagKeyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/tag-keys`, but is
         * otherwise the same as [TagKeyService.retrieveTagKeys].
         */
        @MustBeClosed
        fun retrieveTagKeys(): HttpResponseFor<List<TagKey>> =
            retrieveTagKeys(TagKeyRetrieveTagKeysParams.none())

        /** @see retrieveTagKeys */
        @MustBeClosed
        fun retrieveTagKeys(
            params: TagKeyRetrieveTagKeysParams = TagKeyRetrieveTagKeysParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TagKey>>

        /** @see retrieveTagKeys */
        @MustBeClosed
        fun retrieveTagKeys(
            params: TagKeyRetrieveTagKeysParams = TagKeyRetrieveTagKeysParams.none()
        ): HttpResponseFor<List<TagKey>> = retrieveTagKeys(params, RequestOptions.none())

        /** @see retrieveTagKeys */
        @MustBeClosed
        fun retrieveTagKeys(requestOptions: RequestOptions): HttpResponseFor<List<TagKey>> =
            retrieveTagKeys(TagKeyRetrieveTagKeysParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces/current/tag-keys`, but is
         * otherwise the same as [TagKeyService.tagKeys].
         */
        @MustBeClosed
        fun tagKeys(params: TagKeyTagKeysParams): HttpResponseFor<TagKey> =
            tagKeys(params, RequestOptions.none())

        /** @see tagKeys */
        @MustBeClosed
        fun tagKeys(
            params: TagKeyTagKeysParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagKey>
    }
}
