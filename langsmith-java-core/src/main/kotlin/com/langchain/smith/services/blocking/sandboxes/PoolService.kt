// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sandboxes.pools.PoolCreateParams
import com.langchain.smith.models.sandboxes.pools.PoolCreateResponse
import com.langchain.smith.models.sandboxes.pools.PoolDeleteParams
import com.langchain.smith.models.sandboxes.pools.PoolListParams
import com.langchain.smith.models.sandboxes.pools.PoolListResponse
import com.langchain.smith.models.sandboxes.pools.PoolRetrieveParams
import com.langchain.smith.models.sandboxes.pools.PoolRetrieveResponse
import com.langchain.smith.models.sandboxes.pools.PoolUpdateParams
import com.langchain.smith.models.sandboxes.pools.PoolUpdateResponse
import java.util.function.Consumer

interface PoolService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoolService

    /** Create a new warm pool from a template with a specified replica count */
    fun create(params: PoolCreateParams): PoolCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PoolCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PoolCreateResponse

    /** Get a warm pool by name */
    fun retrieve(name: String): PoolRetrieveResponse = retrieve(name, PoolRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: PoolRetrieveParams = PoolRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PoolRetrieveResponse = retrieve(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: PoolRetrieveParams = PoolRetrieveParams.none(),
    ): PoolRetrieveResponse = retrieve(name, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PoolRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PoolRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: PoolRetrieveParams): PoolRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(name: String, requestOptions: RequestOptions): PoolRetrieveResponse =
        retrieve(name, PoolRetrieveParams.none(), requestOptions)

    /** Update a warm pool's name or replica count */
    fun update(pathName: String): PoolUpdateResponse = update(pathName, PoolUpdateParams.none())

    /** @see update */
    fun update(
        pathName: String,
        params: PoolUpdateParams = PoolUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PoolUpdateResponse = update(params.toBuilder().pathName(pathName).build(), requestOptions)

    /** @see update */
    fun update(
        pathName: String,
        params: PoolUpdateParams = PoolUpdateParams.none(),
    ): PoolUpdateResponse = update(pathName, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PoolUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PoolUpdateResponse

    /** @see update */
    fun update(params: PoolUpdateParams): PoolUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(pathName: String, requestOptions: RequestOptions): PoolUpdateResponse =
        update(pathName, PoolUpdateParams.none(), requestOptions)

    /** List all warm pools for the current workspace */
    fun list(): PoolListResponse = list(PoolListParams.none())

    /** @see list */
    fun list(
        params: PoolListParams = PoolListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PoolListResponse

    /** @see list */
    fun list(params: PoolListParams = PoolListParams.none()): PoolListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PoolListResponse =
        list(PoolListParams.none(), requestOptions)

    /** Delete a warm pool by name */
    fun delete(name: String) = delete(name, PoolDeleteParams.none())

    /** @see delete */
    fun delete(
        name: String,
        params: PoolDeleteParams = PoolDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().name(name).build(), requestOptions)

    /** @see delete */
    fun delete(name: String, params: PoolDeleteParams = PoolDeleteParams.none()) =
        delete(name, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: PoolDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: PoolDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(name: String, requestOptions: RequestOptions) =
        delete(name, PoolDeleteParams.none(), requestOptions)

    /** A view of [PoolService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoolService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/pools`, but is otherwise the same as
         * [PoolService.create].
         */
        @MustBeClosed
        fun create(params: PoolCreateParams): HttpResponseFor<PoolCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PoolCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PoolCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/pools/{name}`, but is otherwise the
         * same as [PoolService.retrieve].
         */
        @MustBeClosed
        fun retrieve(name: String): HttpResponseFor<PoolRetrieveResponse> =
            retrieve(name, PoolRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            params: PoolRetrieveParams = PoolRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PoolRetrieveResponse> =
            retrieve(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            params: PoolRetrieveParams = PoolRetrieveParams.none(),
        ): HttpResponseFor<PoolRetrieveResponse> = retrieve(name, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PoolRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PoolRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PoolRetrieveParams): HttpResponseFor<PoolRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PoolRetrieveResponse> =
            retrieve(name, PoolRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/sandboxes/pools/{name}`, but is otherwise the
         * same as [PoolService.update].
         */
        @MustBeClosed
        fun update(pathName: String): HttpResponseFor<PoolUpdateResponse> =
            update(pathName, PoolUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathName: String,
            params: PoolUpdateParams = PoolUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PoolUpdateResponse> =
            update(params.toBuilder().pathName(pathName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            pathName: String,
            params: PoolUpdateParams = PoolUpdateParams.none(),
        ): HttpResponseFor<PoolUpdateResponse> = update(pathName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PoolUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PoolUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: PoolUpdateParams): HttpResponseFor<PoolUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PoolUpdateResponse> =
            update(pathName, PoolUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/pools`, but is otherwise the same as
         * [PoolService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PoolListResponse> = list(PoolListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PoolListParams = PoolListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PoolListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PoolListParams = PoolListParams.none()
        ): HttpResponseFor<PoolListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PoolListResponse> =
            list(PoolListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/sandboxes/pools/{name}`, but is otherwise the
         * same as [PoolService.delete].
         */
        @MustBeClosed fun delete(name: String): HttpResponse = delete(name, PoolDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            name: String,
            params: PoolDeleteParams = PoolDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().name(name).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(name: String, params: PoolDeleteParams = PoolDeleteParams.none()): HttpResponse =
            delete(name, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PoolDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: PoolDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(name: String, requestOptions: RequestOptions): HttpResponse =
            delete(name, PoolDeleteParams.none(), requestOptions)
    }
}
