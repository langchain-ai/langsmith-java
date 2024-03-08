// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.langsmith.api.services.blocking.public

import com.langsmith.api.core.RequestOptions
import com.langsmith.api.models.Example
import com.langsmith.api.models.PublicExampleListParams
import com.langsmith.api.services.blocking.public.examples.RunService

interface ExampleService {

    fun runs(): RunService

    /** Get example by ids or the shared example if not specifed. */
    @JvmOverloads
    fun list(
        params: PublicExampleListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<Example>
}
