// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.InfoGetResponse
import com.langsmith.api.models.InfoRetrieveParams

interface InfoService {

    /** Get information about the current deployment of LangSmith. */
    @JvmOverloads
    fun retrieve(
        params: InfoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InfoGetResponse
}
