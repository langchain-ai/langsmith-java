// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.public_.datasets.runs

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.ListPublicDatasetRunsResponse
import com.langsmith.api.models.PublicDatasetRunQueryCreateParams
import java.util.concurrent.CompletableFuture

interface QueryServiceAsync {

    /** Get runs in projects run over a dataset that has been shared. */
    @JvmOverloads
    fun create(
        params: PublicDatasetRunQueryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ListPublicDatasetRunsResponse>
}
