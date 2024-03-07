// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.OkRetrieveParams
import com.langsmith.api.models.OkRetrieveResponse
import java.util.concurrent.CompletableFuture

interface OkServiceAsync {

    /** Ok */
    @JvmOverloads
    fun retrieve(
        params: OkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<OkRetrieveResponse>
}
