// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspacetags.keys

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ValueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ValueServiceAsync

    /** Create Tag Value */
    fun create(tagKeyId: String, params: ValueCreateParams): CompletableFuture<TagValue> =
        create(tagKeyId, params, RequestOptions.none())

    /** @see create */
    fun create(
        tagKeyId: String,
        params: ValueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagValue> =
        create(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see create */
    fun create(params: ValueCreateParams): CompletableFuture<TagValue> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ValueCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagValue>

    /** Get Tag Value */
    fun retrieve(tagValueId: String, params: ValueRetrieveParams): CompletableFuture<TagValue> =
        retrieve(tagValueId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        tagValueId: String,
        params: ValueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagValue> =
        retrieve(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ValueRetrieveParams): CompletableFuture<TagValue> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ValueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagValue>

    /** Update Tag Value */
    fun update(tagValueId: String, params: ValueUpdateParams): CompletableFuture<TagValue> =
        update(tagValueId, params, RequestOptions.none())

    /** @see update */
    fun update(
        tagValueId: String,
        params: ValueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagValue> =
        update(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

    /** @see update */
    fun update(params: ValueUpdateParams): CompletableFuture<TagValue> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ValueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagValue>

    /** List Tag Values */
    fun list(tagKeyId: String): CompletableFuture<List<TagValue>> =
        list(tagKeyId, ValueListParams.none())

    /** @see list */
    fun list(
        tagKeyId: String,
        params: ValueListParams = ValueListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TagValue>> =
        list(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see list */
    fun list(
        tagKeyId: String,
        params: ValueListParams = ValueListParams.none(),
    ): CompletableFuture<List<TagValue>> = list(tagKeyId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ValueListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TagValue>>

    /** @see list */
    fun list(params: ValueListParams): CompletableFuture<List<TagValue>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(tagKeyId: String, requestOptions: RequestOptions): CompletableFuture<List<TagValue>> =
        list(tagKeyId, ValueListParams.none(), requestOptions)

    /** Delete Tag Value */
    fun delete(tagValueId: String, params: ValueDeleteParams): CompletableFuture<Void?> =
        delete(tagValueId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        tagValueId: String,
        params: ValueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ValueDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ValueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [ValueServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ValueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values`, but is otherwise the same
         * as [ValueServiceAsync.create].
         */
        fun create(
            tagKeyId: String,
            params: ValueCreateParams,
        ): CompletableFuture<HttpResponseFor<TagValue>> =
            create(tagKeyId, params, RequestOptions.none())

        /** @see create */
        fun create(
            tagKeyId: String,
            params: ValueCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagValue>> =
            create(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see create */
        fun create(params: ValueCreateParams): CompletableFuture<HttpResponseFor<TagValue>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ValueCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagValue>>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values/{tag_value_id}`, but is
         * otherwise the same as [ValueServiceAsync.retrieve].
         */
        fun retrieve(
            tagValueId: String,
            params: ValueRetrieveParams,
        ): CompletableFuture<HttpResponseFor<TagValue>> =
            retrieve(tagValueId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            tagValueId: String,
            params: ValueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagValue>> =
            retrieve(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(params: ValueRetrieveParams): CompletableFuture<HttpResponseFor<TagValue>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ValueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagValue>>

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values/{tag_value_id}`, but is
         * otherwise the same as [ValueServiceAsync.update].
         */
        fun update(
            tagValueId: String,
            params: ValueUpdateParams,
        ): CompletableFuture<HttpResponseFor<TagValue>> =
            update(tagValueId, params, RequestOptions.none())

        /** @see update */
        fun update(
            tagValueId: String,
            params: ValueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagValue>> =
            update(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

        /** @see update */
        fun update(params: ValueUpdateParams): CompletableFuture<HttpResponseFor<TagValue>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ValueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagValue>>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values`, but is otherwise the same
         * as [ValueServiceAsync.list].
         */
        fun list(tagKeyId: String): CompletableFuture<HttpResponseFor<List<TagValue>>> =
            list(tagKeyId, ValueListParams.none())

        /** @see list */
        fun list(
            tagKeyId: String,
            params: ValueListParams = ValueListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TagValue>>> =
            list(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see list */
        fun list(
            tagKeyId: String,
            params: ValueListParams = ValueListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<TagValue>>> =
            list(tagKeyId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ValueListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TagValue>>>

        /** @see list */
        fun list(params: ValueListParams): CompletableFuture<HttpResponseFor<List<TagValue>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            tagKeyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TagValue>>> =
            list(tagKeyId, ValueListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values/{tag_value_id}`, but is
         * otherwise the same as [ValueServiceAsync.delete].
         */
        fun delete(tagValueId: String, params: ValueDeleteParams): CompletableFuture<HttpResponse> =
            delete(tagValueId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            tagValueId: String,
            params: ValueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

        /** @see delete */
        fun delete(params: ValueDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ValueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
