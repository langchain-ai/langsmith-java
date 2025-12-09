// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.feedback.FeedbackCreateParams
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import com.langchain.smith.models.feedback.FeedbackDeleteParams
import com.langchain.smith.models.feedback.FeedbackDeleteResponse
import com.langchain.smith.models.feedback.FeedbackListPageAsync
import com.langchain.smith.models.feedback.FeedbackListParams
import com.langchain.smith.models.feedback.FeedbackRetrieveParams
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.models.feedback.FeedbackUpdateParams
import com.langchain.smith.services.async.feedback.ConfigServiceAsync
import com.langchain.smith.services.async.feedback.TokenServiceAsync
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

    fun tokens(): TokenServiceAsync

    fun configs(): ConfigServiceAsync

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
    fun list(): CompletableFuture<FeedbackListPageAsync> = list(FeedbackListParams.none())

    /** @see list */
    fun list(
        params: FeedbackListParams = FeedbackListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FeedbackListPageAsync>

    /** @see list */
    fun list(
        params: FeedbackListParams = FeedbackListParams.none()
    ): CompletableFuture<FeedbackListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<FeedbackListPageAsync> =
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

        fun tokens(): TokenServiceAsync.WithRawResponse

        fun configs(): ConfigServiceAsync.WithRawResponse

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
        fun list(): CompletableFuture<HttpResponseFor<FeedbackListPageAsync>> =
            list(FeedbackListParams.none())

        /** @see list */
        fun list(
            params: FeedbackListParams = FeedbackListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FeedbackListPageAsync>>

        /** @see list */
        fun list(
            params: FeedbackListParams = FeedbackListParams.none()
        ): CompletableFuture<HttpResponseFor<FeedbackListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FeedbackListPageAsync>> =
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
    }
}
