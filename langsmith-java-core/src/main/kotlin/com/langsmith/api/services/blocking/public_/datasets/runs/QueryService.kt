// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.public_.datasets.runs

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.ListPublicDatasetRunsResponse
import com.langsmith.api.models.PublicDatasetRunQueryCreateParams

interface QueryService {

    /** Get runs in projects run over a dataset that has been shared. */
    @JvmOverloads
    fun create(
        params: PublicDatasetRunQueryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ListPublicDatasetRunsResponse
}
