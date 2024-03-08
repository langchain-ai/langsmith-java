// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.public

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.DatasetPublicSchema
import com.langsmith.api.models.PublicDatasetListParams
import com.langsmith.api.services.blocking.public.datasets.FeedbackService
import com.langsmith.api.services.blocking.public.datasets.RunService
import com.langsmith.api.services.blocking.public.datasets.SessionService

interface DatasetService {

    fun sessions(): SessionService

    fun runs(): RunService

    fun feedback(): FeedbackService

    /** Get dataset by ids or the shared dataset if not specifed. */
    @JvmOverloads
    fun list(
        params: PublicDatasetListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DatasetPublicSchema
}
