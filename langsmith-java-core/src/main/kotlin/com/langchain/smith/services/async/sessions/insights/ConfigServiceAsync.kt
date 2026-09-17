// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sessions.insights

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sessions.insights.configs.ConfigCreateParams
import com.langchain.smith.models.sessions.insights.configs.ConfigCreateResponse
import com.langchain.smith.models.sessions.insights.configs.ConfigDeleteParams
import com.langchain.smith.models.sessions.insights.configs.ConfigDeleteResponse
import com.langchain.smith.models.sessions.insights.configs.ConfigListParams
import com.langchain.smith.models.sessions.insights.configs.ConfigListResponse
import com.langchain.smith.models.sessions.insights.configs.ConfigUpdateParams
import com.langchain.smith.models.sessions.insights.configs.ConfigUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigServiceAsync

    /** Create an Insights job configuration for a project. */
    fun create(
        sessionId: String,
        params: ConfigCreateParams,
    ): CompletableFuture<ConfigCreateResponse> = create(sessionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        sessionId: String,
        params: ConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigCreateResponse> =
        create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see create */
    fun create(params: ConfigCreateParams): CompletableFuture<ConfigCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigCreateResponse>

    /** Update an Insights job configuration for a project. */
    fun update(
        configId: String,
        params: ConfigUpdateParams,
    ): CompletableFuture<ConfigUpdateResponse> = update(configId, params, RequestOptions.none())

    /** @see update */
    fun update(
        configId: String,
        params: ConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigUpdateResponse> =
        update(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see update */
    fun update(params: ConfigUpdateParams): CompletableFuture<ConfigUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigUpdateResponse>

    /** List Insights job configurations for a project. */
    fun list(sessionId: String): CompletableFuture<List<ConfigListResponse>> =
        list(sessionId, ConfigListParams.none())

    /** @see list */
    fun list(
        sessionId: String,
        params: ConfigListParams = ConfigListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ConfigListResponse>> =
        list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see list */
    fun list(
        sessionId: String,
        params: ConfigListParams = ConfigListParams.none(),
    ): CompletableFuture<List<ConfigListResponse>> = list(sessionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ConfigListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ConfigListResponse>>

    /** @see list */
    fun list(params: ConfigListParams): CompletableFuture<List<ConfigListResponse>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        sessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<ConfigListResponse>> =
        list(sessionId, ConfigListParams.none(), requestOptions)

    /** Delete an Insights job configuration for a project. */
    fun delete(
        configId: String,
        params: ConfigDeleteParams,
    ): CompletableFuture<ConfigDeleteResponse> = delete(configId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        configId: String,
        params: ConfigDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigDeleteResponse> =
        delete(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ConfigDeleteParams): CompletableFuture<ConfigDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ConfigDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigDeleteResponse>

    /**
     * A view of [ConfigServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/sessions/{session_id}/insights/configs`,
         * but is otherwise the same as [ConfigServiceAsync.create].
         */
        fun create(
            sessionId: String,
            params: ConfigCreateParams,
        ): CompletableFuture<HttpResponseFor<ConfigCreateResponse>> =
            create(sessionId, params, RequestOptions.none())

        /** @see create */
        fun create(
            sessionId: String,
            params: ConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigCreateResponse>> =
            create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ConfigCreateParams
        ): CompletableFuture<HttpResponseFor<ConfigCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigCreateResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/sessions/{session_id}/insights/configs/{config_id}`, but is otherwise the same as
         * [ConfigServiceAsync.update].
         */
        fun update(
            configId: String,
            params: ConfigUpdateParams,
        ): CompletableFuture<HttpResponseFor<ConfigUpdateResponse>> =
            update(configId, params, RequestOptions.none())

        /** @see update */
        fun update(
            configId: String,
            params: ConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigUpdateResponse>> =
            update(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ConfigUpdateParams
        ): CompletableFuture<HttpResponseFor<ConfigUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}/insights/configs`, but
         * is otherwise the same as [ConfigServiceAsync.list].
         */
        fun list(sessionId: String): CompletableFuture<HttpResponseFor<List<ConfigListResponse>>> =
            list(sessionId, ConfigListParams.none())

        /** @see list */
        fun list(
            sessionId: String,
            params: ConfigListParams = ConfigListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ConfigListResponse>>> =
            list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see list */
        fun list(
            sessionId: String,
            params: ConfigListParams = ConfigListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<ConfigListResponse>>> =
            list(sessionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ConfigListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ConfigListResponse>>>

        /** @see list */
        fun list(
            params: ConfigListParams
        ): CompletableFuture<HttpResponseFor<List<ConfigListResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ConfigListResponse>>> =
            list(sessionId, ConfigListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/sessions/{session_id}/insights/configs/{config_id}`, but is otherwise the same as
         * [ConfigServiceAsync.delete].
         */
        fun delete(
            configId: String,
            params: ConfigDeleteParams,
        ): CompletableFuture<HttpResponseFor<ConfigDeleteResponse>> =
            delete(configId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            configId: String,
            params: ConfigDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigDeleteResponse>> =
            delete(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: ConfigDeleteParams
        ): CompletableFuture<HttpResponseFor<ConfigDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ConfigDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigDeleteResponse>>
    }
}
