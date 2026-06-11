// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.onlineevaluators.BulkDeleteEvaluatorsResponse
import com.langchain.smith.models.onlineevaluators.CreateOnlineEvaluatorRequest
import com.langchain.smith.models.onlineevaluators.CreateOnlineEvaluatorResponse
import com.langchain.smith.models.onlineevaluators.GetOnlineEvaluatorSpendResponse
import com.langchain.smith.models.onlineevaluators.OnlineEvaluator
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorBulkDeleteParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorCreateParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorDeleteParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorListPage
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorListParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorRetrieveParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorSpendParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorUpdateParams
import com.langchain.smith.models.onlineevaluators.UpdateOnlineEvaluatorResponse
import java.util.function.Consumer

interface OnlineEvaluatorService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnlineEvaluatorService

    /** Create a new LLM or code evaluator for the current workspace. */
    fun create(params: OnlineEvaluatorCreateParams): CreateOnlineEvaluatorResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OnlineEvaluatorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateOnlineEvaluatorResponse

    /** @see create */
    fun create(
        createOnlineEvaluatorRequest: CreateOnlineEvaluatorRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateOnlineEvaluatorResponse =
        create(
            OnlineEvaluatorCreateParams.builder()
                .createOnlineEvaluatorRequest(createOnlineEvaluatorRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        createOnlineEvaluatorRequest: CreateOnlineEvaluatorRequest
    ): CreateOnlineEvaluatorResponse = create(createOnlineEvaluatorRequest, RequestOptions.none())

    /** Retrieve a single evaluator by its ID. */
    fun retrieve(evaluatorId: String): OnlineEvaluator =
        retrieve(evaluatorId, OnlineEvaluatorRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        evaluatorId: String,
        params: OnlineEvaluatorRetrieveParams = OnlineEvaluatorRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnlineEvaluator =
        retrieve(params.toBuilder().evaluatorId(evaluatorId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        evaluatorId: String,
        params: OnlineEvaluatorRetrieveParams = OnlineEvaluatorRetrieveParams.none(),
    ): OnlineEvaluator = retrieve(evaluatorId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OnlineEvaluatorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnlineEvaluator

    /** @see retrieve */
    fun retrieve(params: OnlineEvaluatorRetrieveParams): OnlineEvaluator =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(evaluatorId: String, requestOptions: RequestOptions): OnlineEvaluator =
        retrieve(evaluatorId, OnlineEvaluatorRetrieveParams.none(), requestOptions)

    /** Update an existing evaluator's name, LLM configuration, or code configuration. */
    fun update(
        evaluatorId: String,
        params: OnlineEvaluatorUpdateParams,
    ): UpdateOnlineEvaluatorResponse = update(evaluatorId, params, RequestOptions.none())

    /** @see update */
    fun update(
        evaluatorId: String,
        params: OnlineEvaluatorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdateOnlineEvaluatorResponse =
        update(params.toBuilder().evaluatorId(evaluatorId).build(), requestOptions)

    /** @see update */
    fun update(params: OnlineEvaluatorUpdateParams): UpdateOnlineEvaluatorResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OnlineEvaluatorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UpdateOnlineEvaluatorResponse

    /**
     * List evaluators for the current workspace, with optional filtering by type, name, tag,
     * feedback key, or resource ID.
     */
    fun list(): OnlineEvaluatorListPage = list(OnlineEvaluatorListParams.none())

    /** @see list */
    fun list(
        params: OnlineEvaluatorListParams = OnlineEvaluatorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OnlineEvaluatorListPage

    /** @see list */
    fun list(
        params: OnlineEvaluatorListParams = OnlineEvaluatorListParams.none()
    ): OnlineEvaluatorListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OnlineEvaluatorListPage =
        list(OnlineEvaluatorListParams.none(), requestOptions)

    /**
     * Delete an evaluator. When delete_run_rules is true, all run rules referencing this evaluator
     * are deleted first (same tenant). Associated llm_evaluators and code_evaluators rows are
     * removed by foreign-key cascade when the evaluator row is deleted.
     */
    fun delete(evaluatorId: String) = delete(evaluatorId, OnlineEvaluatorDeleteParams.none())

    /** @see delete */
    fun delete(
        evaluatorId: String,
        params: OnlineEvaluatorDeleteParams = OnlineEvaluatorDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().evaluatorId(evaluatorId).build(), requestOptions)

    /** @see delete */
    fun delete(
        evaluatorId: String,
        params: OnlineEvaluatorDeleteParams = OnlineEvaluatorDeleteParams.none(),
    ) = delete(evaluatorId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OnlineEvaluatorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: OnlineEvaluatorDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(evaluatorId: String, requestOptions: RequestOptions) =
        delete(evaluatorId, OnlineEvaluatorDeleteParams.none(), requestOptions)

    /** Delete multiple evaluators by their IDs. Returns per-item success/failure. */
    fun bulkDelete(params: OnlineEvaluatorBulkDeleteParams): BulkDeleteEvaluatorsResponse =
        bulkDelete(params, RequestOptions.none())

    /** @see bulkDelete */
    fun bulkDelete(
        params: OnlineEvaluatorBulkDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkDeleteEvaluatorsResponse

    /**
     * Returns per-day LLM evaluator spend for the requested 7-day period, grouped by evaluator,
     * resource, or run rule. Exactly one of group_by, evaluator_id, session_id, or dataset_id is
     * required. resource_id, type, and feedback_key may be supplied with group_by to narrow listing
     * aggregations.
     */
    fun spend(params: OnlineEvaluatorSpendParams): GetOnlineEvaluatorSpendResponse =
        spend(params, RequestOptions.none())

    /** @see spend */
    fun spend(
        params: OnlineEvaluatorSpendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GetOnlineEvaluatorSpendResponse

    /**
     * A view of [OnlineEvaluatorService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OnlineEvaluatorService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/platform/evaluators`, but is otherwise the same
         * as [OnlineEvaluatorService.create].
         */
        @MustBeClosed
        fun create(
            params: OnlineEvaluatorCreateParams
        ): HttpResponseFor<CreateOnlineEvaluatorResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OnlineEvaluatorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateOnlineEvaluatorResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            createOnlineEvaluatorRequest: CreateOnlineEvaluatorRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateOnlineEvaluatorResponse> =
            create(
                OnlineEvaluatorCreateParams.builder()
                    .createOnlineEvaluatorRequest(createOnlineEvaluatorRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            createOnlineEvaluatorRequest: CreateOnlineEvaluatorRequest
        ): HttpResponseFor<CreateOnlineEvaluatorResponse> =
            create(createOnlineEvaluatorRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /v1/platform/evaluators/{evaluator_id}`, but is
         * otherwise the same as [OnlineEvaluatorService.retrieve].
         */
        @MustBeClosed
        fun retrieve(evaluatorId: String): HttpResponseFor<OnlineEvaluator> =
            retrieve(evaluatorId, OnlineEvaluatorRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            evaluatorId: String,
            params: OnlineEvaluatorRetrieveParams = OnlineEvaluatorRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnlineEvaluator> =
            retrieve(params.toBuilder().evaluatorId(evaluatorId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            evaluatorId: String,
            params: OnlineEvaluatorRetrieveParams = OnlineEvaluatorRetrieveParams.none(),
        ): HttpResponseFor<OnlineEvaluator> = retrieve(evaluatorId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OnlineEvaluatorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnlineEvaluator>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: OnlineEvaluatorRetrieveParams): HttpResponseFor<OnlineEvaluator> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            evaluatorId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OnlineEvaluator> =
            retrieve(evaluatorId, OnlineEvaluatorRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/platform/evaluators/{evaluator_id}`, but is
         * otherwise the same as [OnlineEvaluatorService.update].
         */
        @MustBeClosed
        fun update(
            evaluatorId: String,
            params: OnlineEvaluatorUpdateParams,
        ): HttpResponseFor<UpdateOnlineEvaluatorResponse> =
            update(evaluatorId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            evaluatorId: String,
            params: OnlineEvaluatorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdateOnlineEvaluatorResponse> =
            update(params.toBuilder().evaluatorId(evaluatorId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: OnlineEvaluatorUpdateParams
        ): HttpResponseFor<UpdateOnlineEvaluatorResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OnlineEvaluatorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UpdateOnlineEvaluatorResponse>

        /**
         * Returns a raw HTTP response for `get /v1/platform/evaluators`, but is otherwise the same
         * as [OnlineEvaluatorService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<OnlineEvaluatorListPage> =
            list(OnlineEvaluatorListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnlineEvaluatorListParams = OnlineEvaluatorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OnlineEvaluatorListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OnlineEvaluatorListParams = OnlineEvaluatorListParams.none()
        ): HttpResponseFor<OnlineEvaluatorListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OnlineEvaluatorListPage> =
            list(OnlineEvaluatorListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/platform/evaluators/{evaluator_id}`, but is
         * otherwise the same as [OnlineEvaluatorService.delete].
         */
        @MustBeClosed
        fun delete(evaluatorId: String): HttpResponse =
            delete(evaluatorId, OnlineEvaluatorDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            evaluatorId: String,
            params: OnlineEvaluatorDeleteParams = OnlineEvaluatorDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().evaluatorId(evaluatorId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            evaluatorId: String,
            params: OnlineEvaluatorDeleteParams = OnlineEvaluatorDeleteParams.none(),
        ): HttpResponse = delete(evaluatorId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OnlineEvaluatorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: OnlineEvaluatorDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(evaluatorId: String, requestOptions: RequestOptions): HttpResponse =
            delete(evaluatorId, OnlineEvaluatorDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/platform/evaluators`, but is otherwise the
         * same as [OnlineEvaluatorService.bulkDelete].
         */
        @MustBeClosed
        fun bulkDelete(
            params: OnlineEvaluatorBulkDeleteParams
        ): HttpResponseFor<BulkDeleteEvaluatorsResponse> = bulkDelete(params, RequestOptions.none())

        /** @see bulkDelete */
        @MustBeClosed
        fun bulkDelete(
            params: OnlineEvaluatorBulkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkDeleteEvaluatorsResponse>

        /**
         * Returns a raw HTTP response for `get /v1/platform/evaluators/spend`, but is otherwise the
         * same as [OnlineEvaluatorService.spend].
         */
        @MustBeClosed
        fun spend(
            params: OnlineEvaluatorSpendParams
        ): HttpResponseFor<GetOnlineEvaluatorSpendResponse> = spend(params, RequestOptions.none())

        /** @see spend */
        @MustBeClosed
        fun spend(
            params: OnlineEvaluatorSpendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GetOnlineEvaluatorSpendResponse>
    }
}
