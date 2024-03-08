// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.services.async.public_

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.DatasetPublicSchema
import com.langsmith.api.models.PublicDatasetListParams
import com.langsmith.api.services.async.public_.datasets.FeedbackServiceAsync
import com.langsmith.api.services.async.public_.datasets.FeedbackServiceAsyncImpl
import com.langsmith.api.services.async.public_.datasets.RunServiceAsync
import com.langsmith.api.services.async.public_.datasets.RunServiceAsyncImpl
import com.langsmith.api.services.async.public_.datasets.SessionServiceAsync
import com.langsmith.api.services.async.public_.datasets.SessionServiceAsyncImpl
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class DatasetServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : DatasetServiceAsync { // templates/JavaSDK/services.ts:76:15 //
    // templates/JavaSDK/services.ts:76:15 //
    // templates/JavaSDK/services.ts:76:15

    private val errorHandler: Handler<LangSmithError> =
        errorHandler(clientOptions.jsonMapper) // templates/JavaSDK/services.ts:76:15

    private val sessions: SessionServiceAsync by lazy { SessionServiceAsyncImpl(clientOptions) }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    private val feedback: FeedbackServiceAsync by lazy { FeedbackServiceAsyncImpl(clientOptions) }

    override fun sessions(): SessionServiceAsync = sessions

    override fun runs(): RunServiceAsync = runs

    override fun feedback(): FeedbackServiceAsync = feedback

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
    ): CompletableFuture<DatasetPublicSchema> { // templates/JavaSDK/services.ts:831:10
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
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
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
