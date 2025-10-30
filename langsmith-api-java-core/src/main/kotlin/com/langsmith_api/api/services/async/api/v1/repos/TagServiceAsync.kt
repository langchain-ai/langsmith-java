// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.repos

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

    /** Get Tags */
    fun list(repo: String, params: TagListParams): CompletableFuture<List<RepoTag>> =
        list(repo, params, RequestOptions.none())

    /** @see list */
    fun list(
        repo: String,
        params: TagListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RepoTag>> =
        list(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see list */
    fun list(params: TagListParams): CompletableFuture<List<RepoTag>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TagListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RepoTag>>

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
         * Returns a raw HTTP response for `get /api/v1/repos/{owner}/{repo}/tags`, but is otherwise
         * the same as [TagServiceAsync.list].
         */
        fun list(
            repo: String,
            params: TagListParams,
        ): CompletableFuture<HttpResponseFor<List<RepoTag>>> =
            list(repo, params, RequestOptions.none())

        /** @see list */
        fun list(
            repo: String,
            params: TagListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RepoTag>>> =
            list(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see list */
        fun list(params: TagListParams): CompletableFuture<HttpResponseFor<List<RepoTag>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TagListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RepoTag>>>

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
    }
}
