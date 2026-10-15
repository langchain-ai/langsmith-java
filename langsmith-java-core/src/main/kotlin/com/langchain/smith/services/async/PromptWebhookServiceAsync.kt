// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.promptwebhooks.PromptWebhook
import com.langchain.smith.models.promptwebhooks.PromptWebhookCreateParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookDeleteParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookListParams
import com.langchain.smith.models.promptwebhooks.PromptWebhookRetrieveParams
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

    /**
     * Create a new prompt webhook.
     *
     * LangSmith sends a POST request to the webhook URL for each event listed in triggers on the
     * prompts it matches. A workspace can have one prompt webhook unless its limit was raised;
     * creating one past the limit returns 400.
     */
    fun create(params: PromptWebhookCreateParams): CompletableFuture<PromptWebhook> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PromptWebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptWebhook>

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

    /**
     * Update a specific prompt webhook.
     *
     * Omitted fields keep their current values; list fields and headers that are set replace the
     * stored values.
     */
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

    /** List all prompt webhooks for the current tenant. */
    fun list(): CompletableFuture<List<PromptWebhook>> = list(PromptWebhookListParams.none())

    /** @see list */
    fun list(
        params: PromptWebhookListParams = PromptWebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PromptWebhook>>

    /** @see list */
    fun list(
        params: PromptWebhookListParams = PromptWebhookListParams.none()
    ): CompletableFuture<List<PromptWebhook>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<PromptWebhook>> =
        list(PromptWebhookListParams.none(), requestOptions)

    /** Delete a specific prompt webhook. */
    fun delete(webhookId: String): CompletableFuture<Void?> =
        delete(webhookId, PromptWebhookDeleteParams.none())

    /** @see delete */
    fun delete(
        webhookId: String,
        params: PromptWebhookDeleteParams = PromptWebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see delete */
    fun delete(
        webhookId: String,
        params: PromptWebhookDeleteParams = PromptWebhookDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(webhookId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PromptWebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: PromptWebhookDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(webhookId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(webhookId, PromptWebhookDeleteParams.none(), requestOptions)

    /**
     * Test a specific prompt webhook.
     *
     * Sends the sample payload to the webhook configuration in the request body without saving it,
     * but only if the webhook's triggers include the payload's event and its prompt filters match
     * the payload's prompt. Otherwise nothing is sent. Fails if the destination does not accept the
     * payload.
     */
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
         * Returns a raw HTTP response for `post /api/v1/prompt-webhooks`, but is otherwise the same
         * as [PromptWebhookServiceAsync.create].
         */
        fun create(
            params: PromptWebhookCreateParams
        ): CompletableFuture<HttpResponseFor<PromptWebhook>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PromptWebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptWebhook>>

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
         * Returns a raw HTTP response for `get /api/v1/prompt-webhooks`, but is otherwise the same
         * as [PromptWebhookServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<PromptWebhook>>> =
            list(PromptWebhookListParams.none())

        /** @see list */
        fun list(
            params: PromptWebhookListParams = PromptWebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PromptWebhook>>>

        /** @see list */
        fun list(
            params: PromptWebhookListParams = PromptWebhookListParams.none()
        ): CompletableFuture<HttpResponseFor<List<PromptWebhook>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<PromptWebhook>>> =
            list(PromptWebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/prompt-webhooks/{webhook_id}`, but is
         * otherwise the same as [PromptWebhookServiceAsync.delete].
         */
        fun delete(webhookId: String): CompletableFuture<HttpResponse> =
            delete(webhookId, PromptWebhookDeleteParams.none())

        /** @see delete */
        fun delete(
            webhookId: String,
            params: PromptWebhookDeleteParams = PromptWebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see delete */
        fun delete(
            webhookId: String,
            params: PromptWebhookDeleteParams = PromptWebhookDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(webhookId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PromptWebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: PromptWebhookDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(webhookId, PromptWebhookDeleteParams.none(), requestOptions)

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
