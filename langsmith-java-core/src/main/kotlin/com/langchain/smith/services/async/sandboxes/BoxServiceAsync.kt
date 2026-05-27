// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sandboxes

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sandboxes.boxes.BoxCreateParams
import com.langchain.smith.models.sandboxes.boxes.BoxCreateResponse
import com.langchain.smith.models.sandboxes.boxes.BoxCreateSnapshotParams
import com.langchain.smith.models.sandboxes.boxes.BoxCreateSnapshotResponse
import com.langchain.smith.models.sandboxes.boxes.BoxDeleteParams
import com.langchain.smith.models.sandboxes.boxes.BoxGenerateServiceUrlParams
import com.langchain.smith.models.sandboxes.boxes.BoxGenerateServiceUrlResponse
import com.langchain.smith.models.sandboxes.boxes.BoxGetStatusParams
import com.langchain.smith.models.sandboxes.boxes.BoxGetStatusResponse
import com.langchain.smith.models.sandboxes.boxes.BoxListParams
import com.langchain.smith.models.sandboxes.boxes.BoxListResponse
import com.langchain.smith.models.sandboxes.boxes.BoxRetrieveParams
import com.langchain.smith.models.sandboxes.boxes.BoxRetrieveResponse
import com.langchain.smith.models.sandboxes.boxes.BoxStartParams
import com.langchain.smith.models.sandboxes.boxes.BoxStartResponse
import com.langchain.smith.models.sandboxes.boxes.BoxStopParams
import com.langchain.smith.models.sandboxes.boxes.BoxUpdateParams
import com.langchain.smith.models.sandboxes.boxes.BoxUpdateResponse
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
    fun create(): CompletableFuture<BoxCreateResponse> = create(BoxCreateParams.none())

    /** @see create */
    fun create(
        params: BoxCreateParams = BoxCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoxCreateResponse>

    /** @see create */
    fun create(
        params: BoxCreateParams = BoxCreateParams.none()
    ): CompletableFuture<BoxCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<BoxCreateResponse> =
        create(BoxCreateParams.none(), requestOptions)

    /** Retrieve a sandbox by name. Stale provisioning sandboxes are auto-failed. */
    fun retrieve(name: String): CompletableFuture<BoxRetrieveResponse> =
        retrieve(name, BoxRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: BoxRetrieveParams = BoxRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoxRetrieveResponse> =
        retrieve(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: BoxRetrieveParams = BoxRetrieveParams.none(),
    ): CompletableFuture<BoxRetrieveResponse> = retrieve(name, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BoxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoxRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: BoxRetrieveParams): CompletableFuture<BoxRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BoxRetrieveResponse> =
        retrieve(name, BoxRetrieveParams.none(), requestOptions)

    /** Update a sandbox's display name. The name must be unique within the tenant. */
    fun update(pathName: String): CompletableFuture<BoxUpdateResponse> =
        update(pathName, BoxUpdateParams.none())

    /** @see update */
    fun update(
        pathName: String,
        params: BoxUpdateParams = BoxUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoxUpdateResponse> =
        update(params.toBuilder().pathName(pathName).build(), requestOptions)

    /** @see update */
    fun update(
        pathName: String,
        params: BoxUpdateParams = BoxUpdateParams.none(),
    ): CompletableFuture<BoxUpdateResponse> = update(pathName, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BoxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoxUpdateResponse>

    /** @see update */
    fun update(params: BoxUpdateParams): CompletableFuture<BoxUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        pathName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BoxUpdateResponse> =
        update(pathName, BoxUpdateParams.none(), requestOptions)

    /**
     * List sandboxes for the authenticated tenant, with optional filtering, sorting, and
     * pagination.
     */
    fun list(): CompletableFuture<BoxListResponse> = list(BoxListParams.none())

    /** @see list */
    fun list(
        params: BoxListParams = BoxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoxListResponse>

    /** @see list */
    fun list(params: BoxListParams = BoxListParams.none()): CompletableFuture<BoxListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BoxListResponse> =
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
    ): CompletableFuture<BoxCreateSnapshotResponse> =
        createSnapshot(pathName, params, RequestOptions.none())

    /** @see createSnapshot */
    fun createSnapshot(
        pathName: String,
        params: BoxCreateSnapshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoxCreateSnapshotResponse> =
        createSnapshot(params.toBuilder().pathName(pathName).build(), requestOptions)

    /** @see createSnapshot */
    fun createSnapshot(
        params: BoxCreateSnapshotParams
    ): CompletableFuture<BoxCreateSnapshotResponse> = createSnapshot(params, RequestOptions.none())

    /** @see createSnapshot */
    fun createSnapshot(
        params: BoxCreateSnapshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoxCreateSnapshotResponse>

    /**
     * Create a short-lived JWT for accessing an HTTP service running on a specific port inside a
     * sandbox. Returns a browser_url (sets auth cookie via redirect), a service_url (for use with
     * the X-Langsmith-Sandbox-Service-Token header), the raw token, and its expiry.
     */
    fun generateServiceUrl(name: String): CompletableFuture<BoxGenerateServiceUrlResponse> =
        generateServiceUrl(name, BoxGenerateServiceUrlParams.none())

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        name: String,
        params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoxGenerateServiceUrlResponse> =
        generateServiceUrl(params.toBuilder().name(name).build(), requestOptions)

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        name: String,
        params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
    ): CompletableFuture<BoxGenerateServiceUrlResponse> =
        generateServiceUrl(name, params, RequestOptions.none())

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        params: BoxGenerateServiceUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoxGenerateServiceUrlResponse>

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        params: BoxGenerateServiceUrlParams
    ): CompletableFuture<BoxGenerateServiceUrlResponse> =
        generateServiceUrl(params, RequestOptions.none())

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        name: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BoxGenerateServiceUrlResponse> =
        generateServiceUrl(name, BoxGenerateServiceUrlParams.none(), requestOptions)

    /** Retrieve the lightweight status of a sandbox for polling. */
    fun getStatus(name: String): CompletableFuture<BoxGetStatusResponse> =
        getStatus(name, BoxGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        name: String,
        params: BoxGetStatusParams = BoxGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoxGetStatusResponse> =
        getStatus(params.toBuilder().name(name).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        name: String,
        params: BoxGetStatusParams = BoxGetStatusParams.none(),
    ): CompletableFuture<BoxGetStatusResponse> = getStatus(name, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: BoxGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoxGetStatusResponse>

    /** @see getStatus */
    fun getStatus(params: BoxGetStatusParams): CompletableFuture<BoxGetStatusResponse> =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        name: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BoxGetStatusResponse> =
        getStatus(name, BoxGetStatusParams.none(), requestOptions)

    /** Start a stopped or failed sandbox. This endpoint is not idempotent. */
    fun start(name: String): CompletableFuture<BoxStartResponse> =
        start(name, BoxStartParams.none())

    /** @see start */
    fun start(
        name: String,
        params: BoxStartParams = BoxStartParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoxStartResponse> =
        start(params.toBuilder().name(name).build(), requestOptions)

    /** @see start */
    fun start(
        name: String,
        params: BoxStartParams = BoxStartParams.none(),
    ): CompletableFuture<BoxStartResponse> = start(name, params, RequestOptions.none())

    /** @see start */
    fun start(
        params: BoxStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BoxStartResponse>

    /** @see start */
    fun start(params: BoxStartParams): CompletableFuture<BoxStartResponse> =
        start(params, RequestOptions.none())

    /** @see start */
    fun start(name: String, requestOptions: RequestOptions): CompletableFuture<BoxStartResponse> =
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
        fun create(): CompletableFuture<HttpResponseFor<BoxCreateResponse>> =
            create(BoxCreateParams.none())

        /** @see create */
        fun create(
            params: BoxCreateParams = BoxCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoxCreateResponse>>

        /** @see create */
        fun create(
            params: BoxCreateParams = BoxCreateParams.none()
        ): CompletableFuture<HttpResponseFor<BoxCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BoxCreateResponse>> =
            create(BoxCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/boxes/{name}`, but is otherwise the
         * same as [BoxServiceAsync.retrieve].
         */
        fun retrieve(name: String): CompletableFuture<HttpResponseFor<BoxRetrieveResponse>> =
            retrieve(name, BoxRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            name: String,
            params: BoxRetrieveParams = BoxRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoxRetrieveResponse>> =
            retrieve(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            name: String,
            params: BoxRetrieveParams = BoxRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BoxRetrieveResponse>> =
            retrieve(name, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BoxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoxRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BoxRetrieveParams
        ): CompletableFuture<HttpResponseFor<BoxRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoxRetrieveResponse>> =
            retrieve(name, BoxRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/sandboxes/boxes/{name}`, but is otherwise the
         * same as [BoxServiceAsync.update].
         */
        fun update(pathName: String): CompletableFuture<HttpResponseFor<BoxUpdateResponse>> =
            update(pathName, BoxUpdateParams.none())

        /** @see update */
        fun update(
            pathName: String,
            params: BoxUpdateParams = BoxUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoxUpdateResponse>> =
            update(params.toBuilder().pathName(pathName).build(), requestOptions)

        /** @see update */
        fun update(
            pathName: String,
            params: BoxUpdateParams = BoxUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<BoxUpdateResponse>> =
            update(pathName, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BoxUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoxUpdateResponse>>

        /** @see update */
        fun update(params: BoxUpdateParams): CompletableFuture<HttpResponseFor<BoxUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            pathName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoxUpdateResponse>> =
            update(pathName, BoxUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/boxes`, but is otherwise the same as
         * [BoxServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BoxListResponse>> = list(BoxListParams.none())

        /** @see list */
        fun list(
            params: BoxListParams = BoxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoxListResponse>>

        /** @see list */
        fun list(
            params: BoxListParams = BoxListParams.none()
        ): CompletableFuture<HttpResponseFor<BoxListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BoxListResponse>> =
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
        ): CompletableFuture<HttpResponseFor<BoxCreateSnapshotResponse>> =
            createSnapshot(pathName, params, RequestOptions.none())

        /** @see createSnapshot */
        fun createSnapshot(
            pathName: String,
            params: BoxCreateSnapshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoxCreateSnapshotResponse>> =
            createSnapshot(params.toBuilder().pathName(pathName).build(), requestOptions)

        /** @see createSnapshot */
        fun createSnapshot(
            params: BoxCreateSnapshotParams
        ): CompletableFuture<HttpResponseFor<BoxCreateSnapshotResponse>> =
            createSnapshot(params, RequestOptions.none())

        /** @see createSnapshot */
        fun createSnapshot(
            params: BoxCreateSnapshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoxCreateSnapshotResponse>>

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/boxes/{name}/service-url`, but is
         * otherwise the same as [BoxServiceAsync.generateServiceUrl].
         */
        fun generateServiceUrl(
            name: String
        ): CompletableFuture<HttpResponseFor<BoxGenerateServiceUrlResponse>> =
            generateServiceUrl(name, BoxGenerateServiceUrlParams.none())

        /** @see generateServiceUrl */
        fun generateServiceUrl(
            name: String,
            params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoxGenerateServiceUrlResponse>> =
            generateServiceUrl(params.toBuilder().name(name).build(), requestOptions)

        /** @see generateServiceUrl */
        fun generateServiceUrl(
            name: String,
            params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
        ): CompletableFuture<HttpResponseFor<BoxGenerateServiceUrlResponse>> =
            generateServiceUrl(name, params, RequestOptions.none())

        /** @see generateServiceUrl */
        fun generateServiceUrl(
            params: BoxGenerateServiceUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoxGenerateServiceUrlResponse>>

        /** @see generateServiceUrl */
        fun generateServiceUrl(
            params: BoxGenerateServiceUrlParams
        ): CompletableFuture<HttpResponseFor<BoxGenerateServiceUrlResponse>> =
            generateServiceUrl(params, RequestOptions.none())

        /** @see generateServiceUrl */
        fun generateServiceUrl(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoxGenerateServiceUrlResponse>> =
            generateServiceUrl(name, BoxGenerateServiceUrlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/boxes/{name}/status`, but is otherwise
         * the same as [BoxServiceAsync.getStatus].
         */
        fun getStatus(name: String): CompletableFuture<HttpResponseFor<BoxGetStatusResponse>> =
            getStatus(name, BoxGetStatusParams.none())

        /** @see getStatus */
        fun getStatus(
            name: String,
            params: BoxGetStatusParams = BoxGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoxGetStatusResponse>> =
            getStatus(params.toBuilder().name(name).build(), requestOptions)

        /** @see getStatus */
        fun getStatus(
            name: String,
            params: BoxGetStatusParams = BoxGetStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<BoxGetStatusResponse>> =
            getStatus(name, params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            params: BoxGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoxGetStatusResponse>>

        /** @see getStatus */
        fun getStatus(
            params: BoxGetStatusParams
        ): CompletableFuture<HttpResponseFor<BoxGetStatusResponse>> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoxGetStatusResponse>> =
            getStatus(name, BoxGetStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/boxes/{name}/start`, but is otherwise
         * the same as [BoxServiceAsync.start].
         */
        fun start(name: String): CompletableFuture<HttpResponseFor<BoxStartResponse>> =
            start(name, BoxStartParams.none())

        /** @see start */
        fun start(
            name: String,
            params: BoxStartParams = BoxStartParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoxStartResponse>> =
            start(params.toBuilder().name(name).build(), requestOptions)

        /** @see start */
        fun start(
            name: String,
            params: BoxStartParams = BoxStartParams.none(),
        ): CompletableFuture<HttpResponseFor<BoxStartResponse>> =
            start(name, params, RequestOptions.none())

        /** @see start */
        fun start(
            params: BoxStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BoxStartResponse>>

        /** @see start */
        fun start(params: BoxStartParams): CompletableFuture<HttpResponseFor<BoxStartResponse>> =
            start(params, RequestOptions.none())

        /** @see start */
        fun start(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoxStartResponse>> =
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
