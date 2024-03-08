// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.services.blocking.public_

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.DatasetPublicSchema
import com.langsmith.api.models.PublicDatasetListParams
import com.langsmith.api.services.blocking.public_.datasets.FeedbackService
import com.langsmith.api.services.blocking.public_.datasets.FeedbackServiceImpl
import com.langsmith.api.services.blocking.public_.datasets.RunService
import com.langsmith.api.services.blocking.public_.datasets.RunServiceImpl
import com.langsmith.api.services.blocking.public_.datasets.SessionService
import com.langsmith.api.services.blocking.public_.datasets.SessionServiceImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class DatasetServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : DatasetService { // templates/JavaSDK/services.ts:76:15 // templates/JavaSDK/services.ts:76:15
    // // templates/JavaSDK/services.ts:76:15

    private val errorHandler: Handler<LangSmithError> =
        errorHandler(clientOptions.jsonMapper) // templates/JavaSDK/services.ts:76:15

    private val sessions: SessionService by lazy { SessionServiceImpl(clientOptions) }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    private val feedback: FeedbackService by lazy { FeedbackServiceImpl(clientOptions) }

    override fun sessions(): SessionService = sessions

    override fun runs(): RunService = runs

    override fun feedback(): FeedbackService = feedback

    private val listHandler:
        Handler<
            DatasetPublicSchema
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<DatasetPublicSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get dataset by ids or the shared dataset if not specifed. */
    override fun list(
        params: PublicDatasetListParams,
        requestOptions: RequestOptions
    ): DatasetPublicSchema { // templates/JavaSDK/services.ts:831:10
        val request =
            HttpRequest.builder() // templates/JavaSDK/services.ts:107:20 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:227:15 //
                // templates/JavaSDK/services.ts:227:15
                .method(
                    HttpMethod.GET
                ) // templates/JavaSDK/services.ts:109:18 // templates/JavaSDK/services.ts:109:18
                .addPathSegments("public", params.getPathParam(0), "datasets")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response
            -> // templates/JavaSDK/services.ts:230:8
            response
                .use { // templates/JavaSDK/services.ts:166:8 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:230:8 // templates/JavaSDK/services.ts:230:8
                    listHandler.handle(it)
                }
                .apply { // templates/JavaSDK/services.ts:176:10
                    if (
                        requestOptions.responseValidation ?: clientOptions.responseValidation
                    ) { // templates/JavaSDK/services.ts:179:14 //
                        // templates/JavaSDK/services.ts:176:10 //
                        // templates/JavaSDK/services.ts:176:10
                        validate()
                    }
                }
        }
    }
}
