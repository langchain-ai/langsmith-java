// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.async.public.examples

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.PublicExampleRunCreateParams
import com.langsmith.api.models.PublicExampleRunCreateResponse
import java.util.concurrent.CompletableFuture

interface RunServiceAsync {

    /** Get examples with associated runs from sessions in a dataset that has been shared. */
    @JvmOverloads
    fun create(
        params: PublicExampleRunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PublicExampleRunCreateResponse>
}
