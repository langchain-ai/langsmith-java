// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.public_

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.public_.datasets.DatasetListParams
import com.langchain.smith.models.public_.datasets.DatasetListResponse
import com.langchain.smith.models.public_.datasets.DatasetRetrieveComparativePage
import com.langchain.smith.models.public_.datasets.DatasetRetrieveComparativeParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveFeedbackPage
import com.langchain.smith.models.public_.datasets.DatasetRetrieveFeedbackParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsBulkParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsPage
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsParams
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
    fun retrieveComparative(shareToken: String): DatasetRetrieveComparativePage =
        retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none())

    /** @see retrieveComparative */
    fun retrieveComparative(
        shareToken: String,
        params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveComparativePage =
        retrieveComparative(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveComparative */
    fun retrieveComparative(
        shareToken: String,
        params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
    ): DatasetRetrieveComparativePage =
        retrieveComparative(shareToken, params, RequestOptions.none())

    /** @see retrieveComparative */
    fun retrieveComparative(
        params: DatasetRetrieveComparativeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveComparativePage

    /** @see retrieveComparative */
    fun retrieveComparative(
        params: DatasetRetrieveComparativeParams
    ): DatasetRetrieveComparativePage = retrieveComparative(params, RequestOptions.none())

    /** @see retrieveComparative */
    fun retrieveComparative(
        shareToken: String,
        requestOptions: RequestOptions,
    ): DatasetRetrieveComparativePage =
        retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none(), requestOptions)

    /** Get feedback for runs in projects run over a dataset that has been shared. */
    fun retrieveFeedback(shareToken: String): DatasetRetrieveFeedbackPage =
        retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none())

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        shareToken: String,
        params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveFeedbackPage =
        retrieveFeedback(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        shareToken: String,
        params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
    ): DatasetRetrieveFeedbackPage = retrieveFeedback(shareToken, params, RequestOptions.none())

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        params: DatasetRetrieveFeedbackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveFeedbackPage

    /** @see retrieveFeedback */
    fun retrieveFeedback(params: DatasetRetrieveFeedbackParams): DatasetRetrieveFeedbackPage =
        retrieveFeedback(params, RequestOptions.none())

    /** @see retrieveFeedback */
    fun retrieveFeedback(
        shareToken: String,
        requestOptions: RequestOptions,
    ): DatasetRetrieveFeedbackPage =
        retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none(), requestOptions)

    /** Get projects run on a dataset that has been shared. */
    fun retrieveSessions(shareToken: String): DatasetRetrieveSessionsPage =
        retrieveSessions(shareToken, DatasetRetrieveSessionsParams.none())

    /** @see retrieveSessions */
    fun retrieveSessions(
        shareToken: String,
        params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveSessionsPage =
        retrieveSessions(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see retrieveSessions */
    fun retrieveSessions(
        shareToken: String,
        params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
    ): DatasetRetrieveSessionsPage = retrieveSessions(shareToken, params, RequestOptions.none())

    /** @see retrieveSessions */
    fun retrieveSessions(
        params: DatasetRetrieveSessionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveSessionsPage

    /** @see retrieveSessions */
    fun retrieveSessions(params: DatasetRetrieveSessionsParams): DatasetRetrieveSessionsPage =
        retrieveSessions(params, RequestOptions.none())

    /** @see retrieveSessions */
    fun retrieveSessions(
        shareToken: String,
        requestOptions: RequestOptions,
    ): DatasetRetrieveSessionsPage =
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
        ): HttpResponseFor<DatasetRetrieveComparativePage> =
            retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none())

        /** @see retrieveComparative */
        @MustBeClosed
        fun retrieveComparative(
            shareToken: String,
            params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveComparativePage> =
            retrieveComparative(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveComparative */
        @MustBeClosed
        fun retrieveComparative(
            shareToken: String,
            params: DatasetRetrieveComparativeParams = DatasetRetrieveComparativeParams.none(),
        ): HttpResponseFor<DatasetRetrieveComparativePage> =
            retrieveComparative(shareToken, params, RequestOptions.none())

        /** @see retrieveComparative */
        @MustBeClosed
        fun retrieveComparative(
            params: DatasetRetrieveComparativeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveComparativePage>

        /** @see retrieveComparative */
        @MustBeClosed
        fun retrieveComparative(
            params: DatasetRetrieveComparativeParams
        ): HttpResponseFor<DatasetRetrieveComparativePage> =
            retrieveComparative(params, RequestOptions.none())

        /** @see retrieveComparative */
        @MustBeClosed
        fun retrieveComparative(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveComparativePage> =
            retrieveComparative(shareToken, DatasetRetrieveComparativeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets/feedback`, but
         * is otherwise the same as [DatasetService.retrieveFeedback].
         */
        @MustBeClosed
        fun retrieveFeedback(shareToken: String): HttpResponseFor<DatasetRetrieveFeedbackPage> =
            retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none())

        /** @see retrieveFeedback */
        @MustBeClosed
        fun retrieveFeedback(
            shareToken: String,
            params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveFeedbackPage> =
            retrieveFeedback(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveFeedback */
        @MustBeClosed
        fun retrieveFeedback(
            shareToken: String,
            params: DatasetRetrieveFeedbackParams = DatasetRetrieveFeedbackParams.none(),
        ): HttpResponseFor<DatasetRetrieveFeedbackPage> =
            retrieveFeedback(shareToken, params, RequestOptions.none())

        /** @see retrieveFeedback */
        @MustBeClosed
        fun retrieveFeedback(
            params: DatasetRetrieveFeedbackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveFeedbackPage>

        /** @see retrieveFeedback */
        @MustBeClosed
        fun retrieveFeedback(
            params: DatasetRetrieveFeedbackParams
        ): HttpResponseFor<DatasetRetrieveFeedbackPage> =
            retrieveFeedback(params, RequestOptions.none())

        /** @see retrieveFeedback */
        @MustBeClosed
        fun retrieveFeedback(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveFeedbackPage> =
            retrieveFeedback(shareToken, DatasetRetrieveFeedbackParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/datasets/sessions`, but
         * is otherwise the same as [DatasetService.retrieveSessions].
         */
        @MustBeClosed
        fun retrieveSessions(shareToken: String): HttpResponseFor<DatasetRetrieveSessionsPage> =
            retrieveSessions(shareToken, DatasetRetrieveSessionsParams.none())

        /** @see retrieveSessions */
        @MustBeClosed
        fun retrieveSessions(
            shareToken: String,
            params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveSessionsPage> =
            retrieveSessions(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see retrieveSessions */
        @MustBeClosed
        fun retrieveSessions(
            shareToken: String,
            params: DatasetRetrieveSessionsParams = DatasetRetrieveSessionsParams.none(),
        ): HttpResponseFor<DatasetRetrieveSessionsPage> =
            retrieveSessions(shareToken, params, RequestOptions.none())

        /** @see retrieveSessions */
        @MustBeClosed
        fun retrieveSessions(
            params: DatasetRetrieveSessionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveSessionsPage>

        /** @see retrieveSessions */
        @MustBeClosed
        fun retrieveSessions(
            params: DatasetRetrieveSessionsParams
        ): HttpResponseFor<DatasetRetrieveSessionsPage> =
            retrieveSessions(params, RequestOptions.none())

        /** @see retrieveSessions */
        @MustBeClosed
        fun retrieveSessions(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveSessionsPage> =
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
