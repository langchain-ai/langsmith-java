// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.workspaces.current

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.workspaces.current.secrets.SecretCreateParams
import com.langsmith_api.api.models.api.v1.workspaces.current.secrets.SecretCreateResponse
import com.langsmith_api.api.models.api.v1.workspaces.current.secrets.SecretListParams
import com.langsmith_api.api.models.api.v1.workspaces.current.secrets.SecretListResponse
import com.langsmith_api.api.models.api.v1.workspaces.current.secrets.SecretRetrieveEncryptedParams
import com.langsmith_api.api.models.api.v1.workspaces.current.secrets.SecretRetrieveEncryptedResponse
import java.util.function.Consumer

interface SecretService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretService

    /** Upsert Current Workspace Secrets */
    fun create(params: SecretCreateParams): SecretCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SecretCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecretCreateResponse

    /** List Current Workspace Secrets */
    fun list(): List<SecretListResponse> = list(SecretListParams.none())

    /** @see list */
    fun list(
        params: SecretListParams = SecretListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SecretListResponse>

    /** @see list */
    fun list(params: SecretListParams = SecretListParams.none()): List<SecretListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<SecretListResponse> =
        list(SecretListParams.none(), requestOptions)

    /** Get encrypted workspace secrets for use with Agent Builder and external services. */
    fun retrieveEncrypted(params: SecretRetrieveEncryptedParams): SecretRetrieveEncryptedResponse =
        retrieveEncrypted(params, RequestOptions.none())

    /** @see retrieveEncrypted */
    fun retrieveEncrypted(
        params: SecretRetrieveEncryptedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecretRetrieveEncryptedResponse

    /** A view of [SecretService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces/current/secrets`, but is
         * otherwise the same as [SecretService.create].
         */
        @MustBeClosed
        fun create(params: SecretCreateParams): HttpResponseFor<SecretCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SecretCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecretCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/secrets`, but is
         * otherwise the same as [SecretService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<SecretListResponse>> = list(SecretListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SecretListParams = SecretListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SecretListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SecretListParams = SecretListParams.none()
        ): HttpResponseFor<List<SecretListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<SecretListResponse>> =
            list(SecretListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/secrets/encrypted`, but
         * is otherwise the same as [SecretService.retrieveEncrypted].
         */
        @MustBeClosed
        fun retrieveEncrypted(
            params: SecretRetrieveEncryptedParams
        ): HttpResponseFor<SecretRetrieveEncryptedResponse> =
            retrieveEncrypted(params, RequestOptions.none())

        /** @see retrieveEncrypted */
        @MustBeClosed
        fun retrieveEncrypted(
            params: SecretRetrieveEncryptedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecretRetrieveEncryptedResponse>
    }
}
