// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.evaluators.Evaluator
import com.langchain.smith.models.evaluators.EvaluatorListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EvaluatorServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EvaluatorServiceAsync

    /** List all run rules. */
    fun list(): CompletableFuture<List<Evaluator>> = list(EvaluatorListParams.none())

    /** @see list */
    fun list(
        params: EvaluatorListParams = EvaluatorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Evaluator>>

    /** @see list */
    fun list(
        params: EvaluatorListParams = EvaluatorListParams.none()
    ): CompletableFuture<List<Evaluator>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<Evaluator>> =
        list(EvaluatorListParams.none(), requestOptions)

    /**
     * A view of [EvaluatorServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EvaluatorServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/rules`, but is otherwise the same as
         * [EvaluatorServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<Evaluator>>> =
            list(EvaluatorListParams.none())

        /** @see list */
        fun list(
            params: EvaluatorListParams = EvaluatorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Evaluator>>>

        /** @see list */
        fun list(
            params: EvaluatorListParams = EvaluatorListParams.none()
        ): CompletableFuture<HttpResponseFor<List<Evaluator>>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<Evaluator>>> =
            list(EvaluatorListParams.none(), requestOptions)
    }
}
