// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.public.runs

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.ListPublicRunsResponse
import com.langsmith.api.models.PublicRunQueryCreateParams
import java.util.concurrent.CompletableFuture

interface QueryServiceAsync {

    /** Get run by ids or the shared run if not specifed. */
    @JvmOverloads
    fun create(
        params: PublicRunQueryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ListPublicRunsResponse>
}
