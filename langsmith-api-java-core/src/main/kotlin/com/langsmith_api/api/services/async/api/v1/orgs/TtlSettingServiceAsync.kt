// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.orgs

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.ttlsettings.TtlSettingRetrieveTtlSettingsParams
import com.langsmith_api.api.models.api.v1.orgs.ttlsettings.TtlSettingUpdateTtlSettingsParams
import com.langsmith_api.api.models.api.v1.orgs.ttlsettings.TtlSettings
import com.langsmith_api.api.models.api.v1.orgs.ttlsettings.UpsertTtlSettingsRequest
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TtlSettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TtlSettingServiceAsync

    /** List out the configured TTL settings for a given org (org-level and tenant-level). */
    fun retrieveTtlSettings(): CompletableFuture<List<TtlSettings>> =
        retrieveTtlSettings(TtlSettingRetrieveTtlSettingsParams.none())

    /** @see retrieveTtlSettings */
    fun retrieveTtlSettings(
        params: TtlSettingRetrieveTtlSettingsParams = TtlSettingRetrieveTtlSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TtlSettings>>

    /** @see retrieveTtlSettings */
    fun retrieveTtlSettings(
        params: TtlSettingRetrieveTtlSettingsParams = TtlSettingRetrieveTtlSettingsParams.none()
    ): CompletableFuture<List<TtlSettings>> = retrieveTtlSettings(params, RequestOptions.none())

    /** @see retrieveTtlSettings */
    fun retrieveTtlSettings(requestOptions: RequestOptions): CompletableFuture<List<TtlSettings>> =
        retrieveTtlSettings(TtlSettingRetrieveTtlSettingsParams.none(), requestOptions)

    /** Upsert Ttl Settings */
    fun updateTtlSettings(
        params: TtlSettingUpdateTtlSettingsParams
    ): CompletableFuture<TtlSettings> = updateTtlSettings(params, RequestOptions.none())

    /** @see updateTtlSettings */
    fun updateTtlSettings(
        params: TtlSettingUpdateTtlSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TtlSettings>

    /** @see updateTtlSettings */
    fun updateTtlSettings(
        upsertTtlSettingsRequest: UpsertTtlSettingsRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TtlSettings> =
        updateTtlSettings(
            TtlSettingUpdateTtlSettingsParams.builder()
                .upsertTtlSettingsRequest(upsertTtlSettingsRequest)
                .build(),
            requestOptions,
        )

    /** @see updateTtlSettings */
    fun updateTtlSettings(
        upsertTtlSettingsRequest: UpsertTtlSettingsRequest
    ): CompletableFuture<TtlSettings> =
        updateTtlSettings(upsertTtlSettingsRequest, RequestOptions.none())

    /**
     * A view of [TtlSettingServiceAsync] that provides access to raw HTTP responses for each
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
        ): TtlSettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/ttl-settings`, but is otherwise the
         * same as [TtlSettingServiceAsync.retrieveTtlSettings].
         */
        fun retrieveTtlSettings(): CompletableFuture<HttpResponseFor<List<TtlSettings>>> =
            retrieveTtlSettings(TtlSettingRetrieveTtlSettingsParams.none())

        /** @see retrieveTtlSettings */
        fun retrieveTtlSettings(
            params: TtlSettingRetrieveTtlSettingsParams =
                TtlSettingRetrieveTtlSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TtlSettings>>>

        /** @see retrieveTtlSettings */
        fun retrieveTtlSettings(
            params: TtlSettingRetrieveTtlSettingsParams = TtlSettingRetrieveTtlSettingsParams.none()
        ): CompletableFuture<HttpResponseFor<List<TtlSettings>>> =
            retrieveTtlSettings(params, RequestOptions.none())

        /** @see retrieveTtlSettings */
        fun retrieveTtlSettings(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<TtlSettings>>> =
            retrieveTtlSettings(TtlSettingRetrieveTtlSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/orgs/ttl-settings`, but is otherwise the
         * same as [TtlSettingServiceAsync.updateTtlSettings].
         */
        fun updateTtlSettings(
            params: TtlSettingUpdateTtlSettingsParams
        ): CompletableFuture<HttpResponseFor<TtlSettings>> =
            updateTtlSettings(params, RequestOptions.none())

        /** @see updateTtlSettings */
        fun updateTtlSettings(
            params: TtlSettingUpdateTtlSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TtlSettings>>

        /** @see updateTtlSettings */
        fun updateTtlSettings(
            upsertTtlSettingsRequest: UpsertTtlSettingsRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TtlSettings>> =
            updateTtlSettings(
                TtlSettingUpdateTtlSettingsParams.builder()
                    .upsertTtlSettingsRequest(upsertTtlSettingsRequest)
                    .build(),
                requestOptions,
            )

        /** @see updateTtlSettings */
        fun updateTtlSettings(
            upsertTtlSettingsRequest: UpsertTtlSettingsRequest
        ): CompletableFuture<HttpResponseFor<TtlSettings>> =
            updateTtlSettings(upsertTtlSettingsRequest, RequestOptions.none())
    }
}
