// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.workspaces.current.tagkeys

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface TagValueService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagValueService

    /** Get Tag Value */
    fun retrieve(tagValueId: String, params: TagValueRetrieveParams): TagValue =
        retrieve(tagValueId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        tagValueId: String,
        params: TagValueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagValue = retrieve(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TagValueRetrieveParams): TagValue = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TagValueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagValue

    /** Update Tag Value */
    fun update(tagValueId: String, params: TagValueUpdateParams): TagValue =
        update(tagValueId, params, RequestOptions.none())

    /** @see update */
    fun update(
        tagValueId: String,
        params: TagValueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagValue = update(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

    /** @see update */
    fun update(params: TagValueUpdateParams): TagValue = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TagValueUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagValue

    /** Delete Tag Value */
    fun delete(tagValueId: String, params: TagValueDeleteParams): TagValueDeleteResponse =
        delete(tagValueId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        tagValueId: String,
        params: TagValueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagValueDeleteResponse =
        delete(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

    /** @see delete */
    fun delete(params: TagValueDeleteParams): TagValueDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TagValueDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagValueDeleteResponse

    /** List Tag Values */
    fun retrieveTagValues(tagKeyId: String): List<TagValue> =
        retrieveTagValues(tagKeyId, TagValueRetrieveTagValuesParams.none())

    /** @see retrieveTagValues */
    fun retrieveTagValues(
        tagKeyId: String,
        params: TagValueRetrieveTagValuesParams = TagValueRetrieveTagValuesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TagValue> =
        retrieveTagValues(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see retrieveTagValues */
    fun retrieveTagValues(
        tagKeyId: String,
        params: TagValueRetrieveTagValuesParams = TagValueRetrieveTagValuesParams.none(),
    ): List<TagValue> = retrieveTagValues(tagKeyId, params, RequestOptions.none())

    /** @see retrieveTagValues */
    fun retrieveTagValues(
        params: TagValueRetrieveTagValuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TagValue>

    /** @see retrieveTagValues */
    fun retrieveTagValues(params: TagValueRetrieveTagValuesParams): List<TagValue> =
        retrieveTagValues(params, RequestOptions.none())

    /** @see retrieveTagValues */
    fun retrieveTagValues(tagKeyId: String, requestOptions: RequestOptions): List<TagValue> =
        retrieveTagValues(tagKeyId, TagValueRetrieveTagValuesParams.none(), requestOptions)

    /** Create Tag Value */
    fun tagValues(tagKeyId: String, params: TagValueTagValuesParams): TagValue =
        tagValues(tagKeyId, params, RequestOptions.none())

    /** @see tagValues */
    fun tagValues(
        tagKeyId: String,
        params: TagValueTagValuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagValue = tagValues(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

    /** @see tagValues */
    fun tagValues(params: TagValueTagValuesParams): TagValue =
        tagValues(params, RequestOptions.none())

    /** @see tagValues */
    fun tagValues(
        params: TagValueTagValuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagValue

    /** A view of [TagValueService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagValueService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values/{tag_value_id}`, but is
         * otherwise the same as [TagValueService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            tagValueId: String,
            params: TagValueRetrieveParams,
        ): HttpResponseFor<TagValue> = retrieve(tagValueId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            tagValueId: String,
            params: TagValueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagValue> =
            retrieve(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TagValueRetrieveParams): HttpResponseFor<TagValue> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TagValueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagValue>

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values/{tag_value_id}`, but is
         * otherwise the same as [TagValueService.update].
         */
        @MustBeClosed
        fun update(tagValueId: String, params: TagValueUpdateParams): HttpResponseFor<TagValue> =
            update(tagValueId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            tagValueId: String,
            params: TagValueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagValue> =
            update(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TagValueUpdateParams): HttpResponseFor<TagValue> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TagValueUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagValue>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values/{tag_value_id}`, but is
         * otherwise the same as [TagValueService.delete].
         */
        @MustBeClosed
        fun delete(
            tagValueId: String,
            params: TagValueDeleteParams,
        ): HttpResponseFor<TagValueDeleteResponse> =
            delete(tagValueId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            tagValueId: String,
            params: TagValueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagValueDeleteResponse> =
            delete(params.toBuilder().tagValueId(tagValueId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: TagValueDeleteParams): HttpResponseFor<TagValueDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TagValueDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagValueDeleteResponse>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values`, but is otherwise the same
         * as [TagValueService.retrieveTagValues].
         */
        @MustBeClosed
        fun retrieveTagValues(tagKeyId: String): HttpResponseFor<List<TagValue>> =
            retrieveTagValues(tagKeyId, TagValueRetrieveTagValuesParams.none())

        /** @see retrieveTagValues */
        @MustBeClosed
        fun retrieveTagValues(
            tagKeyId: String,
            params: TagValueRetrieveTagValuesParams = TagValueRetrieveTagValuesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TagValue>> =
            retrieveTagValues(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see retrieveTagValues */
        @MustBeClosed
        fun retrieveTagValues(
            tagKeyId: String,
            params: TagValueRetrieveTagValuesParams = TagValueRetrieveTagValuesParams.none(),
        ): HttpResponseFor<List<TagValue>> =
            retrieveTagValues(tagKeyId, params, RequestOptions.none())

        /** @see retrieveTagValues */
        @MustBeClosed
        fun retrieveTagValues(
            params: TagValueRetrieveTagValuesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TagValue>>

        /** @see retrieveTagValues */
        @MustBeClosed
        fun retrieveTagValues(
            params: TagValueRetrieveTagValuesParams
        ): HttpResponseFor<List<TagValue>> = retrieveTagValues(params, RequestOptions.none())

        /** @see retrieveTagValues */
        @MustBeClosed
        fun retrieveTagValues(
            tagKeyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TagValue>> =
            retrieveTagValues(tagKeyId, TagValueRetrieveTagValuesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/workspaces/current/tag-keys/{tag_key_id}/tag-values`, but is otherwise the same
         * as [TagValueService.tagValues].
         */
        @MustBeClosed
        fun tagValues(
            tagKeyId: String,
            params: TagValueTagValuesParams,
        ): HttpResponseFor<TagValue> = tagValues(tagKeyId, params, RequestOptions.none())

        /** @see tagValues */
        @MustBeClosed
        fun tagValues(
            tagKeyId: String,
            params: TagValueTagValuesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagValue> =
            tagValues(params.toBuilder().tagKeyId(tagKeyId).build(), requestOptions)

        /** @see tagValues */
        @MustBeClosed
        fun tagValues(params: TagValueTagValuesParams): HttpResponseFor<TagValue> =
            tagValues(params, RequestOptions.none())

        /** @see tagValues */
        @MustBeClosed
        fun tagValues(
            params: TagValueTagValuesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagValue>
    }
}
