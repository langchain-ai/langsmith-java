// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.public_

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
import com.langsmith_api.api.services.async.api.v1.public_.datasets.RunServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DatasetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatasetServiceAsync

    fun runs(): RunServiceAsync

    /** Get dataset by ids or the shared dataset if not specifed. */
    fun list(shareToken: String): CompletableFuture<DatasetListResponse> =
        list(shareToken, DatasetListParams.none())

    /** @see list */
    fun list(
        shareToken: String,
        params: DatasetListParams = DatasetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetListResponse> =
        list(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see list */
    fun list(
        shareToken: String,
        params: DatasetListParams = DatasetListParams.none(),
    ): CompletableFuture<DatasetListResponse> = list(shareToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetListResponse>

    /** @see list */
    fun list(params: DatasetListParams): CompletableFuture<DatasetListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        shareToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetListResponse> =
        list(shareToken, DatasetListParams.none(), requestOptions)

    /** Get all comparative experiments for a given dataset. */
    fun retrieveComparative(
        shareToken: String
    ): CompletableFuture<List<DatasetRetrieveComparativeResponse>> =
        retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none())

    /** @see retrieveComparative */
    fun retrieveComparative(
        shareToken: String,
        params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DatasetRetrieveComparativeResponse>> =
        retrieveComparative(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveComparative */
    fun retrieveComparative(
        shareToken: String,
        params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
    ): CompletableFuture<List<DatasetRetrieveComparativeResponse>> =
        retrieveComparative(shareToken, params, RequestOptions.none())

    /** @see retrieveComparative */
    fun retrieveComparative(
        params: DatasetRetrieveComparativeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<DatasetRetrieveComparativeResponse>>

    /** @see retrieveComparative */
    fun retrieveComparative(
        params: DatasetRetrieveComparativeParams
    ): CompletableFuture<List<DatasetRetrieveComparativeResponse>> =
        retrieveComparative(params, RequestOptions.none())

    /** @see retrieveComparative */
    fun retrieveComparative(
        shareToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<DatasetRetrieveComparativeResponse>> =
        retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none(), requestOptions)

    /** Get feedback for runs in projects run over a dataset that has been shared. */
    fun retrieveFeedback(shareToken: String): CompletableFuture<List<FeedbackSchema>> =
        retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none())

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        shareToken: String,
        params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FeedbackSchema>> =
        retrieveFeedback(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        shareToken: String,
        params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
    ): CompletableFuture<List<FeedbackSchema>> =
        retrieveFeedback(shareToken, params, RequestOptions.none())

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        params: DatasetRetrieveFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FeedbackSchema>>

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        params: DatasetRetrieveFeedbackParams
    ): CompletableFuture<List<FeedbackSchema>> = retrieveFeedback(params, RequestOptions.none())

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        shareToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FeedbackSchema>> =
        retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none(), requestOptions)

    /** Get projects run on a dataset that has been shared. */
    fun retrieveSessions(shareToken: String): CompletableFuture<List<TracerSession>> =
        retrieveSessions(shareToken, DatasetRetrieveSessionsParams.none())

    /** @see retrieveSessions */
    fun retrieveSessions(
        shareToken: String,
        params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TracerSession>> =
        retrieveSessions(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveSessions */
    fun retrieveSessions(
        shareToken: String,
        params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
    ): CompletableFuture<List<TracerSession>> =
        retrieveSessions(shareToken, params, RequestOptions.none())

    /** @see retrieveSessions */
    fun retrieveSessions(
        params: DatasetRetrieveSessionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TracerSession>>

    /** @see retrieveSessions */
    fun retrieveSessions(
        params: DatasetRetrieveSessionsParams
    ): CompletableFuture<List<TracerSession>> = retrieveSessions(params, RequestOptions.none())

    /** @see retrieveSessions */
    fun retrieveSessions(
        shareToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TracerSession>> =
        retrieveSessions(shareToken, DatasetRetrieveSessionsParams.none(), requestOptions)

    /** Get sessions from multiple datasets using share tokens. */
    fun retrieveSessionsBulk(
        params: DatasetRetrieveSessionsBulkParams
    ): CompletableFuture<List<TracerSession>> = retrieveSessionsBulk(params, RequestOptions.none())

    /** @see retrieveSessionsBulk */
    fun retrieveSessionsBulk(
        params: DatasetRetrieveSessionsBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TracerSession>>

    /**
     * A view of [DatasetServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatasetServiceAsync.WithRawResponse

        fun runs(): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets`, but is
         * otherwise the same as [DatasetServiceAsync.list].
         */
        fun list(shareToken: String): CompletableFuture<HttpResponseFor<DatasetListResponse>> =
            list(shareToken, DatasetListParams.none())

        /** @see list */
        fun list(
            shareToken: String,
            params: DatasetListParams = DatasetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetListResponse>> =
            list(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see list */
        fun list(
            shareToken: String,
            params: DatasetListParams = DatasetListParams.none(),
        ): CompletableFuture<HttpResponseFor<DatasetListResponse>> =
            list(shareToken, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DatasetListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetListResponse>>

        /** @see list */
        fun list(
            params: DatasetListParams
        ): CompletableFuture<HttpResponseFor<DatasetListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            shareToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetListResponse>> =
            list(shareToken, DatasetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets/comparative`,
         * but is otherwise the same as [DatasetServiceAsync.retrieveComparative].
         */
        fun retrieveComparative(
            shareToken: String
        ): CompletableFuture<HttpResponseFor<List<DatasetRetrieveComparativeResponse>>> =
            retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none())

        /** @see retrieveComparative */
        fun retrieveComparative(
            shareToken: String,
            params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DatasetRetrieveComparativeResponse>>> =
            retrieveComparative(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveComparative */
        fun retrieveComparative(
            shareToken: String,
            params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
        ): CompletableFuture<HttpResponseFor<List<DatasetRetrieveComparativeResponse>>> =
            retrieveComparative(shareToken, params, RequestOptions.none())

        /** @see retrieveComparative */
        fun retrieveComparative(
            params: DatasetRetrieveComparativeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<DatasetRetrieveComparativeResponse>>>

        /** @see retrieveComparative */
        fun retrieveComparative(
            params: DatasetRetrieveComparativeParams
        ): CompletableFuture<HttpResponseFor<List<DatasetRetrieveComparativeResponse>>> =
            retrieveComparative(params, RequestOptions.none())

        /** @see retrieveComparative */
        fun retrieveComparative(
            shareToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<DatasetRetrieveComparativeResponse>>> =
            retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets/feedback`, but
         * is otherwise the same as [DatasetServiceAsync.retrieveFeedback].
         */
        fun retrieveFeedback(
            shareToken: String
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>> =
            retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none())

        /** @see retrieveFeedback */
        fun retrieveFeedback(
            shareToken: String,
            params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>> =
            retrieveFeedback(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveFeedback */
        fun retrieveFeedback(
            shareToken: String,
            params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>> =
            retrieveFeedback(shareToken, params, RequestOptions.none())

        /** @see retrieveFeedback */
        fun retrieveFeedback(
            params: DatasetRetrieveFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>>

        /** @see retrieveFeedback */
        fun retrieveFeedback(
            params: DatasetRetrieveFeedbackParams
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>> =
            retrieveFeedback(params, RequestOptions.none())

        /** @see retrieveFeedback */
        fun retrieveFeedback(
            shareToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FeedbackSchema>>> =
            retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets/sessions`, but
         * is otherwise the same as [DatasetServiceAsync.retrieveSessions].
         */
        fun retrieveSessions(
            shareToken: String
        ): CompletableFuture<HttpResponseFor<List<TracerSession>>> =
            retrieveSessions(shareToken, DatasetRetrieveSessionsParams.none())

        /** @see retrieveSessions */
        fun retrieveSessions(
            shareToken: String,
            params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TracerSession>>> =
            retrieveSessions(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveSessions */
        fun retrieveSessions(
            shareToken: String,
            params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
        ): CompletableFuture<HttpResponseFor<List<TracerSession>>> =
            retrieveSessions(shareToken, params, RequestOptions.none())

        /** @see retrieveSessions */
        fun retrieveSessions(
            params: DatasetRetrieveSessionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TracerSession>>>

        /** @see retrieveSessions */
        fun retrieveSessions(
            params: DatasetRetrieveSessionsParams
        ): CompletableFuture<HttpResponseFor<List<TracerSession>>> =
            retrieveSessions(params, RequestOptions.none())

        /** @see retrieveSessions */
        fun retrieveSessions(
            shareToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TracerSession>>> =
            retrieveSessions(shareToken, DatasetRetrieveSessionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/datasets/sessions-bulk`, but is
         * otherwise the same as [DatasetServiceAsync.retrieveSessionsBulk].
         */
        fun retrieveSessionsBulk(
            params: DatasetRetrieveSessionsBulkParams
        ): CompletableFuture<HttpResponseFor<List<TracerSession>>> =
            retrieveSessionsBulk(params, RequestOptions.none())

        /** @see retrieveSessionsBulk */
        fun retrieveSessionsBulk(
            params: DatasetRetrieveSessionsBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TracerSession>>>
    }
}
