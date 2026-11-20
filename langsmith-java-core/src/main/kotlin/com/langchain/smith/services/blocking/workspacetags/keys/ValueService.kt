// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.workspacetags.keys

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.workspacetags.keys.values.TagValue
import com.langchain.smith.models.workspacetags.keys.values.ValueCreateParams
import com.langchain.smith.models.workspacetags.keys.values.ValueDeleteParams
import com.langchain.smith.models.workspacetags.keys.values.ValueListParams
import com.langchain.smith.models.workspacetags.keys.values.ValueRetrieveParams
import com.langchain.smith.models.workspacetags.keys.values.ValueUpdateParams
import java.util.function.Consumer

interface ValueService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValueService

    /** Create Tag Value */
    fun create(tagKeyId: String, params: ValueCreateParams): TagValue =
        create(tagKeyId, params, RequestOptions.none())

    /** @see create */
    fun create(
        tagKeyId: String,
        params: ValueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagValue = create(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see create */
    fun create(params: ValueCreateParams): TagValue = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ValueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagValue

    /** Get Tag Value */
    fun retrieve(tagValueId: String, params: ValueRetrieveParams): TagValue =
        retrieve(tagValueId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        tagValueId: String,
        params: ValueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagValue = retrieve(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ValueRetrieveParams): TagValue = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ValueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagValue

    /** Update Tag Value */
    fun update(tagValueId: String, params: ValueUpdateParams): TagValue =
        update(tagValueId, params, RequestOptions.none())

    /** @see update */
    fun update(
        tagValueId: String,
        params: ValueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagValue = update(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

    /** @see update */
    fun update(params: ValueUpdateParams): TagValue = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ValueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagValue

    /** List Tag Values */
    fun list(tagKeyId: String): List<TagValue> = list(tagKeyId, ValueListParams.none())

    /** @see list */
    fun list(
        tagKeyId: String,
        params: ValueListParams = ValueListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TagValue> = list(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see list */
    fun list(tagKeyId: String, params: ValueListParams = ValueListParams.none()): List<TagValue> =
        list(tagKeyId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ValueListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TagValue>

    /** @see list */
    fun list(params: ValueListParams): List<TagValue> = list(params, RequestOptions.none())

    /** @see list */
    fun list(tagKeyId: String, requestOptions: RequestOptions): List<TagValue> =
        list(tagKeyId, ValueListParams.none(), requestOptions)

    /** Delete Tag Value */
    fun delete(tagValueId: String, params: ValueDeleteParams) =
        delete(tagValueId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        tagValueId: String,
        params: ValueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ValueDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ValueDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [ValueService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValueService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values`, but is otherwise the same
         * as [ValueService.create].
         */
        @MustBeClosed
        fun create(tagKeyId: String, params: ValueCreateParams): HttpResponseFor<TagValue> =
            create(tagKeyId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            tagKeyId: String,
            params: ValueCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagValue> =
            create(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ValueCreateParams): HttpResponseFor<TagValue> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ValueCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagValue>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values/{tag_value_id}`, but is
         * otherwise the same as [ValueService.retrieve].
         */
        @MustBeClosed
        fun retrieve(tagValueId: String, params: ValueRetrieveParams): HttpResponseFor<TagValue> =
            retrieve(tagValueId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            tagValueId: String,
            params: ValueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagValue> =
            retrieve(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ValueRetrieveParams): HttpResponseFor<TagValue> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ValueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagValue>

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values/{tag_value_id}`, but is
         * otherwise the same as [ValueService.update].
         */
        @MustBeClosed
        fun update(tagValueId: String, params: ValueUpdateParams): HttpResponseFor<TagValue> =
            update(tagValueId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            tagValueId: String,
            params: ValueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagValue> =
            update(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ValueUpdateParams): HttpResponseFor<TagValue> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ValueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagValue>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values`, but is otherwise the same
         * as [ValueService.list].
         */
        @MustBeClosed
        fun list(tagKeyId: String): HttpResponseFor<List<TagValue>> =
            list(tagKeyId, ValueListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            tagKeyId: String,
            params: ValueListParams = ValueListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TagValue>> =
            list(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            tagKeyId: String,
            params: ValueListParams = ValueListParams.none(),
        ): HttpResponseFor<List<TagValue>> = list(tagKeyId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ValueListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TagValue>>

        /** @see list */
        @MustBeClosed
        fun list(params: ValueListParams): HttpResponseFor<List<TagValue>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            tagKeyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TagValue>> = list(tagKeyId, ValueListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values/{tag_value_id}`, but is
         * otherwise the same as [ValueService.delete].
         */
        @MustBeClosed
        fun delete(tagValueId: String, params: ValueDeleteParams): HttpResponse =
            delete(tagValueId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            tagValueId: String,
            params: ValueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ValueDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ValueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
