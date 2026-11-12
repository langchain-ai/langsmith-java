// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.evaluators.Evaluator
import com.langchain.smith.models.evaluators.EvaluatorCreateDecisionModelParams
import com.langchain.smith.models.evaluators.EvaluatorListParams
import com.langchain.smith.models.evaluators.EvaluatorListV1Params
import com.langchain.smith.models.evaluators.EvaluatorListV2Page
import com.langchain.smith.models.evaluators.EvaluatorListV2Params
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

    /**
     * Create a decision-model evaluator (Jev, SemIf or OpenAI Decisions) from its prompt and
     * questions, and attach it to a project or dataset. Each question's key becomes a feedback key.
     */
    fun createDecisionModel(params: EvaluatorCreateDecisionModelParams): Evaluator =
        createDecisionModel(params, RequestOptions.none())

    /** @see createDecisionModel */
    fun createDecisionModel(
        params: EvaluatorCreateDecisionModelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Evaluator

    /**
     * List workspace rules in descending updated_at and id order. Filters combine with AND. Pass
     * next_cursor unchanged with the same filters to continue; concurrent changes can affect later
     * pages.
     */
    fun listV2(): EvaluatorListV2Page = listV2(EvaluatorListV2Params.none())

    /** @see listV2 */
    fun listV2(
        params: EvaluatorListV2Params = EvaluatorListV2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluatorListV2Page

    /** @see listV2 */
    fun listV2(params: EvaluatorListV2Params = EvaluatorListV2Params.none()): EvaluatorListV2Page =
        listV2(params, RequestOptions.none())

    /** @see listV2 */
    fun listV2(requestOptions: RequestOptions): EvaluatorListV2Page =
        listV2(EvaluatorListV2Params.none(), requestOptions)

    /** List all run rules. */
    fun listV1(): List<Evaluator> = listV1(EvaluatorListV1Params.none())

    /** @see listV1 */
    fun listV1(
        params: EvaluatorListV1Params = EvaluatorListV1Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Evaluator>

    /** @see listV1 */
    fun listV1(params: EvaluatorListV1Params = EvaluatorListV1Params.none()): List<Evaluator> =
        listV1(params, RequestOptions.none())

    /** @see listV1 */
    fun listV1(requestOptions: RequestOptions): List<Evaluator> =
        listV1(EvaluatorListV1Params.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/rules/decision-models`, but is
         * otherwise the same as [EvaluatorService.createDecisionModel].
         */
        @MustBeClosed
        fun createDecisionModel(
            params: EvaluatorCreateDecisionModelParams
        ): HttpResponseFor<Evaluator> = createDecisionModel(params, RequestOptions.none())

        /** @see createDecisionModel */
        @MustBeClosed
        fun createDecisionModel(
            params: EvaluatorCreateDecisionModelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Evaluator>

        /**
         * Returns a raw HTTP response for `get /api/v2/runs/rules`, but is otherwise the same as
         * [EvaluatorService.listV2].
         */
        @MustBeClosed
        fun listV2(): HttpResponseFor<EvaluatorListV2Page> = listV2(EvaluatorListV2Params.none())

        /** @see listV2 */
        @MustBeClosed
        fun listV2(
            params: EvaluatorListV2Params = EvaluatorListV2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluatorListV2Page>

        /** @see listV2 */
        @MustBeClosed
        fun listV2(
            params: EvaluatorListV2Params = EvaluatorListV2Params.none()
        ): HttpResponseFor<EvaluatorListV2Page> = listV2(params, RequestOptions.none())

        /** @see listV2 */
        @MustBeClosed
        fun listV2(requestOptions: RequestOptions): HttpResponseFor<EvaluatorListV2Page> =
            listV2(EvaluatorListV2Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/rules`, but is otherwise the same as
         * [EvaluatorService.listV1].
         */
        @MustBeClosed
        fun listV1(): HttpResponseFor<List<Evaluator>> = listV1(EvaluatorListV1Params.none())

        /** @see listV1 */
        @MustBeClosed
        fun listV1(
            params: EvaluatorListV1Params = EvaluatorListV1Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Evaluator>>

        /** @see listV1 */
        @MustBeClosed
        fun listV1(
            params: EvaluatorListV1Params = EvaluatorListV1Params.none()
        ): HttpResponseFor<List<Evaluator>> = listV1(params, RequestOptions.none())

        /** @see listV1 */
        @MustBeClosed
        fun listV1(requestOptions: RequestOptions): HttpResponseFor<List<Evaluator>> =
            listV1(EvaluatorListV1Params.none(), requestOptions)
    }
}
