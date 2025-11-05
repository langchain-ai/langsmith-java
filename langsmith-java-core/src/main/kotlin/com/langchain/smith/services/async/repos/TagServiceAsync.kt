// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.repos

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TagServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagServiceAsync

    /** Create Tag */
    fun create(repo: String, params: TagCreateParams): CompletableFuture<RepoTag> =
        create(repo, params, RequestOptions.none())

    /** @see create */
    fun create(
        repo: String,
        params: TagCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RepoTag> = create(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see create */
    fun create(params: TagCreateParams): CompletableFuture<RepoTag> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TagCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RepoTag>

    /** Get Tag */
    fun retrieve(tagName: String, params: TagRetrieveParams): CompletableFuture<RepoTag> =
        retrieve(tagName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        tagName: String,
        params: TagRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RepoTag> =
        retrieve(params.toBuilder().tagName(tagName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TagRetrieveParams): CompletableFuture<RepoTag> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TagRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RepoTag>

    /** Update Tag */
    fun update(tagName: String, params: TagUpdateParams): CompletableFuture<RepoTag> =
        update(tagName, params, RequestOptions.none())

    /** @see update */
    fun update(
        tagName: String,
        params: TagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RepoTag> =
        update(params.toBuilder().tagName(tagName).build(), requestOptions)

    /** @see update */
    fun update(params: TagUpdateParams): CompletableFuture<RepoTag> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RepoTag>

    /** Get all repo tags. */
    fun list(): CompletableFuture<TagListResponse> = list(TagListParams.none())

    /** @see list */
    fun list(
        params: TagListParams = TagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagListResponse>

    /** @see list */
    fun list(params: TagListParams = TagListParams.none()): CompletableFuture<TagListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TagListResponse> =
        list(TagListParams.none(), requestOptions)

    /** Delete Tag */
    fun delete(tagName: String, params: TagDeleteParams): CompletableFuture<TagDeleteResponse> =
        delete(tagName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        tagName: String,
        params: TagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagDeleteResponse> =
        delete(params.toBuilder().tagName(tagName).build(), requestOptions)

    /** @see delete */
    fun delete(params: TagDeleteParams): CompletableFuture<TagDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagDeleteResponse>

    /** Get Tags */
    fun retrieveAll(repo: String, params: TagRetrieveAllParams): CompletableFuture<List<RepoTag>> =
        retrieveAll(repo, params, RequestOptions.none())

    /** @see retrieveAll */
    fun retrieveAll(
        repo: String,
        params: TagRetrieveAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RepoTag>> =
        retrieveAll(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see retrieveAll */
    fun retrieveAll(params: TagRetrieveAllParams): CompletableFuture<List<RepoTag>> =
        retrieveAll(params, RequestOptions.none())

    /** @see retrieveAll */
    fun retrieveAll(
        params: TagRetrieveAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RepoTag>>

    /** A view of [TagServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/repos/{owner}/{repo}/tags`, but is
         * otherwise the same as [TagServiceAsync.create].
         */
        fun create(
            repo: String,
            params: TagCreateParams,
        ): CompletableFuture<HttpResponseFor<RepoTag>> = create(repo, params, RequestOptions.none())

        /** @see create */
        fun create(
            repo: String,
            params: TagCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RepoTag>> =
            create(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see create */
        fun create(params: TagCreateParams): CompletableFuture<HttpResponseFor<RepoTag>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TagCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RepoTag>>

        /**
         * Returns a raw HTTP response for `get /api/v1/repos/{owner}/{repo}/tags/{tag_name}`, but
         * is otherwise the same as [TagServiceAsync.retrieve].
         */
        fun retrieve(
            tagName: String,
            params: TagRetrieveParams,
        ): CompletableFuture<HttpResponseFor<RepoTag>> =
            retrieve(tagName, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            tagName: String,
            params: TagRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RepoTag>> =
            retrieve(params.toBuilder().tagName(tagName).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(params: TagRetrieveParams): CompletableFuture<HttpResponseFor<RepoTag>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TagRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RepoTag>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/repos/{owner}/{repo}/tags/{tag_name}`, but
         * is otherwise the same as [TagServiceAsync.update].
         */
        fun update(
            tagName: String,
            params: TagUpdateParams,
        ): CompletableFuture<HttpResponseFor<RepoTag>> =
            update(tagName, params, RequestOptions.none())

        /** @see update */
        fun update(
            tagName: String,
            params: TagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RepoTag>> =
            update(params.toBuilder().tagName(tagName).build(), requestOptions)

        /** @see update */
        fun update(params: TagUpdateParams): CompletableFuture<HttpResponseFor<RepoTag>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RepoTag>>

        /**
         * Returns a raw HTTP response for `get /api/v1/repos/tags`, but is otherwise the same as
         * [TagServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TagListResponse>> = list(TagListParams.none())

        /** @see list */
        fun list(
            params: TagListParams = TagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagListResponse>>

        /** @see list */
        fun list(
            params: TagListParams = TagListParams.none()
        ): CompletableFuture<HttpResponseFor<TagListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TagListResponse>> =
            list(TagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/repos/{owner}/{repo}/tags/{tag_name}`,
         * but is otherwise the same as [TagServiceAsync.delete].
         */
        fun delete(
            tagName: String,
            params: TagDeleteParams,
        ): CompletableFuture<HttpResponseFor<TagDeleteResponse>> =
            delete(tagName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            tagName: String,
            params: TagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagDeleteResponse>> =
            delete(params.toBuilder().tagName(tagName).build(), requestOptions)

        /** @see delete */
        fun delete(params: TagDeleteParams): CompletableFuture<HttpResponseFor<TagDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagDeleteResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/repos/{owner}/{repo}/tags`, but is otherwise
         * the same as [TagServiceAsync.retrieveAll].
         */
        fun retrieveAll(
            repo: String,
            params: TagRetrieveAllParams,
        ): CompletableFuture<HttpResponseFor<List<RepoTag>>> =
            retrieveAll(repo, params, RequestOptions.none())

        /** @see retrieveAll */
        fun retrieveAll(
            repo: String,
            params: TagRetrieveAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RepoTag>>> =
            retrieveAll(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see retrieveAll */
        fun retrieveAll(
            params: TagRetrieveAllParams
        ): CompletableFuture<HttpResponseFor<List<RepoTag>>> =
            retrieveAll(params, RequestOptions.none())

        /** @see retrieveAll */
        fun retrieveAll(
            params: TagRetrieveAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RepoTag>>>
    }
}
