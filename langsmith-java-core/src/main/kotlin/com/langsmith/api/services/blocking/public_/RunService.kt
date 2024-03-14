// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.public_

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.PublicRunRetrieveParams
import com.langsmith.api.models.RunPublicSchema
import com.langsmith.api.services.blocking.public_.runs.QueryService

interface RunService {

    fun query(): QueryService

    /** Get the shared run. */
    @JvmOverloads
    fun retrieve(
        params: PublicRunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RunPublicSchema
}
