// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.workspaces.current.tagkeys

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues.TagValue
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues.TagValueDeleteParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues.TagValueDeleteResponse
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues.TagValueRetrieveParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues.TagValueRetrieveTagValuesParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues.TagValueTagValuesParams
import com.langsmith_api.api.models.api.v1.workspaces.current.tagkeys.tagvalues.TagValueUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TagValueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagValueServiceAsync

    /** Get Tag Value */
    fun retrieve(tagValueId: String, params: TagValueRetrieveParams): CompletableFuture<TagValue> =
        retrieve(tagValueId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        tagValueId: String,
        params: TagValueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagValue> =
        retrieve(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TagValueRetrieveParams): CompletableFuture<TagValue> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TagValueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagValue>

    /** Update Tag Value */
    fun update(tagValueId: String, params: TagValueUpdateParams): CompletableFuture<TagValue> =
        update(tagValueId, params, RequestOptions.none())

    /** @see update */
    fun update(
        tagValueId: String,
        params: TagValueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagValue> =
        update(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

    /** @see update */
    fun update(params: TagValueUpdateParams): CompletableFuture<TagValue> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TagValueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagValue>

    /** Delete Tag Value */
    fun delete(
        tagValueId: String,
        params: TagValueDeleteParams,
    ): CompletableFuture<TagValueDeleteResponse> = delete(tagValueId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        tagValueId: String,
        params: TagValueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagValueDeleteResponse> =
        delete(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

    /** @see delete */
    fun delete(params: TagValueDeleteParams): CompletableFuture<TagValueDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TagValueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagValueDeleteResponse>

    /** List Tag Values */
    fun retrieveTagValues(tagKeyId: String): CompletableFuture<List<TagValue>> =
        retrieveTagValues(tagKeyId, TagValueRetrieveTagValuesParams.none())

    /** @see retrieveTagValues */
    fun retrieveTagValues(
        tagKeyId: String,
        params: TagValueRetrieveTagValuesParams = TagValueRetrieveTagValuesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TagValue>> =
        retrieveTagValues(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see retrieveTagValues */
    fun retrieveTagValues(
        tagKeyId: String,
        params: TagValueRetrieveTagValuesParams = TagValueRetrieveTagValuesParams.none(),
    ): CompletableFuture<List<TagValue>> =
        retrieveTagValues(tagKeyId, params, RequestOptions.none())

    /** @see retrieveTagValues */
    fun retrieveTagValues(
        params: TagValueRetrieveTagValuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TagValue>>

    /** @see retrieveTagValues */
    fun retrieveTagValues(
        params: TagValueRetrieveTagValuesParams
    ): CompletableFuture<List<TagValue>> = retrieveTagValues(params, RequestOptions.none())

    /** @see retrieveTagValues */
    fun retrieveTagValues(
        tagKeyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TagValue>> =
        retrieveTagValues(tagKeyId, TagValueRetrieveTagValuesParams.none(), requestOptions)

    /** Create Tag Value */
    fun tagValues(tagKeyId: String, params: TagValueTagValuesParams): CompletableFuture<TagValue> =
        tagValues(tagKeyId, params, RequestOptions.none())

    /** @see tagValues */
    fun tagValues(
        tagKeyId: String,
        params: TagValueTagValuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagValue> =
        tagValues(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see tagValues */
    fun tagValues(params: TagValueTagValuesParams): CompletableFuture<TagValue> =
        tagValues(params, RequestOptions.none())

    /** @see tagValues */
    fun tagValues(
        params: TagValueTagValuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagValue>

    /**
     * A view of [TagValueServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TagValueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values/{tag_value_id}`, but is
         * otherwise the same as [TagValueServiceAsync.retrieve].
         */
        fun retrieve(
            tagValueId: String,
            params: TagValueRetrieveParams,
        ): CompletableFuture<HttpResponseFor<TagValue>> =
            retrieve(tagValueId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            tagValueId: String,
            params: TagValueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagValue>> =
            retrieve(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(params: TagValueRetrieveParams): CompletableFuture<HttpResponseFor<TagValue>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TagValueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagValue>>

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values/{tag_value_id}`, but is
         * otherwise the same as [TagValueServiceAsync.update].
         */
        fun update(
            tagValueId: String,
            params: TagValueUpdateParams,
        ): CompletableFuture<HttpResponseFor<TagValue>> =
            update(tagValueId, params, RequestOptions.none())

        /** @see update */
        fun update(
            tagValueId: String,
            params: TagValueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagValue>> =
            update(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

        /** @see update */
        fun update(params: TagValueUpdateParams): CompletableFuture<HttpResponseFor<TagValue>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TagValueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagValue>>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values/{tag_value_id}`, but is
         * otherwise the same as [TagValueServiceAsync.delete].
         */
        fun delete(
            tagValueId: String,
            params: TagValueDeleteParams,
        ): CompletableFuture<HttpResponseFor<TagValueDeleteResponse>> =
            delete(tagValueId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            tagValueId: String,
            params: TagValueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagValueDeleteResponse>> =
            delete(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: TagValueDeleteParams
        ): CompletableFuture<HttpResponseFor<TagValueDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TagValueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagValueDeleteResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values`, but is otherwise the same
         * as [TagValueServiceAsync.retrieveTagValues].
         */
        fun retrieveTagValues(
            tagKeyId: String
        ): CompletableFuture<HttpResponseFor<List<TagValue>>> =
            retrieveTagValues(tagKeyId, TagValueRetrieveTagValuesParams.none())

        /** @see retrieveTagValues */
        fun retrieveTagValues(
            tagKeyId: String,
            params: TagValueRetrieveTagValuesParams = TagValueRetrieveTagValuesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TagValue>>> =
            retrieveTagValues(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see retrieveTagValues */
        fun retrieveTagValues(
            tagKeyId: String,
            params: TagValueRetrieveTagValuesParams = TagValueRetrieveTagValuesParams.none(),
        ): CompletableFuture<HttpResponseFor<List<TagValue>>> =
            retrieveTagValues(tagKeyId, params, RequestOptions.none())

        /** @see retrieveTagValues */
        fun retrieveTagValues(
            params: TagValueRetrieveTagValuesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TagValue>>>

        /** @see retrieveTagValues */
        fun retrieveTagValues(
            params: TagValueRetrieveTagValuesParams
        ): CompletableFuture<HttpResponseFor<List<TagValue>>> =
            retrieveTagValues(params, RequestOptions.none())

        /** @see retrieveTagValues */
        fun retrieveTagValues(
            tagKeyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TagValue>>> =
            retrieveTagValues(tagKeyId, TagValueRetrieveTagValuesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values`, but is otherwise the same
         * as [TagValueServiceAsync.tagValues].
         */
        fun tagValues(
            tagKeyId: String,
            params: TagValueTagValuesParams,
        ): CompletableFuture<HttpResponseFor<TagValue>> =
            tagValues(tagKeyId, params, RequestOptions.none())

        /** @see tagValues */
        fun tagValues(
            tagKeyId: String,
            params: TagValueTagValuesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagValue>> =
            tagValues(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see tagValues */
        fun tagValues(
            params: TagValueTagValuesParams
        ): CompletableFuture<HttpResponseFor<TagValue>> = tagValues(params, RequestOptions.none())

        /** @see tagValues */
        fun tagValues(
            params: TagValueTagValuesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagValue>>
    }
}
