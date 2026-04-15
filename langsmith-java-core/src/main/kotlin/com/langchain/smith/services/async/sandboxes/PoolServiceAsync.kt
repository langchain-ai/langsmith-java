// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sandboxes

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PoolServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoolServiceAsync

    /** Create a new warm pool from a template with a specified replica count */
    fun create(params: PoolCreateParams): CompletableFuture<PoolCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PoolCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PoolCreateResponse>

    /** Get a warm pool by name */
    fun retrieve(name: String): CompletableFuture<PoolRetrieveResponse> =
        retrieve(name, PoolRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: PoolRetrieveParams = PoolRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PoolRetrieveResponse> =
        retrieve(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: PoolRetrieveParams = PoolRetrieveParams.none(),
    ): CompletableFuture<PoolRetrieveResponse> = retrieve(name, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PoolRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PoolRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: PoolRetrieveParams): CompletableFuture<PoolRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PoolRetrieveResponse> =
        retrieve(name, PoolRetrieveParams.none(), requestOptions)

    /** Update a warm pool's name or replica count */
    fun update(pathName: String): CompletableFuture<PoolUpdateResponse> =
        update(pathName, PoolUpdateParams.none())

    /** @see update */
    fun update(
        pathName: String,
        params: PoolUpdateParams = PoolUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PoolUpdateResponse> =
        update(params.toBuilder().pathName(pathName).build(), requestOptions)

    /** @see update */
    fun update(
        pathName: String,
        params: PoolUpdateParams = PoolUpdateParams.none(),
    ): CompletableFuture<PoolUpdateResponse> = update(pathName, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PoolUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PoolUpdateResponse>

    /** @see update */
    fun update(params: PoolUpdateParams): CompletableFuture<PoolUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        pathName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PoolUpdateResponse> =
        update(pathName, PoolUpdateParams.none(), requestOptions)

    /** List all warm pools for the current workspace */
    fun list(): CompletableFuture<PoolListResponse> = list(PoolListParams.none())

    /** @see list */
    fun list(
        params: PoolListParams = PoolListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PoolListResponse>

    /** @see list */
    fun list(params: PoolListParams = PoolListParams.none()): CompletableFuture<PoolListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PoolListResponse> =
        list(PoolListParams.none(), requestOptions)

    /** Delete a warm pool by name */
    fun delete(name: String): CompletableFuture<Void?> = delete(name, PoolDeleteParams.none())

    /** @see delete */
    fun delete(
        name: String,
        params: PoolDeleteParams = PoolDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().name(name).build(), requestOptions)

    /** @see delete */
    fun delete(
        name: String,
        params: PoolDeleteParams = PoolDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(name, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PoolDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: PoolDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(name: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(name, PoolDeleteParams.none(), requestOptions)

    /** A view of [PoolServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PoolServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/pools`, but is otherwise the same as
         * [PoolServiceAsync.create].
         */
        fun create(
            params: PoolCreateParams
        ): CompletableFuture<HttpResponseFor<PoolCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PoolCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PoolCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/pools/{name}`, but is otherwise the
         * same as [PoolServiceAsync.retrieve].
         */
        fun retrieve(name: String): CompletableFuture<HttpResponseFor<PoolRetrieveResponse>> =
            retrieve(name, PoolRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            name: String,
            params: PoolRetrieveParams = PoolRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PoolRetrieveResponse>> =
            retrieve(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            name: String,
            params: PoolRetrieveParams = PoolRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PoolRetrieveResponse>> =
            retrieve(name, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PoolRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PoolRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PoolRetrieveParams
        ): CompletableFuture<HttpResponseFor<PoolRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PoolRetrieveResponse>> =
            retrieve(name, PoolRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/sandboxes/pools/{name}`, but is otherwise the
         * same as [PoolServiceAsync.update].
         */
        fun update(pathName: String): CompletableFuture<HttpResponseFor<PoolUpdateResponse>> =
            update(pathName, PoolUpdateParams.none())

        /** @see update */
        fun update(
            pathName: String,
            params: PoolUpdateParams = PoolUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PoolUpdateResponse>> =
            update(params.toBuilder().pathName(pathName).build(), requestOptions)

        /** @see update */
        fun update(
            pathName: String,
            params: PoolUpdateParams = PoolUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<PoolUpdateResponse>> =
            update(pathName, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PoolUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PoolUpdateResponse>>

        /** @see update */
        fun update(
            params: PoolUpdateParams
        ): CompletableFuture<HttpResponseFor<PoolUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            pathName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PoolUpdateResponse>> =
            update(pathName, PoolUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/pools`, but is otherwise the same as
         * [PoolServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PoolListResponse>> =
            list(PoolListParams.none())

        /** @see list */
        fun list(
            params: PoolListParams = PoolListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PoolListResponse>>

        /** @see list */
        fun list(
            params: PoolListParams = PoolListParams.none()
        ): CompletableFuture<HttpResponseFor<PoolListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PoolListResponse>> =
            list(PoolListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/sandboxes/pools/{name}`, but is otherwise the
         * same as [PoolServiceAsync.delete].
         */
        fun delete(name: String): CompletableFuture<HttpResponse> =
            delete(name, PoolDeleteParams.none())

        /** @see delete */
        fun delete(
            name: String,
            params: PoolDeleteParams = PoolDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().name(name).build(), requestOptions)

        /** @see delete */
        fun delete(
            name: String,
            params: PoolDeleteParams = PoolDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(name, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PoolDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: PoolDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(name: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(name, PoolDeleteParams.none(), requestOptions)
    }
}
