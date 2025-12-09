// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.feedback

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.models.feedback.configs.ConfigDeleteParams
import java.util.function.Consumer

interface ConfigService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigService

    /**
     * Soft delete a feedback config by marking it as deleted.
     *
     * The config can be recreated later with the same key (simple reuse pattern). Existing feedback
     * records with this key will remain unchanged.
     */
    fun delete(params: ConfigDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ConfigDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [ConfigService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /api/v1/feedback-configs`, but is otherwise the
         * same as [ConfigService.delete].
         */
        @MustBeClosed
        fun delete(params: ConfigDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ConfigDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
