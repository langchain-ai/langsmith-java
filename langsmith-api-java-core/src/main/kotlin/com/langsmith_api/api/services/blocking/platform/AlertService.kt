// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.platform

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.platform.alerts.AlertCreateParams
import com.langsmith_api.api.models.platform.alerts.AlertDeleteParams
import com.langsmith_api.api.models.platform.alerts.AlertDeleteResponse
import com.langsmith_api.api.models.platform.alerts.AlertRetrieveParams
import com.langsmith_api.api.models.platform.alerts.AlertRuleResponse
import com.langsmith_api.api.models.platform.alerts.AlertTestParams
import com.langsmith_api.api.models.platform.alerts.AlertTestResponse
import com.langsmith_api.api.models.platform.alerts.AlertUpdateParams
import com.langsmith_api.api.models.platform.alerts.AlertUpdateResponse
import java.util.function.Consumer

interface AlertService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertService

    /**
     * Creates a new alert rule. The request body must be a JSON-encoded alert rule object that
     * follows the CreateAlertRuleRequest schema.
     */
    fun create(sessionId: JsonValue, params: AlertCreateParams): AlertRuleResponse =
        create(sessionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        sessionId: JsonValue,
        params: AlertCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertRuleResponse = create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see create */
    fun create(params: AlertCreateParams): AlertRuleResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AlertCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertRuleResponse

    /** Gets an alert rule. */
    fun retrieve(alertRuleId: JsonValue, params: AlertRetrieveParams): AlertRuleResponse =
        retrieve(alertRuleId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        alertRuleId: JsonValue,
        params: AlertRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertRuleResponse =
        retrieve(params.toBuilder().alertRuleId(alertRuleId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: AlertRetrieveParams): AlertRuleResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AlertRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertRuleResponse

    /** Updates an alert rule. */
    fun update(alertRuleId: JsonValue, params: AlertUpdateParams): AlertUpdateResponse =
        update(alertRuleId, params, RequestOptions.none())

    /** @see update */
    fun update(
        alertRuleId: JsonValue,
        params: AlertUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertUpdateResponse =
        update(params.toBuilder().alertRuleId(alertRuleId).build(), requestOptions)

    /** @see update */
    fun update(params: AlertUpdateParams): AlertUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AlertUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertUpdateResponse

    /** Deletes an alert rule */
    fun delete(alertRuleId: JsonValue, params: AlertDeleteParams): AlertDeleteResponse =
        delete(alertRuleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        alertRuleId: JsonValue,
        params: AlertDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertDeleteResponse =
        delete(params.toBuilder().alertRuleId(alertRuleId).build(), requestOptions)

    /** @see delete */
    fun delete(params: AlertDeleteParams): AlertDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AlertDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertDeleteResponse

    /**
     * Tests an alert action which will fire a notification to all configured recipients if the
     * configuration is valid.
     */
    fun test(sessionId: JsonValue): AlertTestResponse = test(sessionId, AlertTestParams.none())

    /** @see test */
    fun test(
        sessionId: JsonValue,
        params: AlertTestParams = AlertTestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertTestResponse = test(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see test */
    fun test(
        sessionId: JsonValue,
        params: AlertTestParams = AlertTestParams.none(),
    ): AlertTestResponse = test(sessionId, params, RequestOptions.none())

    /** @see test */
    fun test(
        params: AlertTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AlertTestResponse

    /** @see test */
    fun test(params: AlertTestParams): AlertTestResponse = test(params, RequestOptions.none())

    /** @see test */
    fun test(sessionId: JsonValue, requestOptions: RequestOptions): AlertTestResponse =
        test(sessionId, AlertTestParams.none(), requestOptions)

    /** A view of [AlertService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/platform/alerts/{session_id}`, but is otherwise
         * the same as [AlertService.create].
         */
        @MustBeClosed
        fun create(
            sessionId: JsonValue,
            params: AlertCreateParams,
        ): HttpResponseFor<AlertRuleResponse> = create(sessionId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            sessionId: JsonValue,
            params: AlertCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertRuleResponse> =
            create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: AlertCreateParams): HttpResponseFor<AlertRuleResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AlertCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertRuleResponse>

        /**
         * Returns a raw HTTP response for `get /v1/platform/alerts/{session_id}/{alert_rule_id}`,
         * but is otherwise the same as [AlertService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            alertRuleId: JsonValue,
            params: AlertRetrieveParams,
        ): HttpResponseFor<AlertRuleResponse> = retrieve(alertRuleId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            alertRuleId: JsonValue,
            params: AlertRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertRuleResponse> =
            retrieve(params.toBuilder().alertRuleId(alertRuleId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AlertRetrieveParams): HttpResponseFor<AlertRuleResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AlertRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertRuleResponse>

        /**
         * Returns a raw HTTP response for `patch /v1/platform/alerts/{session_id}/{alert_rule_id}`,
         * but is otherwise the same as [AlertService.update].
         */
        @MustBeClosed
        fun update(
            alertRuleId: JsonValue,
            params: AlertUpdateParams,
        ): HttpResponseFor<AlertUpdateResponse> = update(alertRuleId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            alertRuleId: JsonValue,
            params: AlertUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertUpdateResponse> =
            update(params.toBuilder().alertRuleId(alertRuleId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AlertUpdateParams): HttpResponseFor<AlertUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AlertUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/platform/alerts/{session_id}/{alert_rule_id}`, but is otherwise the same as
         * [AlertService.delete].
         */
        @MustBeClosed
        fun delete(
            alertRuleId: JsonValue,
            params: AlertDeleteParams,
        ): HttpResponseFor<AlertDeleteResponse> = delete(alertRuleId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            alertRuleId: JsonValue,
            params: AlertDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertDeleteResponse> =
            delete(params.toBuilder().alertRuleId(alertRuleId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: AlertDeleteParams): HttpResponseFor<AlertDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AlertDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertDeleteResponse>

        /**
         * Returns a raw HTTP response for `post /v1/platform/alerts/{session_id}/test`, but is
         * otherwise the same as [AlertService.test].
         */
        @MustBeClosed
        fun test(sessionId: JsonValue): HttpResponseFor<AlertTestResponse> =
            test(sessionId, AlertTestParams.none())

        /** @see test */
        @MustBeClosed
        fun test(
            sessionId: JsonValue,
            params: AlertTestParams = AlertTestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertTestResponse> =
            test(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see test */
        @MustBeClosed
        fun test(
            sessionId: JsonValue,
            params: AlertTestParams = AlertTestParams.none(),
        ): HttpResponseFor<AlertTestResponse> = test(sessionId, params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(
            params: AlertTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AlertTestResponse>

        /** @see test */
        @MustBeClosed
        fun test(params: AlertTestParams): HttpResponseFor<AlertTestResponse> =
            test(params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(
            sessionId: JsonValue,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlertTestResponse> =
            test(sessionId, AlertTestParams.none(), requestOptions)
    }
}
