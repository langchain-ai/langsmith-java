// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.public_

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.public_.datasets.DatasetListParams
import com.langchain.smith.models.public_.datasets.DatasetListResponse
import com.langchain.smith.models.public_.datasets.DatasetRetrieveComparativePageAsync
import com.langchain.smith.models.public_.datasets.DatasetRetrieveComparativeParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveFeedbackPageAsync
import com.langchain.smith.models.public_.datasets.DatasetRetrieveFeedbackParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsBulkParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsPageAsync
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsParams
import com.langchain.smith.models.sessions.TracerSession
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
    ): CompletableFuture<DatasetRetrieveComparativePageAsync> =
        retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none())

    /** @see retrieveComparative */
    fun retrieveComparative(
        shareToken: String,
        params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetRetrieveComparativePageAsync> =
        retrieveComparative(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveComparative */
    fun retrieveComparative(
        shareToken: String,
        params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
    ): CompletableFuture<DatasetRetrieveComparativePageAsync> =
        retrieveComparative(shareToken, params, RequestOptions.none())

    /** @see retrieveComparative */
    fun retrieveComparative(
        params: DatasetRetrieveComparativeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetRetrieveComparativePageAsync>

    /** @see retrieveComparative */
    fun retrieveComparative(
        params: DatasetRetrieveComparativeParams
    ): CompletableFuture<DatasetRetrieveComparativePageAsync> =
        retrieveComparative(params, RequestOptions.none())

    /** @see retrieveComparative */
    fun retrieveComparative(
        shareToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetRetrieveComparativePageAsync> =
        retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none(), requestOptions)

    /** Get feedback for runs in projects run over a dataset that has been shared. */
    fun retrieveFeedback(shareToken: String): CompletableFuture<DatasetRetrieveFeedbackPageAsync> =
        retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none())

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        shareToken: String,
        params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetRetrieveFeedbackPageAsync> =
        retrieveFeedback(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        shareToken: String,
        params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
    ): CompletableFuture<DatasetRetrieveFeedbackPageAsync> =
        retrieveFeedback(shareToken, params, RequestOptions.none())

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        params: DatasetRetrieveFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetRetrieveFeedbackPageAsync>

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        params: DatasetRetrieveFeedbackParams
    ): CompletableFuture<DatasetRetrieveFeedbackPageAsync> =
        retrieveFeedback(params, RequestOptions.none())

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        shareToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetRetrieveFeedbackPageAsync> =
        retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none(), requestOptions)

    /** Get projects run on a dataset that has been shared. */
    fun retrieveSessions(shareToken: String): CompletableFuture<DatasetRetrieveSessionsPageAsync> =
        retrieveSessions(shareToken, DatasetRetrieveSessionsParams.none())

    /** @see retrieveSessions */
    fun retrieveSessions(
        shareToken: String,
        params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetRetrieveSessionsPageAsync> =
        retrieveSessions(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveSessions */
    fun retrieveSessions(
        shareToken: String,
        params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
    ): CompletableFuture<DatasetRetrieveSessionsPageAsync> =
        retrieveSessions(shareToken, params, RequestOptions.none())

    /** @see retrieveSessions */
    fun retrieveSessions(
        params: DatasetRetrieveSessionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetRetrieveSessionsPageAsync>

    /** @see retrieveSessions */
    fun retrieveSessions(
        params: DatasetRetrieveSessionsParams
    ): CompletableFuture<DatasetRetrieveSessionsPageAsync> =
        retrieveSessions(params, RequestOptions.none())

    /** @see retrieveSessions */
    fun retrieveSessions(
        shareToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetRetrieveSessionsPageAsync> =
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
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveComparativePageAsync>> =
            retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none())

        /** @see retrieveComparative */
        fun retrieveComparative(
            shareToken: String,
            params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveComparativePageAsync>> =
            retrieveComparative(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveComparative */
        fun retrieveComparative(
            shareToken: String,
            params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveComparativePageAsync>> =
            retrieveComparative(shareToken, params, RequestOptions.none())

        /** @see retrieveComparative */
        fun retrieveComparative(
            params: DatasetRetrieveComparativeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveComparativePageAsync>>

        /** @see retrieveComparative */
        fun retrieveComparative(
            params: DatasetRetrieveComparativeParams
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveComparativePageAsync>> =
            retrieveComparative(params, RequestOptions.none())

        /** @see retrieveComparative */
        fun retrieveComparative(
            shareToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveComparativePageAsync>> =
            retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets/feedback`, but
         * is otherwise the same as [DatasetServiceAsync.retrieveFeedback].
         */
        fun retrieveFeedback(
            shareToken: String
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveFeedbackPageAsync>> =
            retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none())

        /** @see retrieveFeedback */
        fun retrieveFeedback(
            shareToken: String,
            params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveFeedbackPageAsync>> =
            retrieveFeedback(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveFeedback */
        fun retrieveFeedback(
            shareToken: String,
            params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveFeedbackPageAsync>> =
            retrieveFeedback(shareToken, params, RequestOptions.none())

        /** @see retrieveFeedback */
        fun retrieveFeedback(
            params: DatasetRetrieveFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveFeedbackPageAsync>>

        /** @see retrieveFeedback */
        fun retrieveFeedback(
            params: DatasetRetrieveFeedbackParams
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveFeedbackPageAsync>> =
            retrieveFeedback(params, RequestOptions.none())

        /** @see retrieveFeedback */
        fun retrieveFeedback(
            shareToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveFeedbackPageAsync>> =
            retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets/sessions`, but
         * is otherwise the same as [DatasetServiceAsync.retrieveSessions].
         */
        fun retrieveSessions(
            shareToken: String
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveSessionsPageAsync>> =
            retrieveSessions(shareToken, DatasetRetrieveSessionsParams.none())

        /** @see retrieveSessions */
        fun retrieveSessions(
            shareToken: String,
            params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveSessionsPageAsync>> =
            retrieveSessions(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveSessions */
        fun retrieveSessions(
            shareToken: String,
            params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveSessionsPageAsync>> =
            retrieveSessions(shareToken, params, RequestOptions.none())

        /** @see retrieveSessions */
        fun retrieveSessions(
            params: DatasetRetrieveSessionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveSessionsPageAsync>>

        /** @see retrieveSessions */
        fun retrieveSessions(
            params: DatasetRetrieveSessionsParams
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveSessionsPageAsync>> =
            retrieveSessions(params, RequestOptions.none())

        /** @see retrieveSessions */
        fun retrieveSessions(
            shareToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetRetrieveSessionsPageAsync>> =
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
