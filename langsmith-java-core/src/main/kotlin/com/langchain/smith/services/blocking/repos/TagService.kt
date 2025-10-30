// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.repos

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.repos.tags.RepoTag
import com.langchain.smith.models.repos.tags.TagCreateParams
import com.langchain.smith.models.repos.tags.TagDeleteParams
import com.langchain.smith.models.repos.tags.TagDeleteResponse
import com.langchain.smith.models.repos.tags.TagListParams
import com.langchain.smith.models.repos.tags.TagListResponse
import com.langchain.smith.models.repos.tags.TagRetrieveAllParams
import com.langchain.smith.models.repos.tags.TagRetrieveParams
import com.langchain.smith.models.repos.tags.TagUpdateParams
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

    /** Get all repo tags. */
    fun list(): TagListResponse = list(TagListParams.none())

    /** @see list */
    fun list(
        params: TagListParams = TagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagListResponse

    /** @see list */
    fun list(params: TagListParams = TagListParams.none()): TagListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TagListResponse =
        list(TagListParams.none(), requestOptions)

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

    /** Get Tags */
    fun retrieveAll(repo: String, params: TagRetrieveAllParams): List<RepoTag> =
        retrieveAll(repo, params, RequestOptions.none())

    /** @see retrieveAll */
    fun retrieveAll(
        repo: String,
        params: TagRetrieveAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RepoTag> = retrieveAll(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see retrieveAll */
    fun retrieveAll(params: TagRetrieveAllParams): List<RepoTag> =
        retrieveAll(params, RequestOptions.none())

    /** @see retrieveAll */
    fun retrieveAll(
        params: TagRetrieveAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RepoTag>

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
         * Returns a raw HTTP response for `get /api/v1/repos/tags`, but is otherwise the same as
         * [TagService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<TagListResponse> = list(TagListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TagListParams = TagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: TagListParams = TagListParams.none()): HttpResponseFor<TagListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TagListResponse> =
            list(TagListParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `get /api/v1/repos/{owner}/{repo}/tags`, but is otherwise
         * the same as [TagService.retrieveAll].
         */
        @MustBeClosed
        fun retrieveAll(
            repo: String,
            params: TagRetrieveAllParams,
        ): HttpResponseFor<List<RepoTag>> = retrieveAll(repo, params, RequestOptions.none())

        /** @see retrieveAll */
        @MustBeClosed
        fun retrieveAll(
            repo: String,
            params: TagRetrieveAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RepoTag>> =
            retrieveAll(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see retrieveAll */
        @MustBeClosed
        fun retrieveAll(params: TagRetrieveAllParams): HttpResponseFor<List<RepoTag>> =
            retrieveAll(params, RequestOptions.none())

        /** @see retrieveAll */
        @MustBeClosed
        fun retrieveAll(
            params: TagRetrieveAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RepoTag>>
    }
}
