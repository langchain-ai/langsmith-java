// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sandboxes

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sandboxes.registries.RegistryCreateParams
import com.langchain.smith.models.sandboxes.registries.RegistryDeleteParams
import com.langchain.smith.models.sandboxes.registries.RegistryListParams
import com.langchain.smith.models.sandboxes.registries.RegistryListResponse
import com.langchain.smith.models.sandboxes.registries.RegistryResponse
import com.langchain.smith.models.sandboxes.registries.RegistryRetrieveParams
import com.langchain.smith.models.sandboxes.registries.RegistryUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RegistryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegistryServiceAsync

    /** Create a sandbox registry for pulling private images. */
    fun create(params: RegistryCreateParams): CompletableFuture<RegistryResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RegistryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegistryResponse>

    /** Get a sandbox registry by name. */
    fun retrieve(name: String): CompletableFuture<RegistryResponse> =
        retrieve(name, RegistryRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: RegistryRetrieveParams = RegistryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegistryResponse> =
        retrieve(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: RegistryRetrieveParams = RegistryRetrieveParams.none(),
    ): CompletableFuture<RegistryResponse> = retrieve(name, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RegistryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegistryResponse>

    /** @see retrieve */
    fun retrieve(params: RegistryRetrieveParams): CompletableFuture<RegistryResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RegistryResponse> =
        retrieve(name, RegistryRetrieveParams.none(), requestOptions)

    /** Update a sandbox registry's name and/or credentials. */
    fun update(pathName: String): CompletableFuture<RegistryResponse> =
        update(pathName, RegistryUpdateParams.none())

    /** @see update */
    fun update(
        pathName: String,
        params: RegistryUpdateParams = RegistryUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegistryResponse> =
        update(params.toBuilder().pathName(pathName).build(), requestOptions)

    /** @see update */
    fun update(
        pathName: String,
        params: RegistryUpdateParams = RegistryUpdateParams.none(),
    ): CompletableFuture<RegistryResponse> = update(pathName, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RegistryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegistryResponse>

    /** @see update */
    fun update(params: RegistryUpdateParams): CompletableFuture<RegistryResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        pathName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RegistryResponse> =
        update(pathName, RegistryUpdateParams.none(), requestOptions)

    /** List sandbox registries for pulling private images. */
    fun list(): CompletableFuture<RegistryListResponse> = list(RegistryListParams.none())

    /** @see list */
    fun list(
        params: RegistryListParams = RegistryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RegistryListResponse>

    /** @see list */
    fun list(
        params: RegistryListParams = RegistryListParams.none()
    ): CompletableFuture<RegistryListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RegistryListResponse> =
        list(RegistryListParams.none(), requestOptions)

    /** Delete a sandbox registry by name. */
    fun delete(name: String): CompletableFuture<Void?> = delete(name, RegistryDeleteParams.none())

    /** @see delete */
    fun delete(
        name: String,
        params: RegistryDeleteParams = RegistryDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().name(name).build(), requestOptions)

    /** @see delete */
    fun delete(
        name: String,
        params: RegistryDeleteParams = RegistryDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(name, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RegistryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: RegistryDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(name: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(name, RegistryDeleteParams.none(), requestOptions)

    /**
     * A view of [RegistryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RegistryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/registries`, but is otherwise the
         * same as [RegistryServiceAsync.create].
         */
        fun create(
            params: RegistryCreateParams
        ): CompletableFuture<HttpResponseFor<RegistryResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RegistryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegistryResponse>>

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/registries/{name}`, but is otherwise
         * the same as [RegistryServiceAsync.retrieve].
         */
        fun retrieve(name: String): CompletableFuture<HttpResponseFor<RegistryResponse>> =
            retrieve(name, RegistryRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            name: String,
            params: RegistryRetrieveParams = RegistryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegistryResponse>> =
            retrieve(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            name: String,
            params: RegistryRetrieveParams = RegistryRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RegistryResponse>> =
            retrieve(name, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RegistryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegistryResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RegistryRetrieveParams
        ): CompletableFuture<HttpResponseFor<RegistryResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RegistryResponse>> =
            retrieve(name, RegistryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/sandboxes/registries/{name}`, but is otherwise
         * the same as [RegistryServiceAsync.update].
         */
        fun update(pathName: String): CompletableFuture<HttpResponseFor<RegistryResponse>> =
            update(pathName, RegistryUpdateParams.none())

        /** @see update */
        fun update(
            pathName: String,
            params: RegistryUpdateParams = RegistryUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegistryResponse>> =
            update(params.toBuilder().pathName(pathName).build(), requestOptions)

        /** @see update */
        fun update(
            pathName: String,
            params: RegistryUpdateParams = RegistryUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<RegistryResponse>> =
            update(pathName, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RegistryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegistryResponse>>

        /** @see update */
        fun update(
            params: RegistryUpdateParams
        ): CompletableFuture<HttpResponseFor<RegistryResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            pathName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RegistryResponse>> =
            update(pathName, RegistryUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/registries`, but is otherwise the same
         * as [RegistryServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RegistryListResponse>> =
            list(RegistryListParams.none())

        /** @see list */
        fun list(
            params: RegistryListParams = RegistryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RegistryListResponse>>

        /** @see list */
        fun list(
            params: RegistryListParams = RegistryListParams.none()
        ): CompletableFuture<HttpResponseFor<RegistryListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RegistryListResponse>> =
            list(RegistryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/sandboxes/registries/{name}`, but is
         * otherwise the same as [RegistryServiceAsync.delete].
         */
        fun delete(name: String): CompletableFuture<HttpResponse> =
            delete(name, RegistryDeleteParams.none())

        /** @see delete */
        fun delete(
            name: String,
            params: RegistryDeleteParams = RegistryDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().name(name).build(), requestOptions)

        /** @see delete */
        fun delete(
            name: String,
            params: RegistryDeleteParams = RegistryDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(name, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RegistryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: RegistryDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(name: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(name, RegistryDeleteParams.none(), requestOptions)
    }
}
