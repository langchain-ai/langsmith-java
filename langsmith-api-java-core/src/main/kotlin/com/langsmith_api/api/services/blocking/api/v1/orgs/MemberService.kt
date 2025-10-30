// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.members.MemberUpdateBasicParams
import com.langsmith_api.api.models.api.v1.orgs.members.MemberUpdateBasicResponse
import java.util.function.Consumer

interface MemberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberService

    /** Update a user's full_name/password (basic auth only) */
    fun updateBasic(): MemberUpdateBasicResponse = updateBasic(MemberUpdateBasicParams.none())

    /** @see updateBasic */
    fun updateBasic(
        params: MemberUpdateBasicParams = MemberUpdateBasicParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemberUpdateBasicResponse

    /** @see updateBasic */
    fun updateBasic(
        params: MemberUpdateBasicParams = MemberUpdateBasicParams.none()
    ): MemberUpdateBasicResponse = updateBasic(params, RequestOptions.none())

    /** @see updateBasic */
    fun updateBasic(requestOptions: RequestOptions): MemberUpdateBasicResponse =
        updateBasic(MemberUpdateBasicParams.none(), requestOptions)

    /** A view of [MemberService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /api/v1/orgs/members/basic`, but is otherwise the
         * same as [MemberService.updateBasic].
         */
        @MustBeClosed
        fun updateBasic(): HttpResponseFor<MemberUpdateBasicResponse> =
            updateBasic(MemberUpdateBasicParams.none())

        /** @see updateBasic */
        @MustBeClosed
        fun updateBasic(
            params: MemberUpdateBasicParams = MemberUpdateBasicParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemberUpdateBasicResponse>

        /** @see updateBasic */
        @MustBeClosed
        fun updateBasic(
            params: MemberUpdateBasicParams = MemberUpdateBasicParams.none()
        ): HttpResponseFor<MemberUpdateBasicResponse> = updateBasic(params, RequestOptions.none())

        /** @see updateBasic */
        @MustBeClosed
        fun updateBasic(
            requestOptions: RequestOptions
        ): HttpResponseFor<MemberUpdateBasicResponse> =
            updateBasic(MemberUpdateBasicParams.none(), requestOptions)
    }
}
