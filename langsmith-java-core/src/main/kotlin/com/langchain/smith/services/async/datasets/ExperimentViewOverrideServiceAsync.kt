// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.datasets.experimentviewoverrides.ExperimentViewOverride
import com.langchain.smith.models.datasets.experimentviewoverrides.ExperimentViewOverrideCreateParams
import com.langchain.smith.models.datasets.experimentviewoverrides.ExperimentViewOverrideDeleteParams
import com.langchain.smith.models.datasets.experimentviewoverrides.ExperimentViewOverrideListParams
import com.langchain.smith.models.datasets.experimentviewoverrides.ExperimentViewOverrideRetrieveParams
import com.langchain.smith.models.datasets.experimentviewoverrides.ExperimentViewOverrideUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExperimentViewOverrideServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExperimentViewOverrideServiceAsync

    /**
     * Creates a new experiment view override configuration for a dataset with column display
     * settings. This endpoint allows you to customize how experiment results are displayed by
     * configuring column-specific overrides including colors, precision, and visibility.
     *
     * The request must include a 'column_overrides' array with at least one override configuration.
     * Each column override can specify:
     * - column: Required field name (must start with inputs, outputs, reference_outputs, feedback,
     *   metrics, attachments, or metadata)
     * - color_gradient: Optional array of [number, color] tuples for numeric data visualization
     * - precision: Optional number (1-6) for decimal places in numeric columns
     * - hide: Optional boolean to control column visibility
     *
     * Example request body: { "column_overrides":
     * [ { "column": "outputs.accuracy", "color_gradient": [[0.0, "#ff0000"], [0.5, "#ffff00"],
     * [1.0, "#00ff00"]], "precision": 3 }, { "column": "inputs.model_type", "hide": false } ] }
     *
     * This operation fails if an override already exists for the dataset (use PATCH to update).
     */
    fun create(
        datasetId: JsonValue,
        params: ExperimentViewOverrideCreateParams,
    ): CompletableFuture<ExperimentViewOverride> = create(datasetId, params, RequestOptions.none())

    /** @see create */
    fun create(
        datasetId: JsonValue,
        params: ExperimentViewOverrideCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExperimentViewOverride> =
        create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see create */
    fun create(
        params: ExperimentViewOverrideCreateParams
    ): CompletableFuture<ExperimentViewOverride> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExperimentViewOverrideCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExperimentViewOverride>

    /**
     * Retrieves a specific experiment view override configuration using both dataset ID and
     * override ID. This endpoint provides more precise access to experiment view overrides when you
     * have the specific override ID, useful for direct links or cached references.
     *
     * The response includes the same column override information as the dataset-level endpoint:
     * - Column identifiers with validation prefixes
     * - Color gradient settings for numeric data visualization
     * - Numeric precision configurations
     * - Column visibility controls
     *
     * Both the dataset and override must exist and be accessible by the authenticated user.
     */
    fun retrieve(
        id: JsonValue,
        params: ExperimentViewOverrideRetrieveParams,
    ): CompletableFuture<ExperimentViewOverride> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: JsonValue,
        params: ExperimentViewOverrideRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExperimentViewOverride> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ExperimentViewOverrideRetrieveParams
    ): CompletableFuture<ExperimentViewOverride> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ExperimentViewOverrideRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExperimentViewOverride>

    /**
     * Updates an existing experiment view override configuration by completely replacing the column
     * overrides for the specified dataset and override ID.
     *
     * This endpoint performs a complete replacement of the column overrides configuration. All
     * existing column overrides will be replaced with the new configuration provided in the request
     * body. To add or modify individual columns, include the complete desired configuration in the
     * request.
     *
     * The request format is identical to the create endpoint:
     * - column_overrides: Required array with at least one override configuration
     * - Each override can specify color gradients, precision, and visibility
     *
     * Example request body: { "column_overrides":
     * [ { "column": "metrics.f1_score", "color_gradient": [[0.0, "#ff4444"], [0.8, "#44ff44"]],
     * "precision": 4 }, { "column": "feedback.rating", "hide": false } ] }
     *
     * Both the dataset and override must exist and be accessible by the authenticated user.
     */
    fun update(
        id: JsonValue,
        params: ExperimentViewOverrideUpdateParams,
    ): CompletableFuture<ExperimentViewOverride> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: JsonValue,
        params: ExperimentViewOverrideUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExperimentViewOverride> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: ExperimentViewOverrideUpdateParams
    ): CompletableFuture<ExperimentViewOverride> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ExperimentViewOverrideUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExperimentViewOverride>

    /**
     * Retrieves all experiment view override configurations for a specific dataset. This endpoint
     * returns column display overrides including color gradients, precision settings, and column
     * visibility configurations that customize how experiment results are displayed in the UI.
     *
     * The response includes all column overrides with their display settings:
     * - Column identifiers (must start with inputs, outputs, reference_outputs, feedback, metrics,
     *   attachments, or metadata)
     * - Color gradients for numeric data visualization
     * - Precision settings for numeric columns (1-6 decimal places)
     * - Hide flags to control column visibility
     */
    fun list(datasetId: JsonValue): CompletableFuture<List<ExperimentViewOverride>> =
        list(datasetId, ExperimentViewOverrideListParams.none())

    /** @see list */
    fun list(
        datasetId: JsonValue,
        params: ExperimentViewOverrideListParams = ExperimentViewOverrideListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ExperimentViewOverride>> =
        list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see list */
    fun list(
        datasetId: JsonValue,
        params: ExperimentViewOverrideListParams = ExperimentViewOverrideListParams.none(),
    ): CompletableFuture<List<ExperimentViewOverride>> =
        list(datasetId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ExperimentViewOverrideListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ExperimentViewOverride>>

    /** @see list */
    fun list(
        params: ExperimentViewOverrideListParams
    ): CompletableFuture<List<ExperimentViewOverride>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        datasetId: JsonValue,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<ExperimentViewOverride>> =
        list(datasetId, ExperimentViewOverrideListParams.none(), requestOptions)

    /**
     * Permanently deletes an experiment view override configuration for a dataset. This operation
     * removes all column override settings including color gradients, precision configurations, and
     * visibility settings.
     *
     * After deletion, the experiment view will revert to default column display settings. This
     * action cannot be undone - you will need to recreate the override configuration if you want to
     * restore custom column settings.
     *
     * Both the dataset and override must exist and be accessible by the authenticated user. The
     * operation will fail if the override doesn't exist or if the user doesn't have appropriate
     * permissions for the dataset.
     */
    fun delete(
        id: JsonValue,
        params: ExperimentViewOverrideDeleteParams,
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: JsonValue,
        params: ExperimentViewOverrideDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: ExperimentViewOverrideDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ExperimentViewOverrideDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [ExperimentViewOverrideServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExperimentViewOverrideServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /datasets/{dataset_id}/experiment-view-overrides`,
         * but is otherwise the same as [ExperimentViewOverrideServiceAsync.create].
         */
        fun create(
            datasetId: JsonValue,
            params: ExperimentViewOverrideCreateParams,
        ): CompletableFuture<HttpResponseFor<ExperimentViewOverride>> =
            create(datasetId, params, RequestOptions.none())

        /** @see create */
        fun create(
            datasetId: JsonValue,
            params: ExperimentViewOverrideCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentViewOverride>> =
            create(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ExperimentViewOverrideCreateParams
        ): CompletableFuture<HttpResponseFor<ExperimentViewOverride>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ExperimentViewOverrideCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentViewOverride>>

        /**
         * Returns a raw HTTP response for `get
         * /datasets/{dataset_id}/experiment-view-overrides/{id}`, but is otherwise the same as
         * [ExperimentViewOverrideServiceAsync.retrieve].
         */
        fun retrieve(
            id: JsonValue,
            params: ExperimentViewOverrideRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ExperimentViewOverride>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: JsonValue,
            params: ExperimentViewOverrideRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentViewOverride>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: ExperimentViewOverrideRetrieveParams
        ): CompletableFuture<HttpResponseFor<ExperimentViewOverride>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ExperimentViewOverrideRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentViewOverride>>

        /**
         * Returns a raw HTTP response for `patch
         * /datasets/{dataset_id}/experiment-view-overrides/{id}`, but is otherwise the same as
         * [ExperimentViewOverrideServiceAsync.update].
         */
        fun update(
            id: JsonValue,
            params: ExperimentViewOverrideUpdateParams,
        ): CompletableFuture<HttpResponseFor<ExperimentViewOverride>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: JsonValue,
            params: ExperimentViewOverrideUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentViewOverride>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: ExperimentViewOverrideUpdateParams
        ): CompletableFuture<HttpResponseFor<ExperimentViewOverride>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ExperimentViewOverrideUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExperimentViewOverride>>

        /**
         * Returns a raw HTTP response for `get /datasets/{dataset_id}/experiment-view-overrides`,
         * but is otherwise the same as [ExperimentViewOverrideServiceAsync.list].
         */
        fun list(
            datasetId: JsonValue
        ): CompletableFuture<HttpResponseFor<List<ExperimentViewOverride>>> =
            list(datasetId, ExperimentViewOverrideListParams.none())

        /** @see list */
        fun list(
            datasetId: JsonValue,
            params: ExperimentViewOverrideListParams = ExperimentViewOverrideListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ExperimentViewOverride>>> =
            list(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see list */
        fun list(
            datasetId: JsonValue,
            params: ExperimentViewOverrideListParams = ExperimentViewOverrideListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<ExperimentViewOverride>>> =
            list(datasetId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ExperimentViewOverrideListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ExperimentViewOverride>>>

        /** @see list */
        fun list(
            params: ExperimentViewOverrideListParams
        ): CompletableFuture<HttpResponseFor<List<ExperimentViewOverride>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            datasetId: JsonValue,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ExperimentViewOverride>>> =
            list(datasetId, ExperimentViewOverrideListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /datasets/{dataset_id}/experiment-view-overrides/{id}`, but is otherwise the same as
         * [ExperimentViewOverrideServiceAsync.delete].
         */
        fun delete(
            id: JsonValue,
            params: ExperimentViewOverrideDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: JsonValue,
            params: ExperimentViewOverrideDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(params: ExperimentViewOverrideDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ExperimentViewOverrideDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
