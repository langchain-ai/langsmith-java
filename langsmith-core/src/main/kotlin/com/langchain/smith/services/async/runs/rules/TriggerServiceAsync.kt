// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.runs.rules

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.runs.rules.RunRulesSchema
import com.langchain.smith.models.runs.rules.trigger.TriggerCreateParams
import com.langchain.smith.models.runs.rules.trigger.TriggerCreateResponse
import com.langchain.smith.models.runs.rules.trigger.TriggerExecuteParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TriggerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TriggerServiceAsync

    /** Trigger an array of run rules manually. */
    fun create(): CompletableFuture<TriggerCreateResponse> = create(TriggerCreateParams.none())

    /** @see create */
    fun create(
        params: TriggerCreateParams = TriggerCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TriggerCreateResponse>

    /** @see create */
    fun create(
        params: TriggerCreateParams = TriggerCreateParams.none()
    ): CompletableFuture<TriggerCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<TriggerCreateResponse> =
        create(TriggerCreateParams.none(), requestOptions)

    /** Trigger a run rule manually. */
    fun execute(ruleId: String): CompletableFuture<RunRulesSchema> =
        execute(ruleId, TriggerExecuteParams.none())

    /** @see execute */
    fun execute(
        ruleId: String,
        params: TriggerExecuteParams = TriggerExecuteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunRulesSchema> =
        execute(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see execute */
    fun execute(
        ruleId: String,
        params: TriggerExecuteParams = TriggerExecuteParams.none(),
    ): CompletableFuture<RunRulesSchema> = execute(ruleId, params, RequestOptions.none())

    /** @see execute */
    fun execute(
        params: TriggerExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunRulesSchema>

    /** @see execute */
    fun execute(params: TriggerExecuteParams): CompletableFuture<RunRulesSchema> =
        execute(params, RequestOptions.none())

    /** @see execute */
    fun execute(ruleId: String, requestOptions: RequestOptions): CompletableFuture<RunRulesSchema> =
        execute(ruleId, TriggerExecuteParams.none(), requestOptions)

    /**
     * A view of [TriggerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TriggerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/rules/trigger`, but is otherwise the
         * same as [TriggerServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<TriggerCreateResponse>> =
            create(TriggerCreateParams.none())

        /** @see create */
        fun create(
            params: TriggerCreateParams = TriggerCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TriggerCreateResponse>>

        /** @see create */
        fun create(
            params: TriggerCreateParams = TriggerCreateParams.none()
        ): CompletableFuture<HttpResponseFor<TriggerCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TriggerCreateResponse>> =
            create(TriggerCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/rules/{rule_id}/trigger`, but is
         * otherwise the same as [TriggerServiceAsync.execute].
         */
        fun execute(ruleId: String): CompletableFuture<HttpResponseFor<RunRulesSchema>> =
            execute(ruleId, TriggerExecuteParams.none())

        /** @see execute */
        fun execute(
            ruleId: String,
            params: TriggerExecuteParams = TriggerExecuteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunRulesSchema>> =
            execute(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see execute */
        fun execute(
            ruleId: String,
            params: TriggerExecuteParams = TriggerExecuteParams.none(),
        ): CompletableFuture<HttpResponseFor<RunRulesSchema>> =
            execute(ruleId, params, RequestOptions.none())

        /** @see execute */
        fun execute(
            params: TriggerExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunRulesSchema>>

        /** @see execute */
        fun execute(
            params: TriggerExecuteParams
        ): CompletableFuture<HttpResponseFor<RunRulesSchema>> =
            execute(params, RequestOptions.none())

        /** @see execute */
        fun execute(
            ruleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunRulesSchema>> =
            execute(ruleId, TriggerExecuteParams.none(), requestOptions)
    }
}
