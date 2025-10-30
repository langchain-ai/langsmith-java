// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.orgs

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.members.MemberUpdateBasicParams
import com.langsmith_api.api.models.api.v1.orgs.members.MemberUpdateBasicResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MemberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberServiceAsync

    /** Update a user's full_name/password (basic auth only) */
    fun updateBasic(): CompletableFuture<MemberUpdateBasicResponse> =
        updateBasic(MemberUpdateBasicParams.none())

    /** @see updateBasic */
    fun updateBasic(
        params: MemberUpdateBasicParams = MemberUpdateBasicParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemberUpdateBasicResponse>

    /** @see updateBasic */
    fun updateBasic(
        params: MemberUpdateBasicParams = MemberUpdateBasicParams.none()
    ): CompletableFuture<MemberUpdateBasicResponse> = updateBasic(params, RequestOptions.none())

    /** @see updateBasic */
    fun updateBasic(requestOptions: RequestOptions): CompletableFuture<MemberUpdateBasicResponse> =
        updateBasic(MemberUpdateBasicParams.none(), requestOptions)

    /**
     * A view of [MemberServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MemberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /api/v1/orgs/members/basic`, but is otherwise the
         * same as [MemberServiceAsync.updateBasic].
         */
        fun updateBasic(): CompletableFuture<HttpResponseFor<MemberUpdateBasicResponse>> =
            updateBasic(MemberUpdateBasicParams.none())

        /** @see updateBasic */
        fun updateBasic(
            params: MemberUpdateBasicParams = MemberUpdateBasicParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemberUpdateBasicResponse>>

        /** @see updateBasic */
        fun updateBasic(
            params: MemberUpdateBasicParams = MemberUpdateBasicParams.none()
        ): CompletableFuture<HttpResponseFor<MemberUpdateBasicResponse>> =
            updateBasic(params, RequestOptions.none())

        /** @see updateBasic */
        fun updateBasic(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MemberUpdateBasicResponse>> =
            updateBasic(MemberUpdateBasicParams.none(), requestOptions)
    }
}
