// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.sessions.insights

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.sessions.insights.configs.ConfigCreateParams
import com.langsmith_api.api.models.api.v1.sessions.insights.configs.ConfigDeleteParams
import com.langsmith_api.api.models.api.v1.sessions.insights.configs.ConfigDeleteResponse
import com.langsmith_api.api.models.api.v1.sessions.insights.configs.ConfigGenerateParams
import com.langsmith_api.api.models.api.v1.sessions.insights.configs.ConfigGenerateResponse
import com.langsmith_api.api.models.api.v1.sessions.insights.configs.ConfigListParams
import com.langsmith_api.api.models.api.v1.sessions.insights.configs.ConfigListResponse
import com.langsmith_api.api.models.api.v1.sessions.insights.configs.ConfigUpdateParams
import com.langsmith_api.api.models.api.v1.sessions.insights.configs.CreateClusteringJobConfigResponse
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

    /** Save an insights job config. */
    fun create(
        sessionId: String,
        params: ConfigCreateParams,
    ): CompletableFuture<CreateClusteringJobConfigResponse> =
        create(sessionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        sessionId: String,
        params: ConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateClusteringJobConfigResponse> =
        create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see create */
    fun create(params: ConfigCreateParams): CompletableFuture<CreateClusteringJobConfigResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateClusteringJobConfigResponse>

    /** Update an insights job config. */
    fun update(
        configId: String,
        params: ConfigUpdateParams,
    ): CompletableFuture<CreateClusteringJobConfigResponse> =
        update(configId, params, RequestOptions.none())

    /** @see update */
    fun update(
        configId: String,
        params: ConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateClusteringJobConfigResponse> =
        update(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see update */
    fun update(params: ConfigUpdateParams): CompletableFuture<CreateClusteringJobConfigResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateClusteringJobConfigResponse>

    /** Get all insights job configs for a session. */
    fun list(sessionId: String): CompletableFuture<ConfigListResponse> =
        list(sessionId, ConfigListParams.none())

    /** @see list */
    fun list(
        sessionId: String,
        params: ConfigListParams = ConfigListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigListResponse> =
        list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see list */
    fun list(
        sessionId: String,
        params: ConfigListParams = ConfigListParams.none(),
    ): CompletableFuture<ConfigListResponse> = list(sessionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ConfigListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigListResponse>

    /** @see list */
    fun list(params: ConfigListParams): CompletableFuture<ConfigListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        sessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConfigListResponse> =
        list(sessionId, ConfigListParams.none(), requestOptions)

    /** Delete an insights job config. */
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

    /** Auto-generate an insights job config. */
    fun generate(
        sessionId: String,
        params: ConfigGenerateParams,
    ): CompletableFuture<ConfigGenerateResponse> =
        generate(sessionId, params, RequestOptions.none())

    /** @see generate */
    fun generate(
        sessionId: String,
        params: ConfigGenerateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigGenerateResponse> =
        generate(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see generate */
    fun generate(params: ConfigGenerateParams): CompletableFuture<ConfigGenerateResponse> =
        generate(params, RequestOptions.none())

    /** @see generate */
    fun generate(
        params: ConfigGenerateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigGenerateResponse>

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
        ): CompletableFuture<HttpResponseFor<CreateClusteringJobConfigResponse>> =
            create(sessionId, params, RequestOptions.none())

        /** @see create */
        fun create(
            sessionId: String,
            params: ConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateClusteringJobConfigResponse>> =
            create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ConfigCreateParams
        ): CompletableFuture<HttpResponseFor<CreateClusteringJobConfigResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateClusteringJobConfigResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/sessions/{session_id}/insights/configs/{config_id}`, but is otherwise the same as
         * [ConfigServiceAsync.update].
         */
        fun update(
            configId: String,
            params: ConfigUpdateParams,
        ): CompletableFuture<HttpResponseFor<CreateClusteringJobConfigResponse>> =
            update(configId, params, RequestOptions.none())

        /** @see update */
        fun update(
            configId: String,
            params: ConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateClusteringJobConfigResponse>> =
            update(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ConfigUpdateParams
        ): CompletableFuture<HttpResponseFor<CreateClusteringJobConfigResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateClusteringJobConfigResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}/insights/configs`, but
         * is otherwise the same as [ConfigServiceAsync.list].
         */
        fun list(sessionId: String): CompletableFuture<HttpResponseFor<ConfigListResponse>> =
            list(sessionId, ConfigListParams.none())

        /** @see list */
        fun list(
            sessionId: String,
            params: ConfigListParams = ConfigListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigListResponse>> =
            list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see list */
        fun list(
            sessionId: String,
            params: ConfigListParams = ConfigListParams.none(),
        ): CompletableFuture<HttpResponseFor<ConfigListResponse>> =
            list(sessionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ConfigListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigListResponse>>

        /** @see list */
        fun list(params: ConfigListParams): CompletableFuture<HttpResponseFor<ConfigListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConfigListResponse>> =
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

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/sessions/{session_id}/insights/configs/generate`, but is otherwise the same as
         * [ConfigServiceAsync.generate].
         */
        fun generate(
            sessionId: String,
            params: ConfigGenerateParams,
        ): CompletableFuture<HttpResponseFor<ConfigGenerateResponse>> =
            generate(sessionId, params, RequestOptions.none())

        /** @see generate */
        fun generate(
            sessionId: String,
            params: ConfigGenerateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigGenerateResponse>> =
            generate(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see generate */
        fun generate(
            params: ConfigGenerateParams
        ): CompletableFuture<HttpResponseFor<ConfigGenerateResponse>> =
            generate(params, RequestOptions.none())

        /** @see generate */
        fun generate(
            params: ConfigGenerateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigGenerateResponse>>
    }
}
