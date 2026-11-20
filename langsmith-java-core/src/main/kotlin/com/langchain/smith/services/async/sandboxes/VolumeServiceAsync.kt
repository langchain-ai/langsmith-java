// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sandboxes

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sandboxes.volumes.VolumeCloneParams
import com.langchain.smith.models.sandboxes.volumes.VolumeCreateParams
import com.langchain.smith.models.sandboxes.volumes.VolumeDeleteParams
import com.langchain.smith.models.sandboxes.volumes.VolumeListPageAsync
import com.langchain.smith.models.sandboxes.volumes.VolumeListParams
import com.langchain.smith.models.sandboxes.volumes.VolumeResponse
import com.langchain.smith.models.sandboxes.volumes.VolumeRetrieveParams
import com.langchain.smith.models.sandboxes.volumes.VolumeUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VolumeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VolumeServiceAsync

    /**
     * **Beta:** This API is in active development and may change without notice. Requires sandbox
     * volumes to be enabled for your workspace. Create an empty volume that can be attached to
     * sandboxes at a mount path. The size is rounded up to a whole GiB.
     */
    fun create(params: VolumeCreateParams): CompletableFuture<VolumeResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VolumeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VolumeResponse>

    /**
     * **Beta:** This API is in active development and may change without notice. Requires sandbox
     * volumes to be enabled for your workspace. Get a sandbox volume by ID or name, with its
     * current attachments.
     */
    fun retrieve(volume: String): CompletableFuture<VolumeResponse> =
        retrieve(volume, VolumeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        volume: String,
        params: VolumeRetrieveParams = VolumeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VolumeResponse> =
        retrieve(params.toBuilder().volume(volume).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        volume: String,
        params: VolumeRetrieveParams = VolumeRetrieveParams.none(),
    ): CompletableFuture<VolumeResponse> = retrieve(volume, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VolumeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VolumeResponse>

    /** @see retrieve */
    fun retrieve(params: VolumeRetrieveParams): CompletableFuture<VolumeResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        volume: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VolumeResponse> =
        retrieve(volume, VolumeRetrieveParams.none(), requestOptions)

    /**
     * **Beta:** This API is in active development and may change without notice. Requires sandbox
     * volumes to be enabled for your workspace. Update a volume's description or labels. Each field
     * sent replaces the stored value; omitted fields are unchanged. Null, an empty description, or
     * an empty labels object clears it. Only the volume's creator, or a role with sandboxes:exec,
     * may update it.
     */
    fun update(volume: String): CompletableFuture<VolumeResponse> =
        update(volume, VolumeUpdateParams.none())

    /** @see update */
    fun update(
        volume: String,
        params: VolumeUpdateParams = VolumeUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VolumeResponse> =
        update(params.toBuilder().volume(volume).build(), requestOptions)

    /** @see update */
    fun update(
        volume: String,
        params: VolumeUpdateParams = VolumeUpdateParams.none(),
    ): CompletableFuture<VolumeResponse> = update(volume, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VolumeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VolumeResponse>

    /** @see update */
    fun update(params: VolumeUpdateParams): CompletableFuture<VolumeResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(volume: String, requestOptions: RequestOptions): CompletableFuture<VolumeResponse> =
        update(volume, VolumeUpdateParams.none(), requestOptions)

    /**
     * **Beta:** This API is in active development and may change without notice. Requires sandbox
     * volumes to be enabled for your workspace. List the workspace's sandbox volumes with their
     * current attachments.
     */
    fun list(): CompletableFuture<VolumeListPageAsync> = list(VolumeListParams.none())

    /** @see list */
    fun list(
        params: VolumeListParams = VolumeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VolumeListPageAsync>

    /** @see list */
    fun list(
        params: VolumeListParams = VolumeListParams.none()
    ): CompletableFuture<VolumeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<VolumeListPageAsync> =
        list(VolumeListParams.none(), requestOptions)

    /**
     * **Beta:** This API is in active development and may change without notice. Requires sandbox
     * volumes to be enabled for your workspace. Delete a volume and its data. A volume attached to
     * any sandbox cannot be deleted. Storage is reclaimed asynchronously. Only the volume's
     * creator, or a role with sandboxes:exec, may delete it.
     */
    fun delete(volume: String): CompletableFuture<Void?> = delete(volume, VolumeDeleteParams.none())

    /** @see delete */
    fun delete(
        volume: String,
        params: VolumeDeleteParams = VolumeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().volume(volume).build(), requestOptions)

    /** @see delete */
    fun delete(
        volume: String,
        params: VolumeDeleteParams = VolumeDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(volume, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VolumeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: VolumeDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(volume: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(volume, VolumeDeleteParams.none(), requestOptions)

    /**
     * **Beta:** This API is in active development and may change without notice. Requires sandbox
     * volumes to be enabled for your workspace. Create a new volume holding a copy-on-write copy of
     * an existing one. A volume attached read-write to a sandbox that is not stopped cannot be
     * cloned. Only the volume's creator, or a role with sandboxes:exec, may clone it.
     */
    fun clone(volume: String, params: VolumeCloneParams): CompletableFuture<VolumeResponse> =
        clone(volume, params, RequestOptions.none())

    /** @see clone */
    fun clone(
        volume: String,
        params: VolumeCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VolumeResponse> =
        clone(params.toBuilder().volume(volume).build(), requestOptions)

    /** @see clone */
    fun clone(params: VolumeCloneParams): CompletableFuture<VolumeResponse> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: VolumeCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VolumeResponse>

    /**
     * A view of [VolumeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VolumeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/sandboxes/volumes`, but is otherwise the
         * same as [VolumeServiceAsync.create].
         */
        fun create(params: VolumeCreateParams): CompletableFuture<HttpResponseFor<VolumeResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VolumeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VolumeResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v2/sandboxes/volumes/{volume}`, but is
         * otherwise the same as [VolumeServiceAsync.retrieve].
         */
        fun retrieve(volume: String): CompletableFuture<HttpResponseFor<VolumeResponse>> =
            retrieve(volume, VolumeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            volume: String,
            params: VolumeRetrieveParams = VolumeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VolumeResponse>> =
            retrieve(params.toBuilder().volume(volume).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            volume: String,
            params: VolumeRetrieveParams = VolumeRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<VolumeResponse>> =
            retrieve(volume, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VolumeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VolumeResponse>>

        /** @see retrieve */
        fun retrieve(
            params: VolumeRetrieveParams
        ): CompletableFuture<HttpResponseFor<VolumeResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            volume: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VolumeResponse>> =
            retrieve(volume, VolumeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v2/sandboxes/volumes/{volume}`, but is
         * otherwise the same as [VolumeServiceAsync.update].
         */
        fun update(volume: String): CompletableFuture<HttpResponseFor<VolumeResponse>> =
            update(volume, VolumeUpdateParams.none())

        /** @see update */
        fun update(
            volume: String,
            params: VolumeUpdateParams = VolumeUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VolumeResponse>> =
            update(params.toBuilder().volume(volume).build(), requestOptions)

        /** @see update */
        fun update(
            volume: String,
            params: VolumeUpdateParams = VolumeUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<VolumeResponse>> =
            update(volume, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: VolumeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VolumeResponse>>

        /** @see update */
        fun update(params: VolumeUpdateParams): CompletableFuture<HttpResponseFor<VolumeResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            volume: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VolumeResponse>> =
            update(volume, VolumeUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/sandboxes/volumes`, but is otherwise the
         * same as [VolumeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VolumeListPageAsync>> =
            list(VolumeListParams.none())

        /** @see list */
        fun list(
            params: VolumeListParams = VolumeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VolumeListPageAsync>>

        /** @see list */
        fun list(
            params: VolumeListParams = VolumeListParams.none()
        ): CompletableFuture<HttpResponseFor<VolumeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VolumeListPageAsync>> =
            list(VolumeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/sandboxes/volumes/{volume}`, but is
         * otherwise the same as [VolumeServiceAsync.delete].
         */
        fun delete(volume: String): CompletableFuture<HttpResponse> =
            delete(volume, VolumeDeleteParams.none())

        /** @see delete */
        fun delete(
            volume: String,
            params: VolumeDeleteParams = VolumeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().volume(volume).build(), requestOptions)

        /** @see delete */
        fun delete(
            volume: String,
            params: VolumeDeleteParams = VolumeDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(volume, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: VolumeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: VolumeDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            volume: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(volume, VolumeDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v2/sandboxes/volumes/{volume}/clone`, but is
         * otherwise the same as [VolumeServiceAsync.clone].
         */
        fun clone(
            volume: String,
            params: VolumeCloneParams,
        ): CompletableFuture<HttpResponseFor<VolumeResponse>> =
            clone(volume, params, RequestOptions.none())

        /** @see clone */
        fun clone(
            volume: String,
            params: VolumeCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VolumeResponse>> =
            clone(params.toBuilder().volume(volume).build(), requestOptions)

        /** @see clone */
        fun clone(params: VolumeCloneParams): CompletableFuture<HttpResponseFor<VolumeResponse>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: VolumeCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VolumeResponse>>
    }
}
