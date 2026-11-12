// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.evaluators.Evaluator
import com.langchain.smith.models.evaluators.EvaluatorCreateDecisionModelParams
import com.langchain.smith.models.evaluators.EvaluatorListParams
import com.langchain.smith.models.evaluators.EvaluatorListV2PageAsync
import com.langchain.smith.models.evaluators.EvaluatorListV2Params
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

    /**
     * List all run rules.
     *
     * Deprecated: use GET /api/v2/runs/rules, which returns cursor-paginated results.
     */
    @Deprecated(
        "Use listV2 instead, which calls GET /api/v2/runs/rules and returns cursor-paginated results. Will be removed on Apr 1, 2027."
    )
    fun list(): CompletableFuture<List<Evaluator>> = list(EvaluatorListParams.none())

    /** @see list */
    @Deprecated(
        "Use listV2 instead, which calls GET /api/v2/runs/rules and returns cursor-paginated results. Will be removed on Apr 1, 2027."
    )
    fun list(
        params: EvaluatorListParams = EvaluatorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Evaluator>>

    /** @see list */
    @Deprecated(
        "Use listV2 instead, which calls GET /api/v2/runs/rules and returns cursor-paginated results. Will be removed on Apr 1, 2027."
    )
    fun list(
        params: EvaluatorListParams = EvaluatorListParams.none()
    ): CompletableFuture<List<Evaluator>> = list(params, RequestOptions.none())

    /** @see list */
    @Deprecated(
        "Use listV2 instead, which calls GET /api/v2/runs/rules and returns cursor-paginated results. Will be removed on Apr 1, 2027."
    )
    fun list(requestOptions: RequestOptions): CompletableFuture<List<Evaluator>> =
        list(EvaluatorListParams.none(), requestOptions)

    /**
     * Create a decision-model evaluator (Jev, SemIf or OpenAI Decisions) from its prompt and
     * questions, and attach it to a project or dataset. Each question's key becomes a feedback key.
     */
    fun createDecisionModel(
        params: EvaluatorCreateDecisionModelParams
    ): CompletableFuture<Evaluator> = createDecisionModel(params, RequestOptions.none())

    /** @see createDecisionModel */
    fun createDecisionModel(
        params: EvaluatorCreateDecisionModelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Evaluator>

    /**
     * List workspace rules in descending updated_at and id order. Filters combine with AND. Pass
     * next_cursor unchanged with the same filters to continue; concurrent changes can affect later
     * pages.
     */
    fun listV2(): CompletableFuture<EvaluatorListV2PageAsync> = listV2(EvaluatorListV2Params.none())

    /** @see listV2 */
    fun listV2(
        params: EvaluatorListV2Params = EvaluatorListV2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EvaluatorListV2PageAsync>

    /** @see listV2 */
    fun listV2(
        params: EvaluatorListV2Params = EvaluatorListV2Params.none()
    ): CompletableFuture<EvaluatorListV2PageAsync> = listV2(params, RequestOptions.none())

    /** @see listV2 */
    fun listV2(requestOptions: RequestOptions): CompletableFuture<EvaluatorListV2PageAsync> =
        listV2(EvaluatorListV2Params.none(), requestOptions)

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
        @Deprecated(
            "Use listV2 instead, which calls GET /api/v2/runs/rules and returns cursor-paginated results. Will be removed on Apr 1, 2027."
        )
        fun list(): CompletableFuture<HttpResponseFor<List<Evaluator>>> =
            list(EvaluatorListParams.none())

        /** @see list */
        @Deprecated(
            "Use listV2 instead, which calls GET /api/v2/runs/rules and returns cursor-paginated results. Will be removed on Apr 1, 2027."
        )
        fun list(
            params: EvaluatorListParams = EvaluatorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Evaluator>>>

        /** @see list */
        @Deprecated(
            "Use listV2 instead, which calls GET /api/v2/runs/rules and returns cursor-paginated results. Will be removed on Apr 1, 2027."
        )
        fun list(
            params: EvaluatorListParams = EvaluatorListParams.none()
        ): CompletableFuture<HttpResponseFor<List<Evaluator>>> = list(params, RequestOptions.none())

        /** @see list */
        @Deprecated(
            "Use listV2 instead, which calls GET /api/v2/runs/rules and returns cursor-paginated results. Will be removed on Apr 1, 2027."
        )
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<Evaluator>>> =
            list(EvaluatorListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/rules/decision-models`, but is
         * otherwise the same as [EvaluatorServiceAsync.createDecisionModel].
         */
        fun createDecisionModel(
            params: EvaluatorCreateDecisionModelParams
        ): CompletableFuture<HttpResponseFor<Evaluator>> =
            createDecisionModel(params, RequestOptions.none())

        /** @see createDecisionModel */
        fun createDecisionModel(
            params: EvaluatorCreateDecisionModelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Evaluator>>

        /**
         * Returns a raw HTTP response for `get /api/v2/runs/rules`, but is otherwise the same as
         * [EvaluatorServiceAsync.listV2].
         */
        fun listV2(): CompletableFuture<HttpResponseFor<EvaluatorListV2PageAsync>> =
            listV2(EvaluatorListV2Params.none())

        /** @see listV2 */
        fun listV2(
            params: EvaluatorListV2Params = EvaluatorListV2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EvaluatorListV2PageAsync>>

        /** @see listV2 */
        fun listV2(
            params: EvaluatorListV2Params = EvaluatorListV2Params.none()
        ): CompletableFuture<HttpResponseFor<EvaluatorListV2PageAsync>> =
            listV2(params, RequestOptions.none())

        /** @see listV2 */
        fun listV2(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EvaluatorListV2PageAsync>> =
            listV2(EvaluatorListV2Params.none(), requestOptions)
    }
}
