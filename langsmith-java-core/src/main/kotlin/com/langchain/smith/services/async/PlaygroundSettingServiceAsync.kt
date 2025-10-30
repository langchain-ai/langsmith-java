// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.playgroundsettings.PlaygroundSettingDeleteParams
import com.langchain.smith.models.playgroundsettings.PlaygroundSettingDeleteResponse
import com.langchain.smith.models.playgroundsettings.PlaygroundSettingPlaygroundSettingsParams
import com.langchain.smith.models.playgroundsettings.PlaygroundSettingRetrievePlaygroundSettingsParams
import com.langchain.smith.models.playgroundsettings.PlaygroundSettingUpdateParams
import com.langchain.smith.models.playgroundsettings.PlaygroundSettingsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PlaygroundSettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlaygroundSettingServiceAsync

    /** Update playground settings. */
    fun update(playgroundSettingsId: String): CompletableFuture<PlaygroundSettingsResponse> =
        update(playgroundSettingsId, PlaygroundSettingUpdateParams.none())

    /** @see update */
    fun update(
        playgroundSettingsId: String,
        params: PlaygroundSettingUpdateParams = PlaygroundSettingUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaygroundSettingsResponse> =
        update(
            params.toBuilder().playgroundSettingsId(playgroundSettingsId).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        playgroundSettingsId: String,
        params: PlaygroundSettingUpdateParams = PlaygroundSettingUpdateParams.none(),
    ): CompletableFuture<PlaygroundSettingsResponse> =
        update(playgroundSettingsId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PlaygroundSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaygroundSettingsResponse>

    /** @see update */
    fun update(
        params: PlaygroundSettingUpdateParams
    ): CompletableFuture<PlaygroundSettingsResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        playgroundSettingsId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlaygroundSettingsResponse> =
        update(playgroundSettingsId, PlaygroundSettingUpdateParams.none(), requestOptions)

    /** Delete playground settings. */
    fun delete(playgroundSettingsId: String): CompletableFuture<PlaygroundSettingDeleteResponse> =
        delete(playgroundSettingsId, PlaygroundSettingDeleteParams.none())

    /** @see delete */
    fun delete(
        playgroundSettingsId: String,
        params: PlaygroundSettingDeleteParams = PlaygroundSettingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaygroundSettingDeleteResponse> =
        delete(
            params.toBuilder().playgroundSettingsId(playgroundSettingsId).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(
        playgroundSettingsId: String,
        params: PlaygroundSettingDeleteParams = PlaygroundSettingDeleteParams.none(),
    ): CompletableFuture<PlaygroundSettingDeleteResponse> =
        delete(playgroundSettingsId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PlaygroundSettingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaygroundSettingDeleteResponse>

    /** @see delete */
    fun delete(
        params: PlaygroundSettingDeleteParams
    ): CompletableFuture<PlaygroundSettingDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        playgroundSettingsId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlaygroundSettingDeleteResponse> =
        delete(playgroundSettingsId, PlaygroundSettingDeleteParams.none(), requestOptions)

    /** Create playground settings. */
    fun playgroundSettings(
        params: PlaygroundSettingPlaygroundSettingsParams
    ): CompletableFuture<PlaygroundSettingsResponse> =
        playgroundSettings(params, RequestOptions.none())

    /** @see playgroundSettings */
    fun playgroundSettings(
        params: PlaygroundSettingPlaygroundSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlaygroundSettingsResponse>

    /** Get all playground settings for this tenant id. */
    fun retrievePlaygroundSettings(): CompletableFuture<List<PlaygroundSettingsResponse>> =
        retrievePlaygroundSettings(PlaygroundSettingRetrievePlaygroundSettingsParams.none())

    /** @see retrievePlaygroundSettings */
    fun retrievePlaygroundSettings(
        params: PlaygroundSettingRetrievePlaygroundSettingsParams =
            PlaygroundSettingRetrievePlaygroundSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PlaygroundSettingsResponse>>

    /** @see retrievePlaygroundSettings */
    fun retrievePlaygroundSettings(
        params: PlaygroundSettingRetrievePlaygroundSettingsParams =
            PlaygroundSettingRetrievePlaygroundSettingsParams.none()
    ): CompletableFuture<List<PlaygroundSettingsResponse>> =
        retrievePlaygroundSettings(params, RequestOptions.none())

    /** @see retrievePlaygroundSettings */
    fun retrievePlaygroundSettings(
        requestOptions: RequestOptions
    ): CompletableFuture<List<PlaygroundSettingsResponse>> =
        retrievePlaygroundSettings(
            PlaygroundSettingRetrievePlaygroundSettingsParams.none(),
            requestOptions,
        )

    /**
     * A view of [PlaygroundSettingServiceAsync] that provides access to raw HTTP responses for each
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
        ): PlaygroundSettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/playground-settings/{playground_settings_id}`, but is otherwise the same as
         * [PlaygroundSettingServiceAsync.update].
         */
        fun update(
            playgroundSettingsId: String
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingsResponse>> =
            update(playgroundSettingsId, PlaygroundSettingUpdateParams.none())

        /** @see update */
        fun update(
            playgroundSettingsId: String,
            params: PlaygroundSettingUpdateParams = PlaygroundSettingUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingsResponse>> =
            update(
                params.toBuilder().playgroundSettingsId(playgroundSettingsId).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            playgroundSettingsId: String,
            params: PlaygroundSettingUpdateParams = PlaygroundSettingUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingsResponse>> =
            update(playgroundSettingsId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PlaygroundSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingsResponse>>

        /** @see update */
        fun update(
            params: PlaygroundSettingUpdateParams
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingsResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            playgroundSettingsId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingsResponse>> =
            update(playgroundSettingsId, PlaygroundSettingUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/playground-settings/{playground_settings_id}`, but is otherwise the same as
         * [PlaygroundSettingServiceAsync.delete].
         */
        fun delete(
            playgroundSettingsId: String
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingDeleteResponse>> =
            delete(playgroundSettingsId, PlaygroundSettingDeleteParams.none())

        /** @see delete */
        fun delete(
            playgroundSettingsId: String,
            params: PlaygroundSettingDeleteParams = PlaygroundSettingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingDeleteResponse>> =
            delete(
                params.toBuilder().playgroundSettingsId(playgroundSettingsId).build(),
                requestOptions,
            )

        /** @see delete */
        fun delete(
            playgroundSettingsId: String,
            params: PlaygroundSettingDeleteParams = PlaygroundSettingDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingDeleteResponse>> =
            delete(playgroundSettingsId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PlaygroundSettingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingDeleteResponse>>

        /** @see delete */
        fun delete(
            params: PlaygroundSettingDeleteParams
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            playgroundSettingsId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingDeleteResponse>> =
            delete(playgroundSettingsId, PlaygroundSettingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/playground-settings`, but is otherwise the
         * same as [PlaygroundSettingServiceAsync.playgroundSettings].
         */
        fun playgroundSettings(
            params: PlaygroundSettingPlaygroundSettingsParams
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingsResponse>> =
            playgroundSettings(params, RequestOptions.none())

        /** @see playgroundSettings */
        fun playgroundSettings(
            params: PlaygroundSettingPlaygroundSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlaygroundSettingsResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/playground-settings`, but is otherwise the
         * same as [PlaygroundSettingServiceAsync.retrievePlaygroundSettings].
         */
        fun retrievePlaygroundSettings():
            CompletableFuture<HttpResponseFor<List<PlaygroundSettingsResponse>>> =
            retrievePlaygroundSettings(PlaygroundSettingRetrievePlaygroundSettingsParams.none())

        /** @see retrievePlaygroundSettings */
        fun retrievePlaygroundSettings(
            params: PlaygroundSettingRetrievePlaygroundSettingsParams =
                PlaygroundSettingRetrievePlaygroundSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PlaygroundSettingsResponse>>>

        /** @see retrievePlaygroundSettings */
        fun retrievePlaygroundSettings(
            params: PlaygroundSettingRetrievePlaygroundSettingsParams =
                PlaygroundSettingRetrievePlaygroundSettingsParams.none()
        ): CompletableFuture<HttpResponseFor<List<PlaygroundSettingsResponse>>> =
            retrievePlaygroundSettings(params, RequestOptions.none())

        /** @see retrievePlaygroundSettings */
        fun retrievePlaygroundSettings(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<PlaygroundSettingsResponse>>> =
            retrievePlaygroundSettings(
                PlaygroundSettingRetrievePlaygroundSettingsParams.none(),
                requestOptions,
            )
    }
}
