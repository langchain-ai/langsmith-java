// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorListPageAsync
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorListParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorRetrieveParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorSpendParams
import com.langchain.smith.models.onlineevaluators.OnlineEvaluatorUpdateParams
import com.langchain.smith.models.onlineevaluators.UpdateOnlineEvaluatorResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OnlineEvaluatorServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OnlineEvaluatorServiceAsync

    /** Create a new LLM or code evaluator for the current workspace. */
    fun create(
        params: OnlineEvaluatorCreateParams
    ): CompletableFuture<CreateOnlineEvaluatorResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OnlineEvaluatorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateOnlineEvaluatorResponse>

    /** @see create */
    fun create(
        createOnlineEvaluatorRequest: CreateOnlineEvaluatorRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateOnlineEvaluatorResponse> =
        create(
            OnlineEvaluatorCreateParams.builder()
                .createOnlineEvaluatorRequest(createOnlineEvaluatorRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        createOnlineEvaluatorRequest: CreateOnlineEvaluatorRequest
    ): CompletableFuture<CreateOnlineEvaluatorResponse> =
        create(createOnlineEvaluatorRequest, RequestOptions.none())

    /** Retrieve a single evaluator by its ID. */
    fun retrieve(evaluatorId: String): CompletableFuture<OnlineEvaluator> =
        retrieve(evaluatorId, OnlineEvaluatorRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        evaluatorId: String,
        params: OnlineEvaluatorRetrieveParams = OnlineEvaluatorRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnlineEvaluator> =
        retrieve(params.toBuilder().evaluatorId(evaluatorId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        evaluatorId: String,
        params: OnlineEvaluatorRetrieveParams = OnlineEvaluatorRetrieveParams.none(),
    ): CompletableFuture<OnlineEvaluator> = retrieve(evaluatorId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OnlineEvaluatorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnlineEvaluator>

    /** @see retrieve */
    fun retrieve(params: OnlineEvaluatorRetrieveParams): CompletableFuture<OnlineEvaluator> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        evaluatorId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OnlineEvaluator> =
        retrieve(evaluatorId, OnlineEvaluatorRetrieveParams.none(), requestOptions)

    /** Update an existing evaluator's name, LLM configuration, or code configuration. */
    fun update(
        evaluatorId: String,
        params: OnlineEvaluatorUpdateParams,
    ): CompletableFuture<UpdateOnlineEvaluatorResponse> =
        update(evaluatorId, params, RequestOptions.none())

    /** @see update */
    fun update(
        evaluatorId: String,
        params: OnlineEvaluatorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UpdateOnlineEvaluatorResponse> =
        update(params.toBuilder().evaluatorId(evaluatorId).build(), requestOptions)

    /** @see update */
    fun update(
        params: OnlineEvaluatorUpdateParams
    ): CompletableFuture<UpdateOnlineEvaluatorResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OnlineEvaluatorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UpdateOnlineEvaluatorResponse>

    /**
     * List evaluators for the current workspace, with optional filtering by type, name, tag,
     * feedback key, or resource ID.
     */
    fun list(): CompletableFuture<OnlineEvaluatorListPageAsync> =
        list(OnlineEvaluatorListParams.none())

    /** @see list */
    fun list(
        params: OnlineEvaluatorListParams = OnlineEvaluatorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OnlineEvaluatorListPageAsync>

    /** @see list */
    fun list(
        params: OnlineEvaluatorListParams = OnlineEvaluatorListParams.none()
    ): CompletableFuture<OnlineEvaluatorListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OnlineEvaluatorListPageAsync> =
        list(OnlineEvaluatorListParams.none(), requestOptions)

    /**
     * Delete an evaluator. When delete_run_rules is true, all run rules referencing this evaluator
     * are deleted first (same tenant). Associated llm_evaluators and code_evaluators rows are
     * removed by foreign-key cascade when the evaluator row is deleted.
     */
    fun delete(evaluatorId: String): CompletableFuture<Void?> =
        delete(evaluatorId, OnlineEvaluatorDeleteParams.none())

    /** @see delete */
    fun delete(
        evaluatorId: String,
        params: OnlineEvaluatorDeleteParams = OnlineEvaluatorDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().evaluatorId(evaluatorId).build(), requestOptions)

    /** @see delete */
    fun delete(
        evaluatorId: String,
        params: OnlineEvaluatorDeleteParams = OnlineEvaluatorDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(evaluatorId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OnlineEvaluatorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: OnlineEvaluatorDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(evaluatorId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(evaluatorId, OnlineEvaluatorDeleteParams.none(), requestOptions)

    /** Delete multiple evaluators by their IDs. Returns per-item success/failure. */
    fun bulkDelete(
        params: OnlineEvaluatorBulkDeleteParams
    ): CompletableFuture<BulkDeleteEvaluatorsResponse> = bulkDelete(params, RequestOptions.none())

    /** @see bulkDelete */
    fun bulkDelete(
        params: OnlineEvaluatorBulkDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkDeleteEvaluatorsResponse>

    /**
     * Returns per-day LLM evaluator spend for the requested 7-day period, grouped by evaluator,
     * resource, or run rule. Exactly one of group_by, evaluator_id, session_id, or dataset_id is
     * required. resource_id, type, and feedback_key may be supplied with group_by to narrow listing
     * aggregations.
     */
    fun spend(
        params: OnlineEvaluatorSpendParams
    ): CompletableFuture<GetOnlineEvaluatorSpendResponse> = spend(params, RequestOptions.none())

    /** @see spend */
    fun spend(
        params: OnlineEvaluatorSpendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GetOnlineEvaluatorSpendResponse>

    /**
     * A view of [OnlineEvaluatorServiceAsync] that provides access to raw HTTP responses for each
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
        ): OnlineEvaluatorServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/platform/evaluators`, but is otherwise the same
         * as [OnlineEvaluatorServiceAsync.create].
         */
        fun create(
            params: OnlineEvaluatorCreateParams
        ): CompletableFuture<HttpResponseFor<CreateOnlineEvaluatorResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: OnlineEvaluatorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateOnlineEvaluatorResponse>>

        /** @see create */
        fun create(
            createOnlineEvaluatorRequest: CreateOnlineEvaluatorRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateOnlineEvaluatorResponse>> =
            create(
                OnlineEvaluatorCreateParams.builder()
                    .createOnlineEvaluatorRequest(createOnlineEvaluatorRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            createOnlineEvaluatorRequest: CreateOnlineEvaluatorRequest
        ): CompletableFuture<HttpResponseFor<CreateOnlineEvaluatorResponse>> =
            create(createOnlineEvaluatorRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /v1/platform/evaluators/{evaluator_id}`, but is
         * otherwise the same as [OnlineEvaluatorServiceAsync.retrieve].
         */
        fun retrieve(evaluatorId: String): CompletableFuture<HttpResponseFor<OnlineEvaluator>> =
            retrieve(evaluatorId, OnlineEvaluatorRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            evaluatorId: String,
            params: OnlineEvaluatorRetrieveParams = OnlineEvaluatorRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnlineEvaluator>> =
            retrieve(params.toBuilder().evaluatorId(evaluatorId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            evaluatorId: String,
            params: OnlineEvaluatorRetrieveParams = OnlineEvaluatorRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<OnlineEvaluator>> =
            retrieve(evaluatorId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: OnlineEvaluatorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnlineEvaluator>>

        /** @see retrieve */
        fun retrieve(
            params: OnlineEvaluatorRetrieveParams
        ): CompletableFuture<HttpResponseFor<OnlineEvaluator>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            evaluatorId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OnlineEvaluator>> =
            retrieve(evaluatorId, OnlineEvaluatorRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/platform/evaluators/{evaluator_id}`, but is
         * otherwise the same as [OnlineEvaluatorServiceAsync.update].
         */
        fun update(
            evaluatorId: String,
            params: OnlineEvaluatorUpdateParams,
        ): CompletableFuture<HttpResponseFor<UpdateOnlineEvaluatorResponse>> =
            update(evaluatorId, params, RequestOptions.none())

        /** @see update */
        fun update(
            evaluatorId: String,
            params: OnlineEvaluatorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UpdateOnlineEvaluatorResponse>> =
            update(params.toBuilder().evaluatorId(evaluatorId).build(), requestOptions)

        /** @see update */
        fun update(
            params: OnlineEvaluatorUpdateParams
        ): CompletableFuture<HttpResponseFor<UpdateOnlineEvaluatorResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: OnlineEvaluatorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UpdateOnlineEvaluatorResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/platform/evaluators`, but is otherwise the same
         * as [OnlineEvaluatorServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OnlineEvaluatorListPageAsync>> =
            list(OnlineEvaluatorListParams.none())

        /** @see list */
        fun list(
            params: OnlineEvaluatorListParams = OnlineEvaluatorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OnlineEvaluatorListPageAsync>>

        /** @see list */
        fun list(
            params: OnlineEvaluatorListParams = OnlineEvaluatorListParams.none()
        ): CompletableFuture<HttpResponseFor<OnlineEvaluatorListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OnlineEvaluatorListPageAsync>> =
            list(OnlineEvaluatorListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/platform/evaluators/{evaluator_id}`, but is
         * otherwise the same as [OnlineEvaluatorServiceAsync.delete].
         */
        fun delete(evaluatorId: String): CompletableFuture<HttpResponse> =
            delete(evaluatorId, OnlineEvaluatorDeleteParams.none())

        /** @see delete */
        fun delete(
            evaluatorId: String,
            params: OnlineEvaluatorDeleteParams = OnlineEvaluatorDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().evaluatorId(evaluatorId).build(), requestOptions)

        /** @see delete */
        fun delete(
            evaluatorId: String,
            params: OnlineEvaluatorDeleteParams = OnlineEvaluatorDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(evaluatorId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: OnlineEvaluatorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: OnlineEvaluatorDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            evaluatorId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(evaluatorId, OnlineEvaluatorDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/platform/evaluators`, but is otherwise the
         * same as [OnlineEvaluatorServiceAsync.bulkDelete].
         */
        fun bulkDelete(
            params: OnlineEvaluatorBulkDeleteParams
        ): CompletableFuture<HttpResponseFor<BulkDeleteEvaluatorsResponse>> =
            bulkDelete(params, RequestOptions.none())

        /** @see bulkDelete */
        fun bulkDelete(
            params: OnlineEvaluatorBulkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkDeleteEvaluatorsResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/platform/evaluators/spend`, but is otherwise the
         * same as [OnlineEvaluatorServiceAsync.spend].
         */
        fun spend(
            params: OnlineEvaluatorSpendParams
        ): CompletableFuture<HttpResponseFor<GetOnlineEvaluatorSpendResponse>> =
            spend(params, RequestOptions.none())

        /** @see spend */
        fun spend(
            params: OnlineEvaluatorSpendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GetOnlineEvaluatorSpendResponse>>
    }
}
