// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.runs

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.ResponseBodyForRunsGenerateQuery
import com.langsmith.api.models.RunGenerateQueryCreateParams

interface GenerateQueryService {

    /** Get runs filter expression query for a given natural language query. */
    @JvmOverloads
    fun create(
        params: RunGenerateQueryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ResponseBodyForRunsGenerateQuery
}
