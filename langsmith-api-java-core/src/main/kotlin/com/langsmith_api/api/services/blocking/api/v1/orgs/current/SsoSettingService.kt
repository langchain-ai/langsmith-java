// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs.current

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.current.ssosettings.SsoProvider
import com.langsmith_api.api.models.api.v1.orgs.current.ssosettings.SsoSettingDeleteParams
import com.langsmith_api.api.models.api.v1.orgs.current.ssosettings.SsoSettingRetrieveSsoSettingsParams
import com.langsmith_api.api.models.api.v1.orgs.current.ssosettings.SsoSettingSsoSettingsParams
import com.langsmith_api.api.models.api.v1.orgs.current.ssosettings.SsoSettingUpdateParams
import java.util.function.Consumer

interface SsoSettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SsoSettingService

    /** Update SSO provider settings defaults for the current organization. */
    fun update(id: String): SsoProvider = update(id, SsoSettingUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: SsoSettingUpdateParams = SsoSettingUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SsoProvider = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: SsoSettingUpdateParams = SsoSettingUpdateParams.none(),
    ): SsoProvider = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SsoSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SsoProvider

    /** @see update */
    fun update(params: SsoSettingUpdateParams): SsoProvider = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): SsoProvider =
        update(id, SsoSettingUpdateParams.none(), requestOptions)

    /** Delete SSO provider settings for the current organization. */
    fun delete(id: String): SsoProvider = delete(id, SsoSettingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SsoSettingDeleteParams = SsoSettingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SsoProvider = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SsoSettingDeleteParams = SsoSettingDeleteParams.none(),
    ): SsoProvider = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SsoSettingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SsoProvider

    /** @see delete */
    fun delete(params: SsoSettingDeleteParams): SsoProvider = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): SsoProvider =
        delete(id, SsoSettingDeleteParams.none(), requestOptions)

    /** Get SSO provider settings for the current organization. */
    fun retrieveSsoSettings(): List<SsoProvider> =
        retrieveSsoSettings(SsoSettingRetrieveSsoSettingsParams.none())

    /** @see retrieveSsoSettings */
    fun retrieveSsoSettings(
        params: SsoSettingRetrieveSsoSettingsParams = SsoSettingRetrieveSsoSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SsoProvider>

    /** @see retrieveSsoSettings */
    fun retrieveSsoSettings(
        params: SsoSettingRetrieveSsoSettingsParams = SsoSettingRetrieveSsoSettingsParams.none()
    ): List<SsoProvider> = retrieveSsoSettings(params, RequestOptions.none())

    /** @see retrieveSsoSettings */
    fun retrieveSsoSettings(requestOptions: RequestOptions): List<SsoProvider> =
        retrieveSsoSettings(SsoSettingRetrieveSsoSettingsParams.none(), requestOptions)

    /** Create SSO provider settings for the current organization. */
    fun ssoSettings(params: SsoSettingSsoSettingsParams): SsoProvider =
        ssoSettings(params, RequestOptions.none())

    /** @see ssoSettings */
    fun ssoSettings(
        params: SsoSettingSsoSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SsoProvider

    /** A view of [SsoSettingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SsoSettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /api/v1/orgs/current/sso-settings/{id}`, but is
         * otherwise the same as [SsoSettingService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<SsoProvider> =
            update(id, SsoSettingUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: SsoSettingUpdateParams = SsoSettingUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SsoProvider> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: SsoSettingUpdateParams = SsoSettingUpdateParams.none(),
        ): HttpResponseFor<SsoProvider> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SsoSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SsoProvider>

        /** @see update */
        @MustBeClosed
        fun update(params: SsoSettingUpdateParams): HttpResponseFor<SsoProvider> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<SsoProvider> =
            update(id, SsoSettingUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/orgs/current/sso-settings/{id}`, but is
         * otherwise the same as [SsoSettingService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<SsoProvider> =
            delete(id, SsoSettingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SsoSettingDeleteParams = SsoSettingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SsoProvider> = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SsoSettingDeleteParams = SsoSettingDeleteParams.none(),
        ): HttpResponseFor<SsoProvider> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SsoSettingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SsoProvider>

        /** @see delete */
        @MustBeClosed
        fun delete(params: SsoSettingDeleteParams): HttpResponseFor<SsoProvider> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<SsoProvider> =
            delete(id, SsoSettingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/sso-settings`, but is otherwise
         * the same as [SsoSettingService.retrieveSsoSettings].
         */
        @MustBeClosed
        fun retrieveSsoSettings(): HttpResponseFor<List<SsoProvider>> =
            retrieveSsoSettings(SsoSettingRetrieveSsoSettingsParams.none())

        /** @see retrieveSsoSettings */
        @MustBeClosed
        fun retrieveSsoSettings(
            params: SsoSettingRetrieveSsoSettingsParams =
                SsoSettingRetrieveSsoSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SsoProvider>>

        /** @see retrieveSsoSettings */
        @MustBeClosed
        fun retrieveSsoSettings(
            params: SsoSettingRetrieveSsoSettingsParams = SsoSettingRetrieveSsoSettingsParams.none()
        ): HttpResponseFor<List<SsoProvider>> = retrieveSsoSettings(params, RequestOptions.none())

        /** @see retrieveSsoSettings */
        @MustBeClosed
        fun retrieveSsoSettings(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<SsoProvider>> =
            retrieveSsoSettings(SsoSettingRetrieveSsoSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/sso-settings`, but is
         * otherwise the same as [SsoSettingService.ssoSettings].
         */
        @MustBeClosed
        fun ssoSettings(params: SsoSettingSsoSettingsParams): HttpResponseFor<SsoProvider> =
            ssoSettings(params, RequestOptions.none())

        /** @see ssoSettings */
        @MustBeClosed
        fun ssoSettings(
            params: SsoSettingSsoSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SsoProvider>
    }
}
