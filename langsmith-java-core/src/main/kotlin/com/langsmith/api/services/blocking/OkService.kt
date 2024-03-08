// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.OkRetrieveParams
import com.langsmith.api.models.OkRetrieveResponse

interface OkService {

    /** Ok */
    @JvmOverloads
    fun retrieve(
        params: OkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OkRetrieveResponse
}
