// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.charts

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.charts.section.CustomChartsSectionCreate
import com.langchain.smith.models.charts.section.CustomChartsSectionResponse
import com.langchain.smith.models.charts.section.SectionCloneParams
import com.langchain.smith.models.charts.section.SectionCreateParams
import com.langchain.smith.models.charts.section.SectionDeleteParams
import com.langchain.smith.models.charts.section.SectionDeleteResponse
import com.langchain.smith.models.charts.section.SectionListParams
import com.langchain.smith.models.charts.section.SectionRetrieveParams
import com.langchain.smith.models.charts.section.SectionUpdateParams
import com.langchain.smith.models.sessions.CustomChartsSection
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

    /** Get a single section by ID. */
    fun retrieve(
        sectionId: String,
        params: SectionRetrieveParams,
    ): CompletableFuture<CustomChartsSection> = retrieve(sectionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        sectionId: String,
        params: SectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartsSection> =
        retrieve(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: SectionRetrieveParams): CompletableFuture<CustomChartsSection> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartsSection>

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

    /** Clone a dashboard. */
    fun clone(): CompletableFuture<CustomChartsSectionResponse> = clone(SectionCloneParams.none())

    /** @see clone */
    fun clone(
        params: SectionCloneParams = SectionCloneParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartsSectionResponse>

    /** @see clone */
    fun clone(
        params: SectionCloneParams = SectionCloneParams.none()
    ): CompletableFuture<CustomChartsSectionResponse> = clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(requestOptions: RequestOptions): CompletableFuture<CustomChartsSectionResponse> =
        clone(SectionCloneParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /api/v1/charts/section`, but is otherwise the same
         * as [SectionServiceAsync.create].
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
         * Returns a raw HTTP response for `post /api/v1/charts/section/{section_id}`, but is
         * otherwise the same as [SectionServiceAsync.retrieve].
         */
        fun retrieve(
            sectionId: String,
            params: SectionRetrieveParams,
        ): CompletableFuture<HttpResponseFor<CustomChartsSection>> =
            retrieve(sectionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            sectionId: String,
            params: SectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartsSection>> =
            retrieve(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: SectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<CustomChartsSection>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartsSection>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/charts/section/{section_id}`, but is
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
         * Returns a raw HTTP response for `get /api/v1/charts/section`, but is otherwise the same
         * as [SectionServiceAsync.list].
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
         * Returns a raw HTTP response for `delete /api/v1/charts/section/{section_id}`, but is
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

        /**
         * Returns a raw HTTP response for `post /api/v1/charts/section/clone`, but is otherwise the
         * same as [SectionServiceAsync.clone].
         */
        fun clone(): CompletableFuture<HttpResponseFor<CustomChartsSectionResponse>> =
            clone(SectionCloneParams.none())

        /** @see clone */
        fun clone(
            params: SectionCloneParams = SectionCloneParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartsSectionResponse>>

        /** @see clone */
        fun clone(
            params: SectionCloneParams = SectionCloneParams.none()
        ): CompletableFuture<HttpResponseFor<CustomChartsSectionResponse>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomChartsSectionResponse>> =
            clone(SectionCloneParams.none(), requestOptions)
    }
}
