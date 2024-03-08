// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.services.blocking.datasets

import com.langsmith.api.core.ClientOptions
import com.langsmith.api.core.RequestOptions
import com.langsmith.api.core.http.HttpMethod
import com.langsmith.api.core.http.HttpRequest
import com.langsmith.api.core.http.HttpResponse.Handler
import com.langsmith.api.errors.LangSmithError
import com.langsmith.api.models.DatasetOpenAIFtRetrieveParams
import com.langsmith.api.models.DatasetOpenAIFtRetrieveResponse
import com.langsmith.api.services.errorHandler
import com.langsmith.api.services.jsonHandler
import com.langsmith.api.services.withErrorHandler

class OpenAIFtServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : OpenAIFtService { // templates/JavaSDK/services.ts:76:15 // templates/JavaSDK/services.ts:76:15
    // // templates/JavaSDK/services.ts:76:15

    private val errorHandler: Handler<LangSmithError> =
        errorHandler(clientOptions.jsonMapper) // templates/JavaSDK/services.ts:76:15

    private val retrieveHandler:
        Handler<
            DatasetOpenAIFtRetrieveResponse
        > = // templates/JavaSDK/services.ts:826:12 // templates/JavaSDK/services.ts:826:12 //
        // templates/JavaSDK/services.ts:825:19
        jsonHandler<DatasetOpenAIFtRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Download a dataset as OpenAI Jsonl format. */
    override fun retrieve(
        params: DatasetOpenAIFtRetrieveParams,
        requestOptions: RequestOptions
    ): DatasetOpenAIFtRetrieveResponse { // templates/JavaSDK/services.ts:831:10
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
                .addPathSegments("datasets", params.getPathParam(0), "openai_ft")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response
            -> // templates/JavaSDK/services.ts:230:8
            response.use { // templates/JavaSDK/services.ts:166:8 //
                // templates/JavaSDK/services.ts:233:30 //
                // templates/JavaSDK/services.ts:233:30 //
                // templates/JavaSDK/services.ts:230:8 // templates/JavaSDK/services.ts:230:8
                retrieveHandler.handle(it)
            }
        }
    }
}
