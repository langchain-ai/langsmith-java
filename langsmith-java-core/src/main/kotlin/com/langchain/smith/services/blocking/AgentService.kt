// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.agents.Agent
import com.langchain.smith.models.agents.AgentCreateParams
import com.langchain.smith.models.agents.AgentDeleteParams
import com.langchain.smith.models.agents.AgentListPage
import com.langchain.smith.models.agents.AgentListParams
import com.langchain.smith.models.agents.AgentRetrieveParams
import com.langchain.smith.models.agents.AgentUpdateParams
import java.util.function.Consumer

interface AgentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService

    /**
     * Creates an Agent with a caller-assigned ID. Returns 409 if the ID already exists. Creates all
     * four environments unless production_only is set for a FLEET agent. agent_type defaults to
     * CUSTOM. Requires permission to create projects. The response does not include runtime
     * bindings.
     */
    fun create(params: AgentCreateParams): Agent = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent

    /**
     * Returns an Agent with the environments visible to the caller. The path value is the
     * user-assigned Agent ID. Pass include=runtime_bindings to embed each environment's runtime
     * bindings.
     */
    fun retrieve(agentId: String): Agent = retrieve(agentId, AgentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        agentId: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent = retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(agentId: String, params: AgentRetrieveParams = AgentRetrieveParams.none()): Agent =
        retrieve(agentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent

    /** @see retrieve */
    fun retrieve(params: AgentRetrieveParams): Agent = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(agentId: String, requestOptions: RequestOptions): Agent =
        retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

    /**
     * Updates an Agent's name, source_type, or agent_type. Omitted fields keep their values.
     * Changing agent_type requires workspaces:manage in addition to project update access;
     * repeating the current type is a no-op. Source type can change only for an EXTERNAL Agent
     * without runtime bindings. The id is immutable and is rejected when present. Requires update
     * permission on every environment project.
     */
    fun update(agentId: String): Agent = update(agentId, AgentUpdateParams.none())

    /** @see update */
    fun update(
        agentId: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent = update(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see update */
    fun update(agentId: String, params: AgentUpdateParams = AgentUpdateParams.none()): Agent =
        update(agentId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent

    /** @see update */
    fun update(params: AgentUpdateParams): Agent = update(params, RequestOptions.none())

    /** @see update */
    fun update(agentId: String, requestOptions: RequestOptions): Agent =
        update(agentId, AgentUpdateParams.none(), requestOptions)

    /**
     * Returns Agents visible to the caller. Each item is the same Agent shape as GET
     * /api/v1/agents/{agent_id}, including the environments the caller may read. The list never
     * embeds runtime bindings. An unknown query parameter, including limit, returns 400; use
     * page_size to set the page size.
     */
    fun list(): AgentListPage = list(AgentListParams.none())

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentListPage

    /** @see list */
    fun list(params: AgentListParams = AgentListParams.none()): AgentListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AgentListPage =
        list(AgentListParams.none(), requestOptions)

    /**
     * Permanently deletes an Agent, along with its environments, runtime bindings, runtimes, and
     * tracing projects. This cannot be undone. Deleting an Agent that does not exist returns 204.
     */
    fun delete(agentId: String) = delete(agentId, AgentDeleteParams.none())

    /** @see delete */
    fun delete(
        agentId: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see delete */
    fun delete(agentId: String, params: AgentDeleteParams = AgentDeleteParams.none()) =
        delete(agentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: AgentDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: AgentDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(agentId: String, requestOptions: RequestOptions) =
        delete(agentId, AgentDeleteParams.none(), requestOptions)

    /** A view of [AgentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/agents`, but is otherwise the same as
         * [AgentService.create].
         */
        @MustBeClosed
        fun create(params: AgentCreateParams): HttpResponseFor<Agent> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent>

        /**
         * Returns a raw HTTP response for `get /api/v1/agents/{agent_id}`, but is otherwise the
         * same as [AgentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(agentId: String): HttpResponseFor<Agent> =
            retrieve(agentId, AgentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            agentId: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent> =
            retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            agentId: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
        ): HttpResponseFor<Agent> = retrieve(agentId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AgentRetrieveParams): HttpResponseFor<Agent> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(agentId: String, requestOptions: RequestOptions): HttpResponseFor<Agent> =
            retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/agents/{agent_id}`, but is otherwise the
         * same as [AgentService.update].
         */
        @MustBeClosed
        fun update(agentId: String): HttpResponseFor<Agent> =
            update(agentId, AgentUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            agentId: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent> =
            update(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            agentId: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
        ): HttpResponseFor<Agent> = update(agentId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent>

        /** @see update */
        @MustBeClosed
        fun update(params: AgentUpdateParams): HttpResponseFor<Agent> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(agentId: String, requestOptions: RequestOptions): HttpResponseFor<Agent> =
            update(agentId, AgentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/agents`, but is otherwise the same as
         * [AgentService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<AgentListPage> = list(AgentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: AgentListParams = AgentListParams.none()): HttpResponseFor<AgentListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AgentListPage> =
            list(AgentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/agents/{agent_id}`, but is otherwise the
         * same as [AgentService.delete].
         */
        @MustBeClosed
        fun delete(agentId: String): HttpResponse = delete(agentId, AgentDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            agentId: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            agentId: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
        ): HttpResponse = delete(agentId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AgentDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(agentId: String, requestOptions: RequestOptions): HttpResponse =
            delete(agentId, AgentDeleteParams.none(), requestOptions)
    }
}
