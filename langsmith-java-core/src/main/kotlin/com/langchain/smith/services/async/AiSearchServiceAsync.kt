// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.aisearch.AiSearchParseParams
import com.langchain.smith.models.aisearch.AiSearchParseResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AiSearchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiSearchServiceAsync

    /**
     * Translates a natural-language search into the scope, filters, semantic criterion and time
     * bounds for the runs, traces or threads query API, without running the search. No resources
     * are created. Send the returned fields to the query API named by scope, with the same
     * projects. When scope is omitted, it is inferred from the search and defaults to traces. A
     * time period in the search sets min_start_time or max_start_time; bounds the search does not
     * mention are omitted so you can keep your own time range. Requires AI search to be enabled for
     * the organization and read access to every project. Returns a single JSON response.
     */
    fun parse(params: AiSearchParseParams): CompletableFuture<AiSearchParseResponse> =
        parse(params, RequestOptions.none())

    /** @see parse */
    fun parse(
        params: AiSearchParseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiSearchParseResponse>

    /**
     * A view of [AiSearchServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AiSearchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/ai-search/parse`, but is otherwise the same
         * as [AiSearchServiceAsync.parse].
         */
        fun parse(
            params: AiSearchParseParams
        ): CompletableFuture<HttpResponseFor<AiSearchParseResponse>> =
            parse(params, RequestOptions.none())

        /** @see parse */
        fun parse(
            params: AiSearchParseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiSearchParseResponse>>
    }
}
