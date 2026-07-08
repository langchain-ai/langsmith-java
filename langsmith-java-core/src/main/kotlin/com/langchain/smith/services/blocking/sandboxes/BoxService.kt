// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sandboxes.SandboxListResponse
import com.langchain.smith.models.sandboxes.SandboxResponse
import com.langchain.smith.models.sandboxes.SandboxStatusResponse
import com.langchain.smith.models.sandboxes.ServiceUrlResponse
import com.langchain.smith.models.sandboxes.SnapshotResponse
import com.langchain.smith.models.sandboxes.boxes.BoxCreateParams
import com.langchain.smith.models.sandboxes.boxes.BoxCreateSnapshotParams
import com.langchain.smith.models.sandboxes.boxes.BoxDeleteParams
import com.langchain.smith.models.sandboxes.boxes.BoxGenerateServiceUrlParams
import com.langchain.smith.models.sandboxes.boxes.BoxGetStatusParams
import com.langchain.smith.models.sandboxes.boxes.BoxListParams
import com.langchain.smith.models.sandboxes.boxes.BoxRetrieveParams
import com.langchain.smith.models.sandboxes.boxes.BoxStartParams
import com.langchain.smith.models.sandboxes.boxes.BoxStopParams
import com.langchain.smith.models.sandboxes.boxes.BoxUpdateParams
import java.util.function.Consumer

