// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.promptwebhooks.PromptWebhook
import com.langchain.smith.models.promptwebhooks.PromptWebhookDeleteParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookDeleteResponse
import com.langchain.smith.models.promptwebhooks.PromptWebhookPromptWebhooksParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookRetrieveParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookRetrievePromptWebhooksParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookTestParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookTestResponse
import com.langchain.smith.models.promptwebhooks.PromptWebhookUpdateParams
import java.util.function.Consumer

interface PromptWebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromptWebhookService

    /** Get a specific prompt webhook. */
    fun retrieve(webhookId: String): PromptWebhook =
        retrieve(webhookId, PromptWebhookRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: PromptWebhookRetrieveParams = PromptWebhookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptWebhook = retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: PromptWebhookRetrieveParams = PromptWebhookRetrieveParams.none(),
    ): PromptWebhook = retrieve(webhookId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PromptWebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptWebhook

    /** @see retrieve */
    fun retrieve(params: PromptWebhookRetrieveParams): PromptWebhook =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(webhookId: String, requestOptions: RequestOptions): PromptWebhook =
        retrieve(webhookId, PromptWebhookRetrieveParams.none(), requestOptions)

    /** Update a specific prompt webhook. */
    fun update(webhookId: String): PromptWebhook =
        update(webhookId, PromptWebhookUpdateParams.none())

    /** @see update */
    fun update(
        webhookId: String,
        params: PromptWebhookUpdateParams = PromptWebhookUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptWebhook = update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see update */
    fun update(
        webhookId: String,
        params: PromptWebhookUpdateParams = PromptWebhookUpdateParams.none(),
    ): PromptWebhook = update(webhookId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PromptWebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptWebhook

    /** @see update */
    fun update(params: PromptWebhookUpdateParams): PromptWebhook =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(webhookId: String, requestOptions: RequestOptions): PromptWebhook =
        update(webhookId, PromptWebhookUpdateParams.none(), requestOptions)

    /** Delete a specific prompt webhook. */
    fun delete(webhookId: String): PromptWebhookDeleteResponse =
        delete(webhookId, PromptWebhookDeleteParams.none())

    /** @see delete */
    fun delete(
        webhookId: String,
        params: PromptWebhookDeleteParams = PromptWebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptWebhookDeleteResponse =
        delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see delete */
    fun delete(
        webhookId: String,
        params: PromptWebhookDeleteParams = PromptWebhookDeleteParams.none(),
    ): PromptWebhookDeleteResponse = delete(webhookId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PromptWebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptWebhookDeleteResponse

    /** @see delete */
    fun delete(params: PromptWebhookDeleteParams): PromptWebhookDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(webhookId: String, requestOptions: RequestOptions): PromptWebhookDeleteResponse =
        delete(webhookId, PromptWebhookDeleteParams.none(), requestOptions)

    /** Create a new prompt webhook. */
    fun promptWebhooks(params: PromptWebhookPromptWebhooksParams): PromptWebhook =
        promptWebhooks(params, RequestOptions.none())

    /** @see promptWebhooks */
    fun promptWebhooks(
        params: PromptWebhookPromptWebhooksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptWebhook

    /** List all prompt webhooks for the current tenant. */
    fun retrievePromptWebhooks(): List<PromptWebhook> =
        retrievePromptWebhooks(PromptWebhookRetrievePromptWebhooksParams.none())

    /** @see retrievePromptWebhooks */
    fun retrievePromptWebhooks(
        params: PromptWebhookRetrievePromptWebhooksParams =
            PromptWebhookRetrievePromptWebhooksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PromptWebhook>

    /** @see retrievePromptWebhooks */
    fun retrievePromptWebhooks(
        params: PromptWebhookRetrievePromptWebhooksParams =
            PromptWebhookRetrievePromptWebhooksParams.none()
    ): List<PromptWebhook> = retrievePromptWebhooks(params, RequestOptions.none())

    /** @see retrievePromptWebhooks */
    fun retrievePromptWebhooks(requestOptions: RequestOptions): List<PromptWebhook> =
        retrievePromptWebhooks(PromptWebhookRetrievePromptWebhooksParams.none(), requestOptions)

    /** Test a specific prompt webhook. */
    fun test(params: PromptWebhookTestParams): PromptWebhookTestResponse =
        test(params, RequestOptions.none())

    /** @see test */
    fun test(
        params: PromptWebhookTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptWebhookTestResponse

    /**
     * A view of [PromptWebhookService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromptWebhookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/prompt-webhooks/{webhook_id}`, but is
         * otherwise the same as [PromptWebhookService.retrieve].
         */
        @MustBeClosed
        fun retrieve(webhookId: String): HttpResponseFor<PromptWebhook> =
            retrieve(webhookId, PromptWebhookRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            webhookId: String,
            params: PromptWebhookRetrieveParams = PromptWebhookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptWebhook> =
            retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            webhookId: String,
            params: PromptWebhookRetrieveParams = PromptWebhookRetrieveParams.none(),
        ): HttpResponseFor<PromptWebhook> = retrieve(webhookId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PromptWebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptWebhook>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PromptWebhookRetrieveParams): HttpResponseFor<PromptWebhook> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            webhookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptWebhook> =
            retrieve(webhookId, PromptWebhookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/prompt-webhooks/{webhook_id}`, but is
         * otherwise the same as [PromptWebhookService.update].
         */
        @MustBeClosed
        fun update(webhookId: String): HttpResponseFor<PromptWebhook> =
            update(webhookId, PromptWebhookUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            webhookId: String,
            params: PromptWebhookUpdateParams = PromptWebhookUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptWebhook> =
            update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            webhookId: String,
            params: PromptWebhookUpdateParams = PromptWebhookUpdateParams.none(),
        ): HttpResponseFor<PromptWebhook> = update(webhookId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PromptWebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptWebhook>

        /** @see update */
        @MustBeClosed
        fun update(params: PromptWebhookUpdateParams): HttpResponseFor<PromptWebhook> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            webhookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptWebhook> =
            update(webhookId, PromptWebhookUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/prompt-webhooks/{webhook_id}`, but is
         * otherwise the same as [PromptWebhookService.delete].
         */
        @MustBeClosed
        fun delete(webhookId: String): HttpResponseFor<PromptWebhookDeleteResponse> =
            delete(webhookId, PromptWebhookDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            webhookId: String,
            params: PromptWebhookDeleteParams = PromptWebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptWebhookDeleteResponse> =
            delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            webhookId: String,
            params: PromptWebhookDeleteParams = PromptWebhookDeleteParams.none(),
        ): HttpResponseFor<PromptWebhookDeleteResponse> =
            delete(webhookId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PromptWebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptWebhookDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PromptWebhookDeleteParams
        ): HttpResponseFor<PromptWebhookDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            webhookId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptWebhookDeleteResponse> =
            delete(webhookId, PromptWebhookDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/prompt-webhooks`, but is otherwise the same
         * as [PromptWebhookService.promptWebhooks].
         */
        @MustBeClosed
        fun promptWebhooks(
            params: PromptWebhookPromptWebhooksParams
        ): HttpResponseFor<PromptWebhook> = promptWebhooks(params, RequestOptions.none())

        /** @see promptWebhooks */
        @MustBeClosed
        fun promptWebhooks(
            params: PromptWebhookPromptWebhooksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptWebhook>

        /**
         * Returns a raw HTTP response for `get /api/v1/prompt-webhooks`, but is otherwise the same
         * as [PromptWebhookService.retrievePromptWebhooks].
         */
        @MustBeClosed
        fun retrievePromptWebhooks(): HttpResponseFor<List<PromptWebhook>> =
            retrievePromptWebhooks(PromptWebhookRetrievePromptWebhooksParams.none())

        /** @see retrievePromptWebhooks */
        @MustBeClosed
        fun retrievePromptWebhooks(
            params: PromptWebhookRetrievePromptWebhooksParams =
                PromptWebhookRetrievePromptWebhooksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PromptWebhook>>

        /** @see retrievePromptWebhooks */
        @MustBeClosed
        fun retrievePromptWebhooks(
            params: PromptWebhookRetrievePromptWebhooksParams =
                PromptWebhookRetrievePromptWebhooksParams.none()
        ): HttpResponseFor<List<PromptWebhook>> =
            retrievePromptWebhooks(params, RequestOptions.none())

        /** @see retrievePromptWebhooks */
        @MustBeClosed
        fun retrievePromptWebhooks(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<PromptWebhook>> =
            retrievePromptWebhooks(PromptWebhookRetrievePromptWebhooksParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/prompt-webhooks/test`, but is otherwise the
         * same as [PromptWebhookService.test].
         */
        @MustBeClosed
        fun test(params: PromptWebhookTestParams): HttpResponseFor<PromptWebhookTestResponse> =
            test(params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(
            params: PromptWebhookTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptWebhookTestResponse>
    }
}
