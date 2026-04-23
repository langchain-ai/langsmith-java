// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.evaluators.Evaluator
import com.langchain.smith.models.evaluators.EvaluatorListParams
import java.util.function.Consumer

interface EvaluatorService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EvaluatorService

    /** List all run rules. */
    fun list(): List<Evaluator> = list(EvaluatorListParams.none())

    /** @see list */
    fun list(
        params: EvaluatorListParams = EvaluatorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Evaluator>

    /** @see list */
    fun list(params: EvaluatorListParams = EvaluatorListParams.none()): List<Evaluator> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<Evaluator> =
        list(EvaluatorListParams.none(), requestOptions)

    /** A view of [EvaluatorService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EvaluatorService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/rules`, but is otherwise the same as
         * [EvaluatorService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<Evaluator>> = list(EvaluatorListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EvaluatorListParams = EvaluatorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Evaluator>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EvaluatorListParams = EvaluatorListParams.none()
        ): HttpResponseFor<List<Evaluator>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Evaluator>> =
            list(EvaluatorListParams.none(), requestOptions)
    }
}
