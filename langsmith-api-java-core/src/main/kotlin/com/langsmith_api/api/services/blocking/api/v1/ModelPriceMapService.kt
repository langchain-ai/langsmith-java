// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapDeleteParams
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapDeleteResponse
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapModelPriceMapParams
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapModelPriceMapResponse
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapRetrieveModelPriceMapParams
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapRetrieveModelPriceMapResponse
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapUpdateParams
import com.langsmith_api.api.models.api.v1.modelpricemap.ModelPriceMapUpdateResponse
import java.util.function.Consumer

interface ModelPriceMapService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelPriceMapService

    /** Update Model Price */
    fun update(id: String, params: ModelPriceMapUpdateParams): ModelPriceMapUpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: ModelPriceMapUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelPriceMapUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: ModelPriceMapUpdateParams): ModelPriceMapUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ModelPriceMapUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelPriceMapUpdateResponse

    /** Delete Model Price */
    fun delete(id: String): ModelPriceMapDeleteResponse =
        delete(id, ModelPriceMapDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ModelPriceMapDeleteParams = ModelPriceMapDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelPriceMapDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ModelPriceMapDeleteParams = ModelPriceMapDeleteParams.none(),
    ): ModelPriceMapDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ModelPriceMapDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelPriceMapDeleteResponse

    /** @see delete */
    fun delete(params: ModelPriceMapDeleteParams): ModelPriceMapDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): ModelPriceMapDeleteResponse =
        delete(id, ModelPriceMapDeleteParams.none(), requestOptions)

    /** Create New Model Price */
    fun modelPriceMap(
        params: ModelPriceMapModelPriceMapParams
    ): ModelPriceMapModelPriceMapResponse = modelPriceMap(params, RequestOptions.none())

    /** @see modelPriceMap */
    fun modelPriceMap(
        params: ModelPriceMapModelPriceMapParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelPriceMapModelPriceMapResponse

    /** Read Model Price Map */
    fun retrieveModelPriceMap(): ModelPriceMapRetrieveModelPriceMapResponse =
        retrieveModelPriceMap(ModelPriceMapRetrieveModelPriceMapParams.none())

    /** @see retrieveModelPriceMap */
    fun retrieveModelPriceMap(
        params: ModelPriceMapRetrieveModelPriceMapParams =
            ModelPriceMapRetrieveModelPriceMapParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelPriceMapRetrieveModelPriceMapResponse

    /** @see retrieveModelPriceMap */
    fun retrieveModelPriceMap(
        params: ModelPriceMapRetrieveModelPriceMapParams =
            ModelPriceMapRetrieveModelPriceMapParams.none()
    ): ModelPriceMapRetrieveModelPriceMapResponse =
        retrieveModelPriceMap(params, RequestOptions.none())

    /** @see retrieveModelPriceMap */
    fun retrieveModelPriceMap(
        requestOptions: RequestOptions
    ): ModelPriceMapRetrieveModelPriceMapResponse =
        retrieveModelPriceMap(ModelPriceMapRetrieveModelPriceMapParams.none(), requestOptions)

    /**
     * A view of [ModelPriceMapService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ModelPriceMapService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /api/v1/model-price-map/{id}`, but is otherwise the
         * same as [ModelPriceMapService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: ModelPriceMapUpdateParams,
        ): HttpResponseFor<ModelPriceMapUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: ModelPriceMapUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelPriceMapUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: ModelPriceMapUpdateParams
        ): HttpResponseFor<ModelPriceMapUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ModelPriceMapUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelPriceMapUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /api/v1/model-price-map/{id}`, but is otherwise
         * the same as [ModelPriceMapService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<ModelPriceMapDeleteResponse> =
            delete(id, ModelPriceMapDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ModelPriceMapDeleteParams = ModelPriceMapDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelPriceMapDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ModelPriceMapDeleteParams = ModelPriceMapDeleteParams.none(),
        ): HttpResponseFor<ModelPriceMapDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ModelPriceMapDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelPriceMapDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ModelPriceMapDeleteParams
        ): HttpResponseFor<ModelPriceMapDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelPriceMapDeleteResponse> =
            delete(id, ModelPriceMapDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/model-price-map`, but is otherwise the same
         * as [ModelPriceMapService.modelPriceMap].
         */
        @MustBeClosed
        fun modelPriceMap(
            params: ModelPriceMapModelPriceMapParams
        ): HttpResponseFor<ModelPriceMapModelPriceMapResponse> =
            modelPriceMap(params, RequestOptions.none())

        /** @see modelPriceMap */
        @MustBeClosed
        fun modelPriceMap(
            params: ModelPriceMapModelPriceMapParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelPriceMapModelPriceMapResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/model-price-map`, but is otherwise the same
         * as [ModelPriceMapService.retrieveModelPriceMap].
         */
        @MustBeClosed
        fun retrieveModelPriceMap(): HttpResponseFor<ModelPriceMapRetrieveModelPriceMapResponse> =
            retrieveModelPriceMap(ModelPriceMapRetrieveModelPriceMapParams.none())

        /** @see retrieveModelPriceMap */
        @MustBeClosed
        fun retrieveModelPriceMap(
            params: ModelPriceMapRetrieveModelPriceMapParams =
                ModelPriceMapRetrieveModelPriceMapParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelPriceMapRetrieveModelPriceMapResponse>

        /** @see retrieveModelPriceMap */
        @MustBeClosed
        fun retrieveModelPriceMap(
            params: ModelPriceMapRetrieveModelPriceMapParams =
                ModelPriceMapRetrieveModelPriceMapParams.none()
        ): HttpResponseFor<ModelPriceMapRetrieveModelPriceMapResponse> =
            retrieveModelPriceMap(params, RequestOptions.none())

        /** @see retrieveModelPriceMap */
        @MustBeClosed
        fun retrieveModelPriceMap(
            requestOptions: RequestOptions
        ): HttpResponseFor<ModelPriceMapRetrieveModelPriceMapResponse> =
            retrieveModelPriceMap(ModelPriceMapRetrieveModelPriceMapParams.none(), requestOptions)
    }
}
