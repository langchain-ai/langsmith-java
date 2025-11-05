// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.feedback

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.feedback.formulas.FeedbackFormula
import com.langchain.smith.models.feedback.formulas.FormulaCreateParams
import com.langchain.smith.models.feedback.formulas.FormulaDeleteParams
import com.langchain.smith.models.feedback.formulas.FormulaDeleteResponse
import com.langchain.smith.models.feedback.formulas.FormulaListParams
import com.langchain.smith.models.feedback.formulas.FormulaRetrieveParams
import com.langchain.smith.models.feedback.formulas.FormulaUpdateParams
import java.util.function.Consumer

interface FormulaService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormulaService

    /** Create Feedback Formula Ep */
    fun create(params: FormulaCreateParams): FeedbackFormula = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FormulaCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackFormula

    /** Get Feedback Formula Ep */
    fun retrieve(feedbackFormulaId: String): FeedbackFormula =
        retrieve(feedbackFormulaId, FormulaRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        feedbackFormulaId: String,
        params: FormulaRetrieveParams = FormulaRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackFormula =
        retrieve(params.toBuilder().feedbackFormulaId(feedbackFormulaId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        feedbackFormulaId: String,
        params: FormulaRetrieveParams = FormulaRetrieveParams.none(),
    ): FeedbackFormula = retrieve(feedbackFormulaId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FormulaRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackFormula

    /** @see retrieve */
    fun retrieve(params: FormulaRetrieveParams): FeedbackFormula =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(feedbackFormulaId: String, requestOptions: RequestOptions): FeedbackFormula =
        retrieve(feedbackFormulaId, FormulaRetrieveParams.none(), requestOptions)

    /** Update Feedback Formula Ep */
    fun update(feedbackFormulaId: String, params: FormulaUpdateParams): FeedbackFormula =
        update(feedbackFormulaId, params, RequestOptions.none())

    /** @see update */
    fun update(
        feedbackFormulaId: String,
        params: FormulaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackFormula =
        update(params.toBuilder().feedbackFormulaId(feedbackFormulaId).build(), requestOptions)

    /** @see update */
    fun update(params: FormulaUpdateParams): FeedbackFormula = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FormulaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackFormula

    /** List Feedback Formula Ep */
    fun list(): List<FeedbackFormula> = list(FormulaListParams.none())

    /** @see list */
    fun list(
        params: FormulaListParams = FormulaListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FeedbackFormula>

    /** @see list */
    fun list(params: FormulaListParams = FormulaListParams.none()): List<FeedbackFormula> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<FeedbackFormula> =
        list(FormulaListParams.none(), requestOptions)

    /** Delete Feedback Formula Endpoint */
    fun delete(feedbackFormulaId: String): FormulaDeleteResponse =
        delete(feedbackFormulaId, FormulaDeleteParams.none())

    /** @see delete */
    fun delete(
        feedbackFormulaId: String,
        params: FormulaDeleteParams = FormulaDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FormulaDeleteResponse =
        delete(params.toBuilder().feedbackFormulaId(feedbackFormulaId).build(), requestOptions)

    /** @see delete */
    fun delete(
        feedbackFormulaId: String,
        params: FormulaDeleteParams = FormulaDeleteParams.none(),
    ): FormulaDeleteResponse = delete(feedbackFormulaId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FormulaDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FormulaDeleteResponse

    /** @see delete */
    fun delete(params: FormulaDeleteParams): FormulaDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(feedbackFormulaId: String, requestOptions: RequestOptions): FormulaDeleteResponse =
        delete(feedbackFormulaId, FormulaDeleteParams.none(), requestOptions)

    /** A view of [FormulaService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormulaService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/feedback/formulas`, but is otherwise the
         * same as [FormulaService.create].
         */
        @MustBeClosed
        fun create(params: FormulaCreateParams): HttpResponseFor<FeedbackFormula> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FormulaCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackFormula>

        /**
         * Returns a raw HTTP response for `get /api/v1/feedback/formulas/{feedback_formula_id}`,
         * but is otherwise the same as [FormulaService.retrieve].
         */
        @MustBeClosed
        fun retrieve(feedbackFormulaId: String): HttpResponseFor<FeedbackFormula> =
            retrieve(feedbackFormulaId, FormulaRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            feedbackFormulaId: String,
            params: FormulaRetrieveParams = FormulaRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackFormula> =
            retrieve(
                params.toBuilder().feedbackFormulaId(feedbackFormulaId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            feedbackFormulaId: String,
            params: FormulaRetrieveParams = FormulaRetrieveParams.none(),
        ): HttpResponseFor<FeedbackFormula> =
            retrieve(feedbackFormulaId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FormulaRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackFormula>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FormulaRetrieveParams): HttpResponseFor<FeedbackFormula> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            feedbackFormulaId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackFormula> =
            retrieve(feedbackFormulaId, FormulaRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/feedback/formulas/{feedback_formula_id}`,
         * but is otherwise the same as [FormulaService.update].
         */
        @MustBeClosed
        fun update(
            feedbackFormulaId: String,
            params: FormulaUpdateParams,
        ): HttpResponseFor<FeedbackFormula> =
            update(feedbackFormulaId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            feedbackFormulaId: String,
            params: FormulaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackFormula> =
            update(params.toBuilder().feedbackFormulaId(feedbackFormulaId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: FormulaUpdateParams): HttpResponseFor<FeedbackFormula> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FormulaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackFormula>

        /**
         * Returns a raw HTTP response for `get /api/v1/feedback/formulas`, but is otherwise the
         * same as [FormulaService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<FeedbackFormula>> = list(FormulaListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FormulaListParams = FormulaListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FeedbackFormula>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: FormulaListParams = FormulaListParams.none()
        ): HttpResponseFor<List<FeedbackFormula>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<FeedbackFormula>> =
            list(FormulaListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/feedback/formulas/{feedback_formula_id}`,
         * but is otherwise the same as [FormulaService.delete].
         */
        @MustBeClosed
        fun delete(feedbackFormulaId: String): HttpResponseFor<FormulaDeleteResponse> =
            delete(feedbackFormulaId, FormulaDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            feedbackFormulaId: String,
            params: FormulaDeleteParams = FormulaDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FormulaDeleteResponse> =
            delete(params.toBuilder().feedbackFormulaId(feedbackFormulaId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            feedbackFormulaId: String,
            params: FormulaDeleteParams = FormulaDeleteParams.none(),
        ): HttpResponseFor<FormulaDeleteResponse> =
            delete(feedbackFormulaId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FormulaDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FormulaDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: FormulaDeleteParams): HttpResponseFor<FormulaDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            feedbackFormulaId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FormulaDeleteResponse> =
            delete(feedbackFormulaId, FormulaDeleteParams.none(), requestOptions)
    }
}
