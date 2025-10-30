// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.public_

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.feedback.FeedbackSchema
import com.langsmith_api.api.models.api.v1.public_.datasets.DatasetListParams
import com.langsmith_api.api.models.api.v1.public_.datasets.DatasetListResponse
import com.langsmith_api.api.models.api.v1.public_.datasets.DatasetRetrieveComparativeParams
import com.langsmith_api.api.models.api.v1.public_.datasets.DatasetRetrieveComparativeResponse
import com.langsmith_api.api.models.api.v1.public_.datasets.DatasetRetrieveFeedbackParams
import com.langsmith_api.api.models.api.v1.public_.datasets.DatasetRetrieveSessionsBulkParams
import com.langsmith_api.api.models.api.v1.public_.datasets.DatasetRetrieveSessionsParams
import com.langsmith_api.api.models.api.v1.sessions.TracerSession
import com.langsmith_api.api.services.blocking.api.v1.public_.datasets.RunService
import java.util.function.Consumer

interface DatasetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetService

    fun runs(): RunService

    /** Get dataset by ids or the shared dataset if not specifed. */
    fun list(shareToken: String): DatasetListResponse = list(shareToken, DatasetListParams.none())

    /** @see list */
    fun list(
        shareToken: String,
        params: DatasetListParams = DatasetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetListResponse = list(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see list */
    fun list(
        shareToken: String,
        params: DatasetListParams = DatasetListParams.none(),
    ): DatasetListResponse = list(shareToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetListResponse

    /** @see list */
    fun list(params: DatasetListParams): DatasetListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(shareToken: String, requestOptions: RequestOptions): DatasetListResponse =
        list(shareToken, DatasetListParams.none(), requestOptions)

    /** Get all comparative experiments for a given dataset. */
    fun retrieveComparative(shareToken: String): List<DatasetRetrieveComparativeResponse> =
        retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none())

    /** @see retrieveComparative */
    fun retrieveComparative(
        shareToken: String,
        params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<DatasetRetrieveComparativeResponse> =
        retrieveComparative(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveComparative */
    fun retrieveComparative(
        shareToken: String,
        params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
    ): List<DatasetRetrieveComparativeResponse> =
        retrieveComparative(shareToken, params, RequestOptions.none())

    /** @see retrieveComparative */
    fun retrieveComparative(
        params: DatasetRetrieveComparativeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<DatasetRetrieveComparativeResponse>

    /** @see retrieveComparative */
    fun retrieveComparative(
        params: DatasetRetrieveComparativeParams
    ): List<DatasetRetrieveComparativeResponse> = retrieveComparative(params, RequestOptions.none())

    /** @see retrieveComparative */
    fun retrieveComparative(
        shareToken: String,
        requestOptions: RequestOptions,
    ): List<DatasetRetrieveComparativeResponse> =
        retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none(), requestOptions)

    /** Get feedback for runs in projects run over a dataset that has been shared. */
    fun retrieveFeedback(shareToken: String): List<FeedbackSchema> =
        retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none())

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        shareToken: String,
        params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FeedbackSchema> =
        retrieveFeedback(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        shareToken: String,
        params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
    ): List<FeedbackSchema> = retrieveFeedback(shareToken, params, RequestOptions.none())

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        params: DatasetRetrieveFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FeedbackSchema>

    /** @see retrieveFeedback */
    fun retrieveFeedback(params: DatasetRetrieveFeedbackParams): List<FeedbackSchema> =
        retrieveFeedback(params, RequestOptions.none())

    /** @see retrieveFeedback */
    fun retrieveFeedback(shareToken: String, requestOptions: RequestOptions): List<FeedbackSchema> =
        retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none(), requestOptions)

    /** Get projects run on a dataset that has been shared. */
    fun retrieveSessions(shareToken: String): List<TracerSession> =
        retrieveSessions(shareToken, DatasetRetrieveSessionsParams.none())

    /** @see retrieveSessions */
    fun retrieveSessions(
        shareToken: String,
        params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TracerSession> =
        retrieveSessions(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveSessions */
    fun retrieveSessions(
        shareToken: String,
        params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
    ): List<TracerSession> = retrieveSessions(shareToken, params, RequestOptions.none())

    /** @see retrieveSessions */
    fun retrieveSessions(
        params: DatasetRetrieveSessionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TracerSession>

    /** @see retrieveSessions */
    fun retrieveSessions(params: DatasetRetrieveSessionsParams): List<TracerSession> =
        retrieveSessions(params, RequestOptions.none())

    /** @see retrieveSessions */
    fun retrieveSessions(shareToken: String, requestOptions: RequestOptions): List<TracerSession> =
        retrieveSessions(shareToken, DatasetRetrieveSessionsParams.none(), requestOptions)

    /** Get sessions from multiple datasets using share tokens. */
    fun retrieveSessionsBulk(params: DatasetRetrieveSessionsBulkParams): List<TracerSession> =
        retrieveSessionsBulk(params, RequestOptions.none())

    /** @see retrieveSessionsBulk */
    fun retrieveSessionsBulk(
        params: DatasetRetrieveSessionsBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TracerSession>

    /** A view of [DatasetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetService.WithRawResponse

        fun runs(): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets`, but is
         * otherwise the same as [DatasetService.list].
         */
        @MustBeClosed
        fun list(shareToken: String): HttpResponseFor<DatasetListResponse> =
            list(shareToken, DatasetListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            shareToken: String,
            params: DatasetListParams = DatasetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetListResponse> =
            list(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            shareToken: String,
            params: DatasetListParams = DatasetListParams.none(),
        ): HttpResponseFor<DatasetListResponse> = list(shareToken, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DatasetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: DatasetListParams): HttpResponseFor<DatasetListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetListResponse> =
            list(shareToken, DatasetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets/comparative`,
         * but is otherwise the same as [DatasetService.retrieveComparative].
         */
        @MustBeClosed
        fun retrieveComparative(
            shareToken: String
        ): HttpResponseFor<List<DatasetRetrieveComparativeResponse>> =
            retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none())

        /** @see retrieveComparative */
        @MustBeClosed
        fun retrieveComparative(
            shareToken: String,
            params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<DatasetRetrieveComparativeResponse>> =
            retrieveComparative(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveComparative */
        @MustBeClosed
        fun retrieveComparative(
            shareToken: String,
            params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
        ): HttpResponseFor<List<DatasetRetrieveComparativeResponse>> =
            retrieveComparative(shareToken, params, RequestOptions.none())

        /** @see retrieveComparative */
        @MustBeClosed
        fun retrieveComparative(
            params: DatasetRetrieveComparativeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<DatasetRetrieveComparativeResponse>>

        /** @see retrieveComparative */
        @MustBeClosed
        fun retrieveComparative(
            params: DatasetRetrieveComparativeParams
        ): HttpResponseFor<List<DatasetRetrieveComparativeResponse>> =
            retrieveComparative(params, RequestOptions.none())

        /** @see retrieveComparative */
        @MustBeClosed
        fun retrieveComparative(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<DatasetRetrieveComparativeResponse>> =
            retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets/feedback`, but
         * is otherwise the same as [DatasetService.retrieveFeedback].
         */
        @MustBeClosed
        fun retrieveFeedback(shareToken: String): HttpResponseFor<List<FeedbackSchema>> =
            retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none())

        /** @see retrieveFeedback */
        @MustBeClosed
        fun retrieveFeedback(
            shareToken: String,
            params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FeedbackSchema>> =
            retrieveFeedback(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveFeedback */
        @MustBeClosed
        fun retrieveFeedback(
            shareToken: String,
            params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
        ): HttpResponseFor<List<FeedbackSchema>> =
            retrieveFeedback(shareToken, params, RequestOptions.none())

        /** @see retrieveFeedback */
        @MustBeClosed
        fun retrieveFeedback(
            params: DatasetRetrieveFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FeedbackSchema>>

        /** @see retrieveFeedback */
        @MustBeClosed
        fun retrieveFeedback(
            params: DatasetRetrieveFeedbackParams
        ): HttpResponseFor<List<FeedbackSchema>> = retrieveFeedback(params, RequestOptions.none())

        /** @see retrieveFeedback */
        @MustBeClosed
        fun retrieveFeedback(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FeedbackSchema>> =
            retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets/sessions`, but
         * is otherwise the same as [DatasetService.retrieveSessions].
         */
        @MustBeClosed
        fun retrieveSessions(shareToken: String): HttpResponseFor<List<TracerSession>> =
            retrieveSessions(shareToken, DatasetRetrieveSessionsParams.none())

        /** @see retrieveSessions */
        @MustBeClosed
        fun retrieveSessions(
            shareToken: String,
            params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TracerSession>> =
            retrieveSessions(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveSessions */
        @MustBeClosed
        fun retrieveSessions(
            shareToken: String,
            params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
        ): HttpResponseFor<List<TracerSession>> =
            retrieveSessions(shareToken, params, RequestOptions.none())

        /** @see retrieveSessions */
        @MustBeClosed
        fun retrieveSessions(
            params: DatasetRetrieveSessionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TracerSession>>

        /** @see retrieveSessions */
        @MustBeClosed
        fun retrieveSessions(
            params: DatasetRetrieveSessionsParams
        ): HttpResponseFor<List<TracerSession>> = retrieveSessions(params, RequestOptions.none())

        /** @see retrieveSessions */
        @MustBeClosed
        fun retrieveSessions(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TracerSession>> =
            retrieveSessions(shareToken, DatasetRetrieveSessionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/datasets/sessions-bulk`, but is
         * otherwise the same as [DatasetService.retrieveSessionsBulk].
         */
        @MustBeClosed
        fun retrieveSessionsBulk(
            params: DatasetRetrieveSessionsBulkParams
        ): HttpResponseFor<List<TracerSession>> =
            retrieveSessionsBulk(params, RequestOptions.none())

        /** @see retrieveSessionsBulk */
        @MustBeClosed
        fun retrieveSessionsBulk(
            params: DatasetRetrieveSessionsBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TracerSession>>
    }
}