interface BoxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BoxService

    /**
     * Create a new sandbox from a snapshot. Provide at most one of `snapshot_id` or
     * `snapshot_name`; if neither is provided, the server uses the default snapshot.
     */
    fun create(): SandboxResponse = create(BoxCreateParams.none())

    /** @see create */
    fun create(
        params: BoxCreateParams = BoxCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxResponse

    /** @see create */
    fun create(params: BoxCreateParams = BoxCreateParams.none()): SandboxResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): SandboxResponse =
        create(BoxCreateParams.none(), requestOptions)

    /** Retrieve a sandbox by name. Stale provisioning sandboxes are auto-failed. */
    fun retrieve(name: String): SandboxResponse = retrieve(name, BoxRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: BoxRetrieveParams = BoxRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxResponse = retrieve(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: BoxRetrieveParams = BoxRetrieveParams.none(),
    ): SandboxResponse = retrieve(name, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BoxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxResponse

    /** @see retrieve */
    fun retrieve(params: BoxRetrieveParams): SandboxResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(name: String, requestOptions: RequestOptions): SandboxResponse =
        retrieve(name, BoxRetrieveParams.none(), requestOptions)

    /** Update a sandbox's display name. The name must be unique within the tenant. */
    fun update(pathName: String): SandboxResponse = update(pathName, BoxUpdateParams.none())

    /** @see update */
    fun update(
        pathName: String,
        params: BoxUpdateParams = BoxUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxResponse = update(params.toBuilder().pathName(pathName).build(), requestOptions)

    /** @see update */
    fun update(
        pathName: String,
        params: BoxUpdateParams = BoxUpdateParams.none(),
    ): SandboxResponse = update(pathName, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BoxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxResponse

    /** @see update */
    fun update(params: BoxUpdateParams): SandboxResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(pathName: String, requestOptions: RequestOptions): SandboxResponse =
        update(pathName, BoxUpdateParams.none(), requestOptions)

    /**
     * List sandboxes for the authenticated tenant, with optional filtering, sorting, and
     * pagination.
     */
    fun list(): SandboxListResponse = list(BoxListParams.none())

    /** @see list */
    fun list(
        params: BoxListParams = BoxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxListResponse

    /** @see list */
    fun list(params: BoxListParams = BoxListParams.none()): SandboxListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SandboxListResponse =
        list(BoxListParams.none(), requestOptions)

    /**
     * Delete a sandbox by name or UUID. Tears down the sandbox runtime and removes the DB record.
     */
    fun delete(name: String) = delete(name, BoxDeleteParams.none())

    /** @see delete */
    fun delete(
        name: String,
        params: BoxDeleteParams = BoxDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().name(name).build(), requestOptions)

    /** @see delete */
    fun delete(name: String, params: BoxDeleteParams = BoxDeleteParams.none()) =
        delete(name, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: BoxDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: BoxDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(name: String, requestOptions: RequestOptions) =
        delete(name, BoxDeleteParams.none(), requestOptions)

    /**
     * Create a snapshot by capturing the current state of a sandbox or promoting an existing
     * checkpoint.
     */
    fun createSnapshot(pathName: String, params: BoxCreateSnapshotParams): SnapshotResponse =
        createSnapshot(pathName, params, RequestOptions.none())

    /** @see createSnapshot */
    fun createSnapshot(
        pathName: String,
        params: BoxCreateSnapshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotResponse =
        createSnapshot(params.toBuilder().pathName(pathName).build(), requestOptions)

    /** @see createSnapshot */
    fun createSnapshot(params: BoxCreateSnapshotParams): SnapshotResponse =
        createSnapshot(params, RequestOptions.none())

    /** @see createSnapshot */
    fun createSnapshot(
        params: BoxCreateSnapshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotResponse

    /**
     * Create a short-lived JWT for accessing an HTTP service running on a specific port inside a
     * sandbox. Returns a browser_url (sets auth cookie via redirect), a service_url (for use with
     * the X-Langsmith-Sandbox-Service-Token header), the raw token, and its expiry.
     */
    fun generateServiceUrl(name: String): ServiceUrlResponse =
        generateServiceUrl(name, BoxGenerateServiceUrlParams.none())

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        name: String,
        params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ServiceUrlResponse =
        generateServiceUrl(params.toBuilder().name(name).build(), requestOptions)

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        name: String,
        params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
    ): ServiceUrlResponse = generateServiceUrl(name, params, RequestOptions.none())

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        params: BoxGenerateServiceUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ServiceUrlResponse

    /** @see generateServiceUrl */
    fun generateServiceUrl(params: BoxGenerateServiceUrlParams): ServiceUrlResponse =
        generateServiceUrl(params, RequestOptions.none())

    /** @see generateServiceUrl */
    fun generateServiceUrl(name: String, requestOptions: RequestOptions): ServiceUrlResponse =
        generateServiceUrl(name, BoxGenerateServiceUrlParams.none(), requestOptions)

    /** Retrieve the lightweight status of a sandbox for polling. */
    fun getStatus(name: String): SandboxStatusResponse = getStatus(name, BoxGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        name: String,
        params: BoxGetStatusParams = BoxGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxStatusResponse = getStatus(params.toBuilder().name(name).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        name: String,
        params: BoxGetStatusParams = BoxGetStatusParams.none(),
    ): SandboxStatusResponse = getStatus(name, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: BoxGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxStatusResponse

    /** @see getStatus */
    fun getStatus(params: BoxGetStatusParams): SandboxStatusResponse =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(name: String, requestOptions: RequestOptions): SandboxStatusResponse =
        getStatus(name, BoxGetStatusParams.none(), requestOptions)

    /** Start a stopped or failed sandbox. This endpoint is not idempotent. */
    fun start(name: String): SandboxResponse = start(name, BoxStartParams.none())

    /** @see start */
    fun start(
        name: String,
        params: BoxStartParams = BoxStartParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxResponse = start(params.toBuilder().name(name).build(), requestOptions)

    /** @see start */
    fun start(name: String, params: BoxStartParams = BoxStartParams.none()): SandboxResponse =
        start(name, params, RequestOptions.none())

    /** @see start */
    fun start(
        params: BoxStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SandboxResponse

    /** @see start */
    fun start(params: BoxStartParams): SandboxResponse = start(params, RequestOptions.none())

    /** @see start */
    fun start(name: String, requestOptions: RequestOptions): SandboxResponse =
        start(name, BoxStartParams.none(), requestOptions)

    /**
     * Stop a ready sandbox. This endpoint is not idempotent; the filesystem is preserved for later
     * restart.
     */
    fun stop(name: String) = stop(name, BoxStopParams.none())

    /** @see stop */
    fun stop(
        name: String,
        params: BoxStopParams = BoxStopParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = stop(params.toBuilder().name(name).build(), requestOptions)

    /** @see stop */
    fun stop(name: String, params: BoxStopParams = BoxStopParams.none()) =
        stop(name, params, RequestOptions.none())

    /** @see stop */
    fun stop(params: BoxStopParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see stop */
    fun stop(params: BoxStopParams) = stop(params, RequestOptions.none())

    /** @see stop */
    fun stop(name: String, requestOptions: RequestOptions) =
        stop(name, BoxStopParams.none(), requestOptions)

    /** A view of [BoxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BoxService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/boxes`, but is otherwise the same as
         * [BoxService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<SandboxResponse> = create(BoxCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BoxCreateParams = BoxCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: BoxCreateParams = BoxCreateParams.none()
        ): HttpResponseFor<SandboxResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<SandboxResponse> =
            create(BoxCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/boxes/{name}`, but is otherwise the
         * same as [BoxService.retrieve].
         */
        @MustBeClosed
        fun retrieve(name: String): HttpResponseFor<SandboxResponse> =
            retrieve(name, BoxRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            params: BoxRetrieveParams = BoxRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxResponse> =
            retrieve(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            params: BoxRetrieveParams = BoxRetrieveParams.none(),
        ): HttpResponseFor<SandboxResponse> = retrieve(name, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BoxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BoxRetrieveParams): HttpResponseFor<SandboxResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SandboxResponse> =
            retrieve(name, BoxRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/sandboxes/boxes/{name}`, but is otherwise the
         * same as [BoxService.update].
         */
        @MustBeClosed
        fun update(pathName: String): HttpResponseFor<SandboxResponse> =
            update(pathName, BoxUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathName: String,
            params: BoxUpdateParams = BoxUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxResponse> =
            update(params.toBuilder().pathName(pathName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            pathName: String,
            params: BoxUpdateParams = BoxUpdateParams.none(),
        ): HttpResponseFor<SandboxResponse> = update(pathName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BoxUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: BoxUpdateParams): HttpResponseFor<SandboxResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SandboxResponse> =
            update(pathName, BoxUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/boxes`, but is otherwise the same as
         * [BoxService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<SandboxListResponse> = list(BoxListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BoxListParams = BoxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BoxListParams = BoxListParams.none()
        ): HttpResponseFor<SandboxListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SandboxListResponse> =
            list(BoxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/sandboxes/boxes/{name}`, but is otherwise the
         * same as [BoxService.delete].
         */
        @MustBeClosed fun delete(name: String): HttpResponse = delete(name, BoxDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            name: String,
            params: BoxDeleteParams = BoxDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().name(name).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(name: String, params: BoxDeleteParams = BoxDeleteParams.none()): HttpResponse =
            delete(name, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BoxDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: BoxDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(name: String, requestOptions: RequestOptions): HttpResponse =
            delete(name, BoxDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/boxes/{name}/snapshot`, but is
         * otherwise the same as [BoxService.createSnapshot].
         */
        @MustBeClosed
        fun createSnapshot(
            pathName: String,
            params: BoxCreateSnapshotParams,
        ): HttpResponseFor<SnapshotResponse> =
            createSnapshot(pathName, params, RequestOptions.none())

        /** @see createSnapshot */
        @MustBeClosed
        fun createSnapshot(
            pathName: String,
            params: BoxCreateSnapshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotResponse> =
            createSnapshot(params.toBuilder().pathName(pathName).build(), requestOptions)

        /** @see createSnapshot */
        @MustBeClosed
        fun createSnapshot(params: BoxCreateSnapshotParams): HttpResponseFor<SnapshotResponse> =
            createSnapshot(params, RequestOptions.none())

        /** @see createSnapshot */
        @MustBeClosed
        fun createSnapshot(
            params: BoxCreateSnapshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotResponse>

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/boxes/{name}/service-url`, but is
         * otherwise the same as [BoxService.generateServiceUrl].
         */
        @MustBeClosed
        fun generateServiceUrl(name: String): HttpResponseFor<ServiceUrlResponse> =
            generateServiceUrl(name, BoxGenerateServiceUrlParams.none())

        /** @see generateServiceUrl */
        @MustBeClosed
        fun generateServiceUrl(
            name: String,
            params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ServiceUrlResponse> =
            generateServiceUrl(params.toBuilder().name(name).build(), requestOptions)

        /** @see generateServiceUrl */
        @MustBeClosed
        fun generateServiceUrl(
            name: String,
            params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
        ): HttpResponseFor<ServiceUrlResponse> =
            generateServiceUrl(name, params, RequestOptions.none())

        /** @see generateServiceUrl */
        @MustBeClosed
        fun generateServiceUrl(
            params: BoxGenerateServiceUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ServiceUrlResponse>

        /** @see generateServiceUrl */
        @MustBeClosed
        fun generateServiceUrl(
            params: BoxGenerateServiceUrlParams
        ): HttpResponseFor<ServiceUrlResponse> = generateServiceUrl(params, RequestOptions.none())

        /** @see generateServiceUrl */
        @MustBeClosed
        fun generateServiceUrl(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ServiceUrlResponse> =
            generateServiceUrl(name, BoxGenerateServiceUrlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/boxes/{name}/status`, but is otherwise
         * the same as [BoxService.getStatus].
         */
        @MustBeClosed
        fun getStatus(name: String): HttpResponseFor<SandboxStatusResponse> =
            getStatus(name, BoxGetStatusParams.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            name: String,
            params: BoxGetStatusParams = BoxGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxStatusResponse> =
            getStatus(params.toBuilder().name(name).build(), requestOptions)

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            name: String,
            params: BoxGetStatusParams = BoxGetStatusParams.none(),
        ): HttpResponseFor<SandboxStatusResponse> = getStatus(name, params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: BoxGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxStatusResponse>

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(params: BoxGetStatusParams): HttpResponseFor<SandboxStatusResponse> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SandboxStatusResponse> =
            getStatus(name, BoxGetStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/boxes/{name}/start`, but is otherwise
         * the same as [BoxService.start].
         */
        @MustBeClosed
        fun start(name: String): HttpResponseFor<SandboxResponse> =
            start(name, BoxStartParams.none())

        /** @see start */
        @MustBeClosed
        fun start(
            name: String,
            params: BoxStartParams = BoxStartParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxResponse> =
            start(params.toBuilder().name(name).build(), requestOptions)

        /** @see start */
        @MustBeClosed
        fun start(
            name: String,
            params: BoxStartParams = BoxStartParams.none(),
        ): HttpResponseFor<SandboxResponse> = start(name, params, RequestOptions.none())

        /** @see start */
        @MustBeClosed
        fun start(
            params: BoxStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SandboxResponse>

        /** @see start */
        @MustBeClosed
        fun start(params: BoxStartParams): HttpResponseFor<SandboxResponse> =
            start(params, RequestOptions.none())

        /** @see start */
        @MustBeClosed
        fun start(name: String, requestOptions: RequestOptions): HttpResponseFor<SandboxResponse> =
            start(name, BoxStartParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/boxes/{name}/stop`, but is otherwise
         * the same as [BoxService.stop].
         */
        @MustBeClosed fun stop(name: String): HttpResponse = stop(name, BoxStopParams.none())

        /** @see stop */
        @MustBeClosed
        fun stop(
            name: String,
            params: BoxStopParams = BoxStopParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = stop(params.toBuilder().name(name).build(), requestOptions)

        /** @see stop */
        @MustBeClosed
        fun stop(name: String, params: BoxStopParams = BoxStopParams.none()): HttpResponse =
            stop(name, params, RequestOptions.none())

        /** @see stop */
        @MustBeClosed
        fun stop(
            params: BoxStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see stop */
        @MustBeClosed
        fun stop(params: BoxStopParams): HttpResponse = stop(params, RequestOptions.none())

        /** @see stop */
        @MustBeClosed
        fun stop(name: String, requestOptions: RequestOptions): HttpResponse =
            stop(name, BoxStopParams.none(), requestOptions)
    }
}
