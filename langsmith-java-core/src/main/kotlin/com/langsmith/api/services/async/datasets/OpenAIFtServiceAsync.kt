// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.datasets

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.DatasetOpenAIFtRetrieveParams
import com.langsmith.api.models.DatasetOpenAIFtRetrieveResponse
import java.util.concurrent.CompletableFuture

interface OpenAIFtServiceAsync {

    /** Download a dataset as OpenAI Jsonl format. */
    @JvmOverloads
    fun retrieve(
        params: DatasetOpenAIFtRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DatasetOpenAIFtRetrieveResponse>
}
