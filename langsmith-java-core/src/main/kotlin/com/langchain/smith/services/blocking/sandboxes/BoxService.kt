// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

import com.google.errorprone.annotations.MustBeClosed
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
     * Create a new sandbox from a snapshot. The snapshot may be identified by `snapshot_id` (UUID)
     * or by `snapshot_name` (tenant-scoped unique name); exactly one must be set. Optionally blocks
     * until ready or timeout.
     */
    fun create(): BoxCreateResponse = create(BoxCreateParams.none())

    /** @see create */
    fun create(
        params: BoxCreateParams = BoxCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoxCreateResponse

    /** @see create */
    fun create(params: BoxCreateParams = BoxCreateParams.none()): BoxCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): BoxCreateResponse =
        create(BoxCreateParams.none(), requestOptions)

    /** Retrieve a sandbox claim by name. Stale provisioning claims are auto-failed. */
    fun retrieve(name: String): BoxRetrieveResponse = retrieve(name, BoxRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: BoxRetrieveParams = BoxRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoxRetrieveResponse = retrieve(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: BoxRetrieveParams = BoxRetrieveParams.none(),
    ): BoxRetrieveResponse = retrieve(name, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BoxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoxRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: BoxRetrieveParams): BoxRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(name: String, requestOptions: RequestOptions): BoxRetrieveResponse =
        retrieve(name, BoxRetrieveParams.none(), requestOptions)

    /** Update a sandbox claim's display name. The name must be unique within the tenant. */
    fun update(pathName: String): BoxUpdateResponse = update(pathName, BoxUpdateParams.none())

    /** @see update */
    fun update(
        pathName: String,
        params: BoxUpdateParams = BoxUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoxUpdateResponse = update(params.toBuilder().pathName(pathName).build(), requestOptions)

    /** @see update */
    fun update(
        pathName: String,
        params: BoxUpdateParams = BoxUpdateParams.none(),
    ): BoxUpdateResponse = update(pathName, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BoxUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoxUpdateResponse

    /** @see update */
    fun update(params: BoxUpdateParams): BoxUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(pathName: String, requestOptions: RequestOptions): BoxUpdateResponse =
        update(pathName, BoxUpdateParams.none(), requestOptions)

    /**
     * List sandbox claims for the authenticated tenant, with optional filtering, sorting, and
     * pagination.
     */
    fun list(): BoxListResponse = list(BoxListParams.none())

    /** @see list */
    fun list(
        params: BoxListParams = BoxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoxListResponse

    /** @see list */
    fun list(params: BoxListParams = BoxListParams.none()): BoxListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BoxListResponse =
        list(BoxListParams.none(), requestOptions)

    /** Delete a sandbox claim by name. Deletes the Firecracker pod/service and DB record. */
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
    fun createSnapshot(
        pathName: String,
        params: BoxCreateSnapshotParams,
    ): BoxCreateSnapshotResponse = createSnapshot(pathName, params, RequestOptions.none())

    /** @see createSnapshot */
    fun createSnapshot(
        pathName: String,
        params: BoxCreateSnapshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoxCreateSnapshotResponse =
        createSnapshot(params.toBuilder().pathName(pathName).build(), requestOptions)

    /** @see createSnapshot */
    fun createSnapshot(params: BoxCreateSnapshotParams): BoxCreateSnapshotResponse =
        createSnapshot(params, RequestOptions.none())

    /** @see createSnapshot */
    fun createSnapshot(
        params: BoxCreateSnapshotParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoxCreateSnapshotResponse

    /**
     * Create a short-lived JWT for accessing an HTTP service running on a specific port inside a
     * sandbox. Returns a browser_url (sets auth cookie via redirect), a service_url (for use with
     * the X-Langsmith-Sandbox-Service-Token header), the raw token, and its expiry.
     */
    fun generateServiceUrl(name: String): BoxGenerateServiceUrlResponse =
        generateServiceUrl(name, BoxGenerateServiceUrlParams.none())

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        name: String,
        params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoxGenerateServiceUrlResponse =
        generateServiceUrl(params.toBuilder().name(name).build(), requestOptions)

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        name: String,
        params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
    ): BoxGenerateServiceUrlResponse = generateServiceUrl(name, params, RequestOptions.none())

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        params: BoxGenerateServiceUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoxGenerateServiceUrlResponse

    /** @see generateServiceUrl */
    fun generateServiceUrl(params: BoxGenerateServiceUrlParams): BoxGenerateServiceUrlResponse =
        generateServiceUrl(params, RequestOptions.none())

    /** @see generateServiceUrl */
    fun generateServiceUrl(
        name: String,
        requestOptions: RequestOptions,
    ): BoxGenerateServiceUrlResponse =
        generateServiceUrl(name, BoxGenerateServiceUrlParams.none(), requestOptions)

    /** Retrieve the lightweight status of a sandbox claim for polling. */
    fun getStatus(name: String): BoxGetStatusResponse = getStatus(name, BoxGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        name: String,
        params: BoxGetStatusParams = BoxGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoxGetStatusResponse = getStatus(params.toBuilder().name(name).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        name: String,
        params: BoxGetStatusParams = BoxGetStatusParams.none(),
    ): BoxGetStatusResponse = getStatus(name, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: BoxGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoxGetStatusResponse

    /** @see getStatus */
    fun getStatus(params: BoxGetStatusParams): BoxGetStatusResponse =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(name: String, requestOptions: RequestOptions): BoxGetStatusResponse =
        getStatus(name, BoxGetStatusParams.none(), requestOptions)

    /**
     * Start a stopped or failed sandbox. This endpoint is not idempotent; it returns 202
     * immediately, then you can poll status for readiness.
     */
    fun start(name: String): BoxStartResponse = start(name, BoxStartParams.none())

    /** @see start */
    fun start(
        name: String,
        params: BoxStartParams = BoxStartParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoxStartResponse = start(params.toBuilder().name(name).build(), requestOptions)

    /** @see start */
    fun start(name: String, params: BoxStartParams = BoxStartParams.none()): BoxStartResponse =
        start(name, params, RequestOptions.none())

    /** @see start */
    fun start(
        params: BoxStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BoxStartResponse

    /** @see start */
    fun start(params: BoxStartParams): BoxStartResponse = start(params, RequestOptions.none())

    /** @see start */
    fun start(name: String, requestOptions: RequestOptions): BoxStartResponse =
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
        fun create(): HttpResponseFor<BoxCreateResponse> = create(BoxCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BoxCreateParams = BoxCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoxCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: BoxCreateParams = BoxCreateParams.none()
        ): HttpResponseFor<BoxCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<BoxCreateResponse> =
            create(BoxCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/boxes/{name}`, but is otherwise the
         * same as [BoxService.retrieve].
         */
        @MustBeClosed
        fun retrieve(name: String): HttpResponseFor<BoxRetrieveResponse> =
            retrieve(name, BoxRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            params: BoxRetrieveParams = BoxRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoxRetrieveResponse> =
            retrieve(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            params: BoxRetrieveParams = BoxRetrieveParams.none(),
        ): HttpResponseFor<BoxRetrieveResponse> = retrieve(name, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BoxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoxRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BoxRetrieveParams): HttpResponseFor<BoxRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BoxRetrieveResponse> =
            retrieve(name, BoxRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/sandboxes/boxes/{name}`, but is otherwise the
         * same as [BoxService.update].
         */
        @MustBeClosed
        fun update(pathName: String): HttpResponseFor<BoxUpdateResponse> =
            update(pathName, BoxUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathName: String,
            params: BoxUpdateParams = BoxUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoxUpdateResponse> =
            update(params.toBuilder().pathName(pathName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            pathName: String,
            params: BoxUpdateParams = BoxUpdateParams.none(),
        ): HttpResponseFor<BoxUpdateResponse> = update(pathName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BoxUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoxUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: BoxUpdateParams): HttpResponseFor<BoxUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BoxUpdateResponse> =
            update(pathName, BoxUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/boxes`, but is otherwise the same as
         * [BoxService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BoxListResponse> = list(BoxListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BoxListParams = BoxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoxListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: BoxListParams = BoxListParams.none()): HttpResponseFor<BoxListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BoxListResponse> =
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
        ): HttpResponseFor<BoxCreateSnapshotResponse> =
            createSnapshot(pathName, params, RequestOptions.none())

        /** @see createSnapshot */
        @MustBeClosed
        fun createSnapshot(
            pathName: String,
            params: BoxCreateSnapshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoxCreateSnapshotResponse> =
            createSnapshot(params.toBuilder().pathName(pathName).build(), requestOptions)

        /** @see createSnapshot */
        @MustBeClosed
        fun createSnapshot(
            params: BoxCreateSnapshotParams
        ): HttpResponseFor<BoxCreateSnapshotResponse> =
            createSnapshot(params, RequestOptions.none())

        /** @see createSnapshot */
        @MustBeClosed
        fun createSnapshot(
            params: BoxCreateSnapshotParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoxCreateSnapshotResponse>

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/boxes/{name}/service-url`, but is
         * otherwise the same as [BoxService.generateServiceUrl].
         */
        @MustBeClosed
        fun generateServiceUrl(name: String): HttpResponseFor<BoxGenerateServiceUrlResponse> =
            generateServiceUrl(name, BoxGenerateServiceUrlParams.none())

        /** @see generateServiceUrl */
        @MustBeClosed
        fun generateServiceUrl(
            name: String,
            params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoxGenerateServiceUrlResponse> =
            generateServiceUrl(params.toBuilder().name(name).build(), requestOptions)

        /** @see generateServiceUrl */
        @MustBeClosed
        fun generateServiceUrl(
            name: String,
            params: BoxGenerateServiceUrlParams = BoxGenerateServiceUrlParams.none(),
        ): HttpResponseFor<BoxGenerateServiceUrlResponse> =
            generateServiceUrl(name, params, RequestOptions.none())

        /** @see generateServiceUrl */
        @MustBeClosed
        fun generateServiceUrl(
            params: BoxGenerateServiceUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoxGenerateServiceUrlResponse>

        /** @see generateServiceUrl */
        @MustBeClosed
        fun generateServiceUrl(
            params: BoxGenerateServiceUrlParams
        ): HttpResponseFor<BoxGenerateServiceUrlResponse> =
            generateServiceUrl(params, RequestOptions.none())

        /** @see generateServiceUrl */
        @MustBeClosed
        fun generateServiceUrl(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BoxGenerateServiceUrlResponse> =
            generateServiceUrl(name, BoxGenerateServiceUrlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/sandboxes/boxes/{name}/status`, but is otherwise
         * the same as [BoxService.getStatus].
         */
        @MustBeClosed
        fun getStatus(name: String): HttpResponseFor<BoxGetStatusResponse> =
            getStatus(name, BoxGetStatusParams.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            name: String,
            params: BoxGetStatusParams = BoxGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoxGetStatusResponse> =
            getStatus(params.toBuilder().name(name).build(), requestOptions)

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            name: String,
            params: BoxGetStatusParams = BoxGetStatusParams.none(),
        ): HttpResponseFor<BoxGetStatusResponse> = getStatus(name, params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: BoxGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoxGetStatusResponse>

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(params: BoxGetStatusParams): HttpResponseFor<BoxGetStatusResponse> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BoxGetStatusResponse> =
            getStatus(name, BoxGetStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/sandboxes/boxes/{name}/start`, but is otherwise
         * the same as [BoxService.start].
         */
        @MustBeClosed
        fun start(name: String): HttpResponseFor<BoxStartResponse> =
            start(name, BoxStartParams.none())

        /** @see start */
        @MustBeClosed
        fun start(
            name: String,
            params: BoxStartParams = BoxStartParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoxStartResponse> =
            start(params.toBuilder().name(name).build(), requestOptions)

        /** @see start */
        @MustBeClosed
        fun start(
            name: String,
            params: BoxStartParams = BoxStartParams.none(),
        ): HttpResponseFor<BoxStartResponse> = start(name, params, RequestOptions.none())

        /** @see start */
        @MustBeClosed
        fun start(
            params: BoxStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BoxStartResponse>

        /** @see start */
        @MustBeClosed
        fun start(params: BoxStartParams): HttpResponseFor<BoxStartResponse> =
            start(params, RequestOptions.none())

        /** @see start */
        @MustBeClosed
        fun start(name: String, requestOptions: RequestOptions): HttpResponseFor<BoxStartResponse> =
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
