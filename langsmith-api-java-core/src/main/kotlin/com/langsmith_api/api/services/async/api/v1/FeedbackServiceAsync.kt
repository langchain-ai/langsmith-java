// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.feedback.FeedbackCreateParams
import com.langsmith_api.api.models.api.v1.feedback.FeedbackCreateSchema
import com.langsmith_api.api.models.api.v1.feedback.FeedbackDeleteParams
import com.langsmith_api.api.models.api.v1.feedback.FeedbackDeleteResponse
import com.langsmith_api.api.models.api.v1.feedback.FeedbackEagerParams
import com.langsmith_api.api.models.api.v1.feedback.FeedbackListParams
import com.langsmith_api.api.models.api.v1.feedback.FeedbackRetrieveParams
import com.langsmith_api.api.models.api.v1.feedback.FeedbackSchema
import com.langsmith_api.api.models.api.v1.feedback.FeedbackUpdateParams
import com.langsmith_api.api.services.async.api.v1.feedback.FormulaServiceAsync
import com.langsmith_api.api.services.async.api.v1.feedback.TokenServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FeedbackServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackServiceAsync

    fun formulas(): FormulaServiceAsync

    fun tokens(): TokenServiceAsync

    /** Create a new feedback. */
    fun create(params: FeedbackCreateParams): CompletableFuture<FeedbackSchema> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FeedbackCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackSchema>

    /** @see create */
    fun create(
        feedbackCreateSchema: FeedbackCreateSchema,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackSchema> =
        create(
            FeedbackCreateParams.builder().feedbackCreateSchema(feedbackCreateSchema).build(),
            requestOptions,
        )

    /** @see create */
    fun create(feedbackCreateSchema: FeedbackCreateSchema): CompletableFuture<FeedbackSchema> =
        create(feedbackCreateSchema, RequestOptions.none())

    /** Get a specific feedback. */
    fun retrieve(feedbackId: String): CompletableFuture<FeedbackSchema> =
        retrieve(feedbackId, FeedbackRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        feedbackId: String,
        params: FeedbackRetrieveParams = FeedbackRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackSchema> =
        retrieve(params.toBuilder().feedbackId(feedbackId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        feedbackId: String,
        params: FeedbackRetrieveParams = FeedbackRetrieveParams.none(),
    ): CompletableFuture<FeedbackSchema> = retrieve(feedbackId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FeedbackRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackSchema>

    /** @see retrieve */
    fun retrieve(params: FeedbackRetrieveParams): CompletableFuture<FeedbackSchema> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        feedbackId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackSchema> =
        retrieve(feedbackId, FeedbackRetrieveParams.none(), requestOptions)

    /** Replace an existing feedback entry with a new, modified entry. */
    fun update(feedbackId: String): CompletableFuture<FeedbackSchema> =
        update(feedbackId, FeedbackUpdateParams.none())

    /** @see update */
    fun update(
        feedbackId: String,
        params: FeedbackUpdateParams = FeedbackUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackSchema> =
        update(params.toBuilder().feedbackId(feedbackId).build(), requestOptions)

    /** @see update */
    fun update(
        feedbackId: String,
        params: FeedbackUpdateParams = FeedbackUpdateParams.none(),
    ): CompletableFuture<FeedbackSchema> = update(feedbackId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FeedbackUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackSchema>

    /** @see update */
    fun update(params: FeedbackUpdateParams): CompletableFuture<FeedbackSchema> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        feedbackId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackSchema> =
        update(feedbackId, FeedbackUpdateParams.none(), requestOptions)

    /** List all Feedback by query params. */
    fun list(): CompletableFuture<List<FeedbackSchema>> = list(FeedbackListParams.none())

    /** @see list */
    fun list(
        params: FeedbackListParams = FeedbackListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FeedbackSchema>>

    /** @see list */
    fun list(
        params: FeedbackListParams = FeedbackListParams.none()
    ): CompletableFuture<List<FeedbackSchema>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<FeedbackSchema>> =
        list(FeedbackListParams.none(), requestOptions)

    /** Delete a feedback. */
    fun delete(feedbackId: String): CompletableFuture<FeedbackDeleteResponse> =
        delete(feedbackId, FeedbackDeleteParams.none())

    /** @see delete */
    fun delete(
        feedbackId: String,
        params: FeedbackDeleteParams = FeedbackDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackDeleteResponse> =
        delete(params.toBuilder().feedbackId(feedbackId).build(), requestOptions)

    /** @see delete */
    fun delete(
        feedbackId: String,
        params: FeedbackDeleteParams = FeedbackDeleteParams.none(),
    ): CompletableFuture<FeedbackDeleteResponse> = delete(feedbackId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FeedbackDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackDeleteResponse>

    /** @see delete */
    fun delete(params: FeedbackDeleteParams): CompletableFuture<FeedbackDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        feedbackId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackDeleteResponse> =
        delete(feedbackId, FeedbackDeleteParams.none(), requestOptions)

    /**
     * Create a new feedback.
     *
     * This method is invoked under the assumption that the run is already visible in the app, thus
     * already present in DB
     */
    fun eager(params: FeedbackEagerParams): CompletableFuture<FeedbackSchema> =
        eager(params, RequestOptions.none())

    /** @see eager */
    fun eager(
        params: FeedbackEagerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackSchema>

    /** @see eager */
    fun eager(
        feedbackCreateSchema: FeedbackCreateSchema,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackSchema> =
        eager(
            FeedbackEagerParams.builder().feedbackCreateSchema(feedbackCreateSchema).build(),
            requestOptions,
        )

    /** @see eager */
    fun eager(feedbackCreateSchema: FeedbackCreateSchema): CompletableFuture<FeedbackSchema> =
        eager(feedbackCreateSchema, RequestOptions.none())

    /**
     * A view of [FeedbackServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackServiceAsync.WithRawResponse

        fun formulas(): FormulaServiceAsync.WithRawResponse

        fun tokens(): TokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/feedback`, but is otherwise the same as
         * [FeedbackServiceAsync.create].
         */
        fun create(
            params: FeedbackCreateParams
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FeedbackCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>>

        /** @see create */
        fun create(
            feedbackCreateSchema: FeedbackCreateSchema,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            create(
                FeedbackCreateParams.builder().feedbackCreateSchema(feedbackCreateSchema).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            feedbackCreateSchema: FeedbackCreateSchema
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            create(feedbackCreateSchema, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v1/feedback/{feedback_id}`, but is otherwise
         * the same as [FeedbackServiceAsync.retrieve].
         */
        fun retrieve(feedbackId: String): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            retrieve(feedbackId, FeedbackRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            feedbackId: String,
            params: FeedbackRetrieveParams = FeedbackRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            retrieve(params.toBuilder().feedbackId(feedbackId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            feedbackId: String,
            params: FeedbackRetrieveParams = FeedbackRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            retrieve(feedbackId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FeedbackRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>>

        /** @see retrieve */
        fun retrieve(
            params: FeedbackRetrieveParams
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            feedbackId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            retrieve(feedbackId, FeedbackRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/feedback/{feedback_id}`, but is otherwise
         * the same as [FeedbackServiceAsync.update].
         */
        fun update(feedbackId: String): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            update(feedbackId, FeedbackUpdateParams.none())

        /** @see update */
        fun update(
            feedbackId: String,
            params: FeedbackUpdateParams = FeedbackUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            update(params.toBuilder().feedbackId(feedbackId).build(), requestOptions)

        /** @see update */
        fun update(
            feedbackId: String,
            params: FeedbackUpdateParams = FeedbackUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            update(feedbackId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FeedbackUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>>

        /** @see update */
        fun update(
            params: FeedbackUpdateParams
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            feedbackId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            update(feedbackId, FeedbackUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/feedback`, but is otherwise the same as
         * [FeedbackServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>> =
            list(FeedbackListParams.none())

        /** @see list */
        fun list(
            params: FeedbackListParams = FeedbackListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>>

        /** @see list */
        fun list(
            params: FeedbackListParams = FeedbackListParams.none()
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>> =
            list(FeedbackListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/feedback/{feedback_id}`, but is otherwise
         * the same as [FeedbackServiceAsync.delete].
         */
        fun delete(feedbackId: String): CompletableFuture<HttpResponseFor<FeedbackDeleteResponse>> =
            delete(feedbackId, FeedbackDeleteParams.none())

        /** @see delete */
        fun delete(
            feedbackId: String,
            params: FeedbackDeleteParams = FeedbackDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackDeleteResponse>> =
            delete(params.toBuilder().feedbackId(feedbackId).build(), requestOptions)

        /** @see delete */
        fun delete(
            feedbackId: String,
            params: FeedbackDeleteParams = FeedbackDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackDeleteResponse>> =
            delete(feedbackId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FeedbackDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackDeleteResponse>>

        /** @see delete */
        fun delete(
            params: FeedbackDeleteParams
        ): CompletableFuture<HttpResponseFor<FeedbackDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            feedbackId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackDeleteResponse>> =
            delete(feedbackId, FeedbackDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/feedback/eager`, but is otherwise the same
         * as [FeedbackServiceAsync.eager].
         */
        fun eager(params: FeedbackEagerParams): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            eager(params, RequestOptions.none())

        /** @see eager */
        fun eager(
            params: FeedbackEagerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>>

        /** @see eager */
        fun eager(
            feedbackCreateSchema: FeedbackCreateSchema,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            eager(
                FeedbackEagerParams.builder().feedbackCreateSchema(feedbackCreateSchema).build(),
                requestOptions,
            )

        /** @see eager */
        fun eager(
            feedbackCreateSchema: FeedbackCreateSchema
        ): CompletableFuture<HttpResponseFor<FeedbackSchema>> =
            eager(feedbackCreateSchema, RequestOptions.none())
    }
}
