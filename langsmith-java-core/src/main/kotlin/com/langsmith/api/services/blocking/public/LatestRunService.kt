// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.public

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.PublicLatestRunRetrieveParams
import com.langsmith.api.models.RunPublicSchema

interface LatestRunService {

    /** Get the shared run. */
    @JvmOverloads
    fun retrieve(
        params: PublicLatestRunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RunPublicSchema
}
