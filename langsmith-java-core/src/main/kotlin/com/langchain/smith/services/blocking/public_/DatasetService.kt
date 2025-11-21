// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.public_

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.public_.datasets.DatasetListComparativePage
import com.langchain.smith.models.public_.datasets.DatasetListComparativeParams
import com.langchain.smith.models.public_.datasets.DatasetListFeedbackPage
import com.langchain.smith.models.public_.datasets.DatasetListFeedbackParams
import com.langchain.smith.models.public_.datasets.DatasetListParams
import com.langchain.smith.models.public_.datasets.DatasetListResponse
import com.langchain.smith.models.public_.datasets.DatasetListSessionsPage
import com.langchain.smith.models.public_.datasets.DatasetListSessionsParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsBulkParams
import com.langchain.smith.models.sessions.TracerSession
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
    fun listComparative(shareToken: String): DatasetListComparativePage =
        listComparative(shareToken, DatasetListComparativeParams.none())

    /** @see listComparative */
    fun listComparative(
        shareToken: String,
        params: DatasetListComparativeParams = DatasetListComparativeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetListComparativePage =
        listComparative(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see listComparative */
    fun listComparative(
        shareToken: String,
        params: DatasetListComparativeParams = DatasetListComparativeParams.none(),
    ): DatasetListComparativePage = listComparative(shareToken, params, RequestOptions.none())

    /** @see listComparative */
    fun listComparative(
        params: DatasetListComparativeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetListComparativePage

    /** @see listComparative */
    fun listComparative(params: DatasetListComparativeParams): DatasetListComparativePage =
        listComparative(params, RequestOptions.none())

    /** @see listComparative */
    fun listComparative(
        shareToken: String,
        requestOptions: RequestOptions,
    ): DatasetListComparativePage =
        listComparative(shareToken, DatasetListComparativeParams.none(), requestOptions)

    /** Get feedback for runs in projects run over a dataset that has been shared. */
    fun listFeedback(shareToken: String): DatasetListFeedbackPage =
        listFeedback(shareToken, DatasetListFeedbackParams.none())

    /** @see listFeedback */
    fun listFeedback(
        shareToken: String,
        params: DatasetListFeedbackParams = DatasetListFeedbackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetListFeedbackPage =
        listFeedback(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see listFeedback */
    fun listFeedback(
        shareToken: String,
        params: DatasetListFeedbackParams = DatasetListFeedbackParams.none(),
    ): DatasetListFeedbackPage = listFeedback(shareToken, params, RequestOptions.none())

    /** @see listFeedback */
    fun listFeedback(
        params: DatasetListFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetListFeedbackPage

    /** @see listFeedback */
    fun listFeedback(params: DatasetListFeedbackParams): DatasetListFeedbackPage =
        listFeedback(params, RequestOptions.none())

    /** @see listFeedback */
    fun listFeedback(shareToken: String, requestOptions: RequestOptions): DatasetListFeedbackPage =
        listFeedback(shareToken, DatasetListFeedbackParams.none(), requestOptions)

    /** Get projects run on a dataset that has been shared. */
    fun listSessions(shareToken: String): DatasetListSessionsPage =
        listSessions(shareToken, DatasetListSessionsParams.none())

    /** @see listSessions */
    fun listSessions(
        shareToken: String,
        params: DatasetListSessionsParams = DatasetListSessionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetListSessionsPage =
        listSessions(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see listSessions */
    fun listSessions(
        shareToken: String,
        params: DatasetListSessionsParams = DatasetListSessionsParams.none(),
    ): DatasetListSessionsPage = listSessions(shareToken, params, RequestOptions.none())

    /** @see listSessions */
    fun listSessions(
        params: DatasetListSessionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetListSessionsPage

    /** @see listSessions */
    fun listSessions(params: DatasetListSessionsParams): DatasetListSessionsPage =
        listSessions(params, RequestOptions.none())

    /** @see listSessions */
    fun listSessions(shareToken: String, requestOptions: RequestOptions): DatasetListSessionsPage =
        listSessions(shareToken, DatasetListSessionsParams.none(), requestOptions)

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
         * but is otherwise the same as [DatasetService.listComparative].
         */
        @MustBeClosed
        fun listComparative(shareToken: String): HttpResponseFor<DatasetListComparativePage> =
            listComparative(shareToken, DatasetListComparativeParams.none())

        /** @see listComparative */
        @MustBeClosed
        fun listComparative(
            shareToken: String,
            params: DatasetListComparativeParams = DatasetListComparativeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetListComparativePage> =
            listComparative(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see listComparative */
        @MustBeClosed
        fun listComparative(
            shareToken: String,
            params: DatasetListComparativeParams = DatasetListComparativeParams.none(),
        ): HttpResponseFor<DatasetListComparativePage> =
            listComparative(shareToken, params, RequestOptions.none())

        /** @see listComparative */
        @MustBeClosed
        fun listComparative(
            params: DatasetListComparativeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetListComparativePage>

        /** @see listComparative */
        @MustBeClosed
        fun listComparative(
            params: DatasetListComparativeParams
        ): HttpResponseFor<DatasetListComparativePage> =
            listComparative(params, RequestOptions.none())

        /** @see listComparative */
        @MustBeClosed
        fun listComparative(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetListComparativePage> =
            listComparative(shareToken, DatasetListComparativeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets/feedback`, but
         * is otherwise the same as [DatasetService.listFeedback].
         */
        @MustBeClosed
        fun listFeedback(shareToken: String): HttpResponseFor<DatasetListFeedbackPage> =
            listFeedback(shareToken, DatasetListFeedbackParams.none())

        /** @see listFeedback */
        @MustBeClosed
        fun listFeedback(
            shareToken: String,
            params: DatasetListFeedbackParams = DatasetListFeedbackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetListFeedbackPage> =
            listFeedback(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see listFeedback */
        @MustBeClosed
        fun listFeedback(
            shareToken: String,
            params: DatasetListFeedbackParams = DatasetListFeedbackParams.none(),
        ): HttpResponseFor<DatasetListFeedbackPage> =
            listFeedback(shareToken, params, RequestOptions.none())

        /** @see listFeedback */
        @MustBeClosed
        fun listFeedback(
            params: DatasetListFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetListFeedbackPage>

        /** @see listFeedback */
        @MustBeClosed
        fun listFeedback(
            params: DatasetListFeedbackParams
        ): HttpResponseFor<DatasetListFeedbackPage> = listFeedback(params, RequestOptions.none())

        /** @see listFeedback */
        @MustBeClosed
        fun listFeedback(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetListFeedbackPage> =
            listFeedback(shareToken, DatasetListFeedbackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets/sessions`, but
         * is otherwise the same as [DatasetService.listSessions].
         */
        @MustBeClosed
        fun listSessions(shareToken: String): HttpResponseFor<DatasetListSessionsPage> =
            listSessions(shareToken, DatasetListSessionsParams.none())

        /** @see listSessions */
        @MustBeClosed
        fun listSessions(
            shareToken: String,
            params: DatasetListSessionsParams = DatasetListSessionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetListSessionsPage> =
            listSessions(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see listSessions */
        @MustBeClosed
        fun listSessions(
            shareToken: String,
            params: DatasetListSessionsParams = DatasetListSessionsParams.none(),
        ): HttpResponseFor<DatasetListSessionsPage> =
            listSessions(shareToken, params, RequestOptions.none())

        /** @see listSessions */
        @MustBeClosed
        fun listSessions(
            params: DatasetListSessionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetListSessionsPage>

        /** @see listSessions */
        @MustBeClosed
        fun listSessions(
            params: DatasetListSessionsParams
        ): HttpResponseFor<DatasetListSessionsPage> = listSessions(params, RequestOptions.none())

        /** @see listSessions */
        @MustBeClosed
        fun listSessions(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetListSessionsPage> =
            listSessions(shareToken, DatasetListSessionsParams.none(), requestOptions)

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
