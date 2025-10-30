// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.public_

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.public_.schemas.SchemaRetrieveMessageJsonParams
import com.langchain.smith.models.public_.schemas.SchemaRetrieveMessageJsonResponse
import com.langchain.smith.models.public_.schemas.SchemaRetrieveTooldefJsonParams
import com.langchain.smith.models.public_.schemas.SchemaRetrieveTooldefJsonResponse
import java.util.function.Consumer

interface SchemaService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SchemaService

    /** Get Message Json Schema */
    fun retrieveMessageJson(version: String): SchemaRetrieveMessageJsonResponse =
        retrieveMessageJson(version, SchemaRetrieveMessageJsonParams.none())

    /** @see retrieveMessageJson */
    fun retrieveMessageJson(
        version: String,
        params: SchemaRetrieveMessageJsonParams = SchemaRetrieveMessageJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SchemaRetrieveMessageJsonResponse =
        retrieveMessageJson(params.toBuilder().version(version).build(), requestOptions)

    /** @see retrieveMessageJson */
    fun retrieveMessageJson(
        version: String,
        params: SchemaRetrieveMessageJsonParams = SchemaRetrieveMessageJsonParams.none(),
    ): SchemaRetrieveMessageJsonResponse =
        retrieveMessageJson(version, params, RequestOptions.none())

    /** @see retrieveMessageJson */
    fun retrieveMessageJson(
        params: SchemaRetrieveMessageJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SchemaRetrieveMessageJsonResponse

    /** @see retrieveMessageJson */
    fun retrieveMessageJson(
        params: SchemaRetrieveMessageJsonParams
    ): SchemaRetrieveMessageJsonResponse = retrieveMessageJson(params, RequestOptions.none())

    /** @see retrieveMessageJson */
    fun retrieveMessageJson(
        version: String,
        requestOptions: RequestOptions,
    ): SchemaRetrieveMessageJsonResponse =
        retrieveMessageJson(version, SchemaRetrieveMessageJsonParams.none(), requestOptions)

    /** Get Tool Def Json Schema */
    fun retrieveTooldefJson(version: String): SchemaRetrieveTooldefJsonResponse =
        retrieveTooldefJson(version, SchemaRetrieveTooldefJsonParams.none())

    /** @see retrieveTooldefJson */
    fun retrieveTooldefJson(
        version: String,
        params: SchemaRetrieveTooldefJsonParams = SchemaRetrieveTooldefJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SchemaRetrieveTooldefJsonResponse =
        retrieveTooldefJson(params.toBuilder().version(version).build(), requestOptions)

    /** @see retrieveTooldefJson */
    fun retrieveTooldefJson(
        version: String,
        params: SchemaRetrieveTooldefJsonParams = SchemaRetrieveTooldefJsonParams.none(),
    ): SchemaRetrieveTooldefJsonResponse =
        retrieveTooldefJson(version, params, RequestOptions.none())

    /** @see retrieveTooldefJson */
    fun retrieveTooldefJson(
        params: SchemaRetrieveTooldefJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SchemaRetrieveTooldefJsonResponse

    /** @see retrieveTooldefJson */
    fun retrieveTooldefJson(
        params: SchemaRetrieveTooldefJsonParams
    ): SchemaRetrieveTooldefJsonResponse = retrieveTooldefJson(params, RequestOptions.none())

    /** @see retrieveTooldefJson */
    fun retrieveTooldefJson(
        version: String,
        requestOptions: RequestOptions,
    ): SchemaRetrieveTooldefJsonResponse =
        retrieveTooldefJson(version, SchemaRetrieveTooldefJsonParams.none(), requestOptions)

    /** A view of [SchemaService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SchemaService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/public/schemas/{version}/message.json`, but
         * is otherwise the same as [SchemaService.retrieveMessageJson].
         */
        @MustBeClosed
        fun retrieveMessageJson(
            version: String
        ): HttpResponseFor<SchemaRetrieveMessageJsonResponse> =
            retrieveMessageJson(version, SchemaRetrieveMessageJsonParams.none())

        /** @see retrieveMessageJson */
        @MustBeClosed
        fun retrieveMessageJson(
            version: String,
            params: SchemaRetrieveMessageJsonParams = SchemaRetrieveMessageJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SchemaRetrieveMessageJsonResponse> =
            retrieveMessageJson(params.toBuilder().version(version).build(), requestOptions)

        /** @see retrieveMessageJson */
        @MustBeClosed
        fun retrieveMessageJson(
            version: String,
            params: SchemaRetrieveMessageJsonParams = SchemaRetrieveMessageJsonParams.none(),
        ): HttpResponseFor<SchemaRetrieveMessageJsonResponse> =
            retrieveMessageJson(version, params, RequestOptions.none())

        /** @see retrieveMessageJson */
        @MustBeClosed
        fun retrieveMessageJson(
            params: SchemaRetrieveMessageJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SchemaRetrieveMessageJsonResponse>

        /** @see retrieveMessageJson */
        @MustBeClosed
        fun retrieveMessageJson(
            params: SchemaRetrieveMessageJsonParams
        ): HttpResponseFor<SchemaRetrieveMessageJsonResponse> =
            retrieveMessageJson(params, RequestOptions.none())

        /** @see retrieveMessageJson */
        @MustBeClosed
        fun retrieveMessageJson(
            version: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SchemaRetrieveMessageJsonResponse> =
            retrieveMessageJson(version, SchemaRetrieveMessageJsonParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/schemas/{version}/tooldef.json`, but
         * is otherwise the same as [SchemaService.retrieveTooldefJson].
         */
        @MustBeClosed
        fun retrieveTooldefJson(
            version: String
        ): HttpResponseFor<SchemaRetrieveTooldefJsonResponse> =
            retrieveTooldefJson(version, SchemaRetrieveTooldefJsonParams.none())

        /** @see retrieveTooldefJson */
        @MustBeClosed
        fun retrieveTooldefJson(
            version: String,
            params: SchemaRetrieveTooldefJsonParams = SchemaRetrieveTooldefJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SchemaRetrieveTooldefJsonResponse> =
            retrieveTooldefJson(params.toBuilder().version(version).build(), requestOptions)

        /** @see retrieveTooldefJson */
        @MustBeClosed
        fun retrieveTooldefJson(
            version: String,
            params: SchemaRetrieveTooldefJsonParams = SchemaRetrieveTooldefJsonParams.none(),
        ): HttpResponseFor<SchemaRetrieveTooldefJsonResponse> =
            retrieveTooldefJson(version, params, RequestOptions.none())

        /** @see retrieveTooldefJson */
        @MustBeClosed
        fun retrieveTooldefJson(
            params: SchemaRetrieveTooldefJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SchemaRetrieveTooldefJsonResponse>

        /** @see retrieveTooldefJson */
        @MustBeClosed
        fun retrieveTooldefJson(
            params: SchemaRetrieveTooldefJsonParams
        ): HttpResponseFor<SchemaRetrieveTooldefJsonResponse> =
            retrieveTooldefJson(params, RequestOptions.none())

        /** @see retrieveTooldefJson */
        @MustBeClosed
        fun retrieveTooldefJson(
            version: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SchemaRetrieveTooldefJsonResponse> =
            retrieveTooldefJson(version, SchemaRetrieveTooldefJsonParams.none(), requestOptions)
    }
}
