// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.repos

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.repos.tags.RepoTag
import com.langsmith_api.api.models.api.v1.repos.tags.TagCreateParams
import com.langsmith_api.api.models.api.v1.repos.tags.TagDeleteParams
import com.langsmith_api.api.models.api.v1.repos.tags.TagDeleteResponse
import com.langsmith_api.api.models.api.v1.repos.tags.TagListParams
import com.langsmith_api.api.models.api.v1.repos.tags.TagRetrieveParams
import com.langsmith_api.api.models.api.v1.repos.tags.TagUpdateParams
import java.util.function.Consumer

interface TagService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService

    /** Create Tag */
    fun create(repo: String, params: TagCreateParams): RepoTag =
        create(repo, params, RequestOptions.none())

    /** @see create */
    fun create(
        repo: String,
        params: TagCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RepoTag = create(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see create */
    fun create(params: TagCreateParams): RepoTag = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TagCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RepoTag

    /** Get Tag */
    fun retrieve(tagName: String, params: TagRetrieveParams): RepoTag =
        retrieve(tagName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        tagName: String,
        params: TagRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RepoTag = retrieve(params.toBuilder().tagName(tagName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TagRetrieveParams): RepoTag = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TagRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RepoTag

    /** Update Tag */
    fun update(tagName: String, params: TagUpdateParams): RepoTag =
        update(tagName, params, RequestOptions.none())

    /** @see update */
    fun update(
        tagName: String,
        params: TagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RepoTag = update(params.toBuilder().tagName(tagName).build(), requestOptions)

    /** @see update */
    fun update(params: TagUpdateParams): RepoTag = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RepoTag

    /** Get Tags */
    fun list(repo: String, params: TagListParams): List<RepoTag> =
        list(repo, params, RequestOptions.none())

    /** @see list */
    fun list(
        repo: String,
        params: TagListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RepoTag> = list(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see list */
    fun list(params: TagListParams): List<RepoTag> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TagListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RepoTag>

    /** Delete Tag */
    fun delete(tagName: String, params: TagDeleteParams): TagDeleteResponse =
        delete(tagName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        tagName: String,
        params: TagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagDeleteResponse = delete(params.toBuilder().tagName(tagName).build(), requestOptions)

    /** @see delete */
    fun delete(params: TagDeleteParams): TagDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagDeleteResponse

    /** A view of [TagService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/repos/{owner}/{repo}/tags`, but is
         * otherwise the same as [TagService.create].
         */
        @MustBeClosed
        fun create(repo: String, params: TagCreateParams): HttpResponseFor<RepoTag> =
            create(repo, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            repo: String,
            params: TagCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RepoTag> = create(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: TagCreateParams): HttpResponseFor<RepoTag> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TagCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RepoTag>

        /**
         * Returns a raw HTTP response for `get /api/v1/repos/{owner}/{repo}/tags/{tag_name}`, but
         * is otherwise the same as [TagService.retrieve].
         */
        @MustBeClosed
        fun retrieve(tagName: String, params: TagRetrieveParams): HttpResponseFor<RepoTag> =
            retrieve(tagName, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            tagName: String,
            params: TagRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RepoTag> =
            retrieve(params.toBuilder().tagName(tagName).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TagRetrieveParams): HttpResponseFor<RepoTag> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TagRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RepoTag>

        /**
         * Returns a raw HTTP response for `patch /api/v1/repos/{owner}/{repo}/tags/{tag_name}`, but
         * is otherwise the same as [TagService.update].
         */
        @MustBeClosed
        fun update(tagName: String, params: TagUpdateParams): HttpResponseFor<RepoTag> =
            update(tagName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            tagName: String,
            params: TagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RepoTag> =
            update(params.toBuilder().tagName(tagName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TagUpdateParams): HttpResponseFor<RepoTag> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RepoTag>

        /**
         * Returns a raw HTTP response for `get /api/v1/repos/{owner}/{repo}/tags`, but is otherwise
         * the same as [TagService.list].
         */
        @MustBeClosed
        fun list(repo: String, params: TagListParams): HttpResponseFor<List<RepoTag>> =
            list(repo, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            repo: String,
            params: TagListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RepoTag>> =
            list(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: TagListParams): HttpResponseFor<List<RepoTag>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TagListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RepoTag>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/repos/{owner}/{repo}/tags/{tag_name}`,
         * but is otherwise the same as [TagService.delete].
         */
        @MustBeClosed
        fun delete(tagName: String, params: TagDeleteParams): HttpResponseFor<TagDeleteResponse> =
            delete(tagName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            tagName: String,
            params: TagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagDeleteResponse> =
            delete(params.toBuilder().tagName(tagName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: TagDeleteParams): HttpResponseFor<TagDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagDeleteResponse>
    }
}
