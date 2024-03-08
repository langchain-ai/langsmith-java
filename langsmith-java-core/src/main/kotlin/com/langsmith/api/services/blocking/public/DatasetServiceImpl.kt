// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.public

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.DatasetPublicSchema
import com.langsmith.api.models.PublicDatasetListParams
import com.langsmith.api.services.blocking.public.datasets.FeedbackService
import com.langsmith.api.services.blocking.public.datasets.FeedbackServiceImpl
import com.langsmith.api.services.blocking.public.datasets.RunService
import com.langsmith.api.services.blocking.public.datasets.RunServiceImpl
import com.langsmith.api.services.blocking.public.datasets.SessionService
import com.langsmith.api.services.blocking.public.datasets.SessionServiceImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class DatasetServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : DatasetService {

    private val errorHandler: Handler<LangSmithError> = errorHandler(clientOptions.jsonMapper)

    private val sessions: SessionService by lazy { SessionServiceImpl(clientOptions) }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    private val feedback: FeedbackService by lazy { FeedbackServiceImpl(clientOptions) }

    override fun sessions(): SessionService = sessions

    override fun runs(): RunService = runs

    override fun feedback(): FeedbackService = feedback

    private val listHandler: Handler<DatasetPublicSchema> =
        jsonHandler<DatasetPublicSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get dataset by ids or the shared dataset if not specifed. */
    override fun list(
        params: PublicDatasetListParams,
        requestOptions: RequestOptions
    ): DatasetPublicSchema {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("public", params.getPathParam(0), "datasets")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
