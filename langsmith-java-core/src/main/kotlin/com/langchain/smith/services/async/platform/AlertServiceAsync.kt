// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.platform

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.platform.alerts.AlertCreateParams
import com.langchain.smith.models.platform.alerts.AlertDeleteParams
import com.langchain.smith.models.platform.alerts.AlertDeleteResponse
import com.langchain.smith.models.platform.alerts.AlertRetrieveParams
import com.langchain.smith.models.platform.alerts.AlertRuleResponse
import com.langchain.smith.models.platform.alerts.AlertTestParams
import com.langchain.smith.models.platform.alerts.AlertTestResponse
import com.langchain.smith.models.platform.alerts.AlertUpdateParams
import com.langchain.smith.models.platform.alerts.AlertUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AlertServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AlertServiceAsync

    /**
     * Creates a new alert rule. The request body must be a JSON-encoded alert rule object that
     * follows the CreateAlertRuleRequest schema.
     */
    fun create(
        sessionId: JsonValue,
        params: AlertCreateParams,
    ): CompletableFuture<AlertRuleResponse> = create(sessionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        sessionId: JsonValue,
        params: AlertCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlertRuleResponse> =
        create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see create */
    fun create(params: AlertCreateParams): CompletableFuture<AlertRuleResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AlertCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlertRuleResponse>

    /** Gets an alert rule. */
    fun retrieve(
        alertRuleId: JsonValue,
        params: AlertRetrieveParams,
    ): CompletableFuture<AlertRuleResponse> = retrieve(alertRuleId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        alertRuleId: JsonValue,
        params: AlertRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlertRuleResponse> =
        retrieve(params.toBuilder().alertRuleId(alertRuleId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: AlertRetrieveParams): CompletableFuture<AlertRuleResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AlertRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlertRuleResponse>

    /** Updates an alert rule. */
    fun update(
        alertRuleId: JsonValue,
        params: AlertUpdateParams,
    ): CompletableFuture<AlertUpdateResponse> = update(alertRuleId, params, RequestOptions.none())

    /** @see update */
    fun update(
        alertRuleId: JsonValue,
        params: AlertUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlertUpdateResponse> =
        update(params.toBuilder().alertRuleId(alertRuleId).build(), requestOptions)

    /** @see update */
    fun update(params: AlertUpdateParams): CompletableFuture<AlertUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AlertUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlertUpdateResponse>

    /** Deletes an alert rule */
    fun delete(
        alertRuleId: JsonValue,
        params: AlertDeleteParams,
    ): CompletableFuture<AlertDeleteResponse> = delete(alertRuleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        alertRuleId: JsonValue,
        params: AlertDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlertDeleteResponse> =
        delete(params.toBuilder().alertRuleId(alertRuleId).build(), requestOptions)

    /** @see delete */
    fun delete(params: AlertDeleteParams): CompletableFuture<AlertDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AlertDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlertDeleteResponse>

    /**
     * Tests an alert action which will fire a notification to all configured recipients if the
     * configuration is valid.
     */
    fun test(sessionId: JsonValue): CompletableFuture<AlertTestResponse> =
        test(sessionId, AlertTestParams.none())

    /** @see test */
    fun test(
        sessionId: JsonValue,
        params: AlertTestParams = AlertTestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlertTestResponse> =
        test(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see test */
    fun test(
        sessionId: JsonValue,
        params: AlertTestParams = AlertTestParams.none(),
    ): CompletableFuture<AlertTestResponse> = test(sessionId, params, RequestOptions.none())

    /** @see test */
    fun test(
        params: AlertTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AlertTestResponse>

    /** @see test */
    fun test(params: AlertTestParams): CompletableFuture<AlertTestResponse> =
        test(params, RequestOptions.none())

    /** @see test */
    fun test(
        sessionId: JsonValue,
        requestOptions: RequestOptions,
    ): CompletableFuture<AlertTestResponse> =
        test(sessionId, AlertTestParams.none(), requestOptions)

    /** A view of [AlertServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AlertServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/platform/alerts/{session_id}`, but is otherwise
         * the same as [AlertServiceAsync.create].
         */
        fun create(
            sessionId: JsonValue,
            params: AlertCreateParams,
        ): CompletableFuture<HttpResponseFor<AlertRuleResponse>> =
            create(sessionId, params, RequestOptions.none())

        /** @see create */
        fun create(
            sessionId: JsonValue,
            params: AlertCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlertRuleResponse>> =
            create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see create */
        fun create(
            params: AlertCreateParams
        ): CompletableFuture<HttpResponseFor<AlertRuleResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AlertCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlertRuleResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/platform/alerts/{session_id}/{alert_rule_id}`,
         * but is otherwise the same as [AlertServiceAsync.retrieve].
         */
        fun retrieve(
            alertRuleId: JsonValue,
            params: AlertRetrieveParams,
        ): CompletableFuture<HttpResponseFor<AlertRuleResponse>> =
            retrieve(alertRuleId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            alertRuleId: JsonValue,
            params: AlertRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlertRuleResponse>> =
            retrieve(params.toBuilder().alertRuleId(alertRuleId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: AlertRetrieveParams
        ): CompletableFuture<HttpResponseFor<AlertRuleResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AlertRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlertRuleResponse>>

        /**
         * Returns a raw HTTP response for `patch /v1/platform/alerts/{session_id}/{alert_rule_id}`,
         * but is otherwise the same as [AlertServiceAsync.update].
         */
        fun update(
            alertRuleId: JsonValue,
            params: AlertUpdateParams,
        ): CompletableFuture<HttpResponseFor<AlertUpdateResponse>> =
            update(alertRuleId, params, RequestOptions.none())

        /** @see update */
        fun update(
            alertRuleId: JsonValue,
            params: AlertUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlertUpdateResponse>> =
            update(params.toBuilder().alertRuleId(alertRuleId).build(), requestOptions)

        /** @see update */
        fun update(
            params: AlertUpdateParams
        ): CompletableFuture<HttpResponseFor<AlertUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AlertUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlertUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/platform/alerts/{session_id}/{alert_rule_id}`, but is otherwise the same as
         * [AlertServiceAsync.delete].
         */
        fun delete(
            alertRuleId: JsonValue,
            params: AlertDeleteParams,
        ): CompletableFuture<HttpResponseFor<AlertDeleteResponse>> =
            delete(alertRuleId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            alertRuleId: JsonValue,
            params: AlertDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlertDeleteResponse>> =
            delete(params.toBuilder().alertRuleId(alertRuleId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: AlertDeleteParams
        ): CompletableFuture<HttpResponseFor<AlertDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AlertDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlertDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/platform/alerts/{session_id}/test`, but is
         * otherwise the same as [AlertServiceAsync.test].
         */
        fun test(sessionId: JsonValue): CompletableFuture<HttpResponseFor<AlertTestResponse>> =
            test(sessionId, AlertTestParams.none())

        /** @see test */
        fun test(
            sessionId: JsonValue,
            params: AlertTestParams = AlertTestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlertTestResponse>> =
            test(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see test */
        fun test(
            sessionId: JsonValue,
            params: AlertTestParams = AlertTestParams.none(),
        ): CompletableFuture<HttpResponseFor<AlertTestResponse>> =
            test(sessionId, params, RequestOptions.none())

        /** @see test */
        fun test(
            params: AlertTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AlertTestResponse>>

        /** @see test */
        fun test(params: AlertTestParams): CompletableFuture<HttpResponseFor<AlertTestResponse>> =
            test(params, RequestOptions.none())

        /** @see test */
        fun test(
            sessionId: JsonValue,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AlertTestResponse>> =
            test(sessionId, AlertTestParams.none(), requestOptions)
    }
}
