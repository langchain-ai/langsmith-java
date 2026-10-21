// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.agents.Agent
import com.langchain.smith.models.agents.AgentCreateParams
import com.langchain.smith.models.agents.AgentDeleteParams
import com.langchain.smith.models.agents.AgentListPageAsync
import com.langchain.smith.models.agents.AgentListParams
import com.langchain.smith.models.agents.AgentRetrieveParams
import com.langchain.smith.models.agents.AgentUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AgentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentServiceAsync

    /**
     * Creates an Agent with a caller-assigned ID. Returns 409 if the ID already exists. Creates all
     * four environments unless production_only is set for a FLEET agent. agent_type defaults to
     * CUSTOM. Requires permission to create projects. The response does not include runtime
     * bindings.
     */
    fun create(params: AgentCreateParams): CompletableFuture<Agent> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Agent>

    /**
     * Returns an Agent with the environments visible to the caller. The path value is the
     * user-assigned Agent ID. Pass include=runtime_bindings to embed each environment's runtime
     * bindings.
     */
    fun retrieve(agentId: String): CompletableFuture<Agent> =
        retrieve(agentId, AgentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        agentId: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Agent> =
        retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        agentId: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
    ): CompletableFuture<Agent> = retrieve(agentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Agent>

    /** @see retrieve */
    fun retrieve(params: AgentRetrieveParams): CompletableFuture<Agent> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(agentId: String, requestOptions: RequestOptions): CompletableFuture<Agent> =
        retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

    /**
     * Updates an Agent's name, source_type, or agent_type. Omitted fields keep their values.
     * Changing agent_type requires workspaces:manage in addition to project update access;
     * repeating the current type is a no-op. Source type can change only for an EXTERNAL Agent
     * without runtime bindings. The id is immutable and is rejected when present. Requires update
     * permission on every environment project.
     */
    fun update(agentId: String): CompletableFuture<Agent> =
        update(agentId, AgentUpdateParams.none())

    /** @see update */
    fun update(
        agentId: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Agent> =
        update(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see update */
    fun update(
        agentId: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
    ): CompletableFuture<Agent> = update(agentId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Agent>

    /** @see update */
    fun update(params: AgentUpdateParams): CompletableFuture<Agent> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(agentId: String, requestOptions: RequestOptions): CompletableFuture<Agent> =
        update(agentId, AgentUpdateParams.none(), requestOptions)

    /**
     * Returns Agents visible to the caller. Each item is the same Agent shape as GET
     * /api/v1/agents/{agent_id}, including the environments the caller may read. The list never
     * embeds runtime bindings. An unknown query parameter, including limit, returns 400; use
     * page_size to set the page size.
     */
    fun list(): CompletableFuture<AgentListPageAsync> = list(AgentListParams.none())

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentListPageAsync>

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none()
    ): CompletableFuture<AgentListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AgentListPageAsync> =
        list(AgentListParams.none(), requestOptions)

    /**
     * Permanently deletes an Agent, along with its environments, runtime bindings, runtimes, and
     * tracing projects. This cannot be undone. Deleting an Agent that does not exist returns 204.
     */
    fun delete(agentId: String): CompletableFuture<Void?> =
        delete(agentId, AgentDeleteParams.none())

    /** @see delete */
    fun delete(
        agentId: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        agentId: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(agentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AgentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AgentDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(agentId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(agentId, AgentDeleteParams.none(), requestOptions)

    /** A view of [AgentServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/agents`, but is otherwise the same as
         * [AgentServiceAsync.create].
         */
        fun create(params: AgentCreateParams): CompletableFuture<HttpResponseFor<Agent>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Agent>>

        /**
         * Returns a raw HTTP response for `get /api/v1/agents/{agent_id}`, but is otherwise the
         * same as [AgentServiceAsync.retrieve].
         */
        fun retrieve(agentId: String): CompletableFuture<HttpResponseFor<Agent>> =
            retrieve(agentId, AgentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            agentId: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Agent>> =
            retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            agentId: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Agent>> =
            retrieve(agentId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Agent>>

        /** @see retrieve */
        fun retrieve(params: AgentRetrieveParams): CompletableFuture<HttpResponseFor<Agent>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            agentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Agent>> =
            retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/agents/{agent_id}`, but is otherwise the
         * same as [AgentServiceAsync.update].
         */
        fun update(agentId: String): CompletableFuture<HttpResponseFor<Agent>> =
            update(agentId, AgentUpdateParams.none())

        /** @see update */
        fun update(
            agentId: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Agent>> =
            update(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see update */
        fun update(
            agentId: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Agent>> =
            update(agentId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Agent>>

        /** @see update */
        fun update(params: AgentUpdateParams): CompletableFuture<HttpResponseFor<Agent>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            agentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Agent>> =
            update(agentId, AgentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/agents`, but is otherwise the same as
         * [AgentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AgentListPageAsync>> =
            list(AgentListParams.none())

        /** @see list */
        fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentListPageAsync>>

        /** @see list */
        fun list(
            params: AgentListParams = AgentListParams.none()
        ): CompletableFuture<HttpResponseFor<AgentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AgentListPageAsync>> =
            list(AgentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/agents/{agent_id}`, but is otherwise the
         * same as [AgentServiceAsync.delete].
         */
        fun delete(agentId: String): CompletableFuture<HttpResponse> =
            delete(agentId, AgentDeleteParams.none())

        /** @see delete */
        fun delete(
            agentId: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see delete */
        fun delete(
            agentId: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(agentId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AgentDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            agentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(agentId, AgentDeleteParams.none(), requestOptions)
    }
}
