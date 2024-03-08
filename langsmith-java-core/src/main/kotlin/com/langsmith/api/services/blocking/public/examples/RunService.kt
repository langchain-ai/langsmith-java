// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.public.examples

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.PublicExampleRunCreateParams
import com.langsmith.api.models.PublicExampleRunCreateResponse

interface RunService {

    /** Get examples with associated runs from sessions in a dataset that has been shared. */
    @JvmOverloads
    fun create(
        params: PublicExampleRunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PublicExampleRunCreateResponse
}
