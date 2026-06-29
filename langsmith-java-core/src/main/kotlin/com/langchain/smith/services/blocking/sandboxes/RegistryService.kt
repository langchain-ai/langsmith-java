// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface RegistryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegistryService

    /** Create a sandbox registry for pulling private images. */
    fun create(params: RegistryCreateParams): RegistryResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RegistryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegistryResponse

    /** Get a sandbox registry by name. */
    fun retrieve(name: String): RegistryResponse = retrieve(name, RegistryRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: RegistryRetrieveParams = RegistryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegistryResponse = retrieve(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: RegistryRetrieveParams = RegistryRetrieveParams.none(),
    ): RegistryResponse = retrieve(name, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RegistryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegistryResponse

    /** @see retrieve */
    fun retrieve(params: RegistryRetrieveParams): RegistryResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(name: String, requestOptions: RequestOptions): RegistryResponse =
        retrieve(name, RegistryRetrieveParams.none(), requestOptions)

    /** Update a sandbox registry's name and/or credentials. */
    fun update(pathName: String): RegistryResponse = update(pathName, RegistryUpdateParams.none())

    /** @see update */
    fun update(
        pathName: String,
        params: RegistryUpdateParams = RegistryUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegistryResponse = update(params.toBuilder().pathName(pathName).build(), requestOptions)

    /** @see update */
    fun update(
        pathName: String,
        params: RegistryUpdateParams = RegistryUpdateParams.none(),
    ): RegistryResponse = update(pathName, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RegistryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegistryResponse

    /** @see update */
    fun update(params: RegistryUpdateParams): RegistryResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(pathName: String, requestOptions: RequestOptions): RegistryResponse =
        update(pathName, RegistryUpdateParams.none(), requestOptions)

    /** List sandbox registries for pulling private images. */
    fun list(): RegistryListResponse = list(RegistryListParams.none())

    /** @see list */
    fun list(
        params: RegistryListParams = RegistryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RegistryListResponse

    /** @see list */
    fun list(params: RegistryListParams = RegistryListParams.none()): RegistryListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RegistryListResponse =
        list(RegistryListParams.none(), requestOptions)

    /** Delete a sandbox registry by name. */
    fun delete(name: String) = delete(name, RegistryDeleteParams.none())

    /** @see delete */
    fun delete(
        name: String,
        params: RegistryDeleteParams = RegistryDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().name(name).build(), requestOptions)

    /** @see delete */
    fun delete(name: String, params: RegistryDeleteParams = RegistryDeleteParams.none()) =
        delete(name, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: RegistryDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: RegistryDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(name: String, requestOptions: RequestOptions) =
        delete(name, RegistryDeleteParams.none(), requestOptions)

    /** A view of [RegistryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegistryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/registries`, but is otherwise the
         * same as [RegistryService.create].
         */
        @MustBeClosed
        fun create(params: RegistryCreateParams): HttpResponseFor<RegistryResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RegistryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegistryResponse>

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/registries/{name}`, but is otherwise
         * the same as [RegistryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(name: String): HttpResponseFor<RegistryResponse> =
            retrieve(name, RegistryRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            params: RegistryRetrieveParams = RegistryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegistryResponse> =
            retrieve(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            params: RegistryRetrieveParams = RegistryRetrieveParams.none(),
        ): HttpResponseFor<RegistryResponse> = retrieve(name, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RegistryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegistryResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RegistryRetrieveParams): HttpResponseFor<RegistryResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RegistryResponse> =
            retrieve(name, RegistryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/sandboxes/registries/{name}`, but is otherwise
         * the same as [RegistryService.update].
         */
        @MustBeClosed
        fun update(pathName: String): HttpResponseFor<RegistryResponse> =
            update(pathName, RegistryUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathName: String,
            params: RegistryUpdateParams = RegistryUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegistryResponse> =
            update(params.toBuilder().pathName(pathName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            pathName: String,
            params: RegistryUpdateParams = RegistryUpdateParams.none(),
        ): HttpResponseFor<RegistryResponse> = update(pathName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RegistryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegistryResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: RegistryUpdateParams): HttpResponseFor<RegistryResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RegistryResponse> =
            update(pathName, RegistryUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/registries`, but is otherwise the same
         * as [RegistryService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<RegistryListResponse> = list(RegistryListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RegistryListParams = RegistryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RegistryListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RegistryListParams = RegistryListParams.none()
        ): HttpResponseFor<RegistryListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RegistryListResponse> =
            list(RegistryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/sandboxes/registries/{name}`, but is
         * otherwise the same as [RegistryService.delete].
         */
        @MustBeClosed
        fun delete(name: String): HttpResponse = delete(name, RegistryDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            name: String,
            params: RegistryDeleteParams = RegistryDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().name(name).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            name: String,
            params: RegistryDeleteParams = RegistryDeleteParams.none(),
        ): HttpResponse = delete(name, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RegistryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: RegistryDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(name: String, requestOptions: RequestOptions): HttpResponse =
            delete(name, RegistryDeleteParams.none(), requestOptions)
    }
}
