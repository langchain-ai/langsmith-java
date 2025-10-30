// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.public_

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.public_.schemas.SchemaRetrieveMessageJsonParams
import com.langsmith_api.api.models.api.v1.public_.schemas.SchemaRetrieveMessageJsonResponse
import com.langsmith_api.api.models.api.v1.public_.schemas.SchemaRetrieveTooldefJsonParams
import com.langsmith_api.api.models.api.v1.public_.schemas.SchemaRetrieveTooldefJsonResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SchemaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SchemaServiceAsync

    /** Get Message Json Schema */
    fun retrieveMessageJson(version: String): CompletableFuture<SchemaRetrieveMessageJsonResponse> =
        retrieveMessageJson(version, SchemaRetrieveMessageJsonParams.none())

    /** @see retrieveMessageJson */
    fun retrieveMessageJson(
        version: String,
        params: SchemaRetrieveMessageJsonParams = SchemaRetrieveMessageJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SchemaRetrieveMessageJsonResponse> =
        retrieveMessageJson(params.toBuilder().version(version).build(), requestOptions)

    /** @see retrieveMessageJson */
    fun retrieveMessageJson(
        version: String,
        params: SchemaRetrieveMessageJsonParams = SchemaRetrieveMessageJsonParams.none(),
    ): CompletableFuture<SchemaRetrieveMessageJsonResponse> =
        retrieveMessageJson(version, params, RequestOptions.none())

    /** @see retrieveMessageJson */
    fun retrieveMessageJson(
        params: SchemaRetrieveMessageJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SchemaRetrieveMessageJsonResponse>

    /** @see retrieveMessageJson */
    fun retrieveMessageJson(
        params: SchemaRetrieveMessageJsonParams
    ): CompletableFuture<SchemaRetrieveMessageJsonResponse> =
        retrieveMessageJson(params, RequestOptions.none())

    /** @see retrieveMessageJson */
    fun retrieveMessageJson(
        version: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SchemaRetrieveMessageJsonResponse> =
        retrieveMessageJson(version, SchemaRetrieveMessageJsonParams.none(), requestOptions)

    /** Get Tool Def Json Schema */
    fun retrieveTooldefJson(version: String): CompletableFuture<SchemaRetrieveTooldefJsonResponse> =
        retrieveTooldefJson(version, SchemaRetrieveTooldefJsonParams.none())

    /** @see retrieveTooldefJson */
    fun retrieveTooldefJson(
        version: String,
        params: SchemaRetrieveTooldefJsonParams = SchemaRetrieveTooldefJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SchemaRetrieveTooldefJsonResponse> =
        retrieveTooldefJson(params.toBuilder().version(version).build(), requestOptions)

    /** @see retrieveTooldefJson */
    fun retrieveTooldefJson(
        version: String,
        params: SchemaRetrieveTooldefJsonParams = SchemaRetrieveTooldefJsonParams.none(),
    ): CompletableFuture<SchemaRetrieveTooldefJsonResponse> =
        retrieveTooldefJson(version, params, RequestOptions.none())

    /** @see retrieveTooldefJson */
    fun retrieveTooldefJson(
        params: SchemaRetrieveTooldefJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SchemaRetrieveTooldefJsonResponse>

    /** @see retrieveTooldefJson */
    fun retrieveTooldefJson(
        params: SchemaRetrieveTooldefJsonParams
    ): CompletableFuture<SchemaRetrieveTooldefJsonResponse> =
        retrieveTooldefJson(params, RequestOptions.none())

    /** @see retrieveTooldefJson */
    fun retrieveTooldefJson(
        version: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SchemaRetrieveTooldefJsonResponse> =
        retrieveTooldefJson(version, SchemaRetrieveTooldefJsonParams.none(), requestOptions)

    /**
     * A view of [SchemaServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SchemaServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/public/schemas/{version}/message.json`, but
         * is otherwise the same as [SchemaServiceAsync.retrieveMessageJson].
         */
        fun retrieveMessageJson(
            version: String
        ): CompletableFuture<HttpResponseFor<SchemaRetrieveMessageJsonResponse>> =
            retrieveMessageJson(version, SchemaRetrieveMessageJsonParams.none())

        /** @see retrieveMessageJson */
        fun retrieveMessageJson(
            version: String,
            params: SchemaRetrieveMessageJsonParams = SchemaRetrieveMessageJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SchemaRetrieveMessageJsonResponse>> =
            retrieveMessageJson(params.toBuilder().version(version).build(), requestOptions)

        /** @see retrieveMessageJson */
        fun retrieveMessageJson(
            version: String,
            params: SchemaRetrieveMessageJsonParams = SchemaRetrieveMessageJsonParams.none(),
        ): CompletableFuture<HttpResponseFor<SchemaRetrieveMessageJsonResponse>> =
            retrieveMessageJson(version, params, RequestOptions.none())

        /** @see retrieveMessageJson */
        fun retrieveMessageJson(
            params: SchemaRetrieveMessageJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SchemaRetrieveMessageJsonResponse>>

        /** @see retrieveMessageJson */
        fun retrieveMessageJson(
            params: SchemaRetrieveMessageJsonParams
        ): CompletableFuture<HttpResponseFor<SchemaRetrieveMessageJsonResponse>> =
            retrieveMessageJson(params, RequestOptions.none())

        /** @see retrieveMessageJson */
        fun retrieveMessageJson(
            version: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SchemaRetrieveMessageJsonResponse>> =
            retrieveMessageJson(version, SchemaRetrieveMessageJsonParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/schemas/{version}/tooldef.json`, but
         * is otherwise the same as [SchemaServiceAsync.retrieveTooldefJson].
         */
        fun retrieveTooldefJson(
            version: String
        ): CompletableFuture<HttpResponseFor<SchemaRetrieveTooldefJsonResponse>> =
            retrieveTooldefJson(version, SchemaRetrieveTooldefJsonParams.none())

        /** @see retrieveTooldefJson */
        fun retrieveTooldefJson(
            version: String,
            params: SchemaRetrieveTooldefJsonParams = SchemaRetrieveTooldefJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SchemaRetrieveTooldefJsonResponse>> =
            retrieveTooldefJson(params.toBuilder().version(version).build(), requestOptions)

        /** @see retrieveTooldefJson */
        fun retrieveTooldefJson(
            version: String,
            params: SchemaRetrieveTooldefJsonParams = SchemaRetrieveTooldefJsonParams.none(),
        ): CompletableFuture<HttpResponseFor<SchemaRetrieveTooldefJsonResponse>> =
            retrieveTooldefJson(version, params, RequestOptions.none())

        /** @see retrieveTooldefJson */
        fun retrieveTooldefJson(
            params: SchemaRetrieveTooldefJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SchemaRetrieveTooldefJsonResponse>>

        /** @see retrieveTooldefJson */
        fun retrieveTooldefJson(
            params: SchemaRetrieveTooldefJsonParams
        ): CompletableFuture<HttpResponseFor<SchemaRetrieveTooldefJsonResponse>> =
            retrieveTooldefJson(params, RequestOptions.none())

        /** @see retrieveTooldefJson */
        fun retrieveTooldefJson(
            version: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SchemaRetrieveTooldefJsonResponse>> =
            retrieveTooldefJson(version, SchemaRetrieveTooldefJsonParams.none(), requestOptions)
    }
}
