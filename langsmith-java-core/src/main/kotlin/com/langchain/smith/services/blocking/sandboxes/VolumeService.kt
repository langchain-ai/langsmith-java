// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sandboxes

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sandboxes.volumes.VolumeCloneParams
import com.langchain.smith.models.sandboxes.volumes.VolumeCreateParams
import com.langchain.smith.models.sandboxes.volumes.VolumeDeleteParams
import com.langchain.smith.models.sandboxes.volumes.VolumeListPage
import com.langchain.smith.models.sandboxes.volumes.VolumeListParams
import com.langchain.smith.models.sandboxes.volumes.VolumeResponse
import com.langchain.smith.models.sandboxes.volumes.VolumeRetrieveParams
import com.langchain.smith.models.sandboxes.volumes.VolumeUpdateParams
import java.util.function.Consumer

interface VolumeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VolumeService

    /**
     * **Beta:** This API is in active development and may change without notice. Requires sandbox
     * volumes to be enabled for your workspace. Create an empty volume that can be attached to
     * sandboxes at a mount path. The size is rounded up to a whole GiB.
     */
    fun create(params: VolumeCreateParams): VolumeResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VolumeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VolumeResponse

    /**
     * **Beta:** This API is in active development and may change without notice. Requires sandbox
     * volumes to be enabled for your workspace. Get a sandbox volume by ID or name, with its
     * current attachments.
     */
    fun retrieve(volume: String): VolumeResponse = retrieve(volume, VolumeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        volume: String,
        params: VolumeRetrieveParams = VolumeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VolumeResponse = retrieve(params.toBuilder().volume(volume).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        volume: String,
        params: VolumeRetrieveParams = VolumeRetrieveParams.none(),
    ): VolumeResponse = retrieve(volume, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VolumeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VolumeResponse

    /** @see retrieve */
    fun retrieve(params: VolumeRetrieveParams): VolumeResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(volume: String, requestOptions: RequestOptions): VolumeResponse =
        retrieve(volume, VolumeRetrieveParams.none(), requestOptions)

    /**
     * **Beta:** This API is in active development and may change without notice. Requires sandbox
     * volumes to be enabled for your workspace. Update a volume's description or labels. Each field
     * sent replaces the stored value; omitted fields are unchanged. Null, an empty description, or
     * an empty labels object clears it. Only the volume's creator, or a role with sandboxes:exec,
     * may update it.
     */
    fun update(volume: String): VolumeResponse = update(volume, VolumeUpdateParams.none())

    /** @see update */
    fun update(
        volume: String,
        params: VolumeUpdateParams = VolumeUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VolumeResponse = update(params.toBuilder().volume(volume).build(), requestOptions)

    /** @see update */
    fun update(
        volume: String,
        params: VolumeUpdateParams = VolumeUpdateParams.none(),
    ): VolumeResponse = update(volume, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VolumeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VolumeResponse

    /** @see update */
    fun update(params: VolumeUpdateParams): VolumeResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(volume: String, requestOptions: RequestOptions): VolumeResponse =
        update(volume, VolumeUpdateParams.none(), requestOptions)

    /**
     * **Beta:** This API is in active development and may change without notice. Requires sandbox
     * volumes to be enabled for your workspace. List the workspace's sandbox volumes with their
     * current attachments.
     */
    fun list(): VolumeListPage = list(VolumeListParams.none())

    /** @see list */
    fun list(
        params: VolumeListParams = VolumeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VolumeListPage

    /** @see list */
    fun list(params: VolumeListParams = VolumeListParams.none()): VolumeListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): VolumeListPage =
        list(VolumeListParams.none(), requestOptions)

    /**
     * **Beta:** This API is in active development and may change without notice. Requires sandbox
     * volumes to be enabled for your workspace. Delete a volume and its data. A volume attached to
     * any sandbox cannot be deleted. Storage is reclaimed asynchronously. Only the volume's
     * creator, or a role with sandboxes:exec, may delete it.
     */
    fun delete(volume: String) = delete(volume, VolumeDeleteParams.none())

    /** @see delete */
    fun delete(
        volume: String,
        params: VolumeDeleteParams = VolumeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().volume(volume).build(), requestOptions)

    /** @see delete */
    fun delete(volume: String, params: VolumeDeleteParams = VolumeDeleteParams.none()) =
        delete(volume, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: VolumeDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: VolumeDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(volume: String, requestOptions: RequestOptions) =
        delete(volume, VolumeDeleteParams.none(), requestOptions)

    /**
     * **Beta:** This API is in active development and may change without notice. Requires sandbox
     * volumes to be enabled for your workspace. Create a new volume holding a copy-on-write copy of
     * an existing one. A volume attached read-write to a sandbox that is not stopped cannot be
     * cloned. Only the volume's creator, or a role with sandboxes:exec, may clone it.
     */
    fun clone(volume: String, params: VolumeCloneParams): VolumeResponse =
        clone(volume, params, RequestOptions.none())

    /** @see clone */
    fun clone(
        volume: String,
        params: VolumeCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VolumeResponse = clone(params.toBuilder().volume(volume).build(), requestOptions)

    /** @see clone */
    fun clone(params: VolumeCloneParams): VolumeResponse = clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: VolumeCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VolumeResponse

    /** A view of [VolumeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VolumeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/sandboxes/volumes`, but is otherwise the
         * same as [VolumeService.create].
         */
        @MustBeClosed
        fun create(params: VolumeCreateParams): HttpResponseFor<VolumeResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: VolumeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VolumeResponse>

        /**
         * Returns a raw HTTP response for `get /api/v2/sandboxes/volumes/{volume}`, but is
         * otherwise the same as [VolumeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(volume: String): HttpResponseFor<VolumeResponse> =
            retrieve(volume, VolumeRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            volume: String,
            params: VolumeRetrieveParams = VolumeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VolumeResponse> =
            retrieve(params.toBuilder().volume(volume).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            volume: String,
            params: VolumeRetrieveParams = VolumeRetrieveParams.none(),
        ): HttpResponseFor<VolumeResponse> = retrieve(volume, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VolumeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VolumeResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: VolumeRetrieveParams): HttpResponseFor<VolumeResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            volume: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VolumeResponse> =
            retrieve(volume, VolumeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v2/sandboxes/volumes/{volume}`, but is
         * otherwise the same as [VolumeService.update].
         */
        @MustBeClosed
        fun update(volume: String): HttpResponseFor<VolumeResponse> =
            update(volume, VolumeUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            volume: String,
            params: VolumeUpdateParams = VolumeUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VolumeResponse> =
            update(params.toBuilder().volume(volume).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            volume: String,
            params: VolumeUpdateParams = VolumeUpdateParams.none(),
        ): HttpResponseFor<VolumeResponse> = update(volume, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: VolumeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VolumeResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: VolumeUpdateParams): HttpResponseFor<VolumeResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            volume: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VolumeResponse> =
            update(volume, VolumeUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/sandboxes/volumes`, but is otherwise the
         * same as [VolumeService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<VolumeListPage> = list(VolumeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VolumeListParams = VolumeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VolumeListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: VolumeListParams = VolumeListParams.none()
        ): HttpResponseFor<VolumeListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VolumeListPage> =
            list(VolumeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/sandboxes/volumes/{volume}`, but is
         * otherwise the same as [VolumeService.delete].
         */
        @MustBeClosed
        fun delete(volume: String): HttpResponse = delete(volume, VolumeDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            volume: String,
            params: VolumeDeleteParams = VolumeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().volume(volume).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            volume: String,
            params: VolumeDeleteParams = VolumeDeleteParams.none(),
        ): HttpResponse = delete(volume, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: VolumeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: VolumeDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(volume: String, requestOptions: RequestOptions): HttpResponse =
            delete(volume, VolumeDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v2/sandboxes/volumes/{volume}/clone`, but is
         * otherwise the same as [VolumeService.clone].
         */
        @MustBeClosed
        fun clone(volume: String, params: VolumeCloneParams): HttpResponseFor<VolumeResponse> =
            clone(volume, params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            volume: String,
            params: VolumeCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VolumeResponse> =
            clone(params.toBuilder().volume(volume).build(), requestOptions)

        /** @see clone */
        @MustBeClosed
        fun clone(params: VolumeCloneParams): HttpResponseFor<VolumeResponse> =
            clone(params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            params: VolumeCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VolumeResponse>
    }
}
