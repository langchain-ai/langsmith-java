// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.feedback

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.models.feedback.configs.ConfigDeleteParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigServiceAsync

    /**
     * Soft delete a feedback config by marking it as deleted.
     *
     * The config can be recreated later with the same key (simple reuse pattern). Existing feedback
     * records with this key will remain unchanged.
     */
    fun delete(params: ConfigDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ConfigDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [ConfigServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /api/v1/feedback-configs`, but is otherwise the
         * same as [ConfigServiceAsync.delete].
         */
        fun delete(params: ConfigDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ConfigDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
