// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.repos.CreateRepoResponse
import com.langchain.smith.models.repos.GetRepoResponse
import com.langchain.smith.models.repos.RepoCreateParams
import com.langchain.smith.models.repos.RepoDeleteParams
import com.langchain.smith.models.repos.RepoDeleteResponse
import com.langchain.smith.models.repos.RepoListPage
import com.langchain.smith.models.repos.RepoListParams
import com.langchain.smith.models.repos.RepoRetrieveParams
import com.langchain.smith.models.repos.RepoUpdateParams
import java.util.function.Consumer

interface RepoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RepoService

    /** Create a repo. */
    fun create(params: RepoCreateParams): CreateRepoResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RepoCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateRepoResponse

    /** Get a repo. */
    fun retrieve(repo: String, params: RepoRetrieveParams): GetRepoResponse =
        retrieve(repo, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        repo: String,
        params: RepoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GetRepoResponse = retrieve(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RepoRetrieveParams): GetRepoResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RepoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GetRepoResponse

    /** Update a repo. */
    fun update(repo: String, params: RepoUpdateParams): CreateRepoResponse =
        update(repo, params, RequestOptions.none())

    /** @see update */
    fun update(
        repo: String,
        params: RepoUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateRepoResponse = update(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see update */
    fun update(params: RepoUpdateParams): CreateRepoResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RepoUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateRepoResponse

    /** Get all repos. */
    fun list(): RepoListPage = list(RepoListParams.none())

    /** @see list */
    fun list(
        params: RepoListParams = RepoListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RepoListPage

    /** @see list */
    fun list(params: RepoListParams = RepoListParams.none()): RepoListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RepoListPage =
        list(RepoListParams.none(), requestOptions)

    /** Delete a repo. */
    fun delete(repo: String, params: RepoDeleteParams): RepoDeleteResponse =
        delete(repo, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        repo: String,
        params: RepoDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RepoDeleteResponse = delete(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see delete */
    fun delete(params: RepoDeleteParams): RepoDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RepoDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RepoDeleteResponse

    /** A view of [RepoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RepoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/repos`, but is otherwise the same as
         * [RepoService.create].
         */
        @MustBeClosed
        fun create(params: RepoCreateParams): HttpResponseFor<CreateRepoResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RepoCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateRepoResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/repos/{owner}/{repo}`, but is otherwise the
         * same as [RepoService.retrieve].
         */
        @MustBeClosed
        fun retrieve(repo: String, params: RepoRetrieveParams): HttpResponseFor<GetRepoResponse> =
            retrieve(repo, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            repo: String,
            params: RepoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GetRepoResponse> =
            retrieve(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RepoRetrieveParams): HttpResponseFor<GetRepoResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RepoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GetRepoResponse>

        /**
         * Returns a raw HTTP response for `patch /api/v1/repos/{owner}/{repo}`, but is otherwise
         * the same as [RepoService.update].
         */
        @MustBeClosed
        fun update(repo: String, params: RepoUpdateParams): HttpResponseFor<CreateRepoResponse> =
            update(repo, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            repo: String,
            params: RepoUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateRepoResponse> =
            update(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: RepoUpdateParams): HttpResponseFor<CreateRepoResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RepoUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateRepoResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/repos`, but is otherwise the same as
         * [RepoService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<RepoListPage> = list(RepoListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RepoListParams = RepoListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RepoListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: RepoListParams = RepoListParams.none()): HttpResponseFor<RepoListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RepoListPage> =
            list(RepoListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/repos/{owner}/{repo}`, but is otherwise
         * the same as [RepoService.delete].
         */
        @MustBeClosed
        fun delete(repo: String, params: RepoDeleteParams): HttpResponseFor<RepoDeleteResponse> =
            delete(repo, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            repo: String,
            params: RepoDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RepoDeleteResponse> =
            delete(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: RepoDeleteParams): HttpResponseFor<RepoDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RepoDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RepoDeleteResponse>
    }
}
