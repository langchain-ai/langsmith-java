// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingDeleteParams
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingDeleteResponse
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingPlaygroundSettingsParams
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingRetrievePlaygroundSettingsParams
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingUpdateParams
import com.langsmith_api.api.models.api.v1.playgroundsettings.PlaygroundSettingsResponse
import java.util.function.Consumer

interface PlaygroundSettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlaygroundSettingService

    /** Update playground settings. */
    fun update(playgroundSettingsId: String): PlaygroundSettingsResponse =
        update(playgroundSettingsId, PlaygroundSettingUpdateParams.none())

    /** @see update */
    fun update(
        playgroundSettingsId: String,
        params: PlaygroundSettingUpdateParams = PlaygroundSettingUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaygroundSettingsResponse =
        update(
            params.toBuilder().playgroundSettingsId(playgroundSettingsId).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        playgroundSettingsId: String,
        params: PlaygroundSettingUpdateParams = PlaygroundSettingUpdateParams.none(),
    ): PlaygroundSettingsResponse = update(playgroundSettingsId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PlaygroundSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaygroundSettingsResponse

    /** @see update */
    fun update(params: PlaygroundSettingUpdateParams): PlaygroundSettingsResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        playgroundSettingsId: String,
        requestOptions: RequestOptions,
    ): PlaygroundSettingsResponse =
        update(playgroundSettingsId, PlaygroundSettingUpdateParams.none(), requestOptions)

    /** Delete playground settings. */
    fun delete(playgroundSettingsId: String): PlaygroundSettingDeleteResponse =
        delete(playgroundSettingsId, PlaygroundSettingDeleteParams.none())

    /** @see delete */
    fun delete(
        playgroundSettingsId: String,
        params: PlaygroundSettingDeleteParams = PlaygroundSettingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaygroundSettingDeleteResponse =
        delete(
            params.toBuilder().playgroundSettingsId(playgroundSettingsId).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(
        playgroundSettingsId: String,
        params: PlaygroundSettingDeleteParams = PlaygroundSettingDeleteParams.none(),
    ): PlaygroundSettingDeleteResponse = delete(playgroundSettingsId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PlaygroundSettingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaygroundSettingDeleteResponse

    /** @see delete */
    fun delete(params: PlaygroundSettingDeleteParams): PlaygroundSettingDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        playgroundSettingsId: String,
        requestOptions: RequestOptions,
    ): PlaygroundSettingDeleteResponse =
        delete(playgroundSettingsId, PlaygroundSettingDeleteParams.none(), requestOptions)

    /** Create playground settings. */
    fun playgroundSettings(
        params: PlaygroundSettingPlaygroundSettingsParams
    ): PlaygroundSettingsResponse = playgroundSettings(params, RequestOptions.none())

    /** @see playgroundSettings */
    fun playgroundSettings(
        params: PlaygroundSettingPlaygroundSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlaygroundSettingsResponse

    /** Get all playground settings for this tenant id. */
    fun retrievePlaygroundSettings(): List<PlaygroundSettingsResponse> =
        retrievePlaygroundSettings(PlaygroundSettingRetrievePlaygroundSettingsParams.none())

    /** @see retrievePlaygroundSettings */
    fun retrievePlaygroundSettings(
        params: PlaygroundSettingRetrievePlaygroundSettingsParams =
            PlaygroundSettingRetrievePlaygroundSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PlaygroundSettingsResponse>

    /** @see retrievePlaygroundSettings */
    fun retrievePlaygroundSettings(
        params: PlaygroundSettingRetrievePlaygroundSettingsParams =
            PlaygroundSettingRetrievePlaygroundSettingsParams.none()
    ): List<PlaygroundSettingsResponse> = retrievePlaygroundSettings(params, RequestOptions.none())

    /** @see retrievePlaygroundSettings */
    fun retrievePlaygroundSettings(
        requestOptions: RequestOptions
    ): List<PlaygroundSettingsResponse> =
        retrievePlaygroundSettings(
            PlaygroundSettingRetrievePlaygroundSettingsParams.none(),
            requestOptions,
        )

    /**
     * A view of [PlaygroundSettingService] that provides access to raw HTTP responses for each
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
        ): PlaygroundSettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/playground-settings/{playground_settings_id}`, but is otherwise the same as
         * [PlaygroundSettingService.update].
         */
        @MustBeClosed
        fun update(playgroundSettingsId: String): HttpResponseFor<PlaygroundSettingsResponse> =
            update(playgroundSettingsId, PlaygroundSettingUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            playgroundSettingsId: String,
            params: PlaygroundSettingUpdateParams = PlaygroundSettingUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaygroundSettingsResponse> =
            update(
                params.toBuilder().playgroundSettingsId(playgroundSettingsId).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            playgroundSettingsId: String,
            params: PlaygroundSettingUpdateParams = PlaygroundSettingUpdateParams.none(),
        ): HttpResponseFor<PlaygroundSettingsResponse> =
            update(playgroundSettingsId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PlaygroundSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaygroundSettingsResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: PlaygroundSettingUpdateParams
        ): HttpResponseFor<PlaygroundSettingsResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            playgroundSettingsId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaygroundSettingsResponse> =
            update(playgroundSettingsId, PlaygroundSettingUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/playground-settings/{playground_settings_id}`, but is otherwise the same as
         * [PlaygroundSettingService.delete].
         */
        @MustBeClosed
        fun delete(playgroundSettingsId: String): HttpResponseFor<PlaygroundSettingDeleteResponse> =
            delete(playgroundSettingsId, PlaygroundSettingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            playgroundSettingsId: String,
            params: PlaygroundSettingDeleteParams = PlaygroundSettingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaygroundSettingDeleteResponse> =
            delete(
                params.toBuilder().playgroundSettingsId(playgroundSettingsId).build(),
                requestOptions,
            )

        /** @see delete */
        @MustBeClosed
        fun delete(
            playgroundSettingsId: String,
            params: PlaygroundSettingDeleteParams = PlaygroundSettingDeleteParams.none(),
        ): HttpResponseFor<PlaygroundSettingDeleteResponse> =
            delete(playgroundSettingsId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PlaygroundSettingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaygroundSettingDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PlaygroundSettingDeleteParams
        ): HttpResponseFor<PlaygroundSettingDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            playgroundSettingsId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlaygroundSettingDeleteResponse> =
            delete(playgroundSettingsId, PlaygroundSettingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/playground-settings`, but is otherwise the
         * same as [PlaygroundSettingService.playgroundSettings].
         */
        @MustBeClosed
        fun playgroundSettings(
            params: PlaygroundSettingPlaygroundSettingsParams
        ): HttpResponseFor<PlaygroundSettingsResponse> =
            playgroundSettings(params, RequestOptions.none())

        /** @see playgroundSettings */
        @MustBeClosed
        fun playgroundSettings(
            params: PlaygroundSettingPlaygroundSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlaygroundSettingsResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/playground-settings`, but is otherwise the
         * same as [PlaygroundSettingService.retrievePlaygroundSettings].
         */
        @MustBeClosed
        fun retrievePlaygroundSettings(): HttpResponseFor<List<PlaygroundSettingsResponse>> =
            retrievePlaygroundSettings(PlaygroundSettingRetrievePlaygroundSettingsParams.none())

        /** @see retrievePlaygroundSettings */
        @MustBeClosed
        fun retrievePlaygroundSettings(
            params: PlaygroundSettingRetrievePlaygroundSettingsParams =
                PlaygroundSettingRetrievePlaygroundSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PlaygroundSettingsResponse>>

        /** @see retrievePlaygroundSettings */
        @MustBeClosed
        fun retrievePlaygroundSettings(
            params: PlaygroundSettingRetrievePlaygroundSettingsParams =
                PlaygroundSettingRetrievePlaygroundSettingsParams.none()
        ): HttpResponseFor<List<PlaygroundSettingsResponse>> =
            retrievePlaygroundSettings(params, RequestOptions.none())

        /** @see retrievePlaygroundSettings */
        @MustBeClosed
        fun retrievePlaygroundSettings(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<PlaygroundSettingsResponse>> =
            retrievePlaygroundSettings(
                PlaygroundSettingRetrievePlaygroundSettingsParams.none(),
                requestOptions,
            )
    }
}
