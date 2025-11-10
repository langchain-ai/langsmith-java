// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.feedback.FeedbackCreateParams
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import com.langchain.smith.models.feedback.FeedbackDeleteParams
import com.langchain.smith.models.feedback.FeedbackDeleteResponse
import com.langchain.smith.models.feedback.FeedbackListParams
import com.langchain.smith.models.feedback.FeedbackRetrieveParams
import com.langchain.smith.models.feedback.FeedbackSchema
import com.langchain.smith.models.feedback.FeedbackUpdateParams
import com.langchain.smith.services.blocking.feedback.TokenService
import java.util.function.Consumer

interface FeedbackService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackService

    fun tokens(): TokenService

    /** Create a new feedback. */
    fun create(params: FeedbackCreateParams): FeedbackSchema = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FeedbackCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackSchema

    /** @see create */
    fun create(
        feedbackCreateSchema: FeedbackCreateSchema,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackSchema =
        create(
            FeedbackCreateParams.builder().feedbackCreateSchema(feedbackCreateSchema).build(),
            requestOptions,
        )

    /** @see create */
    fun create(feedbackCreateSchema: FeedbackCreateSchema): FeedbackSchema =
        create(feedbackCreateSchema, RequestOptions.none())

    /** Get a specific feedback. */
    fun retrieve(feedbackId: String): FeedbackSchema =
        retrieve(feedbackId, FeedbackRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        feedbackId: String,
        params: FeedbackRetrieveParams = FeedbackRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackSchema = retrieve(params.toBuilder().feedbackId(feedbackId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        feedbackId: String,
        params: FeedbackRetrieveParams = FeedbackRetrieveParams.none(),
    ): FeedbackSchema = retrieve(feedbackId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FeedbackRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackSchema

    /** @see retrieve */
    fun retrieve(params: FeedbackRetrieveParams): FeedbackSchema =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(feedbackId: String, requestOptions: RequestOptions): FeedbackSchema =
        retrieve(feedbackId, FeedbackRetrieveParams.none(), requestOptions)

    /** Replace an existing feedback entry with a new, modified entry. */
    fun update(feedbackId: String): FeedbackSchema = update(feedbackId, FeedbackUpdateParams.none())

    /** @see update */
    fun update(
        feedbackId: String,
        params: FeedbackUpdateParams = FeedbackUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackSchema = update(params.toBuilder().feedbackId(feedbackId).build(), requestOptions)

    /** @see update */
    fun update(
        feedbackId: String,
        params: FeedbackUpdateParams = FeedbackUpdateParams.none(),
    ): FeedbackSchema = update(feedbackId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FeedbackUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackSchema

    /** @see update */
    fun update(params: FeedbackUpdateParams): FeedbackSchema = update(params, RequestOptions.none())

    /** @see update */
    fun update(feedbackId: String, requestOptions: RequestOptions): FeedbackSchema =
        update(feedbackId, FeedbackUpdateParams.none(), requestOptions)

    /** List all Feedback by query params. */
    fun list(): List<FeedbackSchema> = list(FeedbackListParams.none())

    /** @see list */
    fun list(
        params: FeedbackListParams = FeedbackListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FeedbackSchema>

    /** @see list */
    fun list(params: FeedbackListParams = FeedbackListParams.none()): List<FeedbackSchema> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<FeedbackSchema> =
        list(FeedbackListParams.none(), requestOptions)

    /** Delete a feedback. */
    fun delete(feedbackId: String): FeedbackDeleteResponse =
        delete(feedbackId, FeedbackDeleteParams.none())

    /** @see delete */
    fun delete(
        feedbackId: String,
        params: FeedbackDeleteParams = FeedbackDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackDeleteResponse =
        delete(params.toBuilder().feedbackId(feedbackId).build(), requestOptions)

    /** @see delete */
    fun delete(
        feedbackId: String,
        params: FeedbackDeleteParams = FeedbackDeleteParams.none(),
    ): FeedbackDeleteResponse = delete(feedbackId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FeedbackDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FeedbackDeleteResponse

    /** @see delete */
    fun delete(params: FeedbackDeleteParams): FeedbackDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(feedbackId: String, requestOptions: RequestOptions): FeedbackDeleteResponse =
        delete(feedbackId, FeedbackDeleteParams.none(), requestOptions)

    /** A view of [FeedbackService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackService.WithRawResponse

        fun tokens(): TokenService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/feedback`, but is otherwise the same as
         * [FeedbackService.create].
         */
        @MustBeClosed
        fun create(params: FeedbackCreateParams): HttpResponseFor<FeedbackSchema> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FeedbackCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackSchema>

        /** @see create */
        @MustBeClosed
        fun create(
            feedbackCreateSchema: FeedbackCreateSchema,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackSchema> =
            create(
                FeedbackCreateParams.builder().feedbackCreateSchema(feedbackCreateSchema).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(feedbackCreateSchema: FeedbackCreateSchema): HttpResponseFor<FeedbackSchema> =
            create(feedbackCreateSchema, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /api/v1/feedback/{feedback_id}`, but is otherwise
         * the same as [FeedbackService.retrieve].
         */
        @MustBeClosed
        fun retrieve(feedbackId: String): HttpResponseFor<FeedbackSchema> =
            retrieve(feedbackId, FeedbackRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            feedbackId: String,
            params: FeedbackRetrieveParams = FeedbackRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackSchema> =
            retrieve(params.toBuilder().feedbackId(feedbackId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            feedbackId: String,
            params: FeedbackRetrieveParams = FeedbackRetrieveParams.none(),
        ): HttpResponseFor<FeedbackSchema> = retrieve(feedbackId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FeedbackRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackSchema>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FeedbackRetrieveParams): HttpResponseFor<FeedbackSchema> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            feedbackId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackSchema> =
            retrieve(feedbackId, FeedbackRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/feedback/{feedback_id}`, but is otherwise
         * the same as [FeedbackService.update].
         */
        @MustBeClosed
        fun update(feedbackId: String): HttpResponseFor<FeedbackSchema> =
            update(feedbackId, FeedbackUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            feedbackId: String,
            params: FeedbackUpdateParams = FeedbackUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackSchema> =
            update(params.toBuilder().feedbackId(feedbackId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            feedbackId: String,
            params: FeedbackUpdateParams = FeedbackUpdateParams.none(),
        ): HttpResponseFor<FeedbackSchema> = update(feedbackId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FeedbackUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackSchema>

        /** @see update */
        @MustBeClosed
        fun update(params: FeedbackUpdateParams): HttpResponseFor<FeedbackSchema> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            feedbackId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackSchema> =
            update(feedbackId, FeedbackUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/feedback`, but is otherwise the same as
         * [FeedbackService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<FeedbackSchema>> = list(FeedbackListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FeedbackListParams = FeedbackListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FeedbackSchema>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: FeedbackListParams = FeedbackListParams.none()
        ): HttpResponseFor<List<FeedbackSchema>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<FeedbackSchema>> =
            list(FeedbackListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/feedback/{feedback_id}`, but is otherwise
         * the same as [FeedbackService.delete].
         */
        @MustBeClosed
        fun delete(feedbackId: String): HttpResponseFor<FeedbackDeleteResponse> =
            delete(feedbackId, FeedbackDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            feedbackId: String,
            params: FeedbackDeleteParams = FeedbackDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackDeleteResponse> =
            delete(params.toBuilder().feedbackId(feedbackId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            feedbackId: String,
            params: FeedbackDeleteParams = FeedbackDeleteParams.none(),
        ): HttpResponseFor<FeedbackDeleteResponse> =
            delete(feedbackId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FeedbackDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FeedbackDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: FeedbackDeleteParams): HttpResponseFor<FeedbackDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            feedbackId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackDeleteResponse> =
            delete(feedbackId, FeedbackDeleteParams.none(), requestOptions)
    }
}
