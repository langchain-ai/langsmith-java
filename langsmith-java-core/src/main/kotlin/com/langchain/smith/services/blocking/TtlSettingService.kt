// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.orgs.ttlsettings.TtlSettings
import com.langchain.smith.models.orgs.ttlsettings.UpsertTtlSettingsRequest
import com.langchain.smith.models.ttlsettings.TtlSettingRetrieveTtlSettingsParams
import com.langchain.smith.models.ttlsettings.TtlSettingUpdateTtlSettingsParams
import java.util.function.Consumer

interface TtlSettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TtlSettingService

    /** List out the configured TTL settings for a given tenant. */
    fun retrieveTtlSettings(): List<TtlSettings> =
        retrieveTtlSettings(TtlSettingRetrieveTtlSettingsParams.none())

    /** @see retrieveTtlSettings */
    fun retrieveTtlSettings(
        params: TtlSettingRetrieveTtlSettingsParams = TtlSettingRetrieveTtlSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TtlSettings>

    /** @see retrieveTtlSettings */
    fun retrieveTtlSettings(
        params: TtlSettingRetrieveTtlSettingsParams = TtlSettingRetrieveTtlSettingsParams.none()
    ): List<TtlSettings> = retrieveTtlSettings(params, RequestOptions.none())

    /** @see retrieveTtlSettings */
    fun retrieveTtlSettings(requestOptions: RequestOptions): List<TtlSettings> =
        retrieveTtlSettings(TtlSettingRetrieveTtlSettingsParams.none(), requestOptions)

    /** Upsert Ttl Settings */
    fun updateTtlSettings(params: TtlSettingUpdateTtlSettingsParams): TtlSettings =
        updateTtlSettings(params, RequestOptions.none())

    /** @see updateTtlSettings */
    fun updateTtlSettings(
        params: TtlSettingUpdateTtlSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TtlSettings

    /** @see updateTtlSettings */
    fun updateTtlSettings(
        upsertTtlSettingsRequest: UpsertTtlSettingsRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TtlSettings =
        updateTtlSettings(
            TtlSettingUpdateTtlSettingsParams.builder()
                .upsertTtlSettingsRequest(upsertTtlSettingsRequest)
                .build(),
            requestOptions,
        )

    /** @see updateTtlSettings */
    fun updateTtlSettings(upsertTtlSettingsRequest: UpsertTtlSettingsRequest): TtlSettings =
        updateTtlSettings(upsertTtlSettingsRequest, RequestOptions.none())

    /** A view of [TtlSettingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TtlSettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/ttl-settings`, but is otherwise the same as
         * [TtlSettingService.retrieveTtlSettings].
         */
        @MustBeClosed
        fun retrieveTtlSettings(): HttpResponseFor<List<TtlSettings>> =
            retrieveTtlSettings(TtlSettingRetrieveTtlSettingsParams.none())

        /** @see retrieveTtlSettings */
        @MustBeClosed
        fun retrieveTtlSettings(
            params: TtlSettingRetrieveTtlSettingsParams =
                TtlSettingRetrieveTtlSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TtlSettings>>

        /** @see retrieveTtlSettings */
        @MustBeClosed
        fun retrieveTtlSettings(
            params: TtlSettingRetrieveTtlSettingsParams = TtlSettingRetrieveTtlSettingsParams.none()
        ): HttpResponseFor<List<TtlSettings>> = retrieveTtlSettings(params, RequestOptions.none())

        /** @see retrieveTtlSettings */
        @MustBeClosed
        fun retrieveTtlSettings(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<TtlSettings>> =
            retrieveTtlSettings(TtlSettingRetrieveTtlSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/ttl-settings`, but is otherwise the same as
         * [TtlSettingService.updateTtlSettings].
         */
        @MustBeClosed
        fun updateTtlSettings(
            params: TtlSettingUpdateTtlSettingsParams
        ): HttpResponseFor<TtlSettings> = updateTtlSettings(params, RequestOptions.none())

        /** @see updateTtlSettings */
        @MustBeClosed
        fun updateTtlSettings(
            params: TtlSettingUpdateTtlSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TtlSettings>

        /** @see updateTtlSettings */
        @MustBeClosed
        fun updateTtlSettings(
            upsertTtlSettingsRequest: UpsertTtlSettingsRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TtlSettings> =
            updateTtlSettings(
                TtlSettingUpdateTtlSettingsParams.builder()
                    .upsertTtlSettingsRequest(upsertTtlSettingsRequest)
                    .build(),
                requestOptions,
            )

        /** @see updateTtlSettings */
        @MustBeClosed
        fun updateTtlSettings(
            upsertTtlSettingsRequest: UpsertTtlSettingsRequest
        ): HttpResponseFor<TtlSettings> =
            updateTtlSettings(upsertTtlSettingsRequest, RequestOptions.none())
    }
}
