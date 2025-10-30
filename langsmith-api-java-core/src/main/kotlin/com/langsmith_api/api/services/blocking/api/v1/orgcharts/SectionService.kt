// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgcharts

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface SectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SectionService

    /** Create a new section. */
    fun create(params: SectionCreateParams): CustomChartsSectionResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartsSectionResponse

    /** @see create */
    fun create(
        customChartsSectionCreate: CustomChartsSectionCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartsSectionResponse =
        create(
            SectionCreateParams.builder()
                .customChartsSectionCreate(customChartsSectionCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(customChartsSectionCreate: CustomChartsSectionCreate): CustomChartsSectionResponse =
        create(customChartsSectionCreate, RequestOptions.none())

    /** Update a section. */
    fun update(sectionId: String, params: SectionUpdateParams): CustomChartsSectionResponse =
        update(sectionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        sectionId: String,
        params: SectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartsSectionResponse =
        update(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see update */
    fun update(params: SectionUpdateParams): CustomChartsSectionResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartsSectionResponse

    /** Get all sections for the tenant. */
    fun list(): List<CustomChartsSectionResponse> = list(SectionListParams.none())

    /** @see list */
    fun list(
        params: SectionListParams = SectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CustomChartsSectionResponse>

    /** @see list */
    fun list(
        params: SectionListParams = SectionListParams.none()
    ): List<CustomChartsSectionResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<CustomChartsSectionResponse> =
        list(SectionListParams.none(), requestOptions)

    /** Delete a section. */
    fun delete(sectionId: String): SectionDeleteResponse =
        delete(sectionId, SectionDeleteParams.none())

    /** @see delete */
    fun delete(
        sectionId: String,
        params: SectionDeleteParams = SectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SectionDeleteResponse =
        delete(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        sectionId: String,
        params: SectionDeleteParams = SectionDeleteParams.none(),
    ): SectionDeleteResponse = delete(sectionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SectionDeleteResponse

    /** @see delete */
    fun delete(params: SectionDeleteParams): SectionDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(sectionId: String, requestOptions: RequestOptions): SectionDeleteResponse =
        delete(sectionId, SectionDeleteParams.none(), requestOptions)

    /** A view of [SectionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/org-charts/section`, but is otherwise the
         * same as [SectionService.create].
         */
        @MustBeClosed
        fun create(params: SectionCreateParams): HttpResponseFor<CustomChartsSectionResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartsSectionResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            customChartsSectionCreate: CustomChartsSectionCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartsSectionResponse> =
            create(
                SectionCreateParams.builder()
                    .customChartsSectionCreate(customChartsSectionCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            customChartsSectionCreate: CustomChartsSectionCreate
        ): HttpResponseFor<CustomChartsSectionResponse> =
            create(customChartsSectionCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /api/v1/org-charts/section/{section_id}`, but is
         * otherwise the same as [SectionService.update].
         */
        @MustBeClosed
        fun update(
            sectionId: String,
            params: SectionUpdateParams,
        ): HttpResponseFor<CustomChartsSectionResponse> =
            update(sectionId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            sectionId: String,
            params: SectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartsSectionResponse> =
            update(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SectionUpdateParams): HttpResponseFor<CustomChartsSectionResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartsSectionResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/org-charts/section`, but is otherwise the
         * same as [SectionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<CustomChartsSectionResponse>> =
            list(SectionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SectionListParams = SectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CustomChartsSectionResponse>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SectionListParams = SectionListParams.none()
        ): HttpResponseFor<List<CustomChartsSectionResponse>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<CustomChartsSectionResponse>> =
            list(SectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/org-charts/section/{section_id}`, but is
         * otherwise the same as [SectionService.delete].
         */
        @MustBeClosed
        fun delete(sectionId: String): HttpResponseFor<SectionDeleteResponse> =
            delete(sectionId, SectionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            sectionId: String,
            params: SectionDeleteParams = SectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SectionDeleteResponse> =
            delete(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            sectionId: String,
            params: SectionDeleteParams = SectionDeleteParams.none(),
        ): HttpResponseFor<SectionDeleteResponse> = delete(sectionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SectionDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: SectionDeleteParams): HttpResponseFor<SectionDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            sectionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SectionDeleteResponse> =
            delete(sectionId, SectionDeleteParams.none(), requestOptions)
    }
}
