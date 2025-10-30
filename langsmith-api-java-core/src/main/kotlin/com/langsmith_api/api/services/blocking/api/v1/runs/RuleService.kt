// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.runs

import com.google.errorprone.annotations.MustBeClosed
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
import com.langsmith_api.api.services.blocking.api.v1.runs.rules.TriggerService
import java.util.function.Consumer

interface RuleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleService

    fun trigger(): TriggerService

    /** Create a new run rule. */
    fun create(params: RuleCreateParams): RunRulesSchema = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RuleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunRulesSchema

    /** Update a run rule. */
    fun update(ruleId: String, params: RuleUpdateParams): RunRulesSchema =
        update(ruleId, params, RequestOptions.none())

    /** @see update */
    fun update(
        ruleId: String,
        params: RuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunRulesSchema = update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see update */
    fun update(params: RuleUpdateParams): RunRulesSchema = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunRulesSchema

    /** List all run rules. */
    fun list(): List<RunRulesSchema> = list(RuleListParams.none())

    /** @see list */
    fun list(
        params: RuleListParams = RuleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RunRulesSchema>

    /** @see list */
    fun list(params: RuleListParams = RuleListParams.none()): List<RunRulesSchema> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<RunRulesSchema> =
        list(RuleListParams.none(), requestOptions)

    /** Delete a run rule. */
    fun delete(ruleId: String): RuleDeleteResponse = delete(ruleId, RuleDeleteParams.none())

    /** @see delete */
    fun delete(
        ruleId: String,
        params: RuleDeleteParams = RuleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleDeleteResponse = delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see delete */
    fun delete(
        ruleId: String,
        params: RuleDeleteParams = RuleDeleteParams.none(),
    ): RuleDeleteResponse = delete(ruleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RuleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleDeleteResponse

    /** @see delete */
    fun delete(params: RuleDeleteParams): RuleDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(ruleId: String, requestOptions: RequestOptions): RuleDeleteResponse =
        delete(ruleId, RuleDeleteParams.none(), requestOptions)

    /** Get the last applied rule. */
    fun retrieveLastApplied(ruleId: String): RuleLogSchema =
        retrieveLastApplied(ruleId, RuleRetrieveLastAppliedParams.none())

    /** @see retrieveLastApplied */
    fun retrieveLastApplied(
        ruleId: String,
        params: RuleRetrieveLastAppliedParams = RuleRetrieveLastAppliedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleLogSchema =
        retrieveLastApplied(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see retrieveLastApplied */
    fun retrieveLastApplied(
        ruleId: String,
        params: RuleRetrieveLastAppliedParams = RuleRetrieveLastAppliedParams.none(),
    ): RuleLogSchema = retrieveLastApplied(ruleId, params, RequestOptions.none())

    /** @see retrieveLastApplied */
    fun retrieveLastApplied(
        params: RuleRetrieveLastAppliedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleLogSchema

    /** @see retrieveLastApplied */
    fun retrieveLastApplied(params: RuleRetrieveLastAppliedParams): RuleLogSchema =
        retrieveLastApplied(params, RequestOptions.none())

    /** @see retrieveLastApplied */
    fun retrieveLastApplied(ruleId: String, requestOptions: RequestOptions): RuleLogSchema =
        retrieveLastApplied(ruleId, RuleRetrieveLastAppliedParams.none(), requestOptions)

    /** List logs for a particular rule */
    fun retrieveLogs(ruleId: String): List<RuleLogSchema> =
        retrieveLogs(ruleId, RuleRetrieveLogsParams.none())

    /** @see retrieveLogs */
    fun retrieveLogs(
        ruleId: String,
        params: RuleRetrieveLogsParams = RuleRetrieveLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RuleLogSchema> = retrieveLogs(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see retrieveLogs */
    fun retrieveLogs(
        ruleId: String,
        params: RuleRetrieveLogsParams = RuleRetrieveLogsParams.none(),
    ): List<RuleLogSchema> = retrieveLogs(ruleId, params, RequestOptions.none())

    /** @see retrieveLogs */
    fun retrieveLogs(
        params: RuleRetrieveLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RuleLogSchema>

    /** @see retrieveLogs */
    fun retrieveLogs(params: RuleRetrieveLogsParams): List<RuleLogSchema> =
        retrieveLogs(params, RequestOptions.none())

    /** @see retrieveLogs */
    fun retrieveLogs(ruleId: String, requestOptions: RequestOptions): List<RuleLogSchema> =
        retrieveLogs(ruleId, RuleRetrieveLogsParams.none(), requestOptions)

    /** A view of [RuleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleService.WithRawResponse

        fun trigger(): TriggerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/runs/rules`, but is otherwise the same as
         * [RuleService.create].
         */
        @MustBeClosed
        fun create(params: RuleCreateParams): HttpResponseFor<RunRulesSchema> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RuleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunRulesSchema>

        /**
         * Returns a raw HTTP response for `patch /api/v1/runs/rules/{rule_id}`, but is otherwise
         * the same as [RuleService.update].
         */
        @MustBeClosed
        fun update(ruleId: String, params: RuleUpdateParams): HttpResponseFor<RunRulesSchema> =
            update(ruleId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            ruleId: String,
            params: RuleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunRulesSchema> =
            update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: RuleUpdateParams): HttpResponseFor<RunRulesSchema> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RuleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunRulesSchema>

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/rules`, but is otherwise the same as
         * [RuleService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<RunRulesSchema>> = list(RuleListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RuleListParams = RuleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RunRulesSchema>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RuleListParams = RuleListParams.none()
        ): HttpResponseFor<List<RunRulesSchema>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<RunRulesSchema>> =
            list(RuleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/runs/rules/{rule_id}`, but is otherwise
         * the same as [RuleService.delete].
         */
        @MustBeClosed
        fun delete(ruleId: String): HttpResponseFor<RuleDeleteResponse> =
            delete(ruleId, RuleDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            ruleId: String,
            params: RuleDeleteParams = RuleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleDeleteResponse> =
            delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            ruleId: String,
            params: RuleDeleteParams = RuleDeleteParams.none(),
        ): HttpResponseFor<RuleDeleteResponse> = delete(ruleId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RuleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: RuleDeleteParams): HttpResponseFor<RuleDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            ruleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleDeleteResponse> =
            delete(ruleId, RuleDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/rules/{rule_id}/last_applied`, but is
         * otherwise the same as [RuleService.retrieveLastApplied].
         */
        @MustBeClosed
        fun retrieveLastApplied(ruleId: String): HttpResponseFor<RuleLogSchema> =
            retrieveLastApplied(ruleId, RuleRetrieveLastAppliedParams.none())

        /** @see retrieveLastApplied */
        @MustBeClosed
        fun retrieveLastApplied(
            ruleId: String,
            params: RuleRetrieveLastAppliedParams = RuleRetrieveLastAppliedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleLogSchema> =
            retrieveLastApplied(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see retrieveLastApplied */
        @MustBeClosed
        fun retrieveLastApplied(
            ruleId: String,
            params: RuleRetrieveLastAppliedParams = RuleRetrieveLastAppliedParams.none(),
        ): HttpResponseFor<RuleLogSchema> =
            retrieveLastApplied(ruleId, params, RequestOptions.none())

        /** @see retrieveLastApplied */
        @MustBeClosed
        fun retrieveLastApplied(
            params: RuleRetrieveLastAppliedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleLogSchema>

        /** @see retrieveLastApplied */
        @MustBeClosed
        fun retrieveLastApplied(
            params: RuleRetrieveLastAppliedParams
        ): HttpResponseFor<RuleLogSchema> = retrieveLastApplied(params, RequestOptions.none())

        /** @see retrieveLastApplied */
        @MustBeClosed
        fun retrieveLastApplied(
            ruleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleLogSchema> =
            retrieveLastApplied(ruleId, RuleRetrieveLastAppliedParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/runs/rules/{rule_id}/logs`, but is otherwise
         * the same as [RuleService.retrieveLogs].
         */
        @MustBeClosed
        fun retrieveLogs(ruleId: String): HttpResponseFor<List<RuleLogSchema>> =
            retrieveLogs(ruleId, RuleRetrieveLogsParams.none())

        /** @see retrieveLogs */
        @MustBeClosed
        fun retrieveLogs(
            ruleId: String,
            params: RuleRetrieveLogsParams = RuleRetrieveLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RuleLogSchema>> =
            retrieveLogs(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see retrieveLogs */
        @MustBeClosed
        fun retrieveLogs(
            ruleId: String,
            params: RuleRetrieveLogsParams = RuleRetrieveLogsParams.none(),
        ): HttpResponseFor<List<RuleLogSchema>> =
            retrieveLogs(ruleId, params, RequestOptions.none())

        /** @see retrieveLogs */
        @MustBeClosed
        fun retrieveLogs(
            params: RuleRetrieveLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RuleLogSchema>>

        /** @see retrieveLogs */
        @MustBeClosed
        fun retrieveLogs(params: RuleRetrieveLogsParams): HttpResponseFor<List<RuleLogSchema>> =
            retrieveLogs(params, RequestOptions.none())

        /** @see retrieveLogs */
        @MustBeClosed
        fun retrieveLogs(
            ruleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<RuleLogSchema>> =
            retrieveLogs(ruleId, RuleRetrieveLogsParams.none(), requestOptions)
    }
}
