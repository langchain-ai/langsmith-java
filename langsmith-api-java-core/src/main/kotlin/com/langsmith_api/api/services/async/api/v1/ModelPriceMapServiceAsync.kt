// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ModelPriceMapServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelPriceMapServiceAsync

    /** Update Model Price */
    fun update(
        id: String,
        params: ModelPriceMapUpdateParams,
    ): CompletableFuture<ModelPriceMapUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: ModelPriceMapUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelPriceMapUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: ModelPriceMapUpdateParams): CompletableFuture<ModelPriceMapUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ModelPriceMapUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelPriceMapUpdateResponse>

    /** Delete Model Price */
    fun delete(id: String): CompletableFuture<ModelPriceMapDeleteResponse> =
        delete(id, ModelPriceMapDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ModelPriceMapDeleteParams = ModelPriceMapDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelPriceMapDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ModelPriceMapDeleteParams = ModelPriceMapDeleteParams.none(),
    ): CompletableFuture<ModelPriceMapDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ModelPriceMapDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelPriceMapDeleteResponse>

    /** @see delete */
    fun delete(params: ModelPriceMapDeleteParams): CompletableFuture<ModelPriceMapDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ModelPriceMapDeleteResponse> =
        delete(id, ModelPriceMapDeleteParams.none(), requestOptions)

    /** Create New Model Price */
    fun modelPriceMap(
        params: ModelPriceMapModelPriceMapParams
    ): CompletableFuture<ModelPriceMapModelPriceMapResponse> =
        modelPriceMap(params, RequestOptions.none())

    /** @see modelPriceMap */
    fun modelPriceMap(
        params: ModelPriceMapModelPriceMapParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelPriceMapModelPriceMapResponse>

    /** Read Model Price Map */
    fun retrieveModelPriceMap(): CompletableFuture<ModelPriceMapRetrieveModelPriceMapResponse> =
        retrieveModelPriceMap(ModelPriceMapRetrieveModelPriceMapParams.none())

    /** @see retrieveModelPriceMap */
    fun retrieveModelPriceMap(
        params: ModelPriceMapRetrieveModelPriceMapParams =
            ModelPriceMapRetrieveModelPriceMapParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelPriceMapRetrieveModelPriceMapResponse>

    /** @see retrieveModelPriceMap */
    fun retrieveModelPriceMap(
        params: ModelPriceMapRetrieveModelPriceMapParams =
            ModelPriceMapRetrieveModelPriceMapParams.none()
    ): CompletableFuture<ModelPriceMapRetrieveModelPriceMapResponse> =
        retrieveModelPriceMap(params, RequestOptions.none())

    /** @see retrieveModelPriceMap */
    fun retrieveModelPriceMap(
        requestOptions: RequestOptions
    ): CompletableFuture<ModelPriceMapRetrieveModelPriceMapResponse> =
        retrieveModelPriceMap(ModelPriceMapRetrieveModelPriceMapParams.none(), requestOptions)

    /**
     * A view of [ModelPriceMapServiceAsync] that provides access to raw HTTP responses for each
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
        ): ModelPriceMapServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /api/v1/model-price-map/{id}`, but is otherwise the
         * same as [ModelPriceMapServiceAsync.update].
         */
        fun update(
            id: String,
            params: ModelPriceMapUpdateParams,
        ): CompletableFuture<HttpResponseFor<ModelPriceMapUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: ModelPriceMapUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelPriceMapUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: ModelPriceMapUpdateParams
        ): CompletableFuture<HttpResponseFor<ModelPriceMapUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ModelPriceMapUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelPriceMapUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/model-price-map/{id}`, but is otherwise
         * the same as [ModelPriceMapServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<ModelPriceMapDeleteResponse>> =
            delete(id, ModelPriceMapDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: ModelPriceMapDeleteParams = ModelPriceMapDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelPriceMapDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: ModelPriceMapDeleteParams = ModelPriceMapDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ModelPriceMapDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ModelPriceMapDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelPriceMapDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ModelPriceMapDeleteParams
        ): CompletableFuture<HttpResponseFor<ModelPriceMapDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ModelPriceMapDeleteResponse>> =
            delete(id, ModelPriceMapDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/model-price-map`, but is otherwise the same
         * as [ModelPriceMapServiceAsync.modelPriceMap].
         */
        fun modelPriceMap(
            params: ModelPriceMapModelPriceMapParams
        ): CompletableFuture<HttpResponseFor<ModelPriceMapModelPriceMapResponse>> =
            modelPriceMap(params, RequestOptions.none())

        /** @see modelPriceMap */
        fun modelPriceMap(
            params: ModelPriceMapModelPriceMapParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelPriceMapModelPriceMapResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/model-price-map`, but is otherwise the same
         * as [ModelPriceMapServiceAsync.retrieveModelPriceMap].
         */
        fun retrieveModelPriceMap():
            CompletableFuture<HttpResponseFor<ModelPriceMapRetrieveModelPriceMapResponse>> =
            retrieveModelPriceMap(ModelPriceMapRetrieveModelPriceMapParams.none())

        /** @see retrieveModelPriceMap */
        fun retrieveModelPriceMap(
            params: ModelPriceMapRetrieveModelPriceMapParams =
                ModelPriceMapRetrieveModelPriceMapParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelPriceMapRetrieveModelPriceMapResponse>>

        /** @see retrieveModelPriceMap */
        fun retrieveModelPriceMap(
            params: ModelPriceMapRetrieveModelPriceMapParams =
                ModelPriceMapRetrieveModelPriceMapParams.none()
        ): CompletableFuture<HttpResponseFor<ModelPriceMapRetrieveModelPriceMapResponse>> =
            retrieveModelPriceMap(params, RequestOptions.none())

        /** @see retrieveModelPriceMap */
        fun retrieveModelPriceMap(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ModelPriceMapRetrieveModelPriceMapResponse>> =
            retrieveModelPriceMap(ModelPriceMapRetrieveModelPriceMapParams.none(), requestOptions)
    }
}
