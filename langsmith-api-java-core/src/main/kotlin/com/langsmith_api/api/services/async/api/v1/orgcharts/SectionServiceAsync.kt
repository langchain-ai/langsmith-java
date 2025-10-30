// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.orgcharts

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.charts.section.CustomChartsSectionCreate
import com.langsmith_api.api.models.api.v1.charts.section.CustomChartsSectionResponse
import com.langsmith_api.api.models.api.v1.orgcharts.section.SectionCreateParams
import com.langsmith_api.api.models.api.v1.orgcharts.section.SectionDeleteParams
import com.langsmith_api.api.models.api.v1.orgcharts.section.SectionDeleteResponse
import com.langsmith_api.api.models.api.v1.orgcharts.section.SectionListParams
import com.langsmith_api.api.models.api.v1.orgcharts.section.SectionUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SectionServiceAsync

    /** Create a new section. */
    fun create(params: SectionCreateParams): CompletableFuture<CustomChartsSectionResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartsSectionResponse>

    /** @see create */
    fun create(
        customChartsSectionCreate: CustomChartsSectionCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartsSectionResponse> =
        create(
            SectionCreateParams.builder()
                .customChartsSectionCreate(customChartsSectionCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        customChartsSectionCreate: CustomChartsSectionCreate
    ): CompletableFuture<CustomChartsSectionResponse> =
        create(customChartsSectionCreate, RequestOptions.none())

    /** Update a section. */
    fun update(
        sectionId: String,
        params: SectionUpdateParams,
    ): CompletableFuture<CustomChartsSectionResponse> =
        update(sectionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        sectionId: String,
        params: SectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartsSectionResponse> =
        update(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see update */
    fun update(params: SectionUpdateParams): CompletableFuture<CustomChartsSectionResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartsSectionResponse>

    /** Get all sections for the tenant. */
    fun list(): CompletableFuture<List<CustomChartsSectionResponse>> =
        list(SectionListParams.none())

    /** @see list */
    fun list(
        params: SectionListParams = SectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CustomChartsSectionResponse>>

    /** @see list */
    fun list(
        params: SectionListParams = SectionListParams.none()
    ): CompletableFuture<List<CustomChartsSectionResponse>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<CustomChartsSectionResponse>> =
        list(SectionListParams.none(), requestOptions)

    /** Delete a section. */
    fun delete(sectionId: String): CompletableFuture<SectionDeleteResponse> =
        delete(sectionId, SectionDeleteParams.none())

    /** @see delete */
    fun delete(
        sectionId: String,
        params: SectionDeleteParams = SectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SectionDeleteResponse> =
        delete(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        sectionId: String,
        params: SectionDeleteParams = SectionDeleteParams.none(),
    ): CompletableFuture<SectionDeleteResponse> = delete(sectionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SectionDeleteResponse>

    /** @see delete */
    fun delete(params: SectionDeleteParams): CompletableFuture<SectionDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        sectionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SectionDeleteResponse> =
        delete(sectionId, SectionDeleteParams.none(), requestOptions)

    /**
     * A view of [SectionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/org-charts/section`, but is otherwise the
         * same as [SectionServiceAsync.create].
         */
        fun create(
            params: SectionCreateParams
        ): CompletableFuture<HttpResponseFor<CustomChartsSectionResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartsSectionResponse>>

        /** @see create */
        fun create(
            customChartsSectionCreate: CustomChartsSectionCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartsSectionResponse>> =
            create(
                SectionCreateParams.builder()
                    .customChartsSectionCreate(customChartsSectionCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            customChartsSectionCreate: CustomChartsSectionCreate
        ): CompletableFuture<HttpResponseFor<CustomChartsSectionResponse>> =
            create(customChartsSectionCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /api/v1/org-charts/section/{section_id}`, but is
         * otherwise the same as [SectionServiceAsync.update].
         */
        fun update(
            sectionId: String,
            params: SectionUpdateParams,
        ): CompletableFuture<HttpResponseFor<CustomChartsSectionResponse>> =
            update(sectionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            sectionId: String,
            params: SectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartsSectionResponse>> =
            update(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see update */
        fun update(
            params: SectionUpdateParams
        ): CompletableFuture<HttpResponseFor<CustomChartsSectionResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartsSectionResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/org-charts/section`, but is otherwise the
         * same as [SectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<CustomChartsSectionResponse>>> =
            list(SectionListParams.none())

        /** @see list */
        fun list(
            params: SectionListParams = SectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CustomChartsSectionResponse>>>

        /** @see list */
        fun list(
            params: SectionListParams = SectionListParams.none()
        ): CompletableFuture<HttpResponseFor<List<CustomChartsSectionResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<CustomChartsSectionResponse>>> =
            list(SectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/org-charts/section/{section_id}`, but is
         * otherwise the same as [SectionServiceAsync.delete].
         */
        fun delete(sectionId: String): CompletableFuture<HttpResponseFor<SectionDeleteResponse>> =
            delete(sectionId, SectionDeleteParams.none())

        /** @see delete */
        fun delete(
            sectionId: String,
            params: SectionDeleteParams = SectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SectionDeleteResponse>> =
            delete(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see delete */
        fun delete(
            sectionId: String,
            params: SectionDeleteParams = SectionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<SectionDeleteResponse>> =
            delete(sectionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SectionDeleteResponse>>

        /** @see delete */
        fun delete(
            params: SectionDeleteParams
        ): CompletableFuture<HttpResponseFor<SectionDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            sectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SectionDeleteResponse>> =
            delete(sectionId, SectionDeleteParams.none(), requestOptions)
    }
}
