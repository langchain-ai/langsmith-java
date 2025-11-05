// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.platform.orgs.current

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicy
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicyCreateParams
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicyCreateResponse
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicyDeleteParams
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicyListParams
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicyListResponse
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicyRetrieveParams
import com.langchain.smith.services.blocking.platform.orgs.current.accesspolicies.RoleService
import java.util.function.Consumer

interface AccessPolicyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccessPolicyService

    fun roles(): RoleService

    /**
     * Creates a new access policy. The request body must be a JSON-encoded access policy object
     * that follows the CreateAccessPolicyRequest schema.
     */
    fun create(): AccessPolicyCreateResponse = create(AccessPolicyCreateParams.none())

    /** @see create */
    fun create(
        params: AccessPolicyCreateParams = AccessPolicyCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessPolicyCreateResponse

    /** @see create */
    fun create(
        params: AccessPolicyCreateParams = AccessPolicyCreateParams.none()
    ): AccessPolicyCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): AccessPolicyCreateResponse =
        create(AccessPolicyCreateParams.none(), requestOptions)

    /** Gets a specific access policy by ID. */
    fun retrieve(accessPolicyId: JsonValue): AccessPolicy =
        retrieve(accessPolicyId, AccessPolicyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        accessPolicyId: JsonValue,
        params: AccessPolicyRetrieveParams = AccessPolicyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessPolicy =
        retrieve(params.toBuilder().accessPolicyId(accessPolicyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        accessPolicyId: JsonValue,
        params: AccessPolicyRetrieveParams = AccessPolicyRetrieveParams.none(),
    ): AccessPolicy = retrieve(accessPolicyId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccessPolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessPolicy

    /** @see retrieve */
    fun retrieve(params: AccessPolicyRetrieveParams): AccessPolicy =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(accessPolicyId: JsonValue, requestOptions: RequestOptions): AccessPolicy =
        retrieve(accessPolicyId, AccessPolicyRetrieveParams.none(), requestOptions)

    /** Lists all access policies for the organization. */
    fun list(): AccessPolicyListResponse = list(AccessPolicyListParams.none())

    /** @see list */
    fun list(
        params: AccessPolicyListParams = AccessPolicyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessPolicyListResponse

    /** @see list */
    fun list(
        params: AccessPolicyListParams = AccessPolicyListParams.none()
    ): AccessPolicyListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AccessPolicyListResponse =
        list(AccessPolicyListParams.none(), requestOptions)

    /** Deletes a specific access policy by ID. */
    fun delete(accessPolicyId: JsonValue) = delete(accessPolicyId, AccessPolicyDeleteParams.none())

    /** @see delete */
    fun delete(
        accessPolicyId: JsonValue,
        params: AccessPolicyDeleteParams = AccessPolicyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().accessPolicyId(accessPolicyId).build(), requestOptions)

    /** @see delete */
    fun delete(
        accessPolicyId: JsonValue,
        params: AccessPolicyDeleteParams = AccessPolicyDeleteParams.none(),
    ) = delete(accessPolicyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AccessPolicyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: AccessPolicyDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(accessPolicyId: JsonValue, requestOptions: RequestOptions) =
        delete(accessPolicyId, AccessPolicyDeleteParams.none(), requestOptions)

    /**
     * A view of [AccessPolicyService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccessPolicyService.WithRawResponse

        fun roles(): RoleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/platform/orgs/current/access-policies`, but is
         * otherwise the same as [AccessPolicyService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<AccessPolicyCreateResponse> =
            create(AccessPolicyCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AccessPolicyCreateParams = AccessPolicyCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessPolicyCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: AccessPolicyCreateParams = AccessPolicyCreateParams.none()
        ): HttpResponseFor<AccessPolicyCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<AccessPolicyCreateResponse> =
            create(AccessPolicyCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/platform/orgs/current/access-policies/{access_policy_id}`, but is otherwise the same
         * as [AccessPolicyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(accessPolicyId: JsonValue): HttpResponseFor<AccessPolicy> =
            retrieve(accessPolicyId, AccessPolicyRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            accessPolicyId: JsonValue,
            params: AccessPolicyRetrieveParams = AccessPolicyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessPolicy> =
            retrieve(params.toBuilder().accessPolicyId(accessPolicyId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            accessPolicyId: JsonValue,
            params: AccessPolicyRetrieveParams = AccessPolicyRetrieveParams.none(),
        ): HttpResponseFor<AccessPolicy> = retrieve(accessPolicyId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AccessPolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessPolicy>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AccessPolicyRetrieveParams): HttpResponseFor<AccessPolicy> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            accessPolicyId: JsonValue,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessPolicy> =
            retrieve(accessPolicyId, AccessPolicyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/platform/orgs/current/access-policies`, but is
         * otherwise the same as [AccessPolicyService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AccessPolicyListResponse> = list(AccessPolicyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccessPolicyListParams = AccessPolicyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessPolicyListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccessPolicyListParams = AccessPolicyListParams.none()
        ): HttpResponseFor<AccessPolicyListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccessPolicyListResponse> =
            list(AccessPolicyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/platform/orgs/current/access-policies/{access_policy_id}`, but is otherwise the same
         * as [AccessPolicyService.delete].
         */
        @MustBeClosed
        fun delete(accessPolicyId: JsonValue): HttpResponse =
            delete(accessPolicyId, AccessPolicyDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            accessPolicyId: JsonValue,
            params: AccessPolicyDeleteParams = AccessPolicyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().accessPolicyId(accessPolicyId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            accessPolicyId: JsonValue,
            params: AccessPolicyDeleteParams = AccessPolicyDeleteParams.none(),
        ): HttpResponse = delete(accessPolicyId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AccessPolicyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AccessPolicyDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(accessPolicyId: JsonValue, requestOptions: RequestOptions): HttpResponse =
            delete(accessPolicyId, AccessPolicyDeleteParams.none(), requestOptions)
    }
}
