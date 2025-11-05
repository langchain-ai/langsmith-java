// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.workspaces.current

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.workspaces.current.secrets.SecretCreateParams
import com.langchain.smith.models.workspaces.current.secrets.SecretCreateResponse
import com.langchain.smith.models.workspaces.current.secrets.SecretListParams
import com.langchain.smith.models.workspaces.current.secrets.SecretListResponse
import com.langchain.smith.models.workspaces.current.secrets.SecretRetrieveEncryptedParams
import com.langchain.smith.models.workspaces.current.secrets.SecretRetrieveEncryptedResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SecretServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretServiceAsync

    /** Upsert Current Workspace Secrets */
    fun create(params: SecretCreateParams): CompletableFuture<SecretCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SecretCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretCreateResponse>

    /** List Current Workspace Secrets */
    fun list(): CompletableFuture<List<SecretListResponse>> = list(SecretListParams.none())

    /** @see list */
    fun list(
        params: SecretListParams = SecretListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SecretListResponse>>

    /** @see list */
    fun list(
        params: SecretListParams = SecretListParams.none()
    ): CompletableFuture<List<SecretListResponse>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<SecretListResponse>> =
        list(SecretListParams.none(), requestOptions)

    /** Get encrypted workspace secrets for use with Agent Builder and external services. */
    fun retrieveEncrypted(
        params: SecretRetrieveEncryptedParams
    ): CompletableFuture<SecretRetrieveEncryptedResponse> =
        retrieveEncrypted(params, RequestOptions.none())

    /** @see retrieveEncrypted */
    fun retrieveEncrypted(
        params: SecretRetrieveEncryptedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretRetrieveEncryptedResponse>

    /**
     * A view of [SecretServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SecretServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/workspaces/current/secrets`, but is
         * otherwise the same as [SecretServiceAsync.create].
         */
        fun create(
            params: SecretCreateParams
        ): CompletableFuture<HttpResponseFor<SecretCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SecretCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/secrets`, but is
         * otherwise the same as [SecretServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<SecretListResponse>>> =
            list(SecretListParams.none())

        /** @see list */
        fun list(
            params: SecretListParams = SecretListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SecretListResponse>>>

        /** @see list */
        fun list(
            params: SecretListParams = SecretListParams.none()
        ): CompletableFuture<HttpResponseFor<List<SecretListResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<SecretListResponse>>> =
            list(SecretListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/secrets/encrypted`, but
         * is otherwise the same as [SecretServiceAsync.retrieveEncrypted].
         */
        fun retrieveEncrypted(
            params: SecretRetrieveEncryptedParams
        ): CompletableFuture<HttpResponseFor<SecretRetrieveEncryptedResponse>> =
            retrieveEncrypted(params, RequestOptions.none())

        /** @see retrieveEncrypted */
        fun retrieveEncrypted(
            params: SecretRetrieveEncryptedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretRetrieveEncryptedResponse>>
    }
}
