// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.public.runs

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.ListPublicRunsResponse
import com.langsmith.api.models.PublicRunQueryCreateParams

interface QueryService {

    /** Get run by ids or the shared run if not specifed. */
    @JvmOverloads
    fun create(
        params: PublicRunQueryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ListPublicRunsResponse
}
