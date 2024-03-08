// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.services.async.datasets

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.DatasetRunCreateParams
import com.langsmith.api.models.DatasetRunCreateResponse
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.json
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class RunServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : RunServiceAsync { // templates/JavaSDK/services.ts:76:15 // templates/JavaSDK/services.ts:76:15
    // // templates/JavaSDK/services.ts:76:15

    private val errorHandler: Handler<LangSmithError> =
        errorHandler(clientOptions.jsonMapper) // templates/JavaSDK/services.ts:76:15

    private val createHandler:
        Handler<
            DatasetRunCreateResponse
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<DatasetRunCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch examples for a dataset, and fetch the runs for each example if they are associated with
     * the given session_ids.
     */
    override fun create(
        params: DatasetRunCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DatasetRunCreateResponse> { // templates/JavaSDK/services.ts:831:10
        val request =
            HttpRequest.builder() // templates/JavaSDK/services.ts:107:20 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:105:8 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:104:29 //
                // templates/JavaSDK/services.ts:227:15 //
                // templates/JavaSDK/services.ts:227:15
                .method(
                    HttpMethod.POST
                ) // templates/JavaSDK/services.ts:109:18 // templates/JavaSDK/services.ts:109:18
                .addPathSegments("datasets", params.getPathParam(0), "runs")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            -> // templates/JavaSDK/services.ts:230:8
            response
                .use { // templates/JavaSDK/services.ts:166:8 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:233:30 //
                    // templates/JavaSDK/services.ts:230:8 // templates/JavaSDK/services.ts:230:8
                    createHandler.handle(it)
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
