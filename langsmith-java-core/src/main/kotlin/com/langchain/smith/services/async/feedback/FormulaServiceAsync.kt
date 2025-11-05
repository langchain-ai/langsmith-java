// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.feedback

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FormulaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormulaServiceAsync

    /** Create Feedback Formula Ep */
    fun create(params: FormulaCreateParams): CompletableFuture<FeedbackFormula> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FormulaCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackFormula>

    /** Get Feedback Formula Ep */
    fun retrieve(feedbackFormulaId: String): CompletableFuture<FeedbackFormula> =
        retrieve(feedbackFormulaId, FormulaRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        feedbackFormulaId: String,
        params: FormulaRetrieveParams = FormulaRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackFormula> =
        retrieve(params.toBuilder().feedbackFormulaId(feedbackFormulaId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        feedbackFormulaId: String,
        params: FormulaRetrieveParams = FormulaRetrieveParams.none(),
    ): CompletableFuture<FeedbackFormula> =
        retrieve(feedbackFormulaId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FormulaRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackFormula>

    /** @see retrieve */
    fun retrieve(params: FormulaRetrieveParams): CompletableFuture<FeedbackFormula> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        feedbackFormulaId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackFormula> =
        retrieve(feedbackFormulaId, FormulaRetrieveParams.none(), requestOptions)

    /** Update Feedback Formula Ep */
    fun update(
        feedbackFormulaId: String,
        params: FormulaUpdateParams,
    ): CompletableFuture<FeedbackFormula> = update(feedbackFormulaId, params, RequestOptions.none())

    /** @see update */
    fun update(
        feedbackFormulaId: String,
        params: FormulaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackFormula> =
        update(params.toBuilder().feedbackFormulaId(feedbackFormulaId).build(), requestOptions)

    /** @see update */
    fun update(params: FormulaUpdateParams): CompletableFuture<FeedbackFormula> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FormulaUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackFormula>

    /** List Feedback Formula Ep */
    fun list(): CompletableFuture<List<FeedbackFormula>> = list(FormulaListParams.none())

    /** @see list */
    fun list(
        params: FormulaListParams = FormulaListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FeedbackFormula>>

    /** @see list */
    fun list(
        params: FormulaListParams = FormulaListParams.none()
    ): CompletableFuture<List<FeedbackFormula>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<FeedbackFormula>> =
        list(FormulaListParams.none(), requestOptions)

    /** Delete Feedback Formula Endpoint */
    fun delete(feedbackFormulaId: String): CompletableFuture<FormulaDeleteResponse> =
        delete(feedbackFormulaId, FormulaDeleteParams.none())

    /** @see delete */
    fun delete(
        feedbackFormulaId: String,
        params: FormulaDeleteParams = FormulaDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FormulaDeleteResponse> =
        delete(params.toBuilder().feedbackFormulaId(feedbackFormulaId).build(), requestOptions)

    /** @see delete */
    fun delete(
        feedbackFormulaId: String,
        params: FormulaDeleteParams = FormulaDeleteParams.none(),
    ): CompletableFuture<FormulaDeleteResponse> =
        delete(feedbackFormulaId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FormulaDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FormulaDeleteResponse>

    /** @see delete */
    fun delete(params: FormulaDeleteParams): CompletableFuture<FormulaDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        feedbackFormulaId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FormulaDeleteResponse> =
        delete(feedbackFormulaId, FormulaDeleteParams.none(), requestOptions)

    /**
     * A view of [FormulaServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FormulaServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/feedback/formulas`, but is otherwise the
         * same as [FormulaServiceAsync.create].
         */
        fun create(
            params: FormulaCreateParams
        ): CompletableFuture<HttpResponseFor<FeedbackFormula>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FormulaCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackFormula>>

        /**
         * Returns a raw HTTP response for `get /api/v1/feedback/formulas/{feedback_formula_id}`,
         * but is otherwise the same as [FormulaServiceAsync.retrieve].
         */
        fun retrieve(
            feedbackFormulaId: String
        ): CompletableFuture<HttpResponseFor<FeedbackFormula>> =
            retrieve(feedbackFormulaId, FormulaRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            feedbackFormulaId: String,
            params: FormulaRetrieveParams = FormulaRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackFormula>> =
            retrieve(
                params.toBuilder().feedbackFormulaId(feedbackFormulaId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            feedbackFormulaId: String,
            params: FormulaRetrieveParams = FormulaRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackFormula>> =
            retrieve(feedbackFormulaId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FormulaRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackFormula>>

        /** @see retrieve */
        fun retrieve(
            params: FormulaRetrieveParams
        ): CompletableFuture<HttpResponseFor<FeedbackFormula>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            feedbackFormulaId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackFormula>> =
            retrieve(feedbackFormulaId, FormulaRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/feedback/formulas/{feedback_formula_id}`,
         * but is otherwise the same as [FormulaServiceAsync.update].
         */
        fun update(
            feedbackFormulaId: String,
            params: FormulaUpdateParams,
        ): CompletableFuture<HttpResponseFor<FeedbackFormula>> =
            update(feedbackFormulaId, params, RequestOptions.none())

        /** @see update */
        fun update(
            feedbackFormulaId: String,
            params: FormulaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackFormula>> =
            update(params.toBuilder().feedbackFormulaId(feedbackFormulaId).build(), requestOptions)

        /** @see update */
        fun update(
            params: FormulaUpdateParams
        ): CompletableFuture<HttpResponseFor<FeedbackFormula>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FormulaUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackFormula>>

        /**
         * Returns a raw HTTP response for `get /api/v1/feedback/formulas`, but is otherwise the
         * same as [FormulaServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<FeedbackFormula>>> =
            list(FormulaListParams.none())

        /** @see list */
        fun list(
            params: FormulaListParams = FormulaListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FeedbackFormula>>>

        /** @see list */
        fun list(
            params: FormulaListParams = FormulaListParams.none()
        ): CompletableFuture<HttpResponseFor<List<FeedbackFormula>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<FeedbackFormula>>> =
            list(FormulaListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/feedback/formulas/{feedback_formula_id}`,
         * but is otherwise the same as [FormulaServiceAsync.delete].
         */
        fun delete(
            feedbackFormulaId: String
        ): CompletableFuture<HttpResponseFor<FormulaDeleteResponse>> =
            delete(feedbackFormulaId, FormulaDeleteParams.none())

        /** @see delete */
        fun delete(
            feedbackFormulaId: String,
            params: FormulaDeleteParams = FormulaDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FormulaDeleteResponse>> =
            delete(params.toBuilder().feedbackFormulaId(feedbackFormulaId).build(), requestOptions)

        /** @see delete */
        fun delete(
            feedbackFormulaId: String,
            params: FormulaDeleteParams = FormulaDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<FormulaDeleteResponse>> =
            delete(feedbackFormulaId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FormulaDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FormulaDeleteResponse>>

        /** @see delete */
        fun delete(
            params: FormulaDeleteParams
        ): CompletableFuture<HttpResponseFor<FormulaDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            feedbackFormulaId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FormulaDeleteResponse>> =
            delete(feedbackFormulaId, FormulaDeleteParams.none(), requestOptions)
    }
}
