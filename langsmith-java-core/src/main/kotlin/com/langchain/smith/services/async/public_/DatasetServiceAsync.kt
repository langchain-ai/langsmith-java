// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.public_

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.public_.datasets.DatasetListComparativePageAsync
import com.langchain.smith.models.public_.datasets.DatasetListComparativeParams
import com.langchain.smith.models.public_.datasets.DatasetListFeedbackPageAsync
import com.langchain.smith.models.public_.datasets.DatasetListFeedbackParams
import com.langchain.smith.models.public_.datasets.DatasetListParams
import com.langchain.smith.models.public_.datasets.DatasetListResponse
import com.langchain.smith.models.public_.datasets.DatasetListSessionsPageAsync
import com.langchain.smith.models.public_.datasets.DatasetListSessionsParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsBulkParams
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
    fun listComparative(shareToken: String): CompletableFuture<DatasetListComparativePageAsync> =
        listComparative(shareToken, DatasetListComparativeParams.none())

    /** @see listComparative */
    fun listComparative(
        shareToken: String,
        params: DatasetListComparativeParams = DatasetListComparativeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetListComparativePageAsync> =
        listComparative(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see listComparative */
    fun listComparative(
        shareToken: String,
        params: DatasetListComparativeParams = DatasetListComparativeParams.none(),
    ): CompletableFuture<DatasetListComparativePageAsync> =
        listComparative(shareToken, params, RequestOptions.none())

    /** @see listComparative */
    fun listComparative(
        params: DatasetListComparativeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetListComparativePageAsync>

    /** @see listComparative */
    fun listComparative(
        params: DatasetListComparativeParams
    ): CompletableFuture<DatasetListComparativePageAsync> =
        listComparative(params, RequestOptions.none())

    /** @see listComparative */
    fun listComparative(
        shareToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetListComparativePageAsync> =
        listComparative(shareToken, DatasetListComparativeParams.none(), requestOptions)

    /** Get feedback for runs in projects run over a dataset that has been shared. */
    fun listFeedback(shareToken: String): CompletableFuture<DatasetListFeedbackPageAsync> =
        listFeedback(shareToken, DatasetListFeedbackParams.none())

    /** @see listFeedback */
    fun listFeedback(
        shareToken: String,
        params: DatasetListFeedbackParams = DatasetListFeedbackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetListFeedbackPageAsync> =
        listFeedback(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see listFeedback */
    fun listFeedback(
        shareToken: String,
        params: DatasetListFeedbackParams = DatasetListFeedbackParams.none(),
    ): CompletableFuture<DatasetListFeedbackPageAsync> =
        listFeedback(shareToken, params, RequestOptions.none())

    /** @see listFeedback */
    fun listFeedback(
        params: DatasetListFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetListFeedbackPageAsync>

    /** @see listFeedback */
    fun listFeedback(
        params: DatasetListFeedbackParams
    ): CompletableFuture<DatasetListFeedbackPageAsync> = listFeedback(params, RequestOptions.none())

    /** @see listFeedback */
    fun listFeedback(
        shareToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetListFeedbackPageAsync> =
        listFeedback(shareToken, DatasetListFeedbackParams.none(), requestOptions)

    /** Get projects run on a dataset that has been shared. */
    fun listSessions(shareToken: String): CompletableFuture<DatasetListSessionsPageAsync> =
        listSessions(shareToken, DatasetListSessionsParams.none())

    /** @see listSessions */
    fun listSessions(
        shareToken: String,
        params: DatasetListSessionsParams = DatasetListSessionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetListSessionsPageAsync> =
        listSessions(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see listSessions */
    fun listSessions(
        shareToken: String,
        params: DatasetListSessionsParams = DatasetListSessionsParams.none(),
    ): CompletableFuture<DatasetListSessionsPageAsync> =
        listSessions(shareToken, params, RequestOptions.none())

    /** @see listSessions */
    fun listSessions(
        params: DatasetListSessionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatasetListSessionsPageAsync>

    /** @see listSessions */
    fun listSessions(
        params: DatasetListSessionsParams
    ): CompletableFuture<DatasetListSessionsPageAsync> = listSessions(params, RequestOptions.none())

    /** @see listSessions */
    fun listSessions(
        shareToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatasetListSessionsPageAsync> =
        listSessions(shareToken, DatasetListSessionsParams.none(), requestOptions)

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
         * but is otherwise the same as [DatasetServiceAsync.listComparative].
         */
        fun listComparative(
            shareToken: String
        ): CompletableFuture<HttpResponseFor<DatasetListComparativePageAsync>> =
            listComparative(shareToken, DatasetListComparativeParams.none())

        /** @see listComparative */
        fun listComparative(
            shareToken: String,
            params: DatasetListComparativeParams = DatasetListComparativeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetListComparativePageAsync>> =
            listComparative(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see listComparative */
        fun listComparative(
            shareToken: String,
            params: DatasetListComparativeParams = DatasetListComparativeParams.none(),
        ): CompletableFuture<HttpResponseFor<DatasetListComparativePageAsync>> =
            listComparative(shareToken, params, RequestOptions.none())

        /** @see listComparative */
        fun listComparative(
            params: DatasetListComparativeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetListComparativePageAsync>>

        /** @see listComparative */
        fun listComparative(
            params: DatasetListComparativeParams
        ): CompletableFuture<HttpResponseFor<DatasetListComparativePageAsync>> =
            listComparative(params, RequestOptions.none())

        /** @see listComparative */
        fun listComparative(
            shareToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetListComparativePageAsync>> =
            listComparative(shareToken, DatasetListComparativeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets/feedback`, but
         * is otherwise the same as [DatasetServiceAsync.listFeedback].
         */
        fun listFeedback(
            shareToken: String
        ): CompletableFuture<HttpResponseFor<DatasetListFeedbackPageAsync>> =
            listFeedback(shareToken, DatasetListFeedbackParams.none())

        /** @see listFeedback */
        fun listFeedback(
            shareToken: String,
            params: DatasetListFeedbackParams = DatasetListFeedbackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetListFeedbackPageAsync>> =
            listFeedback(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see listFeedback */
        fun listFeedback(
            shareToken: String,
            params: DatasetListFeedbackParams = DatasetListFeedbackParams.none(),
        ): CompletableFuture<HttpResponseFor<DatasetListFeedbackPageAsync>> =
            listFeedback(shareToken, params, RequestOptions.none())

        /** @see listFeedback */
        fun listFeedback(
            params: DatasetListFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetListFeedbackPageAsync>>

        /** @see listFeedback */
        fun listFeedback(
            params: DatasetListFeedbackParams
        ): CompletableFuture<HttpResponseFor<DatasetListFeedbackPageAsync>> =
            listFeedback(params, RequestOptions.none())

        /** @see listFeedback */
        fun listFeedback(
            shareToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetListFeedbackPageAsync>> =
            listFeedback(shareToken, DatasetListFeedbackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets/sessions`, but
         * is otherwise the same as [DatasetServiceAsync.listSessions].
         */
        fun listSessions(
            shareToken: String
        ): CompletableFuture<HttpResponseFor<DatasetListSessionsPageAsync>> =
            listSessions(shareToken, DatasetListSessionsParams.none())

        /** @see listSessions */
        fun listSessions(
            shareToken: String,
            params: DatasetListSessionsParams = DatasetListSessionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetListSessionsPageAsync>> =
            listSessions(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see listSessions */
        fun listSessions(
            shareToken: String,
            params: DatasetListSessionsParams = DatasetListSessionsParams.none(),
        ): CompletableFuture<HttpResponseFor<DatasetListSessionsPageAsync>> =
            listSessions(shareToken, params, RequestOptions.none())

        /** @see listSessions */
        fun listSessions(
            params: DatasetListSessionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatasetListSessionsPageAsync>>

        /** @see listSessions */
        fun listSessions(
            params: DatasetListSessionsParams
        ): CompletableFuture<HttpResponseFor<DatasetListSessionsPageAsync>> =
            listSessions(params, RequestOptions.none())

        /** @see listSessions */
        fun listSessions(
            shareToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatasetListSessionsPageAsync>> =
            listSessions(shareToken, DatasetListSessionsParams.none(), requestOptions)

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
