// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.runs

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.runs.rules.RuleCreateParams
import com.langsmith_api.api.models.api.v1.runs.rules.RuleDeleteParams
import com.langsmith_api.api.models.api.v1.runs.rules.RuleDeleteResponse
import com.langsmith_api.api.models.api.v1.runs.rules.RuleListParams
import com.langsmith_api.api.models.api.v1.runs.rules.RuleLogSchema
import com.langsmith_api.api.models.api.v1.runs.rules.RuleRetrieveLastAppliedParams
import com.langsmith_api.api.models.api.v1.runs.rules.RuleRetrieveLogsParams
import com.langsmith_api.api.models.api.v1.runs.rules.RuleUpdateParams
import com.langsmith_api.api.models.api.v1.runs.rules.RunRulesSchema
import com.langsmith_api.api.services.async.api.v1.runs.rules.TriggerServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RuleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleServiceAsync

    fun trigger(): TriggerServiceAsync

    /** Create a new run rule. */
    fun create(params: RuleCreateParams): CompletableFuture<RunRulesSchema> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RuleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunRulesSchema>

    /** Update a run rule. */
    fun update(ruleId: String, params: RuleUpdateParams): CompletableFuture<RunRulesSchema> =
        update(ruleId, params, RequestOptions.none())

    /** @see update */
    fun update(
        ruleId: String,
        params: RuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunRulesSchema> =
        update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see update */
    fun update(params: RuleUpdateParams): CompletableFuture<RunRulesSchema> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunRulesSchema>

    /** List all run rules. */
    fun list(): CompletableFuture<List<RunRulesSchema>> = list(RuleListParams.none())

    /** @see list */
    fun list(
        params: RuleListParams = RuleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RunRulesSchema>>

    /** @see list */
    fun list(
        params: RuleListParams = RuleListParams.none()
    ): CompletableFuture<List<RunRulesSchema>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<RunRulesSchema>> =
        list(RuleListParams.none(), requestOptions)

    /** Delete a run rule. */
    fun delete(ruleId: String): CompletableFuture<RuleDeleteResponse> =
        delete(ruleId, RuleDeleteParams.none())

    /** @see delete */
    fun delete(
        ruleId: String,
        params: RuleDeleteParams = RuleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleDeleteResponse> =
        delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see delete */
    fun delete(
        ruleId: String,
        params: RuleDeleteParams = RuleDeleteParams.none(),
    ): CompletableFuture<RuleDeleteResponse> = delete(ruleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RuleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleDeleteResponse>

    /** @see delete */
    fun delete(params: RuleDeleteParams): CompletableFuture<RuleDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        ruleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleDeleteResponse> =
        delete(ruleId, RuleDeleteParams.none(), requestOptions)

    /** Get the last applied rule. */
    fun retrieveLastApplied(ruleId: String): CompletableFuture<RuleLogSchema> =
        retrieveLastApplied(ruleId, RuleRetrieveLastAppliedParams.none())

    /** @see retrieveLastApplied */
    fun retrieveLastApplied(
        ruleId: String,
        params: RuleRetrieveLastAppliedParams = RuleRetrieveLastAppliedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleLogSchema> =
        retrieveLastApplied(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see retrieveLastApplied */
    fun retrieveLastApplied(
        ruleId: String,
        params: RuleRetrieveLastAppliedParams = RuleRetrieveLastAppliedParams.none(),
    ): CompletableFuture<RuleLogSchema> = retrieveLastApplied(ruleId, params, RequestOptions.none())

    /** @see retrieveLastApplied */
    fun retrieveLastApplied(
        params: RuleRetrieveLastAppliedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleLogSchema>

    /** @see retrieveLastApplied */
    fun retrieveLastApplied(
        params: RuleRetrieveLastAppliedParams
    ): CompletableFuture<RuleLogSchema> = retrieveLastApplied(params, RequestOptions.none())

    /** @see retrieveLastApplied */
    fun retrieveLastApplied(
        ruleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleLogSchema> =
        retrieveLastApplied(ruleId, RuleRetrieveLastAppliedParams.none(), requestOptions)

    /** List logs for a particular rule */
    fun retrieveLogs(ruleId: String): CompletableFuture<List<RuleLogSchema>> =
        retrieveLogs(ruleId, RuleRetrieveLogsParams.none())

    /** @see retrieveLogs */
    fun retrieveLogs(
        ruleId: String,
        params: RuleRetrieveLogsParams = RuleRetrieveLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RuleLogSchema>> =
        retrieveLogs(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see retrieveLogs */
    fun retrieveLogs(
        ruleId: String,
        params: RuleRetrieveLogsParams = RuleRetrieveLogsParams.none(),
    ): CompletableFuture<List<RuleLogSchema>> = retrieveLogs(ruleId, params, RequestOptions.none())

    /** @see retrieveLogs */
    fun retrieveLogs(
        params: RuleRetrieveLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RuleLogSchema>>

    /** @see retrieveLogs */
    fun retrieveLogs(params: RuleRetrieveLogsParams): CompletableFuture<List<RuleLogSchema>> =
        retrieveLogs(params, RequestOptions.none())

    /** @see retrieveLogs */
    fun retrieveLogs(
        ruleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<RuleLogSchema>> =
        retrieveLogs(ruleId, RuleRetrieveLogsParams.none(), requestOptions)

    /** A view of [RuleServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleServiceAsync.WithRawResponse

        fun trigger(): TriggerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/rules`, but is otherwise the same as
         * [RuleServiceAsync.create].
         */
        fun create(params: RuleCreateParams): CompletableFuture<HttpResponseFor<RunRulesSchema>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RuleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunRulesSchema>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/runs/rules/{rule_id}`, but is otherwise
         * the same as [RuleServiceAsync.update].
         */
        fun update(
            ruleId: String,
            params: RuleUpdateParams,
        ): CompletableFuture<HttpResponseFor<RunRulesSchema>> =
            update(ruleId, params, RequestOptions.none())

        /** @see update */
        fun update(
            ruleId: String,
            params: RuleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunRulesSchema>> =
            update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see update */
        fun update(params: RuleUpdateParams): CompletableFuture<HttpResponseFor<RunRulesSchema>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RuleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunRulesSchema>>

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/rules`, but is otherwise the same as
         * [RuleServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<RunRulesSchema>>> =
            list(RuleListParams.none())

        /** @see list */
        fun list(
            params: RuleListParams = RuleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RunRulesSchema>>>

        /** @see list */
        fun list(
            params: RuleListParams = RuleListParams.none()
        ): CompletableFuture<HttpResponseFor<List<RunRulesSchema>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<RunRulesSchema>>> =
            list(RuleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/runs/rules/{rule_id}`, but is otherwise
         * the same as [RuleServiceAsync.delete].
         */
        fun delete(ruleId: String): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> =
            delete(ruleId, RuleDeleteParams.none())

        /** @see delete */
        fun delete(
            ruleId: String,
            params: RuleDeleteParams = RuleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> =
            delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see delete */
        fun delete(
            ruleId: String,
            params: RuleDeleteParams = RuleDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> =
            delete(ruleId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RuleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>>

        /** @see delete */
        fun delete(
            params: RuleDeleteParams
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            ruleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleDeleteResponse>> =
            delete(ruleId, RuleDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/rules/{rule_id}/last_applied`, but is
         * otherwise the same as [RuleServiceAsync.retrieveLastApplied].
         */
        fun retrieveLastApplied(ruleId: String): CompletableFuture<HttpResponseFor<RuleLogSchema>> =
            retrieveLastApplied(ruleId, RuleRetrieveLastAppliedParams.none())

        /** @see retrieveLastApplied */
        fun retrieveLastApplied(
            ruleId: String,
            params: RuleRetrieveLastAppliedParams = RuleRetrieveLastAppliedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleLogSchema>> =
            retrieveLastApplied(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see retrieveLastApplied */
        fun retrieveLastApplied(
            ruleId: String,
            params: RuleRetrieveLastAppliedParams = RuleRetrieveLastAppliedParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleLogSchema>> =
            retrieveLastApplied(ruleId, params, RequestOptions.none())

        /** @see retrieveLastApplied */
        fun retrieveLastApplied(
            params: RuleRetrieveLastAppliedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleLogSchema>>

        /** @see retrieveLastApplied */
        fun retrieveLastApplied(
            params: RuleRetrieveLastAppliedParams
        ): CompletableFuture<HttpResponseFor<RuleLogSchema>> =
            retrieveLastApplied(params, RequestOptions.none())

        /** @see retrieveLastApplied */
        fun retrieveLastApplied(
            ruleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleLogSchema>> =
            retrieveLastApplied(ruleId, RuleRetrieveLastAppliedParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/rules/{rule_id}/logs`, but is otherwise
         * the same as [RuleServiceAsync.retrieveLogs].
         */
        fun retrieveLogs(ruleId: String): CompletableFuture<HttpResponseFor<List<RuleLogSchema>>> =
            retrieveLogs(ruleId, RuleRetrieveLogsParams.none())

        /** @see retrieveLogs */
        fun retrieveLogs(
            ruleId: String,
            params: RuleRetrieveLogsParams = RuleRetrieveLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RuleLogSchema>>> =
            retrieveLogs(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see retrieveLogs */
        fun retrieveLogs(
            ruleId: String,
            params: RuleRetrieveLogsParams = RuleRetrieveLogsParams.none(),
        ): CompletableFuture<HttpResponseFor<List<RuleLogSchema>>> =
            retrieveLogs(ruleId, params, RequestOptions.none())

        /** @see retrieveLogs */
        fun retrieveLogs(
            params: RuleRetrieveLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RuleLogSchema>>>

        /** @see retrieveLogs */
        fun retrieveLogs(
            params: RuleRetrieveLogsParams
        ): CompletableFuture<HttpResponseFor<List<RuleLogSchema>>> =
            retrieveLogs(params, RequestOptions.none())

        /** @see retrieveLogs */
        fun retrieveLogs(
            ruleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<RuleLogSchema>>> =
            retrieveLogs(ruleId, RuleRetrieveLogsParams.none(), requestOptions)
    }
}
