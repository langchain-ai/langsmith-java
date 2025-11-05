// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.usagelimits.UsageLimit
import com.langchain.smith.models.usagelimits.UsageLimitDeleteParams
import com.langchain.smith.models.usagelimits.UsageLimitDeleteResponse
import com.langchain.smith.models.usagelimits.UsageLimitRetrieveOrgParams
import com.langchain.smith.models.usagelimits.UsageLimitRetrieveUsageLimitsParams
import com.langchain.smith.models.usagelimits.UsageLimitUpdateUsageLimitsParams
import java.util.function.Consumer

interface UsageLimitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageLimitService

    /** Delete a specific usage limit. */
    fun delete(usageLimitId: String): UsageLimitDeleteResponse =
        delete(usageLimitId, UsageLimitDeleteParams.none())

    /** @see delete */
    fun delete(
        usageLimitId: String,
        params: UsageLimitDeleteParams = UsageLimitDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageLimitDeleteResponse =
        delete(params.toBuilder().usageLimitId(usageLimitId).build(), requestOptions)

    /** @see delete */
    fun delete(
        usageLimitId: String,
        params: UsageLimitDeleteParams = UsageLimitDeleteParams.none(),
    ): UsageLimitDeleteResponse = delete(usageLimitId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: UsageLimitDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageLimitDeleteResponse

    /** @see delete */
    fun delete(params: UsageLimitDeleteParams): UsageLimitDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(usageLimitId: String, requestOptions: RequestOptions): UsageLimitDeleteResponse =
        delete(usageLimitId, UsageLimitDeleteParams.none(), requestOptions)

    /** List out the configured usage limits for a given organization. */
    fun retrieveOrg(): List<UsageLimit> = retrieveOrg(UsageLimitRetrieveOrgParams.none())

    /** @see retrieveOrg */
    fun retrieveOrg(
        params: UsageLimitRetrieveOrgParams = UsageLimitRetrieveOrgParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<UsageLimit>

    /** @see retrieveOrg */
    fun retrieveOrg(
        params: UsageLimitRetrieveOrgParams = UsageLimitRetrieveOrgParams.none()
    ): List<UsageLimit> = retrieveOrg(params, RequestOptions.none())

    /** @see retrieveOrg */
    fun retrieveOrg(requestOptions: RequestOptions): List<UsageLimit> =
        retrieveOrg(UsageLimitRetrieveOrgParams.none(), requestOptions)

    /** List out the configured usage limits for a given tenant. */
    fun retrieveUsageLimits(): List<UsageLimit> =
        retrieveUsageLimits(UsageLimitRetrieveUsageLimitsParams.none())

    /** @see retrieveUsageLimits */
    fun retrieveUsageLimits(
        params: UsageLimitRetrieveUsageLimitsParams = UsageLimitRetrieveUsageLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<UsageLimit>

    /** @see retrieveUsageLimits */
    fun retrieveUsageLimits(
        params: UsageLimitRetrieveUsageLimitsParams = UsageLimitRetrieveUsageLimitsParams.none()
    ): List<UsageLimit> = retrieveUsageLimits(params, RequestOptions.none())

    /** @see retrieveUsageLimits */
    fun retrieveUsageLimits(requestOptions: RequestOptions): List<UsageLimit> =
        retrieveUsageLimits(UsageLimitRetrieveUsageLimitsParams.none(), requestOptions)

    /** Create a new usage limit. */
    fun updateUsageLimits(params: UsageLimitUpdateUsageLimitsParams): UsageLimit =
        updateUsageLimits(params, RequestOptions.none())

    /** @see updateUsageLimits */
    fun updateUsageLimits(
        params: UsageLimitUpdateUsageLimitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageLimit

    /** A view of [UsageLimitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageLimitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /api/v1/usage-limits/{usage_limit_id}`, but is
         * otherwise the same as [UsageLimitService.delete].
         */
        @MustBeClosed
        fun delete(usageLimitId: String): HttpResponseFor<UsageLimitDeleteResponse> =
            delete(usageLimitId, UsageLimitDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            usageLimitId: String,
            params: UsageLimitDeleteParams = UsageLimitDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageLimitDeleteResponse> =
            delete(params.toBuilder().usageLimitId(usageLimitId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            usageLimitId: String,
            params: UsageLimitDeleteParams = UsageLimitDeleteParams.none(),
        ): HttpResponseFor<UsageLimitDeleteResponse> =
            delete(usageLimitId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: UsageLimitDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageLimitDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: UsageLimitDeleteParams): HttpResponseFor<UsageLimitDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            usageLimitId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageLimitDeleteResponse> =
            delete(usageLimitId, UsageLimitDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/usage-limits/org`, but is otherwise the same
         * as [UsageLimitService.retrieveOrg].
         */
        @MustBeClosed
        fun retrieveOrg(): HttpResponseFor<List<UsageLimit>> =
            retrieveOrg(UsageLimitRetrieveOrgParams.none())

        /** @see retrieveOrg */
        @MustBeClosed
        fun retrieveOrg(
            params: UsageLimitRetrieveOrgParams = UsageLimitRetrieveOrgParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<UsageLimit>>

        /** @see retrieveOrg */
        @MustBeClosed
        fun retrieveOrg(
            params: UsageLimitRetrieveOrgParams = UsageLimitRetrieveOrgParams.none()
        ): HttpResponseFor<List<UsageLimit>> = retrieveOrg(params, RequestOptions.none())

        /** @see retrieveOrg */
        @MustBeClosed
        fun retrieveOrg(requestOptions: RequestOptions): HttpResponseFor<List<UsageLimit>> =
            retrieveOrg(UsageLimitRetrieveOrgParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/usage-limits`, but is otherwise the same as
         * [UsageLimitService.retrieveUsageLimits].
         */
        @MustBeClosed
        fun retrieveUsageLimits(): HttpResponseFor<List<UsageLimit>> =
            retrieveUsageLimits(UsageLimitRetrieveUsageLimitsParams.none())

        /** @see retrieveUsageLimits */
        @MustBeClosed
        fun retrieveUsageLimits(
            params: UsageLimitRetrieveUsageLimitsParams =
                UsageLimitRetrieveUsageLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<UsageLimit>>

        /** @see retrieveUsageLimits */
        @MustBeClosed
        fun retrieveUsageLimits(
            params: UsageLimitRetrieveUsageLimitsParams = UsageLimitRetrieveUsageLimitsParams.none()
        ): HttpResponseFor<List<UsageLimit>> = retrieveUsageLimits(params, RequestOptions.none())

        /** @see retrieveUsageLimits */
        @MustBeClosed
        fun retrieveUsageLimits(requestOptions: RequestOptions): HttpResponseFor<List<UsageLimit>> =
            retrieveUsageLimits(UsageLimitRetrieveUsageLimitsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v1/usage-limits`, but is otherwise the same as
         * [UsageLimitService.updateUsageLimits].
         */
        @MustBeClosed
        fun updateUsageLimits(
            params: UsageLimitUpdateUsageLimitsParams
        ): HttpResponseFor<UsageLimit> = updateUsageLimits(params, RequestOptions.none())

        /** @see updateUsageLimits */
        @MustBeClosed
        fun updateUsageLimits(
            params: UsageLimitUpdateUsageLimitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageLimit>
    }
}
