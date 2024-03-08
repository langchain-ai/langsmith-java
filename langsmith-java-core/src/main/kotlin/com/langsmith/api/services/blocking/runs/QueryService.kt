// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.runs

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.ListRunsResponse
import com.langsmith.api.models.RunQueryCreateParams

interface QueryService {

    /** Get all runs by query in body payload. */
    @JvmOverloads
    fun create(
        params: RunQueryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ListRunsResponse
}
