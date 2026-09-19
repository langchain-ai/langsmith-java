// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sessions.insights

import com.google.errorprone.annotations.MustBeClosed
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

    /** Create an Insights job configuration for a project. */
    fun create(sessionId: String, params: ConfigCreateParams): ConfigCreateResponse =
        create(sessionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        sessionId: String,
        params: ConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigCreateResponse =
        create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see create */
    fun create(params: ConfigCreateParams): ConfigCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigCreateResponse

    /** Update an Insights job configuration for a project. */
    fun update(configId: String, params: ConfigUpdateParams): ConfigUpdateResponse =
        update(configId, params, RequestOptions.none())

    /** @see update */
    fun update(
        configId: String,
        params: ConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigUpdateResponse = update(params.toBuilder().configId(configId).build(), requestOptions)

    /** @see update */
    fun update(params: ConfigUpdateParams): ConfigUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigUpdateResponse

    /** List Insights job configurations for a project. */
    fun list(sessionId: String): List<ConfigListResponse> = list(sessionId, ConfigListParams.none())

    /** @see list */
    fun list(
        sessionId: String,
        params: ConfigListParams = ConfigListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ConfigListResponse> =
        list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see list */
    fun list(
        sessionId: String,
        params: ConfigListParams = ConfigListParams.none(),
    ): List<ConfigListResponse> = list(sessionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ConfigListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ConfigListResponse>

    /** @see list */
    fun list(params: ConfigListParams): List<ConfigListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(sessionId: String, requestOptions: RequestOptions): List<ConfigListResponse> =
        list(sessionId, ConfigListParams.none(), requestOptions)

    /** Delete an Insights job configuration for a project. */
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
        ): HttpResponseFor<ConfigCreateResponse> = create(sessionId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            sessionId: String,
            params: ConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigCreateResponse> =
            create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ConfigCreateParams): HttpResponseFor<ConfigCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigCreateResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/sessions/{session_id}/insights/configs/{config_id}`, but is otherwise the same as
         * [ConfigService.update].
         */
        @MustBeClosed
        fun update(
            configId: String,
            params: ConfigUpdateParams,
        ): HttpResponseFor<ConfigUpdateResponse> = update(configId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            configId: String,
            params: ConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigUpdateResponse> =
            update(params.toBuilder().configId(configId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ConfigUpdateParams): HttpResponseFor<ConfigUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}/insights/configs`, but
         * is otherwise the same as [ConfigService.list].
         */
        @MustBeClosed
        fun list(sessionId: String): HttpResponseFor<List<ConfigListResponse>> =
            list(sessionId, ConfigListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            sessionId: String,
            params: ConfigListParams = ConfigListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ConfigListResponse>> =
            list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            sessionId: String,
            params: ConfigListParams = ConfigListParams.none(),
        ): HttpResponseFor<List<ConfigListResponse>> =
            list(sessionId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConfigListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ConfigListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(params: ConfigListParams): HttpResponseFor<List<ConfigListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            sessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ConfigListResponse>> =
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
    }
}
