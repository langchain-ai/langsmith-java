// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.datasets

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.DatasetOpenAIRetrieveParams
import com.langsmith.api.models.DatasetOpenAIRetrieveResponse
import java.util.concurrent.CompletableFuture

interface OpenAIServiceAsync {

    /** Download a dataset as OpenAI Evals Jsonl format. */
    @JvmOverloads
    fun retrieve(
        params: DatasetOpenAIRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetOpenAIRetrieveResponse>
}
