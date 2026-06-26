// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sandboxes

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BoxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BoxServiceAsync

    /**
     * Create a new sandbox from a snapshot. Provide at most one of `snapshot_id` or
     * `snapshot_name`; if neither is provided, the server uses the default static blueprint.
     */
    fun create(): CompletableFuture<SandboxResponse> = create(BoxCreateParams.none())

    /** @see create */
    fun create(
        params: BoxCreateParams = BoxCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SandboxResponse>

    /** @see create */
    fun create(
        params: BoxCreateParams = BoxCreateParams.none()
    ): CompletableFuture<SandboxResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<SandboxResponse> =
        create(BoxCreateParams.none(), requestOptions)

    /** Retrieve a sandbox by name. Stale provisioning sandboxes are auto-failed. */
    fun retrieve(name: String): CompletableFuture<SandboxResponse> =
        retrieve(name, BoxRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: BoxRetrieveParams = BoxRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SandboxResponse> =
        retrieve(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: BoxRetrieveParams = BoxRetrieveParams.none(),
    ): CompletableFuture<SandboxResponse> = retrieve(name, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BoxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SandboxResponse>

    /** @see retrieve */
    fun retrieve(params: BoxRetrieveParams): CompletableFuture<SandboxResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(name: String, requestOptions: RequestOptions): CompletableFuture<SandboxResponse> =
        retrieve(name, BoxRetrieveParams.none(), requestOptions)

    /** Update a sandbox's display name. The name must be unique within the tenant. */
    fun update(pathName: String): CompletableFuture<SandboxResponse> =
        update(pathName, BoxUpdateParams.none())

    /** @see update */
    fun update(
        pathName: String,
        params: BoxUpdateParams = BoxUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SandboxResponse> =
        update(params.toBuilder().pathName(pathName).build(), requestOptions)

    /** @see update */
    fun update(
        pathName: String,
        params: BoxUpdateParams = BoxUpdateParams.none(),
    ): CompletableFuture<SandboxResponse> = update(pathName, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BoxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SandboxResponse>

    /** @see update */
    fun update(params: BoxUpdateParams): CompletableFuture<SandboxResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        pathName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SandboxResponse> = update(pathName, BoxUpdateParams.none(), requestOptions)

    /**
     * List sandboxes for the authenticated tenant, with optional filtering, sorting, and
     * pagination.
     */
    fun list(): CompletableFuture<SandboxListResponse> = list(BoxListParams.none())

    /** @see list */
    fun list(
        params: BoxListParams = BoxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SandboxListResponse>

    /** @see list */
    fun list(params: BoxListParams = BoxListParams.none()): CompletableFuture<SandboxListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SandboxListResponse> =
        list(BoxListParams.none(), requestOptions)

    /**
     * Delete a sandbox by name or UUID. Tears down the sandbox runtime and removes the DB record.
     */
    fun delete(name: String): CompletableFuture<Void?> = delete(name, BoxDeleteParams.none())

    /** @see delete */
    fun delete(
        name: String,
        params: BoxDeleteParams = BoxDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().name(name).build(), requestOptions)

    /** @see delete */
    fun delete(
        name: String,
        params: BoxDeleteParams = BoxDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(name, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BoxDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: BoxDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(name: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(name, BoxDeleteParams.none(), requestOptions)

    /**
     * Create a snapshot by capturing the current state of a sandbox or promoting an existing
     * checkpoint.
     */
    fun createSnapshot(
        pathName: String,
        params: BoxCreateSnapshotParams,
    ): CompletableFuture<SnapshotResponse> = createSnapshot(pathName, params, RequestOptions.none())

    /** @see createSnapshot */
    fun createSnapshot(
        pathName: String,
        params: BoxCreateSnapshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotResponse> =
        createSnapshot(params.toBuilder().pathName(pathName).build(), requestOptions)

    /** @see createSnapshot */
    fun createSnapshot(params: BoxCreateSnapshotParams): CompletableFuture<SnapshotResponse> =
        createSnapshot(params, RequestOptions.none())

    /** @see createSnapshot */
    fun createSnapshot(
        params: BoxCreateSnapshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotResponse>

    /**
     * Create a short-lived JWT for accessing an HTTP service running on a specific port inside a
     * sandbox. Returns a browser_url (sets auth cookie via redirect), a service_url (for use with
     * the X-Langsmith-Sandbox-Service-Token header), the raw token, and its expiry.
     */
    fun generateServiceUrl(name: String): CompletableFuture<ServiceUrlResponse> =
        generateServiceUrl(name, BoxGenerateServiceUrlParams.none())

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        name: String,
        params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ServiceUrlResponse> =
        generateServiceUrl(params.toBuilder().name(name).build(), requestOptions)

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        name: String,
        params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
    ): CompletableFuture<ServiceUrlResponse> =
        generateServiceUrl(name, params, RequestOptions.none())

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        params: BoxGenerateServiceUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ServiceUrlResponse>

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        params: BoxGenerateServiceUrlParams
    ): CompletableFuture<ServiceUrlResponse> = generateServiceUrl(params, RequestOptions.none())

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        name: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ServiceUrlResponse> =
        generateServiceUrl(name, BoxGenerateServiceUrlParams.none(), requestOptions)

    /** Retrieve the lightweight status of a sandbox for polling. */
    fun getStatus(name: String): CompletableFuture<SandboxStatusResponse> =
        getStatus(name, BoxGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        name: String,
        params: BoxGetStatusParams = BoxGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SandboxStatusResponse> =
        getStatus(params.toBuilder().name(name).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        name: String,
        params: BoxGetStatusParams = BoxGetStatusParams.none(),
    ): CompletableFuture<SandboxStatusResponse> = getStatus(name, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: BoxGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SandboxStatusResponse>

    /** @see getStatus */
    fun getStatus(params: BoxGetStatusParams): CompletableFuture<SandboxStatusResponse> =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        name: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SandboxStatusResponse> =
        getStatus(name, BoxGetStatusParams.none(), requestOptions)

    /** Start a stopped or failed sandbox. This endpoint is not idempotent. */
    fun start(name: String): CompletableFuture<SandboxResponse> = start(name, BoxStartParams.none())

    /** @see start */
    fun start(
        name: String,
        params: BoxStartParams = BoxStartParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SandboxResponse> =
        start(params.toBuilder().name(name).build(), requestOptions)

    /** @see start */
    fun start(
        name: String,
        params: BoxStartParams = BoxStartParams.none(),
    ): CompletableFuture<SandboxResponse> = start(name, params, RequestOptions.none())

    /** @see start */
    fun start(
        params: BoxStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SandboxResponse>

    /** @see start */
    fun start(params: BoxStartParams): CompletableFuture<SandboxResponse> =
        start(params, RequestOptions.none())

    /** @see start */
    fun start(name: String, requestOptions: RequestOptions): CompletableFuture<SandboxResponse> =
        start(name, BoxStartParams.none(), requestOptions)

    /**
     * Stop a ready sandbox. This endpoint is not idempotent; the filesystem is preserved for later
     * restart.
     */
    fun stop(name: String): CompletableFuture<Void?> = stop(name, BoxStopParams.none())

    /** @see stop */
    fun stop(
        name: String,
        params: BoxStopParams = BoxStopParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = stop(params.toBuilder().name(name).build(), requestOptions)

    /** @see stop */
    fun stop(name: String, params: BoxStopParams = BoxStopParams.none()): CompletableFuture<Void?> =
        stop(name, params, RequestOptions.none())

    /** @see stop */
    fun stop(
        params: BoxStopParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see stop */
    fun stop(params: BoxStopParams): CompletableFuture<Void?> = stop(params, RequestOptions.none())

    /** @see stop */
    fun stop(name: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        stop(name, BoxStopParams.none(), requestOptions)

    /** A view of [BoxServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BoxServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/boxes`, but is otherwise the same as
         * [BoxServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            create(BoxCreateParams.none())

        /** @see create */
        fun create(
            params: BoxCreateParams = BoxCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SandboxResponse>>

        /** @see create */
        fun create(
            params: BoxCreateParams = BoxCreateParams.none()
        ): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            create(BoxCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/boxes/{name}`, but is otherwise the
         * same as [BoxServiceAsync.retrieve].
         */
        fun retrieve(name: String): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            retrieve(name, BoxRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            name: String,
            params: BoxRetrieveParams = BoxRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            retrieve(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            name: String,
            params: BoxRetrieveParams = BoxRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            retrieve(name, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BoxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SandboxResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BoxRetrieveParams
        ): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            retrieve(name, BoxRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/sandboxes/boxes/{name}`, but is otherwise the
         * same as [BoxServiceAsync.update].
         */
        fun update(pathName: String): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            update(pathName, BoxUpdateParams.none())

        /** @see update */
        fun update(
            pathName: String,
            params: BoxUpdateParams = BoxUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            update(params.toBuilder().pathName(pathName).build(), requestOptions)

        /** @see update */
        fun update(
            pathName: String,
            params: BoxUpdateParams = BoxUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            update(pathName, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BoxUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SandboxResponse>>

        /** @see update */
        fun update(params: BoxUpdateParams): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            pathName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            update(pathName, BoxUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/boxes`, but is otherwise the same as
         * [BoxServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SandboxListResponse>> =
            list(BoxListParams.none())

        /** @see list */
        fun list(
            params: BoxListParams = BoxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SandboxListResponse>>

        /** @see list */
        fun list(
            params: BoxListParams = BoxListParams.none()
        ): CompletableFuture<HttpResponseFor<SandboxListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SandboxListResponse>> =
            list(BoxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/sandboxes/boxes/{name}`, but is otherwise the
         * same as [BoxServiceAsync.delete].
         */
        fun delete(name: String): CompletableFuture<HttpResponse> =
            delete(name, BoxDeleteParams.none())

        /** @see delete */
        fun delete(
            name: String,
            params: BoxDeleteParams = BoxDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().name(name).build(), requestOptions)

        /** @see delete */
        fun delete(
            name: String,
            params: BoxDeleteParams = BoxDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(name, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BoxDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: BoxDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(name: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(name, BoxDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/boxes/{name}/snapshot`, but is
         * otherwise the same as [BoxServiceAsync.createSnapshot].
         */
        fun createSnapshot(
            pathName: String,
            params: BoxCreateSnapshotParams,
        ): CompletableFuture<HttpResponseFor<SnapshotResponse>> =
            createSnapshot(pathName, params, RequestOptions.none())

        /** @see createSnapshot */
        fun createSnapshot(
            pathName: String,
            params: BoxCreateSnapshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotResponse>> =
            createSnapshot(params.toBuilder().pathName(pathName).build(), requestOptions)

        /** @see createSnapshot */
        fun createSnapshot(
            params: BoxCreateSnapshotParams
        ): CompletableFuture<HttpResponseFor<SnapshotResponse>> =
            createSnapshot(params, RequestOptions.none())

        /** @see createSnapshot */
        fun createSnapshot(
            params: BoxCreateSnapshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotResponse>>

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/boxes/{name}/service-url`, but is
         * otherwise the same as [BoxServiceAsync.generateServiceUrl].
         */
        fun generateServiceUrl(
            name: String
        ): CompletableFuture<HttpResponseFor<ServiceUrlResponse>> =
            generateServiceUrl(name, BoxGenerateServiceUrlParams.none())

        /** @see generateServiceUrl */
        fun generateServiceUrl(
            name: String,
            params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ServiceUrlResponse>> =
            generateServiceUrl(params.toBuilder().name(name).build(), requestOptions)

        /** @see generateServiceUrl */
        fun generateServiceUrl(
            name: String,
            params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
        ): CompletableFuture<HttpResponseFor<ServiceUrlResponse>> =
            generateServiceUrl(name, params, RequestOptions.none())

        /** @see generateServiceUrl */
        fun generateServiceUrl(
            params: BoxGenerateServiceUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ServiceUrlResponse>>

        /** @see generateServiceUrl */
        fun generateServiceUrl(
            params: BoxGenerateServiceUrlParams
        ): CompletableFuture<HttpResponseFor<ServiceUrlResponse>> =
            generateServiceUrl(params, RequestOptions.none())

        /** @see generateServiceUrl */
        fun generateServiceUrl(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ServiceUrlResponse>> =
            generateServiceUrl(name, BoxGenerateServiceUrlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/boxes/{name}/status`, but is otherwise
         * the same as [BoxServiceAsync.getStatus].
         */
        fun getStatus(name: String): CompletableFuture<HttpResponseFor<SandboxStatusResponse>> =
            getStatus(name, BoxGetStatusParams.none())

        /** @see getStatus */
        fun getStatus(
            name: String,
            params: BoxGetStatusParams = BoxGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SandboxStatusResponse>> =
            getStatus(params.toBuilder().name(name).build(), requestOptions)

        /** @see getStatus */
        fun getStatus(
            name: String,
            params: BoxGetStatusParams = BoxGetStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<SandboxStatusResponse>> =
            getStatus(name, params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            params: BoxGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SandboxStatusResponse>>

        /** @see getStatus */
        fun getStatus(
            params: BoxGetStatusParams
        ): CompletableFuture<HttpResponseFor<SandboxStatusResponse>> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SandboxStatusResponse>> =
            getStatus(name, BoxGetStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/boxes/{name}/start`, but is otherwise
         * the same as [BoxServiceAsync.start].
         */
        fun start(name: String): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            start(name, BoxStartParams.none())

        /** @see start */
        fun start(
            name: String,
            params: BoxStartParams = BoxStartParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            start(params.toBuilder().name(name).build(), requestOptions)

        /** @see start */
        fun start(
            name: String,
            params: BoxStartParams = BoxStartParams.none(),
        ): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            start(name, params, RequestOptions.none())

        /** @see start */
        fun start(
            params: BoxStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SandboxResponse>>

        /** @see start */
        fun start(params: BoxStartParams): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            start(params, RequestOptions.none())

        /** @see start */
        fun start(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SandboxResponse>> =
            start(name, BoxStartParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/boxes/{name}/stop`, but is otherwise
         * the same as [BoxServiceAsync.stop].
         */
        fun stop(name: String): CompletableFuture<HttpResponse> = stop(name, BoxStopParams.none())

        /** @see stop */
        fun stop(
            name: String,
            params: BoxStopParams = BoxStopParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            stop(params.toBuilder().name(name).build(), requestOptions)

        /** @see stop */
        fun stop(
            name: String,
            params: BoxStopParams = BoxStopParams.none(),
        ): CompletableFuture<HttpResponse> = stop(name, params, RequestOptions.none())

        /** @see stop */
        fun stop(
            params: BoxStopParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see stop */
        fun stop(params: BoxStopParams): CompletableFuture<HttpResponse> =
            stop(params, RequestOptions.none())

        /** @see stop */
        fun stop(name: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            stop(name, BoxStopParams.none(), requestOptions)
    }
}
