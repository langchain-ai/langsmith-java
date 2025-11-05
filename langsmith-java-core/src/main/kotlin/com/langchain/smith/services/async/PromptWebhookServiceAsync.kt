// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PromptWebhookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromptWebhookServiceAsync

    /** Get a specific prompt webhook. */
    fun retrieve(webhookId: String): CompletableFuture<PromptWebhook> =
        retrieve(webhookId, PromptWebhookRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: PromptWebhookRetrieveParams = PromptWebhookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptWebhook> =
        retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: PromptWebhookRetrieveParams = PromptWebhookRetrieveParams.none(),
    ): CompletableFuture<PromptWebhook> = retrieve(webhookId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PromptWebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptWebhook>

    /** @see retrieve */
    fun retrieve(params: PromptWebhookRetrieveParams): CompletableFuture<PromptWebhook> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromptWebhook> =
        retrieve(webhookId, PromptWebhookRetrieveParams.none(), requestOptions)

    /** Update a specific prompt webhook. */
    fun update(webhookId: String): CompletableFuture<PromptWebhook> =
        update(webhookId, PromptWebhookUpdateParams.none())

    /** @see update */
    fun update(
        webhookId: String,
        params: PromptWebhookUpdateParams = PromptWebhookUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptWebhook> =
        update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see update */
    fun update(
        webhookId: String,
        params: PromptWebhookUpdateParams = PromptWebhookUpdateParams.none(),
    ): CompletableFuture<PromptWebhook> = update(webhookId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PromptWebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptWebhook>

    /** @see update */
    fun update(params: PromptWebhookUpdateParams): CompletableFuture<PromptWebhook> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        webhookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromptWebhook> =
        update(webhookId, PromptWebhookUpdateParams.none(), requestOptions)

    /** Delete a specific prompt webhook. */
    fun delete(webhookId: String): CompletableFuture<PromptWebhookDeleteResponse> =
        delete(webhookId, PromptWebhookDeleteParams.none())

    /** @see delete */
    fun delete(
        webhookId: String,
        params: PromptWebhookDeleteParams = PromptWebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptWebhookDeleteResponse> =
        delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see delete */
    fun delete(
        webhookId: String,
        params: PromptWebhookDeleteParams = PromptWebhookDeleteParams.none(),
    ): CompletableFuture<PromptWebhookDeleteResponse> =
        delete(webhookId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PromptWebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptWebhookDeleteResponse>

    /** @see delete */
    fun delete(params: PromptWebhookDeleteParams): CompletableFuture<PromptWebhookDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        webhookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromptWebhookDeleteResponse> =
        delete(webhookId, PromptWebhookDeleteParams.none(), requestOptions)

    /** Create a new prompt webhook. */
    fun promptWebhooks(
        params: PromptWebhookPromptWebhooksParams
    ): CompletableFuture<PromptWebhook> = promptWebhooks(params, RequestOptions.none())

    /** @see promptWebhooks */
    fun promptWebhooks(
        params: PromptWebhookPromptWebhooksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptWebhook>

    /** List all prompt webhooks for the current tenant. */
    fun retrievePromptWebhooks(): CompletableFuture<List<PromptWebhook>> =
        retrievePromptWebhooks(PromptWebhookRetrievePromptWebhooksParams.none())

    /** @see retrievePromptWebhooks */
    fun retrievePromptWebhooks(
        params: PromptWebhookRetrievePromptWebhooksParams =
            PromptWebhookRetrievePromptWebhooksParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PromptWebhook>>

    /** @see retrievePromptWebhooks */
    fun retrievePromptWebhooks(
        params: PromptWebhookRetrievePromptWebhooksParams =
            PromptWebhookRetrievePromptWebhooksParams.none()
    ): CompletableFuture<List<PromptWebhook>> =
        retrievePromptWebhooks(params, RequestOptions.none())

    /** @see retrievePromptWebhooks */
    fun retrievePromptWebhooks(
        requestOptions: RequestOptions
    ): CompletableFuture<List<PromptWebhook>> =
        retrievePromptWebhooks(PromptWebhookRetrievePromptWebhooksParams.none(), requestOptions)

    /** Test a specific prompt webhook. */
    fun test(params: PromptWebhookTestParams): CompletableFuture<PromptWebhookTestResponse> =
        test(params, RequestOptions.none())

    /** @see test */
    fun test(
        params: PromptWebhookTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptWebhookTestResponse>

    /**
     * A view of [PromptWebhookServiceAsync] that provides access to raw HTTP responses for each
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
        ): PromptWebhookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/prompt-webhooks/{webhook_id}`, but is
         * otherwise the same as [PromptWebhookServiceAsync.retrieve].
         */
        fun retrieve(webhookId: String): CompletableFuture<HttpResponseFor<PromptWebhook>> =
            retrieve(webhookId, PromptWebhookRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            webhookId: String,
            params: PromptWebhookRetrieveParams = PromptWebhookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptWebhook>> =
            retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            webhookId: String,
            params: PromptWebhookRetrieveParams = PromptWebhookRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PromptWebhook>> =
            retrieve(webhookId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PromptWebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptWebhook>>

        /** @see retrieve */
        fun retrieve(
            params: PromptWebhookRetrieveParams
        ): CompletableFuture<HttpResponseFor<PromptWebhook>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromptWebhook>> =
            retrieve(webhookId, PromptWebhookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/prompt-webhooks/{webhook_id}`, but is
         * otherwise the same as [PromptWebhookServiceAsync.update].
         */
        fun update(webhookId: String): CompletableFuture<HttpResponseFor<PromptWebhook>> =
            update(webhookId, PromptWebhookUpdateParams.none())

        /** @see update */
        fun update(
            webhookId: String,
            params: PromptWebhookUpdateParams = PromptWebhookUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptWebhook>> =
            update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see update */
        fun update(
            webhookId: String,
            params: PromptWebhookUpdateParams = PromptWebhookUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<PromptWebhook>> =
            update(webhookId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PromptWebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptWebhook>>

        /** @see update */
        fun update(
            params: PromptWebhookUpdateParams
        ): CompletableFuture<HttpResponseFor<PromptWebhook>> = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromptWebhook>> =
            update(webhookId, PromptWebhookUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/prompt-webhooks/{webhook_id}`, but is
         * otherwise the same as [PromptWebhookServiceAsync.delete].
         */
        fun delete(
            webhookId: String
        ): CompletableFuture<HttpResponseFor<PromptWebhookDeleteResponse>> =
            delete(webhookId, PromptWebhookDeleteParams.none())

        /** @see delete */
        fun delete(
            webhookId: String,
            params: PromptWebhookDeleteParams = PromptWebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptWebhookDeleteResponse>> =
            delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see delete */
        fun delete(
            webhookId: String,
            params: PromptWebhookDeleteParams = PromptWebhookDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<PromptWebhookDeleteResponse>> =
            delete(webhookId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PromptWebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptWebhookDeleteResponse>>

        /** @see delete */
        fun delete(
            params: PromptWebhookDeleteParams
        ): CompletableFuture<HttpResponseFor<PromptWebhookDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromptWebhookDeleteResponse>> =
            delete(webhookId, PromptWebhookDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/prompt-webhooks`, but is otherwise the same
         * as [PromptWebhookServiceAsync.promptWebhooks].
         */
        fun promptWebhooks(
            params: PromptWebhookPromptWebhooksParams
        ): CompletableFuture<HttpResponseFor<PromptWebhook>> =
            promptWebhooks(params, RequestOptions.none())

        /** @see promptWebhooks */
        fun promptWebhooks(
            params: PromptWebhookPromptWebhooksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptWebhook>>

        /**
         * Returns a raw HTTP response for `get /api/v1/prompt-webhooks`, but is otherwise the same
         * as [PromptWebhookServiceAsync.retrievePromptWebhooks].
         */
        fun retrievePromptWebhooks(): CompletableFuture<HttpResponseFor<List<PromptWebhook>>> =
            retrievePromptWebhooks(PromptWebhookRetrievePromptWebhooksParams.none())

        /** @see retrievePromptWebhooks */
        fun retrievePromptWebhooks(
            params: PromptWebhookRetrievePromptWebhooksParams =
                PromptWebhookRetrievePromptWebhooksParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PromptWebhook>>>

        /** @see retrievePromptWebhooks */
        fun retrievePromptWebhooks(
            params: PromptWebhookRetrievePromptWebhooksParams =
                PromptWebhookRetrievePromptWebhooksParams.none()
        ): CompletableFuture<HttpResponseFor<List<PromptWebhook>>> =
            retrievePromptWebhooks(params, RequestOptions.none())

        /** @see retrievePromptWebhooks */
        fun retrievePromptWebhooks(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<PromptWebhook>>> =
            retrievePromptWebhooks(PromptWebhookRetrievePromptWebhooksParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/prompt-webhooks/test`, but is otherwise the
         * same as [PromptWebhookServiceAsync.test].
         */
        fun test(
            params: PromptWebhookTestParams
        ): CompletableFuture<HttpResponseFor<PromptWebhookTestResponse>> =
            test(params, RequestOptions.none())

        /** @see test */
        fun test(
            params: PromptWebhookTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptWebhookTestResponse>>
    }
}
