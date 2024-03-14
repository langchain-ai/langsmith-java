// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.public_.datasets

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.PublicDatasetSessionListParams
import com.langsmith.api.models.TracerSession
import java.util.concurrent.CompletableFuture

interface SessionServiceAsync {

    /** Get projects run on a dataset that has been shared. */
    @JvmOverloads
    fun list(
        params: PublicDatasetSessionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<List<TracerSession>>
}
