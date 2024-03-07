// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.public.datasets.runs

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.PublicDatasetRunStatCreateParams
import com.langsmith.api.models.RunStats
import java.util.concurrent.CompletableFuture

interface StatServiceAsync {

    /** Get run stats in projects run over a dataset that has been shared. */
    @JvmOverloads
    fun create(
        params: PublicDatasetRunStatCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RunStats>
}
