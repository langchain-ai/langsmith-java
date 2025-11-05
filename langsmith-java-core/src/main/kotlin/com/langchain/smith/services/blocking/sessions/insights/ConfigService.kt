// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sessions.insights

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sessions.insights.configs.ConfigCreateParams
import com.langchain.smith.models.sessions.insights.configs.ConfigDeleteParams
import com.langchain.smith.models.sessions.insights.configs.ConfigDeleteResponse
import com.langchain.smith.models.sessions.insights.configs.ConfigGenerateParams
import com.langchain.smith.models.sessions.insights.configs.ConfigGenerateResponse
import com.langchain.smith.models.sessions.insights.configs.ConfigListParams
import com.langchain.smith.models.sessions.insights.configs.ConfigListResponse
import com.langchain.smith.models.sessions.insights.configs.ConfigUpdateParams
import com.langchain.smith.models.sessions.insights.configs.CreateClusteringJobConfigResponse
import java.util.function.Consumer

interface ConfigService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigService

    /** Save an insights job config. */
    fun create(sessionId: String, params: ConfigCreateParams): CreateClusteringJobConfigResponse =
        create(sessionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        sessionId: String,
        params: ConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateClusteringJobConfigResponse =
        create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see create */
    fun create(params: ConfigCreateParams): CreateClusteringJobConfigResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateClusteringJobConfigResponse

    /** Update an insights job config. */
    fun update(configId: String, params: ConfigUpdateParams): CreateClusteringJobConfigResponse =
        update(configId, params, RequestOptions.none())

    /** @see update */
    fun update(
        configId: String,
        params: ConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateClusteringJobConfigResponse =
        update(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see update */
    fun update(params: ConfigUpdateParams): CreateClusteringJobConfigResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateClusteringJobConfigResponse

    /** Get all insights job configs for a session. */
    fun list(sessionId: String): ConfigListResponse = list(sessionId, ConfigListParams.none())

    /** @see list */
    fun list(
        sessionId: String,
        params: ConfigListParams = ConfigListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigListResponse = list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see list */
    fun list(
        sessionId: String,
        params: ConfigListParams = ConfigListParams.none(),
    ): ConfigListResponse = list(sessionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ConfigListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigListResponse

    /** @see list */
    fun list(params: ConfigListParams): ConfigListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(sessionId: String, requestOptions: RequestOptions): ConfigListResponse =
        list(sessionId, ConfigListParams.none(), requestOptions)

    /** Delete an insights job config. */
    fun delete(configId: String, params: ConfigDeleteParams): ConfigDeleteResponse =
        delete(configId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        configId: String,
        params: ConfigDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigDeleteResponse = delete(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ConfigDeleteParams): ConfigDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ConfigDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigDeleteResponse

    /** Auto-generate an insights job config. */
    fun generate(sessionId: String, params: ConfigGenerateParams): ConfigGenerateResponse =
        generate(sessionId, params, RequestOptions.none())

    /** @see generate */
    fun generate(
        sessionId: String,
        params: ConfigGenerateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigGenerateResponse =
        generate(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see generate */
    fun generate(params: ConfigGenerateParams): ConfigGenerateResponse =
        generate(params, RequestOptions.none())

    /** @see generate */
    fun generate(
        params: ConfigGenerateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigGenerateResponse

    /** A view of [ConfigService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/sessions/{session_id}/insights/configs`,
         * but is otherwise the same as [ConfigService.create].
         */
        @MustBeClosed
        fun create(
            sessionId: String,
            params: ConfigCreateParams,
        ): HttpResponseFor<CreateClusteringJobConfigResponse> =
            create(sessionId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            sessionId: String,
            params: ConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateClusteringJobConfigResponse> =
            create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ConfigCreateParams): HttpResponseFor<CreateClusteringJobConfigResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateClusteringJobConfigResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/sessions/{session_id}/insights/configs/{config_id}`, but is otherwise the same as
         * [ConfigService.update].
         */
        @MustBeClosed
        fun update(
            configId: String,
            params: ConfigUpdateParams,
        ): HttpResponseFor<CreateClusteringJobConfigResponse> =
            update(configId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            configId: String,
            params: ConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateClusteringJobConfigResponse> =
            update(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ConfigUpdateParams): HttpResponseFor<CreateClusteringJobConfigResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateClusteringJobConfigResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}/insights/configs`, but
         * is otherwise the same as [ConfigService.list].
         */
        @MustBeClosed
        fun list(sessionId: String): HttpResponseFor<ConfigListResponse> =
            list(sessionId, ConfigListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            sessionId: String,
            params: ConfigListParams = ConfigListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigListResponse> =
            list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            sessionId: String,
            params: ConfigListParams = ConfigListParams.none(),
        ): HttpResponseFor<ConfigListResponse> = list(sessionId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConfigListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: ConfigListParams): HttpResponseFor<ConfigListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            sessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigListResponse> =
            list(sessionId, ConfigListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/sessions/{session_id}/insights/configs/{config_id}`, but is otherwise the same as
         * [ConfigService.delete].
         */
        @MustBeClosed
        fun delete(
            configId: String,
            params: ConfigDeleteParams,
        ): HttpResponseFor<ConfigDeleteResponse> = delete(configId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            configId: String,
            params: ConfigDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigDeleteResponse> =
            delete(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ConfigDeleteParams): HttpResponseFor<ConfigDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ConfigDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigDeleteResponse>

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/sessions/{session_id}/insights/configs/generate`, but is otherwise the same as
         * [ConfigService.generate].
         */
        @MustBeClosed
        fun generate(
            sessionId: String,
            params: ConfigGenerateParams,
        ): HttpResponseFor<ConfigGenerateResponse> =
            generate(sessionId, params, RequestOptions.none())

        /** @see generate */
        @MustBeClosed
        fun generate(
            sessionId: String,
            params: ConfigGenerateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigGenerateResponse> =
            generate(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see generate */
        @MustBeClosed
        fun generate(params: ConfigGenerateParams): HttpResponseFor<ConfigGenerateResponse> =
            generate(params, RequestOptions.none())

        /** @see generate */
        @MustBeClosed
        fun generate(
            params: ConfigGenerateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigGenerateResponse>
    }
}
