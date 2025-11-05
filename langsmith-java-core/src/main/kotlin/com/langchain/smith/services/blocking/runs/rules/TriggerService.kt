// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.runs.rules

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.runs.rules.RunRulesSchema
import com.langchain.smith.models.runs.rules.trigger.TriggerCreateParams
import com.langchain.smith.models.runs.rules.trigger.TriggerCreateResponse
import com.langchain.smith.models.runs.rules.trigger.TriggerExecuteParams
import java.util.function.Consumer

interface TriggerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TriggerService

    /** Trigger an array of run rules manually. */
    fun create(): TriggerCreateResponse = create(TriggerCreateParams.none())

    /** @see create */
    fun create(
        params: TriggerCreateParams = TriggerCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TriggerCreateResponse

    /** @see create */
    fun create(params: TriggerCreateParams = TriggerCreateParams.none()): TriggerCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): TriggerCreateResponse =
        create(TriggerCreateParams.none(), requestOptions)

    /** Trigger a run rule manually. */
    fun execute(ruleId: String): RunRulesSchema = execute(ruleId, TriggerExecuteParams.none())

    /** @see execute */
    fun execute(
        ruleId: String,
        params: TriggerExecuteParams = TriggerExecuteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunRulesSchema = execute(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see execute */
    fun execute(
        ruleId: String,
        params: TriggerExecuteParams = TriggerExecuteParams.none(),
    ): RunRulesSchema = execute(ruleId, params, RequestOptions.none())

    /** @see execute */
    fun execute(
        params: TriggerExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunRulesSchema

    /** @see execute */
    fun execute(params: TriggerExecuteParams): RunRulesSchema =
        execute(params, RequestOptions.none())

    /** @see execute */
    fun execute(ruleId: String, requestOptions: RequestOptions): RunRulesSchema =
        execute(ruleId, TriggerExecuteParams.none(), requestOptions)

    /** A view of [TriggerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TriggerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/rules/trigger`, but is otherwise the
         * same as [TriggerService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<TriggerCreateResponse> = create(TriggerCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TriggerCreateParams = TriggerCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TriggerCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: TriggerCreateParams = TriggerCreateParams.none()
        ): HttpResponseFor<TriggerCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<TriggerCreateResponse> =
            create(TriggerCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/rules/{rule_id}/trigger`, but is
         * otherwise the same as [TriggerService.execute].
         */
        @MustBeClosed
        fun execute(ruleId: String): HttpResponseFor<RunRulesSchema> =
            execute(ruleId, TriggerExecuteParams.none())

        /** @see execute */
        @MustBeClosed
        fun execute(
            ruleId: String,
            params: TriggerExecuteParams = TriggerExecuteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunRulesSchema> =
            execute(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see execute */
        @MustBeClosed
        fun execute(
            ruleId: String,
            params: TriggerExecuteParams = TriggerExecuteParams.none(),
        ): HttpResponseFor<RunRulesSchema> = execute(ruleId, params, RequestOptions.none())

        /** @see execute */
        @MustBeClosed
        fun execute(
            params: TriggerExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunRulesSchema>

        /** @see execute */
        @MustBeClosed
        fun execute(params: TriggerExecuteParams): HttpResponseFor<RunRulesSchema> =
            execute(params, RequestOptions.none())

        /** @see execute */
        @MustBeClosed
        fun execute(
            ruleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunRulesSchema> =
            execute(ruleId, TriggerExecuteParams.none(), requestOptions)
    }
}
