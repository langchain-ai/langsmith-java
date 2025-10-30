// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.usagelimits.UsageLimit
import com.langsmith_api.api.models.api.v1.usagelimits.UsageLimitDeleteParams
import com.langsmith_api.api.models.api.v1.usagelimits.UsageLimitDeleteResponse
import com.langsmith_api.api.models.api.v1.usagelimits.UsageLimitRetrieveOrgParams
import com.langsmith_api.api.models.api.v1.usagelimits.UsageLimitRetrieveUsageLimitsParams
import com.langsmith_api.api.models.api.v1.usagelimits.UsageLimitUpdateUsageLimitsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UsageLimitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageLimitServiceAsync

    /** Delete a specific usage limit. */
    fun delete(usageLimitId: String): CompletableFuture<UsageLimitDeleteResponse> =
        delete(usageLimitId, UsageLimitDeleteParams.none())

    /** @see delete */
    fun delete(
        usageLimitId: String,
        params: UsageLimitDeleteParams = UsageLimitDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageLimitDeleteResponse> =
        delete(params.toBuilder().usageLimitId(usageLimitId).build(), requestOptions)

    /** @see delete */
    fun delete(
        usageLimitId: String,
        params: UsageLimitDeleteParams = UsageLimitDeleteParams.none(),
    ): CompletableFuture<UsageLimitDeleteResponse> =
        delete(usageLimitId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: UsageLimitDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageLimitDeleteResponse>

    /** @see delete */
    fun delete(params: UsageLimitDeleteParams): CompletableFuture<UsageLimitDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        usageLimitId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageLimitDeleteResponse> =
        delete(usageLimitId, UsageLimitDeleteParams.none(), requestOptions)

    /** List out the configured usage limits for a given organization. */
    fun retrieveOrg(): CompletableFuture<List<UsageLimit>> =
        retrieveOrg(UsageLimitRetrieveOrgParams.none())

    /** @see retrieveOrg */
    fun retrieveOrg(
        params: UsageLimitRetrieveOrgParams = UsageLimitRetrieveOrgParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<UsageLimit>>

    /** @see retrieveOrg */
    fun retrieveOrg(
        params: UsageLimitRetrieveOrgParams = UsageLimitRetrieveOrgParams.none()
    ): CompletableFuture<List<UsageLimit>> = retrieveOrg(params, RequestOptions.none())

    /** @see retrieveOrg */
    fun retrieveOrg(requestOptions: RequestOptions): CompletableFuture<List<UsageLimit>> =
        retrieveOrg(UsageLimitRetrieveOrgParams.none(), requestOptions)

    /** List out the configured usage limits for a given tenant. */
    fun retrieveUsageLimits(): CompletableFuture<List<UsageLimit>> =
        retrieveUsageLimits(UsageLimitRetrieveUsageLimitsParams.none())

    /** @see retrieveUsageLimits */
    fun retrieveUsageLimits(
        params: UsageLimitRetrieveUsageLimitsParams = UsageLimitRetrieveUsageLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<UsageLimit>>

    /** @see retrieveUsageLimits */
    fun retrieveUsageLimits(
        params: UsageLimitRetrieveUsageLimitsParams = UsageLimitRetrieveUsageLimitsParams.none()
    ): CompletableFuture<List<UsageLimit>> = retrieveUsageLimits(params, RequestOptions.none())

    /** @see retrieveUsageLimits */
    fun retrieveUsageLimits(requestOptions: RequestOptions): CompletableFuture<List<UsageLimit>> =
        retrieveUsageLimits(UsageLimitRetrieveUsageLimitsParams.none(), requestOptions)

    /** Create a new usage limit. */
    fun updateUsageLimits(
        params: UsageLimitUpdateUsageLimitsParams
    ): CompletableFuture<UsageLimit> = updateUsageLimits(params, RequestOptions.none())

    /** @see updateUsageLimits */
    fun updateUsageLimits(
        params: UsageLimitUpdateUsageLimitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageLimit>

    /**
     * A view of [UsageLimitServiceAsync] that provides access to raw HTTP responses for each
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
        ): UsageLimitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /api/v1/usage-limits/{usage_limit_id}`, but is
         * otherwise the same as [UsageLimitServiceAsync.delete].
         */
        fun delete(
            usageLimitId: String
        ): CompletableFuture<HttpResponseFor<UsageLimitDeleteResponse>> =
            delete(usageLimitId, UsageLimitDeleteParams.none())

        /** @see delete */
        fun delete(
            usageLimitId: String,
            params: UsageLimitDeleteParams = UsageLimitDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageLimitDeleteResponse>> =
            delete(params.toBuilder().usageLimitId(usageLimitId).build(), requestOptions)

        /** @see delete */
        fun delete(
            usageLimitId: String,
            params: UsageLimitDeleteParams = UsageLimitDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<UsageLimitDeleteResponse>> =
            delete(usageLimitId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: UsageLimitDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageLimitDeleteResponse>>

        /** @see delete */
        fun delete(
            params: UsageLimitDeleteParams
        ): CompletableFuture<HttpResponseFor<UsageLimitDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            usageLimitId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageLimitDeleteResponse>> =
            delete(usageLimitId, UsageLimitDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/usage-limits/org`, but is otherwise the same
         * as [UsageLimitServiceAsync.retrieveOrg].
         */
        fun retrieveOrg(): CompletableFuture<HttpResponseFor<List<UsageLimit>>> =
            retrieveOrg(UsageLimitRetrieveOrgParams.none())

        /** @see retrieveOrg */
        fun retrieveOrg(
            params: UsageLimitRetrieveOrgParams = UsageLimitRetrieveOrgParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<UsageLimit>>>

        /** @see retrieveOrg */
        fun retrieveOrg(
            params: UsageLimitRetrieveOrgParams = UsageLimitRetrieveOrgParams.none()
        ): CompletableFuture<HttpResponseFor<List<UsageLimit>>> =
            retrieveOrg(params, RequestOptions.none())

        /** @see retrieveOrg */
        fun retrieveOrg(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<UsageLimit>>> =
            retrieveOrg(UsageLimitRetrieveOrgParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/usage-limits`, but is otherwise the same as
         * [UsageLimitServiceAsync.retrieveUsageLimits].
         */
        fun retrieveUsageLimits(): CompletableFuture<HttpResponseFor<List<UsageLimit>>> =
            retrieveUsageLimits(UsageLimitRetrieveUsageLimitsParams.none())

        /** @see retrieveUsageLimits */
        fun retrieveUsageLimits(
            params: UsageLimitRetrieveUsageLimitsParams =
                UsageLimitRetrieveUsageLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<UsageLimit>>>

        /** @see retrieveUsageLimits */
        fun retrieveUsageLimits(
            params: UsageLimitRetrieveUsageLimitsParams = UsageLimitRetrieveUsageLimitsParams.none()
        ): CompletableFuture<HttpResponseFor<List<UsageLimit>>> =
            retrieveUsageLimits(params, RequestOptions.none())

        /** @see retrieveUsageLimits */
        fun retrieveUsageLimits(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<UsageLimit>>> =
            retrieveUsageLimits(UsageLimitRetrieveUsageLimitsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/usage-limits`, but is otherwise the same as
         * [UsageLimitServiceAsync.updateUsageLimits].
         */
        fun updateUsageLimits(
            params: UsageLimitUpdateUsageLimitsParams
        ): CompletableFuture<HttpResponseFor<UsageLimit>> =
            updateUsageLimits(params, RequestOptions.none())

        /** @see updateUsageLimits */
        fun updateUsageLimits(
            params: UsageLimitUpdateUsageLimitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageLimit>>
    }
}
