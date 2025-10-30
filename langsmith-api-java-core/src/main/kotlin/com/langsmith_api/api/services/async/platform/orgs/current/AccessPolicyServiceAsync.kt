// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.platform.orgs.current

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponse
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.AccessPolicy
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.AccessPolicyCreateParams
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.AccessPolicyCreateResponse
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.AccessPolicyDeleteParams
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.AccessPolicyListParams
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.AccessPolicyListResponse
import com.langsmith_api.api.models.platform.orgs.current.accesspolicies.AccessPolicyRetrieveParams
import com.langsmith_api.api.services.async.platform.orgs.current.accesspolicies.RoleServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccessPolicyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccessPolicyServiceAsync

    fun roles(): RoleServiceAsync

    /**
     * Creates a new access policy. The request body must be a JSON-encoded access policy object
     * that follows the CreateAccessPolicyRequest schema.
     */
    fun create(): CompletableFuture<AccessPolicyCreateResponse> =
        create(AccessPolicyCreateParams.none())

    /** @see create */
    fun create(
        params: AccessPolicyCreateParams = AccessPolicyCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessPolicyCreateResponse>

    /** @see create */
    fun create(
        params: AccessPolicyCreateParams = AccessPolicyCreateParams.none()
    ): CompletableFuture<AccessPolicyCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<AccessPolicyCreateResponse> =
        create(AccessPolicyCreateParams.none(), requestOptions)

    /** Gets a specific access policy by ID. */
    fun retrieve(accessPolicyId: JsonValue): CompletableFuture<AccessPolicy> =
        retrieve(accessPolicyId, AccessPolicyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        accessPolicyId: JsonValue,
        params: AccessPolicyRetrieveParams = AccessPolicyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessPolicy> =
        retrieve(params.toBuilder().accessPolicyId(accessPolicyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        accessPolicyId: JsonValue,
        params: AccessPolicyRetrieveParams = AccessPolicyRetrieveParams.none(),
    ): CompletableFuture<AccessPolicy> = retrieve(accessPolicyId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccessPolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessPolicy>

    /** @see retrieve */
    fun retrieve(params: AccessPolicyRetrieveParams): CompletableFuture<AccessPolicy> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        accessPolicyId: JsonValue,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccessPolicy> =
        retrieve(accessPolicyId, AccessPolicyRetrieveParams.none(), requestOptions)

    /** Lists all access policies for the organization. */
    fun list(): CompletableFuture<AccessPolicyListResponse> = list(AccessPolicyListParams.none())

    /** @see list */
    fun list(
        params: AccessPolicyListParams = AccessPolicyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessPolicyListResponse>

    /** @see list */
    fun list(
        params: AccessPolicyListParams = AccessPolicyListParams.none()
    ): CompletableFuture<AccessPolicyListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccessPolicyListResponse> =
        list(AccessPolicyListParams.none(), requestOptions)

    /** Deletes a specific access policy by ID. */
    fun delete(accessPolicyId: JsonValue): CompletableFuture<Void?> =
        delete(accessPolicyId, AccessPolicyDeleteParams.none())

    /** @see delete */
    fun delete(
        accessPolicyId: JsonValue,
        params: AccessPolicyDeleteParams = AccessPolicyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().accessPolicyId(accessPolicyId).build(), requestOptions)

    /** @see delete */
    fun delete(
        accessPolicyId: JsonValue,
        params: AccessPolicyDeleteParams = AccessPolicyDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(accessPolicyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AccessPolicyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AccessPolicyDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        accessPolicyId: JsonValue,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        delete(accessPolicyId, AccessPolicyDeleteParams.none(), requestOptions)

    /**
     * A view of [AccessPolicyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccessPolicyServiceAsync.WithRawResponse

        fun roles(): RoleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/platform/orgs/current/access-policies`, but is
         * otherwise the same as [AccessPolicyServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<AccessPolicyCreateResponse>> =
            create(AccessPolicyCreateParams.none())

        /** @see create */
        fun create(
            params: AccessPolicyCreateParams = AccessPolicyCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessPolicyCreateResponse>>

        /** @see create */
        fun create(
            params: AccessPolicyCreateParams = AccessPolicyCreateParams.none()
        ): CompletableFuture<HttpResponseFor<AccessPolicyCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccessPolicyCreateResponse>> =
            create(AccessPolicyCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/platform/orgs/current/access-policies/{access_policy_id}`, but is otherwise the same
         * as [AccessPolicyServiceAsync.retrieve].
         */
        fun retrieve(accessPolicyId: JsonValue): CompletableFuture<HttpResponseFor<AccessPolicy>> =
            retrieve(accessPolicyId, AccessPolicyRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            accessPolicyId: JsonValue,
            params: AccessPolicyRetrieveParams = AccessPolicyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessPolicy>> =
            retrieve(params.toBuilder().accessPolicyId(accessPolicyId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            accessPolicyId: JsonValue,
            params: AccessPolicyRetrieveParams = AccessPolicyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AccessPolicy>> =
            retrieve(accessPolicyId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AccessPolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessPolicy>>

        /** @see retrieve */
        fun retrieve(
            params: AccessPolicyRetrieveParams
        ): CompletableFuture<HttpResponseFor<AccessPolicy>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            accessPolicyId: JsonValue,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccessPolicy>> =
            retrieve(accessPolicyId, AccessPolicyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/platform/orgs/current/access-policies`, but is
         * otherwise the same as [AccessPolicyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AccessPolicyListResponse>> =
            list(AccessPolicyListParams.none())

        /** @see list */
        fun list(
            params: AccessPolicyListParams = AccessPolicyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessPolicyListResponse>>

        /** @see list */
        fun list(
            params: AccessPolicyListParams = AccessPolicyListParams.none()
        ): CompletableFuture<HttpResponseFor<AccessPolicyListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccessPolicyListResponse>> =
            list(AccessPolicyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /v1/platform/orgs/current/access-policies/{access_policy_id}`, but is otherwise the same
         * as [AccessPolicyServiceAsync.delete].
         */
        fun delete(accessPolicyId: JsonValue): CompletableFuture<HttpResponse> =
            delete(accessPolicyId, AccessPolicyDeleteParams.none())

        /** @see delete */
        fun delete(
            accessPolicyId: JsonValue,
            params: AccessPolicyDeleteParams = AccessPolicyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().accessPolicyId(accessPolicyId).build(), requestOptions)

        /** @see delete */
        fun delete(
            accessPolicyId: JsonValue,
            params: AccessPolicyDeleteParams = AccessPolicyDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(accessPolicyId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AccessPolicyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AccessPolicyDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            accessPolicyId: JsonValue,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(accessPolicyId, AccessPolicyDeleteParams.none(), requestOptions)
    }
}
