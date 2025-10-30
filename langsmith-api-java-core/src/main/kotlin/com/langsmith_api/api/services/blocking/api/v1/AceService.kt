// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.ace.AceExecuteParams
import com.langsmith_api.api.models.api.v1.ace.AceExecuteResponse
import java.util.function.Consumer

interface AceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AceService

    /** Execute some custom code for testing purposes. */
    fun execute(params: AceExecuteParams): AceExecuteResponse =
        execute(params, RequestOptions.none())

    /** @see execute */
    fun execute(
        params: AceExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AceExecuteResponse

    /** A view of [AceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/ace/execute`, but is otherwise the same as
         * [AceService.execute].
         */
        @MustBeClosed
        fun execute(params: AceExecuteParams): HttpResponseFor<AceExecuteResponse> =
            execute(params, RequestOptions.none())

        /** @see execute */
        @MustBeClosed
        fun execute(
            params: AceExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AceExecuteResponse>
    }
}
